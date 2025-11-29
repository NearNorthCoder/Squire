/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.MenuAction
 *  net.runelite.api.NPC
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Combat$AttackStyle
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.client.Static
 */
package gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks;

import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.Fdd2f9b9-6584-4a70-afa7-d1946c214094Manager;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.Fdd2f9b9-6584-4a70-afa7-d1946c214094Manager;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.DHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.Fdd2f9b9-6584-4a70-afa7-d1946c214094Manager;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.FHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.Fdd2f9b9-6584-4a70-afa7-d1946c214094Manager;
import gg.squire.account.AccBuilderRogues;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import net.runelite.api.MenuAction;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.client.Static;

public class Fdd2f9b9-6584-4a70-afa7-d1946c214094Manager
implements G {
    public static  WorldPoint iH;
    public static  WorldPoint bx;
    public static  WorldArea iF;
    
    public static  boolean bt;
    public static  WorldArea iE;
    public static  List<d> bv;
    public static  WorldPoint iI;
    
    public static  WorldArea iG;
    public static  int[] iD;

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = 0;
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = 0;
        while (var11 < var10) {
            char var12 = var9[var11];
            var6.append((char)(var12 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if (3 != 1) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    public static void af() {
        d var13;
        int[] nArray = new int[1];
        nArray[0] = 9;
        if ((Bank.contains((int[] == 0)nArray) ? 1 : 0)) {
            d d2 = new DHelper(9, 2, var1[51]);
            bv.add(d2);
            0;
        }
        int[] nArray2 = new int[1];
        nArray2[0] = var1[52];
        if ((Bank.contains((int[] == 0)nArray2) ? 1 : 0)) {
            var13 = new DHelper(var1[52], var1[10], var1[51]);
            bv.add(var13);
            0;
        }
        int[] nArray3 = new int[1];
        nArray3[0] = var1[49];
        if ((Bank.contains((int[] == 0)nArray3) ? 1 : 0)) {
            var13 = new DHelper(var1[49], 1, var1[53]);
            bv.add(var13);
            0;
        }
        int[] nArray4 = new int[1];
        nArray4[0] = var1[47];
        if ((Bank.contains((int[] == 0)nArray4) ? 1 : 0)) {
            var13 = new DHelper(var1[47], 1, var1[54]);
            bv.add(var13);
            0;
        }
        int[] nArray5 = new int[1];
        nArray5[0] = var1[11];
        if ((Bank.contains((int[] == 0)nArray5) ? 1 : 0)) {
            var13 = new DHelper(var1[11], var1[12], var1[55]);
            bv.add(var13);
            0;
        }
        int[] nArray6 = new int[1];
        nArray6[0] = var1[40];
        if ((Bank.contains((int[] == 0)nArray6) ? 1 : 0)) {
            var13 = new DHelper(var1[40], 1, var1[56]);
            bv.add(var13);
            0;
        }
        int[] nArray7 = new int[1];
        nArray7[0] = var1[44];
        if ((Bank.contains((int[] == 0)nArray7) ? 1 : 0)) {
            var13 = new DHelper(var1[44], 1, var1[56]);
            bv.add(var13);
            0;
        }
        int[] nArray8 = new int[1];
        nArray8[0] = var1[45];
        if ((Bank.contains((int[] == 0)nArray8) ? 1 : 0)) {
            var13 = new DHelper(var1[45], 1, var1[56]);
            bv.add(var13);
            0;
        }
        int[] nArray9 = new int[1];
        nArray9[0] = var1[42];
        if ((Bank.contains((int[] == 0)nArray9) ? 1 : 0)) {
            var13 = new DHelper(var1[42], 1, var1[56]);
            bv.add(var13);
            0;
        }
        if ((Skills.getLevel((SkiSkill.ATTACK) >= 2)) {
            int[] nArray10 = new int[1];
            nArray10[0] = var1[17];
            if ((Bank.contains((int[] == 0)nArray10) ? 1 : 0)) {
                var13 = new DHelper(var1[17], 1, var1[54]);
                bv.add(var13);
                0;
            }
        }
        int[] nArray11 = new int[1];
        nArray11[0] = var1[16];
        if ((Bank.contains((int[] == 0)nArray11) ? 1 : 0)) {
            var13 = new DHelper(var1[16], 1, var1[56]);
            bv.add(var13);
            0;
        }
    }

    public static void cx() {
        if ((Static.getClient().getVar(var1[22]) == 1)) {
            Static.getClient().invokeMenuAction(var2[var1[13]], var2[var1[26]], 1, MenuAction.CC_OP.getId(), var1[27], var1[28]);
        }
        if ((Skills.getLevel((SkiSkill.ATTACK) < var1[10])) {
            String[] stringArray = new String[1];
            stringArray[0] = var2[var1[29]];
            if ((Inventory.contains((String[] != 0)stringArray) ? 1 : 0)) {
                String[] stringArray2 = new String[1];
                stringArray2[0] = var2[var1[30]];
                Inventory.getFirst((String[])stringArray2).interact(var2[var1[31]]);
            }
        }
        if ((Skills.getLevel((SkiSkill.ATTACK) >= var1[10]) && (Skills.getLevel((SkiSkill.ATTACK) < var1[19])) {
            String[] stringArray = new String[1];
            stringArray[0] = var2[var1[19]];
            if ((Inventory.contains((String[] != 0)stringArray) ? 1 : 0)) {
                String[] stringArray3 = new String[1];
                stringArray3[0] = var2[var1[32]];
                Inventory.getFirst((String[])stringArray3).interact(var2[var1[33]]);
            }
        }
        if ((Skills.getLevel((SkiSkill.ATTACK) >= var1[19]) && (Skills.getLevel((SkiSkill.ATTACK) < var1[34])) {
            String[] stringArray = new String[1];
            stringArray[0] = var2[var1[35]];
            if ((Inventory.contains((String[] != 0)stringArray) ? 1 : 0)) {
                String[] stringArray4 = new String[1];
                stringArray4[0] = var2[var1[36]];
                Inventory.getFirst((String[])stringArray4).interact(var2[var1[37]]);
            }
        }
        if ((Skills.getLevel((SkiSkill.ATTACK) >= var1[34]) && (Skills.getLevel((SkiSkill.ATTACK) < 2)) {
            int[] nArray = new int[1];
            nArray[0] = var1[16];
            if ((Inventory.contains((int[] != 0)nArray) ? 1 : 0)) {
                int[] nArray2 = new int[1];
                nArray2[0] = var1[16];
                Inventory.getFirst((int[])nArray2).interact(var2[var1[38]]);
            }
        }
        if ((Skills.getLevel((SkiSkill.ATTACK) >= 2)) {
            int[] nArray = new int[1];
            nArray[0] = var1[17];
            if ((Inventory.contains((int[] != 0)nArray) ? 1 : 0)) {
                int[] nArray3 = new int[1];
                nArray3[0] = var1[17];
                Inventory.getFirst((int[])nArray3).interact(var2[var1[39]]);
            }
        }
        if ((Skills.getLevel((SkiSkill.DEFENCE) >= var1[34])) {
            int[] nArray = new int[1];
            nArray[0] = var1[40];
            if ((Inventory.contains((int[] != 0)nArray) ? 1 : 0)) {
                int[] nArray4 = new int[1];
                nArray4[0] = var1[40];
                Inventory.getFirst((int[])nArray4).interact(var2[var1[41]]);
            }
            int[] nArray5 = new int[1];
            nArray5[0] = var1[42];
            if ((Inventory.contains((int[] != 0)nArray5) ? 1 : 0)) {
                int[] nArray6 = new int[1];
                nArray6[0] = var1[42];
                Inventory.getFirst((int[])nArray6).interact(var2[var1[43]]);
            }
            int[] nArray7 = new int[1];
            nArray7[0] = var1[44];
            if ((Inventory.contains((int[] != 0)nArray7) ? 1 : 0)) {
                int[] nArray8 = new int[1];
                nArray8[0] = var1[44];
                Inventory.getFirst((int[])nArray8).interact(var2[var1[34]]);
            }
            int[] nArray9 = new int[1];
            nArray9[0] = var1[45];
            if ((Inventory.contains((int[] != 0)nArray9) ? 1 : 0)) {
                int[] nArray10 = new int[1];
                nArray10[0] = var1[45];
                Inventory.getFirst((int[])nArray10).interact(var2[var1[46]]);
            }
        }
        int[] nArray = new int[1];
        nArray[0] = var1[47];
        if ((Inventory.contains((int[] != 0)nArray) ? 1 : 0)) {
            int[] nArray11 = new int[1];
            nArray11[0] = var1[47];
            Inventory.getFirst((int[])nArray11).interact(var2[var1[48]]);
        }
        int[] nArray12 = new int[1];
        nArray12[0] = var1[49];
        if ((Inventory.contains((int[] != 0)nArray12) ? 1 : 0)) {
            int[] nArray13 = new int[1];
            nArray13[0] = var1[49];
            Inventory.getFirst((int[])nArray13).interact(var2[var1[50]]);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean cy() {
        int n2;
        block15: {
            block22: {
                block21: {
                    block20: {
                        block19: {
                            block18: {
                                block17: {
                                    block16: {
                                        block14: {
                                            block4: {
                                                int n3;
                                                block6: {
                                                    block13: {
                                                        block12: {
                                                            block11: {
                                                                block10: {
                                                                    block9: {
                                                                        block8: {
                                                                            block7: {
                                                                                block5: {
                                                                                    if (!(Skills.getLevel((SkiSkill.ATTACK) >= 2)) break block4;
                                                                                    int[] nArray = new int[1];
                                                                                    nArray[0] = var1[17];
                                                                                    if (!(Equipment.contains((int[] == 0)nArray) ? 1 : 0)) break block5;
                                                                                    int[] nArray2 = new int[1];
                                                                                    nArray2[0] = var1[17];
                                                                                    if (!(Inventory.contains((int[] == 0)nArray2) ? 1 : 0)) break block5;
                                                                                    int[] nArray3 = new int[1];
                                                                                    nArray3[0] = var1[17];
                                                                                    if (!(Bank.contains((int[] != 0)nArray3) ? 1 : 0)) break block6;
                                                                                }
                                                                                int[] nArray = new int[1];
                                                                                nArray[0] = var1[42];
                                                                                if (!(Equipment.contains((int[] == 0)nArray) ? 1 : 0)) break block7;
                                                                                int[] nArray4 = new int[1];
                                                                                nArray4[0] = var1[42];
                                                                                if (!(Inventory.contains((int[] == 0)nArray4) ? 1 : 0)) break block7;
                                                                                int[] nArray5 = new int[1];
                                                                                nArray5[0] = var1[42];
                                                                                if (!(Bank.contains((int[] != 0)nArray5) ? 1 : 0)) break block6;
                                                                            }
                                                                            int[] nArray = new int[1];
                                                                            nArray[0] = var1[44];
                                                                            if (!(Equipment.contains((int[] == 0)nArray) ? 1 : 0)) break block8;
                                                                            int[] nArray6 = new int[1];
                                                                            nArray6[0] = var1[44];
                                                                            if (!(Inventory.contains((int[] == 0)nArray6) ? 1 : 0)) break block8;
                                                                            int[] nArray7 = new int[1];
                                                                            nArray7[0] = var1[44];
                                                                            if (!(Bank.contains((int[] != 0)nArray7) ? 1 : 0)) break block6;
                                                                        }
                                                                        int[] nArray = new int[1];
                                                                        nArray[0] = var1[40];
                                                                        if (!(Equipment.contains((int[] == 0)nArray) ? 1 : 0)) break block9;
                                                                        int[] nArray8 = new int[1];
                                                                        nArray8[0] = var1[40];
                                                                        if (!(Inventory.contains((int[] == 0)nArray8) ? 1 : 0)) break block9;
                                                                        int[] nArray9 = new int[1];
                                                                        nArray9[0] = var1[40];
                                                                        if (!(Bank.contains((int[] != 0)nArray9) ? 1 : 0)) break block6;
                                                                    }
                                                                    int[] nArray = new int[1];
                                                                    nArray[0] = var1[45];
                                                                    if (!(Equipment.contains((int[] == 0)nArray) ? 1 : 0)) break block10;
                                                                    int[] nArray10 = new int[1];
                                                                    nArray10[0] = var1[45];
                                                                    if (!(Inventory.contains((int[] == 0)nArray10) ? 1 : 0)) break block10;
                                                                    int[] nArray11 = new int[1];
                                                                    nArray11[0] = var1[45];
                                                                    if (!(Bank.contains((int[] != 0)nArray11) ? 1 : 0)) break block6;
                                                                }
                                                                int[] nArray = new int[1];
                                                                nArray[0] = var1[47];
                                                                if (!(Inventory.contains((int[] == 0)nArray) ? 1 : 0)) break block11;
                                                                int[] nArray12 = new int[1];
                                                                nArray12[0] = var1[47];
                                                                if (!(Equipment.contains((int[] == 0)nArray12) ? 1 : 0)) break block11;
                                                                int[] nArray13 = new int[1];
                                                                nArray13[0] = var1[47];
                                                                if (!(Bank.contains((int[] != 0)nArray13) ? 1 : 0)) break block6;
                                                            }
                                                            int[] nArray = new int[1];
                                                            nArray[0] = var1[49];
                                                            if (!(Inventory.contains((int[] == 0)nArray) ? 1 : 0)) break block12;
                                                            int[] nArray14 = new int[1];
                                                            nArray14[0] = var1[49];
                                                            if (!(Equipment.contains((int[] == 0)nArray14) ? 1 : 0)) break block12;
                                                            int[] nArray15 = new int[1];
                                                            nArray15[0] = var1[49];
                                                            if (!(Bank.contains((int[] != 0)nArray15) ? 1 : 0)) break block6;
                                                        }
                                                        int[] nArray = new int[1];
                                                        nArray[0] = var1[11];
                                                        if (!(Inventory.contains((int[] == 0)nArray) ? 1 : 0)) break block13;
                                                        int[] nArray16 = new int[1];
                                                        nArray16[0] = var1[11];
                                                        if (!(Bank.contains((int[] != 0)nArray16) ? 1 : 0)) break block6;
                                                    }
                                                    n3 = 1;
                                                    0;
                                                    if (-1 < 1) return n3 != 0;
                                                    return ((0x92 ^ 0xBB ^ (0xC4 ^ 0xA3)) & (17 + 5 - -44 + 61 ^ (0x31 ^ 0) ^ -1)) != 0;
                                                }
                                                n3 = 0;
                                                return n3 != 0;
                                            }
                                            int[] nArray = new int[1];
                                            nArray[0] = var1[16];
                                            if (!(Equipment.contains((int[] == 0)nArray) ? 1 : 0)) break block14;
                                            int[] nArray17 = new int[1];
                                            nArray17[0] = var1[16];
                                            if (!(Inventory.contains((int[] == 0)nArray17) ? 1 : 0)) break block14;
                                            int[] nArray18 = new int[1];
                                            nArray18[0] = var1[16];
                                            if (!(Bank.contains((int[] != 0)nArray18) ? 1 : 0)) break block15;
                                        }
                                        int[] nArray = new int[1];
                                        nArray[0] = var1[42];
                                        if (!(Equipment.contains((int[] == 0)nArray) ? 1 : 0)) break block16;
                                        int[] nArray19 = new int[1];
                                        nArray19[0] = var1[42];
                                        if (!(Inventory.contains((int[] == 0)nArray19) ? 1 : 0)) break block16;
                                        int[] nArray20 = new int[1];
                                        nArray20[0] = var1[42];
                                        if (!(Bank.contains((int[] != 0)nArray20) ? 1 : 0)) break block15;
                                    }
                                    int[] nArray = new int[1];
                                    nArray[0] = var1[44];
                                    if (!(Equipment.contains((int[] == 0)nArray) ? 1 : 0)) break block17;
                                    int[] nArray21 = new int[1];
                                    nArray21[0] = var1[44];
                                    if (!(Inventory.contains((int[] == 0)nArray21) ? 1 : 0)) break block17;
                                    int[] nArray22 = new int[1];
                                    nArray22[0] = var1[44];
                                    if (!(Bank.contains((int[] != 0)nArray22) ? 1 : 0)) break block15;
                                }
                                int[] nArray = new int[1];
                                nArray[0] = var1[40];
                                if (!(Equipment.contains((int[] == 0)nArray) ? 1 : 0)) break block18;
                                int[] nArray23 = new int[1];
                                nArray23[0] = var1[40];
                                if (!(Inventory.contains((int[] == 0)nArray23) ? 1 : 0)) break block18;
                                int[] nArray24 = new int[1];
                                nArray24[0] = var1[40];
                                if (!(Bank.contains((int[] != 0)nArray24) ? 1 : 0)) break block15;
                            }
                            int[] nArray = new int[1];
                            nArray[0] = var1[45];
                            if (!(Equipment.contains((int[] == 0)nArray) ? 1 : 0)) break block19;
                            int[] nArray25 = new int[1];
                            nArray25[0] = var1[45];
                            if (!(Inventory.contains((int[] == 0)nArray25) ? 1 : 0)) break block19;
                            int[] nArray26 = new int[1];
                            nArray26[0] = var1[45];
                            if (!(Bank.contains((int[] != 0)nArray26) ? 1 : 0)) break block15;
                        }
                        int[] nArray = new int[1];
                        nArray[0] = var1[47];
                        if (!(Inventory.contains((int[] == 0)nArray) ? 1 : 0)) break block20;
                        int[] nArray27 = new int[1];
                        nArray27[0] = var1[47];
                        if (!(Equipment.contains((int[] == 0)nArray27) ? 1 : 0)) break block20;
                        int[] nArray28 = new int[1];
                        nArray28[0] = var1[47];
                        if (!(Bank.contains((int[] != 0)nArray28) ? 1 : 0)) break block15;
                    }
                    int[] nArray = new int[1];
                    nArray[0] = var1[49];
                    if (!(Inventory.contains((int[] == 0)nArray) ? 1 : 0)) break block21;
                    int[] nArray29 = new int[1];
                    nArray29[0] = var1[49];
                    if (!(Equipment.contains((int[] == 0)nArray29) ? 1 : 0)) break block21;
                    int[] nArray30 = new int[1];
                    nArray30[0] = var1[49];
                    if (!(Bank.contains((int[] != 0)nArray30) ? 1 : 0)) break block15;
                }
                int[] nArray = new int[1];
                nArray[0] = var1[11];
                if (!(Inventory.contains((int[] == 0)nArray) ? 1 : 0)) break block22;
                int[] nArray31 = new int[1];
                nArray31[0] = var1[11];
                if (!(Bank.contains((int[] != 0)nArray31) ? 1 : 0)) break block15;
            }
            n2 = 1;
            0;
            if (1 > -1) return n2 != 0;
            return ((0xF1 ^ 0xC5 ^ (0x27 ^ 0x3A)) & (0x53 ^ 0x10 ^ (0x31 ^ 0x5B) ^ -1)) != 0;
        }
        n2 = 0;
        return n2 != 0;
    }

        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    static {
        K.var20();
        K.var21();
        bv = new ArrayList<d>();
        int[] nArray = new int[var1[18]];
        nArray[0] = var1[16];
        nArray[1] = var1[17];
        nArray[3] = var1[42];
        nArray[4] = var1[44];
        nArray[6] = var1[40];
        nArray[K.var1[10]] = var1[45];
        nArray[K.var1[14]] = var1[47];
        nArray[K.var1[15]] = var1[49];
        iD = nArray;
        iE = new WorldArea(var1[59], var1[60], var1[22], var1[22], 0);
        iF = new WorldArea(var1[61], var1[62], var1[32], var1[26], 0);
        iG = new WorldArea(var1[63], var1[64], var1[65], var1[34], 0);
        iH = new WorldPoint(var1[66], var1[67], 0);
        bx = new WorldPoint(var1[68], var1[60], 0);
        iI = new WorldPoint(var1[69], var1[70], 0);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean bo() {
        int n2;
        block18: {
            block24: {
                block23: {
                    block22: {
                        block21: {
                            block20: {
                                block19: {
                                    block17: {
                                        block8: {
                                            int n3;
                                            block10: {
                                                block16: {
                                                    block15: {
                                                        block14: {
                                                            block13: {
                                                                block12: {
                                                                    block11: {
                                                                        block9: {
                                                                            if (!(Skills.getLevel((SkiSkill.ATTACK) >= 2)) break block8;
                                                                            int[] nArray = new int[1];
                                                                            nArray[0] = var1[17];
                                                                            if (!(Equipment.contains((int[] == 0)nArray) ? 1 : 0)) break block9;
                                                                            int[] nArray2 = new int[1];
                                                                            nArray2[0] = var1[17];
                                                                            if (!(Inventory.contains((int[] != 0)nArray2) ? 1 : 0)) break block10;
                                                                        }
                                                                        int[] nArray = new int[1];
                                                                        nArray[0] = var1[42];
                                                                        if (!(Equipment.contains((int[] == 0)nArray) ? 1 : 0)) break block11;
                                                                        int[] nArray3 = new int[1];
                                                                        nArray3[0] = var1[42];
                                                                        if (!(Inventory.contains((int[] != 0)nArray3) ? 1 : 0)) break block10;
                                                                    }
                                                                    int[] nArray = new int[1];
                                                                    nArray[0] = var1[44];
                                                                    if (!(Equipment.contains((int[] == 0)nArray) ? 1 : 0)) break block12;
                                                                    int[] nArray4 = new int[1];
                                                                    nArray4[0] = var1[44];
                                                                    if (!(Inventory.contains((int[] != 0)nArray4) ? 1 : 0)) break block10;
                                                                }
                                                                int[] nArray = new int[1];
                                                                nArray[0] = var1[40];
                                                                if (!(Equipment.contains((int[] == 0)nArray) ? 1 : 0)) break block13;
                                                                int[] nArray5 = new int[1];
                                                                nArray5[0] = var1[40];
                                                                if (!(Inventory.contains((int[] != 0)nArray5) ? 1 : 0)) break block10;
                                                            }
                                                            int[] nArray = new int[1];
                                                            nArray[0] = var1[45];
                                                            if (!(Equipment.contains((int[] == 0)nArray) ? 1 : 0)) break block14;
                                                            int[] nArray6 = new int[1];
                                                            nArray6[0] = var1[45];
                                                            if (!(Inventory.contains((int[] != 0)nArray6) ? 1 : 0)) break block10;
                                                        }
                                                        int[] nArray = new int[1];
                                                        nArray[0] = var1[47];
                                                        if (!(Equipment.contains((int[] == 0)nArray) ? 1 : 0)) break block15;
                                                        int[] nArray7 = new int[1];
                                                        nArray7[0] = var1[47];
                                                        if (!(Inventory.contains((int[] != 0)nArray7) ? 1 : 0)) break block10;
                                                    }
                                                    int[] nArray = new int[1];
                                                    nArray[0] = var1[49];
                                                    if (!(Equipment.contains((int[] == 0)nArray) ? 1 : 0)) break block16;
                                                    int[] nArray8 = new int[1];
                                                    nArray8[0] = var1[49];
                                                    if (!(Inventory.contains((int[] != 0)nArray8) ? 1 : 0)) break block10;
                                                }
                                                int[] nArray = new int[1];
                                                nArray[0] = var1[11];
                                                if ((Inventory.contains((int[] != 0)nArray) ? 1 : 0)) {
                                                    n3 = 1;
                                                    0;
                                                    if null == null return n3 != 0;
                                                    return ((0x2C ^ 0x29 ^ (0xE7 ^ 0xC1)) & (0x1D ^ 0x7C ^ (0xFB ^ 0xB9) ^ -1)) != 0;
                                                }
                                            }
                                            n3 = 0;
                                            return n3 != 0;
                                        }
                                        int[] nArray = new int[1];
                                        nArray[0] = var1[16];
                                        if (!(Equipment.contains((int[] == 0)nArray) ? 1 : 0)) break block17;
                                        int[] nArray9 = new int[1];
                                        nArray9[0] = var1[16];
                                        if (!(Inventory.contains((int[] != 0)nArray9) ? 1 : 0)) break block18;
                                    }
                                    int[] nArray = new int[1];
                                    nArray[0] = var1[42];
                                    if (!(Equipment.contains((int[] == 0)nArray) ? 1 : 0)) break block19;
                                    int[] nArray10 = new int[1];
                                    nArray10[0] = var1[42];
                                    if (!(Inventory.contains((int[] != 0)nArray10) ? 1 : 0)) break block18;
                                }
                                int[] nArray = new int[1];
                                nArray[0] = var1[44];
                                if (!(Equipment.contains((int[] == 0)nArray) ? 1 : 0)) break block20;
                                int[] nArray11 = new int[1];
                                nArray11[0] = var1[44];
                                if (!(Inventory.contains((int[] != 0)nArray11) ? 1 : 0)) break block18;
                            }
                            int[] nArray = new int[1];
                            nArray[0] = var1[40];
                            if (!(Equipment.contains((int[] == 0)nArray) ? 1 : 0)) break block21;
                            int[] nArray12 = new int[1];
                            nArray12[0] = var1[40];
                            if (!(Inventory.contains((int[] != 0)nArray12) ? 1 : 0)) break block18;
                        }
                        int[] nArray = new int[1];
                        nArray[0] = var1[45];
                        if (!(Equipment.contains((int[] == 0)nArray) ? 1 : 0)) break block22;
                        int[] nArray13 = new int[1];
                        nArray13[0] = var1[45];
                        if (!(Inventory.contains((int[] != 0)nArray13) ? 1 : 0)) break block18;
                    }
                    int[] nArray = new int[1];
                    nArray[0] = var1[47];
                    if (!(Equipment.contains((int[] == 0)nArray) ? 1 : 0)) break block23;
                    int[] nArray14 = new int[1];
                    nArray14[0] = var1[47];
                    if (!(Inventory.contains((int[] != 0)nArray14) ? 1 : 0)) break block18;
                }
                int[] nArray = new int[1];
                nArray[0] = var1[49];
                if (!(Equipment.contains((int[] == 0)nArray) ? 1 : 0)) break block24;
                int[] nArray15 = new int[1];
                nArray15[0] = var1[49];
                if (!(Inventory.contains((int[] != 0)nArray15) ? 1 : 0)) break block18;
            }
            int[] nArray = new int[1];
            nArray[0] = var1[11];
            if ((Inventory.contains((int[] != 0)nArray) ? 1 : 0)) {
                n2 = 1;
                0;
                if (((0x55 ^ 4 ^ (0x91 ^ 0x96)) & (0x45 ^ 0x72 ^ (0xA4 ^ 0xC5) ^ -1) & ((139 + 119 - 196 + 173 ^ 150 + 46 - 109 + 111) & (0x7A ^ 0x73 ^ (0xB ^ 0x2F) ^ -1) ^ -1)) == ((0x1B ^ 0x7A ^ (0x61 ^ 0x12)) & (0x44 ^ 2 ^ (0x3E ^ 0x6A) ^ -1))) return n2 != 0;
                return ((0x57 ^ 0x51 ^ (0x9F ^ 0xBD)) & (0x34 ^ 0x3F ^ (0x57 ^ 0x78) ^ -1)) != 0;
            }
        }
        n2 = 0;
        return n2 != 0;
    }

    public static void cw() {
        block17: {
            block19: {
                block18: {
                    if (bt != 0) {
                        AccBuilderRogues.c = var2[0];
                        b.a(bv);
                        if ((bv.size() < 1)) {
                            System.out.println(var2[1]);
                            bt = 0;
                        }
                    }
                    if (!(bt == 0)) break block17;
                    if ((K.bo( == 0) ? 1 : 0) && (Skills.getLevel((SkiSkill.DEFENCE) < 2)) {
                        BankLocation var22 = BankLocation.getNearest();
                        if (var22 != null && (var22.getArea( == 0).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderRogues.c = var2[3];
                            a.a(var22);
                        }
                        if (var22 != null && (var22.getArea( != 0).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderRogues.c = var2[4];
                            if ((Bank.isOpen( == 0) ? 1 : 0)) {
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)5);
                                0;
                            }
                            if ((Bank.isOpen( != 0) ? 1 : 0)) {
                                if ((Inventory.getAll( > 0).size())) {
                                    Bank.depositInventory();
                                    Time.sleepTicks((int)1);
                                    0;
                                }
                                if ((Equipment.getAll( > 0).size())) {
                                    Bank.depositEquipment();
                                    Time.sleepTicks((int)3);
                                    0;
                                }
                                if ((K.cy( == 0) ? 1 : 0)) {
                                    K.af();
                                    System.out.println(var2[6]);
                                    bt = 1;
                                    return;
                                }
                                a.a(iD, 1);
                                a.a(7, 8);
                                a.b(f.aV, 1);
                                a.a(9, var1[10]);
                                a.a(var1[11], var1[12]);
                            }
                        }
                    }
                    if (!(K.bo( != 0) ? 1 : 0)) break block17;
                    K.cx();
                    if ((Movement.getRunEnergy() >= var1[13]) && (Movement.isRunEnabled( == 0) ? 1 : 0)) {
                        Movement.toggleRun();
                    }
                    String[] stringArray = new String[1];
                    stringArray[0] = var2[var1[10]];
                    if (!(Equipment.contains((String[] == 0)stringArray) ? 1 : 0)) break block18;
                    String[] stringArray2 = new String[1];
                    stringArray2[0] = var2[var1[14]];
                    if (!(Equipment.contains((String[] == 0)stringArray2) ? 1 : 0)) break block18;
                    String[] stringArray3 = new String[1];
                    stringArray3[0] = var2[var1[15]];
                    if (!(Equipment.contains((String[] == 0)stringArray3) ? 1 : 0)) break block18;
                    int[] nArray = new int[1];
                    nArray[0] = var1[16];
                    if (!(Equipment.contains((int[] == 0)nArray) ? 1 : 0)) break block18;
                    int[] nArray2 = new int[1];
                    nArray2[0] = var1[17];
                    if (!(Equipment.contains((int[] != 0)nArray2) ? 1 : 0)) break block19;
                }
                K.cz();
            }
            if ((K.var23(e.u( < 0), 45.0))) {
                int[] nArray = new int[1];
                nArray[0] = var1[11];
                if ((Inventory.contains((int[] != 0)nArray) ? 1 : 0)) {
                    int[] nArray3 = new int[1];
                    nArray3[0] = var1[11];
                    Inventory.getFirst((int[])nArray3).interact(var2[var1[18]]);
                    Time.sleepTicks((int)1);
                    0;
                }
            }
            if ((Skills.getLevel((SkiSkill.ATTACK) >= var1[19]) && (Skills.getLevel((SkiSkill.STRENGTH) >= var1[19])) {
                j.Q();
            }
        }
    }

    @Override
    public boolean V() {
        boolean bl;
        if ((Skills.getLevel((SkiSkill.DEFENCE) >= 2)) {
            bl = 1;
            0;
            if (2 <= 0) {
                return ((183 + 26 - 192 + 201 ^ 184 + 96 - 238 + 145) & (202 + 180 - 235 + 87 ^ 61 + 38 - -27 + 13 ^ -1)) != 0;
            }
        } else {
            bl = 0;
        }
        return bl;
    }

    @Override
    public boolean S() {
        return 0;
    }

    @Override
    public String U() {
        return var2[var1[57]];
    }

    public static void cz() {
        if ((Skills.getLevel((SkiSkill.DEFENCE) < 2)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FOURTH);
        }
    }

    @Override
    public int T() {
        try {
            K.cw();
            0;
        }
        catch (Exception var24) {
            var24.printStackTrace();
        }
        if ((0x19 ^ 0x4D ^ (0xE7 ^ 0xB7)) < 0) {
            return (0xEB ^ 0x85 ^ (4 ^ 0x3B)) & (0x7E ^ 0x7B ^ (0xC9 ^ 0x9D) ^ -1);
        }
        return 0;
    }

        catch (Exception var30) {
            var30.printStackTrace();
            return null;
        }
    }

    public static void aa() {
        if ((iF.contains(Players.getLocal( == 0).getWorldLocation()) ? 1 : 0)) {
            AccBuilderRogues.c = var2[var1[20]];
            Movement.walkTo((WorldPoint)bx);
            0;
            Time.sleepTicks((int)1);
            0;
        }
        if ((iF.contains(Players.getLocal( != 0).getWorldLocation()) ? 1 : 0)) {
            AccBuilderRogues.c = var2[var1[21]];
            if ((Players.getLocal( == null).getInteracting())) {
                NPC var31 = NPCs.getNearest(nPC -> {
                    int n2;
                    if ((nPC.getName( != 0).contains(var2[var1[58]]) ? 1 : 0) && (nPC.getInteracting( == null)) && (nPC.isDead( == 0) ? 1 : 0)) {
                        n2 = 1;
                        0;
                        if (1 > 1) {
                            return ((0x29 ^ 0x11) & ~(0x9C ^ 0xA4)) != 0;
                        }
                    } else {
                        n2 = 0;
                    }
                    return n2 != 0;
                });
                String[] stringArray = new String[3];
                stringArray[0] = var2[var1[22]];
                stringArray[1] = var2[var1[23]];
                List var32 = NPCs.getAll((String[])stringArray).stream().filter(nPC -> {
                    boolean bl;
                    if ((nPC.getInteracting() == nPC.getInteracting()2))) {
                        bl = 1;
                        0;
                        if (-1 >= 0) {
                            return ((82 + 134 - 177 + 107 ^ 2 + 39 - -106 + 4) & (0xA ^ 0x49 ^ (0xDB ^ 0x9D) ^ -1)) != 0;
                        }
                    } else {
                        bl = 0;
                    }
                    return bl;
                }).collect(Collectors.toList());
                if ((var32.isEmpty( == 0) ? 1 : 0)) {
                    ((NPC)var32.get(0)).interact(var2[var1[24]]);
                    Time.sleepTicks((int)3);
                    0;
                }
                if (var31 != null && (Players.getLocal( == 0).isMoving() ? 1 : 0) && (var32.isEmpty( != 0) ? 1 : 0)) {
                    var31.interact(var2[var1[25]]);
                    Time.sleepTicks((int)3);
                    0;
                }
            }
            if ((Players.getLocal( != null).getInteracting())) {
                Time.sleepTicks((int)6);
                0;
            }
        }
    }

    private static int var23(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

}

