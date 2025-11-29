/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 */
package -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l;

import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.a;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.b;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.d;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.e;
import gg.squire.account.AccBuilderGWD;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Skill;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;

public class h {
    private static /* synthetic */ int bK;
    public static /* synthetic */ boolean bw;
    private static /* synthetic */ int ca;
    private static /* synthetic */ int bQ;
    private static /* synthetic */ int cc;
    private static /* synthetic */ int bN;
    private static /* synthetic */ int bT;
    private static /* synthetic */ int bM;
    private static /* synthetic */ int bS;
    private static /* synthetic */ Map<Integer, Integer> bA;
    private static /* synthetic */ Map<Integer, Integer> bF;
    private static /* synthetic */ Map<Integer, Integer> bE;
    private static /* synthetic */ int[] lllIlIIIl;
    private static /* synthetic */ int cd;
    private static /* synthetic */ int bU;
    private static /* synthetic */ Map<Integer, Integer> bz;
    private static /* synthetic */ int bV;
    private static /* synthetic */ int bL;
    private static /* synthetic */ int bZ;
    private static /* synthetic */ int bX;
    private static /* synthetic */ Map<Integer, Integer> bB;
    private static /* synthetic */ int ce;
    public static /* synthetic */ List<d> bx;
    private static /* synthetic */ int bR;
    private static /* synthetic */ String[] lllIlIIII;
    private static /* synthetic */ int bJ;
    private static /* synthetic */ int bO;
    private static /* synthetic */ Map<Integer, Integer> bH;
    private static /* synthetic */ int bW;
    private static /* synthetic */ Map<Integer, Integer> bD;
    private static /* synthetic */ Map<Integer, Integer> bI;
    public static /* synthetic */ boolean bv;
    private static /* synthetic */ int bY;
    private static /* synthetic */ int cb;
    private static /* synthetic */ int bP;
    private static /* synthetic */ Map<Integer, Integer> bG;
    private static /* synthetic */ Map<Integer, Integer> by;
    private static /* synthetic */ Map<Integer, Integer> bC;

    private static boolean llIIIlIllIIl(int n2) {
        return n2 == 0;
    }

    private static boolean n(int n2) {
        if (h.llIIIlIlllIl(n2, lllIlIIIl[16])) {
            int[] nArray = new int[lllIlIIIl[10]];
            nArray[h.lllIlIIIl[0]] = bJ;
            nArray[h.lllIlIIIl[1]] = bK;
            nArray[h.lllIlIIIl[2]] = bL;
            nArray[h.lllIlIIIl[3]] = bM;
            nArray[h.lllIlIIIl[4]] = bN;
            nArray[h.lllIlIIIl[5]] = bO;
            nArray[h.lllIlIIIl[6]] = bP;
            nArray[h.lllIlIIIl[7]] = bQ;
            nArray[h.lllIlIIIl[8]] = bR;
            nArray[h.lllIlIIIl[9]] = bS;
            return h.d(nArray);
        }
        int[] nArray = new int[lllIlIIIl[11]];
        nArray[h.lllIlIIIl[0]] = bJ;
        nArray[h.lllIlIIIl[1]] = bK;
        nArray[h.lllIlIIIl[2]] = bL;
        nArray[h.lllIlIIIl[3]] = bM;
        nArray[h.lllIlIIIl[4]] = bN;
        nArray[h.lllIlIIIl[5]] = bO;
        nArray[h.lllIlIIIl[6]] = bP;
        nArray[h.lllIlIIIl[7]] = bQ;
        nArray[h.lllIlIIIl[8]] = bR;
        nArray[h.lllIlIIIl[9]] = bS;
        nArray[h.lllIlIIIl[10]] = n2;
        return h.d(nArray);
    }

    private static void Q() {
        d lllIIIllllIlI;
        if (h.llIIIlIllIII(bJ)) {
            int[] nArray = new int[lllIlIIIl[1]];
            nArray[h.lllIlIIIl[0]] = bJ;
            if (h.llIIIlIllIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                d d2 = new d(bJ, lllIlIIIl[1], bU);
                bx.add(d2);
                0;
            }
        }
        if (h.llIIIlIllIII(bK)) {
            int[] nArray = new int[lllIlIIIl[1]];
            nArray[h.lllIlIIIl[0]] = bK;
            if (h.llIIIlIllIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                lllIIIllllIlI = new d(bK, lllIlIIIl[1], bV);
                bx.add(lllIIIllllIlI);
                0;
            }
        }
        if (h.llIIIlIllIII(bL)) {
            int[] nArray = new int[lllIlIIIl[1]];
            nArray[h.lllIlIIIl[0]] = bL;
            if (h.llIIIlIllIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                lllIIIllllIlI = new d(bL, lllIlIIIl[1], bW);
                bx.add(lllIIIllllIlI);
                0;
            }
        }
        if (h.llIIIlIllIII(bM)) {
            int[] nArray = new int[lllIlIIIl[1]];
            nArray[h.lllIlIIIl[0]] = bM;
            if (h.llIIIlIllIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                lllIIIllllIlI = new d(bM, lllIlIIIl[1], bX);
                bx.add(lllIIIllllIlI);
                0;
            }
        }
        if (h.llIIIlIllIII(bN)) {
            int[] nArray = new int[lllIlIIIl[1]];
            nArray[h.lllIlIIIl[0]] = bN;
            if (h.llIIIlIllIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                lllIIIllllIlI = new d(bN, lllIlIIIl[1], bY);
                bx.add(lllIIIllllIlI);
                0;
            }
        }
        if (h.llIIIlIllIII(bO)) {
            int[] nArray = new int[lllIlIIIl[1]];
            nArray[h.lllIlIIIl[0]] = bO;
            if (h.llIIIlIllIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                lllIIIllllIlI = new d(bO, lllIlIIIl[1], bZ);
                bx.add(lllIIIllllIlI);
                0;
            }
        }
        if (h.llIIIlIllIII(bP)) {
            int[] nArray = new int[lllIlIIIl[1]];
            nArray[h.lllIlIIIl[0]] = bP;
            if (h.llIIIlIllIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                lllIIIllllIlI = new d(bP, lllIlIIIl[1], ca);
                bx.add(lllIIIllllIlI);
                0;
            }
        }
        if (h.llIIIlIllIII(bQ)) {
            int[] nArray = new int[lllIlIIIl[1]];
            nArray[h.lllIlIIIl[0]] = bQ;
            if (h.llIIIlIllIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                lllIIIllllIlI = new d(bQ, lllIlIIIl[1], cb);
                bx.add(lllIIIllllIlI);
                0;
            }
        }
        if (h.llIIIlIllIII(bR)) {
            int[] nArray = new int[lllIlIIIl[1]];
            nArray[h.lllIlIIIl[0]] = bR;
            if (h.llIIIlIllIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                lllIIIllllIlI = new d(bR, lllIlIIIl[1], cc);
                bx.add(lllIIIllllIlI);
                0;
            }
        }
        if (h.llIIIlIllIII(bS)) {
            int[] nArray = new int[lllIlIIIl[1]];
            nArray[h.lllIlIIIl[0]] = bS;
            if (h.llIIIlIllIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                lllIIIllllIlI = new d(bS, lllIlIIIl[1], cd);
                bx.add(lllIIIllllIlI);
                0;
            }
        }
        if (h.llIIIlIllIII(bT)) {
            int[] nArray = new int[lllIlIIIl[1]];
            nArray[h.lllIlIIIl[0]] = bT;
            if (h.llIIIlIllIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                if (h.llIIIlIlllIl(bT, lllIlIIIl[16])) {
                    int[] nArray2 = new int[lllIlIIIl[1]];
                    nArray2[h.lllIlIIIl[0]] = lllIlIIIl[16];
                    if (h.llIIIlIllIIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                        int[] nArray3 = new int[lllIlIIIl[1]];
                        nArray3[h.lllIlIIIl[0]] = lllIlIIIl[17];
                        if (h.llIIIlIllIIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
                            int[] nArray4 = new int[lllIlIIIl[1]];
                            nArray4[h.lllIlIIIl[0]] = lllIlIIIl[18];
                            if (h.llIIIlIllIIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
                                lllIIIllllIlI = new d(bT, lllIlIIIl[1], ce);
                                bx.add(lllIIIllllIlI);
                                0;
                                0;
                                if (-2 >= 0) {
                                    return;
                                }
                            }
                        }
                    }
                } else {
                    lllIIIllllIlI = new d(bT, lllIlIIIl[1], ce);
                    bx.add(lllIIIllllIlI);
                    0;
                }
            }
        }
    }

    private static void W() {
        Random random = new Random();
        bJ = h.a(by, random);
        bU = by.getOrDefault(bJ, lllIlIIIl[0]);
        bK = h.a(bz, random);
        bV = bz.getOrDefault(bK, lllIlIIIl[0]);
        bL = h.a(bA, random);
        bW = bA.getOrDefault(bL, lllIlIIIl[0]);
        bM = h.a(bB, random);
        bX = bB.getOrDefault(bM, lllIlIIIl[0]);
        bN = h.a(bC, random);
        bY = bC.getOrDefault(bN, lllIlIIIl[0]);
        bO = h.a(bD, random);
        bZ = bD.getOrDefault(bO, lllIlIIIl[0]);
        bP = h.a(bE, random);
        ca = bE.getOrDefault(bP, lllIlIIIl[0]);
        bQ = h.a(bF, random);
        cb = bF.getOrDefault(bQ, lllIlIIIl[0]);
        bR = h.a(bG, random);
        cc = bG.getOrDefault(bR, lllIlIIIl[0]);
        bS = h.a(bH, random);
        cd = bH.getOrDefault(bS, lllIlIIIl[0]);
        bT = h.a(bI, random);
        ce = bI.getOrDefault(bT, lllIlIIIl[0]);
    }

    private static boolean llIIIlIllIII(int n2) {
        return n2 != 0;
    }

    public static void X() {
        by.clear();
        bz.clear();
        bA.clear();
        bB.clear();
        bC.clear();
        bD.clear();
        bE.clear();
        bF.clear();
        bG.clear();
        bH.clear();
        bI.clear();
        bS = bT = lllIlIIIl[0];
        bR = bT;
        bQ = bT;
        bP = bT;
        bO = bT;
        bN = bT;
        bM = bT;
        bL = bT;
        bK = bT;
        bJ = bT;
        cd = ce = lllIlIIIl[0];
        cc = ce;
        cb = ce;
        ca = ce;
        bZ = ce;
        bY = ce;
        bX = ce;
        bW = ce;
        bV = ce;
        bU = ce;
        bw = lllIlIIIl[0];
        System.out.println(lllIlIIII[lllIlIIIl[46]]);
    }

