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
package gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks;

import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.7ff08cb7-2eac-4b0f-b288-ca118289a708Manager;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.7ff08cb7-2eac-4b0f-b288-ca118289a708Manager;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.DHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.7ff08cb7-2eac-4b0f-b288-ca118289a708Manager;
import gg.squire.account.AccBuilderGWD;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import net.runelite.api.Skill;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;

public class 7ff08cb7-2eac-4b0f-b288-ca118289a708Manager {
    private static  int bK;
    public static  boolean bw;
    private static  int ca;
    private static  int bQ;
    private static  int cc;
    private static  int bN;
    private static  int bT;
    private static  int bM;
    private static  int bS;
    private static  Map<Integer, Integer> bA;
    private static  Map<Integer, Integer> bF;
    private static  Map<Integer, Integer> bE;
    private static  int[] lllIlIIIl;
    private static  int cd;
    private static  int bU;
    private static  Map<Integer, Integer> bz;
    private static  int bV;
    private static  int bL;
    private static  int bZ;
    private static  int bX;
    private static  Map<Integer, Integer> bB;
    private static  int ce;
    public static  List<d> bx;
    private static  int bR;
    private static  String[] lllIlIIII;
    private static  int bJ;
    private static  int bO;
    private static  Map<Integer, Integer> bH;
    private static  int bW;
    private static  Map<Integer, Integer> bD;
    private static  Map<Integer, Integer> bI;
    public static  boolean bv;
    private static  int bY;
    private static  int cb;
    private static  int bP;
    private static  Map<Integer, Integer> bG;
    private static  Map<Integer, Integer> by;
    private static  Map<Integer, Integer> bC;

    private static boolean n(int n2) {
        if (n2 == lllIlIIIl[16]) {
            int[] nArray = new int[lllIlIIIl[10]];
            nArray[0] = bJ;
            nArray[1] = bK;
            nArray[2] = bL;
            nArray[3] = bM;
            nArray[4] = bN;
            nArray[5] = bO;
            nArray[6] = bP;
            nArray[7] = bQ;
            nArray[8] = bR;
            nArray[9] = bS;
            return h.d(nArray);
        }
        int[] nArray = new int[lllIlIIIl[11]];
        nArray[0] = bJ;
        nArray[1] = bK;
        nArray[2] = bL;
        nArray[3] = bM;
        nArray[4] = bN;
        nArray[5] = bO;
        nArray[6] = bP;
        nArray[7] = bQ;
        nArray[8] = bR;
        nArray[9] = bS;
        nArray[h.lllIlIIIl[10]] = n2;
        return h.d(nArray);
    }

