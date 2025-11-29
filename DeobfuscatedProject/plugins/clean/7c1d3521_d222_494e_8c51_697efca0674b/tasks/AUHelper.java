/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
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
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.AHelper;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.BHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.DHelper;

public class AUHelper
implements ac {
    
    public static final  WorldArea ou;
    public static final  int or;
    public static final  WorldArea ot;
    public static final  WorldPoint ov;
    public static final  int oo;
    public static final  int os;
    public static final  int op;
    public static  int[] ox;
    
    public static  int[] ow;
    public static  int[] oy;
    public static  boolean bt;
    public static final  int oq;
    public static  List<d> bv;

    private static boolean lIllIlIlIIllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIllIlIlIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public int af() {
        au.gs();
        return llIlIlllIl[34];
    }

    @Override
    public boolean ae() {
        return llIlIlllIl[0];
    }

    private static void lIllIlIIlllll() {
        llIlIlllII = new String[llIlIlllIl[52]];
        au.llIlIlllII[au.llIlIlllIl[0]] = "Buying items";
        au.llIlIlllII[au.llIlIlllIl[1]] = "Finished buying items, switching back to woodcutting";
        au.llIlIlllII[au.llIlIlllIl[4]] = "Navigating to bank";
        au.llIlIlllII[au.llIlIlllIl[5]] = "Opening bank";
        au.llIlIlllII[au.llIlIlllIl[7]] = "Handling banking";
        au.llIlIlllII[au.llIlIlllIl[13]] = "We are missing pickaxes, switching to BUYING";
        au.llIlIlllII[au.llIlIlllIl[14]] = "Dropping logs";
        au.llIlIlllII[au.llIlIlllIl[15]] = "Dropping logs";
        au.llIlIlllII[au.llIlIlllIl[17]] = "Walking to trees";
        au.llIlIlllII[au.llIlIlllIl[18]] = "Chopping";
        au.llIlIlllII[au.llIlIlllIl[19]] = "Chopping logs";
        au.llIlIlllII[au.llIlIlllIl[20]] = "Chop down";
        au.llIlIlllII[au.llIlIlllIl[21]] = "Walking to oak trees";
        au.llIlIlllII[au.llIlIlllIl[22]] = "Chopping oaks";
        au.llIlIlllII[au.llIlIlllIl[23]] = "Chopping oak logs";
        au.llIlIlllII[au.llIlIlllIl[16]] = "Chop down";
        au.llIlIlllII[au.llIlIlllIl[35]] = "Woodcutting";
        au.llIlIlllII[au.llIlIlllIl[36]] = "ring of wealth (";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean an() {
        int n2;
        if (au.lIllIlIlIIllI(Skills.getLevel((Skill)Skill.WOODCUTTING), llIlIlllIl[24])) {
            boolean bl;
            int[] nArray = new int[llIlIlllIl[1]];
            nArray[au.llIlIlllIl[0]] = llIlIlllIl[12];
            if (au.lIllIlIlIIlII(Inventory.getCount((int[])nArray))) {
                bl = llIlIlllIl[1];

                if (1 != 0) return bl;
                return false;
            }
            bl = llIlIlllIl[0];
            return bl;
        }
        if (au.lIllIlIlIIllI(Skills.getLevel((Skill)Skill.WOODCUTTING), llIlIlllIl[25]) && au.lIllIlIlIIIlI(Skills.getLevel((Skill)Skill.WOODCUTTING), llIlIlllIl[24])) {
            int n3;
            int[] nArray = new int[llIlIlllIl[1]];
            nArray[au.llIlIlllIl[0]] = llIlIlllIl[12];
            if (au.lIllIlIlIIlII(Inventory.getCount((int[])nArray))) {
                int[] nArray2 = new int[llIlIlllIl[1]];
                nArray2[au.llIlIlllIl[0]] = llIlIlllIl[11];
                if (au.lIllIlIlIIlII(Inventory.getCount((int[])nArray2))) {
                    n3 = llIlIlllIl[1];

                    if (3 != 0) return n3 != 0;
                    return false;
                }
            }
            n3 = llIlIlllIl[0];
            return n3 != 0;
        }
        if (au.lIllIlIlIIllI(Skills.getLevel((Skill)Skill.WOODCUTTING), llIlIlllIl[26]) && au.lIllIlIlIIIlI(Skills.getLevel((Skill)Skill.WOODCUTTING), llIlIlllIl[25])) {
            int n4;
            int[] nArray = new int[llIlIlllIl[1]];
            nArray[au.llIlIlllIl[0]] = llIlIlllIl[12];
            if (au.lIllIlIlIIlII(Inventory.getCount((int[])nArray))) {
                int[] nArray3 = new int[llIlIlllIl[1]];
                nArray3[au.llIlIlllIl[0]] = llIlIlllIl[11];
                if (au.lIllIlIlIIlII(Inventory.getCount((int[])nArray3))) {
                    int[] nArray4 = new int[llIlIlllIl[1]];
                    nArray4[au.llIlIlllIl[0]] = llIlIlllIl[10];
                    if (au.lIllIlIlIIlII(Inventory.getCount((int[])nArray4))) {
                        n4 = llIlIlllIl[1];

                        if (3 > ((0x4A ^ 6) & ~(0x1E ^ 0x52))) return n4 != 0;
                        return (3 & ~3) != 0;
                    }
                }
            }
            n4 = llIlIlllIl[0];
            return n4 != 0;
        }
        if (au.lIllIlIlIIllI(Skills.getLevel((Skill)Skill.WOODCUTTING), llIlIlllIl[14]) && au.lIllIlIlIIIlI(Skills.getLevel((Skill)Skill.WOODCUTTING), llIlIlllIl[26])) {
            int n5;
            int[] nArray = new int[llIlIlllIl[1]];
            nArray[au.llIlIlllIl[0]] = llIlIlllIl[12];
            if (au.lIllIlIlIIlII(Inventory.getCount((int[])nArray))) {
                int[] nArray5 = new int[llIlIlllIl[1]];
                nArray5[au.llIlIlllIl[0]] = llIlIlllIl[11];
                if (au.lIllIlIlIIlII(Inventory.getCount((int[])nArray5))) {
                    int[] nArray6 = new int[llIlIlllIl[1]];
                    nArray6[au.llIlIlllIl[0]] = llIlIlllIl[10];
                    if (au.lIllIlIlIIlII(Inventory.getCount((int[])nArray6))) {
                        int[] nArray7 = new int[llIlIlllIl[1]];
                        nArray7[au.llIlIlllIl[0]] = llIlIlllIl[9];
                        if (au.lIllIlIlIIlII(Inventory.getCount((int[])nArray7))) {
                            n5 = llIlIlllIl[1];

                            if (-2 < 0) return n5 != 0;
                            return false;
                        }
                    }
                }
            }
            n5 = llIlIlllIl[0];
            return n5 != 0;
        }
        int[] nArray = new int[llIlIlllIl[1]];
        nArray[au.llIlIlllIl[0]] = llIlIlllIl[12];
        if (au.lIllIlIlIIlII(Inventory.getCount((int[])nArray))) {
            int[] nArray8 = new int[llIlIlllIl[1]];
            nArray8[au.llIlIlllIl[0]] = llIlIlllIl[11];
            if (au.lIllIlIlIIlII(Inventory.getCount((int[])nArray8))) {
                int[] nArray9 = new int[llIlIlllIl[1]];
                nArray9[au.llIlIlllIl[0]] = llIlIlllIl[10];
                if (au.lIllIlIlIIlII(Inventory.getCount((int[])nArray9))) {
                    int[] nArray10 = new int[llIlIlllIl[1]];
                    nArray10[au.llIlIlllIl[0]] = llIlIlllIl[9];
                    if (au.lIllIlIlIIlII(Inventory.getCount((int[])nArray10))) {
                        int[] nArray11 = new int[llIlIlllIl[1]];
                        nArray11[au.llIlIlllIl[0]] = llIlIlllIl[8];
                        if (au.lIllIlIlIIlII(Inventory.getCount((int[])nArray11))) {
                            n2 = llIlIlllIl[1];

                            if (-3 <= 0) return n2 != 0;
                            return ((0x78 ^ 0xE ^ (0x33 ^ 0)) & (0x51 ^ 0x55 ^ (0x87 ^ 0xC6) ^ -1)) != 0;
                        }
                    }
                }
            }
        }
        n2 = llIlIlllIl[0];
        return n2 != 0;
    }

        return String.valueOf(var1);
    }

    public static void Q() {
        d var2;
        Object var3;
        int[] nArray = new int[llIlIlllIl[1]];
        nArray[au.llIlIlllIl[0]] = llIlIlllIl[8];
        if (au.lIllIlIlIIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new DHelper(llIlIlllIl[8], llIlIlllIl[1], llIlIlllIl[6]);
            bv.add(d2);

        }
        int[] nArray2 = new int[llIlIlllIl[1]];
        nArray2[au.llIlIlllIl[0]] = llIlIlllIl[9];
        if (au.lIllIlIlIIIll(Bank.contains((int[])nArray2) ? 1 : 0)) {
            var3 = new DHelper(llIlIlllIl[9], llIlIlllIl[1], llIlIlllIl[6]);
            bv.add((DHelper) ar3);

        }
        int[] nArray3 = new int[llIlIlllIl[1]];
        nArray3[au.llIlIlllIl[0]] = llIlIlllIl[10];
        if (au.lIllIlIlIIIll(Bank.contains((int[])nArray3) ? 1 : 0)) {
            var3 = new DHelper(llIlIlllIl[10], llIlIlllIl[1], llIlIlllIl[27]);
            bv.add((DHelper) ar3);

        }
        int[] nArray4 = new int[llIlIlllIl[1]];
        nArray4[au.llIlIlllIl[0]] = llIlIlllIl[11];
        if (au.lIllIlIlIIIll(Bank.contains((int[])nArray4) ? 1 : 0)) {
            var3 = new DHelper(llIlIlllIl[11], llIlIlllIl[1], llIlIlllIl[28]);
            bv.add((DHelper) ar3);

        }
        int[] nArray5 = new int[llIlIlllIl[1]];
        nArray5[au.llIlIlllIl[0]] = llIlIlllIl[12];
        if (au.lIllIlIlIIIll(Bank.contains((int[])nArray5) ? 1 : 0)) {
            var3 = new DHelper(llIlIlllIl[12], llIlIlllIl[1], llIlIlllIl[29]);
            bv.add((DHelper) ar3);

        }
        if (au.lIllIlIlIIIll(Bank.contains((Predicate)(var3 = item -> item.getName().toLowerCase().contains(llIlIlllII[llIlIlllIl[36]]))) ? 1 : 0)) {
            var2 = new DHelper(llIlIlllIl[30], llIlIlllIl[13], llIlIlllIl[29]);
            bv.add(var2);

        }
        int[] nArray6 = new int[llIlIlllIl[1]];
        nArray6[au.llIlIlllIl[0]] = llIlIlllIl[31];
        if (au.lIllIlIlIIIll(Bank.contains((int[])nArray6) ? 1 : 0)) {
            var2 = new DHelper(llIlIlllIl[31], llIlIlllIl[32], llIlIlllIl[33]);
            bv.add(var2);

        }
    }

    public static void gs() {
        block25: {
            BankLocation var4;
            block27: {
                block33: {
                    block29: {
                        block32: {
                            block31: {
                                block30: {
                                    block28: {
                                        block26: {
                                            if (au.lIllIlIlIIIIl(bt ? 1 : 0)) {
                                                AccBuilderSotf.c = llIlIlllII[llIlIlllIl[0]];
                                                b.a(bv);
                                                if (au.lIllIlIlIIIlI(bv.size(), llIlIlllIl[1])) {
                                                    System.out.println(llIlIlllII[llIlIlllIl[1]]);
                                                    bt = llIlIlllIl[0];
                                                }
                                            }
                                            if (!au.lIllIlIlIIIll(bt ? 1 : 0) || !au.lIllIlIlIIIlI(Skills.getLevel((Skill)Skill.WOODCUTTING), llIlIlllIl[2])) break block25;
                                            if (!au.lIllIlIlIIIIl(au.an() ? 1 : 0)) break block26;
                                            int[] nArray = new int[llIlIlllIl[1]];
                                            nArray[au.llIlIlllIl[0]] = llIlIlllIl[3];
                                            if (!au.lIllIlIlIIlII(Inventory.getCount((int[])nArray))) break block27;
                                        }
                                        if (au.lIllIlIlIIlIl(var4 = BankLocation.getNearest()) && au.lIllIlIlIIIll(var4.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                            AccBuilderSotf.c = llIlIlllII[llIlIlllIl[4]];
                                            a.a(var4);
                                        }
                                        if (!au.lIllIlIlIIlIl(var4) || !au.lIllIlIlIIIIl(var4.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block27;
                                        if (au.lIllIlIlIIIll(Bank.isOpen() ? 1 : 0)) {
                                            AccBuilderSotf.c = llIlIlllII[llIlIlllIl[5]];
                                            a.a();
                                            Time.sleepUntil(() -> Bank.isOpen(), (int)llIlIlllIl[6]);

                                        }
                                        if (!au.lIllIlIlIIIIl(Bank.isOpen() ? 1 : 0)) break block27;
                                        AccBuilderSotf.c = llIlIlllII[llIlIlllIl[7]];
                                        if (au.lIllIlIlIIlII(Inventory.getAll().size())) {
                                            Bank.depositInventory();
                                            Time.sleepTicks((int)llIlIlllIl[7]);

                                        }
                                        if (au.lIllIlIlIIlII(Equipment.getAll().size())) {
                                            Bank.depositEquipment();
                                            Time.sleepTicks((int)llIlIlllIl[4]);

                                        }
                                        int[] nArray = new int[llIlIlllIl[1]];
                                        nArray[au.llIlIlllIl[0]] = llIlIlllIl[8];
                                        if (!au.lIllIlIlIIIll(Bank.contains((int[])nArray) ? 1 : 0)) break block28;
                                        int[] nArray2 = new int[llIlIlllIl[1]];
                                        nArray2[au.llIlIlllIl[0]] = llIlIlllIl[8];
                                        if (!au.lIllIlIlIIllI(Inventory.getCount((int[])nArray2), llIlIlllIl[1])) break block29;
                                    }
                                    int[] nArray = new int[llIlIlllIl[1]];
                                    nArray[au.llIlIlllIl[0]] = llIlIlllIl[9];
                                    if (!au.lIllIlIlIIIll(Bank.contains((int[])nArray) ? 1 : 0)) break block30;
                                    int[] nArray3 = new int[llIlIlllIl[1]];
                                    nArray3[au.llIlIlllIl[0]] = llIlIlllIl[9];
                                    if (!au.lIllIlIlIIllI(Inventory.getCount((int[])nArray3), llIlIlllIl[1])) break block29;
                                }
                                int[] nArray = new int[llIlIlllIl[1]];
                                nArray[au.llIlIlllIl[0]] = llIlIlllIl[10];
                                if (!au.lIllIlIlIIIll(Bank.contains((int[])nArray) ? 1 : 0)) break block31;
                                int[] nArray4 = new int[llIlIlllIl[1]];
                                nArray4[au.llIlIlllIl[0]] = llIlIlllIl[10];
                                if (!au.lIllIlIlIIllI(Inventory.getCount((int[])nArray4), llIlIlllIl[1])) break block29;
                            }
                            int[] nArray = new int[llIlIlllIl[1]];
                            nArray[au.llIlIlllIl[0]] = llIlIlllIl[11];
                            if (!au.lIllIlIlIIIll(Bank.contains((int[])nArray) ? 1 : 0)) break block32;
                            int[] nArray5 = new int[llIlIlllIl[1]];
                            nArray5[au.llIlIlllIl[0]] = llIlIlllIl[11];
                            if (!au.lIllIlIlIIllI(Inventory.getCount((int[])nArray5), llIlIlllIl[1])) break block29;
                        }
                        int[] nArray = new int[llIlIlllIl[1]];
                        nArray[au.llIlIlllIl[0]] = llIlIlllIl[12];
                        if (!au.lIllIlIlIIIll(Bank.contains((int[])nArray) ? 1 : 0)) break block33;
                        int[] nArray6 = new int[llIlIlllIl[1]];
                        nArray6[au.llIlIlllIl[0]] = llIlIlllIl[12];
                        if (!au.lIllIlIlIIIlI(Inventory.getCount((int[])nArray6), llIlIlllIl[1])) break block33;
                    }
                    au.Q();
                    System.out.println(llIlIlllII[llIlIlllIl[13]]);
                    bt = llIlIlllIl[1];
                    return;
                }
                int[] nArray = new int[llIlIlllIl[1]];
                nArray[au.llIlIlllIl[0]] = llIlIlllIl[8];
                if (au.lIllIlIlIIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                    Bank.withdraw((int)llIlIlllIl[8], (int)llIlIlllIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)llIlIlllIl[4]);

                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[llIlIlllIl[1]];
                        nArray[au.llIlIlllIl[0]] = llIlIlllIl[8];
                        if (au.lIllIlIlIIlII(Inventory.getCount((int[])nArray))) {
                            bl = llIlIlllIl[1];

                            if (2 >= (5 ^ 1)) {
                                return false;
                            }
                        } else {
                            bl = llIlIlllIl[0];
                        }
                        return bl;
                    }, (int)llIlIlllIl[6]);

                }
                int[] nArray7 = new int[llIlIlllIl[1]];
                nArray7[au.llIlIlllIl[0]] = llIlIlllIl[9];
                if (au.lIllIlIlIIIIl(Bank.contains((int[])nArray7) ? 1 : 0)) {
                    Bank.withdraw((int)llIlIlllIl[9], (int)llIlIlllIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)llIlIlllIl[4]);

                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[llIlIlllIl[1]];
                        nArray[au.llIlIlllIl[0]] = llIlIlllIl[9];
                        if (au.lIllIlIlIIlII(Inventory.getCount((int[])nArray))) {
                            bl = llIlIlllIl[1];

                            if (2 <= 0) {
                                return false;
                            }
                        } else {
                            bl = llIlIlllIl[0];
                        }
                        return bl;
                    }, (int)llIlIlllIl[6]);

                }
                int[] nArray8 = new int[llIlIlllIl[1]];
                nArray8[au.llIlIlllIl[0]] = llIlIlllIl[10];
                if (au.lIllIlIlIIIIl(Bank.contains((int[])nArray8) ? 1 : 0)) {
                    Bank.withdraw((int)llIlIlllIl[10], (int)llIlIlllIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)llIlIlllIl[4]);

                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[llIlIlllIl[1]];
                        nArray[au.llIlIlllIl[0]] = llIlIlllIl[10];
                        if (au.lIllIlIlIIlII(Inventory.getCount((int[])nArray))) {
                            bl = llIlIlllIl[1];

                            if (((0xE0 ^ 0x82 ^ (0x1A ^ 0x26)) & ((0xB4 ^ 0x9F) & ~(0x65 ^ 0x4E) ^ (8 ^ 0x56) ^ -1)) != ((77 + 64 - 9 + 27 ^ 120 + 40 - 118 + 133) & (0xB2 ^ 0x89 ^ (0x61 ^ 0x6A) ^ -1))) {
                                return ((0x4C ^ 0x12 ^ (0x7D ^ 0x15)) & (0xF0 ^ 0xB0 ^ (0x30 ^ 0x46) ^ -1)) != 0;
                            }
                        } else {
                            bl = llIlIlllIl[0];
                        }
                        return bl;
                    }, (int)llIlIlllIl[6]);

                }
                int[] nArray9 = new int[llIlIlllIl[1]];
                nArray9[au.llIlIlllIl[0]] = llIlIlllIl[11];
                if (au.lIllIlIlIIIIl(Bank.contains((int[])nArray9) ? 1 : 0)) {
                    Bank.withdraw((int)llIlIlllIl[11], (int)llIlIlllIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)llIlIlllIl[4]);

                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[llIlIlllIl[1]];
                        nArray[au.llIlIlllIl[0]] = llIlIlllIl[11];
                        if (au.lIllIlIlIIlII(Inventory.getCount((int[])nArray))) {
                            bl = llIlIlllIl[1];

                            if ((0x43 ^ 0x46) <= 0) {
                                return false;
                            }
                        } else {
                            bl = llIlIlllIl[0];
                        }
                        return bl;
                    }, (int)llIlIlllIl[6]);

                }
                int[] nArray10 = new int[llIlIlllIl[1]];
                nArray10[au.llIlIlllIl[0]] = llIlIlllIl[12];
                if (au.lIllIlIlIIIIl(Bank.contains((int[])nArray10) ? 1 : 0)) {
                    Bank.withdraw((int)llIlIlllIl[12], (int)llIlIlllIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)llIlIlllIl[4]);

                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[llIlIlllIl[1]];
                        nArray[au.llIlIlllIl[0]] = llIlIlllIl[12];
                        if (au.lIllIlIlIIlII(Inventory.getCount((int[])nArray))) {
                            bl = llIlIlllIl[1];

                            if (((0xA1 ^ 0x9B) & ~(0x72 ^ 0x48)) != 0) {
                                return false;
                            }
                        } else {
                            bl = llIlIlllIl[0];
                        }
                        return bl;
                    }, (int)llIlIlllIl[6]);

                }
            }
            if (au.lIllIlIlIIIIl(au.an() ? 1 : 0)) {
                if (au.lIllIlIlIIIIl(Inventory.isFull() ? 1 : 0)) {
                    AccBuilderSotf.c = llIlIlllII[llIlIlllIl[14]];
                    System.out.println(llIlIlllII[llIlIlllIl[15]]);
                    Inventory.getAll((int[])oy).stream().forEach(Item::drop);
                }
                if (au.lIllIlIlIIIll(Inventory.isFull() ? 1 : 0)) {
                    if (au.lIllIlIlIIIlI(Skills.getLevel((Skill)Skill.WOODCUTTING), llIlIlllIl[16])) {
                        if (au.lIllIlIlIIIll(ot.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = llIlIlllII[llIlIlllIl[17]];
                            Movement.walkTo((WorldPoint)ot.toWorldPoint());

                            Time.sleepTicks((int)llIlIlllIl[7]);

                        }
                        if (au.lIllIlIlIIIIl(ot.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = llIlIlllII[llIlIlllIl[18]];
                            var4 = TileObjects.getNearest((WorldPoint)Players.getLocal().getWorldLocation(), (int[])ow);
                            if (au.lIllIlIlIIIll(Players.getLocal().isAnimating() ? 1 : 0) && au.lIllIlIlIIIll(Players.getLocal().isMoving() ? 1 : 0) && au.lIllIlIlIIlIl(var4)) {
                                System.out.println(llIlIlllII[llIlIlllIl[19]]);
                                var4.interact(llIlIlllII[llIlIlllIl[20]]);
                                Time.sleepTicks((int)llIlIlllIl[5]);

                            }
                        }
                    }
                    if (au.lIllIlIlIIllI(Skills.getLevel((Skill)Skill.WOODCUTTING), llIlIlllIl[16])) {
                        if (au.lIllIlIlIIIll(ou.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = llIlIlllII[llIlIlllIl[21]];
                            Movement.walkTo((WorldPoint)ov);

                            Time.sleepTicks((int)llIlIlllIl[7]);

                        }
                        if (au.lIllIlIlIIIIl(ou.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = llIlIlllII[llIlIlllIl[22]];
                            var4 = TileObjects.getNearest((WorldPoint)Players.getLocal().getWorldLocation(), (int[])ox);
                            if (au.lIllIlIlIIIll(Players.getLocal().isAnimating() ? 1 : 0) && au.lIllIlIlIIIll(Players.getLocal().isMoving() ? 1 : 0) && au.lIllIlIlIIlIl(var4)) {
                                System.out.println(llIlIlllII[llIlIlllIl[23]]);
                                var4.interact(llIlIlllII[llIlIlllIl[16]]);
                                Time.sleepTicks((int)llIlIlllIl[5]);

                            }
                        }
                    }
                }
            }
        }
    }

    private static boolean lIllIlIlIIIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIlIlIIlIl(Object object) {
        return object != null;
    }

    private static boolean lIllIlIlIIlII(int n2) {
        return n2 > 0;
    }

    private static boolean lIllIlIlIIIll(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (au.lIllIlIlIIllI(Skills.getLevel((Skill)Skill.WOODCUTTING), llIlIlllIl[2])) {
            bl = llIlIlllIl[1];

            if (-(7 ^ 3) > 0) {
                return false;
            }
        } else {
            bl = llIlIlllIl[0];
        }
        return bl;
    }

    @Override
    public String ag() {
        return llIlIlllII[llIlIlllIl[35]];
    }

    static {
        au.lIllIlIlIIIII();
        au.lIllIlIIlllll();
        or = llIlIlllIl[11];
        oo = llIlIlllIl[8];
        os = llIlIlllIl[12];
        op = llIlIlllIl[9];
        oq = llIlIlllIl[10];
        ot = new WorldArea(llIlIlllIl[37], llIlIlllIl[38], llIlIlllIl[35], llIlIlllIl[39], llIlIlllIl[0]);
        ou = new WorldArea(llIlIlllIl[40], llIlIlllIl[41], llIlIlllIl[23], llIlIlllIl[35], llIlIlllIl[0]);
        ov = new WorldPoint(llIlIlllIl[42], llIlIlllIl[43], llIlIlllIl[0]);
        int[] nArray = new int[llIlIlllIl[7]];
        nArray[au.llIlIlllIl[0]] = llIlIlllIl[44];
        nArray[au.llIlIlllIl[1]] = llIlIlllIl[45];
        nArray[au.llIlIlllIl[4]] = llIlIlllIl[46];
        nArray[au.llIlIlllIl[5]] = llIlIlllIl[47];
        ow = nArray;
        int[] nArray2 = new int[llIlIlllIl[1]];
        nArray2[au.llIlIlllIl[0]] = llIlIlllIl[48];
        ox = nArray2;
        int[] nArray3 = new int[llIlIlllIl[5]];
        nArray3[au.llIlIlllIl[0]] = llIlIlllIl[49];
        nArray3[au.llIlIlllIl[1]] = llIlIlllIl[50];
        nArray3[au.llIlIlllIl[4]] = llIlIlllIl[51];
        oy = nArray3;
        bv = new ArrayList<d>();
    }

}

