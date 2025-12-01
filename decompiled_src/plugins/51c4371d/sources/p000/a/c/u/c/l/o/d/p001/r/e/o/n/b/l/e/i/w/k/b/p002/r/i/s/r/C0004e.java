package p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r;

import gg.squire.account.AccBuilderBarrows;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.FileWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.MenuAction;
import net.runelite.api.NPC;
import net.runelite.api.Perspective;
import net.runelite.api.Point;
import net.runelite.api.Skill;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.runelite.client.util.WorldUtil;
import net.runelite.http.api.worlds.World;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.GameThread;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Tab;
import net.unethicalite.api.widgets.Tabs;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
/* renamed from: -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.e  reason: invalid package and case insensitive filesystem */
/* loaded from: 51c4371d-854c-4c1b-8841-207ed7d6bdc3.jar:-/a/c/u/c/l/o/d/-/r/e/o/n/b/l/e/i/w/k/b/-/r/i/s/r/e.class */
public class C0004e {
    private static final /* synthetic */ int Y;
    private static final /* synthetic */ int ab;
    private static final /* synthetic */ int aa;
    private static /* synthetic */ String[] llllIlll;
    static final /* synthetic */ WorldArea U;
    private static final /* synthetic */ int[] ad;
    static /* synthetic */ WorldPoint ag;
    static final /* synthetic */ WorldArea T;
    private static final /* synthetic */ int Z;
    private static /* synthetic */ int[] lllllIIl;
    private static final /* synthetic */ int ac;
    public static /* synthetic */ int[] af;
    private static final /* synthetic */ long V;
    private static final /* synthetic */ Map<Integer, Integer> X;
    public static /* synthetic */ WorldPoint ae;
    private static final /* synthetic */ long W;
    public static final /* synthetic */ String R;
    public static final /* synthetic */ ThreadLocalRandom S;
    static /* synthetic */ WorldArea ah;

