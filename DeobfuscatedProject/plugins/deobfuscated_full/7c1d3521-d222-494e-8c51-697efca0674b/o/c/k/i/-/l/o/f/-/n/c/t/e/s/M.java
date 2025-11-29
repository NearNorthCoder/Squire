/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 *  net.runelite.api.Skill
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
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.Walker
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
import net.runelite.api.Prayer;
import net.runelite.api.Skill;
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
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.I;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.O;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.a;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.aD;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.aN;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.b;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.d;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.e;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.f;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.g;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.j;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.m;

public class M
implements ac {
    private static /* synthetic */ String[] llIIIlllII;
    public static final /* synthetic */ WorldPoint gU;
    public static final /* synthetic */ WorldPoint gV;
    public static final /* synthetic */ WorldPoint gQ;
    static /* synthetic */ WorldArea gZ;
    public static final /* synthetic */ WorldPoint gP;
    public static final /* synthetic */ WorldPoint gN;
    static /* synthetic */ WorldArea gY;
    static /* synthetic */ int gX;
    public static final /* synthetic */ WorldPoint gO;
    public static final /* synthetic */ WorldPoint gW;
    public static /* synthetic */ List<d> bv;
    public static final /* synthetic */ WorldPoint gR;
    static /* synthetic */ boolean dj;
    public static /* synthetic */ String[] cE;
    private static /* synthetic */ int[] llIIIllllI;
    public static final /* synthetic */ WorldPoint gT;
    public static final /* synthetic */ WorldPoint gS;
    public static /* synthetic */ boolean bt;
    static /* synthetic */ int di;

    private static boolean lIlIIllllIlll(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (M.lIlIIllllIlll(e.j(gX), llIIIllllI[25])) {
            bl = llIIIllllI[0];
            0;
            if (2 == 0) {
                return false;
            }
        } else {
            bl = llIIIllllI[1];
        }
        return bl;
    }

    private static void Q() {
        block33: {
            d var20;
            block32: {
                block31: {
                    block30: {
                        block29: {
                            block28: {
                                block27: {
                                    block26: {
                                        block25: {
                                            block24: {
                                                Object var30;
                                                block23: {
                                                    block22: {
                                                        int[] nArray = new int[llIIIllllI[0]];
                                                        nArray[M.llIIIllllI[1]] = llIIIllllI[12];
                                                        if (!M.lIlIIllllIlII(Bank.contains((int[])nArray) ? 1 : 0)) break block22;
                                                        int[] nArray2 = new int[llIIIllllI[0]];
                                                        nArray2[M.llIIIllllI[1]] = llIIIllllI[12];
                                                        if (!M.lIlIIllllIlII(Bank.contains((int[])nArray2) ? 1 : 0)) break block23;
                                                        int[] nArray3 = new int[llIIIllllI[0]];
                                                        nArray3[M.llIIIllllI[1]] = llIIIllllI[12];
                                                        if (!M.lIlIIllllIlIl(Bank.getFirst((int[])nArray3).getQuantity(), llIIIllllI[13])) break block23;
                                                    }
                                                    var30 = new d(llIIIllllI[12], llIIIllllI[13], llIIIllllI[103]);
                                                    bv.add((d)var30);
                                                    0;
                                                }
                                                if (M.lIlIIllllIllI(Bank.contains((Predicate)(var30 = item -> item.getName().toLowerCase().contains(llIIIlllII[llIIIllllI[110]]))) ? 1 : 0)) {
                                                    var20 = new d(llIIIllllI[104], llIIIllllI[16], llIIIllllI[105]);
                                                    bv.add(var20);
                                                    0;
                                                }
                                                int[] nArray = new int[llIIIllllI[0]];
                                                nArray[M.llIIIllllI[1]] = llIIIllllI[15];
                                                if (M.lIlIIllllIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
                                                    int[] nArray4 = new int[llIIIllllI[0]];
                                                    nArray4[M.llIIIllllI[1]] = llIIIllllI[15];
                                                    if (M.lIlIIllllIlIl(Bank.getFirst((int[])nArray4).getQuantity(), llIIIllllI[7])) {
                                                        int[] nArray5 = new int[llIIIllllI[0]];
                                                        nArray5[M.llIIIllllI[1]] = llIIIllllI[15];
                                                        var20 = new d(llIIIllllI[15], llIIIllllI[7] - Bank.getFirst((int[])nArray5).getQuantity(), llIIIllllI[106]);
                                                        bv.add(var20);
                                                        0;
                                                    }
                                                }
                                                int[] nArray6 = new int[llIIIllllI[0]];
                                                nArray6[M.llIIIllllI[1]] = llIIIllllI[10];
                                                if (!M.lIlIIllllIlII(Bank.contains((int[])nArray6) ? 1 : 0)) break block24;
                                                int[] nArray7 = new int[llIIIllllI[0]];
                                                nArray7[M.llIIIllllI[1]] = llIIIllllI[10];
                                                if (!M.lIlIIllllIlII(Bank.contains((int[])nArray7) ? 1 : 0)) break block25;
                                                int[] nArray8 = new int[llIIIllllI[0]];
                                                nArray8[M.llIIIllllI[1]] = llIIIllllI[10];
                                                if (!M.lIlIIllllIlIl(Bank.getFirst((int[])nArray8).getQuantity(), llIIIllllI[9])) break block25;
                                            }
                                            var20 = new d(llIIIllllI[10], llIIIllllI[9], llIIIllllI[21]);
                                            bv.add(var20);
                                            0;
                                        }
                                        int[] nArray = new int[llIIIllllI[0]];
                                        nArray[M.llIIIllllI[1]] = llIIIllllI[8];
                                        if (!M.lIlIIllllIlII(Bank.contains((int[])nArray) ? 1 : 0)) break block26;
                                        int[] nArray9 = new int[llIIIllllI[0]];
                                        nArray9[M.llIIIllllI[1]] = llIIIllllI[8];
                                        if (!M.lIlIIllllIlII(Bank.contains((int[])nArray9) ? 1 : 0)) break block27;
                                        int[] nArray10 = new int[llIIIllllI[0]];
                                        nArray10[M.llIIIllllI[1]] = llIIIllllI[8];
                                        if (!M.lIlIIllllIlIl(Bank.getFirst((int[])nArray10).getQuantity(), llIIIllllI[9])) break block27;
                                    }
                                    var20 = new d(llIIIllllI[8], llIIIllllI[9], llIIIllllI[21]);
                                    bv.add(var20);
                                    0;
                                }
                                int[] nArray = new int[llIIIllllI[0]];
                                nArray[M.llIIIllllI[1]] = llIIIllllI[11];
                                if (!M.lIlIIllllIlII(Bank.contains((int[])nArray) ? 1 : 0)) break block28;
                                int[] nArray11 = new int[llIIIllllI[0]];
                                nArray11[M.llIIIllllI[1]] = llIIIllllI[11];
                                if (!M.lIlIIllllIlII(Bank.contains((int[])nArray11) ? 1 : 0)) break block29;
                                int[] nArray12 = new int[llIIIllllI[0]];
                                nArray12[M.llIIIllllI[1]] = llIIIllllI[11];
                                if (!M.lIlIIllllIlIl(Bank.getFirst((int[])nArray12).getQuantity(), llIIIllllI[9])) break block29;
                            }
                            var20 = new d(llIIIllllI[11], llIIIllllI[9], llIIIllllI[21]);
                            bv.add(var20);
                            0;
                        }
                        int[] nArray = new int[llIIIllllI[0]];
                        nArray[M.llIIIllllI[1]] = llIIIllllI[15];
                        if (M.lIlIIllllIllI(Bank.contains((int[])nArray) ? 1 : 0)) {
                            var20 = new d(llIIIllllI[15], llIIIllllI[7], llIIIllllI[106]);
                            bv.add(var20);
                            0;
                        }
                        int[] nArray13 = new int[llIIIllllI[0]];
                        nArray13[M.llIIIllllI[1]] = llIIIllllI[18];
                        if (!M.lIlIIllllIlII(Bank.contains((int[])nArray13) ? 1 : 0)) break block30;
                        int[] nArray14 = new int[llIIIllllI[0]];
                        nArray14[M.llIIIllllI[1]] = llIIIllllI[18];
                        if (!M.lIlIIllllIlIl(Bank.getFirst((int[])nArray14).getQuantity(), llIIIllllI[7])) break block31;
                    }
                    var20 = new d(llIIIllllI[18], llIIIllllI[7], j.cf);
                    bv.add(var20);
                    0;
                }
                int[] nArray = new int[llIIIllllI[0]];
                nArray[M.llIIIllllI[1]] = llIIIllllI[14];
                if (!M.lIlIIllllIlII(Bank.contains((int[])nArray) ? 1 : 0)) break block32;
                int[] nArray15 = new int[llIIIllllI[0]];
                nArray15[M.llIIIllllI[1]] = llIIIllllI[14];
                if (!M.lIlIIllllIlII(Bank.contains((int[])nArray15) ? 1 : 0)) break block33;
                int[] nArray16 = new int[llIIIllllI[0]];
                nArray16[M.llIIIllllI[1]] = llIIIllllI[14];
                if (!M.lIlIIllllIlIl(Bank.getFirst((int[])nArray16).getQuantity(), llIIIllllI[30])) break block33;
            }
            var20 = new d(llIIIllllI[14], llIIIllllI[66], llIIIllllI[107]);
            bv.add(var20);
            0;
        }
    }

    private static boolean lIlIIlllllIII(Object object) {
        return object != null;
    }

    private static boolean lIlIIlllllIIl(int n2) {
        return n2 > 0;
    }

    @Override
    public boolean ae() {
        return llIIIllllI[1];
    }

    private static boolean lIlIIllllllII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIIllllIlII(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean an() {
        void var24;
        int[] nArray = new int[llIIIllllI[6]];
        nArray[M.llIIIllllI[1]] = llIIIllllI[14];
        nArray[M.llIIIllllI[0]] = llIIIllllI[12];
        nArray[M.llIIIllllI[4]] = llIIIllllI[15];
        int[] nArray2 = nArray;
        int var27 = llIIIllllI[1];
        while (M.lIlIIllllIlIl(var27, ((void)var24).length)) {
            int[] nArray3 = new int[llIIIllllI[0]];
            nArray3[M.llIIIllllI[1]] = var24[var27];
            if (M.lIlIIllllIllI(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return llIIIllllI[1];
            }
            ++var27;
            0;
            if (3 >= 2) continue;
            return false;
        }
        return llIIIllllI[0];
    }

    private static void lIlIIllllIIlI() {
        llIIIllllI = new int[141];
        M.llIIIllllI[0] = 1;
        M.llIIIllllI[1] = (0xEC ^ 0x8A ^ (0x59 ^ 0x17)) & (0x44 ^ 0x17 ^ (0xF5 ^ 0x8E) ^ -1);
        M.llIIIllllI[2] = 0x8F ^ 0x82;
        M.llIIIllllI[3] = 0x1C ^ 0x31;
        M.llIIIllllI[4] = 2;
        M.llIIIllllI[5] = -(0xFFFFAE2B & 0x7DF7) & (0xFFFFFFFA & 0x3FAF);
        M.llIIIllllI[6] = 3;
        M.llIIIllllI[7] = 0x1D ^ 0x19;
        M.llIIIllllI[8] = 0xFFFFC72F & 0x3AFE;
        M.llIIIllllI[9] = 0xFFFFCFEC & 0x33FB;
        M.llIIIllllI[10] = -(0xFFFFFFD7 & 0x5B9) & (0xFFFFFFBF & 0x7FD);
        M.llIIIllllI[11] = -(0xFFFFDE97 & 0x79FE) & (0xFFFFFABF & 0x5FFF);
        M.llIIIllllI[12] = 0xFFFFCDFF & 0x37E7;
        M.llIIIllllI[13] = 81 + 94 - 131 + 128 ^ 5 + 120 - 55 + 100;
        M.llIIIllllI[14] = 0xFFFFDFE7 & 0x3F5F;
        M.llIIIllllI[15] = 0xFFFFAF86 & 0x59FB;
        M.llIIIllllI[16] = 126 + 46 - 46 + 2 ^ 44 + 31 - -34 + 24;
        M.llIIIllllI[17] = 0x8A ^ 0x8D;
        M.llIIIllllI[18] = 0xFFFFBB5B & 0x75F5;
        M.llIIIllllI[19] = -(0xFFFFFEA9 & 0x6757) & (0xFFFFF7FF & 0x6F7B);
        M.llIIIllllI[20] = 0x4E ^ 0xF ^ (0x5A ^ 0x13);
        M.llIIIllllI[21] = 110 + 79 - 76 + 52 ^ 48 + 95 - 64 + 96;
        M.llIIIllllI[22] = -(0xFFFFAF4F & 0x5AB9) & (0xFFFFCFFD & 0x3BFE);
        M.llIIIllllI[23] = -(0xFFFFFD63 & 0x229F) & (0xFFFFF7DF & 0x2DFE);
        M.llIIIllllI[24] = 83 + 71 - 35 + 30 ^ 162 + 166 - 191 + 30;
        M.llIIIllllI[25] = 0x18 ^ 0x12 ^ 3;
        M.llIIIllllI[26] = -(0xFFFFEDC7 & 0x3EBD) & (0xFFFFBFFF & 0x6EDC);
        M.llIIIllllI[27] = 2 ^ (0x2C ^ 0x25);
        M.llIIIllllI[28] = 0x96 ^ 0x9A;
        M.llIIIllllI[29] = 0xD6 ^ 0xB6 ^ (0xC2 ^ 0xAC);
        M.llIIIllllI[30] = 102 + 110 - 164 + 103 ^ 75 + 128 - 81 + 30;
        M.llIIIllllI[31] = 0x42 ^ 0x52;
        M.llIIIllllI[32] = 0x9E ^ 0x8F;
        M.llIIIllllI[33] = 1 ^ 0x13;
        M.llIIIllllI[34] = 0xFFFF8777 & 0x7ADF;
        M.llIIIllllI[35] = 0xA1 ^ 0xB2;
        M.llIIIllllI[36] = 108 + 36 - 44 + 39 ^ 113 + 30 - 110 + 126;
        M.llIIIllllI[37] = -(0xFFFFBEBB & 0x7D65) & (0xFFFFBEF9 & 0x7F7F);
        M.llIIIllllI[38] = 7 ^ 0x12;
        M.llIIIllllI[39] = 0x1F ^ 0x2A ^ (0x20 ^ 3);
        M.llIIIllllI[40] = 0x57 ^ 0x12 ^ (0x34 ^ 0x66);
        M.llIIIllllI[41] = 0x43 ^ 0x4E ^ (0x74 ^ 0x61);
        M.llIIIllllI[42] = 0x65 ^ 0x4A ^ (0x39 ^ 0xF);
        M.llIIIllllI[43] = 0x44 ^ 0x5E;
        M.llIIIllllI[44] = -(0xFFFFBF67 & 0x7D99) & (0xFFFFFFDA & 0x3F7F);
        M.llIIIllllI[45] = 20 + 0 - -10 + 156 ^ 73 + 63 - -13 + 12;
        M.llIIIllllI[46] = 0x6F ^ 0x73;
        M.llIIIllllI[47] = 0x30 ^ 0x2D;
        M.llIIIllllI[48] = 0x8B ^ 0x95;
        M.llIIIllllI[49] = -(0xFFFFE9BF & 0x5667) & (0xFFFFF9EF & 0x4FFF);
        M.llIIIllllI[50] = 0xFFFFFCBF & 0xFF6;
        M.llIIIllllI[51] = 0xFFFF9FD4 & 0x69EF;
        M.llIIIllllI[52] = 0xFFFF8CF7 & 0x7FBB;
        M.llIIIllllI[53] = -(0xFFFFEDBD & 0x7673) & (0xFFFFEFF6 & 0x7DFF);
        M.llIIIllllI[54] = 0xFFFFCDF7 & 0x3EBD;
        M.llIIIllllI[55] = 0xB7 ^ 0xA8;
        M.llIIIllllI[56] = 0x6F ^ 0x64 ^ (0x67 ^ 0x4C);
        M.llIIIllllI[57] = 11 + 121 - 131 + 148 ^ 46 + 126 - 18 + 26;
        M.llIIIllllI[58] = 0xFFFFB9CB & 0x4FFF;
        M.llIIIllllI[59] = -(0xFFFFBF7B & 0x5185) & (0xFFFFDFF9 & 0x3DBF);
        M.llIIIllllI[60] = 0x71 ^ 0x53;
        M.llIIIllllI[61] = 0x8C ^ 0xAF;
        M.llIIIllllI[62] = 0x6B ^ 0x79 ^ (0x9C ^ 0xAA);
        M.llIIIllllI[63] = 15 + 92 - 42 + 95 ^ 60 + 74 - 129 + 128;
        M.llIIIllllI[64] = 0x63 ^ 0x17 ^ (0x46 ^ 0x14);
        M.llIIIllllI[65] = 0x92 ^ 0xB5;
        M.llIIIllllI[66] = 0x97 ^ 0xAB ^ (0x5A ^ 0x4E);
        M.llIIIllllI[67] = 0x4B ^ 0x62;
        M.llIIIllllI[68] = 0xA ^ 0x20;
        M.llIIIllllI[69] = 0x40 ^ 0x6B;
        M.llIIIllllI[70] = 0x71 ^ 0x5D;
        M.llIIIllllI[71] = 171 + 171 - 178 + 9 ^ 78 + 106 - 124 + 71;
        M.llIIIllllI[72] = 23 + 60 - 5 + 66 ^ 105 + 17 - 57 + 126;
        M.llIIIllllI[73] = 0x31 ^ 0x48 ^ (0x5E ^ 0x17);
        M.llIIIllllI[74] = 188 + 116 - 101 + 42 ^ 44 + 29 - -90 + 33;
        M.llIIIllllI[75] = 2 ^ (0x56 ^ 0x67);
        M.llIIIllllI[76] = 130 + 107 - 99 + 41 ^ 48 + 103 - 54 + 38;
        M.llIIIllllI[77] = 0x26 ^ 0x13;
        M.llIIIllllI[78] = 0x33 ^ 0x35 ^ (0x63 ^ 0x53);
        M.llIIIllllI[79] = 0xD7 ^ 0x9C ^ (0xFE ^ 0x82);
        M.llIIIllllI[80] = 0x3E ^ 6;
        M.llIIIllllI[81] = 0x29 ^ 0x57 ^ (0xFB ^ 0xBC);
        M.llIIIllllI[82] = 0x5A ^ 0x60;
        M.llIIIllllI[83] = 64 + 120 - 135 + 135 ^ 44 + 58 - -12 + 17;
        M.llIIIllllI[84] = 125 + 50 - 105 + 111 ^ 103 + 87 - 66 + 13;
        M.llIIIllllI[85] = 0x39 ^ 4;
        M.llIIIllllI[86] = 5 ^ 0x3B;
        M.llIIIllllI[87] = 112 + 164 - 59 + 31 ^ 197 + 115 - 176 + 63;
        M.llIIIllllI[88] = 0x7E ^ 0x3E;
        M.llIIIllllI[89] = 0xE2 ^ 0xA3;
        M.llIIIllllI[90] = 0xFFFFBDFB & 0x4B66;
        M.llIIIllllI[91] = -(0xFFFFFCDE & 0x7331) & (0xFFFFFBFF & Short.MAX_VALUE);
        M.llIIIllllI[92] = 7 + 49 - -40 + 134;
        M.llIIIllllI[93] = 77 + 41 - 81 + 99 + (0x95 ^ 0x90) - (0xA0 ^ 0xB2) + (0x31 ^ 0x2E);
        M.llIIIllllI[94] = 0xFFFF8FFF & 0x79E3;
        M.llIIIllllI[95] = 0xFFFF8D77 & 0x7EDB;
        M.llIIIllllI[96] = 0xFFFFF9FF & 0xFD7;
        M.llIIIllllI[97] = -(0xFFFFB3AF & 0x6FFE) & (0xFFFFFFFF & 0x2FFF);
        M.llIIIllllI[98] = -(0xCC ^ 0xC1) & (0xFFFFBDFE & 0x4BDF);
        M.llIIIllllI[99] = 0xFFFFEE74 & 0x1DDF;
        M.llIIIllllI[100] = 0x4B ^ 9;
        M.llIIIllllI[101] = 0x2B ^ 0x69 ^ 1;
        M.llIIIllllI[102] = 4 ^ 0x6C ^ (0xA2 ^ 0x8E);
        M.llIIIllllI[103] = (3 ^ 0x30) + (5 + 109 - 18 + 58) - (0x7D ^ 0x75) + 3;
        M.llIIIllllI[104] = 0xFFFFEEDD & 0x3FEE;
        M.llIIIllllI[105] = 0xFFFFF3EF & 0x6DB8;
        M.llIIIllllI[106] = -(0xFFFF9FF7 & 0x654F) & (0xFFFFBFDF & 0x7FFE);
        M.llIIIllllI[107] = 0xFFFFEFE5 & 0x139E;
        M.llIIIllllI[108] = 0xA4 ^ 0xC0;
        M.llIIIllllI[109] = 0xCE ^ 0x8B;
        M.llIIIllllI[110] = 0x2C ^ 0x6A;
        M.llIIIllllI[111] = 0x1A ^ 0x5D;
        M.llIIIllllI[112] = -(0xFFFFFB93 & 0x747D) & (0xFFFFFFFB & 0x79FF);
        M.llIIIllllI[113] = 0xFFFFBC5F & 0x4FFF;
        M.llIIIllllI[114] = 0xFFFF89DC & 0x7FFB;
        M.llIIIllllI[115] = -(0xFFFFE7DB & 0x7B75) & (0xFFFFFFDF & 0x6FF7);
        M.llIIIllllI[116] = -(0xFFFFCE6F & 0x71B3) & (0xFFFFE9FE & 0x5FFF);
        M.llIIIllllI[117] = 0xFFFF9EB8 & 0x6DFF;
        M.llIIIllllI[118] = -(0xFFFFBA36 & 0x67EB) & (0xFFFFBBFF & 0x6FFF);
        M.llIIIllllI[119] = 0xFFFFACF6 & 0x5FBD;
        M.llIIIllllI[120] = -(0x86 ^ 0xB7) & (0xFFFF9BF7 & 0x6DFB);
        M.llIIIllllI[121] = -(0xFFFFB57B & 0x6BC5) & (0xFFFFADFE & 0x7FFD);
        M.llIIIllllI[122] = -(0xFFFF86A2 & 0x7F7F) & (0xFFFF8FEF & 0x7FF1);
        M.llIIIllllI[123] = 0xFFFFDCA7 & 0x2FFC;
        M.llIIIllllI[124] = -(0xFFFFF536 & 0x7EFB) & (0xFFFFFFFF & 0x7DFF);
        M.llIIIllllI[125] = -(0xFFFFEDFF & 0x5257) & (0xFFFFFFDF & 0x4CFF);
        M.llIIIllllI[126] = 0xFFFFFDB3 & 0xEFE;
        M.llIIIllllI[127] = -(0xFFFFFE03 & 0x35FD) & (0xFFFFBFCF & 0x7DF7);
        M.llIIIllllI[128] = 0xFFFFE9DF & 0x1FBA;
        M.llIIIllllI[129] = -(0xFFFFD106 & Short.MAX_VALUE) & (0xFFFFDFEF & 0x7DF7);
        M.llIIIllllI[130] = 0x6E ^ 0x26;
        M.llIIIllllI[131] = 0x5E ^ 0x17;
        M.llIIIllllI[132] = 0xF0 ^ 0xB5 ^ (0xA5 ^ 0xAA);
        M.llIIIllllI[133] = 0x88 ^ 0xC3;
        M.llIIIllllI[134] = 0xAC ^ 0xA3 ^ (0x54 ^ 0x17);
        M.llIIIllllI[135] = 187 + 8 - 73 + 130 ^ 137 + 143 - 169 + 66;
        M.llIIIllllI[136] = 9 ^ 0x66;
        M.llIIIllllI[137] = -(0xFFFFBCD9 & 0x7727) & (0xFFFFFFEA & 0x3DFF);
        M.llIIIllllI[138] = -(0xFFFFF6FF & 0x7F23) & (0xFFFFFFFB & 0x7FF7);
        M.llIIIllllI[139] = -(0xFFFFE685 & 0x5BFF) & (0xFFFFDFDD & 0x6EFF);
        M.llIIIllllI[140] = 0xD9 ^ 0x93 ^ (0x74 ^ 0x70);
    }

    private static boolean lIlIIlllllllI(int n2, int n3) {
        return n2 <= n3;
    }

    static {
        M.lIlIIllllIIlI();
        M.lIlIIllllIIIl();
        gN = new WorldPoint(llIIIllllI[112], llIIIllllI[113], llIIIllllI[1]);
        gO = new WorldPoint(llIIIllllI[114], llIIIllllI[115], llIIIllllI[1]);
        gP = new WorldPoint(llIIIllllI[116], llIIIllllI[117], llIIIllllI[1]);
        gQ = new WorldPoint(llIIIllllI[118], llIIIllllI[119], llIIIllllI[1]);
        gR = new WorldPoint(llIIIllllI[120], llIIIllllI[121], llIIIllllI[1]);
        gS = new WorldPoint(llIIIllllI[122], llIIIllllI[123], llIIIllllI[1]);
        gT = new WorldPoint(llIIIllllI[124], llIIIllllI[125], llIIIllllI[1]);
        gU = new WorldPoint(llIIIllllI[124], llIIIllllI[126], llIIIllllI[1]);
        gV = new WorldPoint(llIIIllllI[127], llIIIllllI[54], llIIIllllI[1]);
        gW = new WorldPoint(llIIIllllI[128], llIIIllllI[129], llIIIllllI[1]);
        bv = new ArrayList<d>();
        String[] stringArray = new String[llIIIllllI[13]];
        stringArray[M.llIIIllllI[1]] = llIIIlllII[llIIIllllI[130]];
        stringArray[M.llIIIllllI[0]] = llIIIlllII[llIIIllllI[131]];
        stringArray[M.llIIIllllI[4]] = llIIIlllII[llIIIllllI[132]];
        stringArray[M.llIIIllllI[6]] = llIIIlllII[llIIIllllI[133]];
        stringArray[M.llIIIllllI[7]] = llIIIlllII[llIIIllllI[134]];
        stringArray[M.llIIIllllI[16]] = llIIIlllII[llIIIllllI[135]];
        cE = stringArray;
        gX = llIIIllllI[136];
        gY = new WorldArea(llIIIllllI[137], llIIIllllI[113], llIIIllllI[21], llIIIllllI[13], llIIIllllI[1]);
        gZ = new WorldArea(llIIIllllI[138], llIIIllllI[139], llIIIllllI[48], llIIIllllI[30], llIIIllllI[1]);
    }

    private static boolean lIlIIllllIllI(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIIlllllIll(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIlIIlllllIlI(int n2) {
        return n2 < 0;
    }

    @Override
    public int af() {
        try {
            M.cT();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if ((0x48 ^ 0x6D ^ (0xA4 ^ 0x84)) == 0) {
            return (34 + 27 - 46 + 212 ^ 103 + 100 - 18 + 9) & (0x48 ^ 0x76 ^ (0xDA ^ 0xC5) ^ -1);
        }
        return llIIIllllI[108];
    }

    private static String lIlIIlllIllIl(String var11, String var29) {
        try {
            SecretKeySpec var28 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var29.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var22 = Cipher.getInstance("Blowfish");
            var22.init(llIIIllllI[4], var28);
            return new String(var22.doFinal(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    private static int lIlIIllllIIll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean lIlIIllllIlIl(int n2, int n3) {
        return n2 < n3;
    }

    public static void cT() {
        block83: {
            Object var21;
            BankLocation llllllllllllllllllIlIlIlIllllIll2;
            block84: {
                block89: {
                    block86: {
                        block88: {
                            block87: {
                                block85: {
                                    if (M.lIlIIllllIlII(bt ? 1 : 0)) {
                                        b.a(bv);
                                        if (M.lIlIIllllIlIl(bv.size(), llIIIllllI[0])) {
                                            System.out.println(llIIIlllII[llIIIllllI[1]]);
                                            bt = llIIIllllI[1];
                                        }
                                    }
                                    if (!M.lIlIIllllIllI(bt ? 1 : 0)) break block83;
                                    if (M.lIlIIllllIlIl(Skills.getLevel((Skill)Skill.MAGIC), llIIIllllI[2])) {
                                        m.ak();
                                    }
                                    if (M.lIlIIllllIlll(Skills.getLevel((Skill)Skill.MAGIC), llIIIllllI[2]) && M.lIlIIllllIlIl(Skills.getLevel((Skill)Skill.PRAYER), llIIIllllI[3])) {
                                        aD.fY();
                                    }
                                    if (M.lIlIIllllIlll(Skills.getLevel((Skill)Skill.PRAYER), llIIIllllI[3]) && M.lIlIIllllIlII(Inventory.contains((int[])f.bf) ? 1 : 0)) {
                                        Inventory.getFirst((int[])f.bf).interact(llIIIlllII[llIIIllllI[0]]);
                                    }
                                    if (!M.lIlIIllllIllI(M.an() ? 1 : 0) || !M.lIlIIllllIlIl(e.j(gX), llIIIllllI[0]) || !M.lIlIIllllIlll(Skills.getLevel((Skill)Skill.MAGIC), llIIIllllI[2]) || !M.lIlIIllllIlll(Skills.getLevel((Skill)Skill.PRAYER), llIIIllllI[3])) break block84;
                                    llllllllllllllllllIlIlIlIllllIll2 = BankLocation.getNearest();
                                    if (M.lIlIIlllllIII(llllllllllllllllllIlIlIlIllllIll2) && M.lIlIIllllIllI(llllllllllllllllllIlIlIlIllllIll2.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        AccBuilderSotf.c = llIIIlllII[llIIIllllI[4]];
                                        a.a(llllllllllllllllllIlIlIlIllllIll2);
                                    }
                                    if (!M.lIlIIlllllIII(llllllllllllllllllIlIlIlIllllIll2) || !M.lIlIIllllIlII(llllllllllllllllllIlIlIlIllllIll2.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block84;
                                    if (M.lIlIIllllIllI(Bank.isOpen() ? 1 : 0)) {
                                        a.a();
                                        Time.sleepUntil(() -> Bank.isOpen(), (int)llIIIllllI[5]);
                                        0;
                                    }
                                    if (!M.lIlIIllllIlII(Bank.isOpen() ? 1 : 0)) break block84;
                                    AccBuilderSotf.c = llIIIlllII[llIIIllllI[6]];
                                    if (M.lIlIIlllllIIl(Inventory.getAll().size())) {
                                        Bank.depositInventory();
                                        Time.sleepTicks((int)llIIIllllI[7]);
                                        0;
                                    }
                                    if (M.lIlIIlllllIIl(Equipment.getAll().size())) {
                                        Bank.depositEquipment();
                                        Time.sleepTicks((int)llIIIllllI[4]);
                                        0;
                                    }
                                    int[] nArray = new int[llIIIllllI[0]];
                                    nArray[M.llIIIllllI[1]] = llIIIllllI[8];
                                    if (!M.lIlIIllllIlII(Bank.contains((int[])nArray) ? 1 : 0)) break block85;
                                    int[] nArray2 = new int[llIIIllllI[0]];
                                    nArray2[M.llIIIllllI[1]] = llIIIllllI[8];
                                    if (!M.lIlIIllllIlll(Bank.getFirst((int[])nArray2).getQuantity(), llIIIllllI[9])) break block86;
                                }
                                int[] nArray = new int[llIIIllllI[0]];
                                nArray[M.llIIIllllI[1]] = llIIIllllI[10];
                                if (!M.lIlIIllllIlII(Bank.contains((int[])nArray) ? 1 : 0)) break block87;
                                int[] nArray3 = new int[llIIIllllI[0]];
                                nArray3[M.llIIIllllI[1]] = llIIIllllI[10];
                                if (!M.lIlIIllllIlll(Bank.getFirst((int[])nArray3).getQuantity(), llIIIllllI[9])) break block86;
                            }
                            int[] nArray = new int[llIIIllllI[0]];
                            nArray[M.llIIIllllI[1]] = llIIIllllI[11];
                            if (!M.lIlIIllllIlII(Bank.contains((int[])nArray) ? 1 : 0)) break block88;
                            int[] nArray4 = new int[llIIIllllI[0]];
                            nArray4[M.llIIIllllI[1]] = llIIIllllI[11];
                            if (!M.lIlIIllllIlll(Bank.getFirst((int[])nArray4).getQuantity(), llIIIllllI[9])) break block86;
                        }
                        int[] nArray = new int[llIIIllllI[0]];
                        nArray[M.llIIIllllI[1]] = llIIIllllI[12];
                        if (!M.lIlIIllllIlII(Bank.contains((int[])nArray) ? 1 : 0)) break block89;
                        int[] nArray5 = new int[llIIIllllI[0]];
                        nArray5[M.llIIIllllI[1]] = llIIIllllI[12];
                        if (!M.lIlIIllllIlIl(Bank.getFirst((int[])nArray5).getQuantity(), llIIIllllI[13])) break block89;
                    }
                    M.Q();
                    System.out.println(llIIIlllII[llIIIllllI[7]]);
                    bt = llIIIllllI[0];
                    return;
                }
                int[] nArray = new int[llIIIllllI[13]];
                nArray[M.llIIIllllI[1]] = llIIIllllI[14];
                nArray[M.llIIIllllI[0]] = llIIIllllI[12];
                nArray[M.llIIIllllI[4]] = llIIIllllI[15];
                nArray[M.llIIIllllI[6]] = llIIIllllI[11];
                nArray[M.llIIIllllI[7]] = llIIIllllI[10];
                nArray[M.llIIIllllI[16]] = llIIIllllI[8];
                if (M.lIlIIllllIllI(e.c(nArray) ? 1 : 0)) {
                    M.Q();
                    System.out.println(llIIIlllII[llIIIllllI[16]]);
                    bt = llIIIllllI[0];
                    return;
                }
                while (M.lIlIIllllIllI(I.co() ? 1 : 0)) {
                    I.cm();
                    Time.sleepTicks((int)llIIIllllI[0]);
                    0;
                    0;
                    if (((50 + 27 - -67 + 6 ^ 16 + 178 - 146 + 140) & (132 + 25 - 130 + 117 ^ 165 + 54 - 88 + 55 ^ -1)) != 2) continue;
                    return;
                }
                if (M.lIlIIllllIllI(Bank.isOpen() ? 1 : 0)) {
                    a.a();
                    Time.sleepTicks((int)llIIIllllI[13]);
                    0;
                }
                int[] nArray6 = new int[llIIIllllI[17]];
                nArray6[M.llIIIllllI[1]] = llIIIllllI[14];
                nArray6[M.llIIIllllI[0]] = llIIIllllI[12];
                nArray6[M.llIIIllllI[4]] = llIIIllllI[15];
                nArray6[M.llIIIllllI[6]] = llIIIllllI[18];
                nArray6[M.llIIIllllI[7]] = llIIIllllI[11];
                nArray6[M.llIIIllllI[16]] = llIIIllllI[10];
                nArray6[M.llIIIllllI[13]] = llIIIllllI[8];
                if (M.lIlIIllllIlII(e.c(nArray6) ? 1 : 0)) {
                    a.a(llIIIllllI[18], llIIIllllI[7]);
                    a.b(f.aS, llIIIllllI[0]);
                    a.a(llIIIllllI[12], llIIIllllI[13]);
                    a.a(llIIIllllI[19], llIIIllllI[20]);
                    a.a(llIIIllllI[15], llIIIllllI[6]);
                    a.a(llIIIllllI[14], llIIIllllI[21]);
                    int[] nArray7 = new int[llIIIllllI[0]];
                    nArray7[M.llIIIllllI[1]] = llIIIllllI[8];
                    if (M.lIlIIllllIlII(Bank.contains((int[])nArray7) ? 1 : 0)) {
                        int[] nArray8 = new int[llIIIllllI[0]];
                        nArray8[M.llIIIllllI[1]] = llIIIllllI[8];
                        if (M.lIlIIllllIlIl(Inventory.getCount((int[])nArray8), llIIIllllI[0])) {
                            Bank.withdraw((int)llIIIllllI[8], (int)llIIIllllI[22], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks((int)llIIIllllI[0]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[llIIIllllI[0]];
                                nArray[M.llIIIllllI[1]] = llIIIllllI[8];
                                if (M.lIlIIlllllIIl(Inventory.getCount((int[])nArray))) {
                                    bl = llIIIllllI[0];
                                    0;
                                    if (-1 == 3) {
                                        return false;
                                    }
                                } else {
                                    bl = llIIIllllI[1];
                                }
                                return bl;
                            }, (int)llIIIllllI[5]);
                            0;
                        }
                    }
                    int[] nArray9 = new int[llIIIllllI[0]];
                    nArray9[M.llIIIllllI[1]] = llIIIllllI[11];
                    if (M.lIlIIllllIlII(Bank.contains((int[])nArray9) ? 1 : 0)) {
                        int[] nArray10 = new int[llIIIllllI[0]];
                        nArray10[M.llIIIllllI[1]] = llIIIllllI[11];
                        if (M.lIlIIllllIlIl(Inventory.getCount((int[])nArray10), llIIIllllI[0])) {
                            Bank.withdraw((int)llIIIllllI[11], (int)llIIIllllI[23], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks((int)llIIIllllI[0]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[llIIIllllI[0]];
                                nArray[M.llIIIllllI[1]] = llIIIllllI[11];
                                if (M.lIlIIlllllIIl(Inventory.getCount((int[])nArray))) {
                                    bl = llIIIllllI[0];
                                    0;
                                    
                                    }
                                } else {
                                    bl = llIIIllllI[1];
                                }
                                return bl;
                            }, (int)llIIIllllI[5]);
                            0;
                        }
                    }
                    if (M.lIlIIllllIlIl(Skills.getLevel((Skill)Skill.MAGIC), llIIIllllI[2])) {
                        a.a(llIIIllllI[10], llIIIllllI[22]);
                    }
                }
            }
            if (M.lIlIIllllIlII(Inventory.contains((int[])f.ba) ? 1 : 0) && M.lIlIIllllIlIl(Movement.getRunEnergy(), llIIIllllI[24])) {
                Inventory.getFirst((int[])f.ba).interact(llIIIlllII[llIIIllllI[13]]);
                Time.sleepTicks((int)llIIIllllI[0]);
                0;
            }
            if (M.lIlIIlllllIlI(M.lIlIIllllIIll(e.w(), 50.0))) {
                int[] nArray = new int[llIIIllllI[0]];
                nArray[M.llIIIllllI[1]] = llIIIllllI[19];
                if (M.lIlIIllllIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray11 = new int[llIIIllllI[0]];
                    nArray11[M.llIIIllllI[1]] = llIIIllllI[19];
                    Inventory.getFirst((int[])nArray11).interact(llIIIlllII[llIIIllllI[17]]);
                    Time.sleepTicks((int)llIIIllllI[0]);
                    0;
                }
            }
            if (M.lIlIIllllIlII(M.an() ? 1 : 0) && M.lIlIIllllIlIl(e.j(gX), llIIIllllI[0])) {
                if (M.lIlIIllllIllI(gY.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    M.cU();
                }
                if (M.lIlIIllllIlII(gY.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    g.a(llIIIlllII[llIIIllllI[20]], cE);
                }
            }
            if ((!M.lIlIIlllllIll(e.j(gX), llIIIllllI[0]) || !M.lIlIIlllllIll(e.j(gX), llIIIllllI[4]) || M.lIlIIllllllII(e.j(gX), llIIIllllI[6])) && M.lIlIIllllIllI(gY.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && M.lIlIIllllIllI(gZ.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                if (M.lIlIIllllllIl(Players.getLocal().getWorldLocation().distanceTo(gO), llIIIllllI[20]) && M.lIlIIllllIllI(Dialog.isOpen() ? 1 : 0)) {
                    AccBuilderSotf.c = llIIIlllII[llIIIllllI[25]];
                    Movement.walkTo((WorldPoint)gO);
                    0;
                    Time.sleepTicks((int)llIIIllllI[0]);
                    0;
                }
                if (M.lIlIIlllllllI(Players.getLocal().getWorldLocation().distanceTo(gO), llIIIllllI[20])) {
                    g.a(llIIIlllII[llIIIllllI[21]], cE);
                }
            }
            if (M.lIlIIllllllII(e.j(gX), llIIIllllI[7])) {
                di = llIIIllllI[1];
                if (M.lIlIIllllIllI(Vars.getBit((int)llIIIllllI[26]))) {
                    if (M.lIlIIllllllIl(Players.getLocal().getWorldLocation().distanceTo(gQ), llIIIllllI[7])) {
                        AccBuilderSotf.c = llIIIlllII[llIIIllllI[27]];
                        Movement.walkTo((WorldPoint)gQ);
                        0;
                        Time.sleepTicks((int)llIIIllllI[0]);
                        0;
                    }
                    if (M.lIlIIlllllllI(Players.getLocal().getWorldLocation().distanceTo(gQ), llIIIllllI[7])) {
                        String[] stringArray = new String[llIIIllllI[0]];
                        stringArray[M.llIIIllllI[1]] = llIIIlllII[llIIIllllI[28]];
                        String[] stringArray2 = new String[llIIIllllI[0]];
                        stringArray2[M.llIIIllllI[1]] = llIIIlllII[llIIIllllI[2]];
                        if (M.lIlIIllllIlII(TileObjects.getNearest((String[])stringArray).hasAction(stringArray2) ? 1 : 0)) {
                            String[] stringArray3 = new String[llIIIllllI[0]];
                            stringArray3[M.llIIIllllI[1]] = llIIIlllII[llIIIllllI[29]];
                            TileObjects.getNearest((String[])stringArray3).interact(llIIIlllII[llIIIllllI[30]]);
                            Time.sleepTicks((int)llIIIllllI[6]);
                            0;
                        }
                        String[] stringArray4 = new String[llIIIllllI[0]];
                        stringArray4[M.llIIIllllI[1]] = llIIIlllII[llIIIllllI[31]];
                        String[] stringArray5 = new String[llIIIllllI[0]];
                        stringArray5[M.llIIIllllI[1]] = llIIIlllII[llIIIllllI[32]];
                        if (M.lIlIIllllIllI(TileObjects.getNearest((String[])stringArray4).hasAction(stringArray5) ? 1 : 0)) {
                            g.a(llIIIlllII[llIIIllllI[33]], cE);
                        }
                    }
                }
                if (M.lIlIIllllllII(Vars.getBit((int)llIIIllllI[26]), llIIIllllI[0]) && M.lIlIIllllIllI(Vars.getBit((int)llIIIllllI[34]))) {
                    if (M.lIlIIllllllIl(Players.getLocal().getWorldLocation().distanceTo(gR), llIIIllllI[13])) {
                        AccBuilderSotf.c = llIIIlllII[llIIIllllI[35]];
                        Movement.walkTo((WorldPoint)gR);
                        0;
                        Time.sleepTicks((int)llIIIllllI[0]);
                        0;
                    }
                    if (M.lIlIIlllllllI(Players.getLocal().getWorldLocation().distanceTo(gR), llIIIllllI[13])) {
                        g.a(llIIIlllII[llIIIllllI[36]], cE);
                    }
                }
                if (M.lIlIIllllllII(Vars.getBit((int)llIIIllllI[26]), llIIIllllI[0]) && M.lIlIIllllllII(Vars.getBit((int)llIIIllllI[34]), llIIIllllI[0]) && M.lIlIIllllIllI(Vars.getBit((int)llIIIllllI[37]))) {
                    if (M.lIlIIllllllIl(Players.getLocal().getWorldLocation().distanceTo(gS), llIIIllllI[13])) {
                        AccBuilderSotf.c = llIIIlllII[llIIIllllI[38]];
                        Movement.walkTo((WorldPoint)gS);
                        0;
                        Time.sleepTicks((int)llIIIllllI[0]);
                        0;
                    }
                    if (M.lIlIIlllllllI(Players.getLocal().getWorldLocation().distanceTo(gS), llIIIllllI[13])) {
                        g.a(llIIIlllII[llIIIllllI[39]], cE);
                    }
                }
                if (M.lIlIIllllllII(Vars.getBit((int)llIIIllllI[26]), llIIIllllI[0]) && M.lIlIIllllllII(Vars.getBit((int)llIIIllllI[34]), llIIIllllI[0]) && M.lIlIIllllllII(Vars.getBit((int)llIIIllllI[37]), llIIIllllI[0])) {
                    if (M.lIlIIllllllIl(Players.getLocal().getWorldLocation().distanceTo(gT), llIIIllllI[4])) {
                        AccBuilderSotf.c = llIIIlllII[llIIIllllI[40]];
                        Movement.walkTo((WorldPoint)gT);
                        0;
                        Time.sleepTicks((int)llIIIllllI[0]);
                        0;
                    }
                    if (M.lIlIIlllllllI(Players.getLocal().getWorldLocation().distanceTo(gT), llIIIllllI[4])) {
                        AccBuilderSotf.c = llIIIlllII[llIIIllllI[41]];
                        if (M.lIlIIllllIllI(Dialog.isOpen() ? 1 : 0)) {
                            String[] stringArray = new String[llIIIllllI[0]];
                            stringArray[M.llIIIllllI[1]] = llIIIlllII[llIIIllllI[42]];
                            TileObjects.getNearest((String[])stringArray).interact(llIIIlllII[llIIIllllI[43]]);
                            Time.sleepTicks((int)llIIIllllI[6]);
                            0;
                        }
                        int llllllllllllllllllIlIlIlIllllIll2 = Vars.getBit((int)llIIIllllI[44]);
                        var21 = Dialog.getOptions();
                        if (M.lIlIIllllIllI(var21.isEmpty() ? 1 : 0)) {
                            System.out.println("Selecting " + llllllllllllllllllIlIlIlIllllIll2);
                            if (M.lIlIIllllIllI(llllllllllllllllllIlIlIlIllllIll2)) {
                                String[] stringArray = new String[llIIIllllI[0]];
                                stringArray[M.llIIIllllI[1]] = llIIIlllII[llIIIllllI[45]];
                                Dialog.chooseOption((String[])stringArray);
                                0;
                            }
                            if (M.lIlIIllllllII(llllllllllllllllllIlIlIlIllllIll2, llIIIllllI[0])) {
                                String[] stringArray = new String[llIIIllllI[0]];
                                stringArray[M.llIIIllllI[1]] = llIIIlllII[llIIIllllI[46]];
                                Dialog.chooseOption((String[])stringArray);
                                0;
                            }
                            if (M.lIlIIllllllII(llllllllllllllllllIlIlIlIllllIll2, llIIIllllI[4])) {
                                String[] stringArray = new String[llIIIllllI[0]];
                                stringArray[M.llIIIllllI[1]] = llIIIlllII[llIIIllllI[47]];
                                Dialog.chooseOption((String[])stringArray);
                                0;
                            }
                            if (M.lIlIIllllllII(llllllllllllllllllIlIlIlIllllIll2, llIIIllllI[6])) {
                                String[] stringArray = new String[llIIIllllI[0]];
                                stringArray[M.llIIIllllI[1]] = llIIIlllII[llIIIllllI[48]];
                                Dialog.chooseOption((String[])stringArray);
                                0;
                            }
                            Time.sleepTicks((int)llIIIllllI[4]);
                            0;
                        }
                    }
                }
            }
            if (M.lIlIIllllllII(e.j(gX), llIIIllllI[16])) {
                llllllllllllllllllIlIlIlIllllIll2 = new WorldArea(llIIIllllI[49], llIIIllllI[50], llIIIllllI[17], llIIIllllI[16], llIIIllllI[1]);
                if (M.lIlIIllllIllI(Players.getLocal().getWorldLocation().getPlane())) {
                    var21 = new WorldArea(llIIIllllI[51], llIIIllllI[50], llIIIllllI[28], llIIIllllI[13], llIIIllllI[1]);
                    WorldArea var16 = new WorldArea(llIIIllllI[51], llIIIllllI[52], llIIIllllI[7], llIIIllllI[16], llIIIllllI[1]);
                    WorldArea var23 = new WorldArea(llIIIllllI[53], llIIIllllI[54], llIIIllllI[7], llIIIllllI[4], llIIIllllI[1]);
                    WorldArea var6 = new WorldArea(llIIIllllI[53], llIIIllllI[52], llIIIllllI[6], llIIIllllI[6], llIIIllllI[1]);
                    if (M.lIlIIllllllIl(Players.getLocal().getWorldLocation().distanceTo(gU), llIIIllllI[4]) && M.lIlIIllllIllI(var21.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && M.lIlIIllllIllI(var16.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && M.lIlIIllllIllI(var23.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && M.lIlIIllllIllI(var6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderSotf.c = llIIIlllII[llIIIllllI[55]];
                        Movement.walkTo((WorldPoint)gU);
                        0;
                        Time.sleepTicks((int)llIIIllllI[0]);
                        0;
                    }
                    if (M.lIlIIlllllllI(Players.getLocal().getWorldLocation().distanceTo(gU), llIIIllllI[4]) && M.lIlIIllllIllI(llllllllllllllllllIlIlIlIllllIll2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        String[] stringArray = new String[llIIIllllI[0]];
                        stringArray[M.llIIIllllI[1]] = llIIIlllII[llIIIllllI[56]];
                        TileObjects.getNearest((String[])stringArray).interact(llIIIlllII[llIIIllllI[57]]);
                        Time.sleepTicks((int)llIIIllllI[4]);
                        0;
                    }
                    if (M.lIlIIllllIlII(llllllllllllllllllIlIlIlIllllIll2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (M.lIlIIllllllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIllllI[58], llIIIllllI[59], llIIIllllI[1])), llIIIllllI[4])) {
                            Movement.walkTo((WorldPoint)new WorldPoint(llIIIllllI[58], llIIIllllI[59], llIIIllllI[1]));
                            0;
                            Time.sleepTicks((int)llIIIllllI[0]);
                            0;
                        }
                        if (M.lIlIIlllllllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIllllI[58], llIIIllllI[59], llIIIllllI[1])), llIIIllllI[4])) {
                            String[] stringArray = new String[llIIIllllI[0]];
                            stringArray[M.llIIIllllI[1]] = llIIIlllII[llIIIllllI[60]];
                            String[] stringArray6 = new String[llIIIllllI[0]];
                            stringArray6[M.llIIIllllI[1]] = llIIIlllII[llIIIllllI[61]];
                            if (M.lIlIIllllIlII(TileObjects.getNearest((String[])stringArray).hasAction(stringArray6) ? 1 : 0)) {
                                String[] stringArray7 = new String[llIIIllllI[0]];
                                stringArray7[M.llIIIllllI[1]] = llIIIlllII[llIIIllllI[62]];
                                TileObjects.getNearest((String[])stringArray7).interact(llIIIlllII[llIIIllllI[63]]);
                                Time.sleepTicks((int)llIIIllllI[4]);
                                0;
                            }
                            String[] stringArray8 = new String[llIIIllllI[0]];
                            stringArray8[M.llIIIllllI[1]] = llIIIlllII[llIIIllllI[64]];
                            String[] stringArray9 = new String[llIIIllllI[0]];
                            stringArray9[M.llIIIllllI[1]] = llIIIlllII[llIIIllllI[65]];
                            if (M.lIlIIllllIllI(TileObjects.getNearest((String[])stringArray8).hasAction(stringArray9) ? 1 : 0)) {
                                String[] stringArray10 = new String[llIIIllllI[0]];
                                stringArray10[M.llIIIllllI[1]] = llIIIlllII[llIIIllllI[66]];
                                TileObjects.getNearest((String[])stringArray10).interact(llIIIlllII[llIIIllllI[67]]);
                                Time.sleepTicks((int)llIIIllllI[16]);
                                0;
                            }
                        }
                        if (!M.lIlIIllllIllI(var21.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !M.lIlIIllllIllI(var16.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !M.lIlIIllllIllI(var23.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || M.lIlIIllllIlII(var6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] stringArray = new String[llIIIllllI[0]];
                            stringArray[M.llIIIllllI[1]] = llIIIlllII[llIIIllllI[68]];
                            TileObjects.getNearest((String[])stringArray).interact(llIIIlllII[llIIIllllI[69]]);
                            Time.sleepTicks((int)llIIIllllI[16]);
                            0;
                        }
                    }
                }
                if (M.lIlIIllllllII(Players.getLocal().getWorldLocation().getPlane(), llIIIllllI[0])) {
                    AccBuilderSotf.c = llIIIlllII[llIIIllllI[70]];
                    String[] stringArray = new String[llIIIllllI[0]];
                    stringArray[M.llIIIllllI[1]] = llIIIlllII[llIIIllllI[3]];
                    if (M.lIlIIlllllIII(TileObjects.getNearest((String[])stringArray))) {
                        String[] stringArray11 = new String[llIIIllllI[0]];
                        stringArray11[M.llIIIllllI[1]] = llIIIlllII[llIIIllllI[71]];
                        TileObjects.getNearest((String[])stringArray11).interact(llIIIlllII[llIIIllllI[72]]);
                        Time.sleepTicks((int)llIIIllllI[16]);
                        0;
                    }
                    String[] stringArray12 = new String[llIIIllllI[0]];
                    stringArray12[M.llIIIllllI[1]] = llIIIlllII[llIIIllllI[73]];
                    if (M.lIlIIlllllIII(TileObjects.getNearest((String[])stringArray12))) {
                        String[] stringArray13 = new String[llIIIllllI[0]];
                        stringArray13[M.llIIIllllI[1]] = llIIIlllII[llIIIllllI[74]];
                        TileObjects.getNearest((String[])stringArray13).interact(llIIIlllII[llIIIllllI[24]]);
                        Time.sleepTicks((int)llIIIllllI[4]);
                        0;
                    }
                }
            }
            if (M.lIlIIllllllII(e.j(gX), llIIIllllI[13])) {
                if (M.lIlIIllllIllI(gY.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    M.cU();
                }
                if (M.lIlIIllllIlII(gY.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    g.a(llIIIlllII[llIIIllllI[75]], cE);
                }
            }
            if (M.lIlIIllllllII(e.j(gX), llIIIllllI[17])) {
                if (M.lIlIIllllllIl(Players.getLocal().getWorldLocation().distanceTo(gW), llIIIllllI[25])) {
                    AccBuilderSotf.c = llIIIlllII[llIIIllllI[76]];
                    Movement.walkTo((WorldPoint)gW);
                    0;
                    Time.sleepTicks((int)llIIIllllI[4]);
                    0;
                }
                if (M.lIlIIlllllllI(Players.getLocal().getWorldLocation().distanceTo(gW), llIIIllllI[25])) {
                    if (M.lIlIIllllIllI(m.ap() ? 1 : 0)) {
                        m.aq();
                    }
                    String[] stringArray = new String[llIIIllllI[0]];
                    stringArray[M.llIIIllllI[1]] = llIIIlllII[llIIIllllI[77]];
                    llllllllllllllllllIlIlIlIllllIll2 = NPCs.getNearest((String[])stringArray);
                    var21 = NPCs.getNearest(nPC -> {
                        int n2;
                        if (M.lIlIIllllIlII(nPC.getName().contains(llIIIlllII[llIIIllllI[111]]) ? 1 : 0) && M.lIlIlIIIIIIII(nPC.getInteracting(), Players.getLocal())) {
                            n2 = llIIIllllI[0];
                            0;
                            if (3 < 0) {
                                return ((0xF8 ^ 0x80 ^ (0xBE ^ 0x8A)) & (0xD2 ^ 0xA1 ^ (0x58 ^ 0x67) ^ -1)) != 0;
                            }
                        } else {
                            n2 = llIIIllllI[1];
                        }
                        return n2 != 0;
                    });
                    if (M.lIlIIlllllIII(llllllllllllllllllIlIlIlIllllIll2) && M.lIlIIllllllll(var21)) {
                        String[] stringArray14 = new String[llIIIllllI[0]];
                        stringArray14[M.llIIIllllI[1]] = llIIIlllII[llIIIllllI[78]];
                        if (M.lIlIIllllIllI(llllllllllllllllllIlIlIlIllllIll2.hasAction(stringArray14) ? 1 : 0)) {
                            g.a(llIIIlllII[llIIIllllI[79]], cE);
                        }
                        String[] stringArray15 = new String[llIIIllllI[0]];
                        stringArray15[M.llIIIllllI[1]] = llIIIlllII[llIIIllllI[80]];
                        if (M.lIlIIllllIlII(llllllllllllllllllIlIlIlIllllIll2.hasAction(stringArray15) ? 1 : 0) && M.lIlIIllllllll(Players.getLocal().getInteracting())) {
                            AccBuilderSotf.c = llIIIlllII[llIIIllllI[81]];
                            if (M.lIlIIllllIllI(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                            }
                        }
                    }
                    if (M.lIlIIllllIlIl(Prayers.getPoints(), llIIIllllI[40]) && M.lIlIIllllIlII(Inventory.contains((int[])f.aX) ? 1 : 0)) {
                        Inventory.getFirst((int[])f.aX).interact(llIIIlllII[llIIIllllI[82]]);
                        Time.sleepTicks((int)llIIIllllI[0]);
                        0;
                    }
                    g.a(cE);
                }
            }
            if (M.lIlIIllllllII(e.j(gX), llIIIllllI[20])) {
                String[] stringArray = new String[llIIIllllI[0]];
                stringArray[M.llIIIllllI[1]] = llIIIlllII[llIIIllllI[83]];
                if (M.lIlIIllllIllI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    AccBuilderSotf.c = llIIIlllII[llIIIllllI[84]];
                    String[] stringArray16 = new String[llIIIllllI[0]];
                    stringArray16[M.llIIIllllI[1]] = llIIIlllII[llIIIllllI[85]];
                    TileItems.getNearest((String[])stringArray16).interact(llIIIlllII[llIIIllllI[86]]);
                    Time.sleepTicks((int)llIIIllllI[7]);
                    0;
                }
                String[] stringArray17 = new String[llIIIllllI[0]];
                stringArray17[M.llIIIllllI[1]] = llIIIlllII[llIIIllllI[87]];
                if (M.lIlIIllllIlII(Inventory.contains((String[])stringArray17) ? 1 : 0)) {
                    if (M.lIlIIllllIlII(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                        Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                    }
                    if (M.lIlIIllllIllI(gY.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        M.cU();
                    }
                    if (M.lIlIIllllIlII(gY.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (M.lIlIIllllIlIl(di, llIIIllllI[0])) {
                            aN.qk += llIIIllllI[0];
                            aN.u(AccBuilderSotf.m);
                            di += llIIIllllI[0];
                            aN.qk = llIIIllllI[1];
                            dj = llIIIllllI[1];
                        }
                        g.a(llIIIlllII[llIIIllllI[88]], cE);
                    }
                }
            }
            g.a(cE);
        }
    }

    @Override
    public String ag() {
        return llIIIlllII[llIIIllllI[109]];
    }

    private static void lIlIIllllIIIl() {
        llIIIlllII = new String[llIIIllllI[140]];
        M.llIIIlllII[M.llIIIllllI[1]] = M."Finished buying items, switching back to quest";
        M.llIIIlllII[M.llIIIllllI[0]] = M."Drop";
        M.llIIIlllII[M.llIIIllllI[4]] = M."Nav to bank";
        M.llIIIlllII[M.llIIIllllI[6]] = M."Handling banking";
        M.llIIIlllII[M.llIIIllllI[7]] = M."We are missing runes, switching to BUYING";
        M.llIIIlllII[M.llIIIllllI[16]] = M."We are missing quest supplies, switching to BUYING";
        M.llIIIlllII[M.llIIIllllI[13]] = M."Drink";
        M.llIIIlllII[M.llIIIllllI[17]] = M."Eat";
        M.llIIIlllII[M.llIIIllllI[20]] = M."King Bolren";
        M.llIIIlllII[M.llIIIllllI[25]] = M."Nav to commander";
        M.llIIIlllII[M.llIIIllllI[21]] = M."Commander Montai";
        M.llIIIlllII[M.llIIIllllI[27]] = M."Nav to tracker";
        M.llIIIlllII[M.llIIIllllI[28]] = M."Door";
        M.llIIIlllII[M.llIIIllllI[2]] = M."Open";
        M.llIIIlllII[M.llIIIllllI[29]] = M."Door";
        M.llIIIlllII[M.llIIIllllI[30]] = M."Open";
        M.llIIIlllII[M.llIIIllllI[31]] = M."Door";
        M.llIIIlllII[M.llIIIllllI[32]] = M."Open";
        M.llIIIlllII[M.llIIIllllI[33]] = M."Tracker gnome 2";
        M.llIIIlllII[M.llIIIllllI[35]] = M."Nav to tracker";
        M.llIIIlllII[M.llIIIllllI[36]] = M."Tracker gnome 1";
        M.llIIIlllII[M.llIIIllllI[38]] = M."Nav to tracker";
        M.llIIIlllII[M.llIIIllllI[39]] = M."Tracker gnome 3";
        M.llIIIlllII[M.llIIIllllI[40]] = M."Nav to ballista";
        M.llIIIlllII[M.llIIIllllI[41]] = M."Firing";
        M.llIIIlllII[M.llIIIllllI[42]] = M."Ballista";
        M.llIIIlllII[M.llIIIllllI[43]] = M."Fire";
        M.llIIIlllII[M.llIIIllllI[45]] = M."0001";
        M.llIIIlllII[M.llIIIllllI[46]] = M."0002";
        M.llIIIlllII[M.llIIIllllI[47]] = M."0003";
        M.llIIIlllII[M.llIIIllllI[48]] = M."0004";
        M.llIIIlllII[M.llIIIllllI[55]] = M."Nav to crumble";
        M.llIIIlllII[M.llIIIllllI[56]] = M."Crumbled wall";
        M.llIIIlllII[M.llIIIllllI[57]] = M."Climb-over";
        M.llIIIlllII[M.llIIIllllI[60]] = M."Door";
        M.llIIIlllII[M.llIIIllllI[61]] = M."Open";
        M.llIIIlllII[M.llIIIllllI[62]] = M."Door";
        M.llIIIlllII[M.llIIIllllI[63]] = M."Open";
        M.llIIIlllII[M.llIIIllllI[64]] = M."Door";
        M.llIIIlllII[M.llIIIllllI[65]] = M."Open";
        M.llIIIlllII[M.llIIIllllI[66]] = M."Ladder";
        M.llIIIlllII[M.llIIIllllI[67]] = M."Climb-up";
        M.llIIIlllII[M.llIIIllllI[68]] = M."Ladder";
        M.llIIIlllII[M.llIIIllllI[69]] = M."Climb-up";
        M.llIIIlllII[M.llIIIllllI[70]] = M."Grab orb";
        M.llIIIlllII[M.llIIIllllI[3]] = M."Closed chest";
        M.llIIIlllII[M.llIIIllllI[71]] = M."Closed chest";
        M.llIIIlllII[M.llIIIllllI[72]] = M."Open";
        M.llIIIlllII[M.llIIIllllI[73]] = M."Open chest";
        M.llIIIlllII[M.llIIIllllI[74]] = M."Open chest";
        M.llIIIlllII[M.llIIIllllI[24]] = M."Search";
        M.llIIIlllII[M.llIIIllllI[75]] = M."King Bolren";
        M.llIIIlllII[M.llIIIllllI[76]] = M."Travel to final fight";
        M.llIIIlllII[M.llIIIllllI[77]] = M."Khazard warlord";
        M.llIIIlllII[M.llIIIllllI[78]] = M."Attack";
        M.llIIIlllII[M.llIIIllllI[79]] = M."Khazard warlord";
        M.llIIIlllII[M.llIIIllllI[80]] = M."Attack";
        M.llIIIlllII[M.llIIIllllI[81]] = M."Handle fight";
        M.llIIIlllII[M.llIIIllllI[82]] = M."Drink";
        M.llIIIlllII[M.llIIIllllI[83]] = M."Orbs of protection";
        M.llIIIlllII[M.llIIIllllI[84]] = M."Taking orbs";
        M.llIIIlllII[M.llIIIllllI[85]] = M."Orbs of protection";
        M.llIIIlllII[M.llIIIllllI[86]] = M."Take";
        M.llIIIlllII[M.llIIIllllI[87]] = M."Orbs of protection";
        M.llIIIlllII[M.llIIIllllI[88]] = M."King Bolren";
        M.llIIIlllII[M.llIIIllllI[89]] = M."Nav to start";
        M.llIIIlllII[M.llIIIllllI[100]] = M."Castle Wars";
        M.llIIIlllII[M.llIIIllllI[101]] = M."Loose Railing";
        M.llIIIlllII[M.llIIIllllI[102]] = M."Squeeze-through";
        M.llIIIlllII[M.llIIIllllI[109]] = M."Tree Gnome Village";
        M.llIIIlllII[M.llIIIllllI[110]] = M."ring of wealth (";
        M.llIIIlllII[M.llIIIllllI[111]] = M."trooper";
        M.llIIIlllII[M.llIIIllllI[130]] = M."Can I help at all?";
        M.llIIIlllII[M.llIIIllllI[131]] = M."I would be glad to help.";
        M.llIIIlllII[M.llIIIllllI[132]] = M."Ok, I'll gather some wood.";
        M.llIIIlllII[M.llIIIllllI[133]] = M."I'll try my best.";
        M.llIIIlllII[M.llIIIllllI[134]] = M."I will find the warlord and bring back the orbs.";
        M.llIIIlllII[M.llIIIllllI[135]] = M."Yes.";
    }

    private static String lIlIIlllIlIll(String var9, String var3) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), llIIIllllI[20]), "DES");
            Cipher var7 = Cipher.getInstance("DES");
            var7.init(llIIIllllI[4], var2);
            return new String(var7.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    private static void cU() {
        if (M.lIlIIllllllIl(Players.getLocal().getWorldLocation().distanceTo(gN), llIIIllllI[4])) {
            void var12;
            void var18;
            void var25;
            AccBuilderSotf.c = llIIIlllII[llIIIllllI[89]];
            WorldArea worldArea = new WorldArea(llIIIllllI[90], llIIIllllI[91], llIIIllllI[92], llIIIllllI[93], llIIIllllI[1]);
            WorldPoint worldPoint = new WorldPoint(llIIIllllI[94], llIIIllllI[95], llIIIllllI[1]);
            WorldArea worldArea2 = new WorldArea(llIIIllllI[96], llIIIllllI[97], llIIIllllI[35], llIIIllllI[7], llIIIllllI[1]);
            WorldArea worldArea3 = new WorldArea(llIIIllllI[98], llIIIllllI[99], llIIIllllI[20], llIIIllllI[16], llIIIllllI[1]);
            if (M.lIlIIllllIlII(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            if (M.lIlIIllllIllI(var25.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Equipment.getFirst((int[])f.aS).interact(llIIIlllII[llIIIllllI[100]]);
                Time.sleepTicks((int)llIIIllllI[16]);
                0;
            }
            if (M.lIlIIllllIllI(O.ks.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)O.kt);
                0;
            }
            if (M.lIlIIllllIlII(O.ks.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && M.lIlIIllllIllI(var18.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && M.lIlIIllllIllI(var12.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && M.lIlIIllllIllI(gY.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && M.lIlIIllllIllI(gZ.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Walker.stepAlong(List.of(O.jy));
                0;
                Time.sleepTicks((int)llIIIllllI[0]);
                0;
            }
            if (!M.lIlIIllllIllI(var18.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || M.lIlIIllllIlII(var12.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                String[] stringArray = new String[llIIIllllI[0]];
                stringArray[M.llIIIllllI[1]] = llIIIlllII[llIIIllllI[101]];
                TileObjects.getNearest((String[])stringArray).interact(llIIIlllII[llIIIllllI[102]]);
                Time.sleepTicks((int)llIIIllllI[7]);
                0;
            }
            if ((!M.lIlIIllllIllI(gY.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || M.lIlIIllllIlII(gZ.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && M.lIlIIllllllIl(Players.getLocal().getWorldLocation().distanceTo(gN), llIIIllllI[4])) {
                Movement.walkTo((WorldPoint)gN);
                0;
                Time.sleepTicks((int)llIIIllllI[0]);
                0;
            }
        }
    }

    private static boolean lIlIIllllllIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIlIIIIIIII(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIlIIllllllll(Object object) {
        return object == null;
    }

    private static String lIlIIlllIllII(String var13, String var17) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var4 = var17.toCharArray();
        int var15 = llIIIllllI[1];
        char[] var10 = var13.toCharArray();
        int var26 = var10.length;
        int var8 = llIIIllllI[1];
        while (M.lIlIIllllIlIl(var8, var26)) {
            char var5 = var10[var8];
            var14.append((char)(var5 ^ var4[var15 % var4.length]));
            0;
            ++var15;
            ++var8;
            0;
            
            return null;
        }
        return String.valueOf(var14);
    }
}

