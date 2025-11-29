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
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.EHelper;

public class AOHelper
implements ac {
    public static final  int nv;
    public static final  int nq;
    public static final  int[] nw;
    public static  boolean bt;
    public static  WorldArea y;
    public static final  int nt;
    public static  int[] ny;
    public static  WorldPoint F;
    
    public static final  int ns;
    public static final  int nu;
    
    public static  int[] nx;
    public static final  int nr;
    public static  List<d> bv;

    private static boolean lIllIIIIlllll(Object object) {
        return object != null;
    }

        return String.valueOf(var1);
    }

    @Override
    public int af() {
        ao.fQ();
        return llIlIIIlIl[41];
    }

    private static void lIllIIIIllIlI() {
        llIlIIIlII = new String[llIlIIIlIl[63]];
        ao.llIlIIIlII[ao.llIlIIIlIl[0]] = "Buying items";
        ao.llIlIIIlII[ao.llIlIIIlIl[1]] = "Finished buying items, switching back to mining";
        ao.llIlIIIlII[ao.llIlIIIlIl[3]] = "Navigating to bank";
        ao.llIlIIIlII[ao.llIlIIIlIl[4]] = "Handling banking";
        ao.llIlIIIlII[ao.llIlIIIlIl[6]] = "We are missing axes, switching to BUYING";
        ao.llIlIIIlII[ao.llIlIIIlIl[24]] = "Dropping";
        ao.llIlIIIlII[ao.llIlIIIlIl[22]] = "Walking to mine";
        ao.llIlIIIlII[ao.llIlIIIlIl[26]] = "Mining copper";
        ao.llIlIIIlII[ao.llIlIIIlIl[27]] = "Mine";
        ao.llIlIIIlII[ao.llIlIIIlIl[28]] = "Walking to iron ores";
        ao.llIlIIIlII[ao.llIlIIIlIl[29]] = "Mining iron";
        ao.llIlIIIlII[ao.llIlIIIlIl[30]] = "Mine";
        ao.llIlIIIlII[ao.llIlIIIlIl[42]] = "Mining";
        ao.llIlIIIlII[ao.llIlIIIlIl[43]] = "ring of wealth (";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean an() {
        int n2;
        if (ao.lIllIIIlIIIIl(Skills.getLevel((Skill)Skill.MINING), llIlIIIlIl[31])) {
            boolean bl;
            int[] nArray = new int[llIlIIIlIl[1]];
            nArray[ao.llIlIIIlIl[0]] = llIlIIIlIl[11];
            if (ao.lIllIIIlIIIII(Inventory.getCount((int[])nArray))) {
                bl = llIlIIIlIl[1];

                if (((0x36 ^ 0x2D) & ~(0x10 ^ 0xB)) == 0) return bl;
                return false;
            }
            bl = llIlIIIlIl[0];
            return bl;
        }
        if (ao.lIllIIIlIIIIl(Skills.getLevel((Skill)Skill.MINING), llIlIIIlIl[32]) && ao.lIllIIIIlllIl(Skills.getLevel((Skill)Skill.MINING), llIlIIIlIl[31])) {
            int n3;
            int[] nArray = new int[llIlIIIlIl[1]];
            nArray[ao.llIlIIIlIl[0]] = llIlIIIlIl[11];
            if (ao.lIllIIIlIIIII(Inventory.getCount((int[])nArray))) {
                int[] nArray2 = new int[llIlIIIlIl[1]];
                nArray2[ao.llIlIIIlIl[0]] = llIlIIIlIl[10];
                if (ao.lIllIIIlIIIII(Inventory.getCount((int[])nArray2))) {
                    n3 = llIlIIIlIl[1];

                    if (((0x2A ^ 0x11) & ~(0x3E ^ 5)) >= 0) return n3 != 0;
                    return false;
                }
            }
            n3 = llIlIIIlIl[0];
            return n3 != 0;
        }
        if (ao.lIllIIIlIIIIl(Skills.getLevel((Skill)Skill.MINING), llIlIIIlIl[33]) && ao.lIllIIIIlllIl(Skills.getLevel((Skill)Skill.MINING), llIlIIIlIl[32])) {
            int n4;
            int[] nArray = new int[llIlIIIlIl[1]];
            nArray[ao.llIlIIIlIl[0]] = llIlIIIlIl[11];
            if (ao.lIllIIIlIIIII(Inventory.getCount((int[])nArray))) {
                int[] nArray3 = new int[llIlIIIlIl[1]];
                nArray3[ao.llIlIIIlIl[0]] = llIlIIIlIl[10];
                if (ao.lIllIIIlIIIII(Inventory.getCount((int[])nArray3))) {
                    int[] nArray4 = new int[llIlIIIlIl[1]];
                    nArray4[ao.llIlIIIlIl[0]] = llIlIIIlIl[9];
                    if (ao.lIllIIIlIIIII(Inventory.getCount((int[])nArray4))) {
                        n4 = llIlIIIlIl[1];

                        if (-2 < 0) return n4 != 0;
                        return false;
                    }
                }
            }
            n4 = llIlIIIlIl[0];
            return n4 != 0;
        }
        if (ao.lIllIIIlIIIIl(Skills.getLevel((Skill)Skill.MINING), llIlIIIlIl[22]) && ao.lIllIIIIlllIl(Skills.getLevel((Skill)Skill.MINING), llIlIIIlIl[33])) {
            int n5;
            int[] nArray = new int[llIlIIIlIl[1]];
            nArray[ao.llIlIIIlIl[0]] = llIlIIIlIl[11];
            if (ao.lIllIIIlIIIII(Inventory.getCount((int[])nArray))) {
                int[] nArray5 = new int[llIlIIIlIl[1]];
                nArray5[ao.llIlIIIlIl[0]] = llIlIIIlIl[10];
                if (ao.lIllIIIlIIIII(Inventory.getCount((int[])nArray5))) {
                    int[] nArray6 = new int[llIlIIIlIl[1]];
                    nArray6[ao.llIlIIIlIl[0]] = llIlIIIlIl[9];
                    if (ao.lIllIIIlIIIII(Inventory.getCount((int[])nArray6))) {
                        int[] nArray7 = new int[llIlIIIlIl[1]];
                        nArray7[ao.llIlIIIlIl[0]] = llIlIIIlIl[8];
                        if (ao.lIllIIIlIIIII(Inventory.getCount((int[])nArray7))) {
                            n5 = llIlIIIlIl[1];

                            if ((0xAB ^ 0xC4 ^ (0xA9 ^ 0xC2)) != 0) return n5 != 0;
                            return ((0x3B ^ 0x5C ^ (0xCC ^ 0xBE)) & (77 + 133 - 185 + 131 ^ 29 + 77 - 36 + 67 ^ -1)) != 0;
                        }
                    }
                }
            }
            n5 = llIlIIIlIl[0];
            return n5 != 0;
        }
        int[] nArray = new int[llIlIIIlIl[1]];
        nArray[ao.llIlIIIlIl[0]] = llIlIIIlIl[11];
        if (ao.lIllIIIlIIIII(Inventory.getCount((int[])nArray))) {
            int[] nArray8 = new int[llIlIIIlIl[1]];
            nArray8[ao.llIlIIIlIl[0]] = llIlIIIlIl[10];
            if (ao.lIllIIIlIIIII(Inventory.getCount((int[])nArray8))) {
                int[] nArray9 = new int[llIlIIIlIl[1]];
                nArray9[ao.llIlIIIlIl[0]] = llIlIIIlIl[9];
                if (ao.lIllIIIlIIIII(Inventory.getCount((int[])nArray9))) {
                    int[] nArray10 = new int[llIlIIIlIl[1]];
                    nArray10[ao.llIlIIIlIl[0]] = llIlIIIlIl[8];
                    if (ao.lIllIIIlIIIII(Inventory.getCount((int[])nArray10))) {
                        int[] nArray11 = new int[llIlIIIlIl[1]];
                        nArray11[ao.llIlIIIlIl[0]] = llIlIIIlIl[7];
                        if (ao.lIllIIIlIIIII(Inventory.getCount((int[])nArray11))) {
                            n2 = llIlIIIlIl[1];

                            if (null == null) return n2 != 0;
                            return false;
                        }
                    }
                }
            }
        }
        n2 = llIlIIIlIl[0];
        return n2 != 0;
    }

    @Override
    public String ag() {
        return llIlIIIlII[llIlIIIlIl[42]];
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (ao.lIllIIIlIIIIl(Skills.getLevel((Skill)Skill.MINING), llIlIIIlIl[2])) {
            bl = llIlIIIlIl[1];

            if (2 < 1) {
                return false;
            }
        } else {
            bl = llIlIIIlIl[0];
        }
        return bl;
    }

    private static boolean lIllIIIlIIIIl(int n2, int n3) {
        return n2 >= n3;
    }

    public static void Q() {
        d var2;
        Object var3;
        d d2 = new DHelper(llIlIIIlIl[18], llIlIIIlIl[1], llIlIIIlIl[34]);
        bv.add(d2);

        int[] nArray = new int[llIlIIIlIl[1]];
        nArray[ao.llIlIIIlIl[0]] = llIlIIIlIl[7];
        if (ao.lIllIIIIllllI(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d3 = new DHelper(llIlIIIlIl[7], llIlIIIlIl[1], llIlIIIlIl[5]);
            bv.add(d3);

        }
        int[] nArray2 = new int[llIlIIIlIl[1]];
        nArray2[ao.llIlIIIlIl[0]] = llIlIIIlIl[8];
        if (ao.lIllIIIIllllI(Bank.contains((int[])nArray2) ? 1 : 0)) {
            var3 = new DHelper(llIlIIIlIl[8], llIlIIIlIl[1], llIlIIIlIl[5]);
            bv.add((DHelper) ar3);

        }
        int[] nArray3 = new int[llIlIIIlIl[1]];
        nArray3[ao.llIlIIIlIl[0]] = llIlIIIlIl[9];
        if (ao.lIllIIIIllllI(Bank.contains((int[])nArray3) ? 1 : 0)) {
            var3 = new DHelper(llIlIIIlIl[9], llIlIIIlIl[1], llIlIIIlIl[35]);
            bv.add((DHelper) ar3);

        }
        int[] nArray4 = new int[llIlIIIlIl[1]];
        nArray4[ao.llIlIIIlIl[0]] = llIlIIIlIl[10];
        if (ao.lIllIIIIllllI(Bank.contains((int[])nArray4) ? 1 : 0)) {
            var3 = new DHelper(llIlIIIlIl[10], llIlIIIlIl[1], llIlIIIlIl[36]);
            bv.add((DHelper) ar3);

        }
        int[] nArray5 = new int[llIlIIIlIl[1]];
        nArray5[ao.llIlIIIlIl[0]] = llIlIIIlIl[11];
        if (ao.lIllIIIIllllI(Bank.contains((int[])nArray5) ? 1 : 0)) {
            var3 = new DHelper(llIlIIIlIl[11], llIlIIIlIl[1], llIlIIIlIl[37]);
            bv.add((DHelper) ar3);

        }
        if (ao.lIllIIIIllllI(Bank.contains((Predicate)(var3 = item -> item.getName().toLowerCase().contains(llIlIIIlII[llIlIIIlIl[43]]))) ? 1 : 0)) {
            var2 = new DHelper(llIlIIIlIl[20], llIlIIIlIl[24], llIlIIIlIl[37]);
            bv.add(var2);

        }
        int[] nArray6 = new int[llIlIIIlIl[1]];
        nArray6[ao.llIlIIIlIl[0]] = llIlIIIlIl[38];
        if (ao.lIllIIIIllllI(Bank.contains((int[])nArray6) ? 1 : 0)) {
            var2 = new DHelper(llIlIIIlIl[38], llIlIIIlIl[39], llIlIIIlIl[40]);
            bv.add(var2);

        }
    }

    @Override
    public boolean ae() {
        return llIlIIIlIl[0];
    }

    private static boolean lIllIIIIlllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIIIIllllI(int n2) {
        return n2 == 0;
    }

    public static void fQ() {
        block32: {
            BankLocation var4;
            block33: {
                block39: {
                    block35: {
                        block38: {
                            block37: {
                                block36: {
                                    block34: {
                                        if (ao.lIllIIIIlllII(bt ? 1 : 0)) {
                                            AccBuilderSotf.c = llIlIIIlII[llIlIIIlIl[0]];
                                            b.a(bv);
                                            if (ao.lIllIIIIlllIl(bv.size(), llIlIIIlIl[1])) {
                                                System.out.println(llIlIIIlII[llIlIIIlIl[1]]);
                                                bt = llIlIIIlIl[0];
                                            }
                                        }
                                        if (!ao.lIllIIIIllllI(bt ? 1 : 0) || !ao.lIllIIIIlllIl(Skills.getLevel((Skill)Skill.MINING), llIlIIIlIl[2])) break block32;
                                        if (!ao.lIllIIIIllllI(ao.an() ? 1 : 0)) break block33;
                                        var4 = BankLocation.getNearest();
                                        if (ao.lIllIIIIlllll(var4) && ao.lIllIIIIllllI(var4.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                            AccBuilderSotf.c = llIlIIIlII[llIlIIIlIl[3]];
                                            a.a(var4);
                                        }
                                        if (!ao.lIllIIIIlllll(var4) || !ao.lIllIIIIlllII(var4.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block33;
                                        AccBuilderSotf.c = llIlIIIlII[llIlIIIlIl[4]];
                                        if (ao.lIllIIIIllllI(Bank.isOpen() ? 1 : 0)) {
                                            a.a();
                                            Time.sleepUntil(() -> Bank.isOpen(), (int)llIlIIIlIl[5]);

                                        }
                                        if (!ao.lIllIIIIlllII(Bank.isOpen() ? 1 : 0)) break block33;
                                        if (ao.lIllIIIlIIIII(Inventory.getAll().size())) {
                                            Bank.depositInventory();
                                            Time.sleepTicks((int)llIlIIIlIl[6]);

                                        }
                                        if (ao.lIllIIIlIIIII(Equipment.getAll().size())) {
                                            Bank.depositEquipment();
                                            Time.sleepTicks((int)llIlIIIlIl[3]);

                                        }
                                        int[] nArray = new int[llIlIIIlIl[1]];
                                        nArray[ao.llIlIIIlIl[0]] = llIlIIIlIl[7];
                                        if (!ao.lIllIIIIllllI(Bank.contains((int[])nArray) ? 1 : 0)) break block34;
                                        int[] nArray2 = new int[llIlIIIlIl[1]];
                                        nArray2[ao.llIlIIIlIl[0]] = llIlIIIlIl[7];
                                        if (!ao.lIllIIIlIIIIl(Inventory.getCount((int[])nArray2), llIlIIIlIl[1])) break block35;
                                    }
                                    int[] nArray = new int[llIlIIIlIl[1]];
                                    nArray[ao.llIlIIIlIl[0]] = llIlIIIlIl[8];
                                    if (!ao.lIllIIIIllllI(Bank.contains((int[])nArray) ? 1 : 0)) break block36;
                                    int[] nArray3 = new int[llIlIIIlIl[1]];
                                    nArray3[ao.llIlIIIlIl[0]] = llIlIIIlIl[8];
                                    if (!ao.lIllIIIlIIIIl(Inventory.getCount((int[])nArray3), llIlIIIlIl[1])) break block35;
                                }
                                int[] nArray = new int[llIlIIIlIl[1]];
                                nArray[ao.llIlIIIlIl[0]] = llIlIIIlIl[9];
                                if (!ao.lIllIIIIllllI(Bank.contains((int[])nArray) ? 1 : 0)) break block37;
                                int[] nArray4 = new int[llIlIIIlIl[1]];
                                nArray4[ao.llIlIIIlIl[0]] = llIlIIIlIl[9];
                                if (!ao.lIllIIIlIIIIl(Inventory.getCount((int[])nArray4), llIlIIIlIl[1])) break block35;
                            }
                            int[] nArray = new int[llIlIIIlIl[1]];
                            nArray[ao.llIlIIIlIl[0]] = llIlIIIlIl[10];
                            if (!ao.lIllIIIIllllI(Bank.contains((int[])nArray) ? 1 : 0)) break block38;
                            int[] nArray5 = new int[llIlIIIlIl[1]];
                            nArray5[ao.llIlIIIlIl[0]] = llIlIIIlIl[10];
                            if (!ao.lIllIIIlIIIIl(Inventory.getCount((int[])nArray5), llIlIIIlIl[1])) break block35;
                        }
                        int[] nArray = new int[llIlIIIlIl[1]];
                        nArray[ao.llIlIIIlIl[0]] = llIlIIIlIl[11];
                        if (!ao.lIllIIIIllllI(Bank.contains((int[])nArray) ? 1 : 0)) break block39;
                        int[] nArray6 = new int[llIlIIIlIl[1]];
                        nArray6[ao.llIlIIIlIl[0]] = llIlIIIlIl[11];
                        if (!ao.lIllIIIIlllIl(Inventory.getCount((int[])nArray6), llIlIIIlIl[1])) break block39;
                    }
                    ao.Q();
                    System.out.println(llIlIIIlII[llIlIIIlIl[6]]);
                    bt = llIlIIIlIl[1];
                    return;
                }
                a.a(llIlIIIlIl[12], llIlIIIlIl[1]);
                a.a(llIlIIIlIl[13], llIlIIIlIl[1]);
                a.a(llIlIIIlIl[14], llIlIIIlIl[1]);
                a.a(llIlIIIlIl[15], llIlIIIlIl[1]);
                a.a(llIlIIIlIl[16], llIlIIIlIl[1]);
                a.a(llIlIIIlIl[17], llIlIIIlIl[1]);
                a.a(llIlIIIlIl[18], llIlIIIlIl[1]);
                int[] nArray = new int[llIlIIIlIl[1]];
                nArray[ao.llIlIIIlIl[0]] = llIlIIIlIl[12];
                if (ao.lIllIIIIllllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray7 = new int[llIlIIIlIl[1]];
                    nArray7[ao.llIlIIIlIl[0]] = llIlIIIlIl[12];
                    if (ao.lIllIIIIllllI(Equipment.contains((int[])nArray7) ? 1 : 0)) {
                        int[] nArray8 = new int[llIlIIIlIl[1]];
                        nArray8[ao.llIlIIIlIl[0]] = llIlIIIlIl[12];
                        if (ao.lIllIIIIllllI(Bank.contains((int[])nArray8) ? 1 : 0)) {
                            a.a(llIlIIIlIl[19], llIlIIIlIl[1]);
                        }
                    }
                }
                a.a(llIlIIIlIl[20], llIlIIIlIl[1]);
                e.l(llIlIIIlIl[12]);
                e.l(llIlIIIlIl[13]);
                e.l(llIlIIIlIl[14]);
                e.l(llIlIIIlIl[15]);
                e.l(llIlIIIlIl[16]);
                Time.sleepTicks((int)llIlIIIlIl[1]);

                e.l(llIlIIIlIl[18]);
                e.l(llIlIIIlIl[21]);
                e.l(llIlIIIlIl[17]);
                e.l(llIlIIIlIl[19]);
                e.l(llIlIIIlIl[20]);
                Time.sleepTicks((int)llIlIIIlIl[4]);

                if (ao.lIllIIIIllllI(Bank.isOpen() ? 1 : 0)) {
                    a.a();
                    Time.sleepTicks((int)llIlIIIlIl[22]);

                }
                if (ao.lIllIIIIlllII(Bank.isOpen() ? 1 : 0)) {
                    int[] nArray9 = new int[llIlIIIlIl[1]];
                    nArray9[ao.llIlIIIlIl[0]] = llIlIIIlIl[7];
                    if (ao.lIllIIIIlllII(Bank.contains((int[])nArray9) ? 1 : 0)) {
                        Bank.withdraw((int)llIlIIIlIl[7], (int)llIlIIIlIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)llIlIIIlIl[3]);

                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[llIlIIIlIl[1]];
                            nArray[ao.llIlIIIlIl[0]] = llIlIIIlIl[7];
                            if (ao.lIllIIIlIIIII(Inventory.getCount((int[])nArray))) {
                                bl = llIlIIIlIl[1];

                            } else {
                                bl = llIlIIIlIl[0];
                            }
                            return bl;
                        }, (int)llIlIIIlIl[5]);

                    }
                    int[] nArray10 = new int[llIlIIIlIl[1]];
                    nArray10[ao.llIlIIIlIl[0]] = llIlIIIlIl[8];
                    if (ao.lIllIIIIlllII(Bank.contains((int[])nArray10) ? 1 : 0)) {
                        Bank.withdraw((int)llIlIIIlIl[8], (int)llIlIIIlIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)llIlIIIlIl[3]);

                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[llIlIIIlIl[1]];
                            nArray[ao.llIlIIIlIl[0]] = llIlIIIlIl[8];
                            if (ao.lIllIIIlIIIII(Inventory.getCount((int[])nArray))) {
                                bl = llIlIIIlIl[1];

                                if (2 < 1) {
                                    return ((54 + 171 - 79 + 28 ^ 6 + 138 - 94 + 100) & (0xBB ^ 0xA4 ^ (0xAD ^ 0x8A) ^ -1)) != 0;
                                }
                            } else {
                                bl = llIlIIIlIl[0];
                            }
                            return bl;
                        }, (int)llIlIIIlIl[5]);

                    }
                    int[] nArray11 = new int[llIlIIIlIl[1]];
                    nArray11[ao.llIlIIIlIl[0]] = llIlIIIlIl[9];
                    if (ao.lIllIIIIlllII(Bank.contains((int[])nArray11) ? 1 : 0)) {
                        Bank.withdraw((int)llIlIIIlIl[9], (int)llIlIIIlIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)llIlIIIlIl[3]);

                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[llIlIIIlIl[1]];
                            nArray[ao.llIlIIIlIl[0]] = llIlIIIlIl[9];
                            if (ao.lIllIIIlIIIII(Inventory.getCount((int[])nArray))) {
                                bl = llIlIIIlIl[1];

                                if (-1 >= 3) {
                                    return false;
                                }
                            } else {
                                bl = llIlIIIlIl[0];
                            }
                            return bl;
                        }, (int)llIlIIIlIl[5]);

                    }
                    int[] nArray12 = new int[llIlIIIlIl[1]];
                    nArray12[ao.llIlIIIlIl[0]] = llIlIIIlIl[10];
                    if (ao.lIllIIIIlllII(Bank.contains((int[])nArray12) ? 1 : 0)) {
                        Bank.withdraw((int)llIlIIIlIl[10], (int)llIlIIIlIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)llIlIIIlIl[3]);

                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[llIlIIIlIl[1]];
                            nArray[ao.llIlIIIlIl[0]] = llIlIIIlIl[10];
                            if (ao.lIllIIIlIIIII(Inventory.getCount((int[])nArray))) {
                                bl = llIlIIIlIl[1];

                            } else {
                                bl = llIlIIIlIl[0];
                            }
                            return bl;
                        }, (int)llIlIIIlIl[5]);

                    }
                    int[] nArray13 = new int[llIlIIIlIl[1]];
                    nArray13[ao.llIlIIIlIl[0]] = llIlIIIlIl[11];
                    if (ao.lIllIIIIlllII(Bank.contains((int[])nArray13) ? 1 : 0)) {
                        Bank.withdraw((int)llIlIIIlIl[11], (int)llIlIIIlIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)llIlIIIlIl[3]);

                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[llIlIIIlIl[1]];
                            nArray[ao.llIlIIIlIl[0]] = llIlIIIlIl[11];
                            if (ao.lIllIIIlIIIII(Inventory.getCount((int[])nArray))) {
                                bl = llIlIIIlIl[1];

                                }
                            } else {
                                bl = llIlIIIlIl[0];
                            }
                            return bl;
                        }, (int)llIlIIIlIl[5]);

                    }
                    int[] nArray14 = new int[llIlIIIlIl[1]];
                    nArray14[ao.llIlIIIlIl[0]] = llIlIIIlIl[18];
                    if (ao.lIllIIIIlllII(Bank.contains((int[])nArray14) ? 1 : 0)) {
                        Bank.withdraw((int)llIlIIIlIl[18], (int)llIlIIIlIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)llIlIIIlIl[3]);

                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[llIlIIIlIl[1]];
                            nArray[ao.llIlIIIlIl[0]] = llIlIIIlIl[18];
                            if (ao.lIllIIIlIIIII(Inventory.getCount((int[])nArray))) {
                                bl = llIlIIIlIl[1];

                                if (2 <= 1) {
                                    return ((158 + 171 - 188 + 40 ^ 135 + 3 - 106 + 129) & (0xB1 ^ 0x89 ^ (0x54 ^ 0x78) ^ -1)) != 0;
                                }
                            } else {
                                bl = llIlIIIlIl[0];
                            }
                            return bl;
                        }, (int)llIlIIIlIl[5]);

                    }
                }
            }
            if (ao.lIllIIIIlllII(ao.an() ? 1 : 0)) {
                if (ao.lIllIIIIllllI(Movement.isRunEnabled() ? 1 : 0) && ao.lIllIIIlIIIlI(Movement.getRunEnergy(), llIlIIIlIl[23])) {
                    Movement.toggleRun();
                    Time.sleepTicks((int)llIlIIIlIl[24]);

                }
                if (ao.lIllIIIIlllII(Inventory.isFull() ? 1 : 0)) {
                    AccBuilderSotf.c = llIlIIIlII[llIlIIIlIl[24]];
                    Inventory.getAll((int[])nw).stream().forEach(Item::drop);
                }
                if (ao.lIllIIIIllllI(Inventory.isFull() ? 1 : 0)) {
                    if (ao.lIllIIIIlllIl(Skills.getLevel((Skill)Skill.MINING), llIlIIIlIl[25])) {
                        if (ao.lIllIIIIllllI(y.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = llIlIIIlII[llIlIIIlIl[22]];
                            Movement.walkTo((WorldPoint)F);

                            Time.sleepTicks((int)llIlIIIlIl[6]);

                        }
                        if (ao.lIllIIIIlllII(y.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = llIlIIIlII[llIlIIIlIl[26]];
                            var4 = TileObjects.getNearest((WorldPoint)Players.getLocal().getWorldLocation(), (int[])ny);
                            if (ao.lIllIIIIllllI(Players.getLocal().isAnimating() ? 1 : 0) && ao.lIllIIIIllllI(Players.getLocal().isMoving() ? 1 : 0) && ao.lIllIIIIlllll(var4)) {
                                var4.interact(llIlIIIlII[llIlIIIlIl[27]]);
                                Time.sleepTicks((int)llIlIIIlIl[3]);

                            }
                        }
                    }
                    if (ao.lIllIIIlIIIIl(Skills.getLevel((Skill)Skill.MINING), llIlIIIlIl[25])) {
                        if (ao.lIllIIIIllllI(y.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = llIlIIIlII[llIlIIIlIl[28]];
                            Movement.walkTo((WorldPoint)F);

                            Time.sleepTicks((int)llIlIIIlIl[6]);

                        }
                        if (ao.lIllIIIIlllII(y.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = llIlIIIlII[llIlIIIlIl[29]];
                            var4 = TileObjects.getNearest((WorldPoint)Players.getLocal().getWorldLocation(), (int[])nx);
                            if (ao.lIllIIIIllllI(Players.getLocal().isAnimating() ? 1 : 0) && ao.lIllIIIIllllI(Players.getLocal().isMoving() ? 1 : 0) && ao.lIllIIIIlllll(var4)) {
                                var4.interact(llIlIIIlII[llIlIIIlIl[30]]);
                                Time.sleepTicks((int)llIlIIIlIl[3]);

                            }
                        }
                    }
                }
            }
        }
    }

    private static boolean lIllIIIlIIIII(int n2) {
        return n2 > 0;
    }

    private static boolean lIllIIIlIIIlI(int n2, int n3) {
        return n2 > n3;
    }

    static {
        ao.lIllIIIIllIll();
        ao.lIllIIIIllIlI();
        nr = llIlIIIlIl[8];
        nt = llIlIIIlIl[10];
        nq = llIlIIIlIl[7];
        nv = llIlIIIlIl[18];
        nu = llIlIIIlIl[11];
        ns = llIlIIIlIl[9];
        int[] nArray = new int[llIlIIIlIl[28]];
        nArray[ao.llIlIIIlIl[0]] = llIlIIIlIl[44];
        nArray[ao.llIlIIIlIl[1]] = llIlIIIlIl[45];
        nArray[ao.llIlIIIlIl[3]] = llIlIIIlIl[46];
        nArray[ao.llIlIIIlIl[4]] = llIlIIIlIl[47];
        nArray[ao.llIlIIIlIl[6]] = llIlIIIlIl[48];
        nArray[ao.llIlIIIlIl[24]] = llIlIIIlIl[49];
        nArray[ao.llIlIIIlIl[22]] = llIlIIIlIl[50];
        nArray[ao.llIlIIIlIl[26]] = llIlIIIlIl[51];
        nArray[ao.llIlIIIlIl[27]] = llIlIIIlIl[52];
        nw = nArray;
        bv = new ArrayList<d>();
        int[] nArray2 = new int[llIlIIIlIl[3]];
        nArray2[ao.llIlIIIlIl[0]] = llIlIIIlIl[53];
        nArray2[ao.llIlIIIlIl[1]] = llIlIIIlIl[54];
        nx = nArray2;
        int[] nArray3 = new int[llIlIIIlIl[3]];
        nArray3[ao.llIlIIIlIl[0]] = llIlIIIlIl[55];
        nArray3[ao.llIlIIIlIl[1]] = llIlIIIlIl[56];
        ny = nArray3;
        y = new WorldArea(llIlIIIlIl[57], llIlIIIlIl[58], llIlIIIlIl[59], llIlIIIlIl[60], llIlIIIlIl[0]);
        F = new WorldPoint(llIlIIIlIl[61], llIlIIIlIl[62], llIlIIIlIl[0]);
    }

    private static boolean lIllIIIIlllII(int n2) {
        return n2 != 0;
    }
}

