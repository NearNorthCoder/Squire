/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.autotoa.tasks;

import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import gg.squire.autotoa.tasks.KephriManager;
import gg.squire.autotoa.tasks.WardenPhaseManager;

@TaskDesc(name="Clearing boulder", priority=150, blocking=true)
public class ClearingBoulderTask extends KephriManager {

    private static final int BOULDER_NPC_ID = 11711;
    private static final int ZEBAK_NPC_ID = 11735;
    private static final int COORDINATE_OFFSET_DX = 1;
    private static final int COORDINATE_OFFSET_DY_NEGATIVE = -1;
    private static final int MELEE_DISTANCE = 1;
    private static final int MAX_BOULDER_DISTANCE = 3;
    private static final int AREA_SIZE = 2;
    private static final int PUZZLE_PHASE_7 = 7;

    private static final String ATTACK_ACTION = "Attack";
    private static final String HIT_ACTION = "Hit";
    private static final String PUSH_ACTION = "Push";

    private BoulderPuzzle currentBoulderPuzzle;
    private final SquireAutoTOA autoTOA;
    private final WardenPhaseManager wardenPhaseManager;

    @Inject
    protected ClearingBoulderTask(Client client, WardenPhaseManager wardenManager, TOAConfig config, SquireAutoTOA autoTOA) {
        super(client, wardenManager, config);
        this.autoTOA = autoTOA;
        this.wardenPhaseManager = wardenManager;
    }

    @Override
    public boolean execute() {
        List<NPC> boulders = NPCs.getAll(BOULDER_NPC_ID);

        if (boulders.isEmpty()) {
            this.currentBoulderPuzzle = null;
            return false;
        }

        if (this.getSafeSpots().isEmpty()) {
            return false;
        }

        this.autoTOA.setPuzzlePhase(PUZZLE_PHASE_7);

        // Find boulder that can be cleared to a safe spot
        NPC clearableBoulder = boulders.stream()
            .filter(boulder -> getAdjacentTiles(boulder).stream()
                .anyMatch(this::isSafeSpot))
            .findFirst()
            .orElse(null);

        WorldPoint playerLocation = Players.getLocal().getWorldLocation();

        if (clearableBoulder != null) {
            WorldPoint targetTile = clearableBoulder.getWorldLocation().dx(COORDINATE_OFFSET_DX);

            for (WorldPoint adjacentTile : getAdjacentTiles(clearableBoulder)) {
                if (isSafeSpot(adjacentTile)) {
                    targetTile = adjacentTile;
                }
            }

            if (playerLocation.equals(targetTile)) {
                this.autoTOA.clearPuzzlePhase();
                return false;
            }

            this.walkTo(targetTile, this::canWalkThroughTile);
            return true;
        }

        // Find nearest boulder that blocks a Zebak
        NPC blockingBoulder = NPCs.getNearest(npc ->
            npc.getId() == BOULDER_NPC_ID
            && npc.getId() != ZEBAK_NPC_ID
        );

        if (blockingBoulder != null) {
            if (this.currentBoulderPuzzle != null && this.currentBoulderPuzzle.isCompleted) {
                WorldPoint boulderLocation = this.currentBoulderPuzzle.getBoulderLocation();
                List<TileObject> obstacles = this.getObstacles();

                WorldPoint clearTile = boulderLocation.createWorldArea(AREA_SIZE)
                    .toWorldPointList()
                    .stream()
                    .filter(point -> !hasObstacleAt(obstacles, point))
                    .min(Comparator.comparingInt(point -> point.distanceTo(boulderLocation)))
                    .orElse(null);

                NPC zebak = this.getZebak();
                WorldArea zebakArea = zebak.getWorldArea();

                this.walkTo(clearTile, point ->
                    !hasObstacleAt(obstacles, point)
                    && zebakArea.isInMeleeDistance(point)
                    && zebakArea.distanceTo2D(point) > MELEE_DISTANCE
                );
                return true;
            }

            // Find closest boulder to the blocking boulder
            NPC closestBoulder = boulders.stream()
                .min(Comparator.comparingDouble(boulder -> boulder.distanceTo(blockingBoulder)))
                .orElse(null);

            if (closestBoulder == null && this.getCurrentTarget() == null) {
                return true;
            }

            // Check if we can push the boulder towards the blocking boulder
            for (WorldPoint adjacentTile : getAdjacentTiles(closestBoulder)) {
                if (blockingBoulder.distanceTo(adjacentTile) <= MAX_BOULDER_DISTANCE
                    && (this.currentBoulderPuzzle == null || !this.currentBoulderPuzzle.isCompleted)) {
                    this.stopMovement();
                    blockingBoulder.interact(ATTACK_ACTION);
                    return true;
                }
            }
            return true;
        }

        // Create a new boulder puzzle if needed
        if (this.currentBoulderPuzzle == null) {
            this.currentBoulderPuzzle = createBoulderPuzzle(PUZZLE_PHASE_7);
            return true;
        }

        NPC targetBoulder = this.currentBoulderPuzzle.getTargetBoulder();
        if (targetBoulder == null) {
            return false;
        }

        NPC clearingZebak = this.currentBoulderPuzzle.getClearingZebak();
        if (clearingZebak == null) {
            return false;
        }

        WorldPoint targetLocation = this.currentBoulderPuzzle.getBoulderLocation();

        if (!playerLocation.equals(targetLocation)) {
            this.walkTo(targetLocation, this::canWalkThroughTile);
        } else {
            // Attack or push the boulder depending on position
            if (targetBoulder.getWorldLocation().distanceTo(this.currentBoulderPuzzle.getZebakLocation()) <= MELEE_DISTANCE
                && !this.currentBoulderPuzzle.isCompleted) {
                targetBoulder.interact(HIT_ACTION);
            } else {
                targetBoulder.interact(PUSH_ACTION);
            }
        }
        return true;
    }

