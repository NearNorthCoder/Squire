/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.unethicalite.api.entities.Players
 */
package gg.squire.basics.shop;

import com.google.inject.Provides;
import gg.squire.basics.shop.SquireShopConfig;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.basics.shop.BankingTask;
import gg.squire.basics.shop.BuyingShopItemsTask;
import gg.squire.basics.shop.OpeningPackTask;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.api.entities.Players;

@PluginDescriptor(name="Squire Shop Buyer", description="Automatically buys items from the shop", tags={"squire", "shop", "buy", "auto", "auto-buy", "auto buy", "auto shop", "auto shop buy"}, enabledByDefault=false)
public class SquireShopBuyer
extends SquirePlugin {
    private static  String[] lllIlIIlI;
    private  WorldPoint he;
    private static  int[] lllIlIlII;

    protected void onStop() {
    }

    public void n(WorldPoint worldPoint) {
        this.he = worldPoint;
    }

    public WorldPoint cW() {
        return this.he;
    }

    @Provides
    SquireShopConfig x(ConfigManager configManager) {
        return (SquireShopConfig)configManager.getConfig(SquireShopConfig.class);
    }

        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    protected void onStart() {
        if ((this.he == null) && (Players.getLocal( != null))) {
            this.he = Players.getLocal().getWorldLocation();
        }
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[0];
        classArray[1] = BuyingShopItemsTask.class;
        classArray[2] = OpeningPackTask.class;
        classArray[3] = BankingTask.class;
        return classArray;
    }

    @Subscribe
    private void a(ChatMessage chatMessage) {
        if ((chatMessage.getMessage( != 0).contains(lllIlIIlI[1]) ? 1 : 0)) {
            this.forceStop();
        }
    }

}

