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
package gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks;

import gg.squire.account.AccBuilderSotf;
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
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.AHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.BHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.DHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.EHelper;

public class HHelper {
    private static  int bH;
    private static  int bO;
    private static  Map<Integer, Integer> bB;
    private static  int bP;
    private static  Map<Integer, Integer> bx;
    private static  int bL;
    private static  Map<Integer, Integer> bw;
    private static  int ca;
    private static  int bX;
    private static  int cb;
    private static  int bS;
    private static  Map<Integer, Integer> bF;
    public static  boolean bt;
    private static  int bQ;
    private static  Map<Integer, Integer> by;
    private static  int cc;
    private static  int bJ;
    private static  Map<Integer, Integer> bA;
    private static  Map<Integer, Integer> bG;
    private static  Map<Integer, Integer> bC;
    private static  int bR;
    private static  int bV;
    public static  boolean bu;
    public static  List<d> bv;
    private static  int bY;
    private static  int bK;
    private static  int bN;
    
    private static  int bU;
    private static  Map<Integer, Integer> bz;
    private static  int bI;
    
    private static  int bT;
    private static  int bZ;
    private static  int bM;
    private static  Map<Integer, Integer> bD;
    private static  Map<Integer, Integer> bE;
    private static  int bW;

    private static boolean n(int n2) {
        if (h.lIlIllllIlIIl(n2, llIIllllIl[16])) {
            int[] nArray = new int[llIIllllIl[10]];
            nArray[h.llIIllllIl[0]] = bH;
            nArray[h.llIIllllIl[1]] = bI;
            nArray[h.llIIllllIl[2]] = bJ;
            nArray[h.llIIllllIl[3]] = bK;
            nArray[h.llIIllllIl[4]] = bL;
            nArray[h.llIIllllIl[5]] = bM;
            nArray[h.llIIllllIl[6]] = bN;
            nArray[h.llIIllllIl[7]] = bO;
            nArray[h.llIIllllIl[8]] = bP;
            nArray[h.llIIllllIl[9]] = bQ;
            return h.c(nArray);
        }
        int[] nArray = new int[llIIllllIl[11]];
        nArray[h.llIIllllIl[0]] = bH;
        nArray[h.llIIllllIl[1]] = bI;
        nArray[h.llIIllllIl[2]] = bJ;
        nArray[h.llIIllllIl[3]] = bK;
        nArray[h.llIIllllIl[4]] = bL;
        nArray[h.llIIllllIl[5]] = bM;
        nArray[h.llIIllllIl[6]] = bN;
        nArray[h.llIIllllIl[7]] = bO;
        nArray[h.llIIllllIl[8]] = bP;
        nArray[h.llIIllllIl[9]] = bQ;
        nArray[h.llIIllllIl[10]] = n2;
        return h.c(nArray);
    }

