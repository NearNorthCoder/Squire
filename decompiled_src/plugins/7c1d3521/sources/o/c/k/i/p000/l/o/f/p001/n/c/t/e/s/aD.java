package o.c.k.i.p000.l.o.f.p001.n.c.t.e.s;

import gg.squire.account.AccBuilderSotf;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.aD  reason: invalid package */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/aD.class */
public class aD implements InterfaceC0003ac {
    static final /* synthetic */ WorldPoint pi;
    public static /* synthetic */ boolean bt;
    private static /* synthetic */ int[] llIIlIllII;
    public static final /* synthetic */ WorldPoint pe;
    private static /* synthetic */ String[] llIIlIlIll;
    public static final /* synthetic */ WorldPoint pd;
    public static /* synthetic */ List<C0017d> bv;
    private final /* synthetic */ int pk = llIIlIllII[0];
    public static final /* synthetic */ WorldPoint pg;
    public static final /* synthetic */ WorldPoint pf;
    static final /* synthetic */ WorldPoint ph;
    static final /* synthetic */ WorldPoint pj;

    private static void lIlIlIlIllIll() {
        llIIlIllII = new int[88];
        llIIlIllII[0] = (-((-4185) & 7551)) & (-4289) & 8190;
        llIIlIllII[1] = (33 ^ 30) & ((155 ^ 164) ^ (-1));
        llIIlIllII[2] = " ".length();
        llIIlIllII[3] = "  ".length();
        llIIlIllII[4] = "   ".length();
        llIIlIllII[5] = (-3156) & 8155;
        llIIlIllII[6] = 195 ^ 199;
        llIIlIllII[7] = (-((-16422) & 18551)) & (-1025) & 24319;
        llIIlIllII[8] = (-((-8193) & 28163)) & (-1) & 32595;
        llIIlIllII[9] = (-((-1149) & 29821)) & (-5) & 29671;
        llIIlIllII[10] = (-((-3052) & 19455)) & (-5697) & 32599;
        llIIlIllII[11] = ((22 + 171) - 183) + 190;
        llIIlIllII[12] = (191 ^ 176) ^ (90 ^ 103);
        llIIlIllII[13] = (162 ^ 145) ^ (73 ^ 127);
        llIIlIllII[14] = (((70 + 12) - 43) + 104) ^ (((94 + 77) - 50) + 34);
        llIIlIllII[15] = 36 ^ 34;
        llIIlIllII[16] = -" ".length();
        llIIlIllII[17] = (((82 + 145) - 143) + 69) ^ (((63 + 141) - 92) + 46);
        llIIlIllII[18] = (6 ^ 13) ^ "   ".length();
        llIIlIllII[19] = 27 ^ 18;
        llIIlIllII[20] = 42 ^ 39;
        llIIlIllII[21] = 57 ^ 51;
        llIIlIllII[22] = (-21513) & 24540;
        llIIlIllII[23] = (-((-3905) & 24561)) & (-8261) & 32758;
        llIIlIllII[24] = (-((-10213) & 14318)) & (-1) & 7131;
        llIIlIllII[25] = (-((-10271) & 14623)) & (-1) & 8187;
        llIIlIllII[26] = (-((-4233) & 28861)) & (-5121) & 32767;
        llIIlIllII[27] = (-24840) & 28671;
        llIIlIllII[28] = (-(147 ^ 138)) & (-16417) & 19455;
        llIIlIllII[29] = (-24835) & 28663;
        llIIlIllII[30] = (-((-6738) & 31323)) & (-5157) & 32751;
        llIIlIllII[31] = (-28935) & 32759;
        llIIlIllII[32] = (-((-8841) & 12937)) & (-3) & 7103;
        llIIlIllII[33] = (-8449) & 12270;
        llIIlIllII[34] = (-((-6387) & 15603)) & (-16393) & 28607;
        llIIlIllII[35] = (-((-4679) & 21335)) & (-8198) & 28671;
        llIIlIllII[36] = (-((-19415) & 31703)) & (-17) & 15295;
        llIIlIllII[37] = (-((-15459) & 32099)) & (-8197) & 28655;
        llIIlIllII[38] = (-81) & 3063;
        llIIlIllII[39] = (-((-8454) & 29021)) & (-1) & 23543;
        llIIlIllII[40] = (-5189) & 8158;
        llIIlIllII[41] = (43 ^ 104) ^ (227 ^ 171);
        llIIlIllII[42] = (-(52 ^ 21)) & (-5193) & 8187;
        llIIlIllII[43] = (-275) & 4094;
        llIIlIllII[44] = 169 ^ 165;
        llIIlIllII[45] = (-20577) & 23535;
        llIIlIllII[46] = (101 ^ 83) ^ (122 ^ 66);
        llIIlIllII[47] = (((22 + 83) - 101) + 127) ^ (((15 + 78) - (-12)) + 35);
        llIIlIllII[48] = 26 ^ 10;
        llIIlIllII[49] = (((94 + 1) - (-17)) + 49) ^ (((16 + 125) - (-29)) + 6);
        llIIlIllII[50] = (-((-1813) & 30711)) & (-2309) & 31743;
        llIIlIllII[51] = (((141 + 107) - 220) + 131) ^ (((34 + 101) - (-4)) + 2);
        llIIlIllII[52] = 109 ^ 126;
        llIIlIllII[53] = 79 ^ 90;
        llIIlIllII[54] = (((135 + 150) - 194) + 82) ^ (((185 + 20) - 35) + 17);
        llIIlIllII[55] = (52 ^ 17) ^ (62 ^ 12);
        llIIlIllII[56] = (((59 + 29) - (-59)) + 18) ^ (((58 + 39) - 5) + 97);
        llIIlIllII[57] = 118 ^ 111;
        llIIlIllII[58] = (25 ^ 89) ^ (217 ^ 131);
        llIIlIllII[59] = (((161 + 99) - 160) + 120) ^ (((114 + 113) - 102) + 74);
        llIIlIllII[60] = (174 ^ 184) ^ (131 ^ 137);
        llIIlIllII[61] = (((133 + 148) - 150) + 19) ^ (((52 + 133) - 48) + 2);
        llIIlIllII[62] = 166 ^ 184;
        llIIlIllII[63] = (-9486) & 12285;
        llIIlIllII[64] = (-20532) & 32511;
        llIIlIllII[65] = (-((-16865) & 24568)) & (-65) & 32767;
        llIIlIllII[66] = (-(84 ^ 93)) & (-16529) & 24543;
        llIIlIllII[67] = 115 ^ 91;
        llIIlIllII[68] = (-28778) & 29677;
        llIIlIllII[69] = (-4786) & 278527;
        llIIlIllII[70] = 169 ^ 149;
        llIIlIllII[71] = (((56 + 187) - 46) + 42) ^ (((31 + 111) - 119) + 171);
        llIIlIllII[72] = (-16953) & 17402;
        llIIlIllII[73] = (-((-12295) & 16023)) & (-291) & 65530;
        llIIlIllII[74] = (4 ^ 51) ^ (236 ^ 191);
        llIIlIllII[75] = (135 ^ 172) ^ (78 ^ 122);
        llIIlIllII[76] = (46 ^ 41) ^ (81 ^ 53);
        llIIlIllII[77] = (((7 + 62) - 29) + 92) ^ (((155 + 84) - 141) + 66);
        llIIlIllII[78] = (-((-6405) & 14639)) & (-5121) & 16383;
        llIIlIllII[79] = (-((-2626) & 31485)) & (-65) & 32767;
        llIIlIllII[80] = (-((-529) & 5721)) & (-16385) & 24570;
        llIIlIllII[81] = (-((-6657) & 23063)) & (-12289) & 32511;
        llIIlIllII[82] = (-5154) & 8103;
        llIIlIllII[83] = (-257) & 4077;
        llIIlIllII[84] = (-((-2219) & 31915)) & (-42) & 32685;
        llIIlIllII[85] = (-((-22039) & 22527)) & (-20482) & 24063;
        llIIlIllII[86] = (-4621) & 8111;
        llIIlIllII[87] = (((104 + 50) - 15) + 21) ^ (((9 + 119) - 32) + 33);
    }

