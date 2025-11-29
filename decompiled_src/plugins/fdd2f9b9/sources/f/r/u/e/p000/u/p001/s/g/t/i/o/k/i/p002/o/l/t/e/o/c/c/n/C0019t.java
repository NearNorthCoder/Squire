package f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n;

import gg.squire.account.AccBuilderRogues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
/* renamed from: f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.t  reason: invalid package and case insensitive filesystem */
/* loaded from: fdd2f9b9-6584-4a70-afa7-d1946c214094.jar:f/r/u/e/-/u/-/s/g/t/i/o/k/i/-/o/l/t/e/o/c/c/n/t.class */
public class C0019t implements G {
    static /* synthetic */ boolean cI;
    private static /* synthetic */ WorldPoint cJ;
    static /* synthetic */ int ck;
    private static /* synthetic */ int[] lIIllllIII;
    private static /* synthetic */ WorldPoint cM;
    static /* synthetic */ boolean cl;
    private static /* synthetic */ WorldPoint cg;
    private static /* synthetic */ String[] lIIlllIllI;
    static /* synthetic */ String[] bR;
    private static /* synthetic */ int cO;
    public static /* synthetic */ boolean bt;
    private static /* synthetic */ WorldPoint cN;
    private static /* synthetic */ WorldPoint cL;
    public static /* synthetic */ List<C0003d> bv;
    static /* synthetic */ WorldArea cH;
    private static /* synthetic */ WorldPoint cK;

    private static boolean lIIIIlIlIllII(Object obj) {
        return obj != null;
    }

    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public String U() {
        return lIIlllIllI[lIIllllIII[63]];
    }

