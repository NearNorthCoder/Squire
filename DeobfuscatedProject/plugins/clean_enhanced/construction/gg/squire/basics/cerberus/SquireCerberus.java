/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.ItemComposition
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.EventBus
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.game.ItemManager
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.plugins.loottracker.LootReceived
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  net.unethicalite.api.game.Prices
 */
package gg.squire.basics.cerberus;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.basics.cerberus.SquireCerberusConfig;
import gg.squire.basics.cerberus.overlay.CerberusOverlay;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import gg.squire.basics.cerberus.TraversingToCerberusTask;
import gg.squire.basics.cerberus.ConstructionManager;
import gg.squire.basics.cerberus.HHelper;
import gg.squire.basics.cerberus.DrinkingPrayerPotionTask;
import gg.squire.basics.cerberus.EatingWildPieTask;
import gg.squire.basics.cerberus.HoppingWorldsTask;
import gg.squire.basics.cerberus.CheckingStateTask;
import gg.squire.basics.cerberus.TeleportingOutTask;
import gg.squire.basics.cerberus.BankingTask;
import gg.squire.basics.cerberus.WalkingToBankTask;
import gg.squire.basics.cerberus.AttackingCerberusTask;
import gg.squire.basics.cerberus.DrinkingBoostTask;
import gg.squire.basics.cerberus.EatingFoodTask;
import gg.squire.basics.cerberus.HandlingPrayerTask;
import gg.squire.basics.cerberus.LootingItemsTask;
import gg.squire.basics.cerberus.MovingOffFireTask;
import gg.squire.basics.cerberus.ScatteringAshesTask;
import gg.squire.basics.cerberus.SpecialAttackTask;
import gg.squire.basics.cerberus.UsingThrallTask;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import net.runelite.api.ChatMessageType;
import net.runelite.api.ItemComposition;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.game.ItemManager;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.loottracker.LootReceived;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.game.Prices;

