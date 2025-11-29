/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
 *  net.runelite.api.TileItem
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
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
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Skill;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.a;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.b;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.d;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.e;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.f;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.j;

public class ae
implements ac {
    private static /* synthetic */ int[] llIIlllIll;
    public static /* synthetic */ int mT;
    static /* synthetic */ WorldArea mY;
    private static /* synthetic */ WorldPoint mZ;
    public static /* synthetic */ int mU;
    public static /* synthetic */ List<d> bv;
    static /* synthetic */ WorldArea mW;
    private static /* synthetic */ String[] llIIlllIIl;
    static /* synthetic */ WorldArea mX;
    public static /* synthetic */ int mV;
    public static /* synthetic */ boolean bt;

    private static void lIlIlllIIlIIl() {
        llIIlllIll = new int[239];
        ae.llIIlllIll[0] = (98 + 123 - 141 + 97 ^ 21 + 85 - 104 + 132) & (0x69 ^ 0x75 ^ (0x6E ^ 0x45) ^ -1);
        ae.llIIlllIll[1] = 1;
        ae.llIIlllIll[2] = 0x35 ^ 0x30;
        ae.llIIlllIll[3] = 2;
        ae.llIIlllIll[4] = 0xFFFF8FDF & 0x7DA7;
        ae.llIIlllIll[5] = 0xFFFFDFF7 & 0x2D8D;
        ae.llIIlllIll[6] = 0xCF ^ 0x83 ^ (0xB5 ^ 0xC7);
        ae.llIIlllIll[7] = 0x30 ^ 3;
        ae.llIIlllIll[8] = -(0xFFFFBFCB & 0x6276) & (0xFFFFEFFD & 0x3FFB);
        ae.llIIlllIll[9] = 0xFFFF9FF9 & 0x6D9E;
        ae.llIIlllIll[10] = 3;
        ae.llIIlllIll[11] = -(0xFFFF8F25 & 0x74FF) & (0xFFFF97ED & 0x7FBE);
        ae.llIIlllIll[12] = 39 + 111 - 5 + 29 ^ 91 + 148 - 81 + 6;
        ae.llIIlllIll[13] = -(0x12 ^ 0xB) & (0xFFFF9F7F & 0x7FDF);
        ae.llIIlllIll[14] = 0xFFFFDF5B & 0x3FEC;
        ae.llIIlllIll[15] = 0xFFFFDFE9 & 0x3F5F;
        ae.llIIlllIll[16] = 0xFFFF8F0D & Short.MAX_VALUE;
        ae.llIIlllIll[17] = 68 + 113 - 56 + 32 ^ 60 + 28 - 36 + 101;
        ae.llIIlllIll[18] = -(0xFFFFDB51 & 0x75AF) & (0xFFFFFFDC & 0x7FEF);
        ae.llIIlllIll[19] = -(0xFFFFEEAB & 0x5FD5) & (0xFFFFFFFB & 0x7FD5);
        ae.llIIlllIll[20] = 106 + 33 - -25 + 35 ^ 93 + 34 - 17 + 83;
        ae.llIIlllIll[21] = -(0xFFFFFB77 & 0x44AD) & (0xFFFFDF6F & 0x7FFE);
        ae.llIIlllIll[22] = 0xB1 ^ 0xB6;
        ae.llIIlllIll[23] = 0xFFFFC3F3 & 0x3D8D;
        ae.llIIlllIll[24] = 31 + 27 - -14 + 82 ^ 42 + 137 - 158 + 125;
        ae.llIIlllIll[25] = -(0xFFFFB375 & 0x7F9F) & (0xFFFFFFB7 & Short.MAX_VALUE);
        ae.llIIlllIll[26] = 0x33 ^ 0x3A;
        ae.llIIlllIll[27] = -(0xFFFFFFF9 & 0x2847) & (0xFFFFFBFE & 0x7EDB);
        ae.llIIlllIll[28] = -(0xFFFFB3A7 & 0x4D79) & (0xFFFFAF75 & 0x7FFE);
        ae.llIIlllIll[29] = 0xFFFFAFDC & 0x7E73;
        ae.llIIlllIll[30] = 0xFFFFEFEE & 0x3E5F;
        ae.llIIlllIll[31] = -(0xFFFFFDF7 & 0x53BB) & (0xFFFFFFFE & Short.MAX_VALUE);
        ae.llIIlllIll[32] = 0xFFFFBF72 & 0x6EDF;
        ae.llIIlllIll[33] = 0xFFFFEFEE & 0x3E5B;
        ae.llIIlllIll[34] = -(0xFFFFDFFF & 0x7039) & (0xFFFFFEFD & 0x7FFA);
        ae.llIIlllIll[35] = 0x54 ^ 0x50 ^ (0x13 ^ 0x4F);
        ae.llIIlllIll[36] = -(0xFFFFFCFB & 0x1315) & (0xFFFFFFBB & 0x5F5F);
        ae.llIIlllIll[37] = 0x16 ^ 0x3E;
        ae.llIIlllIll[38] = 0x8D ^ 0x82;
        ae.llIIlllIll[39] = 0xCF ^ 0x85 ^ (0xF4 ^ 0x8C);
        ae.llIIlllIll[40] = 0x21 ^ 0x35;
        ae.llIIlllIll[41] = 0x20 ^ 0x15 ^ (0x90 ^ 0xBC);
        ae.llIIlllIll[42] = 0x19 ^ 7;
        ae.llIIlllIll[43] = -(0xFFFFFE57 & 0xFB9) & (0xFFFFBF3F & 0x4FFE);
        ae.llIIlllIll[44] = 0x80 ^ 0xBC;
        ae.llIIlllIll[45] = -(0xFFFFFBDF & 0x1C21) & (0xFFFFFF3F & 0x19F3);
        ae.llIIlllIll[46] = -(0xFFFFDD43 & 0x36FF) & (0xFFFFDFF7 & 0x3DEF);
        ae.llIIlllIll[47] = 0xFFFFBFEF & 0x4D7B;
        ae.llIIlllIll[48] = 0xFFFFCDF6 & 0x3F69;
        ae.llIIlllIll[49] = 0xFA ^ 0xB4 ^ (0x36 ^ 0x73);
        ae.llIIlllIll[50] = -(0xFFFFD603 & 0x39FD) & (0xFFFFDFFD & 0x3D5F);
        ae.llIIlllIll[51] = 0xFFFFCFF7 & 0x39A9;
        ae.llIIlllIll[52] = 0xFFFFBFFF & 0x4D57;
        ae.llIIlllIll[53] = 0x88 ^ 0xAB ^ (0x87 ^ 0xAA);
        ae.llIIlllIll[54] = 0x11 ^ 3;
        ae.llIIlllIll[55] = 0xFFFFADB3 & 0x5BFF;
        ae.llIIlllIll[56] = 0xFFFFBDDB & 0x4F7C;
        ae.llIIlllIll[57] = -(0xFFFFA5AF & 0x7E51) & (0xFFFFFFB3 & 0x2DFE);
        ae.llIIlllIll[58] = -(0xFFFFF323 & 0x7EFF) & (0xFFFFFF7F & 0x7FFB);
        ae.llIIlllIll[59] = 0xFFFFBDB3 & 0x4BFD;
        ae.llIIlllIll[60] = -(0xFFFFE3AD & 0x3ED3) & (0xFFFFFFFF & 0x2FE3);
        ae.llIIlllIll[61] = 0x7C ^ 9 ^ (0xE4 ^ 0x87);
        ae.llIIlllIll[62] = -1;
        ae.llIIlllIll[63] = 0x45 ^ 0x4A ^ 3;
        ae.llIIlllIll[64] = 15 + 32 - -68 + 12 ^ (0xCB ^ 0xB9);
        ae.llIIlllIll[65] = 0x56 ^ 0x46;
        ae.llIIlllIll[66] = 0xB6 ^ 0xA7;
        ae.llIIlllIll[67] = 4 ^ 0x17;
        ae.llIIlllIll[68] = 0x43 ^ 0x2A ^ (0xF6 ^ 0x8A);
        ae.llIIlllIll[69] = 0xAA ^ 0xBD;
        ae.llIIlllIll[70] = 3 ^ 0x1B;
        ae.llIIlllIll[71] = 0x57 ^ 0x4D;
        ae.llIIlllIll[72] = 0x87 ^ 0x9C;
        ae.llIIlllIll[73] = 0x4D ^ 0x51;
        ae.llIIlllIll[74] = 66 + 62 - 122 + 166 ^ 118 + 130 - 238 + 167;
        ae.llIIlllIll[75] = 0x7D ^ 0x62;
        ae.llIIlllIll[76] = -(0xFFFFF3DF & 0x4CA1) & (0xFFFFFFDF & 0x4CFF);
        ae.llIIlllIll[77] = -(0xFFFFF2EE & 0x7FDB) & (0xFFFFFFFF & 0x7FDF);
        ae.llIIlllIll[78] = 5 + 36 - -78 + 18;
        ae.llIIlllIll[79] = 0xE0 ^ 0xBE;
        ae.llIIlllIll[80] = -(0xFFFF8DF5 & 0x734B) & (0xFFFF9DDB & 0x6FF7);
        ae.llIIlllIll[81] = -(0xFFFFDE67 & 0x739F) & (0xFFFFFFD7 & 0x5F7F);
        ae.llIIlllIll[82] = 0xFFFFCDEF & 0x3E9C;
        ae.llIIlllIll[83] = 0xFFFFEF7F & 0x1CFE;
        ae.llIIlllIll[84] = 0xFFFFEFF7 & 0x1D5C;
        ae.llIIlllIll[85] = 0xFFFFAD77 & 0x5EFE;
        ae.llIIlllIll[86] = 0xFFFF8DDD & 0x7F77;
        ae.llIIlllIll[87] = 0xFFFFDDDF & 0x2F69;
        ae.llIIlllIll[88] = -(0xFFFFF7B5 & 0x7BDF) & (0xFFFFFFFF & Short.MAX_VALUE);
        ae.llIIlllIll[89] = -(0xFFFFCBF1 & 0x74CF) & (0xFFFFDFF6 & 0x6DFF);
        ae.llIIlllIll[90] = 0xFFFFEED1 & 0x1DBF;
        ae.llIIlllIll[91] = 0xFFFF9F6B & 0x6DD4;
        ae.llIIlllIll[92] = 0xFFFFFFFE & 0xCA3;
        ae.llIIlllIll[93] = 0xFFFFBD6E & 0x4FDB;
        ae.llIIlllIll[94] = -(0xFFFFF09B & 0x6F6D) & (0xFFFFEFFF & 0x7D5A);
        ae.llIIlllIll[95] = 0x52 ^ 0x72;
        ae.llIIlllIll[96] = 0xFFFFEFFF & 0x1C98;
        ae.llIIlllIll[97] = 101 + 20 - 20 + 42 ^ 38 + 57 - 31 + 110;
        ae.llIIlllIll[98] = 0x29 ^ 0x53 ^ (0 ^ 0x58);
        ae.llIIlllIll[99] = 0x5D ^ 0x7E;
        ae.llIIlllIll[100] = 0x40 ^ 0x64;
        ae.llIIlllIll[101] = 0xC2 ^ 0x8D ^ (0xDF ^ 0xB5);
        ae.llIIlllIll[102] = 0x7F ^ 0x59;
        ae.llIIlllIll[103] = 42 + 80 - 32 + 44 ^ 18 + 104 - -24 + 15;
        ae.llIIlllIll[104] = -(0xFFFFE7F3 & 0x1E4E) & (0xFFFFF7FD & 0x2F77);
        ae.llIIlllIll[105] = 0x38 ^ 0x11;
        ae.llIIlllIll[106] = 0xA0 ^ 0x8A;
        ae.llIIlllIll[107] = 0xD ^ 0x74 ^ (0x69 ^ 0x3B);
        ae.llIIlllIll[108] = 0xEF ^ 0x94 ^ (0x1F ^ 0x48);
        ae.llIIlllIll[109] = 0x2C ^ 1;
        ae.llIIlllIll[110] = 0x51 ^ 0x7F;
        ae.llIIlllIll[111] = 0x42 ^ 6 ^ (0x21 ^ 0x4A);
        ae.llIIlllIll[112] = 117 + 97 - 90 + 7 ^ 47 + 147 - 92 + 77;
        ae.llIIlllIll[113] = 0x45 ^ 0x76 ^ 2;
        ae.llIIlllIll[114] = 0x2A ^ 0x1E;
        ae.llIIlllIll[115] = 0xFFFFFFF7 & 0x39FA;
        ae.llIIlllIll[116] = 0xBB ^ 0xB1 ^ (0x36 ^ 9);
        ae.llIIlllIll[117] = 0x12 ^ 0x24;
        ae.llIIlllIll[118] = 0xFFFFFFFB & 0x39F7;
        ae.llIIlllIll[119] = 0x58 ^ 8 ^ (0xC8 ^ 0xAF);
        ae.llIIlllIll[120] = 0x6F ^ 0x1E ^ (0xF6 ^ 0xBF);
        ae.llIIlllIll[121] = -(0xFFFFD257 & 0x6DAB) & (0xFFFFFDF6 & 0x7BFF);
        ae.llIIlllIll[122] = 0x75 ^ 0x4C;
        ae.llIIlllIll[123] = 0x30 ^ 0xA;
        ae.llIIlllIll[124] = 0xA8 ^ 0x93;
        ae.llIIlllIll[125] = -(0xFFFFCB21 & 0x74FF) & (0xFFFFEFEF & 0x5DBF);
        ae.llIIlllIll[126] = -(0xFFFFDA77 & 0x75DE) & (0xFFFFDDDF & Short.MAX_VALUE);
        ae.llIIlllIll[127] = 0xFFFFADEE & 0x5FBF;
        ae.llIIlllIll[128] = -(0xFFFFF04E & 0x3FFF) & (0xFFFFBFEF & 0x7DFF);
        ae.llIIlllIll[129] = 0xFFFF9FEF & 0x6DB7;
        ae.llIIlllIll[130] = 0xFFFFCDFF & 0x3F9B;
        ae.llIIlllIll[131] = 0xFFFFEDEF & 0x1FB9;
        ae.llIIlllIll[132] = -(0xFFFFFEF1 & 0x337E) & (0xFFFFFFFF & 0x3FFF);
        ae.llIIlllIll[133] = 0xFFFFDDBB & 0x2FE5;
        ae.llIIlllIll[134] = 0xFFFF9FDB & 0x6DB7;
        ae.llIIlllIll[135] = -(0xFFFFFAFB & 0x6765) & (0xFFFFFFFD & 0x6FFF);
        ae.llIIlllIll[136] = -(0xFFFFE355 & 0x3EBF) & (0xFFFFEFFF & 0x3F9F);
        ae.llIIlllIll[137] = 0xFFFF8FFE & 0x7DB3;
        ae.llIIlllIll[138] = -(0xFFFFF95F & 0x76EF) & (0xFFFFFDDF & Short.MAX_VALUE);
        ae.llIIlllIll[139] = -(0xFFFFF36B & 0x3EF5) & (0xFFFFFFFE & 0x3FFF);
        ae.llIIlllIll[140] = 0xB7 ^ 0x8A;
        ae.llIIlllIll[141] = 0x76 ^ 0x49;
        ae.llIIlllIll[142] = 32 + 193 - 162 + 143 ^ 90 + 110 - 92 + 34;
        ae.llIIlllIll[143] = 0xFB ^ 0x82 ^ (0xB6 ^ 0x8E);
        ae.llIIlllIll[144] = 0x1C ^ 0x24 ^ (0x1E ^ 0x64);
        ae.llIIlllIll[145] = 0x7B ^ 0x38;
        ae.llIIlllIll[146] = 0xC6 ^ 0xA0 ^ (0x1A ^ 0x38);
        ae.llIIlllIll[147] = 0x50 ^ 0x7F ^ (0x23 ^ 0x49);
        ae.llIIlllIll[148] = 0x81 ^ 0xC7;
        ae.llIIlllIll[149] = 136 + 195 - 254 + 147 ^ 147 + 48 - 79 + 51;
        ae.llIIlllIll[150] = 0x61 ^ 0x43 ^ (0xB ^ 0x61);
        ae.llIIlllIll[151] = 0x62 ^ 0x66 ^ (0xD5 ^ 0x98);
        ae.llIIlllIll[152] = 0x48 ^ 0x10 ^ (1 ^ 0x13);
        ae.llIIlllIll[153] = 0x44 ^ 0xF;
        ae.llIIlllIll[154] = 0xFD ^ 0xBE ^ (0x67 ^ 0x68);
        ae.llIIlllIll[155] = 0xDA ^ 0x97;
        ae.llIIlllIll[156] = 0x7B ^ 0x35;
        ae.llIIlllIll[157] = 0x19 ^ 0x56;
        ae.llIIlllIll[158] = 0x1D ^ 0x4D;
        ae.llIIlllIll[159] = 0x31 ^ 0x60;
        ae.llIIlllIll[160] = 0x6E ^ 0x3C;
        ae.llIIlllIll[161] = 0x45 ^ 0x16;
        ae.llIIlllIll[162] = 0xFFFFFFFF & 0xA7F;
        ae.llIIlllIll[163] = -(0xFFFFEB97 & 0x54E9) & (0xFFFFDFFE & 0x6DFF);
        ae.llIIlllIll[164] = 0xFFFF9ADF & 0x6FBF;
        ae.llIIlllIll[165] = 0xFFFFEFAD & 0x1ADF;
        ae.llIIlllIll[166] = 0xFFFFEB9F & 0x1EF3;
        ae.llIIlllIll[167] = -(0xFFFFBD77 & 0x56AF) & (0xFFFF9FAF & 0x7EFF);
        ae.llIIlllIll[168] = 0xFFFF9ECC & 0x6BB3;
        ae.llIIlllIll[169] = 0xFFFFEFD3 & 0x1DAD;
        ae.llIIlllIll[170] = -(0xFFFFF1A1 & 0x5F5F) & (0xFFFFFFBB & 0x5BED);
        ae.llIIlllIll[171] = -(0xFFFFB7FF & 0x7A5E) & (0xFFFFBFFF & 0x7FFD);
        ae.llIIlllIll[172] = 0x30 ^ 0x64;
        ae.llIIlllIll[173] = 0xC8 ^ 0x9D;
        ae.llIIlllIll[174] = 154 + 141 - 290 + 229 ^ 77 + 49 - 1 + 63;
        ae.llIIlllIll[175] = 0xE4 ^ 0xB3;
        ae.llIIlllIll[176] = 0x32 ^ 0x6B;
        ae.llIIlllIll[177] = 181 + 115 - 166 + 65 ^ 53 + 33 - 74 + 141;
        ae.llIIlllIll[178] = 0x4F ^ 0x39 ^ (0x86 ^ 0xAB);
        ae.llIIlllIll[179] = 0x5E ^ 0x75 ^ (0xD ^ 0x7A);
        ae.llIIlllIll[180] = 0xFE ^ 0xA3;
        ae.llIIlllIll[181] = 12 + 171 - 73 + 98 ^ 1 + 123 - -5 + 14;
        ae.llIIlllIll[182] = 0xD5 ^ 0x9B ^ (0x15 ^ 0x3B);
        ae.llIIlllIll[183] = 0xFC ^ 0x9D;
        ae.llIIlllIll[184] = 131 + 119 - 100 + 56 ^ 130 + 20 - 127 + 149;
        ae.llIIlllIll[185] = 0x3F ^ 0x25 ^ (0xFB ^ 0x82);
        ae.llIIlllIll[186] = 0xCC ^ 0xC2 ^ (0x1A ^ 0x70);
        ae.llIIlllIll[187] = 0x5F ^ 0x1E ^ (0x15 ^ 0x31);
        ae.llIIlllIll[188] = 0x58 ^ 0x5E ^ (0xEE ^ 0x8E);
        ae.llIIlllIll[189] = 0xFFFF9E7F & 0x6DF7;
        ae.llIIlllIll[190] = -(0xFFFFFF7B & 0x62AD) & (0xFFFFEF7F & 0x7FFE);
        ae.llIIlllIll[191] = -(0xFFFFBF86 & 0x51FB) & (0xFFFFFFFF & 0x1DEF);
        ae.llIIlllIll[192] = -(0xFFFFD28B & 0x7DF5) & (0xFFFFFFBB & 0x5DFF);
        ae.llIIlllIll[193] = -(0xFFFFF5BB & 0xBD5) & (0xFFFFBFD9 & 0x6FFF);
        ae.llIIlllIll[194] = 0xDC ^ 0xBB;
        ae.llIIlllIll[195] = 0xFFFFD5FD & 0x3F7E;
        ae.llIIlllIll[196] = -(0xFFFFB8FB & 0x4F5C) & (0xFFFFF9FF & 0x6FFF);
        ae.llIIlllIll[197] = -(0xFFFFFDF5 & 0x4E2B) & (0xFFFFDFE6 & 0x6FBD);
        ae.llIIlllIll[198] = 0xFFFF93F6 & 0x6FBF;
        ae.llIIlllIll[199] = 0xFFFF9FDE & 0x67BF;
        ae.llIIlllIll[200] = -(0xFFFFC106 & 0x3FFB) & (0xFFFFE7F7 & 0x3BFF);
        ae.llIIlllIll[201] = 0xFFFFAEFE & 0x7FCB;
        ae.llIIlllIll[202] = -2 & (0xFFFFFF7F & 0x65DF);
        ae.llIIlllIll[203] = 0x33 ^ 0x5B;
        ae.llIIlllIll[204] = 0xE7 ^ 0x8E;
        ae.llIIlllIll[205] = 0xA7 ^ 0xB6 ^ (0xB9 ^ 0xC2);
        ae.llIIlllIll[206] = 0xF ^ 0x3B ^ (0x5F ^ 0);
        ae.llIIlllIll[207] = 0x60 ^ 0x5D ^ (0x2E ^ 0x7F);
        ae.llIIlllIll[208] = 0xEE ^ 0x90 ^ (0x3D ^ 0x2E);
        ae.llIIlllIll[209] = -(0xFFFFF7BD & 0x7963) & (0xFFFFFBAF & Short.MAX_VALUE);
        ae.llIIlllIll[210] = -(0xFFFFBFF3 & 0x724F) & (0xFFFFFFFB & 0x3FCF);
        ae.llIIlllIll[211] = 98 + 33 - 103 + 221 ^ 109 + 26 - 70 + 86;
        ae.llIIlllIll[212] = 0xFFFF8DDF & 0x7FAD;
        ae.llIIlllIll[213] = 0xEE ^ 0x81;
        ae.llIIlllIll[214] = -(0xFFFFF5AB & 0x5B5D) & (0xFFFFFB9F & 0x5FFF);
        ae.llIIlllIll[215] = 0xFFFFDFF6 & 0x2D9D;
        ae.llIIlllIll[216] = 0x3D ^ 0x4D;
        ae.llIIlllIll[217] = 0xFFFFFEB7 & 0xBDE;
        ae.llIIlllIll[218] = 0x22 ^ 0x53;
        ae.llIIlllIll[219] = -(0xFFFFA4EF & 0x5F19) & (0xFFFFCEE9 & 0x3FBF);
        ae.llIIlllIll[220] = -(0xFFFFFA3B & 0x37DF) & (0xFFFFFFBF & 0x3FFF);
        ae.llIIlllIll[221] = 0xAC ^ 0xBD ^ (0x68 ^ 0xB);
        ae.llIIlllIll[222] = 0xFFFFFDBE & 0xFF7;
        ae.llIIlllIll[223] = -(0xFFFFCF7D & 0x32E6) & (0xFFFFDFFF & 0x2FFF);
        ae.llIIlllIll[224] = 0xFE ^ 0x8D;
        ae.llIIlllIll[225] = 0xFFFFEFEF & 0x1DBF;
        ae.llIIlllIll[226] = 106 + 65 - 164 + 172 ^ 131 + 197 - 256 + 127;
        ae.llIIlllIll[227] = 0x85 ^ 0x93 ^ (0x48 ^ 0x2B);
        ae.llIIlllIll[228] = -(0xFFFFF77F & 0x68E9) & (0xFFFFFFFF & 0x6DFE);
        ae.llIIlllIll[229] = -(0xFFFFF2F1 & 0x3F1F) & (0xFFFFFFFC & 0x3FB7);
        ae.llIIlllIll[230] = 0x76 ^ 0x45 ^ (0x48 ^ 0xD);
        ae.llIIlllIll[231] = 0xFFFF9FFB & 0x6DAF;
        ae.llIIlllIll[232] = 57 + 99 - 116 + 155 ^ 141 + 167 - 167 + 39;
        ae.llIIlllIll[233] = 200 + 186 - 231 + 87 ^ 137 + 126 - 139 + 14;
        ae.llIIlllIll[234] = 0xFFFF9DFF & 0x6FB1;
        ae.llIIlllIll[235] = 0xFFFFEBAE & 0x1DF5;
        ae.llIIlllIll[236] = -(0xFFFFBC8F & 0x6376) & (0xFFFFBBEF & 0x6DBF);
        ae.llIIlllIll[237] = 0xFFFFEFFD & 0x1D6F;
        ae.llIIlllIll[238] = 77 + 64 - 115 + 165 ^ 133 + 102 - 180 + 143;
    }

    private static void lIlIlllIIIlll() {
        llIIlllIIl = new String[llIIlllIll[238]];
        ae.llIIlllIIl[ae.llIIlllIll[0]] = ae."Buying items";
        ae.llIIlllIIl[ae.llIIlllIll[1]] = ae."Finished buying items, switching back to agility";
        ae.llIIlllIIl[ae.llIIlllIll[3]] = ae."Navigating to bank";
        ae.llIIlllIIl[ae.llIIlllIll[10]] = ae."Handling banking";
        ae.llIIlllIIl[ae.llIIlllIll[17]] = ae."We are missing quest supplies, switching to BUYING";
        ae.llIIlllIIl[ae.llIIlllIll[2]] = ae."Vial";
        ae.llIIlllIIl[ae.llIIlllIll[20]] = ae."Vial";
        ae.llIIlllIIl[ae.llIIlllIll[22]] = ae."Drop";
        ae.llIIlllIIl[ae.llIIlllIll[24]] = ae."Drink";
        ae.llIIlllIIl[ae.llIIlllIll[26]] = ae."Eat";
        ae.llIIlllIIl[ae.llIIlllIll[12]] = ae."Nav to gnome course";
        ae.llIIlllIIl[ae.llIIlllIll[49]] = ae."Crossing log";
        ae.llIIlllIIl[ae.llIIlllIll[63]] = ae."Log balance";
        ae.llIIlllIIl[ae.llIIlllIll[64]] = ae."Walk-across";
        ae.llIIlllIIl[ae.llIIlllIll[53]] = ae."Climbing net";
        ae.llIIlllIIl[ae.llIIlllIll[38]] = ae."Obstacle net";
        ae.llIIlllIIl[ae.llIIlllIll[65]] = ae."Climb-over";
        ae.llIIlllIIl[ae.llIIlllIll[66]] = ae."Climbing branch";
        ae.llIIlllIIl[ae.llIIlllIll[54]] = ae."Tree branch";
        ae.llIIlllIIl[ae.llIIlllIll[67]] = ae."Climb";
        ae.llIIlllIIl[ae.llIIlllIll[40]] = ae."Crossing rope";
        ae.llIIlllIIl[ae.llIIlllIll[68]] = ae."Balancing rope";
        ae.llIIlllIIl[ae.llIIlllIll[61]] = ae."Walk-on";
        ae.llIIlllIIl[ae.llIIlllIll[69]] = ae."Climbing down";
        ae.llIIlllIIl[ae.llIIlllIll[70]] = ae."Tree branch";
        ae.llIIlllIIl[ae.llIIlllIll[41]] = ae."Climb-down";
        ae.llIIlllIIl[ae.llIIlllIll[71]] = ae."Climbing net";
        ae.llIIlllIIl[ae.llIIlllIll[72]] = ae."Obstacle net";
        ae.llIIlllIIl[ae.llIIlllIll[73]] = ae."Climb-over";
        ae.llIIlllIIl[ae.llIIlllIll[74]] = ae."Crossing pipe";
        ae.llIIlllIIl[ae.llIIlllIll[42]] = ae."Obstacle pipe";
        ae.llIIlllIIl[ae.llIIlllIll[75]] = ae."Squeeze-through";
        ae.llIIlllIIl[ae.llIIlllIll[95]] = ae."Nav to start";
        ae.llIIlllIIl[ae.llIIlllIll[97]] = ae."Mark of grace";
        ae.llIIlllIIl[ae.llIIlllIll[98]] = ae."Taking mark";
        ae.llIIlllIIl[ae.llIIlllIll[99]] = ae."Found mark on ground";
        ae.llIIlllIIl[ae.llIIlllIll[100]] = ae."Take";
        ae.llIIlllIIl[ae.llIIlllIll[101]] = ae."Starting course";
        ae.llIIlllIIl[ae.llIIlllIll[102]] = ae."Rough wall";
        ae.llIIlllIIl[ae.llIIlllIll[103]] = ae."Climb";
        ae.llIIlllIIl[ae.llIIlllIll[37]] = ae."Crossing clothes line";
        ae.llIIlllIIl[ae.llIIlllIll[105]] = ae."Clothes line";
        ae.llIIlllIIl[ae.llIIlllIll[106]] = ae."Cross";
        ae.llIIlllIIl[ae.llIIlllIll[107]] = ae."Leaping";
        ae.llIIlllIIl[ae.llIIlllIll[108]] = ae."Gap";
        ae.llIIlllIIl[ae.llIIlllIll[109]] = ae."Leap";
        ae.llIIlllIIl[ae.llIIlllIll[110]] = ae."Balancing";
        ae.llIIlllIIl[ae.llIIlllIll[111]] = ae."Wall";
        ae.llIIlllIIl[ae.llIIlllIll[112]] = ae."Balance";
        ae.llIIlllIIl[ae.llIIlllIll[113]] = ae."Jumping gap";
        ae.llIIlllIIl[ae.llIIlllIll[39]] = ae."Gap";
        ae.llIIlllIIl[ae.llIIlllIll[7]] = ae."Leap";
        ae.llIIlllIIl[ae.llIIlllIll[114]] = ae."Jumping gap 2";
        ae.llIIlllIIl[ae.llIIlllIll[116]] = ae."Leap";
        ae.llIIlllIIl[ae.llIIlllIll[117]] = ae."Jumping gap 3";
        ae.llIIlllIIl[ae.llIIlllIll[119]] = ae."Leap";
        ae.llIIlllIIl[ae.llIIlllIll[120]] = ae."Hurdle roof";
        ae.llIIlllIIl[ae.llIIlllIll[122]] = ae."Hurdle";
        ae.llIIlllIIl[ae.llIIlllIll[123]] = ae."Finishing course";
        ae.llIIlllIIl[ae.llIIlllIll[124]] = ae."Edge";
        ae.llIIlllIIl[ae.llIIlllIll[44]] = ae."Jump-off";
        ae.llIIlllIIl[ae.llIIlllIll[140]] = ae."Nav to canafis course";
        ae.llIIlllIIl[ae.llIIlllIll[6]] = ae."Nav to start";
        ae.llIIlllIIl[ae.llIIlllIll[141]] = ae."Starting course";
        ae.llIIlllIIl[ae.llIIlllIll[142]] = ae."Tall tree";
        ae.llIIlllIIl[ae.llIIlllIll[143]] = ae."Climb";
        ae.llIIlllIIl[ae.llIIlllIll[144]] = ae."Mark of grace";
        ae.llIIlllIIl[ae.llIIlllIll[145]] = ae."Taking mark";
        ae.llIIlllIIl[ae.llIIlllIll[146]] = ae."Found mark on ground";
        ae.llIIlllIIl[ae.llIIlllIll[147]] = ae."Take";
        ae.llIIlllIIl[ae.llIIlllIll[148]] = ae."Jumping gap 1";
        ae.llIIlllIIl[ae.llIIlllIll[149]] = ae."Jump";
        ae.llIIlllIIl[ae.llIIlllIll[150]] = ae."Jumping gap 2";
        ae.llIIlllIIl[ae.llIIlllIll[151]] = ae."Jump";
        ae.llIIlllIIl[ae.llIIlllIll[152]] = ae."Jumping gap 3";
        ae.llIIlllIIl[ae.llIIlllIll[153]] = ae."Jump";
        ae.llIIlllIIl[ae.llIIlllIll[154]] = ae."Jumping gap 4";
        ae.llIIlllIIl[ae.llIIlllIll[155]] = ae."Jump";
        ae.llIIlllIIl[ae.llIIlllIll[156]] = ae."Vaulting";
        ae.llIIlllIIl[ae.llIIlllIll[157]] = ae."Vault";
        ae.llIIlllIIl[ae.llIIlllIll[158]] = ae."Jumping gap 5";
        ae.llIIlllIIl[ae.llIIlllIll[159]] = ae."Jump";
        ae.llIIlllIIl[ae.llIIlllIll[160]] = ae."Jumping gap 6";
        ae.llIIlllIIl[ae.llIIlllIll[161]] = ae."Jump";
        ae.llIIlllIIl[ae.llIIlllIll[172]] = ae."Nav to canafis course";
        ae.llIIlllIIl[ae.llIIlllIll[173]] = ae."Nav to start";
        ae.llIIlllIIl[ae.llIIlllIll[174]] = ae."Starting course";
        ae.llIIlllIIl[ae.llIIlllIll[175]] = ae."Wall";
        ae.llIIlllIIl[ae.llIIlllIll[35]] = ae."Climb-up";
        ae.llIIlllIIl[ae.llIIlllIll[176]] = ae."Mark of grace";
        ae.llIIlllIIl[ae.llIIlllIll[177]] = ae."Taking mark";
        ae.llIIlllIIl[ae.llIIlllIll[178]] = ae."Found mark on ground";
        ae.llIIlllIIl[ae.llIIlllIll[179]] = ae."Take";
        ae.llIIlllIIl[ae.llIIlllIll[180]] = ae."Jumping gap 1";
        ae.llIIlllIIl[ae.llIIlllIll[79]] = ae."Jump";
        ae.llIIlllIIl[ae.llIIlllIll[181]] = ae."cross rope";
        ae.llIIlllIIl[ae.llIIlllIll[182]] = ae."Cross";
        ae.llIIlllIIl[ae.llIIlllIll[183]] = ae."Jumping gap 3";
        ae.llIIlllIIl[ae.llIIlllIll[184]] = ae."Jump";
        ae.llIIlllIIl[ae.llIIlllIll[185]] = ae."Jumping gap 4";
        ae.llIIlllIIl[ae.llIIlllIll[186]] = ae."Jump";
        ae.llIIlllIIl[ae.llIIlllIll[187]] = ae."Jumping Edge";
        ae.llIIlllIIl[ae.llIIlllIll[188]] = ae."Jump";
        ae.llIIlllIIl[ae.llIIlllIll[194]] = ae."Found mark on ground";
        ae.llIIlllIIl[ae.llIIlllIll[203]] = ae."Agility";
        ae.llIIlllIIl[ae.llIIlllIll[204]] = ae."passage";
        ae.llIIlllIIl[ae.llIIlllIll[205]] = ae."passage";
        ae.llIIlllIIl[ae.llIIlllIll[206]] = ae."passage";
        ae.llIIlllIIl[ae.llIIlllIll[207]] = ae."passage";
        ae.llIIlllIIl[ae.llIIlllIll[208]] = ae."Edge";
        ae.llIIlllIIl[ae.llIIlllIll[211]] = ae."Gap";
        ae.llIIlllIIl[ae.llIIlllIll[213]] = ae."Gap";
        ae.llIIlllIIl[ae.llIIlllIll[216]] = ae."Tightrope";
        ae.llIIlllIIl[ae.llIIlllIll[218]] = ae."Gap";
        ae.llIIlllIIl[ae.llIIlllIll[221]] = ae."Gap";
        ae.llIIlllIIl[ae.llIIlllIll[224]] = ae."Gap";
        ae.llIIlllIIl[ae.llIIlllIll[226]] = ae."Pole-vault";
        ae.llIIlllIIl[ae.llIIlllIll[227]] = ae."Gap";
        ae.llIIlllIIl[ae.llIIlllIll[230]] = ae."Gap";
        ae.llIIlllIIl[ae.llIIlllIll[232]] = ae."Gap";
        ae.llIIlllIIl[ae.llIIlllIll[233]] = ae."Gap";
    }

    private static String lIlIlllIIIllI(String llllllllllllllllllIIlIlllIIlllll, String llllllllllllllllllIIlIlllIIllllI) {
        try {
            SecretKeySpec llllllllllllllllllIIlIlllIlIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIlIlllIIllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllIIlIlllIlIIIIl = Cipher.getInstance("Blowfish");
            llllllllllllllllllIIlIlllIlIIIIl.init(llIIlllIll[3], llllllllllllllllllIIlIlllIlIIIlI);
            return new String(llllllllllllllllllIIlIlllIlIIIIl.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIlIlllIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllIIlIlllIlIIIII) {
            llllllllllllllllllIIlIlllIlIIIII.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    private static boolean eF() {
        WorldArea worldArea = new WorldArea(llIIlllIll[80], llIIlllIll[81], llIIlllIll[69], llIIlllIll[64], llIIlllIll[0]);
        WorldArea worldArea2 = new WorldArea(llIIlllIll[82], llIIlllIll[81], llIIlllIll[12], llIIlllIll[64], llIIlllIll[10]);
        WorldArea worldArea3 = new WorldArea(llIIlllIll[83], llIIlllIll[84], llIIlllIll[63], llIIlllIll[49], llIIlllIll[10]);
        WorldArea worldArea4 = new WorldArea(llIIlllIll[189], llIIlllIll[190], llIIlllIll[24], llIIlllIll[2], llIIlllIll[1]);
        WorldArea worldArea5 = new WorldArea(llIIlllIll[85], llIIlllIll[87], llIIlllIll[12], llIIlllIll[24], llIIlllIll[10]);
        WorldArea worldArea6 = new WorldArea(llIIlllIll[191], llIIlllIll[192], llIIlllIll[73], llIIlllIll[38], llIIlllIll[10]);
        WorldArea worldArea7 = new WorldArea(llIIlllIll[90], llIIlllIll[91], llIIlllIll[66], llIIlllIll[64], llIIlllIll[10]);
        WorldArea worldArea8 = new WorldArea(llIIlllIll[92], llIIlllIll[93], llIIlllIll[22], llIIlllIll[26], llIIlllIll[10]);
        WorldArea worldArea9 = new WorldArea(llIIlllIll[92], llIIlllIll[94], llIIlllIll[12], llIIlllIll[22], llIIlllIll[10]);
        WorldArea worldArea10 = new WorldArea(llIIlllIll[127], llIIlllIll[128], llIIlllIll[49], llIIlllIll[12], llIIlllIll[3]);
        WorldArea worldArea11 = new WorldArea(llIIlllIll[129], llIIlllIll[127], llIIlllIll[49], llIIlllIll[24], llIIlllIll[3]);
        WorldArea worldArea12 = new WorldArea(llIIlllIll[130], llIIlllIll[131], llIIlllIll[63], llIIlllIll[49], llIIlllIll[3]);
        WorldArea worldArea13 = new WorldArea(llIIlllIll[132], llIIlllIll[133], llIIlllIll[12], llIIlllIll[64], llIIlllIll[10]);
        WorldArea worldArea14 = new WorldArea(llIIlllIll[134], llIIlllIll[9], llIIlllIll[49], llIIlllIll[26], llIIlllIll[3]);
        WorldArea worldArea15 = new WorldArea(llIIlllIll[135], llIIlllIll[136], llIIlllIll[68], llIIlllIll[53], llIIlllIll[10]);
        WorldArea worldArea16 = new WorldArea(llIIlllIll[137], llIIlllIll[138], llIIlllIll[63], llIIlllIll[64], llIIlllIll[3]);
        WorldArea worldArea17 = new WorldArea(llIIlllIll[164], llIIlllIll[133], llIIlllIll[64], llIIlllIll[12], llIIlllIll[10]);
        WorldArea worldArea18 = new WorldArea(llIIlllIll[165], llIIlllIll[139], llIIlllIll[38], llIIlllIll[53], llIIlllIll[3]);
        WorldArea worldArea19 = new WorldArea(llIIlllIll[166], llIIlllIll[134], llIIlllIll[49], llIIlllIll[26], llIIlllIll[3]);
        WorldArea worldArea20 = new WorldArea(llIIlllIll[167], llIIlllIll[136], llIIlllIll[70], llIIlllIll[64], llIIlllIll[10]);
        WorldArea worldArea21 = new WorldArea(llIIlllIll[168], llIIlllIll[169], llIIlllIll[54], llIIlllIll[63], llIIlllIll[3]);
        WorldArea[] worldAreaArray = new WorldArea[llIIlllIll[68]];
        worldAreaArray[ae.llIIlllIll[0]] = worldArea;
        worldAreaArray[ae.llIIlllIll[1]] = worldArea2;
        worldAreaArray[ae.llIIlllIll[3]] = worldArea3;
        worldAreaArray[ae.llIIlllIll[10]] = worldArea4;
        worldAreaArray[ae.llIIlllIll[17]] = worldArea5;
        worldAreaArray[ae.llIIlllIll[2]] = worldArea6;
        worldAreaArray[ae.llIIlllIll[20]] = worldArea7;
        worldAreaArray[ae.llIIlllIll[22]] = worldArea8;
        worldAreaArray[ae.llIIlllIll[24]] = worldArea9;
        worldAreaArray[ae.llIIlllIll[26]] = worldArea10;
        worldAreaArray[ae.llIIlllIll[12]] = worldArea11;
        worldAreaArray[ae.llIIlllIll[49]] = worldArea12;
        worldAreaArray[ae.llIIlllIll[63]] = worldArea13;
        worldAreaArray[ae.llIIlllIll[64]] = worldArea14;
        worldAreaArray[ae.llIIlllIll[53]] = worldArea15;
        worldAreaArray[ae.llIIlllIll[38]] = worldArea16;
        worldAreaArray[ae.llIIlllIll[65]] = worldArea17;
        worldAreaArray[ae.llIIlllIll[66]] = worldArea18;
        worldAreaArray[ae.llIIlllIll[54]] = worldArea19;
        worldAreaArray[ae.llIIlllIll[67]] = worldArea20;
        worldAreaArray[ae.llIIlllIll[40]] = worldArea21;
        WorldArea[] worldAreaArray2 = worldAreaArray;
        int[] nArray = new int[llIIlllIll[1]];
        nArray[ae.llIIlllIll[0]] = llIIlllIll[193];
        if (ae.lIlIlllIIllIl(TileItems.getNearest((int[])nArray))) {
            void llllllllllllllllllIIllIIIIIIlIlI;
            System.out.println(llIIlllIIl[llIIlllIll[194]]);
            int llllllllllllllllllIIllIIIIIIlIIl = llIIlllIll[0];
            while (ae.lIlIlllIIlIll(llllllllllllllllllIIllIIIIIIlIIl, ((void)llllllllllllllllllIIllIIIIIIlIlI).length)) {
                int[] nArray2 = new int[llIIlllIll[1]];
                nArray2[ae.llIIlllIll[0]] = llIIlllIll[193];
                if (ae.lIlIlllIIlIlI(llllllllllllllllllIIllIIIIIIlIlI[llllllllllllllllllIIllIIIIIIlIIl].contains(TileItems.getNearest((int[])nArray2).getWorldLocation()) ? 1 : 0) && ae.lIlIlllIIlIlI(llllllllllllllllllIIllIIIIIIlIlI[llllllllllllllllllIIllIIIIIIlIIl].contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    return llIIlllIll[1];
                }
                ++llllllllllllllllllIIllIIIIIIlIIl;
                0;
                if (2 > 1) continue;
                return ((0x2B ^ 0x2E) & ~(0x17 ^ 0x12)) != 0;
            }
        }
        return llIIlllIll[0];
    }

    /*
     * WARNING - void declaration
     */
    private static void eE() {
        void llllllllllllllllllIIllIIIIlllIlI;
        void llllllllllllllllllIIllIIIlIIIIII;
        void llllllllllllllllllIIllIIIlIIIIIl;
        void llllllllllllllllllIIllIIIlIIIIlI;
        void llllllllllllllllllIIllIIIlIIIIll;
        WorldArea worldArea = new WorldArea(llIIlllIll[162], llIIlllIll[163], llIIlllIll[111], llIIlllIll[111], llIIlllIll[0]);
        WorldArea worldArea2 = new WorldArea(llIIlllIll[162], llIIlllIll[163], llIIlllIll[111], llIIlllIll[111], llIIlllIll[1]);
        WorldArea worldArea3 = new WorldArea(llIIlllIll[162], llIIlllIll[163], llIIlllIll[111], llIIlllIll[111], llIIlllIll[3]);
        WorldArea worldArea4 = new WorldArea(llIIlllIll[162], llIIlllIll[163], llIIlllIll[111], llIIlllIll[111], llIIlllIll[10]);
        WorldArea worldArea5 = new WorldArea(llIIlllIll[164], llIIlllIll[133], llIIlllIll[64], llIIlllIll[12], llIIlllIll[10]);
        WorldArea worldArea6 = new WorldArea(llIIlllIll[165], llIIlllIll[139], llIIlllIll[38], llIIlllIll[53], llIIlllIll[3]);
        WorldArea worldArea7 = new WorldArea(llIIlllIll[166], llIIlllIll[134], llIIlllIll[49], llIIlllIll[26], llIIlllIll[3]);
        WorldArea worldArea8 = new WorldArea(llIIlllIll[167], llIIlllIll[136], llIIlllIll[70], llIIlllIll[64], llIIlllIll[10]);
        WorldArea worldArea9 = new WorldArea(llIIlllIll[168], llIIlllIll[169], llIIlllIll[54], llIIlllIll[63], llIIlllIll[3]);
        WorldPoint worldPoint = new WorldPoint(llIIlllIll[170], llIIlllIll[171], llIIlllIll[0]);
        if (ae.lIlIlllIIlIlI(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (ae.lIlIlllIIllII(llllllllllllllllllIIllIIIlIIIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ae.lIlIlllIIllII(llllllllllllllllllIIllIIIlIIIIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ae.lIlIlllIIllII(llllllllllllllllllIIllIIIlIIIIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ae.lIlIlllIIllII(llllllllllllllllllIIllIIIlIIIIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIIlllIIl[llIIlllIll[172]];
            Movement.walkTo((WorldPoint)llllllllllllllllllIIllIIIIlllIlI);
            0;
            Time.sleepTicks((int)llIIlllIll[1]);
            0;
        }
        if (ae.lIlIlllIIlIlI(llllllllllllllllllIIllIIIlIIIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (ae.lIlIlllIIlllI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllllllllllllllllIIllIIIIlllIlI), llIIlllIll[20])) {
                AccBuilderSotf.c = llIIlllIIl[llIIlllIll[173]];
                Movement.walkTo((WorldPoint)llllllllllllllllllIIllIIIIlllIlI);
                0;
                Time.sleepTicks((int)llIIlllIll[1]);
                0;
            }
            if (ae.lIlIlllIlIIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllllllllllllllllIIllIIIIlllIlI), llIIlllIll[20])) {
                AccBuilderSotf.c = llIIlllIIl[llIIlllIll[174]];
                int llllllllllllllllllIIllIIIIlllIIl = Skills.getExperience((Skill)Skill.AGILITY);
                String[] stringArray = new String[llIIlllIll[1]];
                stringArray[ae.llIIlllIll[0]] = llIIlllIIl[llIIlllIll[175]];
                TileObjects.getNearest((String[])stringArray).interact(llIIlllIIl[llIIlllIll[35]]);
                Time.sleepTicks((int)e.c(llIIlllIll[1], llIIlllIll[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (ae.lIlIlllIIlllI(Skills.getExperience((Skill)Skill.AGILITY), llllllllllllllllllIIllIIIIlllIIl)) {
                        bl = llIIlllIll[1];
                        0;
                        if (((0xB2 ^ 0x86 ^ (0x37 ^ 0xF)) & (0x2F ^ 0x53 ^ (0xF4 ^ 0x84) ^ -1)) != 0) {
                            return ((0x37 ^ 0x55 ^ (0x22 ^ 0x72)) & (0x7F ^ 4 ^ (0x51 ^ 0x18) ^ -1)) != 0;
                        }
                    } else {
                        bl = llIIlllIll[0];
                    }
                    return bl;
                }, (int)llIIlllIll[104]);
                0;
                Time.sleepTicks((int)llIIlllIll[1]);
                0;
            }
        }
        String[] stringArray = new String[llIIlllIll[1]];
        stringArray[ae.llIIlllIll[0]] = llIIlllIIl[llIIlllIll[176]];
        TileItem llllllllllllllllllIIllIIIIlllIIl = TileItems.getNearest((String[])stringArray);
        if (ae.lIlIlllIIllIl(llllllllllllllllllIIllIIIIlllIIl) && ae.lIlIlllIIlIlI(ae.eF() ? 1 : 0)) {
            AccBuilderSotf.c = llIIlllIIl[llIIlllIll[177]];
            System.out.println(llIIlllIIl[llIIlllIll[178]]);
            llllllllllllllllllIIllIIIIlllIIl.interact(llIIlllIIl[llIIlllIll[179]]);
            Time.sleepTicks((int)llIIlllIll[10]);
            0;
        }
        if (ae.lIlIlllIIllII(ae.eF() ? 1 : 0)) {
            void llllllllllllllllllIIllIIIIlllIll;
            void llllllllllllllllllIIllIIIIllllII;
            void llllllllllllllllllIIllIIIIllllIl;
            void llllllllllllllllllIIllIIIIlllllI;
            int llllllllllllllllllIIllIIIIllIlll;
            TileObject llllllllllllllllllIIllIIIIlllIII;
            void llllllllllllllllllIIllIIIIllllll;
            if (ae.lIlIlllIIlIlI(llllllllllllllllllIIllIIIIllllll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ae.lIlIlllIIllIl(llllllllllllllllllIIllIIIIlllIII = TileObjects.getNearest(tileObject -> {
                int n2;
                if (ae.lIlIlllIIlIlI(tileObject.getName().contains(llIIlllIIl[llIIlllIll[218]]) ? 1 : 0) && ae.lIlIlllIlIIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIIlllIll[219], llIIlllIll[220], llIIlllIll[10])), llIIlllIll[3])) {
                    n2 = llIIlllIll[1];
                    0;
                    if (((0x62 ^ 0x42) & ~(0xBF ^ 0x9F)) > (0x41 ^ 0x45)) {
                        return ((0x4F ^ 0) & ~(0x46 ^ 9)) != 0;
                    }
                } else {
                    n2 = llIIlllIll[0];
                }
                return n2 != 0;
            }))) {
                llllllllllllllllllIIllIIIIllIlll = Skills.getExperience((Skill)Skill.AGILITY);
                AccBuilderSotf.c = llIIlllIIl[llIIlllIll[180]];
                llllllllllllllllllIIllIIIIlllIII.interact(llIIlllIIl[llIIlllIll[79]]);
                Time.sleepTicks((int)e.c(llIIlllIll[1], llIIlllIll[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (ae.lIlIlllIIlllI(Skills.getExperience((Skill)Skill.AGILITY), llllllllllllllllllIIllIIIIllIlll)) {
                        bl = llIIlllIll[1];
                        0;
                        if (null != null) {
                            return ((0xF4 ^ 0xA0) & ~(0x62 ^ 0x36)) != 0;
                        }
                    } else {
                        bl = llIIlllIll[0];
                    }
                    return bl;
                }, (int)llIIlllIll[104]);
                0;
                Time.sleepTicks((int)llIIlllIll[1]);
                0;
            }
            if (ae.lIlIlllIIlIlI(ae.eF() ? 1 : 0)) {
                return;
            }
            if (ae.lIlIlllIIlIlI(llllllllllllllllllIIllIIIIlllllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ae.lIlIlllIIllIl(llllllllllllllllllIIllIIIIlllIII = TileObjects.getNearest(tileObject -> {
                int n2;
                if (ae.lIlIlllIIlIlI(tileObject.getName().contains(llIIlllIIl[llIIlllIll[216]]) ? 1 : 0) && ae.lIlIlllIlIIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIIlllIll[217], llIIlllIll[128], llIIlllIll[3])), llIIlllIll[3])) {
                    n2 = llIIlllIll[1];
                    0;
                    if (((0xA9 ^ 0x94 ^ 111 + 30 - 48 + 34) & (0x14 ^ 1 ^ (0x1E ^ 0x49) ^ -1)) != 0) {
                        return ((0x88 ^ 0x85 ^ (0x99 ^ 0x8A)) & (0xA3 ^ 0x85 ^ (0xA1 ^ 0x99) ^ -1)) != 0;
                    }
                } else {
                    n2 = llIIlllIll[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderSotf.c = llIIlllIIl[llIIlllIll[181]];
                llllllllllllllllllIIllIIIIllIlll = Skills.getExperience((Skill)Skill.AGILITY);
                llllllllllllllllllIIllIIIIlllIII.interact(llIIlllIIl[llIIlllIll[182]]);
                Time.sleepTicks((int)e.c(llIIlllIll[1], llIIlllIll[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (ae.lIlIlllIIlllI(Skills.getExperience((Skill)Skill.AGILITY), llllllllllllllllllIIllIIIIllIlll)) {
                        bl = llIIlllIll[1];
                        0;
                        if (2 < ((0x72 ^ 0x30) & ~(0x13 ^ 0x51))) {
                            return ((0xB ^ 0x49) & ~(0x15 ^ 0x57)) != 0;
                        }
                    } else {
                        bl = llIIlllIll[0];
                    }
                    return bl;
                }, (int)llIIlllIll[104]);
                0;
                Time.sleepTicks((int)llIIlllIll[1]);
                0;
            }
            if (ae.lIlIlllIIlIlI(ae.eF() ? 1 : 0)) {
                return;
            }
            if (ae.lIlIlllIIlIlI(llllllllllllllllllIIllIIIIllllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ae.lIlIlllIIllIl(llllllllllllllllllIIllIIIIlllIII = TileObjects.getNearest(tileObject -> {
                int n2;
                if (ae.lIlIlllIIlIlI(tileObject.getName().contains(llIIlllIIl[llIIlllIll[213]]) ? 1 : 0) && ae.lIlIlllIlIIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIIlllIll[214], llIIlllIll[215], llIIlllIll[3])), llIIlllIll[3])) {
                    n2 = llIIlllIll[1];
                    0;
                    if (-(0x48 ^ 0x4C) >= 0) {
                        return ((0xF6 ^ 0xA7) & ~(0x1A ^ 0x4B)) != 0;
                    }
                } else {
                    n2 = llIIlllIll[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderSotf.c = llIIlllIIl[llIIlllIll[183]];
                llllllllllllllllllIIllIIIIllIlll = Skills.getExperience((Skill)Skill.AGILITY);
                llllllllllllllllllIIllIIIIlllIII.interact(llIIlllIIl[llIIlllIll[184]]);
                Time.sleepTicks((int)e.c(llIIlllIll[1], llIIlllIll[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (ae.lIlIlllIIlllI(Skills.getExperience((Skill)Skill.AGILITY), llllllllllllllllllIIllIIIIllIlll)) {
                        bl = llIIlllIll[1];
                        0;
                        if (null != null) {
                            return ((0x8C ^ 0x97) & ~(0xD ^ 0x16)) != 0;
                        }
                    } else {
                        bl = llIIlllIll[0];
                    }
                    return bl;
                }, (int)llIIlllIll[104]);
                0;
                Time.sleepTicks((int)llIIlllIll[1]);
                0;
            }
            if (ae.lIlIlllIIlIlI(ae.eF() ? 1 : 0)) {
                return;
            }
            if (ae.lIlIlllIIlIlI(llllllllllllllllllIIllIIIIllllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ae.lIlIlllIIllIl(llllllllllllllllllIIllIIIIlllIII = TileObjects.getNearest(tileObject -> {
                int n2;
                if (ae.lIlIlllIIlIlI(tileObject.getName().contains(llIIlllIIl[llIIlllIll[211]]) ? 1 : 0) && ae.lIlIlllIlIIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIIlllIll[209], llIIlllIll[212], llIIlllIll[10])), llIIlllIll[3])) {
                    n2 = llIIlllIll[1];
                    0;
                    if (((0xA5 ^ 0x80) & ~(0x74 ^ 0x51)) > 0) {
                        return ((0x22 ^ 0x16) & ~(0x85 ^ 0xB1)) != 0;
                    }
                } else {
                    n2 = llIIlllIll[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderSotf.c = llIIlllIIl[llIIlllIll[185]];
                llllllllllllllllllIIllIIIIllIlll = Skills.getExperience((Skill)Skill.AGILITY);
                llllllllllllllllllIIllIIIIlllIII.interact(llIIlllIIl[llIIlllIll[186]]);
                Time.sleepTicks((int)e.c(llIIlllIll[1], llIIlllIll[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (ae.lIlIlllIIlllI(Skills.getExperience((Skill)Skill.AGILITY), llllllllllllllllllIIllIIIIllIlll)) {
                        bl = llIIlllIll[1];
                        0;
                        if (3 <= 2) {
                            return ((0x36 ^ 0x60) & ~(2 ^ 0x54)) != 0;
                        }
                    } else {
                        bl = llIIlllIll[0];
                    }
                    return bl;
                }, (int)llIIlllIll[104]);
                0;
                Time.sleepTicks((int)llIIlllIll[1]);
                0;
            }
            if (ae.lIlIlllIIlIlI(ae.eF() ? 1 : 0)) {
                return;
            }
            if (ae.lIlIlllIIlIlI(llllllllllllllllllIIllIIIIlllIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ae.lIlIlllIIllIl(llllllllllllllllllIIllIIIIlllIII = TileObjects.getNearest(tileObject -> {
                int n2;
                if (ae.lIlIlllIIlIlI(tileObject.getName().contains(llIIlllIIl[llIIlllIll[208]]) ? 1 : 0) && ae.lIlIlllIlIIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIIlllIll[209], llIIlllIll[210], llIIlllIll[3])), llIIlllIll[3])) {
                    n2 = llIIlllIll[1];
                    0;
                    if ((0xEE ^ 0x97 ^ (3 ^ 0x7E)) <= 0) {
                        return ((70 + 99 - 93 + 51 ^ (0xA9 ^ 0xB7)) & (0x97 ^ 0x81 ^ (0xDC ^ 0xAB) ^ -1)) != 0;
                    }
                } else {
                    n2 = llIIlllIll[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderSotf.c = llIIlllIIl[llIIlllIll[187]];
                llllllllllllllllllIIllIIIIllIlll = Skills.getExperience((Skill)Skill.AGILITY);
                llllllllllllllllllIIllIIIIlllIII.interact(llIIlllIIl[llIIlllIll[188]]);
                Time.sleepTicks((int)e.c(llIIlllIll[1], llIIlllIll[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (ae.lIlIlllIIlllI(Skills.getExperience((Skill)Skill.AGILITY), llllllllllllllllllIIllIIIIllIlll)) {
                        bl = llIIlllIll[1];
                        0;
                        if (null != null) {
                            return ((0x15 ^ 0x25) & ~(0x76 ^ 0x46)) != 0;
                        }
                    } else {
                        bl = llIIlllIll[0];
                    }
                    return bl;
                }, (int)llIIlllIll[104]);
                0;
                Time.sleepTicks((int)llIIlllIll[1]);
                0;
            }
        }
    }

    @Override
    public String ag() {
        return llIIlllIIl[llIIlllIll[203]];
    }

    private static boolean lIlIlllIIllII(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIlllIIllIl(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    private static void eB() {
        WorldArea worldArea = new WorldArea(llIIlllIll[46], llIIlllIll[47], llIIlllIll[12], llIIlllIll[20], llIIlllIll[0]);
        WorldArea worldArea2 = new WorldArea(llIIlllIll[46], llIIlllIll[48], llIIlllIll[49], llIIlllIll[24], llIIlllIll[0]);
        WorldArea worldArea3 = new WorldArea(llIIlllIll[46], llIIlllIll[50], llIIlllIll[49], llIIlllIll[24], llIIlllIll[1]);
        WorldArea worldArea4 = new WorldArea(llIIlllIll[51], llIIlllIll[52], llIIlllIll[53], llIIlllIll[54], llIIlllIll[3]);
        WorldArea worldArea5 = new WorldArea(llIIlllIll[55], llIIlllIll[56], llIIlllIll[24], llIIlllIll[12], llIIlllIll[3]);
        WorldArea worldArea6 = new WorldArea(llIIlllIll[57], llIIlllIll[58], llIIlllIll[49], llIIlllIll[12], llIIlllIll[0]);
        WorldArea worldArea7 = new WorldArea(llIIlllIll[59], llIIlllIll[60], llIIlllIll[12], llIIlllIll[20], llIIlllIll[0]);
        WorldArea worldArea8 = new WorldArea(llIIlllIll[46], llIIlllIll[47], llIIlllIll[61], llIIlllIll[20], llIIlllIll[0]);
        if (ae.lIlIlllIIllII(mW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ae.lIlIlllIIllII(mX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ae.lIlIlllIIllII(mY.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIIlllIIl[llIIlllIll[12]];
            e.b(mZ);
            Time.sleepTicks((int)llIIlllIll[1]);
            0;
        }
        if ((!ae.lIlIlllIIllII(mW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !ae.lIlIlllIIllII(mX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || ae.lIlIlllIIlIlI(mY.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && ae.lIlIlllIlIIIl(Players.getLocal().getAnimation(), llIIlllIll[62]) && ae.lIlIlllIIllII(Players.getLocal().isMoving() ? 1 : 0)) {
            void llllllllllllllllllIIllIIlIIIllII;
            void llllllllllllllllllIIllIIlIIIllIl;
            void llllllllllllllllllIIllIIlIIIlllI;
            void llllllllllllllllllIIllIIlIIIllll;
            void llllllllllllllllllIIllIIlIIlIIII;
            void llllllllllllllllllIIllIIlIIlIIIl;
            void llllllllllllllllllIIllIIlIIIlIll;
            if (ae.lIlIlllIIlIlI(llllllllllllllllllIIllIIlIIIlIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = llIIlllIIl[llIIlllIll[49]];
                String[] stringArray = new String[llIIlllIll[1]];
                stringArray[ae.llIIlllIll[0]] = llIIlllIIl[llIIlllIll[63]];
                TileObjects.getNearest((String[])stringArray).interact(llIIlllIIl[llIIlllIll[64]]);
                Time.sleepTicks((int)llIIlllIll[3]);
                0;
            }
            if (ae.lIlIlllIIlIlI(llllllllllllllllllIIllIIlIIlIIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = llIIlllIIl[llIIlllIll[53]];
                String[] stringArray = new String[llIIlllIll[1]];
                stringArray[ae.llIIlllIll[0]] = llIIlllIIl[llIIlllIll[38]];
                TileObjects.getNearest((String[])stringArray).interact(llIIlllIIl[llIIlllIll[65]]);
                Time.sleepTicks((int)llIIlllIll[3]);
                0;
            }
            if (ae.lIlIlllIIlIlI(llllllllllllllllllIIllIIlIIlIIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = llIIlllIIl[llIIlllIll[66]];
                String[] stringArray = new String[llIIlllIll[1]];
                stringArray[ae.llIIlllIll[0]] = llIIlllIIl[llIIlllIll[54]];
                TileObjects.getNearest((String[])stringArray).interact(llIIlllIIl[llIIlllIll[67]]);
                Time.sleepTicks((int)llIIlllIll[3]);
                0;
            }
            if (ae.lIlIlllIIlIlI(llllllllllllllllllIIllIIlIIIllll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = llIIlllIIl[llIIlllIll[40]];
                String[] stringArray = new String[llIIlllIll[1]];
                stringArray[ae.llIIlllIll[0]] = llIIlllIIl[llIIlllIll[68]];
                TileObjects.getNearest((String[])stringArray).interact(llIIlllIIl[llIIlllIll[61]]);
                Time.sleepTicks((int)llIIlllIll[2]);
                0;
            }
            if (ae.lIlIlllIIlIlI(llllllllllllllllllIIllIIlIIIlllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = llIIlllIIl[llIIlllIll[69]];
                String[] stringArray = new String[llIIlllIll[1]];
                stringArray[ae.llIIlllIll[0]] = llIIlllIIl[llIIlllIll[70]];
                TileObjects.getNearest((String[])stringArray).interact(llIIlllIIl[llIIlllIll[41]]);
                Time.sleepTicks((int)llIIlllIll[17]);
                0;
            }
            if (ae.lIlIlllIIlIlI(llllllllllllllllllIIllIIlIIIllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = llIIlllIIl[llIIlllIll[71]];
                String[] stringArray = new String[llIIlllIll[1]];
                stringArray[ae.llIIlllIll[0]] = llIIlllIIl[llIIlllIll[72]];
                TileObjects.getNearest((String[])stringArray).interact(llIIlllIIl[llIIlllIll[73]]);
                Time.sleepTicks((int)llIIlllIll[10]);
                0;
            }
            if (ae.lIlIlllIIlIlI(llllllllllllllllllIIllIIlIIIllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = llIIlllIIl[llIIlllIll[74]];
                String[] stringArray = new String[llIIlllIll[1]];
                stringArray[ae.llIIlllIll[0]] = llIIlllIIl[llIIlllIll[42]];
                TileObjects.getNearest((String[])stringArray).interact(llIIlllIIl[llIIlllIll[75]]);
                Time.sleepTicks((int)llIIlllIll[17]);
                0;
            }
        }
    }

    private static boolean lIlIlllIIlllI(int n2, int n3) {
        return n2 > n3;
    }

    public static void eA() {
        if (ae.lIlIlllIIlIlI(bt ? 1 : 0)) {
            AccBuilderSotf.c = llIIlllIIl[llIIlllIll[0]];
            b.a(bv);
            if (ae.lIlIlllIIlIll(bv.size(), llIIlllIll[1])) {
                System.out.println(llIIlllIIl[llIIlllIll[1]]);
                bt = llIIlllIll[0];
            }
        }
        if (ae.lIlIlllIIllII(bt ? 1 : 0) && ae.lIlIlllIIlIll(Skills.getLevel((Skill)Skill.AGILITY), llIIlllIll[2])) {
            if (ae.lIlIlllIIllII(ae.an() ? 1 : 0)) {
                BankLocation llllllllllllllllllIIllIIlIIlllIl = BankLocation.getNearest();
                if (ae.lIlIlllIIllIl(llllllllllllllllllIIllIIlIIlllIl) && ae.lIlIlllIIllII(llllllllllllllllllIIllIIlIIlllIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIIlllIIl[llIIlllIll[3]];
                    WorldArea llllllllllllllllllIIllIIlIIlllII = new WorldArea(llIIlllIll[4], llIIlllIll[5], llIIlllIll[6], llIIlllIll[7], llIIlllIll[0]);
                    if (ae.lIlIlllIIlIlI(llllllllllllllllllIIllIIlIIlllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldPoint llllllllllllllllllIIllIIlIIllIll = new WorldPoint(llIIlllIll[8], llIIlllIll[9], llIIlllIll[0]);
                        if (ae.lIlIlllIIlllI(Players.getLocal().getWorldLocation().distanceTo(llllllllllllllllllIIllIIlIIllIll), llIIlllIll[10])) {
                            Movement.walkTo((WorldPoint)llllllllllllllllllIIllIIlIIllIll);
                            0;
                            Time.sleepTicks((int)llIIlllIll[1]);
                            0;
                        }
                    }
                    a.a(llllllllllllllllllIIllIIlIIlllIl);
                }
                if (ae.lIlIlllIIllIl(llllllllllllllllllIIllIIlIIlllIl) && ae.lIlIlllIIlIlI(llllllllllllllllllIIllIIlIIlllIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIIlllIIl[llIIlllIll[10]];
                    if (ae.lIlIlllIIllII(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)llIIlllIll[11]);
                        0;
                    }
                    if (ae.lIlIlllIIlIlI(Bank.isOpen() ? 1 : 0)) {
                        if (ae.lIlIlllIIllll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)llIIlllIll[1]);
                            0;
                        }
                        if (ae.lIlIlllIIllll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)llIIlllIll[3]);
                            0;
                        }
                    }
                    int[] nArray = new int[llIIlllIll[12]];
                    nArray[ae.llIIlllIll[0]] = llIIlllIll[13];
                    nArray[ae.llIIlllIll[1]] = llIIlllIll[14];
                    nArray[ae.llIIlllIll[3]] = llIIlllIll[15];
                    nArray[ae.llIIlllIll[10]] = llIIlllIll[16];
                    nArray[ae.llIIlllIll[17]] = llIIlllIll[18];
                    nArray[ae.llIIlllIll[2]] = llIIlllIll[19];
                    nArray[ae.llIIlllIll[20]] = llIIlllIll[21];
                    nArray[ae.llIIlllIll[22]] = llIIlllIll[23];
                    nArray[ae.llIIlllIll[24]] = llIIlllIll[25];
                    nArray[ae.llIIlllIll[26]] = llIIlllIll[27];
                    if (ae.lIlIlllIIllII(e.c(nArray) ? 1 : 0)) {
                        ae.Q();
                        System.out.println(llIIlllIIl[llIIlllIll[17]]);
                        bt = llIIlllIll[1];
                        return;
                    }
                    int[] nArray2 = new int[llIIlllIll[12]];
                    nArray2[ae.llIIlllIll[0]] = llIIlllIll[13];
                    nArray2[ae.llIIlllIll[1]] = llIIlllIll[14];
                    nArray2[ae.llIIlllIll[3]] = llIIlllIll[15];
                    nArray2[ae.llIIlllIll[10]] = llIIlllIll[16];
                    nArray2[ae.llIIlllIll[17]] = llIIlllIll[18];
                    nArray2[ae.llIIlllIll[2]] = llIIlllIll[19];
                    nArray2[ae.llIIlllIll[20]] = llIIlllIll[21];
                    nArray2[ae.llIIlllIll[22]] = llIIlllIll[23];
                    nArray2[ae.llIIlllIll[24]] = llIIlllIll[25];
                    nArray2[ae.llIIlllIll[26]] = llIIlllIll[27];
                    if (ae.lIlIlllIIlIlI(e.c(nArray2) ? 1 : 0)) {
                        a.a(llIIlllIll[28], llIIlllIll[1]);
                        a.a(llIIlllIll[29], llIIlllIll[1]);
                        a.a(llIIlllIll[30], llIIlllIll[1]);
                        a.a(llIIlllIll[31], llIIlllIll[1]);
                        a.a(llIIlllIll[32], llIIlllIll[1]);
                        a.a(llIIlllIll[33], llIIlllIll[1]);
                        a.a(llIIlllIll[34], llIIlllIll[1]);
                        int[] nArray3 = new int[llIIlllIll[1]];
                        nArray3[ae.llIIlllIll[0]] = llIIlllIll[28];
                        if (ae.lIlIlllIIllII(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                            int[] nArray4 = new int[llIIlllIll[1]];
                            nArray4[ae.llIIlllIll[0]] = llIIlllIll[28];
                            if (ae.lIlIlllIIllII(Equipment.contains((int[])nArray4) ? 1 : 0)) {
                                int[] nArray5 = new int[llIIlllIll[1]];
                                nArray5[ae.llIIlllIll[0]] = llIIlllIll[28];
                                if (ae.lIlIlllIIllII(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                    a.a(llIIlllIll[35], llIIlllIll[1]);
                                }
                            }
                        }
                        a.a(llIIlllIll[18], llIIlllIll[1]);
                        e.l(llIIlllIll[28]);
                        e.l(llIIlllIll[29]);
                        e.l(llIIlllIll[30]);
                        e.l(llIIlllIll[31]);
                        e.l(llIIlllIll[32]);
                        Time.sleepTicks((int)llIIlllIll[1]);
                        0;
                        e.l(llIIlllIll[34]);
                        e.l(llIIlllIll[36]);
                        e.l(llIIlllIll[33]);
                        e.l(llIIlllIll[35]);
                        e.l(llIIlllIll[18]);
                        Time.sleepTicks((int)llIIlllIll[10]);
                        0;
                        if (ae.lIlIlllIIllII(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepTicks((int)llIIlllIll[20]);
                            0;
                        }
                        if (ae.lIlIlllIIlIlI(Bank.isOpen() ? 1 : 0)) {
                            if (ae.lIlIlllIIlIll(Skills.getLevel((Skill)Skill.AGILITY), llIIlllIll[37])) {
                                a.a(llIIlllIll[13], llIIlllIll[12]);
                                a.a(llIIlllIll[14], llIIlllIll[12]);
                                a.a(llIIlllIll[21], llIIlllIll[12]);
                                a.a(llIIlllIll[15], llIIlllIll[12]);
                                a.b(f.bk, llIIlllIll[1]);
                                a.a(llIIlllIll[27], llIIlllIll[1]);
                                a.a(llIIlllIll[19], llIIlllIll[2]);
                                a.a(llIIlllIll[23], llIIlllIll[38]);
                            }
                            if (ae.lIlIlllIlIIII(Skills.getLevel((Skill)Skill.AGILITY), llIIlllIll[37])) {
                                a.a(llIIlllIll[13], llIIlllIll[12]);
                                a.a(llIIlllIll[21], llIIlllIll[12]);
                                a.a(llIIlllIll[25], llIIlllIll[12]);
                                a.b(f.bk, llIIlllIll[1]);
                                a.a(llIIlllIll[27], llIIlllIll[1]);
                                a.a(llIIlllIll[19], llIIlllIll[24]);
                                a.a(llIIlllIll[23], llIIlllIll[12]);
                            }
                        }
                    }
                }
            }
            if (ae.lIlIlllIIlIlI(ae.an() ? 1 : 0)) {
                String[] stringArray = new String[llIIlllIll[1]];
                stringArray[ae.llIIlllIll[0]] = llIIlllIIl[llIIlllIll[2]];
                if (ae.lIlIlllIIlIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray2 = new String[llIIlllIll[1]];
                    stringArray2[ae.llIIlllIll[0]] = llIIlllIIl[llIIlllIll[20]];
                    Inventory.getFirst((String[])stringArray2).interact(llIIlllIIl[llIIlllIll[22]]);
                }
                if (ae.lIlIlllIIlIlI(Inventory.contains((int[])f.ba) ? 1 : 0) && ae.lIlIlllIIlIll(Movement.getRunEnergy(), llIIlllIll[39])) {
                    Inventory.getFirst((int[])f.ba).interact(llIIlllIIl[llIIlllIll[24]]);
                    Time.sleepTicks((int)llIIlllIll[1]);
                    0;
                }
                if (ae.lIlIlllIIlllI(Combat.getMissingHealth(), llIIlllIll[40])) {
                    int[] nArray = new int[llIIlllIll[1]];
                    nArray[ae.llIIlllIll[0]] = llIIlllIll[23];
                    if (ae.lIlIlllIIlIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray6 = new int[llIIlllIll[1]];
                        nArray6[ae.llIIlllIll[0]] = llIIlllIll[23];
                        Inventory.getFirst((int[])nArray6).interact(llIIlllIIl[llIIlllIll[26]]);
                        Time.sleepTicks((int)llIIlllIll[3]);
                        0;
                    }
                }
                if (ae.lIlIlllIIlllI(Movement.getRunEnergy(), llIIlllIll[41]) && ae.lIlIlllIIllII(Movement.isRunEnabled() ? 1 : 0)) {
                    Movement.toggleRun();
                }
                if (ae.lIlIlllIIlIll(Skills.getLevel((Skill)Skill.AGILITY), llIIlllIll[42])) {
                    ae.eB();
                }
                if ((!ae.lIlIlllIlIIII(e.j(llIIlllIll[43]), llIIlllIll[44]) || ae.lIlIlllIIlIll(e.j(llIIlllIll[45]), llIIlllIll[2])) && ae.lIlIlllIlIIII(Skills.getLevel((Skill)Skill.AGILITY), llIIlllIll[42]) && ae.lIlIlllIIlIll(Skills.getLevel((Skill)Skill.AGILITY), llIIlllIll[44])) {
                    ae.eC();
                }
                if (ae.lIlIlllIlIIII(e.j(llIIlllIll[43]), llIIlllIll[44]) && ae.lIlIlllIlIIII(e.j(llIIlllIll[45]), llIIlllIll[2])) {
                    if (ae.lIlIlllIlIIII(Skills.getLevel((Skill)Skill.AGILITY), llIIlllIll[42]) && ae.lIlIlllIIlIll(Skills.getLevel((Skill)Skill.AGILITY), llIIlllIll[37])) {
                        ae.eC();
                    }
                    if (ae.lIlIlllIlIIII(Skills.getLevel((Skill)Skill.AGILITY), llIIlllIll[37]) && ae.lIlIlllIIlIll(Skills.getLevel((Skill)Skill.AGILITY), llIIlllIll[44])) {
                        ae.eD();
                    }
                }
                if (ae.lIlIlllIlIIII(Skills.getLevel((Skill)Skill.AGILITY), llIIlllIll[44])) {
                    ae.eE();
                }
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private static void eD() {
        void llllllllllllllllllIIllIIIlIlIlII;
        void llllllllllllllllllIIllIIIlIlllII;
        void llllllllllllllllllIIllIIIlIlllIl;
        void llllllllllllllllllIIllIIIlIllllI;
        void llllllllllllllllllIIllIIIlIlllll;
        WorldArea worldArea = new WorldArea(llIIlllIll[125], llIIlllIll[126], llIIlllIll[112], llIIlllIll[107], llIIlllIll[0]);
        WorldArea worldArea2 = new WorldArea(llIIlllIll[125], llIIlllIll[126], llIIlllIll[112], llIIlllIll[107], llIIlllIll[1]);
        WorldArea worldArea3 = new WorldArea(llIIlllIll[125], llIIlllIll[126], llIIlllIll[112], llIIlllIll[107], llIIlllIll[3]);
        WorldArea worldArea4 = new WorldArea(llIIlllIll[125], llIIlllIll[126], llIIlllIll[112], llIIlllIll[107], llIIlllIll[10]);
        WorldArea worldArea5 = new WorldArea(llIIlllIll[127], llIIlllIll[128], llIIlllIll[49], llIIlllIll[12], llIIlllIll[3]);
        WorldArea worldArea6 = new WorldArea(llIIlllIll[129], llIIlllIll[127], llIIlllIll[49], llIIlllIll[24], llIIlllIll[3]);
        WorldArea worldArea7 = new WorldArea(llIIlllIll[130], llIIlllIll[131], llIIlllIll[63], llIIlllIll[49], llIIlllIll[3]);
        WorldArea worldArea8 = new WorldArea(llIIlllIll[132], llIIlllIll[133], llIIlllIll[12], llIIlllIll[64], llIIlllIll[10]);
        WorldArea worldArea9 = new WorldArea(llIIlllIll[134], llIIlllIll[9], llIIlllIll[49], llIIlllIll[26], llIIlllIll[3]);
        WorldArea worldArea10 = new WorldArea(llIIlllIll[135], llIIlllIll[136], llIIlllIll[68], llIIlllIll[53], llIIlllIll[10]);
        WorldArea worldArea11 = new WorldArea(llIIlllIll[137], llIIlllIll[138], llIIlllIll[63], llIIlllIll[64], llIIlllIll[3]);
        WorldPoint worldPoint = new WorldPoint(llIIlllIll[137], llIIlllIll[139], llIIlllIll[0]);
        if (ae.lIlIlllIIlIlI(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (ae.lIlIlllIIllII(llllllllllllllllllIIllIIIlIlllll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ae.lIlIlllIIllII(llllllllllllllllllIIllIIIlIllllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ae.lIlIlllIIllII(llllllllllllllllllIIllIIIlIlllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ae.lIlIlllIIllII(llllllllllllllllllIIllIIIlIlllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIIlllIIl[llIIlllIll[140]];
            Movement.walkTo((WorldPoint)llllllllllllllllllIIllIIIlIlIlII);
            0;
            Time.sleepTicks((int)llIIlllIll[1]);
            0;
        }
        if (ae.lIlIlllIIlIlI(llllllllllllllllllIIllIIIlIlllll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (ae.lIlIlllIIlllI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllllllllllllllllIIllIIIlIlIlII), llIIlllIll[20])) {
                AccBuilderSotf.c = llIIlllIIl[llIIlllIll[6]];
                Movement.walkTo((WorldPoint)llllllllllllllllllIIllIIIlIlIlII);
                0;
                Time.sleepTicks((int)llIIlllIll[1]);
                0;
            }
            if (ae.lIlIlllIlIIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllllllllllllllllIIllIIIlIlIlII), llIIlllIll[20])) {
                AccBuilderSotf.c = llIIlllIIl[llIIlllIll[141]];
                int llllllllllllllllllIIllIIIlIlIIll = Skills.getExperience((Skill)Skill.AGILITY);
                String[] stringArray = new String[llIIlllIll[1]];
                stringArray[ae.llIIlllIll[0]] = llIIlllIIl[llIIlllIll[142]];
                TileObjects.getNearest((String[])stringArray).interact(llIIlllIIl[llIIlllIll[143]]);
                Time.sleepTicks((int)e.c(llIIlllIll[1], llIIlllIll[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (ae.lIlIlllIIlllI(Skills.getExperience((Skill)Skill.AGILITY), llllllllllllllllllIIllIIIlIlIIll)) {
                        bl = llIIlllIll[1];
                        0;
                        if (-3 > 0) {
                            return ((0xB2 ^ 0xA3) & ~(0x35 ^ 0x24)) != 0;
                        }
                    } else {
                        bl = llIIlllIll[0];
                    }
                    return bl;
                }, (int)llIIlllIll[104]);
                0;
                Time.sleepTicks((int)llIIlllIll[1]);
                0;
            }
        }
        String[] stringArray = new String[llIIlllIll[1]];
        stringArray[ae.llIIlllIll[0]] = llIIlllIIl[llIIlllIll[144]];
        TileItem llllllllllllllllllIIllIIIlIlIIll = TileItems.getNearest((String[])stringArray);
        if (ae.lIlIlllIIllIl(llllllllllllllllllIIllIIIlIlIIll) && ae.lIlIlllIIlIlI(ae.eF() ? 1 : 0)) {
            AccBuilderSotf.c = llIIlllIIl[llIIlllIll[145]];
            System.out.println(llIIlllIIl[llIIlllIll[146]]);
            llllllllllllllllllIIllIIIlIlIIll.interact(llIIlllIIl[llIIlllIll[147]]);
            Time.sleepTicks((int)llIIlllIll[10]);
            0;
        }
        if (ae.lIlIlllIIllII(ae.eF() ? 1 : 0)) {
            void llllllllllllllllllIIllIIIlIlIlIl;
            void llllllllllllllllllIIllIIIlIlIllI;
            void llllllllllllllllllIIllIIIlIlIlll;
            void llllllllllllllllllIIllIIIlIllIII;
            void llllllllllllllllllIIllIIIlIllIIl;
            void llllllllllllllllllIIllIIIlIllIlI;
            int llllllllllllllllllIIllIIIlIlIIIl;
            TileObject llllllllllllllllllIIllIIIlIlIIlI;
            void llllllllllllllllllIIllIIIlIllIll;
            if (ae.lIlIlllIIlIlI(llllllllllllllllllIIllIIIlIllIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ae.lIlIlllIIllIl(llllllllllllllllllIIllIIIlIlIIlI = TileObjects.getNearest(tileObject -> {
                int n2;
                if (ae.lIlIlllIIlIlI(tileObject.getName().contains(llIIlllIIl[llIIlllIll[233]]) ? 1 : 0) && ae.lIlIlllIlIIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIIlllIll[234], llIIlllIll[131], llIIlllIll[3])), llIIlllIll[3])) {
                    n2 = llIIlllIll[1];
                    0;
                    if (2 < ((0xC7 ^ 0xA6) & ~(0x18 ^ 0x79))) {
                        return ((0xD1 ^ 0x8B) & ~(0x66 ^ 0x3C)) != 0;
                    }
                } else {
                    n2 = llIIlllIll[0];
                }
                return n2 != 0;
            }))) {
                llllllllllllllllllIIllIIIlIlIIIl = Skills.getExperience((Skill)Skill.AGILITY);
                AccBuilderSotf.c = llIIlllIIl[llIIlllIll[148]];
                llllllllllllllllllIIllIIIlIlIIlI.interact(llIIlllIIl[llIIlllIll[149]]);
                Time.sleepTicks((int)e.c(llIIlllIll[1], llIIlllIll[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (ae.lIlIlllIIlllI(Skills.getExperience((Skill)Skill.AGILITY), llllllllllllllllllIIllIIIlIlIIIl)) {
                        bl = llIIlllIll[1];
                        0;
                        if (3 <= 1) {
                            return ((0x9A ^ 0xB2) & ~(0x89 ^ 0xA1)) != 0;
                        }
                    } else {
                        bl = llIIlllIll[0];
                    }
                    return bl;
                }, (int)llIIlllIll[104]);
                0;
                Time.sleepTicks((int)llIIlllIll[1]);
                0;
            }
            if (ae.lIlIlllIIlIlI(ae.eF() ? 1 : 0)) {
                return;
            }
            if (ae.lIlIlllIIlIlI(llllllllllllllllllIIllIIIlIllIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ae.lIlIlllIIllIl(llllllllllllllllllIIllIIIlIlIIlI = TileObjects.getNearest(tileObject -> {
                int n2;
                if (ae.lIlIlllIIlIlI(tileObject.getName().contains(llIIlllIIl[llIIlllIll[232]]) ? 1 : 0) && ae.lIlIlllIlIIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIIlllIll[131], llIIlllIll[225], llIIlllIll[3])), llIIlllIll[3])) {
                    n2 = llIIlllIll[1];
                    0;
                    if ((44 + 7 - 36 + 129 ^ 54 + 143 - 171 + 122) > (0x25 ^ 0x61 ^ (0x67 ^ 0x27))) {
                        return ((42 + 219 - 118 + 77 ^ 152 + 5 - 118 + 119) & (0xE ^ 0x14 ^ (0xDD ^ 0x85) ^ -1)) != 0;
                    }
                } else {
                    n2 = llIIlllIll[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderSotf.c = llIIlllIIl[llIIlllIll[150]];
                llllllllllllllllllIIllIIIlIlIIIl = Skills.getExperience((Skill)Skill.AGILITY);
                llllllllllllllllllIIllIIIlIlIIlI.interact(llIIlllIIl[llIIlllIll[151]]);
                Time.sleepTicks((int)e.c(llIIlllIll[1], llIIlllIll[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (ae.lIlIlllIIlllI(Skills.getExperience((Skill)Skill.AGILITY), llllllllllllllllllIIllIIIlIlIIIl)) {
                        bl = llIIlllIll[1];
                        0;
                        if (((0x8D ^ 0x88 ^ (0x6F ^ 0x35)) & (64 + 124 - -4 + 56 ^ 97 + 0 - 62 + 132 ^ -1)) <= -1) {
                            return ((0x8D ^ 0xB2 ^ (0x8D ^ 0xBC)) & (0xA6 ^ 0xC3 ^ (0xA ^ 0x61) ^ -1)) != 0;
                        }
                    } else {
                        bl = llIIlllIll[0];
                    }
                    return bl;
                }, (int)llIIlllIll[104]);
                0;
                Time.sleepTicks((int)llIIlllIll[1]);
                0;
            }
            if (ae.lIlIlllIIlIlI(ae.eF() ? 1 : 0)) {
                return;
            }
            if (ae.lIlIlllIIlIlI(llllllllllllllllllIIllIIIlIllIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ae.lIlIlllIIllIl(llllllllllllllllllIIllIIIlIlIIlI = TileObjects.getNearest(tileObject -> {
                int n2;
                if (ae.lIlIlllIIlIlI(tileObject.getName().contains(llIIlllIIl[llIIlllIll[230]]) ? 1 : 0) && ae.lIlIlllIlIIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIIlllIll[139], llIIlllIll[231], llIIlllIll[3])), llIIlllIll[3])) {
                    n2 = llIIlllIll[1];
                    0;
                    if (2 > (0xD9 ^ 0xA2 ^ 54 + 91 - 96 + 78)) {
                        return ((19 + 45 - -45 + 45 ^ 107 + 38 - 70 + 121) & (39 + 115 - 14 + 82 ^ 124 + 33 - 131 + 102 ^ -1)) != 0;
                    }
                } else {
                    n2 = llIIlllIll[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderSotf.c = llIIlllIIl[llIIlllIll[152]];
                llllllllllllllllllIIllIIIlIlIIIl = Skills.getExperience((Skill)Skill.AGILITY);
                llllllllllllllllllIIllIIIlIlIIlI.interact(llIIlllIIl[llIIlllIll[153]]);
                Time.sleepTicks((int)e.c(llIIlllIll[1], llIIlllIll[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (ae.lIlIlllIIlllI(Skills.getExperience((Skill)Skill.AGILITY), llllllllllllllllllIIllIIIlIlIIIl)) {
                        bl = llIIlllIll[1];
                        0;
                        if (((0x70 ^ 0x75) & ~(0xB5 ^ 0xB0)) != 0) {
                            return ((0x7C ^ 0x1D) & ~(0x3D ^ 0x5C)) != 0;
                        }
                    } else {
                        bl = llIIlllIll[0];
                    }
                    return bl;
                }, (int)llIIlllIll[104]);
                0;
                Time.sleepTicks((int)llIIlllIll[1]);
                0;
            }
            if (ae.lIlIlllIIlIlI(ae.eF() ? 1 : 0)) {
                return;
            }
            if (ae.lIlIlllIIlIlI(llllllllllllllllllIIllIIIlIllIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ae.lIlIlllIIllIl(llllllllllllllllllIIllIIIlIlIIlI = TileObjects.getNearest(tileObject -> {
                int n2;
                if (ae.lIlIlllIIlIlI(tileObject.getName().contains(llIIlllIIl[llIIlllIll[227]]) ? 1 : 0) && ae.lIlIlllIlIIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIIlllIll[228], llIIlllIll[229], llIIlllIll[10])), llIIlllIll[3])) {
                    n2 = llIIlllIll[1];
                    0;
                    if (1 < ((0x6A ^ 0x23 ^ (0x19 ^ 0x5B)) & (133 + 29 - 37 + 81 ^ 181 + 121 - 108 + 3 ^ -1))) {
                        return ((59 + 22 - 10 + 69 ^ 164 + 114 - 199 + 97) & (4 + 44 - -37 + 54 ^ 68 + 139 - 150 + 126 ^ -1)) != 0;
                    }
                } else {
                    n2 = llIIlllIll[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderSotf.c = llIIlllIIl[llIIlllIll[154]];
                llllllllllllllllllIIllIIIlIlIIIl = Skills.getExperience((Skill)Skill.AGILITY);
                llllllllllllllllllIIllIIIlIlIIlI.interact(llIIlllIIl[llIIlllIll[155]]);
                Time.sleepTicks((int)e.c(llIIlllIll[1], llIIlllIll[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (ae.lIlIlllIIlllI(Skills.getExperience((Skill)Skill.AGILITY), llllllllllllllllllIIllIIIlIlIIIl)) {
                        bl = llIIlllIll[1];
                        0;
                        if (((175 + 110 - 81 + 13 ^ 33 + 85 - -22 + 6) & (0x38 ^ 0x73 ^ (6 ^ 0x38) & ~(0x8F ^ 0xB1) ^ -1)) > 1) {
                            return ((0xDB ^ 0xBC ^ (2 ^ 0x4A)) & (0xC4 ^ 0xAB ^ (0xEA ^ 0xAA) ^ -1) & ((0xFF ^ 0x8B ^ (0xE0 ^ 0x8E)) & (96 + 16 - 4 + 60 ^ 68 + 174 - 103 + 39 ^ -1) ^ -1)) != 0;
                        }
                    } else {
                        bl = llIIlllIll[0];
                    }
                    return bl;
                }, (int)llIIlllIll[104]);
                0;
                Time.sleepTicks((int)llIIlllIll[1]);
                0;
            }
            if (ae.lIlIlllIIlIlI(ae.eF() ? 1 : 0)) {
                return;
            }
            if (ae.lIlIlllIIlIlI(llllllllllllllllllIIllIIIlIlIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ae.lIlIlllIIllIl(llllllllllllllllllIIllIIIlIlIIlI = TileObjects.getNearest(tileObject -> {
                int n2;
                if (ae.lIlIlllIIlIlI(tileObject.getName().contains(llIIlllIIl[llIIlllIll[226]]) ? 1 : 0) && ae.lIlIlllIlIIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIIlllIll[9], llIIlllIll[130], llIIlllIll[3])), llIIlllIll[3])) {
                    n2 = llIIlllIll[1];
                    0;
                    if (2 == 0) {
                        return ((0x8C ^ 0xA5) & ~(0x39 ^ 0x10)) != 0;
                    }
                } else {
                    n2 = llIIlllIll[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderSotf.c = llIIlllIIl[llIIlllIll[156]];
                llllllllllllllllllIIllIIIlIlIIIl = Skills.getExperience((Skill)Skill.AGILITY);
                llllllllllllllllllIIllIIIlIlIIlI.interact(llIIlllIIl[llIIlllIll[157]]);
                Time.sleepTicks((int)e.c(llIIlllIll[1], llIIlllIll[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (ae.lIlIlllIIlllI(Skills.getExperience((Skill)Skill.AGILITY), llllllllllllllllllIIllIIIlIlIIIl)) {
                        bl = llIIlllIll[1];
                        0;
                        if (-3 > 0) {
                            return ((0x81 ^ 0xC1) & ~(9 ^ 0x49)) != 0;
                        }
                    } else {
                        bl = llIIlllIll[0];
                    }
                    return bl;
                }, (int)llIIlllIll[104]);
                0;
                Time.sleepTicks((int)llIIlllIll[1]);
                0;
            }
            if (ae.lIlIlllIIlIlI(ae.eF() ? 1 : 0)) {
                return;
            }
            if (ae.lIlIlllIIlIlI(llllllllllllllllllIIllIIIlIlIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ae.lIlIlllIIllIl(llllllllllllllllllIIllIIIlIlIIlI = TileObjects.getNearest(tileObject -> {
                int n2;
                if (ae.lIlIlllIIlIlI(tileObject.getName().contains(llIIlllIIl[llIIlllIll[224]]) ? 1 : 0) && ae.lIlIlllIlIIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIIlllIll[225], llIIlllIll[215], llIIlllIll[10])), llIIlllIll[3])) {
                    n2 = llIIlllIll[1];
                    0;
                    if (null != null) {
                        return ((0x67 ^ 0x44) & ~(0x4A ^ 0x69)) != 0;
                    }
                } else {
                    n2 = llIIlllIll[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderSotf.c = llIIlllIIl[llIIlllIll[158]];
                llllllllllllllllllIIllIIIlIlIIIl = Skills.getExperience((Skill)Skill.AGILITY);
                llllllllllllllllllIIllIIIlIlIIlI.interact(llIIlllIIl[llIIlllIll[159]]);
                Time.sleepTicks((int)e.c(llIIlllIll[1], llIIlllIll[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (ae.lIlIlllIIlllI(Skills.getExperience((Skill)Skill.AGILITY), llllllllllllllllllIIllIIIlIlIIIl)) {
                        bl = llIIlllIll[1];
                        0;
                        if (null != null) {
                            return ((0x5F ^ 0x54) & ~(0x76 ^ 0x7D)) != 0;
                        }
                    } else {
                        bl = llIIlllIll[0];
                    }
                    return bl;
                }, (int)llIIlllIll[104]);
                0;
                Time.sleepTicks((int)llIIlllIll[1]);
                0;
            }
            if (ae.lIlIlllIIlIlI(ae.eF() ? 1 : 0)) {
                return;
            }
            if (ae.lIlIlllIIlIlI(llllllllllllllllllIIllIIIlIlIlIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ae.lIlIlllIIllIl(llllllllllllllllllIIllIIIlIlIIlI = TileObjects.getNearest(tileObject -> {
                int n2;
                if (ae.lIlIlllIIlIlI(tileObject.getName().contains(llIIlllIIl[llIIlllIll[221]]) ? 1 : 0) && ae.lIlIlllIlIIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIIlllIll[222], llIIlllIll[223], llIIlllIll[3])), llIIlllIll[3])) {
                    n2 = llIIlllIll[1];
                    0;
                    if ((0x89 ^ 0x8D) < 0) {
                        return ((0x35 ^ 0x17) & ~(0x31 ^ 0x13)) != 0;
                    }
                } else {
                    n2 = llIIlllIll[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderSotf.c = llIIlllIIl[llIIlllIll[160]];
                llllllllllllllllllIIllIIIlIlIIIl = Skills.getExperience((Skill)Skill.AGILITY);
                llllllllllllllllllIIllIIIlIlIIlI.interact(llIIlllIIl[llIIlllIll[161]]);
                Time.sleepTicks((int)e.c(llIIlllIll[1], llIIlllIll[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (ae.lIlIlllIIlllI(Skills.getExperience((Skill)Skill.AGILITY), llllllllllllllllllIIllIIIlIlIIIl)) {
                        bl = llIIlllIll[1];
                        0;
                        if (-1 >= ((191 + 122 - 135 + 51 ^ 133 + 108 - 217 + 139) & (36 + 174 - 159 + 181 ^ 35 + 38 - -54 + 47 ^ -1))) {
                            return (((0xE0 ^ 0xB5) & ~(0xC8 ^ 0x9D) ^ (0x97 ^ 0xB5)) & (0x97 ^ 0x80 ^ (0xF3 ^ 0xC6) ^ -1)) != 0;
                        }
                    } else {
                        bl = llIIlllIll[0];
                    }
                    return bl;
                }, (int)llIIlllIll[104]);
                0;
                Time.sleepTicks((int)llIIlllIll[1]);
                0;
            }
        }
    }

    @Override
    public boolean ae() {
        return llIIlllIll[0];
    }

    private static boolean lIlIlllIlIIIl(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        if (ae.lIlIlllIlIIII(Skills.getBoostedLevel((Skill)Skill.AGILITY), llIIlllIll[37])) {
            int n3;
            int[] nArray = new int[llIIlllIll[1]];
            nArray[ae.llIIlllIll[0]] = llIIlllIll[13];
            if (ae.lIlIlllIIlIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[llIIlllIll[1]];
                nArray2[ae.llIIlllIll[0]] = llIIlllIll[25];
                if (ae.lIlIlllIIlIlI(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                    int[] nArray3 = new int[llIIlllIll[1]];
                    nArray3[ae.llIIlllIll[0]] = llIIlllIll[23];
                    if (!(!ae.lIlIlllIIlIlI(Inventory.contains((int[])nArray3) ? 1 : 0) || ae.lIlIlllIIllII(Inventory.contains(item -> item.getName().contains(llIIlllIIl[llIIlllIll[207]])) ? 1 : 0) && !ae.lIlIlllIIlIlI(Equipment.contains(item -> item.getName().contains(llIIlllIIl[llIIlllIll[206]])) ? 1 : 0) || ae.lIlIlllIIllII(Inventory.contains((int[])f.bk) ? 1 : 0) && !ae.lIlIlllIIlIlI(Equipment.contains((int[])f.bk) ? 1 : 0))) {
                        n3 = llIIlllIll[1];
                        0;
                        if (null == null) return n3 != 0;
                        return ((0x78 ^ 0x17 ^ (0x1C ^ 0x55)) & (120 + 97 - 94 + 5 ^ 31 + 132 - 99 + 102 ^ -1)) != 0;
                    }
                }
            }
            n3 = llIIlllIll[0];
            return n3 != 0;
        }
        int[] nArray = new int[llIIlllIll[1]];
        nArray[ae.llIIlllIll[0]] = llIIlllIll[13];
        if (ae.lIlIlllIIlIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray4 = new int[llIIlllIll[1]];
            nArray4[ae.llIIlllIll[0]] = llIIlllIll[15];
            if (ae.lIlIlllIIlIlI(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                int[] nArray5 = new int[llIIlllIll[1]];
                nArray5[ae.llIIlllIll[0]] = llIIlllIll[14];
                if (!(!ae.lIlIlllIIlIlI(Inventory.contains((int[])nArray5) ? 1 : 0) || ae.lIlIlllIIllII(Inventory.contains(item -> item.getName().contains(llIIlllIIl[llIIlllIll[205]])) ? 1 : 0) && !ae.lIlIlllIIlIlI(Equipment.contains(item -> item.getName().contains(llIIlllIIl[llIIlllIll[204]])) ? 1 : 0) || ae.lIlIlllIIllII(Inventory.contains((int[])f.bk) ? 1 : 0) && !ae.lIlIlllIIlIlI(Equipment.contains((int[])f.bk) ? 1 : 0))) {
                    n2 = llIIlllIll[1];
                    0;
                    if (null == null) return n2 != 0;
                    return ((19 + 6 - 2 + 105 ^ 72 + 3 - 52 + 135) & (0x89 ^ 0x9A ^ (0x39 ^ 0x34) ^ -1)) != 0;
                }
            }
        }
        n2 = llIIlllIll[0];
        return n2 != 0;
    }

    public static void Q() {
        d llllllllllllllllllIIllIIIIIIIlll;
        block18: {
            block17: {
                block16: {
                    block15: {
                        int[] nArray = new int[llIIlllIll[1]];
                        nArray[ae.llIIlllIll[0]] = llIIlllIll[16];
                        if (ae.lIlIlllIIllII(Bank.contains((int[])nArray) ? 1 : 0)) {
                            d d2 = new d(llIIlllIll[16], llIIlllIll[1], llIIlllIll[195]);
                            bv.add(d2);
                            0;
                        }
                        int[] nArray2 = new int[llIIlllIll[1]];
                        nArray2[ae.llIIlllIll[0]] = llIIlllIll[18];
                        if (ae.lIlIlllIIllII(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            llllllllllllllllllIIllIIIIIIIlll = new d(llIIlllIll[18], llIIlllIll[3], llIIlllIll[196]);
                            bv.add(llllllllllllllllllIIllIIIIIIIlll);
                            0;
                        }
                        int[] nArray3 = new int[llIIlllIll[1]];
                        nArray3[ae.llIIlllIll[0]] = llIIlllIll[27];
                        if (ae.lIlIlllIIllII(Bank.contains((int[])nArray3) ? 1 : 0)) {
                            llllllllllllllllllIIllIIIIIIIlll = new d(llIIlllIll[27], llIIlllIll[3], llIIlllIll[196]);
                            bv.add(llllllllllllllllllIIllIIIIIIIlll);
                            0;
                        }
                        int[] nArray4 = new int[llIIlllIll[1]];
                        nArray4[ae.llIIlllIll[0]] = llIIlllIll[13];
                        if (ae.lIlIlllIIllII(Bank.contains((int[])nArray4) ? 1 : 0)) {
                            llllllllllllllllllIIllIIIIIIIlll = new d(llIIlllIll[13], llIIlllIll[12], llIIlllIll[197]);
                            bv.add(llllllllllllllllllIIllIIIIIIIlll);
                            0;
                        }
                        int[] nArray5 = new int[llIIlllIll[1]];
                        nArray5[ae.llIIlllIll[0]] = llIIlllIll[21];
                        if (ae.lIlIlllIIllII(Bank.contains((int[])nArray5) ? 1 : 0)) {
                            llllllllllllllllllIIllIIIIIIIlll = new d(llIIlllIll[21], llIIlllIll[12], llIIlllIll[198]);
                            bv.add(llllllllllllllllllIIllIIIIIIIlll);
                            0;
                        }
                        int[] nArray6 = new int[llIIlllIll[1]];
                        nArray6[ae.llIIlllIll[0]] = llIIlllIll[15];
                        if (ae.lIlIlllIIllII(Bank.contains((int[])nArray6) ? 1 : 0)) {
                            llllllllllllllllllIIllIIIIIIIlll = new d(llIIlllIll[15], llIIlllIll[12], llIIlllIll[198]);
                            bv.add(llllllllllllllllllIIllIIIIIIIlll);
                            0;
                        }
                        int[] nArray7 = new int[llIIlllIll[1]];
                        nArray7[ae.llIIlllIll[0]] = llIIlllIll[14];
                        if (ae.lIlIlllIIllII(Bank.contains((int[])nArray7) ? 1 : 0)) {
                            llllllllllllllllllIIllIIIIIIIlll = new d(llIIlllIll[14], llIIlllIll[12], llIIlllIll[198]);
                            bv.add(llllllllllllllllllIIllIIIIIIIlll);
                            0;
                        }
                        int[] nArray8 = new int[llIIlllIll[1]];
                        nArray8[ae.llIIlllIll[0]] = llIIlllIll[23];
                        if (!ae.lIlIlllIIlIlI(Bank.contains((int[])nArray8) ? 1 : 0)) break block15;
                        int[] nArray9 = new int[llIIlllIll[1]];
                        nArray9[ae.llIIlllIll[0]] = llIIlllIll[23];
                        if (!ae.lIlIlllIIlIlI(Bank.contains((int[])nArray9) ? 1 : 0)) break block16;
                        int[] nArray10 = new int[llIIlllIll[1]];
                        nArray10[ae.llIIlllIll[0]] = llIIlllIll[23];
                        if (!ae.lIlIlllIIlIll(Bank.getFirst((int[])nArray10).getQuantity(), llIIlllIll[12])) break block16;
                    }
                    llllllllllllllllllIIllIIIIIIIlll = new d(mU, llIIlllIll[44], llIIlllIll[199]);
                    bv.add(llllllllllllllllllIIllIIIIIIIlll);
                    0;
                }
                int[] nArray = new int[llIIlllIll[1]];
                nArray[ae.llIIlllIll[0]] = llIIlllIll[25];
                if (!ae.lIlIlllIIlIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block17;
                int[] nArray11 = new int[llIIlllIll[1]];
                nArray11[ae.llIIlllIll[0]] = llIIlllIll[25];
                if (!ae.lIlIlllIIlIlI(Bank.contains((int[])nArray11) ? 1 : 0)) break block18;
                int[] nArray12 = new int[llIIlllIll[1]];
                nArray12[ae.llIIlllIll[0]] = llIIlllIll[25];
                if (!ae.lIlIlllIIlIll(Bank.getFirst((int[])nArray12).getQuantity(), llIIlllIll[12])) break block18;
            }
            llllllllllllllllllIIllIIIIIIIlll = new d(llIIlllIll[25], llIIlllIll[12], llIIlllIll[200]);
            bv.add(llllllllllllllllllIIllIIIIIIIlll);
            0;
        }
        int[] nArray = new int[llIIlllIll[1]];
        nArray[ae.llIIlllIll[0]] = llIIlllIll[201];
        if (ae.lIlIlllIIllII(Bank.contains((int[])nArray) ? 1 : 0)) {
            llllllllllllllllllIIllIIIIIIIlll = new d(llIIlllIll[201], llIIlllIll[1], llIIlllIll[202]);
            bv.add(llllllllllllllllllIIllIIIIIIIlll);
            0;
        }
        int[] nArray13 = new int[llIIlllIll[1]];
        nArray13[ae.llIIlllIll[0]] = llIIlllIll[19];
        if (ae.lIlIlllIIllII(Bank.contains((int[])nArray13) ? 1 : 0)) {
            llllllllllllllllllIIllIIIIIIIlll = new d(llIIlllIll[19], llIIlllIll[40], j.cf);
            bv.add(llllllllllllllllllIIllIIIIIIIlll);
            0;
        }
    }

    private static String lIlIlllIIIlIl(String llllllllllllllllllIIlIlllIIlIIlI, String llllllllllllllllllIIlIlllIIlIIIl) {
        try {
            SecretKeySpec llllllllllllllllllIIlIlllIIlIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIlIlllIIlIIIl.getBytes(StandardCharsets.UTF_8)), llIIlllIll[24]), "DES");
            Cipher llllllllllllllllllIIlIlllIIlIlII = Cipher.getInstance("DES");
            llllllllllllllllllIIlIlllIIlIlII.init(llIIlllIll[3], llllllllllllllllllIIlIlllIIlIlIl);
            return new String(llllllllllllllllllIIlIlllIIlIlII.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIlIlllIIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllIIlIlllIIlIIll) {
            llllllllllllllllllIIlIlllIIlIIll.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    private static void eC() {
        WorldArea worldArea = new WorldArea(llIIlllIll[76], llIIlllIll[77], llIIlllIll[78], llIIlllIll[79], llIIlllIll[1]);
        WorldArea worldArea2 = new WorldArea(llIIlllIll[76], llIIlllIll[77], llIIlllIll[78], llIIlllIll[79], llIIlllIll[3]);
        WorldArea worldArea3 = new WorldArea(llIIlllIll[76], llIIlllIll[77], llIIlllIll[78], llIIlllIll[79], llIIlllIll[10]);
        WorldArea worldArea4 = new WorldArea(llIIlllIll[80], llIIlllIll[81], llIIlllIll[69], llIIlllIll[64], llIIlllIll[0]);
        WorldArea worldArea5 = new WorldArea(llIIlllIll[82], llIIlllIll[81], llIIlllIll[12], llIIlllIll[64], llIIlllIll[10]);
        WorldArea worldArea6 = new WorldArea(llIIlllIll[83], llIIlllIll[84], llIIlllIll[63], llIIlllIll[49], llIIlllIll[10]);
        WorldArea worldArea7 = new WorldArea(llIIlllIll[85], llIIlllIll[86], llIIlllIll[26], llIIlllIll[22], llIIlllIll[1]);
        WorldArea worldArea8 = new WorldArea(llIIlllIll[85], llIIlllIll[87], llIIlllIll[12], llIIlllIll[24], llIIlllIll[10]);
        WorldArea worldArea9 = new WorldArea(llIIlllIll[88], llIIlllIll[89], llIIlllIll[75], llIIlllIll[40], llIIlllIll[10]);
        WorldArea worldArea10 = new WorldArea(llIIlllIll[90], llIIlllIll[91], llIIlllIll[66], llIIlllIll[64], llIIlllIll[10]);
        WorldArea worldArea11 = new WorldArea(llIIlllIll[92], llIIlllIll[93], llIIlllIll[22], llIIlllIll[26], llIIlllIll[10]);
        WorldArea worldArea12 = new WorldArea(llIIlllIll[92], llIIlllIll[94], llIIlllIll[12], llIIlllIll[22], llIIlllIll[10]);
        if (ae.lIlIlllIIllII(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ae.lIlIlllIIllII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ae.lIlIlllIIllII(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ae.lIlIlllIIllII(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIIlllIIl[llIIlllIll[95]];
            if (ae.lIlIlllIIlIlI(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
            }
            if (ae.lIlIlllIIlIlI(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo((WorldPoint)new WorldPoint(llIIlllIll[96], llIIlllIll[52], llIIlllIll[0]));
            0;
            Time.sleepTicks((int)llIIlllIll[1]);
            0;
        }
        if (ae.lIlIlllIlIIIl(Players.getLocal().getAnimation(), llIIlllIll[62]) && ae.lIlIlllIIllII(Players.getLocal().isMoving() ? 1 : 0)) {
            String[] stringArray = new String[llIIlllIll[1]];
            stringArray[ae.llIIlllIll[0]] = llIIlllIIl[llIIlllIll[97]];
            TileItem llllllllllllllllllIIllIIIlllIIII = TileItems.getNearest((String[])stringArray);
            if (ae.lIlIlllIIllIl(llllllllllllllllllIIllIIIlllIIII) && ae.lIlIlllIIlIlI(ae.eF() ? 1 : 0)) {
                AccBuilderSotf.c = llIIlllIIl[llIIlllIll[98]];
                System.out.println(llIIlllIIl[llIIlllIll[99]]);
                llllllllllllllllllIIllIIIlllIIII.interact(llIIlllIIl[llIIlllIll[100]]);
                Time.sleepTicks((int)llIIlllIll[10]);
                0;
            }
            if (ae.lIlIlllIIllII(ae.eF() ? 1 : 0)) {
                void llllllllllllllllllIIllIIIlllIIIl;
                void llllllllllllllllllIIllIIIlllIIlI;
                void llllllllllllllllllIIllIIIlllIIll;
                void llllllllllllllllllIIllIIIlllIlII;
                void llllllllllllllllllIIllIIIlllIlIl;
                void llllllllllllllllllIIllIIIlllIllI;
                void llllllllllllllllllIIllIIIlllIlll;
                void llllllllllllllllllIIllIIIllllIII;
                int llllllllllllllllllIIllIIIllIllll;
                void llllllllllllllllllIIllIIIllllIIl;
                if (ae.lIlIlllIIlIlI(llllllllllllllllllIIllIIIllllIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ae.lIlIlllIIllII(ae.eF() ? 1 : 0)) {
                    AccBuilderSotf.c = llIIlllIIl[llIIlllIll[101]];
                    llllllllllllllllllIIllIIIllIllll = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray2 = new String[llIIlllIll[1]];
                    stringArray2[ae.llIIlllIll[0]] = llIIlllIIl[llIIlllIll[102]];
                    TileObjects.getNearest((String[])stringArray2).interact(llIIlllIIl[llIIlllIll[103]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (ae.lIlIlllIIlllI(Skills.getExperience((Skill)Skill.AGILITY), llllllllllllllllllIIllIIIllIllll)) {
                            bl = llIIlllIll[1];
                            0;
                            if (3 < 0) {
                                return ((0x33 ^ 0x52) & ~(0x7A ^ 0x1B)) != 0;
                            }
                        } else {
                            bl = llIIlllIll[0];
                        }
                        return bl;
                    }, (int)llIIlllIll[104]);
                    0;
                    Time.sleepTicks((int)llIIlllIll[1]);
                    0;
                }
                if (ae.lIlIlllIIlIlI(llllllllllllllllllIIllIIIllllIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ae.lIlIlllIIllII(ae.eF() ? 1 : 0)) {
                    AccBuilderSotf.c = llIIlllIIl[llIIlllIll[37]];
                    llllllllllllllllllIIllIIIllIllll = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray3 = new String[llIIlllIll[1]];
                    stringArray3[ae.llIIlllIll[0]] = llIIlllIIl[llIIlllIll[105]];
                    TileObjects.getNearest((String[])stringArray3).interact(llIIlllIIl[llIIlllIll[106]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (ae.lIlIlllIIlllI(Skills.getExperience((Skill)Skill.AGILITY), llllllllllllllllllIIllIIIllIllll)) {
                            bl = llIIlllIll[1];
                            0;
                            if (3 == 0) {
                                return (1 & ~1) != 0;
                            }
                        } else {
                            bl = llIIlllIll[0];
                        }
                        return bl;
                    }, (int)llIIlllIll[104]);
                    0;
                    Time.sleepTicks((int)llIIlllIll[1]);
                    0;
                }
                if (ae.lIlIlllIIlIlI(llllllllllllllllllIIllIIIlllIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ae.lIlIlllIIllII(ae.eF() ? 1 : 0)) {
                    AccBuilderSotf.c = llIIlllIIl[llIIlllIll[107]];
                    llllllllllllllllllIIllIIIllIllll = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray4 = new String[llIIlllIll[1]];
                    stringArray4[ae.llIIlllIll[0]] = llIIlllIIl[llIIlllIll[108]];
                    TileObjects.getNearest((String[])stringArray4).interact(llIIlllIIl[llIIlllIll[109]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (ae.lIlIlllIIlllI(Skills.getExperience((Skill)Skill.AGILITY), llllllllllllllllllIIllIIIllIllll)) {
                            bl = llIIlllIll[1];
                            0;
                            if ((0x70 ^ 0x1B ^ (7 ^ 0x68)) < ((0x36 ^ 0x7F ^ (0x94 ^ 0xC6)) & (0x3E ^ 0xB ^ (0xA6 ^ 0x88) ^ -1))) {
                                return ((81 + 81 - -62 + 25 ^ 35 + 146 - 66 + 76) & (77 + 237 - 194 + 129 ^ 167 + 116 - 129 + 37 ^ -1)) != 0;
                            }
                        } else {
                            bl = llIIlllIll[0];
                        }
                        return bl;
                    }, (int)llIIlllIll[104]);
                    0;
                    Time.sleepTicks((int)llIIlllIll[1]);
                    0;
                }
                if (ae.lIlIlllIIlIlI(llllllllllllllllllIIllIIIlllIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ae.lIlIlllIIllII(ae.eF() ? 1 : 0)) {
                    AccBuilderSotf.c = llIIlllIIl[llIIlllIll[110]];
                    llllllllllllllllllIIllIIIllIllll = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray5 = new String[llIIlllIll[1]];
                    stringArray5[ae.llIIlllIll[0]] = llIIlllIIl[llIIlllIll[111]];
                    TileObjects.getNearest((String[])stringArray5).interact(llIIlllIIl[llIIlllIll[112]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (ae.lIlIlllIIlllI(Skills.getExperience((Skill)Skill.AGILITY), llllllllllllllllllIIllIIIllIllll)) {
                            bl = llIIlllIll[1];
                            0;
                            if ((174 + 97 - 84 + 3 ^ 89 + 102 - 83 + 79) <= 0) {
                                return ((62 + 121 - 131 + 105 ^ 187 + 144 - 181 + 41) & (74 + 137 - 53 + 27 ^ 44 + 22 - -51 + 38 ^ -1)) != 0;
                            }
                        } else {
                            bl = llIIlllIll[0];
                        }
                        return bl;
                    }, (int)llIIlllIll[104]);
                    0;
                    Time.sleepTicks((int)llIIlllIll[1]);
                    0;
                }
                if (ae.lIlIlllIIlIlI(llllllllllllllllllIIllIIIlllIlIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ae.lIlIlllIIllII(ae.eF() ? 1 : 0)) {
                    AccBuilderSotf.c = llIIlllIIl[llIIlllIll[113]];
                    llllllllllllllllllIIllIIIllIllll = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray6 = new String[llIIlllIll[1]];
                    stringArray6[ae.llIIlllIll[0]] = llIIlllIIl[llIIlllIll[39]];
                    TileObjects.getNearest((String[])stringArray6).interact(llIIlllIIl[llIIlllIll[7]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (ae.lIlIlllIIlllI(Skills.getExperience((Skill)Skill.AGILITY), llllllllllllllllllIIllIIIllIllll)) {
                            bl = llIIlllIll[1];
                            0;
                            if (-3 >= 0) {
                                return ((0x2E ^ 0x24) & ~(0x87 ^ 0x8D)) != 0;
                            }
                        } else {
                            bl = llIIlllIll[0];
                        }
                        return bl;
                    }, (int)llIIlllIll[104]);
                    0;
                    Time.sleepTicks((int)llIIlllIll[1]);
                    0;
                }
                if (ae.lIlIlllIIlIlI(llllllllllllllllllIIllIIIlllIlII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ae.lIlIlllIIllII(ae.eF() ? 1 : 0)) {
                    AccBuilderSotf.c = llIIlllIIl[llIIlllIll[114]];
                    llllllllllllllllllIIllIIIllIllll = Skills.getExperience((Skill)Skill.AGILITY);
                    int[] nArray = new int[llIIlllIll[1]];
                    nArray[ae.llIIlllIll[0]] = llIIlllIll[115];
                    TileObjects.getNearest((int[])nArray).interact(llIIlllIIl[llIIlllIll[116]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (ae.lIlIlllIIlllI(Skills.getExperience((Skill)Skill.AGILITY), llllllllllllllllllIIllIIIllIllll)) {
                            bl = llIIlllIll[1];
                            0;
                            if (2 < -1) {
                                return ((0x1A ^ 0x21) & ~(0x32 ^ 9)) != 0;
                            }
                        } else {
                            bl = llIIlllIll[0];
                        }
                        return bl;
                    }, (int)llIIlllIll[104]);
                    0;
                    Time.sleepTicks((int)llIIlllIll[1]);
                    0;
                }
                if (ae.lIlIlllIIlIlI(llllllllllllllllllIIllIIIlllIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ae.lIlIlllIIllII(ae.eF() ? 1 : 0)) {
                    AccBuilderSotf.c = llIIlllIIl[llIIlllIll[117]];
                    llllllllllllllllllIIllIIIllIllll = Skills.getExperience((Skill)Skill.AGILITY);
                    int[] nArray = new int[llIIlllIll[1]];
                    nArray[ae.llIIlllIll[0]] = llIIlllIll[118];
                    TileObjects.getNearest((int[])nArray).interact(llIIlllIIl[llIIlllIll[119]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (ae.lIlIlllIIlllI(Skills.getExperience((Skill)Skill.AGILITY), llllllllllllllllllIIllIIIllIllll)) {
                            bl = llIIlllIll[1];
                            0;
                            if (-1 >= 3) {
                                return ((106 + 33 - 10 + 32 ^ 153 + 24 - 135 + 117) & (71 + 175 - 180 + 122 ^ 86 + 35 - 32 + 41 ^ -1)) != 0;
                            }
                        } else {
                            bl = llIIlllIll[0];
                        }
                        return bl;
                    }, (int)llIIlllIll[104]);
                    0;
                    Time.sleepTicks((int)llIIlllIll[1]);
                    0;
                }
                if (ae.lIlIlllIIlIlI(llllllllllllllllllIIllIIIlllIIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ae.lIlIlllIIllII(ae.eF() ? 1 : 0)) {
                    AccBuilderSotf.c = llIIlllIIl[llIIlllIll[120]];
                    llllllllllllllllllIIllIIIllIllll = Skills.getExperience((Skill)Skill.AGILITY);
                    int[] nArray = new int[llIIlllIll[1]];
                    nArray[ae.llIIlllIll[0]] = llIIlllIll[121];
                    TileObjects.getNearest((int[])nArray).interact(llIIlllIIl[llIIlllIll[122]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (ae.lIlIlllIIlllI(Skills.getExperience((Skill)Skill.AGILITY), llllllllllllllllllIIllIIIllIllll)) {
                            bl = llIIlllIll[1];
                            0;
                            if (-1 >= ((0x9D ^ 0xBE) & ~(0x11 ^ 0x32))) {
                                return ((0xB5 ^ 0xB2) & ~(0xA2 ^ 0xA5)) != 0;
                            }
                        } else {
                            bl = llIIlllIll[0];
                        }
                        return bl;
                    }, (int)llIIlllIll[104]);
                    0;
                    Time.sleepTicks((int)llIIlllIll[1]);
                    0;
                }
                if (ae.lIlIlllIIlIlI(llllllllllllllllllIIllIIIlllIIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ae.lIlIlllIIllII(ae.eF() ? 1 : 0)) {
                    AccBuilderSotf.c = llIIlllIIl[llIIlllIll[123]];
                    llllllllllllllllllIIllIIIllIllll = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray7 = new String[llIIlllIll[1]];
                    stringArray7[ae.llIIlllIll[0]] = llIIlllIIl[llIIlllIll[124]];
                    TileObjects.getNearest((String[])stringArray7).interact(llIIlllIIl[llIIlllIll[44]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (ae.lIlIlllIIlllI(Skills.getExperience((Skill)Skill.AGILITY), llllllllllllllllllIIllIIIllIllll)) {
                            bl = llIIlllIll[1];
                            0;
                            if (null != null) {
                                return ((0x6E ^ 0x3E) & ~(0xFC ^ 0xAC)) != 0;
                            }
                        } else {
                            bl = llIIlllIll[0];
                        }
                        return bl;
                    }, (int)llIIlllIll[104]);
                    0;
                    Time.sleepTicks((int)llIIlllIll[1]);
                    0;
                }
            }
        }
    }

    private static boolean lIlIlllIlIIII(int n2, int n3) {
        return n2 >= n3;
    }

    static {
        ae.lIlIlllIIlIIl();
        ae.lIlIlllIIIlll();
        bv = new ArrayList<d>();
        mT = llIIlllIll[27];
        mU = llIIlllIll[23];
        mW = new WorldArea(llIIlllIll[235], llIIlllIll[52], llIIlllIll[69], llIIlllIll[72], llIIlllIll[0]);
        mX = new WorldArea(llIIlllIll[235], llIIlllIll[52], llIIlllIll[69], llIIlllIll[72], llIIlllIll[1]);
        mY = new WorldArea(llIIlllIll[235], llIIlllIll[52], llIIlllIll[69], llIIlllIll[72], llIIlllIll[3]);
        mZ = new WorldPoint(llIIlllIll[236], llIIlllIll[237], llIIlllIll[0]);
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (ae.lIlIlllIlIIII(Skills.getLevel((Skill)Skill.AGILITY), llIIlllIll[2])) {
            bl = llIIlllIll[1];
            0;
            if (3 <= 0) {
                return ((27 + 137 - 99 + 149 ^ 70 + 66 - 103 + 107) & (0xA6 ^ 0x92 ^ (0xE ^ 0x60) ^ -1)) != 0;
            }
        } else {
            bl = llIIlllIll[0];
        }
        return bl;
    }

    private static String lIlIlllIIIlII(String llllllllllllllllllIIlIlllIllIlII, String llllllllllllllllllIIlIlllIlIlllI) {
        llllllllllllllllllIIlIlllIllIlII = new String(Base64.getDecoder().decode(llllllllllllllllllIIlIlllIllIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllIIlIlllIllIIlI = new StringBuilder();
        char[] llllllllllllllllllIIlIlllIllIIIl = llllllllllllllllllIIlIlllIlIlllI.toCharArray();
        int llllllllllllllllllIIlIlllIllIIII = llIIlllIll[0];
        char[] llllllllllllllllllIIlIlllIlIlIlI = llllllllllllllllllIIlIlllIllIlII.toCharArray();
        int llllllllllllllllllIIlIlllIlIlIIl = llllllllllllllllllIIlIlllIlIlIlI.length;
        int llllllllllllllllllIIlIlllIlIlIII = llIIlllIll[0];
        while (ae.lIlIlllIIlIll(llllllllllllllllllIIlIlllIlIlIII, llllllllllllllllllIIlIlllIlIlIIl)) {
            char llllllllllllllllllIIlIlllIllIlIl = llllllllllllllllllIIlIlllIlIlIlI[llllllllllllllllllIIlIlllIlIlIII];
            llllllllllllllllllIIlIlllIllIIlI.append((char)(llllllllllllllllllIIlIlllIllIlIl ^ llllllllllllllllllIIlIlllIllIIIl[llllllllllllllllllIIlIlllIllIIII % llllllllllllllllllIIlIlllIllIIIl.length]));
            0;
            ++llllllllllllllllllIIlIlllIllIIII;
            ++llllllllllllllllllIIlIlllIlIlIII;
            0;
            if (null == null) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllllIIlIlllIllIIlI);
    }

    private static boolean lIlIlllIIllll(int n2) {
        return n2 > 0;
    }

    private static boolean lIlIlllIIlIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIlllIlIIlI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIlIlllIIlIlI(int n2) {
        return n2 != 0;
    }

    @Override
    public int af() {
        try {
            ae.eA();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (-1 >= 1) {
            return (0x4D ^ 0x6C ^ (0x28 ^ 0x14)) & (5 ^ 0x45 ^ (0x6A ^ 0x37) ^ -1);
        }
        return llIIlllIll[186];
    }
}

