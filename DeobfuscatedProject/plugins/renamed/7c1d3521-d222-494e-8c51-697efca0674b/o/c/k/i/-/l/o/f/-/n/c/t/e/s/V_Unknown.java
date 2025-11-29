/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileItem
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 */
package o.c.k.i.-.l.o.f.-.n.c.t.e.s;

import gg.squire.account.AccBuilderSotf;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Locatable;
import net.runelite.api.TileItem;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.a_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.aN_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.b_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.d;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.e_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.f_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.g_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.j;

public class V_Unknown
implements ac {
    private static /* synthetic */ String[] lllIlIIIII;
    private static /* synthetic */ int[] lllIlIIlII;
    public static /* synthetic */ WorldPoint mg;
    static /* synthetic */ boolean dj;
    static /* synthetic */ int mi;
    public static /* synthetic */ WorldPoint mf;
    public static /* synthetic */ WorldPoint mh;
    static /* synthetic */ int di;
    public static /* synthetic */ WorldPoint de;
    public static /* synthetic */ boolean bt;
    public static /* synthetic */ WorldPoint me;
    public static /* synthetic */ List<d> bv;
    static /* synthetic */ String[] cE;
    static /* synthetic */ WorldArea mj;

    private static boolean llIIIlIlIIIII(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean llIIIlIIllllI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llIIIlIIlIlll(int n2) {
        return n2 != 0;
    }

    @Override
    public String ag() {
        return lllIlIIIII[lllIlIIlII[180]];
    }

    private static boolean llIIIlIIllIll(int n2) {
        return n2 > 0;
    }

    @Override
    public boolean ae() {
        return lllIlIIlII[1];
    }

    private static boolean llIIIlIlIIIlI(int n2, int n3) {
        return n2 >= n3;
    }

    private static int llIIIlIIlIllI(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean llIIIlIIllIIl(int n2) {
        return n2 == 0;
    }

    private static void llIIIlIIlIlIl() {
        lllIlIIlII = new int[198];
        V.lllIlIIlII[0] = 1;
        V.lllIlIIlII[1] = (0x2D ^ 0x67) & ~(0xF8 ^ 0xB2);
        V.lllIlIIlII[2] = 0xFFFFBFDD & 0x53AA;
        V.lllIlIIlII[3] = 2;
        V.lllIlIIlII[4] = 0x2A ^ 0x75 ^ (0x46 ^ 0x1D);
        V.lllIlIIlII[5] = -(2 + 27 - -41 + 75) & (0xFFFF9FFF & 0x7FD7);
        V.lllIlIIlII[6] = -(0xFFFFB557 & 0x5BA9) & (0xFFFFFDDF & 0x5FBF);
        V.lllIlIIlII[7] = -(0xFFFFA967 & 0x76DF) & (0xFFFFBFFF & 0x63FE);
        V.lllIlIIlII[8] = 3;
        V.lllIlIIlII[9] = 0xFFFF939B & 0x6D75;
        V.lllIlIIlII[10] = 0x58 ^ 0x25 ^ (4 ^ 0x73);
        V.lllIlIIlII[11] = 0xFFFFC953 & 0x37BC;
        V.lllIlIIlII[12] = 0xFFFFB77F & 0x79D1;
        V.lllIlIIlII[13] = -(0xFFFFB65B & 0x4DA5) & (0xFFFFDDFF & 0x277B);
        V.lllIlIIlII[14] = 0x56 ^ 0x53;
        V.lllIlIIlII[15] = 0x60 ^ 0x52;
        V.lllIlIIlII[16] = 0x6D ^ 0x65;
        V.lllIlIIlII[17] = 0x15 ^ 0x13;
        V.lllIlIIlII[18] = 0xC0 ^ 0xC7;
        V.lllIlIIlII[19] = 0xFFFFF57A & 0xB97;
        V.lllIlIIlII[20] = 0x52 ^ 0x5B;
        V.lllIlIIlII[21] = 0xFFFFACBF & 0x5F64;
        V.lllIlIIlII[22] = 0xFFFFFFFD & 0xD1F;
        V.lllIlIIlII[23] = 0x1E ^ 8 ^ (0x8B ^ 0x96);
        V.lllIlIIlII[24] = 0x82 ^ 0x8E;
        V.lllIlIIlII[25] = 0x57 ^ 0x41 ^ (0x70 ^ 0x6B);
        V.lllIlIIlII[26] = 140 + 39 - 143 + 135 ^ 78 + 115 - 37 + 9;
        V.lllIlIIlII[27] = 1 ^ (0x17 ^ 0x19);
        V.lllIlIIlII[28] = 0x4D ^ 0x1C ^ (0x3C ^ 0x7D);
        V.lllIlIIlII[29] = 0x7D ^ 0x61 ^ (0xA5 ^ 0xA8);
        V.lllIlIIlII[30] = 0xAF ^ 0x9A ^ (0x11 ^ 0x36);
        V.lllIlIIlII[31] = 0xD2 ^ 0xC1;
        V.lllIlIIlII[32] = 0x54 ^ 0x16 ^ (0x77 ^ 0x21);
        V.lllIlIIlII[33] = 0xD8 ^ 0x88 ^ (0xD5 ^ 0x90);
        V.lllIlIIlII[34] = 0x12 ^ 0x2C ^ (0xB4 ^ 0x9C);
        V.lllIlIIlII[35] = 91 + 15 - -66 + 41 ^ 23 + 31 - -73 + 67;
        V.lllIlIIlII[36] = 18 + 41 - -3 + 84 ^ 78 + 71 - 73 + 62;
        V.lllIlIIlII[37] = 0x2A ^ 0x33;
        V.lllIlIIlII[38] = 0x1A ^ 0;
        V.lllIlIIlII[39] = 171 + 146 - 277 + 136 ^ 131 + 170 - 270 + 140;
        V.lllIlIIlII[40] = 0x5B ^ 0x17 ^ (0x55 ^ 5);
        V.lllIlIIlII[41] = 0x56 ^ 0x4B;
        V.lllIlIIlII[42] = 0x4B ^ 0x55;
        V.lllIlIIlII[43] = 0xFFFF9EFF & 0x6D23;
        V.lllIlIIlII[44] = -(0xFFFFFAEB & 0x3715) & (0xFFFFFF6F & 0x3FB7);
        V.lllIlIIlII[45] = 0xFFFFCDFF & 0x3F26;
        V.lllIlIIlII[46] = 0x65 ^ 0x7A;
        V.lllIlIIlII[47] = 39 + 144 - 97 + 73 ^ 147 + 189 - 272 + 127;
        V.lllIlIIlII[48] = 18 + 61 - 5 + 66 ^ 82 + 86 - 51 + 56;
        V.lllIlIIlII[49] = 17 + 168 - 97 + 82 ^ 50 + 44 - 32 + 74;
        V.lllIlIIlII[50] = 0x94 ^ 0xB7;
        V.lllIlIIlII[51] = 86 + 0 - 80 + 158 ^ 15 + 99 - 62 + 76;
        V.lllIlIIlII[52] = 0x6C ^ 0x49;
        V.lllIlIIlII[53] = 0x31 ^ 0x17;
        V.lllIlIIlII[54] = 0xFFFFAC56 & 0x5FBB;
        V.lllIlIIlII[55] = -(0xFFFFDCEF & 0x3353) & (0xFFFFDD5B & 0x3FFF);
        V.lllIlIIlII[56] = 0x77 ^ 0x59 ^ (0x55 ^ 0x5C);
        V.lllIlIIlII[57] = 0x3A ^ 0x12;
        V.lllIlIIlII[58] = 0xA6 ^ 0x8F;
        V.lllIlIIlII[59] = 0x53 ^ 0x79;
        V.lllIlIIlII[60] = 0x3B ^ 0x66 ^ (0x33 ^ 0x45);
        V.lllIlIIlII[61] = -(0xFFFFF8FF & 0x176E) & (0xFFFFB67F & Short.MAX_VALUE);
        V.lllIlIIlII[62] = 0xFFFFBC2F & 0x4FFC;
        V.lllIlIIlII[63] = -(0xFFFF9BE6 & 0x6DDF) & (0xFFFFEFFF & 0x3FDD);
        V.lllIlIIlII[64] = 0xFFFF8C36 & 0x7FEF;
        V.lllIlIIlII[65] = 0xFFFFB6F9 & 0x6F27;
        V.lllIlIIlII[66] = 0xFFFFEEBF & 0x3765;
        V.lllIlIIlII[67] = -(0xFFFFBFF9 & 0x61E7) & (0xFFFFAFF9 & 0x7DFF);
        V.lllIlIIlII[68] = -(0xFFFFF9BF & 0x575F) & (0xFFFFFF7F & 0x5DBF);
        V.lllIlIIlII[69] = 0xFFFFF67F & 0x2F9E;
        V.lllIlIIlII[70] = 0xFFFF9F37 & 0x6CDF;
        V.lllIlIIlII[71] = -(0xFFFFDFDF & 0x6175) & (0xFFFFF7FF & 0x6F77);
        V.lllIlIIlII[72] = 0xFFFFDE9D & 0x2D7E;
        V.lllIlIIlII[73] = -1 & (0xFFFFE777 & 0x3E99);
        V.lllIlIIlII[74] = 0xFFFFB6FF & 0x4FFC;
        V.lllIlIIlII[75] = 0xFFFFE7FF & 0x1EFF;
        V.lllIlIIlII[76] = 0x43 ^ 0x6F ^ (0xB4 ^ 0xBA) & ~(0x41 ^ 0x4F);
        V.lllIlIIlII[77] = 0x61 ^ 0x77 ^ (0xA1 ^ 0x9A);
        V.lllIlIIlII[78] = 0x8F ^ 0xA1;
        V.lllIlIIlII[79] = 0x42 ^ 0x63 ^ (0x66 ^ 0x68);
        V.lllIlIIlII[80] = 0xFFFFD6FD & 0x2FFF;
        V.lllIlIIlII[81] = 0x5B ^ 0x68 ^ 3;
        V.lllIlIIlII[82] = 49 + 128 - 134 + 92 ^ 146 + 160 - 220 + 96;
        V.lllIlIIlII[83] = 0xAA ^ 0xB3 ^ (0x37 ^ 0x1D);
        V.lllIlIIlII[84] = 0xFFFFB6BD & 0x6F5F;
        V.lllIlIIlII[85] = 0x4D ^ 0x79;
        V.lllIlIIlII[86] = 47 + 85 - 108 + 146 ^ 54 + 109 - 138 + 134;
        V.lllIlIIlII[87] = 0x83 ^ 0xB5;
        V.lllIlIIlII[88] = 0x57 ^ 0x60;
        V.lllIlIIlII[89] = 36 + 27 - 32 + 100 ^ 176 + 135 - 167 + 43;
        V.lllIlIIlII[90] = 5 ^ 0x3C;
        V.lllIlIIlII[91] = 0xFFFFB67F & 0x6F9F;
        V.lllIlIIlII[92] = 0xAC ^ 0x96;
        V.lllIlIIlII[93] = 0x44 ^ 0x56 ^ (0x30 ^ 0x19);
        V.lllIlIIlII[94] = 0x37 ^ 0x65 ^ (0x12 ^ 0x7C);
        V.lllIlIIlII[95] = 77 + 42 - 11 + 25 ^ 33 + 25 - -65 + 61;
        V.lllIlIIlII[96] = 0xD4 ^ 0x97 ^ (0x58 ^ 0x25);
        V.lllIlIIlII[97] = 0xC ^ 0x11 ^ (0x88 ^ 0xAA);
        V.lllIlIIlII[98] = 199 + 27 - 122 + 136 ^ 147 + 163 - 183 + 49;
        V.lllIlIIlII[99] = 0x7F ^ 0x78 ^ (0xD6 ^ 0x90);
        V.lllIlIIlII[100] = (0x1F ^ 0x52) & ~(0x47 ^ 0xA) ^ (0x3F ^ 0x7D);
        V.lllIlIIlII[101] = 94 + 171 - 50 + 23 ^ 81 + 141 - 166 + 117;
        V.lllIlIIlII[102] = 0x68 ^ 0x2C;
        V.lllIlIIlII[103] = -(0xFFFFEAE8 & 0x7577) & (0xFFFFEFFF & 0x775F);
        V.lllIlIIlII[104] = -(0xFFFFF9F6 & 0x47AB) & (0xFFFFDFFF & 0x6DBF);
        V.lllIlIIlII[105] = 166 + 132 - 215 + 116 ^ 81 + 44 - 124 + 129;
        V.lllIlIIlII[106] = 0x3A ^ 0x7C;
        V.lllIlIIlII[107] = 0x24 ^ 0x63;
        V.lllIlIIlII[108] = 0xFFFFEDFD & 0x1E1F;
        V.lllIlIIlII[109] = -(0xFFFFBB93 & 0x55FF) & (0xFFFFB7BB & 0x7FF6);
        V.lllIlIIlII[110] = 0xF9 ^ 0xB1;
        V.lllIlIIlII[111] = 125 + 158 - 106 + 53 ^ 59 + 123 - 150 + 143;
        V.lllIlIIlII[112] = 0xC6 ^ 0x8C;
        V.lllIlIIlII[113] = 0xFFFFE72F & 0x3EF2;
        V.lllIlIIlII[114] = 0x5A ^ 0x11;
        V.lllIlIIlII[115] = 0x95 ^ 0x9D ^ (0x84 ^ 0xC0);
        V.lllIlIIlII[116] = 192 + 108 - 142 + 57 ^ 34 + 52 - 72 + 140;
        V.lllIlIIlII[117] = 0x7B ^ 0x35;
        V.lllIlIIlII[118] = 0xE4 ^ 0xAB;
        V.lllIlIIlII[119] = 0xCF ^ 0x9F;
        V.lllIlIIlII[120] = 0x12 ^ 6 ^ (0x64 ^ 0x21);
        V.lllIlIIlII[121] = -(0xFFFFB13D & 0x7EE7) & (0xFFFFF77F & 0x3FA5);
        V.lllIlIIlII[122] = 0x7B ^ 0x29 ^ (0xAD ^ 0xA5) & ~(0x1A ^ 0x12);
        V.lllIlIIlII[123] = 0x4A ^ 0x3A ^ (0xA7 ^ 0x84);
        V.lllIlIIlII[124] = 0x70 ^ 0x5F ^ (0xF ^ 0x74);
        V.lllIlIIlII[125] = 0x44 ^ 0x11;
        V.lllIlIIlII[126] = 0xFFFFB7FF & 0x4EFE;
        V.lllIlIIlII[127] = 0xFFFF8C3F & 0x7FDB;
        V.lllIlIIlII[128] = 0xD8 ^ 0x9A ^ (0x95 ^ 0x81);
        V.lllIlIIlII[129] = 0x4D ^ 0x1A;
        V.lllIlIIlII[130] = 0xF0 ^ 0xA8;
        V.lllIlIIlII[131] = -(0xFFFFF7A3 & 0x7B5F) & (0xFFFFFFFA & 0x7F27);
        V.lllIlIIlII[132] = 0x1B ^ 0x6E ^ (0xE8 ^ 0xC4);
        V.lllIlIIlII[133] = 198 + 229 - 250 + 77 ^ 41 + 72 - 97 + 148;
        V.lllIlIIlII[134] = 0x30 ^ 0x6B;
        V.lllIlIIlII[135] = 0x32 ^ 0x73 ^ (0xBD ^ 0xA0);
        V.lllIlIIlII[136] = 0xA0 ^ 0x80 ^ (0x1A ^ 0x67);
        V.lllIlIIlII[137] = 182 + 40 - 23 + 11 ^ 92 + 75 - 67 + 40;
        V.lllIlIIlII[138] = 0xFFFFDEA6 & 0x2D7B;
        V.lllIlIIlII[139] = 0x1B ^ 0x7E ^ (0x20 ^ 0x1A);
        V.lllIlIIlII[140] = 191 + 26 - 176 + 152 ^ 75 + 96 - 77 + 67;
        V.lllIlIIlII[141] = 0x30 ^ 0x57 ^ (8 ^ 0xE);
        V.lllIlIIlII[142] = 0xC6 ^ 0xBA ^ (0x4D ^ 0x53);
        V.lllIlIIlII[143] = 0xC ^ 0x6F;
        V.lllIlIIlII[144] = 0x60 ^ 4;
        V.lllIlIIlII[145] = 0x41 ^ 0x24;
        V.lllIlIIlII[146] = 0x8A ^ 0xC5 ^ (0x2A ^ 3);
        V.lllIlIIlII[147] = 0x76 ^ 0x11;
        V.lllIlIIlII[148] = 0 ^ 0x68;
        V.lllIlIIlII[149] = 0xC3 ^ 0xAA;
        V.lllIlIIlII[150] = 0x57 ^ 0x3D;
        V.lllIlIIlII[151] = 0xA9 ^ 0xC2;
        V.lllIlIIlII[152] = 0xFFFFEE37 & 0x37EC;
        V.lllIlIIlII[153] = 0x28 ^ 0x44;
        V.lllIlIIlII[154] = 0xEF ^ 0x82;
        V.lllIlIIlII[155] = 0x68 ^ 6;
        V.lllIlIIlII[156] = 4 ^ 0x67 ^ (0x3A ^ 0x36);
        V.lllIlIIlII[157] = (0xD6 ^ 0x99) + (48 + 61 - -10 + 8) - (83 + 90 - 107 + 93) + (9 ^ 0x6B);
        V.lllIlIIlII[158] = 0x38 ^ 0x48;
        V.lllIlIIlII[159] = 15 + 49 - -46 + 31;
        V.lllIlIIlII[160] = 0x1F ^ 3 ^ (0x5D ^ 0x30);
        V.lllIlIIlII[161] = -(0x5B ^ 0x72) & (0xFFFF9F7F & 0x6CB9);
        V.lllIlIIlII[162] = -(0xFFFFF4AD & 0x5BF7) & (0xFFFFFFBF & 0x76FD);
        V.lllIlIIlII[163] = 0xDD ^ 0xA5 ^ (0x4A ^ 0x40);
        V.lllIlIIlII[164] = 1 ^ (0x2F ^ 0x5D);
        V.lllIlIIlII[165] = 0x3F ^ 0x4B;
        V.lllIlIIlII[166] = 0xF1 ^ 0x84;
        V.lllIlIIlII[167] = 0x62 ^ 0x14;
        V.lllIlIIlII[168] = 0x2B ^ 0x10 ^ (0xEF ^ 0xA3);
        V.lllIlIIlII[169] = 4 ^ 0x15 ^ (0xEA ^ 0x83);
        V.lllIlIIlII[170] = 0xDB ^ 0x85 ^ (1 ^ 0x26);
        V.lllIlIIlII[171] = 0xF2 ^ 0x88;
        V.lllIlIIlII[172] = 0xE ^ 0x75 ^ (0x43 ^ 0x55) & ~(0xD7 ^ 0xC1);
        V.lllIlIIlII[173] = 0xD ^ 0x70 ^ 1;
        V.lllIlIIlII[174] = 0x72 ^ 0x3E ^ (0xF7 ^ 0xC6);
        V.lllIlIIlII[175] = -(0xFFFFB3FD & 0x5CC3) & (0xFFFFB6CC & 0x7DF7);
        V.lllIlIIlII[176] = -(0xFFFFE237 & 0x5DF9) & (0xFFFFFFFE & 0x6EFD);
        V.lllIlIIlII[177] = 0xFFFFEDBC & 0x73EB;
        V.lllIlIIlII[178] = 0xFFFFCD6C & 0x33BF;
        V.lllIlIIlII[179] = -(0xFFFFF66D & 0x3BD6) & (0xFFFFB77F & 0x7FD7);
        V.lllIlIIlII[180] = 0x18 ^ 0x66;
        V.lllIlIIlII[181] = 29 + 100 - 61 + 59;
        V.lllIlIIlII[182] = (0xB ^ 0x64) + (0x89 ^ 0x8F) - (0x2F ^ 0x4E) + (0xE8 ^ 0x84);
        V.lllIlIIlII[183] = 18 + 48 - 34 + 97;
        V.lllIlIIlII[184] = -(0xFFFFB25F & 0x7FF3) & (0xFFFFFF7F & 0x3FF7);
        V.lllIlIIlII[185] = 6 + 22 - -102 + 0;
        V.lllIlIIlII[186] = 116 + 23 - 127 + 119;
        V.lllIlIIlII[187] = 0xFFFFAF15 & 0x5DEB;
        V.lllIlIIlII[188] = -(0xFFFFBEF5 & 0x73DB) & (0xFFFFFEFF & 0x3FDF);
        V.lllIlIIlII[189] = -(0xFFFFBB96 & 0x66FB) & (0xFFFFFFBB & 0x2FF5);
        V.lllIlIIlII[190] = 0xFFFFCF2F & 0x3DD8;
        V.lllIlIIlII[191] = -(0xFFFFFE4B & 0x61F5) & (0xFFFFEFF6 & 0x7C5F);
        V.lllIlIIlII[192] = 0xFFFFDFFF & 0x2D1F;
        V.lllIlIIlII[193] = 39 + 82 - 118 + 129;
        V.lllIlIIlII[194] = (0xF6 ^ 0x9F) + (0x4B ^ 0x21) - (0xCB ^ 0xAE) + (0x17 ^ 0);
        V.lllIlIIlII[195] = 45 + 82 - 27 + 34;
        V.lllIlIIlII[196] = -(0xFFFFFBEB & 0x5DF5) & (0xFFFFFFFF & 0x7FEF);
        V.lllIlIIlII[197] = 7 + 117 - 89 + 100;
    }

    private static boolean llIIIlIIlllIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIIIlIlIIIIl(Object object) {
        return object == null;
    }

    private static void llIIIlIIIIIll() {
        lllIlIIIII = new String[lllIlIIlII[197]];
        V.lllIlIIIII[V.lllIlIIlII[1]] = V."Finished buying items, switching back to quest";
        V.lllIlIIIII[V.lllIlIIlII[0]] = V."Nav to bank";
        V.lllIlIIIII[V.lllIlIIlII[3]] = V."Handling banking";
        V.lllIlIIIII[V.lllIlIIlII[8]] = V."We are missing quest supplies, switching to BUYING";
        V.lllIlIIIII[V.lllIlIIlII[4]] = V."Drink";
        V.lllIlIIIII[V.lllIlIIlII[14]] = V."Eat";
        V.lllIlIIIII[V.lllIlIIlII[17]] = V."Nav to start";
        V.lllIlIIIII[V.lllIlIIlII[18]] = V."Start quest";
        V.lllIlIIIII[V.lllIlIIlII[16]] = V."Veronica";
        V.lllIlIIIII[V.lllIlIIlII[20]] = V."Key";
        V.lllIlIIIII[V.lllIlIIlII[10]] = V."Nav to fish food";
        V.lllIlIIIII[V.lllIlIIlII[23]] = V."Can't reach, navigating";
        V.lllIlIIIII[V.lllIlIIlII[24]] = V."Taking food";
        V.lllIlIIIII[V.lllIlIIlII[25]] = V."Take";
        V.lllIlIIIII[V.lllIlIIlII[26]] = V."Making poison fish food";
        V.lllIlIIIII[V.lllIlIIlII[27]] = V."Key";
        V.lllIlIIIII[V.lllIlIIlII[28]] = V."Nav to compost";
        V.lllIlIIIII[V.lllIlIIlII[29]] = V."Digging";
        V.lllIlIIIII[V.lllIlIIlII[30]] = V."Compost heap";
        V.lllIlIIIII[V.lllIlIIlII[31]] = V."Search";
        V.lllIlIIIII[V.lllIlIIlII[32]] = V."Key";
        V.lllIlIIIII[V.lllIlIIlII[33]] = V."Nav to fountain";
        V.lllIlIIIII[V.lllIlIIlII[34]] = V."Fountain";
        V.lllIlIIIII[V.lllIlIIlII[35]] = V."Key";
        V.lllIlIIIII[V.lllIlIIlII[36]] = V."Pressure gauge";
        V.lllIlIIIII[V.lllIlIIlII[37]] = V."Getting guage";
        V.lllIlIIIII[V.lllIlIIlII[38]] = V."Fountain";
        V.lllIlIIIII[V.lllIlIIlII[39]] = V."Search";
        V.lllIlIIIII[V.lllIlIIlII[40]] = V."Key";
        V.lllIlIIIII[V.lllIlIIlII[41]] = V."Pressure gauge";
        V.lllIlIIIII[V.lllIlIIlII[42]] = V."Rubber tube";
        V.lllIlIIIII[V.lllIlIIlII[46]] = V."Nav to door";
        V.lllIlIIIII[V.lllIlIIlII[47]] = V."Door";
        V.lllIlIIIII[V.lllIlIIlII[48]] = V."Open";
        V.lllIlIIIII[V.lllIlIIlII[49]] = V."Get tube";
        V.lllIlIIIII[V.lllIlIIlII[50]] = V."Rubber tube";
        V.lllIlIIIII[V.lllIlIIlII[51]] = V."Take";
        V.lllIlIIIII[V.lllIlIIlII[52]] = V."Rubber tube";
        V.lllIlIIIII[V.lllIlIIlII[53]] = V."Oil can";
        V.lllIlIIIII[V.lllIlIIlII[56]] = V."Door";
        V.lllIlIIIII[V.lllIlIIlII[57]] = V."Open";
        V.lllIlIIIII[V.lllIlIIlII[58]] = V."Nav to final room";
        V.lllIlIIIII[V.lllIlIIlII[59]] = V."Ladder";
        V.lllIlIIIII[V.lllIlIIlII[60]] = V."Climb-down";
        V.lllIlIIIII[V.lllIlIIlII[76]] = V."Nav to a";
        V.lllIlIIIII[V.lllIlIIlII[77]] = V."Pull lever";
        V.lllIlIIIII[V.lllIlIIlII[78]] = V."Lever A";
        V.lllIlIIIII[V.lllIlIIlII[79]] = V."Pull";
        V.lllIlIIIII[V.lllIlIIlII[81]] = V."Nav to b";
        V.lllIlIIIII[V.lllIlIIlII[82]] = V."Pull lever";
        V.lllIlIIIII[V.lllIlIIlII[15]] = V."Lever B";
        V.lllIlIIIII[V.lllIlIIlII[83]] = V."Pull";
        V.lllIlIIIII[V.lllIlIIlII[85]] = V."Nav to d";
        V.lllIlIIIII[V.lllIlIIlII[86]] = V."Door";
        V.lllIlIIIII[V.lllIlIIlII[87]] = V."Open";
        V.lllIlIIIII[V.lllIlIIlII[88]] = V."Pull lever";
        V.lllIlIIIII[V.lllIlIIlII[89]] = V."Lever D";
        V.lllIlIIIII[V.lllIlIIlII[90]] = V."Pull";
        V.lllIlIIIII[V.lllIlIIlII[92]] = V."Move to door";
        V.lllIlIIIII[V.lllIlIIlII[93]] = V."Door";
        V.lllIlIIIII[V.lllIlIIlII[94]] = V."Open";
        V.lllIlIIIII[V.lllIlIIlII[95]] = V."Nav to b";
        V.lllIlIIIII[V.lllIlIIlII[96]] = V."Pull lever";
        V.lllIlIIIII[V.lllIlIIlII[97]] = V."Lever B";
        V.lllIlIIIII[V.lllIlIIlII[98]] = V."Pull";
        V.lllIlIIIII[V.lllIlIIlII[99]] = V."Nav to a";
        V.lllIlIIIII[V.lllIlIIlII[100]] = V."Pull lever";
        V.lllIlIIIII[V.lllIlIIlII[101]] = V."Lever A";
        V.lllIlIIIII[V.lllIlIIlII[102]] = V."Pull";
        V.lllIlIIIII[V.lllIlIIlII[105]] = V."Move to door";
        V.lllIlIIIII[V.lllIlIIlII[106]] = V."Door";
        V.lllIlIIIII[V.lllIlIIlII[107]] = V."Open";
        V.lllIlIIIII[V.lllIlIIlII[110]] = V."Move to door";
        V.lllIlIIIII[V.lllIlIIlII[111]] = V."Door";
        V.lllIlIIIII[V.lllIlIIlII[112]] = V."Open";
        V.lllIlIIIII[V.lllIlIIlII[114]] = V."Move to door";
        V.lllIlIIIII[V.lllIlIIlII[115]] = V."Door";
        V.lllIlIIIII[V.lllIlIIlII[116]] = V."Open";
        V.lllIlIIIII[V.lllIlIIlII[117]] = V."Nav to e";
        V.lllIlIIIII[V.lllIlIIlII[118]] = V."Pull lever";
        V.lllIlIIIII[V.lllIlIIlII[119]] = V."Lever E";
        V.lllIlIIIII[V.lllIlIIlII[120]] = V."Pull";
        V.lllIlIIIII[V.lllIlIIlII[122]] = V."Nav to f";
        V.lllIlIIIII[V.lllIlIIlII[123]] = V."Pull lever";
        V.lllIlIIIII[V.lllIlIIlII[124]] = V."Lever F";
        V.lllIlIIIII[V.lllIlIIlII[125]] = V."Pull";
        V.lllIlIIIII[V.lllIlIIlII[128]] = V."Move to door";
        V.lllIlIIIII[V.lllIlIIlII[129]] = V."Door";
        V.lllIlIIIII[V.lllIlIIlII[130]] = V."Open";
        V.lllIlIIIII[V.lllIlIIlII[132]] = V."Move to door";
        V.lllIlIIIII[V.lllIlIIlII[133]] = V."Door";
        V.lllIlIIIII[V.lllIlIIlII[134]] = V."Open";
        V.lllIlIIIII[V.lllIlIIlII[135]] = V."Pull lever";
        V.lllIlIIIII[V.lllIlIIlII[136]] = V."Lever C";
        V.lllIlIIIII[V.lllIlIIlII[137]] = V."Pull";
        V.lllIlIIIII[V.lllIlIIlII[139]] = V."Move to door";
        V.lllIlIIIII[V.lllIlIIlII[140]] = V."Door";
        V.lllIlIIIII[V.lllIlIIlII[141]] = V."Open";
        V.lllIlIIIII[V.lllIlIIlII[142]] = V."Move to door";
        V.lllIlIIIII[V.lllIlIIlII[143]] = V."Door";
        V.lllIlIIIII[V.lllIlIIlII[144]] = V."Open";
        V.lllIlIIIII[V.lllIlIIlII[145]] = V."Nav to e";
        V.lllIlIIIII[V.lllIlIIlII[146]] = V."Pull lever";
        V.lllIlIIIII[V.lllIlIIlII[147]] = V."Lever E";
        V.lllIlIIIII[V.lllIlIIlII[148]] = V."Pull";
        V.lllIlIIIII[V.lllIlIIlII[149]] = V."Move to door";
        V.lllIlIIIII[V.lllIlIIlII[150]] = V."Door";
        V.lllIlIIIII[V.lllIlIIlII[151]] = V."Open";
        V.lllIlIIIII[V.lllIlIIlII[153]] = V."Move to door";
        V.lllIlIIIII[V.lllIlIIlII[154]] = V."Door";
        V.lllIlIIIII[V.lllIlIIlII[155]] = V."Open";
        V.lllIlIIIII[V.lllIlIIlII[156]] = V."Opening 145";
        V.lllIlIIIII[V.lllIlIIlII[158]] = V."Open";
        V.lllIlIIIII[V.lllIlIIlII[160]] = V."Open";
        V.lllIlIIIII[V.lllIlIIlII[163]] = V."Oil can";
        V.lllIlIIIII[V.lllIlIIlII[164]] = V."Oil can";
        V.lllIlIIIII[V.lllIlIIlII[165]] = V."Take";
        V.lllIlIIIII[V.lllIlIIlII[166]] = V."Rubber tube";
        V.lllIlIIIII[V.lllIlIIlII[167]] = V."Oil can";
        V.lllIlIIIII[V.lllIlIIlII[168]] = V."Open";
        V.lllIlIIIII[V.lllIlIIlII[169]] = V."Nav to professor";
        V.lllIlIIIII[V.lllIlIIlII[170]] = V."Open";
        V.lllIlIIIII[V.lllIlIIlII[171]] = V."Professor Oddenstein";
        V.lllIlIIIII[V.lllIlIIlII[172]] = V."Nav to professor";
        V.lllIlIIIII[V.lllIlIIlII[173]] = V."Open";
        V.lllIlIIIII[V.lllIlIIlII[174]] = V."Professor Oddenstein";
        V.lllIlIIIII[V.lllIlIIlII[180]] = V."Ernest the Chicken";
        V.lllIlIIIII[V.lllIlIIlII[181]] = V."ring of wealth (";
        V.lllIlIIIII[V.lllIlIIlII[182]] = V."Door";
        V.lllIlIIIII[V.lllIlIIlII[183]] = V."Open";
        V.lllIlIIIII[V.lllIlIIlII[185]] = V."Door";
        V.lllIlIIIII[V.lllIlIIlII[186]] = V."Open";
        V.lllIlIIIII[V.lllIlIIlII[193]] = V."Yes.";
        V.lllIlIIIII[V.lllIlIIlII[194]] = V."I'm looking for a guy called Ernest.";
        V.lllIlIIIII[V.lllIlIIlII[195]] = V."I'm glad Veronica didn't actually get engaged to a chicken.";
    }

    public static void dL() {
        block134: {
            BankLocation var15;
            block135: {
                WorldArea var21;
                TileItem var30;
                block137: {
                    block136: {
                        if (V.llIIIlIIlIlll(bt ? 1 : 0)) {
                            b.a(bv);
                            if (V.llIIIlIIllIII(bv.size(), lllIlIIlII[0])) {
                                System.out.println(lllIlIIIII[lllIlIIlII[1]]);
                                bt = lllIlIIlII[1];
                            }
                        }
                        if (!V.llIIIlIIllIIl(bt ? 1 : 0)) break block134;
                        if (V.llIIIlIIllIIl(V.an() ? 1 : 0) && V.llIIIlIIllIII(e.j(mi), lllIlIIlII[0])) {
                            var15 = BankLocation.getNearest();
                            if (V.llIIIlIIllIlI(var15) && V.llIIIlIIllIIl(var15.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[0]];
                                a.a(var15);
                            }
                            if (V.llIIIlIIllIlI(var15) && V.llIIIlIIlIlll(var15.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                if (V.llIIIlIIllIIl(Bank.isOpen() ? 1 : 0)) {
                                    a.a();
                                    Time.sleepUntil(() -> Bank.isOpen(), (int)lllIlIIlII[2]);
                                    0;
                                }
                                if (V.llIIIlIIlIlll(Bank.isOpen() ? 1 : 0)) {
                                    AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[3]];
                                    if (V.llIIIlIIllIll(Inventory.getAll().size())) {
                                        Bank.depositInventory();
                                        Time.sleepTicks((int)lllIlIIlII[4]);
                                        0;
                                    }
                                    if (V.llIIIlIIllIll(Equipment.getAll().size())) {
                                        Bank.depositEquipment();
                                        Time.sleepTicks((int)lllIlIIlII[3]);
                                        0;
                                    }
                                    int[] nArray = new int[lllIlIIlII[4]];
                                    nArray[V.lllIlIIlII[1]] = lllIlIIlII[5];
                                    nArray[V.lllIlIIlII[0]] = lllIlIIlII[6];
                                    nArray[V.lllIlIIlII[3]] = lllIlIIlII[7];
                                    nArray[V.lllIlIIlII[8]] = lllIlIIlII[9];
                                    if (V.llIIIlIIllIIl(e.c(nArray) ? 1 : 0)) {
                                        V.Q();
                                        System.out.println(lllIlIIIII[lllIlIIlII[8]]);
                                        bt = lllIlIIlII[0];
                                        return;
                                    }
                                    int[] nArray2 = new int[lllIlIIlII[4]];
                                    nArray2[V.lllIlIIlII[1]] = lllIlIIlII[5];
                                    nArray2[V.lllIlIIlII[0]] = lllIlIIlII[6];
                                    nArray2[V.lllIlIIlII[3]] = lllIlIIlII[7];
                                    nArray2[V.lllIlIIlII[8]] = lllIlIIlII[9];
                                    if (V.llIIIlIIlIlll(e.c(nArray2) ? 1 : 0)) {
                                        a.a(lllIlIIlII[5], lllIlIIlII[10]);
                                        a.a(lllIlIIlII[6], lllIlIIlII[10]);
                                        a.a(lllIlIIlII[7], lllIlIIlII[0]);
                                        a.a(lllIlIIlII[11], lllIlIIlII[0]);
                                        a.a(lllIlIIlII[9], lllIlIIlII[0]);
                                        a.a(lllIlIIlII[12], lllIlIIlII[0]);
                                        a.a(lllIlIIlII[13], lllIlIIlII[14]);
                                    }
                                }
                            }
                        }
                        if (V.llIIIlIIlIlll(Inventory.contains((int[])f.ba) ? 1 : 0) && V.llIIIlIIllIII(Movement.getRunEnergy(), lllIlIIlII[15])) {
                            Inventory.getFirst((int[])f.ba).interact(lllIlIIIII[lllIlIIlII[4]]);
                            Time.sleepTicks((int)lllIlIIlII[0]);
                            0;
                        }
                        int[] nArray = new int[lllIlIIlII[0]];
                        nArray[V.lllIlIIlII[1]] = lllIlIIlII[13];
                        if (V.llIIIlIIlIlll(Inventory.contains((int[])nArray) ? 1 : 0) && V.llIIIlIIlllII(V.llIIIlIIlIllI(e.w(), 50.0))) {
                            int[] nArray3 = new int[lllIlIIlII[0]];
                            nArray3[V.lllIlIIlII[1]] = lllIlIIlII[13];
                            Inventory.getFirst((int[])nArray3).interact(lllIlIIIII[lllIlIIlII[14]]);
                            Time.sleepTicks((int)lllIlIIlII[3]);
                            0;
                        }
                        if (V.llIIIlIIlIlll(V.an() ? 1 : 0) && V.llIIIlIIllIIl(e.j(mi))) {
                            if (V.llIIIlIIlllIl(Players.getLocal().getWorldLocation().distanceTo(de), lllIlIIlII[16])) {
                                AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[17]];
                                Movement.walkTo((WorldPoint)de);
                                0;
                                Time.sleepTicks((int)lllIlIIlII[0]);
                                0;
                            }
                            if (V.llIIIlIIllllI(Players.getLocal().getWorldLocation().distanceTo(de), lllIlIIlII[16])) {
                                AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[18]];
                                if (V.llIIIlIIlIlll(Dialog.isOpen() ? 1 : 0)) {
                                    Dialog.close();
                                }
                                g.a(lllIlIIIII[lllIlIIlII[16]], cE);
                            }
                        }
                        if (!V.llIIIlIIlllll(e.j(mi), lllIlIIlII[0])) break block135;
                        di = lllIlIIlII[1];
                        int[] nArray4 = new int[lllIlIIlII[0]];
                        nArray4[V.lllIlIIlII[1]] = lllIlIIlII[11];
                        if (V.llIIIlIIllIIl(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                            int[] nArray5 = new int[lllIlIIlII[0]];
                            nArray5[V.lllIlIIlII[1]] = lllIlIIlII[19];
                            if (V.llIIIlIIllIIl(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                                String[] stringArray = new String[lllIlIIlII[0]];
                                stringArray[V.lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[20]];
                                if (V.llIIIlIIllIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                    var15 = new WorldPoint(lllIlIIlII[21], lllIlIIlII[22], lllIlIIlII[0]);
                                    int[] nArray6 = new int[lllIlIIlII[0]];
                                    nArray6[V.lllIlIIlII[1]] = lllIlIIlII[11];
                                    if (V.llIIIlIIllIIl(Inventory.contains((int[])nArray6) ? 1 : 0)) {
                                        if (V.llIIIlIIlllIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var15), lllIlIIlII[14])) {
                                            AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[10]];
                                            Movement.walkTo((WorldPoint)var15);
                                            0;
                                            Time.sleepTicks((int)lllIlIIlII[0]);
                                            0;
                                        }
                                        if (V.llIIIlIIllllI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var15), lllIlIIlII[14])) {
                                            int[] nArray7 = new int[lllIlIIlII[0]];
                                            nArray7[V.lllIlIIlII[1]] = lllIlIIlII[11];
                                            var30 = TileItems.getNearest((int[])nArray7);
                                            if (V.llIIIlIIllIlI(var30)) {
                                                if (V.llIIIlIIllIIl(Reachable.isInteractable((Locatable)var30) ? 1 : 0)) {
                                                    AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[23]];
                                                    Movement.walkTo((WorldPoint)var30.getWorldLocation());
                                                    0;
                                                    Time.sleepTicks((int)lllIlIIlII[0]);
                                                    0;
                                                }
                                                if (V.llIIIlIIlIlll(Reachable.isInteractable((Locatable)var30) ? 1 : 0)) {
                                                    AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[24]];
                                                    var30.interact(lllIlIIIII[lllIlIIlII[25]]);
                                                    Time.sleepTicks((int)lllIlIIlII[8]);
                                                    0;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        int[] nArray8 = new int[lllIlIIlII[0]];
                        nArray8[V.lllIlIIlII[1]] = lllIlIIlII[11];
                        if (!V.llIIIlIIllIIl(Inventory.contains((int[])nArray8) ? 1 : 0)) break block136;
                        int[] nArray9 = new int[lllIlIIlII[0]];
                        nArray9[V.lllIlIIlII[1]] = lllIlIIlII[19];
                        if (!V.llIIIlIIlIlll(Inventory.contains((int[])nArray9) ? 1 : 0)) break block137;
                    }
                    int[] nArray = new int[lllIlIIlII[0]];
                    nArray[V.lllIlIIlII[1]] = lllIlIIlII[19];
                    if (V.llIIIlIIllIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray10 = new int[lllIlIIlII[0]];
                        nArray10[V.lllIlIIlII[1]] = lllIlIIlII[11];
                        if (V.llIIIlIIlIlll(Inventory.contains((int[])nArray10) ? 1 : 0)) {
                            AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[26]];
                            int[] nArray11 = new int[lllIlIIlII[0]];
                            nArray11[V.lllIlIIlII[1]] = lllIlIIlII[11];
                            int[] nArray12 = new int[lllIlIIlII[0]];
                            nArray12[V.lllIlIIlII[1]] = lllIlIIlII[9];
                            Inventory.getFirst((int[])nArray11).useOn(Inventory.getFirst((int[])nArray12));
                            Time.sleepTicks((int)lllIlIIlII[0]);
                            0;
                        }
                    }
                    int[] nArray13 = new int[lllIlIIlII[0]];
                    nArray13[V.lllIlIIlII[1]] = lllIlIIlII[19];
                    if (V.llIIIlIIlIlll(Inventory.contains((int[])nArray13) ? 1 : 0)) {
                        String[] stringArray = new String[lllIlIIlII[0]];
                        stringArray[V.lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[27]];
                        if (V.llIIIlIIllIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                            if (V.llIIIlIIlllIl(Players.getLocal().getWorldLocation().distanceTo(me), lllIlIIlII[4])) {
                                AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[28]];
                                Movement.walkTo((WorldPoint)me);
                                0;
                                Time.sleepTicks((int)lllIlIIlII[0]);
                                0;
                            }
                            if (V.llIIIlIIllllI(Players.getLocal().getWorldLocation().distanceTo(me), lllIlIIlII[4])) {
                                AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[29]];
                                String[] stringArray2 = new String[lllIlIIlII[0]];
                                stringArray2[V.lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[30]];
                                TileObjects.getNearest((String[])stringArray2).interact(lllIlIIIII[lllIlIIlII[31]]);
                                Time.sleepTicks((int)lllIlIIlII[20]);
                                0;
                            }
                        }
                        String[] stringArray3 = new String[lllIlIIlII[0]];
                        stringArray3[V.lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[32]];
                        if (V.llIIIlIIlIlll(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                            if (V.llIIIlIIlllIl(Players.getLocal().getWorldLocation().distanceTo(mf), lllIlIIlII[8])) {
                                AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[33]];
                                Movement.walkTo((WorldPoint)mf);
                                0;
                                Time.sleepTicks((int)lllIlIIlII[0]);
                                0;
                            }
                            if (V.llIIIlIIllllI(Players.getLocal().getWorldLocation().distanceTo(mf), lllIlIIlII[8])) {
                                int[] nArray14 = new int[lllIlIIlII[0]];
                                nArray14[V.lllIlIIlII[1]] = lllIlIIlII[19];
                                String[] stringArray4 = new String[lllIlIIlII[0]];
                                stringArray4[V.lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[34]];
                                Inventory.getFirst((int[])nArray14).useOn(TileObjects.getNearest((String[])stringArray4));
                                Time.sleepTicks((int)lllIlIIlII[0]);
                                0;
                            }
                        }
                    }
                }
                String[] stringArray = new String[lllIlIIlII[0]];
                stringArray[V.lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[35]];
                if (V.llIIIlIIlIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    int[] nArray = new int[lllIlIIlII[0]];
                    nArray[V.lllIlIIlII[1]] = lllIlIIlII[19];
                    if (V.llIIIlIIllIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        String[] stringArray5 = new String[lllIlIIlII[0]];
                        stringArray5[V.lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[36]];
                        if (V.llIIIlIIllIIl(Inventory.contains((String[])stringArray5) ? 1 : 0)) {
                            AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[37]];
                            if (V.llIIIlIIllIIl(Dialog.isOpen() ? 1 : 0)) {
                                String[] stringArray6 = new String[lllIlIIlII[0]];
                                stringArray6[V.lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[38]];
                                TileObjects.getNearest((String[])stringArray6).interact(lllIlIIIII[lllIlIIlII[39]]);
                                Time.sleepTicks((int)lllIlIIlII[4]);
                                0;
                            }
                            g.a(cE);
                        }
                    }
                }
                String[] stringArray7 = new String[lllIlIIlII[0]];
                stringArray7[V.lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[40]];
                if (V.llIIIlIIlIlll(Inventory.contains((String[])stringArray7) ? 1 : 0)) {
                    String[] stringArray8 = new String[lllIlIIlII[0]];
                    stringArray8[V.lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[41]];
                    if (V.llIIIlIIlIlll(Inventory.contains((String[])stringArray8) ? 1 : 0)) {
                        String[] stringArray9 = new String[lllIlIIlII[0]];
                        stringArray9[V.lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[42]];
                        if (V.llIIIlIIllIIl(Inventory.contains((String[])stringArray9) ? 1 : 0)) {
                            var15 = new WorldPoint(lllIlIIlII[43], lllIlIIlII[44], lllIlIIlII[1]);
                            var30 = new WorldPoint(lllIlIIlII[21], lllIlIIlII[44], lllIlIIlII[1]);
                            var21 = new WorldArea(lllIlIIlII[21], lllIlIIlII[45], lllIlIIlII[14], lllIlIIlII[8], lllIlIIlII[1]);
                            if (V.llIIIlIIllIIl(Players.getLocal().getWorldLocation().equals((Object)var15) ? 1 : 0) && V.llIIIlIIllIIl(Players.getLocal().getWorldLocation().equals((Object)var30) ? 1 : 0) && V.llIIIlIIllIIl(var21.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[46]];
                                Movement.walkTo((WorldPoint)var15);
                                0;
                                Time.sleepTicks((int)lllIlIIlII[0]);
                                0;
                            }
                            if (V.llIIIlIIlIlll(Players.getLocal().getWorldLocation().equals((Object)var15) ? 1 : 0)) {
                                String[] stringArray10 = new String[lllIlIIlII[0]];
                                stringArray10[V.lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[47]];
                                TileObjects.getNearest((String[])stringArray10).interact(lllIlIIIII[lllIlIIlII[48]]);
                                Time.sleepTicks((int)lllIlIIlII[3]);
                                0;
                            }
                            if (V.llIIIlIIlIlll(var21.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[49]];
                                String[] stringArray11 = new String[lllIlIIlII[0]];
                                stringArray11[V.lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[50]];
                                TileItems.getNearest((String[])stringArray11).interact(lllIlIIIII[lllIlIIlII[51]]);
                                Time.sleepTicks((int)lllIlIIlII[8]);
                                0;
                            }
                        }
                    }
                }
                String[] stringArray12 = new String[lllIlIIlII[0]];
                stringArray12[V.lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[52]];
                if (V.llIIIlIIlIlll(Inventory.contains((String[])stringArray12) ? 1 : 0)) {
                    String[] stringArray13 = new String[lllIlIIlII[0]];
                    stringArray13[V.lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[53]];
                    if (V.llIIIlIIllIIl(Inventory.contains((String[])stringArray13) ? 1 : 0)) {
                        var15 = new WorldArea(lllIlIIlII[21], lllIlIIlII[45], lllIlIIlII[14], lllIlIIlII[8], lllIlIIlII[1]);
                        var30 = new WorldArea(lllIlIIlII[54], lllIlIIlII[55], lllIlIIlII[18], lllIlIIlII[23], lllIlIIlII[1]);
                        if (V.llIIIlIIlIlll(var15.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] stringArray14 = new String[lllIlIIlII[0]];
                            stringArray14[V.lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[56]];
                            TileObjects.getNearest((String[])stringArray14).interact(lllIlIIIII[lllIlIIlII[57]]);
                            Time.sleepTicks((int)lllIlIIlII[3]);
                            0;
                        }
                        if (V.llIIIlIIllIIl(var30.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && V.llIIIlIIllIIl(mj.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[58]];
                            Movement.walkTo((WorldPoint)mg);
                            0;
                            Time.sleepTicks((int)lllIlIIlII[0]);
                            0;
                        }
                        if (V.llIIIlIIlIlll(var30.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] stringArray15 = new String[lllIlIIlII[0]];
                            stringArray15[V.lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[59]];
                            TileObjects.getNearest((String[])stringArray15).interact(lllIlIIIII[lllIlIIlII[60]]);
                            Time.sleepTicks((int)lllIlIIlII[4]);
                            0;
                        }
                        if (V.llIIIlIIlIlll(mj.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            WorldPoint var18;
                            WorldPoint var10;
                            WorldPoint var27;
                            var21 = new WorldPoint(lllIlIIlII[21], lllIlIIlII[61], lllIlIIlII[1]);
                            WorldPoint var34 = new WorldPoint(lllIlIIlII[62], lllIlIIlII[63], lllIlIIlII[1]);
                            WorldPoint lllllllllllllllllIllIlllllIIlIIl = new WorldPoint(lllIlIIlII[64], lllIlIIlII[65], lllIlIIlII[1]);
                            WorldPoint lllllllllllllllllIllIlllllIIlIII = new WorldPoint(lllIlIIlII[43], lllIlIIlII[66], lllIlIIlII[1]);
                            WorldPoint var35 = new WorldPoint(lllIlIIlII[67], lllIlIIlII[66], lllIlIIlII[1]);
                            WorldPoint var28 = new WorldPoint(lllIlIIlII[67], lllIlIIlII[66], lllIlIIlII[1]);
                            WorldArea var13 = new WorldArea(lllIlIIlII[68], lllIlIIlII[69], lllIlIIlII[20], lllIlIIlII[23], lllIlIIlII[1]);
                            WorldArea var12 = new WorldArea(lllIlIIlII[70], lllIlIIlII[71], lllIlIIlII[14], lllIlIIlII[17], lllIlIIlII[1]);
                            WorldArea var31 = new WorldArea(lllIlIIlII[72], lllIlIIlII[73], lllIlIIlII[32], lllIlIIlII[25], lllIlIIlII[1]);
                            if (V.llIIIlIlIIIII(Vars.getBit((int)lllIlIIlII[74]), lllIlIIlII[0]) && V.llIIIlIIllIIl(Vars.getBit((int)lllIlIIlII[75]))) {
                                if (V.llIIIlIIllIIl(Players.getLocal().getWorldLocation().equals((Object)var21) ? 1 : 0)) {
                                    AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[76]];
                                    Movement.walkTo((WorldPoint)var21);
                                    0;
                                    Time.sleepTicks((int)lllIlIIlII[0]);
                                    0;
                                }
                                if (V.llIIIlIIlIlll(Players.getLocal().getWorldLocation().equals((Object)var21) ? 1 : 0)) {
                                    AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[77]];
                                    String[] stringArray16 = new String[lllIlIIlII[0]];
                                    stringArray16[V.lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[78]];
                                    TileObjects.getNearest((String[])stringArray16).interact(lllIlIIIII[lllIlIIlII[79]]);
                                    Time.sleepTicks((int)lllIlIIlII[8]);
                                    0;
                                }
                            }
                            if (V.llIIIlIIlllll(Vars.getBit((int)lllIlIIlII[74]), lllIlIIlII[0]) && V.llIIIlIIllIIl(Vars.getBit((int)lllIlIIlII[80])) && V.llIIIlIIllIIl(Vars.getBit((int)lllIlIIlII[75]))) {
                                if (V.llIIIlIIllIIl(Players.getLocal().getWorldLocation().equals((Object)var34) ? 1 : 0)) {
                                    AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[81]];
                                    Movement.walkTo((WorldPoint)var34);
                                    0;
                                    Time.sleepTicks((int)lllIlIIlII[0]);
                                    0;
                                }
                                if (V.llIIIlIIlIlll(Players.getLocal().getWorldLocation().equals((Object)var34) ? 1 : 0)) {
                                    AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[82]];
                                    String[] stringArray17 = new String[lllIlIIlII[0]];
                                    stringArray17[V.lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[15]];
                                    TileObjects.getNearest((String[])stringArray17).interact(lllIlIIIII[lllIlIIlII[83]]);
                                    Time.sleepTicks((int)lllIlIIlII[8]);
                                    0;
                                }
                            }
                            if (V.llIIIlIIlllll(Vars.getBit((int)lllIlIIlII[74]), lllIlIIlII[0]) && V.llIIIlIIlllll(Vars.getBit((int)lllIlIIlII[80]), lllIlIIlII[0]) && V.llIIIlIIllIIl(Vars.getBit((int)lllIlIIlII[75]))) {
                                if (V.llIIIlIIllIIl(var13.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    var27 = new WorldPoint(lllIlIIlII[21], lllIlIIlII[84], lllIlIIlII[1]);
                                    if (V.llIIIlIIllIIl(Players.getLocal().getWorldLocation().equals((Object)var27) ? 1 : 0)) {
                                        AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[85]];
                                        Movement.walkTo((WorldPoint)var27);
                                        0;
                                        Time.sleepTicks((int)lllIlIIlII[0]);
                                        0;
                                    }
                                    if (V.llIIIlIIlIlll(Players.getLocal().getWorldLocation().equals((Object)var27) ? 1 : 0)) {
                                        String[] stringArray18 = new String[lllIlIIlII[0]];
                                        stringArray18[V.lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[86]];
                                        TileObjects.getNearest((String[])stringArray18).interact(lllIlIIIII[lllIlIIlII[87]]);
                                        Time.sleepTicks((int)lllIlIIlII[8]);
                                        0;
                                    }
                                }
                                if (V.llIIIlIIlIlll(var13.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[88]];
                                    String[] stringArray19 = new String[lllIlIIlII[0]];
                                    stringArray19[V.lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[89]];
                                    TileObjects.getNearest((String[])stringArray19).interact(lllIlIIIII[lllIlIIlII[90]]);
                                    Time.sleepTicks((int)lllIlIIlII[8]);
                                    0;
                                }
                            }
                            if (V.llIIIlIIlllll(Vars.getBit((int)lllIlIIlII[74]), lllIlIIlII[0]) && V.llIIIlIIlllll(Vars.getBit((int)lllIlIIlII[80]), lllIlIIlII[0]) && V.llIIIlIIlllll(Vars.getBit((int)lllIlIIlII[75]), lllIlIIlII[0])) {
                                if (V.llIIIlIIlIlll(var13.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    var27 = new WorldPoint(lllIlIIlII[21], lllIlIIlII[91], lllIlIIlII[1]);
                                    if (V.llIIIlIIllIIl(Players.getLocal().getWorldLocation().equals((Object)var27) ? 1 : 0)) {
                                        AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[92]];
                                        Movement.walkTo((WorldPoint)var27);
                                        0;
                                        Time.sleepTicks((int)lllIlIIlII[0]);
                                        0;
                                    }
                                    if (V.llIIIlIIlIlll(Players.getLocal().getWorldLocation().equals((Object)var27) ? 1 : 0)) {
                                        String[] stringArray20 = new String[lllIlIIlII[0]];
                                        stringArray20[V.lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[93]];
                                        TileObjects.getNearest((String[])stringArray20).interact(lllIlIIIII[lllIlIIlII[94]]);
                                        Time.sleepTicks((int)lllIlIIlII[8]);
                                        0;
                                    }
                                }
                                if (V.llIIIlIIllIIl(var13.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (V.llIIIlIIllIIl(Players.getLocal().getWorldLocation().equals((Object)var34) ? 1 : 0)) {
                                        AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[95]];
                                        Movement.walkTo((WorldPoint)var34);
                                        0;
                                        Time.sleepTicks((int)lllIlIIlII[0]);
                                        0;
                                    }
                                    if (V.llIIIlIIlIlll(Players.getLocal().getWorldLocation().equals((Object)var34) ? 1 : 0)) {
                                        AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[96]];
                                        String[] stringArray21 = new String[lllIlIIlII[0]];
                                        stringArray21[V.lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[97]];
                                        TileObjects.getNearest((String[])stringArray21).interact(lllIlIIIII[lllIlIIlII[98]]);
                                        Time.sleepTicks((int)lllIlIIlII[8]);
                                        0;
                                    }
                                }
                            }
                            if (V.llIIIlIIlllll(Vars.getBit((int)lllIlIIlII[74]), lllIlIIlII[0]) && V.llIIIlIIllIIl(Vars.getBit((int)lllIlIIlII[80])) && V.llIIIlIIlllll(Vars.getBit((int)lllIlIIlII[75]), lllIlIIlII[0])) {
                                if (V.llIIIlIIllIIl(Players.getLocal().getWorldLocation().equals((Object)var21) ? 1 : 0)) {
                                    AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[99]];
                                    Movement.walkTo((WorldPoint)var21);
                                    0;
                                    Time.sleepTicks((int)lllIlIIlII[0]);
                                    0;
                                }
                                if (V.llIIIlIIlIlll(Players.getLocal().getWorldLocation().equals((Object)var21) ? 1 : 0)) {
                                    AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[100]];
                                    String[] stringArray22 = new String[lllIlIIlII[0]];
                                    stringArray22[V.lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[101]];
                                    TileObjects.getNearest((String[])stringArray22).interact(lllIlIIIII[lllIlIIlII[102]]);
                                    Time.sleepTicks((int)lllIlIIlII[8]);
                                    0;
                                }
                            }
                            if (V.llIIIlIIllIIl(Vars.getBit((int)lllIlIIlII[74])) && V.llIIIlIIllIIl(Vars.getBit((int)lllIlIIlII[80])) && V.llIIIlIIlllll(Vars.getBit((int)lllIlIIlII[75]), lllIlIIlII[0]) && V.llIIIlIIllIIl(Vars.getBit((int)lllIlIIlII[103])) && V.llIIIlIIllIIl(V.dM() ? 1 : 0)) {
                                if (V.llIIIlIIllIIl(var12.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (V.llIIIlIIlIlll(var31.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        var27 = new WorldPoint(lllIlIIlII[104], lllIlIIlII[84], lllIlIIlII[1]);
                                        if (V.llIIIlIIllIIl(Players.getLocal().getWorldLocation().equals((Object)var27) ? 1 : 0)) {
                                            AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[105]];
                                            Movement.walkTo((WorldPoint)var27);
                                            0;
                                            Time.sleepTicks((int)lllIlIIlII[0]);
                                            0;
                                        }
                                        if (V.llIIIlIIlIlll(Players.getLocal().getWorldLocation().equals((Object)var27) ? 1 : 0)) {
                                            String[] stringArray23 = new String[lllIlIIlII[0]];
                                            stringArray23[V.lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[106]];
                                            TileObjects.getNearest((String[])stringArray23).interact(lllIlIIIII[lllIlIIlII[107]]);
                                            Time.sleepTicks((int)lllIlIIlII[8]);
                                            0;
                                        }
                                    }
                                    if (V.llIIIlIIlIlll((var27 = new WorldArea(lllIlIIlII[72], lllIlIIlII[69], lllIlIIlII[14], lllIlIIlII[14], lllIlIIlII[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && V.llIIIlIIllIIl(V.dM() ? 1 : 0)) {
                                        var10 = new WorldPoint(lllIlIIlII[108], lllIlIIlII[109], lllIlIIlII[1]);
                                        if (V.llIIIlIIllIIl(Players.getLocal().getWorldLocation().equals((Object)var10) ? 1 : 0)) {
                                            AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[110]];
                                            Movement.walkTo((WorldPoint)var10);
                                            0;
                                            Time.sleepTicks((int)lllIlIIlII[0]);
                                            0;
                                        }
                                        if (V.llIIIlIIlIlll(Players.getLocal().getWorldLocation().equals((Object)var10) ? 1 : 0)) {
                                            String[] stringArray24 = new String[lllIlIIlII[0]];
                                            stringArray24[V.lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[111]];
                                            TileObjects.getNearest((String[])stringArray24).interact(lllIlIIIII[lllIlIIlII[112]]);
                                            Time.sleepTicks((int)lllIlIIlII[8]);
                                            0;
                                        }
                                    }
                                    if (V.llIIIlIIlIlll((var10 = new WorldArea(lllIlIIlII[70], lllIlIIlII[69], lllIlIIlII[14], lllIlIIlII[14], lllIlIIlII[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        var18 = new WorldPoint(lllIlIIlII[67], lllIlIIlII[113], lllIlIIlII[1]);
                                        if (V.llIIIlIIllIIl(Players.getLocal().getWorldLocation().equals((Object)var18) ? 1 : 0)) {
                                            AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[114]];
                                            Movement.walkTo((WorldPoint)var18);
                                            0;
                                            Time.sleepTicks((int)lllIlIIlII[0]);
                                            0;
                                        }
                                        if (V.llIIIlIIlIlll(Players.getLocal().getWorldLocation().equals((Object)var18) ? 1 : 0)) {
                                            String[] stringArray25 = new String[lllIlIIlII[0]];
                                            stringArray25[V.lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[115]];
                                            TileObjects.getNearest((String[])stringArray25).interact(lllIlIIIII[lllIlIIlII[116]]);
                                            Time.sleepTicks((int)lllIlIIlII[8]);
                                            0;
                                        }
                                    }
                                }
                                if (V.llIIIlIIlIlll(var12.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && V.llIIIlIIllIIl(V.dM() ? 1 : 0)) {
                                    if (V.llIIIlIIllIIl(Players.getLocal().getWorldLocation().equals((Object)var35) ? 1 : 0)) {
                                        AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[117]];
                                        Movement.walkTo((WorldPoint)var35);
                                        0;
                                        Time.sleepTicks((int)lllIlIIlII[0]);
                                        0;
                                    }
                                    if (V.llIIIlIIlIlll(Players.getLocal().getWorldLocation().equals((Object)var35) ? 1 : 0)) {
                                        AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[118]];
                                        String[] stringArray26 = new String[lllIlIIlII[0]];
                                        stringArray26[V.lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[119]];
                                        TileObjects.getNearest((String[])stringArray26).interact(lllIlIIIII[lllIlIIlII[120]]);
                                        Time.sleepTicks((int)lllIlIIlII[8]);
                                        0;
                                    }
                                }
                            }
                            if (V.llIIIlIIllIIl(Vars.getBit((int)lllIlIIlII[74])) && V.llIIIlIIllIIl(Vars.getBit((int)lllIlIIlII[80])) && V.llIIIlIIlllll(Vars.getBit((int)lllIlIIlII[75]), lllIlIIlII[0]) && V.llIIIlIIlllll(Vars.getBit((int)lllIlIIlII[103]), lllIlIIlII[0]) && V.llIIIlIIllIIl(Vars.getBit((int)lllIlIIlII[121]))) {
                                if (V.llIIIlIIllIIl(Players.getLocal().getWorldLocation().equals((Object)var28) ? 1 : 0)) {
                                    AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[122]];
                                    Movement.walkTo((WorldPoint)var28);
                                    0;
                                    Time.sleepTicks((int)lllIlIIlII[0]);
                                    0;
                                }
                                if (V.llIIIlIIlIlll(Players.getLocal().getWorldLocation().equals((Object)var28) ? 1 : 0)) {
                                    AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[123]];
                                    String[] stringArray27 = new String[lllIlIIlII[0]];
                                    stringArray27[V.lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[124]];
                                    TileObjects.getNearest((String[])stringArray27).interact(lllIlIIIII[lllIlIIlII[125]]);
                                    Time.sleepTicks((int)lllIlIIlII[8]);
                                    0;
                                }
                            }
                            if (V.llIIIlIIllIIl(Vars.getBit((int)lllIlIIlII[74])) && V.llIIIlIIllIIl(Vars.getBit((int)lllIlIIlII[80])) && V.llIIIlIIlllll(Vars.getBit((int)lllIlIIlII[75]), lllIlIIlII[0]) && V.llIIIlIIlllll(Vars.getBit((int)lllIlIIlII[103]), lllIlIIlII[0]) && V.llIIIlIIlllll(Vars.getBit((int)lllIlIIlII[121]), lllIlIIlII[0]) && V.llIIIlIIllIIl(Vars.getBit((int)lllIlIIlII[126]))) {
                                var27 = new WorldArea(lllIlIIlII[72], lllIlIIlII[71], lllIlIIlII[14], lllIlIIlII[14], lllIlIIlII[1]);
                                if (V.llIIIlIIlIlll(var12.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    var10 = new WorldPoint(lllIlIIlII[127], lllIlIIlII[66], lllIlIIlII[1]);
                                    if (V.llIIIlIIllIIl(Players.getLocal().getWorldLocation().equals((Object)var10) ? 1 : 0)) {
                                        AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[128]];
                                        Movement.walkTo((WorldPoint)var10);
                                        0;
                                        Time.sleepTicks((int)lllIlIIlII[0]);
                                        0;
                                    }
                                    if (V.llIIIlIIlIlll(Players.getLocal().getWorldLocation().equals((Object)var10) ? 1 : 0)) {
                                        String[] stringArray28 = new String[lllIlIIlII[0]];
                                        stringArray28[V.lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[129]];
                                        TileObjects.getNearest((String[])stringArray28).interact(lllIlIIIII[lllIlIIlII[130]]);
                                        Time.sleepTicks((int)lllIlIIlII[8]);
                                        0;
                                    }
                                }
                                if (V.llIIIlIIlIlll(var27.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    var10 = new WorldPoint(lllIlIIlII[131], lllIlIIlII[66], lllIlIIlII[1]);
                                    if (V.llIIIlIIllIIl(Players.getLocal().getWorldLocation().equals((Object)var10) ? 1 : 0)) {
                                        AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[132]];
                                        Movement.walkTo((WorldPoint)var10);
                                        0;
                                        Time.sleepTicks((int)lllIlIIlII[0]);
                                        0;
                                    }
                                    if (V.llIIIlIIlIlll(Players.getLocal().getWorldLocation().equals((Object)var10) ? 1 : 0)) {
                                        String[] stringArray29 = new String[lllIlIIlII[0]];
                                        stringArray29[V.lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[133]];
                                        TileObjects.getNearest((String[])stringArray29).interact(lllIlIIIII[lllIlIIlII[134]]);
                                        Time.sleepTicks((int)lllIlIIlII[8]);
                                        0;
                                    }
                                }
                                if (V.llIIIlIIlIlll(var13.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[135]];
                                    String[] stringArray30 = new String[lllIlIIlII[0]];
                                    stringArray30[V.lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[136]];
                                    TileObjects.getNearest((String[])stringArray30).interact(lllIlIIIII[lllIlIIlII[137]]);
                                    Time.sleepTicks((int)lllIlIIlII[16]);
                                    0;
                                }
                            }
                            if (V.llIIIlIIllIIl(Vars.getBit((int)lllIlIIlII[74])) && V.llIIIlIIllIIl(Vars.getBit((int)lllIlIIlII[80])) && V.llIIIlIIlllll(Vars.getBit((int)lllIlIIlII[75]), lllIlIIlII[0]) && V.llIIIlIIlllll(Vars.getBit((int)lllIlIIlII[103]), lllIlIIlII[0]) && V.llIIIlIIlllll(Vars.getBit((int)lllIlIIlII[121]), lllIlIIlII[0]) && V.llIIIlIIlllll(Vars.getBit((int)lllIlIIlII[126]), lllIlIIlII[0])) {
                                var27 = new WorldArea(lllIlIIlII[72], lllIlIIlII[71], lllIlIIlII[14], lllIlIIlII[14], lllIlIIlII[1]);
                                if (V.llIIIlIIlIlll(var13.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    var10 = new WorldPoint(lllIlIIlII[138], lllIlIIlII[66], lllIlIIlII[1]);
                                    if (V.llIIIlIIllIIl(Players.getLocal().getWorldLocation().equals((Object)var10) ? 1 : 0)) {
                                        AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[139]];
                                        Movement.walkTo((WorldPoint)var10);
                                        0;
                                        Time.sleepTicks((int)lllIlIIlII[0]);
                                        0;
                                    }
                                    if (V.llIIIlIIlIlll(Players.getLocal().getWorldLocation().equals((Object)var10) ? 1 : 0)) {
                                        String[] stringArray31 = new String[lllIlIIlII[0]];
                                        stringArray31[V.lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[140]];
                                        TileObjects.getNearest((String[])stringArray31).interact(lllIlIIIII[lllIlIIlII[141]]);
                                        Time.sleepTicks((int)lllIlIIlII[8]);
                                        0;
                                    }
                                }
                                if (V.llIIIlIIlIlll(var27.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    var10 = new WorldPoint(lllIlIIlII[108], lllIlIIlII[66], lllIlIIlII[1]);
                                    if (V.llIIIlIIllIIl(Players.getLocal().getWorldLocation().equals((Object)var10) ? 1 : 0)) {
                                        AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[142]];
                                        Movement.walkTo((WorldPoint)var10);
                                        0;
                                        Time.sleepTicks((int)lllIlIIlII[0]);
                                        0;
                                    }
                                    if (V.llIIIlIIlIlll(Players.getLocal().getWorldLocation().equals((Object)var10) ? 1 : 0)) {
                                        String[] stringArray32 = new String[lllIlIIlII[0]];
                                        stringArray32[V.lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[143]];
                                        TileObjects.getNearest((String[])stringArray32).interact(lllIlIIIII[lllIlIIlII[144]]);
                                        Time.sleepTicks((int)lllIlIIlII[8]);
                                        0;
                                    }
                                }
                                if (V.llIIIlIIlIlll(var12.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (V.llIIIlIIllIIl(Players.getLocal().getWorldLocation().equals((Object)var35) ? 1 : 0)) {
                                        AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[145]];
                                        Movement.walkTo((WorldPoint)var35);
                                        0;
                                        Time.sleepTicks((int)lllIlIIlII[0]);
                                        0;
                                    }
                                    if (V.llIIIlIIlIlll(Players.getLocal().getWorldLocation().equals((Object)var35) ? 1 : 0)) {
                                        AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[146]];
                                        String[] stringArray33 = new String[lllIlIIlII[0]];
                                        stringArray33[V.lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[147]];
                                        TileObjects.getNearest((String[])stringArray33).interact(lllIlIIIII[lllIlIIlII[148]]);
                                        Time.sleepTicks((int)lllIlIIlII[8]);
                                        0;
                                    }
                                }
                            }
                            if (V.llIIIlIIllIIl(Vars.getBit((int)lllIlIIlII[74])) && V.llIIIlIIllIIl(Vars.getBit((int)lllIlIIlII[80])) && V.llIIIlIIlllll(Vars.getBit((int)lllIlIIlII[75]), lllIlIIlII[0]) && V.llIIIlIIllIIl(Vars.getBit((int)lllIlIIlII[103])) && V.llIIIlIIlllll(Vars.getBit((int)lllIlIIlII[121]), lllIlIIlII[0]) && V.llIIIlIIlllll(Vars.getBit((int)lllIlIIlII[126]), lllIlIIlII[0])) {
                                var27 = new WorldArea(lllIlIIlII[72], lllIlIIlII[71], lllIlIIlII[14], lllIlIIlII[14], lllIlIIlII[1]);
                                if (V.llIIIlIIlIlll(var12.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    var10 = new WorldPoint(lllIlIIlII[127], lllIlIIlII[66], lllIlIIlII[1]);
                                    if (V.llIIIlIIllIIl(Players.getLocal().getWorldLocation().equals((Object)var10) ? 1 : 0)) {
                                        AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[149]];
                                        Movement.walkTo((WorldPoint)var10);
                                        0;
                                        Time.sleepTicks((int)lllIlIIlII[0]);
                                        0;
                                    }
                                    if (V.llIIIlIIlIlll(Players.getLocal().getWorldLocation().equals((Object)var10) ? 1 : 0)) {
                                        String[] stringArray34 = new String[lllIlIIlII[0]];
                                        stringArray34[V.lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[150]];
                                        TileObjects.getNearest((String[])stringArray34).interact(lllIlIIIII[lllIlIIlII[151]]);
                                        Time.sleepTicks((int)lllIlIIlII[8]);
                                        0;
                                    }
                                }
                                if (V.llIIIlIIlIlll(var27.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    var10 = new WorldPoint(lllIlIIlII[104], lllIlIIlII[152], lllIlIIlII[1]);
                                    if (V.llIIIlIIllIIl(Players.getLocal().getWorldLocation().equals((Object)var10) ? 1 : 0)) {
                                        AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[153]];
                                        Movement.walkTo((WorldPoint)var10);
                                        0;
                                        Time.sleepTicks((int)lllIlIIlII[0]);
                                        0;
                                    }
                                    if (V.llIIIlIIlIlll(Players.getLocal().getWorldLocation().equals((Object)var10) ? 1 : 0)) {
                                        Time.sleepTicks((int)lllIlIIlII[0]);
                                        0;
                                        String[] stringArray35 = new String[lllIlIIlII[0]];
                                        stringArray35[V.lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[154]];
                                        TileObjects.getNearest((String[])stringArray35).interact(lllIlIIIII[lllIlIIlII[155]]);
                                        Time.sleepTicks((int)lllIlIIlII[8]);
                                        0;
                                    }
                                }
                                if (V.llIIIlIIlIlll((var10 = new WorldArea(lllIlIIlII[72], lllIlIIlII[69], lllIlIIlII[14], lllIlIIlII[14], lllIlIIlII[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && V.llIIIlIIllIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                                    AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[156]];
                                    Time.sleepTicks((int)lllIlIIlII[0]);
                                    0;
                                    int[] nArray = new int[lllIlIIlII[0]];
                                    nArray[V.lllIlIIlII[1]] = lllIlIIlII[157];
                                    TileObjects.getNearest((int[])nArray).interact(lllIlIIIII[lllIlIIlII[158]]);
                                    Time.sleepTicks((int)lllIlIIlII[8]);
                                    0;
                                }
                                if (V.llIIIlIIlIlll(var31.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    int[] nArray = new int[lllIlIIlII[0]];
                                    nArray[V.lllIlIIlII[1]] = lllIlIIlII[159];
                                    TileObjects.getNearest((int[])nArray).interact(lllIlIIIII[lllIlIIlII[160]]);
                                    Time.sleepTicks((int)lllIlIIlII[8]);
                                    0;
                                }
                                if (V.llIIIlIIlIlll((var18 = new WorldArea(lllIlIIlII[161], lllIlIIlII[162], lllIlIIlII[23], lllIlIIlII[14], lllIlIIlII[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    String[] stringArray36 = new String[lllIlIIlII[0]];
                                    stringArray36[V.lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[163]];
                                    if (V.llIIIlIIllIIl(Inventory.contains((String[])stringArray36) ? 1 : 0)) {
                                        String[] stringArray37 = new String[lllIlIIlII[0]];
                                        stringArray37[V.lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[164]];
                                        TileItems.getNearest((String[])stringArray37).interact(lllIlIIIII[lllIlIIlII[165]]);
                                        Time.sleepTicks((int)lllIlIIlII[14]);
                                        0;
                                    }
                                }
                            }
                        }
                    }
                }
                String[] stringArray38 = new String[lllIlIIlII[0]];
                stringArray38[V.lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[166]];
                if (V.llIIIlIIlIlll(Inventory.contains((String[])stringArray38) ? 1 : 0)) {
                    String[] stringArray39 = new String[lllIlIIlII[0]];
                    stringArray39[V.lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[167]];
                    if (V.llIIIlIIlIlll(Inventory.contains((String[])stringArray39) ? 1 : 0)) {
                        var15 = new WorldArea(lllIlIIlII[161], lllIlIIlII[162], lllIlIIlII[23], lllIlIIlII[14], lllIlIIlII[1]);
                        if (V.llIIIlIIlIlll(var15.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            int[] nArray = new int[lllIlIIlII[0]];
                            nArray[V.lllIlIIlII[1]] = lllIlIIlII[159];
                            TileObjects.getNearest((int[])nArray).interact(lllIlIIIII[lllIlIIlII[168]]);
                            Time.sleepTicks((int)lllIlIIlII[14]);
                            0;
                        }
                        if (V.llIIIlIIlllIl(Players.getLocal().getWorldLocation().distanceTo(mh), lllIlIIlII[10])) {
                            AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[169]];
                            Movement.walkTo((WorldPoint)mh);
                            0;
                            Time.sleepTicks((int)lllIlIIlII[0]);
                            0;
                        }
                        if (V.llIIIlIIllllI(Players.getLocal().getWorldLocation().distanceTo(mh), lllIlIIlII[10])) {
                            var30 = TileObjects.getNearest(tileObject -> {
                                int n2;
                                if (V.llIIIlIIlIlll(tileObject.getName().contains(lllIlIIIII[lllIlIIlII[185]]) ? 1 : 0)) {
                                    String[] stringArray = new String[lllIlIIlII[0]];
                                    stringArray[V.lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[186]];
                                    if (V.llIIIlIIlIlll(tileObject.hasAction(stringArray) ? 1 : 0) && V.llIIIlIIllllI(tileObject.getWorldLocation().distanceTo(new WorldPoint(lllIlIIlII[21], lllIlIIlII[184], lllIlIIlII[3])), lllIlIIlII[3])) {
                                        n2 = lllIlIIlII[0];
                                        0;
                                        if (-2 < 0) return n2 != 0;
                                        return ((66 + 108 - 143 + 145 ^ 74 + 143 - 105 + 53) & (0x31 ^ 0x47 ^ (0xE9 ^ 0x8A) ^ -1)) != 0;
                                    }
                                }
                                n2 = lllIlIIlII[1];
                                return n2 != 0;
                            });
                            if (V.llIIIlIIllIlI(var30)) {
                                var30.interact(lllIlIIIII[lllIlIIlII[170]]);
                                Time.sleepTicks((int)lllIlIIlII[8]);
                                0;
                            }
                            if (V.llIIIlIlIIIIl(var30)) {
                                g.a(lllIlIIIII[lllIlIIlII[171]], cE, lllIlIIlII[0]);
                            }
                        }
                    }
                }
            }
            if (V.llIIIlIIlllll(e.j(mi), lllIlIIlII[3])) {
                if (V.llIIIlIIlllIl(Players.getLocal().getWorldLocation().distanceTo(mh), lllIlIIlII[10])) {
                    AccBuilderSotf.c = lllIlIIIII[lllIlIIlII[172]];
                    Movement.walkTo((WorldPoint)mh);
                    0;
                    Time.sleepTicks((int)lllIlIIlII[0]);
                    0;
                }
                if (V.llIIIlIIllllI(Players.getLocal().getWorldLocation().distanceTo(mh), lllIlIIlII[10])) {
                    var15 = TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (V.llIIIlIIlIlll(tileObject.getName().contains(lllIlIIIII[lllIlIIlII[182]]) ? 1 : 0)) {
                            String[] stringArray = new String[lllIlIIlII[0]];
                            stringArray[V.lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[183]];
                            if (V.llIIIlIIlIlll(tileObject.hasAction(stringArray) ? 1 : 0) && V.llIIIlIIllllI(tileObject.getWorldLocation().distanceTo(new WorldPoint(lllIlIIlII[21], lllIlIIlII[184], lllIlIIlII[3])), lllIlIIlII[3])) {
                                n2 = lllIlIIlII[0];
                                0;
                                if ((0x36 ^ 0x73 ^ (0x51 ^ 0x10)) > 0) return n2 != 0;
                                return ((0x80 ^ 0x91 ^ (0xCE ^ 0xBF)) & (26 + 6 - -127 + 6 ^ 149 + 49 - 111 + 110 ^ -1)) != 0;
                            }
                        }
                        n2 = lllIlIIlII[1];
                        return n2 != 0;
                    });
                    if (V.llIIIlIIllIlI(var15)) {
                        var15.interact(lllIlIIIII[lllIlIIlII[173]]);
                        Time.sleepTicks((int)lllIlIIlII[8]);
                        0;
                    }
                    if (V.llIIIlIlIIIIl(var15)) {
                        if (V.llIIIlIIllIII(di, lllIlIIlII[0])) {
                            aN.tb += lllIlIIlII[0];
                            aN.u(AccBuilderSotf.m);
                            di += lllIlIIlII[0];
                            aN.tb = lllIlIIlII[1];
                            dj = lllIlIIlII[1];
                        }
                        g.a(lllIlIIIII[lllIlIIlII[174]], cE, lllIlIIlII[0]);
                    }
                }
            }
            g.a(cE);
        }
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (V.llIIIlIlIIIlI(e.j(lllIlIIlII[47]), lllIlIIlII[8])) {
            bl = lllIlIIlII[0];
            0;
            if (-3 >= 0) {
                return false;
            }
        } else {
            bl = lllIlIIlII[1];
        }
        return bl;
    }

    private static boolean llIIIlIIllIII(int n2, int n3) {
        return n2 < n3;
    }

    static {
        V.llIIIlIIlIlIl();
        V.llIIIlIIIIIll();
        bv = new ArrayList<d>();
        de = new WorldPoint(lllIlIIlII[64], lllIlIIlII[187], lllIlIIlII[1]);
        me = new WorldPoint(lllIlIIlII[188], lllIlIIlII[189], lllIlIIlII[1]);
        mf = new WorldPoint(lllIlIIlII[161], lllIlIIlII[190], lllIlIIlII[1]);
        mg = new WorldPoint(lllIlIIlII[191], lllIlIIlII[192], lllIlIIlII[1]);
        mh = new WorldPoint(lllIlIIlII[64], lllIlIIlII[45], lllIlIIlII[3]);
        mi = lllIlIIlII[47];
        String[] stringArray = new String[lllIlIIlII[8]];
        stringArray[V.lllIlIIlII[1]] = lllIlIIIII[lllIlIIlII[193]];
        stringArray[V.lllIlIIlII[0]] = lllIlIIIII[lllIlIIlII[194]];
        stringArray[V.lllIlIIlII[3]] = lllIlIIIII[lllIlIIlII[195]];
        cE = stringArray;
        mj = new WorldArea(lllIlIIlII[188], lllIlIIlII[196], lllIlIIlII[50], lllIlIIlII[40], lllIlIIlII[1]);
    }

    /*
     * WARNING - void declaration
     */
    private static boolean an() {
        void var32;
        int[] nArray = new int[lllIlIIlII[4]];
        nArray[V.lllIlIIlII[1]] = lllIlIIlII[5];
        nArray[V.lllIlIIlII[0]] = lllIlIIlII[6];
        nArray[V.lllIlIIlII[3]] = lllIlIIlII[7];
        nArray[V.lllIlIIlII[8]] = lllIlIIlII[9];
        int[] nArray2 = nArray;
        int var16 = lllIlIIlII[1];
        while (V.llIIIlIIllIII(var16, ((void)var32).length)) {
            int[] nArray3 = new int[lllIlIIlII[0]];
            nArray3[V.lllIlIIlII[1]] = var32[var16];
            if (V.llIIIlIIllIIl(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return lllIlIIlII[1];
            }
            ++var16;
            0;
            if ((0x56 ^ 5 ^ (0x40 ^ 0x17)) > 1) continue;
            return ((93 + 121 - 82 + 14 ^ 76 + 96 - 148 + 137) & (0xBE ^ 0x99 ^ (0x13 ^ 7) ^ -1)) != 0;
        }
        return lllIlIIlII[0];
    }

    private static boolean llIIIlIIlllll(int n2, int n3) {
        return n2 == n3;
    }

    private static String llIIIIllllIII(String var26, String var24) {
        try {
            SecretKeySpec var33 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var24.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var19 = Cipher.getInstance("Blowfish");
            var19.init(lllIlIIlII[3], var33);
            return new String(var19.doFinal(Base64.getDecoder().decode(var26.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var4) {
            var4.printStackTrace();
            return null;
        }
    }

    @Override
    public int af() {
        try {
            V.dL();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (1 >= 3) {
            return (0xA5 ^ 0x8C) & ~(0x8C ^ 0xA5);
        }
        return lllIlIIlII[144];
    }

    private static String llIIIIlllIllI(String var11, String var8) {
        try {
            SecretKeySpec var23 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var8.getBytes(StandardCharsets.UTF_8)), lllIlIIlII[16]), "DES");
            Cipher var14 = Cipher.getInstance("DES");
            var14.init(lllIlIIlII[3], var23);
            return new String(var14.doFinal(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIlIIllIlI(Object object) {
        return object != null;
    }

    static boolean dM() {
        int n2;
        if (V.llIIIlIIllIIl(Vars.getBit((int)lllIlIIlII[74])) && V.llIIIlIIllIIl(Vars.getBit((int)lllIlIIlII[80])) && V.llIIIlIIlllll(Vars.getBit((int)lllIlIIlII[75]), lllIlIIlII[0]) && V.llIIIlIIllIIl(Vars.getBit((int)lllIlIIlII[103])) && V.llIIIlIIlllll(Vars.getBit((int)lllIlIIlII[121]), lllIlIIlII[0]) && V.llIIIlIIlllll(Vars.getBit((int)lllIlIIlII[126]), lllIlIIlII[0])) {
            n2 = lllIlIIlII[0];
            0;
            if (1 != 1) {
                return ((116 + 79 - -13 + 8 ^ 100 + 74 - 107 + 70) & (0x3B ^ 0x3C ^ (0x70 ^ 0x26) ^ -1)) != 0;
            }
        } else {
            n2 = lllIlIIlII[1];
        }
        return n2 != 0;
    }

    private static String llIIIIlllIlll(String var20, String var3) {
        var20 = new String(Base64.getDecoder().decode(var20.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var5 = new StringBuilder();
        char[] var29 = var3.toCharArray();
        int var25 = lllIlIIlII[1];
        char[] var17 = var20.toCharArray();
        int var7 = var17.length;
        int var6 = lllIlIIlII[1];
        while (V.llIIIlIIllIII(var6, var7)) {
            char var22 = var17[var6];
            var5.append((char)(var22 ^ var29[var25 % var29.length]));
            0;
            ++var25;
            ++var6;
            0;
            if ((0x8D ^ 0x89) >= 0) continue;
            return null;
        }
        return String.valueOf(var5);
    }

    private static void Q() {
        block14: {
            d var1;
            block13: {
                block12: {
                    block11: {
                        Object var2;
                        int[] nArray = new int[lllIlIIlII[0]];
                        nArray[V.lllIlIIlII[1]] = lllIlIIlII[6];
                        if (V.llIIIlIIllIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                            d d2 = new d(lllIlIIlII[6], lllIlIIlII[10], lllIlIIlII[175]);
                            bv.add(d2);
                            0;
                        }
                        int[] nArray2 = new int[lllIlIIlII[0]];
                        nArray2[V.lllIlIIlII[1]] = lllIlIIlII[7];
                        if (V.llIIIlIIllIIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            var2 = new d(lllIlIIlII[7], lllIlIIlII[0], lllIlIIlII[175]);
                            bv.add((d)var2);
                            0;
                        }
                        int[] nArray3 = new int[lllIlIIlII[0]];
                        nArray3[V.lllIlIIlII[1]] = lllIlIIlII[9];
                        if (V.llIIIlIIllIIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
                            var2 = new d(lllIlIIlII[9], lllIlIIlII[0], lllIlIIlII[175]);
                            bv.add((d)var2);
                            0;
                        }
                        if (V.llIIIlIIllIIl(Bank.contains((Predicate)(var2 = item -> item.getName().toLowerCase().contains(lllIlIIIII[lllIlIIlII[181]]))) ? 1 : 0)) {
                            var1 = new d(lllIlIIlII[176], lllIlIIlII[14], lllIlIIlII[177]);
                            bv.add(var1);
                            0;
                        }
                        int[] nArray4 = new int[lllIlIIlII[0]];
                        nArray4[V.lllIlIIlII[1]] = lllIlIIlII[12];
                        if (V.llIIIlIIllIIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
                            var1 = new d(lllIlIIlII[12], lllIlIIlII[4], j.cf);
                            bv.add(var1);
                            0;
                        }
                        int[] nArray5 = new int[lllIlIIlII[0]];
                        nArray5[V.lllIlIIlII[1]] = lllIlIIlII[13];
                        if (!V.llIIIlIIlIlll(Bank.contains((int[])nArray5) ? 1 : 0)) break block11;
                        int[] nArray6 = new int[lllIlIIlII[0]];
                        nArray6[V.lllIlIIlII[1]] = lllIlIIlII[13];
                        if (!V.llIIIlIIlIlll(Bank.contains((int[])nArray6) ? 1 : 0)) break block12;
                        int[] nArray7 = new int[lllIlIIlII[0]];
                        nArray7[V.lllIlIIlII[1]] = lllIlIIlII[13];
                        if (!V.llIIIlIIllIII(Bank.getFirst((int[])nArray7).getQuantity(), lllIlIIlII[14])) break block12;
                    }
                    var1 = new d(lllIlIIlII[13], lllIlIIlII[10], lllIlIIlII[178]);
                    bv.add(var1);
                    0;
                }
                int[] nArray = new int[lllIlIIlII[0]];
                nArray[V.lllIlIIlII[1]] = lllIlIIlII[5];
                if (!V.llIIIlIIlIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block13;
                int[] nArray8 = new int[lllIlIIlII[0]];
                nArray8[V.lllIlIIlII[1]] = lllIlIIlII[5];
                if (!V.llIIIlIIlIlll(Bank.contains((int[])nArray8) ? 1 : 0)) break block14;
                int[] nArray9 = new int[lllIlIIlII[0]];
                nArray9[V.lllIlIIlII[1]] = lllIlIIlII[5];
                if (!V.llIIIlIIllIII(Bank.getFirst((int[])nArray9).getQuantity(), lllIlIIlII[27])) break block14;
            }
            var1 = new d(lllIlIIlII[5], lllIlIIlII[57], lllIlIIlII[179]);
            bv.add(var1);
            0;
        }
    }

    private static boolean llIIIlIIlllII(int n2) {
        return n2 < 0;
    }
}