    private static void llIIIlIlIlll() {
        lllIlIIIl = new int[206];
        h.lllIlIIIl[0] = (0x5F ^ 0x61 ^ (0x69 ^ 7)) & (0x1E ^ 0x56 ^ (4 ^ 0x1C) ^ -1);
        h.lllIlIIIl[1] = 1;
        h.lllIlIIIl[2] = 2;
        h.lllIlIIIl[3] = 3;
        h.lllIlIIIl[4] = 116 + 80 - 21 + 11 ^ 137 + 99 - 166 + 120;
        h.lllIlIIIl[5] = 188 + 114 - 150 + 47 ^ 174 + 54 - 182 + 148;
        h.lllIlIIIl[6] = 99 + 70 - 63 + 46 ^ 3 + 151 - 23 + 27;
        h.lllIlIIIl[7] = 0x41 ^ 0x78 ^ (0x38 ^ 6);
        h.lllIlIIIl[8] = 0x80 ^ 0x88;
        h.lllIlIIIl[9] = 108 + 96 - 92 + 47 ^ 96 + 28 - 114 + 140;
        h.lllIlIIIl[10] = 0x75 ^ 0x2A ^ (0x51 ^ 4);
        h.lllIlIIIl[11] = 0x7D ^ 0x76;
        h.lllIlIIIl[12] = 0x9C ^ 0x90;
        h.lllIlIIIl[13] = 138 + 71 - 145 + 93 ^ 126 + 29 - 112 + 101;
        h.lllIlIIIl[14] = 0x64 ^ 0x6A;
        h.lllIlIIIl[15] = -(0xFFFFEFF2 & 0x7C4F) & (0xFFFFFFF9 & 0x7FCF);
        h.lllIlIIIl[16] = -(0xFFFFFFB3 & 0x17D) & (0xFFFFAFFF & 0x7FFC);
        h.lllIlIIIl[17] = 0xFFFFEFEF & 0x3EDE;
        h.lllIlIIIl[18] = -(0xFFFFD91D & 0x67EE) & (0xFFFFEFFF & 0x7FDB);
        h.lllIlIIIl[19] = 8 ^ 7;
        h.lllIlIIIl[20] = 0x82 ^ 0x92;
        h.lllIlIIIl[21] = 152 + 129 - 105 + 6 ^ 84 + 45 - 53 + 91;
        h.lllIlIIIl[22] = -2 & (0xFFFFEEDB & 0x3FF7);
        h.lllIlIIIl[23] = 0xFFFFEEFD & 0x3FD6;
        h.lllIlIIIl[24] = 0x12 ^ 0;
        h.lllIlIIIl[25] = 0xFFFFBCF1 & 0x478F;
        h.lllIlIIIl[26] = -(0xFFFFBAEB & 0x6DB7) & (0xFFFFEEFE & 0x7DFF);
        h.lllIlIIIl[27] = 0xFFFFED2E & 0x5EFD;
        h.lllIlIIIl[28] = 0xFFFF86AF & 0x7DD3;
        h.lllIlIIIl[29] = -(0xFFFFEBD5 & 0x5F7B) & (0xFFFFEFFF & 0x5FF5);
        h.lllIlIIIl[30] = 0xFFFFFFFB & 0x3D26;
        h.lllIlIIIl[31] = -(0xFFFFEE2F & 0x35D1) & (0xFFFFFFDF & 0x6FAC);
        h.lllIlIIIl[32] = -(0xFFFFE357 & 0x7CF9) & (0xFFFFFEF7 & 0x65FF);
        h.lllIlIIIl[33] = -(0xFFFFF7DD & 0x1AE7) & (0xFFFFBFEF & 0x57FF);
        h.lllIlIIIl[34] = -(0xFFFFDF7A & 0x2BDF) & (0xFFFFCFDF & 0x7FFD);
        h.lllIlIIIl[35] = -(0xC0 ^ 0x82) & (0xFFFFDBFF & 0x7EFF);
        h.lllIlIIIl[36] = 0xFFFFE4DF & 0x1F7D;
        h.lllIlIIIl[37] = 0xFFFFF99B & 0x4E76;
        h.lllIlIIIl[38] = -(0xFFFFEBD9 & 0x3D37) & (0xFFFFFBFE & Short.MAX_VALUE);
        h.lllIlIIIl[39] = -(0xFFFFFFBF & 0x7065) & (0xFFFFF4FF & 0x7F7F);
        h.lllIlIIIl[40] = 0xFFFFFEFF & 0x54D;
        h.lllIlIIIl[41] = -(0xFFFFB8DD & 0x6727) & (0xFFFFFEFF & 0x252F);
        h.lllIlIIIl[42] = 0xFFFFF7FD & 0x5FE6;
        h.lllIlIIIl[43] = 0xFFFFEFBF & 0x7378;
        h.lllIlIIIl[44] = -(0xFFFFFBA9 & 0x7F57) & (0xFFFFFF7F & 0x7FB3);
        h.lllIlIIIl[45] = 0xFFFFECFF & 0x1739;
        h.lllIlIIIl[46] = 137 + 12 - 41 + 31 ^ 86 + 120 - 177 + 130;
        h.lllIlIIIl[47] = 0xFFFFB6D5 & 0x4DAF;
        h.lllIlIIIl[48] = 0xFFFF97AD & 0x6CFB;
        h.lllIlIIIl[49] = -(0xFFFFFEB5 & 0x6BDB) & (0xFFFFFFFF & 0x6FBD);
        h.lllIlIIIl[50] = -(0xFFFFC183 & 0x7E7D) & (0xFFFFE5FF & 0x5E5F);
        h.lllIlIIIl[51] = -(0xFFFFF8F5 & 0x77DB) & (0xFFFFFEFD & 0x75FF);
        h.lllIlIIIl[52] = 0x85 ^ 0xAE ^ (0x55 ^ 0x60);
        h.lllIlIIIl[53] = -(0xFFFFD177 & 0x3FF9) & (0xFFFFBFFF & 0x55F7);
        h.lllIlIIIl[54] = 0xFFFFDFFF & 0x6ED2;
        h.lllIlIIIl[55] = -(0xFFFFFC81 & 0x67FF) & (0xFFFFFFFD & 0xF6FE);
        h.lllIlIIIl[56] = -(0xFFFFAC9F & 0x5BE4) & (0xFFFFFFDF & 0xC9FF);
        h.lllIlIIIl[57] = 0xFFFFB6AD & 0x4DFF;
        h.lllIlIIIl[58] = -(0xFFFFA6AF & 0x7BD9) & (0xFFFFAFBF & 0x77F9);
        h.lllIlIIIl[59] = -(0xFFFFCF9F & 0x73FB) & (0xFFFFFFFF & 0x47FB);
        h.lllIlIIIl[60] = -(0xFFFFDB7D & 0x3483) & (0xFFFFFFFF & 0x3FFF);
        h.lllIlIIIl[61] = -(0xFFFFD5FF & 0x2BC2) & (0xFFFF9FF3 & 0xF7FF);
        h.lllIlIIIl[62] = -(0xFFFFFBEB & 0x56F6) & (0xFFFFFFEF & 0xF3FF);
        h.lllIlIIIl[63] = 0xFFFF84EF & 0x7F3F;
        h.lllIlIIIl[64] = 0xFFFFC4BF & 0x3F7D;
        h.lllIlIIIl[65] = 0xB5 ^ 0x92 ^ (0x3E ^ 0x31);
        h.lllIlIIIl[66] = -(0xFFFFF2DF & 0x7D75) & (0xFFFFFCFF & 0x77DD);
        h.lllIlIIIl[67] = -(0xFFFFD4F9 & 0x6F97) & (0xFFFFFEFF & 0x4FBD);
        h.lllIlIIIl[68] = 0xFFFF9EDF & 0xFB6C;
        h.lllIlIIIl[69] = -(0xFFFFCF71 & 0x73DF) & (0xFFFFE7FF & 0x5FFF);
        h.lllIlIIIl[70] = 0xFFFFCF3B & 0x3AEF;
        h.lllIlIIIl[71] = -(0xFFFFDF5F & 0x72AD) & (0xFFFFF77F & 0x5FBF);
        h.lllIlIIIl[72] = -(0xFFFFBABF & 0x77DD) & (0xFFFFB7FF & 0x7EFF);
        h.lllIlIIIl[73] = 0xFFFF8ABF & 0x7F6F;
        h.lllIlIIIl[74] = -(0xFFFFEFFE & 0x12BF) & (0xFFFFBFFF & 0xFFFF);
        h.lllIlIIIl[75] = -(0xFFFFEEC9 & 0x17B7) & (0xFFFFEFFE & 0xDE9F);
        h.lllIlIIIl[76] = 0xFFFFF7F7 & 0xC5F;
        h.lllIlIIIl[77] = -(0xFFFFFBCD & 0x37FF) & (0xFFFFF7FF & 0x3FFD);
        h.lllIlIIIl[78] = -(0xFFFFFBFF & 0x1E2D) & (0xFFFFFEEF & 0x1F7F);
        h.lllIlIIIl[79] = 0x2E ^ 0x12;
        h.lllIlIIIl[80] = 0xFFFFE4AF & 0x1FDB;
        h.lllIlIIIl[81] = 0xFFFFCF7F & 0x34FB;
        h.lllIlIIIl[82] = -(0x33 ^ 0x42) & (0xFFFFFF7D & 0x175FE);
        h.lllIlIIIl[83] = 0xFFFFBFFC & 0x1DC1F;
        h.lllIlIIIl[84] = -(0xFFFFF9AF & 0x575F) & (0xFFFFD7FF & 0x7DBF);
        h.lllIlIIIl[85] = -(0xFFFF8999 & 0x77EF) & (0xFFFF8BFB & Short.MAX_VALUE);
        h.lllIlIIIl[86] = -(0xFFFFDF4F & 0x6EBC) & (0xFFFFFEBF & Short.MAX_VALUE);
        h.lllIlIIIl[87] = 0xFFFFFDED & 0x6B3;
        h.lllIlIIIl[88] = 0xFFFFDB6F & 0x2EF3;
        h.lllIlIIIl[89] = 0xFFFFA5F5 & 0x5F3F;
        h.lllIlIIIl[90] = -(0xFFFFE11F & 0x7FFA) & (0xFFFFF7FF & 0xFBBD);
        h.lllIlIIIl[91] = 0xFFFFBAFF & 0xEDDE;
        h.lllIlIIIl[92] = 0xFFFFEDF9 & 0x165F;
        h.lllIlIIIl[93] = 0xFFFFB4B7 & 0x4F7F;
        h.lllIlIIIl[94] = -(0x55 ^ 0x41) & (0xFFFFF4BF & 0xFF77);
        h.lllIlIIIl[95] = 0xFFFFB7FF & 0x16E88;
        h.lllIlIIIl[96] = -(0xFFFFBD83 & 0x7B7F) & (0xFFFFBDD7 & 0x7F6F);
        h.lllIlIIIl[97] = -(0xFFFF932B & 0x6DD7) & (0xFFFFEFBF & 0x17FF);
        h.lllIlIIIl[98] = -(0xFFFFBFEF & 0x43BB) & (0xFFFFFBFE & 0x4FEF);
        h.lllIlIIIl[99] = -(0xFFFFE1AB & 0x7F7D) & (0xFFFFEFEF & 0x77FB);
        h.lllIlIIIl[100] = 0xFFFFBC7E & 0x6BFD;
        h.lllIlIIIl[101] = -(0xFFFFBBCF & 0x4CB3) & (0xFFFFBFF7 & 0xDEEE);
        h.lllIlIIIl[102] = -(112 + 140 - 219 + 160) & (0xFFFFAEC5 & 0xF7FE);
        h.lllIlIIIl[103] = -(0x30 ^ 0x2B) & (0xFFFFBFDB & 0x46FF);
        h.lllIlIIIl[104] = 0xFFFF9BFF & 0x67FB;
        h.lllIlIIIl[105] = 0xFFFFDBA7 & 0x7F5C;
        h.lllIlIIIl[106] = 0xFFFFFFED & 0x7376;
        h.lllIlIIIl[107] = -(0xFFFFF801 & 0x6FFF) & (0xFFFFFBEF & 0x6FFF);
        h.lllIlIIIl[108] = 0xFFFFD3FF & 0x2FFF;
        h.lllIlIIIl[109] = -(0x60 ^ 0x4D) & (0xFFFF846F & 0x7FBF);
        h.lllIlIIIl[110] = 0xFFFFBBEF & 0x5531;
        h.lllIlIIIl[111] = 0xFFFFBFF2 & 0x437F;
        h.lllIlIIIl[112] = 189 + 156 - 157 + 34;
        h.lllIlIIIl[113] = 227 + 47 - 78 + 37;
        h.lllIlIIIl[114] = -(0xFFFFBE7D & 0x539B) & (0xFFFF9FBF & 0x767B);
        h.lllIlIIIl[115] = 0xFFFFFF6F & 0x6BFC;
        h.lllIlIIIl[116] = 0xFFFFFEBD & 0x7F6E;
        h.lllIlIIIl[117] = -(0xFFFFF5EE & 0x7E97) & (0xFFFFFFFF & 0x7FEF);
        h.lllIlIIIl[118] = 0xFFFFCF77 & 0x3BE8;
        h.lllIlIIIl[119] = -(0xFFFFFADF & 0x3739) & (0xFFFFBE7F & 0x77BD);
        h.lllIlIIIl[120] = -(0xFFFFD6EE & 0x3933) & (0xFFFFFFEF & 0x1B7F);
        h.lllIlIIIl[121] = 0xFFFFEBEA & 0x1F77;
        h.lllIlIIIl[122] = 0xFFFFEF7C & 0x1BDB;
        h.lllIlIIIl[123] = 0xFFFFC6F3 & 0x3F6F;
        h.lllIlIIIl[124] = 0xFFFFA7ED & 0x5E77;
        h.lllIlIIIl[125] = -(54 + 56 - 17 + 40) & (0xFFFF8EEF & 0x77FF);
        h.lllIlIIIl[126] = 0xFFFF86F7 & 0x7F6F;
        h.lllIlIIIl[127] = -(0xFFFFDF4F & 0x6FFD) & (0xFFFFFF7F & 0x7FCF);
        h.lllIlIIIl[128] = 0xFFFFEB7B & 0x1EF5;
        h.lllIlIIIl[129] = -(0xFFFFF9DA & 0x7F3D) & (0xFFFFFFBF & Short.MAX_VALUE);
        h.lllIlIIIl[130] = 0xFFFFDEFC & 0x6FFF;
        h.lllIlIIIl[131] = 0xFFFFF6DA & 0xDFFD;
        h.lllIlIIIl[132] = 0xFFFFFFEE & 0xFDF9;
        h.lllIlIIIl[133] = -(0xFFFFF45F & 0x3BF9) & (0xFFFFFFFB & 0x7F5E);
        h.lllIlIIIl[134] = 0xFFFFEFCF & 0x5F3B;
        h.lllIlIIIl[135] = -(0xFFFFBA77 & 0x55FF) & (0xFFFFDFFE & 0x7F7F);
        h.lllIlIIIl[136] = -(0xFFFFD6C1 & 0x79BF) & (0xFFFFFFF7 & 0x7BFE);
        h.lllIlIIIl[137] = 0xFFFFCBC9 & 0xBE7E;
        h.lllIlIIIl[138] = 0xFFFFB72F & 0x4FFD;
        h.lllIlIIIl[139] = 0xFFFFFC19 & 0x13FF;
        h.lllIlIIIl[140] = 0xFFFF91FE & 0x7ED7;
        h.lllIlIIIl[141] = -(0xFFFFEF49 & 0x15BF) & (0xFFFFEF7A & 0x17FF);
        h.lllIlIIIl[142] = -(0xFFFFFF8D & 0x49F7) & (0xFFFFDDBF & 0x7BDF);
        h.lllIlIIIl[143] = -(0xFFFFADE7 & 0x7FF9) & (0xFFFFFDFF & 0x3FFF);
        h.lllIlIIIl[144] = 0xFFFFF4A7 & 0x1B7B;
        h.lllIlIIIl[145] = 0xFFFFE3DE & 0x7FBD;
        h.lllIlIIIl[146] = -(0xFFFFFAD3 & 0xD2D) & (0xFFFFFFFD & 0x7B3E);
        h.lllIlIIIl[147] = 0x6E ^ 0x39 ^ (0x55 ^ 0x44);
        h.lllIlIIIl[148] = 0xFFFFDCFE & 0x3BB7;
        h.lllIlIIIl[149] = -(0xFFFF96EF & 0x7F16) & (0xFFFFF7AF & 0x7FFD);
        h.lllIlIIIl[150] = 0xFFFFBBBB & 0xCCFC;
        h.lllIlIIIl[151] = 0xFFFFF5F4 & 0x3BFF;
        h.lllIlIIIl[152] = 0xFFFFC777 & 0xABFD8;
        h.lllIlIIIl[153] = -(0xFFFFB54F & 0x7FFB) & (0xFFFFFFEB & 0xB7FFE);
        h.lllIlIIIl[154] = 0xFFFFE9FF & 0x1FC3;
        h.lllIlIIIl[155] = 0xFFFFBFED & 0x49D7;
        h.lllIlIIIl[156] = -(0xFFFFDD7D & 0x729B) & (0xFFFFFDFF & 0x5BDF);
        h.lllIlIIIl[157] = 0xFFFFDBBF & 0x2DFD;
        h.lllIlIIIl[158] = 0xFFFFCDFF & 0x3BBF;
        h.lllIlIIIl[159] = -(0xFFFFBD35 & 0x56FF) & (0xFFFFDDFF & 0x3FF5);
        h.lllIlIIIl[160] = 0xFFFFEDDE & 0x15E29;
        h.lllIlIIIl[161] = -(0xFFFFEECF & 0x1D36) & (0xFFFFFF7F & 0x17F9D);
        h.lllIlIIIl[162] = 0xFFFFB9F3 & 0x6F0F;
        h.lllIlIIIl[163] = 0xFFFFEE9D & 0xDB97A;
        h.lllIlIIIl[164] = -(31 + 82 - 1 + 52) & (0xFFFF9FEF & 0xE7DFB);
        h.lllIlIIIl[165] = -(0xFFFFFFDB & 0x6366) & (0xFFFFFFF9 & 0x7BFF);
        h.lllIlIIIl[166] = -(0xFFFFC8B7 & 0x774F) & (0xFFFFFFFF & 0x2EB9E);
        h.lllIlIIIl[167] = -(0xFFFFA097 & 0x7F7B) & (0xFFFFF7BE & 0x2FAFB);
        h.lllIlIIIl[168] = -(0xFFFFBECF & 0x65F5) & (0xFFFFFFFE & 0x77F7);
        h.lllIlIIIl[169] = 0xFFFFBBFF & 0x5D7B;
        h.lllIlIIIl[170] = -(0xFFFFF79F & 0x18F5) & (0xFFFFFFFD & 0x8FDBE);
        h.lllIlIIIl[171] = -(0xFFFFE79B & 0x7CF7) & (0xFFFFFDFE & 0x9EFFB);
        h.lllIlIIIl[172] = -(0xFFFF969B & 0x6DE7) & (0xFFFF9DFE & Short.MAX_VALUE);
        h.lllIlIIIl[173] = -(0xFFFFAFDF & 0x7CE9) & (0xFFFFFFFD & Short.MAX_VALUE);
        h.lllIlIIIl[174] = 0xFFFFB67A & 0x166995;
        h.lllIlIIIl[175] = -(0xFFFFD1A7 & 0x6F7D) & (0xFFFFFFF5 & 0x16FD7E);
        h.lllIlIIIl[176] = 0xFFFFFF3F & 0x53F8;
        h.lllIlIIIl[177] = -(0xFFFFFB23 & 0x77DF) & (0xFFFFFFBB & 0x11FF76);
        h.lllIlIIIl[178] = 0xFFFF92FA & 0x137FD5;
        h.lllIlIIIl[179] = -(0xFFFFDCBF & 0x77C3) & (0xFFFFFFFA & Short.MAX_VALUE);
        h.lllIlIIIl[180] = -(0xFFFFDC33 & 0x73CF) & (0xFFFFF77A & 0x2D5BF7);
        h.lllIlIIIl[181] = 0xFFFFFFBE & 0x2E9DD9;
        h.lllIlIIIl[182] = -(0xFFFFFE51 & 0x67EF) & (0xFFFFFFED & 0x7FFA);
        h.lllIlIIIl[183] = -(0xFFFFCCFA & 0x7327) & (0xFFFFEFE1 & 0x7E7F);
        h.lllIlIIIl[184] = -(0xFFFFF3A2 & 0x2DFF) & (0xFFFFADBF & 0x77FB);
        h.lllIlIIIl[185] = 0xFFFF8573 & 0x7E9E;
        h.lllIlIIIl[186] = 0xFFFFACFE & 0x5717;
        h.lllIlIIIl[187] = 0xFFFFFCEF & 0x3BB4;
        h.lllIlIIIl[188] = 0xFFFFF6D4 & 0xD3F;
        h.lllIlIIIl[189] = 0xFFFFD70F & 0x2CFE;
        h.lllIlIIIl[190] = -(0xFFFFBEB7 & 0x7BEF) & (0xFFFFFEFF & 0x3FBE);
        h.lllIlIIIl[191] = 0xFFFFBD78 & 0x4697;
        h.lllIlIIIl[192] = -(0xFFFFFFE5 & 0x21BB) & (0xFFFFEDFD & 0x37BF);
        h.lllIlIIIl[193] = 0xFFFF9EF7 & 0x634B;
        h.lllIlIIIl[194] = 0xFFFFC3FF & 0x3FF9;
        h.lllIlIIIl[195] = -(0xFFFFDA73 & 0x75CF) & (0xFFFFFFDF & 0x57FF);
        h.lllIlIIIl[196] = -(0xFFFFD945 & 0x7FFB) & (0xFFFFDFFF & Short.MAX_VALUE);
        h.lllIlIIIl[197] = 0xFFFFAD6D & 0x57F7;
        h.lllIlIIIl[198] = 0xFFFFBB2D & 0x46F2;
        h.lllIlIIIl[199] = -(0xFFFFC77D & 0x399F) & (0xFFFFC37F & 0x3FDD);
        h.lllIlIIIl[200] = -(0xFFFFFEF5 & 0x593F) & (0xFFFFFFFF & 0x5C3F);
        h.lllIlIIIl[201] = 0xFFFFFF7E & 0x29F;
        h.lllIlIIIl[202] = 0xFFFFFDD9 & 0x62F;
        h.lllIlIIIl[203] = 143 + 66 - 78 + 34 ^ 45 + 114 - 76 + 99;
        h.lllIlIIIl[204] = 0x95 ^ 0x80;
        h.lllIlIIIl[205] = 115 + 84 - 50 + 18 ^ 84 + 10 - 46 + 129;
    }

