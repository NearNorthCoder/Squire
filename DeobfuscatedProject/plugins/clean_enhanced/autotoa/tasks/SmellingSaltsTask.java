/*
 * Decompiled with CFR 0.152.
 *
 * Smelling Salts Task
 *
 * This task handles using smelling salts during TOA raids.
 * Smelling salts boost strength significantly but have limited uses.
 * It uses smelling salts when:
 * - Not currently in combat
 * - Strength boost is insufficient (drain > 20)
 * - Player is not interacting with anything
 * - TOA varbit allows usage
 * - In special weapon mode or dehydrated
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Smelling salts", priority=100)
public class SmellingSaltsTask extends KephriManager {

    // Constants
    private static final int TOA_VARBIT = 14469; // 0x3885
    private static final int STRENGTH_DRAIN_THRESHOLD = 20;

    private final ConsumableManager consumableManager;
    private final TOAConfig config;

    @Inject
    protected SmellingSaltsTask(Client client, ConsumableManager consumableManager, TOAConfig config) {
        super(client);
        this.consumableManager = consumableManager;
        this.config = config;
    }

    @Override
    public boolean run() {
        // Don't use if currently in combat area
        if (isInCombatArea()) {
            return false;
        }

        // Find smelling salts in inventory
        // Smelling salts are labeled as "salts" and have a dose number "1"
        Item smellingSalts = Inventory.getFirst(item ->
            item.getName().contains("salts") && item.getName().contains("1")
        );

        // If no labeled salts found, try just "salts"
        if (smellingSalts == null) {
            smellingSalts = Inventory.getFirst(item ->
                item.getName().contains("salts")
            );
        }

        // No smelling salts found
        if (smellingSalts == null) {
            return false;
        }

        // Check if this is a labeled "1" dose
        if (smellingSalts.getName().contains("1")) {
            // Get usage count from consumable manager
            int usageCount = this.consumableManager.getSupplyQuantity()
                .getOrDefault(TOAItemType.SMELLING_SALTS, 0);

            // Don't use if already used and not in special situations
            if (usageCount < 1 && !isInSpecialWeaponMode() && !this.config.dehydration()) {
                return false;
            }
        }

        // Don't use if player is interacting with something
        if (Players.getLocal().getInteracting() != null) {
            return false;
        }

        // Check TOA varbit
        if (Vars.getBit(TOA_VARBIT) > 0) {
            return false;
        }

        // Check strength boost level
        int strengthBoost = Skills.getBoostedLevel(Skill.STRENGTH) -
                           Skills.getLevel(Skill.STRENGTH);

        // Don't use if strength boost is sufficient (less than threshold drain)
        // AND (not in special weapon mode OR not dehydrated)
        if (strengthBoost > STRENGTH_DRAIN_THRESHOLD &&
            (!isInSpecialWeaponMode() || !this.config.dehydration())) {
            return false;
        }

        // Crush the smelling salts
        smellingSalts.interact("Crush");
        return true;
    }
}
