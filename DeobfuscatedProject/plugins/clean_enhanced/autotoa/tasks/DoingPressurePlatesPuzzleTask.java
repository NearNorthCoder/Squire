package gg.squire.autotoa.tasks;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import net.runelite.api.Client;
import net.runelite.api.GroundObject;
import net.runelite.api.Point;
import net.runelite.api.Tile;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameObjectDespawned;
import net.runelite.api.events.GameObjectSpawned;
import net.runelite.api.util.Text;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;

/**
 * Handles solving the pressure plates puzzle in Tombs of Amascut.
 *
 * This puzzle requires stepping on specific floor tiles in a numbered sequence.
 * The bot reads the puzzle number from an ancient tablet, calculates which
 * tiles need to be stepped on based on a hardcoded solution map, and navigates
 * to each tile while avoiding spike traps.
 */
@TaskDesc(name="Doing pressure plates puzzle", register=true, priority=5, blocking=true)
public class DoingPressurePlatesPuzzleTask extends AutotoaManager {

    // Object IDs for puzzle elements
    private static final int OBJECT_ANCIENT_TABLET = 45599; // 0xB23F - Shows puzzle number
    private static final int OBJECT_FLOOR_TILE = 48080; // 0xBBD0 - Pressure plate tile
    private static final int OBJECT_SPIKE_TRAP = 28514; // 0x6F62 - Dangerous spike

    // Scene coordinates for starting positions
    private static final Point[] STARTING_POSITIONS = new Point[] {
        new Point(36, 20),  // Top-left corner
        new Point(36, 29),  // Bottom-left
        new Point(31, 20),  // Top-right
        new Point(31, 29),  // Bottom-right
        new Point(31, 28),  // Alt bottom-right
        new Point(32, 13),  // Extra positions for complex puzzles
        new Point(32, 21)
    };

    // Map of puzzle numbers to required tile indices (0-15 grid positions)
    // Each entry maps a puzzle number to the set of tiles that must be stepped on
    private static final Map<Integer, Set<Integer>> PUZZLE_SOLUTIONS;

    // Compiled regex to extract puzzle number from chat message
    private static final Pattern PUZZLE_NUMBER_PATTERN = Pattern.compile("The number (\\d+) has been hastily chipped into the stone.");

    // IDs of pressure plate objects in various states
    private static final Set<Integer> PRESSURE_PLATE_IDS;
    private static final Set<Integer> SPIKE_TRAP_IDS;

    static {
        // Get all pressure plate object IDs from enum
        PRESSURE_PLATE_IDS = Arrays.stream(PressurePlateState.values())
            .map(PressurePlateState::getActivePlateId)
            .collect(Collectors.toSet());

        SPIKE_TRAP_IDS = Arrays.stream(PressurePlateState.values())
            .map(PressurePlateState::getSpikeId)
            .collect(Collectors.toSet());

        // Hardcoded solutions for each puzzle number
        // Format: puzzle number -> Set of tile positions (0-15 in 4x4 grid)
        PUZZLE_SOLUTIONS = ImmutableMap.<Integer, Set<Integer>>builder()
            .put(20, ImmutableSet.of(5, 3, 17, 16))      // Puzzle 20: tiles 5,3,17,16
            .put(21, ImmutableSet.of(14, 3, 17, 16))     // Puzzle 21
            .put(22, ImmutableSet.of(14, 3, 18, 12, 8))  // Puzzle 22
            .put(23, ImmutableSet.of(5, 6, 10, 11, 14))  // And so on...
            .put(8, ImmutableSet.of(5, 3, 17, 16, 23))
            .put(9, ImmutableSet.of(14, 3, 18, 13))
            .put(10, ImmutableSet.of(9, 14, 3, 18, 13))
            .put(11, ImmutableSet.of(5, 6, 10, 11, 4))
            .put(12, ImmutableSet.of(0, 2, 10, 13, 15))
            .put(15, ImmutableSet.of(14, 3, 18, 13, 15))
            .put(16, ImmutableSet.of(14, 3, 18, 13, 14))
            .put(17, ImmutableSet.of(0, 6, 18, 13, 14))
            .put(18, ImmutableSet.of(4, 7, 4, 6, 14))
            .put(19, ImmutableSet.of(4, 5, 6, 10, 11, 9, 14))
            .put(24, ImmutableSet.of(14, 3, 18, 13, 14, 15))
            .put(25, ImmutableSet.of(9, 14, 3, 18, 13, 14, 15))
            .put(36, ImmutableSet.of(0, 2, 4, 7, 4, 9, 14))
            .put(37, ImmutableSet.of(14, 3, 18, 13, 14, 8))
            .put(26, ImmutableSet.of(0, 5, 6, 14, 18, 12))
            .put(27, ImmutableSet.of(4, 7, 4, 10, 14, 3))
            .put(41, ImmutableSet.of(4, 9, 14, 3, 18, 14))
            .put(42, ImmutableSet.of(0, 4, 9, 18, 13, 14))
            .put(43, ImmutableSet.of(0, 5, 9, 14, 3, 18))
            .put(44, ImmutableSet.of(0, 2, 5, 10, 14, 13))
            .put(29, ImmutableSet.of(0, 5, 14, 3, 14, 17, 12))
            .put(45, ImmutableSet.of(0, 2, 4, 7, 4, 5, 14))
            .build();
    }