    private static void U() {
        by.putAll(Map.of(lllIlIIIl[168], e.c(lllIlIIIl[163], lllIlIIIl[164])));
        bD.putAll(Map.of(lllIlIIIl[169], e.c(lllIlIIIl[170], lllIlIIIl[171])));
        bC.putAll(Map.of(lllIlIIIl[172], e.c(lllIlIIIl[152], lllIlIIIl[153])));
        bE.putAll(Map.of(lllIlIIIl[173], e.c(lllIlIIIl[174], lllIlIIIl[175])));
        bF.putAll(Map.of(lllIlIIIl[176], e.c(lllIlIIIl[177], lllIlIIIl[178])));
        bz.putAll(Map.of(lllIlIIIl[179], e.c(lllIlIIIl[180], lllIlIIIl[181])));
        bA.putAll(Map.of(lllIlIIIl[182], e.c(lllIlIIIl[163], lllIlIIIl[164])));
        bB.putAll(Map.of(lllIlIIIl[134], e.c(lllIlIIIl[131], lllIlIIIl[132])));
        bG.putAll(Map.of(lllIlIIIl[136], e.c(lllIlIIIl[137], lllIlIIIl[68])));
        bH.putAll(Map.of(lllIlIIIl[183], e.c(lllIlIIIl[166], lllIlIIIl[167])));
        bI.putAll(Map.of(lllIlIIIl[16], e.c(lllIlIIIl[145], lllIlIIIl[146])));
    }

