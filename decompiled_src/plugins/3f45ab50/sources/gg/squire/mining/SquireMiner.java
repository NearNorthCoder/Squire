package gg.squire.mining;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.mining.overlay.MiningInfoBox;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Instant;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import m.e.i.q.u.r.p000.n.s.e.r.i.A;
import m.e.i.q.u.r.p000.n.s.e.r.i.B;
import m.e.i.q.u.r.p000.n.s.e.r.i.C0009j;
import m.e.i.q.u.r.p000.n.s.e.r.i.C0010k;
import m.e.i.q.u.r.p000.n.s.e.r.i.C0011l;
import m.e.i.q.u.r.p000.n.s.e.r.i.C0012m;
import m.e.i.q.u.r.p000.n.s.e.r.i.C0013n;
import m.e.i.q.u.r.p000.n.s.e.r.i.C0014o;
import m.e.i.q.u.r.p000.n.s.e.r.i.C0015p;
import m.e.i.q.u.r.p000.n.s.e.r.i.C0016q;
import m.e.i.q.u.r.p000.n.s.e.r.i.C0017r;
import m.e.i.q.u.r.p000.n.s.e.r.i.C0018s;
import m.e.i.q.u.r.p000.n.s.e.r.i.C0020u;
import m.e.i.q.u.r.p000.n.s.e.r.i.D;
import m.e.i.q.u.r.p000.n.s.e.r.i.E;
import m.e.i.q.u.r.p000.n.s.e.r.i.F;
import m.e.i.q.u.r.p000.n.s.e.r.i.G;
import m.e.i.q.u.r.p000.n.s.e.r.i.H;
import m.e.i.q.u.r.p000.n.s.e.r.i.I;
import m.e.i.q.u.r.p000.n.s.e.r.i.J;
import m.e.i.q.u.r.p000.n.s.e.r.i.K;
import m.e.i.q.u.r.p000.n.s.e.r.i.L;
import m.e.i.q.u.r.p000.n.s.e.r.i.M;
import m.e.i.q.u.r.p000.n.s.e.r.i.N;
import m.e.i.q.u.r.p000.n.s.e.r.i.O;
import m.e.i.q.u.r.p000.n.s.e.r.i.P;
import m.e.i.q.u.r.p000.n.s.e.r.i.Q;
import m.e.i.q.u.r.p000.n.s.e.r.i.R;
import m.e.i.q.u.r.p000.n.s.e.r.i.T;
import m.e.i.q.u.r.p000.n.s.e.r.i.U;
import m.e.i.q.u.r.p000.n.s.e.r.i.v;
import m.e.i.q.u.r.p000.n.s.e.r.i.w;
import m.e.i.q.u.r.p000.n.s.e.r.i.x;
import m.e.i.q.u.r.p000.n.s.e.r.i.y;
import m.e.i.q.u.r.p000.n.s.e.r.i.z;
import net.runelite.api.Item;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.items.Inventory;
@PluginDescriptor(name = "Squire Miner", enabledByDefault = false, description = "Mining done easy.")
/* loaded from: 3f45ab50-7de6-493f-a8bc-b432dabdf252.jar:gg/squire/mining/SquireMiner.class */
public class SquireMiner extends SquirePlugin {
    private final /* synthetic */ int[] a;
    private final /* synthetic */ int[] b;
    private /* synthetic */ Instant i;
    private static /* synthetic */ String[] llllllIlllll;
    @Inject
    private /* synthetic */ OverlayManager g;
    @Inject
    private /* synthetic */ EventBus c;
    private /* synthetic */ int j;
    private static /* synthetic */ int[] lllllllIIlII;
    @Inject
    private /* synthetic */ SquireMinerConfig f;
    @Inject
    private /* synthetic */ T d;
    @Inject
    private /* synthetic */ U e;
    @Inject
    private /* synthetic */ MiningInfoBox h;

