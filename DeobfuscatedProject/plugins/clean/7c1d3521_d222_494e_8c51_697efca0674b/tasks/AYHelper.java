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
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Production;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.AHelper;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.BHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.DHelper;

public class AYHelper
implements ac {
    public static  boolean bt;
    public static final  int oH;
    
    public static final  int oG;
    public static  List<d> bv;

    @Override
    public String ag() {
        return llIIlIlIII[llIIlIlIIl[43]];
    }

    private static boolean lIlIlIlIIlIII(int n2) {
        return n2 > 0;
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (ay.lIlIlIlIIlIlI(Skills.getLevel((Skill)Skill.CRAFTING), llIIlIlIIl[44])) {
            bl = llIIlIlIIl[1];

            if (2 == ((1 ^ 0x54) & ~(0xE5 ^ 0xB0))) {
                return (3 & ~3) != 0;
            }
        } else {
            bl = llIIlIlIIl[0];
        }
        return bl;
    }

    static {
        ay.lIlIlIlIIIlII();
        ay.lIlIlIlIIIIll();
        oH = llIIlIlIIl[8];
        oG = llIIlIlIIl[7];
        bv = new ArrayList<d>();
    }

    public static void Q() {
        d var1;
        Object var2;
        int[] nArray = new int[llIIlIlIIl[1]];
        nArray[ay.llIIlIlIIl[0]] = llIIlIlIIl[7];
        if (ay.lIlIlIlIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
            System.out.println(llIIlIlIII[llIIlIlIIl[32]]);
            d d2 = new DHelper(llIIlIlIIl[7], llIIlIlIIl[33], llIIlIlIIl[34]);
            bv.add(d2);

        }
        int[] nArray2 = new int[llIIlIlIIl[1]];
        nArray2[ay.llIIlIlIIl[0]] = llIIlIlIIl[8];
        if (ay.lIlIlIlIIIlll(Bank.contains((int[])nArray2) ? 1 : 0)) {
            System.out.println(llIIlIlIII[llIIlIlIIl[35]]);
            var2 = new DHelper(llIIlIlIIl[8], llIIlIlIIl[1], llIIlIlIIl[36]);
            bv.add((DHelper) ar2);

        }
        if (ay.lIlIlIlIIIlll(Bank.contains(var2 = item -> item.getName().toLowerCase().contains(llIIlIlIII[llIIlIlIIl[45]])) ? 1 : 0)) {
            var1 = new DHelper(llIIlIlIIl[37], llIIlIlIIl[9], llIIlIlIIl[38]);
            bv.add(var1);

        }
        int[] nArray3 = new int[llIIlIlIIl[1]];
        nArray3[ay.llIIlIlIIl[0]] = llIIlIlIIl[39];
        if (ay.lIlIlIlIIIlll(Bank.contains((int[])nArray3) ? 1 : 0)) {
            var1 = new DHelper(llIIlIlIIl[39], llIIlIlIIl[40], llIIlIlIIl[41]);
            bv.add(var1);

        }
    }

    private static boolean lIlIlIlIIIlll(int n2) {
        return n2 == 0;
    }

    @Override
    public int af() {
        ay.fi();
        return llIIlIlIIl[42];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean an() {
        int n2;
        int[] nArray = new int[llIIlIlIIl[1]];
        nArray[ay.llIIlIlIIl[0]] = llIIlIlIIl[7];
        if (ay.lIlIlIlIIlIII(Inventory.getCount((int[])nArray))) {
            int[] nArray2 = new int[llIIlIlIIl[1]];
            nArray2[ay.llIIlIlIIl[0]] = llIIlIlIIl[8];
            if (ay.lIlIlIlIIlIII(Inventory.getCount((int[])nArray2))) {
                n2 = llIIlIlIIl[1];

                if (-1 < 0) return n2 != 0;
                return false;
            }
        }
        n2 = llIIlIlIIl[0];
        return n2 != 0;
    }

    private static boolean lIlIlIlIIIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIlIlIIlIlI(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public boolean ae() {
        return llIIlIlIIl[0];
    }

    private static void lIlIlIlIIIIll() {
        llIIlIlIII = new String[llIIlIlIIl[46]];
        ay.llIIlIlIII[ay.llIIlIlIIl[0]] = "Buying items";
        ay.llIIlIlIII[ay.llIIlIlIIl[1]] = "Finished buying items, switching back to crafting";
        ay.llIIlIlIII[ay.llIIlIlIIl[3]] = "Navigating to bank";
        ay.llIIlIlIII[ay.llIIlIlIIl[4]] = "Opening bank";
        ay.llIIlIlIII[ay.llIIlIlIIl[6]] = "Handling banking";
        ay.llIIlIlIII[ay.llIIlIlIIl[9]] = "We are missing supplies, switching to BUYING";
        ay.llIIlIlIII[ay.llIIlIlIIl[10]] = "Crafting ";
        ay.llIIlIlIII[ay.llIIlIlIIl[11]] = "Crafting glass";
        ay.llIIlIlIII[ay.llIIlIlIIl[12]] = "Beer glass";
        ay.llIIlIlIII[ay.llIIlIlIIl[15]] = "Crafting candle lantern";
        ay.llIIlIlIII[ay.llIIlIlIIl[17]] = "Crafting lamp";
        ay.llIIlIlIII[ay.llIIlIlIIl[18]] = "Oil lamp";
        ay.llIIlIlIII[ay.llIIlIlIIl[14]] = "Crafting vial";
        ay.llIIlIlIII[ay.llIIlIlIIl[20]] = "Vial";
        ay.llIIlIlIII[ay.llIIlIlIIl[22]] = "Crafting fishbowl";
        ay.llIIlIlIII[ay.llIIlIlIIl[23]] = "Fishbowl";
        ay.llIIlIlIII[ay.llIIlIlIIl[25]] = "Crafting orb";
        ay.llIIlIlIII[ay.llIIlIlIIl[26]] = "Unpowered staff orb";
        ay.llIIlIlIII[ay.llIIlIlIIl[28]] = "Crafting lens";
        ay.llIIlIlIII[ay.llIIlIlIIl[29]] = "Lantern lens";
        ay.llIIlIlIII[ay.llIIlIlIIl[30]] = "Crafting light orb";
        ay.llIIlIlIII[ay.llIIlIlIIl[31]] = "Light orb";
        ay.llIIlIlIII[ay.llIIlIlIIl[32]] = "Buying molten glass";
        ay.llIIlIlIII[ay.llIIlIlIIl[35]] = "Buying glassblowing pipe";
        ay.llIIlIlIII[ay.llIIlIlIIl[43]] = "Crafting";
        ay.llIIlIlIII[ay.llIIlIlIIl[45]] = "ring of wealth (";
    }

        return String.valueOf(var3);
    }

    private static boolean lIlIlIlIIIlIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIlIlIIlIIl(Object object) {
        return object != null;
    }

    public static void fi() {
        block29: {
            BankLocation var4;
            block31: {
                block34: {
                    block33: {
                        block32: {
                            block30: {
                                if (ay.lIlIlIlIIIlIl(bt ? 1 : 0)) {
                                    AccBuilderSotf.c = llIIlIlIII[llIIlIlIIl[0]];
                                    b.a(bv);
                                    if (ay.lIlIlIlIIIllI(bv.size(), llIIlIlIIl[1])) {
                                        System.out.println(llIIlIlIII[llIIlIlIIl[1]]);
                                        bt = llIIlIlIIl[0];
                                    }
                                }
                                if (!ay.lIlIlIlIIIlll(bt ? 1 : 0)) break block29;
                                if (!ay.lIlIlIlIIIlIl(ay.an() ? 1 : 0)) break block30;
                                int[] nArray = new int[llIIlIlIIl[1]];
                                nArray[ay.llIIlIlIIl[0]] = llIIlIlIIl[2];
                                if (!ay.lIlIlIlIIlIII(Inventory.getCount((int[])nArray))) break block31;
                            }
                            if (ay.lIlIlIlIIlIIl(var4 = BankLocation.getNearest()) && ay.lIlIlIlIIIlll(var4.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderSotf.c = llIIlIlIII[llIIlIlIIl[3]];
                                a.a(var4);
                            }
                            if (!ay.lIlIlIlIIlIIl(var4) || !ay.lIlIlIlIIIlIl(var4.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block31;
                            if (ay.lIlIlIlIIIlll(Bank.isOpen() ? 1 : 0)) {
                                AccBuilderSotf.c = llIIlIlIII[llIIlIlIIl[4]];
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)llIIlIlIIl[5]);

                            }
                            if (!ay.lIlIlIlIIIlIl(Bank.isOpen() ? 1 : 0)) break block31;
                            AccBuilderSotf.c = llIIlIlIII[llIIlIlIIl[6]];
                            if (ay.lIlIlIlIIlIII(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)llIIlIlIIl[4]);

                            }
                            if (ay.lIlIlIlIIlIII(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)llIIlIlIIl[3]);

                            }
                            int[] nArray = new int[llIIlIlIIl[1]];
                            nArray[ay.llIIlIlIIl[0]] = llIIlIlIIl[7];
                            if (!ay.lIlIlIlIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block32;
                            int[] nArray2 = new int[llIIlIlIIl[1]];
                            nArray2[ay.llIIlIlIIl[0]] = llIIlIlIIl[7];
                            if (!ay.lIlIlIlIIlIlI(Inventory.getCount((int[])nArray2), llIIlIlIIl[1])) break block33;
                        }
                        int[] nArray = new int[llIIlIlIIl[1]];
                        nArray[ay.llIIlIlIIl[0]] = llIIlIlIIl[8];
                        if (!ay.lIlIlIlIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block34;
                        int[] nArray3 = new int[llIIlIlIIl[1]];
                        nArray3[ay.llIIlIlIIl[0]] = llIIlIlIIl[8];
                        if (!ay.lIlIlIlIIIllI(Inventory.getCount((int[])nArray3), llIIlIlIIl[1])) break block34;
                    }
                    ay.Q();
                    System.out.println(llIIlIlIII[llIIlIlIIl[9]]);
                    bt = llIIlIlIIl[1];
                    return;
                }
                int[] nArray = new int[llIIlIlIIl[1]];
                nArray[ay.llIIlIlIIl[0]] = llIIlIlIIl[8];
                if (ay.lIlIlIlIIIlIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray4 = new int[llIIlIlIIl[1]];
                    nArray4[ay.llIIlIlIIl[0]] = llIIlIlIIl[8];
                    if (ay.lIlIlIlIIIllI(Inventory.getCount((int[])nArray4), llIIlIlIIl[1])) {
                        Bank.withdraw((int)llIIlIlIIl[8], (int)llIIlIlIIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)llIIlIlIIl[1]);

                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[llIIlIlIIl[1]];
                            nArray[ay.llIIlIlIIl[0]] = llIIlIlIIl[8];
                            if (ay.lIlIlIlIIlIII(Inventory.getCount((int[])nArray))) {
                                bl = llIIlIlIIl[1];

                                if (2 <= 0) {
                                    return false;
                                }
                            } else {
                                bl = llIIlIlIIl[0];
                            }
                            return bl;
                        }, (int)llIIlIlIIl[5]);

                    }
                }
                int[] nArray5 = new int[llIIlIlIIl[1]];
                nArray5[ay.llIIlIlIIl[0]] = llIIlIlIIl[7];
                if (ay.lIlIlIlIIIlIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
                    int[] nArray6 = new int[llIIlIlIIl[1]];
                    nArray6[ay.llIIlIlIIl[0]] = llIIlIlIIl[7];
                    if (ay.lIlIlIlIIIllI(Inventory.getCount((int[])nArray6), llIIlIlIIl[1])) {
                        int[] nArray7 = new int[llIIlIlIIl[1]];
                        nArray7[ay.llIIlIlIIl[0]] = llIIlIlIIl[8];
                        if (ay.lIlIlIlIIlIII(Inventory.getCount((int[])nArray7))) {
                            Bank.withdrawAll((int)llIIlIlIIl[7], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks((int)llIIlIlIIl[1]);

                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[llIIlIlIIl[1]];
                                nArray[ay.llIIlIlIIl[0]] = llIIlIlIIl[7];
                                if (ay.lIlIlIlIIlIII(Inventory.getCount((int[])nArray))) {
                                    bl = llIIlIlIIl[1];

                                    if (1 != 1) {
                                        return ((0x2F ^ 0x77 ^ (0x5C ^ 0x30)) & (0x67 ^ 0x51 ^ 2 ^ -1)) != 0;
                                    }
                                } else {
                                    bl = llIIlIlIIl[0];
                                }
                                return bl;
                            }, (int)llIIlIlIIl[5]);

                        }
                    }
                }
            }
            if (ay.lIlIlIlIIIlIl(ay.an() ? 1 : 0)) {
                if (ay.lIlIlIlIIIlIl(Bank.isOpen() ? 1 : 0)) {
                    Bank.close();
                }
                if (ay.lIlIlIlIIIlll(Bank.isOpen() ? 1 : 0) && ay.lIlIlIlIIIlll(Players.getLocal().isAnimating() ? 1 : 0)) {
                    AccBuilderSotf.c = llIIlIlIII[llIIlIlIIl[10]];
                    if (ay.lIlIlIlIIIlIl(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    if (ay.lIlIlIlIIIlll(Production.isOpen() ? 1 : 0)) {
                        Time.sleepTicks((int)llIIlIlIIl[3]);

                        int[] nArray = new int[llIIlIlIIl[1]];
                        nArray[ay.llIIlIlIIl[0]] = llIIlIlIIl[8];
                        var4 = Inventory.getFirst((int[])nArray);
                        int[] nArray8 = new int[llIIlIlIIl[1]];
                        nArray8[ay.llIIlIlIIl[0]] = llIIlIlIIl[7];
                        Item var5 = Inventory.getFirst((int[])nArray8);
                        if (ay.lIlIlIlIIlIIl(var4) && ay.lIlIlIlIIlIIl(var5)) {
                            var4.useOn(var5);
                            Time.sleepUntil(() -> Production.isOpen(), (int)llIIlIlIIl[5]);

                        }
                    }
                    if (ay.lIlIlIlIIIlIl(Production.isOpen() ? 1 : 0)) {
                        if (ay.lIlIlIlIIIllI(Skills.getLevel((Skill)Skill.CRAFTING), llIIlIlIIl[6])) {
                            AccBuilderSotf.c = llIIlIlIII[llIIlIlIIl[11]];
                            Production.chooseOption((String)llIIlIlIII[llIIlIlIIl[12]]);
                            Time.sleepTicks((int)llIIlIlIIl[10]);

                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[llIIlIlIIl[1]];
                                nArray[ay.llIIlIlIIl[0]] = llIIlIlIIl[7];
                                if (!ay.lIlIlIlIIlIlI(Inventory.getCount((int[])nArray), llIIlIlIIl[1]) || ay.lIlIlIlIIIlIl(Dialog.isOpen() ? 1 : 0)) {
                                    bl = llIIlIlIIl[1];

                                    if (((0xB8 ^ 0x94 ^ (0x10 ^ 0x28)) & (0x3D ^ 0x18 ^ (0xF3 ^ 0xC2) ^ -1)) <= -1) {
                                        return false;
                                    }
                                } else {
                                    bl = llIIlIlIIl[0];
                                }
                                return bl;
                            }, (int)llIIlIlIIl[13]);

                        }
                        if (ay.lIlIlIlIIlIlI(Skills.getLevel((Skill)Skill.CRAFTING), llIIlIlIIl[6]) && ay.lIlIlIlIIIllI(Skills.getLevel((Skill)Skill.CRAFTING), llIIlIlIIl[14])) {
                            AccBuilderSotf.c = llIIlIlIII[llIIlIlIIl[15]];
                            Production.chooseOption((int)llIIlIlIIl[3]);
                            Time.sleepTicks((int)llIIlIlIIl[10]);

                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[llIIlIlIIl[1]];
                                nArray[ay.llIIlIlIIl[0]] = llIIlIlIIl[7];
                                if (!ay.lIlIlIlIIlIlI(Inventory.getCount((int[])nArray), llIIlIlIIl[1]) || ay.lIlIlIlIIIlIl(Dialog.isOpen() ? 1 : 0)) {
                                    bl = llIIlIlIIl[1];

                                    if (((0x4F ^ 0x5D) & ~(0x84 ^ 0x96)) != 0) {
                                        return false;
                                    }
                                } else {
                                    bl = llIIlIlIIl[0];
                                }
                                return bl;
                            }, (int)llIIlIlIIl[13]);

                        }
                        if (ay.lIlIlIlIIlIlI(Skills.getLevel((Skill)Skill.CRAFTING), llIIlIlIIl[14]) && ay.lIlIlIlIIIllI(Skills.getLevel((Skill)Skill.CRAFTING), llIIlIlIIl[16])) {
                            AccBuilderSotf.c = llIIlIlIII[llIIlIlIIl[17]];
                            Production.chooseOption((String)llIIlIlIII[llIIlIlIIl[18]]);
                            Time.sleepTicks((int)llIIlIlIIl[10]);

                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[llIIlIlIIl[1]];
                                nArray[ay.llIIlIlIIl[0]] = llIIlIlIIl[7];
                                if (!ay.lIlIlIlIIlIlI(Inventory.getCount((int[])nArray), llIIlIlIIl[1]) || ay.lIlIlIlIIIlIl(Dialog.isOpen() ? 1 : 0)) {
                                    bl = llIIlIlIIl[1];

                                    if ((0x4C ^ 0x48) == 3) {
                                        return false;
                                    }
                                } else {
                                    bl = llIIlIlIIl[0];
                                }
                                return bl;
                            }, (int)llIIlIlIIl[13]);

                        }
                        if (ay.lIlIlIlIIlIlI(Skills.getLevel((Skill)Skill.CRAFTING), llIIlIlIIl[16]) && ay.lIlIlIlIIIllI(Skills.getLevel((Skill)Skill.CRAFTING), llIIlIlIIl[19])) {
                            AccBuilderSotf.c = llIIlIlIII[llIIlIlIIl[14]];
                            Production.chooseOption((String)llIIlIlIII[llIIlIlIIl[20]]);
                            Time.sleepTicks((int)llIIlIlIIl[10]);

                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[llIIlIlIIl[1]];
                                nArray[ay.llIIlIlIIl[0]] = llIIlIlIIl[7];
                                if (!ay.lIlIlIlIIlIlI(Inventory.getCount((int[])nArray), llIIlIlIIl[1]) || ay.lIlIlIlIIIlIl(Dialog.isOpen() ? 1 : 0)) {
                                    bl = llIIlIlIIl[1];

                                    if (3 < 1) {
                                        return false;
                                    }
                                } else {
                                    bl = llIIlIlIIl[0];
                                }
                                return bl;
                            }, (int)llIIlIlIIl[13]);

                        }
                        if (ay.lIlIlIlIIlIlI(Skills.getLevel((Skill)Skill.CRAFTING), llIIlIlIIl[19]) && ay.lIlIlIlIIIllI(Skills.getLevel((Skill)Skill.CRAFTING), llIIlIlIIl[21])) {
                            AccBuilderSotf.c = llIIlIlIII[llIIlIlIIl[22]];
                            Production.chooseOption((String)llIIlIlIII[llIIlIlIIl[23]]);
                            Time.sleepTicks((int)llIIlIlIIl[10]);

                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[llIIlIlIIl[1]];
                                nArray[ay.llIIlIlIIl[0]] = llIIlIlIIl[7];
                                if (!ay.lIlIlIlIIlIlI(Inventory.getCount((int[])nArray), llIIlIlIIl[1]) || ay.lIlIlIlIIIlIl(Dialog.isOpen() ? 1 : 0)) {
                                    bl = llIIlIlIIl[1];

                                } else {
                                    bl = llIIlIlIIl[0];
                                }
                                return bl;
                            }, (int)llIIlIlIIl[13]);

                        }
                        if (ay.lIlIlIlIIlIlI(Skills.getLevel((Skill)Skill.CRAFTING), llIIlIlIIl[21]) && ay.lIlIlIlIIIllI(Skills.getLevel((Skill)Skill.CRAFTING), llIIlIlIIl[24])) {
                            AccBuilderSotf.c = llIIlIlIII[llIIlIlIIl[25]];
                            Production.chooseOption((String)llIIlIlIII[llIIlIlIIl[26]]);
                            Time.sleepTicks((int)llIIlIlIIl[10]);

                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[llIIlIlIIl[1]];
                                nArray[ay.llIIlIlIIl[0]] = llIIlIlIIl[7];
                                if (!ay.lIlIlIlIIlIlI(Inventory.getCount((int[])nArray), llIIlIlIIl[1]) || ay.lIlIlIlIIIlIl(Dialog.isOpen() ? 1 : 0)) {
                                    bl = llIIlIlIIl[1];

                                    if (3 < ((0x52 ^ 0x69) & ~(0xB2 ^ 0x89))) {
                                        return false;
                                    }
                                } else {
                                    bl = llIIlIlIIl[0];
                                }
                                return bl;
                            }, (int)llIIlIlIIl[13]);

                        }
                        if (ay.lIlIlIlIIlIlI(Skills.getLevel((Skill)Skill.CRAFTING), llIIlIlIIl[24]) && ay.lIlIlIlIIIllI(Skills.getLevel((Skill)Skill.CRAFTING), llIIlIlIIl[27])) {
                            AccBuilderSotf.c = llIIlIlIII[llIIlIlIIl[28]];
                            Production.chooseOption((String)llIIlIlIII[llIIlIlIIl[29]]);
                            Time.sleepTicks((int)llIIlIlIIl[10]);

                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[llIIlIlIIl[1]];
                                nArray[ay.llIIlIlIIl[0]] = llIIlIlIIl[7];
                                if (!ay.lIlIlIlIIlIlI(Inventory.getCount((int[])nArray), llIIlIlIIl[1]) || ay.lIlIlIlIIIlIl(Dialog.isOpen() ? 1 : 0)) {
                                    bl = llIIlIlIIl[1];

                                    if (1 <= -1) {
                                        return false;
                                    }
                                } else {
                                    bl = llIIlIlIIl[0];
                                }
                                return bl;
                            }, (int)llIIlIlIIl[13]);

                        }
                        if (ay.lIlIlIlIIlIlI(Skills.getLevel((Skill)Skill.CRAFTING), llIIlIlIIl[27])) {
                            AccBuilderSotf.c = llIIlIlIII[llIIlIlIIl[30]];
                            Production.chooseOption((String)llIIlIlIII[llIIlIlIIl[31]]);
                            Time.sleepTicks((int)llIIlIlIIl[10]);

                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[llIIlIlIIl[1]];
                                nArray[ay.llIIlIlIIl[0]] = llIIlIlIIl[7];
                                if (!ay.lIlIlIlIIlIlI(Inventory.getCount((int[])nArray), llIIlIlIIl[1]) || ay.lIlIlIlIIIlIl(Dialog.isOpen() ? 1 : 0)) {
                                    bl = llIIlIlIIl[1];

                                    if (3 < 0) {
                                        return ((0x64 ^ 0x24 ^ (3 ^ 0xB)) & (0x53 ^ 0x6A ^ (0x7E ^ 0xF) ^ -1)) != 0;
                                    }
                                } else {
                                    bl = llIIlIlIIl[0];
                                }
                                return bl;
                            }, (int)llIIlIlIIl[13]);

                        }
                    }
                }
            }
        }
    }
}

