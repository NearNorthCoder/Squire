/*
 * Deobfuscated Great Olm Melee Spec Task
 * Handles using special attacks on the melee hand during the Great Olm fight
 */
package gg.squire.cox.tasks;

import com.google.inject.Inject;
import gg.squire.api.combat.CombatOptions;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.Prayer;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.client.Static;

/**
 * Task for using special attacks on the Great Olm's melee hand.
 *
 * Great Olm special attack mechanics:
 * - Special attacks (Dragon Warhammer spec) reduce Olm's stats
 * - Bandos Godsword spec reduces defense
 * - Must time specs correctly during vulnerable phases
 * - Special energy must be managed carefully
 * - Positioning is critical for landing specs
 */
@TaskDesc(name = "Olm Melee Spec", priority = 20001, blocking = true)
public class OlmMeleeSpecTask extends CoxManager {

    @Inject
    protected OlmMeleeSpecTask(SquireChambersPlugin plugin, SquireChambersConfig config, Client client) {
        super(plugin, config, client);
    }

    /**
     * Main execution method for the melee spec task
     */
    @Override
    public boolean execute() {
        // Check if melee hand is active
        if (!isMeleeHandActive()) {
            return false;
        }

        // Check melee hand health (must be above threshold)
        if (olmTracker.isMeleeHandAlive() < 1 && olmTracker.isMeleeHandAlive() != 2) {
            return false;
        }

        // Get equipped weapon
        Item weapon = Static.getClient().getLocalPlayer().getPlayerComposition().getEquipmentId(EquipmentInventorySlot.WEAPON);
        if (weapon == null) {
            return false;
        }

        // Get special weapon setup
        EquipmentSetup specialWeaponGear = plugin.getSpecialWeaponGear();
        int weaponId = specialWeaponGear.get(EquipmentInventorySlot.WEAPON);

        // Check if weapon is a valid special attack weapon
        boolean isSpecWeapon = Arrays.stream(Static.getClient().getEnum(3).getKeys())
            .anyMatch(key -> weaponId == weaponId);

        if (!isSpecWeapon) {
            Log.warn("No valid special attack weapon equipped");
            return false;
        }

        // Check if Olm fight is active
        if (!isOlmActive()) {
            return false;
        }

        // Check if can use special attack
        if (!canUseSpecialAttack()) {
            return false;
        }

        // Equip special weapon if not already equipped
        if (!specialWeaponGear.isEquipped()) {
            specialWeaponGear.swap();
        }

        // Activate special attack if not already active
        if (!CombatOptions.isSpecialAttackActivated()) {
            Combat.toggleSpec();
        }

        // Move to safe position if in dangerous area
        if (getSpecAttackDangerTiles().contains(localPlayer)) {
            Movement.setDestination(getMeleeSafePosition());
            return true;
        }

        // Attack melee hand
        attackMeleeHand();
        return true;
    }

    /**
     * Handles special positioning for melee spec based on Olm phase
     */
    private boolean handleSpecialPositioning() {
        List<WorldPoint> safeTiles = new ArrayList<>();
        int olmPhase = olmTracker.getOlmPhase();

        // Phase 5 - use melee positions
        if (olmPhase == 5) {
            safeTiles = getMeleePositions();
        }

        // Phase 6 - move to melee attack position
        if (olmPhase == 6) {
            Movement.setDestination(getMeleeAttackPosition());
            return true;
        }

        // Phase 4 - check Olm direction
        if (olmPhase == 4) {
            if (olmTracker.getOlmPhase() == 7) {
                Movement.setDestination(getMeleeSafePosition());
                return true;
            }
            Movement.setDestination(getMeleeAttackPosition());
            return true;
        }

        // Phase 7 - handle melee range tiles
        if (olmPhase == 7) {
            safeTiles = getMeleeRangeTiles().toWorldPointList();
        }

        String direction = getDirectionForTurn(4);
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
     * Gets the required prayers for the melee spec
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
     * Gets the equipment setup for melee spec
     */
    @Override
    public EquipmentSetup getGear() {
        return plugin.getSpecialWeaponGear();
    }
}