    private static boolean lIlIllllIlIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static void S() {
        if (h.lIlIllllIIllI(Skills.getLevel((Skill)Skill.DEFENCE), llIIllllIl[5])) {
            bw.putAll(Map.of(llIIllllIl[25], e.c(llIIllllIl[26], llIIllllIl[27])));
            bB.putAll(Map.of(llIIllllIl[29], e.c(llIIllllIl[30], llIIllllIl[31]), llIIllllIl[32], e.c(llIIllllIl[30], llIIllllIl[31])));
            bA.putAll(Map.of(llIIllllIl[33], e.c(llIIllllIl[34], llIIllllIl[35])));
            bC.putAll(Map.of(llIIllllIl[36], e.c(llIIllllIl[37], llIIllllIl[38]), llIIllllIl[39], e.c(llIIllllIl[37], llIIllllIl[38]), llIIllllIl[40], e.c(llIIllllIl[37], llIIllllIl[38])));
            bD.putAll(Map.of(llIIllllIl[41], e.c(llIIllllIl[42], llIIllllIl[43]), llIIllllIl[44], e.c(llIIllllIl[42], llIIllllIl[43]), llIIllllIl[45], e.c(llIIllllIl[42], llIIllllIl[43])));
        }
        if (h.lIlIllllIlIll(Skills.getLevel((Skill)Skill.DEFENCE), llIIllllIl[5]) && h.lIlIllllIIllI(Skills.getLevel((Skill)Skill.DEFENCE), llIIllllIl[46])) {
            bw.putAll(Map.of(llIIllllIl[47], e.c(llIIllllIl[26], llIIllllIl[27])));
            bB.putAll(Map.of(llIIllllIl[48], e.c(llIIllllIl[26], llIIllllIl[27]), llIIllllIl[32], e.c(llIIllllIl[30], llIIllllIl[31])));
            bA.putAll(Map.of(llIIllllIl[49], e.c(llIIllllIl[34], llIIllllIl[35])));
            bC.putAll(Map.of(llIIllllIl[50], e.c(llIIllllIl[37], llIIllllIl[38]), llIIllllIl[39], e.c(llIIllllIl[37], llIIllllIl[38])));
            bD.putAll(Map.of(llIIllllIl[41], e.c(llIIllllIl[42], llIIllllIl[43]), llIIllllIl[51], e.c(llIIllllIl[42], llIIllllIl[43])));
        }
        if (h.lIlIllllIlIll(Skills.getLevel((Skill)Skill.DEFENCE), llIIllllIl[46]) && h.lIlIllllIIllI(Skills.getLevel((Skill)Skill.DEFENCE), llIIllllIl[52])) {
            bw.putAll(Map.of(llIIllllIl[53], e.c(llIIllllIl[26], llIIllllIl[27]), llIIllllIl[47], e.c(llIIllllIl[26], llIIllllIl[27]), llIIllllIl[54], e.c(llIIllllIl[55], llIIllllIl[56])));
            bB.putAll(Map.of(llIIllllIl[57], e.c(llIIllllIl[26], llIIllllIl[27]), llIIllllIl[48], e.c(llIIllllIl[26], llIIllllIl[27]), llIIllllIl[127], e.c(llIIllllIl[55], llIIllllIl[56])));
            bA.putAll(Map.of(llIIllllIl[58], e.c(llIIllllIl[34], llIIllllIl[35])));
            bC.putAll(Map.of(llIIllllIl[50], e.c(llIIllllIl[37], llIIllllIl[38]), llIIllllIl[59], e.c(llIIllllIl[37], llIIllllIl[38]), llIIllllIl[60], e.c(llIIllllIl[61], llIIllllIl[62])));
            bD.putAll(Map.of(llIIllllIl[63], e.c(llIIllllIl[42], llIIllllIl[43]), llIIllllIl[51], e.c(llIIllllIl[42], llIIllllIl[43]), llIIllllIl[64], e.c(llIIllllIl[42], llIIllllIl[43])));
        }
        if (h.lIlIllllIlIll(Skills.getLevel((Skill)Skill.DEFENCE), llIIllllIl[52]) && h.lIlIllllIIllI(Skills.getLevel((Skill)Skill.DEFENCE), llIIllllIl[65])) {
            bw.putAll(Map.of(llIIllllIl[66], e.c(llIIllllIl[26], llIIllllIl[27]), llIIllllIl[67], e.c(llIIllllIl[55], llIIllllIl[68])));
            bB.putAll(Map.of(llIIllllIl[69], e.c(llIIllllIl[26], llIIllllIl[27]), llIIllllIl[70], e.c(llIIllllIl[55], llIIllllIl[68]), llIIllllIl[57], e.c(llIIllllIl[26], llIIllllIl[27])));
            bA.putAll(Map.of(llIIllllIl[71], e.c(llIIllllIl[34], llIIllllIl[35])));
            bC.putAll(Map.of(llIIllllIl[72], e.c(llIIllllIl[37], llIIllllIl[38]), llIIllllIl[59], e.c(llIIllllIl[37], llIIllllIl[38]), llIIllllIl[73], e.c(llIIllllIl[74], llIIllllIl[75]), llIIllllIl[76], e.c(llIIllllIl[74], llIIllllIl[75])));
            bD.putAll(Map.of(llIIllllIl[63], e.c(llIIllllIl[42], llIIllllIl[43]), llIIllllIl[77], e.c(llIIllllIl[42], llIIllllIl[43]), llIIllllIl[78], e.c(llIIllllIl[42], llIIllllIl[43])));
        }
        if (h.lIlIllllIlIll(Skills.getLevel((Skill)Skill.DEFENCE), llIIllllIl[65]) && h.lIlIllllIIllI(Skills.getLevel((Skill)Skill.DEFENCE), llIIllllIl[79])) {
            bw.putAll(Map.of(llIIllllIl[66], e.c(llIIllllIl[26], llIIllllIl[27]), llIIllllIl[80], e.c(llIIllllIl[55], llIIllllIl[68]), llIIllllIl[128], e.c(llIIllllIl[82], llIIllllIl[83])));
            bB.putAll(Map.of(llIIllllIl[69], e.c(llIIllllIl[26], llIIllllIl[27]), llIIllllIl[84], e.c(llIIllllIl[55], llIIllllIl[68]), llIIllllIl[85], e.c(llIIllllIl[82], llIIllllIl[83])));
            bA.putAll(Map.of(llIIllllIl[89], e.c(llIIllllIl[90], llIIllllIl[91])));
            bC.putAll(Map.of(llIIllllIl[72], e.c(llIIllllIl[37], llIIllllIl[38]), llIIllllIl[92], e.c(llIIllllIl[74], llIIllllIl[75]), llIIllllIl[73], e.c(llIIllllIl[74], llIIllllIl[75]), llIIllllIl[76], e.c(llIIllllIl[74], llIIllllIl[75])));
            bD.putAll(Map.of(llIIllllIl[93], e.c(llIIllllIl[42], llIIllllIl[43]), llIIllllIl[77], e.c(llIIllllIl[42], llIIllllIl[43]), llIIllllIl[96], e.c(llIIllllIl[94], llIIllllIl[95])));
        }
        bx.putAll(Map.of(llIIllllIl[129], e.c(llIIllllIl[98], llIIllllIl[42]), llIIllllIl[97], e.c(llIIllllIl[98], llIIllllIl[42]), llIIllllIl[99], e.c(llIIllllIl[98], llIIllllIl[42]), llIIllllIl[100], e.c(llIIllllIl[101], llIIllllIl[102]), llIIllllIl[103], e.c(llIIllllIl[98], llIIllllIl[42])));
        by.putAll(Map.of(llIIllllIl[104], e.c(llIIllllIl[105], llIIllllIl[106]), llIIllllIl[107], e.c(llIIllllIl[105], llIIllllIl[106]), llIIllllIl[108], e.c(llIIllllIl[105], llIIllllIl[106]), llIIllllIl[109], e.c(llIIllllIl[105], llIIllllIl[106]), llIIllllIl[110], e.c(llIIllllIl[105], llIIllllIl[106])));
        bz.putAll(Map.of(llIIllllIl[130], e.c(llIIllllIl[131], llIIllllIl[132]), llIIllllIl[133], e.c(llIIllllIl[131], llIIllllIl[132]), llIIllllIl[134], e.c(llIIllllIl[131], llIIllllIl[132]), llIIllllIl[135], e.c(llIIllllIl[131], llIIllllIl[132])));
        bE.putAll(Map.of(llIIllllIl[136], e.c(llIIllllIl[137], llIIllllIl[68])));
        bF.putAll(Map.of(llIIllllIl[119], e.c(llIIllllIl[115], llIIllllIl[116]), llIIllllIl[138], e.c(llIIllllIl[115], llIIllllIl[116]), llIIllllIl[139], e.c(llIIllllIl[115], llIIllllIl[116]), llIIllllIl[140], e.c(llIIllllIl[115], llIIllllIl[116]), llIIllllIl[141], e.c(llIIllllIl[115], llIIllllIl[116])));
        if (h.lIlIllllIlIll(Skills.getLevel((Skill)Skill.DEFENCE), llIIllllIl[5]) && h.lIlIllllIIllI(Skills.getLevel((Skill)Skill.DEFENCE), llIIllllIl[46])) {
            bF.putAll(Map.of(llIIllllIl[142], e.c(llIIllllIl[115], llIIllllIl[116])));
        }
        if (h.lIlIllllIlIll(Skills.getLevel((Skill)Skill.DEFENCE), llIIllllIl[46]) && h.lIlIllllIIllI(Skills.getLevel((Skill)Skill.DEFENCE), llIIllllIl[52])) {
            bF.putAll(Map.of(llIIllllIl[143], e.c(llIIllllIl[115], llIIllllIl[116])));
        }
        if (h.lIlIllllIlIll(Skills.getLevel((Skill)Skill.DEFENCE), llIIllllIl[65]) && h.lIlIllllIIllI(Skills.getLevel((Skill)Skill.DEFENCE), llIIllllIl[79])) {
            bF.putAll(Map.of(llIIllllIl[144], e.c(llIIllllIl[115], llIIllllIl[116])));
        }
        bG.putAll(Map.of(llIIllllIl[16], e.c(llIIllllIl[145], llIIllllIl[146])));
    }

