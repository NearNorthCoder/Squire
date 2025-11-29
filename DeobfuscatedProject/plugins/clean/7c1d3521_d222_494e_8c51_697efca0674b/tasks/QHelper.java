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

public class QHelper
implements ac {
    static  int di;
    static  boolean dj;
    public static  WorldPoint lF;
    static  int cG;
    public static  List<d> bv;
    private static final  String[] lE;
    public static final  int lB;
    public static final  WorldPoint lD;
    public static  boolean bt;

    public static final  int lA;
    public static final  int lC;

        return String.valueOf(var1);
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (Q.lIllIIIllIIlI(e.j(llIlIIlIII[3]), llIlIIlIII[4])) {
            bl = llIlIIlIII[1];

            if (2 < 0) {
                return false;
            }
        } else {
            bl = llIlIIlIII[0];
        }
        return bl;
    }

    private static boolean lIllIIIllIIII(int n2) {
        return n2 > 0;
    }

    private static boolean lIllIIIlIllll(Object object) {
        return object != null;
    }

    @Override
    public int af() {
        try {
            Q.ds();

        }
        catch (Exception var2) {
            var2.printStackTrace();
        }
        if (3 == 0) {
            return (5 + 8 - -144 + 25 ^ 100 + 2 - -9 + 61) & (0x73 ^ 0x56 ^ (9 ^ 0x36) ^ -1);
        }
        return llIlIIlIII[21];
    }

    private static void lIllIIIlIlIIl() {
        llIlIIIlll = new String[llIlIIlIII[32]];
        Q.llIlIIIlll[Q.llIlIIlIII[0]] = "Buying items";
        Q.llIlIIIlll[Q.llIlIIlIII[1]] = "Finished buying items, switching back to quest";
        Q.llIlIIIlll[Q.llIlIIlIII[4]] = "Walking to bank";
        Q.llIlIIIlll[Q.llIlIIlIII[5]] = "Handling banking";
        Q.llIlIIIlll[Q.llIlIIlIII[2]] = "We are missing quest supplies, switching to BUYING";
        Q.llIlIIIlll[Q.llIlIIlIII[11]] = "Nav to start";
        Q.llIlIIIlll[Q.llIlIIlIII[12]] = "Handling dialog";
        Q.llIlIIIlll[Q.llIlIIlIII[13]] = "Cook";
        Q.llIlIIIlll[Q.llIlIIlIII[22]] = "Cooks Assistant Quest";
        Q.llIlIIIlll[Q.llIlIIlIII[23]] = "ring of wealth (";
        Q.llIlIIIlll[Q.llIlIIlIII[14]] = "Can you make me a cake?";
        Q.llIlIIIlll[Q.llIlIIlIII[26]] = "I'm always happy to help a cook in distress.";
        Q.llIlIIIlll[Q.llIlIIlIII[27]] = "Actually, I know where to find this stuff.";
        Q.llIlIIIlll[Q.llIlIIlIII[28]] = "Yes.";
        Q.llIlIIIlll[Q.llIlIIlIII[29]] = "What's wrong?";
    }

    private static boolean lIllIIIllIIlI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIllIIIllIIIl(int n2, int n3) {
        return n2 <= n3;
    }

    public static void ds() {
        if (Q.lIllIIIlIlIll(bt ? 1 : 0)) {
            AccBuilderSotf.c = llIlIIIlll[llIlIIlIII[0]];
            b.a(bv);
            if (Q.lIllIIIlIllII(bv.size(), llIlIIlIII[1])) {
                System.out.println(llIlIIIlll[llIlIIlIII[1]]);
                bt = llIlIIlIII[0];
            }
        }
        if (Q.lIllIIIlIllIl(bt ? 1 : 0)) {
            if (Q.lIllIIIlIllIl(Q.an() ? 1 : 0) && Q.lIllIIIlIlllI(Players.getLocal().getWorldLocation().distanceTo(lD), llIlIIlIII[2]) && Q.lIllIIIlIllII(e.j(llIlIIlIII[3]), llIlIIlIII[4])) {
                BankLocation var3 = BankLocation.getNearest();
                if (Q.lIllIIIlIllll(var3) && Q.lIllIIIlIllIl(var3.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIlIIIlll[llIlIIlIII[4]];
                    a.a(var3);
                }
                if (Q.lIllIIIlIllll(var3) && Q.lIllIIIlIlIll(var3.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIlIIIlll[llIlIIlIII[5]];
                    if (Q.lIllIIIlIllIl(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)llIlIIlIII[6]);

                    }
                    if (Q.lIllIIIlIlIll(Bank.isOpen() ? 1 : 0)) {
                        if (Q.lIllIIIllIIII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)llIlIIlIII[2]);

                        }
                        if (Q.lIllIIIllIIII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)llIlIIlIII[4]);

                        }
                        int[] nArray = new int[llIlIIlIII[2]];
                        nArray[Q.llIlIIlIII[0]] = llIlIIlIII[7];
                        nArray[Q.llIlIIlIII[1]] = llIlIIlIII[8];
                        nArray[Q.llIlIIlIII[4]] = llIlIIlIII[9];
                        nArray[Q.llIlIIlIII[5]] = llIlIIlIII[10];
                        if (Q.lIllIIIlIllIl(e.c(nArray) ? 1 : 0)) {
                            Q.QHelper();
                            System.out.println(llIlIIIlll[llIlIIlIII[2]]);
                            bt = llIlIIlIII[1];
                            return;
                        }
                        if (Q.lIllIIIlIlIll(AccBuilderSotf.e ? 1 : 0)) {
                            a.b(f.bk, llIlIIlIII[1]);
                        }
                        int[] nArray2 = new int[llIlIIlIII[2]];
                        nArray2[Q.llIlIIlIII[0]] = llIlIIlIII[7];
                        nArray2[Q.llIlIIlIII[1]] = llIlIIlIII[8];
                        nArray2[Q.llIlIIlIII[4]] = llIlIIlIII[9];
                        nArray2[Q.llIlIIlIII[5]] = llIlIIlIII[10];
                        if (Q.lIllIIIlIlIll(e.c(nArray2) ? 1 : 0)) {
                            int[] nArray3 = new int[llIlIIlIII[2]];
                            nArray3[Q.llIlIIlIII[0]] = llIlIIlIII[7];
                            nArray3[Q.llIlIIlIII[1]] = llIlIIlIII[8];
                            nArray3[Q.llIlIIlIII[4]] = llIlIIlIII[9];
                            nArray3[Q.llIlIIlIII[5]] = llIlIIlIII[10];
                            a.a(nArray3);
                        }
                    }
                }
            }
            if ((!Q.lIllIIIlIllIl(Q.an() ? 1 : 0) || Q.lIllIIIllIIIl(Players.getLocal().getWorldLocation().distanceTo(lD), llIlIIlIII[2])) && Q.lIllIIIlIllII(e.j(llIlIIlIII[3]), llIlIIlIII[4])) {
                AccBuilderSotf.c = llIlIIIlll[llIlIIlIII[11]];
                if (Q.lIllIIIlIlllI(Players.getLocal().getWorldLocation().distanceTo(lD), llIlIIlIII[5])) {
                    di = llIlIIlIII[0];
                    Movement.walkTo((WorldPoint)lD);

                }
                if (Q.lIllIIIllIIIl(Players.getLocal().getWorldLocation().distanceTo(lD), llIlIIlIII[5])) {
                    if (Q.lIllIIIlIllII(di, llIlIIlIII[1])) {
                        aN.tg += llIlIIlIII[1];
                        aN.u(AccBuilderSotf.m);
                        di += llIlIIlIII[1];
                        aN.tg = llIlIIlIII[0];
                        dj = llIlIIlIII[0];
                    }
                    AccBuilderSotf.c = llIlIIIlll[llIlIIlIII[12]];
                    if (Q.lIllIIIlIllII(cG, llIlIIlIII[1])) {
                        e.x();
                        cG += llIlIIlIII[1];
                    }
                    g.a(llIlIIIlll[llIlIIlIII[13]], lE);
                }
            }
            g.a(new String[llIlIIlIII[0]]);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        int[] nArray = new int[llIlIIlIII[1]];
        nArray[Q.llIlIIlIII[0]] = llIlIIlIII[7];
        if (Q.lIllIIIllIIII(Inventory.getCount((int[])nArray))) {
            int[] nArray2 = new int[llIlIIlIII[1]];
            nArray2[Q.llIlIIlIII[0]] = llIlIIlIII[9];
            if (Q.lIllIIIllIIII(Inventory.getCount((int[])nArray2))) {
                int[] nArray3 = new int[llIlIIlIII[1]];
                nArray3[Q.llIlIIlIII[0]] = llIlIIlIII[8];
                if (Q.lIllIIIllIIII(Inventory.getCount((int[])nArray3))) {
                    n2 = llIlIIlIII[1];

                    if (-1 != 1) return n2 != 0;
                    return false;
                }
            }
        }
        n2 = llIlIIlIII[0];
        return n2 != 0;
    }

    private static boolean lIllIIIlIlIll(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean ae() {
        return llIlIIlIII[0];
    }

    private static void QHelper() {
        d var4;
        Object var5;
        int[] nArray = new int[llIlIIlIII[1]];
        nArray[Q.llIlIIlIII[0]] = llIlIIlIII[9];
        if (Q.lIllIIIlIllIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new DHelper(llIlIIlIII[9], llIlIIlIII[1], llIlIIlIII[6]);
            bv.add(d2);

        }
        int[] nArray2 = new int[llIlIIlIII[1]];
        nArray2[Q.llIlIIlIII[0]] = llIlIIlIII[8];
        if (Q.lIllIIIlIllIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
            var5 = new DHelper(llIlIIlIII[8], llIlIIlIII[1], llIlIIlIII[6]);
            bv.add((DHelper) ar5);

        }
        int[] nArray3 = new int[llIlIIlIII[1]];
        nArray3[Q.llIlIIlIII[0]] = llIlIIlIII[7];
        if (Q.lIllIIIlIllIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
            var5 = new DHelper(llIlIIlIII[7], llIlIIlIII[1], llIlIIlIII[6]);
            bv.add((DHelper) ar5);

        }
        int[] nArray4 = new int[llIlIIlIII[1]];
        nArray4[Q.llIlIIlIII[0]] = llIlIIlIII[10];
        if (Q.lIllIIIlIllIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
            var5 = new DHelper(llIlIIlIII[10], llIlIIlIII[14], llIlIIlIII[15]);
            bv.add((DHelper) ar5);

        }
        if (Q.lIllIIIlIllIl(Bank.contains((Predicate)(var5 = item -> item.getName().toLowerCase().contains(llIlIIIlll[llIlIIlIII[23]]))) ? 1 : 0)) {
            var4 = new DHelper(llIlIIlIII[16], llIlIIlIII[11], llIlIIlIII[17]);
            bv.add(var4);

        }
        int[] nArray5 = new int[llIlIIlIII[1]];
        nArray5[Q.llIlIIlIII[0]] = llIlIIlIII[18];
        if (Q.lIllIIIlIllIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
            var4 = new DHelper(llIlIIlIII[18], llIlIIlIII[19], llIlIIlIII[20]);
            bv.add(var4);

        }
    }

    static {
        Q.lIllIIIlIlIlI();
        Q.lIllIIIlIlIIl();
        lB = llIlIIlIII[8];
        lC = llIlIIlIII[7];
        lA = llIlIIlIII[9];
        lD = new WorldPoint(llIlIIlIII[24], llIlIIlIII[25], llIlIIlIII[0]);
        String[] stringArray = new String[llIlIIlIII[11]];
        stringArray[Q.llIlIIlIII[0]] = llIlIIIlll[llIlIIlIII[14]];
        stringArray[Q.llIlIIlIII[1]] = llIlIIIlll[llIlIIlIII[26]];
        stringArray[Q.llIlIIlIII[4]] = llIlIIIlll[llIlIIlIII[27]];
        stringArray[Q.llIlIIlIII[5]] = llIlIIIlll[llIlIIlIII[28]];
        stringArray[Q.llIlIIlIII[2]] = llIlIIIlll[llIlIIlIII[29]];
        lE = stringArray;
        lF = new WorldPoint(llIlIIlIII[30], llIlIIlIII[31], llIlIIlIII[4]);
        bv = new ArrayList<d>();
        cG = llIlIIlIII[0];
    }

    @Override
    public String ag() {
        return llIlIIIlll[llIlIIlIII[22]];
    }

    private static boolean lIllIIIlIlllI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIllIIIlIllII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIIIlIllIl(int n2) {
        return n2 == 0;
    }

}