    private static void Q() {
        d var1;
        if bJ {
            int[] nArray = new int[1];
            nArray[0] = bJ;
            if ((Bank.contains((int[] == 0)nArray) ? 1 : 0)) {
                d d2 = new DHelper(bJ, 1, bU);
                bx.add(d2);
                0;
            }
        }
        if bK {
            int[] nArray = new int[1];
            nArray[0] = bK;
            if ((Bank.contains((int[] == 0)nArray) ? 1 : 0)) {
                var1 = new DHelper(bK, 1, bV);
                bx.add(var1);
                0;
            }
        }
        if bL {
            int[] nArray = new int[1];
            nArray[0] = bL;
            if ((Bank.contains((int[] == 0)nArray) ? 1 : 0)) {
                var1 = new DHelper(bL, 1, bW);
                bx.add(var1);
                0;
            }
        }
        if bM {
            int[] nArray = new int[1];
            nArray[0] = bM;
            if ((Bank.contains((int[] == 0)nArray) ? 1 : 0)) {
                var1 = new DHelper(bM, 1, bX);
                bx.add(var1);
                0;
            }
        }
        if bN {
            int[] nArray = new int[1];
            nArray[0] = bN;
            if ((Bank.contains((int[] == 0)nArray) ? 1 : 0)) {
                var1 = new DHelper(bN, 1, bY);
                bx.add(var1);
                0;
            }
        }
        if bO {
            int[] nArray = new int[1];
            nArray[0] = bO;
            if ((Bank.contains((int[] == 0)nArray) ? 1 : 0)) {
                var1 = new DHelper(bO, 1, bZ);
                bx.add(var1);
                0;
            }
        }
        if bP {
            int[] nArray = new int[1];
            nArray[0] = bP;
            if ((Bank.contains((int[] == 0)nArray) ? 1 : 0)) {
                var1 = new DHelper(bP, 1, ca);
                bx.add(var1);
                0;
            }
        }
        if bQ {
            int[] nArray = new int[1];
            nArray[0] = bQ;
            if ((Bank.contains((int[] == 0)nArray) ? 1 : 0)) {
                var1 = new DHelper(bQ, 1, cb);
                bx.add(var1);
                0;
            }
        }
        if bR {
            int[] nArray = new int[1];
            nArray[0] = bR;
            if ((Bank.contains((int[] == 0)nArray) ? 1 : 0)) {
                var1 = new DHelper(bR, 1, cc);
                bx.add(var1);
                0;
            }
        }
        if bS {
            int[] nArray = new int[1];
            nArray[0] = bS;
            if ((Bank.contains((int[] == 0)nArray) ? 1 : 0)) {
                var1 = new DHelper(bS, 1, cd);
                bx.add(var1);
                0;
            }
        }
        if bT {
            int[] nArray = new int[1];
            nArray[0] = bT;
            if ((Bank.contains((int[] == 0)nArray) ? 1 : 0)) {
                if (bT == lllIlIIIl[16]) {
                    int[] nArray2 = new int[1];
                    nArray2[0] = lllIlIIIl[16];
                    if ((Bank.contains((int[] == 0)nArray2) ? 1 : 0)) {
                        int[] nArray3 = new int[1];
                        nArray3[0] = lllIlIIIl[17];
                        if ((Bank.contains((int[] == 0)nArray3) ? 1 : 0)) {
                            int[] nArray4 = new int[1];
                            nArray4[0] = lllIlIIIl[18];
                            if ((Bank.contains((int[] == 0)nArray4) ? 1 : 0)) {
                                var1 = new DHelper(bT, 1, ce);
                                bx.add(var1);
                                0;
                                0;
                                if (-2 >= 0) {
                                    return;
                                }
                            }
                        }
                    }
                } else {
                    var1 = new DHelper(bT, 1, ce);
                    bx.add(var1);
                    0;
                }
            }
        }
    }

