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
package i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i;

import gg.squire.account.AccBuilderRat;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.M;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.P;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.a;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.b;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.d;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.e;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.f;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.g;
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

public class x
implements M {
    public static /* synthetic */ List<d> bA;
    private static /* synthetic */ int[] lIIlIIIIllIII;
    private static /* synthetic */ String[] lIIlIIIIlIllI;
    public static /* synthetic */ WorldPoint fT;
    static /* synthetic */ WorldArea fY;
    static /* synthetic */ String[] bW;
    public static /* synthetic */ boolean by;
    static /* synthetic */ int co;
    static /* synthetic */ boolean cp;
    public static /* synthetic */ WorldPoint fd;
    static /* synthetic */ int fX;
    public static /* synthetic */ WorldPoint fW;
    public static /* synthetic */ WorldPoint fV;
    public static /* synthetic */ WorldPoint fU;

    private static void lIlIlIIIIIIIllI() {
        lIIlIIIIllIII = new int[198];
        x.lIIlIIIIllIII[0] = 1;
        x.lIIlIIIIllIII[1] = (0x5E ^ 0x3C) & ~(0xDA ^ 0xB8);
        x.lIIlIIIIllIII[2] = -(0xFFFF9CBF & 0x6F77) & (0xFFFF9FBF & 0x7FFE);
        x.lIIlIIIIllIII[3] = 2;
        x.lIIlIIIIllIII[4] = 0xF8 ^ 0x9C ^ (0x6C ^ 0xC);
        x.lIIlIIIIllIII[5] = 0xFFFFFFF7 & 0x1F4F;
        x.lIIlIIIIllIII[6] = -(0xFFFFFB55 & 0x37AB) & (0xFFFFFF9F & Short.MAX_VALUE);
        x.lIIlIIIIllIII[7] = 0xFFFF9FBB & 0x63FC;
        x.lIIlIIIIllIII[8] = 3;
        x.lIIlIIIIllIII[9] = -(0xFFFFBF6B & 0x72FF) & (0xFFFFB77B & 0x7BFF);
        x.lIIlIIIIllIII[10] = 0x99 ^ 0x93;
        x.lIIlIIIIllIII[11] = -(0xFFFFFABE & 0x75C9) & (0xFFFFF3D7 & 0x7DBF);
        x.lIIlIIIIllIII[12] = 0xFFFFB375 & 0x7DDB;
        x.lIIlIIIIllIII[13] = 0xFFFFE3FF & 0x1D7B;
        x.lIIlIIIIllIII[14] = 0x99 ^ 0xBD ^ (0x62 ^ 0x43);
        x.lIIlIIIIllIII[15] = 3 + 12 - -142 + 23 ^ 119 + 86 - 169 + 98;
        x.lIIlIIIIllIII[16] = 0x82 ^ 0x8A;
        x.lIIlIIIIllIII[17] = 0x32 ^ 0x6A ^ (0x42 ^ 0x1C);
        x.lIIlIIIIllIII[18] = 0xAC ^ 0xAB;
        x.lIIlIIIIllIII[19] = -(0xFFFFAEF6 & 0x7F8F) & (0xFFFFAF97 & Short.MAX_VALUE);
        x.lIIlIIIIllIII[20] = 0x15 ^ 0x1C;
        x.lIIlIIIIllIII[21] = 0xFFFF8C3C & 0x7FE7;
        x.lIIlIIIIllIII[22] = 0xFFFFBF3F & 0x4DDD;
        x.lIIlIIIIllIII[23] = 0x1C ^ 0x27 ^ (0x73 ^ 0x43);
        x.lIIlIIIIllIII[24] = 6 ^ 0xA;
        x.lIIlIIIIllIII[25] = 3 ^ 0x15 ^ (0x7F ^ 0x64);
        x.lIIlIIIIllIII[26] = 0x1D ^ 0x3B ^ (0x6D ^ 0x45);
        x.lIIlIIIIllIII[27] = 0x10 ^ 0x1F;
        x.lIIlIIIIllIII[28] = 0xAF ^ 0xBF;
        x.lIIlIIIIllIII[29] = 0x88 ^ 0x99;
        x.lIIlIIIIllIII[30] = 0x9A ^ 0x88;
        x.lIIlIIIIllIII[31] = 2 ^ (0x93 ^ 0x82);
        x.lIIlIIIIllIII[32] = 0x72 ^ 0x10 ^ (0x68 ^ 0x1E);
        x.lIIlIIIIllIII[33] = 0x97 ^ 0x82;
        x.lIIlIIIIllIII[34] = 10 + 119 - 35 + 53 ^ 130 + 120 - 135 + 18;
        x.lIIlIIIIllIII[35] = 0x2C ^ 0x3B;
        x.lIIlIIIIllIII[36] = 0xBC ^ 0xA4;
        x.lIIlIIIIllIII[37] = 27 + 36 - -55 + 49 ^ 100 + 64 - 59 + 85;
        x.lIIlIIIIllIII[38] = 0xB8 ^ 0xA2;
        x.lIIlIIIIllIII[39] = 0x77 ^ 0x6C;
        x.lIIlIIIIllIII[40] = 0xA3 ^ 0xBF;
        x.lIIlIIIIllIII[41] = 0x58 ^ 7 ^ (0x1C ^ 0x5E);
        x.lIIlIIIIllIII[42] = 0x82 ^ 0x9C;
        x.lIIlIIIIllIII[43] = -(0xFFFFF8DF & 0x57B9) & (0xFFFFDCFB & 0x7FBF);
        x.lIIlIIIIllIII[44] = 0xFFFFEDE7 & 0x1F3F;
        x.lIIlIIIIllIII[45] = -(0xFFFFFEED & 0x73DB) & (0xFFFFFFEF & 0x7FFE);
        x.lIIlIIIIllIII[46] = 0xA3 ^ 0x82 ^ (0x32 ^ 0xC);
        x.lIIlIIIIllIII[47] = 0x79 ^ 0x42 ^ (0x1B ^ 0);
        x.lIIlIIIIllIII[48] = 0x3D ^ 0x1C;
        x.lIIlIIIIllIII[49] = 144 + 172 - 238 + 103 ^ 85 + 140 - 164 + 90;
        x.lIIlIIIIllIII[50] = 99 + 19 - 47 + 58 ^ 79 + 99 - 55 + 39;
        x.lIIlIIIIllIII[51] = 0x9A ^ 0xBE;
        x.lIIlIIIIllIII[52] = 153 + 29 - 107 + 92 ^ 109 + 89 - 82 + 14;
        x.lIIlIIIIllIII[53] = 0xA5 ^ 0x83;
        x.lIIlIIIIllIII[54] = 0xFFFFBD7E & 0x4E93;
        x.lIIlIIIIllIII[55] = -(0xFFFFFA3F & 0x55E3) & (0xFFFFDFBF & 0x7D7B);
        x.lIIlIIIIllIII[56] = 0x3E ^ 0x70 ^ (0x5B ^ 0x32);
        x.lIIlIIIIllIII[57] = 0x95 ^ 0xBD;
        x.lIIlIIIIllIII[58] = 0x77 ^ 0x5E;
        x.lIIlIIIIllIII[59] = 0x23 ^ 0x1D ^ (8 ^ 0x1C);
        x.lIIlIIIIllIII[60] = 0x5F ^ 0x74;
        x.lIIlIIIIllIII[61] = -(0xFFFFFD6B & 0x5BDE) & (0xFFFFFFFB & 0x7F5F);
        x.lIIlIIIIllIII[62] = -(0xFFFFBAE3 & 0x77DD) & (0xFFFFBFEC & 0x7EFF);
        x.lIIlIIIIllIII[63] = -(0xFFFF9FBF & 0x70E6) & (0xFFFFB7FF & 0x7EBD);
        x.lIIlIIIIllIII[64] = -(0xFFFFBB61 & 0x75DF) & (0xFFFFFD7F & 0x3FE6);
        x.lIIlIIIIllIII[65] = -(0xFFFFD7D9 & 0x29AF) & (0xFFFFA7BB & 0x7FED);
        x.lIIlIIIIllIII[66] = 0xFFFFBEBF & 0x6765;
        x.lIIlIIIIllIII[67] = -(0xFFFFD3EF & 0x7D97) & (0xFFFFDDDF & 0x7FBF);
        x.lIIlIIIIllIII[68] = -(0xFFFFF4D3 & 0x4BFF) & (0xFFFFCFF7 & 0x7CFB);
        x.lIIlIIIIllIII[69] = 0xFFFFFF9E & 0x267F;
        x.lIIlIIIIllIII[70] = 0xFFFFAF7F & 0x5C97;
        x.lIIlIIIIllIII[71] = 0xFFFFF663 & 0x2FBF;
        x.lIIlIIIIllIII[72] = 0xFFFFAFDD & 0x5C3E;
        x.lIIlIIIIllIII[73] = 0xFFFFB7BD & 0x6E53;
        x.lIIlIIIIllIII[74] = 0xFFFF8EFF & 0x77FC;
        x.lIIlIIIIllIII[75] = 0xFFFF97FF & 0x6EFF;
        x.lIIlIIIIllIII[76] = 0x69 ^ 0x73 ^ (0x67 ^ 0x51);
        x.lIIlIIIIllIII[77] = 0x2B ^ 6;
        x.lIIlIIIIllIII[78] = 0x74 ^ 0x2D ^ (0x6D ^ 0x1A);
        x.lIIlIIIIllIII[79] = 110 + 21 - 115 + 133 ^ 80 + 121 - 103 + 88;
        x.lIIlIIIIllIII[80] = -(0xFFFFF96B & 0x2797) & (0xFFFFAFFF & 0x77FF);
        x.lIIlIIIIllIII[81] = 0x2C ^ 0x7C ^ (0x3B ^ 0x5B);
        x.lIIlIIIIllIII[82] = 0x75 ^ 0x35 ^ (0x34 ^ 0x45);
        x.lIIlIIIIllIII[83] = 108 + 85 - 189 + 140 ^ 88 + 57 - 119 + 137;
        x.lIIlIIIIllIII[84] = -(0xFFFFA977 & 0x57EB) & (0xFFFFA7FF & 0x7F7F);
        x.lIIlIIIIllIII[85] = 65 + 50 - 76 + 203 ^ 3 + 186 - 166 + 175;
        x.lIIlIIIIllIII[86] = 0x5C ^ 5 ^ (0x59 ^ 0x35);
        x.lIIlIIIIllIII[87] = 0x36 ^ 0x7F ^ 0 + 74 - -26 + 27;
        x.lIIlIIIIllIII[88] = 0xEC ^ 0x8C ^ (0xC1 ^ 0x96);
        x.lIIlIIIIllIII[89] = 0x11 ^ 0x77 ^ (0x24 ^ 0x7A);
        x.lIIlIIIIllIII[90] = 0x75 ^ 0x4C;
        x.lIIlIIIIllIII[91] = -(49 + 62 - -79 + 35) & (0xFFFFFEFF & 0x27FF);
        x.lIIlIIIIllIII[92] = 0x77 ^ 0x56 ^ (0x3B ^ 0x20);
        x.lIIlIIIIllIII[93] = 104 + 107 - 158 + 197 ^ 133 + 136 - 256 + 180;
        x.lIIlIIIIllIII[94] = 0x7E ^ 0x46 ^ (0x9E ^ 0x9A);
        x.lIIlIIIIllIII[95] = 0xBF ^ 0x8E ^ (0x68 ^ 0x64);
        x.lIIlIIIIllIII[96] = 0xB6 ^ 0xBE ^ (0x68 ^ 0x5E);
        x.lIIlIIIIllIII[97] = 0x2A ^ 0x4B ^ (0x45 ^ 0x1B);
        x.lIIlIIIIllIII[98] = 0x16 ^ 0x2D ^ (0xE9 ^ 0x92);
        x.lIIlIIIIllIII[99] = 24 + 56 - -16 + 35 ^ 171 + 117 - 116 + 22;
        x.lIIlIIIIllIII[100] = 0xD ^ 0x26 ^ (0xAC ^ 0xC5);
        x.lIIlIIIIllIII[101] = 0x36 ^ 0x75;
        x.lIIlIIIIllIII[102] = 0x42 ^ 6;
        x.lIIlIIIIllIII[103] = -(0xFFFFBEAF & 0x59D3) & (0xFFFFFFFA & 0x1F87);
        x.lIIlIIIIllIII[104] = -(0xFFFFF32A & 0x7FD7) & (0xFFFFFF5F & 0x7FBF);
        x.lIIlIIIIllIII[105] = 0xEB ^ 0xAE;
        x.lIIlIIIIllIII[106] = 0x1C ^ 0x5A;
        x.lIIlIIIIllIII[107] = 0x7D ^ 0x3A;
        x.lIIlIIIIllIII[108] = 0xFFFFAEBD & 0x5D5F;
        x.lIIlIIIIllIII[109] = 0xFFFFAE6F & 0x77B0;
        x.lIIlIIIIllIII[110] = 151 + 113 - 84 + 63 ^ 6 + 10 - -38 + 133;
        x.lIIlIIIIllIII[111] = 0xF ^ 0x46;
        x.lIIlIIIIllIII[112] = 69 + 152 - 81 + 53 ^ 36 + 50 - 65 + 118;
        x.lIIlIIIIllIII[113] = 0xFFFFEE6E & 0x37B3;
        x.lIIlIIIIllIII[114] = 0x33 ^ 0x78;
        x.lIIlIIIIllIII[115] = 5 ^ 0x49;
        x.lIIlIIIIllIII[116] = 0x72 ^ 0x62 ^ (0x15 ^ 0x48);
        x.lIIlIIIIllIII[117] = 0x6E ^ 0x20;
        x.lIIlIIIIllIII[118] = 0x59 ^ 5 ^ (0x90 ^ 0x83);
        x.lIIlIIIIllIII[119] = 164 + 25 - 158 + 191 ^ 70 + 14 - -46 + 12;
        x.lIIlIIIIllIII[120] = 0xC3 ^ 0x92;
        x.lIIlIIIIllIII[121] = 0xFFFF9F0D & 0x67F3;
        x.lIIlIIIIllIII[122] = 0x56 ^ 4;
        x.lIIlIIIIllIII[123] = 0x31 ^ 0x62;
        x.lIIlIIIIllIII[124] = 0x6D ^ 0x39;
        x.lIIlIIIIllIII[125] = 0xC2 ^ 0xA8 ^ (0xC ^ 0x33);
        x.lIIlIIIIllIII[126] = -(0xFFFFD94F & 0x3FB2) & (0xFFFF9FFF & Short.MAX_VALUE);
        x.lIIlIIIIllIII[127] = 0xFFFFBC7B & 0x4F9F;
        x.lIIlIIIIllIII[128] = 0x53 ^ 0x28 ^ (0x61 ^ 0x4C);
        x.lIIlIIIIllIII[129] = 151 + 119 - 197 + 139 ^ 117 + 12 - 33 + 35;
        x.lIIlIIIIllIII[130] = 0x38 ^ 0xF ^ (0x26 ^ 0x49);
        x.lIIlIIIIllIII[131] = -(0xFFFFCB7D & 0x36D6) & (0xFFFF9EFF & 0x6F73);
        x.lIIlIIIIllIII[132] = 0xE3 ^ 0xBA;
        x.lIIlIIIIllIII[133] = 0xEB ^ 0xA8 ^ (0x16 ^ 0xF);
        x.lIIlIIIIllIII[134] = 0x57 ^ 0x13 ^ (0x5D ^ 0x42);
        x.lIIlIIIIllIII[135] = 0xED ^ 0xB1;
        x.lIIlIIIIllIII[136] = 0x76 ^ 0x2B;
        x.lIIlIIIIllIII[137] = 0x74 ^ 0x53 ^ (0x61 ^ 0x18);
        x.lIIlIIIIllIII[138] = -(0xFFFFF7DD & 0x69B3) & (0xFFFFFDF7 & 0x6FBA);
        x.lIIlIIIIllIII[139] = 0xC4 ^ 0x9B;
        x.lIIlIIIIllIII[140] = 0x65 ^ 5;
        x.lIIlIIIIllIII[141] = 0xA1 ^ 0xC0;
        x.lIIlIIIIllIII[142] = 131 + 14 - 38 + 55 ^ 149 + 108 - 83 + 18;
        x.lIIlIIIIllIII[143] = 0xC8 ^ 0xAB;
        x.lIIlIIIIllIII[144] = 0x11 ^ 0x23 ^ (0x78 ^ 0x2E);
        x.lIIlIIIIllIII[145] = 0x51 ^ 0x34;
        x.lIIlIIIIllIII[146] = 0x78 ^ 0x66 ^ (0xB8 ^ 0xC0);
        x.lIIlIIIIllIII[147] = 0x4E ^ 0x29;
        x.lIIlIIIIllIII[148] = 228 + 203 - 367 + 187 ^ 123 + 6 - 17 + 35;
        x.lIIlIIIIllIII[149] = 0x31 ^ 0x58;
        x.lIIlIIIIllIII[150] = 154 + 196 - 302 + 169 ^ 56 + 74 - 47 + 96;
        x.lIIlIIIIllIII[151] = 81 + 203 - 254 + 180 ^ 20 + 148 - 19 + 36;
        x.lIIlIIIIllIII[152] = 0xFFFFEF35 & 0x36EE;
        x.lIIlIIIIllIII[153] = 54 + 49 - -14 + 10 ^ (0x10 ^ 3);
        x.lIIlIIIIllIII[154] = 0x7D ^ 0x6F ^ 106 + 83 - 130 + 68;
        x.lIIlIIIIllIII[155] = 0xEF ^ 0xC1 ^ (0xFC ^ 0xBC);
        x.lIIlIIIIllIII[156] = 149 + 0 - 75 + 151 ^ 118 + 96 - 138 + 66;
        x.lIIlIIIIllIII[157] = (0x87 ^ 0xA2) + (0x30 ^ 0x3B) - (0xBD ^ 0xB3) + (0xC4 ^ 0xAB);
        x.lIIlIIIIllIII[158] = (0x6A ^ 0x41) & ~(0x81 ^ 0xAA) ^ (0xCD ^ 0xBD);
        x.lIIlIIIIllIII[159] = 2 + 24 - -97 + 10 + (0x52 ^ 0x22) - (41 + 29 - -51 + 84) + (0xD0 ^ 0xB5);
        x.lIIlIIIIllIII[160] = 241 + 158 - 315 + 166 ^ 81 + 102 - 81 + 37;
        x.lIIlIIIIllIII[161] = 0xFFFFCC33 & 0x3FDD;
        x.lIIlIIIIllIII[162] = -(0xFFFF8B7B & 0x7CE7) & (0xFFFFEEFF & 0x3F7B);
        x.lIIlIIIIllIII[163] = 0x48 ^ 0x3A;
        x.lIIlIIIIllIII[164] = 0xFC ^ 0xB0 ^ (0x33 ^ 0xC);
        x.lIIlIIIIllIII[165] = 0xC4 ^ 0xB0;
        x.lIIlIIIIllIII[166] = 0x1E ^ 0x2A ^ (0x30 ^ 0x71);
        x.lIIlIIIIllIII[167] = 177 + 79 - 26 + 14 ^ 109 + 49 - 111 + 83;
        x.lIIlIIIIllIII[168] = 0x77 ^ 0x13 ^ (0x57 ^ 0x44);
        x.lIIlIIIIllIII[169] = 0x4A ^ 0x32;
        x.lIIlIIIIllIII[170] = 0x75 ^ 0x23 ^ (0x12 ^ 0x3D);
        x.lIIlIIIIllIII[171] = 205 + 59 - 187 + 146 ^ 151 + 111 - 117 + 20;
        x.lIIlIIIIllIII[172] = 0xE0 ^ 0x9B;
        x.lIIlIIIIllIII[173] = 0x4E ^ 0x32;
        x.lIIlIIIIllIII[174] = 0x1A ^ 0x7E ^ (0x9C ^ 0x85);
        x.lIIlIIIIllIII[175] = -(0xFFFFCBFB & 0x7FFE) & (0xFFFFEFFF & 0x7FFD);
        x.lIIlIIIIllIII[176] = 0xFFFFFECC & 0x2FFF;
        x.lIIlIIIIllIII[177] = 0xFFFFE3BC & 0x7DEB;
        x.lIIlIIIIllIII[178] = 0xFFFFEFBE & 0x116D;
        x.lIIlIIIIllIII[179] = -(0xFFFFDFEB & 0x6AFE) & (0xFFFFCFFF & 0x7FFD);
        x.lIIlIIIIllIII[180] = 0xB9 ^ 0xC7;
        x.lIIlIIIIllIII[181] = (0x98 ^ 0xAB) + (0xC5 ^ 0xB5) - (120 + 44 - 77 + 57) + (0xD7 ^ 0xBB);
        x.lIIlIIIIllIII[182] = 102 + 74 - 114 + 66;
        x.lIIlIIIIllIII[183] = (0x5F ^ 0x7F) + (0xA0 ^ 0xAB) - -(0x13 ^ 0x5B) + (0x93 ^ 0x9D);
        x.lIIlIIIIllIII[184] = -(0xFFFFFFE9 & 0x325F) & (0xFFFFFF7D & 0x3FEF);
        x.lIIlIIIIllIII[185] = (0x25 ^ 0x1B) + (0x49 ^ 0x71) - (0x3B ^ 4) + (0x45 ^ 0xE);
        x.lIIlIIIIllIII[186] = 125 + 60 - 81 + 27;
        x.lIIlIIIIllIII[187] = -(0xFFFFF8BF & 0x37EB) & (0xFFFFFFEF & 0x3DBB);
        x.lIIlIIIIllIII[188] = 0xFFFFDE7F & 0x2D8F;
        x.lIIlIIIIllIII[189] = -(0xFFFFFE7B & 0x73DF) & (0xFFFFFFFE & 0x7F7B);
        x.lIIlIIIIllIII[190] = -(0xFFFFF57F & 0x3AC4) & (0xFFFFBFEB & 0x7D5F);
        x.lIIlIIIIllIII[191] = -(0xFFFFBBE7 & 0x77FA) & (0xFFFFFFFF & 0x3FF7);
        x.lIIlIIIIllIII[192] = -(0xFFFFF6E5 & 0x69BB) & (0xFFFFFDFF & 0x6FBF);
        x.lIIlIIIIllIII[193] = 98 + 103 - 180 + 111;
        x.lIIlIIIIllIII[194] = 109 + 125 - 177 + 76;
        x.lIIlIIIIllIII[195] = 109 + 121 - 161 + 65;
        x.lIIlIIIIllIII[196] = 0xFFFFBF5F & 0x66AF;
        x.lIIlIIIIllIII[197] = 31 + 65 - 68 + 107;
    }

    private static boolean lIlIlIIIIIIlIlI(int n2) {
        return n2 == 0;
    }

    private static String lIlIIllllllIIll(String var13, String var35) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var35.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var9 = Cipher.getInstance("Blowfish");
            var9.init(lIIlIIIIllIII[3], var8);
            return new String(var9.doFinal(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIIIIIIlIll(Object object) {
        return object != null;
    }

    private static boolean lIlIlIIIIIIllII(int n2) {
        return n2 > 0;
    }

    static {
        x.lIlIlIIIIIIIllI();
        x.lIlIlIIIIIIIlIl();
        bA = new ArrayList<d>();
        fd = new WorldPoint(lIIlIIIIllIII[64], lIIlIIIIllIII[187], lIIlIIIIllIII[1]);
        fT = new WorldPoint(lIIlIIIIllIII[188], lIIlIIIIllIII[189], lIIlIIIIllIII[1]);
        fU = new WorldPoint(lIIlIIIIllIII[161], lIIlIIIIllIII[190], lIIlIIIIllIII[1]);
        fV = new WorldPoint(lIIlIIIIllIII[191], lIIlIIIIllIII[192], lIIlIIIIllIII[1]);
        fW = new WorldPoint(lIIlIIIIllIII[64], lIIlIIIIllIII[45], lIIlIIIIllIII[3]);
        fX = lIIlIIIIllIII[47];
        String[] stringArray = new String[lIIlIIIIllIII[8]];
        stringArray[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[193]];
        stringArray[x.lIIlIIIIllIII[0]] = lIIlIIIIlIllI[lIIlIIIIllIII[194]];
        stringArray[x.lIIlIIIIllIII[3]] = lIIlIIIIlIllI[lIIlIIIIllIII[195]];
        bW = stringArray;
        fY = new WorldArea(lIIlIIIIllIII[188], lIIlIIIIllIII[196], lIIlIIIIllIII[50], lIIlIIIIllIII[40], lIIlIIIIllIII[1]);
    }

    private static boolean lIlIlIIIIIIlIII(int n2) {
        return n2 != 0;
    }

    private static void lIlIlIIIIIIIlIl() {
        lIIlIIIIlIllI = new String[lIIlIIIIllIII[197]];
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[1]] = x."Finished buying items, switching back to quest";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[0]] = x."Nav to bank";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[3]] = x."Handling banking";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[8]] = x."We are missing quest supplies, switching to BUYING";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[4]] = x."Drink";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[14]] = x."Eat";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[17]] = x."Nav to start";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[18]] = x."Start quest";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[16]] = x."Veronica";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[20]] = x."Key";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[10]] = x."Nav to fish food";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[23]] = x."Can't reach, navigating";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[24]] = x."Taking food";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[25]] = x."Take";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[26]] = x."Making poison fish food";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[27]] = x."Key";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[28]] = x."Nav to compost";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[29]] = x."Digging";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[30]] = x."Compost heap";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[31]] = x."Search";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[32]] = x."Key";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[33]] = x."Nav to fountain";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[34]] = x."Fountain";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[35]] = x."Key";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[36]] = x."Pressure gauge";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[37]] = x."Getting guage";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[38]] = x."Fountain";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[39]] = x."Search";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[40]] = x."Key";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[41]] = x."Pressure gauge";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[42]] = x."Rubber tube";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[46]] = x."Nav to door";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[47]] = x."Door";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[48]] = x."Open";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[49]] = x."Get tube";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[50]] = x."Rubber tube";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[51]] = x."Take";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[52]] = x."Rubber tube";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[53]] = x."Oil can";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[56]] = x."Door";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[57]] = x."Open";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[58]] = x."Nav to final room";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[59]] = x."Ladder";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[60]] = x."Climb-down";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[76]] = x."Nav to a";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[77]] = x."Pull lever";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[78]] = x."Lever A";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[79]] = x."Pull";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[81]] = x."Nav to b";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[82]] = x."Pull lever";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[15]] = x."Lever B";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[83]] = x."Pull";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[85]] = x."Nav to d";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[86]] = x."Door";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[87]] = x."Open";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[88]] = x."Pull lever";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[89]] = x."Lever D";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[90]] = x."Pull";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[92]] = x."Move to door";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[93]] = x."Door";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[94]] = x."Open";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[95]] = x."Nav to b";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[96]] = x."Pull lever";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[97]] = x."Lever B";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[98]] = x."Pull";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[99]] = x."Nav to a";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[100]] = x."Pull lever";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[101]] = x."Lever A";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[102]] = x."Pull";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[105]] = x."Move to door";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[106]] = x."Door";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[107]] = x."Open";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[110]] = x."Move to door";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[111]] = x."Door";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[112]] = x."Open";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[114]] = x."Move to door";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[115]] = x."Door";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[116]] = x."Open";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[117]] = x."Nav to e";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[118]] = x."Pull lever";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[119]] = x."Lever E";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[120]] = x."Pull";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[122]] = x."Nav to f";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[123]] = x."Pull lever";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[124]] = x."Lever F";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[125]] = x."Pull";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[128]] = x."Move to door";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[129]] = x."Door";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[130]] = x."Open";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[132]] = x."Move to door";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[133]] = x."Door";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[134]] = x."Open";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[135]] = x."Pull lever";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[136]] = x."Lever C";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[137]] = x."Pull";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[139]] = x."Move to door";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[140]] = x."Door";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[141]] = x."Open";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[142]] = x."Move to door";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[143]] = x."Door";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[144]] = x."Open";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[145]] = x."Nav to e";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[146]] = x."Pull lever";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[147]] = x."Lever E";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[148]] = x."Pull";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[149]] = x."Move to door";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[150]] = x."Door";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[151]] = x."Open";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[153]] = x."Move to door";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[154]] = x."Door";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[155]] = x."Open";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[156]] = x."Opening 145";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[158]] = x."Open";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[160]] = x."Open";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[163]] = x."Oil can";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[164]] = x."Oil can";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[165]] = x."Take";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[166]] = x."Rubber tube";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[167]] = x."Oil can";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[168]] = x."Open";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[169]] = x."Nav to professor";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[170]] = x."Open";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[171]] = x."Professor Oddenstein";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[172]] = x."Nav to professor";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[173]] = x."Open";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[174]] = x."Professor Oddenstein";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[180]] = x."Ernest the Chicken";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[181]] = x."ring of wealth (";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[182]] = x."Door";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[183]] = x."Open";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[185]] = x."Door";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[186]] = x."Open";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[193]] = x."Yes.";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[194]] = x."I'm looking for a guy called Ernest.";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[195]] = x."I'm glad Veronica didn't actually get engaged to a chicken.";
    }

    private static String lIlIIllllllIIlI(String var15, String var24) {
        var15 = new String(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var11 = new StringBuilder();
        char[] var33 = var24.toCharArray();
        int var23 = lIIlIIIIllIII[1];
        char[] var25 = var15.toCharArray();
        int var7 = var25.length;
        int var5 = lIIlIIIIllIII[1];
        while (x.lIlIlIIIIIIlIIl(var5, var7)) {
            char var30 = var25[var5];
            var11.append((char)(var30 ^ var33[var23 % var33.length]));
            0;
            ++var23;
            ++var5;
            0;
            if (3 >= 2) continue;
            return null;
        }
        return String.valueOf(var11);
    }

    @Override
    public String Z() {
        return lIIlIIIIlIllI[lIIlIIIIllIII[180]];
    }

    public static void bx() {
        block134: {
            BankLocation var4;
            block135: {
                WorldArea var32;
                TileItem var10;
                block137: {
                    block136: {
                        if (x.lIlIlIIIIIIlIII(by ? 1 : 0)) {
                            b.a(bA);
                            if (x.lIlIlIIIIIIlIIl(bA.size(), lIIlIIIIllIII[0])) {
                                System.out.println(lIIlIIIIlIllI[lIIlIIIIllIII[1]]);
                                by = lIIlIIIIllIII[1];
                            }
                        }
                        if (!x.lIlIlIIIIIIlIlI(by ? 1 : 0)) break block134;
                        if (x.lIlIlIIIIIIlIlI(x.S() ? 1 : 0) && x.lIlIlIIIIIIlIIl(e.j(fX), lIIlIIIIllIII[0])) {
                            var4 = BankLocation.getNearest();
                            if (x.lIlIlIIIIIIlIll(var4) && x.lIlIlIIIIIIlIlI(var4.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[0]];
                                a.a(var4);
                            }
                            if (x.lIlIlIIIIIIlIll(var4) && x.lIlIlIIIIIIlIII(var4.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                if (x.lIlIlIIIIIIlIlI(Bank.isOpen() ? 1 : 0)) {
                                    a.a();
                                    Time.sleepUntil(() -> Bank.isOpen(), (int)lIIlIIIIllIII[2]);
                                    0;
                                }
                                if (x.lIlIlIIIIIIlIII(Bank.isOpen() ? 1 : 0)) {
                                    AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[3]];
                                    if (x.lIlIlIIIIIIllII(Inventory.getAll().size())) {
                                        Bank.depositInventory();
                                        Time.sleepTicks((int)lIIlIIIIllIII[4]);
                                        0;
                                    }
                                    if (x.lIlIlIIIIIIllII(Equipment.getAll().size())) {
                                        Bank.depositEquipment();
                                        Time.sleepTicks((int)lIIlIIIIllIII[3]);
                                        0;
                                    }
                                    int[] nArray = new int[lIIlIIIIllIII[4]];
                                    nArray[x.lIIlIIIIllIII[1]] = lIIlIIIIllIII[5];
                                    nArray[x.lIIlIIIIllIII[0]] = lIIlIIIIllIII[6];
                                    nArray[x.lIIlIIIIllIII[3]] = lIIlIIIIllIII[7];
                                    nArray[x.lIIlIIIIllIII[8]] = lIIlIIIIllIII[9];
                                    if (x.lIlIlIIIIIIlIlI(e.b(nArray) ? 1 : 0)) {
                                        x.W();
                                        System.out.println(lIIlIIIIlIllI[lIIlIIIIllIII[8]]);
                                        by = lIIlIIIIllIII[0];
                                        return;
                                    }
                                    int[] nArray2 = new int[lIIlIIIIllIII[4]];
                                    nArray2[x.lIIlIIIIllIII[1]] = lIIlIIIIllIII[5];
                                    nArray2[x.lIIlIIIIllIII[0]] = lIIlIIIIllIII[6];
                                    nArray2[x.lIIlIIIIllIII[3]] = lIIlIIIIllIII[7];
                                    nArray2[x.lIIlIIIIllIII[8]] = lIIlIIIIllIII[9];
                                    if (x.lIlIlIIIIIIlIII(e.b(nArray2) ? 1 : 0)) {
                                        a.a(lIIlIIIIllIII[5], lIIlIIIIllIII[10]);
                                        a.a(lIIlIIIIllIII[6], lIIlIIIIllIII[10]);
                                        a.a(lIIlIIIIllIII[7], lIIlIIIIllIII[0]);
                                        a.a(lIIlIIIIllIII[11], lIIlIIIIllIII[0]);
                                        a.a(lIIlIIIIllIII[9], lIIlIIIIllIII[0]);
                                        a.a(lIIlIIIIllIII[12], lIIlIIIIllIII[0]);
                                        a.a(lIIlIIIIllIII[13], lIIlIIIIllIII[14]);
                                    }
                                }
                            }
                        }
                        if (x.lIlIlIIIIIIlIII(Inventory.contains((int[])f.ba) ? 1 : 0) && x.lIlIlIIIIIIlIIl(Movement.getRunEnergy(), lIIlIIIIllIII[15])) {
                            Inventory.getFirst((int[])f.ba).interact(lIIlIIIIlIllI[lIIlIIIIllIII[4]]);
                            Time.sleepTicks((int)lIIlIIIIllIII[0]);
                            0;
                        }
                        int[] nArray = new int[lIIlIIIIllIII[0]];
                        nArray[x.lIIlIIIIllIII[1]] = lIIlIIIIllIII[13];
                        if (x.lIlIlIIIIIIlIII(Inventory.contains((int[])nArray) ? 1 : 0) && x.lIlIlIIIIIIllIl(x.lIlIlIIIIIIIlll(e.v(), 50.0))) {
                            int[] nArray3 = new int[lIIlIIIIllIII[0]];
                            nArray3[x.lIIlIIIIllIII[1]] = lIIlIIIIllIII[13];
                            Inventory.getFirst((int[])nArray3).interact(lIIlIIIIlIllI[lIIlIIIIllIII[14]]);
                            Time.sleepTicks((int)lIIlIIIIllIII[3]);
                            0;
                        }
                        if (x.lIlIlIIIIIIlIII(x.S() ? 1 : 0) && x.lIlIlIIIIIIlIlI(e.j(fX))) {
                            if (x.lIlIlIIIIIIlllI(Players.getLocal().getWorldLocation().distanceTo(fd), lIIlIIIIllIII[16])) {
                                AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[17]];
                                Movement.walkTo((WorldPoint)fd);
                                0;
                                Time.sleepTicks((int)lIIlIIIIllIII[0]);
                                0;
                            }
                            if (x.lIlIlIIIIIIllll(Players.getLocal().getWorldLocation().distanceTo(fd), lIIlIIIIllIII[16])) {
                                AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[18]];
                                if (x.lIlIlIIIIIIlIII(Dialog.isOpen() ? 1 : 0)) {
                                    Dialog.close();
                                }
                                g.a(lIIlIIIIlIllI[lIIlIIIIllIII[16]], bW);
                            }
                        }
                        if (!x.lIlIlIIIIIlIIII(e.j(fX), lIIlIIIIllIII[0])) break block135;
                        co = lIIlIIIIllIII[1];
                        int[] nArray4 = new int[lIIlIIIIllIII[0]];
                        nArray4[x.lIIlIIIIllIII[1]] = lIIlIIIIllIII[11];
                        if (x.lIlIlIIIIIIlIlI(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                            int[] nArray5 = new int[lIIlIIIIllIII[0]];
                            nArray5[x.lIIlIIIIllIII[1]] = lIIlIIIIllIII[19];
                            if (x.lIlIlIIIIIIlIlI(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                                String[] stringArray = new String[lIIlIIIIllIII[0]];
                                stringArray[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[20]];
                                if (x.lIlIlIIIIIIlIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                    var4 = new WorldPoint(lIIlIIIIllIII[21], lIIlIIIIllIII[22], lIIlIIIIllIII[0]);
                                    int[] nArray6 = new int[lIIlIIIIllIII[0]];
                                    nArray6[x.lIIlIIIIllIII[1]] = lIIlIIIIllIII[11];
                                    if (x.lIlIlIIIIIIlIlI(Inventory.contains((int[])nArray6) ? 1 : 0)) {
                                        if (x.lIlIlIIIIIIlllI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var4), lIIlIIIIllIII[14])) {
                                            AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[10]];
                                            Movement.walkTo((WorldPoint)var4);
                                            0;
                                            Time.sleepTicks((int)lIIlIIIIllIII[0]);
                                            0;
                                        }
                                        if (x.lIlIlIIIIIIllll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var4), lIIlIIIIllIII[14])) {
                                            int[] nArray7 = new int[lIIlIIIIllIII[0]];
                                            nArray7[x.lIIlIIIIllIII[1]] = lIIlIIIIllIII[11];
                                            var10 = TileItems.getNearest((int[])nArray7);
                                            if (x.lIlIlIIIIIIlIll(var10)) {
                                                if (x.lIlIlIIIIIIlIlI(Reachable.isInteractable((Locatable)var10) ? 1 : 0)) {
                                                    AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[23]];
                                                    Movement.walkTo((WorldPoint)var10.getWorldLocation());
                                                    0;
                                                    Time.sleepTicks((int)lIIlIIIIllIII[0]);
                                                    0;
                                                }
                                                if (x.lIlIlIIIIIIlIII(Reachable.isInteractable((Locatable)var10) ? 1 : 0)) {
                                                    AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[24]];
                                                    var10.interact(lIIlIIIIlIllI[lIIlIIIIllIII[25]]);
                                                    Time.sleepTicks((int)lIIlIIIIllIII[8]);
                                                    0;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        int[] nArray8 = new int[lIIlIIIIllIII[0]];
                        nArray8[x.lIIlIIIIllIII[1]] = lIIlIIIIllIII[11];
                        if (!x.lIlIlIIIIIIlIlI(Inventory.contains((int[])nArray8) ? 1 : 0)) break block136;
                        int[] nArray9 = new int[lIIlIIIIllIII[0]];
                        nArray9[x.lIIlIIIIllIII[1]] = lIIlIIIIllIII[19];
                        if (!x.lIlIlIIIIIIlIII(Inventory.contains((int[])nArray9) ? 1 : 0)) break block137;
                    }
                    int[] nArray = new int[lIIlIIIIllIII[0]];
                    nArray[x.lIIlIIIIllIII[1]] = lIIlIIIIllIII[19];
                    if (x.lIlIlIIIIIIlIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray10 = new int[lIIlIIIIllIII[0]];
                        nArray10[x.lIIlIIIIllIII[1]] = lIIlIIIIllIII[11];
                        if (x.lIlIlIIIIIIlIII(Inventory.contains((int[])nArray10) ? 1 : 0)) {
                            AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[26]];
                            int[] nArray11 = new int[lIIlIIIIllIII[0]];
                            nArray11[x.lIIlIIIIllIII[1]] = lIIlIIIIllIII[11];
                            int[] nArray12 = new int[lIIlIIIIllIII[0]];
                            nArray12[x.lIIlIIIIllIII[1]] = lIIlIIIIllIII[9];
                            Inventory.getFirst((int[])nArray11).useOn(Inventory.getFirst((int[])nArray12));
                            Time.sleepTicks((int)lIIlIIIIllIII[0]);
                            0;
                        }
                    }
                    int[] nArray13 = new int[lIIlIIIIllIII[0]];
                    nArray13[x.lIIlIIIIllIII[1]] = lIIlIIIIllIII[19];
                    if (x.lIlIlIIIIIIlIII(Inventory.contains((int[])nArray13) ? 1 : 0)) {
                        String[] stringArray = new String[lIIlIIIIllIII[0]];
                        stringArray[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[27]];
                        if (x.lIlIlIIIIIIlIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                            if (x.lIlIlIIIIIIlllI(Players.getLocal().getWorldLocation().distanceTo(fT), lIIlIIIIllIII[4])) {
                                AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[28]];
                                Movement.walkTo((WorldPoint)fT);
                                0;
                                Time.sleepTicks((int)lIIlIIIIllIII[0]);
                                0;
                            }
                            if (x.lIlIlIIIIIIllll(Players.getLocal().getWorldLocation().distanceTo(fT), lIIlIIIIllIII[4])) {
                                AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[29]];
                                String[] stringArray2 = new String[lIIlIIIIllIII[0]];
                                stringArray2[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[30]];
                                TileObjects.getNearest((String[])stringArray2).interact(lIIlIIIIlIllI[lIIlIIIIllIII[31]]);
                                Time.sleepTicks((int)lIIlIIIIllIII[20]);
                                0;
                            }
                        }
                        String[] stringArray3 = new String[lIIlIIIIllIII[0]];
                        stringArray3[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[32]];
                        if (x.lIlIlIIIIIIlIII(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                            if (x.lIlIlIIIIIIlllI(Players.getLocal().getWorldLocation().distanceTo(fU), lIIlIIIIllIII[8])) {
                                AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[33]];
                                Movement.walkTo((WorldPoint)fU);
                                0;
                                Time.sleepTicks((int)lIIlIIIIllIII[0]);
                                0;
                            }
                            if (x.lIlIlIIIIIIllll(Players.getLocal().getWorldLocation().distanceTo(fU), lIIlIIIIllIII[8])) {
                                int[] nArray14 = new int[lIIlIIIIllIII[0]];
                                nArray14[x.lIIlIIIIllIII[1]] = lIIlIIIIllIII[19];
                                String[] stringArray4 = new String[lIIlIIIIllIII[0]];
                                stringArray4[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[34]];
                                Inventory.getFirst((int[])nArray14).useOn(TileObjects.getNearest((String[])stringArray4));
                                Time.sleepTicks((int)lIIlIIIIllIII[0]);
                                0;
                            }
                        }
                    }
                }
                String[] stringArray = new String[lIIlIIIIllIII[0]];
                stringArray[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[35]];
                if (x.lIlIlIIIIIIlIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    int[] nArray = new int[lIIlIIIIllIII[0]];
                    nArray[x.lIIlIIIIllIII[1]] = lIIlIIIIllIII[19];
                    if (x.lIlIlIIIIIIlIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        String[] stringArray5 = new String[lIIlIIIIllIII[0]];
                        stringArray5[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[36]];
                        if (x.lIlIlIIIIIIlIlI(Inventory.contains((String[])stringArray5) ? 1 : 0)) {
                            AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[37]];
                            if (x.lIlIlIIIIIIlIlI(Dialog.isOpen() ? 1 : 0)) {
                                String[] stringArray6 = new String[lIIlIIIIllIII[0]];
                                stringArray6[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[38]];
                                TileObjects.getNearest((String[])stringArray6).interact(lIIlIIIIlIllI[lIIlIIIIllIII[39]]);
                                Time.sleepTicks((int)lIIlIIIIllIII[4]);
                                0;
                            }
                            g.a(bW);
                        }
                    }
                }
                String[] stringArray7 = new String[lIIlIIIIllIII[0]];
                stringArray7[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[40]];
                if (x.lIlIlIIIIIIlIII(Inventory.contains((String[])stringArray7) ? 1 : 0)) {
                    String[] stringArray8 = new String[lIIlIIIIllIII[0]];
                    stringArray8[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[41]];
                    if (x.lIlIlIIIIIIlIII(Inventory.contains((String[])stringArray8) ? 1 : 0)) {
                        String[] stringArray9 = new String[lIIlIIIIllIII[0]];
                        stringArray9[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[42]];
                        if (x.lIlIlIIIIIIlIlI(Inventory.contains((String[])stringArray9) ? 1 : 0)) {
                            var4 = new WorldPoint(lIIlIIIIllIII[43], lIIlIIIIllIII[44], lIIlIIIIllIII[1]);
                            var10 = new WorldPoint(lIIlIIIIllIII[21], lIIlIIIIllIII[44], lIIlIIIIllIII[1]);
                            var32 = new WorldArea(lIIlIIIIllIII[21], lIIlIIIIllIII[45], lIIlIIIIllIII[14], lIIlIIIIllIII[8], lIIlIIIIllIII[1]);
                            if (x.lIlIlIIIIIIlIlI(Players.getLocal().getWorldLocation().equals((Object)var4) ? 1 : 0) && x.lIlIlIIIIIIlIlI(Players.getLocal().getWorldLocation().equals((Object)var10) ? 1 : 0) && x.lIlIlIIIIIIlIlI(var32.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[46]];
                                Movement.walkTo((WorldPoint)var4);
                                0;
                                Time.sleepTicks((int)lIIlIIIIllIII[0]);
                                0;
                            }
                            if (x.lIlIlIIIIIIlIII(Players.getLocal().getWorldLocation().equals((Object)var4) ? 1 : 0)) {
                                String[] stringArray10 = new String[lIIlIIIIllIII[0]];
                                stringArray10[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[47]];
                                TileObjects.getNearest((String[])stringArray10).interact(lIIlIIIIlIllI[lIIlIIIIllIII[48]]);
                                Time.sleepTicks((int)lIIlIIIIllIII[3]);
                                0;
                            }
                            if (x.lIlIlIIIIIIlIII(var32.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[49]];
                                String[] stringArray11 = new String[lIIlIIIIllIII[0]];
                                stringArray11[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[50]];
                                TileItems.getNearest((String[])stringArray11).interact(lIIlIIIIlIllI[lIIlIIIIllIII[51]]);
                                Time.sleepTicks((int)lIIlIIIIllIII[8]);
                                0;
                            }
                        }
                    }
                }
                String[] stringArray12 = new String[lIIlIIIIllIII[0]];
                stringArray12[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[52]];
                if (x.lIlIlIIIIIIlIII(Inventory.contains((String[])stringArray12) ? 1 : 0)) {
                    String[] stringArray13 = new String[lIIlIIIIllIII[0]];
                    stringArray13[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[53]];
                    if (x.lIlIlIIIIIIlIlI(Inventory.contains((String[])stringArray13) ? 1 : 0)) {
                        var4 = new WorldArea(lIIlIIIIllIII[21], lIIlIIIIllIII[45], lIIlIIIIllIII[14], lIIlIIIIllIII[8], lIIlIIIIllIII[1]);
                        var10 = new WorldArea(lIIlIIIIllIII[54], lIIlIIIIllIII[55], lIIlIIIIllIII[18], lIIlIIIIllIII[23], lIIlIIIIllIII[1]);
                        if (x.lIlIlIIIIIIlIII(var4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] stringArray14 = new String[lIIlIIIIllIII[0]];
                            stringArray14[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[56]];
                            TileObjects.getNearest((String[])stringArray14).interact(lIIlIIIIlIllI[lIIlIIIIllIII[57]]);
                            Time.sleepTicks((int)lIIlIIIIllIII[3]);
                            0;
                        }
                        if (x.lIlIlIIIIIIlIlI(var10.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && x.lIlIlIIIIIIlIlI(fY.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[58]];
                            Movement.walkTo((WorldPoint)fV);
                            0;
                            Time.sleepTicks((int)lIIlIIIIllIII[0]);
                            0;
                        }
                        if (x.lIlIlIIIIIIlIII(var10.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] stringArray15 = new String[lIIlIIIIllIII[0]];
                            stringArray15[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[59]];
                            TileObjects.getNearest((String[])stringArray15).interact(lIIlIIIIlIllI[lIIlIIIIllIII[60]]);
                            Time.sleepTicks((int)lIIlIIIIllIII[4]);
                            0;
                        }
                        if (x.lIlIlIIIIIIlIII(fY.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            WorldPoint var1;
                            WorldPoint var27;
                            WorldPoint var2;
                            var32 = new WorldPoint(lIIlIIIIllIII[21], lIIlIIIIllIII[61], lIIlIIIIllIII[1]);
                            WorldPoint var29 = new WorldPoint(lIIlIIIIllIII[62], lIIlIIIIllIII[63], lIIlIIIIllIII[1]);
                            WorldPoint llllllllllllllIllllllIllIIlIIllI = new WorldPoint(lIIlIIIIllIII[64], lIIlIIIIllIII[65], lIIlIIIIllIII[1]);
                            WorldPoint llllllllllllllIllllllIllIIlIIlIl = new WorldPoint(lIIlIIIIllIII[43], lIIlIIIIllIII[66], lIIlIIIIllIII[1]);
                            WorldPoint var19 = new WorldPoint(lIIlIIIIllIII[67], lIIlIIIIllIII[66], lIIlIIIIllIII[1]);
                            WorldPoint var22 = new WorldPoint(lIIlIIIIllIII[67], lIIlIIIIllIII[66], lIIlIIIIllIII[1]);
                            WorldArea var26 = new WorldArea(lIIlIIIIllIII[68], lIIlIIIIllIII[69], lIIlIIIIllIII[20], lIIlIIIIllIII[23], lIIlIIIIllIII[1]);
                            WorldArea var14 = new WorldArea(lIIlIIIIllIII[70], lIIlIIIIllIII[71], lIIlIIIIllIII[14], lIIlIIIIllIII[17], lIIlIIIIllIII[1]);
                            WorldArea var3 = new WorldArea(lIIlIIIIllIII[72], lIIlIIIIllIII[73], lIIlIIIIllIII[32], lIIlIIIIllIII[25], lIIlIIIIllIII[1]);
                            if (x.lIlIlIIIIIlIIIl(Vars.getBit((int)lIIlIIIIllIII[74]), lIIlIIIIllIII[0]) && x.lIlIlIIIIIIlIlI(Vars.getBit((int)lIIlIIIIllIII[75]))) {
                                if (x.lIlIlIIIIIIlIlI(Players.getLocal().getWorldLocation().equals((Object)var32) ? 1 : 0)) {
                                    AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[76]];
                                    Movement.walkTo((WorldPoint)var32);
                                    0;
                                    Time.sleepTicks((int)lIIlIIIIllIII[0]);
                                    0;
                                }
                                if (x.lIlIlIIIIIIlIII(Players.getLocal().getWorldLocation().equals((Object)var32) ? 1 : 0)) {
                                    AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[77]];
                                    String[] stringArray16 = new String[lIIlIIIIllIII[0]];
                                    stringArray16[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[78]];
                                    TileObjects.getNearest((String[])stringArray16).interact(lIIlIIIIlIllI[lIIlIIIIllIII[79]]);
                                    Time.sleepTicks((int)lIIlIIIIllIII[8]);
                                    0;
                                }
                            }
                            if (x.lIlIlIIIIIlIIII(Vars.getBit((int)lIIlIIIIllIII[74]), lIIlIIIIllIII[0]) && x.lIlIlIIIIIIlIlI(Vars.getBit((int)lIIlIIIIllIII[80])) && x.lIlIlIIIIIIlIlI(Vars.getBit((int)lIIlIIIIllIII[75]))) {
                                if (x.lIlIlIIIIIIlIlI(Players.getLocal().getWorldLocation().equals((Object)var29) ? 1 : 0)) {
                                    AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[81]];
                                    Movement.walkTo((WorldPoint)var29);
                                    0;
                                    Time.sleepTicks((int)lIIlIIIIllIII[0]);
                                    0;
                                }
                                if (x.lIlIlIIIIIIlIII(Players.getLocal().getWorldLocation().equals((Object)var29) ? 1 : 0)) {
                                    AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[82]];
                                    String[] stringArray17 = new String[lIIlIIIIllIII[0]];
                                    stringArray17[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[15]];
                                    TileObjects.getNearest((String[])stringArray17).interact(lIIlIIIIlIllI[lIIlIIIIllIII[83]]);
                                    Time.sleepTicks((int)lIIlIIIIllIII[8]);
                                    0;
                                }
                            }
                            if (x.lIlIlIIIIIlIIII(Vars.getBit((int)lIIlIIIIllIII[74]), lIIlIIIIllIII[0]) && x.lIlIlIIIIIlIIII(Vars.getBit((int)lIIlIIIIllIII[80]), lIIlIIIIllIII[0]) && x.lIlIlIIIIIIlIlI(Vars.getBit((int)lIIlIIIIllIII[75]))) {
                                if (x.lIlIlIIIIIIlIlI(var26.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    var2 = new WorldPoint(lIIlIIIIllIII[21], lIIlIIIIllIII[84], lIIlIIIIllIII[1]);
                                    if (x.lIlIlIIIIIIlIlI(Players.getLocal().getWorldLocation().equals((Object)var2) ? 1 : 0)) {
                                        AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[85]];
                                        Movement.walkTo((WorldPoint)var2);
                                        0;
                                        Time.sleepTicks((int)lIIlIIIIllIII[0]);
                                        0;
                                    }
                                    if (x.lIlIlIIIIIIlIII(Players.getLocal().getWorldLocation().equals((Object)var2) ? 1 : 0)) {
                                        String[] stringArray18 = new String[lIIlIIIIllIII[0]];
                                        stringArray18[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[86]];
                                        TileObjects.getNearest((String[])stringArray18).interact(lIIlIIIIlIllI[lIIlIIIIllIII[87]]);
                                        Time.sleepTicks((int)lIIlIIIIllIII[8]);
                                        0;
                                    }
                                }
                                if (x.lIlIlIIIIIIlIII(var26.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[88]];
                                    String[] stringArray19 = new String[lIIlIIIIllIII[0]];
                                    stringArray19[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[89]];
                                    TileObjects.getNearest((String[])stringArray19).interact(lIIlIIIIlIllI[lIIlIIIIllIII[90]]);
                                    Time.sleepTicks((int)lIIlIIIIllIII[8]);
                                    0;
                                }
                            }
                            if (x.lIlIlIIIIIlIIII(Vars.getBit((int)lIIlIIIIllIII[74]), lIIlIIIIllIII[0]) && x.lIlIlIIIIIlIIII(Vars.getBit((int)lIIlIIIIllIII[80]), lIIlIIIIllIII[0]) && x.lIlIlIIIIIlIIII(Vars.getBit((int)lIIlIIIIllIII[75]), lIIlIIIIllIII[0])) {
                                if (x.lIlIlIIIIIIlIII(var26.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    var2 = new WorldPoint(lIIlIIIIllIII[21], lIIlIIIIllIII[91], lIIlIIIIllIII[1]);
                                    if (x.lIlIlIIIIIIlIlI(Players.getLocal().getWorldLocation().equals((Object)var2) ? 1 : 0)) {
                                        AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[92]];
                                        Movement.walkTo((WorldPoint)var2);
                                        0;
                                        Time.sleepTicks((int)lIIlIIIIllIII[0]);
                                        0;
                                    }
                                    if (x.lIlIlIIIIIIlIII(Players.getLocal().getWorldLocation().equals((Object)var2) ? 1 : 0)) {
                                        String[] stringArray20 = new String[lIIlIIIIllIII[0]];
                                        stringArray20[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[93]];
                                        TileObjects.getNearest((String[])stringArray20).interact(lIIlIIIIlIllI[lIIlIIIIllIII[94]]);
                                        Time.sleepTicks((int)lIIlIIIIllIII[8]);
                                        0;
                                    }
                                }
                                if (x.lIlIlIIIIIIlIlI(var26.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (x.lIlIlIIIIIIlIlI(Players.getLocal().getWorldLocation().equals((Object)var29) ? 1 : 0)) {
                                        AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[95]];
                                        Movement.walkTo((WorldPoint)var29);
                                        0;
                                        Time.sleepTicks((int)lIIlIIIIllIII[0]);
                                        0;
                                    }
                                    if (x.lIlIlIIIIIIlIII(Players.getLocal().getWorldLocation().equals((Object)var29) ? 1 : 0)) {
                                        AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[96]];
                                        String[] stringArray21 = new String[lIIlIIIIllIII[0]];
                                        stringArray21[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[97]];
                                        TileObjects.getNearest((String[])stringArray21).interact(lIIlIIIIlIllI[lIIlIIIIllIII[98]]);
                                        Time.sleepTicks((int)lIIlIIIIllIII[8]);
                                        0;
                                    }
                                }
                            }
                            if (x.lIlIlIIIIIlIIII(Vars.getBit((int)lIIlIIIIllIII[74]), lIIlIIIIllIII[0]) && x.lIlIlIIIIIIlIlI(Vars.getBit((int)lIIlIIIIllIII[80])) && x.lIlIlIIIIIlIIII(Vars.getBit((int)lIIlIIIIllIII[75]), lIIlIIIIllIII[0])) {
                                if (x.lIlIlIIIIIIlIlI(Players.getLocal().getWorldLocation().equals((Object)var32) ? 1 : 0)) {
                                    AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[99]];
                                    Movement.walkTo((WorldPoint)var32);
                                    0;
                                    Time.sleepTicks((int)lIIlIIIIllIII[0]);
                                    0;
                                }
                                if (x.lIlIlIIIIIIlIII(Players.getLocal().getWorldLocation().equals((Object)var32) ? 1 : 0)) {
                                    AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[100]];
                                    String[] stringArray22 = new String[lIIlIIIIllIII[0]];
                                    stringArray22[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[101]];
                                    TileObjects.getNearest((String[])stringArray22).interact(lIIlIIIIlIllI[lIIlIIIIllIII[102]]);
                                    Time.sleepTicks((int)lIIlIIIIllIII[8]);
                                    0;
                                }
                            }
                            if (x.lIlIlIIIIIIlIlI(Vars.getBit((int)lIIlIIIIllIII[74])) && x.lIlIlIIIIIIlIlI(Vars.getBit((int)lIIlIIIIllIII[80])) && x.lIlIlIIIIIlIIII(Vars.getBit((int)lIIlIIIIllIII[75]), lIIlIIIIllIII[0]) && x.lIlIlIIIIIIlIlI(Vars.getBit((int)lIIlIIIIllIII[103])) && x.lIlIlIIIIIIlIlI(x.by() ? 1 : 0)) {
                                if (x.lIlIlIIIIIIlIlI(var14.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (x.lIlIlIIIIIIlIII(var3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        var2 = new WorldPoint(lIIlIIIIllIII[104], lIIlIIIIllIII[84], lIIlIIIIllIII[1]);
                                        if (x.lIlIlIIIIIIlIlI(Players.getLocal().getWorldLocation().equals((Object)var2) ? 1 : 0)) {
                                            AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[105]];
                                            Movement.walkTo((WorldPoint)var2);
                                            0;
                                            Time.sleepTicks((int)lIIlIIIIllIII[0]);
                                            0;
                                        }
                                        if (x.lIlIlIIIIIIlIII(Players.getLocal().getWorldLocation().equals((Object)var2) ? 1 : 0)) {
                                            String[] stringArray23 = new String[lIIlIIIIllIII[0]];
                                            stringArray23[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[106]];
                                            TileObjects.getNearest((String[])stringArray23).interact(lIIlIIIIlIllI[lIIlIIIIllIII[107]]);
                                            Time.sleepTicks((int)lIIlIIIIllIII[8]);
                                            0;
                                        }
                                    }
                                    if (x.lIlIlIIIIIIlIII((var2 = new WorldArea(lIIlIIIIllIII[72], lIIlIIIIllIII[69], lIIlIIIIllIII[14], lIIlIIIIllIII[14], lIIlIIIIllIII[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && x.lIlIlIIIIIIlIlI(x.by() ? 1 : 0)) {
                                        var27 = new WorldPoint(lIIlIIIIllIII[108], lIIlIIIIllIII[109], lIIlIIIIllIII[1]);
                                        if (x.lIlIlIIIIIIlIlI(Players.getLocal().getWorldLocation().equals((Object)var27) ? 1 : 0)) {
                                            AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[110]];
                                            Movement.walkTo((WorldPoint)var27);
                                            0;
                                            Time.sleepTicks((int)lIIlIIIIllIII[0]);
                                            0;
                                        }
                                        if (x.lIlIlIIIIIIlIII(Players.getLocal().getWorldLocation().equals((Object)var27) ? 1 : 0)) {
                                            String[] stringArray24 = new String[lIIlIIIIllIII[0]];
                                            stringArray24[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[111]];
                                            TileObjects.getNearest((String[])stringArray24).interact(lIIlIIIIlIllI[lIIlIIIIllIII[112]]);
                                            Time.sleepTicks((int)lIIlIIIIllIII[8]);
                                            0;
                                        }
                                    }
                                    if (x.lIlIlIIIIIIlIII((var27 = new WorldArea(lIIlIIIIllIII[70], lIIlIIIIllIII[69], lIIlIIIIllIII[14], lIIlIIIIllIII[14], lIIlIIIIllIII[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        var1 = new WorldPoint(lIIlIIIIllIII[67], lIIlIIIIllIII[113], lIIlIIIIllIII[1]);
                                        if (x.lIlIlIIIIIIlIlI(Players.getLocal().getWorldLocation().equals((Object)var1) ? 1 : 0)) {
                                            AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[114]];
                                            Movement.walkTo((WorldPoint)var1);
                                            0;
                                            Time.sleepTicks((int)lIIlIIIIllIII[0]);
                                            0;
                                        }
                                        if (x.lIlIlIIIIIIlIII(Players.getLocal().getWorldLocation().equals((Object)var1) ? 1 : 0)) {
                                            String[] stringArray25 = new String[lIIlIIIIllIII[0]];
                                            stringArray25[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[115]];
                                            TileObjects.getNearest((String[])stringArray25).interact(lIIlIIIIlIllI[lIIlIIIIllIII[116]]);
                                            Time.sleepTicks((int)lIIlIIIIllIII[8]);
                                            0;
                                        }
                                    }
                                }
                                if (x.lIlIlIIIIIIlIII(var14.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && x.lIlIlIIIIIIlIlI(x.by() ? 1 : 0)) {
                                    if (x.lIlIlIIIIIIlIlI(Players.getLocal().getWorldLocation().equals((Object)var19) ? 1 : 0)) {
                                        AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[117]];
                                        Movement.walkTo((WorldPoint)var19);
                                        0;
                                        Time.sleepTicks((int)lIIlIIIIllIII[0]);
                                        0;
                                    }
                                    if (x.lIlIlIIIIIIlIII(Players.getLocal().getWorldLocation().equals((Object)var19) ? 1 : 0)) {
                                        AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[118]];
                                        String[] stringArray26 = new String[lIIlIIIIllIII[0]];
                                        stringArray26[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[119]];
                                        TileObjects.getNearest((String[])stringArray26).interact(lIIlIIIIlIllI[lIIlIIIIllIII[120]]);
                                        Time.sleepTicks((int)lIIlIIIIllIII[8]);
                                        0;
                                    }
                                }
                            }
                            if (x.lIlIlIIIIIIlIlI(Vars.getBit((int)lIIlIIIIllIII[74])) && x.lIlIlIIIIIIlIlI(Vars.getBit((int)lIIlIIIIllIII[80])) && x.lIlIlIIIIIlIIII(Vars.getBit((int)lIIlIIIIllIII[75]), lIIlIIIIllIII[0]) && x.lIlIlIIIIIlIIII(Vars.getBit((int)lIIlIIIIllIII[103]), lIIlIIIIllIII[0]) && x.lIlIlIIIIIIlIlI(Vars.getBit((int)lIIlIIIIllIII[121]))) {
                                if (x.lIlIlIIIIIIlIlI(Players.getLocal().getWorldLocation().equals((Object)var22) ? 1 : 0)) {
                                    AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[122]];
                                    Movement.walkTo((WorldPoint)var22);
                                    0;
                                    Time.sleepTicks((int)lIIlIIIIllIII[0]);
                                    0;
                                }
                                if (x.lIlIlIIIIIIlIII(Players.getLocal().getWorldLocation().equals((Object)var22) ? 1 : 0)) {
                                    AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[123]];
                                    String[] stringArray27 = new String[lIIlIIIIllIII[0]];
                                    stringArray27[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[124]];
                                    TileObjects.getNearest((String[])stringArray27).interact(lIIlIIIIlIllI[lIIlIIIIllIII[125]]);
                                    Time.sleepTicks((int)lIIlIIIIllIII[8]);
                                    0;
                                }
                            }
                            if (x.lIlIlIIIIIIlIlI(Vars.getBit((int)lIIlIIIIllIII[74])) && x.lIlIlIIIIIIlIlI(Vars.getBit((int)lIIlIIIIllIII[80])) && x.lIlIlIIIIIlIIII(Vars.getBit((int)lIIlIIIIllIII[75]), lIIlIIIIllIII[0]) && x.lIlIlIIIIIlIIII(Vars.getBit((int)lIIlIIIIllIII[103]), lIIlIIIIllIII[0]) && x.lIlIlIIIIIlIIII(Vars.getBit((int)lIIlIIIIllIII[121]), lIIlIIIIllIII[0]) && x.lIlIlIIIIIIlIlI(Vars.getBit((int)lIIlIIIIllIII[126]))) {
                                var2 = new WorldArea(lIIlIIIIllIII[72], lIIlIIIIllIII[71], lIIlIIIIllIII[14], lIIlIIIIllIII[14], lIIlIIIIllIII[1]);
                                if (x.lIlIlIIIIIIlIII(var14.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    var27 = new WorldPoint(lIIlIIIIllIII[127], lIIlIIIIllIII[66], lIIlIIIIllIII[1]);
                                    if (x.lIlIlIIIIIIlIlI(Players.getLocal().getWorldLocation().equals((Object)var27) ? 1 : 0)) {
                                        AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[128]];
                                        Movement.walkTo((WorldPoint)var27);
                                        0;
                                        Time.sleepTicks((int)lIIlIIIIllIII[0]);
                                        0;
                                    }
                                    if (x.lIlIlIIIIIIlIII(Players.getLocal().getWorldLocation().equals((Object)var27) ? 1 : 0)) {
                                        String[] stringArray28 = new String[lIIlIIIIllIII[0]];
                                        stringArray28[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[129]];
                                        TileObjects.getNearest((String[])stringArray28).interact(lIIlIIIIlIllI[lIIlIIIIllIII[130]]);
                                        Time.sleepTicks((int)lIIlIIIIllIII[8]);
                                        0;
                                    }
                                }
                                if (x.lIlIlIIIIIIlIII(var2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    var27 = new WorldPoint(lIIlIIIIllIII[131], lIIlIIIIllIII[66], lIIlIIIIllIII[1]);
                                    if (x.lIlIlIIIIIIlIlI(Players.getLocal().getWorldLocation().equals((Object)var27) ? 1 : 0)) {
                                        AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[132]];
                                        Movement.walkTo((WorldPoint)var27);
                                        0;
                                        Time.sleepTicks((int)lIIlIIIIllIII[0]);
                                        0;
                                    }
                                    if (x.lIlIlIIIIIIlIII(Players.getLocal().getWorldLocation().equals((Object)var27) ? 1 : 0)) {
                                        String[] stringArray29 = new String[lIIlIIIIllIII[0]];
                                        stringArray29[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[133]];
                                        TileObjects.getNearest((String[])stringArray29).interact(lIIlIIIIlIllI[lIIlIIIIllIII[134]]);
                                        Time.sleepTicks((int)lIIlIIIIllIII[8]);
                                        0;
                                    }
                                }
                                if (x.lIlIlIIIIIIlIII(var26.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[135]];
                                    String[] stringArray30 = new String[lIIlIIIIllIII[0]];
                                    stringArray30[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[136]];
                                    TileObjects.getNearest((String[])stringArray30).interact(lIIlIIIIlIllI[lIIlIIIIllIII[137]]);
                                    Time.sleepTicks((int)lIIlIIIIllIII[16]);
                                    0;
                                }
                            }
                            if (x.lIlIlIIIIIIlIlI(Vars.getBit((int)lIIlIIIIllIII[74])) && x.lIlIlIIIIIIlIlI(Vars.getBit((int)lIIlIIIIllIII[80])) && x.lIlIlIIIIIlIIII(Vars.getBit((int)lIIlIIIIllIII[75]), lIIlIIIIllIII[0]) && x.lIlIlIIIIIlIIII(Vars.getBit((int)lIIlIIIIllIII[103]), lIIlIIIIllIII[0]) && x.lIlIlIIIIIlIIII(Vars.getBit((int)lIIlIIIIllIII[121]), lIIlIIIIllIII[0]) && x.lIlIlIIIIIlIIII(Vars.getBit((int)lIIlIIIIllIII[126]), lIIlIIIIllIII[0])) {
                                var2 = new WorldArea(lIIlIIIIllIII[72], lIIlIIIIllIII[71], lIIlIIIIllIII[14], lIIlIIIIllIII[14], lIIlIIIIllIII[1]);
                                if (x.lIlIlIIIIIIlIII(var26.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    var27 = new WorldPoint(lIIlIIIIllIII[138], lIIlIIIIllIII[66], lIIlIIIIllIII[1]);
                                    if (x.lIlIlIIIIIIlIlI(Players.getLocal().getWorldLocation().equals((Object)var27) ? 1 : 0)) {
                                        AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[139]];
                                        Movement.walkTo((WorldPoint)var27);
                                        0;
                                        Time.sleepTicks((int)lIIlIIIIllIII[0]);
                                        0;
                                    }
                                    if (x.lIlIlIIIIIIlIII(Players.getLocal().getWorldLocation().equals((Object)var27) ? 1 : 0)) {
                                        String[] stringArray31 = new String[lIIlIIIIllIII[0]];
                                        stringArray31[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[140]];
                                        TileObjects.getNearest((String[])stringArray31).interact(lIIlIIIIlIllI[lIIlIIIIllIII[141]]);
                                        Time.sleepTicks((int)lIIlIIIIllIII[8]);
                                        0;
                                    }
                                }
                                if (x.lIlIlIIIIIIlIII(var2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    var27 = new WorldPoint(lIIlIIIIllIII[108], lIIlIIIIllIII[66], lIIlIIIIllIII[1]);
                                    if (x.lIlIlIIIIIIlIlI(Players.getLocal().getWorldLocation().equals((Object)var27) ? 1 : 0)) {
                                        AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[142]];
                                        Movement.walkTo((WorldPoint)var27);
                                        0;
                                        Time.sleepTicks((int)lIIlIIIIllIII[0]);
                                        0;
                                    }
                                    if (x.lIlIlIIIIIIlIII(Players.getLocal().getWorldLocation().equals((Object)var27) ? 1 : 0)) {
                                        String[] stringArray32 = new String[lIIlIIIIllIII[0]];
                                        stringArray32[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[143]];
                                        TileObjects.getNearest((String[])stringArray32).interact(lIIlIIIIlIllI[lIIlIIIIllIII[144]]);
                                        Time.sleepTicks((int)lIIlIIIIllIII[8]);
                                        0;
                                    }
                                }
                                if (x.lIlIlIIIIIIlIII(var14.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (x.lIlIlIIIIIIlIlI(Players.getLocal().getWorldLocation().equals((Object)var19) ? 1 : 0)) {
                                        AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[145]];
                                        Movement.walkTo((WorldPoint)var19);
                                        0;
                                        Time.sleepTicks((int)lIIlIIIIllIII[0]);
                                        0;
                                    }
                                    if (x.lIlIlIIIIIIlIII(Players.getLocal().getWorldLocation().equals((Object)var19) ? 1 : 0)) {
                                        AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[146]];
                                        String[] stringArray33 = new String[lIIlIIIIllIII[0]];
                                        stringArray33[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[147]];
                                        TileObjects.getNearest((String[])stringArray33).interact(lIIlIIIIlIllI[lIIlIIIIllIII[148]]);
                                        Time.sleepTicks((int)lIIlIIIIllIII[8]);
                                        0;
                                    }
                                }
                            }
                            if (x.lIlIlIIIIIIlIlI(Vars.getBit((int)lIIlIIIIllIII[74])) && x.lIlIlIIIIIIlIlI(Vars.getBit((int)lIIlIIIIllIII[80])) && x.lIlIlIIIIIlIIII(Vars.getBit((int)lIIlIIIIllIII[75]), lIIlIIIIllIII[0]) && x.lIlIlIIIIIIlIlI(Vars.getBit((int)lIIlIIIIllIII[103])) && x.lIlIlIIIIIlIIII(Vars.getBit((int)lIIlIIIIllIII[121]), lIIlIIIIllIII[0]) && x.lIlIlIIIIIlIIII(Vars.getBit((int)lIIlIIIIllIII[126]), lIIlIIIIllIII[0])) {
                                var2 = new WorldArea(lIIlIIIIllIII[72], lIIlIIIIllIII[71], lIIlIIIIllIII[14], lIIlIIIIllIII[14], lIIlIIIIllIII[1]);
                                if (x.lIlIlIIIIIIlIII(var14.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    var27 = new WorldPoint(lIIlIIIIllIII[127], lIIlIIIIllIII[66], lIIlIIIIllIII[1]);
                                    if (x.lIlIlIIIIIIlIlI(Players.getLocal().getWorldLocation().equals((Object)var27) ? 1 : 0)) {
                                        AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[149]];
                                        Movement.walkTo((WorldPoint)var27);
                                        0;
                                        Time.sleepTicks((int)lIIlIIIIllIII[0]);
                                        0;
                                    }
                                    if (x.lIlIlIIIIIIlIII(Players.getLocal().getWorldLocation().equals((Object)var27) ? 1 : 0)) {
                                        String[] stringArray34 = new String[lIIlIIIIllIII[0]];
                                        stringArray34[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[150]];
                                        TileObjects.getNearest((String[])stringArray34).interact(lIIlIIIIlIllI[lIIlIIIIllIII[151]]);
                                        Time.sleepTicks((int)lIIlIIIIllIII[8]);
                                        0;
                                    }
                                }
                                if (x.lIlIlIIIIIIlIII(var2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    var27 = new WorldPoint(lIIlIIIIllIII[104], lIIlIIIIllIII[152], lIIlIIIIllIII[1]);
                                    if (x.lIlIlIIIIIIlIlI(Players.getLocal().getWorldLocation().equals((Object)var27) ? 1 : 0)) {
                                        AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[153]];
                                        Movement.walkTo((WorldPoint)var27);
                                        0;
                                        Time.sleepTicks((int)lIIlIIIIllIII[0]);
                                        0;
                                    }
                                    if (x.lIlIlIIIIIIlIII(Players.getLocal().getWorldLocation().equals((Object)var27) ? 1 : 0)) {
                                        Time.sleepTicks((int)lIIlIIIIllIII[0]);
                                        0;
                                        String[] stringArray35 = new String[lIIlIIIIllIII[0]];
                                        stringArray35[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[154]];
                                        TileObjects.getNearest((String[])stringArray35).interact(lIIlIIIIlIllI[lIIlIIIIllIII[155]]);
                                        Time.sleepTicks((int)lIIlIIIIllIII[8]);
                                        0;
                                    }
                                }
                                if (x.lIlIlIIIIIIlIII((var27 = new WorldArea(lIIlIIIIllIII[72], lIIlIIIIllIII[69], lIIlIIIIllIII[14], lIIlIIIIllIII[14], lIIlIIIIllIII[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && x.lIlIlIIIIIIlIlI(Players.getLocal().isMoving() ? 1 : 0)) {
                                    AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[156]];
                                    Time.sleepTicks((int)lIIlIIIIllIII[0]);
                                    0;
                                    int[] nArray = new int[lIIlIIIIllIII[0]];
                                    nArray[x.lIIlIIIIllIII[1]] = lIIlIIIIllIII[157];
                                    TileObjects.getNearest((int[])nArray).interact(lIIlIIIIlIllI[lIIlIIIIllIII[158]]);
                                    Time.sleepTicks((int)lIIlIIIIllIII[8]);
                                    0;
                                }
                                if (x.lIlIlIIIIIIlIII(var3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    int[] nArray = new int[lIIlIIIIllIII[0]];
                                    nArray[x.lIIlIIIIllIII[1]] = lIIlIIIIllIII[159];
                                    TileObjects.getNearest((int[])nArray).interact(lIIlIIIIlIllI[lIIlIIIIllIII[160]]);
                                    Time.sleepTicks((int)lIIlIIIIllIII[8]);
                                    0;
                                }
                                if (x.lIlIlIIIIIIlIII((var1 = new WorldArea(lIIlIIIIllIII[161], lIIlIIIIllIII[162], lIIlIIIIllIII[23], lIIlIIIIllIII[14], lIIlIIIIllIII[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    String[] stringArray36 = new String[lIIlIIIIllIII[0]];
                                    stringArray36[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[163]];
                                    if (x.lIlIlIIIIIIlIlI(Inventory.contains((String[])stringArray36) ? 1 : 0)) {
                                        String[] stringArray37 = new String[lIIlIIIIllIII[0]];
                                        stringArray37[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[164]];
                                        TileItems.getNearest((String[])stringArray37).interact(lIIlIIIIlIllI[lIIlIIIIllIII[165]]);
                                        Time.sleepTicks((int)lIIlIIIIllIII[14]);
                                        0;
                                    }
                                }
                            }
                        }
                    }
                }
                String[] stringArray38 = new String[lIIlIIIIllIII[0]];
                stringArray38[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[166]];
                if (x.lIlIlIIIIIIlIII(Inventory.contains((String[])stringArray38) ? 1 : 0)) {
                    String[] stringArray39 = new String[lIIlIIIIllIII[0]];
                    stringArray39[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[167]];
                    if (x.lIlIlIIIIIIlIII(Inventory.contains((String[])stringArray39) ? 1 : 0)) {
                        var4 = new WorldArea(lIIlIIIIllIII[161], lIIlIIIIllIII[162], lIIlIIIIllIII[23], lIIlIIIIllIII[14], lIIlIIIIllIII[1]);
                        if (x.lIlIlIIIIIIlIII(var4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            int[] nArray = new int[lIIlIIIIllIII[0]];
                            nArray[x.lIIlIIIIllIII[1]] = lIIlIIIIllIII[159];
                            TileObjects.getNearest((int[])nArray).interact(lIIlIIIIlIllI[lIIlIIIIllIII[168]]);
                            Time.sleepTicks((int)lIIlIIIIllIII[14]);
                            0;
                        }
                        if (x.lIlIlIIIIIIlllI(Players.getLocal().getWorldLocation().distanceTo(fW), lIIlIIIIllIII[10])) {
                            AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[169]];
                            Movement.walkTo((WorldPoint)fW);
                            0;
                            Time.sleepTicks((int)lIIlIIIIllIII[0]);
                            0;
                        }
                        if (x.lIlIlIIIIIIllll(Players.getLocal().getWorldLocation().distanceTo(fW), lIIlIIIIllIII[10])) {
                            var10 = TileObjects.getNearest(tileObject -> {
                                int n2;
                                if (x.lIlIlIIIIIIlIII(tileObject.getName().contains(lIIlIIIIlIllI[lIIlIIIIllIII[185]]) ? 1 : 0)) {
                                    String[] stringArray = new String[lIIlIIIIllIII[0]];
                                    stringArray[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[186]];
                                    if (x.lIlIlIIIIIIlIII(tileObject.hasAction(stringArray) ? 1 : 0) && x.lIlIlIIIIIIllll(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIlIIIIllIII[21], lIIlIIIIllIII[184], lIIlIIIIllIII[3])), lIIlIIIIllIII[3])) {
                                        n2 = lIIlIIIIllIII[0];
                                        0;
                                        if (-(22 + 58 - 47 + 97 ^ 84 + 12 - 80 + 118) <= 0) return n2 != 0;
                                        return ((0xBB ^ 0xC6 ^ (0xF7 ^ 0xBD)) & (2 ^ (0x3E ^ 0xB) ^ -1)) != 0;
                                    }
                                }
                                n2 = lIIlIIIIllIII[1];
                                return n2 != 0;
                            });
                            if (x.lIlIlIIIIIIlIll(var10)) {
                                var10.interact(lIIlIIIIlIllI[lIIlIIIIllIII[170]]);
                                Time.sleepTicks((int)lIIlIIIIllIII[8]);
                                0;
                            }
                            if (x.lIlIlIIIIIlIIlI(var10)) {
                                g.a(lIIlIIIIlIllI[lIIlIIIIllIII[171]], bW, lIIlIIIIllIII[0]);
                            }
                        }
                    }
                }
            }
            if (x.lIlIlIIIIIlIIII(e.j(fX), lIIlIIIIllIII[3])) {
                if (x.lIlIlIIIIIIlllI(Players.getLocal().getWorldLocation().distanceTo(fW), lIIlIIIIllIII[10])) {
                    AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[172]];
                    Movement.walkTo((WorldPoint)fW);
                    0;
                    Time.sleepTicks((int)lIIlIIIIllIII[0]);
                    0;
                }
                if (x.lIlIlIIIIIIllll(Players.getLocal().getWorldLocation().distanceTo(fW), lIIlIIIIllIII[10])) {
                    var4 = TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (x.lIlIlIIIIIIlIII(tileObject.getName().contains(lIIlIIIIlIllI[lIIlIIIIllIII[182]]) ? 1 : 0)) {
                            String[] stringArray = new String[lIIlIIIIllIII[0]];
                            stringArray[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[183]];
                            if (x.lIlIlIIIIIIlIII(tileObject.hasAction(stringArray) ? 1 : 0) && x.lIlIlIIIIIIllll(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIlIIIIllIII[21], lIIlIIIIllIII[184], lIIlIIIIllIII[3])), lIIlIIIIllIII[3])) {
                                n2 = lIIlIIIIllIII[0];
                                0;
                                if (((0x59 ^ 0x4C ^ (0x54 ^ 0x20)) & (0xA3 ^ 0x95 ^ (0xC3 ^ 0x94) ^ -1)) == 0) return n2 != 0;
                                return ((0x1A ^ 0x51 ^ (0x29 ^ 0x3B)) & (0xC ^ 0x4E ^ (0x3F ^ 0x24) ^ -1)) != 0;
                            }
                        }
                        n2 = lIIlIIIIllIII[1];
                        return n2 != 0;
                    });
                    if (x.lIlIlIIIIIIlIll(var4)) {
                        var4.interact(lIIlIIIIlIllI[lIIlIIIIllIII[173]]);
                        Time.sleepTicks((int)lIIlIIIIllIII[8]);
                        0;
                    }
                    if (x.lIlIlIIIIIlIIlI(var4)) {
                        if (x.lIlIlIIIIIIlIIl(co, lIIlIIIIllIII[0])) {
                            P.ly += lIIlIIIIllIII[0];
                            P.d(AccBuilderRat.m);
                            co += lIIlIIIIllIII[0];
                            P.ly = lIIlIIIIllIII[1];
                            cp = lIIlIIIIllIII[1];
                        }
                        g.a(lIIlIIIIlIllI[lIIlIIIIllIII[174]], bW, lIIlIIIIllIII[0]);
                    }
                }
            }
            g.a(bW);
        }
    }

    private static boolean lIlIlIIIIIIllIl(int n2) {
        return n2 < 0;
    }

    @Override
    public int Y() {
        try {
            x.bx();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (1 >= (0xD0 ^ 0xA9 ^ (0x42 ^ 0x3F))) {
            return (0x13 ^ 0xB ^ (0x9D ^ 0xBE)) & (0xF3 ^ 0xB4 ^ (0xE ^ 0x72) ^ -1);
        }
        return lIIlIIIIllIII[144];
    }

    static boolean by() {
        int n2;
        if (x.lIlIlIIIIIIlIlI(Vars.getBit((int)lIIlIIIIllIII[74])) && x.lIlIlIIIIIIlIlI(Vars.getBit((int)lIIlIIIIllIII[80])) && x.lIlIlIIIIIlIIII(Vars.getBit((int)lIIlIIIIllIII[75]), lIIlIIIIllIII[0]) && x.lIlIlIIIIIIlIlI(Vars.getBit((int)lIIlIIIIllIII[103])) && x.lIlIlIIIIIlIIII(Vars.getBit((int)lIIlIIIIllIII[121]), lIIlIIIIllIII[0]) && x.lIlIlIIIIIlIIII(Vars.getBit((int)lIIlIIIIllIII[126]), lIIlIIIIllIII[0])) {
            n2 = lIIlIIIIllIII[0];
            0;
            if (-2 >= 0) {
                return false;
            }
        } else {
            n2 = lIIlIIIIllIII[1];
        }
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean S() {
        void var21;
        int[] nArray = new int[lIIlIIIIllIII[4]];
        nArray[x.lIIlIIIIllIII[1]] = lIIlIIIIllIII[5];
        nArray[x.lIIlIIIIllIII[0]] = lIIlIIIIllIII[6];
        nArray[x.lIIlIIIIllIII[3]] = lIIlIIIIllIII[7];
        nArray[x.lIIlIIIIllIII[8]] = lIIlIIIIllIII[9];
        int[] nArray2 = nArray;
        int var17 = lIIlIIIIllIII[1];
        while (x.lIlIlIIIIIIlIIl(var17, ((void)var21).length)) {
            int[] nArray3 = new int[lIIlIIIIllIII[0]];
            nArray3[x.lIIlIIIIllIII[1]] = var21[var17];
            if (x.lIlIlIIIIIIlIlI(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return lIIlIIIIllIII[1];
            }
            ++var17;
            0;
            if (1 != 0) continue;
            return ((0xA ^ 0x6D ^ (0x61 ^ 0x3D)) & (0xAD ^ 0x96 ^ (0x36 ^ 0x17) & ~(0xE3 ^ 0xC2) ^ -1)) != 0;
        }
        return lIIlIIIIllIII[0];
    }

    private static boolean lIlIlIIIIIlIIIl(int n2, int n3) {
        return n2 != n3;
    }

    private static int lIlIlIIIIIIIlll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean lIlIlIIIIIIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIlIIIIIlIIII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIlIIIIIIlllI(int n2, int n3) {
        return n2 > n3;
    }

    private static void W() {
        block14: {
            d var6;
            block13: {
                block12: {
                    block11: {
                        Object var28;
                        int[] nArray = new int[lIIlIIIIllIII[0]];
                        nArray[x.lIIlIIIIllIII[1]] = lIIlIIIIllIII[6];
                        if (x.lIlIlIIIIIIlIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                            d d2 = new d(lIIlIIIIllIII[6], lIIlIIIIllIII[10], lIIlIIIIllIII[175]);
                            bA.add(d2);
                            0;
                        }
                        int[] nArray2 = new int[lIIlIIIIllIII[0]];
                        nArray2[x.lIIlIIIIllIII[1]] = lIIlIIIIllIII[7];
                        if (x.lIlIlIIIIIIlIlI(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            var28 = new d(lIIlIIIIllIII[7], lIIlIIIIllIII[0], lIIlIIIIllIII[175]);
                            bA.add((d)var28);
                            0;
                        }
                        int[] nArray3 = new int[lIIlIIIIllIII[0]];
                        nArray3[x.lIIlIIIIllIII[1]] = lIIlIIIIllIII[9];
                        if (x.lIlIlIIIIIIlIlI(Bank.contains((int[])nArray3) ? 1 : 0)) {
                            var28 = new d(lIIlIIIIllIII[9], lIIlIIIIllIII[0], lIIlIIIIllIII[175]);
                            bA.add((d)var28);
                            0;
                        }
                        if (x.lIlIlIIIIIIlIlI(Bank.contains((Predicate)(var28 = item -> item.getName().toLowerCase().contains(lIIlIIIIlIllI[lIIlIIIIllIII[181]]))) ? 1 : 0)) {
                            var6 = new d(lIIlIIIIllIII[176], lIIlIIIIllIII[14], lIIlIIIIllIII[177]);
                            bA.add(var6);
                            0;
                        }
                        int[] nArray4 = new int[lIIlIIIIllIII[0]];
                        nArray4[x.lIIlIIIIllIII[1]] = lIIlIIIIllIII[12];
                        if (x.lIlIlIIIIIIlIlI(Bank.contains((int[])nArray4) ? 1 : 0)) {
                            var6 = new d(lIIlIIIIllIII[12], lIIlIIIIllIII[4], h.bv);
                            bA.add(var6);
                            0;
                        }
                        int[] nArray5 = new int[lIIlIIIIllIII[0]];
                        nArray5[x.lIIlIIIIllIII[1]] = lIIlIIIIllIII[13];
                        if (!x.lIlIlIIIIIIlIII(Bank.contains((int[])nArray5) ? 1 : 0)) break block11;
                        int[] nArray6 = new int[lIIlIIIIllIII[0]];
                        nArray6[x.lIIlIIIIllIII[1]] = lIIlIIIIllIII[13];
                        if (!x.lIlIlIIIIIIlIII(Bank.contains((int[])nArray6) ? 1 : 0)) break block12;
                        int[] nArray7 = new int[lIIlIIIIllIII[0]];
                        nArray7[x.lIIlIIIIllIII[1]] = lIIlIIIIllIII[13];
                        if (!x.lIlIlIIIIIIlIIl(Bank.getFirst((int[])nArray7).getQuantity(), lIIlIIIIllIII[14])) break block12;
                    }
                    var6 = new d(lIIlIIIIllIII[13], lIIlIIIIllIII[10], lIIlIIIIllIII[178]);
                    bA.add(var6);
                    0;
                }
                int[] nArray = new int[lIIlIIIIllIII[0]];
                nArray[x.lIIlIIIIllIII[1]] = lIIlIIIIllIII[5];
                if (!x.lIlIlIIIIIIlIII(Bank.contains((int[])nArray) ? 1 : 0)) break block13;
                int[] nArray8 = new int[lIIlIIIIllIII[0]];
                nArray8[x.lIIlIIIIllIII[1]] = lIIlIIIIllIII[5];
                if (!x.lIlIlIIIIIIlIII(Bank.contains((int[])nArray8) ? 1 : 0)) break block14;
                int[] nArray9 = new int[lIIlIIIIllIII[0]];
                nArray9[x.lIIlIIIIllIII[1]] = lIIlIIIIllIII[5];
                if (!x.lIlIlIIIIIIlIIl(Bank.getFirst((int[])nArray9).getQuantity(), lIIlIIIIllIII[27])) break block14;
            }
            var6 = new d(lIIlIIIIllIII[5], lIIlIIIIllIII[57], lIIlIIIIllIII[179]);
            bA.add(var6);
            0;
        }
    }

    @Override
    public boolean X() {
        return lIIlIIIIllIII[1];
    }

    private static boolean lIlIlIIIIIlIIlI(Object object) {
        return object == null;
    }

    @Override
    public boolean aa() {
        boolean bl;
        if (x.lIlIlIIIIIlIIll(e.j(lIIlIIIIllIII[47]), lIIlIIIIllIII[8])) {
            bl = lIIlIIIIllIII[0];
            0;
            if (-3 > 0) {
                return ((0x55 ^ 0x18 ^ (0x4C ^ 0x4B)) & (0x55 ^ 0x28 ^ (0x11 ^ 0x26) ^ -1)) != 0;
            }
        } else {
            bl = lIIlIIIIllIII[1];
        }
        return bl;
    }

    private static boolean lIlIlIIIIIlIIll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIlIIIIIIllll(int n2, int n3) {
        return n2 <= n3;
    }

    private static String lIlIIllllllIlII(String var16, String var12) {
        try {
            SecretKeySpec var31 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var12.getBytes(StandardCharsets.UTF_8)), lIIlIIIIllIII[16]), "DES");
            Cipher var34 = Cipher.getInstance("DES");
            var34.init(lIIlIIIIllIII[3], var31);
            return new String(var34.doFinal(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }
}

