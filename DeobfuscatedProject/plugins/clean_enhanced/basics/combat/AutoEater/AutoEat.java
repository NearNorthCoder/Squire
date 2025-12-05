/*
 * Deobfuscated from gg.squire.basics.combat.AutoEater.AutoEat
 *
 * Auto eats food and drinks potions when health/prayer falls below threshold.
 * Also drinks boosting potions like super combat when stat boost is low.
 *
 * Original obfuscated class had encrypted strings using DES/Blowfish encryption
 * and bitwise constant obfuscation patterns.
 */
package gg.squire.basics.combat.AutoEater;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import net.runelite.api.Item;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.VarbitChanged;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;

/**
 * Auto Eater plugin that automatically eats food and drinks potions.
 *
 * Features:
 * - Eats food when health drops below configured threshold
 * - Drinks prayer restoration potions when prayer points are low
 * - Drinks boosting potions (super combat, etc.) when boost percentage is low
 * - Only drinks potions when in combat with NPCs
 */
@PluginDescriptor(
    name = "Squire Auto Eater",
    description = "Auto eats",
    enabledByDefault = false
)
@SquireUtil
public class AutoEat extends SquirePlugin {

    private static final String ACTION_EAT = "Eat";
    private static final String ACTION_DRINK = "Drink";
    private static final String ITEM_RESTORE = "Restore";
    private static final String ITEM_SANFEW = "Sanfew serum";
    private static final String ACTION_ATTACK = "Attack";

    @Inject
    private ClientThread clientThread;

    @Inject
    private AutoEatConfig config;

    @Inject
    private ConfigManager configManager;

    private int tickCounter = -1;

    public WorldPoint startLocation;

    @Override
    protected Class<?>[] tasks() {
        return new Class[0];
    }

    /**
     * Provides the config for this plugin.
     */
    @Provides
    AutoEatConfig provideConfig(ConfigManager configManager) {
        return configManager.getConfig(AutoEatConfig.class);
    }

    @Override
    protected void onStart() {
    }

    @Override
    protected void onStop() {
    }

    /**
     * Main game tick event handler that manages eating and drinking.
     */
    @Subscribe
    public void onGameTick(GameTick gameTick) {
        // Eat food if health is at or below threshold
        if (Combat.getCurrentHealth() <= config.eatHP()) {
            Item food = Inventory.getFirst(item -> item.hasAction(ACTION_EAT));
            if (food != null) {
                food.interact(0);
                Time.sleep(1L);
            }
        }

        // Drink prayer restoration potion if prayer points are at or below threshold
        if (Prayers.getPoints() <= config.drinkPrayAt()) {
            Item prayerPotion = Inventory.getFirst(item -> {
                // Look for items containing "Restore" but not "Sanfew serum"
                return item.getName().contains(ITEM_RESTORE)
                    && !item.getName().contains(ITEM_SANFEW);
            });

            if (prayerPotion != null) {
                prayerPotion.interact(1);
            }
        }

        // Check if player is in combat by looking for NPCs attacking the player
        boolean inCombat = Players.getLocal().getInteracting() != null
            || NPCs.getNearest(npc -> npc.getInteracting() == Players.getLocal()) != null;

        // Drink boosting potions if configured and in combat
        if (config.drinkBoostPotions() && inCombat) {
            Combat.drinkBoostingPotion(config.boostAtPercentage());
        }
    }

    @Subscribe
    public void onVarbitChanged(VarbitChanged varbitChanged) {
    }

    public int getTickCounter() {
        return this.tickCounter;
    }

    public void setTickCounter(int tickCounter) {
        this.tickCounter = tickCounter;
    }
}
