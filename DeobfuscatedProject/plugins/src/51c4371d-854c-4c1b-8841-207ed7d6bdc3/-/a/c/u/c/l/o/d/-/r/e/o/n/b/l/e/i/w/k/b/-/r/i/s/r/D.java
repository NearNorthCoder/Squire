/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 */
package -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r;

import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.F;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.Q;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.a;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.b;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.d;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.e;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.f;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.g;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.i;
import gg.squire.account.AccBuilderBarrows;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;

public class D
implements F {
    public static /* synthetic */ List<d> bB;
    private static final /* synthetic */ WorldPoint il;
    private static final /* synthetic */ WorldPoint ij;
    private static final /* synthetic */ WorldPoint im;
    private static /* synthetic */ int[] lllIlIlI;
    private static /* synthetic */ String[] lllIIlIl;
    static /* synthetic */ int bZ;
    private static final /* synthetic */ WorldPoint ik;
    static /* synthetic */ boolean cj;
    public static final /* synthetic */ String[] ii;
    public static /* synthetic */ boolean bz;
    static /* synthetic */ int ci;

    private static void llIIIIIlIll() {
        lllIlIlI = new int[75];
        D.lllIlIlI[0] = (144 + 57 - 82 + 41 ^ 30 + 8 - -81 + 72) & (0x61 ^ 0x1F ^ (0x37 ^ 0x56) ^ -" ".length());
        D.lllIlIlI[1] = " ".length();
        D.lllIlIlI[2] = 0x85 ^ 0xC3;
        D.lllIlIlI[3] = "  ".length();
        D.lllIlIlI[4] = -(0xFFFFCEB3 & 0x7DCD) & (0xFFFFDFFF & 0x6DFB);
        D.lllIlIlI[5] = "   ".length();
        D.lllIlIlI[6] = 0x23 ^ 0x48;
        D.lllIlIlI[7] = 0x5A ^ 0x5E;
        D.lllIlIlI[8] = 0x22 ^ 0x6D ^ (0x53 ^ 0x19);
        D.lllIlIlI[9] = 0xFFFFF79B & 0x1BEC;
        D.lllIlIlI[10] = 0xFFFFAECF & 0x7FFA;
        D.lllIlIlI[11] = -(0x66 ^ 0x45) & (0xFFFFFFFE & 0x1F6B);
        D.lllIlIlI[12] = 0xFFFFF3DF & 0x3D71;
        D.lllIlIlI[13] = -(0xFFFFF9BB & 0x66F5) & (0xFFFFFFF7 & Short.MAX_VALUE);
        D.lllIlIlI[14] = 0xAF ^ 0xA9;
        D.lllIlIlI[15] = 0x4F ^ 0x45;
        D.lllIlIlI[16] = 0xFFFF8DBC & 0x7EEB;
        D.lllIlIlI[17] = -(0xFFFFD67B & 0x3BFE) & (0xFFFFDEFF & 0x3FFD);
        D.lllIlIlI[18] = 0x7F ^ 0x77;
        D.lllIlIlI[19] = 0x7A ^ 0x41 ^ (0xB3 ^ 0x83);
        D.lllIlIlI[20] = 0xBB ^ 0x98 ^ (0x8F ^ 0xAB);
        D.lllIlIlI[21] = 9 ^ 0;
        D.lllIlIlI[22] = 0x55 ^ 0x6D ^ (0x66 ^ 0x52);
        D.lllIlIlI[23] = 0x2A ^ 0x27;
        D.lllIlIlI[24] = 0x41 ^ 0x4F;
        D.lllIlIlI[25] = 0xA7 ^ 0xA8;
        D.lllIlIlI[26] = 0x61 ^ 0x71;
        D.lllIlIlI[27] = -(0xFFFFE1A9 & 0x7EDE) & (0xFFFFF7AF & 0x6AFF);
        D.lllIlIlI[28] = 10 + 49 - -13 + 70 ^ 107 + 139 - 207 + 120;
        D.lllIlIlI[29] = 0x26 ^ 0x34;
        D.lllIlIlI[30] = 0x70 ^ 0x48 ^ (0x52 ^ 0x79);
        D.lllIlIlI[31] = 0x79 ^ 0x6D;
        D.lllIlIlI[32] = 12 + 99 - 68 + 109 ^ 44 + 41 - 17 + 73;
        D.lllIlIlI[33] = 0x2E ^ 0x38;
        D.lllIlIlI[34] = 0x64 ^ 0x7C ^ (0x6D ^ 0x62);
        D.lllIlIlI[35] = 0x3D ^ 0x7E ^ (0xC4 ^ 0x9F);
        D.lllIlIlI[36] = 131 + 80 - 168 + 129 ^ 32 + 46 - -4 + 99;
        D.lllIlIlI[37] = 0xAA ^ 0xB0;
        D.lllIlIlI[38] = 0xBA ^ 0x98 ^ (0x2B ^ 0x12);
        D.lllIlIlI[39] = 0x94 ^ 0x9D ^ (0x79 ^ 0x6C);
        D.lllIlIlI[40] = 46 + 53 - -84 + 7 ^ 3 + 160 - 138 + 138;
        D.lllIlIlI[41] = 0xB3 ^ 0xAD;
        D.lllIlIlI[42] = 0x2B ^ 0x39 ^ (0x35 ^ 0x38);
        D.lllIlIlI[43] = 0x74 ^ 0x54;
        D.lllIlIlI[44] = 46 + 47 - 48 + 101 ^ 17 + 23 - 4 + 143;
        D.lllIlIlI[45] = 0xED ^ 0x88 ^ (0x6D ^ 0x2A);
        D.lllIlIlI[46] = -(0xFFFF8BD5 & 0x75AB) & (0xFFFFFFBE & 0x3FDD);
        D.lllIlIlI[47] = 0xFFFFD7CE & 0x3F3D;
        D.lllIlIlI[48] = 0xFFFFEEEE & 0x3FDD;
        D.lllIlIlI[49] = 0xFFFFE3B8 & 0x7DEF;
        D.lllIlIlI[50] = -(0xFFFFE2B7 & 0x7DDA) & (0xFFFFE7FF & 0x7FFD);
        D.lllIlIlI[51] = 7 ^ 0x57 ^ (0x29 ^ 0x1D);
        D.lllIlIlI[52] = 0x8B ^ 0xA8;
        D.lllIlIlI[53] = 0xF7 ^ 0x9C ^ (0x3D ^ 0x72);
        D.lllIlIlI[54] = 128 + 185 - 174 + 85 ^ 131 + 174 - 159 + 51;
        D.lllIlIlI[55] = 0x47 ^ 0x61;
        D.lllIlIlI[56] = 0x91 ^ 0xB6;
        D.lllIlIlI[57] = 0x63 ^ 0x4B;
        D.lllIlIlI[58] = 7 ^ 0x6E ^ (0xE8 ^ 0xA8);
        D.lllIlIlI[59] = 0x3F ^ 0x15;
        D.lllIlIlI[60] = 0x23 ^ 8;
        D.lllIlIlI[61] = 0x5D ^ 0x4C ^ (0xAE ^ 0x93);
        D.lllIlIlI[62] = 0x25 ^ 0x47 ^ (0x57 ^ 0x18);
        D.lllIlIlI[63] = 0xF ^ 0x51 ^ (0xF6 ^ 0x86);
        D.lllIlIlI[64] = 0xAA ^ 0xC6 ^ (0xC ^ 0x4F);
        D.lllIlIlI[65] = 0x9C ^ 0xAC;
        D.lllIlIlI[66] = 0x32 ^ 0x6E ^ (0xCA ^ 0xA7);
        D.lllIlIlI[67] = -(0xFFFFBB5F & 0x74B6) & (0xFFFFFFDF & 0x3CBF);
        D.lllIlIlI[68] = 0xFFFF9F5B & 0x6CEE;
        D.lllIlIlI[69] = -(0xFFFFEBDA & 0x74BD) & (0xFFFFEEFF & 0x7DFF);
        D.lllIlIlI[70] = 0xFFFFFDFB & 0xEB5;
        D.lllIlIlI[71] = 0xFFFFEE7A & 0x1DFF;
        D.lllIlIlI[72] = -(0xFFFFE1D6 & 0x7E7B) & (0xFFFFFCFF & 0x6F7F);
        D.lllIlIlI[73] = 0xFFFFBF5E & 0x65FF;
        D.lllIlIlI[74] = 87 + 75 - 99 + 80 ^ 76 + 21 - 59 + 151;
    }

    private static boolean llIIIIlIllI(int n2, int n3) {
        return n2 <= n3;
    }

    private static String lIllllIlllI(String lIIlllllIllIllI, String lIIlllllIllIlIl) {
        lIIlllllIllIllI = new String(Base64.getDecoder().decode(lIIlllllIllIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIlllllIllIlII = new StringBuilder();
        char[] lIIlllllIllIIll = lIIlllllIllIlIl.toCharArray();
        int lIIlllllIllIIlI = lllIlIlI[0];
        char[] lIIlllllIlIllII = lIIlllllIllIllI.toCharArray();
        int lIIlllllIlIlIll = lIIlllllIlIllII.length;
        int lIIlllllIlIlIlI = lllIlIlI[0];
        while (D.llIIIIIlllI(lIIlllllIlIlIlI, lIIlllllIlIlIll)) {
            char lIIlllllIllIlll = lIIlllllIlIllII[lIIlllllIlIlIlI];
            lIIlllllIllIlII.append((char)(lIIlllllIllIlll ^ lIIlllllIllIIll[lIIlllllIllIIlI % lIIlllllIllIIll.length]));
            "".length();
            ++lIIlllllIllIIlI;
            ++lIIlllllIlIlIlI;
            "".length();
            if ((0x3D ^ 0x6D ^ (0x75 ^ 0x21)) >= ((98 + 113 - 78 + 59 ^ 58 + 182 - 191 + 147) & (114 + 13 - 3 + 16 ^ 131 + 58 - 92 + 39 ^ -" ".length()))) continue;
            return null;
        }
        return String.valueOf(lIIlllllIllIlII);
    }

    static {
        D.llIIIIIlIll();
        D.lIlllllIlII();
        String[] stringArray = new String[lllIlIlI[23]];
        stringArray[D.lllIlIlI[0]] = lllIIlIl[lllIlIlI[54]];
        stringArray[D.lllIlIlI[1]] = lllIIlIl[lllIlIlI[55]];
        stringArray[D.lllIlIlI[3]] = lllIIlIl[lllIlIlI[56]];
        stringArray[D.lllIlIlI[5]] = lllIIlIl[lllIlIlI[57]];
        stringArray[D.lllIlIlI[7]] = lllIIlIl[lllIlIlI[58]];
        stringArray[D.lllIlIlI[8]] = lllIIlIl[lllIlIlI[59]];
        stringArray[D.lllIlIlI[14]] = lllIIlIl[lllIlIlI[60]];
        stringArray[D.lllIlIlI[20]] = lllIIlIl[lllIlIlI[61]];
        stringArray[D.lllIlIlI[18]] = lllIIlIl[lllIlIlI[62]];
        stringArray[D.lllIlIlI[21]] = lllIIlIl[lllIlIlI[63]];
        stringArray[D.lllIlIlI[15]] = lllIIlIl[lllIlIlI[64]];
        stringArray[D.lllIlIlI[19]] = lllIIlIl[lllIlIlI[65]];
        stringArray[D.lllIlIlI[22]] = lllIIlIl[lllIlIlI[66]];
        ii = stringArray;
        ij = new WorldPoint(lllIlIlI[16], lllIlIlI[67], lllIlIlI[0]);
        ik = new WorldPoint(lllIlIlI[68], lllIlIlI[69], lllIlIlI[0]);
        il = new WorldPoint(lllIlIlI[70], lllIlIlI[71], lllIlIlI[0]);
        im = new WorldPoint(lllIlIlI[72], lllIlIlI[73], lllIlIlI[0]);
        bB = new ArrayList<d>();
        bZ = lllIlIlI[0];
    }

    private static boolean llIIIIlIIlI(Object object) {
        return object != null;
    }

    private static boolean llIIIIlIlIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIIIIlIIII(int n2) {
        return n2 < 0;
    }

    private static boolean llIIIIlIIIl(int n2) {
        return n2 > 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ac() {
        int n2;
        int[] nArray = new int[lllIlIlI[1]];
        nArray[D.lllIlIlI[0]] = lllIlIlI[11];
        if (D.llIIIIIllIl(Inventory.contains((int[])nArray) ? 1 : 0) && (!D.llIIIIIllll(Inventory.contains((int[])f.aX) ? 1 : 0) || D.llIIIIIllIl(Equipment.contains((int[])f.aX) ? 1 : 0)) && D.llIIIIIllIl(Inventory.contains((int[])f.bb) ? 1 : 0)) {
            int[] nArray2 = new int[lllIlIlI[1]];
            nArray2[D.lllIlIlI[0]] = lllIlIlI[13];
            if (D.llIIIIIllIl(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                int[] nArray3 = new int[lllIlIlI[1]];
                nArray3[D.lllIlIlI[0]] = lllIlIlI[4];
                if (D.llIIIIIllIl(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                    n2 = lllIlIlI[1];
                    "".length();
                    if (-" ".length() < "   ".length()) return n2 != 0;
                    return ((138 + 68 - 97 + 32 ^ 118 + 60 - 116 + 82) & (0x76 ^ 0x47 ^ (0x90 ^ 0xBC) ^ -" ".length())) != 0;
                }
            }
        }
        n2 = lllIlIlI[0];
        return n2 != 0;
    }

    private static void lIlllllIlII() {
        lllIIlIl = new String[lllIlIlI[74]];
        D.lllIIlIl[D.lllIlIlI[0]] = D.lIllllIllIl("M6SBqOZ+5O5v+JvuoXP2SQ==", "yyokc");
        D.lllIIlIl[D.lllIlIlI[1]] = D.lIllllIlllI("EAA5PCE+DDN1MCMQPjs1dgAjMD8lRXcmJT8dND07OA53NzM1AnchPXYYIjAhIg==", "ViWUR");
        D.lllIIlIl[D.lllIlIlI[3]] = D.lIllllIllll("HrCZUnDhXRo=", "raJXt");
        D.lllIIlIl[D.lllIlIlI[5]] = D.lIllllIllIl("tc/7I8c7GYw=", "XaUbB");
        D.lllIIlIl[D.lllIlIlI[7]] = D.lIllllIllll("KwDiXBTwj6a0dwC1DlvNBw==", "PlrGS");
        D.lllIIlIl[D.lllIlIlI[8]] = D.lIllllIlllI("OgUCLgUbCgtqCxMKByMHFQ==", "rdlJi");
        D.lllIIlIl[D.lllIlIlI[14]] = D.lIllllIllIl("eskEc9BFNBHqUVf3qWecTljM9gbuLDxOOLEcwalLnp5XnhhF0ahtQt8ylcsfoyn9KL3rHiz2aIU=", "OypCE");
        D.lllIIlIl[D.lllIlIlI[20]] = D.lIllllIllll("rzoujlwRCs2Yu1QZUjVn6w==", "LjCdy");
        D.lllIIlIl[D.lllIlIlI[18]] = D.lIllllIllll("KzbLu6TQ7BLqLT4TJmfV2Q==", "kpIiS");
        D.lllIIlIl[D.lllIlIlI[21]] = D.lIllllIllll("0zHlFduGbeo1GIVFMWhoNQ==", "qbsTP");
        D.lllIIlIl[D.lllIlIlI[15]] = D.lIllllIllll("/LfvCGWDPLHwiNEEoIoFsQ==", "rkGqy");
        D.lllIIlIl[D.lllIlIlI[19]] = D.lIllllIlllI("HSwGQjY8bR4HITghEQEncyoFGw==", "SMpbB");
        D.lllIIlIl[D.lllIlIlI[22]] = D.lIllllIlllI("Dho2ATcmFzYNKyBULBQm", "GtBdE");
        D.lllIIlIl[D.lllIlIlI[23]] = D.lIllllIllIl("xqe1jupKeq8=", "ShwzI");
        D.lllIIlIl[D.lllIlIlI[24]] = D.lIllllIllIl("00pAxvH01RA=", "GrsZz");
        D.lllIIlIl[D.lllIlIlI[25]] = D.lIllllIlllI("HCYOOw==", "SVkUw");
        D.lllIIlIl[D.lllIlIlI[26]] = D.lIllllIlllI("LjAsLSAacQ03LQY0IQ==", "hQXEE");
        D.lllIIlIl[D.lllIlIlI[28]] = D.lIllllIllll("Er0lO4B63oA=", "vyRld");
        D.lllIIlIl[D.lllIlIlI[29]] = D.lIllllIllIl("pgQRSc8XeTvDE4SyUf1LDw==", "uzUAk");
        D.lllIIlIl[D.lllIlIlI[30]] = D.lIllllIlllI("CQoPPhUoBQZ6Gi4NBzMX", "AkaZy");
        D.lllIIlIl[D.lllIlIlI[31]] = D.lIllllIllIl("fhQJnXpvPF+jxj8MeD93kQ==", "ltmlw");
        D.lllIIlIl[D.lllIlIlI[32]] = D.lIllllIlllI("NhQCOQEBAgJtCgweAjk=", "dqqMm");
        D.lllIIlIl[D.lllIlIlI[33]] = D.lIllllIlllI("NwwxIQYa", "tcWGo");
        D.lllIIlIl[D.lllIlIlI[34]] = D.lIllllIlllI("CREgPQ==", "FaESE");
        D.lllIIlIl[D.lllIlIlI[35]] = D.lIllllIlllI("NgMbVhMXQh4dEhQO", "xbmvg");
        D.lllIIlIl[D.lllIlIlI[36]] = D.lIllllIllIl("VpmkUz4HAF7WozxuCTecRQ==", "JrpRb");
        D.lllIIlIl[D.lllIlIlI[37]] = D.lIllllIllIl("6eC0GSgQxDk=", "tKBOm");
        D.lllIIlIl[D.lllIlIlI[38]] = D.lIllllIllIl("sx6UZBJ7GaA=", "JeNpP");
        D.lllIIlIl[D.lllIlIlI[39]] = D.lIllllIllIl("xkTw6P3m7Oc=", "HlYVD");
        D.lllIIlIl[D.lllIlIlI[40]] = D.lIllllIlllI("Cig6UDEraS8fIyIgIg==", "DILpE");
        D.lllIIlIl[D.lllIlIlI[41]] = D.lIllllIllll("0x9D+QEA9vCy378JD66NBw==", "ySuew");
        D.lllIIlIl[D.lllIlIlI[42]] = D.lIllllIllll("6TXx3Mqzhc8=", "ULonS");
        D.lllIIlIl[D.lllIlIlI[43]] = D.lIllllIlllI("CiEpPQ==", "EQLSC");
        D.lllIIlIl[D.lllIlIlI[44]] = D.lIllllIlllI("PgoNDA==", "qzhbw");
        D.lllIIlIl[D.lllIlIlI[45]] = D.lIllllIllIl("PJK1IEreePJnLvOJ5OV7/A==", "UPiWx");
        D.lllIIlIl[D.lllIlIlI[52]] = D.lIllllIllIl("L761CXuKVacs86GGZN1tpXfxEtaQvpnI", "pwmrT");
        D.lllIIlIl[D.lllIlIlI[53]] = D.lIllllIllll("SmRkX8OZb0cNmSWk2UQvPM+Ec9YQR5+C", "BWXQh");
        D.lllIIlIl[D.lllIlIlI[54]] = D.lIllllIllll("soG3BsnAh5V3+EPwX12tpvlDwumJTXuaWojDu8td2gg=", "EdwPH");
        D.lllIIlIl[D.lllIlIlI[55]] = D.lIllllIlllI("J1IMJxIVAUskFUYLBD4BRhQCJRYVBksqHwNSGycWBwEOZQ==", "frkKs");
        D.lllIIlIl[D.lllIlIlI[56]] = D.lIllllIllll("gxHATX4YWrW7fi/O9TiBotKxXEbOmArt", "fpNWs");
        D.lllIIlIl[D.lllIlIlI[57]] = D.lIllllIllll("gsF9+ljeGbI=", "mRUhT");
        D.lllIIlIl[D.lllIlIlI[58]] = D.lIllllIllIl("TDBZXIEsQWgxeNaW+CtzgPV23VGc/KTqryajACmJCQg=", "Djray");
        D.lllIIlIl[D.lllIlIlI[59]] = D.lIllllIlllI("Bg1GdB4sEko5F2kODzgCaRICMRxn", "IfjTr");
        D.lllIIlIl[D.lllIlIlI[60]] = D.lIllllIllIl("aP7AJMYGnMwlO1sAdYof03iNwDDf9ooDn7jjEDoS2mmfJgKeNsVhIw==", "WtwYS");
        D.lllIIlIl[D.lllIlIlI[61]] = D.lIllllIllll("pPUC6Kd7pG/cJPWuM3XSKDtv7UKjkg48HaNJd9OHnc1fhAF4cUCu9K1DzmuAHO73", "fAAyK");
        D.lllIIlIl[D.lllIlIlI[62]] = D.lIllllIllIl("99ubkSTsXZkh9j3Hygf2Lc08+kUZTclJXK9WhiGkrmg+9+b0mcBJXg==", "SlZXS");
        D.lllIIlIl[D.lllIlIlI[63]] = D.lIllllIllIl("9MJPq9O03cc=", "SwohK");
        D.lllIIlIl[D.lllIlIlI[64]] = D.lIllllIlllI("JnELbTsKNxQkIgh2ByNsDjsTISkbdgkrbAg+CT44TyUWKC0Edw==", "oVfML");
        D.lllIIlIl[D.lllIlIlI[65]] = D.lIllllIllll("w66zNAfmCDbeFAvFMANM9A==", "lhsrz");
        D.lllIIlIl[D.lllIlIlI[66]] = D.lIllllIlllI("Chs8UygjGms6ayoRJwN0", "BtKsK");
    }

    @Override
    public int U() {
        try {
            D.ci();
            "".length();
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (((0x54 ^ 0x5A ^ (0xD4 ^ 0x84)) & (0x37 ^ 0x32 ^ (0x6E ^ 0x35) ^ -" ".length())) > 0) {
            return (58 + 69 - 83 + 89 ^ 131 + 144 - 139 + 11) & (5 + 142 - 105 + 107 ^ 105 + 8 - 87 + 105 ^ -" ".length());
        }
        return lllIlIlI[51];
    }

    private static int llIIIIIllII(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean llIIIIIllll(int n2) {
        return n2 == 0;
    }

    private static String lIllllIllll(String lIIlllllIlIIIIl, String lIIlllllIIllllI) {
        try {
            SecretKeySpec lIIlllllIlIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIlllllIIllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIlllllIlIIIll = Cipher.getInstance("Blowfish");
            lIIlllllIlIIIll.init(lllIlIlI[3], lIIlllllIlIIlII);
            return new String(lIIlllllIlIIIll.doFinal(Base64.getDecoder().decode(lIIlllllIlIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIlllllIlIIIlI) {
            lIIlllllIlIIIlI.printStackTrace();
            return null;
        }
    }

    @Override
    public String V() {
        return lllIIlIl[lllIlIlI[52]];
    }

    private static String lIllllIllIl(String lIIllllllIIIlII, String lIIllllllIIIlIl) {
        try {
            SecretKeySpec lIIllllllIIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIllllllIIIlIl.getBytes(StandardCharsets.UTF_8)), lllIlIlI[18]), "DES");
            Cipher lIIllllllIIlIII = Cipher.getInstance("DES");
            lIIllllllIIlIII.init(lllIlIlI[3], lIIllllllIIlIIl);
            return new String(lIIllllllIIlIII.doFinal(Base64.getDecoder().decode(lIIllllllIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIllllllIIIlll) {
            lIIllllllIIIlll.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean T() {
        return lllIlIlI[0];
    }

    private static boolean llIIIIIlllI(int n2, int n3) {
        return n2 < n3;
    }

    public static void ci() {
        if (D.llIIIIIllIl(bz ? 1 : 0)) {
            AccBuilderBarrows.c = lllIIlIl[lllIlIlI[0]];
            b.a(bB);
            if (D.llIIIIIlllI(bB.size(), lllIlIlI[1])) {
                System.out.println(lllIIlIl[lllIlIlI[1]]);
                bz = lllIlIlI[0];
            }
        }
        if (D.llIIIIIllll(bz ? 1 : 0)) {
            NPC lIIllllllIlIlII;
            BankLocation lIIllllllIlIlIl;
            if (D.llIIIIIllIl(Inventory.contains((int[])f.bb) ? 1 : 0) && D.llIIIIIlllI(Movement.getRunEnergy(), lllIlIlI[2])) {
                Inventory.getFirst((int[])f.bb).interact(lllIIlIl[lllIlIlI[3]]);
                Time.sleepTicks((int)lllIlIlI[1]);
                "".length();
            }
            if (D.llIIIIlIIII(D.llIIIIIllII(e.v(), 70.0))) {
                int[] nArray = new int[lllIlIlI[1]];
                nArray[D.lllIlIlI[0]] = lllIlIlI[4];
                if (D.llIIIIIllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray2 = new int[lllIlIlI[1]];
                    nArray2[D.lllIlIlI[0]] = lllIlIlI[4];
                    Inventory.getFirst((int[])nArray2).interact(lllIIlIl[lllIlIlI[5]]);
                }
            }
            if (D.llIIIIIllll(Movement.isRunEnabled() ? 1 : 0) && D.llIIIIlIIIl(Movement.getRunEnergy())) {
                Movement.toggleRun();
            }
            if (D.llIIIIIllll(D.ac() ? 1 : 0) && D.llIIIIIlllI(e.j(lllIlIlI[6]), lllIlIlI[1])) {
                lIIllllllIlIlIl = BankLocation.getNearest();
                if (D.llIIIIlIIlI(lIIllllllIlIlIl) && D.llIIIIIllll(lIIllllllIlIlIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderBarrows.c = lllIIlIl[lllIlIlI[7]];
                    a.a(lIIllllllIlIlIl);
                    Time.sleepTicks((int)lllIlIlI[3]);
                    "".length();
                }
                if (D.llIIIIlIIlI(lIIllllllIlIlIl) && D.llIIIIIllIl(lIIllllllIlIlIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderBarrows.c = lllIIlIl[lllIlIlI[8]];
                    if (D.llIIIIIllll(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lllIlIlI[9]);
                        "".length();
                    }
                    if (D.llIIIIIllIl(Bank.isOpen() ? 1 : 0)) {
                        if (D.llIIIIlIIIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lllIlIlI[7]);
                            "".length();
                        }
                        if (D.llIIIIlIIIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lllIlIlI[3]);
                            "".length();
                        }
                        int[] nArray = new int[lllIlIlI[8]];
                        nArray[D.lllIlIlI[0]] = lllIlIlI[10];
                        nArray[D.lllIlIlI[1]] = lllIlIlI[11];
                        nArray[D.lllIlIlI[3]] = lllIlIlI[12];
                        nArray[D.lllIlIlI[5]] = lllIlIlI[13];
                        nArray[D.lllIlIlI[7]] = lllIlIlI[4];
                        if (D.llIIIIIllll(e.b(nArray) ? 1 : 0)) {
                            D.ag();
                            System.out.println(lllIIlIl[lllIlIlI[14]]);
                            bz = lllIlIlI[1];
                            return;
                        }
                        Bank.withdraw((int)lllIlIlI[11], (int)lllIlIlI[15], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lllIlIlI[1]);
                        "".length();
                        Bank.withdraw((int)lllIlIlI[13], (int)lllIlIlI[8], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lllIlIlI[1]);
                        "".length();
                        Bank.withdraw((int)lllIlIlI[10], (int)lllIlIlI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lllIlIlI[1]);
                        "".length();
                        a.b(f.bb, lllIlIlI[1]);
                        a.a(lllIlIlI[4], lllIlIlI[15]);
                        a.b(f.bl, lllIlIlI[1]);
                    }
                }
            }
            if (D.llIIIIIllIl(D.ac() ? 1 : 0) && D.llIIIIIlllI(e.j(lllIlIlI[6]), lllIlIlI[1])) {
                lIIllllllIlIlIl = new WorldArea(lllIlIlI[16], lllIlIlI[17], lllIlIlI[18], lllIlIlI[19], lllIlIlI[0]);
                String[] stringArray = new String[lllIlIlI[1]];
                stringArray[D.lllIlIlI[0]] = lllIIlIl[lllIlIlI[20]];
                lIIllllllIlIlII = NPCs.getNearest((String[])stringArray);
                if (D.llIIIIlIIll(lIIllllllIlIlII) && D.llIIIIlIlII(Players.getLocal().getWorldLocation().distanceTo(ij), lllIlIlI[5]) && D.llIIIIIllll(AccBuilderBarrows.d ? 1 : 0)) {
                    AccBuilderBarrows.c = lllIIlIl[lllIlIlI[18]];
                    if (D.llIIIIIlllI(bZ, lllIlIlI[1])) {
                        e.w();
                        bZ += lllIlIlI[1];
                    }
                    Movement.walkTo((WorldPoint)ij);
                    "".length();
                    Time.sleepTicks((int)lllIlIlI[1]);
                    "".length();
                }
                if (D.llIIIIlIIlI(lIIllllllIlIlII)) {
                    AccBuilderBarrows.c = lllIIlIl[lllIlIlI[21]];
                    g.a(lllIIlIl[lllIlIlI[15]], ii, lllIlIlI[1]);
                }
            }
            if (D.llIIIIlIlIl(e.j(lllIlIlI[6]), lllIlIlI[1])) {
                if (D.llIIIIlIlII(Players.getLocal().getWorldLocation().distanceTo(ik), lllIlIlI[14])) {
                    AccBuilderBarrows.c = lllIIlIl[lllIlIlI[19]];
                    Movement.walkTo((WorldPoint)ik);
                    "".length();
                    Time.sleepTicks((int)lllIlIlI[1]);
                    "".length();
                }
                if (D.llIIIIlIllI(Players.getLocal().getWorldLocation().distanceTo(ik), lllIlIlI[14])) {
                    AccBuilderBarrows.c = lllIIlIl[lllIlIlI[22]];
                    String[] stringArray = new String[lllIlIlI[1]];
                    stringArray[D.lllIlIlI[0]] = lllIIlIl[lllIlIlI[23]];
                    lIIllllllIlIlIl = TileObjects.getNearest((String[])stringArray);
                    if (D.llIIIIlIIlI(lIIllllllIlIlIl)) {
                        String[] stringArray2 = new String[lllIlIlI[1]];
                        stringArray2[D.lllIlIlI[0]] = lllIIlIl[lllIlIlI[24]];
                        if (D.llIIIIIllIl(lIIllllllIlIlIl.hasAction(stringArray2) ? 1 : 0)) {
                            lIIllllllIlIlIl.interact(lllIIlIl[lllIlIlI[25]]);
                            Time.sleepTicks((int)lllIlIlI[8]);
                            "".length();
                        }
                    }
                    g.a(lllIIlIl[lllIlIlI[26]], ii);
                }
            }
            if (D.llIIIIlIlIl(e.j(lllIlIlI[6]), lllIlIlI[3])) {
                if (D.llIIIIlIlII(Players.getLocal().getWorldLocation().distanceTo(il), lllIlIlI[3])) {
                    int[] nArray = new int[lllIlIlI[1]];
                    nArray[D.lllIlIlI[0]] = lllIlIlI[27];
                    if (D.llIIIIIllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray3 = new int[lllIlIlI[1]];
                        nArray3[D.lllIlIlI[0]] = lllIlIlI[27];
                        Inventory.getFirst((int[])nArray3).interact(lllIIlIl[lllIlIlI[28]]);
                        Time.sleepTicks((int)lllIlIlI[1]);
                        "".length();
                    }
                    AccBuilderBarrows.c = lllIIlIl[lllIlIlI[29]];
                    Movement.walkTo((WorldPoint)il);
                    "".length();
                    Time.sleepTicks((int)lllIlIlI[1]);
                    "".length();
                }
                if (D.llIIIIlIllI(Players.getLocal().getWorldLocation().distanceTo(il), lllIlIlI[3])) {
                    AccBuilderBarrows.c = lllIIlIl[lllIlIlI[30]];
                    String[] stringArray = new String[lllIlIlI[1]];
                    stringArray[D.lllIlIlI[0]] = lllIIlIl[lllIlIlI[31]];
                    lIIllllllIlIlIl = NPCs.getNearest((String[])stringArray);
                    if (D.llIIIIlIIlI(lIIllllllIlIlIl)) {
                        g.a(lllIIlIl[lllIlIlI[32]], ii);
                    }
                    if (D.llIIIIlIIll(lIIllllllIlIlIl)) {
                        String[] stringArray3 = new String[lllIlIlI[1]];
                        stringArray3[D.lllIlIlI[0]] = lllIIlIl[lllIlIlI[33]];
                        TileObjects.getNearest((String[])stringArray3).interact(lllIIlIl[lllIlIlI[34]]);
                        Time.sleepTicks((int)lllIlIlI[3]);
                        "".length();
                    }
                }
            }
            if (D.llIIIIlIlIl(e.j(lllIlIlI[6]), lllIlIlI[5])) {
                ci = lllIlIlI[0];
                if (D.llIIIIlIlII(Players.getLocal().getWorldLocation().distanceTo(im), lllIlIlI[5])) {
                    AccBuilderBarrows.c = lllIIlIl[lllIlIlI[35]];
                    Movement.walkTo((WorldPoint)im);
                    "".length();
                    Time.sleepTicks((int)lllIlIlI[1]);
                    "".length();
                }
                if (D.llIIIIlIllI(Players.getLocal().getWorldLocation().distanceTo(im), lllIlIlI[5])) {
                    AccBuilderBarrows.c = lllIIlIl[lllIlIlI[36]];
                    String[] stringArray = new String[lllIlIlI[1]];
                    stringArray[D.lllIlIlI[0]] = lllIIlIl[lllIlIlI[37]];
                    lIIllllllIlIlIl = TileObjects.getNearest((String[])stringArray);
                    if (D.llIIIIlIIlI(lIIllllllIlIlIl)) {
                        lIIllllllIlIlIl.interact(lllIIlIl[lllIlIlI[38]]);
                    }
                }
            }
            if (D.llIIIIlIlIl(e.j(lllIlIlI[6]), lllIlIlI[7])) {
                if (D.llIIIIlIlII(Players.getLocal().getWorldLocation().distanceTo(il), lllIlIlI[3])) {
                    int[] nArray = new int[lllIlIlI[1]];
                    nArray[D.lllIlIlI[0]] = lllIlIlI[27];
                    if (D.llIIIIIllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray4 = new int[lllIlIlI[1]];
                        nArray4[D.lllIlIlI[0]] = lllIlIlI[27];
                        Inventory.getFirst((int[])nArray4).interact(lllIIlIl[lllIlIlI[39]]);
                        Time.sleepTicks((int)lllIlIlI[1]);
                        "".length();
                    }
                    AccBuilderBarrows.c = lllIIlIl[lllIlIlI[40]];
                    Movement.walkTo((WorldPoint)il);
                    "".length();
                    Time.sleepTicks((int)lllIlIlI[1]);
                    "".length();
                }
                if (D.llIIIIlIllI(Players.getLocal().getWorldLocation().distanceTo(il), lllIlIlI[3])) {
                    AccBuilderBarrows.c = lllIIlIl[lllIlIlI[41]];
                    String[] stringArray = new String[lllIlIlI[1]];
                    stringArray[D.lllIlIlI[0]] = lllIIlIl[lllIlIlI[42]];
                    lIIllllllIlIlIl = TileObjects.getNearest((String[])stringArray);
                    if (D.llIIIIlIIlI(lIIllllllIlIlIl)) {
                        String[] stringArray4 = new String[lllIlIlI[1]];
                        stringArray4[D.lllIlIlI[0]] = lllIIlIl[lllIlIlI[43]];
                        if (D.llIIIIIllIl(lIIllllllIlIlIl.hasAction(stringArray4) ? 1 : 0)) {
                            lIIllllllIlIlIl.interact(lllIIlIl[lllIlIlI[44]]);
                            Time.sleepTicks((int)lllIlIlI[3]);
                            "".length();
                        }
                        String[] stringArray5 = new String[lllIlIlI[1]];
                        stringArray5[D.lllIlIlI[0]] = lllIIlIl[lllIlIlI[45]];
                        lIIllllllIlIlII = Inventory.getFirst((String[])stringArray5);
                        if (D.llIIIIlIIlI(lIIllllllIlIlII)) {
                            if (D.llIIIIIlllI(ci, lllIlIlI[1])) {
                                Q.mq += lllIlIlI[1];
                                Q.o(AccBuilderBarrows.m);
                                ci += lllIlIlI[1];
                                Q.mq = lllIlIlI[0];
                                cj = lllIlIlI[0];
                            }
                            lIIllllllIlIlII.useOn((TileObject)lIIllllllIlIlIl);
                            Time.sleepTicks((int)lllIlIlI[5]);
                            "".length();
                        }
                    }
                }
                g.a(ii);
            }
            g.a(new String[lllIlIlI[0]]);
        }
    }

    private static void ag() {
        d lIIllllllIlIIII;
        Object lIIllllllIlIIIl;
        int[] nArray = new int[lllIlIlI[1]];
        nArray[D.lllIlIlI[0]] = lllIlIlI[10];
        if (D.llIIIIIllll(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(lllIlIlI[10], lllIlIlI[1], lllIlIlI[46]);
            bB.add(d2);
            "".length();
        }
        int[] nArray2 = new int[lllIlIlI[1]];
        nArray2[D.lllIlIlI[0]] = lllIlIlI[4];
        if (D.llIIIIIllll(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lIIllllllIlIIIl = new d(lllIlIlI[4], lllIlIlI[15], lllIlIlI[47]);
            bB.add((d)lIIllllllIlIIIl);
            "".length();
        }
        if (D.llIIIIIllll(Bank.contains(lIIllllllIlIIIl = item -> item.getName().toLowerCase().contains(lllIIlIl[lllIlIlI[53]])) ? 1 : 0)) {
            lIIllllllIlIIII = new d(lllIlIlI[48], lllIlIlI[8], lllIlIlI[49]);
            bB.add(lIIllllllIlIIII);
            "".length();
        }
        int[] nArray3 = new int[lllIlIlI[1]];
        nArray3[D.lllIlIlI[0]] = lllIlIlI[11];
        if (D.llIIIIIllll(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lIIllllllIlIIII = new d(lllIlIlI[11], lllIlIlI[15], lllIlIlI[50]);
            bB.add(lIIllllllIlIIII);
            "".length();
        }
        int[] nArray4 = new int[lllIlIlI[1]];
        nArray4[D.lllIlIlI[0]] = lllIlIlI[13];
        if (D.llIIIIIllll(Bank.contains((int[])nArray4) ? 1 : 0)) {
            lIIllllllIlIIII = new d(lllIlIlI[13], lllIlIlI[31], lllIlIlI[50]);
            bB.add(lIIllllllIlIIII);
            "".length();
        }
        int[] nArray5 = new int[lllIlIlI[1]];
        nArray5[D.lllIlIlI[0]] = lllIlIlI[12];
        if (D.llIIIIIllll(Bank.contains((int[])nArray5) ? 1 : 0)) {
            lIIllllllIlIIII = new d(lllIlIlI[12], lllIlIlI[8], i.bw);
            bB.add(lIIllllllIlIIII);
            "".length();
        }
    }

    private static boolean llIIIIlIIll(Object object) {
        return object == null;
    }

    private static boolean llIIIIlIlII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIIIIlIlll(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public boolean W() {
        boolean bl;
        if (D.llIIIIlIlll(e.j(lllIlIlI[6]), lllIlIlI[8])) {
            bl = lllIlIlI[1];
            "".length();
            if ("   ".length() >= (165 + 162 - 192 + 51 ^ 13 + 172 - 125 + 130)) {
                return ((41 + 116 - 128 + 210 ^ 109 + 59 - 65 + 94) & (5 + 174 - 108 + 104 ^ 44 + 17 - -15 + 57 ^ -" ".length())) != 0;
            }
        } else {
            bl = lllIlIlI[0];
        }
        return bl;
    }

    private static boolean llIIIIIllIl(int n2) {
        return n2 != 0;
    }
}