    static {
        lIlIlIlIllIll();
        lIlIlIlIllIIl();
        pd = new WorldPoint(llIIlIllII[78], llIIlIllII[79], llIIlIllII[1]);
        pe = new WorldPoint(llIIlIllII[80], llIIlIllII[81], llIIlIllII[1]);
        pf = new WorldPoint(llIIlIllII[82], llIIlIllII[83], llIIlIllII[1]);
        pg = new WorldPoint(llIIlIllII[84], llIIlIllII[43], llIIlIllII[1]);
        ph = new WorldPoint(llIIlIllII[1], llIIlIllII[1], llIIlIllII[1]);
        pi = new WorldPoint(llIIlIllII[1], llIIlIllII[1], llIIlIllII[1]);
        pj = new WorldPoint(llIIlIllII[85], llIIlIllII[86], llIIlIllII[1]);
        bv = new ArrayList();
    }

    private static boolean lIlIlIllIIIIl(int i, int i2) {
        return i > i2;
    }

    private static boolean lIlIlIllIIIlI(int i, int i2) {
        return i == i2;
    }

    private static boolean lIlIlIllIIIll(int i, int i2) {
        return i <= i2;
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public String ag() {
        return llIIlIlIll[llIIlIllII[75]];
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public int af() {
        try {
            fY();
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return (142 ^ 145) & ((84 ^ 75) ^ (-1));
            }
        } catch (Exception e) {
        }
        return llIIlIllII[74];
    }

    private static int fZ() {
        return (lIlIlIlIlllIl(Skills.getLevel(Skill.PRAYER), llIIlIllII[70]) && lIlIlIllIIlII(Skills.getLevel(Skill.PRAYER), llIIlIllII[71])) ? ((llIIlIllII[69] - Skills.getExperience(Skill.PRAYER)) / llIIlIllII[72]) + llIIlIllII[21] : ((llIIlIllII[73] - Skills.getExperience(Skill.PRAYER)) / llIIlIllII[72]) + llIIlIllII[62];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ae() {
        return llIIlIllII[1];
    }

    private static boolean lIlIlIlIlllll(Object obj) {
        return obj != null;
    }

    private static boolean lIlIlIlIllllI(int i) {
        return i == 0;
    }

    private static boolean lIlIlIlIlllIl(int i, int i2) {
        return i < i2;
    }

    private static boolean lIlIlIllIIIII(int i) {
        return i > 0;
    }

    private static boolean lIlIlIllIIlII(int i, int i2) {
        return i >= i2;
    }

    private static void Q() {
        int[] iArr = new int[llIIlIllII[2]];
        iArr[llIIlIllII[1]] = llIIlIllII[8];
        if (lIlIlIlIllllI(Bank.contains(iArr) ? 1 : 0)) {
            bv.add(new C0017d(llIIlIllII[8], llIIlIllII[13], C0023j.cf));
            "".length();
        }
        int[] iArr2 = new int[llIIlIllII[2]];
        iArr2[llIIlIllII[1]] = llIIlIllII[0];
        if (lIlIlIlIllllI(Bank.contains(iArr2) ? 1 : 0)) {
            bv.add(new C0017d(llIIlIllII[0], fZ(), llIIlIllII[63]));
            "".length();
        }
        int[] iArr3 = new int[llIIlIllII[2]];
        iArr3[llIIlIllII[1]] = llIIlIllII[7];
        if (lIlIlIlIllllI(Bank.contains(iArr3) ? 1 : 0)) {
            bv.add(new C0017d(llIIlIllII[7], llIIlIllII[3], llIIlIllII[5]));
            "".length();
        }
        if (lIlIlIlIllllI(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(llIIlIlIll[llIIlIllII[77]]);
        }) ? 1 : 0)) {
            bv.add(new C0017d(llIIlIllII[64], llIIlIllII[13], llIIlIllII[65]));
            "".length();
        }
        int[] iArr4 = new int[llIIlIllII[2]];
        iArr4[llIIlIllII[1]] = llIIlIllII[66];
        if (lIlIlIlIllllI(Bank.contains(iArr4) ? 1 : 0)) {
            bv.add(new C0017d(llIIlIllII[66], llIIlIllII[67], llIIlIllII[68]));
            "".length();
        }
    }

