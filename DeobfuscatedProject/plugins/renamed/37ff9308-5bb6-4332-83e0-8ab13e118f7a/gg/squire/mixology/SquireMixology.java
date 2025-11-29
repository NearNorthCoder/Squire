/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.ConfigButtonClicked
 *  net.runelite.api.events.GameTick
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.EventBus
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 */
package gg.squire.mixology;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.mixology.SquireMixologyConfig;
import gg.squire.mixology.overlay.MixologyInfoBox;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.ConfigButtonClicked;
import net.runelite.api.events.GameTick;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import o.m.-.g.q.i.l.i.r.y.o.e.x.u.s.g_Unknown;
import o.m.-.g.q.i.l.i.r.y.o.e.x.u.s.BankForStaminasTask;
import o.m.-.g.q.i.l.i.r.y.o.e.x.u.s.DepositHopperTask;
import o.m.-.g.q.i.l.i.r.y.o.e.x.u.s.AgitatorTask;
import o.m.-.g.q.i.l.i.r.y.o.e.x.u.s.HandleAlembicTask;
import o.m.-.g.q.i.l.i.r.y.o.e.x.u.s.RetortTask;
import o.m.-.g.q.i.l.i.r.y.o.e.x.u.s.MakePasteTask;
import o.m.-.g.q.i.l.i.r.y.o.e.x.u.s.MixingVesselTask;
import o.m.-.g.q.i.l.i.r.y.o.e.x.u.s.OperateLeversTask;
import o.m.-.g.q.i.l.i.r.y.o.e.x.u.s.TalkToSupervisorTask;
import o.m.-.g.q.i.l.i.r.y.o.e.x.u.s.TurningInPotionTask;

