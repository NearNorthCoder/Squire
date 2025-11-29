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

import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.AHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.BHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.DHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.EHelper;
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

public class HHelper {
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
                d d2 = new DHelper(bJ, lllIlIIIl[1], bU);
                bx.add(d2);

            }
        }
        if (h.llIIIlIllIII(bK)) {
            int[] nArray = new int[lllIlIIIl[1]];
            nArray[h.lllIlIIIl[0]] = bK;
            if (h.llIIIlIllIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                lllIIIllllIlI = new DHelper(bK, lllIlIIIl[1], bV);
                bx.add(lllIIIllllIlI);

            }
        }
        if (h.llIIIlIllIII(bL)) {
            int[] nArray = new int[lllIlIIIl[1]];
            nArray[h.lllIlIIIl[0]] = bL;
            if (h.llIIIlIllIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                lllIIIllllIlI = new DHelper(bL, lllIlIIIl[1], bW);
                bx.add(lllIIIllllIlI);

            }
        }
        if (h.llIIIlIllIII(bM)) {
            int[] nArray = new int[lllIlIIIl[1]];
            nArray[h.lllIlIIIl[0]] = bM;
            if (h.llIIIlIllIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                lllIIIllllIlI = new DHelper(bM, lllIlIIIl[1], bX);
                bx.add(lllIIIllllIlI);

            }
        }
        if (h.llIIIlIllIII(bN)) {
            int[] nArray = new int[lllIlIIIl[1]];
            nArray[h.lllIlIIIl[0]] = bN;
            if (h.llIIIlIllIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                lllIIIllllIlI = new DHelper(bN, lllIlIIIl[1], bY);
                bx.add(lllIIIllllIlI);

            }
        }
        if (h.llIIIlIllIII(bO)) {
            int[] nArray = new int[lllIlIIIl[1]];
            nArray[h.lllIlIIIl[0]] = bO;
            if (h.llIIIlIllIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                lllIIIllllIlI = new DHelper(bO, lllIlIIIl[1], bZ);
                bx.add(lllIIIllllIlI);

            }
        }
        if (h.llIIIlIllIII(bP)) {
            int[] nArray = new int[lllIlIIIl[1]];
            nArray[h.lllIlIIIl[0]] = bP;
            if (h.llIIIlIllIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                lllIIIllllIlI = new DHelper(bP, lllIlIIIl[1], ca);
                bx.add(lllIIIllllIlI);

            }
        }
        if (h.llIIIlIllIII(bQ)) {
            int[] nArray = new int[lllIlIIIl[1]];
            nArray[h.lllIlIIIl[0]] = bQ;
            if (h.llIIIlIllIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                lllIIIllllIlI = new DHelper(bQ, lllIlIIIl[1], cb);
                bx.add(lllIIIllllIlI);

            }
        }
        if (h.llIIIlIllIII(bR)) {
            int[] nArray = new int[lllIlIIIl[1]];
            nArray[h.lllIlIIIl[0]] = bR;
            if (h.llIIIlIllIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                lllIIIllllIlI = new DHelper(bR, lllIlIIIl[1], cc);
                bx.add(lllIIIllllIlI);

            }
        }
        if (h.llIIIlIllIII(bS)) {
            int[] nArray = new int[lllIlIIIl[1]];
            nArray[h.lllIlIIIl[0]] = bS;
            if (h.llIIIlIllIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                lllIIIllllIlI = new DHelper(bS, lllIlIIIl[1], cd);
                bx.add(lllIIIllllIlI);

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
                                lllIIIllllIlI = new DHelper(bT, lllIlIIIl[1], ce);
                                bx.add(lllIIIllllIlI);

                            }
                        }
                    }
                } else {
                    lllIIIllllIlI = new DHelper(bT, lllIlIIIl[1], ce);
                    bx.add(lllIIIllllIlI);

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
        h.lllIlIIII[h.lllIlIIIl[0]] = "f2pmelee";
        h.lllIlIIII[h.lllIlIIIl[1]] = "f2pquest";
        h.lllIlIIII[h.lllIlIIIl[2]] = "f2pmage";
        h.lllIlIIII[h.lllIlIIIl[3]] = "mage";
        h.lllIlIIII[h.lllIlIIIl[4]] = "quest";
        h.lllIlIIII[h.lllIlIIIl[5]] = "questNoWep";
        h.lllIlIIII[h.lllIlIIIl[6]] = "melee";
        h.lllIlIIII[h.lllIlIIIl[7]] = "agility";
        h.lllIlIIII[h.lllIlIIIl[8]] = "meleeNmz";
        h.lllIlIIII[h.lllIlIIIl[9]] = "rangeNmz";
        h.lllIlIIII[h.lllIlIIIl[10]] = "Randomized Equipment:";
        h.lllIlIIII[h.lllIlIIIl[11]] = "Buying items";
        h.lllIlIIII[h.lllIlIIIl[12]] = "Finished buying items, switching back to randomGearing";
        h.lllIlIIII[h.lllIlIIIl[13]] = "Navigating to bank";
        h.lllIlIIII[h.lllIlIIIl[14]] = "Handling banking";
        h.lllIlIIII[h.lllIlIIIl[19]] = "We are missing random gear, switching to BUYING";
        h.lllIlIIII[h.lllIlIIIl[20]] = "We are missing random gear, switching to BUYING";
        h.lllIlIIII[h.lllIlIIIl[21]] = "We are missing random gear, switching to BUYING";
        h.lllIlIIII[h.lllIlIIIl[24]] = "Finished gearing random";
        h.lllIlIIII[h.lllIlIIIl[203]] = "Unexpected error occurred while getting a random key.";
        h.lllIlIIII[h.lllIlIIIl[46]] = "Random gear lists CLEARED";
        h.lllIlIIII[h.lllIlIIIl[204]] = "wealth";
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

    private static boolean llIIIlIllllI(int n2, int n3) {
        return n2 != n3;
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

                    }
                    if (h.llIIIlIllIII(Bank.isOpen() ? 1 : 0)) {
                        if (h.llIIIlIlllII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lllIlIIIl[4]);

                        }
                        if (h.llIIIlIlllII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lllIlIIIl[2]);

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

                            if (h.llIIIlIllIII(Bank.isOpen() ? 1 : 0)) {
                                Bank.close();
                                Time.sleepTicks((int)e.c(lllIlIIIl[3], lllIlIIIl[5]));

                            }
                            while (!h.llIIIlIllIIl(Inventory.contains((int[])lllIIlIIIIIlI) ? 1 : 0) || h.llIIIlIllIII(Inventory.contains(item -> {
                                int n2;
                                if (h.llIIIlIllIII(item.getName().contains(lllIlIIII[lllIlIIIl[204]]) ? 1 : 0) && h.llIIIlIllIIl(item.isNoted() ? 1 : 0)) {
                                    n2 = lllIlIIIl[1];

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

                                e.l(bN);
                                e.l(bO);
                                e.l(bP);
                                Time.sleepTicks((int)lllIlIIIl[1]);

                                e.l(bQ);
                                e.l(bR);
                                e.l(bS);
                                e.l(bT);
                                Time.sleepTicks((int)lllIlIIIl[1]);

                                e.l(lllIlIIIl[16]);
                                e.l(lllIlIIIl[17]);
                                e.l(lllIlIIIl[18]);
                                e.l(lllIlIIIl[22]);
                                e.l(lllIlIIIl[23]);

                                if (((0x97 ^ 0xAB) & ~(0x5E ^ 0x62)) == ((0xFA ^ 0xAD) & ~(0x6F ^ 0x38))) continue;
                                return;
                            }
                            if (h.llIIIlIllIIl(Bank.isOpen() ? 1 : 0)) {
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)lllIlIIIl[15]);

                                Time.sleepTicks((int)lllIlIIIl[4]);

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

