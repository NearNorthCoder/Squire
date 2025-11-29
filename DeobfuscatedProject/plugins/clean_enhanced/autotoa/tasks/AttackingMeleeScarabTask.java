package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Reachable;

import java.util.List;

/**
 * Task for attacking Soldier Scarabs and Spitting Scarabs during the Kephri boss fight in TOA.
 *
 * NPC Names:
 * - Soldier Scarab (melee scarab)
 * - Spitting Scarab (ranged scarab)
 *
 * Combat Logic:
 * 1. Finds nearest Soldier or Spitting Scarab
 * 2. Uses melee gear for Soldier Scarabs
 * 3. Uses ranged gear for Spitting Scarabs
 * 4. Checks if target is reachable before attacking
 * 5. Avoids dangerous tiles during combat
 *
 * Attack Priority:
 * - Priority 16 (high) to eliminate melee threats
 * - Blocking task
 *
 * Equipment Strategy:
 * - Soldier Scarab: Melee gear (they are weak to melee)
 * - Spitting Scarab: Ranged gear (they use ranged attacks)
 *
 * Priority: 16 (high)
 * Blocking: Yes
 */
@Singleton
@TaskDesc(name="Attacking melee scarab", priority=16, blocking=true)
public class AttackingMeleeScarabTask extends AutotoaManager {

    // NPC Names
    private static final String NPC_SOLDIER_SCARAB = "Soldier Scarab";
    private static final String NPC_SPITTING_SCARAB = "Spitting Scarab";
    private static final String INTERACTION_ATTACK = "Attack";

    // State tracking
    private boolean isSoldierScarab; // True if targeting Soldier Scarab, false if Spitting Scarab

    @Inject
    protected AttackingMeleeScarabTask(Client client, z z2, TOAConfig config) {
        super(client, z2, config, null);
    }

    /**
     * Returns the equipment setup based on the scarab type
     * - Soldier Scarab: Melee gear
     * - Spitting Scarab: Ranged gear
     */
    @Override
    public ConfigStorageBox<EquipmentSetup> getEquipmentSetup() {
        if (isSoldierScarab) {
            return this.config.kephriMelee();
        } else {
            return this.config.kephriRanger();
        }
    }

    /**
     * Main task execution
     *
     * @return true if task executed successfully, false otherwise
     */
    @Override
    protected boolean execute() {
        // Find nearest Soldier or Spitting Scarab
        NPC scarab = NPCs.getNearest(npc ->
            (npc.getName().equals(NPC_SPITTING_SCARAB) || npc.getName().equals(NPC_SOLDIER_SCARAB)) &&
            !npc.isDead()
        );

        if (scarab == null) {
            return false;
        }

        // Track which type of scarab we're attacking
        isSoldierScarab = scarab.getName().equals(NPC_SOLDIER_SCARAB);

        // Check if the scarab is reachable
        if (!Reachable.isInteractable((Locatable) scarab)) {
            // If not reachable, check if we have the right equipment
            // This prevents gear swapping when we can't reach the target
            int[] currentEquipment = this.getEquipmentIds(this.getEquipmentSetup());
            boolean hasCorrectGear = false;

            for (int equipmentId : currentEquipment) {
                if (equipmentId == -1) { // Special marker value
                    hasCorrectGear = true;
                    break;
                }
            }

            if (!hasCorrectGear) {
                return false;
            }
        }

        // Check if we're already attacking this scarab
        Actor currentTarget = Players.getLocal().getInteracting();
        if (currentTarget != null && currentTarget.equals(scarab)) {
            return true;
        }

        // Check for dangerous tiles to avoid
        List<WorldPoint> dangerousTiles = this.getDangerousTiles();
        WorldPoint playerLocation = Players.getLocal().getWorldLocation();

        // Only attack if safe or already in melee range
        if (!dangerousTiles.isEmpty() &&
            (!dangerousTiles.contains(playerLocation) ||
             !scarab.getWorldArea().isInMeleeDistance(playerLocation))) {
            return true; // Wait for safe positioning
        }

        // Attack the scarab
        this.prepareAttack();
        scarab.interact(INTERACTION_ATTACK);
        return true;
    }
}