    @Provides
    SquireMinerConfig a(ConfigManager configManager) {
        return (SquireMinerConfig) configManager.getConfig(SquireMinerConfig.class);
    }

    private static void lIIlIlIlIIIlIlI() {
        llllllIlllll = new String[lllllllIIlII[21]];
        llllllIlllll[lllllllIIlII[1]] = lIIlIlIIlllIllI("HhsnKg==", "ZiHZl");
        llllllIlllll[lllllllIIlII[3]] = lIIlIlIIlllIlll("VI4D010Z5bU=", "MWpCV");
        llllllIlllll[lllllllIIlII[5]] = lIIlIlIIlllIlll("v7YiRzZKvjk=", "oUkLr");
        llllllIlllll[lllllllIIlII[7]] = lIIlIlIIlllIlll("4aayH3c/D5E=", "amMEO");
        llllllIlllll[lllllllIIlII[0]] = lIIlIlIIlllIllI("KzcmFBkjYjQJBj8=", "ZBGfk");
        llllllIlllll[lllllllIIlII[14]] = lIIlIlIIllllIII("ziD2KmYrARMgc9SZ1y+QJQ==", "DKzwm");
        llllllIlllll[lllllllIIlII[15]] = lIIlIlIIllllIII("EGcfArhBYxSCOXyooXDZBQ==", "VyETl");
        llllllIlllll[lllllllIIlII[16]] = lIIlIlIIlllIlll("bOiWX5PJak+U1rKRLcRWRA==", "RRzOE");
        llllllIlllll[lllllllIIlII[17]] = lIIlIlIIllllIII("79Z7PdUBhME=", "XCQQQ");
        llllllIlllll[lllllllIIlII[18]] = lIIlIlIIllllIII("HcVmBoWzNio=", "spjQM");
        llllllIlllll[lllllllIIlII[19]] = lIIlIlIIllllIII("5CFwY/b2LIM=", "tGXHg");
        llllllIlllll[lllllllIIlII[20]] = lIIlIlIIlllIlll("E4xrXFpzmJk=", "xkInX");
    }

    public int b() {
        return this.j;
    }

    protected void onStop() {
        this.g.remove(this.h);
        "".length();
        this.c.unregister(this.d);
        this.c.unregister(this.e);
    }