    private static void lIIIIlIlIIllI() {
        lIIlllIllI = new String[lIIllllIII[86]];
        lIIlllIllI[lIIllllIII[2]] = lIIIIlIlIIIII("aIOLhYrFO4EAG2LMHamCDv/2vdp84x99zoZEKKgT8gM7tgDlH3awTjJ8ZFAtdRfU", "KfoKH");
        lIIlllIllI[lIIllllIII[1]] = lIIIIlIlIIIIl("F0M0F5GAnGx094QnDvwsRw==", "SADZo");
        lIIlllIllI[lIIllllIII[3]] = lIIIIlIlIIIIl("EcOYwj841TgFuD9M4hHG0Q==", "OLkDd");
        lIIlllIllI[lIIllllIII[5]] = lIIIIlIlIIIII("3Is7aro2nS4FGsqz6CT7wAGxsBHjI78W", "zujPH");
        lIIlllIllI[lIIllllIII[6]] = lIIIIlIlIIIIl("+Qdn/nQ2kcCCCmLVpQb9lP3yJhOZEZr8q5SYDe0WQKmwkYGTOzZxe97N1s6PWWiRCJZN3h4QXM4=", "WPJiS");
        lIIlllIllI[lIIllllIII[13]] = lIIIIlIlIIIlI("DSsONCo=", "IYgZA");
        lIIlllIllI[lIIllllIII[15]] = lIIIIlIlIIIlI("PikzVBUfaDYAAAI8", "pHEta");
        lIIlllIllI[lIIllllIII[7]] = lIIIIlIlIIIIl("7poXwJRIXG9lgdwNdAc08w==", "DmBdp");
        lIIlllIllI[lIIllllIII[22]] = lIIIIlIlIIIlI("GCw8IBUn", "NIOTg");
        lIIlllIllI[lIIllllIII[23]] = lIIIIlIlIIIlI("KAcnOgYACXQmHQEePCs=", "nnTRo");
        lIIlllIllI[lIIllllIII[0]] = lIIIIlIlIIIIl("56ctU+rFHaivlKrgXIRoWw==", "TWNkY");
        lIIlllIllI[lIIllllIII[24]] = lIIIIlIlIIIIl("kDkRZfoQ+nJA/qqAX0q52w==", "ZoqwV");
        lIIlllIllI[lIIllllIII[21]] = lIIIIlIlIIIII("o3C1GRa7D7w=", "ktddo");
        lIIlllIllI[lIIllllIII[25]] = lIIIIlIlIIIlI("JCAqQzcfKytDNhk3Iw==", "vENcA");
        lIIlllIllI[lIIllllIII[26]] = lIIIIlIlIIIIl("kUtzIvOymv8=", "GgcOa");
        lIIlllIllI[lIIllllIII[27]] = lIIIIlIlIIIII("4+vv7pGpzZw=", "vmPnl");
        lIIlllIllI[lIIllllIII[28]] = lIIIIlIlIIIIl("HbnCFJASh30=", "uBMjK");
        lIIlllIllI[lIIllllIII[29]] = lIIIIlIlIIIIl("OOJbiiwe9M/82QUGvzbSow==", "XXlLE");
        lIIlllIllI[lIIllllIII[30]] = lIIIIlIlIIIII("L26A7wXH3NsM7siRe3hD7w==", "sondd");
        lIIlllIllI[lIIllllIII[31]] = lIIIIlIlIIIII("b/kuh1ZMRvg=", "nQRLN");
        lIIlllIllI[lIIllllIII[32]] = lIIIIlIlIIIII("JydXYWRifARNV8hAW+BIPA==", "xwPBE");
        lIIlllIllI[lIIllllIII[33]] = lIIIIlIlIIIlI("HBgDD3obEB8G", "KyocZ");
        lIIlllIllI[lIIllllIII[34]] = lIIIIlIlIIIlI("BBkBFFoDER0d", "Sxmxz");
        lIIlllIllI[lIIllllIII[35]] = lIIIIlIlIIIIl("Sixghu7t/tM=", "iYpDw");
        lIIlllIllI[lIIllllIII[36]] = lIIIIlIlIIIIl("4teePkyNAtBGlZYXsYM6eA==", "tLfZg");
        lIIlllIllI[lIIllllIII[37]] = lIIIIlIlIIIIl("iBuiJ+2pOTU=", "iiRcE");
        lIIlllIllI[lIIllllIII[38]] = lIIIIlIlIIIlI("IS4ZPRZSORchFhcpDA==", "rZxOb");
        lIIlllIllI[lIIllllIII[20]] = lIIIIlIlIIIII("2OStuQXtAKw=", "mFAgj");
        lIIlllIllI[lIIllllIII[39]] = lIIIIlIlIIIII("SHOSN+W5WjO/Re7Ymnlzwb7GDB5xgjI9Asn/wdo6MK6pC1OhXUYMXLOQgHWK+qjY", "qdmen");
        lIIlllIllI[lIIllllIII[40]] = lIIIIlIlIIIIl("WwQutRQ5hXU=", "EBAuz");
        lIIlllIllI[lIIllllIII[41]] = lIIIIlIlIIIII("bc9RhRYP2FDXwX5rekQ3AQ==", "QxqxZ");
        lIIlllIllI[lIIllllIII[42]] = lIIIIlIlIIIII("IcRHU8J8hoU=", "mrDRX");
        lIIlllIllI[lIIllllIII[44]] = lIIIIlIlIIIIl("3AwMIawZdRg=", "EoHNH");
        lIIlllIllI[lIIllllIII[45]] = lIIIIlIlIIIIl("h9GuY8uFdTVqU2DJ8TtTBA==", "BhQYc");
        lIIlllIllI[lIIllllIII[46]] = lIIIIlIlIIIIl("ofoQ1ZkCJbJeRXI/Pp6z3A==", "UDPBi");
        lIIlllIllI[lIIllllIII[47]] = lIIIIlIlIIIII("z8HSgu6Ek9s=", "xfHdQ");
        lIIlllIllI[lIIllllIII[48]] = lIIIIlIlIIIlI("CRE4MhMhH2suCCAIIyM=", "OxKZz");
        lIIlllIllI[lIIllllIII[49]] = lIIIIlIlIIIII("u1q9R/bie83fqJPLVF0mxg==", "IPGwN");
        lIIlllIllI[lIIllllIII[50]] = lIIIIlIlIIIIl("cQsqNWjx2VHdq8JIyOXcAw==", "mocJU");
        lIIlllIllI[lIIllllIII[51]] = lIIIIlIlIIIIl("nrdYTHoB4II=", "iEOHn");
        lIIlllIllI[lIIllllIII[52]] = lIIIIlIlIIIII("BV1fyZPL7GsvF3bhgv9IKynQ+vknUhQA", "DCVIs");
        lIIlllIllI[lIIllllIII[53]] = lIIIIlIlIIIII("JY5Jw6nOqZI=", "OpSls");
        lIIlllIllI[lIIllllIII[54]] = lIIIIlIlIIIlI("CzsuDTQ=", "XKOiQ");
        lIIlllIllI[lIIllllIII[55]] = lIIIIlIlIIIIl("0UJubfo2leXCjq7cjRDO0Q==", "kHCcm");
        lIIlllIllI[lIIllllIII[56]] = lIIIIlIlIIIIl("GGBAh17lY+Ip5F61qIusMQ==", "WMtBZ");
        lIIlllIllI[lIIllllIII[63]] = lIIIIlIlIIIII("fp/u244htvOpL+6nGUnQww==", "XlPEY");
        lIIlllIllI[lIIllllIII[64]] = lIIIIlIlIIIII("DY/SO928VzPlf44lPPOPOSLQpYOen7kV", "gPoyL");
        lIIlllIllI[lIIllllIII[67]] = lIIIIlIlIIIlI("AVABBSZoBxkKMS0CHwoyaAceBSFoBxcXdSwfAQp1PBgZFzBoAwIFPDoDSQ==", "HpvdU");
        lIIlllIllI[lIIllllIII[68]] = lIIIIlIlIIIlI("BSUsRgc9OWo=", "RMUfi");
        lIIlllIllI[lIIllllIII[69]] = lIIIIlIlIIIII("AQIEDHqHOdgaYs1VkbMo/mL5+pHWuXmyOIcfb2TTB+xFbEQYUjAS54O+ji8fZ0mG", "GElVd");
        lIIlllIllI[lIIllllIII[19]] = lIIIIlIlIIIIl("g2IlWKP51BBVkzG962vo9tPJDEBIbGr9", "pFODu");
        lIIlllIllI[lIIllllIII[70]] = lIIIIlIlIIIII("gURwT+tZi7ZK7evPV0VAouREBNSfGLet9egYGvf/IeY=", "uKanc");
        lIIlllIllI[lIIllllIII[71]] = lIIIIlIlIIIII("usML7wF/iVLjvZW8hsotqEK5QGYAgzlwS7MKSJ5hmp075awgVg4zsw==", "SUTIO");
        lIIlllIllI[lIIllllIII[72]] = lIIIIlIlIIIIl("ZrG5Jgmo+KbOry+iELKF3c2iHQ7qeiw4aEdcDSUkdZlOMUIIv2P2MThRNmdG/Zw5", "kvvJp");
        lIIlllIllI[lIIllllIII[73]] = lIIIIlIlIIIIl("dYf47E9JKgs=", "YQgbH");
    }