    private boolean plateStateChanged;
    private Set<WorldPoint> targetTiles;
    private Set<Integer> steppedIndices;
    private int puzzleNumber;

    @Inject
    protected DoingPressurePlatesPuzzleTask(Client client, PuzzleStateManager stateManager, TOAConfig config, PuzzlePathfinder pathfinder) {
        super(client, stateManager, config, pathfinder);
        this.targetTiles = Collections.emptySet();
    }

    @Override
    public void reset() {
        this.plateStateChanged = false;
        this.steppedIndices = new HashSet<>();
        this.puzzleNumber = 0;
        this.targetTiles = Collections.emptySet();
    }

    /**
     * Listens for chat messages to extract the puzzle number and detect resets.
     */
    @Subscribe
    public void onChatMessage(ChatMessage message) {
        if (message.getMessage().startsWith("Your party failed to complete the challenge")) {
            this.puzzleNumber = 0;
            this.plateStateChanged = false;
            return;
        }

        Matcher matcher = PUZZLE_NUMBER_PATTERN.matcher(Text.removeTags(message.getMessage()));
        if (!matcher.matches()) {
            return;
        }

        this.puzzleNumber = Integer.parseInt(matcher.group(1));
    }

    /**
     * Detects when pressure plates spawn (get stepped on).
     */
    @Subscribe
    public void onGameObjectSpawned(GameObjectSpawned event) {
        if (PRESSURE_PLATE_IDS.contains(event.getGameObject().getId())) {
            this.plateStateChanged = false;
        }
    }

    /**
     * Detects when pressure plates despawn (player moves off).
     */
    @Subscribe
    public void onGameObjectDespawned(GameObjectDespawned event) {
        if (PRESSURE_PLATE_IDS.contains(event.getGameObject().getId())) {
            this.plateStateChanged = false;
        }
    }

    /**
     * Checks if the puzzle is accessible.
     */
    @Override
    public boolean isAccessible() {
        TileObject tile = TileObjects.getNearest(t -> SPIKE_TRAP_IDS.contains(t.getId()));
        if (tile == null) {
            return false;
        }
        return Reachable.isWalkable(tile.getWorldLocation());
    }

