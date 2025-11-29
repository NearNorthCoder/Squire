/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.EventBus
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.events.NpcLootReceived
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  net.unethicalite.client.Static
 */
package gg.squire.zulrah;

import a.u.i.-.l.r.h.z.s.r.u.q.e.EquippingRecoilRingTask;
import a.u.i.-.l.r.h.z.s.r.u.q.e.PressingContinueTask;
import a.u.i.-.l.r.h.z.s.r.u.q.e.TurningOnRunTask;
import a.u.i.-.l.r.h.z.s.r.u.q.e.BankingTask;
import a.u.i.-.l.r.h.z.s.r.u.q.e.EnteringPortalTask;
import a.u.i.-.l.r.h.z.s.r.u.q.e.WalkingToBankTask;
import a.u.i.-.l.r.h.z.s.r.u.q.e.HandlingHouseTask;
import a.u.i.-.l.r.h.z.s.r.u.q.e.OpeningBankTask;
import a.u.i.-.l.r.h.z.s.r.u.q.e.TeleportingToZulandraTask;
import a.u.i.-.l.r.h.z.s.r.u.q.e.CollectingItemsTask;
import a.u.i.-.l.r.h.z.s.r.u.q.e.WalkingToBankDeathTask;
import a.u.i.-.l.r.h.z.s.r.u.q.e.GoingToZulrahDeathwalkTask;
import a.u.i.-.l.r.h.z.s.r.u.q.e.OpeningBankForZulrahTeleportTask;
import a.u.i.-.l.r.h.z.s.r.u.q.e.DetectingDeathTask;
import a.u.i.-.l.r.h.z.s.r.u.q.e.EquippingGearDeathwalkTask;
import a.u.i.-.l.r.h.z.s.r.u.q.e.WithdrawingTeleportTask;
import a.u.i.-.l.r.h.z.s.r.u.q.e.AttackingZulrahTask;
import a.u.i.-.l.r.h.z.s.r.u.q.e.DodgingMeleeTask;
import a.u.i.-.l.r.h.z.s.r.u.q.e.DrinkingPotionsTask;
import a.u.i.-.l.r.h.z.s.r.u.q.e.EatingTask;
import a.u.i.-.l.r.h.z.s.r.u.q.e.EatingForSpaceTask;
import a.u.i.-.l.r.h.z.s.r.u.q.e.EnablingSpecialTask;
import a.u.i.-.l.r.h.z.s.r.u.q.e.MovingToSafespotTask;
import a.u.i.-.l.r.h.z.s.r.u.q.e.PanicTpingTask;
import a.u.i.-.l.r.h.z.s.r.u.q.e.HandlingPrayersTask;
import a.u.i.-.l.r.h.z.s.r.u.q.e.SwappingGearTask;
import a.u.i.-.l.r.h.z.s.r.u.q.e.DisablingPrayersTask;
import a.u.i.-.l.r.h.z.s.r.u.q.e.LootingItemsTask;
import a.u.i.-.l.r.h.z.s.r.u.q.e.ReturningToZulandraTask;
import a.u.i.-.l.r.h.z.s.r.u.q.e.TeleportingOutTask;
import a.u.i.-.l.r.h.z.s.r.u.q.e.BoardingBoatTask;
import a.u.i.-.l.r.h.z.s.r.u.q.e.DrinkingPotionsTask;
import a.u.i.-.l.r.h.z.s.r.u.q.e.EquippingMageGearTask;
import a.u.i.-.l.r.h.z.s.r.u.q.e.UsingImbuedHeartTask;
import a.u.i.-.l.r.h.z.s.r.u.q.e.TeleportingToZulandraTask;
import a.u.i.-.l.r.h.z.s.r.u.q.e.TraversingToZulandraTask;
import a.u.i.-.l.r.h.z.s.r.u.q.e.PluginState;
import a.u.i.-.l.r.h.z.s.r.u.q.e.t_Unknown;
import a.u.i.-.l.r.h.z.s.r.u.q.e.v_Unknown;
import a.u.i.-.l.r.h.z.s.r.u.q.e.w_Unknown;
import a.u.i.-.l.r.h.z.s.r.u.q.e.x_Unknown;
import a.u.i.-.l.r.h.z.s.r.u.q.e.CuringVenomTask;
import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.zulrah.SquireZulrahConfig;
import gg.squire.zulrah.overlay.ZulrahInfoBox;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.ChatMessageType;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.NpcLootReceived;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.client.Static;

