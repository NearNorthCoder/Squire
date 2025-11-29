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
package -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l;

import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.a;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ab;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.an;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.aq;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ar;
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

public class D
implements ab {
    public static final /* synthetic */ WorldPoint eS;
    public static final /* synthetic */ WorldPoint eP;
    public static final /* synthetic */ WorldPoint eT;
    public static /* synthetic */ int eX;
    public static /* synthetic */ String[] eY;
    public static final /* synthetic */ WorldPoint eV;
    public static /* synthetic */ int eW;
    public static final /* synthetic */ WorldPoint eU;
    public static final /* synthetic */ WorldPoint eO;
    public static final /* synthetic */ WorldPoint eR;
    public static /* synthetic */ String h;
    public static final /* synthetic */ WorldPoint eN;
    public static /* synthetic */ boolean bv;
    public static /* synthetic */ String dc;
    private static /* synthetic */ String[] llIllllII;
    public static /* synthetic */ List<d> bx;
    private static /* synthetic */ int[] llIllllll;
    static /* synthetic */ int dk;
    public static final /* synthetic */ WorldPoint eQ;

    private static int lIllllIIIllI(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean lIllllIIllIl(int n2) {
        return n2 < 0;
    }

    private static boolean lIllllIIlIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIllllIIlIII(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIllllIIIlIl() {
        llIllllll = new int[138];
        D.llIllllll[0] = 1;
        D.llIllllll[1] = (0x93 ^ 0xB2 ^ (0x79 ^ 0x46)) & (0x70 ^ 0x45 ^ (0x8F ^ 0xA4) ^ -1);
        D.llIllllll[2] = 0x36 ^ 0x41 ^ (0x7D ^ 0x15);
        D.llIllllll[3] = 31 + 134 - -9 + 4 ^ 73 + 121 - 150 + 106;
        D.llIllllll[4] = 2;
        D.llIllllll[5] = 0x32 ^ 0x1F;
        D.llIllllll[6] = 3;
        D.llIllllll[7] = 0x61 ^ 0x65;
        D.llIllllll[8] = 0x9A ^ 0x9F;
        D.llIllllll[9] = 0xFFFFFBFD & 0x178A;
        D.llIllllll[10] = 0xBE ^ 0xB8;
        D.llIllllll[11] = 89 + 48 - 87 + 78 ^ 68 + 109 - 92 + 53;
        D.llIllllll[12] = -(0xFFFFF899 & 0x47FF) & (0xFFFFFFFF & 0x5FDF);
        D.llIllllll[13] = -(0xFFFFEEA5 & 0x517F) & (0xFFFFFF6F & 0x5FFC);
        D.llIllllll[14] = -(0xFFFFDBFF & 0x7619) & (0xFFFFFFFF & 0x575F);
        D.llIllllll[15] = -(0xFFFFFCFA & 0x670D) & (0xFFFFFDFF & 0x6FFF);
        D.llIllllll[16] = -(0xFFFFDE7F & 0x33FD) & (0xFFFFDFFE & 0x3BFF);
        D.llIllllll[17] = -(0xFFFFBFAB & 0x7956) & (0xFFFFFBFF & 0x3F2F);
        D.llIllllll[18] = -(0xFFFFE93E & 0x7FD7) & (0xFFFFFF3F & 0x6BFF);
        D.llIllllll[19] = 0xB ^ 0xC;
        D.llIllllll[20] = -(0xFFFFDF95 & 0x6DEB) & (0xFFFFCFFF & 0x7FAC);
        D.llIllllll[21] = 172 + 136 - 266 + 143 ^ 99 + 72 - 114 + 120;
        D.llIllllll[22] = -(0xFFFFFD4B & 0x7AF5) & (0xFFFFFDDF & 0x7BE1);
        D.llIllllll[23] = 2 ^ 0xB;
        D.llIllllll[24] = 0xFFFFDE73 & 0x23BE;
        D.llIllllll[25] = -(0xFFFF8C37 & 0x7BDD) & (0xFFFFEFFD & 0x1BFE);
        D.llIllllll[26] = 0xFFFFFE3F & 0x3EB;
        D.llIllllll[27] = -(0xFFFFEC5B & 0x7FE7) & (0xFFFFFFEF & 0x6E7F);
        D.llIllllll[28] = 154 + 45 - 145 + 146;
        D.llIllllll[29] = 0xE ^ 0x48 ^ (0x15 ^ 0x5F);
        D.llIllllll[30] = -(0xFFFFE7B7 & 0x5A4F) & (0xFFFFF3DF & 0x7F77);
        D.llIllllll[31] = 0xF6 ^ 0xB5 ^ (0xC0 ^ 0x88);
        D.llIllllll[32] = -(0xFFFFDF4D & 0x24B3) & (0xFFFF9FF3 & 0x67EF);
        D.llIllllll[33] = 7 ^ 0x35;
        D.llIllllll[34] = 0xB1 ^ 0xA6;
        D.llIllllll[35] = 0x82 ^ 0x8F;
        D.llIllllll[36] = 0x8A ^ 0x84;
        D.llIllllll[37] = 134 + 112 - 134 + 68 ^ 3 + 83 - -97 + 4;
        D.llIllllll[38] = 32 + 67 - -7 + 22 ^ 66 + 130 - 99 + 47;
        D.llIllllll[39] = 0xFFFFACCB & 0x5F77;
        D.llIllllll[40] = -(0xFFFFFAB1 & 0x177F) & (0xFFFFFEF9 & 0x1FBF);
        D.llIllllll[41] = 0xB1 ^ 0x93 ^ (0xA7 ^ 0x94);
        D.llIllllll[42] = 0x18 ^ 0xA;
        D.llIllllll[43] = 0x40 ^ 0x3D ^ (0x53 ^ 0x3D);
        D.llIllllll[44] = -(0xFFFFF8D7 & 0x37BD) & (0xFFFFFBFF & 0x3DFD);
        D.llIllllll[45] = 109 + 172 - 132 + 33 ^ 99 + 35 - -6 + 22;
        D.llIllllll[46] = 0x70 ^ 0x65;
        D.llIllllll[47] = 0xCC ^ 0xB8 ^ (0x4B ^ 0x29);
        D.llIllllll[48] = 0x53 ^ 0x4D;
        D.llIllllll[49] = 9 + 104 - 42 + 58 ^ 87 + 8 - -35 + 23;
        D.llIllllll[50] = 0xB7 ^ 0xAE;
        D.llIllllll[51] = 3 ^ 0x5D ^ (0x75 ^ 0x31);
        D.llIllllll[52] = 0x79 ^ 0x3F;
        D.llIllllll[53] = 27 + 132 - 9 + 2 ^ 92 + 62 - 104 + 81;
        D.llIllllll[54] = -(0xFFFF9DBF & 0x7A65) & (0xFFFFFCBF & 0x1FEF);
        D.llIllllll[55] = 0x6B ^ 0x70 ^ (0x2C ^ 0x2B);
        D.llIllllll[56] = 0x35 ^ 0x28;
        D.llIllllll[57] = 0x27 ^ 0x65 ^ (0x77 ^ 0x15);
        D.llIllllll[58] = 0x66 ^ 0x15 ^ (0xDC ^ 0x8C);
        D.llIllllll[59] = 0x8F ^ 0xAE;
        D.llIllllll[60] = 5 + 71 - -52 + 14 ^ 22 + 73 - -66 + 11;
        D.llIllllll[61] = 0x66 ^ 0x43;
        D.llIllllll[62] = 0x51 ^ 0x3E ^ (0xD0 ^ 0x99);
        D.llIllllll[63] = 0x87 ^ 0xA0;
        D.llIllllll[64] = 0x21 ^ 9;
        D.llIllllll[65] = 0xC5 ^ 0xAA ^ (0x36 ^ 0x70);
        D.llIllllll[66] = 0x22 ^ 8;
        D.llIllllll[67] = 0x3D ^ 0x16;
        D.llIllllll[68] = 57 + 119 - 51 + 25 ^ 177 + 109 - 138 + 38;
        D.llIllllll[69] = 0xB8 ^ 0x96;
        D.llIllllll[70] = 3 ^ 0x2C;
        D.llIllllll[71] = 0x7E ^ 0x77 ^ (0xFC ^ 0xC5);
        D.llIllllll[72] = 0x56 ^ 0x67;
        D.llIllllll[73] = 0x41 ^ 0x72;
        D.llIllllll[74] = -1;
        D.llIllllll[75] = 0x5C ^ 0x68;
        D.llIllllll[76] = 0x56 ^ 0x12 ^ (0xC7 ^ 0xB6);
        D.llIllllll[77] = 0x21 ^ 0x3F ^ (0x64 ^ 0x4C);
        D.llIllllll[78] = 0x53 ^ 0x64;
        D.llIllllll[79] = 41 + 12 - -14 + 124 ^ 59 + 88 - 124 + 112;
        D.llIllllll[80] = 0x31 ^ 0x74 ^ (0x3E ^ 0x42);
        D.llIllllll[81] = 7 ^ 0x79 ^ (0x24 ^ 0x60);
        D.llIllllll[82] = 0x99 ^ 0xA2;
        D.llIllllll[83] = 0xA5 ^ 0x99;
        D.llIllllll[84] = 0x6C ^ 0x38 ^ (0xF8 ^ 0x91);
        D.llIllllll[85] = 0x51 ^ 0x6F;
        D.llIllllll[86] = 132 + 82 - 149 + 73 ^ 73 + 144 - 166 + 130;
        D.llIllllll[87] = 0x95 ^ 0xBC ^ (0x75 ^ 0x1C);
        D.llIllllll[88] = 0xF7 ^ 0xB6;
        D.llIllllll[89] = 206 + 46 - 183 + 163 ^ 107 + 88 - 162 + 137;
        D.llIllllll[90] = 0xBA ^ 0xA6 ^ (0x9C ^ 0xC3);
        D.llIllllll[91] = 0x48 ^ 0xC;
        D.llIllllll[92] = -(79 + 67 - 59 + 58) & (0xFFFFBBF5 & 0x5DFE);
        D.llIllllll[93] = 0xFFFFCFE2 & 0x379D;
        D.llIllllll[94] = -(0xFFFFE3FF & 0x5C16) & (0xFFFFFEDF & 0x6FFF);
        D.llIllllll[95] = -(0xFFFFD6FC & 0x2D47) & (0xFFFFDFFF & 0x7DCB);
        D.llIllllll[96] = 0xFFFFBEFF & 0x7378;
        D.llIllllll[97] = 31 + 91 - 99 + 108 + (46 + 31 - -26 + 44) - (1 ^ 0x70) + (0 ^ 0xF);
        D.llIllllll[98] = 0xFFFF9B6E & 0x6FF9;
        D.llIllllll[99] = 0xFFFFFBBF & 0x7D8;
        D.llIllllll[100] = 0xFFFFA73F & 0x7BFC;
        D.llIllllll[101] = -(0xFFFFB1FE & 0x5F15) & (0xFFFFFFFF & 0x3FDF);
        D.llIllllll[102] = -(0xFFFFFEFB & 0x1345) & (0xFFFFFFF9 & 0x73EE);
        D.llIllllll[103] = -(0xFFFFE965 & 0x76FB) & (0xFFFFF7F7 & 0x6BEC);
        D.llIllllll[104] = 97 + 42 - 93 + 202 ^ 72 + 0 - 15 + 99;
        D.llIllllll[105] = 0xF4 ^ 0xA9 ^ (0xAB ^ 0xB3);
        D.llIllllll[106] = 0xF7 ^ 0xB0;
        D.llIllllll[107] = 87 + 91 - -18 + 12 ^ 147 + 17 - 32 + 20;
        D.llIllllll[108] = 91 + 47 - 40 + 139 ^ 39 + 12 - -56 + 57;
        D.llIllllll[109] = 10 + 185 - 194 + 211 ^ 58 + 125 - 175 + 150;
        D.llIllllll[110] = -(0xFFFFB143 & 0x6FBF) & (0xFFFFADFF & 0x7F4F);
        D.llIllllll[111] = 0xFFFFBE9F & 0x4DE5;
        D.llIllllll[112] = -(0xFFFFE98B & 0x56F5) & (0xFFFFDFE7 & 0x6B9E);
        D.llIllllll[113] = -(0xFFFFDB6A & 0x6DD7) & (0xFFFFEF6F & Short.MAX_VALUE);
        D.llIllllll[114] = 0xFFFFDB9F & 0x2F7B;
        D.llIllllll[115] = 0xFFFFAE3F & 0x77E6;
        D.llIllllll[116] = 0xFFFFEFBC & 0x1B6F;
        D.llIllllll[117] = -(0xFFFFEDF7 & 0x1BED) & (0xFFFFAFEC & Short.MAX_VALUE);
        D.llIllllll[118] = -(0xFFFFF647 & 0x59FB) & (0xFFFFDD7F & 0x7FEF);
        D.llIllllll[119] = 0xFFFF9E97 & 0x6DFE;
        D.llIllllll[120] = 0xFFFFFCB9 & 0xFD7;
        D.llIllllll[121] = 0xFFFFFDFF & 0xE87;
        D.llIllllll[122] = 0xFFFFBC9C & 0x4FEF;
        D.llIllllll[123] = -(0xFFFFE3C1 & 0x7EBF) & (0xFFFFEFFF & 0x7EFF);
        D.llIllllll[124] = 0xFFFFCFE6 & 0x3C7B;
        D.llIllllll[125] = 0xFFFFE9DF & 0x1FB4;
        D.llIllllll[126] = -(0xFFFFE0DF & 0x7F27) & (0xFFFFF7FF & 0x797F);
        D.llIllllll[127] = (0x7F ^ 0x40) + (0x7B ^ 0x75) - (0xBA ^ 0xBE) + (0x56 ^ 0x1C);
        D.llIllllll[128] = 0x13 ^ 0x58;
        D.llIllllll[129] = 0x3C ^ 0x38 ^ (0xD6 ^ 0x9E);
        D.llIllllll[130] = 0x54 ^ 0x21 ^ (0x52 ^ 0x6A);
        D.llIllllll[131] = 60 + 89 - 59 + 133 ^ 130 + 57 - 148 + 106;
        D.llIllllll[132] = 55 + 40 - -114 + 35 ^ 78 + 175 - 100 + 34;
        D.llIllllll[133] = 0xCA ^ 0x9A;
        D.llIllllll[134] = 0x96 ^ 0xC7;
        D.llIllllll[135] = 0xF1 ^ 0xA3;
        D.llIllllll[136] = 0x4B ^ 0x27 ^ (0x9C ^ 0xA3);
        D.llIllllll[137] = 0x43 ^ 0x17;
    }

    private static boolean lIllllIlIIIl(Object object) {
        return object == null;
    }

    public static void bz() {
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
                                                                                            if (D.lIllllIIIlll(bv ? 1 : 0)) {
                                                                                                b.a(bx);
                                                                                                if (D.lIllllIIlIII(bx.size(), llIllllll[0])) {
                                                                                                    System.out.println(llIllllII[llIllllll[1]]);
                                                                                                    bv = llIllllll[1];
                                                                                                }
                                                                                            }
                                                                                            if (!D.lIllllIIlIIl(bv ? 1 : 0)) break block72;
                                                                                            if (D.lIllllIIlIII(Skills.getLevel((Skill)Skill.CRAFTING), llIllllll[2])) {
                                                                                                dc = llIllllII[llIllllll[0]];
                                                                                                an.el();
                                                                                            }
                                                                                            if (D.lIllllIIlIlI(Skills.getLevel((Skill)Skill.CRAFTING), llIllllll[2]) && D.lIllllIIlIII(Skills.getLevel((Skill)Skill.WOODCUTTING), llIllllll[3])) {
                                                                                                dc = llIllllII[llIllllll[4]];
                                                                                                ar.eP();
                                                                                            }
                                                                                            if (D.lIllllIIlIlI(Skills.getLevel((Skill)Skill.CRAFTING), llIllllll[2]) && D.lIllllIIlIlI(Skills.getLevel((Skill)Skill.WOODCUTTING), llIllllll[3]) && D.lIllllIIlIII(Skills.getLevel((Skill)Skill.PRAYER), llIllllll[5])) {
                                                                                                dc = llIllllII[llIllllll[6]];
                                                                                                aq.ea();
                                                                                            }
                                                                                            if (!D.lIllllIIlIIl(D.an() ? 1 : 0) || !D.lIllllIIlIII(e.j(eW), llIllllll[0]) || !D.lIllllIIlIlI(Skills.getLevel((Skill)Skill.CRAFTING), llIllllll[2]) || !D.lIllllIIlIlI(Skills.getLevel((Skill)Skill.WOODCUTTING), llIllllll[3]) || !D.lIllllIIlIlI(Skills.getLevel((Skill)Skill.PRAYER), llIllllll[5])) break block73;
                                                                                            dc = llIllllII[llIllllll[7]];
                                                                                            BankLocation lIIIIIlIlIlIlI = BankLocation.getNearest();
                                                                                            if (D.lIllllIIlIll(lIIIIIlIlIlIlI) && D.lIllllIIlIIl(lIIIIIlIlIlIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                                                                AccBuilderGWD.c = llIllllII[llIllllll[8]];
                                                                                                a.a(lIIIIIlIlIlIlI);
                                                                                            }
                                                                                            if (!D.lIllllIIlIll(lIIIIIlIlIlIlI) || !D.lIllllIIIlll(lIIIIIlIlIlIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block73;
                                                                                            if (D.lIllllIIlIIl(Bank.isOpen() ? 1 : 0)) {
                                                                                                a.a();
                                                                                                Time.sleepUntil(() -> Bank.isOpen(), (int)llIllllll[9]);
                                                                                                0;
                                                                                            }
                                                                                            if (!D.lIllllIIIlll(Bank.isOpen() ? 1 : 0)) break block73;
                                                                                            AccBuilderGWD.c = llIllllII[llIllllll[10]];
                                                                                            if (D.lIllllIIllII(Inventory.getAll().size())) {
                                                                                                Bank.depositInventory();
                                                                                                Time.sleepTicks((int)llIllllll[7]);
                                                                                                0;
                                                                                            }
                                                                                            if (D.lIllllIIllII(Equipment.getAll().size())) {
                                                                                                Bank.depositEquipment();
                                                                                                Time.sleepTicks((int)llIllllll[4]);
                                                                                                0;
                                                                                            }
                                                                                            int[] nArray = new int[llIllllll[11]];
                                                                                            nArray[D.llIllllll[1]] = llIllllll[12];
                                                                                            nArray[D.llIllllll[0]] = llIllllll[13];
                                                                                            nArray[D.llIllllll[4]] = llIllllll[14];
                                                                                            nArray[D.llIllllll[6]] = llIllllll[15];
                                                                                            nArray[D.llIllllll[7]] = llIllllll[16];
                                                                                            nArray[D.llIllllll[8]] = llIllllll[17];
                                                                                            nArray[D.llIllllll[10]] = llIllllll[18];
                                                                                            nArray[D.llIllllll[19]] = llIllllll[20];
                                                                                            nArray[D.llIllllll[21]] = llIllllll[22];
                                                                                            nArray[D.llIllllll[23]] = llIllllll[24];
                                                                                            if (D.lIllllIIlIIl(e.d(nArray) ? 1 : 0)) {
                                                                                                D.Q();
                                                                                                System.out.println(llIllllII[llIllllll[19]]);
                                                                                                bv = llIllllll[0];
                                                                                                return;
                                                                                            }
                                                                                            int[] nArray2 = new int[llIllllll[0]];
                                                                                            nArray2[D.llIllllll[1]] = llIllllll[20];
                                                                                            if (!D.lIllllIIIlll(Bank.contains((int[])nArray2) ? 1 : 0)) break block74;
                                                                                            int[] nArray3 = new int[llIllllll[0]];
                                                                                            nArray3[D.llIllllll[1]] = llIllllll[20];
                                                                                            if (!D.lIllllIIlIlI(Bank.getFirst((int[])nArray3).getQuantity(), llIllllll[25])) break block75;
                                                                                        }
                                                                                        int[] nArray = new int[llIllllll[0]];
                                                                                        nArray[D.llIllllll[1]] = llIllllll[17];
                                                                                        if (!D.lIllllIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block76;
                                                                                        int[] nArray4 = new int[llIllllll[0]];
                                                                                        nArray4[D.llIllllll[1]] = llIllllll[17];
                                                                                        if (!D.lIllllIIlIlI(Bank.getFirst((int[])nArray4).getQuantity(), llIllllll[25])) break block75;
                                                                                    }
                                                                                    int[] nArray = new int[llIllllll[0]];
                                                                                    nArray[D.llIllllll[1]] = llIllllll[26];
                                                                                    if (!D.lIllllIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block77;
                                                                                    int[] nArray5 = new int[llIllllll[0]];
                                                                                    nArray5[D.llIllllll[1]] = llIllllll[26];
                                                                                    if (!D.lIllllIIlIlI(Bank.getFirst((int[])nArray5).getQuantity(), llIllllll[25])) break block75;
                                                                                }
                                                                                int[] nArray = new int[llIllllll[0]];
                                                                                nArray[D.llIllllll[1]] = llIllllll[27];
                                                                                if (!D.lIllllIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block78;
                                                                                int[] nArray6 = new int[llIllllll[0]];
                                                                                nArray6[D.llIllllll[1]] = llIllllll[27];
                                                                                if (!D.lIllllIIlIlI(Bank.getFirst((int[])nArray6).getQuantity(), llIllllll[25])) break block75;
                                                                            }
                                                                            int[] nArray = new int[llIllllll[0]];
                                                                            nArray[D.llIllllll[1]] = llIllllll[24];
                                                                            if (!D.lIllllIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block79;
                                                                            int[] nArray7 = new int[llIllllll[0]];
                                                                            nArray7[D.llIllllll[1]] = llIllllll[24];
                                                                            if (!D.lIllllIIlIlI(Bank.getFirst((int[])nArray7).getQuantity(), llIllllll[28])) break block75;
                                                                        }
                                                                        int[] nArray = new int[llIllllll[0]];
                                                                        nArray[D.llIllllll[1]] = llIllllll[18];
                                                                        if (!D.lIllllIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block80;
                                                                        int[] nArray8 = new int[llIllllll[0]];
                                                                        nArray8[D.llIllllll[1]] = llIllllll[18];
                                                                        if (!D.lIllllIIlIlI(Bank.getFirst((int[])nArray8).getQuantity(), llIllllll[25])) break block75;
                                                                    }
                                                                    int[] nArray = new int[llIllllll[0]];
                                                                    nArray[D.llIllllll[1]] = llIllllll[22];
                                                                    if (!D.lIllllIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block81;
                                                                    int[] nArray9 = new int[llIllllll[0]];
                                                                    nArray9[D.llIllllll[1]] = llIllllll[22];
                                                                    if (!D.lIllllIIlIlI(Bank.getFirst((int[])nArray9).getQuantity(), llIllllll[29])) break block75;
                                                                }
                                                                int[] nArray = new int[llIllllll[0]];
                                                                nArray[D.llIllllll[1]] = llIllllll[16];
                                                                if (!D.lIllllIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block82;
                                                                int[] nArray10 = new int[llIllllll[0]];
                                                                nArray10[D.llIllllll[1]] = llIllllll[16];
                                                                if (!D.lIllllIIlIlI(Bank.getFirst((int[])nArray10).getQuantity(), llIllllll[6])) break block75;
                                                            }
                                                            int[] nArray = new int[llIllllll[0]];
                                                            nArray[D.llIllllll[1]] = llIllllll[13];
                                                            if (!D.lIllllIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block83;
                                                            int[] nArray11 = new int[llIllllll[0]];
                                                            nArray11[D.llIllllll[1]] = llIllllll[13];
                                                            if (!D.lIllllIIlIlI(Bank.getFirst((int[])nArray11).getQuantity(), llIllllll[11])) break block75;
                                                        }
                                                        int[] nArray = new int[llIllllll[0]];
                                                        nArray[D.llIllllll[1]] = llIllllll[30];
                                                        if (!D.lIllllIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block84;
                                                        int[] nArray12 = new int[llIllllll[0]];
                                                        nArray12[D.llIllllll[1]] = llIllllll[30];
                                                        if (!D.lIllllIIlIlI(Bank.getFirst((int[])nArray12).getQuantity(), llIllllll[7])) break block75;
                                                    }
                                                    int[] nArray = new int[llIllllll[0]];
                                                    nArray[D.llIllllll[1]] = llIllllll[12];
                                                    if (!D.lIllllIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block85;
                                                    int[] nArray13 = new int[llIllllll[0]];
                                                    nArray13[D.llIllllll[1]] = llIllllll[12];
                                                    if (!D.lIllllIIlIII(Bank.getFirst((int[])nArray13).getQuantity(), llIllllll[11])) break block85;
                                                }
                                                D.Q();
                                                System.out.println(llIllllII[llIllllll[21]]);
                                                bv = llIllllll[0];
                                                return;
                                            }
                                            int[] nArray = new int[llIllllll[29]];
                                            nArray[D.llIllllll[1]] = llIllllll[12];
                                            nArray[D.llIllllll[0]] = llIllllll[13];
                                            nArray[D.llIllllll[4]] = llIllllll[14];
                                            nArray[D.llIllllll[6]] = llIllllll[15];
                                            nArray[D.llIllllll[7]] = llIllllll[16];
                                            nArray[D.llIllllll[8]] = llIllllll[17];
                                            nArray[D.llIllllll[10]] = llIllllll[18];
                                            nArray[D.llIllllll[19]] = llIllllll[20];
                                            nArray[D.llIllllll[21]] = llIllllll[22];
                                            nArray[D.llIllllll[23]] = llIllllll[24];
                                            nArray[D.llIllllll[11]] = llIllllll[26];
                                            nArray[D.llIllllll[31]] = llIllllll[27];
                                            if (D.lIllllIIIlll(e.d(nArray) ? 1 : 0)) {
                                                a.a(llIllllll[12], llIllllll[11]);
                                                a.a(llIllllll[13], llIllllll[11]);
                                                a.a(llIllllll[14], llIllllll[0]);
                                                a.a(llIllllll[15], llIllllll[0]);
                                                a.a(llIllllll[16], llIllllll[6]);
                                                a.b(f.aY, llIllllll[0]);
                                                a.a(llIllllll[22], llIllllll[19]);
                                                a.a(llIllllll[17], llIllllll[25]);
                                                a.a(llIllllll[18], llIllllll[25]);
                                                a.a(llIllllll[27], llIllllll[25]);
                                                a.a(llIllllll[26], llIllllll[25]);
                                                a.a(llIllllll[24], llIllllll[25]);
                                                a.a(llIllllll[20], llIllllll[25]);
                                                a.a(llIllllll[32], llIllllll[25]);
                                                a.a(llIllllll[30], llIllllll[0]);
                                            }
                                        }
                                        if (D.lIllllIIIlll(Inventory.contains((int[])f.bc) ? 1 : 0) && D.lIllllIIlIII(Movement.getRunEnergy(), llIllllll[33])) {
                                            Inventory.getFirst((int[])f.bc).interact(llIllllII[llIllllll[23]]);
                                            Time.sleepTicks((int)llIllllll[0]);
                                            0;
                                        }
                                        if (D.lIllllIIllIl(D.lIllllIIIllI(e.w(), 50.0))) {
                                            String[] stringArray = new String[llIllllll[0]];
                                            stringArray[D.llIllllll[1]] = llIllllII[llIllllll[11]];
                                            if (D.lIllllIIIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                String[] stringArray2 = new String[llIllllll[0]];
                                                stringArray2[D.llIllllll[1]] = llIllllII[llIllllll[31]];
                                                Inventory.getFirst((String[])stringArray2).interact(llIllllII[llIllllll[29]]);
                                                Time.sleepTicks((int)llIllllll[4]);
                                                0;
                                            }
                                        }
                                        if (D.lIllllIIlIII(Prayers.getPoints(), llIllllll[34]) && D.lIllllIIIlll(Inventory.contains((int[])f.aZ) ? 1 : 0)) {
                                            Inventory.getFirst((int[])f.aZ).interact(llIllllII[llIllllll[35]]);
                                            Time.sleepTicks((int)llIllllll[4]);
                                            0;
                                        }
                                        if (D.lIllllIIIlll(D.an() ? 1 : 0) && D.lIllllIIlIII(e.j(eW), llIllllll[0])) {
                                            if (D.lIllllIIlllI(Players.getLocal().getWorldLocation().distanceTo(eN), llIllllll[19])) {
                                                AccBuilderGWD.c = llIllllII[llIllllll[36]];
                                                if (D.lIllllIIIlll(Dialog.isOpen() ? 1 : 0)) {
                                                    Dialog.close();
                                                }
                                                Movement.walkTo((WorldPoint)eN);
                                                0;
                                                Time.sleepTicks((int)llIllllll[0]);
                                                0;
                                            }
                                            if (D.lIllllIIllll(Players.getLocal().getWorldLocation().distanceTo(eN), llIllllll[19])) {
                                                AccBuilderGWD.c = llIllllII[llIllllll[37]];
                                                g.a(llIllllII[llIllllll[38]], eY);
                                            }
                                        }
                                        if (D.lIllllIlIIII(e.j(eW), llIllllll[0])) {
                                            if (D.lIllllIIlllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIllllll[39], llIllllll[40], llIllllll[1])), llIllllll[8])) {
                                                AccBuilderGWD.c = llIllllII[llIllllll[41]];
                                                Movement.walkTo((WorldPoint)new WorldPoint(llIllllll[39], llIllllll[40], llIllllll[1]));
                                                0;
                                                Time.sleepTicks((int)llIllllll[0]);
                                                0;
                                            }
                                            if (D.lIllllIIllll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIllllll[39], llIllllll[40], llIllllll[1])), llIllllll[8])) {
                                                AccBuilderGWD.c = llIllllII[llIllllll[42]];
                                                String[] stringArray = new String[llIllllll[0]];
                                                stringArray[D.llIllllll[1]] = llIllllII[llIllllll[43]];
                                                if (D.lIllllIlIIIl(NPCs.getNearest((String[])stringArray))) {
                                                    int[] nArray = new int[llIllllll[0]];
                                                    nArray[D.llIllllll[1]] = llIllllll[44];
                                                    TileObjects.getNearest((int[])nArray).interact(llIllllII[llIllllll[45]]);
                                                    Time.sleepTicks((int)llIllllll[6]);
                                                    0;
                                                }
                                                String[] stringArray3 = new String[llIllllll[0]];
                                                stringArray3[D.llIllllll[1]] = llIllllII[llIllllll[46]];
                                                if (D.lIllllIIlIll(NPCs.getNearest((String[])stringArray3))) {
                                                    g.a(llIllllII[llIllllll[47]], eY);
                                                }
                                            }
                                        }
                                        if (!D.lIllllIlIIII(e.j(eW), llIllllll[4])) break block86;
                                        String[] stringArray = new String[llIllllll[0]];
                                        stringArray[D.llIllllll[1]] = llIllllII[llIllllll[34]];
                                        if (!D.lIllllIIIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) break block87;
                                        if (D.lIllllIIllll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIllllll[39], llIllllll[40], llIllllll[1])), llIllllll[48])) {
                                            AccBuilderGWD.c = llIllllII[llIllllll[49]];
                                            String[] stringArray4 = new String[llIllllll[0]];
                                            stringArray4[D.llIllllll[1]] = llIllllII[llIllllll[50]];
                                            Inventory.getFirst((String[])stringArray4).interact(llIllllII[llIllllll[51]]);
                                            Time.sleepTicks((int)llIllllll[0]);
                                            0;
                                        }
                                        if (D.lIllllIIllll(Players.getLocal().getWorldLocation().distanceTo(eO), llIllllll[52]) && D.lIllllIIlllI(Players.getLocal().getWorldLocation().distanceTo(eQ), llIllllll[7])) {
                                            AccBuilderGWD.c = llIllllII[llIllllll[53]];
                                            if (D.lIllllIIIlll(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                                Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                                            }
                                            Movement.walkTo((WorldPoint)eQ);
                                            0;
                                            Time.sleepTicks((int)llIllllll[0]);
                                            0;
                                        }
                                        if (!D.lIllllIIllll(Players.getLocal().getWorldLocation().distanceTo(eQ), llIllllll[7])) break block87;
                                        int[] nArray = new int[llIllllll[0]];
                                        nArray[D.llIllllll[1]] = llIllllll[54];
                                        if (D.lIllllIlIIIl(NPCs.getNearest((int[])nArray))) {
                                            String[] stringArray5 = new String[llIllllll[0]];
                                            stringArray5[D.llIllllll[1]] = llIllllII[llIllllll[55]];
                                            TileObjects.getNearest((String[])stringArray5).interact(llIllllII[llIllllll[56]]);
                                            Time.sleepTicks((int)llIllllll[4]);
                                            0;
                                        }
                                        int[] nArray14 = new int[llIllllll[0]];
                                        nArray14[D.llIllllll[1]] = llIllllll[54];
                                        if (!D.lIllllIIlIll(NPCs.getNearest((int[])nArray14))) break block87;
                                        AccBuilderGWD.c = llIllllII[llIllllll[48]];
                                        if (D.lIllllIIlIIl(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                            Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                                        }
                                        if (!D.lIllllIIlIIl(Players.getLocal().isAnimating() ? 1 : 0)) break block87;
                                        if (D.lIllllIIlIlI(Skills.getLevel((Skill)Skill.MAGIC), llIllllll[35]) && !D.lIllllIIlIlI(Skills.getLevel((Skill)Skill.MAGIC), llIllllll[41])) break block88;
                                        String[] stringArray6 = new String[llIllllll[0]];
                                        stringArray6[D.llIllllll[1]] = llIllllII[llIllllll[2]];
                                        if (!D.lIllllIIlIIl(Inventory.contains((String[])stringArray6) ? 1 : 0)) break block89;
                                    }
                                    Magic.cast((Spell)SpellBook.Standard.FIRE_STRIKE, (NPC)NPCs.getNearest(nPC -> {
                                        int n2;
                                        if (D.lIllllIlIIII(nPC.getId(), llIllllll[54]) && D.lIllllIIlIIl(nPC.isDead() ? 1 : 0)) {
                                            n2 = llIllllll[0];
                                            0;
                                            if ((0x46 ^ 0x42) != (0xA2 ^ 0xA6)) {
                                                return false;
                                            }
                                        } else {
                                            n2 = llIllllll[1];
                                        }
                                        return n2 != 0;
                                    }));
                                    Time.sleepTicks((int)llIllllll[4]);
                                    0;
                                }
                                String[] stringArray = new String[llIllllll[0]];
                                stringArray[D.llIllllll[1]] = llIllllII[llIllllll[57]];
                                if (D.lIllllIIIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                    if (D.lIllllIIlIlI(Skills.getLevel((Skill)Skill.MAGIC), llIllllll[41]) && D.lIllllIIlIII(Skills.getLevel((Skill)Skill.MAGIC), llIllllll[34])) {
                                        Magic.cast((Spell)SpellBook.Standard.WIND_BOLT, (NPC)NPCs.getNearest(nPC -> {
                                            int n2;
                                            if (D.lIllllIlIIII(nPC.getId(), llIllllll[54]) && D.lIllllIIlIIl(nPC.isDead() ? 1 : 0)) {
                                                n2 = llIllllll[0];
                                                0;
                                                if (1 < 0) {
                                                    return false;
                                                }
                                            } else {
                                                n2 = llIllllll[1];
                                            }
                                            return n2 != 0;
                                        }));
                                        Time.sleepTicks((int)llIllllll[4]);
                                        0;
                                    }
                                    if (D.lIllllIIlIlI(Skills.getLevel((Skill)Skill.MAGIC), llIllllll[34]) && D.lIllllIIlIII(Skills.getLevel((Skill)Skill.MAGIC), llIllllll[56])) {
                                        Magic.cast((Spell)SpellBook.Standard.WATER_BOLT, (NPC)NPCs.getNearest(nPC -> {
                                            int n2;
                                            if (D.lIllllIlIIII(nPC.getId(), llIllllll[54]) && D.lIllllIIlIIl(nPC.isDead() ? 1 : 0)) {
                                                n2 = llIllllll[0];
                                                0;
                                                if (1 > (0x2D ^ 0x29)) {
                                                    return false;
                                                }
                                            } else {
                                                n2 = llIllllll[1];
                                            }
                                            return n2 != 0;
                                        }));
                                        Time.sleepTicks((int)llIllllll[4]);
                                        0;
                                    }
                                    if (D.lIllllIIlIlI(Skills.getLevel((Skill)Skill.MAGIC), llIllllll[56]) && D.lIllllIIlIII(Skills.getLevel((Skill)Skill.MAGIC), llIllllll[58])) {
                                        Magic.cast((Spell)SpellBook.Standard.EARTH_BOLT, (NPC)NPCs.getNearest(nPC -> {
                                            int n2;
                                            if (D.lIllllIlIIII(nPC.getId(), llIllllll[54]) && D.lIllllIIlIIl(nPC.isDead() ? 1 : 0)) {
                                                n2 = llIllllll[0];
                                                0;
                                                if (3 <= 1) {
                                                    return false;
                                                }
                                            } else {
                                                n2 = llIllllll[1];
                                            }
                                            return n2 != 0;
                                        }));
                                        Time.sleepTicks((int)llIllllll[4]);
                                        0;
                                    }
                                    if (D.lIllllIIlIlI(Skills.getLevel((Skill)Skill.MAGIC), llIllllll[58])) {
                                        Magic.cast((Spell)SpellBook.Standard.FIRE_BOLT, (NPC)NPCs.getNearest(nPC -> {
                                            int n2;
                                            if (D.lIllllIlIIII(nPC.getId(), llIllllll[54]) && D.lIllllIIlIIl(nPC.isDead() ? 1 : 0)) {
                                                n2 = llIllllll[0];
                                                0;
                                                if (2 < -1) {
                                                    return false;
                                                }
                                            } else {
                                                n2 = llIllllll[1];
                                            }
                                            return n2 != 0;
                                        }));
                                        Time.sleepTicks((int)llIllllll[4]);
                                        0;
                                    }
                                }
                            }
                            String[] stringArray = new String[llIllllll[0]];
                            stringArray[D.llIllllll[1]] = llIllllII[llIllllll[59]];
                            if (!D.lIllllIIlIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) break block86;
                            if (D.lIllllIIlllI(Players.getLocal().getWorldLocation().distanceTo(eR), llIllllll[7]) && D.lIllllIIlllI(Players.getLocal().getWorldLocation().distanceTo(eO), llIllllll[52])) {
                                if (D.lIllllIIIlll(Inventory.contains((int[])f.aY) ? 1 : 0) && D.lIllllIIlIIl(Equipment.contains((int[])f.aY) ? 1 : 0)) {
                                    e.b(f.aY);
                                }
                                AccBuilderGWD.c = llIllllII[llIllllll[60]];
                                if (D.lIllllIIlIIl(Dialog.isOpen() ? 1 : 0)) {
                                    Movement.walkTo((WorldPoint)eR);
                                    0;
                                    Time.sleepTicks((int)llIllllll[0]);
                                    0;
                                }
                                String[] stringArray7 = new String[llIllllll[6]];
                                stringArray7[D.llIllllll[1]] = llIllllII[llIllllll[58]];
                                stringArray7[D.llIllllll[0]] = llIllllII[llIllllll[3]];
                                stringArray7[D.llIllllll[4]] = llIllllII[llIllllll[61]];
                                g.a(stringArray7);
                            }
                            if (D.lIllllIIllll(Players.getLocal().getWorldLocation().distanceTo(eR), llIllllll[7])) {
                                AccBuilderGWD.c = llIllllII[llIllllll[62]];
                                if (D.lIllllIIlIIl(Dialog.isOpen() ? 1 : 0)) {
                                    String[] stringArray8 = new String[llIllllll[0]];
                                    stringArray8[D.llIllllll[1]] = llIllllII[llIllllll[63]];
                                    TileObjects.getNearest((String[])stringArray8).interact(llIllllII[llIllllll[64]]);
                                    Time.sleepTicks((int)llIllllll[6]);
                                    0;
                                }
                                g.a(eY);
                            }
                            if (!D.lIllllIIllll(Players.getLocal().getWorldLocation().distanceTo(eO), llIllllll[52])) break block86;
                            if (D.lIllllIIlllI(Players.getLocal().getWorldLocation().distanceTo(eP), llIllllll[21])) {
                                AccBuilderGWD.c = llIllllII[llIllllll[65]];
                                Movement.walkTo((WorldPoint)eP);
                                0;
                                Time.sleepTicks((int)llIllllll[0]);
                                0;
                            }
                            if (!D.lIllllIIllll(Players.getLocal().getWorldLocation().distanceTo(eP), llIllllll[21])) break block86;
                            AccBuilderGWD.c = llIllllII[llIllllll[66]];
                            if (D.lIllllIIlIlI(Skills.getLevel((Skill)Skill.PRAYER), llIllllll[67]) && D.lIllllIIllII(Prayers.getPoints()) && D.lIllllIIlIIl(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                            }
                            if (!D.lIllllIIlIIl(Players.getLocal().isAnimating() ? 1 : 0)) break block90;
                            String[] stringArray9 = new String[llIllllll[0]];
                            stringArray9[D.llIllllll[1]] = llIllllII[llIllllll[67]];
                            if (!D.lIllllIlIIIl(TileItems.getNearest((String[])stringArray9))) break block90;
                            if (D.lIllllIIlIlI(Skills.getLevel((Skill)Skill.MAGIC), llIllllll[35]) && !D.lIllllIIlIlI(Skills.getLevel((Skill)Skill.MAGIC), llIllllll[41])) break block91;
                            String[] stringArray10 = new String[llIllllll[0]];
                            stringArray10[D.llIllllll[1]] = llIllllII[llIllllll[68]];
                            if (!D.lIllllIIlIIl(Inventory.contains((String[])stringArray10) ? 1 : 0)) break block92;
                        }
                        Magic.cast((Spell)SpellBook.Standard.FIRE_STRIKE, (NPC)NPCs.getNearest(nPC -> {
                            int n2;
                            if (D.lIllllIIIlll(nPC.getName().equalsIgnoreCase(llIllllII[llIllllll[109]]) ? 1 : 0) && D.lIllllIIlIIl(nPC.isDead() ? 1 : 0)) {
                                n2 = llIllllll[0];
                                0;
                                if ((0x27 ^ 0x23) <= 0) {
                                    return false;
                                }
                            } else {
                                n2 = llIllllll[1];
                            }
                            return n2 != 0;
                        }));
                        Time.sleepTicks((int)llIllllll[4]);
                        0;
                    }
                    String[] stringArray = new String[llIllllll[0]];
                    stringArray[D.llIllllll[1]] = llIllllII[llIllllll[5]];
                    if (D.lIllllIIIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        if (D.lIllllIIlIlI(Skills.getLevel((Skill)Skill.MAGIC), llIllllll[41]) && D.lIllllIIlIII(Skills.getLevel((Skill)Skill.MAGIC), llIllllll[34])) {
                            Magic.cast((Spell)SpellBook.Standard.WIND_BOLT, (NPC)NPCs.getNearest(nPC -> {
                                int n2;
                                if (D.lIllllIIIlll(nPC.getName().equalsIgnoreCase(llIllllII[llIllllll[108]]) ? 1 : 0) && D.lIllllIIlIIl(nPC.isDead() ? 1 : 0)) {
                                    n2 = llIllllll[0];
                                    0;
                                    if (-3 >= 0) {
                                        return false;
                                    }
                                } else {
                                    n2 = llIllllll[1];
                                }
                                return n2 != 0;
                            }));
                            Time.sleepTicks((int)llIllllll[4]);
                            0;
                        }
                        if (D.lIllllIIlIlI(Skills.getLevel((Skill)Skill.MAGIC), llIllllll[34]) && D.lIllllIIlIII(Skills.getLevel((Skill)Skill.MAGIC), llIllllll[56])) {
                            Magic.cast((Spell)SpellBook.Standard.WATER_BOLT, (NPC)NPCs.getNearest(nPC -> {
                                int n2;
                                if (D.lIllllIIIlll(nPC.getName().equalsIgnoreCase(llIllllII[llIllllll[107]]) ? 1 : 0) && D.lIllllIIlIIl(nPC.isDead() ? 1 : 0)) {
                                    n2 = llIllllll[0];
                                    0;
                                    if (((0xE4 ^ 0x8D ^ (0x73 ^ 0x2B)) & (0x7F ^ 0x55 ^ (0xB6 ^ 0xAD) ^ -1)) > 1) {
                                        return ((0xB2 ^ 0xC0 ^ (0x3C ^ 0xC)) & (99 + 108 - 6 + 51 ^ 25 + 50 - -11 + 104 ^ -1)) != 0;
                                    }
                                } else {
                                    n2 = llIllllll[1];
                                }
                                return n2 != 0;
                            }));
                            Time.sleepTicks((int)llIllllll[4]);
                            0;
                        }
                        if (D.lIllllIIlIlI(Skills.getLevel((Skill)Skill.MAGIC), llIllllll[56]) && D.lIllllIIlIII(Skills.getLevel((Skill)Skill.MAGIC), llIllllll[58])) {
                            Magic.cast((Spell)SpellBook.Standard.EARTH_BOLT, (NPC)NPCs.getNearest(nPC -> {
                                int n2;
                                if (D.lIllllIIIlll(nPC.getName().equalsIgnoreCase(llIllllII[llIllllll[106]]) ? 1 : 0) && D.lIllllIIlIIl(nPC.isDead() ? 1 : 0)) {
                                    n2 = llIllllll[0];
                                    0;
                                    if ((2 & (2 ^ -1)) != 0) {
                                        return ((6 + 62 - 55 + 151 ^ 46 + 114 - 33 + 27) & (0x76 ^ 0x59 ^ (0x94 ^ 0x85) ^ -1)) != 0;
                                    }
                                } else {
                                    n2 = llIllllll[1];
                                }
                                return n2 != 0;
                            }));
                            Time.sleepTicks((int)llIllllll[4]);
                            0;
                        }
                        if (D.lIllllIIlIlI(Skills.getLevel((Skill)Skill.MAGIC), llIllllll[58])) {
                            Magic.cast((Spell)SpellBook.Standard.FIRE_BOLT, (NPC)NPCs.getNearest(nPC -> {
                                int n2;
                                if (D.lIllllIIIlll(nPC.getName().equalsIgnoreCase(llIllllII[llIllllll[52]]) ? 1 : 0) && D.lIllllIIlIIl(nPC.isDead() ? 1 : 0)) {
                                    n2 = llIllllll[0];
                                    0;
                                    if (2 > 2) {
                                        return false;
                                    }
                                } else {
                                    n2 = llIllllll[1];
                                }
                                return n2 != 0;
                            }));
                            Time.sleepTicks((int)llIllllll[4]);
                            0;
                        }
                    }
                }
                String[] stringArray = new String[llIllllll[0]];
                stringArray[D.llIllllll[1]] = llIllllII[llIllllll[69]];
                if (D.lIllllIIlIll(TileItems.getNearest((String[])stringArray))) {
                    String[] stringArray11 = new String[llIllllll[0]];
                    stringArray11[D.llIllllll[1]] = llIllllII[llIllllll[70]];
                    TileItems.getNearest((String[])stringArray11).interact(llIllllII[llIllllll[71]]);
                    Time.sleepTicks((int)llIllllll[4]);
                    0;
                }
            }
            if (D.lIllllIlIIII(e.j(eW), llIllllll[6])) {
                AccBuilderGWD.c = llIllllII[llIllllll[72]];
                if (D.lIllllIIIlll(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                    Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                }
                if (D.lIllllIIlIIl(Players.getLocal().isAnimating() ? 1 : 0)) {
                    String[] stringArray = new String[llIllllll[0]];
                    stringArray[D.llIllllll[1]] = llIllllII[llIllllll[33]];
                    TileObjects.getNearest((String[])stringArray).interact(llIllllII[llIllllll[73]]);
                    Time.sleepTicks((int)llIllllll[0]);
                    0;
                }
            }
            if (D.lIllllIlIIII(e.j(eW), llIllllll[7])) {
                if (D.lIllllIIllll(Players.getLocal().getWorldLocation().distanceTo(eQ), llIllllll[64]) && D.lIllllIlIIII(Players.getLocal().getAnimation(), llIllllll[74])) {
                    int[] nArray = new int[llIllllll[0]];
                    nArray[D.llIllllll[1]] = llIllllll[13];
                    Inventory.getFirst((int[])nArray).interact(llIllllII[llIllllll[75]]);
                    Time.sleepTicks((int)llIllllll[10]);
                    0;
                }
                String[] stringArray = new String[llIllllll[0]];
                stringArray[D.llIllllll[1]] = llIllllII[llIllllll[76]];
                if (D.lIllllIIlIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    if (D.lIllllIIlllI(Players.getLocal().getWorldLocation().distanceTo(eT), llIllllll[7])) {
                        AccBuilderGWD.c = llIllllII[llIllllll[77]];
                        Movement.walkTo((WorldPoint)eT);
                        0;
                        Time.sleepTicks((int)llIllllll[0]);
                        0;
                    }
                    if (D.lIllllIIllll(Players.getLocal().getWorldLocation().distanceTo(eT), llIllllll[7])) {
                        String[] stringArray12 = new String[llIllllll[0]];
                        stringArray12[D.llIllllll[1]] = llIllllII[llIllllll[78]];
                        if (D.lIllllIIlIll(TileItems.getNearest((String[])stringArray12))) {
                            String[] stringArray13 = new String[llIllllll[0]];
                            stringArray13[D.llIllllll[1]] = llIllllII[llIllllll[79]];
                            TileItems.getNearest((String[])stringArray13).interact(llIllllII[llIllllll[80]]);
                            Time.sleepTicks((int)llIllllll[4]);
                            0;
                        }
                    }
                }
                String[] stringArray14 = new String[llIllllll[0]];
                stringArray14[D.llIllllll[1]] = llIllllII[llIllllll[81]];
                if (D.lIllllIIIlll(Inventory.contains((String[])stringArray14) ? 1 : 0)) {
                    String[] stringArray15 = new String[llIllllll[0]];
                    stringArray15[D.llIllllll[1]] = llIllllII[llIllllll[82]];
                    String[] stringArray16 = new String[llIllllll[0]];
                    stringArray16[D.llIllllll[1]] = llIllllII[llIllllll[83]];
                    Inventory.getFirst((String[])stringArray15).useOn(Inventory.getFirst((String[])stringArray16));
                    Time.sleepTicks((int)llIllllll[4]);
                    0;
                }
            }
            if (D.lIllllIlIIII(e.j(eW), llIllllll[8])) {
                String[] stringArray = new String[llIllllll[0]];
                stringArray[D.llIllllll[1]] = llIllllII[llIllllll[84]];
                if (D.lIllllIIlIIl(Equipment.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray17 = new String[llIllllll[0]];
                    stringArray17[D.llIllllll[1]] = llIllllII[llIllllll[85]];
                    if (D.lIllllIIIlll(Inventory.contains((String[])stringArray17) ? 1 : 0)) {
                        String[] stringArray18 = new String[llIllllll[0]];
                        stringArray18[D.llIllllll[1]] = llIllllII[llIllllll[86]];
                        Inventory.getFirst((String[])stringArray18).interact(llIllllII[llIllllll[87]]);
                    }
                }
                if (D.lIllllIIlllI(Players.getLocal().getWorldLocation().distanceTo(eU), llIllllll[8])) {
                    AccBuilderGWD.c = llIllllII[llIllllll[88]];
                    Movement.walkTo((WorldPoint)eU);
                    0;
                    Time.sleepTicks((int)llIllllll[0]);
                    0;
                }
                if (D.lIllllIIllll(Players.getLocal().getWorldLocation().distanceTo(eU), llIllllll[8])) {
                    AccBuilderGWD.c = llIllllII[llIllllll[89]];
                    if (D.lIllllIIlIII(dk, llIllllll[0])) {
                        as.mT += llIllllll[0];
                        as.u(AccBuilderGWD.m);
                        dk += llIllllll[0];
                        as.mT = llIllllll[1];
                    }
                    String[] stringArray19 = new String[llIllllll[0]];
                    stringArray19[D.llIllllll[1]] = llIllllII[llIllllll[90]];
                    TileObjects.getNearest((String[])stringArray19).interact(llIllllII[llIllllll[91]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (D.lIllllIlIIII(e.j(eW), llIllllll[10])) {
                            bl = llIllllll[0];
                            0;
                            if (2 == 3) {
                                return false;
                            }
                        } else {
                            bl = llIllllll[1];
                        }
                        return bl;
                    }, (int)llIllllll[92]);
                    0;
                }
            }
        }
    }

    @Override
    public int af() {
        try {
            D.bz();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (((0x5D ^ 0x33 ^ (0xC0 ^ 0x80)) & (0x9D ^ 0x93 ^ (0x7E ^ 0x5E) ^ -1)) >= 2) {
            return (0xB9 ^ 0xB1 ^ (0x59 ^ 0x66)) & (121 + 37 - 13 + 12 ^ 169 + 70 - 170 + 101 ^ -1);
        }
        return llIllllll[104];
    }

    private static boolean lIllllIIlIll(Object object) {
        return object != null;
    }

    private static boolean lIllllIIlllI(int n2, int n3) {
        return n2 > n3;
    }

    private static String lIlllIlllIIl(String lIIIIIIlllIlIl, String lIIIIIIlllIlII) {
        try {
            SecretKeySpec lIIIIIIllllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIIIIIlllIlII.getBytes(StandardCharsets.UTF_8)), llIllllll[21]), "DES");
            Cipher lIIIIIIllllIIl = Cipher.getInstance("DES");
            lIIIIIIllllIIl.init(llIllllll[4], lIIIIIIllllIlI);
            return new String(lIIIIIIllllIIl.doFinal(Base64.getDecoder().decode(lIIIIIIlllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIIIIllllIII) {
            lIIIIIIllllIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIllllIIlIlI(int n2, int n3) {
        return n2 >= n3;
    }

    private static String lIlllIlllIlI(String lIIIIIlIIIIlII, String lIIIIIlIIIIIIl) {
        try {
            SecretKeySpec lIIIIIlIIIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIIIIlIIIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIIIIlIIIIllI = Cipher.getInstance("Blowfish");
            lIIIIIlIIIIllI.init(llIllllll[4], lIIIIIlIIIIlll);
            return new String(lIIIIIlIIIIllI.doFinal(Base64.getDecoder().decode(lIIIIIlIIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIIIlIIIIlIl) {
            lIIIIIlIIIIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIllllIIllll(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public boolean ae() {
        return llIllllll[1];
    }

    static {
        D.lIllllIIIlIl();
        D.lIllllIIIlII();
        eN = new WorldPoint(llIllllll[110], llIllllll[111], llIllllll[1]);
        eO = new WorldPoint(llIllllll[112], llIllllll[113], llIllllll[1]);
        eP = new WorldPoint(llIllllll[114], llIllllll[115], llIllllll[1]);
        eQ = new WorldPoint(llIllllll[116], llIllllll[117], llIllllll[1]);
        eR = new WorldPoint(llIllllll[112], llIllllll[118], llIllllll[1]);
        eS = new WorldPoint(llIllllll[119], llIllllll[120], llIllllll[1]);
        eT = new WorldPoint(llIllllll[121], llIllllll[122], llIllllll[1]);
        eU = new WorldPoint(llIllllll[123], llIllllll[124], llIllllll[1]);
        eV = new WorldPoint(llIllllll[125], llIllllll[126], llIllllll[1]);
        bx = new ArrayList<d>();
        eW = llIllllll[127];
        eX = llIllllll[1];
        String[] stringArray = new String[llIllllll[21]];
        stringArray[D.llIllllll[1]] = llIllllII[llIllllll[128]];
        stringArray[D.llIllllll[0]] = llIllllII[llIllllll[129]];
        stringArray[D.llIllllll[4]] = llIllllII[llIllllll[130]];
        stringArray[D.llIllllll[6]] = llIllllII[llIllllll[131]];
        stringArray[D.llIllllll[7]] = llIllllII[llIllllll[132]];
        stringArray[D.llIllllll[8]] = llIllllII[llIllllll[133]];
        stringArray[D.llIllllll[10]] = llIllllII[llIllllll[134]];
        stringArray[D.llIllllll[19]] = llIllllII[llIllllll[135]];
        eY = stringArray;
        dc = llIllllII[llIllllll[136]];
        h = "Lost city " + dc;
    }

    private static boolean lIllllIIllII(int n2) {
        return n2 > 0;
    }

    private static boolean lIllllIlIIII(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean an() {
        void lIIIIIlIlIIlll;
        int[] nArray = new int[llIllllll[23]];
        nArray[D.llIllllll[1]] = llIllllll[12];
        nArray[D.llIllllll[0]] = llIllllll[13];
        nArray[D.llIllllll[4]] = llIllllll[14];
        nArray[D.llIllllll[6]] = llIllllll[15];
        nArray[D.llIllllll[7]] = llIllllll[16];
        nArray[D.llIllllll[8]] = llIllllll[17];
        nArray[D.llIllllll[10]] = llIllllll[18];
        nArray[D.llIllllll[19]] = llIllllll[20];
        nArray[D.llIllllll[21]] = llIllllll[22];
        int[] nArray2 = nArray;
        int lIIIIIlIlIIllI = llIllllll[1];
        while (D.lIllllIIlIII(lIIIIIlIlIIllI, ((void)lIIIIIlIlIIlll).length)) {
            int[] nArray3 = new int[llIllllll[0]];
            nArray3[D.llIllllll[1]] = lIIIIIlIlIIlll[lIIIIIlIlIIllI];
            if (D.lIllllIIlIIl(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return llIllllll[1];
            }
            ++lIIIIIlIlIIllI;
            0;
            if (3 == 3) continue;
            return ((94 + 115 - 112 + 95 ^ 3 + 29 - -29 + 71) & (0x44 ^ 7 ^ (0x17 ^ 0x10) ^ -1)) != 0;
        }
        return llIllllll[0];
    }

    @Override
    public String ag() {
        return h;
    }

    private static String lIlllIlllIII(String lIIIIIIllIIIlI, String lIIIIIIllIIllI) {
        lIIIIIIllIIIlI = new String(Base64.getDecoder().decode(lIIIIIIllIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIIIIIllIIlIl = new StringBuilder();
        char[] lIIIIIIllIIlII = lIIIIIIllIIllI.toCharArray();
        int lIIIIIIllIIIll = llIllllll[1];
        char[] lIIIIIIlIlllIl = lIIIIIIllIIIlI.toCharArray();
        int lIIIIIIlIlllII = lIIIIIIlIlllIl.length;
        int lIIIIIIlIllIll = llIllllll[1];
        while (D.lIllllIIlIII(lIIIIIIlIllIll, lIIIIIIlIlllII)) {
            char lIIIIIIllIlIII = lIIIIIIlIlllIl[lIIIIIIlIllIll];
            lIIIIIIllIIlIl.append((char)(lIIIIIIllIlIII ^ lIIIIIIllIIlII[lIIIIIIllIIIll % lIIIIIIllIIlII.length]));
            0;
            ++lIIIIIIllIIIll;
            ++lIIIIIIlIllIll;
            0;
            if (1 > -1) continue;
            return null;
        }
        return String.valueOf(lIIIIIIllIIlIl);
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (D.lIllllIlIIII(e.j(eW), llIllllll[10])) {
            bl = llIllllll[0];
            0;
            if (2 == 0) {
                return false;
            }
        } else {
            bl = llIllllll[1];
        }
        return bl;
    }

    private static void Q() {
        block64: {
            d lIIIIIlIlIIIlI;
            block63: {
                block62: {
                    block61: {
                        Object lIIIIIlIlIIIll;
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
                                                                                                        int[] nArray = new int[llIllllll[0]];
                                                                                                        nArray[D.llIllllll[1]] = llIllllll[22];
                                                                                                        if (!D.lIllllIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block41;
                                                                                                        int[] nArray2 = new int[llIllllll[0]];
                                                                                                        nArray2[D.llIllllll[1]] = llIllllll[22];
                                                                                                        if (!D.lIllllIIIlll(Bank.contains((int[])nArray2) ? 1 : 0)) break block42;
                                                                                                        int[] nArray3 = new int[llIllllll[0]];
                                                                                                        nArray3[D.llIllllll[1]] = llIllllll[22];
                                                                                                        if (!D.lIllllIIlIII(Bank.getFirst((int[])nArray3).getQuantity(), llIllllll[29])) break block42;
                                                                                                    }
                                                                                                    lIIIIIlIlIIIll = new d(llIllllll[22], llIllllll[29], llIllllll[93]);
                                                                                                    bx.add((d)lIIIIIlIlIIIll);
                                                                                                    0;
                                                                                                }
                                                                                                int[] nArray = new int[llIllllll[0]];
                                                                                                nArray[D.llIllllll[1]] = llIllllll[94];
                                                                                                if (D.lIllllIIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                                                                                                    lIIIIIlIlIIIll = new d(llIllllll[94], llIllllll[0], llIllllll[95]);
                                                                                                    bx.add((d)lIIIIIlIlIIIll);
                                                                                                    0;
                                                                                                }
                                                                                                int[] nArray4 = new int[llIllllll[0]];
                                                                                                nArray4[D.llIllllll[1]] = llIllllll[16];
                                                                                                if (!D.lIllllIIIlll(Bank.contains((int[])nArray4) ? 1 : 0)) break block43;
                                                                                                int[] nArray5 = new int[llIllllll[0]];
                                                                                                nArray5[D.llIllllll[1]] = llIllllll[16];
                                                                                                if (!D.lIllllIIIlll(Bank.contains((int[])nArray5) ? 1 : 0)) break block44;
                                                                                                int[] nArray6 = new int[llIllllll[0]];
                                                                                                nArray6[D.llIllllll[1]] = llIllllll[16];
                                                                                                if (!D.lIllllIIlIII(Bank.getFirst((int[])nArray6).getQuantity(), llIllllll[6])) break block44;
                                                                                            }
                                                                                            lIIIIIlIlIIIll = new d(llIllllll[16], llIllllll[6], llIllllll[96]);
                                                                                            bx.add((d)lIIIIIlIlIIIll);
                                                                                            0;
                                                                                        }
                                                                                        int[] nArray = new int[llIllllll[0]];
                                                                                        nArray[D.llIllllll[1]] = llIllllll[20];
                                                                                        if (!D.lIllllIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block45;
                                                                                        int[] nArray7 = new int[llIllllll[0]];
                                                                                        nArray7[D.llIllllll[1]] = llIllllll[20];
                                                                                        if (!D.lIllllIIIlll(Bank.contains((int[])nArray7) ? 1 : 0)) break block46;
                                                                                        int[] nArray8 = new int[llIllllll[0]];
                                                                                        nArray8[D.llIllllll[1]] = llIllllll[20];
                                                                                        if (!D.lIllllIIlIII(Bank.getFirst((int[])nArray8).getQuantity(), llIllllll[25])) break block46;
                                                                                    }
                                                                                    lIIIIIlIlIIIll = new d(llIllllll[20], llIllllll[25], llIllllll[11]);
                                                                                    bx.add((d)lIIIIIlIlIIIll);
                                                                                    0;
                                                                                }
                                                                                int[] nArray = new int[llIllllll[0]];
                                                                                nArray[D.llIllllll[1]] = llIllllll[18];
                                                                                if (!D.lIllllIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block47;
                                                                                int[] nArray9 = new int[llIllllll[0]];
                                                                                nArray9[D.llIllllll[1]] = llIllllll[18];
                                                                                if (!D.lIllllIIIlll(Bank.contains((int[])nArray9) ? 1 : 0)) break block48;
                                                                                int[] nArray10 = new int[llIllllll[0]];
                                                                                nArray10[D.llIllllll[1]] = llIllllll[18];
                                                                                if (!D.lIllllIIlIII(Bank.getFirst((int[])nArray10).getQuantity(), llIllllll[25])) break block48;
                                                                            }
                                                                            lIIIIIlIlIIIll = new d(llIllllll[18], llIllllll[25], llIllllll[11]);
                                                                            bx.add((d)lIIIIIlIlIIIll);
                                                                            0;
                                                                        }
                                                                        int[] nArray = new int[llIllllll[0]];
                                                                        nArray[D.llIllllll[1]] = llIllllll[27];
                                                                        if (!D.lIllllIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block49;
                                                                        int[] nArray11 = new int[llIllllll[0]];
                                                                        nArray11[D.llIllllll[1]] = llIllllll[27];
                                                                        if (!D.lIllllIIIlll(Bank.contains((int[])nArray11) ? 1 : 0)) break block50;
                                                                        int[] nArray12 = new int[llIllllll[0]];
                                                                        nArray12[D.llIllllll[1]] = llIllllll[27];
                                                                        if (!D.lIllllIIlIII(Bank.getFirst((int[])nArray12).getQuantity(), llIllllll[25])) break block50;
                                                                    }
                                                                    lIIIIIlIlIIIll = new d(llIllllll[27], llIllllll[25], llIllllll[11]);
                                                                    bx.add((d)lIIIIIlIlIIIll);
                                                                    0;
                                                                }
                                                                int[] nArray = new int[llIllllll[0]];
                                                                nArray[D.llIllllll[1]] = llIllllll[26];
                                                                if (!D.lIllllIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block51;
                                                                int[] nArray13 = new int[llIllllll[0]];
                                                                nArray13[D.llIllllll[1]] = llIllllll[26];
                                                                if (!D.lIllllIIIlll(Bank.contains((int[])nArray13) ? 1 : 0)) break block52;
                                                                int[] nArray14 = new int[llIllllll[0]];
                                                                nArray14[D.llIllllll[1]] = llIllllll[26];
                                                                if (!D.lIllllIIlIII(Bank.getFirst((int[])nArray14).getQuantity(), llIllllll[25])) break block52;
                                                            }
                                                            lIIIIIlIlIIIll = new d(llIllllll[26], llIllllll[25], llIllllll[11]);
                                                            bx.add((d)lIIIIIlIlIIIll);
                                                            0;
                                                        }
                                                        int[] nArray = new int[llIllllll[0]];
                                                        nArray[D.llIllllll[1]] = llIllllll[24];
                                                        if (!D.lIllllIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block53;
                                                        int[] nArray15 = new int[llIllllll[0]];
                                                        nArray15[D.llIllllll[1]] = llIllllll[24];
                                                        if (!D.lIllllIIIlll(Bank.contains((int[])nArray15) ? 1 : 0)) break block54;
                                                        int[] nArray16 = new int[llIllllll[0]];
                                                        nArray16[D.llIllllll[1]] = llIllllll[24];
                                                        if (!D.lIllllIIlIII(Bank.getFirst((int[])nArray16).getQuantity(), llIllllll[28])) break block54;
                                                    }
                                                    lIIIIIlIlIIIll = new d(llIllllll[24], llIllllll[28], llIllllll[97]);
                                                    bx.add((d)lIIIIIlIlIIIll);
                                                    0;
                                                }
                                                int[] nArray = new int[llIllllll[0]];
                                                nArray[D.llIllllll[1]] = llIllllll[17];
                                                if (!D.lIllllIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block55;
                                                int[] nArray17 = new int[llIllllll[0]];
                                                nArray17[D.llIllllll[1]] = llIllllll[17];
                                                if (!D.lIllllIIIlll(Bank.contains((int[])nArray17) ? 1 : 0)) break block56;
                                                int[] nArray18 = new int[llIllllll[0]];
                                                nArray18[D.llIllllll[1]] = llIllllll[17];
                                                if (!D.lIllllIIlIII(Bank.getFirst((int[])nArray18).getQuantity(), llIllllll[25])) break block56;
                                            }
                                            lIIIIIlIlIIIll = new d(llIllllll[17], llIllllll[25], llIllllll[11]);
                                            bx.add((d)lIIIIIlIlIIIll);
                                            0;
                                        }
                                        int[] nArray = new int[llIllllll[0]];
                                        nArray[D.llIllllll[1]] = llIllllll[17];
                                        if (!D.lIllllIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block57;
                                        int[] nArray19 = new int[llIllllll[0]];
                                        nArray19[D.llIllllll[1]] = llIllllll[17];
                                        if (!D.lIllllIIIlll(Bank.contains((int[])nArray19) ? 1 : 0)) break block58;
                                        int[] nArray20 = new int[llIllllll[0]];
                                        nArray20[D.llIllllll[1]] = llIllllll[17];
                                        if (!D.lIllllIIlIII(Bank.getFirst((int[])nArray20).getQuantity(), llIllllll[25])) break block58;
                                    }
                                    lIIIIIlIlIIIll = new d(llIllllll[17], llIllllll[25], llIllllll[11]);
                                    bx.add((d)lIIIIIlIlIIIll);
                                    0;
                                }
                                int[] nArray = new int[llIllllll[0]];
                                nArray[D.llIllllll[1]] = llIllllll[15];
                                if (D.lIllllIIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                                    lIIIIIlIlIIIll = new d(llIllllll[15], llIllllll[0], llIllllll[98]);
                                    bx.add((d)lIIIIIlIlIIIll);
                                    0;
                                }
                                int[] nArray21 = new int[llIllllll[0]];
                                nArray21[D.llIllllll[1]] = llIllllll[13];
                                if (!D.lIllllIIIlll(Bank.contains((int[])nArray21) ? 1 : 0)) break block59;
                                int[] nArray22 = new int[llIllllll[0]];
                                nArray22[D.llIllllll[1]] = llIllllll[13];
                                if (!D.lIllllIIIlll(Bank.contains((int[])nArray22) ? 1 : 0)) break block60;
                                int[] nArray23 = new int[llIllllll[0]];
                                nArray23[D.llIllllll[1]] = llIllllll[13];
                                if (!D.lIllllIIlIII(Bank.getFirst((int[])nArray23).getQuantity(), llIllllll[11])) break block60;
                            }
                            lIIIIIlIlIIIll = new d(llIllllll[13], llIllllll[11], llIllllll[99]);
                            bx.add((d)lIIIIIlIlIIIll);
                            0;
                        }
                        int[] nArray = new int[llIllllll[0]];
                        nArray[D.llIllllll[1]] = llIllllll[14];
                        if (D.lIllllIIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                            lIIIIIlIlIIIll = new d(llIllllll[14], llIllllll[0], llIllllll[100]);
                            bx.add((d)lIIIIIlIlIIIll);
                            0;
                        }
                        int[] nArray24 = new int[llIllllll[0]];
                        nArray24[D.llIllllll[1]] = llIllllll[15];
                        if (D.lIllllIIlIIl(Bank.contains((int[])nArray24) ? 1 : 0)) {
                            lIIIIIlIlIIIll = new d(llIllllll[15], llIllllll[0], llIllllll[98]);
                            bx.add((d)lIIIIIlIlIIIll);
                            0;
                        }
                        if (D.lIllllIIlIIl(Bank.contains((Predicate)(lIIIIIlIlIIIll = item -> item.getName().toLowerCase().contains(llIllllII[llIllllll[105]]))) ? 1 : 0)) {
                            lIIIIIlIlIIIlI = new d(llIllllll[101], llIllllll[8], llIllllll[102]);
                            bx.add(lIIIIIlIlIIIlI);
                            0;
                        }
                        int[] nArray25 = new int[llIllllll[0]];
                        nArray25[D.llIllllll[1]] = llIllllll[30];
                        if (!D.lIllllIIIlll(Bank.contains((int[])nArray25) ? 1 : 0)) break block61;
                        int[] nArray26 = new int[llIllllll[0]];
                        nArray26[D.llIllllll[1]] = llIllllll[30];
                        if (!D.lIllllIIIlll(Bank.contains((int[])nArray26) ? 1 : 0)) break block62;
                        int[] nArray27 = new int[llIllllll[0]];
                        nArray27[D.llIllllll[1]] = llIllllll[30];
                        if (!D.lIllllIIlIII(Bank.getFirst((int[])nArray27).getQuantity(), llIllllll[7])) break block62;
                    }
                    lIIIIIlIlIIIlI = new d(llIllllll[30], llIllllll[7], j.ch);
                    bx.add(lIIIIIlIlIIIlI);
                    0;
                }
                int[] nArray = new int[llIllllll[0]];
                nArray[D.llIllllll[1]] = llIllllll[12];
                if (!D.lIllllIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block63;
                int[] nArray28 = new int[llIllllll[0]];
                nArray28[D.llIllllll[1]] = llIllllll[12];
                if (!D.lIllllIIIlll(Bank.contains((int[])nArray28) ? 1 : 0)) break block64;
                int[] nArray29 = new int[llIllllll[0]];
                nArray29[D.llIllllll[1]] = llIllllll[12];
                if (!D.lIllllIIlIII(Bank.getFirst((int[])nArray29).getQuantity(), llIllllll[11])) break block64;
            }
            lIIIIIlIlIIIlI = new d(llIllllll[12], llIllllll[11], llIllllll[103]);
            bx.add(lIIIIIlIlIIIlI);
            0;
        }
    }

    private static void lIllllIIIlII() {
        llIllllII = new String[llIllllll[137]];
        D.llIllllII[D.llIllllll[1]] = D."Finished buying items, switching back to quest";
        D.llIllllII[D.llIllllll[0]] = D."- Crafting";
        D.llIllllII[D.llIllllll[4]] = D."- Woodcutting";
        D.llIllllII[D.llIllllll[6]] = D."- Prayer";
        D.llIllllII[D.llIllllll[7]] = D."";
        D.llIllllII[D.llIllllll[8]] = D."Nav to bank";
        D.llIllllII[D.llIllllll[10]] = D."Handling banking";
        D.llIllllII[D.llIllllll[19]] = D."We are missing quest supplies, switching to BUYING";
        D.llIllllII[D.llIllllll[21]] = D."We are missing quest supplies, switching to BUYING";
        D.llIllllII[D.llIllllll[23]] = D."Drink";
        D.llIllllII[D.llIllllll[11]] = D."Shark";
        D.llIllllII[D.llIllllll[31]] = D."Shark";
        D.llIllllII[D.llIllllll[29]] = D."Eat";
        D.llIllllII[D.llIllllll[35]] = D."Drink";
        D.llIllllII[D.llIllllll[36]] = D."Nav to start";
        D.llIllllII[D.llIllllll[37]] = D."Start quest";
        D.llIllllII[D.llIllllll[38]] = D."Warrior";
        D.llIllllII[D.llIllllll[41]] = D."Nav to tree";
        D.llIllllII[D.llIllllll[42]] = D."Handle midget";
        D.llIllllII[D.llIllllll[43]] = D."Shamus";
        D.llIllllII[D.llIllllll[45]] = D."Chop";
        D.llIllllII[D.llIllllll[46]] = D."Shamus";
        D.llIllllII[D.llIllllll[47]] = D."Shamus";
        D.llIllllII[D.llIllllll[34]] = D."Bronze axe";
        D.llIllllII[D.llIllllll[49]] = D."Drop axes";
        D.llIllllII[D.llIllllll[50]] = D."Bronze axe";
        D.llIllllII[D.llIllllll[51]] = D."Drop";
        D.llIllllII[D.llIllllll[53]] = D."Nav to tree";
        D.llIllllII[D.llIllllll[55]] = D."Dramen tree";
        D.llIllllII[D.llIllllll[56]] = D."Chop down";
        D.llIllllII[D.llIllllll[48]] = D."Killing spirit";
        D.llIllllII[D.llIllllll[2]] = D."Chaos rune";
        D.llIllllII[D.llIllllll[57]] = D."Chaos rune";
        D.llIllllII[D.llIllllll[59]] = D."Bronze axe";
        D.llIllllII[D.llIllllll[60]] = D."Nav to ladder";
        D.llIllllII[D.llIllllll[58]] = D."Can I journey on this ship?";
        D.llIllllII[D.llIllllll[3]] = D."Search away, I have nothing to hide.";
        D.llIllllII[D.llIllllll[61]] = D."Ok.";
        D.llIllllII[D.llIllllll[62]] = D."Talk monk";
        D.llIllllII[D.llIllllll[63]] = D."Ladder";
        D.llIllllII[D.llIllllll[64]] = D."Climb-down";
        D.llIllllII[D.llIllllll[65]] = D."Nav to zombies";
        D.llIllllII[D.llIllllll[66]] = D."Getting axe";
        D.llIllllII[D.llIllllll[67]] = D."Bronze axe";
        D.llIllllII[D.llIllllll[68]] = D."Chaos rune";
        D.llIllllII[D.llIllllll[5]] = D."Chaos rune";
        D.llIllllII[D.llIllllll[69]] = D."Bronze axe";
        D.llIllllII[D.llIllllll[70]] = D."Bronze axe";
        D.llIllllII[D.llIllllll[71]] = D."Take";
        D.llIllllII[D.llIllllll[72]] = D."Cutting tree";
        D.llIllllII[D.llIllllll[33]] = D."Dramen tree";
        D.llIllllII[D.llIllllll[73]] = D."Chop down";
        D.llIllllII[D.llIllllll[75]] = D."Break";
        D.llIllllII[D.llIllllll[76]] = D."Knife";
        D.llIllllII[D.llIllllll[77]] = D."Nav to knife";
        D.llIllllII[D.llIllllll[78]] = D."Knife";
        D.llIllllII[D.llIllllll[79]] = D."Knife";
        D.llIllllII[D.llIllllll[80]] = D."Take";
        D.llIllllII[D.llIllllll[81]] = D."Knife";
        D.llIllllII[D.llIllllll[82]] = D."Knife";
        D.llIllllII[D.llIllllll[83]] = D."Dramen branch";
        D.llIllllII[D.llIllllll[84]] = D."Dramen staff";
        D.llIllllII[D.llIllllll[85]] = D."Dramen staff";
        D.llIllllII[D.llIllllll[86]] = D."Dramen staff";
        D.llIllllII[D.llIllllll[87]] = D."Wield";
        D.llIllllII[D.llIllllll[88]] = D."Nav to shed";
        D.llIllllII[D.llIllllll[89]] = D."Entering shed";
        D.llIllllII[D.llIllllll[90]] = D."Door";
        D.llIllllII[D.llIllllll[91]] = D."Open";
        D.llIllllII[D.llIllllll[105]] = D."ring of wealth (";
        D.llIllllII[D.llIllllll[52]] = D."Zombie";
        D.llIllllII[D.llIllllll[106]] = D."Zombie";
        D.llIllllII[D.llIllllll[107]] = D."Zombie";
        D.llIllllII[D.llIllllll[108]] = D."Zombie";
        D.llIllllII[D.llIllllll[109]] = D."Zombie";
        D.llIllllII[D.llIllllll[128]] = D."Do you know any good adventures I can go on?";
        D.llIllllII[D.llIllllll[129]] = D."I don't think you've found a good adventure at all!";
        D.llIllllII[D.llIllllll[130]] = D."What makes you think it's out here?";
        D.llIllllII[D.llIllllll[131]] = D."If it's hidden how are you planning to find it?";
        D.llIllllII[D.llIllllll[132]] = D."Looks like you don't know either.";
        D.llIllllII[D.llIllllll[133]] = D."How does it fit in a shed then?";
        D.llIllllII[D.llIllllll[134]] = D."Well that is a risk I will have to take.";
        D.llIllllII[D.llIllllll[135]] = D."Yes.";
        D.llIllllII[D.llIllllll[136]] = D."";
    }

    private static boolean lIllllIIIlll(int n2) {
        return n2 != 0;
    }
}

