package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;

/**
 * Handles the ordered pressure button puzzle in Tombs of Amascut.
 *
 * This puzzle requires pushing ancient buttons in a specific sequence.
 * The bot follows a predetermined order queue and navigates to each button,
 * avoiding deadly floor tiles while moving.
 */
@TaskDesc(name="Doing pressure order", priority=5, blocking=true)
public class DoingPressureOrderTask extends AutotoaManager {

    // Object IDs
    private static final int OBJECT_ANCIENT_BUTTON = 63807; // 0xF93F - Button to push
    private static final int OBJECT_DEADLY_FLOOR = 48125; // 0xBBFD - Dangerous floor tile

    private final Set<WorldPoint> visitedButtons;

    @Inject
    protected DoingPressureOrderTask(Client client, PuzzleStateManager stateManager, TOAConfig config, PuzzlePathfinder pathfinder) {
        super(client, stateManager, config, pathfinder);
        this.visitedButtons = new HashSet<>();
    }

    @Override
    public void reset() {
        this.visitedButtons.clear();
    }

    /**
     * Checks if the puzzle is complete or still active.
     * Returns false when exactly 4 buttons exist (puzzle complete).
     */
    @Override
    public boolean isActive() {
        return TileObjects.getAll(OBJECT_ANCIENT_BUTTON).size() != 4;
    }

    /**
     * Checks if any ancient buttons are reachable.
     */
    @Override
    public boolean isAccessible() {
        return TileObjects.getAll(OBJECT_DEADLY_FLOOR).stream()
            .anyMatch(Reachable::isInteractable);
    }

    /**
     * Main execution logic for the ordered button puzzle.
     *
     * Follows the button order queue from the pathfinder and navigates to each
     * button location while avoiding deadly floor tiles.
     */
    @Override
    public boolean execute() {
        Queue<WorldPoint> buttonOrder = this.pathfinder.getButtonOrderQueue();

        // If no solution calculated or queue empty, push any ancient button
        if (buttonOrder == null || buttonOrder.isEmpty()) {
            TileObject anyButton = TileObjects.getNearest("Ancient button");
            if (anyButton == null) {
                return false;
            }
            anyButton.interact("Push");
            this.sleep(178); // Wait for button animation
            return true;
        }

        WorldPoint playerPos = Players.getLocal().getWorldLocation();
        WorldPoint nextButton = buttonOrder.peek();

        // Remove button from queue if we're standing on it
        if (nextButton != null && nextButton.equals(playerPos)) {
            buttonOrder.remove();
        }

        Log.info("Next: %s, %s", nextButton, this.visitedButtons);

        // Create search area around player
        WorldArea searchArea = playerPos.dx(-1).dy(-1).createWorldArea(3, 3);

        if (searchArea.contains(nextButton)) {
            Movement.setDestination(nextButton);
        } else {
            // Find safe intermediate tile to walk to
            WorldPoint safeTile = searchArea.toWorldPointList().stream()
                .filter(wp -> TileObjects.getAll(OBJECT_DEADLY_FLOOR).stream()
                    .noneMatch(tile -> tile.getWorldLocation().equals(wp)))
                .filter(wp -> !wp.equals(playerPos))
                .min(Comparator.comparingInt(wp -> wp.distanceTo(nextButton)))
                .orElse(null);

            Log.info("Closest: %s", safeTile);

            if (safeTile != null) {
                Movement.setDestination(safeTile);
            }
        }

        return true;
    }

    @Override
    public int getTargetX() {
        TileObject button = TileObjects.getNearest("Ancient button");
        if (button != null) {
            return button.getWorldLocation().getX();
        }
        return 0;
    }
}
