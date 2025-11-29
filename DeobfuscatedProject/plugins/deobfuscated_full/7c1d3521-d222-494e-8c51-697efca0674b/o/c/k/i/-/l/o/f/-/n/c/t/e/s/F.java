/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Prayers
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
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.a;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.aD;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.aF;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.aN;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ay;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.b;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.d;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.e;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.f;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.g;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.j;

public class F
implements ac {
    public static final /* synthetic */ WorldPoint fz;
    public static /* synthetic */ String da;
    public static final /* synthetic */ WorldPoint fy;
    public static final /* synthetic */ WorldPoint fw;
    private static /* synthetic */ int[] lllIIIIlll;
    public static final /* synthetic */ WorldPoint fx;
    public static final /* synthetic */ WorldPoint fB;
    public static /* synthetic */ String h;
    static /* synthetic */ int di;
    public static final /* synthetic */ WorldPoint fD;
    public static /* synthetic */ int fF;
    public static /* synthetic */ boolean bt;
    public static /* synthetic */ int fE;
    public static /* synthetic */ String[] fG;
    public static final /* synthetic */ WorldPoint fv;
    private static /* synthetic */ String[] lllIIIIlII;
    public static /* synthetic */ List<d> bv;
    public static final /* synthetic */ WorldPoint fA;
    public static final /* synthetic */ WorldPoint fC;

    private static boolean lIlllllIIlIlI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlllllIIllIl(int n2) {
        return n2 < 0;
    }

    private static boolean lIlllllIIlllI(int n2, int n3) {
        return n2 > n3;
    }

    private static void lIlllllIIIlIl() {
        lllIIIIlll = new int[138];
        F.lllIIIIlll[0] = 1;
        F.lllIIIIlll[1] = (157 + 240 - 373 + 227 ^ 156 + 160 - 155 + 20) & (0xE7 ^ 0xB4 ^ (0x56 ^ 0x4B) ^ -1);
        F.lllIIIIlll[2] = 0x70 ^ 0x6F;
        F.lllIIIIlll[3] = 0xEB ^ 0x9F ^ (0x45 ^ 0x15);
        F.lllIIIIlll[4] = 2;
        F.lllIIIIlll[5] = 0x3F ^ 0x12;
        F.lllIIIIlll[6] = 3;
        F.lllIIIIlll[7] = 0x71 ^ 0x5C ^ (0x4A ^ 0x63);
        F.lllIIIIlll[8] = 0xE5 ^ 0xAA ^ (0x15 ^ 0x5F);
        F.lllIIIIlll[9] = 0xFFFF93ED & 0x7F9A;
        F.lllIIIIlll[10] = 126 + 143 - 115 + 19 ^ 97 + 57 - 131 + 148;
        F.lllIIIIlll[11] = 0xBF ^ 0xB5;
        F.lllIIIIlll[12] = 0xFFFFFF57 & 0x1FEF;
        F.lllIIIIlll[13] = -(0xFFFFE3B7 & 0x5CDF) & (0xFFFFDFDE & Short.MAX_VALUE);
        F.lllIIIIlll[14] = -(0xFFFFEEEB & 0x799D) & (0xFFFFFFFF & 0x6DCF);
        F.lllIIIIlll[15] = -(0xFFFFF7FE & 0x3C07) & (0xFFFFFFFD & 0x3DFF);
        F.lllIIIIlll[16] = -(0xFFFFF69D & 0x7D73) & (0xFFFFFFB2 & 0x7DDF);
        F.lllIIIIlll[17] = -(0xFFFFFAD1 & 0x3DFF) & (0xFFFFBAFF & 0x7FFE);
        F.lllIIIIlll[18] = -(0xFFFFF99F & 0x36F2) & (0xFFFFB2BB & Short.MAX_VALUE);
        F.lllIIIIlll[19] = 0xF8 ^ 0x9A ^ (0x5F ^ 0x3A);
        F.lllIIIIlll[20] = 0xFFFFF76E & 0xABD;
        F.lllIIIIlll[21] = 0x2F ^ 0x57 ^ (0x5D ^ 0x2D);
        F.lllIIIIlll[22] = -(0xFFFFFEFF & 0x7757) & (0xFFFFFFD7 & 0x77FF);
        F.lllIIIIlll[23] = 0x19 ^ 0x10;
        F.lllIIIIlll[24] = 0xFFFFC233 & 0x3FFE;
        F.lllIIIIlll[25] = -(0xFFFFFF9B & 0x787C) & (0xFFFFFBFF & Short.MAX_VALUE);
        F.lllIIIIlll[26] = 0xFFFFE76B & 0x1ABF;
        F.lllIIIIlll[27] = 0xFFFFC73D & 0x3AEF;
        F.lllIIIIlll[28] = 17 + 80 - -100 + 3;
        F.lllIIIIlll[29] = 0x39 ^ 0x54 ^ (0x32 ^ 0x53);
        F.lllIIIIlll[30] = -(0xFFFFD7EB & 0x2EBF) & (0xFFFFF7FF & 0x3FFB);
        F.lllIIIIlll[31] = 0x5E ^ 0x55;
        F.lllIIIIlll[32] = 0xFFFFBBE3 & 0x47FF;
        F.lllIIIIlll[33] = 0x64 ^ 0x56;
        F.lllIIIIlll[34] = 120 + 163 - 177 + 59 ^ 131 + 175 - 305 + 177;
        F.lllIIIIlll[35] = 0x65 ^ 0x68;
        F.lllIIIIlll[36] = 0x51 ^ 0x68 ^ (0xA1 ^ 0x96);
        F.lllIIIIlll[37] = 155 + 85 - 121 + 66 ^ 0 + 53 - 41 + 170;
        F.lllIIIIlll[38] = 3 ^ 0x49 ^ (0x52 ^ 8);
        F.lllIIIIlll[39] = -(0xFFFFE7BB & 0x7A65) & (0xFFFFFFE7 & 0x6E7B);
        F.lllIIIIlll[40] = -(0xFFFFDF7D & 0x6393) & (0xFFFFCF99 & Short.MAX_VALUE);
        F.lllIIIIlll[41] = 0xAE ^ 0xBF;
        F.lllIIIIlll[42] = 32 + 166 - 110 + 85 ^ 77 + 189 - 263 + 188;
        F.lllIIIIlll[43] = 129 + 2 - 14 + 13 ^ 102 + 37 - 49 + 55;
        F.lllIIIIlll[44] = 0xFFFFCD7B & 0x3BED;
        F.lllIIIIlll[45] = 0x31 ^ 0x6A ^ (0xA ^ 0x45);
        F.lllIIIIlll[46] = 18 + 128 - 108 + 127 ^ 153 + 1 - 81 + 103;
        F.lllIIIIlll[47] = 0x48 ^ 0x5E;
        F.lllIIIIlll[48] = 0xA6 ^ 0xB8;
        F.lllIIIIlll[49] = 88 + 54 - 55 + 78 ^ 5 + 120 - 33 + 97;
        F.lllIIIIlll[50] = 99 + 78 - 174 + 131 ^ 24 + 36 - -49 + 50;
        F.lllIIIIlll[51] = 0xAC ^ 0x93 ^ (0x18 ^ 0x3D);
        F.lllIIIIlll[52] = 0xA6 ^ 0x9D ^ (0xF7 ^ 0x8A);
        F.lllIIIIlll[53] = 0x56 ^ 0x7A ^ (0xB8 ^ 0x8F);
        F.lllIIIIlll[54] = -(0xFFFFFAE7 & 0x3D7D) & (0xFFFFBCEF & Short.MAX_VALUE);
        F.lllIIIIlll[55] = 0x46 ^ 0x1F ^ (0xC3 ^ 0x86);
        F.lllIIIIlll[56] = 0x91 ^ 0x8C;
        F.lllIIIIlll[57] = 0xE ^ 1 ^ (0xB ^ 0x24);
        F.lllIIIIlll[58] = 0x92 ^ 0xB1;
        F.lllIIIIlll[59] = 0xF4 ^ 0x82 ^ (0x5C ^ 0xB);
        F.lllIIIIlll[60] = 40 + 47 - -36 + 8 ^ 127 + 16 - 15 + 33;
        F.lllIIIIlll[61] = 30 + 9 - -10 + 93 ^ 124 + 121 - 107 + 33;
        F.lllIIIIlll[62] = 0x79 ^ 0x53 ^ (0x81 ^ 0x8D);
        F.lllIIIIlll[63] = 0xB8 ^ 0x9F;
        F.lllIIIIlll[64] = 0x62 ^ 0x4A;
        F.lllIIIIlll[65] = 18 + 64 - -60 + 26 ^ 125 + 29 - 95 + 70;
        F.lllIIIIlll[66] = 0x67 ^ 0x60 ^ (0xBE ^ 0x93);
        F.lllIIIIlll[67] = 0x4C ^ 0x52 ^ (0x4F ^ 0x7A);
        F.lllIIIIlll[68] = 0x21 ^ 0x1C ^ (0xA1 ^ 0xB0);
        F.lllIIIIlll[69] = 0x66 ^ 0x7A ^ (0x62 ^ 0x50);
        F.lllIIIIlll[70] = 0x10 ^ 0x3F;
        F.lllIIIIlll[71] = 0x42 ^ 0x72;
        F.lllIIIIlll[72] = 166 + 44 - 146 + 111 ^ 77 + 130 - 114 + 65;
        F.lllIIIIlll[73] = 0xD6 ^ 0x80 ^ (0x17 ^ 0x72);
        F.lllIIIIlll[74] = -1;
        F.lllIIIIlll[75] = 133 + 69 - 137 + 85 ^ 97 + 140 - 217 + 142;
        F.lllIIIIlll[76] = 0xA0 ^ 0xA8 ^ (0x4D ^ 0x70);
        F.lllIIIIlll[77] = 0x7D ^ 0x4B;
        F.lllIIIIlll[78] = 5 ^ 0x32;
        F.lllIIIIlll[79] = 0x7F ^ 0x59 ^ (0xB5 ^ 0xAB);
        F.lllIIIIlll[80] = 0xB9 ^ 0x80;
        F.lllIIIIlll[81] = 0x71 ^ 0x4B;
        F.lllIIIIlll[82] = 0x3A ^ 1;
        F.lllIIIIlll[83] = 0x5A ^ 0x66;
        F.lllIIIIlll[84] = 58 + 167 - 36 + 60 ^ 58 + 123 - 44 + 59;
        F.lllIIIIlll[85] = 0x34 ^ 0xA;
        F.lllIIIIlll[86] = 0x89 ^ 0xB6;
        F.lllIIIIlll[87] = 0xDB ^ 0x9B;
        F.lllIIIIlll[88] = 210 + 23 - 28 + 9 ^ 54 + 69 - 72 + 100;
        F.lllIIIIlll[89] = 0xB4 ^ 0x96 ^ (0xA3 ^ 0xC3);
        F.lllIIIIlll[90] = 0xCB ^ 0x88;
        F.lllIIIIlll[91] = 147 + 175 - 151 + 63 ^ 44 + 138 - 135 + 127;
        F.lllIIIIlll[92] = -(0x19 ^ 0xD) & (0xFFFFFDFF & 0x1B77);
        F.lllIIIIlll[93] = -(0xFFFFFE5F & 0x79FE) & (0xFFFFFFFF & 0x7FDD);
        F.lllIIIIlll[94] = 0xFFFFFEFE & 0x2FCB;
        F.lllIIIIlll[95] = 0xFFFFFDEA & 0x5B9D;
        F.lllIIIIlll[96] = -(0xFFFFE9F8 & 0x1F0F) & (0xFFFFFB7F & 0x3FFF);
        F.lllIIIIlll[97] = 138 + 34 - 162 + 170;
        F.lllIIIIlll[98] = 0xFFFFEFEC & 0x1B7B;
        F.lllIIIIlll[99] = -(0xFFFFFE0F & 0x3DF1) & (0xFFFFFFDA & 0x3FBD);
        F.lllIIIIlll[100] = 0xFFFFAFBC & 0x737F;
        F.lllIIIIlll[101] = -(0xFFFFE2B5 & 0x5D7B) & (0xFFFFEFFD & 0x7EFE);
        F.lllIIIIlll[102] = -(0xFFFF9A5D & 0x6FF6) & (0xFFFFFFFB & 0x6BFF);
        F.lllIIIIlll[103] = -(0xFFFFF7BF & 0x5C5B) & (0xFFFFDF9E & 0x77FF);
        F.lllIIIIlll[104] = 160 + 148 - 221 + 77 ^ 52 + 189 - 129 + 80;
        F.lllIIIIlll[105] = 0x93 ^ 0xAC ^ (0x33 ^ 0x49);
        F.lllIIIIlll[106] = 163 + 138 - 78 + 29 ^ 63 + 91 - 145 + 178;
        F.lllIIIIlll[107] = 0x49 ^ 0x45 ^ (0x44 ^ 0);
        F.lllIIIIlll[108] = 120 + 46 - -26 + 27 ^ 11 + 113 - 50 + 72;
        F.lllIIIIlll[109] = 0xF5 ^ 0xBF;
        F.lllIIIIlll[110] = -(0xFFFFEFDB & 0x5335) & (0xFFFFFF5D & 0x4FFF);
        F.lllIIIIlll[111] = 0xFFFFEFDF & 0x1CA5;
        F.lllIIIIlll[112] = -(0xFFFFC3BF & 0x7CD2) & (0xFFFFCF9F & 0x7BF7);
        F.lllIIIIlll[113] = 0xFFFFEE2F & 0x37FE;
        F.lllIIIIlll[114] = 0xFFFFAB9F & 0x5F7B;
        F.lllIIIIlll[115] = -(34 + 140 - 90 + 134) & (0xFFFFF7FF & 0x2EFF);
        F.lllIIIIlll[116] = -(0xFFFFFE9C & 0x35E7) & (0xFFFFFFBF & 0x3FEF);
        F.lllIIIIlll[117] = 0xFFFFA7AF & 0x7E58;
        F.lllIIIIlll[118] = -(0xFFFFEBDF & 0x76B3) & (0xFFFFEFFF & 0x7FBF);
        F.lllIIIIlll[119] = -(0xFFFFF38D & 0x5E7B) & (0xFFFFDEFF & 0x7F9E);
        F.lllIIIIlll[120] = -(0xFFFF974F & 0x6BFB) & (0xFFFFFFDF & 0xFFB);
        F.lllIIIIlll[121] = -(0xFFFFFD3F & 0x73D1) & (0xFFFFFFBF & 0x7DD7);
        F.lllIIIIlll[122] = 0xFFFF8EAE & 0x7DDD;
        F.lllIIIIlll[123] = -(0xFFFFF815 & 0x37EB) & (0xFFFFBFFF & 0x7C7F);
        F.lllIIIIlll[124] = 0xFFFFCDFB & 0x3E66;
        F.lllIIIIlll[125] = 0xFFFFBDD6 & 0x4BBD;
        F.lllIIIIlll[126] = -(0xFFFF9FBF & 0x6EC7) & (0xFFFF9FFF & Short.MAX_VALUE);
        F.lllIIIIlll[127] = 42 + 125 - 144 + 124;
        F.lllIIIIlll[128] = 0x44 ^ 0xF;
        F.lllIIIIlll[129] = 0x34 ^ 0x78;
        F.lllIIIIlll[130] = 202 + 96 - 115 + 69 ^ 166 + 81 - 111 + 41;
        F.lllIIIIlll[131] = 0xF2 ^ 0xC0 ^ (0x7D ^ 1);
        F.lllIIIIlll[132] = 0x1A ^ 0x55;
        F.lllIIIIlll[133] = 0xD8 ^ 0x88;
        F.lllIIIIlll[134] = 0xCB ^ 0x9A;
        F.lllIIIIlll[135] = 0x43 ^ 0x6C ^ (0x37 ^ 0x4A);
        F.lllIIIIlll[136] = 0xD2 ^ 0x81;
        F.lllIIIIlll[137] = 5 ^ 0x51;
    }

    private static boolean lIlllllIlIIII(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public int af() {
        try {
            F.bY();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if ((0xA3 ^ 0xA7) < 2) {
            return (0x60 ^ 0x75) & ~(0x74 ^ 0x61);
        }
        return lllIIIIlll[104];
    }

    private static String lIlllllIIIIIl(String var12, String var7) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var16 = var7.toCharArray();
        int var8 = lllIIIIlll[1];
        char[] var4 = var12.toCharArray();
        int var22 = var4.length;
        int var11 = lllIIIIlll[1];
        while (F.lIlllllIIlIII(var11, var22)) {
            char var18 = var4[var11];
            var14.append((char)(var18 ^ var16[var8 % var16.length]));
            0;
            ++var8;
            ++var11;
            0;
            if (-(0x1B ^ 0x1E) < 0) continue;
            return null;
        }
        return String.valueOf(var14);
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (F.lIlllllIlIIII(e.j(fE), lllIIIIlll[10])) {
            bl = lllIIIIlll[0];
            0;
            if (2 <= 0) {
                return false;
            }
        } else {
            bl = lllIIIIlll[1];
        }
        return bl;
    }

    @Override
    public String ag() {
        return h;
    }

    public static void bY() {
        block72: {
            block86: {
                block90: {
                    block92: {
                        block91: {
                            block87: {
                                block89: {
                                    block88: {
                                        block73: {
                                            block85: {
                                                block75: {
                                                    block84: {
                                                        block83: {
                                                            block82: {
                                                                block81: {
                                                                    block80: {
                                                                        block79: {
                                                                            block78: {
                                                                                block77: {
                                                                                    block76: {
                                                                                        block74: {
                                                                                            if (F.lIlllllIIIlll(bt ? 1 : 0)) {
                                                                                                b.a(bv);
                                                                                                if (F.lIlllllIIlIII(bv.size(), lllIIIIlll[0])) {
                                                                                                    System.out.println(lllIIIIlII[lllIIIIlll[1]]);
                                                                                                    bt = lllIIIIlll[1];
                                                                                                }
                                                                                            }
                                                                                            if (!F.lIlllllIIlIIl(bt ? 1 : 0)) break block72;
                                                                                            if (F.lIlllllIIlIII(Skills.getLevel((Skill)Skill.CRAFTING), lllIIIIlll[2])) {
                                                                                                da = lllIIIIlII[lllIIIIlll[0]];
                                                                                                ay.fi();
                                                                                            }
                                                                                            if (F.lIlllllIIlIlI(Skills.getLevel((Skill)Skill.CRAFTING), lllIIIIlll[2]) && F.lIlllllIIlIII(Skills.getLevel((Skill)Skill.WOODCUTTING), lllIIIIlll[3])) {
                                                                                                da = lllIIIIlII[lllIIIIlll[4]];
                                                                                                aF.gs();
                                                                                            }
                                                                                            if (F.lIlllllIIlIlI(Skills.getLevel((Skill)Skill.CRAFTING), lllIIIIlll[2]) && F.lIlllllIIlIlI(Skills.getLevel((Skill)Skill.WOODCUTTING), lllIIIIlll[3]) && F.lIlllllIIlIII(Skills.getLevel((Skill)Skill.PRAYER), lllIIIIlll[5])) {
                                                                                                da = lllIIIIlII[lllIIIIlll[6]];
                                                                                                aD.fY();
                                                                                            }
                                                                                            if (!F.lIlllllIIlIIl(F.an() ? 1 : 0) || !F.lIlllllIIlIII(e.j(fE), lllIIIIlll[0]) || !F.lIlllllIIlIlI(Skills.getLevel((Skill)Skill.CRAFTING), lllIIIIlll[2]) || !F.lIlllllIIlIlI(Skills.getLevel((Skill)Skill.WOODCUTTING), lllIIIIlll[3]) || !F.lIlllllIIlIlI(Skills.getLevel((Skill)Skill.PRAYER), lllIIIIlll[5])) break block73;
                                                                                            da = lllIIIIlII[lllIIIIlll[7]];
                                                                                            BankLocation var5 = BankLocation.getNearest();
                                                                                            if (F.lIlllllIIlIll(var5) && F.lIlllllIIlIIl(var5.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                                                                AccBuilderSotf.c = lllIIIIlII[lllIIIIlll[8]];
                                                                                                a.a(var5);
                                                                                            }
                                                                                            if (!F.lIlllllIIlIll(var5) || !F.lIlllllIIIlll(var5.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block73;
                                                                                            if (F.lIlllllIIlIIl(Bank.isOpen() ? 1 : 0)) {
                                                                                                a.a();
                                                                                                Time.sleepUntil(() -> Bank.isOpen(), (int)lllIIIIlll[9]);
                                                                                                0;
                                                                                            }
                                                                                            if (!F.lIlllllIIIlll(Bank.isOpen() ? 1 : 0)) break block73;
                                                                                            AccBuilderSotf.c = lllIIIIlII[lllIIIIlll[10]];
                                                                                            if (F.lIlllllIIllII(Inventory.getAll().size())) {
                                                                                                Bank.depositInventory();
                                                                                                Time.sleepTicks((int)lllIIIIlll[7]);
                                                                                                0;
                                                                                            }
                                                                                            if (F.lIlllllIIllII(Equipment.getAll().size())) {
                                                                                                Bank.depositEquipment();
                                                                                                Time.sleepTicks((int)lllIIIIlll[4]);
                                                                                                0;
                                                                                            }
                                                                                            int[] nArray = new int[lllIIIIlll[11]];
                                                                                            nArray[F.lllIIIIlll[1]] = lllIIIIlll[12];
                                                                                            nArray[F.lllIIIIlll[0]] = lllIIIIlll[13];
                                                                                            nArray[F.lllIIIIlll[4]] = lllIIIIlll[14];
                                                                                            nArray[F.lllIIIIlll[6]] = lllIIIIlll[15];
                                                                                            nArray[F.lllIIIIlll[7]] = lllIIIIlll[16];
                                                                                            nArray[F.lllIIIIlll[8]] = lllIIIIlll[17];
                                                                                            nArray[F.lllIIIIlll[10]] = lllIIIIlll[18];
                                                                                            nArray[F.lllIIIIlll[19]] = lllIIIIlll[20];
                                                                                            nArray[F.lllIIIIlll[21]] = lllIIIIlll[22];
                                                                                            nArray[F.lllIIIIlll[23]] = lllIIIIlll[24];
                                                                                            if (F.lIlllllIIlIIl(e.c(nArray) ? 1 : 0)) {
                                                                                                F.Q();
                                                                                                System.out.println(lllIIIIlII[lllIIIIlll[19]]);
                                                                                                bt = lllIIIIlll[0];
                                                                                                return;
                                                                                            }
                                                                                            int[] nArray2 = new int[lllIIIIlll[0]];
                                                                                            nArray2[F.lllIIIIlll[1]] = lllIIIIlll[20];
                                                                                            if (!F.lIlllllIIIlll(Bank.contains((int[])nArray2) ? 1 : 0)) break block74;
                                                                                            int[] nArray3 = new int[lllIIIIlll[0]];
                                                                                            nArray3[F.lllIIIIlll[1]] = lllIIIIlll[20];
                                                                                            if (!F.lIlllllIIlIlI(Bank.getFirst((int[])nArray3).getQuantity(), lllIIIIlll[25])) break block75;
                                                                                        }
                                                                                        int[] nArray = new int[lllIIIIlll[0]];
                                                                                        nArray[F.lllIIIIlll[1]] = lllIIIIlll[17];
                                                                                        if (!F.lIlllllIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block76;
                                                                                        int[] nArray4 = new int[lllIIIIlll[0]];
                                                                                        nArray4[F.lllIIIIlll[1]] = lllIIIIlll[17];
                                                                                        if (!F.lIlllllIIlIlI(Bank.getFirst((int[])nArray4).getQuantity(), lllIIIIlll[25])) break block75;
                                                                                    }
                                                                                    int[] nArray = new int[lllIIIIlll[0]];
                                                                                    nArray[F.lllIIIIlll[1]] = lllIIIIlll[26];
                                                                                    if (!F.lIlllllIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block77;
                                                                                    int[] nArray5 = new int[lllIIIIlll[0]];
                                                                                    nArray5[F.lllIIIIlll[1]] = lllIIIIlll[26];
                                                                                    if (!F.lIlllllIIlIlI(Bank.getFirst((int[])nArray5).getQuantity(), lllIIIIlll[25])) break block75;
                                                                                }
                                                                                int[] nArray = new int[lllIIIIlll[0]];
                                                                                nArray[F.lllIIIIlll[1]] = lllIIIIlll[27];
                                                                                if (!F.lIlllllIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block78;
                                                                                int[] nArray6 = new int[lllIIIIlll[0]];
                                                                                nArray6[F.lllIIIIlll[1]] = lllIIIIlll[27];
                                                                                if (!F.lIlllllIIlIlI(Bank.getFirst((int[])nArray6).getQuantity(), lllIIIIlll[25])) break block75;
                                                                            }
                                                                            int[] nArray = new int[lllIIIIlll[0]];
                                                                            nArray[F.lllIIIIlll[1]] = lllIIIIlll[24];
                                                                            if (!F.lIlllllIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block79;
                                                                            int[] nArray7 = new int[lllIIIIlll[0]];
                                                                            nArray7[F.lllIIIIlll[1]] = lllIIIIlll[24];
                                                                            if (!F.lIlllllIIlIlI(Bank.getFirst((int[])nArray7).getQuantity(), lllIIIIlll[28])) break block75;
                                                                        }
                                                                        int[] nArray = new int[lllIIIIlll[0]];
                                                                        nArray[F.lllIIIIlll[1]] = lllIIIIlll[18];
                                                                        if (!F.lIlllllIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block80;
                                                                        int[] nArray8 = new int[lllIIIIlll[0]];
                                                                        nArray8[F.lllIIIIlll[1]] = lllIIIIlll[18];
                                                                        if (!F.lIlllllIIlIlI(Bank.getFirst((int[])nArray8).getQuantity(), lllIIIIlll[25])) break block75;
                                                                    }
                                                                    int[] nArray = new int[lllIIIIlll[0]];
                                                                    nArray[F.lllIIIIlll[1]] = lllIIIIlll[22];
                                                                    if (!F.lIlllllIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block81;
                                                                    int[] nArray9 = new int[lllIIIIlll[0]];
                                                                    nArray9[F.lllIIIIlll[1]] = lllIIIIlll[22];
                                                                    if (!F.lIlllllIIlIlI(Bank.getFirst((int[])nArray9).getQuantity(), lllIIIIlll[29])) break block75;
                                                                }
                                                                int[] nArray = new int[lllIIIIlll[0]];
                                                                nArray[F.lllIIIIlll[1]] = lllIIIIlll[16];
                                                                if (!F.lIlllllIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block82;
                                                                int[] nArray10 = new int[lllIIIIlll[0]];
                                                                nArray10[F.lllIIIIlll[1]] = lllIIIIlll[16];
                                                                if (!F.lIlllllIIlIlI(Bank.getFirst((int[])nArray10).getQuantity(), lllIIIIlll[6])) break block75;
                                                            }
                                                            int[] nArray = new int[lllIIIIlll[0]];
                                                            nArray[F.lllIIIIlll[1]] = lllIIIIlll[13];
                                                            if (!F.lIlllllIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block83;
                                                            int[] nArray11 = new int[lllIIIIlll[0]];
                                                            nArray11[F.lllIIIIlll[1]] = lllIIIIlll[13];
                                                            if (!F.lIlllllIIlIlI(Bank.getFirst((int[])nArray11).getQuantity(), lllIIIIlll[11])) break block75;
                                                        }
                                                        int[] nArray = new int[lllIIIIlll[0]];
                                                        nArray[F.lllIIIIlll[1]] = lllIIIIlll[30];
                                                        if (!F.lIlllllIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block84;
                                                        int[] nArray12 = new int[lllIIIIlll[0]];
                                                        nArray12[F.lllIIIIlll[1]] = lllIIIIlll[30];
                                                        if (!F.lIlllllIIlIlI(Bank.getFirst((int[])nArray12).getQuantity(), lllIIIIlll[7])) break block75;
                                                    }
                                                    int[] nArray = new int[lllIIIIlll[0]];
                                                    nArray[F.lllIIIIlll[1]] = lllIIIIlll[12];
                                                    if (!F.lIlllllIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block85;
                                                    int[] nArray13 = new int[lllIIIIlll[0]];
                                                    nArray13[F.lllIIIIlll[1]] = lllIIIIlll[12];
                                                    if (!F.lIlllllIIlIII(Bank.getFirst((int[])nArray13).getQuantity(), lllIIIIlll[11])) break block85;
                                                }
                                                F.Q();
                                                System.out.println(lllIIIIlII[lllIIIIlll[21]]);
                                                bt = lllIIIIlll[0];
                                                return;
                                            }
                                            int[] nArray = new int[lllIIIIlll[29]];
                                            nArray[F.lllIIIIlll[1]] = lllIIIIlll[12];
                                            nArray[F.lllIIIIlll[0]] = lllIIIIlll[13];
                                            nArray[F.lllIIIIlll[4]] = lllIIIIlll[14];
                                            nArray[F.lllIIIIlll[6]] = lllIIIIlll[15];
                                            nArray[F.lllIIIIlll[7]] = lllIIIIlll[16];
                                            nArray[F.lllIIIIlll[8]] = lllIIIIlll[17];
                                            nArray[F.lllIIIIlll[10]] = lllIIIIlll[18];
                                            nArray[F.lllIIIIlll[19]] = lllIIIIlll[20];
                                            nArray[F.lllIIIIlll[21]] = lllIIIIlll[22];
                                            nArray[F.lllIIIIlll[23]] = lllIIIIlll[24];
                                            nArray[F.lllIIIIlll[11]] = lllIIIIlll[26];
                                            nArray[F.lllIIIIlll[31]] = lllIIIIlll[27];
                                            if (F.lIlllllIIIlll(e.c(nArray) ? 1 : 0)) {
                                                a.a(lllIIIIlll[12], lllIIIIlll[11]);
                                                a.a(lllIIIIlll[13], lllIIIIlll[11]);
                                                a.a(lllIIIIlll[14], lllIIIIlll[0]);
                                                a.a(lllIIIIlll[15], lllIIIIlll[0]);
                                                a.a(lllIIIIlll[16], lllIIIIlll[6]);
                                                a.b(f.aW, lllIIIIlll[0]);
                                                a.a(lllIIIIlll[22], lllIIIIlll[19]);
                                                a.a(lllIIIIlll[17], lllIIIIlll[25]);
                                                a.a(lllIIIIlll[18], lllIIIIlll[25]);
                                                a.a(lllIIIIlll[27], lllIIIIlll[25]);
                                                a.a(lllIIIIlll[26], lllIIIIlll[25]);
                                                a.a(lllIIIIlll[24], lllIIIIlll[25]);
                                                a.a(lllIIIIlll[20], lllIIIIlll[25]);
                                                a.a(lllIIIIlll[32], lllIIIIlll[25]);
                                                a.a(lllIIIIlll[30], lllIIIIlll[0]);
                                            }
                                        }
                                        if (F.lIlllllIIIlll(Inventory.contains((int[])f.ba) ? 1 : 0) && F.lIlllllIIlIII(Movement.getRunEnergy(), lllIIIIlll[33])) {
                                            Inventory.getFirst((int[])f.ba).interact(lllIIIIlII[lllIIIIlll[23]]);
                                            Time.sleepTicks((int)lllIIIIlll[0]);
                                            0;
                                        }
                                        if (F.lIlllllIIllIl(F.lIlllllIIIllI(e.w(), 50.0))) {
                                            String[] stringArray = new String[lllIIIIlll[0]];
                                            stringArray[F.lllIIIIlll[1]] = lllIIIIlII[lllIIIIlll[11]];
                                            if (F.lIlllllIIIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                String[] stringArray2 = new String[lllIIIIlll[0]];
                                                stringArray2[F.lllIIIIlll[1]] = lllIIIIlII[lllIIIIlll[31]];
                                                Inventory.getFirst((String[])stringArray2).interact(lllIIIIlII[lllIIIIlll[29]]);
                                                Time.sleepTicks((int)lllIIIIlll[4]);
                                                0;
                                            }
                                        }
                                        if (F.lIlllllIIlIII(Prayers.getPoints(), lllIIIIlll[34]) && F.lIlllllIIIlll(Inventory.contains((int[])f.aX) ? 1 : 0)) {
                                            Inventory.getFirst((int[])f.aX).interact(lllIIIIlII[lllIIIIlll[35]]);
                                            Time.sleepTicks((int)lllIIIIlll[4]);
                                            0;
                                        }
                                        if (F.lIlllllIIIlll(F.an() ? 1 : 0) && F.lIlllllIIlIII(e.j(fE), lllIIIIlll[0])) {
                                            if (F.lIlllllIIlllI(Players.getLocal().getWorldLocation().distanceTo(fv), lllIIIIlll[19])) {
                                                AccBuilderSotf.c = lllIIIIlII[lllIIIIlll[36]];
                                                if (F.lIlllllIIIlll(Dialog.isOpen() ? 1 : 0)) {
                                                    Dialog.close();
                                                }
                                                Movement.walkTo((WorldPoint)fv);
                                                0;
                                                Time.sleepTicks((int)lllIIIIlll[0]);
                                                0;
                                            }
                                            if (F.lIlllllIIllll(Players.getLocal().getWorldLocation().distanceTo(fv), lllIIIIlll[19])) {
                                                AccBuilderSotf.c = lllIIIIlII[lllIIIIlll[37]];
                                                g.a(lllIIIIlII[lllIIIIlll[38]], fG);
                                            }
                                        }
                                        if (F.lIlllllIlIIII(e.j(fE), lllIIIIlll[0])) {
                                            if (F.lIlllllIIlllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lllIIIIlll[39], lllIIIIlll[40], lllIIIIlll[1])), lllIIIIlll[8])) {
                                                AccBuilderSotf.c = lllIIIIlII[lllIIIIlll[41]];
                                                Movement.walkTo((WorldPoint)new WorldPoint(lllIIIIlll[39], lllIIIIlll[40], lllIIIIlll[1]));
                                                0;
                                                Time.sleepTicks((int)lllIIIIlll[0]);
                                                0;
                                            }
                                            if (F.lIlllllIIllll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lllIIIIlll[39], lllIIIIlll[40], lllIIIIlll[1])), lllIIIIlll[8])) {
                                                AccBuilderSotf.c = lllIIIIlII[lllIIIIlll[42]];
                                                String[] stringArray = new String[lllIIIIlll[0]];
                                                stringArray[F.lllIIIIlll[1]] = lllIIIIlII[lllIIIIlll[43]];
                                                if (F.lIlllllIlIIIl(NPCs.getNearest((String[])stringArray))) {
                                                    int[] nArray = new int[lllIIIIlll[0]];
                                                    nArray[F.lllIIIIlll[1]] = lllIIIIlll[44];
                                                    TileObjects.getNearest((int[])nArray).interact(lllIIIIlII[lllIIIIlll[45]]);
                                                    Time.sleepTicks((int)lllIIIIlll[6]);
                                                    0;
                                                }
                                                String[] stringArray3 = new String[lllIIIIlll[0]];
                                                stringArray3[F.lllIIIIlll[1]] = lllIIIIlII[lllIIIIlll[46]];
                                                if (F.lIlllllIIlIll(NPCs.getNearest((String[])stringArray3))) {
                                                    g.a(lllIIIIlII[lllIIIIlll[47]], fG);
                                                }
                                            }
                                        }
                                        if (!F.lIlllllIlIIII(e.j(fE), lllIIIIlll[4])) break block86;
                                        String[] stringArray = new String[lllIIIIlll[0]];
                                        stringArray[F.lllIIIIlll[1]] = lllIIIIlII[lllIIIIlll[34]];
                                        if (!F.lIlllllIIIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) break block87;
                                        if (F.lIlllllIIllll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lllIIIIlll[39], lllIIIIlll[40], lllIIIIlll[1])), lllIIIIlll[48])) {
                                            AccBuilderSotf.c = lllIIIIlII[lllIIIIlll[49]];
                                            String[] stringArray4 = new String[lllIIIIlll[0]];
                                            stringArray4[F.lllIIIIlll[1]] = lllIIIIlII[lllIIIIlll[50]];
                                            Inventory.getFirst((String[])stringArray4).interact(lllIIIIlII[lllIIIIlll[51]]);
                                            Time.sleepTicks((int)lllIIIIlll[0]);
                                            0;
                                        }
                                        if (F.lIlllllIIllll(Players.getLocal().getWorldLocation().distanceTo(fw), lllIIIIlll[52]) && F.lIlllllIIlllI(Players.getLocal().getWorldLocation().distanceTo(fy), lllIIIIlll[7])) {
                                            AccBuilderSotf.c = lllIIIIlII[lllIIIIlll[53]];
                                            if (F.lIlllllIIIlll(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                                Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                                            }
                                            Movement.walkTo((WorldPoint)fy);
                                            0;
                                            Time.sleepTicks((int)lllIIIIlll[0]);
                                            0;
                                        }
                                        if (!F.lIlllllIIllll(Players.getLocal().getWorldLocation().distanceTo(fy), lllIIIIlll[7])) break block87;
                                        int[] nArray = new int[lllIIIIlll[0]];
                                        nArray[F.lllIIIIlll[1]] = lllIIIIlll[54];
                                        if (F.lIlllllIlIIIl(NPCs.getNearest((int[])nArray))) {
                                            String[] stringArray5 = new String[lllIIIIlll[0]];
                                            stringArray5[F.lllIIIIlll[1]] = lllIIIIlII[lllIIIIlll[55]];
                                            TileObjects.getNearest((String[])stringArray5).interact(lllIIIIlII[lllIIIIlll[56]]);
                                            Time.sleepTicks((int)lllIIIIlll[4]);
                                            0;
                                        }
                                        int[] nArray14 = new int[lllIIIIlll[0]];
                                        nArray14[F.lllIIIIlll[1]] = lllIIIIlll[54];
                                        if (!F.lIlllllIIlIll(NPCs.getNearest((int[])nArray14))) break block87;
                                        AccBuilderSotf.c = lllIIIIlII[lllIIIIlll[48]];
                                        if (F.lIlllllIIlIIl(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                            Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                                        }
                                        if (!F.lIlllllIIlIIl(Players.getLocal().isAnimating() ? 1 : 0)) break block87;
                                        if (F.lIlllllIIlIlI(Skills.getLevel((Skill)Skill.MAGIC), lllIIIIlll[35]) && !F.lIlllllIIlIlI(Skills.getLevel((Skill)Skill.MAGIC), lllIIIIlll[41])) break block88;
                                        String[] stringArray6 = new String[lllIIIIlll[0]];
                                        stringArray6[F.lllIIIIlll[1]] = lllIIIIlII[lllIIIIlll[2]];
                                        if (!F.lIlllllIIlIIl(Inventory.contains((String[])stringArray6) ? 1 : 0)) break block89;
                                    }
                                    Magic.cast((Spell)SpellBook.Standard.FIRE_STRIKE, (NPC)NPCs.getNearest(nPC -> {
                                        int n2;
                                        if (F.lIlllllIlIIII(nPC.getId(), lllIIIIlll[54]) && F.lIlllllIIlIIl(nPC.isDead() ? 1 : 0)) {
                                            n2 = lllIIIIlll[0];
                                            0;
                                            if ((84 + 62 - 144 + 134 ^ 105 + 79 - 144 + 101) <= 0) {
                                                return ((0xF3 ^ 0x8A ^ (0x5C ^ 0x15)) & (0x28 ^ 0x58 ^ (0x33 ^ 0x73) ^ -1)) != 0;
                                            }
                                        } else {
                                            n2 = lllIIIIlll[1];
                                        }
                                        return n2 != 0;
                                    }));
                                    Time.sleepTicks((int)lllIIIIlll[4]);
                                    0;
                                }
                                String[] stringArray = new String[lllIIIIlll[0]];
                                stringArray[F.lllIIIIlll[1]] = lllIIIIlII[lllIIIIlll[57]];
                                if (F.lIlllllIIIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                    if (F.lIlllllIIlIlI(Skills.getLevel((Skill)Skill.MAGIC), lllIIIIlll[41]) && F.lIlllllIIlIII(Skills.getLevel((Skill)Skill.MAGIC), lllIIIIlll[34])) {
                                        Magic.cast((Spell)SpellBook.Standard.WIND_BOLT, (NPC)NPCs.getNearest(nPC -> {
                                            int n2;
                                            if (F.lIlllllIlIIII(nPC.getId(), lllIIIIlll[54]) && F.lIlllllIIlIIl(nPC.isDead() ? 1 : 0)) {
                                                n2 = lllIIIIlll[0];
                                                0;
                                                if (1 <= -1) {
                                                    return false;
                                                }
                                            } else {
                                                n2 = lllIIIIlll[1];
                                            }
                                            return n2 != 0;
                                        }));
                                        Time.sleepTicks((int)lllIIIIlll[4]);
                                        0;
                                    }
                                    if (F.lIlllllIIlIlI(Skills.getLevel((Skill)Skill.MAGIC), lllIIIIlll[34]) && F.lIlllllIIlIII(Skills.getLevel((Skill)Skill.MAGIC), lllIIIIlll[56])) {
                                        Magic.cast((Spell)SpellBook.Standard.WATER_BOLT, (NPC)NPCs.getNearest(nPC -> {
                                            int n2;
                                            if (F.lIlllllIlIIII(nPC.getId(), lllIIIIlll[54]) && F.lIlllllIIlIIl(nPC.isDead() ? 1 : 0)) {
                                                n2 = lllIIIIlll[0];
                                                0;
                                                
                                                }
                                            } else {
                                                n2 = lllIIIIlll[1];
                                            }
                                            return n2 != 0;
                                        }));
                                        Time.sleepTicks((int)lllIIIIlll[4]);
                                        0;
                                    }
                                    if (F.lIlllllIIlIlI(Skills.getLevel((Skill)Skill.MAGIC), lllIIIIlll[56]) && F.lIlllllIIlIII(Skills.getLevel((Skill)Skill.MAGIC), lllIIIIlll[58])) {
                                        Magic.cast((Spell)SpellBook.Standard.EARTH_BOLT, (NPC)NPCs.getNearest(nPC -> {
                                            int n2;
                                            if (F.lIlllllIlIIII(nPC.getId(), lllIIIIlll[54]) && F.lIlllllIIlIIl(nPC.isDead() ? 1 : 0)) {
                                                n2 = lllIIIIlll[0];
                                                0;
                                                if (((133 + 60 - 126 + 109 ^ 20 + 49 - -33 + 51) & (0x25 ^ 0x22 ^ (0x76 ^ 0x58) ^ -1)) > 3) {
                                                    return ((0xC ^ 0x2F ^ (0xEE ^ 0x9B)) & (0x58 ^ 0x3A ^ (0x75 ^ 0x41) ^ -1)) != 0;
                                                }
                                            } else {
                                                n2 = lllIIIIlll[1];
                                            }
                                            return n2 != 0;
                                        }));
                                        Time.sleepTicks((int)lllIIIIlll[4]);
                                        0;
                                    }
                                    if (F.lIlllllIIlIlI(Skills.getLevel((Skill)Skill.MAGIC), lllIIIIlll[58])) {
                                        Magic.cast((Spell)SpellBook.Standard.FIRE_BOLT, (NPC)NPCs.getNearest(nPC -> {
                                            int n2;
                                            if (F.lIlllllIlIIII(nPC.getId(), lllIIIIlll[54]) && F.lIlllllIIlIIl(nPC.isDead() ? 1 : 0)) {
                                                n2 = lllIIIIlll[0];
                                                0;
                                                if (1 == -1) {
                                                    return false;
                                                }
                                            } else {
                                                n2 = lllIIIIlll[1];
                                            }
                                            return n2 != 0;
                                        }));
                                        Time.sleepTicks((int)lllIIIIlll[4]);
                                        0;
                                    }
                                }
                            }
                            String[] stringArray = new String[lllIIIIlll[0]];
                            stringArray[F.lllIIIIlll[1]] = lllIIIIlII[lllIIIIlll[59]];
                            if (!F.lIlllllIIlIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) break block86;
                            if (F.lIlllllIIlllI(Players.getLocal().getWorldLocation().distanceTo(fz), lllIIIIlll[7]) && F.lIlllllIIlllI(Players.getLocal().getWorldLocation().distanceTo(fw), lllIIIIlll[52])) {
                                if (F.lIlllllIIIlll(Inventory.contains((int[])f.aW) ? 1 : 0) && F.lIlllllIIlIIl(Equipment.contains((int[])f.aW) ? 1 : 0)) {
                                    e.b(f.aW);
                                }
                                AccBuilderSotf.c = lllIIIIlII[lllIIIIlll[60]];
                                if (F.lIlllllIIlIIl(Dialog.isOpen() ? 1 : 0)) {
                                    Movement.walkTo((WorldPoint)fz);
                                    0;
                                    Time.sleepTicks((int)lllIIIIlll[0]);
                                    0;
                                }
                                String[] stringArray7 = new String[lllIIIIlll[6]];
                                stringArray7[F.lllIIIIlll[1]] = lllIIIIlII[lllIIIIlll[58]];
                                stringArray7[F.lllIIIIlll[0]] = lllIIIIlII[lllIIIIlll[3]];
                                stringArray7[F.lllIIIIlll[4]] = lllIIIIlII[lllIIIIlll[61]];
                                g.a(stringArray7);
                            }
                            if (F.lIlllllIIllll(Players.getLocal().getWorldLocation().distanceTo(fz), lllIIIIlll[7])) {
                                AccBuilderSotf.c = lllIIIIlII[lllIIIIlll[62]];
                                if (F.lIlllllIIlIIl(Dialog.isOpen() ? 1 : 0)) {
                                    String[] stringArray8 = new String[lllIIIIlll[0]];
                                    stringArray8[F.lllIIIIlll[1]] = lllIIIIlII[lllIIIIlll[63]];
                                    TileObjects.getNearest((String[])stringArray8).interact(lllIIIIlII[lllIIIIlll[64]]);
                                    Time.sleepTicks((int)lllIIIIlll[6]);
                                    0;
                                }
                                g.a(fG);
                            }
                            if (!F.lIlllllIIllll(Players.getLocal().getWorldLocation().distanceTo(fw), lllIIIIlll[52])) break block86;
                            if (F.lIlllllIIlllI(Players.getLocal().getWorldLocation().distanceTo(fx), lllIIIIlll[21])) {
                                AccBuilderSotf.c = lllIIIIlII[lllIIIIlll[65]];
                                Movement.walkTo((WorldPoint)fx);
                                0;
                                Time.sleepTicks((int)lllIIIIlll[0]);
                                0;
                            }
                            if (!F.lIlllllIIllll(Players.getLocal().getWorldLocation().distanceTo(fx), lllIIIIlll[21])) break block86;
                            AccBuilderSotf.c = lllIIIIlII[lllIIIIlll[66]];
                            if (F.lIlllllIIlIlI(Skills.getLevel((Skill)Skill.PRAYER), lllIIIIlll[67]) && F.lIlllllIIllII(Prayers.getPoints()) && F.lIlllllIIlIIl(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                            }
                            if (!F.lIlllllIIlIIl(Players.getLocal().isAnimating() ? 1 : 0)) break block90;
                            String[] stringArray9 = new String[lllIIIIlll[0]];
                            stringArray9[F.lllIIIIlll[1]] = lllIIIIlII[lllIIIIlll[67]];
                            if (!F.lIlllllIlIIIl(TileItems.getNearest((String[])stringArray9))) break block90;
                            if (F.lIlllllIIlIlI(Skills.getLevel((Skill)Skill.MAGIC), lllIIIIlll[35]) && !F.lIlllllIIlIlI(Skills.getLevel((Skill)Skill.MAGIC), lllIIIIlll[41])) break block91;
                            String[] stringArray10 = new String[lllIIIIlll[0]];
                            stringArray10[F.lllIIIIlll[1]] = lllIIIIlII[lllIIIIlll[68]];
                            if (!F.lIlllllIIlIIl(Inventory.contains((String[])stringArray10) ? 1 : 0)) break block92;
                        }
                        Magic.cast((Spell)SpellBook.Standard.FIRE_STRIKE, (NPC)NPCs.getNearest(nPC -> {
                            int n2;
                            if (F.lIlllllIIIlll(nPC.getName().equalsIgnoreCase(lllIIIIlII[lllIIIIlll[109]]) ? 1 : 0) && F.lIlllllIIlIIl(nPC.isDead() ? 1 : 0)) {
                                n2 = lllIIIIlll[0];
                                0;
                                if (1 <= 0) {
                                    return ((3 ^ (0x6E ^ 0x65)) & (69 + 26 - 61 + 125 ^ 130 + 61 - 137 + 97 ^ -1)) != 0;
                                }
                            } else {
                                n2 = lllIIIIlll[1];
                            }
                            return n2 != 0;
                        }));
                        Time.sleepTicks((int)lllIIIIlll[4]);
                        0;
                    }
                    String[] stringArray = new String[lllIIIIlll[0]];
                    stringArray[F.lllIIIIlll[1]] = lllIIIIlII[lllIIIIlll[5]];
                    if (F.lIlllllIIIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        if (F.lIlllllIIlIlI(Skills.getLevel((Skill)Skill.MAGIC), lllIIIIlll[41]) && F.lIlllllIIlIII(Skills.getLevel((Skill)Skill.MAGIC), lllIIIIlll[34])) {
                            Magic.cast((Spell)SpellBook.Standard.WIND_BOLT, (NPC)NPCs.getNearest(nPC -> {
                                int n2;
                                if (F.lIlllllIIIlll(nPC.getName().equalsIgnoreCase(lllIIIIlII[lllIIIIlll[108]]) ? 1 : 0) && F.lIlllllIIlIIl(nPC.isDead() ? 1 : 0)) {
                                    n2 = lllIIIIlll[0];
                                    0;
                                    if (3 < -1) {
                                        return ((0x71 ^ 0x3B ^ (0x2D ^ 0x75)) & (0xF6 ^ 0xAF ^ (0x44 ^ 0xF) ^ -1)) != 0;
                                    }
                                } else {
                                    n2 = lllIIIIlll[1];
                                }
                                return n2 != 0;
                            }));
                            Time.sleepTicks((int)lllIIIIlll[4]);
                            0;
                        }
                        if (F.lIlllllIIlIlI(Skills.getLevel((Skill)Skill.MAGIC), lllIIIIlll[34]) && F.lIlllllIIlIII(Skills.getLevel((Skill)Skill.MAGIC), lllIIIIlll[56])) {
                            Magic.cast((Spell)SpellBook.Standard.WATER_BOLT, (NPC)NPCs.getNearest(nPC -> {
                                int n2;
                                if (F.lIlllllIIIlll(nPC.getName().equalsIgnoreCase(lllIIIIlII[lllIIIIlll[107]]) ? 1 : 0) && F.lIlllllIIlIIl(nPC.isDead() ? 1 : 0)) {
                                    n2 = lllIIIIlll[0];
                                    0;
                                    if (1 >= (0xDF ^ 0x8B ^ (0xDD ^ 0x8D))) {
                                        return ((0x5C ^ 0x11 ^ 1) & (0xF ^ 0x32 ^ (0x7B ^ 0xA) ^ -1)) != 0;
                                    }
                                } else {
                                    n2 = lllIIIIlll[1];
                                }
                                return n2 != 0;
                            }));
                            Time.sleepTicks((int)lllIIIIlll[4]);
                            0;
                        }
                        if (F.lIlllllIIlIlI(Skills.getLevel((Skill)Skill.MAGIC), lllIIIIlll[56]) && F.lIlllllIIlIII(Skills.getLevel((Skill)Skill.MAGIC), lllIIIIlll[58])) {
                            Magic.cast((Spell)SpellBook.Standard.EARTH_BOLT, (NPC)NPCs.getNearest(nPC -> {
                                int n2;
                                if (F.lIlllllIIIlll(nPC.getName().equalsIgnoreCase(lllIIIIlII[lllIIIIlll[106]]) ? 1 : 0) && F.lIlllllIIlIIl(nPC.isDead() ? 1 : 0)) {
                                    n2 = lllIIIIlll[0];
                                    0;
                                    if (-2 >= 0) {
                                        return ((78 + 56 - 126 + 119 ^ (0x59 ^ 0x68)) & (0x64 ^ 0x1A ^ (0x7A ^ 0x4A) ^ -1)) != 0;
                                    }
                                } else {
                                    n2 = lllIIIIlll[1];
                                }
                                return n2 != 0;
                            }));
                            Time.sleepTicks((int)lllIIIIlll[4]);
                            0;
                        }
                        if (F.lIlllllIIlIlI(Skills.getLevel((Skill)Skill.MAGIC), lllIIIIlll[58])) {
                            Magic.cast((Spell)SpellBook.Standard.FIRE_BOLT, (NPC)NPCs.getNearest(nPC -> {
                                int n2;
                                if (F.lIlllllIIIlll(nPC.getName().equalsIgnoreCase(lllIIIIlII[lllIIIIlll[52]]) ? 1 : 0) && F.lIlllllIIlIIl(nPC.isDead() ? 1 : 0)) {
                                    n2 = lllIIIIlll[0];
                                    0;
                                    if (-3 > 0) {
                                        return false;
                                    }
                                } else {
                                    n2 = lllIIIIlll[1];
                                }
                                return n2 != 0;
                            }));
                            Time.sleepTicks((int)lllIIIIlll[4]);
                            0;
                        }
                    }
                }
                String[] stringArray = new String[lllIIIIlll[0]];
                stringArray[F.lllIIIIlll[1]] = lllIIIIlII[lllIIIIlll[69]];
                if (F.lIlllllIIlIll(TileItems.getNearest((String[])stringArray))) {
                    String[] stringArray11 = new String[lllIIIIlll[0]];
                    stringArray11[F.lllIIIIlll[1]] = lllIIIIlII[lllIIIIlll[70]];
                    TileItems.getNearest((String[])stringArray11).interact(lllIIIIlII[lllIIIIlll[71]]);
                    Time.sleepTicks((int)lllIIIIlll[4]);
                    0;
                }
            }
            if (F.lIlllllIlIIII(e.j(fE), lllIIIIlll[6])) {
                AccBuilderSotf.c = lllIIIIlII[lllIIIIlll[72]];
                if (F.lIlllllIIIlll(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                    Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                }
                if (F.lIlllllIIlIIl(Players.getLocal().isAnimating() ? 1 : 0)) {
                    String[] stringArray = new String[lllIIIIlll[0]];
                    stringArray[F.lllIIIIlll[1]] = lllIIIIlII[lllIIIIlll[33]];
                    TileObjects.getNearest((String[])stringArray).interact(lllIIIIlII[lllIIIIlll[73]]);
                    Time.sleepTicks((int)lllIIIIlll[0]);
                    0;
                }
            }
            if (F.lIlllllIlIIII(e.j(fE), lllIIIIlll[7])) {
                if (F.lIlllllIIllll(Players.getLocal().getWorldLocation().distanceTo(fy), lllIIIIlll[64]) && F.lIlllllIlIIII(Players.getLocal().getAnimation(), lllIIIIlll[74])) {
                    int[] nArray = new int[lllIIIIlll[0]];
                    nArray[F.lllIIIIlll[1]] = lllIIIIlll[13];
                    Inventory.getFirst((int[])nArray).interact(lllIIIIlII[lllIIIIlll[75]]);
                    Time.sleepTicks((int)lllIIIIlll[10]);
                    0;
                }
                String[] stringArray = new String[lllIIIIlll[0]];
                stringArray[F.lllIIIIlll[1]] = lllIIIIlII[lllIIIIlll[76]];
                if (F.lIlllllIIlIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    if (F.lIlllllIIlllI(Players.getLocal().getWorldLocation().distanceTo(fB), lllIIIIlll[7])) {
                        AccBuilderSotf.c = lllIIIIlII[lllIIIIlll[77]];
                        Movement.walkTo((WorldPoint)fB);
                        0;
                        Time.sleepTicks((int)lllIIIIlll[0]);
                        0;
                    }
                    if (F.lIlllllIIllll(Players.getLocal().getWorldLocation().distanceTo(fB), lllIIIIlll[7])) {
                        String[] stringArray12 = new String[lllIIIIlll[0]];
                        stringArray12[F.lllIIIIlll[1]] = lllIIIIlII[lllIIIIlll[78]];
                        if (F.lIlllllIIlIll(TileItems.getNearest((String[])stringArray12))) {
                            String[] stringArray13 = new String[lllIIIIlll[0]];
                            stringArray13[F.lllIIIIlll[1]] = lllIIIIlII[lllIIIIlll[79]];
                            TileItems.getNearest((String[])stringArray13).interact(lllIIIIlII[lllIIIIlll[80]]);
                            Time.sleepTicks((int)lllIIIIlll[4]);
                            0;
                        }
                    }
                }
                String[] stringArray14 = new String[lllIIIIlll[0]];
                stringArray14[F.lllIIIIlll[1]] = lllIIIIlII[lllIIIIlll[81]];
                if (F.lIlllllIIIlll(Inventory.contains((String[])stringArray14) ? 1 : 0)) {
                    String[] stringArray15 = new String[lllIIIIlll[0]];
                    stringArray15[F.lllIIIIlll[1]] = lllIIIIlII[lllIIIIlll[82]];
                    String[] stringArray16 = new String[lllIIIIlll[0]];
                    stringArray16[F.lllIIIIlll[1]] = lllIIIIlII[lllIIIIlll[83]];
                    Inventory.getFirst((String[])stringArray15).useOn(Inventory.getFirst((String[])stringArray16));
                    Time.sleepTicks((int)lllIIIIlll[4]);
                    0;
                }
            }
            if (F.lIlllllIlIIII(e.j(fE), lllIIIIlll[8])) {
                String[] stringArray = new String[lllIIIIlll[0]];
                stringArray[F.lllIIIIlll[1]] = lllIIIIlII[lllIIIIlll[84]];
                if (F.lIlllllIIlIIl(Equipment.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray17 = new String[lllIIIIlll[0]];
                    stringArray17[F.lllIIIIlll[1]] = lllIIIIlII[lllIIIIlll[85]];
                    if (F.lIlllllIIIlll(Inventory.contains((String[])stringArray17) ? 1 : 0)) {
                        String[] stringArray18 = new String[lllIIIIlll[0]];
                        stringArray18[F.lllIIIIlll[1]] = lllIIIIlII[lllIIIIlll[86]];
                        Inventory.getFirst((String[])stringArray18).interact(lllIIIIlII[lllIIIIlll[87]]);
                    }
                }
                if (F.lIlllllIIlllI(Players.getLocal().getWorldLocation().distanceTo(fC), lllIIIIlll[8])) {
                    AccBuilderSotf.c = lllIIIIlII[lllIIIIlll[88]];
                    Movement.walkTo((WorldPoint)fC);
                    0;
                    Time.sleepTicks((int)lllIIIIlll[0]);
                    0;
                }
                if (F.lIlllllIIllll(Players.getLocal().getWorldLocation().distanceTo(fC), lllIIIIlll[8])) {
                    AccBuilderSotf.c = lllIIIIlII[lllIIIIlll[89]];
                    if (F.lIlllllIIlIII(di, lllIIIIlll[0])) {
                        aN.pY += lllIIIIlll[0];
                        aN.u(AccBuilderSotf.m);
                        di += lllIIIIlll[0];
                        aN.pY = lllIIIIlll[1];
                    }
                    String[] stringArray19 = new String[lllIIIIlll[0]];
                    stringArray19[F.lllIIIIlll[1]] = lllIIIIlII[lllIIIIlll[90]];
                    TileObjects.getNearest((String[])stringArray19).interact(lllIIIIlII[lllIIIIlll[91]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (F.lIlllllIlIIII(e.j(fE), lllIIIIlll[10])) {
                            bl = lllIIIIlll[0];
                            0;
                            if ((0xA0 ^ 0xA5) == 0) {
                                return false;
                            }
                        } else {
                            bl = lllIIIIlll[1];
                        }
                        return bl;
                    }, (int)lllIIIIlll[92]);
                    0;
                }
            }
        }
    }

    private static boolean lIlllllIlIIIl(Object object) {
        return object == null;
    }

    private static boolean lIlllllIIllll(int n2, int n3) {
        return n2 <= n3;
    }

    private static void Q() {
        block64: {
            d var6;
            block63: {
                block62: {
                    block61: {
                        Object var13;
                        block60: {
                            block59: {
                                block58: {
                                    block57: {
                                        block56: {
                                            block55: {
                                                block54: {
                                                    block53: {
                                                        block52: {
                                                            block51: {
                                                                block50: {
                                                                    block49: {
                                                                        block48: {
                                                                            block47: {
                                                                                block46: {
                                                                                    block45: {
                                                                                        block44: {
                                                                                            block43: {
                                                                                                block42: {
                                                                                                    block41: {
                                                                                                        int[] nArray = new int[lllIIIIlll[0]];
                                                                                                        nArray[F.lllIIIIlll[1]] = lllIIIIlll[22];
                                                                                                        if (!F.lIlllllIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block41;
                                                                                                        int[] nArray2 = new int[lllIIIIlll[0]];
                                                                                                        nArray2[F.lllIIIIlll[1]] = lllIIIIlll[22];
                                                                                                        if (!F.lIlllllIIIlll(Bank.contains((int[])nArray2) ? 1 : 0)) break block42;
                                                                                                        int[] nArray3 = new int[lllIIIIlll[0]];
                                                                                                        nArray3[F.lllIIIIlll[1]] = lllIIIIlll[22];
                                                                                                        if (!F.lIlllllIIlIII(Bank.getFirst((int[])nArray3).getQuantity(), lllIIIIlll[29])) break block42;
                                                                                                    }
                                                                                                    var13 = new d(lllIIIIlll[22], lllIIIIlll[29], lllIIIIlll[93]);
                                                                                                    bv.add((d)var13);
                                                                                                    0;
                                                                                                }
                                                                                                int[] nArray = new int[lllIIIIlll[0]];
                                                                                                nArray[F.lllIIIIlll[1]] = lllIIIIlll[94];
                                                                                                if (F.lIlllllIIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                                                                                                    var13 = new d(lllIIIIlll[94], lllIIIIlll[0], lllIIIIlll[95]);
                                                                                                    bv.add((d)var13);
                                                                                                    0;
                                                                                                }
                                                                                                int[] nArray4 = new int[lllIIIIlll[0]];
                                                                                                nArray4[F.lllIIIIlll[1]] = lllIIIIlll[16];
                                                                                                if (!F.lIlllllIIIlll(Bank.contains((int[])nArray4) ? 1 : 0)) break block43;
                                                                                                int[] nArray5 = new int[lllIIIIlll[0]];
                                                                                                nArray5[F.lllIIIIlll[1]] = lllIIIIlll[16];
                                                                                                if (!F.lIlllllIIIlll(Bank.contains((int[])nArray5) ? 1 : 0)) break block44;
                                                                                                int[] nArray6 = new int[lllIIIIlll[0]];
                                                                                                nArray6[F.lllIIIIlll[1]] = lllIIIIlll[16];
                                                                                                if (!F.lIlllllIIlIII(Bank.getFirst((int[])nArray6).getQuantity(), lllIIIIlll[6])) break block44;
                                                                                            }
                                                                                            var13 = new d(lllIIIIlll[16], lllIIIIlll[6], lllIIIIlll[96]);
                                                                                            bv.add((d)var13);
                                                                                            0;
                                                                                        }
                                                                                        int[] nArray = new int[lllIIIIlll[0]];
                                                                                        nArray[F.lllIIIIlll[1]] = lllIIIIlll[20];
                                                                                        if (!F.lIlllllIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block45;
                                                                                        int[] nArray7 = new int[lllIIIIlll[0]];
                                                                                        nArray7[F.lllIIIIlll[1]] = lllIIIIlll[20];
                                                                                        if (!F.lIlllllIIIlll(Bank.contains((int[])nArray7) ? 1 : 0)) break block46;
                                                                                        int[] nArray8 = new int[lllIIIIlll[0]];
                                                                                        nArray8[F.lllIIIIlll[1]] = lllIIIIlll[20];
                                                                                        if (!F.lIlllllIIlIII(Bank.getFirst((int[])nArray8).getQuantity(), lllIIIIlll[25])) break block46;
                                                                                    }
                                                                                    var13 = new d(lllIIIIlll[20], lllIIIIlll[25], lllIIIIlll[11]);
                                                                                    bv.add((d)var13);
                                                                                    0;
                                                                                }
                                                                                int[] nArray = new int[lllIIIIlll[0]];
                                                                                nArray[F.lllIIIIlll[1]] = lllIIIIlll[18];
                                                                                if (!F.lIlllllIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block47;
                                                                                int[] nArray9 = new int[lllIIIIlll[0]];
                                                                                nArray9[F.lllIIIIlll[1]] = lllIIIIlll[18];
                                                                                if (!F.lIlllllIIIlll(Bank.contains((int[])nArray9) ? 1 : 0)) break block48;
                                                                                int[] nArray10 = new int[lllIIIIlll[0]];
                                                                                nArray10[F.lllIIIIlll[1]] = lllIIIIlll[18];
                                                                                if (!F.lIlllllIIlIII(Bank.getFirst((int[])nArray10).getQuantity(), lllIIIIlll[25])) break block48;
                                                                            }
                                                                            var13 = new d(lllIIIIlll[18], lllIIIIlll[25], lllIIIIlll[11]);
                                                                            bv.add((d)var13);
                                                                            0;
                                                                        }
                                                                        int[] nArray = new int[lllIIIIlll[0]];
                                                                        nArray[F.lllIIIIlll[1]] = lllIIIIlll[27];
                                                                        if (!F.lIlllllIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block49;
                                                                        int[] nArray11 = new int[lllIIIIlll[0]];
                                                                        nArray11[F.lllIIIIlll[1]] = lllIIIIlll[27];
                                                                        if (!F.lIlllllIIIlll(Bank.contains((int[])nArray11) ? 1 : 0)) break block50;
                                                                        int[] nArray12 = new int[lllIIIIlll[0]];
                                                                        nArray12[F.lllIIIIlll[1]] = lllIIIIlll[27];
                                                                        if (!F.lIlllllIIlIII(Bank.getFirst((int[])nArray12).getQuantity(), lllIIIIlll[25])) break block50;
                                                                    }
                                                                    var13 = new d(lllIIIIlll[27], lllIIIIlll[25], lllIIIIlll[11]);
                                                                    bv.add((d)var13);
                                                                    0;
                                                                }
                                                                int[] nArray = new int[lllIIIIlll[0]];
                                                                nArray[F.lllIIIIlll[1]] = lllIIIIlll[26];
                                                                if (!F.lIlllllIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block51;
                                                                int[] nArray13 = new int[lllIIIIlll[0]];
                                                                nArray13[F.lllIIIIlll[1]] = lllIIIIlll[26];
                                                                if (!F.lIlllllIIIlll(Bank.contains((int[])nArray13) ? 1 : 0)) break block52;
                                                                int[] nArray14 = new int[lllIIIIlll[0]];
                                                                nArray14[F.lllIIIIlll[1]] = lllIIIIlll[26];
                                                                if (!F.lIlllllIIlIII(Bank.getFirst((int[])nArray14).getQuantity(), lllIIIIlll[25])) break block52;
                                                            }
                                                            var13 = new d(lllIIIIlll[26], lllIIIIlll[25], lllIIIIlll[11]);
                                                            bv.add((d)var13);
                                                            0;
                                                        }
                                                        int[] nArray = new int[lllIIIIlll[0]];
                                                        nArray[F.lllIIIIlll[1]] = lllIIIIlll[24];
                                                        if (!F.lIlllllIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block53;
                                                        int[] nArray15 = new int[lllIIIIlll[0]];
                                                        nArray15[F.lllIIIIlll[1]] = lllIIIIlll[24];
                                                        if (!F.lIlllllIIIlll(Bank.contains((int[])nArray15) ? 1 : 0)) break block54;
                                                        int[] nArray16 = new int[lllIIIIlll[0]];
                                                        nArray16[F.lllIIIIlll[1]] = lllIIIIlll[24];
                                                        if (!F.lIlllllIIlIII(Bank.getFirst((int[])nArray16).getQuantity(), lllIIIIlll[28])) break block54;
                                                    }
                                                    var13 = new d(lllIIIIlll[24], lllIIIIlll[28], lllIIIIlll[97]);
                                                    bv.add((d)var13);
                                                    0;
                                                }
                                                int[] nArray = new int[lllIIIIlll[0]];
                                                nArray[F.lllIIIIlll[1]] = lllIIIIlll[17];
                                                if (!F.lIlllllIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block55;
                                                int[] nArray17 = new int[lllIIIIlll[0]];
                                                nArray17[F.lllIIIIlll[1]] = lllIIIIlll[17];
                                                if (!F.lIlllllIIIlll(Bank.contains((int[])nArray17) ? 1 : 0)) break block56;
                                                int[] nArray18 = new int[lllIIIIlll[0]];
                                                nArray18[F.lllIIIIlll[1]] = lllIIIIlll[17];
                                                if (!F.lIlllllIIlIII(Bank.getFirst((int[])nArray18).getQuantity(), lllIIIIlll[25])) break block56;
                                            }
                                            var13 = new d(lllIIIIlll[17], lllIIIIlll[25], lllIIIIlll[11]);
                                            bv.add((d)var13);
                                            0;
                                        }
                                        int[] nArray = new int[lllIIIIlll[0]];
                                        nArray[F.lllIIIIlll[1]] = lllIIIIlll[17];
                                        if (!F.lIlllllIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block57;
                                        int[] nArray19 = new int[lllIIIIlll[0]];
                                        nArray19[F.lllIIIIlll[1]] = lllIIIIlll[17];
                                        if (!F.lIlllllIIIlll(Bank.contains((int[])nArray19) ? 1 : 0)) break block58;
                                        int[] nArray20 = new int[lllIIIIlll[0]];
                                        nArray20[F.lllIIIIlll[1]] = lllIIIIlll[17];
                                        if (!F.lIlllllIIlIII(Bank.getFirst((int[])nArray20).getQuantity(), lllIIIIlll[25])) break block58;
                                    }
                                    var13 = new d(lllIIIIlll[17], lllIIIIlll[25], lllIIIIlll[11]);
                                    bv.add((d)var13);
                                    0;
                                }
                                int[] nArray = new int[lllIIIIlll[0]];
                                nArray[F.lllIIIIlll[1]] = lllIIIIlll[15];
                                if (F.lIlllllIIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                                    var13 = new d(lllIIIIlll[15], lllIIIIlll[0], lllIIIIlll[98]);
                                    bv.add((d)var13);
                                    0;
                                }
                                int[] nArray21 = new int[lllIIIIlll[0]];
                                nArray21[F.lllIIIIlll[1]] = lllIIIIlll[13];
                                if (!F.lIlllllIIIlll(Bank.contains((int[])nArray21) ? 1 : 0)) break block59;
                                int[] nArray22 = new int[lllIIIIlll[0]];
                                nArray22[F.lllIIIIlll[1]] = lllIIIIlll[13];
                                if (!F.lIlllllIIIlll(Bank.contains((int[])nArray22) ? 1 : 0)) break block60;
                                int[] nArray23 = new int[lllIIIIlll[0]];
                                nArray23[F.lllIIIIlll[1]] = lllIIIIlll[13];
                                if (!F.lIlllllIIlIII(Bank.getFirst((int[])nArray23).getQuantity(), lllIIIIlll[11])) break block60;
                            }
                            var13 = new d(lllIIIIlll[13], lllIIIIlll[11], lllIIIIlll[99]);
                            bv.add((d)var13);
                            0;
                        }
                        int[] nArray = new int[lllIIIIlll[0]];
                        nArray[F.lllIIIIlll[1]] = lllIIIIlll[14];
                        if (F.lIlllllIIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                            var13 = new d(lllIIIIlll[14], lllIIIIlll[0], lllIIIIlll[100]);
                            bv.add((d)var13);
                            0;
                        }
                        int[] nArray24 = new int[lllIIIIlll[0]];
                        nArray24[F.lllIIIIlll[1]] = lllIIIIlll[15];
                        if (F.lIlllllIIlIIl(Bank.contains((int[])nArray24) ? 1 : 0)) {
                            var13 = new d(lllIIIIlll[15], lllIIIIlll[0], lllIIIIlll[98]);
                            bv.add((d)var13);
                            0;
                        }
                        if (F.lIlllllIIlIIl(Bank.contains((Predicate)(var13 = item -> item.getName().toLowerCase().contains(lllIIIIlII[lllIIIIlll[105]]))) ? 1 : 0)) {
                            var6 = new d(lllIIIIlll[101], lllIIIIlll[8], lllIIIIlll[102]);
                            bv.add(var6);
                            0;
                        }
                        int[] nArray25 = new int[lllIIIIlll[0]];
                        nArray25[F.lllIIIIlll[1]] = lllIIIIlll[30];
                        if (!F.lIlllllIIIlll(Bank.contains((int[])nArray25) ? 1 : 0)) break block61;
                        int[] nArray26 = new int[lllIIIIlll[0]];
                        nArray26[F.lllIIIIlll[1]] = lllIIIIlll[30];
                        if (!F.lIlllllIIIlll(Bank.contains((int[])nArray26) ? 1 : 0)) break block62;
                        int[] nArray27 = new int[lllIIIIlll[0]];
                        nArray27[F.lllIIIIlll[1]] = lllIIIIlll[30];
                        if (!F.lIlllllIIlIII(Bank.getFirst((int[])nArray27).getQuantity(), lllIIIIlll[7])) break block62;
                    }
                    var6 = new d(lllIIIIlll[30], lllIIIIlll[7], j.cf);
                    bv.add(var6);
                    0;
                }
                int[] nArray = new int[lllIIIIlll[0]];
                nArray[F.lllIIIIlll[1]] = lllIIIIlll[12];
                if (!F.lIlllllIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block63;
                int[] nArray28 = new int[lllIIIIlll[0]];
                nArray28[F.lllIIIIlll[1]] = lllIIIIlll[12];
                if (!F.lIlllllIIIlll(Bank.contains((int[])nArray28) ? 1 : 0)) break block64;
                int[] nArray29 = new int[lllIIIIlll[0]];
                nArray29[F.lllIIIIlll[1]] = lllIIIIlll[12];
                if (!F.lIlllllIIlIII(Bank.getFirst((int[])nArray29).getQuantity(), lllIIIIlll[11])) break block64;
            }
            var6 = new d(lllIIIIlll[12], lllIIIIlll[11], lllIIIIlll[103]);
            bv.add(var6);
            0;
        }
    }

    static {
        F.lIlllllIIIlIl();
        F.lIlllllIIIIll();
        fv = new WorldPoint(lllIIIIlll[110], lllIIIIlll[111], lllIIIIlll[1]);
        fw = new WorldPoint(lllIIIIlll[112], lllIIIIlll[113], lllIIIIlll[1]);
        fx = new WorldPoint(lllIIIIlll[114], lllIIIIlll[115], lllIIIIlll[1]);
        fy = new WorldPoint(lllIIIIlll[116], lllIIIIlll[117], lllIIIIlll[1]);
        fz = new WorldPoint(lllIIIIlll[112], lllIIIIlll[118], lllIIIIlll[1]);
        fA = new WorldPoint(lllIIIIlll[119], lllIIIIlll[120], lllIIIIlll[1]);
        fB = new WorldPoint(lllIIIIlll[121], lllIIIIlll[122], lllIIIIlll[1]);
        fC = new WorldPoint(lllIIIIlll[123], lllIIIIlll[124], lllIIIIlll[1]);
        fD = new WorldPoint(lllIIIIlll[125], lllIIIIlll[126], lllIIIIlll[1]);
        bv = new ArrayList<d>();
        fE = lllIIIIlll[127];
        fF = lllIIIIlll[1];
        String[] stringArray = new String[lllIIIIlll[21]];
        stringArray[F.lllIIIIlll[1]] = lllIIIIlII[lllIIIIlll[128]];
        stringArray[F.lllIIIIlll[0]] = lllIIIIlII[lllIIIIlll[129]];
        stringArray[F.lllIIIIlll[4]] = lllIIIIlII[lllIIIIlll[130]];
        stringArray[F.lllIIIIlll[6]] = lllIIIIlII[lllIIIIlll[131]];
        stringArray[F.lllIIIIlll[7]] = lllIIIIlII[lllIIIIlll[132]];
        stringArray[F.lllIIIIlll[8]] = lllIIIIlII[lllIIIIlll[133]];
        stringArray[F.lllIIIIlll[10]] = lllIIIIlII[lllIIIIlll[134]];
        stringArray[F.lllIIIIlll[19]] = lllIIIIlII[lllIIIIlll[135]];
        fG = stringArray;
        da = lllIIIIlII[lllIIIIlll[136]];
        h = "Lost city " + da;
    }

    private static String lIlllllIIIIII(String var20, String var15) {
        try {
            SecretKeySpec var21 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var15.getBytes(StandardCharsets.UTF_8)), lllIIIIlll[21]), "DES");
            Cipher var23 = Cipher.getInstance("DES");
            var23.init(lllIIIIlll[4], var21);
            return new String(var23.doFinal(Base64.getDecoder().decode(var20.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    private static boolean an() {
        void var3;
        int[] nArray = new int[lllIIIIlll[23]];
        nArray[F.lllIIIIlll[1]] = lllIIIIlll[12];
        nArray[F.lllIIIIlll[0]] = lllIIIIlll[13];
        nArray[F.lllIIIIlll[4]] = lllIIIIlll[14];
        nArray[F.lllIIIIlll[6]] = lllIIIIlll[15];
        nArray[F.lllIIIIlll[7]] = lllIIIIlll[16];
        nArray[F.lllIIIIlll[8]] = lllIIIIlll[17];
        nArray[F.lllIIIIlll[10]] = lllIIIIlll[18];
        nArray[F.lllIIIIlll[19]] = lllIIIIlll[20];
        nArray[F.lllIIIIlll[21]] = lllIIIIlll[22];
        int[] nArray2 = nArray;
        int var9 = lllIIIIlll[1];
        while (F.lIlllllIIlIII(var9, ((void)var3).length)) {
            int[] nArray3 = new int[lllIIIIlll[0]];
            nArray3[F.lllIIIIlll[1]] = var3[var9];
            if (F.lIlllllIIlIIl(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return lllIIIIlll[1];
            }
            ++var9;
            0;
            
            return ((0xD ^ 0x1B ^ (0x63 ^ 0x54)) & (0xB9 ^ 0x8E ^ (0x2D ^ 0x3B) ^ -1)) != 0;
        }
        return lllIIIIlll[0];
    }

    @Override
    public boolean ae() {
        return lllIIIIlll[1];
    }

    private static boolean lIlllllIIlIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlllllIIlIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIlllllIIllII(int n2) {
        return n2 > 0;
    }

    private static String lIllllIllllIl(String var24, String var10) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var10.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var1 = Cipher.getInstance("Blowfish");
            var1.init(lllIIIIlll[4], var2);
            return new String(var1.doFinal(Base64.getDecoder().decode(var24.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    private static int lIlllllIIIllI(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean lIlllllIIIlll(int n2) {
        return n2 != 0;
    }

    private static boolean lIlllllIIlIll(Object object) {
        return object != null;
    }

    private static void lIlllllIIIIll() {
        lllIIIIlII = new String[lllIIIIlll[137]];
        F.lllIIIIlII[F.lllIIIIlll[1]] = F."Finished buying items, switching back to quest";
        F.lllIIIIlII[F.lllIIIIlll[0]] = F."- Crafting";
        F.lllIIIIlII[F.lllIIIIlll[4]] = F."- Woodcutting";
        F.lllIIIIlII[F.lllIIIIlll[6]] = F."- Prayer";
        F.lllIIIIlII[F.lllIIIIlll[7]] = F."";
        F.lllIIIIlII[F.lllIIIIlll[8]] = F."Nav to bank";
        F.lllIIIIlII[F.lllIIIIlll[10]] = F."Handling banking";
        F.lllIIIIlII[F.lllIIIIlll[19]] = F."We are missing quest supplies, switching to BUYING";
        F.lllIIIIlII[F.lllIIIIlll[21]] = F."We are missing quest supplies, switching to BUYING";
        F.lllIIIIlII[F.lllIIIIlll[23]] = F."Drink";
        F.lllIIIIlII[F.lllIIIIlll[11]] = F."Shark";
        F.lllIIIIlII[F.lllIIIIlll[31]] = F."Shark";
        F.lllIIIIlII[F.lllIIIIlll[29]] = F."Eat";
        F.lllIIIIlII[F.lllIIIIlll[35]] = F."Drink";
        F.lllIIIIlII[F.lllIIIIlll[36]] = F."Nav to start";
        F.lllIIIIlII[F.lllIIIIlll[37]] = F."Start quest";
        F.lllIIIIlII[F.lllIIIIlll[38]] = F."Warrior";
        F.lllIIIIlII[F.lllIIIIlll[41]] = F."Nav to tree";
        F.lllIIIIlII[F.lllIIIIlll[42]] = F."Handle midget";
        F.lllIIIIlII[F.lllIIIIlll[43]] = F."Shamus";
        F.lllIIIIlII[F.lllIIIIlll[45]] = F."Chop";
        F.lllIIIIlII[F.lllIIIIlll[46]] = F."Shamus";
        F.lllIIIIlII[F.lllIIIIlll[47]] = F."Shamus";
        F.lllIIIIlII[F.lllIIIIlll[34]] = F."Bronze axe";
        F.lllIIIIlII[F.lllIIIIlll[49]] = F."Drop axes";
        F.lllIIIIlII[F.lllIIIIlll[50]] = F."Bronze axe";
        F.lllIIIIlII[F.lllIIIIlll[51]] = F."Drop";
        F.lllIIIIlII[F.lllIIIIlll[53]] = F."Nav to tree";
        F.lllIIIIlII[F.lllIIIIlll[55]] = F."Dramen tree";
        F.lllIIIIlII[F.lllIIIIlll[56]] = F."Chop down";
        F.lllIIIIlII[F.lllIIIIlll[48]] = F."Killing spirit";
        F.lllIIIIlII[F.lllIIIIlll[2]] = F."Chaos rune";
        F.lllIIIIlII[F.lllIIIIlll[57]] = F."Chaos rune";
        F.lllIIIIlII[F.lllIIIIlll[59]] = F."Bronze axe";
        F.lllIIIIlII[F.lllIIIIlll[60]] = F."Nav to ladder";
        F.lllIIIIlII[F.lllIIIIlll[58]] = F."Can I journey on this ship?";
        F.lllIIIIlII[F.lllIIIIlll[3]] = F."Search away, I have nothing to hide.";
        F.lllIIIIlII[F.lllIIIIlll[61]] = F."Ok.";
        F.lllIIIIlII[F.lllIIIIlll[62]] = F."Talk monk";
        F.lllIIIIlII[F.lllIIIIlll[63]] = F."Ladder";
        F.lllIIIIlII[F.lllIIIIlll[64]] = F."Climb-down";
        F.lllIIIIlII[F.lllIIIIlll[65]] = F."Nav to zombies";
        F.lllIIIIlII[F.lllIIIIlll[66]] = F."Getting axe";
        F.lllIIIIlII[F.lllIIIIlll[67]] = F."Bronze axe";
        F.lllIIIIlII[F.lllIIIIlll[68]] = F."Chaos rune";
        F.lllIIIIlII[F.lllIIIIlll[5]] = F."Chaos rune";
        F.lllIIIIlII[F.lllIIIIlll[69]] = F."Bronze axe";
        F.lllIIIIlII[F.lllIIIIlll[70]] = F."Bronze axe";
        F.lllIIIIlII[F.lllIIIIlll[71]] = F."Take";
        F.lllIIIIlII[F.lllIIIIlll[72]] = F."Cutting tree";
        F.lllIIIIlII[F.lllIIIIlll[33]] = F."Dramen tree";
        F.lllIIIIlII[F.lllIIIIlll[73]] = F."Chop down";
        F.lllIIIIlII[F.lllIIIIlll[75]] = F."Break";
        F.lllIIIIlII[F.lllIIIIlll[76]] = F."Knife";
        F.lllIIIIlII[F.lllIIIIlll[77]] = F."Nav to knife";
        F.lllIIIIlII[F.lllIIIIlll[78]] = F."Knife";
        F.lllIIIIlII[F.lllIIIIlll[79]] = F."Knife";
        F.lllIIIIlII[F.lllIIIIlll[80]] = F."Take";
        F.lllIIIIlII[F.lllIIIIlll[81]] = F."Knife";
        F.lllIIIIlII[F.lllIIIIlll[82]] = F."Knife";
        F.lllIIIIlII[F.lllIIIIlll[83]] = F."Dramen branch";
        F.lllIIIIlII[F.lllIIIIlll[84]] = F."Dramen staff";
        F.lllIIIIlII[F.lllIIIIlll[85]] = F."Dramen staff";
        F.lllIIIIlII[F.lllIIIIlll[86]] = F."Dramen staff";
        F.lllIIIIlII[F.lllIIIIlll[87]] = F."Wield";
        F.lllIIIIlII[F.lllIIIIlll[88]] = F."Nav to shed";
        F.lllIIIIlII[F.lllIIIIlll[89]] = F."Entering shed";
        F.lllIIIIlII[F.lllIIIIlll[90]] = F."Door";
        F.lllIIIIlII[F.lllIIIIlll[91]] = F."Open";
        F.lllIIIIlII[F.lllIIIIlll[105]] = F."ring of wealth (";
        F.lllIIIIlII[F.lllIIIIlll[52]] = F."Zombie";
        F.lllIIIIlII[F.lllIIIIlll[106]] = F."Zombie";
        F.lllIIIIlII[F.lllIIIIlll[107]] = F."Zombie";
        F.lllIIIIlII[F.lllIIIIlll[108]] = F."Zombie";
        F.lllIIIIlII[F.lllIIIIlll[109]] = F."Zombie";
        F.lllIIIIlII[F.lllIIIIlll[128]] = F."Do you know any good adventures I can go on?";
        F.lllIIIIlII[F.lllIIIIlll[129]] = F."I don't think you've found a good adventure at all!";
        F.lllIIIIlII[F.lllIIIIlll[130]] = F."What makes you think it's out here?";
        F.lllIIIIlII[F.lllIIIIlll[131]] = F."If it's hidden how are you planning to find it?";
        F.lllIIIIlII[F.lllIIIIlll[132]] = F."Looks like you don't know either.";
        F.lllIIIIlII[F.lllIIIIlll[133]] = F."How does it fit in a shed then?";
        F.lllIIIIlII[F.lllIIIIlll[134]] = F."Well that is a risk I will have to take.";
        F.lllIIIIlII[F.lllIIIIlll[135]] = F."Yes.";
        F.lllIIIIlII[F.lllIIIIlll[136]] = F."";
    }
}

