package gg.squire.account;

import com.google.inject.Provides;
import gg.squire.account.GodsApi.overlay.BuilderInfoBox;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Prayer;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameTick;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.events.LoginStateChanged;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.plugins.Script;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.client.Static;
import org.pf4j.Extension;
import p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C0004e;
import p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C0019t;
import p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C0023x;
import p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C0025z;
import p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.G;
import p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.L;
import p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.U;
import p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab;
import p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.aq;
import p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.as;
@Extension
@PluginDescriptor(name = "Squire GWD Builder", enabledByDefault = false)
@SquireUtil
/* loaded from: 7ff08cb7-2eac-4b0f-b288-ca118289a708.jar:gg/squire/account/AccBuilderGWD.class */
public class AccBuilderGWD extends Script {
    private static /* synthetic */ String[] llIlIIIlI;
    @Inject
    public /* synthetic */ BuilderConfig r;
    static /* synthetic */ String p;
    public static /* synthetic */ String j;
    public static /* synthetic */ List<ab> a;
    public static /* synthetic */ long g;
    static /* synthetic */ int o;
    public static /* synthetic */ int f;
    public static /* synthetic */ String k;
    private static /* synthetic */ ab[] q;
    public static /* synthetic */ boolean d;
    /* synthetic */ boolean u;
    public static /* synthetic */ String c;
    private static /* synthetic */ int[] llIlIIIll;
    public static /* synthetic */ String m;
    @Inject
    private /* synthetic */ Client v;
    @Inject
    private /* synthetic */ BuilderInfoBox x;
    public static /* synthetic */ HashMap<WorldPoint, Integer> i;
    public static /* synthetic */ boolean n;
    @Inject
    private /* synthetic */ OverlayManager w;
    public static /* synthetic */ String h;
    public static /* synthetic */ boolean e;
    public static /* synthetic */ long b;
    public static /* synthetic */ String l;
    /* synthetic */ WorldArea s = new WorldArea(llIlIIIll[0], llIlIIIll[1], llIlIIIll[2], llIlIIIll[3], llIlIIIll[4]);
    /* synthetic */ String t = llIlIIIlI[llIlIIIll[4]];

    private static boolean lIllIIIllIII(int i2, int i3) {
        return i2 < i3;
    }

