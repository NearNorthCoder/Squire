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
package gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks;

import gg.squire.account.AccBuilderRat;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.M;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.PHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.AHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.BHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.DHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.EHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.FHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.GHelper;
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

public class VHelper
implements M {
    static  int bY;
    private static final  int fI;
    private static final  WorldPoint fJ;
    static  int co;
    
    static  boolean cp;
    private static final  int fH;
    private static final  int fG;
    private static final  String[] fK;
    
    public static  boolean by;
    public static  List<d> bA;

    public static void bl() {
        block22: {
            BankLocation var1;
            block23: {
                block27: {
                    block25: {
                        block26: {
                            block24: {
                                if (v.lIlIIlIlIIIIlll(by ? 1 : 0)) {
                                    AccBuilderRat.c = lIIIlllIlllIl[lIIIlllIllllI[0]];
                                    b.a(bA);
                                    if (v.lIlIIlIlIIIlIII(bA.size(), lIIIlllIllllI[1])) {
                                        System.out.println(lIIIlllIlllIl[lIIIlllIllllI[1]]);
                                        by = lIIIlllIllllI[0];
                                    }
                                }
                                if (!v.lIlIIlIlIIIlIIl(by ? 1 : 0)) break block22;
                                if (v.lIlIIlIlIIIIlll(Inventory.contains((int[])f.ba) ? 1 : 0) && v.lIlIIlIlIIIlIII(Movement.getRunEnergy(), lIIIlllIllllI[2])) {
                                    Inventory.getFirst((int[])f.ba).interact(lIIIlllIlllIl[lIIIlllIllllI[3]]);
                                    Time.sleepTicks((int)lIIIlllIllllI[1]);

                                }
                                if (v.lIlIIlIlIIIlIIl(Movement.isRunEnabled() ? 1 : 0) && v.lIlIIlIlIIIlIlI(Movement.getRunEnergy())) {
                                    Movement.toggleRun();
                                }
                                if (!v.lIlIIlIlIIIlIIl(v.S() ? 1 : 0) || !v.lIlIIlIlIIIlIII(e.j(lIIIlllIllllI[4]), lIIIlllIllllI[1])) break block23;
                                var1 = BankLocation.getNearest();
                                if (v.lIlIIlIlIIIlIll(var1) && v.lIlIIlIlIIIlIIl(var1.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderRat.c = lIIIlllIlllIl[lIIIlllIllllI[5]];
                                    a.a(var1);
                                    Time.sleepTicks((int)lIIIlllIllllI[3]);

                                }
                                if (!v.lIlIIlIlIIIlIll(var1) || !v.lIlIIlIlIIIIlll(var1.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block23;
                                AccBuilderRat.c = lIIIlllIlllIl[lIIIlllIllllI[6]];
                                if (v.lIlIIlIlIIIlIIl(Bank.isOpen() ? 1 : 0)) {
                                    a.a();
                                    Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIlllIllllI[7]);

                                }
                                if (!v.lIlIIlIlIIIIlll(Bank.isOpen() ? 1 : 0)) break block23;
                                if (v.lIlIIlIlIIIlIlI(Inventory.getAll().size())) {
                                    Bank.depositInventory();
                                    Time.sleepTicks((int)lIIIlllIllllI[6]);

                                }
                                if (v.lIlIIlIlIIIlIlI(Equipment.getAll().size())) {
                                    Bank.depositEquipment();
                                    Time.sleepTicks((int)lIIIlllIllllI[3]);

                                }
                                int[] nArray = new int[lIIIlllIllllI[1]];
                                nArray[v.lIIIlllIllllI[0]] = lIIIlllIllllI[8];
                                if (!v.lIlIIlIlIIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block24;
                                int[] nArray2 = new int[lIIIlllIllllI[1]];
                                nArray2[v.lIIIlllIllllI[0]] = lIIIlllIllllI[8];
                                if (!v.lIlIIlIlIIIllII(Bank.getFirst((int[])nArray2).getQuantity(), lIIIlllIllllI[9])) break block25;
                            }
                            int[] nArray = new int[lIIIlllIllllI[1]];
                            nArray[v.lIIIlllIllllI[0]] = lIIIlllIllllI[10];
                            if (!v.lIlIIlIlIIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block26;
                            int[] nArray3 = new int[lIIIlllIllllI[1]];
                            nArray3[v.lIIIlllIllllI[0]] = lIIIlllIllllI[10];
                            if (!v.lIlIIlIlIIIllII(Bank.getFirst((int[])nArray3).getQuantity(), lIIIlllIllllI[3])) break block25;
                        }
                        int[] nArray = new int[lIIIlllIllllI[1]];
                        nArray[v.lIIIlllIllllI[0]] = lIIIlllIllllI[11];
                        if (!v.lIlIIlIlIIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block27;
                        int[] nArray4 = new int[lIIIlllIllllI[1]];
                        nArray4[v.lIIIlllIllllI[0]] = lIIIlllIllllI[11];
                        if (!v.lIlIIlIlIIIlIII(Bank.getFirst((int[])nArray4).getQuantity(), lIIIlllIllllI[6])) break block27;
                    }
                    v.W();
                    System.out.println(lIIIlllIlllIl[lIIIlllIllllI[12]]);
                    by = lIIIlllIllllI[1];
                    return;
                }
                int[] nArray = new int[lIIIlllIllllI[6]];
                nArray[v.lIIIlllIllllI[0]] = lIIIlllIllllI[11];
                nArray[v.lIIIlllIllllI[1]] = lIIIlllIllllI[10];
                nArray[v.lIIIlllIllllI[3]] = lIIIlllIllllI[8];
                nArray[v.lIIIlllIllllI[5]] = lIIIlllIllllI[13];
                if (v.lIlIIlIlIIIlIIl(e.b(nArray) ? 1 : 0)) {
                    v.W();
                    System.out.println(lIIIlllIlllIl[lIIIlllIllllI[9]]);
                    by = lIIIlllIllllI[1];
                    return;
                }
                int[] nArray5 = new int[lIIIlllIllllI[6]];
                nArray5[v.lIIIlllIllllI[0]] = lIIIlllIllllI[11];
                nArray5[v.lIIIlllIllllI[1]] = lIIIlllIllllI[10];
                nArray5[v.lIIIlllIllllI[3]] = lIIIlllIllllI[8];
                nArray5[v.lIIIlllIllllI[5]] = lIIIlllIllllI[13];
                if (v.lIlIIlIlIIIIlll(e.b(nArray5) ? 1 : 0)) {
                    a.a(lIIIlllIllllI[11], lIIIlllIllllI[6]);
                    a.a(lIIIlllIllllI[10], lIIIlllIllllI[3]);
                    a.a(lIIIlllIllllI[8], lIIIlllIllllI[9]);
                    a.a(lIIIlllIllllI[13], lIIIlllIllllI[1]);
                }
                if (v.lIlIIlIlIIIIlll(AccBuilderRat.e ? 1 : 0)) {
                    a.b(f.bk, lIIIlllIllllI[1]);
                }
            }
            if (v.lIlIIlIlIIIlIIl(v.S() ? 1 : 0) && v.lIlIIlIlIIIlIlI(e.j(lIIIlllIllllI[4])) && v.lIlIIlIlIIIllIl(Players.getLocal().getWorldLocation().distanceTo(fJ), lIIIlllIllllI[12])) {
                v.bm();
            }
            if ((!v.lIlIIlIlIIIlIIl(v.S() ? 1 : 0) || v.lIlIIlIlIIIlllI(Players.getLocal().getWorldLocation().distanceTo(fJ), lIIIlllIllllI[12])) && v.lIlIIlIlIIIlIII(e.j(lIIIlllIllllI[4]), lIIIlllIllllI[14])) {
                if (v.lIlIIlIlIIIllIl(Players.getLocal().getWorldLocation().distanceTo(fJ), lIIIlllIllllI[6])) {
                    co = lIIIlllIllllI[0];
                    AccBuilderRat.c = lIIIlllIlllIl[lIIIlllIllllI[15]];
                    if (v.lIlIIlIlIIIlIII(bY, lIIIlllIllllI[1])) {
                        e.w();
                        bY += lIIIlllIllllI[1];
                    }
                    Movement.walkTo((WorldPoint)fJ);

                }
                if (v.lIlIIlIlIIIlllI(Players.getLocal().getWorldLocation().distanceTo(fJ), lIIIlllIllllI[9])) {
                    AccBuilderRat.c = lIIIlllIlllIl[lIIIlllIllllI[16]];
                    String[] stringArray = new String[lIIIlllIllllI[1]];
                    stringArray[v.lIIIlllIllllI[0]] = lIIIlllIlllIl[lIIIlllIllllI[17]];
                    var1 = TileObjects.getNearest((String[])stringArray);
                    if (v.lIlIIlIlIIIlIll(var1)) {
                        String[] stringArray2 = new String[lIIIlllIllllI[1]];
                        stringArray2[v.lIIIlllIllllI[0]] = lIIIlllIlllIl[lIIIlllIllllI[18]];
                        if (v.lIlIIlIlIIIIlll(var1.hasAction(stringArray2) ? 1 : 0)) {
                            var1.interact(lIIIlllIlllIl[lIIIlllIllllI[19]]);
                            Time.sleepTicks((int)lIIIlllIllllI[5]);

                        }
                    }
                    if (v.lIlIIlIlIIIlIII(co, lIIIlllIllllI[1])) {
                        P.lA += lIIIlllIllllI[1];
                        P.d(AccBuilderRat.m);
                        co += lIIIlllIllllI[1];
                        P.lA = lIIIlllIllllI[0];
                        cp = lIIIlllIllllI[0];
                    }
                    g.a(lIIIlllIlllIl[lIIIlllIllllI[20]], fK);
                }
            }
            g.a(new String[lIIIlllIllllI[0]]);
        }
        System.out.println("Setting: " + e.j(lIIIlllIllllI[4]));
    }

    private static void W() {
        d var2;
        Object var3;
        block17: {
            block16: {
                block15: {
                    block14: {
                        block13: {
                            block12: {
                                int[] nArray = new int[lIIIlllIllllI[1]];
                                nArray[v.lIIIlllIllllI[0]] = lIIIlllIllllI[8];
                                if (!v.lIlIIlIlIIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block12;
                                int[] nArray2 = new int[lIIIlllIllllI[1]];
                                nArray2[v.lIIIlllIllllI[0]] = lIIIlllIllllI[8];
                                if (!v.lIlIIlIlIIIIlll(Bank.contains((int[])nArray2) ? 1 : 0)) break block13;
                                int[] nArray3 = new int[lIIIlllIllllI[1]];
                                nArray3[v.lIIIlllIllllI[0]] = lIIIlllIllllI[8];
                                if (!v.lIlIIlIlIIIlIII(Bank.getFirst((int[])nArray3).getQuantity(), lIIIlllIllllI[9])) break block13;
                            }
                            var3 = new DHelper(lIIIlllIllllI[8], lIIIlllIllllI[9], lIIIlllIllllI[24]);
                            bA.add((DHelper) ar3);

                        }
                        int[] nArray = new int[lIIIlllIllllI[1]];
                        nArray[v.lIIIlllIllllI[0]] = lIIIlllIllllI[10];
                        if (!v.lIlIIlIlIIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block14;
                        int[] nArray4 = new int[lIIIlllIllllI[1]];
                        nArray4[v.lIIIlllIllllI[0]] = lIIIlllIllllI[10];
                        if (!v.lIlIIlIlIIIIlll(Bank.contains((int[])nArray4) ? 1 : 0)) break block15;
                        int[] nArray5 = new int[lIIIlllIllllI[1]];
                        nArray5[v.lIIIlllIllllI[0]] = lIIIlllIllllI[10];
                        if (!v.lIlIIlIlIIIlIII(Bank.getFirst((int[])nArray5).getQuantity(), lIIIlllIllllI[3])) break block15;
                    }
                    var3 = new DHelper(lIIIlllIllllI[10], lIIIlllIllllI[3], lIIIlllIllllI[24]);
                    bA.add((DHelper) ar3);

                }
                int[] nArray = new int[lIIIlllIllllI[1]];
                nArray[v.lIIIlllIllllI[0]] = lIIIlllIllllI[11];
                if (!v.lIlIIlIlIIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block16;
                int[] nArray6 = new int[lIIIlllIllllI[1]];
                nArray6[v.lIIIlllIllllI[0]] = lIIIlllIllllI[11];
                if (!v.lIlIIlIlIIIIlll(Bank.contains((int[])nArray6) ? 1 : 0)) break block17;
                int[] nArray7 = new int[lIIIlllIllllI[1]];
                nArray7[v.lIIIlllIllllI[0]] = lIIIlllIllllI[11];
                if (!v.lIlIIlIlIIIlIII(Bank.getFirst((int[])nArray7).getQuantity(), lIIIlllIllllI[6])) break block17;
            }
            var3 = new DHelper(lIIIlllIllllI[11], lIIIlllIllllI[6], lIIIlllIllllI[24]);
            bA.add((DHelper) ar3);

        }
        int[] nArray = new int[lIIIlllIllllI[1]];
        nArray[v.lIIIlllIllllI[0]] = lIIIlllIllllI[13];
        if (v.lIlIIlIlIIIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            var3 = new DHelper(lIIIlllIllllI[13], lIIIlllIllllI[12], lIIIlllIllllI[7]);
            bA.add((DHelper) ar3);

        }
        if (v.lIlIIlIlIIIlIIl(Bank.contains((Predicate)(var3 = item -> item.getName().toLowerCase().contains(lIIIlllIlllIl[lIIIlllIllllI[31]]))) ? 1 : 0)) {
            var2 = new DHelper(lIIIlllIllllI[25], lIIIlllIllllI[12], lIIIlllIllllI[26]);
            bA.add(var2);

        }
        int[] nArray8 = new int[lIIIlllIllllI[1]];
        nArray8[v.lIIIlllIllllI[0]] = lIIIlllIllllI[27];
        if (v.lIlIIlIlIIIlIIl(Bank.contains((int[])nArray8) ? 1 : 0)) {
            var2 = new DHelper(lIIIlllIllllI[27], lIIIlllIllllI[28], lIIIlllIllllI[29]);
            bA.add(var2);

        }
    }

    private static void lIlIIlIlIIIIlIl() {
        lIIIlllIlllIl = new String[lIIIlllIllllI[38]];
        v.lIIIlllIlllIl[v.lIIIlllIllllI[0]] = "Buying items";
        v.lIIIlllIlllIl[v.lIIIlllIllllI[1]] = "Finished buying items, switching back to quest";
        v.lIIIlllIlllIl[v.lIIIlllIllllI[3]] = "Drink";
        v.lIIIlllIlllIl[v.lIIIlllIllllI[5]] = "Nav to bank";
        v.lIIIlllIlllIl[v.lIIIlllIllllI[6]] = "Handling banking";
        v.lIIIlllIlllIl[v.lIIIlllIllllI[12]] = "We are missing quest supplies, switching to BUYING";
        v.lIIIlllIlllIl[v.lIIIlllIllllI[9]] = "We are missing quest supplies, switching to BUYING";
        v.lIIIlllIlllIl[v.lIIIlllIllllI[15]] = "Nav to start";
        v.lIIIlllIlllIl[v.lIIIlllIllllI[16]] = "Handle dialog";
        v.lIIIlllIlllIl[v.lIIIlllIllllI[17]] = "Door";
        v.lIIIlllIlllIl[v.lIIIlllIllllI[18]] = "Open";
        v.lIIIlllIlllIl[v.lIIIlllIllllI[19]] = "Open";
        v.lIIIlllIlllIl[v.lIIIlllIllllI[20]] = "Doric";
        v.lIIIlllIlllIl[v.lIIIlllIllllI[21]] = "Nav to bank";
        v.lIIIlllIlllIl[v.lIIIlllIllllI[22]] = "Handling banking";
        v.lIIIlllIlllIl[v.lIIIlllIllllI[23]] = "We are missing quest supplies, switching to BUYING";
        v.lIIIlllIlllIl[v.lIIIlllIllllI[30]] = "Dorics quest";
        v.lIIIlllIlllIl[v.lIIIlllIllllI[31]] = "ring of wealth (";
        v.lIIIlllIlllIl[v.lIIIlllIllllI[34]] = "I wanted to use your anvils.";
        v.lIIIlllIlllIl[v.lIIIlllIllllI[35]] = "Yes, I will get you the materials.";
        v.lIIIlllIlllIl[v.lIIIlllIllllI[36]] = "Certainly, I'll be right back!";
        v.lIIIlllIlllIl[v.lIIIlllIllllI[37]] = "Yes.";
    }

        return String.valueOf(var4);
    }

    @Override
    public boolean aa() {
        boolean bl;
        if (v.lIlIIlIlIIIllII(e.j(lIIIlllIllllI[4]), lIIIlllIllllI[14])) {
            bl = lIIIlllIllllI[1];

            if (3 > 3) {
                return ((0xCC ^ 0xC4 ^ (0x5C ^ 0x66)) & (133 + 87 - 171 + 142 ^ 111 + 132 - 212 + 110 ^ -1)) != 0;
            }
        } else {
            bl = lIIIlllIllllI[0];
        }
        return bl;
    }

    private static boolean lIlIIlIlIIIlIlI(int n2) {
        return n2 > 0;
    }

    static {
        v.lIlIIlIlIIIIllI();
        v.lIlIIlIlIIIIlIl();
        fG = lIIIlllIllllI[8];
        fH = lIIIlllIllllI[10];
        fI = lIIIlllIllllI[11];
        fJ = new WorldPoint(lIIIlllIllllI[32], lIIIlllIllllI[33], lIIIlllIllllI[0]);
        String[] stringArray = new String[lIIIlllIllllI[6]];
        stringArray[v.lIIIlllIllllI[0]] = lIIIlllIlllIl[lIIIlllIllllI[34]];
        stringArray[v.lIIIlllIllllI[1]] = lIIIlllIlllIl[lIIIlllIllllI[35]];
        stringArray[v.lIIIlllIllllI[3]] = lIIIlllIlllIl[lIIIlllIllllI[36]];
        stringArray[v.lIIIlllIllllI[5]] = lIIIlllIlllIl[lIIIlllIllllI[37]];
        fK = stringArray;
        bA = new ArrayList<d>();
        bY = lIIIlllIllllI[0];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean S() {
        int n2;
        int[] nArray = new int[lIIIlllIllllI[1]];
        nArray[v.lIIIlllIllllI[0]] = lIIIlllIllllI[8];
        if (v.lIlIIlIlIIIllII(Inventory.getCount((int[])nArray), lIIIlllIllllI[9])) {
            int[] nArray2 = new int[lIIIlllIllllI[1]];
            nArray2[v.lIIIlllIllllI[0]] = lIIIlllIllllI[10];
            if (v.lIlIIlIlIIIllII(Inventory.getCount((int[])nArray2), lIIIlllIllllI[3])) {
                int[] nArray3 = new int[lIIIlllIllllI[1]];
                nArray3[v.lIIIlllIllllI[0]] = lIIIlllIllllI[11];
                if (v.lIlIIlIlIIIllII(Inventory.getCount((int[])nArray3), lIIIlllIllllI[6])) {
                    n2 = lIIIlllIllllI[1];

                    if (((0x39 ^ 0x70) & ~(0xD2 ^ 0x9B)) == 0) return n2 != 0;
                    return false;
                }
            }
        }
        n2 = lIIIlllIllllI[0];
        return n2 != 0;
    }

    private static boolean lIlIIlIlIIIllII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIIlIlIIIIlll(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIlIlIIIlllI(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public boolean X() {
        return lIIIlllIllllI[0];
    }

    private static boolean lIlIIlIlIIIlIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIIlIlIIIlIll(Object object) {
        return object != null;
    }

    private static boolean lIlIIlIlIIIlIII(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public int Y() {
        try {
            v.bl();

        }
        catch (Exception var5) {
            var5.printStackTrace();
        }
        if (2 >= 3) {
            return (0x23 ^ 0x75) & ~(0xCA ^ 0x9C);
        }
        return lIIIlllIllllI[18];
    }

    private static boolean lIlIIlIlIIIllIl(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    private static void bm() {
        void var6;
        BankLocation bankLocation = BankLocation.getNearest();
        if (v.lIlIIlIlIIIlIll(bankLocation) && v.lIlIIlIlIIIlIIl(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRat.c = lIIIlllIlllIl[lIIIlllIllllI[21]];
            a.a(bankLocation);
            Time.sleepTicks((int)lIIIlllIllllI[3]);

        }
        if (v.lIlIIlIlIIIlIll(var6) && v.lIlIIlIlIIIIlll(var6.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRat.c = lIIIlllIlllIl[lIIIlllIllllI[22]];
            if (v.lIlIIlIlIIIlIIl(Bank.isOpen() ? 1 : 0)) {
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIlllIllllI[7]);

            }
            if (v.lIlIIlIlIIIIlll(Bank.isOpen() ? 1 : 0)) {
                if (v.lIlIIlIlIIIlIlI(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)lIIIlllIllllI[6]);

                }
                if (v.lIlIIlIlIIIlIlI(Equipment.getAll().size())) {
                    Bank.depositEquipment();
                    Time.sleepTicks((int)lIIIlllIllllI[3]);

                }
                int[] nArray = new int[lIIIlllIllllI[6]];
                nArray[v.lIIIlllIllllI[0]] = lIIIlllIllllI[11];
                nArray[v.lIIIlllIllllI[1]] = lIIIlllIllllI[10];
                nArray[v.lIIIlllIllllI[3]] = lIIIlllIllllI[8];
                nArray[v.lIIIlllIllllI[5]] = lIIIlllIllllI[13];
                if (v.lIlIIlIlIIIlIIl(e.b(nArray) ? 1 : 0)) {
                    v.W();
                    System.out.println(lIIIlllIlllIl[lIIIlllIllllI[23]]);
                    by = lIIIlllIllllI[1];
                    return;
                }
                int[] nArray2 = new int[lIIIlllIllllI[6]];
                nArray2[v.lIIIlllIllllI[0]] = lIIIlllIllllI[11];
                nArray2[v.lIIIlllIllllI[1]] = lIIIlllIllllI[10];
                nArray2[v.lIIIlllIllllI[3]] = lIIIlllIllllI[8];
                nArray2[v.lIIIlllIllllI[5]] = lIIIlllIllllI[13];
                if (v.lIlIIlIlIIIIlll(e.b(nArray2) ? 1 : 0)) {
                    a.a(lIIIlllIllllI[11], lIIIlllIllllI[6]);
                    a.a(lIIIlllIllllI[10], lIIIlllIllllI[3]);
                    a.a(lIIIlllIllllI[8], lIIIlllIllllI[9]);
                    a.a(lIIIlllIllllI[13], lIIIlllIllllI[1]);
                }
                a.b(f.bk, lIIIlllIllllI[1]);
            }
        }
    }

    @Override
    public String Z() {
        return lIIIlllIlllIl[lIIIlllIllllI[30]];
    }
}