    private static boolean llIIIlIllIll(Object object) {
        return object != null;
    }

    private static void T() {
        if (h.llIIIlIllIlI(Skills.getLevel((Skill)Skill.RANGED), lllIlIIIl[147])) {
            by.putAll(Map.of(lllIlIIIl[148], e.c(lllIlIIIl[149], lllIlIIIl[150])));
        }
        if (h.llIIIlIlllll(Skills.getLevel((Skill)Skill.RANGED), lllIlIIIl[147])) {
            by.putAll(Map.of(lllIlIIIl[148], e.c(lllIlIIIl[149], lllIlIIIl[150])));
        }
        bC.putAll(Map.of(lllIlIIIl[151], e.c(lllIlIIIl[152], lllIlIIIl[153])));
        if (h.llIIIlIllIlI(Skills.getLevel((Skill)Skill.RANGED), lllIlIIIl[79])) {
            bE.putAll(Map.of(lllIlIIIl[154], e.c(lllIlIIIl[131], lllIlIIIl[132])));
        }
        if (h.llIIIlIlllll(Skills.getLevel((Skill)Skill.RANGED), lllIlIIIl[79]) && h.llIIIlIllIlI(Skills.getLevel((Skill)Skill.RANGED), lllIlIIIl[147])) {
            bE.putAll(Map.of(lllIlIIIl[155], e.c(lllIlIIIl[131], lllIlIIIl[132])));
        }
        if (h.llIIIlIlllll(Skills.getLevel((Skill)Skill.RANGED), lllIlIIIl[147])) {
            bE.putAll(Map.of(lllIlIIIl[156], e.c(lllIlIIIl[131], lllIlIIIl[132])));
        }
        if (h.llIIIlIllIlI(Skills.getLevel((Skill)Skill.RANGED), lllIlIIIl[79])) {
            bF.putAll(Map.of(lllIlIIIl[157], e.c(lllIlIIIl[131], lllIlIIIl[132])));
        }
        if (h.llIIIlIlllll(Skills.getLevel((Skill)Skill.RANGED), lllIlIIIl[79]) && h.llIIIlIllIlI(Skills.getLevel((Skill)Skill.RANGED), lllIlIIIl[147])) {
            bF.putAll(Map.of(lllIlIIIl[158], e.c(lllIlIIIl[131], lllIlIIIl[132])));
        }
        if (h.llIIIlIlllll(Skills.getLevel((Skill)Skill.RANGED), lllIlIIIl[147])) {
            bF.putAll(Map.of(lllIlIIIl[159], e.c(lllIlIIIl[131], lllIlIIIl[132])));
        }
        bz.putAll(Map.of(lllIlIIIl[129], e.c(lllIlIIIl[160], lllIlIIIl[161])));
        bA.putAll(Map.of(lllIlIIIl[162], e.c(lllIlIIIl[163], lllIlIIIl[164])));
        if (h.llIIIlIllIlI(Skills.getLevel((Skill)Skill.RANGED), lllIlIIIl[147])) {
            bG.putAll(Map.of(lllIlIIIl[136], e.c(lllIlIIIl[137], lllIlIIIl[68])));
        }
        if (h.llIIIlIlllll(Skills.getLevel((Skill)Skill.RANGED), lllIlIIIl[147])) {
            bG.putAll(Map.of(lllIlIIIl[136], e.c(lllIlIIIl[137], lllIlIIIl[68])));
        }
        if (h.llIIIlIllIlI(Skills.getLevel((Skill)Skill.RANGED), lllIlIIIl[147])) {
            bH.putAll(Map.of(lllIlIIIl[165], e.c(lllIlIIIl[166], lllIlIIIl[167])));
        }
        if (h.llIIIlIlllll(Skills.getLevel((Skill)Skill.RANGED), lllIlIIIl[147])) {
            bH.putAll(Map.of(lllIlIIIl[165], e.c(lllIlIIIl[166], lllIlIIIl[167])));
        }
        bI.putAll(Map.of(lllIlIIIl[16], e.c(lllIlIIIl[145], lllIlIIIl[146])));
    }

    private static void llIIIlIlIllI() {
        lllIlIIII = new String[lllIlIIIl[205]];
        h.lllIlIIII[h.lllIlIIIl[0]] = h."f2pmelee";
        h.lllIlIIII[h.lllIlIIIl[1]] = h."f2pquest";
        h.lllIlIIII[h.lllIlIIIl[2]] = h."f2pmage";
        h.lllIlIIII[h.lllIlIIIl[3]] = h."mage";
        h.lllIlIIII[h.lllIlIIIl[4]] = h."quest";
        h.lllIlIIII[h.lllIlIIIl[5]] = h."questNoWep";
        h.lllIlIIII[h.lllIlIIIl[6]] = h."melee";
        h.lllIlIIII[h.lllIlIIIl[7]] = h."agility";
        h.lllIlIIII[h.lllIlIIIl[8]] = h."meleeNmz";
        h.lllIlIIII[h.lllIlIIIl[9]] = h."rangeNmz";
        h.lllIlIIII[h.lllIlIIIl[10]] = h."Randomized Equipment:";
        h.lllIlIIII[h.lllIlIIIl[11]] = h."Buying items";
        h.lllIlIIII[h.lllIlIIIl[12]] = h."Finished buying items, switching back to randomGearing";
        h.lllIlIIII[h.lllIlIIIl[13]] = h."Navigating to bank";
        h.lllIlIIII[h.lllIlIIIl[14]] = h."Handling banking";
        h.lllIlIIII[h.lllIlIIIl[19]] = h."We are missing random gear, switching to BUYING";
        h.lllIlIIII[h.lllIlIIIl[20]] = h."We are missing random gear, switching to BUYING";
        h.lllIlIIII[h.lllIlIIIl[21]] = h."We are missing random gear, switching to BUYING";
        h.lllIlIIII[h.lllIlIIIl[24]] = h."Finished gearing random";
        h.lllIlIIII[h.lllIlIIIl[203]] = h."Unexpected error occurred while getting a random key.";
        h.lllIlIIII[h.lllIlIIIl[46]] = h."Random gear lists CLEARED";
        h.lllIlIIII[h.lllIlIIIl[204]] = h."wealth";
    }