    public SquireMiner() {
        int[] iArr = new int[lllllllIIlII[0]];
        iArr[lllllllIIlII[1]] = lllllllIIlII[2];
        iArr[lllllllIIlII[3]] = lllllllIIlII[4];
        iArr[lllllllIIlII[5]] = lllllllIIlII[6];
        iArr[lllllllIIlII[7]] = lllllllIIlII[8];
        this.a = iArr;
        int[] iArr2 = new int[lllllllIIlII[0]];
        iArr2[lllllllIIlII[1]] = lllllllIIlII[9];
        iArr2[lllllllIIlII[3]] = lllllllIIlII[10];
        iArr2[lllllllIIlII[5]] = lllllllIIlII[11];
        iArr2[lllllllIIlII[7]] = lllllllIIlII[12];
        this.b = iArr2;
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        String message = chatMessage.getMessage();
        if (lIIlIlIlIIIllII(message.contains(llllllIlllll[lllllllIIlII[0]]) ? 1 : 0)) {
            this.j += lllllllIIlII[3];
        }
        if (lIIlIlIlIIIllII(message.contains(llllllIlllll[lllllllIIlII[14]]) ? 1 : 0)) {
            this.j += lllllllIIlII[5];
        }
    }

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[lllllllIIlII[13]];
        clsArr[lllllllIIlII[1]] = I.class;
        clsArr[lllllllIIlII[3]] = J.class;
        clsArr[lllllllIIlII[5]] = C0010k.class;
        clsArr[lllllllIIlII[7]] = F.class;
        clsArr[lllllllIIlII[0]] = B.class;
        clsArr[lllllllIIlII[14]] = E.class;
        clsArr[lllllllIIlII[15]] = z.class;
        clsArr[lllllllIIlII[16]] = H.class;
        clsArr[lllllllIIlII[17]] = G.class;
        clsArr[lllllllIIlII[18]] = D.class;
        clsArr[lllllllIIlII[19]] = A.class;
        clsArr[lllllllIIlII[20]] = C0018s.class;
        clsArr[lllllllIIlII[21]] = C0009j.class;
        clsArr[lllllllIIlII[22]] = x.class;
        clsArr[lllllllIIlII[23]] = C0020u.class;
        clsArr[lllllllIIlII[24]] = w.class;
        clsArr[lllllllIIlII[25]] = C0015p.class;
        clsArr[lllllllIIlII[26]] = C0014o.class;
        clsArr[lllllllIIlII[27]] = C0013n.class;
        clsArr[lllllllIIlII[28]] = O.class;
        clsArr[lllllllIIlII[29]] = P.class;
        clsArr[lllllllIIlII[30]] = R.class;
        clsArr[lllllllIIlII[31]] = Q.class;
        clsArr[lllllllIIlII[32]] = v.class;
        clsArr[lllllllIIlII[33]] = L.class;
        clsArr[lllllllIIlII[34]] = K.class;
        clsArr[lllllllIIlII[35]] = N.class;
        clsArr[lllllllIIlII[36]] = M.class;
        clsArr[lllllllIIlII[37]] = y.class;
        clsArr[lllllllIIlII[38]] = C0017r.class;
        clsArr[lllllllIIlII[39]] = C0016q.class;
        clsArr[lllllllIIlII[40]] = C0011l.class;
        clsArr[lllllllIIlII[41]] = C0012m.class;
        return clsArr;
    }

    private static String lIIlIlIIlllIlll(String lllllllllllllllIIlIIIlIlIIIllIll, String lllllllllllllllIIlIIIlIlIIIllIlI) {
        try {
            SecretKeySpec lllllllllllllllIIlIIIlIlIIIllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIlIlIIIllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllllllIIlII[5], lllllllllllllllIIlIIIlIlIIIllllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIlIlIIIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIIlIlIIIlllII) {
            lllllllllllllllIIlIIIlIlIIIlllII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlIlIIIllII(int i) {
        return i != 0;
    }

    public Instant getStarted() {
        return this.i;
    }

    private static void lIIlIlIlIIIlIll() {
        lllllllIIlII = new int[46];
        lllllllIIlII[0] = (66 ^ 78) ^ (60 ^ 52);
        lllllllIIlII[1] = (55 ^ 107) & ((208 ^ 140) ^ (-1));
        lllllllIIlII[2] = (((((169 + 104) - 176) + 120) + (((12 + 93) - 79) + 197)) - ((-6146) & 6451)) + (46 ^ 93);
        lllllllIIlII[3] = " ".length();
        lllllllIIlII[4] = ((170 + 64) - 210) + 227;
        lllllllIIlII[5] = "  ".length();
        lllllllIIlII[6] = ((231 + 149) - 324) + 197;
        lllllllIIlII[7] = "   ".length();
        lllllllIIlII[8] = (((10 ^ 50) + (234 ^ 137)) - (((22 + 91) - (-8)) + 20)) + ((136 + 88) - 147) + 164;
        lllllllIIlII[9] = ((41 + 98) - 83) + 143;
        lllllllIIlII[10] = (((((87 + 20) - 82) + 131) + (255 ^ 137)) - (42 ^ 78)) + (171 ^ 176);
        lllllllIIlII[11] = (((((74 + 29) - 67) + 106) + (212 ^ 155)) - (((94 + 70) - 27) + 28)) + ((29 + 133) - 146) + 131;
        lllllllIIlII[12] = ((98 + 179) - 213) + 141;
        lllllllIIlII[13] = (90 ^ 84) ^ (82 ^ 125);
        lllllllIIlII[14] = 157 ^ 152;
        lllllllIIlII[15] = (206 ^ 189) ^ (12 ^ 121);
        lllllllIIlII[16] = (((108 + 57) - 77) + 44) ^ (((113 + 90) - 132) + 60);
        lllllllIIlII[17] = 145 ^ 153;
        lllllllIIlII[18] = 82 ^ 91;
        lllllllIIlII[19] = 43 ^ 33;
        lllllllIIlII[20] = 11 ^ 0;
        lllllllIIlII[21] = (22 ^ 40) ^ (45 ^ 31);
        lllllllIIlII[22] = (37 ^ 24) ^ (78 ^ 126);
        lllllllIIlII[23] = (((128 + 86) - 78) + 18) ^ (((119 + 18) - 116) + 127);
        lllllllIIlII[24] = 71 ^ 72;
        lllllllIIlII[25] = (84 ^ 122) ^ (32 ^ 30);
        lllllllIIlII[26] = 93 ^ 76;
        lllllllIIlII[27] = (6 ^ 10) ^ (82 ^ 76);
        lllllllIIlII[28] = 57 ^ 42;
        lllllllIIlII[29] = (35 ^ 31) ^ (76 ^ 100);
        lllllllIIlII[30] = 181 ^ 160;
        lllllllIIlII[31] = "   ".length() ^ (41 ^ 60);
        lllllllIIlII[32] = (((142 + 57) - 25) + 14) ^ (((17 + 157) - 47) + 44);
        lllllllIIlII[33] = 98 ^ 122;
        lllllllIIlII[34] = (((49 + 19) - 67) + 174) ^ (((13 + 28) - 24) + 165);
        lllllllIIlII[35] = 95 ^ 69;
        lllllllIIlII[36] = 88 ^ 67;
        lllllllIIlII[37] = 37 ^ 57;
        lllllllIIlII[38] = 123 ^ 102;
        lllllllIIlII[39] = 217 ^ 199;
        lllllllIIlII[40] = (240 ^ 167) ^ (15 ^ 71);
        lllllllIIlII[41] = 126 ^ 94;
        lllllllIIlII[42] = (-((-5649) & 22069)) & (-12361) & 30719;
        lllllllIIlII[43] = (-((-6449) & 31097)) & (-4098) & 29691;
        lllllllIIlII[44] = (-513) & 6845;
        lllllllIIlII[45] = (-8769) & 15100;
    }

    private static String lIIlIlIIllllIII(String lllllllllllllllIIlIIIlIlIIlIlIII, String lllllllllllllllIIlIIIlIlIIlIIlll) {
        try {
            SecretKeySpec lllllllllllllllIIlIIIlIlIIlIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIlIlIIlIIlll.getBytes(StandardCharsets.UTF_8)), lllllllIIlII[17]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllllllIIlII[5], lllllllllllllllIIlIIIlIlIIlIlIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIlIlIIlIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIIlIlIIlIlIIl) {
            lllllllllllllllIIlIIIlIlIIlIlIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlIlIIIlllI(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIlIlIlIIIllIl(int i) {
        return i == 0;
    }

    protected void onStart() {
        this.i = Instant.now();
        this.g.add(this.h);
        "".length();
        this.d.A();
        this.c.register(this.d);
        this.c.register(this.e);
        this.j = lllllllIIlII[1];
    }

    static {
        lIIlIlIlIIIlIll();
        lIIlIlIlIIIlIlI();
    }

    public void a() {
        if (lIIlIlIlIIIllII(Inventory.contains(item -> {
            return item.getName().contains(llllllIlllll[lllllllIIlII[20]]);
        }) ? 1 : 0)) {
            Inventory.getFirst(item2 -> {
                return item2.getName().contains(llllllIlllll[lllllllIIlII[19]]);
            }).interact(llllllIlllll[lllllllIIlII[1]]);
        }
        if (lIIlIlIlIIIllIl(Inventory.contains(this.a) ? 1 : 0) && lIIlIlIlIIIllII(Inventory.contains(this.b) ? 1 : 0)) {
            Inventory.getFirst(this.b).interact(llllllIlllll[lllllllIIlII[3]]);
        }
        if (lIIlIlIlIIIllII(Inventory.contains(item3 -> {
            return item3.getName().contains(llllllIlllll[lllllllIIlII[18]]);
        }) ? 1 : 0)) {
            Inventory.getFirst(item4 -> {
                return item4.getName().contains(llllllIlllll[lllllllIIlII[17]]);
            }).interact(llllllIlllll[lllllllIIlII[5]]);
        }
        if (lIIlIlIlIIIllIl(this.f.deposit() ? 1 : 0) && lIIlIlIlIIIllII(Inventory.contains(item5 -> {
            return item5.getName().contains(llllllIlllll[lllllllIIlII[16]]);
        }) ? 1 : 0)) {
            Inventory.getFirst(item6 -> {
                return item6.getName().contains(llllllIlllll[lllllllIIlII[15]]);
            }).interact(llllllIlllll[lllllllIIlII[7]]);
        }
        if (lIIlIlIlIIIllII(Inventory.contains(this.a) ? 1 : 0)) {
            Item first = Inventory.getFirst(this.a);
            int[] iArr = new int[lllllllIIlII[3]];
            iArr[lllllllIIlII[1]] = lllllllIIlII[42];
            first.useOn(Inventory.getFirst(iArr));
        }
        int[] iArr2 = new int[lllllllIIlII[3]];
        iArr2[lllllllIIlII[1]] = lllllllIIlII[43];
        if (lIIlIlIlIIIllII(Inventory.contains(iArr2) ? 1 : 0)) {
            int[] iArr3 = new int[lllllllIIlII[3]];
            iArr3[lllllllIIlII[1]] = lllllllIIlII[44];
            if (lIIlIlIlIIIllII(Inventory.contains(iArr3) ? 1 : 0)) {
                int[] iArr4 = new int[lllllllIIlII[3]];
                iArr4[lllllllIIlII[1]] = lllllllIIlII[43];
                Item first2 = Inventory.getFirst(iArr4);
                int[] iArr5 = new int[lllllllIIlII[3]];
                iArr5[lllllllIIlII[1]] = lllllllIIlII[44];
                first2.useOn(Inventory.getFirst(iArr5));
                "".length();
                if ((-"  ".length()) > 0) {
                    return;
                }
                return;
            }
            int[] iArr6 = new int[lllllllIIlII[3]];
            iArr6[lllllllIIlII[1]] = lllllllIIlII[45];
            if (lIIlIlIlIIIllII(Inventory.contains(iArr6) ? 1 : 0)) {
                int[] iArr7 = new int[lllllllIIlII[3]];
                iArr7[lllllllIIlII[1]] = lllllllIIlII[43];
                Item first3 = Inventory.getFirst(iArr7);
                int[] iArr8 = new int[lllllllIIlII[3]];
                iArr8[lllllllIIlII[1]] = lllllllIIlII[45];
                first3.useOn(Inventory.getFirst(iArr8));
            }
        }
    }

    private static String lIIlIlIIlllIllI(String lllllllllllllllIIlIIIlIlIIIIlIll, String lllllllllllllllIIlIIIlIlIIIIlIlI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIIlIlIIIIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIIlIIIlIlIIIIlIlI.toCharArray();
        int lllllllllllllllIIlIIIlIlIIIIIlll = lllllllIIlII[1];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lllllllIIlII[1];
        while (lIIlIlIlIIIlllI(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[lllllllllllllllIIlIIIlIlIIIIIlll % charArray.length]));
            "".length();
            lllllllllllllllIIlIIIlIlIIIIIlll++;
            i++;
            "".length();
            if (" ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
}