    private static void lIlIllllIIIlI() {
        llIIllllII = new String[llIIllllIl[205]];
        h.llIIllllII[h.llIIllllIl[0]] = "f2pmelee";
        h.llIIllllII[h.llIIllllIl[1]] = "f2pquest";
        h.llIIllllII[h.llIIllllIl[2]] = "f2pmage";
        h.llIIllllII[h.llIIllllIl[3]] = "mage";
        h.llIIllllII[h.llIIllllIl[4]] = "quest";
        h.llIIllllII[h.llIIllllIl[5]] = "questNoWep";
        h.llIIllllII[h.llIIllllIl[6]] = "melee";
        h.llIIllllII[h.llIIllllIl[7]] = "agility";
        h.llIIllllII[h.llIIllllIl[8]] = "meleeNmz";
        h.llIIllllII[h.llIIllllIl[9]] = "rangeNmz";
        h.llIIllllII[h.llIIllllIl[10]] = "Randomized Equipment:";
        h.llIIllllII[h.llIIllllIl[11]] = "Buying items";
        h.llIIllllII[h.llIIllllIl[12]] = "Finished buying items, switching back to randomGearing";
        h.llIIllllII[h.llIIllllIl[13]] = "Navigating to bank";
        h.llIIllllII[h.llIIllllIl[14]] = "Handling banking";
        h.llIIllllII[h.llIIllllIl[19]] = "We are missing random gear, switching to BUYING";
        h.llIIllllII[h.llIIllllIl[20]] = "We are missing random gear, switching to BUYING";
        h.llIIllllII[h.llIIllllIl[21]] = "We are missing random gear, switching to BUYING";
        h.llIIllllII[h.llIIllllIl[24]] = "Finished gearing random";
        h.llIIllllII[h.llIIllllIl[203]] = "Unexpected error occurred while getting a random key.";
        h.llIIllllII[h.llIIllllIl[46]] = "Random gear lists CLEARED";
        h.llIIllllII[h.llIIllllIl[204]] = "wealth";
    }

