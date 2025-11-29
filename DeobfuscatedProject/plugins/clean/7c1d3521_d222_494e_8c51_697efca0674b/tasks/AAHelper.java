/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.GrandExchange
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Production
 */
package gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks;

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
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.GrandExchange;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Production;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.AHelper;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.BHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.DHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.EHelper;

public class AAHelper
implements ac {
    private static final  int oT;
    private static final  int oL;
    private static final  int oP;
    private static final  int oN;
    private static final  int oR;
    private static final  int oU;
    public static  List<d> bv;
    public static  boolean bt;
    private static final  int oO;
    
    private static final  int oV;
    private static final  int oM;
    private static final  int oQ;
    private static final  int oS;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        if (aA.lIllIlIllIIIl(Skills.getLevel((Skill)Skill.FLETCHING), llIlIlllll[6]) && aA.lIllIlIlIllIl(Skills.getLevel((Skill)Skill.FLETCHING), llIlIlllll[10])) {
            int n3;
            int[] nArray = new int[llIlIlllll[1]];
            nArray[aA.llIlIlllll[0]] = llIlIlllll[7];
            if (aA.lIllIlIllIIII(Inventory.getCount((int[])nArray))) {
                int[] nArray2 = new int[llIlIlllll[1]];
                nArray2[aA.llIlIlllll[0]] = llIlIlllll[11];
                if (aA.lIllIlIllIIII(Inventory.getCount((int[])nArray2))) {
                    n3 = llIlIlllll[1];

                    if (((0x10 ^ 0x28 ^ (0x3F ^ 0x32)) & (0x73 ^ 0x2D ^ (0x2C ^ 0x47) ^ -1)) != 1) return n3 != 0;
                    return ((0x63 ^ 0x2B ^ (0xD4 ^ 0xA6)) & (13 + 105 - -31 + 32 ^ 87 + 42 - 105 + 119 ^ -1)) != 0;
                }
            }
            n3 = llIlIlllll[0];
            return n3 != 0;
        }
        if (aA.lIllIlIllIIIl(Skills.getLevel((Skill)Skill.FLETCHING), llIlIlllll[10])) {
            int n4;
            int[] nArray = new int[llIlIlllll[1]];
            nArray[aA.llIlIlllll[0]] = llIlIlllll[13];
            if (aA.lIllIlIllIIII(Inventory.getCount((int[])nArray))) {
                int[] nArray3 = new int[llIlIlllll[1]];
                nArray3[aA.llIlIlllll[0]] = aA.fx();
                if (aA.lIllIlIllIIII(Inventory.getCount((int[])nArray3))) {
                    n4 = llIlIlllll[1];

                    if (3 > 2) return n4 != 0;
                    return ((0x79 ^ 0x32 ^ (0xDC ^ 0xA9)) & (88 + 171 - 208 + 122 ^ 58 + 117 - 148 + 120 ^ -1)) != 0;
                }
            }
            n4 = llIlIlllll[0];
            return n4 != 0;
        }
        int[] nArray = new int[llIlIlllll[1]];
        nArray[aA.llIlIlllll[0]] = llIlIlllll[7];
        if (aA.lIllIlIllIIII(Inventory.getCount((int[])nArray))) {
            int[] nArray4 = new int[llIlIlllll[1]];
            nArray4[aA.llIlIlllll[0]] = llIlIlllll[8];
            if (aA.lIllIlIllIIII(Inventory.getCount((int[])nArray4))) {
                n2 = llIlIlllll[1];

                if (3 != -1) return n2 != 0;
                return false;
            }
        }
        n2 = llIlIlllll[0];
        return n2 != 0;
    }

    @Override
    public int af() {
        aA.fv();
        return llIlIlllll[43];
    }

    private static boolean lIllIlIlIlllI(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIlIllIIIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIllIlIlIllll(Object object) {
        return object != null;
    }

    private static void lIllIlIlIlIlI() {
        llIlIllllI = new String[llIlIlllll[50]];
        aA.llIlIllllI[aA.llIlIlllll[0]] = "Buying items";
        aA.llIlIllllI[aA.llIlIlllll[1]] = "Finished buying items, switching back to fletching";
        aA.llIlIllllI[aA.llIlIlllll[2]] = "Navigating to bank";
        aA.llIlIllllI[aA.llIlIlllll[3]] = "Opening bank";
        aA.llIlIllllI[aA.llIlIlllll[5]] = "Handling banking";
        aA.llIlIllllI[aA.llIlIlllll[9]] = "We are missing supplies, switching to BUYING";
        aA.llIlIllllI[aA.llIlIlllll[12]] = "We are missing supplies, switching to BUYING";
        aA.llIlIllllI[aA.llIlIlllll[14]] = "We are missing supplies, switching to BUYING";
        aA.llIlIllllI[aA.llIlIlllll[15]] = "Using items";
        aA.llIlIllllI[aA.llIlIlllll[16]] = "Making arrows";
        aA.llIlIllllI[aA.llIlIlllll[20]] = "Fletching oak longs";
        aA.llIlIllllI[aA.llIlIlllll[21]] = "Oak longbow";
        aA.llIlIllllI[aA.llIlIlllll[24]] = "Fletching willow shorts";
        aA.llIlIllllI[aA.llIlIlllll[25]] = "Willow shortbow";
        aA.llIlIllllI[aA.llIlIlllll[27]] = "Fletching willow longbows";
        aA.llIlIllllI[aA.llIlIlllll[6]] = "Willow longbow";
        aA.llIlIllllI[aA.llIlIlllll[28]] = "Fletching maple longs";
        aA.llIlIllllI[aA.llIlIlllll[29]] = "Maple longbow";
        aA.llIlIllllI[aA.llIlIlllll[35]] = "Fletching";
        aA.llIlIllllI[aA.llIlIlllll[45]] = "ring of wealth (";
    }

    private static boolean lIllIlIlIllII(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIlIlIllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static int fx() {
        if (aA.lIllIlIllIIIl(Skills.getLevel((Skill)Skill.FLETCHING), llIlIlllll[26])) {
            return llIlIlllll[30];
        }
        if (aA.lIllIlIllIIIl(Skills.getLevel((Skill)Skill.FLETCHING), llIlIlllll[19]) && aA.lIllIlIlIllIl(Skills.getLevel((Skill)Skill.FLETCHING), llIlIlllll[26])) {
            return llIlIlllll[31];
        }
        if (aA.lIllIlIllIIIl(Skills.getLevel((Skill)Skill.FLETCHING), llIlIlllll[10]) && aA.lIllIlIlIllIl(Skills.getLevel((Skill)Skill.FLETCHING), llIlIlllll[19])) {
            return llIlIlllll[32];
        }
        if (aA.lIllIlIlIllIl(Skills.getLevel((Skill)Skill.FLETCHING), llIlIlllll[11])) {
            return llIlIlllll[7];
        }
        return llIlIlllll[0];
    }

    private static boolean lIllIlIllIIII(int n2) {
        return n2 > 0;
    }

        return String.valueOf(var1);
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (aA.lIllIlIllIIIl(Skills.getLevel((Skill)Skill.FLETCHING), llIlIlllll[44])) {
            bl = llIlIlllll[1];

            if (-(0x3E ^ 0x3A) > 0) {
                return false;
            }
        } else {
            bl = llIlIlllll[0];
        }
        return bl;
    }

    private static void Q() {
        d var2;
        Object var3;
        if (aA.lIllIlIlIllIl(Skills.getLevel((Skill)Skill.FLETCHING), llIlIlllll[6])) {
            d d2 = new DHelper(llIlIlllll[7], llIlIlllll[33], llIlIlllll[11]);
            d d3 = new DHelper(llIlIlllll[8], llIlIlllll[34], llIlIlllll[35]);
            bv.add(d2);

            bv.add(d3);

        }
        if (aA.lIllIlIllIIIl(Skills.getLevel((Skill)Skill.FLETCHING), llIlIlllll[6]) && aA.lIllIlIlIllIl(Skills.getLevel((Skill)Skill.FLETCHING), llIlIlllll[10])) {
            var3 = new DHelper(llIlIlllll[7], llIlIlllll[33], llIlIlllll[11]);
            var2 = new DHelper(llIlIlllll[11], llIlIlllll[34], llIlIlllll[36]);
            bv.add((DHelper) ar3);

            bv.add(var2);

        }
        if (aA.lIllIlIllIIIl(Skills.getLevel((Skill)Skill.FLETCHING), llIlIlllll[10]) && aA.lIllIlIlIllIl(Skills.getLevel((Skill)Skill.FLETCHING), llIlIlllll[19])) {
            var3 = new DHelper(llIlIlllll[32], llIlIlllll[37], llIlIlllll[38]);
            var2 = new DHelper(llIlIlllll[13], llIlIlllll[1], llIlIlllll[4]);
            bv.add((DHelper) ar3);

            bv.add(var2);

        }
        if (aA.lIllIlIllIIIl(Skills.getLevel((Skill)Skill.FLETCHING), llIlIlllll[19]) && aA.lIllIlIlIllIl(Skills.getLevel((Skill)Skill.FLETCHING), llIlIlllll[26])) {
            var3 = new DHelper(llIlIlllll[31], llIlIlllll[33], llIlIlllll[38]);
            var2 = new DHelper(llIlIlllll[13], llIlIlllll[1], llIlIlllll[4]);
            bv.add((DHelper) ar3);

            bv.add(var2);

        }
        if (aA.lIllIlIllIIIl(Skills.getLevel((Skill)Skill.FLETCHING), llIlIlllll[26])) {
            var3 = new DHelper(llIlIlllll[30], llIlIlllll[33], llIlIlllll[38]);
            var2 = new DHelper(llIlIlllll[13], llIlIlllll[1], llIlIlllll[4]);
            bv.add((DHelper) ar3);

            bv.add(var2);

        }
        if (aA.lIllIlIlIlllI(Bank.contains((Predicate)(var3 = item -> item.getName().toLowerCase().contains(llIlIllllI[llIlIlllll[45]]))) ? 1 : 0)) {
            var2 = new DHelper(llIlIlllll[39], llIlIlllll[9], llIlIlllll[40]);
            bv.add(var2);

        }
        int[] nArray = new int[llIlIlllll[1]];
        nArray[aA.llIlIlllll[0]] = llIlIlllll[41];
        if (aA.lIllIlIlIlllI(Bank.contains((int[])nArray) ? 1 : 0)) {
            var2 = new DHelper(llIlIlllll[41], llIlIlllll[11], llIlIlllll[42]);
            bv.add(var2);

        }
    }

    public static void fv() {
        block29: {
            BankLocation var4;
            block30: {
                block41: {
                    block40: {
                        block39: {
                            block35: {
                                block38: {
                                    block37: {
                                        block36: {
                                            block31: {
                                                block34: {
                                                    block33: {
                                                        block32: {
                                                            if (aA.lIllIlIlIllII(bt ? 1 : 0)) {
                                                                AccBuilderSotf.c = llIlIllllI[llIlIlllll[0]];
                                                                b.a(bv);
                                                                if (aA.lIllIlIlIllIl(bv.size(), llIlIlllll[1])) {
                                                                    System.out.println(llIlIllllI[llIlIlllll[1]]);
                                                                    bt = llIlIlllll[0];
                                                                }
                                                            }
                                                            if (!aA.lIllIlIlIlllI(bt ? 1 : 0)) break block29;
                                                            if (!aA.lIllIlIlIlllI(aA.an() ? 1 : 0)) break block30;
                                                            var4 = BankLocation.getNearest();
                                                            if (aA.lIllIlIlIllll(var4) && aA.lIllIlIlIlllI(var4.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                                AccBuilderSotf.c = llIlIllllI[llIlIlllll[2]];
                                                                a.a(var4);
                                                            }
                                                            if (!aA.lIllIlIlIllll(var4) || !aA.lIllIlIlIllII(var4.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block30;
                                                            if (aA.lIllIlIlIlllI(Bank.isOpen() ? 1 : 0)) {
                                                                AccBuilderSotf.c = llIlIllllI[llIlIlllll[3]];
                                                                a.a();
                                                                Time.sleepUntil(() -> Bank.isOpen(), (int)llIlIlllll[4]);

                                                            }
                                                            if (!aA.lIllIlIlIllII(Bank.isOpen() ? 1 : 0)) break block30;
                                                            AccBuilderSotf.c = llIlIllllI[llIlIlllll[5]];
                                                            if (aA.lIllIlIllIIII(Inventory.getAll().size())) {
                                                                Bank.depositInventory();
                                                                Time.sleepTicks((int)llIlIlllll[5]);

                                                            }
                                                            if (aA.lIllIlIllIIII(Equipment.getAll().size())) {
                                                                Bank.depositEquipment();
                                                                Time.sleepTicks((int)llIlIlllll[2]);

                                                            }
                                                            if (!aA.lIllIlIlIllIl(Skills.getLevel((Skill)Skill.FLETCHING), llIlIlllll[6])) break block31;
                                                            int[] nArray = new int[llIlIlllll[1]];
                                                            nArray[aA.llIlIlllll[0]] = llIlIlllll[7];
                                                            if (!aA.lIllIlIlIlllI(Bank.contains((int[])nArray) ? 1 : 0)) break block32;
                                                            int[] nArray2 = new int[llIlIlllll[1]];
                                                            nArray2[aA.llIlIlllll[0]] = llIlIlllll[7];
                                                            if (!aA.lIllIlIlIllII(Inventory.contains((int[])nArray2) ? 1 : 0)) break block33;
                                                        }
                                                        int[] nArray = new int[llIlIlllll[1]];
                                                        nArray[aA.llIlIlllll[0]] = llIlIlllll[8];
                                                        if (!aA.lIllIlIlIlllI(Bank.contains((int[])nArray) ? 1 : 0)) break block34;
                                                        int[] nArray3 = new int[llIlIlllll[1]];
                                                        nArray3[aA.llIlIlllll[0]] = llIlIlllll[8];
                                                        if (!aA.lIllIlIlIlllI(Inventory.contains((int[])nArray3) ? 1 : 0)) break block34;
                                                    }
                                                    aA.Q();
                                                    System.out.println(llIlIllllI[llIlIlllll[9]]);
                                                    bt = llIlIlllll[1];
                                                    return;
                                                }
                                                Bank.withdrawAll((int)llIlIlllll[7], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                                Time.sleepTicks((int)llIlIlllll[1]);

                                                Time.sleepUntil(() -> {
                                                    boolean bl;
                                                    int[] nArray = new int[llIlIlllll[1]];
                                                    nArray[aA.llIlIlllll[0]] = llIlIlllll[7];
                                                    if (aA.lIllIlIllIIII(Inventory.getCount((int[])nArray))) {
                                                        bl = llIlIlllll[1];

                                                        }
                                                    } else {
                                                        bl = llIlIlllll[0];
                                                    }
                                                    return bl;
                                                }, (int)llIlIlllll[4]);

                                                Bank.withdrawAll((int)llIlIlllll[8], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                                Time.sleepTicks((int)llIlIlllll[1]);

                                                Time.sleepUntil(() -> {
                                                    boolean bl;
                                                    int[] nArray = new int[llIlIlllll[1]];
                                                    nArray[aA.llIlIlllll[0]] = llIlIlllll[8];
                                                    if (aA.lIllIlIllIIII(Inventory.getCount((int[])nArray))) {
                                                        bl = llIlIlllll[1];

                                                        }
                                                    } else {
                                                        bl = llIlIlllll[0];
                                                    }
                                                    return bl;
                                                }, (int)llIlIlllll[4]);

                                            }
                                            if (!aA.lIllIlIllIIIl(Skills.getLevel((Skill)Skill.FLETCHING), llIlIlllll[6]) || !aA.lIllIlIlIllIl(Skills.getLevel((Skill)Skill.FLETCHING), llIlIlllll[10])) break block35;
                                            int[] nArray = new int[llIlIlllll[1]];
                                            nArray[aA.llIlIlllll[0]] = llIlIlllll[7];
                                            if (!aA.lIllIlIlIlllI(Bank.contains((int[])nArray) ? 1 : 0)) break block36;
                                            int[] nArray4 = new int[llIlIlllll[1]];
                                            nArray4[aA.llIlIlllll[0]] = llIlIlllll[7];
                                            if (!aA.lIllIlIlIllII(Inventory.contains((int[])nArray4) ? 1 : 0)) break block37;
                                        }
                                        int[] nArray = new int[llIlIlllll[1]];
                                        nArray[aA.llIlIlllll[0]] = llIlIlllll[11];
                                        if (!aA.lIllIlIlIlllI(Bank.contains((int[])nArray) ? 1 : 0)) break block38;
                                        int[] nArray5 = new int[llIlIlllll[1]];
                                        nArray5[aA.llIlIlllll[0]] = llIlIlllll[11];
                                        if (!aA.lIllIlIlIlllI(Inventory.contains((int[])nArray5) ? 1 : 0)) break block38;
                                    }
                                    aA.Q();
                                    System.out.println(llIlIllllI[llIlIlllll[12]]);
                                    bt = llIlIlllll[1];
                                    return;
                                }
                                Bank.withdrawAll((int)llIlIlllll[7], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)llIlIlllll[1]);

                                Time.sleepUntil(() -> {
                                    boolean bl;
                                    int[] nArray = new int[llIlIlllll[1]];
                                    nArray[aA.llIlIlllll[0]] = llIlIlllll[7];
                                    if (aA.lIllIlIllIIII(Inventory.getCount((int[])nArray))) {
                                        bl = llIlIlllll[1];

                                        if (3 > 3) {
                                            return false;
                                        }
                                    } else {
                                        bl = llIlIlllll[0];
                                    }
                                    return bl;
                                }, (int)llIlIlllll[4]);

                                Bank.withdrawAll((int)llIlIlllll[11], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)llIlIlllll[1]);

                                Time.sleepUntil(() -> {
                                    boolean bl;
                                    int[] nArray = new int[llIlIlllll[1]];
                                    nArray[aA.llIlIlllll[0]] = llIlIlllll[11];
                                    if (aA.lIllIlIllIIII(Inventory.getCount((int[])nArray))) {
                                        bl = llIlIlllll[1];

                                        if (3 > 3) {
                                            return false;
                                        }
                                    } else {
                                        bl = llIlIlllll[0];
                                    }
                                    return bl;
                                }, (int)llIlIlllll[4]);

                            }
                            if (!aA.lIllIlIllIIIl(Skills.getLevel((Skill)Skill.FLETCHING), llIlIlllll[10])) break block30;
                            int[] nArray = new int[llIlIlllll[1]];
                            nArray[aA.llIlIlllll[0]] = llIlIlllll[13];
                            if (!aA.lIllIlIlIlllI(Bank.contains((int[])nArray) ? 1 : 0)) break block39;
                            int[] nArray6 = new int[llIlIlllll[1]];
                            nArray6[aA.llIlIlllll[0]] = llIlIlllll[13];
                            if (!aA.lIllIlIllIIIl(Inventory.getCount((int[])nArray6), llIlIlllll[1])) break block40;
                        }
                        int[] nArray = new int[llIlIlllll[1]];
                        nArray[aA.llIlIlllll[0]] = aA.fx();
                        if (!aA.lIllIlIlIlllI(Bank.contains((int[])nArray) ? 1 : 0)) break block41;
                        int[] nArray7 = new int[llIlIlllll[1]];
                        nArray7[aA.llIlIlllll[0]] = aA.fx();
                        if (!aA.lIllIlIlIllIl(Inventory.getCount((int[])nArray7), llIlIlllll[1])) break block41;
                    }
                    aA.Q();
                    System.out.println(llIlIllllI[llIlIlllll[14]]);
                    bt = llIlIlllll[1];
                    return;
                }
                int[] nArray = new int[llIlIlllll[1]];
                nArray[aA.llIlIlllll[0]] = llIlIlllll[13];
                if (aA.lIllIlIlIllIl(Inventory.getCount((int[])nArray), llIlIlllll[1])) {
                    Bank.withdraw((int)llIlIlllll[13], (int)llIlIlllll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)llIlIlllll[1]);

                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[llIlIlllll[1]];
                        nArray[aA.llIlIlllll[0]] = llIlIlllll[13];
                        if (aA.lIllIlIllIIII(Inventory.getCount((int[])nArray))) {
                            bl = llIlIlllll[1];

                            if ((0x5F ^ 0x2C ^ (0xDE ^ 0xA9)) < -1) {
                                return ((0x9F ^ 0x81 ^ (0x18 ^ 0x3B)) & (73 + 40 - 50 + 66 ^ 39 + 105 - 95 + 139 ^ -1)) != 0;
                            }
                        } else {
                            bl = llIlIlllll[0];
                        }
                        return bl;
                    }, (int)llIlIlllll[4]);

                }
                int[] nArray8 = new int[llIlIlllll[1]];
                nArray8[aA.llIlIlllll[0]] = llIlIlllll[13];
                if (aA.lIllIlIllIIII(Inventory.getCount((int[])nArray8))) {
                    Bank.withdrawAll((int)aA.fx(), (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)llIlIlllll[1]);

                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[llIlIlllll[1]];
                        nArray[aA.llIlIlllll[0]] = aA.fx();
                        if (aA.lIllIlIllIIII(Inventory.getCount((int[])nArray))) {
                            bl = llIlIlllll[1];

                            if (3 <= 1) {
                                return false;
                            }
                        } else {
                            bl = llIlIlllll[0];
                        }
                        return bl;
                    }, (int)llIlIlllll[4]);

                }
            }
            if (aA.lIllIlIlIllII(aA.an() ? 1 : 0)) {
                if (aA.lIllIlIlIllII(Bank.isOpen() ? 1 : 0)) {
                    Bank.close();
                }
                if (aA.lIllIlIlIlllI(Bank.isOpen() ? 1 : 0) && aA.lIllIlIlIlllI(Players.getLocal().isAnimating() ? 1 : 0)) {
                    if (aA.lIllIlIlIllII(GrandExchange.isOpen() ? 1 : 0)) {
                        GrandExchange.openBank();
                    }
                    if (aA.lIllIlIlIlllI(Production.isOpen() ? 1 : 0)) {
                        AccBuilderSotf.c = llIlIllllI[llIlIlllll[15]];
                        int[] nArray = new int[llIlIlllll[1]];
                        nArray[aA.llIlIlllll[0]] = aA.fw();
                        var4 = Inventory.getFirst((int[])nArray);
                        int[] nArray9 = new int[llIlIlllll[1]];
                        nArray9[aA.llIlIlllll[0]] = aA.fx();
                        Item var5 = Inventory.getFirst((int[])nArray9);
                        if (aA.lIllIlIlIllll(var4) && aA.lIllIlIlIllll(var5)) {
                            Time.sleepTicks((int)llIlIlllll[3]);

                            var4.useOn(var5);
                            Time.sleepUntil(() -> Production.isOpen(), (int)llIlIlllll[4]);

                        }
                    }
                    if (aA.lIllIlIlIllII(Production.isOpen() ? 1 : 0)) {
                        if (aA.lIllIlIlIllIl(Skills.getLevel((Skill)Skill.FLETCHING), llIlIlllll[10])) {
                            AccBuilderSotf.c = llIlIllllI[llIlIlllll[16]];
                            Production.chooseOption((int)llIlIlllll[1]);
                            Time.sleepTicks((int)llIlIlllll[12]);

                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (!aA.lIllIlIlIlllI(Dialog.isOpen() ? 1 : 0) || aA.lIllIlIlIllII(Dialog.canLevelUpContinue() ? 1 : 0)) {
                                    bl = llIlIlllll[1];

                                    if (2 < 0) {
                                        return false;
                                    }
                                } else {
                                    bl = llIlIlllll[0];
                                }
                                return bl;
                            }, (int)e.c(llIlIlllll[17], llIlIlllll[18]));

                        }
                        if (aA.lIllIlIllIIIl(Skills.getLevel((Skill)Skill.FLETCHING), llIlIlllll[10]) && aA.lIllIlIlIllIl(Skills.getLevel((Skill)Skill.FLETCHING), llIlIlllll[19])) {
                            AccBuilderSotf.c = llIlIllllI[llIlIlllll[20]];
                            Production.chooseOption((String)llIlIllllI[llIlIlllll[21]]);
                            Time.sleepTicks((int)llIlIlllll[12]);

                            Time.sleepUntil(() -> {
                                int n2;
                                block3: {
                                    block2: {
                                        if (!aA.lIllIlIlIlllI(Dialog.isOpen() ? 1 : 0)) break block2;
                                        int[] nArray = new int[llIlIlllll[1]];
                                        nArray[aA.llIlIlllll[0]] = llIlIlllll[32];
                                        if (!aA.lIllIlIlIllIl(Inventory.getCount((int[])nArray), llIlIlllll[1])) break block3;
                                    }
                                    n2 = llIlIlllll[1];

                                    if (-1 <= 0) return n2 != 0;
                                    return ((0xA0 ^ 0x86 ^ (0x5C ^ 0x7E)) & (0x7E ^ 0x6F ^ (0xD2 ^ 0xC7) ^ -1)) != 0;
                                }
                                n2 = llIlIlllll[0];
                                return n2 != 0;
                            }, (int)e.c(llIlIlllll[22], llIlIlllll[23]));

                        }
                        if (aA.lIllIlIllIIIl(Skills.getLevel((Skill)Skill.FLETCHING), llIlIlllll[19]) && aA.lIllIlIlIllIl(Skills.getLevel((Skill)Skill.FLETCHING), llIlIlllll[11])) {
                            AccBuilderSotf.c = llIlIllllI[llIlIlllll[24]];
                            Production.chooseOption((String)llIlIllllI[llIlIlllll[25]]);
                            Time.sleepTicks((int)llIlIlllll[12]);

                            Time.sleepUntil(() -> {
                                int n2;
                                block3: {
                                    block2: {
                                        if (!aA.lIllIlIlIlllI(Dialog.isOpen() ? 1 : 0)) break block2;
                                        int[] nArray = new int[llIlIlllll[1]];
                                        nArray[aA.llIlIlllll[0]] = llIlIlllll[31];
                                        if (!aA.lIllIlIlIllIl(Inventory.getCount((int[])nArray), llIlIlllll[1])) break block3;
                                    }
                                    n2 = llIlIlllll[1];

                                    if (1 == 1) return n2 != 0;
                                    return ((0x78 ^ 0x24 ^ (0xBD ^ 0xB5)) & (26 + 214 - 181 + 157 ^ 37 + 42 - 6 + 67 ^ -1)) != 0;
                                }
                                n2 = llIlIlllll[0];
                                return n2 != 0;
                            }, (int)e.c(llIlIlllll[22], llIlIlllll[23]));

                        }
                        if (aA.lIllIlIllIIIl(Skills.getLevel((Skill)Skill.FLETCHING), llIlIlllll[11]) && aA.lIllIlIlIllIl(Skills.getLevel((Skill)Skill.FLETCHING), llIlIlllll[26])) {
                            AccBuilderSotf.c = llIlIllllI[llIlIlllll[27]];
                            Production.chooseOption((String)llIlIllllI[llIlIlllll[6]]);
                            Time.sleepTicks((int)llIlIlllll[12]);

                            Time.sleepUntil(() -> {
                                int n2;
                                block3: {
                                    block2: {
                                        if (!aA.lIllIlIlIlllI(Dialog.isOpen() ? 1 : 0)) break block2;
                                        int[] nArray = new int[llIlIlllll[1]];
                                        nArray[aA.llIlIlllll[0]] = llIlIlllll[31];
                                        if (!aA.lIllIlIlIllIl(Inventory.getCount((int[])nArray), llIlIlllll[1])) break block3;
                                    }
                                    n2 = llIlIlllll[1];

                                    if (-3 <= 0) return n2 != 0;
                                    return ((0xB0 ^ 0x89 ^ (0x88 ^ 0xA6)) & (0xBA ^ 0x95 ^ (0x6A ^ 0x52) ^ -1)) != 0;
                                }
                                n2 = llIlIlllll[0];
                                return n2 != 0;
                            }, (int)e.c(llIlIlllll[22], llIlIlllll[23]));

                        }
                        if (aA.lIllIlIllIIIl(Skills.getLevel((Skill)Skill.FLETCHING), llIlIlllll[26])) {
                            AccBuilderSotf.c = llIlIllllI[llIlIlllll[28]];
                            Production.chooseOption((String)llIlIllllI[llIlIlllll[29]]);
                            Time.sleepTicks((int)llIlIlllll[12]);

                            Time.sleepUntil(() -> {
                                int n2;
                                block3: {
                                    block2: {
                                        if (!aA.lIllIlIlIlllI(Dialog.isOpen() ? 1 : 0)) break block2;
                                        int[] nArray = new int[llIlIlllll[1]];
                                        nArray[aA.llIlIlllll[0]] = llIlIlllll[30];
                                        if (!aA.lIllIlIlIllIl(Inventory.getCount((int[])nArray), llIlIlllll[1])) break block3;
                                    }
                                    n2 = llIlIlllll[1];

                                    if ((1 & (1 ^ -1)) == 0) return n2 != 0;
                                    return ((0x12 ^ 5 ^ (0xF9 ^ 0xAD)) & (184 + 162 - 197 + 47 ^ 105 + 95 - 136 + 71 ^ -1)) != 0;
                                }
                                n2 = llIlIlllll[0];
                                return n2 != 0;
                            }, (int)e.c(llIlIlllll[22], llIlIlllll[23]));

                        }
                    }
                }
            }
        }
    }

    private static int fw() {
        if (aA.lIllIlIllIIIl(Skills.getLevel((Skill)Skill.FLETCHING), llIlIlllll[10])) {
            return llIlIlllll[13];
        }
        if (aA.lIllIlIllIIIl(Skills.getLevel((Skill)Skill.FLETCHING), llIlIlllll[6]) && aA.lIllIlIlIllIl(Skills.getLevel((Skill)Skill.FLETCHING), llIlIlllll[10])) {
            return llIlIlllll[11];
        }
        if (aA.lIllIlIlIllIl(Skills.getLevel((Skill)Skill.FLETCHING), llIlIlllll[6])) {
            return llIlIlllll[8];
        }
        return llIlIlllll[0];
    }

    @Override
    public String ag() {
        return llIlIllllI[llIlIlllll[35]];
    }

    @Override
    public boolean ae() {
        return llIlIlllll[0];
    }

    static {
        aA.lIllIlIlIlIll();
        aA.lIllIlIlIlIlI();
        oM = llIlIlllll[8];
        oU = llIlIlllll[46];
        oL = llIlIlllll[7];
        oO = llIlIlllll[47];
        oR = llIlIlllll[13];
        oN = llIlIlllll[11];
        oV = llIlIlllll[48];
        oT = llIlIlllll[49];
        oP = llIlIlllll[31];
        oQ = llIlIlllll[32];
        oS = llIlIlllll[30];
        bv = new ArrayList<d>();
    }
}