    /**
     * Gets the three adjacent tiles in front of a boulder
     */
    private List<WorldPoint> getAdjacentTiles(NPC boulder) {
        WorldPoint location = boulder.getWorldLocation();
        return List.of(
            location.dx(COORDINATE_OFFSET_DX),
            location.dx(AREA_SIZE),
            location.dx(MAX_BOULDER_DISTANCE)
        );
    }

    /**
     * Gets all adjacent tiles including diagonal positions
     */
    private List<WorldPoint> getAllAdjacentTiles(NPC boulder) {
        WorldPoint location = boulder.getWorldLocation();
        WorldPoint north = location.dy(COORDINATE_OFFSET_DX);
        WorldPoint south = location.dy(COORDINATE_OFFSET_DY_NEGATIVE);

        return List.of(
            location.dx(COORDINATE_OFFSET_DX),
            location.dx(AREA_SIZE),
            location.dx(MAX_BOULDER_DISTANCE),
            location.dx(4),
            north.dx(COORDINATE_OFFSET_DX),
            north.dx(AREA_SIZE),
            north.dx(MAX_BOULDER_DISTANCE),
            north.dx(4),
            south.dx(COORDINATE_OFFSET_DX),
            south.dx(AREA_SIZE),
            south.dx(MAX_BOULDER_DISTANCE),
            south.dx(4)
        );
    }

