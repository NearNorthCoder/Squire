/*
 * Decompiled with CFR 0.152.
 *
 * Brew (Nectar) Drinking Task
 *
 * This task handles drinking brews (nectar) during TOA raids.
 * Brews boost defense and restore health at the cost of other stats.
 * It drinks brews when:
 * - Not paused
 * - Don't have enough HP for special weapon usage
 * - In boss fight phase and HP is low
 * - Consumable manager allows brew usage
 */
package gg.squire.autotoa.tasks;

import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.client.plugins.fw.TaskDesc;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Drinking brew", priority=100)
public class DrinkingBrewTask extends KephriManager {

    // Constants
    private static final int DRAGON_WARHAMMER_ID = 30398; // 0x76BE
    private static final int SPEC_ENERGY_THRESHOLD = 62;
    private static final int HP_THRESHOLD_LOW = 40;
    private static final int HP_THRESHOLD_HIGH = 80;

    private final SquireAutoTOA plugin;
    private final C consumableManager;

    @Inject
    protected DrinkingBrewTask(Client client, C consumableManager, SquireAutoTOA plugin) {
        super(client);
        this.consumableManager = consumableManager;
        this.plugin = plugin;
    }

    @Override
    public boolean run() {
        // Don't drink if plugin is paused
        if (this.plugin.e()) {
            return false;
        }

        // Find nectar (brew) in inventory
        Item brew = Inventory.getFirst(item ->
            GameEnum12.NECTAR.d(item.getId()) && !item.getName().contains("brew")
        );

        // No brew found
        if (brew == null) {
            return false;
        }

        // Check if we have a special weapon (Dragon warhammer) and enough resources
        if (!aq()) {
            Item dragonWarhammer = Inventory.getFirst(DRAGON_WARHAMMER_ID);
            // Don't drink brew if we have DWH with enough spec energy and HP
            if (dragonWarhammer != null &&
                Combat.getSpecEnergy() > SPEC_ENERGY_THRESHOLD &&
                Combat.getCurrentHealth() > HP_THRESHOLD_LOW) {
                return false;
            }
        }

        // Determine if we should drink based on phase and health
        boolean shouldDrink = false;

        // In boss fight phase
        if (bf()) {
            shouldDrink = true;
        }

        // Or if consumable manager says to use brew
        if (this.consumableManager.ap()) {
            shouldDrink = true;
        }

        // Check if HP is already high enough
        if (Combat.getCurrentHealth() >= HP_THRESHOLD_HIGH) {
            shouldDrink = false;
        }

        // Final check with consumable manager
        if (!this.consumableManager.am() || !shouldDrink) {
            return false;
        }

        // Drink the brew
        brew.interact("Drink");
        this.consumableManager.ao();
        return true;
    }
}