    private static boolean lIIIIlIlIllll(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIIIIlIllIIII(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public boolean V() {
        if (lIIIIlIlIlIIl(C0004e.j(cO), lIIllllIII[13])) {
            ?? r0 = lIIllllIII[1];
            "".length();
            return (true ^ true) != (true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIllllIII[2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean ab() {
        int[] iArr = new int[lIIllllIII[1]];
        iArr[lIIllllIII[2]] = lIIllllIII[8];
        if (lIIIIlIlIllIl(Inventory.getCount(iArr))) {
            String[] strArr = new String[lIIllllIII[1]];
            strArr[lIIllllIII[2]] = lIIlllIllI[lIIllllIII[52]];
            if (lIIIIlIlIllIl(Inventory.getCount(strArr))) {
                String[] strArr2 = new String[lIIllllIII[1]];
                strArr2[lIIllllIII[2]] = lIIlllIllI[lIIllllIII[53]];
                if (lIIIIlIlIllIl(Inventory.getCount(strArr2))) {
                    String[] strArr3 = new String[lIIllllIII[1]];
                    strArr3[lIIllllIII[2]] = lIIlllIllI[lIIllllIII[54]];
                    if (lIIIIlIlIllIl(Inventory.getCount(strArr3))) {
                        String[] strArr4 = new String[lIIllllIII[1]];
                        strArr4[lIIllllIII[2]] = lIIlllIllI[lIIllllIII[55]];
                        if (lIIIIlIlIllIl(Inventory.getCount(strArr4))) {
                            String[] strArr5 = new String[lIIllllIII[1]];
                            strArr5[lIIllllIII[2]] = lIIlllIllI[lIIllllIII[56]];
                            if (lIIIIlIlIllIl(Inventory.getCount(strArr5))) {
                                int[] iArr2 = new int[lIIllllIII[1]];
                                iArr2[lIIllllIII[2]] = lIIllllIII[17];
                                if (lIIIIlIlIllIl(Inventory.getCount(iArr2)) && lIIIIlIlIlIlI(Inventory.contains(C0005f.aV) ? 1 : 0)) {
                                    ?? r0 = lIIllllIII[1];
                                    "".length();
                                    return (39 ^ 35) <= ((9 ^ 86) & ((78 ^ 17) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                            }
                        }
                    }
                }
            }
        }
        return lIIllllIII[2];
    }

    private static void lIIIIlIlIIlll() {
        lIIllllIII = new int[87];
        lIIllllIII[0] = (((14 + 121) - 53) + 106) ^ (((164 + 141) - 218) + 95);
        lIIllllIII[1] = " ".length();
        lIIllllIII[2] = (18 ^ 76) & ((153 ^ 199) ^ (-1));
        lIIllllIII[3] = "  ".length();
        lIIllllIII[4] = (-((-804) & 26423)) & (-97) & 30715;
        lIIllllIII[5] = "   ".length();
        lIIllllIII[6] = 132 ^ 128;
        lIIllllIII[7] = (((9 + 161) - 54) + 52) ^ (((134 + 128) - 159) + 72);
        lIIllllIII[8] = (-((-19269) & 27629)) & (-16401) & 32767;
        lIIllllIII[9] = (-((-6429) & 23839)) & (-4166) & 22527;
        lIIllllIII[10] = (-((-2305) & 32653)) & (-2113) & 32767;
        lIIllllIII[11] = (-20673) & 20985;
        lIIllllIII[12] = (-465) & 2014;
        lIIllllIII[13] = 150 ^ 147;
        lIIllllIII[14] = (-16389) & 24398;
        lIIllllIII[15] = 137 ^ 143;
        lIIllllIII[16] = (-3595) & 16219;
        lIIllllIII[17] = (-21505) & 22499;
        lIIllllIII[18] = (-22534) & 23533;
        lIIllllIII[19] = 145 ^ 163;
        lIIllllIII[20] = (47 ^ 32) ^ (26 ^ 14);
        lIIllllIII[21] = 176 ^ 188;
        lIIllllIII[22] = 116 ^ 124;
        lIIllllIII[23] = 136 ^ 129;
        lIIllllIII[24] = 134 ^ 141;
        lIIllllIII[25] = 54 ^ 59;
        lIIllllIII[26] = 184 ^ 182;
        lIIllllIII[27] = 15 ^ 0;
        lIIllllIII[28] = (4 ^ 31) ^ (15 ^ 4);
        lIIllllIII[29] = 176 ^ 161;
        lIIllllIII[30] = 87 ^ 69;
        lIIllllIII[31] = (16 ^ 78) ^ (243 ^ 190);
        lIIllllIII[32] = 56 ^ 44;
        lIIllllIII[33] = 163 ^ 182;
        lIIllllIII[34] = (124 ^ 51) ^ (213 ^ 140);
        lIIllllIII[35] = 27 ^ 12;
        lIIllllIII[36] = 26 ^ 2;
        lIIllllIII[37] = 188 ^ 165;
        lIIllllIII[38] = (((44 + 109) - 137) + 168) ^ (((33 + 102) - 27) + 54);
        lIIllllIII[39] = (206 ^ 157) ^ (210 ^ 157);
        lIIllllIII[40] = 53 ^ 40;
        lIIllllIII[41] = 4 ^ 26;
        lIIllllIII[42] = 20 ^ 11;
        lIIllllIII[43] = (-"   ".length()) & (-20481) & 24562;
        lIIllllIII[44] = (123 ^ 21) ^ (225 ^ 175);
        lIIllllIII[45] = 121 ^ 88;
        lIIllllIII[46] = 65 ^ 99;
        lIIllllIII[47] = (((52 + 39) - (-2)) + 78) ^ (((92 + 61) - 59) + 42);
        lIIllllIII[48] = (((136 + 0) - 91) + 108) ^ (((61 + 183) - 70) + 15);
        lIIllllIII[49] = (214 ^ 160) ^ (201 ^ 154);
        lIIllllIII[50] = (((2 + 26) - (-26)) + 81) ^ (((101 + 23) - (-8)) + 29);
        lIIllllIII[51] = 175 ^ 136;
        lIIllllIII[52] = 130 ^ 170;
        lIIllllIII[53] = 15 ^ 38;
        lIIllllIII[54] = (222 ^ 131) ^ (208 ^ 167);
        lIIllllIII[55] = (((107 + 31) - 56) + 108) ^ (((118 + 95) - 95) + 31);
        lIIllllIII[56] = (47 ^ 82) ^ (115 ^ 34);
        lIIllllIII[57] = (-20484) & 29483;
        lIIllllIII[58] = (-((-1093) & 15942)) & (-1033) & 16381;
        lIIllllIII[59] = (-((-8869) & 29622)) & (-33) & 32765;
        lIIllllIII[60] = (-((-24585) & 28254)) & (-1) & 28669;
        lIIllllIII[61] = (-((-8353) & 28923)) & (-10274) & 31743;
        lIIllllIII[62] = (36 ^ 90) ^ (175 ^ 181);
        lIIllllIII[63] = 233 ^ 196;
        lIIllllIII[64] = (((92 + 145) - 224) + 152) ^ (((107 + 8) - 54) + 78);
        lIIllllIII[65] = (-21910) & 24541;
        lIIllllIII[66] = (-((-1222) & 18135)) & (-8321) & 28667;
        lIIllllIII[67] = (44 ^ 79) ^ (95 ^ 19);
        lIIllllIII[68] = (204 ^ 187) ^ (96 ^ 39);
        lIIllllIII[69] = (3 ^ 36) ^ (37 ^ 51);
        lIIllllIII[70] = (84 ^ 79) ^ (20 ^ 60);
        lIIllllIII[71] = (7 ^ 113) ^ (126 ^ 60);
        lIIllllIII[72] = 100 ^ 81;
        lIIllllIII[73] = 137 ^ 191;
        lIIllllIII[74] = (-1041) & 3859;
        lIIllllIII[75] = (-((-7321) & 32477)) & (-4108) & 32751;
        lIIllllIII[76] = (-((-1123) & 29939)) & (-1025) & 32499;
        lIIllllIII[77] = (-((-793) & 25433)) & (-4612) & 32751;
        lIIllllIII[78] = (-((-11) & 13499)) & (-16649) & 32767;
        lIIllllIII[79] = (-16905) & 20398;
        lIIllllIII[80] = (-((-2769) & 32761)) & (-129) & 32764;
        lIIllllIII[81] = (-((-5289) & 30381)) & (-4097) & 32630;
        lIIllllIII[82] = (-((-24685) & 29934)) & (-257) & 8143;
        lIIllllIII[83] = (-((-19573) & 32503)) & (-9) & 16383;
        lIIllllIII[84] = (-((-3747) & 12203)) & (-129) & 11225;
        lIIllllIII[85] = (-((-7171) & 16019)) & (-1) & 12287;
        lIIllllIII[86] = 64 ^ 119;
    }

    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public int T() {
        try {
            aK();
            "".length();
            if ((-" ".length()) == (57 ^ 61)) {
                return (208 ^ 198) & ((142 ^ 152) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lIIllllIII[62];
    }

    private static String lIIIIlIlIIIII(String lllllllllllllllllllllIIIIIllIllI, String lllllllllllllllllllllIIIIIllIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllllIIIIIllIlIl.getBytes(StandardCharsets.UTF_8)), lIIllllIII[22]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIllllIII[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllllllIIIIIllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllllIIIIIllIlll) {
            lllllllllllllllllllllIIIIIllIlll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIlIlIlIlI(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public boolean S() {
        return lIIllllIII[2];
    }

    private static String lIIIIlIlIIIlI(String lllllllllllllllllllllIIIIlIllIII, String lllllllllllllllllllllIIIIlIlIlll) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllllllllIIIIlIllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllllllllIIIIlIlIlll.toCharArray();
        int lllllllllllllllllllllIIIIlIlIlII = lIIllllIII[2];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIIllllIII[2];
        while (lIIIIlIlIlIII(i, length)) {
            char lllllllllllllllllllllIIIIlIIlIll = charArray2[i];
            sb.append((char) (lllllllllllllllllllllIIIIlIIlIll ^ charArray[lllllllllllllllllllllIIIIlIlIlII % charArray.length]));
            "".length();
            lllllllllllllllllllllIIIIlIlIlII++;
            i++;
            "".length();
            if ("  ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIIIIlIlIlIll(int i) {
        return i == 0;
    }

    private static void af() {
        int[] iArr = new int[lIIllllIII[1]];
        iArr[lIIllllIII[2]] = lIIllllIII[12];
        if (lIIIIlIlIlIll(Bank.contains(iArr) ? 1 : 0)) {
            bv.add(new C0003d(lIIllllIII[12], lIIllllIII[1], lIIllllIII[57]));
            "".length();
        }
        int[] iArr2 = new int[lIIllllIII[1]];
        iArr2[lIIllllIII[2]] = lIIllllIII[10];
        if (lIIIIlIlIlIll(Bank.contains(iArr2) ? 1 : 0)) {
            bv.add(new C0003d(lIIllllIII[10], lIIllllIII[1], lIIllllIII[4]));
            "".length();
        }
        int[] iArr3 = new int[lIIllllIII[1]];
        iArr3[lIIllllIII[2]] = lIIllllIII[9];
        if (lIIIIlIlIlIll(Bank.contains(iArr3) ? 1 : 0)) {
            bv.add(new C0003d(lIIllllIII[9], lIIllllIII[1], lIIllllIII[4]));
            "".length();
        }
        int[] iArr4 = new int[lIIllllIII[1]];
        iArr4[lIIllllIII[2]] = lIIllllIII[14];
        if (lIIIIlIlIlIll(Bank.contains(iArr4) ? 1 : 0)) {
            bv.add(new C0003d(lIIllllIII[14], lIIllllIII[24], lIIllllIII[4]));
            "".length();
        }
        int[] iArr5 = new int[lIIllllIII[1]];
        iArr5[lIIllllIII[2]] = lIIllllIII[16];
        if (lIIIIlIlIlIll(Bank.contains(iArr5) ? 1 : 0)) {
            bv.add(new C0003d(lIIllllIII[16], lIIllllIII[24], C0008i.bq));
            "".length();
        }
        int[] iArr6 = new int[lIIllllIII[1]];
        iArr6[lIIllllIII[2]] = lIIllllIII[11];
        if (lIIIIlIlIlIll(Bank.contains(iArr6) ? 1 : 0)) {
            bv.add(new C0003d(lIIllllIII[11], lIIllllIII[0], lIIllllIII[58]));
            "".length();
        }
        if (lIIIIlIlIlIll(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIIlllIllI[lIIllllIII[64]]);
        }) ? 1 : 0)) {
            bv.add(new C0003d(lIIllllIII[59], lIIllllIII[13], lIIllllIII[60]));
            "".length();
        }
        int[] iArr7 = new int[lIIllllIII[1]];
        iArr7[lIIllllIII[2]] = lIIllllIII[8];
        if (lIIIIlIlIlIll(Bank.contains(iArr7) ? 1 : 0)) {
            bv.add(new C0003d(lIIllllIII[8], lIIllllIII[52], lIIllllIII[61]));
            "".length();
        }
    }

    static {
        lIIIIlIlIIlll();
        lIIIIlIlIIllI();
        bv = new ArrayList();
        cH = new WorldArea(lIIllllIII[65], lIIllllIII[66], lIIllllIII[24], lIIllllIII[25], lIIllllIII[2]);
        String[] strArr = new String[lIIllllIII[22]];
        strArr[lIIllllIII[2]] = lIIlllIllI[lIIllllIII[67]];
        strArr[lIIllllIII[1]] = lIIlllIllI[lIIllllIII[68]];
        strArr[lIIllllIII[3]] = lIIlllIllI[lIIllllIII[69]];
        strArr[lIIllllIII[5]] = lIIlllIllI[lIIllllIII[19]];
        strArr[lIIllllIII[6]] = lIIlllIllI[lIIllllIII[70]];
        strArr[lIIllllIII[13]] = lIIlllIllI[lIIllllIII[71]];
        strArr[lIIllllIII[15]] = lIIlllIllI[lIIllllIII[72]];
        strArr[lIIllllIII[7]] = lIIlllIllI[lIIllllIII[73]];
        bR = strArr;
        cg = new WorldPoint(lIIllllIII[74], lIIllllIII[75], lIIllllIII[2]);
        cJ = new WorldPoint(lIIllllIII[76], lIIllllIII[77], lIIllllIII[2]);
        cK = new WorldPoint(lIIllllIII[78], lIIllllIII[79], lIIllllIII[2]);
        cL = new WorldPoint(lIIllllIII[80], lIIllllIII[81], lIIllllIII[2]);
        cM = new WorldPoint(lIIllllIII[82], lIIllllIII[83], lIIllllIII[2]);
        cN = new WorldPoint(lIIllllIII[84], lIIllllIII[85], lIIllllIII[2]);
        cO = lIIllllIII[24];
    }

    private static String lIIIIlIlIIIIl(String lllllllllllllllllllllIIIIlIIIIll, String lllllllllllllllllllllIIIIlIIIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllllIIIIlIIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllllllIIIIlIIIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllllllllllIIIIlIIIlIl.init(lIIllllIII[3], secretKeySpec);
            return new String(lllllllllllllllllllllIIIIlIIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllllllllIIIIlIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllllIIIIlIIIlII) {
            lllllllllllllllllllllIIIIlIIIlII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIlIlIlIII(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIIIlIlIllIl(int i) {
        return i > 0;
    }

    private static boolean lIIIIlIlIlIIl(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v134, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v294, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v316, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    public static void aK() {
        if (lIIIIlIlIlIII(Skills.getLevel(Skill.FISHING), lIIllllIII[0])) {
            R.dg();
        }
        if (lIIIIlIlIlIIl(Skills.getLevel(Skill.FISHING), lIIllllIII[0])) {
            if (lIIIIlIlIlIlI(bt ? 1 : 0)) {
                C0001b.a(bv);
                if (lIIIIlIlIlIII(bv.size(), lIIllllIII[1])) {
                    System.out.println(lIIlllIllI[lIIllllIII[2]]);
                    bt = lIIllllIII[2];
                }
            }
            if (lIIIIlIlIlIll(bt ? 1 : 0)) {
                if (lIIIIlIlIlIll(ab() ? 1 : 0) && lIIIIlIlIlIII(C0004e.j(cO), lIIllllIII[1])) {
                    String[] strArr = new String[lIIllllIII[1]];
                    strArr[lIIllllIII[2]] = lIIlllIllI[lIIllllIII[1]];
                    if (lIIIIlIlIlIll(Inventory.contains(strArr) ? 1 : 0)) {
                        BankLocation nearest = BankLocation.getNearest();
                        if (lIIIIlIlIllII(nearest) && lIIIIlIlIlIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderRogues.c = lIIlllIllI[lIIllllIII[3]];
                            C0000a.a(nearest);
                        }
                        if (lIIIIlIlIllII(nearest) && lIIIIlIlIlIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            if (lIIIIlIlIlIll(Bank.isOpen() ? 1 : 0)) {
                                C0000a.a();
                                Time.sleepUntil(() -> {
                                    return Bank.isOpen();
                                }, lIIllllIII[4]);
                                "".length();
                            }
                            if (lIIIIlIlIlIlI(Bank.isOpen() ? 1 : 0)) {
                                AccBuilderRogues.c = lIIlllIllI[lIIllllIII[5]];
                                if (lIIIIlIlIllIl(Inventory.getAll().size())) {
                                    Bank.depositInventory();
                                    Time.sleepTicks(lIIllllIII[6]);
                                    "".length();
                                }
                                if (lIIIIlIlIllIl(Equipment.getAll().size())) {
                                    Bank.depositEquipment();
                                    Time.sleepTicks(lIIllllIII[3]);
                                    "".length();
                                }
                                int[] iArr = new int[lIIllllIII[7]];
                                iArr[lIIllllIII[2]] = lIIllllIII[8];
                                iArr[lIIllllIII[1]] = lIIllllIII[9];
                                iArr[lIIllllIII[3]] = lIIllllIII[10];
                                iArr[lIIllllIII[5]] = lIIllllIII[11];
                                iArr[lIIllllIII[6]] = lIIllllIII[12];
                                iArr[lIIllllIII[13]] = lIIllllIII[14];
                                iArr[lIIllllIII[15]] = lIIllllIII[16];
                                if (lIIIIlIlIlIll(C0004e.b(iArr) ? 1 : 0)) {
                                    af();
                                    System.out.println(lIIlllIllI[lIIllllIII[6]]);
                                    bt = lIIllllIII[1];
                                    return;
                                }
                                int[] iArr2 = new int[lIIllllIII[15]];
                                iArr2[lIIllllIII[2]] = lIIllllIII[8];
                                iArr2[lIIllllIII[1]] = lIIllllIII[9];
                                iArr2[lIIllllIII[3]] = lIIllllIII[10];
                                iArr2[lIIllllIII[5]] = lIIllllIII[11];
                                iArr2[lIIllllIII[6]] = lIIllllIII[12];
                                iArr2[lIIllllIII[13]] = lIIllllIII[14];
                                if (lIIIIlIlIlIlI(C0004e.b(iArr2) ? 1 : 0)) {
                                    C0000a.a(lIIllllIII[8], lIIllllIII[0]);
                                    C0000a.a(lIIllllIII[14], lIIllllIII[0]);
                                    C0000a.a(lIIllllIII[9], lIIllllIII[1]);
                                    C0000a.a(lIIllllIII[10], lIIllllIII[1]);
                                    C0000a.a(lIIllllIII[11], lIIllllIII[0]);
                                    C0000a.a(lIIllllIII[12], lIIllllIII[1]);
                                    C0000a.a(lIIllllIII[16], lIIllllIII[5]);
                                    C0000a.a(lIIllllIII[17], lIIllllIII[18]);
                                }
                            }
                        }
                    }
                }
                if (lIIIIlIlIlIlI(Inventory.contains(C0005f.aV) ? 1 : 0) && lIIIIlIlIlIII(Movement.getRunEnergy(), lIIllllIII[19])) {
                    Inventory.getFirst(C0005f.aV).interact(lIIlllIllI[lIIllllIII[13]]);
                    Time.sleepTicks(lIIllllIII[1]);
                    "".length();
                }
                if (lIIIIlIlIlIlI(ab() ? 1 : 0) && lIIIIlIlIlIII(C0004e.j(cO), lIIllllIII[1])) {
                    int[] iArr3 = new int[lIIllllIII[1]];
                    iArr3[lIIllllIII[2]] = lIIllllIII[20];
                    if (lIIIIlIlIlIll(Inventory.contains(iArr3) ? 1 : 0)) {
                        if (lIIIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(cg), lIIllllIII[0])) {
                            AccBuilderRogues.c = lIIlllIllI[lIIllllIII[15]];
                            if (lIIIIlIlIlIlI(Dialog.isOpen() ? 1 : 0)) {
                                Dialog.close();
                            }
                            Movement.walkTo(cg);
                            "".length();
                            Time.sleepTicks(lIIllllIII[1]);
                            "".length();
                        }
                        if (lIIIIlIlIllll(Players.getLocal().getWorldLocation().distanceTo(cg), lIIllllIII[21])) {
                            AccBuilderRogues.c = lIIlllIllI[lIIllllIII[7]];
                            C0006g.a(lIIlllIllI[lIIllllIII[22]], bR);
                        }
                    }
                }
                if (lIIIIlIllIIII(C0004e.j(cO), lIIllllIII[1])) {
                    int[] iArr4 = new int[lIIllllIII[1]];
                    iArr4[lIIllllIII[2]] = lIIllllIII[20];
                    if (lIIIIlIlIlIlI(Inventory.contains(iArr4) ? 1 : 0)) {
                        String[] strArr2 = new String[lIIllllIII[1]];
                        strArr2[lIIllllIII[2]] = lIIlllIllI[lIIllllIII[23]];
                        if (lIIIIlIlIlIll(Inventory.contains(strArr2) ? 1 : 0)) {
                            ck = lIIllllIII[2];
                            String[] strArr3 = new String[lIIllllIII[1]];
                            strArr3[lIIllllIII[2]] = lIIlllIllI[lIIllllIII[0]];
                            if (lIIIIlIlIlIll(Inventory.contains(strArr3) ? 1 : 0)) {
                                if (lIIIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(cK), lIIllllIII[6])) {
                                    AccBuilderRogues.c = lIIlllIllI[lIIllllIII[24]];
                                    Movement.walkTo(cK);
                                    "".length();
                                }
                                if (lIIIIlIlIllll(Players.getLocal().getWorldLocation().distanceTo(cK), lIIllllIII[6])) {
                                    AccBuilderRogues.c = lIIlllIllI[lIIllllIII[21]];
                                    String[] strArr4 = new String[lIIllllIII[1]];
                                    strArr4[lIIllllIII[2]] = lIIlllIllI[lIIllllIII[25]];
                                    if (lIIIIlIlIlIll(Inventory.contains(strArr4) ? 1 : 0)) {
                                        String[] strArr5 = new String[lIIllllIII[1]];
                                        strArr5[lIIllllIII[2]] = lIIlllIllI[lIIllllIII[26]];
                                        if (lIIIIlIlIllII(TileObjects.getNearest(strArr5))) {
                                            String[] strArr6 = new String[lIIllllIII[1]];
                                            strArr6[lIIllllIII[2]] = lIIlllIllI[lIIllllIII[27]];
                                            TileObjects.getNearest(strArr6).interact(lIIlllIllI[lIIllllIII[28]]);
                                            Time.sleepTicks(lIIllllIII[3]);
                                            "".length();
                                        }
                                    }
                                }
                            }
                            String[] strArr7 = new String[lIIllllIII[1]];
                            strArr7[lIIllllIII[2]] = lIIlllIllI[lIIllllIII[29]];
                            if (lIIIIlIlIlIlI(Inventory.contains(strArr7) ? 1 : 0)) {
                                if (lIIIIlIlIlIll(cH.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderRogues.c = lIIlllIllI[lIIllllIII[30]];
                                    if (lIIIIlIlIlIll(Dialog.isOpen() ? 1 : 0)) {
                                        Movement.walkTo(cN);
                                        "".length();
                                        Time.sleepTicks(lIIllllIII[1]);
                                        "".length();
                                    }
                                    C0006g.a(bR);
                                }
                                if (lIIIIlIlIlIlI(cH.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    String[] strArr8 = new String[lIIllllIII[1]];
                                    strArr8[lIIllllIII[2]] = lIIlllIllI[lIIllllIII[31]];
                                    if (lIIIIlIlIlIlI(Inventory.contains(strArr8) ? 1 : 0)) {
                                        AccBuilderRogues.c = lIIlllIllI[lIIllllIII[32]];
                                        WorldPoint worldLocation = Players.getLocal().getWorldLocation();
                                        String[] strArr9 = new String[lIIllllIII[1]];
                                        strArr9[lIIllllIII[2]] = lIIlllIllI[lIIllllIII[33]];
                                        if (lIIIIlIlIlllI(worldLocation.distanceTo(TileObjects.getNearest(strArr9).getWorldLocation()), lIIllllIII[3])) {
                                            String[] strArr10 = new String[lIIllllIII[1]];
                                            strArr10[lIIllllIII[2]] = lIIlllIllI[lIIllllIII[34]];
                                            Movement.walkTo(TileObjects.getNearest(strArr10).getWorldLocation());
                                            "".length();
                                            Time.sleepTicks(lIIllllIII[6]);
                                            "".length();
                                        }
                                        if (lIIIIlIlIlIll(Dialog.isOpen() ? 1 : 0)) {
                                            String[] strArr11 = new String[lIIllllIII[1]];
                                            strArr11[lIIllllIII[2]] = lIIlllIllI[lIIllllIII[35]];
                                            Item first = Inventory.getFirst(strArr11);
                                            String[] strArr12 = new String[lIIllllIII[1]];
                                            strArr12[lIIllllIII[2]] = lIIlllIllI[lIIllllIII[36]];
                                            first.useOn(TileObjects.getNearest(strArr12));
                                            Time.sleepTicks(lIIllllIII[3]);
                                            "".length();
                                        }
                                        C0006g.a(bR);
                                    }
                                    String[] strArr13 = new String[lIIllllIII[1]];
                                    strArr13[lIIllllIII[2]] = lIIlllIllI[lIIllllIII[37]];
                                    if (lIIIIlIlIlIll(Inventory.contains(strArr13) ? 1 : 0) && lIIIIlIlIlIll(cI ? 1 : 0)) {
                                        AccBuilderRogues.c = lIIlllIllI[lIIllllIII[38]];
                                        C0006g.a(lIIlllIllI[lIIllllIII[20]], bR);
                                        if (lIIIIlIlIlIlI(Dialog.getText().contains(lIIlllIllI[lIIllllIII[39]]) ? 1 : 0)) {
                                            cI = lIIllllIII[1];
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (lIIIIlIllIIII(C0004e.j(cO), lIIllllIII[5])) {
                    String[] strArr14 = new String[lIIllllIII[1]];
                    strArr14[lIIllllIII[2]] = lIIlllIllI[lIIllllIII[40]];
                    if (lIIIIlIlIlIll(Inventory.contains(strArr14) ? 1 : 0)) {
                        String[] strArr15 = new String[lIIllllIII[1]];
                        strArr15[lIIllllIII[2]] = lIIlllIllI[lIIllllIII[41]];
                        if (lIIIIlIlIlIll(Inventory.contains(strArr15) ? 1 : 0)) {
                            AccBuilderRogues.c = lIIlllIllI[lIIllllIII[42]];
                            int[] iArr5 = new int[lIIllllIII[1]];
                            iArr5[lIIllllIII[2]] = lIIllllIII[43];
                            NPCs.getNearest(iArr5).interact(lIIlllIllI[lIIllllIII[44]]);
                            Time.sleepTicks(lIIllllIII[13]);
                            "".length();
                        }
                    }
                    String[] strArr16 = new String[lIIllllIII[1]];
                    strArr16[lIIllllIII[2]] = lIIlllIllI[lIIllllIII[45]];
                    if (lIIIIlIlIlIlI(Inventory.contains(strArr16) ? 1 : 0)) {
                        AccBuilderRogues.c = lIIlllIllI[lIIllllIII[46]];
                        C0006g.a(lIIlllIllI[lIIllllIII[47]], bR);
                    }
                }
                String[] strArr17 = new String[lIIllllIII[1]];
                strArr17[lIIllllIII[2]] = lIIlllIllI[lIIllllIII[48]];
                if (lIIIIlIlIlIlI(Inventory.contains(strArr17) ? 1 : 0)) {
                    if (lIIIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(cg), lIIllllIII[13])) {
                        AccBuilderRogues.c = lIIlllIllI[lIIllllIII[49]];
                        Movement.walkTo(cg);
                        "".length();
                        Time.sleepTicks(lIIllllIII[1]);
                        "".length();
                    }
                    if (lIIIIlIlIllll(Players.getLocal().getWorldLocation().distanceTo(cg), lIIllllIII[13])) {
                        AccBuilderRogues.c = lIIlllIllI[lIIllllIII[50]];
                        if (lIIIIlIlIlIII(ck, lIIllllIII[1])) {
                            U.jU += lIIllllIII[1];
                            U.o(AccBuilderRogues.m);
                            ck += lIIllllIII[1];
                            U.jU = lIIllllIII[2];
                            cl = lIIllllIII[2];
                        }
                        C0006g.a(lIIlllIllI[lIIllllIII[51]], bR);
                    }
                }
            }
        }
    }

    private static boolean lIIIIlIlIlllI(int i, int i2) {
        return i > i2;
    }
}
