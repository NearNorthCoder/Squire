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

public class ACHelper
implements ac {
    public static  boolean bt;
    public static final  int pb;
    
    public static  int[] nx;
    public static  int[] ny;
    public static final  int oY;
    public static final  int[] pc;
    
    public static final  int oZ;
    public static final  int oW;
    public static  List<d> bv;
    public static final  int oX;
    public static  WorldArea y;
    public static  WorldPoint F;
    public static final  int pa;

    static {
        aC.lIIllllIIllIl();
        aC.lIIllllIIllII();
        oY = lIlllIllIl[8];
        oZ = lIlllIllIl[9];
        pb = lIlllIllIl[17];
        pa = lIlllIllIl[10];
        oW = lIlllIllIl[6];
        oX = lIlllIllIl[7];
        int[] nArray = new int[lIlllIllIl[27]];
        nArray[aC.lIlllIllIl[0]] = lIlllIllIl[44];
        nArray[aC.lIlllIllIl[1]] = lIlllIllIl[45];
        nArray[aC.lIlllIllIl[2]] = lIlllIllIl[46];
        nArray[aC.lIlllIllIl[3]] = lIlllIllIl[47];
        nArray[aC.lIlllIllIl[5]] = lIlllIllIl[48];
        nArray[aC.lIlllIllIl[23]] = lIlllIllIl[49];
        nArray[aC.lIlllIllIl[21]] = lIlllIllIl[50];
        nArray[aC.lIlllIllIl[25]] = lIlllIllIl[51];
        nArray[aC.lIlllIllIl[26]] = lIlllIllIl[52];
        pc = nArray;
        bv = new ArrayList<d>();
        int[] nArray2 = new int[lIlllIllIl[2]];
        nArray2[aC.lIlllIllIl[0]] = lIlllIllIl[53];
        nArray2[aC.lIlllIllIl[1]] = lIlllIllIl[54];
        nx = nArray2;
        int[] nArray3 = new int[lIlllIllIl[2]];
        nArray3[aC.lIlllIllIl[0]] = lIlllIllIl[55];
        nArray3[aC.lIlllIllIl[1]] = lIlllIllIl[56];
        ny = nArray3;
        y = new WorldArea(lIlllIllIl[57], lIlllIllIl[58], lIlllIllIl[59], lIlllIllIl[60], lIlllIllIl[0]);
        F = new WorldPoint(lIlllIllIl[61], lIlllIllIl[62], lIlllIllIl[0]);
    }

    @Override
    public boolean ae() {
        return lIlllIllIl[0];
    }

        return String.valueOf(var1);
    }

    private static boolean lIIllllIlIIII(int n2) {
        return n2 == 0;
    }

    private static boolean lIIllllIlIlII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIllllIlIIIl(Object object) {
        return object != null;
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (aC.lIIllllIlIIll(Skills.getLevel((Skill)Skill.MINING), lIlllIllIl[42])) {
            bl = lIlllIllIl[1];

            }
        } else {
            bl = lIlllIllIl[0];
        }
        return bl;
    }

    @Override
    public int af() {
        aC.fQ();
        return lIlllIllIl[40];
    }

    private static boolean lIIllllIIllll(int n2, int n3) {
        return n2 < n3;
    }

    public static void Q() {
        d var2;
        Object var3;
        d d2 = new DHelper(lIlllIllIl[17], lIlllIllIl[1], lIlllIllIl[33]);
        bv.add(d2);

        int[] nArray = new int[lIlllIllIl[1]];
        nArray[aC.lIlllIllIl[0]] = lIlllIllIl[6];
        if (aC.lIIllllIlIIII(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d3 = new DHelper(lIlllIllIl[6], lIlllIllIl[1], lIlllIllIl[4]);
            bv.add(d3);

        }
        int[] nArray2 = new int[lIlllIllIl[1]];
        nArray2[aC.lIlllIllIl[0]] = lIlllIllIl[7];
        if (aC.lIIllllIlIIII(Bank.contains((int[])nArray2) ? 1 : 0)) {
            var3 = new DHelper(lIlllIllIl[7], lIlllIllIl[1], lIlllIllIl[4]);
            bv.add((DHelper) ar3);

        }
        int[] nArray3 = new int[lIlllIllIl[1]];
        nArray3[aC.lIlllIllIl[0]] = lIlllIllIl[8];
        if (aC.lIIllllIlIIII(Bank.contains((int[])nArray3) ? 1 : 0)) {
            var3 = new DHelper(lIlllIllIl[8], lIlllIllIl[1], lIlllIllIl[34]);
            bv.add((DHelper) ar3);

        }
        int[] nArray4 = new int[lIlllIllIl[1]];
        nArray4[aC.lIlllIllIl[0]] = lIlllIllIl[9];
        if (aC.lIIllllIlIIII(Bank.contains((int[])nArray4) ? 1 : 0)) {
            var3 = new DHelper(lIlllIllIl[9], lIlllIllIl[1], lIlllIllIl[35]);
            bv.add((DHelper) ar3);

        }
        int[] nArray5 = new int[lIlllIllIl[1]];
        nArray5[aC.lIlllIllIl[0]] = lIlllIllIl[10];
        if (aC.lIIllllIlIIII(Bank.contains((int[])nArray5) ? 1 : 0)) {
            var3 = new DHelper(lIlllIllIl[10], lIlllIllIl[1], lIlllIllIl[36]);
            bv.add((DHelper) ar3);

        }
        if (aC.lIIllllIlIIII(Bank.contains((Predicate)(var3 = item -> item.getName().toLowerCase().contains(lIlllIllII[lIlllIllIl[43]]))) ? 1 : 0)) {
            var2 = new DHelper(lIlllIllIl[19], lIlllIllIl[23], lIlllIllIl[36]);
            bv.add(var2);

        }
        int[] nArray6 = new int[lIlllIllIl[1]];
        nArray6[aC.lIlllIllIl[0]] = lIlllIllIl[37];
        if (aC.lIIllllIlIIII(Bank.contains((int[])nArray6) ? 1 : 0)) {
            var2 = new DHelper(lIlllIllIl[37], lIlllIllIl[38], lIlllIllIl[39]);
            bv.add(var2);

        }
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
                                        if (aC.lIIllllIIlllI(bt ? 1 : 0)) {
                                            AccBuilderSotf.c = lIlllIllII[lIlllIllIl[0]];
                                            b.a(bv);
                                            if (aC.lIIllllIIllll(bv.size(), lIlllIllIl[1])) {
                                                System.out.println(lIlllIllII[lIlllIllIl[1]]);
                                                bt = lIlllIllIl[0];
                                            }
                                        }
                                        if (!aC.lIIllllIlIIII(bt ? 1 : 0)) break block32;
                                        if (!aC.lIIllllIlIIII(aC.an() ? 1 : 0)) break block33;
                                        var4 = BankLocation.getNearest();
                                        if (aC.lIIllllIlIIIl(var4) && aC.lIIllllIlIIII(var4.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                            AccBuilderSotf.c = lIlllIllII[lIlllIllIl[2]];
                                            a.a(var4);
                                        }
                                        if (!aC.lIIllllIlIIIl(var4) || !aC.lIIllllIIlllI(var4.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block33;
                                        AccBuilderSotf.c = lIlllIllII[lIlllIllIl[3]];
                                        if (aC.lIIllllIlIIII(Bank.isOpen() ? 1 : 0)) {
                                            a.a();
                                            Time.sleepUntil(() -> Bank.isOpen(), (int)lIlllIllIl[4]);

                                        }
                                        if (!aC.lIIllllIIlllI(Bank.isOpen() ? 1 : 0)) break block33;
                                        if (aC.lIIllllIlIIlI(Inventory.getAll().size())) {
                                            Bank.depositInventory();
                                            Time.sleepTicks((int)lIlllIllIl[5]);

                                        }
                                        if (aC.lIIllllIlIIlI(Equipment.getAll().size())) {
                                            Bank.depositEquipment();
                                            Time.sleepTicks((int)lIlllIllIl[2]);

                                        }
                                        int[] nArray = new int[lIlllIllIl[1]];
                                        nArray[aC.lIlllIllIl[0]] = lIlllIllIl[6];
                                        if (!aC.lIIllllIlIIII(Bank.contains((int[])nArray) ? 1 : 0)) break block34;
                                        int[] nArray2 = new int[lIlllIllIl[1]];
                                        nArray2[aC.lIlllIllIl[0]] = lIlllIllIl[6];
                                        if (!aC.lIIllllIlIIll(Inventory.getCount((int[])nArray2), lIlllIllIl[1])) break block35;
                                    }
                                    int[] nArray = new int[lIlllIllIl[1]];
                                    nArray[aC.lIlllIllIl[0]] = lIlllIllIl[7];
                                    if (!aC.lIIllllIlIIII(Bank.contains((int[])nArray) ? 1 : 0)) break block36;
                                    int[] nArray3 = new int[lIlllIllIl[1]];
                                    nArray3[aC.lIlllIllIl[0]] = lIlllIllIl[7];
                                    if (!aC.lIIllllIlIIll(Inventory.getCount((int[])nArray3), lIlllIllIl[1])) break block35;
                                }
                                int[] nArray = new int[lIlllIllIl[1]];
                                nArray[aC.lIlllIllIl[0]] = lIlllIllIl[8];
                                if (!aC.lIIllllIlIIII(Bank.contains((int[])nArray) ? 1 : 0)) break block37;
                                int[] nArray4 = new int[lIlllIllIl[1]];
                                nArray4[aC.lIlllIllIl[0]] = lIlllIllIl[8];
                                if (!aC.lIIllllIlIIll(Inventory.getCount((int[])nArray4), lIlllIllIl[1])) break block35;
                            }
                            int[] nArray = new int[lIlllIllIl[1]];
                            nArray[aC.lIlllIllIl[0]] = lIlllIllIl[9];
                            if (!aC.lIIllllIlIIII(Bank.contains((int[])nArray) ? 1 : 0)) break block38;
                            int[] nArray5 = new int[lIlllIllIl[1]];
                            nArray5[aC.lIlllIllIl[0]] = lIlllIllIl[9];
                            if (!aC.lIIllllIlIIll(Inventory.getCount((int[])nArray5), lIlllIllIl[1])) break block35;
                        }
                        int[] nArray = new int[lIlllIllIl[1]];
                        nArray[aC.lIlllIllIl[0]] = lIlllIllIl[10];
                        if (!aC.lIIllllIlIIII(Bank.contains((int[])nArray) ? 1 : 0)) break block39;
                        int[] nArray6 = new int[lIlllIllIl[1]];
                        nArray6[aC.lIlllIllIl[0]] = lIlllIllIl[10];
                        if (!aC.lIIllllIIllll(Inventory.getCount((int[])nArray6), lIlllIllIl[1])) break block39;
                    }
                    aC.Q();
                    System.out.println(lIlllIllII[lIlllIllIl[5]]);
                    bt = lIlllIllIl[1];
                    return;
                }
                a.a(lIlllIllIl[11], lIlllIllIl[1]);
                a.a(lIlllIllIl[12], lIlllIllIl[1]);
                a.a(lIlllIllIl[13], lIlllIllIl[1]);
                a.a(lIlllIllIl[14], lIlllIllIl[1]);
                a.a(lIlllIllIl[15], lIlllIllIl[1]);
                a.a(lIlllIllIl[16], lIlllIllIl[1]);
                a.a(lIlllIllIl[17], lIlllIllIl[1]);
                int[] nArray = new int[lIlllIllIl[1]];
                nArray[aC.lIlllIllIl[0]] = lIlllIllIl[11];
                if (aC.lIIllllIlIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray7 = new int[lIlllIllIl[1]];
                    nArray7[aC.lIlllIllIl[0]] = lIlllIllIl[11];
                    if (aC.lIIllllIlIIII(Equipment.contains((int[])nArray7) ? 1 : 0)) {
                        int[] nArray8 = new int[lIlllIllIl[1]];
                        nArray8[aC.lIlllIllIl[0]] = lIlllIllIl[11];
                        if (aC.lIIllllIlIIII(Bank.contains((int[])nArray8) ? 1 : 0)) {
                            a.a(lIlllIllIl[18], lIlllIllIl[1]);
                        }
                    }
                }
                a.a(lIlllIllIl[19], lIlllIllIl[1]);
                e.l(lIlllIllIl[11]);
                e.l(lIlllIllIl[12]);
                e.l(lIlllIllIl[13]);
                e.l(lIlllIllIl[14]);
                e.l(lIlllIllIl[15]);
                Time.sleepTicks((int)lIlllIllIl[1]);

                e.l(lIlllIllIl[17]);
                e.l(lIlllIllIl[20]);
                e.l(lIlllIllIl[16]);
                e.l(lIlllIllIl[18]);
                e.l(lIlllIllIl[19]);
                Time.sleepTicks((int)lIlllIllIl[3]);

                if (aC.lIIllllIlIIII(Bank.isOpen() ? 1 : 0)) {
                    a.a();
                    Time.sleepTicks((int)lIlllIllIl[21]);

                }
                if (aC.lIIllllIIlllI(Bank.isOpen() ? 1 : 0)) {
                    int[] nArray9 = new int[lIlllIllIl[1]];
                    nArray9[aC.lIlllIllIl[0]] = lIlllIllIl[6];
                    if (aC.lIIllllIIlllI(Bank.contains((int[])nArray9) ? 1 : 0)) {
                        Bank.withdraw((int)lIlllIllIl[6], (int)lIlllIllIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIlllIllIl[2]);

                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIlllIllIl[1]];
                            nArray[aC.lIlllIllIl[0]] = lIlllIllIl[6];
                            if (aC.lIIllllIlIIlI(Inventory.getCount((int[])nArray))) {
                                bl = lIlllIllIl[1];

                                if (((0x11 ^ 0xE) & ~(0xB7 ^ 0xA8)) > 2) {
                                    return false;
                                }
                            } else {
                                bl = lIlllIllIl[0];
                            }
                            return bl;
                        }, (int)lIlllIllIl[4]);

                    }
                    int[] nArray10 = new int[lIlllIllIl[1]];
                    nArray10[aC.lIlllIllIl[0]] = lIlllIllIl[7];
                    if (aC.lIIllllIIlllI(Bank.contains((int[])nArray10) ? 1 : 0)) {
                        Bank.withdraw((int)lIlllIllIl[7], (int)lIlllIllIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIlllIllIl[2]);

                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIlllIllIl[1]];
                            nArray[aC.lIlllIllIl[0]] = lIlllIllIl[7];
                            if (aC.lIIllllIlIIlI(Inventory.getCount((int[])nArray))) {
                                bl = lIlllIllIl[1];

                                if (((0xDC ^ 0xC4) & ~(0x98 ^ 0x80)) != 0) {
                                    return (2 & ~2) != 0;
                                }
                            } else {
                                bl = lIlllIllIl[0];
                            }
                            return bl;
                        }, (int)lIlllIllIl[4]);

                    }
                    int[] nArray11 = new int[lIlllIllIl[1]];
                    nArray11[aC.lIlllIllIl[0]] = lIlllIllIl[8];
                    if (aC.lIIllllIIlllI(Bank.contains((int[])nArray11) ? 1 : 0)) {
                        Bank.withdraw((int)lIlllIllIl[8], (int)lIlllIllIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIlllIllIl[2]);

                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIlllIllIl[1]];
                            nArray[aC.lIlllIllIl[0]] = lIlllIllIl[8];
                            if (aC.lIIllllIlIIlI(Inventory.getCount((int[])nArray))) {
                                bl = lIlllIllIl[1];

                                }
                            } else {
                                bl = lIlllIllIl[0];
                            }
                            return bl;
                        }, (int)lIlllIllIl[4]);

                    }
                    int[] nArray12 = new int[lIlllIllIl[1]];
                    nArray12[aC.lIlllIllIl[0]] = lIlllIllIl[9];
                    if (aC.lIIllllIIlllI(Bank.contains((int[])nArray12) ? 1 : 0)) {
                        Bank.withdraw((int)lIlllIllIl[9], (int)lIlllIllIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIlllIllIl[2]);

                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIlllIllIl[1]];
                            nArray[aC.lIlllIllIl[0]] = lIlllIllIl[9];
                            if (aC.lIIllllIlIIlI(Inventory.getCount((int[])nArray))) {
                                bl = lIlllIllIl[1];

                                }
                            } else {
                                bl = lIlllIllIl[0];
                            }
                            return bl;
                        }, (int)lIlllIllIl[4]);

                    }
                    int[] nArray13 = new int[lIlllIllIl[1]];
                    nArray13[aC.lIlllIllIl[0]] = lIlllIllIl[10];
                    if (aC.lIIllllIIlllI(Bank.contains((int[])nArray13) ? 1 : 0)) {
                        Bank.withdraw((int)lIlllIllIl[10], (int)lIlllIllIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIlllIllIl[2]);

                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIlllIllIl[1]];
                            nArray[aC.lIlllIllIl[0]] = lIlllIllIl[10];
                            if (aC.lIIllllIlIIlI(Inventory.getCount((int[])nArray))) {
                                bl = lIlllIllIl[1];

                                if (1 == 0) {
                                    return ((0x18 ^ 0x2E ^ (0xD5 ^ 0xA1)) & (0x2C ^ 0x66 ^ (4 ^ 0xC) ^ -1)) != 0;
                                }
                            } else {
                                bl = lIlllIllIl[0];
                            }
                            return bl;
                        }, (int)lIlllIllIl[4]);

                    }
                    int[] nArray14 = new int[lIlllIllIl[1]];
                    nArray14[aC.lIlllIllIl[0]] = lIlllIllIl[17];
                    if (aC.lIIllllIIlllI(Bank.contains((int[])nArray14) ? 1 : 0)) {
                        Bank.withdraw((int)lIlllIllIl[17], (int)lIlllIllIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIlllIllIl[2]);

                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIlllIllIl[1]];
                            nArray[aC.lIlllIllIl[0]] = lIlllIllIl[17];
                            if (aC.lIIllllIlIIlI(Inventory.getCount((int[])nArray))) {
                                bl = lIlllIllIl[1];

                                if (1 == 0) {
                                    return false;
                                }
                            } else {
                                bl = lIlllIllIl[0];
                            }
                            return bl;
                        }, (int)lIlllIllIl[4]);

                    }
                }
            }
            if (aC.lIIllllIIlllI(aC.an() ? 1 : 0)) {
                if (aC.lIIllllIlIIII(Movement.isRunEnabled() ? 1 : 0) && aC.lIIllllIlIlII(Movement.getRunEnergy(), lIlllIllIl[22])) {
                    Movement.toggleRun();
                    Time.sleepTicks((int)lIlllIllIl[23]);

                }
                if (aC.lIIllllIIlllI(Inventory.isFull() ? 1 : 0)) {
                    AccBuilderSotf.c = lIlllIllII[lIlllIllIl[23]];
                    Inventory.getAll((int[])pc).stream().forEach(Item::drop);
                }
                if (aC.lIIllllIlIIII(Inventory.isFull() ? 1 : 0)) {
                    if (aC.lIIllllIIllll(Skills.getLevel((Skill)Skill.MINING), lIlllIllIl[24])) {
                        if (aC.lIIllllIlIIII(y.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = lIlllIllII[lIlllIllIl[21]];
                            Movement.walkTo((WorldPoint)F);

                            Time.sleepTicks((int)lIlllIllIl[5]);

                        }
                        if (aC.lIIllllIIlllI(y.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = lIlllIllII[lIlllIllIl[25]];
                            var4 = TileObjects.getNearest((WorldPoint)Players.getLocal().getWorldLocation(), (int[])ny);
                            if (aC.lIIllllIlIIII(Players.getLocal().isAnimating() ? 1 : 0) && aC.lIIllllIlIIII(Players.getLocal().isMoving() ? 1 : 0) && aC.lIIllllIlIIIl(var4)) {
                                var4.interact(lIlllIllII[lIlllIllIl[26]]);
                                Time.sleepTicks((int)lIlllIllIl[2]);

                            }
                        }
                    }
                    if (aC.lIIllllIlIIll(Skills.getLevel((Skill)Skill.MINING), lIlllIllIl[24])) {
                        if (aC.lIIllllIlIIII(y.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = lIlllIllII[lIlllIllIl[27]];
                            Movement.walkTo((WorldPoint)F);

                            Time.sleepTicks((int)lIlllIllIl[5]);

                        }
                        if (aC.lIIllllIIlllI(y.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = lIlllIllII[lIlllIllIl[28]];
                            var4 = TileObjects.getNearest((WorldPoint)Players.getLocal().getWorldLocation(), (int[])nx);
                            if (aC.lIIllllIlIIII(Players.getLocal().isAnimating() ? 1 : 0) && aC.lIIllllIlIIII(Players.getLocal().isMoving() ? 1 : 0) && aC.lIIllllIlIIIl(var4)) {
                                var4.interact(lIlllIllII[lIlllIllIl[29]]);
                                Time.sleepTicks((int)lIlllIllIl[2]);

                            }
                        }
                    }
                }
            }
        }
    }

    private static boolean lIIllllIlIIlI(int n2) {
        return n2 > 0;
    }

    private static void lIIllllIIllII() {
        lIlllIllII = new String[lIlllIllIl[63]];
        aC.lIlllIllII[aC.lIlllIllIl[0]] = "Buying items";
        aC.lIlllIllII[aC.lIlllIllIl[1]] = "Finished buying items, switching back to mining";
        aC.lIlllIllII[aC.lIlllIllIl[2]] = "Navigating to bank";
        aC.lIlllIllII[aC.lIlllIllIl[3]] = "Handling banking";
        aC.lIlllIllII[aC.lIlllIllIl[5]] = "We are missing axes, switching to BUYING";
        aC.lIlllIllII[aC.lIlllIllIl[23]] = "Dropping";
        aC.lIlllIllII[aC.lIlllIllIl[21]] = "Walking to mine";
        aC.lIlllIllII[aC.lIlllIllIl[25]] = "Mining copper";
        aC.lIlllIllII[aC.lIlllIllIl[26]] = "Mine";
        aC.lIlllIllII[aC.lIlllIllIl[27]] = "Walking to iron ores";
        aC.lIlllIllII[aC.lIlllIllIl[28]] = "Mining iron";
        aC.lIlllIllII[aC.lIlllIllIl[29]] = "Mine";
        aC.lIlllIllII[aC.lIlllIllIl[41]] = "Mining";
        aC.lIlllIllII[aC.lIlllIllIl[43]] = "ring of wealth (";
    }

    private static boolean lIIllllIIlllI(int n2) {
        return n2 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean an() {
        int n2;
        if (aC.lIIllllIlIIll(Skills.getLevel((Skill)Skill.MINING), lIlllIllIl[30])) {
            boolean bl;
            int[] nArray = new int[lIlllIllIl[1]];
            nArray[aC.lIlllIllIl[0]] = lIlllIllIl[10];
            if (aC.lIIllllIlIIlI(Inventory.getCount((int[])nArray))) {
                bl = lIlllIllIl[1];

                if (3 > 0) return bl;
                return false;
            }
            bl = lIlllIllIl[0];
            return bl;
        }
        if (aC.lIIllllIlIIll(Skills.getLevel((Skill)Skill.MINING), lIlllIllIl[31]) && aC.lIIllllIIllll(Skills.getLevel((Skill)Skill.MINING), lIlllIllIl[30])) {
            int n3;
            int[] nArray = new int[lIlllIllIl[1]];
            nArray[aC.lIlllIllIl[0]] = lIlllIllIl[10];
            if (aC.lIIllllIlIIlI(Inventory.getCount((int[])nArray))) {
                int[] nArray2 = new int[lIlllIllIl[1]];
                nArray2[aC.lIlllIllIl[0]] = lIlllIllIl[9];
                if (aC.lIIllllIlIIlI(Inventory.getCount((int[])nArray2))) {
                    n3 = lIlllIllIl[1];

                    if (1 <= 1) return n3 != 0;
                    return ((0xB2 ^ 0xAD ^ (0x69 ^ 0x7A)) & (177 + 109 - 102 + 18 ^ 121 + 91 - 57 + 43 ^ -1)) != 0;
                }
            }
            n3 = lIlllIllIl[0];
            return n3 != 0;
        }
        if (aC.lIIllllIlIIll(Skills.getLevel((Skill)Skill.MINING), lIlllIllIl[32]) && aC.lIIllllIIllll(Skills.getLevel((Skill)Skill.MINING), lIlllIllIl[31])) {
            int n4;
            int[] nArray = new int[lIlllIllIl[1]];
            nArray[aC.lIlllIllIl[0]] = lIlllIllIl[10];
            if (aC.lIIllllIlIIlI(Inventory.getCount((int[])nArray))) {
                int[] nArray3 = new int[lIlllIllIl[1]];
                nArray3[aC.lIlllIllIl[0]] = lIlllIllIl[9];
                if (aC.lIIllllIlIIlI(Inventory.getCount((int[])nArray3))) {
                    int[] nArray4 = new int[lIlllIllIl[1]];
                    nArray4[aC.lIlllIllIl[0]] = lIlllIllIl[8];
                    if (aC.lIIllllIlIIlI(Inventory.getCount((int[])nArray4))) {
                        n4 = lIlllIllIl[1];

                        if (-(0x36 ^ 0x32) <= 0) return n4 != 0;
                        return ((0x51 ^ 0x13) & ~(0xEB ^ 0xA9) & ~((0xF0 ^ 0xA3) & ~(0x76 ^ 0x25))) != 0;
                    }
                }
            }
            n4 = lIlllIllIl[0];
            return n4 != 0;
        }
        if (aC.lIIllllIlIIll(Skills.getLevel((Skill)Skill.MINING), lIlllIllIl[21]) && aC.lIIllllIIllll(Skills.getLevel((Skill)Skill.MINING), lIlllIllIl[32])) {
            int n5;
            int[] nArray = new int[lIlllIllIl[1]];
            nArray[aC.lIlllIllIl[0]] = lIlllIllIl[10];
            if (aC.lIIllllIlIIlI(Inventory.getCount((int[])nArray))) {
                int[] nArray5 = new int[lIlllIllIl[1]];
                nArray5[aC.lIlllIllIl[0]] = lIlllIllIl[9];
                if (aC.lIIllllIlIIlI(Inventory.getCount((int[])nArray5))) {
                    int[] nArray6 = new int[lIlllIllIl[1]];
                    nArray6[aC.lIlllIllIl[0]] = lIlllIllIl[8];
                    if (aC.lIIllllIlIIlI(Inventory.getCount((int[])nArray6))) {
                        int[] nArray7 = new int[lIlllIllIl[1]];
                        nArray7[aC.lIlllIllIl[0]] = lIlllIllIl[7];
                        if (aC.lIIllllIlIIlI(Inventory.getCount((int[])nArray7))) {
                            n5 = lIlllIllIl[1];

                            if (((0x15 ^ 0x5E) & ~(0x8F ^ 0xC4)) >= 0) return n5 != 0;
                            return false;
                        }
                    }
                }
            }
            n5 = lIlllIllIl[0];
            return n5 != 0;
        }
        int[] nArray = new int[lIlllIllIl[1]];
        nArray[aC.lIlllIllIl[0]] = lIlllIllIl[10];
        if (aC.lIIllllIlIIlI(Inventory.getCount((int[])nArray))) {
            int[] nArray8 = new int[lIlllIllIl[1]];
            nArray8[aC.lIlllIllIl[0]] = lIlllIllIl[9];
            if (aC.lIIllllIlIIlI(Inventory.getCount((int[])nArray8))) {
                int[] nArray9 = new int[lIlllIllIl[1]];
                nArray9[aC.lIlllIllIl[0]] = lIlllIllIl[8];
                if (aC.lIIllllIlIIlI(Inventory.getCount((int[])nArray9))) {
                    int[] nArray10 = new int[lIlllIllIl[1]];
                    nArray10[aC.lIlllIllIl[0]] = lIlllIllIl[7];
                    if (aC.lIIllllIlIIlI(Inventory.getCount((int[])nArray10))) {
                        int[] nArray11 = new int[lIlllIllIl[1]];
                        nArray11[aC.lIlllIllIl[0]] = lIlllIllIl[6];
                        if (aC.lIIllllIlIIlI(Inventory.getCount((int[])nArray11))) {
                            n2 = lIlllIllIl[1];

                            if (-1 < ((221 + 53 - 98 + 56 ^ 21 + 113 - 90 + 128) & (33 + 178 - 3 + 2 ^ 44 + 49 - -43 + 14 ^ -1))) return n2 != 0;
                            return ((0x66 ^ 0x7D ^ (0xBC ^ 0x93)) & (103 + 52 - 140 + 143 ^ 73 + 156 - 228 + 169 ^ -1)) != 0;
                        }
                    }
                }
            }
        }
        n2 = lIlllIllIl[0];
        return n2 != 0;
    }

    @Override
    public String ag() {
        return lIlllIllII[lIlllIllIl[41]];
    }

    private static boolean lIIllllIlIIll(int n2, int n3) {
        return n2 >= n3;
    }
}

