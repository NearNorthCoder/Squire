package gg.squire.minigame.pestcontrol;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;

/**
 * Task that handles entering the Pest Control boat by interacting with the gangplank.
 * Selects the appropriate boat based on the player's combat level.
 */
@TaskDesc(name = "Entering Boat")
public class EnterBoatTask extends Task {
    private static final String GANGPLANK_ACTION = "Cross";
    private static final int BOARDING_COOLDOWN_TICKS = 1;

    private final PestControlNavigator navigator;
    private int boardingCooldown;

    /**
     * Creates a new enter boat task.
     *
     * @param navigator The navigation helper
     */
    @Inject
    public EnterBoatTask(PestControlNavigator navigator) {
        this.navigator = navigator;
    }

    /**
     * Main task execution method.
     *
     * @return true to continue running, false to stop
     */
    @Override
    public boolean run() {
        if (!shouldEnterBoat()) {
            return false;
        }

        return boardBoat(navigator.getBestAccessibleBoat());
    }

    /**
     * Determines if we should attempt to enter the boat this tick.
     *
     * @return true if all conditions are met to board
     */
    private boolean shouldEnterBoat() {
        return !navigator.isOnBoat() &&
                !Movement.shouldWalk() &&
                !isOnCooldown() &&
                !navigator.isInGame();
    }

    /**
     * Checks if the boarding action is on cooldown.
     *
     * @return true if still on cooldown
     */
    private boolean isOnCooldown() {
        if (boardingCooldown >= BOARDING_COOLDOWN_TICKS) {
            boardingCooldown -= BOARDING_COOLDOWN_TICKS;
            return false;
        }
        return true;
    }

    /**
     * Attempts to board the specified boat by interacting with its gangplank.
     *
     * @param boat The boat to board
     * @return true if boarding was attempted
     */
    private boolean boardBoat(PestControlBoat boat) {
        if (boat == null) {
            return false;
        }

        // Find the gangplank for this boat
        int[] gangplankIds = new int[]{boat.getObjectID()};
        TileObject gangplank = TileObjects.getNearest(gangplankIds);

        if (gangplank == null) {
            return false;
        }

        // Interact with the gangplank to board
        gangplank.interact(GANGPLANK_ACTION);

        // Set cooldown and select random direction for next game
        boardingCooldown = BOARDING_COOLDOWN_TICKS;
        PestControlNavigator.selectedDirection = navigator.getRandomDirection();

        return true;
    }
}
