package gg.squire.account;

import com.google.inject.Provides;
import f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.C;
import f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.C0004e;
import f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.C0015p;
import f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.C0020u;
import f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G;
import f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.S;
import f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.U;
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
@PluginDescriptor(name = "Squire Rogues Outfit Builder", enabledByDefault = false)
/* loaded from: fdd2f9b9-6584-4a70-afa7-d1946c214094.jar:gg/squire/account/AccBuilderRogues.class */
public class AccBuilderRogues extends Script {
    /* synthetic */ boolean t;
    public static /* synthetic */ List<G> a;
    @Inject
    private /* synthetic */ BuilderInfoBox w;
    @Inject
    public /* synthetic */ BuilderConfig q;
    public static /* synthetic */ boolean d;
    static /* synthetic */ String o;
    @Inject
    private /* synthetic */ OverlayManager v;
    private static /* synthetic */ int[] lIIlllllIl;

    /* renamed from: f  reason: collision with root package name */
    public static /* synthetic */ int f3f;
    static /* synthetic */ int n;
    public static /* synthetic */ String l;
    public static /* synthetic */ String c;
    private static /* synthetic */ String[] lIIlllllII;
    private static /* synthetic */ G[] p;
    public static /* synthetic */ String h;
    public static /* synthetic */ long g;
    public static /* synthetic */ String k;
    public static /* synthetic */ String j;
    public static /* synthetic */ boolean e;
    public static /* synthetic */ long b;
    public static /* synthetic */ String m;
    public static /* synthetic */ HashMap<WorldPoint, Integer> i;
    @Inject
    private /* synthetic */ Client u;
    /* synthetic */ WorldArea r = new WorldArea(lIIlllllIl[0], lIIlllllIl[1], lIIlllllIl[2], lIIlllllIl[3], lIIlllllIl[4]);
    /* synthetic */ String s = lIIlllllII[lIIlllllIl[4]];

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v68, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v77, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v81, types: [boolean] */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (lIIIIllIlIllI(chatMessage.getMessage().contains(lIIlllllII[lIIlllllIl[23]]) ? 1 : 0)) {
            System.out.println(lIIlllllII[lIIlllllIl[24]]);
            d = lIIlllllIl[5];
        }
        if (lIIIIllIlIllI(chatMessage.getMessage().contains(lIIlllllII[lIIlllllIl[25]]) ? 1 : 0)) {
            System.out.println(lIIlllllII[lIIlllllIl[26]]);
            if (lIIIIllIlIIll(Game.getWildyLevel()) && lIIIIllIlIIll(Inventory.contains(item -> {
                return item.getName().contains(lIIlllllII[lIIlllllIl[42]]);
            }) ? 1 : 0)) {
                d = lIIlllllIl[5];
                System.out.println(lIIlllllII[lIIlllllIl[27]]);
            }
            if (!lIIIIllIllIlI(Game.getWildyLevel()) || lIIIIllIlIllI(Inventory.contains(item2 -> {
                return item2.getName().contains(lIIlllllII[lIIlllllIl[41]]);
            }) ? 1 : 0)) {
                d = lIIlllllIl[4];
                System.out.println(lIIlllllII[lIIlllllIl[28]]);
            }
        }
        if (lIIIIllIlIllI(chatMessage.getMessage().contains(lIIlllllII[lIIlllllIl[29]]) ? 1 : 0) && lIIIIllIllIIl(Players.getLocal().getWorldLocation().distanceTo(C.hV), lIIlllllIl[18])) {
            String[] strArr = new String[lIIlllllIl[5]];
            strArr[lIIlllllIl[4]] = lIIlllllII[lIIlllllIl[30]];
            if (lIIIIllIlIlII(TileObjects.getNearest(strArr))) {
                String[] strArr2 = new String[lIIlllllIl[5]];
                strArr2[lIIlllllIl[4]] = lIIlllllII[lIIlllllIl[19]];
                TileObjects.getNearest(strArr2).interact(lIIlllllII[lIIlllllIl[31]]);
                Time.sleepTicks(lIIlllllIl[11]);
                "".length();
            }
            String[] strArr3 = new String[lIIlllllIl[5]];
            strArr3[lIIlllllIl[4]] = lIIlllllII[lIIlllllIl[32]];
            if (lIIIIllIlIlII(TileObjects.getNearest(strArr3))) {
                String[] strArr4 = new String[lIIlllllIl[5]];
                strArr4[lIIlllllIl[4]] = lIIlllllII[lIIlllllIl[33]];
                TileObjects.getNearest(strArr4).interact(lIIlllllII[lIIlllllIl[34]]);
                Time.sleepTicks(lIIlllllIl[10]);
                "".length();
            }
        }
        if (lIIIIllIlIllI(chatMessage.getMessage().contains(lIIlllllII[lIIlllllIl[35]]) ? 1 : 0)) {
            Movement.walkTo(new WorldPoint(lIIlllllIl[36], lIIlllllIl[37], lIIlllllIl[4]));
            "".length();
            Time.sleepTicks(lIIlllllIl[5]);
            "".length();
        }
        if (lIIIIllIlIllI(chatMessage.getMessage().contains(lIIlllllII[lIIlllllIl[38]]) ? 1 : 0)) {
            int[] iArr = new int[lIIlllllIl[5]];
            iArr[lIIlllllIl[4]] = lIIlllllIl[39];
            if (lIIIIllIlIllI(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIIlllllIl[5]];
                iArr2[lIIlllllIl[4]] = lIIlllllIl[39];
                Inventory.getFirst(iArr2).interact(lIIlllllII[lIIlllllIl[40]]);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    static {
        lIIIIllIlIIIl();
        lIIIIllIlIIII();
        a = new ArrayList();
        b = System.currentTimeMillis();
        d = lIIlllllIl[4];
        g = System.currentTimeMillis();
        h = lIIlllllII[lIIlllllIl[43]];
        i = new HashMap<>();
        j = null;
        k = null;
        m = Static.getClient().getDiscordId();
        G[] gArr = new G[lIIlllllIl[5]];
        gArr[lIIlllllIl[4]] = new U();
        p = gArr;
    }

    private static boolean lIIIIllIllIlI(int i2) {
        return i2 <= 0;
    }

    private static String lIIIIllIIllll(String llllllllllllllllllllIlllIIIIlIll, String llllllllllllllllllllIlllIIIIlIlI) {
        try {
            SecretKeySpec llllllllllllllllllllIlllIIIIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllllIlllIIIIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllllIlllIIIIllIl = Cipher.getInstance("Blowfish");
            llllllllllllllllllllIlllIIIIllIl.init(lIIlllllIl[9], llllllllllllllllllllIlllIIIIlllI);
            return new String(llllllllllllllllllllIlllIIIIllIl.doFinal(Base64.getDecoder().decode(llllllllllllllllllllIlllIIIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllllIlllIIIIllII) {
            llllllllllllllllllllIlllIIIIllII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0084, code lost:
        if (lIIIIllIlIllI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L11;
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
        if (lIIIIllIlIlII(Players.getNearest(player -> {
            if (lIIIIllIlllIl(player, local) && lIIIIllIlIllI(a(wildyLevel, combatLevel, player) ? 1 : 0)) {
                ?? r0 = lIIlllllIl[5];
                "".length();
                return "  ".length() <= (((139 ^ 165) ^ (179 ^ 147)) & (((((106 + 91) - 73) + 3) ^ (3 ^ 114)) ^ (-" ".length()))) ? ((111 ^ 7) ^ (86 ^ 18)) & (((((67 + 182) - 157) + 91) ^ (((94 + 76) - 131) + 116)) ^ (-" ".length())) : r0;
            }
            return lIIlllllIl[4];
        })) && (!lIIIIllIllIlI(Game.getWildyLevel()) || lIIIIllIllIIl(Players.getLocal().getWorldLocation().distanceTo(S.jv), lIIlllllIl[19]))) {
            int[] iArr = new int[lIIlllllIl[5]];
            iArr[lIIlllllIl[4]] = lIIlllllIl[20];
            if (lIIIIllIlIIll(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIIlllllIl[5]];
                iArr2[lIIlllllIl[4]] = lIIlllllIl[21];
            }
            if (lIIIIllIlIIll(this.r.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Game.logout();
            }
        }
        if (lIIIIllIlIllI(Dialog.isOpen() ? 1 : 0) && lIIIIllIlIlII(Dialog.getText()) && lIIIIllIlIllI(Dialog.getText().contains(lIIlllllII[lIIlllllIl[22]]) ? 1 : 0)) {
            C0020u.cX = lIIlllllIl[5];
        }
        C0004e.G();
    }

    private static boolean lIIIIllIlIIll(int i2) {
        return i2 == 0;
    }

    private static void lIIIIllIlIIIl() {
        lIIlllllIl = new int[45];
        lIIlllllIl[0] = (-4313) & 7423;
        lIIlllllIl[1] = (-167) & 3766;
        lIIlllllIl[2] = 30 ^ 32;
        lIIlllllIl[3] = (((137 + 137) - 242) + 210) ^ (((147 + 38) - 64) + 78);
        lIIlllllIl[4] = (110 ^ 82) & ((75 ^ 119) ^ (-1));
        lIIlllllIl[5] = " ".length();
        lIIlllllIl[6] = (0 ^ 84) ^ (153 ^ 169);
        lIIlllllIl[7] = (-14563) & 14843;
        lIIlllllIl[8] = (-4119) & 5118;
        lIIlllllIl[9] = "  ".length();
        lIIlllllIl[10] = "   ".length();
        lIIlllllIl[11] = 88 ^ 92;
        lIIlllllIl[12] = (-18435) & 19034;
        lIIlllllIl[13] = 183 ^ 178;
        lIIlllllIl[14] = (107 ^ 116) ^ (50 ^ 43);
        lIIlllllIl[15] = 158 ^ 153;
        lIIlllllIl[16] = (3 ^ 96) ^ (82 ^ 57);
        lIIlllllIl[17] = (133 ^ 175) ^ (78 ^ 109);
        lIIlllllIl[18] = (((18 + 62) - 24) + 112) ^ (((131 + 30) - 75) + 76);
        lIIlllllIl[19] = 112 ^ 100;
        lIIlllllIl[20] = (-((-13641) & 32201)) & (-1284) & 20379;
        lIIlllllIl[21] = (-30085) & 30621;
        lIIlllllIl[22] = (((29 + 172) - 129) + 114) ^ (((50 + 132) - 86) + 81);
        lIIlllllIl[23] = (((144 + 65) - 193) + 159) ^ (((152 + 70) - 130) + 71);
        lIIlllllIl[24] = (((48 + 23) - (-9)) + 105) ^ (((109 + 136) - 237) + 172);
        lIIlllllIl[25] = (150 ^ 188) ^ (72 ^ 108);
        lIIlllllIl[26] = (127 ^ 89) ^ (175 ^ 134);
        lIIlllllIl[27] = 49 ^ 33;
        lIIlllllIl[28] = 117 ^ 100;
        lIIlllllIl[29] = 90 ^ 72;
        lIIlllllIl[30] = 28 ^ 15;
        lIIlllllIl[31] = 64 ^ 85;
        lIIlllllIl[32] = 114 ^ 100;
        lIIlllllIl[33] = (((18 + 15) - (-64)) + 67) ^ (((165 + 171) - 307) + 150);
        lIIlllllIl[34] = 7 ^ 31;
        lIIlllllIl[35] = 163 ^ 186;
        lIIlllllIl[36] = (-12371) & 15347;
        lIIlllllIl[37] = (-((-5157) & 14205)) & (-20481) & 32767;
        lIIlllllIl[38] = (62 ^ 2) ^ (86 ^ 112);
        lIIlllllIl[39] = (-((-16581) & 28373)) & (-4097) & 16319;
        lIIlllllIl[40] = 67 ^ 88;
        lIIlllllIl[41] = (((4 + 35) - (-29)) + 119) ^ (((114 + 112) - 213) + 154);
        lIIlllllIl[42] = (60 ^ 91) ^ (126 ^ 4);
        lIIlllllIl[43] = 12 ^ 18;
        lIIlllllIl[44] = 175 ^ 176;
    }

    private static boolean lIIIIllIlIlIl(Object obj) {
        return obj == null;
    }

    private static boolean lIIIIllIlIlII(Object obj) {
        return obj != null;
    }

    private static boolean lIIIIllIllIll(int i2, int i3) {
        return i2 >= i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    public void onStart(String... strArr) {
        SquirePlugin.setGlobalMouseRecordings();
        "".length();
        d = lIIlllllIl[4];
        System.out.print(lIIlllllII[lIIlllllIl[13]]);
        this.v.add(this.w);
        "".length();
        a.clear();
        o = lIIlllllII[lIIlllllIl[14]];
        System.out.println(lIIlllllII[lIIlllllIl[15]]);
        a.clear();
        List<G> list = a;
        C0015p[] c0015pArr = new C0015p[lIIlllllIl[5]];
        c0015pArr[lIIlllllIl[4]] = new C0015p();
        Collections.addAll(list, c0015pArr);
        "".length();
        g = System.currentTimeMillis();
        Collections.shuffle(a);
    }

    private static boolean lIIIIllIllIIl(int i2, int i3) {
        return i2 <= i3;
    }

    @Subscribe
    private void a(LoginStateChanged loginStateChanged) {
        if (!lIIIIllIlllII(loginStateChanged.getIndex(), lIIlllllIl[25]) && lIIIIllIlIIll(n)) {
            C0004e.a(this.s, "rsn: " + k + " account has been banned? - Acc builder " + o);
            n += lIIlllllIl[5];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    @Subscribe
    private void a(ConfigChanged configChanged) {
        if (lIIIIllIlIllI(configChanged.getGroup().equalsIgnoreCase(lIIlllllII[lIIlllllIl[16]]) ? 1 : 0) && lIIIIllIlIllI(configChanged.getKey().contains(lIIlllllII[lIIlllllIl[17]]) ? 1 : 0)) {
            this.t = this.q.turnScriptOnOff();
            if (!lIIIIllIlIllI(this.t ? 1 : 0)) {
                d = lIIlllllIl[5];
                return;
            }
            d = lIIlllllIl[4];
            "".length();
            if (true ^ true) {
            }
        }
    }

    private static boolean lIIIIllIlIlll(int i2, int i3) {
        return i2 == i3;
    }

    private static boolean lIIIIllIlIllI(int i2) {
        return i2 != 0;
    }

    private static boolean lIIIIllIlllII(int i2, int i3) {
        return i2 != i3;
    }

    private static void lIIIIllIlIIII() {
        lIIlllllII = new String[lIIlllllIl[44]];
        lIIlllllII[lIIlllllIl[4]] = lIIIIllIIllIl("DR42GTpfRW0NIBYJLRstSwktBGYEGitGPgAIKgYmDhltWHtUX3ZYf1ddcFt9Ulp0W3xcUm0KOAkSclsPFwQmHC5SLCA5DTE5MgMfEyY6PnwJKXUBKxFfCTx7Ci0gHSJIEHoGB1YPBCMnUF4bDhYrWSouJFQpcygCIw==", "ejBiI");
        lIIlllllII[lIIlllllIl[5]] = lIIIIllIIlllI("E1LI4P7ajtQ=", "NBERV");
        lIIlllllII[lIIlllllIl[9]] = lIIIIllIIllIl("NQoFLiYdChgoZDYmVjglAw0fISM=", "qcvOD");
        lIIlllllII[lIIlllllIl[10]] = lIIIIllIIllll("pGCK65WM2lCr/5C1ABsaw0Sitx7P1/EX", "zbpiw");
        lIIlllllII[lIIlllllIl[11]] = lIIIIllIIllIl("Jxk+PSQJFTR0NgITPyE5FQ==", "apPTW");
        lIIlllllII[lIIlllllIl[13]] = lIIIIllIIllIl("WhUeNC83JyAFegAiOz8zPm49LDsiOic2PXA7PlI=", "PNNXZ");
        lIIlllllII[lIIlllllIl[14]] = lIIIIllIIlllI("sx1/sP4sNdDMZCkTOEZWZw==", "AnMeR");
        lIIlllllII[lIIlllllIl[15]] = lIIIIllIIllIl("OgY+BDABGDkXcx0edz89DFEUHDoKGnciPA4EMgNzJgQjFjodUTYTMAYEOQQ=", "iqWpS");
        lIIlllllII[lIIlllllIl[16]] = lIIIIllIIlllI("80pPwe9SxxSKir09oWJwMQ==", "WpEuo");
        lIIlllllII[lIIlllllIl[17]] = lIIIIllIIllIl("LzYGJxkvPA==", "JXgEu");
        lIIlllllII[lIIlllllIl[18]] = lIIIIllIIllll("TUh0eWbzwsCawbSOPM9aTdW0CP2Oz9DqJPfOy2WDaQ8=", "OiScH");
        lIIlllllII[lIIlllllIl[22]] = lIIIIllIIllIl("Myk1KXQzJDxlPy4iPg==", "GLYET");
        lIIlllllII[lIIlllllIl[23]] = lIIIIllIIllll("VM8kSmLIjvTtFFMr/KkTPyRpO3+Cx0lj", "OhsJV");
        lIIlllllII[lIIlllllIl[24]] = lIIIIllIIllIl("Jyk8eCIHKT0/L0khJzQjSSAnKmcLMzExKQ4=", "iFHXG");
        lIIlllllII[lIIlllllIl[25]] = lIIIIllIIlllI("2q2Un0kV3z01V62c91M0zHUU0kMbvoER", "DHQrB");
        lIIlllllII[lIIlllllIl[26]] = lIIIIllIIllIl("ACdWNzwSBldSVW1q", "WBvsu");
        lIIlllllII[lIIlllllIl[27]] = lIIIIllIIllIl("EDskJ3B5cgQtND08JmMjNyAoMyRuchEvNTUhJGMiMSIuMSR0JSkiJHQjNCYjIHIoN3AwOyQncDs8YSI+MHItLDM1JigsPnghNSYgdDsnYyk7J2EwMSM=", "TRACP");
        lIIlllllII[lIIlllllIl[28]] = lIIIIllIIlllI("R05lWscYisDQ9YzGON3XOQ2tkZn8u9lyyS41M47xKCX+V/Bi5OFO1BWcVfu6CV7CDFy947Dq4TUFp/6svE1eCZzfVc6XJYIGtPVs3jU1PKdD+QV3Btm9DGNtQr37qhHQ04IaTFid2uoAcz/++ROWKfuytI5m3tG4ycXQO5pc5ZY=", "BPyXg");
        lIIlllllII[lIIlllllIl[29]] = lIIIIllIIllll("91acibrDM1IGxv18a3l/1xfgXxBK2SSg", "ThDzZ");
        lIIlllllII[lIIlllllIl[30]] = lIIIIllIIllll("kcMQTjOZ4f8=", "IaRLU");
        lIIlllllII[lIIlllllIl[19]] = lIIIIllIIlllI("jaI03b5DTJ0=", "KMWvn");
        lIIlllllII[lIIlllllIl[31]] = lIIIIllIIllIl("BRohHQ==", "JjDsR");
        lIIlllllII[lIIlllllIl[32]] = lIIIIllIIlllI("4QRtFiS8W0OqOhr/yy0wlg==", "FYTqO");
        lIIlllllII[lIIlllllIl[33]] = lIIIIllIIllIl("JCIqH3A0PyAI", "pPOzP");
        lIIlllllII[lIIlllllIl[34]] = lIIIIllIIllIl("KzsyFw==", "dKWyF");
        lIIlllllII[lIIlllllIl[35]] = lIIIIllIIlllI("Fjgws1d2eM0I5x3ow2DumWDyhHetPKOD", "meVbd");
        lIIlllllII[lIIlllllIl[38]] = lIIIIllIIllll("G+0okapZ9uKhD0AIY7DGtyzH7dTwXCJO", "ORAdT");
        lIIlllllII[lIIlllllIl[40]] = lIIIIllIIlllI("/gcNXH0nc9U=", "JetMp");
        lIIlllllII[lIIlllllIl[41]] = lIIIIllIIlllI("iWpRChDDa08=", "JzAFG");
        lIIlllllII[lIIlllllIl[42]] = lIIIIllIIllll("vcdHxDZ8jrQ=", "tzyVb");
        lIIlllllII[lIIlllllIl[43]] = lIIIIllIIlllI("AvzWY2ltiaQ=", "ikaAZ");
    }

    private static String lIIIIllIIllIl(String llllllllllllllllllllIllIlllllIll, String llllllllllllllllllllIllIlllllIlI) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllllllIllIlllllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllllIllIlllllIIl = new StringBuilder();
        char[] charArray = llllllllllllllllllllIllIlllllIlI.toCharArray();
        int llllllllllllllllllllIllIllllIlll = lIIlllllIl[4];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i2 = lIIlllllIl[4];
        while (lIIIIllIllllI(i2, length)) {
            llllllllllllllllllllIllIlllllIIl.append((char) (charArray2[i2] ^ charArray[llllllllllllllllllllIllIllllIlll % charArray.length]));
            "".length();
            llllllllllllllllllllIllIllllIlll++;
            i2++;
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllllllIllIlllllIIl);
    }

    private static boolean lIIIIllIllIII(int i2, int i3) {
        return i2 > i3;
    }

    @Provides
    public BuilderConfig a(ConfigManager configManager) {
        return (BuilderConfig) configManager.getConfig(BuilderConfig.class);
    }

    private static boolean lIIIIllIlIIlI(Object obj, Object obj2) {
        return obj == obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    protected void shutDown() {
        this.v.remove(this.w);
        "".length();
        d = lIIlllllIl[5];
        p = new G[lIIlllllIl[4]];
        n = lIIlllllIl[4];
        f3f = lIIlllllIl[4];
        System.out.print(lIIlllllII[lIIlllllIl[18]]);
        super.stop();
    }

    private static boolean lIIIIllIlllIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean a(int i2, int i3, Player player) {
        int combatLevel = player.getCombatLevel();
        int i4 = i3 + i2;
        if (lIIIIllIllIll(combatLevel, i3 - i2) && lIIIIllIllIIl(combatLevel, i4)) {
            ?? r0 = lIIlllllIl[5];
            "".length();
            return ((31 ^ 82) & ((112 ^ 61) ^ (-1))) < (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIlllllIl[4];
    }

    private static boolean lIIIIllIllllI(int i2, int i3) {
        return i2 < i3;
    }

    protected int loop() {
        if (lIIIIllIlIIlI(Game.getState(), GameState.LOGGED_IN)) {
            if (lIIIIllIlIIll(a.isEmpty() ? 1 : 0)) {
                if (!lIIIIllIlIlII(j) || lIIIIllIlIlIl(k)) {
                    k = Players.getLocal().getName();
                }
                k = Players.getLocal().getName();
                if (lIIIIllIlIllI(a.get(lIIlllllIl[4]).V() ? 1 : 0)) {
                    if (lIIIIllIlIllI(a.get(lIIlllllIl[4]).U().contains(lIIlllllII[lIIlllllIl[5]]) ? 1 : 0)) {
                        f3f += lIIlllllIl[5];
                    }
                    System.out.println("Achieved " + a.get(lIIlllllIl[4]).U() + " goal");
                    a.remove(lIIlllllIl[4]);
                    "".length();
                    return lIIlllllIl[6];
                } else if (lIIIIllIlIIlI(Game.getState(), GameState.LOGGED_IN)) {
                    while (lIIIIllIlIllI(C0004e.x() ? 1 : 0) && lIIIIllIlIIll(d ? 1 : 0) && lIIIIllIlIlll(C0004e.j(lIIlllllIl[7]), lIIlllllIl[8]) && lIIIIllIlIIll(Dialog.isOpen() ? 1 : 0)) {
                        c = lIIlllllII[lIIlllllIl[9]];
                        C0004e.y();
                        Time.sleepTicks(lIIlllllIl[5]);
                        "".length();
                        "".length();
                        if (0 != 0) {
                            return ((((6 + 161) - 6) + 8) ^ (((64 + 166) - 139) + 85)) & (((((108 + 111) - 202) + 113) ^ (((120 + 132) - 182) + 85)) ^ (-" ".length()));
                        }
                    }
                    int i2 = lIIlllllIl[4];
                    try {
                        i2 = a.get(lIIlllllIl[4]).T();
                        "".length();
                        if (" ".length() == (-" ".length())) {
                            return ((217 ^ 191) ^ (226 ^ 167)) & (((100 ^ 124) ^ (113 ^ 74)) ^ (-" ".length()));
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    return i2;
                }
            }
            if (lIIIIllIlIllI(a.isEmpty() ? 1 : 0)) {
                if (lIIIIllIllIII(Players.getLocal().getWorldLocation().distanceTo(U.jL), lIIlllllIl[10])) {
                    c = lIIlllllII[lIIlllllIl[10]];
                    Movement.walkTo(U.jL);
                    "".length();
                }
                if (lIIIIllIllIIl(Players.getLocal().getWorldLocation().distanceTo(U.jL), lIIlllllIl[10])) {
                    c = lIIlllllII[lIIlllllIl[11]];
                }
            }
        }
        return lIIlllllIl[12];
    }

    private static String lIIIIllIIlllI(String llllllllllllllllllllIllIlllIIllI, String llllllllllllllllllllIllIlllIIlIl) {
        try {
            SecretKeySpec llllllllllllllllllllIllIlllIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllllIllIlllIIlIl.getBytes(StandardCharsets.UTF_8)), lIIlllllIl[16]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIlllllIl[9], llllllllllllllllllllIllIlllIlIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllllIllIlllIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllllIllIlllIIlll) {
            llllllllllllllllllllIllIlllIIlll.printStackTrace();
            return null;
        }
    }
}
