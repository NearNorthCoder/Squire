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
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;

public class SHelper
implements M {
    
    static  boolean cp;
    public static final  int fp;
    public static  boolean by;
    public static  WorldPoint fu;
    
    public static  List<d> bA;
    static  int co;
    private static final  String[] ft;
    public static final  int fr;
    public static final  int fq;
    public static final  WorldPoint fs;
    static  int bY;

    private static boolean lIlIIlIIIIlIIII(Object object) {
        return object != null;
    }

    private static boolean lIlIIlIIIIlIIll(int n2, int n3) {
        return n2 >= n3;
    }

    private static void lIlIIlIIIIIlIlI() {
        lIIIlllIIllII = new String[lIIIlllIIlllI[32]];
        s.lIIIlllIIllII[s.lIIIlllIIlllI[0]] = "Buying items";
        s.lIIIlllIIllII[s.lIIIlllIIlllI[1]] = "Finished buying items, switching back to quest";
        s.lIIIlllIIllII[s.lIIIlllIIlllI[4]] = "Walking to bank";
        s.lIIIlllIIllII[s.lIIIlllIIlllI[5]] = "Handling banking";
        s.lIIIlllIIllII[s.lIIIlllIIlllI[2]] = "We are missing quest supplies, switching to BUYING";
        s.lIIIlllIIllII[s.lIIIlllIIlllI[11]] = "Nav to start";
        s.lIIIlllIIllII[s.lIIIlllIIlllI[12]] = "Handling dialog";
        s.lIIIlllIIllII[s.lIIIlllIIlllI[13]] = "Cook";
        s.lIIIlllIIllII[s.lIIIlllIIlllI[22]] = "Cooks Assistant Quest";
        s.lIIIlllIIllII[s.lIIIlllIIlllI[23]] = "ring of wealth (";
        s.lIIIlllIIllII[s.lIIIlllIIlllI[14]] = "Can you make me a cake?";
        s.lIIIlllIIllII[s.lIIIlllIIlllI[26]] = "I'm always happy to help a cook in distress.";
        s.lIIIlllIIllII[s.lIIIlllIIlllI[27]] = "Actually, I know where to find this stuff.";
        s.lIIIlllIIllII[s.lIIIlllIIlllI[28]] = "Yes.";
        s.lIIIlllIIllII[s.lIIIlllIIlllI[29]] = "What's wrong?";
    }

    @Override
    public boolean X() {
        return lIIIlllIIlllI[0];
    }

    @Override
    public boolean aa() {
        boolean bl;
        if (s.lIlIIlIIIIlIIll(e.j(lIIIlllIIlllI[3]), lIIIlllIIlllI[4])) {
            bl = lIIIlllIIlllI[1];

            if (1 == 0) {
                return false;
            }
        } else {
            bl = lIIIlllIIlllI[0];
        }
        return bl;
    }

    static {
        s.lIlIIlIIIIIlIll();
        s.lIlIIlIIIIIlIlI();
        fp = lIIIlllIIlllI[9];
        fr = lIIIlllIIlllI[7];
        fq = lIIIlllIIlllI[8];
        fs = new WorldPoint(lIIIlllIIlllI[24], lIIIlllIIlllI[25], lIIIlllIIlllI[0]);
        String[] stringArray = new String[lIIIlllIIlllI[11]];
        stringArray[s.lIIIlllIIlllI[0]] = lIIIlllIIllII[lIIIlllIIlllI[14]];
        stringArray[s.lIIIlllIIlllI[1]] = lIIIlllIIllII[lIIIlllIIlllI[26]];
        stringArray[s.lIIIlllIIlllI[4]] = lIIIlllIIllII[lIIIlllIIlllI[27]];
        stringArray[s.lIIIlllIIlllI[5]] = lIIIlllIIllII[lIIIlllIIlllI[28]];
        stringArray[s.lIIIlllIIlllI[2]] = lIIIlllIIllII[lIIIlllIIlllI[29]];
        ft = stringArray;
        fu = new WorldPoint(lIIIlllIIlllI[30], lIIIlllIIlllI[31], lIIIlllIIlllI[4]);
        bA = new ArrayList<d>();
        bY = lIIIlllIIlllI[0];
    }

    private static boolean lIlIIlIIIIIllll(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public int Y() {
        try {
            s.be();

        }
        catch (Exception var1) {
            var1.printStackTrace();
        }
        if (3 <= 0) {
            return (113 + 203 - 169 + 94 ^ 94 + 164 - 233 + 154) & (0x69 ^ 0x59 ^ (0xEB ^ 0x99) ^ -1);
        }
        return lIIIlllIIlllI[21];
    }

        return String.valueOf(var2);
    }

    public static void be() {
        if (s.lIlIIlIIIIIllII(by ? 1 : 0)) {
            AccBuilderRat.c = lIIIlllIIllII[lIIIlllIIlllI[0]];
            b.a(bA);
            if (s.lIlIIlIIIIIllIl(bA.size(), lIIIlllIIlllI[1])) {
                System.out.println(lIIIlllIIllII[lIIIlllIIlllI[1]]);
                by = lIIIlllIIlllI[0];
            }
        }
        if (s.lIlIIlIIIIIlllI(by ? 1 : 0)) {
            if (s.lIlIIlIIIIIlllI(s.S() ? 1 : 0) && s.lIlIIlIIIIIllll(Players.getLocal().getWorldLocation().distanceTo(fs), lIIIlllIIlllI[2]) && s.lIlIIlIIIIIllIl(e.j(lIIIlllIIlllI[3]), lIIIlllIIlllI[4])) {
                BankLocation var3 = BankLocation.getNearest();
                if (s.lIlIIlIIIIlIIII(var3) && s.lIlIIlIIIIIlllI(var3.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRat.c = lIIIlllIIllII[lIIIlllIIlllI[4]];
                    a.a(var3);
                }
                if (s.lIlIIlIIIIlIIII(var3) && s.lIlIIlIIIIIllII(var3.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRat.c = lIIIlllIIllII[lIIIlllIIlllI[5]];
                    if (s.lIlIIlIIIIIlllI(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIlllIIlllI[6]);

                    }
                    if (s.lIlIIlIIIIIllII(Bank.isOpen() ? 1 : 0)) {
                        if (s.lIlIIlIIIIlIIIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIIIlllIIlllI[2]);

                        }
                        if (s.lIlIIlIIIIlIIIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIIIlllIIlllI[4]);

                        }
                        int[] nArray = new int[lIIIlllIIlllI[2]];
                        nArray[s.lIIIlllIIlllI[0]] = lIIIlllIIlllI[7];
                        nArray[s.lIIIlllIIlllI[1]] = lIIIlllIIlllI[8];
                        nArray[s.lIIIlllIIlllI[4]] = lIIIlllIIlllI[9];
                        nArray[s.lIIIlllIIlllI[5]] = lIIIlllIIlllI[10];
                        if (s.lIlIIlIIIIIlllI(e.b(nArray) ? 1 : 0)) {
                            s.W();
                            System.out.println(lIIIlllIIllII[lIIIlllIIlllI[2]]);
                            by = lIIIlllIIlllI[1];
                            return;
                        }
                        if (s.lIlIIlIIIIIllII(AccBuilderRat.e ? 1 : 0)) {
                            a.b(f.bk, lIIIlllIIlllI[1]);
                        }
                        int[] nArray2 = new int[lIIIlllIIlllI[2]];
                        nArray2[s.lIIIlllIIlllI[0]] = lIIIlllIIlllI[7];
                        nArray2[s.lIIIlllIIlllI[1]] = lIIIlllIIlllI[8];
                        nArray2[s.lIIIlllIIlllI[4]] = lIIIlllIIlllI[9];
                        nArray2[s.lIIIlllIIlllI[5]] = lIIIlllIIlllI[10];
                        if (s.lIlIIlIIIIIllII(e.b(nArray2) ? 1 : 0)) {
                            int[] nArray3 = new int[lIIIlllIIlllI[2]];
                            nArray3[s.lIIIlllIIlllI[0]] = lIIIlllIIlllI[7];
                            nArray3[s.lIIIlllIIlllI[1]] = lIIIlllIIlllI[8];
                            nArray3[s.lIIIlllIIlllI[4]] = lIIIlllIIlllI[9];
                            nArray3[s.lIIIlllIIlllI[5]] = lIIIlllIIlllI[10];
                            a.a(nArray3);
                        }
                    }
                }
            }
            if ((!s.lIlIIlIIIIIlllI(s.S() ? 1 : 0) || s.lIlIIlIIIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(fs), lIIIlllIIlllI[2])) && s.lIlIIlIIIIIllIl(e.j(lIIIlllIIlllI[3]), lIIIlllIIlllI[4])) {
                AccBuilderRat.c = lIIIlllIIllII[lIIIlllIIlllI[11]];
                if (s.lIlIIlIIIIIllll(Players.getLocal().getWorldLocation().distanceTo(fs), lIIIlllIIlllI[5])) {
                    co = lIIIlllIIlllI[0];
                    Movement.walkTo((WorldPoint)fs);

                }
                if (s.lIlIIlIIIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(fs), lIIIlllIIlllI[5])) {
                    if (s.lIlIIlIIIIIllIl(co, lIIIlllIIlllI[1])) {
                        P.lD += lIIIlllIIlllI[1];
                        P.d(AccBuilderRat.m);
                        co += lIIIlllIIlllI[1];
                        P.lD = lIIIlllIIlllI[0];
                        cp = lIIIlllIIlllI[0];
                    }
                    AccBuilderRat.c = lIIIlllIIllII[lIIIlllIIlllI[12]];
                    if (s.lIlIIlIIIIIllIl(bY, lIIIlllIIlllI[1])) {
                        e.w();
                        bY += lIIIlllIIlllI[1];
                    }
                    g.a(lIIIlllIIllII[lIIIlllIIlllI[13]], ft);
                }
            }
            g.a(new String[lIIIlllIIlllI[0]]);
        }
    }

    private static boolean lIlIIlIIIIlIIIl(int n2) {
        return n2 > 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean S() {
        int n2;
        int[] nArray = new int[lIIIlllIIlllI[1]];
        nArray[s.lIIIlllIIlllI[0]] = lIIIlllIIlllI[7];
        if (s.lIlIIlIIIIlIIIl(Inventory.getCount((int[])nArray))) {
            int[] nArray2 = new int[lIIIlllIIlllI[1]];
            nArray2[s.lIIIlllIIlllI[0]] = lIIIlllIIlllI[9];
            if (s.lIlIIlIIIIlIIIl(Inventory.getCount((int[])nArray2))) {
                int[] nArray3 = new int[lIIIlllIIlllI[1]];
                nArray3[s.lIIIlllIIlllI[0]] = lIIIlllIIlllI[8];
                if (s.lIlIIlIIIIlIIIl(Inventory.getCount((int[])nArray3))) {
                    n2 = lIIIlllIIlllI[1];

                    if (1 != 0) return n2 != 0;
                    return ((0x26 ^ 0x2C) & ~(0x54 ^ 0x5E) & ~((0x2F ^ 0x4C) & ~(0xE9 ^ 0x8A))) != 0;
                }
            }
        }
        n2 = lIIIlllIIlllI[0];
        return n2 != 0;
    }

    private static boolean lIlIIlIIIIIllII(int n2) {
        return n2 != 0;
    }

    @Override
    public String Z() {
        return lIIIlllIIllII[lIIIlllIIlllI[22]];
    }

    private static void W() {
        d var4;
        Object var5;
        int[] nArray = new int[lIIIlllIIlllI[1]];
        nArray[s.lIIIlllIIlllI[0]] = lIIIlllIIlllI[9];
        if (s.lIlIIlIIIIIlllI(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new DHelper(lIIIlllIIlllI[9], lIIIlllIIlllI[1], lIIIlllIIlllI[6]);
            bA.add(d2);

        }
        int[] nArray2 = new int[lIIIlllIIlllI[1]];
        nArray2[s.lIIIlllIIlllI[0]] = lIIIlllIIlllI[8];
        if (s.lIlIIlIIIIIlllI(Bank.contains((int[])nArray2) ? 1 : 0)) {
            var5 = new DHelper(lIIIlllIIlllI[8], lIIIlllIIlllI[1], lIIIlllIIlllI[6]);
            bA.add((DHelper) ar5);

        }
        int[] nArray3 = new int[lIIIlllIIlllI[1]];
        nArray3[s.lIIIlllIIlllI[0]] = lIIIlllIIlllI[7];
        if (s.lIlIIlIIIIIlllI(Bank.contains((int[])nArray3) ? 1 : 0)) {
            var5 = new DHelper(lIIIlllIIlllI[7], lIIIlllIIlllI[1], lIIIlllIIlllI[6]);
            bA.add((DHelper) ar5);

        }
        int[] nArray4 = new int[lIIIlllIIlllI[1]];
        nArray4[s.lIIIlllIIlllI[0]] = lIIIlllIIlllI[10];
        if (s.lIlIIlIIIIIlllI(Bank.contains((int[])nArray4) ? 1 : 0)) {
            var5 = new DHelper(lIIIlllIIlllI[10], lIIIlllIIlllI[14], lIIIlllIIlllI[15]);
            bA.add((DHelper) ar5);

        }
        if (s.lIlIIlIIIIIlllI(Bank.contains((Predicate)(var5 = item -> item.getName().toLowerCase().contains(lIIIlllIIllII[lIIIlllIIlllI[23]]))) ? 1 : 0)) {
            var4 = new DHelper(lIIIlllIIlllI[16], lIIIlllIIlllI[11], lIIIlllIIlllI[17]);
            bA.add(var4);

        }
        int[] nArray5 = new int[lIIIlllIIlllI[1]];
        nArray5[s.lIIIlllIIlllI[0]] = lIIIlllIIlllI[18];
        if (s.lIlIIlIIIIIlllI(Bank.contains((int[])nArray5) ? 1 : 0)) {
            var4 = new DHelper(lIIIlllIIlllI[18], lIIIlllIIlllI[19], lIIIlllIIlllI[20]);
            bA.add(var4);

        }
    }

    private static boolean lIlIIlIIIIlIIlI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIlIIlIIIIIllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIlIIIIIlllI(int n2) {
        return n2 == 0;
    }
}