    private static String llIIllIllIl(String lIIllIIllIlllII, String lIIllIIllIllIll) {
        try {
            SecretKeySpec lIIllIIllIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIllIIllIllIll.getBytes(StandardCharsets.UTF_8)), lllllIIl[11]), "DES");
            Cipher lIIllIIllIllllI = Cipher.getInstance("DES");
            lIIllIIllIllllI.init(lllllIIl[6], lIIllIIllIlllll);
            return new String(lIIllIIllIllllI.doFinal(Base64.getDecoder().decode(lIIllIIllIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIllIIllIlllIl) {
            lIIllIIllIlllIl.printStackTrace();
            return null;
        }
    }

    public static boolean i(int i) {
        int[] iArr = new int[lllllIIl[0]];
        iArr[lllllIIl[4]] = i;
        return Bank.contains(iArr);
    }

    public static int I() {
        return j(lllllIIl[76]);
    }

    private static boolean llIIllllllI(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public static boolean y() {
        if (!llIIlllIlll(((Integer) GameThread.invokeLater(() -> {
            return Integer.valueOf(Static.getClient().getVarbitValue(lllllIIl[31]));
        })).intValue()) || llIIlllIlIl(((Integer) GameThread.invokeLater(() -> {
            return Integer.valueOf(Static.getClient().getVarbitValue(lllllIIl[34]));
        })).intValue())) {
            ?? r0 = lllllIIl[0];
            "".length();
            return (-" ".length()) != (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lllllIIl[4];
    }

    private static boolean llIIllllIIl(int i, int i2) {
        return i < i2;
    }

    public static long t() {
        return V + ((System.nanoTime() - W) / 1000000);
    }

    private static void llIIlllIIll() {
        llllIlll = new String[lllllIIl[173]];
        llllIlll[lllllIIl[4]] = llIIllIllIl("TDWTmtq8tCMFBECPHxPfFg==", "bvccF");
        llllIlll[lllllIIl[0]] = llIIllIllIl("xn5UCxuCIqcf+y65rc8hCEi3qBZg0+9O", "zECMD");
        llllIlll[lllllIIl[6]] = llIIllIlllI("HgcQPmoeAREpKzwBDiM/PQ==", "NhbJJ");
        llllIlll[lllllIIl[5]] = llIIllIllIl("kY9N8664mozqEV6IuWizX280qQlwQ81I", "qiHnA");
        llllIlll[lllllIIl[7]] = llIIllIllIl("Ca/7cQbFIl+/bFVmv+5BDIjfEsSlakh/", "FrAhm");
        llllIlll[lllllIIl[8]] = llIIllIllll("+WxYSg/MprQ=", "XbeXA");
        llllIlll[lllllIIl[9]] = llIIllIllIl("/fjAoMApaapOQc3LNU66ZTHm7twM6hT+", "ivthR");
        llllIlll[lllllIIl[10]] = llIIllIllIl("FIbsbunLvA3zj6V5/PbVK2cWQjV/+Soi", "GGukh");
        llllIlll[lllllIIl[11]] = llIIllIllIl("cVKLv7VjE7FRM0QlikPEk27REW4qJscY", "yklAa");
        llllIlll[lllllIIl[12]] = llIIllIllll("Phwp9t8T2FQ07I+QnOySSdzt0UuUt4xL", "Ucpav");
        llllIlll[lllllIIl[13]] = llIIllIllIl("GbwlwXn1FDcUYDNgRceYowwOPY8wl6Bv", "Fkykg");
        llllIlll[lllllIIl[14]] = llIIllIlllI("aVZ3ah4o", "LsGOz");
        llllIlll[lllllIIl[15]] = llIIllIlllI("GlM+MRg8GxE4JTAKCTgqKRkmBR84NTALCjQADAM3dx0QDQk2HT4jBD0aLxEHPDUPEQc8RxYcHw==", "Yibdk");
        llllIlll[lllllIIl[16]] = llIIllIllll("IdumM8r3LlZ8LWihRuDcfA==", "RYbLy");
        llllIlll[lllllIIl[19]] = llIIllIlllI("ERs8JBE=", "RwSWt");
        llllIlll[lllllIIl[20]] = llIIllIllIl("ZuvtNVNhavoriaYeJRx7rpHHR6Wve0Zn", "TrqpR");
        llllIlll[lllllIIl[26]] = llIIllIllIl("6HU4kG8LH88=", "WiiBt");
        llllIlll[lllllIIl[27]] = llIIllIllll("0OqbNbhxQciF0WeDaxnw5InD9yj31Edd", "hSQas");
        llllIlll[lllllIIl[30]] = llIIllIllll("LT3xSg22sn2drjjUnCTPXA==", "XaxQg");
        llllIlll[lllllIIl[32]] = llIIllIlllI("Li0LMRQf", "zBlVx");
        llllIlll[lllllIIl[33]] = llIIllIllll("SrJWdNYZnEE=", "RAqjU");
        llllIlll[lllllIIl[36]] = llIIllIllIl("2CscODphtWk=", "eDjIB");
        llllIlll[lllllIIl[39]] = llIIllIllll("Dh13Cs3xaAk8aEJ+TeVcbg==", "bqxQL");
        llllIlll[lllllIIl[29]] = llIIllIlllI("EioGIg==", "EOgPD");
        llllIlll[lllllIIl[40]] = llIIllIllIl("iJfTms3km44=", "CCIgc");
        llllIlll[lllllIIl[41]] = llIIllIllIl("/zsyXi3/nQI=", "OtwoF");
        llllIlll[lllllIIl[42]] = llIIllIllIl("XKXtpeAjwYo=", "wiauz");
        llllIlll[lllllIIl[43]] = llIIllIllIl("i9Xggufk5ZU=", "TmfBo");
        llllIlll[lllllIIl[44]] = llIIllIlllI("AQgDCik=", "DyvcY");
        llllIlll[lllllIIl[18]] = llIIllIllll("9N5EKiTyr9vVFFpaYNftxMamurCdkSSB", "MYslr");
        llllIlll[lllllIIl[57]] = llIIllIllll("l2CUdQ+Up49DCr3Z273OsrvBzY3xLSv1", "iMyQf");
        llllIlll[lllllIIl[58]] = llIIllIlllI("LyUkJw==", "hDPBd");
        llllIlll[lllllIIl[38]] = llIIllIllll("w9aQjq74Kzc=", "wqInw");
        llllIlll[lllllIIl[59]] = llIIllIllll("R5y4o70wCICtov4g5NRC1Tn4ufNrWJ/X", "WxPmC");
        llllIlll[lllllIIl[60]] = llIIllIlllI("IggEQRsDSQEVHQMHFQkAAA1SFQYADA==", "lirao");
        llllIlll[lllllIIl[50]] = llIIllIlllI("GDU5Aw==", "HzjWD");
        llllIlll[lllllIIl[63]] = llIIllIlllI("Oi47GiEXNXg6PQkk", "yAUnD");
        llllIlll[lllllIIl[64]] = llIIllIlllI("EREXHAETABMZBx5ODQMHHg==", "pagph");
        llllIlll[lllllIIl[68]] = llIIllIllll("g+HP3Ll4hSHWW9F0Gu4F1w==", "oYuED");
        llllIlll[lllllIIl[69]] = llIIllIllIl("jfKwfAyj2FFjlFwq9JeABw==", "EOPDj");
        llllIlll[lllllIIl[24]] = llIIllIllll("wfusVgffE7EdviyQXNoFjA==", "syccc");
        llllIlll[lllllIIl[35]] = llIIllIllll("c98o43OYrs8rDsBb4jp7+Q==", "bmchA");
        llllIlll[lllllIIl[70]] = llIIllIlllI("Lg8EPiw=", "jjeJD");
        llllIlll[lllllIIl[71]] = llIIllIllll("Wa5gbeFf2sk=", "RMpaW");
        llllIlll[lllllIIl[72]] = llIIllIllll("4X/I/7qV3TQ=", "qLqfi");
        llllIlll[lllllIIl[73]] = llIIllIlllI("BgkR", "SztsU");
        llllIlll[lllllIIl[77]] = llIIllIllIl("04tzrSR0t3I=", "WDZUm");
        llllIlll[lllllIIl[79]] = llIIllIllll("MjhnLZgeis0=", "zWXyW");
        llllIlll[lllllIIl[80]] = llIIllIllll("0ColAQPEesU=", "NaJuR");
        llllIlll[lllllIIl[81]] = llIIllIlllI("HAU6", "LsjFN");
        llllIlll[lllllIIl[74]] = llIIllIlllI("Dzk1Aw==", "GPRkd");
        llllIlll[lllllIIl[84]] = llIIllIllIl("P/N7ooltzdc=", "DXrGy");
        llllIlll[lllllIIl[85]] = llIIllIlllI("GAcGKg==", "ZbrKI");
        llllIlll[lllllIIl[86]] = llIIllIlllI("OCc2Ag==", "ZBBci");
        llllIlll[lllllIIl[87]] = llIIllIllll("AAcA6HK8xhw=", "zmTSP");
        llllIlll[lllllIIl[88]] = llIIllIllIl("kWLTIPmB2cc=", "lsAfw");
        llllIlll[lllllIIl[89]] = llIIllIlllI("IiEELiMDJA8lLh82", "qQaKG");
        llllIlll[lllllIIl[90]] = llIIllIllll("1FtBleVeGb8=", "fJfxF");
        llllIlll[lllllIIl[91]] = llIIllIlllI("KysBOQ==", "iNuXs");
        llllIlll[lllllIIl[93]] = llIIllIllll("H9SIfeZtHky05+YQiKM+9PCUmEdsnctJ", "bbMSL");
        llllIlll[lllllIIl[94]] = llIIllIlllI("EBkAHQwdAws=", "svnie");
        llllIlll[lllllIIl[23]] = llIIllIllll("S1QpjSrproHsRSIRF1iQPA==", "ZiLHs");
        llllIlll[lllllIIl[95]] = llIIllIlllI("LgMYBCsjGRM=", "MlvpB");
        llllIlll[lllllIIl[96]] = llIIllIllIl("tIx1vJQF0MSWGFNjAnjZ6w==", "xOvcv");
        llllIlll[lllllIIl[98]] = llIIllIllIl("7mrQIRRCmvsKhQ90nLFjA6w8pZFo6euqhOmL3QokRJFPJ4Mg7Pu+ja1xaXXeuNZ4542TaKe59rk=", "VEEUw");
    }

    public static void D() {
        if (llIIlllIlIl(j(lllllIIl[66]))) {
            if (llIIlllIlIl(Tabs.isOpen(Tab.COMBAT) ? 1 : 0)) {
                Tabs.open(Tab.COMBAT);
                Time.sleepTicks(lllllIIl[0]);
                "".length();
            }
            if (llIIlllIlll(Tabs.isOpen(Tab.COMBAT) ? 1 : 0)) {
                Widget widget = Widgets.get(lllllIIl[67], lllllIIl[57]);
                if (llIIllllIlI(widget)) {
                    widget.interact(llllIlll[lllllIIl[68]]);
                    Time.sleepTicks(lllllIIl[0]);
                    "".length();
                }
            }
        }
    }

    public static void c(String str) {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(llllIlll[lllllIIl[15]]));
        bufferedWriter.write(str + System.getProperty(llllIlll[lllllIIl[16]]));
        bufferedWriter.newLine();
        bufferedWriter.close();
    }

    public static void B() {
        Widget widget = Widgets.get(lllllIIl[37], lllllIIl[38]);
        if (llIIllllIlI(widget)) {
            widget.interact(llllIlll[lllllIIl[39]]);
            Time.sleepTicks(lllllIIl[0]);
            "".length();
        }
    }

    private static void llIIlllIlII() {
        lllllIIl = new int[258];
        lllllIIl[0] = " ".length();
        lllllIIl[1] = ((222 + 84) - 195) + 118;
        lllllIIl[2] = ((26 + 60) - 77) + 153;
        lllllIIl[3] = (((((206 + 171) - 237) + 68) + (31 ^ 7)) - (((23 + 2) - (-21)) + 82)) + ((80 + 18) - (-25)) + 4;
        lllllIIl[4] = ((144 ^ 148) ^ (105 ^ 76)) & (((((37 + 42) - (-9)) + 84) ^ (((58 + 18) - 52) + 117)) ^ (-" ".length()));
        lllllIIl[5] = "   ".length();
        lllllIIl[6] = "  ".length();
        lllllIIl[7] = (((111 + 94) - 202) + 140) ^ (((110 + 109) - 105) + 25);
        lllllIIl[8] = 80 ^ 85;
        lllllIIl[9] = 62 ^ 56;
        lllllIIl[10] = 183 ^ 176;
        lllllIIl[11] = (((44 + 0) - (-82)) + 38) ^ (((1 + 145) - 12) + 38);
        lllllIIl[12] = 126 ^ 119;
        lllllIIl[13] = 175 ^ 165;
        lllllIIl[14] = 132 ^ 143;
        lllllIIl[15] = 112 ^ 124;
        lllllIIl[16] = 62 ^ 51;
        lllllIIl[17] = (-((-329) & 30031)) & (-66) & 30431;
        lllllIIl[18] = (135 ^ 175) ^ (79 ^ 122);
        lllllIIl[19] = (((120 + 157) - 156) + 49) ^ (((45 + 65) - 85) + 139);
        lllllIIl[20] = (107 ^ 95) ^ (107 ^ 80);
        lllllIIl[21] = (-9101) & 12268;
        lllllIIl[22] = (-((-3073) & 16042)) & (-1) & 16383;
        lllllIIl[23] = 74 ^ 119;
        lllllIIl[24] = (((75 + 36) - 85) + 148) ^ (((73 + 131) - 138) + 68);
        lllllIIl[25] = (-((-2723) & 10915)) & (-16521) & 32719;
        lllllIIl[26] = (57 ^ 20) ^ (29 ^ 32);
        lllllIIl[27] = 109 ^ 124;
        lllllIIl[28] = (((121 ^ 29) + (27 ^ 97)) - (((31 + 106) - 40) + 75)) + (56 ^ 108);
        lllllIIl[29] = 214 ^ 193;
        lllllIIl[30] = (235 ^ 159) ^ (18 ^ 116);
        lllllIIl[31] = (-529) & 15228;
        lllllIIl[32] = 138 ^ 153;
        lllllIIl[33] = 84 ^ 64;
        lllllIIl[34] = (-((-2121) & 19675)) & (-1) & 32255;
        lllllIIl[35] = 156 ^ 181;
        lllllIIl[36] = 188 ^ 169;
        lllllIIl[37] = 15 ^ 123;
        lllllIIl[38] = 71 ^ 103;
        lllllIIl[39] = 179 ^ 165;
        lllllIIl[40] = (189 ^ 177) ^ (178 ^ 166);
        lllllIIl[41] = 94 ^ 71;
        lllllIIl[42] = 15 ^ 21;
        lllllIIl[43] = (((1 + 85) - 41) + 109) ^ (((98 + 123) - 152) + 60);
        lllllIIl[44] = (38 ^ 108) ^ (12 ^ 90);
        lllllIIl[45] = (-899) & 23455;
        lllllIIl[46] = (-25667) & 28127;
        lllllIIl[47] = (-12993) & 16375;
        lllllIIl[48] = (-((-18961) & 32371)) & (-5) & 15871;
        lllllIIl[49] = (-((-14345) & 31375)) & (-4097) & 24510;
        lllllIIl[50] = (87 ^ 21) ^ (221 ^ 188);
        lllllIIl[51] = (-20617) & 23039;
        lllllIIl[52] = (-25281) & 28671;
        lllllIIl[53] = 208 ^ 151;
        lllllIIl[54] = (((166 ^ 129) + (6 ^ 76)) - (177 ^ 140)) + (30 ^ 69);
        lllllIIl[55] = (-((-12084) & 32567)) & (-8257) & 31199;
        lllllIIl[56] = (-((-5169) & 13495)) & (-16897) & 28639;
        lllllIIl[57] = 152 ^ 134;
        lllllIIl[58] = 100 ^ 123;
        lllllIIl[59] = (((95 + 59) - 9) + 31) ^ (((44 + 141) - 83) + 43);
        lllllIIl[60] = (102 ^ 51) ^ (252 ^ 139);
        lllllIIl[61] = (-((-26945) & 31555)) & (-8325) & 16319;
        lllllIIl[62] = (-((-5253) & 30375)) & (-129) & 28647;
        lllllIIl[63] = 229 ^ 193;
        lllllIIl[64] = 162 ^ 135;
        lllllIIl[65] = -" ".length();
        lllllIIl[66] = ((51 + 124) - 4) + 1;
        lllllIIl[67] = (-8227) & 8819;
        lllllIIl[68] = (((8 + 123) - (-40)) + 3) ^ (((122 + 8) - 100) + 106);
        lllllIIl[69] = 83 ^ 116;
        lllllIIl[70] = (((91 + 158) - 186) + 121) ^ (((52 + 26) - (-34)) + 34);
        lllllIIl[71] = 66 ^ 105;
        lllllIIl[72] = 105 ^ 69;
        lllllIIl[73] = 172 ^ 129;
        lllllIIl[74] = 164 ^ 150;
        lllllIIl[75] = ((24 + 13) - 9) + 125;
        lllllIIl[76] = (51 ^ 37) ^ (28 ^ 111);
        lllllIIl[77] = 14 ^ 32;
        lllllIIl[78] = (-28706) & 30655;
        lllllIIl[79] = 55 ^ 24;
        lllllIIl[80] = (7 ^ 83) ^ (27 ^ 127);
        lllllIIl[81] = (((38 + 147) - 122) + 178) ^ (((60 + 136) - 122) + 118);
        lllllIIl[82] = (-((-449) & 31717)) & (-1026) & 32767;
        lllllIIl[83] = (-11297) & 11829;
        lllllIIl[84] = 149 ^ 166;
        lllllIIl[85] = 155 ^ 175;
        lllllIIl[86] = (235 ^ 181) ^ (251 ^ 144);
        lllllIIl[87] = 127 ^ 73;
        lllllIIl[88] = 84 ^ 99;
        lllllIIl[89] = (((18 + 53) - (-48)) + 70) ^ (((47 + 123) - 151) + 114);
        lllllIIl[90] = (((139 + 112) - 137) + 75) ^ (((105 + 129) - 110) + 8);
        lllllIIl[91] = 77 ^ 119;
        lllllIIl[92] = 21 ^ 113;
        lllllIIl[93] = (((141 + 113) - 209) + 121) ^ (((78 + 25) - 58) + 112);
        lllllIIl[94] = 32 ^ 28;
        lllllIIl[95] = 142 ^ 176;
        lllllIIl[96] = (190 ^ 173) ^ (25 ^ 53);
        lllllIIl[97] = ((214 + 86) - 138) + 55;
        lllllIIl[98] = 193 ^ 129;
        lllllIIl[99] = ((105 + 40) - 102) + 150;
        lllllIIl[100] = (((249 ^ 185) + (((61 + 19) - 8) + 92)) - (((40 + 158) - 116) + 115)) + ((70 + 161) - 72) + 29;
        lllllIIl[101] = (-8193) & 11382;
        lllllIIl[102] = (-((-16735) & 25055)) & (-4099) & 15615;
        lllllIIl[103] = (-897) & 4094;
        lllllIIl[104] = (-25427) & 28630;
        lllllIIl[105] = (-((-97) & 491)) & (-16389) & 19966;
        lllllIIl[106] = (-((-2085) & 22583)) & (-8321) & 32255;
        lllllIIl[107] = (82 ^ 79) ^ (76 ^ 58);
        lllllIIl[108] = (-9733) & 10078;
        lllllIIl[109] = (-5190) & 5495;
        lllllIIl[110] = (-7818) & 8127;
        lllllIIl[111] = (-((-1356) & 22491)) & (-3073) & 24559;
        lllllIIl[112] = (-((-1001) & 31741)) & (-1153) & 32247;
        lllllIIl[113] = (-28690) & 29045;
        lllllIIl[114] = (-20123) & 20479;
        lllllIIl[115] = (-31377) & 31734;
        lllllIIl[116] = (-5705) & 6090;
        lllllIIl[117] = (-27653) & 28047;
        lllllIIl[118] = (-((-4401) & 24374)) & (-4105) & 24543;
        lllllIIl[119] = (-((-8485) & 16182)) & (-24577) & 32767;
        lllllIIl[120] = (-((-2311) & 32519)) & (-17) & 30719;
        lllllIIl[121] = (-7695) & 8190;
        lllllIIl[122] = (-((-9494) & 15799)) & (-25605) & 32445;
        lllllIIl[123] = (-32010) & 32525;
        lllllIIl[124] = (-((-13699) & 32135)) & (-5634) & 24383;
        lllllIIl[125] = (-6673) & 7163;
        lllllIIl[126] = (-((-21831) & 32247)) & (-1025) & 11774;
        lllllIIl[127] = (-20486) & 20839;
        lllllIIl[128] = (-((-8479) & 30527)) & (-10243) & 32767;
        lllllIIl[129] = (-((-4426) & 15359)) & (-20489) & 31743;
        lllllIIl[130] = (-((-301) & 31597)) & (-131) & 31731;
        lllllIIl[131] = (-17605) & 17919;
        lllllIIl[132] = (-((-2110) & 16063)) & (-18441) & 32763;
        lllllIIl[133] = (-18571) & 18894;
        lllllIIl[134] = (-26297) & 26621;
        lllllIIl[135] = (-16936) & 17263;
        lllllIIl[136] = (-9281) & 9725;
        lllllIIl[137] = (-((-2755) & 3811)) & (-31246) & 32765;
        lllllIIl[138] = (-5666) & 6143;
        lllllIIl[139] = (-22033) & 22522;
        lllllIIl[140] = (-((-4420) & 8007)) & (-4097) & 8175;
        lllllIIl[141] = (-26117) & 26623;
        lllllIIl[142] = (-12757) & 13278;
        lllllIIl[143] = (-((-1317) & 13749)) & (-17410) & 30171;
        lllllIIl[144] = (-28681) & 29145;
        lllllIIl[145] = (-20524) & 21035;
        lllllIIl[146] = (-((-3597) & 24269)) & (-1297) & 22527;
        lllllIIl[147] = (-" ".length()) & (-1665) & 2041;
        lllllIIl[148] = (-(((68 + 163) - 177) + 126)) & (-18433) & 18943;
        lllllIIl[149] = (-((-241) & 31479)) & (-1) & 31743;
        lllllIIl[150] = (-((-4569) & 13817)) & (-4609) & 14193;
        lllllIIl[151] = (-18821) & 19334;
        lllllIIl[152] = (-32281) & 32607;
        lllllIIl[153] = (-23054) & 23533;
        lllllIIl[154] = (-((-2065) & 18962)) & (-14371) & 31611;
        lllllIIl[155] = (-16897) & 17375;
        lllllIIl[156] = (-((-25859) & 28435)) & (-29699) & 32767;
        lllllIIl[157] = (-14977) & 15318;
        lllllIIl[158] = (-((-911) & 20431)) & (-12289) & 32254;
        lllllIIl[159] = (-((-8257) & 15986)) & (-24709) & 32757;
        lllllIIl[160] = (-15009) & 15358;
        lllllIIl[161] = (-((-355) & 14203)) & (-2209) & 16377;
        lllllIIl[162] = (-6785) & 7125;
        lllllIIl[163] = (-8201) & 8622;
        lllllIIl[164] = (-23073) & 23535;
        lllllIIl[165] = (-3209) & 3582;
        lllllIIl[166] = (-9217) & 9592;
        lllllIIl[167] = (-25615) & 25950;
        lllllIIl[168] = (-29827) & 30155;
        lllllIIl[169] = (-20001) & 20331;
        lllllIIl[170] = (-((-4877) & 32703)) & (-1) & 28159;
        lllllIIl[171] = (-1539) & 1842;
        lllllIIl[172] = (-3222) & 3583;
        lllllIIl[173] = (251 ^ 195) ^ (221 ^ 164);
        lllllIIl[174] = (-25649) & 25971;
        lllllIIl[175] = 128 ^ 194;
        lllllIIl[176] = (-31429) & 31735;
        lllllIIl[177] = 32 ^ 99;
        lllllIIl[178] = (-((-30739) & 32347)) & (-16385) & 18301;
        lllllIIl[179] = (120 ^ 26) ^ (95 ^ 121);
        lllllIIl[180] = (-((-17925) & 22221)) & (-26625) & 31231;
        lllllIIl[181] = (176 ^ 186) ^ (36 ^ 107);
        lllllIIl[182] = (-1537) & 1911;
        lllllIIl[183] = 112 ^ 54;
        lllllIIl[184] = (-((-16915) & 31383)) & (-16385) & 31230;
        lllllIIl[185] = (-5) & 517;
        lllllIIl[186] = 84 ^ 28;
        lllllIIl[187] = (-2049) & 2351;
        lllllIIl[188] = (138 ^ 188) ^ (((76 + 95) - 47) + 3);
        lllllIIl[189] = (-2567) & 2878;
        lllllIIl[190] = 12 ^ 70;
        lllllIIl[191] = (-((-1317) & 18407)) & (-2049) & 19451;
        lllllIIl[192] = (((78 + 55) - (-16)) + 51) ^ (((49 + 113) - 67) + 36);
        lllllIIl[193] = (-22659) & 22975;
        lllllIIl[194] = 52 ^ 120;
        lllllIIl[195] = (-27265) & 27603;
        lllllIIl[196] = 65 ^ 12;
        lllllIIl[197] = (-17962) & 18301;
        lllllIIl[198] = (153 ^ 196) ^ (157 ^ 142);
        lllllIIl[199] = (-10401) & 10743;
        lllllIIl[200] = 142 ^ 193;
        lllllIIl[201] = (-28197) & 28543;
        lllllIIl[202] = 69 ^ 21;
        lllllIIl[203] = (-((-4) & 17063)) & (-11265) & 28671;
        lllllIIl[204] = (((24 + 151) - (-9)) + 47) ^ (((21 + 39) - (-90)) + 32);
        lllllIIl[205] = (-8833) & 9183;
        lllllIIl[206] = (208 ^ 156) ^ (170 ^ 180);
        lllllIIl[207] = (-((-43) & 13867)) & (-16401) & 30583;
        lllllIIl[208] = (236 ^ 176) ^ (65 ^ 78);
        lllllIIl[209] = (-((-20516) & 30267)) & (-6273) & 16383;
        lllllIIl[210] = (55 ^ 51) ^ (224 ^ 176);
        lllllIIl[211] = (-9233) & 9599;
        lllllIIl[212] = (174 ^ 191) ^ (11 ^ 79);
        lllllIIl[213] = (-((-10596) & 32743)) & (-10241) & 32755;
        lllllIIl[214] = 123 ^ 45;
        lllllIIl[215] = (-((-993) & 8187)) & (-8197) & 15871;
        lllllIIl[216] = 118 ^ 33;
        lllllIIl[217] = (-((-18821) & 31646)) & (-1029) & 14335;
        lllllIIl[218] = 21 ^ 77;
        lllllIIl[219] = (-((-2693) & 11933)) & (-16385) & 26108;
        lllllIIl[220] = 218 ^ 131;
        lllllIIl[221] = (-3595) & 4079;
        lllllIIl[222] = (((177 + 95) - 238) + 161) ^ (((44 + 109) - 118) + 118);
        lllllIIl[223] = (-((-965) & 13277)) & (-2) & 12799;
        lllllIIl[224] = (((76 + 227) - 187) + 122) ^ (((166 + 45) - 139) + 109);
        lllllIIl[225] = (-18953) & 19439;
        lllllIIl[226] = (((11 + 42) - 45) + 193) ^ (((113 + 144) - 149) + 41);
        lllllIIl[227] = (-1544) & 2031;
        lllllIIl[228] = 32 ^ 125;
        lllllIIl[229] = (-18947) & 19435;
        lllllIIl[230] = 122 ^ 36;
        lllllIIl[231] = (-22021) & 22526;
        lllllIIl[232] = (93 ^ 46) ^ (127 ^ 83);
        lllllIIl[233] = (-((-32049) & 32563)) & (-7169) & 8190;
        lllllIIl[234] = 67 ^ 35;
        lllllIIl[235] = (-((-4293) & 31431)) & (-5121) & 32767;
        lllllIIl[236] = 13 ^ 108;
        lllllIIl[237] = (-((-741) & 24294)) & (-8193) & 32255;
        lllllIIl[238] = (14 ^ 124) ^ (167 ^ 183);
        lllllIIl[239] = (-20481) & 20991;
        lllllIIl[240] = 233 ^ 138;
        lllllIIl[241] = (-((-9025) & 30683)) & (-2401) & 24575;
        lllllIIl[242] = (-13386) & 13903;
        lllllIIl[243] = (-((-787) & 13243)) & (-81) & 13055;
        lllllIIl[244] = (((9 + 177) - 108) + 133) ^ (((162 + 76) - 124) + 67);
        lllllIIl[245] = (-((-97) & 3187)) & (-16742) & 20351;
        lllllIIl[246] = (77 ^ 113) ^ (217 ^ 130);
        lllllIIl[247] = (-17557) & 18077;
        lllllIIl[248] = (((132 + 3) - 7) + 114) ^ (((88 + 19) - 17) + 64);
        lllllIIl[249] = (-((-707) & 16119)) & (-1) & 15935;
        lllllIIl[250] = (((52 + 7) - (-86)) + 97) ^ (((114 + 17) - 81) + 105);
        lllllIIl[251] = (-((-17225) & 23515)) & (-8482) & 15295;
        lllllIIl[252] = 209 ^ 187;
        lllllIIl[253] = (-((-2495) & 7679)) & (-2339) & 8047;
        lllllIIl[254] = (-4146) & 7353;
        lllllIIl[255] = (-((-10881) & 31725)) & (-8193) & 32255;
        lllllIIl[256] = (-((-18313) & 30635)) & (-17473) & 32751;
        lllllIIl[257] = (-(((179 + 126) - 213) + 134)) & (-8721) & 12277;
    }

    public static int u() {
        return af[c(lllllIIl[4], af.length - lllllIIl[0])];
    }

    public static String h(int i) {
        return NumberFormat.getNumberInstance(Locale.US).format(i);
    }

    public static void k(int i) {
        if (llIIlllllIl(Static.getClient().getWorld(), i)) {
            World findWorld = Static.getWorldService().getWorlds().findWorld(i);
            if (llIIllllllI(findWorld)) {
                return;
            }
            if (llIIlllIlll(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            net.runelite.api.World createWorld = Static.getClient().createWorld();
            createWorld.setActivity(findWorld.getActivity());
            createWorld.setAddress(findWorld.getAddress());
            createWorld.setId(findWorld.getId());
            createWorld.setPlayerCount(findWorld.getPlayers());
            createWorld.setLocation(findWorld.getLocation());
            createWorld.setTypes(WorldUtil.toWorldTypes(findWorld.getTypes()));
            Worlds.hopTo(createWorld);
        }
    }

    private static boolean llIIlllllII(int i, int i2) {
        return i <= i2;
    }

    private static boolean llIIlllllIl(int i, int i2) {
        return i != i2;
    }

    public static long a(long j) {
        return t() - j;
    }

    public static void a(HashMap<Integer, Integer> hashMap, boolean z, boolean z2) {
        int i;
        if (llIIllllIll(Players.getLocal().getWorldLocation().distanceTo(ae), lllllIIl[7])) {
            AccBuilderBarrows.c = llllIlll[lllllIIl[20]];
            WorldArea worldArea = new WorldArea(lllllIIl[21], lllllIIl[22], lllllIIl[23], lllllIIl[24], lllllIIl[4]);
            int[] iArr = new int[lllllIIl[0]];
            iArr[lllllIIl[4]] = lllllIIl[25];
            boolean contains = Inventory.contains(iArr);
            if (llIIlllIlIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                i = lllllIIl[0];
                "".length();
                if ((34 ^ 39) <= 0) {
                    return;
                }
            } else {
                i = lllllIIl[4];
            }
            if (llIIlllIlll((contains ? 1 : 0) & i)) {
                int[] iArr2 = new int[lllllIIl[0]];
                iArr2[lllllIIl[4]] = lllllIIl[25];
                Inventory.getFirst(iArr2).interact(llllIlll[lllllIIl[26]]);
                Time.sleepTicks(lllllIIl[11]);
                "".length();
            }
            Movement.walkTo(ae);
            "".length();
            Time.sleepTicks(lllllIIl[0]);
            "".length();
        }
        if (llIIlllllII(Players.getLocal().getWorldLocation().distanceTo(ae), lllllIIl[7])) {
            if (llIIlllIlIl(Bank.isOpen() ? 1 : 0)) {
                C0000a.a();
            }
            AccBuilderBarrows.c = llllIlll[lllllIIl[27]];
            int lIIllIlIIlIllIl = z ? 1 : 0;
            if (llIIlllIlll(lIIllIlIIlIllIl) && llIIlllllll(Inventory.getAll().size())) {
                Bank.depositInventory();
                Time.sleepTicks(lllllIIl[7]);
                "".length();
            }
            if (llIIlllIlll(z2 ? 1 : 0) && llIIlllllll(Equipment.getAll().size())) {
                Bank.depositEquipment();
                Time.sleepTicks(lllllIIl[6]);
                "".length();
            }
            for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
                int intValue = entry.getKey().intValue();
                int intValue2 = entry.getValue().intValue();
                System.out.println("Key: " + intValue + ", Value: " + intValue2);
                C0000a.a(intValue, intValue2);
                Time.sleepTicks(lllllIIl[0]);
                "".length();
                "".length();
                if ((-"   ".length()) >= 0) {
                    return;
                }
            }
        }
    }

    private static boolean llIIllllIlI(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public static boolean A() {
        if (llIIllllIlI(Widgets.get(lllllIIl[28], lllllIIl[0]))) {
            ?? r0 = lllllIIl[0];
            "".length();
            return " ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lllllIIl[4];
    }

    private static boolean llIIllllIll(int i, int i2) {
        return i > i2;
    }

    private static boolean llIIlllIllI(int i, int i2) {
        return i == i2;
    }

    private static boolean llIIlllllll(int i) {
        return i > 0;
    }

    public static String b(long j) {
        String str = llllIlll[lllllIIl[14]];
        Object[] objArr = new Object[lllllIIl[0]];
        objArr[lllllIIl[4]] = Integer.valueOf(lllllIIl[6]);
        String format = String.format(str, objArr);
        long j2 = j / 1000;
        Object[] objArr2 = new Object[lllllIIl[0]];
        objArr2[lllllIIl[4]] = Long.valueOf(j2 % 60);
        String format2 = String.format(format, objArr2);
        Object[] objArr3 = new Object[lllllIIl[0]];
        objArr3[lllllIIl[4]] = Long.valueOf((j2 % 3600) / 60);
        String format3 = String.format(format, objArr3);
        Object[] objArr4 = new Object[lllllIIl[0]];
        objArr4[lllllIIl[4]] = Long.valueOf(j2 / 3600);
        return String.format(format, objArr4) + ":" + format3 + ":" + format2;
    }

    private static String llIIllIlllI(String lIIllIIlIllllll, String lIIllIIlIlllllI) {
        String str = new String(Base64.getDecoder().decode(lIIllIIlIllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIllIIlIllllIl = new StringBuilder();
        char[] lIIllIIlIllllII = lIIllIIlIlllllI.toCharArray();
        int lIIllIIlIlllIll = lllllIIl[4];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lllllIIl[4];
        while (llIIllllIIl(i, length)) {
            lIIllIIlIllllIl.append((char) (charArray[i] ^ lIIllIIlIllllII[lIIllIIlIlllIll % lIIllIIlIllllII.length]));
            "".length();
            lIIllIIlIlllIll++;
            i++;
            "".length();
            if (((((140 + 11) - 70) + 111) ^ (((73 + 26) - 93) + 190)) < 0) {
                return null;
            }
        }
        return String.valueOf(lIIllIIlIllllIl);
    }

    private static boolean llIIlllIlIl(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    public static void H() {
        if (llIIlllIlIl(Widgets.get(lllllIIl[75]).isEmpty() ? 1 : 0)) {
            Widget widget = Widgets.get(lllllIIl[75], lllllIIl[26]);
            Mouse.click(widget.getClickPoint().getX(), widget.getClickPoint().getY(), (boolean) lllllIIl[0]);
            Time.sleepTicks(lllllIIl[5]);
            "".length();
        }
    }

    public static void c(WorldPoint worldPoint) {
        int i;
        int i2;
        Client client = Static.getClient();
        if (llIIllllllI(client.getLocalPlayer())) {
            return;
        }
        int x = worldPoint.getX() - client.getBaseX();
        int y = worldPoint.getY() - client.getBaseY();
        Point localToCanvas = Perspective.localToCanvas(client, LocalPoint.fromScene(x, y), client.getPlane());
        if (llIIllllIlI(localToCanvas)) {
            i = localToCanvas.getX();
            "".length();
            if ("  ".length() <= 0) {
                return;
            }
        } else {
            i = lllllIIl[65];
        }
        int lIIllIIllllIlll = i;
        if (llIIllllIlI(localToCanvas)) {
            i2 = localToCanvas.getY();
            "".length();
            if ("  ".length() <= (-" ".length())) {
                return;
            }
        } else {
            i2 = lllllIIl[65];
        }
        client.interact(lllllIIl[4], MenuAction.WALK.getId(), x, y, lIIllIIllllIlll, i2);
    }

    private static String llIIllIllll(String lIIllIIllIIllll, String lIIllIIllIIlllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIllIIllIIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIllIIllIlIIIl = Cipher.getInstance("Blowfish");
            lIIllIIllIlIIIl.init(lllllIIl[6], secretKeySpec);
            return new String(lIIllIIllIlIIIl.doFinal(Base64.getDecoder().decode(lIIllIIllIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIllIIllIlIIII) {
            lIIllIIllIlIIII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public static boolean b(int[] iArr) {
        int i = lllllIIl[4];
        while (llIIllllIIl(i, iArr.length)) {
            if (llIIlllIlIl(i(iArr[i]) ? 1 : 0)) {
                System.out.println("Missing ID: " + iArr[i]);
                return lllllIIl[4];
            }
            i++;
            "".length();
            if ((-" ".length()) >= "   ".length()) {
                return ((165 ^ 143) ^ (7 ^ 79)) & (((83 ^ 117) ^ (195 ^ 135)) ^ (-" ".length()));
            }
        }
        return lllllIIl[0];
    }

    public static void C() {
        Worlds.hopTo(Worlds.getRandom(world -> {
            if (llIIlllIlll(world.isMembers() ? 1 : 0) && llIIlllllII(world.getPlayerCount(), lllllIIl[78]) && llIIlllllIl(world.getId(), Worlds.getCurrentId()) && llIIlllIlIl(world.getActivity().endsWith(llllIlll[lllllIIl[79]]) ? 1 : 0) && llIIlllIlIl(world.getActivity().endsWith(llllIlll[lllllIIl[80]]) ? 1 : 0) && llIIlllIlIl(world.getActivity().startsWith(llllIlll[lllllIIl[81]]) ? 1 : 0) && llIIlllIlIl(world.getActivity().startsWith(llllIlll[lllllIIl[74]]) ? 1 : 0) && llIIlllllIl(world.getId(), lllllIIl[82]) && llIIlllllIl(world.getId(), lllllIIl[83]) && llIIlllllIl(world.getId(), lllllIIl[83]) && llIIlllIlIl(world.getActivity().contains(llllIlll[lllllIIl[84]]) ? 1 : 0) && llIIlllIlIl(world.getActivity().contains(llllIlll[lllllIIl[85]]) ? 1 : 0) && llIIlllIlIl(world.getActivity().contains(llllIlll[lllllIIl[86]]) ? 1 : 0) && llIIlllIlIl(world.getActivity().startsWith(llllIlll[lllllIIl[87]]) ? 1 : 0) && llIIlllIlIl(world.getActivity().endsWith(llllIlll[lllllIIl[88]]) ? 1 : 0) && llIIlllIlIl(world.getActivity().endsWith(llllIlll[lllllIIl[89]]) ? 1 : 0) && llIIlllIlIl(world.getActivity().endsWith(llllIlll[lllllIIl[90]]) ? 1 : 0) && llIIlllIlIl(world.getActivity().startsWith(llllIlll[lllllIIl[91]]) ? 1 : 0) && llIIllllIll(world.getPlayerCount(), lllllIIl[92])) {
                ?? r0 = lllllIIl[0];
                "".length();
                return (-" ".length()) > (79 ^ 75) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lllllIIl[4];
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14, types: [boolean] */
    public static void F() {
        int i = lllllIIl[4];
        do {
            String[] strArr = new String[lllllIIl[0]];
            strArr[lllllIIl[4]] = llllIlll[lllllIIl[24]];
            if (!llIIllllIlI(TileObjects.getNearest(strArr)) || !llIIlllIlIl(AccBuilderBarrows.d ? 1 : 0)) {
                return;
            }
            AccBuilderBarrows.c = llllIlll[lllllIIl[35]];
            String[] strArr2 = new String[lllllIIl[0]];
            strArr2[lllllIIl[4]] = llllIlll[lllllIIl[70]];
            NPC nearest = NPCs.getNearest(strArr2);
            if (llIIlllIlIl(i)) {
                if (llIIlllIlIl(Dialog.isOpen() ? 1 : 0)) {
                    nearest.interact(llllIlll[lllllIIl[71]]);
                }
                if (llIIlllIlll(Dialog.isOpen() ? 1 : 0)) {
                    if (llIIlllIlIl(Dialog.canContinueNPC() ? 1 : 0) && llIIlllIlIl(Dialog.canContinue() ? 1 : 0)) {
                        List options = Dialog.getOptions();
                        if (llIIlllIlIl(options.isEmpty() ? 1 : 0)) {
                            List list = (List) options.stream().filter(widget -> {
                                if (llIIlllIlIl(widget.getText().contains(llllIlll[lllllIIl[77]]) ? 1 : 0)) {
                                    ?? r0 = lllllIIl[0];
                                    "".length();
                                    return (-" ".length()) != (-" ".length()) ? ((205 ^ 183) ^ (161 ^ 134)) & (((127 ^ 14) ^ (100 ^ 72)) ^ (-" ".length())) : r0;
                                }
                                return lllllIIl[4];
                            }).collect(Collectors.toList());
                            if (llIIlllIlIl(list.isEmpty() ? 1 : 0)) {
                                Mouse.click(((Widget) list.get(lllllIIl[4])).getClickPoint().getX(), ((Widget) list.get(lllllIIl[4])).getClickPoint().getY(), (boolean) lllllIIl[0]);
                                Time.sleepTicks(lllllIIl[5]);
                                "".length();
                            }
                            if (llIIlllIllI(list.size(), lllllIIl[0])) {
                                i = lllllIIl[0];
                            }
                        }
                    }
                    if (!llIIlllIlIl(Dialog.canContinueNPC() ? 1 : 0) || llIIlllIlll(Dialog.canContinue() ? 1 : 0)) {
                        Dialog.continueSpace();
                    }
                }
            }
            if (llIIlllIlll(i)) {
                String[] strArr3 = new String[lllllIIl[0]];
                strArr3[lllllIIl[4]] = llllIlll[lllllIIl[72]];
                TileObjects.getNearest(strArr3).interact(llllIlll[lllllIIl[73]]);
                Time.sleepTicks(lllllIIl[8]);
                "".length();
            }
            Time.sleepTicks(lllllIIl[0]);
            "".length();
            "".length();
        } while (0 == 0);
    }

    private static boolean llIIllllIII(int i) {
        return i < 0;
    }

    static {
        llIIlllIlII();
        llIIlllIIll();
        aa = lllllIIl[97];
        Z = lllllIIl[3];
        ac = lllllIIl[1];
        R = llllIlll[lllllIIl[98]];
        Y = lllllIIl[99];
        ab = lllllIIl[100];
        S = ThreadLocalRandom.current();
        T = new WorldArea(lllllIIl[101], lllllIIl[102], lllllIIl[74], lllllIIl[80], lllllIIl[4]);
        U = new WorldArea(lllllIIl[103], lllllIIl[104], lllllIIl[29], lllllIIl[57], lllllIIl[0]);
        V = System.currentTimeMillis();
        W = System.nanoTime();
        X = new HashMap();
        int[] iArr = new int[lllllIIl[8]];
        iArr[lllllIIl[4]] = lllllIIl[99];
        iArr[lllllIIl[0]] = lllllIIl[3];
        iArr[lllllIIl[6]] = lllllIIl[97];
        iArr[lllllIIl[5]] = lllllIIl[100];
        iArr[lllllIIl[7]] = lllllIIl[1];
        ad = iArr;
        ae = new WorldPoint(lllllIIl[105], lllllIIl[106], lllllIIl[4]);
        int[] iArr2 = new int[lllllIIl[107]];
        iArr2[lllllIIl[4]] = lllllIIl[108];
        iArr2[lllllIIl[0]] = lllllIIl[109];
        iArr2[lllllIIl[6]] = lllllIIl[110];
        iArr2[lllllIIl[5]] = lllllIIl[111];
        iArr2[lllllIIl[7]] = lllllIIl[112];
        iArr2[lllllIIl[8]] = lllllIIl[113];
        iArr2[lllllIIl[9]] = lllllIIl[114];
        iArr2[lllllIIl[10]] = lllllIIl[115];
        iArr2[lllllIIl[11]] = lllllIIl[116];
        iArr2[lllllIIl[12]] = lllllIIl[117];
        iArr2[lllllIIl[13]] = lllllIIl[118];
        iArr2[lllllIIl[14]] = lllllIIl[119];
        iArr2[lllllIIl[15]] = lllllIIl[120];
        iArr2[lllllIIl[16]] = lllllIIl[121];
        iArr2[lllllIIl[19]] = lllllIIl[122];
        iArr2[lllllIIl[20]] = lllllIIl[123];
        iArr2[lllllIIl[26]] = lllllIIl[124];
        iArr2[lllllIIl[27]] = lllllIIl[125];
        iArr2[lllllIIl[30]] = lllllIIl[126];
        iArr2[lllllIIl[32]] = lllllIIl[127];
        iArr2[lllllIIl[33]] = lllllIIl[128];
        iArr2[lllllIIl[36]] = lllllIIl[129];
        iArr2[lllllIIl[39]] = lllllIIl[130];
        iArr2[lllllIIl[29]] = lllllIIl[131];
        iArr2[lllllIIl[40]] = lllllIIl[132];
        iArr2[lllllIIl[41]] = lllllIIl[133];
        iArr2[lllllIIl[42]] = lllllIIl[134];
        iArr2[lllllIIl[43]] = lllllIIl[135];
        iArr2[lllllIIl[44]] = lllllIIl[136];
        iArr2[lllllIIl[18]] = lllllIIl[137];
        iArr2[lllllIIl[57]] = lllllIIl[138];
        iArr2[lllllIIl[58]] = lllllIIl[139];
        iArr2[lllllIIl[38]] = lllllIIl[140];
        iArr2[lllllIIl[59]] = lllllIIl[141];
        iArr2[lllllIIl[60]] = lllllIIl[142];
        iArr2[lllllIIl[50]] = lllllIIl[143];
        iArr2[lllllIIl[63]] = lllllIIl[144];
        iArr2[lllllIIl[64]] = lllllIIl[145];
        iArr2[lllllIIl[68]] = lllllIIl[146];
        iArr2[lllllIIl[69]] = lllllIIl[147];
        iArr2[lllllIIl[24]] = lllllIIl[148];
        iArr2[lllllIIl[35]] = lllllIIl[149];
        iArr2[lllllIIl[70]] = lllllIIl[150];
        iArr2[lllllIIl[71]] = lllllIIl[151];
        iArr2[lllllIIl[72]] = lllllIIl[152];
        iArr2[lllllIIl[73]] = lllllIIl[153];
        iArr2[lllllIIl[77]] = lllllIIl[154];
        iArr2[lllllIIl[79]] = lllllIIl[155];
        iArr2[lllllIIl[80]] = lllllIIl[156];
        iArr2[lllllIIl[81]] = lllllIIl[157];
        iArr2[lllllIIl[74]] = lllllIIl[158];
        iArr2[lllllIIl[84]] = lllllIIl[159];
        iArr2[lllllIIl[85]] = lllllIIl[160];
        iArr2[lllllIIl[86]] = lllllIIl[161];
        iArr2[lllllIIl[87]] = lllllIIl[162];
        iArr2[lllllIIl[88]] = lllllIIl[163];
        iArr2[lllllIIl[89]] = lllllIIl[164];
        iArr2[lllllIIl[90]] = lllllIIl[165];
        iArr2[lllllIIl[91]] = lllllIIl[166];
        iArr2[lllllIIl[93]] = lllllIIl[167];
        iArr2[lllllIIl[94]] = lllllIIl[168];
        iArr2[lllllIIl[23]] = lllllIIl[169];
        iArr2[lllllIIl[95]] = lllllIIl[170];
        iArr2[lllllIIl[96]] = lllllIIl[171];
        iArr2[lllllIIl[98]] = lllllIIl[172];
        iArr2[lllllIIl[173]] = lllllIIl[174];
        iArr2[lllllIIl[175]] = lllllIIl[176];
        iArr2[lllllIIl[177]] = lllllIIl[178];
        iArr2[lllllIIl[179]] = lllllIIl[180];
        iArr2[lllllIIl[181]] = lllllIIl[182];
        iArr2[lllllIIl[183]] = lllllIIl[184];
        iArr2[lllllIIl[53]] = lllllIIl[185];
        iArr2[lllllIIl[186]] = lllllIIl[187];
        iArr2[lllllIIl[188]] = lllllIIl[189];
        iArr2[lllllIIl[190]] = lllllIIl[191];
        iArr2[lllllIIl[192]] = lllllIIl[193];
        iArr2[lllllIIl[194]] = lllllIIl[195];
        iArr2[lllllIIl[196]] = lllllIIl[197];
        iArr2[lllllIIl[198]] = lllllIIl[199];
        iArr2[lllllIIl[200]] = lllllIIl[201];
        iArr2[lllllIIl[202]] = lllllIIl[203];
        iArr2[lllllIIl[204]] = lllllIIl[205];
        iArr2[lllllIIl[206]] = lllllIIl[207];
        iArr2[lllllIIl[208]] = lllllIIl[209];
        iArr2[lllllIIl[210]] = lllllIIl[211];
        iArr2[lllllIIl[212]] = lllllIIl[213];
        iArr2[lllllIIl[214]] = lllllIIl[215];
        iArr2[lllllIIl[216]] = lllllIIl[217];
        iArr2[lllllIIl[218]] = lllllIIl[219];
        iArr2[lllllIIl[220]] = lllllIIl[221];
        iArr2[lllllIIl[222]] = lllllIIl[223];
        iArr2[lllllIIl[224]] = lllllIIl[225];
        iArr2[lllllIIl[226]] = lllllIIl[227];
        iArr2[lllllIIl[228]] = lllllIIl[229];
        iArr2[lllllIIl[230]] = lllllIIl[231];
        iArr2[lllllIIl[232]] = lllllIIl[233];
        iArr2[lllllIIl[234]] = lllllIIl[235];
        iArr2[lllllIIl[236]] = lllllIIl[237];
        iArr2[lllllIIl[238]] = lllllIIl[239];
        iArr2[lllllIIl[240]] = lllllIIl[241];
        iArr2[lllllIIl[92]] = lllllIIl[242];
        iArr2[lllllIIl[76]] = lllllIIl[243];
        iArr2[lllllIIl[244]] = lllllIIl[245];
        iArr2[lllllIIl[246]] = lllllIIl[247];
        iArr2[lllllIIl[248]] = lllllIIl[249];
        iArr2[lllllIIl[250]] = lllllIIl[251];
        iArr2[lllllIIl[252]] = lllllIIl[253];
        af = iArr2;
        ag = new WorldPoint(lllllIIl[254], lllllIIl[255], lllllIIl[6]);
        ah = new WorldArea(lllllIIl[256], lllllIIl[257], lllllIIl[59], lllllIIl[39], lllllIIl[4]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean] */
    public static void a(String str, String str2) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setRequestMethod(llllIlll[lllllIIl[50]]);
            httpURLConnection.setRequestProperty(llllIlll[lllllIIl[63]], llllIlll[lllllIIl[64]]);
            httpURLConnection.setDoOutput(lllllIIl[0]);
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.writeBytes("{\"content\": \"" + str2 + "\"}");
            dataOutputStream.flush();
            dataOutputStream.close();
            System.out.println("Response Code: " + httpURLConnection.getResponseCode());
            httpURLConnection.disconnect();
            "".length();
            if (0 != 0) {
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    public static boolean G() {
        if (llIIlllIlIl(T.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIlllIlIl(U.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIllllIll(Players.getLocal().getWorldLocation().distanceTo(ag), lllllIIl[74]) && !llIIlllIlll(ah.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            return lllllIIl[4];
        }
        ?? r0 = lllllIIl[0];
        "".length();
        return (-" ".length()) >= 0 ? ((((60 + 116) - 74) + 35) ^ (((20 + 172) - 184) + 181)) & (((((16 + 123) - (-9)) + 35) ^ (((107 + 98) - 102) + 28)) ^ (-" ".length())) : r0;
    }

    public static int j(int i) {
        return ((Integer) GameThread.invokeLater(() -> {
            return Integer.valueOf(Static.getClient().getVarpValue(i));
        })).intValue();
    }

    public static void x() {
        Widget widget = Widgets.get(lllllIIl[17], lllllIIl[18], lllllIIl[4]);
        if (llIIllllIlI(widget)) {
            widget.interact(llllIlll[lllllIIl[19]]);
            Time.sleepTicks(lllllIIl[5]);
            "".length();
        }
    }

    public static void w() {
        if (llIIlllIlll(Bank.isOpen() ? 1 : 0)) {
            Bank.close();
            Time.sleepTicks(lllllIIl[7]);
            "".length();
        }
        if (llIIlllIlll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (llIIlllIlIl(Bank.isOpen() ? 1 : 0)) {
            C();
        }
    }

    public static double v() {
        return (Skills.getBoostedLevel(Skill.HITPOINTS) / Skills.getLevel(Skill.HITPOINTS)) * 100.0d;
    }

    public static void s() {
        Widgets.getAll(lllllIIl[1], widget -> {
            return widget.getText().contains(llllIlll[lllllIIl[96]]);
        });
        Widgets.getAll(lllllIIl[2], widget2 -> {
            return widget2.getText().contains(llllIlll[lllllIIl[95]]);
        });
        Widgets.getAll(lllllIIl[3], widget3 -> {
            return widget3.getText().contains(llllIlll[lllllIIl[23]]);
        });
        int i = lllllIIl[4];
        while (llIIllllIIl(i, ad.length)) {
            if (llIIllllIlI(Widgets.get(ad[i], widget4 -> {
                return widget4.getText().contains(llllIlll[lllllIIl[94]]);
            }))) {
                Keyboard.sendSpace();
                System.out.println("Found Conversation continue window :" + ad[i]);
            }
            i++;
            "".length();
            if ((-" ".length()) >= 0) {
                return;
            }
        }
    }

    public static void l(int i) {
        int[] iArr = new int[lllllIIl[0]];
        iArr[lllllIIl[4]] = i;
        if (llIIlllIlll(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lllllIIl[0]];
            iArr2[lllllIIl[4]] = i;
            if (llIIlllIlIl(Equipment.contains(iArr2) ? 1 : 0)) {
                int[] iArr3 = new int[lllllIIl[0]];
                iArr3[lllllIIl[4]] = i;
                Item first = Inventory.getFirst(iArr3);
                String[] strArr = new String[lllllIIl[0]];
                strArr[lllllIIl[4]] = llllIlll[lllllIIl[29]];
                if (llIIlllIlll(first.hasAction(strArr) ? 1 : 0)) {
                    int[] iArr4 = new int[lllllIIl[0]];
                    iArr4[lllllIIl[4]] = i;
                    Inventory.getFirst(iArr4).interact(llllIlll[lllllIIl[40]]);
                }
                int[] iArr5 = new int[lllllIIl[0]];
                iArr5[lllllIIl[4]] = i;
                Item first2 = Inventory.getFirst(iArr5);
                String[] strArr2 = new String[lllllIIl[0]];
                strArr2[lllllIIl[4]] = llllIlll[lllllIIl[41]];
                if (llIIlllIlll(first2.hasAction(strArr2) ? 1 : 0)) {
                    int[] iArr6 = new int[lllllIIl[0]];
                    iArr6[lllllIIl[4]] = i;
                    Inventory.getFirst(iArr6).interact(llllIlll[lllllIIl[42]]);
                }
                int[] iArr7 = new int[lllllIIl[0]];
                iArr7[lllllIIl[4]] = i;
                Item first3 = Inventory.getFirst(iArr7);
                String[] strArr3 = new String[lllllIIl[0]];
                strArr3[lllllIIl[4]] = llllIlll[lllllIIl[43]];
                if (llIIlllIlll(first3.hasAction(strArr3) ? 1 : 0)) {
                    int[] iArr8 = new int[lllllIIl[0]];
                    iArr8[lllllIIl[4]] = i;
                    Inventory.getFirst(iArr8).interact(llllIlll[lllllIIl[44]]);
                }
                if (llIIlllIllI(i, lllllIIl[45])) {
                    Time.sleepTicks(lllllIIl[5]);
                    "".length();
                    String[] strArr4 = new String[lllllIIl[0]];
                    strArr4[lllllIIl[4]] = llllIlll[lllllIIl[18]];
                    C0006g.a(strArr4);
                    Time.sleepTicks(lllllIIl[0]);
                    "".length();
                }
            }
        }
    }

    private static boolean llIIlllIlll(int i) {
        return i != 0;
    }

    public static void a(WorldPoint worldPoint) {
        if (llIIlllIlIl(C0013n.bY.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (llIIllllIll(Players.getLocal().getWorldLocation().distanceTo(C0013n.bU), lllllIIl[5])) {
                AccBuilderBarrows.c = llllIlll[lllllIIl[4]];
                Movement.walkTo(C0013n.bU);
                "".length();
                Time.sleepTicks(lllllIIl[0]);
                "".length();
            }
            if (llIIlllllII(Players.getLocal().getWorldLocation().distanceTo(C0013n.bU), lllllIIl[5])) {
                AccBuilderBarrows.c = llllIlll[lllllIIl[0]];
                if (llIIlllIlll(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                NPC nearest = NPCs.getNearest(npc -> {
                    String[] strArr = new String[lllllIIl[0]];
                    strArr[lllllIIl[4]] = llllIlll[lllllIIl[93]];
                    return npc.hasAction(strArr);
                });
                if (llIIllllIlI(nearest)) {
                    String[] strArr = new String[lllllIIl[0]];
                    strArr[lllllIIl[4]] = llllIlll[lllllIIl[6]];
                    if (llIIlllIlll(nearest.hasAction(strArr) ? 1 : 0)) {
                        nearest.interact(llllIlll[lllllIIl[5]]);
                        Time.sleepTicks(lllllIIl[5]);
                        "".length();
                    }
                    String[] strArr2 = new String[lllllIIl[0]];
                    strArr2[lllllIIl[4]] = llllIlll[lllllIIl[7]];
                    if (llIIlllIlIl(nearest.hasAction(strArr2) ? 1 : 0)) {
                        C0006g.b(llllIlll[lllllIIl[8]], C0013n.bX);
                        Time.sleepTicks(lllllIIl[0]);
                        "".length();
                    }
                }
                String[] strArr3 = new String[lllllIIl[0]];
                strArr3[lllllIIl[4]] = llllIlll[lllllIIl[9]];
                NPC nearest2 = NPCs.getNearest(strArr3);
                if (llIIllllIlI(nearest2)) {
                    String[] strArr4 = new String[lllllIIl[0]];
                    strArr4[lllllIIl[4]] = llllIlll[lllllIIl[10]];
                    if (llIIlllIlll(nearest2.hasAction(strArr4) ? 1 : 0)) {
                        nearest2.interact(llllIlll[lllllIIl[11]]);
                        Time.sleepTicks(lllllIIl[5]);
                        "".length();
                    }
                    String[] strArr5 = new String[lllllIIl[0]];
                    strArr5[lllllIIl[4]] = llllIlll[lllllIIl[12]];
                    if (llIIlllIlIl(nearest2.hasAction(strArr5) ? 1 : 0)) {
                        C0006g.b(llllIlll[lllllIIl[13]], C0013n.bX);
                        Time.sleepTicks(lllllIIl[0]);
                        "".length();
                    }
                }
            }
        }
        if (llIIlllIlll(C0013n.bY.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo(worldPoint);
            "".length();
            Time.sleepTicks(lllllIIl[0]);
            "".length();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v25, types: [boolean] */
    public static void z() {
        if (llIIlllIlll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (llIIlllIlll(y() ? 1 : 0)) {
            if (llIIlllIlIl(A() ? 1 : 0)) {
                B();
            }
            if (llIIlllIlll(A() ? 1 : 0)) {
                Widget widget = Widgets.get(lllllIIl[28], lllllIIl[29], lllllIIl[10]);
                if (llIIllllIlI(widget)) {
                    widget.interact(llllIlll[lllllIIl[30]]);
                    Time.sleepTicks(lllllIIl[0]);
                    "".length();
                }
                if (llIIlllIlIl(Vars.getBit(lllllIIl[31]))) {
                    Widget widget2 = Widgets.get(lllllIIl[28], lllllIIl[32], lllllIIl[24]);
                    if (llIIllllIlI(widget2)) {
                        if (llIIlllIlIl(widget2.isVisible() ? 1 : 0)) {
                            Widget widget3 = Widgets.get(lllllIIl[28], lllllIIl[33], lllllIIl[8]);
                            Mouse.click(widget3.getClickPoint().getX(), widget3.getClickPoint().getY(), (boolean) lllllIIl[0]);
                            Time.sleepTicks(lllllIIl[0]);
                            "".length();
                        }
                        if (llIIlllIlll(widget2.isVisible() ? 1 : 0)) {
                            widget2.interact(llllIlll[lllllIIl[32]]);
                            Time.sleepTicks(lllllIIl[0]);
                            "".length();
                        }
                    }
                }
                if (llIIlllIlIl(Vars.getBit(lllllIIl[34]))) {
                    Widget widget4 = Widgets.get(lllllIIl[28], lllllIIl[32], lllllIIl[35]);
                    if (llIIllllIlI(widget4)) {
                        if (llIIlllIlIl(widget4.isVisible() ? 1 : 0)) {
                            Widget widget5 = Widgets.get(lllllIIl[28], lllllIIl[33], lllllIIl[8]);
                            Mouse.click(widget5.getClickPoint().getX(), widget5.getClickPoint().getY(), (boolean) lllllIIl[0]);
                            Time.sleepTicks(lllllIIl[0]);
                            "".length();
                        }
                        if (llIIlllIlll(widget4.isVisible() ? 1 : 0)) {
                            widget4.interact(llllIlll[lllllIIl[33]]);
                            Time.sleepTicks(lllllIIl[6]);
                            "".length();
                        }
                    }
                }
            }
        }
        Widget widget6 = Widgets.get(lllllIIl[28], lllllIIl[7]);
        if (llIIllllIlI(widget6)) {
            widget6.interact(llllIlll[lllllIIl[36]]);
            Time.sleepTicks(lllllIIl[0]);
            "".length();
        }
    }

    public static void E() {
        if (llIIlllIllI(j(lllllIIl[66]), lllllIIl[0])) {
            if (llIIlllIlIl(Tabs.isOpen(Tab.COMBAT) ? 1 : 0)) {
                Tabs.open(Tab.COMBAT);
                Time.sleepTicks(lllllIIl[0]);
                "".length();
            }
            if (llIIlllIlll(Tabs.isOpen(Tab.COMBAT) ? 1 : 0)) {
                Widget widget = Widgets.get(lllllIIl[67], lllllIIl[57]);
                if (llIIllllIlI(widget)) {
                    widget.interact(llllIlll[lllllIIl[69]]);
                    Time.sleepTicks(lllllIIl[0]);
                    "".length();
                }
            }
        }
    }

    public static int c(int i, int lIIllIlIlIlIlIl) {
        int i2 = lIIllIlIlIlIlIl - i;
        if (llIIlllIlIl(i2)) {
            return i;
        }
        if (llIIlllIllI(Math.abs(i2), lllllIIl[0])) {
            if (llIIlllIlll(S.nextBoolean() ? 1 : 0)) {
                "".length();
                return (-" ".length()) >= "   ".length() ? ((36 ^ 96) ^ (129 ^ 143)) & (((((51 + 99) - (-63)) + 16) ^ (((20 + 62) - 69) + 162)) ^ (-" ".length())) : i;
            }
            return lIIllIlIlIlIlIl;
        }
        if (llIIllllIII(i2)) {
            i = lIIllIlIlIlIlIl;
            lIIllIlIlIlIlIl = i;
        }
        return i + S.nextInt((lIIllIlIlIlIlIl - i) + lllllIIl[0]);
    }

    public static void b(WorldPoint worldPoint) {
        WorldPoint worldPoint2 = new WorldPoint(lllllIIl[46], lllllIIl[47], lllllIIl[4]);
        WorldArea worldArea = new WorldArea(lllllIIl[48], lllllIIl[49], lllllIIl[12], lllllIIl[50], lllllIIl[4]);
        WorldArea worldArea2 = new WorldArea(lllllIIl[51], lllllIIl[52], lllllIIl[53], lllllIIl[54], lllllIIl[4]);
        if (llIIllllIll(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), lllllIIl[9]) && llIIlllIlIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIlllIlIl(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIllllIll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lllllIIl[55], lllllIIl[56], lllllIIl[0])), lllllIIl[33])) {
            AccBuilderBarrows.c = llllIlll[lllllIIl[57]];
            if (llIIlllIlll(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo(worldPoint2);
            "".length();
            Time.sleepTicks(lllllIIl[0]);
            "".length();
        }
        if (llIIlllllII(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), lllllIIl[9]) && llIIlllllII(Players.getLocal().getWorldLocation().getY(), lllllIIl[47])) {
            if (llIIlllIlIl(Dialog.isOpen() ? 1 : 0)) {
                String[] strArr = new String[lllllIIl[0]];
                strArr[lllllIIl[4]] = llllIlll[lllllIIl[58]];
                TileObjects.getNearest(strArr).interact(llllIlll[lllllIIl[38]]);
                Time.sleepTicks(lllllIIl[6]);
                "".length();
            }
            if (llIIlllIlll(Dialog.isOpen() ? 1 : 0)) {
                String[] strArr2 = new String[lllllIIl[0]];
                strArr2[lllllIIl[4]] = llllIlll[lllllIIl[59]];
                C0006g.a(strArr2);
            }
        }
        if (llIIllllIll(Players.getLocal().getWorldLocation().getY(), lllllIIl[47])) {
            if (llIIlllIlIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIlllIlIl(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && !llIIlllllII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lllllIIl[55], lllllIIl[56], lllllIIl[0])), lllllIIl[33])) {
                return;
            }
            AccBuilderBarrows.c = llllIlll[lllllIIl[60]];
            if (llIIlllIlll(Players.getLocal().getWorldLocation().equals(new WorldPoint(lllllIIl[46], lllllIIl[61], lllllIIl[4])) ? 1 : 0)) {
                c(new WorldPoint(lllllIIl[46], lllllIIl[62], lllllIIl[4]));
                Time.sleepTicks(lllllIIl[9]);
                "".length();
            }
            Movement.walkTo(worldPoint);
            "".length();
            Time.sleepTicks(lllllIIl[0]);
            "".length();
        }
    }
}
