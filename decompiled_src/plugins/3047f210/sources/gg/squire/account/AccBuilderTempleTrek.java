package gg.squire.account;

import com.google.inject.Provides;
import e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.C0004e;
import e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.C0012m;
import e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.C0018s;
import e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.E;
import e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.H;
import e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.N;
import e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S;
import e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.aa;
import e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.ac;
import gg.squire.account.overlay.BuilderInfoBox;
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
import net.runelite.api.Player;
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
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.events.LoginStateChanged;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.plugins.Script;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.client.Static;
import org.pf4j.Extension;
@Extension
@SquireUtil
@PluginDescriptor(name = "Squire Templetrek Builder", enabledByDefault = false)
/* loaded from: 3047f210-3107-4c67-939d-3c9e588029ae.jar:gg/squire/account/AccBuilderTempleTrek.class */
public class AccBuilderTempleTrek extends Script {
    static /* synthetic */ int n;
    public static /* synthetic */ String j;
    public static /* synthetic */ HashMap<WorldPoint, Integer> i;
    @Inject
    private /* synthetic */ Client t;

    /* renamed from: e  reason: collision with root package name */
    public static /* synthetic */ boolean f3e;
    public static /* synthetic */ long b;
    public static /* synthetic */ boolean d;
    public static /* synthetic */ String k;
    public static /* synthetic */ String m;
    @Inject
    private /* synthetic */ BuilderInfoBox v;
    private static /* synthetic */ int[] lIIIIIllIIl;
    public static /* synthetic */ String c;
    public static /* synthetic */ int f;
    @Inject
    private /* synthetic */ OverlayManager u;
    public static /* synthetic */ String h;
    private static /* synthetic */ S[] o;
    public static /* synthetic */ long g;
    public static /* synthetic */ List<S> a;
    public static /* synthetic */ String l;
    private static /* synthetic */ String[] lIIIIIllIII;
    /* synthetic */ boolean s;
    @Inject
    public /* synthetic */ BuilderConfig p;
    /* synthetic */ WorldArea q = new WorldArea(lIIIIIllIIl[0], lIIIIIllIIl[1], lIIIIIllIIl[2], lIIIIIllIIl[3], lIIIIIllIIl[4]);
    /* synthetic */ String r = lIIIIIllIII[lIIIIIllIIl[4]];

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0084, code lost:
        if (llIllllIIlIII(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    @Subscribe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(GameTick gameTick) {
        C0004e.w();
        int wildyLevel = Game.getWildyLevel();
        Player local = Players.getLocal();
        int combatLevel = local.getCombatLevel();
        if (llIllllIIIllI(Players.getNearest(player -> {
            if (llIllllIIllll(player, local) && llIllllIIlIII(a(wildyLevel, combatLevel, player) ? 1 : 0)) {
                ?? r0 = lIIIIIllIIl[5];
                "".length();
                return "  ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIIIIIllIIl[4];
        })) && (!llIllllIIllII(Game.getWildyLevel()) || llIllllIIlIll(Players.getLocal().getWorldLocation().distanceTo(aa.ju), lIIIIIllIIl[18]))) {
            int[] iArr = new int[lIIIIIllIIl[5]];
            iArr[lIIIIIllIIl[4]] = lIIIIIllIIl[19];
            if (llIllllIIIlIl(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIIIIIllIIl[5]];
                iArr2[lIIIIIllIIl[4]] = lIIIIIllIIl[20];
            }
            if (llIllllIIIlIl(this.q.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Game.logout();
            }
        }
        if (llIllllIIlIII(Dialog.isOpen() ? 1 : 0) && llIllllIIIllI(Dialog.getText()) && llIllllIIlIII(Dialog.getText().contains(lIIIIIllIII[lIIIIIllIIl[21]]) ? 1 : 0)) {
            C0018s.dq = lIIIIIllIIl[5];
        }
        C0004e.G();
    }

    @Provides
    public BuilderConfig a(ConfigManager configManager) {
        return (BuilderConfig) configManager.getConfig(BuilderConfig.class);
    }

    private static boolean llIllllIIlllI(int i2, int i3) {
        return i2 != i3;
    }

    private static void llIllllIIIIlI() {
        lIIIIIllIII = new String[lIIIIIllIIl[44]];
        lIIIIIllIII[lIIIIIllIIl[4]] = llIlllIllllll("Jxk+UbxQw1vv6tCk8MKTloB+0f3WmX+K1lQSV+y4eGi4iO6XJvtDQxEtpQO+rPw1W7f5IW5dIP9e8kNEBZljrfKFrReyN6OZrARTJ3x6CU6zpBcNzhKLFeRra/FkB2wHm25FPV6cwvDEn5RAeYJrSlEI4UzafZPbt75YqqMkfB0=", "ZEmeb");
        lIIIIIllIII[lIIIIIllIIl[5]] = llIllllIIIIII("Mr7wMeA0YXA=", "gUdJu");
        lIIIIIllIII[lIIIIIllIIl[9]] = llIlllIllllll("LTPUADIfTJk3YZe/rCeJp6CxW5CkwsZ2", "gAisC");
        lIIIIIllIII[lIIIIIllIIl[10]] = llIlllIllllll("EKrXh+BX9fIVMe3nsiOnKmoh657GayXE", "jKrxQ");
        lIIIIIllIII[lIIIIIllIIl[11]] = llIlllIllllll("4zhSEQy8DHtPIR748yKXO6NNUycSrGY3", "Nwhhu");
        lIIIIIllIII[lIIIIIllIIl[13]] = llIlllIllllll("lm1gMtRoSgKzXHo3yKUn5Ptt1lD2rPgId788jr7Ppfk=", "bDNRI");
        lIIIIIllIII[lIIIIIllIIl[14]] = llIlllIllllll("NF8Fd4a8YWW75fLs3zFjJdVcARDp1iAmScxp6U1Svq0pjd+QzD1G9Q==", "baqCm");
        lIIIIIllIII[lIIIIIllIIl[15]] = llIllllIIIIII("tqsb6lZiFhvDbbaDmdqFjA==", "XEbCr");
        lIIIIIllIII[lIIIIIllIIl[16]] = llIllllIIIIIl("HxsPLQ0fEQ==", "zunOa");
        lIIIIIllIII[lIIIIIllIIl[17]] = llIllllIIIIII("zD9en+I2w3uD1gS5quNyMhqS9/uSX4i47pmkf9SoS4I=", "jQAiV");
        lIIIIIllIII[lIIIIIllIIl[21]] = llIllllIIIIII("0xqYMf/V/nd1GiTOctGSOA==", "SNYrc");
        lIIIIIllIII[lIIIIIllIIl[22]] = llIllllIIIIIl("Lw4vUzAXFz8dfwJBPRwsVgQ0HC0RCQ==", "vaZsX");
        lIIIIIllIII[lIIIIIllIIl[23]] = llIllllIIIIIl("HQ0dcBA9DRw3HXMFBjwRcwQGIlUxFxA5GzQ=", "SbiPu");
        lIIIIIllIII[lIIIIIllIIl[24]] = llIllllIIIIIl("JilQLSIIM1xpPgY0UCg1DGEULCYNYA==", "iApIG");
        lIIIIIllIII[lIIIIIllIIl[25]] = llIlllIllllll("IDu55Z2iAXmTetWvSdRoiw==", "TlZuV");
        lIIIIIllIII[lIIIIIllIIl[26]] = llIlllIllllll("+m0fuD/V+AWbw5/izzC4PTCx0yiGeWHhULPpS03XU6q9Qlb89IK1Ial3A2uUsfZHkRwZJZR84x8i/DbdopATCefUE09iFwtcQAhmCGGho8x+4L3KMlR1Uw==", "SVrzX");
        lIIIIIllIII[lIIIIIllIIl[27]] = llIllllIIIIIl("MBVBCA4CFEEIEhUZDwtHCAJBDQETFRNMFxURGAkVS1ASBAgSHAVMBQJQAgMJExkPGQ4JF0EfBBUZERhLRwIEHAgVBEEFAUcJDhlHFBUETBMPGRJMBgkUQQUTRwcAHwlABEEIEhUZDwtHCAJBHg4AGBVMBgEEBB5HFwIAFQIV", "gpalg");
        lIIIIIllIII[lIIIIIllIIl[28]] = llIlllIllllll("s/JX+uGCAK/M2TtlM2u3epC2YJc0ZVa/", "PBTwk");
        lIIIIIllIII[lIIIIIllIIl[29]] = llIllllIIIIIl("NwkNTCB0GgYKNzxIFwM1IA==", "ThckT");
        lIIIIIllIII[lIIIIIllIIl[30]] = llIllllIIIIII("EoIQ6zC97Mc=", "wCuAQ");
        lIIIIIllIII[lIIIIIllIIl[18]] = llIlllIllllll("V8IktOE1IXg=", "hJZVI");
        lIIIIIllIII[lIIIIIllIIl[31]] = llIllllIIIIII("NFRiy0Zhcv0=", "qBvTn");
        lIIIIIllIII[lIIIIIllIIl[32]] = llIllllIIIIII("0zRFV+uM9/H8Bv1G5UqpSQ==", "ovfua");
        lIIIIIllIII[lIIIIIllIIl[33]] = llIlllIllllll("x5wi1L8kvhiiQPXbun+fCQ==", "nwaAH");
        lIIIIIllIII[lIIIIIllIIl[34]] = llIllllIIIIIl("BTccDA==", "JGybG");
        lIIIIIllIII[lIIIIIllIIl[35]] = llIlllIllllll("OuoJ5XLmKhuxfu2MDScZVq69dypvDQOG", "pQRVF");
        lIIIIIllIII[lIIIIIllIIl[38]] = llIllllIIIIIl("IygZCgQmPUscCi8hSx0QLw==", "BDkoe");
        lIIIIIllIII[lIIIIIllIIl[40]] = llIlllIllllll("lbhA/OntdDk=", "SjyAS");
        lIIIIIllIII[lIIIIIllIIl[41]] = llIllllIIIIIl("LREDFzEBAw==", "odqyX");
        lIIIIIllIII[lIIIIIllIIl[42]] = llIllllIIIIIl("Bx0dPgArDw==", "EhoPi");
        lIIIIIllIII[lIIIIIllIIl[43]] = llIllllIIIIIl("", "RmIjN");
    }

    private static boolean llIllllIIllII(int i2) {
        return i2 <= 0;
    }

    @Subscribe
    private void a(LoginStateChanged loginStateChanged) {
        if (!llIllllIIlllI(loginStateChanged.getIndex(), lIIIIIllIIl[25]) && llIllllIIIlIl(n)) {
            C0004e.a(this.r, "rsn: " + k + " account has been banned? - Acc builder");
            n += lIIIIIllIIl[5];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    @Subscribe
    private void a(ConfigChanged configChanged) {
        if (llIllllIIlIII(configChanged.getGroup().equalsIgnoreCase(lIIIIIllIII[lIIIIIllIIl[15]]) ? 1 : 0) && llIllllIIlIII(configChanged.getKey().contains(lIIIIIllIII[lIIIIIllIIl[16]]) ? 1 : 0)) {
            this.s = this.p.turnScriptOnOff();
            if (!llIllllIIlIII(this.s ? 1 : 0)) {
                d = lIIIIIllIIl[5];
                return;
            }
            d = lIIIIIllIIl[4];
            "".length();
            if ((104 ^ 109) <= 0) {
            }
        }
    }

    private static String llIllllIIIIII(String lllllllllllllllllIIlllIlIIIlllIl, String lllllllllllllllllIIlllIlIIIlllII) {
        try {
            SecretKeySpec lllllllllllllllllIIlllIlIIlIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIIlllIlIIIlllII.getBytes(StandardCharsets.UTF_8)), lIIIIIllIIl[16]), "DES");
            Cipher lllllllllllllllllIIlllIlIIIlllll = Cipher.getInstance("DES");
            lllllllllllllllllIIlllIlIIIlllll.init(lIIIIIllIIl[9], lllllllllllllllllIIlllIlIIlIIIII);
            return new String(lllllllllllllllllIIlllIlIIIlllll.doFinal(Base64.getDecoder().decode(lllllllllllllllllIIlllIlIIIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIIlllIlIIIllllI) {
            lllllllllllllllllIIlllIlIIIllllI.printStackTrace();
            return null;
        }
    }

    private static String llIlllIllllll(String lllllllllllllllllIIlllIlIIIlIIII, String lllllllllllllllllIIlllIlIIIIllll) {
        try {
            SecretKeySpec lllllllllllllllllIIlllIlIIIlIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIIlllIlIIIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllIIlllIlIIIlIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllllIIlllIlIIIlIIlI.init(lIIIIIllIIl[9], lllllllllllllllllIIlllIlIIIlIIll);
            return new String(lllllllllllllllllIIlllIlIIIlIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllllIIlllIlIIIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIIlllIlIIIlIIIl) {
            lllllllllllllllllIIlllIlIIIlIIIl.printStackTrace();
            return null;
        }
    }

    private static void llIllllIIIIll() {
        lIIIIIllIIl = new int[45];
        lIIIIIllIIl[0] = (-((-749) & 5117)) & (-1) & 7479;
        lIIIIIllIIl[1] = (-20578) & 24177;
        lIIIIIllIIl[2] = (((166 + 37) - 139) + 120) ^ (((88 + 51) - 56) + 51);
        lIIIIIllIIl[3] = (211 ^ 198) ^ (188 ^ 156);
        lIIIIIllIIl[4] = (189 ^ 179) & ((13 ^ 3) ^ (-1));
        lIIIIIllIIl[5] = " ".length();
        lIIIIIllIIl[6] = (150 ^ 144) ^ (126 ^ 28);
        lIIIIIllIIl[7] = (-((-1073) & 3317)) & (-16931) & 19455;
        lIIIIIllIIl[8] = (-((-16680) & 32063)) & (-16385) & 32767;
        lIIIIIllIIl[9] = "  ".length();
        lIIIIIllIIl[10] = "   ".length();
        lIIIIIllIIl[11] = (127 ^ 94) ^ (147 ^ 182);
        lIIIIIllIIl[12] = (-23848) & 24447;
        lIIIIIllIIl[13] = 151 ^ 146;
        lIIIIIllIIl[14] = (140 ^ 188) ^ (102 ^ 80);
        lIIIIIllIIl[15] = 38 ^ 33;
        lIIIIIllIIl[16] = 20 ^ 28;
        lIIIIIllIIl[17] = 18 ^ 27;
        lIIIIIllIIl[18] = 1 ^ 21;
        lIIIIIllIIl[19] = (-30053) & 30588;
        lIIIIIllIIl[20] = (-((-9489) & 30193)) & (-11525) & 32765;
        lIIIIIllIIl[21] = 168 ^ 162;
        lIIIIIllIIl[22] = 108 ^ 103;
        lIIIIIllIIl[23] = (175 ^ 152) ^ (77 ^ 118);
        lIIIIIllIIl[24] = (((34 + 111) - 21) + 6) ^ (((110 + 115) - 210) + 128);
        lIIIIIllIIl[25] = (((78 + 64) - 69) + 76) ^ (((128 + 131) - 129) + 25);
        lIIIIIllIIl[26] = (64 ^ 124) ^ (36 ^ 23);
        lIIIIIllIIl[27] = (((171 + 99) - 142) + 48) ^ (((123 + 139) - 215) + 113);
        lIIIIIllIIl[28] = (226 ^ 147) ^ (100 ^ 4);
        lIIIIIllIIl[29] = 153 ^ 139;
        lIIIIIllIIl[30] = 152 ^ 139;
        lIIIIIllIIl[31] = 54 ^ 35;
        lIIIIIllIIl[32] = 176 ^ 166;
        lIIIIIllIIl[33] = (79 ^ 67) ^ (102 ^ 125);
        lIIIIIllIIl[34] = 16 ^ 8;
        lIIIIIllIIl[35] = 129 ^ 152;
        lIIIIIllIIl[36] = (-((-2945) & 32711)) & (-25) & 32767;
        lIIIIIllIIl[37] = (-((-29313) & 29649)) & (-25089) & 28663;
        lIIIIIllIIl[38] = 88 ^ 66;
        lIIIIIllIIl[39] = (-((-16803) & 31651)) & (-65) & 15343;
        lIIIIIllIIl[40] = (41 ^ 57) ^ (29 ^ 22);
        lIIIIIllIIl[41] = (223 ^ 173) ^ (77 ^ 35);
        lIIIIIllIIl[42] = (239 ^ 180) ^ (245 ^ 179);
        lIIIIIllIIl[43] = (204 ^ 134) ^ (233 ^ 189);
        lIIIIIllIIl[44] = 134 ^ 153;
    }

    private static boolean llIllllIIlIlI(int i2, int i3) {
        return i2 > i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v80, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v89, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v93, types: [boolean] */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (llIllllIIlIII(chatMessage.getMessage().contains(lIIIIIllIII[lIIIIIllIIl[22]]) ? 1 : 0)) {
            System.out.println(lIIIIIllIII[lIIIIIllIIl[23]]);
            d = lIIIIIllIIl[5];
        }
        if (llIllllIIlIII(chatMessage.getMessage().contains(lIIIIIllIII[lIIIIIllIIl[24]]) ? 1 : 0)) {
            System.out.println(lIIIIIllIII[lIIIIIllIIl[25]]);
            if (llIllllIIIlIl(Game.getWildyLevel()) && llIllllIIIlIl(Inventory.contains(item -> {
                return item.getName().contains(lIIIIIllIII[lIIIIIllIIl[42]]);
            }) ? 1 : 0)) {
                d = lIIIIIllIIl[5];
                System.out.println(lIIIIIllIII[lIIIIIllIIl[26]]);
            }
            if (!llIllllIIllII(Game.getWildyLevel()) || llIllllIIlIII(Inventory.contains(item2 -> {
                return item2.getName().contains(lIIIIIllIII[lIIIIIllIIl[41]]);
            }) ? 1 : 0)) {
                d = lIIIIIllIIl[4];
                System.out.println(lIIIIIllIII[lIIIIIllIIl[27]]);
            }
        }
        if (llIllllIIlIII(chatMessage.getMessage().contains(lIIIIIllIII[lIIIIIllIIl[28]]) ? 1 : 0) && llIllllIIlIll(Players.getLocal().getWorldLocation().distanceTo(N.ig), lIIIIIllIIl[21])) {
            C0004e.v();
        }
        if (llIllllIIlIII(chatMessage.getMessage().contains(lIIIIIllIII[lIIIIIllIIl[29]]) ? 1 : 0) && (!llIllllIIlIlI(Players.getLocal().getWorldLocation().distanceTo(H.ht), lIIIIIllIIl[15]) || llIllllIIlIll(Players.getLocal().getWorldLocation().distanceTo(E.gY), lIIIIIllIIl[21]))) {
            String[] strArr = new String[lIIIIIllIIl[5]];
            strArr[lIIIIIllIIl[4]] = lIIIIIllIII[lIIIIIllIIl[30]];
            if (llIllllIIIllI(TileObjects.getNearest(strArr))) {
                String[] strArr2 = new String[lIIIIIllIIl[5]];
                strArr2[lIIIIIllIIl[4]] = lIIIIIllIII[lIIIIIllIIl[18]];
                TileObjects.getNearest(strArr2).interact(lIIIIIllIII[lIIIIIllIIl[31]]);
                Time.sleepTicks(lIIIIIllIIl[11]);
                "".length();
            }
            String[] strArr3 = new String[lIIIIIllIIl[5]];
            strArr3[lIIIIIllIIl[4]] = lIIIIIllIII[lIIIIIllIIl[32]];
            if (llIllllIIIllI(TileObjects.getNearest(strArr3))) {
                String[] strArr4 = new String[lIIIIIllIIl[5]];
                strArr4[lIIIIIllIIl[4]] = lIIIIIllIII[lIIIIIllIIl[33]];
                TileObjects.getNearest(strArr4).interact(lIIIIIllIII[lIIIIIllIIl[34]]);
                Time.sleepTicks(lIIIIIllIIl[10]);
                "".length();
            }
        }
        if (llIllllIIlIII(chatMessage.getMessage().contains(lIIIIIllIII[lIIIIIllIIl[35]]) ? 1 : 0)) {
            Movement.walkTo(new WorldPoint(lIIIIIllIIl[36], lIIIIIllIIl[37], lIIIIIllIIl[4]));
            "".length();
            Time.sleepTicks(lIIIIIllIIl[5]);
            "".length();
        }
        if (llIllllIIlIII(chatMessage.getMessage().contains(lIIIIIllIII[lIIIIIllIIl[38]]) ? 1 : 0)) {
            int[] iArr = new int[lIIIIIllIIl[5]];
            iArr[lIIIIIllIIl[4]] = lIIIIIllIIl[39];
            if (llIllllIIlIII(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIIIIIllIIl[5]];
                iArr2[lIIIIIllIIl[4]] = lIIIIIllIIl[39];
                Inventory.getFirst(iArr2).interact(lIIIIIllIII[lIIIIIllIIl[40]]);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    protected void shutDown() {
        this.u.remove(this.v);
        "".length();
        d = lIIIIIllIIl[5];
        o = new S[lIIIIIllIIl[4]];
        n = lIIIIIllIIl[4];
        f = lIIIIIllIIl[4];
        System.out.print(lIIIIIllIII[lIIIIIllIIl[17]]);
        super.stop();
    }

    private static boolean llIllllIIlIII(int i2) {
        return i2 != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    public void onStart(String... strArr) {
        SquirePlugin.setGlobalMouseRecordings();
        "".length();
        d = lIIIIIllIIl[4];
        System.out.print(lIIIIIllIII[lIIIIIllIIl[13]]);
        this.u.add(this.v);
        "".length();
        a.clear();
        System.out.println(lIIIIIllIII[lIIIIIllIIl[14]]);
        a.clear();
        List<S> list = a;
        C0012m[] c0012mArr = new C0012m[lIIIIIllIIl[5]];
        c0012mArr[lIIIIIllIIl[4]] = new C0012m();
        Collections.addAll(list, c0012mArr);
        "".length();
        g = System.currentTimeMillis();
        Collections.shuffle(a);
    }

    private static boolean llIllllIIlIll(int i2, int i3) {
        return i2 <= i3;
    }

    private static boolean llIllllIIllll(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean llIllllIIIlll(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    static {
        llIllllIIIIll();
        llIllllIIIIlI();
        a = new ArrayList();
        b = System.currentTimeMillis();
        d = lIIIIIllIIl[4];
        g = System.currentTimeMillis();
        h = lIIIIIllIII[lIIIIIllIIl[43]];
        i = new HashMap<>();
        j = null;
        k = null;
        m = Static.getClient().getDiscordId();
        S[] sArr = new S[lIIIIIllIIl[5]];
        sArr[lIIIIIllIIl[4]] = new ac();
        o = sArr;
    }

    private static boolean llIllllIIlIIl(int i2, int i3) {
        return i2 == i3;
    }

    protected int loop() {
        if (llIllllIIIlII(Game.getState(), GameState.LOGGED_IN)) {
            if (llIllllIIIlIl(a.isEmpty() ? 1 : 0)) {
                if (!llIllllIIIllI(j) || llIllllIIIlll(k)) {
                    k = Players.getLocal().getName();
                }
                k = Players.getLocal().getName();
                if (llIllllIIlIII(a.get(lIIIIIllIIl[4]).V() ? 1 : 0)) {
                    if (llIllllIIlIII(a.get(lIIIIIllIIl[4]).U().contains(lIIIIIllIII[lIIIIIllIIl[5]]) ? 1 : 0)) {
                        f += lIIIIIllIIl[5];
                    }
                    System.out.println("Achieved " + a.get(lIIIIIllIIl[4]).U() + " goal");
                    a.remove(lIIIIIllIIl[4]);
                    "".length();
                    return lIIIIIllIIl[6];
                } else if (llIllllIIIlII(Game.getState(), GameState.LOGGED_IN)) {
                    while (llIllllIIlIII(C0004e.x() ? 1 : 0) && llIllllIIIlIl(d ? 1 : 0) && llIllllIIlIIl(C0004e.j(lIIIIIllIIl[7]), lIIIIIllIIl[8]) && llIllllIIIlIl(Dialog.isOpen() ? 1 : 0)) {
                        c = lIIIIIllIII[lIIIIIllIIl[9]];
                        C0004e.y();
                        Time.sleepTicks(lIIIIIllIIl[5]);
                        "".length();
                        "".length();
                        if (" ".length() >= "  ".length()) {
                            return ((166 ^ 150) ^ (98 ^ 1)) & (("   ".length() ^ (50 ^ 98)) ^ (-" ".length()));
                        }
                    }
                    int i2 = lIIIIIllIIl[4];
                    try {
                        i2 = a.get(lIIIIIllIIl[4]).T();
                        "".length();
                        if (0 != 0) {
                            return (232 ^ 188) & ((99 ^ 55) ^ (-1));
                        }
                    } catch (Exception lllllllllllllllllIIlllIlIlIlIIIl) {
                        lllllllllllllllllIIlllIlIlIlIIIl.printStackTrace();
                    }
                    return i2;
                }
            }
            if (llIllllIIlIII(a.isEmpty() ? 1 : 0)) {
                if (llIllllIIlIlI(Players.getLocal().getWorldLocation().distanceTo(ac.jR), lIIIIIllIIl[10])) {
                    c = lIIIIIllIII[lIIIIIllIIl[10]];
                    Movement.walkTo(ac.jR);
                    "".length();
                }
                if (llIllllIIlIll(Players.getLocal().getWorldLocation().distanceTo(ac.jR), lIIIIIllIIl[10])) {
                    c = lIIIIIllIII[lIIIIIllIIl[11]];
                }
            }
        }
        return lIIIIIllIIl[12];
    }

    private static boolean llIllllIIllIl(int i2, int i3) {
        return i2 >= i3;
    }

    private static boolean llIllllIIIlIl(int i2) {
        return i2 == 0;
    }

    private static boolean llIllllIIIllI(Object obj) {
        return obj != null;
    }

    private static boolean llIllllIIIlII(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean llIllllIlIIII(int i2, int i3) {
        return i2 < i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean a(int i2, int i3, Player player) {
        int combatLevel = player.getCombatLevel();
        int i4 = i3 + i2;
        if (llIllllIIllIl(combatLevel, i3 - i2) && llIllllIIlIll(combatLevel, i4)) {
            ?? r0 = lIIIIIllIIl[5];
            "".length();
            return 0 != 0 ? ((55 ^ 34) ^ (214 ^ 198)) & (((((124 + 18) - 46) + 39) ^ (((73 + 50) - 91) + 98)) ^ (-" ".length())) : r0;
        }
        return lIIIIIllIIl[4];
    }

    private static String llIllllIIIIIl(String lllllllllllllllllIIlllIlIIIIIIII, String lllllllllllllllllIIlllIIlllllIlI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllllIIlllIlIIIIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllllIIlllIIlllllIlI.toCharArray();
        int lllllllllllllllllIIlllIIllllllII = lIIIIIllIIl[4];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i2 = lIIIIIllIIl[4];
        while (llIllllIlIIII(i2, length)) {
            char lllllllllllllllllIIlllIlIIIIIIIl = charArray2[i2];
            sb.append((char) (lllllllllllllllllIIlllIlIIIIIIIl ^ charArray[lllllllllllllllllIIlllIIllllllII % charArray.length]));
            "".length();
            lllllllllllllllllIIlllIIllllllII++;
            i2++;
            "".length();
            if ((((29 ^ 41) ^ ((166 ^ 170) & ((78 ^ 66) ^ (-1)))) & (((179 ^ 191) ^ (101 ^ 93)) ^ (-" ".length()))) < 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
}