    private static void lIllIIIIlIlI() {
        llIlIIIlI = new String[llIlIIIll[63]];
        llIlIIIlI[llIlIIIll[4]] = lIllIIIIIlll("ltEDUF3hxerz9sFP8a2SgYllXsxTjOqTNv9xUIeRuz5rI420aed7Q07t5UfGxabtkgQmxTNzm+rGcqdmiSREec8ukfLl73IDdYQCIkjOk2wiXtAjBCjAa8ujBWyCbntDNtuVHOS5oax2Gcktl7zJ+KNqb/Ks9EqU1lUSq9Y1bwc=", "usYSa");
        llIlIIIlI[llIlIIIll[5]] = lIllIIIIlIII("PyM2CSY=", "NVSzR");
        llIlIIIlI[llIlIIIll[9]] = lIllIIIIlIIl("aeXUIlCbf1seJespf7msuVnP8G2/hx0O", "HPzPs");
        llIlIIIlI[llIlIIIll[10]] = lIllIIIIlIII("KAgQESUHHQ8WJUYdCVgFIw==", "fifxB");
        llIlIIIlI[llIlIIIll[11]] = lIllIIIIlIIl("HTuYW+VJkf6x/aFPBaDtr2/NRdAO7KFV", "VVZoW");
        llIlIIIlI[llIlIIIll[13]] = lIllIIIIIlll("l+4X+bGJ6YX9Lro7YQOhUNsiOvn3KPPm5284+pMd3Zw=", "RKcew");
        llIlIIIlI[llIlIIIll[14]] = lIllIIIIlIII("ESQVWQ8VMA==", "vSqyn");
        llIlIIIlI[llIlIIIll[15]] = lIllIIIIlIIl("zM1WYGyMUFlwxxZ7eAooz4Fmiyks613daKitrcP7clE=", "rcdwx");
        llIlIIIlI[llIlIIIll[16]] = lIllIIIIlIII("KyAOIDAqKAkgMzE=", "COaTV");
        llIlIIIlI[llIlIIIll[17]] = lIllIIIIlIII("FhcHJisWHQ==", "syfDG");
        llIlIIIlI[llIlIIIll[18]] = lIllIIIIIlll("mtSx4jk8DuM=", "Ypjyk");
        llIlIIIlI[llIlIIIll[19]] = lIllIIIIlIIl("bbcVMsdXsv2qI82z2wSh24VJrlWV7DRIieq28FAlCMY=", "oXxmB");
        llIlIIIlI[llIlIIIll[23]] = lIllIIIIlIIl("qGuMxDuS41bhzslD7ibXbQ==", "olqTK");
        llIlIIIlI[llIlIIIll[24]] = lIllIIIIlIIl("7ZhxnxuUQng1eUuS+Wf1XDHreJLghEZe", "OnDLp");
        llIlIIIlI[llIlIIIll[25]] = lIllIIIIlIII("KEo4DB1pCTocDw==", "IjVij");
        llIlIIIlI[llIlIIIll[26]] = lIllIIIIlIIl("EXAdjyxv1Db23ecTVFAYK66iYmCqIZuy", "LQiWJ");
        llIlIIIlI[llIlIIIll[27]] = lIllIIIIlIII("OjMgET8yNm4EN3c1KwR4OituAzc5", "WRNpX");
        llIlIIIlI[llIlIIIll[32]] = lIllIIIIlIIl("W8FPvMxyPspAVE4S8rn0HA==", "muKqp");
        llIlIIIlI[llIlIIIll[33]] = lIllIIIIIlll("ZAL+gjf0MZHfrQ3/b4xAd1ofyvnq7og+", "WPRpo");
        llIlIIIlI[llIlIIIll[34]] = lIllIIIIlIII("NhwCO2YRVBAgLAdUFCotDlkEOiAQEAYrYRERAD0kFlQCIzMLEws7", "btcOA");
        llIlIIIlI[llIlIIIll[20]] = lIllIIIIIlll("m3XeC2OAep9RF6fyte1WQ6qHu7Fde33D0b02ud9PP+ehJypBYrdbVQ==", "lUZWR");
        llIlIIIlI[llIlIIIll[35]] = lIllIIIIlIIl("9dsC4YybNUy/uikhG6+sstfYvLEreNK+", "piBkd");
        llIlIIIlI[llIlIIIll[36]] = lIllIIIIlIII("IQQdWgYBBBwdC08MBhYHTw0GCEMNHhATDQg=", "okizc");
        llIlIIIlI[llIlIIIll[37]] = lIllIIIIIlll("OxVinlUo/b8LF9l1/Y0OvFVHc+ojErw0", "RZjzH");
        llIlIIIlI[llIlIIIll[38]] = lIllIIIIlIIl("iQU8Aa7t5wIHtfCs+YHyUA==", "jPwmV");
        llIlIIIlI[llIlIIIll[39]] = lIllIIIIlIIl("tgbxO8m0fuXiUr2jFgOHOeb+kS4A59PdzBF0Pi9tSLjP48Oh2hwZfXWobOwcGw0pAZmPDdQAgN6ZzbOMhttek77eDlXHNhee9Z06tH6nGb43nbojCiYl8w==", "cqPHE");
        llIlIIIlI[llIlIIIll[40]] = lIllIIIIIlll("DVDsdyd1/+17aliBZx25t57ZoNrOXW52wX1GP/BX4C6fC5Eo3X8yCx88MjKoPyLvirHr2IlREP5nvOTQahRPEECXGIiSTKBeqfte+GNGrbqSNstFxQjw++M4eV84D5Glojr8rBIHhLFly+6D5Yj125jwNPEooEO4MC+jjIkSKw0=", "PobMX");
        llIlIIIlI[llIlIIIll[30]] = lIllIIIIlIIl("O6ff/IgO39UyZU4FSNUhdjPZOEf9zr0w", "GYmSB");
        llIlIIIlI[llIlIIIll[41]] = lIllIIIIlIII("PD0mKA==", "xRIZc");
        llIlIIIlI[llIlIIIll[42]] = lIllIIIIlIII("MAIfMw==", "tmpAT");
        llIlIIIlI[llIlIIIll[43]] = lIllIIIIIlll("GVPOIJyKxlE=", "zeKRT");
        llIlIIIlI[llIlIIIll[44]] = lIllIIIIlIII("BxwuFVEXASQC", "SnKpq");
        llIlIIIlI[llIlIIIll[45]] = lIllIIIIIlll("ZdXY28yFHfoJ5JS3LZgYIw==", "tJQtt");
        llIlIIIlI[llIlIIIll[31]] = lIllIIIIlIIl("6GSpAg1oi+g=", "cOSka");
        llIlIIIlI[llIlIIIll[46]] = lIllIIIIIlll("wSLplUTw/3JfXKY9U24org0OuOm/DSdn", "oxySO");
        llIlIIIlI[llIlIIIll[49]] = lIllIIIIIlll("DB+Uhi+WGmgx6bsXSgHKtyJdRZ2FV5ir", "rrbXR");
        llIlIIIlI[llIlIIIll[51]] = lIllIIIIlIII("PT8oKQ==", "yMGYs");
        llIlIIIlI[llIlIIIll[52]] = lIllIIIIIlll("OUpEnhvHCdk=", "bpnhH");
        llIlIIIlI[llIlIIIll[53]] = lIllIIIIlIII("OBo5GS8UCA==", "zoKwF");
        llIlIIIlI[llIlIIIll[54]] = lIllIIIIIlll("VqIA7O4Fy/I=", "YjFuO");
        llIlIIIlI[llIlIIIll[55]] = lIllIIIIlIII("AgUnCyE=", "VwHgM");
        llIlIIIlI[llIlIIIll[56]] = lIllIIIIIlll("WucLkSih1Zw=", "cVLbM");
        llIlIIIlI[llIlIIIll[57]] = lIllIIIIlIIl("4mgm6b+A6/NSXIb2tbeVVg==", "pwxeK");
        llIlIIIlI[llIlIIIll[58]] = lIllIIIIIlll("fS9FKHmNgHw=", "ohUgh");
        llIlIIIlI[llIlIIIll[59]] = lIllIIIIlIIl("pGKavzMO5TI=", "iRaGu");
        llIlIIIlI[llIlIIIll[60]] = lIllIIIIlIIl("tiyXIy15270=", "lATyq");
        llIlIIIlI[llIlIIIll[61]] = lIllIIIIlIIl("erh5UQ55DM0=", "NuOAs");
        llIlIIIlI[llIlIIIll[62]] = lIllIIIIlIIl("uoFOIp8hunM=", "PkdhC");
    }

