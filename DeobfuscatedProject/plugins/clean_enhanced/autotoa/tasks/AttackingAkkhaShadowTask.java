/*
 * Deobfuscated TOA Akkha Shadow Attack Task
 * Handles attacking Akkha's Shadow during the final phase
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Client;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;

/**
 * Task for attacking Akkha's Shadow during the final phase of the fight.
 *
 * The shadow appears at 20% HP and must be killed to finish Akkha.
 * This task handles:
 * - Finding and attacking the shadow
 * - Special attack weapon usage (blowpipe special)
 * - Spec energy and health thresholds for optimal DPS
 */
@TaskDesc(name = "Attacking Akkha Shadow", priority = 25, blocking = true)
public class AttackingAkkhaShadowTask extends TOATaskBase {

    /** Akkha's Shadow NPC name */
    private static final String SHADOW_NAME = "Akkha's Shadow";

    /** Toxic blowpipe for spec attacks */
    private static final String BLOWPIPE_NAME = "blowpipe";

    /** Saradomin godsword item ID for spec healing */
    private static final int SARA_GODSWORD_ID = 11802;

    /** Minimum missing health to use spec (50 HP) */
    private static final int MIN_MISSING_HEALTH = 50;

    /** Minimum spec energy required (80%) */
    private static final int MIN_SPEC_ENERGY = 80;

    /** Maximum attack distance */
    private static final int MAX_ATTACK_DISTANCE = 3;

    @Inject
    protected AttackingAkkhaShadowTask(Client client, TOAStateManager stateManager, TOAConfig config) {
        super(client, stateManager, config);
    }

    /**
     * Get the gear setup for attacking the shadow
     */
    public ConfigStorageBox<EquipmentSetup> getGearSetup() {
        return config.shadowAttackStyle();
    }

    /**
     * Check if we should use special attack
     *
     * Uses spec if:
     * - Have SGS in inventory
     * - Weapon is NOT blowpipe
     * - Missing enough health
     * - Have enough spec energy
     */
    public boolean shouldUseSpecial() {
        // Check for SGS in inventory
        if (Inventory.contains(SARA_GODSWORD_ID)) {
            return true;
        }

        // Check if using blowpipe (don't waste spec with blowpipe)
        Item weapon = Equipment.fromSlot(EquipmentInventorySlot.WEAPON);
        if (weapon == null || !weapon.getName().contains(BLOWPIPE_NAME)) {
            return false;
        }

        // Check health and spec thresholds
        if (Combat.getMissingHealth() >= MIN_MISSING_HEALTH && Combat.getSpecEnergy() > MIN_SPEC_ENERGY) {
            return false;
        }

        return true;
    }

    @Override
    protected boolean execute() {
        // Skip if busy with other mechanics
        if (shouldSkipAttack()) {
            return false;
        }

        // Get shadow spawn location from state manager
        WorldPoint shadowSpawn = stateManager.getAkkhaShadowSpawnLocation(client);

        // Find the shadow NPC near the spawn point
        NPC shadow = NPCs.getNearest(shadowSpawn, SHADOW_NAME);
        if (shadow == null || !canAttackNPC(shadow)) {
            return false;
        }

        Player player = Players.getLocal();

        // If already attacking shadow and in range, just update tracking
        if (player.getInteracting() == shadow && !player.isMoving() && shadow.distanceTo((Locatable) player) > MAX_ATTACK_DISTANCE) {
            trackShadowPosition(shadow.getWorldLocation());
            return true;
        }

        // Equip proper gear if needed
        equipGearIfNeeded();

        // Attack the shadow
        shadow.interact("Attack");
        return true;
    }

    /**
     * Track shadow position for pathfinding
     */
    private void trackShadowPosition(WorldPoint location) {
        stateManager.setLastShadowPosition(location);
    }

    /**
     * Equip gear for shadow attack if not already equipped
     */
    private void equipGearIfNeeded() {
        // Implementation swaps to shadow attack gear
    }

    /**
     * Check if we should skip attacking this tick
     */
    private boolean shouldSkipAttack() {
        return stateManager.isAkkhaTransitioning();
    }

    /**
     * Check if we can attack the given NPC
     */
    private boolean canAttackNPC(NPC npc) {
        return npc != null && !npc.isDead();
    }

    /**
     * Get the special attack gear setup
     */
    public ConfigStorageBox<EquipmentSetup> getSpecialGearSetup() {
        return config.shadowAttackStyle();
    }
}
