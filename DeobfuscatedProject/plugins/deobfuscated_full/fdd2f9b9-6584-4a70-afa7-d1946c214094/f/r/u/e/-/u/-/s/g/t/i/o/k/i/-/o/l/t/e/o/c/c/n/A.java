/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Actor
 *  net.runelite.api.NPC
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.input.Keyboard
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 */
package f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n;

import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.D;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.G;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.U;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.a;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.b;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.d;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.e;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.f;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.g;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.i;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.v;
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
import net.runelite.api.Actor;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;

public class A
implements G {
    private static final /* synthetic */ WorldPoint hm;
    private static final /* synthetic */ int hA;
    public static final /* synthetic */ WorldArea gN;
    private static final /* synthetic */ int hH;
    private static final /* synthetic */ WorldPoint hh;
    public static /* synthetic */ List<d> bv;
    private static final /* synthetic */ WorldArea hv;
    private static final /* synthetic */ int gT;
    private static final /* synthetic */ int hD;
    private static final /* synthetic */ int hB;
    private static final /* synthetic */ int he;
    private static final /* synthetic */ int hG;
    private static final /* synthetic */ WorldPoint hs;
    static /* synthetic */ String hK;
    private static final /* synthetic */ WorldPoint hi;
    private static /* synthetic */ int[] hL;
    private static final /* synthetic */ WorldPoint hl;
    public static final /* synthetic */ WorldPoint gJ;
    public static final /* synthetic */ WorldPoint gI;
    private static final /* synthetic */ WorldPoint hk;
    private static /* synthetic */ String[] lIIlIlIlII;
    private static final /* synthetic */ WorldPoint hr;
    private static final /* synthetic */ WorldArea hw;
    public static final /* synthetic */ WorldArea gL;
    public static final /* synthetic */ WorldPoint gH;
    private static final /* synthetic */ int hc;
    private static final /* synthetic */ int gY;
    static /* synthetic */ boolean cl;
    private static final /* synthetic */ int hE;
    public static final /* synthetic */ WorldArea gM;
    public static final /* synthetic */ WorldArea gK;
    private static final /* synthetic */ int gZ;
    private static final /* synthetic */ WorldPoint hp;
    static /* synthetic */ String[] gz;
    private static final /* synthetic */ int hb;
    private static final /* synthetic */ int gW;
    private static final /* synthetic */ WorldPoint hf;
    private static final /* synthetic */ WorldPoint hj;
    private static final /* synthetic */ int ha;
    private static final /* synthetic */ WorldPoint hq;
    public static /* synthetic */ int hI;
    private static final /* synthetic */ WorldPoint hn;
    private static /* synthetic */ int[] lIIlIllIII;
    public static final /* synthetic */ WorldArea gO;
    public static /* synthetic */ int hJ;
    static /* synthetic */ int ck;
    private static final /* synthetic */ WorldPoint ho;
    public static final /* synthetic */ WorldArea gQ;
    private static final /* synthetic */ int hC;
    private static final /* synthetic */ int gX;
    private static final /* synthetic */ int gV;
    private static final /* synthetic */ int hd;
    public static /* synthetic */ boolean bt;
    private static final /* synthetic */ int gU;
    private static final /* synthetic */ WorldPoint ht;
    private static final /* synthetic */ WorldPoint hg;
    private static final /* synthetic */ int hy;
    public static final /* synthetic */ WorldArea gP;
    private static final /* synthetic */ int gS;
    public static final /* synthetic */ WorldArea gR;
    private static final /* synthetic */ WorldArea hx;
    private static final /* synthetic */ WorldPoint hu;
    private static final /* synthetic */ int hF;
    private static final /* synthetic */ int hz;

    private static boolean lllllllllIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String llllllIlllIl(String var5, String var11) {
        var5 = new String(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var3 = new StringBuilder();
        char[] var13 = var11.toCharArray();
        int var20 = lIIlIllIII[4];
        char[] var18 = var5.toCharArray();
        int var9 = var18.length;
        int var10 = lIIlIllIII[4];
        while (A.lllllllllIIl(var10, var9)) {
            char var2 = var18[var10];
            var3.append((char)(var2 ^ var13[var20 % var13.length]));
            0;
            ++var20;
            ++var10;
            0;
            if (-1 < 1) continue;
            return null;
        }
        return String.valueOf(var3);
    }

    private static boolean llllllllllII(int n2) {
        return n2 == 0;
    }

    private static void lllllllllIII() {
        lIIlIllIII = new int[175];
        A.lIIlIllIII[0] = (0x41 ^ 0x29) + (0x15 ^ 0x53) - (0xA4 ^ 0x9A) + (7 ^ 0x37);
        A.lIIlIllIII[1] = 2;
        A.lIIlIllIII[2] = (0xDB ^ 0x98) + (155 + 82 - 130 + 79) - (0x93 ^ 0xA6) + (0x23 ^ 0x39);
        A.lIIlIllIII[3] = 1;
        A.lIIlIllIII[4] = (65 + 101 - 86 + 47 ^ (0x57 ^ 0x67)) & (0x6A ^ 0x52 ^ (0xF7 ^ 0x80) ^ -1);
        A.lIIlIllIII[5] = -(0xFFFFDD67 & 0x3FDD) & (0xFFFFFF7F & 0x1FEF);
        A.lIIlIllIII[6] = 0xFFFF9EAD & 0x637F;
        A.lIIlIllIII[7] = 0xFFFFB3FE & 0x4E2F;
        A.lIIlIllIII[8] = 0xFFFF9BFF & 0x657B;
        A.lIIlIllIII[9] = -(0xFFFFFEBB & 0x5177) & (0xFFFFFFFF & 0x57F3);
        A.lIIlIllIII[10] = 0xFFFFDFFF & 0x3F49;
        A.lIIlIllIII[11] = 101 + 21 - 29 + 57;
        A.lIIlIllIII[12] = 3;
        A.lIIlIllIII[13] = 0x88 ^ 0x8D;
        A.lIIlIllIII[14] = 1 ^ (0x9A ^ 0x9D);
        A.lIIlIllIII[15] = 0x2F ^ 0x2B;
        A.lIIlIllIII[16] = 21 + 125 - 86 + 183 ^ 44 + 55 - -55 + 9;
        A.lIIlIllIII[17] = -(0xFFFF9AF3 & 0x751F) & (0xFFFF9BFB & 0x7D7F);
        A.lIIlIllIII[18] = 0xF ^ 8;
        A.lIIlIllIII[19] = 0xFFFF9F73 & 0x6BBF;
        A.lIIlIllIII[20] = 0x6D ^ 0x65;
        A.lIIlIllIII[21] = 0x52 ^ 0x27 ^ (0xBA ^ 0xC6);
        A.lIIlIllIII[22] = 0x22 ^ 0x7D ^ (0x49 ^ 0x1C);
        A.lIIlIllIII[23] = 194 + 191 - 281 + 125;
        A.lIIlIllIII[24] = 164 + 6 - 24 + 32 ^ 77 + 156 - 192 + 144;
        A.lIIlIllIII[25] = 0x59 ^ 0x5E ^ (0x2D ^ 0x26);
        A.lIIlIllIII[26] = 0xB1 ^ 0x83 ^ (0x79 ^ 0x46);
        A.lIIlIllIII[27] = 0xF ^ 0x1F ^ (0x6E ^ 0x70);
        A.lIIlIllIII[28] = 0xD ^ 2;
        A.lIIlIllIII[29] = 0xA8 ^ 0xB8;
        A.lIIlIllIII[30] = 0xD9 ^ 0xB3 ^ (0xD4 ^ 0xAF);
        A.lIIlIllIII[31] = 141 + 166 - 166 + 27 ^ 164 + 181 - 261 + 102;
        A.lIIlIllIII[32] = 0x2B ^ 0 ^ (0x3C ^ 4);
        A.lIIlIllIII[33] = 0xB1 ^ 0xA5;
        A.lIIlIllIII[34] = 0x22 ^ 0x37;
        A.lIIlIllIII[35] = 0x8F ^ 0x99;
        A.lIIlIllIII[36] = 0xBA ^ 0xAD;
        A.lIIlIllIII[37] = 0xDA ^ 0xC2;
        A.lIIlIllIII[38] = 0x36 ^ 0x1F ^ (0x98 ^ 0xA8);
        A.lIIlIllIII[39] = 0xFFFFFFFE & 0x96B;
        A.lIIlIllIII[40] = 0xEF ^ 0xAB ^ (0xF2 ^ 0xAC);
        A.lIIlIllIII[41] = 160 + 112 - 161 + 79 ^ 161 + 8 - 75 + 71;
        A.lIIlIllIII[42] = 0x96 ^ 0x8A;
        A.lIIlIllIII[43] = 2 ^ 0x1F;
        A.lIIlIllIII[44] = 0x7E ^ 0x60;
        A.lIIlIllIII[45] = 120 + 122 - 232 + 121 ^ 70 + 29 - 55 + 112;
        A.lIIlIllIII[46] = 64 + 135 - 80 + 48 ^ 77 + 16 - 17 + 59;
        A.lIIlIllIII[47] = 114 + 137 - 181 + 102 ^ 4 + 87 - -14 + 36;
        A.lIIlIllIII[48] = 1 ^ (0x33 ^ 0x10);
        A.lIIlIllIII[49] = 0x38 ^ 0x1B;
        A.lIIlIllIII[50] = 9 + 36 - -23 + 115 ^ 99 + 118 - 120 + 50;
        A.lIIlIllIII[51] = 0xAC ^ 0x89;
        A.lIIlIllIII[52] = 0x37 ^ 0x11;
        A.lIIlIllIII[53] = 0x17 ^ 0x30;
        A.lIIlIllIII[54] = 91 + 115 - 158 + 79 ^ (0x26 ^ 0x71);
        A.lIIlIllIII[55] = 9 + 159 - 10 + 18 ^ 36 + 61 - -25 + 31;
        A.lIIlIllIII[56] = 124 + 25 - 55 + 41 ^ 10 + 21 - -121 + 21;
        A.lIIlIllIII[57] = 24 + 69 - -33 + 18 ^ 54 + 55 - -70 + 8;
        A.lIIlIllIII[58] = -(0xFFFFDEE3 & 0x713F) & (0xFFFFDBF7 & 0x7F7F);
        A.lIIlIllIII[59] = -(0xFFFFFF7D & 0x40B6) & (0xFFFFCDBF & 0x7FF7);
        A.lIIlIllIII[60] = 0xFFFF997F & 0x6FEB;
        A.lIIlIllIII[61] = 124 + 34 - 85 + 54 ^ (0xC ^ 0x5F);
        A.lIIlIllIII[62] = -(0xFFFFFCEB & 0x131D) & (0xFFFFFBFD & 0x1F7F);
        A.lIIlIllIII[63] = 0x1D ^ 0x30;
        A.lIIlIllIII[64] = 0xE9 ^ 0xC7;
        A.lIIlIllIII[65] = 0x13 ^ 0x3C;
        A.lIIlIllIII[66] = 14 + 35 - 26 + 161 ^ 44 + 75 - 18 + 35;
        A.lIIlIllIII[67] = 0xCB ^ 0xC4 ^ (0xE ^ 0x30);
        A.lIIlIllIII[68] = 33 + 42 - -40 + 15 ^ 21 + 151 - 85 + 89;
        A.lIIlIllIII[69] = 0xA0 ^ 0x93;
        A.lIIlIllIII[70] = 0x3A ^ 9 ^ (0x1B ^ 0x1C);
        A.lIIlIllIII[71] = 0x3E ^ 0x75 ^ (0xE5 ^ 0x9B);
        A.lIIlIllIII[72] = 0x8E ^ 0xB8;
        A.lIIlIllIII[73] = 35 + 101 - 132 + 240 ^ 25 + 44 - -68 + 58;
        A.lIIlIllIII[74] = 94 + 60 - 40 + 68 ^ 62 + 133 - 192 + 139;
        A.lIIlIllIII[75] = 71 + 217 - 96 + 59 ^ 114 + 112 - 132 + 100;
        A.lIIlIllIII[76] = 0xF4 ^ 0xA8 ^ (0x4F ^ 0x29);
        A.lIIlIllIII[77] = 0x52 ^ 0x4E ^ (0x9F ^ 0xB8);
        A.lIIlIllIII[78] = 0x2E ^ 0x41 ^ (0x66 ^ 0x35);
        A.lIIlIllIII[79] = 9 ^ 0x34;
        A.lIIlIllIII[80] = 0xB7 ^ 0x89;
        A.lIIlIllIII[81] = 0x8B ^ 0xB4;
        A.lIIlIllIII[82] = 0xFFFFFFBB & 0xFDF;
        A.lIIlIllIII[83] = 203 + 102 - 136 + 72 ^ 159 + 52 - 207 + 173;
        A.lIIlIllIII[84] = 241 + 160 - 294 + 137 ^ 170 + 114 - 239 + 136;
        A.lIIlIllIII[85] = 0xC5 ^ 0x87;
        A.lIIlIllIII[86] = 103 + 204 - 132 + 41 ^ 108 + 139 - 163 + 71;
        A.lIIlIllIII[87] = 0x24 ^ 5 ^ (0x19 ^ 0x7C);
        A.lIIlIllIII[88] = 0x17 ^ 0x63 ^ (0x60 ^ 0x51);
        A.lIIlIllIII[89] = 3 ^ (0x4F ^ 0xA);
        A.lIIlIllIII[90] = 0x55 ^ 0x12;
        A.lIIlIllIII[91] = 0x28 ^ 0x60;
        A.lIIlIllIII[92] = 4 ^ 0x4D;
        A.lIIlIllIII[93] = -(0xFFFFB10F & 0x7EFB) & (0xFFFFBFEB & 0x7B7F);
        A.lIIlIllIII[94] = 0xFFFF8D9F & 0x7FEA;
        A.lIIlIllIII[95] = 0xDF ^ 0x95;
        A.lIIlIllIII[96] = 166 + 174 - 220 + 83 ^ 47 + 44 - 83 + 120;
        A.lIIlIllIII[97] = 0x37 ^ 0x79 ^ 2;
        A.lIIlIllIII[98] = 0x27 ^ 0x6A;
        A.lIIlIllIII[99] = 0xFFFF938F & 0x7FF8;
        A.lIIlIllIII[100] = 91 + 129 - 33 + 12 ^ 100 + 18 - 44 + 63;
        A.lIIlIllIII[101] = -(0xFFFFFD4F & 0x3EB3) & (0xFFFFBFFB & 0x7FEE);
        A.lIIlIllIII[102] = 0x4E ^ 1;
        A.lIIlIllIII[103] = 0x82 ^ 0xAF ^ (0xE0 ^ 0x9C);
        A.lIIlIllIII[104] = 0x4A ^ 0x18;
        A.lIIlIllIII[105] = 0xFFFF9F5F & 0x7FE7;
        A.lIIlIllIII[106] = 0xE3 ^ 0xB5 ^ (0 ^ 5);
        A.lIIlIllIII[107] = 0xFFFFF9FF & 0x7F4;
        A.lIIlIllIII[108] = 0xFFFFB1FD & 0x7F53;
        A.lIIlIllIII[109] = 205 + 134 - 192 + 68 ^ 27 + 105 - 58 + 105;
        A.lIIlIllIII[110] = 0xFFFFF3B0 & 0xDDF;
        A.lIIlIllIII[111] = -(0xFFFFDD1D & 0x66E3) & (0xFFFFFFF7 & 0x57FE);
        A.lIIlIllIII[112] = 0xFFFFEEEC & 0x3FDF;
        A.lIIlIllIII[113] = -(0xFFFFFF37 & 0x19CB) & (0xFFFFFB7B & 0x5FEE);
        A.lIIlIllIII[114] = -(0xFFFFDB7D & 0x7493) & (0xFFFFD77D & 0x7FFE);
        A.lIIlIllIII[115] = -(0xFFFFB9A7 & 0x667F) & (0xFFFFF7F7 & 0x2FFE);
        A.lIIlIllIII[116] = 0x7A ^ 0x2E;
        A.lIIlIllIII[117] = 0x1D ^ 2 ^ (0x27 ^ 0x6D);
        A.lIIlIllIII[118] = -(0xFFFFA2FB & 0x7F3D) & (0xFFFFB7FF & 0x6FFA);
        A.lIIlIllIII[119] = 0xFFFFD7C6 & 0x2DFD;
        A.lIIlIllIII[120] = 0xFFFFF5DA & 0xFE5;
        A.lIIlIllIII[121] = 0xFFFFB2BB & 0x4F6E;
        A.lIIlIllIII[122] = -(0xFFFFD6C1 & 0x397F) & (0xFFFF9DFF & 0x77FE);
        A.lIIlIllIII[123] = -(0xFFFFF4FF & 0x3B91) & (0xFFFFBBF5 & 0x7FFE);
        A.lIIlIllIII[124] = -(0xFFFFEE46 & 0x53BD) & (0xFFFFFFBB & 0x4FCF);
        A.lIIlIllIII[125] = 0xFFFF8FF7 & 0x7B6F;
        A.lIIlIllIII[126] = 0xFFFF8FD6 & 0x7B7D;
        A.lIIlIllIII[127] = -(0xFFFFF275 & 0x7DAF) & (0xFFFFFDB7 & 0x7FEF);
        A.lIIlIllIII[128] = 0xFFFF8B7B & 0x7FE7;
        A.lIIlIllIII[129] = -(0xFFFFBDEF & 0x729D) & (0xFFFFBBFE & Short.MAX_VALUE);
        A.lIIlIllIII[130] = 0xFFFFBDBB & 0x4FC6;
        A.lIIlIllIII[131] = 0xFFFFEB7F & 0x1FD6;
        A.lIIlIllIII[132] = 0xFFFFAF95 & 0x5DEF;
        A.lIIlIllIII[133] = -(0xFFFFB95B & 0x76BF) & (0xFFFFBF7F & 0x7BFF);
        A.lIIlIllIII[134] = 0xFFFF9B62 & 0x6FFD;
        A.lIIlIllIII[135] = 0xFFFFFDD7 & 0xFAF;
        A.lIIlIllIII[136] = -(0xFFFFDED3 & 0x61AD) & (0xFFFFFFDF & 0x4BF7);
        A.lIIlIllIII[137] = -(0xFFFFFD1F & 0x52EB) & (0xFFFFDB7F & 0x7FFB);
        A.lIIlIllIII[138] = -(0xFFFFDEDF & 0x336C) & (0xFFFFFE7B & 0x1FEF);
        A.lIIlIllIII[139] = 0xFFFFCC7B & 0x3FDF;
        A.lIIlIllIII[140] = 0xFFFFAF7F & 0x5BEF;
        A.lIIlIllIII[141] = -(0xFFFFBDAF & 0x72D1) & (0xFFFFFFFF & 0x3DFF);
        A.lIIlIllIII[142] = 0xFFFF9B7F & 0x6FF8;
        A.lIIlIllIII[143] = 0xFFFF8F96 & 0x7BFF;
        A.lIIlIllIII[144] = 0xFFFFEFB7 & 0x1D7D;
        A.lIIlIllIII[145] = -(0xFFFFF7AD & 0x6C7F) & (0xFFFFFF7F & 0x6FFF);
        A.lIIlIllIII[146] = -(0xFFFFDB75 & 0x76EB) & (0xFFFFDFF5 & 0x7FFB);
        A.lIIlIllIII[147] = 0xFFFF8BDD & 0x7F7B;
        A.lIIlIllIII[148] = -(0xFFFFB325 & 0x6EDB) & (0xFFFFBFD3 & 0x6FBF);
        A.lIIlIllIII[149] = -(0xFFFFF5F3 & 0x3AAD) & (0xFFFFBBFA & Short.MAX_VALUE);
        A.lIIlIllIII[150] = -(0xFFFFCD4F & 0x7BBB) & (0xFFFFFFDE & 0x6FBF);
        A.lIIlIllIII[151] = -(0xFFFFFF59 & 0x58EF) & (0xFFFFFFDF & 0x7EFA);
        A.lIIlIllIII[152] = 0xFFFFFEF9 & 0x2797;
        A.lIIlIllIII[153] = 0xFFFFCDC9 & 0x3FBF;
        A.lIIlIllIII[154] = -(0xFFFFD6F7 & 0x7D29) & (0xFFFFFFFF & 0x5F7F);
        A.lIIlIllIII[155] = 0xFFFFDFAD & 0x2DDF;
        A.lIIlIllIII[156] = -(0xFFFFFDB9 & 0x2247) & (0xFFFFEBDB & 0x3F7F);
        A.lIIlIllIII[157] = 0xFFFFCDFD & 0x3F96;
        A.lIIlIllIII[158] = 0xFFFFFFDE & 0x26AF;
        A.lIIlIllIII[159] = 0xFFFFABFD & 0x5F5F;
        A.lIIlIllIII[160] = -(0xFFFFFCFD & 0x5B4B) & (0xFFFFFEFF & 0x7FDD);
        A.lIIlIllIII[161] = 0xFFFFBD63 & 0x7E9F;
        A.lIIlIllIII[162] = -(0xFFFFEADD & 0x3FE7) & (0xFFFFFFC7 & 0x3EFF);
        A.lIIlIllIII[163] = 145 + 97 - 2 + 15 ^ 111 + 123 - 135 + 70;
        A.lIIlIllIII[164] = 0xFB ^ 0xAC;
        A.lIIlIllIII[165] = 62 + 219 - 226 + 194 ^ 137 + 125 - 104 + 3;
        A.lIIlIllIII[166] = 0xD7 ^ 0xB8 ^ (0x45 ^ 0x73);
        A.lIIlIllIII[167] = 0x78 ^ 0x22;
        A.lIIlIllIII[168] = 0x23 ^ 0x78;
        A.lIIlIllIII[169] = 0x54 ^ 0x48 ^ (0x79 ^ 0x39);
        A.lIIlIllIII[170] = -(0xFFFFF827 & 0x77DB) & (0xFFFFFFBF & 0x7FDE);
        A.lIIlIllIII[171] = -(0xFFFFF873 & 0x37CF) & (0xFFFFFFFF & 0x3FDF);
        A.lIIlIllIII[172] = -(0x42 ^ 3) & (0xFFFFFFFF & 0xFDE);
        A.lIIlIllIII[173] = 0xFFFFAFDF & 0x5FBF;
        A.lIIlIllIII[174] = 0x65 ^ 0x41 ^ (0xA ^ 0x73);
    }

    static {
        A.lllllllllIII();
        A.lllllllIlIlI();
        ha = lIIlIllIII[82];
        gV = lIIlIllIII[3];
        hA = lIIlIllIII[118];
        hG = lIIlIllIII[8];
        gY = lIIlIllIII[14];
        hE = lIIlIllIII[6];
        hB = lIIlIllIII[119];
        hH = lIIlIllIII[9];
        hz = lIIlIllIII[120];
        hc = lIIlIllIII[60];
        hF = lIIlIllIII[121];
        gW = lIIlIllIII[1];
        hb = lIIlIllIII[17];
        he = lIIlIllIII[19];
        hy = lIIlIllIII[122];
        hD = lIIlIllIII[5];
        hd = lIIlIllIII[39];
        gX = lIIlIllIII[12];
        gT = lIIlIllIII[1];
        hC = lIIlIllIII[7];
        gS = lIIlIllIII[0];
        gU = lIIlIllIII[2];
        gZ = lIIlIllIII[18];
        gH = new WorldPoint(lIIlIllIII[123], lIIlIllIII[59], lIIlIllIII[4]);
        gI = new WorldPoint(lIIlIllIII[62], lIIlIllIII[124], lIIlIllIII[4]);
        gJ = new WorldPoint(lIIlIllIII[125], lIIlIllIII[94], lIIlIllIII[4]);
        gK = new WorldArea(lIIlIllIII[126], lIIlIllIII[127], lIIlIllIII[31], lIIlIllIII[14], lIIlIllIII[4]);
        gL = new WorldArea(lIIlIllIII[128], lIIlIllIII[127], lIIlIllIII[30], lIIlIllIII[14], lIIlIllIII[4]);
        gM = new WorldArea(lIIlIllIII[129], lIIlIllIII[130], lIIlIllIII[15], lIIlIllIII[22], lIIlIllIII[4]);
        gN = new WorldArea(lIIlIllIII[131], lIIlIllIII[132], lIIlIllIII[24], lIIlIllIII[15], lIIlIllIII[4]);
        gO = new WorldArea(lIIlIllIII[133], lIIlIllIII[132], lIIlIllIII[18], lIIlIllIII[13], lIIlIllIII[4]);
        gP = new WorldArea(lIIlIllIII[134], lIIlIllIII[135], lIIlIllIII[21], lIIlIllIII[18], lIIlIllIII[4]);
        gQ = new WorldArea(lIIlIllIII[136], lIIlIllIII[132], lIIlIllIII[15], lIIlIllIII[15], lIIlIllIII[4]);
        gR = new WorldArea(lIIlIllIII[137], lIIlIllIII[132], lIIlIllIII[15], lIIlIllIII[13], lIIlIllIII[4]);
        hf = new WorldPoint(lIIlIllIII[138], lIIlIllIII[139], lIIlIllIII[1]);
        hg = new WorldPoint(lIIlIllIII[140], lIIlIllIII[141], lIIlIllIII[4]);
        hh = new WorldPoint(lIIlIllIII[142], lIIlIllIII[127], lIIlIllIII[4]);
        hi = new WorldPoint(lIIlIllIII[143], lIIlIllIII[144], lIIlIllIII[4]);
        hj = new WorldPoint(lIIlIllIII[145], lIIlIllIII[146], lIIlIllIII[4]);
        hk = new WorldPoint(lIIlIllIII[131], lIIlIllIII[94], lIIlIllIII[4]);
        hl = new WorldPoint(lIIlIllIII[147], lIIlIllIII[148], lIIlIllIII[4]);
        hm = new WorldPoint(lIIlIllIII[149], lIIlIllIII[150], lIIlIllIII[4]);
        hn = new WorldPoint(lIIlIllIII[145], lIIlIllIII[151], lIIlIllIII[4]);
        ho = new WorldPoint(lIIlIllIII[131], lIIlIllIII[151], lIIlIllIII[4]);
        hp = new WorldPoint(lIIlIllIII[131], lIIlIllIII[152], lIIlIllIII[4]);
        hq = new WorldPoint(lIIlIllIII[136], lIIlIllIII[151], lIIlIllIII[4]);
        hr = new WorldPoint(lIIlIllIII[136], lIIlIllIII[152], lIIlIllIII[4]);
        hs = new WorldPoint(lIIlIllIII[58], lIIlIllIII[153], lIIlIllIII[4]);
        ht = new WorldPoint(lIIlIllIII[62], lIIlIllIII[135], lIIlIllIII[4]);
        hu = new WorldPoint(lIIlIllIII[154], lIIlIllIII[155], lIIlIllIII[4]);
        hv = new WorldArea(new WorldPoint(lIIlIllIII[156], lIIlIllIII[157], lIIlIllIII[4]), new WorldPoint(lIIlIllIII[58], lIIlIllIII[94], lIIlIllIII[4]));
        hw = new WorldArea(new WorldPoint(lIIlIllIII[145], lIIlIllIII[158], lIIlIllIII[4]), new WorldPoint(lIIlIllIII[159], lIIlIllIII[160], lIIlIllIII[4]));
        hx = new WorldArea(lIIlIllIII[62], lIIlIllIII[130], lIIlIllIII[14], lIIlIllIII[22], lIIlIllIII[4]);
        bv = new ArrayList<d>();
        hI = lIIlIllIII[161];
        hJ = lIIlIllIII[162];
        hK = lIIlIlIlII[lIIlIllIII[163]];
        String[] stringArray = new String[lIIlIllIII[14]];
        stringArray[A.lIIlIllIII[4]] = lIIlIlIlII[lIIlIllIII[164]];
        stringArray[A.lIIlIllIII[3]] = lIIlIlIlII[lIIlIllIII[165]];
        stringArray[A.lIIlIllIII[1]] = lIIlIlIlII[lIIlIllIII[166]];
        stringArray[A.lIIlIllIII[12]] = lIIlIlIlII[lIIlIllIII[167]];
        stringArray[A.lIIlIllIII[15]] = lIIlIlIlII[lIIlIllIII[168]];
        stringArray[A.lIIlIllIII[13]] = lIIlIlIlII[lIIlIllIII[169]];
        gz = stringArray;
        int[] nArray = new int[lIIlIllIII[15]];
        nArray[A.lIIlIllIII[4]] = lIIlIllIII[170];
        nArray[A.lIIlIllIII[3]] = lIIlIllIII[171];
        nArray[A.lIIlIllIII[1]] = lIIlIllIII[172];
        nArray[A.lIIlIllIII[12]] = lIIlIllIII[173];
        hL = nArray;
    }

    @Override
    public String U() {
        return lIIlIlIlII[lIIlIllIII[116]];
    }

    public static void bu() {
        TileObject llllllllllllllllllllllIlllIIllII2;
        block91: {
            block93: {
                block92: {
                    block89: {
                        block90: {
                            Widget var8;
                            if (A.lllllllllIIl(e.j(lIIlIllIII[0]), lIIlIllIII[1])) {
                                try {
                                    D.bK();
                                    0;
                                }
                                catch (Exception llllllllllllllllllllllIlllIIllII2) {
                                    llllllllllllllllllllllIlllIIllII2.printStackTrace();
                                }
                                if (-1 >= 0) {
                                    return;
                                }
                            }
                            if (A.lllllllllIlI(e.j(lIIlIllIII[0]), lIIlIllIII[1]) && A.lllllllllIIl(e.j(lIIlIllIII[2]), lIIlIllIII[3])) {
                                block88: {
                                    if (A.lllllllllIll(bt ? 1 : 0)) {
                                        AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[4]];
                                        b.a(bv);
                                        if (A.lllllllllIIl(bv.size(), lIIlIllIII[3])) {
                                            System.out.println(lIIlIlIlII[lIIlIllIII[3]]);
                                            bt = lIIlIllIII[4];
                                        }
                                    }
                                    do {
                                        if (A.lllllllllIll(v.aX() ? 1 : 0)) {
                                            int[] nArray = new int[lIIlIllIII[3]];
                                            nArray[A.lIIlIllIII[4]] = lIIlIllIII[5];
                                            if (A.lllllllllIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                int[] nArray2 = new int[lIIlIllIII[3]];
                                                nArray2[A.lIIlIllIII[4]] = lIIlIllIII[6];
                                                if (A.lllllllllIll(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                                                    int[] nArray3 = new int[lIIlIllIII[3]];
                                                    nArray3[A.lIIlIllIII[4]] = lIIlIllIII[7];
                                                    if (A.lllllllllIll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                                                        int[] nArray4 = new int[lIIlIllIII[3]];
                                                        nArray4[A.lIIlIllIII[4]] = lIIlIllIII[8];
                                                        if (A.lllllllllIll(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                                                            int[] nArray5 = new int[lIIlIllIII[3]];
                                                            nArray5[A.lIIlIllIII[4]] = lIIlIllIII[9];
                                                            if (A.lllllllllIll(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                                                                int[] nArray6 = new int[lIIlIllIII[3]];
                                                                nArray6[A.lIIlIllIII[4]] = lIIlIllIII[10];
                                                                if (!A.llllllllllII(Inventory.contains((int[])nArray6) ? 1 : 0)) break block88;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        if (!A.llllllllllII(AccBuilderRogues.d ? 1 : 0)) break block88;
                                        A.bw();
                                        Time.sleepTicks((int)lIIlIllIII[3]);
                                        0;
                                        0;
                                    } while (null == null);
                                    return;
                                }
                                if (A.llllllllllII(bt ? 1 : 0)) {
                                    if (A.llllllllllIl(Players.getLocal().getWorldLocation().distanceTo(hg), lIIlIllIII[11])) {
                                        int[] nArray = new int[lIIlIllIII[3]];
                                        nArray[A.lIIlIllIII[4]] = lIIlIllIII[10];
                                        if (A.lllllllllIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                            AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[1]];
                                            int[] nArray7 = new int[lIIlIllIII[3]];
                                            nArray7[A.lIIlIllIII[4]] = lIIlIllIII[10];
                                            Inventory.getFirst((int[])nArray7).interact(lIIlIlIlII[lIIlIllIII[12]]);
                                            Time.sleepTicks((int)lIIlIllIII[13]);
                                            0;
                                        }
                                    }
                                    if (A.lllllllllIIl(Players.getLocal().getWorldLocation().distanceTo(hg), lIIlIllIII[11]) && A.llllllllllIl(Players.getLocal().getWorldLocation().distanceTo(hg), lIIlIllIII[14])) {
                                        AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[15]];
                                        if (A.lllllllllIll(Inventory.contains((int[])f.aV) ? 1 : 0) && A.lllllllllIIl(Movement.getRunEnergy(), lIIlIllIII[16])) {
                                            Inventory.getFirst((int[])f.aV).interact(lIIlIlIlII[lIIlIllIII[13]]);
                                            Time.sleepTicks((int)lIIlIllIII[3]);
                                            0;
                                        }
                                        Movement.walkTo((WorldPoint)hg);
                                        0;
                                        Time.sleepTicks((int)lIIlIllIII[3]);
                                        0;
                                    }
                                    if (A.lllllllllllI(Players.getLocal().getWorldLocation().distanceTo(hg), lIIlIllIII[14])) {
                                        g.a(lIIlIlIlII[lIIlIllIII[14]], gz);
                                    }
                                }
                            }
                            if (A.lllllllllIlI(e.j(lIIlIllIII[0]), lIIlIllIII[1]) && A.lllllllllIlI(e.j(lIIlIllIII[2]), lIIlIllIII[3])) {
                                if (A.llllllllllIl(Players.getLocal().getWorldLocation().distanceTo(hj), lIIlIllIII[15]) && A.llllllllllII(hw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    int[] nArray = new int[lIIlIllIII[3]];
                                    nArray[A.lIIlIllIII[4]] = lIIlIllIII[17];
                                    if (A.llllllllllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                        AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[18]];
                                        Movement.walkTo((WorldPoint)hj);
                                        0;
                                        Time.sleepTicks((int)lIIlIllIII[3]);
                                        0;
                                    }
                                }
                                if (A.lllllllllllI(Players.getLocal().getWorldLocation().distanceTo(hj), lIIlIllIII[15]) && A.llllllllllII(Players.getLocal().isMoving() ? 1 : 0)) {
                                    int[] nArray = new int[lIIlIllIII[3]];
                                    nArray[A.lIIlIllIII[4]] = lIIlIllIII[17];
                                    if (A.llllllllllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                        int[] nArray8 = new int[lIIlIllIII[3]];
                                        nArray8[A.lIIlIllIII[4]] = lIIlIllIII[19];
                                        llllllllllllllllllllllIlllIIllII2 = TileObjects.getNearest((int[])nArray8);
                                        if (A.lllllllllIll(Inventory.isFull() ? 1 : 0)) {
                                            int[] nArray9 = new int[lIIlIllIII[3]];
                                            nArray9[A.lIIlIllIII[4]] = lIIlIllIII[8];
                                            Inventory.getFirst((int[])nArray9).interact(lIIlIlIlII[lIIlIllIII[20]]);
                                            Time.sleepTicks((int)lIIlIllIII[3]);
                                            0;
                                        }
                                        if (A.llllllllllII(Inventory.isFull() ? 1 : 0)) {
                                            if (A.llllllllllll(llllllllllllllllllllllIlllIIllII2) && A.llllllllllII(Dialog.isOpen() ? 1 : 0)) {
                                                AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[21]];
                                                llllllllllllllllllllllIlllIIllII2.interact(lIIlIlIlII[lIIlIllIII[22]]);
                                                Dialog.continueSpace();
                                            }
                                            if (A.llllllllllll(var8 = Widgets.get((int)lIIlIllIII[23], (int)lIIlIllIII[3]))) {
                                                var8.interact(lIIlIlIlII[lIIlIllIII[24]]);
                                                var8.interact(lIIlIllIII[4]);
                                                var8.interact(lIIlIlIlII[lIIlIllIII[25]]);
                                                Keyboard.type((String)lIIlIlIlII[lIIlIllIII[26]]);
                                            }
                                        }
                                    }
                                }
                                if (A.lllllllllllI(Players.getLocal().getWorldLocation().distanceTo(hj), lIIlIllIII[15])) {
                                    int[] nArray = new int[lIIlIllIII[3]];
                                    nArray[A.lIIlIllIII[4]] = lIIlIllIII[17];
                                    if (A.lllllllllIll(Inventory.contains((int[])nArray) ? 1 : 0) && A.llllllllllII(hv.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[27]];
                                        Movement.walkTo((WorldPoint)hn);
                                        0;
                                        Time.sleepTicks((int)lIIlIllIII[3]);
                                        0;
                                    }
                                }
                                if (A.lllllllllIll(hw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[28]];
                                    if (A.llllllllllIl(Players.getLocal().getWorldLocation().distanceTo(hn), lIIlIllIII[3])) {
                                        Movement.walkTo((WorldPoint)hn);
                                        0;
                                        Time.sleepTicks((int)lIIlIllIII[3]);
                                        0;
                                    }
                                    if (A.lllllllllllI(Players.getLocal().getWorldLocation().distanceTo(hn), lIIlIllIII[3])) {
                                        String[] stringArray = new String[lIIlIllIII[3]];
                                        stringArray[A.lIIlIllIII[4]] = lIIlIlIlII[lIIlIllIII[29]];
                                        llllllllllllllllllllllIlllIIllII2 = TileObjects.getNearest((String[])stringArray);
                                        AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[30]];
                                        if (A.lllllllllIll(Inventory.isFull() ? 1 : 0)) {
                                            int[] nArray = new int[lIIlIllIII[3]];
                                            nArray[A.lIIlIllIII[4]] = lIIlIllIII[8];
                                            Inventory.getFirst((int[])nArray).interact(lIIlIlIlII[lIIlIllIII[31]]);
                                            Time.sleepTicks((int)lIIlIllIII[3]);
                                            0;
                                        }
                                        if (A.llllllllllll(llllllllllllllllllllllIlllIIllII2)) {
                                            String[] stringArray2 = new String[lIIlIllIII[3]];
                                            stringArray2[A.lIIlIllIII[4]] = lIIlIlIlII[lIIlIllIII[32]];
                                            if (A.lllllllllIll(llllllllllllllllllllllIlllIIllII2.hasAction(stringArray2) ? 1 : 0)) {
                                                llllllllllllllllllllllIlllIIllII2.interact(lIIlIlIlII[lIIlIllIII[33]]);
                                                Time.sleepTicks((int)lIIlIllIII[1]);
                                                0;
                                            }
                                            String[] stringArray3 = new String[lIIlIllIII[3]];
                                            stringArray3[A.lIIlIllIII[4]] = lIIlIlIlII[lIIlIllIII[34]];
                                            if (A.lllllllllIll(llllllllllllllllllllllIlllIIllII2.hasAction(stringArray3) ? 1 : 0)) {
                                                llllllllllllllllllllllIlllIIllII2.interact(lIIlIlIlII[lIIlIllIII[35]]);
                                                Time.sleepTicks((int)lIIlIllIII[1]);
                                                0;
                                                var8 = Widgets.get((int)lIIlIllIII[23], (int)lIIlIllIII[3]);
                                                if (A.llllllllllll(var8)) {
                                                    var8.interact(lIIlIlIlII[lIIlIllIII[36]]);
                                                    var8.interact(lIIlIllIII[4]);
                                                    var8.interact(lIIlIlIlII[lIIlIllIII[37]]);
                                                    Keyboard.type((String)lIIlIlIlII[lIIlIllIII[38]]);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (A.lllllllllIlI(e.j(lIIlIllIII[0]), lIIlIllIII[1]) && A.lllllllllIlI(e.j(lIIlIllIII[2]), lIIlIllIII[1])) {
                                ck = lIIlIllIII[4];
                                if (A.lllllllllllI(Players.getLocal().getWorldLocation().distanceTo(hg), lIIlIllIII[22])) {
                                    while (A.llllllllllIl(Players.getLocal().getWorldLocation().distanceTo(hj), lIIlIllIII[1]) && A.llllllllllII(AccBuilderRogues.d ? 1 : 0)) {
                                        Movement.walkTo((WorldPoint)hj);
                                        0;
                                        Time.sleepTicks((int)lIIlIllIII[3]);
                                        0;
                                        0;
                                        if (((0x53 ^ 0x56 ^ (0x27 ^ 0x65)) & (7 + 82 - 28 + 151 ^ 95 + 24 - 57 + 85 ^ -1)) >= ((0x34 ^ 0x65 ^ (0x11 ^ 0xB)) & (0x55 ^ 0x2C ^ (0x70 ^ 0x42) ^ -1))) continue;
                                        return;
                                    }
                                }
                                int[] nArray = new int[lIIlIllIII[3]];
                                nArray[A.lIIlIllIII[4]] = lIIlIllIII[39];
                                if (A.llllllllllII(Inventory.contains((int[])nArray) ? 1 : 0) && A.lllllllllIll(hw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[40]];
                                    if (A.llllllllllIl(Players.getLocal().getWorldLocation().distanceTo(hn), lIIlIllIII[3])) {
                                        Movement.walkTo((WorldPoint)hn);
                                        0;
                                        Time.sleepTicks((int)lIIlIllIII[3]);
                                        0;
                                    }
                                    if (A.lllllllllllI(Players.getLocal().getWorldLocation().distanceTo(hn), lIIlIllIII[3])) {
                                        String[] stringArray = new String[lIIlIllIII[3]];
                                        stringArray[A.lIIlIllIII[4]] = lIIlIlIlII[lIIlIllIII[41]];
                                        llllllllllllllllllllllIlllIIllII2 = TileObjects.getNearest((String[])stringArray);
                                        AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[42]];
                                        if (A.llllllllllll(llllllllllllllllllllllIlllIIllII2)) {
                                            String[] stringArray4 = new String[lIIlIllIII[3]];
                                            stringArray4[A.lIIlIllIII[4]] = lIIlIlIlII[lIIlIllIII[43]];
                                            if (A.lllllllllIll(llllllllllllllllllllllIlllIIllII2.hasAction(stringArray4) ? 1 : 0)) {
                                                llllllllllllllllllllllIlllIIllII2.interact(lIIlIlIlII[lIIlIllIII[44]]);
                                                Time.sleepTicks((int)lIIlIllIII[1]);
                                                0;
                                            }
                                            String[] stringArray5 = new String[lIIlIllIII[3]];
                                            stringArray5[A.lIIlIllIII[4]] = lIIlIlIlII[lIIlIllIII[45]];
                                            if (A.lllllllllIll(llllllllllllllllllllllIlllIIllII2.hasAction(stringArray5) ? 1 : 0)) {
                                                llllllllllllllllllllllIlllIIllII2.interact(lIIlIlIlII[lIIlIllIII[46]]);
                                                Time.sleepTicks((int)lIIlIllIII[1]);
                                                0;
                                                var8 = Widgets.get((int)lIIlIllIII[23], (int)lIIlIllIII[3]);
                                                if (A.llllllllllll(var8)) {
                                                    var8.interact(lIIlIlIlII[lIIlIllIII[47]]);
                                                    var8.interact(lIIlIllIII[4]);
                                                    var8.interact(lIIlIlIlII[lIIlIllIII[48]]);
                                                    Keyboard.type((String)lIIlIlIlII[lIIlIllIII[49]]);
                                                }
                                            }
                                        }
                                    }
                                }
                                int[] nArray10 = new int[lIIlIllIII[3]];
                                nArray10[A.lIIlIllIII[4]] = lIIlIllIII[39];
                                if (A.lllllllllIll(Inventory.contains((int[])nArray10) ? 1 : 0) && A.llllllllllIl(Players.getLocal().getWorldLocation().distanceTo(hk), lIIlIllIII[3])) {
                                    AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[50]];
                                    Movement.walkTo((WorldPoint)hk);
                                    0;
                                    Time.sleepTicks((int)lIIlIllIII[3]);
                                    0;
                                }
                                if (A.lllllllllllI(Players.getLocal().getWorldLocation().distanceTo(hk), lIIlIllIII[1])) {
                                    String[] stringArray = new String[lIIlIllIII[3]];
                                    stringArray[A.lIIlIllIII[4]] = lIIlIlIlII[lIIlIllIII[51]];
                                    llllllllllllllllllllllIlllIIllII2 = TileObjects.getNearest((String[])stringArray);
                                    String[] stringArray6 = new String[lIIlIllIII[3]];
                                    stringArray6[A.lIIlIllIII[4]] = lIIlIlIlII[lIIlIllIII[52]];
                                    var8 = NPCs.getNearest((String[])stringArray6);
                                    if (A.llllllllllll(llllllllllllllllllllllIlllIIllII2) && A.lIIIIIIIIIIII(var8)) {
                                        AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[53]];
                                        String[] stringArray7 = new String[lIIlIllIII[3]];
                                        stringArray7[A.lIIlIllIII[4]] = lIIlIlIlII[lIIlIllIII[54]];
                                        if (A.lllllllllIll(Inventory.contains((String[])stringArray7) ? 1 : 0)) {
                                            String[] stringArray8 = new String[lIIlIllIII[3]];
                                            stringArray8[A.lIIlIllIII[4]] = lIIlIlIlII[lIIlIllIII[55]];
                                            Inventory.getFirst((String[])stringArray8).useOn(llllllllllllllllllllllIlllIIllII2);
                                        }
                                        Time.sleepTicks((int)lIIlIllIII[3]);
                                        0;
                                    }
                                    if (A.llllllllllll(var8)) {
                                        AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[56]];
                                        int[] nArray11 = new int[lIIlIllIII[3]];
                                        nArray11[A.lIIlIllIII[4]] = lIIlIllIII[39];
                                        if (A.lllllllllIll(Inventory.contains((int[])nArray11) ? 1 : 0)) {
                                            int[] nArray12 = new int[lIIlIllIII[3]];
                                            nArray12[A.lIIlIllIII[4]] = lIIlIllIII[39];
                                            Inventory.getFirst((int[])nArray12).useOn((Actor)var8);
                                        }
                                        Time.sleepTicks((int)lIIlIllIII[3]);
                                        0;
                                    }
                                }
                            }
                            if (A.lllllllllIll(hv.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && A.lllllllllIlI(e.j(lIIlIllIII[2]), lIIlIllIII[12])) {
                                AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[57]];
                                Movement.walkTo((WorldPoint)new WorldPoint(lIIlIllIII[58], lIIlIllIII[59], lIIlIllIII[4]));
                                0;
                                Time.sleepTicks((int)lIIlIllIII[3]);
                                0;
                            }
                            if (!A.llllllllllII(hv.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !A.lllllllllIlI(e.j(lIIlIllIII[2]), lIIlIllIII[12])) break block89;
                            int[] nArray = new int[lIIlIllIII[3]];
                            nArray[A.lIIlIllIII[4]] = lIIlIllIII[60];
                            if (!A.lllllllllIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block90;
                            int[] nArray13 = new int[lIIlIllIII[3]];
                            nArray13[A.lIIlIllIII[4]] = lIIlIllIII[60];
                            if (!A.lllllllllIll(Inventory.contains((int[])nArray13) ? 1 : 0) || !A.llllllllllIl(Players.getLocal().getWorldLocation().distanceTo(ht), lIIlIllIII[12])) break block89;
                        }
                        AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[61]];
                        if (A.lIIIIIIIIIIIl(Movement.getRunEnergy(), lIIlIllIII[33])) {
                            A.bv();
                        }
                    }
                    if (A.lllllllllllI(Players.getLocal().getWorldLocation().distanceTo(ht), lIIlIllIII[12])) {
                        int[] nArray = new int[lIIlIllIII[3]];
                        nArray[A.lIIlIllIII[4]] = lIIlIllIII[60];
                        if (A.lllllllllIll(Inventory.contains((int[])nArray) ? 1 : 0) && A.lllllllllIlI(Players.getLocal().getWorldLocation().getX(), lIIlIllIII[62])) {
                            String[] stringArray = new String[lIIlIllIII[3]];
                            stringArray[A.lIIlIllIII[4]] = lIIlIlIlII[lIIlIllIII[63]];
                            llllllllllllllllllllllIlllIIllII2 = TileObjects.getNearest((String[])stringArray);
                            if (A.llllllllllll(llllllllllllllllllllllIlllIIllII2)) {
                                AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[64]];
                                int[] nArray14 = new int[lIIlIllIII[3]];
                                nArray14[A.lIIlIllIII[4]] = lIIlIllIII[60];
                                if (A.lllllllllIll(Inventory.contains((int[])nArray14) ? 1 : 0)) {
                                    int[] nArray15 = new int[lIIlIllIII[3]];
                                    nArray15[A.lIIlIllIII[4]] = lIIlIllIII[60];
                                    Inventory.getFirst((int[])nArray15).useOn(llllllllllllllllllllllIlllIIllII2);
                                    Time.sleepTicks((int)lIIlIllIII[1]);
                                    0;
                                }
                            }
                        }
                    }
                    if (!A.lllllllllIll(hx.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block91;
                    int[] nArray = new int[lIIlIllIII[3]];
                    nArray[A.lIIlIllIII[4]] = lIIlIllIII[60];
                    if (!A.lllllllllIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block91;
                    if (A.llllllllllII(Players.getLocal().getWorldLocation().equals((Object)hh) ? 1 : 0)) {
                        AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[65]];
                        Movement.walkTo((WorldPoint)hh);
                        0;
                    }
                    if (A.lllllllllllI(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), lIIlIllIII[13])) {
                        int[] nArray16 = new int[lIIlIllIII[3]];
                        nArray16[A.lIIlIllIII[4]] = lIIlIllIII[8];
                        if (A.lllllllllIll(Inventory.contains((int[])nArray16) ? 1 : 0)) {
                            int[] nArray17 = new int[lIIlIllIII[3]];
                            nArray17[A.lIIlIllIII[4]] = lIIlIllIII[8];
                            Inventory.getFirst((int[])nArray17).interact(lIIlIlIlII[lIIlIllIII[66]]);
                        }
                    }
                    if (!A.lllllllllIll(Players.getLocal().getWorldLocation().equals((Object)hh) ? 1 : 0) || !A.llllllllllll(llllllllllllllllllllllIlllIIllII2 = NPCs.getNearest((int[])hL)) || !A.llllllllllII(llllllllllllllllllllllIlllIIllII2.isDead() ? 1 : 0)) break block91;
                    AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[67]];
                    if (A.lllllllllIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlIllIII[21])) {
                        Magic.cast((Spell)SpellBook.Standard.WATER_STRIKE, (NPC)llllllllllllllllllllllIlllIIllII2);
                        Time.sleepTicks((int)lIIlIllIII[3]);
                        0;
                    }
                    if (A.lllllllllIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlIllIII[26]) && !A.lllllllllIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlIllIII[21])) break block92;
                    if (!A.lIIIIIIIIIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlIllIII[21])) break block93;
                    int[] nArray18 = new int[lIIlIllIII[3]];
                    nArray18[A.lIIlIllIII[4]] = lIIlIllIII[6];
                    if (!A.lllllllllIll(Inventory.contains((int[])nArray18) ? 1 : 0)) break block93;
                    String[] stringArray = new String[lIIlIllIII[3]];
                    stringArray[A.lIIlIllIII[4]] = lIIlIlIlII[lIIlIllIII[68]];
                    if (!A.llllllllllII(Inventory.contains((String[])stringArray) ? 1 : 0)) break block93;
                }
                Magic.cast((Spell)SpellBook.Standard.EARTH_STRIKE, (NPC)llllllllllllllllllllllIlllIIllII2);
                Time.sleepTicks((int)lIIlIllIII[3]);
                0;
            }
            if (A.lIIIIIIIIIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlIllIII[26])) {
                String[] stringArray = new String[lIIlIllIII[3]];
                stringArray[A.lIIlIllIII[4]] = lIIlIlIlII[lIIlIllIII[69]];
                if (A.lllllllllIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    Magic.cast((Spell)SpellBook.Standard.FIRE_STRIKE, (NPC)llllllllllllllllllllllIlllIIllII2);
                    Time.sleepTicks((int)lIIlIllIII[3]);
                    0;
                }
            }
        }
        if (A.lllllllllIlI(e.j(lIIlIllIII[2]), lIIlIllIII[14])) {
            String[] stringArray = new String[lIIlIllIII[3]];
            stringArray[A.lIIlIllIII[4]] = lIIlIlIlII[lIIlIllIII[70]];
            if (A.llllllllllII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray9 = new String[lIIlIllIII[3]];
                stringArray9[A.lIIlIllIII[4]] = lIIlIlIlII[lIIlIllIII[71]];
                llllllllllllllllllllllIlllIIllII2 = TileItems.getNearest((String[])stringArray9);
                if (A.llllllllllll(llllllllllllllllllllllIlllIIllII2)) {
                    AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[72]];
                    llllllllllllllllllllllIlllIIllII2.interact(lIIlIlIlII[lIIlIllIII[73]]);
                    Time.sleepTicks((int)lIIlIllIII[1]);
                    0;
                }
            }
        }
        if (A.lllllllllIlI(e.j(lIIlIllIII[2]), lIIlIllIII[14])) {
            String[] stringArray = new String[lIIlIllIII[3]];
            stringArray[A.lIIlIllIII[4]] = lIIlIlIlII[lIIlIllIII[74]];
            if (A.lllllllllIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                if (A.lllllllllIll(hx.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    int[] nArray = new int[lIIlIllIII[3]];
                    nArray[A.lIIlIllIII[4]] = lIIlIllIII[10];
                    if (A.lllllllllIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[75]];
                        int[] nArray19 = new int[lIIlIllIII[3]];
                        nArray19[A.lIIlIllIII[4]] = lIIlIllIII[10];
                        Inventory.getFirst((int[])nArray19).interact(lIIlIlIlII[lIIlIllIII[76]]);
                        Time.sleepTicks((int)lIIlIllIII[13]);
                        0;
                    }
                }
                if (A.llllllllllII(hx.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && A.llllllllllIl(Players.getLocal().getWorldLocation().distanceTo(hg), lIIlIllIII[15])) {
                    AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[77]];
                    Movement.walkTo((WorldPoint)hg);
                    0;
                    Time.sleepTicks((int)lIIlIllIII[3]);
                    0;
                }
                if (A.lllllllllllI(Players.getLocal().getWorldLocation().distanceTo(hg), lIIlIllIII[13])) {
                    AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[78]];
                    if (A.lllllllllIIl(ck, lIIlIllIII[3])) {
                        U.jO += lIIlIllIII[3];
                        U.o(AccBuilderRogues.m);
                        ck += lIIlIllIII[3];
                        U.jO = lIIlIllIII[4];
                        cl = lIIlIllIII[4];
                    }
                    g.a(lIIlIlIlII[lIIlIllIII[79]], gz);
                }
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private static void bw() {
        block30: {
            block34: {
                block32: {
                    block33: {
                        block31: {
                            void var4;
                            BankLocation bankLocation = BankLocation.getNearest();
                            if (A.llllllllllll(bankLocation) && A.llllllllllII(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[97]];
                                a.a(bankLocation);
                            }
                            if (!A.llllllllllll(var4) || !A.lllllllllIll(var4.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block30;
                            if (A.llllllllllII(Bank.isOpen() ? 1 : 0)) {
                                AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[98]];
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)lIIlIllIII[99]);
                                0;
                            }
                            if (!A.lllllllllIll(Bank.isOpen() ? 1 : 0)) break block30;
                            AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[100]];
                            if (A.lIIIIIIIIIIlI(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lIIlIllIII[12]);
                                0;
                            }
                            if (A.lIIIIIIIIIIlI(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)lIIlIllIII[1]);
                                0;
                            }
                            while (A.llllllllllII(v.aX() ? 1 : 0) && A.llllllllllII(AccBuilderRogues.d ? 1 : 0)) {
                                v.aV();
                                Time.sleepTicks((int)lIIlIllIII[3]);
                                0;
                                0;
                                if (-2 < 0) continue;
                                return;
                            }
                            int[] nArray = new int[lIIlIllIII[3]];
                            nArray[A.lIIlIllIII[4]] = lIIlIllIII[7];
                            if (A.lllllllllIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray2 = new int[lIIlIllIII[3]];
                                nArray2[A.lIIlIllIII[4]] = lIIlIllIII[7];
                                if (A.lllllllllIIl(Bank.getFirst((int[])nArray2).getQuantity(), lIIlIllIII[101])) {
                                    A.af();
                                    System.out.println(lIIlIlIlII[lIIlIllIII[102]]);
                                    bt = lIIlIllIII[3];
                                    return;
                                }
                            }
                            int[] nArray3 = new int[lIIlIllIII[3]];
                            nArray3[A.lIIlIllIII[4]] = lIIlIllIII[6];
                            if (A.lllllllllIll(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                int[] nArray4 = new int[lIIlIllIII[3]];
                                nArray4[A.lIIlIllIII[4]] = lIIlIllIII[6];
                                if (A.lllllllllIIl(Bank.getFirst((int[])nArray4).getQuantity(), lIIlIllIII[101])) {
                                    A.af();
                                    System.out.println(lIIlIlIlII[lIIlIllIII[16]]);
                                    bt = lIIlIllIII[3];
                                    return;
                                }
                            }
                            int[] nArray5 = new int[lIIlIllIII[3]];
                            nArray5[A.lIIlIllIII[4]] = lIIlIllIII[5];
                            if (A.lllllllllIll(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                int[] nArray6 = new int[lIIlIllIII[3]];
                                nArray6[A.lIIlIllIII[4]] = lIIlIllIII[5];
                                if (A.lllllllllIIl(Bank.getFirst((int[])nArray6).getQuantity(), lIIlIllIII[101])) {
                                    A.af();
                                    System.out.println(lIIlIlIlII[lIIlIllIII[103]]);
                                    bt = lIIlIllIII[3];
                                    return;
                                }
                            }
                            int[] nArray7 = new int[lIIlIllIII[3]];
                            nArray7[A.lIIlIllIII[4]] = lIIlIllIII[10];
                            if (!A.lllllllllIll(Bank.contains((int[])nArray7) ? 1 : 0)) break block31;
                            int[] nArray8 = new int[lIIlIllIII[3]];
                            nArray8[A.lIIlIllIII[4]] = lIIlIllIII[10];
                            if (!A.lIIIIIIIIIIIl(Bank.getFirst((int[])nArray8).getQuantity(), lIIlIllIII[22])) break block32;
                        }
                        int[] nArray = new int[lIIlIllIII[3]];
                        nArray[A.lIIlIllIII[4]] = lIIlIllIII[9];
                        if (!A.lllllllllIll(Bank.contains((int[])nArray) ? 1 : 0)) break block33;
                        int[] nArray9 = new int[lIIlIllIII[3]];
                        nArray9[A.lIIlIllIII[4]] = lIIlIllIII[9];
                        if (!A.lIIIIIIIIIIIl(Bank.getFirst((int[])nArray9).getQuantity(), lIIlIllIII[13])) break block32;
                    }
                    int[] nArray = new int[lIIlIllIII[3]];
                    nArray[A.lIIlIllIII[4]] = lIIlIllIII[8];
                    if (!A.lllllllllIll(Bank.contains((int[])nArray) ? 1 : 0)) break block34;
                    int[] nArray10 = new int[lIIlIllIII[3]];
                    nArray10[A.lIIlIllIII[4]] = lIIlIllIII[8];
                    if (!A.lllllllllIIl(Bank.getFirst((int[])nArray10).getQuantity(), lIIlIllIII[33])) break block34;
                }
                A.af();
                System.out.println(lIIlIlIlII[lIIlIllIII[104]]);
                bt = lIIlIllIII[3];
                return;
            }
            int[] nArray = new int[lIIlIllIII[18]];
            nArray[A.lIIlIllIII[4]] = lIIlIllIII[105];
            nArray[A.lIIlIllIII[3]] = lIIlIllIII[10];
            nArray[A.lIIlIllIII[1]] = lIIlIllIII[9];
            nArray[A.lIIlIllIII[12]] = lIIlIllIII[8];
            nArray[A.lIIlIllIII[15]] = lIIlIllIII[7];
            nArray[A.lIIlIllIII[13]] = lIIlIllIII[5];
            nArray[A.lIIlIllIII[14]] = lIIlIllIII[6];
            if (A.llllllllllII(e.b(nArray) ? 1 : 0)) {
                A.af();
                System.out.println(lIIlIlIlII[lIIlIllIII[106]]);
                bt = lIIlIllIII[3];
                return;
            }
            if (A.llllllllllII(Bank.isOpen() ? 1 : 0)) {
                a.a();
                Time.sleepTicks((int)lIIlIllIII[15]);
                0;
            }
            int[] nArray11 = new int[lIIlIllIII[3]];
            nArray11[A.lIIlIllIII[4]] = lIIlIllIII[10];
            if (A.lllllllllIll(Bank.contains((int[])nArray11) ? 1 : 0)) {
                int[] nArray12 = new int[lIIlIllIII[3]];
                nArray12[A.lIIlIllIII[4]] = lIIlIllIII[10];
                if (A.lllllllllIIl(Inventory.getCount((int[])nArray12), lIIlIllIII[3])) {
                    Bank.withdraw((int)lIIlIllIII[10], (int)lIIlIllIII[13], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIIlIllIII[3]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lIIlIllIII[3]];
                        nArray[A.lIIlIllIII[4]] = lIIlIllIII[10];
                        if (A.lIIIIIIIIIIlI(Inventory.getCount((int[])nArray))) {
                            bl = lIIlIllIII[3];
                            0;
                            if (((0x55 ^ 0x30 ^ (0x5B ^ 0x78)) & (0x9B ^ 0x86 ^ (0x9C ^ 0xC7) ^ -1)) != 0) {
                                return ((0xBC ^ 0x99 ^ (5 ^ 0x31)) & (0x7D ^ 0xB ^ (6 ^ 0x61) ^ -1)) != 0;
                            }
                        } else {
                            bl = lIIlIllIII[4];
                        }
                        return bl;
                    }, (int)lIIlIllIII[99]);
                    0;
                }
            }
            int[] nArray13 = new int[lIIlIllIII[3]];
            nArray13[A.lIIlIllIII[4]] = lIIlIllIII[9];
            if (A.lllllllllIll(Bank.contains((int[])nArray13) ? 1 : 0)) {
                int[] nArray14 = new int[lIIlIllIII[3]];
                nArray14[A.lIIlIllIII[4]] = lIIlIllIII[9];
                if (A.lllllllllIIl(Inventory.getCount((int[])nArray14), lIIlIllIII[3])) {
                    Bank.withdraw((int)lIIlIllIII[9], (int)lIIlIllIII[15], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIIlIllIII[3]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lIIlIllIII[3]];
                        nArray[A.lIIlIllIII[4]] = lIIlIllIII[9];
                        if (A.lIIIIIIIIIIlI(Inventory.getCount((int[])nArray))) {
                            bl = lIIlIllIII[3];
                            0;
                            if ((0x5F ^ 0x25 ^ (0xCA ^ 0xB4)) < ((0x6A ^ 0x5B ^ 2) & (79 + 135 - 59 + 4 ^ 141 + 38 - 166 + 159 ^ -1))) {
                                return ((0xC6 ^ 0x84 ^ (0xE0 ^ 0xAC)) & (63 + 25 - 44 + 98 ^ 121 + 119 - 186 + 74 ^ -1)) != 0;
                            }
                        } else {
                            bl = lIIlIllIII[4];
                        }
                        return bl;
                    }, (int)lIIlIllIII[99]);
                    0;
                }
            }
            int[] nArray15 = new int[lIIlIllIII[3]];
            nArray15[A.lIIlIllIII[4]] = lIIlIllIII[7];
            if (A.lllllllllIll(Bank.contains((int[])nArray15) ? 1 : 0)) {
                int[] nArray16 = new int[lIIlIllIII[3]];
                nArray16[A.lIIlIllIII[4]] = lIIlIllIII[7];
                if (A.lllllllllIIl(Inventory.getCount((int[])nArray16), lIIlIllIII[3])) {
                    Bank.withdraw((int)lIIlIllIII[7], (int)lIIlIllIII[107], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIIlIllIII[3]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lIIlIllIII[3]];
                        nArray[A.lIIlIllIII[4]] = lIIlIllIII[7];
                        if (A.lIIIIIIIIIIlI(Inventory.getCount((int[])nArray))) {
                            bl = lIIlIllIII[3];
                            0;
                            if (((0x81 ^ 0xC5 ^ (7 ^ 0x65)) & (0xEC ^ 0xC1 ^ (0x27 ^ 0x2C) ^ -1)) < -1) {
                                return ((138 + 76 - 166 + 119 ^ 76 + 12 - -24 + 78) & (0x72 ^ 0x77 ^ (0x45 ^ 0x59) ^ -1)) != 0;
                            }
                        } else {
                            bl = lIIlIllIII[4];
                        }
                        return bl;
                    }, (int)lIIlIllIII[99]);
                    0;
                }
            }
            int[] nArray17 = new int[lIIlIllIII[3]];
            nArray17[A.lIIlIllIII[4]] = lIIlIllIII[5];
            if (A.lllllllllIll(Bank.contains((int[])nArray17) ? 1 : 0)) {
                int[] nArray18 = new int[lIIlIllIII[3]];
                nArray18[A.lIIlIllIII[4]] = lIIlIllIII[5];
                if (A.lllllllllIIl(Inventory.getCount((int[])nArray18), lIIlIllIII[3])) {
                    Bank.withdraw((int)lIIlIllIII[5], (int)lIIlIllIII[107], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIIlIllIII[3]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lIIlIllIII[3]];
                        nArray[A.lIIlIllIII[4]] = lIIlIllIII[5];
                        if (A.lIIIIIIIIIIlI(Inventory.getCount((int[])nArray))) {
                            bl = lIIlIllIII[3];
                            0;
                            if (-2 > 0) {
                                return ((0x17 ^ 0x35 ^ (0x69 ^ 8)) & (79 + 65 - 117 + 178 ^ 50 + 141 - 117 + 68 ^ -1)) != 0;
                            }
                        } else {
                            bl = lIIlIllIII[4];
                        }
                        return bl;
                    }, (int)lIIlIllIII[99]);
                    0;
                }
            }
            int[] nArray19 = new int[lIIlIllIII[3]];
            nArray19[A.lIIlIllIII[4]] = lIIlIllIII[6];
            if (A.lllllllllIll(Bank.contains((int[])nArray19) ? 1 : 0)) {
                int[] nArray20 = new int[lIIlIllIII[3]];
                nArray20[A.lIIlIllIII[4]] = lIIlIllIII[6];
                if (A.lllllllllIIl(Inventory.getCount((int[])nArray20), lIIlIllIII[3])) {
                    Bank.withdraw((int)lIIlIllIII[6], (int)lIIlIllIII[107], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIIlIllIII[3]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lIIlIllIII[3]];
                        nArray[A.lIIlIllIII[4]] = lIIlIllIII[6];
                        if (A.lIIIIIIIIIIlI(Inventory.getCount((int[])nArray))) {
                            bl = lIIlIllIII[3];
                            0;
                            if (-1 > 3) {
                                return false;
                            }
                        } else {
                            bl = lIIlIllIII[4];
                        }
                        return bl;
                    }, (int)lIIlIllIII[99]);
                    0;
                }
            }
            int[] nArray21 = new int[lIIlIllIII[3]];
            nArray21[A.lIIlIllIII[4]] = lIIlIllIII[108];
            if (A.lllllllllIll(Bank.contains((int[])nArray21) ? 1 : 0)) {
                int[] nArray22 = new int[lIIlIllIII[3]];
                nArray22[A.lIIlIllIII[4]] = lIIlIllIII[108];
                if (A.llllllllllII(Inventory.contains((int[])nArray22) ? 1 : 0)) {
                    Bank.withdraw((int)lIIlIllIII[108], (int)lIIlIllIII[3], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIIlIllIII[3]);
                    0;
                    Time.sleepUntil(() -> {
                        int[] nArray = new int[lIIlIllIII[3]];
                        nArray[A.lIIlIllIII[4]] = lIIlIllIII[108];
                        return Inventory.contains((int[])nArray);
                    }, (int)lIIlIllIII[99]);
                    0;
                }
            }
            int[] nArray23 = new int[lIIlIllIII[3]];
            nArray23[A.lIIlIllIII[4]] = lIIlIllIII[8];
            if (A.lllllllllIll(Bank.contains((int[])nArray23) ? 1 : 0)) {
                int[] nArray24 = new int[lIIlIllIII[3]];
                nArray24[A.lIIlIllIII[4]] = lIIlIllIII[8];
                if (A.lllllllllIIl(Inventory.getCount((int[])nArray24), lIIlIllIII[3])) {
                    Bank.withdrawAll((int)lIIlIllIII[8], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIIlIllIII[3]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lIIlIllIII[3]];
                        nArray[A.lIIlIllIII[4]] = lIIlIllIII[8];
                        if (A.lIIIIIIIIIIlI(Inventory.getCount((int[])nArray))) {
                            bl = lIIlIllIII[3];
                            0;
                            if (2 >= (116 + 136 - 169 + 87 ^ 49 + 1 - 36 + 160)) {
                                return (3 & (3 ^ -1)) != 0;
                            }
                        } else {
                            bl = lIIlIllIII[4];
                        }
                        return bl;
                    }, (int)lIIlIllIII[99]);
                    0;
                }
            }
        }
    }

    public static void bv() {
        if (A.lllllllllIll(Inventory.contains((int[])f.aV) ? 1 : 0) && A.lllllllllIIl(Movement.getRunEnergy(), lIIlIllIII[68])) {
            Inventory.getFirst((int[])f.aV).interact(lIIlIlIlII[lIIlIllIII[80]]);
            Time.sleepTicks((int)lIIlIllIII[3]);
            0;
        }
        if (A.llllllllllII(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        if (!A.llllllllllII(hv.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || A.lllllllllllI(Players.getLocal().getWorldLocation().distanceTo(hk), lIIlIllIII[1])) {
            AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[81]];
            Movement.walkTo((WorldPoint)new WorldPoint(lIIlIllIII[58], lIIlIllIII[59], lIIlIllIII[4]));
            0;
            Time.sleepTicks((int)lIIlIllIII[3]);
            0;
        }
        int[] nArray = new int[lIIlIllIII[3]];
        nArray[A.lIIlIllIII[4]] = lIIlIllIII[82];
        NPC var23 = NPCs.getNearest((int[])nArray);
        int[] nArray2 = new int[lIIlIllIII[3]];
        nArray2[A.lIIlIllIII[4]] = lIIlIllIII[60];
        if (A.llllllllllII(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            if (A.lllllllllIll(gK.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && A.llllllllllll(var23) && A.lllllllllIll(gQ.contains(var23.getWorldLocation()) ? 1 : 0)) {
                Time.sleepTicks((int)lIIlIllIII[24]);
                0;
                while (A.llllllllllIl(Players.getLocal().getWorldLocation().distanceTo(gH), lIIlIllIII[3]) && A.llllllllllII(AccBuilderRogues.d ? 1 : 0)) {
                    AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[83]];
                    Movement.walkTo((WorldPoint)gH);
                    0;
                    Time.sleepTicks((int)lIIlIllIII[3]);
                    0;
                    0;
                    if (((0x5D ^ 0x1B) & ~(0x5E ^ 0x18)) == 0) continue;
                    return;
                }
            }
            if (A.lllllllllIll(gL.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && A.llllllllllll(var23) && A.lllllllllIll(gN.contains(var23.getWorldLocation()) ? 1 : 0)) {
                while (A.llllllllllIl(Players.getLocal().getWorldLocation().distanceTo(gI), lIIlIllIII[3]) && A.llllllllllII(AccBuilderRogues.d ? 1 : 0)) {
                    AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[84]];
                    Movement.walkTo((WorldPoint)gI);
                    0;
                    Time.sleepTicks((int)lIIlIllIII[3]);
                    0;
                    0;
                    if (2 == 2) continue;
                    return;
                }
            }
            if (A.lllllllllIll(gM.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && A.llllllllllll(var23) && A.lllllllllIll(gR.contains(var23.getWorldLocation()) ? 1 : 0)) {
                Time.sleepTicks((int)lIIlIllIII[18]);
                0;
                while (A.llllllllllIl(Players.getLocal().getWorldLocation().distanceTo(gJ), lIIlIllIII[3]) && A.llllllllllII(AccBuilderRogues.d ? 1 : 0)) {
                    AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[85]];
                    Movement.walkTo((WorldPoint)gJ);
                    0;
                    Time.sleepTicks((int)lIIlIllIII[3]);
                    0;
                    0;
                    if (((0x6F ^ 0x27) & ~(0x3C ^ 0x74)) == 0) continue;
                    return;
                }
            }
            if (A.lllllllllIll(gP.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && A.llllllllllll(var23) && A.lllllllllIll(gR.contains(var23.getWorldLocation()) ? 1 : 0)) {
                while (A.llllllllllIl(Players.getLocal().getWorldLocation().distanceTo(hu), lIIlIllIII[1]) && A.llllllllllII(AccBuilderRogues.d ? 1 : 0)) {
                    AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[86]];
                    Movement.walkTo((WorldPoint)hu);
                    0;
                    Time.sleepTicks((int)lIIlIllIII[3]);
                    0;
                    0;
                    if (((0x20 ^ 0x68) & ~(0x64 ^ 0x2C)) >= -1) continue;
                    return;
                }
            }
            if (A.lllllllllllI(Players.getLocal().getWorldLocation().distanceTo(hu), lIIlIllIII[12])) {
                AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[87]];
                String[] stringArray = new String[lIIlIllIII[3]];
                stringArray[A.lIIlIllIII[4]] = lIIlIlIlII[lIIlIllIII[88]];
                TileObject var26 = TileObjects.getNearest((String[])stringArray);
                if (A.llllllllllll(var26)) {
                    var26.interact(lIIlIlIlII[lIIlIllIII[89]]);
                    Time.sleepTicks((int)lIIlIllIII[1]);
                    0;
                    Widget var15 = Widgets.get((int)lIIlIllIII[23], (int)lIIlIllIII[3]);
                    if (A.llllllllllll(var15)) {
                        var15.interact(lIIlIlIlII[lIIlIllIII[90]]);
                        var15.interact(lIIlIllIII[4]);
                        var15.interact(lIIlIlIlII[lIIlIllIII[91]]);
                        Keyboard.type((String)lIIlIlIlII[lIIlIllIII[92]]);
                    }
                }
            }
        }
        int[] nArray3 = new int[lIIlIllIII[3]];
        nArray3[A.lIIlIllIII[4]] = lIIlIllIII[60];
        if (A.lllllllllIll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
            if (A.lllllllllllI(Players.getLocal().getWorldLocation().distanceTo(hu), lIIlIllIII[12])) {
                while (A.llllllllllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIlIllIII[93], lIIlIllIII[94], lIIlIllIII[4])), lIIlIllIII[3]) && A.llllllllllII(AccBuilderRogues.d ? 1 : 0)) {
                    AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[95]];
                    Movement.walkTo((WorldPoint)new WorldPoint(lIIlIllIII[93], lIIlIllIII[94], lIIlIllIII[4]));
                    0;
                    Time.sleepTicks((int)lIIlIllIII[3]);
                    0;
                    0;
                    if (1 >= 0) continue;
                    return;
                }
            }
            if (A.lllllllllllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIlIllIII[93], lIIlIllIII[94], lIIlIllIII[4])), lIIlIllIII[1]) && A.llllllllllll(var23) && A.lllllllllIll(gQ.contains(var23.getWorldLocation()) ? 1 : 0)) {
                while (A.llllllllllIl(Players.getLocal().getWorldLocation().distanceTo(gI), lIIlIllIII[3]) && A.llllllllllII(AccBuilderRogues.d ? 1 : 0)) {
                    AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[96]];
                    Movement.walkTo((WorldPoint)gI);
                    0;
                    Time.sleepTicks((int)lIIlIllIII[3]);
                    0;
                    0;
                    if (-(89 + 38 - 57 + 57 ^ (0x4B ^ 0x30)) < 0) continue;
                    return;
                }
            }
        }
    }

    private static boolean lllllllllllI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llllllllllll(Object object) {
        return object != null;
    }

    private static boolean lIIIIIIIIIIII(Object object) {
        return object == null;
    }

    private static boolean lIIIIIIIIIIlI(int n2) {
        return n2 > 0;
    }

    @Override
    public boolean V() {
        boolean bl;
        if (A.lIIIIIIIIIIIl(e.j(lIIlIllIII[2]), lIIlIllIII[18])) {
            bl = lIIlIllIII[3];
            0;
            if (((0x82 ^ 0xB4) & ~(0x8D ^ 0xBB)) != 0) {
                return false;
            }
        } else {
            bl = lIIlIllIII[4];
        }
        return bl;
    }

    private static boolean lIIIIIIIIIIIl(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public boolean S() {
        return lIIlIllIII[4];
    }

    private static boolean llllllllllIl(int n2, int n3) {
        return n2 > n3;
    }

    private static void lllllllIlIlI() {
        lIIlIlIlII = new String[lIIlIllIII[174]];
        A.lIIlIlIlII[A.lIIlIllIII[4]] = A."Buying items";
        A.lIIlIlIlII[A.lIIlIllIII[3]] = A."Finished buying items, switching back to questing";
        A.lIIlIlIlII[A.lIIlIllIII[1]] = A."Breaking tab";
        A.lIIlIlIlII[A.lIIlIllIII[12]] = A."Break";
        A.lIIlIlIlII[A.lIIlIllIII[15]] = A."Nav to start";
        A.lIIlIlIlII[A.lIIlIllIII[13]] = A."Drink";
        A.lIIlIlIlII[A.lIIlIllIII[14]] = A."Boy";
        A.lIIlIlIlII[A.lIIlIllIII[18]] = A."Navigating to outside door";
        A.lIIlIlIlII[A.lIIlIllIII[20]] = A."Drop";
        A.lIIlIlIlII[A.lIIlIllIII[21]] = A."Stealing key";
        A.lIIlIlIlII[A.lIIlIllIII[22]] = A."Look-under";
        A.lIIlIlIlII[A.lIIlIllIII[24]] = A."Continue";
        A.lIIlIlIlII[A.lIIlIllIII[25]] = A."null";
        A.lIIlIlIlII[A.lIIlIllIII[26]] = A." ";
        A.lIIlIlIlII[A.lIIlIllIII[27]] = A."Nav to magnet box";
        A.lIIlIlIlII[A.lIIlIllIII[28]] = A."Nav to magnet box";
        A.lIIlIlIlII[A.lIIlIllIII[29]] = A."Cupboard";
        A.lIIlIlIlII[A.lIIlIllIII[30]] = A."Taking magnet";
        A.lIIlIlIlII[A.lIIlIllIII[31]] = A."Drop";
        A.lIIlIlIlII[A.lIIlIllIII[32]] = A."Open";
        A.lIIlIlIlII[A.lIIlIllIII[33]] = A."Open";
        A.lIIlIlIlII[A.lIIlIllIII[34]] = A."Search";
        A.lIIlIlIlII[A.lIIlIllIII[35]] = A."Search";
        A.lIIlIlIlII[A.lIIlIllIII[36]] = A."Continue";
        A.lIIlIlIlII[A.lIIlIllIII[37]] = A."null";
        A.lIIlIlIlII[A.lIIlIllIII[38]] = A." ";
        A.lIIlIlIlII[A.lIIlIllIII[40]] = A."Nav to magnet box";
        A.lIIlIlIlII[A.lIIlIllIII[41]] = A."Cupboard";
        A.lIIlIlIlII[A.lIIlIllIII[42]] = A."Taking magnet";
        A.lIIlIlIlII[A.lIIlIllIII[43]] = A."Open";
        A.lIIlIlIlII[A.lIIlIllIII[44]] = A."Open";
        A.lIIlIlIlII[A.lIIlIllIII[45]] = A."Search";
        A.lIIlIlIlII[A.lIIlIllIII[46]] = A."Search";
        A.lIIlIlIlII[A.lIIlIllIII[47]] = A."Continue";
        A.lIIlIlIlII[A.lIIlIllIII[48]] = A."null";
        A.lIIlIlIlII[A.lIIlIllIII[49]] = A." ";
        A.lIIlIlIlII[A.lIIlIllIII[50]] = A."Nav to cheese spot";
        A.lIIlIlIlII[A.lIIlIllIII[51]] = A."Mouse hole";
        A.lIIlIlIlII[A.lIIlIllIII[52]] = A."Mouse";
        A.lIIlIlIlII[A.lIIlIllIII[53]] = A."Using cheese";
        A.lIIlIlIlII[A.lIIlIllIII[54]] = A."Cheese";
        A.lIIlIlIlII[A.lIIlIllIII[55]] = A."Cheese";
        A.lIIlIlIlII[A.lIIlIllIII[56]] = A."Handle mouse";
        A.lIIlIlIlII[A.lIIlIllIII[57]] = A."Entering maze";
        A.lIIlIlIlII[A.lIIlIllIII[61]] = A."Handling walking";
        A.lIIlIlIlII[A.lIIlIllIII[63]] = A."Door";
        A.lIIlIlIlII[A.lIIlIllIII[64]] = A."Entering shed";
        A.lIIlIlIlII[A.lIIlIllIII[65]] = A."Nav to safe spot";
        A.lIIlIlIlII[A.lIIlIllIII[66]] = A."Eat";
        A.lIIlIlIlII[A.lIIlIllIII[67]] = A."Casting spell";
        A.lIIlIlIlII[A.lIIlIllIII[68]] = A."Fire rune";
        A.lIIlIlIlII[A.lIIlIllIII[69]] = A."Fire rune";
        A.lIIlIlIlII[A.lIIlIllIII[70]] = A."Ball";
        A.lIIlIlIlII[A.lIIlIllIII[71]] = A."Ball";
        A.lIIlIlIlII[A.lIIlIllIII[72]] = A."Taking ball";
        A.lIIlIlIlII[A.lIIlIllIII[73]] = A."Take";
        A.lIIlIlIlII[A.lIIlIllIII[74]] = A."Ball";
        A.lIIlIlIlII[A.lIIlIllIII[75]] = A."Breaking tab";
        A.lIIlIlIlII[A.lIIlIllIII[76]] = A."Break";
        A.lIIlIlIlII[A.lIIlIllIII[77]] = A."Nav to witches start";
        A.lIIlIlIlII[A.lIIlIllIII[78]] = A."Turning in quest";
        A.lIIlIlIlII[A.lIIlIllIII[79]] = A."Boy";
        A.lIIlIlIlII[A.lIIlIllIII[80]] = A."Drink";
        A.lIIlIlIlII[A.lIIlIllIII[81]] = A."Entering maze";
        A.lIIlIlIlII[A.lIIlIllIII[83]] = A."Nav to first spot";
        A.lIIlIlIlII[A.lIIlIllIII[84]] = A."Nav to second spot";
        A.lIIlIlIlII[A.lIIlIllIII[85]] = A."Nav to third spot";
        A.lIIlIlIlII[A.lIIlIllIII[86]] = A."Nav to fountain";
        A.lIIlIlIlII[A.lIIlIllIII[87]] = A."Getting key";
        A.lIIlIlIlII[A.lIIlIllIII[88]] = A."Fountain";
        A.lIIlIlIlII[A.lIIlIllIII[89]] = A."Check";
        A.lIIlIlIlII[A.lIIlIllIII[90]] = A."Continue";
        A.lIIlIlIlII[A.lIIlIllIII[91]] = A."null";
        A.lIIlIlIlII[A.lIIlIllIII[92]] = A." ";
        A.lIIlIlIlII[A.lIIlIllIII[95]] = A."Nav back toward maze";
        A.lIIlIlIlII[A.lIIlIllIII[96]] = A."Nav to shed spot";
        A.lIIlIlIlII[A.lIIlIllIII[97]] = A."Navigating to bank";
        A.lIIlIlIlII[A.lIIlIllIII[98]] = A."Opening bank";
        A.lIIlIlIlII[A.lIIlIllIII[100]] = A."Handling banking";
        A.lIIlIlIlII[A.lIIlIllIII[102]] = A."We are missing supplies, switching to BUYING";
        A.lIIlIlIlII[A.lIIlIllIII[16]] = A."We are missing supplies, switching to BUYING";
        A.lIIlIlIlII[A.lIIlIllIII[103]] = A."We are missing supplies, switching to BUYING";
        A.lIIlIlIlII[A.lIIlIllIII[104]] = A."We are missing supplies, switching to BUYING";
        A.lIIlIlIlII[A.lIIlIllIII[106]] = A."We are missing supplies, switching to BUYING";
        A.lIIlIlIlII[A.lIIlIllIII[116]] = A."Witches House quest";
        A.lIIlIlIlII[A.lIIlIllIII[117]] = A."ring of wealth (";
        A.lIIlIlIlII[A.lIIlIllIII[163]] = A."Wizard Mizgog";
        A.lIIlIlIlII[A.lIIlIllIII[164]] = A."Give me a quest please.";
        A.lIIlIlIlII[A.lIIlIllIII[165]] = A."I'll try.";
        A.lIIlIlIlII[A.lIIlIllIII[166]] = A."Actually, I know where to find this stuff.";
        A.lIIlIlIlII[A.lIIlIllIII[167]] = A."Yes.";
        A.lIIlIlIlII[A.lIIlIllIII[168]] = A."What's the matter?";
        A.lIIlIlIlII[A.lIIlIllIII[169]] = A."Ok, I'll see what I can do.";
    }

    private static String llllllIlllll(String var24, String var21) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var21.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var25 = Cipher.getInstance("Blowfish");
            var25.init(lIIlIllIII[1], var1);
            return new String(var25.doFinal(Base64.getDecoder().decode(var24.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    @Override
    public int T() {
        A.bu();
        return lIIlIllIII[109];
    }

    private static boolean lllllllllIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lllllllllIll(int n2) {
        return n2 != 0;
    }

    private static String llllllIllllI(String var12, String var22) {
        try {
            SecretKeySpec var16 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var22.getBytes(StandardCharsets.UTF_8)), lIIlIllIII[20]), "DES");
            Cipher var6 = Cipher.getInstance("DES");
            var6.init(lIIlIllIII[1], var16);
            return new String(var6.doFinal(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }

    private static void af() {
        d var17;
        block21: {
            block20: {
                Object var19;
                block19: {
                    block18: {
                        int[] nArray = new int[lIIlIllIII[3]];
                        nArray[A.lIIlIllIII[4]] = lIIlIllIII[8];
                        if (A.llllllllllII(Bank.contains((int[])nArray) ? 1 : 0)) {
                            d d2 = new d(lIIlIllIII[8], lIIlIllIII[109], lIIlIllIII[110]);
                            bv.add(d2);
                            0;
                        }
                        int[] nArray2 = new int[lIIlIllIII[3]];
                        nArray2[A.lIIlIllIII[4]] = lIIlIllIII[8];
                        if (A.lllllllllIll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            int[] nArray3 = new int[lIIlIllIII[3]];
                            nArray3[A.lIIlIllIII[4]] = lIIlIllIII[8];
                            if (A.lllllllllIIl(Bank.getFirst((int[])nArray3).getQuantity(), lIIlIllIII[33])) {
                                var19 = new d(lIIlIllIII[8], lIIlIllIII[54], lIIlIllIII[110]);
                                bv.add((d)var19);
                                0;
                            }
                        }
                        int[] nArray4 = new int[lIIlIllIII[3]];
                        nArray4[A.lIIlIllIII[4]] = lIIlIllIII[9];
                        if (!A.lllllllllIll(Bank.contains((int[])nArray4) ? 1 : 0)) break block18;
                        int[] nArray5 = new int[lIIlIllIII[3]];
                        nArray5[A.lIIlIllIII[4]] = lIIlIllIII[9];
                        if (!A.lllllllllIll(Bank.contains((int[])nArray5) ? 1 : 0)) break block19;
                        int[] nArray6 = new int[lIIlIllIII[3]];
                        nArray6[A.lIIlIllIII[4]] = lIIlIllIII[9];
                        if (!A.lllllllllIIl(Bank.getFirst((int[])nArray6).getQuantity(), lIIlIllIII[13])) break block19;
                    }
                    var19 = new d(lIIlIllIII[9], lIIlIllIII[13], lIIlIllIII[111]);
                    bv.add((d)var19);
                    0;
                }
                if (A.llllllllllII(Bank.contains((Predicate)(var19 = item -> item.getName().toLowerCase().contains(lIIlIlIlII[lIIlIllIII[117]]))) ? 1 : 0)) {
                    var17 = new d(lIIlIllIII[112], lIIlIllIII[31], lIIlIllIII[113]);
                    bv.add(var17);
                    0;
                }
                int[] nArray = new int[lIIlIllIII[3]];
                nArray[A.lIIlIllIII[4]] = lIIlIllIII[105];
                if (A.llllllllllII(Bank.contains((int[])nArray) ? 1 : 0)) {
                    var17 = new d(lIIlIllIII[105], lIIlIllIII[54], lIIlIllIII[114]);
                    bv.add(var17);
                    0;
                }
                int[] nArray7 = new int[lIIlIllIII[3]];
                nArray7[A.lIIlIllIII[4]] = lIIlIllIII[10];
                if (!A.lllllllllIll(Bank.contains((int[])nArray7) ? 1 : 0)) break block20;
                int[] nArray8 = new int[lIIlIllIII[3]];
                nArray8[A.lIIlIllIII[4]] = lIIlIllIII[10];
                if (!A.lllllllllIll(Bank.contains((int[])nArray8) ? 1 : 0)) break block21;
                int[] nArray9 = new int[lIIlIllIII[3]];
                nArray9[A.lIIlIllIII[4]] = lIIlIllIII[10];
                if (!A.lllllllllIIl(Bank.getFirst((int[])nArray9).getQuantity(), lIIlIllIII[22])) break block21;
            }
            var17 = new d(lIIlIllIII[10], lIIlIllIII[33], lIIlIllIII[114]);
            bv.add(var17);
            0;
        }
        int[] nArray = new int[lIIlIllIII[3]];
        nArray[A.lIIlIllIII[4]] = lIIlIllIII[108];
        if (A.llllllllllII(Bank.contains((int[])nArray) ? 1 : 0)) {
            var17 = new d(lIIlIllIII[108], lIIlIllIII[13], i.bq);
            bv.add(var17);
            0;
        }
        int[] nArray10 = new int[lIIlIllIII[3]];
        nArray10[A.lIIlIllIII[4]] = lIIlIllIII[7];
        if (A.lllllllllIll(Bank.contains((int[])nArray10) ? 1 : 0)) {
            int[] nArray11 = new int[lIIlIllIII[3]];
            nArray11[A.lIIlIllIII[4]] = lIIlIllIII[7];
            if (A.lllllllllIIl(Bank.getFirst((int[])nArray11).getQuantity(), lIIlIllIII[101])) {
                var17 = new d(lIIlIllIII[7], lIIlIllIII[115], lIIlIllIII[18]);
                bv.add(var17);
                0;
            }
        }
        int[] nArray12 = new int[lIIlIllIII[3]];
        nArray12[A.lIIlIllIII[4]] = lIIlIllIII[5];
        if (A.lllllllllIll(Bank.contains((int[])nArray12) ? 1 : 0)) {
            int[] nArray13 = new int[lIIlIllIII[3]];
            nArray13[A.lIIlIllIII[4]] = lIIlIllIII[5];
            if (A.lllllllllIIl(Bank.getFirst((int[])nArray13).getQuantity(), lIIlIllIII[101])) {
                var17 = new d(lIIlIllIII[5], lIIlIllIII[115], lIIlIllIII[18]);
                bv.add(var17);
                0;
            }
        }
        int[] nArray14 = new int[lIIlIllIII[3]];
        nArray14[A.lIIlIllIII[4]] = lIIlIllIII[6];
        if (A.lllllllllIll(Bank.contains((int[])nArray14) ? 1 : 0)) {
            int[] nArray15 = new int[lIIlIllIII[3]];
            nArray15[A.lIIlIllIII[4]] = lIIlIllIII[6];
            if (A.lllllllllIIl(Bank.getFirst((int[])nArray15).getQuantity(), lIIlIllIII[101])) {
                var17 = new d(lIIlIllIII[6], lIIlIllIII[115], lIIlIllIII[18]);
                bv.add(var17);
                0;
            }
        }
    }
}

