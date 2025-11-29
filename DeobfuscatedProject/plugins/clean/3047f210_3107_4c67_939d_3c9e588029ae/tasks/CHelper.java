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
package gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks;

import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.S;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.AHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.ACHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.BHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.DHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.EHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.FHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.GHelper;
import gg.squire.account.AccBuilderTempleTrek;
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

public class CHelper
implements S {
    public static  List<d> bu;
    static  int bS;
    private static final  int gJ;
    private static final  WorldPoint gL;
    
    private static final  int gK;
    public static  boolean bs;
    private static final  int gI;
    private static final  String[] gM;
    static  boolean cl;
    static  int ck;

    private static boolean llIIlIIlIlIII(Object object) {
        return object != null;
    }

    @Override
    public int T() {
        try {
            C.cb();

        }
        catch (Exception var1) {
            var1.printStackTrace();
        }
        
        }
        return lllIlllIIl[18];
    }

    public static void cb() {
        block22: {
            BankLocation var2;
            block23: {
                block27: {
                    block25: {
                        block26: {
                            block24: {
                                if (C.llIIlIIlIIlII(bs ? 1 : 0)) {
                                    AccBuilderTempleTrek.c = lllIlllIII[lllIlllIIl[0]];
                                    b.a(bu);
                                    if (C.llIIlIIlIIlIl(bu.size(), lllIlllIIl[1])) {
                                        System.out.println(lllIlllIII[lllIlllIIl[1]]);
                                        bs = lllIlllIIl[0];
                                    }
                                }
                                if (!C.llIIlIIlIIllI(bs ? 1 : 0)) break block22;
                                if (C.llIIlIIlIIlII(Inventory.contains((int[])f.aU) ? 1 : 0) && C.llIIlIIlIIlIl(Movement.getRunEnergy(), lllIlllIIl[2])) {
                                    Inventory.getFirst((int[])f.aU).interact(lllIlllIII[lllIlllIIl[3]]);
                                    Time.sleepTicks((int)lllIlllIIl[1]);

                                }
                                if (C.llIIlIIlIIllI(Movement.isRunEnabled() ? 1 : 0) && C.llIIlIIlIIlll(Movement.getRunEnergy())) {
                                    Movement.toggleRun();
                                }
                                if (!C.llIIlIIlIIllI(C.aa() ? 1 : 0) || !C.llIIlIIlIIlIl(e.j(lllIlllIIl[4]), lllIlllIIl[1])) break block23;
                                var2 = BankLocation.getNearest();
                                if (C.llIIlIIlIlIII(var2) && C.llIIlIIlIIllI(var2.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderTempleTrek.c = lllIlllIII[lllIlllIIl[5]];
                                    a.a(var2);
                                    Time.sleepTicks((int)lllIlllIIl[3]);

                                }
                                if (!C.llIIlIIlIlIII(var2) || !C.llIIlIIlIIlII(var2.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block23;
                                AccBuilderTempleTrek.c = lllIlllIII[lllIlllIIl[6]];
                                if (C.llIIlIIlIIllI(Bank.isOpen() ? 1 : 0)) {
                                    a.a();
                                    Time.sleepUntil(() -> Bank.isOpen(), (int)lllIlllIIl[7]);

                                }
                                if (!C.llIIlIIlIIlII(Bank.isOpen() ? 1 : 0)) break block23;
                                if (C.llIIlIIlIIlll(Inventory.getAll().size())) {
                                    Bank.depositInventory();
                                    Time.sleepTicks((int)lllIlllIIl[6]);

                                }
                                if (C.llIIlIIlIIlll(Equipment.getAll().size())) {
                                    Bank.depositEquipment();
                                    Time.sleepTicks((int)lllIlllIIl[3]);

                                }
                                int[] nArray = new int[lllIlllIIl[1]];
                                nArray[C.lllIlllIIl[0]] = lllIlllIIl[8];
                                if (!C.llIIlIIlIIlII(Bank.contains((int[])nArray) ? 1 : 0)) break block24;
                                int[] nArray2 = new int[lllIlllIIl[1]];
                                nArray2[C.lllIlllIIl[0]] = lllIlllIIl[8];
                                if (!C.llIIlIIlIlIIl(Bank.getFirst((int[])nArray2).getQuantity(), lllIlllIIl[9])) break block25;
                            }
                            int[] nArray = new int[lllIlllIIl[1]];
                            nArray[C.lllIlllIIl[0]] = lllIlllIIl[10];
                            if (!C.llIIlIIlIIlII(Bank.contains((int[])nArray) ? 1 : 0)) break block26;
                            int[] nArray3 = new int[lllIlllIIl[1]];
                            nArray3[C.lllIlllIIl[0]] = lllIlllIIl[10];
                            if (!C.llIIlIIlIlIIl(Bank.getFirst((int[])nArray3).getQuantity(), lllIlllIIl[3])) break block25;
                        }
                        int[] nArray = new int[lllIlllIIl[1]];
                        nArray[C.lllIlllIIl[0]] = lllIlllIIl[11];
                        if (!C.llIIlIIlIIlII(Bank.contains((int[])nArray) ? 1 : 0)) break block27;
                        int[] nArray4 = new int[lllIlllIIl[1]];
                        nArray4[C.lllIlllIIl[0]] = lllIlllIIl[11];
                        if (!C.llIIlIIlIIlIl(Bank.getFirst((int[])nArray4).getQuantity(), lllIlllIIl[6])) break block27;
                    }
                    C.ae();
                    System.out.println(lllIlllIII[lllIlllIIl[12]]);
                    bs = lllIlllIIl[1];
                    return;
                }
                int[] nArray = new int[lllIlllIIl[6]];
                nArray[C.lllIlllIIl[0]] = lllIlllIIl[11];
                nArray[C.lllIlllIIl[1]] = lllIlllIIl[10];
                nArray[C.lllIlllIIl[3]] = lllIlllIIl[8];
                nArray[C.lllIlllIIl[5]] = lllIlllIIl[13];
                if (C.llIIlIIlIIllI(e.b(nArray) ? 1 : 0)) {
                    C.ae();
                    System.out.println(lllIlllIII[lllIlllIIl[9]]);
                    bs = lllIlllIIl[1];
                    return;
                }
                int[] nArray5 = new int[lllIlllIIl[6]];
                nArray5[C.lllIlllIIl[0]] = lllIlllIIl[11];
                nArray5[C.lllIlllIIl[1]] = lllIlllIIl[10];
                nArray5[C.lllIlllIIl[3]] = lllIlllIIl[8];
                nArray5[C.lllIlllIIl[5]] = lllIlllIIl[13];
                if (C.llIIlIIlIIlII(e.b(nArray5) ? 1 : 0)) {
                    a.a(lllIlllIIl[11], lllIlllIIl[6]);
                    a.a(lllIlllIIl[10], lllIlllIIl[3]);
                    a.a(lllIlllIIl[8], lllIlllIIl[9]);
                    a.a(lllIlllIIl[13], lllIlllIIl[1]);
                }
                if (C.llIIlIIlIIlII(AccBuilderTempleTrek.e ? 1 : 0)) {
                    a.b(f.be, lllIlllIIl[1]);
                }
            }
            if (C.llIIlIIlIIllI(C.aa() ? 1 : 0) && C.llIIlIIlIIlll(e.j(lllIlllIIl[4])) && C.llIIlIIlIlIlI(Players.getLocal().getWorldLocation().distanceTo(gL), lllIlllIIl[12])) {
                C.cc();
            }
            if ((!C.llIIlIIlIIllI(C.aa() ? 1 : 0) || C.llIIlIIlIlIll(Players.getLocal().getWorldLocation().distanceTo(gL), lllIlllIIl[12])) && C.llIIlIIlIIlIl(e.j(lllIlllIIl[4]), lllIlllIIl[14])) {
                if (C.llIIlIIlIlIlI(Players.getLocal().getWorldLocation().distanceTo(gL), lllIlllIIl[6])) {
                    ck = lllIlllIIl[0];
                    AccBuilderTempleTrek.c = lllIlllIII[lllIlllIIl[15]];
                    if (C.llIIlIIlIIlIl(bS, lllIlllIIl[1])) {
                        e.v();
                        bS += lllIlllIIl[1];
                    }
                    Movement.walkTo((WorldPoint)gL);

                }
                if (C.llIIlIIlIlIll(Players.getLocal().getWorldLocation().distanceTo(gL), lllIlllIIl[9])) {
                    AccBuilderTempleTrek.c = lllIlllIII[lllIlllIIl[16]];
                    String[] stringArray = new String[lllIlllIIl[1]];
                    stringArray[C.lllIlllIIl[0]] = lllIlllIII[lllIlllIIl[17]];
                    var2 = TileObjects.getNearest((String[])stringArray);
                    if (C.llIIlIIlIlIII(var2)) {
                        String[] stringArray2 = new String[lllIlllIIl[1]];
                        stringArray2[C.lllIlllIIl[0]] = lllIlllIII[lllIlllIIl[18]];
                        if (C.llIIlIIlIIlII(var2.hasAction(stringArray2) ? 1 : 0)) {
                            var2.interact(lllIlllIII[lllIlllIIl[19]]);
                            Time.sleepTicks((int)lllIlllIIl[5]);

                        }
                    }
                    if (C.llIIlIIlIIlIl(ck, lllIlllIIl[1])) {
                        ac.mY += lllIlllIIl[1];
                        ac.d(AccBuilderTempleTrek.m);
                        ck += lllIlllIIl[1];
                        ac.mY = lllIlllIIl[0];
                        cl = lllIlllIIl[0];
                    }
                    g.a(lllIlllIII[lllIlllIIl[20]], gM);
                }
            }
            g.a(new String[lllIlllIIl[0]]);
        }
        System.out.println("Setting: " + e.j(lllIlllIIl[4]));
    }

    @Override
    public boolean V() {
        boolean bl;
        if (C.llIIlIIlIlIIl(e.j(lllIlllIIl[4]), lllIlllIIl[14])) {
            bl = lllIlllIIl[1];

        } else {
            bl = lllIlllIIl[0];
        }
        return bl;
    }

    static {
        C.llIIlIIlIIIll();
        C.llIIlIIlIIIlI();
        gI = lllIlllIIl[8];
        gK = lllIlllIIl[11];
        gJ = lllIlllIIl[10];
        gL = new WorldPoint(lllIlllIIl[32], lllIlllIIl[33], lllIlllIIl[0]);
        String[] stringArray = new String[lllIlllIIl[6]];
        stringArray[C.lllIlllIIl[0]] = lllIlllIII[lllIlllIIl[34]];
        stringArray[C.lllIlllIIl[1]] = lllIlllIII[lllIlllIIl[35]];
        stringArray[C.lllIlllIIl[3]] = lllIlllIII[lllIlllIIl[36]];
        stringArray[C.lllIlllIIl[5]] = lllIlllIII[lllIlllIIl[37]];
        gM = stringArray;
        bu = new ArrayList<d>();
        bS = lllIlllIIl[0];
    }

    private static boolean llIIlIIlIlIlI(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public String U() {
        return lllIlllIII[lllIlllIIl[30]];
    }

    @Override
    public boolean S() {
        return lllIlllIIl[0];
    }

    private static void llIIlIIlIIIlI() {
        lllIlllIII = new String[lllIlllIIl[38]];
        C.lllIlllIII[C.lllIlllIIl[0]] = "Buying items";
        C.lllIlllIII[C.lllIlllIIl[1]] = "Finished buying items, switching back to quest";
        C.lllIlllIII[C.lllIlllIIl[3]] = "Drink";
        C.lllIlllIII[C.lllIlllIIl[5]] = "Nav to bank";
        C.lllIlllIII[C.lllIlllIIl[6]] = "Handling banking";
        C.lllIlllIII[C.lllIlllIIl[12]] = "We are missing quest supplies, switching to BUYING";
        C.lllIlllIII[C.lllIlllIIl[9]] = "We are missing quest supplies, switching to BUYING";
        C.lllIlllIII[C.lllIlllIIl[15]] = "Nav to start";
        C.lllIlllIII[C.lllIlllIIl[16]] = "Handle dialog";
        C.lllIlllIII[C.lllIlllIIl[17]] = "Door";
        C.lllIlllIII[C.lllIlllIIl[18]] = "Open";
        C.lllIlllIII[C.lllIlllIIl[19]] = "Open";
        C.lllIlllIII[C.lllIlllIIl[20]] = "Doric";
        C.lllIlllIII[C.lllIlllIIl[21]] = "Nav to bank";
        C.lllIlllIII[C.lllIlllIIl[22]] = "Handling banking";
        C.lllIlllIII[C.lllIlllIIl[23]] = "We are missing quest supplies, switching to BUYING";
        C.lllIlllIII[C.lllIlllIIl[30]] = "Dorics quest";
        C.lllIlllIII[C.lllIlllIIl[31]] = "ring of wealth (";
        C.lllIlllIII[C.lllIlllIIl[34]] = "I wanted to use your anvils.";
        C.lllIlllIII[C.lllIlllIIl[35]] = "Yes, I will get you the materials.";
        C.lllIlllIII[C.lllIlllIIl[36]] = "Certainly, I'll be right back!";
        C.lllIlllIII[C.lllIlllIIl[37]] = "Yes.";
    }

    private static boolean llIIlIIlIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIlIIlIIlII(int n2) {
        return n2 != 0;
    }

    private static void ae() {
        d var3;
        Object var4;
        block17: {
            block16: {
                block15: {
                    block14: {
                        block13: {
                            block12: {
                                int[] nArray = new int[lllIlllIIl[1]];
                                nArray[C.lllIlllIIl[0]] = lllIlllIIl[8];
                                if (!C.llIIlIIlIIlII(Bank.contains((int[])nArray) ? 1 : 0)) break block12;
                                int[] nArray2 = new int[lllIlllIIl[1]];
                                nArray2[C.lllIlllIIl[0]] = lllIlllIIl[8];
                                if (!C.llIIlIIlIIlII(Bank.contains((int[])nArray2) ? 1 : 0)) break block13;
                                int[] nArray3 = new int[lllIlllIIl[1]];
                                nArray3[C.lllIlllIIl[0]] = lllIlllIIl[8];
                                if (!C.llIIlIIlIIlIl(Bank.getFirst((int[])nArray3).getQuantity(), lllIlllIIl[9])) break block13;
                            }
                            var4 = new DHelper(lllIlllIIl[8], lllIlllIIl[9], lllIlllIIl[24]);
                            bu.add((DHelper) ar4);

                        }
                        int[] nArray = new int[lllIlllIIl[1]];
                        nArray[C.lllIlllIIl[0]] = lllIlllIIl[10];
                        if (!C.llIIlIIlIIlII(Bank.contains((int[])nArray) ? 1 : 0)) break block14;
                        int[] nArray4 = new int[lllIlllIIl[1]];
                        nArray4[C.lllIlllIIl[0]] = lllIlllIIl[10];
                        if (!C.llIIlIIlIIlII(Bank.contains((int[])nArray4) ? 1 : 0)) break block15;
                        int[] nArray5 = new int[lllIlllIIl[1]];
                        nArray5[C.lllIlllIIl[0]] = lllIlllIIl[10];
                        if (!C.llIIlIIlIIlIl(Bank.getFirst((int[])nArray5).getQuantity(), lllIlllIIl[3])) break block15;
                    }
                    var4 = new DHelper(lllIlllIIl[10], lllIlllIIl[3], lllIlllIIl[24]);
                    bu.add((DHelper) ar4);

                }
                int[] nArray = new int[lllIlllIIl[1]];
                nArray[C.lllIlllIIl[0]] = lllIlllIIl[11];
                if (!C.llIIlIIlIIlII(Bank.contains((int[])nArray) ? 1 : 0)) break block16;
                int[] nArray6 = new int[lllIlllIIl[1]];
                nArray6[C.lllIlllIIl[0]] = lllIlllIIl[11];
                if (!C.llIIlIIlIIlII(Bank.contains((int[])nArray6) ? 1 : 0)) break block17;
                int[] nArray7 = new int[lllIlllIIl[1]];
                nArray7[C.lllIlllIIl[0]] = lllIlllIIl[11];
                if (!C.llIIlIIlIIlIl(Bank.getFirst((int[])nArray7).getQuantity(), lllIlllIIl[6])) break block17;
            }
            var4 = new DHelper(lllIlllIIl[11], lllIlllIIl[6], lllIlllIIl[24]);
            bu.add((DHelper) ar4);

        }
        int[] nArray = new int[lllIlllIIl[1]];
        nArray[C.lllIlllIIl[0]] = lllIlllIIl[13];
        if (C.llIIlIIlIIllI(Bank.contains((int[])nArray) ? 1 : 0)) {
            var4 = new DHelper(lllIlllIIl[13], lllIlllIIl[12], lllIlllIIl[7]);
            bu.add((DHelper) ar4);

        }
        if (C.llIIlIIlIIllI(Bank.contains((Predicate)(var4 = item -> item.getName().toLowerCase().contains(lllIlllIII[lllIlllIIl[31]]))) ? 1 : 0)) {
            var3 = new DHelper(lllIlllIIl[25], lllIlllIIl[12], lllIlllIIl[26]);
            bu.add(var3);

        }
        int[] nArray8 = new int[lllIlllIIl[1]];
        nArray8[C.lllIlllIIl[0]] = lllIlllIIl[27];
        if (C.llIIlIIlIIllI(Bank.contains((int[])nArray8) ? 1 : 0)) {
            var3 = new DHelper(lllIlllIIl[27], lllIlllIIl[28], lllIlllIIl[29]);
            bu.add(var3);

        }
    }

    private static boolean llIIlIIlIlIll(int n2, int n3) {
        return n2 <= n3;
    }

        return String.valueOf(var5);
    }

    private static boolean llIIlIIlIlIIl(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    private static void cc() {
        void var6;
        BankLocation bankLocation = BankLocation.getNearest();
        if (C.llIIlIIlIlIII(bankLocation) && C.llIIlIIlIIllI(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = lllIlllIII[lllIlllIIl[21]];
            a.a(bankLocation);
            Time.sleepTicks((int)lllIlllIIl[3]);

        }
        if (C.llIIlIIlIlIII(var6) && C.llIIlIIlIIlII(var6.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = lllIlllIII[lllIlllIIl[22]];
            if (C.llIIlIIlIIllI(Bank.isOpen() ? 1 : 0)) {
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)lllIlllIIl[7]);

            }
            if (C.llIIlIIlIIlII(Bank.isOpen() ? 1 : 0)) {
                if (C.llIIlIIlIIlll(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)lllIlllIIl[6]);

                }
                if (C.llIIlIIlIIlll(Equipment.getAll().size())) {
                    Bank.depositEquipment();
                    Time.sleepTicks((int)lllIlllIIl[3]);

                }
                int[] nArray = new int[lllIlllIIl[6]];
                nArray[C.lllIlllIIl[0]] = lllIlllIIl[11];
                nArray[C.lllIlllIIl[1]] = lllIlllIIl[10];
                nArray[C.lllIlllIIl[3]] = lllIlllIIl[8];
                nArray[C.lllIlllIIl[5]] = lllIlllIIl[13];
                if (C.llIIlIIlIIllI(e.b(nArray) ? 1 : 0)) {
                    C.ae();
                    System.out.println(lllIlllIII[lllIlllIIl[23]]);
                    bs = lllIlllIIl[1];
                    return;
                }
                int[] nArray2 = new int[lllIlllIIl[6]];
                nArray2[C.lllIlllIIl[0]] = lllIlllIIl[11];
                nArray2[C.lllIlllIIl[1]] = lllIlllIIl[10];
                nArray2[C.lllIlllIIl[3]] = lllIlllIIl[8];
                nArray2[C.lllIlllIIl[5]] = lllIlllIIl[13];
                if (C.llIIlIIlIIlII(e.b(nArray2) ? 1 : 0)) {
                    a.a(lllIlllIIl[11], lllIlllIIl[6]);
                    a.a(lllIlllIIl[10], lllIlllIIl[3]);
                    a.a(lllIlllIIl[8], lllIlllIIl[9]);
                    a.a(lllIlllIIl[13], lllIlllIIl[1]);
                }
                a.b(f.be, lllIlllIIl[1]);
            }
        }
    }

    private static boolean llIIlIIlIIllI(int n2) {
        return n2 == 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean aa() {
        int n2;
        int[] nArray = new int[lllIlllIIl[1]];
        nArray[C.lllIlllIIl[0]] = lllIlllIIl[8];
        if (C.llIIlIIlIlIIl(Inventory.getCount((int[])nArray), lllIlllIIl[9])) {
            int[] nArray2 = new int[lllIlllIIl[1]];
            nArray2[C.lllIlllIIl[0]] = lllIlllIIl[10];
            if (C.llIIlIIlIlIIl(Inventory.getCount((int[])nArray2), lllIlllIIl[3])) {
                int[] nArray3 = new int[lllIlllIIl[1]];
                nArray3[C.lllIlllIIl[0]] = lllIlllIIl[11];
                if (C.llIIlIIlIlIIl(Inventory.getCount((int[])nArray3), lllIlllIIl[6])) {
                    n2 = lllIlllIIl[1];

                    if (3 > 0) return n2 != 0;
                    return (1 & (1 ^ -1)) != 0;
                }
            }
        }
        n2 = lllIlllIIl[0];
        return n2 != 0;
    }

    private static boolean llIIlIIlIIlll(int n2) {
        return n2 > 0;
    }
}

