/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks;

import gg.squire.account.AccBuilderSotf;
import java.util.ArrayList;
import java.util.List;
import net.runelite.api.Skill;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.7c1d3521-d222-494e-8c51-697efca0674bManager;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.7c1d3521-d222-494e-8c51-697efca0674bManager;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.DHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.7c1d3521-d222-494e-8c51-697efca0674bManager;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.7c1d3521-d222-494e-8c51-697efca0674bManager;

public class 7c1d3521-d222-494e-8c51-697efca0674bManager
implements ac {
    public static  boolean bt;
    
    public static  List<d> bv;

    public static void Q() {
        d var3;
        if (aB.var4(Skills.getLevel((SkiSkill.HERBLORE), var2[7])) {
            int[] nArray = new int[var2[1]];
            nArray[aB.var2[0]] = var2[8];
            if (aB.var5(Bank.contains((int[])nArray) ? 1 : 0)) {
                d d2 = new DHelper(var2[8], var2[19], var2[20]);
                bv.add(d2);
                0;
            }
            int[] nArray2 = new int[var2[1]];
            nArray2[aB.var2[0]] = var2[10];
            if (aB.var5(Bank.contains((int[])nArray2) ? 1 : 0)) {
                var3 = new DHelper(var2[10], aB.fM(), var2[21]);
                bv.add(var3);
                0;
            }
        }
        if (aB.var6(Skills.getLevel((SkiSkill.HERBLORE), var2[7]) && aB.var4(Skills.getLevel((SkiSkill.HERBLORE), var2[11])) {
            int[] nArray = new int[var2[1]];
            nArray[aB.var2[0]] = var2[12];
            if (aB.var5(Bank.contains((int[])nArray) ? 1 : 0)) {
                var3 = new DHelper(var2[12], aB.fM(), var2[22]);
                bv.add(var3);
                0;
            }
            int[] nArray3 = new int[var2[1]];
            nArray3[aB.var2[0]] = var2[13];
            if (aB.var5(Bank.contains((int[])nArray3) ? 1 : 0)) {
                var3 = new DHelper(var2[13], aB.fM(), var2[23]);
                bv.add(var3);
                0;
            }
        }
        if (aB.var6(Skills.getLevel((SkiSkill.HERBLORE), var2[11])) {
            int[] nArray = new int[var2[1]];
            nArray[aB.var2[0]] = var2[8];
            if (aB.var5(Bank.contains((int[])nArray) ? 1 : 0)) {
                var3 = new DHelper(var2[8], var2[19], var2[20]);
                bv.add(var3);
                0;
            }
            int[] nArray4 = new int[var2[1]];
            nArray4[aB.var2[0]] = var2[14];
            if (aB.var5(Bank.contains((int[])nArray4) ? 1 : 0)) {
                var3 = new DHelper(var2[14], var2[19], var2[24]);
                bv.add(var3);
                0;
            }
        }
    }

    @Override
    public int af() {
        aB.fL();
        return var2[22];
    }

    /*
     * WARNING - void declaration
     */
    private static int fM() {
        int n2 = var2[25];
        int n3 = var2[26];
        if (aB.var4(Skills.getLevel((SkiSkill.HERBLORE), var2[7])) {
            return (n2 - Skills.getExperience((SkiSkill.HERBLORE)) / var2[27] + var2[15];
        }
        if (aB.var6(Skills.getLevel((SkiSkill.HERBLORE), var2[7]) && aB.var4(Skills.getLevel((SkiSkill.HERBLORE), var2[11])) {
            void var7;
            return (int)((var7 - Skills.getExperience((SkiSkill.HERBLORE)) / var2[28] + var2[29]);
        }
        return var2[1];
    }

    private static boolean var4(int n2, int n3) {
        return n2 < n3;
    }

    private static String var8(String var9, String var10) {
        var9 = new String(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var11 = new StringBuilder();
        char[] var12 = var10.toCharArray();
        int var13 = var2[0];
        char[] var14 = var9.toCharArray();
        int var15 = var14.length;
        int var16 = var2[0];
        while (aB.var4(var16, var15)) {
            char var17 = var14[var16];
            var11.append((char)(var17 ^ var12[var13 % var12.length]));
            0;
            ++var13;
            ++var16;
            0;
            if ((0x70 ^ 0x75) != 0) continue;
            return null;
        }
        return String.valueOf(var11);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        if (aB.var4(Skills.getLevel((SkiSkill.HERBLORE), var2[7])) {
            int n3;
            int[] nArray = new int[var2[1]];
            nArray[aB.var2[0]] = var2[8];
            if (aB.var18(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[var2[1]];
                nArray2[aB.var2[0]] = var2[10];
                if (aB.var18(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                    n3 = var2[1];
                    0;
                    if ((0x31 ^ 0x7D ^ (0x31 ^ 0x78)) != 0) return n3 != 0;
                    return ((0x4C ^ 3 ^ (0 ^ 7)) & (0x10 ^ 7 ^ (0x59 ^ 6) ^ -1)) != 0;
                }
            }
            n3 = var2[0];
            return n3 != 0;
        }
        if (aB.var6(Skills.getLevel((SkiSkill.HERBLORE), var2[7]) && aB.var4(Skills.getLevel((SkiSkill.HERBLORE), var2[11])) {
            int n4;
            int[] nArray = new int[var2[1]];
            nArray[aB.var2[0]] = var2[12];
            if (aB.var18(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray3 = new int[var2[1]];
                nArray3[aB.var2[0]] = var2[13];
                if (aB.var18(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                    n4 = var2[1];
                    0;
                    if null == null return n4 != 0;
                    return ((110 + 139 - 142 + 33 ^ 115 + 73 - 90 + 30) & (3 + 52 - -21 + 107 ^ 27 + 88 - -19 + 53 ^ -1)) != 0;
                }
            }
            n4 = var2[0];
            return n4 != 0;
        }
        if (!aB.var6(Skills.getLevel((SkiSkill.HERBLORE), var2[11])) return var2[0];
        int[] nArray = new int[var2[1]];
        nArray[aB.var2[0]] = var2[8];
        if (aB.var18(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray4 = new int[var2[1]];
            nArray4[aB.var2[0]] = var2[14];
            if (aB.var18(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                n2 = var2[1];
                0;
                if (-(0x88 ^ 0x8D) < 0) return n2 != 0;
                return ((0x6B ^ 0x5E) & ~(0x7E ^ 0x4B)) != 0;
            }
        }
        n2 = var2[0];
        return n2 != 0;
    }

    static {
        aB.var19();
        aB.var20();
        bv = new ArrayList<d>();
    }

    private static boolean var21(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var22(Object object) {
        return object != null;
    }

        catch (Exception var28) {
            var28.printStackTrace();
            return null;
        }
    }

    @Override
    public String ag() {
        return var1[var2[30]];
    }

    private static boolean var5(int n2) {
        return n2 == 0;
    }

    private static boolean var29(int n2) {
        return n2 > 0;
    }

    public static void fL() {
        block26: {
            BankLocation var30;
            block28: {
                block27: {
                    if (aB.var18(bt)) {
                        AccBuilderSotf.c = var1[var2[0]];
                        b.a(bv);
                        if (aB.var4(bv.size(), var2[1])) {
                            System.out.println(var1[var2[1]]);
                            bt = var2[0];
                        }
                    }
                    if (!aB.var5(bt)) break block26;
                    if (aB.var4(e.j(var2[2]), var2[3])) {
                        z.bt();
                    }
                    if (aB.var5(aB.an() ? 1 : 0) && aB.var21(e.j(var2[2]), var2[3])) {
                        var30 = BankLocation.getNearest();
                        if (aB.var22(var30) && aB.var5(var30.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = var1[var2[4]];
                            a.a(var30);
                        }
                        if (aB.var22(var30) && aB.var18(var30.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = var1[var2[5]];
                            if (aB.var5(Bank.isOpen() ? 1 : 0)) {
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)var2[6]);
                                0;
                            }
                            if (aB.var18(Bank.isOpen() ? 1 : 0)) {
                                if (aB.var29(Inventory.getAll().size())) {
                                    Bank.depositInventory();
                                    Time.sleepTicks((int)var2[5]);
                                    0;
                                }
                                if (aB.var5(aB.fN() ? 1 : 0)) {
                                    aB.Q();
                                    System.out.println(var1[var2[3]]);
                                    bt = var2[1];
                                    return;
                                }
                                if (aB.var4(Skills.getLevel((SkiSkill.HERBLORE), var2[7])) {
                                    a.a(var2[8], var2[9]);
                                    a.a(var2[10], var2[9]);
                                }
                                if (aB.var6(Skills.getLevel((SkiSkill.HERBLORE), var2[7]) && aB.var4(Skills.getLevel((SkiSkill.HERBLORE), var2[11])) {
                                    a.a(var2[12], var2[9]);
                                    a.a(var2[13], var2[9]);
                                }
                                if (aB.var6(Skills.getLevel((SkiSkill.HERBLORE), var2[11])) {
                                    a.a(var2[8], var2[9]);
                                    a.a(var2[14], var2[9]);
                                }
                            }
                        }
                    }
                    if (!aB.var18(aB.an() ? 1 : 0)) break block26;
                    if (aB.var18(Bank.isOpen() ? 1 : 0)) {
                        Bank.close();
                    }
                    if (aB.var18(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    AccBuilderSotf.c = var1[var2[15]];
                    int[] nArray = new int[var2[1]];
                    nArray[aB.var2[0]] = var2[8];
                    if (aB.var18(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray2 = new int[var2[1]];
                        nArray2[aB.var2[0]] = var2[10];
                        if (aB.var18(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                            int[] nArray3 = new int[var2[1]];
                            nArray3[aB.var2[0]] = var2[8];
                            int[] nArray4 = new int[var2[1]];
                            nArray4[aB.var2[0]] = var2[10];
                            Inventory.getFirst((int[])nArray3).useOn(Inventory.getFirst((int[])nArray4));
                            Time.sleepTicks((int)var2[1]);
                            0;
                        }
                    }
                    int[] nArray5 = new int[var2[1]];
                    nArray5[aB.var2[0]] = var2[12];
                    if (aB.var18(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                        int[] nArray6 = new int[var2[1]];
                        nArray6[aB.var2[0]] = var2[13];
                        if (aB.var18(Inventory.contains((int[])nArray6) ? 1 : 0)) {
                            int[] nArray7 = new int[var2[1]];
                            nArray7[aB.var2[0]] = var2[12];
                            int[] nArray8 = new int[var2[1]];
                            nArray8[aB.var2[0]] = var2[13];
                            Inventory.getFirst((int[])nArray7).useOn(Inventory.getFirst((int[])nArray8));
                            Time.sleepTicks((int)var2[1]);
                            0;
                        }
                    }
                    int[] nArray9 = new int[var2[1]];
                    nArray9[aB.var2[0]] = var2[8];
                    if (aB.var18(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                        int[] nArray10 = new int[var2[1]];
                        nArray10[aB.var2[0]] = var2[14];
                        if (aB.var18(Inventory.contains((int[])nArray10) ? 1 : 0)) {
                            int[] nArray11 = new int[var2[1]];
                            nArray11[aB.var2[0]] = var2[8];
                            int[] nArray12 = new int[var2[1]];
                            nArray12[aB.var2[0]] = var2[14];
                            Inventory.getFirst((int[])nArray11).useOn(Inventory.getFirst((int[])nArray12));
                            Time.sleepTicks((int)var2[1]);
                            0;
                        }
                    }
                    int[] nArray13 = new int[var2[1]];
                    nArray13[aB.var2[0]] = var2[8];
                    if (!aB.var31(Inventory.getAll((int[])nArray13).size(), var2[1])) break block27;
                    int[] nArray14 = new int[var2[1]];
                    nArray14[aB.var2[0]] = var2[14];
                    if (!aB.var31(Inventory.getAll((int[])nArray14).size(), var2[1])) break block27;
                    int[] nArray15 = new int[var2[1]];
                    nArray15[aB.var2[0]] = var2[13];
                    if (!aB.var31(Inventory.getAll((int[])nArray15).size(), var2[1])) break block27;
                    int[] nArray16 = new int[var2[1]];
                    nArray16[aB.var2[0]] = var2[10];
                    if (!aB.var31(Inventory.getAll((int[])nArray16).size(), var2[1])) break block27;
                    int[] nArray17 = new int[var2[1]];
                    nArray17[aB.var2[0]] = var2[12];
                    if (!aB.var21(Inventory.getAll((int[])nArray17).size(), var2[1])) break block28;
                }
                Time.sleepTicks((int)var2[15]);
                0;
            }
            if (aB.var18(Inventory.contains(item -> item.getName().contains(var1[var2[34]])) ? 1 : 0)) {
                Inventory.getFirst(item -> item.getName().contains(var1[var2[33]])).useOn(Inventory.getFirst(item -> item.getName().contains(var1[var2[32]])));
            }
            if (aB.var22(var30 = Widgets.get((int)var2[16], (int)var2[17]))) {
                Dialog.continueSpace();
                Time.sleepTicks((int)var2[4]);
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    block4: {
                        block3: {
                            block2: {
                                int[] nArray = new int[var2[1]];
                                nArray[aB.var2[0]] = var2[8];
                                if (!aB.var5(Inventory.contains((int[])nArray) ? 1 : 0)) break block2;
                                int[] nArray2 = new int[var2[1]];
                                nArray2[aB.var2[0]] = var2[12];
                                if (!aB.var18(Inventory.contains((int[])nArray2) ? 1 : 0)) break block3;
                            }
                            if (!aB.var18(Dialog.canLevelUpContinue() ? 1 : 0)) break block4;
                        }
                        bl = var2[1];
                        0;
                        if (3 != 1) return bl;
                        return ((230 + 16 - 207 + 198 ^ 4 + 98 - 75 + 142) & (0x99 ^ 0xC1 ^ (0x4E ^ 0x52) ^ -1)) != 0;
                    }
                    bl = var2[0];
                    return bl;
                }, (int)var2[18]);
                0;
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean fN() {
        int n2;
        if (aB.var4(Skills.getLevel((SkiSkill.HERBLORE), var2[7])) {
            int n3;
            int[] nArray = new int[var2[1]];
            nArray[aB.var2[0]] = var2[8];
            if (aB.var18(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[var2[1]];
                nArray2[aB.var2[0]] = var2[10];
                if (aB.var18(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    n3 = var2[1];
                    0;
                    if (3 >= 3) return n3 != 0;
                    return ((0x1D ^ 0x19 ^ (0xC2 ^ 0x89)) & (0x32 ^ 0x43 ^ (0x7E ^ 0x40) ^ -1)) != 0;
                }
            }
            n3 = var2[0];
            return n3 != 0;
        }
        if (aB.var6(Skills.getLevel((SkiSkill.HERBLORE), var2[7]) && aB.var4(Skills.getLevel((SkiSkill.HERBLORE), var2[11])) {
            int n4;
            int[] nArray = new int[var2[1]];
            nArray[aB.var2[0]] = var2[12];
            if (aB.var18(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray3 = new int[var2[1]];
                nArray3[aB.var2[0]] = var2[13];
                if (aB.var18(Bank.contains((int[])nArray3) ? 1 : 0)) {
                    n4 = var2[1];
                    0;
                    if (((30 + 30 - -62 + 9 ^ 159 + 117 - 235 + 149) & (0xB4 ^ 0xC3 ^ (0x12 ^ 0x58) ^ -1)) == 0) return n4 != 0;
                    return ((0x71 ^ 0x2D ^ (0xFE ^ 0xAB)) & (0 + 17 - -78 + 56 ^ 139 + 38 - 50 + 31 ^ -1)) != 0;
                }
            }
            n4 = var2[0];
            return n4 != 0;
        }
        if (!aB.var6(Skills.getLevel((SkiSkill.HERBLORE), var2[11])) return var2[0];
        int[] nArray = new int[var2[1]];
        nArray[aB.var2[0]] = var2[8];
        if (aB.var18(Bank.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray4 = new int[var2[1]];
            nArray4[aB.var2[0]] = var2[14];
            if (aB.var18(Bank.contains((int[])nArray4) ? 1 : 0)) {
                n2 = var2[1];
                0;
                if (2 < (0x3E ^ 0x32 ^ (2 ^ 0xA))) return n2 != 0;
                return ((131 + 93 - 206 + 134 ^ 14 + 75 - 59 + 159) & (0xA8 ^ 0x8F ^ 2 ^ -1)) != 0;
            }
        }
        n2 = var2[0];
        return n2 != 0;
    }

        catch (Exception var37) {
            var37.printStackTrace();
            return null;
        }
    }

    private static boolean var31(int n2, int n3) {
        return n2 != n3;
    }

    private static void var19() {
        var2 = new int[36];
        aB.var2[0] = (46 + 147 - 119 + 81 ^ 162 + 165 - 261 + 103) & (0x6B ^ 0 ^ (0x30 ^ 0x69) ^ -1);
        aB.var2[1] = 1;
        aB.var2[2] = 0x6E ^ 0x3E;
        aB.var2[3] = 0x80 ^ 0x84;
        aB.var2[4] = 2;
        aB.var2[5] = 3;
        aB.var2[6] = 0xFFFFF79B & 0x1BEC;
        aB.var2[7] = 0x8D ^ 0x97;
        aB.var2[8] = 148 + 159 - 88 + 2;
        aB.var2[9] = 99 + 143 - 197 + 105 ^ 56 + 93 - 5 + 8;
        aB.var2[10] = 0xC4 ^ 0x9F;
        aB.var2[11] = 0xC ^ 0x21;
        aB.var2[12] = -(0xFFFFE9D7 & 0x5669) & (0xFFFFFFF7 & 0x47FF);
        aB.var2[13] = 0xA4 ^ 0xC5;
        aB.var2[14] = 0xA ^ 0x47 ^ (0xAC ^ 0x84);
        aB.var2[15] = 0x36 ^ 0x33;
        aB.var2[16] = -(0xFFFFA79F & 0x7EF2) & (0xFFFFA7BF & 0x7FDF);
        aB.var2[17] = 0xFE ^ 0xBF ^ (0x21 ^ 0x6D);
        aB.var2[18] = 0xFFFFFBBB & 0x65EC;
        aB.var2[19] = -(0xFFFFCC7F & 0x7B97) & (0xFFFFFFFF & 0x4BFE);
        aB.var2[20] = 0x92 ^ 0x86;
        aB.var2[21] = 0xFFFFD19A & 0x2FF5;
        aB.var2[22] = 74 + 64 - -33 + 78 ^ 57 + 114 - 53 + 39;
        aB.var2[23] = 0xFFFF8372 & 0x7FDF;
        aB.var2[24] = -(0xFFFFFDF4 & 0x4ABF) & (0xFFFFDFFB & 0x6FBF);
        aB.var2[25] = -(0xFFFFF9DE & 0x5FEB) & (0xFFFFFBFD & 0x7FEF);
        aB.var2[26] = -(0xFFFFDE64 & 0x27BF) & (0xFFFFFE6B & 0xF7FF);
        aB.var2[27] = 0x56 ^ 0x4F;
        aB.var2[28] = 0x48 ^ 0xB;
        aB.var2[29] = 0x67 ^ 0x68;
        aB.var2[30] = 0x8E ^ 0x88;
        aB.var2[31] = 0xE7 ^ 0xC2 ^ (0xD ^ 0x4B);
        aB.var2[32] = 0x9A ^ 0x9D;
        aB.var2[33] = 0xC8 ^ 0xC0;
        aB.var2[34] = 0x5E ^ 0x3E ^ (0x71 ^ 0x18);
        aB.var2[35] = 7 ^ 0xD;
    }

    private static boolean var18(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (aB.var6(Skills.getLevel((SkiSkill.HERBLORE), var2[31])) {
            bl = var2[1];
            0;
            if ((0x72 ^ 0x76) == 0) {
                return ((0xEC ^ 0xA8) & ~(0x70 ^ 0x34)) != 0;
            }
        } else {
            bl = var2[0];
        }
        return bl;
    }

    private static boolean var6(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public boolean ae() {
        return var2[0];
    }

    private static void var20() {
        var1 = new String[var2[35]];
        aB.var1[aB.var2[0]] = "Buying items";
        aB.var1[aB.var2[1]] = "Finished buying items, switching back to herblore";
        aB.var1[aB.var2[4]] = "Navigating to bank";
        aB.var1[aB.var2[5]] = "Handling banking";
        aB.var1[aB.var2[3]] = "We are missing supplies, switching to BUYING";
        aB.var1[aB.var2[15]] = "Mixing potions";
        aB.var1[aB.var2[30]] = "Herblore";
        aB.var1[aB.var2[32]] = "Uncut";
        aB.var1[aB.var2[33]] = "Chisel";
        aB.var1[aB.var2[34]] = "Chisel";
    }
}