    private static boolean lIlIllllIlIlI(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIlIllllIlIII(int n2) {
        return n2 > 0;
    }

    private static void V() {
        bw.putAll(Map.of(llIIllllIl[184], e.c(llIIllllIl[26], llIIllllIl[27]), llIIllllIl[185], e.c(llIIllllIl[26], llIIllllIl[27]), llIIllllIl[186], e.c(llIIllllIl[187], llIIllllIl[98]), llIIllllIl[188], e.c(llIIllllIl[187], llIIllllIl[98]), llIIllllIl[189], e.c(llIIllllIl[187], llIIllllIl[98]), llIIllllIl[190], e.c(llIIllllIl[187], llIIllllIl[98]), llIIllllIl[191], e.c(llIIllllIl[187], llIIllllIl[98]), llIIllllIl[192], e.c(llIIllllIl[115], llIIllllIl[146]), llIIllllIl[193], e.c(llIIllllIl[26], llIIllllIl[27])));
        bw.putAll(Map.of(llIIllllIl[25], e.c(llIIllllIl[187], llIIllllIl[98]), llIIllllIl[194], e.c(llIIllllIl[187], llIIllllIl[98]), llIIllllIl[195], e.c(llIIllllIl[187], llIIllllIl[98])));
        bx.putAll(Map.of(llIIllllIl[97], e.c(llIIllllIl[98], llIIllllIl[42]), llIIllllIl[99], e.c(llIIllllIl[98], llIIllllIl[42]), llIIllllIl[196], e.c(llIIllllIl[98], llIIllllIl[42])));
        by.putAll(Map.of(llIIllllIl[104], e.c(llIIllllIl[105], llIIllllIl[106]), llIIllllIl[107], e.c(llIIllllIl[105], llIIllllIl[106]), llIIllllIl[108], e.c(llIIllllIl[105], llIIllllIl[106]), llIIllllIl[109], e.c(llIIllllIl[105], llIIllllIl[106]), llIIllllIl[110], e.c(llIIllllIl[105], llIIllllIl[106])));
        bz.putAll(Map.of());
        bA.putAll(Map.of(llIIllllIl[197], e.c(llIIllllIl[34], llIIllllIl[35])));
        bC.putAll(Map.of(llIIllllIl[198], e.c(llIIllllIl[37], llIIllllIl[38]), llIIllllIl[199], e.c(llIIllllIl[37], llIIllllIl[38]), llIIllllIl[200], e.c(llIIllllIl[37], llIIllllIl[38])));
        bD.putAll(Map.of(llIIllllIl[201], e.c(llIIllllIl[42], llIIllllIl[43]), llIIllllIl[202], e.c(llIIllllIl[42], llIIllllIl[43])));
        bE.putAll(Map.of(llIIllllIl[114], e.c(llIIllllIl[137], llIIllllIl[68]), llIIllllIl[118], e.c(llIIllllIl[115], llIIllllIl[116]), llIIllllIl[117], e.c(llIIllllIl[115], llIIllllIl[116])));
        bF.putAll(Map.of(llIIllllIl[119], e.c(llIIllllIl[115], llIIllllIl[116]), llIIllllIl[121], e.c(llIIllllIl[115], llIIllllIl[116]), llIIllllIl[122], e.c(llIIllllIl[115], llIIllllIl[116]), llIIllllIl[120], e.c(llIIllllIl[115], llIIllllIl[116])));
        bG.putAll(Map.of(llIIllllIl[123], e.c(llIIllllIl[115], llIIllllIl[116]), llIIllllIl[125], e.c(llIIllllIl[115], llIIllllIl[116]), llIIllllIl[126], e.c(llIIllllIl[115], llIIllllIl[116])));
    }

    /*
     * WARNING - void declaration
     */
    private static int a(Map<Integer, Integer> map, Random random) {
        Map<Integer, Integer> var1;
        void var2;
        if (h.lIlIllllIIlII(map.isEmpty() ? 1 : 0)) {
            return llIIllllIl[0];
        }
        int var3 = var2.nextInt(var1.size());
        int var4 = llIIllllIl[0];
        Iterator<Integer> var5 = var1.keySet().iterator();
        while (h.lIlIllllIIlII(var5.hasNext() ? 1 : 0)) {
            int var6 = var5.next();
            if (h.lIlIllllIlIIl(var4, var3)) {
                return var6;
            }
            ++var4;

            if (1 <= 2) continue;
            return 2 & (2 ^ -1);
        }
        throw new IllegalStateException(llIIllllII[llIIllllIl[203]]);
    }

    private static void R() {
        if (h.lIlIllllIIllI(Skills.getLevel((Skill)Skill.DEFENCE), llIIllllIl[5])) {
            bw.putAll(Map.of(llIIllllIl[25], e.c(llIIllllIl[26], llIIllllIl[27]), llIIllllIl[28], e.c(llIIllllIl[26], llIIllllIl[27])));
            bB.putAll(Map.of(llIIllllIl[29], e.c(llIIllllIl[30], llIIllllIl[31]), llIIllllIl[32], e.c(llIIllllIl[30], llIIllllIl[31])));
            bA.putAll(Map.of(llIIllllIl[33], e.c(llIIllllIl[34], llIIllllIl[35])));
            bC.putAll(Map.of(llIIllllIl[36], e.c(llIIllllIl[37], llIIllllIl[38]), llIIllllIl[39], e.c(llIIllllIl[37], llIIllllIl[38]), llIIllllIl[40], e.c(llIIllllIl[37], llIIllllIl[38])));
            bD.putAll(Map.of(llIIllllIl[41], e.c(llIIllllIl[42], llIIllllIl[43]), llIIllllIl[44], e.c(llIIllllIl[42], llIIllllIl[43]), llIIllllIl[45], e.c(llIIllllIl[42], llIIllllIl[43])));
        }
        if (h.lIlIllllIlIll(Skills.getLevel((Skill)Skill.DEFENCE), llIIllllIl[5]) && h.lIlIllllIIllI(Skills.getLevel((Skill)Skill.DEFENCE), llIIllllIl[46])) {
            bw.putAll(Map.of(llIIllllIl[47], e.c(llIIllllIl[26], llIIllllIl[27])));
            bB.putAll(Map.of(llIIllllIl[48], e.c(llIIllllIl[26], llIIllllIl[27]), llIIllllIl[32], e.c(llIIllllIl[30], llIIllllIl[31])));
            bA.putAll(Map.of(llIIllllIl[49], e.c(llIIllllIl[34], llIIllllIl[35])));
            bC.putAll(Map.of(llIIllllIl[50], e.c(llIIllllIl[37], llIIllllIl[38]), llIIllllIl[39], e.c(llIIllllIl[37], llIIllllIl[38])));
            bD.putAll(Map.of(llIIllllIl[41], e.c(llIIllllIl[42], llIIllllIl[43]), llIIllllIl[51], e.c(llIIllllIl[42], llIIllllIl[43])));
        }
        if (h.lIlIllllIlIll(Skills.getLevel((Skill)Skill.DEFENCE), llIIllllIl[46]) && h.lIlIllllIIllI(Skills.getLevel((Skill)Skill.DEFENCE), llIIllllIl[52])) {
            bw.putAll(Map.of(llIIllllIl[53], e.c(llIIllllIl[26], llIIllllIl[27]), llIIllllIl[47], e.c(llIIllllIl[26], llIIllllIl[27]), llIIllllIl[54], e.c(llIIllllIl[55], llIIllllIl[56])));
            bB.putAll(Map.of(llIIllllIl[57], e.c(llIIllllIl[26], llIIllllIl[27]), llIIllllIl[48], e.c(llIIllllIl[26], llIIllllIl[27])));
            bA.putAll(Map.of(llIIllllIl[58], e.c(llIIllllIl[34], llIIllllIl[35])));
            bC.putAll(Map.of(llIIllllIl[50], e.c(llIIllllIl[37], llIIllllIl[38]), llIIllllIl[59], e.c(llIIllllIl[37], llIIllllIl[38]), llIIllllIl[60], e.c(llIIllllIl[61], llIIllllIl[62])));
            bD.putAll(Map.of(llIIllllIl[63], e.c(llIIllllIl[42], llIIllllIl[43]), llIIllllIl[51], e.c(llIIllllIl[42], llIIllllIl[43]), llIIllllIl[64], e.c(llIIllllIl[42], llIIllllIl[43])));
        }
        if (h.lIlIllllIlIll(Skills.getLevel((Skill)Skill.DEFENCE), llIIllllIl[52]) && h.lIlIllllIIllI(Skills.getLevel((Skill)Skill.DEFENCE), llIIllllIl[65])) {
            bw.putAll(Map.of(llIIllllIl[66], e.c(llIIllllIl[26], llIIllllIl[27]), llIIllllIl[67], e.c(llIIllllIl[55], llIIllllIl[68])));
            bB.putAll(Map.of(llIIllllIl[69], e.c(llIIllllIl[26], llIIllllIl[27]), llIIllllIl[70], e.c(llIIllllIl[55], llIIllllIl[68]), llIIllllIl[57], e.c(llIIllllIl[26], llIIllllIl[27])));
            bA.putAll(Map.of(llIIllllIl[71], e.c(llIIllllIl[34], llIIllllIl[35])));
            bC.putAll(Map.of(llIIllllIl[72], e.c(llIIllllIl[37], llIIllllIl[38]), llIIllllIl[59], e.c(llIIllllIl[37], llIIllllIl[38]), llIIllllIl[73], e.c(llIIllllIl[74], llIIllllIl[75]), llIIllllIl[76], e.c(llIIllllIl[74], llIIllllIl[75])));
            bD.putAll(Map.of(llIIllllIl[63], e.c(llIIllllIl[42], llIIllllIl[43]), llIIllllIl[77], e.c(llIIllllIl[42], llIIllllIl[43]), llIIllllIl[78], e.c(llIIllllIl[42], llIIllllIl[43])));
        }
        if (h.lIlIllllIlIll(Skills.getLevel((Skill)Skill.DEFENCE), llIIllllIl[65]) && h.lIlIllllIIllI(Skills.getLevel((Skill)Skill.DEFENCE), llIIllllIl[79])) {
            bw.putAll(Map.of(llIIllllIl[66], e.c(llIIllllIl[26], llIIllllIl[27]), llIIllllIl[80], e.c(llIIllllIl[55], llIIllllIl[68]), llIIllllIl[81], e.c(llIIllllIl[82], llIIllllIl[83])));
            bB.putAll(Map.of(llIIllllIl[69], e.c(llIIllllIl[26], llIIllllIl[27]), llIIllllIl[84], e.c(llIIllllIl[55], llIIllllIl[68]), llIIllllIl[85], e.c(llIIllllIl[82], llIIllllIl[83]), llIIllllIl[86], e.c(llIIllllIl[82], llIIllllIl[83]), llIIllllIl[87], e.c(llIIllllIl[82], llIIllllIl[83]), llIIllllIl[88], e.c(llIIllllIl[82], llIIllllIl[83])));
            bA.putAll(Map.of(llIIllllIl[89], e.c(llIIllllIl[90], llIIllllIl[91])));
            bC.putAll(Map.of(llIIllllIl[72], e.c(llIIllllIl[37], llIIllllIl[38]), llIIllllIl[92], e.c(llIIllllIl[74], llIIllllIl[75]), llIIllllIl[73], e.c(llIIllllIl[74], llIIllllIl[75])));
            bD.putAll(Map.of(llIIllllIl[93], e.c(llIIllllIl[94], llIIllllIl[95]), llIIllllIl[96], e.c(llIIllllIl[94], llIIllllIl[95])));
        }
        bx.putAll(Map.of(llIIllllIl[97], e.c(llIIllllIl[98], llIIllllIl[42]), llIIllllIl[99], e.c(llIIllllIl[98], llIIllllIl[42]), llIIllllIl[100], e.c(llIIllllIl[101], llIIllllIl[102]), llIIllllIl[103], e.c(llIIllllIl[98], llIIllllIl[42])));
        by.putAll(Map.of(llIIllllIl[104], e.c(llIIllllIl[105], llIIllllIl[106]), llIIllllIl[107], e.c(llIIllllIl[105], llIIllllIl[106]), llIIllllIl[108], e.c(llIIllllIl[105], llIIllllIl[106]), llIIllllIl[109], e.c(llIIllllIl[105], llIIllllIl[106]), llIIllllIl[110], e.c(llIIllllIl[105], llIIllllIl[106])));
        bz.putAll(Map.of(llIIllllIl[111], e.c(llIIllllIl[112], llIIllllIl[113])));
        bE.putAll(Map.of(llIIllllIl[114], e.c(llIIllllIl[115], llIIllllIl[116]), llIIllllIl[117], e.c(llIIllllIl[115], llIIllllIl[116]), llIIllllIl[118], e.c(llIIllllIl[115], llIIllllIl[116])));
        bF.putAll(Map.of(llIIllllIl[119], e.c(llIIllllIl[115], llIIllllIl[116]), llIIllllIl[120], e.c(llIIllllIl[115], llIIllllIl[116]), llIIllllIl[121], e.c(llIIllllIl[115], llIIllllIl[116]), llIIllllIl[122], e.c(llIIllllIl[115], llIIllllIl[116])));
        bG.putAll(Map.of(llIIllllIl[123], e.c(llIIllllIl[115], llIIllllIl[116]), llIIllllIl[124], e.c(llIIllllIl[115], llIIllllIl[116]), llIIllllIl[125], e.c(llIIllllIl[115], llIIllllIl[116]), llIIllllIl[126], e.c(llIIllllIl[115], llIIllllIl[116])));
    }

    private static boolean lIlIllllIIlll(Object object) {
        return object != null;
    }

    static {
        h.lIlIllllIIIll();
        h.lIlIllllIIIlI();
        bv = new ArrayList<d>();
        bw = new HashMap<Integer, Integer>();
        bx = new HashMap<Integer, Integer>();
        by = new HashMap<Integer, Integer>();
        bz = new HashMap<Integer, Integer>();
        bA = new HashMap<Integer, Integer>();
        bB = new HashMap<Integer, Integer>();
        bC = new HashMap<Integer, Integer>();
        bD = new HashMap<Integer, Integer>();
        bE = new HashMap<Integer, Integer>();
        bF = new HashMap<Integer, Integer>();
        bG = new HashMap<Integer, Integer>();
    }

    private static void Q() {
        d var7;
        if (h.lIlIllllIIlII(bH)) {
            int[] nArray = new int[llIIllllIl[1]];
            nArray[h.llIIllllIl[0]] = bH;
            if (h.lIlIllllIIlIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                d d2 = new DHelper(bH, llIIllllIl[1], bS);
                bv.add(d2);

            }
        }
        if (h.lIlIllllIIlII(bI)) {
            int[] nArray = new int[llIIllllIl[1]];
            nArray[h.llIIllllIl[0]] = bI;
            if (h.lIlIllllIIlIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                var7 = new DHelper(bI, llIIllllIl[1], bT);
                bv.add(var7);

            }
        }
        if (h.lIlIllllIIlII(bJ)) {
            int[] nArray = new int[llIIllllIl[1]];
            nArray[h.llIIllllIl[0]] = bJ;
            if (h.lIlIllllIIlIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                var7 = new DHelper(bJ, llIIllllIl[1], bU);
                bv.add(var7);

            }
        }
        if (h.lIlIllllIIlII(bK)) {
            int[] nArray = new int[llIIllllIl[1]];
            nArray[h.llIIllllIl[0]] = bK;
            if (h.lIlIllllIIlIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                var7 = new DHelper(bK, llIIllllIl[1], bV);
                bv.add(var7);

            }
        }
        if (h.lIlIllllIIlII(bL)) {
            int[] nArray = new int[llIIllllIl[1]];
            nArray[h.llIIllllIl[0]] = bL;
            if (h.lIlIllllIIlIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                var7 = new DHelper(bL, llIIllllIl[1], bW);
                bv.add(var7);

            }
        }
        if (h.lIlIllllIIlII(bM)) {
            int[] nArray = new int[llIIllllIl[1]];
            nArray[h.llIIllllIl[0]] = bM;
            if (h.lIlIllllIIlIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                var7 = new DHelper(bM, llIIllllIl[1], bX);
                bv.add(var7);

            }
        }
        if (h.lIlIllllIIlII(bN)) {
            int[] nArray = new int[llIIllllIl[1]];
            nArray[h.llIIllllIl[0]] = bN;
            if (h.lIlIllllIIlIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                var7 = new DHelper(bN, llIIllllIl[1], bY);
                bv.add(var7);

            }
        }
        if (h.lIlIllllIIlII(bO)) {
            int[] nArray = new int[llIIllllIl[1]];
            nArray[h.llIIllllIl[0]] = bO;
            if (h.lIlIllllIIlIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                var7 = new DHelper(bO, llIIllllIl[1], bZ);
                bv.add(var7);

            }
        }
        if (h.lIlIllllIIlII(bP)) {
            int[] nArray = new int[llIIllllIl[1]];
            nArray[h.llIIllllIl[0]] = bP;
            if (h.lIlIllllIIlIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                var7 = new DHelper(bP, llIIllllIl[1], ca);
                bv.add(var7);

            }
        }
        if (h.lIlIllllIIlII(bQ)) {
            int[] nArray = new int[llIIllllIl[1]];
            nArray[h.llIIllllIl[0]] = bQ;
            if (h.lIlIllllIIlIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                var7 = new DHelper(bQ, llIIllllIl[1], cb);
                bv.add(var7);

            }
        }
        if (h.lIlIllllIIlII(bR)) {
            int[] nArray = new int[llIIllllIl[1]];
            nArray[h.llIIllllIl[0]] = bR;
            if (h.lIlIllllIIlIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                if (h.lIlIllllIlIIl(bR, llIIllllIl[16])) {
                    int[] nArray2 = new int[llIIllllIl[1]];
                    nArray2[h.llIIllllIl[0]] = llIIllllIl[16];
                    if (h.lIlIllllIIlIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                        int[] nArray3 = new int[llIIllllIl[1]];
                        nArray3[h.llIIllllIl[0]] = llIIllllIl[17];
                        if (h.lIlIllllIIlIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
                            int[] nArray4 = new int[llIIllllIl[1]];
                            nArray4[h.llIIllllIl[0]] = llIIllllIl[18];
                            if (h.lIlIllllIIlIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
                                var7 = new DHelper(bR, llIIllllIl[1], cc);
                                bv.add(var7);

                                if ((0x95 ^ 0x91) < 0) {
                                    return;
                                }
                            }
                        }
                    }
                } else {
                    var7 = new DHelper(bR, llIIllllIl[1], cc);
                    bv.add(var7);

                }
            }
        }
    }

    public static boolean c(int[] nArray) {
        int[] var8;
        int var9 = llIIllllIl[0];
        while (h.lIlIllllIIllI(var9, var8.length)) {
            if (h.lIlIllllIlIII(var8[var9])) {
                int[] nArray2 = new int[llIIllllIl[1]];
                nArray2[h.llIIllllIl[0]] = var8[var9];
                if (h.lIlIllllIIlIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    System.out.println("Missing ID: " + var8[var9]);
                    return llIIllllIl[0];
                }
            }
            ++var9;

            if (((0x22 ^ 0xE ^ (0x69 ^ 0x5F)) & (0x4C ^ 0x7F ^ (0x6B ^ 0x42) ^ -1)) == ((0x57 ^ 0x23 ^ (0xB5 ^ 0x99)) & (92 + 170 - 67 + 35 ^ 23 + 175 - 74 + 66 ^ -1))) continue;
            return ((0xFF ^ 0xC5 ^ (0x82 ^ 0xBC)) & (0x22 ^ 0x66 ^ (0xD1 ^ 0x91) ^ -1)) != 0;
        }
        return llIIllllIl[1];
    }

    private static boolean lIlIllllIIlIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIllllIIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIllllIlIll(int n2, int n3) {
        return n2 >= n3;
    }

    public static void X() {
        bw.clear();
        bx.clear();
        by.clear();
        bz.clear();
        bA.clear();
        bB.clear();
        bC.clear();
        bD.clear();
        bE.clear();
        bF.clear();
        bG.clear();
        bQ = bR = llIIllllIl[0];
        bP = bR;
        bO = bR;
        bN = bR;
        bM = bR;
        bL = bR;
        bK = bR;
        bJ = bR;
        bI = bR;
        bH = bR;
        cb = cc = llIIllllIl[0];
        ca = cc;
        bZ = cc;
        bY = cc;
        bX = cc;
        bW = cc;
        bV = cc;
        bU = cc;
        bT = cc;
        bS = cc;
        bu = llIIllllIl[0];
        System.out.println(llIIllllII[llIIllllIl[46]]);
    }

    private static boolean lIlIllllIIlII(int n2) {
        return n2 != 0;
    }

    private static void U() {
        bw.putAll(Map.of(llIIllllIl[168], e.c(llIIllllIl[163], llIIllllIl[164])));
        bB.putAll(Map.of(llIIllllIl[169], e.c(llIIllllIl[170], llIIllllIl[171])));
        bA.putAll(Map.of(llIIllllIl[172], e.c(llIIllllIl[152], llIIllllIl[153])));
        bC.putAll(Map.of(llIIllllIl[173], e.c(llIIllllIl[174], llIIllllIl[175])));
        bD.putAll(Map.of(llIIllllIl[176], e.c(llIIllllIl[177], llIIllllIl[178])));
        bx.putAll(Map.of(llIIllllIl[179], e.c(llIIllllIl[180], llIIllllIl[181])));
        by.putAll(Map.of(llIIllllIl[182], e.c(llIIllllIl[163], llIIllllIl[164])));
        bz.putAll(Map.of(llIIllllIl[134], e.c(llIIllllIl[131], llIIllllIl[132])));
        bE.putAll(Map.of(llIIllllIl[136], e.c(llIIllllIl[137], llIIllllIl[68])));
        bF.putAll(Map.of(llIIllllIl[183], e.c(llIIllllIl[166], llIIllllIl[167])));
        bG.putAll(Map.of(llIIllllIl[16], e.c(llIIllllIl[145], llIIllllIl[146])));
    }

    public static void d(String string) {
        if (!h.lIlIllllIIlII(bH) || h.lIlIllllIIlIl(bN)) {
            String var10;
            if (h.lIlIllllIIlII(var10.equalsIgnoreCase(llIIllllII[llIIllllIl[0]]) ? 1 : 0)) {
                h.R();
            }
            if (h.lIlIllllIIlII(var10.equalsIgnoreCase(llIIllllII[llIIllllIl[1]]) ? 1 : 0)) {
                // empty if block
            }
            if (h.lIlIllllIIlII(var10.equalsIgnoreCase(llIIllllII[llIIllllIl[2]]) ? 1 : 0)) {
                h.V();
            }
            if (h.lIlIllllIIlII(var10.equalsIgnoreCase(llIIllllII[llIIllllIl[3]]) ? 1 : 0)) {
                // empty if block
            }
            if (h.lIlIllllIIlII(var10.equalsIgnoreCase(llIIllllII[llIIllllIl[4]]) ? 1 : 0)) {
                // empty if block
            }
            if (h.lIlIllllIIlII(var10.equalsIgnoreCase(llIIllllII[llIIllllIl[5]]) ? 1 : 0)) {
                // empty if block
            }
            if (h.lIlIllllIIlII(var10.equalsIgnoreCase(llIIllllII[llIIllllIl[6]]) ? 1 : 0)) {
                h.S();
            }
            if (h.lIlIllllIIlII(var10.equalsIgnoreCase(llIIllllII[llIIllllIl[7]]) ? 1 : 0)) {
                // empty if block
            }
            if (h.lIlIllllIIlII(var10.equalsIgnoreCase(llIIllllII[llIIllllIl[8]]) ? 1 : 0)) {
                h.U();
            }
            if (h.lIlIllllIIlII(var10.equalsIgnoreCase(llIIllllII[llIIllllIl[9]]) ? 1 : 0)) {
                h.T();
            }
            h.W();
            System.out.println(llIIllllII[llIIllllIl[10]]);
            System.out.println("Helm: " + bH + ", Price: " + bS);
            System.out.println("Amulet: " + bI + ", Price: " + bT);
            System.out.println("Cape: " + bJ + ", Price: " + bU);
            System.out.println("Ammo: " + bK + ", Price: " + bV);
            System.out.println("Weapon: " + bL + ", Price: " + bW);
            System.out.println("Shield: " + bM + ", Price: " + bX);
            System.out.println("Body: " + bN + ", Price: " + bY);
            System.out.println("Legs: " + bO + ", Price: " + bZ);
            System.out.println("Gloves: " + bP + ", Price: " + ca);
            System.out.println("Boots: " + bQ + ", Price: " + cb);
            System.out.println("Ring: " + bR + ", Price: " + cc);
        }
        if (h.lIlIllllIIlII(bH) && h.lIlIllllIIlII(bN)) {
            if (h.lIlIllllIIlII(bt ? 1 : 0)) {
                AccBuilderSotf.c = llIIllllII[llIIllllIl[11]];
                b.a(bv);
                if (h.lIlIllllIIllI(bv.size(), llIIllllIl[1])) {
                    System.out.println(llIIllllII[llIIllllIl[12]]);
                    bt = llIIllllIl[0];
                }
            }
            if (h.lIlIllllIIlIl(bt ? 1 : 0)) {
                BankLocation var11 = BankLocation.getNearest();
                if (h.lIlIllllIIlll(var11) && h.lIlIllllIIlIl(var11.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIIllllII[llIIllllIl[13]];
                    a.a(var11);
                }
                if (h.lIlIllllIIlll(var11) && h.lIlIllllIIlII(var11.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIIllllII[llIIllllIl[14]];
                    if (h.lIlIllllIIlIl(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)llIIllllIl[15]);

                    }
                    if (h.lIlIllllIIlII(Bank.isOpen() ? 1 : 0)) {
                        if (h.lIlIllllIlIII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)llIIllllIl[4]);

                        }
                        if (h.lIlIllllIlIII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)llIIllllIl[2]);

                        }
                        if (h.lIlIllllIlIIl(bR, llIIllllIl[16])) {
                            int[] nArray = new int[llIIllllIl[1]];
                            nArray[h.llIIllllIl[0]] = llIIllllIl[17];
                            if (h.lIlIllllIIlIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray2 = new int[llIIllllIl[1]];
                                nArray2[h.llIIllllIl[0]] = llIIllllIl[16];
                                if (h.lIlIllllIIlIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                                    int[] nArray3 = new int[llIIllllIl[1]];
                                    nArray3[h.llIIllllIl[0]] = llIIllllIl[18];
                                    if (h.lIlIllllIIlIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                        h.Q();
                                        System.out.println(llIIllllII[llIIllllIl[19]]);
                                        bt = llIIllllIl[1];
                                        return;
                                    }
                                }
                            }
                            int[] nArray4 = new int[llIIllllIl[10]];
                            nArray4[h.llIIllllIl[0]] = bH;
                            nArray4[h.llIIllllIl[1]] = bI;
                            nArray4[h.llIIllllIl[2]] = bJ;
                            nArray4[h.llIIllllIl[3]] = bK;
                            nArray4[h.llIIllllIl[4]] = bL;
                            nArray4[h.llIIllllIl[5]] = bM;
                            nArray4[h.llIIllllIl[6]] = bN;
                            nArray4[h.llIIllllIl[7]] = bO;
                            nArray4[h.llIIllllIl[8]] = bP;
                            nArray4[h.llIIllllIl[9]] = bQ;
                            if (h.lIlIllllIIlIl(h.c(nArray4) ? 1 : 0)) {
                                h.Q();
                                System.out.println(llIIllllII[llIIllllIl[20]]);
                                bt = llIIllllIl[1];
                                return;
                            }
                        }
                        if (h.lIlIllllIlIlI(bR, llIIllllIl[16])) {
                            int[] nArray = new int[llIIllllIl[11]];
                            nArray[h.llIIllllIl[0]] = bH;
                            nArray[h.llIIllllIl[1]] = bI;
                            nArray[h.llIIllllIl[2]] = bJ;
                            nArray[h.llIIllllIl[3]] = bK;
                            nArray[h.llIIllllIl[4]] = bL;
                            nArray[h.llIIllllIl[5]] = bM;
                            nArray[h.llIIllllIl[6]] = bN;
                            nArray[h.llIIllllIl[7]] = bO;
                            nArray[h.llIIllllIl[8]] = bP;
                            nArray[h.llIIllllIl[9]] = bQ;
                            nArray[h.llIIllllIl[10]] = bR;
                            if (h.lIlIllllIIlIl(h.c(nArray) ? 1 : 0)) {
                                h.Q();
                                System.out.println(llIIllllII[llIIllllIl[21]]);
                                bt = llIIllllIl[1];
                                return;
                            }
                        }
                        if (h.lIlIllllIIlII(h.n(bR) ? 1 : 0)) {
                            int[] nArray = new int[llIIllllIl[11]];
                            nArray[h.llIIllllIl[0]] = bH;
                            nArray[h.llIIllllIl[1]] = bI;
                            nArray[h.llIIllllIl[2]] = bJ;
                            nArray[h.llIIllllIl[3]] = bK;
                            nArray[h.llIIllllIl[4]] = bL;
                            nArray[h.llIIllllIl[5]] = bM;
                            nArray[h.llIIllllIl[6]] = bN;
                            nArray[h.llIIllllIl[7]] = bO;
                            nArray[h.llIIllllIl[8]] = bP;
                            nArray[h.llIIllllIl[9]] = bQ;
                            nArray[h.llIIllllIl[10]] = bR;
                            int[] var12 = nArray;
                            if (h.lIlIllllIlIIl(bR, llIIllllIl[16])) {
                                int[] nArray5 = new int[llIIllllIl[1]];
                                nArray5[h.llIIllllIl[0]] = llIIllllIl[16];
                                if (h.lIlIllllIIlIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                    int[] nArray6 = new int[llIIllllIl[1]];
                                    nArray6[h.llIIllllIl[0]] = llIIllllIl[17];
                                    if (h.lIlIllllIIlII(Bank.contains((int[])nArray6) ? 1 : 0)) {
                                        a.a(llIIllllIl[17], llIIllllIl[1]);
                                    }
                                }
                                int[] nArray7 = new int[llIIllllIl[1]];
                                nArray7[h.llIIllllIl[0]] = llIIllllIl[16];
                                if (h.lIlIllllIIlIl(Bank.contains((int[])nArray7) ? 1 : 0)) {
                                    int[] nArray8 = new int[llIIllllIl[1]];
                                    nArray8[h.llIIllllIl[0]] = llIIllllIl[17];
                                    if (h.lIlIllllIIlIl(Bank.contains((int[])nArray8) ? 1 : 0)) {
                                        int[] nArray9 = new int[llIIllllIl[1]];
                                        nArray9[h.llIIllllIl[0]] = llIIllllIl[17];
                                        if (h.lIlIllllIIlIl(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                                            int[] nArray10 = new int[llIIllllIl[1]];
                                            nArray10[h.llIIllllIl[0]] = llIIllllIl[18];
                                            if (h.lIlIllllIIlII(Bank.contains((int[])nArray10) ? 1 : 0)) {
                                                a.a(llIIllllIl[18], llIIllllIl[1]);
                                            }
                                        }
                                    }
                                }
                            }
                            a.a(var12, llIIllllIl[1]);
                            Time.sleepTicks((int)e.c(llIIllllIl[10], llIIllllIl[14]));

                            if (h.lIlIllllIIlII(Bank.isOpen() ? 1 : 0)) {
                                Bank.close();
                                Time.sleepTicks((int)e.c(llIIllllIl[3], llIIllllIl[5]));

                            }
                            while (!h.lIlIllllIIlIl(Inventory.contains((int[])var12) ? 1 : 0) || h.lIlIllllIIlII(Inventory.contains(item -> {
                                int n2;
                                if (h.lIlIllllIIlII(item.getName().contains(llIIllllII[llIIllllIl[204]]) ? 1 : 0) && h.lIlIllllIIlIl(item.isNoted() ? 1 : 0)) {
                                    n2 = llIIllllIl[1];

                                    if (3 <= 0) {
                                        return ((26 + 34 - 32 + 111 ^ 156 + 21 - 59 + 40) & (0x8C ^ 0x9E ^ (0x15 ^ 0x12) ^ -1)) != 0;
                                    }
                                } else {
                                    n2 = llIIllllIl[0];
                                }
                                return n2 != 0;
                            }) ? 1 : 0)) {
                                e.l(bH);
                                e.l(bI);
                                e.l(bJ);
                                e.l(bK);
                                Time.sleepTicks((int)llIIllllIl[1]);

                                e.l(bL);
                                e.l(bM);
                                e.l(bN);
                                Time.sleepTicks((int)llIIllllIl[1]);

                                e.l(bO);
                                e.l(bP);
                                e.l(bQ);
                                e.l(bR);
                                Time.sleepTicks((int)llIIllllIl[1]);

                                e.l(llIIllllIl[16]);
                                e.l(llIIllllIl[17]);
                                e.l(llIIllllIl[18]);
                                e.l(llIIllllIl[22]);
                                e.l(llIIllllIl[23]);

                                if ((0xA ^ 0x2A ^ (0x47 ^ 0x63)) > -1) continue;
                                return;
                            }
                            if (h.lIlIllllIIlIl(Bank.isOpen() ? 1 : 0)) {
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)llIIllllIl[15]);

                                Time.sleepTicks((int)llIIllllIl[4]);

                                System.out.println(llIIllllII[llIIllllIl[24]]);
                                bu = llIIllllIl[1];
                            }
                        }
                    }
                }
            }
        }
    }

        return String.valueOf(var13);
    }

    private static void T() {
        if (h.lIlIllllIIllI(Skills.getLevel((Skill)Skill.RANGED), llIIllllIl[147])) {
            bw.putAll(Map.of(llIIllllIl[148], e.c(llIIllllIl[149], llIIllllIl[150])));
        }
        if (h.lIlIllllIlIll(Skills.getLevel((Skill)Skill.RANGED), llIIllllIl[147])) {
            bw.putAll(Map.of(llIIllllIl[148], e.c(llIIllllIl[149], llIIllllIl[150])));
        }
        bA.putAll(Map.of(llIIllllIl[151], e.c(llIIllllIl[152], llIIllllIl[153])));
        if (h.lIlIllllIIllI(Skills.getLevel((Skill)Skill.RANGED), llIIllllIl[79])) {
            bC.putAll(Map.of(llIIllllIl[154], e.c(llIIllllIl[131], llIIllllIl[132])));
        }
        if (h.lIlIllllIlIll(Skills.getLevel((Skill)Skill.RANGED), llIIllllIl[79]) && h.lIlIllllIIllI(Skills.getLevel((Skill)Skill.RANGED), llIIllllIl[147])) {
            bC.putAll(Map.of(llIIllllIl[155], e.c(llIIllllIl[131], llIIllllIl[132])));
        }
        if (h.lIlIllllIlIll(Skills.getLevel((Skill)Skill.RANGED), llIIllllIl[147])) {
            bC.putAll(Map.of(llIIllllIl[156], e.c(llIIllllIl[131], llIIllllIl[132])));
        }
        if (h.lIlIllllIIllI(Skills.getLevel((Skill)Skill.RANGED), llIIllllIl[79])) {
            bD.putAll(Map.of(llIIllllIl[157], e.c(llIIllllIl[131], llIIllllIl[132])));
        }
        if (h.lIlIllllIlIll(Skills.getLevel((Skill)Skill.RANGED), llIIllllIl[79]) && h.lIlIllllIIllI(Skills.getLevel((Skill)Skill.RANGED), llIIllllIl[147])) {
            bD.putAll(Map.of(llIIllllIl[158], e.c(llIIllllIl[131], llIIllllIl[132])));
        }
        if (h.lIlIllllIlIll(Skills.getLevel((Skill)Skill.RANGED), llIIllllIl[147])) {
            bD.putAll(Map.of(llIIllllIl[159], e.c(llIIllllIl[131], llIIllllIl[132])));
        }
        bx.putAll(Map.of(llIIllllIl[129], e.c(llIIllllIl[160], llIIllllIl[161])));
        by.putAll(Map.of(llIIllllIl[162], e.c(llIIllllIl[163], llIIllllIl[164])));
        if (h.lIlIllllIIllI(Skills.getLevel((Skill)Skill.RANGED), llIIllllIl[147])) {
            bE.putAll(Map.of(llIIllllIl[136], e.c(llIIllllIl[137], llIIllllIl[68])));
        }
        if (h.lIlIllllIlIll(Skills.getLevel((Skill)Skill.RANGED), llIIllllIl[147])) {
            bE.putAll(Map.of(llIIllllIl[136], e.c(llIIllllIl[137], llIIllllIl[68])));
        }
        if (h.lIlIllllIIllI(Skills.getLevel((Skill)Skill.RANGED), llIIllllIl[147])) {
            bF.putAll(Map.of(llIIllllIl[165], e.c(llIIllllIl[166], llIIllllIl[167])));
        }
        if (h.lIlIllllIlIll(Skills.getLevel((Skill)Skill.RANGED), llIIllllIl[147])) {
            bF.putAll(Map.of(llIIllllIl[165], e.c(llIIllllIl[166], llIIllllIl[167])));
        }
        bG.putAll(Map.of(llIIllllIl[16], e.c(llIIllllIl[145], llIIllllIl[146])));
    }

    private static void W() {
        Random random = new Random();
        bH = h.a(bw, random);
        bS = bw.getOrDefault(bH, llIIllllIl[0]);
        bI = h.a(bx, random);
        bT = bx.getOrDefault(bI, llIIllllIl[0]);
        bJ = h.a(by, random);
        bU = by.getOrDefault(bJ, llIIllllIl[0]);
        bK = h.a(bz, random);
        bV = bz.getOrDefault(bK, llIIllllIl[0]);
        bL = h.a(bA, random);
        bW = bA.getOrDefault(bL, llIIllllIl[0]);
        bM = h.a(bB, random);
        bX = bB.getOrDefault(bM, llIIllllIl[0]);
        bN = h.a(bC, random);
        bY = bC.getOrDefault(bN, llIIllllIl[0]);
        bO = h.a(bD, random);
        bZ = bD.getOrDefault(bO, llIIllllIl[0]);
        bP = h.a(bE, random);
        ca = bE.getOrDefault(bP, llIIllllIl[0]);
        bQ = h.a(bF, random);
        cb = bF.getOrDefault(bQ, llIIllllIl[0]);
        bR = h.a(bG, random);
        cc = bG.getOrDefault(bR, llIIllllIl[0]);
    }
}

