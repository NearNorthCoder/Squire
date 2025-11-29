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
import i.i.b.s.c.q.r.s.s.-.u.a.e.TraversingToCerberusTask;
import i.i.b.s.c.q.r.s.s.-.u.a.e.a_Unknown;
import i.i.b.s.c.q.r.s.s.-.u.a.e.h_Unknown;
import i.i.b.s.c.q.r.s.s.-.u.a.e.DrinkingPrayerPotionTask;
import i.i.b.s.c.q.r.s.s.-.u.a.e.EatingWildPieTask;
import i.i.b.s.c.q.r.s.s.-.u.a.e.HoppingWorldsTask;
import i.i.b.s.c.q.r.s.s.-.u.a.e.CheckingStateTask;
import i.i.b.s.c.q.r.s.s.-.u.a.e.TeleportingOutTask;
import i.i.b.s.c.q.r.s.s.-.u.a.e.BankingTask;
import i.i.b.s.c.q.r.s.s.-.u.a.e.WalkingToBankTask;
import i.i.b.s.c.q.r.s.s.-.u.a.e.AttackingCerberusTask;
import i.i.b.s.c.q.r.s.s.-.u.a.e.DrinkingBoostTask;
import i.i.b.s.c.q.r.s.s.-.u.a.e.EatingFoodTask;
import i.i.b.s.c.q.r.s.s.-.u.a.e.HandlingPrayerTask;
import i.i.b.s.c.q.r.s.s.-.u.a.e.LootingItemsTask;
import i.i.b.s.c.q.r.s.s.-.u.a.e.MovingOffFireTask;
import i.i.b.s.c.q.r.s.s.-.u.a.e.ScatteringAshesTask;
import i.i.b.s.c.q.r.s.s.-.u.a.e.SpecialAttackTask;
import i.i.b.s.c.q.r.s.s.-.u.a.e.UsingThrallTask;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Base64;
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
    private static /* synthetic */ int[] llIIlIllI;
    private /* synthetic */ boolean M;
    /* synthetic */ List<h> F;
    @Inject
    private /* synthetic */ SquireCerberusConfig G;
    @Inject
    private /* synthetic */ CerberusOverlay I;
    private static /* synthetic */ String[] llIIlIlIl;
    @Inject
    private /* synthetic */ a J;
    @Inject
    private /* synthetic */ OverlayManager H;
    @Inject
    private /* synthetic */ EventBus K;
    private /* synthetic */ int L;
    @Inject
    private /* synthetic */ ItemManager w;

    private static void lIllIIIllIl() {
        llIIlIlIl = new String[llIIlIllI[2]];
        SquireCerberus.llIIlIlIl[SquireCerberus.llIIlIllI[1]] = SquireCerberus."Your Cerberus kill";
    }

    private static void lIllIIIlllI() {
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

    private static boolean lIllIIlIIII(int n2) {
        return n2 != 0;
    }

    public void b(boolean bl2) {
        this.M = bl2;
    }

    private static boolean lIllIIlIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIllIIIllII(String lIllIIllllIIIII, String lIllIIllllIIlII) {
        lIllIIllllIIIII = new String(Base64.getDecoder().decode(lIllIIllllIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIllIIllllIIIll = new StringBuilder();
        char[] lIllIIllllIIIlI = lIllIIllllIIlII.toCharArray();
        int lIllIIllllIIIIl = llIIlIllI[1];
        char[] lIllIIlllIllIll = lIllIIllllIIIII.toCharArray();
        int lIllIIlllIllIlI = lIllIIlllIllIll.length;
        int lIllIIlllIllIIl = llIIlIllI[1];
        while (SquireCerberus.lIllIIlIIIl(lIllIIlllIllIIl, lIllIIlllIllIlI)) {
            char lIllIIllllIIllI = lIllIIlllIllIll[lIllIIlllIllIIl];
            lIllIIllllIIIll.append((char)(lIllIIllllIIllI ^ lIllIIllllIIIlI[lIllIIllllIIIIl % lIllIIllllIIIlI.length]));
            0;
            ++lIllIIllllIIIIl;
            ++lIllIIlllIllIIl;
            0;
            if ((0x10 ^ 0x49 ^ (0xD1 ^ 0x8C)) > 0) continue;
            return null;
        }
        return String.valueOf(lIllIIllllIIIll);
    }

    @Subscribe
    public void a(LootReceived lootReceived) {
        lootReceived.getItems().forEach(itemStack -> {
            h h2 = new h();
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
        void lIllIIlllllIIlI;
        ChatMessageType chatMessageType = chatMessage.getType();
        if (SquireCerberus.lIllIIIllll(chatMessageType, ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        String lIllIIlllllIIII = lIllIIlllllIIlI.getMessage();
        if (SquireCerberus.lIllIIlIIII(lIllIIlllllIIII.contains(llIIlIlIl[llIIlIllI[1]]) ? 1 : 0)) {
            SquireCerberus lIllIIlllllIIll;
            lIllIIlllllIIll.b(lIllIIlllllIIll.q() + llIIlIllI[2]);
            lIllIIlllllIIll.J.a(llIIlIllI[2]);
        }
    }

    static {
        SquireCerberus.lIllIIIlllI();
        SquireCerberus.lIllIIIllIl();
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
        classArray[SquireCerberus.llIIlIllI[1]] = u.class;
        classArray[SquireCerberus.llIIlIllI[2]] = j.class;
        classArray[SquireCerberus.llIIlIllI[3]] = t.class;
        classArray[SquireCerberus.llIIlIllI[4]] = w.class;
        classArray[SquireCerberus.llIIlIllI[5]] = r.class;
        classArray[SquireCerberus.llIIlIllI[6]] = v.class;
        classArray[SquireCerberus.llIIlIllI[7]] = n.class;
        classArray[SquireCerberus.llIIlIllI[8]] = k.class;
        classArray[SquireCerberus.llIIlIllI[9]] = q.class;
        classArray[SquireCerberus.llIIlIllI[10]] = o.class;
        classArray[SquireCerberus.llIIlIllI[11]] = m.class;
        classArray[SquireCerberus.llIIlIllI[12]] = A.class;
        classArray[SquireCerberus.llIIlIllI[13]] = z.class;
        classArray[SquireCerberus.llIIlIllI[14]] = l.class;
        classArray[SquireCerberus.llIIlIllI[15]] = y.class;
        classArray[SquireCerberus.llIIlIllI[16]] = s.class;
        classArray[SquireCerberus.llIIlIllI[17]] = x.class;
        return classArray;
    }

    public List<h> p() {
        return this.F;
    }

    public SquireCerberus() {
        this.F = new ArrayList<h>();
    }

    private static boolean lIllIIIllll(Object object, Object object2) {
        return object != object2;
    }
}

