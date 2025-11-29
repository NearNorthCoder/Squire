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
package h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n;

import gg.squire.account.AccBuilderShamans;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.K;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.a;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.b;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.d;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.e;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.f;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.j;
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

public class L
implements K {
    public static /* synthetic */ int jt;
    static /* synthetic */ WorldArea ju;
    private static /* synthetic */ int[] lIllIIIIII;
    private static /* synthetic */ String[] lIlIllllll;
    public static /* synthetic */ boolean bn;
    public static /* synthetic */ List<d> bp;
    static /* synthetic */ WorldArea jv;
    public static /* synthetic */ int jr;
    public static /* synthetic */ int js;
    private static /* synthetic */ WorldPoint jx;
    static /* synthetic */ WorldArea jw;

    private static boolean lIIlIlIlIIlIl(int n2, int n3) {
        return n2 > n3;
    }

    private static void lIIlIlIlIIIII() {
        lIllIIIIII = new int[239];
        L.lIllIIIIII[0] = (0x2C ^ 0x46 ^ (0xD4 ^ 0x95)) & (7 + 106 - 78 + 106 ^ 33 + 32 - -48 + 53 ^ -" ".length());
        L.lIllIIIIII[1] = " ".length();
        L.lIllIIIIII[2] = (0x91 ^ 0x81) & ~(0xD6 ^ 0xC6) ^ (0x28 ^ 0x36);
        L.lIllIIIIII[3] = "  ".length();
        L.lIllIIIIII[4] = -(0xFFFFF9B3 & 0x667D) & (0xFFFFEFFF & 0x7DB7);
        L.lIllIIIIII[5] = -(0xFFFFC3B7 & 0x7C4B) & (0xFFFFCF87 & 0x7DFF);
        L.lIllIIIIII[6] = 133 + 80 - 81 + 46 ^ 87 + 84 - 67 + 36;
        L.lIllIIIIII[7] = 32 + 62 - 16 + 100 ^ 107 + 72 - 118 + 68;
        L.lIllIIIIII[8] = 0xFFFF8DBF & 0x7FF8;
        L.lIllIIIIII[9] = 0xFFFFCF9E & 0x3DF9;
        L.lIllIIIIII[10] = "   ".length();
        L.lIllIIIIII[11] = 0xFFFFF3CB & 0x1FBC;
        L.lIllIIIIII[12] = 0x5C ^ 0x56;
        L.lIllIIIIII[13] = 0xFFFF9FE7 & 0x7F5F;
        L.lIllIIIIII[14] = 0xFFFF9FDC & 0x7F6B;
        L.lIllIIIIII[15] = 0xFFFFDFF9 & 0x3F4F;
        L.lIllIIIIII[16] = -(0xE1 ^ 0xA0) & (0xFFFFAF6D & 0x5FDF);
        L.lIllIIIIII[17] = 0x79 ^ 0x7D;
        L.lIllIIIIII[18] = -(0xFFFFDBF7 & 0x740B) & (0xFFFFFFFE & 0x7ECF);
        L.lIllIIIIII[19] = 0xA1 ^ 0xBE ^ (0x22 ^ 0x38);
        L.lIllIIIIII[20] = 0xFFFFBBFF & 0x7551;
        L.lIllIIIIII[21] = 8 ^ 0xE;
        L.lIllIIIIII[22] = -(0xFFFFEB7E & 0x54B7) & (0xFFFFDF7F & Short.MAX_VALUE);
        L.lIllIIIIII[23] = 0x6C ^ 0x6B;
        L.lIllIIIIII[24] = 0xFFFFBBD9 & 0x45A7;
        L.lIllIIIIII[25] = 8 ^ 0;
        L.lIllIIIIII[26] = -(0xFFFFADA7 & 0x735D) & (0xFFFFEFB7 & 0x7DEF);
        L.lIllIIIIII[27] = 0x45 ^ 0x24 ^ (0x4C ^ 0x24);
        L.lIllIIIIII[28] = 0xFFFFF7DB & 0x5ABE;
        L.lIllIIIIII[29] = -(0xFFFFD4E2 & 0x7B9F) & (0xFFFFFEF7 & 0x7FDD);
        L.lIllIIIIII[30] = 0xFFFFBF7B & 0x6ED4;
        L.lIllIIIIII[31] = 0xFFFFAFCE & 0x7E7F;
        L.lIllIIIIII[32] = -(0xFFFFF2F9 & 0x5DB7) & (0xFFFFFFFD & 0x7EFE);
        L.lIllIIIIII[33] = 0xFFFFEF5A & 0x3EF7;
        L.lIllIIIIII[34] = 0xFFFFAEDE & 0x7F6B;
        L.lIllIIIIII[35] = 0xFFFFFEF7 & 0x2FC8;
        L.lIllIIIIII[36] = 5 ^ 0x2A ^ (0xB0 ^ 0xC7);
        L.lIllIIIIII[37] = 0xFFFFEF4B & 0x5FBF;
        L.lIllIIIIII[38] = 0x3B ^ 0x16 ^ (0xC4 ^ 0xC1);
        L.lIllIIIIII[39] = 0x81 ^ 0x8E;
        L.lIllIIIIII[40] = 0x7E ^ 0x4C;
        L.lIllIIIIII[41] = 0xC1 ^ 0xA9 ^ (0x78 ^ 4);
        L.lIllIIIIII[42] = 0xC6 ^ 0xA2 ^ (0x7E ^ 3);
        L.lIllIIIIII[43] = -(0xFFFFFBF9 & 0xC57) & (0xFFFF897E & Short.MAX_VALUE);
        L.lIllIIIIII[44] = 0x6F ^ 0xC ^ (0x4D ^ 0x12);
        L.lIllIIIIII[45] = 0xFFFFDFBF & 0x2173;
        L.lIllIIIIII[46] = 0xFFFF9FF5 & 0x69AF;
        L.lIllIIIIII[47] = -(0xFFFFF6D3 & 0x3BBD) & (0xFFFFFFFF & 0x3FFB);
        L.lIllIIIIII[48] = 0xFFFFFD74 & 0xFEB;
        L.lIllIIIIII[49] = 0x43 ^ 0x25 ^ (0x42 ^ 0x2F);
        L.lIllIIIIII[50] = -(0xFFFFD2B9 & 0x7F67) & (0xFFFFDFFF & 0x7F7D);
        L.lIllIIIIII[51] = -(0xFFFFE47D & 0x7FD3) & (0xFFFFEFF9 & 0x7DF7);
        L.lIllIIIIII[52] = -(0xFFFFDA73 & 0x758D) & (0xFFFFDF77 & 0x7DDF);
        L.lIllIIIIII[53] = 0 ^ 0xE;
        L.lIllIIIIII[54] = 0x94 ^ 0x86;
        L.lIllIIIIII[55] = -(0xFFFFD8F7 & 0x6749) & (0xFFFFC9F7 & 0x7FFB);
        L.lIllIIIIII[56] = 0xFFFFFF7D & 0xDDA;
        L.lIllIIIIII[57] = -(2 ^ 0x47) & (0xFFFFCDFF & 0x3BF6);
        L.lIllIIIIII[58] = 0xFFFFDFDD & 0x2D7B;
        L.lIllIIIIII[59] = 0xFFFFFDF9 & 0xBB7;
        L.lIllIIIIII[60] = -(0xFFFFB38D & 0x7E7F) & (0xFFFFFFEF & 0x3F7F);
        L.lIllIIIIII[61] = 0x6E ^ 0x78;
        L.lIllIIIIII[62] = -" ".length();
        L.lIllIIIIII[63] = 0x39 ^ 0x35;
        L.lIllIIIIII[64] = 0xB5 ^ 0xB8;
        L.lIllIIIIII[65] = 2 ^ 0x12;
        L.lIllIIIIII[66] = 0x7D ^ 0x6C;
        L.lIllIIIIII[67] = 0xD7 ^ 0xC4;
        L.lIllIIIIII[68] = 122 + 174 - 184 + 103 ^ 100 + 135 - 42 + 1;
        L.lIllIIIIII[69] = 0x39 ^ 0x2E;
        L.lIllIIIIII[70] = 0x32 ^ 0x2A;
        L.lIllIIIIII[71] = 0x63 ^ 0x5C ^ (0xB2 ^ 0x97);
        L.lIllIIIIII[72] = 149 + 161 - 283 + 158 ^ 161 + 77 - 199 + 123;
        L.lIllIIIIII[73] = 0xC8 ^ 0xBA ^ (0x78 ^ 0x16);
        L.lIllIIIIII[74] = 0x32 ^ 0x2F;
        L.lIllIIIIII[75] = 120 + 74 - 83 + 53 ^ 74 + 185 - 184 + 112;
        L.lIllIIIIII[76] = -(0x1A ^ 0x3B) & (0xFFFFCDFF & 0x3E7F);
        L.lIllIIIIII[77] = -(0xFFFFE3E9 & 0x3CDF) & (0xFFFFADFE & 0x7FDF);
        L.lIllIIIIII[78] = " ".length() + (0xE3 ^ 0x94) - (0x89 ^ 0x80) + (0x73 ^ 0x69);
        L.lIllIIIIII[79] = 0xE4 ^ 0xAA ^ (0x66 ^ 0x76);
        L.lIllIIIIII[80] = 0xFFFFAC9F & 0x5FF3;
        L.lIllIIIIII[81] = 0xFFFF9FD5 & 0x6D7B;
        L.lIllIIIIII[82] = -(0xFFFFB39B & 0x4F75) & (0xFFFF8FDF & 0x7FBC);
        L.lIllIIIIII[83] = -(0xFFFFB75B & 0x6AA5) & (0xFFFFFFFE & 0x2E7F);
        L.lIllIIIIII[84] = 0xFFFFFDD4 & 0xF7F;
        L.lIllIIIIII[85] = 0xFFFFCC7F & 0x3FF6;
        L.lIllIIIIII[86] = -(0xFFFFF3F3 & 0x1EAF) & (0xFFFF9FF7 & Short.MAX_VALUE);
        L.lIllIIIIII[87] = -(0xFFFFF6B7 & 0x597F) & (0xFFFFDDFF & 0x7F7F);
        L.lIllIIIIII[88] = 0xFFFFECEB & 0x1F7F;
        L.lIllIIIIII[89] = -(0xFFFFE257 & 0x5FA9) & (0xFFFFFF37 & 0x4FFE);
        L.lIllIIIIII[90] = 0xFFFFEDFB & 0x1E95;
        L.lIllIIIIII[91] = 0xFFFFCF76 & 0x3DC9;
        L.lIllIIIIII[92] = 0xFFFF8FF3 & 0x7CAE;
        L.lIllIIIIII[93] = 0xFFFFED4E & 0x1FFB;
        L.lIllIIIIII[94] = 0xFFFFED77 & 0x1FDA;
        L.lIllIIIIII[95] = 124 + 67 - 167 + 124 ^ 97 + 85 - 141 + 139;
        L.lIllIIIIII[96] = -(0xFFFFD737 & 0x29CC) & (0xFFFFFDFF & 0xF9B);
        L.lIllIIIIII[97] = 0x1A ^ 0x60 ^ (0xD7 ^ 0x8C);
        L.lIllIIIIII[98] = 54 + 100 - 141 + 138 ^ 53 + 50 - 26 + 104;
        L.lIllIIIIII[99] = 6 + 3 - -132 + 3 ^ 121 + 55 - 14 + 17;
        L.lIllIIIIII[100] = 0x62 ^ 0x39 ^ 65 + 100 - 160 + 122;
        L.lIllIIIIII[101] = 15 + 74 - 70 + 112 ^ 65 + 42 - 55 + 114;
        L.lIllIIIIII[102] = 0x3F ^ 0x58 ^ (0xDC ^ 0x9D);
        L.lIllIIIIII[103] = 0xF0 ^ 0x92 ^ (0x45 ^ 0);
        L.lIllIIIIII[104] = -(0xFFFFCFF7 & 0x7A09) & (0xFFFFFF3D & 0x6BF6);
        L.lIllIIIIII[105] = 0xB9 ^ 0x8A ^ (0xA1 ^ 0xBB);
        L.lIllIIIIII[106] = 0x26 ^ 0xC;
        L.lIllIIIIII[107] = 0x3C ^ 0x17;
        L.lIllIIIIII[108] = 65 + 63 - 85 + 138 ^ 145 + 83 - 189 + 114;
        L.lIllIIIIII[109] = 0x5C ^ 0x14 ^ (0xF7 ^ 0x92);
        L.lIllIIIIII[110] = 0x5F ^ 0x30 ^ (0xCA ^ 0x8B);
        L.lIllIIIIII[111] = 0x9C ^ 0x8A ^ (0x4A ^ 0x73);
        L.lIllIIIIII[112] = 0xE4 ^ 0x8E ^ (0x27 ^ 0x7D);
        L.lIllIIIIII[113] = 0xBA ^ 0x8B;
        L.lIllIIIIII[114] = 0x67 ^ 0x53;
        L.lIllIIIIII[115] = -(0xFFFFE7CF & 0x5E35) & (0xFFFFFFFF & 0x7FF6);
        L.lIllIIIIII[116] = 0xD6 ^ 0xA8 ^ (0x36 ^ 0x7D);
        L.lIllIIIIII[117] = 0xA9 ^ 0xBF ^ (0x7F ^ 0x5F);
        L.lIllIIIIII[118] = 0xFFFFF9FB & 0x3FF7;
        L.lIllIIIIII[119] = 0x9E ^ 0xA9;
        L.lIllIIIIII[120] = 0xFA ^ 0xBD ^ 54 + 76 - 106 + 103;
        L.lIllIIIIII[121] = -(0xBA ^ 0xB0) & (0xFFFFBBFF & 0x7DFD);
        L.lIllIIIIII[122] = 0x9D ^ 0xA4;
        L.lIllIIIIII[123] = 0x58 ^ 0x62;
        L.lIllIIIIII[124] = 7 ^ 0x64 ^ (0xC5 ^ 0x9D);
        L.lIllIIIIII[125] = -(0xFFFFF651 & 0x7BFF) & (0xFFFFFFFF & 0x7FDF);
        L.lIllIIIIII[126] = -(0xFFFFF796 & 0x4A6F) & (0xFFFFDFFF & 0x6F8F);
        L.lIllIIIIII[127] = 0xFFFFFFEF & 0xDBE;
        L.lIllIIIIII[128] = -(0xFFFFABF9 & 0x5657) & (0xFFFFEFF2 & 0x1FFF);
        L.lIllIIIIII[129] = 0xFFFF8DAF & 0x7FF7;
        L.lIllIIIIII[130] = -(0xFFFFBF69 & 0x50F7) & (0xFFFF9DFB & Short.MAX_VALUE);
        L.lIllIIIIII[131] = -(0x6B ^ 0x28) & (0xFFFFCFEF & 0x3DFB);
        L.lIllIIIIII[132] = -(0xFFFFB73F & 0x6AD0) & (0xFFFFAF9F & Short.MAX_VALUE);
        L.lIllIIIIII[133] = 0xFFFF8FF9 & 0x7DA7;
        L.lIllIIIIII[134] = 0xFFFF8FF7 & 0x7D9B;
        L.lIllIIIIII[135] = -(0xFFFFF3F9 & 0x5C67) & (0xFFFFDDFF & 0x7FFD);
        L.lIllIIIIII[136] = 0xFFFFDD8B & 0x2FFF;
        L.lIllIIIIII[137] = 0xFFFFDDF6 & 0x2FBB;
        L.lIllIIIIII[138] = 0xFFFFEDB3 & 0x1FDD;
        L.lIllIIIIII[139] = 0xFFFFEDDE & 0x1FBF;
        L.lIllIIIIII[140] = 1 ^ 0x4B ^ (0x67 ^ 0x10);
        L.lIllIIIIII[141] = 0x21 ^ 0x1E;
        L.lIllIIIIII[142] = 0x63 ^ 0x23;
        L.lIllIIIIII[143] = 0xC6 ^ 0xBB ^ (0x84 ^ 0xB8);
        L.lIllIIIIII[144] = 115 + 15 - -10 + 79 ^ 126 + 81 - 96 + 42;
        L.lIllIIIIII[145] = 48 + 143 - 151 + 154 ^ 90 + 58 - 51 + 32;
        L.lIllIIIIII[146] = 3 ^ 0x47;
        L.lIllIIIIII[147] = 0x86 ^ 0xB7 ^ (0x48 ^ 0x3C);
        L.lIllIIIIII[148] = 121 + 44 - 151 + 238 ^ 155 + 53 - 90 + 68;
        L.lIllIIIIII[149] = 6 ^ 0x41;
        L.lIllIIIIII[150] = 0x92 ^ 0xC5 ^ (0xA2 ^ 0xBD);
        L.lIllIIIIII[151] = 82 + 224 - 279 + 206 ^ 93 + 0 - 22 + 89;
        L.lIllIIIIII[152] = 152 + 11 - 95 + 125 ^ 109 + 37 - 137 + 130;
        L.lIllIIIIII[153] = 0x66 ^ 0x2D;
        L.lIllIIIIII[154] = 0xCF ^ 0x83;
        L.lIllIIIIII[155] = 0x29 ^ 0x64;
        L.lIllIIIIII[156] = 0x77 ^ 0x55 ^ (0x72 ^ 0x1E);
        L.lIllIIIIII[157] = 0xE2 ^ 0xAD;
        L.lIllIIIIII[158] = 208 + 67 - 181 + 120 ^ 93 + 91 - 57 + 7;
        L.lIllIIIIII[159] = 0xFE ^ 0x90 ^ (0xC ^ 0x33);
        L.lIllIIIIII[160] = 10 + 30 - -68 + 91 ^ 17 + 56 - -7 + 69;
        L.lIllIIIIII[161] = 0x14 ^ 0x47;
        L.lIllIIIIII[162] = 0xFFFF8F7F & 0x7AFF;
        L.lIllIIIIII[163] = -(0xFFFFFF93 & 0x52EE) & (0xFFFFFFFF & 0x5FFF);
        L.lIllIIIIII[164] = -(0xFFFFFF53 & 0x71ED) & (0xFFFFFBDF & Short.MAX_VALUE);
        L.lIllIIIIII[165] = 0xFFFF9BDD & 0x6EAF;
        L.lIllIIIIII[166] = -(0xFFFFEEFD & 0x756F) & (0xFFFFEEFF & Short.MAX_VALUE);
        L.lIllIIIIII[167] = 0xFFFFFB8B & 0xEFD;
        L.lIllIIIIII[168] = -(0xFFFFF1EB & 0x2F35) & (0xFFFFEBA5 & 0x3FFA);
        L.lIllIIIIII[169] = -(0xFFFFFB6F & 0x46FF) & (0xFFFFDFFF & 0x6FEF);
        L.lIllIIIIII[170] = 0xFFFFAFBD & 0x5AEB;
        L.lIllIIIIII[171] = 0xFFFF8DA7 & 0x7FF8;
        L.lIllIIIIII[172] = 108 + 137 - 210 + 175 ^ 32 + 74 - 1 + 29;
        L.lIllIIIIII[173] = 0x5B ^ 0 ^ (0xAC ^ 0xA2);
        L.lIllIIIIII[174] = 4 ^ 0x52;
        L.lIllIIIIII[175] = 0x6A ^ 0x7A ^ (0xFE ^ 0xB9);
        L.lIllIIIIII[176] = 0x21 ^ 0x1A ^ (0x1B ^ 0x79);
        L.lIllIIIIII[177] = 46 + 60 - 73 + 196 ^ 44 + 43 - -28 + 76;
        L.lIllIIIIII[178] = 0x7D ^ 0x26;
        L.lIllIIIIII[179] = 0xF9 ^ 0x88 ^ (0x13 ^ 0x3E);
        L.lIllIIIIII[180] = 0x5E ^ 3;
        L.lIllIIIIII[181] = 0xFF ^ 0xA0;
        L.lIllIIIIII[182] = 0x14 ^ 0x74;
        L.lIllIIIIII[183] = 0x73 ^ 0x12;
        L.lIllIIIIII[184] = 0xCA ^ 0xA8;
        L.lIllIIIIII[185] = 0x4A ^ 0x29;
        L.lIllIIIIII[186] = 0xC7 ^ 0xA3;
        L.lIllIIIIII[187] = 0x5D ^ 0x74 ^ (0x45 ^ 9);
        L.lIllIIIIII[188] = 0xDC ^ 0xBA;
        L.lIllIIIIII[189] = 0xFFFFCCFF & 0x3F77;
        L.lIllIIIIII[190] = 0xFFFF8F77 & 0x7DDE;
        L.lIllIIIIII[191] = -(0xFFFFFFC7 & 0x3139) & (0xFFFFFF7E & 0x3DEF);
        L.lIllIIIIII[192] = 0xFFFF9FFF & 0x6D3B;
        L.lIllIIIIII[193] = -(82 + 123 - 201 + 131) & (0xFFFFAFDF & 0x7EEF);
        L.lIllIIIIII[194] = 0x34 ^ 0x53;
        L.lIllIIIIII[195] = 0xFFFFD5FF & 0x3F7C;
        L.lIllIIIIII[196] = -(0xFFFF9637 & 0x6FDB) & (0xFFFFE7BF & 0x7FFA);
        L.lIllIIIIII[197] = 0xFFFFD7E5 & 0x2B9E;
        L.lIllIIIIII[198] = -(0xFFFF9A2B & 0x7DDD) & (0xFFFFBBFF & 0x5FBE);
        L.lIllIIIIII[199] = -(0xFFFFFBF9 & 0x4C27) & (0xFFFFEFBE & 0x5FFF);
        L.lIllIIIIII[200] = -(0xFFFFDC7B & 0x3B8E) & (0xFFFFFFFF & 0x3AFF);
        L.lIllIIIIII[201] = 0xFFFFEEFA & 0x3FCF;
        L.lIllIIIIII[202] = -(0xFFFFBFFD & 0x5AA3) & (0xFFFFFFFE & Short.MAX_VALUE);
        L.lIllIIIIII[203] = 0x22 ^ 0x4A;
        L.lIllIIIIII[204] = 0xC0 ^ 0xA9;
        L.lIllIIIIII[205] = 0x12 ^ 0x78;
        L.lIllIIIIII[206] = 0x73 ^ 0x18;
        L.lIllIIIIII[207] = 0x64 ^ 8;
        L.lIllIIIIII[208] = 0x33 ^ 0x52 ^ (0x74 ^ 0x78);
        L.lIllIIIIII[209] = -(0xFFFFE7FD & 0x7C13) & (0xFFFFFFBF & 0x6EDF);
        L.lIllIIIIII[210] = 0xFFFF9DC9 & 0x6FBF;
        L.lIllIIIIII[211] = 0x2E ^ 0x5F ^ (0x62 ^ 0x7D);
        L.lIllIIIIII[212] = 0xFFFFDD9F & 0x2FED;
        L.lIllIIIIII[213] = 116 + 107 - 136 + 112 ^ 117 + 159 - 120 + 12;
        L.lIllIIIIII[214] = -(0xFFFFA5ED & 0x7F7B) & (0xFFFFEFFF & 0x3FFF);
        L.lIllIIIIII[215] = -(0xFFFFB6EF & 0x5B7B) & (0xFFFF9FFE & Short.MAX_VALUE);
        L.lIllIIIIII[216] = 106 + 67 - -18 + 22 ^ 149 + 113 - 254 + 157;
        L.lIllIIIIII[217] = 0xFFFFCFDF & 0x3AB6;
        L.lIllIIIIII[218] = 0x60 ^ 0x11;
        L.lIllIIIIII[219] = 0xFFFFEBAB & 0x1EF5;
        L.lIllIIIIII[220] = 0xFFFFFDB7 & 0xFED;
        L.lIllIIIIII[221] = 0x31 ^ 0x43;
        L.lIllIIIIII[222] = -(0xFFFF937B & 0x7E8D) & (0xFFFFDFFE & 0x3FBF);
        L.lIllIIIIII[223] = 0xFFFFADBD & 0x5FDE;
        L.lIllIIIIII[224] = 0x54 ^ 0x27;
        L.lIllIIIIII[225] = 0xFFFFAFAF & 0x5DFF;
        L.lIllIIIIII[226] = 0xBC ^ 0xC5 ^ (0x55 ^ 0x58);
        L.lIllIIIIII[227] = 100 + 96 - 182 + 167 ^ 129 + 7 - 107 + 163;
        L.lIllIIIIII[228] = 0xFFFFAFD6 & 0x5DBF;
        L.lIllIIIIII[229] = -(0xFFFFF3CF & 0x3C7B) & (0xFFFFBDFE & 0x7FEF);
        L.lIllIIIIII[230] = 0x83 ^ 0xC2 ^ (0x6C ^ 0x5B);
        L.lIllIIIIII[231] = -(0xFFFF9EE5 & 0x735F) & (0xFFFFDFFF & 0x3FEF);
        L.lIllIIIIII[232] = 0xE ^ 0x79;
        L.lIllIIIIII[233] = 0xA3 ^ 0x99 ^ (0x85 ^ 0xC7);
        L.lIllIIIIII[234] = -(0x6F ^ 0x2E) & (0xFFFFFFF5 & 0xDFB);
        L.lIllIIIIII[235] = 0xFFFFEFF5 & 0x19AE;
        L.lIllIIIIII[236] = -(0xFFFFDC5A & 0x67A7) & (0xFFFFCDEB & 0x7FBF);
        L.lIllIIIIII[237] = -(0xFFFFF7A9 & 0x6857) & (0xFFFFFF6F & 0x6DFD);
        L.lIllIIIIII[238] = 0xF9 ^ 0x80;
    }

    public static void O() {
        d lllllllllllllllllllIIllIlIIlllIl;
        block18: {
            block17: {
                block16: {
                    block15: {
                        int[] nArray = new int[lIllIIIIII[1]];
                        nArray[L.lIllIIIIII[0]] = lIllIIIIII[16];
                        if (L.lIIlIlIlIIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                            d d2 = new d(lIllIIIIII[16], lIllIIIIII[1], lIllIIIIII[195]);
                            bp.add(d2);
                            "".length();
                        }
                        int[] nArray2 = new int[lIllIIIIII[1]];
                        nArray2[L.lIllIIIIII[0]] = lIllIIIIII[18];
                        if (L.lIIlIlIlIIIll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            lllllllllllllllllllIIllIlIIlllIl = new d(lIllIIIIII[18], lIllIIIIII[3], lIllIIIIII[196]);
                            bp.add(lllllllllllllllllllIIllIlIIlllIl);
                            "".length();
                        }
                        int[] nArray3 = new int[lIllIIIIII[1]];
                        nArray3[L.lIllIIIIII[0]] = lIllIIIIII[28];
                        if (L.lIIlIlIlIIIll(Bank.contains((int[])nArray3) ? 1 : 0)) {
                            lllllllllllllllllllIIllIlIIlllIl = new d(lIllIIIIII[28], lIllIIIIII[3], lIllIIIIII[196]);
                            bp.add(lllllllllllllllllllIIllIlIIlllIl);
                            "".length();
                        }
                        int[] nArray4 = new int[lIllIIIIII[1]];
                        nArray4[L.lIllIIIIII[0]] = lIllIIIIII[13];
                        if (L.lIIlIlIlIIIll(Bank.contains((int[])nArray4) ? 1 : 0)) {
                            lllllllllllllllllllIIllIlIIlllIl = new d(lIllIIIIII[13], lIllIIIIII[12], lIllIIIIII[197]);
                            bp.add(lllllllllllllllllllIIllIlIIlllIl);
                            "".length();
                        }
                        int[] nArray5 = new int[lIllIIIIII[1]];
                        nArray5[L.lIllIIIIII[0]] = lIllIIIIII[22];
                        if (L.lIIlIlIlIIIll(Bank.contains((int[])nArray5) ? 1 : 0)) {
                            lllllllllllllllllllIIllIlIIlllIl = new d(lIllIIIIII[22], lIllIIIIII[12], lIllIIIIII[198]);
                            bp.add(lllllllllllllllllllIIllIlIIlllIl);
                            "".length();
                        }
                        int[] nArray6 = new int[lIllIIIIII[1]];
                        nArray6[L.lIllIIIIII[0]] = lIllIIIIII[15];
                        if (L.lIIlIlIlIIIll(Bank.contains((int[])nArray6) ? 1 : 0)) {
                            lllllllllllllllllllIIllIlIIlllIl = new d(lIllIIIIII[15], lIllIIIIII[12], lIllIIIIII[198]);
                            bp.add(lllllllllllllllllllIIllIlIIlllIl);
                            "".length();
                        }
                        int[] nArray7 = new int[lIllIIIIII[1]];
                        nArray7[L.lIllIIIIII[0]] = lIllIIIIII[14];
                        if (L.lIIlIlIlIIIll(Bank.contains((int[])nArray7) ? 1 : 0)) {
                            lllllllllllllllllllIIllIlIIlllIl = new d(lIllIIIIII[14], lIllIIIIII[12], lIllIIIIII[198]);
                            bp.add(lllllllllllllllllllIIllIlIIlllIl);
                            "".length();
                        }
                        int[] nArray8 = new int[lIllIIIIII[1]];
                        nArray8[L.lIllIIIIII[0]] = lIllIIIIII[24];
                        if (!L.lIIlIlIlIIIIl(Bank.contains((int[])nArray8) ? 1 : 0)) break block15;
                        int[] nArray9 = new int[lIllIIIIII[1]];
                        nArray9[L.lIllIIIIII[0]] = lIllIIIIII[24];
                        if (!L.lIIlIlIlIIIIl(Bank.contains((int[])nArray9) ? 1 : 0)) break block16;
                        int[] nArray10 = new int[lIllIIIIII[1]];
                        nArray10[L.lIllIIIIII[0]] = lIllIIIIII[24];
                        if (!L.lIIlIlIlIIIlI(Bank.getFirst((int[])nArray10).getQuantity(), lIllIIIIII[12])) break block16;
                    }
                    lllllllllllllllllllIIllIlIIlllIl = new d(js, lIllIIIIII[44], lIllIIIIII[199]);
                    bp.add(lllllllllllllllllllIIllIlIIlllIl);
                    "".length();
                }
                int[] nArray = new int[lIllIIIIII[1]];
                nArray[L.lIllIIIIII[0]] = lIllIIIIII[26];
                if (!L.lIIlIlIlIIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block17;
                int[] nArray11 = new int[lIllIIIIII[1]];
                nArray11[L.lIllIIIIII[0]] = lIllIIIIII[26];
                if (!L.lIIlIlIlIIIIl(Bank.contains((int[])nArray11) ? 1 : 0)) break block18;
                int[] nArray12 = new int[lIllIIIIII[1]];
                nArray12[L.lIllIIIIII[0]] = lIllIIIIII[26];
                if (!L.lIIlIlIlIIIlI(Bank.getFirst((int[])nArray12).getQuantity(), lIllIIIIII[12])) break block18;
            }
            lllllllllllllllllllIIllIlIIlllIl = new d(lIllIIIIII[26], lIllIIIIII[12], lIllIIIIII[200]);
            bp.add(lllllllllllllllllllIIllIlIIlllIl);
            "".length();
        }
        int[] nArray = new int[lIllIIIIII[1]];
        nArray[L.lIllIIIIII[0]] = lIllIIIIII[201];
        if (L.lIIlIlIlIIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
            lllllllllllllllllllIIllIlIIlllIl = new d(lIllIIIIII[201], lIllIIIIII[1], lIllIIIIII[202]);
            bp.add(lllllllllllllllllllIIllIlIIlllIl);
            "".length();
        }
        int[] nArray13 = new int[lIllIIIIII[1]];
        nArray13[L.lIllIIIIII[0]] = lIllIIIIII[20];
        if (L.lIIlIlIlIIIll(Bank.contains((int[])nArray13) ? 1 : 0)) {
            lllllllllllllllllllIIllIlIIlllIl = new d(lIllIIIIII[20], lIllIIIIII[41], j.bZ);
            bp.add(lllllllllllllllllllIIllIlIIlllIl);
            "".length();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean al() {
        int n2;
        if (L.lIIlIlIlIIlll(Skills.getBoostedLevel((Skill)Skill.AGILITY), lIllIIIIII[38])) {
            int n3;
            int[] nArray = new int[lIllIIIIII[1]];
            nArray[L.lIllIIIIII[0]] = lIllIIIIII[13];
            if (L.lIIlIlIlIIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lIllIIIIII[1]];
                nArray2[L.lIllIIIIII[0]] = lIllIIIIII[26];
                if (L.lIIlIlIlIIIIl(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                    int[] nArray3 = new int[lIllIIIIII[1]];
                    nArray3[L.lIllIIIIII[0]] = lIllIIIIII[24];
                    if (!(!L.lIIlIlIlIIIIl(Inventory.contains((int[])nArray3) ? 1 : 0) || L.lIIlIlIlIIIll(Inventory.contains(item -> item.getName().contains(lIlIllllll[lIllIIIIII[207]])) ? 1 : 0) && !L.lIIlIlIlIIIIl(Equipment.contains(item -> item.getName().contains(lIlIllllll[lIllIIIIII[206]])) ? 1 : 0) || L.lIIlIlIlIIIll(Inventory.contains((int[])f.be) ? 1 : 0) && !L.lIIlIlIlIIIIl(Equipment.contains((int[])f.be) ? 1 : 0))) {
                        n3 = lIllIIIIII[1];
                        "".length();
                        if (("  ".length() & ~"  ".length()) == 0) return n3 != 0;
                        return ((0x56 ^ 0x77) & ~(0x28 ^ 9)) != 0;
                    }
                }
            }
            n3 = lIllIIIIII[0];
            return n3 != 0;
        }
        int[] nArray = new int[lIllIIIIII[1]];
        nArray[L.lIllIIIIII[0]] = lIllIIIIII[13];
        if (L.lIIlIlIlIIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray4 = new int[lIllIIIIII[1]];
            nArray4[L.lIllIIIIII[0]] = lIllIIIIII[15];
            if (L.lIIlIlIlIIIIl(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                int[] nArray5 = new int[lIllIIIIII[1]];
                nArray5[L.lIllIIIIII[0]] = lIllIIIIII[14];
                if (!(!L.lIIlIlIlIIIIl(Inventory.contains((int[])nArray5) ? 1 : 0) || L.lIIlIlIlIIIll(Inventory.contains(item -> item.getName().contains(lIlIllllll[lIllIIIIII[205]])) ? 1 : 0) && !L.lIIlIlIlIIIIl(Equipment.contains(item -> item.getName().contains(lIlIllllll[lIllIIIIII[204]])) ? 1 : 0) || L.lIIlIlIlIIIll(Inventory.contains((int[])f.be) ? 1 : 0) && !L.lIIlIlIlIIIIl(Equipment.contains((int[])f.be) ? 1 : 0))) {
                    n2 = lIllIIIIII[1];
                    "".length();
                    if ("  ".length() == "  ".length()) return n2 != 0;
                    return ((0x72 ^ 0x67) & ~(0x2E ^ 0x3B)) != 0;
                }
            }
        }
        n2 = lIllIIIIII[0];
        return n2 != 0;
    }

    private static String lIIlIlIIlllIl(String lllllllllllllllllllIIllIIlIIlIlI, String lllllllllllllllllllIIllIIlIIlIIl) {
        lllllllllllllllllllIIllIIlIIlIlI = new String(Base64.getDecoder().decode(lllllllllllllllllllIIllIIlIIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllllIIllIIlIIlIII = new StringBuilder();
        char[] lllllllllllllllllllIIllIIlIIIlll = lllllllllllllllllllIIllIIlIIlIIl.toCharArray();
        int lllllllllllllllllllIIllIIlIIIllI = lIllIIIIII[0];
        char[] lllllllllllllllllllIIllIIlIIIIII = lllllllllllllllllllIIllIIlIIlIlI.toCharArray();
        int lllllllllllllllllllIIllIIIllllll = lllllllllllllllllllIIllIIlIIIIII.length;
        int lllllllllllllllllllIIllIIIlllllI = lIllIIIIII[0];
        while (L.lIIlIlIlIIIlI(lllllllllllllllllllIIllIIIlllllI, lllllllllllllllllllIIllIIIllllll)) {
            char lllllllllllllllllllIIllIIlIIlIll = lllllllllllllllllllIIllIIlIIIIII[lllllllllllllllllllIIllIIIlllllI];
            lllllllllllllllllllIIllIIlIIlIII.append((char)(lllllllllllllllllllIIllIIlIIlIll ^ lllllllllllllllllllIIllIIlIIIlll[lllllllllllllllllllIIllIIlIIIllI % lllllllllllllllllllIIllIIlIIIlll.length]));
            "".length();
            ++lllllllllllllllllllIIllIIlIIIllI;
            ++lllllllllllllllllllIIllIIIlllllI;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllllllIIllIIlIIlIII);
    }

    @Override
    public boolean af() {
        boolean bl;
        if (L.lIIlIlIlIIlll(Skills.getLevel((Skill)Skill.AGILITY), lIllIIIIII[2])) {
            bl = lIllIIIIII[1];
            "".length();
            if (-"   ".length() >= 0) {
                return ((0xA ^ 0x27) & ~(0x8E ^ 0xA3)) != 0;
            }
        } else {
            bl = lIllIIIIII[0];
        }
        return bl;
    }

    private static boolean lIIlIlIlIIlII(Object object) {
        return object != null;
    }

    private static boolean lIIlIlIlIlIIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIIlIlIlIIIll(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    private static void cP() {
        WorldArea worldArea = new WorldArea(lIllIIIIII[46], lIllIIIIII[47], lIllIIIIII[12], lIllIIIIII[21], lIllIIIIII[0]);
        WorldArea worldArea2 = new WorldArea(lIllIIIIII[46], lIllIIIIII[48], lIllIIIIII[49], lIllIIIIII[25], lIllIIIIII[0]);
        WorldArea worldArea3 = new WorldArea(lIllIIIIII[46], lIllIIIIII[50], lIllIIIIII[49], lIllIIIIII[25], lIllIIIIII[1]);
        WorldArea worldArea4 = new WorldArea(lIllIIIIII[51], lIllIIIIII[52], lIllIIIIII[53], lIllIIIIII[54], lIllIIIIII[3]);
        WorldArea worldArea5 = new WorldArea(lIllIIIIII[55], lIllIIIIII[56], lIllIIIIII[25], lIllIIIIII[12], lIllIIIIII[3]);
        WorldArea worldArea6 = new WorldArea(lIllIIIIII[57], lIllIIIIII[58], lIllIIIIII[49], lIllIIIIII[12], lIllIIIIII[0]);
        WorldArea worldArea7 = new WorldArea(lIllIIIIII[59], lIllIIIIII[60], lIllIIIIII[12], lIllIIIIII[21], lIllIIIIII[0]);
        WorldArea worldArea8 = new WorldArea(lIllIIIIII[46], lIllIIIIII[47], lIllIIIIII[61], lIllIIIIII[21], lIllIIIIII[0]);
        if (L.lIIlIlIlIIIll(ju.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && L.lIIlIlIlIIIll(jv.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && L.lIIlIlIlIIIll(jw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderShamans.c = lIlIllllll[lIllIIIIII[12]];
            e.b(jx);
            Time.sleepTicks((int)lIllIIIIII[1]);
            "".length();
        }
        if ((!L.lIIlIlIlIIIll(ju.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !L.lIIlIlIlIIIll(jv.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || L.lIIlIlIlIIIIl(jw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && L.lIIlIlIlIlIII(Players.getLocal().getAnimation(), lIllIIIIII[62]) && L.lIIlIlIlIIIll(Players.getLocal().isMoving() ? 1 : 0)) {
            void lllllllllllllllllllIIlllIIlIIIlI;
            void lllllllllllllllllllIIlllIIlIIIll;
            void lllllllllllllllllllIIlllIIlIIlII;
            void lllllllllllllllllllIIlllIIlIIlIl;
            void lllllllllllllllllllIIlllIIlIIllI;
            void lllllllllllllllllllIIlllIIlIIlll;
            void lllllllllllllllllllIIlllIIlIIIIl;
            if (L.lIIlIlIlIIIIl(lllllllllllllllllllIIlllIIlIIIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderShamans.c = lIlIllllll[lIllIIIIII[49]];
                String[] stringArray = new String[lIllIIIIII[1]];
                stringArray[L.lIllIIIIII[0]] = lIlIllllll[lIllIIIIII[63]];
                TileObjects.getNearest((String[])stringArray).interact(lIlIllllll[lIllIIIIII[64]]);
                Time.sleepTicks((int)lIllIIIIII[3]);
                "".length();
            }
            if (L.lIIlIlIlIIIIl(lllllllllllllllllllIIlllIIlIIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderShamans.c = lIlIllllll[lIllIIIIII[53]];
                String[] stringArray = new String[lIllIIIIII[1]];
                stringArray[L.lIllIIIIII[0]] = lIlIllllll[lIllIIIIII[39]];
                TileObjects.getNearest((String[])stringArray).interact(lIlIllllll[lIllIIIIII[65]]);
                Time.sleepTicks((int)lIllIIIIII[3]);
                "".length();
            }
            if (L.lIIlIlIlIIIIl(lllllllllllllllllllIIlllIIlIIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderShamans.c = lIlIllllll[lIllIIIIII[66]];
                String[] stringArray = new String[lIllIIIIII[1]];
                stringArray[L.lIllIIIIII[0]] = lIlIllllll[lIllIIIIII[54]];
                TileObjects.getNearest((String[])stringArray).interact(lIlIllllll[lIllIIIIII[67]]);
                Time.sleepTicks((int)lIllIIIIII[3]);
                "".length();
            }
            if (L.lIIlIlIlIIIIl(lllllllllllllllllllIIlllIIlIIlIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderShamans.c = lIlIllllll[lIllIIIIII[41]];
                String[] stringArray = new String[lIllIIIIII[1]];
                stringArray[L.lIllIIIIII[0]] = lIlIllllll[lIllIIIIII[68]];
                TileObjects.getNearest((String[])stringArray).interact(lIlIllllll[lIllIIIIII[61]]);
                Time.sleepTicks((int)lIllIIIIII[19]);
                "".length();
            }
            if (L.lIIlIlIlIIIIl(lllllllllllllllllllIIlllIIlIIlII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderShamans.c = lIlIllllll[lIllIIIIII[69]];
                String[] stringArray = new String[lIllIIIIII[1]];
                stringArray[L.lIllIIIIII[0]] = lIlIllllll[lIllIIIIII[70]];
                TileObjects.getNearest((String[])stringArray).interact(lIlIllllll[lIllIIIIII[42]]);
                Time.sleepTicks((int)lIllIIIIII[17]);
                "".length();
            }
            if (L.lIIlIlIlIIIIl(lllllllllllllllllllIIlllIIlIIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderShamans.c = lIlIllllll[lIllIIIIII[71]];
                String[] stringArray = new String[lIllIIIIII[1]];
                stringArray[L.lIllIIIIII[0]] = lIlIllllll[lIllIIIIII[72]];
                TileObjects.getNearest((String[])stringArray).interact(lIlIllllll[lIllIIIIII[73]]);
                Time.sleepTicks((int)lIllIIIIII[10]);
                "".length();
            }
            if (L.lIIlIlIlIIIIl(lllllllllllllllllllIIlllIIlIIIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderShamans.c = lIlIllllll[lIllIIIIII[74]];
                String[] stringArray = new String[lIllIIIIII[1]];
                stringArray[L.lIllIIIIII[0]] = lIlIllllll[lIllIIIIII[2]];
                TileObjects.getNearest((String[])stringArray).interact(lIlIllllll[lIllIIIIII[75]]);
                Time.sleepTicks((int)lIllIIIIII[17]);
                "".length();
            }
        }
    }

    private static String lIIlIlIIllllI(String lllllllllllllllllllIIllIIIlIlIII, String lllllllllllllllllllIIllIIIlIIlIl) {
        try {
            SecretKeySpec lllllllllllllllllllIIllIIIlIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIIllIIIlIIlIl.getBytes(StandardCharsets.UTF_8)), lIllIIIIII[25]), "DES");
            Cipher lllllllllllllllllllIIllIIIlIlIlI = Cipher.getInstance("DES");
            lllllllllllllllllllIIllIIIlIlIlI.init(lIllIIIIII[3], lllllllllllllllllllIIllIIIlIlIll);
            return new String(lllllllllllllllllllIIllIIIlIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIIllIIIlIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllllIIllIIIlIlIIl) {
            lllllllllllllllllllIIllIIIlIlIIl.printStackTrace();
            return null;
        }
    }

    public static void cO() {
        if (L.lIIlIlIlIIIIl(bn ? 1 : 0)) {
            AccBuilderShamans.c = lIlIllllll[lIllIIIIII[0]];
            b.a(bp);
            if (L.lIIlIlIlIIIlI(bp.size(), lIllIIIIII[1])) {
                System.out.println(lIlIllllll[lIllIIIIII[1]]);
                bn = lIllIIIIII[0];
            }
        }
        if (L.lIIlIlIlIIIll(bn ? 1 : 0) && L.lIIlIlIlIIIlI(Skills.getLevel((Skill)Skill.AGILITY), lIllIIIIII[2])) {
            if (L.lIIlIlIlIIIll(L.al() ? 1 : 0)) {
                BankLocation lllllllllllllllllllIIlllIIllIIll = BankLocation.getNearest();
                if (L.lIIlIlIlIIlII(lllllllllllllllllllIIlllIIllIIll) && L.lIIlIlIlIIIll(lllllllllllllllllllIIlllIIllIIll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIllllll[lIllIIIIII[3]];
                    WorldArea lllllllllllllllllllIIlllIIllIIlI = new WorldArea(lIllIIIIII[4], lIllIIIIII[5], lIllIIIIII[6], lIllIIIIII[7], lIllIIIIII[0]);
                    if (L.lIIlIlIlIIIIl(lllllllllllllllllllIIlllIIllIIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldPoint lllllllllllllllllllIIlllIIllIIIl = new WorldPoint(lIllIIIIII[8], lIllIIIIII[9], lIllIIIIII[0]);
                        if (L.lIIlIlIlIIlIl(Players.getLocal().getWorldLocation().distanceTo(lllllllllllllllllllIIlllIIllIIIl), lIllIIIIII[10])) {
                            Movement.walkTo((WorldPoint)lllllllllllllllllllIIlllIIllIIIl);
                            "".length();
                            Time.sleepTicks((int)lIllIIIIII[1]);
                            "".length();
                        }
                    }
                    a.a(lllllllllllllllllllIIlllIIllIIll);
                }
                if (L.lIIlIlIlIIlII(lllllllllllllllllllIIlllIIllIIll) && L.lIIlIlIlIIIIl(lllllllllllllllllllIIlllIIllIIll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIllllll[lIllIIIIII[10]];
                    if (L.lIIlIlIlIIIll(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIllIIIIII[11]);
                        "".length();
                    }
                    if (L.lIIlIlIlIIIIl(Bank.isOpen() ? 1 : 0)) {
                        if (L.lIIlIlIlIIllI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIllIIIIII[1]);
                            "".length();
                        }
                        if (L.lIIlIlIlIIllI(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIllIIIIII[3]);
                            "".length();
                        }
                    }
                    int[] nArray = new int[lIllIIIIII[12]];
                    nArray[L.lIllIIIIII[0]] = lIllIIIIII[13];
                    nArray[L.lIllIIIIII[1]] = lIllIIIIII[14];
                    nArray[L.lIllIIIIII[3]] = lIllIIIIII[15];
                    nArray[L.lIllIIIIII[10]] = lIllIIIIII[16];
                    nArray[L.lIllIIIIII[17]] = lIllIIIIII[18];
                    nArray[L.lIllIIIIII[19]] = lIllIIIIII[20];
                    nArray[L.lIllIIIIII[21]] = lIllIIIIII[22];
                    nArray[L.lIllIIIIII[23]] = lIllIIIIII[24];
                    nArray[L.lIllIIIIII[25]] = lIllIIIIII[26];
                    nArray[L.lIllIIIIII[27]] = lIllIIIIII[28];
                    if (L.lIIlIlIlIIIll(e.b(nArray) ? 1 : 0)) {
                        L.O();
                        System.out.println(lIlIllllll[lIllIIIIII[17]]);
                        bn = lIllIIIIII[1];
                        return;
                    }
                    int[] nArray2 = new int[lIllIIIIII[12]];
                    nArray2[L.lIllIIIIII[0]] = lIllIIIIII[13];
                    nArray2[L.lIllIIIIII[1]] = lIllIIIIII[14];
                    nArray2[L.lIllIIIIII[3]] = lIllIIIIII[15];
                    nArray2[L.lIllIIIIII[10]] = lIllIIIIII[16];
                    nArray2[L.lIllIIIIII[17]] = lIllIIIIII[18];
                    nArray2[L.lIllIIIIII[19]] = lIllIIIIII[20];
                    nArray2[L.lIllIIIIII[21]] = lIllIIIIII[22];
                    nArray2[L.lIllIIIIII[23]] = lIllIIIIII[24];
                    nArray2[L.lIllIIIIII[25]] = lIllIIIIII[26];
                    nArray2[L.lIllIIIIII[27]] = lIllIIIIII[28];
                    if (L.lIIlIlIlIIIIl(e.b(nArray2) ? 1 : 0)) {
                        a.a(lIllIIIIII[29], lIllIIIIII[1]);
                        a.a(lIllIIIIII[30], lIllIIIIII[1]);
                        a.a(lIllIIIIII[31], lIllIIIIII[1]);
                        a.a(lIllIIIIII[32], lIllIIIIII[1]);
                        a.a(lIllIIIIII[33], lIllIIIIII[1]);
                        a.a(lIllIIIIII[34], lIllIIIIII[1]);
                        a.a(lIllIIIIII[35], lIllIIIIII[1]);
                        int[] nArray3 = new int[lIllIIIIII[1]];
                        nArray3[L.lIllIIIIII[0]] = lIllIIIIII[29];
                        if (L.lIIlIlIlIIIll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                            int[] nArray4 = new int[lIllIIIIII[1]];
                            nArray4[L.lIllIIIIII[0]] = lIllIIIIII[29];
                            if (L.lIIlIlIlIIIll(Equipment.contains((int[])nArray4) ? 1 : 0)) {
                                int[] nArray5 = new int[lIllIIIIII[1]];
                                nArray5[L.lIllIIIIII[0]] = lIllIIIIII[29];
                                if (L.lIIlIlIlIIIll(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                    a.a(lIllIIIIII[36], lIllIIIIII[1]);
                                }
                            }
                        }
                        a.a(lIllIIIIII[18], lIllIIIIII[1]);
                        e.l(lIllIIIIII[29]);
                        e.l(lIllIIIIII[30]);
                        e.l(lIllIIIIII[31]);
                        e.l(lIllIIIIII[32]);
                        e.l(lIllIIIIII[33]);
                        Time.sleepTicks((int)lIllIIIIII[1]);
                        "".length();
                        e.l(lIllIIIIII[35]);
                        e.l(lIllIIIIII[37]);
                        e.l(lIllIIIIII[34]);
                        e.l(lIllIIIIII[36]);
                        e.l(lIllIIIIII[18]);
                        Time.sleepTicks((int)lIllIIIIII[10]);
                        "".length();
                        if (L.lIIlIlIlIIIll(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepTicks((int)lIllIIIIII[21]);
                            "".length();
                        }
                        if (L.lIIlIlIlIIIIl(Bank.isOpen() ? 1 : 0)) {
                            if (L.lIIlIlIlIIIlI(Skills.getLevel((Skill)Skill.AGILITY), lIllIIIIII[38])) {
                                a.a(lIllIIIIII[13], lIllIIIIII[12]);
                                a.a(lIllIIIIII[14], lIllIIIIII[12]);
                                a.a(lIllIIIIII[22], lIllIIIIII[12]);
                                a.a(lIllIIIIII[15], lIllIIIIII[12]);
                                a.b(f.be, lIllIIIIII[1]);
                                a.a(lIllIIIIII[28], lIllIIIIII[1]);
                                a.a(lIllIIIIII[20], lIllIIIIII[19]);
                                a.a(lIllIIIIII[24], lIllIIIIII[39]);
                            }
                            if (L.lIIlIlIlIIlll(Skills.getLevel((Skill)Skill.AGILITY), lIllIIIIII[38])) {
                                a.a(lIllIIIIII[13], lIllIIIIII[12]);
                                a.a(lIllIIIIII[22], lIllIIIIII[12]);
                                a.a(lIllIIIIII[26], lIllIIIIII[12]);
                                a.b(f.be, lIllIIIIII[1]);
                                a.a(lIllIIIIII[28], lIllIIIIII[1]);
                                a.a(lIllIIIIII[20], lIllIIIIII[25]);
                                a.a(lIllIIIIII[24], lIllIIIIII[12]);
                            }
                        }
                    }
                }
            }
            if (L.lIIlIlIlIIIIl(L.al() ? 1 : 0)) {
                String[] stringArray = new String[lIllIIIIII[1]];
                stringArray[L.lIllIIIIII[0]] = lIlIllllll[lIllIIIIII[19]];
                if (L.lIIlIlIlIIIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray2 = new String[lIllIIIIII[1]];
                    stringArray2[L.lIllIIIIII[0]] = lIlIllllll[lIllIIIIII[21]];
                    Inventory.getFirst((String[])stringArray2).interact(lIlIllllll[lIllIIIIII[23]]);
                }
                if (L.lIIlIlIlIIIIl(Inventory.contains((int[])f.aU) ? 1 : 0) && L.lIIlIlIlIIIlI(Movement.getRunEnergy(), lIllIIIIII[40])) {
                    Inventory.getFirst((int[])f.aU).interact(lIlIllllll[lIllIIIIII[25]]);
                    Time.sleepTicks((int)lIllIIIIII[1]);
                    "".length();
                }
                if (L.lIIlIlIlIIlIl(Combat.getMissingHealth(), lIllIIIIII[41])) {
                    int[] nArray = new int[lIllIIIIII[1]];
                    nArray[L.lIllIIIIII[0]] = lIllIIIIII[24];
                    if (L.lIIlIlIlIIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray6 = new int[lIllIIIIII[1]];
                        nArray6[L.lIllIIIIII[0]] = lIllIIIIII[24];
                        Inventory.getFirst((int[])nArray6).interact(lIlIllllll[lIllIIIIII[27]]);
                        Time.sleepTicks((int)lIllIIIIII[3]);
                        "".length();
                    }
                }
                if (L.lIIlIlIlIIlIl(Movement.getRunEnergy(), lIllIIIIII[42]) && L.lIIlIlIlIIIll(Movement.isRunEnabled() ? 1 : 0)) {
                    Movement.toggleRun();
                }
                if (L.lIIlIlIlIIIlI(Skills.getLevel((Skill)Skill.AGILITY), lIllIIIIII[2])) {
                    L.cP();
                }
                if ((!L.lIIlIlIlIIlll(e.j(lIllIIIIII[43]), lIllIIIIII[44]) || L.lIIlIlIlIIIlI(e.j(lIllIIIIII[45]), lIllIIIIII[19])) && L.lIIlIlIlIIlll(Skills.getLevel((Skill)Skill.AGILITY), lIllIIIIII[2]) && L.lIIlIlIlIIIlI(Skills.getLevel((Skill)Skill.AGILITY), lIllIIIIII[44])) {
                    L.cQ();
                }
                if (L.lIIlIlIlIIlll(e.j(lIllIIIIII[43]), lIllIIIIII[44]) && L.lIIlIlIlIIlll(e.j(lIllIIIIII[45]), lIllIIIIII[19])) {
                    if (L.lIIlIlIlIIlll(Skills.getLevel((Skill)Skill.AGILITY), lIllIIIIII[2]) && L.lIIlIlIlIIIlI(Skills.getLevel((Skill)Skill.AGILITY), lIllIIIIII[38])) {
                        L.cQ();
                    }
                    if (L.lIIlIlIlIIlll(Skills.getLevel((Skill)Skill.AGILITY), lIllIIIIII[38]) && L.lIIlIlIlIIIlI(Skills.getLevel((Skill)Skill.AGILITY), lIllIIIIII[44])) {
                        L.cR();
                    }
                }
                if (L.lIIlIlIlIIlll(Skills.getLevel((Skill)Skill.AGILITY), lIllIIIIII[44])) {
                    L.cS();
                }
            }
        }
    }

    private static boolean lIIlIlIlIIllI(int n2) {
        return n2 > 0;
    }

    @Override
    public int ad() {
        try {
            L.cO();
            "".length();
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (((0x83 ^ 0x9B) & ~(0x6D ^ 0x75)) != 0) {
            return (0x6F ^ 0x28) & ~(0x1D ^ 0x5A);
        }
        return lIllIIIIII[186];
    }

    private static boolean lIIlIlIlIIIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlIlIlIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    private static void cS() {
        void lllllllllllllllllllIIllIllIlIIII;
        void lllllllllllllllllllIIllIllIlIllI;
        void lllllllllllllllllllIIllIllIlIlll;
        void lllllllllllllllllllIIllIllIllIII;
        void lllllllllllllllllllIIllIllIllIIl;
        WorldArea worldArea = new WorldArea(lIllIIIIII[162], lIllIIIIII[163], lIllIIIIII[111], lIllIIIIII[111], lIllIIIIII[0]);
        WorldArea worldArea2 = new WorldArea(lIllIIIIII[162], lIllIIIIII[163], lIllIIIIII[111], lIllIIIIII[111], lIllIIIIII[1]);
        WorldArea worldArea3 = new WorldArea(lIllIIIIII[162], lIllIIIIII[163], lIllIIIIII[111], lIllIIIIII[111], lIllIIIIII[3]);
        WorldArea worldArea4 = new WorldArea(lIllIIIIII[162], lIllIIIIII[163], lIllIIIIII[111], lIllIIIIII[111], lIllIIIIII[10]);
        WorldArea worldArea5 = new WorldArea(lIllIIIIII[164], lIllIIIIII[133], lIllIIIIII[64], lIllIIIIII[12], lIllIIIIII[10]);
        WorldArea worldArea6 = new WorldArea(lIllIIIIII[165], lIllIIIIII[139], lIllIIIIII[39], lIllIIIIII[53], lIllIIIIII[3]);
        WorldArea worldArea7 = new WorldArea(lIllIIIIII[166], lIllIIIIII[134], lIllIIIIII[49], lIllIIIIII[27], lIllIIIIII[3]);
        WorldArea worldArea8 = new WorldArea(lIllIIIIII[167], lIllIIIIII[136], lIllIIIIII[70], lIllIIIIII[64], lIllIIIIII[10]);
        WorldArea worldArea9 = new WorldArea(lIllIIIIII[168], lIllIIIIII[169], lIllIIIIII[54], lIllIIIIII[63], lIllIIIIII[3]);
        WorldPoint worldPoint = new WorldPoint(lIllIIIIII[170], lIllIIIIII[171], lIllIIIIII[0]);
        if (L.lIIlIlIlIIIIl(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (L.lIIlIlIlIIIll(lllllllllllllllllllIIllIllIllIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && L.lIIlIlIlIIIll(lllllllllllllllllllIIllIllIllIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && L.lIIlIlIlIIIll(lllllllllllllllllllIIllIllIlIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && L.lIIlIlIlIIIll(lllllllllllllllllllIIllIllIlIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderShamans.c = lIlIllllll[lIllIIIIII[172]];
            Movement.walkTo((WorldPoint)lllllllllllllllllllIIllIllIlIIII);
            "".length();
            Time.sleepTicks((int)lIllIIIIII[1]);
            "".length();
        }
        if (L.lIIlIlIlIIIIl(lllllllllllllllllllIIllIllIllIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (L.lIIlIlIlIIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllllllllllllllIIllIllIlIIII), lIllIIIIII[21])) {
                AccBuilderShamans.c = lIlIllllll[lIllIIIIII[173]];
                Movement.walkTo((WorldPoint)lllllllllllllllllllIIllIllIlIIII);
                "".length();
                Time.sleepTicks((int)lIllIIIIII[1]);
                "".length();
            }
            if (L.lIIlIlIlIlIIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllllllllllllllIIllIllIlIIII), lIllIIIIII[21])) {
                AccBuilderShamans.c = lIlIllllll[lIllIIIIII[174]];
                int lllllllllllllllllllIIllIllIIllll = Skills.getExperience((Skill)Skill.AGILITY);
                String[] stringArray = new String[lIllIIIIII[1]];
                stringArray[L.lIllIIIIII[0]] = lIlIllllll[lIllIIIIII[175]];
                TileObjects.getNearest((String[])stringArray).interact(lIlIllllll[lIllIIIIII[36]]);
                Time.sleepTicks((int)e.c(lIllIIIIII[1], lIllIIIIII[3]));
                "".length();
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (L.lIIlIlIlIIlIl(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllllIIllIllIIllll)) {
                        bl = lIllIIIIII[1];
                        "".length();
                        if (-(9 + 142 - 73 + 65 ^ 36 + 24 - 4 + 83) >= 0) {
                            return (("  ".length() ^ (0x35 ^ 0x2F)) & (26 + 54 - 30 + 97 ^ 43 + 56 - 71 + 111 ^ -" ".length())) != 0;
                        }
                    } else {
                        bl = lIllIIIIII[0];
                    }
                    return bl;
                }, (int)lIllIIIIII[104]);
                "".length();
                Time.sleepTicks((int)lIllIIIIII[1]);
                "".length();
            }
        }
        String[] stringArray = new String[lIllIIIIII[1]];
        stringArray[L.lIllIIIIII[0]] = lIlIllllll[lIllIIIIII[176]];
        TileItem lllllllllllllllllllIIllIllIIllll = TileItems.getNearest((String[])stringArray);
        if (L.lIIlIlIlIIlII(lllllllllllllllllllIIllIllIIllll) && L.lIIlIlIlIIIIl(L.cT() ? 1 : 0)) {
            AccBuilderShamans.c = lIlIllllll[lIllIIIIII[177]];
            System.out.println(lIlIllllll[lIllIIIIII[178]]);
            lllllllllllllllllllIIllIllIIllll.interact(lIlIllllll[lIllIIIIII[179]]);
            Time.sleepTicks((int)lIllIIIIII[10]);
            "".length();
        }
        if (L.lIIlIlIlIIIll(L.cT() ? 1 : 0)) {
            void lllllllllllllllllllIIllIllIlIIIl;
            void lllllllllllllllllllIIllIllIlIIlI;
            void lllllllllllllllllllIIllIllIlIIll;
            void lllllllllllllllllllIIllIllIlIlII;
            int lllllllllllllllllllIIllIllIIllIl;
            TileObject lllllllllllllllllllIIllIllIIlllI;
            void lllllllllllllllllllIIllIllIlIlIl;
            if (L.lIIlIlIlIIIIl(lllllllllllllllllllIIllIllIlIlIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && L.lIIlIlIlIIlII(lllllllllllllllllllIIllIllIIlllI = TileObjects.getNearest(tileObject -> {
                int n2;
                if (L.lIIlIlIlIIIIl(tileObject.getName().contains(lIlIllllll[lIllIIIIII[218]]) ? 1 : 0) && L.lIIlIlIlIlIIl(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIllIIIIII[219], lIllIIIIII[220], lIllIIIIII[10])), lIllIIIIII[3])) {
                    n2 = lIllIIIIII[1];
                    "".length();
                    if (-" ".length() != -" ".length()) {
                        return ((120 + 72 - 113 + 65 ^ 71 + 167 - 110 + 69) & (2 ^ 0x4B ^ (0xA8 ^ 0xB4) ^ -" ".length())) != 0;
                    }
                } else {
                    n2 = lIllIIIIII[0];
                }
                return n2 != 0;
            }))) {
                lllllllllllllllllllIIllIllIIllIl = Skills.getExperience((Skill)Skill.AGILITY);
                AccBuilderShamans.c = lIlIllllll[lIllIIIIII[180]];
                lllllllllllllllllllIIllIllIIlllI.interact(lIlIllllll[lIllIIIIII[79]]);
                Time.sleepTicks((int)e.c(lIllIIIIII[1], lIllIIIIII[3]));
                "".length();
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (L.lIIlIlIlIIlIl(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllllIIllIllIIllIl)) {
                        bl = lIllIIIIII[1];
                        "".length();
                        if (-" ".length() >= (70 + 190 - 125 + 59 ^ 102 + 180 - 186 + 102)) {
                            return ((67 + 190 - 191 + 131 ^ 136 + 98 - 184 + 145) & (0x5C ^ 0x39 ^ (0xA5 ^ 0xC6) ^ -" ".length())) != 0;
                        }
                    } else {
                        bl = lIllIIIIII[0];
                    }
                    return bl;
                }, (int)lIllIIIIII[104]);
                "".length();
                Time.sleepTicks((int)lIllIIIIII[1]);
                "".length();
            }
            if (L.lIIlIlIlIIIIl(L.cT() ? 1 : 0)) {
                return;
            }
            if (L.lIIlIlIlIIIIl(lllllllllllllllllllIIllIllIlIlII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && L.lIIlIlIlIIlII(lllllllllllllllllllIIllIllIIlllI = TileObjects.getNearest(tileObject -> {
                int n2;
                if (L.lIIlIlIlIIIIl(tileObject.getName().contains(lIlIllllll[lIllIIIIII[216]]) ? 1 : 0) && L.lIIlIlIlIlIIl(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIllIIIIII[217], lIllIIIIII[128], lIllIIIIII[3])), lIllIIIIII[3])) {
                    n2 = lIllIIIIII[1];
                    "".length();
                    if (" ".length() > (0x79 ^ 0x7D)) {
                        return ((0x27 ^ 0x16) & ~(0xBF ^ 0x8E)) != 0;
                    }
                } else {
                    n2 = lIllIIIIII[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderShamans.c = lIlIllllll[lIllIIIIII[181]];
                lllllllllllllllllllIIllIllIIllIl = Skills.getExperience((Skill)Skill.AGILITY);
                lllllllllllllllllllIIllIllIIlllI.interact(lIlIllllll[lIllIIIIII[182]]);
                Time.sleepTicks((int)e.c(lIllIIIIII[1], lIllIIIIII[3]));
                "".length();
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (L.lIIlIlIlIIlIl(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllllIIllIllIIllIl)) {
                        bl = lIllIIIIII[1];
                        "".length();
                        if ("  ".length() == 0) {
                            return ((0xD ^ 0x16) & ~(0x4D ^ 0x56)) != 0;
                        }
                    } else {
                        bl = lIllIIIIII[0];
                    }
                    return bl;
                }, (int)lIllIIIIII[104]);
                "".length();
                Time.sleepTicks((int)lIllIIIIII[1]);
                "".length();
            }
            if (L.lIIlIlIlIIIIl(L.cT() ? 1 : 0)) {
                return;
            }
            if (L.lIIlIlIlIIIIl(lllllllllllllllllllIIllIllIlIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && L.lIIlIlIlIIlII(lllllllllllllllllllIIllIllIIlllI = TileObjects.getNearest(tileObject -> {
                int n2;
                if (L.lIIlIlIlIIIIl(tileObject.getName().contains(lIlIllllll[lIllIIIIII[213]]) ? 1 : 0) && L.lIIlIlIlIlIIl(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIllIIIIII[214], lIllIIIIII[215], lIllIIIIII[3])), lIllIIIIII[3])) {
                    n2 = lIllIIIIII[1];
                    "".length();
                    if (null != null) {
                        return ((0x16 ^ 0xD ^ (0x75 ^ 0x4F)) & (110 + 118 - 189 + 185 ^ 68 + 62 - -24 + 39 ^ -" ".length())) != 0;
                    }
                } else {
                    n2 = lIllIIIIII[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderShamans.c = lIlIllllll[lIllIIIIII[183]];
                lllllllllllllllllllIIllIllIIllIl = Skills.getExperience((Skill)Skill.AGILITY);
                lllllllllllllllllllIIllIllIIlllI.interact(lIlIllllll[lIllIIIIII[184]]);
                Time.sleepTicks((int)e.c(lIllIIIIII[1], lIllIIIIII[3]));
                "".length();
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (L.lIIlIlIlIIlIl(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllllIIllIllIIllIl)) {
                        bl = lIllIIIIII[1];
                        "".length();
                        if ((0x72 ^ 0x61 ^ (2 ^ 0x15)) <= 0) {
                            return ((0x71 ^ 0x75 ^ (0x54 ^ 0x6C)) & (0x61 ^ 0x50 ^ (0xAF ^ 0xA2) ^ -" ".length())) != 0;
                        }
                    } else {
                        bl = lIllIIIIII[0];
                    }
                    return bl;
                }, (int)lIllIIIIII[104]);
                "".length();
                Time.sleepTicks((int)lIllIIIIII[1]);
                "".length();
            }
            if (L.lIIlIlIlIIIIl(L.cT() ? 1 : 0)) {
                return;
            }
            if (L.lIIlIlIlIIIIl(lllllllllllllllllllIIllIllIlIIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && L.lIIlIlIlIIlII(lllllllllllllllllllIIllIllIIlllI = TileObjects.getNearest(tileObject -> {
                int n2;
                if (L.lIIlIlIlIIIIl(tileObject.getName().contains(lIlIllllll[lIllIIIIII[211]]) ? 1 : 0) && L.lIIlIlIlIlIIl(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIllIIIIII[209], lIllIIIIII[212], lIllIIIIII[10])), lIllIIIIII[3])) {
                    n2 = lIllIIIIII[1];
                    "".length();
                    if ("   ".length() == 0) {
                        return ((147 + 182 - 192 + 51 ^ 24 + 47 - -90 + 9) & (0xFB ^ 0x9D ^ (0xCC ^ 0xBC) ^ -" ".length())) != 0;
                    }
                } else {
                    n2 = lIllIIIIII[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderShamans.c = lIlIllllll[lIllIIIIII[185]];
                lllllllllllllllllllIIllIllIIllIl = Skills.getExperience((Skill)Skill.AGILITY);
                lllllllllllllllllllIIllIllIIlllI.interact(lIlIllllll[lIllIIIIII[186]]);
                Time.sleepTicks((int)e.c(lIllIIIIII[1], lIllIIIIII[3]));
                "".length();
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (L.lIIlIlIlIIlIl(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllllIIllIllIIllIl)) {
                        bl = lIllIIIIII[1];
                        "".length();
                        if (((0x5C ^ 0x65) & ~(0x32 ^ 0xB)) != 0) {
                            return ((0xB1 ^ 0x8D) & ~(0x4C ^ 0x70)) != 0;
                        }
                    } else {
                        bl = lIllIIIIII[0];
                    }
                    return bl;
                }, (int)lIllIIIIII[104]);
                "".length();
                Time.sleepTicks((int)lIllIIIIII[1]);
                "".length();
            }
            if (L.lIIlIlIlIIIIl(L.cT() ? 1 : 0)) {
                return;
            }
            if (L.lIIlIlIlIIIIl(lllllllllllllllllllIIllIllIlIIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && L.lIIlIlIlIIlII(lllllllllllllllllllIIllIllIIlllI = TileObjects.getNearest(tileObject -> {
                int n2;
                if (L.lIIlIlIlIIIIl(tileObject.getName().contains(lIlIllllll[lIllIIIIII[208]]) ? 1 : 0) && L.lIIlIlIlIlIIl(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIllIIIIII[209], lIllIIIIII[210], lIllIIIIII[3])), lIllIIIIII[3])) {
                    n2 = lIllIIIIII[1];
                    "".length();
                    if ("   ".length() == -" ".length()) {
                        return ((0x39 ^ 0xB) & ~(0x1D ^ 0x2F)) != 0;
                    }
                } else {
                    n2 = lIllIIIIII[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderShamans.c = lIlIllllll[lIllIIIIII[187]];
                lllllllllllllllllllIIllIllIIllIl = Skills.getExperience((Skill)Skill.AGILITY);
                lllllllllllllllllllIIllIllIIlllI.interact(lIlIllllll[lIllIIIIII[188]]);
                Time.sleepTicks((int)e.c(lIllIIIIII[1], lIllIIIIII[3]));
                "".length();
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (L.lIIlIlIlIIlIl(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllllIIllIllIIllIl)) {
                        bl = lIllIIIIII[1];
                        "".length();
                        if ((0xDB ^ 0x8A ^ (0xD2 ^ 0x87)) == 0) {
                            return ((7 ^ 0xF ^ (0x8B ^ 0x86)) & (0x46 ^ 0x64 ^ (0x48 ^ 0x6F) ^ -" ".length())) != 0;
                        }
                    } else {
                        bl = lIllIIIIII[0];
                    }
                    return bl;
                }, (int)lIllIIIIII[104]);
                "".length();
                Time.sleepTicks((int)lIllIIIIII[1]);
                "".length();
            }
        }
    }

    private static boolean lIIlIlIlIIlll(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    private static void cQ() {
        WorldArea worldArea = new WorldArea(lIllIIIIII[76], lIllIIIIII[77], lIllIIIIII[78], lIllIIIIII[79], lIllIIIIII[1]);
        WorldArea worldArea2 = new WorldArea(lIllIIIIII[76], lIllIIIIII[77], lIllIIIIII[78], lIllIIIIII[79], lIllIIIIII[3]);
        WorldArea worldArea3 = new WorldArea(lIllIIIIII[76], lIllIIIIII[77], lIllIIIIII[78], lIllIIIIII[79], lIllIIIIII[10]);
        WorldArea worldArea4 = new WorldArea(lIllIIIIII[80], lIllIIIIII[81], lIllIIIIII[69], lIllIIIIII[64], lIllIIIIII[0]);
        WorldArea worldArea5 = new WorldArea(lIllIIIIII[82], lIllIIIIII[81], lIllIIIIII[12], lIllIIIIII[64], lIllIIIIII[10]);
        WorldArea worldArea6 = new WorldArea(lIllIIIIII[83], lIllIIIIII[84], lIllIIIIII[63], lIllIIIIII[49], lIllIIIIII[10]);
        WorldArea worldArea7 = new WorldArea(lIllIIIIII[85], lIllIIIIII[86], lIllIIIIII[27], lIllIIIIII[23], lIllIIIIII[1]);
        WorldArea worldArea8 = new WorldArea(lIllIIIIII[85], lIllIIIIII[87], lIllIIIIII[12], lIllIIIIII[25], lIllIIIIII[10]);
        WorldArea worldArea9 = new WorldArea(lIllIIIIII[88], lIllIIIIII[89], lIllIIIIII[75], lIllIIIIII[41], lIllIIIIII[10]);
        WorldArea worldArea10 = new WorldArea(lIllIIIIII[90], lIllIIIIII[91], lIllIIIIII[66], lIllIIIIII[64], lIllIIIIII[10]);
        WorldArea worldArea11 = new WorldArea(lIllIIIIII[92], lIllIIIIII[93], lIllIIIIII[23], lIllIIIIII[27], lIllIIIIII[10]);
        WorldArea worldArea12 = new WorldArea(lIllIIIIII[92], lIllIIIIII[94], lIllIIIIII[12], lIllIIIIII[23], lIllIIIIII[10]);
        if (L.lIIlIlIlIIIll(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && L.lIIlIlIlIIIll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && L.lIIlIlIlIIIll(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && L.lIIlIlIlIIIll(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderShamans.c = lIlIllllll[lIllIIIIII[95]];
            if (L.lIIlIlIlIIIIl(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
            }
            if (L.lIIlIlIlIIIIl(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo((WorldPoint)new WorldPoint(lIllIIIIII[96], lIllIIIIII[52], lIllIIIIII[0]));
            "".length();
            Time.sleepTicks((int)lIllIIIIII[1]);
            "".length();
        }
        if (L.lIIlIlIlIlIII(Players.getLocal().getAnimation(), lIllIIIIII[62]) && L.lIIlIlIlIIIll(Players.getLocal().isMoving() ? 1 : 0)) {
            String[] stringArray = new String[lIllIIIIII[1]];
            stringArray[L.lIllIIIIII[0]] = lIlIllllll[lIllIIIIII[97]];
            TileItem lllllllllllllllllllIIlllIIIIIllI = TileItems.getNearest((String[])stringArray);
            if (L.lIIlIlIlIIlII(lllllllllllllllllllIIlllIIIIIllI) && L.lIIlIlIlIIIIl(L.cT() ? 1 : 0)) {
                AccBuilderShamans.c = lIlIllllll[lIllIIIIII[98]];
                System.out.println(lIlIllllll[lIllIIIIII[99]]);
                lllllllllllllllllllIIlllIIIIIllI.interact(lIlIllllll[lIllIIIIII[100]]);
                Time.sleepTicks((int)lIllIIIIII[10]);
                "".length();
            }
            if (L.lIIlIlIlIIIll(L.cT() ? 1 : 0)) {
                void lllllllllllllllllllIIlllIIIIIlll;
                void lllllllllllllllllllIIlllIIIIlIII;
                void lllllllllllllllllllIIlllIIIIlIIl;
                void lllllllllllllllllllIIlllIIIIlIlI;
                void lllllllllllllllllllIIlllIIIIlIll;
                void lllllllllllllllllllIIlllIIIIllII;
                void lllllllllllllllllllIIlllIIIIllIl;
                void lllllllllllllllllllIIlllIIIIlllI;
                int lllllllllllllllllllIIlllIIIIIlIl;
                void lllllllllllllllllllIIlllIIIIllll;
                if (L.lIIlIlIlIIIIl(lllllllllllllllllllIIlllIIIIllll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && L.lIIlIlIlIIIll(L.cT() ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIllllll[lIllIIIIII[101]];
                    lllllllllllllllllllIIlllIIIIIlIl = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray2 = new String[lIllIIIIII[1]];
                    stringArray2[L.lIllIIIIII[0]] = lIlIllllll[lIllIIIIII[102]];
                    TileObjects.getNearest((String[])stringArray2).interact(lIlIllllll[lIllIIIIII[103]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (L.lIIlIlIlIIlIl(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllllIIlllIIIIIlIl)) {
                            bl = lIllIIIIII[1];
                            "".length();
                            if (null != null) {
                                return ((0x36 ^ 0x33) & ~(0x2B ^ 0x2E)) != 0;
                            }
                        } else {
                            bl = lIllIIIIII[0];
                        }
                        return bl;
                    }, (int)lIllIIIIII[104]);
                    "".length();
                    Time.sleepTicks((int)lIllIIIIII[1]);
                    "".length();
                }
                if (L.lIIlIlIlIIIIl(lllllllllllllllllllIIlllIIIIlllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && L.lIIlIlIlIIIll(L.cT() ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIllllll[lIllIIIIII[38]];
                    lllllllllllllllllllIIlllIIIIIlIl = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray3 = new String[lIllIIIIII[1]];
                    stringArray3[L.lIllIIIIII[0]] = lIlIllllll[lIllIIIIII[105]];
                    TileObjects.getNearest((String[])stringArray3).interact(lIlIllllll[lIllIIIIII[106]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (L.lIIlIlIlIIlIl(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllllIIlllIIIIIlIl)) {
                            bl = lIllIIIIII[1];
                            "".length();
                            if (-"   ".length() >= 0) {
                                return ((0xEE ^ 0x81 ^ (0x99 ^ 0xC5)) & (0xE ^ 0x33 ^ (0xCA ^ 0xC4) ^ -" ".length())) != 0;
                            }
                        } else {
                            bl = lIllIIIIII[0];
                        }
                        return bl;
                    }, (int)lIllIIIIII[104]);
                    "".length();
                    Time.sleepTicks((int)lIllIIIIII[1]);
                    "".length();
                }
                if (L.lIIlIlIlIIIIl(lllllllllllllllllllIIlllIIIIllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && L.lIIlIlIlIIIll(L.cT() ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIllllll[lIllIIIIII[107]];
                    lllllllllllllllllllIIlllIIIIIlIl = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray4 = new String[lIllIIIIII[1]];
                    stringArray4[L.lIllIIIIII[0]] = lIlIllllll[lIllIIIIII[108]];
                    TileObjects.getNearest((String[])stringArray4).interact(lIlIllllll[lIllIIIIII[109]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (L.lIIlIlIlIIlIl(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllllIIlllIIIIIlIl)) {
                            bl = lIllIIIIII[1];
                            "".length();
                            if (((0x94 ^ 0xC0 ^ (0x29 ^ 0x33)) & (0x4E ^ 0x50 ^ (0xD8 ^ 0x88) ^ -" ".length())) == "  ".length()) {
                                return ((0xBF ^ 0xC1 ^ (0x8B ^ 0xAD)) & (55 + 89 - 56 + 113 ^ 56 + 134 - 133 + 88 ^ -" ".length())) != 0;
                            }
                        } else {
                            bl = lIllIIIIII[0];
                        }
                        return bl;
                    }, (int)lIllIIIIII[104]);
                    "".length();
                    Time.sleepTicks((int)lIllIIIIII[1]);
                    "".length();
                }
                if (L.lIIlIlIlIIIIl(lllllllllllllllllllIIlllIIIIllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && L.lIIlIlIlIIIll(L.cT() ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIllllll[lIllIIIIII[110]];
                    lllllllllllllllllllIIlllIIIIIlIl = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray5 = new String[lIllIIIIII[1]];
                    stringArray5[L.lIllIIIIII[0]] = lIlIllllll[lIllIIIIII[111]];
                    TileObjects.getNearest((String[])stringArray5).interact(lIlIllllll[lIllIIIIII[112]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (L.lIIlIlIlIIlIl(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllllIIlllIIIIIlIl)) {
                            bl = lIllIIIIII[1];
                            "".length();
                            if (null != null) {
                                return ((0x6B ^ 0x79) & ~(0x9E ^ 0x8C)) != 0;
                            }
                        } else {
                            bl = lIllIIIIII[0];
                        }
                        return bl;
                    }, (int)lIllIIIIII[104]);
                    "".length();
                    Time.sleepTicks((int)lIllIIIIII[1]);
                    "".length();
                }
                if (L.lIIlIlIlIIIIl(lllllllllllllllllllIIlllIIIIlIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && L.lIIlIlIlIIIll(L.cT() ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIllllll[lIllIIIIII[113]];
                    lllllllllllllllllllIIlllIIIIIlIl = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray6 = new String[lIllIIIIII[1]];
                    stringArray6[L.lIllIIIIII[0]] = lIlIllllll[lIllIIIIII[40]];
                    TileObjects.getNearest((String[])stringArray6).interact(lIlIllllll[lIllIIIIII[7]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (L.lIIlIlIlIIlIl(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllllIIlllIIIIIlIl)) {
                            bl = lIllIIIIII[1];
                            "".length();
                            if (" ".length() != " ".length()) {
                                return ((0x5B ^ 0x51) & ~(0x27 ^ 0x2D)) != 0;
                            }
                        } else {
                            bl = lIllIIIIII[0];
                        }
                        return bl;
                    }, (int)lIllIIIIII[104]);
                    "".length();
                    Time.sleepTicks((int)lIllIIIIII[1]);
                    "".length();
                }
                if (L.lIIlIlIlIIIIl(lllllllllllllllllllIIlllIIIIlIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && L.lIIlIlIlIIIll(L.cT() ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIllllll[lIllIIIIII[114]];
                    lllllllllllllllllllIIlllIIIIIlIl = Skills.getExperience((Skill)Skill.AGILITY);
                    int[] nArray = new int[lIllIIIIII[1]];
                    nArray[L.lIllIIIIII[0]] = lIllIIIIII[115];
                    TileObjects.getNearest((int[])nArray).interact(lIlIllllll[lIllIIIIII[116]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (L.lIIlIlIlIIlIl(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllllIIlllIIIIIlIl)) {
                            bl = lIllIIIIII[1];
                            "".length();
                            if ("  ".length() <= -" ".length()) {
                                return ((29 + 162 - 30 + 17 ^ 39 + 51 - 59 + 111) & ("   ".length() ^ (0x69 ^ 0x56) ^ -" ".length())) != 0;
                            }
                        } else {
                            bl = lIllIIIIII[0];
                        }
                        return bl;
                    }, (int)lIllIIIIII[104]);
                    "".length();
                    Time.sleepTicks((int)lIllIIIIII[1]);
                    "".length();
                }
                if (L.lIIlIlIlIIIIl(lllllllllllllllllllIIlllIIIIlIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && L.lIIlIlIlIIIll(L.cT() ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIllllll[lIllIIIIII[117]];
                    lllllllllllllllllllIIlllIIIIIlIl = Skills.getExperience((Skill)Skill.AGILITY);
                    int[] nArray = new int[lIllIIIIII[1]];
                    nArray[L.lIllIIIIII[0]] = lIllIIIIII[118];
                    TileObjects.getNearest((int[])nArray).interact(lIlIllllll[lIllIIIIII[119]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (L.lIIlIlIlIIlIl(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllllIIlllIIIIIlIl)) {
                            bl = lIllIIIIII[1];
                            "".length();
                            if (-" ".length() > -" ".length()) {
                                return ((0xF9 ^ 0xC2 ^ (0x23 ^ 0x57)) & (113 + 164 - 198 + 124 ^ 50 + 35 - 67 + 114 ^ -" ".length())) != 0;
                            }
                        } else {
                            bl = lIllIIIIII[0];
                        }
                        return bl;
                    }, (int)lIllIIIIII[104]);
                    "".length();
                    Time.sleepTicks((int)lIllIIIIII[1]);
                    "".length();
                }
                if (L.lIIlIlIlIIIIl(lllllllllllllllllllIIlllIIIIlIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && L.lIIlIlIlIIIll(L.cT() ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIllllll[lIllIIIIII[120]];
                    lllllllllllllllllllIIlllIIIIIlIl = Skills.getExperience((Skill)Skill.AGILITY);
                    int[] nArray = new int[lIllIIIIII[1]];
                    nArray[L.lIllIIIIII[0]] = lIllIIIIII[121];
                    TileObjects.getNearest((int[])nArray).interact(lIlIllllll[lIllIIIIII[122]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (L.lIIlIlIlIIlIl(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllllIIlllIIIIIlIl)) {
                            bl = lIllIIIIII[1];
                            "".length();
                            if (((0xE3 ^ 0xBA ^ (0xD6 ^ 0x85)) & (0x31 ^ 0x53 ^ (0x43 ^ 0x2B) ^ -" ".length())) >= (0x84 ^ 0xB5 ^ (0x89 ^ 0xBC))) {
                                return ((0x65 ^ 0x17 ^ (3 ^ 0x75)) & (0x61 ^ 6 ^ (0xA1 ^ 0xC2) ^ -" ".length())) != 0;
                            }
                        } else {
                            bl = lIllIIIIII[0];
                        }
                        return bl;
                    }, (int)lIllIIIIII[104]);
                    "".length();
                    Time.sleepTicks((int)lIllIIIIII[1]);
                    "".length();
                }
                if (L.lIIlIlIlIIIIl(lllllllllllllllllllIIlllIIIIIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && L.lIIlIlIlIIIll(L.cT() ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIllllll[lIllIIIIII[123]];
                    lllllllllllllllllllIIlllIIIIIlIl = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray7 = new String[lIllIIIIII[1]];
                    stringArray7[L.lIllIIIIII[0]] = lIlIllllll[lIllIIIIII[124]];
                    TileObjects.getNearest((String[])stringArray7).interact(lIlIllllll[lIllIIIIII[44]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (L.lIIlIlIlIIlIl(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllllIIlllIIIIIlIl)) {
                            bl = lIllIIIIII[1];
                            "".length();
                            if (" ".length() >= (71 + 149 - 148 + 81 ^ 14 + 77 - -22 + 44)) {
                                return ((18 + 91 - 87 + 182 ^ 8 + 6 - -90 + 68) & (0xFD ^ 0xB8 ^ (0xE2 ^ 0xC7) ^ -" ".length())) != 0;
                            }
                        } else {
                            bl = lIllIIIIII[0];
                        }
                        return bl;
                    }, (int)lIllIIIIII[104]);
                    "".length();
                    Time.sleepTicks((int)lIllIIIIII[1]);
                    "".length();
                }
            }
        }
    }

    @Override
    public String ae() {
        return lIlIllllll[lIllIIIIII[203]];
    }

    private static boolean lIIlIlIlIlIII(int n2, int n3) {
        return n2 == n3;
    }

    private static String lIIlIlIIlllII(String lllllllllllllllllllIIllIIIllIlIl, String lllllllllllllllllllIIllIIIllIlII) {
        try {
            SecretKeySpec lllllllllllllllllllIIllIIIlllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIIllIIIllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllllIIllIIIllIlll = Cipher.getInstance("Blowfish");
            lllllllllllllllllllIIllIIIllIlll.init(lIllIIIIII[3], lllllllllllllllllllIIllIIIlllIII);
            return new String(lllllllllllllllllllIIllIIIllIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIIllIIIllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllllIIllIIIllIllI) {
            lllllllllllllllllllIIllIIIllIllI.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    private static boolean cT() {
        WorldArea worldArea = new WorldArea(lIllIIIIII[80], lIllIIIIII[81], lIllIIIIII[69], lIllIIIIII[64], lIllIIIIII[0]);
        WorldArea worldArea2 = new WorldArea(lIllIIIIII[82], lIllIIIIII[81], lIllIIIIII[12], lIllIIIIII[64], lIllIIIIII[10]);
        WorldArea worldArea3 = new WorldArea(lIllIIIIII[83], lIllIIIIII[84], lIllIIIIII[63], lIllIIIIII[49], lIllIIIIII[10]);
        WorldArea worldArea4 = new WorldArea(lIllIIIIII[189], lIllIIIIII[190], lIllIIIIII[25], lIllIIIIII[19], lIllIIIIII[1]);
        WorldArea worldArea5 = new WorldArea(lIllIIIIII[85], lIllIIIIII[87], lIllIIIIII[12], lIllIIIIII[25], lIllIIIIII[10]);
        WorldArea worldArea6 = new WorldArea(lIllIIIIII[191], lIllIIIIII[192], lIllIIIIII[73], lIllIIIIII[39], lIllIIIIII[10]);
        WorldArea worldArea7 = new WorldArea(lIllIIIIII[90], lIllIIIIII[91], lIllIIIIII[66], lIllIIIIII[64], lIllIIIIII[10]);
        WorldArea worldArea8 = new WorldArea(lIllIIIIII[92], lIllIIIIII[93], lIllIIIIII[23], lIllIIIIII[27], lIllIIIIII[10]);
        WorldArea worldArea9 = new WorldArea(lIllIIIIII[92], lIllIIIIII[94], lIllIIIIII[12], lIllIIIIII[23], lIllIIIIII[10]);
        WorldArea worldArea10 = new WorldArea(lIllIIIIII[127], lIllIIIIII[128], lIllIIIIII[49], lIllIIIIII[12], lIllIIIIII[3]);
        WorldArea worldArea11 = new WorldArea(lIllIIIIII[129], lIllIIIIII[127], lIllIIIIII[49], lIllIIIIII[25], lIllIIIIII[3]);
        WorldArea worldArea12 = new WorldArea(lIllIIIIII[130], lIllIIIIII[131], lIllIIIIII[63], lIllIIIIII[49], lIllIIIIII[3]);
        WorldArea worldArea13 = new WorldArea(lIllIIIIII[132], lIllIIIIII[133], lIllIIIIII[12], lIllIIIIII[64], lIllIIIIII[10]);
        WorldArea worldArea14 = new WorldArea(lIllIIIIII[134], lIllIIIIII[9], lIllIIIIII[49], lIllIIIIII[27], lIllIIIIII[3]);
        WorldArea worldArea15 = new WorldArea(lIllIIIIII[135], lIllIIIIII[136], lIllIIIIII[68], lIllIIIIII[53], lIllIIIIII[10]);
        WorldArea worldArea16 = new WorldArea(lIllIIIIII[137], lIllIIIIII[138], lIllIIIIII[63], lIllIIIIII[64], lIllIIIIII[3]);
        WorldArea worldArea17 = new WorldArea(lIllIIIIII[164], lIllIIIIII[133], lIllIIIIII[64], lIllIIIIII[12], lIllIIIIII[10]);
        WorldArea worldArea18 = new WorldArea(lIllIIIIII[165], lIllIIIIII[139], lIllIIIIII[39], lIllIIIIII[53], lIllIIIIII[3]);
        WorldArea worldArea19 = new WorldArea(lIllIIIIII[166], lIllIIIIII[134], lIllIIIIII[49], lIllIIIIII[27], lIllIIIIII[3]);
        WorldArea worldArea20 = new WorldArea(lIllIIIIII[167], lIllIIIIII[136], lIllIIIIII[70], lIllIIIIII[64], lIllIIIIII[10]);
        WorldArea worldArea21 = new WorldArea(lIllIIIIII[168], lIllIIIIII[169], lIllIIIIII[54], lIllIIIIII[63], lIllIIIIII[3]);
        WorldArea[] worldAreaArray = new WorldArea[lIllIIIIII[68]];
        worldAreaArray[L.lIllIIIIII[0]] = worldArea;
        worldAreaArray[L.lIllIIIIII[1]] = worldArea2;
        worldAreaArray[L.lIllIIIIII[3]] = worldArea3;
        worldAreaArray[L.lIllIIIIII[10]] = worldArea4;
        worldAreaArray[L.lIllIIIIII[17]] = worldArea5;
        worldAreaArray[L.lIllIIIIII[19]] = worldArea6;
        worldAreaArray[L.lIllIIIIII[21]] = worldArea7;
        worldAreaArray[L.lIllIIIIII[23]] = worldArea8;
        worldAreaArray[L.lIllIIIIII[25]] = worldArea9;
        worldAreaArray[L.lIllIIIIII[27]] = worldArea10;
        worldAreaArray[L.lIllIIIIII[12]] = worldArea11;
        worldAreaArray[L.lIllIIIIII[49]] = worldArea12;
        worldAreaArray[L.lIllIIIIII[63]] = worldArea13;
        worldAreaArray[L.lIllIIIIII[64]] = worldArea14;
        worldAreaArray[L.lIllIIIIII[53]] = worldArea15;
        worldAreaArray[L.lIllIIIIII[39]] = worldArea16;
        worldAreaArray[L.lIllIIIIII[65]] = worldArea17;
        worldAreaArray[L.lIllIIIIII[66]] = worldArea18;
        worldAreaArray[L.lIllIIIIII[54]] = worldArea19;
        worldAreaArray[L.lIllIIIIII[67]] = worldArea20;
        worldAreaArray[L.lIllIIIIII[41]] = worldArea21;
        WorldArea[] worldAreaArray2 = worldAreaArray;
        int[] nArray = new int[lIllIIIIII[1]];
        nArray[L.lIllIIIIII[0]] = lIllIIIIII[193];
        if (L.lIIlIlIlIIlII(TileItems.getNearest((int[])nArray))) {
            void lllllllllllllllllllIIllIlIlIIIII;
            System.out.println(lIlIllllll[lIllIIIIII[194]]);
            int lllllllllllllllllllIIllIlIIlllll = lIllIIIIII[0];
            while (L.lIIlIlIlIIIlI(lllllllllllllllllllIIllIlIIlllll, ((void)lllllllllllllllllllIIllIlIlIIIII).length)) {
                int[] nArray2 = new int[lIllIIIIII[1]];
                nArray2[L.lIllIIIIII[0]] = lIllIIIIII[193];
                if (L.lIIlIlIlIIIIl(lllllllllllllllllllIIllIlIlIIIII[lllllllllllllllllllIIllIlIIlllll].contains(TileItems.getNearest((int[])nArray2).getWorldLocation()) ? 1 : 0) && L.lIIlIlIlIIIIl(lllllllllllllllllllIIllIlIlIIIII[lllllllllllllllllllIIllIlIIlllll].contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    return lIllIIIIII[1];
                }
                ++lllllllllllllllllllIIllIlIIlllll;
                "".length();
                if ((0xF7 ^ 0xB7 ^ (0xEF ^ 0xAA)) > 0) continue;
                return ((0x7F ^ 0x1C ^ (0x3F ^ 6)) & (32 + 84 - 61 + 183 ^ 120 + 101 - 210 + 169 ^ -" ".length())) != 0;
            }
        }
        return lIllIIIIII[0];
    }

    @Override
    public boolean ac() {
        return lIllIIIIII[0];
    }

    static {
        L.lIIlIlIlIIIII();
        L.lIIlIlIIlllll();
        bp = new ArrayList<d>();
        jr = lIllIIIIII[28];
        js = lIllIIIIII[24];
        ju = new WorldArea(lIllIIIIII[235], lIllIIIIII[52], lIllIIIIII[69], lIllIIIIII[72], lIllIIIIII[0]);
        jv = new WorldArea(lIllIIIIII[235], lIllIIIIII[52], lIllIIIIII[69], lIllIIIIII[72], lIllIIIIII[1]);
        jw = new WorldArea(lIllIIIIII[235], lIllIIIIII[52], lIllIIIIII[69], lIllIIIIII[72], lIllIIIIII[3]);
        jx = new WorldPoint(lIllIIIIII[236], lIllIIIIII[237], lIllIIIIII[0]);
    }

    private static void lIIlIlIIlllll() {
        lIlIllllll = new String[lIllIIIIII[238]];
        L.lIlIllllll[L.lIllIIIIII[0]] = L.lIIlIlIIlllII("//5eBF7lhjAY82gpWIT15w==", "ZZTLn");
        L.lIlIllllll[L.lIllIIIIII[1]] = L.lIIlIlIIlllIl("FDADLBw6PAllDScgBCsIcjAZIAIhdU02GDstDi0GPD5NJw4xMk0xAHI4CiwDOy0U", "RYmEo");
        L.lIlIllllll[L.lIllIIIIII[3]] = L.lIIlIlIIlllIl("FwI6LR84FyUqH3kXI2QaOA0n", "YcLDx");
        L.lIlIllllll[L.lIllIIIIII[10]] = L.lIIlIlIIllllI("YkCFT6NH05qYdzdKHPPdAbvqdIPn6E8A", "RlEPR");
        L.lIlIllllll[L.lIllIIIIII[17]] = L.lIIlIlIIllllI("79vQpFAoMJgkeOd72cZ4z2fsdEUY2zUAQ3UKoBJe8R79riFXEtXwHy4boOmKdEHGG3iO7tc25JQ=", "FmNMo");
        L.lIlIllllll[L.lIllIIIIII[19]] = L.lIIlIlIIlllII("nmctKpTWK2M=", "GSNEM");
        L.lIlIllllll[L.lIllIIIIII[21]] = L.lIIlIlIIlllIl("BBAMJQ==", "RymIu");
        L.lIlIllllll[L.lIllIIIIII[23]] = L.lIIlIlIIllllI("/S0pHgR3p0Y=", "AYzoj");
        L.lIlIllllll[L.lIllIIIIII[25]] = L.lIIlIlIIlllII("yH5gtLLYBTc=", "gFnmz");
        L.lIlIllllll[L.lIllIIIIII[27]] = L.lIIlIlIIlllIl("PSkQ", "xHdlW");
        L.lIlIllllll[L.lIllIIIIII[12]] = L.lIIlIlIIllllI("/W9J4kmiZoLplDBBhsqlVAEFKtmqhUNr", "bvaCR");
        L.lIlIllllll[L.lIllIIIIII[49]] = L.lIIlIlIIlllII("5rGJ/Ub3yy5DW+Kpp8qxtg==", "eMJXd");
        L.lIlIllllll[L.lIllIIIIII[63]] = L.lIIlIlIIlllIl("Nj8zYxQbPDUtFR8=", "zPTCv");
        L.lIlIllllll[L.lIllIIIIII[64]] = L.lIIlIlIIllllI("qY9H0O6/NBBMLknYF0pewA==", "Rwnxa");
        L.lIlIllllll[L.lIllIIIIII[53]] = L.lIIlIlIIlllIl("ICEoFzEKIyZaPQY5", "cMAzS");
        L.lIlIllllll[L.lIllIIIIII[39]] = L.lIIlIlIIlllII("jPK6KL2CcFnov0xPSspzlQ==", "evfxO");
        L.lIlIllllll[L.lIllIIIIII[65]] = L.lIIlIlIIlllIl("NBggIAVaGz8oFQ==", "wtIMg");
        L.lIlIllllll[L.lIllIIIIII[66]] = L.lIIlIlIIllllI("jqYcsKzDa/Baey/hDHcARg==", "yCPua");
        L.lIlIllllll[L.lIllIIIIII[54]] = L.lIIlIlIIllllI("HebwLxTwXaUGMKOdT2O79g==", "SXHnn");
        L.lIlIllllll[L.lIllIIIIII[67]] = L.lIIlIlIIlllIl("FCkMLyY=", "WEeBD");
        L.lIlIllllll[L.lIllIIIIII[41]] = L.lIIlIlIIllllI("t8VRBqmgssOU8zc9x0yqxQ==", "mPjNC");
        L.lIlIllllll[L.lIllIIIIII[68]] = L.lIIlIlIIlllIl("BCYqADolLigGdDQoNgQ=", "FGFaT");
        L.lIlIllllll[L.lIllIIIIII[61]] = L.lIIlIlIIlllII("ZePWkvVUljI=", "ssEhb");
        L.lIlIllllll[L.lIllIIIIII[69]] = L.lIIlIlIIlllIl("Bg0QGQYsDx5UACoWFw==", "Eaytd");
        L.lIlIllllll[L.lIllIIIIII[70]] = L.lIIlIlIIllllI("rSIpvkkp+sRTzD9WmErWxA==", "QSHcV");
        L.lIlIllllll[L.lIllIIIIII[42]] = L.lIIlIlIIlllIl("AhUoCTpsHS4TNg==", "AyAdX");
        L.lIlIllllll[L.lIllIIIIII[71]] = L.lIIlIlIIllllI("kSgKSVSg/+wEkJwBf+3EVg==", "Cpkna");
        L.lIlIllllll[L.lIllIIIIII[72]] = L.lIIlIlIIlllII("PlqMz4r3GE3i5vviqmPMOQ==", "yBLCj");
        L.lIlIllllll[L.lIllIIIIII[73]] = L.lIIlIlIIlllIl("FRgOCiZ7GxECNg==", "VtggD");
        L.lIlIllllll[L.lIllIIIIII[74]] = L.lIIlIlIIllllI("ooOh+lCsIQCU7mWyd1tJJA==", "PyRGZ");
        L.lIlIllllll[L.lIllIIIIII[2]] = L.lIIlIlIIlllIl("FQ8DIRs5ARV1CjMdFQ==", "ZmpUz");
        L.lIlIllllll[L.lIllIIIIII[75]] = L.lIIlIlIIlllIl("BxciEzIuA3oCPyYJIhE/", "TfWvW");
        L.lIlIllllll[L.lIllIIIIII[95]] = L.lIIlIlIIllllI("iFxP/y3HRCPKhNL3nUTWXw==", "yTOVX");
        L.lIlIllllll[L.lIllIIIIII[97]] = L.lIIlIlIIlllII("y4EsTtIMUkK26LCDnZS3BA==", "gxcUe");
        L.lIlIllllll[L.lIllIIIIII[98]] = L.lIIlIlIIlllII("z/MAwLjEDNZaszOT2zvY8w==", "iDPDN");
        L.lIlIllllll[L.lIllIIIIII[99]] = L.lIIlIlIIlllII("I5OSaPodxSeQPOXGDtnudAMRL1BnY5XT", "ZHGPh");
        L.lIlIllllll[L.lIllIIIIII[100]] = L.lIIlIlIIlllIl("BTMMDA==", "QRgiA");
        L.lIlIllllll[L.lIllIIIIII[101]] = L.lIIlIlIIlllIl("MDo2Hh8KIDBMCAw7JR8O", "cNWlk");
        L.lIlIllllll[L.lIllIIIIII[102]] = L.lIIlIlIIlllIl("CzcHKCJ5LxMjJg==", "YXrOJ");
        L.lIlIllllll[L.lIllIIIIII[103]] = L.lIIlIlIIlllII("CRtClwQFkJg=", "GyzUW");
        L.lIlIllllll[L.lIllIIIIII[38]] = L.lIIlIlIIllllI("vN8P6jpBEXGKnazjkuoMpwpTMB13Erob", "JRTKa");
        L.lIlIllllll[L.lIllIIIIII[105]] = L.lIIlIlIIllllI("sHw0nFCkhBWX0Z2f+RimAA==", "kiOSS");
        L.lIlIllllll[L.lIllIIIIII[106]] = L.lIIlIlIIlllIl("EBkhOiI=", "SkNIQ");
        L.lIlIllllll[L.lIllIIIIII[107]] = L.lIIlIlIIlllII("eB4wQGxUKMs=", "bLTJJ");
        L.lIlIllllll[L.lIllIIIIII[108]] = L.lIIlIlIIllllI("Mrvffg1WAd0=", "Kjnmr");
        L.lIlIllllll[L.lIllIIIIII[109]] = L.lIIlIlIIlllIl("CgkRBQ==", "Flpue");
        L.lIlIllllll[L.lIllIIIIII[110]] = L.lIIlIlIIlllIl("DyQCFhguLAAQ", "MEnwv");
        L.lIlIllllll[L.lIllIIIIII[111]] = L.lIIlIlIIllllI("UEg0ogfXsRc=", "bHAZR");
        L.lIlIllllll[L.lIllIIIIII[112]] = L.lIIlIlIIllllI("NJSIykkt13s=", "RhQFu");
        L.lIlIllllll[L.lIllIIIIII[113]] = L.lIIlIlIIllllI("qIlQFpBwasR7dURzS6hJEg==", "hqhRb");
        L.lIlIllllll[L.lIllIIIIII[40]] = L.lIIlIlIIllllI("3UmKo5Y96KA=", "yPcwG");
        L.lIlIllllll[L.lIllIIIIII[7]] = L.lIIlIlIIlllII("hcPaX3Zwqv0=", "wijJx");
        L.lIlIllllll[L.lIllIIIIII[114]] = L.lIIlIlIIlllII("ASR1jIskKqBNpzIWBPuhfA==", "CpMEl");
        L.lIlIllllll[L.lIllIIIIII[116]] = L.lIIlIlIIlllII("O9iryrQfOe0=", "PVrAl");
        L.lIlIllllll[L.lIllIIIIII[117]] = L.lIIlIlIIlllIl("GwYFHi4/FEgJJiFTWw==", "QshnG");
        L.lIlIllllll[L.lIllIIIIII[119]] = L.lIIlIlIIlllIl("JwMLPQ==", "kfjMz");
        L.lIlIllllll[L.lIllIIIIII[120]] = L.lIIlIlIIlllIl("IDIbDhwNZxsFHw4=", "hGijp");
        L.lIlIllllll[L.lIllIIIIII[122]] = L.lIIlIlIIllllI("aWJxSQECxi4=", "ilpLO");
        L.lIlIllllll[L.lIllIIIIII[123]] = L.lIIlIlIIllllI("hnqMBM3eh8mPPa6cJH5MXPmcNgIu8J51", "qFqUl");
        L.lIlIllllll[L.lIllIIIIII[124]] = L.lIIlIlIIllllI("Js35poZdCDU=", "cNjfX");
        L.lIlIllllll[L.lIllIIIIII[44]] = L.lIIlIlIIlllII("fqIqLZ57jla3z4fHKVh9kA==", "KEwMf");
        L.lIlIllllll[L.lIllIIIIII[140]] = L.lIIlIlIIlllIl("AjAHVh8jcRIXBS03GAVLLz4EBBgp", "LQqvk");
        L.lIlIllllll[L.lIllIIIIII[6]] = L.lIIlIlIIlllIl("DAsbUDctSh4EIjAe", "BjmpC");
        L.lIlIllllll[L.lIllIIIIII[141]] = L.lIIlIlIIlllIl("Jz4lIy4dJCNxORs/NiI/", "tJDQZ");
        L.lIlIllllll[L.lIllIIIIII[142]] = L.lIIlIlIIllllI("Sdgq13AnGGhVehELs1Co5A==", "NtSQK");
        L.lIlIllllll[L.lIllIIIIII[143]] = L.lIIlIlIIllllI("XF2EZOs0Lv4=", "kWRrt");
        L.lIlIllllll[L.lIllIIIIII[144]] = L.lIIlIlIIllllI("REh3f+62jtpKyICiUzMt1g==", "PopJS");
        L.lIlIllllll[L.lIllIIIIII[145]] = L.lIIlIlIIlllIl("PCYoIh0PZy4qAQM=", "hGCKs");
        L.lIlIllllll[L.lIllIIIIII[146]] = L.lIIlIlIIlllII("YKyrCYIDEfOkFDq1BT1RuMPCZL09i4iD", "lYUuD");
        L.lIlIllllll[L.lIllIIIIII[147]] = L.lIIlIlIIlllII("43oadOQmHws=", "PjqMt");
        L.lIlIllllll[L.lIllIIIIII[148]] = L.lIIlIlIIllllI("XakPkoLnAWkSx4OzrXrGeA==", "BlVoc");
        L.lIlIllllll[L.lIllIIIIII[149]] = L.lIIlIlIIlllII("Wcg01rNYUxc=", "nSBwO");
        L.lIlIllllll[L.lIllIIIIII[150]] = L.lIIlIlIIllllI("HYoiB4touHHUNGZiuYfBuQ==", "JMWiJ");
        L.lIlIllllll[L.lIllIIIIII[151]] = L.lIIlIlIIllllI("lmtRnaxBpcQ=", "UZIIM");
        L.lIlIllllll[L.lIllIIIIII[152]] = L.lIIlIlIIllllI("F1zzNO9g8UQ/34ABQUwhKQ==", "MZkrN");
        L.lIlIllllll[L.lIllIIIIII[153]] = L.lIIlIlIIlllIl("ATojCQ==", "KONyK");
        L.lIlIllllll[L.lIllIIIIII[154]] = L.lIIlIlIIlllIl("Gg89ORw+HXAuFCBaZA==", "PzPIu");
        L.lIlIllllll[L.lIllIIIIII[155]] = L.lIIlIlIIlllIl("Cx8YEQ==", "Ajuaj");
        L.lIlIllllll[L.lIllIIIIII[156]] = L.lIIlIlIIlllII("eCKGmw7C25b7tOz3bp2buw==", "qPxJE");
        L.lIlIllllll[L.lIllIIIIII[157]] = L.lIIlIlIIllllI("f6H6acQW/6w=", "VjtxY");
        L.lIlIllllll[L.lIllIIIIII[158]] = L.lIIlIlIIlllIl("OxscFxAfCVEAGAFORA==", "qnqgy");
        L.lIlIllllll[L.lIllIIIIII[159]] = L.lIIlIlIIllllI("cYGgqBIY9eA=", "KVJtG");
        L.lIlIllllll[L.lIllIIIIII[160]] = L.lIIlIlIIlllIl("EAYCKR80FE8+FypTWQ==", "ZsoYv");
        L.lIlIllllll[L.lIllIIIIII[161]] = L.lIIlIlIIlllII("V4iDWtJUqQI=", "aRhlh");
        L.lIlIllllll[L.lIllIIIIII[172]] = L.lIIlIlIIlllII("X01k8W1/VvAXCJXqvdvAC8i5kQu7GPqV", "DnpJv");
        L.lIlIllllll[L.lIllIIIIII[173]] = L.lIIlIlIIlllIl("CwURTAMqRBQYFjcQ", "Edglw");
        L.lIlIllllll[L.lIllIIIIII[174]] = L.lIIlIlIIlllII("GPinJJ/96Um/ReEe29Y7Cw==", "DhXic");
        L.lIlIllllll[L.lIllIIIIII[175]] = L.lIIlIlIIlllIl("FhAeAw==", "Aqrob");
        L.lIlIllllll[L.lIllIIIIII[36]] = L.lIIlIlIIlllIl("JCAzIzBKOSo=", "gLZNR");
        L.lIlIllllll[L.lIllIIIIII[176]] = L.lIIlIlIIlllIl("KBMcIGsKFE4sOQQRCw==", "ernKK");
        L.lIlIllllll[L.lIllIIIIII[177]] = L.lIIlIlIIlllIl("DQ4/BwU+TzkPGTI=", "YoTnk");
        L.lIlIllllll[L.lIllIIIIII[178]] = L.lIIlIlIIllllI("dYaLkrd5M/0YQtsyVG7GBfwZ8HBR8m2+", "bVIRY");
        L.lIlIllllll[L.lIllIIIIII[179]] = L.lIIlIlIIlllIl("LAwSMA==", "xmyUQ");
        L.lIlIllllll[L.lIllIIIIII[180]] = L.lIIlIlIIlllII("AGR+bvlBjdtwfsXibJYimw==", "zympn");
        L.lIlIllllll[L.lIllIIIIII[79]] = L.lIIlIlIIlllII("3QrATI+W2hs=", "kqkjO");
        L.lIlIllllll[L.lIllIIIIII[181]] = L.lIIlIlIIlllII("SZU3UnbCc6reEw6jDy7XYQ==", "SRIis");
        L.lIlIllllll[L.lIllIIIIII[182]] = L.lIIlIlIIlllIl("Jx0XICI=", "doxSQ");
        L.lIlIllllll[L.lIllIIIIII[183]] = L.lIIlIlIIllllI("kRs1b7SDBDfb9xhI5fwWQg==", "MHZxl");
        L.lIlIllllll[L.lIllIIIIII[184]] = L.lIIlIlIIlllIl("IS8ICA==", "kZexH");
        L.lIlIllllll[L.lIllIIIIII[185]] = L.lIIlIlIIlllIl("OTMMHxwdIUEIFANmVQ==", "sFaou");
        L.lIlIllllll[L.lIllIIIIII[186]] = L.lIIlIlIIlllIl("HDE9Hw==", "VDPoF");
        L.lIlIllllll[L.lIllIIIIII[187]] = L.lIIlIlIIllllI("AsBu+2PDP9Whx29gXUmh9Q==", "bfcUm");
        L.lIlIllllll[L.lIllIIIIII[188]] = L.lIIlIlIIllllI("DBPnPMsSzbk=", "BEpaY");
        L.lIlIllllll[L.lIllIIIIII[194]] = L.lIIlIlIIlllIl("HCUDIhN6Jxc+HHolGGwQKCUDIhM=", "ZJvLw");
        L.lIlIllllll[L.lIllIIIIII[203]] = L.lIIlIlIIllllI("mlemHB7aYmc=", "HcabM");
        L.lIlIllllll[L.lIllIIIIII[204]] = L.lIIlIlIIlllII("Hcw0bLbhVZg=", "CpFml");
        L.lIlIllllll[L.lIllIIIIII[205]] = L.lIIlIlIIlllII("q4gHO/7Tk34=", "NDnFZ");
        L.lIlIllllll[L.lIllIIIIII[206]] = L.lIIlIlIIlllII("C1G57xqSek0=", "saame");
        L.lIlIllllll[L.lIllIIIIII[207]] = L.lIIlIlIIlllII("vdtn5KHO1/4=", "CrnPf");
        L.lIlIllllll[L.lIllIIIIII[208]] = L.lIIlIlIIlllIl("MTIrEA==", "tVLui");
        L.lIlIllllll[L.lIllIIIIII[211]] = L.lIIlIlIIlllII("NGW+hA2tpp0=", "bOxhy");
        L.lIlIllllll[L.lIllIIIIII[213]] = L.lIIlIlIIllllI("jUIQJM7zObc=", "CgtgP");
        L.lIlIllllll[L.lIllIIIIII[216]] = L.lIIlIlIIlllII("zNmJRUUo4//FereB2WDUcg==", "eZnjg");
        L.lIlIllllll[L.lIllIIIIII[218]] = L.lIIlIlIIlllIl("Hy8Z", "XNitV");
        L.lIlIllllll[L.lIllIIIIII[221]] = L.lIIlIlIIlllII("1v0lWCfTJQQ=", "SHXdp");
        L.lIlIllllll[L.lIllIIIIII[224]] = L.lIIlIlIIllllI("SfKSNpzWORQ=", "KuhUU");
        L.lIlIllllll[L.lIllIIIIII[226]] = L.lIIlIlIIlllIl("PycfN0EZKQY+GA==", "oHsRl");
        L.lIlIllllll[L.lIllIIIIII[227]] = L.lIIlIlIIlllIl("CwgE", "LitkL");
        L.lIlIllllll[L.lIllIIIIII[230]] = L.lIIlIlIIlllII("NUHHkwFjUiA=", "Jreog");
        L.lIlIllllll[L.lIllIIIIII[232]] = L.lIIlIlIIllllI("C7SxrwKYHgg=", "YDDzn");
        L.lIlIllllll[L.lIllIIIIII[233]] = L.lIIlIlIIllllI("Vd70Iln0DRk=", "HjqGk");
    }

    /*
     * WARNING - void declaration
     */
    private static void cR() {
        void lllllllllllllllllllIIllIlllIlIlI;
        void lllllllllllllllllllIIllIllllIIlI;
        void lllllllllllllllllllIIllIllllIIll;
        void lllllllllllllllllllIIllIllllIlII;
        void lllllllllllllllllllIIllIllllIlIl;
        WorldArea worldArea = new WorldArea(lIllIIIIII[125], lIllIIIIII[126], lIllIIIIII[112], lIllIIIIII[107], lIllIIIIII[0]);
        WorldArea worldArea2 = new WorldArea(lIllIIIIII[125], lIllIIIIII[126], lIllIIIIII[112], lIllIIIIII[107], lIllIIIIII[1]);
        WorldArea worldArea3 = new WorldArea(lIllIIIIII[125], lIllIIIIII[126], lIllIIIIII[112], lIllIIIIII[107], lIllIIIIII[3]);
        WorldArea worldArea4 = new WorldArea(lIllIIIIII[125], lIllIIIIII[126], lIllIIIIII[112], lIllIIIIII[107], lIllIIIIII[10]);
        WorldArea worldArea5 = new WorldArea(lIllIIIIII[127], lIllIIIIII[128], lIllIIIIII[49], lIllIIIIII[12], lIllIIIIII[3]);
        WorldArea worldArea6 = new WorldArea(lIllIIIIII[129], lIllIIIIII[127], lIllIIIIII[49], lIllIIIIII[25], lIllIIIIII[3]);
        WorldArea worldArea7 = new WorldArea(lIllIIIIII[130], lIllIIIIII[131], lIllIIIIII[63], lIllIIIIII[49], lIllIIIIII[3]);
        WorldArea worldArea8 = new WorldArea(lIllIIIIII[132], lIllIIIIII[133], lIllIIIIII[12], lIllIIIIII[64], lIllIIIIII[10]);
        WorldArea worldArea9 = new WorldArea(lIllIIIIII[134], lIllIIIIII[9], lIllIIIIII[49], lIllIIIIII[27], lIllIIIIII[3]);
        WorldArea worldArea10 = new WorldArea(lIllIIIIII[135], lIllIIIIII[136], lIllIIIIII[68], lIllIIIIII[53], lIllIIIIII[10]);
        WorldArea worldArea11 = new WorldArea(lIllIIIIII[137], lIllIIIIII[138], lIllIIIIII[63], lIllIIIIII[64], lIllIIIIII[3]);
        WorldPoint worldPoint = new WorldPoint(lIllIIIIII[137], lIllIIIIII[139], lIllIIIIII[0]);
        if (L.lIIlIlIlIIIIl(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (L.lIIlIlIlIIIll(lllllllllllllllllllIIllIllllIlIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && L.lIIlIlIlIIIll(lllllllllllllllllllIIllIllllIlII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && L.lIIlIlIlIIIll(lllllllllllllllllllIIllIllllIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && L.lIIlIlIlIIIll(lllllllllllllllllllIIllIllllIIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderShamans.c = lIlIllllll[lIllIIIIII[140]];
            Movement.walkTo((WorldPoint)lllllllllllllllllllIIllIlllIlIlI);
            "".length();
            Time.sleepTicks((int)lIllIIIIII[1]);
            "".length();
        }
        if (L.lIIlIlIlIIIIl(lllllllllllllllllllIIllIllllIlIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (L.lIIlIlIlIIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllllllllllllllIIllIlllIlIlI), lIllIIIIII[21])) {
                AccBuilderShamans.c = lIlIllllll[lIllIIIIII[6]];
                Movement.walkTo((WorldPoint)lllllllllllllllllllIIllIlllIlIlI);
                "".length();
                Time.sleepTicks((int)lIllIIIIII[1]);
                "".length();
            }
            if (L.lIIlIlIlIlIIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllllllllllllllIIllIlllIlIlI), lIllIIIIII[21])) {
                AccBuilderShamans.c = lIlIllllll[lIllIIIIII[141]];
                int lllllllllllllllllllIIllIlllIlIIl = Skills.getExperience((Skill)Skill.AGILITY);
                String[] stringArray = new String[lIllIIIIII[1]];
                stringArray[L.lIllIIIIII[0]] = lIlIllllll[lIllIIIIII[142]];
                TileObjects.getNearest((String[])stringArray).interact(lIlIllllll[lIllIIIIII[143]]);
                Time.sleepTicks((int)e.c(lIllIIIIII[1], lIllIIIIII[3]));
                "".length();
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (L.lIIlIlIlIIlIl(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllllIIllIlllIlIIl)) {
                        bl = lIllIIIIII[1];
                        "".length();
                        if ("  ".length() <= -" ".length()) {
                            return ((0x7E ^ 0x60) & ~(0x9A ^ 0x84)) != 0;
                        }
                    } else {
                        bl = lIllIIIIII[0];
                    }
                    return bl;
                }, (int)lIllIIIIII[104]);
                "".length();
                Time.sleepTicks((int)lIllIIIIII[1]);
                "".length();
            }
        }
        String[] stringArray = new String[lIllIIIIII[1]];
        stringArray[L.lIllIIIIII[0]] = lIlIllllll[lIllIIIIII[144]];
        TileItem lllllllllllllllllllIIllIlllIlIIl = TileItems.getNearest((String[])stringArray);
        if (L.lIIlIlIlIIlII(lllllllllllllllllllIIllIlllIlIIl) && L.lIIlIlIlIIIIl(L.cT() ? 1 : 0)) {
            AccBuilderShamans.c = lIlIllllll[lIllIIIIII[145]];
            System.out.println(lIlIllllll[lIllIIIIII[146]]);
            lllllllllllllllllllIIllIlllIlIIl.interact(lIlIllllll[lIllIIIIII[147]]);
            Time.sleepTicks((int)lIllIIIIII[10]);
            "".length();
        }
        if (L.lIIlIlIlIIIll(L.cT() ? 1 : 0)) {
            void lllllllllllllllllllIIllIlllIlIll;
            void lllllllllllllllllllIIllIlllIllII;
            void lllllllllllllllllllIIllIlllIllIl;
            void lllllllllllllllllllIIllIlllIlllI;
            void lllllllllllllllllllIIllIlllIllll;
            void lllllllllllllllllllIIllIllllIIII;
            int lllllllllllllllllllIIllIlllIIlll;
            TileObject lllllllllllllllllllIIllIlllIlIII;
            void lllllllllllllllllllIIllIllllIIIl;
            if (L.lIIlIlIlIIIIl(lllllllllllllllllllIIllIllllIIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && L.lIIlIlIlIIlII(lllllllllllllllllllIIllIlllIlIII = TileObjects.getNearest(tileObject -> {
                int n2;
                if (L.lIIlIlIlIIIIl(tileObject.getName().contains(lIlIllllll[lIllIIIIII[233]]) ? 1 : 0) && L.lIIlIlIlIlIIl(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIllIIIIII[234], lIllIIIIII[131], lIllIIIIII[3])), lIllIIIIII[3])) {
                    n2 = lIllIIIIII[1];
                    "".length();
                    if (-"   ".length() > 0) {
                        return ((0x79 ^ 0x63) & ~(0xB8 ^ 0xA2)) != 0;
                    }
                } else {
                    n2 = lIllIIIIII[0];
                }
                return n2 != 0;
            }))) {
                lllllllllllllllllllIIllIlllIIlll = Skills.getExperience((Skill)Skill.AGILITY);
                AccBuilderShamans.c = lIlIllllll[lIllIIIIII[148]];
                lllllllllllllllllllIIllIlllIlIII.interact(lIlIllllll[lIllIIIIII[149]]);
                Time.sleepTicks((int)e.c(lIllIIIIII[1], lIllIIIIII[3]));
                "".length();
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (L.lIIlIlIlIIlIl(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllllIIllIlllIIlll)) {
                        bl = lIllIIIIII[1];
                        "".length();
                        if ("   ".length() < 0) {
                            return ((0x4F ^ 0x70 ^ (0x22 ^ 0x7D)) & (0x87 ^ 0xAB ^ (0x6A ^ 0x26) ^ -" ".length())) != 0;
                        }
                    } else {
                        bl = lIllIIIIII[0];
                    }
                    return bl;
                }, (int)lIllIIIIII[104]);
                "".length();
                Time.sleepTicks((int)lIllIIIIII[1]);
                "".length();
            }
            if (L.lIIlIlIlIIIIl(L.cT() ? 1 : 0)) {
                return;
            }
            if (L.lIIlIlIlIIIIl(lllllllllllllllllllIIllIllllIIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && L.lIIlIlIlIIlII(lllllllllllllllllllIIllIlllIlIII = TileObjects.getNearest(tileObject -> {
                int n2;
                if (L.lIIlIlIlIIIIl(tileObject.getName().contains(lIlIllllll[lIllIIIIII[232]]) ? 1 : 0) && L.lIIlIlIlIlIIl(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIllIIIIII[131], lIllIIIIII[225], lIllIIIIII[3])), lIllIIIIII[3])) {
                    n2 = lIllIIIIII[1];
                    "".length();
                    if (((0x7F ^ 0x31) & ~(0x79 ^ 0x37)) < 0) {
                        return ((0x82 ^ 0x9C) & ~(0xD ^ 0x13)) != 0;
                    }
                } else {
                    n2 = lIllIIIIII[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderShamans.c = lIlIllllll[lIllIIIIII[150]];
                lllllllllllllllllllIIllIlllIIlll = Skills.getExperience((Skill)Skill.AGILITY);
                lllllllllllllllllllIIllIlllIlIII.interact(lIlIllllll[lIllIIIIII[151]]);
                Time.sleepTicks((int)e.c(lIllIIIIII[1], lIllIIIIII[3]));
                "".length();
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (L.lIIlIlIlIIlIl(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllllIIllIlllIIlll)) {
                        bl = lIllIIIIII[1];
                        "".length();
                        if (-"   ".length() >= 0) {
                            return ((132 + 99 - 138 + 127 ^ 97 + 14 - 79 + 116) & (4 + 138 - 11 + 73 ^ 112 + 22 - 78 + 76 ^ -" ".length())) != 0;
                        }
                    } else {
                        bl = lIllIIIIII[0];
                    }
                    return bl;
                }, (int)lIllIIIIII[104]);
                "".length();
                Time.sleepTicks((int)lIllIIIIII[1]);
                "".length();
            }
            if (L.lIIlIlIlIIIIl(L.cT() ? 1 : 0)) {
                return;
            }
            if (L.lIIlIlIlIIIIl(lllllllllllllllllllIIllIlllIllll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && L.lIIlIlIlIIlII(lllllllllllllllllllIIllIlllIlIII = TileObjects.getNearest(tileObject -> {
                int n2;
                if (L.lIIlIlIlIIIIl(tileObject.getName().contains(lIlIllllll[lIllIIIIII[230]]) ? 1 : 0) && L.lIIlIlIlIlIIl(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIllIIIIII[139], lIllIIIIII[231], lIllIIIIII[3])), lIllIIIIII[3])) {
                    n2 = lIllIIIIII[1];
                    "".length();
                    if (" ".length() == 0) {
                        return ((" ".length() ^ (0xC7 ^ 0x9F)) & (0x1F ^ 0x52 ^ (0xB5 ^ 0xA1) ^ -" ".length())) != 0;
                    }
                } else {
                    n2 = lIllIIIIII[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderShamans.c = lIlIllllll[lIllIIIIII[152]];
                lllllllllllllllllllIIllIlllIIlll = Skills.getExperience((Skill)Skill.AGILITY);
                lllllllllllllllllllIIllIlllIlIII.interact(lIlIllllll[lIllIIIIII[153]]);
                Time.sleepTicks((int)e.c(lIllIIIIII[1], lIllIIIIII[3]));
                "".length();
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (L.lIIlIlIlIIlIl(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllllIIllIlllIIlll)) {
                        bl = lIllIIIIII[1];
                        "".length();
                        if (((0x54 ^ 0x6E) & ~(0xFF ^ 0xC5)) <= -" ".length()) {
                            return ("   ".length() & ~"   ".length()) != 0;
                        }
                    } else {
                        bl = lIllIIIIII[0];
                    }
                    return bl;
                }, (int)lIllIIIIII[104]);
                "".length();
                Time.sleepTicks((int)lIllIIIIII[1]);
                "".length();
            }
            if (L.lIIlIlIlIIIIl(L.cT() ? 1 : 0)) {
                return;
            }
            if (L.lIIlIlIlIIIIl(lllllllllllllllllllIIllIlllIlllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && L.lIIlIlIlIIlII(lllllllllllllllllllIIllIlllIlIII = TileObjects.getNearest(tileObject -> {
                int n2;
                if (L.lIIlIlIlIIIIl(tileObject.getName().contains(lIlIllllll[lIllIIIIII[227]]) ? 1 : 0) && L.lIIlIlIlIlIIl(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIllIIIIII[228], lIllIIIIII[229], lIllIIIIII[10])), lIllIIIIII[3])) {
                    n2 = lIllIIIIII[1];
                    "".length();
                    if ((0x1E ^ 0x1A) == 0) {
                        return ((0x98 ^ 0x8B) & ~(0x44 ^ 0x57)) != 0;
                    }
                } else {
                    n2 = lIllIIIIII[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderShamans.c = lIlIllllll[lIllIIIIII[154]];
                lllllllllllllllllllIIllIlllIIlll = Skills.getExperience((Skill)Skill.AGILITY);
                lllllllllllllllllllIIllIlllIlIII.interact(lIlIllllll[lIllIIIIII[155]]);
                Time.sleepTicks((int)e.c(lIllIIIIII[1], lIllIIIIII[3]));
                "".length();
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (L.lIIlIlIlIIlIl(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllllIIllIlllIIlll)) {
                        bl = lIllIIIIII[1];
                        "".length();
                        if ("   ".length() == (0x31 ^ 0x35)) {
                            return ((0x40 ^ 0x7D) & ~(0xD ^ 0x30)) != 0;
                        }
                    } else {
                        bl = lIllIIIIII[0];
                    }
                    return bl;
                }, (int)lIllIIIIII[104]);
                "".length();
                Time.sleepTicks((int)lIllIIIIII[1]);
                "".length();
            }
            if (L.lIIlIlIlIIIIl(L.cT() ? 1 : 0)) {
                return;
            }
            if (L.lIIlIlIlIIIIl(lllllllllllllllllllIIllIlllIllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && L.lIIlIlIlIIlII(lllllllllllllllllllIIllIlllIlIII = TileObjects.getNearest(tileObject -> {
                int n2;
                if (L.lIIlIlIlIIIIl(tileObject.getName().contains(lIlIllllll[lIllIIIIII[226]]) ? 1 : 0) && L.lIIlIlIlIlIIl(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIllIIIIII[9], lIllIIIIII[130], lIllIIIIII[3])), lIllIIIIII[3])) {
                    n2 = lIllIIIIII[1];
                    "".length();
                    if ((0x32 ^ 0x36) == 0) {
                        return ((0xFD ^ 0xB8) & ~(0xE3 ^ 0xA6)) != 0;
                    }
                } else {
                    n2 = lIllIIIIII[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderShamans.c = lIlIllllll[lIllIIIIII[156]];
                lllllllllllllllllllIIllIlllIIlll = Skills.getExperience((Skill)Skill.AGILITY);
                lllllllllllllllllllIIllIlllIlIII.interact(lIlIllllll[lIllIIIIII[157]]);
                Time.sleepTicks((int)e.c(lIllIIIIII[1], lIllIIIIII[3]));
                "".length();
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (L.lIIlIlIlIIlIl(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllllIIllIlllIIlll)) {
                        bl = lIllIIIIII[1];
                        "".length();
                        if (((0x67 ^ 0x63) & ~(0xAF ^ 0xAB)) != 0) {
                            return ((0xFB ^ 0xA4) & ~(0x35 ^ 0x6A)) != 0;
                        }
                    } else {
                        bl = lIllIIIIII[0];
                    }
                    return bl;
                }, (int)lIllIIIIII[104]);
                "".length();
                Time.sleepTicks((int)lIllIIIIII[1]);
                "".length();
            }
            if (L.lIIlIlIlIIIIl(L.cT() ? 1 : 0)) {
                return;
            }
            if (L.lIIlIlIlIIIIl(lllllllllllllllllllIIllIlllIllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && L.lIIlIlIlIIlII(lllllllllllllllllllIIllIlllIlIII = TileObjects.getNearest(tileObject -> {
                int n2;
                if (L.lIIlIlIlIIIIl(tileObject.getName().contains(lIlIllllll[lIllIIIIII[224]]) ? 1 : 0) && L.lIIlIlIlIlIIl(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIllIIIIII[225], lIllIIIIII[215], lIllIIIIII[10])), lIllIIIIII[3])) {
                    n2 = lIllIIIIII[1];
                    "".length();
                    if (" ".length() >= "  ".length()) {
                        return ((0x42 ^ 0x1F) & ~(0x25 ^ 0x78)) != 0;
                    }
                } else {
                    n2 = lIllIIIIII[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderShamans.c = lIlIllllll[lIllIIIIII[158]];
                lllllllllllllllllllIIllIlllIIlll = Skills.getExperience((Skill)Skill.AGILITY);
                lllllllllllllllllllIIllIlllIlIII.interact(lIlIllllll[lIllIIIIII[159]]);
                Time.sleepTicks((int)e.c(lIllIIIIII[1], lIllIIIIII[3]));
                "".length();
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (L.lIIlIlIlIIlIl(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllllIIllIlllIIlll)) {
                        bl = lIllIIIIII[1];
                        "".length();
                        if (((60 + 24 - -6 + 55 ^ 168 + 85 - 242 + 161) & (0x18 ^ 0x6D ^ (0x41 ^ 9) ^ -" ".length())) != 0) {
                            return ((88 + 2 - -122 + 0 ^ 42 + 115 - -4 + 20) & (0x18 ^ 0x2B ^ (0x76 ^ 0x24) ^ -" ".length())) != 0;
                        }
                    } else {
                        bl = lIllIIIIII[0];
                    }
                    return bl;
                }, (int)lIllIIIIII[104]);
                "".length();
                Time.sleepTicks((int)lIllIIIIII[1]);
                "".length();
            }
            if (L.lIIlIlIlIIIIl(L.cT() ? 1 : 0)) {
                return;
            }
            if (L.lIIlIlIlIIIIl(lllllllllllllllllllIIllIlllIlIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && L.lIIlIlIlIIlII(lllllllllllllllllllIIllIlllIlIII = TileObjects.getNearest(tileObject -> {
                int n2;
                if (L.lIIlIlIlIIIIl(tileObject.getName().contains(lIlIllllll[lIllIIIIII[221]]) ? 1 : 0) && L.lIIlIlIlIlIIl(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIllIIIIII[222], lIllIIIIII[223], lIllIIIIII[3])), lIllIIIIII[3])) {
                    n2 = lIllIIIIII[1];
                    "".length();
                    if (((0x46 ^ 0x2A ^ (0x3C ^ 0x12)) & (0xD8 ^ 0x98 ^ "  ".length() ^ -" ".length())) > "   ".length()) {
                        return ((" ".length() ^ (0x93 ^ 0xAB)) & (118 + 65 - 74 + 46 ^ 151 + 23 - 78 + 66 ^ -" ".length())) != 0;
                    }
                } else {
                    n2 = lIllIIIIII[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderShamans.c = lIlIllllll[lIllIIIIII[160]];
                lllllllllllllllllllIIllIlllIIlll = Skills.getExperience((Skill)Skill.AGILITY);
                lllllllllllllllllllIIllIlllIlIII.interact(lIlIllllll[lIllIIIIII[161]]);
                Time.sleepTicks((int)e.c(lIllIIIIII[1], lIllIIIIII[3]));
                "".length();
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (L.lIIlIlIlIIlIl(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllllIIllIlllIIlll)) {
                        bl = lIllIIIIII[1];
                        "".length();
                        if (((0x1C ^ 0x52 ^ (0xDB ^ 0x84)) & (4 ^ 0x68 ^ (0x4C ^ 0x31) ^ -" ".length())) != 0) {
                            return ((0x5B ^ 0x5D ^ (0x38 ^ 0x14)) & (84 + 50 - 114 + 114 ^ 31 + 45 - 65 + 161 ^ -" ".length())) != 0;
                        }
                    } else {
                        bl = lIllIIIIII[0];
                    }
                    return bl;
                }, (int)lIllIIIIII[104]);
                "".length();
                Time.sleepTicks((int)lIllIIIIII[1]);
                "".length();
            }
        }
    }
}