    private static void W() {
        Random random = new Random();
        bJ = h.a(by, random);
        bU = by.getOrDefault(bJ, 0);
        bK = h.a(bz, random);
        bV = bz.getOrDefault(bK, 0);
        bL = h.a(bA, random);
        bW = bA.getOrDefault(bL, 0);
        bM = h.a(bB, random);
        bX = bB.getOrDefault(bM, 0);
        bN = h.a(bC, random);
        bY = bC.getOrDefault(bN, 0);
        bO = h.a(bD, random);
        bZ = bD.getOrDefault(bO, 0);
        bP = h.a(bE, random);
        ca = bE.getOrDefault(bP, 0);
        bQ = h.a(bF, random);
        cb = bF.getOrDefault(bQ, 0);
        bR = h.a(bG, random);
        cc = bG.getOrDefault(bR, 0);
        bS = h.a(bH, random);
        cd = bH.getOrDefault(bS, 0);
        bT = h.a(bI, random);
        ce = bI.getOrDefault(bT, 0);
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
        bS = bT = 0;
        bR = bT;
        bQ = bT;
        bP = bT;
        bO = bT;
        bN = bT;
        bM = bT;
        bL = bT;
        bK = bT;
        bJ = bT;
        cd = ce = 0;
        cc = ce;
        cb = ce;
        ca = ce;
        bZ = ce;
        bY = ce;
        bX = ce;
        bW = ce;
        bV = ce;
        bU = ce;
        bw = 0;
        System.out.println(lllIlIIII[lllIlIIIl[46]]);
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

    private static void T() {
        if ((Skills.getLevel((SkiSkill.RANGED) < lllIlIIIl[147])) {
            by.putAll(Map.of(lllIlIIIl[148], e.c(lllIlIIIl[149], lllIlIIIl[150])));
        }
        if ((Skills.getLevel((SkiSkill.RANGED) >= lllIlIIIl[147])) {
            by.putAll(Map.of(lllIlIIIl[148], e.c(lllIlIIIl[149], lllIlIIIl[150])));
        }
        bC.putAll(Map.of(lllIlIIIl[151], e.c(lllIlIIIl[152], lllIlIIIl[153])));
        if ((Skills.getLevel((SkiSkill.RANGED) < lllIlIIIl[79])) {
            bE.putAll(Map.of(lllIlIIIl[154], e.c(lllIlIIIl[131], lllIlIIIl[132])));
        }
        if ((Skills.getLevel((SkiSkill.RANGED) >= lllIlIIIl[79]) && (Skills.getLevel((SkiSkill.RANGED) < lllIlIIIl[147])) {
            bE.putAll(Map.of(lllIlIIIl[155], e.c(lllIlIIIl[131], lllIlIIIl[132])));
        }
        if ((Skills.getLevel((SkiSkill.RANGED) >= lllIlIIIl[147])) {
            bE.putAll(Map.of(lllIlIIIl[156], e.c(lllIlIIIl[131], lllIlIIIl[132])));
        }
        if ((Skills.getLevel((SkiSkill.RANGED) < lllIlIIIl[79])) {
            bF.putAll(Map.of(lllIlIIIl[157], e.c(lllIlIIIl[131], lllIlIIIl[132])));
        }
        if ((Skills.getLevel((SkiSkill.RANGED) >= lllIlIIIl[79]) && (Skills.getLevel((SkiSkill.RANGED) < lllIlIIIl[147])) {
            bF.putAll(Map.of(lllIlIIIl[158], e.c(lllIlIIIl[131], lllIlIIIl[132])));
        }
        if ((Skills.getLevel((SkiSkill.RANGED) >= lllIlIIIl[147])) {
            bF.putAll(Map.of(lllIlIIIl[159], e.c(lllIlIIIl[131], lllIlIIIl[132])));
        }
        bz.putAll(Map.of(lllIlIIIl[129], e.c(lllIlIIIl[160], lllIlIIIl[161])));
        bA.putAll(Map.of(lllIlIIIl[162], e.c(lllIlIIIl[163], lllIlIIIl[164])));
        if ((Skills.getLevel((SkiSkill.RANGED) < lllIlIIIl[147])) {
            bG.putAll(Map.of(lllIlIIIl[136], e.c(lllIlIIIl[137], lllIlIIIl[68])));
        }
        if ((Skills.getLevel((SkiSkill.RANGED) >= lllIlIIIl[147])) {
            bG.putAll(Map.of(lllIlIIIl[136], e.c(lllIlIIIl[137], lllIlIIIl[68])));
        }
        if ((Skills.getLevel((SkiSkill.RANGED) < lllIlIIIl[147])) {
            bH.putAll(Map.of(lllIlIIIl[165], e.c(lllIlIIIl[166], lllIlIIIl[167])));
        }
        if ((Skills.getLevel((SkiSkill.RANGED) >= lllIlIIIl[147])) {
            bH.putAll(Map.of(lllIlIIIl[165], e.c(lllIlIIIl[166], lllIlIIIl[167])));
        }
        bI.putAll(Map.of(lllIlIIIl[16], e.c(lllIlIIIl[145], lllIlIIIl[146])));
    }

    private static void R() {
        if ((Skills.getLevel((SkiSkill.DEFENCE) < 5)) {
            by.putAll(Map.of(lllIlIIIl[25], e.c(lllIlIIIl[26], lllIlIIIl[27]), lllIlIIIl[28], e.c(lllIlIIIl[26], lllIlIIIl[27])));
            bD.putAll(Map.of(lllIlIIIl[29], e.c(lllIlIIIl[30], lllIlIIIl[31]), lllIlIIIl[32], e.c(lllIlIIIl[30], lllIlIIIl[31])));
            bC.putAll(Map.of(lllIlIIIl[33], e.c(lllIlIIIl[34], lllIlIIIl[35])));
            bE.putAll(Map.of(lllIlIIIl[36], e.c(lllIlIIIl[37], lllIlIIIl[38]), lllIlIIIl[39], e.c(lllIlIIIl[37], lllIlIIIl[38]), lllIlIIIl[40], e.c(lllIlIIIl[37], lllIlIIIl[38])));
            bF.putAll(Map.of(lllIlIIIl[41], e.c(lllIlIIIl[42], lllIlIIIl[43]), lllIlIIIl[44], e.c(lllIlIIIl[42], lllIlIIIl[43]), lllIlIIIl[45], e.c(lllIlIIIl[42], lllIlIIIl[43])));
        }
        if ((Skills.getLevel((SkiSkill.DEFENCE) >= 5) && (Skills.getLevel((SkiSkill.DEFENCE) < lllIlIIIl[46])) {
            by.putAll(Map.of(lllIlIIIl[47], e.c(lllIlIIIl[26], lllIlIIIl[27])));
            bD.putAll(Map.of(lllIlIIIl[48], e.c(lllIlIIIl[26], lllIlIIIl[27]), lllIlIIIl[32], e.c(lllIlIIIl[30], lllIlIIIl[31])));
            bC.putAll(Map.of(lllIlIIIl[49], e.c(lllIlIIIl[34], lllIlIIIl[35])));
            bE.putAll(Map.of(lllIlIIIl[50], e.c(lllIlIIIl[37], lllIlIIIl[38]), lllIlIIIl[39], e.c(lllIlIIIl[37], lllIlIIIl[38])));
            bF.putAll(Map.of(lllIlIIIl[41], e.c(lllIlIIIl[42], lllIlIIIl[43]), lllIlIIIl[51], e.c(lllIlIIIl[42], lllIlIIIl[43])));
        }
        if ((Skills.getLevel((SkiSkill.DEFENCE) >= lllIlIIIl[46]) && (Skills.getLevel((SkiSkill.DEFENCE) < lllIlIIIl[52])) {
            by.putAll(Map.of(lllIlIIIl[53], e.c(lllIlIIIl[26], lllIlIIIl[27]), lllIlIIIl[47], e.c(lllIlIIIl[26], lllIlIIIl[27]), lllIlIIIl[54], e.c(lllIlIIIl[55], lllIlIIIl[56])));
            bD.putAll(Map.of(lllIlIIIl[57], e.c(lllIlIIIl[26], lllIlIIIl[27]), lllIlIIIl[48], e.c(lllIlIIIl[26], lllIlIIIl[27])));
            bC.putAll(Map.of(lllIlIIIl[58], e.c(lllIlIIIl[34], lllIlIIIl[35])));
            bE.putAll(Map.of(lllIlIIIl[50], e.c(lllIlIIIl[37], lllIlIIIl[38]), lllIlIIIl[59], e.c(lllIlIIIl[37], lllIlIIIl[38]), lllIlIIIl[60], e.c(lllIlIIIl[61], lllIlIIIl[62])));
            bF.putAll(Map.of(lllIlIIIl[63], e.c(lllIlIIIl[42], lllIlIIIl[43]), lllIlIIIl[51], e.c(lllIlIIIl[42], lllIlIIIl[43]), lllIlIIIl[64], e.c(lllIlIIIl[42], lllIlIIIl[43])));
        }
        if ((Skills.getLevel((SkiSkill.DEFENCE) >= lllIlIIIl[52]) && (Skills.getLevel((SkiSkill.DEFENCE) < lllIlIIIl[65])) {
            by.putAll(Map.of(lllIlIIIl[66], e.c(lllIlIIIl[26], lllIlIIIl[27]), lllIlIIIl[67], e.c(lllIlIIIl[55], lllIlIIIl[68])));
            bD.putAll(Map.of(lllIlIIIl[69], e.c(lllIlIIIl[26], lllIlIIIl[27]), lllIlIIIl[70], e.c(lllIlIIIl[55], lllIlIIIl[68]), lllIlIIIl[57], e.c(lllIlIIIl[26], lllIlIIIl[27])));
            bC.putAll(Map.of(lllIlIIIl[71], e.c(lllIlIIIl[34], lllIlIIIl[35])));
            bE.putAll(Map.of(lllIlIIIl[72], e.c(lllIlIIIl[37], lllIlIIIl[38]), lllIlIIIl[59], e.c(lllIlIIIl[37], lllIlIIIl[38]), lllIlIIIl[73], e.c(lllIlIIIl[74], lllIlIIIl[75]), lllIlIIIl[76], e.c(lllIlIIIl[74], lllIlIIIl[75])));
            bF.putAll(Map.of(lllIlIIIl[63], e.c(lllIlIIIl[42], lllIlIIIl[43]), lllIlIIIl[77], e.c(lllIlIIIl[42], lllIlIIIl[43]), lllIlIIIl[78], e.c(lllIlIIIl[42], lllIlIIIl[43])));
        }
        if ((Skills.getLevel((SkiSkill.DEFENCE) >= lllIlIIIl[65]) && (Skills.getLevel((SkiSkill.DEFENCE) < lllIlIIIl[79])) {
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

    /*
     * WARNING - void declaration
     */
    private static int a(Map<Integer, Integer> map, Random random) {
        Map<Integer, Integer> var2;
        void var3;
        if ((map.isEmpty( != 0) ? 1 : 0)) {
            return 0;
        }
        int var4 = var3.nextInt(var2.size());
        int var5 = 0;
        Iterator<Integer> var6 = var2.keySet().iterator();
        while ((var6.hasNext( != 0) ? 1 : 0)) {
            int var7 = var6.next();
            if (var5 == var4) {
                return var7;
            }
            ++var5;
            0;
            if (2 >= ((8 ^ 0x46) & ~(0x74 ^ 0x3A))) continue;
            return (0x39 ^ 0x79) & ~(0 ^ 0x40);
        }
        throw new IllegalStateException(lllIlIIII[lllIlIIIl[203]]);
    }

        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    private static String var20(String var21, String var22) {
        var21 = new String(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var23 = new StringBuilder();
        char[] var24 = var22.toCharArray();
        int var25 = 0;
        char[] var26 = var21.toCharArray();
        int var27 = var26.length;
        int var28 = 0;
        while (var28 < var27) {
            char var29 = var26[var28];
            var23.append((char)(var29 ^ var24[var25 % var24.length]));
            0;
            ++var25;
            ++var28;
            0;
            if (((0xB2 ^ 0x93) & ~(0xA9 ^ 0x88)) < 3) continue;
            return null;
        }
        return String.valueOf(var23);
    }

    public static void d(String string) {
        if (!bJ || (bP == 0)) {
            String var30;
            if ((var30.equalsIgnoreCase(lllIlIIII[0] != 0) ? 1 : 0)) {
                h.R();
            }
            if ((var30.equalsIgnoreCase(lllIlIIII[1] != 0) ? 1 : 0)) {
                // empty if block
            }
            if ((var30.equalsIgnoreCase(lllIlIIII[2] != 0) ? 1 : 0)) {
                h.V();
            }
            if ((var30.equalsIgnoreCase(lllIlIIII[3] != 0) ? 1 : 0)) {
                // empty if block
            }
            if ((var30.equalsIgnoreCase(lllIlIIII[4] != 0) ? 1 : 0)) {
                // empty if block
            }
            if ((var30.equalsIgnoreCase(lllIlIIII[5] != 0) ? 1 : 0)) {
                // empty if block
            }
            if ((var30.equalsIgnoreCase(lllIlIIII[6] != 0) ? 1 : 0)) {
                h.S();
            }
            if ((var30.equalsIgnoreCase(lllIlIIII[7] != 0) ? 1 : 0)) {
                // empty if block
            }
            if ((var30.equalsIgnoreCase(lllIlIIII[8] != 0) ? 1 : 0)) {
                h.U();
            }
            if ((var30.equalsIgnoreCase(lllIlIIII[9] != 0) ? 1 : 0)) {
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
        if (bJ && bP) {
            if (bv != 0) {
                AccBuilderGWD.c = lllIlIIII[lllIlIIIl[11]];
                b.a(bx);
                if ((bx.size() < 1)) {
                    System.out.println(lllIlIIII[lllIlIIIl[12]]);
                    bv = 0;
                }
            }
            if (bv == 0) {
                BankLocation var31 = BankLocation.getNearest();
                if (var31 != null && (var31.getArea( == 0).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = lllIlIIII[lllIlIIIl[13]];
                    a.a(var31);
                }
                if (var31 != null && (var31.getArea( != 0).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = lllIlIIII[lllIlIIIl[14]];
                    if ((Bank.isOpen( == 0) ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lllIlIIIl[15]);
                        0;
                    }
                    if ((Bank.isOpen( != 0) ? 1 : 0)) {
                        if ((Inventory.getAll( > 0).size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)4);
                            0;
                        }
                        if ((Equipment.getAll( > 0).size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)2);
                            0;
                        }
                        if (bT == lllIlIIIl[16]) {
                            int[] nArray = new int[1];
                            nArray[0] = lllIlIIIl[17];
                            if ((Bank.contains((int[] == 0)nArray) ? 1 : 0)) {
                                int[] nArray2 = new int[1];
                                nArray2[0] = lllIlIIIl[16];
                                if ((Bank.contains((int[] == 0)nArray2) ? 1 : 0)) {
                                    int[] nArray3 = new int[1];
                                    nArray3[0] = lllIlIIIl[18];
                                    if ((Bank.contains((int[] == 0)nArray3) ? 1 : 0)) {
                                        h.Q();
                                        System.out.println(lllIlIIII[lllIlIIIl[19]]);
                                        bv = 1;
                                        return;
                                    }
                                }
                            }
                            int[] nArray4 = new int[lllIlIIIl[10]];
                            nArray4[0] = bJ;
                            nArray4[1] = bK;
                            nArray4[2] = bL;
                            nArray4[3] = bM;
                            nArray4[4] = bN;
                            nArray4[5] = bO;
                            nArray4[6] = bP;
                            nArray4[7] = bQ;
                            nArray4[8] = bR;
                            nArray4[9] = bS;
                            if ((h.d(nArray4 == 0) ? 1 : 0)) {
                                h.Q();
                                System.out.println(lllIlIIII[lllIlIIIl[20]]);
                                bv = 1;
                                return;
                            }
                        }
                        if (bT != lllIlIIIl[16]) {
                            int[] nArray = new int[lllIlIIIl[11]];
                            nArray[0] = bJ;
                            nArray[1] = bK;
                            nArray[2] = bL;
                            nArray[3] = bM;
                            nArray[4] = bN;
                            nArray[5] = bO;
                            nArray[6] = bP;
                            nArray[7] = bQ;
                            nArray[8] = bR;
                            nArray[9] = bS;
                            nArray[h.lllIlIIIl[10]] = bT;
                            if ((h.d(nArray == 0) ? 1 : 0)) {
                                h.Q();
                                System.out.println(lllIlIIII[lllIlIIIl[21]]);
                                bv = 1;
                                return;
                            }
                        }
                        if ((h.nbT)) {
                            int[] nArray = new int[lllIlIIIl[11]];
                            nArray[0] = bJ;
                            nArray[1] = bK;
                            nArray[2] = bL;
                            nArray[3] = bM;
                            nArray[4] = bN;
                            nArray[5] = bO;
                            nArray[6] = bP;
                            nArray[7] = bQ;
                            nArray[8] = bR;
                            nArray[9] = bS;
                            nArray[h.lllIlIIIl[10]] = bT;
                            int[] var32 = nArray;
                            if (bT == lllIlIIIl[16]) {
                                int[] nArray5 = new int[1];
                                nArray5[0] = lllIlIIIl[16];
                                if ((Bank.contains((int[] == 0)nArray5) ? 1 : 0)) {
                                    int[] nArray6 = new int[1];
                                    nArray6[0] = lllIlIIIl[17];
                                    if ((Bank.contains((int[] != 0)nArray6) ? 1 : 0)) {
                                        a.a(lllIlIIIl[17], 1);
                                    }
                                }
                                int[] nArray7 = new int[1];
                                nArray7[0] = lllIlIIIl[16];
                                if ((Bank.contains((int[] == 0)nArray7) ? 1 : 0)) {
                                    int[] nArray8 = new int[1];
                                    nArray8[0] = lllIlIIIl[17];
                                    if ((Bank.contains((int[] == 0)nArray8) ? 1 : 0)) {
                                        int[] nArray9 = new int[1];
                                        nArray9[0] = lllIlIIIl[17];
                                        if ((Inventory.contains((int[] == 0)nArray9) ? 1 : 0)) {
                                            int[] nArray10 = new int[1];
                                            nArray10[0] = lllIlIIIl[18];
                                            if ((Bank.contains((int[] != 0)nArray10) ? 1 : 0)) {
                                                a.a(lllIlIIIl[18], 1);
                                            }
                                        }
                                    }
                                }
                            }
                            a.a(var32, 1);
                            Time.sleepTicks((int)e.c(lllIlIIIl[10], lllIlIIIl[14]));
                            0;
                            if ((Bank.isOpen( != 0) ? 1 : 0)) {
                                Bank.close();
                                Time.sleepTicks((int)e.c(3, 5));
                                0;
                            }
                            while (!(Inventory.contains((int[] == 0)var32) ? 1 : 0) || (Inventory.contains(item -> {
                                int n2;
                                if (h.var33(item.getName( != 0).contains(lllIlIIII[lllIlIIIl[204]]) ? 1 : 0) && (item.isNoted( == 0) ? 1 : 0)) {
                                    n2 = 1;
                                    0;
                                    if (1 <= 0) {
                                        return ((0x19 ^ 0x17) & ~(0x2B ^ 0x25)) != 0;
                                    }
                                } else {
                                    n2 = 0;
                                }
                                return n2 != 0;
                            }) ? 1 : 0)) {
                                e.l(bJ);
                                e.l(bK);
                                e.l(bL);
                                e.l(bM);
                                Time.sleepTicks((int)1);
                                0;
                                e.l(bN);
                                e.l(bO);
                                e.l(bP);
                                Time.sleepTicks((int)1);
                                0;
                                e.l(bQ);
                                e.l(bR);
                                e.l(bS);
                                e.l(bT);
                                Time.sleepTicks((int)1);
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
                            if ((Bank.isOpen( == 0) ? 1 : 0)) {
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)lllIlIIIl[15]);
                                0;
                                Time.sleepTicks((int)4);
                                0;
                                System.out.println(lllIlIIII[lllIlIIIl[24]]);
                                bw = 1;
                            }
                        }
                    }
                }
            }
        }
    }

    public static boolean d(int[] nArray) {
        int[] var34;
        int var35 = 0;
        while (var35 < var34.length) {
            if (var34[var35] > 0) {
                int[] nArray2 = new int[1];
                nArray2[0] = var34[var35];
                if ((Bank.contains((int[] == 0)nArray2) ? 1 : 0)) {
                    System.out.println("Missing ID: " + var34[var35]);
                    return 0;
                }
            }
            ++var35;
            0;
            if (-1 <= (0x1F ^ 0x58 ^ (0xCC ^ 0x8F))) continue;
            return ((0x87 ^ 0xB0 ^ (0x4B ^ 0x50)) & (119 + 8 - 60 + 115 ^ 48 + 2 - 2 + 106 ^ -1)) != 0;
        }
        return 1;
    }

    private static void S() {
        if ((Skills.getLevel((SkiSkill.DEFENCE) < 5)) {
            by.putAll(Map.of(lllIlIIIl[25], e.c(lllIlIIIl[26], lllIlIIIl[27])));
            bD.putAll(Map.of(lllIlIIIl[29], e.c(lllIlIIIl[30], lllIlIIIl[31]), lllIlIIIl[32], e.c(lllIlIIIl[30], lllIlIIIl[31])));
            bC.putAll(Map.of(lllIlIIIl[33], e.c(lllIlIIIl[34], lllIlIIIl[35])));
            bE.putAll(Map.of(lllIlIIIl[36], e.c(lllIlIIIl[37], lllIlIIIl[38]), lllIlIIIl[39], e.c(lllIlIIIl[37], lllIlIIIl[38]), lllIlIIIl[40], e.c(lllIlIIIl[37], lllIlIIIl[38])));
            bF.putAll(Map.of(lllIlIIIl[41], e.c(lllIlIIIl[42], lllIlIIIl[43]), lllIlIIIl[44], e.c(lllIlIIIl[42], lllIlIIIl[43]), lllIlIIIl[45], e.c(lllIlIIIl[42], lllIlIIIl[43])));
        }
        if ((Skills.getLevel((SkiSkill.DEFENCE) >= 5) && (Skills.getLevel((SkiSkill.DEFENCE) < lllIlIIIl[46])) {
            by.putAll(Map.of(lllIlIIIl[47], e.c(lllIlIIIl[26], lllIlIIIl[27])));
            bD.putAll(Map.of(lllIlIIIl[48], e.c(lllIlIIIl[26], lllIlIIIl[27]), lllIlIIIl[32], e.c(lllIlIIIl[30], lllIlIIIl[31])));
            bC.putAll(Map.of(lllIlIIIl[49], e.c(lllIlIIIl[34], lllIlIIIl[35])));
            bE.putAll(Map.of(lllIlIIIl[50], e.c(lllIlIIIl[37], lllIlIIIl[38]), lllIlIIIl[39], e.c(lllIlIIIl[37], lllIlIIIl[38])));
            bF.putAll(Map.of(lllIlIIIl[41], e.c(lllIlIIIl[42], lllIlIIIl[43]), lllIlIIIl[51], e.c(lllIlIIIl[42], lllIlIIIl[43])));
        }
        if ((Skills.getLevel((SkiSkill.DEFENCE) >= lllIlIIIl[46]) && (Skills.getLevel((SkiSkill.DEFENCE) < lllIlIIIl[52])) {
            by.putAll(Map.of(lllIlIIIl[53], e.c(lllIlIIIl[26], lllIlIIIl[27]), lllIlIIIl[47], e.c(lllIlIIIl[26], lllIlIIIl[27]), lllIlIIIl[54], e.c(lllIlIIIl[55], lllIlIIIl[56])));
            bD.putAll(Map.of(lllIlIIIl[57], e.c(lllIlIIIl[26], lllIlIIIl[27]), lllIlIIIl[48], e.c(lllIlIIIl[26], lllIlIIIl[27]), lllIlIIIl[127], e.c(lllIlIIIl[55], lllIlIIIl[56])));
            bC.putAll(Map.of(lllIlIIIl[58], e.c(lllIlIIIl[34], lllIlIIIl[35])));
            bE.putAll(Map.of(lllIlIIIl[50], e.c(lllIlIIIl[37], lllIlIIIl[38]), lllIlIIIl[59], e.c(lllIlIIIl[37], lllIlIIIl[38]), lllIlIIIl[60], e.c(lllIlIIIl[61], lllIlIIIl[62])));
            bF.putAll(Map.of(lllIlIIIl[63], e.c(lllIlIIIl[42], lllIlIIIl[43]), lllIlIIIl[51], e.c(lllIlIIIl[42], lllIlIIIl[43]), lllIlIIIl[64], e.c(lllIlIIIl[42], lllIlIIIl[43])));
        }
        if ((Skills.getLevel((SkiSkill.DEFENCE) >= lllIlIIIl[52]) && (Skills.getLevel((SkiSkill.DEFENCE) < lllIlIIIl[65])) {
            by.putAll(Map.of(lllIlIIIl[66], e.c(lllIlIIIl[26], lllIlIIIl[27]), lllIlIIIl[67], e.c(lllIlIIIl[55], lllIlIIIl[68])));
            bD.putAll(Map.of(lllIlIIIl[69], e.c(lllIlIIIl[26], lllIlIIIl[27]), lllIlIIIl[70], e.c(lllIlIIIl[55], lllIlIIIl[68]), lllIlIIIl[57], e.c(lllIlIIIl[26], lllIlIIIl[27])));
            bC.putAll(Map.of(lllIlIIIl[71], e.c(lllIlIIIl[34], lllIlIIIl[35])));
            bE.putAll(Map.of(lllIlIIIl[72], e.c(lllIlIIIl[37], lllIlIIIl[38]), lllIlIIIl[59], e.c(lllIlIIIl[37], lllIlIIIl[38]), lllIlIIIl[73], e.c(lllIlIIIl[74], lllIlIIIl[75]), lllIlIIIl[76], e.c(lllIlIIIl[74], lllIlIIIl[75])));
            bF.putAll(Map.of(lllIlIIIl[63], e.c(lllIlIIIl[42], lllIlIIIl[43]), lllIlIIIl[77], e.c(lllIlIIIl[42], lllIlIIIl[43]), lllIlIIIl[78], e.c(lllIlIIIl[42], lllIlIIIl[43])));
        }
        if ((Skills.getLevel((SkiSkill.DEFENCE) >= lllIlIIIl[65]) && (Skills.getLevel((SkiSkill.DEFENCE) < lllIlIIIl[79])) {
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
        if ((Skills.getLevel((SkiSkill.DEFENCE) >= 5) && (Skills.getLevel((SkiSkill.DEFENCE) < lllIlIIIl[46])) {
            bH.putAll(Map.of(lllIlIIIl[142], e.c(lllIlIIIl[115], lllIlIIIl[116])));
        }
        if ((Skills.getLevel((SkiSkill.DEFENCE) >= lllIlIIIl[46]) && (Skills.getLevel((SkiSkill.DEFENCE) < lllIlIIIl[52])) {
            bH.putAll(Map.of(lllIlIIIl[143], e.c(lllIlIIIl[115], lllIlIIIl[116])));
        }
        if ((Skills.getLevel((SkiSkill.DEFENCE) >= lllIlIIIl[65]) && (Skills.getLevel((SkiSkill.DEFENCE) < lllIlIIIl[79])) {
            bH.putAll(Map.of(lllIlIIIl[144], e.c(lllIlIIIl[115], lllIlIIIl[116])));
        }
        bI.putAll(Map.of(lllIlIIIl[16], e.c(lllIlIIIl[145], lllIlIIIl[146])));
    }

    static {
        h.var36();
        h.var37();
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

}

