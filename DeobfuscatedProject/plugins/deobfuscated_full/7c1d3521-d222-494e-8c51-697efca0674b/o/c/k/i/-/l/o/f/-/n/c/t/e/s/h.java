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
package o.c.k.i.-.l.o.f.-.n.c.t.e.s;

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
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.a;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.b;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.d;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.e;

public class h {
    private static /* synthetic */ int bH;
    private static /* synthetic */ int bO;
    private static /* synthetic */ Map<Integer, Integer> bB;
    private static /* synthetic */ int bP;
    private static /* synthetic */ Map<Integer, Integer> bx;
    private static /* synthetic */ int bL;
    private static /* synthetic */ Map<Integer, Integer> bw;
    private static /* synthetic */ int ca;
    private static /* synthetic */ int bX;
    private static /* synthetic */ int cb;
    private static /* synthetic */ int bS;
    private static /* synthetic */ Map<Integer, Integer> bF;
    public static /* synthetic */ boolean bt;
    private static /* synthetic */ int bQ;
    private static /* synthetic */ Map<Integer, Integer> by;
    private static /* synthetic */ int cc;
    private static /* synthetic */ int bJ;
    private static /* synthetic */ Map<Integer, Integer> bA;
    private static /* synthetic */ Map<Integer, Integer> bG;
    private static /* synthetic */ Map<Integer, Integer> bC;
    private static /* synthetic */ int bR;
    private static /* synthetic */ int bV;
    public static /* synthetic */ boolean bu;
    public static /* synthetic */ List<d> bv;
    private static /* synthetic */ int bY;
    private static /* synthetic */ int bK;
    private static /* synthetic */ int bN;
    private static /* synthetic */ String[] llIIllllII;
    private static /* synthetic */ int bU;
    private static /* synthetic */ Map<Integer, Integer> bz;
    private static /* synthetic */ int bI;
    private static /* synthetic */ int[] llIIllllIl;
    private static /* synthetic */ int bT;
    private static /* synthetic */ int bZ;
    private static /* synthetic */ int bM;
    private static /* synthetic */ Map<Integer, Integer> bD;
    private static /* synthetic */ Map<Integer, Integer> bE;
    private static /* synthetic */ int bW;

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
        h.llIIllllII[h.llIIllllIl[0]] = h."f2pmelee";
        h.llIIllllII[h.llIIllllIl[1]] = h."f2pquest";
        h.llIIllllII[h.llIIllllIl[2]] = h."f2pmage";
        h.llIIllllII[h.llIIllllIl[3]] = h."mage";
        h.llIIllllII[h.llIIllllIl[4]] = h."quest";
        h.llIIllllII[h.llIIllllIl[5]] = h."questNoWep";
        h.llIIllllII[h.llIIllllIl[6]] = h."melee";
        h.llIIllllII[h.llIIllllIl[7]] = h."agility";
        h.llIIllllII[h.llIIllllIl[8]] = h."meleeNmz";
        h.llIIllllII[h.llIIllllIl[9]] = h."rangeNmz";
        h.llIIllllII[h.llIIllllIl[10]] = h."Randomized Equipment:";
        h.llIIllllII[h.llIIllllIl[11]] = h."Buying items";
        h.llIIllllII[h.llIIllllIl[12]] = h."Finished buying items, switching back to randomGearing";
        h.llIIllllII[h.llIIllllIl[13]] = h."Navigating to bank";
        h.llIIllllII[h.llIIllllIl[14]] = h."Handling banking";
        h.llIIllllII[h.llIIllllIl[19]] = h."We are missing random gear, switching to BUYING";
        h.llIIllllII[h.llIIllllIl[20]] = h."We are missing random gear, switching to BUYING";
        h.llIIllllII[h.llIIllllIl[21]] = h."We are missing random gear, switching to BUYING";
        h.llIIllllII[h.llIIllllIl[24]] = h."Finished gearing random";
        h.llIIllllII[h.llIIllllIl[203]] = h."Unexpected error occurred while getting a random key.";
        h.llIIllllII[h.llIIllllIl[46]] = h."Random gear lists CLEARED";
        h.llIIllllII[h.llIIllllIl[204]] = h."wealth";
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
        Map<Integer, Integer> var8;
        void var5;
        if (h.lIlIllllIIlII(map.isEmpty() ? 1 : 0)) {
            return llIIllllIl[0];
        }
        int var22 = var5.nextInt(var8.size());
        int var10 = llIIllllIl[0];
        Iterator<Integer> var11 = var8.keySet().iterator();
        while (h.lIlIllllIIlII(var11.hasNext() ? 1 : 0)) {
            int var17 = var11.next();
            if (h.lIlIllllIlIIl(var10, var22)) {
                return var17;
            }
            ++var10;
            0;
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
        d var30;
        if (h.lIlIllllIIlII(bH)) {
            int[] nArray = new int[llIIllllIl[1]];
            nArray[h.llIIllllIl[0]] = bH;
            if (h.lIlIllllIIlIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                d d2 = new d(bH, llIIllllIl[1], bS);
                bv.add(d2);
                0;
            }
        }
        if (h.lIlIllllIIlII(bI)) {
            int[] nArray = new int[llIIllllIl[1]];
            nArray[h.llIIllllIl[0]] = bI;
            if (h.lIlIllllIIlIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                var30 = new d(bI, llIIllllIl[1], bT);
                bv.add(var30);
                0;
            }
        }
        if (h.lIlIllllIIlII(bJ)) {
            int[] nArray = new int[llIIllllIl[1]];
            nArray[h.llIIllllIl[0]] = bJ;
            if (h.lIlIllllIIlIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                var30 = new d(bJ, llIIllllIl[1], bU);
                bv.add(var30);
                0;
            }
        }
        if (h.lIlIllllIIlII(bK)) {
            int[] nArray = new int[llIIllllIl[1]];
            nArray[h.llIIllllIl[0]] = bK;
            if (h.lIlIllllIIlIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                var30 = new d(bK, llIIllllIl[1], bV);
                bv.add(var30);
                0;
            }
        }
        if (h.lIlIllllIIlII(bL)) {
            int[] nArray = new int[llIIllllIl[1]];
            nArray[h.llIIllllIl[0]] = bL;
            if (h.lIlIllllIIlIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                var30 = new d(bL, llIIllllIl[1], bW);
                bv.add(var30);
                0;
            }
        }
        if (h.lIlIllllIIlII(bM)) {
            int[] nArray = new int[llIIllllIl[1]];
            nArray[h.llIIllllIl[0]] = bM;
            if (h.lIlIllllIIlIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                var30 = new d(bM, llIIllllIl[1], bX);
                bv.add(var30);
                0;
            }
        }
        if (h.lIlIllllIIlII(bN)) {
            int[] nArray = new int[llIIllllIl[1]];
            nArray[h.llIIllllIl[0]] = bN;
            if (h.lIlIllllIIlIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                var30 = new d(bN, llIIllllIl[1], bY);
                bv.add(var30);
                0;
            }
        }
        if (h.lIlIllllIIlII(bO)) {
            int[] nArray = new int[llIIllllIl[1]];
            nArray[h.llIIllllIl[0]] = bO;
            if (h.lIlIllllIIlIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                var30 = new d(bO, llIIllllIl[1], bZ);
                bv.add(var30);
                0;
            }
        }
        if (h.lIlIllllIIlII(bP)) {
            int[] nArray = new int[llIIllllIl[1]];
            nArray[h.llIIllllIl[0]] = bP;
            if (h.lIlIllllIIlIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                var30 = new d(bP, llIIllllIl[1], ca);
                bv.add(var30);
                0;
            }
        }
        if (h.lIlIllllIIlII(bQ)) {
            int[] nArray = new int[llIIllllIl[1]];
            nArray[h.llIIllllIl[0]] = bQ;
            if (h.lIlIllllIIlIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                var30 = new d(bQ, llIIllllIl[1], cb);
                bv.add(var30);
                0;
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
                                var30 = new d(bR, llIIllllIl[1], cc);
                                bv.add(var30);
                                0;
                                0;
                                if ((0x95 ^ 0x91) < 0) {
                                    return;
                                }
                            }
                        }
                    }
                } else {
                    var30 = new d(bR, llIIllllIl[1], cc);
                    bv.add(var30);
                    0;
                }
            }
        }
    }

    public static boolean c(int[] nArray) {
        int[] var2;
        int var21 = llIIllllIl[0];
        while (h.lIlIllllIIllI(var21, var2.length)) {
            if (h.lIlIllllIlIII(var2[var21])) {
                int[] nArray2 = new int[llIIllllIl[1]];
                nArray2[h.llIIllllIl[0]] = var2[var21];
                if (h.lIlIllllIIlIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    System.out.println("Missing ID: " + var2[var21]);
                    return llIIllllIl[0];
                }
            }
            ++var21;
            0;
            if (((0x22 ^ 0xE ^ (0x69 ^ 0x5F)) & (0x4C ^ 0x7F ^ (0x6B ^ 0x42) ^ -1)) == ((0x57 ^ 0x23 ^ (0xB5 ^ 0x99)) & (92 + 170 - 67 + 35 ^ 23 + 175 - 74 + 66 ^ -1))) continue;
            return ((0xFF ^ 0xC5 ^ (0x82 ^ 0xBC)) & (0x22 ^ 0x66 ^ (0xD1 ^ 0x91) ^ -1)) != 0;
        }
        return llIIllllIl[1];
    }

    private static boolean lIlIllllIIlIl(int n2) {
        return n2 == 0;
    }

    private static String lIlIllllIIIIl(String var24, String var20) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var20.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var4 = Cipher.getInstance("Blowfish");
            var4.init(llIIllllIl[2], var1);
            return new String(var4.doFinal(Base64.getDecoder().decode(var24.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    private static String lIlIllllIIIII(String var23, String var14) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var14.getBytes(StandardCharsets.UTF_8)), llIIllllIl[8]), "DES");
            Cipher var18 = Cipher.getInstance("DES");
            var18.init(llIIllllIl[2], var3);
            return new String(var18.doFinal(Base64.getDecoder().decode(var23.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
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
            String var12;
            if (h.lIlIllllIIlII(var12.equalsIgnoreCase(llIIllllII[llIIllllIl[0]]) ? 1 : 0)) {
                h.R();
            }
            if (h.lIlIllllIIlII(var12.equalsIgnoreCase(llIIllllII[llIIllllIl[1]]) ? 1 : 0)) {
                // empty if block
            }
            if (h.lIlIllllIIlII(var12.equalsIgnoreCase(llIIllllII[llIIllllIl[2]]) ? 1 : 0)) {
                h.V();
            }
            if (h.lIlIllllIIlII(var12.equalsIgnoreCase(llIIllllII[llIIllllIl[3]]) ? 1 : 0)) {
                // empty if block
            }
            if (h.lIlIllllIIlII(var12.equalsIgnoreCase(llIIllllII[llIIllllIl[4]]) ? 1 : 0)) {
                // empty if block
            }
            if (h.lIlIllllIIlII(var12.equalsIgnoreCase(llIIllllII[llIIllllIl[5]]) ? 1 : 0)) {
                // empty if block
            }
            if (h.lIlIllllIIlII(var12.equalsIgnoreCase(llIIllllII[llIIllllIl[6]]) ? 1 : 0)) {
                h.S();
            }
            if (h.lIlIllllIIlII(var12.equalsIgnoreCase(llIIllllII[llIIllllIl[7]]) ? 1 : 0)) {
                // empty if block
            }
            if (h.lIlIllllIIlII(var12.equalsIgnoreCase(llIIllllII[llIIllllIl[8]]) ? 1 : 0)) {
                h.U();
            }
            if (h.lIlIllllIIlII(var12.equalsIgnoreCase(llIIllllII[llIIllllIl[9]]) ? 1 : 0)) {
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
                BankLocation var6 = BankLocation.getNearest();
                if (h.lIlIllllIIlll(var6) && h.lIlIllllIIlIl(var6.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIIllllII[llIIllllIl[13]];
                    a.a(var6);
                }
                if (h.lIlIllllIIlll(var6) && h.lIlIllllIIlII(var6.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIIllllII[llIIllllIl[14]];
                    if (h.lIlIllllIIlIl(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)llIIllllIl[15]);
                        0;
                    }
                    if (h.lIlIllllIIlII(Bank.isOpen() ? 1 : 0)) {
                        if (h.lIlIllllIlIII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)llIIllllIl[4]);
                            0;
                        }
                        if (h.lIlIllllIlIII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)llIIllllIl[2]);
                            0;
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
                            int[] var26 = nArray;
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
                            a.a(var26, llIIllllIl[1]);
                            Time.sleepTicks((int)e.c(llIIllllIl[10], llIIllllIl[14]));
                            0;
                            if (h.lIlIllllIIlII(Bank.isOpen() ? 1 : 0)) {
                                Bank.close();
                                Time.sleepTicks((int)e.c(llIIllllIl[3], llIIllllIl[5]));
                                0;
                            }
                            while (!h.lIlIllllIIlIl(Inventory.contains((int[])var26) ? 1 : 0) || h.lIlIllllIIlII(Inventory.contains(item -> {
                                int n2;
                                if (h.lIlIllllIIlII(item.getName().contains(llIIllllII[llIIllllIl[204]]) ? 1 : 0) && h.lIlIllllIIlIl(item.isNoted() ? 1 : 0)) {
                                    n2 = llIIllllIl[1];
                                    0;
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
                                0;
                                e.l(bL);
                                e.l(bM);
                                e.l(bN);
                                Time.sleepTicks((int)llIIllllIl[1]);
                                0;
                                e.l(bO);
                                e.l(bP);
                                e.l(bQ);
                                e.l(bR);
                                Time.sleepTicks((int)llIIllllIl[1]);
                                0;
                                e.l(llIIllllIl[16]);
                                e.l(llIIllllIl[17]);
                                e.l(llIIllllIl[18]);
                                e.l(llIIllllIl[22]);
                                e.l(llIIllllIl[23]);
                                0;
                                if ((0xA ^ 0x2A ^ (0x47 ^ 0x63)) > -1) continue;
                                return;
                            }
                            if (h.lIlIllllIIlIl(Bank.isOpen() ? 1 : 0)) {
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)llIIllllIl[15]);
                                0;
                                Time.sleepTicks((int)llIIllllIl[4]);
                                0;
                                System.out.println(llIIllllII[llIIllllIl[24]]);
                                bu = llIIllllIl[1];
                            }
                        }
                    }
                }
            }
        }
    }

    private static void lIlIllllIIIll() {
        llIIllllIl = new int[206];
        h.llIIllllIl[0] = (3 ^ 0x10 ^ (0x3A ^ 0x25)) & (0x6A ^ 0x72 ^ (0xAE ^ 0xBA) ^ -1);
        h.llIIllllIl[1] = 1;
        h.llIIllllIl[2] = 2;
        h.llIIllllIl[3] = 3;
        h.llIIllllIl[4] = 119 + 66 - 82 + 92 ^ 100 + 151 - 249 + 197;
        h.llIIllllIl[5] = 0xC1 ^ 0xC4;
        h.llIIllllIl[6] = 0xCB ^ 0xAD ^ (0x29 ^ 0x49);
        h.llIIllllIl[7] = 117 + 58 - 165 + 163 ^ 1 + 74 - 31 + 126;
        h.llIIllllIl[8] = 0x5E ^ 0x56;
        h.llIIllllIl[9] = 0x79 ^ 0x70;
        h.llIIllllIl[10] = 0xC ^ 6;
        h.llIIllllIl[11] = 3 ^ 0x64 ^ (0x70 ^ 0x1C);
        h.llIIllllIl[12] = 0x58 ^ 0x54;
        h.llIIllllIl[13] = 3 + 1 - -97 + 62 ^ 75 + 59 - -8 + 32;
        h.llIIllllIl[14] = 0x7C ^ 0x72;
        h.llIIllllIl[15] = 0xFFFFBFFF & 0x5388;
        h.llIIllllIl[16] = -(0xFFFFB5AA & 0x5B77) & (0xFFFFBFFD & 0x7FEF);
        h.llIIllllIl[17] = -2 & (0xFFFFAEFF & 0x7FCF);
        h.llIIllllIl[18] = 0xFFFFBEFB & 0x6FD4;
        h.llIIllllIl[19] = 0x60 ^ 0x6F;
        h.llIIllllIl[20] = 0x33 ^ 0x23;
        h.llIIllllIl[21] = 0x9C ^ 0x8D;
        h.llIIllllIl[22] = -(0x75 ^ 0x7F) & (0xFFFFAFFB & 0x7EDF);
        h.llIIllllIl[23] = 0xFFFFBEF5 & 0x6FDE;
        h.llIIllllIl[24] = 0xC8 ^ 0x98 ^ (0xFB ^ 0xB9);
        h.llIIllllIl[25] = -(0xFFFFB7B5 & 0x6B7F) & (0xFFFFB7FD & 0x6FB7);
        h.llIIllllIl[26] = -(0xFFFFEBFF & 0x3F02) & (0xFFFFFF5D & 0x6FFF);
        h.llIIllllIl[27] = -(0xFFFFFEC5 & 0x11FB) & (0xFFFFFCFD & 0x5FEE);
        h.llIIllllIl[28] = -(0xFFFFEB69 & 0x3FF7) & (0xFFFFAFE3 & Short.MAX_VALUE);
        h.llIIllllIl[29] = 0xFFFFB7AD & 0x4CF7;
        h.llIIllllIl[30] = 0xFFFFFDEA & 0x3F37;
        h.llIIllllIl[31] = 0xFFFFDFEF & 0x6B9C;
        h.llIIllllIl[32] = -(0xFFFFFBDF & 0x6731) & (0xFFFFFFF7 & 0x67BF);
        h.llIIllllIl[33] = 0xFFFFD73B & 0x2DEF;
        h.llIIllllIl[34] = -(0xFFFF9EFD & 0x6B2E) & (0xFFFFCEEF & 0x7FBF);
        h.llIIllllIl[35] = -(0xFFFFEAEB & 0x3556) & (0xFFFFFBFF & 0x7EFF);
        h.llIIllllIl[36] = -(0xFFFFAFAB & 0x59F7) & (0xFFFFDFFF & 0x2DFF);
        h.llIIllllIl[37] = 0xFFFFCCF2 & 0x7B1F;
        h.llIIllllIl[38] = 0xFFFFDFEF & 0x72FE;
        h.llIIllllIl[39] = -(0xFFFFAD7F & 0x7B85) & (0xFFFFAF7F & 0x7DDF);
        h.llIIllllIl[40] = -(0xFFFFAFFB & 0x7BB5) & (0xFFFFFFFF & 0x2FFD);
        h.llIIllllIl[41] = 0xFFFFBFFF & 0x442B;
        h.llIIllllIl[42] = 0xFFFFDFF6 & 0x77ED;
        h.llIIllllIl[43] = 0xFFFFFFBF & 0x6378;
        h.llIIllllIl[44] = -(0xFFFFFBD9 & 0x6FE7) & (0xFFFFFFFB & 0x6FF7);
        h.llIIllllIl[45] = 0xFFFFC7F9 & 0x3C3F;
        h.llIIllllIl[46] = 0x24 ^ 0x30;
        h.llIIllllIl[47] = -(0xFFFFF237 & 0x7FFB) & (0xFFFFFEF7 & 0x77BF);
        h.llIIllllIl[48] = -(0xFFFFF99F & 0xF71) & (0xFFFFDFBD & 0x2DFB);
        h.llIIllllIl[49] = -(0xFFFFFCF3 & 0x5B1D) & (0xFFFFDF3F & 0x7DFD);
        h.llIIllllIl[50] = 0xFFFFD47F & 0x2FDF;
        h.llIIllllIl[51] = 0xFFFFC4FF & 0x3F2D;
        h.llIIllllIl[52] = 0x60 ^ 0x7E;
        h.llIIllllIl[53] = -(0xFFFF9DD3 & 0x7A7D) & (0xFFFFDFD7 & 0x3CFF);
        h.llIIllllIl[54] = -(0xFFFFFBDE & 0x352F) & (0xFFFFFFDF & Short.MAX_VALUE);
        h.llIIllllIl[55] = -(0xFFFFDCDE & 0x6BA3) & (0xFFFFDAFD & 0xFFFF);
        h.llIIllllIl[56] = 0xFFFFD1FD & 0xEF5E;
        h.llIIllllIl[57] = -(0xFFFFD7D7 & 0x783B) & (0xFFFFDDBF & 0x76FF);
        h.llIIllllIl[58] = -(0xFFFFFD33 & 0x1ACF) & (0xFFFFDD3B & 0x3FF7);
        h.llIIllllIl[59] = -(0xFFFF998F & 0x6FFB) & (0xFFFFEFEB & 0x1DFF);
        h.llIIllllIl[60] = 0xFFFFAFFF & Short.MAX_VALUE;
        h.llIIllllIl[61] = -(0xFFFFFCFD & 0x238F) & (0xFFFFF7BF & 0xBEFE);
        h.llIIllllIl[62] = 0xFFFFB5FF & 0xEB0E;
        h.llIIllllIl[63] = 0xFFFFADBF & 0x566F;
        h.llIIllllIl[64] = -(0xFFFFEBC3 & 0x7F7F) & (0xFFFFEFFF & 0x7F7F);
        h.llIIllllIl[65] = 6 ^ 0x2E;
        h.llIIllllIl[66] = 0xFFFF8DCF & 0x76B9;
        h.llIIllllIl[67] = -(0xFFFFF3F3 & 0x7D9D) & (0xFFFFFFBD & 0x7BFF);
        h.llIIllllIl[68] = -(0xFFFFF609 & 0x49F7) & (0xFFFFDBCD & 0xFE7E);
        h.llIIllllIl[69] = -(0xFFFFEAFD & 0x1F53) & (0xFFFFEFFF & 0x1EFF);
        h.llIIllllIl[70] = -(0xFFFFE9F7 & 0x770D) & (0xFFFFFBAF & 0x6F7F);
        h.llIIllllIl[71] = -(0xFFFFF0DB & 0x5FE5) & (0xFFFFF5FB & 0x5FF7);
        h.llIIllllIl[72] = -(0xFFFFD9BB & 0x7FDD) & (0xFFFFDFFF & 0x7DFB);
        h.llIIllllIl[73] = -(0xFFFFD7FD & 0x6CD3) & (0xFFFFDEFF & 0x6FFF);
        h.llIIllllIl[74] = 0xFFFFFDD3 & 0xBF6E;
        h.llIIllllIl[75] = 0xFFFFDDDF & 0xEA3E;
        h.llIIllllIl[76] = -(0xFFFFFB09 & 0x14FF) & (0xFFFFF7DF & 0x1C7F);
        h.llIIllllIl[77] = -(0xFFFFFC6D & 0x7B9F) & (0xFFFFFE7D & 0x7DBF);
        h.llIIllllIl[78] = 0xFFFFED77 & 0x16CB;
        h.llIIllllIl[79] = 0x1A ^ 0x26 ^ 1 & ~1;
        h.llIIllllIl[80] = 0xFFFFAECF & 0x55BB;
        h.llIIllllIl[81] = 0xFFFFFDFB & 0x67F;
        h.llIIllllIl[82] = -(9 ^ 0x2D) & (0xFFFFF7EF & 0x17D3F);
        h.llIIllllIl[83] = -(0xFFFFD363 & 0x6D9F) & (0xFFFFDD9E & 0x1FF7F);
        h.llIIllllIl[84] = 0xFFFFBEFD & 0x45B3;
        h.llIIllllIl[85] = -(0xFFFFF289 & 0x3D7F) & (0xFFFFBE7B & 0x7BFF);
        h.llIIllllIl[86] = -(0xFFFFD77B & 0x6FC6) & (0xFFFFFFF5 & 0x77FF);
        h.llIIllllIl[87] = 0xFFFF94AF & 0x6FF1;
        h.llIIllllIl[88] = 0xFFFFCBEF & 0x3E73;
        h.llIIllllIl[89] = -(0xFFFFAAC1 & 0x7FBF) & (0xFFFFAFB5 & Short.MAX_VALUE);
        h.llIIllllIl[90] = 0xFFFFFAA7 & 0x97FC;
        h.llIIllllIl[91] = -1 & (0xFFFFAAFE & 0xFDDF);
        h.llIIllllIl[92] = 0xFFFFBFFB & 0x445D;
        h.llIIllllIl[93] = 0xFFFF9E77 & 0x65BF;
        h.llIIllllIl[94] = -(0xFFFFEB52 & 0x1FFF) & (0xFFFFFFF5 & 0xFF7F);
        h.llIIllllIl[95] = -(0xFFFFFA76 & 0x5DBF) & (0xFFFFFEBF & 0x17FFD);
        h.llIIllllIl[96] = -(0xFFFFFB3D & 0x77DB) & (0xFFFFF7DF & 0x7F7D);
        h.llIIllllIl[97] = -(0xFFFFFECF & 0x6933) & (0xFFFFFEFF & 0x6FBF);
        h.llIIllllIl[98] = -(0xFFFFDC3D & 0x37C6) & (0xFFFFDCD7 & 0x7F6F);
        h.llIIllllIl[99] = -(0xFFFFFDF5 & 0x7B3F) & (0xFFFFFFFF & 0x7FF7);
        h.llIIllllIl[100] = 0xFFFFB97D & 0x6EFE;
        h.llIIllllIl[101] = 0xFFFFF6FD & 0x9F66;
        h.llIIllllIl[102] = 0xFFFFB7BE & 0xEE45;
        h.llIIllllIl[103] = 0xFFFFE6CD & 0x1FF3;
        h.llIIllllIl[104] = -1 & (0xFFFFBBFF & 0x47FB);
        h.llIIllllIl[105] = 0xFFFFDFCD & 0x7B36;
        h.llIIllllIl[106] = 0xFFFFF3EF & 0x7F74;
        h.llIIllllIl[107] = 0xFFFFA7EF & 0x5BFF;
        h.llIIllllIl[108] = -1 & (0xFFFFA7FF & 0x5BFF);
        h.llIIllllIl[109] = 0xFFFFAF93 & 0x546F;
        h.llIIllllIl[110] = 0xFFFFD361 & 0x3DBF;
        h.llIIllllIl[111] = -(0xFFFFB44B & 0x7BBD) & (0xFFFFBB7B & 0x77FE);
        h.llIIllllIl[112] = 149 + 216 - 281 + 138;
        h.llIIllllIl[113] = 229 + 131 - 170 + 43;
        h.llIIllllIl[114] = 0xFFFFA523 & 0x5EFF;
        h.llIIllllIl[115] = -(0xFFFF9EBC & 0x75C7) & (0xFFFFFFFF & 0x7FEF);
        h.llIIllllIl[116] = -(0xFFFFB576 & 0x4BDB) & (0xFFFFFFFD & 0x7F7F);
        h.llIIllllIl[117] = 0xFFFF8B6E & 0x7FFB;
        h.llIIllllIl[118] = 0xFFFFBB6A & 0x4FF5;
        h.llIIllllIl[119] = -(0xFFFFDBC3 & 0x6FFF) & (0xFFFFDFF7 & 0x6FEF);
        h.llIIllllIl[120] = 0xFFFFEB7F & 0x1FCE;
        h.llIIllllIl[121] = 0xFFFFCBEB & 0x3F76;
        h.llIIllllIl[122] = -(0xFFFFFC9F & 0x3765) & (0xFFFFBF5F & 0x7FFC);
        h.llIIllllIl[123] = -(0xFFFFF9BF & 0x66C9) & (0xFFFFFFEF & 0x66FB);
        h.llIIllllIl[124] = -(0xFFFFF0DB & 0x6FAD) & (0xFFFFFFFD & 0x66EF);
        h.llIIllllIl[125] = -(0xFFFFD967 & 0x7799) & (0xFFFFDF7F & 0x77EB);
        h.llIIllllIl[126] = -(0xFFFF89BB & 0x7FCD) & (0xFFFFCFFF & 0x3FEF);
        h.llIIllllIl[127] = 0xFFFFB4B7 & 0x7B4B;
        h.llIIllllIl[128] = -(0xFFFFF7FD & 0x1D07) & (0xFFFFDF77 & 0x3FFD);
        h.llIIllllIl[129] = 0xFFFFDFFB & 0x26AC;
        h.llIIllllIl[130] = -(0xFFFFEC97 & 0x336A) & (0xFFFFEEFF & 0x7FFD);
        h.llIIllllIl[131] = 0xFFFFDED9 & 0xF7FE;
        h.llIIllllIl[132] = 0xFFFFFFEC & 0xFDFB;
        h.llIIllllIl[133] = 0xFFFFCFE6 & 0x7F1B;
        h.llIIllllIl[134] = 0xFFFFCF6F & 0x7F9B;
        h.llIIllllIl[135] = -(0xFFFFF455 & 0x1BFF) & (0xFFFFDFDE & 0x7F7D);
        h.llIIllllIl[136] = 0xFFFFABFE & 0x7F77;
        h.llIIllllIl[137] = 0xFFFFEE7C & 0x9BCB;
        h.llIIllllIl[138] = 0xFFFFA7ED & 0x5F3F;
        h.llIIllllIl[139] = -(0xFFFFEDE7 & 0x7FDF) & (0xFFFFFFDF & 0x7DFF);
        h.llIIllllIl[140] = -(0xFFFFC7AF & 0x7B5A) & (0xFFFFDFDF & 0x73FF);
        h.llIIllllIl[141] = -(0xFFFFF59D & 0x7FEF) & (0xFFFFFFFE & 0x77FF);
        h.llIIllllIl[142] = 0xFFFFF79B & 0x187F;
        h.llIIllllIl[143] = 0xFFFF9BDF & 0x743F;
        h.llIIllllIl[144] = 0xFFFFBFF3 & 0x502F;
        h.llIIllllIl[145] = -(0x36 ^ 0x15) & (0xFFFFEBFF & 0x77BE);
        h.llIIllllIl[146] = 0xFFFFFFBE & 0x737D;
        h.llIIllllIl[147] = 0xDD ^ 0x9B;
        h.llIIllllIl[148] = 0xFFFFDDB7 & 0x3AFE;
        h.llIIllllIl[149] = -(0xFFFFBBBF & 0x5C55) & (0xFFFFF9BF & 0x7FFC);
        h.llIIllllIl[150] = 0xFFFFBABB & 0xCDFC;
        h.llIIllllIl[151] = 0xFFFFBFFD & 0x71F6;
        h.llIIllllIl[152] = -(0xFFFFF63E & 0x19EF) & (0xFFFFD77D & 0xABFFF);
        h.llIIllllIl[153] = 0xFFFFEEAB & 0xB5BF4;
        h.llIIllllIl[154] = -(0xFFFFD737 & 0x3EED) & (0xFFFFFFF7 & 0x1FEF);
        h.llIIllllIl[155] = -(0xFFFFFF77 & 0x32BB) & (0xFFFFFFF7 & 0x3BFF);
        h.llIIllllIl[156] = -(0xFFFFF6BD & 0x6F73) & (0xFFFFFFF7 & 0x6FFF);
        h.llIIllllIl[157] = 0xFFFFFFFD & 0x9BF;
        h.llIIllllIl[158] = -(0xFFFFB7DF & 0x5C61) & (0xFFFFDFFF & 0x3DFF);
        h.llIIllllIl[159] = -(0xFFFF97B7 & 0x6A7D) & (0xFFFFCBFF & 0x3FF5);
        h.llIIllllIl[160] = 0xFFFFCFCA & 0x17C3D;
        h.llIIllllIl[161] = 0xFFFFF71E & 0x17BF9;
        h.llIIllllIl[162] = -(0xFFFFD6FF & 0x2F15) & (0xFFFFEF97 & 0x3F7F);
        h.llIIllllIl[163] = -(0xFFFFD72F & 0x7BF7) & (0xFFFFFFBE & 0xDFB7F);
        h.llIIllllIl[164] = 0xFFFFBFCC & 0xE5D7B;
        h.llIIllllIl[165] = -(0xFFFFBF77 & 0x64CD) & (0xFFFFBFFD & 0x7CFE);
        h.llIIllllIl[166] = -(0xFFFFCFFC & 0x7027) & (0xFFFFEBBB & 0x2FFFF);
        h.llIIllllIl[167] = 0xFFFFD7E8 & 0x2FABF;
        h.llIIllllIl[168] = -(0xFFFFF8EB & 0x2FD5) & (0xFFFFFFFB & 0x7BF6);
        h.llIIllllIl[169] = 0xFFFFBDFB & 0x5B7F;
        h.llIIllllIl[170] = -(0xFFFFDECB & 0x33F5) & (0xFFFFFFE9 & 0x8FFFE);
        h.llIIllllIl[171] = -(0xFFFFFE13 & 0x45FF) & (0xFFFFFDFB & 0x9CF7E);
        h.llIIllllIl[172] = -(0xFFFFD2EF & 0x6D92) & (0xFFFFFFFF & 0x59FD);
        h.llIIllllIl[173] = 0xFFFFDB3D & 0x77F7;
        h.llIIllllIl[174] = 0xFFFFA815 & 0x1677FA;
        h.llIIllllIl[175] = 0xFFFFFEF4 & 0x16BD5B;
        h.llIIllllIl[176] = 0xFFFFD3BB & 0x7F7C;
        h.llIIllllIl[177] = 0xFFFF8E71 & 0x11FDBE;
        h.llIIllllIl[178] = 0xFFFFD7D4 & 0x133AFB;
        h.llIIllllIl[179] = 0xFFFFAFFE & 0x7B79;
        h.llIIllllIl[180] = -(0xFFFFFC95 & 0x6FEE) & (0xFFFFFFF7 & 0x2D6FFB);
        h.llIIllllIl[181] = 0xFFFFBDFD & 0x2EDF9A;
        h.llIIllllIl[182] = 0xFFFFF9EB & 0x1FBC;
        h.llIIllllIl[183] = -(0xFFFFEFDB & 0x51BC) & (0xFFFFFFF7 & 0x6FDF);
        h.llIIllllIl[184] = -(0xFFFFD34E & 0x7DF3) & (0xFFFFFF5F & 0x55FB);
        h.llIIllllIl[185] = 0xFFFF8D5A & 0x76B7;
        h.llIIllllIl[186] = -(0xFFFFFBDF & 0x166A) & (0xFFFF967F & 0x7FDF);
        h.llIIllllIl[187] = 0xFFFFBBE4 & 0x7CBF;
        h.llIIllllIl[188] = -(0xFFFFDEF3 & 0x6BAD) & (0xFFFFEFBE & 0x5EF5);
        h.llIIllllIl[189] = 0xFFFFDE2F & 0x25DE;
        h.llIIllllIl[190] = -(0xFFFFF9E5 & 0x3F3E) & (0xFFFFBD3B & Short.MAX_VALUE);
        h.llIIllllIl[191] = 0xFFFFDC11 & 0x27FE;
        h.llIIllllIl[192] = 0xFFFFFE5F & 0x5BD;
        h.llIIllllIl[193] = 0xFFFFDE4B & 0x23F7;
        h.llIIllllIl[194] = 0xFFFFDFF9 & 0x23FF;
        h.llIIllllIl[195] = -(0xFFFF9A7F & 0x7DC3) & (0xFFFFBFDF & 0x5FFF);
        h.llIIllllIl[196] = -(0xFFFFF797 & 0x5969) & (0xFFFFD7FF & 0x7FBF);
        h.llIIllllIl[197] = -(0xFFFFAE9F & 0x73EB) & (0xFFFFB7FF & 0x6FEF);
        h.llIIllllIl[198] = 0xFFFFD7A8 & 0x2A77;
        h.llIIllllIl[199] = 0xFFFF9E6D & 0x63D3;
        h.llIIllllIl[200] = -(0xFFFFCEAF & 0x3BF1) & (0xFFFFEEBB & 0x1FEF);
        h.llIIllllIl[201] = 0xFFFFF7BE & 0xA5F;
        h.llIIllllIl[202] = -(0xFFFFF93F & 0x57F7) & (0xFFFFF53F & 0x5FFF);
        h.llIIllllIl[203] = 0x26 ^ 0x54 ^ (0x76 ^ 0x17);
        h.llIIllllIl[204] = 0xCB ^ 0xA1 ^ 105 + 37 - 111 + 96;
        h.llIIllllIl[205] = 0xAE ^ 0xB8;
    }

    private static String lIlIlllIlllll(String var31, String var19) {
        var31 = new String(Base64.getDecoder().decode(var31.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var7 = new StringBuilder();
        char[] var16 = var19.toCharArray();
        int var29 = llIIllllIl[0];
        char[] var13 = var31.toCharArray();
        int var25 = var13.length;
        int var28 = llIIllllIl[0];
        while (h.lIlIllllIIllI(var28, var25)) {
            char var15 = var13[var28];
            var7.append((char)(var15 ^ var16[var29 % var16.length]));
            0;
            ++var29;
            ++var28;
            0;
            if ((0x1C ^ 0x18) != 3) continue;
            return null;
        }
        return String.valueOf(var7);
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

