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
package gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks;

import gg.squire.account.AccBuilderShamans;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.AHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.BHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.DHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.EHelper;
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
    
    private static  int bV;
    private static  Map<Integer, Integer> bw;
    private static  Map<Integer, Integer> bt;
    private static  int bE;
    private static  int bT;
    
    private static  Map<Integer, Integer> bz;
    private static  int bW;
    private static  int bH;
    private static  int bR;
    public static  boolean bo;
    private static  Map<Integer, Integer> bA;
    private static  int bD;
    private static  int bC;
    private static  int bS;
    private static  Map<Integer, Integer> bx;
    private static  int bF;
    private static  int bU;
    private static  int bB;
    private static  int bK;
    private static  int bP;
    private static  int bO;
    private static  int bN;
    public static  List<d> bp;
    private static  int bL;
    private static  Map<Integer, Integer> bq;
    private static  int bM;
    private static  int bI;
    private static  Map<Integer, Integer> bv;
    public static  boolean bn;
    private static  Map<Integer, Integer> bu;
    private static  Map<Integer, Integer> br;
    private static  int bQ;
    private static  int bJ;
    private static  Map<Integer, Integer> by;
    private static  Map<Integer, Integer> bs;
    private static  int bG;

    private static boolean n(int n2) {
        if (h.lIIllIIlIlIll(n2, lIllIlIIII[16])) {
            int[] nArray = new int[lIllIlIIII[10]];
            nArray[h.lIllIlIIII[0]] = bB;
            nArray[h.lIllIlIIII[1]] = bC;
            nArray[h.lIllIlIIII[2]] = bD;
            nArray[h.lIllIlIIII[3]] = bE;
            nArray[h.lIllIlIIII[4]] = bF;
            nArray[h.lIllIlIIII[5]] = bG;
            nArray[h.lIllIlIIII[6]] = bH;
            nArray[h.lIllIlIIII[7]] = bI;
            nArray[h.lIllIlIIII[8]] = bJ;
            nArray[h.lIllIlIIII[9]] = bK;
            return h.b(nArray);
        }
        int[] nArray = new int[lIllIlIIII[11]];
        nArray[h.lIllIlIIII[0]] = bB;
        nArray[h.lIllIlIIII[1]] = bC;
        nArray[h.lIllIlIIII[2]] = bD;
        nArray[h.lIllIlIIII[3]] = bE;
        nArray[h.lIllIlIIII[4]] = bF;
        nArray[h.lIllIlIIII[5]] = bG;
        nArray[h.lIllIlIIII[6]] = bH;
        nArray[h.lIllIlIIII[7]] = bI;
        nArray[h.lIllIlIIII[8]] = bJ;
        nArray[h.lIllIlIIII[9]] = bK;
        nArray[h.lIllIlIIII[10]] = n2;
        return h.b(nArray);
    }

    public static void V() {
        bq.clear();
        br.clear();
        bs.clear();
        bt.clear();
        bu.clear();
        bv.clear();
        bw.clear();
        bx.clear();
        by.clear();
        bz.clear();
        bA.clear();
        bK = bL = lIllIlIIII[0];
        bJ = bL;
        bI = bL;
        bH = bL;
        bG = bL;
        bF = bL;
        bE = bL;
        bD = bL;
        bC = bL;
        bB = bL;
        bV = bW = lIllIlIIII[0];
        bU = bW;
        bT = bW;
        bS = bW;
        bR = bW;
        bQ = bW;
        bP = bW;
        bO = bW;
        bN = bW;
        bM = bW;
        bo = lIllIlIIII[0];
        System.out.println(lIllIIllll[lIllIlIIII[46]]);
    }

    private static void lIIllIIIlIIll() {
        lIllIIllll = new String[lIllIlIIII[218]];
        h.lIllIIllll[h.lIllIlIIII[0]] = "f2pmelee";
        h.lIllIIllll[h.lIllIlIIII[1]] = "f2pquest";
        h.lIllIIllll[h.lIllIlIIII[2]] = "f2pmage";
        h.lIllIIllll[h.lIllIlIIII[3]] = "mage";
        h.lIllIIllll[h.lIllIlIIII[4]] = "quest";
        h.lIllIIllll[h.lIllIlIIII[5]] = "questNoWep";
        h.lIllIIllll[h.lIllIlIIII[6]] = "melee";
        h.lIllIIllll[h.lIllIlIIII[7]] = "agility";
        h.lIllIIllll[h.lIllIlIIII[8]] = "meleeNmz";
        h.lIllIIllll[h.lIllIlIIII[9]] = "rangeNmz";
        h.lIllIIllll[h.lIllIlIIII[10]] = "Randomized Equipment:";
        h.lIllIIllll[h.lIllIlIIII[11]] = "Buying items";
        h.lIllIIllll[h.lIllIlIIII[12]] = "Finished buying items, switching back to randomGearing";
        h.lIllIIllll[h.lIllIlIIII[13]] = "Navigating to bank";
        h.lIllIIllll[h.lIllIlIIII[14]] = "Handling banking";
        h.lIllIIllll[h.lIllIlIIII[19]] = "We are missing random gear, switching to BUYING";
        h.lIllIIllll[h.lIllIlIIII[20]] = "We are missing random gear, switching to BUYING";
        h.lIllIIllll[h.lIllIlIIII[21]] = "We are missing random gear, switching to BUYING";
        h.lIllIIllll[h.lIllIlIIII[24]] = "Finished gearing random";
        h.lIllIIllll[h.lIllIlIIII[216]] = "Unexpected error occurred while getting a random key.";
        h.lIllIIllll[h.lIllIlIIII[46]] = "Random gear lists CLEARED";
        h.lIllIIllll[h.lIllIlIIII[217]] = "wealth";
    }

    private static boolean lIIllIIlIllIl(int n2, int n3) {
        return n2 >= n3;
    }

    public static boolean b(int[] nArray) {
        int[] var1;
        int var2 = lIllIlIIII[0];
        while (h.lIIllIIlIlIII(var2, var1.length)) {
            if (h.lIIllIIlIlIlI(var1[var2])) {
                int[] nArray2 = new int[lIllIlIIII[1]];
                nArray2[h.lIllIlIIII[0]] = var1[var2];
                if (h.lIIllIIlIIlll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    System.out.println("Missing ID: " + var1[var2]);
                    return lIllIlIIII[0];
                }
            }
            ++var2;

            if (((0x58 ^ 0x36 ^ (0xEA ^ 0x83)) & (67 + 7 - 23 + 76 ^ (0x1C ^ 0x64) ^ -1)) == 0) continue;
            return ((0xA1 ^ 0xC1 ^ (0x74 ^ 0x19)) & (0x30 ^ 0x34 ^ (0x74 ^ 0x7D) ^ -1)) != 0;
        }
        return lIllIlIIII[1];
    }

    private static boolean lIIllIIlIlIll(int n2, int n3) {
        return n2 == n3;
    }

    private static void T() {
        bq.putAll(Map.of(lIllIlIIII[197], e.c(lIllIlIIII[26], lIllIlIIII[27]), lIllIlIIII[198], e.c(lIllIlIIII[26], lIllIlIIII[27]), lIllIlIIII[199], e.c(lIllIlIIII[200], lIllIlIIII[98]), lIllIlIIII[201], e.c(lIllIlIIII[200], lIllIlIIII[98]), lIllIlIIII[202], e.c(lIllIlIIII[200], lIllIlIIII[98]), lIllIlIIII[203], e.c(lIllIlIIII[200], lIllIlIIII[98]), lIllIlIIII[204], e.c(lIllIlIIII[200], lIllIlIIII[98]), lIllIlIIII[205], e.c(lIllIlIIII[115], lIllIlIIII[146]), lIllIlIIII[206], e.c(lIllIlIIII[26], lIllIlIIII[27])));
        bq.putAll(Map.of(lIllIlIIII[25], e.c(lIllIlIIII[200], lIllIlIIII[98]), lIllIlIIII[207], e.c(lIllIlIIII[200], lIllIlIIII[98]), lIllIlIIII[208], e.c(lIllIlIIII[200], lIllIlIIII[98])));
        br.putAll(Map.of(lIllIlIIII[97], e.c(lIllIlIIII[98], lIllIlIIII[42]), lIllIlIIII[99], e.c(lIllIlIIII[98], lIllIlIIII[42]), lIllIlIIII[209], e.c(lIllIlIIII[98], lIllIlIIII[42])));
        bs.putAll(Map.of(lIllIlIIII[104], e.c(lIllIlIIII[105], lIllIlIIII[106]), lIllIlIIII[107], e.c(lIllIlIIII[105], lIllIlIIII[106]), lIllIlIIII[108], e.c(lIllIlIIII[105], lIllIlIIII[106]), lIllIlIIII[109], e.c(lIllIlIIII[105], lIllIlIIII[106]), lIllIlIIII[110], e.c(lIllIlIIII[105], lIllIlIIII[106])));
        bt.putAll(Map.of());
        bu.putAll(Map.of(lIllIlIIII[210], e.c(lIllIlIIII[34], lIllIlIIII[35])));
        bw.putAll(Map.of(lIllIlIIII[211], e.c(lIllIlIIII[37], lIllIlIIII[38]), lIllIlIIII[212], e.c(lIllIlIIII[37], lIllIlIIII[38]), lIllIlIIII[213], e.c(lIllIlIIII[37], lIllIlIIII[38])));
        bx.putAll(Map.of(lIllIlIIII[214], e.c(lIllIlIIII[42], lIllIlIIII[43]), lIllIlIIII[215], e.c(lIllIlIIII[42], lIllIlIIII[43])));
        by.putAll(Map.of(lIllIlIIII[114], e.c(lIllIlIIII[137], lIllIlIIII[68]), lIllIlIIII[118], e.c(lIllIlIIII[115], lIllIlIIII[116]), lIllIlIIII[117], e.c(lIllIlIIII[115], lIllIlIIII[116])));
        bz.putAll(Map.of(lIllIlIIII[119], e.c(lIllIlIIII[115], lIllIlIIII[116]), lIllIlIIII[121], e.c(lIllIlIIII[115], lIllIlIIII[116]), lIllIlIIII[122], e.c(lIllIlIIII[115], lIllIlIIII[116]), lIllIlIIII[120], e.c(lIllIlIIII[115], lIllIlIIII[116])));
        bA.putAll(Map.of(lIllIlIIII[123], e.c(lIllIlIIII[115], lIllIlIIII[116]), lIllIlIIII[125], e.c(lIllIlIIII[115], lIllIlIIII[116]), lIllIlIIII[126], e.c(lIllIlIIII[115], lIllIlIIII[116])));
    }

    public static void d(String string) {
        if (!h.lIIllIIlIIllI(bB) || h.lIIllIIlIIlll(bH)) {
            String var3;
            if (h.lIIllIIlIIllI(var3.equalsIgnoreCase(lIllIIllll[lIllIlIIII[0]]) ? 1 : 0)) {
                h.P();
            }
            if (h.lIIllIIlIIllI(var3.equalsIgnoreCase(lIllIIllll[lIllIlIIII[1]]) ? 1 : 0)) {
                // empty if block
            }
            if (h.lIIllIIlIIllI(var3.equalsIgnoreCase(lIllIIllll[lIllIlIIII[2]]) ? 1 : 0)) {
                h.T();
            }
            if (h.lIIllIIlIIllI(var3.equalsIgnoreCase(lIllIIllll[lIllIlIIII[3]]) ? 1 : 0)) {
                // empty if block
            }
            if (h.lIIllIIlIIllI(var3.equalsIgnoreCase(lIllIIllll[lIllIlIIII[4]]) ? 1 : 0)) {
                // empty if block
            }
            if (h.lIIllIIlIIllI(var3.equalsIgnoreCase(lIllIIllll[lIllIlIIII[5]]) ? 1 : 0)) {
                // empty if block
            }
            if (h.lIIllIIlIIllI(var3.equalsIgnoreCase(lIllIIllll[lIllIlIIII[6]]) ? 1 : 0)) {
                h.Q();
            }
            if (h.lIIllIIlIIllI(var3.equalsIgnoreCase(lIllIIllll[lIllIlIIII[7]]) ? 1 : 0)) {
                // empty if block
            }
            if (h.lIIllIIlIIllI(var3.equalsIgnoreCase(lIllIIllll[lIllIlIIII[8]]) ? 1 : 0)) {
                h.S();
            }
            if (h.lIIllIIlIIllI(var3.equalsIgnoreCase(lIllIIllll[lIllIlIIII[9]]) ? 1 : 0)) {
                h.R();
            }
            h.U();
            System.out.println(lIllIIllll[lIllIlIIII[10]]);
            System.out.println("Helm: " + bB + ", Price: " + bM);
            System.out.println("Amulet: " + bC + ", Price: " + bN);
            System.out.println("Cape: " + bD + ", Price: " + bO);
            System.out.println("Ammo: " + bE + ", Price: " + bP);
            System.out.println("Weapon: " + bF + ", Price: " + bQ);
            System.out.println("Shield: " + bG + ", Price: " + bR);
            System.out.println("Body: " + bH + ", Price: " + bS);
            System.out.println("Legs: " + bI + ", Price: " + bT);
            System.out.println("Gloves: " + bJ + ", Price: " + bU);
            System.out.println("Boots: " + bK + ", Price: " + bV);
            System.out.println("Ring: " + bL + ", Price: " + bW);
        }
        if (h.lIIllIIlIIllI(bB) && h.lIIllIIlIIllI(bH)) {
            if (h.lIIllIIlIIllI(bn ? 1 : 0)) {
                AccBuilderShamans.c = lIllIIllll[lIllIlIIII[11]];
                b.a(bp);
                if (h.lIIllIIlIlIII(bp.size(), lIllIlIIII[1])) {
                    System.out.println(lIllIIllll[lIllIlIIII[12]]);
                    bn = lIllIlIIII[0];
                }
            }
            if (h.lIIllIIlIIlll(bn ? 1 : 0)) {
                BankLocation var4 = BankLocation.getNearest();
                if (h.lIIllIIlIlIIl(var4) && h.lIIllIIlIIlll(var4.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIllIIllll[lIllIlIIII[13]];
                    a.a(var4);
                }
                if (h.lIIllIIlIlIIl(var4) && h.lIIllIIlIIllI(var4.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIllIIllll[lIllIlIIII[14]];
                    if (h.lIIllIIlIIlll(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIllIlIIII[15]);

                    }
                    if (h.lIIllIIlIIllI(Bank.isOpen() ? 1 : 0)) {
                        if (h.lIIllIIlIlIlI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIllIlIIII[4]);

                        }
                        if (h.lIIllIIlIlIlI(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIllIlIIII[2]);

                        }
                        if (h.lIIllIIlIlIll(bL, lIllIlIIII[16])) {
                            int[] nArray = new int[lIllIlIIII[1]];
                            nArray[h.lIllIlIIII[0]] = lIllIlIIII[17];
                            if (h.lIIllIIlIIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray2 = new int[lIllIlIIII[1]];
                                nArray2[h.lIllIlIIII[0]] = lIllIlIIII[16];
                                if (h.lIIllIIlIIlll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                                    int[] nArray3 = new int[lIllIlIIII[1]];
                                    nArray3[h.lIllIlIIII[0]] = lIllIlIIII[18];
                                    if (h.lIIllIIlIIlll(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                        h.O();
                                        System.out.println(lIllIIllll[lIllIlIIII[19]]);
                                        bn = lIllIlIIII[1];
                                        return;
                                    }
                                }
                            }
                            int[] nArray4 = new int[lIllIlIIII[10]];
                            nArray4[h.lIllIlIIII[0]] = bB;
                            nArray4[h.lIllIlIIII[1]] = bC;
                            nArray4[h.lIllIlIIII[2]] = bD;
                            nArray4[h.lIllIlIIII[3]] = bE;
                            nArray4[h.lIllIlIIII[4]] = bF;
                            nArray4[h.lIllIlIIII[5]] = bG;
                            nArray4[h.lIllIlIIII[6]] = bH;
                            nArray4[h.lIllIlIIII[7]] = bI;
                            nArray4[h.lIllIlIIII[8]] = bJ;
                            nArray4[h.lIllIlIIII[9]] = bK;
                            if (h.lIIllIIlIIlll(h.b(nArray4) ? 1 : 0)) {
                                h.O();
                                System.out.println(lIllIIllll[lIllIlIIII[20]]);
                                bn = lIllIlIIII[1];
                                return;
                            }
                        }
                        if (h.lIIllIIlIllII(bL, lIllIlIIII[16])) {
                            int[] nArray = new int[lIllIlIIII[11]];
                            nArray[h.lIllIlIIII[0]] = bB;
                            nArray[h.lIllIlIIII[1]] = bC;
                            nArray[h.lIllIlIIII[2]] = bD;
                            nArray[h.lIllIlIIII[3]] = bE;
                            nArray[h.lIllIlIIII[4]] = bF;
                            nArray[h.lIllIlIIII[5]] = bG;
                            nArray[h.lIllIlIIII[6]] = bH;
                            nArray[h.lIllIlIIII[7]] = bI;
                            nArray[h.lIllIlIIII[8]] = bJ;
                            nArray[h.lIllIlIIII[9]] = bK;
                            nArray[h.lIllIlIIII[10]] = bL;
                            if (h.lIIllIIlIIlll(h.b(nArray) ? 1 : 0)) {
                                h.O();
                                System.out.println(lIllIIllll[lIllIlIIII[21]]);
                                bn = lIllIlIIII[1];
                                return;
                            }
                        }
                        if (h.lIIllIIlIIllI(h.n(bL) ? 1 : 0)) {
                            int[] nArray = new int[lIllIlIIII[11]];
                            nArray[h.lIllIlIIII[0]] = bB;
                            nArray[h.lIllIlIIII[1]] = bC;
                            nArray[h.lIllIlIIII[2]] = bD;
                            nArray[h.lIllIlIIII[3]] = bE;
                            nArray[h.lIllIlIIII[4]] = bF;
                            nArray[h.lIllIlIIII[5]] = bG;
                            nArray[h.lIllIlIIII[6]] = bH;
                            nArray[h.lIllIlIIII[7]] = bI;
                            nArray[h.lIllIlIIII[8]] = bJ;
                            nArray[h.lIllIlIIII[9]] = bK;
                            nArray[h.lIllIlIIII[10]] = bL;
                            int[] var5 = nArray;
                            if (h.lIIllIIlIlIll(bL, lIllIlIIII[16])) {
                                int[] nArray5 = new int[lIllIlIIII[1]];
                                nArray5[h.lIllIlIIII[0]] = lIllIlIIII[16];
                                if (h.lIIllIIlIIlll(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                    int[] nArray6 = new int[lIllIlIIII[1]];
                                    nArray6[h.lIllIlIIII[0]] = lIllIlIIII[17];
                                    if (h.lIIllIIlIIllI(Bank.contains((int[])nArray6) ? 1 : 0)) {
                                        a.a(lIllIlIIII[17], lIllIlIIII[1]);
                                    }
                                }
                                int[] nArray7 = new int[lIllIlIIII[1]];
                                nArray7[h.lIllIlIIII[0]] = lIllIlIIII[16];
                                if (h.lIIllIIlIIlll(Bank.contains((int[])nArray7) ? 1 : 0)) {
                                    int[] nArray8 = new int[lIllIlIIII[1]];
                                    nArray8[h.lIllIlIIII[0]] = lIllIlIIII[17];
                                    if (h.lIIllIIlIIlll(Bank.contains((int[])nArray8) ? 1 : 0)) {
                                        int[] nArray9 = new int[lIllIlIIII[1]];
                                        nArray9[h.lIllIlIIII[0]] = lIllIlIIII[17];
                                        if (h.lIIllIIlIIlll(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                                            int[] nArray10 = new int[lIllIlIIII[1]];
                                            nArray10[h.lIllIlIIII[0]] = lIllIlIIII[18];
                                            if (h.lIIllIIlIIllI(Bank.contains((int[])nArray10) ? 1 : 0)) {
                                                a.a(lIllIlIIII[18], lIllIlIIII[1]);
                                            }
                                        }
                                    }
                                }
                            }
                            a.a(var5, lIllIlIIII[1]);
                            Time.sleepTicks((int)e.c(lIllIlIIII[10], lIllIlIIII[14]));

                            if (h.lIIllIIlIIllI(Bank.isOpen() ? 1 : 0)) {
                                Bank.close();
                                Time.sleepTicks((int)e.c(lIllIlIIII[3], lIllIlIIII[5]));

                            }
                            while (!h.lIIllIIlIIlll(Inventory.contains((int[])var5) ? 1 : 0) || h.lIIllIIlIIllI(Inventory.contains(item -> {
                                int n2;
                                if (h.lIIllIIlIIllI(item.getName().contains(lIllIIllll[lIllIlIIII[217]]) ? 1 : 0) && h.lIIllIIlIIlll(item.isNoted() ? 1 : 0)) {
                                    n2 = lIllIlIIII[1];

                                    }
                                } else {
                                    n2 = lIllIlIIII[0];
                                }
                                return n2 != 0;
                            }) ? 1 : 0)) {
                                e.l(bB);
                                e.l(bC);
                                e.l(bD);
                                e.l(bE);
                                Time.sleepTicks((int)lIllIlIIII[1]);

                                e.l(bF);
                                e.l(bG);
                                e.l(bH);
                                Time.sleepTicks((int)lIllIlIIII[1]);

                                e.l(bI);
                                e.l(bJ);
                                e.l(bK);
                                e.l(bL);
                                Time.sleepTicks((int)lIllIlIIII[1]);

                                e.l(lIllIlIIII[16]);
                                e.l(lIllIlIIII[17]);
                                e.l(lIllIlIIII[18]);
                                e.l(lIllIlIIII[22]);
                                e.l(lIllIlIIII[23]);

                                if (((3 ^ 0x5D) & ~(0x23 ^ 0x7D)) <= 0) continue;
                                return;
                            }
                            if (h.lIIllIIlIIlll(Bank.isOpen() ? 1 : 0)) {
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)lIllIlIIII[15]);

                                Time.sleepTicks((int)lIllIlIIII[4]);

                                System.out.println(lIllIIllll[lIllIlIIII[24]]);
                                bo = lIllIlIIII[1];
                            }
                        }
                    }
                }
            }
        }
    }

    private static boolean lIIllIIlIlIlI(int n2) {
        return n2 > 0;
    }

    private static boolean lIIllIIlIlIIl(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    private static int a(Map<Integer, Integer> map, Random random) {
        Map<Integer, Integer> var6;
        void var7;
        if (h.lIIllIIlIIllI(map.isEmpty() ? 1 : 0)) {
            return lIllIlIIII[0];
        }
        int var8 = var7.nextInt(var6.size());
        int var9 = lIllIlIIII[0];
        Iterator<Integer> var10 = var6.keySet().iterator();
        while (h.lIIllIIlIIllI(var10.hasNext() ? 1 : 0)) {
            int var11 = var10.next();
            if (h.lIIllIIlIlIll(var9, var8)) {
                return var11;
            }
            ++var9;

            if (2 > 1) continue;
            return (0x62 ^ 0x56) & ~(0x8C ^ 0xB8);
        }
        throw new IllegalStateException(lIllIIllll[lIllIlIIII[216]]);
    }

        return String.valueOf(var12);
    }

    private static void U() {
        Random random = new Random();
        bB = h.a(bq, random);
        bM = bq.getOrDefault(bB, lIllIlIIII[0]);
        bC = h.a(br, random);
        bN = br.getOrDefault(bC, lIllIlIIII[0]);
        bD = h.a(bs, random);
        bO = bs.getOrDefault(bD, lIllIlIIII[0]);
        bE = h.a(bt, random);
        bP = bt.getOrDefault(bE, lIllIlIIII[0]);
        bF = h.a(bu, random);
        bQ = bu.getOrDefault(bF, lIllIlIIII[0]);
        bG = h.a(bv, random);
        bR = bv.getOrDefault(bG, lIllIlIIII[0]);
        bH = h.a(bw, random);
        bS = bw.getOrDefault(bH, lIllIlIIII[0]);
        bI = h.a(bx, random);
        bT = bx.getOrDefault(bI, lIllIlIIII[0]);
        bJ = h.a(by, random);
        bU = by.getOrDefault(bJ, lIllIlIIII[0]);
        bK = h.a(bz, random);
        bV = bz.getOrDefault(bK, lIllIlIIII[0]);
        bL = h.a(bA, random);
        bW = bA.getOrDefault(bL, lIllIlIIII[0]);
    }

    private static void O() {
        d var13;
        if (h.lIIllIIlIIllI(bB)) {
            int[] nArray = new int[lIllIlIIII[1]];
            nArray[h.lIllIlIIII[0]] = bB;
            if (h.lIIllIIlIIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
                d d2 = new DHelper(bB, lIllIlIIII[1], bM);
                bp.add(d2);

            }
        }
        if (h.lIIllIIlIIllI(bC)) {
            int[] nArray = new int[lIllIlIIII[1]];
            nArray[h.lIllIlIIII[0]] = bC;
            if (h.lIIllIIlIIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
                var13 = new DHelper(bC, lIllIlIIII[1], bN);
                bp.add(var13);

            }
        }
        if (h.lIIllIIlIIllI(bD)) {
            int[] nArray = new int[lIllIlIIII[1]];
            nArray[h.lIllIlIIII[0]] = bD;
            if (h.lIIllIIlIIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
                var13 = new DHelper(bD, lIllIlIIII[1], bO);
                bp.add(var13);

            }
        }
        if (h.lIIllIIlIIllI(bE)) {
            int[] nArray = new int[lIllIlIIII[1]];
            nArray[h.lIllIlIIII[0]] = bE;
            if (h.lIIllIIlIIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
                var13 = new DHelper(bE, lIllIlIIII[1], bP);
                bp.add(var13);

            }
        }
        if (h.lIIllIIlIIllI(bF)) {
            int[] nArray = new int[lIllIlIIII[1]];
            nArray[h.lIllIlIIII[0]] = bF;
            if (h.lIIllIIlIIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
                var13 = new DHelper(bF, lIllIlIIII[1], bQ);
                bp.add(var13);

            }
        }
        if (h.lIIllIIlIIllI(bG)) {
            int[] nArray = new int[lIllIlIIII[1]];
            nArray[h.lIllIlIIII[0]] = bG;
            if (h.lIIllIIlIIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
                var13 = new DHelper(bG, lIllIlIIII[1], bR);
                bp.add(var13);

            }
        }
        if (h.lIIllIIlIIllI(bH)) {
            int[] nArray = new int[lIllIlIIII[1]];
            nArray[h.lIllIlIIII[0]] = bH;
            if (h.lIIllIIlIIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
                var13 = new DHelper(bH, lIllIlIIII[1], bS);
                bp.add(var13);

            }
        }
        if (h.lIIllIIlIIllI(bI)) {
            int[] nArray = new int[lIllIlIIII[1]];
            nArray[h.lIllIlIIII[0]] = bI;
            if (h.lIIllIIlIIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
                var13 = new DHelper(bI, lIllIlIIII[1], bT);
                bp.add(var13);

            }
        }
        if (h.lIIllIIlIIllI(bJ)) {
            int[] nArray = new int[lIllIlIIII[1]];
            nArray[h.lIllIlIIII[0]] = bJ;
            if (h.lIIllIIlIIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
                var13 = new DHelper(bJ, lIllIlIIII[1], bU);
                bp.add(var13);

            }
        }
        if (h.lIIllIIlIIllI(bK)) {
            int[] nArray = new int[lIllIlIIII[1]];
            nArray[h.lIllIlIIII[0]] = bK;
            if (h.lIIllIIlIIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
                var13 = new DHelper(bK, lIllIlIIII[1], bV);
                bp.add(var13);

            }
        }
        if (h.lIIllIIlIIllI(bL)) {
            int[] nArray = new int[lIllIlIIII[1]];
            nArray[h.lIllIlIIII[0]] = bL;
            if (h.lIIllIIlIIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
                if (h.lIIllIIlIlIll(bL, lIllIlIIII[16])) {
                    int[] nArray2 = new int[lIllIlIIII[1]];
                    nArray2[h.lIllIlIIII[0]] = lIllIlIIII[16];
                    if (h.lIIllIIlIIlll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                        int[] nArray3 = new int[lIllIlIIII[1]];
                        nArray3[h.lIllIlIIII[0]] = lIllIlIIII[17];
                        if (h.lIIllIIlIIlll(Bank.contains((int[])nArray3) ? 1 : 0)) {
                            int[] nArray4 = new int[lIllIlIIII[1]];
                            nArray4[h.lIllIlIIII[0]] = lIllIlIIII[18];
                            if (h.lIIllIIlIIlll(Bank.contains((int[])nArray4) ? 1 : 0)) {
                                var13 = new DHelper(bL, lIllIlIIII[1], bW);
                                bp.add(var13);

                                }
                            }
                        }
                    }
                } else {
                    var13 = new DHelper(bL, lIllIlIIII[1], bW);
                    bp.add(var13);

                }
            }
        }
    }

    private static void S() {
        bq.putAll(Map.of(lIllIlIIII[181], e.c(lIllIlIIII[170], lIllIlIIII[171])));
        bv.putAll(Map.of(lIllIlIIII[182], e.c(lIllIlIIII[183], lIllIlIIII[184])));
        bu.putAll(Map.of(lIllIlIIII[185], e.c(lIllIlIIII[155], lIllIlIIII[156])));
        bw.putAll(Map.of(lIllIlIIII[186], e.c(lIllIlIIII[187], lIllIlIIII[188])));
        bx.putAll(Map.of(lIllIlIIII[189], e.c(lIllIlIIII[190], lIllIlIIII[191])));
        br.putAll(Map.of(lIllIlIIII[192], e.c(lIllIlIIII[193], lIllIlIIII[194])));
        bs.putAll(Map.of(lIllIlIIII[195], e.c(lIllIlIIII[170], lIllIlIIII[171])));
        bt.putAll(Map.of(lIllIlIIII[134], e.c(lIllIlIIII[131], lIllIlIIII[132])));
        by.putAll(Map.of(lIllIlIIII[136], e.c(lIllIlIIII[137], lIllIlIIII[68])));
        bz.putAll(Map.of(lIllIlIIII[196], e.c(lIllIlIIII[176], lIllIlIIII[177])));
        bA.putAll(Map.of(lIllIlIIII[16], e.c(lIllIlIIII[145], lIllIlIIII[146])));
    }

    private static boolean lIIllIIlIIlll(int n2) {
        return n2 == 0;
    }

    private static void Q() {
        if (h.lIIllIIlIlIII(Skills.getLevel((Skill)Skill.DEFENCE), lIllIlIIII[5])) {
            bq.putAll(Map.of(lIllIlIIII[25], e.c(lIllIlIIII[26], lIllIlIIII[27])));
            bv.putAll(Map.of(lIllIlIIII[29], e.c(lIllIlIIII[30], lIllIlIIII[31]), lIllIlIIII[32], e.c(lIllIlIIII[30], lIllIlIIII[31])));
            bu.putAll(Map.of(lIllIlIIII[33], e.c(lIllIlIIII[34], lIllIlIIII[35])));
            bw.putAll(Map.of(lIllIlIIII[36], e.c(lIllIlIIII[37], lIllIlIIII[38]), lIllIlIIII[39], e.c(lIllIlIIII[37], lIllIlIIII[38]), lIllIlIIII[40], e.c(lIllIlIIII[37], lIllIlIIII[38])));
            bx.putAll(Map.of(lIllIlIIII[41], e.c(lIllIlIIII[42], lIllIlIIII[43]), lIllIlIIII[44], e.c(lIllIlIIII[42], lIllIlIIII[43]), lIllIlIIII[45], e.c(lIllIlIIII[42], lIllIlIIII[43])));
        }
        if (h.lIIllIIlIllIl(Skills.getLevel((Skill)Skill.DEFENCE), lIllIlIIII[5]) && h.lIIllIIlIlIII(Skills.getLevel((Skill)Skill.DEFENCE), lIllIlIIII[46])) {
            bq.putAll(Map.of(lIllIlIIII[47], e.c(lIllIlIIII[26], lIllIlIIII[27])));
            bv.putAll(Map.of(lIllIlIIII[48], e.c(lIllIlIIII[26], lIllIlIIII[27]), lIllIlIIII[32], e.c(lIllIlIIII[30], lIllIlIIII[31])));
            bu.putAll(Map.of(lIllIlIIII[49], e.c(lIllIlIIII[34], lIllIlIIII[35])));
            bw.putAll(Map.of(lIllIlIIII[50], e.c(lIllIlIIII[37], lIllIlIIII[38]), lIllIlIIII[39], e.c(lIllIlIIII[37], lIllIlIIII[38])));
            bx.putAll(Map.of(lIllIlIIII[41], e.c(lIllIlIIII[42], lIllIlIIII[43]), lIllIlIIII[51], e.c(lIllIlIIII[42], lIllIlIIII[43])));
        }
        if (h.lIIllIIlIllIl(Skills.getLevel((Skill)Skill.DEFENCE), lIllIlIIII[46]) && h.lIIllIIlIlIII(Skills.getLevel((Skill)Skill.DEFENCE), lIllIlIIII[52])) {
            bq.putAll(Map.of(lIllIlIIII[53], e.c(lIllIlIIII[26], lIllIlIIII[27]), lIllIlIIII[47], e.c(lIllIlIIII[26], lIllIlIIII[27]), lIllIlIIII[54], e.c(lIllIlIIII[55], lIllIlIIII[56])));
            bv.putAll(Map.of(lIllIlIIII[57], e.c(lIllIlIIII[26], lIllIlIIII[27]), lIllIlIIII[48], e.c(lIllIlIIII[26], lIllIlIIII[27]), lIllIlIIII[127], e.c(lIllIlIIII[55], lIllIlIIII[56])));
            bu.putAll(Map.of(lIllIlIIII[58], e.c(lIllIlIIII[34], lIllIlIIII[35])));
            bw.putAll(Map.of(lIllIlIIII[50], e.c(lIllIlIIII[37], lIllIlIIII[38]), lIllIlIIII[59], e.c(lIllIlIIII[37], lIllIlIIII[38]), lIllIlIIII[60], e.c(lIllIlIIII[61], lIllIlIIII[62])));
            bx.putAll(Map.of(lIllIlIIII[63], e.c(lIllIlIIII[42], lIllIlIIII[43]), lIllIlIIII[51], e.c(lIllIlIIII[42], lIllIlIIII[43]), lIllIlIIII[64], e.c(lIllIlIIII[42], lIllIlIIII[43])));
        }
        if (h.lIIllIIlIllIl(Skills.getLevel((Skill)Skill.DEFENCE), lIllIlIIII[52]) && h.lIIllIIlIlIII(Skills.getLevel((Skill)Skill.DEFENCE), lIllIlIIII[65])) {
            bq.putAll(Map.of(lIllIlIIII[66], e.c(lIllIlIIII[26], lIllIlIIII[27]), lIllIlIIII[67], e.c(lIllIlIIII[55], lIllIlIIII[68])));
            bv.putAll(Map.of(lIllIlIIII[69], e.c(lIllIlIIII[26], lIllIlIIII[27]), lIllIlIIII[70], e.c(lIllIlIIII[55], lIllIlIIII[68]), lIllIlIIII[57], e.c(lIllIlIIII[26], lIllIlIIII[27])));
            bu.putAll(Map.of(lIllIlIIII[71], e.c(lIllIlIIII[34], lIllIlIIII[35])));
            bw.putAll(Map.of(lIllIlIIII[72], e.c(lIllIlIIII[37], lIllIlIIII[38]), lIllIlIIII[59], e.c(lIllIlIIII[37], lIllIlIIII[38]), lIllIlIIII[73], e.c(lIllIlIIII[74], lIllIlIIII[75]), lIllIlIIII[76], e.c(lIllIlIIII[74], lIllIlIIII[75])));
            bx.putAll(Map.of(lIllIlIIII[63], e.c(lIllIlIIII[42], lIllIlIIII[43]), lIllIlIIII[77], e.c(lIllIlIIII[42], lIllIlIIII[43]), lIllIlIIII[78], e.c(lIllIlIIII[42], lIllIlIIII[43])));
        }
        if (h.lIIllIIlIllIl(Skills.getLevel((Skill)Skill.DEFENCE), lIllIlIIII[65]) && h.lIIllIIlIlIII(Skills.getLevel((Skill)Skill.DEFENCE), lIllIlIIII[79])) {
            bq.putAll(Map.of(lIllIlIIII[66], e.c(lIllIlIIII[26], lIllIlIIII[27]), lIllIlIIII[80], e.c(lIllIlIIII[55], lIllIlIIII[68]), lIllIlIIII[128], e.c(lIllIlIIII[82], lIllIlIIII[83])));
            bv.putAll(Map.of(lIllIlIIII[69], e.c(lIllIlIIII[26], lIllIlIIII[27]), lIllIlIIII[84], e.c(lIllIlIIII[55], lIllIlIIII[68]), lIllIlIIII[85], e.c(lIllIlIIII[82], lIllIlIIII[83])));
            bu.putAll(Map.of(lIllIlIIII[89], e.c(lIllIlIIII[90], lIllIlIIII[91])));
            bw.putAll(Map.of(lIllIlIIII[72], e.c(lIllIlIIII[37], lIllIlIIII[38]), lIllIlIIII[92], e.c(lIllIlIIII[74], lIllIlIIII[75]), lIllIlIIII[73], e.c(lIllIlIIII[74], lIllIlIIII[75]), lIllIlIIII[76], e.c(lIllIlIIII[74], lIllIlIIII[75])));
            bx.putAll(Map.of(lIllIlIIII[93], e.c(lIllIlIIII[42], lIllIlIIII[43]), lIllIlIIII[77], e.c(lIllIlIIII[42], lIllIlIIII[43]), lIllIlIIII[96], e.c(lIllIlIIII[94], lIllIlIIII[95])));
        }
        br.putAll(Map.of(lIllIlIIII[129], e.c(lIllIlIIII[98], lIllIlIIII[42]), lIllIlIIII[97], e.c(lIllIlIIII[98], lIllIlIIII[42]), lIllIlIIII[99], e.c(lIllIlIIII[98], lIllIlIIII[42]), lIllIlIIII[100], e.c(lIllIlIIII[101], lIllIlIIII[102]), lIllIlIIII[103], e.c(lIllIlIIII[98], lIllIlIIII[42])));
        bs.putAll(Map.of(lIllIlIIII[104], e.c(lIllIlIIII[105], lIllIlIIII[106]), lIllIlIIII[107], e.c(lIllIlIIII[105], lIllIlIIII[106]), lIllIlIIII[108], e.c(lIllIlIIII[105], lIllIlIIII[106]), lIllIlIIII[109], e.c(lIllIlIIII[105], lIllIlIIII[106]), lIllIlIIII[110], e.c(lIllIlIIII[105], lIllIlIIII[106])));
        bt.putAll(Map.of(lIllIlIIII[130], e.c(lIllIlIIII[131], lIllIlIIII[132]), lIllIlIIII[133], e.c(lIllIlIIII[131], lIllIlIIII[132]), lIllIlIIII[134], e.c(lIllIlIIII[131], lIllIlIIII[132]), lIllIlIIII[135], e.c(lIllIlIIII[131], lIllIlIIII[132])));
        by.putAll(Map.of(lIllIlIIII[136], e.c(lIllIlIIII[137], lIllIlIIII[68])));
        bz.putAll(Map.of(lIllIlIIII[119], e.c(lIllIlIIII[115], lIllIlIIII[116]), lIllIlIIII[138], e.c(lIllIlIIII[115], lIllIlIIII[116]), lIllIlIIII[139], e.c(lIllIlIIII[115], lIllIlIIII[116]), lIllIlIIII[140], e.c(lIllIlIIII[115], lIllIlIIII[116]), lIllIlIIII[141], e.c(lIllIlIIII[115], lIllIlIIII[116])));
        if (h.lIIllIIlIllIl(Skills.getLevel((Skill)Skill.DEFENCE), lIllIlIIII[5]) && h.lIIllIIlIlIII(Skills.getLevel((Skill)Skill.DEFENCE), lIllIlIIII[46])) {
            bz.putAll(Map.of(lIllIlIIII[142], e.c(lIllIlIIII[115], lIllIlIIII[116])));
        }
        if (h.lIIllIIlIllIl(Skills.getLevel((Skill)Skill.DEFENCE), lIllIlIIII[46]) && h.lIIllIIlIlIII(Skills.getLevel((Skill)Skill.DEFENCE), lIllIlIIII[52])) {
            bz.putAll(Map.of(lIllIlIIII[143], e.c(lIllIlIIII[115], lIllIlIIII[116])));
        }
        if (h.lIIllIIlIllIl(Skills.getLevel((Skill)Skill.DEFENCE), lIllIlIIII[65]) && h.lIIllIIlIlIII(Skills.getLevel((Skill)Skill.DEFENCE), lIllIlIIII[79])) {
            bz.putAll(Map.of(lIllIlIIII[144], e.c(lIllIlIIII[115], lIllIlIIII[116])));
        }
        bA.putAll(Map.of(lIllIlIIII[16], e.c(lIllIlIIII[145], lIllIlIIII[146])));
    }

    private static void P() {
        if (h.lIIllIIlIlIII(Skills.getLevel((Skill)Skill.DEFENCE), lIllIlIIII[5])) {
            bq.putAll(Map.of(lIllIlIIII[25], e.c(lIllIlIIII[26], lIllIlIIII[27]), lIllIlIIII[28], e.c(lIllIlIIII[26], lIllIlIIII[27])));
            bv.putAll(Map.of(lIllIlIIII[29], e.c(lIllIlIIII[30], lIllIlIIII[31]), lIllIlIIII[32], e.c(lIllIlIIII[30], lIllIlIIII[31])));
            bu.putAll(Map.of(lIllIlIIII[33], e.c(lIllIlIIII[34], lIllIlIIII[35])));
            bw.putAll(Map.of(lIllIlIIII[36], e.c(lIllIlIIII[37], lIllIlIIII[38]), lIllIlIIII[39], e.c(lIllIlIIII[37], lIllIlIIII[38]), lIllIlIIII[40], e.c(lIllIlIIII[37], lIllIlIIII[38])));
            bx.putAll(Map.of(lIllIlIIII[41], e.c(lIllIlIIII[42], lIllIlIIII[43]), lIllIlIIII[44], e.c(lIllIlIIII[42], lIllIlIIII[43]), lIllIlIIII[45], e.c(lIllIlIIII[42], lIllIlIIII[43])));
        }
        if (h.lIIllIIlIllIl(Skills.getLevel((Skill)Skill.DEFENCE), lIllIlIIII[5]) && h.lIIllIIlIlIII(Skills.getLevel((Skill)Skill.DEFENCE), lIllIlIIII[46])) {
            bq.putAll(Map.of(lIllIlIIII[47], e.c(lIllIlIIII[26], lIllIlIIII[27])));
            bv.putAll(Map.of(lIllIlIIII[48], e.c(lIllIlIIII[26], lIllIlIIII[27]), lIllIlIIII[32], e.c(lIllIlIIII[30], lIllIlIIII[31])));
            bu.putAll(Map.of(lIllIlIIII[49], e.c(lIllIlIIII[34], lIllIlIIII[35])));
            bw.putAll(Map.of(lIllIlIIII[50], e.c(lIllIlIIII[37], lIllIlIIII[38]), lIllIlIIII[39], e.c(lIllIlIIII[37], lIllIlIIII[38])));
            bx.putAll(Map.of(lIllIlIIII[41], e.c(lIllIlIIII[42], lIllIlIIII[43]), lIllIlIIII[51], e.c(lIllIlIIII[42], lIllIlIIII[43])));
        }
        if (h.lIIllIIlIllIl(Skills.getLevel((Skill)Skill.DEFENCE), lIllIlIIII[46]) && h.lIIllIIlIlIII(Skills.getLevel((Skill)Skill.DEFENCE), lIllIlIIII[52])) {
            bq.putAll(Map.of(lIllIlIIII[53], e.c(lIllIlIIII[26], lIllIlIIII[27]), lIllIlIIII[47], e.c(lIllIlIIII[26], lIllIlIIII[27]), lIllIlIIII[54], e.c(lIllIlIIII[55], lIllIlIIII[56])));
            bv.putAll(Map.of(lIllIlIIII[57], e.c(lIllIlIIII[26], lIllIlIIII[27]), lIllIlIIII[48], e.c(lIllIlIIII[26], lIllIlIIII[27])));
            bu.putAll(Map.of(lIllIlIIII[58], e.c(lIllIlIIII[34], lIllIlIIII[35])));
            bw.putAll(Map.of(lIllIlIIII[50], e.c(lIllIlIIII[37], lIllIlIIII[38]), lIllIlIIII[59], e.c(lIllIlIIII[37], lIllIlIIII[38]), lIllIlIIII[60], e.c(lIllIlIIII[61], lIllIlIIII[62])));
            bx.putAll(Map.of(lIllIlIIII[63], e.c(lIllIlIIII[42], lIllIlIIII[43]), lIllIlIIII[51], e.c(lIllIlIIII[42], lIllIlIIII[43]), lIllIlIIII[64], e.c(lIllIlIIII[42], lIllIlIIII[43])));
        }
        if (h.lIIllIIlIllIl(Skills.getLevel((Skill)Skill.DEFENCE), lIllIlIIII[52]) && h.lIIllIIlIlIII(Skills.getLevel((Skill)Skill.DEFENCE), lIllIlIIII[65])) {
            bq.putAll(Map.of(lIllIlIIII[66], e.c(lIllIlIIII[26], lIllIlIIII[27]), lIllIlIIII[67], e.c(lIllIlIIII[55], lIllIlIIII[68])));
            bv.putAll(Map.of(lIllIlIIII[69], e.c(lIllIlIIII[26], lIllIlIIII[27]), lIllIlIIII[70], e.c(lIllIlIIII[55], lIllIlIIII[68]), lIllIlIIII[57], e.c(lIllIlIIII[26], lIllIlIIII[27])));
            bu.putAll(Map.of(lIllIlIIII[71], e.c(lIllIlIIII[34], lIllIlIIII[35])));
            bw.putAll(Map.of(lIllIlIIII[72], e.c(lIllIlIIII[37], lIllIlIIII[38]), lIllIlIIII[59], e.c(lIllIlIIII[37], lIllIlIIII[38]), lIllIlIIII[73], e.c(lIllIlIIII[74], lIllIlIIII[75]), lIllIlIIII[76], e.c(lIllIlIIII[74], lIllIlIIII[75])));
            bx.putAll(Map.of(lIllIlIIII[63], e.c(lIllIlIIII[42], lIllIlIIII[43]), lIllIlIIII[77], e.c(lIllIlIIII[42], lIllIlIIII[43]), lIllIlIIII[78], e.c(lIllIlIIII[42], lIllIlIIII[43])));
        }
        if (h.lIIllIIlIllIl(Skills.getLevel((Skill)Skill.DEFENCE), lIllIlIIII[65]) && h.lIIllIIlIlIII(Skills.getLevel((Skill)Skill.DEFENCE), lIllIlIIII[79])) {
            bq.putAll(Map.of(lIllIlIIII[66], e.c(lIllIlIIII[26], lIllIlIIII[27]), lIllIlIIII[80], e.c(lIllIlIIII[55], lIllIlIIII[68]), lIllIlIIII[81], e.c(lIllIlIIII[82], lIllIlIIII[83])));
            bv.putAll(Map.of(lIllIlIIII[69], e.c(lIllIlIIII[26], lIllIlIIII[27]), lIllIlIIII[84], e.c(lIllIlIIII[55], lIllIlIIII[68]), lIllIlIIII[85], e.c(lIllIlIIII[82], lIllIlIIII[83]), lIllIlIIII[86], e.c(lIllIlIIII[82], lIllIlIIII[83]), lIllIlIIII[87], e.c(lIllIlIIII[82], lIllIlIIII[83]), lIllIlIIII[88], e.c(lIllIlIIII[82], lIllIlIIII[83])));
            bu.putAll(Map.of(lIllIlIIII[89], e.c(lIllIlIIII[90], lIllIlIIII[91])));
            bw.putAll(Map.of(lIllIlIIII[72], e.c(lIllIlIIII[37], lIllIlIIII[38]), lIllIlIIII[92], e.c(lIllIlIIII[74], lIllIlIIII[75]), lIllIlIIII[73], e.c(lIllIlIIII[74], lIllIlIIII[75])));
            bx.putAll(Map.of(lIllIlIIII[93], e.c(lIllIlIIII[94], lIllIlIIII[95]), lIllIlIIII[96], e.c(lIllIlIIII[94], lIllIlIIII[95])));
        }
        br.putAll(Map.of(lIllIlIIII[97], e.c(lIllIlIIII[98], lIllIlIIII[42]), lIllIlIIII[99], e.c(lIllIlIIII[98], lIllIlIIII[42]), lIllIlIIII[100], e.c(lIllIlIIII[101], lIllIlIIII[102]), lIllIlIIII[103], e.c(lIllIlIIII[98], lIllIlIIII[42])));
        bs.putAll(Map.of(lIllIlIIII[104], e.c(lIllIlIIII[105], lIllIlIIII[106]), lIllIlIIII[107], e.c(lIllIlIIII[105], lIllIlIIII[106]), lIllIlIIII[108], e.c(lIllIlIIII[105], lIllIlIIII[106]), lIllIlIIII[109], e.c(lIllIlIIII[105], lIllIlIIII[106]), lIllIlIIII[110], e.c(lIllIlIIII[105], lIllIlIIII[106])));
        bt.putAll(Map.of(lIllIlIIII[111], e.c(lIllIlIIII[112], lIllIlIIII[113])));
        by.putAll(Map.of(lIllIlIIII[114], e.c(lIllIlIIII[115], lIllIlIIII[116]), lIllIlIIII[117], e.c(lIllIlIIII[115], lIllIlIIII[116]), lIllIlIIII[118], e.c(lIllIlIIII[115], lIllIlIIII[116])));
        bz.putAll(Map.of(lIllIlIIII[119], e.c(lIllIlIIII[115], lIllIlIIII[116]), lIllIlIIII[120], e.c(lIllIlIIII[115], lIllIlIIII[116]), lIllIlIIII[121], e.c(lIllIlIIII[115], lIllIlIIII[116]), lIllIlIIII[122], e.c(lIllIlIIII[115], lIllIlIIII[116])));
        bA.putAll(Map.of(lIllIlIIII[123], e.c(lIllIlIIII[115], lIllIlIIII[116]), lIllIlIIII[124], e.c(lIllIlIIII[115], lIllIlIIII[116]), lIllIlIIII[125], e.c(lIllIlIIII[115], lIllIlIIII[116]), lIllIlIIII[126], e.c(lIllIlIIII[115], lIllIlIIII[116])));
    }

    static {
        h.lIIllIIlIIlIl();
        h.lIIllIIIlIIll();
        bp = new ArrayList<d>();
        bq = new HashMap<Integer, Integer>();
        br = new HashMap<Integer, Integer>();
        bs = new HashMap<Integer, Integer>();
        bt = new HashMap<Integer, Integer>();
        bu = new HashMap<Integer, Integer>();
        bv = new HashMap<Integer, Integer>();
        bw = new HashMap<Integer, Integer>();
        bx = new HashMap<Integer, Integer>();
        by = new HashMap<Integer, Integer>();
        bz = new HashMap<Integer, Integer>();
        bA = new HashMap<Integer, Integer>();
    }

    private static boolean lIIllIIlIlIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIllIIlIllII(int n2, int n3) {
        return n2 != n3;
    }

    private static void R() {
        if (h.lIIllIIlIlIII(Skills.getLevel((Skill)Skill.RANGED), lIllIlIIII[147])) {
            bq.putAll(Map.of(lIllIlIIII[148], e.c(lIllIlIIII[149], lIllIlIIII[150])));
        }
        if (h.lIIllIIlIllIl(Skills.getLevel((Skill)Skill.RANGED), lIllIlIIII[147])) {
            bq.putAll(Map.of(lIllIlIIII[151], e.c(lIllIlIIII[152], lIllIlIIII[153])));
        }
        bu.putAll(Map.of(lIllIlIIII[154], e.c(lIllIlIIII[155], lIllIlIIII[156])));
        if (h.lIIllIIlIlIII(Skills.getLevel((Skill)Skill.RANGED), lIllIlIIII[79])) {
            bw.putAll(Map.of(lIllIlIIII[157], e.c(lIllIlIIII[131], lIllIlIIII[132])));
        }
        if (h.lIIllIIlIllIl(Skills.getLevel((Skill)Skill.RANGED), lIllIlIIII[79]) && h.lIIllIIlIlIII(Skills.getLevel((Skill)Skill.RANGED), lIllIlIIII[147])) {
            bw.putAll(Map.of(lIllIlIIII[158], e.c(lIllIlIIII[131], lIllIlIIII[132])));
        }
        if (h.lIIllIIlIllIl(Skills.getLevel((Skill)Skill.RANGED), lIllIlIIII[147])) {
            bw.putAll(Map.of(lIllIlIIII[159], e.c(lIllIlIIII[160], lIllIlIIII[161])));
        }
        if (h.lIIllIIlIlIII(Skills.getLevel((Skill)Skill.RANGED), lIllIlIIII[79])) {
            bx.putAll(Map.of(lIllIlIIII[162], e.c(lIllIlIIII[131], lIllIlIIII[132])));
        }
        if (h.lIIllIIlIllIl(Skills.getLevel((Skill)Skill.RANGED), lIllIlIIII[79]) && h.lIIllIIlIlIII(Skills.getLevel((Skill)Skill.RANGED), lIllIlIIII[147])) {
            bx.putAll(Map.of(lIllIlIIII[163], e.c(lIllIlIIII[131], lIllIlIIII[132])));
        }
        if (h.lIIllIIlIllIl(Skills.getLevel((Skill)Skill.RANGED), lIllIlIIII[147])) {
            bx.putAll(Map.of(lIllIlIIII[164], e.c(lIllIlIIII[165], lIllIlIIII[166])));
        }
        br.putAll(Map.of(lIllIlIIII[129], e.c(lIllIlIIII[167], lIllIlIIII[168])));
        bs.putAll(Map.of(lIllIlIIII[169], e.c(lIllIlIIII[170], lIllIlIIII[171])));
        if (h.lIIllIIlIlIII(Skills.getLevel((Skill)Skill.RANGED), lIllIlIIII[147])) {
            by.putAll(Map.of(lIllIlIIII[136], e.c(lIllIlIIII[137], lIllIlIIII[68])));
        }
        if (h.lIIllIIlIllIl(Skills.getLevel((Skill)Skill.RANGED), lIllIlIIII[147])) {
            by.putAll(Map.of(lIllIlIIII[172], e.c(lIllIlIIII[173], lIllIlIIII[174])));
        }
        if (h.lIIllIIlIlIII(Skills.getLevel((Skill)Skill.RANGED), lIllIlIIII[147])) {
            bz.putAll(Map.of(lIllIlIIII[175], e.c(lIllIlIIII[176], lIllIlIIII[177])));
        }
        if (h.lIIllIIlIllIl(Skills.getLevel((Skill)Skill.RANGED), lIllIlIIII[147])) {
            bz.putAll(Map.of(lIllIlIIII[178], e.c(lIllIlIIII[179], lIllIlIIII[180])));
        }
        bA.putAll(Map.of(lIllIlIIII[16], e.c(lIllIlIIII[145], lIllIlIIII[146])));
    }

    private static boolean lIIllIIlIIllI(int n2) {
        return n2 != 0;
    }
}