@PluginDescriptor(name="Squire Zulrah", description="Zulrah killing plugin", tags={"zulrah", "helper", "squire"}, enabledByDefault=false)
public class SquireZulrah
extends SquirePlugin {
    private /* synthetic */ int j;
    @Inject
    private /* synthetic */ OverlayManager c;
    private /* synthetic */ boolean m;
    private static /* synthetic */ String[] lIllIlllllIIl;
    private /* synthetic */ int k;
    private /* synthetic */ boolean l;
    private /* synthetic */ c i;
    @Inject
    private /* synthetic */ SquireZulrahConfig f;
    private static /* synthetic */ int[] lIllIlllllIlI;
    @Inject
    private /* synthetic */ EventBus b;
    @Inject
    private /* synthetic */ ZulrahInfoBox d;
    @Inject
    private /* synthetic */ w h;
    @Inject
    private /* synthetic */ x e;
    @Inject
    private /* synthetic */ t g;
    @Inject
    private /* synthetic */ v a;

    public int b() {
        return this.j;
    }

    private static void llIIlIIlllllIII() {
        lIllIlllllIIl = new String[lIllIlllllIlI[2]];
        SquireZulrah.lIllIlllllIIl[SquireZulrah.lIllIlllllIlI[1]] = SquireZulrah."Oh dear, you are dead!";
    }

    public void a(c c2) {
        this.i = c2;
    }

    public void a(int n2) {
        this.k = n2;
    }

    public c a() {
        return this.i;
    }

    protected void onStart() {
        this.a.T();
        this.l = lIllIlllllIlI[1];
        this.m = lIllIlllllIlI[1];
        this.i = a.u.i.-.l.r.h.z.s.r.u.q.e.PluginState.DONE;
        this.b.register((Object)this.a);
        this.c.add((Overlay)this.d);
        0;
        this.c.add((Overlay)this.h);
        0;
        this.c.add((Overlay)this.e);
        0;
        this.k = Static.getClient().getTickCount();
    }

    public boolean d() {
        return this.l;
    }

    public SquireZulrah() {
        this.i = a.u.i.-.l.r.h.z.s.r.u.q.e.PluginState.DONE;
    }

    private static String llIIlIIllllIlll(String var2, String var6) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var4 = Cipher.getInstance("Blowfish");
            var4.init(lIllIlllllIlI[3], var3);
            return new String(var4.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }

    protected void onStop() {
        this.b.unregister((Object)this.a);
        this.c.remove((Overlay)this.d);
        0;
        this.c.remove((Overlay)this.e);
        0;
        this.c.remove((Overlay)this.h);
        0;
    }

    private static boolean llIIlIIlllllIll(int n2) {
        return n2 == 0;
    }

    @Subscribe
    public void a(NpcLootReceived npcLootReceived) {
        this.m = lIllIlllllIlI[2];
    }

    @Provides
    SquireZulrahConfig a(ConfigManager configManager) {
        return (SquireZulrahConfig)configManager.getConfig(SquireZulrahConfig.class);
    }

    public void a(boolean bl) {
        this.l = bl;
    }

    public int c() {
        return this.k;
    }

    public boolean e() {
        return this.m;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var5;
        if (SquireZulrah.llIIlIIlllllIlI(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        String var1 = var5.getMessage();
        if (SquireZulrah.llIIlIIlllllIll(var1.equals(lIllIlllllIIl[lIllIlllllIlI[1]]) ? 1 : 0)) {
            return;
        }
        this.i = a.u.i.-.l.r.h.z.s.r.u.q.e.PluginState.BANKING;
        this.j += lIllIlllllIlI[2];
    }

    public void b(boolean bl) {
        this.m = bl;
    }

    static {
        SquireZulrah.llIIlIIlllllIIl();
        SquireZulrah.llIIlIIlllllIII();
    }

    private static void llIIlIIlllllIIl() {
        lIllIlllllIlI = new int[38];
        SquireZulrah.lIllIlllllIlI[0] = 0xBC ^ 0x9F ^ (0x7D ^ 0x7B);
        SquireZulrah.lIllIlllllIlI[1] = (0x1B ^ 0xC) & ~(0xB ^ 0x1C);
        SquireZulrah.lIllIlllllIlI[2] = 1;
        SquireZulrah.lIllIlllllIlI[3] = 2;
        SquireZulrah.lIllIlllllIlI[4] = 3;
        SquireZulrah.lIllIlllllIlI[5] = 0x2B ^ 0x2F;
        SquireZulrah.lIllIlllllIlI[6] = 2 ^ (0x4B ^ 0x4C);
        SquireZulrah.lIllIlllllIlI[7] = 0xAE ^ 0xBF ^ (0x7D ^ 0x6A);
        SquireZulrah.lIllIlllllIlI[8] = 0x71 ^ 0x76;
        SquireZulrah.lIllIlllllIlI[9] = 0x27 ^ 0x2F;
        SquireZulrah.lIllIlllllIlI[10] = 0x99 ^ 0x90;
        SquireZulrah.lIllIlllllIlI[11] = 0xB1 ^ 0xBB;
        SquireZulrah.lIllIlllllIlI[12] = 0x63 ^ 0x68;
        SquireZulrah.lIllIlllllIlI[13] = 0x76 ^ 0x7A;
        SquireZulrah.lIllIlllllIlI[14] = 0x65 ^ 0x28 ^ (0x14 ^ 0x54);
        SquireZulrah.lIllIlllllIlI[15] = 0x51 ^ 0x5F;
        SquireZulrah.lIllIlllllIlI[16] = 122 + 137 - 186 + 67 ^ 67 + 78 - 79 + 65;
        SquireZulrah.lIllIlllllIlI[17] = 3 ^ 0x13;
        SquireZulrah.lIllIlllllIlI[18] = 0x11 ^ 0;
        SquireZulrah.lIllIlllllIlI[19] = 0x4F ^ 0x5D;
        SquireZulrah.lIllIlllllIlI[20] = 0x50 ^ 0x43;
        SquireZulrah.lIllIlllllIlI[21] = 0x47 ^ 0x53;
        SquireZulrah.lIllIlllllIlI[22] = 0x18 ^ 0x40 ^ (0x64 ^ 0x29);
        SquireZulrah.lIllIlllllIlI[23] = 0x65 ^ 0x34 ^ (0xCE ^ 0x89);
        SquireZulrah.lIllIlllllIlI[24] = 0xA ^ 0x4A ^ (0xE0 ^ 0xB7);
        SquireZulrah.lIllIlllllIlI[25] = 0x9A ^ 0x82;
        SquireZulrah.lIllIlllllIlI[26] = 0x2F ^ 0x14 ^ (4 ^ 0x26);
        SquireZulrah.lIllIlllllIlI[27] = 0x33 ^ 0x29;
        SquireZulrah.lIllIlllllIlI[28] = 0xA2 ^ 0x80 ^ (0xE ^ 0x37);
        SquireZulrah.lIllIlllllIlI[29] = 0x4E ^ 0x52;
        SquireZulrah.lIllIlllllIlI[30] = 0xB1 ^ 0xAC;
        SquireZulrah.lIllIlllllIlI[31] = 117 + 42 - 77 + 90 ^ 150 + 146 - 233 + 115;
        SquireZulrah.lIllIlllllIlI[32] = 3 ^ 0x1C;
        SquireZulrah.lIllIlllllIlI[33] = 0x3E ^ 0x59 ^ (0x57 ^ 0x10);
        SquireZulrah.lIllIlllllIlI[34] = 0x61 ^ 0x40;
        SquireZulrah.lIllIlllllIlI[35] = 0x18 ^ 0x3A;
        SquireZulrah.lIllIlllllIlI[36] = 0xC3 ^ 0xAD ^ (0x30 ^ 0x7D);
        SquireZulrah.lIllIlllllIlI[37] = 0xD ^ 0x55 ^ (0x62 ^ 0x1E);
    }

    private static boolean llIIlIIlllllIlI(Object object, Object object2) {
        return object != object2;
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lIllIlllllIlI[0]];
        classArray[SquireZulrah.lIllIlllllIlI[1]] = B.class;
        classArray[SquireZulrah.lIllIlllllIlI[2]] = y.class;
        classArray[SquireZulrah.lIllIlllllIlI[3]] = A.class;
        classArray[SquireZulrah.lIllIlllllIlI[4]] = Z.class;
        classArray[SquireZulrah.lIllIlllllIlI[5]] = HandlingPrayersTask.class;
        classArray[SquireZulrah.lIllIlllllIlI[6]] = T.class;
        classArray[SquireZulrah.lIllIlllllIlI[7]] = U.class;
        classArray[SquireZulrah.lIllIlllllIlI[8]] = W.class;
        classArray[SquireZulrah.lIllIlllllIlI[9]] = V.class;
        classArray[SquireZulrah.lIllIlllllIlI[10]] = SwappingGearTask.class;
        classArray[SquireZulrah.lIllIlllllIlI[11]] = Y.class;
        classArray[SquireZulrah.lIllIlllllIlI[12]] = X.class;
        classArray[SquireZulrah.lIllIlllllIlI[13]] = DisablingPrayersTask.class;
        classArray[SquireZulrah.lIllIlllllIlI[14]] = LootingItemsTask.class;
        classArray[SquireZulrah.lIllIlllllIlI[15]] = TeleportingOutTask.class;
        classArray[SquireZulrah.lIllIlllllIlI[16]] = ReturningToZulandraTask.class;
        classArray[SquireZulrah.lIllIlllllIlI[17]] = BoardingBoatTask.class;
        classArray[SquireZulrah.lIllIlllllIlI[18]] = DrinkingPotionsTask.class;
        classArray[SquireZulrah.lIllIlllllIlI[19]] = EquippingMageGearTask.class;
        classArray[SquireZulrah.lIllIlllllIlI[20]] = UsingImbuedHeartTask.class;
        classArray[SquireZulrah.lIllIlllllIlI[21]] = D.class;
        classArray[SquireZulrah.lIllIlllllIlI[22]] = I.class;
        classArray[SquireZulrah.lIllIlllllIlI[23]] = J.class;
        classArray[SquireZulrah.lIllIlllllIlI[24]] = F.class;
        classArray[SquireZulrah.lIllIlllllIlI[25]] = G.class;
        classArray[SquireZulrah.lIllIlllllIlI[26]] = H.class;
        classArray[SquireZulrah.lIllIlllllIlI[27]] = M.class;
        classArray[SquireZulrah.lIllIlllllIlI[28]] = O.class;
        classArray[SquireZulrah.lIllIlllllIlI[29]] = L.class;
        classArray[SquireZulrah.lIllIlllllIlI[30]] = S.class;
        classArray[SquireZulrah.lIllIlllllIlI[31]] = N.class;
        classArray[SquireZulrah.lIllIlllllIlI[32]] = R.class;
        classArray[SquireZulrah.lIllIlllllIlI[33]] = TeleportingToZulandraTask.class;
        classArray[SquireZulrah.lIllIlllllIlI[34]] = TraversingToZulandraTask.class;
        classArray[SquireZulrah.lIllIlllllIlI[35]] = PanicTpingTask.class;
        classArray[SquireZulrah.lIllIlllllIlI[36]] = C.class;
        classArray[SquireZulrah.lIllIlllllIlI[37]] = Q.class;
        return classArray;
    }
}

