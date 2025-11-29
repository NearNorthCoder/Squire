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
package gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks;

import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.G;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.UHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.AHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.BHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.DHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.EHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.FHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.GHelper;
import gg.squire.account.AccBuilderRogues;
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

public class BHelper
implements G {
    public static final  int hM;
    static  boolean cl;
    public static  WorldPoint hR;
    
    public static final  int hN;
    public static  boolean bt;
    public static  List<d> bv;
    private static final  String[] hQ;
    public static final  int hO;
    
    static  int ck;
    static  int bT;
    public static final  WorldPoint hP;

    @Override
    public String U() {
        return lIIIlIlIll[lIIIlIllII[22]];
    }

    private static boolean lllIllIIIllI(Object object) {
        return object != null;
    }

    @Override
    public boolean S() {
        return lIIIlIllII[0];
    }

    public static void bF() {
        if (B.lllIllIIIIlI(bt ? 1 : 0)) {
            AccBuilderRogues.c = lIIIlIlIll[lIIIlIllII[0]];
            b.a(bv);
            if (B.lllIllIIIIll(bv.size(), lIIIlIllII[1])) {
                System.out.println(lIIIlIlIll[lIIIlIllII[1]]);
                bt = lIIIlIllII[0];
            }
        }
        if (B.lllIllIIIlII(bt ? 1 : 0)) {
            if (B.lllIllIIIlII(B.ab() ? 1 : 0) && B.lllIllIIIlIl(Players.getLocal().getWorldLocation().distanceTo(hP), lIIIlIllII[2]) && B.lllIllIIIIll(e.j(lIIIlIllII[3]), lIIIlIllII[4])) {
                BankLocation lIIllllIIIlI = BankLocation.getNearest();
                if (B.lllIllIIIllI(lIIllllIIIlI) && B.lllIllIIIlII(lIIllllIIIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIIlIlIll[lIIIlIllII[4]];
                    a.a(lIIllllIIIlI);
                }
                if (B.lllIllIIIllI(lIIllllIIIlI) && B.lllIllIIIIlI(lIIllllIIIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIIlIlIll[lIIIlIllII[5]];
                    if (B.lllIllIIIlII(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIlIllII[6]);

                    }
                    if (B.lllIllIIIIlI(Bank.isOpen() ? 1 : 0)) {
                        if (B.lllIllIIIlll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIIIlIllII[2]);

                        }
                        if (B.lllIllIIIlll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIIIlIllII[4]);

                        }
                        int[] nArray = new int[lIIIlIllII[2]];
                        nArray[B.lIIIlIllII[0]] = lIIIlIllII[7];
                        nArray[B.lIIIlIllII[1]] = lIIIlIllII[8];
                        nArray[B.lIIIlIllII[4]] = lIIIlIllII[9];
                        nArray[B.lIIIlIllII[5]] = lIIIlIllII[10];
                        if (B.lllIllIIIlII(e.b(nArray) ? 1 : 0)) {
                            B.af();
                            System.out.println(lIIIlIlIll[lIIIlIllII[2]]);
                            bt = lIIIlIllII[1];
                            return;
                        }
                        if (B.lllIllIIIIlI(AccBuilderRogues.e ? 1 : 0)) {
                            a.b(f.bf, lIIIlIllII[1]);
                        }
                        int[] nArray2 = new int[lIIIlIllII[2]];
                        nArray2[B.lIIIlIllII[0]] = lIIIlIllII[7];
                        nArray2[B.lIIIlIllII[1]] = lIIIlIllII[8];
                        nArray2[B.lIIIlIllII[4]] = lIIIlIllII[9];
                        nArray2[B.lIIIlIllII[5]] = lIIIlIllII[10];
                        if (B.lllIllIIIIlI(e.b(nArray2) ? 1 : 0)) {
                            int[] nArray3 = new int[lIIIlIllII[2]];
                            nArray3[B.lIIIlIllII[0]] = lIIIlIllII[7];
                            nArray3[B.lIIIlIllII[1]] = lIIIlIllII[8];
                            nArray3[B.lIIIlIllII[4]] = lIIIlIllII[9];
                            nArray3[B.lIIIlIllII[5]] = lIIIlIllII[10];
                            a.a(nArray3);
                        }
                    }
                }
            }
            if ((!B.lllIllIIIlII(B.ab() ? 1 : 0) || B.lllIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(hP), lIIIlIllII[2])) && B.lllIllIIIIll(e.j(lIIIlIllII[3]), lIIIlIllII[4])) {
                AccBuilderRogues.c = lIIIlIlIll[lIIIlIllII[11]];
                if (B.lllIllIIIlIl(Players.getLocal().getWorldLocation().distanceTo(hP), lIIIlIllII[5])) {
                    ck = lIIIlIllII[0];
                    Movement.walkTo((WorldPoint)hP);

                }
                if (B.lllIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(hP), lIIIlIllII[5])) {
                    if (B.lllIllIIIIll(ck, lIIIlIllII[1])) {
                        U.mV += lIIIlIllII[1];
                        U.o(AccBuilderRogues.m);
                        ck += lIIIlIllII[1];
                        U.mV = lIIIlIllII[0];
                        cl = lIIIlIllII[0];
                    }
                    AccBuilderRogues.c = lIIIlIlIll[lIIIlIllII[12]];
                    if (B.lllIllIIIIll(bT, lIIIlIllII[1])) {
                        e.v();
                        bT += lIIIlIllII[1];
                    }
                    g.a(lIIIlIlIll[lIIIlIllII[13]], hQ);
                }
            }
            g.a(new String[lIIIlIllII[0]]);
        }
    }

    private static boolean lllIllIIIIll(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(lIIllIllIlIl);
    }

    private static boolean lllIllIIIIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lllIllIIIlII(int n2) {
        return n2 == 0;
    }

    private static void lllIllIIIIII() {
        lIIIlIlIll = new String[lIIIlIllII[32]];
        B.lIIIlIlIll[B.lIIIlIllII[0]] = "Buying items";
        B.lIIIlIlIll[B.lIIIlIllII[1]] = "Finished buying items, switching back to quest";
        B.lIIIlIlIll[B.lIIIlIllII[4]] = "Walking to bank";
        B.lIIIlIlIll[B.lIIIlIllII[5]] = "Handling banking";
        B.lIIIlIlIll[B.lIIIlIllII[2]] = "We are missing quest supplies, switching to BUYING";
        B.lIIIlIlIll[B.lIIIlIllII[11]] = "Nav to start";
        B.lIIIlIlIll[B.lIIIlIllII[12]] = "Handling dialog";
        B.lIIIlIlIll[B.lIIIlIllII[13]] = "Cook";
        B.lIIIlIlIll[B.lIIIlIllII[22]] = "Cooks Assistant Quest";
        B.lIIIlIlIll[B.lIIIlIllII[23]] = "ring of wealth (";
        B.lIIIlIlIll[B.lIIIlIllII[14]] = "Can you make me a cake?";
        B.lIIIlIlIll[B.lIIIlIllII[26]] = "I'm always happy to help a cook in distress.";
        B.lIIIlIlIll[B.lIIIlIllII[27]] = "Actually, I know where to find this stuff.";
        B.lIIIlIlIll[B.lIIIlIllII[28]] = "Yes.";
        B.lIIIlIlIll[B.lIIIlIllII[29]] = "What's wrong?";
    }

    private static boolean lllIllIIIlll(int n2) {
        return n2 > 0;
    }

    @Override
    public boolean V() {
        boolean bl;
        if (B.lllIllIIlIIl(e.j(lIIIlIllII[3]), lIIIlIllII[4])) {
            bl = lIIIlIllII[1];

            if (2 >= (0x41 ^ 0x45)) {
                return false;
            }
        } else {
            bl = lIIIlIllII[0];
        }
        return bl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ab() {
        int n2;
        int[] nArray = new int[lIIIlIllII[1]];
        nArray[B.lIIIlIllII[0]] = lIIIlIllII[7];
        if (B.lllIllIIIlll(Inventory.getCount((int[])nArray))) {
            int[] nArray2 = new int[lIIIlIllII[1]];
            nArray2[B.lIIIlIllII[0]] = lIIIlIllII[9];
            if (B.lllIllIIIlll(Inventory.getCount((int[])nArray2))) {
                int[] nArray3 = new int[lIIIlIllII[1]];
                nArray3[B.lIIIlIllII[0]] = lIIIlIllII[8];
                if (B.lllIllIIIlll(Inventory.getCount((int[])nArray3))) {
                    n2 = lIIIlIllII[1];

                    if (null == null) return n2 != 0;
                    return ((0x46 ^ 0x75 ^ (0x70 ^ 0x21)) & (0x41 ^ 0x22 ^ 1 ^ -1)) != 0;
                }
            }
        }
        n2 = lIIIlIllII[0];
        return n2 != 0;
    }

    static {
        B.lllIllIIIIIl();
        B.lllIllIIIIII();
        hM = lIIIlIllII[9];
        hN = lIIIlIllII[8];
        hO = lIIIlIllII[7];
        hP = new WorldPoint(lIIIlIllII[24], lIIIlIllII[25], lIIIlIllII[0]);
        String[] stringArray = new String[lIIIlIllII[11]];
        stringArray[B.lIIIlIllII[0]] = lIIIlIlIll[lIIIlIllII[14]];
        stringArray[B.lIIIlIllII[1]] = lIIIlIlIll[lIIIlIllII[26]];
        stringArray[B.lIIIlIllII[4]] = lIIIlIlIll[lIIIlIllII[27]];
        stringArray[B.lIIIlIllII[5]] = lIIIlIlIll[lIIIlIllII[28]];
        stringArray[B.lIIIlIllII[2]] = lIIIlIlIll[lIIIlIllII[29]];
        hQ = stringArray;
        hR = new WorldPoint(lIIIlIllII[30], lIIIlIllII[31], lIIIlIllII[4]);
        bv = new ArrayList<d>();
        bT = lIIIlIllII[0];
    }

    private static void af() {
        d lIIlllIllllI;
        Object lIIlllIlllll;
        int[] nArray = new int[lIIIlIllII[1]];
        nArray[B.lIIIlIllII[0]] = lIIIlIllII[9];
        if (B.lllIllIIIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new DHelper(lIIIlIllII[9], lIIIlIllII[1], lIIIlIllII[6]);
            bv.add(d2);

        }
        int[] nArray2 = new int[lIIIlIllII[1]];
        nArray2[B.lIIIlIllII[0]] = lIIIlIllII[8];
        if (B.lllIllIIIlII(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lIIlllIlllll = new DHelper(lIIIlIllII[8], lIIIlIllII[1], lIIIlIllII[6]);
            bv.add((DHelper) IIlllIlllll);

        }
        int[] nArray3 = new int[lIIIlIllII[1]];
        nArray3[B.lIIIlIllII[0]] = lIIIlIllII[7];
        if (B.lllIllIIIlII(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lIIlllIlllll = new DHelper(lIIIlIllII[7], lIIIlIllII[1], lIIIlIllII[6]);
            bv.add((DHelper) IIlllIlllll);

        }
        int[] nArray4 = new int[lIIIlIllII[1]];
        nArray4[B.lIIIlIllII[0]] = lIIIlIllII[10];
        if (B.lllIllIIIlII(Bank.contains((int[])nArray4) ? 1 : 0)) {
            lIIlllIlllll = new DHelper(lIIIlIllII[10], lIIIlIllII[14], lIIIlIllII[15]);
            bv.add((DHelper) IIlllIlllll);

        }
        if (B.lllIllIIIlII(Bank.contains((Predicate)(lIIlllIlllll = item -> item.getName().toLowerCase().contains(lIIIlIlIll[lIIIlIllII[23]]))) ? 1 : 0)) {
            lIIlllIllllI = new DHelper(lIIIlIllII[16], lIIIlIllII[11], lIIIlIllII[17]);
            bv.add(lIIlllIllllI);

        }
        int[] nArray5 = new int[lIIIlIllII[1]];
        nArray5[B.lIIIlIllII[0]] = lIIIlIllII[18];
        if (B.lllIllIIIlII(Bank.contains((int[])nArray5) ? 1 : 0)) {
            lIIlllIllllI = new DHelper(lIIIlIllII[18], lIIIlIllII[19], lIIIlIllII[20]);
            bv.add(lIIlllIllllI);

        }
    }

    @Override
    public int T() {
        try {
            B.bF();

        }
        catch (Exception lIIlllIlllII) {
            lIIlllIlllII.printStackTrace();
        }
        
        }
        return lIIIlIllII[21];
    }

    private static boolean lllIllIIlIII(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lllIllIIIlIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lllIllIIlIIl(int n2, int n3) {
        return n2 >= n3;
    }

}

