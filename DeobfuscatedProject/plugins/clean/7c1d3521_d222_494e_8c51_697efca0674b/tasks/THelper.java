/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
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
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.AHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.ANHelper;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.BHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.DHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.EHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.FHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.GHelper;

public class THelper
implements ac {
    public static  List<d> bv;
    private static final  int lR;
    static  int di;
    static  boolean dj;
    
    private static final  String[] lV;
    
    private static final  WorldPoint lU;
    private static final  int lT;
    private static final  int lS;
    static  int cG;
    public static  boolean bt;

    /*
     * WARNING - void declaration
     */
    private static void dA() {
        void var1;
        BankLocation bankLocation = BankLocation.getNearest();
        if (T.lIlIlIIllllII(bankLocation) && T.lIlIlIIlllIlI(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIIlIIllI[llIIlIIlll[21]];
            a.a(bankLocation);
            Time.sleepTicks((int)llIIlIIlll[3]);

        }
        if (T.lIlIlIIllllII(var1) && T.lIlIlIIlllIII(var1.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIIlIIllI[llIIlIIlll[22]];
            if (T.lIlIlIIlllIlI(Bank.isOpen() ? 1 : 0)) {
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)llIIlIIlll[7]);

            }
            if (T.lIlIlIIlllIII(Bank.isOpen() ? 1 : 0)) {
                if (T.lIlIlIIlllIll(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)llIIlIIlll[6]);

                }
                if (T.lIlIlIIlllIll(Equipment.getAll().size())) {
                    Bank.depositEquipment();
                    Time.sleepTicks((int)llIIlIIlll[3]);

                }
                int[] nArray = new int[llIIlIIlll[6]];
                nArray[T.llIIlIIlll[0]] = llIIlIIlll[11];
                nArray[T.llIIlIIlll[1]] = llIIlIIlll[10];
                nArray[T.llIIlIIlll[3]] = llIIlIIlll[8];
                nArray[T.llIIlIIlll[5]] = llIIlIIlll[13];
                if (T.lIlIlIIlllIlI(e.c(nArray) ? 1 : 0)) {
                    T.Q();
                    System.out.println(llIIlIIllI[llIIlIIlll[23]]);
                    bt = llIIlIIlll[1];
                    return;
                }
                int[] nArray2 = new int[llIIlIIlll[6]];
                nArray2[T.llIIlIIlll[0]] = llIIlIIlll[11];
                nArray2[T.llIIlIIlll[1]] = llIIlIIlll[10];
                nArray2[T.llIIlIIlll[3]] = llIIlIIlll[8];
                nArray2[T.llIIlIIlll[5]] = llIIlIIlll[13];
                if (T.lIlIlIIlllIII(e.c(nArray2) ? 1 : 0)) {
                    a.a(llIIlIIlll[11], llIIlIIlll[6]);
                    a.a(llIIlIIlll[10], llIIlIIlll[3]);
                    a.a(llIIlIIlll[8], llIIlIIlll[9]);
                    a.a(llIIlIIlll[13], llIIlIIlll[1]);
                }
                a.b(f.bk, llIIlIIlll[1]);
            }
        }
    }

    private static boolean lIlIlIIllllII(Object object) {
        return object != null;
    }

    @Override
    public String ag() {
        return llIIlIIllI[llIIlIIlll[30]];
    }

    private static boolean lIlIlIIlllllI(int n2, int n3) {
        return n2 > n3;
    }

    private static void lIlIlIIllIllI() {
        llIIlIIllI = new String[llIIlIIlll[38]];
        T.llIIlIIllI[T.llIIlIIlll[0]] = "Buying items";
        T.llIIlIIllI[T.llIIlIIlll[1]] = "Finished buying items, switching back to quest";
        T.llIIlIIllI[T.llIIlIIlll[3]] = "Drink";
        T.llIIlIIllI[T.llIIlIIlll[5]] = "Nav to bank";
        T.llIIlIIllI[T.llIIlIIlll[6]] = "Handling banking";
        T.llIIlIIllI[T.llIIlIIlll[12]] = "We are missing quest supplies, switching to BUYING";
        T.llIIlIIllI[T.llIIlIIlll[9]] = "We are missing quest supplies, switching to BUYING";
        T.llIIlIIllI[T.llIIlIIlll[15]] = "Nav to start";
        T.llIIlIIllI[T.llIIlIIlll[16]] = "Handle dialog";
        T.llIIlIIllI[T.llIIlIIlll[17]] = "Door";
        T.llIIlIIllI[T.llIIlIIlll[18]] = "Open";
        T.llIIlIIllI[T.llIIlIIlll[19]] = "Open";
        T.llIIlIIllI[T.llIIlIIlll[20]] = "Doric";
        T.llIIlIIllI[T.llIIlIIlll[21]] = "Nav to bank";
        T.llIIlIIllI[T.llIIlIIlll[22]] = "Handling banking";
        T.llIIlIIllI[T.llIIlIIlll[23]] = "We are missing quest supplies, switching to BUYING";
        T.llIIlIIllI[T.llIIlIIlll[30]] = "Dorics quest";
        T.llIIlIIllI[T.llIIlIIlll[31]] = "ring of wealth (";
        T.llIIlIIllI[T.llIIlIIlll[34]] = "I wanted to use your anvils.";
        T.llIIlIIllI[T.llIIlIIlll[35]] = "Yes, I will get you the materials.";
        T.llIIlIIllI[T.llIIlIIlll[36]] = "Certainly, I'll be right back!";
        T.llIIlIIllI[T.llIIlIIlll[37]] = "Yes.";
    }

        return String.valueOf(var2);
    }

    private static void Q() {
        d var3;
        Object var4;
        block17: {
            block16: {
                block15: {
                    block14: {
                        block13: {
                            block12: {
                                int[] nArray = new int[llIIlIIlll[1]];
                                nArray[T.llIIlIIlll[0]] = llIIlIIlll[8];
                                if (!T.lIlIlIIlllIII(Bank.contains((int[])nArray) ? 1 : 0)) break block12;
                                int[] nArray2 = new int[llIIlIIlll[1]];
                                nArray2[T.llIIlIIlll[0]] = llIIlIIlll[8];
                                if (!T.lIlIlIIlllIII(Bank.contains((int[])nArray2) ? 1 : 0)) break block13;
                                int[] nArray3 = new int[llIIlIIlll[1]];
                                nArray3[T.llIIlIIlll[0]] = llIIlIIlll[8];
                                if (!T.lIlIlIIlllIIl(Bank.getFirst((int[])nArray3).getQuantity(), llIIlIIlll[9])) break block13;
                            }
                            var4 = new DHelper(llIIlIIlll[8], llIIlIIlll[9], llIIlIIlll[24]);
                            bv.add((DHelper) ar4);

                        }
                        int[] nArray = new int[llIIlIIlll[1]];
                        nArray[T.llIIlIIlll[0]] = llIIlIIlll[10];
                        if (!T.lIlIlIIlllIII(Bank.contains((int[])nArray) ? 1 : 0)) break block14;
                        int[] nArray4 = new int[llIIlIIlll[1]];
                        nArray4[T.llIIlIIlll[0]] = llIIlIIlll[10];
                        if (!T.lIlIlIIlllIII(Bank.contains((int[])nArray4) ? 1 : 0)) break block15;
                        int[] nArray5 = new int[llIIlIIlll[1]];
                        nArray5[T.llIIlIIlll[0]] = llIIlIIlll[10];
                        if (!T.lIlIlIIlllIIl(Bank.getFirst((int[])nArray5).getQuantity(), llIIlIIlll[3])) break block15;
                    }
                    var4 = new DHelper(llIIlIIlll[10], llIIlIIlll[3], llIIlIIlll[24]);
                    bv.add((DHelper) ar4);

                }
                int[] nArray = new int[llIIlIIlll[1]];
                nArray[T.llIIlIIlll[0]] = llIIlIIlll[11];
                if (!T.lIlIlIIlllIII(Bank.contains((int[])nArray) ? 1 : 0)) break block16;
                int[] nArray6 = new int[llIIlIIlll[1]];
                nArray6[T.llIIlIIlll[0]] = llIIlIIlll[11];
                if (!T.lIlIlIIlllIII(Bank.contains((int[])nArray6) ? 1 : 0)) break block17;
                int[] nArray7 = new int[llIIlIIlll[1]];
                nArray7[T.llIIlIIlll[0]] = llIIlIIlll[11];
                if (!T.lIlIlIIlllIIl(Bank.getFirst((int[])nArray7).getQuantity(), llIIlIIlll[6])) break block17;
            }
            var4 = new DHelper(llIIlIIlll[11], llIIlIIlll[6], llIIlIIlll[24]);
            bv.add((DHelper) ar4);

        }
        int[] nArray = new int[llIIlIIlll[1]];
        nArray[T.llIIlIIlll[0]] = llIIlIIlll[13];
        if (T.lIlIlIIlllIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
            var4 = new DHelper(llIIlIIlll[13], llIIlIIlll[12], llIIlIIlll[7]);
            bv.add((DHelper) ar4);

        }
        if (T.lIlIlIIlllIlI(Bank.contains((Predicate)(var4 = item -> item.getName().toLowerCase().contains(llIIlIIllI[llIIlIIlll[31]]))) ? 1 : 0)) {
            var3 = new DHelper(llIIlIIlll[25], llIIlIIlll[12], llIIlIIlll[26]);
            bv.add(var3);

        }
        int[] nArray8 = new int[llIIlIIlll[1]];
        nArray8[T.llIIlIIlll[0]] = llIIlIIlll[27];
        if (T.lIlIlIIlllIlI(Bank.contains((int[])nArray8) ? 1 : 0)) {
            var3 = new DHelper(llIIlIIlll[27], llIIlIIlll[28], llIIlIIlll[29]);
            bv.add(var3);

        }
    }

    public static void dz() {
        block22: {
            BankLocation var5;
            block23: {
                block27: {
                    block25: {
                        block26: {
                            block24: {
                                if (T.lIlIlIIlllIII(bt ? 1 : 0)) {
                                    AccBuilderSotf.c = llIIlIIllI[llIIlIIlll[0]];
                                    b.a(bv);
                                    if (T.lIlIlIIlllIIl(bv.size(), llIIlIIlll[1])) {
                                        System.out.println(llIIlIIllI[llIIlIIlll[1]]);
                                        bt = llIIlIIlll[0];
                                    }
                                }
                                if (!T.lIlIlIIlllIlI(bt ? 1 : 0)) break block22;
                                if (T.lIlIlIIlllIII(Inventory.contains((int[])f.ba) ? 1 : 0) && T.lIlIlIIlllIIl(Movement.getRunEnergy(), llIIlIIlll[2])) {
                                    Inventory.getFirst((int[])f.ba).interact(llIIlIIllI[llIIlIIlll[3]]);
                                    Time.sleepTicks((int)llIIlIIlll[1]);

                                }
                                if (T.lIlIlIIlllIlI(Movement.isRunEnabled() ? 1 : 0) && T.lIlIlIIlllIll(Movement.getRunEnergy())) {
                                    Movement.toggleRun();
                                }
                                if (!T.lIlIlIIlllIlI(T.an() ? 1 : 0) || !T.lIlIlIIlllIIl(e.j(llIIlIIlll[4]), llIIlIIlll[1])) break block23;
                                var5 = BankLocation.getNearest();
                                if (T.lIlIlIIllllII(var5) && T.lIlIlIIlllIlI(var5.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderSotf.c = llIIlIIllI[llIIlIIlll[5]];
                                    a.a(var5);
                                    Time.sleepTicks((int)llIIlIIlll[3]);

                                }
                                if (!T.lIlIlIIllllII(var5) || !T.lIlIlIIlllIII(var5.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block23;
                                AccBuilderSotf.c = llIIlIIllI[llIIlIIlll[6]];
                                if (T.lIlIlIIlllIlI(Bank.isOpen() ? 1 : 0)) {
                                    a.a();
                                    Time.sleepUntil(() -> Bank.isOpen(), (int)llIIlIIlll[7]);

                                }
                                if (!T.lIlIlIIlllIII(Bank.isOpen() ? 1 : 0)) break block23;
                                if (T.lIlIlIIlllIll(Inventory.getAll().size())) {
                                    Bank.depositInventory();
                                    Time.sleepTicks((int)llIIlIIlll[6]);

                                }
                                if (T.lIlIlIIlllIll(Equipment.getAll().size())) {
                                    Bank.depositEquipment();
                                    Time.sleepTicks((int)llIIlIIlll[3]);

                                }
                                int[] nArray = new int[llIIlIIlll[1]];
                                nArray[T.llIIlIIlll[0]] = llIIlIIlll[8];
                                if (!T.lIlIlIIlllIII(Bank.contains((int[])nArray) ? 1 : 0)) break block24;
                                int[] nArray2 = new int[llIIlIIlll[1]];
                                nArray2[T.llIIlIIlll[0]] = llIIlIIlll[8];
                                if (!T.lIlIlIIllllIl(Bank.getFirst((int[])nArray2).getQuantity(), llIIlIIlll[9])) break block25;
                            }
                            int[] nArray = new int[llIIlIIlll[1]];
                            nArray[T.llIIlIIlll[0]] = llIIlIIlll[10];
                            if (!T.lIlIlIIlllIII(Bank.contains((int[])nArray) ? 1 : 0)) break block26;
                            int[] nArray3 = new int[llIIlIIlll[1]];
                            nArray3[T.llIIlIIlll[0]] = llIIlIIlll[10];
                            if (!T.lIlIlIIllllIl(Bank.getFirst((int[])nArray3).getQuantity(), llIIlIIlll[3])) break block25;
                        }
                        int[] nArray = new int[llIIlIIlll[1]];
                        nArray[T.llIIlIIlll[0]] = llIIlIIlll[11];
                        if (!T.lIlIlIIlllIII(Bank.contains((int[])nArray) ? 1 : 0)) break block27;
                        int[] nArray4 = new int[llIIlIIlll[1]];
                        nArray4[T.llIIlIIlll[0]] = llIIlIIlll[11];
                        if (!T.lIlIlIIlllIIl(Bank.getFirst((int[])nArray4).getQuantity(), llIIlIIlll[6])) break block27;
                    }
                    T.Q();
                    System.out.println(llIIlIIllI[llIIlIIlll[12]]);
                    bt = llIIlIIlll[1];
                    return;
                }
                int[] nArray = new int[llIIlIIlll[6]];
                nArray[T.llIIlIIlll[0]] = llIIlIIlll[11];
                nArray[T.llIIlIIlll[1]] = llIIlIIlll[10];
                nArray[T.llIIlIIlll[3]] = llIIlIIlll[8];
                nArray[T.llIIlIIlll[5]] = llIIlIIlll[13];
                if (T.lIlIlIIlllIlI(e.c(nArray) ? 1 : 0)) {
                    T.Q();
                    System.out.println(llIIlIIllI[llIIlIIlll[9]]);
                    bt = llIIlIIlll[1];
                    return;
                }
                int[] nArray5 = new int[llIIlIIlll[6]];
                nArray5[T.llIIlIIlll[0]] = llIIlIIlll[11];
                nArray5[T.llIIlIIlll[1]] = llIIlIIlll[10];
                nArray5[T.llIIlIIlll[3]] = llIIlIIlll[8];
                nArray5[T.llIIlIIlll[5]] = llIIlIIlll[13];
                if (T.lIlIlIIlllIII(e.c(nArray5) ? 1 : 0)) {
                    a.a(llIIlIIlll[11], llIIlIIlll[6]);
                    a.a(llIIlIIlll[10], llIIlIIlll[3]);
                    a.a(llIIlIIlll[8], llIIlIIlll[9]);
                    a.a(llIIlIIlll[13], llIIlIIlll[1]);
                }
                if (T.lIlIlIIlllIII(AccBuilderSotf.e ? 1 : 0)) {
                    a.b(f.bk, llIIlIIlll[1]);
                }
            }
            if (T.lIlIlIIlllIlI(T.an() ? 1 : 0) && T.lIlIlIIlllIll(e.j(llIIlIIlll[4])) && T.lIlIlIIlllllI(Players.getLocal().getWorldLocation().distanceTo(lU), llIIlIIlll[12])) {
                T.dA();
            }
            if ((!T.lIlIlIIlllIlI(T.an() ? 1 : 0) || T.lIlIlIIllllll(Players.getLocal().getWorldLocation().distanceTo(lU), llIIlIIlll[12])) && T.lIlIlIIlllIIl(e.j(llIIlIIlll[4]), llIIlIIlll[14])) {
                if (T.lIlIlIIlllllI(Players.getLocal().getWorldLocation().distanceTo(lU), llIIlIIlll[6])) {
                    di = llIIlIIlll[0];
                    AccBuilderSotf.c = llIIlIIllI[llIIlIIlll[15]];
                    if (T.lIlIlIIlllIIl(cG, llIIlIIlll[1])) {
                        e.x();
                        cG += llIIlIIlll[1];
                    }
                    Movement.walkTo((WorldPoint)lU);

                }
                if (T.lIlIlIIllllll(Players.getLocal().getWorldLocation().distanceTo(lU), llIIlIIlll[9])) {
                    AccBuilderSotf.c = llIIlIIllI[llIIlIIlll[16]];
                    String[] stringArray = new String[llIIlIIlll[1]];
                    stringArray[T.llIIlIIlll[0]] = llIIlIIllI[llIIlIIlll[17]];
                    var5 = TileObjects.getNearest((String[])stringArray);
                    if (T.lIlIlIIllllII(var5)) {
                        String[] stringArray2 = new String[llIIlIIlll[1]];
                        stringArray2[T.llIIlIIlll[0]] = llIIlIIllI[llIIlIIlll[18]];
                        if (T.lIlIlIIlllIII(var5.hasAction(stringArray2) ? 1 : 0)) {
                            var5.interact(llIIlIIllI[llIIlIIlll[19]]);
                            Time.sleepTicks((int)llIIlIIlll[5]);

                        }
                    }
                    if (T.lIlIlIIlllIIl(di, llIIlIIlll[1])) {
                        aN.td += llIIlIIlll[1];
                        aN.u(AccBuilderSotf.m);
                        di += llIIlIIlll[1];
                        aN.td = llIIlIIlll[0];
                        dj = llIIlIIlll[0];
                    }
                    g.a(llIIlIIllI[llIIlIIlll[20]], lV);
                }
            }
            g.a(new String[llIIlIIlll[0]]);
        }
        System.out.println("Setting: " + e.j(llIIlIIlll[4]));
    }

    private static boolean lIlIlIIlllIll(int n2) {
        return n2 > 0;
    }

    private static boolean lIlIlIIllllIl(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public int af() {
        try {
            T.dz();

        }
        catch (Exception var6) {
            var6.printStackTrace();
        }
        if (-(0x55 ^ 0x50) >= 0) {
            return (0x26 ^ 0x2E) & ~(0x7C ^ 0x74);
        }
        return llIIlIIlll[18];
    }

    @Override
    public boolean ae() {
        return llIIlIIlll[0];
    }

    private static boolean lIlIlIIlllIII(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (T.lIlIlIIllllIl(e.j(llIIlIIlll[4]), llIIlIIlll[14])) {
            bl = llIIlIIlll[1];

            if (((0x6B ^ 0x12 ^ (0x93 ^ 0xAF)) & (0x32 ^ 0x51 ^ (0x15 ^ 0x33) ^ -1) & ((65 + 47 - 75 + 107 ^ 10 + 156 - 93 + 87) & (127 + 17 - 84 + 124 ^ 98 + 39 - 23 + 22 ^ -1) ^ -1)) != 0) {
                return ((0xD2 ^ 0xBD ^ (0x55 ^ 0x76)) & (160 + 210 - 179 + 38 ^ 150 + 18 - 27 + 28 ^ -1)) != 0;
            }
        } else {
            bl = llIIlIIlll[0];
        }
        return bl;
    }

    static {
        T.lIlIlIIllIlll();
        T.lIlIlIIllIllI();
        lR = llIIlIIlll[8];
        lT = llIIlIIlll[11];
        lS = llIIlIIlll[10];
        lU = new WorldPoint(llIIlIIlll[32], llIIlIIlll[33], llIIlIIlll[0]);
        String[] stringArray = new String[llIIlIIlll[6]];
        stringArray[T.llIIlIIlll[0]] = llIIlIIllI[llIIlIIlll[34]];
        stringArray[T.llIIlIIlll[1]] = llIIlIIllI[llIIlIIlll[35]];
        stringArray[T.llIIlIIlll[3]] = llIIlIIllI[llIIlIIlll[36]];
        stringArray[T.llIIlIIlll[5]] = llIIlIIllI[llIIlIIlll[37]];
        lV = stringArray;
        bv = new ArrayList<d>();
        cG = llIIlIIlll[0];
    }

    private static boolean lIlIlIIllllll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIlIlIIlllIlI(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIlIIlllIIl(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        int[] nArray = new int[llIIlIIlll[1]];
        nArray[T.llIIlIIlll[0]] = llIIlIIlll[8];
        if (T.lIlIlIIllllIl(Inventory.getCount((int[])nArray), llIIlIIlll[9])) {
            int[] nArray2 = new int[llIIlIIlll[1]];
            nArray2[T.llIIlIIlll[0]] = llIIlIIlll[10];
            if (T.lIlIlIIllllIl(Inventory.getCount((int[])nArray2), llIIlIIlll[3])) {
                int[] nArray3 = new int[llIIlIIlll[1]];
                nArray3[T.llIIlIIlll[0]] = llIIlIIlll[11];
                if (T.lIlIlIIllllIl(Inventory.getCount((int[])nArray3), llIIlIIlll[6])) {
                    n2 = llIIlIIlll[1];

                    if (((0x62 ^ 0x78 ^ (2 ^ 0x5E)) & (0xC5 ^ 0x94 ^ (0x52 ^ 0x45) ^ -1)) == 0) return n2 != 0;
                    return ((156 + 158 - 218 + 74 ^ 156 + 92 - 120 + 61) & (0x25 ^ 0x7F ^ (0xCF ^ 0x82) ^ -1)) != 0;
                }
            }
        }
        n2 = llIIlIIlll[0];
        return n2 != 0;
    }
}