    private static void R() {
        if (h.llIIIlIllIlI(Skills.getLevel((Skill)Skill.DEFENCE), lllIlIIIl[5])) {
            by.putAll(Map.of(lllIlIIIl[25], e.c(lllIlIIIl[26], lllIlIIIl[27]), lllIlIIIl[28], e.c(lllIlIIIl[26], lllIlIIIl[27])));
            bD.putAll(Map.of(lllIlIIIl[29], e.c(lllIlIIIl[30], lllIlIIIl[31]), lllIlIIIl[32], e.c(lllIlIIIl[30], lllIlIIIl[31])));
            bC.putAll(Map.of(lllIlIIIl[33], e.c(lllIlIIIl[34], lllIlIIIl[35])));
            bE.putAll(Map.of(lllIlIIIl[36], e.c(lllIlIIIl[37], lllIlIIIl[38]), lllIlIIIl[39], e.c(lllIlIIIl[37], lllIlIIIl[38]), lllIlIIIl[40], e.c(lllIlIIIl[37], lllIlIIIl[38])));
            bF.putAll(Map.of(lllIlIIIl[41], e.c(lllIlIIIl[42], lllIlIIIl[43]), lllIlIIIl[44], e.c(lllIlIIIl[42], lllIlIIIl[43]), lllIlIIIl[45], e.c(lllIlIIIl[42], lllIlIIIl[43])));
        }
        if (h.llIIIlIlllll(Skills.getLevel((Skill)Skill.DEFENCE), lllIlIIIl[5]) && h.llIIIlIllIlI(Skills.getLevel((Skill)Skill.DEFENCE), lllIlIIIl[46])) {
            by.putAll(Map.of(lllIlIIIl[47], e.c(lllIlIIIl[26], lllIlIIIl[27])));
            bD.putAll(Map.of(lllIlIIIl[48], e.c(lllIlIIIl[26], lllIlIIIl[27]), lllIlIIIl[32], e.c(lllIlIIIl[30], lllIlIIIl[31])));
            bC.putAll(Map.of(lllIlIIIl[49], e.c(lllIlIIIl[34], lllIlIIIl[35])));
            bE.putAll(Map.of(lllIlIIIl[50], e.c(lllIlIIIl[37], lllIlIIIl[38]), lllIlIIIl[39], e.c(lllIlIIIl[37], lllIlIIIl[38])));
            bF.putAll(Map.of(lllIlIIIl[41], e.c(lllIlIIIl[42], lllIlIIIl[43]), lllIlIIIl[51], e.c(lllIlIIIl[42], lllIlIIIl[43])));
        }
        if (h.llIIIlIlllll(Skills.getLevel((Skill)Skill.DEFENCE), lllIlIIIl[46]) && h.llIIIlIllIlI(Skills.getLevel((Skill)Skill.DEFENCE), lllIlIIIl[52])) {
            by.putAll(Map.of(lllIlIIIl[53], e.c(lllIlIIIl[26], lllIlIIIl[27]), lllIlIIIl[47], e.c(lllIlIIIl[26], lllIlIIIl[27]), lllIlIIIl[54], e.c(lllIlIIIl[55], lllIlIIIl[56])));
            bD.putAll(Map.of(lllIlIIIl[57], e.c(lllIlIIIl[26], lllIlIIIl[27]), lllIlIIIl[48], e.c(lllIlIIIl[26], lllIlIIIl[27])));
            bC.putAll(Map.of(lllIlIIIl[58], e.c(lllIlIIIl[34], lllIlIIIl[35])));
            bE.putAll(Map.of(lllIlIIIl[50], e.c(lllIlIIIl[37], lllIlIIIl[38]), lllIlIIIl[59], e.c(lllIlIIIl[37], lllIlIIIl[38]), lllIlIIIl[60], e.c(lllIlIIIl[61], lllIlIIIl[62])));
            bF.putAll(Map.of(lllIlIIIl[63], e.c(lllIlIIIl[42], lllIlIIIl[43]), lllIlIIIl[51], e.c(lllIlIIIl[42], lllIlIIIl[43]), lllIlIIIl[64], e.c(lllIlIIIl[42], lllIlIIIl[43])));
        }
        if (h.llIIIlIlllll(Skills.getLevel((Skill)Skill.DEFENCE), lllIlIIIl[52]) && h.llIIIlIllIlI(Skills.getLevel((Skill)Skill.DEFENCE), lllIlIIIl[65])) {
            by.putAll(Map.of(lllIlIIIl[66], e.c(lllIlIIIl[26], lllIlIIIl[27]), lllIlIIIl[67], e.c(lllIlIIIl[55], lllIlIIIl[68])));
            bD.putAll(Map.of(lllIlIIIl[69], e.c(lllIlIIIl[26], lllIlIIIl[27]), lllIlIIIl[70], e.c(lllIlIIIl[55], lllIlIIIl[68]), lllIlIIIl[57], e.c(lllIlIIIl[26], lllIlIIIl[27])));
            bC.putAll(Map.of(lllIlIIIl[71], e.c(lllIlIIIl[34], lllIlIIIl[35])));
            bE.putAll(Map.of(lllIlIIIl[72], e.c(lllIlIIIl[37], lllIlIIIl[38]), lllIlIIIl[59], e.c(lllIlIIIl[37], lllIlIIIl[38]), lllIlIIIl[73], e.c(lllIlIIIl[74], lllIlIIIl[75]), lllIlIIIl[76], e.c(lllIlIIIl[74], lllIlIIIl[75])));
            bF.putAll(Map.of(lllIlIIIl[63], e.c(lllIlIIIl[42], lllIlIIIl[43]), lllIlIIIl[77], e.c(lllIlIIIl[42], lllIlIIIl[43]), lllIlIIIl[78], e.c(lllIlIIIl[42], lllIlIIIl[43])));
        }
        if (h.llIIIlIlllll(Skills.getLevel((Skill)Skill.DEFENCE), lllIlIIIl[65]) && h.llIIIlIllIlI(Skills.getLevel((Skill)Skill.DEFENCE), lllIlIIIl[79])) {
            by.putAll(Map.of(lllIlIIIl[66], e.c(lllIlIIIl[26], lllIlIIIl[27]), lllIlIIIl[80], e.c(lllIlIIIl[55], lllIlIIIl[68]), lllIlIIIl[81], e.c(lllIlIIIl[82], lllIlIIIl[83])));
            bD.putAll(Map.of(lllIlIIIl[69], e.c(lllIlIIIl[26], lllIlIIIl[27]), lllIlIIIl[84], e.c(lllIlIIIl[55], lllIlIIIl[68]), lllIlIIIl[85], e.c(lllIlIIIl[82], lllIlIIIl[83]), lllIlIIIl[86], e.c(lllIlIIIl[82], lllIlIIIl[83]), lllIlIIIl[87], e.c(lllIlIIIl[82], lllIlIIIl[83]), lllIlIIIl[88], e.c(lllIlIIIl[82], lllIlIIIl[83])));
            bC.putAll(Map.of(lllIlIIIl[89], e.c(lllIlIIIl[90], lllIlIIIl[91])));
            bE.putAll(Map.of(lllIlIIIl[72], e.c(lllIlIIIl[37], lllIlIIIl[38]), lllIlIIIl[92], e.c(lllIlIIIl[74], lllIlIIIl[75]), lllIlIIIl[73], e.c(lllIlIIIl[74], lllIlIIIl[75])));
            bF.putAll(Map.of(lllIlIIIl[93], e.c(lllIlIIIl[94], lllIlIIIl[95]), lllIlIIIl[96], e.c(lllIlIIIl[94], lllIlIIIl[95])));
        }
        bz.putAll(Map.of(lllIlIIIl[97], e.c(lllIlIIIl[98], lllIlIIIl[42]), lllIlIIIl[99], e.c(lllIlIIIl[98], lllIlIIIl[42]), lllIlIIIl[100], e.c(lllIlIIIl[101], lllIlIIIl[102]), lllIlIIIl[103], e.c(lllIlIIIl[98], lllIlIIIl[42])));
        bA.putAll(Map.of(lllIlIIIl[104], e.c(lllIlIIIl[105], lllIlIIIl[106]), lllIlIIIl[107], e.c(lllIlIIIl[105], lllIlIIIl[106]), lllIlIIIl[108], e.c(lllIlIIIl[105], lllIlIIIl[106]), lllIlIIIl[109], e.c(lllIlIIIl[105], lllIlIIIl[106]), lllIlIIIl[110], e.c(lllIlIIIl[105], lllIlIIIl[106])));
        bB.putAll(Map.of(lllIlIIIl[111], e.c(lllIlIIIl[112], lllIlIIIl[113])));
        bG.putAll(Map.of(lllIlIIIl[114], e.c(lllIlIIIl[115], lllIlIIIl[116]), lllIlIIIl[117], e.c(lllIlIIIl[115], lllIlIIIl[116]), lllIlIIIl[118], e.c(lllIlIIIl[115], lllIlIIIl[116])));
        bH.putAll(Map.of(lllIlIIIl[119], e.c(lllIlIIIl[115], lllIlIIIl[116]), lllIlIIIl[120], e.c(lllIlIIIl[115], lllIlIIIl[116]), lllIlIIIl[121], e.c(lllIlIIIl[115], lllIlIIIl[116]), lllIlIIIl[122], e.c(lllIlIIIl[115], lllIlIIIl[116])));
        bI.putAll(Map.of(lllIlIIIl[123], e.c(lllIlIIIl[115], lllIlIIIl[116]), lllIlIIIl[124], e.c(lllIlIIIl[115], lllIlIIIl[116]), lllIlIIIl[125], e.c(lllIlIIIl[115], lllIlIIIl[116]), lllIlIIIl[126], e.c(lllIlIIIl[115], lllIlIIIl[116])));
    }

