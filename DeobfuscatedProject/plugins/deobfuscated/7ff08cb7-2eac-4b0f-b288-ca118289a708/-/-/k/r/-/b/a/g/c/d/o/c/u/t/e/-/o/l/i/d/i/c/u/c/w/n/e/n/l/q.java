/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Combat$AttackStyle
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.input.Mouse
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.items.Shop
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.Static
 */
package -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l;

import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.a;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.b;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.d;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.e;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.f;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.g;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.h;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.j;
import gg.squire.account.AccBuilderGWD;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.items.Shop;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;

public class q {
    static /* synthetic */ int cZ;
    static /* synthetic */ WorldPoint cT;
    private static /* synthetic */ String[] llIllIIll;
    static /* synthetic */ WorldPoint cW;
    private static /* synthetic */ int[] llIllIlll;
    public static /* synthetic */ boolean bv;
    static /* synthetic */ WorldArea cV;
    static /* synthetic */ int da;
    static /* synthetic */ WorldPoint cX;
    public static /* synthetic */ boolean cL;
    static /* synthetic */ int cK;
    static /* synthetic */ int cY;
    private static /* synthetic */ int[] db;
    public static /* synthetic */ List<d> bx;
    static /* synthetic */ WorldPoint cU;

    private static boolean lIlllIIlIlII(int n2, int n3) {
        return n2 <= n3;
    }

