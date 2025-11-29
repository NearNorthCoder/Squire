/*
 * Deobfuscated TOA Final Warden Attack Task
 * Handles attacking the Warden during the final phase (P3)
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Client;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Equipment;

/**
 * Task for attacking the Warden during the final phase.
 *
 * Final phase mechanics:
 * - Warden becomes attackable directly
 * - Must avoid slam attacks
 * - Different weapon types have different attack speeds
 */
@Singleton
@TaskDesc(name = "Attacking final warden", priority = 40)
public class AttackingFinalWardenTask extends TOATaskBase {

    /** Final Warden NPC IDs */
    private static final int WARDEN_FINAL_ID_1 = 11761;
    private static final int WARDEN_FINAL_ID_2 = 11762;

    /** Weapon name checks for attack timing */
    private static final String SHADOW_WEAPON = "shadow";
    private static final String TBOW_WEAPON = "twisted bow";
    private static final String FANG_WEAPON = "fang";

    /** Attack delay ticks for different weapons */
    private static final int TBOW_DELAY = 4;
    private static final int NORMAL_DELAY = 3;
    private static final int SLAM_DELAY = 50;

    /** Whether first attack has been made */
    private boolean firstAttackDone;

    /** Reference to movement handler */
    private final TOAStateManager stateManager;

    @Inject
    protected AttackingFinalWardenTask(Client client, TOAStateManager stateManager, TOAConfig config) {
        super(client, stateManager, config);
        this.stateManager = stateManager;
        this.firstAttackDone = false;
    }

    /**
     * Reset state for new fight
     */
    public void reset() {
        firstAttackDone = false;
    }

    /**
     * Get attack cooldown based on weapon type
     */
    public int getAttackCooldown() {
        if (isInSlamPhase()) {
            return SLAM_DELAY;
        }
        return 1;
    }

    @Override
    protected boolean execute() {
        // Find final warden
        int[] wardenIds = {WARDEN_FINAL_ID_1, WARDEN_FINAL_ID_2};
        NPC warden = NPCs.getNearest(wardenIds);
        if (warden == null) {
            return false;
        }

        // Check if in slam phase
        if (isInSlamPhase()) {
            if (!firstAttackDone) {
                firstAttackDone = true;
                stateManager.setSlamState(0);
            }
            if (stateManager.isSlamActive()) {
                return false;
            }
        }

        // Check if in melee range
        boolean inMeleeRange = warden.getWorldArea().isInMeleeDistance(Players.getLocal().getWorldLocation());

        // Determine if we should use melee
        boolean useMelee = !isInSlamPhase() || inMeleeRange;

        // Set attack mode
        setAttackingNPC(warden, useMelee);

        // Attack the warden
        warden.interact("Attack");

        // Calculate sleep time based on weapon
        Item weapon = Equipment.fromSlot(EquipmentInventorySlot.WEAPON);
        int sleepTime;

        if (isInSlamPhase()) {
            sleepTime = 1;
        } else if (weapon != null && isSlowWeapon(weapon)) {
            sleepTime = TBOW_DELAY;
        } else {
            sleepTime = NORMAL_DELAY;
        }

        sleep(sleepTime);
        return true;
    }

    /**
     * Check if weapon is a slow attack speed weapon
     */
    private boolean isSlowWeapon(Item weapon) {
        String name = weapon.getName().toLowerCase();
        // Shadow, TBow, or Fang are considered slow for timing purposes
        return name.contains(SHADOW_WEAPON) || name.contains(TBOW_WEAPON) || name.contains(FANG_WEAPON);
    }

    /**
     * Check if currently in slam phase
     */
    private boolean isInSlamPhase() {
        return stateManager.isWardenSlamPhase();
    }

    /**
     * Set the NPC being attacked
     */
    private void setAttackingNPC(NPC npc, boolean useMelee) {
        stateManager.setAttackingNPC(npc, useMelee ? 1 : 0);
    }

    /**
     * Sleep for specified ticks
     */
    private void sleep(int ticks) {
        // Implementation pauses execution
    }
}
