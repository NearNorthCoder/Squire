/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.EventBus
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.events.NpcLootReceived
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.ClientToolbar
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  net.unethicalite.api.game.Prices
 */
package gg.squire.vorkath;

import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import gg.squire.client.util.Log;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.ui.VorkathInfoBox;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.A;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.B;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.C;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.D;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.E;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.F;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.G;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.H;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.I;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.J;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.K;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.L;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.M;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.O;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.P;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.R;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.b;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.d;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.f;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.n;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.p;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.q;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.r;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.s;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.t;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.u;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.v;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.x;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.y;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.z;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.NpcLootReceived;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.ClientToolbar;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.game.Prices;

@PluginDescriptor(name="Squire Vorkath", description="Kills the big blue dragon", tags={"vorkath", "prayer", "bones"}, enabledByDefault=false)
@SquireUtil
public class SquireVorkathPlugin
extends SquirePlugin {
    private static /* synthetic */ String[] lIlIllIIIlllI;
    @Inject
    /* synthetic */ OverlayManager j;
    private /* synthetic */ int p;
    @Inject
    /* synthetic */ f h;
    @Inject
    private /* synthetic */ EventBus n;
    @Inject
    private /* synthetic */ VorkathInfoBox m;
    @Inject
    /* synthetic */ R k;
    private /* synthetic */ int s;
    private static /* synthetic */ int[] lIlIllIIIllll;
    private /* synthetic */ int q;
    @Inject
    /* synthetic */ d l;
    @Inject
    /* synthetic */ ClientToolbar i;
    private /* synthetic */ boolean o;
    private /* synthetic */ boolean r;

    @Subscribe
    public void a(NpcLootReceived npcLootReceived) {
        int n2 = npcLootReceived.getItems().stream().mapToInt(itemStack -> Prices.getItemPrice((int)itemStack.getId()) * itemStack.getQuantity()).sum();
        this.s += n2;
    }

    private static boolean llIIIIIIIllIlII(int n2) {
        return n2 != 0;
    }

    private static void llIIIIIIIllIIlI() {
        lIlIllIIIlllI = new String[lIlIllIIIllll[4]];
        SquireVorkathPlugin.lIlIllIIIlllI[SquireVorkathPlugin.lIlIllIIIllll[0]] = SquireVorkathPlugin."Your Vorkath kill count";
        SquireVorkathPlugin.lIlIllIIIlllI[SquireVorkathPlugin.lIlIllIIIllll[2]] = SquireVorkathPlugin."Oh dear, you are dead";
        SquireVorkathPlugin.lIlIllIIIlllI[SquireVorkathPlugin.lIlIllIIIllll[3]] = SquireVorkathPlugin."Died and no death handler just yet, so just stopping for now";
    }

    private static String llIIIIIIIllIIII(String var8, String var12) {
        var8 = new String(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var9 = var12.toCharArray();
        int var6 = lIlIllIIIllll[0];
        char[] var5 = var8.toCharArray();
        int var1 = var5.length;
        int var13 = lIlIllIIIllll[0];
        while (SquireVorkathPlugin.llIIIIIIIllIlIl(var13, var1)) {
            char var7 = var5[var13];
            var15.append((char)(var7 ^ var9[var6 % var9.length]));
            0;
            ++var6;
            ++var13;
            0;
            
            return null;
        }
        return String.valueOf(var15);
    }

    public int d() {
        return this.p;
    }

    public boolean f() {
        return this.r;
    }

    private static void llIIIIIIIllIIll() {
        lIlIllIIIllll = new int[28];
        SquireVorkathPlugin.lIlIllIIIllll[0] = (0x81 ^ 0xAD) & ~(0x69 ^ 0x45);
        SquireVorkathPlugin.lIlIllIIIllll[1] = 0xA9 ^ 0xB2;
        SquireVorkathPlugin.lIlIllIIIllll[2] = 1;
        SquireVorkathPlugin.lIlIllIIIllll[3] = 2;
        SquireVorkathPlugin.lIlIllIIIllll[4] = 3;
        SquireVorkathPlugin.lIlIllIIIllll[5] = 68 + 68 - 38 + 75 ^ 97 + 11 - -47 + 14;
        SquireVorkathPlugin.lIlIllIIIllll[6] = 148 + 76 - 131 + 84 ^ 126 + 163 - 135 + 26;
        SquireVorkathPlugin.lIlIllIIIllll[7] = 0xE ^ 8;
        SquireVorkathPlugin.lIlIllIIIllll[8] = 0xA5 ^ 0xA2;
        SquireVorkathPlugin.lIlIllIIIllll[9] = 0x4C ^ 0x6F ^ (0x75 ^ 0x5E);
        SquireVorkathPlugin.lIlIllIIIllll[10] = 20 + 117 - 82 + 83 ^ 58 + 77 - 53 + 49;
        SquireVorkathPlugin.lIlIllIIIllll[11] = 0x63 ^ 0x4D ^ (0x42 ^ 0x66);
        SquireVorkathPlugin.lIlIllIIIllll[12] = 0xAC ^ 0xA7;
        SquireVorkathPlugin.lIlIllIIIllll[13] = 0xB ^ 7;
        SquireVorkathPlugin.lIlIllIIIllll[14] = 0x58 ^ 0x55;
        SquireVorkathPlugin.lIlIllIIIllll[15] = 140 + 107 - 202 + 156 ^ 107 + 88 - 193 + 197;
        SquireVorkathPlugin.lIlIllIIIllll[16] = 0x11 ^ 0x1E;
        SquireVorkathPlugin.lIlIllIIIllll[17] = 75 + 129 - 141 + 70 ^ 116 + 15 - 107 + 125;
        SquireVorkathPlugin.lIlIllIIIllll[18] = 0x28 ^ 0x39;
        SquireVorkathPlugin.lIlIllIIIllll[19] = 0x6D ^ 0x7F;
        SquireVorkathPlugin.lIlIllIIIllll[20] = 106 + 89 - 145 + 97 ^ 89 + 86 - 55 + 8;
        SquireVorkathPlugin.lIlIllIIIllll[21] = 0xA8 ^ 0xBC;
        SquireVorkathPlugin.lIlIllIIIllll[22] = 0x18 ^ 0xD;
        SquireVorkathPlugin.lIlIllIIIllll[23] = 0x45 ^ 0x50 ^ 3;
        SquireVorkathPlugin.lIlIllIIIllll[24] = 0x39 ^ 0x2E;
        SquireVorkathPlugin.lIlIllIIIllll[25] = 68 + 106 - 22 + 24 ^ 148 + 144 - 232 + 108;
        SquireVorkathPlugin.lIlIllIIIllll[26] = 0x6C ^ 9 ^ (0x16 ^ 0x6A);
        SquireVorkathPlugin.lIlIllIIIllll[27] = 0xB2 ^ 0xA8;
    }

    public SquireVorkathPlugin() {
        this.p = lIlIllIIIllll[0];
        this.q = lIlIllIIIllll[0];
        this.r = lIlIllIIIllll[0];
        this.s = lIlIllIIIllll[0];
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lIlIllIIIllll[1]];
        classArray[SquireVorkathPlugin.lIlIllIIIllll[0]] = x.class;
        classArray[SquireVorkathPlugin.lIlIllIIIllll[2]] = A.class;
        classArray[SquireVorkathPlugin.lIlIllIIIllll[3]] = I.class;
        classArray[SquireVorkathPlugin.lIlIllIIIllll[4]] = G.class;
        classArray[SquireVorkathPlugin.lIlIllIIIllll[5]] = E.class;
        classArray[SquireVorkathPlugin.lIlIllIIIllll[6]] = H.class;
        classArray[SquireVorkathPlugin.lIlIllIIIllll[7]] = J.class;
        classArray[SquireVorkathPlugin.lIlIllIIIllll[8]] = F.class;
        classArray[SquireVorkathPlugin.lIlIllIIIllll[9]] = v.class;
        classArray[SquireVorkathPlugin.lIlIllIIIllll[10]] = B.class;
        classArray[SquireVorkathPlugin.lIlIllIIIllll[11]] = u.class;
        classArray[SquireVorkathPlugin.lIlIllIIIllll[12]] = L.class;
        classArray[SquireVorkathPlugin.lIlIllIIIllll[13]] = z.class;
        classArray[SquireVorkathPlugin.lIlIllIIIllll[14]] = y.class;
        classArray[SquireVorkathPlugin.lIlIllIIIllll[15]] = D.class;
        classArray[SquireVorkathPlugin.lIlIllIIIllll[16]] = C.class;
        classArray[SquireVorkathPlugin.lIlIllIIIllll[17]] = K.class;
        classArray[SquireVorkathPlugin.lIlIllIIIllll[18]] = P.class;
        classArray[SquireVorkathPlugin.lIlIllIIIllll[19]] = M.class;
        classArray[SquireVorkathPlugin.lIlIllIIIllll[20]] = b.class;
        classArray[SquireVorkathPlugin.lIlIllIIIllll[21]] = O.class;
        classArray[SquireVorkathPlugin.lIlIllIIIllll[22]] = n.class;
        classArray[SquireVorkathPlugin.lIlIllIIIllll[23]] = s.class;
        classArray[SquireVorkathPlugin.lIlIllIIIllll[24]] = t.class;
        classArray[SquireVorkathPlugin.lIlIllIIIllll[25]] = p.class;
        classArray[SquireVorkathPlugin.lIlIllIIIllll[26]] = q.class;
        classArray[SquireVorkathPlugin.lIlIllIIIllll[27]] = r.class;
        return classArray;
    }

    static {
        SquireVorkathPlugin.llIIIIIIIllIIll();
        SquireVorkathPlugin.llIIIIIIIllIIlI();
    }

    private static String llIIIIIIIllIIIl(String var11, String var2) {
        try {
            SecretKeySpec var10 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var14 = Cipher.getInstance("Blowfish");
            var14.init(lIlIllIIIllll[3], var10);
            return new String(var14.doFinal(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    protected void onStop() {
        this.j.remove((Overlay)this.k);
        0;
        this.j.remove((Overlay)this.m);
        0;
        this.n.unregister((Object)this.l);
        this.n.unregister((Object)this.h);
    }

    private static boolean llIIIIIIIllIlIl(int n2, int n3) {
        return n2 < n3;
    }

    protected void onStart() {
        this.a();
        this.j.add((Overlay)this.k);
        0;
        this.j.add((Overlay)this.m);
        0;
        this.h.a();
        this.n.register((Object)this.l);
        this.n.register((Object)this.h);
        this.o = lIlIllIIIllll[2];
    }

    public int g() {
        return this.s;
    }

    public void a(boolean bl) {
        this.o = bl;
    }

    @Provides
    SquireVorkathConfig a(ConfigManager configManager) {
        return (SquireVorkathConfig)configManager.getConfig(SquireVorkathConfig.class);
    }

    public void b(boolean bl) {
        this.r = bl;
    }

    public int e() {
        return this.q;
    }

    public boolean c() {
        return this.o;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var4;
        if (SquireVorkathPlugin.llIIIIIIIllIlII(chatMessage.getMessage().contains(lIlIllIIIlllI[lIlIllIIIllll[0]]) ? 1 : 0)) {
            this.q += lIlIllIIIllll[2];
        }
        if (SquireVorkathPlugin.llIIIIIIIllIlII(var4.getMessage().contains(lIlIllIIIlllI[lIlIllIIIllll[2]]) ? 1 : 0)) {
            SquireVorkathPlugin var3;
            var3.r = lIlIllIIIllll[2];
            Log.info((String)lIlIllIIIlllI[lIlIllIIIllll[3]]);
            var3.forceStop();
        }
    }

    private void a() {
        this.q = lIlIllIIIllll[0];
        this.o = lIlIllIIIllll[0];
        this.p = lIlIllIIIllll[0];
        this.r = lIlIllIIIllll[0];
        this.s = lIlIllIIIllll[0];
    }

    public R b() {
        return this.k;
    }
}

