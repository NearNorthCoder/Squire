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
package f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n;

import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.G;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.U;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.a;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.b;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.d;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.e;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.f;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.g;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.i;
import gg.squire.account.AccBuilderRogues;
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

public class C
implements G {
    static /* synthetic */ boolean cl;
    static /* synthetic */ int hW;
    private static /* synthetic */ int[] lIIllllIIl;
    static /* synthetic */ String[] bR;
    public static /* synthetic */ WorldPoint hS;
    public static /* synthetic */ WorldPoint hT;
    public static /* synthetic */ WorldPoint cg;
    static /* synthetic */ int ck;
    static /* synthetic */ WorldArea hX;
    public static /* synthetic */ WorldPoint hU;
    public static /* synthetic */ boolean bt;
    private static /* synthetic */ String[] lIIlllIlll;
    public static /* synthetic */ WorldPoint hV;
    public static /* synthetic */ List<d> bv;

    private static boolean lIIIIllIIlIll(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean ab() {
        void var16;
        int[] nArray = new int[lIIllllIIl[4]];
        nArray[C.lIIllllIIl[1]] = lIIllllIIl[5];
        nArray[C.lIIllllIIl[0]] = lIIllllIIl[6];
        nArray[C.lIIllllIIl[3]] = lIIllllIIl[7];
        nArray[C.lIIllllIIl[8]] = lIIllllIIl[9];
        int[] nArray2 = nArray;
        int var13 = lIIllllIIl[1];
        while (C.lIIIIllIIIIlI(var13, ((void)var16).length)) {
            int[] nArray3 = new int[lIIllllIIl[0]];
            nArray3[C.lIIllllIIl[1]] = var16[var13];
            if (C.lIIIIllIIIIll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return lIIllllIIl[1];
            }
            ++var13;
            0;
            
            return false;
        }
        return lIIllllIIl[0];
    }

    private static int lIIIIllIIIIII(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static void lIIIIlIllllll() {
        lIIllllIIl = new int[198];
        C.lIIllllIIl[0] = 1;
        C.lIIllllIIl[1] = (122 + 23 - 134 + 153 ^ 75 + 91 - 44 + 74) & (134 + 104 - 171 + 100 ^ 13 + 1 - 0 + 185 ^ -1);
        C.lIIllllIIl[2] = -(0xFFFFCD24 & 0x7EFF) & (0xFFFFDFBB & 0x7FEF);
        C.lIIllllIIl[3] = 2;
        C.lIIllllIIl[4] = 0x53 ^ 0x57;
        C.lIIllllIIl[5] = 0xFFFFDF57 & 0x3FEF;
        C.lIIllllIIl[6] = 0xFFFFCFBF & 0x7CDF;
        C.lIIllllIIl[7] = -(0xFFFFF96F & 0x36D1) & (0xFFFFBFFD & 0x73FA);
        C.lIIllllIIl[8] = 3;
        C.lIIllllIIl[9] = -(0xFFFFEA8F & 0x557F) & (0xFFFFFB3F & 0x45DF);
        C.lIIllllIIl[10] = 0x79 ^ 0x73;
        C.lIIllllIIl[11] = 0xFFFFB71B & 0x49F4;
        C.lIIllllIIl[12] = 0xFFFFB5D1 & 0x7B7F;
        C.lIIllllIIl[13] = 0xFFFF957F & 0x6BFB;
        C.lIIllllIIl[14] = 0xF4 ^ 0x95 ^ (0xE7 ^ 0x83);
        C.lIIllllIIl[15] = 0x8E ^ 0xA7 ^ (0xAF ^ 0xB4);
        C.lIIllllIIl[16] = 0x2E ^ 0x7B ^ (0xF9 ^ 0xA4);
        C.lIIllllIIl[17] = 0xB1 ^ 0xB7;
        C.lIIllllIIl[18] = 0xBE ^ 0xB9;
        C.lIIllllIIl[19] = 0xFFFF89D6 & 0x773B;
        C.lIIllllIIl[20] = 2 ^ 0xB;
        C.lIIllllIIl[21] = 0xFFFFFFE4 & 0xC3F;
        C.lIIllllIIl[22] = -(0xFFFFBDE9 & 0x72F7) & (0xFFFFFFFD & 0x3DFF);
        C.lIIllllIIl[23] = 151 + 109 - 124 + 38 ^ 126 + 133 - 98 + 4;
        C.lIIllllIIl[24] = 0xAE ^ 0xA2;
        C.lIIllllIIl[25] = 0x5F ^ 0x52;
        C.lIIllllIIl[26] = 0xE0 ^ 0x80 ^ (0xF8 ^ 0x96);
        C.lIIllllIIl[27] = 0xB3 ^ 0xBC;
        C.lIIllllIIl[28] = 0xC6 ^ 0x9E ^ (4 ^ 0x4C);
        C.lIIllllIIl[29] = 0x9D ^ 0x8C;
        C.lIIllllIIl[30] = 0xB ^ 0x3C ^ (0x21 ^ 4);
        C.lIIllllIIl[31] = 10 + 198 - 101 + 105 ^ 12 + 108 - -61 + 18;
        C.lIIllllIIl[32] = 0x31 ^ 0x1D ^ (0x85 ^ 0xBD);
        C.lIIllllIIl[33] = 55 + 29 - 16 + 81 ^ 87 + 69 - 57 + 29;
        C.lIIllllIIl[34] = 0xB2 ^ 0xAE ^ (0x31 ^ 0x3B);
        C.lIIllllIIl[35] = 0x2B ^ 0x61 ^ (0x2E ^ 0x73);
        C.lIIllllIIl[36] = 0x70 ^ 0x57 ^ (0x58 ^ 0x67);
        C.lIIllllIIl[37] = 0xB0 ^ 0xA9;
        C.lIIllllIIl[38] = 0x37 ^ 0x2D;
        C.lIIllllIIl[39] = 0x47 ^ 0x5C;
        C.lIIllllIIl[40] = 9 ^ 0x15;
        C.lIIllllIIl[41] = 0x9F ^ 0xA5 ^ (0x52 ^ 0x75);
        C.lIIllllIIl[42] = 0x3D ^ 0x5B ^ (0x79 ^ 1);
        C.lIIllllIIl[43] = -(0xFFFFFDE9 & 0x72DF) & (0xFFFFFCEB & Short.MAX_VALUE);
        C.lIIllllIIl[44] = 0xFFFFBF2F & 0x4DF7;
        C.lIIllllIIl[45] = 0xFFFFBD6E & 0x4FB7;
        C.lIIllllIIl[46] = 0x85 ^ 0x9A;
        C.lIIllllIIl[47] = 0xA5 ^ 0x85;
        C.lIIllllIIl[48] = 0x56 ^ 0x22 ^ (0x6C ^ 0x39);
        C.lIIllllIIl[49] = 0x14 ^ 0x36;
        C.lIIllllIIl[50] = 0x1B ^ 0x38;
        C.lIIllllIIl[51] = 0xA7 ^ 0xC2 ^ (0x2D ^ 0x6C);
        C.lIIllllIIl[52] = 0xFE ^ 0xA7 ^ (0x7E ^ 2);
        C.lIIllllIIl[53] = 0x23 ^ 5;
        C.lIIllllIIl[54] = 0xFFFFDD36 & 0x2EDB;
        C.lIIllllIIl[55] = -(0xFFFFDF79 & 0x60E7) & (0xFFFFEDF9 & 0x5F7F);
        C.lIIllllIIl[56] = 0x8A ^ 0xAD;
        C.lIIllllIIl[57] = 151 + 171 - 180 + 43 ^ 74 + 16 - -25 + 30;
        C.lIIllllIIl[58] = 120 + 82 - 118 + 83 ^ 43 + 124 - 43 + 18;
        C.lIIllllIIl[59] = 0xC ^ 0x26;
        C.lIIllllIIl[60] = 0x29 ^ 2;
        C.lIIllllIIl[61] = -(131 + 115 - 198 + 145) & (0xFFFFF6D2 & 0x2FFF);
        C.lIIllllIIl[62] = 0xFFFFED3C & 0x1EEF;
        C.lIIllllIIl[63] = -(0xFFFFD9E3 & 0x7FFD) & (0xFFFFFFF9 & 0x7FFE);
        C.lIIllllIIl[64] = 0xFFFFAFB6 & 0x5C6F;
        C.lIIllllIIl[65] = -(0xFFFF9FAB & 0x69DF) & (0xFFFFAFFF & 0x7FAB);
        C.lIIllllIIl[66] = -(0xFFFFDECF & 0x71BB) & (0xFFFFFFBF & 0x76EF);
        C.lIIllllIIl[67] = 0xFFFF9FDB & 0x6C3D;
        C.lIIllllIIl[68] = -(0xFFFFE793 & 0x5BFD) & (0xFFFFFFF3 & 0x4FBD);
        C.lIIllllIIl[69] = 0xFFFFFF3E & 0x26DF;
        C.lIIllllIIl[70] = 0xFFFFCC97 & 0x3F7F;
        C.lIIllllIIl[71] = 0xFFFFBEBF & 0x6763;
        C.lIIllllIIl[72] = 0xFFFFFE3F & 0xDDC;
        C.lIIllllIIl[73] = -(0xFFFFADD9 & 0x53EF) & (0xFFFFEFDD & 0x37FB);
        C.lIIllllIIl[74] = -(0xFFFFB313 & 0x7DEF) & (0xFFFFFFFF & 0x37FE);
        C.lIIllllIIl[75] = -(0xFFFFF9CB & 0x4F35) & (0xFFFFFFFF & 0x4FFF);
        C.lIIllllIIl[76] = 0x47 ^ 0x6B;
        C.lIIllllIIl[77] = 0x83 ^ 0x96 ^ (0x9A ^ 0xA2);
        C.lIIllllIIl[78] = 0x68 ^ 0x65 ^ (0x92 ^ 0xB1);
        C.lIIllllIIl[79] = 0x23 ^ 0x49 ^ (0xE5 ^ 0xA0);
        C.lIIllllIIl[80] = -(0xFFFFD7BB & 0x6947) & (0xFFFFCFFF & 0x77FF);
        C.lIIllllIIl[81] = 0x63 ^ 0x53;
        C.lIIllllIIl[82] = 0x44 ^ 0x75;
        C.lIIllllIIl[83] = 0xEA ^ 0x96 ^ (0x7C ^ 0x33);
        C.lIIllllIIl[84] = -(0xFFFFDAD3 & 0x75EF) & (0xFFFFF6DF & Short.MAX_VALUE);
        C.lIIllllIIl[85] = 1 ^ 0x76 ^ (0xCB ^ 0x88);
        C.lIIllllIIl[86] = 0x7B ^ 0x4E;
        C.lIIllllIIl[87] = 0xB7 ^ 0x81;
        C.lIIllllIIl[88] = 0x14 ^ 0x23;
        C.lIIllllIIl[89] = 109 + 89 - 183 + 164 ^ 97 + 23 - 118 + 137;
        C.lIIllllIIl[90] = 0xB4 ^ 0x8D;
        C.lIIllllIIl[91] = 0xFFFFE65F & 0x3FBF;
        C.lIIllllIIl[92] = 0x28 ^ 0xB ^ (0xB3 ^ 0xAA);
        C.lIIllllIIl[93] = 98 + 141 - 238 + 169 ^ 108 + 108 - 103 + 32;
        C.lIIllllIIl[94] = 74 + 101 - 168 + 129 ^ 56 + 97 - 120 + 147;
        C.lIIllllIIl[95] = 0x45 ^ 0x6D ^ (0x15 ^ 0);
        C.lIIllllIIl[96] = 0x2A ^ 0x14;
        C.lIIllllIIl[97] = 5 ^ 0x3B ^ 1;
        C.lIIllllIIl[98] = 0xF9 ^ 0xB9;
        C.lIIllllIIl[99] = 0x57 ^ 0x16;
        C.lIIllllIIl[100] = 0xE ^ 0x69 ^ (4 ^ 0x21);
        C.lIIllllIIl[101] = 0x21 ^ 0x62;
        C.lIIllllIIl[102] = 0x62 ^ 0x26;
        C.lIIllllIIl[103] = -(0xFFFFF8FF & 0x77F3) & (0xFFFFFFFF & 0x77F2);
        C.lIIllllIIl[104] = -(0xFFFFEB6F & 0x77F1) & (0xFFFFEF7E & Short.MAX_VALUE);
        C.lIIllllIIl[105] = 0x56 ^ 0x13;
        C.lIIllllIIl[106] = 0x6A ^ 0x53 ^ 40 + 30 - -13 + 44;
        C.lIIllllIIl[107] = 0x4E ^ 0x63 ^ (0x71 ^ 0x1B);
        C.lIIllllIIl[108] = -(0xFFFF87FB & 0x79E7) & (0xFFFF8DFF & Short.MAX_VALUE);
        C.lIIllllIIl[109] = -(198 + 101 - 200 + 102) & (0xFFFFB7EB & 0x6EFC);
        C.lIIllllIIl[110] = 0xCE ^ 0xC1 ^ (0x31 ^ 0x76);
        C.lIIllllIIl[111] = 0xEF ^ 0xA0 ^ (0x9F ^ 0x99);
        C.lIIllllIIl[112] = 0x23 ^ 0x4A ^ (0x89 ^ 0xAA);
        C.lIIllllIIl[113] = 0xFFFFEFBB & 0x3666;
        C.lIIllllIIl[114] = 0xEA ^ 0xAF ^ (0x5E ^ 0x50);
        C.lIIllllIIl[115] = 0x60 ^ 0x2C;
        C.lIIllllIIl[116] = 0x8D ^ 0x81 ^ (0x71 ^ 0x30);
        C.lIIllllIIl[117] = 0x49 ^ 7;
        C.lIIllllIIl[118] = 0x88 ^ 0xC7;
        C.lIIllllIIl[119] = 133 + 167 - 130 + 35 ^ 52 + 97 - 7 + 15;
        C.lIIllllIIl[120] = 0x91 ^ 0xC0;
        C.lIIllllIIl[121] = -(0xFFFFFEFB & 0x6947) & (0xFFFFFFE7 & 0x6F5B);
        C.lIIllllIIl[122] = 0x90 ^ 0xC2;
        C.lIIllllIIl[123] = 0x40 ^ 0x13;
        C.lIIllllIIl[124] = 0x52 ^ 0x74 ^ (0xF7 ^ 0x85);
        C.lIIllllIIl[125] = 0x33 ^ 0x66;
        C.lIIllllIIl[126] = 0xFFFF9FFE & 0x66FF;
        C.lIIllllIIl[127] = 0xFFFFDCBB & 0x2F5F;
        C.lIIllllIIl[128] = 0xDE ^ 0x88;
        C.lIIllllIIl[129] = 0x25 ^ 0x32 ^ (4 ^ 0x44);
        C.lIIllllIIl[130] = 0x65 ^ 0x3D;
        C.lIIllllIIl[131] = -(0xFFFFFB94 & 0x347F) & (0xFFFFBEBF & 0x7D73);
        C.lIIllllIIl[132] = 0x99 ^ 0xA6 ^ (0x63 ^ 5);
        C.lIIllllIIl[133] = 0xDE ^ 0xC6 ^ (0xE2 ^ 0xA0);
        C.lIIllllIIl[134] = 0xF1 ^ 0xAA;
        C.lIIllllIIl[135] = 0x39 ^ 0x52 ^ (0xF5 ^ 0xC2);
        C.lIIllllIIl[136] = 0xF4 ^ 0xA9;
        C.lIIllllIIl[137] = 0x5A ^ 4;
        C.lIIllllIIl[138] = -(0xFFFFE77A & 0x39CF) & (0xFFFFEF7B & 0x3DEF);
        C.lIIllllIIl[139] = 0x1C ^ 0x12 ^ (0x39 ^ 0x68);
        C.lIIllllIIl[140] = 0x28 ^ 0x15 ^ (0x4E ^ 0x13);
        C.lIIllllIIl[141] = 0xB9 ^ 0x99 ^ (0xD7 ^ 0x96);
        C.lIIllllIIl[142] = 0xFA ^ 0x98;
        C.lIIllllIIl[143] = 156 + 134 - 187 + 98 ^ 3 + 122 - 84 + 129;
        C.lIIllllIIl[144] = 0x67 ^ 3;
        C.lIIllllIIl[145] = 0x90 ^ 0xA9 ^ (0xDB ^ 0x87);
        C.lIIllllIIl[146] = 66 + 14 - 21 + 141 ^ 13 + 21 - -33 + 107;
        C.lIIllllIIl[147] = 0x9C ^ 0xB8 ^ (0x35 ^ 0x76);
        C.lIIllllIIl[148] = 0x8A ^ 0xB5 ^ (0x75 ^ 0x22);
        C.lIIllllIIl[149] = 0xC7 ^ 0xAE;
        C.lIIllllIIl[150] = 0xC4 ^ 0xAE;
        C.lIIllllIIl[151] = 0x65 ^ 0x28 ^ (0xA8 ^ 0x8E);
        C.lIIllllIIl[152] = -(0xFFFFD1DB & 0x3F7E) & (0xFFFFFFFD & 0x377F);
        C.lIIllllIIl[153] = 0x75 ^ 0x19;
        C.lIIllllIIl[154] = 0xFC ^ 0x91;
        C.lIIllllIIl[155] = 0x23 ^ 0x4D;
        C.lIIllllIIl[156] = 0x7B ^ 0x14;
        C.lIIllllIIl[157] = 33 + 65 - 11 + 58;
        C.lIIllllIIl[158] = 0xC4 ^ 0xB4;
        C.lIIllllIIl[159] = 25 + 3 - -7 + 106;
        C.lIIllllIIl[160] = 0xFE ^ 0x8F;
        C.lIIllllIIl[161] = 0xFFFF9DB1 & 0x6E5F;
        C.lIIllllIIl[162] = -(0xFFFFF383 & 0x5CFF) & (0xFFFFF7FF & 0x7E9B);
        C.lIIllllIIl[163] = 0x40 ^ 0x32;
        C.lIIllllIIl[164] = 7 + 207 - 54 + 86 ^ 26 + 28 - -16 + 63;
        C.lIIllllIIl[165] = 0xB2 ^ 0xC6;
        C.lIIllllIIl[166] = 0x96 ^ 0x81 ^ (0x5A ^ 0x38);
        C.lIIllllIIl[167] = 0xF ^ 0x79;
        C.lIIllllIIl[168] = 0x65 ^ 0x12;
        C.lIIllllIIl[169] = 0x5B ^ 0x6B ^ (0x1B ^ 0x53);
        C.lIIllllIIl[170] = 0x2B ^ 0x52;
        C.lIIllllIIl[171] = 0x78 ^ 0x69 ^ (0xC3 ^ 0xA8);
        C.lIIllllIIl[172] = 0x31 ^ 0x4A;
        C.lIIllllIIl[173] = 71 + 27 - 26 + 149 ^ 35 + 52 - -38 + 36;
        C.lIIllllIIl[174] = 58 + 97 - 121 + 204 ^ 46 + 107 - 56 + 50;
        C.lIIllllIIl[175] = 0xFFFFFDAC & 0x2657;
        C.lIIllllIIl[176] = 0xFFFFEFEC & 0x3EDF;
        C.lIIllllIIl[177] = 0xFFFFE1FD & 0x7FAA;
        C.lIIllllIIl[178] = 0xFFFFEFBF & 0x116C;
        C.lIIllllIIl[179] = 0xFFFF9DB5 & 0x675E;
        C.lIIllllIIl[180] = 0x25 ^ 0x5B;
        C.lIIllllIIl[181] = 76 + 60 - 83 + 74;
        C.lIIllllIIl[182] = 75 + 18 - -10 + 25;
        C.lIIllllIIl[183] = (0x6A ^ 0x1F) + (107 + 94 - 177 + 104) - (214 + 75 - 186 + 129) + (0x36 ^ 0x42);
        C.lIIllllIIl[184] = -(0xFFFFD3CB & 0x7E37) & (0xFFFFDF67 & 0x7FBF);
        C.lIIllllIIl[185] = (0xEE ^ 0xB1) + (0x10 ^ 0x65) - (150 + 49 - 109 + 74) + (0x92 ^ 0xC0);
        C.lIIllllIIl[186] = (0x63 ^ 0x3D) + (0x8D ^ 0xAD) - (0x84 ^ 0xC5) + (0xC7 ^ 0x81);
        C.lIIllllIIl[187] = 0xFFFFBFB3 & 0x4D4D;
        C.lIIllllIIl[188] = -(0xFFFFF22D & 0x2FD3) & (0xFFFFBEFF & 0x6F0F);
        C.lIIllllIIl[189] = -(0xFFFFFEB3 & 0x63DF) & (0xFFFFFFBA & 0x6FF7);
        C.lIIllllIIl[190] = 0xFFFFED7F & 0x1F88;
        C.lIIllllIIl[191] = -(0xFFFFD7CF & 0x3BB9) & (0xFFFFFF9F & 0x1FFE);
        C.lIIllllIIl[192] = -(0xFFFFBB21 & 0x46FF) & (0xFFFFCFFF & 0x3F3F);
        C.lIIllllIIl[193] = 99 + 125 - 129 + 37;
        C.lIIllllIIl[194] = 117 + 89 - 96 + 23;
        C.lIIllllIIl[195] = (0x33 ^ 0x28) + (50 + 92 - 123 + 113) - (0xC2 ^ 0x88) + (0x33 ^ 2);
        C.lIIllllIIl[196] = -(0xFFFFFB53 & 0xDBD) & (0xFFFFEFFF & 0x3F1F);
        C.lIIllllIIl[197] = 72 + 53 - 74 + 84;
    }

    private static boolean lIIIIllIIlIlI(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIIIIllIIIlII(Object object) {
        return object != null;
    }

    public static void bH() {
        block134: {
            BankLocation var23;
            block135: {
                WorldArea var4;
                TileItem var32;
                block137: {
                    block136: {
                        if (C.lIIIIllIIIIIl(bt ? 1 : 0)) {
                            b.a(bv);
                            if (C.lIIIIllIIIIlI(bv.size(), lIIllllIIl[0])) {
                                System.out.println(lIIlllIlll[lIIllllIIl[1]]);
                                bt = lIIllllIIl[1];
                            }
                        }
                        if (!C.lIIIIllIIIIll(bt ? 1 : 0)) break block134;
                        if (C.lIIIIllIIIIll(C.ab() ? 1 : 0) && C.lIIIIllIIIIlI(e.j(hW), lIIllllIIl[0])) {
                            var23 = BankLocation.getNearest();
                            if (C.lIIIIllIIIlII(var23) && C.lIIIIllIIIIll(var23.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[0]];
                                a.a(var23);
                            }
                            if (C.lIIIIllIIIlII(var23) && C.lIIIIllIIIIIl(var23.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                if (C.lIIIIllIIIIll(Bank.isOpen() ? 1 : 0)) {
                                    a.a();
                                    Time.sleepUntil(() -> Bank.isOpen(), (int)lIIllllIIl[2]);
                                    0;
                                }
                                if (C.lIIIIllIIIIIl(Bank.isOpen() ? 1 : 0)) {
                                    AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[3]];
                                    if (C.lIIIIllIIIlIl(Inventory.getAll().size())) {
                                        Bank.depositInventory();
                                        Time.sleepTicks((int)lIIllllIIl[4]);
                                        0;
                                    }
                                    if (C.lIIIIllIIIlIl(Equipment.getAll().size())) {
                                        Bank.depositEquipment();
                                        Time.sleepTicks((int)lIIllllIIl[3]);
                                        0;
                                    }
                                    int[] nArray = new int[lIIllllIIl[4]];
                                    nArray[C.lIIllllIIl[1]] = lIIllllIIl[5];
                                    nArray[C.lIIllllIIl[0]] = lIIllllIIl[6];
                                    nArray[C.lIIllllIIl[3]] = lIIllllIIl[7];
                                    nArray[C.lIIllllIIl[8]] = lIIllllIIl[9];
                                    if (C.lIIIIllIIIIll(e.b(nArray) ? 1 : 0)) {
                                        C.af();
                                        System.out.println(lIIlllIlll[lIIllllIIl[8]]);
                                        bt = lIIllllIIl[0];
                                        return;
                                    }
                                    int[] nArray2 = new int[lIIllllIIl[4]];
                                    nArray2[C.lIIllllIIl[1]] = lIIllllIIl[5];
                                    nArray2[C.lIIllllIIl[0]] = lIIllllIIl[6];
                                    nArray2[C.lIIllllIIl[3]] = lIIllllIIl[7];
                                    nArray2[C.lIIllllIIl[8]] = lIIllllIIl[9];
                                    if (C.lIIIIllIIIIIl(e.b(nArray2) ? 1 : 0)) {
                                        a.a(lIIllllIIl[5], lIIllllIIl[10]);
                                        a.a(lIIllllIIl[6], lIIllllIIl[10]);
                                        a.a(lIIllllIIl[7], lIIllllIIl[0]);
                                        a.a(lIIllllIIl[11], lIIllllIIl[0]);
                                        a.a(lIIllllIIl[9], lIIllllIIl[0]);
                                        a.a(lIIllllIIl[12], lIIllllIIl[0]);
                                        a.a(lIIllllIIl[13], lIIllllIIl[14]);
                                    }
                                }
                            }
                        }
                        if (C.lIIIIllIIIIIl(Inventory.contains((int[])f.aV) ? 1 : 0) && C.lIIIIllIIIIlI(Movement.getRunEnergy(), lIIllllIIl[15])) {
                            Inventory.getFirst((int[])f.aV).interact(lIIlllIlll[lIIllllIIl[4]]);
                            Time.sleepTicks((int)lIIllllIIl[0]);
                            0;
                        }
                        int[] nArray = new int[lIIllllIIl[0]];
                        nArray[C.lIIllllIIl[1]] = lIIllllIIl[13];
                        if (C.lIIIIllIIIIIl(Inventory.contains((int[])nArray) ? 1 : 0) && C.lIIIIllIIIllI(C.lIIIIllIIIIII(e.u(), 50.0))) {
                            int[] nArray3 = new int[lIIllllIIl[0]];
                            nArray3[C.lIIllllIIl[1]] = lIIllllIIl[13];
                            Inventory.getFirst((int[])nArray3).interact(lIIlllIlll[lIIllllIIl[14]]);
                            Time.sleepTicks((int)lIIllllIIl[3]);
                            0;
                        }
                        if (C.lIIIIllIIIIIl(C.ab() ? 1 : 0) && C.lIIIIllIIIIll(e.j(hW))) {
                            if (C.lIIIIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(cg), lIIllllIIl[16])) {
                                AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[17]];
                                Movement.walkTo((WorldPoint)cg);
                                0;
                                Time.sleepTicks((int)lIIllllIIl[0]);
                                0;
                            }
                            if (C.lIIIIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(cg), lIIllllIIl[16])) {
                                AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[18]];
                                if (C.lIIIIllIIIIIl(Dialog.isOpen() ? 1 : 0)) {
                                    Dialog.close();
                                }
                                g.a(lIIlllIlll[lIIllllIIl[16]], bR);
                            }
                        }
                        if (!C.lIIIIllIIlIIl(e.j(hW), lIIllllIIl[0])) break block135;
                        ck = lIIllllIIl[1];
                        int[] nArray4 = new int[lIIllllIIl[0]];
                        nArray4[C.lIIllllIIl[1]] = lIIllllIIl[11];
                        if (C.lIIIIllIIIIll(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                            int[] nArray5 = new int[lIIllllIIl[0]];
                            nArray5[C.lIIllllIIl[1]] = lIIllllIIl[19];
                            if (C.lIIIIllIIIIll(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                                String[] stringArray = new String[lIIllllIIl[0]];
                                stringArray[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[20]];
                                if (C.lIIIIllIIIIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                    var23 = new WorldPoint(lIIllllIIl[21], lIIllllIIl[22], lIIllllIIl[0]);
                                    int[] nArray6 = new int[lIIllllIIl[0]];
                                    nArray6[C.lIIllllIIl[1]] = lIIllllIIl[11];
                                    if (C.lIIIIllIIIIll(Inventory.contains((int[])nArray6) ? 1 : 0)) {
                                        if (C.lIIIIllIIIlll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var23), lIIllllIIl[14])) {
                                            AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[10]];
                                            Movement.walkTo((WorldPoint)var23);
                                            0;
                                            Time.sleepTicks((int)lIIllllIIl[0]);
                                            0;
                                        }
                                        if (C.lIIIIllIIlIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var23), lIIllllIIl[14])) {
                                            int[] nArray7 = new int[lIIllllIIl[0]];
                                            nArray7[C.lIIllllIIl[1]] = lIIllllIIl[11];
                                            var32 = TileItems.getNearest((int[])nArray7);
                                            if (C.lIIIIllIIIlII(var32)) {
                                                if (C.lIIIIllIIIIll(Reachable.isInteractable((Locatable)var32) ? 1 : 0)) {
                                                    AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[23]];
                                                    Movement.walkTo((WorldPoint)var32.getWorldLocation());
                                                    0;
                                                    Time.sleepTicks((int)lIIllllIIl[0]);
                                                    0;
                                                }
                                                if (C.lIIIIllIIIIIl(Reachable.isInteractable((Locatable)var32) ? 1 : 0)) {
                                                    AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[24]];
                                                    var32.interact(lIIlllIlll[lIIllllIIl[25]]);
                                                    Time.sleepTicks((int)lIIllllIIl[8]);
                                                    0;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        int[] nArray8 = new int[lIIllllIIl[0]];
                        nArray8[C.lIIllllIIl[1]] = lIIllllIIl[11];
                        if (!C.lIIIIllIIIIll(Inventory.contains((int[])nArray8) ? 1 : 0)) break block136;
                        int[] nArray9 = new int[lIIllllIIl[0]];
                        nArray9[C.lIIllllIIl[1]] = lIIllllIIl[19];
                        if (!C.lIIIIllIIIIIl(Inventory.contains((int[])nArray9) ? 1 : 0)) break block137;
                    }
                    int[] nArray = new int[lIIllllIIl[0]];
                    nArray[C.lIIllllIIl[1]] = lIIllllIIl[19];
                    if (C.lIIIIllIIIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray10 = new int[lIIllllIIl[0]];
                        nArray10[C.lIIllllIIl[1]] = lIIllllIIl[11];
                        if (C.lIIIIllIIIIIl(Inventory.contains((int[])nArray10) ? 1 : 0)) {
                            AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[26]];
                            int[] nArray11 = new int[lIIllllIIl[0]];
                            nArray11[C.lIIllllIIl[1]] = lIIllllIIl[11];
                            int[] nArray12 = new int[lIIllllIIl[0]];
                            nArray12[C.lIIllllIIl[1]] = lIIllllIIl[9];
                            Inventory.getFirst((int[])nArray11).useOn(Inventory.getFirst((int[])nArray12));
                            Time.sleepTicks((int)lIIllllIIl[0]);
                            0;
                        }
                    }
                    int[] nArray13 = new int[lIIllllIIl[0]];
                    nArray13[C.lIIllllIIl[1]] = lIIllllIIl[19];
                    if (C.lIIIIllIIIIIl(Inventory.contains((int[])nArray13) ? 1 : 0)) {
                        String[] stringArray = new String[lIIllllIIl[0]];
                        stringArray[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[27]];
                        if (C.lIIIIllIIIIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                            if (C.lIIIIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(hS), lIIllllIIl[4])) {
                                AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[28]];
                                Movement.walkTo((WorldPoint)hS);
                                0;
                                Time.sleepTicks((int)lIIllllIIl[0]);
                                0;
                            }
                            if (C.lIIIIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(hS), lIIllllIIl[4])) {
                                AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[29]];
                                String[] stringArray2 = new String[lIIllllIIl[0]];
                                stringArray2[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[30]];
                                TileObjects.getNearest((String[])stringArray2).interact(lIIlllIlll[lIIllllIIl[31]]);
                                Time.sleepTicks((int)lIIllllIIl[20]);
                                0;
                            }
                        }
                        String[] stringArray3 = new String[lIIllllIIl[0]];
                        stringArray3[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[32]];
                        if (C.lIIIIllIIIIIl(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                            if (C.lIIIIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(hT), lIIllllIIl[8])) {
                                AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[33]];
                                Movement.walkTo((WorldPoint)hT);
                                0;
                                Time.sleepTicks((int)lIIllllIIl[0]);
                                0;
                            }
                            if (C.lIIIIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(hT), lIIllllIIl[8])) {
                                int[] nArray14 = new int[lIIllllIIl[0]];
                                nArray14[C.lIIllllIIl[1]] = lIIllllIIl[19];
                                String[] stringArray4 = new String[lIIllllIIl[0]];
                                stringArray4[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[34]];
                                Inventory.getFirst((int[])nArray14).useOn(TileObjects.getNearest((String[])stringArray4));
                                Time.sleepTicks((int)lIIllllIIl[0]);
                                0;
                            }
                        }
                    }
                }
                String[] stringArray = new String[lIIllllIIl[0]];
                stringArray[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[35]];
                if (C.lIIIIllIIIIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    int[] nArray = new int[lIIllllIIl[0]];
                    nArray[C.lIIllllIIl[1]] = lIIllllIIl[19];
                    if (C.lIIIIllIIIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        String[] stringArray5 = new String[lIIllllIIl[0]];
                        stringArray5[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[36]];
                        if (C.lIIIIllIIIIll(Inventory.contains((String[])stringArray5) ? 1 : 0)) {
                            AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[37]];
                            if (C.lIIIIllIIIIll(Dialog.isOpen() ? 1 : 0)) {
                                String[] stringArray6 = new String[lIIllllIIl[0]];
                                stringArray6[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[38]];
                                TileObjects.getNearest((String[])stringArray6).interact(lIIlllIlll[lIIllllIIl[39]]);
                                Time.sleepTicks((int)lIIllllIIl[4]);
                                0;
                            }
                            g.a(bR);
                        }
                    }
                }
                String[] stringArray7 = new String[lIIllllIIl[0]];
                stringArray7[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[40]];
                if (C.lIIIIllIIIIIl(Inventory.contains((String[])stringArray7) ? 1 : 0)) {
                    String[] stringArray8 = new String[lIIllllIIl[0]];
                    stringArray8[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[41]];
                    if (C.lIIIIllIIIIIl(Inventory.contains((String[])stringArray8) ? 1 : 0)) {
                        String[] stringArray9 = new String[lIIllllIIl[0]];
                        stringArray9[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[42]];
                        if (C.lIIIIllIIIIll(Inventory.contains((String[])stringArray9) ? 1 : 0)) {
                            var23 = new WorldPoint(lIIllllIIl[43], lIIllllIIl[44], lIIllllIIl[1]);
                            var32 = new WorldPoint(lIIllllIIl[21], lIIllllIIl[44], lIIllllIIl[1]);
                            var4 = new WorldArea(lIIllllIIl[21], lIIllllIIl[45], lIIllllIIl[14], lIIllllIIl[8], lIIllllIIl[1]);
                            if (C.lIIIIllIIIIll(Players.getLocal().getWorldLocation().equals((Object)var23) ? 1 : 0) && C.lIIIIllIIIIll(Players.getLocal().getWorldLocation().equals((Object)var32) ? 1 : 0) && C.lIIIIllIIIIll(var4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[46]];
                                Movement.walkTo((WorldPoint)var23);
                                0;
                                Time.sleepTicks((int)lIIllllIIl[0]);
                                0;
                            }
                            if (C.lIIIIllIIIIIl(Players.getLocal().getWorldLocation().equals((Object)var23) ? 1 : 0)) {
                                String[] stringArray10 = new String[lIIllllIIl[0]];
                                stringArray10[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[47]];
                                TileObjects.getNearest((String[])stringArray10).interact(lIIlllIlll[lIIllllIIl[48]]);
                                Time.sleepTicks((int)lIIllllIIl[3]);
                                0;
                            }
                            if (C.lIIIIllIIIIIl(var4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[49]];
                                String[] stringArray11 = new String[lIIllllIIl[0]];
                                stringArray11[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[50]];
                                TileItems.getNearest((String[])stringArray11).interact(lIIlllIlll[lIIllllIIl[51]]);
                                Time.sleepTicks((int)lIIllllIIl[8]);
                                0;
                            }
                        }
                    }
                }
                String[] stringArray12 = new String[lIIllllIIl[0]];
                stringArray12[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[52]];
                if (C.lIIIIllIIIIIl(Inventory.contains((String[])stringArray12) ? 1 : 0)) {
                    String[] stringArray13 = new String[lIIllllIIl[0]];
                    stringArray13[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[53]];
                    if (C.lIIIIllIIIIll(Inventory.contains((String[])stringArray13) ? 1 : 0)) {
                        var23 = new WorldArea(lIIllllIIl[21], lIIllllIIl[45], lIIllllIIl[14], lIIllllIIl[8], lIIllllIIl[1]);
                        var32 = new WorldArea(lIIllllIIl[54], lIIllllIIl[55], lIIllllIIl[18], lIIllllIIl[23], lIIllllIIl[1]);
                        if (C.lIIIIllIIIIIl(var23.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] stringArray14 = new String[lIIllllIIl[0]];
                            stringArray14[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[56]];
                            TileObjects.getNearest((String[])stringArray14).interact(lIIlllIlll[lIIllllIIl[57]]);
                            Time.sleepTicks((int)lIIllllIIl[3]);
                            0;
                        }
                        if (C.lIIIIllIIIIll(var32.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && C.lIIIIllIIIIll(hX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[58]];
                            Movement.walkTo((WorldPoint)hU);
                            0;
                            Time.sleepTicks((int)lIIllllIIl[0]);
                            0;
                        }
                        if (C.lIIIIllIIIIIl(var32.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] stringArray15 = new String[lIIllllIIl[0]];
                            stringArray15[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[59]];
                            TileObjects.getNearest((String[])stringArray15).interact(lIIlllIlll[lIIllllIIl[60]]);
                            Time.sleepTicks((int)lIIllllIIl[4]);
                            0;
                        }
                        if (C.lIIIIllIIIIIl(hX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            WorldPoint var27;
                            WorldPoint var30;
                            WorldPoint var35;
                            var4 = new WorldPoint(lIIllllIIl[21], lIIllllIIl[61], lIIllllIIl[1]);
                            WorldPoint var19 = new WorldPoint(lIIllllIIl[62], lIIllllIIl[63], lIIllllIIl[1]);
                            WorldPoint lllllllllllllllllllllIIIIIIIIIlI = new WorldPoint(lIIllllIIl[64], lIIllllIIl[65], lIIllllIIl[1]);
                            WorldPoint lllllllllllllllllllllIIIIIIIIIIl = new WorldPoint(lIIllllIIl[43], lIIllllIIl[66], lIIllllIIl[1]);
                            WorldPoint var5 = new WorldPoint(lIIllllIIl[67], lIIllllIIl[66], lIIllllIIl[1]);
                            WorldPoint var24 = new WorldPoint(lIIllllIIl[67], lIIllllIIl[66], lIIllllIIl[1]);
                            WorldArea var15 = new WorldArea(lIIllllIIl[68], lIIllllIIl[69], lIIllllIIl[20], lIIllllIIl[23], lIIllllIIl[1]);
                            WorldArea var28 = new WorldArea(lIIllllIIl[70], lIIllllIIl[71], lIIllllIIl[14], lIIllllIIl[17], lIIllllIIl[1]);
                            WorldArea var3 = new WorldArea(lIIllllIIl[72], lIIllllIIl[73], lIIllllIIl[32], lIIllllIIl[25], lIIllllIIl[1]);
                            if (C.lIIIIllIIlIlI(Vars.getBit((int)lIIllllIIl[74]), lIIllllIIl[0]) && C.lIIIIllIIIIll(Vars.getBit((int)lIIllllIIl[75]))) {
                                if (C.lIIIIllIIIIll(Players.getLocal().getWorldLocation().equals((Object)var4) ? 1 : 0)) {
                                    AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[76]];
                                    Movement.walkTo((WorldPoint)var4);
                                    0;
                                    Time.sleepTicks((int)lIIllllIIl[0]);
                                    0;
                                }
                                if (C.lIIIIllIIIIIl(Players.getLocal().getWorldLocation().equals((Object)var4) ? 1 : 0)) {
                                    AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[77]];
                                    String[] stringArray16 = new String[lIIllllIIl[0]];
                                    stringArray16[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[78]];
                                    TileObjects.getNearest((String[])stringArray16).interact(lIIlllIlll[lIIllllIIl[79]]);
                                    Time.sleepTicks((int)lIIllllIIl[8]);
                                    0;
                                }
                            }
                            if (C.lIIIIllIIlIIl(Vars.getBit((int)lIIllllIIl[74]), lIIllllIIl[0]) && C.lIIIIllIIIIll(Vars.getBit((int)lIIllllIIl[80])) && C.lIIIIllIIIIll(Vars.getBit((int)lIIllllIIl[75]))) {
                                if (C.lIIIIllIIIIll(Players.getLocal().getWorldLocation().equals((Object)var19) ? 1 : 0)) {
                                    AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[81]];
                                    Movement.walkTo((WorldPoint)var19);
                                    0;
                                    Time.sleepTicks((int)lIIllllIIl[0]);
                                    0;
                                }
                                if (C.lIIIIllIIIIIl(Players.getLocal().getWorldLocation().equals((Object)var19) ? 1 : 0)) {
                                    AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[82]];
                                    String[] stringArray17 = new String[lIIllllIIl[0]];
                                    stringArray17[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[15]];
                                    TileObjects.getNearest((String[])stringArray17).interact(lIIlllIlll[lIIllllIIl[83]]);
                                    Time.sleepTicks((int)lIIllllIIl[8]);
                                    0;
                                }
                            }
                            if (C.lIIIIllIIlIIl(Vars.getBit((int)lIIllllIIl[74]), lIIllllIIl[0]) && C.lIIIIllIIlIIl(Vars.getBit((int)lIIllllIIl[80]), lIIllllIIl[0]) && C.lIIIIllIIIIll(Vars.getBit((int)lIIllllIIl[75]))) {
                                if (C.lIIIIllIIIIll(var15.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    var35 = new WorldPoint(lIIllllIIl[21], lIIllllIIl[84], lIIllllIIl[1]);
                                    if (C.lIIIIllIIIIll(Players.getLocal().getWorldLocation().equals((Object)var35) ? 1 : 0)) {
                                        AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[85]];
                                        Movement.walkTo((WorldPoint)var35);
                                        0;
                                        Time.sleepTicks((int)lIIllllIIl[0]);
                                        0;
                                    }
                                    if (C.lIIIIllIIIIIl(Players.getLocal().getWorldLocation().equals((Object)var35) ? 1 : 0)) {
                                        String[] stringArray18 = new String[lIIllllIIl[0]];
                                        stringArray18[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[86]];
                                        TileObjects.getNearest((String[])stringArray18).interact(lIIlllIlll[lIIllllIIl[87]]);
                                        Time.sleepTicks((int)lIIllllIIl[8]);
                                        0;
                                    }
                                }
                                if (C.lIIIIllIIIIIl(var15.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[88]];
                                    String[] stringArray19 = new String[lIIllllIIl[0]];
                                    stringArray19[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[89]];
                                    TileObjects.getNearest((String[])stringArray19).interact(lIIlllIlll[lIIllllIIl[90]]);
                                    Time.sleepTicks((int)lIIllllIIl[8]);
                                    0;
                                }
                            }
                            if (C.lIIIIllIIlIIl(Vars.getBit((int)lIIllllIIl[74]), lIIllllIIl[0]) && C.lIIIIllIIlIIl(Vars.getBit((int)lIIllllIIl[80]), lIIllllIIl[0]) && C.lIIIIllIIlIIl(Vars.getBit((int)lIIllllIIl[75]), lIIllllIIl[0])) {
                                if (C.lIIIIllIIIIIl(var15.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    var35 = new WorldPoint(lIIllllIIl[21], lIIllllIIl[91], lIIllllIIl[1]);
                                    if (C.lIIIIllIIIIll(Players.getLocal().getWorldLocation().equals((Object)var35) ? 1 : 0)) {
                                        AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[92]];
                                        Movement.walkTo((WorldPoint)var35);
                                        0;
                                        Time.sleepTicks((int)lIIllllIIl[0]);
                                        0;
                                    }
                                    if (C.lIIIIllIIIIIl(Players.getLocal().getWorldLocation().equals((Object)var35) ? 1 : 0)) {
                                        String[] stringArray20 = new String[lIIllllIIl[0]];
                                        stringArray20[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[93]];
                                        TileObjects.getNearest((String[])stringArray20).interact(lIIlllIlll[lIIllllIIl[94]]);
                                        Time.sleepTicks((int)lIIllllIIl[8]);
                                        0;
                                    }
                                }
                                if (C.lIIIIllIIIIll(var15.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (C.lIIIIllIIIIll(Players.getLocal().getWorldLocation().equals((Object)var19) ? 1 : 0)) {
                                        AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[95]];
                                        Movement.walkTo((WorldPoint)var19);
                                        0;
                                        Time.sleepTicks((int)lIIllllIIl[0]);
                                        0;
                                    }
                                    if (C.lIIIIllIIIIIl(Players.getLocal().getWorldLocation().equals((Object)var19) ? 1 : 0)) {
                                        AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[96]];
                                        String[] stringArray21 = new String[lIIllllIIl[0]];
                                        stringArray21[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[97]];
                                        TileObjects.getNearest((String[])stringArray21).interact(lIIlllIlll[lIIllllIIl[98]]);
                                        Time.sleepTicks((int)lIIllllIIl[8]);
                                        0;
                                    }
                                }
                            }
                            if (C.lIIIIllIIlIIl(Vars.getBit((int)lIIllllIIl[74]), lIIllllIIl[0]) && C.lIIIIllIIIIll(Vars.getBit((int)lIIllllIIl[80])) && C.lIIIIllIIlIIl(Vars.getBit((int)lIIllllIIl[75]), lIIllllIIl[0])) {
                                if (C.lIIIIllIIIIll(Players.getLocal().getWorldLocation().equals((Object)var4) ? 1 : 0)) {
                                    AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[99]];
                                    Movement.walkTo((WorldPoint)var4);
                                    0;
                                    Time.sleepTicks((int)lIIllllIIl[0]);
                                    0;
                                }
                                if (C.lIIIIllIIIIIl(Players.getLocal().getWorldLocation().equals((Object)var4) ? 1 : 0)) {
                                    AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[100]];
                                    String[] stringArray22 = new String[lIIllllIIl[0]];
                                    stringArray22[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[101]];
                                    TileObjects.getNearest((String[])stringArray22).interact(lIIlllIlll[lIIllllIIl[102]]);
                                    Time.sleepTicks((int)lIIllllIIl[8]);
                                    0;
                                }
                            }
                            if (C.lIIIIllIIIIll(Vars.getBit((int)lIIllllIIl[74])) && C.lIIIIllIIIIll(Vars.getBit((int)lIIllllIIl[80])) && C.lIIIIllIIlIIl(Vars.getBit((int)lIIllllIIl[75]), lIIllllIIl[0]) && C.lIIIIllIIIIll(Vars.getBit((int)lIIllllIIl[103])) && C.lIIIIllIIIIll(C.bI() ? 1 : 0)) {
                                if (C.lIIIIllIIIIll(var28.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (C.lIIIIllIIIIIl(var3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        var35 = new WorldPoint(lIIllllIIl[104], lIIllllIIl[84], lIIllllIIl[1]);
                                        if (C.lIIIIllIIIIll(Players.getLocal().getWorldLocation().equals((Object)var35) ? 1 : 0)) {
                                            AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[105]];
                                            Movement.walkTo((WorldPoint)var35);
                                            0;
                                            Time.sleepTicks((int)lIIllllIIl[0]);
                                            0;
                                        }
                                        if (C.lIIIIllIIIIIl(Players.getLocal().getWorldLocation().equals((Object)var35) ? 1 : 0)) {
                                            String[] stringArray23 = new String[lIIllllIIl[0]];
                                            stringArray23[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[106]];
                                            TileObjects.getNearest((String[])stringArray23).interact(lIIlllIlll[lIIllllIIl[107]]);
                                            Time.sleepTicks((int)lIIllllIIl[8]);
                                            0;
                                        }
                                    }
                                    if (C.lIIIIllIIIIIl((var35 = new WorldArea(lIIllllIIl[72], lIIllllIIl[69], lIIllllIIl[14], lIIllllIIl[14], lIIllllIIl[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && C.lIIIIllIIIIll(C.bI() ? 1 : 0)) {
                                        var30 = new WorldPoint(lIIllllIIl[108], lIIllllIIl[109], lIIllllIIl[1]);
                                        if (C.lIIIIllIIIIll(Players.getLocal().getWorldLocation().equals((Object)var30) ? 1 : 0)) {
                                            AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[110]];
                                            Movement.walkTo((WorldPoint)var30);
                                            0;
                                            Time.sleepTicks((int)lIIllllIIl[0]);
                                            0;
                                        }
                                        if (C.lIIIIllIIIIIl(Players.getLocal().getWorldLocation().equals((Object)var30) ? 1 : 0)) {
                                            String[] stringArray24 = new String[lIIllllIIl[0]];
                                            stringArray24[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[111]];
                                            TileObjects.getNearest((String[])stringArray24).interact(lIIlllIlll[lIIllllIIl[112]]);
                                            Time.sleepTicks((int)lIIllllIIl[8]);
                                            0;
                                        }
                                    }
                                    if (C.lIIIIllIIIIIl((var30 = new WorldArea(lIIllllIIl[70], lIIllllIIl[69], lIIllllIIl[14], lIIllllIIl[14], lIIllllIIl[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        var27 = new WorldPoint(lIIllllIIl[67], lIIllllIIl[113], lIIllllIIl[1]);
                                        if (C.lIIIIllIIIIll(Players.getLocal().getWorldLocation().equals((Object)var27) ? 1 : 0)) {
                                            AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[114]];
                                            Movement.walkTo((WorldPoint)var27);
                                            0;
                                            Time.sleepTicks((int)lIIllllIIl[0]);
                                            0;
                                        }
                                        if (C.lIIIIllIIIIIl(Players.getLocal().getWorldLocation().equals((Object)var27) ? 1 : 0)) {
                                            String[] stringArray25 = new String[lIIllllIIl[0]];
                                            stringArray25[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[115]];
                                            TileObjects.getNearest((String[])stringArray25).interact(lIIlllIlll[lIIllllIIl[116]]);
                                            Time.sleepTicks((int)lIIllllIIl[8]);
                                            0;
                                        }
                                    }
                                }
                                if (C.lIIIIllIIIIIl(var28.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && C.lIIIIllIIIIll(C.bI() ? 1 : 0)) {
                                    if (C.lIIIIllIIIIll(Players.getLocal().getWorldLocation().equals((Object)var5) ? 1 : 0)) {
                                        AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[117]];
                                        Movement.walkTo((WorldPoint)var5);
                                        0;
                                        Time.sleepTicks((int)lIIllllIIl[0]);
                                        0;
                                    }
                                    if (C.lIIIIllIIIIIl(Players.getLocal().getWorldLocation().equals((Object)var5) ? 1 : 0)) {
                                        AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[118]];
                                        String[] stringArray26 = new String[lIIllllIIl[0]];
                                        stringArray26[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[119]];
                                        TileObjects.getNearest((String[])stringArray26).interact(lIIlllIlll[lIIllllIIl[120]]);
                                        Time.sleepTicks((int)lIIllllIIl[8]);
                                        0;
                                    }
                                }
                            }
                            if (C.lIIIIllIIIIll(Vars.getBit((int)lIIllllIIl[74])) && C.lIIIIllIIIIll(Vars.getBit((int)lIIllllIIl[80])) && C.lIIIIllIIlIIl(Vars.getBit((int)lIIllllIIl[75]), lIIllllIIl[0]) && C.lIIIIllIIlIIl(Vars.getBit((int)lIIllllIIl[103]), lIIllllIIl[0]) && C.lIIIIllIIIIll(Vars.getBit((int)lIIllllIIl[121]))) {
                                if (C.lIIIIllIIIIll(Players.getLocal().getWorldLocation().equals((Object)var24) ? 1 : 0)) {
                                    AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[122]];
                                    Movement.walkTo((WorldPoint)var24);
                                    0;
                                    Time.sleepTicks((int)lIIllllIIl[0]);
                                    0;
                                }
                                if (C.lIIIIllIIIIIl(Players.getLocal().getWorldLocation().equals((Object)var24) ? 1 : 0)) {
                                    AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[123]];
                                    String[] stringArray27 = new String[lIIllllIIl[0]];
                                    stringArray27[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[124]];
                                    TileObjects.getNearest((String[])stringArray27).interact(lIIlllIlll[lIIllllIIl[125]]);
                                    Time.sleepTicks((int)lIIllllIIl[8]);
                                    0;
                                }
                            }
                            if (C.lIIIIllIIIIll(Vars.getBit((int)lIIllllIIl[74])) && C.lIIIIllIIIIll(Vars.getBit((int)lIIllllIIl[80])) && C.lIIIIllIIlIIl(Vars.getBit((int)lIIllllIIl[75]), lIIllllIIl[0]) && C.lIIIIllIIlIIl(Vars.getBit((int)lIIllllIIl[103]), lIIllllIIl[0]) && C.lIIIIllIIlIIl(Vars.getBit((int)lIIllllIIl[121]), lIIllllIIl[0]) && C.lIIIIllIIIIll(Vars.getBit((int)lIIllllIIl[126]))) {
                                var35 = new WorldArea(lIIllllIIl[72], lIIllllIIl[71], lIIllllIIl[14], lIIllllIIl[14], lIIllllIIl[1]);
                                if (C.lIIIIllIIIIIl(var28.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    var30 = new WorldPoint(lIIllllIIl[127], lIIllllIIl[66], lIIllllIIl[1]);
                                    if (C.lIIIIllIIIIll(Players.getLocal().getWorldLocation().equals((Object)var30) ? 1 : 0)) {
                                        AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[128]];
                                        Movement.walkTo((WorldPoint)var30);
                                        0;
                                        Time.sleepTicks((int)lIIllllIIl[0]);
                                        0;
                                    }
                                    if (C.lIIIIllIIIIIl(Players.getLocal().getWorldLocation().equals((Object)var30) ? 1 : 0)) {
                                        String[] stringArray28 = new String[lIIllllIIl[0]];
                                        stringArray28[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[129]];
                                        TileObjects.getNearest((String[])stringArray28).interact(lIIlllIlll[lIIllllIIl[130]]);
                                        Time.sleepTicks((int)lIIllllIIl[8]);
                                        0;
                                    }
                                }
                                if (C.lIIIIllIIIIIl(var35.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    var30 = new WorldPoint(lIIllllIIl[131], lIIllllIIl[66], lIIllllIIl[1]);
                                    if (C.lIIIIllIIIIll(Players.getLocal().getWorldLocation().equals((Object)var30) ? 1 : 0)) {
                                        AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[132]];
                                        Movement.walkTo((WorldPoint)var30);
                                        0;
                                        Time.sleepTicks((int)lIIllllIIl[0]);
                                        0;
                                    }
                                    if (C.lIIIIllIIIIIl(Players.getLocal().getWorldLocation().equals((Object)var30) ? 1 : 0)) {
                                        String[] stringArray29 = new String[lIIllllIIl[0]];
                                        stringArray29[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[133]];
                                        TileObjects.getNearest((String[])stringArray29).interact(lIIlllIlll[lIIllllIIl[134]]);
                                        Time.sleepTicks((int)lIIllllIIl[8]);
                                        0;
                                    }
                                }
                                if (C.lIIIIllIIIIIl(var15.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[135]];
                                    String[] stringArray30 = new String[lIIllllIIl[0]];
                                    stringArray30[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[136]];
                                    TileObjects.getNearest((String[])stringArray30).interact(lIIlllIlll[lIIllllIIl[137]]);
                                    Time.sleepTicks((int)lIIllllIIl[16]);
                                    0;
                                }
                            }
                            if (C.lIIIIllIIIIll(Vars.getBit((int)lIIllllIIl[74])) && C.lIIIIllIIIIll(Vars.getBit((int)lIIllllIIl[80])) && C.lIIIIllIIlIIl(Vars.getBit((int)lIIllllIIl[75]), lIIllllIIl[0]) && C.lIIIIllIIlIIl(Vars.getBit((int)lIIllllIIl[103]), lIIllllIIl[0]) && C.lIIIIllIIlIIl(Vars.getBit((int)lIIllllIIl[121]), lIIllllIIl[0]) && C.lIIIIllIIlIIl(Vars.getBit((int)lIIllllIIl[126]), lIIllllIIl[0])) {
                                var35 = new WorldArea(lIIllllIIl[72], lIIllllIIl[71], lIIllllIIl[14], lIIllllIIl[14], lIIllllIIl[1]);
                                if (C.lIIIIllIIIIIl(var15.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    var30 = new WorldPoint(lIIllllIIl[138], lIIllllIIl[66], lIIllllIIl[1]);
                                    if (C.lIIIIllIIIIll(Players.getLocal().getWorldLocation().equals((Object)var30) ? 1 : 0)) {
                                        AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[139]];
                                        Movement.walkTo((WorldPoint)var30);
                                        0;
                                        Time.sleepTicks((int)lIIllllIIl[0]);
                                        0;
                                    }
                                    if (C.lIIIIllIIIIIl(Players.getLocal().getWorldLocation().equals((Object)var30) ? 1 : 0)) {
                                        String[] stringArray31 = new String[lIIllllIIl[0]];
                                        stringArray31[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[140]];
                                        TileObjects.getNearest((String[])stringArray31).interact(lIIlllIlll[lIIllllIIl[141]]);
                                        Time.sleepTicks((int)lIIllllIIl[8]);
                                        0;
                                    }
                                }
                                if (C.lIIIIllIIIIIl(var35.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    var30 = new WorldPoint(lIIllllIIl[108], lIIllllIIl[66], lIIllllIIl[1]);
                                    if (C.lIIIIllIIIIll(Players.getLocal().getWorldLocation().equals((Object)var30) ? 1 : 0)) {
                                        AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[142]];
                                        Movement.walkTo((WorldPoint)var30);
                                        0;
                                        Time.sleepTicks((int)lIIllllIIl[0]);
                                        0;
                                    }
                                    if (C.lIIIIllIIIIIl(Players.getLocal().getWorldLocation().equals((Object)var30) ? 1 : 0)) {
                                        String[] stringArray32 = new String[lIIllllIIl[0]];
                                        stringArray32[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[143]];
                                        TileObjects.getNearest((String[])stringArray32).interact(lIIlllIlll[lIIllllIIl[144]]);
                                        Time.sleepTicks((int)lIIllllIIl[8]);
                                        0;
                                    }
                                }
                                if (C.lIIIIllIIIIIl(var28.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (C.lIIIIllIIIIll(Players.getLocal().getWorldLocation().equals((Object)var5) ? 1 : 0)) {
                                        AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[145]];
                                        Movement.walkTo((WorldPoint)var5);
                                        0;
                                        Time.sleepTicks((int)lIIllllIIl[0]);
                                        0;
                                    }
                                    if (C.lIIIIllIIIIIl(Players.getLocal().getWorldLocation().equals((Object)var5) ? 1 : 0)) {
                                        AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[146]];
                                        String[] stringArray33 = new String[lIIllllIIl[0]];
                                        stringArray33[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[147]];
                                        TileObjects.getNearest((String[])stringArray33).interact(lIIlllIlll[lIIllllIIl[148]]);
                                        Time.sleepTicks((int)lIIllllIIl[8]);
                                        0;
                                    }
                                }
                            }
                            if (C.lIIIIllIIIIll(Vars.getBit((int)lIIllllIIl[74])) && C.lIIIIllIIIIll(Vars.getBit((int)lIIllllIIl[80])) && C.lIIIIllIIlIIl(Vars.getBit((int)lIIllllIIl[75]), lIIllllIIl[0]) && C.lIIIIllIIIIll(Vars.getBit((int)lIIllllIIl[103])) && C.lIIIIllIIlIIl(Vars.getBit((int)lIIllllIIl[121]), lIIllllIIl[0]) && C.lIIIIllIIlIIl(Vars.getBit((int)lIIllllIIl[126]), lIIllllIIl[0])) {
                                var35 = new WorldArea(lIIllllIIl[72], lIIllllIIl[71], lIIllllIIl[14], lIIllllIIl[14], lIIllllIIl[1]);
                                if (C.lIIIIllIIIIIl(var28.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    var30 = new WorldPoint(lIIllllIIl[127], lIIllllIIl[66], lIIllllIIl[1]);
                                    if (C.lIIIIllIIIIll(Players.getLocal().getWorldLocation().equals((Object)var30) ? 1 : 0)) {
                                        AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[149]];
                                        Movement.walkTo((WorldPoint)var30);
                                        0;
                                        Time.sleepTicks((int)lIIllllIIl[0]);
                                        0;
                                    }
                                    if (C.lIIIIllIIIIIl(Players.getLocal().getWorldLocation().equals((Object)var30) ? 1 : 0)) {
                                        String[] stringArray34 = new String[lIIllllIIl[0]];
                                        stringArray34[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[150]];
                                        TileObjects.getNearest((String[])stringArray34).interact(lIIlllIlll[lIIllllIIl[151]]);
                                        Time.sleepTicks((int)lIIllllIIl[8]);
                                        0;
                                    }
                                }
                                if (C.lIIIIllIIIIIl(var35.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    var30 = new WorldPoint(lIIllllIIl[104], lIIllllIIl[152], lIIllllIIl[1]);
                                    if (C.lIIIIllIIIIll(Players.getLocal().getWorldLocation().equals((Object)var30) ? 1 : 0)) {
                                        AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[153]];
                                        Movement.walkTo((WorldPoint)var30);
                                        0;
                                        Time.sleepTicks((int)lIIllllIIl[0]);
                                        0;
                                    }
                                    if (C.lIIIIllIIIIIl(Players.getLocal().getWorldLocation().equals((Object)var30) ? 1 : 0)) {
                                        Time.sleepTicks((int)lIIllllIIl[0]);
                                        0;
                                        String[] stringArray35 = new String[lIIllllIIl[0]];
                                        stringArray35[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[154]];
                                        TileObjects.getNearest((String[])stringArray35).interact(lIIlllIlll[lIIllllIIl[155]]);
                                        Time.sleepTicks((int)lIIllllIIl[8]);
                                        0;
                                    }
                                }
                                if (C.lIIIIllIIIIIl((var30 = new WorldArea(lIIllllIIl[72], lIIllllIIl[69], lIIllllIIl[14], lIIllllIIl[14], lIIllllIIl[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && C.lIIIIllIIIIll(Players.getLocal().isMoving() ? 1 : 0)) {
                                    AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[156]];
                                    Time.sleepTicks((int)lIIllllIIl[0]);
                                    0;
                                    int[] nArray = new int[lIIllllIIl[0]];
                                    nArray[C.lIIllllIIl[1]] = lIIllllIIl[157];
                                    TileObjects.getNearest((int[])nArray).interact(lIIlllIlll[lIIllllIIl[158]]);
                                    Time.sleepTicks((int)lIIllllIIl[8]);
                                    0;
                                }
                                if (C.lIIIIllIIIIIl(var3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    int[] nArray = new int[lIIllllIIl[0]];
                                    nArray[C.lIIllllIIl[1]] = lIIllllIIl[159];
                                    TileObjects.getNearest((int[])nArray).interact(lIIlllIlll[lIIllllIIl[160]]);
                                    Time.sleepTicks((int)lIIllllIIl[8]);
                                    0;
                                }
                                if (C.lIIIIllIIIIIl((var27 = new WorldArea(lIIllllIIl[161], lIIllllIIl[162], lIIllllIIl[23], lIIllllIIl[14], lIIllllIIl[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    String[] stringArray36 = new String[lIIllllIIl[0]];
                                    stringArray36[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[163]];
                                    if (C.lIIIIllIIIIll(Inventory.contains((String[])stringArray36) ? 1 : 0)) {
                                        String[] stringArray37 = new String[lIIllllIIl[0]];
                                        stringArray37[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[164]];
                                        TileItems.getNearest((String[])stringArray37).interact(lIIlllIlll[lIIllllIIl[165]]);
                                        Time.sleepTicks((int)lIIllllIIl[14]);
                                        0;
                                    }
                                }
                            }
                        }
                    }
                }
                String[] stringArray38 = new String[lIIllllIIl[0]];
                stringArray38[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[166]];
                if (C.lIIIIllIIIIIl(Inventory.contains((String[])stringArray38) ? 1 : 0)) {
                    String[] stringArray39 = new String[lIIllllIIl[0]];
                    stringArray39[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[167]];
                    if (C.lIIIIllIIIIIl(Inventory.contains((String[])stringArray39) ? 1 : 0)) {
                        var23 = new WorldArea(lIIllllIIl[161], lIIllllIIl[162], lIIllllIIl[23], lIIllllIIl[14], lIIllllIIl[1]);
                        if (C.lIIIIllIIIIIl(var23.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            int[] nArray = new int[lIIllllIIl[0]];
                            nArray[C.lIIllllIIl[1]] = lIIllllIIl[159];
                            TileObjects.getNearest((int[])nArray).interact(lIIlllIlll[lIIllllIIl[168]]);
                            Time.sleepTicks((int)lIIllllIIl[14]);
                            0;
                        }
                        if (C.lIIIIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(hV), lIIllllIIl[10])) {
                            AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[169]];
                            Movement.walkTo((WorldPoint)hV);
                            0;
                            Time.sleepTicks((int)lIIllllIIl[0]);
                            0;
                        }
                        if (C.lIIIIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(hV), lIIllllIIl[10])) {
                            var32 = TileObjects.getNearest(tileObject -> {
                                int n2;
                                if (C.lIIIIllIIIIIl(tileObject.getName().contains(lIIlllIlll[lIIllllIIl[185]]) ? 1 : 0)) {
                                    String[] stringArray = new String[lIIllllIIl[0]];
                                    stringArray[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[186]];
                                    if (C.lIIIIllIIIIIl(tileObject.hasAction(stringArray) ? 1 : 0) && C.lIIIIllIIlIII(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIllllIIl[21], lIIllllIIl[184], lIIllllIIl[3])), lIIllllIIl[3])) {
                                        n2 = lIIllllIIl[0];
                                        0;
                                        if (3 == 3) return n2 != 0;
                                        return false;
                                    }
                                }
                                n2 = lIIllllIIl[1];
                                return n2 != 0;
                            });
                            if (C.lIIIIllIIIlII(var32)) {
                                var32.interact(lIIlllIlll[lIIllllIIl[170]]);
                                Time.sleepTicks((int)lIIllllIIl[8]);
                                0;
                            }
                            if (C.lIIIIllIIlIll(var32)) {
                                g.a(lIIlllIlll[lIIllllIIl[171]], bR, lIIllllIIl[0]);
                            }
                        }
                    }
                }
            }
            if (C.lIIIIllIIlIIl(e.j(hW), lIIllllIIl[3])) {
                if (C.lIIIIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(hV), lIIllllIIl[10])) {
                    AccBuilderRogues.c = lIIlllIlll[lIIllllIIl[172]];
                    Movement.walkTo((WorldPoint)hV);
                    0;
                    Time.sleepTicks((int)lIIllllIIl[0]);
                    0;
                }
                if (C.lIIIIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(hV), lIIllllIIl[10])) {
                    var23 = TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (C.lIIIIllIIIIIl(tileObject.getName().contains(lIIlllIlll[lIIllllIIl[182]]) ? 1 : 0)) {
                            String[] stringArray = new String[lIIllllIIl[0]];
                            stringArray[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[183]];
                            if (C.lIIIIllIIIIIl(tileObject.hasAction(stringArray) ? 1 : 0) && C.lIIIIllIIlIII(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIllllIIl[21], lIIllllIIl[184], lIIllllIIl[3])), lIIllllIIl[3])) {
                                n2 = lIIllllIIl[0];
                                0;
                                if (-1 <= 0) return n2 != 0;
                                return false;
                            }
                        }
                        n2 = lIIllllIIl[1];
                        return n2 != 0;
                    });
                    if (C.lIIIIllIIIlII(var23)) {
                        var23.interact(lIIlllIlll[lIIllllIIl[173]]);
                        Time.sleepTicks((int)lIIllllIIl[8]);
                        0;
                    }
                    if (C.lIIIIllIIlIll(var23)) {
                        if (C.lIIIIllIIIIlI(ck, lIIllllIIl[0])) {
                            U.mQ += lIIllllIIl[0];
                            U.o(AccBuilderRogues.m);
                            ck += lIIllllIIl[0];
                            U.mQ = lIIllllIIl[1];
                            cl = lIIllllIIl[1];
                        }
                        g.a(lIIlllIlll[lIIllllIIl[174]], bR, lIIllllIIl[0]);
                    }
                }
            }
            g.a(bR);
        }
    }

    @Override
    public String U() {
        return lIIlllIlll[lIIllllIIl[180]];
    }

    static boolean bI() {
        int n2;
        if (C.lIIIIllIIIIll(Vars.getBit((int)lIIllllIIl[74])) && C.lIIIIllIIIIll(Vars.getBit((int)lIIllllIIl[80])) && C.lIIIIllIIlIIl(Vars.getBit((int)lIIllllIIl[75]), lIIllllIIl[0]) && C.lIIIIllIIIIll(Vars.getBit((int)lIIllllIIl[103])) && C.lIIIIllIIlIIl(Vars.getBit((int)lIIllllIIl[121]), lIIllllIIl[0]) && C.lIIIIllIIlIIl(Vars.getBit((int)lIIllllIIl[126]), lIIllllIIl[0])) {
            n2 = lIIllllIIl[0];
            0;
            if (((0x57 ^ 0x60) & ~(0x4F ^ 0x78)) >= 3) {
                return false;
            }
        } else {
            n2 = lIIllllIIl[1];
        }
        return n2 != 0;
    }

    private static boolean lIIIIllIIllII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIIIllIIIlIl(int n2) {
        return n2 > 0;
    }

    private static boolean lIIIIllIIIIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIIllIIlIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static String lIIIIlIlIIlIl(String var33, String var6) {
        var33 = new String(Base64.getDecoder().decode(var33.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var11 = new StringBuilder();
        char[] var29 = var6.toCharArray();
        int var34 = lIIllllIIl[1];
        char[] var21 = var33.toCharArray();
        int var20 = var21.length;
        int var10 = lIIllllIIl[1];
        while (C.lIIIIllIIIIlI(var10, var20)) {
            char var14 = var21[var10];
            var11.append((char)(var14 ^ var29[var34 % var29.length]));
            0;
            ++var34;
            ++var10;
            0;
            
            return null;
        }
        return String.valueOf(var11);
    }

    private static boolean lIIIIllIIIIll(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean V() {
        boolean bl;
        if (C.lIIIIllIIllII(e.j(lIIllllIIl[47]), lIIllllIIl[8])) {
            bl = lIIllllIIl[0];
            0;
            if ((21 + 73 - 11 + 106 ^ 29 + 157 - 104 + 103) <= 3) {
                return ((0xC1 ^ 0x9A ^ (0x30 ^ 0x3C)) & (0xB ^ 0x65 ^ (0xD ^ 0x34) ^ -1)) != 0;
            }
        } else {
            bl = lIIllllIIl[1];
        }
        return bl;
    }

    private static void lIIIIlIllIIIl() {
        lIIlllIlll = new String[lIIllllIIl[197]];
        C.lIIlllIlll[C.lIIllllIIl[1]] = C."Finished buying items, switching back to quest";
        C.lIIlllIlll[C.lIIllllIIl[0]] = C."Nav to bank";
        C.lIIlllIlll[C.lIIllllIIl[3]] = C."Handling banking";
        C.lIIlllIlll[C.lIIllllIIl[8]] = C."We are missing quest supplies, switching to BUYING";
        C.lIIlllIlll[C.lIIllllIIl[4]] = C."Drink";
        C.lIIlllIlll[C.lIIllllIIl[14]] = C."Eat";
        C.lIIlllIlll[C.lIIllllIIl[17]] = C."Nav to start";
        C.lIIlllIlll[C.lIIllllIIl[18]] = C."Start quest";
        C.lIIlllIlll[C.lIIllllIIl[16]] = C."Veronica";
        C.lIIlllIlll[C.lIIllllIIl[20]] = C."Key";
        C.lIIlllIlll[C.lIIllllIIl[10]] = C."Nav to fish food";
        C.lIIlllIlll[C.lIIllllIIl[23]] = C."Can't reach, navigating";
        C.lIIlllIlll[C.lIIllllIIl[24]] = C."Taking food";
        C.lIIlllIlll[C.lIIllllIIl[25]] = C."Take";
        C.lIIlllIlll[C.lIIllllIIl[26]] = C."Making poison fish food";
        C.lIIlllIlll[C.lIIllllIIl[27]] = C."Key";
        C.lIIlllIlll[C.lIIllllIIl[28]] = C."Nav to compost";
        C.lIIlllIlll[C.lIIllllIIl[29]] = C."Digging";
        C.lIIlllIlll[C.lIIllllIIl[30]] = C."Compost heap";
        C.lIIlllIlll[C.lIIllllIIl[31]] = C."Search";
        C.lIIlllIlll[C.lIIllllIIl[32]] = C."Key";
        C.lIIlllIlll[C.lIIllllIIl[33]] = C."Nav to fountain";
        C.lIIlllIlll[C.lIIllllIIl[34]] = C."Fountain";
        C.lIIlllIlll[C.lIIllllIIl[35]] = C."Key";
        C.lIIlllIlll[C.lIIllllIIl[36]] = C."Pressure gauge";
        C.lIIlllIlll[C.lIIllllIIl[37]] = C."Getting guage";
        C.lIIlllIlll[C.lIIllllIIl[38]] = C."Fountain";
        C.lIIlllIlll[C.lIIllllIIl[39]] = C."Search";
        C.lIIlllIlll[C.lIIllllIIl[40]] = C."Key";
        C.lIIlllIlll[C.lIIllllIIl[41]] = C."Pressure gauge";
        C.lIIlllIlll[C.lIIllllIIl[42]] = C."Rubber tube";
        C.lIIlllIlll[C.lIIllllIIl[46]] = C."Nav to door";
        C.lIIlllIlll[C.lIIllllIIl[47]] = C."Door";
        C.lIIlllIlll[C.lIIllllIIl[48]] = C."Open";
        C.lIIlllIlll[C.lIIllllIIl[49]] = C."Get tube";
        C.lIIlllIlll[C.lIIllllIIl[50]] = C."Rubber tube";
        C.lIIlllIlll[C.lIIllllIIl[51]] = C."Take";
        C.lIIlllIlll[C.lIIllllIIl[52]] = C."Rubber tube";
        C.lIIlllIlll[C.lIIllllIIl[53]] = C."Oil can";
        C.lIIlllIlll[C.lIIllllIIl[56]] = C."Door";
        C.lIIlllIlll[C.lIIllllIIl[57]] = C."Open";
        C.lIIlllIlll[C.lIIllllIIl[58]] = C."Nav to final room";
        C.lIIlllIlll[C.lIIllllIIl[59]] = C."Ladder";
        C.lIIlllIlll[C.lIIllllIIl[60]] = C."Climb-down";
        C.lIIlllIlll[C.lIIllllIIl[76]] = C."Nav to a";
        C.lIIlllIlll[C.lIIllllIIl[77]] = C."Pull lever";
        C.lIIlllIlll[C.lIIllllIIl[78]] = C."Lever A";
        C.lIIlllIlll[C.lIIllllIIl[79]] = C."Pull";
        C.lIIlllIlll[C.lIIllllIIl[81]] = C."Nav to b";
        C.lIIlllIlll[C.lIIllllIIl[82]] = C."Pull lever";
        C.lIIlllIlll[C.lIIllllIIl[15]] = C."Lever B";
        C.lIIlllIlll[C.lIIllllIIl[83]] = C."Pull";
        C.lIIlllIlll[C.lIIllllIIl[85]] = C."Nav to d";
        C.lIIlllIlll[C.lIIllllIIl[86]] = C."Door";
        C.lIIlllIlll[C.lIIllllIIl[87]] = C."Open";
        C.lIIlllIlll[C.lIIllllIIl[88]] = C."Pull lever";
        C.lIIlllIlll[C.lIIllllIIl[89]] = C."Lever D";
        C.lIIlllIlll[C.lIIllllIIl[90]] = C."Pull";
        C.lIIlllIlll[C.lIIllllIIl[92]] = C."Move to door";
        C.lIIlllIlll[C.lIIllllIIl[93]] = C."Door";
        C.lIIlllIlll[C.lIIllllIIl[94]] = C."Open";
        C.lIIlllIlll[C.lIIllllIIl[95]] = C."Nav to b";
        C.lIIlllIlll[C.lIIllllIIl[96]] = C."Pull lever";
        C.lIIlllIlll[C.lIIllllIIl[97]] = C."Lever B";
        C.lIIlllIlll[C.lIIllllIIl[98]] = C."Pull";
        C.lIIlllIlll[C.lIIllllIIl[99]] = C."Nav to a";
        C.lIIlllIlll[C.lIIllllIIl[100]] = C."Pull lever";
        C.lIIlllIlll[C.lIIllllIIl[101]] = C."Lever A";
        C.lIIlllIlll[C.lIIllllIIl[102]] = C."Pull";
        C.lIIlllIlll[C.lIIllllIIl[105]] = C."Move to door";
        C.lIIlllIlll[C.lIIllllIIl[106]] = C."Door";
        C.lIIlllIlll[C.lIIllllIIl[107]] = C."Open";
        C.lIIlllIlll[C.lIIllllIIl[110]] = C."Move to door";
        C.lIIlllIlll[C.lIIllllIIl[111]] = C."Door";
        C.lIIlllIlll[C.lIIllllIIl[112]] = C."Open";
        C.lIIlllIlll[C.lIIllllIIl[114]] = C."Move to door";
        C.lIIlllIlll[C.lIIllllIIl[115]] = C."Door";
        C.lIIlllIlll[C.lIIllllIIl[116]] = C."Open";
        C.lIIlllIlll[C.lIIllllIIl[117]] = C."Nav to e";
        C.lIIlllIlll[C.lIIllllIIl[118]] = C."Pull lever";
        C.lIIlllIlll[C.lIIllllIIl[119]] = C."Lever E";
        C.lIIlllIlll[C.lIIllllIIl[120]] = C."Pull";
        C.lIIlllIlll[C.lIIllllIIl[122]] = C."Nav to f";
        C.lIIlllIlll[C.lIIllllIIl[123]] = C."Pull lever";
        C.lIIlllIlll[C.lIIllllIIl[124]] = C."Lever F";
        C.lIIlllIlll[C.lIIllllIIl[125]] = C."Pull";
        C.lIIlllIlll[C.lIIllllIIl[128]] = C."Move to door";
        C.lIIlllIlll[C.lIIllllIIl[129]] = C."Door";
        C.lIIlllIlll[C.lIIllllIIl[130]] = C."Open";
        C.lIIlllIlll[C.lIIllllIIl[132]] = C."Move to door";
        C.lIIlllIlll[C.lIIllllIIl[133]] = C."Door";
        C.lIIlllIlll[C.lIIllllIIl[134]] = C."Open";
        C.lIIlllIlll[C.lIIllllIIl[135]] = C."Pull lever";
        C.lIIlllIlll[C.lIIllllIIl[136]] = C."Lever C";
        C.lIIlllIlll[C.lIIllllIIl[137]] = C."Pull";
        C.lIIlllIlll[C.lIIllllIIl[139]] = C."Move to door";
        C.lIIlllIlll[C.lIIllllIIl[140]] = C."Door";
        C.lIIlllIlll[C.lIIllllIIl[141]] = C."Open";
        C.lIIlllIlll[C.lIIllllIIl[142]] = C."Move to door";
        C.lIIlllIlll[C.lIIllllIIl[143]] = C."Door";
        C.lIIlllIlll[C.lIIllllIIl[144]] = C."Open";
        C.lIIlllIlll[C.lIIllllIIl[145]] = C."Nav to e";
        C.lIIlllIlll[C.lIIllllIIl[146]] = C."Pull lever";
        C.lIIlllIlll[C.lIIllllIIl[147]] = C."Lever E";
        C.lIIlllIlll[C.lIIllllIIl[148]] = C."Pull";
        C.lIIlllIlll[C.lIIllllIIl[149]] = C."Move to door";
        C.lIIlllIlll[C.lIIllllIIl[150]] = C."Door";
        C.lIIlllIlll[C.lIIllllIIl[151]] = C."Open";
        C.lIIlllIlll[C.lIIllllIIl[153]] = C."Move to door";
        C.lIIlllIlll[C.lIIllllIIl[154]] = C."Door";
        C.lIIlllIlll[C.lIIllllIIl[155]] = C."Open";
        C.lIIlllIlll[C.lIIllllIIl[156]] = C."Opening 145";
        C.lIIlllIlll[C.lIIllllIIl[158]] = C."Open";
        C.lIIlllIlll[C.lIIllllIIl[160]] = C."Open";
        C.lIIlllIlll[C.lIIllllIIl[163]] = C."Oil can";
        C.lIIlllIlll[C.lIIllllIIl[164]] = C."Oil can";
        C.lIIlllIlll[C.lIIllllIIl[165]] = C."Take";
        C.lIIlllIlll[C.lIIllllIIl[166]] = C."Rubber tube";
        C.lIIlllIlll[C.lIIllllIIl[167]] = C."Oil can";
        C.lIIlllIlll[C.lIIllllIIl[168]] = C."Open";
        C.lIIlllIlll[C.lIIllllIIl[169]] = C."Nav to professor";
        C.lIIlllIlll[C.lIIllllIIl[170]] = C."Open";
        C.lIIlllIlll[C.lIIllllIIl[171]] = C."Professor Oddenstein";
        C.lIIlllIlll[C.lIIllllIIl[172]] = C."Nav to professor";
        C.lIIlllIlll[C.lIIllllIIl[173]] = C."Open";
        C.lIIlllIlll[C.lIIllllIIl[174]] = C."Professor Oddenstein";
        C.lIIlllIlll[C.lIIllllIIl[180]] = C."Ernest the Chicken";
        C.lIIlllIlll[C.lIIllllIIl[181]] = C."ring of wealth (";
        C.lIIlllIlll[C.lIIllllIIl[182]] = C."Door";
        C.lIIlllIlll[C.lIIllllIIl[183]] = C."Open";
        C.lIIlllIlll[C.lIIllllIIl[185]] = C."Door";
        C.lIIlllIlll[C.lIIllllIIl[186]] = C."Open";
        C.lIIlllIlll[C.lIIllllIIl[193]] = C."Yes.";
        C.lIIlllIlll[C.lIIllllIIl[194]] = C."I'm looking for a guy called Ernest.";
        C.lIIlllIlll[C.lIIllllIIl[195]] = C."I'm glad Veronica didn't actually get engaged to a chicken.";
    }

    private static boolean lIIIIllIIIllI(int n2) {
        return n2 < 0;
    }

    @Override
    public boolean S() {
        return lIIllllIIl[1];
    }

    private static boolean lIIIIllIIlIII(int n2, int n3) {
        return n2 <= n3;
    }

    static {
        C.lIIIIlIllllll();
        C.lIIIIlIllIIIl();
        bv = new ArrayList<d>();
        cg = new WorldPoint(lIIllllIIl[64], lIIllllIIl[187], lIIllllIIl[1]);
        hS = new WorldPoint(lIIllllIIl[188], lIIllllIIl[189], lIIllllIIl[1]);
        hT = new WorldPoint(lIIllllIIl[161], lIIllllIIl[190], lIIllllIIl[1]);
        hU = new WorldPoint(lIIllllIIl[191], lIIllllIIl[192], lIIllllIIl[1]);
        hV = new WorldPoint(lIIllllIIl[64], lIIllllIIl[45], lIIllllIIl[3]);
        hW = lIIllllIIl[47];
        String[] stringArray = new String[lIIllllIIl[8]];
        stringArray[C.lIIllllIIl[1]] = lIIlllIlll[lIIllllIIl[193]];
        stringArray[C.lIIllllIIl[0]] = lIIlllIlll[lIIllllIIl[194]];
        stringArray[C.lIIllllIIl[3]] = lIIlllIlll[lIIllllIIl[195]];
        bR = stringArray;
        hX = new WorldArea(lIIllllIIl[188], lIIllllIIl[196], lIIllllIIl[50], lIIllllIIl[40], lIIllllIIl[1]);
    }

    private static void af() {
        block14: {
            d var25;
            block13: {
                block12: {
                    block11: {
                        Object var8;
                        int[] nArray = new int[lIIllllIIl[0]];
                        nArray[C.lIIllllIIl[1]] = lIIllllIIl[6];
                        if (C.lIIIIllIIIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                            d d2 = new d(lIIllllIIl[6], lIIllllIIl[10], lIIllllIIl[175]);
                            bv.add(d2);
                            0;
                        }
                        int[] nArray2 = new int[lIIllllIIl[0]];
                        nArray2[C.lIIllllIIl[1]] = lIIllllIIl[7];
                        if (C.lIIIIllIIIIll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            var8 = new d(lIIllllIIl[7], lIIllllIIl[0], lIIllllIIl[175]);
                            bv.add((d)var8);
                            0;
                        }
                        int[] nArray3 = new int[lIIllllIIl[0]];
                        nArray3[C.lIIllllIIl[1]] = lIIllllIIl[9];
                        if (C.lIIIIllIIIIll(Bank.contains((int[])nArray3) ? 1 : 0)) {
                            var8 = new d(lIIllllIIl[9], lIIllllIIl[0], lIIllllIIl[175]);
                            bv.add((d)var8);
                            0;
                        }
                        if (C.lIIIIllIIIIll(Bank.contains((Predicate)(var8 = item -> item.getName().toLowerCase().contains(lIIlllIlll[lIIllllIIl[181]]))) ? 1 : 0)) {
                            var25 = new d(lIIllllIIl[176], lIIllllIIl[14], lIIllllIIl[177]);
                            bv.add(var25);
                            0;
                        }
                        int[] nArray4 = new int[lIIllllIIl[0]];
                        nArray4[C.lIIllllIIl[1]] = lIIllllIIl[12];
                        if (C.lIIIIllIIIIll(Bank.contains((int[])nArray4) ? 1 : 0)) {
                            var25 = new d(lIIllllIIl[12], lIIllllIIl[4], i.bq);
                            bv.add(var25);
                            0;
                        }
                        int[] nArray5 = new int[lIIllllIIl[0]];
                        nArray5[C.lIIllllIIl[1]] = lIIllllIIl[13];
                        if (!C.lIIIIllIIIIIl(Bank.contains((int[])nArray5) ? 1 : 0)) break block11;
                        int[] nArray6 = new int[lIIllllIIl[0]];
                        nArray6[C.lIIllllIIl[1]] = lIIllllIIl[13];
                        if (!C.lIIIIllIIIIIl(Bank.contains((int[])nArray6) ? 1 : 0)) break block12;
                        int[] nArray7 = new int[lIIllllIIl[0]];
                        nArray7[C.lIIllllIIl[1]] = lIIllllIIl[13];
                        if (!C.lIIIIllIIIIlI(Bank.getFirst((int[])nArray7).getQuantity(), lIIllllIIl[14])) break block12;
                    }
                    var25 = new d(lIIllllIIl[13], lIIllllIIl[10], lIIllllIIl[178]);
                    bv.add(var25);
                    0;
                }
                int[] nArray = new int[lIIllllIIl[0]];
                nArray[C.lIIllllIIl[1]] = lIIllllIIl[5];
                if (!C.lIIIIllIIIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block13;
                int[] nArray8 = new int[lIIllllIIl[0]];
                nArray8[C.lIIllllIIl[1]] = lIIllllIIl[5];
                if (!C.lIIIIllIIIIIl(Bank.contains((int[])nArray8) ? 1 : 0)) break block14;
                int[] nArray9 = new int[lIIllllIIl[0]];
                nArray9[C.lIIllllIIl[1]] = lIIllllIIl[5];
                if (!C.lIIIIllIIIIlI(Bank.getFirst((int[])nArray9).getQuantity(), lIIllllIIl[27])) break block14;
            }
            var25 = new d(lIIllllIIl[5], lIIllllIIl[57], lIIllllIIl[179]);
            bv.add(var25);
            0;
        }
    }

    private static boolean lIIIIllIIIlll(int n2, int n3) {
        return n2 > n3;
    }

    private static String lIIIIlIlIIlII(String var7, String var2) {
        try {
            SecretKeySpec var22 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), lIIllllIIl[16]), "DES");
            Cipher var31 = Cipher.getInstance("DES");
            var31.init(lIIllllIIl[3], var22);
            return new String(var31.doFinal(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIllIIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public int T() {
        try {
            C.bH();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        
        }
        return lIIllllIIl[144];
    }

    private static String lIIIIlIlIIIll(String var26, String var9) {
        try {
            SecretKeySpec var18 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var9.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var1 = Cipher.getInstance("Blowfish");
            var1.init(lIIllllIIl[3], var18);
            return new String(var1.doFinal(Base64.getDecoder().decode(var26.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }
}