    private static boolean lIlIlIlIlllII(int i) {
        return i != 0;
    }

    private static void lIlIlIlIllIIl() {
        llIIlIlIll = new String[llIIlIllII[87]];
        llIIlIlIll[llIIlIllII[1]] = lIlIlIlIlIllI("+UoJvQgg/3X6c/QXQUB2PA==", "WSBWw");
        llIIlIlIll[llIIlIllII[2]] = lIlIlIlIlIllI("zRS+U/FWMurtp+Il+vMdi7uxxfCXXHa4nUL0VJs8scoT2fwIsc2vzkmpDj3rfR/V", "eZbsV");
        llIIlIlIll[llIIlIllII[3]] = lIlIlIlIlIllI("fe3DQIOA1yuwvEnOI6XpQ3U/x7sxjest", "juzSn");
        llIIlIlIll[llIIlIllII[4]] = lIlIlIlIlIllI("c4bbwfIfmE5j5bagMf33LhpeoPj3oM55", "Oimqk");
        llIIlIlIll[llIIlIllII[6]] = lIlIlIlIlIlll("6vqHYjuGWWNNWGha8kV8d7FDEG8J8cXD8RcxzgbHJzLKdnUahpB86qx9qvbdrVv03eiI0u7Bwsc=", "ldPyZ");
        llIIlIlIll[llIIlIllII[13]] = lIlIlIlIlIllI("pWi1/DMtK28=", "TTBbo");
        llIIlIlIll[llIIlIllII[15]] = lIlIlIlIlIllI("ao8Nsev2KiohaUdXT5gTZg==", "alfSB");
        llIIlIlIll[llIIlIllII[17]] = lIlIlIlIllIII("AgE1", "PtWhB");
        llIIlIlIll[llIIlIllII[18]] = lIlIlIlIlIllI("dxBrK+HhQ0eMKnVGBnO7Ug==", "PVozU");
        llIIlIlIll[llIIlIllII[19]] = lIlIlIlIlIlll("vWILk2dsJme+f+OMhuMSEAIHUU1sAWgBkUjop/CaU+0rkUYf3BoYMQ==", "ELMxP");
        llIIlIlIll[llIIlIllII[21]] = lIlIlIlIlIllI("wJBV0M8GpgO1+0AwhZ00fg==", "dgLDn");
        llIIlIlIll[llIIlIllII[41]] = lIlIlIlIllIII("aUMeCBEzQxoTEyE=", "Xcjar");
        llIIlIlIll[llIIlIllII[44]] = lIlIlIlIlIllI("+S0Kdvy69Hq0h73/rBZxgg==", "UUrwf");
        llIIlIlIll[llIIlIllII[20]] = lIlIlIlIllIII("KAUnEhBEADoaBw==", "ddUuu");
        llIIlIlIll[llIIlIllII[46]] = lIlIlIlIlIllI("glXabByevtQ=", "jACRO");
        llIIlIlIll[llIIlIllII[47]] = lIlIlIlIllIII("JzY2Jg==", "hFSHO");
        llIIlIlIll[llIIlIllII[48]] = lIlIlIlIlIllI("ip4OIodJgi0=", "cBLAo");
        llIIlIlIll[llIIlIllII[49]] = lIlIlIlIllIII("LD85KjFPNjQxIx0=", "oWXEB");
        llIIlIlIll[llIIlIllII[51]] = lIlIlIlIlIllI("BoSpngnMZ58rNVKuXYNqMA==", "SHYke");
        llIIlIlIll[llIIlIllII[52]] = lIlIlIlIllIII("LDw6JTMQPDNqJRY8MTk=", "yRTJG");
        llIIlIlIll[llIIlIllII[14]] = lIlIlIlIlIllI("9QNtXTq4T+c73GRhswuh82AzvGMjv/Os", "mzKPk");
        llIIlIlIll[llIIlIllII[53]] = lIlIlIlIlIlll("eg7Yd0w0Z0nRnJOlIbw1/A==", "YnRtQ");
        llIIlIlIll[llIIlIllII[54]] = lIlIlIlIlIlll("GHDp2KboN2w=", "Wvzwp");
        llIIlIlIll[llIIlIllII[55]] = lIlIlIlIlIlll("ToIF2xTj5Ow=", "MPYbT");
        llIIlIlIll[llIIlIllII[56]] = lIlIlIlIlIlll("HmxMB4OOjis=", "HCrDc");
        llIIlIlIll[llIIlIllII[57]] = lIlIlIlIllIII("IhkHGxgJBgE=", "gadsy");
        llIIlIlIll[llIIlIllII[58]] = lIlIlIlIllIII("NSIzKiMePTVidw==", "pZPBB");
        llIIlIlIll[llIIlIllII[59]] = lIlIlIlIlIlll("PjA63SrKZrVFbL4t9z/lCw==", "cctnb");
        llIIlIlIll[llIIlIllII[60]] = lIlIlIlIlIlll("tB8myTSS52wt44MC2+MpOg==", "OXvkz");
        llIIlIlIll[llIIlIllII[61]] = lIlIlIlIlIlll("lkPIBSxgH4HNQMA3iAlwQg==", "bitiM");
        llIIlIlIll[llIIlIllII[62]] = lIlIlIlIllIII("BRM7Bg==", "QrPcp");
        llIIlIlIll[llIIlIllII[75]] = lIlIlIlIlIllI("6EzkSKC48FjDZkbqCG254w==", "Qdkjv");
        llIIlIlIll[llIIlIllII[77]] = lIlIlIlIllIII("KBAvKlc1H2E6EjsVNSVXcg==", "ZyAMw");
    }

