/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Locatable
 *  net.runelite.api.Prayer
 *  net.runelite.api.Quest
 *  net.runelite.api.QuestState
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.quests.Quests
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Prayers
 */
package l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-;

import gg.squire.account.AccBuilderEasyClues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.W;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.a;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.al;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.an;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.b;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.d;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.e;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.f;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.g;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.i;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.l;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.z;
import net.runelite.api.Locatable;
import net.runelite.api.Prayer;
import net.runelite.api.Quest;
import net.runelite.api.QuestState;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.Quests;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;

public class v
implements W {
    public static final /* synthetic */ WorldPoint cL;
    public static final /* synthetic */ WorldPoint cM;
    static /* synthetic */ boolean cm;
    public static final /* synthetic */ WorldPoint cQ;
    public static final /* synthetic */ WorldPoint cN;
    public static final /* synthetic */ WorldPoint cP;
    public static final /* synthetic */ WorldPoint cR;
    private static /* synthetic */ String[] lIIIIllll;
    public static final /* synthetic */ WorldPoint cO;
    public static final /* synthetic */ WorldPoint cT;
    private static /* synthetic */ int[] lIIIlIIlI;
    static /* synthetic */ int cl;
    public static /* synthetic */ List<d> bv;
    public static final /* synthetic */ WorldPoint cS;
    static /* synthetic */ WorldArea cV;
    static /* synthetic */ int cU;
    public static /* synthetic */ boolean bt;
    private static /* synthetic */ String[] bR;

    private static void lllIIIlIlIl() {
        lIIIlIIlI = new int[113];
        v.lIIIlIIlI[0] = 1;
        v.lIIIlIIlI[1] = (0x2E ^ 3 ^ (0xEC ^ 0xA0)) & (0x54 ^ 0x62 ^ (0xC8 ^ 0x9F) ^ -1);
        v.lIIIlIIlI[2] = 9 + 13 - 8 + 134 ^ 72 + 84 - -29 + 0;
        v.lIIIlIIlI[3] = 19 + 66 - 78 + 143 ^ 131 + 98 - 87 + 13;
        v.lIIIlIIlI[4] = -(0xFFFFF1DB & 0x4E75) & (0xFFFFD7DC & 0x7BFB);
        v.lIIIlIIlI[5] = 2;
        v.lIIIlIIlI[6] = 0x7A ^ 0x7E;
        v.lIIIlIIlI[7] = 0xFFFFCB6F & 0x36BE;
        v.lIIIlIIlI[8] = -(0xFFFFAA9F & 0x7563) & (0xFFFFA3EA & Short.MAX_VALUE);
        v.lIIIlIIlI[9] = -(0xFFFFFCD7 & 0x17BB) & (0xFFFFD6BF & 0x3FFF);
        v.lIIIlIIlI[10] = 0xFFFFEABE & 0x176B;
        v.lIIIlIIlI[11] = 3;
        v.lIIIlIIlI[12] = 0x16 ^ 0x10;
        v.lIIIlIIlI[13] = -(0xFFFFE79B & 0x787D) & (0xFFFFFFDF & 0x7F7F);
        v.lIIIlIIlI[14] = -(0xFFFFE5BF & 0x5EE3) & (0xFFFFF7F3 & 0x7DFF);
        v.lIIIlIIlI[15] = -(0xFFFFDE2F & 0x7FDF) & (0xFFFFDFBF & 0x7FCF);
        v.lIIIlIIlI[16] = 0x4F ^ 0x4A;
        v.lIIIlIIlI[17] = 0xFFFFD9B7 & 0x2FCA;
        v.lIIIlIIlI[18] = 0x70 ^ 0x7A;
        v.lIIIlIIlI[19] = 0xFFFFBFFB & 0x43E7;
        v.lIIIlIIlI[20] = 17 + 36 - 2 + 93 ^ 140 + 14 - 24 + 32;
        v.lIIIlIIlI[21] = 0x8F ^ 0x9C ^ (0xBC ^ 0xB6);
        v.lIIIlIIlI[22] = 0x35 ^ 0x3E ^ (0x18 ^ 0x14);
        v.lIIIlIIlI[23] = 23 + 1 - -121 + 7 ^ 133 + 128 - 233 + 116;
        v.lIIIlIIlI[24] = 0xA5 ^ 0xAC;
        v.lIIIlIIlI[25] = 0x73 ^ 0x78;
        v.lIIIlIIlI[26] = 0xD ^ 1;
        v.lIIIlIIlI[27] = 0x51 ^ 0xF ^ (0xFA ^ 0xAA);
        v.lIIIlIIlI[28] = 0x98 ^ 0xB7 ^ (0x3D ^ 0x1D);
        v.lIIIlIIlI[29] = 143 + 157 - 192 + 58 ^ 160 + 81 - 103 + 44;
        v.lIIIlIIlI[30] = 109 + 81 - 91 + 35 ^ 135 + 51 - 65 + 30;
        v.lIIIlIIlI[31] = 137 + 47 - 67 + 97 ^ 41 + 66 - -34 + 55;
        v.lIIIlIIlI[32] = 0x12 ^ 1;
        v.lIIIlIIlI[33] = 7 ^ 0x13;
        v.lIIIlIIlI[34] = 0x93 ^ 0x85 ^ 3;
        v.lIIIlIIlI[35] = 0x22 ^ 0x44 ^ (0x4A ^ 0x3A);
        v.lIIIlIIlI[36] = 0xE7 ^ 0xA9 ^ (0x74 ^ 0x2D);
        v.lIIIlIIlI[37] = 0xAB ^ 0x9E ^ (0x84 ^ 0xA9);
        v.lIIIlIIlI[38] = 0x69 ^ 0x22;
        v.lIIIlIIlI[39] = 0xD ^ 0x47;
        v.lIIIlIIlI[40] = 0x8E ^ 0x94;
        v.lIIIlIIlI[41] = 0xD1 ^ 0xA1 ^ (0xE8 ^ 0x83);
        v.lIIIlIIlI[42] = 0x1D ^ 0x51 ^ (0x97 ^ 0xC7);
        v.lIIIlIIlI[43] = 0xE ^ 0x13;
        v.lIIIlIIlI[44] = 0x25 ^ 0x3B;
        v.lIIIlIIlI[45] = 98 + 63 - 114 + 135 ^ 62 + 53 - 108 + 162;
        v.lIIIlIIlI[46] = 0xB ^ 0x2B;
        v.lIIIlIIlI[47] = 0x4C ^ 0x6D;
        v.lIIIlIIlI[48] = 0x81 ^ 0xA3;
        v.lIIIlIIlI[49] = 33 + 90 - 91 + 108 ^ 56 + 142 - 135 + 112;
        v.lIIIlIIlI[50] = 0x87 ^ 0xA3;
        v.lIIIlIIlI[51] = 0xF0 ^ 0x99 ^ (0xE5 ^ 0xA9);
        v.lIIIlIIlI[52] = 0x1F ^ 0x79 ^ (8 ^ 0x48);
        v.lIIIlIIlI[53] = 0x72 ^ 0x4C ^ (0xA3 ^ 0xBA);
        v.lIIIlIIlI[54] = 4 + 76 - -48 + 15 ^ 90 + 66 - 50 + 61;
        v.lIIIlIIlI[55] = 0x3E ^ 0x17;
        v.lIIIlIIlI[56] = 0x5A ^ 0x6A ^ (0x81 ^ 0x9B);
        v.lIIIlIIlI[57] = 0x95 ^ 0xBE;
        v.lIIIlIIlI[58] = 0xA6 ^ 0x8A;
        v.lIIIlIIlI[59] = 150 + 4 - -54 + 25 ^ 61 + 44 - -37 + 57;
        v.lIIIlIIlI[60] = 0x79 ^ 0x56;
        v.lIIIlIIlI[61] = 0x2B ^ 0x3C ^ (0x37 ^ 0x10);
        v.lIIIlIIlI[62] = 113 + 132 - 95 + 29 ^ 70 + 39 - 40 + 61;
        v.lIIIlIIlI[63] = 0xB0 ^ 0x83;
        v.lIIIlIIlI[64] = 0xCE ^ 0x8D ^ (0x52 ^ 0x25);
        v.lIIIlIIlI[65] = 0x5D ^ 0x68;
        v.lIIIlIIlI[66] = 0x13 ^ 0x25;
        v.lIIIlIIlI[67] = 0x14 ^ 0x23;
        v.lIIIlIIlI[68] = -(0xFFFFE98F & 0x767B) & (0xFFFFFE7F & 0x6DFA);
        v.lIIIlIIlI[69] = 0xFFFF8FF7 & 0x7DBB;
        v.lIIIlIIlI[70] = 29 + 91 - 119 + 149;
        v.lIIIlIIlI[71] = 0xA9 ^ 0x91;
        v.lIIIlIIlI[72] = 0xB ^ 0x32;
        v.lIIIlIIlI[73] = 0xFFFF9FA9 & 0x69D6;
        v.lIIIlIIlI[74] = -(0xFFFFF9DB & 0x3675) & (0xFFFFFDD7 & 0x3E7F);
        v.lIIIlIIlI[75] = 0xDE ^ 0xB1;
        v.lIIIlIIlI[76] = 0xA6 ^ 0x9C;
        v.lIIIlIIlI[77] = -(0xFFFFBE5F & 0x73FD) & (0xFFFFFBFD & 0x3FFF);
        v.lIIIlIIlI[78] = -(0xFFFFBEFF & 0x51DF) & (0xFFFFFCFF & 0x1FDF);
        v.lIIIlIIlI[79] = 0x1A ^ 0x2C ^ (0x18 ^ 0x15);
        v.lIIIlIIlI[80] = -(0xFFFFFB5F & 0x76A4) & (0xFFFFFF7F & 0x77FB);
        v.lIIIlIIlI[81] = 0xFFFFBFDF & 0x6EEC;
        v.lIIIlIIlI[82] = -(0xFFFFF383 & 0x1E7F) & (0xFFFFF3EF & 0x7FBA);
        v.lIIIlIIlI[83] = -(0xFFFFCFFF & 0x7531) & (0xFFFFF7FB & 0x7FFC);
        v.lIIIlIIlI[84] = 0xFFFF93D5 & 0x6FAE;
        v.lIIIlIIlI[85] = 0x21 ^ 0x45;
        v.lIIIlIIlI[86] = 0x78 ^ 0x44;
        v.lIIIlIIlI[87] = 48 + 68 - 67 + 112 ^ 42 + 136 - 164 + 142;
        v.lIIIlIIlI[88] = 82 + 152 - 61 + 18 ^ 81 + 120 - 119 + 47;
        v.lIIIlIIlI[89] = 0x52 ^ 0x6B ^ (0x48 ^ 0x4E);
        v.lIIIlIIlI[90] = 0x4C ^ 0xC;
        v.lIIIlIIlI[91] = 0xFFFF9ABF & 0x6F47;
        v.lIIIlIIlI[92] = -(0xFFFFED87 & 0x5379) & (0xFFFFEF7E & 0x5DFF);
        v.lIIIlIIlI[93] = 0xFFFF8BBE & 0x7E71;
        v.lIIIlIIlI[94] = 0xFFFFDF75 & 0x2CFF;
        v.lIIIlIIlI[95] = -(0xFFFFFDE3 & 0x769F) & (0xFFFFFFFF & 0x7EB7);
        v.lIIIlIIlI[96] = 0xFFFFEEFF & 0x1D76;
        v.lIIIlIIlI[97] = 0xFFFFFA3D & 0xFFA;
        v.lIIIlIIlI[98] = -(0xFFFFFB87 & 0x37FB) & (0xFFFFBFE7 & Short.MAX_VALUE);
        v.lIIIlIIlI[99] = 0xFFFFAA7F & 0x5FB7;
        v.lIIIlIIlI[100] = 0xFFFFDF4F & 0x2CF6;
        v.lIIIlIIlI[101] = 0xFFFFFE1F & 0xBFA;
        v.lIIIlIIlI[102] = -(0xFFFFEF33 & 0x72CF) & (0xFFFFFFF7 & 0x6E4E);
        v.lIIIlIIlI[103] = -(0xFFFFF1EF & 0x3F79) & (0xFFFFFBFB & 0x3F7E);
        v.lIIIlIIlI[104] = 0xFFFFAC7C & 0x5FCB;
        v.lIIIlIIlI[105] = -(0xFFFFF777 & 0x7A89) & (0xFFFFFEF7 & 0x7F4F);
        v.lIIIlIIlI[106] = -(0xFFFFF747 & 0x68FD) & (0xFFFFFB7F & 0x6EFE);
        v.lIIIlIIlI[107] = 0xFFFFBDFF & 0x4E5F;
        v.lIIIlIIlI[108] = -(0xFFFFFBF7 & 0x76AD) & (0xFFFFFFEF & 0x7EF7);
        v.lIIIlIIlI[109] = 0x32 ^ 0x73;
        v.lIIIlIIlI[110] = 0x73 ^ 0x63 ^ (0x1F ^ 0x4D);
        v.lIIIlIIlI[111] = 0xC3 ^ 0x80;
        v.lIIIlIIlI[112] = 0x9B ^ 0x9F ^ (0x25 ^ 0x65);
    }

    private static boolean lllIIIllIll(int n2) {
        return n2 > 0;
    }

    private static boolean lllIIlIIIII(int n2, int n3) {
        return n2 != n3;
    }

    private static void af() {
        block35: {
            d lIIlIIIIlIllIII;
            block34: {
                block33: {
                    block32: {
                        block31: {
                            block30: {
                                Object lIIlIIIIlIllIIl;
                                block29: {
                                    block28: {
                                        block27: {
                                            block26: {
                                                block25: {
                                                    block24: {
                                                        block23: {
                                                            block22: {
                                                                int[] nArray = new int[lIIIlIIlI[0]];
                                                                nArray[v.lIIIlIIlI[1]] = lIIIlIIlI[9];
                                                                if (!v.lllIIIlIllI(Bank.contains((int[])nArray) ? 1 : 0)) break block22;
                                                                int[] nArray2 = new int[lIIIlIIlI[0]];
                                                                nArray2[v.lIIIlIIlI[1]] = lIIIlIIlI[9];
                                                                if (!v.lllIIIlIllI(Bank.contains((int[])nArray2) ? 1 : 0)) break block23;
                                                                int[] nArray3 = new int[lIIIlIIlI[0]];
                                                                nArray3[v.lIIIlIIlI[1]] = lIIIlIIlI[9];
                                                                if (!v.lllIIIlIlll(Bank.getFirst((int[])nArray3).getQuantity(), lIIIlIIlI[8])) break block23;
                                                            }
                                                            lIIlIIIIlIllIIl = new d(lIIIlIIlI[9], lIIIlIIlI[8], lIIIlIIlI[18]);
                                                            bv.add((d)lIIlIIIIlIllIIl);
                                                            0;
                                                        }
                                                        int[] nArray = new int[lIIIlIIlI[0]];
                                                        nArray[v.lIIIlIIlI[1]] = lIIIlIIlI[7];
                                                        if (!v.lllIIIlIllI(Bank.contains((int[])nArray) ? 1 : 0)) break block24;
                                                        int[] nArray4 = new int[lIIIlIIlI[0]];
                                                        nArray4[v.lIIIlIIlI[1]] = lIIIlIIlI[7];
                                                        if (!v.lllIIIlIllI(Bank.contains((int[])nArray4) ? 1 : 0)) break block25;
                                                        int[] nArray5 = new int[lIIIlIIlI[0]];
                                                        nArray5[v.lIIIlIIlI[1]] = lIIIlIIlI[7];
                                                        if (!v.lllIIIlIlll(Bank.getFirst((int[])nArray5).getQuantity(), lIIIlIIlI[8])) break block25;
                                                    }
                                                    lIIlIIIIlIllIIl = new d(lIIIlIIlI[7], lIIIlIIlI[8], lIIIlIIlI[18]);
                                                    bv.add((d)lIIlIIIIlIllIIl);
                                                    0;
                                                }
                                                int[] nArray = new int[lIIIlIIlI[0]];
                                                nArray[v.lIIIlIIlI[1]] = lIIIlIIlI[10];
                                                if (!v.lllIIIlIllI(Bank.contains((int[])nArray) ? 1 : 0)) break block26;
                                                int[] nArray6 = new int[lIIIlIIlI[0]];
                                                nArray6[v.lIIIlIIlI[1]] = lIIIlIIlI[10];
                                                if (!v.lllIIIlIllI(Bank.contains((int[])nArray6) ? 1 : 0)) break block27;
                                                int[] nArray7 = new int[lIIIlIIlI[0]];
                                                nArray7[v.lIIIlIIlI[1]] = lIIIlIIlI[10];
                                                if (!v.lllIIIlIlll(Bank.getFirst((int[])nArray7).getQuantity(), lIIIlIIlI[8])) break block27;
                                            }
                                            lIIlIIIIlIllIIl = new d(lIIIlIIlI[10], lIIIlIIlI[8], lIIIlIIlI[18]);
                                            bv.add((d)lIIlIIIIlIllIIl);
                                            0;
                                        }
                                        int[] nArray = new int[lIIIlIIlI[0]];
                                        nArray[v.lIIIlIIlI[1]] = lIIIlIIlI[15];
                                        if (!v.lllIIIlIllI(Bank.contains((int[])nArray) ? 1 : 0)) break block28;
                                        int[] nArray8 = new int[lIIIlIIlI[0]];
                                        nArray8[v.lIIIlIIlI[1]] = lIIIlIIlI[15];
                                        if (!v.lllIIIlIllI(Bank.contains((int[])nArray8) ? 1 : 0)) break block29;
                                        int[] nArray9 = new int[lIIIlIIlI[0]];
                                        nArray9[v.lIIIlIIlI[1]] = lIIIlIIlI[15];
                                        if (!v.lllIIIlIlll(Bank.getFirst((int[])nArray9).getQuantity(), lIIIlIIlI[28])) break block29;
                                    }
                                    lIIlIIIIlIllIIl = new d(lIIIlIIlI[15], lIIIlIIlI[33], lIIIlIIlI[80]);
                                    bv.add((d)lIIlIIIIlIllIIl);
                                    0;
                                }
                                if (v.lllIIIllIII(Bank.contains((Predicate)(lIIlIIIIlIllIIl = item -> item.getName().toLowerCase().contains(lIIIIllll[lIIIlIIlI[87]]))) ? 1 : 0)) {
                                    lIIlIIIIlIllIII = new d(lIIIlIIlI[81], lIIIlIIlI[16], lIIIlIIlI[82]);
                                    bv.add(lIIlIIIIlIllIII);
                                    0;
                                }
                                int[] nArray = new int[lIIIlIIlI[0]];
                                nArray[v.lIIIlIIlI[1]] = lIIIlIIlI[14];
                                if (!v.lllIIIlIllI(Bank.contains((int[])nArray) ? 1 : 0)) break block30;
                                int[] nArray10 = new int[lIIIlIIlI[0]];
                                nArray10[v.lIIIlIIlI[1]] = lIIIlIIlI[14];
                                if (!v.lllIIIlIllI(Bank.contains((int[])nArray10) ? 1 : 0)) break block31;
                                int[] nArray11 = new int[lIIIlIIlI[0]];
                                nArray11[v.lIIIlIIlI[1]] = lIIIlIIlI[14];
                                if (!v.lllIIIlIlll(Bank.getFirst((int[])nArray11).getQuantity(), lIIIlIIlI[6])) break block31;
                            }
                            lIIlIIIIlIllIII = new d(lIIIlIIlI[14], lIIIlIIlI[6], i.bq);
                            bv.add(lIIlIIIIlIllIII);
                            0;
                        }
                        int[] nArray = new int[lIIIlIIlI[0]];
                        nArray[v.lIIIlIIlI[1]] = lIIIlIIlI[17];
                        if (!v.lllIIIlIllI(Bank.contains((int[])nArray) ? 1 : 0)) break block32;
                        int[] nArray12 = new int[lIIIlIIlI[0]];
                        nArray12[v.lIIIlIIlI[1]] = lIIIlIIlI[17];
                        if (!v.lllIIIlIllI(Bank.contains((int[])nArray12) ? 1 : 0)) break block33;
                        int[] nArray13 = new int[lIIIlIIlI[0]];
                        nArray13[v.lIIIlIIlI[1]] = lIIIlIIlI[17];
                        if (!v.lllIIIlIlll(Bank.getFirst((int[])nArray13).getQuantity(), lIIIlIIlI[5])) break block33;
                    }
                    lIIlIIIIlIllIII = new d(lIIIlIIlI[17], lIIIlIIlI[11], lIIIlIIlI[83]);
                    bv.add(lIIlIIIIlIllIII);
                    0;
                }
                int[] nArray = new int[lIIIlIIlI[0]];
                nArray[v.lIIIlIIlI[1]] = lIIIlIIlI[13];
                if (!v.lllIIIlIllI(Bank.contains((int[])nArray) ? 1 : 0)) break block34;
                int[] nArray14 = new int[lIIIlIIlI[0]];
                nArray14[v.lIIIlIIlI[1]] = lIIIlIIlI[13];
                if (!v.lllIIIlIllI(Bank.contains((int[])nArray14) ? 1 : 0)) break block35;
                int[] nArray15 = new int[lIIIlIIlI[0]];
                nArray15[v.lIIIlIIlI[1]] = lIIIlIIlI[13];
                if (!v.lllIIIlIlll(Bank.getFirst((int[])nArray15).getQuantity(), lIIIlIIlI[28])) break block35;
            }
            lIIlIIIIlIllIII = new d(lIIIlIIlI[13], lIIIlIIlI[54], lIIIlIIlI[84]);
            bv.add(lIIlIIIIlIllIII);
            0;
        }
    }

    @Override
    public String U() {
        return lIIIIllll[lIIIlIIlI[86]];
    }

    private static boolean lllIIIlllll(Object object) {
        return object == null;
    }

    public static void aR() {
        block76: {
            block82: {
                block84: {
                    block83: {
                        BankLocation lIIlIIIIllIIIlI;
                        block77: {
                            block81: {
                                block79: {
                                    block80: {
                                        block78: {
                                            if (v.lllIIIlIllI(bt ? 1 : 0)) {
                                                b.a(bv);
                                                if (v.lllIIIlIlll(bv.size(), lIIIlIIlI[0])) {
                                                    System.out.println(lIIIIllll[lIIIlIIlI[1]]);
                                                    bt = lIIIlIIlI[1];
                                                }
                                            }
                                            if (!v.lllIIIllIII(bt ? 1 : 0)) break block76;
                                            if (v.lllIIIlIlll(Skills.getLevel((Skill)Skill.PRAYER), lIIIlIIlI[2])) {
                                                al.dD();
                                            }
                                            if (v.lllIIIllIIl(Skills.getLevel((Skill)Skill.PRAYER), lIIIlIIlI[2]) && v.lllIIIlIlll(Skills.getLevel((Skill)Skill.MAGIC), lIIIlIIlI[3])) {
                                                l.Y();
                                            }
                                            if (!v.lllIIIllIII(v.ab() ? 1 : 0) || !v.lllIIIlIlll(e.j(cU), lIIIlIIlI[0]) || !v.lllIIIllIIl(Skills.getLevel((Skill)Skill.PRAYER), lIIIlIIlI[2]) || !v.lllIIIllIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIlIIlI[3])) break block77;
                                            lIIlIIIIllIIIlI = BankLocation.getNearest();
                                            if (v.lllIIIllIlI(lIIlIIIIllIIIlI) && v.lllIIIllIII(lIIlIIIIllIIIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                AccBuilderEasyClues.c = lIIIIllll[lIIIlIIlI[0]];
                                                a.a(lIIlIIIIllIIIlI);
                                            }
                                            if (!v.lllIIIllIlI(lIIlIIIIllIIIlI) || !v.lllIIIlIllI(lIIlIIIIllIIIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block77;
                                            if (v.lllIIIllIII(Bank.isOpen() ? 1 : 0)) {
                                                a.a();
                                                Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIlIIlI[4]);
                                                0;
                                            }
                                            if (!v.lllIIIlIllI(Bank.isOpen() ? 1 : 0)) break block77;
                                            AccBuilderEasyClues.c = lIIIIllll[lIIIlIIlI[5]];
                                            if (v.lllIIIllIll(Inventory.getAll().size())) {
                                                Bank.depositInventory();
                                                Time.sleepTicks((int)lIIIlIIlI[6]);
                                                0;
                                            }
                                            if (v.lllIIIllIll(Equipment.getAll().size())) {
                                                Bank.depositEquipment();
                                                Time.sleepTicks((int)lIIIlIIlI[5]);
                                                0;
                                            }
                                            int[] nArray = new int[lIIIlIIlI[0]];
                                            nArray[v.lIIIlIIlI[1]] = lIIIlIIlI[7];
                                            if (!v.lllIIIlIllI(Bank.contains((int[])nArray) ? 1 : 0)) break block78;
                                            int[] nArray2 = new int[lIIIlIIlI[0]];
                                            nArray2[v.lIIIlIIlI[1]] = lIIIlIIlI[7];
                                            if (!v.lllIIIllIIl(Bank.getFirst((int[])nArray2).getQuantity(), lIIIlIIlI[8])) break block79;
                                        }
                                        int[] nArray = new int[lIIIlIIlI[0]];
                                        nArray[v.lIIIlIIlI[1]] = lIIIlIIlI[9];
                                        if (!v.lllIIIlIllI(Bank.contains((int[])nArray) ? 1 : 0)) break block80;
                                        int[] nArray3 = new int[lIIIlIIlI[0]];
                                        nArray3[v.lIIIlIIlI[1]] = lIIIlIIlI[9];
                                        if (!v.lllIIIllIIl(Bank.getFirst((int[])nArray3).getQuantity(), lIIIlIIlI[8])) break block79;
                                    }
                                    int[] nArray = new int[lIIIlIIlI[0]];
                                    nArray[v.lIIIlIIlI[1]] = lIIIlIIlI[10];
                                    if (!v.lllIIIlIllI(Bank.contains((int[])nArray) ? 1 : 0)) break block81;
                                    int[] nArray4 = new int[lIIIlIIlI[0]];
                                    nArray4[v.lIIIlIIlI[1]] = lIIIlIIlI[10];
                                    if (!v.lllIIIlIlll(Bank.getFirst((int[])nArray4).getQuantity(), lIIIlIIlI[8])) break block81;
                                }
                                v.af();
                                System.out.println(lIIIIllll[lIIIlIIlI[11]]);
                                bt = lIIIlIIlI[0];
                                return;
                            }
                            int[] nArray = new int[lIIIlIIlI[12]];
                            nArray[v.lIIIlIIlI[1]] = lIIIlIIlI[13];
                            nArray[v.lIIIlIIlI[0]] = lIIIlIIlI[7];
                            nArray[v.lIIIlIIlI[5]] = lIIIlIIlI[10];
                            nArray[v.lIIIlIIlI[11]] = lIIIlIIlI[14];
                            nArray[v.lIIIlIIlI[6]] = lIIIlIIlI[15];
                            nArray[v.lIIIlIIlI[16]] = lIIIlIIlI[17];
                            if (v.lllIIIllIII(e.b(nArray) ? 1 : 0)) {
                                v.af();
                                System.out.println(lIIIIllll[lIIIlIIlI[6]]);
                                bt = lIIIlIIlI[0];
                                return;
                            }
                            int[] nArray5 = new int[lIIIlIIlI[12]];
                            nArray5[v.lIIIlIIlI[1]] = lIIIlIIlI[13];
                            nArray5[v.lIIIlIIlI[0]] = lIIIlIIlI[7];
                            nArray5[v.lIIIlIIlI[5]] = lIIIlIIlI[10];
                            nArray5[v.lIIIlIIlI[11]] = lIIIlIIlI[14];
                            nArray5[v.lIIIlIIlI[6]] = lIIIlIIlI[15];
                            nArray5[v.lIIIlIIlI[16]] = lIIIlIIlI[17];
                            if (v.lllIIIlIllI(e.b(nArray5) ? 1 : 0)) {
                                while (v.lllIIIllIII(z.bi() ? 1 : 0)) {
                                    z.bg();
                                    Time.sleepTicks((int)lIIIlIIlI[0]);
                                    0;
                                    0;
                                    if ((0x38 ^ 0x3D) > 0) continue;
                                    return;
                                }
                                if (v.lllIIIllIII(Bank.isOpen() ? 1 : 0)) {
                                    a.a();
                                    Time.sleepTicks((int)lIIIlIIlI[12]);
                                    0;
                                }
                                a.a(lIIIlIIlI[13], lIIIlIIlI[18]);
                                a.a(lIIIlIIlI[14], lIIIlIIlI[11]);
                                a.a(lIIIlIIlI[7], lIIIlIIlI[8]);
                                a.a(lIIIlIIlI[10], lIIIlIIlI[8]);
                                a.a(lIIIlIIlI[17], lIIIlIIlI[11]);
                                a.a(lIIIlIIlI[15], lIIIlIIlI[18]);
                                a.a(lIIIlIIlI[19], lIIIlIIlI[4]);
                            }
                        }
                        if (v.lllIIIlIllI(Inventory.contains((int[])f.aV) ? 1 : 0) && v.lllIIIlIlll(Movement.getRunEnergy(), lIIIlIIlI[20])) {
                            Inventory.getFirst((int[])f.aV).interact(lIIIIllll[lIIIlIIlI[16]]);
                            Time.sleepTicks((int)lIIIlIIlI[0]);
                            0;
                        }
                        if (v.lllIIIlIlll(Prayers.getPoints(), lIIIlIIlI[21]) && v.lllIIIlIllI(Inventory.contains((int[])f.aS) ? 1 : 0)) {
                            Inventory.getFirst((int[])f.aS).interact(lIIIIllll[lIIIlIIlI[12]]);
                        }
                        if (v.lllIIIlIllI(v.ab() ? 1 : 0) && v.lllIIIllIII(e.j(cU))) {
                            if (v.lllIIIlllII(Players.getLocal().getWorldLocation().distanceTo(cL), lIIIlIIlI[16])) {
                                AccBuilderEasyClues.c = lIIIIllll[lIIIlIIlI[22]];
                                if (v.lllIIIlIllI(Dialog.isOpen() ? 1 : 0)) {
                                    Dialog.close();
                                }
                                Movement.walkTo((WorldPoint)cL);
                                0;
                                Time.sleepTicks((int)lIIIlIIlI[0]);
                                0;
                            }
                            if (v.lllIIIlllIl(Players.getLocal().getWorldLocation().distanceTo(cL), lIIIlIIlI[16])) {
                                g.a(lIIIIllll[lIIIlIIlI[23]], bR);
                            }
                        }
                        if (v.lllIIIllllI(e.j(cU), lIIIlIIlI[0])) {
                            if (v.lllIIIlllII(Players.getLocal().getWorldLocation().distanceTo(cM), lIIIlIIlI[6]) && v.lllIIIlllII(Players.getLocal().getWorldLocation().distanceTo(cN), lIIIlIIlI[6])) {
                                AccBuilderEasyClues.c = lIIIIllll[lIIIlIIlI[24]];
                                Movement.walkTo((WorldPoint)cM);
                                0;
                                Time.sleepTicks((int)lIIIlIIlI[0]);
                                0;
                            }
                            if (v.lllIIIlllIl(Players.getLocal().getWorldLocation().distanceTo(cM), lIIIlIIlI[12])) {
                                AccBuilderEasyClues.c = lIIIIllll[lIIIlIIlI[18]];
                                String[] stringArray = new String[lIIIlIIlI[0]];
                                stringArray[v.lIIIlIIlI[1]] = lIIIIllll[lIIIlIIlI[25]];
                                String[] stringArray2 = new String[lIIIlIIlI[0]];
                                stringArray2[v.lIIIlIIlI[1]] = lIIIIllll[lIIIlIIlI[26]];
                                if (v.lllIIIlIllI(TileObjects.getNearest((String[])stringArray).hasAction(stringArray2) ? 1 : 0)) {
                                    String[] stringArray3 = new String[lIIIlIIlI[0]];
                                    stringArray3[v.lIIIlIIlI[1]] = lIIIIllll[lIIIlIIlI[3]];
                                    if (v.lllIIIllIII(Reachable.isInteractable((Locatable)TileObjects.getNearest((String[])stringArray3)) ? 1 : 0)) {
                                        String[] stringArray4 = new String[lIIIlIIlI[0]];
                                        stringArray4[v.lIIIlIIlI[1]] = lIIIIllll[lIIIlIIlI[27]];
                                        TileObjects.getNearest((String[])stringArray4).interact(lIIIIllll[lIIIlIIlI[28]]);
                                        Time.sleepTicks((int)lIIIlIIlI[6]);
                                        0;
                                    }
                                }
                                String[] stringArray5 = new String[lIIIlIIlI[0]];
                                stringArray5[v.lIIIlIIlI[1]] = lIIIIllll[lIIIlIIlI[29]];
                                if (v.lllIIIlIllI(Reachable.isInteractable((Locatable)TileObjects.getNearest((String[])stringArray5)) ? 1 : 0)) {
                                    String[] stringArray6 = new String[lIIIlIIlI[0]];
                                    stringArray6[v.lIIIlIIlI[1]] = lIIIIllll[lIIIlIIlI[30]];
                                    String[] stringArray7 = new String[lIIIlIIlI[0]];
                                    stringArray7[v.lIIIlIIlI[1]] = lIIIIllll[lIIIlIIlI[31]];
                                    if (v.lllIIIlIllI(TileObjects.getNearest((String[])stringArray6).hasAction(stringArray7) ? 1 : 0)) {
                                        String[] stringArray8 = new String[lIIIlIIlI[0]];
                                        stringArray8[v.lIIIlIIlI[1]] = lIIIIllll[lIIIlIIlI[32]];
                                        TileObjects.getNearest((String[])stringArray8).interact(lIIIIllll[lIIIlIIlI[33]]);
                                        Time.sleepTicks((int)lIIIlIIlI[5]);
                                        0;
                                    }
                                    String[] stringArray9 = new String[lIIIlIIlI[0]];
                                    stringArray9[v.lIIIlIIlI[1]] = lIIIIllll[lIIIlIIlI[34]];
                                    String[] stringArray10 = new String[lIIIlIIlI[0]];
                                    stringArray10[v.lIIIlIIlI[1]] = lIIIIllll[lIIIlIIlI[35]];
                                    if (v.lllIIIlIllI(TileObjects.getNearest((String[])stringArray9).hasAction(stringArray10) ? 1 : 0)) {
                                        String[] stringArray11 = new String[lIIIlIIlI[0]];
                                        stringArray11[v.lIIIlIIlI[1]] = lIIIIllll[lIIIlIIlI[36]];
                                        TileObjects.getNearest((String[])stringArray11).interact(lIIIIllll[lIIIlIIlI[37]]);
                                        Time.sleepTicks((int)lIIIlIIlI[5]);
                                        0;
                                    }
                                }
                            }
                        }
                        if (v.lllIIIllllI(e.j(cU), lIIIlIIlI[5])) {
                            int[] nArray = new int[lIIIlIIlI[0]];
                            nArray[v.lIIIlIIlI[1]] = lIIIlIIlI[38];
                            if (v.lllIIIlIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray6 = new int[lIIIlIIlI[0]];
                                nArray6[v.lIIIlIIlI[1]] = lIIIlIIlI[38];
                                Inventory.getFirst((int[])nArray6).interact(lIIIIllll[lIIIlIIlI[21]]);
                            }
                            int[] nArray7 = new int[lIIIlIIlI[0]];
                            nArray7[v.lIIIlIIlI[1]] = lIIIlIIlI[39];
                            if (v.lllIIIlIllI(Inventory.contains((int[])nArray7) ? 1 : 0)) {
                                int[] nArray8 = new int[lIIIlIIlI[0]];
                                nArray8[v.lIIIlIIlI[1]] = lIIIlIIlI[39];
                                Inventory.getFirst((int[])nArray8).interact(lIIIIllll[lIIIlIIlI[40]]);
                            }
                            if (v.lllIIIllIII(cV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                if (v.lllIIIlllII(Players.getLocal().getWorldLocation().distanceTo(cO), lIIIlIIlI[6])) {
                                    AccBuilderEasyClues.c = lIIIIllll[lIIIlIIlI[41]];
                                    Movement.walkTo((WorldPoint)cO);
                                    0;
                                    Time.sleepTicks((int)lIIIlIIlI[0]);
                                    0;
                                }
                                if (v.lllIIIlllIl(Players.getLocal().getWorldLocation().distanceTo(cO), lIIIlIIlI[6]) && v.lllIIIllIII(Players.getLocal().isMoving() ? 1 : 0) && v.lllIIIllIII(Dialog.isOpen() ? 1 : 0)) {
                                    String[] stringArray = new String[lIIIlIIlI[0]];
                                    stringArray[v.lIIIlIIlI[1]] = lIIIIllll[lIIIlIIlI[42]];
                                    TileObjects.getNearest((String[])stringArray).interact(lIIIIllll[lIIIlIIlI[43]]);
                                    Time.sleepTicks((int)lIIIlIIlI[5]);
                                    0;
                                }
                            }
                            if (v.lllIIIlIllI(cV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                if (v.lllIIIlllII(Players.getLocal().getWorldLocation().distanceTo(cP), lIIIlIIlI[6])) {
                                    AccBuilderEasyClues.c = lIIIIllll[lIIIlIIlI[44]];
                                    Movement.walkTo((WorldPoint)cP);
                                    0;
                                    Time.sleepTicks((int)lIIIlIIlI[0]);
                                    0;
                                }
                                if (v.lllIIIlllIl(Players.getLocal().getWorldLocation().distanceTo(cP), lIIIlIIlI[6]) && v.lllIIIllIII(Players.getLocal().isMoving() ? 1 : 0)) {
                                    g.a(lIIIIllll[lIIIlIIlI[45]], bR);
                                }
                            }
                        }
                        if (v.lllIIIllllI(e.j(cU), lIIIlIIlI[11])) {
                            String[] stringArray = new String[lIIIlIIlI[0]];
                            stringArray[v.lIIIlIIlI[1]] = lIIIIllll[lIIIlIIlI[46]];
                            if (v.lllIIIllIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                if (v.lllIIIlllII(Players.getLocal().getWorldLocation().distanceTo(cS), lIIIlIIlI[16])) {
                                    AccBuilderEasyClues.c = lIIIIllll[lIIIlIIlI[47]];
                                    Movement.walkTo((WorldPoint)cS);
                                    0;
                                    Time.sleepTicks((int)lIIIlIIlI[0]);
                                    0;
                                }
                                if (v.lllIIIlllIl(Players.getLocal().getWorldLocation().distanceTo(cS), lIIIlIIlI[16])) {
                                    g.a(lIIIIllll[lIIIlIIlI[48]], bR);
                                }
                            }
                            String[] stringArray12 = new String[lIIIlIIlI[0]];
                            stringArray12[v.lIIIlIIlI[1]] = lIIIIllll[lIIIlIIlI[49]];
                            if (v.lllIIIlIllI(Inventory.contains((String[])stringArray12) ? 1 : 0)) {
                                AccBuilderEasyClues.c = lIIIIllll[lIIIlIIlI[50]];
                                if (v.lllIIIlllII(Players.getLocal().getWorldLocation().distanceTo(cP), lIIIlIIlI[16])) {
                                    AccBuilderEasyClues.c = lIIIIllll[lIIIlIIlI[51]];
                                    Movement.walkTo((WorldPoint)cP);
                                    0;
                                    Time.sleepTicks((int)lIIIlIIlI[0]);
                                    0;
                                }
                                if (v.lllIIIlllIl(Players.getLocal().getWorldLocation().distanceTo(cP), lIIIlIIlI[16])) {
                                    g.a(lIIIIllll[lIIIlIIlI[52]], bR);
                                }
                            }
                        }
                        if (v.lllIIIllllI(e.j(cU), lIIIlIIlI[16])) {
                            if (v.lllIIIlllII(Players.getLocal().getWorldLocation().distanceTo(cT), lIIIlIIlI[11])) {
                                AccBuilderEasyClues.c = lIIIIllll[lIIIlIIlI[53]];
                                Movement.walkTo((WorldPoint)cT);
                                0;
                                Time.sleepTicks((int)lIIIlIIlI[0]);
                                0;
                            }
                            if (v.lllIIIlllIl(Players.getLocal().getWorldLocation().distanceTo(cT), lIIIlIIlI[11]) && v.lllIIIllIII(Players.getLocal().isMoving() ? 1 : 0) && v.lllIIIllIII(Dialog.isOpen() ? 1 : 0)) {
                                String[] stringArray = new String[lIIIlIIlI[0]];
                                stringArray[v.lIIIlIIlI[1]] = lIIIIllll[lIIIlIIlI[54]];
                                Inventory.getFirst((String[])stringArray).useOn(TileObjects.getNearest(tileObject -> {
                                    int n2;
                                    if (v.lllIIIlIllI(tileObject.getName().contains(lIIIIllll[lIIIlIIlI[90]]) ? 1 : 0) && v.lllIIIlllIl(tileObject.getWorldLocation().distanceTo(cT), lIIIlIIlI[11])) {
                                        n2 = lIIIlIIlI[0];
                                        0;
                                        if (null != null) {
                                            return ((0x3D ^ 0x2D ^ (0x79 ^ 0x3A)) & (0x59 ^ 0x73 ^ (0x27 ^ 0x5E) ^ -1)) != 0;
                                        }
                                    } else {
                                        n2 = lIIIlIIlI[1];
                                    }
                                    return n2 != 0;
                                }));
                                Time.sleepTicks((int)lIIIlIIlI[5]);
                                0;
                            }
                        }
                        if (v.lllIIIllllI(e.j(cU), lIIIlIIlI[12])) {
                            if (v.lllIIIllIII(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                            }
                            if (v.lllIIIllIII(l.ad() ? 1 : 0)) {
                                l.ae();
                            }
                            if (v.lllIIIlllll(Players.getLocal().getInteracting())) {
                                String[] stringArray = new String[lIIIlIIlI[0]];
                                stringArray[v.lIIIlIIlI[1]] = lIIIIllll[lIIIlIIlI[55]];
                                if (v.lllIIIllIlI(NPCs.getNearest((String[])stringArray))) {
                                    String[] stringArray13 = new String[lIIIlIIlI[0]];
                                    stringArray13[v.lIIIlIIlI[1]] = lIIIIllll[lIIIlIIlI[56]];
                                    NPCs.getNearest((String[])stringArray13).interact(lIIIIllll[lIIIlIIlI[57]]);
                                    Time.sleepTicks((int)lIIIlIIlI[5]);
                                    0;
                                }
                            }
                        }
                        if (v.lllIIIllllI(e.j(cU), lIIIlIIlI[23]) && v.lllIIIlllll(Players.getLocal().getInteracting())) {
                            g.a(lIIIIllll[lIIIlIIlI[58]], bR);
                        }
                        if (v.lllIIIllllI(e.j(cU), lIIIlIIlI[24])) {
                            if (v.lllIIIllIII(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                            }
                            if (v.lllIIIllIII(l.ad() ? 1 : 0)) {
                                l.ae();
                            }
                            String[] stringArray = new String[lIIIlIIlI[0]];
                            stringArray[v.lIIIlIIlI[1]] = lIIIIllll[lIIIlIIlI[2]];
                            if (v.lllIIIllIlI(NPCs.getNearest((String[])stringArray))) {
                                String[] stringArray14 = new String[lIIIlIIlI[0]];
                                stringArray14[v.lIIIlIIlI[1]] = lIIIIllll[lIIIlIIlI[59]];
                                if (v.lllIIIlllIl(NPCs.getNearest((String[])stringArray14).getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lIIIlIIlI[16])) {
                                    g.a(lIIIIllll[lIIIlIIlI[60]], bR);
                                }
                            }
                            if (v.lllIIIlllll(Players.getLocal().getInteracting())) {
                                String[] stringArray15 = new String[lIIIlIIlI[0]];
                                stringArray15[v.lIIIlIIlI[1]] = lIIIIllll[lIIIlIIlI[61]];
                                if (v.lllIIIllIlI(NPCs.getNearest((String[])stringArray15))) {
                                    String[] stringArray16 = new String[lIIIlIIlI[0]];
                                    stringArray16[v.lIIIlIIlI[1]] = lIIIIllll[lIIIlIIlI[62]];
                                    NPCs.getNearest((String[])stringArray16).interact(lIIIIllll[lIIIlIIlI[20]]);
                                    Time.sleepTicks((int)lIIIlIIlI[5]);
                                    0;
                                }
                            }
                        }
                        if (v.lllIIIllllI(e.j(cU), lIIIlIIlI[18])) {
                            if (v.lllIIIllIII(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                            }
                            if (v.lllIIIllIII(l.ad() ? 1 : 0)) {
                                l.ae();
                            }
                            if (v.lllIIIlllll(Players.getLocal().getInteracting())) {
                                String[] stringArray = new String[lIIIlIIlI[0]];
                                stringArray[v.lIIIlIIlI[1]] = lIIIIllll[lIIIlIIlI[63]];
                                if (v.lllIIIllIlI(NPCs.getNearest((String[])stringArray))) {
                                    String[] stringArray17 = new String[lIIIlIIlI[0]];
                                    stringArray17[v.lIIIlIIlI[1]] = lIIIIllll[lIIIlIIlI[64]];
                                    NPCs.getNearest((String[])stringArray17).interact(lIIIIllll[lIIIlIIlI[65]]);
                                    Time.sleepTicks((int)lIIIlIIlI[5]);
                                    0;
                                }
                            }
                        }
                        if (v.lllIIlIIIII(e.j(cU), lIIIlIIlI[25]) && !v.lllIIIllllI(e.j(cU), lIIIlIIlI[26])) break block82;
                        String[] stringArray = new String[lIIIlIIlI[0]];
                        stringArray[v.lIIIlIIlI[1]] = lIIIIllll[lIIIlIIlI[66]];
                        if (v.lllIIIllIlI(NPCs.getNearest((String[])stringArray))) {
                            int[] nArray = new int[lIIIlIIlI[0]];
                            nArray[v.lIIIlIIlI[1]] = lIIIlIIlI[13];
                            Inventory.getFirst((int[])nArray).interact(lIIIIllll[lIIIlIIlI[67]]);
                            Time.sleepTicks((int)lIIIlIIlI[16]);
                            0;
                        }
                        lIIlIIIIllIIIlI = new WorldPoint(lIIIlIIlI[68], lIIIlIIlI[69], lIIIlIIlI[1]);
                        if (v.lllIIIlllIl(Players.getLocal().getWorldLocation().distanceTo(b.J), lIIIlIIlI[70]) && v.lllIIIlllII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIlIIIIllIIIlI), lIIIlIIlI[6])) {
                            AccBuilderEasyClues.c = lIIIIllll[lIIIlIIlI[71]];
                            Movement.walkTo((WorldPoint)lIIlIIIIllIIIlI);
                            0;
                            Time.sleepTicks((int)lIIIlIIlI[0]);
                            0;
                        }
                        if (v.lllIIIlllIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIlIIIIllIIIlI), lIIIlIIlI[6]) && !v.lllIIIlllIl(Players.getLocal().getWorldLocation().distanceTo(cP), lIIIlIIlI[54])) break block83;
                        if (!v.lllIIIlllII(Players.getLocal().getWorldLocation().distanceTo(cL), lIIIlIIlI[16])) break block84;
                        String[] stringArray18 = new String[lIIIlIIlI[0]];
                        stringArray18[v.lIIIlIIlI[1]] = lIIIIllll[lIIIlIIlI[72]];
                        if (!v.lllIIIlllll(NPCs.getNearest((String[])stringArray18)) || !v.lllIIIlllII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIlIIIIllIIIlI), lIIIlIIlI[70])) break block84;
                    }
                    WorldArea lIIlIIIIllIIIIl = new WorldArea(lIIIlIIlI[73], lIIIlIIlI[74], lIIIlIIlI[43], lIIIlIIlI[37], lIIIlIIlI[1]);
                    if (v.lllIIIlIlll(e.j(lIIIlIIlI[75]), lIIIlIIlI[24]) && v.lllIIIlIllI(Equipment.contains(item -> item.getName().contains(lIIIIllll[lIIIlIIlI[89]])) ? 1 : 0)) {
                        Equipment.getFirst(item -> item.getName().contains(lIIIIllll[lIIIlIIlI[88]])).interact(lIIIIllll[lIIIlIIlI[76]]);
                        Time.sleepTicks((int)lIIIlIIlI[12]);
                        0;
                    }
                    if (v.lllIIIlIllI(lIIlIIIIllIIIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldPoint lIIlIIIIllIIIII = new WorldPoint(lIIIlIIlI[77], lIIIlIIlI[78], lIIIlIIlI[1]);
                        Movement.walkTo((WorldPoint)lIIlIIIIllIIIII);
                        0;
                        Time.sleepTicks((int)lIIIlIIlI[0]);
                        0;
                    }
                    if (v.lllIIIllIII(lIIlIIIIllIIIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)cL);
                        0;
                        Time.sleepTicks((int)lIIIlIIlI[0]);
                        0;
                    }
                }
                if (v.lllIIIlllIl(Players.getLocal().getWorldLocation().distanceTo(cL), lIIIlIIlI[16])) {
                    if (v.lllIIIlIlll(cl, lIIIlIIlI[0])) {
                        an.mW += lIIIlIIlI[0];
                        an.o(AccBuilderEasyClues.m);
                        cl += lIIIlIIlI[0];
                        an.mW = lIIIlIIlI[1];
                        cm = lIIIlIIlI[1];
                    }
                    g.a(lIIIIllll[lIIIlIIlI[79]], bR);
                }
            }
            g.a(bR);
        }
    }

    private static boolean lllIIIlIlll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllIIIllIlI(Object object) {
        return object != null;
    }

    @Override
    public int T() {
        try {
            v.aR();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if ((0x27 ^ 8 ^ (0x2A ^ 1)) < ((0x3C ^ 0x1C ^ (0x77 ^ 0)) & (0x5A ^ 0x6A ^ (0xD8 ^ 0xBF) ^ -1))) {
            return (0x53 ^ 0xC ^ (0x7C ^ 0x1B)) & (52 + 136 - 125 + 80 ^ 24 + 49 - 53 + 163 ^ -1);
        }
        return lIIIlIIlI[85];
    }

    @Override
    public boolean S() {
        return lIIIlIIlI[1];
    }

    private static boolean lllIIIlllII(int n2, int n3) {
        return n2 > n3;
    }

    private static String lllIIIIlIII(String lIIlIIIIlIIIlII, String lIIlIIIIlIIIIll) {
        lIIlIIIIlIIIlII = new String(Base64.getDecoder().decode(lIIlIIIIlIIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIlIIIIlIIIlll = new StringBuilder();
        char[] lIIlIIIIlIIIllI = lIIlIIIIlIIIIll.toCharArray();
        int lIIlIIIIlIIIlIl = lIIIlIIlI[1];
        char[] lIIlIIIIIllllll = lIIlIIIIlIIIlII.toCharArray();
        int lIIlIIIIIlllllI = lIIlIIIIIllllll.length;
        int lIIlIIIIIllllIl = lIIIlIIlI[1];
        while (v.lllIIIlIlll(lIIlIIIIIllllIl, lIIlIIIIIlllllI)) {
            char lIIlIIIIlIIlIlI = lIIlIIIIIllllll[lIIlIIIIIllllIl];
            lIIlIIIIlIIIlll.append((char)(lIIlIIIIlIIlIlI ^ lIIlIIIIlIIIllI[lIIlIIIIlIIIlIl % lIIlIIIIlIIIllI.length]));
            0;
            ++lIIlIIIIlIIIlIl;
            ++lIIlIIIIIllllIl;
            0;
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lIIlIIIIlIIIlll);
    }

    private static String lllIIIIIlll(String lIIlIIIIIllIIlI, String lIIlIIIIIllIIIl) {
        try {
            SecretKeySpec lIIlIIIIIllIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIlIIIIIllIIIl.getBytes(StandardCharsets.UTF_8)), lIIIlIIlI[23]), "DES");
            Cipher lIIlIIIIIllIllI = Cipher.getInstance("DES");
            lIIlIIIIIllIllI.init(lIIIlIIlI[5], lIIlIIIIIllIlll);
            return new String(lIIlIIIIIllIllI.doFinal(Base64.getDecoder().decode(lIIlIIIIIllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIlIIIIIllIlIl) {
            lIIlIIIIIllIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIIllIII(int n2) {
        return n2 == 0;
    }

    private static boolean lllIIIlIllI(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean ab() {
        void lIIlIIIIlIlllIl;
        int[] nArray = new int[lIIIlIIlI[12]];
        nArray[v.lIIIlIIlI[1]] = lIIIlIIlI[13];
        nArray[v.lIIIlIIlI[0]] = lIIIlIIlI[7];
        nArray[v.lIIIlIIlI[5]] = lIIIlIIlI[10];
        nArray[v.lIIIlIIlI[11]] = lIIIlIIlI[14];
        nArray[v.lIIIlIIlI[6]] = lIIIlIIlI[15];
        nArray[v.lIIIlIIlI[16]] = lIIIlIIlI[17];
        int[] nArray2 = nArray;
        int lIIlIIIIlIlllII = lIIIlIIlI[1];
        while (v.lllIIIlIlll(lIIlIIIIlIlllII, ((void)lIIlIIIIlIlllIl).length)) {
            int[] nArray3 = new int[lIIIlIIlI[0]];
            nArray3[v.lIIIlIIlI[1]] = lIIlIIIIlIlllIl[lIIlIIIIlIlllII];
            if (v.lllIIIllIII(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return lIIIlIIlI[1];
            }
            ++lIIlIIIIlIlllII;
            0;
            if (((0x7B ^ 0x2C) & ~(0x43 ^ 0x14)) >= ((0xF2 ^ 0xB2) & ~(0xD8 ^ 0x98))) continue;
            return ((0x4C ^ 0xB) & ~(0xD2 ^ 0x95)) != 0;
        }
        return lIIIlIIlI[0];
    }

    static {
        v.lllIIIlIlIl();
        v.lllIIIlIlII();
        cL = new WorldPoint(lIIIlIIlI[91], lIIIlIIlI[92], lIIIlIIlI[1]);
        cM = new WorldPoint(lIIIlIIlI[93], lIIIlIIlI[94], lIIIlIIlI[1]);
        cN = new WorldPoint(lIIIlIIlI[95], lIIIlIIlI[96], lIIIlIIlI[1]);
        cO = new WorldPoint(lIIIlIIlI[97], lIIIlIIlI[98], lIIIlIIlI[1]);
        cP = new WorldPoint(lIIIlIIlI[99], lIIIlIIlI[100], lIIIlIIlI[1]);
        cQ = new WorldPoint(lIIIlIIlI[101], lIIIlIIlI[102], lIIIlIIlI[1]);
        cR = new WorldPoint(lIIIlIIlI[103], lIIIlIIlI[104], lIIIlIIlI[1]);
        cS = new WorldPoint(lIIIlIIlI[91], lIIIlIIlI[105], lIIIlIIlI[1]);
        cT = new WorldPoint(lIIIlIIlI[106], lIIIlIIlI[107], lIIIlIIlI[1]);
        bv = new ArrayList<d>();
        cU = lIIIlIIlI[30];
        cV = new WorldArea(lIIIlIIlI[93], lIIIlIIlI[108], lIIIlIIlI[26], lIIIlIIlI[47], lIIIlIIlI[1]);
        String[] stringArray = new String[lIIIlIIlI[11]];
        stringArray[v.lIIIlIIlI[1]] = lIIIIllll[lIIIlIIlI[109]];
        stringArray[v.lIIIlIIlI[0]] = lIIIIllll[lIIIlIIlI[110]];
        stringArray[v.lIIIlIIlI[5]] = lIIIIllll[lIIIlIIlI[111]];
        bR = stringArray;
    }

    private static boolean lllIIIlllIl(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public boolean V() {
        int n2;
        if (!v.lllIIlIIIIl(Quests.getState((Quest)Quest.FIGHT_ARENA), QuestState.FINISHED) || v.lllIIIllIIl(e.j(cU), lIIIlIIlI[27])) {
            n2 = lIIIlIIlI[0];
            0;
            if (null != null) {
                return ((0x4E ^ 0x4B) & ~(0x66 ^ 0x63)) != 0;
            }
        } else {
            n2 = lIIIlIIlI[1];
        }
        return n2 != 0;
    }

    private static String lllIIIIIllI(String lIIlIIIIIlIIlIl, String lIIlIIIIIlIIllI) {
        try {
            SecretKeySpec lIIlIIIIIlIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIlIIIIIlIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIlIIIIIlIlIIl = Cipher.getInstance("Blowfish");
            lIIlIIIIIlIlIIl.init(lIIIlIIlI[5], lIIlIIIIIlIlIlI);
            return new String(lIIlIIIIIlIlIIl.doFinal(Base64.getDecoder().decode(lIIlIIIIIlIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIlIIIIIlIlIII) {
            lIIlIIIIIlIlIII.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIIllllI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lllIIlIIIIl(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lllIIIllIIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static void lllIIIlIlII() {
        lIIIIllll = new String[lIIIlIIlI[112]];
        v.lIIIIllll[v.lIIIlIIlI[1]] = v."Finished buying items, switching back to quest";
        v.lIIIIllll[v.lIIIlIIlI[0]] = v."Nav to bank";
        v.lIIIIllll[v.lIIIlIIlI[5]] = v."Handling banking";
        v.lIIIIllll[v.lIIIlIIlI[11]] = v."We are missing runes, switching to BUYING";
        v.lIIIIllll[v.lIIIlIIlI[6]] = v."We are missing quest supplies, switching to BUYING";
        v.lIIIIllll[v.lIIIlIIlI[16]] = v."Drink";
        v.lIIIIllll[v.lIIIlIIlI[12]] = v."Drink";
        v.lIIIIllll[v.lIIIlIIlI[22]] = v."Nav to start";
        v.lIIIIllll[v.lIIIlIIlI[23]] = v."Lady Servil";
        v.lIIIIllll[v.lIIIlIIlI[24]] = v."Nav to armour";
        v.lIIIIllll[v.lIIIlIIlI[18]] = v."Getting armour";
        v.lIIIIllll[v.lIIIlIIlI[25]] = v."Door";
        v.lIIIIllll[v.lIIIlIIlI[26]] = v."Open";
        v.lIIIIllll[v.lIIIlIIlI[3]] = v."Chest";
        v.lIIIIllll[v.lIIIlIIlI[27]] = v."Door";
        v.lIIIIllll[v.lIIIlIIlI[28]] = v."Open";
        v.lIIIIllll[v.lIIIlIIlI[29]] = v."Chest";
        v.lIIIIllll[v.lIIIlIIlI[30]] = v."Chest";
        v.lIIIIllll[v.lIIIlIIlI[31]] = v."Open";
        v.lIIIIllll[v.lIIIlIIlI[32]] = v."Chest";
        v.lIIIIllll[v.lIIIlIIlI[33]] = v."Open";
        v.lIIIIllll[v.lIIIlIIlI[34]] = v."Chest";
        v.lIIIIllll[v.lIIIlIIlI[35]] = v."Search";
        v.lIIIIllll[v.lIIIlIIlI[36]] = v."Chest";
        v.lIIIIllll[v.lIIIlIIlI[37]] = v."Search";
        v.lIIIIllll[v.lIIIlIIlI[21]] = v."Wear";
        v.lIIIIllll[v.lIIIlIIlI[40]] = v."Wear";
        v.lIIIIllll[v.lIIIlIIlI[41]] = v."Nav to jail";
        v.lIIIIllll[v.lIIIlIIlI[42]] = v."Door";
        v.lIIIIllll[v.lIIIlIIlI[43]] = v."Open";
        v.lIIIIllll[v.lIIIlIIlI[44]] = v."Nav to guard";
        v.lIIIIllll[v.lIIIlIIlI[45]] = v."Head Guard";
        v.lIIIIllll[v.lIIIlIIlI[46]] = v."Khali brew";
        v.lIIIIllll[v.lIIIlIIlI[47]] = v."Nav to brew";
        v.lIIIIllll[v.lIIIlIIlI[48]] = v."Khazard Barman";
        v.lIIIIllll[v.lIIIlIIlI[49]] = v."Khali brew";
        v.lIIIIllll[v.lIIIlIIlI[50]] = v."Nav to guard";
        v.lIIIIllll[v.lIIIlIIlI[51]] = v."Nav to guard";
        v.lIIIIllll[v.lIIIlIIlI[52]] = v."Head Guard";
        v.lIIIIllll[v.lIIIlIIlI[53]] = v."Nav to  sammy";
        v.lIIIIllll[v.lIIIlIIlI[54]] = v."Khazard cell keys";
        v.lIIIIllll[v.lIIIlIIlI[55]] = v."Khazard Ogre";
        v.lIIIIllll[v.lIIIlIIlI[56]] = v."Khazard Ogre";
        v.lIIIIllll[v.lIIIlIIlI[57]] = v."Attack";
        v.lIIIIllll[v.lIIIlIIlI[58]] = v."Sammy Servil";
        v.lIIIIllll[v.lIIIlIIlI[2]] = v."Hengrad";
        v.lIIIIllll[v.lIIIlIIlI[59]] = v."Hengrad";
        v.lIIIIllll[v.lIIIlIIlI[60]] = v."Hengrad";
        v.lIIIIllll[v.lIIIlIIlI[61]] = v."Khazard Scorpion";
        v.lIIIIllll[v.lIIIlIIlI[62]] = v."Khazard Scorpion";
        v.lIIIIllll[v.lIIIlIIlI[20]] = v."Attack";
        v.lIIIIllll[v.lIIIlIIlI[63]] = v."Bouncer";
        v.lIIIIllll[v.lIIIlIIlI[64]] = v."Bouncer";
        v.lIIIIllll[v.lIIIlIIlI[65]] = v."Attack";
        v.lIIIIllll[v.lIIIlIIlI[66]] = v."General Khazard";
        v.lIIIIllll[v.lIIIlIIlI[67]] = v."Break";
        v.lIIIIllll[v.lIIIlIIlI[71]] = v."Nav to start";
        v.lIIIIllll[v.lIIIlIIlI[72]] = v."General Khazard";
        v.lIIIIllll[v.lIIIlIIlI[76]] = v."Castle Wars";
        v.lIIIIllll[v.lIIIlIIlI[79]] = v."Lady Servil";
        v.lIIIIllll[v.lIIIlIIlI[86]] = v."Fight Arena";
        v.lIIIIllll[v.lIIIlIIlI[87]] = v."ring of wealth (";
        v.lIIIIllll[v.lIIIlIIlI[88]] = v."dueling";
        v.lIIIIllll[v.lIIIlIIlI[89]] = v."dueling";
        v.lIIIIllll[v.lIIIlIIlI[90]] = v."Prison Gate";
        v.lIIIIllll[v.lIIIlIIlI[109]] = v."Can I help you?";
        v.lIIIIllll[v.lIIIlIIlI[110]] = v."I'd like a Khali Brew please.";
        v.lIIIIllll[v.lIIIlIIlI[111]] = v."Yes.";
    }
}

