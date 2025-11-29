/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 */
package e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u;

import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.S;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.a;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.ac;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.b;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.d;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.e;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.f;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.g;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.i;
import gg.squire.account.AccBuilderTempleTrek;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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
import net.unethicalite.api.widgets.Dialog;

public class y
implements S {
    public static /* synthetic */ boolean bs;
    static /* synthetic */ int gp;
    static /* synthetic */ WorldPoint gf;
    static /* synthetic */ int ck;
    private static /* synthetic */ int[] llllllIIII;
    static /* synthetic */ String[] bQ;
    static /* synthetic */ boolean cl;
    public static /* synthetic */ List<d> bu;
    static /* synthetic */ WorldPoint gq;
    private static /* synthetic */ String[] lllllIllII;

    private static boolean llIlIllIIIIII(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public boolean V() {
        boolean bl;
        if (y.llIlIlIllllll(e.j(gp), llllllIIII[6])) {
            bl = llllllIIII[0];
            0;
            if (((0x8D ^ 0x8B ^ (0x83 ^ 0xC6)) & (133 + 94 - 194 + 177 ^ 49 + 95 - 25 + 26 ^ -1)) == -1) {
                return ((0x5C ^ 0x5B ^ (0x5E ^ 0x41)) & (0x59 ^ 0x4F ^ (8 ^ 6) ^ -1)) != 0;
            }
        } else {
            bl = llllllIIII[1];
        }
        return bl;
    }

    private static boolean llIlIlIlllllI(int n2, int n3) {
        return n2 != n3;
    }

    private static void llIlIlIllIlII() {
        llllllIIII = new int[163];
        y.llllllIIII[0] = 1;
        y.llllllIIII[1] = (0xE ^ 0x4D) & ~(0x61 ^ 0x22);
        y.llllllIIII[2] = 0xAD ^ 0xA1;
        y.llllllIIII[3] = 2;
        y.llllllIIII[4] = -(0xFFFFD86E & 0x6FB5) & (0xFFFFFBBB & 0x5FEF);
        y.llllllIIII[5] = 3;
        y.llllllIIII[6] = 0x3C ^ 0x38;
        y.llllllIIII[7] = 0x4A ^ 0x4F;
        y.llllllIIII[8] = -(105 + 167 - 135 + 40) & (0xFFFF9FFF & 0x7FF7);
        y.llllllIIII[9] = 0xFFFF9FC9 & 0x7F7F;
        y.llllllIIII[10] = -(0xFFFFFDFB & 0xA47) & (0xFFFFCFFF & 0x3FEF);
        y.llllllIIII[11] = -(0xFFFFDDBB & 0x2BF5) & (0xFFFF8FFD & 0x7DFF);
        y.llllllIIII[12] = -(0xFFFFF1F7 & 0x3F89) & (0xFFFFF5FB & 0x3FF7);
        y.llllllIIII[13] = 0x1B ^ 0x40 ^ (0x76 ^ 0x27);
        y.llllllIIII[14] = -(0xFFFFC6A9 & 0x7BF7) & (0xFFFFFBFB & 0x77F5);
        y.llllllIIII[15] = -(0xFFFFF329 & 0x5ED7) & (0xFFFFD7FB & 0x7B7F);
        y.llllllIIII[16] = 0x49 ^ 0x46;
        y.llllllIIII[17] = 0x5C ^ 0x6E;
        y.llllllIIII[18] = 0xC3 ^ 0x99 ^ (0xCC ^ 0x90);
        y.llllllIIII[19] = 0x3A ^ 0x76 ^ (0x20 ^ 0x6B);
        y.llllllIIII[20] = 0xC0 ^ 0xC5 ^ (0x25 ^ 0x28);
        y.llllllIIII[21] = 0xFFFFFBFD & 0xFC7;
        y.llllllIIII[22] = 0xFFFFCFFF & 0x3DBB;
        y.llllllIIII[23] = -(0xFFFFBFD9 & 0x7067) & (0xFFFFBBFE & Short.MAX_VALUE);
        y.llllllIIII[24] = 0xFFFF9DEF & 0x6FBE;
        y.llllllIIII[25] = 0x4C ^ 0x52;
        y.llllllIIII[26] = 0xD0 ^ 0x95 ^ (0x94 ^ 0xC5);
        y.llllllIIII[27] = 0xFFFFAFFF & 0x5DAF;
        y.llllllIIII[28] = 0x1B ^ 6;
        y.llllllIIII[29] = 0xB7 ^ 0xA4;
        y.llllllIIII[30] = 0xFFFFDBBF & 0x2FFF;
        y.llllllIIII[31] = 0x23 ^ 0x3B;
        y.llllllIIII[32] = -(0xFFFFF7CB & 0x7C3D) & (0xFFFFFFDB & 0x7FFD);
        y.llllllIIII[33] = -(0xFFFFE8DF & 0x5721) & (0xFFFFEFBE & 0x5DF3);
        y.llllllIIII[34] = 63 + 162 - 146 + 89 ^ 99 + 142 - 164 + 84;
        y.llllllIIII[35] = 0x60 ^ 0x6D;
        y.llllllIIII[36] = -(0xFFFFFE3B & 0x65C7) & (0xFFFFFFEF & 0x6FDF);
        y.llllllIIII[37] = 0xFFFFADB6 & 0x5FFF;
        y.llllllIIII[38] = 0xA1 ^ 0x94 ^ (0x5E ^ 0x60);
        y.llllllIIII[39] = 0xB4 ^ 0xBA;
        y.llllllIIII[40] = 104 + 65 - 103 + 71 ^ 148 + 143 - 268 + 130;
        y.llllllIIII[41] = 0x91 ^ 0x80;
        y.llllllIIII[42] = 7 ^ 0x15;
        y.llllllIIII[43] = 24 + 64 - -25 + 38 ^ 19 + 24 - 36 + 123;
        y.llllllIIII[44] = 0x3E ^ 0x28;
        y.llllllIIII[45] = 0x68 ^ 0x58 ^ (0x4C ^ 0x6B);
        y.llllllIIII[46] = 0x43 ^ 2 ^ (0xD5 ^ 0x8D);
        y.llllllIIII[47] = -(0xFFFFCF7B & 0x34A5) & (0xFFFF8FF7 & 0x7FEE);
        y.llllllIIII[48] = 0xFFFFBFFF & 0x4DBD;
        y.llllllIIII[49] = 0x56 ^ 0x6A ^ (0x43 ^ 0x65);
        y.llllllIIII[50] = 0xE8 ^ 0x8F ^ (0xEB ^ 0x97);
        y.llllllIIII[51] = 0x41 ^ 0x5D;
        y.llllllIIII[52] = -(0xFFFFFBD7 & 0x342D) & (0xFFFFFDBE & 0x3FFF);
        y.llllllIIII[53] = 0xFFFFAFE9 & 0x5BDF;
        y.llllllIIII[54] = 150 + 182 - 189 + 45 ^ 85 + 17 - 95 + 156;
        y.llllllIIII[55] = 0xFFFFBFFF & 0x4BC7;
        y.llllllIIII[56] = 0xFFFFFFFC & 0xDBB;
        y.llllllIIII[57] = 118 + 51 - 135 + 97 ^ 19 + 124 - 113 + 133;
        y.llllllIIII[58] = 0x86 ^ 0xA7;
        y.llllllIIII[59] = 44 + 78 - -16 + 23 ^ 31 + 44 - 14 + 70;
        y.llllllIIII[60] = 0x4E ^ 0x6D;
        y.llllllIIII[61] = 121 + 162 - 132 + 35 ^ 30 + 88 - 62 + 102;
        y.llllllIIII[62] = 91 + 107 - 89 + 48 ^ 87 + 7 - 90 + 180;
        y.llllllIIII[63] = 0x82 ^ 0xA4;
        y.llllllIIII[64] = -(0xFFFFE8F3 & 0x573D) & (0xFFFFEBFF & 0x5FFF);
        y.llllllIIII[65] = 0x94 ^ 0xB3;
        y.llllllIIII[66] = 0xEA ^ 0xC2;
        y.llllllIIII[67] = -(0xCA ^ 0x83) & (0xFFFFBFFF & 0x4DFF);
        y.llllllIIII[68] = 0xA8 ^ 0x81;
        y.llllllIIII[69] = 3 + 166 - 17 + 38 ^ 143 + 136 - 160 + 29;
        y.llllllIIII[70] = 0x6C ^ 0x47;
        y.llllllIIII[71] = 0xFFFFBBEE & 0x4FDD;
        y.llllllIIII[72] = 0xFFFFDFBD & 0x2DF7;
        y.llllllIIII[73] = 0x81 ^ 0xAD;
        y.llllllIIII[74] = 0x6C ^ 0x41;
        y.llllllIIII[75] = 6 ^ 0x55 ^ (0xC3 ^ 0xBE);
        y.llllllIIII[76] = 0x6A ^ 0x28 ^ (0x49 ^ 0x24);
        y.llllllIIII[77] = 0x66 ^ 0x56;
        y.llllllIIII[78] = 162 + 153 - 294 + 152 ^ 53 + 42 - 19 + 80;
        y.llllllIIII[79] = 0x19 ^ 0x4C ^ (0x73 ^ 0x15);
        y.llllllIIII[80] = 0xA2 ^ 0x96;
        y.llllllIIII[81] = 0x79 ^ 0x4C;
        y.llllllIIII[82] = 0xCB ^ 0xB6 ^ (0xD0 ^ 0x9B);
        y.llllllIIII[83] = 0xFFFFABF2 & 0x5FDF;
        y.llllllIIII[84] = 0xFFFFDDF3 & 0x2FBF;
        y.llllllIIII[85] = 0xF5 ^ 0xC2;
        y.llllllIIII[86] = 0xAB ^ 0xAF ^ (0x3D ^ 1);
        y.llllllIIII[87] = 26 + 116 - 39 + 37 ^ 48 + 124 - 153 + 162;
        y.llllllIIII[88] = 0xFFFFDBCB & 0x2FFF;
        y.llllllIIII[89] = 0xFFFFAFFE & 0x5BCF;
        y.llllllIIII[90] = 163 + 115 - 148 + 44 ^ 66 + 112 - 69 + 39;
        y.llllllIIII[91] = 0x7B ^ 0x40;
        y.llllllIIII[92] = 0x50 ^ 0x6C;
        y.llllllIIII[93] = 62 + 46 - 52 + 119 ^ 141 + 109 - 238 + 134;
        y.llllllIIII[94] = 0xFC ^ 0xC2;
        y.llllllIIII[95] = 3 ^ (0xAA ^ 0x96);
        y.llllllIIII[96] = 213 + 154 - 256 + 144 ^ 156 + 85 - 237 + 187;
        y.llllllIIII[97] = 0xD4 ^ 0x95;
        y.llllllIIII[98] = 0xFA ^ 0xB8;
        y.llllllIIII[99] = 0xCC ^ 0x8F;
        y.llllllIIII[100] = 0x63 ^ 0x27;
        y.llllllIIII[101] = 0x71 ^ 0x34;
        y.llllllIIII[102] = 74 + 56 - -89 + 35 ^ 180 + 162 - 186 + 28;
        y.llllllIIII[103] = 0x26 ^ 0x61;
        y.llllllIIII[104] = 0xD5 ^ 0xA7 ^ (0xFC ^ 0xC6);
        y.llllllIIII[105] = 0x59 ^ 0x57 ^ (0x54 ^ 0x13);
        y.llllllIIII[106] = 0x25 ^ 0x6F;
        y.llllllIIII[107] = 0xF8 ^ 0x90 ^ (0xA8 ^ 0x8B);
        y.llllllIIII[108] = 0xFFFFAFEF & 0x5BD8;
        y.llllllIIII[109] = 0xFFFFFDFF & 0xFBE;
        y.llllllIIII[110] = 0x7C ^ 0x30;
        y.llllllIIII[111] = 0x43 ^ 0xE;
        y.llllllIIII[112] = 0x4E ^ 0;
        y.llllllIIII[113] = 0x26 ^ 0x69;
        y.llllllIIII[114] = 0xE4 ^ 0xA1 ^ (0x67 ^ 0x72);
        y.llllllIIII[115] = 0xFFFF9FFE & 0x6DBD;
        y.llllllIIII[116] = 0x76 ^ 0x70 ^ (0x3A ^ 0x6D);
        y.llllllIIII[117] = 0xFA ^ 0xA8;
        y.llllllIIII[118] = 0x56 ^ 0x5D ^ (0x26 ^ 0x7E);
        y.llllllIIII[119] = 0xFFFF9FD6 & 0x6BED;
        y.llllllIIII[120] = 0x72 ^ 0x26;
        y.llllllIIII[121] = 0xAC ^ 0xA1 ^ (0x16 ^ 0x4E);
        y.llllllIIII[122] = 196 + 246 - 437 + 242 ^ 118 + 0 - 63 + 106;
        y.llllllIIII[123] = 0x14 ^ 0x43;
        y.llllllIIII[124] = -(0xFFFFF7FF & 0x7C29) & (0xFFFFFFFF & 0x7FFD);
        y.llllllIIII[125] = 90 + 205 - 258 + 202 ^ 60 + 168 - 128 + 83;
        y.llllllIIII[126] = 0xC5 ^ 0x9C;
        y.llllllIIII[127] = 0x3F ^ 0x65;
        y.llllllIIII[128] = 0x2D ^ 0x5D ^ (0x1C ^ 0x37);
        y.llllllIIII[129] = 0x62 ^ 0x3E;
        y.llllllIIII[130] = 0x5B ^ 6;
        y.llllllIIII[131] = 0xE9 ^ 0xB7;
        y.llllllIIII[132] = 0x51 ^ 0x7E ^ (0x72 ^ 2);
        y.llllllIIII[133] = 0xDB ^ 0xBB;
        y.llllllIIII[134] = 0xFFFFE6DD & 0x3FE2;
        y.llllllIIII[135] = 0xFFFF8F99 & 0x77E6;
        y.llllllIIII[136] = 0xFFFFE16F & 0x1FBC;
        y.llllllIIII[137] = 0xFFFFBFDC & 0x6EEF;
        y.llllllIIII[138] = -(0xFFFFB6EF & 0x5F57) & (0xFFFFF7EE & Short.MAX_VALUE);
        y.llllllIIII[139] = -3 & (0xFFFFC77E & 0x3FEF);
        y.llllllIIII[140] = 0x7D ^ 0x19;
        y.llllllIIII[141] = 0x8A ^ 0xB0 ^ (0x69 ^ 0x32);
        y.llllllIIII[142] = 1 + 43 - -99 + 52 ^ 54 + 40 - 29 + 96;
        y.llllllIIII[143] = 202 + 107 - 109 + 11 ^ 50 + 87 - 78 + 117;
        y.llllllIIII[144] = 0x6D ^ 8;
        y.llllllIIII[145] = 0x3E ^ 0x58;
        y.llllllIIII[146] = 0x4E ^ 0x5B ^ (0xB7 ^ 0xC5);
        y.llllllIIII[147] = 0xC ^ 0x64;
        y.llllllIIII[148] = 0xE1 ^ 0x88;
        y.llllllIIII[149] = 0xD4 ^ 0xBE;
        y.llllllIIII[150] = 0x53 ^ 2 ^ (0 ^ 0x3A);
        y.llllllIIII[151] = 0x76 ^ 2 ^ (0x82 ^ 0x9A);
        y.llllllIIII[152] = 0x68 ^ 5;
        y.llllllIIII[153] = 0x5C ^ 0x32;
        y.llllllIIII[154] = (0x64 ^ 0x40) + (0xF9 ^ 0xA9) - (0x82 ^ 0x89) + (0x9C ^ 0x85);
        y.llllllIIII[155] = 0xFFFFDBEF & 0x2F9E;
        y.llllllIIII[156] = 0xFFFFBFAD & 0x4D5E;
        y.llllllIIII[157] = 0xFFFF8DFD & 0x7FBB;
        y.llllllIIII[158] = 179 + 171 - 186 + 28 ^ 42 + 54 - 45 + 124;
        y.llllllIIII[159] = 0x4D ^ 0x3D;
        y.llllllIIII[160] = 0xC8 ^ 0xC1 ^ (0x1D ^ 0x65);
        y.llllllIIII[161] = 0xD ^ 0x7F;
        y.llllllIIII[162] = 0x17 ^ 0x3B ^ (0xC ^ 0x53);
    }

    private static int llIlIlIllIlIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean llIlIlIllllIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llIlIlIllllll(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean aa() {
        void lllllllllllllllllIlIIlIIIIIIlIII;
        int[] nArray = new int[llllllIIII[7]];
        nArray[y.llllllIIII[1]] = llllllIIII[8];
        nArray[y.llllllIIII[0]] = llllllIIII[9];
        nArray[y.llllllIIII[3]] = llllllIIII[10];
        nArray[y.llllllIIII[5]] = llllllIIII[11];
        nArray[y.llllllIIII[6]] = llllllIIII[12];
        int[] nArray2 = nArray;
        int lllllllllllllllllIlIIlIIIIIIIlll = llllllIIII[1];
        while (y.llIlIlIllIlll(lllllllllllllllllIlIIlIIIIIIIlll, ((void)lllllllllllllllllIlIIlIIIIIIlIII).length)) {
            int[] nArray3 = new int[llllllIIII[0]];
            nArray3[y.llllllIIII[1]] = lllllllllllllllllIlIIlIIIIIIlIII[lllllllllllllllllIlIIlIIIIIIIlll];
            if (y.llIlIlIlllIII(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return llllllIIII[1];
            }
            ++lllllllllllllllllIlIIlIIIIIIIlll;
            0;
            if (2 > 0) continue;
            return ((182 + 162 - 328 + 192 ^ 25 + 104 - 104 + 109) & (60 + 137 - 30 + 64 ^ 37 + 52 - 47 + 135 ^ -1)) != 0;
        }
        return llllllIIII[0];
    }

    @Override
    public int T() {
        try {
            y.bS();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (3 < 2) {
            return (0xC3 ^ 0x8E) & ~(0xF0 ^ 0xBD);
        }
        return llllllIIII[140];
    }

    @Override
    public String U() {
        return lllllIllII[llllllIIII[141]];
    }

    private static boolean llIlIlIllllII(int n2) {
        return n2 < 0;
    }

    private static boolean llIlIllIIIIIl(Object object) {
        return object == null;
    }

    private static boolean llIlIlIllIlll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIlIlIllIllI(int n2) {
        return n2 != 0;
    }

    private static void llIlIlIllIIll() {
        lllllIllII = new String[llllllIIII[162]];
        y.lllllIllII[y.llllllIIII[1]] = y."Finished buying items, switching back to quest";
        y.lllllIllII[y.llllllIIII[0]] = y."Need 12 QP";
        y.lllllIllII[y.llllllIIII[3]] = y."Nav to bank";
        y.lllllIllII[y.llllllIIII[5]] = y."Handling banking";
        y.lllllIllII[y.llllllIIII[6]] = y."We are missing quest supplies, switching to BUYING";
        y.lllllIllII[y.llllllIIII[7]] = y."Drink";
        y.lllllIllII[y.llllllIIII[18]] = y."Eat";
        y.lllllIllII[y.llllllIIII[19]] = y."Nav to start";
        y.lllllIllII[y.llllllIIII[20]] = y."Sir Amik Varze";
        y.lllllIllII[y.llllllIIII[34]] = y."Nav to fortress";
        y.lllllIllII[y.llllllIIII[13]] = y."Bronze med helm";
        y.lllllIllII[y.llllllIIII[38]] = y."Iron chainbody";
        y.lllllIllII[y.llllllIIII[2]] = y."Bronze med helm";
        y.lllllIllII[y.llllllIIII[35]] = y."Bronze med helm";
        y.lllllIllII[y.llllllIIII[39]] = y."Wear";
        y.lllllIllII[y.llllllIIII[16]] = y."Iron chainbody";
        y.lllllIllII[y.llllllIIII[40]] = y."Iron chainbody";
        y.lllllIllII[y.llllllIIII[41]] = y."Wear";
        y.lllllIllII[y.llllllIIII[42]] = y."Drink";
        y.lllllIllII[y.llllllIIII[29]] = y."Bronze med helm";
        y.lllllIllII[y.llllllIIII[26]] = y."Iron chainbody";
        y.lllllIllII[y.llllllIIII[43]] = y."Sturdy door";
        y.lllllIllII[y.llllllIIII[44]] = y."Open";
        y.lllllIllII[y.llllllIIII[45]] = y."Push wall";
        y.lllllIllII[y.llllllIIII[31]] = y."Wall";
        y.lllllIllII[y.llllllIIII[46]] = y."Push";
        y.lllllIllII[y.llllllIIII[49]] = y."Climb up first ladder";
        y.lllllIllII[y.llllllIIII[50]] = y."Climb-up";
        y.lllllIllII[y.llllllIIII[51]] = y."Climb up 2nd ladder";
        y.lllllIllII[y.llllllIIII[28]] = y."Climb-up";
        y.lllllIllII[y.llllllIIII[25]] = y."Climb down 1st ladder";
        y.lllllIllII[y.llllllIIII[54]] = y."Climb-down";
        y.lllllIllII[y.llllllIIII[57]] = y."Handle door and ladder up";
        y.lllllIllII[y.llllllIIII[58]] = y."Door";
        y.lllllIllII[y.llllllIIII[59]] = y."Open";
        y.lllllIllII[y.llllllIIII[60]] = y."Door";
        y.lllllIllII[y.llllllIIII[61]] = y."Open";
        y.lllllIllII[y.llllllIIII[62]] = y."Door";
        y.lllllIllII[y.llllllIIII[63]] = y."Open";
        y.lllllIllII[y.llllllIIII[65]] = y."Ladder";
        y.lllllIllII[y.llllllIIII[66]] = y."Climb-up";
        y.lllllIllII[y.llllllIIII[68]] = y."Climb down second ladder";
        y.lllllIllII[y.llllllIIII[69]] = y."Ladder";
        y.lllllIllII[y.llllllIIII[70]] = y."Climb-down";
        y.lllllIllII[y.llllllIIII[73]] = y."Sturdy door";
        y.lllllIllII[y.llllllIIII[74]] = y."Open";
        y.lllllIllII[y.llllllIIII[75]] = y."Sturdy door";
        y.lllllIllII[y.llllllIIII[76]] = y."Open";
        y.lllllIllII[y.llllllIIII[77]] = y."Sturdy door";
        y.lllllIllII[y.llllllIIII[78]] = y."Open";
        y.lllllIllII[y.llllllIIII[17]] = y."Sturdy door";
        y.lllllIllII[y.llllllIIII[79]] = y."Open";
        y.lllllIllII[y.llllllIIII[80]] = y."Climb-down";
        y.lllllIllII[y.llllllIIII[81]] = y."Grill";
        y.lllllIllII[y.llllllIIII[82]] = y."Listen-at";
        y.lllllIllII[y.llllllIIII[85]] = y."Ladder up 1";
        y.lllllIllII[y.llllllIIII[86]] = y."Ladder";
        y.lllllIllII[y.llllllIIII[87]] = y."Climb-up";
        y.lllllIllII[y.llllllIIII[90]] = y."Door 1";
        y.lllllIllII[y.llllllIIII[91]] = y."Sturdy door";
        y.lllllIllII[y.llllllIIII[92]] = y."Open";
        y.lllllIllII[y.llllllIIII[93]] = y."ladder up 2";
        y.lllllIllII[y.llllllIIII[94]] = y."Ladder";
        y.lllllIllII[y.llllllIIII[95]] = y."Climb-up";
        y.lllllIllII[y.llllllIIII[96]] = y."Walk to ladder down 1 tile";
        y.lllllIllII[y.llllllIIII[97]] = y."Climb down 1";
        y.lllllIllII[y.llllllIIII[98]] = y."Ladder";
        y.lllllIllII[y.llllllIIII[99]] = y."Climb-down";
        y.lllllIllII[y.llllllIIII[100]] = y."Door";
        y.lllllIllII[y.llllllIIII[101]] = y."Open";
        y.lllllIllII[y.llllllIIII[102]] = y."Door";
        y.lllllIllII[y.llllllIIII[103]] = y."Open";
        y.lllllIllII[y.llllllIIII[104]] = y."Ladder";
        y.lllllIllII[y.llllllIIII[105]] = y."Open";
        y.lllllIllII[y.llllllIIII[106]] = y."Ladder";
        y.lllllIllII[y.llllllIIII[107]] = y."Climb-up";
        y.lllllIllII[y.llllllIIII[110]] = y."Ladder";
        y.lllllIllII[y.llllllIIII[111]] = y."Climb-down";
        y.lllllIllII[y.llllllIIII[112]] = y."Climb-down";
        y.lllllIllII[y.llllllIIII[113]] = y."Wall";
        y.lllllIllII[y.llllllIIII[114]] = y."Push";
        y.lllllIllII[y.llllllIIII[116]] = y."Door";
        y.lllllIllII[y.llllllIIII[117]] = y."Open";
        y.lllllIllII[y.llllllIIII[118]] = y."Luring knight";
        y.lllllIllII[y.llllllIIII[120]] = y."Door";
        y.lllllIllII[y.llllllIIII[121]] = y."Open";
        y.lllllIllII[y.llllllIIII[122]] = y."Ladder";
        y.lllllIllII[y.llllllIIII[123]] = y."Climb-up";
        y.lllllIllII[y.llllllIIII[125]] = y."Drink";
        y.lllllIllII[y.llllllIIII[126]] = y."Wall";
        y.lllllIllII[y.llllllIIII[127]] = y."Push";
        y.lllllIllII[y.llllllIIII[128]] = y."Cabbage";
        y.lllllIllII[y.llllllIIII[129]] = y."Cabbage";
        y.lllllIllII[y.llllllIIII[130]] = y."Hole";
        y.lllllIllII[y.llllllIIII[131]] = y."Break";
        y.lllllIllII[y.llllllIIII[132]] = y."Nav to start";
        y.lllllIllII[y.llllllIIII[133]] = y."Sir Amik Varze";
        y.lllllIllII[y.llllllIIII[141]] = y."Black Knights Fortress";
        y.lllllIllII[y.llllllIIII[142]] = y."ring of wealth (";
        y.lllllIllII[y.llllllIIII[143]] = y."Knight";
        y.lllllIllII[y.llllllIIII[140]] = y."Knight";
        y.lllllIllII[y.llllllIIII[144]] = y."ladder";
        y.lllllIllII[y.llllllIIII[145]] = y."Climb-down";
        y.lllllIllII[y.llllllIIII[146]] = y."Ladder";
        y.lllllIllII[y.llllllIIII[147]] = y."Climb-down";
        y.lllllIllII[y.llllllIIII[148]] = y."ladder";
        y.lllllIllII[y.llllllIIII[149]] = y."Climb-down";
        y.lllllIllII[y.llllllIIII[150]] = y."ladder";
        y.lllllIllII[y.llllllIIII[151]] = y."Climb-up";
        y.lllllIllII[y.llllllIIII[152]] = y."ladder";
        y.lllllIllII[y.llllllIIII[153]] = y."Climb-up";
        y.lllllIllII[y.llllllIIII[158]] = y."Yes.";
        y.lllllIllII[y.llllllIIII[159]] = y."I seek a quest!";
        y.lllllIllII[y.llllllIIII[160]] = y."I laugh in the face of danger!";
        y.lllllIllII[y.llllllIIII[161]] = y."I don't care. I'm going in anyway.";
    }

    private static void ae() {
        block19: {
            d lllllllllllllllllIlIIlIIIIIIIIll;
            block18: {
                Object lllllllllllllllllIlIIlIIIIIIIlII;
                block17: {
                    block16: {
                        block15: {
                            block14: {
                                int[] nArray = new int[llllllIIII[0]];
                                nArray[y.llllllIIII[1]] = llllllIIII[11];
                                if (y.llIlIlIlllIII(Bank.contains((int[])nArray) ? 1 : 0)) {
                                    d d2 = new d(llllllIIII[11], llllllIIII[0], llllllIIII[134]);
                                    bu.add(d2);
                                    0;
                                }
                                int[] nArray2 = new int[llllllIIII[0]];
                                nArray2[y.llllllIIII[1]] = llllllIIII[10];
                                if (y.llIlIlIlllIII(Bank.contains((int[])nArray2) ? 1 : 0)) {
                                    lllllllllllllllllIlIIlIIIIIIIlII = new d(llllllIIII[10], llllllIIII[0], llllllIIII[134]);
                                    bu.add((d)lllllllllllllllllIlIIlIIIIIIIlII);
                                    0;
                                }
                                int[] nArray3 = new int[llllllIIII[0]];
                                nArray3[y.llllllIIII[1]] = llllllIIII[12];
                                if (y.llIlIlIlllIII(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                    lllllllllllllllllIlIIlIIIIIIIlII = new d(llllllIIII[12], llllllIIII[0], llllllIIII[134]);
                                    bu.add((d)lllllllllllllllllIlIIlIIIIIIIlII);
                                    0;
                                }
                                int[] nArray4 = new int[llllllIIII[0]];
                                nArray4[y.llllllIIII[1]] = llllllIIII[9];
                                if (!y.llIlIlIllIllI(Bank.contains((int[])nArray4) ? 1 : 0)) break block14;
                                int[] nArray5 = new int[llllllIIII[0]];
                                nArray5[y.llllllIIII[1]] = llllllIIII[9];
                                if (!y.llIlIlIllIllI(Bank.contains((int[])nArray5) ? 1 : 0)) break block15;
                                int[] nArray6 = new int[llllllIIII[0]];
                                nArray6[y.llllllIIII[1]] = llllllIIII[9];
                                if (!y.llIlIlIllIlll(Bank.getFirst((int[])nArray6).getQuantity(), llllllIIII[7])) break block15;
                            }
                            lllllllllllllllllIlIIlIIIIIIIlII = new d(llllllIIII[9], llllllIIII[13], llllllIIII[135]);
                            bu.add((d)lllllllllllllllllIlIIlIIIIIIIlII);
                            0;
                        }
                        int[] nArray = new int[llllllIIII[0]];
                        nArray[y.llllllIIII[1]] = llllllIIII[15];
                        if (!y.llIlIlIllIllI(Bank.contains((int[])nArray) ? 1 : 0)) break block16;
                        int[] nArray7 = new int[llllllIIII[0]];
                        nArray7[y.llllllIIII[1]] = llllllIIII[15];
                        if (!y.llIlIlIllIllI(Bank.contains((int[])nArray7) ? 1 : 0)) break block17;
                        int[] nArray8 = new int[llllllIIII[0]];
                        nArray8[y.llllllIIII[1]] = llllllIIII[15];
                        if (!y.llIlIlIllIlll(Bank.getFirst((int[])nArray8).getQuantity(), llllllIIII[7])) break block17;
                    }
                    lllllllllllllllllIlIIlIIIIIIIlII = new d(llllllIIII[15], llllllIIII[13], llllllIIII[136]);
                    bu.add((d)lllllllllllllllllIlIIlIIIIIIIlII);
                    0;
                }
                if (y.llIlIlIlllIII(Bank.contains((Predicate)(lllllllllllllllllIlIIlIIIIIIIlII = item -> item.getName().toLowerCase().contains(lllllIllII[llllllIIII[142]]))) ? 1 : 0)) {
                    lllllllllllllllllIlIIlIIIIIIIIll = new d(llllllIIII[137], llllllIIII[7], llllllIIII[138]);
                    bu.add(lllllllllllllllllIlIIlIIIIIIIIll);
                    0;
                }
                int[] nArray = new int[llllllIIII[0]];
                nArray[y.llllllIIII[1]] = llllllIIII[14];
                if (y.llIlIlIlllIII(Bank.contains((int[])nArray) ? 1 : 0)) {
                    lllllllllllllllllIlIIlIIIIIIIIll = new d(llllllIIII[14], llllllIIII[6], i.bp);
                    bu.add(lllllllllllllllllIlIIlIIIIIIIIll);
                    0;
                }
                int[] nArray9 = new int[llllllIIII[0]];
                nArray9[y.llllllIIII[1]] = llllllIIII[8];
                if (!y.llIlIlIllIllI(Bank.contains((int[])nArray9) ? 1 : 0)) break block18;
                int[] nArray10 = new int[llllllIIII[0]];
                nArray10[y.llllllIIII[1]] = llllllIIII[8];
                if (!y.llIlIlIllIllI(Bank.contains((int[])nArray10) ? 1 : 0)) break block19;
                int[] nArray11 = new int[llllllIIII[0]];
                nArray11[y.llllllIIII[1]] = llllllIIII[8];
                if (!y.llIlIlIllIlll(Bank.getFirst((int[])nArray11).getQuantity(), llllllIIII[16])) break block19;
            }
            lllllllllllllllllIlIIlIIIIIIIIll = new d(llllllIIII[8], llllllIIII[66], llllllIIII[139]);
            bu.add(lllllllllllllllllIlIIlIIIIIIIIll);
            0;
        }
    }

    private static boolean llIlIlIlllIIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIlIlIlllIlI(Object object) {
        return object != null;
    }

    public static void bS() {
        block81: {
            WorldPoint lllllllllllllllllIlIIlIIIIIlIIlI;
            TileObject lllllllllllllllllIlIIlIIIIIlIIll;
            WorldArea lllllllllllllllllIlIIlIIIIIlIlII;
            WorldArea lllllllllllllllllIlIIlIIIIIlIlIl;
            WorldArea lllllllllllllllllIlIIlIIIIIlIllI;
            WorldArea lllllllllllllllllIlIIlIIIIIlIlll;
            WorldArea lllllllllllllllllIlIIlIIIIIllIII;
            WorldArea lllllllllllllllllIlIIlIIIIIllIIl;
            WorldArea lllllllllllllllllIlIIlIIIIIllIlI;
            BankLocation lllllllllllllllllIlIIlIIIIIllIll;
            block82: {
                WorldArea lllllllllllllllllIlIIlIIIIIlIIII;
                WorldArea lllllllllllllllllIlIIlIIIIIlIIIl;
                block83: {
                    block85: {
                        block84: {
                            if (y.llIlIlIllIllI(bs ? 1 : 0)) {
                                b.a(bu);
                                if (y.llIlIlIllIlll(bu.size(), llllllIIII[0])) {
                                    System.out.println(lllllIllII[llllllIIII[1]]);
                                    bs = llllllIIII[1];
                                }
                            }
                            if (!y.llIlIlIlllIII(bs ? 1 : 0)) break block81;
                            if (y.llIlIlIllIlll(e.H(), llllllIIII[2])) {
                                System.out.println(lllllIllII[llllllIIII[0]]);
                                AccBuilderTempleTrek.d = llllllIIII[0];
                                return;
                            }
                            if (y.llIlIlIlllIII(y.aa() ? 1 : 0) && y.llIlIlIllIlll(e.j(gp), llllllIIII[0]) && y.llIlIlIlllIIl(e.H(), llllllIIII[2])) {
                                lllllllllllllllllIlIIlIIIIIllIll = BankLocation.getNearest();
                                if (y.llIlIlIlllIlI(lllllllllllllllllIlIIlIIIIIllIll) && y.llIlIlIlllIII(lllllllllllllllllIlIIlIIIIIllIll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderTempleTrek.c = lllllIllII[llllllIIII[3]];
                                    a.a(lllllllllllllllllIlIIlIIIIIllIll);
                                }
                                if (y.llIlIlIlllIlI(lllllllllllllllllIlIIlIIIIIllIll) && y.llIlIlIllIllI(lllllllllllllllllIlIIlIIIIIllIll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (y.llIlIlIlllIII(Bank.isOpen() ? 1 : 0)) {
                                        a.a();
                                        Time.sleepUntil(() -> Bank.isOpen(), (int)llllllIIII[4]);
                                        0;
                                    }
                                    if (y.llIlIlIllIllI(Bank.isOpen() ? 1 : 0)) {
                                        AccBuilderTempleTrek.c = lllllIllII[llllllIIII[5]];
                                        if (y.llIlIlIlllIll(Inventory.getAll().size())) {
                                            Bank.depositInventory();
                                            Time.sleepTicks((int)llllllIIII[6]);
                                            0;
                                        }
                                        if (y.llIlIlIlllIll(Equipment.getAll().size())) {
                                            Bank.depositEquipment();
                                            Time.sleepTicks((int)llllllIIII[3]);
                                            0;
                                        }
                                        int[] nArray = new int[llllllIIII[7]];
                                        nArray[y.llllllIIII[1]] = llllllIIII[8];
                                        nArray[y.llllllIIII[0]] = llllllIIII[9];
                                        nArray[y.llllllIIII[3]] = llllllIIII[10];
                                        nArray[y.llllllIIII[5]] = llllllIIII[11];
                                        nArray[y.llllllIIII[6]] = llllllIIII[12];
                                        if (y.llIlIlIlllIII(e.b(nArray) ? 1 : 0)) {
                                            y.ae();
                                            System.out.println(lllllIllII[llllllIIII[6]]);
                                            bs = llllllIIII[0];
                                            return;
                                        }
                                        int[] nArray2 = new int[llllllIIII[7]];
                                        nArray2[y.llllllIIII[1]] = llllllIIII[8];
                                        nArray2[y.llllllIIII[0]] = llllllIIII[9];
                                        nArray2[y.llllllIIII[3]] = llllllIIII[10];
                                        nArray2[y.llllllIIII[5]] = llllllIIII[11];
                                        nArray2[y.llllllIIII[6]] = llllllIIII[12];
                                        if (y.llIlIlIllIllI(e.b(nArray2) ? 1 : 0)) {
                                            a.a(llllllIIII[8], llllllIIII[13]);
                                            a.a(llllllIIII[9], llllllIIII[13]);
                                            a.a(llllllIIII[10], llllllIIII[0]);
                                            a.a(llllllIIII[11], llllllIIII[0]);
                                            a.a(llllllIIII[12], llllllIIII[0]);
                                            a.a(llllllIIII[14], llllllIIII[0]);
                                            a.a(llllllIIII[15], llllllIIII[16]);
                                        }
                                    }
                                }
                            }
                            if (y.llIlIlIllIllI(Inventory.contains((int[])f.aU) ? 1 : 0) && y.llIlIlIllIlll(Movement.getRunEnergy(), llllllIIII[17])) {
                                Inventory.getFirst((int[])f.aU).interact(lllllIllII[llllllIIII[7]]);
                                Time.sleepTicks((int)llllllIIII[0]);
                                0;
                            }
                            int[] nArray = new int[llllllIIII[0]];
                            nArray[y.llllllIIII[1]] = llllllIIII[15];
                            if (y.llIlIlIllIllI(Inventory.contains((int[])nArray) ? 1 : 0) && y.llIlIlIllllII(y.llIlIlIllIlIl(e.u(), 50.0))) {
                                int[] nArray3 = new int[llllllIIII[0]];
                                nArray3[y.llllllIIII[1]] = llllllIIII[15];
                                Inventory.getFirst((int[])nArray3).interact(lllllIllII[llllllIIII[18]]);
                                Time.sleepTicks((int)llllllIIII[3]);
                                0;
                            }
                            if (y.llIlIlIllIllI(y.aa() ? 1 : 0) && y.llIlIlIlllIII(e.j(gp))) {
                                if (!y.llIlIlIllllIl(Players.getLocal().getWorldLocation().distanceTo(gf), llllllIIII[7]) || y.llIlIlIlllllI(Players.getLocal().getWorldLocation().getPlane(), llllllIIII[3])) {
                                    AccBuilderTempleTrek.c = lllllIllII[llllllIIII[19]];
                                    if (y.llIlIlIllIllI(Dialog.isOpen() ? 1 : 0)) {
                                        Dialog.close();
                                    }
                                    Movement.walkTo((WorldPoint)gf);
                                    0;
                                    Time.sleepTicks((int)llllllIIII[0]);
                                    0;
                                }
                                if (y.llIlIlIllllIl(Players.getLocal().getWorldLocation().distanceTo(gf), llllllIIII[7])) {
                                    g.a(lllllIllII[llllllIIII[20]], bQ);
                                }
                            }
                            if (!y.llIlIlIllllll(e.j(gp), llllllIIII[0])) break block82;
                            ck = llllllIIII[1];
                            lllllllllllllllllIlIIlIIIIIllIll = new WorldArea(llllllIIII[21], llllllIIII[22], llllllIIII[18], llllllIIII[3], llllllIIII[1]);
                            lllllllllllllllllIlIIlIIIIIllIlI = new WorldArea(llllllIIII[23], llllllIIII[24], llllllIIII[25], llllllIIII[26], llllllIIII[0]);
                            lllllllllllllllllIlIIlIIIIIllIIl = new WorldArea(llllllIIII[23], llllllIIII[27], llllllIIII[28], llllllIIII[29], llllllIIII[3]);
                            lllllllllllllllllIlIIlIIIIIllIII = new WorldArea(llllllIIII[30], llllllIIII[22], llllllIIII[31], llllllIIII[18], llllllIIII[1]);
                            lllllllllllllllllIlIIlIIIIIlIlll = new WorldArea(llllllIIII[32], llllllIIII[33], llllllIIII[34], llllllIIII[35], llllllIIII[1]);
                            lllllllllllllllllIlIIlIIIIIlIllI = new WorldArea(llllllIIII[36], llllllIIII[37], llllllIIII[38], llllllIIII[34], llllllIIII[1]);
                            if (!y.llIlIlIlllIII(lllllllllllllllllIlIIlIIIIIllIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !y.llIlIlIlllIII(lllllllllllllllllIlIIlIIIIIllIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !y.llIlIlIlllIII(lllllllllllllllllIlIIlIIIIIllIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !y.llIlIlIlllIII(lllllllllllllllllIlIIlIIIIIllIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !y.llIlIlIlllIII(lllllllllllllllllIlIIlIIIIIlIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !y.llIlIlIlllIII(lllllllllllllllllIlIIlIIIIIlIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block83;
                            if (y.llIlIllIIIIII(Players.getLocal().getWorldLocation().distanceTo(gq), llllllIIII[3])) {
                                AccBuilderTempleTrek.c = lllllIllII[llllllIIII[34]];
                                e.C();
                                Movement.walkTo((WorldPoint)gq);
                                0;
                                Time.sleepTicks((int)llllllIIII[0]);
                                0;
                            }
                            if (!y.llIlIlIllllIl(Players.getLocal().getWorldLocation().distanceTo(gq), llllllIIII[3])) break block83;
                            String[] stringArray = new String[llllllIIII[0]];
                            stringArray[y.llllllIIII[1]] = lllllIllII[llllllIIII[13]];
                            if (!y.llIlIlIllIllI(Equipment.contains((String[])stringArray) ? 1 : 0)) break block84;
                            String[] stringArray2 = new String[llllllIIII[0]];
                            stringArray2[y.llllllIIII[1]] = lllllIllII[llllllIIII[38]];
                            if (!y.llIlIlIlllIII(Equipment.contains((String[])stringArray2) ? 1 : 0)) break block85;
                        }
                        String[] stringArray = new String[llllllIIII[0]];
                        stringArray[y.llllllIIII[1]] = lllllIllII[llllllIIII[2]];
                        if (y.llIlIlIllIllI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                            String[] stringArray3 = new String[llllllIIII[0]];
                            stringArray3[y.llllllIIII[1]] = lllllIllII[llllllIIII[35]];
                            Inventory.getFirst((String[])stringArray3).interact(lllllIllII[llllllIIII[39]]);
                        }
                        String[] stringArray4 = new String[llllllIIII[0]];
                        stringArray4[y.llllllIIII[1]] = lllllIllII[llllllIIII[16]];
                        if (y.llIlIlIllIllI(Inventory.contains((String[])stringArray4) ? 1 : 0)) {
                            String[] stringArray5 = new String[llllllIIII[0]];
                            stringArray5[y.llllllIIII[1]] = lllllIllII[llllllIIII[40]];
                            Inventory.getFirst((String[])stringArray5).interact(lllllIllII[llllllIIII[41]]);
                        }
                    }
                    if (y.llIlIlIllIllI(Inventory.contains((int[])f.aU) ? 1 : 0)) {
                        Inventory.getFirst((int[])f.aU).interact(lllllIllII[llllllIIII[42]]);
                    }
                    String[] stringArray = new String[llllllIIII[0]];
                    stringArray[y.llllllIIII[1]] = lllllIllII[llllllIIII[29]];
                    if (y.llIlIlIllIllI(Equipment.contains((String[])stringArray) ? 1 : 0)) {
                        String[] stringArray6 = new String[llllllIIII[0]];
                        stringArray6[y.llllllIIII[1]] = lllllIllII[llllllIIII[26]];
                        if (y.llIlIlIllIllI(Equipment.contains((String[])stringArray6) ? 1 : 0)) {
                            String[] stringArray7 = new String[llllllIIII[0]];
                            stringArray7[y.llllllIIII[1]] = lllllIllII[llllllIIII[43]];
                            TileObjects.getNearest((String[])stringArray7).interact(lllllIllII[llllllIIII[44]]);
                            Time.sleepTicks((int)llllllIIII[6]);
                            0;
                        }
                    }
                }
                if (y.llIlIlIllIllI(lllllllllllllllllIlIIlIIIIIllIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllllIllII[llllllIIII[45]];
                    String[] stringArray = new String[llllllIIII[0]];
                    stringArray[y.llllllIIII[1]] = lllllIllII[llllllIIII[31]];
                    TileObjects.getNearest((String[])stringArray).interact(lllllIllII[llllllIIII[46]]);
                    Time.sleepTicks((int)llllllIIII[3]);
                    0;
                }
                lllllllllllllllllIlIIlIIIIIlIlIl = new WorldArea(llllllIIII[47], llllllIIII[48], llllllIIII[6], llllllIIII[5], llllllIIII[1]);
                lllllllllllllllllIlIIlIIIIIlIlII = new WorldArea(llllllIIII[47], llllllIIII[48], llllllIIII[6], llllllIIII[5], llllllIIII[0]);
                if (y.llIlIlIllIllI(lllllllllllllllllIlIIlIIIIIlIlIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllllIllII[llllllIIII[49]];
                    lllllllllllllllllIlIIlIIIIIlIIll = TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (y.llIlIlIllIllI(tileObject.getName().equalsIgnoreCase(lllllIllII[llllllIIII[152]]) ? 1 : 0)) {
                            String[] stringArray = new String[llllllIIII[0]];
                            stringArray[y.llllllIIII[1]] = lllllIllII[llllllIIII[153]];
                            if (y.llIlIlIllIllI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                n2 = llllllIIII[0];
                                0;
                                if (((0xB5 ^ 0x9D) & ~(0x91 ^ 0xB9)) == 0) return n2 != 0;
                                return ((0x47 ^ 0x7F) & ~(0xF ^ 0x37)) != 0;
                            }
                        }
                        n2 = llllllIIII[1];
                        return n2 != 0;
                    });
                    lllllllllllllllllIlIIlIIIIIlIIll.interact(lllllIllII[llllllIIII[50]]);
                    Time.sleepTicks((int)llllllIIII[3]);
                    0;
                }
                if (y.llIlIlIllIllI(lllllllllllllllllIlIIlIIIIIlIlII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllllIllII[llllllIIII[51]];
                    lllllllllllllllllIlIIlIIIIIlIIll = TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (y.llIlIlIllIllI(tileObject.getName().equalsIgnoreCase(lllllIllII[llllllIIII[150]]) ? 1 : 0)) {
                            String[] stringArray = new String[llllllIIII[0]];
                            stringArray[y.llllllIIII[1]] = lllllIllII[llllllIIII[151]];
                            if (y.llIlIlIllIllI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                n2 = llllllIIII[0];
                                0;
                                if (((0xE1 ^ 0xC4) & ~(0x4B ^ 0x6E)) == 0) return n2 != 0;
                                return ((0x69 ^ 0x28) & ~(0xFC ^ 0xBD)) != 0;
                            }
                        }
                        n2 = llllllIIII[1];
                        return n2 != 0;
                    });
                    lllllllllllllllllIlIIlIIIIIlIIll.interact(lllllIllII[llllllIIII[28]]);
                    Time.sleepTicks((int)llllllIIII[3]);
                    0;
                }
                lllllllllllllllllIlIIlIIIIIlIIll = new WorldArea(llllllIIII[21], llllllIIII[52], llllllIIII[18], llllllIIII[18], llllllIIII[3]);
                lllllllllllllllllIlIIlIIIIIlIIlI = new WorldPoint(llllllIIII[53], llllllIIII[22], llllllIIII[3]);
                if (y.llIlIlIllIllI(lllllllllllllllllIlIIlIIIIIlIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllllIllII[llllllIIII[25]];
                    if (y.llIlIllIIIIII(Players.getLocal().getWorldLocation().distanceTo(lllllllllllllllllIlIIlIIIIIlIIlI), llllllIIII[0])) {
                        Movement.walkTo((WorldPoint)lllllllllllllllllIlIIlIIIIIlIIlI);
                        0;
                        Time.sleepTicks((int)llllllIIII[0]);
                        0;
                    }
                    if (y.llIlIlIllllIl(Players.getLocal().getWorldLocation().distanceTo(lllllllllllllllllIlIIlIIIIIlIIlI), llllllIIII[0])) {
                        lllllllllllllllllIlIIlIIIIIlIIIl = TileObjects.getNearest(tileObject -> {
                            int n2;
                            if (y.llIlIlIllIllI(tileObject.getName().equalsIgnoreCase(lllllIllII[llllllIIII[148]]) ? 1 : 0)) {
                                String[] stringArray = new String[llllllIIII[0]];
                                stringArray[y.llllllIIII[1]] = lllllIllII[llllllIIII[149]];
                                if (y.llIlIlIllIllI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                    n2 = llllllIIII[0];
                                    0;
                                    if (-(0x10 ^ 0x14) < 0) return n2 != 0;
                                    return ((0x77 ^ 0x79) & ~(0xBA ^ 0xB4)) != 0;
                                }
                            }
                            n2 = llllllIIII[1];
                            return n2 != 0;
                        });
                        lllllllllllllllllIlIIlIIIIIlIIIl.interact(lllllIllII[llllllIIII[54]]);
                        Time.sleepTicks((int)llllllIIII[3]);
                        0;
                    }
                }
                if (y.llIlIlIllIllI((lllllllllllllllllIlIIlIIIIIlIIIl = new WorldArea(llllllIIII[55], llllllIIII[56], llllllIIII[13], llllllIIII[7], llllllIIII[0])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllllIllII[llllllIIII[57]];
                    String[] stringArray = new String[llllllIIII[0]];
                    stringArray[y.llllllIIII[1]] = lllllIllII[llllllIIII[58]];
                    String[] stringArray8 = new String[llllllIIII[0]];
                    stringArray8[y.llllllIIII[1]] = lllllIllII[llllllIIII[59]];
                    if (y.llIlIlIllIllI(TileObjects.getNearest((String[])stringArray).hasAction(stringArray8) ? 1 : 0)) {
                        String[] stringArray9 = new String[llllllIIII[0]];
                        stringArray9[y.llllllIIII[1]] = lllllIllII[llllllIIII[60]];
                        TileObjects.getNearest((String[])stringArray9).interact(lllllIllII[llllllIIII[61]]);
                        Time.sleepTicks((int)llllllIIII[5]);
                        0;
                    }
                    String[] stringArray10 = new String[llllllIIII[0]];
                    stringArray10[y.llllllIIII[1]] = lllllIllII[llllllIIII[62]];
                    String[] stringArray11 = new String[llllllIIII[0]];
                    stringArray11[y.llllllIIII[1]] = lllllIllII[llllllIIII[63]];
                    if (y.llIlIlIlllIII(TileObjects.getNearest((String[])stringArray10).hasAction(stringArray11) ? 1 : 0)) {
                        if (y.llIlIllIIIIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllllIIII[64], llllllIIII[52], llllllIIII[0])), llllllIIII[3])) {
                            Movement.walkTo((WorldPoint)new WorldPoint(llllllIIII[64], llllllIIII[52], llllllIIII[0]));
                            0;
                            Time.sleepTicks((int)llllllIIII[0]);
                            0;
                        }
                        if (y.llIlIlIllllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllllIIII[64], llllllIIII[52], llllllIIII[0])), llllllIIII[3])) {
                            String[] stringArray12 = new String[llllllIIII[0]];
                            stringArray12[y.llllllIIII[1]] = lllllIllII[llllllIIII[65]];
                            TileObjects.getNearest((String[])stringArray12).interact(lllllIllII[llllllIIII[66]]);
                            Time.sleepTicks((int)llllllIIII[3]);
                            0;
                        }
                    }
                }
                if (y.llIlIlIllIllI((lllllllllllllllllIlIIlIIIIIlIIII = new WorldArea(llllllIIII[36], llllllIIII[67], llllllIIII[19], llllllIIII[18], llllllIIII[3])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllllIllII[llllllIIII[68]];
                    if (y.llIlIllIIIIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllllIIII[32], llllllIIII[52], llllllIIII[3])), llllllIIII[0])) {
                        Movement.walkTo((WorldPoint)new WorldPoint(llllllIIII[32], llllllIIII[52], llllllIIII[3]));
                        0;
                        Time.sleepTicks((int)llllllIIII[0]);
                        0;
                    }
                    if (y.llIlIlIllllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllllIIII[32], llllllIIII[52], llllllIIII[3])), llllllIIII[0])) {
                        String[] stringArray = new String[llllllIIII[0]];
                        stringArray[y.llllllIIII[1]] = lllllIllII[llllllIIII[69]];
                        TileObjects.getNearest((String[])stringArray).interact(lllllIllII[llllllIIII[70]]);
                        Time.sleepTicks((int)llllllIIII[5]);
                        0;
                    }
                }
                WorldArea lllllllllllllllllIlIIlIIIIIIllll = new WorldArea(llllllIIII[32], llllllIIII[37], llllllIIII[7], llllllIIII[19], llllllIIII[0]);
                WorldArea lllllllllllllllllIlIIlIIIIIIlllI = new WorldArea(llllllIIII[71], llllllIIII[72], llllllIIII[19], llllllIIII[6], llllllIIII[0]);
                WorldArea lllllllllllllllllIlIIlIIIIIIllIl = new WorldArea(llllllIIII[71], llllllIIII[33], llllllIIII[18], llllllIIII[19], llllllIIII[0]);
                if (y.llIlIlIllIllI(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llllllIIII[32], llllllIIII[52], llllllIIII[0])) ? 1 : 0)) {
                    String[] stringArray = new String[llllllIIII[0]];
                    stringArray[y.llllllIIII[1]] = lllllIllII[llllllIIII[73]];
                    String[] stringArray13 = new String[llllllIIII[0]];
                    stringArray13[y.llllllIIII[1]] = lllllIllII[llllllIIII[74]];
                    if (y.llIlIlIllIllI(TileObjects.getNearest((String[])stringArray).hasAction(stringArray13) ? 1 : 0)) {
                        String[] stringArray14 = new String[llllllIIII[0]];
                        stringArray14[y.llllllIIII[1]] = lllllIllII[llllllIIII[75]];
                        TileObjects.getNearest((String[])stringArray14).interact(lllllIllII[llllllIIII[76]]);
                        Time.sleepTicks((int)llllllIIII[5]);
                        0;
                    }
                }
                if (!y.llIlIlIlllIII(lllllllllllllllllIlIIlIIIIIIlllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || y.llIlIlIllIllI(lllllllllllllllllIlIIlIIIIIIllll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (y.llIlIlIllIllI(lllllllllllllllllIlIIlIIIIIIlllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        String[] stringArray = new String[llllllIIII[0]];
                        stringArray[y.llllllIIII[1]] = lllllIllII[llllllIIII[77]];
                        String[] stringArray15 = new String[llllllIIII[0]];
                        stringArray15[y.llllllIIII[1]] = lllllIllII[llllllIIII[78]];
                        if (y.llIlIlIllIllI(TileObjects.getNearest((String[])stringArray).hasAction(stringArray15) ? 1 : 0)) {
                            String[] stringArray16 = new String[llllllIIII[0]];
                            stringArray16[y.llllllIIII[1]] = lllllIllII[llllllIIII[17]];
                            TileObjects.getNearest((String[])stringArray16).interact(lllllIllII[llllllIIII[79]]);
                            Time.sleepTicks((int)llllllIIII[5]);
                            0;
                        }
                    }
                    if (y.llIlIlIllIllI(lllllllllllllllllIlIIlIIIIIIllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        TileObjects.getNearest(tileObject -> {
                            int n2;
                            if (y.llIlIlIllIllI(tileObject.getName().equalsIgnoreCase(lllllIllII[llllllIIII[146]]) ? 1 : 0)) {
                                String[] stringArray = new String[llllllIIII[0]];
                                stringArray[y.llllllIIII[1]] = lllllIllII[llllllIIII[147]];
                                if (y.llIlIlIllIllI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                    n2 = llllllIIII[0];
                                    0;
                                    if (1 != 2) return n2 != 0;
                                    return ((0x7C ^ 0x66 ^ (0x63 ^ 0x27)) & (51 + 36 - 6 + 73 ^ 166 + 107 - 247 + 170 ^ -1)) != 0;
                                }
                            }
                            n2 = llllllIIII[1];
                            return n2 != 0;
                        }).interact(lllllIllII[llllllIIII[80]]);
                        Time.sleepTicks((int)llllllIIII[5]);
                        0;
                    }
                }
                WorldArea lllllllllllllllllIlIIlIIIIIIllII = new WorldArea(llllllIIII[71], llllllIIII[37], llllllIIII[19], llllllIIII[0], llllllIIII[1]);
                WorldArea lllllllllllllllllIlIIlIIIIIIlIll = new WorldArea(llllllIIII[32], llllllIIII[33], llllllIIII[3], llllllIIII[7], llllllIIII[1]);
                if (!y.llIlIlIlllIII(lllllllllllllllllIlIIlIIIIIIllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || y.llIlIlIllIllI(lllllllllllllllllIlIIlIIIIIIlIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (y.llIlIlIlllIII(Dialog.isOpen() ? 1 : 0)) {
                        String[] stringArray = new String[llllllIIII[0]];
                        stringArray[y.llllllIIII[1]] = lllllIllII[llllllIIII[81]];
                        TileObjects.getNearest((String[])stringArray).interact(lllllIllII[llllllIIII[82]]);
                        Time.sleepTicks((int)llllllIIII[5]);
                        0;
                    }
                    g.a(bQ);
                }
            }
            if (y.llIlIlIllllll(e.j(gp), llllllIIII[3])) {
                if (y.llIlIlIllIllI(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llllllIIII[83], llllllIIII[84], llllllIIII[1])) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllllIllII[llllllIIII[85]];
                    String[] stringArray = new String[llllllIIII[0]];
                    stringArray[y.llllllIIII[1]] = lllllIllII[llllllIIII[86]];
                    TileObjects.getNearest((String[])stringArray).interact(lllllIllII[llllllIIII[87]]);
                    Time.sleepTicks((int)llllllIIII[3]);
                    0;
                }
                lllllllllllllllllIlIIlIIIIIllIll = new WorldArea(llllllIIII[88], llllllIIII[72], llllllIIII[18], llllllIIII[6], llllllIIII[0]);
                lllllllllllllllllIlIIlIIIIIllIlI = new WorldPoint(llllllIIII[32], llllllIIII[67], llllllIIII[0]);
                lllllllllllllllllIlIIlIIIIIllIIl = new WorldPoint(llllllIIII[32], llllllIIII[37], llllllIIII[0]);
                lllllllllllllllllIlIIlIIIIIllIII = new WorldPoint(llllllIIII[32], llllllIIII[56], llllllIIII[0]);
                if (!(y.llIlIlIlllIII(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llllllIIII[89], llllllIIII[37], llllllIIII[0])) ? 1 : 0) && y.llIlIlIlllIII(lllllllllllllllllIlIIlIIIIIllIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && y.llIlIlIlllIII(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIlIIlIIIIIllIlI) ? 1 : 0) && y.llIlIlIlllIII(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIlIIlIIIIIllIIl) ? 1 : 0) && !y.llIlIlIllIllI(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIlIIlIIIIIllIII) ? 1 : 0))) {
                    AccBuilderTempleTrek.c = lllllIllII[llllllIIII[90]];
                    String[] stringArray = new String[llllllIIII[0]];
                    stringArray[y.llllllIIII[1]] = lllllIllII[llllllIIII[91]];
                    TileObjects.getNearest((String[])stringArray).interact(lllllIllII[llllllIIII[92]]);
                    Time.sleepTicks((int)llllllIIII[3]);
                    0;
                }
                if (y.llIlIlIllIllI(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llllllIIII[83], llllllIIII[67], llllllIIII[0])) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllllIllII[llllllIIII[93]];
                    Time.sleepTicks((int)llllllIIII[5]);
                    0;
                    String[] stringArray = new String[llllllIIII[0]];
                    stringArray[y.llllllIIII[1]] = lllllIllII[llllllIIII[94]];
                    TileObjects.getNearest((String[])stringArray).interact(lllllIllII[llllllIIII[95]]);
                    Time.sleepTicks((int)llllllIIII[3]);
                    0;
                }
                if (y.llIlIlIllIllI(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llllllIIII[32], llllllIIII[52], llllllIIII[3])) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllllIllII[llllllIIII[96]];
                    Movement.walkTo((WorldPoint)new WorldPoint(llllllIIII[64], llllllIIII[52], llllllIIII[3]));
                    0;
                    Time.sleepTicks((int)llllllIIII[3]);
                    0;
                }
                if (y.llIlIlIllIllI(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llllllIIII[64], llllllIIII[52], llllllIIII[3])) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllllIllII[llllllIIII[97]];
                    String[] stringArray = new String[llllllIIII[0]];
                    stringArray[y.llllllIIII[1]] = lllllIllII[llllllIIII[98]];
                    TileObjects.getNearest((String[])stringArray).interact(lllllIllII[llllllIIII[99]]);
                    Time.sleepTicks((int)llllllIIII[3]);
                    0;
                }
                if (y.llIlIlIllIllI((lllllllllllllllllIlIIlIIIIIlIlll = new WorldArea(llllllIIII[55], llllllIIII[56], llllllIIII[13], llllllIIII[7], llllllIIII[0])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] stringArray = new String[llllllIIII[0]];
                    stringArray[y.llllllIIII[1]] = lllllIllII[llllllIIII[100]];
                    String[] stringArray17 = new String[llllllIIII[0]];
                    stringArray17[y.llllllIIII[1]] = lllllIllII[llllllIIII[101]];
                    if (y.llIlIlIllIllI(TileObjects.getNearest((String[])stringArray).hasAction(stringArray17) ? 1 : 0)) {
                        String[] stringArray18 = new String[llllllIIII[0]];
                        stringArray18[y.llllllIIII[1]] = lllllIllII[llllllIIII[102]];
                        TileObjects.getNearest((String[])stringArray18).interact(lllllIllII[llllllIIII[103]]);
                        Time.sleepTicks((int)llllllIIII[3]);
                        0;
                    }
                    String[] stringArray19 = new String[llllllIIII[0]];
                    stringArray19[y.llllllIIII[1]] = lllllIllII[llllllIIII[104]];
                    String[] stringArray20 = new String[llllllIIII[0]];
                    stringArray20[y.llllllIIII[1]] = lllllIllII[llllllIIII[105]];
                    if (y.llIlIlIlllIII(TileObjects.getNearest((String[])stringArray19).hasAction(stringArray20) ? 1 : 0)) {
                        if (y.llIlIlIlllIII(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llllllIIII[53], llllllIIII[22], llllllIIII[0])) ? 1 : 0)) {
                            Movement.walkTo((WorldPoint)new WorldPoint(llllllIIII[53], llllllIIII[22], llllllIIII[0]));
                            0;
                            Time.sleepTicks((int)llllllIIII[0]);
                            0;
                        }
                        if (y.llIlIlIllIllI(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llllllIIII[53], llllllIIII[22], llllllIIII[0])) ? 1 : 0)) {
                            String[] stringArray21 = new String[llllllIIII[0]];
                            stringArray21[y.llllllIIII[1]] = lllllIllII[llllllIIII[106]];
                            TileObjects.getNearest((String[])stringArray21).interact(lllllIllII[llllllIIII[107]]);
                            Time.sleepTicks((int)llllllIIII[3]);
                            0;
                        }
                    }
                }
                if (y.llIlIlIllIllI(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llllllIIII[53], llllllIIII[22], llllllIIII[3])) ? 1 : 0)) {
                    Movement.walkTo((int)llllllIIII[108], (int)llllllIIII[109], (int)llllllIIII[3]);
                    0;
                    Time.sleepTicks((int)llllllIIII[3]);
                    0;
                }
                if (y.llIlIlIllIllI(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llllllIIII[108], llllllIIII[109], llllllIIII[3])) ? 1 : 0)) {
                    String[] stringArray = new String[llllllIIII[0]];
                    stringArray[y.llllllIIII[1]] = lllllIllII[llllllIIII[110]];
                    TileObjects.getNearest((String[])stringArray).interact(lllllIllII[llllllIIII[111]]);
                    Time.sleepTicks((int)llllllIIII[3]);
                    0;
                }
                if (y.llIlIlIllIllI(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llllllIIII[108], llllllIIII[109], llllllIIII[0])) ? 1 : 0)) {
                    Time.sleepTicks((int)llllllIIII[3]);
                    0;
                    TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (y.llIlIlIllIllI(tileObject.getName().equalsIgnoreCase(lllllIllII[llllllIIII[144]]) ? 1 : 0)) {
                            String[] stringArray = new String[llllllIIII[0]];
                            stringArray[y.llllllIIII[1]] = lllllIllII[llllllIIII[145]];
                            if (y.llIlIlIllIllI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                n2 = llllllIIII[0];
                                0;
                                if (null == null) return n2 != 0;
                                return ((105 + 13 - 8 + 137 ^ 168 + 108 - 177 + 78) & (6 ^ 0x34 ^ (0x62 ^ 0x16) ^ -1)) != 0;
                            }
                        }
                        n2 = llllllIIII[1];
                        return n2 != 0;
                    }).interact(lllllIllII[llllllIIII[112]]);
                    Time.sleepTicks((int)llllllIIII[3]);
                    0;
                }
                if (y.llIlIlIllIllI(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llllllIIII[55], llllllIIII[109], llllllIIII[1])) ? 1 : 0)) {
                    Time.sleepTicks((int)llllllIIII[3]);
                    0;
                    String[] stringArray = new String[llllllIIII[0]];
                    stringArray[y.llllllIIII[1]] = lllllIllII[llllllIIII[113]];
                    TileObjects.getNearest((String[])stringArray).interact(lllllIllII[llllllIIII[114]]);
                    Time.sleepTicks((int)llllllIIII[3]);
                    0;
                }
                if (y.llIlIlIllIllI(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llllllIIII[108], llllllIIII[115], llllllIIII[1])) ? 1 : 0)) {
                    Time.sleepTicks((int)llllllIIII[3]);
                    0;
                    String[] stringArray = new String[llllllIIII[0]];
                    stringArray[y.llllllIIII[1]] = lllllIllII[llllllIIII[116]];
                    TileObjects.getNearest((String[])stringArray).interact(lllllIllII[llllllIIII[117]]);
                    Time.sleepTicks((int)llllllIIII[3]);
                    0;
                }
                lllllllllllllllllIlIIlIIIIIlIllI = new WorldArea(llllllIIII[30], llllllIIII[22], llllllIIII[35], llllllIIII[3], llllllIIII[1]);
                lllllllllllllllllIlIIlIIIIIlIlIl = NPCs.getNearest(nPC -> {
                    int n2;
                    if (y.llIlIlIllIllI(nPC.getName().contains(lllllIllII[llllllIIII[140]]) ? 1 : 0) && y.llIlIlIllllIl(nPC.getWorldLocation().distanceTo(new WorldPoint(llllllIIII[88], llllllIIII[22], llllllIIII[1])), llllllIIII[0]) && y.llIlIllIIIIlI(nPC.getInteracting(), Players.getLocal())) {
                        n2 = llllllIIII[0];
                        0;
                        if ((0xAC ^ 0xA9 ^ 1) <= 0) {
                            return ((0x2C ^ 0x31 ^ (0x2D ^ 0x16)) & (0xF6 ^ 0x81 ^ (0x61 ^ 0x30) ^ -1)) != 0;
                        }
                    } else {
                        n2 = llllllIIII[1];
                    }
                    return n2 != 0;
                });
                if (y.llIlIlIllIllI(lllllllllllllllllIlIIlIIIIIlIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && y.llIlIlIlllIlI(lllllllllllllllllIlIIlIIIIIlIlIl)) {
                    AccBuilderTempleTrek.c = lllllIllII[llllllIIII[118]];
                    e.b(new WorldPoint(llllllIIII[119], llllllIIII[22], llllllIIII[1]));
                    Time.sleepTicks((int)llllllIIII[34]);
                    0;
                }
                if (!y.llIlIlIlllIII(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llllllIIII[88], llllllIIII[22], llllllIIII[1])) ? 1 : 0) || y.llIlIlIllIllI(lllllllllllllllllIlIIlIIIIIlIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    lllllllllllllllllIlIIlIIIIIlIlIl = NPCs.getNearest(nPC -> {
                        int n2;
                        if (y.llIlIlIllIllI(nPC.getName().contains(lllllIllII[llllllIIII[143]]) ? 1 : 0) && y.llIlIlIllllIl(nPC.getWorldLocation().distanceTo(new WorldPoint(llllllIIII[88], llllllIIII[22], llllllIIII[1])), llllllIIII[3]) && y.llIlIllIIIIlI(nPC.getInteracting(), Players.getLocal())) {
                            n2 = llllllIIII[0];
                            0;
                            if (((0xB6 ^ 0xB1) & ~(0x13 ^ 0x14)) <= -1) {
                                return ((0x71 ^ 0x33) & ~(0xC0 ^ 0x82)) != 0;
                            }
                        } else {
                            n2 = llllllIIII[1];
                        }
                        return n2 != 0;
                    });
                    if (y.llIlIlIlllIII(Dialog.isOpen() ? 1 : 0) && y.llIlIllIIIIIl(lllllllllllllllllIlIIlIIIIIlIlIl)) {
                        String[] stringArray = new String[llllllIIII[0]];
                        stringArray[y.llllllIIII[1]] = lllllIllII[llllllIIII[120]];
                        TileObjects.getNearest((String[])stringArray).interact(lllllIllII[llllllIIII[121]]);
                        Time.sleepTicks((int)llllllIIII[0]);
                        0;
                    }
                    while (y.llIlIlIllIllI(Dialog.isOpen() ? 1 : 0)) {
                        g.a(bQ);
                        Time.sleep((long)50L);
                        0;
                        0;
                        if ((0x57 ^ 0x53) == (0x5E ^ 0x5A)) continue;
                        return;
                    }
                }
                if (y.llIlIlIllIllI(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llllllIIII[71], llllllIIII[22], llllllIIII[1])) ? 1 : 0)) {
                    Time.sleepTicks((int)llllllIIII[3]);
                    0;
                    String[] stringArray = new String[llllllIIII[0]];
                    stringArray[y.llllllIIII[1]] = lllllIllII[llllllIIII[122]];
                    TileObjects.getNearest((String[])stringArray).interact(lllllIllII[llllllIIII[123]]);
                    Time.sleepTicks((int)llllllIIII[3]);
                    0;
                }
                lllllllllllllllllIlIIlIIIIIlIlII = new WorldArea(llllllIIII[89], llllllIIII[48], llllllIIII[38], llllllIIII[5], llllllIIII[0]);
                lllllllllllllllllIlIIlIIIIIlIIll = new WorldArea(llllllIIII[124], llllllIIII[67], llllllIIII[6], llllllIIII[34], llllllIIII[0]);
                if (!y.llIlIlIlllIII(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llllllIIII[89], llllllIIII[48], llllllIIII[0])) ? 1 : 0) || !y.llIlIlIlllIII(lllllllllllllllllIlIIlIIIIIlIlII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || y.llIlIlIllIllI(lllllllllllllllllIlIIlIIIIIlIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (y.llIlIlIllIllI(Inventory.contains((int[])f.aU) ? 1 : 0) && y.llIlIlIllIlll(Movement.getRunEnergy(), llllllIIII[97])) {
                        Inventory.getFirst((int[])f.aU).interact(lllllIllII[llllllIIII[125]]);
                        Time.sleepTicks((int)llllllIIII[3]);
                        0;
                    }
                    Time.sleepTicks((int)llllllIIII[3]);
                    0;
                    String[] stringArray = new String[llllllIIII[0]];
                    stringArray[y.llllllIIII[1]] = lllllIllII[llllllIIII[126]];
                    TileObjects.getNearest((String[])stringArray).interact(lllllIllII[llllllIIII[127]]);
                    Time.sleepTicks((int)llllllIIII[3]);
                    0;
                }
                if (y.llIlIlIllIllI((lllllllllllllllllIlIIlIIIIIlIIlI = new WorldArea(llllllIIII[32], llllllIIII[27], llllllIIII[34], llllllIIII[19], llllllIIII[0])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && y.llIlIlIlllIII(Dialog.isOpen() ? 1 : 0)) {
                    String[] stringArray = new String[llllllIIII[0]];
                    stringArray[y.llllllIIII[1]] = lllllIllII[llllllIIII[128]];
                    if (y.llIlIlIllIllI(Inventory.contains((String[])stringArray) ? 1 : 0) && y.llIlIlIlllIII(Players.getLocal().isMoving() ? 1 : 0)) {
                        String[] stringArray22 = new String[llllllIIII[0]];
                        stringArray22[y.llllllIIII[1]] = lllllIllII[llllllIIII[129]];
                        String[] stringArray23 = new String[llllllIIII[0]];
                        stringArray23[y.llllllIIII[1]] = lllllIllII[llllllIIII[130]];
                        Inventory.getFirst((String[])stringArray22).useOn(TileObjects.getNearest((String[])stringArray23));
                        Time.sleepTicks((int)llllllIIII[3]);
                        0;
                    }
                }
                g.a(bQ);
            }
            if (y.llIlIlIllllll(e.j(gp), llllllIIII[5])) {
                lllllllllllllllllIlIIlIIIIIllIll = new WorldArea(llllllIIII[32], llllllIIII[27], llllllIIII[34], llllllIIII[19], llllllIIII[0]);
                if (y.llIlIlIllIllI(lllllllllllllllllIlIIlIIIIIllIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    int[] nArray = new int[llllllIIII[0]];
                    nArray[y.llllllIIII[1]] = llllllIIII[9];
                    Inventory.getFirst((int[])nArray).interact(lllllIllII[llllllIIII[131]]);
                    Time.sleepTicks((int)llllllIIII[7]);
                    0;
                }
                if (y.llIlIlIlllIII(lllllllllllllllllIlIIlIIIIIllIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (!y.llIlIlIllllIl(Players.getLocal().getWorldLocation().distanceTo(gf), llllllIIII[7]) || y.llIlIlIlllllI(Players.getLocal().getWorldLocation().getPlane(), llllllIIII[3])) {
                        AccBuilderTempleTrek.c = lllllIllII[llllllIIII[132]];
                        if (y.llIlIlIllIllI(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        e.D();
                        Movement.walkTo((WorldPoint)gf);
                        0;
                        Time.sleepTicks((int)llllllIIII[0]);
                        0;
                    }
                    if (y.llIlIlIllllIl(Players.getLocal().getWorldLocation().distanceTo(gf), llllllIIII[7])) {
                        if (y.llIlIlIllIlll(ck, llllllIIII[0])) {
                            ac.nc += llllllIIII[0];
                            ac.d(AccBuilderTempleTrek.m);
                            ck += llllllIIII[0];
                            ac.nc = llllllIIII[1];
                            cl = llllllIIII[1];
                        }
                        g.a(lllllIllII[llllllIIII[133]], bQ);
                    }
                }
            }
            g.a(new String[llllllIIII[1]]);
        }
    }

    private static String llIlIlIlIIIll(String lllllllllllllllllIlIIIlllllIlIIl, String lllllllllllllllllIlIIIlllllIlIlI) {
        try {
            SecretKeySpec lllllllllllllllllIlIIIlllllIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIIIlllllIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllIlIIIlllllIllIl = Cipher.getInstance("Blowfish");
            lllllllllllllllllIlIIIlllllIllIl.init(llllllIIII[3], lllllllllllllllllIlIIIlllllIlllI);
            return new String(lllllllllllllllllIlIIIlllllIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIIIlllllIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllIlIIIlllllIllII) {
            lllllllllllllllllIlIIIlllllIllII.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIllIIIIlI(Object object, Object object2) {
        return object == object2;
    }

    private static String llIlIlIlIIIlI(String lllllllllllllllllIlIIIllllIIlIIl, String lllllllllllllllllIlIIIllllIIlIII) {
        lllllllllllllllllIlIIIllllIIlIIl = new String(Base64.getDecoder().decode(lllllllllllllllllIlIIIllllIIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllIlIIIllllIIllII = new StringBuilder();
        char[] lllllllllllllllllIlIIIllllIIlIll = lllllllllllllllllIlIIIllllIIlIII.toCharArray();
        int lllllllllllllllllIlIIIllllIIlIlI = llllllIIII[1];
        char[] lllllllllllllllllIlIIIllllIIIlII = lllllllllllllllllIlIIIllllIIlIIl.toCharArray();
        int lllllllllllllllllIlIIIllllIIIIll = lllllllllllllllllIlIIIllllIIIlII.length;
        int lllllllllllllllllIlIIIllllIIIIlI = llllllIIII[1];
        while (y.llIlIlIllIlll(lllllllllllllllllIlIIIllllIIIIlI, lllllllllllllllllIlIIIllllIIIIll)) {
            char lllllllllllllllllIlIIIllllIIllll = lllllllllllllllllIlIIIllllIIIlII[lllllllllllllllllIlIIIllllIIIIlI];
            lllllllllllllllllIlIIIllllIIllII.append((char)(lllllllllllllllllIlIIIllllIIllll ^ lllllllllllllllllIlIIIllllIIlIll[lllllllllllllllllIlIIIllllIIlIlI % lllllllllllllllllIlIIIllllIIlIll.length]));
            0;
            ++lllllllllllllllllIlIIIllllIIlIlI;
            ++lllllllllllllllllIlIIIllllIIIIlI;
            0;
            if (((0x13 ^ 0x28) & ~(9 ^ 0x32)) <= ((0x2B ^ 0x6F) & ~(0x21 ^ 0x65))) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllllIlIIIllllIIllII);
    }

    private static boolean llIlIlIlllIll(int n2) {
        return n2 > 0;
    }

    static {
        y.llIlIlIllIlII();
        y.llIlIlIllIIll();
        bu = new ArrayList<d>();
        gp = llllllIIII[154];
        gf = new WorldPoint(llllllIIII[155], llllllIIII[156], llllllIIII[3]);
        gq = new WorldPoint(llllllIIII[108], llllllIIII[157], llllllIIII[1]);
        String[] stringArray = new String[llllllIIII[6]];
        stringArray[y.llllllIIII[1]] = lllllIllII[llllllIIII[158]];
        stringArray[y.llllllIIII[0]] = lllllIllII[llllllIIII[159]];
        stringArray[y.llllllIIII[3]] = lllllIllII[llllllIIII[160]];
        stringArray[y.llllllIIII[5]] = lllllIllII[llllllIIII[161]];
        bQ = stringArray;
    }

    private static String llIlIlIlIIIIl(String lllllllllllllllllIlIIIllllIlllII, String lllllllllllllllllIlIIIllllIlllIl) {
        try {
            SecretKeySpec lllllllllllllllllIlIIIlllllIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIIIllllIlllIl.getBytes(StandardCharsets.UTF_8)), llllllIIII[20]), "DES");
            Cipher lllllllllllllllllIlIIIlllllIIIII = Cipher.getInstance("DES");
            lllllllllllllllllIlIIIlllllIIIII.init(llllllIIII[3], lllllllllllllllllIlIIIlllllIIIIl);
            return new String(lllllllllllllllllIlIIIlllllIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIIIllllIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllIlIIIllllIlllll) {
            lllllllllllllllllIlIIIllllIlllll.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean S() {
        return llllllIIII[1];
    }

    private static boolean llIlIlIlllIII(int n2) {
        return n2 == 0;
    }
}

