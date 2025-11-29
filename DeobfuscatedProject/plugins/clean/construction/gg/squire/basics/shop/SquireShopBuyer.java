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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.api.entities.Players;

@PluginDescriptor(name="Squire Shop Buyer", description="Automatically buys items from the shop", tags={"squire", "shop", "buy", "auto", "auto-buy", "auto buy", "auto shop", "auto shop buy"}, enabledByDefault=false)
public class SquireShopBuyer
extends SquirePlugin {
    
    private  WorldPoint he;

    protected void onStop() {
    }

    private static void llIIlIIIlIl() {
        lllIlIIlI = new String[lllIlIlII[2]];
        SquireShopBuyer.lllIlIIlI[SquireShopBuyer.lllIlIlII[1]] = "have enough coins.";
    }

    public void n(WorldPoint worldPoint) {
        this.he = worldPoint;
    }

    public WorldPoint cW() {
        return this.he;
    }

    private static boolean llIIlIIIlll(Object object) {
        return object == null;
    }

    @Provides
    SquireShopConfig x(ConfigManager configManager) {
        return (SquireShopConfig)configManager.getConfig(SquireShopConfig.class);
    }

    static {
        SquireShopBuyer.llIIlIIIllI();
        SquireShopBuyer.llIIlIIIlIl();
    }

    protected void onStart() {
        if (SquireShopBuyer.llIIlIIIlll(this.he) && SquireShopBuyer.llIIlIIlIII(Players.getLocal())) {
            this.he = Players.getLocal().getWorldLocation();
        }
    }

    private static boolean llIIlIIlIIl(int n2) {
        return n2 != 0;
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lllIlIlII[0]];
        classArray[SquireShopBuyer.lllIlIlII[1]] = BuyingShopItemsTask.class;
        classArray[SquireShopBuyer.lllIlIlII[2]] = OpeningPackTask.class;
        classArray[SquireShopBuyer.lllIlIlII[3]] = BankingTask.class;
        return classArray;
    }

    @Subscribe
    private void a(ChatMessage chatMessage) {
        if (SquireShopBuyer.llIIlIIlIIl(chatMessage.getMessage().contains(lllIlIIlI[lllIlIlII[1]]) ? 1 : 0)) {
            this.forceStop();
        }
    }

    private static boolean llIIlIIlIII(Object object) {
        return object != null;
    }
}

