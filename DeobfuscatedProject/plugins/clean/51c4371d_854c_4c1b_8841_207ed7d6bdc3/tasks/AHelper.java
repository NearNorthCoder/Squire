/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 */
package gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks;

import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.F;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.QHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.AHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.BHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.DHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.EHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.FHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.GHelper;
import gg.squire.account.AccBuilderBarrows;
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
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;

public class AHelper
implements F {
    public static final  WorldPoint hN;
    private static final  String[] hO;
    public static final  int hL;
    public static  WorldPoint hP;
    public static  List<d> bB;
    public static  boolean bz;
    public static final  int hK;
    static  boolean cj;
    static  int ci;

    static  int bZ;
    public static final  int hM;

    private static boolean llIlIlIlIlI(int n2) {
        return n2 == 0;
    }

    private static boolean llIlIlIllll(int n2, int n3) {
        return n2 >= n3;
    }

    static {
        A.llIlIlIIlll();
        A.llIlIlIIllI();
        hL = lIIIIIIIl[8];
        hK = lIIIIIIIl[9];
        hM = lIIIIIIIl[7];
        hN = new WorldPoint(lIIIIIIIl[24], lIIIIIIIl[25], lIIIIIIIl[0]);
        String[] stringArray = new String[lIIIIIIIl[11]];
        stringArray[A.lIIIIIIIl[0]] = lIIIIIIII[lIIIIIIIl[14]];
        stringArray[A.lIIIIIIIl[1]] = lIIIIIIII[lIIIIIIIl[26]];
        stringArray[A.lIIIIIIIl[4]] = lIIIIIIII[lIIIIIIIl[27]];
        stringArray[A.lIIIIIIIl[5]] = lIIIIIIII[lIIIIIIIl[28]];
        stringArray[A.lIIIIIIIl[2]] = lIIIIIIII[lIIIIIIIl[29]];
        hO = stringArray;
        hP = new WorldPoint(lIIIIIIIl[30], lIIIIIIIl[31], lIIIIIIIl[4]);
        bB = new ArrayList<d>();
        bZ = lIIIIIIIl[0];
    }

    private static void ag() {
        d lIIlIllIlllIIlI;
        Object lIIlIllIlllIIll;
        int[] nArray = new int[lIIIIIIIl[1]];
        nArray[A.lIIIIIIIl[0]] = lIIIIIIIl[9];
        if (A.llIlIlIlIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new DHelper(lIIIIIIIl[9], lIIIIIIIl[1], lIIIIIIIl[6]);
            bB.add(d2);

        }
        int[] nArray2 = new int[lIIIIIIIl[1]];
        nArray2[A.lIIIIIIIl[0]] = lIIIIIIIl[8];
        if (A.llIlIlIlIlI(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lIIlIllIlllIIll = new DHelper(lIIIIIIIl[8], lIIIIIIIl[1], lIIIIIIIl[6]);
            bB.add((DHelper) IIlIllIlllIIll);

        }
        int[] nArray3 = new int[lIIIIIIIl[1]];
        nArray3[A.lIIIIIIIl[0]] = lIIIIIIIl[7];
        if (A.llIlIlIlIlI(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lIIlIllIlllIIll = new DHelper(lIIIIIIIl[7], lIIIIIIIl[1], lIIIIIIIl[6]);
            bB.add((DHelper) IIlIllIlllIIll);

        }
        int[] nArray4 = new int[lIIIIIIIl[1]];
        nArray4[A.lIIIIIIIl[0]] = lIIIIIIIl[10];
        if (A.llIlIlIlIlI(Bank.contains((int[])nArray4) ? 1 : 0)) {
            lIIlIllIlllIIll = new DHelper(lIIIIIIIl[10], lIIIIIIIl[14], lIIIIIIIl[15]);
            bB.add((DHelper) IIlIllIlllIIll);

        }
        if (A.llIlIlIlIlI(Bank.contains((Predicate)(lIIlIllIlllIIll = item -> item.getName().toLowerCase().contains(lIIIIIIII[lIIIIIIIl[23]]))) ? 1 : 0)) {
            lIIlIllIlllIIlI = new DHelper(lIIIIIIIl[16], lIIIIIIIl[11], lIIIIIIIl[17]);
            bB.add(lIIlIllIlllIIlI);

        }
        int[] nArray5 = new int[lIIIIIIIl[1]];
        nArray5[A.lIIIIIIIl[0]] = lIIIIIIIl[18];
        if (A.llIlIlIlIlI(Bank.contains((int[])nArray5) ? 1 : 0)) {
            lIIlIllIlllIIlI = new DHelper(lIIIIIIIl[18], lIIIIIIIl[19], lIIIIIIIl[20]);
            bB.add(lIIlIllIlllIIlI);

        }
    }

    private static boolean llIlIlIlIII(int n2) {
        return n2 != 0;
    }

    private static boolean llIlIlIllII(Object object) {
        return object != null;
    }

    public static void bD() {
        if (A.llIlIlIlIII(bz ? 1 : 0)) {
            AccBuilderBarrows.c = lIIIIIIII[lIIIIIIIl[0]];
            b.a(bB);
            if (A.llIlIlIlIIl(bB.size(), lIIIIIIIl[1])) {
                System.out.println(lIIIIIIII[lIIIIIIIl[1]]);
                bz = lIIIIIIIl[0];
            }
        }
        if (A.llIlIlIlIlI(bz ? 1 : 0)) {
            if (A.llIlIlIlIlI(A.ac() ? 1 : 0) && A.llIlIlIlIll(Players.getLocal().getWorldLocation().distanceTo(hN), lIIIIIIIl[2]) && A.llIlIlIlIIl(e.j(lIIIIIIIl[3]), lIIIIIIIl[4])) {
                BankLocation lIIlIllIlllIllI = BankLocation.getNearest();
                if (A.llIlIlIllII(lIIlIllIlllIllI) && A.llIlIlIlIlI(lIIlIllIlllIllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderBarrows.c = lIIIIIIII[lIIIIIIIl[4]];
                    a.a(lIIlIllIlllIllI);
                }
                if (A.llIlIlIllII(lIIlIllIlllIllI) && A.llIlIlIlIII(lIIlIllIlllIllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderBarrows.c = lIIIIIIII[lIIIIIIIl[5]];
                    if (A.llIlIlIlIlI(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIIIIIl[6]);

                    }
                    if (A.llIlIlIlIII(Bank.isOpen() ? 1 : 0)) {
                        if (A.llIlIlIllIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIIIIIIIl[2]);

                        }
                        if (A.llIlIlIllIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIIIIIIIl[4]);

                        }
                        int[] nArray = new int[lIIIIIIIl[2]];
                        nArray[A.lIIIIIIIl[0]] = lIIIIIIIl[7];
                        nArray[A.lIIIIIIIl[1]] = lIIIIIIIl[8];
                        nArray[A.lIIIIIIIl[4]] = lIIIIIIIl[9];
                        nArray[A.lIIIIIIIl[5]] = lIIIIIIIl[10];
                        if (A.llIlIlIlIlI(e.b(nArray) ? 1 : 0)) {
                            A.ag();
                            System.out.println(lIIIIIIII[lIIIIIIIl[2]]);
                            bz = lIIIIIIIl[1];
                            return;
                        }
                        if (A.llIlIlIlIII(AccBuilderBarrows.e ? 1 : 0)) {
                            a.b(f.bl, lIIIIIIIl[1]);
                        }
                        int[] nArray2 = new int[lIIIIIIIl[2]];
                        nArray2[A.lIIIIIIIl[0]] = lIIIIIIIl[7];
                        nArray2[A.lIIIIIIIl[1]] = lIIIIIIIl[8];
                        nArray2[A.lIIIIIIIl[4]] = lIIIIIIIl[9];
                        nArray2[A.lIIIIIIIl[5]] = lIIIIIIIl[10];
                        if (A.llIlIlIlIII(e.b(nArray2) ? 1 : 0)) {
                            int[] nArray3 = new int[lIIIIIIIl[2]];
                            nArray3[A.lIIIIIIIl[0]] = lIIIIIIIl[7];
                            nArray3[A.lIIIIIIIl[1]] = lIIIIIIIl[8];
                            nArray3[A.lIIIIIIIl[4]] = lIIIIIIIl[9];
                            nArray3[A.lIIIIIIIl[5]] = lIIIIIIIl[10];
                            a.a(nArray3);
                        }
                    }
                }
            }
            if ((!A.llIlIlIlIlI(A.ac() ? 1 : 0) || A.llIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(hN), lIIIIIIIl[2])) && A.llIlIlIlIIl(e.j(lIIIIIIIl[3]), lIIIIIIIl[4])) {
                AccBuilderBarrows.c = lIIIIIIII[lIIIIIIIl[11]];
                if (A.llIlIlIlIll(Players.getLocal().getWorldLocation().distanceTo(hN), lIIIIIIIl[5])) {
                    ci = lIIIIIIIl[0];
                    Movement.walkTo((WorldPoint)hN);

                }
                if (A.llIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(hN), lIIIIIIIl[5])) {
                    if (A.llIlIlIlIIl(ci, lIIIIIIIl[1])) {
                        Q.mC += lIIIIIIIl[1];
                        Q.o(AccBuilderBarrows.m);
                        ci += lIIIIIIIl[1];
                        Q.mC = lIIIIIIIl[0];
                        cj = lIIIIIIIl[0];
                    }
                    AccBuilderBarrows.c = lIIIIIIII[lIIIIIIIl[12]];
                    if (A.llIlIlIlIIl(bZ, lIIIIIIIl[1])) {
                        e.w();
                        bZ += lIIIIIIIl[1];
                    }
                    g.a(lIIIIIIII[lIIIIIIIl[13]], hO);
                }
            }
            g.a(new String[lIIIIIIIl[0]]);
        }
    }

    @Override
    public boolean W() {
        boolean bl;
        if (A.llIlIlIllll(e.j(lIIIIIIIl[3]), lIIIIIIIl[4])) {
            bl = lIIIIIIIl[1];

        } else {
            bl = lIIIIIIIl[0];
        }
        return bl;
    }

    @Override
    public String V() {
        return lIIIIIIII[lIIIIIIIl[22]];
    }

    private static void llIlIlIIllI() {
        lIIIIIIII = new String[lIIIIIIIl[32]];
        A.lIIIIIIII[A.lIIIIIIIl[0]] = "Buying items";
        A.lIIIIIIII[A.lIIIIIIIl[1]] = "Finished buying items, switching back to quest";
        A.lIIIIIIII[A.lIIIIIIIl[4]] = "Walking to bank";
        A.lIIIIIIII[A.lIIIIIIIl[5]] = "Handling banking";
        A.lIIIIIIII[A.lIIIIIIIl[2]] = "We are missing quest supplies, switching to BUYING";
        A.lIIIIIIII[A.lIIIIIIIl[11]] = "Nav to start";
        A.lIIIIIIII[A.lIIIIIIIl[12]] = "Handling dialog";
        A.lIIIIIIII[A.lIIIIIIIl[13]] = "Cook";
        A.lIIIIIIII[A.lIIIIIIIl[22]] = "Cooks Assistant Quest";
        A.lIIIIIIII[A.lIIIIIIIl[23]] = "ring of wealth (";
        A.lIIIIIIII[A.lIIIIIIIl[14]] = "Can you make me a cake?";
        A.lIIIIIIII[A.lIIIIIIIl[26]] = "I'm always happy to help a cook in distress.";
        A.lIIIIIIII[A.lIIIIIIIl[27]] = "Actually, I know where to find this stuff.";
        A.lIIIIIIII[A.lIIIIIIIl[28]] = "Yes.";
        A.lIIIIIIII[A.lIIIIIIIl[29]] = "What's wrong?";
    }

    private static boolean llIlIlIlllI(int n2, int n3) {
        return n2 <= n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ac() {
        int n2;
        int[] nArray = new int[lIIIIIIIl[1]];
        nArray[A.lIIIIIIIl[0]] = lIIIIIIIl[7];
        if (A.llIlIlIllIl(Inventory.getCount((int[])nArray))) {
            int[] nArray2 = new int[lIIIIIIIl[1]];
            nArray2[A.lIIIIIIIl[0]] = lIIIIIIIl[9];
            if (A.llIlIlIllIl(Inventory.getCount((int[])nArray2))) {
                int[] nArray3 = new int[lIIIIIIIl[1]];
                nArray3[A.lIIIIIIIl[0]] = lIIIIIIIl[8];
                if (A.llIlIlIllIl(Inventory.getCount((int[])nArray3))) {
                    n2 = lIIIIIIIl[1];

                    if (2 > -1) return n2 != 0;
                    return ((0xB6 ^ 0x86 ^ 118 + 110 - 140 + 39) & (39 + 181 - 207 + 217 ^ 109 + 121 - 85 + 24 ^ -1) & ((0x8C ^ 0xA9 ^ (0x74 ^ 0x14)) & (0xDC ^ 0x88 ^ (0x84 ^ 0x95) ^ -1) ^ -1)) != 0;
                }
            }
        }
        n2 = lIIIIIIIl[0];
        return n2 != 0;
    }

    @Override
    public boolean T() {
        return lIIIIIIIl[0];
    }

    private static boolean llIlIlIllIl(int n2) {
        return n2 > 0;
    }

    @Override
    public int U() {
        try {
            A.bD();

        }
        catch (Exception lIIlIllIlllIIII) {
            lIIlIllIlllIIII.printStackTrace();
        }
        if ((0x5C ^ 0x48 ^ (0x83 ^ 0x93)) < ((80 + 89 - 140 + 142 ^ 39 + 112 - 138 + 176) & (0x68 ^ 0x3C ^ (0x3D ^ 0x7F) ^ -1))) {
            return (0xD1 ^ 0x93 ^ (0x45 ^ 0x22)) & (0x88 ^ 0x98 ^ (0x78 ^ 0x4D) ^ -1);
        }
        return lIIIIIIIl[21];
    }

    private static boolean llIlIlIlIIl(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(lIIlIllIlIlIllI);
    }

    private static boolean llIlIlIlIll(int n2, int n3) {
        return n2 > n3;
    }
}

