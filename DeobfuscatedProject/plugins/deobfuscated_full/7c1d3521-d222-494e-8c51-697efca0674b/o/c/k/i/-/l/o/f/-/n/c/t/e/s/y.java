/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Locatable
 *  net.runelite.api.Prayer
 *  net.runelite.api.Skill
 *  net.runelite.api.TileItem
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.Walker
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.quests.QuestVarbits
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.api.widgets.Widgets
 */
package o.c.k.i.-.l.o.f.-.n.c.t.e.s;

import gg.squire.account.AccBuilderSotf;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Locatable;
import net.runelite.api.Prayer;
import net.runelite.api.Skill;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.D;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.H;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.a;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.aC;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.aE;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.aN;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.am;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.av;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.aw;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ay;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.b;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.d;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.e;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.f;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.g;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.j;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.m;

public class y
implements ac {
    public static /* synthetic */ String da;
    public static /* synthetic */ String h;
    public static /* synthetic */ List<d> bv;
    public static /* synthetic */ WorldPoint dO;
    public static /* synthetic */ WorldPoint dS;
    public static /* synthetic */ int dN;
    static /* synthetic */ String[] cE;
    static /* synthetic */ WorldArea dX;
    public static /* synthetic */ WorldPoint dR;
    static /* synthetic */ boolean dj;
    public static /* synthetic */ WorldPoint dU;
    public static /* synthetic */ boolean bt;
    static /* synthetic */ WorldArea dZ;
    private static /* synthetic */ String[] llIllllIlI;
    static /* synthetic */ int di;
    public static /* synthetic */ WorldPoint dQ;
    static /* synthetic */ WorldArea dY;
    static /* synthetic */ WorldArea dW;
    public static /* synthetic */ WorldPoint dP;
    public static /* synthetic */ WorldPoint dT;
    private static /* synthetic */ int[] llIllllllI;
    static /* synthetic */ WorldPoint dV;

    private static boolean lIllllIIllIlI(int n2, int n3) {
        return n2 <= n3;
    }

    private static void lIllllIIlIIII() {
        llIllllllI = new int[624];
        y.llIllllllI[0] = 1;
        y.llIllllllI[1] = (5 ^ 0) & ~(0x64 ^ 0x61);
        y.llIllllllI[2] = 0x49 ^ 0x4C;
        y.llIllllllI[3] = 8 ^ 0x1C;
        y.llIllllllI[4] = 2;
        y.llIllllllI[5] = 0xBB ^ 0xAD;
        y.llIllllllI[6] = 3;
        y.llIllllllI[7] = 111 + 27 - 119 + 108 ^ (0x2C ^ 0x49);
        y.llIllllllI[8] = 137 + 67 - 184 + 123 ^ 136 + 27 - 106 + 82;
        y.llIllllllI[9] = 160 + 103 - 206 + 108 ^ 113 + 98 - 98 + 20;
        y.llIllllllI[10] = 0x4D ^ 0x6C;
        y.llIllllllI[11] = 0x4C ^ 0x4A;
        y.llIllllllI[12] = 130 + 22 - 18 + 26 ^ 61 + 42 - -33 + 0;
        y.llIllllllI[13] = 72 + 106 - 5 + 21 ^ 136 + 11 - -16 + 34;
        y.llIllllllI[14] = -(0xFFFFFAC7 & 0x3D39) & (0xFFFFFDFE & 0x3BAF);
        y.llIllllllI[15] = 0x63 ^ 0x6B;
        y.llIllllllI[16] = 0x88 ^ 0x81;
        y.llIllllllI[17] = 165 + 165 - 178 + 29 ^ 176 + 27 - 170 + 158;
        y.llIllllllI[18] = -(0xFFFFFEE7 & 0xD7F) & (0xFFFFFFEF & 0x1FFE);
        y.llIllllllI[19] = 0x11 ^ 0x36 ^ (0x80 ^ 0xAC);
        y.llIllllllI[20] = -(0xFFFFFFEE & 0x2C1D) & (0xFFFFFFEF & 0x2FDB);
        y.llIllllllI[21] = 60 + 99 - 134 + 141 ^ 111 + 162 - 173 + 70;
        y.llIllllllI[22] = -(0xFFFFF52F & 0x5EDD) & (0xFFFFDFBF & 0x767F);
        y.llIllllllI[23] = 0xFFFFFBBD & 0x66E;
        y.llIllllllI[24] = -(0xFFFFFB6A & 0x26DF) & (0xFFFFBFEF & 0x6BDB);
        y.llIllllllI[25] = -(0xFFFFFABF & 0x6752) & (0xFFFFEF5B & 0x7EFD);
        y.llIllllllI[26] = 0xFFFFD5FD & 0x2B2E;
        y.llIllllllI[27] = 0xFFFFEDB3 & 0x5EEF;
        y.llIllllllI[28] = 0x62 ^ 0x7C;
        y.llIllllllI[29] = -(0xFFFFDFF7 & 0x305B) & (0xFFFFFDFF & 0x5EFF);
        y.llIllllllI[30] = 0xB5 ^ 0xBA;
        y.llIllllllI[31] = -(0xFFFFF9F1 & 0x4FFF) & (0xFFFFFFF7 & 0x4FFB);
        y.llIllllllI[32] = 0x3D ^ 0x70 ^ 54 + 78 - 129 + 124;
        y.llIllllllI[33] = -(0xFFFFF9F1 & 0x66AF) & (0xFFFFFFF7 & 0x7FEF);
        y.llIllllllI[34] = -(0xFFFFBEDD & 0x6733) & (0xFFFFEF3F & 0x3FFB);
        y.llIllllllI[35] = 0xFFFF87BA & 0x7BF7;
        y.llIllllllI[36] = -(0xFFFFDCFB & 0x6FAD) & (0xFFFFFDFD & 0x7FFB);
        y.llIllllllI[37] = 0xFFFF8FFB & 0x74FD;
        y.llIllllllI[38] = 0x51 ^ 0x5C;
        y.llIllllllI[39] = 0x63 ^ 0x6D;
        y.llIllllllI[40] = 26 + 122 - 145 + 129 ^ 124 + 29 - 35 + 30;
        y.llIllllllI[41] = 0xA3 ^ 0xB2;
        y.llIllllllI[42] = -(0x64 ^ 0x7D) & (0xFFFF8FFB & 0x7DBF);
        y.llIllllllI[43] = 0xFFFF8DFB & 0x7EA4;
        y.llIllllllI[44] = 0xDB ^ 0x84 ^ (0x40 ^ 0xD);
        y.llIllllllI[45] = 0xBF ^ 0x96 ^ (0xA1 ^ 0x9B);
        y.llIllllllI[46] = 137 + 132 - 136 + 33 ^ 153 + 17 - 152 + 161;
        y.llIllllllI[47] = 0x72 ^ 0x65;
        y.llIllllllI[48] = 0xAD ^ 0xB5;
        y.llIllllllI[49] = 0xA2 ^ 0x87 ^ (0x93 ^ 0xAF);
        y.llIllllllI[50] = 0x9D ^ 0x86;
        y.llIllllllI[51] = 12 + 37 - -17 + 82 ^ 50 + 91 - 87 + 82;
        y.llIllllllI[52] = 0x4C ^ 0x51;
        y.llIllllllI[53] = 0x34 ^ 0x2B;
        y.llIllllllI[54] = -1;
        y.llIllllllI[55] = 0x9F ^ 0xBD;
        y.llIllllllI[56] = 0xB8 ^ 0x9B;
        y.llIllllllI[57] = 226 + 79 - 214 + 139 ^ 101 + 18 - 2 + 77;
        y.llIllllllI[58] = 43 + 14 - 12 + 111 ^ 144 + 21 - 65 + 85;
        y.llIllllllI[59] = 0xE7 ^ 0xC1;
        y.llIllllllI[60] = 0x91 ^ 0xB6;
        y.llIllllllI[61] = (0x21 ^ 0x2D) & ~(0x45 ^ 0x49) ^ (0x4F ^ 0x66);
        y.llIllllllI[62] = 0x79 ^ 0x53;
        y.llIllllllI[63] = 0xB4 ^ 0x9F;
        y.llIllllllI[64] = 0x79 ^ 0x55;
        y.llIllllllI[65] = 0x96 ^ 0xBB;
        y.llIllllllI[66] = 160 + 163 - 297 + 141 ^ 104 + 115 - 111 + 29;
        y.llIllllllI[67] = 0x92 ^ 0xBD;
        y.llIllllllI[68] = 0xA1 ^ 0x9D;
        y.llIllllllI[69] = 0x18 ^ 0x28;
        y.llIllllllI[70] = 21 + 95 - 18 + 77 ^ 144 + 47 - 174 + 141;
        y.llIllllllI[71] = 48 + 90 - 0 + 19 ^ 87 + 47 - 129 + 169;
        y.llIllllllI[72] = 110 + 140 - 102 + 25 ^ 124 + 18 - 118 + 129;
        y.llIllllllI[73] = 0x67 ^ 0x43 ^ (0xFC ^ 0x99);
        y.llIllllllI[74] = 0xE8 ^ 0xAE;
        y.llIllllllI[75] = 154 + 135 - 94 + 25 ^ 27 + 54 - 29 + 88;
        y.llIllllllI[76] = 168 + 152 - 293 + 151 ^ 51 + 107 - 93 + 70;
        y.llIllllllI[77] = 0x5D ^ 0x6B;
        y.llIllllllI[78] = 0x73 ^ 0x2D ^ (0xFA ^ 0x93);
        y.llIllllllI[79] = 0x71 ^ 0x2B;
        y.llIllllllI[80] = 57 + 190 - 121 + 107 ^ 76 + 64 - 39 + 40;
        y.llIllllllI[81] = 0x3E ^ 0x23 ^ (0xA7 ^ 0x82);
        y.llIllllllI[82] = 5 ^ 0x5D ^ (0xC1 ^ 0xA0);
        y.llIllllllI[83] = 8 ^ 0x6F ^ (0x6B ^ 0x36);
        y.llIllllllI[84] = 0x7C ^ 0x47;
        y.llIllllllI[85] = 0x86 ^ 0xBB;
        y.llIllllllI[86] = 69 + 125 - 66 + 16 ^ 162 + 144 - 229 + 97;
        y.llIllllllI[87] = 0xE7 ^ 0xA7 ^ 103 + 101 - 96 + 19;
        y.llIllllllI[88] = 0x26 ^ 0x66;
        y.llIllllllI[89] = 0x2E ^ 0x1B ^ (0xDF ^ 0xA8);
        y.llIllllllI[90] = 199 + 143 - 242 + 105 ^ 110 + 2 - 3 + 33;
        y.llIllllllI[91] = 0x90 ^ 0xAF ^ (0x16 ^ 0x47);
        y.llIllllllI[92] = 84 + 194 - 239 + 201 ^ 114 + 58 - 75 + 83;
        y.llIllllllI[93] = 0x6C ^ 0x29;
        y.llIllllllI[94] = 0xCE ^ 0xA0 ^ (0xBF ^ 0x96);
        y.llIllllllI[95] = 0xC9 ^ 0x8C ^ (0x72 ^ 0x7F);
        y.llIllllllI[96] = 0xDB ^ 0x92;
        y.llIllllllI[97] = 0x1C ^ 0x56;
        y.llIllllllI[98] = 0x4A ^ 1;
        y.llIllllllI[99] = 98 + 10 - 14 + 139 ^ 162 + 74 - 139 + 68;
        y.llIllllllI[100] = 0xE9 ^ 0x91;
        y.llIllllllI[101] = 0x48 ^ 5;
        y.llIllllllI[102] = 0xA ^ 0x44;
        y.llIllllllI[103] = -(0xFFFFFF2F & 0x8F3) & (0xFFFFDEEF & 0x6FFB);
        y.llIllllllI[104] = 6 ^ 0x49;
        y.llIllllllI[105] = 110 + 52 - 52 + 20;
        y.llIllllllI[106] = 39 + 77 - -109 + 6 ^ 152 + 38 - 145 + 137;
        y.llIllllllI[107] = 0xEB ^ 0xB9;
        y.llIllllllI[108] = 0x97 ^ 0xC4;
        y.llIllllllI[109] = 64 + 143 - 141 + 84 ^ 163 + 29 - 139 + 141;
        y.llIllllllI[110] = 0xEA ^ 0xBF;
        y.llIllllllI[111] = 0x6C ^ 0x3A;
        y.llIllllllI[112] = (0x67 ^ 0x1A) + ((0xD ^ 0x1C) & ~(0x8D ^ 0x9C)) - (0x25 ^ 0x6D) + (0xEC ^ 0xBB);
        y.llIllllllI[113] = (0xD8 ^ 0xB4) + (125 + 103 - 227 + 158) - (78 + 90 - 28 + 5) + (0x42 ^ 0x72);
        y.llIllllllI[114] = 0x3C ^ 0x6B;
        y.llIllllllI[115] = 0xD4 ^ 0x9C ^ (0xA ^ 0x1A);
        y.llIllllllI[116] = 0xE1 ^ 0xB8;
        y.llIllllllI[117] = 16 + 90 - -80 + 19 ^ 139 + 31 - 116 + 96;
        y.llIllllllI[118] = 56 + 32 - -30 + 75 ^ 91 + 60 - 76 + 82;
        y.llIllllllI[119] = 0x51 ^ 0xC;
        y.llIllllllI[120] = 0x9F ^ 0xC1;
        y.llIllllllI[121] = 0x65 ^ 0x3A;
        y.llIllllllI[122] = 216 + 179 - 259 + 109 ^ 109 + 129 - 128 + 39;
        y.llIllllllI[123] = 8 ^ 0x4B ^ (0xA5 ^ 0x87);
        y.llIllllllI[124] = 0x32 ^ 0x50;
        y.llIllllllI[125] = 106 + 100 - 79 + 53;
        y.llIllllllI[126] = 0xE4 ^ 0x87;
        y.llIllllllI[127] = 176 + 63 - 131 + 93 ^ 3 + 116 - 109 + 162;
        y.llIllllllI[128] = 0xC8 ^ 0xAE;
        y.llIllllllI[129] = 55 + 25 - -114 + 2 ^ 125 + 62 - 96 + 72;
        y.llIllllllI[130] = 0x9E ^ 0xBD ^ (0xEA ^ 0xA1);
        y.llIllllllI[131] = 0x4E ^ 0x27;
        y.llIllllllI[132] = 0xFFFF8E0B & 0x7FF4;
        y.llIllllllI[133] = -(0xFFFFFF4F & 0x70B5) & (0xFFFFFCE7 & 0x7F7F);
        y.llIllllllI[134] = 0xF4 ^ 0x9B ^ (0xBA ^ 0xBF);
        y.llIllllllI[135] = 0x91 ^ 0xC7 ^ (0x7D ^ 0x40);
        y.llIllllllI[136] = 0x4F ^ 0x22 ^ 1;
        y.llIllllllI[137] = 0xAD ^ 0xB0 ^ (0x43 ^ 0x33);
        y.llIllllllI[138] = (0x1F ^ 0x36) + (31 + 4 - -116 + 24) - (153 + 33 - 15 + 14) + (122 + 19 - 68 + 86);
        y.llIllllllI[139] = (0x47 ^ 0x7B) + (97 + 88 - 116 + 73) - (83 + 158 - 108 + 54) + (156 + 22 - 104 + 106);
        y.llIllllllI[140] = (0x61 ^ 0x13) + (0xA6 ^ 0xB0) - (0x34 ^ 0x25) + (0x16 ^ 0x47);
        y.llIllllllI[141] = 0xEF ^ 0x80;
        y.llIllllllI[142] = -(0xFFFFFF7F & 0x7CA5) & (0xFFFFFFFF & 0x7FEE);
        y.llIllllllI[143] = -(0xFFFFFC27 & 0x37DB) & (0xFFFFBFFF & 0x77CF);
        y.llIllllllI[144] = 113 + 30 - -40 + 24 + ((0x48 ^ 5) & ~(0xDA ^ 0x97)) - (127 + 20 - 48 + 88) + (26 + 97 - 48 + 115);
        y.llIllllllI[145] = 0xB ^ 0x20 ^ (0x1F ^ 0x44);
        y.llIllllllI[146] = 0xB5 ^ 0xC4;
        y.llIllllllI[147] = (0x21 ^ 0x60) + (0x3D ^ 0x35) - -(5 ^ 0x65) + (0x8E ^ 0xBD);
        y.llIllllllI[148] = 0xEB ^ 0x99;
        y.llIllllllI[149] = 0x23 ^ 0x50;
        y.llIllllllI[150] = 0x5D ^ 0x29;
        y.llIllllllI[151] = 109 + 44 - 137 + 214;
        y.llIllllllI[152] = 220 + 134 - 272 + 158;
        y.llIllllllI[153] = 140 + 109 - 107 + 65 + (0xC3 ^ 0x94) - (179 + 167 - 152 + 58) + (91 + 60 - 78 + 135);
        y.llIllllllI[154] = 0xFFFFC11E & 0x3FE5;
        y.llIllllllI[155] = 116 + 126 - 54 + 41 ^ 101 + 117 - 134 + 60;
        y.llIllllllI[156] = 0x74 ^ 2;
        y.llIllllllI[157] = 114 + 186 - 299 + 237 ^ 143 + 131 - 207 + 86;
        y.llIllllllI[158] = 0x44 ^ 0x3D;
        y.llIllllllI[159] = 0xFA ^ 0xB8 ^ (0x54 ^ 0x6C);
        y.llIllllllI[160] = 0xBC ^ 0xC7;
        y.llIllllllI[161] = 0xB8 ^ 0x99 ^ (0x35 ^ 0x68);
        y.llIllllllI[162] = 0x20 ^ 0x5D;
        y.llIllllllI[163] = 0x67 ^ 0x19;
        y.llIllllllI[164] = (0xC0 ^ 0x84) + (0x18 ^ 0x4A) - (0x8A ^ 0x95) + (0x66 ^ 0x6E);
        y.llIllllllI[165] = (0xD6 ^ 0xB7) + (0xBB ^ 0xA8) - (1 ^ 0x2F) + (0xA1 ^ 0x9B);
        y.llIllllllI[166] = 106 + 33 - 48 + 38;
        y.llIllllllI[167] = -(0xFFFFFEF6 & 0x57EB) & (0xFFFFD7FF & 0x7FEF);
        y.llIllllllI[168] = -(0xFFFFC755 & 0x7CEB) & (0xFFFFEDFF & 0x5758);
        y.llIllllllI[169] = 0xFFFF8F7F & 0x71A2;
        y.llIllllllI[170] = -(0xFFFFFB7B & 0x1CCF) & (0xFFFFFFFF & 0x3DFE);
        y.llIllllllI[171] = -(0xFFFFFF72 & 0x11CF) & (0xFFFFFF7B & 0x1FFF);
        y.llIllllllI[172] = -(0xFFFFD797 & 0x7B7F) & (0xFFFFDFFE & Short.MAX_VALUE);
        y.llIllllllI[173] = (0xF7 ^ 0x90) + (0x30 ^ 0x2D) - (5 ^ 0xF) + (3 ^ 0xA);
        y.llIllllllI[174] = 16 + 106 - -1 + 9;
        y.llIllllllI[175] = 63 + 86 - 29 + 13;
        y.llIllllllI[176] = 115 + 45 - 39 + 13;
        y.llIllllllI[177] = 0xFFFFCEFE & 0x3F2D;
        y.llIllllllI[178] = 0xFFFFEFFA & 0x35DF;
        y.llIllllllI[179] = 90 + 10 - 87 + 122;
        y.llIllllllI[180] = 118 + 122 - 145 + 41;
        y.llIllllllI[181] = 14 + 72 - 24 + 75;
        y.llIllllllI[182] = 46 + 123 - 46 + 15;
        y.llIllllllI[183] = (0x4A ^ 0x65) + (0x25 ^ 0x3D) - -(0x4D ^ 0x50) + (0x5E ^ 0x79);
        y.llIllllllI[184] = 0xFFFFA97E & 0x57B7;
        y.llIllllllI[185] = 90 + 0 - 61 + 112;
        y.llIllllllI[186] = (0xC1 ^ 0xAB) + (0xD3 ^ 0xB1) - (181 + 41 - 179 + 157) + (101 + 80 - 170 + 127);
        y.llIllllllI[187] = 89 + 43 - 40 + 48 + (0xF4 ^ 0xC4) - (0x63 ^ 0x2D) + (0xA6 ^ 0x87);
        y.llIllllllI[188] = (0x96 ^ 0xC1) + (9 ^ 0x62) - (0x6A ^ 0x1B) + (0x32 ^ 0xD);
        y.llIllllllI[189] = (0x36 ^ 0x52) + (0x22 ^ 0x2B) - (0xFC ^ 0xBC) + (0xD4 ^ 0xB0);
        y.llIllllllI[190] = (0x53 ^ 0x13) + (5 ^ 0x39) - (0x6F ^ 0x34) + (0x1C ^ 0x6D);
        y.llIllllllI[191] = 79 + 23 - -21 + 24;
        y.llIllllllI[192] = (0x8C ^ 0x92) + (9 ^ 0x5B) - -(0x5F ^ 0x7C) + 1;
        y.llIllllllI[193] = (0x90 ^ 0xB9) + (61 + 29 - 31 + 83) - (46 + 86 - 76 + 72) + (0xFE ^ 0xA0);
        y.llIllllllI[194] = -(0xFFFFF793 & 0x7EEF) & (0xFFFFFFDF & 0x77E2);
        y.llIllllllI[195] = 22 + 145 - 95 + 78;
        y.llIllllllI[196] = 45 + 40 - 1 + 67;
        y.llIllllllI[197] = (0xA8 ^ 0xB2) + (0xAD ^ 0x98) - (0x6D ^ 0x5C) + (0xC3 ^ 0xB9);
        y.llIllllllI[198] = (0x42 ^ 0x5D) + (0xD9 ^ 0xA9) - (0x13 ^ 0xA) + (0x47 ^ 0x64);
        y.llIllllllI[199] = 67 + 13 - -66 + 8;
        y.llIllllllI[200] = (0x12 ^ 0x24) + (0x97 ^ 0x98) - -(0x52 ^ 0x65) + (0x60 ^ 0x7F);
        y.llIllllllI[201] = 76 + 38 - 25 + 67;
        y.llIllllllI[202] = (0x2B ^ 0x45) + (0x73 ^ 0x22) - (0x1D ^ 0x77) + (0x3C ^ 0x74);
        y.llIllllllI[203] = (0xC ^ 0x6F) + (109 + 27 - 13 + 28) - (0xFC ^ 0x94) + (0x43 ^ 0x4F);
        y.llIllllllI[204] = (0x12 ^ 0x59) + (0xBA ^ 0x99) - (0xF0 ^ 0xBA) + (0x17 ^ 0x6C);
        y.llIllllllI[205] = 14 + 112 - -4 + 3 + (0xE1 ^ 0xAC) - (26 + 12 - -113 + 6) + (0x72 ^ 0x19);
        y.llIllllllI[206] = 14 + 79 - 79 + 147;
        y.llIllllllI[207] = 142 + 4 - 65 + 71 + (6 ^ 0) - (0x31 ^ 0x3C) + (3 ^ 0x12);
        y.llIllllllI[208] = 142 + 10 - 113 + 121 + (0x98 ^ 0xBF) - (4 + 51 - -29 + 97) + (91 + 68 - 58 + 44);
        y.llIllllllI[209] = (0xD ^ 0xA) + (0x1E ^ 0x10) - -(0xF0 ^ 0x9F) + (0xA7 ^ 0x87);
        y.llIllllllI[210] = 105 + 135 - 230 + 155;
        y.llIllllllI[211] = 24 + 1 - -48 + 93;
        y.llIllllllI[212] = (0 ^ 0x26) + (0x3C ^ 0x21) - -(5 ^ 0x2E) + (1 ^ 0x38);
        y.llIllllllI[213] = (0x95 ^ 0xC5) + (0x59 ^ 0x2E) - (126 + 4 - 20 + 40) + (0xCE ^ 0xB9);
        y.llIllllllI[214] = 35 + 46 - 31 + 119;
        y.llIllllllI[215] = (0x1F ^ 4) + (3 & ~3) - -(0x51 ^ 0x15) + (0x69 ^ 0x25);
        y.llIllllllI[216] = -(0xFFFFF2CF & 0x2DB5) & (0xFFFFEFEF & 0x3EB5);
        y.llIllllllI[217] = -(0xFFFF9FE9 & 0x635F) & (0xFFFFAFFF & 0x5FFE);
        y.llIllllllI[218] = -(0xFFFFF14D & 0x3EB3) & (0xFFFFFFB3 & 0x3E7E);
        y.llIllllllI[219] = 0xFFFFCDE7 & 0x3EFD;
        y.llIllllllI[220] = 0xFFFFFFFF & 0xE36;
        y.llIllllllI[221] = 0xFFFFCFBD & 0x3E72;
        y.llIllllllI[222] = 0xFFFFFEFA & 0xDBF;
        y.llIllllllI[223] = 0xFFFFFF3F & 0xEF3;
        y.llIllllllI[224] = -(0xFFFFF787 & 0xB7B) & (0xFFFFBFEF & 0x4FFB);
        y.llIllllllI[225] = -(0xFFFFC7E9 & 0x7957) & (0xFFFFEF7F & 0x5FF7);
        y.llIllllllI[226] = -(0xFFFFE39B & 0x7DE6) & (0xFFFFFFBF & 0x6FF5);
        y.llIllllllI[227] = -(0xFFFFFB21 & 0x57DF) & (0xFFFFFFFD & 0x5FB7);
        y.llIllllllI[228] = 80 + 153 - 135 + 62 + (0x40 ^ 0x49) - (0x6D ^ 0x60) + (0x33 ^ 0x23);
        y.llIllllllI[229] = (0xB ^ 0x3B) + (0x95 ^ 0xA3) - -(0xB8 ^ 0xB1) + (0xFC ^ 0xC2);
        y.llIllllllI[230] = (0xA3 ^ 0xB3) + (0x5A ^ 0x50) - -(0x80 ^ 0xB6) + (0x5A ^ 4);
        y.llIllllllI[231] = (0xBF ^ 0x8A) + (0xDD ^ 0x99) - (0x1A ^ 0x28) + (0x7B ^ 0x13);
        y.llIllllllI[232] = 35 + 163 - 167 + 145;
        y.llIllllllI[233] = 101 + 34 - 88 + 93 + (0x33 ^ 0x52) - (179 + 192 - 236 + 97) + (23 + 44 - 39 + 144);
        y.llIllllllI[234] = 153 + 133 - 156 + 48;
        y.llIllllllI[235] = 66 + 102 - 2 + 13;
        y.llIllllllI[236] = 10 + 59 - -76 + 7 + (0x4D ^ 0x7D) - (0x68 ^ 0x21) + (0x56 ^ 0x60);
        y.llIllllllI[237] = 178 + 65 - 235 + 174;
        y.llIllllllI[238] = 40 + 152 - 65 + 56;
        y.llIllllllI[239] = -(0xFFFFCABC & 0x754F) & (0xFFFFCCFF & 0x7FBB);
        y.llIllllllI[240] = 0xFFFFDF2E & 0x2EFB;
        y.llIllllllI[241] = 0xFFFFF597 & 0x2FFB;
        y.llIllllllI[242] = 59 + 15 - -41 + 20 + (28 + 139 - 29 + 30) - (73 + 19 - -33 + 30) + (7 ^ 0x23);
        y.llIllllllI[243] = 134 + 10 - 7 + 48;
        y.llIllllllI[244] = (0x5B ^ 0x34) + (0x82 ^ 0xAA) - (0x57 ^ 0x10) + (0xF1 ^ 0x9B);
        y.llIllllllI[245] = 185 + 174 - 196 + 24;
        y.llIllllllI[246] = 33 + 72 - -79 + 4;
        y.llIllllllI[247] = (0xC0 ^ 0xB3) + (0xC5 ^ 0x8C) - (0xD6 ^ 0x8B) + (0xDF ^ 0x81);
        y.llIllllllI[248] = 89 + 180 - 181 + 103;
        y.llIllllllI[249] = (0x40 ^ 4) + (48 + 110 - 53 + 26) - (0x95 ^ 0xBD) + (0x9A ^ 0xBB);
        y.llIllllllI[250] = 28 + 166 - 5 + 4;
        y.llIllllllI[251] = 0xFFFFBDF7 & 0x4EBF;
        y.llIllllllI[252] = 0xFFFF8DF4 & 0x7EBF;
        y.llIllllllI[253] = 0xFFFFEDBE & 0x1EF9;
        y.llIllllllI[254] = 43 + 131 - -20 + 0;
        y.llIllllllI[255] = -(0xFFFF9D73 & 0x63BD) & (0xFFFFCFF7 & 0x77FE);
        y.llIllllllI[256] = 100 + 159 - 126 + 63;
        y.llIllllllI[257] = 112 + 104 - 177 + 158;
        y.llIllllllI[258] = (0xCC ^ 0x97) + (0x1D ^ 0x14) - (0x12 ^ 0x25) + (58 + 43 - -21 + 31);
        y.llIllllllI[259] = (0xFC ^ 0xA4) + (0x5D ^ 0x3A) - (122 + 125 - 174 + 98) + (1 + 55 - -6 + 117);
        y.llIllllllI[260] = 96 + 55 - 54 + 30 + (0x6C ^ 0x2D) - (0x3B ^ 0x41) + (48 + 77 - 22 + 28);
        y.llIllllllI[261] = (0x1C ^ 0x56) + (0x1A ^ 0x6E) - (0x67 ^ 0x3D) + (0x25 ^ 0x43);
        y.llIllllllI[262] = (0xD4 ^ 0x80) + (0x5A ^ 0x12) - (5 ^ 0x44) + (0x32 ^ 0x42);
        y.llIllllllI[263] = (0xEE ^ 0xA0) + (75 + 108 - 112 + 68) - (54 + 157 - 60 + 12) + (115 + 103 - 191 + 123);
        y.llIllllllI[264] = 53 + 124 - 165 + 193;
        y.llIllllllI[265] = 141 + 82 - 88 + 71;
        y.llIllllllI[266] = 126 + 194 - 219 + 106;
        y.llIllllllI[267] = 0xFFFFDE3F & 0x2FFB;
        y.llIllllllI[268] = -(0xFFFFE7E6 & 0x7A1F) & (0xFFFFFEFF & 0x6FEF);
        y.llIllllllI[269] = 102 + 17 - 51 + 140;
        y.llIllllllI[270] = 3 + 9 - -100 + 18 + (0x3C ^ 0x4D) - (133 + 140 - 155 + 82) + (107 + 83 - 112 + 88);
        y.llIllllllI[271] = 159 + 53 - 161 + 139 + (127 + 14 - 82 + 91) - (35 + 49 - 70 + 144) + (0x15 ^ 8);
        y.llIllllllI[272] = 178 + 2 - 162 + 183 + (108 + 85 - 100 + 57) - (238 + 52 - 144 + 101) + (0x51 ^ 0x3D);
        y.llIllllllI[273] = 38 + 99 - -54 + 22;
        y.llIllllllI[274] = 1 + 16 - -161 + 11 + (0x2D ^ 0x4B) - (60 + 107 - 58 + 123) + (77 + 62 - -3 + 13);
        y.llIllllllI[275] = 0xFFFF9EAF & 0x6F5A;
        y.llIllllllI[276] = 0xFFFF8DCF & 0x7EB3;
        y.llIllllllI[277] = 81 + 68 - 66 + 67 + (0x92 ^ 0x82) - (0x77 ^ 0x1D) + (56 + 98 - 116 + 117);
        y.llIllllllI[278] = 62 + 70 - -21 + 11 + (0x8B ^ 0x86) - (64 + 54 - 106 + 129) + (125 + 36 - 16 + 35);
        y.llIllllllI[279] = 79 + 33 - 89 + 114 + (0x1F ^ 0x7A) - (0xE7 ^ 0xAB) + (0xB0 ^ 0x87);
        y.llIllllllI[280] = 0xFFFFAE17 & 0x5FEE;
        y.llIllllllI[281] = -(0xFFFFF51F & 0x6AFB) & (0xFFFFEEFF & 0x7D7F);
        y.llIllllllI[282] = -(0xFFFFFFEF & 0x3179) & (0xFFFFBF7F & 0x7FEF);
        y.llIllllllI[283] = 0xFFFF8DFD & 0x7E6F;
        y.llIllllllI[284] = 192 + 129 - 159 + 56;
        y.llIllllllI[285] = 149 + 152 - 112 + 30;
        y.llIllllllI[286] = 124 + 53 - -35 + 9;
        y.llIllllllI[287] = (7 ^ 0x15) + (23 + 56 - -41 + 92) - (0xBB ^ 0x99) + (0x2F ^ 0x35);
        y.llIllllllI[288] = 56 + 171 - 186 + 182;
        y.llIllllllI[289] = (0xB2 ^ 0xBB) + (0x3E ^ 0x77) - -(0x3F ^ 0x1C) + (0xE3 ^ 0x88);
        y.llIllllllI[290] = 0xFFFFCE7D & 0x3F83;
        y.llIllllllI[291] = 0xFFFFCCFB & 0x3F66;
        y.llIllllllI[292] = 0xFFFFEF34 & 0x1ECF;
        y.llIllllllI[293] = 0xFFFFDF9C & 0x2CEB;
        y.llIllllllI[294] = -(0xFFFFA8F9 & 0x7797) & (0xFFFFFCFF & 0x2FF7);
        y.llIllllllI[295] = -(0xFFFFFD5D & 0x73BB) & (0xFFFFFF1F & 0x7FFB);
        y.llIllllllI[296] = -(0xFFFFC393 & 0x7F7D) & (0xFFFFEF7B & 0x5FFE);
        y.llIllllllI[297] = -(0xFFFFB39D & 0x4F63) & (0xFFFFDF7F & 0x2FEE);
        y.llIllllllI[298] = -(0xFFFFA7C7 & 0x597B) & (0xFFFFBFF7 & 0x4F4F);
        y.llIllllllI[299] = -(0xFFFFFFCE & 0x70BF) & (0xFFFFFFFF & 0x7CFF);
        y.llIllllllI[300] = -(0xFFFFB95D & 0x56AB) & (0xFFFFBF7F & 0x5CFF);
        y.llIllllllI[301] = -(0xFFFFDA5D & 0x75A3) & (0xFFFFFCFB & 0x5F7F);
        y.llIllllllI[302] = -(0xFFFFF9FF & 0x376B) & (0xFFFFFDFB & 0x3FEF);
        y.llIllllllI[303] = 0xFFFFDFBD & 0x2CC7;
        y.llIllllllI[304] = -(0xFFFFF367 & 0x6F99) & (0xFFFFFFBB & 0x6FCD);
        y.llIllllllI[305] = 73 + 106 - 100 + 101 + (11 + 75 - 43 + 140) - (72 + 96 - 87 + 158) + (0x74 ^ 0x11);
        y.llIllllllI[306] = 95 + 212 - 90 + 9;
        y.llIllllllI[307] = (0x54 ^ 0x2E) + (209 + 131 - 321 + 202) - (35 + 213 - 213 + 191) + (0x66 ^ 8);
        y.llIllllllI[308] = 136 + 125 - 198 + 165;
        y.llIllllllI[309] = (0xEC ^ 0xB1) + (0xEB ^ 0x8D) - (0xAA ^ 0x8B) + (0xF2 ^ 0xB1);
        y.llIllllllI[310] = (2 ^ 0x14) + (0xB8 ^ 0xC5) - (0x45 ^ 0x77) + (97 + 19 - -1 + 17);
        y.llIllllllI[311] = (0x1D ^ 0x19) + (0x48 ^ 0x58) - -(5 + 12 - -31 + 113) + (8 ^ 0x3B);
        y.llIllllllI[312] = (0x18 ^ 0x72) + (70 + 113 - 56 + 19) - (0x75 ^ 0x2E) + (0x4D ^ 5);
        y.llIllllllI[313] = -(0xFFFFDAD5 & 0x652F) & (0xFFFFFEAF & 0x4F56);
        y.llIllllllI[314] = -(0xFFFFD367 & 0x3CD9) & (0xFFFF9FCF & 0x7CFF);
        y.llIllllllI[315] = 0xFFFFBC9E & 0x4FFF;
        y.llIllllllI[316] = 12 + 22 - 25 + 187 + (0x63 ^ 0x44) - (0x41 ^ 0x49) + (0xA4 ^ 0xA3);
        y.llIllllllI[317] = 67 + 5 - -76 + 48 + (26 + 62 - 85 + 140) - (19 + 15 - -66 + 56) + (0x5A ^ 0x6E);
        y.llIllllllI[318] = 1 + 56 - -75 + 73 + (9 + 132 - 77 + 114) - (0xFFFF91BE & 0x6F67) + (26 + 5 - -103 + 13);
        y.llIllllllI[319] = 164 + 125 - 110 + 40 + (0x31 ^ 0x34) - (125 + 76 - 181 + 163) + (86 + 102 - 111 + 119);
        y.llIllllllI[320] = 0xFFFFCEBF & 0x3DDA;
        y.llIllllllI[321] = (0x34 ^ 3) + (0 ^ 0x72) - -(0x62 ^ 0x6A) + (0x22 ^ 0x1F);
        y.llIllllllI[322] = (0xD8 ^ 0xBA) + (0x80 ^ 0x99) - (0x66 ^ 0x74) + (64 + 79 - 43 + 34);
        y.llIllllllI[323] = 199 + 234 - 246 + 54;
        y.llIllllllI[324] = 0xFFFF8DBA & 0x7EF7;
        y.llIllllllI[325] = 183 + 102 - 197 + 154;
        y.llIllllllI[326] = (0xE ^ 0x14) + (188 + 58 - 191 + 174) - (0xD4 ^ 0xAC) + (0x57 ^ 0x3B);
        y.llIllllllI[327] = (5 ^ 0x35) + (52 + 59 - -2 + 32) - (39 + 26 - -40 + 40) + (116 + 76 - 127 + 131);
        y.llIllllllI[328] = (0xED ^ 0xA8) + (0x80 ^ 0x94) - -(0x88 ^ 0x8D) + (131 + 107 - 140 + 53);
        y.llIllllllI[329] = 0xFFFFCFBD & 0x3CFB;
        y.llIllllllI[330] = 0xFFFFEE9B & 0x1F6F;
        y.llIllllllI[331] = -(0xFFFFD11F & 0x7EE3) & (0xFFFFDCFF & 0x7FEF);
        y.llIllllllI[332] = (0xB4 ^ 0xA7) + (78 + 94 - 157 + 128) - (0xC ^ 0x32) + (44 + 92 - 61 + 71);
        y.llIllllllI[333] = 167 + 128 - 205 + 89 + (0x27 ^ 0x2E) - (0x71 ^ 0x20) + (126 + 84 - 182 + 112);
        y.llIllllllI[334] = 143 + 27 - 144 + 136 + (52 + 46 - -38 + 104) - (9 + 227 - 205 + 204) + (0x10 ^ 0x41);
        y.llIllllllI[335] = 94 + 203 - 234 + 186;
        y.llIllllllI[336] = 0xFFFFEDFF & 0x1FBE;
        y.llIllllllI[337] = -1 & (0xFFFF8DFE & Short.MAX_VALUE);
        y.llIllllllI[338] = 0xFFFFFDD6 & 0xF2D;
        y.llIllllllI[339] = 47 + 193 - 90 + 101;
        y.llIllllllI[340] = 156 + 10 - 45 + 131;
        y.llIllllllI[341] = 91 + 185 - 27 + 4;
        y.llIllllllI[342] = 0 + 27 - -63 + 164;
        y.llIllllllI[343] = (0xDD ^ 0xB3) + (156 + 134 - 92 + 10) - (0xFFFFF33F & 0xDED) + (52 + 110 - 12 + 88);
        y.llIllllllI[344] = 0xFFFFEBA0 & 0x155F;
        y.llIllllllI[345] = 0xFFFFE159 & 0x1FA7;
        y.llIllllllI[346] = -(0xFFFFF5FA & 0x6B67) & (0xFFFFFFED & 0x6F7F);
        y.llIllllllI[347] = 0xFFFFDCB7 & 0x2FCC;
        y.llIllllllI[348] = 0xFFFFEEEF & 0x1F1E;
        y.llIllllllI[349] = 0xFFFFEF6F & 0x1E9F;
        y.llIllllllI[350] = 0xFFFFCDD1 & 0x3EAE;
        y.llIllllllI[351] = 0xFFFF9F1F & 0x6EF4;
        y.llIllllllI[352] = -(0xFFFFCBEB & 0x7775) & (0xFFFFFFFF & 0x4FEE);
        y.llIllllllI[353] = 0xFFFF9D9E & 0x6EF7;
        y.llIllllllI[354] = 0xFFFFACB3 & 0x5FDF;
        y.llIllllllI[355] = 0xFFFFEEBF & 0x1F5F;
        y.llIllllllI[356] = 0xFFFFEEDF & 0x1DB2;
        y.llIllllllI[357] = 0xFFFFFE3D & 0xFDF;
        y.llIllllllI[358] = -(0xFFFFFB6F & 0x75D1) & (0xFFFFFFFF & 0x7F69);
        y.llIllllllI[359] = -(0xFFFF9763 & 0x7A9D) & (0xFFFFFEBD & 0x1FD7);
        y.llIllllllI[360] = 0xFFFFEFEF & 0x1C79;
        y.llIllllllI[361] = 0xFFFFFCFF & 0xF7E;
        y.llIllllllI[362] = -(0xFFFFA1EB & 0x7EF6) & (0xFFFFBFF5 & 0x6EFB);
        y.llIllllllI[363] = -(178 + 138 - 286 + 175) & (0xFFFFEEDF & 0x1FFF);
        y.llIllllllI[364] = 0xFFFFEECF & 0x1F3D;
        y.llIllllllI[365] = -(0xFFFFEF79 & 0x50A7) & (0xFFFFFCFD & 0x4FAF);
        y.llIllllllI[366] = -(0xFFFFFDD7 & 0x13BF) & (0xFFFFFFFF & 0x1F9F);
        y.llIllllllI[367] = -(0xFFFFE9BF & 0x77E3) & (0xFFFFEFEA & 0x7FBF);
        y.llIllllllI[368] = -(0xFFFFF1FF & 0x7F6F) & (0xFFFFFFFF & 0x7F7F);
        y.llIllllllI[369] = -(0xFFFFB3ED & 0x7DD7) & (0xFFFFBFFD & 0x7FDF);
        y.llIllllllI[370] = -(0xFFFFFEC3 & 0x11BD) & (0xFFFF9EFF & 0x7F9B);
        y.llIllllllI[371] = -(74 + 114 - 116 + 153) & (0xFFFFDEFF & 0x2FF8);
        y.llIllllllI[372] = -(0xFFFFF33F & 0x2DC1) & (0xFFFFAD7F & Short.MAX_VALUE);
        y.llIllllllI[373] = -(0xFFFFFDFB & 0x335D) & (0xFFFFFF7F & 0x3FFD);
        y.llIllllllI[374] = 0xFFFFFF26 & 0xEFF;
        y.llIllllllI[375] = 0xFFFFCEFA & 0x3D8F;
        y.llIllllllI[376] = 0xFFFFBFE4 & 0x4E3F;
        y.llIllllllI[377] = 0xFFFFECF1 & 0x1F9F;
        y.llIllllllI[378] = 0xFFFFB582 & 0x4B7F;
        y.llIllllllI[379] = -(0xFFFFC8A7 & 0x777D) & (0xFFFFC7EF & 0x7937);
        y.llIllllllI[380] = 0xFFFFC15D & 0x3FA7;
        y.llIllllllI[381] = 0xFFFFBB6E & 0x4597;
        y.llIllllllI[382] = -(0xFFFFBCEF & 0x7B79) & (0xFFFFFEFE & Short.MAX_VALUE);
        y.llIllllllI[383] = 0xFFFF89CF & 0x7737;
        y.llIllllllI[384] = 0xFFFFA5E9 & 0x5B1E;
        y.llIllllllI[385] = -(0xFFFFDBF4 & 0x3D0F) & (0xFFFFDFFB & 0x7F9F);
        y.llIllllllI[386] = 0xFFFFE78B & 0x197D;
        y.llIllllllI[387] = -(0xFFFFFAB7 & 0x7FFE) & (0xFFFFFBBF & Short.MAX_VALUE);
        y.llIllllllI[388] = -(0xFFFFFFCF & 0x2875) & (0xFFFFEF6F & 0x39DF);
        y.llIllllllI[389] = -(0xFFFFF7F1 & 0x6EAF) & (0xFFFFEFAF & 0x77FC);
        y.llIllllllI[390] = 0xFFFFCF0D & 0x31FF;
        y.llIllllllI[391] = -(0xFFFFCFB7 & 0x7C59) & (0xFFFFFFDF & 0x4D3F);
        y.llIllllllI[392] = 0xFFFFEEF7 & 0x57D8;
        y.llIllllllI[393] = -(0xFFFF8BFF & 0x7CAD) & (0xFFFFCBFE & 0x3DBD);
        y.llIllllllI[394] = 0xFFFFA933 & 0x57DD;
        y.llIllllllI[395] = 0xFFFFEFD3 & 0x56FD;
        y.llIllllllI[396] = -(0xFFFFDFDF & 0x3EE1) & (0xFFFF9FF2 & 0x7FDF);
        y.llIllllllI[397] = -(0xFFFFE7EB & 0x5E1D) & (0xFFFFD7FB & 0x6F1F);
        y.llIllllllI[398] = 0xFFFFDDD7 & 0x233C;
        y.llIllllllI[399] = 0xFFFFF195 & 0xF7F;
        y.llIllllllI[400] = -(0xFFFFBB6B & 0x76DE) & (0xFFFFF35F & 0x3FFF);
        y.llIllllllI[401] = 0xFFFF8537 & 0x7BDF;
        y.llIllllllI[402] = -(0xFFFFFD33 & 0x16ED) & (0xFFFFBFF9 & 0x553F);
        y.llIllllllI[403] = -(0xFFFFFCED & 0x7FF7) & (0xFFFFFFFF & 0x7DFE);
        y.llIllllllI[404] = 0xFFFFAB1F & 0x55FB;
        y.llIllllllI[405] = 0xFFFFFD9E & 0x37D;
        y.llIllllllI[406] = 0xFFFFE3FF & 0x1D1D;
        y.llIllllllI[407] = -(0xFFFFFEF3 & 0x7FEE) & (0xFFFFFFFF & Short.MAX_VALUE);
        y.llIllllllI[408] = -(0xFFFFF8F3 & 0x2F6D) & (0xFFFFBD7F & 0x6BFF);
        y.llIllllllI[409] = 0xFFFFB973 & 0x47AC;
        y.llIllllllI[410] = -(0xFFFFAA97 & 0x7DED) & (0xFFFFABBD & 0x7DE7);
        y.llIllllllI[411] = -(0xFFFFFFDF & 0x3EB1) & (0xFFFFBFFB & 0x7FB7);
        y.llIllllllI[412] = 0xFFFFEFB7 & 0x56EB;
        y.llIllllllI[413] = 0xFFFF812C & 0x7FF7;
        y.llIllllllI[414] = -(0xFFFFFBB3 & 0x1CCD) & (0xFFFFBDFD & 0x5BA7);
        y.llIllllllI[415] = -(0xFFFFDED5 & 0x7F3B) & (0xFFFFDFFE & 0x7F37);
        y.llIllllllI[416] = 0xFFFFDFF7 & 0x212F;
        y.llIllllllI[417] = -(0xFFFFFBBE & 0x6457) & (0xFFFFFD3D & 0x63FF);
        y.llIllllllI[418] = -(0xFFFFFB75 & 0x69F) & (0xFFFFCB7F & 0x37BD);
        y.llIllllllI[419] = -(0xFFFFCFE9 & 0x38D7) & (0xFFFF8DEA & 0x7BFF);
        y.llIllllllI[420] = -(0xFFFFEFB5 & 0x7E5F) & (0xFFFFFFBF & 0x6F7F);
        y.llIllllllI[421] = 0xFFFF953F & 0x6BED;
        y.llIllllllI[422] = 0xFFFFBFBF & 0x416E;
        y.llIllllllI[423] = -(0xFFFFF80B & 0x57F5) & (0xFFFFD9FF & 0x772F);
        y.llIllllllI[424] = 0xFFFFD7F6 & 0x2939;
        y.llIllllllI[425] = -(0xFFFFF4EB & 0x3BDF) & (0xFFFFB5FF & 0x7BFB);
        y.llIllllllI[426] = 0xFFFFD3F3 & 0x2D3E;
        y.llIllllllI[427] = -(0xFFFFFEDD & 0x7FAF) & (0xFFFFFFFF & 0x7FBF);
        y.llIllllllI[428] = 0xFFFFDD7E & 0x23B5;
        y.llIllllllI[429] = -(0xFFFFFE7B & 0x7BCF) & (0xFFFFFFFF & 0x7B7F);
        y.llIllllllI[430] = -(0xFFFFBFDD & 0x7AAB) & (0xFFFFFFFF & 0x3BBF);
        y.llIllllllI[431] = 0xFFFFA3BE & 0x5D79;
        y.llIllllllI[432] = -(0xFFFFECC7 & 0x3B79) & (0xFFFFFFED & 0x6EFB);
        y.llIllllllI[433] = -(0xFFFFFDA3 & 0x4ADF) & (0xFFFFCFFF & 0x79BB);
        y.llIllllllI[434] = 0xFFFFFBBE & 0x57B;
        y.llIllllllI[435] = -(0xFFFFB7B1 & 0x4E4F) & (0xFFFFCFFB & 0x373F);
        y.llIllllllI[436] = 0xFFFFEDFD & 0x133E;
        y.llIllllllI[437] = 0xFFFFE77D & 0x19BF;
        y.llIllllllI[438] = -(0xFFFFCED2 & 0x7FAF) & (0xFFFFFFFF & 0x4FBF);
        y.llIllllllI[439] = -(0xFFFFF759 & 0x38E7) & (0xFFFFBDFF & 0x737F);
        y.llIllllllI[440] = 0xFFFFE955 & 0x17EB;
        y.llIllllllI[441] = -(0xFFFFFEB9 & 0x5DD7) & (0xFFFFFFD2 & 0x5DFF);
        y.llIllllllI[442] = 0xFFFFA9DF & 0x5763;
        y.llIllllllI[443] = -(0xFFFFFED3 & 0x652F) & (0xFFFFF56F & 0x6FD6);
        y.llIllllllI[444] = -(0xFFFFFEFF & 0x6BB1) & (0xFFFFEBFF & 0x7FF5);
        y.llIllllllI[445] = -(0xFFFFDCBA & 0x73FF) & (0xFFFFDBFF & 0x75FF);
        y.llIllllllI[446] = 0xFFFFE7BD & 0x5EEF;
        y.llIllllllI[447] = 0xFFFFDD7F & 0x23C7;
        y.llIllllllI[448] = 0xFFFF89DC & 0x776B;
        y.llIllllllI[449] = -(0xFFFFF6AF & 0x2FF1) & (0xFFFFA7F9 & 0x7FEF);
        y.llIllllllI[450] = 0xFFFF814E & 0x7FFB;
        y.llIllllllI[451] = 0xFFFFA76B & 0x59DF;
        y.llIllllllI[452] = 0xFFFFA95C & 0x57EF;
        y.llIllllllI[453] = -(0xFFFFFED7 & 0xFBB) & (0xFFFFEFDF & 0x1FFF);
        y.llIllllllI[454] = -(0xFFFFFC2D & 0x7FF3) & (0xFFFFFFEF & 0x7D7E);
        y.llIllllllI[455] = 0xFFFFCDCF & 0x337F;
        y.llIllllllI[456] = 0xFFFFD7F5 & 0x6EBB;
        y.llIllllllI[457] = -(0xFFFFF69F & 0x5FF0) & (0xFFFFDFDF & 0x77FF);
        y.llIllllllI[458] = 0xFFFFB571 & 0x4BDF;
        y.llIllllllI[459] = 0xFFFF9373 & 0x6DDE;
        y.llIllllllI[460] = 0xFFFFC5F7 & 0x3B5B;
        y.llIllllllI[461] = -(0xFFFFEF27 & 0x3CFB) & (0xFFFFFDFE & 0x2F77);
        y.llIllllllI[462] = 0xFFFFBDD7 & 0x437D;
        y.llIllllllI[463] = 0xFFFF8BFE & 0x7557;
        y.llIllllllI[464] = -(0xFFFFEE71 & 0x378F) & (0xFFFFA77F & 0x7FD7);
        y.llIllllllI[465] = -(0xFFFFAFDB & 0x7E26) & (0xFFFFFF79 & 0x2FDF);
        y.llIllllllI[466] = 0xFFFFBBDB & 0x457D;
        y.llIllllllI[467] = -(0xFFFFFEA6 & Short.MAX_VALUE) & (0xFFFFFFFF & Short.MAX_VALUE);
        y.llIllllllI[468] = -(0xFFFF8A2D & 0x7FD3) & (0xFFFFEFFB & 0x1B5F);
        y.llIllllllI[469] = 0xFFFFB9DE & 0x477D;
        y.llIllllllI[470] = 0xFFFFC1FD & 0x3F5F;
        y.llIllllllI[471] = 0xFFFFEB7F & 0x15DE;
        y.llIllllllI[472] = -(0xFFFFEFBD & 0x5AC3) & (0xFFFFCFFF & 0x7BDF);
        y.llIllllllI[473] = -(0xFFFFFFBD & 0x76CB) & (0xFFFFFFFA & 0x77ED);
        y.llIllllllI[474] = 0xFFFFB5FB & 0x4B65;
        y.llIllllllI[475] = 0xFFFFB763 & 0x49FE;
        y.llIllllllI[476] = -(0xFFFFF7BF & 0x3ED9) & (0xFFFFB7FF & 0x7FFB);
        y.llIllllllI[477] = -(0xFFFFD5BC & 0x3EC7) & (0xFFFFB5FF & 0x5FE7);
        y.llIllllllI[478] = 0xFFFFF3EF & 0xD75;
        y.llIllllllI[479] = 0xFFFFFB76 & 0x5EF;
        y.llIllllllI[480] = -(0xFFFFB7C9 & 0x7ABF) & (0xFFFFFBFF & 0x37EF);
        y.llIllllllI[481] = 0xFFFFA1EF & 0x5F78;
        y.llIllllllI[482] = -(0xFFFFBCC5 & 0x63BB) & (0xFFFFAFE7 & 0x7EBF);
        y.llIllllllI[483] = 0xFFFFDCBF & 0x2FD7;
        y.llIllllllI[484] = -(0xFFFF82D7 & 0x7FBB) & (0xFFFFCBFB & 0x37FF);
        y.llIllllllI[485] = 0xFFFFC7BF & 0x7EFD;
        y.llIllllllI[486] = 0xFFFFADEE & 0x537B;
        y.llIllllllI[487] = 0xFFFFEE6B & 0x1FB7;
        y.llIllllllI[488] = -(0xFFFFF887 & 0x37F9) & (0xFFFFF9EF & 0x37FB);
        y.llIllllllI[489] = -(0xFFFFB3F3 & 0x5D4D) & (0xFFFFD7FF & Short.MAX_VALUE);
        y.llIllllllI[490] = 0xFFFFA37E & 0x5DED;
        y.llIllllllI[491] = -(0xFFFFEDDF & 0x53A3) & (0xFFFFEFBE & 0x5FEB);
        y.llIllllllI[492] = -(0xFFFFFB5E & 0x7B9) & (0xFFFF8FBF & Short.MAX_VALUE);
        y.llIllllllI[493] = 0xFFFFAF6D & 0x51FF;
        y.llIllllllI[494] = 0xFFFFDFC7 & 0x66F9;
        y.llIllllllI[495] = -(0xFFFFBEE6 & 0x6F9B) & (0xFFFFAFEF & Short.MAX_VALUE);
        y.llIllllllI[496] = -(0xFFFFB35D & 0x6CE3) & (0xFFFFEDFE & 0x3EE7);
        y.llIllllllI[497] = -(0xFFFFEEAB & 0x335F) & (0xFFFFFEFF & 0x2FAF);
        y.llIllllllI[498] = 0xFFFFB56F & 0x4BFF;
        y.llIllllllI[499] = -(0xFFFFFADF & 0x7FA9) & (0xFFFFFFFC & 0x7BFB);
        y.llIllllllI[500] = 0xFFFFEF7D & 0x11F3;
        y.llIllllllI[501] = -(0xFFFFF78F & 0x7AF9) & (0xFFFFF7FF & 0x7BFA);
        y.llIllllllI[502] = 0xFFFF9973 & 0x67FF;
        y.llIllllllI[503] = -(0xFFFFAF23 & 0x7EDF) & (0xFFFFEFFE & 0x3F77);
        y.llIllllllI[504] = 0xFFFF8DF5 & 0x737F;
        y.llIllllllI[505] = -(0xFFFFA3C2 & 0x7EBF) & (0xFFFFAFF7 & 0x73FF);
        y.llIllllllI[506] = 0xFFFFF177 & 0xFFF;
        y.llIllllllI[507] = -(0xFFFFABB7 & 0x7CCE) & (0xFFFFEBFD & 0x3DFF);
        y.llIllllllI[508] = -(0xFFFFADBF & 0x724B) & (0xFFFFF7FF & 0x6ECE);
        y.llIllllllI[509] = -(0xFFFFDB1B & 0x6CE7) & (0xFFFFDB7B & 0x6DFF);
        y.llIllllllI[510] = 0xFFFFB9FA & 0x477F;
        y.llIllllllI[511] = -(0xFFFFB6E9 & 0x5B97) & (0xFFFFDFFF & 0x33FB);
        y.llIllllllI[512] = 0xFFFFAD7C & 0x53FF;
        y.llIllllllI[513] = 0xFFFF8F7D & 0x71FF;
        y.llIllllllI[514] = -(0xFFFFF6FB & 0x4D06) & (0xFFFFFFFF & 0x457F);
        y.llIllllllI[515] = 0xFFFF8F7F & 0x71FF;
        y.llIllllllI[516] = 0xFFFFEFD6 & 0x11A9;
        y.llIllllllI[517] = 0xFFFFF991 & 0x7EF;
        y.llIllllllI[518] = -(0xFFFF9BCB & 0x753D) & (0xFFFF9FFF & 0x7DAB);
        y.llIllllllI[519] = -(0xFFFFF1C7 & 0x7EFD) & (0xFFFFFEFE & 0x7FFD);
        y.llIllllllI[520] = -(0xFFFFFB33 & 0x26CD) & (0xFFFFF3A3 & 0x2FDE);
        y.llIllllllI[521] = 0xFFFFC9C7 & 0x37BB;
        y.llIllllllI[522] = 0xFFFFFE3B & 0xFEF;
        y.llIllllllI[523] = 0xFFFFCFBD & 0x31C6;
        y.llIllllllI[524] = 0xFFFFC1FF & 0x3F85;
        y.llIllllllI[525] = 0xFFFFC7E7 & 0x399E;
        y.llIllllllI[526] = 0xFFFFFBAF & 0x5D7;
        y.llIllllllI[527] = 0xFFFF91ED & 0x6F9A;
        y.llIllllllI[528] = 0xFFFFCBFB & 0x358D;
        y.llIllllllI[529] = -(0xFFFFBB66 & 0x7EFB) & (0xFFFFBBEF & 0x7FFB);
        y.llIllllllI[530] = -(0xFFFFFBFF & 0x6E75) & (0xFFFFFFFF & 0x6BFF);
        y.llIllllllI[531] = -(0xFFFFFAF2 & 0x7F3F) & (0xFFFFFBFF & 0x7FBD);
        y.llIllllllI[532] = 0xFFFFE5FF & 0x1B8D;
        y.llIllllllI[533] = -(0xFFFFF975 & 0x2EFB) & (0xFFFFADFE & 0x7BFF);
        y.llIllllllI[534] = -(0xFFFFFE7B & 0x75F5) & (0xFFFFFFFF & 0x75FF);
        y.llIllllllI[535] = -(0xFFFFF1FF & 0x6FCB) & (0xFFFFFFFF & 0x6FFB);
        y.llIllllllI[536] = -(0xFFFFE64E & 0x5FF9) & (0xFFFFE7FF & 0x5FD7);
        y.llIllllllI[537] = 0xFFFFFFF7 & 0x46CD;
        y.llIllllllI[538] = 0xFFFF99D3 & 0x67BD;
        y.llIllllllI[539] = 0xFFFFC3FA & 0x3D97;
        y.llIllllllI[540] = 0xFFFF99D3 & 0x67BF;
        y.llIllllllI[541] = 0xFFFFF597 & 0xBFC;
        y.llIllllllI[542] = 0xFFFFD7FF & 0x2995;
        y.llIllllllI[543] = -(0xFFFFFE59 & 0x6FEF) & (0xFFFFEFFE & 0x7FDF);
        y.llIllllllI[544] = -(0xFFFFFFC9 & 0x6C7F) & (0xFFFFFDDF & 0x6FFF);
        y.llIllllllI[545] = -(0xFFFFFEDD & 0xB67) & (0xFFFFDFDD & 0x2BFE);
        y.llIllllllI[546] = 0xFFFF899F & 0x77F9;
        y.llIllllllI[547] = 0xFFFFBDBA & 0x43DF;
        y.llIllllllI[548] = 0xFFFF979B & 0x69FF;
        y.llIllllllI[549] = 0xFFFF9F9F & 0x61FC;
        y.llIllllllI[550] = -(0xFFFFFFFD & 0x6603) & (0xFFFFE79D & Short.MAX_VALUE);
        y.llIllllllI[551] = 0xFFFFF59F & 0xBFE;
        y.llIllllllI[552] = -(0xFFFFDACF & 0x7D31) & (0xFFFFD9FF & 0x7F9F);
        y.llIllllllI[553] = 0xFFFF99B9 & 0x67E6;
        y.llIllllllI[554] = 0xFFFFE9E5 & 0x17BB;
        y.llIllllllI[555] = 0xFFFF99F7 & 0x67AA;
        y.llIllllllI[556] = 0xFFFFAF97 & 0x5E7D;
        y.llIllllllI[557] = -(0xFFFFF6D9 & 0x79A7) & (0xFFFFFCFD & 0x7FDB);
        y.llIllllllI[558] = -(0xFFFFBB1B & 0x77E5) & (0xFFFFBF7B & 0x7FDF);
        y.llIllllllI[559] = 0xFFFFAF7E & 0x5CDB;
        y.llIllllllI[560] = -(0xFFFFBE5F & 0x6BB9) & (0xFFFFFFFB & 0x2BBF);
        y.llIllllllI[561] = -(0xFFFFBB3A & 0x6DDF) & (0xFFFFFF7F & 0x6FBF);
        y.llIllllllI[562] = -(0xFFFFF26E & 0x7F93) & (0xFFFFFFAF & 0x73F5);
        y.llIllllllI[563] = -(0xFFFFFF55 & 0x62FB) & (0xFFFFEBFF & 0x77F5);
        y.llIllllllI[564] = -(0xFFFFFB6D & 0x3D9B) & (0xFFFFFFAF & 0x7F7F);
        y.llIllllllI[565] = 0xFFFF9FBE & 0x61E7;
        y.llIllllllI[566] = -(0xFFFFFCA9 & 0x7F5F) & (0xFFFFFFBF & 0x7DEF);
        y.llIllllllI[567] = -(0xFFFFFC5F & 0x3FF6) & (0xFFFFBFFF & 0x7DFD);
        y.llIllllllI[568] = 0xFFFFC9AB & 0x37FD;
        y.llIllllllI[569] = 0xFFFF85FF & 0x7BAA;
        y.llIllllllI[570] = 0xFFFFE9EF & 0x17BB;
        y.llIllllllI[571] = 0xFFFFABED & 0x55BE;
        y.llIllllllI[572] = 0xFFFFA9FD & 0x57AF;
        y.llIllllllI[573] = -(0xFFFFFBDB & 0x6475) & (0xFFFFF1FF & 0x6FFF);
        y.llIllllllI[574] = -(0xFFFFF647 & 0x5BFC) & (0xFFFFD7FB & 0x7BF7);
        y.llIllllllI[575] = 0xFFFF89B5 & 0x77FB;
        y.llIllllllI[576] = -(0xFFFFDB5E & 0x2CEF) & (0xFFFFFBFF & 0xDFF);
        y.llIllllllI[577] = -(0xFFFFBFF9 & 0x564F) & (0xFFFFF7FF & 0x1FFB);
        y.llIllllllI[578] = 0xFFFFB5F5 & 0x4BBE;
        y.llIllllllI[579] = -(0xFFFFA1FF & 0x5F89) & (0xFFFFBDDD & 0x7FFA);
        y.llIllllllI[580] = 0xFFFFB5CF & 0x5F70;
        y.llIllllllI[581] = 0xFFFFD9FD & 0x27BA;
        y.llIllllllI[582] = 0xFFFFF6CA & 0x3BFD;
        y.llIllllllI[583] = 0xFFFF87BF & 0x7AFC;
        y.llIllllllI[584] = 0xFFFFFEBC & 0x19DF;
        y.llIllllllI[585] = 0xFFFFFEE4 & 0x1D3B;
        y.llIllllllI[586] = -(0xFFFFBBCE & 0x5EBB) & (0xFFFFBBFF & 0x7FBD);
        y.llIllllllI[587] = 0xFFFFEDFE & 0x371D;
        y.llIllllllI[588] = -(0xFFFFE57E & 0x1B83) & (0xFFFFAFEF & 0x7FDD);
        y.llIllllllI[589] = 0xFFFFF5BB & 0x6BEC;
        y.llIllllllI[590] = -(0xFFFFC7FD & 0x3C7B) & (0xFFFFF7FC & 0xFFF);
        y.llIllllllI[591] = 0xFFFFD5BD & 0x2BF7;
        y.llIllllllI[592] = 0xFFFFA5FF & 0x5BB6;
        y.llIllllllI[593] = 0xFFFFA1F7 & 0x5FBF;
        y.llIllllllI[594] = -(0xFFFFF793 & 0x6CED) & (0xFFFFFFFF & 0x6E8D);
        y.llIllllllI[595] = 0xFFFFCFE5 & 0x3DDF;
        y.llIllllllI[596] = 0xFFFFFFFD & 0xC6E;
        y.llIllllllI[597] = 0xFFFFAFFF & 0x75AC;
        y.llIllllllI[598] = 0xFFFFCDFF & 0x3F3E;
        y.llIllllllI[599] = 0xFFFF9DBF & 0x6FD7;
        y.llIllllllI[600] = 0xFFFF8FFE & 0x7DE5;
        y.llIllllllI[601] = 0xFFFFED73 & 0x1FBF;
        y.llIllllllI[602] = 0xFFFFCFC6 & 0x3DFB;
        y.llIllllllI[603] = 0xFFFF8D3D & 0x7FDF;
        y.llIllllllI[604] = 0xFFFFDFF4 & 0x2DFF;
        y.llIllllllI[605] = -(0xFFFFE17F & 0x3ED5) & (0xFFFFEFDF & 0x3D77);
        y.llIllllllI[606] = 0xFFFFFCEB & 0xF7F;
        y.llIllllllI[607] = 0xFFFFDFCF & 0x2DBF;
        y.llIllllllI[608] = 0xFFFFCF56 & 0x3CFF;
        y.llIllllllI[609] = 0xFFFFACEC & 0x5FB7;
        y.llIllllllI[610] = 0xFFFF99FF & 0x67B9;
        y.llIllllllI[611] = 0xFFFFC7BF & 0x39FA;
        y.llIllllllI[612] = -(0xFFFFFF7D & 0x7EC7) & (0xFFFFFFFF & Short.MAX_VALUE);
        y.llIllllllI[613] = 0xFFFFA7BC & 0x59FF;
        y.llIllllllI[614] = -(0xFFFFFB6F & 0x4CD1) & (0xFFFFFBFF & 0x4DFD);
        y.llIllllllI[615] = 0xFFFFF9FE & 0x7BF;
        y.llIllllllI[616] = -(0xFFFFFF79 & 0x3287) & (0xFFFFFFBF & 0x33FF);
        y.llIllllllI[617] = 0xFFFF95F9 & 0x6BC6;
        y.llIllllllI[618] = 0xFFFFE1E1 & 0x1FDF;
        y.llIllllllI[619] = 0xFFFFE3FA & 0x1DC7;
        y.llIllllllI[620] = -(0xFFFFF72F & 0x7ED5) & (0xFFFFF7F7 & 0x7FCF);
        y.llIllllllI[621] = 0xFFFFABFE & 0x55C5;
        y.llIllllllI[622] = 0xFFFFEDCD & 0x13F7;
        y.llIllllllI[623] = 0xFFFF83CF & 0x7DF6;
    }

    private static boolean lIllllIIlIllI(int n2) {
        return n2 > 0;
    }

    private static boolean lIllllIIlIIll(int n2) {
        return n2 == 0;
    }

    private static boolean lIllllIIlIIIl(int n2) {
        return n2 != 0;
    }

    public static void bo() {
        WorldArea var81;
        WorldArea var113;
        WorldArea worldArea = new WorldArea(llIllllllI[275], llIllllllI[276], llIllllllI[11], llIllllllI[8], llIllllllI[0]);
        if (y.lIllllIIlIIIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[277]];
            String[] stringArray = new String[llIllllllI[0]];
            stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[278]];
            TileObjects.getNearest((String[])stringArray).interact(llIllllIlI[llIllllllI[279]]);
            Time.sleepTicks((int)llIllllllI[8]);
            0;
        }
        WorldArea var21 = new WorldArea(llIllllllI[280], llIllllllI[281], llIllllllI[44], llIllllllI[56], llIllllllI[1]);
        WorldPoint var109 = new WorldPoint(llIllllllI[282], llIllllllI[283], llIllllllI[1]);
        if (y.lIllllIIlIIIl(var21.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (y.lIllllIIllIIl(Players.getLocal().getWorldLocation().distanceTo(var109), llIllllllI[8])) {
                AccBuilderSotf.c = llIllllIlI[llIllllllI[284]];
                Movement.walkTo((WorldPoint)var109);
                0;
                Time.sleepTicks((int)llIllllllI[0]);
                0;
            }
            if (y.lIllllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(var109), llIllllllI[8]) && y.lIllllIIlIIll(Players.getLocal().getWorldLocation().getPlane())) {
                AccBuilderSotf.c = llIllllIlI[llIllllllI[285]];
                if (y.lIllllIIllIII(Players.getLocal().getAnimation(), llIllllllI[54])) {
                    String[] stringArray = new String[llIllllllI[0]];
                    stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[147]];
                    TileObjects.getNearest((String[])stringArray).interact(llIllllIlI[llIllllllI[286]]);
                    Time.sleepTicks((int)llIllllllI[6]);
                    0;
                }
            }
        }
        if (y.lIllllIIlIIIl((var113 = new WorldArea(llIllllllI[132], llIllllllI[133], llIllllllI[13], llIllllllI[21], llIllllllI[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && y.lIllllIIllIII(Players.getLocal().getAnimation(), llIllllllI[54])) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[287]];
            String[] stringArray = new String[llIllllllI[0]];
            stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[288]];
            TileObjects.getNearest((String[])stringArray).interact(llIllllIlI[llIllllllI[289]]);
            Time.sleepTicks((int)llIllllllI[8]);
            0;
        }
        WorldArea var29 = new WorldArea(llIllllllI[290], llIllllllI[291], llIllllllI[15], llIllllllI[64], llIllllllI[0]);
        WorldPoint var42 = new WorldPoint(llIllllllI[292], llIllllllI[293], llIllllllI[0]);
        WorldPoint[] worldPointArray = new WorldPoint[llIllllllI[17]];
        worldPointArray[y.llIllllllI[1]] = new WorldPoint(llIllllllI[280], llIllllllI[133], llIllllllI[0]);
        worldPointArray[y.llIllllllI[0]] = new WorldPoint(llIllllllI[292], llIllllllI[294], llIllllllI[0]);
        worldPointArray[y.llIllllllI[4]] = new WorldPoint(llIllllllI[295], llIllllllI[296], llIllllllI[0]);
        worldPointArray[y.llIllllllI[6]] = new WorldPoint(llIllllllI[295], llIllllllI[297], llIllllllI[0]);
        worldPointArray[y.llIllllllI[8]] = new WorldPoint(llIllllllI[298], llIllllllI[299], llIllllllI[0]);
        worldPointArray[y.llIllllllI[2]] = new WorldPoint(llIllllllI[298], llIllllllI[300], llIllllllI[0]);
        worldPointArray[y.llIllllllI[11]] = new WorldPoint(llIllllllI[295], llIllllllI[301], llIllllllI[0]);
        worldPointArray[y.llIllllllI[13]] = new WorldPoint(llIllllllI[292], llIllllllI[302], llIllllllI[0]);
        worldPointArray[y.llIllllllI[15]] = new WorldPoint(llIllllllI[292], llIllllllI[303], llIllllllI[0]);
        worldPointArray[y.llIllllllI[16]] = new WorldPoint(llIllllllI[292], llIllllllI[304], llIllllllI[0]);
        WorldPoint[] var9 = worldPointArray;
        if (y.lIllllIIlIIIl(var29.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (y.lIllllIIllIIl(Players.getLocal().getWorldLocation().distanceTo(var42), llIllllllI[8])) {
                AccBuilderSotf.c = llIllllIlI[llIllllllI[305]];
                Walker.walkAlong(Arrays.asList(var9), new HashMap());
                0;
                Time.sleepTicks((int)llIllllllI[0]);
                0;
            }
            if (y.lIllllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(var42), llIllllllI[8])) {
                AccBuilderSotf.c = llIllllIlI[llIllllllI[306]];
                String[] stringArray = new String[llIllllllI[0]];
                stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[307]];
                TileObjects.getNearest((String[])stringArray).interact(llIllllIlI[llIllllllI[308]]);
                Time.sleepTicks((int)llIllllllI[8]);
                0;
            }
        }
        if (y.lIllllIIlIIIl((var81 = new WorldArea(llIllllllI[295], llIllllllI[304], llIllllllI[2], llIllllllI[11], llIllllllI[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[309]];
            String[] stringArray = new String[llIllllllI[0]];
            stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[151]];
            TileObjects.getNearest((String[])stringArray).interact(llIllllIlI[llIllllllI[310]]);
            Time.sleepTicks((int)llIllllllI[2]);
            0;
            String[] stringArray2 = new String[llIllllllI[0]];
            stringArray2[y.llIllllllI[1]] = llIllllIlI[llIllllllI[311]];
            TileObjects.getNearest((String[])stringArray2).interact(llIllllIlI[llIllllllI[312]]);
            Time.sleepTicks((int)llIllllllI[2]);
            0;
        }
        WorldArea var44 = new WorldArea(llIllllllI[313], llIllllllI[314], llIllllllI[16], llIllllllI[3], llIllllllI[1]);
        WorldPoint var34 = new WorldPoint(llIllllllI[282], llIllllllI[315], llIllllllI[1]);
        if (y.lIllllIIlIIIl(var44.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (y.lIllllIIllIIl(Players.getLocal().getWorldLocation().distanceTo(var34), llIllllllI[8])) {
                AccBuilderSotf.c = llIllllIlI[llIllllllI[316]];
                Movement.walkTo((WorldPoint)var34);
                0;
                Time.sleepTicks((int)llIllllllI[0]);
                0;
            }
            if (y.lIllllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(var34), llIllllllI[8])) {
                AccBuilderSotf.c = llIllllIlI[llIllllllI[317]];
                String[] stringArray = new String[llIllllllI[0]];
                stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[318]];
                TileObjects.getNearest((String[])stringArray).interact(llIllllIlI[llIllllllI[319]]);
                Time.sleepTicks((int)llIllllllI[8]);
                0;
            }
        }
        WorldArea var40 = new WorldArea(llIllllllI[290], llIllllllI[320], llIllllllI[19], llIllllllI[52], llIllllllI[0]);
        WorldPoint var53 = new WorldPoint(llIllllllI[292], llIllllllI[239], llIllllllI[0]);
        if (y.lIllllIIlIIIl(var40.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (y.lIllllIIllIIl(Players.getLocal().getWorldLocation().distanceTo(var53), llIllllllI[8])) {
                AccBuilderSotf.c = llIllllIlI[llIllllllI[321]];
                Movement.walkTo((WorldPoint)var53);
                0;
                Time.sleepTicks((int)llIllllllI[0]);
                0;
            }
            if (y.lIllllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(var53), llIllllllI[8])) {
                AccBuilderSotf.c = llIllllIlI[llIllllllI[322]];
                String[] stringArray = new String[llIllllllI[0]];
                stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[152]];
                TileObjects.getNearest((String[])stringArray).interact(llIllllIlI[llIllllllI[323]]);
                Time.sleepTicks((int)llIllllllI[8]);
                0;
            }
        }
        WorldArea var33 = new WorldArea(llIllllllI[290], llIllllllI[324], llIllllllI[11], llIllllllI[21], llIllllllI[4]);
        WorldPoint var27 = new WorldPoint(llIllllllI[295], llIllllllI[222], llIllllllI[4]);
        if (y.lIllllIIlIIIl(var33.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (y.lIllllIIllIIl(Players.getLocal().getWorldLocation().distanceTo(var27), llIllllllI[4])) {
                AccBuilderSotf.c = llIllllIlI[llIllllllI[325]];
                Movement.walkTo((WorldPoint)var27);
                0;
                Time.sleepTicks((int)llIllllllI[0]);
                0;
            }
            if (y.lIllllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(var27), llIllllllI[4])) {
                AccBuilderSotf.c = llIllllIlI[llIllllllI[326]];
                String[] stringArray = new String[llIllllllI[0]];
                stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[327]];
                TileObjects.getNearest((String[])stringArray).interact(llIllllIlI[llIllllllI[328]]);
                Time.sleepTicks((int)llIllllllI[8]);
                0;
            }
        }
        WorldArea var8 = new WorldArea(llIllllllI[132], llIllllllI[329], llIllllllI[41], llIllllllI[82], llIllllllI[0]);
        WorldPoint var14 = new WorldPoint(llIllllllI[330], llIllllllI[331], llIllllllI[0]);
        if (y.lIllllIIlIIIl(var8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (y.lIllllIIllIIl(Players.getLocal().getWorldLocation().distanceTo(var14), llIllllllI[8])) {
                AccBuilderSotf.c = llIllllIlI[llIllllllI[332]];
                Movement.walkTo((WorldPoint)var14);
                0;
                Time.sleepTicks((int)llIllllllI[0]);
                0;
            }
            if (y.lIllllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(var14), llIllllllI[8])) {
                AccBuilderSotf.c = llIllllIlI[llIllllllI[333]];
                String[] stringArray = new String[llIllllllI[0]];
                stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[334]];
                TileObjects.getNearest((String[])stringArray).interact(llIllllIlI[llIllllllI[335]]);
                Time.sleepTicks((int)llIllllllI[8]);
                0;
            }
        }
        WorldArea var52 = new WorldArea(llIllllllI[336], llIllllllI[331], llIllllllI[115], llIllllllI[104], llIllllllI[1]);
        WorldPoint var74 = new WorldPoint(llIllllllI[337], llIllllllI[338], llIllllllI[1]);
        if (y.lIllllIIlIIIl(var52.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (y.lIllllIIllIIl(Players.getLocal().getWorldLocation().distanceTo(var74), llIllllllI[8])) {
                AccBuilderSotf.c = llIllllIlI[llIllllllI[153]];
                Movement.walkTo((WorldPoint)var74);
                0;
                Time.sleepTicks((int)llIllllllI[0]);
                0;
            }
            if (y.lIllllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(var74), llIllllllI[8])) {
                AccBuilderSotf.c = llIllllIlI[llIllllllI[339]];
                g.a(llIllllIlI[llIllllllI[340]], cE);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void br() {
        void var24;
        void var25;
        void var107;
        WorldPoint worldPoint = new WorldPoint(llIllllllI[556], llIllllllI[557], llIllllllI[0]);
        WorldPoint worldPoint2 = new WorldPoint(llIllllllI[556], llIllllllI[558], llIllllllI[0]);
        WorldPoint worldPoint3 = new WorldPoint(llIllllllI[351], llIllllllI[558], llIllllllI[0]);
        WorldArea worldArea = new WorldArea(llIllllllI[290], llIllllllI[559], llIllllllI[45], llIllllllI[52], llIllllllI[0]);
        WorldArea worldArea2 = new WorldArea(llIllllllI[132], llIllllllI[133], llIllllllI[13], llIllllllI[21], llIllllllI[1]);
        if (y.lIllllIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)worldPoint) ? 1 : 0)) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[560]];
            int[] nArray = new int[llIllllllI[0]];
            nArray[y.llIllllllI[1]] = llIllllllI[561];
            TileObjects.getNearest((int[])nArray).interact(llIllllIlI[llIllllllI[562]]);
            Time.sleepTicks((int)llIllllllI[4]);
            0;
        }
        if (y.lIllllIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)var107) ? 1 : 0)) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[563]];
            int[] nArray = new int[llIllllllI[0]];
            nArray[y.llIllllllI[1]] = llIllllllI[564];
            TileObjects.getNearest((int[])nArray).interact(llIllllIlI[llIllllllI[565]]);
            Time.sleepTicks((int)llIllllllI[4]);
            0;
        }
        if (y.lIllllIIlIIIl(var25.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[566]];
            String[] stringArray = new String[llIllllllI[0]];
            stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[567]];
            if (y.lIllllIIlIlIl(TileObjects.getNearest((String[])stringArray))) {
                String[] stringArray2 = new String[llIllllllI[0]];
                stringArray2[y.llIllllllI[1]] = llIllllIlI[llIllllllI[568]];
                String[] stringArray3 = new String[llIllllllI[0]];
                stringArray3[y.llIllllllI[1]] = llIllllIlI[llIllllllI[569]];
                if (y.lIllllIIlIIIl(TileObjects.getNearest((String[])stringArray2).hasAction(stringArray3) ? 1 : 0) && y.lIllllIIlIIll(Dialog.isOpen() ? 1 : 0)) {
                    String[] stringArray4 = new String[llIllllllI[0]];
                    stringArray4[y.llIllllllI[1]] = llIllllIlI[llIllllllI[570]];
                    TileObjects.getNearest((String[])stringArray4).interact(llIllllIlI[llIllllllI[571]]);
                    Time.sleepTicks((int)llIllllllI[6]);
                    0;
                }
            }
            String[] stringArray5 = new String[llIllllllI[0]];
            stringArray5[y.llIllllllI[1]] = llIllllIlI[llIllllllI[572]];
            if (y.lIllllIIlIlIl(TileObjects.getNearest((String[])stringArray5))) {
                String[] stringArray6 = new String[llIllllllI[0]];
                stringArray6[y.llIllllllI[1]] = llIllllIlI[llIllllllI[14]];
                String[] stringArray7 = new String[llIllllllI[0]];
                stringArray7[y.llIllllllI[1]] = llIllllIlI[llIllllllI[573]];
                if (y.lIllllIIlIIIl(TileObjects.getNearest((String[])stringArray6).hasAction(stringArray7) ? 1 : 0) && y.lIllllIIlIIll(Dialog.isOpen() ? 1 : 0)) {
                    String[] stringArray8 = new String[llIllllllI[0]];
                    stringArray8[y.llIllllllI[1]] = llIllllIlI[llIllllllI[574]];
                    TileObjects.getNearest((String[])stringArray8).interact(llIllllIlI[llIllllllI[575]]);
                    Time.sleepTicks((int)llIllllllI[6]);
                    0;
                }
            }
            g.a(cE);
        }
        if (y.lIllllIIlIIIl(var24.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && y.lIllllIIlIIll(Players.getLocal().isMoving() ? 1 : 0)) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[576]];
            String[] stringArray = new String[llIllllllI[0]];
            stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[577]];
            TileObjects.getNearest((String[])stringArray).interact(llIllllIlI[llIllllllI[578]]);
            Time.sleepTicks((int)llIllllllI[6]);
            0;
        }
    }

    private static boolean lIllllIIllIII(int n2, int n3) {
        return n2 == n3;
    }

    public static void bm() {
        WorldArea var100 = new WorldArea(llIllllllI[216], llIllllllI[217], llIllllllI[51], llIllllllI[68], llIllllllI[1]);
        WorldArea var1 = new WorldArea(llIllllllI[218], llIllllllI[219], llIllllllI[11], llIllllllI[8], llIllllllI[1]);
        WorldPoint lllllllllllllllllIlllllIlIIllllI = new WorldPoint(llIllllllI[220], llIllllllI[172], llIllllllI[1]);
        WorldPoint var71 = new WorldPoint(llIllllllI[221], llIllllllI[222], llIllllllI[1]);
        WorldArea var75 = new WorldArea(llIllllllI[223], llIllllllI[224], llIllllllI[13], llIllllllI[11], llIllllllI[1]);
        WorldArea var103 = new WorldArea(llIllllllI[225], llIllllllI[172], llIllllllI[6], llIllllllI[8], llIllllllI[1]);
        WorldArea var90 = new WorldArea(llIllllllI[171], llIllllllI[172], llIllllllI[4], llIllllllI[13], llIllllllI[1]);
        WorldArea var64 = new WorldArea(llIllllllI[226], llIllllllI[227], llIllllllI[11], llIllllllI[11], llIllllllI[1]);
        String[] stringArray = new String[llIllllllI[0]];
        stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[228]];
        if (y.lIllllIIlIlIl(TileObjects.getNearest((String[])stringArray)) && y.lIllllIIlIIll(Players.getLocal().isMoving() ? 1 : 0)) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[229]];
            String[] stringArray2 = new String[llIllllllI[0]];
            stringArray2[y.llIllllllI[1]] = llIllllIlI[llIllllllI[230]];
            TileObjects.getNearest((String[])stringArray2).interact(llIllllIlI[llIllllllI[231]]);
            Time.sleepTicks((int)llIllllllI[8]);
            0;
        }
        if (y.lIllllIIlIIIl(var90.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[232]];
            String[] stringArray3 = new String[llIllllllI[0]];
            stringArray3[y.llIllllllI[1]] = llIllllIlI[llIllllllI[233]];
            TileObjects.getNearest((String[])stringArray3).interact(llIllllIlI[llIllllllI[234]]);
            Time.sleepTicks((int)llIllllllI[8]);
            0;
        }
        if (!y.lIllllIIlIIll(var75.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || y.lIllllIIlIIIl(var103.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[235]];
            String[] stringArray4 = new String[llIllllllI[0]];
            stringArray4[y.llIllllllI[1]] = llIllllIlI[llIllllllI[125]];
            if (y.lIllllIIlIlIl(TileObjects.getNearest((String[])stringArray4))) {
                String[] stringArray5 = new String[llIllllllI[0]];
                stringArray5[y.llIllllllI[1]] = llIllllIlI[llIllllllI[236]];
                TileObjects.getNearest((String[])stringArray5).interact(llIllllIlI[llIllllllI[237]]);
                Time.sleepTicks((int)llIllllllI[6]);
                0;
            }
        }
        if ((!y.lIllllIIlIIll(var1.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || y.lIllllIIlIIIl(var100.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && y.lIllllIIlIIll(var64.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && y.lIllllIIlIIll(var75.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && y.lIllllIIlIIll(var103.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && y.lIllllIIlIIll(var90.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[238]];
            Movement.walkTo((WorldPoint)var71);
            0;
            Time.sleepTicks((int)llIllllllI[0]);
            0;
        }
        y.bq();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean ah() {
        int n2;
        if (y.lIllllIIlIlII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[194])) {
            String[] stringArray = new String[llIllllllI[0]];
            stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[591]];
            if (y.lIllllIIlIIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray2 = new String[llIllllllI[0]];
                stringArray2[y.llIllllllI[1]] = llIllllIlI[llIllllllI[592]];
                if (y.lIllllIIlIIll(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                    String[] stringArray3 = new String[llIllllllI[0]];
                    stringArray3[y.llIllllllI[1]] = llIllllIlI[llIllllllI[593]];
                    if (y.lIllllIIlIIll(Inventory.contains((String[])stringArray3) ? 1 : 0) && y.lIllllIIlIIll(Dialog.isOpen() ? 1 : 0)) {
                        n2 = llIllllllI[0];
                        0;
                        if (1 < 2) return n2 != 0;
                        return false;
                    }
                }
            }
        }
        n2 = llIllllllI[1];
        return n2 != 0;
    }

    @Override
    public int af() {
        try {
            y.bl();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (3 <= -1) {
            return (2 ^ 0x5D) & ~(0x6B ^ 0x34);
        }
        return llIllllllI[80];
    }

    public static void bl() {
        block170: {
            block181: {
                WorldPoint var55;
                BankLocation var48;
                block182: {
                    block171: {
                        block180: {
                            block173: {
                                block179: {
                                    block178: {
                                        block177: {
                                            block176: {
                                                block175: {
                                                    block174: {
                                                        block172: {
                                                            if (y.lIllllIIlIIIl(bt ? 1 : 0)) {
                                                                b.a(bv);
                                                                if (y.lIllllIIlIIlI(bv.size(), llIllllllI[0])) {
                                                                    System.out.println(llIllllIlI[llIllllllI[1]]);
                                                                    bt = llIllllllI[1];
                                                                }
                                                            }
                                                            if (!y.lIllllIIlIIll(bt ? 1 : 0)) break block170;
                                                            if (y.lIllllIIlIIlI(Skills.getLevel((Skill)Skill.CONSTRUCTION), llIllllllI[2])) {
                                                                da = llIllllIlI[llIllllllI[0]];
                                                                aw.eH();
                                                            }
                                                            if (y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.CONSTRUCTION), llIllllllI[2]) && y.lIllllIIlIIlI(Skills.getLevel((Skill)Skill.MINING), llIllllllI[3])) {
                                                                da = llIllllIlI[llIllllllI[4]];
                                                                aC.fQ();
                                                            }
                                                            if (y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.CONSTRUCTION), llIllllllI[2]) && y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.MINING), llIllllllI[3]) && y.lIllllIIlIIlI(Skills.getLevel((Skill)Skill.THIEVING), llIllllllI[5])) {
                                                                da = llIllllIlI[llIllllllI[6]];
                                                                aE.gm();
                                                            }
                                                            if (y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.CONSTRUCTION), llIllllllI[2]) && y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.MINING), llIllllllI[3]) && y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.THIEVING), llIllllllI[5]) && y.lIllllIIlIIlI(Skills.getLevel((Skill)Skill.AGILITY), llIllllllI[7])) {
                                                                da = llIllllIlI[llIllllllI[8]];
                                                                av.eA();
                                                            }
                                                            if (y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.CONSTRUCTION), llIllllllI[2]) && y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.MINING), llIllllllI[3]) && y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.THIEVING), llIllllllI[5]) && y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.AGILITY), llIllllllI[7]) && y.lIllllIIlIIlI(Skills.getLevel((Skill)Skill.CRAFTING), llIllllllI[9])) {
                                                                da = llIllllIlI[llIllllllI[2]];
                                                                ay.fi();
                                                            }
                                                            if (y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.CONSTRUCTION), llIllllllI[2]) && y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.MINING), llIllllllI[3]) && y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.THIEVING), llIllllllI[5]) && y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.AGILITY), llIllllllI[7]) && y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.CRAFTING), llIllllllI[9]) && y.lIllllIIlIIlI(Skills.getLevel((Skill)Skill.MAGIC), llIllllllI[10])) {
                                                                da = llIllllIlI[llIllllllI[11]];
                                                                m.ak();
                                                            }
                                                            if (y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.CONSTRUCTION), llIllllllI[2]) && y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.MINING), llIllllllI[3]) && y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.THIEVING), llIllllllI[5]) && y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.AGILITY), llIllllllI[7]) && y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.CRAFTING), llIllllllI[9]) && y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.MAGIC), llIllllllI[10]) && y.lIllllIIlIIlI(Skills.getLevel((Skill)Skill.STRENGTH), llIllllllI[12])) {
                                                                da = llIllllIlI[llIllllllI[13]];
                                                                am.aJ();
                                                            }
                                                            if (y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.CONSTRUCTION), llIllllllI[2]) && y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.MINING), llIllllllI[3]) && y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.THIEVING), llIllllllI[5]) && y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.AGILITY), llIllllllI[7]) && y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.CRAFTING), llIllllllI[9]) && y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.MAGIC), llIllllllI[10]) && y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.STRENGTH), llIllllllI[12]) && y.lIllllIIlIIlI(Vars.getBit((int)QuestVarbits.QUEST_IN_AID_OF_THE_MYREQUE.getId()), llIllllllI[14])) {
                                                                da = llIllllIlI[llIllllllI[15]];
                                                                D.bF();
                                                            }
                                                            if (!y.lIllllIIlIIll(y.an() ? 1 : 0) || !y.lIllllIIlIIll(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId())) || !y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.CONSTRUCTION), llIllllllI[2]) || !y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.MINING), llIllllllI[3]) || !y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.THIEVING), llIllllllI[5]) || !y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.AGILITY), llIllllllI[7]) || !y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.CRAFTING), llIllllllI[9]) || !y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.MAGIC), llIllllllI[10]) || !y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.STRENGTH), llIllllllI[12]) || !y.lIllllIIlIlII(Vars.getBit((int)QuestVarbits.QUEST_IN_AID_OF_THE_MYREQUE.getId()), llIllllllI[14])) break block171;
                                                            da = llIllllIlI[llIllllllI[16]];
                                                            var48 = BankLocation.getNearest();
                                                            if (y.lIllllIIlIlIl(var48) && y.lIllllIIlIIll(var48.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                                AccBuilderSotf.c = llIllllIlI[llIllllllI[17]];
                                                                a.a(var48);
                                                            }
                                                            if (!y.lIllllIIlIlIl(var48) || !y.lIllllIIlIIIl(var48.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block171;
                                                            if (y.lIllllIIlIIll(Bank.isOpen() ? 1 : 0)) {
                                                                a.a();
                                                                Time.sleepUntil(() -> Bank.isOpen(), (int)llIllllllI[18]);
                                                                0;
                                                            }
                                                            if (!y.lIllllIIlIIIl(Bank.isOpen() ? 1 : 0)) break block171;
                                                            AccBuilderSotf.c = llIllllIlI[llIllllllI[19]];
                                                            if (y.lIllllIIlIllI(Inventory.getAll().size())) {
                                                                Bank.depositInventory();
                                                                Time.sleepTicks((int)llIllllllI[8]);
                                                                0;
                                                            }
                                                            if (y.lIllllIIlIllI(Equipment.getAll().size())) {
                                                                Bank.depositEquipment();
                                                                Time.sleepTicks((int)llIllllllI[4]);
                                                                0;
                                                            }
                                                            int[] nArray = new int[llIllllllI[0]];
                                                            nArray[y.llIllllllI[1]] = llIllllllI[20];
                                                            if (!y.lIllllIIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block172;
                                                            int[] nArray2 = new int[llIllllllI[0]];
                                                            nArray2[y.llIllllllI[1]] = llIllllllI[20];
                                                            if (!y.lIllllIIlIlII(Bank.getFirst((int[])nArray2).getQuantity(), llIllllllI[21])) break block173;
                                                        }
                                                        int[] nArray = new int[llIllllllI[0]];
                                                        nArray[y.llIllllllI[1]] = llIllllllI[22];
                                                        if (!y.lIllllIIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block174;
                                                        int[] nArray3 = new int[llIllllllI[0]];
                                                        nArray3[y.llIllllllI[1]] = llIllllllI[22];
                                                        if (!y.lIllllIIlIlII(Bank.getFirst((int[])nArray3).getQuantity(), llIllllllI[17])) break block173;
                                                    }
                                                    int[] nArray = new int[llIllllllI[0]];
                                                    nArray[y.llIllllllI[1]] = llIllllllI[23];
                                                    if (!y.lIllllIIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block175;
                                                    int[] nArray4 = new int[llIllllllI[0]];
                                                    nArray4[y.llIllllllI[1]] = llIllllllI[23];
                                                    if (!y.lIllllIIlIlII(Bank.getFirst((int[])nArray4).getQuantity(), llIllllllI[17])) break block173;
                                                }
                                                int[] nArray = new int[llIllllllI[0]];
                                                nArray[y.llIllllllI[1]] = llIllllllI[24];
                                                if (!y.lIllllIIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block176;
                                                int[] nArray5 = new int[llIllllllI[0]];
                                                nArray5[y.llIllllllI[1]] = llIllllllI[24];
                                                if (!y.lIllllIIlIlII(Bank.getFirst((int[])nArray5).getQuantity(), llIllllllI[6])) break block173;
                                            }
                                            int[] nArray = new int[llIllllllI[0]];
                                            nArray[y.llIllllllI[1]] = llIllllllI[25];
                                            if (!y.lIllllIIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block177;
                                            int[] nArray6 = new int[llIllllllI[0]];
                                            nArray6[y.llIllllllI[1]] = llIllllllI[25];
                                            if (!y.lIllllIIlIlII(Bank.getFirst((int[])nArray6).getQuantity(), llIllllllI[26])) break block173;
                                        }
                                        int[] nArray = new int[llIllllllI[0]];
                                        nArray[y.llIllllllI[1]] = llIllllllI[27];
                                        if (!y.lIllllIIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block178;
                                        int[] nArray7 = new int[llIllllllI[0]];
                                        nArray7[y.llIllllllI[1]] = llIllllllI[27];
                                        if (!y.lIllllIIlIlII(Bank.getFirst((int[])nArray7).getQuantity(), llIllllllI[28])) break block173;
                                    }
                                    int[] nArray = new int[llIllllllI[0]];
                                    nArray[y.llIllllllI[1]] = llIllllllI[29];
                                    if (!y.lIllllIIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block179;
                                    int[] nArray8 = new int[llIllllllI[0]];
                                    nArray8[y.llIllllllI[1]] = llIllllllI[29];
                                    if (!y.lIllllIIlIlII(Bank.getFirst((int[])nArray8).getQuantity(), llIllllllI[30])) break block173;
                                }
                                int[] nArray = new int[llIllllllI[0]];
                                nArray[y.llIllllllI[1]] = llIllllllI[31];
                                if (!y.lIllllIIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block180;
                                int[] nArray9 = new int[llIllllllI[0]];
                                nArray9[y.llIllllllI[1]] = llIllllllI[31];
                                if (!y.lIllllIIlIIlI(Bank.getFirst((int[])nArray9).getQuantity(), llIllllllI[32])) break block180;
                            }
                            y.Q();
                            System.out.println(llIllllIlI[llIllllllI[21]]);
                            bt = llIllllllI[0];
                            return;
                        }
                        int[] nArray = new int[llIllllllI[21]];
                        nArray[y.llIllllllI[1]] = llIllllllI[33];
                        nArray[y.llIllllllI[0]] = llIllllllI[29];
                        nArray[y.llIllllllI[4]] = llIllllllI[27];
                        nArray[y.llIllllllI[6]] = llIllllllI[31];
                        nArray[y.llIllllllI[8]] = llIllllllI[20];
                        nArray[y.llIllllllI[2]] = llIllllllI[34];
                        nArray[y.llIllllllI[11]] = llIllllllI[35];
                        nArray[y.llIllllllI[13]] = llIllllllI[22];
                        nArray[y.llIllllllI[15]] = llIllllllI[23];
                        nArray[y.llIllllllI[16]] = llIllllllI[36];
                        nArray[y.llIllllllI[17]] = llIllllllI[24];
                        nArray[y.llIllllllI[19]] = llIllllllI[37];
                        if (y.lIllllIIlIIll(e.c(nArray) ? 1 : 0)) {
                            y.Q();
                            System.out.println(llIllllIlI[llIllllllI[38]]);
                            bt = llIllllllI[0];
                            return;
                        }
                        int[] nArray10 = new int[llIllllllI[0]];
                        nArray10[y.llIllllllI[1]] = llIllllllI[27];
                        if (y.lIllllIIlIIIl(Bank.contains((int[])nArray10) ? 1 : 0)) {
                            int[] nArray11 = new int[llIllllllI[0]];
                            nArray11[y.llIllllllI[1]] = llIllllllI[27];
                            if (y.lIllllIIlIIlI(Bank.getFirst((int[])nArray11).getQuantity(), llIllllllI[28])) {
                                y.Q();
                                System.out.println(llIllllIlI[llIllllllI[39]]);
                                bt = llIllllllI[0];
                                return;
                            }
                        }
                        int[] nArray12 = new int[llIllllllI[21]];
                        nArray12[y.llIllllllI[1]] = llIllllllI[33];
                        nArray12[y.llIllllllI[0]] = llIllllllI[29];
                        nArray12[y.llIllllllI[4]] = llIllllllI[27];
                        nArray12[y.llIllllllI[6]] = llIllllllI[31];
                        nArray12[y.llIllllllI[8]] = llIllllllI[20];
                        nArray12[y.llIllllllI[2]] = llIllllllI[34];
                        nArray12[y.llIllllllI[11]] = llIllllllI[35];
                        nArray12[y.llIllllllI[13]] = llIllllllI[22];
                        nArray12[y.llIllllllI[15]] = llIllllllI[23];
                        nArray12[y.llIllllllI[16]] = llIllllllI[36];
                        nArray12[y.llIllllllI[17]] = llIllllllI[24];
                        nArray12[y.llIllllllI[19]] = llIllllllI[37];
                        if (y.lIllllIIlIIIl(e.c(nArray12) ? 1 : 0)) {
                            a.a(llIllllllI[33], llIllllllI[17]);
                            a.a(llIllllllI[29], llIllllllI[30]);
                            a.a(llIllllllI[27], llIllllllI[17]);
                            a.a(llIllllllI[31], llIllllllI[17]);
                            a.a(llIllllllI[20], llIllllllI[4]);
                            a.a(llIllllllI[34], llIllllllI[0]);
                            a.a(llIllllllI[35], llIllllllI[0]);
                            a.a(llIllllllI[22], llIllllllI[0]);
                            a.a(llIllllllI[23], llIllllllI[0]);
                            a.a(llIllllllI[36], llIllllllI[8]);
                            a.a(llIllllllI[24], llIllllllI[0]);
                            a.a(llIllllllI[37], llIllllllI[0]);
                        }
                    }
                    if (y.lIllllIIlIIIl(Inventory.contains((int[])f.ba) ? 1 : 0) && y.lIllllIIlIIlI(Movement.getRunEnergy(), llIllllllI[32])) {
                        Inventory.getFirst((int[])f.ba).interact(llIllllIlI[llIllllllI[30]]);
                        Time.sleepTicks((int)llIllllllI[0]);
                        0;
                    }
                    if (y.lIllllIIlIIIl(y.an() ? 1 : 0) && y.lIllllIIlIIll(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId())) && y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.CONSTRUCTION), llIllllllI[2]) && y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.MINING), llIllllllI[3]) && y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.THIEVING), llIllllllI[5]) && y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.AGILITY), llIllllllI[7]) && y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.CRAFTING), llIllllllI[9]) && y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.MAGIC), llIllllllI[10]) && y.lIllllIIlIlII(Vars.getBit((int)QuestVarbits.QUEST_IN_AID_OF_THE_MYREQUE.getId()), llIllllllI[14])) {
                        String[] stringArray = new String[llIllllllI[0]];
                        stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[40]];
                        if (y.lIllllIIlIlll(NPCs.getNearest((String[])stringArray))) {
                            AccBuilderSotf.c = llIllllIlI[llIllllllI[41]];
                            if (y.lIllllIIlIIll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llIllllllI[42], llIllllllI[43], llIllllllI[1])) ? 1 : 0)) {
                                if (y.lIllllIIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                                    Dialog.close();
                                }
                                Movement.walkTo((WorldPoint)new WorldPoint(llIllllllI[42], llIllllllI[43], llIllllllI[1]));
                                0;
                                Time.sleepTicks((int)llIllllllI[0]);
                                0;
                            }
                            if (y.lIllllIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llIllllllI[42], llIllllllI[43], llIllllllI[1])) ? 1 : 0)) {
                                String[] stringArray2 = new String[llIllllllI[0]];
                                stringArray2[y.llIllllllI[1]] = llIllllIlI[llIllllllI[44]];
                                TileObjects.getNearest((String[])stringArray2).interact(llIllllIlI[llIllllllI[45]]);
                                Time.sleepTicks((int)llIllllllI[4]);
                                0;
                                String[] stringArray3 = new String[llIllllllI[0]];
                                stringArray3[y.llIllllllI[1]] = llIllllIlI[llIllllllI[3]];
                                TileObjects.getNearest((String[])stringArray3).interact(llIllllIlI[llIllllllI[46]]);
                                Time.sleepTicks((int)llIllllllI[4]);
                                0;
                            }
                        }
                        String[] stringArray4 = new String[llIllllllI[0]];
                        stringArray4[y.llIllllllI[1]] = llIllllIlI[llIllllllI[5]];
                        if (y.lIllllIIlIlIl(NPCs.getNearest((String[])stringArray4))) {
                            AccBuilderSotf.c = llIllllIlI[llIllllllI[47]];
                            g.a(llIllllIlI[llIllllllI[48]], cE);
                        }
                    }
                    if (y.lIllllIIllIII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[17])) {
                        AccBuilderSotf.c = llIllllIlI[llIllllllI[49]];
                        if (y.lIllllIIllIIl(Players.getLocal().getWorldLocation().distanceTo(dO), llIllllllI[30])) {
                            di = llIllllllI[1];
                            String[] stringArray = new String[llIllllllI[0]];
                            stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[7]];
                            if (y.lIllllIIlIlIl(NPCs.getNearest((String[])stringArray))) {
                                String[] stringArray5 = new String[llIllllllI[0]];
                                stringArray5[y.llIllllllI[1]] = llIllllIlI[llIllllllI[50]];
                                TileObjects.getNearest((String[])stringArray5).interact(llIllllIlI[llIllllllI[51]]);
                                Time.sleepTicks((int)llIllllllI[8]);
                                0;
                            }
                            String[] stringArray6 = new String[llIllllllI[0]];
                            stringArray6[y.llIllllllI[1]] = llIllllIlI[llIllllllI[52]];
                            if (y.lIllllIIlIlll(NPCs.getNearest((String[])stringArray6))) {
                                AccBuilderSotf.c = llIllllIlI[llIllllllI[28]];
                                Movement.walkTo((WorldPoint)dO);
                                0;
                                Time.sleepTicks((int)llIllllllI[0]);
                                0;
                            }
                        }
                        if (y.lIllllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(dO), llIllllllI[30])) {
                            AccBuilderSotf.c = llIllllIlI[llIllllllI[53]];
                            if (y.lIllllIIlIIll(Dialog.isOpen() ? 1 : 0) && y.lIllllIIlIIll(Players.getLocal().isMoving() ? 1 : 0) && y.lIllllIIllIII(Players.getLocal().getAnimation(), llIllllllI[54])) {
                                String[] stringArray = new String[llIllllllI[0]];
                                stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[9]];
                                TileObjects.getNearest((String[])stringArray).interact(llIllllIlI[llIllllllI[10]]);
                                Time.sleepTicks((int)llIllllllI[4]);
                                0;
                            }
                            g.a(cE);
                        }
                    }
                    if (y.lIllllIIllIII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[3])) {
                        AccBuilderSotf.c = llIllllIlI[llIllllllI[55]];
                        if (y.lIllllIIlIIll(Dialog.isOpen() ? 1 : 0) && y.lIllllIIlIIll(Players.getLocal().isMoving() ? 1 : 0) && y.lIllllIIllIII(Players.getLocal().getAnimation(), llIllllllI[54])) {
                            String[] stringArray = new String[llIllllllI[0]];
                            stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[56]];
                            TileObjects.getNearest((String[])stringArray).interact(llIllllIlI[llIllllllI[57]]);
                            Time.sleepTicks((int)llIllllllI[4]);
                            0;
                        }
                        g.a(cE);
                    }
                    if (y.lIllllIIllIII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[28])) {
                        String[] stringArray = new String[llIllllllI[0]];
                        stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[58]];
                        if (y.lIllllIIlIlIl(TileObjects.getNearest((String[])stringArray))) {
                            String[] stringArray7 = new String[llIllllllI[0]];
                            stringArray7[y.llIllllllI[1]] = llIllllIlI[llIllllllI[59]];
                            String[] stringArray8 = new String[llIllllllI[0]];
                            stringArray8[y.llIllllllI[1]] = llIllllIlI[llIllllllI[60]];
                            if (y.lIllllIIlIIll(TileObjects.getNearest((String[])stringArray7).hasAction(stringArray8) ? 1 : 0)) {
                                AccBuilderSotf.c = llIllllIlI[llIllllllI[12]];
                                if (y.lIllllIIlIIll(Dialog.isOpen() ? 1 : 0) && y.lIllllIIlIIll(Players.getLocal().isMoving() ? 1 : 0) && y.lIllllIIllIII(Players.getLocal().getAnimation(), llIllllllI[54])) {
                                    String[] stringArray9 = new String[llIllllllI[0]];
                                    stringArray9[y.llIllllllI[1]] = llIllllIlI[llIllllllI[61]];
                                    TileObjects.getNearest((String[])stringArray9).interact(llIllllIlI[llIllllllI[62]]);
                                    Time.sleepTicks((int)llIllllllI[4]);
                                    0;
                                }
                            }
                        }
                        String[] stringArray10 = new String[llIllllllI[0]];
                        stringArray10[y.llIllllllI[1]] = llIllllIlI[llIllllllI[63]];
                        if (y.lIllllIIlIlIl(TileObjects.getNearest((String[])stringArray10))) {
                            String[] stringArray11 = new String[llIllllllI[0]];
                            stringArray11[y.llIllllllI[1]] = llIllllIlI[llIllllllI[64]];
                            String[] stringArray12 = new String[llIllllllI[0]];
                            stringArray12[y.llIllllllI[1]] = llIllllIlI[llIllllllI[65]];
                            if (y.lIllllIIlIIIl(TileObjects.getNearest((String[])stringArray11).hasAction(stringArray12) ? 1 : 0)) {
                                String[] stringArray13 = new String[llIllllllI[0]];
                                stringArray13[y.llIllllllI[1]] = llIllllIlI[llIllllllI[66]];
                                TileObjects.getNearest((String[])stringArray13).interact(llIllllIlI[llIllllllI[67]]);
                                Time.sleepTicks((int)llIllllllI[8]);
                                0;
                            }
                        }
                        g.a(cE);
                    }
                    if (y.lIllllIIlIlII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[12]) && y.lIllllIIlIIlI(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[68])) {
                        y.br();
                        if (y.lIllllIIlIIIl(dW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            if (y.lIllllIIlIIll(Dialog.isOpen() ? 1 : 0)) {
                                String[] stringArray = new String[llIllllllI[0]];
                                stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[69]];
                                var48 = NPCs.getNearest((String[])stringArray);
                                if (y.lIllllIIlIlIl(var48)) {
                                    if (y.lIllllIIlIIIl(Reachable.isInteractable((Locatable)var48) ? 1 : 0)) {
                                        g.a(llIllllIlI[llIllllllI[70]], cE);
                                    }
                                    if (y.lIllllIIlIIll(Reachable.isInteractable((Locatable)var48) ? 1 : 0)) {
                                        Movement.walkTo((WorldPoint)var48.getWorldLocation());
                                        0;
                                        Time.sleepTicks((int)llIllllllI[0]);
                                        0;
                                    }
                                }
                            }
                            g.a(cE);
                        }
                    }
                    if (y.lIllllIIllIII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[68])) {
                        if (y.lIllllIIllIIl(Players.getLocal().getWorldLocation().distanceTo(dP), llIllllllI[4])) {
                            AccBuilderSotf.c = llIllllIlI[llIllllllI[32]];
                            Movement.walkTo((WorldPoint)dP);
                            0;
                            Time.sleepTicks((int)llIllllllI[0]);
                            0;
                            g.a(cE);
                        }
                        if (y.lIllllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(dP), llIllllllI[4])) {
                            AccBuilderSotf.c = llIllllIlI[llIllllllI[71]];
                            g.a(llIllllIlI[llIllllllI[72]], cE);
                        }
                    }
                    if (!y.lIllllIIllIll(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[73]) || y.lIllllIIllIII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[74])) {
                        y.bq();
                    }
                    if (y.lIllllIIllIII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[75]) && y.lIllllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(dQ), llIllllllI[12])) {
                        if (y.lIllllIIllIIl(Players.getLocal().getWorldLocation().distanceTo(dQ), llIllllllI[17])) {
                            AccBuilderSotf.c = llIllllIlI[llIllllllI[76]];
                            Movement.walkTo((WorldPoint)dQ);
                            0;
                            Time.sleepTicks((int)llIllllllI[0]);
                            0;
                        }
                        if (y.lIllllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(dQ), llIllllllI[17])) {
                            AccBuilderSotf.c = llIllllIlI[llIllllllI[77]];
                            g.a(llIllllIlI[llIllllllI[78]], cE);
                        }
                    }
                    if (!y.lIllllIIllIll(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[79]) || y.lIllllIIllIII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[80])) {
                        if (y.lIllllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(dQ), llIllllllI[12])) {
                            AccBuilderSotf.c = llIllllIlI[llIllllllI[81]];
                            int[] nArray = new int[llIllllllI[0]];
                            nArray[y.llIllllllI[1]] = llIllllllI[29];
                            if (y.lIllllIIlIIIl(Inventory.contains((int[])nArray) ? 1 : 0) && y.lIllllIIllIII(Players.getLocal().getAnimation(), llIllllllI[54])) {
                                int[] nArray13 = new int[llIllllllI[0]];
                                nArray13[y.llIllllllI[1]] = llIllllllI[29];
                                Inventory.getFirst((int[])nArray13).interact(llIllllIlI[llIllllllI[82]]);
                                Time.sleepTicks((int)llIllllllI[4]);
                                0;
                            }
                        }
                        if (y.lIllllIIllIIl(Players.getLocal().getWorldLocation().distanceTo(dQ), llIllllllI[12])) {
                            String[] stringArray = new String[llIllllllI[0]];
                            stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[83]];
                            if (y.lIllllIIlIlll(NPCs.getNearest((String[])stringArray))) {
                                String[] stringArray14 = new String[llIllllllI[0]];
                                stringArray14[y.llIllllllI[1]] = llIllllIlI[llIllllllI[84]];
                                if (y.lIllllIIlIlll(NPCs.getNearest((String[])stringArray14))) {
                                    AccBuilderSotf.c = llIllllIlI[llIllllllI[68]];
                                    if (y.lIllllIIlIIll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llIllllllI[42], llIllllllI[43], llIllllllI[1])) ? 1 : 0)) {
                                        if (y.lIllllIIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                                            Dialog.close();
                                        }
                                        Movement.walkTo((WorldPoint)new WorldPoint(llIllllllI[42], llIllllllI[43], llIllllllI[1]));
                                        0;
                                        Time.sleepTicks((int)llIllllllI[0]);
                                        0;
                                    }
                                    if (y.lIllllIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llIllllllI[42], llIllllllI[43], llIllllllI[1])) ? 1 : 0)) {
                                        String[] stringArray15 = new String[llIllllllI[0]];
                                        stringArray15[y.llIllllllI[1]] = llIllllIlI[llIllllllI[85]];
                                        TileObjects.getNearest((String[])stringArray15).interact(llIllllIlI[llIllllllI[86]]);
                                        Time.sleepTicks((int)llIllllllI[4]);
                                        0;
                                        String[] stringArray16 = new String[llIllllllI[0]];
                                        stringArray16[y.llIllllllI[1]] = llIllllIlI[llIllllllI[87]];
                                        TileObjects.getNearest((String[])stringArray16).interact(llIllllIlI[llIllllllI[88]]);
                                        Time.sleepTicks((int)llIllllllI[4]);
                                        0;
                                    }
                                }
                            }
                        }
                        String[] stringArray = new String[llIllllllI[0]];
                        stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[73]];
                        if (y.lIllllIIlIlIl(NPCs.getNearest((String[])stringArray))) {
                            AccBuilderSotf.c = llIllllIlI[llIllllllI[89]];
                            g.a(llIllllIlI[llIllllllI[90]], cE);
                        }
                    }
                    if (y.lIllllIIllIII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[91])) {
                        if (y.lIllllIIllIIl(Players.getLocal().getWorldLocation().distanceTo(H.fZ), llIllllllI[8]) && y.lIllllIIlIIll(Dialog.isOpen() ? 1 : 0)) {
                            AccBuilderSotf.c = llIllllIlI[llIllllllI[92]];
                            String[] stringArray = new String[llIllllllI[0]];
                            stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[93]];
                            if (y.lIllllIIlIlIl(NPCs.getNearest((String[])stringArray))) {
                                int[] nArray = new int[llIllllllI[0]];
                                nArray[y.llIllllllI[1]] = llIllllllI[27];
                                Inventory.getFirst((int[])nArray).interact(llIllllIlI[llIllllllI[74]]);
                                Time.sleepTicks((int)llIllllllI[2]);
                                0;
                            }
                            String[] stringArray17 = new String[llIllllllI[0]];
                            stringArray17[y.llIllllllI[1]] = llIllllIlI[llIllllllI[94]];
                            if (y.lIllllIIlIlll(NPCs.getNearest((String[])stringArray17))) {
                                String[] stringArray18 = new String[llIllllllI[0]];
                                stringArray18[y.llIllllllI[1]] = llIllllIlI[llIllllllI[95]];
                                if (y.lIllllIIlIlIl(TileObjects.getNearest((String[])stringArray18))) {
                                    String[] stringArray19 = new String[llIllllllI[0]];
                                    stringArray19[y.llIllllllI[1]] = llIllllIlI[llIllllllI[96]];
                                    TileObjects.getNearest((String[])stringArray19).interact(llIllllIlI[llIllllllI[97]]);
                                    Time.sleepTicks((int)llIllllllI[6]);
                                    0;
                                }
                                Movement.walkTo((WorldPoint)H.fZ);
                                0;
                                Time.sleepTicks((int)llIllllllI[0]);
                                0;
                            }
                        }
                        if (y.lIllllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(H.fZ), llIllllllI[17])) {
                            AccBuilderSotf.c = llIllllIlI[llIllllllI[98]];
                            g.a(llIllllIlI[llIllllllI[99]], cE);
                        }
                        g.a(cE);
                    }
                    if (y.lIllllIIllIII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[100])) {
                        if (y.lIllllIIllIIl(Players.getLocal().getWorldLocation().distanceTo(dR), llIllllllI[6])) {
                            AccBuilderSotf.c = llIllllIlI[llIllllllI[101]];
                            Movement.walkTo((WorldPoint)dR);
                            0;
                            Time.sleepTicks((int)llIllllllI[0]);
                            0;
                        }
                        if (y.lIllllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(dR), llIllllllI[6]) && y.lIllllIIlIIll(Dialog.isOpen() ? 1 : 0)) {
                            AccBuilderSotf.c = llIllllIlI[llIllllllI[102]];
                            int[] nArray = new int[llIllllllI[0]];
                            nArray[y.llIllllllI[1]] = llIllllllI[103];
                            TileObjects.getNearest((int[])nArray).interact(llIllllIlI[llIllllllI[104]]);
                            Time.sleepTicks((int)llIllllllI[4]);
                            0;
                        }
                        g.a(cE);
                    }
                    if (y.lIllllIIllIII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[105])) {
                        if (y.lIllllIIllIIl(Players.getLocal().getWorldLocation().distanceTo(H.fZ), llIllllllI[8]) && y.lIllllIIlIIll(Dialog.isOpen() ? 1 : 0)) {
                            AccBuilderSotf.c = llIllllIlI[llIllllllI[75]];
                            if (y.lIllllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(dR), llIllllllI[17])) {
                                int[] nArray = new int[llIllllllI[0]];
                                nArray[y.llIllllllI[1]] = llIllllllI[27];
                                Inventory.getFirst((int[])nArray).interact(llIllllIlI[llIllllllI[106]]);
                                Time.sleepTicks((int)llIllllllI[2]);
                                0;
                            }
                            if (y.lIllllIIllIIl(Players.getLocal().getWorldLocation().distanceTo(dR), llIllllllI[17])) {
                                String[] stringArray = new String[llIllllllI[0]];
                                stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[107]];
                                if (y.lIllllIIlIlIl(TileObjects.getNearest((String[])stringArray))) {
                                    String[] stringArray20 = new String[llIllllllI[0]];
                                    stringArray20[y.llIllllllI[1]] = llIllllIlI[llIllllllI[108]];
                                    TileObjects.getNearest((String[])stringArray20).interact(llIllllIlI[llIllllllI[109]]);
                                    Time.sleepTicks((int)llIllllllI[6]);
                                    0;
                                }
                                Movement.walkTo((WorldPoint)H.fZ);
                                0;
                                Time.sleepTicks((int)llIllllllI[0]);
                                0;
                            }
                        }
                        if (y.lIllllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(H.fZ), llIllllllI[17])) {
                            AccBuilderSotf.c = llIllllIlI[llIllllllI[110]];
                            g.a(llIllllIlI[llIllllllI[111]], cE);
                        }
                    }
                    if (y.lIllllIIlIlII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[112]) && y.lIllllIIlIIlI(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[113])) {
                        if (y.lIllllIIllIIl(Players.getLocal().getWorldLocation().distanceTo(H.fS), llIllllllI[6])) {
                            AccBuilderSotf.c = llIllllIlI[llIllllllI[114]];
                            Movement.walkTo((WorldPoint)H.fS);
                            0;
                            Time.sleepTicks((int)llIllllllI[0]);
                            0;
                        }
                        if (y.lIllllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(H.fS), llIllllllI[6])) {
                            AccBuilderSotf.c = llIllllIlI[llIllllllI[115]];
                            g.a(llIllllIlI[llIllllllI[116]], cE);
                        }
                    }
                    if (y.lIllllIIllIII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[113])) {
                        String[] stringArray = new String[llIllllllI[0]];
                        stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[79]];
                        if (y.lIllllIIlIlll(NPCs.getNearest((String[])stringArray))) {
                            AccBuilderSotf.c = llIllllIlI[llIllllllI[117]];
                            if (y.lIllllIIlIIll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llIllllllI[42], llIllllllI[43], llIllllllI[1])) ? 1 : 0)) {
                                if (y.lIllllIIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                                    Dialog.close();
                                }
                                Movement.walkTo((WorldPoint)new WorldPoint(llIllllllI[42], llIllllllI[43], llIllllllI[1]));
                                0;
                                Time.sleepTicks((int)llIllllllI[0]);
                                0;
                            }
                            if (y.lIllllIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llIllllllI[42], llIllllllI[43], llIllllllI[1])) ? 1 : 0)) {
                                String[] stringArray21 = new String[llIllllllI[0]];
                                stringArray21[y.llIllllllI[1]] = llIllllIlI[llIllllllI[118]];
                                TileObjects.getNearest((String[])stringArray21).interact(llIllllIlI[llIllllllI[119]]);
                                Time.sleepTicks((int)llIllllllI[4]);
                                0;
                                String[] stringArray22 = new String[llIllllllI[0]];
                                stringArray22[y.llIllllllI[1]] = llIllllIlI[llIllllllI[120]];
                                TileObjects.getNearest((String[])stringArray22).interact(llIllllIlI[llIllllllI[121]]);
                                Time.sleepTicks((int)llIllllllI[4]);
                                0;
                            }
                        }
                        String[] stringArray23 = new String[llIllllllI[0]];
                        stringArray23[y.llIllllllI[1]] = llIllllIlI[llIllllllI[122]];
                        if (y.lIllllIIlIlIl(NPCs.getNearest((String[])stringArray23))) {
                            AccBuilderSotf.c = llIllllIlI[llIllllllI[123]];
                            g.a(llIllllIlI[llIllllllI[124]], cE);
                        }
                    }
                    if (y.lIllllIIllIII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[125])) {
                        if (y.lIllllIIllIIl(Players.getLocal().getWorldLocation().distanceTo(dO), llIllllllI[30])) {
                            String[] stringArray = new String[llIllllllI[0]];
                            stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[126]];
                            if (y.lIllllIIlIlIl(NPCs.getNearest((String[])stringArray))) {
                                String[] stringArray24 = new String[llIllllllI[0]];
                                stringArray24[y.llIllllllI[1]] = llIllllIlI[llIllllllI[80]];
                                TileObjects.getNearest((String[])stringArray24).interact(llIllllIlI[llIllllllI[127]]);
                                Time.sleepTicks((int)llIllllllI[8]);
                                0;
                            }
                            String[] stringArray25 = new String[llIllllllI[0]];
                            stringArray25[y.llIllllllI[1]] = llIllllIlI[llIllllllI[128]];
                            if (y.lIllllIIlIlll(NPCs.getNearest((String[])stringArray25)) && y.lIllllIIlIIIl(dX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && y.lIllllIIlIIll(Dialog.isOpen() ? 1 : 0)) {
                                AccBuilderSotf.c = llIllllIlI[llIllllllI[129]];
                                Movement.walkTo((WorldPoint)dO);
                                0;
                                Time.sleepTicks((int)llIllllllI[0]);
                                0;
                            }
                        }
                        if (y.lIllllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(dO), llIllllllI[30])) {
                            if (y.lIllllIIlIIll(Dialog.isOpen() ? 1 : 0) && y.lIllllIIlIIll(Players.getLocal().isMoving() ? 1 : 0) && y.lIllllIIllIII(Players.getLocal().getAnimation(), llIllllllI[54])) {
                                String[] stringArray = new String[llIllllllI[0]];
                                stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[130]];
                                TileObjects.getNearest((String[])stringArray).interact(llIllllIlI[llIllllllI[131]]);
                                Time.sleepTicks((int)llIllllllI[4]);
                                0;
                            }
                            g.a(cE);
                        }
                        if (!y.lIllllIIllIIl(Players.getLocal().getWorldLocation().distanceTo(dV), llIllllllI[28]) || y.lIllllIIlIIIl(new WorldArea(llIllllllI[132], llIllllllI[133], llIllllllI[13], llIllllllI[21], llIllllllI[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = llIllllIlI[llIllllllI[134]];
                            if (y.lIllllIIlIIll(dW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                y.br();
                            }
                        }
                        if (y.lIllllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(dQ), llIllllllI[12])) {
                            if (y.lIllllIIllIIl(Players.getLocal().getWorldLocation().distanceTo(dQ), llIllllllI[17])) {
                                AccBuilderSotf.c = llIllllIlI[llIllllllI[135]];
                                Movement.walkTo((WorldPoint)dQ);
                                0;
                                Time.sleepTicks((int)llIllllllI[0]);
                                0;
                            }
                            if (y.lIllllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(dQ), llIllllllI[17])) {
                                AccBuilderSotf.c = llIllllIlI[llIllllllI[136]];
                                g.a(llIllllIlI[llIllllllI[137]], cE);
                            }
                        }
                        y.bq();
                    }
                    if (y.lIllllIIllIII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[138])) {
                        g.a(cE);
                        if (y.lIllllIIlIIll(Dialog.isOpen() ? 1 : 0)) {
                            y.bo();
                        }
                    }
                    if (y.lIllllIIllIII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[139])) {
                        g.a(cE);
                    }
                    if (y.lIllllIIllIII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[140])) {
                        if (y.lIllllIIllIIl(Players.getLocal().getWorldLocation().distanceTo(dS), llIllllllI[6])) {
                            AccBuilderSotf.c = llIllllIlI[llIllllllI[91]];
                            Movement.walkTo((WorldPoint)dS);
                            0;
                            Time.sleepTicks((int)llIllllllI[0]);
                            0;
                        }
                        if (y.lIllllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(dS), llIllllllI[6])) {
                            AccBuilderSotf.c = llIllllIlI[llIllllllI[141]];
                            int[] nArray = new int[llIllllllI[0]];
                            nArray[y.llIllllllI[1]] = llIllllllI[142];
                            int[] nArray14 = new int[llIllllllI[0]];
                            nArray14[y.llIllllllI[1]] = llIllllllI[143];
                            Inventory.getFirst((int[])nArray).useOn(Inventory.getFirst((int[])nArray14));
                            Time.sleepTicks((int)llIllllllI[2]);
                            0;
                        }
                    }
                    if (y.lIllllIIllIII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[144])) {
                        if (y.lIllllIIllIIl(Players.getLocal().getWorldLocation().distanceTo(dT), llIllllllI[6])) {
                            AccBuilderSotf.c = llIllllIlI[llIllllllI[145]];
                            Movement.walkTo((WorldPoint)dT);
                            0;
                            Time.sleepTicks((int)llIllllllI[0]);
                            0;
                        }
                        if (y.lIllllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(dT), llIllllllI[6]) && y.lIllllIIlIIll(Dialog.isOpen() ? 1 : 0)) {
                            AccBuilderSotf.c = llIllllIlI[llIllllllI[146]];
                            int[] nArray = new int[llIllllllI[0]];
                            nArray[y.llIllllllI[1]] = llIllllllI[142];
                            int[] nArray15 = new int[llIllllllI[0]];
                            nArray15[y.llIllllllI[1]] = llIllllllI[143];
                            Inventory.getFirst((int[])nArray).useOn(Inventory.getFirst((int[])nArray15));
                            Time.sleepTicks((int)llIllllllI[2]);
                            0;
                        }
                        g.a(cE);
                    }
                    if (y.lIllllIIllIII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[147])) {
                        if (y.lIllllIIllIIl(Players.getLocal().getWorldLocation().distanceTo(dU), llIllllllI[6]) && y.lIllllIIlIIll(Dialog.isOpen() ? 1 : 0)) {
                            AccBuilderSotf.c = llIllllIlI[llIllllllI[148]];
                            Movement.walkTo((WorldPoint)dU);
                            0;
                            Time.sleepTicks((int)llIllllllI[0]);
                            0;
                        }
                        if (y.lIllllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(dU), llIllllllI[6]) && y.lIllllIIlIIll(Dialog.isOpen() ? 1 : 0)) {
                            if (y.lIllllIIlIIlI(Prayers.getPoints(), llIllllllI[49]) && y.lIllllIIlIIIl(Inventory.contains((int[])f.aX) ? 1 : 0)) {
                                Inventory.getFirst((int[])f.aX).interact(llIllllIlI[llIllllllI[149]]);
                                Time.sleepTicks((int)llIllllllI[0]);
                                0;
                            }
                            if (y.lIllllIIlIIll(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                            }
                            if (y.lIllllIIlIIIl(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                AccBuilderSotf.c = llIllllIlI[llIllllllI[150]];
                                int[] nArray = new int[llIllllllI[0]];
                                nArray[y.llIllllllI[1]] = llIllllllI[142];
                                int[] nArray16 = new int[llIllllllI[0]];
                                nArray16[y.llIllllllI[1]] = llIllllllI[143];
                                Inventory.getFirst((int[])nArray).useOn(Inventory.getFirst((int[])nArray16));
                                Time.sleepTicks((int)llIllllllI[2]);
                                0;
                            }
                        }
                        g.a(cE);
                    }
                    if (y.lIllllIIllIII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[151]) && y.lIllllIIlIIll(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                        Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                    }
                    if (y.lIllllIIllIII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[152])) {
                        // empty if block
                    }
                    if (!y.lIllllIIllIll(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[153]) || y.lIllllIIllIII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[154])) {
                        String[] stringArray = new String[llIllllllI[0]];
                        stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[155]];
                        if (y.lIllllIIlIIll(Inventory.contains((String[])stringArray) ? 1 : 0) && y.lIllllIIllIIl(Players.getLocal().getWorldLocation().distanceTo(dQ), llIllllllI[28])) {
                            if (y.lIllllIIllIIl(Players.getLocal().getWorldLocation().distanceTo(dU), llIllllllI[6]) && y.lIllllIIlIIll(Dialog.isOpen() ? 1 : 0)) {
                                AccBuilderSotf.c = llIllllIlI[llIllllllI[156]];
                                Movement.walkTo((WorldPoint)dU);
                                0;
                                Time.sleepTicks((int)llIllllllI[0]);
                                0;
                            }
                            if (y.lIllllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(dU), llIllllllI[6]) && y.lIllllIIlIIll(Dialog.isOpen() ? 1 : 0)) {
                                if (y.lIllllIIlIIll(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                    Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                                }
                                if (y.lIllllIIlIIIl(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                    AccBuilderSotf.c = llIllllIlI[llIllllllI[157]];
                                    int[] nArray = new int[llIllllllI[0]];
                                    nArray[y.llIllllllI[1]] = llIllllllI[142];
                                    int[] nArray17 = new int[llIllllllI[0]];
                                    nArray17[y.llIllllllI[1]] = llIllllllI[143];
                                    Inventory.getFirst((int[])nArray).useOn(Inventory.getFirst((int[])nArray17));
                                    Time.sleepTicks((int)llIllllllI[2]);
                                    0;
                                }
                            }
                        }
                        String[] stringArray26 = new String[llIllllllI[0]];
                        stringArray26[y.llIllllllI[1]] = llIllllIlI[llIllllllI[100]];
                        if (y.lIllllIIlIIIl(Inventory.contains((String[])stringArray26) ? 1 : 0)) {
                            if (y.lIllllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(dU), llIllllllI[30])) {
                                int[] nArray = new int[llIllllllI[0]];
                                nArray[y.llIllllllI[1]] = llIllllllI[29];
                                Inventory.getFirst((int[])nArray).interact(llIllllIlI[llIllllllI[158]]);
                                Time.sleepTicks((int)llIllllllI[2]);
                                0;
                            }
                            if (y.lIllllIIlIIIl(dZ.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && y.lIllllIIllIIl(Players.getLocal().getWorldLocation().distanceTo(dO), llIllllllI[30])) {
                                if (y.lIllllIIlIIIl(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                    Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                                }
                                AccBuilderSotf.c = llIllllIlI[llIllllllI[159]];
                                Movement.walkTo((WorldPoint)dO);
                                0;
                                Time.sleepTicks((int)llIllllllI[0]);
                                0;
                            }
                            String[] stringArray27 = new String[llIllllllI[0]];
                            stringArray27[y.llIllllllI[1]] = llIllllIlI[llIllllllI[160]];
                            if (y.lIllllIIlIlll(NPCs.getNearest((String[])stringArray27)) && y.lIllllIIlIIIl(dX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && y.lIllllIIlIIll(Dialog.isOpen() ? 1 : 0) && y.lIllllIIllIIl(Players.getLocal().getWorldLocation().distanceTo(dO), llIllllllI[30])) {
                                AccBuilderSotf.c = llIllllIlI[llIllllllI[161]];
                                Movement.walkTo((WorldPoint)dO);
                                0;
                                Time.sleepTicks((int)llIllllllI[0]);
                                0;
                            }
                            if (y.lIllllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(dO), llIllllllI[30])) {
                                if (y.lIllllIIlIIll(Dialog.isOpen() ? 1 : 0) && y.lIllllIIlIIll(Players.getLocal().isMoving() ? 1 : 0) && y.lIllllIIllIII(Players.getLocal().getAnimation(), llIllllllI[54])) {
                                    String[] stringArray28 = new String[llIllllllI[0]];
                                    stringArray28[y.llIllllllI[1]] = llIllllIlI[llIllllllI[162]];
                                    TileObjects.getNearest((String[])stringArray28).interact(llIllllIlI[llIllllllI[163]]);
                                    Time.sleepTicks((int)llIllllllI[4]);
                                    0;
                                }
                                g.a(cE);
                            }
                            if (!y.lIllllIIllIIl(Players.getLocal().getWorldLocation().distanceTo(dV), llIllllllI[28]) || y.lIllllIIlIIIl(new WorldArea(llIllllllI[132], llIllllllI[133], llIllllllI[13], llIllllllI[21], llIllllllI[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderSotf.c = llIllllIlI[llIllllllI[164]];
                                if (y.lIllllIIlIIll(dW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    y.br();
                                }
                            }
                            if (y.lIllllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(dQ), llIllllllI[12])) {
                                if (y.lIllllIIllIIl(Players.getLocal().getWorldLocation().distanceTo(dQ), llIllllllI[17])) {
                                    AccBuilderSotf.c = llIllllIlI[llIllllllI[165]];
                                    Movement.walkTo((WorldPoint)dQ);
                                    0;
                                    Time.sleepTicks((int)llIllllllI[0]);
                                    0;
                                }
                                if (y.lIllllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(dQ), llIllllllI[17])) {
                                    AccBuilderSotf.c = llIllllIlI[llIllllllI[166]];
                                    g.a(llIllllIlI[llIllllllI[105]], cE);
                                }
                            }
                            y.bq();
                        }
                    }
                    if (!y.lIllllIIllIll(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[167]) || !y.lIllllIIllIll(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[168]) || y.lIllllIIllIII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[169])) {
                        y.bn();
                    }
                    if (y.lIllllIIllIII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[26])) {
                        int[] nArray = new int[llIllllllI[0]];
                        nArray[y.llIllllllI[1]] = llIllllllI[170];
                        if (y.lIllllIIlIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            var48 = new WorldArea(llIllllllI[171], llIllllllI[172], llIllllllI[4], llIllllllI[13], llIllllllI[1]);
                            if (y.lIllllIIlIIIl(var48.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderSotf.c = llIllllIlI[llIllllllI[173]];
                                String[] stringArray = new String[llIllllllI[0]];
                                stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[174]];
                                TileObjects.getNearest((String[])stringArray).interact(llIllllIlI[llIllllllI[175]]);
                                Time.sleepTicks((int)llIllllllI[8]);
                                0;
                            }
                            String[] stringArray = new String[llIllllllI[0]];
                            stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[176]];
                            if (y.lIllllIIlIlIl(TileObjects.getNearest((String[])stringArray))) {
                                var55 = new WorldPoint(llIllllllI[177], llIllllllI[178], llIllllllI[1]);
                                if (y.lIllllIIllIIl(Players.getLocal().getWorldLocation().distanceTo(var55), llIllllllI[4])) {
                                    AccBuilderSotf.c = llIllllIlI[llIllllllI[179]];
                                    Movement.walkTo((WorldPoint)var55);
                                    0;
                                    Time.sleepTicks((int)llIllllllI[0]);
                                    0;
                                }
                                if (y.lIllllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(var55), llIllllllI[4])) {
                                    AccBuilderSotf.c = llIllllIlI[llIllllllI[180]];
                                    int[] nArray18 = new int[llIllllllI[0]];
                                    nArray18[y.llIllllllI[1]] = llIllllllI[170];
                                    Magic.cast((Spell)SpellBook.Standard.TELEKINETIC_GRAB, (TileItem)TileItems.getNearest((int[])nArray18));
                                    Time.sleepTicks((int)llIllllllI[11]);
                                    0;
                                }
                            }
                        }
                        int[] nArray19 = new int[llIllllllI[0]];
                        nArray19[y.llIllllllI[1]] = llIllllllI[170];
                        if (y.lIllllIIlIIIl(Inventory.contains((int[])nArray19) ? 1 : 0)) {
                            y.bm();
                            if (y.lIllllIIllIIl(Players.getLocal().getWorldLocation().distanceTo(dQ), llIllllllI[13]) && y.lIllllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(dQ), llIllllllI[12])) {
                                AccBuilderSotf.c = llIllllIlI[llIllllllI[181]];
                                Movement.walkTo((WorldPoint)dQ);
                                0;
                                Time.sleepTicks((int)llIllllllI[0]);
                                0;
                            }
                            if (y.lIllllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(dQ), llIllllllI[17])) {
                                AccBuilderSotf.c = llIllllIlI[llIllllllI[182]];
                                g.a(llIllllIlI[llIllllllI[183]], cE);
                            }
                        }
                    }
                    if (y.lIllllIIllIII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[184])) {
                        if (y.lIllllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(dQ), llIllllllI[30])) {
                            int[] nArray = new int[llIllllllI[0]];
                            nArray[y.llIllllllI[1]] = llIllllllI[29];
                            Inventory.getFirst((int[])nArray).interact(llIllllIlI[llIllllllI[112]]);
                            Time.sleepTicks((int)llIllllllI[2]);
                            0;
                        }
                        String[] stringArray = new String[llIllllllI[0]];
                        stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[185]];
                        if (y.lIllllIIlIlll(NPCs.getNearest((String[])stringArray)) && y.lIllllIIllIIl(Players.getLocal().getWorldLocation().distanceTo(dQ), llIllllllI[28])) {
                            AccBuilderSotf.c = llIllllIlI[llIllllllI[186]];
                            if (y.lIllllIIlIIll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llIllllllI[42], llIllllllI[43], llIllllllI[1])) ? 1 : 0)) {
                                if (y.lIllllIIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                                    Dialog.close();
                                }
                                Movement.walkTo((WorldPoint)new WorldPoint(llIllllllI[42], llIllllllI[43], llIllllllI[1]));
                                0;
                                Time.sleepTicks((int)llIllllllI[0]);
                                0;
                            }
                            if (y.lIllllIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llIllllllI[42], llIllllllI[43], llIllllllI[1])) ? 1 : 0)) {
                                String[] stringArray29 = new String[llIllllllI[0]];
                                stringArray29[y.llIllllllI[1]] = llIllllIlI[llIllllllI[187]];
                                TileObjects.getNearest((String[])stringArray29).interact(llIllllIlI[llIllllllI[188]]);
                                Time.sleepTicks((int)llIllllllI[4]);
                                0;
                                String[] stringArray30 = new String[llIllllllI[0]];
                                stringArray30[y.llIllllllI[1]] = llIllllIlI[llIllllllI[189]];
                                TileObjects.getNearest((String[])stringArray30).interact(llIllllIlI[llIllllllI[190]]);
                                Time.sleepTicks((int)llIllllllI[4]);
                                0;
                            }
                        }
                        String[] stringArray31 = new String[llIllllllI[0]];
                        stringArray31[y.llIllllllI[1]] = llIllllIlI[llIllllllI[191]];
                        if (y.lIllllIIlIlIl(NPCs.getNearest((String[])stringArray31))) {
                            AccBuilderSotf.c = llIllllIlI[llIllllllI[192]];
                            g.a(llIllllIlI[llIllllllI[193]], cE);
                        }
                    }
                    if (!y.lIllllIIllIII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[194])) break block181;
                    String[] stringArray = new String[llIllllllI[0]];
                    stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[195]];
                    if (!y.lIllllIIlIIll(Inventory.contains((String[])stringArray) ? 1 : 0)) break block182;
                    String[] stringArray32 = new String[llIllllllI[0]];
                    stringArray32[y.llIllllllI[1]] = llIllllIlI[llIllllllI[196]];
                    if (!y.lIllllIIlIIll(Inventory.contains((String[])stringArray32) ? 1 : 0)) break block182;
                    String[] stringArray33 = new String[llIllllllI[0]];
                    stringArray33[y.llIllllllI[1]] = llIllllIlI[llIllllllI[197]];
                    if (!y.lIllllIIlIIIl(Inventory.contains((String[])stringArray33) ? 1 : 0)) break block181;
                }
                if (y.lIllllIIlIIlI(di, llIllllllI[0])) {
                    aN.rU += llIllllllI[0];
                    aN.u(AccBuilderSotf.m);
                    di += llIllllllI[0];
                    aN.rU = llIllllllI[1];
                    dj = llIllllllI[1];
                }
                if (y.lIllllIIlIlIl(Widgets.get((int)llIllllllI[152]))) {
                    AccBuilderSotf.c = llIllllIlI[llIllllllI[198]];
                    String[] stringArray = new String[llIllllllI[0]];
                    stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[199]];
                    if (y.lIllllIIlIIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        String[] stringArray34 = new String[llIllllllI[0]];
                        stringArray34[y.llIllllllI[1]] = llIllllIlI[llIllllllI[200]];
                        Inventory.getFirst((String[])stringArray34).interact(llIllllIlI[llIllllllI[201]]);
                        Time.sleepTicks((int)llIllllllI[8]);
                        0;
                    }
                    String[] stringArray35 = new String[llIllllllI[0]];
                    stringArray35[y.llIllllllI[1]] = llIllllIlI[llIllllllI[202]];
                    if (y.lIllllIIlIIIl(Inventory.contains((String[])stringArray35) ? 1 : 0)) {
                        String[] stringArray36 = new String[llIllllllI[0]];
                        stringArray36[y.llIllllllI[1]] = llIllllIlI[llIllllllI[203]];
                        Inventory.getFirst((String[])stringArray36).interact(llIllllIlI[llIllllllI[204]]);
                        Time.sleepTicks((int)llIllllllI[8]);
                        0;
                    }
                    String[] stringArray37 = new String[llIllllllI[0]];
                    stringArray37[y.llIllllllI[1]] = llIllllIlI[llIllllllI[205]];
                    if (y.lIllllIIlIIIl(Inventory.contains((String[])stringArray37) ? 1 : 0)) {
                        String[] stringArray38 = new String[llIllllllI[0]];
                        stringArray38[y.llIllllllI[1]] = llIllllIlI[llIllllllI[206]];
                        Inventory.getFirst((String[])stringArray38).interact(llIllllIlI[llIllllllI[207]]);
                        Time.sleepTicks((int)llIllllllI[8]);
                        0;
                    }
                    AccBuilderSotf.c = llIllllIlI[llIllllllI[208]];
                    var48 = Widgets.get((int)llIllllllI[152], (int)llIllllllI[16]);
                    if (y.lIllllIIlIlIl(var48)) {
                        var48.interact(llIllllIlI[llIllllllI[209]]);
                        Time.sleepTicks((int)llIllllllI[0]);
                        0;
                    }
                    if (y.lIllllIIlIlIl(var55 = Widgets.get((int)llIllllllI[152], (int)llIllllllI[7]))) {
                        var55.interact(llIllllIlI[llIllllllI[210]]);
                        Time.sleepTicks((int)llIllllllI[4]);
                        0;
                    }
                }
                Time.sleepTicks((int)llIllllllI[4]);
                0;
            }
            if (y.lIllllIIllIII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[194])) {
                String[] stringArray = new String[llIllllllI[0]];
                stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[211]];
                if (y.lIllllIIlIIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray39 = new String[llIllllllI[0]];
                    stringArray39[y.llIllllllI[1]] = llIllllIlI[llIllllllI[212]];
                    if (y.lIllllIIlIIll(Inventory.contains((String[])stringArray39) ? 1 : 0)) {
                        String[] stringArray40 = new String[llIllllllI[0]];
                        stringArray40[y.llIllllllI[1]] = llIllllIlI[llIllllllI[213]];
                        if (y.lIllllIIlIIll(Inventory.contains((String[])stringArray40) ? 1 : 0)) {
                            String[] stringArray41 = new String[llIllllllI[0]];
                            stringArray41[y.llIllllllI[1]] = llIllllIlI[llIllllllI[214]];
                            if (!y.lIllllIIlIlll(NPCs.getNearest((String[])stringArray41)) || y.lIllllIIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                                if (y.lIllllIIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                                    Dialog.close();
                                }
                                int[] nArray = new int[llIllllllI[0]];
                                nArray[y.llIllllllI[1]] = llIllllllI[33];
                                if (y.lIllllIIlIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                    String[] stringArray42 = new String[llIllllllI[0]];
                                    stringArray42[y.llIllllllI[1]] = llIllllIlI[llIllllllI[113]];
                                    if (y.lIllllIIlIlIl(NPCs.getNearest((String[])stringArray42))) {
                                        int[] nArray20 = new int[llIllllllI[0]];
                                        nArray20[y.llIllllllI[1]] = llIllllllI[33];
                                        Inventory.getFirst((int[])nArray20).interact(llIllllIlI[llIllllllI[215]]);
                                        Time.sleepTicks((int)llIllllllI[11]);
                                        0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            g.a(cE);
        }
    }

    private static boolean lIllllIIlIlll(Object object) {
        return object == null;
    }

    private static boolean lIllllIIlIlII(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    public static void bn() {
        TileObject var79;
        WorldArea var35;
        void var106;
        WorldArea worldArea = new WorldArea(llIllllllI[226], llIllllllI[239], llIllllllI[2], llIllllllI[2], llIllllllI[1]);
        WorldPoint worldPoint = new WorldPoint(llIllllllI[240], llIllllllI[241], llIllllllI[1]);
        if (y.lIllllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(dQ), llIllllllI[12])) {
            void var63;
            if (y.lIllllIIllIIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint), llIllllllI[2])) {
                AccBuilderSotf.c = llIllllIlI[llIllllllI[242]];
                Movement.walkTo((WorldPoint)worldPoint);
                0;
                Time.sleepTicks((int)llIllllllI[0]);
                0;
            }
            if (y.lIllllIIllIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var63), llIllllllI[2])) {
                AccBuilderSotf.c = llIllllIlI[llIllllllI[243]];
                String[] stringArray = new String[llIllllllI[0]];
                stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[244]];
                TileObjects.getNearest((String[])stringArray).interact(llIllllIlI[llIllllllI[245]]);
                Time.sleepTicks((int)llIllllllI[8]);
                0;
            }
        }
        if (y.lIllllIIlIIIl(var106.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[246]];
            String[] stringArray = new String[llIllllllI[0]];
            stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[247]];
            TileObjects.getNearest((String[])stringArray).interact(llIllllIlI[llIllllllI[138]]);
            Time.sleepTicks((int)llIllllllI[6]);
            0;
        }
        if (y.lIllllIIlIIIl((var35 = new WorldArea(llIllllllI[226], llIllllllI[227], llIllllllI[11], llIllllllI[11], llIllllllI[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[248]];
            String[] stringArray = new String[llIllllllI[0]];
            stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[249]];
            TileObjects.getNearest((String[])stringArray).interact(llIllllIlI[llIllllllI[250]]);
            Time.sleepTicks((int)llIllllllI[6]);
            0;
        }
        WorldArea var68 = new WorldArea(llIllllllI[177], llIllllllI[251], llIllllllI[11], llIllllllI[2], llIllllllI[0]);
        WorldArea var22 = new WorldArea(llIllllllI[223], llIllllllI[252], llIllllllI[2], llIllllllI[13], llIllllllI[0]);
        WorldPoint var18 = new WorldPoint(llIllllllI[226], llIllllllI[253], llIllllllI[0]);
        if (y.lIllllIIlIIIl(var22.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (y.lIllllIIlIIll(Players.getLocal().getWorldLocation().equals((Object)var18) ? 1 : 0)) {
                AccBuilderSotf.c = llIllllIlI[llIllllllI[254]];
                Movement.walkTo((WorldPoint)var18);
                0;
            }
            if (y.lIllllIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)var18) ? 1 : 0)) {
                int[] nArray = new int[llIllllllI[0]];
                nArray[y.llIllllllI[1]] = llIllllllI[255];
                TileObjects.getNearest((int[])nArray).interact(llIllllIlI[llIllllllI[139]]);
                Time.sleepTicks((int)llIllllllI[6]);
                0;
            }
        }
        if (y.lIllllIIlIIIl(var68.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[256]];
            String[] stringArray = new String[llIllllllI[0]];
            stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[257]];
            TileObjects.getNearest((String[])stringArray).interact(llIllllIlI[llIllllllI[258]]);
            Time.sleepTicks((int)llIllllllI[6]);
            0;
        }
        WorldArea var108 = new WorldArea(llIllllllI[216], llIllllllI[217], llIllllllI[51], llIllllllI[68], llIllllllI[1]);
        WorldArea var5 = new WorldArea(llIllllllI[218], llIllllllI[219], llIllllllI[11], llIllllllI[8], llIllllllI[1]);
        WorldPoint var101 = new WorldPoint(llIllllllI[220], llIllllllI[172], llIllllllI[1]);
        WorldArea var51 = new WorldArea(llIllllllI[223], llIllllllI[224], llIllllllI[13], llIllllllI[11], llIllllllI[1]);
        WorldArea var26 = new WorldArea(llIllllllI[225], llIllllllI[172], llIllllllI[6], llIllllllI[8], llIllllllI[1]);
        WorldArea var13 = new WorldArea(llIllllllI[171], llIllllllI[172], llIllllllI[4], llIllllllI[13], llIllllllI[1]);
        if (y.lIllllIIlIIll(var5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && y.lIllllIIlIIIl(var108.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && y.lIllllIIlIIll(var35.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && y.lIllllIIlIIll(var51.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && y.lIllllIIlIIll(var26.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && y.lIllllIIlIIll(var13.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[259]];
            Movement.walkTo((WorldPoint)var101);
            0;
            Time.sleepTicks((int)llIllllllI[0]);
            0;
        }
        if (y.lIllllIIlIIIl(var5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[140]];
            String[] stringArray = new String[llIllllllI[0]];
            stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[260]];
            var79 = TileObjects.getNearest((String[])stringArray);
            if (y.lIllllIIllIII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[167]) && y.lIllllIIlIlIl(var79)) {
                int[] nArray = new int[llIllllllI[0]];
                nArray[y.llIllllllI[1]] = llIllllllI[35];
                Inventory.getFirst((int[])nArray).useOn(var79);
                Time.sleepTicks((int)llIllllllI[6]);
                0;
            }
            if (y.lIllllIIllIII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[168])) {
                String[] stringArray2 = new String[llIllllllI[0]];
                stringArray2[y.llIllllllI[1]] = llIllllIlI[llIllllllI[261]];
                if (y.lIllllIIlIlIl(TileObjects.getNearest((String[])stringArray2))) {
                    String[] stringArray3 = new String[llIllllllI[0]];
                    stringArray3[y.llIllllllI[1]] = llIllllIlI[llIllllllI[262]];
                    TileObjects.getNearest((String[])stringArray3).interact(llIllllIlI[llIllllllI[263]]);
                    Time.sleepTicks((int)llIllllllI[6]);
                    0;
                }
            }
        }
        if (y.lIllllIIllIII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[168]) && (!y.lIllllIIlIIll(var51.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || y.lIllllIIlIIIl(var26.contains(Players.getLocal().getWorldLocation()) ? 1 : 0))) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[264]];
            String[] stringArray = new String[llIllllllI[0]];
            stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[265]];
            String[] stringArray4 = new String[llIllllllI[0]];
            stringArray4[y.llIllllllI[1]] = llIllllIlI[llIllllllI[266]];
            Inventory.getFirst((String[])stringArray).useOn(TileObjects.getNearest((String[])stringArray4));
            Time.sleepTicks((int)llIllllllI[6]);
            0;
        }
        if (y.lIllllIIllIII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[169])) {
            var79 = new WorldPoint(llIllllllI[267], llIllllllI[268], llIllllllI[1]);
            if (y.lIllllIIlIIll(var13.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = llIllllIlI[llIllllllI[269]];
                Movement.walkTo((WorldPoint)var79);
                0;
                Time.sleepTicks((int)llIllllllI[0]);
                0;
            }
            if (y.lIllllIIlIIIl(var13.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = llIllllIlI[llIllllllI[270]];
                String[] stringArray = new String[llIllllllI[0]];
                stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[144]];
                TileObjects.getNearest((String[])stringArray).interact(llIllllIlI[llIllllllI[271]]);
                Time.sleepTicks((int)llIllllllI[8]);
                0;
            }
        }
        if (y.lIllllIIllIII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[26]) && y.lIllllIIlIIIl(var13.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[272]];
            String[] stringArray = new String[llIllllllI[0]];
            stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[273]];
            TileObjects.getNearest((String[])stringArray).interact(llIllllIlI[llIllllllI[274]]);
            Time.sleepTicks((int)llIllllllI[8]);
            0;
        }
    }

    @Override
    public boolean ae() {
        return llIllllllI[1];
    }

    public static void bp() {
        String[] stringArray = new String[llIllllllI[0]];
        stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[341]];
        if (y.lIllllIIlIlll(NPCs.getNearest((String[])stringArray)) && y.lIllllIIlIIll(Dialog.isOpen() ? 1 : 0) && y.lIllllIIllIIl(Players.getLocal().getWorldLocation().distanceTo(dO), llIllllllI[30]) && y.lIllllIIllIIl(Players.getLocal().getWorldLocation().distanceTo(dV), llIllllllI[65])) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[342]];
            Movement.walkTo((WorldPoint)dO);
            0;
            Time.sleepTicks((int)llIllllllI[0]);
            0;
        }
        if (y.lIllllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(dO), llIllllllI[30])) {
            if (y.lIllllIIlIIll(Dialog.isOpen() ? 1 : 0) && y.lIllllIIlIIll(Players.getLocal().isMoving() ? 1 : 0) && y.lIllllIIllIII(Players.getLocal().getAnimation(), llIllllllI[54])) {
                String[] stringArray2 = new String[llIllllllI[0]];
                stringArray2[y.llIllllllI[1]] = llIllllIlI[llIllllllI[343]];
                TileObjects.getNearest((String[])stringArray2).interact(llIllllIlI[llIllllllI[344]]);
                Time.sleepTicks((int)llIllllllI[4]);
                0;
            }
            g.a(cE);
        }
        if (!y.lIllllIIllIIl(Players.getLocal().getWorldLocation().distanceTo(dV), llIllllllI[28]) || y.lIllllIIlIIIl(new WorldArea(llIllllllI[132], llIllllllI[133], llIllllllI[13], llIllllllI[21], llIllllllI[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[345]];
            if (y.lIllllIIlIIll(dW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                y.br();
            }
        }
    }

    private static void Q() {
        block53: {
            d var83;
            block52: {
                block51: {
                    block50: {
                        Object var10;
                        block49: {
                            block48: {
                                block47: {
                                    block46: {
                                        block45: {
                                            block44: {
                                                block43: {
                                                    block42: {
                                                        block41: {
                                                            block40: {
                                                                block39: {
                                                                    block38: {
                                                                        block37: {
                                                                            block36: {
                                                                                block35: {
                                                                                    block34: {
                                                                                        int[] nArray = new int[llIllllllI[0]];
                                                                                        nArray[y.llIllllllI[1]] = llIllllllI[37];
                                                                                        if (y.lIllllIIlIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                                                                                            d d2 = new d(llIllllllI[37], llIllllllI[0], llIllllllI[579]);
                                                                                            bv.add(d2);
                                                                                            0;
                                                                                        }
                                                                                        int[] nArray2 = new int[llIllllllI[0]];
                                                                                        nArray2[y.llIllllllI[1]] = llIllllllI[34];
                                                                                        if (y.lIllllIIlIIll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                                                                                            var10 = new d(llIllllllI[34], llIllllllI[0], llIllllllI[580]);
                                                                                            bv.add((d)var10);
                                                                                            0;
                                                                                        }
                                                                                        int[] nArray3 = new int[llIllllllI[0]];
                                                                                        nArray3[y.llIllllllI[1]] = llIllllllI[35];
                                                                                        if (y.lIllllIIlIIll(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                                                                            var10 = new d(llIllllllI[35], llIllllllI[0], llIllllllI[580]);
                                                                                            bv.add((d)var10);
                                                                                            0;
                                                                                        }
                                                                                        int[] nArray4 = new int[llIllllllI[0]];
                                                                                        nArray4[y.llIllllllI[1]] = llIllllllI[22];
                                                                                        if (!y.lIllllIIlIIIl(Bank.contains((int[])nArray4) ? 1 : 0)) break block34;
                                                                                        int[] nArray5 = new int[llIllllllI[0]];
                                                                                        nArray5[y.llIllllllI[1]] = llIllllllI[22];
                                                                                        if (!y.lIllllIIlIIIl(Bank.contains((int[])nArray5) ? 1 : 0)) break block35;
                                                                                        int[] nArray6 = new int[llIllllllI[0]];
                                                                                        nArray6[y.llIllllllI[1]] = llIllllllI[22];
                                                                                        if (!y.lIllllIIlIIlI(Bank.getFirst((int[])nArray6).getQuantity(), llIllllllI[17])) break block35;
                                                                                    }
                                                                                    var10 = new d(llIllllllI[22], llIllllllI[17], llIllllllI[581]);
                                                                                    bv.add((d)var10);
                                                                                    0;
                                                                                }
                                                                                int[] nArray = new int[llIllllllI[0]];
                                                                                nArray[y.llIllllllI[1]] = llIllllllI[23];
                                                                                if (!y.lIllllIIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block36;
                                                                                int[] nArray7 = new int[llIllllllI[0]];
                                                                                nArray7[y.llIllllllI[1]] = llIllllllI[23];
                                                                                if (!y.lIllllIIlIIIl(Bank.contains((int[])nArray7) ? 1 : 0)) break block37;
                                                                                int[] nArray8 = new int[llIllllllI[0]];
                                                                                nArray8[y.llIllllllI[1]] = llIllllllI[23];
                                                                                if (!y.lIllllIIlIIlI(Bank.getFirst((int[])nArray8).getQuantity(), llIllllllI[17])) break block37;
                                                                            }
                                                                            var10 = new d(llIllllllI[23], llIllllllI[17], llIllllllI[581]);
                                                                            bv.add((d)var10);
                                                                            0;
                                                                        }
                                                                        int[] nArray = new int[llIllllllI[0]];
                                                                        nArray[y.llIllllllI[1]] = llIllllllI[24];
                                                                        if (!y.lIllllIIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block38;
                                                                        int[] nArray9 = new int[llIllllllI[0]];
                                                                        nArray9[y.llIllllllI[1]] = llIllllllI[24];
                                                                        if (!y.lIllllIIlIIIl(Bank.contains((int[])nArray9) ? 1 : 0)) break block39;
                                                                        int[] nArray10 = new int[llIllllllI[0]];
                                                                        nArray10[y.llIllllllI[1]] = llIllllllI[24];
                                                                        if (!y.lIllllIIlIIlI(Bank.getFirst((int[])nArray10).getQuantity(), llIllllllI[6])) break block39;
                                                                    }
                                                                    var10 = new d(llIllllllI[24], llIllllllI[6], llIllllllI[582]);
                                                                    bv.add((d)var10);
                                                                    0;
                                                                }
                                                                int[] nArray = new int[llIllllllI[0]];
                                                                nArray[y.llIllllllI[1]] = llIllllllI[25];
                                                                if (!y.lIllllIIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block40;
                                                                int[] nArray11 = new int[llIllllllI[0]];
                                                                nArray11[y.llIllllllI[1]] = llIllllllI[25];
                                                                if (!y.lIllllIIlIIIl(Bank.contains((int[])nArray11) ? 1 : 0)) break block41;
                                                                int[] nArray12 = new int[llIllllllI[0]];
                                                                nArray12[y.llIllllllI[1]] = llIllllllI[25];
                                                                if (!y.lIllllIIlIIlI(Bank.getFirst((int[])nArray12).getQuantity(), llIllllllI[26])) break block41;
                                                            }
                                                            var10 = new d(llIllllllI[25], llIllllllI[26], llIllllllI[583]);
                                                            bv.add((d)var10);
                                                            0;
                                                        }
                                                        int[] nArray = new int[llIllllllI[0]];
                                                        nArray[y.llIllllllI[1]] = llIllllllI[20];
                                                        if (!y.lIllllIIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block42;
                                                        int[] nArray13 = new int[llIllllllI[0]];
                                                        nArray13[y.llIllllllI[1]] = llIllllllI[20];
                                                        if (!y.lIllllIIlIIIl(Bank.contains((int[])nArray13) ? 1 : 0)) break block43;
                                                        int[] nArray14 = new int[llIllllllI[0]];
                                                        nArray14[y.llIllllllI[1]] = llIllllllI[20];
                                                        if (!y.lIllllIIlIIlI(Bank.getFirst((int[])nArray14).getQuantity(), llIllllllI[21])) break block43;
                                                    }
                                                    var10 = new d(llIllllllI[20], llIllllllI[21], llIllllllI[18]);
                                                    bv.add((d)var10);
                                                    0;
                                                }
                                                int[] nArray = new int[llIllllllI[0]];
                                                nArray[y.llIllllllI[1]] = llIllllllI[27];
                                                if (!y.lIllllIIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block44;
                                                int[] nArray15 = new int[llIllllllI[0]];
                                                nArray15[y.llIllllllI[1]] = llIllllllI[27];
                                                if (!y.lIllllIIlIIIl(Bank.contains((int[])nArray15) ? 1 : 0)) break block45;
                                                int[] nArray16 = new int[llIllllllI[0]];
                                                nArray16[y.llIllllllI[1]] = llIllllllI[27];
                                                if (!y.lIllllIIlIIlI(Bank.getFirst((int[])nArray16).getQuantity(), llIllllllI[28])) break block45;
                                            }
                                            var10 = new d(llIllllllI[27], llIllllllI[28], e.c(llIllllllI[584], llIllllllI[585]));
                                            bv.add((d)var10);
                                            0;
                                        }
                                        int[] nArray = new int[llIllllllI[0]];
                                        nArray[y.llIllllllI[1]] = llIllllllI[29];
                                        if (!y.lIllllIIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block46;
                                        int[] nArray17 = new int[llIllllllI[0]];
                                        nArray17[y.llIllllllI[1]] = llIllllllI[29];
                                        if (!y.lIllllIIlIIIl(Bank.contains((int[])nArray17) ? 1 : 0)) break block47;
                                        int[] nArray18 = new int[llIllllllI[0]];
                                        nArray18[y.llIllllllI[1]] = llIllllllI[29];
                                        if (!y.lIllllIIlIIlI(Bank.getFirst((int[])nArray18).getQuantity(), llIllllllI[30])) break block47;
                                    }
                                    var10 = new d(llIllllllI[29], llIllllllI[30], e.c(llIllllllI[586], llIllllllI[587]));
                                    bv.add((d)var10);
                                    0;
                                }
                                int[] nArray = new int[llIllllllI[0]];
                                nArray[y.llIllllllI[1]] = llIllllllI[31];
                                if (!y.lIllllIIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block48;
                                int[] nArray19 = new int[llIllllllI[0]];
                                nArray19[y.llIllllllI[1]] = llIllllllI[31];
                                if (!y.lIllllIIlIIIl(Bank.contains((int[])nArray19) ? 1 : 0)) break block49;
                                int[] nArray20 = new int[llIllllllI[0]];
                                nArray20[y.llIllllllI[1]] = llIllllllI[31];
                                if (!y.lIllllIIlIIlI(Bank.getFirst((int[])nArray20).getQuantity(), llIllllllI[32])) break block49;
                            }
                            var10 = new d(llIllllllI[31], llIllllllI[32], llIllllllI[140]);
                            bv.add((d)var10);
                            0;
                        }
                        if (y.lIllllIIlIIll(Bank.contains((Predicate)(var10 = item -> item.getName().toLowerCase().contains(llIllllIlI[llIllllllI[581]]))) ? 1 : 0)) {
                            var83 = new d(llIllllllI[588], llIllllllI[2], llIllllllI[589]);
                            bv.add(var83);
                            0;
                        }
                        int[] nArray = new int[llIllllllI[0]];
                        nArray[y.llIllllllI[1]] = llIllllllI[36];
                        if (!y.lIllllIIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block50;
                        int[] nArray21 = new int[llIllllllI[0]];
                        nArray21[y.llIllllllI[1]] = llIllllllI[36];
                        if (!y.lIllllIIlIIIl(Bank.contains((int[])nArray21) ? 1 : 0)) break block51;
                        int[] nArray22 = new int[llIllllllI[0]];
                        nArray22[y.llIllllllI[1]] = llIllllllI[36];
                        if (!y.lIllllIIlIIlI(Bank.getFirst((int[])nArray22).getQuantity(), llIllllllI[11])) break block51;
                    }
                    var83 = new d(llIllllllI[36], llIllllllI[11], j.cf);
                    bv.add(var83);
                    0;
                }
                int[] nArray = new int[llIllllllI[0]];
                nArray[y.llIllllllI[1]] = llIllllllI[33];
                if (!y.lIllllIIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block52;
                int[] nArray23 = new int[llIllllllI[0]];
                nArray23[y.llIllllllI[1]] = llIllllllI[33];
                if (!y.lIllllIIlIIIl(Bank.contains((int[])nArray23) ? 1 : 0)) break block53;
                int[] nArray24 = new int[llIllllllI[0]];
                nArray24[y.llIllllllI[1]] = llIllllllI[33];
                if (!y.lIllllIIlIIlI(Bank.getFirst((int[])nArray24).getQuantity(), llIllllllI[12])) break block53;
            }
            var83 = new d(llIllllllI[33], llIllllllI[12], llIllllllI[590]);
            bv.add(var83);
            0;
        }
    }

    private static String lIlllIlIllIII(String var56, String var30) {
        try {
            SecretKeySpec var70 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var30.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var3 = Cipher.getInstance("Blowfish");
            var3.init(llIllllllI[4], var70);
            return new String(var3.doFinal(Base64.getDecoder().decode(var56.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    private static boolean lIllllIIllIll(int n2, int n3) {
        return n2 != n3;
    }

    static {
        y.lIllllIIlIIII();
        y.lIlllIlllllll();
        bv = new ArrayList<d>();
        dN = llIllllllI[594];
        dO = new WorldPoint(llIllllllI[595], llIllllllI[596], llIllllllI[1]);
        dP = new WorldPoint(llIllllllI[363], llIllllllI[375], llIllllllI[1]);
        dQ = new WorldPoint(llIllllllI[522], llIllllllI[597], llIllllllI[1]);
        dR = new WorldPoint(llIllllllI[598], llIllllllI[599], llIllllllI[1]);
        dS = new WorldPoint(llIllllllI[600], llIllllllI[601], llIllllllI[1]);
        dT = new WorldPoint(llIllllllI[602], llIllllllI[603], llIllllllI[1]);
        dU = new WorldPoint(llIllllllI[604], llIllllllI[605], llIllllllI[1]);
        dV = new WorldPoint(llIllllllI[556], llIllllllI[557], llIllllllI[0]);
        dW = new WorldArea(llIllllllI[282], llIllllllI[606], llIllllllI[59], llIllllllI[58], llIllllllI[1]);
        dX = new WorldArea(llIllllllI[607], llIllllllI[608], llIllllllI[93], llIllllllI[111], llIllllllI[1]);
        dY = new WorldArea(llIllllllI[336], llIllllllI[331], llIllllllI[115], llIllllllI[104], llIllllllI[1]);
        dZ = new WorldArea(llIllllllI[599], llIllllllI[609], llIllllllI[135], llIllllllI[114], llIllllllI[1]);
        String[] stringArray = new String[llIllllllI[21]];
        stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[610]];
        stringArray[y.llIllllllI[0]] = llIllllIlI[llIllllllI[611]];
        stringArray[y.llIllllllI[4]] = llIllllIlI[llIllllllI[612]];
        stringArray[y.llIllllllI[6]] = llIllllIlI[llIllllllI[613]];
        stringArray[y.llIllllllI[8]] = llIllllIlI[llIllllllI[614]];
        stringArray[y.llIllllllI[2]] = llIllllIlI[llIllllllI[615]];
        stringArray[y.llIllllllI[11]] = llIllllIlI[llIllllllI[616]];
        stringArray[y.llIllllllI[13]] = llIllllIlI[llIllllllI[617]];
        stringArray[y.llIllllllI[15]] = llIllllIlI[llIllllllI[618]];
        stringArray[y.llIllllllI[16]] = llIllllIlI[llIllllllI[619]];
        stringArray[y.llIllllllI[17]] = llIllllIlI[llIllllllI[620]];
        stringArray[y.llIllllllI[19]] = llIllllIlI[llIllllllI[621]];
        cE = stringArray;
        da = llIllllIlI[llIllllllI[622]];
        h = "Darkness of Hallowvale " + da;
    }

    private static String lIlllIlIllIlI(String var61, String var20) {
        try {
            SecretKeySpec var39 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var20.getBytes(StandardCharsets.UTF_8)), llIllllllI[15]), "DES");
            Cipher var99 = Cipher.getInstance("DES");
            var99.init(llIllllllI[4], var39);
            return new String(var99.doFinal(Base64.getDecoder().decode(var61.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var62) {
            var62.printStackTrace();
            return null;
        }
    }

    private static boolean lIllllIIlIlIl(Object object) {
        return object != null;
    }

    private static boolean lIllllIIlIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIlllIlIllIIl(String var96, String var17) {
        var96 = new String(Base64.getDecoder().decode(var96.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var80 = new StringBuilder();
        char[] var2 = var17.toCharArray();
        int var58 = llIllllllI[1];
        char[] var12 = var96.toCharArray();
        int var66 = var12.length;
        int var111 = llIllllllI[1];
        while (y.lIllllIIlIIlI(var111, var66)) {
            char var41 = var12[var111];
            var80.append((char)(var41 ^ var2[var58 % var2.length]));
            0;
            ++var58;
            ++var111;
            0;
            if (2 != 0) continue;
            return null;
        }
        return String.valueOf(var80);
    }

    private static boolean lIllllIIllIIl(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public String ag() {
        return h;
    }

    private static void lIlllIlllllll() {
        llIllllIlI = new String[llIllllllI[623]];
        y.llIllllIlI[y.llIllllllI[1]] = y."Finished buying items, switching back to quest";
        y.llIllllIlI[y.llIllllllI[0]] = y."- Con";
        y.llIllllIlI[y.llIllllllI[4]] = y."- Mining";
        y.llIllllIlI[y.llIllllllI[6]] = y."- Thieving";
        y.llIllllIlI[y.llIllllllI[8]] = y."- Agility";
        y.llIllllIlI[y.llIllllllI[2]] = y."- Crafting";
        y.llIllllIlI[y.llIllllllI[11]] = y."- Magic";
        y.llIllllIlI[y.llIllllllI[13]] = y."- Str";
        y.llIllllIlI[y.llIllllllI[15]] = y."- In Aid";
        y.llIllllIlI[y.llIllllllI[16]] = y."";
        y.llIllllIlI[y.llIllllllI[17]] = y."Nav to bank";
        y.llIllllIlI[y.llIllllllI[19]] = y."Handling banking";
        y.llIllllIlI[y.llIllllllI[21]] = y."We are missing quest supplies, switching to BUYING";
        y.llIllllIlI[y.llIllllllI[38]] = y."We are missing quest supplies, switching to BUYING";
        y.llIllllIlI[y.llIllllllI[39]] = y."We are missing quest supplies, switching to BUYING";
        y.llIllllIlI[y.llIllllllI[30]] = y."Drink";
        y.llIllllIlI[y.llIllllllI[40]] = y."Veliaf Hurtz";
        y.llIllllIlI[y.llIllllllI[41]] = y."Nav to pub";
        y.llIllllIlI[y.llIllllllI[44]] = y."Trapdoor";
        y.llIllllIlI[y.llIllllllI[45]] = y."Open";
        y.llIllllIlI[y.llIllllllI[3]] = y."Trapdoor";
        y.llIllllIlI[y.llIllllllI[46]] = y."Climb-down";
        y.llIllllIlI[y.llIllllllI[5]] = y."Veliaf Hurtz";
        y.llIllllIlI[y.llIllllllI[47]] = y."Talking to veliaf";
        y.llIllllIlI[y.llIllllllI[48]] = y."Veliaf Hurtz";
        y.llIllllIlI[y.llIllllllI[49]] = y."Leaving base";
        y.llIllllIlI[y.llIllllllI[7]] = y."Veliaf Hurtz";
        y.llIllllIlI[y.llIllllllI[50]] = y."Ladder";
        y.llIllllIlI[y.llIllllllI[51]] = y."Climb-up";
        y.llIllllIlI[y.llIllllllI[52]] = y."Veliaf Hurtz";
        y.llIllllIlI[y.llIllllllI[28]] = y."Nav to boat";
        y.llIllllIlI[y.llIllllllI[53]] = y."Fixing boat";
        y.llIllllIlI[y.llIllllllI[9]] = y."Boat";
        y.llIllllIlI[y.llIllllllI[10]] = y."Inspect";
        y.llIllllIlI[y.llIllllllI[55]] = y."Fixing chute";
        y.llIllllIlI[y.llIllllllI[56]] = y."Boat Chute";
        y.llIllllIlI[y.llIllllllI[57]] = y."Inspect";
        y.llIllllIlI[y.llIllllllI[58]] = y."Boat";
        y.llIllllIlI[y.llIllllllI[59]] = y."Boat";
        y.llIllllIlI[y.llIllllllI[60]] = y."Board";
        y.llIllllIlI[y.llIllllllI[12]] = y."Handling boat";
        y.llIllllIlI[y.llIllllllI[61]] = y."Boat";
        y.llIllllIlI[y.llIllllllI[62]] = y."Push";
        y.llIllllIlI[y.llIllllllI[63]] = y."Boat";
        y.llIllllIlI[y.llIllllllI[64]] = y."Boat";
        y.llIllllIlI[y.llIllllllI[65]] = y."Board";
        y.llIllllIlI[y.llIllllllI[66]] = y."Boat";
        y.llIllllIlI[y.llIllllllI[67]] = y."Board";
        y.llIllllIlI[y.llIllllllI[69]] = y."Meiyerditch citizen";
        y.llIllllIlI[y.llIllllllI[70]] = y."Meiyerditch citizen";
        y.llIllllIlI[y.llIllllllI[32]] = y."Nav to old man ral";
        y.llIllllIlI[y.llIllllllI[71]] = y."talk npc";
        y.llIllllIlI[y.llIllllllI[72]] = y."Old Man Ral";
        y.llIllllIlI[y.llIllllllI[76]] = y."Run to base tile";
        y.llIllllIlI[y.llIllllllI[77]] = y."Talk";
        y.llIllllIlI[y.llIllllllI[78]] = y."Vertida Sefalatis";
        y.llIllllIlI[y.llIllllllI[81]] = y."Tele to barrows";
        y.llIllllIlI[y.llIllllllI[82]] = y."Break";
        y.llIllllIlI[y.llIllllllI[83]] = y."Veliaf Hurtz";
        y.llIllllIlI[y.llIllllllI[84]] = y."Veliaf Hurtz";
        y.llIllllIlI[y.llIllllllI[68]] = y."Nav to pub";
        y.llIllllIlI[y.llIllllllI[85]] = y."Trapdoor";
        y.llIllllIlI[y.llIllllllI[86]] = y."Open";
        y.llIllllIlI[y.llIllllllI[87]] = y."Trapdoor";
        y.llIllllIlI[y.llIllllllI[88]] = y."Climb-down";
        y.llIllllIlI[y.llIllllllI[73]] = y."Veliaf Hurtz";
        y.llIllllIlI[y.llIllllllI[89]] = y."Talking to veliaf";
        y.llIllllIlI[y.llIllllllI[90]] = y."Veliaf Hurtz";
        y.llIllllIlI[y.llIllllllI[92]] = y."Nav to Drezel";
        y.llIllllIlI[y.llIllllllI[93]] = y."Veliaf Hurtz";
        y.llIllllIlI[y.llIllllllI[74]] = y."Break";
        y.llIllllIlI[y.llIllllllI[94]] = y."Veliaf Hurtz";
        y.llIllllIlI[y.llIllllllI[95]] = y."Trapdoor";
        y.llIllllIlI[y.llIllllllI[96]] = y."Trapdoor";
        y.llIllllIlI[y.llIllllllI[97]] = y."Open";
        y.llIllllIlI[y.llIllllllI[98]] = y."Talk to drezel";
        y.llIllllIlI[y.llIllllllI[99]] = y."Drezel";
        y.llIllllIlI[y.llIllllllI[101]] = y."Nav to bush";
        y.llIllllIlI[y.llIllllllI[102]] = y."Hiding";
        y.llIllllIlI[y.llIllllllI[104]] = y."Search";
        y.llIllllIlI[y.llIllllllI[75]] = y."Nav to Drezel";
        y.llIllllIlI[y.llIllllllI[106]] = y."Break";
        y.llIllllIlI[y.llIllllllI[107]] = y."Trapdoor";
        y.llIllllIlI[y.llIllllllI[108]] = y."Trapdoor";
        y.llIllllIlI[y.llIllllllI[109]] = y."Open";
        y.llIllllIlI[y.llIllllllI[110]] = y."Talk to drezel";
        y.llIllllIlI[y.llIllllllI[111]] = y."Drezel";
        y.llIllllIlI[y.llIllllllI[114]] = y."Nav to king";
        y.llIllllIlI[y.llIllllllI[115]] = y."talk king";
        y.llIllllIlI[y.llIllllllI[116]] = y."King Roald";
        y.llIllllIlI[y.llIllllllI[79]] = y."Veliaf Hurtz";
        y.llIllllIlI[y.llIllllllI[117]] = y."Nav to pub";
        y.llIllllIlI[y.llIllllllI[118]] = y."Trapdoor";
        y.llIllllIlI[y.llIllllllI[119]] = y."Open";
        y.llIllllIlI[y.llIllllllI[120]] = y."Trapdoor";
        y.llIllllIlI[y.llIllllllI[121]] = y."Climb-down";
        y.llIllllIlI[y.llIllllllI[122]] = y."Veliaf Hurtz";
        y.llIllllIlI[y.llIllllllI[123]] = y."Talking to veliaf";
        y.llIllllIlI[y.llIllllllI[124]] = y."Veliaf Hurtz";
        y.llIllllIlI[y.llIllllllI[126]] = y."Veliaf Hurtz";
        y.llIllllIlI[y.llIllllllI[80]] = y."Ladder";
        y.llIllllIlI[y.llIllllllI[127]] = y."Climb-up";
        y.llIllllIlI[y.llIllllllI[128]] = y."Veliaf Hurtz";
        y.llIllllIlI[y.llIllllllI[129]] = y."Nav to boat";
        y.llIllllIlI[y.llIllllllI[130]] = y."Boat";
        y.llIllllIlI[y.llIllllllI[131]] = y."Board";
        y.llIllllIlI[y.llIllllllI[134]] = y."Nav back into city";
        y.llIllllIlI[y.llIllllllI[135]] = y."Run to base tile";
        y.llIllllIlI[y.llIllllllI[136]] = y."Talk";
        y.llIllllIlI[y.llIllllllI[137]] = y."Vertida Sefalatis";
        y.llIllllIlI[y.llIllllllI[91]] = y."Run to north side";
        y.llIllllIlI[y.llIllllllI[141]] = y."Sketching";
        y.llIllllIlI[y.llIllllllI[145]] = y."Run to west side";
        y.llIllllIlI[y.llIllllllI[146]] = y."Sketching";
        y.llIllllIlI[y.llIllllllI[148]] = y."Run to south side";
        y.llIllllIlI[y.llIllllllI[149]] = y."Drink";
        y.llIllllIlI[y.llIllllllI[150]] = y."Sketching";
        y.llIllllIlI[y.llIllllllI[155]] = y."Castle sketch 3";
        y.llIllllIlI[y.llIllllllI[156]] = y."Run to south side";
        y.llIllllIlI[y.llIllllllI[157]] = y."Sketching";
        y.llIllllIlI[y.llIllllllI[100]] = y."Castle sketch 3";
        y.llIllllIlI[y.llIllllllI[158]] = y."Break";
        y.llIllllIlI[y.llIllllllI[159]] = y."Nav to boat";
        y.llIllllIlI[y.llIllllllI[160]] = y."Veliaf Hurtz";
        y.llIllllIlI[y.llIllllllI[161]] = y."Nav to boat";
        y.llIllllIlI[y.llIllllllI[162]] = y."Boat";
        y.llIllllIlI[y.llIllllllI[163]] = y."Board";
        y.llIllllIlI[y.llIllllllI[164]] = y."Nav back into city";
        y.llIllllIlI[y.llIllllllI[165]] = y."Run to base tile";
        y.llIllllIlI[y.llIllllllI[166]] = y."Talk";
        y.llIllllIlI[y.llIllllllI[105]] = y."Safalaan Hallow";
        y.llIllllIlI[y.llIllllllI[173]] = y."Go down";
        y.llIllllIlI[y.llIllllllI[174]] = y."Staircase";
        y.llIllllIlI[y.llIllllllI[175]] = y."Climb-down";
        y.llIllllIlI[y.llIllllllI[176]] = y."Lab table";
        y.llIllllIlI[y.llIllllllI[179]] = y."Nav to grab tile";
        y.llIllllIlI[y.llIllllllI[180]] = y."Telegrabbing";
        y.llIllllIlI[y.llIllllllI[181]] = y."Run to base tile";
        y.llIllllIlI[y.llIllllllI[182]] = y."Talk";
        y.llIllllIlI[y.llIllllllI[183]] = y."Safalaan Hallow";
        y.llIllllIlI[y.llIllllllI[112]] = y."Break";
        y.llIllllIlI[y.llIllllllI[185]] = y."Veliaf Hurtz";
        y.llIllllIlI[y.llIllllllI[186]] = y."Nav to pub";
        y.llIllllIlI[y.llIllllllI[187]] = y."Trapdoor";
        y.llIllllIlI[y.llIllllllI[188]] = y."Open";
        y.llIllllIlI[y.llIllllllI[189]] = y."Trapdoor";
        y.llIllllIlI[y.llIllllllI[190]] = y."Climb-down";
        y.llIllllIlI[y.llIllllllI[191]] = y."Veliaf Hurtz";
        y.llIllllIlI[y.llIllllllI[192]] = y."Talking to veliaf";
        y.llIllllIlI[y.llIllllllI[193]] = y."Veliaf Hurtz";
        y.llIllllIlI[y.llIllllllI[195]] = y."Tome of experience (3)";
        y.llIllllIlI[y.llIllllllI[196]] = y."Tome of experience (2)";
        y.llIllllIlI[y.llIllllllI[197]] = y."Tome of experience (1)";
        y.llIllllIlI[y.llIllllllI[198]] = y."Rubbing book";
        y.llIllllIlI[y.llIllllllI[199]] = y."Tome of experience (3)";
        y.llIllllIlI[y.llIllllllI[200]] = y."Tome of experience (3)";
        y.llIllllIlI[y.llIllllllI[201]] = y."Read";
        y.llIllllIlI[y.llIllllllI[202]] = y."Tome of experience (2)";
        y.llIllllIlI[y.llIllllllI[203]] = y."Tome of experience (2)";
        y.llIllllIlI[y.llIllllllI[204]] = y."Read";
        y.llIllllIlI[y.llIllllllI[205]] = y."Tome of experience (1)";
        y.llIllllIlI[y.llIllllllI[206]] = y."Tome of experience (1)";
        y.llIllllIlI[y.llIllllllI[207]] = y."Read";
        y.llIllllIlI[y.llIllllllI[208]] = y."Selecting agility";
        y.llIllllIlI[y.llIllllllI[209]] = y."Agility";
        y.llIllllIlI[y.llIllllllI[210]] = y."Confirm";
        y.llIllllIlI[y.llIllllllI[211]] = y."Tome of experience (3)";
        y.llIllllIlI[y.llIllllllI[212]] = y."Tome of experience (2)";
        y.llIllllIlI[y.llIllllllI[213]] = y."Tome of experience (1)";
        y.llIllllIlI[y.llIllllllI[214]] = y."Veliaf Hurtz";
        y.llIllllIlI[y.llIllllllI[113]] = y."Veliaf Hurtz";
        y.llIllllIlI[y.llIllllllI[215]] = y."Break";
        y.llIllllIlI[y.llIllllllI[228]] = y."Lab table";
        y.llIllllIlI[y.llIllllllI[229]] = y."Go up";
        y.llIllllIlI[y.llIllllllI[230]] = y."Staircase";
        y.llIllllIlI[y.llIllllllI[231]] = y."Climb-up";
        y.llIllllIlI[y.llIllllllI[232]] = y."Leave ladder area";
        y.llIllllIlI[y.llIllllllI[233]] = y."Door";
        y.llIllllIlI[y.llIllllllI[234]] = y."Open";
        y.llIllllIlI[y.llIllllllI[235]] = y."Exiting tape";
        y.llIllllIlI[y.llIllllllI[125]] = y."Slashed tapestry";
        y.llIllllIlI[y.llIllllllI[236]] = y."Slashed tapestry";
        y.llIllllIlI[y.llIllllllI[237]] = y."Walk-through";
        y.llIllllIlI[y.llIllllllI[238]] = y."Nav to ladder";
        y.llIllllIlI[y.llIllllllI[242]] = y."Nav to ladder";
        y.llIllllIlI[y.llIllllllI[243]] = y."Go up";
        y.llIllllIlI[y.llIllllllI[244]] = y."Ladder";
        y.llIllllIlI[y.llIllllllI[245]] = y."Climb-up";
        y.llIllllIlI[y.llIllllllI[246]] = y."Pushing wall";
        y.llIllllIlI[y.llIllllllI[247]] = y."Wall";
        y.llIllllIlI[y.llIllllllI[138]] = y."Push";
        y.llIllllIlI[y.llIllllllI[248]] = y."Go up";
        y.llIllllIlI[y.llIllllllI[249]] = y."Stairs up";
        y.llIllllIlI[y.llIllllllI[250]] = y."Climb-up";
        y.llIllllIlI[y.llIllllllI[254]] = y."Walk to tile";
        y.llIllllIlI[y.llIllllllI[139]] = y."Jump-to";
        y.llIllllIlI[y.llIllllllI[256]] = y."Go down";
        y.llIllllIlI[y.llIllllllI[257]] = y."Ladder";
        y.llIllllIlI[y.llIllllllI[258]] = y."Climb-down";
        y.llIllllIlI[y.llIllllllI[259]] = y."Nav to tapestry";
        y.llIllllIlI[y.llIllllllI[140]] = y."Use knife";
        y.llIllllIlI[y.llIllllllI[260]] = y."Tapestry";
        y.llIllllIlI[y.llIllllllI[261]] = y."Slashed tapestry";
        y.llIllllIlI[y.llIllllllI[262]] = y."Slashed tapestry";
        y.llIllllIlI[y.llIllllllI[263]] = y."Walk-through";
        y.llIllllIlI[y.llIllllllI[264]] = y."Unlocking";
        y.llIllllIlI[y.llIllllllI[265]] = y."Large ornate key";
        y.llIllllIlI[y.llIllllllI[266]] = y."Vampyre statue";
        y.llIllllIlI[y.llIllllllI[269]] = y."Nav to ladder";
        y.llIllllIlI[y.llIllllllI[270]] = y."Go down";
        y.llIllllIlI[y.llIllllllI[144]] = y."Staircase";
        y.llIllllIlI[y.llIllllllI[271]] = y."Climb-down";
        y.llIllllIlI[y.llIllllllI[272]] = y."Go down";
        y.llIllllIlI[y.llIllllllI[273]] = y."Staircase";
        y.llIllllIlI[y.llIllllllI[274]] = y."Climb-down";
        y.llIllllIlI[y.llIllllllI[277]] = y."Go down";
        y.llIllllIlI[y.llIllllllI[278]] = y."Ladder";
        y.llIllllIlI[y.llIllllllI[279]] = y."Climb-down";
        y.llIllllIlI[y.llIllllllI[284]] = y."Nav to rubble";
        y.llIllllIlI[y.llIllllllI[285]] = y."Climb rubble";
        y.llIllllIlI[y.llIllllllI[147]] = y."Wall rubble";
        y.llIllllIlI[y.llIllllllI[286]] = y."Climb-over";
        y.llIllllIlI[y.llIllllllI[287]] = y."Climb up floor";
        y.llIllllIlI[y.llIllllllI[288]] = y."Floor";
        y.llIllllIlI[y.llIllllllI[289]] = y."Climb-up";
        y.llIllllIlI[y.llIllllllI[305]] = y."Nav to ladder 1";
        y.llIllllIlI[y.llIllllllI[306]] = y."Go down ";
        y.llIllllIlI[y.llIllllllI[307]] = y."Ladder";
        y.llIllllIlI[y.llIllllllI[308]] = y."Climb-down";
        y.llIllllIlI[y.llIllllllI[309]] = y."Wall";
        y.llIllllIlI[y.llIllllllI[151]] = y."Rocky surface";
        y.llIllllIlI[y.llIllllllI[310]] = y."Search";
        y.llIllllIlI[y.llIllllllI[311]] = y."Barricade";
        y.llIllllIlI[y.llIllllllI[312]] = y."Open";
        y.llIllllIlI[y.llIllllllI[316]] = y."Nav to ladder";
        y.llIllllIlI[y.llIllllllI[317]] = y."Go up ";
        y.llIllllIlI[y.llIllllllI[318]] = y."Ladder";
        y.llIllllIlI[y.llIllllllI[319]] = y."Climb-up";
        y.llIllllIlI[y.llIllllllI[321]] = y."Nav to ladder";
        y.llIllllIlI[y.llIllllllI[322]] = y."Go up ";
        y.llIllllIlI[y.llIllllllI[152]] = y."Ladder";
        y.llIllllIlI[y.llIllllllI[323]] = y."Climb-up";
        y.llIllllIlI[y.llIllllllI[325]] = y."Nav to ladder";
        y.llIllllIlI[y.llIllllllI[326]] = y."Go down ";
        y.llIllllIlI[y.llIllllllI[327]] = y."Ladder";
        y.llIllllIlI[y.llIllllllI[328]] = y."Climb-down";
        y.llIllllIlI[y.llIllllllI[332]] = y."Nav to wall";
        y.llIllllIlI[y.llIllllllI[333]] = y."Go up ";
        y.llIllllIlI[y.llIllllllI[334]] = y."Wall";
        y.llIllllIlI[y.llIllllllI[335]] = y."Climb-up";
        y.llIllllIlI[y.llIllllllI[153]] = y."Nav to npc";
        y.llIllllIlI[y.llIllllllI[339]] = y."Talk";
        y.llIllllIlI[y.llIllllllI[340]] = y."Safalaan Hallow";
        y.llIllllIlI[y.llIllllllI[341]] = y."Veliaf Hurtz";
        y.llIllllIlI[y.llIllllllI[342]] = y."Nav to boat";
        y.llIllllIlI[y.llIllllllI[343]] = y."Boat";
        y.llIllllIlI[y.llIllllllI[344]] = y."Board";
        y.llIllllIlI[y.llIllllllI[345]] = y."Nav back into city";
        y.llIllllIlI[y.llIllllllI[378]] = y."nav to ladder 1";
        y.llIllllIlI[y.llIllllllI[379]] = y."Climb";
        y.llIllllIlI[y.llIllllllI[154]] = y."Ladder";
        y.llIllllIlI[y.llIllllllI[380]] = y."Climb-up";
        y.llIllllIlI[y.llIllllllI[381]] = y."Handling first floor board";
        y.llIllllIlI[y.llIllllllI[383]] = y."Jump-to";
        y.llIllllIlI[y.llIllllllI[384]] = y."Handling second floor board";
        y.llIllllIlI[y.llIllllllI[386]] = y."Jump-to";
        y.llIllllIlI[y.llIllllllI[387]] = y."Wall";
        y.llIllllIlI[y.llIllllllI[388]] = y."Wall";
        y.llIllllIlI[y.llIllllllI[389]] = y."Push";
        y.llIllllIlI[y.llIllllllI[390]] = y."Pushing wall";
        y.llIllllIlI[y.llIllllllI[167]] = y."Wall";
        y.llIllllIlI[y.llIllllllI[391]] = y."Push";
        y.llIllllIlI[y.llIllllllI[393]] = y."Walking across;";
        y.llIllllIlI[y.llIllllllI[394]] = y."Walk-across";
        y.llIllllIlI[y.llIllllllI[396]] = y."Walking across;";
        y.llIllllIlI[y.llIllllllI[397]] = y."Walk-across";
        y.llIllllIlI[y.llIllllllI[398]] = y."crawling under";
        y.llIllllIlI[y.llIllllllI[399]] = y."Wall";
        y.llIllllIlI[y.llIllllllI[400]] = y."Crawl-under";
        y.llIllllIlI[y.llIllllllI[401]] = y."Push wall 2";
        y.llIllllIlI[y.llIllllllI[168]] = y."Wall";
        y.llIllllIlI[y.llIllllllI[402]] = y."Wall";
        y.llIllllIlI[y.llIllllllI[403]] = y."Push";
        y.llIllllIlI[y.llIllllllI[404]] = y."Wall";
        y.llIllllIlI[y.llIllllllI[405]] = y."Push";
        y.llIllllIlI[y.llIllllllI[406]] = y."Floor";
        y.llIllllIlI[y.llIllllllI[407]] = y."Floor";
        y.llIllllIlI[y.llIllllllI[408]] = y."Walk-across";
        y.llIllllIlI[y.llIllllllI[409]] = y."Climbing down ladder";
        y.llIllllIlI[y.llIllllllI[410]] = y."Ladder";
        y.llIllllIlI[y.llIllllllI[169]] = y."Climb-down";
        y.llIllllIlI[y.llIllllllI[411]] = y."Handling trapdoor table";
        y.llIllllIlI[y.llIllllllI[413]] = y."Search";
        y.llIllllIlI[y.llIllllllI[414]] = y."Trapdoor table";
        y.llIllllIlI[y.llIllllllI[415]] = y."Table";
        y.llIllllIlI[y.llIllllllI[416]] = y."Search";
        y.llIllllIlI[y.llIllllllI[417]] = y."Trapdoor table";
        y.llIllllIlI[y.llIllllllI[418]] = y."Trapdoor table";
        y.llIllllIlI[y.llIllllllI[419]] = y."Open";
        y.llIllllIlI[y.llIllllllI[420]] = y."Trapdoor table";
        y.llIllllIlI[y.llIllllllI[26]] = y."Open";
        y.llIllllIlI[y.llIllllllI[421]] = y."Trapdoor tunnel";
        y.llIllllIlI[y.llIllllllI[422]] = y."Trapdoor tunnel";
        y.llIllllIlI[y.llIllllllI[423]] = y."Climb-into";
        y.llIllllIlI[y.llIllllllI[424]] = y."Trapdoor tunnel";
        y.llIllllIlI[y.llIllllllI[425]] = y."Climb-into";
        y.llIllllIlI[y.llIllllllI[426]] = y."Climbing shelves";
        y.llIllllIlI[y.llIllllllI[427]] = y."Shelf";
        y.llIllllIlI[y.llIllllllI[428]] = y."Climb-up";
        y.llIllllIlI[y.llIllllllI[429]] = y."Crawling under 2";
        y.llIllllIlI[y.llIllllllI[184]] = y."Wall";
        y.llIllllIlI[y.llIllllllI[430]] = y."Crawl-under";
        y.llIllllIlI[y.llIllllllI[431]] = y."Cross floorbaord 3";
        y.llIllllIlI[y.llIllllllI[433]] = y."Jump-to";
        y.llIllllIlI[y.llIllllllI[434]] = y."Ladder 3";
        y.llIllllIlI[y.llIllllllI[435]] = y."Ladder";
        y.llIllllIlI[y.llIllllllI[436]] = y."Climb-down";
        y.llIllllIlI[y.llIllllllI[437]] = y."Getting key";
        y.llIllllIlI[y.llIllllllI[438]] = y."Pots";
        y.llIllllIlI[y.llIllllllI[439]] = y."Search";
        y.llIllllIlI[y.llIllllllI[194]] = y."Entering door";
        y.llIllllIlI[y.llIllllllI[440]] = y."Door";
        y.llIllllIlI[y.llIllllllI[441]] = y."Open";
        y.llIllllIlI[y.llIllllllI[442]] = y."Handling ladder";
        y.llIllllIlI[y.llIllllllI[443]] = y."Ladder";
        y.llIllllIlI[y.llIllllllI[444]] = y."Climb-up";
        y.llIllllIlI[y.llIllllllI[445]] = y."Cross floorbaord 4";
        y.llIllllIlI[y.llIllllllI[447]] = y."Jump-to";
        y.llIllllIlI[y.llIllllllI[448]] = y."Shelf 2";
        y.llIllllIlI[y.llIllllllI[449]] = y."Shelf";
        y.llIllllIlI[y.llIllllllI[450]] = y."Climb-up";
        y.llIllllIlI[y.llIllllllI[451]] = y."ladder 5";
        y.llIllllIlI[y.llIllllllI[452]] = y."Ladder 5";
        y.llIllllIlI[y.llIllllllI[453]] = y."Ladder";
        y.llIllllIlI[y.llIllllllI[454]] = y."Climb-up";
        y.llIllllIlI[y.llIllllllI[455]] = y."Cross floorbaord 5";
        y.llIllllIlI[y.llIllllllI[457]] = y."Jump-to";
        y.llIllllIlI[y.llIllllllI[458]] = y."ladder 6";
        y.llIllllIlI[y.llIllllllI[459]] = y."Ladder 6";
        y.llIllllIlI[y.llIllllllI[460]] = y."Ladder";
        y.llIllllIlI[y.llIllllllI[461]] = y."Climb-down";
        y.llIllllIlI[y.llIllllllI[462]] = y."Washing line";
        y.llIllllIlI[y.llIllllllI[463]] = y."Washing line";
        y.llIllllIlI[y.llIllllllI[464]] = y."Walk-across";
        y.llIllllIlI[y.llIllllllI[465]] = y."ladder 7";
        y.llIllllIlI[y.llIllllllI[466]] = y."Ladder 7";
        y.llIllllIlI[y.llIllllllI[467]] = y."Ladder";
        y.llIllllIlI[y.llIllllllI[468]] = y."Climb-down";
        y.llIllllIlI[y.llIllllllI[469]] = y."Handling wall/floor";
        y.llIllllIlI[y.llIllllllI[470]] = y."Wall";
        y.llIllllIlI[y.llIllllllI[471]] = y."Wall";
        y.llIllllIlI[y.llIllllllI[472]] = y."Push";
        y.llIllllIlI[y.llIllllllI[473]] = y."Floor";
        y.llIllllIlI[y.llIllllllI[474]] = y."Floor";
        y.llIllllIlI[y.llIllllllI[475]] = y."Walk-across";
        y.llIllllIlI[y.llIllllllI[476]] = y."Shelf 3";
        y.llIllllIlI[y.llIllllllI[477]] = y."Shelf";
        y.llIllllIlI[y.llIllllllI[478]] = y."Climb-up";
        y.llIllllIlI[y.llIllllllI[479]] = y."shelf 4";
        y.llIllllIlI[y.llIllllllI[480]] = y."Shelf";
        y.llIllllIlI[y.llIllllllI[481]] = y."Climb-down";
        y.llIllllIlI[y.llIllllllI[484]] = y."floorboard 6";
        y.llIllllIlI[y.llIllllllI[486]] = y."Jump-to";
        y.llIllllIlI[y.llIllllllI[488]] = y."floorboard 7";
        y.llIllllIlI[y.llIllllllI[490]] = y."Jump-to";
        y.llIllllIlI[y.llIllllllI[493]] = y."floorboard 8";
        y.llIllllIlI[y.llIllllllI[495]] = y."Jump-to";
        y.llIllllIlI[y.llIllllllI[498]] = y."Broken ladder";
        y.llIllllIlI[y.llIllllllI[499]] = y."Ladder top";
        y.llIllllIlI[y.llIllllllI[500]] = y."Going up";
        y.llIllllIlI[y.llIllllllI[501]] = y."Ladder";
        y.llIllllIlI[y.llIllllllI[502]] = y."Climb-up";
        y.llIllllIlI[y.llIllllllI[503]] = y."Broken ladder";
        y.llIllllIlI[y.llIllllllI[504]] = y."Ladder top";
        y.llIllllIlI[y.llIllllllI[505]] = y."Fixing ladder";
        y.llIllllIlI[y.llIllllllI[506]] = y."Broken ladder";
        y.llIllllIlI[y.llIllllllI[507]] = y."Search";
        y.llIllllIlI[y.llIllllllI[509]] = y."Climbing down";
        y.llIllllIlI[y.llIllllllI[510]] = y."Climb-down";
        y.llIllllIlI[y.llIllllllI[511]] = y."Getting ladder piece";
        y.llIllllIlI[y.llIllllllI[512]] = y."Ladder top";
        y.llIllllIlI[y.llIllllllI[513]] = y."Wall";
        y.llIllllIlI[y.llIllllllI[514]] = y."Search";
        y.llIllllIlI[y.llIllllllI[515]] = y."Ladder top";
        y.llIllllIlI[y.llIllllllI[516]] = y."Ladder";
        y.llIllllIlI[y.llIllllllI[517]] = y."Climb-down";
        y.llIllllIlI[y.llIllllllI[520]] = y."Large ornate key";
        y.llIllllIlI[y.llIllllllI[521]] = y."Message";
        y.llIllllIlI[y.llIllllllI[523]] = y."Nav to fireplace";
        y.llIllllIlI[y.llIllllllI[524]] = y."Get key";
        y.llIllllIlI[y.llIllllllI[525]] = y."Message";
        y.llIllllIlI[y.llIllllllI[526]] = y."Fireplace";
        y.llIllllIlI[y.llIllllllI[527]] = y."Fireplace";
        y.llIllllIlI[y.llIllllllI[528]] = y."Large ornate key";
        y.llIllllIlI[y.llIllllllI[529]] = y."Message";
        y.llIllllIlI[y.llIllllllI[530]] = y."Portrait";
        y.llIllllIlI[y.llIllllllI[531]] = y."Nav to ladder";
        y.llIllllIlI[y.llIllllllI[532]] = y."Climbing up";
        y.llIllllIlI[y.llIllllllI[533]] = y."Ladder";
        y.llIllllIlI[y.llIllllllI[534]] = y."Climb-up";
        y.llIllllIlI[y.llIllllllI[536]] = y."floorboard 9";
        y.llIllllIlI[y.llIllllllI[538]] = y."Jump-to";
        y.llIllllIlI[y.llIllllllI[539]] = y."Go down";
        y.llIllllIlI[y.llIllllllI[540]] = y."Stairs down";
        y.llIllllIlI[y.llIllllllI[541]] = y."Climb-down";
        y.llIllllIlI[y.llIllllllI[542]] = y."Pushing wall";
        y.llIllllIlI[y.llIllllllI[543]] = y."Wall";
        y.llIllllIlI[y.llIllllllI[544]] = y."Wall";
        y.llIllllIlI[y.llIllllllI[545]] = y."Push";
        y.llIllllIlI[y.llIllllllI[546]] = y."Entering base";
        y.llIllllIlI[y.llIllllllI[547]] = y."Lumpy rug";
        y.llIllllIlI[y.llIllllllI[548]] = y."Decorated wall";
        y.llIllllIlI[y.llIllllllI[549]] = y."Press";
        y.llIllllIlI[y.llIllllllI[550]] = y."Lumpy rug";
        y.llIllllIlI[y.llIllllllI[551]] = y."Lumpy rug";
        y.llIllllIlI[y.llIllllllI[552]] = y."Open";
        y.llIllllIlI[y.llIllllllI[553]] = y."Trapdoor";
        y.llIllllIlI[y.llIllllllI[554]] = y."Trapdoor";
        y.llIllllIlI[y.llIllllllI[555]] = y."Climb-down";
        y.llIllllIlI[y.llIllllllI[560]] = y."Jumping off boat";
        y.llIllllIlI[y.llIllllllI[562]] = y."Jump-onto";
        y.llIllllIlI[y.llIllllllI[563]] = y."Climbing up wall";
        y.llIllllIlI[y.llIllllllI[565]] = y."Climb-up";
        y.llIllllIlI[y.llIllllllI[566]] = y."Climbing down floor";
        y.llIllllIlI[y.llIllllllI[567]] = y."Floor";
        y.llIllllIlI[y.llIllllllI[568]] = y."Floor";
        y.llIllllIlI[y.llIllllllI[569]] = y."Search";
        y.llIllllIlI[y.llIllllllI[570]] = y."Floor";
        y.llIllllIlI[y.llIllllllI[571]] = y."Search";
        y.llIllllIlI[y.llIllllllI[572]] = y."Floor";
        y.llIllllIlI[y.llIllllllI[14]] = y."Floor";
        y.llIllllIlI[y.llIllllllI[573]] = y."Climb-down";
        y.llIllllIlI[y.llIllllllI[574]] = y."Floor";
        y.llIllllIlI[y.llIllllllI[575]] = y."Climb-down";
        y.llIllllIlI[y.llIllllllI[576]] = y."Climbing over wall";
        y.llIllllIlI[y.llIllllllI[577]] = y."Wall rubble";
        y.llIllllIlI[y.llIllllllI[578]] = y."Climb-over";
        y.llIllllIlI[y.llIllllllI[591]] = y."Tome of experience (3)";
        y.llIllllIlI[y.llIllllllI[592]] = y."Tome of experience (2)";
        y.llIllllIlI[y.llIllllllI[593]] = y."Tome of experience (1)";
        y.llIllllIlI[y.llIllllllI[581]] = y."ring of wealth (";
        y.llIllllIlI[y.llIllllllI[610]] = y."Yes.";
        y.llIllllIlI[y.llIllllllI[611]] = y."Is there something I can do to help out?";
        y.llIllllIlI[y.llIllllllI[612]] = y."Hey, look over there! (Distract and sneak away).";
        y.llIllllIlI[y.llIllllllI[613]] = y."(whisper) Do you know about the Myreque?";
        y.llIllllIlI[y.llIllllllI[614]] = y."(whisper) I really need to meet the Myreque.";
        y.llIllllIlI[y.llIllllllI[615]] = y."How can Old Man Ral help me?";
        y.llIllllIlI[y.llIllllllI[616]] = y."Someone said you could help me.";
        y.llIllllIlI[y.llIllllllI[617]] = y."Old Man Ral, the sage of Sanguinesti.";
        y.llIllllIlI[y.llIllllllI[618]] = y."Talk to the king about Morytania.";
        y.llIllllIlI[y.llIllllllI[619]] = y."What should I do now?";
        y.llIllllIlI[y.llIllllllI[620]] = y."Yes thanks. I'll accept the free teleport.";
        y.llIllllIlI[y.llIllllllI[621]] = y."Okay, lead the way.";
        y.llIllllIlI[y.llIllllllI[622]] = y."";
    }

    /*
     * WARNING - void declaration
     */
    private static boolean an() {
        void var85;
        int[] nArray = new int[llIllllllI[21]];
        nArray[y.llIllllllI[1]] = llIllllllI[33];
        nArray[y.llIllllllI[0]] = llIllllllI[29];
        nArray[y.llIllllllI[4]] = llIllllllI[27];
        nArray[y.llIllllllI[6]] = llIllllllI[31];
        nArray[y.llIllllllI[8]] = llIllllllI[20];
        nArray[y.llIllllllI[2]] = llIllllllI[34];
        nArray[y.llIllllllI[11]] = llIllllllI[35];
        nArray[y.llIllllllI[13]] = llIllllllI[22];
        nArray[y.llIllllllI[15]] = llIllllllI[23];
        nArray[y.llIllllllI[16]] = llIllllllI[36];
        nArray[y.llIllllllI[17]] = llIllllllI[24];
        nArray[y.llIllllllI[19]] = llIllllllI[37];
        int[] nArray2 = nArray;
        int var91 = llIllllllI[1];
        while (y.lIllllIIlIIlI(var91, ((void)var85).length)) {
            int[] nArray3 = new int[llIllllllI[0]];
            nArray3[y.llIllllllI[1]] = var85[var91];
            if (y.lIllllIIlIIll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return llIllllllI[1];
            }
            ++var91;
            0;
            if (1 < 2) continue;
            return ((0xE4 ^ 0x97 ^ (0x6B ^ 0x11)) & (0x16 ^ 0x64 ^ (0xD4 ^ 0xAF) ^ -1)) != 0;
        }
        return llIllllllI[0];
    }

    /*
     * WARNING - void declaration
     */
    public static void bq() {
        WorldArea var50;
        WorldPoint var76;
        WorldArea var102;
        void var65;
        void var23;
        void var98;
        void var86;
        void var77;
        void var15;
        void var73;
        void var47;
        void var49;
        void var95;
        void var89;
        void var105;
        void var104;
        void var16;
        void var32;
        void var43;
        void var6;
        void var59;
        void var93;
        void var38;
        void var92;
        void var84;
        void var112;
        void var72;
        WorldPoint worldPoint = new WorldPoint(llIllllllI[346], llIllllllI[347], llIllllllI[1]);
        WorldPoint worldPoint2 = new WorldPoint(llIllllllI[348], llIllllllI[276], llIllllllI[0]);
        WorldPoint worldPoint3 = new WorldPoint(llIllllllI[349], llIllllllI[350], llIllllllI[0]);
        WorldPoint worldPoint4 = new WorldPoint(llIllllllI[351], llIllllllI[352], llIllllllI[0]);
        WorldPoint worldPoint5 = new WorldPoint(llIllllllI[348], llIllllllI[353], llIllllllI[0]);
        WorldPoint worldPoint6 = new WorldPoint(llIllllllI[216], llIllllllI[354], llIllllllI[1]);
        WorldPoint worldPoint7 = new WorldPoint(llIllllllI[355], llIllllllI[356], llIllllllI[0]);
        WorldPoint worldPoint8 = new WorldPoint(llIllllllI[357], llIllllllI[293], llIllllllI[6]);
        WorldPoint worldPoint9 = new WorldPoint(llIllllllI[358], llIllllllI[359], llIllllllI[4]);
        WorldArea worldArea = new WorldArea(llIllllllI[280], llIllllllI[360], llIllllllI[3], llIllllllI[55], llIllllllI[1]);
        WorldArea worldArea2 = new WorldArea(llIllllllI[275], llIllllllI[276], llIllllllI[11], llIllllllI[6], llIllllllI[1]);
        WorldArea worldArea3 = new WorldArea(llIllllllI[275], llIllllllI[276], llIllllllI[11], llIllllllI[8], llIllllllI[0]);
        WorldArea worldArea4 = new WorldArea(llIllllllI[346], llIllllllI[361], llIllllllI[8], llIllllllI[8], llIllllllI[0]);
        WorldArea worldArea5 = new WorldArea(llIllllllI[362], llIllllllI[361], llIllllllI[11], llIllllllI[11], llIllllllI[0]);
        WorldArea worldArea6 = new WorldArea(llIllllllI[351], llIllllllI[303], llIllllllI[8], llIllllllI[6], llIllllllI[0]);
        WorldArea worldArea7 = new WorldArea(llIllllllI[363], llIllllllI[293], llIllllllI[11], llIllllllI[16], llIllllllI[0]);
        WorldArea worldArea8 = new WorldArea(llIllllllI[348], llIllllllI[352], llIllllllI[2], llIllllllI[6], llIllllllI[0]);
        WorldArea worldArea9 = new WorldArea(llIllllllI[364], llIllllllI[365], llIllllllI[11], llIllllllI[2], llIllllllI[1]);
        WorldArea worldArea10 = new WorldArea(llIllllllI[366], llIllllllI[354], llIllllllI[11], llIllllllI[2], llIllllllI[1]);
        WorldArea worldArea11 = new WorldArea(llIllllllI[367], llIllllllI[354], llIllllllI[2], llIllllllI[2], llIllllllI[0]);
        WorldArea worldArea12 = new WorldArea(llIllllllI[364], llIllllllI[354], llIllllllI[4], llIllllllI[2], llIllllllI[0]);
        WorldArea worldArea13 = new WorldArea(llIllllllI[362], llIllllllI[356], llIllllllI[8], llIllllllI[11], llIllllllI[0]);
        WorldArea worldArea14 = new WorldArea(llIllllllI[368], llIllllllI[356], llIllllllI[15], llIllllllI[11], llIllllllI[1]);
        WorldArea worldArea15 = new WorldArea(llIllllllI[369], llIllllllI[356], llIllllllI[19], llIllllllI[11], llIllllllI[1]);
        WorldArea worldArea16 = new WorldArea(llIllllllI[370], llIllllllI[356], llIllllllI[16], llIllllllI[13], llIllllllI[0]);
        WorldArea worldArea17 = new WorldArea(llIllllllI[357], llIllllllI[293], llIllllllI[13], llIllllllI[16], llIllllllI[0]);
        WorldArea worldArea18 = new WorldArea(llIllllllI[369], llIllllllI[293], llIllllllI[16], llIllllllI[16], llIllllllI[4]);
        WorldArea worldArea19 = new WorldArea(llIllllllI[371], llIllllllI[293], llIllllllI[15], llIllllllI[8], llIllllllI[6]);
        WorldArea worldArea20 = new WorldArea(llIllllllI[369], llIllllllI[302], llIllllllI[13], llIllllllI[2], llIllllllI[6]);
        WorldArea worldArea21 = new WorldArea(llIllllllI[371], llIllllllI[372], llIllllllI[17], llIllllllI[11], llIllllllI[4]);
        WorldArea worldArea22 = new WorldArea(llIllllllI[373], llIllllllI[350], llIllllllI[11], llIllllllI[15], llIllllllI[4]);
        WorldArea worldArea23 = new WorldArea(llIllllllI[373], llIllllllI[302], llIllllllI[2], llIllllllI[13], llIllllllI[0]);
        WorldArea worldArea24 = new WorldArea(llIllllllI[374], llIllllllI[375], llIllllllI[8], llIllllllI[15], llIllllllI[0]);
        WorldArea worldArea25 = new WorldArea(llIllllllI[376], llIllllllI[377], llIllllllI[11], llIllllllI[2], llIllllllI[4]);
        WorldArea worldArea26 = new WorldArea(llIllllllI[226], llIllllllI[239], llIllllllI[2], llIllllllI[2], llIllllllI[1]);
        if (y.lIllllIIlIIIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && y.lIllllIIlIIll(Players.getLocal().getWorldLocation().getPlane())) {
            void var7;
            if (y.lIllllIIlIIll(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = llIllllIlI[llIllllllI[378]];
                Movement.walkTo((WorldPoint)worldPoint);
                0;
                Time.sleepTicks((int)llIllllllI[0]);
                0;
            }
            if (y.lIllllIIlIIIl(var7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = llIllllIlI[llIllllllI[379]];
                String[] stringArray = new String[llIllllllI[0]];
                stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[154]];
                TileObjects.getNearest((String[])stringArray).interact(llIllllIlI[llIllllllI[380]]);
                Time.sleepTicks((int)llIllllllI[6]);
                0;
            }
        }
        if (y.lIllllIIlIIIl(var72.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            void var88;
            AccBuilderSotf.c = llIllllIlI[llIllllllI[381]];
            if (y.lIllllIIlIIll(Players.getLocal().getWorldLocation().equals((Object)var88) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)var88);
                0;
                Time.sleepTicks((int)llIllllllI[0]);
                0;
            }
            if (y.lIllllIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)var88) ? 1 : 0)) {
                int[] nArray = new int[llIllllllI[0]];
                nArray[y.llIllllllI[1]] = llIllllllI[382];
                TileObjects.getNearest((int[])nArray).interact(llIllllIlI[llIllllllI[383]]);
                Time.sleepTicks((int)llIllllllI[6]);
                0;
            }
        }
        if (y.lIllllIIlIIIl(var112.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            void var69;
            AccBuilderSotf.c = llIllllIlI[llIllllllI[384]];
            if (y.lIllllIIlIIll(Players.getLocal().getWorldLocation().equals((Object)var69) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)var69);
                0;
                Time.sleepTicks((int)llIllllllI[0]);
                0;
            }
            if (y.lIllllIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)var69) ? 1 : 0)) {
                int[] nArray = new int[llIllllllI[0]];
                nArray[y.llIllllllI[1]] = llIllllllI[385];
                TileObjects.getNearest((int[])nArray).interact(llIllllIlI[llIllllllI[386]]);
                Time.sleepTicks((int)llIllllllI[6]);
                0;
            }
        }
        if (y.lIllllIIlIIIl(var84.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            String[] stringArray = new String[llIllllllI[0]];
            stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[387]];
            if (y.lIllllIIlIlIl(TileObjects.getNearest((String[])stringArray))) {
                String[] stringArray2 = new String[llIllllllI[0]];
                stringArray2[y.llIllllllI[1]] = llIllllIlI[llIllllllI[388]];
                String[] stringArray3 = new String[llIllllllI[0]];
                stringArray3[y.llIllllllI[1]] = llIllllIlI[llIllllllI[389]];
                if (y.lIllllIIlIIIl(TileObjects.getNearest((String[])stringArray2).hasAction(stringArray3) ? 1 : 0)) {
                    AccBuilderSotf.c = llIllllIlI[llIllllllI[390]];
                    String[] stringArray4 = new String[llIllllllI[0]];
                    stringArray4[y.llIllllllI[1]] = llIllllIlI[llIllllllI[167]];
                    TileObjects.getNearest((String[])stringArray4).interact(llIllllIlI[llIllllllI[391]]);
                    Time.sleepTicks((int)llIllllllI[6]);
                    0;
                }
            }
            int[] nArray = new int[llIllllllI[0]];
            nArray[y.llIllllllI[1]] = llIllllllI[392];
            if (y.lIllllIIlIlIl(TileObjects.getNearest((int[])nArray))) {
                AccBuilderSotf.c = llIllllIlI[llIllllllI[393]];
                int[] nArray2 = new int[llIllllllI[0]];
                nArray2[y.llIllllllI[1]] = llIllllllI[392];
                TileObjects.getNearest((int[])nArray2).interact(llIllllIlI[llIllllllI[394]]);
                Time.sleepTicks((int)llIllllllI[6]);
                0;
            }
            int[] nArray3 = new int[llIllllllI[0]];
            nArray3[y.llIllllllI[1]] = llIllllllI[395];
            if (y.lIllllIIlIlIl(TileObjects.getNearest((int[])nArray3))) {
                AccBuilderSotf.c = llIllllIlI[llIllllllI[396]];
                int[] nArray4 = new int[llIllllllI[0]];
                nArray4[y.llIllllllI[1]] = llIllllllI[395];
                TileObjects.getNearest((int[])nArray4).interact(llIllllIlI[llIllllllI[397]]);
                Time.sleepTicks((int)llIllllllI[6]);
                0;
            }
        }
        if (y.lIllllIIlIIIl(var92.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[398]];
            String[] stringArray = new String[llIllllllI[0]];
            stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[399]];
            TileObjects.getNearest((String[])stringArray).interact(llIllllIlI[llIllllllI[400]]);
            Time.sleepTicks((int)llIllllllI[8]);
            0;
        }
        if (y.lIllllIIlIIIl(var38.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            void var82;
            AccBuilderSotf.c = llIllllIlI[llIllllllI[401]];
            if (y.lIllllIIlIIll(Players.getLocal().getWorldLocation().equals((Object)var82) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)var82);
                0;
                Time.sleepTicks((int)llIllllllI[0]);
                0;
            }
            if (y.lIllllIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)var82) ? 1 : 0)) {
                String[] stringArray = new String[llIllllllI[0]];
                stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[168]];
                if (y.lIllllIIlIlIl(TileObjects.getNearest((String[])stringArray))) {
                    String[] stringArray5 = new String[llIllllllI[0]];
                    stringArray5[y.llIllllllI[1]] = llIllllIlI[llIllllllI[402]];
                    String[] stringArray6 = new String[llIllllllI[0]];
                    stringArray6[y.llIllllllI[1]] = llIllllIlI[llIllllllI[403]];
                    if (y.lIllllIIlIIIl(TileObjects.getNearest((String[])stringArray5).hasAction(stringArray6) ? 1 : 0)) {
                        String[] stringArray7 = new String[llIllllllI[0]];
                        stringArray7[y.llIllllllI[1]] = llIllllIlI[llIllllllI[404]];
                        TileObjects.getNearest((String[])stringArray7).interact(llIllllIlI[llIllllllI[405]]);
                        Time.sleepTicks((int)llIllllllI[4]);
                        0;
                    }
                }
                String[] stringArray8 = new String[llIllllllI[0]];
                stringArray8[y.llIllllllI[1]] = llIllllIlI[llIllllllI[406]];
                if (y.lIllllIIlIlIl(TileObjects.getNearest((String[])stringArray8))) {
                    String[] stringArray9 = new String[llIllllllI[0]];
                    stringArray9[y.llIllllllI[1]] = llIllllIlI[llIllllllI[407]];
                    TileObjects.getNearest((String[])stringArray9).interact(llIllllIlI[llIllllllI[408]]);
                    Time.sleepTicks((int)llIllllllI[6]);
                    0;
                }
            }
        }
        if (y.lIllllIIlIIIl(var93.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && y.lIllllIIlIIll(Players.getLocal().isMoving() ? 1 : 0)) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[409]];
            Time.sleepTicks((int)llIllllllI[4]);
            0;
            String[] stringArray = new String[llIllllllI[0]];
            stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[410]];
            TileObjects.getNearest((String[])stringArray).interact(llIllllIlI[llIllllllI[169]]);
            Time.sleepTicks((int)llIllllllI[2]);
            0;
        }
        if (y.lIllllIIlIIIl(var59.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[411]];
            int[] nArray = new int[llIllllllI[0]];
            nArray[y.llIllllllI[1]] = llIllllllI[412];
            if (y.lIllllIIlIlIl(TileObjects.getNearest((int[])nArray))) {
                int[] nArray5 = new int[llIllllllI[0]];
                nArray5[y.llIllllllI[1]] = llIllllllI[412];
                TileObjects.getNearest((int[])nArray5).interact(llIllllIlI[llIllllllI[413]]);
                Time.sleepTicks((int)llIllllllI[8]);
                0;
            }
            String[] stringArray = new String[llIllllllI[0]];
            stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[414]];
            if (y.lIllllIIlIlll(TileObjects.getNearest((String[])stringArray))) {
                String[] stringArray10 = new String[llIllllllI[0]];
                stringArray10[y.llIllllllI[1]] = llIllllIlI[llIllllllI[415]];
                TileObjects.getNearest((String[])stringArray10).interact(llIllllIlI[llIllllllI[416]]);
                Time.sleepTicks((int)llIllllllI[8]);
                0;
            }
            String[] stringArray11 = new String[llIllllllI[0]];
            stringArray11[y.llIllllllI[1]] = llIllllIlI[llIllllllI[417]];
            if (y.lIllllIIlIlIl(TileObjects.getNearest((String[])stringArray11))) {
                String[] stringArray12 = new String[llIllllllI[0]];
                stringArray12[y.llIllllllI[1]] = llIllllIlI[llIllllllI[418]];
                String[] stringArray13 = new String[llIllllllI[0]];
                stringArray13[y.llIllllllI[1]] = llIllllIlI[llIllllllI[419]];
                if (y.lIllllIIlIIIl(TileObjects.getNearest((String[])stringArray12).hasAction(stringArray13) ? 1 : 0)) {
                    String[] stringArray14 = new String[llIllllllI[0]];
                    stringArray14[y.llIllllllI[1]] = llIllllIlI[llIllllllI[420]];
                    TileObjects.getNearest((String[])stringArray14).interact(llIllllIlI[llIllllllI[26]]);
                    Time.sleepTicks((int)llIllllllI[6]);
                    0;
                }
            }
            String[] stringArray15 = new String[llIllllllI[0]];
            stringArray15[y.llIllllllI[1]] = llIllllIlI[llIllllllI[421]];
            if (y.lIllllIIlIlIl(TileObjects.getNearest((String[])stringArray15))) {
                String[] stringArray16 = new String[llIllllllI[0]];
                stringArray16[y.llIllllllI[1]] = llIllllIlI[llIllllllI[422]];
                String[] stringArray17 = new String[llIllllllI[0]];
                stringArray17[y.llIllllllI[1]] = llIllllIlI[llIllllllI[423]];
                if (y.lIllllIIlIIIl(TileObjects.getNearest((String[])stringArray16).hasAction(stringArray17) ? 1 : 0)) {
                    String[] stringArray18 = new String[llIllllllI[0]];
                    stringArray18[y.llIllllllI[1]] = llIllllIlI[llIllllllI[424]];
                    TileObjects.getNearest((String[])stringArray18).interact(llIllllIlI[llIllllllI[425]]);
                    Time.sleepTicks((int)llIllllllI[6]);
                    0;
                }
            }
        }
        if (y.lIllllIIlIIIl(var6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && y.lIllllIIlIIll(Players.getLocal().isMoving() ? 1 : 0) && y.lIllllIIllIII(Players.getLocal().getAnimation(), llIllllllI[54])) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[426]];
            String[] stringArray = new String[llIllllllI[0]];
            stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[427]];
            TileObjects.getNearest((String[])stringArray).interact(llIllllIlI[llIllllllI[428]]);
            Time.sleepTicks((int)llIllllllI[2]);
            0;
        }
        if (y.lIllllIIlIIIl(var43.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[429]];
            if (y.lIllllIIllIII(Players.getLocal().getAnimation(), llIllllllI[54])) {
                String[] stringArray = new String[llIllllllI[0]];
                stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[184]];
                TileObjects.getNearest((String[])stringArray).interact(llIllllIlI[llIllllllI[430]]);
                Time.sleepTicks((int)llIllllllI[6]);
                0;
            }
        }
        if (y.lIllllIIlIIIl(var32.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            void var60;
            AccBuilderSotf.c = llIllllIlI[llIllllllI[431]];
            if (y.lIllllIIlIIll(Players.getLocal().getWorldLocation().equals((Object)var60) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)var60);
                0;
                Time.sleepTicks((int)llIllllllI[0]);
                0;
            }
            if (y.lIllllIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)var60) ? 1 : 0)) {
                int[] nArray = new int[llIllllllI[0]];
                nArray[y.llIllllllI[1]] = llIllllllI[432];
                TileObjects.getNearest((int[])nArray).interact(llIllllIlI[llIllllllI[433]]);
                Time.sleepTicks((int)llIllllllI[6]);
                0;
            }
        }
        if (y.lIllllIIlIIIl(var16.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && y.lIllllIIlIIll(Players.getLocal().isMoving() ? 1 : 0) && y.lIllllIIllIII(Players.getLocal().getAnimation(), llIllllllI[54])) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[434]];
            String[] stringArray = new String[llIllllllI[0]];
            stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[435]];
            TileObjects.getNearest((String[])stringArray).interact(llIllllIlI[llIllllllI[436]]);
            Time.sleepTicks((int)llIllllllI[6]);
            0;
        }
        if (y.lIllllIIlIIIl(var104.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && y.lIllllIIlIIll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llIllllllI[369], llIllllllI[359], llIllllllI[1])) ? 1 : 0)) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[437]];
            if (y.lIllllIIlIIll(Dialog.isOpen() ? 1 : 0) && y.lIllllIIlIIll(Players.getLocal().isMoving() ? 1 : 0) && y.lIllllIIllIII(Players.getLocal().getAnimation(), llIllllllI[54])) {
                String[] stringArray = new String[llIllllllI[0]];
                stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[438]];
                TileObjects.getNearest((String[])stringArray).interact(llIllllIlI[llIllllllI[439]]);
                Time.sleepTicks((int)llIllllllI[13]);
                0;
                AccBuilderSotf.c = llIllllIlI[llIllllllI[194]];
                String[] stringArray19 = new String[llIllllllI[0]];
                stringArray19[y.llIllllllI[1]] = llIllllIlI[llIllllllI[440]];
                TileObjects.getNearest((String[])stringArray19).interact(llIllllIlI[llIllllllI[441]]);
                Time.sleepTicks((int)llIllllllI[4]);
                0;
            }
        }
        if (!y.lIllllIIlIIll(var105.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || y.lIllllIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llIllllllI[369], llIllllllI[359], llIllllllI[1])) ? 1 : 0)) {
            void var37;
            AccBuilderSotf.c = llIllllIlI[llIllllllI[442]];
            if (y.lIllllIIllIIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var37), llIllllllI[6])) {
                Movement.walkTo((WorldPoint)var37);
                0;
                Time.sleepTicks((int)llIllllllI[0]);
                0;
            }
            if (y.lIllllIIllIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var37), llIllllllI[6])) {
                String[] stringArray = new String[llIllllllI[0]];
                stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[443]];
                TileObjects.getNearest((String[])stringArray).interact(llIllllIlI[llIllllllI[444]]);
                Time.sleepTicks((int)llIllllllI[6]);
                0;
            }
        }
        if (y.lIllllIIlIIIl(var89.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            void var94;
            AccBuilderSotf.c = llIllllIlI[llIllllllI[445]];
            if (y.lIllllIIlIIll(Players.getLocal().getWorldLocation().equals((Object)var94) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)var94);
                0;
                Time.sleepTicks((int)llIllllllI[0]);
                0;
            }
            if (y.lIllllIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)var94) ? 1 : 0)) {
                int[] nArray = new int[llIllllllI[0]];
                nArray[y.llIllllllI[1]] = llIllllllI[446];
                TileObjects.getNearest((int[])nArray).interact(llIllllIlI[llIllllllI[447]]);
                Time.sleepTicks((int)llIllllllI[6]);
                0;
            }
        }
        if (y.lIllllIIlIIIl(var95.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[448]];
            if (y.lIllllIIlIIll(Players.getLocal().isMoving() ? 1 : 0) && y.lIllllIIllIII(Players.getLocal().getAnimation(), llIllllllI[54])) {
                String[] stringArray = new String[llIllllllI[0]];
                stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[449]];
                TileObjects.getNearest((String[])stringArray).interact(llIllllIlI[llIllllllI[450]]);
                Time.sleepTicks((int)llIllllllI[6]);
                0;
            }
        }
        if (y.lIllllIIlIIIl(var49.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[451]];
            if (y.lIllllIIlIIll(Players.getLocal().isMoving() ? 1 : 0) && y.lIllllIIllIII(Players.getLocal().getAnimation(), llIllllllI[54])) {
                AccBuilderSotf.c = llIllllIlI[llIllllllI[452]];
                String[] stringArray = new String[llIllllllI[0]];
                stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[453]];
                TileObjects.getNearest((String[])stringArray).interact(llIllllIlI[llIllllllI[454]]);
                Time.sleepTicks((int)llIllllllI[6]);
                0;
            }
        }
        if (y.lIllllIIlIIIl(var47.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            void var36;
            AccBuilderSotf.c = llIllllIlI[llIllllllI[455]];
            if (y.lIllllIIlIIll(Players.getLocal().getWorldLocation().equals((Object)var36) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)var36);
                0;
                Time.sleepTicks((int)llIllllllI[0]);
                0;
            }
            if (y.lIllllIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)var36) ? 1 : 0)) {
                int[] nArray = new int[llIllllllI[0]];
                nArray[y.llIllllllI[1]] = llIllllllI[456];
                TileObjects.getNearest((int[])nArray).interact(llIllllIlI[llIllllllI[457]]);
                Time.sleepTicks((int)llIllllllI[6]);
                0;
            }
        }
        if (y.lIllllIIlIIIl(var73.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[458]];
            if (y.lIllllIIlIIll(Players.getLocal().isMoving() ? 1 : 0) && y.lIllllIIllIII(Players.getLocal().getAnimation(), llIllllllI[54])) {
                AccBuilderSotf.c = llIllllIlI[llIllllllI[459]];
                String[] stringArray = new String[llIllllllI[0]];
                stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[460]];
                TileObjects.getNearest((String[])stringArray).interact(llIllllIlI[llIllllllI[461]]);
                Time.sleepTicks((int)llIllllllI[6]);
                0;
            }
        }
        if (y.lIllllIIlIIIl(var15.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[462]];
            if (y.lIllllIIlIIll(Players.getLocal().isMoving() ? 1 : 0) && y.lIllllIIllIII(Players.getLocal().getAnimation(), llIllllllI[54])) {
                String[] stringArray = new String[llIllllllI[0]];
                stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[463]];
                TileObjects.getNearest((String[])stringArray).interact(llIllllIlI[llIllllllI[464]]);
                Time.sleepTicks((int)llIllllllI[8]);
                0;
            }
        }
        if (y.lIllllIIlIIIl(var77.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[465]];
            if (y.lIllllIIlIIll(Players.getLocal().isMoving() ? 1 : 0) && y.lIllllIIllIII(Players.getLocal().getAnimation(), llIllllllI[54])) {
                AccBuilderSotf.c = llIllllIlI[llIllllllI[466]];
                String[] stringArray = new String[llIllllllI[0]];
                stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[467]];
                TileObjects.getNearest((String[])stringArray).interact(llIllllIlI[llIllllllI[468]]);
                Time.sleepTicks((int)llIllllllI[6]);
                0;
            }
        }
        if (y.lIllllIIlIIIl(var86.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[469]];
            String[] stringArray = new String[llIllllllI[0]];
            stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[470]];
            if (y.lIllllIIlIlIl(TileObjects.getNearest((String[])stringArray))) {
                String[] stringArray20 = new String[llIllllllI[0]];
                stringArray20[y.llIllllllI[1]] = llIllllIlI[llIllllllI[471]];
                TileObjects.getNearest((String[])stringArray20).interact(llIllllIlI[llIllllllI[472]]);
                Time.sleepTicks((int)llIllllllI[8]);
                0;
            }
            String[] stringArray21 = new String[llIllllllI[0]];
            stringArray21[y.llIllllllI[1]] = llIllllIlI[llIllllllI[473]];
            if (y.lIllllIIlIlIl(TileObjects.getNearest((String[])stringArray21))) {
                String[] stringArray22 = new String[llIllllllI[0]];
                stringArray22[y.llIllllllI[1]] = llIllllIlI[llIllllllI[474]];
                TileObjects.getNearest((String[])stringArray22).interact(llIllllIlI[llIllllllI[475]]);
                Time.sleepTicks((int)llIllllllI[6]);
                0;
            }
        }
        if (y.lIllllIIlIIIl(var98.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && y.lIllllIIlIIll(Players.getLocal().isMoving() ? 1 : 0) && y.lIllllIIllIII(Players.getLocal().getAnimation(), llIllllllI[54])) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[476]];
            String[] stringArray = new String[llIllllllI[0]];
            stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[477]];
            TileObjects.getNearest((String[])stringArray).interact(llIllllIlI[llIllllllI[478]]);
            Time.sleepTicks((int)llIllllllI[6]);
            0;
        }
        if (y.lIllllIIlIIIl(var23.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            void var87;
            AccBuilderSotf.c = llIllllIlI[llIllllllI[479]];
            if (y.lIllllIIlIIll(Players.getLocal().getWorldLocation().equals((Object)var87) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)var87);
                0;
                Time.sleepTicks((int)llIllllllI[0]);
                0;
            }
            if (y.lIllllIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)var87) ? 1 : 0) && y.lIllllIIlIIll(Players.getLocal().isMoving() ? 1 : 0) && y.lIllllIIllIII(Players.getLocal().getAnimation(), llIllllllI[54])) {
                String[] stringArray = new String[llIllllllI[0]];
                stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[480]];
                TileObjects.getNearest((String[])stringArray).interact(llIllllIlI[llIllllllI[481]]);
                Time.sleepTicks((int)llIllllllI[4]);
                0;
            }
        }
        WorldArea var57 = new WorldArea(llIllllllI[373], llIllllllI[353], llIllllllI[15], llIllllllI[6], llIllllllI[0]);
        WorldArea var4 = new WorldArea(llIllllllI[358], llIllllllI[356], llIllllllI[8], llIllllllI[13], llIllllllI[0]);
        WorldPoint var28 = new WorldPoint(llIllllllI[482], llIllllllI[483], llIllllllI[0]);
        if (!y.lIllllIIlIIll(var57.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || y.lIllllIIlIIIl(var4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[484]];
            if (y.lIllllIIlIIll(Players.getLocal().getWorldLocation().equals((Object)var28) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)var28);
                0;
                Time.sleepTicks((int)llIllllllI[0]);
                0;
            }
            if (y.lIllllIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)var28) ? 1 : 0)) {
                int[] nArray = new int[llIllllllI[0]];
                nArray[y.llIllllllI[1]] = llIllllllI[485];
                TileObjects.getNearest((int[])nArray).interact(llIllllIlI[llIllllllI[486]]);
                Time.sleepTicks((int)llIllllllI[6]);
                0;
            }
        }
        WorldArea var110 = new WorldArea(llIllllllI[487], llIllllllI[320], llIllllllI[2], llIllllllI[2], llIllllllI[0]);
        WorldPoint var97 = new WorldPoint(llIllllllI[374], llIllllllI[315], llIllllllI[0]);
        if (y.lIllllIIlIIIl(var110.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[488]];
            if (y.lIllllIIlIIll(Players.getLocal().getWorldLocation().equals((Object)var97) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)var97);
                0;
                Time.sleepTicks((int)llIllllllI[0]);
                0;
            }
            if (y.lIllllIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)var97) ? 1 : 0) && y.lIllllIIlIIll(Dialog.isOpen() ? 1 : 0)) {
                int[] nArray = new int[llIllllllI[0]];
                nArray[y.llIllllllI[1]] = llIllllllI[489];
                TileObjects.getNearest((int[])nArray).interact(llIllllIlI[llIllllllI[490]]);
                Time.sleepTicks((int)llIllllllI[6]);
                0;
            }
        }
        WorldArea var19 = new WorldArea(llIllllllI[487], llIllllllI[43], llIllllllI[11], llIllllllI[17], llIllllllI[0]);
        WorldPoint var54 = new WorldPoint(llIllllllI[491], llIllllllI[492], llIllllllI[0]);
        if (y.lIllllIIlIIIl(var19.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[493]];
            if (y.lIllllIIlIIll(Players.getLocal().getWorldLocation().equals((Object)var54) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)var54);
                0;
                Time.sleepTicks((int)llIllllllI[0]);
                0;
            }
            if (y.lIllllIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)var54) ? 1 : 0)) {
                int[] nArray = new int[llIllllllI[0]];
                nArray[y.llIllllllI[1]] = llIllllllI[494];
                TileObjects.getNearest((int[])nArray).interact(llIllllIlI[llIllllllI[495]]);
                Time.sleepTicks((int)llIllllllI[6]);
                0;
            }
        }
        WorldArea var78 = new WorldArea(llIllllllI[358], llIllllllI[496], llIllllllI[15], llIllllllI[8], llIllllllI[0]);
        WorldArea var67 = new WorldArea(llIllllllI[491], llIllllllI[497], llIllllllI[16], llIllllllI[11], llIllllllI[4]);
        if (y.lIllllIIlIIIl(var78.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            String[] stringArray = new String[llIllllllI[0]];
            stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[498]];
            if (y.lIllllIIlIlIl(TileObjects.getNearest((String[])stringArray))) {
                String[] stringArray23 = new String[llIllllllI[0]];
                stringArray23[y.llIllllllI[1]] = llIllllIlI[llIllllllI[499]];
                if (y.lIllllIIlIIll(Inventory.contains((String[])stringArray23) ? 1 : 0)) {
                    AccBuilderSotf.c = llIllllIlI[llIllllllI[500]];
                    Time.sleepTicks((int)llIllllllI[4]);
                    0;
                    String[] stringArray24 = new String[llIllllllI[0]];
                    stringArray24[y.llIllllllI[1]] = llIllllIlI[llIllllllI[501]];
                    TileObjects.getNearest((String[])stringArray24).interact(llIllllIlI[llIllllllI[502]]);
                    Time.sleepTicks((int)llIllllllI[6]);
                    0;
                }
            }
            String[] stringArray25 = new String[llIllllllI[0]];
            stringArray25[y.llIllllllI[1]] = llIllllIlI[llIllllllI[503]];
            if (y.lIllllIIlIlIl(TileObjects.getNearest((String[])stringArray25))) {
                String[] stringArray26 = new String[llIllllllI[0]];
                stringArray26[y.llIllllllI[1]] = llIllllIlI[llIllllllI[504]];
                if (y.lIllllIIlIIIl(Inventory.contains((String[])stringArray26) ? 1 : 0)) {
                    AccBuilderSotf.c = llIllllIlI[llIllllllI[505]];
                    String[] stringArray27 = new String[llIllllllI[0]];
                    stringArray27[y.llIllllllI[1]] = llIllllIlI[llIllllllI[506]];
                    TileObjects.getNearest((String[])stringArray27).interact(llIllllIlI[llIllllllI[507]]);
                    Time.sleepTicks((int)llIllllllI[6]);
                    0;
                }
            }
            int[] nArray = new int[llIllllllI[0]];
            nArray[y.llIllllllI[1]] = llIllllllI[508];
            if (y.lIllllIIlIlIl(TileObjects.getNearest((int[])nArray))) {
                AccBuilderSotf.c = llIllllIlI[llIllllllI[509]];
                int[] nArray6 = new int[llIllllllI[0]];
                nArray6[y.llIllllllI[1]] = llIllllllI[508];
                TileObjects.getNearest((int[])nArray6).interact(llIllllIlI[llIllllllI[510]]);
            }
        }
        if (y.lIllllIIlIIIl(var67.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[511]];
            String[] stringArray = new String[llIllllllI[0]];
            stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[512]];
            if (y.lIllllIIlIIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray28 = new String[llIllllllI[0]];
                stringArray28[y.llIllllllI[1]] = llIllllIlI[llIllllllI[513]];
                TileObjects.getNearest((String[])stringArray28).interact(llIllllIlI[llIllllllI[514]]);
                Time.sleepTicks((int)llIllllllI[2]);
                0;
            }
            String[] stringArray29 = new String[llIllllllI[0]];
            stringArray29[y.llIllllllI[1]] = llIllllIlI[llIllllllI[515]];
            if (y.lIllllIIlIIIl(Inventory.contains((String[])stringArray29) ? 1 : 0)) {
                String[] stringArray30 = new String[llIllllllI[0]];
                stringArray30[y.llIllllllI[1]] = llIllllIlI[llIllllllI[516]];
                TileObjects.getNearest((String[])stringArray30).interact(llIllllIlI[llIllllllI[517]]);
            }
        }
        WorldArea var45 = new WorldArea(llIllllllI[226], llIllllllI[227], llIllllllI[11], llIllllllI[11], llIllllllI[1]);
        WorldArea var31 = new WorldArea(llIllllllI[487], llIllllllI[518], llIllllllI[47], llIllllllI[28], llIllllllI[1]);
        WorldPoint lllllllllllllllllIllllIllllllIIl = new WorldPoint(llIllllllI[519], llIllllllI[217], llIllllllI[1]);
        WorldPoint var46 = new WorldPoint(llIllllllI[221], llIllllllI[222], llIllllllI[1]);
        if (y.lIllllIIlIIIl(var31.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && y.lIllllIIlIIll(var45.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && y.lIllllIIlIIll(var65.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            block106: {
                if (!y.lIllllIIllIll(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[153]) || y.lIllllIIllIII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[154])) {
                    do {
                        String[] stringArray = new String[llIllllllI[0]];
                        stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[520]];
                        if (!y.lIllllIIlIIll(Inventory.contains((String[])stringArray) ? 1 : 0)) break block106;
                        String[] stringArray31 = new String[llIllllllI[0]];
                        stringArray31[y.llIllllllI[1]] = llIllllIlI[llIllllllI[521]];
                        if (!y.lIllllIIlIIll(Inventory.contains((String[])stringArray31) ? 1 : 0)) break block106;
                        var102 = new WorldPoint(llIllllllI[522], llIllllllI[252], llIllllllI[1]);
                        var76 = new WorldArea(llIllllllI[358], llIllllllI[239], llIllllllI[8], llIllllllI[11], llIllllllI[1]);
                        if (y.lIllllIIlIIll(var76.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = llIllllIlI[llIllllllI[523]];
                            Movement.walkTo((WorldPoint)var102);
                            0;
                            Time.sleepTicks((int)llIllllllI[0]);
                            0;
                        }
                        if (y.lIllllIIlIIIl(var76.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && y.lIllllIIlIIll(Dialog.isOpen() ? 1 : 0)) {
                            AccBuilderSotf.c = llIllllIlI[llIllllllI[524]];
                            String[] stringArray32 = new String[llIllllllI[0]];
                            stringArray32[y.llIllllllI[1]] = llIllllIlI[llIllllllI[525]];
                            if (y.lIllllIIlIIll(Inventory.contains((String[])stringArray32) ? 1 : 0) && y.lIllllIIlIIll(Dialog.isOpen() ? 1 : 0)) {
                                String[] stringArray33 = new String[llIllllllI[0]];
                                stringArray33[y.llIllllllI[1]] = llIllllIlI[llIllllllI[526]];
                                if (y.lIllllIIlIlIl(TileObjects.getNearest((String[])stringArray33))) {
                                    int[] nArray = new int[llIllllllI[0]];
                                    nArray[y.llIllllllI[1]] = llIllllllI[35];
                                    String[] stringArray34 = new String[llIllllllI[0]];
                                    stringArray34[y.llIllllllI[1]] = llIllllIlI[llIllllllI[527]];
                                    Inventory.getFirst((int[])nArray).useOn(TileObjects.getNearest((String[])stringArray34));
                                    Time.sleepTicks((int)llIllllllI[8]);
                                    0;
                                }
                            }
                            String[] stringArray35 = new String[llIllllllI[0]];
                            stringArray35[y.llIllllllI[1]] = llIllllIlI[llIllllllI[528]];
                            if (y.lIllllIIlIIll(Inventory.contains((String[])stringArray35) ? 1 : 0)) {
                                String[] stringArray36 = new String[llIllllllI[0]];
                                stringArray36[y.llIllllllI[1]] = llIllllIlI[llIllllllI[529]];
                                if (y.lIllllIIlIIIl(Inventory.contains((String[])stringArray36) ? 1 : 0)) {
                                    int[] nArray = new int[llIllllllI[0]];
                                    nArray[y.llIllllllI[1]] = llIllllllI[35];
                                    String[] stringArray37 = new String[llIllllllI[0]];
                                    stringArray37[y.llIllllllI[1]] = llIllllIlI[llIllllllI[530]];
                                    Inventory.getFirst((int[])nArray).useOn(TileObjects.getNearest((String[])stringArray37));
                                    Time.sleepTicks((int)llIllllllI[6]);
                                    0;
                                }
                            }
                        }
                        if (y.lIllllIIlIIIl(AccBuilderSotf.d ? 1 : 0)) {
                            0;
                            if (((0x34 ^ 0x14) & ~(0x89 ^ 0xA9)) != 0) {
                                return;
                            }
                            break block106;
                        }
                        g.a(cE);
                        Time.sleepTicks((int)llIllllllI[0]);
                        0;
                        0;
                    } while (null == null);
                    return;
                }
            }
            if (y.lIllllIIlIIll(Players.getLocal().getWorldLocation().equals((Object)var46) ? 1 : 0)) {
                AccBuilderSotf.c = llIllllIlI[llIllllllI[531]];
                Movement.walkTo((WorldPoint)var46);
                0;
                Time.sleepTicks((int)llIllllllI[0]);
                0;
            }
            if (y.lIllllIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)var46) ? 1 : 0)) {
                AccBuilderSotf.c = llIllllIlI[llIllllllI[532]];
                String[] stringArray = new String[llIllllllI[0]];
                stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[533]];
                TileObjects.getNearest((String[])stringArray).interact(llIllllIlI[llIllllllI[534]]);
                Time.sleepTicks((int)llIllllllI[6]);
                0;
            }
        }
        var102 = new WorldArea(llIllllllI[177], llIllllllI[251], llIllllllI[11], llIllllllI[2], llIllllllI[0]);
        var76 = new WorldPoint(llIllllllI[535], llIllllllI[253], llIllllllI[0]);
        if (y.lIllllIIlIIIl(var102.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[536]];
            if (y.lIllllIIlIIll(Players.getLocal().getWorldLocation().equals((Object)var76) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)var76);
                0;
                Time.sleepTicks((int)llIllllllI[0]);
                0;
            }
            if (y.lIllllIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)var76) ? 1 : 0)) {
                int[] nArray = new int[llIllllllI[0]];
                nArray[y.llIllllllI[1]] = llIllllllI[537];
                TileObjects.getNearest((int[])nArray).interact(llIllllIlI[llIllllllI[538]]);
                Time.sleepTicks((int)llIllllllI[6]);
                0;
            }
        }
        if (y.lIllllIIlIIIl((var50 = new WorldArea(llIllllllI[223], llIllllllI[252], llIllllllI[2], llIllllllI[13], llIllllllI[0])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[539]];
            if (y.lIllllIIlIIll(Players.getLocal().isMoving() ? 1 : 0) && y.lIllllIIllIII(Players.getLocal().getAnimation(), llIllllllI[54])) {
                String[] stringArray = new String[llIllllllI[0]];
                stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[540]];
                TileObjects.getNearest((String[])stringArray).interact(llIllllIlI[llIllllllI[541]]);
                Time.sleepTicks((int)llIllllllI[4]);
                0;
            }
        }
        if (y.lIllllIIllIII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[73]) && y.lIllllIIlIIIl(var45.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && y.lIllllIIlIIll(var65.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[542]];
            int[] nArray = new int[llIllllllI[0]];
            nArray[y.llIllllllI[1]] = llIllllllI[35];
            String[] stringArray = new String[llIllllllI[0]];
            stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[543]];
            Inventory.getFirst((int[])nArray).useOn(TileObjects.getNearest((String[])stringArray));
            Time.sleepTicks((int)llIllllllI[8]);
            0;
        }
        if (y.lIllllIIlIlII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[74]) && y.lIllllIIlIIIl(var45.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            String[] stringArray = new String[llIllllllI[0]];
            stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[544]];
            TileObjects.getNearest((String[])stringArray).interact(llIllllIlI[llIllllllI[545]]);
            Time.sleepTicks((int)llIllllllI[6]);
            0;
        }
        if (y.lIllllIIlIIIl(var65.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && y.lIllllIIlIIll(Dialog.isOpen() ? 1 : 0)) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[546]];
            String[] stringArray = new String[llIllllllI[0]];
            stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[547]];
            if (y.lIllllIIlIlll(TileObjects.getNearest((String[])stringArray))) {
                String[] stringArray38 = new String[llIllllllI[0]];
                stringArray38[y.llIllllllI[1]] = llIllllIlI[llIllllllI[548]];
                TileObjects.getNearest((String[])stringArray38).interact(llIllllIlI[llIllllllI[549]]);
                Time.sleepTicks((int)llIllllllI[6]);
                0;
            }
            String[] stringArray39 = new String[llIllllllI[0]];
            stringArray39[y.llIllllllI[1]] = llIllllIlI[llIllllllI[550]];
            if (y.lIllllIIlIlIl(TileObjects.getNearest((String[])stringArray39))) {
                String[] stringArray40 = new String[llIllllllI[0]];
                stringArray40[y.llIllllllI[1]] = llIllllIlI[llIllllllI[551]];
                TileObjects.getNearest((String[])stringArray40).interact(llIllllIlI[llIllllllI[552]]);
                Time.sleepTicks((int)llIllllllI[6]);
                0;
            }
            String[] stringArray41 = new String[llIllllllI[0]];
            stringArray41[y.llIllllllI[1]] = llIllllIlI[llIllllllI[553]];
            if (y.lIllllIIlIlIl(TileObjects.getNearest((String[])stringArray41))) {
                String[] stringArray42 = new String[llIllllllI[0]];
                stringArray42[y.llIllllllI[1]] = llIllllIlI[llIllllllI[554]];
                TileObjects.getNearest((String[])stringArray42).interact(llIllllIlI[llIllllllI[555]]);
                Time.sleepTicks((int)llIllllllI[6]);
                0;
            }
            g.a(cE);
        }
        g.a(cE);
    }
}

