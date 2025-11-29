package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Client;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;

/**
 * Automatically drinks combat potions when player stats drop below optimal levels.
 *
 * Game Mechanics:
 * - Combat stats (Attack, Strength, Defence, Ranged, Magic) boost by different amounts
 * - Super combat potions: +5 + 15% of level for melee stats
 * - Ranging potions: +4 + 10% of level for Ranged
 * - Magic potions: +4 for Magic
 * - Potion effects decay over time (approximately 1 level per minute)
 * - There's a cooldown between drinking doses (varbit 14376)
 *
 * Strategy:
 * - Monitor combat stats and compare to base + boost
 * - When stats drop to 50% of max boost, drink another dose
 * - Check potion cooldown before attempting to drink
 * - Select appropriate potion based on equipped weapon style
 */
@TaskDesc(name="Drinking potion", priority=200)
public class DrinkingPotionTask extends AutotoaManager {

    // Varbit for potion drinking cooldown (prevents spam-drinking)
    private static final int POTION_COOLDOWN_VARBIT = 14376;

    private final C potionManager;          // Manages potion state
    private final SquireAutoTOA pluginMain;  // Main plugin reference

    @Inject
    protected DrinkingPotionTask(Client client, C potionManager, SquireAutoTOA pluginMain) {
        super(client);
        this.potionManager = potionManager;
        this.pluginMain = pluginMain;
    }

    @Override
    public boolean run() {
        // Don't drink potions if plugin is paused
        if (this.pluginMain.e()) {
            return false;
        }

        // Don't drink if not in combat area
        if (!this.bc()) {
            return false;
        }

        // Check if on potion cooldown
        if (Vars.getBit(POTION_COOLDOWN_VARBIT) > 0) {
            return false;  // Still on cooldown
        }

        // Check if potion manager is ready
        if (!this.potionManager.am()) {
            return false;
        }

        // Get currently equipped weapon to determine which potions to check
        Item equippedWeapon = Equipment.fromSlot(EquipmentInventorySlot.WEAPON);

        // Get all applicable potion types for this weapon
        a[] potionTypes = a.a(equippedWeapon);

        // Check each potion type to see if we need to drink
        for (a potionType : potionTypes) {
            Skill[] affectedSkills = potionType.m();

            for (Skill skill : affectedSkills) {
                // Calculate the boost amount this potion provides
                int baseLevel = Skills.getLevel(skill);
                int maxBoost = potionType.a(skill);
                int currentLevel = Skills.getBoostedLevel(skill);

                // Drink potion if current level is at or below 50% of max boost
                // This ensures we maintain high combat stats throughout the fight
                int drinkThreshold = baseLevel + (maxBoost / 2);

                if (currentLevel <= drinkThreshold) {
                    // Find the potion in inventory
                    String potionNamePrefix = potionType.l();
                    Item potion = Inventory.getFirst(item ->
                        item.getName().startsWith(potionNamePrefix)
                    );

                    if (potion != null) {
                        // Drink the potion
                        potion.interact("Drink");

                        // Notify potion manager
                        this.potionManager.ao();

                        return true;  // Task executed successfully
                    }
                }
            }
        }

        return false;  // No potions needed
    }
}