    /**
     * Creates a boulder puzzle solution for the given phase
     */
    private BoulderPuzzle createBoulderPuzzle(int phase) {
        List<NPC> boulders = NPCs.getAll(BOULDER_NPC_ID);
        if (boulders.isEmpty()) {
            return null;
        }

        List<BoulderPuzzle> solutions = new ArrayList<>();
        Player player = Players.getLocal();
        List<NPC> zebaks = NPCs.getAll(ZEBAK_NPC_ID);

        // Try to find direct solutions (boulder directly blocking a zebak)
        for (NPC boulder : boulders) {
            for (WorldPoint adjacentTile : getAdjacentTiles(boulder)) {
                if (isSafeSpot(adjacentTile)) {
                    solutions.add(new BoulderPuzzle(boulder, null, boulder.getWorldLocation(), false, false));
                }
            }

            // Find zebak on same horizontal line
            NPC horizontalZebak = zebaks.stream()
                .filter(zebak -> isWithinDistance(boulder, phase, zebak))
                .filter(zebak -> zebak.getWorldY() == boulder.getWorldY()
                    && zebak.getWorldX() != boulder.getWorldX())
                .min(Comparator.comparingInt(zebak -> zebak.distanceTo(Players.getLocal())))
                .orElse(null);

            if (horizontalZebak != null) {
                BoulderPuzzle puzzle = new BoulderPuzzle(boulder, horizontalZebak,
                    boulder.getWorldLocation(), false, false);
                if (!isSafeSpot(puzzle.getBoulderLocation())) {
                    solutions.add(puzzle);
                }
            }
        }

        // Try to find diagonal solutions
        for (NPC boulder : boulders) {
            NPC diagonalZebak = zebaks.stream()
                .filter(zebak -> isWithinDistance(boulder, phase, zebak))
                .filter(zebak -> Math.abs(zebak.getWorldX() - boulder.getWorldX())
                    == Math.abs(zebak.getWorldY() - boulder.getWorldY()))
                .min(Comparator.comparingInt(zebak -> zebak.distanceTo(Players.getLocal())))
                .orElse(null);

            if (diagonalZebak != null) {
                BoulderPuzzle puzzle = new BoulderPuzzle(boulder, diagonalZebak,
                    boulder.getWorldLocation(), true, false);
                if (!isSafeSpot(puzzle.getBoulderLocation())) {
                    solutions.add(puzzle);
                }
            }
        }

        // Try to find solutions by moving boulder to intercept zebak path
        for (NPC boulder : boulders) {
            for (WorldPoint adjacentTile : getAllAdjacentTiles(boulder)) {
                NPC interceptZebak = zebaks.stream()
                    .filter(zebak -> isWithinDistance(adjacentTile, phase, zebak))
                    .filter(zebak -> zebak.getWorldX() == adjacentTile.getWorldX()
                        && zebak.getWorldY() == adjacentTile.getWorldY())
                    .min(Comparator.comparingInt(zebak -> zebak.distanceTo(Players.getLocal())))
                    .orElse(null);

                if (interceptZebak != null) {
                    BoulderPuzzle puzzle = new BoulderPuzzle(boulder, interceptZebak,
                        adjacentTile, false, true);
                    if (!isSafeSpot(puzzle.getBoulderLocation())) {
                        solutions.add(puzzle);
                    }
                }
            }
        }

        WorldPoint playerLoc = Players.getLocal().getWorldLocation();

        return solutions.stream()
            .filter(puzzle -> !puzzle.isCompleted
                || puzzle.getClearingZebak().distanceTo(puzzle.getTargetBoulder()) > MELEE_DISTANCE)
            .min(Comparator.comparingInt(puzzle ->
                puzzle.getClearingZebak().distanceTo(playerLoc)
                + puzzle.getTargetBoulder().getWorldLocation().distanceTo(puzzle.getZebakLocation())
            ))
            .orElse(null);
    }

    private static boolean isWithinDistance(NPC boulder, int maxDistance, NPC zebak) {
        return zebak.getWorldLocation().distanceTo(boulder) <= maxDistance;
    }

    private static boolean isWithinDistance(WorldPoint point, int maxDistance, NPC zebak) {
        return zebak.getWorldLocation().distanceTo(point) <= maxDistance;
    }

    private static boolean isAtSameLocation(WorldPoint point, NPC npc) {
        return npc.getWorldX() == point.getWorldX()
            && npc.getWorldY() == point.getWorldY();
    }

    private boolean hasObstacleAt(List<TileObject> obstacles, WorldPoint point) {
        return obstacles.stream().anyMatch(obstacle ->
            obstacle.getWorldLocation().equals(point));
    }

    @Override
    public void reset() {
        this.autoTOA.clearPuzzlePhase();
        this.currentBoulderPuzzle = null;
    }

    /**
     * Represents a boulder puzzle solution
     */
    private static class BoulderPuzzle {
        private final NPC targetBoulder;
        private final NPC clearingZebak;
        private final WorldPoint boulderLocation;
        private final boolean isDiagonal;
        private final boolean isCompleted;

        public BoulderPuzzle(NPC targetBoulder, NPC clearingZebak, WorldPoint boulderLocation,
                           boolean isDiagonal, boolean isCompleted) {
            this.targetBoulder = targetBoulder;
            this.clearingZebak = clearingZebak;
            this.boulderLocation = boulderLocation;
            this.isDiagonal = isDiagonal;
            this.isCompleted = isCompleted;
        }

        public NPC getTargetBoulder() {
            return targetBoulder;
        }

        public NPC getClearingZebak() {
            return clearingZebak;
        }

        public WorldPoint getBoulderLocation() {
            return boulderLocation;
        }

        public WorldPoint getZebakLocation() {
            return targetBoulder.getWorldLocation();
        }
    }
}