    private static String lIllIIIIIlll(String lIIllIllIlIllI, String lIIllIllIlIlIl) {
        try {
            SecretKeySpec lIIllIllIllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIllIllIlIlIl.getBytes(StandardCharsets.UTF_8)), llIlIIIll[16]), "DES");
            Cipher lIIllIllIllIII = Cipher.getInstance("DES");
            lIIllIllIllIII.init(llIlIIIll[9], lIIllIllIllIIl);
            return new String(lIIllIllIllIII.doFinal(Base64.getDecoder().decode(lIIllIllIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIllIllIlIlll) {
            lIIllIllIlIlll.printStackTrace();
            return null;
        }
    }

    private static void lIllIIIIlIll() {
        llIlIIIll = new int[64];
        llIlIIIll[0] = (-20945) & 24055;
        llIlIIIll[1] = (-491) & 4090;
        llIlIIIll[2] = (159 ^ 188) ^ (142 ^ 147);
        llIlIIIll[3] = (((99 + 188) - 160) + 119) ^ (((154 + 61) - 98) + 78);
        llIlIIIll[4] = ((((89 + 94) - 89) + 40) ^ (((95 + 3) - 97) + 185)) & (((66 ^ 29) ^ (103 ^ 4)) ^ (-" ".length()));
        llIlIIIll[5] = " ".length();
        llIlIIIll[6] = (63 ^ 67) ^ (109 ^ 117);
        llIlIIIll[7] = (-11331) & 11611;
        llIlIIIll[8] = (-((-25490) & 27543)) & (-8193) & 11245;
        llIlIIIll[9] = "  ".length();
        llIlIIIll[10] = "   ".length();
        llIlIIIll[11] = 152 ^ 156;
        llIlIIIll[12] = (-((-3110) & 15783)) & (-7) & 13279;
        llIlIIIll[13] = 21 ^ 16;
        llIlIIIll[14] = 49 ^ 55;
        llIlIIIll[15] = (2 ^ 86) ^ (198 ^ 149);
        llIlIIIll[16] = 142 ^ 134;
        llIlIIIll[17] = 37 ^ 44;
        llIlIIIll[18] = (80 ^ 106) ^ (138 ^ 186);
        llIlIIIll[19] = 28 ^ 23;
        llIlIIIll[20] = 191 ^ 171;
        llIlIIIll[21] = (-30178) & 30713;
        llIlIIIll[22] = (-1) & 537;
        llIlIIIll[23] = (((96 + 30) - 3) + 67) ^ (((137 + 67) - 168) + 142);
        llIlIIIll[24] = (160 ^ 189) ^ (144 ^ 128);
        llIlIIIll[25] = (68 ^ 33) ^ (211 ^ 184);
        llIlIIIll[26] = (((105 + 123) - 129) + 33) ^ (((28 + 133) - 26) + 4);
        llIlIIIll[27] = 57 ^ 41;
        llIlIIIll[28] = (-25991) & 28591;
        llIlIIIll[29] = (-24871) & 28135;
        llIlIIIll[30] = (64 ^ 28) ^ (126 ^ 57);
        llIlIIIll[31] = (162 ^ 164) ^ (168 ^ 143);
        llIlIIIll[32] = (105 ^ 54) ^ (229 ^ 171);
        llIlIIIll[33] = (198 ^ 181) ^ (80 ^ 49);
        llIlIIIll[34] = 129 ^ 146;
        llIlIIIll[35] = 60 ^ 41;
        llIlIIIll[36] = 185 ^ 175;
        llIlIIIll[37] = 42 ^ 61;
        llIlIIIll[38] = 47 ^ 55;
        llIlIIIll[39] = 131 ^ 154;
        llIlIIIll[40] = (((124 + 37) - 132) + 131) ^ (((146 + 45) - 142) + 137);
        llIlIIIll[41] = 49 ^ 45;
        llIlIIIll[42] = (82 ^ 10) ^ (245 ^ 176);
        llIlIIIll[43] = (((9 + 94) - 49) + 82) ^ (((72 + 114) - 110) + 74);
        llIlIIIll[44] = 83 ^ 76;
        llIlIIIll[45] = (125 ^ 41) ^ (192 ^ 180);
        llIlIIIll[46] = 153 ^ 187;
        llIlIIIll[47] = (-((-4777) & 30379)) & (-4169) & 32747;
        llIlIIIll[48] = (-((-17) & 25169)) & (-17) & 28407;
        llIlIIIll[49] = (((7 + 80) - 57) + 129) ^ (((183 + 125) - 279) + 159);
        llIlIIIll[50] = (-((-27329) & 31441)) & (-16449) & 20991;
        llIlIIIll[51] = (((84 + 121) - 139) + 122) ^ (((40 + 75) - 40) + 77);
        llIlIIIll[52] = (((81 + 16) - (-125)) + 4) ^ (((41 + 93) - 41) + 106);
        llIlIIIll[53] = (93 ^ 20) ^ (241 ^ 158);
        llIlIIIll[54] = (37 ^ 109) ^ (122 ^ 21);
        llIlIIIll[55] = (4 ^ 2) ^ (98 ^ 76);
        llIlIIIll[56] = 67 ^ 106;
        llIlIIIll[57] = 73 ^ 99;
        llIlIIIll[58] = (97 ^ 27) ^ (55 ^ 102);
        llIlIIIll[59] = 100 ^ 72;
        llIlIIIll[60] = (60 ^ 113) ^ (88 ^ 56);
        llIlIIIll[61] = (250 ^ 149) ^ (31 ^ 94);
        llIlIIIll[62] = (129 ^ 152) ^ (51 ^ 5);
        llIlIIIll[63] = (((21 + 93) - (-15)) + 27) ^ (((156 + 131) - 178) + 63);
    }

    protected int loop() {
        if (lIllIIIIllII(Game.getState(), GameState.LOGGED_IN)) {
            if (lIllIIIIllIl(a.isEmpty() ? 1 : 0)) {
                if (!lIllIIIIlllI(j) || lIllIIIIllll(k)) {
                    k = Players.getLocal().getName();
                }
                k = Players.getLocal().getName();
                if (lIllIIIlIIII(a.get(llIlIIIll[4]).ah() ? 1 : 0)) {
                    if (lIllIIIlIIII(a.get(llIlIIIll[4]).ag().contains(llIlIIIlI[llIlIIIll[5]]) ? 1 : 0)) {
                        f += llIlIIIll[5];
                    }
                    System.out.println("Achieved " + a.get(llIlIIIll[4]).ag() + " goal");
                    a.remove(llIlIIIll[4]);
                    "".length();
                    return llIlIIIll[6];
                } else if (lIllIIIIllII(Game.getState(), GameState.LOGGED_IN)) {
                    while (lIllIIIlIIII(C0004e.z() ? 1 : 0) && lIllIIIIllIl(d ? 1 : 0) && lIllIIIlIIIl(C0004e.j(llIlIIIll[7]), llIlIIIll[8]) && lIllIIIIllIl(Dialog.isOpen() ? 1 : 0)) {
                        c = llIlIIIlI[llIlIIIll[9]];
                        C0004e.A();
                        Time.sleepTicks(llIlIIIll[5]);
                        "".length();
                        "".length();
                        if ((-((((42 + 28) - (-24)) + 90) ^ (((14 + 96) - 54) + 133))) >= 0) {
                            return ((40 ^ 126) ^ (81 ^ 65)) & (((((231 + 248) - 417) + 188) ^ (((77 + 6) - (-2)) + 103)) ^ (-" ".length()));
                        }
                    }
                    int i2 = llIlIIIll[4];
                    try {
                        i2 = a.get(llIlIIIll[4]).af();
                        "".length();
                        if ((-(150 ^ 146)) >= 0) {
                            return (193 ^ 128) & ((39 ^ 102) ^ (-1));
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    return i2;
                }
            }
            if (lIllIIIlIIII(a.isEmpty() ? 1 : 0)) {
                if (lIllIIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(as.mR), llIlIIIll[10])) {
                    c = llIlIIIlI[llIlIIIll[10]];
                    Movement.walkTo(as.mR);
                    "".length();
                }
                if (lIllIIIlIIll(Players.getLocal().getWorldLocation().distanceTo(as.mR), llIlIIIll[10])) {
                    c = llIlIIIlI[llIlIIIll[11]];
                }
            }
        }
        return llIlIIIll[12];
    }

    private static boolean lIllIIIIllII(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static String lIllIIIIlIIl(String lIIllIllIIlIIl, String lIIllIllIIlIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIllIllIIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIllIllIIlIll = Cipher.getInstance("Blowfish");
            lIIllIllIIlIll.init(llIlIIIll[9], secretKeySpec);
            return new String(lIIllIllIIlIll.doFinal(Base64.getDecoder().decode(lIIllIllIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIllIllIIlIlI) {
            lIIllIllIIlIlI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    protected void shutDown() {
        this.w.remove(this.x);
        "".length();
        d = llIlIIIll[5];
        q = new ab[llIlIIIll[4]];
        o = llIlIIIll[4];
        f = llIlIIIll[4];
        System.out.print(llIlIIIlI[llIlIIIll[19]]);
        super.stop();
    }

    private static boolean lIllIIIlIllI(int i2, int i3) {
        return i2 != i3;
    }

    private static String lIllIIIIlIII(String lIIllIlIlllIIl, String lIIllIlIlllIII) {
        String lIIllIlIlllIIl2 = new String(Base64.getDecoder().decode(lIIllIlIlllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIllIlIllIlll = new StringBuilder();
        char[] lIIllIlIllIllI = lIIllIlIlllIII.toCharArray();
        int lIIllIlIllIlIl = llIlIIIll[4];
        char[] charArray = lIIllIlIlllIIl2.toCharArray();
        int length = charArray.length;
        int i2 = llIlIIIll[4];
        while (lIllIIIllIII(i2, length)) {
            lIIllIlIllIlll.append((char) (charArray[i2] ^ lIIllIlIllIllI[lIIllIlIllIlIl % lIIllIlIllIllI.length]));
            "".length();
            lIIllIlIllIlIl++;
            i2++;
            "".length();
            if ((42 ^ 46) <= ((108 ^ 12) & ((200 ^ 168) ^ (-1)))) {
                return null;
            }
        }
        return String.valueOf(lIIllIlIllIlll);
    }

    private static boolean lIllIIIlIIlI(int i2, int i3) {
        return i2 > i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean a(int i2, int i3, Player player) {
        int combatLevel = player.getCombatLevel();
        int i4 = i3 + i2;
        if (lIllIIIlIlIl(combatLevel, i3 - i2) && lIllIIIlIIll(combatLevel, i4)) {
            ?? r0 = llIlIIIll[5];
            "".length();
            return 0 != 0 ? ((((150 + 51) - 183) + 154) ^ (((120 + 60) - 66) + 56)) & (((75 ^ 36) ^ (219 ^ 178)) ^ (-" ".length())) : r0;
        }
        return llIlIIIll[4];
    }

    @Provides
    public BuilderConfig a(ConfigManager configManager) {
        return (BuilderConfig) configManager.getConfig(BuilderConfig.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    public void onStart(String... strArr) {
        SquirePlugin.setGlobalMouseRecordings();
        "".length();
        d = llIlIIIll[4];
        System.out.print(llIlIIIlI[llIlIIIll[13]]);
        this.w.add(this.x);
        "".length();
        a.clear();
        p = llIlIIIlI[llIlIIIll[14]];
        System.out.println(llIlIIIlI[llIlIIIll[15]]);
        a.clear();
        List<ab> list = a;
        C0019t[] c0019tArr = new C0019t[llIlIIIll[5]];
        c0019tArr[llIlIIIll[4]] = new C0019t();
        Collections.addAll(list, c0019tArr);
        "".length();
        g = System.currentTimeMillis();
        Collections.shuffle(a);
        n = this.r.get70Agility();
    }

    private static boolean lIllIIIlIIII(int i2) {
        return i2 != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    static {
        lIllIIIIlIll();
        lIllIIIIlIlI();
        a = new ArrayList();
        b = System.currentTimeMillis();
        d = llIlIIIll[4];
        g = System.currentTimeMillis();
        h = llIlIIIlI[llIlIIIll[62]];
        i = new HashMap<>();
        j = null;
        k = null;
        m = Static.getClient().getDiscordId();
        ab[] abVarArr = new ab[llIlIIIll[5]];
        abVarArr[llIlIIIll[4]] = new as();
        q = abVarArr;
    }

    private static boolean lIllIIIlIIIl(int i2, int i3) {
        return i2 == i3;
    }

    @Subscribe
    private void a(LoginStateChanged loginStateChanged) {
        if (!lIllIIIlIllI(loginStateChanged.getIndex(), llIlIIIll[25]) && lIllIIIIllIl(o)) {
            C0004e.a(this.t, "rsn: " + k + " account has been banned? - Acc builder " + p);
            o += llIlIIIll[5];
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0084, code lost:
        if (lIllIIIlIIII(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v65, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v70, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v75, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v77, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v79, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v84, types: [boolean] */
    @Subscribe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(GameTick gameTick) {
        C0004e.y();
        int wildyLevel = Game.getWildyLevel();
        Player local = Players.getLocal();
        int combatLevel = local.getCombatLevel();
        if (lIllIIIIlllI(Players.getNearest(player -> {
            if (lIllIIIlIlll(player, local) && lIllIIIlIIII(a(wildyLevel, combatLevel, player) ? 1 : 0)) {
                ?? r0 = llIlIIIll[5];
                "".length();
                return "  ".length() <= (-" ".length()) ? ((190 ^ 183) ^ (14 ^ 25)) & (((((99 + 25) - (-23)) + 70) ^ (((6 + 73) - (-38)) + 82)) ^ (-" ".length())) : r0;
            }
            return llIlIIIll[4];
        })) && (!lIllIIIlIlII(Game.getWildyLevel()) || lIllIIIlIIll(Players.getLocal().getWorldLocation().distanceTo(aq.mB), llIlIIIll[20]))) {
            int[] iArr = new int[llIlIIIll[5]];
            iArr[llIlIIIll[4]] = llIlIIIll[21];
            if (lIllIIIIllIl(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[llIlIIIll[5]];
                iArr2[llIlIIIll[4]] = llIlIIIll[22];
            }
            if (lIllIIIIllIl(this.s.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Game.logout();
            }
        }
        if (lIllIIIlIIII(Dialog.isOpen() ? 1 : 0) && lIllIIIIlllI(Dialog.getText())) {
            if (lIllIIIlIIII(Dialog.getText().contains(llIlIIIlI[llIlIIIll[23]]) ? 1 : 0)) {
                G.fB = llIlIIIll[5];
            }
            if (!lIllIIIIllIl(Dialog.getText().contains(llIlIIIlI[llIlIIIll[24]]) ? 1 : 0) || lIllIIIlIIII(Dialog.getText().contains(llIlIIIlI[llIlIIIll[25]]) ? 1 : 0)) {
            }
            if (lIllIIIlIIII(Dialog.getText().contains(llIlIIIlI[llIlIIIll[26]]) ? 1 : 0)) {
                C0023x.dG = llIlIIIll[5];
            }
            if (lIllIIIlIIII(Dialog.getText().contains(llIlIIIlI[llIlIIIll[27]]) ? 1 : 0)) {
                C0023x.dH = llIlIIIll[5];
            }
            WorldArea worldArea = new WorldArea(llIlIIIll[28], llIlIIIll[29], llIlIIIll[30], llIlIIIll[31], llIlIIIll[4]);
            if (lIllIIIlIIII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIllIIIlIIII(Dialog.getText().contains(llIlIIIlI[llIlIIIll[32]]) ? 1 : 0)) {
                C0025z.dP = llIlIIIll[5];
            }
            if (lIllIIIlIIII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIllIIIlIIII(Dialog.getText().contains(llIlIIIlI[llIlIIIll[33]]) ? 1 : 0)) {
                C0025z.dQ = llIlIIIll[5];
            }
            if (lIllIIIlIIII(Dialog.getText().contains(llIlIIIlI[llIlIIIll[34]]) ? 1 : 0)) {
                C0025z.dR = llIlIIIll[5];
            }
            if (lIllIIIlIIII(Dialog.getText().contains(llIlIIIlI[llIlIIIll[20]]) ? 1 : 0)) {
            }
        }
        NPC nearest = NPCs.getNearest(npc -> {
            if (!(lIllIIIIllIl(npc.getName().contains(llIlIIIlI[llIlIIIll[54]]) ? 1 : 0) && lIllIIIIllIl(npc.getName().contains(llIlIIIlI[llIlIIIll[55]]) ? 1 : 0) && lIllIIIIllIl(npc.getName().contains(llIlIIIlI[llIlIIIll[56]]) ? 1 : 0) && lIllIIIIllIl(npc.getName().contains(llIlIIIlI[llIlIIIll[57]]) ? 1 : 0) && lIllIIIIllIl(npc.getName().contains(llIlIIIlI[llIlIIIll[58]]) ? 1 : 0) && lIllIIIIllIl(npc.getName().contains(llIlIIIlI[llIlIIIll[59]]) ? 1 : 0) && !lIllIIIlIIII(npc.getName().contains(llIlIIIlI[llIlIIIll[60]]) ? 1 : 0)) && lIllIIIIllIl(npc.getName().contains(llIlIIIlI[llIlIIIll[61]]) ? 1 : 0) && (!(lIllIIIIllIl(L.ga.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIllIIIIllIl(L.gb.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && !lIllIIIlIIII(L.gc.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && lIllIIIlIIll(npc.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), llIlIIIll[10]))) {
                ?? r0 = llIlIIIll[5];
                "".length();
                return " ".length() <= 0 ? ((125 ^ 71) ^ (75 ^ 104)) & (((82 ^ 37) ^ (47 ^ 65)) ^ (-" ".length())) : r0;
            }
            return llIlIIIll[4];
        });
        if (lIllIIIIlllI(nearest) && lIllIIIIllIl(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
            Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
            Time.sleepTicks(llIlIIIll[5]);
            "".length();
        }
        if (lIllIIIIllll(nearest) && ((!lIllIIIIllIl(L.ga.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !lIllIIIIllIl(L.gb.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || lIllIIIlIIII(L.gc.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && lIllIIIlIIII(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0))) {
            Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
        }
        C0004e.I();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v68, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v77, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v81, types: [boolean] */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (lIllIIIlIIII(chatMessage.getMessage().contains(llIlIIIlI[llIlIIIll[35]]) ? 1 : 0)) {
            System.out.println(llIlIIIlI[llIlIIIll[36]]);
            d = llIlIIIll[5];
        }
        if (lIllIIIlIIII(chatMessage.getMessage().contains(llIlIIIlI[llIlIIIll[37]]) ? 1 : 0)) {
            System.out.println(llIlIIIlI[llIlIIIll[38]]);
            if (lIllIIIIllIl(Game.getWildyLevel()) && lIllIIIIllIl(Inventory.contains(item -> {
                return item.getName().contains(llIlIIIlI[llIlIIIll[53]]);
            }) ? 1 : 0)) {
                d = llIlIIIll[5];
                System.out.println(llIlIIIlI[llIlIIIll[39]]);
            }
            if (!lIllIIIlIlII(Game.getWildyLevel()) || lIllIIIlIIII(Inventory.contains(item2 -> {
                return item2.getName().contains(llIlIIIlI[llIlIIIll[52]]);
            }) ? 1 : 0)) {
                d = llIlIIIll[4];
                System.out.println(llIlIIIlI[llIlIIIll[40]]);
            }
        }
        if (lIllIIIlIIII(chatMessage.getMessage().contains(llIlIIIlI[llIlIIIll[30]]) ? 1 : 0) && lIllIIIlIIll(Players.getLocal().getWorldLocation().distanceTo(U.lm), llIlIIIll[18])) {
            String[] strArr = new String[llIlIIIll[5]];
            strArr[llIlIIIll[4]] = llIlIIIlI[llIlIIIll[41]];
            if (lIllIIIIlllI(TileObjects.getNearest(strArr))) {
                String[] strArr2 = new String[llIlIIIll[5]];
                strArr2[llIlIIIll[4]] = llIlIIIlI[llIlIIIll[42]];
                TileObjects.getNearest(strArr2).interact(llIlIIIlI[llIlIIIll[43]]);
                Time.sleepTicks(llIlIIIll[11]);
                "".length();
            }
            String[] strArr3 = new String[llIlIIIll[5]];
            strArr3[llIlIIIll[4]] = llIlIIIlI[llIlIIIll[44]];
            if (lIllIIIIlllI(TileObjects.getNearest(strArr3))) {
                String[] strArr4 = new String[llIlIIIll[5]];
                strArr4[llIlIIIll[4]] = llIlIIIlI[llIlIIIll[45]];
                TileObjects.getNearest(strArr4).interact(llIlIIIlI[llIlIIIll[31]]);
                Time.sleepTicks(llIlIIIll[10]);
                "".length();
            }
        }
        if (lIllIIIlIIII(chatMessage.getMessage().contains(llIlIIIlI[llIlIIIll[46]]) ? 1 : 0)) {
            Movement.walkTo(new WorldPoint(llIlIIIll[47], llIlIIIll[48], llIlIIIll[4]));
            "".length();
            Time.sleepTicks(llIlIIIll[5]);
            "".length();
        }
        if (lIllIIIlIIII(chatMessage.getMessage().contains(llIlIIIlI[llIlIIIll[49]]) ? 1 : 0)) {
            int[] iArr = new int[llIlIIIll[5]];
            iArr[llIlIIIll[4]] = llIlIIIll[50];
            if (lIllIIIlIIII(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[llIlIIIll[5]];
                iArr2[llIlIIIll[4]] = llIlIIIll[50];
                Inventory.getFirst(iArr2).interact(llIlIIIlI[llIlIIIll[51]]);
            }
        }
    }

    private static boolean lIllIIIIllIl(int i2) {
        return i2 == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    @Subscribe
    private void a(ConfigChanged configChanged) {
        if (lIllIIIlIIII(configChanged.getGroup().equalsIgnoreCase(llIlIIIlI[llIlIIIll[16]]) ? 1 : 0)) {
            if (lIllIIIlIIII(configChanged.getKey().contains(llIlIIIlI[llIlIIIll[17]]) ? 1 : 0)) {
                this.u = this.r.turnScriptOnOff();
                if (lIllIIIlIIII(this.u ? 1 : 0)) {
                    d = llIlIIIll[4];
                    "".length();
                    if ("  ".length() <= 0) {
                        return;
                    }
                } else {
                    d = llIlIIIll[5];
                }
            }
            if (lIllIIIlIIII(configChanged.getKey().contains(llIlIIIlI[llIlIIIll[18]]) ? 1 : 0)) {
                n = this.r.get70Agility();
            }
        }
    }

    private static boolean lIllIIIIlllI(Object obj) {
        return obj != null;
    }

    private static boolean lIllIIIlIlll(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lIllIIIlIlII(int i2) {
        return i2 <= 0;
    }

    private static boolean lIllIIIlIlIl(int i2, int i3) {
        return i2 >= i3;
    }

    private static boolean lIllIIIIllll(Object obj) {
        return obj == null;
    }

    private static boolean lIllIIIlIIll(int i2, int i3) {
        return i2 <= i3;
    }
}
