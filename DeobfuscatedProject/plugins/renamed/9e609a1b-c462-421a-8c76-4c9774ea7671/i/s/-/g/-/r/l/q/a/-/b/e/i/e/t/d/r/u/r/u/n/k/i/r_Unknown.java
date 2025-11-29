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
package i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i;

import gg.squire.account.AccBuilderRat;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.M_Unknown;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.P_Unknown;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.a_Unknown;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.b_Unknown;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.d;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.e_Unknown;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.f_Unknown;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.g_Unknown;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.h;
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

public class r_Unknown
implements M {
    static /* synthetic */ int fn;
    public static /* synthetic */ List<d> bA;
    public static /* synthetic */ boolean by;
    static /* synthetic */ WorldPoint fd;
    static /* synthetic */ boolean cp;
    private static /* synthetic */ int[] lIIlIIIIIlIll;
    static /* synthetic */ WorldPoint fo;
    static /* synthetic */ int co;
    static /* synthetic */ String[] bW;
    private static /* synthetic */ String[] lIIlIIIIIlIlI;

    private static boolean lIlIIlllIlIlllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static void lIlIIlllIlIlIIl() {
        lIIlIIIIIlIll = new int[163];
        r.lIIlIIIIIlIll[0] = 1;
        r.lIIlIIIIIlIll[1] = (0x2E ^ 0x13) & ~(0x87 ^ 0xBA);
        r.lIIlIIIIIlIll[2] = 4 + 12 - -16 + 157 ^ 157 + 8 - 101 + 113;
        r.lIIlIIIIIlIll[3] = 2;
        r.lIIlIIIIIlIll[4] = -(0x6A ^ 0x7F) & (0xFFFFBFFE & 0x539D);
        r.lIIlIIIIIlIll[5] = 3;
        r.lIIlIIIIIlIll[6] = 0x11 ^ 0x15;
        r.lIIlIIIIIlIll[7] = 0x1D ^ 0x18;
        r.lIIlIIIIIlIll[8] = 0xFFFFBFCF & 0x5F77;
        r.lIIlIIIIIlIll[9] = 0xFFFFDF49 & 0x3FFF;
        r.lIIlIIIIIlIll[10] = -(0xFFFFFDE1 & 0x4A1F) & (0xFFFFFFEF & 0x4FBD);
        r.lIIlIIIIIlIll[11] = -(0xFFFFFCFD & 0x4BB3) & (0xFFFFCEFD & 0x7DFF);
        r.lIIlIIIIIlIll[12] = 0xFFFFB47F & 0x4FF3;
        r.lIIlIIIIIlIll[13] = 0x4E ^ 0x51 ^ (0x55 ^ 0x40);
        r.lIIlIIIIIlIll[14] = 0xFFFFF5D9 & 0x3B77;
        r.lIIlIIIIIlIll[15] = 0xFFFFA9FF & 0x577B;
        r.lIIlIIIIIlIll[16] = 0xC ^ 3;
        r.lIIlIIIIIlIll[17] = 52 + 50 - 34 + 68 ^ 141 + 58 - 99 + 86;
        r.lIIlIIIIIlIll[18] = 36 + 76 - 87 + 108 ^ 99 + 93 - 132 + 71;
        r.lIIlIIIIIlIll[19] = 0x21 ^ 0x5A ^ (0x11 ^ 0x6D);
        r.lIIlIIIIIlIll[20] = 2 ^ (0x52 ^ 0x58);
        r.lIIlIIIIIlIll[21] = -(0xFFFFFE5F & 0x75B9) & (0xFFFFFFDD & Short.MAX_VALUE);
        r.lIIlIIIIIlIll[22] = 0xFFFFBFBB & 0x4DFF;
        r.lIIlIIIIIlIll[23] = 0xFFFFCFFF & 0x3BBE;
        r.lIIlIIIIIlIll[24] = 0xFFFFFDBF & 0xFEE;
        r.lIIlIIIIIlIll[25] = 0x2C ^ 0xC ^ (0x7B ^ 0x45);
        r.lIIlIIIIIlIll[26] = 0xD2 ^ 0xC6;
        r.lIIlIIIIIlIll[27] = 0xFFFFCFBF & 0x3DEF;
        r.lIIlIIIIIlIll[28] = 0x15 ^ 8;
        r.lIIlIIIIIlIll[29] = 0xBF ^ 0xAC;
        r.lIIlIIIIIlIll[30] = 0xFFFFBFBF & 0x4BFF;
        r.lIIlIIIIIlIll[31] = 0x59 ^ 0x41;
        r.lIIlIIIIIlIll[32] = 0xFFFFFFDF & 0xBF1;
        r.lIIlIIIIIlIll[33] = -(0xFFFFF25F & 0x6FEE) & (0xFFFFFFFF & 0x6FFF);
        r.lIIlIIIIIlIll[34] = 0x14 ^ 0x1D;
        r.lIIlIIIIIlIll[35] = 0xD6 ^ 0x87 ^ (0xC9 ^ 0x95);
        r.lIIlIIIIIlIll[36] = 0xFFFFFBDF & 0xFED;
        r.lIIlIIIIIlIll[37] = -(0xFFFFFED1 & 0x536F) & (0xFFFFFFF7 & 0x5FFE);
        r.lIIlIIIIIlIll[38] = 0x3C ^ 0x37;
        r.lIIlIIIIIlIll[39] = 0x86 ^ 0x88;
        r.lIIlIIIIIlIll[40] = 0x5D ^ 0x4D;
        r.lIIlIIIIIlIll[41] = 0x94 ^ 0x85;
        r.lIIlIIIIIlIll[42] = 123 + 136 - 111 + 14 ^ 119 + 137 - 134 + 54;
        r.lIIlIIIIIlIll[43] = 3 ^ (0x8C ^ 0x9A);
        r.lIIlIIIIIlIll[44] = 7 ^ 0x11;
        r.lIIlIIIIIlIll[45] = 0x97 ^ 0x92 ^ (0x29 ^ 0x3B);
        r.lIIlIIIIIlIll[46] = 0x8B ^ 0x92;
        r.lIIlIIIIIlIll[47] = 0xFFFFBFD6 & 0x4BEF;
        r.lIIlIIIIIlIll[48] = -(0xFFFFD703 & 0x68FD) & (0xFFFFFFFD & 0x4DBF);
        r.lIIlIIIIIlIll[49] = 98 + 147 - 95 + 0 ^ 52 + 65 - 44 + 67;
        r.lIIlIIIIIlIll[50] = 0x2C ^ 0x37;
        r.lIIlIIIIIlIll[51] = 0xE ^ 0x12;
        r.lIIlIIIIIlIll[52] = -(0xFFFFD0EE & 0x3F57) & (0xFFFF9DFF & Short.MAX_VALUE);
        r.lIIlIIIIIlIll[53] = -(0xFFFFD6B3 & 0x7D6F) & (0xFFFFFFEF & 0x5FFB);
        r.lIIlIIIIIlIll[54] = 0x19 ^ 0x69 ^ (0x47 ^ 0x28);
        r.lIIlIIIIIlIll[55] = 0xFFFFAFE7 & 0x5BDF;
        r.lIIlIIIIIlIll[56] = -(0xFFFFB75D & 0x6AE3) & (0xFFFFFFFA & 0x2FFD);
        r.lIIlIIIIIlIll[57] = 0xF7 ^ 0xC1 ^ (0x2D ^ 0x3B);
        r.lIIlIIIIIlIll[58] = 94 + 35 - 12 + 52 ^ 101 + 100 - 148 + 83;
        r.lIIlIIIIIlIll[59] = 0x8C ^ 0xAE;
        r.lIIlIIIIIlIll[60] = 23 + 115 - 49 + 64 ^ 115 + 116 - 50 + 5;
        r.lIIlIIIIIlIll[61] = 0xA7 ^ 0x83;
        r.lIIlIIIIIlIll[62] = 0xAD ^ 0x88;
        r.lIIlIIIIIlIll[63] = 162 + 60 - 34 + 0 ^ 9 + 105 - -11 + 29;
        r.lIIlIIIIIlIll[64] = -1 & (0xFFFFABEF & 0x5FDF);
        r.lIIlIIIIIlIll[65] = 3 ^ 0x24;
        r.lIIlIIIIIlIll[66] = 0x54 ^ 0x7C;
        r.lIIlIIIIIlIll[67] = 0xFFFFEFB7 & 0x1DFF;
        r.lIIlIIIIIlIll[68] = 0x5A ^ 0x73;
        r.lIIlIIIIIlIll[69] = 0x22 ^ 8;
        r.lIIlIIIIIlIll[70] = 0x3A ^ 0x11;
        r.lIIlIIIIIlIll[71] = 0xFFFFEBEE & 0x1FDD;
        r.lIIlIIIIIlIll[72] = -(0xFFFFB75B & 0x68E7) & (0xFFFFAFFF & 0x7DF7);
        r.lIIlIIIIIlIll[73] = 0xEB ^ 0xC7;
        r.lIIlIIIIIlIll[74] = 0x20 ^ 0xD;
        r.lIIlIIIIIlIll[75] = 0x21 ^ 0xF;
        r.lIIlIIIIIlIll[76] = 9 + 121 - 74 + 73 ^ 151 + 52 - 33 + 4;
        r.lIIlIIIIIlIll[77] = 0x82 ^ 0xB2;
        r.lIIlIIIIIlIll[78] = 0x78 ^ 0x15 ^ (0xD8 ^ 0x84);
        r.lIIlIIIIIlIll[79] = 0x66 ^ 0x55;
        r.lIIlIIIIIlIll[80] = 0x2F ^ 0x1B;
        r.lIIlIIIIIlIll[81] = 0xE0 ^ 0x97 ^ (0xDA ^ 0x98);
        r.lIIlIIIIIlIll[82] = 0xB2 ^ 0x84;
        r.lIIlIIIIIlIll[83] = -(0xFFFFF4FF & 0x1F0D) & (0xFFFF9FFF & 0x7FDE);
        r.lIIlIIIIIlIll[84] = 0xFFFF8FFF & 0x7DB3;
        r.lIIlIIIIIlIll[85] = 0x33 ^ 4;
        r.lIIlIIIIIlIll[86] = 0xA3 ^ 0x9B;
        r.lIIlIIIIIlIll[87] = 0xAA ^ 0x93;
        r.lIIlIIIIIlIll[88] = 0xFFFFDFDB & 0x2BEF;
        r.lIIlIIIIIlIll[89] = 0xFFFFEBCF & 0x1FFE;
        r.lIIlIIIIIlIll[90] = 72 + 131 - 73 + 21 ^ 119 + 10 - 20 + 64;
        r.lIIlIIIIIlIll[91] = 0xBB ^ 0x80;
        r.lIIlIIIIIlIll[92] = 122 + 126 - 101 + 7 ^ 72 + 32 - 90 + 152;
        r.lIIlIIIIIlIll[93] = 0x14 ^ 0x29;
        r.lIIlIIIIIlIll[94] = 0x11 ^ 0x2F;
        r.lIIlIIIIIlIll[95] = 13 + 1 - 2 + 119 ^ 128 + 55 - 163 + 168;
        r.lIIlIIIIIlIll[96] = 0xE ^ 0x4E;
        r.lIIlIIIIIlIll[97] = 0xBB ^ 0x92 ^ (0xDB ^ 0xB3);
        r.lIIlIIIIIlIll[98] = 2 ^ (0xF1 ^ 0xB1);
        r.lIIlIIIIIlIll[99] = 0xDF ^ 0x9C;
        r.lIIlIIIIIlIll[100] = 0x21 ^ 0x65;
        r.lIIlIIIIIlIll[101] = 9 ^ 0x4C;
        r.lIIlIIIIIlIll[102] = 0x23 ^ 0x65;
        r.lIIlIIIIIlIll[103] = 104 + 139 - 154 + 123 ^ 21 + 125 - 128 + 129;
        r.lIIlIIIIIlIll[104] = 0xE4 ^ 0xAC;
        r.lIIlIIIIIlIll[105] = 0x58 ^ 7 ^ (0xD7 ^ 0xC1);
        r.lIIlIIIIIlIll[106] = 0x24 ^ 0x6E;
        r.lIIlIIIIIlIll[107] = 0xC6 ^ 0x8D;
        r.lIIlIIIIIlIll[108] = -(0xFFFFED3B & 0x32F5) & (0xFFFFABFE & 0x7FF9);
        r.lIIlIIIIIlIll[109] = -(0xFFFF9AC7 & 0x777A) & (0xFFFFDFFF & 0x3FFF);
        r.lIIlIIIIIlIll[110] = 145 + 234 - 152 + 16 ^ 63 + 184 - 92 + 36;
        r.lIIlIIIIIlIll[111] = 0x3B ^ 0x76;
        r.lIIlIIIIIlIll[112] = 0x8E ^ 0xC0;
        r.lIIlIIIIIlIll[113] = 0xB1 ^ 0xB5 ^ (0x54 ^ 0x1F);
        r.lIIlIIIIIlIll[114] = 0xA ^ 0x74 ^ (0x76 ^ 0x58);
        r.lIIlIIIIIlIll[115] = -(0xFFFFBE6B & 0x4397) & (0xFFFFDFBE & 0x2FFF);
        r.lIIlIIIIIlIll[116] = 0x49 ^ 0x18;
        r.lIIlIIIIIlIll[117] = 0xD5 ^ 0x87;
        r.lIIlIIIIIlIll[118] = 0x42 ^ 0x11;
        r.lIIlIIIIIlIll[119] = -(0xFFFFB4DD & 0x7F36) & (0xFFFFBFFF & 0x7FD7);
        r.lIIlIIIIIlIll[120] = 0x97 ^ 0xC3;
        r.lIIlIIIIIlIll[121] = 0x66 ^ 0x52 ^ (0x60 ^ 1);
        r.lIIlIIIIIlIll[122] = 0x2D ^ 0x18 ^ (0xA2 ^ 0xC1);
        r.lIIlIIIIIlIll[123] = 154 + 214 - 305 + 163 ^ 163 + 56 - 155 + 117;
        r.lIIlIIIIIlIll[124] = 0xFFFF8BD5 & Short.MAX_VALUE;
        r.lIIlIIIIIlIll[125] = 0x22 ^ 0x4A ^ (0x96 ^ 0xA6);
        r.lIIlIIIIIlIll[126] = 141 + 54 - -7 + 24 ^ 39 + 36 - 22 + 134;
        r.lIIlIIIIIlIll[127] = 40 + 181 - -9 + 15 ^ 57 + 107 - -5 + 6;
        r.lIIlIIIIIlIll[128] = 45 + 108 - -14 + 67 ^ 110 + 148 - 150 + 69;
        r.lIIlIIIIIlIll[129] = 0xA ^ 0x7E ^ (0xA3 ^ 0x8B);
        r.lIIlIIIIIlIll[130] = 5 ^ 0x58;
        r.lIIlIIIIIlIll[131] = 0x57 ^ 0x39 ^ (0x21 ^ 0x11);
        r.lIIlIIIIIlIll[132] = 0x4B ^ 0x14;
        r.lIIlIIIIIlIll[133] = 0x9A ^ 0xC0 ^ (0x36 ^ 0xC);
        r.lIIlIIIIIlIll[134] = -(0xFFFFF96B & 0x17BF) & (0xFFFFB7FF & 0x7FEA);
        r.lIIlIIIIIlIll[135] = 0xFFFFD7B6 & 0x2FC9;
        r.lIIlIIIIIlIll[136] = -(0xFFFFF6FF & 0x3F11) & (0xFFFFF77E & 0x3FBD);
        r.lIIlIIIIIlIll[137] = -(0xFFFFB1F4 & 0x5F2F) & (0xFFFFFFEF & 0x3FFF);
        r.lIIlIIIIIlIll[138] = -(2 ^ 0x54) & (0xFFFFFFFF & 0x61FD);
        r.lIIlIIIIIlIll[139] = 0xFFFF8F6D & 0x77FE;
        r.lIIlIIIIIlIll[140] = 22 + 44 - 41 + 137 ^ 164 + 102 - 142 + 74;
        r.lIIlIIIIIlIll[141] = 0x15 ^ 0x74;
        r.lIIlIIIIIlIll[142] = 26 + 121 - 59 + 153 ^ 41 + 72 - 0 + 34;
        r.lIIlIIIIIlIll[143] = 141 + 30 - 110 + 190 ^ 52 + 117 - 148 + 131;
        r.lIIlIIIIIlIll[144] = 196 + 76 - 132 + 86 ^ 78 + 128 - 84 + 13;
        r.lIIlIIIIIlIll[145] = 7 ^ 0x61;
        r.lIIlIIIIIlIll[146] = 0x26 ^ 0x41;
        r.lIIlIIIIIlIll[147] = 0x32 ^ 0x5A;
        r.lIIlIIIIIlIll[148] = 0x10 ^ 0x79;
        r.lIIlIIIIIlIll[149] = 0x2D ^ 0x47;
        r.lIIlIIIIIlIll[150] = 0x14 ^ 0x57 ^ (0x27 ^ 0xF);
        r.lIIlIIIIIlIll[151] = 0x46 ^ 0x2A;
        r.lIIlIIIIIlIll[152] = 0xD3 ^ 0xBE;
        r.lIIlIIIIIlIll[153] = 0x76 ^ 0x18;
        r.lIIlIIIIIlIll[154] = (0x75 ^ 0x61) + (0x6C ^ 0x43) - -(0x5A ^ 0x45) + (0x7F ^ 0x5F);
        r.lIIlIIIIIlIll[155] = -(0xFFFFF571 & 0x5EEF) & (0xFFFFFFFE & 0x5FEF);
        r.lIIlIIIIIlIll[156] = -(0xFFFFB6FF & 0x79A2) & (0xFFFFFDFF & 0x3FAD);
        r.lIIlIIIIIlIll[157] = -(0x30 ^ 0x71) & (0xFFFF9DFB & 0x6FFD);
        r.lIIlIIIIIlIll[158] = 0x4A ^ 0x25;
        r.lIIlIIIIIlIll[159] = 0x25 ^ 0x55;
        r.lIIlIIIIIlIll[160] = 35 + 103 - -29 + 11 ^ 190 + 47 - 212 + 170;
        r.lIIlIIIIIlIll[161] = 0x74 ^ 6;
        r.lIIlIIIIIlIll[162] = 2 ^ 0x71;
    }

    private static void W() {
        block19: {
            d var36;
            block18: {
                Object var31;
                block17: {
                    block16: {
                        block15: {
                            block14: {
                                int[] nArray = new int[lIIlIIIIIlIll[0]];
                                nArray[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIll[11];
                                if (r.lIlIIlllIlIllIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                                    d d2 = new d(lIIlIIIIIlIll[11], lIIlIIIIIlIll[0], lIIlIIIIIlIll[134]);
                                    bA.add(d2);
                                    0;
                                }
                                int[] nArray2 = new int[lIIlIIIIIlIll[0]];
                                nArray2[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIll[10];
                                if (r.lIlIIlllIlIllIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                                    var31 = new d(lIIlIIIIIlIll[10], lIIlIIIIIlIll[0], lIIlIIIIIlIll[134]);
                                    bA.add((d)var31);
                                    0;
                                }
                                int[] nArray3 = new int[lIIlIIIIIlIll[0]];
                                nArray3[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIll[12];
                                if (r.lIlIIlllIlIllIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                    var31 = new d(lIIlIIIIIlIll[12], lIIlIIIIIlIll[0], lIIlIIIIIlIll[134]);
                                    bA.add((d)var31);
                                    0;
                                }
                                int[] nArray4 = new int[lIIlIIIIIlIll[0]];
                                nArray4[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIll[9];
                                if (!r.lIlIIlllIlIlIll(Bank.contains((int[])nArray4) ? 1 : 0)) break block14;
                                int[] nArray5 = new int[lIIlIIIIIlIll[0]];
                                nArray5[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIll[9];
                                if (!r.lIlIIlllIlIlIll(Bank.contains((int[])nArray5) ? 1 : 0)) break block15;
                                int[] nArray6 = new int[lIIlIIIIIlIll[0]];
                                nArray6[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIll[9];
                                if (!r.lIlIIlllIlIllII(Bank.getFirst((int[])nArray6).getQuantity(), lIIlIIIIIlIll[7])) break block15;
                            }
                            var31 = new d(lIIlIIIIIlIll[9], lIIlIIIIIlIll[13], lIIlIIIIIlIll[135]);
                            bA.add((d)var31);
                            0;
                        }
                        int[] nArray = new int[lIIlIIIIIlIll[0]];
                        nArray[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIll[15];
                        if (!r.lIlIIlllIlIlIll(Bank.contains((int[])nArray) ? 1 : 0)) break block16;
                        int[] nArray7 = new int[lIIlIIIIIlIll[0]];
                        nArray7[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIll[15];
                        if (!r.lIlIIlllIlIlIll(Bank.contains((int[])nArray7) ? 1 : 0)) break block17;
                        int[] nArray8 = new int[lIIlIIIIIlIll[0]];
                        nArray8[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIll[15];
                        if (!r.lIlIIlllIlIllII(Bank.getFirst((int[])nArray8).getQuantity(), lIIlIIIIIlIll[7])) break block17;
                    }
                    var31 = new d(lIIlIIIIIlIll[15], lIIlIIIIIlIll[13], lIIlIIIIIlIll[136]);
                    bA.add((d)var31);
                    0;
                }
                if (r.lIlIIlllIlIllIl(Bank.contains((Predicate)(var31 = item -> item.getName().toLowerCase().contains(lIIlIIIIIlIlI[lIIlIIIIIlIll[142]]))) ? 1 : 0)) {
                    var36 = new d(lIIlIIIIIlIll[137], lIIlIIIIIlIll[7], lIIlIIIIIlIll[138]);
                    bA.add(var36);
                    0;
                }
                int[] nArray = new int[lIIlIIIIIlIll[0]];
                nArray[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIll[14];
                if (r.lIlIIlllIlIllIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                    var36 = new d(lIIlIIIIIlIll[14], lIIlIIIIIlIll[6], h.bv);
                    bA.add(var36);
                    0;
                }
                int[] nArray9 = new int[lIIlIIIIIlIll[0]];
                nArray9[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIll[8];
                if (!r.lIlIIlllIlIlIll(Bank.contains((int[])nArray9) ? 1 : 0)) break block18;
                int[] nArray10 = new int[lIIlIIIIIlIll[0]];
                nArray10[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIll[8];
                if (!r.lIlIIlllIlIlIll(Bank.contains((int[])nArray10) ? 1 : 0)) break block19;
                int[] nArray11 = new int[lIIlIIIIIlIll[0]];
                nArray11[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIll[8];
                if (!r.lIlIIlllIlIllII(Bank.getFirst((int[])nArray11).getQuantity(), lIIlIIIIIlIll[16])) break block19;
            }
            var36 = new d(lIIlIIIIIlIll[8], lIIlIIIIIlIll[66], lIIlIIIIIlIll[139]);
            bA.add(var36);
            0;
        }
    }

    private static boolean lIlIIlllIllIIIl(int n2) {
        return n2 < 0;
    }

    @Override
    public boolean X() {
        return lIIlIIIIIlIll[1];
    }

    private static boolean lIlIIlllIlIllll(Object object) {
        return object != null;
    }

    static {
        r.lIlIIlllIlIlIIl();
        r.lIlIIlllIlIlIII();
        bA = new ArrayList<d>();
        fn = lIIlIIIIIlIll[154];
        fd = new WorldPoint(lIIlIIIIIlIll[155], lIIlIIIIIlIll[156], lIIlIIIIIlIll[3]);
        fo = new WorldPoint(lIIlIIIIIlIll[108], lIIlIIIIIlIll[157], lIIlIIIIIlIll[1]);
        String[] stringArray = new String[lIIlIIIIIlIll[6]];
        stringArray[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[158]];
        stringArray[r.lIIlIIIIIlIll[0]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[159]];
        stringArray[r.lIIlIIIIIlIll[3]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[160]];
        stringArray[r.lIIlIIIIIlIll[5]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[161]];
        bW = stringArray;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean S() {
        void var19;
        int[] nArray = new int[lIIlIIIIIlIll[7]];
        nArray[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIll[8];
        nArray[r.lIIlIIIIIlIll[0]] = lIIlIIIIIlIll[9];
        nArray[r.lIIlIIIIIlIll[3]] = lIIlIIIIIlIll[10];
        nArray[r.lIIlIIIIIlIll[5]] = lIIlIIIIIlIll[11];
        nArray[r.lIIlIIIIIlIll[6]] = lIIlIIIIIlIll[12];
        int[] nArray2 = nArray;
        int var1 = lIIlIIIIIlIll[1];
        while (r.lIlIIlllIlIllII(var1, ((void)var19).length)) {
            int[] nArray3 = new int[lIIlIIIIIlIll[0]];
            nArray3[r.lIIlIIIIIlIll[1]] = var19[var1];
            if (r.lIlIIlllIlIllIl(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return lIIlIIIIIlIll[1];
            }
            ++var1;
            0;
            if ((0xA9 ^ 0xAD) != 1) continue;
            return false;
        }
        return lIIlIIIIIlIll[0];
    }

    private static boolean lIlIIlllIllIllI(Object object) {
        return object == null;
    }

    @Override
    public String Z() {
        return lIIlIIIIIlIlI[lIIlIIIIIlIll[141]];
    }

    private static boolean lIlIIlllIllIIII(int n2) {
        return n2 > 0;
    }

    @Override
    public boolean aa() {
        boolean bl;
        if (r.lIlIIlllIlIlllI(e.j(fn), lIIlIIIIIlIll[6])) {
            bl = lIIlIIIIIlIll[0];
            0;
            if ((0x53 ^ 0x68 ^ (0x8A ^ 0xB5)) <= -1) {
                return ((0xDB ^ 0x8F ^ (0x60 ^ 0x6B)) & (53 + 125 - 3 + 45 ^ 76 + 80 - 131 + 106 ^ -1)) != 0;
            }
        } else {
            bl = lIIlIIIIIlIll[1];
        }
        return bl;
    }

    private static boolean lIlIIlllIllIlII(int n2, int n3) {
        return n2 == n3;
    }

    private static String lIlIIlllIlIIlIl(String var10, String var33) {
        try {
            SecretKeySpec var27 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var33.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var17 = Cipher.getInstance("Blowfish");
            var17.init(lIIlIIIIIlIll[3], var27);
            return new String(var17.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    @Override
    public int Y() {
        try {
            r.bc();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        
        }
        return lIIlIIIIIlIll[140];
    }

    public static void bc() {
        block81: {
            WorldPoint var37;
            TileObject var20;
            WorldArea var40;
            WorldArea var35;
            WorldArea var21;
            WorldArea var3;
            WorldArea var7;
            WorldArea var13;
            WorldArea var11;
            BankLocation var9;
            block82: {
                WorldArea var38;
                WorldArea var34;
                block83: {
                    block85: {
                        block84: {
                            if (r.lIlIIlllIlIlIll(by ? 1 : 0)) {
                                b.a(bA);
                                if (r.lIlIIlllIlIllII(bA.size(), lIIlIIIIIlIll[0])) {
                                    System.out.println(lIIlIIIIIlIlI[lIIlIIIIIlIll[1]]);
                                    by = lIIlIIIIIlIll[1];
                                }
                            }
                            if (!r.lIlIIlllIlIllIl(by ? 1 : 0)) break block81;
                            if (r.lIlIIlllIlIllII(e.I(), lIIlIIIIIlIll[2])) {
                                System.out.println(lIIlIIIIIlIlI[lIIlIIIIIlIll[0]]);
                                AccBuilderRat.d = lIIlIIIIIlIll[0];
                                return;
                            }
                            if (r.lIlIIlllIlIllIl(r.S() ? 1 : 0) && r.lIlIIlllIlIllII(e.j(fn), lIIlIIIIIlIll[0]) && r.lIlIIlllIlIlllI(e.I(), lIIlIIIIIlIll[2])) {
                                var9 = BankLocation.getNearest();
                                if (r.lIlIIlllIlIllll(var9) && r.lIlIIlllIlIllIl(var9.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderRat.c = lIIlIIIIIlIlI[lIIlIIIIIlIll[3]];
                                    a.a(var9);
                                }
                                if (r.lIlIIlllIlIllll(var9) && r.lIlIIlllIlIlIll(var9.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (r.lIlIIlllIlIllIl(Bank.isOpen() ? 1 : 0)) {
                                        a.a();
                                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIIlIIIIIlIll[4]);
                                        0;
                                    }
                                    if (r.lIlIIlllIlIlIll(Bank.isOpen() ? 1 : 0)) {
                                        AccBuilderRat.c = lIIlIIIIIlIlI[lIIlIIIIIlIll[5]];
                                        if (r.lIlIIlllIllIIII(Inventory.getAll().size())) {
                                            Bank.depositInventory();
                                            Time.sleepTicks((int)lIIlIIIIIlIll[6]);
                                            0;
                                        }
                                        if (r.lIlIIlllIllIIII(Equipment.getAll().size())) {
                                            Bank.depositEquipment();
                                            Time.sleepTicks((int)lIIlIIIIIlIll[3]);
                                            0;
                                        }
                                        int[] nArray = new int[lIIlIIIIIlIll[7]];
                                        nArray[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIll[8];
                                        nArray[r.lIIlIIIIIlIll[0]] = lIIlIIIIIlIll[9];
                                        nArray[r.lIIlIIIIIlIll[3]] = lIIlIIIIIlIll[10];
                                        nArray[r.lIIlIIIIIlIll[5]] = lIIlIIIIIlIll[11];
                                        nArray[r.lIIlIIIIIlIll[6]] = lIIlIIIIIlIll[12];
                                        if (r.lIlIIlllIlIllIl(e.b(nArray) ? 1 : 0)) {
                                            r.W();
                                            System.out.println(lIIlIIIIIlIlI[lIIlIIIIIlIll[6]]);
                                            by = lIIlIIIIIlIll[0];
                                            return;
                                        }
                                        int[] nArray2 = new int[lIIlIIIIIlIll[7]];
                                        nArray2[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIll[8];
                                        nArray2[r.lIIlIIIIIlIll[0]] = lIIlIIIIIlIll[9];
                                        nArray2[r.lIIlIIIIIlIll[3]] = lIIlIIIIIlIll[10];
                                        nArray2[r.lIIlIIIIIlIll[5]] = lIIlIIIIIlIll[11];
                                        nArray2[r.lIIlIIIIIlIll[6]] = lIIlIIIIIlIll[12];
                                        if (r.lIlIIlllIlIlIll(e.b(nArray2) ? 1 : 0)) {
                                            a.a(lIIlIIIIIlIll[8], lIIlIIIIIlIll[13]);
                                            a.a(lIIlIIIIIlIll[9], lIIlIIIIIlIll[13]);
                                            a.a(lIIlIIIIIlIll[10], lIIlIIIIIlIll[0]);
                                            a.a(lIIlIIIIIlIll[11], lIIlIIIIIlIll[0]);
                                            a.a(lIIlIIIIIlIll[12], lIIlIIIIIlIll[0]);
                                            a.a(lIIlIIIIIlIll[14], lIIlIIIIIlIll[0]);
                                            a.a(lIIlIIIIIlIll[15], lIIlIIIIIlIll[16]);
                                        }
                                    }
                                }
                            }
                            if (r.lIlIIlllIlIlIll(Inventory.contains((int[])f.ba) ? 1 : 0) && r.lIlIIlllIlIllII(Movement.getRunEnergy(), lIIlIIIIIlIll[17])) {
                                Inventory.getFirst((int[])f.ba).interact(lIIlIIIIIlIlI[lIIlIIIIIlIll[7]]);
                                Time.sleepTicks((int)lIIlIIIIIlIll[0]);
                                0;
                            }
                            int[] nArray = new int[lIIlIIIIIlIll[0]];
                            nArray[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIll[15];
                            if (r.lIlIIlllIlIlIll(Inventory.contains((int[])nArray) ? 1 : 0) && r.lIlIIlllIllIIIl(r.lIlIIlllIlIlIlI(e.v(), 50.0))) {
                                int[] nArray3 = new int[lIIlIIIIIlIll[0]];
                                nArray3[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIll[15];
                                Inventory.getFirst((int[])nArray3).interact(lIIlIIIIIlIlI[lIIlIIIIIlIll[18]]);
                                Time.sleepTicks((int)lIIlIIIIIlIll[3]);
                                0;
                            }
                            if (r.lIlIIlllIlIlIll(r.S() ? 1 : 0) && r.lIlIIlllIlIllIl(e.j(fn))) {
                                if (!r.lIlIIlllIllIIlI(Players.getLocal().getWorldLocation().distanceTo(fd), lIIlIIIIIlIll[7]) || r.lIlIIlllIllIIll(Players.getLocal().getWorldLocation().getPlane(), lIIlIIIIIlIll[3])) {
                                    AccBuilderRat.c = lIIlIIIIIlIlI[lIIlIIIIIlIll[19]];
                                    if (r.lIlIIlllIlIlIll(Dialog.isOpen() ? 1 : 0)) {
                                        Dialog.close();
                                    }
                                    Movement.walkTo((WorldPoint)fd);
                                    0;
                                    Time.sleepTicks((int)lIIlIIIIIlIll[0]);
                                    0;
                                }
                                if (r.lIlIIlllIllIIlI(Players.getLocal().getWorldLocation().distanceTo(fd), lIIlIIIIIlIll[7])) {
                                    g.a(lIIlIIIIIlIlI[lIIlIIIIIlIll[20]], bW);
                                }
                            }
                            if (!r.lIlIIlllIllIlII(e.j(fn), lIIlIIIIIlIll[0])) break block82;
                            co = lIIlIIIIIlIll[1];
                            var9 = new WorldArea(lIIlIIIIIlIll[21], lIIlIIIIIlIll[22], lIIlIIIIIlIll[18], lIIlIIIIIlIll[3], lIIlIIIIIlIll[1]);
                            var11 = new WorldArea(lIIlIIIIIlIll[23], lIIlIIIIIlIll[24], lIIlIIIIIlIll[25], lIIlIIIIIlIll[26], lIIlIIIIIlIll[0]);
                            var13 = new WorldArea(lIIlIIIIIlIll[23], lIIlIIIIIlIll[27], lIIlIIIIIlIll[28], lIIlIIIIIlIll[29], lIIlIIIIIlIll[3]);
                            var7 = new WorldArea(lIIlIIIIIlIll[30], lIIlIIIIIlIll[22], lIIlIIIIIlIll[31], lIIlIIIIIlIll[18], lIIlIIIIIlIll[1]);
                            var3 = new WorldArea(lIIlIIIIIlIll[32], lIIlIIIIIlIll[33], lIIlIIIIIlIll[34], lIIlIIIIIlIll[35], lIIlIIIIIlIll[1]);
                            var21 = new WorldArea(lIIlIIIIIlIll[36], lIIlIIIIIlIll[37], lIIlIIIIIlIll[38], lIIlIIIIIlIll[34], lIIlIIIIIlIll[1]);
                            if (!r.lIlIIlllIlIllIl(var9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !r.lIlIIlllIlIllIl(var11.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !r.lIlIIlllIlIllIl(var13.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !r.lIlIIlllIlIllIl(var7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !r.lIlIIlllIlIllIl(var3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !r.lIlIIlllIlIllIl(var21.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block83;
                            if (r.lIlIIlllIllIlIl(Players.getLocal().getWorldLocation().distanceTo(fo), lIIlIIIIIlIll[3])) {
                                AccBuilderRat.c = lIIlIIIIIlIlI[lIIlIIIIIlIll[34]];
                                e.D();
                                Movement.walkTo((WorldPoint)fo);
                                0;
                                Time.sleepTicks((int)lIIlIIIIIlIll[0]);
                                0;
                            }
                            if (!r.lIlIIlllIllIIlI(Players.getLocal().getWorldLocation().distanceTo(fo), lIIlIIIIIlIll[3])) break block83;
                            String[] stringArray = new String[lIIlIIIIIlIll[0]];
                            stringArray[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[13]];
                            if (!r.lIlIIlllIlIlIll(Equipment.contains((String[])stringArray) ? 1 : 0)) break block84;
                            String[] stringArray2 = new String[lIIlIIIIIlIll[0]];
                            stringArray2[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[38]];
                            if (!r.lIlIIlllIlIllIl(Equipment.contains((String[])stringArray2) ? 1 : 0)) break block85;
                        }
                        String[] stringArray = new String[lIIlIIIIIlIll[0]];
                        stringArray[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[2]];
                        if (r.lIlIIlllIlIlIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                            String[] stringArray3 = new String[lIIlIIIIIlIll[0]];
                            stringArray3[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[35]];
                            Inventory.getFirst((String[])stringArray3).interact(lIIlIIIIIlIlI[lIIlIIIIIlIll[39]]);
                        }
                        String[] stringArray4 = new String[lIIlIIIIIlIll[0]];
                        stringArray4[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[16]];
                        if (r.lIlIIlllIlIlIll(Inventory.contains((String[])stringArray4) ? 1 : 0)) {
                            String[] stringArray5 = new String[lIIlIIIIIlIll[0]];
                            stringArray5[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[40]];
                            Inventory.getFirst((String[])stringArray5).interact(lIIlIIIIIlIlI[lIIlIIIIIlIll[41]]);
                        }
                    }
                    if (r.lIlIIlllIlIlIll(Inventory.contains((int[])f.ba) ? 1 : 0)) {
                        Inventory.getFirst((int[])f.ba).interact(lIIlIIIIIlIlI[lIIlIIIIIlIll[42]]);
                    }
                    String[] stringArray = new String[lIIlIIIIIlIll[0]];
                    stringArray[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[29]];
                    if (r.lIlIIlllIlIlIll(Equipment.contains((String[])stringArray) ? 1 : 0)) {
                        String[] stringArray6 = new String[lIIlIIIIIlIll[0]];
                        stringArray6[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[26]];
                        if (r.lIlIIlllIlIlIll(Equipment.contains((String[])stringArray6) ? 1 : 0)) {
                            String[] stringArray7 = new String[lIIlIIIIIlIll[0]];
                            stringArray7[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[43]];
                            TileObjects.getNearest((String[])stringArray7).interact(lIIlIIIIIlIlI[lIIlIIIIIlIll[44]]);
                            Time.sleepTicks((int)lIIlIIIIIlIll[6]);
                            0;
                        }
                    }
                }
                if (r.lIlIIlllIlIlIll(var9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRat.c = lIIlIIIIIlIlI[lIIlIIIIIlIll[45]];
                    String[] stringArray = new String[lIIlIIIIIlIll[0]];
                    stringArray[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[31]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIlIIIIIlIlI[lIIlIIIIIlIll[46]]);
                    Time.sleepTicks((int)lIIlIIIIIlIll[3]);
                    0;
                }
                var35 = new WorldArea(lIIlIIIIIlIll[47], lIIlIIIIIlIll[48], lIIlIIIIIlIll[6], lIIlIIIIIlIll[5], lIIlIIIIIlIll[1]);
                var40 = new WorldArea(lIIlIIIIIlIll[47], lIIlIIIIIlIll[48], lIIlIIIIIlIll[6], lIIlIIIIIlIll[5], lIIlIIIIIlIll[0]);
                if (r.lIlIIlllIlIlIll(var35.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRat.c = lIIlIIIIIlIlI[lIIlIIIIIlIll[49]];
                    var20 = TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (r.lIlIIlllIlIlIll(tileObject.getName().equalsIgnoreCase(lIIlIIIIIlIlI[lIIlIIIIIlIll[152]]) ? 1 : 0)) {
                            String[] stringArray = new String[lIIlIIIIIlIll[0]];
                            stringArray[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[153]];
                            if (r.lIlIIlllIlIlIll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                n2 = lIIlIIIIIlIll[0];
                                0;
                                if (-1 < 0) return n2 != 0;
                                return false;
                            }
                        }
                        n2 = lIIlIIIIIlIll[1];
                        return n2 != 0;
                    });
                    var20.interact(lIIlIIIIIlIlI[lIIlIIIIIlIll[50]]);
                    Time.sleepTicks((int)lIIlIIIIIlIll[3]);
                    0;
                }
                if (r.lIlIIlllIlIlIll(var40.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRat.c = lIIlIIIIIlIlI[lIIlIIIIIlIll[51]];
                    var20 = TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (r.lIlIIlllIlIlIll(tileObject.getName().equalsIgnoreCase(lIIlIIIIIlIlI[lIIlIIIIIlIll[150]]) ? 1 : 0)) {
                            String[] stringArray = new String[lIIlIIIIIlIll[0]];
                            stringArray[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[151]];
                            if (r.lIlIIlllIlIlIll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                n2 = lIIlIIIIIlIll[0];
                                0;
                                if (null == null) return n2 != 0;
                                return false;
                            }
                        }
                        n2 = lIIlIIIIIlIll[1];
                        return n2 != 0;
                    });
                    var20.interact(lIIlIIIIIlIlI[lIIlIIIIIlIll[28]]);
                    Time.sleepTicks((int)lIIlIIIIIlIll[3]);
                    0;
                }
                var20 = new WorldArea(lIIlIIIIIlIll[21], lIIlIIIIIlIll[52], lIIlIIIIIlIll[18], lIIlIIIIIlIll[18], lIIlIIIIIlIll[3]);
                var37 = new WorldPoint(lIIlIIIIIlIll[53], lIIlIIIIIlIll[22], lIIlIIIIIlIll[3]);
                if (r.lIlIIlllIlIlIll(var20.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRat.c = lIIlIIIIIlIlI[lIIlIIIIIlIll[25]];
                    if (r.lIlIIlllIllIlIl(Players.getLocal().getWorldLocation().distanceTo(var37), lIIlIIIIIlIll[0])) {
                        Movement.walkTo((WorldPoint)var37);
                        0;
                        Time.sleepTicks((int)lIIlIIIIIlIll[0]);
                        0;
                    }
                    if (r.lIlIIlllIllIIlI(Players.getLocal().getWorldLocation().distanceTo(var37), lIIlIIIIIlIll[0])) {
                        var34 = TileObjects.getNearest(tileObject -> {
                            int n2;
                            if (r.lIlIIlllIlIlIll(tileObject.getName().equalsIgnoreCase(lIIlIIIIIlIlI[lIIlIIIIIlIll[148]]) ? 1 : 0)) {
                                String[] stringArray = new String[lIIlIIIIIlIll[0]];
                                stringArray[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[149]];
                                if (r.lIlIIlllIlIlIll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                    n2 = lIIlIIIIIlIll[0];
                                    0;
                                    if (null == null) return n2 != 0;
                                    return ((0x46 ^ 0x4F ^ (0x1B ^ 0x33)) & (0xDB ^ 0xA2 ^ (7 ^ 0x5F) ^ -1)) != 0;
                                }
                            }
                            n2 = lIIlIIIIIlIll[1];
                            return n2 != 0;
                        });
                        var34.interact(lIIlIIIIIlIlI[lIIlIIIIIlIll[54]]);
                        Time.sleepTicks((int)lIIlIIIIIlIll[3]);
                        0;
                    }
                }
                if (r.lIlIIlllIlIlIll((var34 = new WorldArea(lIIlIIIIIlIll[55], lIIlIIIIIlIll[56], lIIlIIIIIlIll[13], lIIlIIIIIlIll[7], lIIlIIIIIlIll[0])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRat.c = lIIlIIIIIlIlI[lIIlIIIIIlIll[57]];
                    String[] stringArray = new String[lIIlIIIIIlIll[0]];
                    stringArray[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[58]];
                    String[] stringArray8 = new String[lIIlIIIIIlIll[0]];
                    stringArray8[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[59]];
                    if (r.lIlIIlllIlIlIll(TileObjects.getNearest((String[])stringArray).hasAction(stringArray8) ? 1 : 0)) {
                        String[] stringArray9 = new String[lIIlIIIIIlIll[0]];
                        stringArray9[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[60]];
                        TileObjects.getNearest((String[])stringArray9).interact(lIIlIIIIIlIlI[lIIlIIIIIlIll[61]]);
                        Time.sleepTicks((int)lIIlIIIIIlIll[5]);
                        0;
                    }
                    String[] stringArray10 = new String[lIIlIIIIIlIll[0]];
                    stringArray10[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[62]];
                    String[] stringArray11 = new String[lIIlIIIIIlIll[0]];
                    stringArray11[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[63]];
                    if (r.lIlIIlllIlIllIl(TileObjects.getNearest((String[])stringArray10).hasAction(stringArray11) ? 1 : 0)) {
                        if (r.lIlIIlllIllIlIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIlIIIIIlIll[64], lIIlIIIIIlIll[52], lIIlIIIIIlIll[0])), lIIlIIIIIlIll[3])) {
                            Movement.walkTo((WorldPoint)new WorldPoint(lIIlIIIIIlIll[64], lIIlIIIIIlIll[52], lIIlIIIIIlIll[0]));
                            0;
                            Time.sleepTicks((int)lIIlIIIIIlIll[0]);
                            0;
                        }
                        if (r.lIlIIlllIllIIlI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIlIIIIIlIll[64], lIIlIIIIIlIll[52], lIIlIIIIIlIll[0])), lIIlIIIIIlIll[3])) {
                            String[] stringArray12 = new String[lIIlIIIIIlIll[0]];
                            stringArray12[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[65]];
                            TileObjects.getNearest((String[])stringArray12).interact(lIIlIIIIIlIlI[lIIlIIIIIlIll[66]]);
                            Time.sleepTicks((int)lIIlIIIIIlIll[3]);
                            0;
                        }
                    }
                }
                if (r.lIlIIlllIlIlIll((var38 = new WorldArea(lIIlIIIIIlIll[36], lIIlIIIIIlIll[67], lIIlIIIIIlIll[19], lIIlIIIIIlIll[18], lIIlIIIIIlIll[3])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRat.c = lIIlIIIIIlIlI[lIIlIIIIIlIll[68]];
                    if (r.lIlIIlllIllIlIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIlIIIIIlIll[32], lIIlIIIIIlIll[52], lIIlIIIIIlIll[3])), lIIlIIIIIlIll[0])) {
                        Movement.walkTo((WorldPoint)new WorldPoint(lIIlIIIIIlIll[32], lIIlIIIIIlIll[52], lIIlIIIIIlIll[3]));
                        0;
                        Time.sleepTicks((int)lIIlIIIIIlIll[0]);
                        0;
                    }
                    if (r.lIlIIlllIllIIlI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIlIIIIIlIll[32], lIIlIIIIIlIll[52], lIIlIIIIIlIll[3])), lIIlIIIIIlIll[0])) {
                        String[] stringArray = new String[lIIlIIIIIlIll[0]];
                        stringArray[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[69]];
                        TileObjects.getNearest((String[])stringArray).interact(lIIlIIIIIlIlI[lIIlIIIIIlIll[70]]);
                        Time.sleepTicks((int)lIIlIIIIIlIll[5]);
                        0;
                    }
                }
                WorldArea var28 = new WorldArea(lIIlIIIIIlIll[32], lIIlIIIIIlIll[37], lIIlIIIIIlIll[7], lIIlIIIIIlIll[19], lIIlIIIIIlIll[0]);
                WorldArea var5 = new WorldArea(lIIlIIIIIlIll[71], lIIlIIIIIlIll[72], lIIlIIIIIlIll[19], lIIlIIIIIlIll[6], lIIlIIIIIlIll[0]);
                WorldArea var12 = new WorldArea(lIIlIIIIIlIll[71], lIIlIIIIIlIll[33], lIIlIIIIIlIll[18], lIIlIIIIIlIll[19], lIIlIIIIIlIll[0]);
                if (r.lIlIIlllIlIlIll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIIlIIIIIlIll[32], lIIlIIIIIlIll[52], lIIlIIIIIlIll[0])) ? 1 : 0)) {
                    String[] stringArray = new String[lIIlIIIIIlIll[0]];
                    stringArray[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[73]];
                    String[] stringArray13 = new String[lIIlIIIIIlIll[0]];
                    stringArray13[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[74]];
                    if (r.lIlIIlllIlIlIll(TileObjects.getNearest((String[])stringArray).hasAction(stringArray13) ? 1 : 0)) {
                        String[] stringArray14 = new String[lIIlIIIIIlIll[0]];
                        stringArray14[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[75]];
                        TileObjects.getNearest((String[])stringArray14).interact(lIIlIIIIIlIlI[lIIlIIIIIlIll[76]]);
                        Time.sleepTicks((int)lIIlIIIIIlIll[5]);
                        0;
                    }
                }
                if (!r.lIlIIlllIlIllIl(var5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || r.lIlIIlllIlIlIll(var28.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (r.lIlIIlllIlIlIll(var5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        String[] stringArray = new String[lIIlIIIIIlIll[0]];
                        stringArray[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[77]];
                        String[] stringArray15 = new String[lIIlIIIIIlIll[0]];
                        stringArray15[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[78]];
                        if (r.lIlIIlllIlIlIll(TileObjects.getNearest((String[])stringArray).hasAction(stringArray15) ? 1 : 0)) {
                            String[] stringArray16 = new String[lIIlIIIIIlIll[0]];
                            stringArray16[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[17]];
                            TileObjects.getNearest((String[])stringArray16).interact(lIIlIIIIIlIlI[lIIlIIIIIlIll[79]]);
                            Time.sleepTicks((int)lIIlIIIIIlIll[5]);
                            0;
                        }
                    }
                    if (r.lIlIIlllIlIlIll(var12.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        TileObjects.getNearest(tileObject -> {
                            int n2;
                            if (r.lIlIIlllIlIlIll(tileObject.getName().equalsIgnoreCase(lIIlIIIIIlIlI[lIIlIIIIIlIll[146]]) ? 1 : 0)) {
                                String[] stringArray = new String[lIIlIIIIIlIll[0]];
                                stringArray[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[147]];
                                if (r.lIlIIlllIlIlIll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                    n2 = lIIlIIIIIlIll[0];
                                    0;
                                    if (1 == 1) return n2 != 0;
                                    return ((0xD5 ^ 0xB4) & ~(0x53 ^ 0x32) & ~((0x93 ^ 0x8B) & ~(0x9A ^ 0x82))) != 0;
                                }
                            }
                            n2 = lIIlIIIIIlIll[1];
                            return n2 != 0;
                        }).interact(lIIlIIIIIlIlI[lIIlIIIIIlIll[80]]);
                        Time.sleepTicks((int)lIIlIIIIIlIll[5]);
                        0;
                    }
                }
                WorldArea var4 = new WorldArea(lIIlIIIIIlIll[71], lIIlIIIIIlIll[37], lIIlIIIIIlIll[19], lIIlIIIIIlIll[0], lIIlIIIIIlIll[1]);
                WorldArea var30 = new WorldArea(lIIlIIIIIlIll[32], lIIlIIIIIlIll[33], lIIlIIIIIlIll[3], lIIlIIIIIlIll[7], lIIlIIIIIlIll[1]);
                if (!r.lIlIIlllIlIllIl(var4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || r.lIlIIlllIlIlIll(var30.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (r.lIlIIlllIlIllIl(Dialog.isOpen() ? 1 : 0)) {
                        String[] stringArray = new String[lIIlIIIIIlIll[0]];
                        stringArray[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[81]];
                        TileObjects.getNearest((String[])stringArray).interact(lIIlIIIIIlIlI[lIIlIIIIIlIll[82]]);
                        Time.sleepTicks((int)lIIlIIIIIlIll[5]);
                        0;
                    }
                    g.a(bW);
                }
            }
            if (r.lIlIIlllIllIlII(e.j(fn), lIIlIIIIIlIll[3])) {
                if (r.lIlIIlllIlIlIll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIIlIIIIIlIll[83], lIIlIIIIIlIll[84], lIIlIIIIIlIll[1])) ? 1 : 0)) {
                    AccBuilderRat.c = lIIlIIIIIlIlI[lIIlIIIIIlIll[85]];
                    String[] stringArray = new String[lIIlIIIIIlIll[0]];
                    stringArray[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[86]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIlIIIIIlIlI[lIIlIIIIIlIll[87]]);
                    Time.sleepTicks((int)lIIlIIIIIlIll[3]);
                    0;
                }
                var9 = new WorldArea(lIIlIIIIIlIll[88], lIIlIIIIIlIll[72], lIIlIIIIIlIll[18], lIIlIIIIIlIll[6], lIIlIIIIIlIll[0]);
                var11 = new WorldPoint(lIIlIIIIIlIll[32], lIIlIIIIIlIll[67], lIIlIIIIIlIll[0]);
                var13 = new WorldPoint(lIIlIIIIIlIll[32], lIIlIIIIIlIll[37], lIIlIIIIIlIll[0]);
                var7 = new WorldPoint(lIIlIIIIIlIll[32], lIIlIIIIIlIll[56], lIIlIIIIIlIll[0]);
                if (!(r.lIlIIlllIlIllIl(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIIlIIIIIlIll[89], lIIlIIIIIlIll[37], lIIlIIIIIlIll[0])) ? 1 : 0) && r.lIlIIlllIlIllIl(var9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && r.lIlIIlllIlIllIl(Players.getLocal().getWorldLocation().equals((Object)var11) ? 1 : 0) && r.lIlIIlllIlIllIl(Players.getLocal().getWorldLocation().equals((Object)var13) ? 1 : 0) && !r.lIlIIlllIlIlIll(Players.getLocal().getWorldLocation().equals((Object)var7) ? 1 : 0))) {
                    AccBuilderRat.c = lIIlIIIIIlIlI[lIIlIIIIIlIll[90]];
                    String[] stringArray = new String[lIIlIIIIIlIll[0]];
                    stringArray[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[91]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIlIIIIIlIlI[lIIlIIIIIlIll[92]]);
                    Time.sleepTicks((int)lIIlIIIIIlIll[3]);
                    0;
                }
                if (r.lIlIIlllIlIlIll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIIlIIIIIlIll[83], lIIlIIIIIlIll[67], lIIlIIIIIlIll[0])) ? 1 : 0)) {
                    AccBuilderRat.c = lIIlIIIIIlIlI[lIIlIIIIIlIll[93]];
                    Time.sleepTicks((int)lIIlIIIIIlIll[5]);
                    0;
                    String[] stringArray = new String[lIIlIIIIIlIll[0]];
                    stringArray[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[94]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIlIIIIIlIlI[lIIlIIIIIlIll[95]]);
                    Time.sleepTicks((int)lIIlIIIIIlIll[3]);
                    0;
                }
                if (r.lIlIIlllIlIlIll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIIlIIIIIlIll[32], lIIlIIIIIlIll[52], lIIlIIIIIlIll[3])) ? 1 : 0)) {
                    AccBuilderRat.c = lIIlIIIIIlIlI[lIIlIIIIIlIll[96]];
                    Movement.walkTo((WorldPoint)new WorldPoint(lIIlIIIIIlIll[64], lIIlIIIIIlIll[52], lIIlIIIIIlIll[3]));
                    0;
                    Time.sleepTicks((int)lIIlIIIIIlIll[3]);
                    0;
                }
                if (r.lIlIIlllIlIlIll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIIlIIIIIlIll[64], lIIlIIIIIlIll[52], lIIlIIIIIlIll[3])) ? 1 : 0)) {
                    AccBuilderRat.c = lIIlIIIIIlIlI[lIIlIIIIIlIll[97]];
                    String[] stringArray = new String[lIIlIIIIIlIll[0]];
                    stringArray[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[98]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIlIIIIIlIlI[lIIlIIIIIlIll[99]]);
                    Time.sleepTicks((int)lIIlIIIIIlIll[3]);
                    0;
                }
                if (r.lIlIIlllIlIlIll((var3 = new WorldArea(lIIlIIIIIlIll[55], lIIlIIIIIlIll[56], lIIlIIIIIlIll[13], lIIlIIIIIlIll[7], lIIlIIIIIlIll[0])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] stringArray = new String[lIIlIIIIIlIll[0]];
                    stringArray[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[100]];
                    String[] stringArray17 = new String[lIIlIIIIIlIll[0]];
                    stringArray17[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[101]];
                    if (r.lIlIIlllIlIlIll(TileObjects.getNearest((String[])stringArray).hasAction(stringArray17) ? 1 : 0)) {
                        String[] stringArray18 = new String[lIIlIIIIIlIll[0]];
                        stringArray18[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[102]];
                        TileObjects.getNearest((String[])stringArray18).interact(lIIlIIIIIlIlI[lIIlIIIIIlIll[103]]);
                        Time.sleepTicks((int)lIIlIIIIIlIll[3]);
                        0;
                    }
                    String[] stringArray19 = new String[lIIlIIIIIlIll[0]];
                    stringArray19[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[104]];
                    String[] stringArray20 = new String[lIIlIIIIIlIll[0]];
                    stringArray20[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[105]];
                    if (r.lIlIIlllIlIllIl(TileObjects.getNearest((String[])stringArray19).hasAction(stringArray20) ? 1 : 0)) {
                        if (r.lIlIIlllIlIllIl(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIIlIIIIIlIll[53], lIIlIIIIIlIll[22], lIIlIIIIIlIll[0])) ? 1 : 0)) {
                            Movement.walkTo((WorldPoint)new WorldPoint(lIIlIIIIIlIll[53], lIIlIIIIIlIll[22], lIIlIIIIIlIll[0]));
                            0;
                            Time.sleepTicks((int)lIIlIIIIIlIll[0]);
                            0;
                        }
                        if (r.lIlIIlllIlIlIll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIIlIIIIIlIll[53], lIIlIIIIIlIll[22], lIIlIIIIIlIll[0])) ? 1 : 0)) {
                            String[] stringArray21 = new String[lIIlIIIIIlIll[0]];
                            stringArray21[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[106]];
                            TileObjects.getNearest((String[])stringArray21).interact(lIIlIIIIIlIlI[lIIlIIIIIlIll[107]]);
                            Time.sleepTicks((int)lIIlIIIIIlIll[3]);
                            0;
                        }
                    }
                }
                if (r.lIlIIlllIlIlIll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIIlIIIIIlIll[53], lIIlIIIIIlIll[22], lIIlIIIIIlIll[3])) ? 1 : 0)) {
                    Movement.walkTo((int)lIIlIIIIIlIll[108], (int)lIIlIIIIIlIll[109], (int)lIIlIIIIIlIll[3]);
                    0;
                    Time.sleepTicks((int)lIIlIIIIIlIll[3]);
                    0;
                }
                if (r.lIlIIlllIlIlIll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIIlIIIIIlIll[108], lIIlIIIIIlIll[109], lIIlIIIIIlIll[3])) ? 1 : 0)) {
                    String[] stringArray = new String[lIIlIIIIIlIll[0]];
                    stringArray[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[110]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIlIIIIIlIlI[lIIlIIIIIlIll[111]]);
                    Time.sleepTicks((int)lIIlIIIIIlIll[3]);
                    0;
                }
                if (r.lIlIIlllIlIlIll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIIlIIIIIlIll[108], lIIlIIIIIlIll[109], lIIlIIIIIlIll[0])) ? 1 : 0)) {
                    Time.sleepTicks((int)lIIlIIIIIlIll[3]);
                    0;
                    TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (r.lIlIIlllIlIlIll(tileObject.getName().equalsIgnoreCase(lIIlIIIIIlIlI[lIIlIIIIIlIll[144]]) ? 1 : 0)) {
                            String[] stringArray = new String[lIIlIIIIIlIll[0]];
                            stringArray[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[145]];
                            if (r.lIlIIlllIlIlIll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                n2 = lIIlIIIIIlIll[0];
                                0;
                                if (-(0x3E ^ 0x40 ^ (0x25 ^ 0x5F)) < 0) return n2 != 0;
                                return ((0x1F ^ 0x47 ^ (0x9E ^ 0x98)) & (5 ^ 0x47 ^ (0x79 ^ 0x65) ^ -1)) != 0;
                            }
                        }
                        n2 = lIIlIIIIIlIll[1];
                        return n2 != 0;
                    }).interact(lIIlIIIIIlIlI[lIIlIIIIIlIll[112]]);
                    Time.sleepTicks((int)lIIlIIIIIlIll[3]);
                    0;
                }
                if (r.lIlIIlllIlIlIll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIIlIIIIIlIll[55], lIIlIIIIIlIll[109], lIIlIIIIIlIll[1])) ? 1 : 0)) {
                    Time.sleepTicks((int)lIIlIIIIIlIll[3]);
                    0;
                    String[] stringArray = new String[lIIlIIIIIlIll[0]];
                    stringArray[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[113]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIlIIIIIlIlI[lIIlIIIIIlIll[114]]);
                    Time.sleepTicks((int)lIIlIIIIIlIll[3]);
                    0;
                }
                if (r.lIlIIlllIlIlIll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIIlIIIIIlIll[108], lIIlIIIIIlIll[115], lIIlIIIIIlIll[1])) ? 1 : 0)) {
                    Time.sleepTicks((int)lIIlIIIIIlIll[3]);
                    0;
                    String[] stringArray = new String[lIIlIIIIIlIll[0]];
                    stringArray[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[116]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIlIIIIIlIlI[lIIlIIIIIlIll[117]]);
                    Time.sleepTicks((int)lIIlIIIIIlIll[3]);
                    0;
                }
                var21 = new WorldArea(lIIlIIIIIlIll[30], lIIlIIIIIlIll[22], lIIlIIIIIlIll[35], lIIlIIIIIlIll[3], lIIlIIIIIlIll[1]);
                var35 = NPCs.getNearest(nPC -> {
                    int n2;
                    if (r.lIlIIlllIlIlIll(nPC.getName().contains(lIIlIIIIIlIlI[lIIlIIIIIlIll[140]]) ? 1 : 0) && r.lIlIIlllIllIIlI(nPC.getWorldLocation().distanceTo(new WorldPoint(lIIlIIIIIlIll[88], lIIlIIIIIlIll[22], lIIlIIIIIlIll[1])), lIIlIIIIIlIll[0]) && r.lIlIIlllIllIlll(nPC.getInteracting(), Players.getLocal())) {
                        n2 = lIIlIIIIIlIll[0];
                        0;
                        if (((84 + 126 - 157 + 115 ^ 128 + 20 - 96 + 89) & (0xBF ^ 0xB4 ^ (0x29 ^ 7) ^ -1)) != ((124 + 196 - 162 + 66 ^ 117 + 103 - 161 + 116) & (79 + 64 - 96 + 162 ^ 98 + 74 - 81 + 67 ^ -1))) {
                            return false;
                        }
                    } else {
                        n2 = lIIlIIIIIlIll[1];
                    }
                    return n2 != 0;
                });
                if (r.lIlIIlllIlIlIll(var21.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && r.lIlIIlllIlIllll(var35)) {
                    AccBuilderRat.c = lIIlIIIIIlIlI[lIIlIIIIIlIll[118]];
                    e.b(new WorldPoint(lIIlIIIIIlIll[119], lIIlIIIIIlIll[22], lIIlIIIIIlIll[1]));
                    Time.sleepTicks((int)lIIlIIIIIlIll[34]);
                    0;
                }
                if (!r.lIlIIlllIlIllIl(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIIlIIIIIlIll[88], lIIlIIIIIlIll[22], lIIlIIIIIlIll[1])) ? 1 : 0) || r.lIlIIlllIlIlIll(var21.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    var35 = NPCs.getNearest(nPC -> {
                        int n2;
                        if (r.lIlIIlllIlIlIll(nPC.getName().contains(lIIlIIIIIlIlI[lIIlIIIIIlIll[143]]) ? 1 : 0) && r.lIlIIlllIllIIlI(nPC.getWorldLocation().distanceTo(new WorldPoint(lIIlIIIIIlIll[88], lIIlIIIIIlIll[22], lIIlIIIIIlIll[1])), lIIlIIIIIlIll[3]) && r.lIlIIlllIllIlll(nPC.getInteracting(), Players.getLocal())) {
                            n2 = lIIlIIIIIlIll[0];
                            0;
                            if (-1 != -1) {
                                return ((16 + 118 - 101 + 120 ^ 65 + 0 - -81 + 2) & (0xAF ^ 0x9B ^ (0x79 ^ 0x40) ^ -1)) != 0;
                            }
                        } else {
                            n2 = lIIlIIIIIlIll[1];
                        }
                        return n2 != 0;
                    });
                    if (r.lIlIIlllIlIllIl(Dialog.isOpen() ? 1 : 0) && r.lIlIIlllIllIllI(var35)) {
                        String[] stringArray = new String[lIIlIIIIIlIll[0]];
                        stringArray[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[120]];
                        TileObjects.getNearest((String[])stringArray).interact(lIIlIIIIIlIlI[lIIlIIIIIlIll[121]]);
                        Time.sleepTicks((int)lIIlIIIIIlIll[0]);
                        0;
                    }
                    while (r.lIlIIlllIlIlIll(Dialog.isOpen() ? 1 : 0)) {
                        g.a(bW);
                        Time.sleep((long)50L);
                        0;
                        0;
                        
                        return;
                    }
                }
                if (r.lIlIIlllIlIlIll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIIlIIIIIlIll[71], lIIlIIIIIlIll[22], lIIlIIIIIlIll[1])) ? 1 : 0)) {
                    Time.sleepTicks((int)lIIlIIIIIlIll[3]);
                    0;
                    String[] stringArray = new String[lIIlIIIIIlIll[0]];
                    stringArray[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[122]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIlIIIIIlIlI[lIIlIIIIIlIll[123]]);
                    Time.sleepTicks((int)lIIlIIIIIlIll[3]);
                    0;
                }
                var40 = new WorldArea(lIIlIIIIIlIll[89], lIIlIIIIIlIll[48], lIIlIIIIIlIll[38], lIIlIIIIIlIll[5], lIIlIIIIIlIll[0]);
                var20 = new WorldArea(lIIlIIIIIlIll[124], lIIlIIIIIlIll[67], lIIlIIIIIlIll[6], lIIlIIIIIlIll[34], lIIlIIIIIlIll[0]);
                if (!r.lIlIIlllIlIllIl(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIIlIIIIIlIll[89], lIIlIIIIIlIll[48], lIIlIIIIIlIll[0])) ? 1 : 0) || !r.lIlIIlllIlIllIl(var40.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || r.lIlIIlllIlIlIll(var20.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (r.lIlIIlllIlIlIll(Inventory.contains((int[])f.ba) ? 1 : 0) && r.lIlIIlllIlIllII(Movement.getRunEnergy(), lIIlIIIIIlIll[97])) {
                        Inventory.getFirst((int[])f.ba).interact(lIIlIIIIIlIlI[lIIlIIIIIlIll[125]]);
                        Time.sleepTicks((int)lIIlIIIIIlIll[3]);
                        0;
                    }
                    Time.sleepTicks((int)lIIlIIIIIlIll[3]);
                    0;
                    String[] stringArray = new String[lIIlIIIIIlIll[0]];
                    stringArray[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[126]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIlIIIIIlIlI[lIIlIIIIIlIll[127]]);
                    Time.sleepTicks((int)lIIlIIIIIlIll[3]);
                    0;
                }
                if (r.lIlIIlllIlIlIll((var37 = new WorldArea(lIIlIIIIIlIll[32], lIIlIIIIIlIll[27], lIIlIIIIIlIll[34], lIIlIIIIIlIll[19], lIIlIIIIIlIll[0])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && r.lIlIIlllIlIllIl(Dialog.isOpen() ? 1 : 0)) {
                    String[] stringArray = new String[lIIlIIIIIlIll[0]];
                    stringArray[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[128]];
                    if (r.lIlIIlllIlIlIll(Inventory.contains((String[])stringArray) ? 1 : 0) && r.lIlIIlllIlIllIl(Players.getLocal().isMoving() ? 1 : 0)) {
                        String[] stringArray22 = new String[lIIlIIIIIlIll[0]];
                        stringArray22[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[129]];
                        String[] stringArray23 = new String[lIIlIIIIIlIll[0]];
                        stringArray23[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[130]];
                        Inventory.getFirst((String[])stringArray22).useOn(TileObjects.getNearest((String[])stringArray23));
                        Time.sleepTicks((int)lIIlIIIIIlIll[3]);
                        0;
                    }
                }
                g.a(bW);
            }
            if (r.lIlIIlllIllIlII(e.j(fn), lIIlIIIIIlIll[5])) {
                var9 = new WorldArea(lIIlIIIIIlIll[32], lIIlIIIIIlIll[27], lIIlIIIIIlIll[34], lIIlIIIIIlIll[19], lIIlIIIIIlIll[0]);
                if (r.lIlIIlllIlIlIll(var9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    int[] nArray = new int[lIIlIIIIIlIll[0]];
                    nArray[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIll[9];
                    Inventory.getFirst((int[])nArray).interact(lIIlIIIIIlIlI[lIIlIIIIIlIll[131]]);
                    Time.sleepTicks((int)lIIlIIIIIlIll[7]);
                    0;
                }
                if (r.lIlIIlllIlIllIl(var9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (!r.lIlIIlllIllIIlI(Players.getLocal().getWorldLocation().distanceTo(fd), lIIlIIIIIlIll[7]) || r.lIlIIlllIllIIll(Players.getLocal().getWorldLocation().getPlane(), lIIlIIIIIlIll[3])) {
                        AccBuilderRat.c = lIIlIIIIIlIlI[lIIlIIIIIlIll[132]];
                        if (r.lIlIIlllIlIlIll(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        e.E();
                        Movement.walkTo((WorldPoint)fd);
                        0;
                        Time.sleepTicks((int)lIIlIIIIIlIll[0]);
                        0;
                    }
                    if (r.lIlIIlllIllIIlI(Players.getLocal().getWorldLocation().distanceTo(fd), lIIlIIIIIlIll[7])) {
                        if (r.lIlIIlllIlIllII(co, lIIlIIIIIlIll[0])) {
                            P.lE += lIIlIIIIIlIll[0];
                            P.d(AccBuilderRat.m);
                            co += lIIlIIIIIlIll[0];
                            P.lE = lIIlIIIIIlIll[1];
                            cp = lIIlIIIIIlIll[1];
                        }
                        g.a(lIIlIIIIIlIlI[lIIlIIIIIlIll[133]], bW);
                    }
                }
            }
            g.a(new String[lIIlIIIIIlIll[1]]);
        }
    }

    private static String lIlIIlllIlIIlll(String var39, String var6) {
        try {
            SecretKeySpec var25 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), lIIlIIIIIlIll[20]), "DES");
            Cipher var26 = Cipher.getInstance("DES");
            var26.init(lIIlIIIIIlIll[3], var25);
            return new String(var26.doFinal(Base64.getDecoder().decode(var39.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var29) {
            var29.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlllIllIlll(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIlIIlllIlIllII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIlllIllIlIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIIlllIlIlIll(int n2) {
        return n2 != 0;
    }

    private static String lIlIIlllIlIIllI(String var2, String var24) {
        var2 = new String(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var22 = var24.toCharArray();
        int var32 = lIIlIIIIIlIll[1];
        char[] var14 = var2.toCharArray();
        int var15 = var14.length;
        int var23 = lIIlIIIIIlIll[1];
        while (r.lIlIIlllIlIllII(var23, var15)) {
            char var16 = var14[var23];
            var8.append((char)(var16 ^ var22[var32 % var22.length]));
            0;
            ++var32;
            ++var23;
            0;
            if (1 != 0) continue;
            return null;
        }
        return String.valueOf(var8);
    }

    private static boolean lIlIIlllIllIIlI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIlIIlllIlIllIl(int n2) {
        return n2 == 0;
    }

    private static void lIlIIlllIlIlIII() {
        lIIlIIIIIlIlI = new String[lIIlIIIIIlIll[162]];
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[1]] = r."Finished buying items, switching back to quest";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[0]] = r."Need 12 QP";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[3]] = r."Nav to bank";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[5]] = r."Handling banking";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[6]] = r."We are missing quest supplies, switching to BUYING";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[7]] = r."Drink";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[18]] = r."Eat";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[19]] = r."Nav to start";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[20]] = r."Sir Amik Varze";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[34]] = r."Nav to fortress";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[13]] = r."Bronze med helm";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[38]] = r."Iron chainbody";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[2]] = r."Bronze med helm";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[35]] = r."Bronze med helm";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[39]] = r."Wear";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[16]] = r."Iron chainbody";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[40]] = r."Iron chainbody";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[41]] = r."Wear";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[42]] = r."Drink";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[29]] = r."Bronze med helm";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[26]] = r."Iron chainbody";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[43]] = r."Sturdy door";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[44]] = r."Open";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[45]] = r."Push wall";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[31]] = r."Wall";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[46]] = r."Push";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[49]] = r."Climb up first ladder";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[50]] = r."Climb-up";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[51]] = r."Climb up 2nd ladder";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[28]] = r."Climb-up";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[25]] = r."Climb down 1st ladder";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[54]] = r."Climb-down";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[57]] = r."Handle door and ladder up";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[58]] = r."Door";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[59]] = r."Open";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[60]] = r."Door";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[61]] = r."Open";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[62]] = r."Door";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[63]] = r."Open";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[65]] = r."Ladder";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[66]] = r."Climb-up";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[68]] = r."Climb down second ladder";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[69]] = r."Ladder";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[70]] = r."Climb-down";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[73]] = r."Sturdy door";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[74]] = r."Open";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[75]] = r."Sturdy door";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[76]] = r."Open";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[77]] = r."Sturdy door";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[78]] = r."Open";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[17]] = r."Sturdy door";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[79]] = r."Open";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[80]] = r."Climb-down";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[81]] = r."Grill";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[82]] = r."Listen-at";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[85]] = r."Ladder up 1";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[86]] = r."Ladder";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[87]] = r."Climb-up";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[90]] = r."Door 1";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[91]] = r."Sturdy door";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[92]] = r."Open";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[93]] = r."ladder up 2";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[94]] = r."Ladder";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[95]] = r."Climb-up";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[96]] = r."Walk to ladder down 1 tile";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[97]] = r."Climb down 1";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[98]] = r."Ladder";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[99]] = r."Climb-down";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[100]] = r."Door";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[101]] = r."Open";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[102]] = r."Door";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[103]] = r."Open";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[104]] = r."Ladder";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[105]] = r."Open";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[106]] = r."Ladder";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[107]] = r."Climb-up";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[110]] = r."Ladder";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[111]] = r."Climb-down";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[112]] = r."Climb-down";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[113]] = r."Wall";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[114]] = r."Push";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[116]] = r."Door";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[117]] = r."Open";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[118]] = r."Luring knight";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[120]] = r."Door";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[121]] = r."Open";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[122]] = r."Ladder";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[123]] = r."Climb-up";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[125]] = r."Drink";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[126]] = r."Wall";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[127]] = r."Push";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[128]] = r."Cabbage";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[129]] = r."Cabbage";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[130]] = r."Hole";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[131]] = r."Break";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[132]] = r."Nav to start";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[133]] = r."Sir Amik Varze";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[141]] = r."Black Knights Fortress";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[142]] = r."ring of wealth (";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[143]] = r."Knight";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[140]] = r."Knight";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[144]] = r."ladder";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[145]] = r."Climb-down";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[146]] = r."Ladder";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[147]] = r."Climb-down";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[148]] = r."ladder";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[149]] = r."Climb-down";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[150]] = r."ladder";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[151]] = r."Climb-up";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[152]] = r."ladder";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[153]] = r."Climb-up";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[158]] = r."Yes.";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[159]] = r."I seek a quest!";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[160]] = r."I laugh in the face of danger!";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[161]] = r."I don't care. I'm going in anyway.";
    }

    private static boolean lIlIIlllIllIIll(int n2, int n3) {
        return n2 != n3;
    }

    private static int lIlIIlllIlIlIlI(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }
}

