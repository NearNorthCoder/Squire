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
package gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks;

import gg.squire.account.AccBuilderShamans;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.K;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.ZHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.AHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.BHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.DHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.EHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.FHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.GHelper;
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

public class EHelper
implements K {
    
    private static final  String[] iE;
    public static final  int iB;
    public static final  WorldPoint iD;
    static  int cA;
    public static  List<d> bp;
    public static  boolean bn;
    public static final  int iC;
    public static  WorldPoint iF;
    static  int dc;
    public static final  int iA;
    
    static  boolean dd;

    @Override
    public int ad() {
        try {
            E.cc();

        }
        catch (Exception var1) {
            var1.printStackTrace();
        }
        if (((0x42 ^ 0xC ^ (0xD0 ^ 0xBB)) & (0xE1 ^ 0xB6 ^ (0xEC ^ 0x9E) ^ -1)) == 2) {
            return (0x6F ^ 0x5F ^ 1) & (0x10 ^ 0x7A ^ (0xF7 ^ 0xAC) ^ -1);
        }
        return lIlllIlIll[21];
    }

    private static boolean lIIllllIIIIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIIllllIIIlll(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public boolean ac() {
        return lIlllIlIll[0];
    }

    @Override
    public boolean af() {
        boolean bl;
        if (E.lIIllllIIlIII(e.j(lIlllIlIll[3]), lIlllIlIll[4])) {
            bl = lIlllIlIll[1];

            if ((0x7E ^ 0x7A) <= ((0xA9 ^ 0x89) & ~(0x39 ^ 0x19))) {
                return false;
            }
        } else {
            bl = lIlllIlIll[0];
        }
        return bl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean al() {
        int n2;
        int[] nArray = new int[lIlllIlIll[1]];
        nArray[E.lIlllIlIll[0]] = lIlllIlIll[7];
        if (E.lIIllllIIIllI(Inventory.getCount((int[])nArray))) {
            int[] nArray2 = new int[lIlllIlIll[1]];
            nArray2[E.lIlllIlIll[0]] = lIlllIlIll[9];
            if (E.lIIllllIIIllI(Inventory.getCount((int[])nArray2))) {
                int[] nArray3 = new int[lIlllIlIll[1]];
                nArray3[E.lIlllIlIll[0]] = lIlllIlIll[8];
                if (E.lIIllllIIIllI(Inventory.getCount((int[])nArray3))) {
                    n2 = lIlllIlIll[1];

                    if (((0x94 ^ 0xA5 ^ (0xC0 ^ 0xC7)) & (0xAA ^ 0x82 ^ (0x7C ^ 0x62) ^ -1)) >= 0) return n2 != 0;
                    return ((0xAC ^ 0x87 ^ (0x45 ^ 0x25)) & (88 + 77 - 68 + 39 ^ 88 + 97 - 99 + 109 ^ -1)) != 0;
                }
            }
        }
        n2 = lIlllIlIll[0];
        return n2 != 0;
    }

    private static boolean lIIllllIIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public String ae() {
        return lIlllIlIlI[lIlllIlIll[22]];
    }

    private static boolean lIIllllIIIlIl(Object object) {
        return object != null;
    }

    private static boolean lIIllllIIlIII(int n2, int n3) {
        return n2 >= n3;
    }

    public static void cc() {
        if (E.lIIllllIIIIIl(bn ? 1 : 0)) {
            AccBuilderShamans.c = lIlllIlIlI[lIlllIlIll[0]];
            b.a(bp);
            if (E.lIIllllIIIIlI(bp.size(), lIlllIlIll[1])) {
                System.out.println(lIlllIlIlI[lIlllIlIll[1]]);
                bn = lIlllIlIll[0];
            }
        }
        if (E.lIIllllIIIIll(bn ? 1 : 0)) {
            if (E.lIIllllIIIIll(E.al() ? 1 : 0) && E.lIIllllIIIlII(Players.getLocal().getWorldLocation().distanceTo(iD), lIlllIlIll[2]) && E.lIIllllIIIIlI(e.j(lIlllIlIll[3]), lIlllIlIll[4])) {
                BankLocation var2 = BankLocation.getNearest();
                if (E.lIIllllIIIlIl(var2) && E.lIIllllIIIIll(var2.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIlllIlIlI[lIlllIlIll[4]];
                    a.a(var2);
                }
                if (E.lIIllllIIIlIl(var2) && E.lIIllllIIIIIl(var2.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIlllIlIlI[lIlllIlIll[5]];
                    if (E.lIIllllIIIIll(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIlllIlIll[6]);

                    }
                    if (E.lIIllllIIIIIl(Bank.isOpen() ? 1 : 0)) {
                        if (E.lIIllllIIIllI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIlllIlIll[2]);

                        }
                        if (E.lIIllllIIIllI(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIlllIlIll[4]);

                        }
                        int[] nArray = new int[lIlllIlIll[2]];
                        nArray[E.lIlllIlIll[0]] = lIlllIlIll[7];
                        nArray[E.lIlllIlIll[1]] = lIlllIlIll[8];
                        nArray[E.lIlllIlIll[4]] = lIlllIlIll[9];
                        nArray[E.lIlllIlIll[5]] = lIlllIlIll[10];
                        if (E.lIIllllIIIIll(e.b(nArray) ? 1 : 0)) {
                            E.O();
                            System.out.println(lIlllIlIlI[lIlllIlIll[2]]);
                            bn = lIlllIlIll[1];
                            return;
                        }
                        if (E.lIIllllIIIIIl(AccBuilderShamans.e ? 1 : 0)) {
                            a.b(f.be, lIlllIlIll[1]);
                        }
                        int[] nArray2 = new int[lIlllIlIll[2]];
                        nArray2[E.lIlllIlIll[0]] = lIlllIlIll[7];
                        nArray2[E.lIlllIlIll[1]] = lIlllIlIll[8];
                        nArray2[E.lIlllIlIll[4]] = lIlllIlIll[9];
                        nArray2[E.lIlllIlIll[5]] = lIlllIlIll[10];
                        if (E.lIIllllIIIIIl(e.b(nArray2) ? 1 : 0)) {
                            int[] nArray3 = new int[lIlllIlIll[2]];
                            nArray3[E.lIlllIlIll[0]] = lIlllIlIll[7];
                            nArray3[E.lIlllIlIll[1]] = lIlllIlIll[8];
                            nArray3[E.lIlllIlIll[4]] = lIlllIlIll[9];
                            nArray3[E.lIlllIlIll[5]] = lIlllIlIll[10];
                            a.a(nArray3);
                        }
                    }
                }
            }
            if ((!E.lIIllllIIIIll(E.al() ? 1 : 0) || E.lIIllllIIIlll(Players.getLocal().getWorldLocation().distanceTo(iD), lIlllIlIll[2])) && E.lIIllllIIIIlI(e.j(lIlllIlIll[3]), lIlllIlIll[4])) {
                AccBuilderShamans.c = lIlllIlIlI[lIlllIlIll[11]];
                if (E.lIIllllIIIlII(Players.getLocal().getWorldLocation().distanceTo(iD), lIlllIlIll[5])) {
                    dc = lIlllIlIll[0];
                    Movement.walkTo((WorldPoint)iD);

                }
                if (E.lIIllllIIIlll(Players.getLocal().getWorldLocation().distanceTo(iD), lIlllIlIll[5])) {
                    if (E.lIIllllIIIIlI(dc, lIlllIlIll[1])) {
                        Z.on += lIlllIlIll[1];
                        Z.p(AccBuilderShamans.m);
                        dc += lIlllIlIll[1];
                        Z.on = lIlllIlIll[0];
                        dd = lIlllIlIll[0];
                    }
                    AccBuilderShamans.c = lIlllIlIlI[lIlllIlIll[12]];
                    if (E.lIIllllIIIIlI(cA, lIlllIlIll[1])) {
                        e.v();
                        cA += lIlllIlIll[1];
                    }
                    g.a(lIlllIlIlI[lIlllIlIll[13]], iE);
                }
            }
            g.a(new String[lIlllIlIll[0]]);
        }
    }

        return String.valueOf(var3);
    }

    private static boolean lIIllllIIIIll(int n2) {
        return n2 == 0;
    }

    static {
        E.lIIllllIIIIII();
        E.lIIlllIllllll();
        iC = lIlllIlIll[7];
        iA = lIlllIlIll[9];
        iB = lIlllIlIll[8];
        iD = new WorldPoint(lIlllIlIll[24], lIlllIlIll[25], lIlllIlIll[0]);
        String[] stringArray = new String[lIlllIlIll[11]];
        stringArray[E.lIlllIlIll[0]] = lIlllIlIlI[lIlllIlIll[14]];
        stringArray[E.lIlllIlIll[1]] = lIlllIlIlI[lIlllIlIll[26]];
        stringArray[E.lIlllIlIll[4]] = lIlllIlIlI[lIlllIlIll[27]];
        stringArray[E.lIlllIlIll[5]] = lIlllIlIlI[lIlllIlIll[28]];
        stringArray[E.lIlllIlIll[2]] = lIlllIlIlI[lIlllIlIll[29]];
        iE = stringArray;
        iF = new WorldPoint(lIlllIlIll[30], lIlllIlIll[31], lIlllIlIll[4]);
        bp = new ArrayList<d>();
        cA = lIlllIlIll[0];
    }

    private static boolean lIIllllIIIlII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIllllIIIllI(int n2) {
        return n2 > 0;
    }

    private static void lIIlllIllllll() {
        lIlllIlIlI = new String[lIlllIlIll[32]];
        E.lIlllIlIlI[E.lIlllIlIll[0]] = "Buying items";
        E.lIlllIlIlI[E.lIlllIlIll[1]] = "Finished buying items, switching back to quest";
        E.lIlllIlIlI[E.lIlllIlIll[4]] = "Walking to bank";
        E.lIlllIlIlI[E.lIlllIlIll[5]] = "Handling banking";
        E.lIlllIlIlI[E.lIlllIlIll[2]] = "We are missing quest supplies, switching to BUYING";
        E.lIlllIlIlI[E.lIlllIlIll[11]] = "Nav to start";
        E.lIlllIlIlI[E.lIlllIlIll[12]] = "Handling dialog";
        E.lIlllIlIlI[E.lIlllIlIll[13]] = "Cook";
        E.lIlllIlIlI[E.lIlllIlIll[22]] = "Cooks Assistant Quest";
        E.lIlllIlIlI[E.lIlllIlIll[23]] = "ring of wealth (";
        E.lIlllIlIlI[E.lIlllIlIll[14]] = "Can you make me a cake?";
        E.lIlllIlIlI[E.lIlllIlIll[26]] = "I'm always happy to help a cook in distress.";
        E.lIlllIlIlI[E.lIlllIlIll[27]] = "Actually, I know where to find this stuff.";
        E.lIlllIlIlI[E.lIlllIlIll[28]] = "Yes.";
        E.lIlllIlIlI[E.lIlllIlIll[29]] = "What's wrong?";
    }

    private static void O() {
        d var4;
        Object var5;
        int[] nArray = new int[lIlllIlIll[1]];
        nArray[E.lIlllIlIll[0]] = lIlllIlIll[9];
        if (E.lIIllllIIIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new DHelper(lIlllIlIll[9], lIlllIlIll[1], lIlllIlIll[6]);
            bp.add(d2);

        }
        int[] nArray2 = new int[lIlllIlIll[1]];
        nArray2[E.lIlllIlIll[0]] = lIlllIlIll[8];
        if (E.lIIllllIIIIll(Bank.contains((int[])nArray2) ? 1 : 0)) {
            var5 = new DHelper(lIlllIlIll[8], lIlllIlIll[1], lIlllIlIll[6]);
            bp.add((DHelper) ar5);

        }
        int[] nArray3 = new int[lIlllIlIll[1]];
        nArray3[E.lIlllIlIll[0]] = lIlllIlIll[7];
        if (E.lIIllllIIIIll(Bank.contains((int[])nArray3) ? 1 : 0)) {
            var5 = new DHelper(lIlllIlIll[7], lIlllIlIll[1], lIlllIlIll[6]);
            bp.add((DHelper) ar5);

        }
        int[] nArray4 = new int[lIlllIlIll[1]];
        nArray4[E.lIlllIlIll[0]] = lIlllIlIll[10];
        if (E.lIIllllIIIIll(Bank.contains((int[])nArray4) ? 1 : 0)) {
            var5 = new DHelper(lIlllIlIll[10], lIlllIlIll[14], lIlllIlIll[15]);
            bp.add((DHelper) ar5);

        }
        if (E.lIIllllIIIIll(Bank.contains((Predicate)(var5 = item -> item.getName().toLowerCase().contains(lIlllIlIlI[lIlllIlIll[23]]))) ? 1 : 0)) {
            var4 = new DHelper(lIlllIlIll[16], lIlllIlIll[11], lIlllIlIll[17]);
            bp.add(var4);

        }
        int[] nArray5 = new int[lIlllIlIll[1]];
        nArray5[E.lIlllIlIll[0]] = lIlllIlIll[18];
        if (E.lIIllllIIIIll(Bank.contains((int[])nArray5) ? 1 : 0)) {
            var4 = new DHelper(lIlllIlIll[18], lIlllIlIll[19], lIlllIlIll[20]);
            bp.add(var4);

        }
    }
}

