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
package -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l;

import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.a;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ab;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.as;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.b;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.d;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.e;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.f;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.g;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.j;
import gg.squire.account.AccBuilderGWD;
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

public class U
implements ab {
    static /* synthetic */ WorldArea lo;
    private static /* synthetic */ int[] lllIIIlIl;
    static /* synthetic */ String[] cG;
    public static /* synthetic */ WorldPoint dg;
    static /* synthetic */ boolean dl;
    public static /* synthetic */ List<d> bx;
    static /* synthetic */ int dk;
    static /* synthetic */ int ln;
    public static /* synthetic */ WorldPoint ll;
    public static /* synthetic */ boolean bv;
    private static /* synthetic */ String[] lllIIIlII;
    public static /* synthetic */ WorldPoint lj;
    public static /* synthetic */ WorldPoint lm;
    public static /* synthetic */ WorldPoint lk;

    private static boolean llIIIIIlIllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static void lIlllllllIlI() {
        lllIIIlIl = new int[198];
        U.lllIIIlIl[0] = 1;
        U.lllIIIlIl[1] = (0x67 ^ 0xF ^ (0xE3 ^ 0xAD)) & (0x3D ^ 0x37 ^ (0x35 ^ 0x19) ^ -1);
        U.lllIIIlIl[2] = 0xFFFFB7DA & 0x5BAD;
        U.lllIIIlIl[3] = 2;
        U.lllIIIlIl[4] = 77 + 13 - 74 + 118 ^ 58 + 94 - 61 + 39;
        U.lllIIIlIl[5] = 0xFFFFFFFF & 0x1F47;
        U.lllIIIlIl[6] = -(0xFFFFE3FD & 0x3E23) & (0xFFFFFEFF & 0x6FBF);
        U.lllIIIlIl[7] = -(0xFFFFFBFF & 0x4402) & (0xFFFFE3BF & 0x5FF9);
        U.lllIIIlIl[8] = 3;
        U.lllIIIlIl[9] = -(0xFFFFF6C7 & 0x3FFF) & (0xFFFFBFF7 & 0x77DF);
        U.lllIIIlIl[10] = 0x15 ^ 0x55 ^ (0x20 ^ 0x6A);
        U.lllIIIlIl[11] = 0xFFFFA39D & 0x5D72;
        U.lllIIIlIl[12] = 0xFFFFB357 & 0x7DF9;
        U.lllIIIlIl[13] = -(0xFFFFF70D & 0x2CF7) & (0xFFFFAFFF & 0x757F);
        U.lllIIIlIl[14] = 0x56 ^ 0x53;
        U.lllIIIlIl[15] = 0x4B ^ 0x79;
        U.lllIIIlIl[16] = 0xAD ^ 0xA5;
        U.lllIIIlIl[17] = 0x90 ^ 0x96;
        U.lllIIIlIl[18] = 82 + 7 - 45 + 122 ^ 68 + 139 - 146 + 100;
        U.lllIIIlIl[19] = 0xFFFFC39E & 0x3D73;
        U.lllIIIlIl[20] = 0xA4 ^ 0xAD;
        U.lllIIIlIl[21] = -(0xFFFFFFFD & 0x724B) & (0xFFFFFFFC & 0x7E6F);
        U.lllIIIlIl[22] = 0xFFFFEF9D & 0x1D7F;
        U.lllIIIlIl[23] = 0xC1 ^ 0xAD ^ (0x35 ^ 0x52);
        U.lllIIIlIl[24] = 0x2C ^ 0x68 ^ (5 ^ 0x4D);
        U.lllIIIlIl[25] = 0x40 ^ 0x4D;
        U.lllIIIlIl[26] = 1 ^ (0x9C ^ 0x93);
        U.lllIIIlIl[27] = 123 + 96 - 110 + 45 ^ 24 + 99 - 43 + 69;
        U.lllIIIlIl[28] = 98 + 89 - 67 + 60 ^ 18 + 31 - -4 + 111;
        U.lllIIIlIl[29] = 0xAD ^ 0xBC;
        U.lllIIIlIl[30] = 0xD7 ^ 0xC5;
        U.lllIIIlIl[31] = 0x71 ^ 0x62;
        U.lllIIIlIl[32] = 0xA9 ^ 0xBD;
        U.lllIIIlIl[33] = 0xE8 ^ 0xBA ^ (0x66 ^ 0x21);
        U.lllIIIlIl[34] = 0x28 ^ 0x3E;
        U.lllIIIlIl[35] = 0xCD ^ 0x8A ^ (0x28 ^ 0x78);
        U.lllIIIlIl[36] = 17 + 125 - 55 + 102 ^ 94 + 118 - 151 + 104;
        U.lllIIIlIl[37] = 38 + 92 - -17 + 31 ^ 91 + 137 - 173 + 116;
        U.lllIIIlIl[38] = 0xD1 ^ 0xAF ^ (0xA0 ^ 0xC4);
        U.lllIIIlIl[39] = 0xC4 ^ 0x88 ^ (0x62 ^ 0x35);
        U.lllIIIlIl[40] = 0xB0 ^ 0xAC;
        U.lllIIIlIl[41] = 0xB9 ^ 0xA4;
        U.lllIIIlIl[42] = 0x6A ^ 0x77 ^ 3;
        U.lllIIIlIl[43] = 0xFFFFEFB7 & 0x1C6B;
        U.lllIIIlIl[44] = 0xFFFFAFE7 & 0x5D3F;
        U.lllIIIlIl[45] = -(0xFFFFFADA & 0x2737) & (0xFFFFEF77 & 0x3FBF);
        U.lllIIIlIl[46] = 16 + 20 - -27 + 78 ^ 61 + 1 - 12 + 96;
        U.lllIIIlIl[47] = 0xF8 ^ 0xC7 ^ (0x8E ^ 0x91);
        U.lllIIIlIl[48] = 0x66 ^ 0x47;
        U.lllIIIlIl[49] = 0x2B ^ 9;
        U.lllIIIlIl[50] = 0x45 ^ 0x6D ^ (0x47 ^ 0x4C);
        U.lllIIIlIl[51] = 0x5C ^ 0x5A ^ (0xE0 ^ 0xC2);
        U.lllIIIlIl[52] = 125 + 23 - 101 + 111 ^ 36 + 181 - 61 + 31;
        U.lllIIIlIl[53] = 0x6B ^ 0x4D;
        U.lllIIIlIl[54] = 0xFFFFDFDF & 0x2C32;
        U.lllIIIlIl[55] = 0xFFFFED3F & 0x1FD9;
        U.lllIIIlIl[56] = 0x5D ^ 0x2F ^ (0x6D ^ 0x38);
        U.lllIIIlIl[57] = 0xE3 ^ 0xA5 ^ (0xE2 ^ 0x8C);
        U.lllIIIlIl[58] = 0x59 ^ 0x70;
        U.lllIIIlIl[59] = 0x2B ^ 0x61 ^ (0xE2 ^ 0x82);
        U.lllIIIlIl[60] = 0x2C ^ 0x60 ^ (0x26 ^ 0x41);
        U.lllIIIlIl[61] = 0xFFFFE6D2 & 0x3F3F;
        U.lllIIIlIl[62] = -(0xFFFFB7CC & 0x7AF7) & (0xFFFFFEEF & 0x3FFF);
        U.lllIIIlIl[63] = -(0xFFFFB6F3 & 0x59EE) & (0xFFFFFFFD & 0x36FB);
        U.lllIIIlIl[64] = -(0xFFFFD2F3 & 0x6F1E) & (0xFFFFDEFF & 0x6F37);
        U.lllIIIlIl[65] = 0xFFFFEE6B & 0x37B5;
        U.lllIIIlIl[66] = -(0xFFFFF9DF & 0x5FFB) & (0xFFFFFFFF & Short.MAX_VALUE);
        U.lllIIIlIl[67] = 0xFFFFBF7F & 0x4C99;
        U.lllIIIlIl[68] = 0xFFFFEF39 & 0x1CE7;
        U.lllIIIlIl[69] = 0xFFFFEF1E & 0x36FF;
        U.lllIIIlIl[70] = -(0xFFFFBB49 & 0x67FF) & (0xFFFFFF7F & 0x2FDF);
        U.lllIIIlIl[71] = 0xFFFFBEA7 & 0x677B;
        U.lllIIIlIl[72] = -(0xFFFFF1D7 & 0x3FAA) & (0xFFFFBDFF & 0x7F9D);
        U.lllIIIlIl[73] = 0xFFFFF67D & 0x2F93;
        U.lllIIIlIl[74] = 0xFFFFA6FD & 0x5FFE;
        U.lllIIIlIl[75] = -(0xFFFFA199 & 0x7F67) & (0xFFFFEFFF & 0x37FF);
        U.lllIIIlIl[76] = 0x79 ^ 0x55;
        U.lllIIIlIl[77] = 0x5B ^ 0x76;
        U.lllIIIlIl[78] = 0x52 ^ 0xA ^ (0x35 ^ 0x43);
        U.lllIIIlIl[79] = 0x1B ^ 0x34;
        U.lllIIIlIl[80] = -(0xFFFFDD5D & 0x7BA3) & (0xFFFFDFFD & Short.MAX_VALUE);
        U.lllIIIlIl[81] = 0x80 ^ 0xB0;
        U.lllIIIlIl[82] = 0x1F ^ 0x7F ^ (0x20 ^ 0x71);
        U.lllIIIlIl[83] = 0x63 ^ 0x7C ^ (5 ^ 0x29);
        U.lllIIIlIl[84] = 0xFFFFB61D & 0x6FFF;
        U.lllIIIlIl[85] = 0x12 ^ 0x26;
        U.lllIIIlIl[86] = 0xAA ^ 0x9F;
        U.lllIIIlIl[87] = 0x22 ^ 0x14;
        U.lllIIIlIl[88] = 0x5B ^ 0x3E ^ (0xF ^ 0x5D);
        U.lllIIIlIl[89] = 0x1B ^ 0x23;
        U.lllIIIlIl[90] = 0x9A ^ 0xA3;
        U.lllIIIlIl[91] = -(0xFFFF8B6F & 0x7CF1) & (0xFFFFBFFF & 0x6E7F);
        U.lllIIIlIl[92] = 0x22 ^ 0x1B ^ 3;
        U.lllIIIlIl[93] = 0x51 ^ 0x45 ^ (0x1F ^ 0x30);
        U.lllIIIlIl[94] = 0x1D ^ 0x21;
        U.lllIIIlIl[95] = 0x20 ^ 0x1D;
        U.lllIIIlIl[96] = 116 + 79 - 111 + 106 ^ 19 + 22 - -28 + 59;
        U.lllIIIlIl[97] = 0xEF ^ 0x8A ^ (0x65 ^ 0x3F);
        U.lllIIIlIl[98] = 0xE7 ^ 0xA7;
        U.lllIIIlIl[99] = 0x4C ^ 0xD;
        U.lllIIIlIl[100] = 0 ^ 0x54 ^ (0xB5 ^ 0xA3);
        U.lllIIIlIl[101] = 0xCE ^ 0x8D;
        U.lllIIIlIl[102] = 0xC4 ^ 0x80;
        U.lllIIIlIl[103] = 0xFFFFA7C1 & 0x5F3E;
        U.lllIIIlIl[104] = -(0xFFFFB777 & 0x79AA) & (0xFFFFFFBF & 0x3D7F);
        U.lllIIIlIl[105] = 0x44 ^ 1;
        U.lllIIIlIl[106] = 0x78 ^ 0x39 ^ (0x3F ^ 0x38);
        U.lllIIIlIl[107] = 9 ^ 0x27 ^ (0x43 ^ 0x2A);
        U.lllIIIlIl[108] = -(0xFFFFABDF & 0x76E1) & (0xFFFFEEFF & 0x3FDD);
        U.lllIIIlIl[109] = 0xFFFFA736 & 0x7EE9;
        U.lllIIIlIl[110] = 0x6F ^ 0x6B ^ (0x72 ^ 0x3E);
        U.lllIIIlIl[111] = 0x3C ^ 0x75;
        U.lllIIIlIl[112] = 127 + 55 - 23 + 71 ^ 121 + 120 - 117 + 48;
        U.lllIIIlIl[113] = -(0xFFFFDF5E & 0x38F7) & (0xFFFFBF77 & 0x7EFF);
        U.lllIIIlIl[114] = 0x31 ^ 0x7A;
        U.lllIIIlIl[115] = 0xC0 ^ 0x8C;
        U.lllIIIlIl[116] = 0xE ^ 0x58 ^ (0xA9 ^ 0xB2);
        U.lllIIIlIl[117] = 0x9C ^ 0xB3 ^ (0xFF ^ 0x9E);
        U.lllIIIlIl[118] = 0x4A ^ 0x1A ^ (0x82 ^ 0x9D);
        U.lllIIIlIl[119] = 0xFD ^ 0xAD;
        U.lllIIIlIl[120] = 0xD4 ^ 0x85;
        U.lllIIIlIl[121] = -(0xFFFFFBF7 & 0x5C8F) & (0xFFFFDFBF & 0x7FC7);
        U.lllIIIlIl[122] = 0x46 ^ 0x67 ^ (0x6D ^ 0x1E);
        U.lllIIIlIl[123] = 2 ^ 0x51;
        U.lllIIIlIl[124] = 73 + 102 - 53 + 22 ^ 117 + 20 - -24 + 35;
        U.lllIIIlIl[125] = 0xFF ^ 0xC4 ^ (0x52 ^ 0x3C);
        U.lllIIIlIl[126] = -(0xFFFFF9BA & 0x7647) & (0xFFFFF7FF & 0x7EFF);
        U.lllIIIlIl[127] = 0xFFFFAD5B & 0x5EBF;
        U.lllIIIlIl[128] = 0xF9 ^ 0xAF;
        U.lllIIIlIl[129] = 0x48 ^ 0x1F;
        U.lllIIIlIl[130] = 0x24 ^ 0x7C;
        U.lllIIIlIl[131] = -(0xFFFFFFCF & 0x11FD) & (0xFFFFDFFF & 0x3DEC);
        U.lllIIIlIl[132] = 0xF8 ^ 0xAA ^ (0x8B ^ 0x80);
        U.lllIIIlIl[133] = 0x67 ^ 0x4F ^ (0x5C ^ 0x2E);
        U.lllIIIlIl[134] = 0x2A ^ 0x71;
        U.lllIIIlIl[135] = 3 ^ (0xF8 ^ 0xA7);
        U.lllIIIlIl[136] = 0x50 ^ 0xD;
        U.lllIIIlIl[137] = 27 + 126 - 33 + 118 ^ 153 + 26 - 94 + 91;
        U.lllIIIlIl[138] = 0xFFFFDCFE & 0x2F23;
        U.lllIIIlIl[139] = 0x7F ^ 0x20;
        U.lllIIIlIl[140] = 0x62 ^ 0x22 ^ (0x1B ^ 0x3B);
        U.lllIIIlIl[141] = 191 + 143 - 234 + 118 ^ 143 + 39 - 177 + 182;
        U.lllIIIlIl[142] = 185 + 174 - 336 + 177 ^ 135 + 37 - 122 + 120;
        U.lllIIIlIl[143] = 0xF9 ^ 0x9A;
        U.lllIIIlIl[144] = 3 ^ 0x67;
        U.lllIIIlIl[145] = 0x99 ^ 0x9E ^ (0x5F ^ 0x3D);
        U.lllIIIlIl[146] = 0x54 ^ 0x48 ^ (0x61 ^ 0x1B);
        U.lllIIIlIl[147] = 0x45 ^ 0x22;
        U.lllIIIlIl[148] = 0xFB ^ 0x93;
        U.lllIIIlIl[149] = 0x48 ^ 0x21;
        U.lllIIIlIl[150] = 148 + 98 - 105 + 27 ^ 94 + 154 - 231 + 177;
        U.lllIIIlIl[151] = 0x5D ^ 0x36;
        U.lllIIIlIl[152] = -(0xFFFFB1F6 & 0x5F9B) & (0xFFFFBFFD & 0x77B7);
        U.lllIIIlIl[153] = 207 + 214 - 354 + 169 ^ 11 + 56 - -58 + 3;
        U.lllIIIlIl[154] = 0xE7 ^ 0x8A;
        U.lllIIIlIl[155] = 0x3A ^ 0x54;
        U.lllIIIlIl[156] = 0x55 ^ 0x3A;
        U.lllIIIlIl[157] = 139 + 84 - 119 + 41;
        U.lllIIIlIl[158] = 0x45 ^ 0x28 ^ (0x18 ^ 5);
        U.lllIIIlIl[159] = (0x98 ^ 0x90) + (97 + 107 - 126 + 59) - (0xBE ^ 0x9A) + (0x57 ^ 0x77);
        U.lllIIIlIl[160] = 0x75 ^ 4;
        U.lllIIIlIl[161] = 0xFFFFAC7F & 0x5F91;
        U.lllIIIlIl[162] = -(0xFFFFF967 & 0x4EFB) & (0xFFFFEFFB & 0x7E7F);
        U.lllIIIlIl[163] = 0xDF ^ 0x88 ^ (2 ^ 0x27);
        U.lllIIIlIl[164] = 0xB6 ^ 0xC5;
        U.lllIIIlIl[165] = 0xA5 ^ 0xBB ^ (0xC5 ^ 0xAF);
        U.lllIIIlIl[166] = 0xCB ^ 0xB8 ^ (0x59 ^ 0x5F);
        U.lllIIIlIl[167] = 0xD6 ^ 0xA0;
        U.lllIIIlIl[168] = 0x7D ^ 0x70 ^ (0xC3 ^ 0xB9);
        U.lllIIIlIl[169] = 0x3D ^ 0x27 ^ (0xD0 ^ 0xB2);
        U.lllIIIlIl[170] = 0x8D ^ 0x90 ^ (0xE6 ^ 0x82);
        U.lllIIIlIl[171] = 0x7D ^ 7;
        U.lllIIIlIl[172] = 0x1A ^ 0x61;
        U.lllIIIlIl[173] = 0x6C ^ 0x10;
        U.lllIIIlIl[174] = 5 ^ 0x78;
        U.lllIIIlIl[175] = -(0xFFFFDAC4 & 0x35BF) & (0xFFFFB587 & 0x7EFF);
        U.lllIIIlIl[176] = 0xFFFFBEFF & 0x6FCC;
        U.lllIIIlIl[177] = -(0xFFFFDF53 & 0x3CFD) & (0xFFFFFFFF & 0x7DF8);
        U.lllIIIlIl[178] = 0xFFFFD97F & 0x27AC;
        U.lllIIIlIl[179] = -(0xFFFFD6EB & 0x79BF) & (0xFFFFF5FE & 0x5FBF);
        U.lllIIIlIl[180] = 69 + 8 - -6 + 169 ^ 106 + 108 - 210 + 126;
        U.lllIIIlIl[181] = (0x27 ^ 0x65) + (0x13 ^ 0x77) - (0x36 ^ 0x5F) + (1 ^ 0x43);
        U.lllIIIlIl[182] = 53 + 19 - -21 + 35;
        U.lllIIIlIl[183] = (0x17 ^ 0x2C) + (0xA2 ^ 0x92) - (0xFA ^ 0xA7) + (0x7D ^ 0xE);
        U.lllIIIlIl[184] = -(0xFFFFDA4F & 0x77F1) & (0xFFFFFF6D & 0x5FF7);
        U.lllIIIlIl[185] = 48 + 43 - 54 + 93;
        U.lllIIIlIl[186] = (0x56 ^ 0x42) + (8 ^ 0x7E) - (0xE ^ 0x3F) + (0x44 ^ 0x6E);
        U.lllIIIlIl[187] = 0xFFFFDF9D & 0x2D63;
        U.lllIIIlIl[188] = -(0xFFFFF56B & 0x3AB5) & (0xFFFFFDBF & 0x3E6F);
        U.lllIIIlIl[189] = -(0 + 78 - 53 + 123) & (0xFFFFEDFF & 0x1FB3);
        U.lllIIIlIl[190] = -(0xFFFF97A7 & 0x6A7B) & (0xFFFFCF2B & 0x3FFE);
        U.lllIIIlIl[191] = -(0xFFFFDEFF & 0x3169) & (0xFFFFFD7F & 0x1EFE);
        U.lllIIIlIl[192] = -(0xD3 ^ 0xB2) & (0xFFFFCFFF & 0x3D7F);
        U.lllIIIlIl[193] = 11 + 89 - 55 + 87;
        U.lllIIIlIl[194] = 79 + 98 - 151 + 107;
        U.lllIIIlIl[195] = (0xE5 ^ 0xA4) + (0x8E ^ 0x80) - (0x55 ^ 0x15) + (0x41 ^ 0x36);
        U.lllIIIlIl[196] = 0xFFFFFFEF & 0x261F;
        U.lllIIIlIl[197] = 21 + 114 - 20 + 20;
    }

    private static String lIllllllIllI(String llllIllIlIIII, String llllIllIlIIIl) {
        try {
            SecretKeySpec llllIllIlIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllIllIlIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllIllIlIlII = Cipher.getInstance("Blowfish");
            llllIllIlIlII.init(lllIIIlIl[3], llllIllIlIlIl);
            return new String(llllIllIlIlII.doFinal(Base64.getDecoder().decode(llllIllIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllIllIlIIll) {
            llllIllIlIIll.printStackTrace();
            return null;
        }
    }

    @Override
    public int af() {
        try {
            U.de();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (2 > (0x42 ^ 0x46)) {
            return (0x50 ^ 0x6F) & ~(0xBF ^ 0x80);
        }
        return lllIIIlIl[144];
    }

    @Override
    public String ag() {
        return lllIIIlII[lllIIIlIl[180]];
    }

    static boolean df() {
        int n2;
        if (U.lIlllllllllI(Vars.getBit((int)lllIIIlIl[74])) && U.lIlllllllllI(Vars.getBit((int)lllIIIlIl[80])) && U.llIIIIIIIlII(Vars.getBit((int)lllIIIlIl[75]), lllIIIlIl[0]) && U.lIlllllllllI(Vars.getBit((int)lllIIIlIl[103])) && U.llIIIIIIIlII(Vars.getBit((int)lllIIIlIl[121]), lllIIIlIl[0]) && U.llIIIIIIIlII(Vars.getBit((int)lllIIIlIl[126]), lllIIIlIl[0])) {
            n2 = lllIIIlIl[0];
            0;
            if (-(0xF7 ^ 0x9A ^ (0x29 ^ 0x40)) >= 0) {
                return ((38 + 112 - 69 + 100 ^ 44 + 51 - 54 + 143) & (67 + 141 - 204 + 166 ^ 71 + 117 - 75 + 54 ^ -1)) != 0;
            }
        } else {
            n2 = lllIIIlIl[1];
        }
        return n2 != 0;
    }

    private static boolean llIIIIIIIIIl(int n2) {
        return n2 < 0;
    }

    private static void lIlllllllIIl() {
        lllIIIlII = new String[lllIIIlIl[197]];
        U.lllIIIlII[U.lllIIIlIl[1]] = U."Finished buying items, switching back to quest";
        U.lllIIIlII[U.lllIIIlIl[0]] = U."Nav to bank";
        U.lllIIIlII[U.lllIIIlIl[3]] = U."Handling banking";
        U.lllIIIlII[U.lllIIIlIl[8]] = U."We are missing quest supplies, switching to BUYING";
        U.lllIIIlII[U.lllIIIlIl[4]] = U."Drink";
        U.lllIIIlII[U.lllIIIlIl[14]] = U."Eat";
        U.lllIIIlII[U.lllIIIlIl[17]] = U."Nav to start";
        U.lllIIIlII[U.lllIIIlIl[18]] = U."Start quest";
        U.lllIIIlII[U.lllIIIlIl[16]] = U."Veronica";
        U.lllIIIlII[U.lllIIIlIl[20]] = U."Key";
        U.lllIIIlII[U.lllIIIlIl[10]] = U."Nav to fish food";
        U.lllIIIlII[U.lllIIIlIl[23]] = U."Can't reach, navigating";
        U.lllIIIlII[U.lllIIIlIl[24]] = U."Taking food";
        U.lllIIIlII[U.lllIIIlIl[25]] = U."Take";
        U.lllIIIlII[U.lllIIIlIl[26]] = U."Making poison fish food";
        U.lllIIIlII[U.lllIIIlIl[27]] = U."Key";
        U.lllIIIlII[U.lllIIIlIl[28]] = U."Nav to compost";
        U.lllIIIlII[U.lllIIIlIl[29]] = U."Digging";
        U.lllIIIlII[U.lllIIIlIl[30]] = U."Compost heap";
        U.lllIIIlII[U.lllIIIlIl[31]] = U."Search";
        U.lllIIIlII[U.lllIIIlIl[32]] = U."Key";
        U.lllIIIlII[U.lllIIIlIl[33]] = U."Nav to fountain";
        U.lllIIIlII[U.lllIIIlIl[34]] = U."Fountain";
        U.lllIIIlII[U.lllIIIlIl[35]] = U."Key";
        U.lllIIIlII[U.lllIIIlIl[36]] = U."Pressure gauge";
        U.lllIIIlII[U.lllIIIlIl[37]] = U."Getting guage";
        U.lllIIIlII[U.lllIIIlIl[38]] = U."Fountain";
        U.lllIIIlII[U.lllIIIlIl[39]] = U."Search";
        U.lllIIIlII[U.lllIIIlIl[40]] = U."Key";
        U.lllIIIlII[U.lllIIIlIl[41]] = U."Pressure gauge";
        U.lllIIIlII[U.lllIIIlIl[42]] = U."Rubber tube";
        U.lllIIIlII[U.lllIIIlIl[46]] = U."Nav to door";
        U.lllIIIlII[U.lllIIIlIl[47]] = U."Door";
        U.lllIIIlII[U.lllIIIlIl[48]] = U."Open";
        U.lllIIIlII[U.lllIIIlIl[49]] = U."Get tube";
        U.lllIIIlII[U.lllIIIlIl[50]] = U."Rubber tube";
        U.lllIIIlII[U.lllIIIlIl[51]] = U."Take";
        U.lllIIIlII[U.lllIIIlIl[52]] = U."Rubber tube";
        U.lllIIIlII[U.lllIIIlIl[53]] = U."Oil can";
        U.lllIIIlII[U.lllIIIlIl[56]] = U."Door";
        U.lllIIIlII[U.lllIIIlIl[57]] = U."Open";
        U.lllIIIlII[U.lllIIIlIl[58]] = U."Nav to final room";
        U.lllIIIlII[U.lllIIIlIl[59]] = U."Ladder";
        U.lllIIIlII[U.lllIIIlIl[60]] = U."Climb-down";
        U.lllIIIlII[U.lllIIIlIl[76]] = U."Nav to a";
        U.lllIIIlII[U.lllIIIlIl[77]] = U."Pull lever";
        U.lllIIIlII[U.lllIIIlIl[78]] = U."Lever A";
        U.lllIIIlII[U.lllIIIlIl[79]] = U."Pull";
        U.lllIIIlII[U.lllIIIlIl[81]] = U."Nav to b";
        U.lllIIIlII[U.lllIIIlIl[82]] = U."Pull lever";
        U.lllIIIlII[U.lllIIIlIl[15]] = U."Lever B";
        U.lllIIIlII[U.lllIIIlIl[83]] = U."Pull";
        U.lllIIIlII[U.lllIIIlIl[85]] = U."Nav to d";
        U.lllIIIlII[U.lllIIIlIl[86]] = U."Door";
        U.lllIIIlII[U.lllIIIlIl[87]] = U."Open";
        U.lllIIIlII[U.lllIIIlIl[88]] = U."Pull lever";
        U.lllIIIlII[U.lllIIIlIl[89]] = U."Lever D";
        U.lllIIIlII[U.lllIIIlIl[90]] = U."Pull";
        U.lllIIIlII[U.lllIIIlIl[92]] = U."Move to door";
        U.lllIIIlII[U.lllIIIlIl[93]] = U."Door";
        U.lllIIIlII[U.lllIIIlIl[94]] = U."Open";
        U.lllIIIlII[U.lllIIIlIl[95]] = U."Nav to b";
        U.lllIIIlII[U.lllIIIlIl[96]] = U."Pull lever";
        U.lllIIIlII[U.lllIIIlIl[97]] = U."Lever B";
        U.lllIIIlII[U.lllIIIlIl[98]] = U."Pull";
        U.lllIIIlII[U.lllIIIlIl[99]] = U."Nav to a";
        U.lllIIIlII[U.lllIIIlIl[100]] = U."Pull lever";
        U.lllIIIlII[U.lllIIIlIl[101]] = U."Lever A";
        U.lllIIIlII[U.lllIIIlIl[102]] = U."Pull";
        U.lllIIIlII[U.lllIIIlIl[105]] = U."Move to door";
        U.lllIIIlII[U.lllIIIlIl[106]] = U."Door";
        U.lllIIIlII[U.lllIIIlIl[107]] = U."Open";
        U.lllIIIlII[U.lllIIIlIl[110]] = U."Move to door";
        U.lllIIIlII[U.lllIIIlIl[111]] = U."Door";
        U.lllIIIlII[U.lllIIIlIl[112]] = U."Open";
        U.lllIIIlII[U.lllIIIlIl[114]] = U."Move to door";
        U.lllIIIlII[U.lllIIIlIl[115]] = U."Door";
        U.lllIIIlII[U.lllIIIlIl[116]] = U."Open";
        U.lllIIIlII[U.lllIIIlIl[117]] = U."Nav to e";
        U.lllIIIlII[U.lllIIIlIl[118]] = U."Pull lever";
        U.lllIIIlII[U.lllIIIlIl[119]] = U."Lever E";
        U.lllIIIlII[U.lllIIIlIl[120]] = U."Pull";
        U.lllIIIlII[U.lllIIIlIl[122]] = U."Nav to f";
        U.lllIIIlII[U.lllIIIlIl[123]] = U."Pull lever";
        U.lllIIIlII[U.lllIIIlIl[124]] = U."Lever F";
        U.lllIIIlII[U.lllIIIlIl[125]] = U."Pull";
        U.lllIIIlII[U.lllIIIlIl[128]] = U."Move to door";
        U.lllIIIlII[U.lllIIIlIl[129]] = U."Door";
        U.lllIIIlII[U.lllIIIlIl[130]] = U."Open";
        U.lllIIIlII[U.lllIIIlIl[132]] = U."Move to door";
        U.lllIIIlII[U.lllIIIlIl[133]] = U."Door";
        U.lllIIIlII[U.lllIIIlIl[134]] = U."Open";
        U.lllIIIlII[U.lllIIIlIl[135]] = U."Pull lever";
        U.lllIIIlII[U.lllIIIlIl[136]] = U."Lever C";
        U.lllIIIlII[U.lllIIIlIl[137]] = U."Pull";
        U.lllIIIlII[U.lllIIIlIl[139]] = U."Move to door";
        U.lllIIIlII[U.lllIIIlIl[140]] = U."Door";
        U.lllIIIlII[U.lllIIIlIl[141]] = U."Open";
        U.lllIIIlII[U.lllIIIlIl[142]] = U."Move to door";
        U.lllIIIlII[U.lllIIIlIl[143]] = U."Door";
        U.lllIIIlII[U.lllIIIlIl[144]] = U."Open";
        U.lllIIIlII[U.lllIIIlIl[145]] = U."Nav to e";
        U.lllIIIlII[U.lllIIIlIl[146]] = U."Pull lever";
        U.lllIIIlII[U.lllIIIlIl[147]] = U."Lever E";
        U.lllIIIlII[U.lllIIIlIl[148]] = U."Pull";
        U.lllIIIlII[U.lllIIIlIl[149]] = U."Move to door";
        U.lllIIIlII[U.lllIIIlIl[150]] = U."Door";
        U.lllIIIlII[U.lllIIIlIl[151]] = U."Open";
        U.lllIIIlII[U.lllIIIlIl[153]] = U."Move to door";
        U.lllIIIlII[U.lllIIIlIl[154]] = U."Door";
        U.lllIIIlII[U.lllIIIlIl[155]] = U."Open";
        U.lllIIIlII[U.lllIIIlIl[156]] = U."Opening 145";
        U.lllIIIlII[U.lllIIIlIl[158]] = U."Open";
        U.lllIIIlII[U.lllIIIlIl[160]] = U."Open";
        U.lllIIIlII[U.lllIIIlIl[163]] = U."Oil can";
        U.lllIIIlII[U.lllIIIlIl[164]] = U."Oil can";
        U.lllIIIlII[U.lllIIIlIl[165]] = U."Take";
        U.lllIIIlII[U.lllIIIlIl[166]] = U."Rubber tube";
        U.lllIIIlII[U.lllIIIlIl[167]] = U."Oil can";
        U.lllIIIlII[U.lllIIIlIl[168]] = U."Open";
        U.lllIIIlII[U.lllIIIlIl[169]] = U."Nav to professor";
        U.lllIIIlII[U.lllIIIlIl[170]] = U."Open";
        U.lllIIIlII[U.lllIIIlIl[171]] = U."Professor Oddenstein";
        U.lllIIIlII[U.lllIIIlIl[172]] = U."Nav to professor";
        U.lllIIIlII[U.lllIIIlIl[173]] = U."Open";
        U.lllIIIlII[U.lllIIIlIl[174]] = U."Professor Oddenstein";
        U.lllIIIlII[U.lllIIIlIl[180]] = U."Ernest the Chicken";
        U.lllIIIlII[U.lllIIIlIl[181]] = U."ring of wealth (";
        U.lllIIIlII[U.lllIIIlIl[182]] = U."Door";
        U.lllIIIlII[U.lllIIIlIl[183]] = U."Open";
        U.lllIIIlII[U.lllIIIlIl[185]] = U."Door";
        U.lllIIIlII[U.lllIIIlIl[186]] = U."Open";
        U.lllIIIlII[U.lllIIIlIl[193]] = U."Yes.";
        U.lllIIIlII[U.lllIIIlIl[194]] = U."I'm looking for a guy called Ernest.";
        U.lllIIIlII[U.lllIIIlIl[195]] = U."I'm glad Veronica didn't actually get engaged to a chicken.";
    }

    private static boolean llIIIIIIIlII(int n2, int n3) {
        return n2 == n3;
    }

    private static int lIlllllllIll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    @Override
    public boolean ae() {
        return lllIIIlIl[1];
    }

    private static boolean llIIIIIIIlIl(int n2, int n3) {
        return n2 != n3;
    }

    public static void de() {
        block134: {
            BankLocation llllIllllIlIl;
            block135: {
                WorldArea llllIllllIIll;
                TileItem llllIllllIlII;
                block137: {
                    block136: {
                        if (U.lIllllllllII(bv ? 1 : 0)) {
                            b.a(bx);
                            if (U.lIllllllllIl(bx.size(), lllIIIlIl[0])) {
                                System.out.println(lllIIIlII[lllIIIlIl[1]]);
                                bv = lllIIIlIl[1];
                            }
                        }
                        if (!U.lIlllllllllI(bv ? 1 : 0)) break block134;
                        if (U.lIlllllllllI(U.an() ? 1 : 0) && U.lIllllllllIl(e.j(ln), lllIIIlIl[0])) {
                            llllIllllIlIl = BankLocation.getNearest();
                            if (U.lIllllllllll(llllIllllIlIl) && U.lIlllllllllI(llllIllllIlIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderGWD.c = lllIIIlII[lllIIIlIl[0]];
                                a.a(llllIllllIlIl);
                            }
                            if (U.lIllllllllll(llllIllllIlIl) && U.lIllllllllII(llllIllllIlIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                if (U.lIlllllllllI(Bank.isOpen() ? 1 : 0)) {
                                    a.a();
                                    Time.sleepUntil(() -> Bank.isOpen(), (int)lllIIIlIl[2]);
                                    0;
                                }
                                if (U.lIllllllllII(Bank.isOpen() ? 1 : 0)) {
                                    AccBuilderGWD.c = lllIIIlII[lllIIIlIl[3]];
                                    if (U.llIIIIIIIIII(Inventory.getAll().size())) {
                                        Bank.depositInventory();
                                        Time.sleepTicks((int)lllIIIlIl[4]);
                                        0;
                                    }
                                    if (U.llIIIIIIIIII(Equipment.getAll().size())) {
                                        Bank.depositEquipment();
                                        Time.sleepTicks((int)lllIIIlIl[3]);
                                        0;
                                    }
                                    int[] nArray = new int[lllIIIlIl[4]];
                                    nArray[U.lllIIIlIl[1]] = lllIIIlIl[5];
                                    nArray[U.lllIIIlIl[0]] = lllIIIlIl[6];
                                    nArray[U.lllIIIlIl[3]] = lllIIIlIl[7];
                                    nArray[U.lllIIIlIl[8]] = lllIIIlIl[9];
                                    if (U.lIlllllllllI(e.d(nArray) ? 1 : 0)) {
                                        U.Q();
                                        System.out.println(lllIIIlII[lllIIIlIl[8]]);
                                        bv = lllIIIlIl[0];
                                        return;
                                    }
                                    int[] nArray2 = new int[lllIIIlIl[4]];
                                    nArray2[U.lllIIIlIl[1]] = lllIIIlIl[5];
                                    nArray2[U.lllIIIlIl[0]] = lllIIIlIl[6];
                                    nArray2[U.lllIIIlIl[3]] = lllIIIlIl[7];
                                    nArray2[U.lllIIIlIl[8]] = lllIIIlIl[9];
                                    if (U.lIllllllllII(e.d(nArray2) ? 1 : 0)) {
                                        a.a(lllIIIlIl[5], lllIIIlIl[10]);
                                        a.a(lllIIIlIl[6], lllIIIlIl[10]);
                                        a.a(lllIIIlIl[7], lllIIIlIl[0]);
                                        a.a(lllIIIlIl[11], lllIIIlIl[0]);
                                        a.a(lllIIIlIl[9], lllIIIlIl[0]);
                                        a.a(lllIIIlIl[12], lllIIIlIl[0]);
                                        a.a(lllIIIlIl[13], lllIIIlIl[14]);
                                    }
                                }
                            }
                        }
                        if (U.lIllllllllII(Inventory.contains((int[])f.bc) ? 1 : 0) && U.lIllllllllIl(Movement.getRunEnergy(), lllIIIlIl[15])) {
                            Inventory.getFirst((int[])f.bc).interact(lllIIIlII[lllIIIlIl[4]]);
                            Time.sleepTicks((int)lllIIIlIl[0]);
                            0;
                        }
                        int[] nArray = new int[lllIIIlIl[0]];
                        nArray[U.lllIIIlIl[1]] = lllIIIlIl[13];
                        if (U.lIllllllllII(Inventory.contains((int[])nArray) ? 1 : 0) && U.llIIIIIIIIIl(U.lIlllllllIll(e.w(), 50.0))) {
                            int[] nArray3 = new int[lllIIIlIl[0]];
                            nArray3[U.lllIIIlIl[1]] = lllIIIlIl[13];
                            Inventory.getFirst((int[])nArray3).interact(lllIIIlII[lllIIIlIl[14]]);
                            Time.sleepTicks((int)lllIIIlIl[3]);
                            0;
                        }
                        if (U.lIllllllllII(U.an() ? 1 : 0) && U.lIlllllllllI(e.j(ln))) {
                            if (U.llIIIIIIIIlI(Players.getLocal().getWorldLocation().distanceTo(dg), lllIIIlIl[16])) {
                                AccBuilderGWD.c = lllIIIlII[lllIIIlIl[17]];
                                Movement.walkTo((WorldPoint)dg);
                                0;
                                Time.sleepTicks((int)lllIIIlIl[0]);
                                0;
                            }
                            if (U.llIIIIIIIIll(Players.getLocal().getWorldLocation().distanceTo(dg), lllIIIlIl[16])) {
                                AccBuilderGWD.c = lllIIIlII[lllIIIlIl[18]];
                                if (U.lIllllllllII(Dialog.isOpen() ? 1 : 0)) {
                                    Dialog.close();
                                }
                                g.a(lllIIIlII[lllIIIlIl[16]], cG);
                            }
                        }
                        if (!U.llIIIIIIIlII(e.j(ln), lllIIIlIl[0])) break block135;
                        dk = lllIIIlIl[1];
                        int[] nArray4 = new int[lllIIIlIl[0]];
                        nArray4[U.lllIIIlIl[1]] = lllIIIlIl[11];
                        if (U.lIlllllllllI(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                            int[] nArray5 = new int[lllIIIlIl[0]];
                            nArray5[U.lllIIIlIl[1]] = lllIIIlIl[19];
                            if (U.lIlllllllllI(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                                String[] stringArray = new String[lllIIIlIl[0]];
                                stringArray[U.lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[20]];
                                if (U.lIlllllllllI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                    llllIllllIlIl = new WorldPoint(lllIIIlIl[21], lllIIIlIl[22], lllIIIlIl[0]);
                                    int[] nArray6 = new int[lllIIIlIl[0]];
                                    nArray6[U.lllIIIlIl[1]] = lllIIIlIl[11];
                                    if (U.lIlllllllllI(Inventory.contains((int[])nArray6) ? 1 : 0)) {
                                        if (U.llIIIIIIIIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllllIlIl), lllIIIlIl[14])) {
                                            AccBuilderGWD.c = lllIIIlII[lllIIIlIl[10]];
                                            Movement.walkTo((WorldPoint)llllIllllIlIl);
                                            0;
                                            Time.sleepTicks((int)lllIIIlIl[0]);
                                            0;
                                        }
                                        if (U.llIIIIIIIIll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllllIlIl), lllIIIlIl[14])) {
                                            int[] nArray7 = new int[lllIIIlIl[0]];
                                            nArray7[U.lllIIIlIl[1]] = lllIIIlIl[11];
                                            llllIllllIlII = TileItems.getNearest((int[])nArray7);
                                            if (U.lIllllllllll(llllIllllIlII)) {
                                                if (U.lIlllllllllI(Reachable.isInteractable((Locatable)llllIllllIlII) ? 1 : 0)) {
                                                    AccBuilderGWD.c = lllIIIlII[lllIIIlIl[23]];
                                                    Movement.walkTo((WorldPoint)llllIllllIlII.getWorldLocation());
                                                    0;
                                                    Time.sleepTicks((int)lllIIIlIl[0]);
                                                    0;
                                                }
                                                if (U.lIllllllllII(Reachable.isInteractable((Locatable)llllIllllIlII) ? 1 : 0)) {
                                                    AccBuilderGWD.c = lllIIIlII[lllIIIlIl[24]];
                                                    llllIllllIlII.interact(lllIIIlII[lllIIIlIl[25]]);
                                                    Time.sleepTicks((int)lllIIIlIl[8]);
                                                    0;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        int[] nArray8 = new int[lllIIIlIl[0]];
                        nArray8[U.lllIIIlIl[1]] = lllIIIlIl[11];
                        if (!U.lIlllllllllI(Inventory.contains((int[])nArray8) ? 1 : 0)) break block136;
                        int[] nArray9 = new int[lllIIIlIl[0]];
                        nArray9[U.lllIIIlIl[1]] = lllIIIlIl[19];
                        if (!U.lIllllllllII(Inventory.contains((int[])nArray9) ? 1 : 0)) break block137;
                    }
                    int[] nArray = new int[lllIIIlIl[0]];
                    nArray[U.lllIIIlIl[1]] = lllIIIlIl[19];
                    if (U.lIlllllllllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray10 = new int[lllIIIlIl[0]];
                        nArray10[U.lllIIIlIl[1]] = lllIIIlIl[11];
                        if (U.lIllllllllII(Inventory.contains((int[])nArray10) ? 1 : 0)) {
                            AccBuilderGWD.c = lllIIIlII[lllIIIlIl[26]];
                            int[] nArray11 = new int[lllIIIlIl[0]];
                            nArray11[U.lllIIIlIl[1]] = lllIIIlIl[11];
                            int[] nArray12 = new int[lllIIIlIl[0]];
                            nArray12[U.lllIIIlIl[1]] = lllIIIlIl[9];
                            Inventory.getFirst((int[])nArray11).useOn(Inventory.getFirst((int[])nArray12));
                            Time.sleepTicks((int)lllIIIlIl[0]);
                            0;
                        }
                    }
                    int[] nArray13 = new int[lllIIIlIl[0]];
                    nArray13[U.lllIIIlIl[1]] = lllIIIlIl[19];
                    if (U.lIllllllllII(Inventory.contains((int[])nArray13) ? 1 : 0)) {
                        String[] stringArray = new String[lllIIIlIl[0]];
                        stringArray[U.lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[27]];
                        if (U.lIlllllllllI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                            if (U.llIIIIIIIIlI(Players.getLocal().getWorldLocation().distanceTo(lj), lllIIIlIl[4])) {
                                AccBuilderGWD.c = lllIIIlII[lllIIIlIl[28]];
                                Movement.walkTo((WorldPoint)lj);
                                0;
                                Time.sleepTicks((int)lllIIIlIl[0]);
                                0;
                            }
                            if (U.llIIIIIIIIll(Players.getLocal().getWorldLocation().distanceTo(lj), lllIIIlIl[4])) {
                                AccBuilderGWD.c = lllIIIlII[lllIIIlIl[29]];
                                String[] stringArray2 = new String[lllIIIlIl[0]];
                                stringArray2[U.lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[30]];
                                TileObjects.getNearest((String[])stringArray2).interact(lllIIIlII[lllIIIlIl[31]]);
                                Time.sleepTicks((int)lllIIIlIl[20]);
                                0;
                            }
                        }
                        String[] stringArray3 = new String[lllIIIlIl[0]];
                        stringArray3[U.lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[32]];
                        if (U.lIllllllllII(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                            if (U.llIIIIIIIIlI(Players.getLocal().getWorldLocation().distanceTo(lk), lllIIIlIl[8])) {
                                AccBuilderGWD.c = lllIIIlII[lllIIIlIl[33]];
                                Movement.walkTo((WorldPoint)lk);
                                0;
                                Time.sleepTicks((int)lllIIIlIl[0]);
                                0;
                            }
                            if (U.llIIIIIIIIll(Players.getLocal().getWorldLocation().distanceTo(lk), lllIIIlIl[8])) {
                                int[] nArray14 = new int[lllIIIlIl[0]];
                                nArray14[U.lllIIIlIl[1]] = lllIIIlIl[19];
                                String[] stringArray4 = new String[lllIIIlIl[0]];
                                stringArray4[U.lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[34]];
                                Inventory.getFirst((int[])nArray14).useOn(TileObjects.getNearest((String[])stringArray4));
                                Time.sleepTicks((int)lllIIIlIl[0]);
                                0;
                            }
                        }
                    }
                }
                String[] stringArray = new String[lllIIIlIl[0]];
                stringArray[U.lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[35]];
                if (U.lIllllllllII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    int[] nArray = new int[lllIIIlIl[0]];
                    nArray[U.lllIIIlIl[1]] = lllIIIlIl[19];
                    if (U.lIlllllllllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        String[] stringArray5 = new String[lllIIIlIl[0]];
                        stringArray5[U.lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[36]];
                        if (U.lIlllllllllI(Inventory.contains((String[])stringArray5) ? 1 : 0)) {
                            AccBuilderGWD.c = lllIIIlII[lllIIIlIl[37]];
                            if (U.lIlllllllllI(Dialog.isOpen() ? 1 : 0)) {
                                String[] stringArray6 = new String[lllIIIlIl[0]];
                                stringArray6[U.lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[38]];
                                TileObjects.getNearest((String[])stringArray6).interact(lllIIIlII[lllIIIlIl[39]]);
                                Time.sleepTicks((int)lllIIIlIl[4]);
                                0;
                            }
                            g.a(cG);
                        }
                    }
                }
                String[] stringArray7 = new String[lllIIIlIl[0]];
                stringArray7[U.lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[40]];
                if (U.lIllllllllII(Inventory.contains((String[])stringArray7) ? 1 : 0)) {
                    String[] stringArray8 = new String[lllIIIlIl[0]];
                    stringArray8[U.lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[41]];
                    if (U.lIllllllllII(Inventory.contains((String[])stringArray8) ? 1 : 0)) {
                        String[] stringArray9 = new String[lllIIIlIl[0]];
                        stringArray9[U.lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[42]];
                        if (U.lIlllllllllI(Inventory.contains((String[])stringArray9) ? 1 : 0)) {
                            llllIllllIlIl = new WorldPoint(lllIIIlIl[43], lllIIIlIl[44], lllIIIlIl[1]);
                            llllIllllIlII = new WorldPoint(lllIIIlIl[21], lllIIIlIl[44], lllIIIlIl[1]);
                            llllIllllIIll = new WorldArea(lllIIIlIl[21], lllIIIlIl[45], lllIIIlIl[14], lllIIIlIl[8], lllIIIlIl[1]);
                            if (U.lIlllllllllI(Players.getLocal().getWorldLocation().equals((Object)llllIllllIlIl) ? 1 : 0) && U.lIlllllllllI(Players.getLocal().getWorldLocation().equals((Object)llllIllllIlII) ? 1 : 0) && U.lIlllllllllI(llllIllllIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderGWD.c = lllIIIlII[lllIIIlIl[46]];
                                Movement.walkTo((WorldPoint)llllIllllIlIl);
                                0;
                                Time.sleepTicks((int)lllIIIlIl[0]);
                                0;
                            }
                            if (U.lIllllllllII(Players.getLocal().getWorldLocation().equals((Object)llllIllllIlIl) ? 1 : 0)) {
                                String[] stringArray10 = new String[lllIIIlIl[0]];
                                stringArray10[U.lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[47]];
                                TileObjects.getNearest((String[])stringArray10).interact(lllIIIlII[lllIIIlIl[48]]);
                                Time.sleepTicks((int)lllIIIlIl[3]);
                                0;
                            }
                            if (U.lIllllllllII(llllIllllIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderGWD.c = lllIIIlII[lllIIIlIl[49]];
                                String[] stringArray11 = new String[lllIIIlIl[0]];
                                stringArray11[U.lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[50]];
                                TileItems.getNearest((String[])stringArray11).interact(lllIIIlII[lllIIIlIl[51]]);
                                Time.sleepTicks((int)lllIIIlIl[8]);
                                0;
                            }
                        }
                    }
                }
                String[] stringArray12 = new String[lllIIIlIl[0]];
                stringArray12[U.lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[52]];
                if (U.lIllllllllII(Inventory.contains((String[])stringArray12) ? 1 : 0)) {
                    String[] stringArray13 = new String[lllIIIlIl[0]];
                    stringArray13[U.lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[53]];
                    if (U.lIlllllllllI(Inventory.contains((String[])stringArray13) ? 1 : 0)) {
                        llllIllllIlIl = new WorldArea(lllIIIlIl[21], lllIIIlIl[45], lllIIIlIl[14], lllIIIlIl[8], lllIIIlIl[1]);
                        llllIllllIlII = new WorldArea(lllIIIlIl[54], lllIIIlIl[55], lllIIIlIl[18], lllIIIlIl[23], lllIIIlIl[1]);
                        if (U.lIllllllllII(llllIllllIlIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] stringArray14 = new String[lllIIIlIl[0]];
                            stringArray14[U.lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[56]];
                            TileObjects.getNearest((String[])stringArray14).interact(lllIIIlII[lllIIIlIl[57]]);
                            Time.sleepTicks((int)lllIIIlIl[3]);
                            0;
                        }
                        if (U.lIlllllllllI(llllIllllIlII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && U.lIlllllllllI(lo.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderGWD.c = lllIIIlII[lllIIIlIl[58]];
                            Movement.walkTo((WorldPoint)ll);
                            0;
                            Time.sleepTicks((int)lllIIIlIl[0]);
                            0;
                        }
                        if (U.lIllllllllII(llllIllllIlII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] stringArray15 = new String[lllIIIlIl[0]];
                            stringArray15[U.lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[59]];
                            TileObjects.getNearest((String[])stringArray15).interact(lllIIIlII[lllIIIlIl[60]]);
                            Time.sleepTicks((int)lllIIIlIl[4]);
                            0;
                        }
                        if (U.lIllllllllII(lo.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            WorldPoint llllIlllIlIII;
                            WorldPoint llllIlllIlIIl;
                            WorldPoint llllIlllIlIlI;
                            llllIllllIIll = new WorldPoint(lllIIIlIl[21], lllIIIlIl[61], lllIIIlIl[1]);
                            WorldPoint llllIllllIIlI = new WorldPoint(lllIIIlIl[62], lllIIIlIl[63], lllIIIlIl[1]);
                            WorldPoint llllIllllIIIl = new WorldPoint(lllIIIlIl[64], lllIIIlIl[65], lllIIIlIl[1]);
                            WorldPoint llllIllllIIII = new WorldPoint(lllIIIlIl[43], lllIIIlIl[66], lllIIIlIl[1]);
                            WorldPoint llllIlllIllll = new WorldPoint(lllIIIlIl[67], lllIIIlIl[66], lllIIIlIl[1]);
                            WorldPoint llllIlllIlllI = new WorldPoint(lllIIIlIl[67], lllIIIlIl[66], lllIIIlIl[1]);
                            WorldArea llllIlllIllIl = new WorldArea(lllIIIlIl[68], lllIIIlIl[69], lllIIIlIl[20], lllIIIlIl[23], lllIIIlIl[1]);
                            WorldArea llllIlllIllII = new WorldArea(lllIIIlIl[70], lllIIIlIl[71], lllIIIlIl[14], lllIIIlIl[17], lllIIIlIl[1]);
                            WorldArea llllIlllIlIll = new WorldArea(lllIIIlIl[72], lllIIIlIl[73], lllIIIlIl[32], lllIIIlIl[25], lllIIIlIl[1]);
                            if (U.llIIIIIIIlIl(Vars.getBit((int)lllIIIlIl[74]), lllIIIlIl[0]) && U.lIlllllllllI(Vars.getBit((int)lllIIIlIl[75]))) {
                                if (U.lIlllllllllI(Players.getLocal().getWorldLocation().equals((Object)llllIllllIIll) ? 1 : 0)) {
                                    AccBuilderGWD.c = lllIIIlII[lllIIIlIl[76]];
                                    Movement.walkTo((WorldPoint)llllIllllIIll);
                                    0;
                                    Time.sleepTicks((int)lllIIIlIl[0]);
                                    0;
                                }
                                if (U.lIllllllllII(Players.getLocal().getWorldLocation().equals((Object)llllIllllIIll) ? 1 : 0)) {
                                    AccBuilderGWD.c = lllIIIlII[lllIIIlIl[77]];
                                    String[] stringArray16 = new String[lllIIIlIl[0]];
                                    stringArray16[U.lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[78]];
                                    TileObjects.getNearest((String[])stringArray16).interact(lllIIIlII[lllIIIlIl[79]]);
                                    Time.sleepTicks((int)lllIIIlIl[8]);
                                    0;
                                }
                            }
                            if (U.llIIIIIIIlII(Vars.getBit((int)lllIIIlIl[74]), lllIIIlIl[0]) && U.lIlllllllllI(Vars.getBit((int)lllIIIlIl[80])) && U.lIlllllllllI(Vars.getBit((int)lllIIIlIl[75]))) {
                                if (U.lIlllllllllI(Players.getLocal().getWorldLocation().equals((Object)llllIllllIIlI) ? 1 : 0)) {
                                    AccBuilderGWD.c = lllIIIlII[lllIIIlIl[81]];
                                    Movement.walkTo((WorldPoint)llllIllllIIlI);
                                    0;
                                    Time.sleepTicks((int)lllIIIlIl[0]);
                                    0;
                                }
                                if (U.lIllllllllII(Players.getLocal().getWorldLocation().equals((Object)llllIllllIIlI) ? 1 : 0)) {
                                    AccBuilderGWD.c = lllIIIlII[lllIIIlIl[82]];
                                    String[] stringArray17 = new String[lllIIIlIl[0]];
                                    stringArray17[U.lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[15]];
                                    TileObjects.getNearest((String[])stringArray17).interact(lllIIIlII[lllIIIlIl[83]]);
                                    Time.sleepTicks((int)lllIIIlIl[8]);
                                    0;
                                }
                            }
                            if (U.llIIIIIIIlII(Vars.getBit((int)lllIIIlIl[74]), lllIIIlIl[0]) && U.llIIIIIIIlII(Vars.getBit((int)lllIIIlIl[80]), lllIIIlIl[0]) && U.lIlllllllllI(Vars.getBit((int)lllIIIlIl[75]))) {
                                if (U.lIlllllllllI(llllIlllIllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    llllIlllIlIlI = new WorldPoint(lllIIIlIl[21], lllIIIlIl[84], lllIIIlIl[1]);
                                    if (U.lIlllllllllI(Players.getLocal().getWorldLocation().equals((Object)llllIlllIlIlI) ? 1 : 0)) {
                                        AccBuilderGWD.c = lllIIIlII[lllIIIlIl[85]];
                                        Movement.walkTo((WorldPoint)llllIlllIlIlI);
                                        0;
                                        Time.sleepTicks((int)lllIIIlIl[0]);
                                        0;
                                    }
                                    if (U.lIllllllllII(Players.getLocal().getWorldLocation().equals((Object)llllIlllIlIlI) ? 1 : 0)) {
                                        String[] stringArray18 = new String[lllIIIlIl[0]];
                                        stringArray18[U.lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[86]];
                                        TileObjects.getNearest((String[])stringArray18).interact(lllIIIlII[lllIIIlIl[87]]);
                                        Time.sleepTicks((int)lllIIIlIl[8]);
                                        0;
                                    }
                                }
                                if (U.lIllllllllII(llllIlllIllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderGWD.c = lllIIIlII[lllIIIlIl[88]];
                                    String[] stringArray19 = new String[lllIIIlIl[0]];
                                    stringArray19[U.lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[89]];
                                    TileObjects.getNearest((String[])stringArray19).interact(lllIIIlII[lllIIIlIl[90]]);
                                    Time.sleepTicks((int)lllIIIlIl[8]);
                                    0;
                                }
                            }
                            if (U.llIIIIIIIlII(Vars.getBit((int)lllIIIlIl[74]), lllIIIlIl[0]) && U.llIIIIIIIlII(Vars.getBit((int)lllIIIlIl[80]), lllIIIlIl[0]) && U.llIIIIIIIlII(Vars.getBit((int)lllIIIlIl[75]), lllIIIlIl[0])) {
                                if (U.lIllllllllII(llllIlllIllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    llllIlllIlIlI = new WorldPoint(lllIIIlIl[21], lllIIIlIl[91], lllIIIlIl[1]);
                                    if (U.lIlllllllllI(Players.getLocal().getWorldLocation().equals((Object)llllIlllIlIlI) ? 1 : 0)) {
                                        AccBuilderGWD.c = lllIIIlII[lllIIIlIl[92]];
                                        Movement.walkTo((WorldPoint)llllIlllIlIlI);
                                        0;
                                        Time.sleepTicks((int)lllIIIlIl[0]);
                                        0;
                                    }
                                    if (U.lIllllllllII(Players.getLocal().getWorldLocation().equals((Object)llllIlllIlIlI) ? 1 : 0)) {
                                        String[] stringArray20 = new String[lllIIIlIl[0]];
                                        stringArray20[U.lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[93]];
                                        TileObjects.getNearest((String[])stringArray20).interact(lllIIIlII[lllIIIlIl[94]]);
                                        Time.sleepTicks((int)lllIIIlIl[8]);
                                        0;
                                    }
                                }
                                if (U.lIlllllllllI(llllIlllIllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (U.lIlllllllllI(Players.getLocal().getWorldLocation().equals((Object)llllIllllIIlI) ? 1 : 0)) {
                                        AccBuilderGWD.c = lllIIIlII[lllIIIlIl[95]];
                                        Movement.walkTo((WorldPoint)llllIllllIIlI);
                                        0;
                                        Time.sleepTicks((int)lllIIIlIl[0]);
                                        0;
                                    }
                                    if (U.lIllllllllII(Players.getLocal().getWorldLocation().equals((Object)llllIllllIIlI) ? 1 : 0)) {
                                        AccBuilderGWD.c = lllIIIlII[lllIIIlIl[96]];
                                        String[] stringArray21 = new String[lllIIIlIl[0]];
                                        stringArray21[U.lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[97]];
                                        TileObjects.getNearest((String[])stringArray21).interact(lllIIIlII[lllIIIlIl[98]]);
                                        Time.sleepTicks((int)lllIIIlIl[8]);
                                        0;
                                    }
                                }
                            }
                            if (U.llIIIIIIIlII(Vars.getBit((int)lllIIIlIl[74]), lllIIIlIl[0]) && U.lIlllllllllI(Vars.getBit((int)lllIIIlIl[80])) && U.llIIIIIIIlII(Vars.getBit((int)lllIIIlIl[75]), lllIIIlIl[0])) {
                                if (U.lIlllllllllI(Players.getLocal().getWorldLocation().equals((Object)llllIllllIIll) ? 1 : 0)) {
                                    AccBuilderGWD.c = lllIIIlII[lllIIIlIl[99]];
                                    Movement.walkTo((WorldPoint)llllIllllIIll);
                                    0;
                                    Time.sleepTicks((int)lllIIIlIl[0]);
                                    0;
                                }
                                if (U.lIllllllllII(Players.getLocal().getWorldLocation().equals((Object)llllIllllIIll) ? 1 : 0)) {
                                    AccBuilderGWD.c = lllIIIlII[lllIIIlIl[100]];
                                    String[] stringArray22 = new String[lllIIIlIl[0]];
                                    stringArray22[U.lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[101]];
                                    TileObjects.getNearest((String[])stringArray22).interact(lllIIIlII[lllIIIlIl[102]]);
                                    Time.sleepTicks((int)lllIIIlIl[8]);
                                    0;
                                }
                            }
                            if (U.lIlllllllllI(Vars.getBit((int)lllIIIlIl[74])) && U.lIlllllllllI(Vars.getBit((int)lllIIIlIl[80])) && U.llIIIIIIIlII(Vars.getBit((int)lllIIIlIl[75]), lllIIIlIl[0]) && U.lIlllllllllI(Vars.getBit((int)lllIIIlIl[103])) && U.lIlllllllllI(U.df() ? 1 : 0)) {
                                if (U.lIlllllllllI(llllIlllIllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (U.lIllllllllII(llllIlllIlIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        llllIlllIlIlI = new WorldPoint(lllIIIlIl[104], lllIIIlIl[84], lllIIIlIl[1]);
                                        if (U.lIlllllllllI(Players.getLocal().getWorldLocation().equals((Object)llllIlllIlIlI) ? 1 : 0)) {
                                            AccBuilderGWD.c = lllIIIlII[lllIIIlIl[105]];
                                            Movement.walkTo((WorldPoint)llllIlllIlIlI);
                                            0;
                                            Time.sleepTicks((int)lllIIIlIl[0]);
                                            0;
                                        }
                                        if (U.lIllllllllII(Players.getLocal().getWorldLocation().equals((Object)llllIlllIlIlI) ? 1 : 0)) {
                                            String[] stringArray23 = new String[lllIIIlIl[0]];
                                            stringArray23[U.lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[106]];
                                            TileObjects.getNearest((String[])stringArray23).interact(lllIIIlII[lllIIIlIl[107]]);
                                            Time.sleepTicks((int)lllIIIlIl[8]);
                                            0;
                                        }
                                    }
                                    if (U.lIllllllllII((llllIlllIlIlI = new WorldArea(lllIIIlIl[72], lllIIIlIl[69], lllIIIlIl[14], lllIIIlIl[14], lllIIIlIl[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && U.lIlllllllllI(U.df() ? 1 : 0)) {
                                        llllIlllIlIIl = new WorldPoint(lllIIIlIl[108], lllIIIlIl[109], lllIIIlIl[1]);
                                        if (U.lIlllllllllI(Players.getLocal().getWorldLocation().equals((Object)llllIlllIlIIl) ? 1 : 0)) {
                                            AccBuilderGWD.c = lllIIIlII[lllIIIlIl[110]];
                                            Movement.walkTo((WorldPoint)llllIlllIlIIl);
                                            0;
                                            Time.sleepTicks((int)lllIIIlIl[0]);
                                            0;
                                        }
                                        if (U.lIllllllllII(Players.getLocal().getWorldLocation().equals((Object)llllIlllIlIIl) ? 1 : 0)) {
                                            String[] stringArray24 = new String[lllIIIlIl[0]];
                                            stringArray24[U.lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[111]];
                                            TileObjects.getNearest((String[])stringArray24).interact(lllIIIlII[lllIIIlIl[112]]);
                                            Time.sleepTicks((int)lllIIIlIl[8]);
                                            0;
                                        }
                                    }
                                    if (U.lIllllllllII((llllIlllIlIIl = new WorldArea(lllIIIlIl[70], lllIIIlIl[69], lllIIIlIl[14], lllIIIlIl[14], lllIIIlIl[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        llllIlllIlIII = new WorldPoint(lllIIIlIl[67], lllIIIlIl[113], lllIIIlIl[1]);
                                        if (U.lIlllllllllI(Players.getLocal().getWorldLocation().equals((Object)llllIlllIlIII) ? 1 : 0)) {
                                            AccBuilderGWD.c = lllIIIlII[lllIIIlIl[114]];
                                            Movement.walkTo((WorldPoint)llllIlllIlIII);
                                            0;
                                            Time.sleepTicks((int)lllIIIlIl[0]);
                                            0;
                                        }
                                        if (U.lIllllllllII(Players.getLocal().getWorldLocation().equals((Object)llllIlllIlIII) ? 1 : 0)) {
                                            String[] stringArray25 = new String[lllIIIlIl[0]];
                                            stringArray25[U.lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[115]];
                                            TileObjects.getNearest((String[])stringArray25).interact(lllIIIlII[lllIIIlIl[116]]);
                                            Time.sleepTicks((int)lllIIIlIl[8]);
                                            0;
                                        }
                                    }
                                }
                                if (U.lIllllllllII(llllIlllIllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && U.lIlllllllllI(U.df() ? 1 : 0)) {
                                    if (U.lIlllllllllI(Players.getLocal().getWorldLocation().equals((Object)llllIlllIllll) ? 1 : 0)) {
                                        AccBuilderGWD.c = lllIIIlII[lllIIIlIl[117]];
                                        Movement.walkTo((WorldPoint)llllIlllIllll);
                                        0;
                                        Time.sleepTicks((int)lllIIIlIl[0]);
                                        0;
                                    }
                                    if (U.lIllllllllII(Players.getLocal().getWorldLocation().equals((Object)llllIlllIllll) ? 1 : 0)) {
                                        AccBuilderGWD.c = lllIIIlII[lllIIIlIl[118]];
                                        String[] stringArray26 = new String[lllIIIlIl[0]];
                                        stringArray26[U.lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[119]];
                                        TileObjects.getNearest((String[])stringArray26).interact(lllIIIlII[lllIIIlIl[120]]);
                                        Time.sleepTicks((int)lllIIIlIl[8]);
                                        0;
                                    }
                                }
                            }
                            if (U.lIlllllllllI(Vars.getBit((int)lllIIIlIl[74])) && U.lIlllllllllI(Vars.getBit((int)lllIIIlIl[80])) && U.llIIIIIIIlII(Vars.getBit((int)lllIIIlIl[75]), lllIIIlIl[0]) && U.llIIIIIIIlII(Vars.getBit((int)lllIIIlIl[103]), lllIIIlIl[0]) && U.lIlllllllllI(Vars.getBit((int)lllIIIlIl[121]))) {
                                if (U.lIlllllllllI(Players.getLocal().getWorldLocation().equals((Object)llllIlllIlllI) ? 1 : 0)) {
                                    AccBuilderGWD.c = lllIIIlII[lllIIIlIl[122]];
                                    Movement.walkTo((WorldPoint)llllIlllIlllI);
                                    0;
                                    Time.sleepTicks((int)lllIIIlIl[0]);
                                    0;
                                }
                                if (U.lIllllllllII(Players.getLocal().getWorldLocation().equals((Object)llllIlllIlllI) ? 1 : 0)) {
                                    AccBuilderGWD.c = lllIIIlII[lllIIIlIl[123]];
                                    String[] stringArray27 = new String[lllIIIlIl[0]];
                                    stringArray27[U.lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[124]];
                                    TileObjects.getNearest((String[])stringArray27).interact(lllIIIlII[lllIIIlIl[125]]);
                                    Time.sleepTicks((int)lllIIIlIl[8]);
                                    0;
                                }
                            }
                            if (U.lIlllllllllI(Vars.getBit((int)lllIIIlIl[74])) && U.lIlllllllllI(Vars.getBit((int)lllIIIlIl[80])) && U.llIIIIIIIlII(Vars.getBit((int)lllIIIlIl[75]), lllIIIlIl[0]) && U.llIIIIIIIlII(Vars.getBit((int)lllIIIlIl[103]), lllIIIlIl[0]) && U.llIIIIIIIlII(Vars.getBit((int)lllIIIlIl[121]), lllIIIlIl[0]) && U.lIlllllllllI(Vars.getBit((int)lllIIIlIl[126]))) {
                                llllIlllIlIlI = new WorldArea(lllIIIlIl[72], lllIIIlIl[71], lllIIIlIl[14], lllIIIlIl[14], lllIIIlIl[1]);
                                if (U.lIllllllllII(llllIlllIllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    llllIlllIlIIl = new WorldPoint(lllIIIlIl[127], lllIIIlIl[66], lllIIIlIl[1]);
                                    if (U.lIlllllllllI(Players.getLocal().getWorldLocation().equals((Object)llllIlllIlIIl) ? 1 : 0)) {
                                        AccBuilderGWD.c = lllIIIlII[lllIIIlIl[128]];
                                        Movement.walkTo((WorldPoint)llllIlllIlIIl);
                                        0;
                                        Time.sleepTicks((int)lllIIIlIl[0]);
                                        0;
                                    }
                                    if (U.lIllllllllII(Players.getLocal().getWorldLocation().equals((Object)llllIlllIlIIl) ? 1 : 0)) {
                                        String[] stringArray28 = new String[lllIIIlIl[0]];
                                        stringArray28[U.lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[129]];
                                        TileObjects.getNearest((String[])stringArray28).interact(lllIIIlII[lllIIIlIl[130]]);
                                        Time.sleepTicks((int)lllIIIlIl[8]);
                                        0;
                                    }
                                }
                                if (U.lIllllllllII(llllIlllIlIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    llllIlllIlIIl = new WorldPoint(lllIIIlIl[131], lllIIIlIl[66], lllIIIlIl[1]);
                                    if (U.lIlllllllllI(Players.getLocal().getWorldLocation().equals((Object)llllIlllIlIIl) ? 1 : 0)) {
                                        AccBuilderGWD.c = lllIIIlII[lllIIIlIl[132]];
                                        Movement.walkTo((WorldPoint)llllIlllIlIIl);
                                        0;
                                        Time.sleepTicks((int)lllIIIlIl[0]);
                                        0;
                                    }
                                    if (U.lIllllllllII(Players.getLocal().getWorldLocation().equals((Object)llllIlllIlIIl) ? 1 : 0)) {
                                        String[] stringArray29 = new String[lllIIIlIl[0]];
                                        stringArray29[U.lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[133]];
                                        TileObjects.getNearest((String[])stringArray29).interact(lllIIIlII[lllIIIlIl[134]]);
                                        Time.sleepTicks((int)lllIIIlIl[8]);
                                        0;
                                    }
                                }
                                if (U.lIllllllllII(llllIlllIllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderGWD.c = lllIIIlII[lllIIIlIl[135]];
                                    String[] stringArray30 = new String[lllIIIlIl[0]];
                                    stringArray30[U.lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[136]];
                                    TileObjects.getNearest((String[])stringArray30).interact(lllIIIlII[lllIIIlIl[137]]);
                                    Time.sleepTicks((int)lllIIIlIl[16]);
                                    0;
                                }
                            }
                            if (U.lIlllllllllI(Vars.getBit((int)lllIIIlIl[74])) && U.lIlllllllllI(Vars.getBit((int)lllIIIlIl[80])) && U.llIIIIIIIlII(Vars.getBit((int)lllIIIlIl[75]), lllIIIlIl[0]) && U.llIIIIIIIlII(Vars.getBit((int)lllIIIlIl[103]), lllIIIlIl[0]) && U.llIIIIIIIlII(Vars.getBit((int)lllIIIlIl[121]), lllIIIlIl[0]) && U.llIIIIIIIlII(Vars.getBit((int)lllIIIlIl[126]), lllIIIlIl[0])) {
                                llllIlllIlIlI = new WorldArea(lllIIIlIl[72], lllIIIlIl[71], lllIIIlIl[14], lllIIIlIl[14], lllIIIlIl[1]);
                                if (U.lIllllllllII(llllIlllIllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    llllIlllIlIIl = new WorldPoint(lllIIIlIl[138], lllIIIlIl[66], lllIIIlIl[1]);
                                    if (U.lIlllllllllI(Players.getLocal().getWorldLocation().equals((Object)llllIlllIlIIl) ? 1 : 0)) {
                                        AccBuilderGWD.c = lllIIIlII[lllIIIlIl[139]];
                                        Movement.walkTo((WorldPoint)llllIlllIlIIl);
                                        0;
                                        Time.sleepTicks((int)lllIIIlIl[0]);
                                        0;
                                    }
                                    if (U.lIllllllllII(Players.getLocal().getWorldLocation().equals((Object)llllIlllIlIIl) ? 1 : 0)) {
                                        String[] stringArray31 = new String[lllIIIlIl[0]];
                                        stringArray31[U.lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[140]];
                                        TileObjects.getNearest((String[])stringArray31).interact(lllIIIlII[lllIIIlIl[141]]);
                                        Time.sleepTicks((int)lllIIIlIl[8]);
                                        0;
                                    }
                                }
                                if (U.lIllllllllII(llllIlllIlIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    llllIlllIlIIl = new WorldPoint(lllIIIlIl[108], lllIIIlIl[66], lllIIIlIl[1]);
                                    if (U.lIlllllllllI(Players.getLocal().getWorldLocation().equals((Object)llllIlllIlIIl) ? 1 : 0)) {
                                        AccBuilderGWD.c = lllIIIlII[lllIIIlIl[142]];
                                        Movement.walkTo((WorldPoint)llllIlllIlIIl);
                                        0;
                                        Time.sleepTicks((int)lllIIIlIl[0]);
                                        0;
                                    }
                                    if (U.lIllllllllII(Players.getLocal().getWorldLocation().equals((Object)llllIlllIlIIl) ? 1 : 0)) {
                                        String[] stringArray32 = new String[lllIIIlIl[0]];
                                        stringArray32[U.lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[143]];
                                        TileObjects.getNearest((String[])stringArray32).interact(lllIIIlII[lllIIIlIl[144]]);
                                        Time.sleepTicks((int)lllIIIlIl[8]);
                                        0;
                                    }
                                }
                                if (U.lIllllllllII(llllIlllIllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (U.lIlllllllllI(Players.getLocal().getWorldLocation().equals((Object)llllIlllIllll) ? 1 : 0)) {
                                        AccBuilderGWD.c = lllIIIlII[lllIIIlIl[145]];
                                        Movement.walkTo((WorldPoint)llllIlllIllll);
                                        0;
                                        Time.sleepTicks((int)lllIIIlIl[0]);
                                        0;
                                    }
                                    if (U.lIllllllllII(Players.getLocal().getWorldLocation().equals((Object)llllIlllIllll) ? 1 : 0)) {
                                        AccBuilderGWD.c = lllIIIlII[lllIIIlIl[146]];
                                        String[] stringArray33 = new String[lllIIIlIl[0]];
                                        stringArray33[U.lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[147]];
                                        TileObjects.getNearest((String[])stringArray33).interact(lllIIIlII[lllIIIlIl[148]]);
                                        Time.sleepTicks((int)lllIIIlIl[8]);
                                        0;
                                    }
                                }
                            }
                            if (U.lIlllllllllI(Vars.getBit((int)lllIIIlIl[74])) && U.lIlllllllllI(Vars.getBit((int)lllIIIlIl[80])) && U.llIIIIIIIlII(Vars.getBit((int)lllIIIlIl[75]), lllIIIlIl[0]) && U.lIlllllllllI(Vars.getBit((int)lllIIIlIl[103])) && U.llIIIIIIIlII(Vars.getBit((int)lllIIIlIl[121]), lllIIIlIl[0]) && U.llIIIIIIIlII(Vars.getBit((int)lllIIIlIl[126]), lllIIIlIl[0])) {
                                llllIlllIlIlI = new WorldArea(lllIIIlIl[72], lllIIIlIl[71], lllIIIlIl[14], lllIIIlIl[14], lllIIIlIl[1]);
                                if (U.lIllllllllII(llllIlllIllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    llllIlllIlIIl = new WorldPoint(lllIIIlIl[127], lllIIIlIl[66], lllIIIlIl[1]);
                                    if (U.lIlllllllllI(Players.getLocal().getWorldLocation().equals((Object)llllIlllIlIIl) ? 1 : 0)) {
                                        AccBuilderGWD.c = lllIIIlII[lllIIIlIl[149]];
                                        Movement.walkTo((WorldPoint)llllIlllIlIIl);
                                        0;
                                        Time.sleepTicks((int)lllIIIlIl[0]);
                                        0;
                                    }
                                    if (U.lIllllllllII(Players.getLocal().getWorldLocation().equals((Object)llllIlllIlIIl) ? 1 : 0)) {
                                        String[] stringArray34 = new String[lllIIIlIl[0]];
                                        stringArray34[U.lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[150]];
                                        TileObjects.getNearest((String[])stringArray34).interact(lllIIIlII[lllIIIlIl[151]]);
                                        Time.sleepTicks((int)lllIIIlIl[8]);
                                        0;
                                    }
                                }
                                if (U.lIllllllllII(llllIlllIlIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    llllIlllIlIIl = new WorldPoint(lllIIIlIl[104], lllIIIlIl[152], lllIIIlIl[1]);
                                    if (U.lIlllllllllI(Players.getLocal().getWorldLocation().equals((Object)llllIlllIlIIl) ? 1 : 0)) {
                                        AccBuilderGWD.c = lllIIIlII[lllIIIlIl[153]];
                                        Movement.walkTo((WorldPoint)llllIlllIlIIl);
                                        0;
                                        Time.sleepTicks((int)lllIIIlIl[0]);
                                        0;
                                    }
                                    if (U.lIllllllllII(Players.getLocal().getWorldLocation().equals((Object)llllIlllIlIIl) ? 1 : 0)) {
                                        Time.sleepTicks((int)lllIIIlIl[0]);
                                        0;
                                        String[] stringArray35 = new String[lllIIIlIl[0]];
                                        stringArray35[U.lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[154]];
                                        TileObjects.getNearest((String[])stringArray35).interact(lllIIIlII[lllIIIlIl[155]]);
                                        Time.sleepTicks((int)lllIIIlIl[8]);
                                        0;
                                    }
                                }
                                if (U.lIllllllllII((llllIlllIlIIl = new WorldArea(lllIIIlIl[72], lllIIIlIl[69], lllIIIlIl[14], lllIIIlIl[14], lllIIIlIl[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && U.lIlllllllllI(Players.getLocal().isMoving() ? 1 : 0)) {
                                    AccBuilderGWD.c = lllIIIlII[lllIIIlIl[156]];
                                    Time.sleepTicks((int)lllIIIlIl[0]);
                                    0;
                                    int[] nArray = new int[lllIIIlIl[0]];
                                    nArray[U.lllIIIlIl[1]] = lllIIIlIl[157];
                                    TileObjects.getNearest((int[])nArray).interact(lllIIIlII[lllIIIlIl[158]]);
                                    Time.sleepTicks((int)lllIIIlIl[8]);
                                    0;
                                }
                                if (U.lIllllllllII(llllIlllIlIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    int[] nArray = new int[lllIIIlIl[0]];
                                    nArray[U.lllIIIlIl[1]] = lllIIIlIl[159];
                                    TileObjects.getNearest((int[])nArray).interact(lllIIIlII[lllIIIlIl[160]]);
                                    Time.sleepTicks((int)lllIIIlIl[8]);
                                    0;
                                }
                                if (U.lIllllllllII((llllIlllIlIII = new WorldArea(lllIIIlIl[161], lllIIIlIl[162], lllIIIlIl[23], lllIIIlIl[14], lllIIIlIl[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    String[] stringArray36 = new String[lllIIIlIl[0]];
                                    stringArray36[U.lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[163]];
                                    if (U.lIlllllllllI(Inventory.contains((String[])stringArray36) ? 1 : 0)) {
                                        String[] stringArray37 = new String[lllIIIlIl[0]];
                                        stringArray37[U.lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[164]];
                                        TileItems.getNearest((String[])stringArray37).interact(lllIIIlII[lllIIIlIl[165]]);
                                        Time.sleepTicks((int)lllIIIlIl[14]);
                                        0;
                                    }
                                }
                            }
                        }
                    }
                }
                String[] stringArray38 = new String[lllIIIlIl[0]];
                stringArray38[U.lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[166]];
                if (U.lIllllllllII(Inventory.contains((String[])stringArray38) ? 1 : 0)) {
                    String[] stringArray39 = new String[lllIIIlIl[0]];
                    stringArray39[U.lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[167]];
                    if (U.lIllllllllII(Inventory.contains((String[])stringArray39) ? 1 : 0)) {
                        llllIllllIlIl = new WorldArea(lllIIIlIl[161], lllIIIlIl[162], lllIIIlIl[23], lllIIIlIl[14], lllIIIlIl[1]);
                        if (U.lIllllllllII(llllIllllIlIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            int[] nArray = new int[lllIIIlIl[0]];
                            nArray[U.lllIIIlIl[1]] = lllIIIlIl[159];
                            TileObjects.getNearest((int[])nArray).interact(lllIIIlII[lllIIIlIl[168]]);
                            Time.sleepTicks((int)lllIIIlIl[14]);
                            0;
                        }
                        if (U.llIIIIIIIIlI(Players.getLocal().getWorldLocation().distanceTo(lm), lllIIIlIl[10])) {
                            AccBuilderGWD.c = lllIIIlII[lllIIIlIl[169]];
                            Movement.walkTo((WorldPoint)lm);
                            0;
                            Time.sleepTicks((int)lllIIIlIl[0]);
                            0;
                        }
                        if (U.llIIIIIIIIll(Players.getLocal().getWorldLocation().distanceTo(lm), lllIIIlIl[10])) {
                            llllIllllIlII = TileObjects.getNearest(tileObject -> {
                                int n2;
                                if (U.lIllllllllII(tileObject.getName().contains(lllIIIlII[lllIIIlIl[185]]) ? 1 : 0)) {
                                    String[] stringArray = new String[lllIIIlIl[0]];
                                    stringArray[U.lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[186]];
                                    if (U.lIllllllllII(tileObject.hasAction(stringArray) ? 1 : 0) && U.llIIIIIIIIll(tileObject.getWorldLocation().distanceTo(new WorldPoint(lllIIIlIl[21], lllIIIlIl[184], lllIIIlIl[3])), lllIIIlIl[3])) {
                                        n2 = lllIIIlIl[0];
                                        0;
                                        if (3 >= 0) return n2 != 0;
                                        return ((0x54 ^ 0x2F ^ (0xDA ^ 0x86)) & (0xD5 ^ 0xBC ^ (0x50 ^ 0x1E) ^ -1)) != 0;
                                    }
                                }
                                n2 = lllIIIlIl[1];
                                return n2 != 0;
                            });
                            if (U.lIllllllllll(llllIllllIlII)) {
                                llllIllllIlII.interact(lllIIIlII[lllIIIlIl[170]]);
                                Time.sleepTicks((int)lllIIIlIl[8]);
                                0;
                            }
                            if (U.llIIIIIlIlIl(llllIllllIlII)) {
                                g.a(lllIIIlII[lllIIIlIl[171]], cG, lllIIIlIl[0]);
                            }
                        }
                    }
                }
            }
            if (U.llIIIIIIIlII(e.j(ln), lllIIIlIl[3])) {
                if (U.llIIIIIIIIlI(Players.getLocal().getWorldLocation().distanceTo(lm), lllIIIlIl[10])) {
                    AccBuilderGWD.c = lllIIIlII[lllIIIlIl[172]];
                    Movement.walkTo((WorldPoint)lm);
                    0;
                    Time.sleepTicks((int)lllIIIlIl[0]);
                    0;
                }
                if (U.llIIIIIIIIll(Players.getLocal().getWorldLocation().distanceTo(lm), lllIIIlIl[10])) {
                    llllIllllIlIl = TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (U.lIllllllllII(tileObject.getName().contains(lllIIIlII[lllIIIlIl[182]]) ? 1 : 0)) {
                            String[] stringArray = new String[lllIIIlIl[0]];
                            stringArray[U.lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[183]];
                            if (U.lIllllllllII(tileObject.hasAction(stringArray) ? 1 : 0) && U.llIIIIIIIIll(tileObject.getWorldLocation().distanceTo(new WorldPoint(lllIIIlIl[21], lllIIIlIl[184], lllIIIlIl[3])), lllIIIlIl[3])) {
                                n2 = lllIIIlIl[0];
                                0;
                                if ((0x57 ^ 0x64 ^ (0x2B ^ 0x1C)) > 2) return n2 != 0;
                                return ((0x37 ^ 0xF ^ (0x70 ^ 0x43)) & (0x9D ^ 0xAC ^ (0x84 ^ 0xBE) ^ -1)) != 0;
                            }
                        }
                        n2 = lllIIIlIl[1];
                        return n2 != 0;
                    });
                    if (U.lIllllllllll(llllIllllIlIl)) {
                        llllIllllIlIl.interact(lllIIIlII[lllIIIlIl[173]]);
                        Time.sleepTicks((int)lllIIIlIl[8]);
                        0;
                    }
                    if (U.llIIIIIlIlIl(llllIllllIlIl)) {
                        if (U.lIllllllllIl(dk, lllIIIlIl[0])) {
                            as.pW += lllIIIlIl[0];
                            as.u(AccBuilderGWD.m);
                            dk += lllIIIlIl[0];
                            as.pW = lllIIIlIl[1];
                            dl = lllIIIlIl[1];
                        }
                        g.a(lllIIIlII[lllIIIlIl[174]], cG, lllIIIlIl[0]);
                    }
                }
            }
            g.a(cG);
        }
    }

    private static boolean llIIIIIIIIII(int n2) {
        return n2 > 0;
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (U.llIIIIIlIllI(e.j(lllIIIlIl[47]), lllIIIlIl[8])) {
            bl = lllIIIlIl[0];
            0;
            if ((0x2E ^ 0x5A ^ (0x5E ^ 0x2F)) <= 0) {
                return ((26 + 46 - -83 + 29 ^ 40 + 133 - 170 + 171) & (3 ^ (0x47 ^ 0x52) ^ -1)) != 0;
            }
        } else {
            bl = lllIIIlIl[1];
        }
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean an() {
        void llllIlllIIlIl;
        int[] nArray = new int[lllIIIlIl[4]];
        nArray[U.lllIIIlIl[1]] = lllIIIlIl[5];
        nArray[U.lllIIIlIl[0]] = lllIIIlIl[6];
        nArray[U.lllIIIlIl[3]] = lllIIIlIl[7];
        nArray[U.lllIIIlIl[8]] = lllIIIlIl[9];
        int[] nArray2 = nArray;
        int llllIlllIIlII = lllIIIlIl[1];
        while (U.lIllllllllIl(llllIlllIIlII, ((void)llllIlllIIlIl).length)) {
            int[] nArray3 = new int[lllIIIlIl[0]];
            nArray3[U.lllIIIlIl[1]] = llllIlllIIlIl[llllIlllIIlII];
            if (U.lIlllllllllI(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return lllIIIlIl[1];
            }
            ++llllIlllIIlII;
            0;
            if (null == null) continue;
            return ((0x87 ^ 0x94) & ~(0xBA ^ 0xA9)) != 0;
        }
        return lllIIIlIl[0];
    }

    private static boolean lIllllllllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIIIIlIlIl(Object object) {
        return object == null;
    }

    private static boolean llIIIIIIIIlI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIllllllllII(int n2) {
        return n2 != 0;
    }

    static {
        U.lIlllllllIlI();
        U.lIlllllllIIl();
        bx = new ArrayList<d>();
        dg = new WorldPoint(lllIIIlIl[64], lllIIIlIl[187], lllIIIlIl[1]);
        lj = new WorldPoint(lllIIIlIl[188], lllIIIlIl[189], lllIIIlIl[1]);
        lk = new WorldPoint(lllIIIlIl[161], lllIIIlIl[190], lllIIIlIl[1]);
        ll = new WorldPoint(lllIIIlIl[191], lllIIIlIl[192], lllIIIlIl[1]);
        lm = new WorldPoint(lllIIIlIl[64], lllIIIlIl[45], lllIIIlIl[3]);
        ln = lllIIIlIl[47];
        String[] stringArray = new String[lllIIIlIl[8]];
        stringArray[U.lllIIIlIl[1]] = lllIIIlII[lllIIIlIl[193]];
        stringArray[U.lllIIIlIl[0]] = lllIIIlII[lllIIIlIl[194]];
        stringArray[U.lllIIIlIl[3]] = lllIIIlII[lllIIIlIl[195]];
        cG = stringArray;
        lo = new WorldArea(lllIIIlIl[188], lllIIIlIl[196], lllIIIlIl[50], lllIIIlIl[40], lllIIIlIl[1]);
    }

    private static boolean lIllllllllll(Object object) {
        return object != null;
    }

    private static String lIlllllllIII(String llllIllIIIIll, String llllIllIIIIlI) {
        try {
            SecretKeySpec llllIllIIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllIllIIIIlI.getBytes(StandardCharsets.UTF_8)), lllIIIlIl[16]), "DES");
            Cipher llllIllIIIlll = Cipher.getInstance("DES");
            llllIllIIIlll.init(lllIIIlIl[3], llllIllIIlIII);
            return new String(llllIllIIIlll.doFinal(Base64.getDecoder().decode(llllIllIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllIllIIIllI) {
            llllIllIIIllI.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIIIIIll(int n2, int n3) {
        return n2 <= n3;
    }

    private static String lIllllllIlIl(String llllIlIllIlIl, String llllIlIlIllll) {
        llllIlIllIlIl = new String(Base64.getDecoder().decode(llllIlIllIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllIlIllIIll = new StringBuilder();
        char[] llllIlIllIIlI = llllIlIlIllll.toCharArray();
        int llllIlIllIIIl = lllIIIlIl[1];
        char[] llllIlIlIlIll = llllIlIllIlIl.toCharArray();
        int llllIlIlIlIlI = llllIlIlIlIll.length;
        int llllIlIlIlIIl = lllIIIlIl[1];
        while (U.lIllllllllIl(llllIlIlIlIIl, llllIlIlIlIlI)) {
            char llllIlIllIllI = llllIlIlIlIll[llllIlIlIlIIl];
            llllIlIllIIll.append((char)(llllIlIllIllI ^ llllIlIllIIlI[llllIlIllIIIl % llllIlIllIIlI.length]));
            0;
            ++llllIlIllIIIl;
            ++llllIlIlIlIIl;
            0;
            if (((0x21 ^ 0x5B ^ (0x79 ^ 0x5C)) & (0x85 ^ 0xAF ^ (0xD3 ^ 0xA6) ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(llllIlIllIIll);
    }

    private static void Q() {
        block14: {
            d llllIlllIIIII;
            block13: {
                block12: {
                    block11: {
                        Object llllIlllIIIIl;
                        int[] nArray = new int[lllIIIlIl[0]];
                        nArray[U.lllIIIlIl[1]] = lllIIIlIl[6];
                        if (U.lIlllllllllI(Bank.contains((int[])nArray) ? 1 : 0)) {
                            d d2 = new d(lllIIIlIl[6], lllIIIlIl[10], lllIIIlIl[175]);
                            bx.add(d2);
                            0;
                        }
                        int[] nArray2 = new int[lllIIIlIl[0]];
                        nArray2[U.lllIIIlIl[1]] = lllIIIlIl[7];
                        if (U.lIlllllllllI(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            llllIlllIIIIl = new d(lllIIIlIl[7], lllIIIlIl[0], lllIIIlIl[175]);
                            bx.add((d)llllIlllIIIIl);
                            0;
                        }
                        int[] nArray3 = new int[lllIIIlIl[0]];
                        nArray3[U.lllIIIlIl[1]] = lllIIIlIl[9];
                        if (U.lIlllllllllI(Bank.contains((int[])nArray3) ? 1 : 0)) {
                            llllIlllIIIIl = new d(lllIIIlIl[9], lllIIIlIl[0], lllIIIlIl[175]);
                            bx.add((d)llllIlllIIIIl);
                            0;
                        }
                        if (U.lIlllllllllI(Bank.contains((Predicate)(llllIlllIIIIl = item -> item.getName().toLowerCase().contains(lllIIIlII[lllIIIlIl[181]]))) ? 1 : 0)) {
                            llllIlllIIIII = new d(lllIIIlIl[176], lllIIIlIl[14], lllIIIlIl[177]);
                            bx.add(llllIlllIIIII);
                            0;
                        }
                        int[] nArray4 = new int[lllIIIlIl[0]];
                        nArray4[U.lllIIIlIl[1]] = lllIIIlIl[12];
                        if (U.lIlllllllllI(Bank.contains((int[])nArray4) ? 1 : 0)) {
                            llllIlllIIIII = new d(lllIIIlIl[12], lllIIIlIl[4], j.ch);
                            bx.add(llllIlllIIIII);
                            0;
                        }
                        int[] nArray5 = new int[lllIIIlIl[0]];
                        nArray5[U.lllIIIlIl[1]] = lllIIIlIl[13];
                        if (!U.lIllllllllII(Bank.contains((int[])nArray5) ? 1 : 0)) break block11;
                        int[] nArray6 = new int[lllIIIlIl[0]];
                        nArray6[U.lllIIIlIl[1]] = lllIIIlIl[13];
                        if (!U.lIllllllllII(Bank.contains((int[])nArray6) ? 1 : 0)) break block12;
                        int[] nArray7 = new int[lllIIIlIl[0]];
                        nArray7[U.lllIIIlIl[1]] = lllIIIlIl[13];
                        if (!U.lIllllllllIl(Bank.getFirst((int[])nArray7).getQuantity(), lllIIIlIl[14])) break block12;
                    }
                    llllIlllIIIII = new d(lllIIIlIl[13], lllIIIlIl[10], lllIIIlIl[178]);
                    bx.add(llllIlllIIIII);
                    0;
                }
                int[] nArray = new int[lllIIIlIl[0]];
                nArray[U.lllIIIlIl[1]] = lllIIIlIl[5];
                if (!U.lIllllllllII(Bank.contains((int[])nArray) ? 1 : 0)) break block13;
                int[] nArray8 = new int[lllIIIlIl[0]];
                nArray8[U.lllIIIlIl[1]] = lllIIIlIl[5];
                if (!U.lIllllllllII(Bank.contains((int[])nArray8) ? 1 : 0)) break block14;
                int[] nArray9 = new int[lllIIIlIl[0]];
                nArray9[U.lllIIIlIl[1]] = lllIIIlIl[5];
                if (!U.lIllllllllIl(Bank.getFirst((int[])nArray9).getQuantity(), lllIIIlIl[27])) break block14;
            }
            llllIlllIIIII = new d(lllIIIlIl[5], lllIIIlIl[57], lllIIIlIl[179]);
            bx.add(llllIlllIIIII);
            0;
        }
    }

    private static boolean lIlllllllllI(int n2) {
        return n2 == 0;
    }
}

