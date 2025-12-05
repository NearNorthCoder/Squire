/*
 * Deobfuscated from gg.squire.basics.cure.SquireCurer
 *
 * Automatically cures poison status by drinking anti-poison potions.
 */
package gg.squire.basics.cure;

import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import net.runelite.api.Item;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;

/**
 * Automatically cures poison by drinking anti-poison potions.
 */
@PluginDescriptor(
    name = "Squire Cure",
    description = "Cures Poison",
    enabledByDefault = false
)
@SquireUtil
public class SquireCurer extends SquirePlugin {

    private static final String ACTION_DRINK = "Drink";
    private static final String ITEM_ANTIPOISON = "Antipoison";
    private static final String ITEM_ANTIDOTE = "Antidote";

    @Override
    protected Class<?>[] tasks() {
        return new Class[0];
    }

    @Override
    protected void onStart() {
    }

    @Override
    protected void onStop() {
    }

    /**
     * Checks poison status and drinks cure if poisoned.
     */
    @Subscribe
    public void onGameTick(GameTick gameTick) {
        if (!Combat.isPoisoned()) {
            return;
        }

        Item curePotion = Inventory.getFirst(item -> {
            // Look for antipoison potions but not antidote potions
            return item.getName().contains(ITEM_ANTIPOISON)
                && !item.getName().contains(ITEM_ANTIDOTE);
        });

        if (curePotion != null) {
            curePotion.interact(ACTION_DRINK);
        }
    }
}