    private static String lIlllIIIIllI(String lIIIIlllllIlIl, String lIIIIlllllIIlI) {
        try {
            SecretKeySpec lIIIIllllllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIIIlllllIIlI.getBytes(StandardCharsets.UTF_8)), llIllIlll[11]), "DES");
            Cipher lIIIIlllllIlll = Cipher.getInstance("DES");
            lIIIIlllllIlll.init(llIllIlll[4], lIIIIllllllIII);
            return new String(lIIIIlllllIlll.doFinal(Base64.getDecoder().decode(lIIIIlllllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIIlllllIllI) {
            lIIIIlllllIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllIIIllll(int n2) {
        return n2 == 0;
    }

    private static boolean lIlllIIlIIlI(Object object) {
        return object != null;
    }

    private static boolean lIlllIIlIlll(int n2, int n3) {
        return n2 == n3;
    }

    private static void lIlllIIIllIl() {
        llIllIlll = new int[217];
        q.llIllIlll[0] = 1;
        q.llIllIlll[1] = -(0xFFFFFB87 & 0x7F79) & (0xFFFFFF6E & 0x7FB5);
        q.llIllIlll[2] = -(0xFFFFFEEA & 0x5337) & (0xFFFFFFFF & 0x57FD);
        q.llIllIlll[3] = (188 + 92 - 249 + 173 ^ 46 + 102 - 115 + 109) & (0x5B ^ 0x7F ^ (0x33 ^ 0x55) ^ -1);
        q.llIllIlll[4] = 2;
        q.llIllIlll[5] = 3;
        q.llIllIlll[6] = -(0xFFFFF79F & 0x1EEC) & (0xFFFFFFFF & 0x37BF);
        q.llIllIlll[7] = 0xC3 ^ 0xC7;
        q.llIllIlll[8] = 62 + 127 - 9 + 7 ^ 187 + 86 - 188 + 105;
        q.llIllIlll[9] = 1 ^ (0x20 ^ 0x27);
        q.llIllIlll[10] = 56 + 24 - 44 + 99 ^ 55 + 67 - 54 + 60;
        q.llIllIlll[11] = 0x28 ^ 0x56 ^ (0x29 ^ 0x5F);
        q.llIllIlll[12] = 0xE8 ^ 0x98 ^ (8 ^ 0x71);
        q.llIllIlll[13] = 13 + 60 - -41 + 26 ^ 28 + 114 - 48 + 40;
        q.llIllIlll[14] = 0x8E ^ 0x85;
        q.llIllIlll[15] = 126 + 40 - 161 + 175 ^ 118 + 75 - 92 + 69;
        q.llIllIlll[16] = 0xFFFF9BEB & 0x67F7;
        q.llIllIlll[17] = 0xBC ^ 0xA0 ^ (0xAE ^ 0xBE);
        q.llIllIlll[18] = 0xF2 ^ 0x83 ^ (0x60 ^ 0x1C);
        q.llIllIlll[19] = 0x16 ^ 0x22 ^ (0xA4 ^ 0x9E);
        q.llIllIlll[20] = 0xA8 ^ 0x8C ^ (0x9D ^ 0xB6);
        q.llIllIlll[21] = 0xA2 ^ 0xB2;
        q.llIllIlll[22] = 0xD2 ^ 0xAF ^ (0x10 ^ 0x7C);
        q.llIllIlll[23] = 126 + 66 - 153 + 102 ^ 146 + 115 - 107 + 5;
        q.llIllIlll[24] = 0x1A ^ 9;
        q.llIllIlll[25] = 0xFFFFD6B3 & 0x1EADCC;
        q.llIllIlll[26] = -(0xE5 ^ 0xBA) & (0xFFFFB7FE & 0x266DFF);
        q.llIllIlll[27] = 0xA5 ^ 0xB1;
        q.llIllIlll[28] = (0x75 ^ 0x17) + (0xDF ^ 0x9D) - (0x48 ^ 0x6E) + (0xFD ^ 0xAD);
        q.llIllIlll[29] = 90 + 50 - 114 + 136 ^ 84 + 84 - -6 + 9;
        q.llIllIlll[30] = 0xF8 ^ 0x80 ^ (7 ^ 0x69);
        q.llIllIlll[31] = 0x2B ^ 0xC ^ (0xAE ^ 0x9E);
        q.llIllIlll[32] = 7 + 130 - 94 + 88 ^ 124 + 73 - 119 + 77;
        q.llIllIlll[33] = 0x96 ^ 0x8F;
        q.llIllIlll[34] = 0x35 ^ 0x2F;
        q.llIllIlll[35] = 0x95 ^ 0x8E;
        q.llIllIlll[36] = 87 + 17 - 37 + 75 ^ 57 + 48 - 30 + 71;
        q.llIllIlll[37] = 0x29 ^ 0x34;
        q.llIllIlll[38] = 0xFFFFF1EE & 0xF3D;
        q.llIllIlll[39] = 0xFFFFC5FE & 0x3BF5;
        q.llIllIlll[40] = 163 + 67 - 108 + 46 ^ 43 + 14 - -44 + 82;
        q.llIllIlll[41] = 37 + 41 - -57 + 20 ^ 95 + 182 - 96 + 6;
        q.llIllIlll[42] = 0xE5 ^ 0xC4;
        q.llIllIlll[43] = 0x8A ^ 0xA8;
        q.llIllIlll[44] = 92 + 61 - 24 + 14 ^ 67 + 82 - 81 + 104;
        q.llIllIlll[45] = 19 + 116 - 5 + 1 ^ 83 + 155 - 201 + 130;
        q.llIllIlll[46] = 131 + 77 - 163 + 98 ^ 29 + 33 - -2 + 106;
        q.llIllIlll[47] = 0x1C ^ 0x51 ^ (0x17 ^ 0x7C);
        q.llIllIlll[48] = -(0xFFFFF2FA & 0x7D97) & (0xFFFFFFFB & Short.MAX_VALUE);
        q.llIllIlll[49] = 0x9C ^ 0xBB;
        q.llIllIlll[50] = 0xD8 ^ 0x8F ^ 8 + 65 - -44 + 10;
        q.llIllIlll[51] = 189 + 229 - 227 + 48 ^ 74 + 186 - 176 + 114;
        q.llIllIlll[52] = 0x4B ^ 0x61;
        q.llIllIlll[53] = 0x81 ^ 0x86 ^ (0x9A ^ 0xB6);
        q.llIllIlll[54] = 0x98 ^ 0xB4;
        q.llIllIlll[55] = 0x4F ^ 0x62;
        q.llIllIlll[56] = 0x48 ^ 0x66;
        q.llIllIlll[57] = 129 + 69 - 90 + 79 ^ 147 + 5 - 57 + 53;
        q.llIllIlll[58] = -(0xFFFFE995 & 0x567E) & (0xFFFFEFFF & 0x5F7F);
        q.llIllIlll[59] = (0x29 ^ 0x4F) + (0xF ^ 0x6A) - (0x27 ^ 0x45) + (0x5F ^ 0x47);
        q.llIllIlll[60] = 162 + 117 - 164 + 64 ^ 25 + 75 - 83 + 114;
        q.llIllIlll[61] = 0x3D ^ 0x52 ^ (0xEB ^ 0xB5);
        q.llIllIlll[62] = 0xE ^ 0x33 ^ (0xA4 ^ 0xAB);
        q.llIllIlll[63] = -(0xFFFFDFC5 & 0x607B) & (0xFFFFEFEF & 0x8FDFDF);
        q.llIllIlll[64] = 0xFFFF991F & 0xFFFEFF;
        q.llIllIlll[65] = 0xE ^ 0x26 ^ (0x5D ^ 0x46);
        q.llIllIlll[66] = 0xD5 ^ 0xC3 ^ (0x21 ^ 3);
        q.llIllIlll[67] = 0xDC ^ 0x93 ^ (0xD6 ^ 0xAC);
        q.llIllIlll[68] = 0x73 ^ 0x45;
        q.llIllIlll[69] = 0x50 ^ 0x11 ^ (0xE2 ^ 0x94);
        q.llIllIlll[70] = 125 + 39 - 123 + 88 ^ 92 + 152 - 174 + 115;
        q.llIllIlll[71] = 0x67 ^ 0x5E;
        q.llIllIlll[72] = 0x91 ^ 0xAB;
        q.llIllIlll[73] = 0xFA ^ 0x8F ^ (0x58 ^ 0x16);
        q.llIllIlll[74] = 0x23 ^ 0x1F;
        q.llIllIlll[75] = 38 + 41 - -27 + 42 ^ 140 + 141 - 268 + 156;
        q.llIllIlll[76] = 0x6B ^ 0x64 ^ (0xBF ^ 0x8E);
        q.llIllIlll[77] = 0xBA ^ 0x85;
        q.llIllIlll[78] = 0 ^ 0x40;
        q.llIllIlll[79] = 0x54 ^ 0x3F ^ (0x37 ^ 0x1D);
        q.llIllIlll[80] = 0x69 ^ 0x5A ^ (0xD0 ^ 0xA1);
        q.llIllIlll[81] = 0x4D ^ 0x7D ^ (0xB ^ 0x78);
        q.llIllIlll[82] = 0xA2 ^ 0xB9 ^ (0xC2 ^ 0x9D);
        q.llIllIlll[83] = 0x1C ^ 0xF ^ (0x7C ^ 0x2A);
        q.llIllIlll[84] = 0xD1 ^ 0x97;
        q.llIllIlll[85] = 0x5B ^ 0x26 ^ (0xB4 ^ 0x8E);
        q.llIllIlll[86] = 0xEA ^ 0xA2;
        q.llIllIlll[87] = 0x8E ^ 0xC7;
        q.llIllIlll[88] = 0xFD ^ 0xB7;
        q.llIllIlll[89] = 0xE8 ^ 0x93 ^ (0x61 ^ 0x51);
        q.llIllIlll[90] = 9 ^ 0x45;
        q.llIllIlll[91] = 0x69 ^ 0x24;
        q.llIllIlll[92] = -(0xFFFFECEE & 0x5795) & (0xFFFFD7FF & 0x6FFF);
        q.llIllIlll[93] = 0xC4 ^ 0x8A;
        q.llIllIlll[94] = 163 + 108 - 190 + 169 ^ 99 + 158 - 127 + 51;
        q.llIllIlll[95] = 0x6F ^ 0x3F;
        q.llIllIlll[96] = 0xFFFFA9FF & 0x5FBD;
        q.llIllIlll[97] = 0xFFFFFFEB & 0x9D7;
        q.llIllIlll[98] = 0xFFFFD8FF & 0x3FB6;
        q.llIllIlll[99] = -(0xFFFFEBBF & 0x1FD7) & (0xFFFFFFFF & 0x3FDF);
        q.llIllIlll[100] = -(0xFFFFFBD7 & 0x666F) & (0xFFFFFBFE & 0x7EFF);
        q.llIllIlll[101] = -(0xFFFFFFB9 & 0x2CE7) & (0xFFFFAFFD & Short.MAX_VALUE);
        q.llIllIlll[102] = -(0xFFFFFAFB & 0x4D0D) & (0xFFFFF9FD & 0x7FFE);
        q.llIllIlll[103] = 0xFFFFCFFB & 0x36AC;
        q.llIllIlll[104] = 0xFFFFF9EF & 0x2F13;
        q.llIllIlll[105] = -(0xFFFF98A6 & 0x77DB) & (0xFFFFBFFF & 0x7BF7);
        q.llIllIlll[106] = -(0xFFFFEE69 & 0x17D7) & (0xFFFFFFFF & 0xFFF);
        q.llIllIlll[107] = -(0xFFFFE633 & 0x5FDF) & (0xFFFFEFDF & 0x5FF7);
        q.llIllIlll[108] = 0xFFFFCBE7 & 0x3DDF;
        q.llIllIlll[109] = -(0xFFFFFF61 & 0x369F) & (0xFFFFFFC7 & 0x3FF9);
        q.llIllIlll[110] = 9 ^ 0x58;
        q.llIllIlll[111] = -(0xFFFFE7B5 & 0x5E4F) & (0xFFFFDF7F & Short.MAX_VALUE);
        q.llIllIlll[112] = 0xFFFFF335 & 0x5FFF;
        q.llIllIlll[113] = -(104 + 96 - 134 + 63) & (0xFFFFFBFB & 0x57BC);
        q.llIllIlll[114] = -(0xFFFFBFDF & 0x44E9) & (0xFFFFDFFE & 0x77FB);
        q.llIllIlll[115] = 0xFFFFDDFE & 0x3B7D;
        q.llIllIlll[116] = -(0xFFFFFDB7 & 0x665E) & (0xFFFFFFFF & 0x7DBD);
        q.llIllIlll[117] = -(0xFFFF9D15 & 0x76EF) & (0xFFFFFFFE & 0x3F7D);
        q.llIllIlll[118] = 0x7B ^ 0x29;
        q.llIllIlll[119] = 0xD7 ^ 0xB9 ^ (0x6D ^ 0x50);
        q.llIllIlll[120] = 0xFFFF93ED & 0x7F9A;
        q.llIllIlll[121] = 0x71 ^ 0x32 ^ (0x1B ^ 0xC);
        q.llIllIlll[122] = -(0xFFFF88AF & 0x7F56) & (0xFFFFFFFF & 0x39F7);
        q.llIllIlll[123] = 0xF0 ^ 0xA4 ^ 1;
        q.llIllIlll[124] = 0x46 ^ 0x10;
        q.llIllIlll[125] = 2 ^ 0x55;
        q.llIllIlll[126] = 0xFFFFCBEF & 0x37F8;
        q.llIllIlll[127] = 0x87 ^ 0x93 ^ (0x4D ^ 1);
        q.llIllIlll[128] = 0x36 ^ 0x6F;
        q.llIllIlll[129] = 0xCA ^ 0xB3 ^ (0x6C ^ 0x4F);
        q.llIllIlll[130] = 9 ^ 0x61 ^ (0x6E ^ 0x5D);
        q.llIllIlll[131] = 60 + 99 - 79 + 118 ^ 63 + 15 - 2 + 78;
        q.llIllIlll[132] = 0x53 ^ 0xE;
        q.llIllIlll[133] = 0xE ^ 5 ^ (0xC2 ^ 0x97);
        q.llIllIlll[134] = 123 + 73 - 164 + 95 ^ (0xF ^ 0x2F);
        q.llIllIlll[135] = 8 + 93 - 82 + 190 ^ 41 + 172 - 181 + 145;
        q.llIllIlll[136] = 0xE2 ^ 0x83;
        q.llIllIlll[137] = 0xA2 ^ 0xC0;
        q.llIllIlll[138] = 246 + 59 - 251 + 196 ^ 125 + 81 - 64 + 11;
        q.llIllIlll[139] = 0xE4 ^ 0x80;
        q.llIllIlll[140] = 191 + 118 - 102 + 17 ^ 76 + 39 - 88 + 106;
        q.llIllIlll[141] = -(0xFFFFB65B & 0x5FA5) & (0xFFFFDFF6 & 0x27FF9);
        q.llIllIlll[142] = 0x6B ^ 0xD;
        q.llIllIlll[143] = 0x74 ^ 0x13;
        q.llIllIlll[144] = -(0xFFFFD7FF & 0x2F2F) & (0xFFFFDFFE & 0x3F7BF);
        q.llIllIlll[145] = 0x7A ^ 0x12;
        q.llIllIlll[146] = -(0x7D ^ 0x24) & (0xFFFFBFDF & 0x49FA);
        q.llIllIlll[147] = -(0xFFFFD6A5 & 0x6B5F) & (0xFFFFEFF7 & 0x7FDE);
        q.llIllIlll[148] = 0xFFFFADF3 & 0x7FDF;
        q.llIllIlll[149] = -(0xFFFFF363 & 0x4EBE) & (0xFFFFEFF5 & Short.MAX_VALUE);
        q.llIllIlll[150] = -(0xFFFFC7EB & 0x3A3D) & (0xFFFFAFFF & 0x7FFD);
        q.llIllIlll[151] = 0xFFFFBFCA & 0x5F7F;
        q.llIllIlll[152] = -(0xFFFFFDFF & 0x4E27) & (0xFFFFFD77 & Short.MAX_VALUE);
        q.llIllIlll[153] = -(0x51 ^ 0x68) & (0xFFFF9F7F & Short.MAX_VALUE);
        q.llIllIlll[154] = 187 + 205 - 175 + 32 ^ 130 + 116 - 172 + 70;
        q.llIllIlll[155] = 0x70 ^ 0x1A;
        q.llIllIlll[156] = 0xFFFFCF76 & 0x3FFD;
        q.llIllIlll[157] = -(0xFFFFFF67 & 0x25D9) & (0xFFFFB7FF & 0x6FFC);
        q.llIllIlll[158] = 0x65 ^ 0xE;
        q.llIllIlll[159] = 0x23 ^ 0x4F;
        q.llIllIlll[160] = 0x32 ^ 0x5F;
        q.llIllIlll[161] = 0x23 ^ 0x49 ^ (0x76 ^ 0x72);
        q.llIllIlll[162] = 0xDC ^ 0xA4;
        q.llIllIlll[163] = 0xFFFFFEF4 & 0x236B;
        q.llIllIlll[164] = 0xFFFF8FFE & 0x79F9;
        q.llIllIlll[165] = -(0x7D ^ 0x6F) & (0xFFFFDF7D & 0x27FF);
        q.llIllIlll[166] = 0xFFFFBFAE & 0x43D5;
        q.llIllIlll[167] = 0x77 ^ 0x18;
        q.llIllIlll[168] = -(0xFFFFC347 & 0x3FFE) & (0xFFFFDBFD & 0xAFFF);
        q.llIllIlll[169] = 0xFFFFEDFD & 0x8FF2A;
        q.llIllIlll[170] = -(0xFFFFED5F & 0x72B3) & (0xFFFFEFFB & 0x9F97E);
        q.llIllIlll[171] = 0xFFFFFEE1 & 0x2F5E;
        q.llIllIlll[172] = 0xFFFFFFB9 & 0x2ABDE;
        q.llIllIlll[173] = -(0xFFFFE8DB & 0x1F75) & (0xFFFFFBFF & 0x2DEF8);
        q.llIllIlll[174] = -(0xFFFFDF37 & 0x77EE) & (0xFFFFFFBD & 0xDFF7F);
        q.llIllIlll[175] = -(0xFFFFCBB7 & 0x74CF) & (0xFFFFDDDE & 0xE7FEF);
        q.llIllIlll[176] = -(0xFFFFC26C & 0x7FDB) & (0xFFFFF677 & 0x166BDF);
        q.llIllIlll[177] = -(0xFFFF99F8 & 0x67AF) & (0xFFFFFDF7 & 0x16BFFF);
        q.llIllIlll[178] = 0xFFFFCEB1 & 0x11BD7E;
        q.llIllIlll[179] = 0xFFFFFBDE & 0x1316F1;
        q.llIllIlll[180] = 0xFFFFE7DE & 0xA9F71;
        q.llIllIlll[181] = 0xFFFFDBE3 & 0xB6EBC;
        q.llIllIlll[182] = -(0xFFFFFD84 & 0x7EFF) & (0xFFFFFFFB & 0x2D7FF7);
        q.llIllIlll[183] = -(0xFFFFB2E7 & 0x4F5F) & (0xFFFFFFFF & 0x2E9FDE);
        q.llIllIlll[184] = 0x1F ^ 0xE ^ (0x45 ^ 0x24);
        q.llIllIlll[185] = 0xFFFFFEFF & 0xD7D8;
        q.llIllIlll[186] = 0xFFFFFDEE & 0xFFF9;
        q.llIllIlll[187] = 0xFFFFDF79 & 0x37F6;
        q.llIllIlll[188] = -(0xFFFFC32F & 0x7CD6) & (0xFFFFEEFD & 0x7BFF);
        q.llIllIlll[189] = 48 + 36 - -9 + 37;
        q.llIllIlll[190] = 138 + 16 - 12 + 2 + (55 + 89 - 61 + 64) - (56 + 110 - 41 + 57) + (3 ^ 0x2A);
        q.llIllIlll[191] = 0xFFFFBFFC & 0x65BAF;
        q.llIllIlll[192] = -(0xFFFFDFF9 & 0x6137) & (0xFFFFF7F3 & 0x6FFFC);
        q.llIllIlll[193] = -(0xFFFFF379 & 0x2E97) & (0xFFFFFF5F & 0x3FFC);
        q.llIllIlll[194] = 0xFFFFB3F4 & 0x5D9F;
        q.llIllIlll[195] = 0x19 ^ 0x68;
        q.llIllIlll[196] = 0x5E ^ 0x2C;
        q.llIllIlll[197] = 0x32 ^ 0x41;
        q.llIllIlll[198] = 0xD4 ^ 0xA0;
        q.llIllIlll[199] = 0x6C ^ 0x19;
        q.llIllIlll[200] = 56 + 111 - 143 + 185 ^ 115 + 152 - 153 + 53;
        q.llIllIlll[201] = 0x31 ^ 0x46;
        q.llIllIlll[202] = 0x56 ^ 0x2F;
        q.llIllIlll[203] = 0xBF ^ 0xC5;
        q.llIllIlll[204] = 0x39 ^ 0x42;
        q.llIllIlll[205] = 0xFC ^ 0x80;
        q.llIllIlll[206] = 0xA ^ 0x29 ^ (0x67 ^ 0x39);
        q.llIllIlll[207] = 0xFFFFF1BD & 0x1FEF;
        q.llIllIlll[208] = 175 + 10 - 163 + 162 ^ 107 + 7 - 72 + 156;
        q.llIllIlll[209] = 0xFFFFFF62 & 0xABF;
        q.llIllIlll[210] = -(0xFFFFDFEA & 0x7357) & (0xFFFFFFFF & 0x5F4F);
        q.llIllIlll[211] = -(0xFFFFEFAF & 0x74D3) & (0xFFFFFFF7 & 0x6EBF);
        q.llIllIlll[212] = -(0xFFFFFBAD & 0x54FB) & (0xFFFFFFBE & 0x5CFF);
        q.llIllIlll[213] = -(0xFFFF8797 & 0x79EB) & (0xFFFFFFAF & 0xBFE);
        q.llIllIlll[214] = -(0xFFFFF6F1 & 0x4B4F) & (0xFFFFFF6F & 0x4EFB);
        q.llIllIlll[215] = -(0xCC ^ 0xC1) & (0xFFFFFF7D & 0xFFF);
        q.llIllIlll[216] = (0x24 ^ 0x10) + (0xCB ^ 0xA9) - (74 + 5 - 21 + 80) + (0xB3 ^ 0xC0);
    }

    private static boolean lIlllIIlIllI(int n2) {
        return n2 > 0;
    }

    public static void e(String string) {
        e.t();
        if (q.lIlllIIIlllI(bv ? 1 : 0)) {
            AccBuilderGWD.c = llIllIIll[llIllIlll[3]];
            b.a(bx);
            if (q.lIlllIIlIIII(bx.size(), llIllIlll[0])) {
                System.out.println(llIllIIll[llIllIlll[0]]);
                bv = llIllIlll[3];
            }
        }
        if (q.lIlllIIIllll(bv ? 1 : 0)) {
            String lIIIlIIIlIllII;
            if (q.lIlllIIIllll(q.f(lIIIlIIIlIllII) ? 1 : 0) && q.lIlllIIIlllI(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
                String[] stringArray = new String[llIllIlll[0]];
                stringArray[q.llIllIlll[3]] = llIllIIll[llIllIlll[4]];
                if (q.lIlllIIlIIlI(TileObjects.getNearest((String[])stringArray))) {
                    if (q.lIlllIIIlllI(Equipment.contains((int[])f.aU) ? 1 : 0)) {
                        Equipment.getFirst((int[])f.aU).interact(llIllIIll[llIllIlll[5]]);
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[llIllIlll[0]];
                            nArray[q.llIllIlll[3]] = llIllIlll[207];
                            if (q.lIlllIIlIlIl(TileObjects.getNearest((int[])nArray))) {
                                bl = llIllIlll[0];
                                0;
                                if ((0x3A ^ 0x40 ^ (0x49 ^ 0x37)) <= 0) {
                                    return ((0x15 ^ 0xE ^ (0x5F ^ 0x4C)) & (0x15 ^ 0x6E ^ (0x3B ^ 0x48) ^ -1)) != 0;
                                }
                            } else {
                                bl = llIllIlll[3];
                            }
                            return bl;
                        }, (int)llIllIlll[6]);
                        0;
                    }
                    if (q.lIlllIIIllll(Equipment.contains((int[])f.aU) ? 1 : 0) && q.lIlllIIIlllI(Inventory.contains((int[])f.aU) ? 1 : 0)) {
                        Inventory.getFirst((int[])f.aU).interact(llIllIIll[llIllIlll[7]]);
                    }
                }
                AccBuilderGWD.c = llIllIIll[llIllIlll[8]];
                String[] stringArray2 = new String[llIllIlll[0]];
                stringArray2[q.llIllIlll[3]] = llIllIIll[llIllIlll[9]];
                TileObjects.getNearest((String[])stringArray2).interact(llIllIIll[llIllIlll[10]]);
                Time.sleepTicks((int)llIllIlll[7]);
                0;
            }
            if ((!q.lIlllIIIlllI(q.f(lIIIlIIIlIllII) ? 1 : 0) || q.lIlllIIIllll(Inventory.contains(item -> {
                int n2;
                if (q.lIlllIIIlllI(item.getName().contains(llIllIIll[llIllIlll[206]]) ? 1 : 0) && q.lIlllIIIllll(item.isNoted() ? 1 : 0)) {
                    n2 = llIllIlll[0];
                    0;
                    if ((0x41 ^ 0x54 ^ (0xD4 ^ 0xC4)) == 0) {
                        return ((0x68 ^ 0x44 ^ (0xC3 ^ 0xB1)) & (0x23 ^ 0x60 ^ (0x6A ^ 0x77) ^ -1)) != 0;
                    }
                } else {
                    n2 = llIllIlll[3];
                }
                return n2 != 0;
            }) ? 1 : 0)) && q.lIlllIIIllll(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
                if (q.lIlllIIIlllI(lIIIlIIIlIllII.equalsIgnoreCase(llIllIIll[llIllIlll[11]]) ? 1 : 0)) {
                    q.g(llIllIIll[llIllIlll[12]]);
                }
                if (q.lIlllIIIlllI(lIIIlIIIlIllII.equalsIgnoreCase(llIllIIll[llIllIlll[13]]) ? 1 : 0)) {
                    q.g(llIllIIll[llIllIlll[14]]);
                }
            }
            if (q.lIlllIIIlllI(q.f(lIIIlIIIlIllII) ? 1 : 0) && q.lIlllIIlIIII(Vars.getBit((int)cZ), llIllIlll[15]) && q.lIlllIIIlllI(cV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                int[] nArray = new int[llIllIlll[0]];
                nArray[q.llIllIlll[3]] = llIllIlll[16];
                if (q.lIlllIIIllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    q.g(lIIIlIIIlIllII);
                }
                int[] nArray2 = new int[llIllIlll[0]];
                nArray2[q.llIllIlll[3]] = llIllIlll[16];
                if (q.lIlllIIIlllI(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                    AccBuilderGWD.c = llIllIIll[llIllIlll[17]];
                    if (q.lIlllIIIllll(Dialog.isOpen() ? 1 : 0)) {
                        String[] stringArray = new String[llIllIlll[0]];
                        stringArray[q.llIllIlll[3]] = llIllIIll[llIllIlll[18]];
                        String[] stringArray3 = new String[llIllIlll[0]];
                        stringArray3[q.llIllIlll[3]] = llIllIIll[llIllIlll[19]];
                        if (q.lIlllIIIlllI(TileObjects.getNearest((String[])stringArray).hasAction(stringArray3) ? 1 : 0)) {
                            String[] stringArray4 = new String[llIllIlll[0]];
                            stringArray4[q.llIllIlll[3]] = llIllIIll[llIllIlll[20]];
                            TileObjects.getNearest((String[])stringArray4).interact(llIllIIll[llIllIlll[21]]);
                            Time.sleepTicks((int)llIllIlll[4]);
                            0;
                            0;
                            if (1 > (0x80 ^ 0x84)) {
                                return;
                            }
                        } else {
                            String[] stringArray5 = new String[llIllIlll[0]];
                            stringArray5[q.llIllIlll[3]] = llIllIIll[llIllIlll[22]];
                            TileObjects.getNearest((String[])stringArray5).interact(llIllIIll[llIllIlll[23]]);
                        }
                    }
                    if (q.lIlllIIIllll(Dialog.isEnterInputOpen() ? 1 : 0)) {
                        String[] stringArray = new String[llIllIlll[0]];
                        stringArray[q.llIllIlll[3]] = llIllIIll[llIllIlll[24]];
                        g.a(stringArray);
                    }
                    if (q.lIlllIIIlllI(Dialog.isEnterInputOpen() ? 1 : 0)) {
                        Dialog.enterAmount((int)e.c(llIllIlll[25], llIllIlll[26]));
                        Time.sleepTicks((int)llIllIlll[9]);
                        0;
                        Dialog.close();
                    }
                }
            }
            if (q.lIlllIIIlllI(q.f(lIIIlIIIlIllII) ? 1 : 0) && q.lIlllIIIllll(cV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && q.lIlllIIIllll(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
                q.g(lIIIlIIIlIllII);
            }
            if (q.lIlllIIIlllI(q.f(lIIIlIIIlIllII) ? 1 : 0) && q.lIlllIIIlllI(Inventory.contains(item -> {
                int n2;
                if (q.lIlllIIIlllI(item.getName().contains(llIllIIll[llIllIlll[205]]) ? 1 : 0) && q.lIlllIIIllll(item.isNoted() ? 1 : 0)) {
                    n2 = llIllIlll[0];
                    0;
                    if (2 != 2) {
                        return ((0x75 ^ 0x48) & ~(0xB7 ^ 0x8A)) != 0;
                    }
                } else {
                    n2 = llIllIlll[3];
                }
                return n2 != 0;
            }) ? 1 : 0) && q.lIlllIIlIIIl(Vars.getBit((int)cZ), llIllIlll[15])) {
                Object lIIIlIIIlIlIll;
                if (q.lIlllIIlIIll(Players.getLocal().getWorldLocation().distanceTo(cX), llIllIlll[13]) && q.lIlllIIIllll(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
                    AccBuilderGWD.c = llIllIIll[llIllIlll[27]];
                    Movement.walkTo((WorldPoint)cX);
                    0;
                    Time.sleepTicks((int)llIllIlll[0]);
                    0;
                }
                if (q.lIlllIIlIlII(Players.getLocal().getWorldLocation().distanceTo(cX), llIllIlll[13])) {
                    if (q.lIlllIIlIIIl(Vars.getBit((int)cZ), llIllIlll[15]) && q.lIlllIIlIIII(Vars.getBit((int)cY), llIllIlll[27]) && q.lIlllIIlIIIl(e.j(llIllIlll[1]), llIllIlll[2])) {
                        while (q.lIlllIIlIIII(Vars.getBit((int)cY), llIllIlll[27]) && q.lIlllIIlIIIl(e.j(llIllIlll[1]), llIllIlll[2]) && q.lIlllIIIllll(AccBuilderGWD.d ? 1 : 0)) {
                            if (q.lIlllIIIlllI(Widgets.get((int)llIllIlll[28]).isEmpty() ? 1 : 0)) {
                                AccBuilderGWD.c = llIllIIll[llIllIlll[29]];
                                String[] stringArray = new String[llIllIlll[0]];
                                stringArray[q.llIllIlll[3]] = llIllIIll[llIllIlll[30]];
                                TileObjects.getNearest((String[])stringArray).interact(llIllIIll[llIllIlll[31]]);
                                Time.sleepTicks((int)llIllIlll[5]);
                                0;
                            }
                            if (q.lIlllIIIllll(Widgets.get((int)llIllIlll[28]).isEmpty() ? 1 : 0)) {
                                lIIIlIIIlIlIll = Widgets.get((int)llIllIlll[28], (int)llIllIlll[4]).getChild(llIllIlll[7]);
                                Widget lIIIlIIIlIlIlI = Widgets.get((int)llIllIlll[28], (int)llIllIlll[9]).getChild(llIllIlll[9]);
                                if (q.lIlllIIlIIlI(lIIIlIIIlIlIlI)) {
                                    AccBuilderGWD.c = llIllIIll[llIllIlll[32]];
                                    lIIIlIIIlIlIlI.interact(llIllIIll[llIllIlll[33]]);
                                }
                                if (q.lIlllIIlIlIl(lIIIlIIIlIlIlI)) {
                                    AccBuilderGWD.c = llIllIIll[llIllIlll[34]];
                                    Shop.buyFifty((String)llIllIIll[llIllIlll[35]]);
                                }
                            }
                            Time.sleepTicks((int)llIllIlll[4]);
                            0;
                            0;
                            if (-1 == -1) continue;
                            return;
                        }
                    }
                    if (q.lIlllIIlIIIl(Vars.getBit((int)cZ), llIllIlll[15]) && q.lIlllIIlIllI(Vars.getBit((int)cY)) && q.lIlllIIIllll(Inventory.isFull() ? 1 : 0)) {
                        AccBuilderGWD.c = llIllIIll[llIllIlll[36]];
                        if (q.lIlllIIIllll(Dialog.isEnterInputOpen() ? 1 : 0)) {
                            String[] stringArray = new String[llIllIlll[0]];
                            stringArray[q.llIllIlll[3]] = llIllIIll[llIllIlll[37]];
                            TileObjects.getNearest((String[])stringArray).interact(llIllIIll[llIllIlll[15]]);
                            Time.sleepTicks((int)llIllIlll[5]);
                            0;
                        }
                        if (q.lIlllIIIlllI(Dialog.isEnterInputOpen() ? 1 : 0)) {
                            Dialog.enterAmount((int)e.c(llIllIlll[38], llIllIlll[39]));
                        }
                    }
                    if (q.lIlllIIlIIII(Vars.getBit((int)cZ), llIllIlll[15])) {
                        int[] nArray = new int[llIllIlll[0]];
                        nArray[q.llIllIlll[3]] = llIllIlll[16];
                        if (q.lIlllIIIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            AccBuilderGWD.c = llIllIIll[llIllIlll[40]];
                            if (q.lIlllIIIllll(Dialog.isOpen() ? 1 : 0)) {
                                String[] stringArray = new String[llIllIlll[0]];
                                stringArray[q.llIllIlll[3]] = llIllIIll[llIllIlll[41]];
                                String[] stringArray6 = new String[llIllIlll[0]];
                                stringArray6[q.llIllIlll[3]] = llIllIIll[llIllIlll[42]];
                                if (q.lIlllIIIlllI(TileObjects.getNearest((String[])stringArray).hasAction(stringArray6) ? 1 : 0)) {
                                    String[] stringArray7 = new String[llIllIlll[0]];
                                    stringArray7[q.llIllIlll[3]] = llIllIIll[llIllIlll[43]];
                                    TileObjects.getNearest((String[])stringArray7).interact(llIllIIll[llIllIlll[44]]);
                                    Time.sleepTicks((int)llIllIlll[4]);
                                    0;
                                    0;
                                    if (-1 >= 0) {
                                        return;
                                    }
                                } else {
                                    String[] stringArray8 = new String[llIllIlll[0]];
                                    stringArray8[q.llIllIlll[3]] = llIllIIll[llIllIlll[45]];
                                    TileObjects.getNearest((String[])stringArray8).interact(llIllIIll[llIllIlll[46]]);
                                }
                            }
                            if (q.lIlllIIIllll(Dialog.isEnterInputOpen() ? 1 : 0)) {
                                String[] stringArray = new String[llIllIlll[0]];
                                stringArray[q.llIllIlll[3]] = llIllIIll[llIllIlll[47]];
                                g.a(stringArray);
                            }
                            if (q.lIlllIIIlllI(Dialog.isEnterInputOpen() ? 1 : 0)) {
                                Dialog.enterAmount((int)e.c(llIllIlll[25], llIllIlll[26]));
                                Time.sleepTicks((int)llIllIlll[5]);
                                0;
                                Dialog.close();
                            }
                        }
                    }
                    if (q.lIlllIIIlllI(q.aQ() ? 1 : 0) && q.lIlllIIlIIIl(Vars.getBit((int)cZ), llIllIlll[15]) && q.lIlllIIlIIII(Vars.getBit((int)llIllIlll[48]), llIllIlll[0])) {
                        AccBuilderGWD.c = llIllIIll[llIllIlll[49]];
                        String[] stringArray = new String[llIllIlll[0]];
                        stringArray[q.llIllIlll[3]] = llIllIIll[llIllIlll[50]];
                        if (q.lIlllIIlIIll(Players.getLocal().getWorldLocation().distanceTo((Locatable)NPCs.getNearest((String[])stringArray)), llIllIlll[0]) && q.lIlllIIIlllI(Dialog.isOpen() ? 1 : 0)) {
                            String[] stringArray9 = new String[llIllIlll[0]];
                            stringArray9[q.llIllIlll[3]] = llIllIIll[llIllIlll[51]];
                            NPCs.getNearest((String[])stringArray9).interact(llIllIIll[llIllIlll[52]]);
                        }
                        if (q.lIlllIIIllll(Dialog.isOpen() ? 1 : 0)) {
                            String[] stringArray10 = new String[llIllIlll[0]];
                            stringArray10[q.llIllIlll[3]] = llIllIIll[llIllIlll[53]];
                            NPCs.getNearest((String[])stringArray10).interact(llIllIIll[llIllIlll[54]]);
                            Time.sleepTicks((int)llIllIlll[4]);
                            0;
                        }
                        String[] stringArray11 = new String[llIllIlll[5]];
                        stringArray11[q.llIllIlll[3]] = llIllIIll[llIllIlll[55]];
                        stringArray11[q.llIllIlll[0]] = llIllIIll[llIllIlll[56]];
                        stringArray11[q.llIllIlll[4]] = llIllIIll[llIllIlll[57]];
                        g.a(stringArray11);
                    }
                    if (q.lIlllIIlIIIl(Vars.getBit((int)llIllIlll[58]), llIllIlll[15]) && q.lIlllIIlIllI(Vars.getBit((int)llIllIlll[48]))) {
                        if (q.lIlllIIIlllI(Widgets.get((int)llIllIlll[59]).isEmpty() ? 1 : 0)) {
                            String[] stringArray = new String[llIllIlll[0]];
                            stringArray[q.llIllIlll[3]] = llIllIIll[llIllIlll[60]];
                            TileObjects.getNearest((String[])stringArray).interact(llIllIIll[llIllIlll[61]]);
                            Time.sleepTicks((int)llIllIlll[5]);
                            0;
                        }
                        if (q.lIlllIIIllll(Widgets.get((int)llIllIlll[59]).isEmpty() ? 1 : 0)) {
                            AccBuilderGWD.c = llIllIIll[llIllIlll[62]];
                            lIIIlIIIlIlIll = Widgets.get((int)llIllIlll[59], (int)llIllIlll[9]);
                            int lIIIlIIIlIlIlI = llIllIlll[63];
                            int lIIIlIIIlIlIIl = llIllIlll[64];
                            int lIIIlIIIlIlIII = llIllIlll[3];
                            int lIIIlIIIlIIlll = llIllIlll[3];
                            Widget[] lIIIlIIIlIIllI = Widgets.get((int)llIllIlll[59], (int)llIllIlll[18]).getChildren();
                            int lIIIlIIIlIIlIl = llIllIlll[3];
                            while (q.lIlllIIlIIII(lIIIlIIIlIIlIl, lIIIlIIIlIIllI.length)) {
                                if (q.lIlllIIlIlll(lIIIlIIIlIIllI[lIIIlIIIlIIlIl].getTextColor(), lIIIlIIIlIlIIl)) {
                                    ++lIIIlIIIlIIlll;
                                    0;
                                    if (null != null) {
                                        return;
                                    }
                                } else {
                                    ++lIIIlIIIlIlIII;
                                }
                                ++lIIIlIIIlIIlIl;
                                0;
                                if (((178 + 62 - 37 + 46 ^ 90 + 138 - 53 + 16) & (0x6B ^ 0x66 ^ (0x3B ^ 0x70) ^ -1)) >= ((60 + 144 - 76 + 50 ^ 139 + 106 - 148 + 90) & (72 + 3 - 65 + 125 ^ 42 + 98 - 72 + 74 ^ -1))) continue;
                                return;
                            }
                            if (q.lIlllIIlIIll(lIIIlIIIlIIlll, llIllIlll[8]) && q.lIlllIIlIIlI(lIIIlIIIlIIlIl = Widgets.get((int)llIllIlll[59], (int)llIllIlll[11]))) {
                                Mouse.click((int)lIIIlIIIlIIlIl.getClickPoint().getX(), (int)lIIIlIIIlIIlIl.getClickPoint().getY(), (boolean)llIllIlll[0]);
                                Time.sleepTicks((int)llIllIlll[0]);
                                0;
                            }
                            if (q.lIlllIIlIIII(lIIIlIIIlIIlll, llIllIlll[8])) {
                                lIIIlIIIlIIlIl = llIllIlll[3];
                                int lIIIlIIIlIIlII = llIllIlll[3];
                                int lIIIlIIIlIIIll = llIllIlll[3];
                                int lIIIlIIIlIIIlI = llIllIlll[3];
                                int lIIIlIIIlIIIIl = llIllIlll[3];
                                int lIIIlIIIlIIIII = llIllIlll[3];
                                while (q.lIlllIIlIIII(lIIIlIIIlIIIII, lIIIlIIIlIIllI.length)) {
                                    if (q.lIlllIIIlllI(lIIIlIIIlIIllI[lIIIlIIIlIIIII].getName().contains(llIllIIll[llIllIlll[65]]) ? 1 : 0) && q.lIlllIIIllll(lIIIlIIIlIIlIl)) {
                                        AccBuilderGWD.c = llIllIIll[llIllIlll[66]];
                                        lIIIlIIIlIIllI[lIIIlIIIlIIIII].interact(llIllIIll[llIllIlll[67]]);
                                        Time.sleepTicks((int)llIllIlll[0]);
                                        0;
                                        lIIIlIIIlIIlIl = llIllIlll[0];
                                    }
                                    if (q.lIlllIIIlllI(lIIIlIIIlIIllI[lIIIlIIIlIIIII].getName().contains(llIllIIll[llIllIlll[68]]) ? 1 : 0) && q.lIlllIIIllll(lIIIlIIIlIIlII)) {
                                        AccBuilderGWD.c = llIllIIll[llIllIlll[69]];
                                        lIIIlIIIlIIllI[lIIIlIIIlIIIII].interact(llIllIIll[llIllIlll[70]]);
                                        Time.sleepTicks((int)llIllIlll[0]);
                                        0;
                                        lIIIlIIIlIIlII = llIllIlll[0];
                                    }
                                    if (q.lIlllIIIlllI(lIIIlIIIlIIllI[lIIIlIIIlIIIII].getName().contains(llIllIIll[llIllIlll[71]]) ? 1 : 0) && q.lIlllIIIllll(lIIIlIIIlIIIll)) {
                                        AccBuilderGWD.c = llIllIIll[llIllIlll[72]];
                                        lIIIlIIIlIIllI[lIIIlIIIlIIIII].interact(llIllIIll[llIllIlll[73]]);
                                        Time.sleepTicks((int)llIllIlll[0]);
                                        0;
                                        lIIIlIIIlIIIll = llIllIlll[0];
                                    }
                                    if (q.lIlllIIIlllI(lIIIlIIIlIIllI[lIIIlIIIlIIIII].getName().contains(llIllIIll[llIllIlll[74]]) ? 1 : 0) && q.lIlllIIIllll(lIIIlIIIlIIIlI)) {
                                        AccBuilderGWD.c = llIllIIll[llIllIlll[75]];
                                        lIIIlIIIlIIllI[lIIIlIIIlIIIII].interact(llIllIIll[llIllIlll[76]]);
                                        Time.sleepTicks((int)llIllIlll[0]);
                                        0;
                                        lIIIlIIIlIIIlI = llIllIlll[0];
                                    }
                                    if (q.lIlllIIIlllI(lIIIlIIIlIIllI[lIIIlIIIlIIIII].getName().contains(llIllIIll[llIllIlll[77]]) ? 1 : 0) && q.lIlllIIIllll(lIIIlIIIlIIIIl)) {
                                        AccBuilderGWD.c = llIllIIll[llIllIlll[78]];
                                        lIIIlIIIlIIllI[lIIIlIIIlIIIII].interact(llIllIIll[llIllIlll[79]]);
                                        Time.sleepTicks((int)llIllIlll[0]);
                                        0;
                                        lIIIlIIIlIIIIl = llIllIlll[0];
                                    }
                                    ++lIIIlIIIlIIIII;
                                    0;
                                    if ((0xA5 ^ 0x84 ^ (0x9C ^ 0xB9)) != 0) continue;
                                    return;
                                }
                            }
                            if (q.lIlllIIlIlll(lIIIlIIIlIIlll, llIllIlll[8])) {
                                AccBuilderGWD.c = llIllIIll[llIllIlll[80]];
                                if (q.lIlllIIlIIlI(lIIIlIIIlIlIll)) {
                                    Mouse.click((int)lIIIlIIIlIlIll.getClickPoint().getX(), (int)lIIIlIIIlIlIll.getClickPoint().getY(), (boolean)llIllIlll[0]);
                                    Time.sleepTicks((int)llIllIlll[8]);
                                    0;
                                }
                            }
                        }
                    }
                }
                String[] stringArray = new String[llIllIlll[0]];
                stringArray[q.llIllIlll[3]] = llIllIIll[llIllIlll[81]];
                if (q.lIlllIIlIIlI(NPCs.getNearest((String[])stringArray))) {
                    cT = null;
                }
                if (q.lIlllIIIlllI(Static.getClient().isInInstancedRegion() ? 1 : 0) && q.lIlllIIlIlIl(cT)) {
                    Time.sleepTicks((int)llIllIlll[7]);
                    0;
                    System.out.println(llIllIIll[llIllIlll[82]]);
                    cT = Players.getLocal().getWorldLocation();
                    cU = new WorldPoint(cT.getX() - e.c(llIllIlll[0], llIllIlll[5]), cT.getY() + e.c(llIllIlll[19], llIllIlll[21]), cT.getPlane());
                }
                if (q.lIlllIIIlllI(Static.getClient().isInInstancedRegion() ? 1 : 0) && q.lIlllIIlIIlI(cT)) {
                    if (q.lIlllIIlIIll(Players.getLocal().getWorldLocation().distanceTo(cU), llIllIlll[5])) {
                        String[] stringArray12 = new String[llIllIlll[0]];
                        stringArray12[q.llIllIlll[3]] = llIllIIll[llIllIlll[83]];
                        if (q.lIlllIIlIlIl(TileObjects.getNearest((String[])stringArray12))) {
                            AccBuilderGWD.c = llIllIIll[llIllIlll[84]];
                            e.c(cU);
                            Time.sleepTicks((int)llIllIlll[0]);
                            0;
                        }
                    }
                    if (q.lIlllIIlIlII(Players.getLocal().getWorldLocation().distanceTo(cU), llIllIlll[5])) {
                        String[] stringArray13 = new String[llIllIlll[0]];
                        stringArray13[q.llIllIlll[3]] = llIllIIll[llIllIlll[85]];
                        if (q.lIlllIIlIlIl(TileObjects.getNearest((String[])stringArray13))) {
                            Item lIIIlIIIlIlIlI;
                            AccBuilderGWD.c = llIllIIll[llIllIlll[86]];
                            lIIIlIIIlIlIll = NPCs.getAll(nPC -> nPC.getName().contains(llIllIIll[llIllIlll[204]]));
                            if (q.lIlllIIlIIIl(lIIIlIIIlIlIll.size(), llIllIlll[5]) && q.lIlllIIlIlIl(Players.getLocal().getInteracting())) {
                                ((NPC)lIIIlIIIlIlIll.get(llIllIlll[3])).interact(llIllIIll[llIllIlll[87]]);
                                Time.sleepTicks((int)llIllIlll[4]);
                                0;
                            }
                            if (q.lIlllIIlIIlI(lIIIlIIIlIlIlI = Inventory.getFirst(item -> item.getName().contains(llIllIIll[llIllIlll[203]]))) && q.lIlllIIlIlll(Skills.getLevel((Skill)Skill.STRENGTH), Skills.getBoostedLevel((Skill)Skill.STRENGTH)) && q.lIlllIIlIIIl(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), llIllIlll[65])) {
                                lIIIlIIIlIlIlI.interact(llIllIIll[llIllIlll[88]]);
                                Time.sleepTicks((int)llIllIlll[5]);
                                0;
                                Time.sleepTicks((int)llIllIlll[20]);
                                0;
                            }
                        }
                    }
                    if (q.lIlllIIIllll(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0) && q.lIlllIIlIllI(Prayers.getPoints())) {
                        Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                    }
                }
                if (!q.lIlllIIlIlIl(NPCs.getNearest(nPC -> nPC.getName().contains(llIllIIll[llIllIlll[202]]))) || q.lIlllIIlIIlI(NPCs.getNearest(nPC -> nPC.getName().contains(llIllIIll[llIllIlll[162]])))) {
                    e.F();
                    if (q.lIlllIIIlllI(Equipment.contains(item -> {
                        boolean bl;
                        if (q.lIlllIIlIlll(item.getId(), llIllIlll[102])) {
                            bl = llIllIlll[0];
                            0;
                            if (((0xF5 ^ 0xB9) & ~(0xFC ^ 0xB0)) != 0) {
                                return ((0x28 ^ 0x49) & ~(0x32 ^ 0x53)) != 0;
                            }
                        } else {
                            bl = llIllIlll[3];
                        }
                        return bl;
                    }) ? 1 : 0)) {
                        if (q.lIlllIIllIII(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
                            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.SECOND);
                        }
                        String[] stringArray14 = new String[llIllIlll[0]];
                        stringArray14[q.llIllIlll[3]] = llIllIIll[llIllIlll[89]];
                        if (q.lIlllIIlIIlI(TileObjects.getNearest((String[])stringArray14))) {
                            String[] stringArray15 = new String[llIllIlll[0]];
                            stringArray15[q.llIllIlll[3]] = llIllIIll[llIllIlll[90]];
                            TileObjects.getNearest((String[])stringArray15).interact(llIllIIll[llIllIlll[91]]);
                            Time.sleepTicks((int)llIllIlll[5]);
                            0;
                        }
                        if (q.lIlllIIlIIIl(Combat.getSpecEnergy(), llIllIlll[62]) && q.lIlllIIIllll(Combat.isSpecEnabled() ? 1 : 0)) {
                            int[] nArray = new int[llIllIlll[0]];
                            nArray[q.llIllIlll[3]] = llIllIlll[92];
                            if (q.lIlllIIIlllI(Equipment.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray3 = new int[llIllIlll[0]];
                                nArray3[q.llIllIlll[3]] = llIllIlll[92];
                                if (q.lIlllIIlIIIl(Equipment.getFirst((int[])nArray3).getQuantity(), llIllIlll[4])) {
                                    Combat.toggleSpec();
                                }
                            }
                        }
                    }
                    if (q.lIlllIIlIIII(Prayers.getPoints(), llIllIlll[27]) && q.lIlllIIIlllI(Inventory.contains(item -> item.getName().contains(llIllIIll[llIllIlll[201]])) ? 1 : 0)) {
                        Inventory.getFirst(item -> item.getName().contains(llIllIIll[llIllIlll[200]])).interact(llIllIIll[llIllIlll[93]]);
                        Time.sleepTicks((int)llIllIlll[0]);
                        0;
                    }
                }
            }
        }
    }

    private static boolean lIlllIIlIIll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlllIIlIIII(int n2, int n3) {
        return n2 < n3;
    }

    public static void h(String string) {
        block53: {
            d lIIIlIIIIlIIII;
            block55: {
                block54: {
                    String lIIIlIIIIlIIIl;
                    block52: {
                        block51: {
                            if (q.lIlllIIIlllI(string.equalsIgnoreCase(llIllIIll[llIllIlll[161]]) ? 1 : 0)) {
                                int[] nArray = new int[llIllIlll[0]];
                                nArray[q.llIllIlll[3]] = llIllIlll[146];
                                if (q.lIlllIIIllll(Bank.contains((int[])nArray) ? 1 : 0)) {
                                    d d2 = new d(llIllIlll[146], llIllIlll[162], llIllIlll[163]);
                                    bx.add(d2);
                                    0;
                                }
                            }
                            int[] nArray = new int[llIllIlll[0]];
                            nArray[q.llIllIlll[3]] = llIllIlll[152];
                            if (!q.lIlllIIIlllI(Bank.contains((int[])nArray) ? 1 : 0)) break block51;
                            int[] nArray2 = new int[llIllIlll[0]];
                            nArray2[q.llIllIlll[3]] = llIllIlll[152];
                            if (!q.lIlllIIIlllI(Bank.contains((int[])nArray2) ? 1 : 0)) break block52;
                            int[] nArray3 = new int[llIllIlll[0]];
                            nArray3[q.llIllIlll[3]] = llIllIlll[152];
                            if (!q.lIlllIIlIIII(Bank.getFirst((int[])nArray3).getQuantity(), llIllIlll[13])) break block52;
                        }
                        lIIIlIIIIlIIII = new d(llIllIlll[152], llIllIlll[13], j.ch);
                        bx.add(lIIIlIIIIlIIII);
                        0;
                    }
                    int[] nArray = new int[llIllIlll[0]];
                    nArray[q.llIllIlll[3]] = llIllIlll[164];
                    if (q.lIlllIIIllll(Bank.contains((int[])nArray) ? 1 : 0)) {
                        lIIIlIIIIlIIII = new d(llIllIlll[164], llIllIlll[13], llIllIlll[165]);
                        bx.add(lIIIlIIIIlIIII);
                        0;
                    }
                    int[] nArray4 = new int[llIllIlll[0]];
                    nArray4[q.llIllIlll[3]] = llIllIlll[153];
                    if (q.lIlllIIIllll(Bank.contains((int[])nArray4) ? 1 : 0)) {
                        lIIIlIIIIlIIII = new d(llIllIlll[153], llIllIlll[50], llIllIlll[166]);
                        bx.add(lIIIlIIIIlIIII);
                        0;
                    }
                    int[] nArray5 = new int[llIllIlll[0]];
                    nArray5[q.llIllIlll[3]] = llIllIlll[151];
                    if (q.lIlllIIIllll(Bank.contains((int[])nArray5) ? 1 : 0)) {
                        lIIIlIIIIlIIII = new d(llIllIlll[151], llIllIlll[50], llIllIlll[166]);
                        bx.add(lIIIlIIIIlIIII);
                        0;
                    }
                    if (q.lIlllIIIlllI(lIIIlIIIIlIIIl.equalsIgnoreCase(llIllIIll[llIllIlll[167]]) ? 1 : 0)) {
                        int[] nArray6 = new int[llIllIlll[0]];
                        nArray6[q.llIllIlll[3]] = llIllIlll[105];
                        if (q.lIlllIIIllll(Bank.contains((int[])nArray6) ? 1 : 0)) {
                            lIIIlIIIIlIIII = new d(llIllIlll[105], llIllIlll[0], llIllIlll[168]);
                            bx.add(lIIIlIIIIlIIII);
                            0;
                        }
                        if (q.lIlllIIlIIIl(Skills.getLevel((Skill)Skill.ATTACK), llIllIlll[74]) && q.lIlllIIlIIIl(Skills.getLevel((Skill)Skill.DEFENCE), llIllIlll[74]) && q.lIlllIIlIIIl(Skills.getLevel((Skill)Skill.STRENGTH), llIllIlll[74])) {
                            int[] nArray7 = new int[llIllIlll[0]];
                            nArray7[q.llIllIlll[3]] = llIllIlll[111];
                            if (q.lIlllIIIllll(Bank.contains((int[])nArray7) ? 1 : 0)) {
                                lIIIlIIIIlIIII = new d(llIllIlll[111], llIllIlll[0], e.c(llIllIlll[169], llIllIlll[170]));
                                bx.add(lIIIlIIIIlIIII);
                                0;
                            }
                            int[] nArray8 = new int[llIllIlll[0]];
                            nArray8[q.llIllIlll[3]] = llIllIlll[171];
                            if (q.lIlllIIIllll(Bank.contains((int[])nArray8) ? 1 : 0)) {
                                lIIIlIIIIlIIII = new d(llIllIlll[171], llIllIlll[0], e.c(llIllIlll[172], llIllIlll[173]));
                                bx.add(lIIIlIIIIlIIII);
                                0;
                            }
                            int[] nArray9 = new int[llIllIlll[0]];
                            nArray9[q.llIllIlll[3]] = llIllIlll[116];
                            if (q.lIlllIIIllll(Bank.contains((int[])nArray9) ? 1 : 0)) {
                                lIIIlIIIIlIIII = new d(llIllIlll[116], llIllIlll[0], e.c(llIllIlll[174], llIllIlll[175]));
                                bx.add(lIIIlIIIIlIIII);
                                0;
                            }
                            int[] nArray10 = new int[llIllIlll[0]];
                            nArray10[q.llIllIlll[3]] = llIllIlll[114];
                            if (q.lIlllIIIllll(Bank.contains((int[])nArray10) ? 1 : 0)) {
                                lIIIlIIIIlIIII = new d(llIllIlll[114], llIllIlll[0], e.c(llIllIlll[174], llIllIlll[175]));
                                bx.add(lIIIlIIIIlIIII);
                                0;
                            }
                            int[] nArray11 = new int[llIllIlll[0]];
                            nArray11[q.llIllIlll[3]] = llIllIlll[112];
                            if (q.lIlllIIIllll(Bank.contains((int[])nArray11) ? 1 : 0)) {
                                lIIIlIIIIlIIII = new d(llIllIlll[112], llIllIlll[0], e.c(llIllIlll[176], llIllIlll[177]));
                                bx.add(lIIIlIIIIlIIII);
                                0;
                            }
                            int[] nArray12 = new int[llIllIlll[0]];
                            nArray12[q.llIllIlll[3]] = llIllIlll[113];
                            if (q.lIlllIIIllll(Bank.contains((int[])nArray12) ? 1 : 0)) {
                                lIIIlIIIIlIIII = new d(llIllIlll[113], llIllIlll[0], e.c(llIllIlll[178], llIllIlll[179]));
                                bx.add(lIIIlIIIIlIIII);
                                0;
                            }
                            int[] nArray13 = new int[llIllIlll[0]];
                            nArray13[q.llIllIlll[3]] = llIllIlll[115];
                            if (q.lIlllIIIllll(Bank.contains((int[])nArray13) ? 1 : 0)) {
                                lIIIlIIIIlIIII = new d(llIllIlll[115], llIllIlll[0], e.c(llIllIlll[180], llIllIlll[181]));
                                bx.add(lIIIlIIIIlIIII);
                                0;
                            }
                            int[] nArray14 = new int[llIllIlll[0]];
                            nArray14[q.llIllIlll[3]] = llIllIlll[117];
                            if (q.lIlllIIIllll(Bank.contains((int[])nArray14) ? 1 : 0)) {
                                lIIIlIIIIlIIII = new d(llIllIlll[117], llIllIlll[0], e.c(llIllIlll[182], llIllIlll[183]));
                                bx.add(lIIIlIIIIlIIII);
                                0;
                            }
                        }
                    }
                    if (!q.lIlllIIIlllI(lIIIlIIIIlIIIl.equalsIgnoreCase(llIllIIll[llIllIlll[184]]) ? 1 : 0)) break block53;
                    int[] nArray15 = new int[llIllIlll[0]];
                    nArray15[q.llIllIlll[3]] = llIllIlll[103];
                    if (q.lIlllIIIllll(Bank.contains((int[])nArray15) ? 1 : 0)) {
                        int[] nArray16 = new int[llIllIlll[0]];
                        nArray16[q.llIllIlll[3]] = llIllIlll[103];
                        if (q.lIlllIIIllll(Equipment.contains((int[])nArray16) ? 1 : 0)) {
                            lIIIlIIIIlIIII = new d(llIllIlll[103], llIllIlll[0], e.c(llIllIlll[185], llIllIlll[186]));
                            bx.add(lIIIlIIIIlIIII);
                            0;
                        }
                    }
                    int[] nArray17 = new int[llIllIlll[0]];
                    nArray17[q.llIllIlll[3]] = llIllIlll[100];
                    if (q.lIlllIIIllll(Bank.contains((int[])nArray17) ? 1 : 0)) {
                        lIIIlIIIIlIIII = new d(llIllIlll[100], llIllIlll[4], llIllIlll[187]);
                        bx.add(lIIIlIIIIlIIII);
                        0;
                    }
                    int[] nArray18 = new int[llIllIlll[0]];
                    nArray18[q.llIllIlll[3]] = llIllIlll[98];
                    if (q.lIlllIIIllll(Bank.contains((int[])nArray18) ? 1 : 0)) {
                        lIIIlIIIIlIIII = new d(llIllIlll[98], llIllIlll[4], llIllIlll[187]);
                        bx.add(lIIIlIIIIlIIII);
                        0;
                    }
                    int[] nArray19 = new int[llIllIlll[0]];
                    nArray19[q.llIllIlll[3]] = llIllIlll[92];
                    if (!q.lIlllIIIlllI(Bank.contains((int[])nArray19) ? 1 : 0)) break block54;
                    int[] nArray20 = new int[llIllIlll[0]];
                    nArray20[q.llIllIlll[3]] = llIllIlll[92];
                    if (!q.lIlllIIIlllI(Bank.contains((int[])nArray20) ? 1 : 0)) break block55;
                    int[] nArray21 = new int[llIllIlll[0]];
                    nArray21[q.llIllIlll[3]] = llIllIlll[92];
                    if (!q.lIlllIIlIIII(Bank.getFirst((int[])nArray21).getQuantity(), llIllIlll[126])) break block55;
                }
                lIIIlIIIIlIIII = new d(llIllIlll[92], llIllIlll[188], e.c(llIllIlll[189], llIllIlll[190]));
                bx.add(lIIIlIIIIlIIII);
                0;
            }
            int[] nArray = new int[llIllIlll[0]];
            nArray[q.llIllIlll[3]] = llIllIlll[102];
            if (q.lIlllIIIllll(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray22 = new int[llIllIlll[0]];
                nArray22[q.llIllIlll[3]] = llIllIlll[102];
                if (q.lIlllIIIllll(Equipment.contains((int[])nArray22) ? 1 : 0)) {
                    int[] nArray23 = new int[llIllIlll[0]];
                    nArray23[q.llIllIlll[3]] = llIllIlll[122];
                    if (q.lIlllIIIllll(Bank.contains((int[])nArray23) ? 1 : 0)) {
                        lIIIlIIIIlIIII = new d(llIllIlll[122], llIllIlll[0], e.c(llIllIlll[191], llIllIlll[192]));
                        bx.add(lIIIlIIIIlIIII);
                        0;
                    }
                    int[] nArray24 = new int[llIllIlll[0]];
                    nArray24[q.llIllIlll[3]] = llIllIlll[101];
                    if (q.lIlllIIIllll(Bank.contains((int[])nArray24) ? 1 : 0)) {
                        lIIIlIIIIlIIII = new d(llIllIlll[101], llIllIlll[4], llIllIlll[187]);
                        bx.add(lIIIlIIIIlIIII);
                        0;
                    }
                }
            }
            if (q.lIlllIIlIIII(Skills.getBoostedLevel((Skill)Skill.RANGED), llIllIlll[74])) {
                int[] nArray25 = new int[llIllIlll[0]];
                nArray25[q.llIllIlll[3]] = llIllIlll[97];
                if (q.lIlllIIIllll(Bank.contains((int[])nArray25) ? 1 : 0)) {
                    lIIIlIIIIlIIII = new d(llIllIlll[97], llIllIlll[4], llIllIlll[187]);
                    bx.add(lIIIlIIIIlIIII);
                    0;
                }
                int[] nArray26 = new int[llIllIlll[0]];
                nArray26[q.llIllIlll[3]] = llIllIlll[97];
                if (q.lIlllIIIlllI(Bank.contains((int[])nArray26) ? 1 : 0)) {
                    int[] nArray27 = new int[llIllIlll[0]];
                    nArray27[q.llIllIlll[3]] = llIllIlll[97];
                    if (q.lIlllIIlIIII(Bank.getFirst((int[])nArray27).getQuantity(), llIllIlll[4])) {
                        int[] nArray28 = new int[llIllIlll[0]];
                        nArray28[q.llIllIlll[3]] = llIllIlll[97];
                        lIIIlIIIIlIIII = new d(llIllIlll[97], llIllIlll[4] - Bank.getFirst((int[])nArray28).getQuantity(), llIllIlll[187]);
                        bx.add(lIIIlIIIIlIIII);
                        0;
                    }
                }
                int[] nArray29 = new int[llIllIlll[0]];
                nArray29[q.llIllIlll[3]] = llIllIlll[96];
                if (q.lIlllIIIllll(Bank.contains((int[])nArray29) ? 1 : 0)) {
                    lIIIlIIIIlIIII = new d(llIllIlll[96], llIllIlll[4], llIllIlll[187]);
                    bx.add(lIIIlIIIIlIIII);
                    0;
                }
                int[] nArray30 = new int[llIllIlll[0]];
                nArray30[q.llIllIlll[3]] = llIllIlll[96];
                if (q.lIlllIIIlllI(Bank.contains((int[])nArray30) ? 1 : 0)) {
                    int[] nArray31 = new int[llIllIlll[0]];
                    nArray31[q.llIllIlll[3]] = llIllIlll[96];
                    if (q.lIlllIIlIIII(Bank.getFirst((int[])nArray31).getQuantity(), llIllIlll[4])) {
                        int[] nArray32 = new int[llIllIlll[0]];
                        nArray32[q.llIllIlll[3]] = llIllIlll[96];
                        lIIIlIIIIlIIII = new d(llIllIlll[96], llIllIlll[4] - Bank.getFirst((int[])nArray32).getQuantity(), llIllIlll[187]);
                        bx.add(lIIIlIIIIlIIII);
                        0;
                    }
                }
            }
            if (q.lIlllIIlIIIl(Skills.getLevel((Skill)Skill.RANGED), llIllIlll[74]) && q.lIlllIIlIIII(Skills.getLevel((Skill)Skill.RANGED), llIllIlll[84])) {
                int[] nArray33 = new int[llIllIlll[0]];
                nArray33[q.llIllIlll[3]] = llIllIlll[107];
                if (q.lIlllIIIllll(Bank.contains((int[])nArray33) ? 1 : 0)) {
                    lIIIlIIIIlIIII = new d(llIllIlll[107], llIllIlll[4], llIllIlll[193]);
                    bx.add(lIIIlIIIIlIIII);
                    0;
                }
                int[] nArray34 = new int[llIllIlll[0]];
                nArray34[q.llIllIlll[3]] = llIllIlll[107];
                if (q.lIlllIIIlllI(Bank.contains((int[])nArray34) ? 1 : 0)) {
                    int[] nArray35 = new int[llIllIlll[0]];
                    nArray35[q.llIllIlll[3]] = llIllIlll[107];
                    if (q.lIlllIIlIIII(Bank.getFirst((int[])nArray35).getQuantity(), llIllIlll[4])) {
                        int[] nArray36 = new int[llIllIlll[0]];
                        nArray36[q.llIllIlll[3]] = llIllIlll[107];
                        lIIIlIIIIlIIII = new d(llIllIlll[107], llIllIlll[4] - Bank.getFirst((int[])nArray36).getQuantity(), llIllIlll[193]);
                        bx.add(lIIIlIIIIlIIII);
                        0;
                    }
                }
                int[] nArray37 = new int[llIllIlll[0]];
                nArray37[q.llIllIlll[3]] = llIllIlll[106];
                if (q.lIlllIIIllll(Bank.contains((int[])nArray37) ? 1 : 0)) {
                    lIIIlIIIIlIIII = new d(llIllIlll[106], llIllIlll[4], llIllIlll[194]);
                    bx.add(lIIIlIIIIlIIII);
                    0;
                }
                int[] nArray38 = new int[llIllIlll[0]];
                nArray38[q.llIllIlll[3]] = llIllIlll[106];
                if (q.lIlllIIIlllI(Bank.contains((int[])nArray38) ? 1 : 0)) {
                    int[] nArray39 = new int[llIllIlll[0]];
                    nArray39[q.llIllIlll[3]] = llIllIlll[106];
                    if (q.lIlllIIlIIII(Bank.getFirst((int[])nArray39).getQuantity(), llIllIlll[4])) {
                        int[] nArray40 = new int[llIllIlll[0]];
                        nArray40[q.llIllIlll[3]] = llIllIlll[106];
                        lIIIlIIIIlIIII = new d(llIllIlll[106], llIllIlll[4] - Bank.getFirst((int[])nArray40).getQuantity(), llIllIlll[194]);
                        bx.add(lIIIlIIIIlIIII);
                        0;
                    }
                }
            }
            if (q.lIlllIIlIIIl(Skills.getLevel((Skill)Skill.RANGED), llIllIlll[84])) {
                int[] nArray41 = new int[llIllIlll[0]];
                nArray41[q.llIllIlll[3]] = llIllIlll[109];
                if (q.lIlllIIIllll(Bank.contains((int[])nArray41) ? 1 : 0)) {
                    lIIIlIIIIlIIII = new d(llIllIlll[109], llIllIlll[4], llIllIlll[193]);
                    bx.add(lIIIlIIIIlIIII);
                    0;
                }
                int[] nArray42 = new int[llIllIlll[0]];
                nArray42[q.llIllIlll[3]] = llIllIlll[109];
                if (q.lIlllIIIlllI(Bank.contains((int[])nArray42) ? 1 : 0)) {
                    int[] nArray43 = new int[llIllIlll[0]];
                    nArray43[q.llIllIlll[3]] = llIllIlll[109];
                    if (q.lIlllIIlIIII(Bank.getFirst((int[])nArray43).getQuantity(), llIllIlll[4])) {
                        int[] nArray44 = new int[llIllIlll[0]];
                        nArray44[q.llIllIlll[3]] = llIllIlll[109];
                        lIIIlIIIIlIIII = new d(llIllIlll[109], llIllIlll[4] - Bank.getFirst((int[])nArray44).getQuantity(), llIllIlll[193]);
                        bx.add(lIIIlIIIIlIIII);
                        0;
                    }
                }
                int[] nArray45 = new int[llIllIlll[0]];
                nArray45[q.llIllIlll[3]] = llIllIlll[108];
                if (q.lIlllIIIllll(Bank.contains((int[])nArray45) ? 1 : 0)) {
                    lIIIlIIIIlIIII = new d(llIllIlll[108], llIllIlll[4], llIllIlll[6]);
                    bx.add(lIIIlIIIIlIIII);
                    0;
                }
                int[] nArray46 = new int[llIllIlll[0]];
                nArray46[q.llIllIlll[3]] = llIllIlll[108];
                if (q.lIlllIIIlllI(Bank.contains((int[])nArray46) ? 1 : 0)) {
                    int[] nArray47 = new int[llIllIlll[0]];
                    nArray47[q.llIllIlll[3]] = llIllIlll[108];
                    if (q.lIlllIIlIIII(Bank.getFirst((int[])nArray47).getQuantity(), llIllIlll[4])) {
                        int[] nArray48 = new int[llIllIlll[0]];
                        nArray48[q.llIllIlll[3]] = llIllIlll[108];
                        lIIIlIIIIlIIII = new d(llIllIlll[108], llIllIlll[4] - Bank.getFirst((int[])nArray48).getQuantity(), llIllIlll[6]);
                        bx.add(lIIIlIIIIlIIII);
                        0;
                    }
                }
            }
        }
    }

    private static void aR() {
        Item lIIIlIIIIlIllI;
        Item item2 = Inventory.getFirst(item -> item.getName().contains(llIllIIll[llIllIlll[197]]));
        Item item3 = Inventory.getFirst(item -> item.getName().contains(llIllIIll[llIllIlll[196]]));
        if (q.lIlllIIlIIlI(item3) && q.lIlllIIlIlll(Skills.getLevel((Skill)Skill.STRENGTH), Skills.getBoostedLevel((Skill)Skill.STRENGTH)) && q.lIlllIIlIIIl(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), llIllIlll[65])) {
            item3.interact(llIllIIll[llIllIlll[154]]);
            Time.sleepTicks((int)llIllIlll[5]);
            0;
            if (q.lIlllIIlIIlI(item2)) {
                item2.interact(llIllIIll[llIllIlll[155]]);
                Time.sleepTicks((int)llIllIlll[0]);
                0;
            }
            Time.sleepTicks((int)llIllIlll[20]);
            0;
        }
        if (q.lIlllIIlIIlI(lIIIlIIIIlIllI) && q.lIlllIIlIlII(Vars.getBit((int)llIllIlll[156]), llIllIlll[62]) && q.lIlllIIllIIl(Skills.getLevel((Skill)Skill.STRENGTH), Skills.getBoostedLevel((Skill)Skill.STRENGTH)) && q.lIlllIIlIIII(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), llIllIlll[65])) {
            while (q.lIlllIIlIIII(Vars.getBit((int)llIllIlll[156]), llIllIlll[157])) {
                if (q.lIlllIIlIIlI(lIIIlIIIIlIllI)) {
                    lIIIlIIIIlIllI.interact(llIllIIll[llIllIlll[158]]);
                    Time.sleepTicks((int)llIllIlll[0]);
                    0;
                }
                if (!q.lIlllIIlIlIl(lIIIlIIIIlIllI = Inventory.getFirst(item -> item.getName().contains(llIllIIll[llIllIlll[195]])))) continue;
                0;
                if (-3 < 0) break;
                return;
            }
        }
        String[] stringArray = new String[llIllIlll[0]];
        stringArray[q.llIllIlll[3]] = llIllIIll[llIllIlll[159]];
        Item lIIIlIIIIlIlII = Inventory.getFirst((String[])stringArray);
        if (q.lIlllIIlIIlI(lIIIlIIIIlIlII) && q.lIlllIIllIIl(Skills.getLevel((Skill)Skill.STRENGTH), Skills.getBoostedLevel((Skill)Skill.STRENGTH)) && q.lIlllIIlIIII(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), llIllIlll[65]) && q.lIlllIIlIIll(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), llIllIlll[0])) {
            lIIIlIIIIlIlII.interact(llIllIIll[llIllIlll[160]]);
            cK = e.c(llIllIlll[0], llIllIlll[4]);
        }
    }

    static boolean aQ() {
        boolean bl;
        if (q.lIlllIIIlllI(Inventory.contains(item -> item.getName().contains(llIllIIll[llIllIlll[208]])) ? 1 : 0) && (!q.lIlllIIIllll(Inventory.isFull() ? 1 : 0) || q.lIlllIIlIIII(Vars.getBit((int)cY), llIllIlll[0]) && !q.lIlllIIlIIIl(Vars.getBit((int)llIllIlll[1]), llIllIlll[2])) || q.lIlllIIlIIII(Vars.getBit((int)cY), llIllIlll[0]) && q.lIlllIIlIIII(Vars.getBit((int)llIllIlll[1]), llIllIlll[2])) {
            bl = llIllIlll[0];
            0;
            if (-2 > 0) {
                return ((0x17 ^ 0x7B ^ (0xAC ^ 0x94)) & (0xE2 ^ 0x9E ^ (0x7C ^ 0x54) ^ -1)) != 0;
            }
        } else {
            bl = llIllIlll[3];
        }
        return bl;
    }

    static {
        q.lIlllIIIllIl();
        q.lIlllIIIlIIl();
        bx = new ArrayList<d>();
        cT = null;
        cU = null;
        cV = new WorldArea(llIllIlll[209], llIllIlll[210], llIllIlll[37], llIllIlll[46], llIllIlll[3]);
        cW = new WorldPoint(llIllIlll[211], llIllIlll[212], llIllIlll[3]);
        cX = new WorldPoint(llIllIlll[213], llIllIlll[214], llIllIlll[3]);
        cY = llIllIlll[215];
        cZ = llIllIlll[58];
        da = llIllIlll[3];
        cK = e.c(llIllIlll[0], llIllIlll[4]);
        int[] nArray = new int[llIllIlll[12]];
        nArray[q.llIllIlll[3]] = llIllIlll[111];
        nArray[q.llIllIlll[0]] = llIllIlll[117];
        nArray[q.llIllIlll[4]] = llIllIlll[114];
        nArray[q.llIllIlll[5]] = llIllIlll[112];
        nArray[q.llIllIlll[7]] = llIllIlll[113];
        nArray[q.llIllIlll[8]] = llIllIlll[116];
        nArray[q.llIllIlll[9]] = llIllIlll[115];
        nArray[q.llIllIlll[10]] = llIllIlll[105];
        nArray[q.llIllIlll[11]] = llIllIlll[171];
        db = nArray;
    }

    private static void lIlllIIIlIIl() {
        llIllIIll = new String[llIllIlll[216]];
        q.llIllIIll[q.llIllIlll[3]] = q."Buying items";
        q.llIllIIll[q.llIllIlll[0]] = q."Finished buying items, switching back to melee training";
        q.llIllIIll[q.llIllIlll[4]] = q."Portal";
        q.llIllIIll[q.llIllIlll[5]] = q."Castle Wars";
        q.llIllIIll[q.llIllIlll[7]] = q."Wear";
        q.llIllIIll[q.llIllIlll[8]] = q."Exiting nmz dream";
        q.llIllIIll[q.llIllIlll[9]] = q."Potion";
        q.llIllIIll[q.llIllIlll[10]] = q."Drink";
        q.llIllIIll[q.llIllIlll[11]] = q."melee";
        q.llIllIIll[q.llIllIlll[12]] = q."melee";
        q.llIllIIll[q.llIllIlll[13]] = q."range";
        q.llIllIIll[q.llIllIlll[14]] = q."range";
        q.llIllIIll[q.llIllIlll[17]] = q."Handle coffer";
        q.llIllIIll[q.llIllIlll[18]] = q."Dominic's coffer";
        q.llIllIIll[q.llIllIlll[19]] = q."Unlock";
        q.llIllIIll[q.llIllIlll[20]] = q."Dominic's coffer";
        q.llIllIIll[q.llIllIlll[21]] = q."Unlock";
        q.llIllIIll[q.llIllIlll[22]] = q."Dominic's coffer";
        q.llIllIIll[q.llIllIlll[23]] = q."Use";
        q.llIllIIll[q.llIllIlll[24]] = q."Deposit money.";
        q.llIllIIll[q.llIllIlll[27]] = q."Nav to nmz start";
        q.llIllIIll[q.llIllIlll[29]] = q."Open store";
        q.llIllIIll[q.llIllIlll[30]] = q."Rewards chest";
        q.llIllIIll[q.llIllIlll[31]] = q."Search";
        q.llIllIIll[q.llIllIlll[32]] = q."Buying";
        q.llIllIIll[q.llIllIlll[33]] = q."Buy-50";
        q.llIllIIll[q.llIllIlll[34]] = q."null";
        q.llIllIIll[q.llIllIlll[35]] = q."Overload (1)";
        q.llIllIIll[q.llIllIlll[36]] = q."Getting overloads";
        q.llIllIIll[q.llIllIlll[37]] = q."Overload potion";
        q.llIllIIll[q.llIllIlll[15]] = q."Take";
        q.llIllIIll[q.llIllIlll[40]] = q."Handle coffer";
        q.llIllIIll[q.llIllIlll[41]] = q."Dominic's coffer";
        q.llIllIIll[q.llIllIlll[42]] = q."Unlock";
        q.llIllIIll[q.llIllIlll[43]] = q."Dominic's coffer";
        q.llIllIIll[q.llIllIlll[44]] = q."Unlock";
        q.llIllIIll[q.llIllIlll[45]] = q."Dominic's coffer";
        q.llIllIIll[q.llIllIlll[46]] = q."Use";
        q.llIllIIll[q.llIllIlll[47]] = q."Deposit money.";
        q.llIllIIll[q.llIllIlll[49]] = q."Creating dream";
        q.llIllIIll[q.llIllIlll[50]] = q."Dominic Onion";
        q.llIllIIll[q.llIllIlll[51]] = q."Dominic Onion";
        q.llIllIIll[q.llIllIlll[52]] = q."Dream";
        q.llIllIIll[q.llIllIlll[53]] = q."Dominic Onion";
        q.llIllIIll[q.llIllIlll[54]] = q."Dream";
        q.llIllIIll[q.llIllIlll[55]] = q."Rumble";
        q.llIllIIll[q.llIllIlll[56]] = q."Customisable - hard";
        q.llIllIIll[q.llIllIlll[57]] = q."Yes";
        q.llIllIIll[q.llIllIlll[60]] = q."Potion";
        q.llIllIIll[q.llIllIlll[61]] = q."Drink";
        q.llIllIIll[q.llIllIlll[62]] = q."Handling boss selection";
        q.llIllIIll[q.llIllIlll[65]] = q."Vampyre Slayer";
        q.llIllIIll[q.llIllIlll[66]] = q."Toggle vamp";
        q.llIllIIll[q.llIllIlll[67]] = q."Toggle";
        q.llIllIIll[q.llIllIlll[68]] = q."Lost City";
        q.llIllIIll[q.llIllIlll[69]] = q."Toggle tree spirit";
        q.llIllIIll[q.llIllIlll[70]] = q."Toggle";
        q.llIllIIll[q.llIllIlll[71]] = q."Fight Arena";
        q.llIllIIll[q.llIllIlll[72]] = q."Toggle bouncer";
        q.llIllIIll[q.llIllIlll[73]] = q."Toggle";
        q.llIllIIll[q.llIllIlll[74]] = q."Grand Tree";
        q.llIllIIll[q.llIllIlll[75]] = q."Toggle black demon";
        q.llIllIIll[q.llIllIlll[76]] = q."Toggle";
        q.llIllIIll[q.llIllIlll[77]] = q."Tree Gnome Village";
        q.llIllIIll[q.llIllIlll[78]] = q."Toggle khazard warlord";
        q.llIllIIll[q.llIllIlll[79]] = q."Toggle";
        q.llIllIIll[q.llIllIlll[80]] = q."Entering dream";
        q.llIllIIll[q.llIllIlll[81]] = q."Dominic Onion";
        q.llIllIIll[q.llIllIlll[82]] = q."set tile";
        q.llIllIIll[q.llIllIlll[83]] = q."Power surge";
        q.llIllIIll[q.llIllIlll[84]] = q."Walk to middle";
        q.llIllIIll[q.llIllIlll[85]] = q."Power surge";
        q.llIllIIll[q.llIllIlll[86]] = q."Afking";
        q.llIllIIll[q.llIllIlll[87]] = q."Attack";
        q.llIllIIll[q.llIllIlll[88]] = q."Drink";
        q.llIllIIll[q.llIllIlll[89]] = q."Power surge";
        q.llIllIIll[q.llIllIlll[90]] = q."Power surge";
        q.llIllIIll[q.llIllIlll[91]] = q."Activate";
        q.llIllIIll[q.llIllIlll[93]] = q."Drink";
        q.llIllIIll[q.llIllIlll[94]] = q."none";
        q.llIllIIll[q.llIllIlll[95]] = q."range";
        q.llIllIIll[q.llIllIlll[110]] = q."melee";
        q.llIllIIll[q.llIllIlll[118]] = q."Navigating to bank";
        q.llIllIIll[q.llIllIlll[119]] = q."Handling banking";
        q.llIllIIll[q.llIllIlll[121]] = q."range";
        q.llIllIIll[q.llIllIlll[123]] = q."range";
        q.llIllIIll[q.llIllIlll[124]] = q."We are missing magic short i, switching to BUYING";
        q.llIllIIll[q.llIllIlll[125]] = q."Making MSB (i)";
        q.llIllIIll[q.llIllIlll[127]] = q."range";
        q.llIllIIll[q.llIllIlll[128]] = q."We are missing rune arrows, switching to BUYING";
        q.llIllIIll[q.llIllIlll[129]] = q."melee";
        q.llIllIIll[q.llIllIlll[130]] = q."meleeNmz";
        q.llIllIIll[q.llIllIlll[131]] = q."range";
        q.llIllIIll[q.llIllIlll[132]] = q."rangeNmz";
        q.llIllIIll[q.llIllIlll[133]] = q."range";
        q.llIllIIll[q.llIllIlll[134]] = q."Wield";
        q.llIllIIll[q.llIllIlll[135]] = q."melee";
        q.llIllIIll[q.llIllIlll[136]] = q."range";
        q.llIllIIll[q.llIllIlll[137]] = q."supplies";
        q.llIllIIll[q.llIllIlll[138]] = q."We are missing supplies, switching to BUYING";
        q.llIllIIll[q.llIllIlll[139]] = q."melee";
        q.llIllIIll[q.llIllIlll[140]] = q."range";
        q.llIllIIll[q.llIllIlll[142]] = q."Nav to nmz bank";
        q.llIllIIll[q.llIllIlll[143]] = q."Handling banking";
        q.llIllIIll[q.llIllIlll[145]] = q."range";
        q.llIllIIll[q.llIllIlll[154]] = q."Drink";
        q.llIllIIll[q.llIllIlll[155]] = q."Drink";
        q.llIllIIll[q.llIllIlll[158]] = q."Drink";
        q.llIllIIll[q.llIllIlll[159]] = q."Dwarven rock cake";
        q.llIllIIll[q.llIllIlll[160]] = q."Guzzle";
        q.llIllIIll[q.llIllIlll[161]] = q."supplies";
        q.llIllIIll[q.llIllIlll[167]] = q."melee";
        q.llIllIIll[q.llIllIlll[184]] = q."range";
        q.llIllIIll[q.llIllIlll[195]] = q."Absorption";
        q.llIllIIll[q.llIllIlll[196]] = q."Overload";
        q.llIllIIll[q.llIllIlll[197]] = q."Absorption";
        q.llIllIIll[q.llIllIlll[198]] = q."dueling";
        q.llIllIIll[q.llIllIlll[199]] = q."dueling";
        q.llIllIIll[q.llIllIlll[200]] = q."Prayer";
        q.llIllIIll[q.llIllIlll[201]] = q."Prayer";
        q.llIllIIll[q.llIllIlll[162]] = q."(normal)";
        q.llIllIIll[q.llIllIlll[202]] = q."(hard)";
        q.llIllIIll[q.llIllIlll[203]] = q."Overload";
        q.llIllIIll[q.llIllIlll[204]] = q."Black demon";
        q.llIllIIll[q.llIllIlll[205]] = q."Prayer";
        q.llIllIIll[q.llIllIlll[206]] = q."Prayer";
        q.llIllIIll[q.llIllIlll[208]] = q."Overload";
    }

    /*
     * WARNING - void declaration
     */
    private static void g(String string) {
        block52: {
            String lIIIlIIIIllIll;
            block53: {
                block56: {
                    block51: {
                        block54: {
                            block55: {
                                void lIIIlIIIIllIlI;
                                BankLocation bankLocation = BankLocation.getNearest();
                                if (q.lIlllIIlIIlI(bankLocation) && q.lIlllIIIllll(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderGWD.c = llIllIIll[llIllIlll[118]];
                                    a.a(bankLocation);
                                }
                                if (!q.lIlllIIlIIlI(lIIIlIIIIllIlI) || !q.lIlllIIIlllI(lIIIlIIIIllIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block52;
                                AccBuilderGWD.c = llIllIIll[llIllIlll[119]];
                                if (q.lIlllIIIllll(Bank.isOpen() ? 1 : 0)) {
                                    a.a();
                                    Time.sleepUntil(() -> Bank.isOpen(), (int)llIllIlll[120]);
                                    0;
                                    Time.sleepTicks((int)e.c(llIllIlll[5], llIllIlll[8]));
                                    0;
                                }
                                if (!q.lIlllIIIlllI(Bank.isOpen() ? 1 : 0)) break block52;
                                if (q.lIlllIIlIllI(Inventory.getAll().size())) {
                                    Bank.depositInventory();
                                    Time.sleepTicks((int)llIllIlll[5]);
                                    0;
                                }
                                if (!q.lIlllIIIlllI(lIIIlIIIIllIll.equalsIgnoreCase(llIllIIll[llIllIlll[121]]) ? 1 : 0)) break block53;
                                if (q.lIlllIIIlllI(cV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    h.X();
                                }
                                int[] nArray = new int[llIllIlll[0]];
                                nArray[q.llIllIlll[3]] = llIllIlll[102];
                                if (!q.lIlllIIIllll(Bank.contains((int[])nArray) ? 1 : 0)) break block54;
                                int[] nArray2 = new int[llIllIlll[0]];
                                nArray2[q.llIllIlll[3]] = llIllIlll[102];
                                if (!q.lIlllIIIllll(Equipment.contains((int[])nArray2) ? 1 : 0)) break block54;
                                int[] nArray3 = new int[llIllIlll[0]];
                                nArray3[q.llIllIlll[3]] = llIllIlll[101];
                                if (!q.lIlllIIIlllI(Bank.contains((int[])nArray3) ? 1 : 0)) break block55;
                                int[] nArray4 = new int[llIllIlll[0]];
                                nArray4[q.llIllIlll[3]] = llIllIlll[122];
                                if (!q.lIlllIIIllll(Bank.contains((int[])nArray4) ? 1 : 0)) break block54;
                            }
                            q.h(llIllIIll[llIllIlll[123]]);
                            System.out.println(llIllIIll[llIllIlll[124]]);
                            bv = llIllIlll[0];
                            return;
                        }
                        int[] nArray = new int[llIllIlll[0]];
                        nArray[q.llIllIlll[3]] = llIllIlll[102];
                        if (q.lIlllIIIllll(Bank.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray5 = new int[llIllIlll[0]];
                            nArray5[q.llIllIlll[3]] = llIllIlll[102];
                            if (q.lIlllIIIllll(Equipment.contains((int[])nArray5) ? 1 : 0)) {
                                int[] nArray6 = new int[llIllIlll[0]];
                                nArray6[q.llIllIlll[3]] = llIllIlll[101];
                                if (q.lIlllIIIlllI(Bank.contains((int[])nArray6) ? 1 : 0)) {
                                    int[] nArray7 = new int[llIllIlll[0]];
                                    nArray7[q.llIllIlll[3]] = llIllIlll[122];
                                    if (q.lIlllIIIlllI(Bank.contains((int[])nArray7) ? 1 : 0)) {
                                        do {
                                            int[] nArray8 = new int[llIllIlll[0]];
                                            nArray8[q.llIllIlll[3]] = llIllIlll[102];
                                            if (!q.lIlllIIIllll(Inventory.contains((int[])nArray8) ? 1 : 0)) break block51;
                                            AccBuilderGWD.c = llIllIIll[llIllIlll[125]];
                                            int[] nArray9 = new int[llIllIlll[0]];
                                            nArray9[q.llIllIlll[3]] = llIllIlll[101];
                                            if (q.lIlllIIIllll(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                                                a.a(llIllIlll[101], llIllIlll[0]);
                                            }
                                            int[] nArray10 = new int[llIllIlll[0]];
                                            nArray10[q.llIllIlll[3]] = llIllIlll[122];
                                            if (q.lIlllIIIllll(Inventory.contains((int[])nArray10) ? 1 : 0)) {
                                                a.a(llIllIlll[122], llIllIlll[0]);
                                            }
                                            int[] nArray11 = new int[llIllIlll[0]];
                                            nArray11[q.llIllIlll[3]] = llIllIlll[101];
                                            if (q.lIlllIIIlllI(Inventory.contains((int[])nArray11) ? 1 : 0)) {
                                                int[] nArray12 = new int[llIllIlll[0]];
                                                nArray12[q.llIllIlll[3]] = llIllIlll[122];
                                                if (q.lIlllIIIlllI(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                                                    int[] nArray13 = new int[llIllIlll[0]];
                                                    nArray13[q.llIllIlll[3]] = llIllIlll[101];
                                                    int[] nArray14 = new int[llIllIlll[0]];
                                                    nArray14[q.llIllIlll[3]] = llIllIlll[122];
                                                    Inventory.getFirst((int[])nArray13).useOn(Inventory.getFirst((int[])nArray14));
                                                    Time.sleepTicks((int)llIllIlll[4]);
                                                    0;
                                                }
                                            }
                                            if (q.lIlllIIIlllI(Bank.isOpen() ? 1 : 0)) {
                                                int[] nArray15 = new int[llIllIlll[0]];
                                                nArray15[q.llIllIlll[3]] = llIllIlll[102];
                                                if (q.lIlllIIIlllI(Bank.contains((int[])nArray15) ? 1 : 0)) {
                                                    a.a(llIllIlll[102], llIllIlll[0]);
                                                }
                                            }
                                            int[] nArray16 = new int[llIllIlll[0]];
                                            nArray16[q.llIllIlll[3]] = llIllIlll[102];
                                            if (q.lIlllIIIlllI(Inventory.contains((int[])nArray16) ? 1 : 0)) {
                                                if (q.lIlllIIIllll(Bank.isOpen() ? 1 : 0)) {
                                                    a.a();
                                                    Time.sleepTicks((int)llIllIlll[9]);
                                                    0;
                                                }
                                                if (q.lIlllIIIlllI(Bank.isOpen() ? 1 : 0)) {
                                                    Bank.depositInventory();
                                                    Time.sleepTicks((int)llIllIlll[5]);
                                                    0;
                                                    0;
                                                    if (-(0xA9 ^ 0xAD) > 0) {
                                                        return;
                                                    }
                                                    break block51;
                                                }
                                            }
                                            Time.sleepTicks((int)llIllIlll[0]);
                                            0;
                                            0;
                                        } while (1 >= 1);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                    int[] nArray = new int[llIllIlll[0]];
                    nArray[q.llIllIlll[3]] = llIllIlll[92];
                    if (!q.lIlllIIIlllI(Bank.contains((int[])nArray) ? 1 : 0)) break block56;
                    int[] nArray17 = new int[llIllIlll[0]];
                    nArray17[q.llIllIlll[3]] = llIllIlll[92];
                    if (!q.lIlllIIIlllI(Bank.contains((int[])nArray17) ? 1 : 0)) break block53;
                    int[] nArray18 = new int[llIllIlll[0]];
                    nArray18[q.llIllIlll[3]] = llIllIlll[92];
                    if (!q.lIlllIIlIIII(Bank.getFirst((int[])nArray18).getQuantity(), llIllIlll[126])) break block53;
                }
                int[] nArray = new int[llIllIlll[0]];
                nArray[q.llIllIlll[3]] = llIllIlll[92];
                if (q.lIlllIIIllll(Equipment.contains((int[])nArray) ? 1 : 0)) {
                    q.h(llIllIIll[llIllIlll[127]]);
                    System.out.println(llIllIIll[llIllIlll[128]]);
                    bv = llIllIlll[0];
                    return;
                }
            }
            if (q.lIlllIIIllll(cL ? 1 : 0)) {
                h.X();
                cL = llIllIlll[0];
            }
            while (q.lIlllIIIllll(h.bw ? 1 : 0) && q.lIlllIIIllll(AccBuilderGWD.d ? 1 : 0)) {
                if (q.lIlllIIIlllI(lIIIlIIIIllIll.equalsIgnoreCase(llIllIIll[llIllIlll[129]]) ? 1 : 0)) {
                    h.d(llIllIIll[llIllIlll[130]]);
                }
                if (q.lIlllIIIlllI(lIIIlIIIIllIll.equalsIgnoreCase(llIllIIll[llIllIlll[131]]) ? 1 : 0)) {
                    h.d(llIllIIll[llIllIlll[132]]);
                }
                Time.sleepTicks((int)llIllIlll[0]);
                0;
                0;
                if (((0 ^ 0x19 ^ (0xFE ^ 0xBC)) & (201 + 184 - 174 + 6 ^ 109 + 61 - 87 + 47 ^ -1)) != (0x53 ^ 0x57 ^ (0x54 ^ 0x42) & ~(0xAE ^ 0xB8))) continue;
                return;
            }
            if (q.lIlllIIIlllI(lIIIlIIIIllIll.equalsIgnoreCase(llIllIIll[llIllIlll[133]]) ? 1 : 0)) {
                int[] nArray = new int[llIllIlll[0]];
                nArray[q.llIllIlll[3]] = llIllIlll[92];
                if (q.lIlllIIIlllI(Bank.contains((int[])nArray) ? 1 : 0)) {
                    Bank.withdrawAll((int)llIllIlll[92], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                    Time.sleepTicks((int)llIllIlll[4]);
                    0;
                    int[] nArray19 = new int[llIllIlll[0]];
                    nArray19[q.llIllIlll[3]] = llIllIlll[92];
                    if (q.lIlllIIIlllI(Inventory.contains((int[])nArray19) ? 1 : 0)) {
                        int[] nArray20 = new int[llIllIlll[0]];
                        nArray20[q.llIllIlll[3]] = llIllIlll[92];
                        Inventory.getFirst((int[])nArray20).interact(llIllIIll[llIllIlll[134]]);
                        Time.sleepTicks((int)llIllIlll[0]);
                        0;
                    }
                    if (q.lIlllIIIllll(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepTicks((int)llIllIlll[9]);
                        0;
                    }
                }
            }
            if (q.lIlllIIIllll(q.an() ? 1 : 0) && (!q.lIlllIIIllll(q.f(llIllIIll[llIllIlll[135]]) ? 1 : 0) || q.lIlllIIIlllI(q.f(llIllIIll[llIllIlll[136]]) ? 1 : 0))) {
                q.h(llIllIIll[llIllIlll[137]]);
                System.out.println(llIllIIll[llIllIlll[138]]);
                bv = llIllIlll[0];
                return;
            }
            if (q.lIlllIIIlllI(q.an() ? 1 : 0) && (!q.lIlllIIIllll(q.f(llIllIIll[llIllIlll[139]]) ? 1 : 0) || q.lIlllIIIlllI(q.f(llIllIIll[llIllIlll[140]]) ? 1 : 0))) {
                while (q.lIlllIIIllll(cV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (q.lIlllIIIlllI(Bank.isOpen() ? 1 : 0)) {
                        a.a(llIllIlll[16], llIllIlll[141]);
                        a.b(f.bc, llIllIlll[4]);
                        Bank.withdraw(item -> item.getName().contains(llIllIIll[llIllIlll[199]]), (int)llIllIlll[0], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        Time.sleepTicks((int)llIllIlll[0]);
                        0;
                    }
                    if (q.lIlllIIIlllI(Bank.isOpen() ? 1 : 0)) {
                        Bank.close();
                    }
                    if (q.lIlllIIlIIll(Players.getLocal().getWorldLocation().distanceTo(cW), llIllIlll[8])) {
                        AccBuilderGWD.c = llIllIIll[llIllIlll[142]];
                        Movement.walkTo((WorldPoint)cW);
                        0;
                        Time.sleepTicks((int)llIllIlll[0]);
                        0;
                    }
                    Time.sleepTicks((int)llIllIlll[0]);
                    0;
                    0;
                    if (null == null) continue;
                    return;
                }
                if (q.lIlllIIIlllI(cV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = llIllIIll[llIllIlll[143]];
                    if (q.lIlllIIIllll(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)llIllIlll[120]);
                        0;
                        Time.sleepTicks((int)e.c(llIllIlll[5], llIllIlll[8]));
                        0;
                    }
                    if (q.lIlllIIlIllI(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks((int)llIllIlll[5]);
                        0;
                    }
                    if (q.lIlllIIlIIII(Vars.getBit((int)llIllIlll[58]), llIllIlll[15])) {
                        a.a(llIllIlll[16], llIllIlll[144]);
                    }
                    if (q.lIlllIIIlllI(lIIIlIIIIllIll.equalsIgnoreCase(llIllIIll[llIllIlll[145]]) ? 1 : 0)) {
                        Bank.withdrawAll((int)llIllIlll[92], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        Time.sleepTicks((int)llIllIlll[4]);
                        0;
                    }
                    int[] nArray = new int[llIllIlll[0]];
                    nArray[q.llIllIlll[3]] = llIllIlll[92];
                    if (q.lIlllIIIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        e.l(llIllIlll[92]);
                        if (q.lIlllIIIllll(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepTicks((int)llIllIlll[9]);
                            0;
                        }
                    }
                    a.a(llIllIlll[146], llIllIlll[27]);
                    a.a(llIllIlll[147], llIllIlll[13]);
                    a.a(llIllIlll[148], llIllIlll[13]);
                    a.a(llIllIlll[149], llIllIlll[13]);
                    a.a(llIllIlll[150], llIllIlll[13]);
                }
            }
        }
    }

    private static boolean lIlllIIllIII(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIlllIIllIIl(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIlllIIIlllI(int n2) {
        return n2 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean f(String string) {
        int n2;
        block38: {
            block45: {
                block44: {
                    block43: {
                        block42: {
                            block41: {
                                block40: {
                                    block39: {
                                        block37: {
                                            String lIIIlIIIIllllI;
                                            block25: {
                                                int n3;
                                                block34: {
                                                    block36: {
                                                        block35: {
                                                            block30: {
                                                                int n4;
                                                                block31: {
                                                                    block33: {
                                                                        block32: {
                                                                            block26: {
                                                                                int n5;
                                                                                block27: {
                                                                                    block29: {
                                                                                        block28: {
                                                                                            if (q.lIlllIIIlllI(string.equalsIgnoreCase(llIllIIll[llIllIlll[94]]) ? 1 : 0)) {
                                                                                                return llIllIlll[0];
                                                                                            }
                                                                                            if (!q.lIlllIIIlllI(lIIIlIIIIllllI.equalsIgnoreCase(llIllIIll[llIllIlll[95]]) ? 1 : 0)) break block25;
                                                                                            if (!q.lIlllIIlIIIl(Skills.getLevel((Skill)Skill.RANGED), llIllIlll[62]) || !q.lIlllIIlIIII(Skills.getLevel((Skill)Skill.RANGED), llIllIlll[74])) break block26;
                                                                                            int[] nArray = new int[llIllIlll[0]];
                                                                                            nArray[q.llIllIlll[3]] = llIllIlll[96];
                                                                                            if (!q.lIlllIIIlllI(Equipment.contains((int[])nArray) ? 1 : 0)) break block27;
                                                                                            int[] nArray2 = new int[llIllIlll[0]];
                                                                                            nArray2[q.llIllIlll[3]] = llIllIlll[97];
                                                                                            if (!q.lIlllIIIlllI(Equipment.contains((int[])nArray2) ? 1 : 0)) break block27;
                                                                                            int[] nArray3 = new int[llIllIlll[0]];
                                                                                            nArray3[q.llIllIlll[3]] = llIllIlll[98];
                                                                                            if (!q.lIlllIIIllll(Equipment.contains((int[])nArray3) ? 1 : 0)) break block28;
                                                                                            int[] nArray4 = new int[llIllIlll[0]];
                                                                                            nArray4[q.llIllIlll[3]] = llIllIlll[99];
                                                                                            if (!q.lIlllIIIlllI(Equipment.contains((int[])nArray4) ? 1 : 0)) break block27;
                                                                                        }
                                                                                        int[] nArray = new int[llIllIlll[0]];
                                                                                        nArray[q.llIllIlll[3]] = llIllIlll[100];
                                                                                        if (!q.lIlllIIIlllI(Equipment.contains((int[])nArray) ? 1 : 0)) break block27;
                                                                                        int[] nArray5 = new int[llIllIlll[0]];
                                                                                        nArray5[q.llIllIlll[3]] = llIllIlll[101];
                                                                                        if (!q.lIlllIIIllll(Equipment.contains((int[])nArray5) ? 1 : 0)) break block29;
                                                                                        int[] nArray6 = new int[llIllIlll[0]];
                                                                                        nArray6[q.llIllIlll[3]] = llIllIlll[102];
                                                                                        if (!q.lIlllIIIlllI(Equipment.contains((int[])nArray6) ? 1 : 0)) break block27;
                                                                                    }
                                                                                    int[] nArray = new int[llIllIlll[0]];
                                                                                    nArray[q.llIllIlll[3]] = llIllIlll[103];
                                                                                    if (q.lIlllIIIlllI(Equipment.contains((int[])nArray) ? 1 : 0)) {
                                                                                        int[] nArray7 = new int[llIllIlll[0]];
                                                                                        nArray7[q.llIllIlll[3]] = llIllIlll[92];
                                                                                        if (q.lIlllIIIlllI(Equipment.contains((int[])nArray7) ? 1 : 0)) {
                                                                                            int[] nArray8 = new int[llIllIlll[0]];
                                                                                            nArray8[q.llIllIlll[3]] = llIllIlll[104];
                                                                                            if (q.lIlllIIIlllI(Equipment.contains((int[])nArray8) ? 1 : 0)) {
                                                                                                int[] nArray9 = new int[llIllIlll[0]];
                                                                                                nArray9[q.llIllIlll[3]] = llIllIlll[105];
                                                                                                if (q.lIlllIIIlllI(Equipment.contains((int[])nArray9) ? 1 : 0)) {
                                                                                                    n5 = llIllIlll[0];
                                                                                                    0;
                                                                                                    if (((0x1C ^ 0x4E) & ~(0x7B ^ 0x29)) != 1) return n5 != 0;
                                                                                                    return ((0x1D ^ 0x34) & ~(0x10 ^ 0x39)) != 0;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                n5 = llIllIlll[3];
                                                                                return n5 != 0;
                                                                            }
                                                                            if (!q.lIlllIIlIIIl(Skills.getLevel((Skill)Skill.RANGED), llIllIlll[74]) || !q.lIlllIIlIIII(Skills.getLevel((Skill)Skill.RANGED), llIllIlll[84])) break block30;
                                                                            int[] nArray = new int[llIllIlll[0]];
                                                                            nArray[q.llIllIlll[3]] = llIllIlll[106];
                                                                            if (!q.lIlllIIIlllI(Equipment.contains((int[])nArray) ? 1 : 0)) break block31;
                                                                            int[] nArray10 = new int[llIllIlll[0]];
                                                                            nArray10[q.llIllIlll[3]] = llIllIlll[107];
                                                                            if (!q.lIlllIIIlllI(Equipment.contains((int[])nArray10) ? 1 : 0)) break block31;
                                                                            int[] nArray11 = new int[llIllIlll[0]];
                                                                            nArray11[q.llIllIlll[3]] = llIllIlll[98];
                                                                            if (!q.lIlllIIIllll(Equipment.contains((int[])nArray11) ? 1 : 0)) break block32;
                                                                            int[] nArray12 = new int[llIllIlll[0]];
                                                                            nArray12[q.llIllIlll[3]] = llIllIlll[99];
                                                                            if (!q.lIlllIIIlllI(Equipment.contains((int[])nArray12) ? 1 : 0)) break block31;
                                                                        }
                                                                        int[] nArray = new int[llIllIlll[0]];
                                                                        nArray[q.llIllIlll[3]] = llIllIlll[100];
                                                                        if (!q.lIlllIIIlllI(Equipment.contains((int[])nArray) ? 1 : 0)) break block31;
                                                                        int[] nArray13 = new int[llIllIlll[0]];
                                                                        nArray13[q.llIllIlll[3]] = llIllIlll[101];
                                                                        if (!q.lIlllIIIllll(Equipment.contains((int[])nArray13) ? 1 : 0)) break block33;
                                                                        int[] nArray14 = new int[llIllIlll[0]];
                                                                        nArray14[q.llIllIlll[3]] = llIllIlll[102];
                                                                        if (!q.lIlllIIIlllI(Equipment.contains((int[])nArray14) ? 1 : 0)) break block31;
                                                                    }
                                                                    int[] nArray = new int[llIllIlll[0]];
                                                                    nArray[q.llIllIlll[3]] = llIllIlll[103];
                                                                    if (q.lIlllIIIlllI(Equipment.contains((int[])nArray) ? 1 : 0)) {
                                                                        int[] nArray15 = new int[llIllIlll[0]];
                                                                        nArray15[q.llIllIlll[3]] = llIllIlll[92];
                                                                        if (q.lIlllIIIlllI(Equipment.contains((int[])nArray15) ? 1 : 0)) {
                                                                            int[] nArray16 = new int[llIllIlll[0]];
                                                                            nArray16[q.llIllIlll[3]] = llIllIlll[104];
                                                                            if (q.lIlllIIIlllI(Equipment.contains((int[])nArray16) ? 1 : 0)) {
                                                                                int[] nArray17 = new int[llIllIlll[0]];
                                                                                nArray17[q.llIllIlll[3]] = llIllIlll[105];
                                                                                if (q.lIlllIIIlllI(Equipment.contains((int[])nArray17) ? 1 : 0)) {
                                                                                    n4 = llIllIlll[0];
                                                                                    0;
                                                                                    if (null == null) return n4 != 0;
                                                                                    return ((0x6B ^ 7 ^ (0x5A ^ 5)) & (0xE5 ^ 0x93 ^ (0x71 ^ 0x34) ^ -1)) != 0;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                n4 = llIllIlll[3];
                                                                return n4 != 0;
                                                            }
                                                            if (!q.lIlllIIlIIIl(Skills.getLevel((Skill)Skill.RANGED), llIllIlll[84])) break block25;
                                                            int[] nArray = new int[llIllIlll[0]];
                                                            nArray[q.llIllIlll[3]] = llIllIlll[108];
                                                            if (!q.lIlllIIIlllI(Equipment.contains((int[])nArray) ? 1 : 0)) break block34;
                                                            int[] nArray18 = new int[llIllIlll[0]];
                                                            nArray18[q.llIllIlll[3]] = llIllIlll[109];
                                                            if (!q.lIlllIIIlllI(Equipment.contains((int[])nArray18) ? 1 : 0)) break block34;
                                                            int[] nArray19 = new int[llIllIlll[0]];
                                                            nArray19[q.llIllIlll[3]] = llIllIlll[98];
                                                            if (!q.lIlllIIIllll(Equipment.contains((int[])nArray19) ? 1 : 0)) break block35;
                                                            int[] nArray20 = new int[llIllIlll[0]];
                                                            nArray20[q.llIllIlll[3]] = llIllIlll[99];
                                                            if (!q.lIlllIIIlllI(Equipment.contains((int[])nArray20) ? 1 : 0)) break block34;
                                                        }
                                                        int[] nArray = new int[llIllIlll[0]];
                                                        nArray[q.llIllIlll[3]] = llIllIlll[100];
                                                        if (!q.lIlllIIIlllI(Equipment.contains((int[])nArray) ? 1 : 0)) break block34;
                                                        int[] nArray21 = new int[llIllIlll[0]];
                                                        nArray21[q.llIllIlll[3]] = llIllIlll[101];
                                                        if (!q.lIlllIIIllll(Equipment.contains((int[])nArray21) ? 1 : 0)) break block36;
                                                        int[] nArray22 = new int[llIllIlll[0]];
                                                        nArray22[q.llIllIlll[3]] = llIllIlll[102];
                                                        if (!q.lIlllIIIlllI(Equipment.contains((int[])nArray22) ? 1 : 0)) break block34;
                                                    }
                                                    int[] nArray = new int[llIllIlll[0]];
                                                    nArray[q.llIllIlll[3]] = llIllIlll[103];
                                                    if (q.lIlllIIIlllI(Equipment.contains((int[])nArray) ? 1 : 0)) {
                                                        int[] nArray23 = new int[llIllIlll[0]];
                                                        nArray23[q.llIllIlll[3]] = llIllIlll[92];
                                                        if (q.lIlllIIIlllI(Equipment.contains((int[])nArray23) ? 1 : 0)) {
                                                            int[] nArray24 = new int[llIllIlll[0]];
                                                            nArray24[q.llIllIlll[3]] = llIllIlll[104];
                                                            if (q.lIlllIIIlllI(Equipment.contains((int[])nArray24) ? 1 : 0)) {
                                                                int[] nArray25 = new int[llIllIlll[0]];
                                                                nArray25[q.llIllIlll[3]] = llIllIlll[105];
                                                                if (q.lIlllIIIlllI(Equipment.contains((int[])nArray25) ? 1 : 0)) {
                                                                    n3 = llIllIlll[0];
                                                                    0;
                                                                    if (null == null) return n3 != 0;
                                                                    return ((0x94 ^ 0x80) & ~(0xA8 ^ 0xBC)) != 0;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                n3 = llIllIlll[3];
                                                return n3 != 0;
                                            }
                                            if (!q.lIlllIIIlllI(lIIIlIIIIllllI.equalsIgnoreCase(llIllIIll[llIllIlll[110]]) ? 1 : 0)) return llIllIlll[3];
                                            int[] nArray = new int[llIllIlll[0]];
                                            nArray[q.llIllIlll[3]] = llIllIlll[111];
                                            if (!q.lIlllIIIllll(Equipment.contains((int[])nArray) ? 1 : 0)) break block37;
                                            int[] nArray26 = new int[llIllIlll[0]];
                                            nArray26[q.llIllIlll[3]] = llIllIlll[111];
                                            if (!q.lIlllIIIlllI(Inventory.contains((int[])nArray26) ? 1 : 0)) break block38;
                                        }
                                        int[] nArray = new int[llIllIlll[0]];
                                        nArray[q.llIllIlll[3]] = llIllIlll[112];
                                        if (!q.lIlllIIIllll(Equipment.contains((int[])nArray) ? 1 : 0)) break block39;
                                        int[] nArray27 = new int[llIllIlll[0]];
                                        nArray27[q.llIllIlll[3]] = llIllIlll[112];
                                        if (!q.lIlllIIIlllI(Inventory.contains((int[])nArray27) ? 1 : 0)) break block38;
                                    }
                                    int[] nArray = new int[llIllIlll[0]];
                                    nArray[q.llIllIlll[3]] = llIllIlll[113];
                                    if (!q.lIlllIIIllll(Equipment.contains((int[])nArray) ? 1 : 0)) break block40;
                                    int[] nArray28 = new int[llIllIlll[0]];
                                    nArray28[q.llIllIlll[3]] = llIllIlll[113];
                                    if (!q.lIlllIIIlllI(Inventory.contains((int[])nArray28) ? 1 : 0)) break block38;
                                }
                                int[] nArray = new int[llIllIlll[0]];
                                nArray[q.llIllIlll[3]] = llIllIlll[114];
                                if (!q.lIlllIIIllll(Equipment.contains((int[])nArray) ? 1 : 0)) break block41;
                                int[] nArray29 = new int[llIllIlll[0]];
                                nArray29[q.llIllIlll[3]] = llIllIlll[114];
                                if (!q.lIlllIIIlllI(Inventory.contains((int[])nArray29) ? 1 : 0)) break block38;
                            }
                            int[] nArray = new int[llIllIlll[0]];
                            nArray[q.llIllIlll[3]] = llIllIlll[115];
                            if (!q.lIlllIIIllll(Equipment.contains((int[])nArray) ? 1 : 0)) break block42;
                            int[] nArray30 = new int[llIllIlll[0]];
                            nArray30[q.llIllIlll[3]] = llIllIlll[115];
                            if (!q.lIlllIIIlllI(Inventory.contains((int[])nArray30) ? 1 : 0)) break block38;
                        }
                        int[] nArray = new int[llIllIlll[0]];
                        nArray[q.llIllIlll[3]] = llIllIlll[116];
                        if (!q.lIlllIIIllll(Equipment.contains((int[])nArray) ? 1 : 0)) break block43;
                        int[] nArray31 = new int[llIllIlll[0]];
                        nArray31[q.llIllIlll[3]] = llIllIlll[116];
                        if (!q.lIlllIIIlllI(Inventory.contains((int[])nArray31) ? 1 : 0)) break block38;
                    }
                    int[] nArray = new int[llIllIlll[0]];
                    nArray[q.llIllIlll[3]] = llIllIlll[117];
                    if (!q.lIlllIIIllll(Inventory.contains((int[])nArray) ? 1 : 0)) break block44;
                    int[] nArray32 = new int[llIllIlll[0]];
                    nArray32[q.llIllIlll[3]] = llIllIlll[117];
                    if (!q.lIlllIIIlllI(Equipment.contains((int[])nArray32) ? 1 : 0)) break block38;
                }
                int[] nArray = new int[llIllIlll[0]];
                nArray[q.llIllIlll[3]] = llIllIlll[105];
                if (!q.lIlllIIIllll(Inventory.contains((int[])nArray) ? 1 : 0)) break block45;
                int[] nArray33 = new int[llIllIlll[0]];
                nArray33[q.llIllIlll[3]] = llIllIlll[105];
                if (!q.lIlllIIIlllI(Equipment.contains((int[])nArray33) ? 1 : 0)) break block38;
            }
            n2 = llIllIlll[0];
            0;
            if ((0x12 ^ 0x4E ^ (0xFD ^ 0xA4)) > 0) return n2 != 0;
            return ((0xF ^ 0x1A ^ (0xAF ^ 0xB6)) & (0x93 ^ 0x8A ^ (0x4D ^ 0x58) ^ -1)) != 0;
        }
        n2 = llIllIlll[3];
        return n2 != 0;
    }

    private static String lIlllIIIIlll(String lIIIIllllIIlIl, String lIIIIlllIlllll) {
        lIIIIllllIIlIl = new String(Base64.getDecoder().decode(lIIIIllllIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIIIllllIIIll = new StringBuilder();
        char[] lIIIIllllIIIlI = lIIIIlllIlllll.toCharArray();
        int lIIIIllllIIIIl = llIllIlll[3];
        char[] lIIIIlllIllIll = lIIIIllllIIlIl.toCharArray();
        int lIIIIlllIllIlI = lIIIIlllIllIll.length;
        int lIIIIlllIllIIl = llIllIlll[3];
        while (q.lIlllIIlIIII(lIIIIlllIllIIl, lIIIIlllIllIlI)) {
            char lIIIIllllIIllI = lIIIIlllIllIll[lIIIIlllIllIIl];
            lIIIIllllIIIll.append((char)(lIIIIllllIIllI ^ lIIIIllllIIIlI[lIIIIllllIIIIl % lIIIIllllIIIlI.length]));
            0;
            ++lIIIIllllIIIIl;
            ++lIIIIlllIllIIl;
            0;
            if (-(0xBA ^ 0x83 ^ (0 ^ 0x3D)) <= 0) continue;
            return null;
        }
        return String.valueOf(lIIIIllllIIIll);
    }

    private static String lIlllIIIlIII(String lIIIlIIIIIIIlI, String lIIIIlllllllll) {
        try {
            SecretKeySpec lIIIlIIIIIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIIIlllllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIIlIIIIIIlII = Cipher.getInstance("Blowfish");
            lIIIlIIIIIIlII.init(llIllIlll[4], lIIIlIIIIIIlIl);
            return new String(lIIIlIIIIIIlII.doFinal(Base64.getDecoder().decode(lIIIlIIIIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIlIIIIIIIll) {
            lIIIlIIIIIIIll.printStackTrace();
            return null;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        int[] nArray = new int[llIllIlll[0]];
        nArray[q.llIllIlll[3]] = llIllIlll[146];
        if (q.lIlllIIIlllI(Bank.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[llIllIlll[0]];
            nArray2[q.llIllIlll[3]] = llIllIlll[151];
            if (q.lIlllIIIlllI(Bank.contains((int[])nArray2) ? 1 : 0)) {
                int[] nArray3 = new int[llIllIlll[0]];
                nArray3[q.llIllIlll[3]] = llIllIlll[152];
                if (q.lIlllIIIlllI(Bank.contains((int[])nArray3) ? 1 : 0)) {
                    int[] nArray4 = new int[llIllIlll[0]];
                    nArray4[q.llIllIlll[3]] = llIllIlll[153];
                    if (q.lIlllIIIlllI(Bank.contains((int[])nArray4) ? 1 : 0) && q.lIlllIIIlllI(Bank.contains(item -> item.getName().contains(llIllIIll[llIllIlll[198]])) ? 1 : 0)) {
                        n2 = llIllIlll[0];
                        0;
                        if ((0x17 ^ 0x13) != 2) return n2 != 0;
                        return ((0x46 ^ 0x52) & ~(0x3A ^ 0x2E)) != 0;
                    }
                }
            }
        }
        n2 = llIllIlll[3];
        return n2 != 0;
    }

    private static boolean lIlllIIlIlIl(Object object) {
        return object == null;
    }

    private static boolean lIlllIIlIIIl(int n2, int n3) {
        return n2 >= n3;
    }
}