@PluginDescriptor(name="Squire Mixology", enabledByDefault=false)
public class SquireMixology
extends SquirePlugin {
    public static /* synthetic */ int w;
    @Inject
    private /* synthetic */ g e;
    public static /* synthetic */ int r;
    public static /* synthetic */ String n;
    public static /* synthetic */ String m;
    public static /* synthetic */ String g;
    public static /* synthetic */ int i;
    public static /* synthetic */ long l;
    private static /* synthetic */ int[] lIIIIIIIIlIlI;
    public static /* synthetic */ int h;
    @Inject
    private /* synthetic */ SquireMixologyConfig c;
    public static /* synthetic */ int x;
    public static /* synthetic */ List<String> y;
    public static /* synthetic */ int t;
    @Inject
    private /* synthetic */ OverlayManager a;
    @Inject
    private /* synthetic */ MixologyInfoBox d;
    public static /* synthetic */ List<Integer> z;
    public static /* synthetic */ int u;
    public static /* synthetic */ int s;
    private static /* synthetic */ String[] lIIIIIIIIlIIl;
    public static /* synthetic */ int v;
    public static /* synthetic */ String f;
    public static /* synthetic */ String o;
    public static /* synthetic */ boolean A;
    public static /* synthetic */ String q;
    public static /* synthetic */ boolean j;
    @Inject
    private /* synthetic */ EventBus b;
    public static /* synthetic */ String p;
    public static /* synthetic */ boolean k;

    @Provides
    SquireMixologyConfig a(ConfigManager configManager) {
        return (SquireMixologyConfig)configManager.getConfig(SquireMixologyConfig.class);
    }

    private static boolean lIIlIllIIlIllll(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIlIllIIlIllII() {
        lIIIIIIIIlIlI = new int[21];
        SquireMixology.lIIIIIIIIlIlI[0] = 0x60 ^ 0x6A;
        SquireMixology.lIIIIIIIIlIlI[1] = (0x6D ^ 0x2D) & ~(0xF2 ^ 0xB2);
        SquireMixology.lIIIIIIIIlIlI[2] = 1;
        SquireMixology.lIIIIIIIIlIlI[3] = 2;
        SquireMixology.lIIIIIIIIlIlI[4] = 3;
        SquireMixology.lIIIIIIIIlIlI[5] = 0x9F ^ 0x9B;
        SquireMixology.lIIIIIIIIlIlI[6] = 0x2B ^ 0x2E;
        SquireMixology.lIIIIIIIIlIlI[7] = 0xA1 ^ 0x8F ^ (0x70 ^ 0x58);
        SquireMixology.lIIIIIIIIlIlI[8] = 0x2A ^ 0x2D;
        SquireMixology.lIIIIIIIIlIlI[9] = 0x75 ^ 0x3F ^ (0x7D ^ 0x3F);
        SquireMixology.lIIIIIIIIlIlI[10] = 0x3D ^ 0x5D ^ (0xF7 ^ 0x9E);
        SquireMixology.lIIIIIIIIlIlI[11] = -1;
        SquireMixology.lIIIIIIIIlIlI[12] = 15 + 18 - 30 + 188 ^ 97 + 143 - 179 + 119;
        SquireMixology.lIIIIIIIIlIlI[13] = 94 + 86 - 147 + 156 ^ 175 + 87 - 128 + 43;
        SquireMixology.lIIIIIIIIlIlI[14] = 36 + 34 - -43 + 87 ^ 133 + 26 - 120 + 158;
        SquireMixology.lIIIIIIIIlIlI[15] = 0x3D ^ 0x33;
        SquireMixology.lIIIIIIIIlIlI[16] = 0xC0 ^ 0xC4 ^ (0x8D ^ 0x86);
        SquireMixology.lIIIIIIIIlIlI[17] = 0x4D ^ 0x45 ^ (0x5F ^ 0x47);
        SquireMixology.lIIIIIIIIlIlI[18] = 0x6A ^ 0x7B;
        SquireMixology.lIIIIIIIIlIlI[19] = 0x50 ^ 0x42;
        SquireMixology.lIIIIIIIIlIlI[20] = 0x62 ^ 0x6C ^ (0xD ^ 0x10);
    }

    private static String lIIlIllIIlIlIIl(String var9, String var21) {
        var9 = new String(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var11 = new StringBuilder();
        char[] var7 = var21.toCharArray();
        int var13 = lIIIIIIIIlIlI[1];
        char[] var19 = var9.toCharArray();
        int var12 = var19.length;
        int var16 = lIIIIIIIIlIlI[1];
        while (SquireMixology.lIIlIllIIlIllll(var16, var12)) {
            char var15 = var19[var16];
            var11.append((char)(var15 ^ var7[var13 % var7.length]));
            0;
            ++var13;
            ++var16;
            0;
            if (-1 == -1) continue;
            return null;
        }
        return String.valueOf(var11);
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ConfigButtonClicked configButtonClicked) {
        void var10;
        if (SquireMixology.lIIlIllIIlIllIl(configButtonClicked.getGroup().equals(lIIIIIIIIlIIl[lIIIIIIIIlIlI[6]]) ? 1 : 0)) {
            return;
        }
        if (SquireMixology.lIIlIllIIlIlllI(var10.getKey().equals(lIIIIIIIIlIIl[lIIIIIIIIlIlI[7]]) ? 1 : 0)) {
            boolean bl;
            SquireMixology var2;
            if (SquireMixology.lIIlIllIIlIllIl(var2.isPaused() ? 1 : 0)) {
                bl = lIIIIIIIIlIlI[2];
                0;
                if (-1 > 3) {
                    return;
                }
            } else {
                bl = lIIIIIIIIlIlI[1];
            }
            var2.setPaused(bl);
        }
    }

    private static boolean lIIlIllIIlIlllI(int n2) {
        return n2 != 0;
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lIIIIIIIIlIlI[0]];
        classArray[SquireMixology.lIIIIIIIIlIlI[1]] = i.class;
        classArray[SquireMixology.lIIIIIIIIlIlI[2]] = m.class;
        classArray[SquireMixology.lIIIIIIIIlIlI[3]] = p.class;
        classArray[SquireMixology.lIIIIIIIIlIlI[4]] = o.class;
        classArray[SquireMixology.lIIIIIIIIlIlI[5]] = n.class;
        classArray[SquireMixology.lIIIIIIIIlIlI[6]] = k.class;
        classArray[SquireMixology.lIIIIIIIIlIlI[7]] = l.class;
        classArray[SquireMixology.lIIIIIIIIlIlI[8]] = j.class;
        classArray[SquireMixology.lIIIIIIIIlIlI[9]] = q.class;
        classArray[SquireMixology.lIIIIIIIIlIlI[10]] = h.class;
        return classArray;
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
    }

    private static boolean lIIlIllIIlIllIl(int n2) {
        return n2 == 0;
    }

    private static void lIIlIllIIlIlIll() {
        lIIIIIIIIlIIl = new String[lIIIIIIIIlIlI[20]];
        SquireMixology.lIIIIIIIIlIIl[SquireMixology.lIIIIIIIIlIlI[1]] = SquireMixology."Plugin started";
        SquireMixology.lIIIIIIIIlIIl[SquireMixology.lIIIIIIIIlIlI[2]] = SquireMixology."Empty";
        SquireMixology.lIIIIIIIIlIIl[SquireMixology.lIIIIIIIIlIlI[3]] = SquireMixology."Empty";
        SquireMixology.lIIIIIIIIlIIl[SquireMixology.lIIIIIIIIlIlI[4]] = SquireMixology."Empty";
        SquireMixology.lIIIIIIIIlIIl[SquireMixology.lIIIIIIIIlIlI[5]] = SquireMixology."Empty";
        SquireMixology.lIIIIIIIIlIIl[SquireMixology.lIIIIIIIIlIlI[6]] = SquireMixology."squiremixology";
        SquireMixology.lIIIIIIIIlIIl[SquireMixology.lIIIIIIIIlIlI[7]] = SquireMixology."pause";
        SquireMixology.lIIIIIIIIlIIl[SquireMixology.lIIIIIIIIlIlI[8]] = SquireMixology."You are rewarded";
        SquireMixology.lIIIIIIIIlIIl[SquireMixology.lIIIIIIIIlIlI[9]] = SquireMixology."Reset potion orders";
        SquireMixology.lIIIIIIIIlIIl[SquireMixology.lIIIIIIIIlIlI[10]] = SquireMixology."Empty";
        SquireMixology.lIIIIIIIIlIIl[SquireMixology.lIIIIIIIIlIlI[0]] = SquireMixology."Empty";
        SquireMixology.lIIIIIIIIlIIl[SquireMixology.lIIIIIIIIlIlI[12]] = SquireMixology."Empty";
        SquireMixology.lIIIIIIIIlIIl[SquireMixology.lIIIIIIIIlIlI[13]] = SquireMixology."Empty";
        SquireMixology.lIIIIIIIIlIIl[SquireMixology.lIIIIIIIIlIlI[14]] = SquireMixology."1.00";
        SquireMixology.lIIIIIIIIlIIl[SquireMixology.lIIIIIIIIlIlI[15]] = SquireMixology."Empty";
        SquireMixology.lIIIIIIIIlIIl[SquireMixology.lIIIIIIIIlIlI[16]] = SquireMixology."Empty";
        SquireMixology.lIIIIIIIIlIIl[SquireMixology.lIIIIIIIIlIlI[17]] = SquireMixology."Empty";
        SquireMixology.lIIIIIIIIlIIl[SquireMixology.lIIIIIIIIlIlI[18]] = SquireMixology."Empty";
        SquireMixology.lIIIIIIIIlIIl[SquireMixology.lIIIIIIIIlIlI[19]] = SquireMixology."Aga";
    }

    protected void onStop() {
        this.a.remove((Overlay)this.e);
        0;
        this.a.remove((Overlay)this.d);
        0;
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        String string = chatMessage.getMessage();
        if (SquireMixology.lIIlIllIIlIlllI(string.contains(lIIIIIIIIlIIl[lIIIIIIIIlIlI[8]]) ? 1 : 0)) {
            System.out.println(lIIIIIIIIlIIl[lIIIIIIIIlIlI[9]]);
            m = lIIIIIIIIlIIl[lIIIIIIIIlIlI[10]];
            o = lIIIIIIIIlIIl[lIIIIIIIIlIlI[0]];
            n = lIIIIIIIIlIIl[lIIIIIIIIlIlI[12]];
            p = lIIIIIIIIlIIl[lIIIIIIIIlIlI[13]];
            r = lIIIIIIIIlIlI[11];
            A = lIIIIIIIIlIlI[1];
            k = lIIIIIIIIlIlI[1];
            u = lIIIIIIIIlIlI[2];
            v = lIIIIIIIIlIlI[2];
            w = lIIIIIIIIlIlI[2];
            s = lIIIIIIIIlIlI[11];
            t = lIIIIIIIIlIlI[11];
            x = lIIIIIIIIlIlI[11];
            Integer[] integerArray = new Integer[lIIIIIIIIlIlI[4]];
            integerArray[SquireMixology.lIIIIIIIIlIlI[1]] = lIIIIIIIIlIlI[11];
            integerArray[SquireMixology.lIIIIIIIIlIlI[2]] = lIIIIIIIIlIlI[11];
            integerArray[SquireMixology.lIIIIIIIIlIlI[3]] = lIIIIIIIIlIlI[11];
            z = new ArrayList<Integer>(Arrays.asList(integerArray));
            String[] stringArray = new String[lIIIIIIIIlIlI[4]];
            stringArray[SquireMixology.lIIIIIIIIlIlI[1]] = null;
            stringArray[SquireMixology.lIIIIIIIIlIlI[2]] = null;
            stringArray[SquireMixology.lIIIIIIIIlIlI[3]] = null;
            y = new ArrayList<String>(Arrays.asList(stringArray));
        }
    }

    static {
        SquireMixology.lIIlIllIIlIllII();
        SquireMixology.lIIlIllIIlIlIll();
        f = lIIIIIIIIlIIl[lIIIIIIIIlIlI[14]];
        l = System.currentTimeMillis();
        m = lIIIIIIIIlIIl[lIIIIIIIIlIlI[15]];
        n = lIIIIIIIIlIIl[lIIIIIIIIlIlI[16]];
        o = lIIIIIIIIlIIl[lIIIIIIIIlIlI[17]];
        p = lIIIIIIIIlIIl[lIIIIIIIIlIlI[18]];
        q = lIIIIIIIIlIIl[lIIIIIIIIlIlI[19]];
        r = lIIIIIIIIlIlI[11];
        s = lIIIIIIIIlIlI[11];
        t = lIIIIIIIIlIlI[11];
        u = lIIIIIIIIlIlI[2];
        v = lIIIIIIIIlIlI[2];
        w = lIIIIIIIIlIlI[2];
        x = lIIIIIIIIlIlI[11];
        String[] stringArray = new String[lIIIIIIIIlIlI[4]];
        stringArray[SquireMixology.lIIIIIIIIlIlI[1]] = null;
        stringArray[SquireMixology.lIIIIIIIIlIlI[2]] = null;
        stringArray[SquireMixology.lIIIIIIIIlIlI[3]] = null;
        y = new ArrayList<String>(Arrays.asList(stringArray));
        Integer[] integerArray = new Integer[lIIIIIIIIlIlI[4]];
        integerArray[SquireMixology.lIIIIIIIIlIlI[1]] = lIIIIIIIIlIlI[11];
        integerArray[SquireMixology.lIIIIIIIIlIlI[2]] = lIIIIIIIIlIlI[11];
        integerArray[SquireMixology.lIIIIIIIIlIlI[3]] = lIIIIIIIIlIlI[11];
        z = new ArrayList<Integer>(Arrays.asList(integerArray));
    }

    protected void onStart() {
        this.a.add((Overlay)this.e);
        0;
        this.a.add((Overlay)this.d);
        0;
        System.out.println(lIIIIIIIIlIIl[lIIIIIIIIlIlI[1]]);
        m = lIIIIIIIIlIIl[lIIIIIIIIlIlI[2]];
        r = lIIIIIIIIlIlI[11];
        A = lIIIIIIIIlIlI[1];
        k = lIIIIIIIIlIlI[1];
        u = lIIIIIIIIlIlI[2];
        v = lIIIIIIIIlIlI[2];
        w = lIIIIIIIIlIlI[2];
        o = lIIIIIIIIlIIl[lIIIIIIIIlIlI[3]];
        n = lIIIIIIIIlIIl[lIIIIIIIIlIlI[4]];
        p = lIIIIIIIIlIIl[lIIIIIIIIlIlI[5]];
        s = lIIIIIIIIlIlI[11];
        t = lIIIIIIIIlIlI[11];
        x = lIIIIIIIIlIlI[11];
        Integer[] integerArray = new Integer[lIIIIIIIIlIlI[4]];
        integerArray[SquireMixology.lIIIIIIIIlIlI[1]] = lIIIIIIIIlIlI[11];
        integerArray[SquireMixology.lIIIIIIIIlIlI[2]] = lIIIIIIIIlIlI[11];
        integerArray[SquireMixology.lIIIIIIIIlIlI[3]] = lIIIIIIIIlIlI[11];
        z = new ArrayList<Integer>(Arrays.asList(integerArray));
        String[] stringArray = new String[lIIIIIIIIlIlI[4]];
        stringArray[SquireMixology.lIIIIIIIIlIlI[1]] = null;
        stringArray[SquireMixology.lIIIIIIIIlIlI[2]] = null;
        stringArray[SquireMixology.lIIIIIIIIlIlI[3]] = null;
        y = new ArrayList<String>(Arrays.asList(stringArray));
        j = lIIIIIIIIlIlI[1];
        r = lIIIIIIIIlIlI[11];
        l = System.currentTimeMillis();
        h = lIIIIIIIIlIlI[1];
        MixologyInfoBox.D = lIIIIIIIIlIlI[1];
        MixologyInfoBox.F = lIIIIIIIIlIlI[1];
        MixologyInfoBox.E = lIIIIIIIIlIlI[1];
    }

    private static String lIIlIllIIlIlIII(String var20, String var5) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var17 = Cipher.getInstance("Blowfish");
            var17.init(lIIIIIIIIlIlI[3], var4);
            return new String(var17.doFinal(Base64.getDecoder().decode(var20.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    private static String lIIlIllIIlIlIlI(String var6, String var8) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var8.getBytes(StandardCharsets.UTF_8)), lIIIIIIIIlIlI[9]), "DES");
            Cipher var18 = Cipher.getInstance("DES");
            var18.init(lIIIIIIIIlIlI[3], var3);
            return new String(var18.doFinal(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }
}

