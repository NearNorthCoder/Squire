/*
 * Deobfuscated Attacking Olm Head Task
 * Handles attacking the Great Olm's head during the final phase
 */
package gg.squire.cox.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.GraphicsObject;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Prayers;

/**
 * Task for attacking the Great Olm's head during the final phase.
 *
 * Great Olm head mechanics:
 * - The head becomes attackable only after both hands are disabled
 * - Head fires auto-attacks and special attacks at players
 * - Falling crystals appear as graphics objects on the ground
 * - Players must avoid crystal impact zones (2x2 area)
 * - Positioning is critical to maximize DPS while avoiding damage
 * - Head turns to face different directions during the fight
 * - Final phase determines raid success/failure
 */
@TaskDesc(name = "Trying Olm HEAD", priority = 21000, blocking = true)
public class TryingOlmHeadTask extends CoxManager {

    /** Graphics object ID for falling crystals */
    private static final int FALLING_CRYSTAL_GRAPHICS_ID = 1357;

    @Inject
    protected TryingOlmHeadTask(SquireChambersPlugin plugin, SquireChambersConfig config, Client client) {
        super(plugin, config, client);
    }

    /**
     * Main execution method for attacking Olm head
     */
    @Override
    public boolean execute() {
        // If not in Olm fight, disable prayers
        if (!isOlmActive()) {
            if (Prayers.anyActive()) {
                Prayers.disableAll();
                return false;
            }
            return true;
        }

        // Check if head phase is active (both hands must be down)
        if (!olmTracker.isHeadPhaseActive()) {
            return true;
        }

        // Check if should wait or if mage hand is active
        if (!isMeleeHandActive() || isMageHandAttackable()) {
            return true;
        }

        // Update prayers
        updatePrayers();

        // Find the Olm head NPC
        NPC olmHead = NPCs.getNearest(npc ->
            npc.getName().equals("Great Olm") && npc.hasAction("Attack")
        );

        if (olmHead == null) {
            return true;
        }

        // Get safe tiles for head phase
        List<WorldPoint> safeTiles = getMeleePositions();

        System.out.println("Turn: " + getCurrentTurn() + " | " + olmTracker.getOlmPhase() + " | direction: " + olmTracker.getOlmDirection());

        // Adjust safe tiles based on current turn and direction
        if (isActiveTurn()) {
            String direction = getDirectionForTurn(1);

            if (direction.equals("SOUTH") || direction.equals("ATTACK")) {
                safeTiles = getTilesForDirection(direction);
            }
        }

        // Get list of dangerous tiles from falling crystals
        List<WorldPoint> dangerousTiles = new ArrayList<>();
        Iterator<GraphicsObject> graphicsIterator = client.getGraphicsObjects().iterator();

        while (graphicsIterator.hasNext()) {
            GraphicsObject graphicsObject = graphicsIterator.next();

            // Check if this is a falling crystal
            if (graphicsObject.getId() == FALLING_CRYSTAL_GRAPHICS_ID) {
                WorldPoint crystalLocation = WorldPoint.fromLocal(client, graphicsObject.getLocation());

                // Add 3x3 area around crystal as dangerous
                List<WorldPoint> impactArea = crystalLocation.createWorldArea(1).toWorldPointList();
                dangerousTiles.addAll(impactArea);
            }
        }

        // If not on a safe tile, move to one
        if (!safeTiles.contains(localPlayer.getWorldLocation())) {
            WorldPoint targetTile = safeTiles.stream()
                .filter(worldPoint -> isSafeTile(dangerousTiles, worldPoint))
                .min(Comparator.comparingDouble(worldPoint -> worldPoint.distanceTo2DHypotenuse(localPlayer.getWorldLocation())))
                .orElse(null);

            // If already moving to target, check if we should fine-tune position
            if (Movement.getDestination() != null && Movement.getDestination().equals(targetTile)) {
                // Look for better position in 3x3 area around player
                WorldPoint betterPosition = localPlayer.getWorldLocation()
                    .createWorldArea(3)
                    .toWorldPointList()
                    .stream()
                    .filter(worldPoint -> isSafeTile(dangerousTiles, worldPoint))
                    .min(Comparator.comparingDouble(worldPoint -> worldPoint.distanceTo2DHypotenuse(targetTile))
                        .thenComparingDouble(worldPoint -> olmHead.getWorldArea().distanceTo(worldPoint)))
                    .orElse(null);

                if (betterPosition != null && betterPosition.getWorldX() != targetTile.getWorldX()) {
                    return true;
                }

                Movement.setDestination(betterPosition);
                return false;
            }

            Movement.setDestination(targetTile);
            return false;
        }

        // Attack the head
        attackOlmHead();
        return false;
    }

    /**
     * Checks if a tile is safe (walkable, not dangerous, not in danger tiles)
     */
    private boolean isSafeTile(List<WorldPoint> dangerTiles, WorldPoint worldPoint) {
        return Reachable.isWalkable(worldPoint)
            && !olmTracker.getDangerTiles().contains(worldPoint)
            && !dangerTiles.contains(worldPoint);
    }

    /**
     * Gets the required prayers for the head phase
     */
    @Override
    public List<Prayer> getPrayers() {
        ArrayList<Prayer> prayers = new ArrayList<>();

        // Get defensive prayer from Olm tracker
        Prayer defensivePrayer = olmTracker.getDefensivePrayer();
        if (defensivePrayer == null) {
            defensivePrayer = Prayer.PROTECT_FROM_MAGIC;
        }

        // Add offensive prayers
        List<Prayer> offensivePrayers = Prayers.getOffensive();
        prayers.add(defensivePrayer);
        prayers.addAll(offensivePrayers);

        return prayers;
    }

    /**
     * Gets the equipment setup for attacking the head
     */
    @Override
    public EquipmentSetup getGear() {
        return plugin.getHeadGear();
    }
}