    private static String lIlIlIlIlIllI(String llllllllllllllllllIlIIlIIIlIllIl, String llllllllllllllllllIlIIlIIIlIllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIlIIlIIIlIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIlIllII[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllIlIIlIIIlIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIlIIlIIIlIlIIl) {
            llllllllllllllllllIlIIlIIIlIlIIl.printStackTrace();
            return null;
        }
    }

    private static String lIlIlIlIllIII(String llllllllllllllllllIlIIlIIlIIIIlI, String llllllllllllllllllIlIIlIIlIIIIIl) {
        String llllllllllllllllllIlIIlIIlIIIIlI2 = new String(Base64.getDecoder().decode(llllllllllllllllllIlIIlIIlIIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllllllIlIIlIIlIIIIIl.toCharArray();
        int llllllllllllllllllIlIIlIIIlllllI = llIIlIllII[1];
        char[] charArray2 = llllllllllllllllllIlIIlIIlIIIIlI2.toCharArray();
        int length = charArray2.length;
        int i = llIIlIllII[1];
        while (lIlIlIlIlllIl(i, length)) {
            char llllllllllllllllllIlIIlIIlIIIIll = charArray2[i];
            sb.append((char) (llllllllllllllllllIlIIlIIlIIIIll ^ charArray[llllllllllllllllllIlIIlIIIlllllI % charArray.length]));
            "".length();
            llllllllllllllllllIlIIlIIIlllllI++;
            i++;
            "".length();
            if ((((1 ^ 108) ^ (240 ^ 130)) & (((208 ^ 155) ^ (203 ^ 159)) ^ (-" ".length()))) != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ah() {
        if (lIlIlIllIIlII(Skills.getLevel(Skill.PRAYER), llIIlIllII[76])) {
            ?? r0 = llIIlIllII[2];
            "".length();
            return ((10 ^ 43) & ((46 ^ 15) ^ (-1))) == (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIIlIllII[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v306, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v330, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v54, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v59, types: [boolean] */
    public static void fY() {
        if (lIlIlIlIlllII(bt ? 1 : 0)) {
            AccBuilderSotf.c = llIIlIlIll[llIIlIllII[1]];
            C0015b.a(bv);
            if (lIlIlIlIlllIl(bv.size(), llIIlIllII[2])) {
                System.out.println(llIIlIlIll[llIIlIllII[2]]);
                bt = llIIlIllII[1];
            }
        }
        if (lIlIlIlIllllI(bt ? 1 : 0)) {
            if (lIlIlIlIllllI(an() ? 1 : 0) && lIlIlIlIlllIl(Game.getWildyLevel(), llIIlIllII[2])) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIlIlIlIlllll(nearest) && lIlIlIlIllllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIIlIlIll[llIIlIllII[3]];
                    C0000a.a(nearest);
                }
                if (lIlIlIlIlllll(nearest) && lIlIlIlIlllII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIIlIlIll[llIIlIllII[4]];
                    if (lIlIlIlIllllI(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, llIIlIllII[5]);
                        "".length();
                    }
                    if (lIlIlIlIlllII(Bank.isOpen() ? 1 : 0)) {
                        if (lIlIlIllIIIII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(llIIlIllII[6]);
                            "".length();
                        }
                        if (lIlIlIllIIIII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(llIIlIllII[3]);
                            "".length();
                        }
                        int[] iArr = new int[llIIlIllII[4]];
                        iArr[llIIlIllII[1]] = llIIlIllII[7];
                        iArr[llIIlIllII[2]] = llIIlIllII[0];
                        iArr[llIIlIllII[3]] = llIIlIllII[8];
                        if (lIlIlIlIllllI(C0018e.c(iArr) ? 1 : 0)) {
                            Q();
                            System.out.println(llIIlIlIll[llIIlIllII[6]]);
                            bt = llIIlIllII[2];
                            return;
                        }
                        int[] iArr2 = new int[llIIlIllII[4]];
                        iArr2[llIIlIllII[1]] = llIIlIllII[7];
                        iArr2[llIIlIllII[2]] = llIIlIllII[0];
                        iArr2[llIIlIllII[3]] = llIIlIllII[8];
                        if (lIlIlIlIlllII(C0018e.c(iArr2) ? 1 : 0)) {
                            if (lIlIlIlIllllI(Equipment.contains(C0019f.bf) ? 1 : 0)) {
                                C0000a.b(C0019f.bf, llIIlIllII[2]);
                            }
                            C0000a.b(C0019f.ba, llIIlIllII[2]);
                            C0000a.a(llIIlIllII[9], llIIlIllII[10]);
                            C0000a.b(llIIlIllII[0], llIIlIllII[11]);
                        }
                    }
                }
            }
            if (lIlIlIlIlllII(an() ? 1 : 0)) {
                if (lIlIlIlIlllII(Inventory.contains(C0019f.ba) ? 1 : 0) && lIlIlIlIlllIl(Movement.getRunEnergy(), llIIlIllII[12])) {
                    Inventory.getFirst(C0019f.ba).interact(llIIlIlIll[llIIlIllII[13]]);
                    Time.sleepTicks(llIIlIllII[2]);
                    "".length();
                }
                if (lIlIlIlIllllI(Movement.isRunEnabled() ? 1 : 0) && lIlIlIllIIIIl(Movement.getRunEnergy(), llIIlIllII[14])) {
                    Movement.toggleRun();
                    Time.sleepTicks(llIIlIllII[13]);
                    "".length();
                }
                if (lIlIlIlIlllIl(Game.getWildyLevel(), llIIlIllII[2])) {
                    AccBuilderSotf.c = llIIlIlIll[llIIlIllII[15]];
                    if (lIlIlIlIlllII(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    if (lIlIlIlIllllI(Dialog.isOpen() ? 1 : 0) && lIlIlIlIlllII(Inventory.contains(C0019f.bf) ? 1 : 0) && lIlIlIllIIIlI(Players.getLocal().getAnimation(), llIIlIllII[16])) {
                        Inventory.getFirst(C0019f.bf).interact(llIIlIlIll[llIIlIllII[17]]);
                        Time.sleepTicks(llIIlIllII[3]);
                        "".length();
                    }
                    String[] strArr = new String[llIIlIllII[3]];
                    strArr[llIIlIllII[1]] = llIIlIlIll[llIIlIllII[18]];
                    strArr[llIIlIllII[2]] = llIIlIlIll[llIIlIllII[19]];
                    C0020g.a(strArr);
                }
                if (lIlIlIllIIIII(Game.getWildyLevel())) {
                    int[] iArr3 = new int[llIIlIllII[2]];
                    iArr3[llIIlIllII[1]] = llIIlIllII[0];
                    if (lIlIlIlIlllII(Inventory.contains(iArr3) ? 1 : 0)) {
                        if (lIlIlIllIIIIl(Players.getLocal().getWorldLocation().distanceTo(pf), llIIlIllII[20])) {
                            AccBuilderSotf.c = llIIlIlIll[llIIlIllII[21]];
                            WorldPoint[] worldPointArr = new WorldPoint[llIIlIllII[20]];
                            worldPointArr[llIIlIllII[1]] = new WorldPoint(llIIlIllII[22], llIIlIllII[23], llIIlIllII[1]);
                            worldPointArr[llIIlIllII[2]] = new WorldPoint(llIIlIllII[24], llIIlIllII[25], llIIlIllII[1]);
                            worldPointArr[llIIlIllII[3]] = new WorldPoint(llIIlIllII[26], llIIlIllII[27], llIIlIllII[1]);
                            worldPointArr[llIIlIllII[4]] = new WorldPoint(llIIlIllII[28], llIIlIllII[29], llIIlIllII[1]);
                            worldPointArr[llIIlIllII[6]] = new WorldPoint(llIIlIllII[30], llIIlIllII[31], llIIlIllII[1]);
                            worldPointArr[llIIlIllII[13]] = new WorldPoint(llIIlIllII[32], llIIlIllII[33], llIIlIllII[1]);
                            worldPointArr[llIIlIllII[15]] = new WorldPoint(llIIlIllII[34], llIIlIllII[35], llIIlIllII[1]);
                            worldPointArr[llIIlIllII[17]] = new WorldPoint(llIIlIllII[36], llIIlIllII[37], llIIlIllII[1]);
                            worldPointArr[llIIlIllII[18]] = new WorldPoint(llIIlIllII[38], llIIlIllII[37], llIIlIllII[1]);
                            worldPointArr[llIIlIllII[19]] = new WorldPoint(llIIlIllII[39], llIIlIllII[37], llIIlIllII[1]);
                            worldPointArr[llIIlIllII[21]] = new WorldPoint(llIIlIllII[40], llIIlIllII[37], llIIlIllII[1]);
                            worldPointArr[llIIlIllII[41]] = new WorldPoint(llIIlIllII[42], llIIlIllII[43], llIIlIllII[1]);
                            worldPointArr[llIIlIllII[44]] = new WorldPoint(llIIlIllII[45], llIIlIllII[43], llIIlIllII[1]);
                            Walker.walkAlong(Arrays.asList(worldPointArr), new HashMap());
                            "".length();
                            Time.sleepTicks(llIIlIllII[2]);
                            "".length();
                        }
                        if (lIlIlIllIIIll(Players.getLocal().getWorldLocation().distanceTo(pf), llIIlIllII[20])) {
                            AccBuilderSotf.c = llIIlIlIll[llIIlIllII[41]];
                            String[] strArr2 = new String[llIIlIllII[2]];
                            strArr2[llIIlIllII[1]] = llIIlIlIll[llIIlIllII[44]];
                            TileObject nearest2 = TileObjects.getNearest(strArr2);
                            String[] strArr3 = new String[llIIlIllII[2]];
                            strArr3[llIIlIllII[1]] = llIIlIlIll[llIIlIllII[20]];
                            TileObject nearest3 = TileObjects.getNearest(strArr3);
                            String[] strArr4 = new String[llIIlIllII[2]];
                            strArr4[llIIlIllII[1]] = llIIlIlIll[llIIlIllII[46]];
                            if (lIlIlIlIlllII(nearest3.hasAction(strArr4) ? 1 : 0)) {
                                nearest3.interact(llIIlIlIll[llIIlIllII[47]]);
                            }
                            if (lIlIlIlIlllll(nearest2)) {
                                String[] strArr5 = new String[llIIlIllII[2]];
                                strArr5[llIIlIllII[1]] = llIIlIlIll[llIIlIllII[48]];
                                if (lIlIlIlIllllI(nearest3.hasAction(strArr5) ? 1 : 0)) {
                                    Skills.getExperience(Skill.PRAYER);
                                    int[] iArr4 = new int[llIIlIllII[2]];
                                    iArr4[llIIlIllII[1]] = llIIlIllII[0];
                                    Item first = Inventory.getFirst(iArr4);
                                    String[] strArr6 = new String[llIIlIllII[2]];
                                    strArr6[llIIlIllII[1]] = llIIlIlIll[llIIlIllII[49]];
                                    first.useOn(TileObjects.getNearest(strArr6));
                                    Time.sleepTicks(llIIlIllII[2]);
                                    "".length();
                                }
                            }
                        }
                    }
                    int[] iArr5 = new int[llIIlIllII[2]];
                    iArr5[llIIlIllII[1]] = llIIlIllII[0];
                    if (lIlIlIlIllllI(Inventory.contains(iArr5) ? 1 : 0)) {
                        int[] iArr6 = new int[llIIlIllII[2]];
                        iArr6[llIIlIllII[1]] = llIIlIllII[50];
                        if (lIlIlIlIlllII(Inventory.contains(iArr6) ? 1 : 0)) {
                            if (lIlIlIllIIIIl(Players.getLocal().getWorldLocation().distanceTo(pf), llIIlIllII[20])) {
                                AccBuilderSotf.c = llIIlIlIll[llIIlIllII[51]];
                                WorldPoint[] worldPointArr2 = new WorldPoint[llIIlIllII[20]];
                                worldPointArr2[llIIlIllII[1]] = new WorldPoint(llIIlIllII[22], llIIlIllII[23], llIIlIllII[1]);
                                worldPointArr2[llIIlIllII[2]] = new WorldPoint(llIIlIllII[24], llIIlIllII[25], llIIlIllII[1]);
                                worldPointArr2[llIIlIllII[3]] = new WorldPoint(llIIlIllII[26], llIIlIllII[27], llIIlIllII[1]);
                                worldPointArr2[llIIlIllII[4]] = new WorldPoint(llIIlIllII[28], llIIlIllII[29], llIIlIllII[1]);
                                worldPointArr2[llIIlIllII[6]] = new WorldPoint(llIIlIllII[30], llIIlIllII[31], llIIlIllII[1]);
                                worldPointArr2[llIIlIllII[13]] = new WorldPoint(llIIlIllII[32], llIIlIllII[33], llIIlIllII[1]);
                                worldPointArr2[llIIlIllII[15]] = new WorldPoint(llIIlIllII[34], llIIlIllII[35], llIIlIllII[1]);
                                worldPointArr2[llIIlIllII[17]] = new WorldPoint(llIIlIllII[36], llIIlIllII[37], llIIlIllII[1]);
                                worldPointArr2[llIIlIllII[18]] = new WorldPoint(llIIlIllII[38], llIIlIllII[37], llIIlIllII[1]);
                                worldPointArr2[llIIlIllII[19]] = new WorldPoint(llIIlIllII[39], llIIlIllII[37], llIIlIllII[1]);
                                worldPointArr2[llIIlIllII[21]] = new WorldPoint(llIIlIllII[40], llIIlIllII[37], llIIlIllII[1]);
                                worldPointArr2[llIIlIllII[41]] = new WorldPoint(llIIlIllII[42], llIIlIllII[43], llIIlIllII[1]);
                                worldPointArr2[llIIlIllII[44]] = new WorldPoint(llIIlIllII[45], llIIlIllII[43], llIIlIllII[1]);
                                Walker.walkAlong(Arrays.asList(worldPointArr2), new HashMap());
                                "".length();
                                Time.sleepTicks(llIIlIllII[2]);
                                "".length();
                            }
                            if (lIlIlIllIIIll(Players.getLocal().getWorldLocation().distanceTo(pf), llIIlIllII[20])) {
                                AccBuilderSotf.c = llIIlIlIll[llIIlIllII[52]];
                                if (!lIlIlIlIllllI(Dialog.canLevelUpContinue() ? 1 : 0) || lIlIlIlIlllII(Dialog.isOpen() ? 1 : 0)) {
                                    Dialog.close();
                                }
                                String[] strArr7 = new String[llIIlIllII[2]];
                                strArr7[llIIlIllII[1]] = llIIlIlIll[llIIlIllII[14]];
                                NPC nearest4 = NPCs.getNearest(strArr7);
                                String[] strArr8 = new String[llIIlIllII[2]];
                                strArr8[llIIlIllII[1]] = llIIlIlIll[llIIlIllII[53]];
                                TileObject nearest5 = TileObjects.getNearest(strArr8);
                                String[] strArr9 = new String[llIIlIllII[2]];
                                strArr9[llIIlIllII[1]] = llIIlIlIll[llIIlIllII[54]];
                                if (lIlIlIlIlllII(nearest5.hasAction(strArr9) ? 1 : 0)) {
                                    nearest5.interact(llIIlIlIll[llIIlIllII[55]]);
                                }
                                if (lIlIlIlIlllll(nearest4)) {
                                    String[] strArr10 = new String[llIIlIllII[2]];
                                    strArr10[llIIlIllII[1]] = llIIlIlIll[llIIlIllII[56]];
                                    if (lIlIlIlIllllI(nearest5.hasAction(strArr10) ? 1 : 0)) {
                                        if (lIlIlIlIllllI(Dialog.isOpen() ? 1 : 0)) {
                                            int[] iArr7 = new int[llIIlIllII[2]];
                                            iArr7[llIIlIllII[1]] = llIIlIllII[50];
                                            Inventory.getFirst(iArr7).useOn(nearest4);
                                            Time.sleepTicks(llIIlIllII[3]);
                                            "".length();
                                        }
                                        if (lIlIlIlIlllII(Dialog.isOpen() ? 1 : 0)) {
                                            List options = Dialog.getOptions();
                                            if (lIlIlIlIllllI(options.isEmpty() ? 1 : 0)) {
                                                int i = llIIlIllII[1];
                                                while (lIlIlIlIlllIl(i, options.size())) {
                                                    int[] iArr8 = new int[llIIlIllII[2]];
                                                    iArr8[llIIlIllII[1]] = llIIlIllII[50];
                                                    if (lIlIlIllIIIlI(((Item) Inventory.getAll(iArr8).get(llIIlIllII[1])).getQuantity(), llIIlIllII[2]) && lIlIlIlIlllII(((Widget) options.get(i)).getText().contains(llIIlIlIll[llIIlIllII[57]]) ? 1 : 0)) {
                                                        Mouse.click(((Widget) options.get(i)).getClickPoint().getX(), ((Widget) options.get(i)).getClickPoint().getY(), (boolean) llIIlIllII[2]);
                                                        Time.sleepTicks(llIIlIllII[3]);
                                                        "".length();
                                                    }
                                                    int[] iArr9 = new int[llIIlIllII[2]];
                                                    iArr9[llIIlIllII[1]] = llIIlIllII[50];
                                                    if (lIlIlIllIIIlI(((Item) Inventory.getAll(iArr9).get(llIIlIllII[1])).getQuantity(), llIIlIllII[13]) && lIlIlIlIlllII(((Widget) options.get(i)).getText().contains(llIIlIlIll[llIIlIllII[58]]) ? 1 : 0)) {
                                                        Mouse.click(((Widget) options.get(i)).getClickPoint().getX(), ((Widget) options.get(i)).getClickPoint().getY(), (boolean) llIIlIllII[2]);
                                                        Time.sleepTicks(llIIlIllII[3]);
                                                        "".length();
                                                    }
                                                    if (lIlIlIlIlllII(((Widget) options.get(i)).getText().contains(llIIlIlIll[llIIlIllII[59]]) ? 1 : 0)) {
                                                        Mouse.click(((Widget) options.get(i)).getClickPoint().getX(), ((Widget) options.get(i)).getClickPoint().getY(), (boolean) llIIlIllII[2]);
                                                        Time.sleepTicks(llIIlIllII[3]);
                                                        "".length();
                                                    }
                                                    i++;
                                                    "".length();
                                                    if (" ".length() == (((247 ^ 199) ^ (127 ^ 74)) & (((161 ^ 198) ^ (240 ^ 146)) ^ (-" ".length())))) {
                                                        return;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            int[] iArr10 = new int[llIIlIllII[2]];
            iArr10[llIIlIllII[1]] = llIIlIllII[9];
            if (lIlIlIlIlllII(Inventory.contains(iArr10) ? 1 : 0)) {
                int[] iArr11 = new int[llIIlIllII[2]];
                iArr11[llIIlIllII[1]] = llIIlIllII[0];
                if (!lIlIlIlIllllI(Inventory.contains(iArr11) ? 1 : 0)) {
                    return;
                }
                int[] iArr12 = new int[llIIlIllII[2]];
                iArr12[llIIlIllII[1]] = llIIlIllII[50];
                if (!lIlIlIlIllllI(Inventory.contains(iArr12) ? 1 : 0)) {
                    return;
                }
            }
            if (lIlIlIllIIIll(Players.getLocal().getWorldLocation().distanceTo(pf), llIIlIllII[20])) {
                AccBuilderSotf.c = llIIlIlIll[llIIlIllII[60]];
                String[] strArr11 = new String[llIIlIllII[2]];
                strArr11[llIIlIllII[1]] = llIIlIlIll[llIIlIllII[61]];
                TileItem nearest6 = TileItems.getNearest(strArr11);
                if (lIlIlIlIlllll(nearest6)) {
                    nearest6.interact(llIIlIlIll[llIIlIllII[62]]);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0091, code lost:
        if (lIlIlIlIlllII(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean an() {
        int[] iArr = new int[llIIlIllII[2]];
        iArr[llIIlIllII[1]] = llIIlIllII[9];
        if (lIlIlIlIlllII(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[llIIlIllII[2]];
            iArr2[llIIlIllII[1]] = llIIlIllII[9];
            if (lIlIlIllIIlII(Inventory.getFirst(iArr2).getQuantity(), llIIlIllII[12])) {
                if (lIlIlIlIllllI(Inventory.contains(C0019f.bf) ? 1 : 0)) {
                    if (lIlIlIlIlllII(Equipment.contains(C0019f.bf) ? 1 : 0)) {
                        int[] iArr3 = new int[llIIlIllII[2]];
                        iArr3[llIIlIllII[1]] = llIIlIllII[0];
                        if (lIlIlIlIllllI(Inventory.contains(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[llIIlIllII[2]];
                            iArr4[llIIlIllII[1]] = llIIlIllII[50];
                        }
                    }
                }
                ?? r0 = llIIlIllII[2];
                "".length();
                return ((220 ^ 189) & ((243 ^ 146) ^ (-1))) == "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
        }
        return llIIlIllII[1];
    }

    private static String lIlIlIlIlIlll(String llllllllllllllllllIlIIlIIIlIIIII, String llllllllllllllllllIlIIlIIIIlllll) {
        try {
            SecretKeySpec llllllllllllllllllIlIIlIIIlIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIlIIlIIIIlllll.getBytes(StandardCharsets.UTF_8)), llIIlIllII[18]), "DES");
            Cipher llllllllllllllllllIlIIlIIIlIIIlI = Cipher.getInstance("DES");
            llllllllllllllllllIlIIlIIIlIIIlI.init(llIIlIllII[3], llllllllllllllllllIlIIlIIIlIIIll);
            return new String(llllllllllllllllllIlIIlIIIlIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllllllIlIIlIIIlIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIlIIlIIIlIIIIl) {
            llllllllllllllllllIlIIlIIIlIIIIl.printStackTrace();
            return null;
        }
    }
}