    /**
     * Main execution logic for the pressure plates puzzle.
     */
    @Override
    public boolean execute() {
        // If puzzle not yet analyzed or state changed, recalculate
        if (!this.plateStateChanged && this.puzzleNumber >= 20) {
            this.analyzePuzzleState();
            return true;
        }

        // If no targets calculated, need to inspect the tablet
        if (this.targetTiles.isEmpty()) {
            TileObject tablet = TileObjects.getNearest("Ancient tablet");
            if (tablet == null) {
                return false;
            }
            tablet.interact("Inspect");
            return true;
        }

        WorldPoint playerPos = this.client.getLocalPlayer().getWorldLocation();

        // Find next tile to step on (one that doesn't have a plate on it yet)
        WorldPoint nextTile = this.targetTiles.stream()
            .filter(worldPoint -> TileObjects.getAll(tile -> PRESSURE_PLATE_IDS.contains(tile.getId()))
                .stream()
                .noneMatch(tile -> tile.getWorldLocation().equals(worldPoint)))
            .min(Comparator.comparingInt(WorldPoint::getX)
                          .thenComparingDouble(wp -> wp.distanceTo2DHypotenuse(Players.getLocal().getWorldLocation())))
            .orElse(null);

        if (nextTile == null) {
            return false;
        }

        // Check if path to next tile crosses any spike traps
        long spikesInPath = nextTile.pathTo(this.client, nextTile).stream()
            .filter(worldPoint -> TileObjects.getAll(tile -> SPIKE_TRAP_IDS.contains(tile.getId()))
                .stream()
                .anyMatch(tile -> tile.getWorldLocation().equals(worldPoint)))
            .count();

        if (spikesInPath > 0) {
            return false; // Can't safely reach tile
        }

        Movement.setDestination(nextTile);
        return true;
    }

    @Override
    public int getTargetX() {
        return TileObjects.getNearest(tile -> SPIKE_TRAP_IDS.contains(tile.getId())).getWorldX();
    }

    @Override
    public boolean isActive() {
        return false; // Puzzle doesn't block movement
    }

    /**
     * Analyzes the current puzzle state by:
     * 1. Finding the starting foot position
     * 2. Identifying which tiles have already been stepped on
     * 3. Calculating world positions of remaining target tiles
     */
    private void analyzePuzzleState() {
        if (this.puzzleNumber < 20) {
            return;
        }

        this.plateStateChanged = true;
        Tile[][] sceneTiles = this.client.getScene().getTiles()[this.client.getPlane()];
        Point startPos = this.findStartingPosition(sceneTiles);

        if (startPos == null) {
            return;
        }

        this.steppedIndices = this.getSteppedTileIndices(sceneTiles, startPos);
        this.targetTiles = this.calculateTargetTiles(startPos);
    }

    /**
     * Finds the starting position by locating the foot marker ground object.
     */
    private Point findStartingPosition(Tile[][] sceneTiles) {
        for (Point pos : STARTING_POSITIONS) {
            Tile tile = sceneTiles[pos.getX()][pos.getY()];
            GroundObject groundObj = tile.getGroundObject();

            if (groundObj != null && groundObj.getId() == PressurePlateState.FOOT.getSpikeId()) {
                return pos;
            }
        }
        return null;
    }

    /**
     * Determines which tiles have already been stepped on by checking for pressure plates.
     */
    private Set<Integer> getSteppedTileIndices(Tile[][] sceneTiles, Point startPos) {
        HashSet<Integer> stepped = new HashSet<>();

        for (int y = 0; y < 5; y++) {
            for (int x = 0; x < 5; x++) {
                Tile tile = sceneTiles[startPos.getX() + x][startPos.getY() - y];

                boolean hasPressurePlate = Arrays.stream(tile.getGameObjects())
                    .filter(Objects::nonNull)
                    .mapToInt(TileObject::getId)
                    .anyMatch(PRESSURE_PLATE_IDS::contains);

                if (hasPressurePlate) {
                    stepped.add(y * 5 + x);
                }
            }
        }

        return stepped;
    }

    /**
     * Calculates world positions of tiles that still need to be stepped on.
     */
    private Set<WorldPoint> calculateTargetTiles(Point startPos) {
        Sets.SetView<Integer> remainingIndices = Sets.difference(
            PUZZLE_SOLUTIONS.get(this.puzzleNumber),
            this.steppedIndices
        );

        return remainingIndices.stream()
            .map(index -> WorldPoint.fromScene(
                this.client,
                startPos.getX() + index % 5,
                startPos.getY() - index / 5,
                this.client.getPlane()
            ))
            .collect(Collectors.toSet());
    }
}
