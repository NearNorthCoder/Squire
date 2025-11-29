/*
 * Deobfuscated TOA Warden Phase 1 Attack Task
 * Handles attacking the Warden during Phase 1 (Obelisk phase)
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;

/**
 * Task for attacking the Warden during Phase 1.
 *
 * Phase 1 mechanics:
 * - Elidinis' Warden appears with different forms
 * - Requires different attack styles based on form
 * - Obelisks must be destroyed during this phase
 */
@TaskDesc(name = "Attacking p1 warden", priority = 10)
public class AttackingP1WardenTask extends TOATaskBase {

    /** Warden name */
    private static final String WARDEN_NAME = "Elidinis' Warden";

    /** Attack speed setting */
    private static final int ATTACK_SPEED = 28;

    /** Warden NPC IDs for different forms/phases */
    private static final int WARDEN_RANGED_START = 11752;
    private static final int WARDEN_RANGED_END = 11754;
    private static final int WARDEN_MAGE_START = 11755;
    private static final int WARDEN_MAGE_END = 11757;

    /** Reference to main plugin */
    @Inject
    private SquireAutoTOA plugin;

    @Inject
    protected AttackingP1WardenTask(Client client, TOAStateManager stateManager, TOAConfig config) {
        super(client, stateManager, config);
    }

    @Override
    protected boolean execute() {
        // Find the core/warden to attack
        NPC warden = findWardenCore();
        if (warden == null) {
            return false;
        }

        // Check if warden has attack action
        if (!warden.hasAction("Attack")) {
            return false;
        }

        // Equip proper gear
        equipGearIfNeeded();

        // Set attack speed
        plugin.setAttackSpeed(ATTACK_SPEED);

        // Attack the warden
        warden.interact("Attack");
        return true;
    }

    /**
     * Get gear setup based on warden form
     */
    public ConfigStorageBox<EquipmentSetup> getGearSetup() {
        NPC warden = NPCs.getNearest(WARDEN_NAME);
        if (warden == null) {
            return config.mageP2Warden();
        }

        int wardenId = warden.getId();

        // Check if in ranged phase (IDs 11752-11754)
        if (wardenId >= WARDEN_RANGED_START && wardenId <= WARDEN_RANGED_END) {
            return config.rangedP2Warden();
        }

        // Check if in mage phase (IDs 11755-11757)
        if (wardenId >= WARDEN_MAGE_START && wardenId <= WARDEN_MAGE_END) {
            return config.mageP2Warden();
        }

        // Default to mage
        return config.mageP2Warden();
    }

    /**
     * Find the Warden core NPC
     */
    private NPC findWardenCore() {
        return stateManager.findWardenCore();
    }

    /**
     * Equip appropriate gear
     */
    private void equipGearIfNeeded() {
        // Implementation handles gear switching
    }
}
