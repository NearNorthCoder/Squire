/*
 * Deobfuscated Great Olm Mage Hand Task
 * Handles attacking the mage hand during the Great Olm fight
 */
package gg.squire.cox.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.Prayer;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Prayers;

/**
 * Task for attacking the Great Olm's mage hand.
 *
 * Great Olm mechanics:
 * - The Great Olm has a head and two hands (mage and melee)
 * - The mage hand casts magical attacks and special attacks
 * - Special attacks include: flames, falling crystals, and lightning
 * - Players must attack hands before the head becomes vulnerable
 * - Positioning is critical to avoid special attacks
 * - The mage hand cycles through different phases and turns
 */
@TaskDesc(name = "Olm Mage Hand", priority = 20000)
public class OlmMageHandTask extends CoxManager {

    /** Whether the first attack has been initiated */
    private boolean firstAttackInitiated;

    @Inject
    protected OlmMageHandTask(SquireChambersPlugin plugin, SquireChambersConfig config, Client client) {
        super(plugin, config, client);
        this.firstAttackInitiated = false;
    }

    /**
     * Main execution method for the mage hand task
     */
    @Override
    public boolean execute() {
        // Check if Olm fight is active
        if (!isOlmActive()) {
            return false;
        }

        // Check if mage hand is attackable
        if (!isMageHandAttackable()) {
            return false;
        }

        // Update prayers and attack style
        updatePrayers();
        ensureMageAttackStyle();

        // If not in Olm arena, attack the hand
        if (!olmTracker.isInOlmArena()) {
            attackMageHand();
            return true;
        }

        System.out.println("Turn: " + getCurrentTurn() + " | " + olmTracker.getOlmPhase() + " | direction: " + olmTracker.getOlmDirection());

        List<WorldPoint> safeTiles;

        // Determine safe tiles based on current turn
        if (isActiveTurn()) {
            System.out.println("Mage hand active turn");
            String direction = getDirectionForTurn(0);

            // Check if should attack based on direction and Olm state
            if (direction.equals("ATTACK") && (!olmTracker.isHandClenching() || olmTracker.getOlmHealth() >= getHealthThreshold())) {
                safeTiles = getTilesForDirection(direction);
            } else {
                return attackMageHand();
            }
        } else {
            // Not our turn, get melee positions
            safeTiles = getMeleePositions();
        }

        // Move to safe tile if not already on one
        if (!safeTiles.contains(localPlayer.getWorldLocation())) {
            WorldPoint targetTile = safeTiles.stream()
                .filter(worldPoint -> Reachable.isWalkable(worldPoint) && !olmTracker.getDangerTiles().contains(worldPoint))
                .min(Comparator.comparingDouble(worldPoint -> worldPoint.distanceTo2DHypotenuse(localPlayer.getWorldLocation())))
                .orElse(null);

            if (Movement.getDestination() != null && Movement.getDestination().equals(targetTile)) {
                return false;
            }

            Movement.setDestination(targetTile);
            return true;
        }

        return false;
    }

    /**
     * Gets the required prayers for the mage hand fight
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
     * Gets the equipment setup for mage hand
     */
    @Override
    public EquipmentSetup getGear() {
        return plugin.getMageGear();
    }

    /**
     * Ensures the correct attack style is set for mage
     */
    public void ensureMageAttackStyle() {
        if (getGear().isFullyEquipped() && Combat.getAttackStyle() != Combat.AttackStyle.FIRST) {
            Combat.setAttackStyle(Combat.AttackStyle.FIRST);
        }
    }
}
