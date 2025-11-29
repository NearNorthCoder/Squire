package gg.squire.sotf.util;

import net.runelite.api.NPC;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;

/**
 * Utility for training combat at Sand Crabs in Hosidius.
 *
 * <p>Sand Crabs are low-level aggressive NPCs that are excellent for AFK combat training.
 * This utility handles:
 * <ul>
 *   <li>Rotating between different Sand Crab spots</li>
 *   <li>Resetting aggression by walking away</li>
 *   <li>Attacking Sand Crabs</li>
 * </ul>
 */
public class SandCrabsTrainer {

    /** Sand Crab training area 1 */
    public static WorldArea SPOT_1 = new WorldArea(1725, 3464, 5, 5, 0);

    /** Sand Crab training area 2 */
    public static WorldArea SPOT_2 = new WorldArea(1737, 3465, 7, 6, 0);

    /** Sand Crab training area 3 */
    public static WorldArea SPOT_3 = new WorldArea(1747, 3464, 8, 4, 0);

    /** Reset point 1 for aggression timer */
    public static WorldPoint RESET_POINT_1 = new WorldPoint(1727, 3469, 0);

    /** Reset point 2 for aggression timer */
    public static WorldPoint RESET_POINT_2 = new WorldPoint(1726, 3464, 0);

    /** Reset point 3 for aggression timer */
    public static WorldPoint RESET_POINT_3 = new WorldPoint(1738, 3473, 0);

    /** Bank area for resupplying */
    public static WorldArea BANK_AREA = new WorldArea(1643, 3670, 10, 8, 0);

    /** Teleport destination */
    public static WorldPoint TELEPORT_DEST = new WorldPoint(1649, 3682, 0);

    /** Current training spot index */
    public static int[] currentSpot = new int[]{0, 0, 0, 0, 0};

    /** Flag for whether to rotate spots */
    public static boolean rotateSpots = false;

    /** Time of last aggression reset */
    private static long lastAggroReset = System.currentTimeMillis();

    /** Aggression timer duration (10 minutes in milliseconds) */
    private static final long AGGRO_TIMER = 10 * 60 * 1000;

    /**
     * Main training loop for Sand Crabs.
     */
    public static void train() {
        // Check if we need to reset aggression
        if (System.currentTimeMillis() - lastAggroReset >= AGGRO_TIMER) {
            resetAggression();
            lastAggroReset = System.currentTimeMillis();
        }

        // Attack Sand Crabs if not in combat
        if (Players.getLocal().getInteracting() == null) {
            NPC sandCrab = NPCs.getNearest(npc ->
                npc.getName() != null &&
                npc.getName().equals("Sand Crab") &&
                npc.getInteracting() == null &&
                !npc.isDead()
            );

            if (sandCrab != null) {
                sandCrab.interact("Attack");
                Time.sleepTicks(2);
            }
        }
    }

    /**
     * Resets aggression by walking to a reset point and back.
     */
    private static void resetAggression() {
        WorldPoint currentLocation = Players.getLocal().getWorldLocation();

        // Determine which spot we're at and walk to appropriate reset point
        if (SPOT_1.contains(currentLocation)) {
            Movement.walkTo(RESET_POINT_1);
            Time.sleepUntil(() -> Players.getLocal().getWorldLocation().equals(RESET_POINT_1), 10000);
            Time.sleepTicks(2);
            Movement.walkTo(currentLocation);
        } else if (SPOT_2.contains(currentLocation)) {
            Movement.walkTo(RESET_POINT_2);
            Time.sleepUntil(() -> Players.getLocal().getWorldLocation().equals(RESET_POINT_2), 10000);
            Time.sleepTicks(2);
            Movement.walkTo(currentLocation);
        } else if (SPOT_3.contains(currentLocation)) {
            Movement.walkTo(RESET_POINT_3);
            Time.sleepUntil(() -> Players.getLocal().getWorldLocation().equals(RESET_POINT_3), 10000);
            Time.sleepTicks(2);
            Movement.walkTo(currentLocation);
        }
    }

    /**
     * Navigates to a Sand Crab training spot.
     *
     * @param spotNumber The spot number (1-3) to navigate to
     */
    public static void navigateToSpot(int spotNumber) {
        WorldArea targetSpot;
        switch (spotNumber) {
            case 1:
                targetSpot = SPOT_1;
                break;
            case 2:
                targetSpot = SPOT_2;
                break;
            case 3:
                targetSpot = SPOT_3;
                break;
            default:
                targetSpot = SPOT_1;
        }

        if (!targetSpot.contains(Players.getLocal().getWorldLocation())) {
            WorldPoint center = targetSpot.toWorldPoint();
            Movement.walkTo(center);
            Time.sleepUntil(() -> targetSpot.contains(Players.getLocal().getWorldLocation()), 15000);
        }
    }
}
