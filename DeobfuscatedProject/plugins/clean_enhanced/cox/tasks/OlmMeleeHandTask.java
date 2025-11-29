/*
 * Deobfuscated Great Olm Melee Hand Task
 * Handles attacking the melee hand during the Great Olm fight
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
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Prayers;

/**
 * Task for attacking the Great Olm's melee hand.
 *
 * Great Olm mechanics:
 * - The melee hand performs close-range melee attacks
 * - The melee hand can "clench" to heal itself or the other hand
 * - When clenched, the hand becomes immune and must be avoided
 * - Players need to position correctly to attack while avoiding swipes
 * - Different positioning strategies based on Olm's phase and direction
 */
@TaskDesc(name = "Olm Melee Hand", priority = 20000)
public class OlmMeleeHandTask extends CoxManager {

    /** Whether special positioning is required */
    private boolean specialPositioningRequired;

    @Inject
    protected OlmMeleeHandTask(SquireChambersPlugin plugin, SquireChambersConfig config, Client client) {
        super(plugin, config, client);
        this.specialPositioningRequired = false;
    }

    /**
     * Main execution method for the melee hand task
     */
    @Override
    public boolean execute() {
        // Check if Olm fight is active
        if (!isOlmActive()) {
            return false;
        }

        // Check if melee hand is attackable
        if (!isMeleeHandAttackable()) {
            return false;
        }

        // Check if melee hand is disabled
        if (!isMeleeHandActive()) {
            return false;
        }

        // Update prayers and attack style
        updatePrayers();
        ensureMeleeAttackStyle();

        // If melee hand is not alive, attack it
        if (!olmTracker.isMeleeHandAlive()) {
            attackMeleeHand();
            return false;
        }

        String olmDirection = olmTracker.getOlmDirection();

        // Phase 1 (startup) - attack immediately
        if (olmTracker.getOlmPhase() == 1) {
            return attackMeleeHand();
        }

        // Phase 2 - check positioning requirements
        if (olmTracker.getOlmPhase() == 2) {
            // If direction is east or south, use special positioning
            if (olmDirection.equals("EAST") || olmDirection.equals("SOUTH")) {
                specialPositioningRequired = true;
            } else {
                specialPositioningRequired = false;
            }
        }

        // Use special positioning if required
        if (specialPositioningRequired) {
            return handleSpecialPositioning();
        }

        // Standard positioning based on direction
        if (olmDirection.equals("WEST") && localPlayer.getWorldLocation().equals(getMeleeAttackPosition())) {
            Movement.setDestination(getMeleeAttackPosition());
            return true;
        }

        // Move to melee attack position
        if (localPlayer.getWorldLocation().equals(getMeleeAttackPosition())) {
            Movement.setDestination(getMeleeSafePosition());
            return true;
        }

        return false;
    }

    /**
     * Handles special positioning for melee hand based on Olm phase
     */
    private boolean handleSpecialPositioning() {
        List<WorldPoint> safeTiles = new ArrayList<>();
        int olmPhase = olmTracker.getOlmPhase();

        // Phase 1 - use melee positions
        if (olmPhase == 1) {
            safeTiles = getMeleePositions();
        }

        // Phase 4 - move to melee attack position
        if (olmPhase == 4) {
            Movement.setDestination(getMeleeAttackPosition());
            return true;
        }

        // Phase 3 - check Olm direction
        if (olmPhase == 3) {
            if (olmTracker.getOlmPhase() != 2 || olmTracker.getOlmPhase() == 4) {
                Movement.setDestination(getMeleeSafePosition());
                return true;
            }
            Movement.setDestination(getMeleeAttackPosition());
            return true;
        }

        // Phase 2 - handle melee range tiles
        if (olmPhase == 2) {
            if (olmTracker.getOlmDirection().equals("NORTH")) {
                Movement.setDestination(getMeleeAttackPosition());
                return true;
            }
            safeTiles = getMeleeRangeTiles().toWorldPointList();
        }

        String direction = getDirectionForTurn(3);
        if (isActiveTurn() && direction.equals("ATTACK")) {
            return attackMeleeHand();
        }

        // Ensure we have safe tiles
        if (safeTiles.size() == 0) {
            safeTiles = getMeleePositions();
        }

        // Move to closest safe tile
        if (!safeTiles.contains(localPlayer.getWorldLocation())) {
            WorldPoint targetTile = safeTiles.stream()
                .filter(Reachable::isWalkable)
                .min(Comparator.comparingDouble(worldPoint -> worldPoint.distanceTo2DHypotenuse(localPlayer.getWorldLocation())))
                .orElse(null);

            Movement.setDestination(targetTile);
            return true;
        }

        return true;
    }

    /**
     * Gets the required prayers for the melee hand fight
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
     * Gets the equipment setup for melee hand
     */
    @Override
    public EquipmentSetup getGear() {
        return plugin.getMeleeGear();
    }

    /**
     * Ensures the correct attack style is set for melee
     */
    public void ensureMeleeAttackStyle() {
        if (getGear().isFullyEquipped() && Combat.getAttackStyle() != Combat.AttackStyle.FIRST) {
            // Item IDs for special weapons (Dragon Warhammer, Bandos Godsword, etc.)
            int[] specialWeaponIds = new int[4];
            specialWeaponIds[0] = 13576; // Dragon Warhammer
            specialWeaponIds[3] = 11804; // Bandos Godsword

            if (Equipment.contains(specialWeaponIds)) {
                Combat.setAttackStyle(Combat.AttackStyle.FIRST);
            }
        }
    }
}