@PluginDescriptor(name="Squire Cerberus", description="Kills Cerberus for you, banks and loots items.", enabledByDefault=false)
@SquireUtil
public class SquireCerberus
extends SquirePlugin {
    private static  int[] llIIlIllI;
    private  boolean M;
     List<h> F;
    @Inject
    private  SquireCerberusConfig G;
    @Inject
    private  CerberusOverlay I;
    private static  String[] llIIlIlIl;
    @Inject
    private  a J;
    @Inject
    private  OverlayManager H;
    @Inject
    private  EventBus K;
    private  int L;
    @Inject
    private  ItemManager w;

    private static void var1() {
        llIIlIlIl = new String[llIIlIllI[2]];
        SquireCerberus.llIIlIlIl[SquireCerberus.llIIlIllI[1]] = "Your Cerberus kill";
    }

    private static void var2() {
        llIIlIllI = new int[18];
        SquireCerberus.llIIlIllI[0] = 0x5F ^ 0x4E;
        SquireCerberus.llIIlIllI[1] = (0xCE ^ 0x8D) & ~(0xDF ^ 0x9C);
        SquireCerberus.llIIlIllI[2] = 1;
        SquireCerberus.llIIlIllI[3] = 2;
        SquireCerberus.llIIlIllI[4] = 3;
        SquireCerberus.llIIlIllI[5] = 0xF ^ 0x7C ^ (0xE4 ^ 0x93);
        SquireCerberus.llIIlIllI[6] = 0x7A ^ 0x7F;
        SquireCerberus.llIIlIllI[7] = 0x65 ^ 0x74 ^ (0x75 ^ 0x62);
        SquireCerberus.llIIlIllI[8] = 0x2C ^ 0x2B;
        SquireCerberus.llIIlIllI[9] = 0xAA ^ 0xA2;
        SquireCerberus.llIIlIllI[10] = 24 + 104 - 33 + 79 ^ 7 + 163 - 157 + 154;
        SquireCerberus.llIIlIllI[11] = 0x65 ^ 0x7F ^ (0x62 ^ 0x72);
        SquireCerberus.llIIlIllI[12] = 0xBC ^ 0xB7;
        SquireCerberus.llIIlIllI[13] = 0x47 ^ 0x4B;
        SquireCerberus.llIIlIllI[14] = 125 + 132 - 110 + 53 ^ 65 + 29 - 34 + 137;
        SquireCerberus.llIIlIllI[15] = 0x88 ^ 0x86;
        SquireCerberus.llIIlIllI[16] = 0x19 ^ 0x16;
        SquireCerberus.llIIlIllI[17] = 0x6D ^ 0x5A ^ (0x6E ^ 0x49);
    }

    public void b(int n2) {
        this.L = n2;
    }

    protected void onStart() {
        this.H.add((Overlay)this.I);
        0;
        this.J.a();
        this.K.register((Object)this.J);
    }

    public boolean r() {
        return this.M;
    }

    private static boolean var3(int n2) {
        return n2 != 0;
    }

    public void b(boolean bl2) {
        this.M = bl2;
    }

    private static boolean var4(int n2, int n3) {
        return n2 < n3;
    }

    private static String var5(String var6, String var7) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var9 = var7.toCharArray();
        int var10 = llIIlIllI[1];
        char[] var11 = var6.toCharArray();
        int var12 = var11.length;
        int var13 = llIIlIllI[1];
        while (SquireCerberus.var4(var13, var12)) {
            char var14 = var11[var13];
            var8.append((char)(var14 ^ var9[var10 % var9.length]));
            0;
            ++var10;
            ++var13;
            0;
            if ((0x10 ^ 0x49 ^ (0xD1 ^ 0x8C)) > 0) continue;
            return null;
        }
        return String.valueOf(var8);
    }

    @Subscribe
    public void a(LootReceived lootReceived) {
        lootReceived.getItems().forEach(itemStack -> {
            h h2 = new HHelper();
            Instant instant = Instant.now();
            h2.a(instant);
            ItemComposition itemComposition = this.w.getItemComposition(itemStack.getId());
            int n2 = Prices.getItemPrice((int)itemStack.getId());
            h2.a(itemComposition.getName());
            h2.f(itemStack.getId());
            h2.g(n2);
            h2.h(this.w.getAlchValue(itemComposition));
            this.F.add(h2);
            0;
        });
    }

    @Provides
    SquireCerberusConfig a(ConfigManager configManager) {
        return (SquireCerberusConfig)configManager.getConfig(SquireCerberusConfig.class);
    }

    public int q() {
        return this.L;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var15;
        ChatMessageType chatMessageType = chatMessage.getType();
        if (SquireCerberus.var16(chatMessageType, ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        String var17 = var15.getMessage();
        if (SquireCerberus.var3(var17.contains(llIIlIlIl[llIIlIllI[1]]) ? 1 : 0)) {
            SquireCerberus var18;
            var18.b(var18.q() + llIIlIllI[2]);
            var18.J.a(llIIlIllI[2]);
        }
    }

    static {
        SquireCerberus.var2();
        SquireCerberus.var1();
    }

    public void a(List<h> list) {
        this.F = list;
    }

    protected void onStop() {
        this.H.remove((Overlay)this.I);
        0;
        this.J.a();
        this.K.register((Object)this.J);
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[llIIlIllI[0]];
        classArray[SquireCerberus.llIIlIllI[1]] = HandlingPrayerTask.class;
        classArray[SquireCerberus.llIIlIllI[2]] = DrinkingPrayerPotionTask.class;
        classArray[SquireCerberus.llIIlIllI[3]] = EatingFoodTask.class;
        classArray[SquireCerberus.llIIlIllI[4]] = MovingOffFireTask.class;
        classArray[SquireCerberus.llIIlIllI[5]] = AttackingCerberusTask.class;
        classArray[SquireCerberus.llIIlIllI[6]] = LootingItemsTask.class;
        classArray[SquireCerberus.llIIlIllI[7]] = TeleportingOutTask.class;
        classArray[SquireCerberus.llIIlIllI[8]] = EatingWildPieTask.class;
        classArray[SquireCerberus.llIIlIllI[9]] = WalkingToBankTask.class;
        classArray[SquireCerberus.llIIlIllI[10]] = BankingTask.class;
        classArray[SquireCerberus.llIIlIllI[11]] = CheckingStateTask.class;
        classArray[SquireCerberus.llIIlIllI[12]] = TraversingToCerberusTask.class;
        classArray[SquireCerberus.llIIlIllI[13]] = UsingThrallTask.class;
        classArray[SquireCerberus.llIIlIllI[14]] = HoppingWorldsTask.class;
        classArray[SquireCerberus.llIIlIllI[15]] = SpecialAttackTask.class;
        classArray[SquireCerberus.llIIlIllI[16]] = DrinkingBoostTask.class;
        classArray[SquireCerberus.llIIlIllI[17]] = ScatteringAshesTask.class;
        return classArray;
    }

    public List<h> p() {
        return this.F;
    }

    public SquireCerberus() {
        this.F = new ArrayList<h>();
    }

    private static boolean var16(Object object, Object object2) {
        return object != object2;
    }
}

