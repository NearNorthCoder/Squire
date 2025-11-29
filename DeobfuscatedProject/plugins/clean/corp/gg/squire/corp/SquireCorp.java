/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.EventBus
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.events.NpcLootReceived
 *  net.runelite.client.game.ItemStack
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  net.unethicalite.api.game.Prices
 */
package gg.squire.corp;

import gg.squire.corp.HandlingPrayersTask;
import gg.squire.corp.CheckingIfWeShouldBankTask;
import gg.squire.corp.BankingTask;
import gg.squire.corp.DrinkingBoostTask;
import gg.squire.corp.EatingFoodTask;
import gg.squire.corp.AttackingCorporealBeastTask;
import gg.squire.corp.KillingCoreTask;
import gg.squire.corp.DrinkingFromPoolTask;
import gg.squire.corp.EnteringHousePortalTask;
import gg.squire.corp.HoppingForFreeWorldTask;
import gg.squire.corp.TeleportingToCorpTask;
import gg.squire.corp.TeleportingToHouseTask;
import gg.squire.corp.LootingItemTask;
import gg.squire.corp.EnteringCorpLairTask;
import gg.squire.corp.SpecingCorpTask;
import gg.squire.corp.SHelper;
import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import gg.squire.corp.SquireCorpConfig;
import gg.squire.corp.overlay.CorpInfoBox;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.NpcLootReceived;
import net.runelite.client.game.ItemStack;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.game.Prices;

@SquireUtil
@PluginDescriptor(name="Squire Corporeal Beast", description="Kills the corporeal beast", enabledByDefault=false)
public class SquireCorp
extends SquirePlugin {
    private  int e;
    @Inject
    private  s a;
    private  boolean f;
    private  int i;
    
    @Inject
    private  OverlayManager c;
    private  boolean h;
    private  boolean g;
    
    @Inject
    private  EventBus b;
    @Inject
    private  CorpInfoBox d;

    public boolean d() {
        return this.h;
    }

    static {
        SquireCorp.lllIIIIlllIIII();
        SquireCorp.lllIIIIllIllll();
    }

    public void c(boolean bl) {
        this.h = bl;
    }

    public boolean b() {
        return this.f;
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (SquireCorp.lllIIIIlllIIIl(chatMessage.getMessage().contains(lIlIlllIlIIl[lIlIlllIlIlI[0]]) ? 1 : 0)) {
            this.e += lIlIlllIlIlI[2];
        }
    }

    public int a() {
        return this.e;
    }

    public void a(boolean bl) {
        this.f = bl;
    }

    protected void onStop() {
        this.b.unregister((Object)this.a);
        this.c.remove((Overlay)this.d);

    }

    public void b(boolean bl) {
        this.g = bl;
    }

    public int e() {
        return this.i;
    }

    protected void onStart() {
        this.a.v();
        this.e = lIlIlllIlIlI[0];
        this.f = lIlIlllIlIlI[0];
        this.b.register((Object)this.a);
        this.c.add((Overlay)this.d);

    }

    private static void lllIIIIllIllll() {
        lIlIlllIlIIl = new String[lIlIlllIlIlI[2]];
        SquireCorp.lIlIlllIlIIl[SquireCorp.lIlIlllIlIlI[0]] = "Your Corporeal Beast kill count is";
    }

    @Provides
    SquireCorpConfig a(ConfigManager configManager) {
        return (SquireCorpConfig)configManager.getConfig(SquireCorpConfig.class);
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lIlIlllIlIlI[1]];
        classArray[SquireCorp.lIlIlllIlIlI[0]] = HandlingPrayersTask.class;
        classArray[SquireCorp.lIlIlllIlIlI[2]] = LootingItemTask.class;
        classArray[SquireCorp.lIlIlllIlIlI[3]] = AttackingCorporealBeastTask.class;
        classArray[SquireCorp.lIlIlllIlIlI[4]] = KillingCoreTask.class;
        classArray[SquireCorp.lIlIlllIlIlI[5]] = EatingFoodTask.class;
        classArray[SquireCorp.lIlIlllIlIlI[6]] = SpecingCorpTask.class;
        classArray[SquireCorp.lIlIlllIlIlI[7]] = DrinkingBoostTask.class;
        classArray[SquireCorp.lIlIlllIlIlI[8]] = CheckingIfWeShouldBankTask.class;
        classArray[SquireCorp.lIlIlllIlIlI[9]] = BankingTask.class;
        classArray[SquireCorp.lIlIlllIlIlI[10]] = EnteringHousePortalTask.class;
        classArray[SquireCorp.lIlIlllIlIlI[11]] = HoppingForFreeWorldTask.class;
        classArray[SquireCorp.lIlIlllIlIlI[12]] = DrinkingFromPoolTask.class;
        classArray[SquireCorp.lIlIlllIlIlI[13]] = TeleportingToCorpTask.class;
        classArray[SquireCorp.lIlIlllIlIlI[14]] = EnteringCorpLairTask.class;
        classArray[SquireCorp.lIlIlllIlIlI[15]] = TeleportingToHouseTask.class;
        return classArray;
    }

    private static boolean lllIIIIlllIIIl(int n2) {
        return n2 != 0;
    }

    @Subscribe
    public void a(NpcLootReceived npcLootReceived) {
        Iterator var1 = npcLootReceived.getItems().iterator();
        while (SquireCorp.lllIIIIlllIIIl(var1.hasNext() ? 1 : 0)) {
            ItemStack var2 = (ItemStack)var1.next();
            var3.i += var2.getQuantity() * Prices.getItemPrice((int)var2.getId());

            if (3 > 0) continue;
            return;
        }
    }

    public boolean c() {
        return this.g;
    }

    public SquireCorp() {
        this.e = lIlIlllIlIlI[0];
        this.f = lIlIlllIlIlI[0];
        this.g = lIlIlllIlIlI[0];
        this.h = lIlIlllIlIlI[0];
    }
}

