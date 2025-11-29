package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;

/**
 * Task for attacking Arcane Scarabs during the Kephri boss fight in TOA.
 *
 * NPC Names:
 * - Arcane Scarab (mage scarab that casts magic attacks)
 *
 * Combat Logic:
 * 1. Finds nearest alive Arcane Scarab
 * 2. Checks if already interacting with it
 * 3. If not, attacks the scarab
 *
 * Attack Priority:
 * - Very high priority (25) to quickly eliminate mage threats
 * - Blocking task that prevents other actions
 *
 * Strategy:
 * - Arcane Scarabs are dangerous mage enemies that should be killed immediately
 * - Uses configured mage gear for Kephri
 * - Simple targeting - just attack nearest one
 *
 * Priority: 25 (very high)
 * Blocking: Yes
 */
@TaskDesc(name="Attacking mage scarab", priority=25, blocking=true)
public class AttackingMageScarabTask extends KephriManager {

    // NPC Names
    private static final String NPC_ARCANE_SCARAB = "Arcane Scarab";
    private static final String INTERACTION_ATTACK = "Attack";

    @Inject
    protected AttackingMageScarabTask(Client client, ToaPlugin plugin, TOAConfig config) {
        super(client, plugin, config);
    }

    /**
     * Returns the equipment setup for attacking mage scarabs
     */
    @Override
    public ConfigStorageBox<EquipmentSetup> getEquipmentSetup() {
        return this.config.kephriMager();
    }

    /**
     * Main task execution
     *
     * @return true if task executed successfully, false otherwise
     */
    @Override
    protected boolean execute() {
        // Find nearest alive Arcane Scarab
        NPC arcaneScarab = NPCs.getNearest(npc ->
            npc.getName().equals(NPC_ARCANE_SCARAB) && !npc.isDead()
        );

        if (arcaneScarab == null) {
            return false;
        }

        // Check if we're already attacking this scarab
        Actor currentTarget = Players.getLocal().getInteracting();
        if (currentTarget != null && currentTarget.equals(arcaneScarab)) {
            return true;
        }

        // Attack the scarab
        this.prepareAttack();
        arcaneScarab.interact(INTERACTION_ATTACK);
        return true;
    }
}