    private static boolean llIIIlIlllIl(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    private static int a(Map<Integer, Integer> map, Random random) {
        Map<Integer, Integer> lllIIIlllIIll;
        void lllIIIlllIIlI;
        if (h.llIIIlIllIII(map.isEmpty() ? 1 : 0)) {
            return lllIlIIIl[0];
        }
        int lllIIIlllIIIl = lllIIIlllIIlI.nextInt(lllIIIlllIIll.size());
        int lllIIIlllIIII = lllIlIIIl[0];
        Iterator<Integer> lllIIIllIllll = lllIIIlllIIll.keySet().iterator();
        while (h.llIIIlIllIII(lllIIIllIllll.hasNext() ? 1 : 0)) {
            int lllIIIllIlllI = lllIIIllIllll.next();
            if (h.llIIIlIlllIl(lllIIIlllIIII, lllIIIlllIIIl)) {
                return lllIIIllIlllI;
            }
            ++lllIIIlllIIII;
            0;
            if (2 >= ((8 ^ 0x46) & ~(0x74 ^ 0x3A))) continue;
            return (0x39 ^ 0x79) & ~(0 ^ 0x40);
        }
        throw new IllegalStateException(lllIlIIII[lllIlIIIl[203]]);
    }

    private static boolean llIIIlIlllll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIIIlIlllII(int n2) {
        return n2 > 0;
    }

    private static String llIIIlIlIlIl(String lllIIIlIIllII, String lllIIIlIIlIll) {
        try {
            SecretKeySpec lllIIIlIIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIIIlIIlIll.getBytes(StandardCharsets.UTF_8)), lllIlIIIl[8]), "DES");
            Cipher lllIIIlIIlllI = Cipher.getInstance("DES");
            lllIIIlIIlllI.init(lllIlIIIl[2], lllIIIlIIllll);
            return new String(lllIIIlIIlllI.doFinal(Base64.getDecoder().decode(lllIIIlIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIIIlIIllIl) {
            lllIIIlIIllIl.printStackTrace();
            return null;
        }
    }

    private static String llIIIlIlIIll(String lllIIIIllllIl, String lllIIIIllllII) {
        try {
            SecretKeySpec lllIIIlIIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIIIIllllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllIIIlIIIIIl = Cipher.getInstance("Blowfish");
            lllIIIlIIIIIl.init(lllIlIIIl[2], lllIIIlIIIIlI);
            return new String(lllIIIlIIIIIl.doFinal(Base64.getDecoder().decode(lllIIIIllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIIIlIIIIII) {
            lllIIIlIIIIII.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIlIllllI(int n2, int n3) {
        return n2 != n3;
    }

    private static String llIIIlIlIlII(String lllIIIlIlllII, String lllIIIllIIIII) {
        lllIIIlIlllII = new String(Base64.getDecoder().decode(lllIIIlIlllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllIIIlIlllll = new StringBuilder();
        char[] lllIIIlIllllI = lllIIIllIIIII.toCharArray();
        int lllIIIlIlllIl = lllIlIIIl[0];
        char[] lllIIIlIlIlll = lllIIIlIlllII.toCharArray();
        int lllIIIlIlIllI = lllIIIlIlIlll.length;
        int lllIIIlIlIlIl = lllIlIIIl[0];
        while (h.llIIIlIllIlI(lllIIIlIlIlIl, lllIIIlIlIllI)) {
            char lllIIIllIIIlI = lllIIIlIlIlll[lllIIIlIlIlIl];
            lllIIIlIlllll.append((char)(lllIIIllIIIlI ^ lllIIIlIllllI[lllIIIlIlllIl % lllIIIlIllllI.length]));
            0;
            ++lllIIIlIlllIl;
            ++lllIIIlIlIlIl;
            0;
            if (((0xB2 ^ 0x93) & ~(0xA9 ^ 0x88)) < 3) continue;
            return null;
        }
        return String.valueOf(lllIIIlIlllll);
    }

    public static void d(String string) {
        if (!h.llIIIlIllIII(bJ) || h.llIIIlIllIIl(bP)) {
            String lllIIlIIIIlII;
            if (h.llIIIlIllIII(lllIIlIIIIlII.equalsIgnoreCase(lllIlIIII[lllIlIIIl[0]]) ? 1 : 0)) {
                h.R();
            }
            if (h.llIIIlIllIII(lllIIlIIIIlII.equalsIgnoreCase(lllIlIIII[lllIlIIIl[1]]) ? 1 : 0)) {
                // empty if block
            }
            if (h.llIIIlIllIII(lllIIlIIIIlII.equalsIgnoreCase(lllIlIIII[lllIlIIIl[2]]) ? 1 : 0)) {
                h.V();
            }
            if (h.llIIIlIllIII(lllIIlIIIIlII.equalsIgnoreCase(lllIlIIII[lllIlIIIl[3]]) ? 1 : 0)) {
                // empty if block
            }
            if (h.llIIIlIllIII(lllIIlIIIIlII.equalsIgnoreCase(lllIlIIII[lllIlIIIl[4]]) ? 1 : 0)) {
                // empty if block
            }
            if (h.llIIIlIllIII(lllIIlIIIIlII.equalsIgnoreCase(lllIlIIII[lllIlIIIl[5]]) ? 1 : 0)) {
                // empty if block
            }
            if (h.llIIIlIllIII(lllIIlIIIIlII.equalsIgnoreCase(lllIlIIII[lllIlIIIl[6]]) ? 1 : 0)) {
                h.S();
            }
            if (h.llIIIlIllIII(lllIIlIIIIlII.equalsIgnoreCase(lllIlIIII[lllIlIIIl[7]]) ? 1 : 0)) {
                // empty if block
            }
            if (h.llIIIlIllIII(lllIIlIIIIlII.equalsIgnoreCase(lllIlIIII[lllIlIIIl[8]]) ? 1 : 0)) {
                h.U();
            }
            if (h.llIIIlIllIII(lllIIlIIIIlII.equalsIgnoreCase(lllIlIIII[lllIlIIIl[9]]) ? 1 : 0)) {
                h.T();
            }
            h.W();
            System.out.println(lllIlIIII[lllIlIIIl[10]]);
            System.out.println("Helm: " + bJ + ", Price: " + bU);
            System.out.println("Amulet: " + bK + ", Price: " + bV);
            System.out.println("Cape: " + bL + ", Price: " + bW);
            System.out.println("Ammo: " + bM + ", Price: " + bX);
            System.out.println("Weapon: " + bN + ", Price: " + bY);
            System.out.println("Shield: " + bO + ", Price: " + bZ);
            System.out.println("Body: " + bP + ", Price: " + ca);
            System.out.println("Legs: " + bQ + ", Price: " + cb);
            System.out.println("Gloves: " + bR + ", Price: " + cc);
            System.out.println("Boots: " + bS + ", Price: " + cd);
            System.out.println("Ring: " + bT + ", Price: " + ce);
        }
        if (h.llIIIlIllIII(bJ) && h.llIIIlIllIII(bP)) {
            if (h.llIIIlIllIII(bv ? 1 : 0)) {
                AccBuilderGWD.c = lllIlIIII[lllIlIIIl[11]];
                b.a(bx);
                if (h.llIIIlIllIlI(bx.size(), lllIlIIIl[1])) {
                    System.out.println(lllIlIIII[lllIlIIIl[12]]);
                    bv = lllIlIIIl[0];
                }
            }
            if (h.llIIIlIllIIl(bv ? 1 : 0)) {
                BankLocation lllIIlIIIIIll = BankLocation.getNearest();
                if (h.llIIIlIllIll(lllIIlIIIIIll) && h.llIIIlIllIIl(lllIIlIIIIIll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = lllIlIIII[lllIlIIIl[13]];
                    a.a(lllIIlIIIIIll);
                }
                if (h.llIIIlIllIll(lllIIlIIIIIll) && h.llIIIlIllIII(lllIIlIIIIIll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = lllIlIIII[lllIlIIIl[14]];
                    if (h.llIIIlIllIIl(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lllIlIIIl[15]);
                        0;
                    }
                    if (h.llIIIlIllIII(Bank.isOpen() ? 1 : 0)) {
                        if (h.llIIIlIlllII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lllIlIIIl[4]);
                            0;
                        }
                        if (h.llIIIlIlllII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lllIlIIIl[2]);
                            0;
                        }
                        if (h.llIIIlIlllIl(bT, lllIlIIIl[16])) {
                            int[] nArray = new int[lllIlIIIl[1]];
                            nArray[h.lllIlIIIl[0]] = lllIlIIIl[17];
                            if (h.llIIIlIllIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray2 = new int[lllIlIIIl[1]];
                                nArray2[h.lllIlIIIl[0]] = lllIlIIIl[16];
                                if (h.llIIIlIllIIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                                    int[] nArray3 = new int[lllIlIIIl[1]];
                                    nArray3[h.lllIlIIIl[0]] = lllIlIIIl[18];
                                    if (h.llIIIlIllIIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                        h.Q();
                                        System.out.println(lllIlIIII[lllIlIIIl[19]]);
                                        bv = lllIlIIIl[1];
                                        return;
                                    }
                                }
                            }
                            int[] nArray4 = new int[lllIlIIIl[10]];
                            nArray4[h.lllIlIIIl[0]] = bJ;
                            nArray4[h.lllIlIIIl[1]] = bK;
                            nArray4[h.lllIlIIIl[2]] = bL;
                            nArray4[h.lllIlIIIl[3]] = bM;
                            nArray4[h.lllIlIIIl[4]] = bN;
                            nArray4[h.lllIlIIIl[5]] = bO;
                            nArray4[h.lllIlIIIl[6]] = bP;
                            nArray4[h.lllIlIIIl[7]] = bQ;
                            nArray4[h.lllIlIIIl[8]] = bR;
                            nArray4[h.lllIlIIIl[9]] = bS;
                            if (h.llIIIlIllIIl(h.d(nArray4) ? 1 : 0)) {
                                h.Q();
                                System.out.println(lllIlIIII[lllIlIIIl[20]]);
                                bv = lllIlIIIl[1];
                                return;
                            }
                        }
                        if (h.llIIIlIllllI(bT, lllIlIIIl[16])) {
                            int[] nArray = new int[lllIlIIIl[11]];
                            nArray[h.lllIlIIIl[0]] = bJ;
                            nArray[h.lllIlIIIl[1]] = bK;
                            nArray[h.lllIlIIIl[2]] = bL;
                            nArray[h.lllIlIIIl[3]] = bM;
                            nArray[h.lllIlIIIl[4]] = bN;
                            nArray[h.lllIlIIIl[5]] = bO;
                            nArray[h.lllIlIIIl[6]] = bP;
                            nArray[h.lllIlIIIl[7]] = bQ;
                            nArray[h.lllIlIIIl[8]] = bR;
                            nArray[h.lllIlIIIl[9]] = bS;
                            nArray[h.lllIlIIIl[10]] = bT;
                            if (h.llIIIlIllIIl(h.d(nArray) ? 1 : 0)) {
                                h.Q();
                                System.out.println(lllIlIIII[lllIlIIIl[21]]);
                                bv = lllIlIIIl[1];
                                return;
                            }
                        }
                        if (h.llIIIlIllIII(h.n(bT) ? 1 : 0)) {
                            int[] nArray = new int[lllIlIIIl[11]];
                            nArray[h.lllIlIIIl[0]] = bJ;
                            nArray[h.lllIlIIIl[1]] = bK;
                            nArray[h.lllIlIIIl[2]] = bL;
                            nArray[h.lllIlIIIl[3]] = bM;
                            nArray[h.lllIlIIIl[4]] = bN;
                            nArray[h.lllIlIIIl[5]] = bO;
                            nArray[h.lllIlIIIl[6]] = bP;
                            nArray[h.lllIlIIIl[7]] = bQ;
                            nArray[h.lllIlIIIl[8]] = bR;
                            nArray[h.lllIlIIIl[9]] = bS;
                            nArray[h.lllIlIIIl[10]] = bT;
                            int[] lllIIlIIIIIlI = nArray;
                            if (h.llIIIlIlllIl(bT, lllIlIIIl[16])) {
                                int[] nArray5 = new int[lllIlIIIl[1]];
                                nArray5[h.lllIlIIIl[0]] = lllIlIIIl[16];
                                if (h.llIIIlIllIIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                    int[] nArray6 = new int[lllIlIIIl[1]];
                                    nArray6[h.lllIlIIIl[0]] = lllIlIIIl[17];
                                    if (h.llIIIlIllIII(Bank.contains((int[])nArray6) ? 1 : 0)) {
                                        a.a(lllIlIIIl[17], lllIlIIIl[1]);
                                    }
                                }
                                int[] nArray7 = new int[lllIlIIIl[1]];
                                nArray7[h.lllIlIIIl[0]] = lllIlIIIl[16];
                                if (h.llIIIlIllIIl(Bank.contains((int[])nArray7) ? 1 : 0)) {
                                    int[] nArray8 = new int[lllIlIIIl[1]];
                                    nArray8[h.lllIlIIIl[0]] = lllIlIIIl[17];
                                    if (h.llIIIlIllIIl(Bank.contains((int[])nArray8) ? 1 : 0)) {
                                        int[] nArray9 = new int[lllIlIIIl[1]];
                                        nArray9[h.lllIlIIIl[0]] = lllIlIIIl[17];
                                        if (h.llIIIlIllIIl(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                                            int[] nArray10 = new int[lllIlIIIl[1]];
                                            nArray10[h.lllIlIIIl[0]] = lllIlIIIl[18];
                                            if (h.llIIIlIllIII(Bank.contains((int[])nArray10) ? 1 : 0)) {
                                                a.a(lllIlIIIl[18], lllIlIIIl[1]);
                                            }
                                        }
                                    }
                                }
                            }
                            a.a(lllIIlIIIIIlI, lllIlIIIl[1]);
                            Time.sleepTicks((int)e.c(lllIlIIIl[10], lllIlIIIl[14]));
                            0;
                            if (h.llIIIlIllIII(Bank.isOpen() ? 1 : 0)) {
                                Bank.close();
                                Time.sleepTicks((int)e.c(lllIlIIIl[3], lllIlIIIl[5]));
                                0;
                            }
                            while (!h.llIIIlIllIIl(Inventory.contains((int[])lllIIlIIIIIlI) ? 1 : 0) || h.llIIIlIllIII(Inventory.contains(item -> {
                                int n2;
                                if (h.llIIIlIllIII(item.getName().contains(lllIlIIII[lllIlIIIl[204]]) ? 1 : 0) && h.llIIIlIllIIl(item.isNoted() ? 1 : 0)) {
                                    n2 = lllIlIIIl[1];
                                    0;
                                    if (1 <= 0) {
                                        return false;
                                    }
                                } else {
                                    n2 = lllIlIIIl[0];
                                }
                                return n2 != 0;
                            }) ? 1 : 0)) {
                                e.l(bJ);
                                e.l(bK);
                                e.l(bL);
                                e.l(bM);
                                Time.sleepTicks((int)lllIlIIIl[1]);
                                0;
                                e.l(bN);
                                e.l(bO);
                                e.l(bP);
                                Time.sleepTicks((int)lllIlIIIl[1]);
                                0;
                                e.l(bQ);
                                e.l(bR);
                                e.l(bS);
                                e.l(bT);
                                Time.sleepTicks((int)lllIlIIIl[1]);
                                0;
                                e.l(lllIlIIIl[16]);
                                e.l(lllIlIIIl[17]);
                                e.l(lllIlIIIl[18]);
                                e.l(lllIlIIIl[22]);
                                e.l(lllIlIIIl[23]);
                                0;
                                if (((0x97 ^ 0xAB) & ~(0x5E ^ 0x62)) == ((0xFA ^ 0xAD) & ~(0x6F ^ 0x38))) continue;
                                return;
                            }
                            if (h.llIIIlIllIIl(Bank.isOpen() ? 1 : 0)) {
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)lllIlIIIl[15]);
                                0;
                                Time.sleepTicks((int)lllIlIIIl[4]);
                                0;
                                System.out.println(lllIlIIII[lllIlIIIl[24]]);
                                bw = lllIlIIIl[1];
                            }
                        }
                    }
                }
            }
        }
    }

    public static boolean d(int[] nArray) {
        int[] lllIIIlllllll;
        int lllIIIllllllI = lllIlIIIl[0];
        while (h.llIIIlIllIlI(lllIIIllllllI, lllIIIlllllll.length)) {
            if (h.llIIIlIlllII(lllIIIlllllll[lllIIIllllllI])) {
                int[] nArray2 = new int[lllIlIIIl[1]];
                nArray2[h.lllIlIIIl[0]] = lllIIIlllllll[lllIIIllllllI];
                if (h.llIIIlIllIIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    System.out.println("Missing ID: " + lllIIIlllllll[lllIIIllllllI]);
                    return lllIlIIIl[0];
                }
            }
            ++lllIIIllllllI;
            0;
            if (-1 <= (0x1F ^ 0x58 ^ (0xCC ^ 0x8F))) continue;
            return ((0x87 ^ 0xB0 ^ (0x4B ^ 0x50)) & (119 + 8 - 60 + 115 ^ 48 + 2 - 2 + 106 ^ -1)) != 0;
        }
        return lllIlIIIl[1];
    }

    private static void S() {
        if (h.llIIIlIllIlI(Skills.getLevel((Skill)Skill.DEFENCE), lllIlIIIl[5])) {
            by.putAll(Map.of(lllIlIIIl[25], e.c(lllIlIIIl[26], lllIlIIIl[27])));
            bD.putAll(Map.of(lllIlIIIl[29], e.c(lllIlIIIl[30], lllIlIIIl[31]), lllIlIIIl[32], e.c(lllIlIIIl[30], lllIlIIIl[31])));
            bC.putAll(Map.of(lllIlIIIl[33], e.c(lllIlIIIl[34], lllIlIIIl[35])));
            bE.putAll(Map.of(lllIlIIIl[36], e.c(lllIlIIIl[37], lllIlIIIl[38]), lllIlIIIl[39], e.c(lllIlIIIl[37], lllIlIIIl[38]), lllIlIIIl[40], e.c(lllIlIIIl[37], lllIlIIIl[38])));
            bF.putAll(Map.of(lllIlIIIl[41], e.c(lllIlIIIl[42], lllIlIIIl[43]), lllIlIIIl[44], e.c(lllIlIIIl[42], lllIlIIIl[43]), lllIlIIIl[45], e.c(lllIlIIIl[42], lllIlIIIl[43])));
        }
        if (h.llIIIlIlllll(Skills.getLevel((Skill)Skill.DEFENCE), lllIlIIIl[5]) && h.llIIIlIllIlI(Skills.getLevel((Skill)Skill.DEFENCE), lllIlIIIl[46])) {
            by.putAll(Map.of(lllIlIIIl[47], e.c(lllIlIIIl[26], lllIlIIIl[27])));
            bD.putAll(Map.of(lllIlIIIl[48], e.c(lllIlIIIl[26], lllIlIIIl[27]), lllIlIIIl[32], e.c(lllIlIIIl[30], lllIlIIIl[31])));
            bC.putAll(Map.of(lllIlIIIl[49], e.c(lllIlIIIl[34], lllIlIIIl[35])));
            bE.putAll(Map.of(lllIlIIIl[50], e.c(lllIlIIIl[37], lllIlIIIl[38]), lllIlIIIl[39], e.c(lllIlIIIl[37], lllIlIIIl[38])));
            bF.putAll(Map.of(lllIlIIIl[41], e.c(lllIlIIIl[42], lllIlIIIl[43]), lllIlIIIl[51], e.c(lllIlIIIl[42], lllIlIIIl[43])));
        }
        if (h.llIIIlIlllll(Skills.getLevel((Skill)Skill.DEFENCE), lllIlIIIl[46]) && h.llIIIlIllIlI(Skills.getLevel((Skill)Skill.DEFENCE), lllIlIIIl[52])) {
            by.putAll(Map.of(lllIlIIIl[53], e.c(lllIlIIIl[26], lllIlIIIl[27]), lllIlIIIl[47], e.c(lllIlIIIl[26], lllIlIIIl[27]), lllIlIIIl[54], e.c(lllIlIIIl[55], lllIlIIIl[56])));
            bD.putAll(Map.of(lllIlIIIl[57], e.c(lllIlIIIl[26], lllIlIIIl[27]), lllIlIIIl[48], e.c(lllIlIIIl[26], lllIlIIIl[27]), lllIlIIIl[127], e.c(lllIlIIIl[55], lllIlIIIl[56])));
            bC.putAll(Map.of(lllIlIIIl[58], e.c(lllIlIIIl[34], lllIlIIIl[35])));
            bE.putAll(Map.of(lllIlIIIl[50], e.c(lllIlIIIl[37], lllIlIIIl[38]), lllIlIIIl[59], e.c(lllIlIIIl[37], lllIlIIIl[38]), lllIlIIIl[60], e.c(lllIlIIIl[61], lllIlIIIl[62])));
            bF.putAll(Map.of(lllIlIIIl[63], e.c(lllIlIIIl[42], lllIlIIIl[43]), lllIlIIIl[51], e.c(lllIlIIIl[42], lllIlIIIl[43]), lllIlIIIl[64], e.c(lllIlIIIl[42], lllIlIIIl[43])));
        }
        if (h.llIIIlIlllll(Skills.getLevel((Skill)Skill.DEFENCE), lllIlIIIl[52]) && h.llIIIlIllIlI(Skills.getLevel((Skill)Skill.DEFENCE), lllIlIIIl[65])) {
            by.putAll(Map.of(lllIlIIIl[66], e.c(lllIlIIIl[26], lllIlIIIl[27]), lllIlIIIl[67], e.c(lllIlIIIl[55], lllIlIIIl[68])));
            bD.putAll(Map.of(lllIlIIIl[69], e.c(lllIlIIIl[26], lllIlIIIl[27]), lllIlIIIl[70], e.c(lllIlIIIl[55], lllIlIIIl[68]), lllIlIIIl[57], e.c(lllIlIIIl[26], lllIlIIIl[27])));
            bC.putAll(Map.of(lllIlIIIl[71], e.c(lllIlIIIl[34], lllIlIIIl[35])));
            bE.putAll(Map.of(lllIlIIIl[72], e.c(lllIlIIIl[37], lllIlIIIl[38]), lllIlIIIl[59], e.c(lllIlIIIl[37], lllIlIIIl[38]), lllIlIIIl[73], e.c(lllIlIIIl[74], lllIlIIIl[75]), lllIlIIIl[76], e.c(lllIlIIIl[74], lllIlIIIl[75])));
            bF.putAll(Map.of(lllIlIIIl[63], e.c(lllIlIIIl[42], lllIlIIIl[43]), lllIlIIIl[77], e.c(lllIlIIIl[42], lllIlIIIl[43]), lllIlIIIl[78], e.c(lllIlIIIl[42], lllIlIIIl[43])));
        }
        if (h.llIIIlIlllll(Skills.getLevel((Skill)Skill.DEFENCE), lllIlIIIl[65]) && h.llIIIlIllIlI(Skills.getLevel((Skill)Skill.DEFENCE), lllIlIIIl[79])) {
            by.putAll(Map.of(lllIlIIIl[66], e.c(lllIlIIIl[26], lllIlIIIl[27]), lllIlIIIl[80], e.c(lllIlIIIl[55], lllIlIIIl[68]), lllIlIIIl[128], e.c(lllIlIIIl[82], lllIlIIIl[83])));
            bD.putAll(Map.of(lllIlIIIl[69], e.c(lllIlIIIl[26], lllIlIIIl[27]), lllIlIIIl[84], e.c(lllIlIIIl[55], lllIlIIIl[68]), lllIlIIIl[85], e.c(lllIlIIIl[82], lllIlIIIl[83])));
            bC.putAll(Map.of(lllIlIIIl[89], e.c(lllIlIIIl[90], lllIlIIIl[91])));
            bE.putAll(Map.of(lllIlIIIl[72], e.c(lllIlIIIl[37], lllIlIIIl[38]), lllIlIIIl[92], e.c(lllIlIIIl[74], lllIlIIIl[75]), lllIlIIIl[73], e.c(lllIlIIIl[74], lllIlIIIl[75]), lllIlIIIl[76], e.c(lllIlIIIl[74], lllIlIIIl[75])));
            bF.putAll(Map.of(lllIlIIIl[93], e.c(lllIlIIIl[42], lllIlIIIl[43]), lllIlIIIl[77], e.c(lllIlIIIl[42], lllIlIIIl[43]), lllIlIIIl[96], e.c(lllIlIIIl[94], lllIlIIIl[95])));
        }
        bz.putAll(Map.of(lllIlIIIl[129], e.c(lllIlIIIl[98], lllIlIIIl[42]), lllIlIIIl[97], e.c(lllIlIIIl[98], lllIlIIIl[42]), lllIlIIIl[99], e.c(lllIlIIIl[98], lllIlIIIl[42]), lllIlIIIl[100], e.c(lllIlIIIl[101], lllIlIIIl[102]), lllIlIIIl[103], e.c(lllIlIIIl[98], lllIlIIIl[42])));
        bA.putAll(Map.of(lllIlIIIl[104], e.c(lllIlIIIl[105], lllIlIIIl[106]), lllIlIIIl[107], e.c(lllIlIIIl[105], lllIlIIIl[106]), lllIlIIIl[108], e.c(lllIlIIIl[105], lllIlIIIl[106]), lllIlIIIl[109], e.c(lllIlIIIl[105], lllIlIIIl[106]), lllIlIIIl[110], e.c(lllIlIIIl[105], lllIlIIIl[106])));
        bB.putAll(Map.of(lllIlIIIl[130], e.c(lllIlIIIl[131], lllIlIIIl[132]), lllIlIIIl[133], e.c(lllIlIIIl[131], lllIlIIIl[132]), lllIlIIIl[134], e.c(lllIlIIIl[131], lllIlIIIl[132]), lllIlIIIl[135], e.c(lllIlIIIl[131], lllIlIIIl[132])));
        bG.putAll(Map.of(lllIlIIIl[136], e.c(lllIlIIIl[137], lllIlIIIl[68])));
        bH.putAll(Map.of(lllIlIIIl[119], e.c(lllIlIIIl[115], lllIlIIIl[116]), lllIlIIIl[138], e.c(lllIlIIIl[115], lllIlIIIl[116]), lllIlIIIl[139], e.c(lllIlIIIl[115], lllIlIIIl[116]), lllIlIIIl[140], e.c(lllIlIIIl[115], lllIlIIIl[116]), lllIlIIIl[141], e.c(lllIlIIIl[115], lllIlIIIl[116])));
        if (h.llIIIlIlllll(Skills.getLevel((Skill)Skill.DEFENCE), lllIlIIIl[5]) && h.llIIIlIllIlI(Skills.getLevel((Skill)Skill.DEFENCE), lllIlIIIl[46])) {
            bH.putAll(Map.of(lllIlIIIl[142], e.c(lllIlIIIl[115], lllIlIIIl[116])));
        }
        if (h.llIIIlIlllll(Skills.getLevel((Skill)Skill.DEFENCE), lllIlIIIl[46]) && h.llIIIlIllIlI(Skills.getLevel((Skill)Skill.DEFENCE), lllIlIIIl[52])) {
            bH.putAll(Map.of(lllIlIIIl[143], e.c(lllIlIIIl[115], lllIlIIIl[116])));
        }
        if (h.llIIIlIlllll(Skills.getLevel((Skill)Skill.DEFENCE), lllIlIIIl[65]) && h.llIIIlIllIlI(Skills.getLevel((Skill)Skill.DEFENCE), lllIlIIIl[79])) {
            bH.putAll(Map.of(lllIlIIIl[144], e.c(lllIlIIIl[115], lllIlIIIl[116])));
        }
        bI.putAll(Map.of(lllIlIIIl[16], e.c(lllIlIIIl[145], lllIlIIIl[146])));
    }

    static {
        h.llIIIlIlIlll();
        h.llIIIlIlIllI();
        bx = new ArrayList<d>();
        by = new HashMap<Integer, Integer>();
        bz = new HashMap<Integer, Integer>();
        bA = new HashMap<Integer, Integer>();
        bB = new HashMap<Integer, Integer>();
        bC = new HashMap<Integer, Integer>();
        bD = new HashMap<Integer, Integer>();
        bE = new HashMap<Integer, Integer>();
        bF = new HashMap<Integer, Integer>();
        bG = new HashMap<Integer, Integer>();
        bH = new HashMap<Integer, Integer>();
        bI = new HashMap<Integer, Integer>();
    }

    private static void V() {
        by.putAll(Map.of(lllIlIIIl[184], e.c(lllIlIIIl[26], lllIlIIIl[27]), lllIlIIIl[185], e.c(lllIlIIIl[26], lllIlIIIl[27]), lllIlIIIl[186], e.c(lllIlIIIl[187], lllIlIIIl[98]), lllIlIIIl[188], e.c(lllIlIIIl[187], lllIlIIIl[98]), lllIlIIIl[189], e.c(lllIlIIIl[187], lllIlIIIl[98]), lllIlIIIl[190], e.c(lllIlIIIl[187], lllIlIIIl[98]), lllIlIIIl[191], e.c(lllIlIIIl[187], lllIlIIIl[98]), lllIlIIIl[192], e.c(lllIlIIIl[115], lllIlIIIl[146]), lllIlIIIl[193], e.c(lllIlIIIl[26], lllIlIIIl[27])));
        by.putAll(Map.of(lllIlIIIl[25], e.c(lllIlIIIl[187], lllIlIIIl[98]), lllIlIIIl[194], e.c(lllIlIIIl[187], lllIlIIIl[98]), lllIlIIIl[195], e.c(lllIlIIIl[187], lllIlIIIl[98])));
        bz.putAll(Map.of(lllIlIIIl[97], e.c(lllIlIIIl[98], lllIlIIIl[42]), lllIlIIIl[99], e.c(lllIlIIIl[98], lllIlIIIl[42]), lllIlIIIl[196], e.c(lllIlIIIl[98], lllIlIIIl[42])));
        bA.putAll(Map.of(lllIlIIIl[104], e.c(lllIlIIIl[105], lllIlIIIl[106]), lllIlIIIl[107], e.c(lllIlIIIl[105], lllIlIIIl[106]), lllIlIIIl[108], e.c(lllIlIIIl[105], lllIlIIIl[106]), lllIlIIIl[109], e.c(lllIlIIIl[105], lllIlIIIl[106]), lllIlIIIl[110], e.c(lllIlIIIl[105], lllIlIIIl[106])));
        bB.putAll(Map.of());
        bC.putAll(Map.of(lllIlIIIl[197], e.c(lllIlIIIl[34], lllIlIIIl[35])));
        bE.putAll(Map.of(lllIlIIIl[198], e.c(lllIlIIIl[37], lllIlIIIl[38]), lllIlIIIl[199], e.c(lllIlIIIl[37], lllIlIIIl[38]), lllIlIIIl[200], e.c(lllIlIIIl[37], lllIlIIIl[38])));
        bF.putAll(Map.of(lllIlIIIl[201], e.c(lllIlIIIl[42], lllIlIIIl[43]), lllIlIIIl[202], e.c(lllIlIIIl[42], lllIlIIIl[43])));
        bG.putAll(Map.of(lllIlIIIl[114], e.c(lllIlIIIl[137], lllIlIIIl[68]), lllIlIIIl[118], e.c(lllIlIIIl[115], lllIlIIIl[116]), lllIlIIIl[117], e.c(lllIlIIIl[115], lllIlIIIl[116])));
        bH.putAll(Map.of(lllIlIIIl[119], e.c(lllIlIIIl[115], lllIlIIIl[116]), lllIlIIIl[121], e.c(lllIlIIIl[115], lllIlIIIl[116]), lllIlIIIl[122], e.c(lllIlIIIl[115], lllIlIIIl[116]), lllIlIIIl[120], e.c(lllIlIIIl[115], lllIlIIIl[116])));
        bI.putAll(Map.of(lllIlIIIl[123], e.c(lllIlIIIl[115], lllIlIIIl[116]), lllIlIIIl[125], e.c(lllIlIIIl[115], lllIlIIIl[116]), lllIlIIIl[126], e.c(lllIlIIIl[115], lllIlIIIl[116])));
    }

    private static boolean llIIIlIllIlI(int n2, int n3) {
        return n2 < n3;
    }
}

