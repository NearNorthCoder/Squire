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
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;

public class ZHelper
implements S {
    public static  boolean bs;
    public static final  WorldPoint gu;
    public static final  int gt;
    
    static  boolean cl;
    public static final  int gs;
    public static final  int gr;
    public static  WorldPoint gw;
    
    public static  List<d> bu;
    static  int ck;
    private static final  String[] gv;
    static  int bS;

    private static void ae() {
        d var1;
        Object var2;
        int[] nArray = new int[llllIIIIII[1]];
        nArray[z.llllIIIIII[0]] = llllIIIIII[9];
        if (z.llIIlIllIIIII(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new DHelper(llllIIIIII[9], llllIIIIII[1], llllIIIIII[6]);
            bu.add(d2);

        }
        int[] nArray2 = new int[llllIIIIII[1]];
        nArray2[z.llllIIIIII[0]] = llllIIIIII[8];
        if (z.llIIlIllIIIII(Bank.contains((int[])nArray2) ? 1 : 0)) {
            var2 = new DHelper(llllIIIIII[8], llllIIIIII[1], llllIIIIII[6]);
            bu.add((DHelper) ar2);

        }
        int[] nArray3 = new int[llllIIIIII[1]];
        nArray3[z.llllIIIIII[0]] = llllIIIIII[7];
        if (z.llIIlIllIIIII(Bank.contains((int[])nArray3) ? 1 : 0)) {
            var2 = new DHelper(llllIIIIII[7], llllIIIIII[1], llllIIIIII[6]);
            bu.add((DHelper) ar2);

        }
        int[] nArray4 = new int[llllIIIIII[1]];
        nArray4[z.llllIIIIII[0]] = llllIIIIII[10];
        if (z.llIIlIllIIIII(Bank.contains((int[])nArray4) ? 1 : 0)) {
            var2 = new DHelper(llllIIIIII[10], llllIIIIII[14], llllIIIIII[15]);
            bu.add((DHelper) ar2);

        }
        if (z.llIIlIllIIIII(Bank.contains((Predicate)(var2 = item -> item.getName().toLowerCase().contains(lllIlllllI[llllIIIIII[23]]))) ? 1 : 0)) {
            var1 = new DHelper(llllIIIIII[16], llllIIIIII[11], llllIIIIII[17]);
            bu.add(var1);

        }
        int[] nArray5 = new int[llllIIIIII[1]];
        nArray5[z.llllIIIIII[0]] = llllIIIIII[18];
        if (z.llIIlIllIIIII(Bank.contains((int[])nArray5) ? 1 : 0)) {
            var1 = new DHelper(llllIIIIII[18], llllIIIIII[19], llllIIIIII[20]);
            bu.add(var1);

        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean aa() {
        int n2;
        int[] nArray = new int[llllIIIIII[1]];
        nArray[z.llllIIIIII[0]] = llllIIIIII[7];
        if (z.llIIlIllIIIll(Inventory.getCount((int[])nArray))) {
            int[] nArray2 = new int[llllIIIIII[1]];
            nArray2[z.llllIIIIII[0]] = llllIIIIII[9];
            if (z.llIIlIllIIIll(Inventory.getCount((int[])nArray2))) {
                int[] nArray3 = new int[llllIIIIII[1]];
                nArray3[z.llllIIIIII[0]] = llllIIIIII[8];
                if (z.llIIlIllIIIll(Inventory.getCount((int[])nArray3))) {
                    n2 = llllIIIIII[1];

                    if (((99 + 57 - 23 + 87 ^ 79 + 16 - -32 + 7) & (0x6D ^ 0x51 ^ (0x3B ^ 0x5D) ^ -1)) < 1) return n2 != 0;
                    return false;
                }
            }
        }
        n2 = llllIIIIII[0];
        return n2 != 0;
    }

    private static boolean llIIlIllIIIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIIlIllIIIlI(Object object) {
        return object != null;
    }

    private static boolean llIIlIllIIIll(int n2) {
        return n2 > 0;
    }

    @Override
    public boolean V() {
        boolean bl;
        if (z.llIIlIlllIIIl(e.j(llllIIIIII[3]), llllIIIIII[4])) {
            bl = llllIIIIII[1];

            if (3 < 0) {
                return ((0xAA ^ 0x9D ^ 2) & (0xD9 ^ 0x9F ^ (0xE5 ^ 0x96) ^ -1)) != 0;
            }
        } else {
            bl = llllIIIIII[0];
        }
        return bl;
    }

    static {
        z.llIIlIlIlllIl();
        z.llIIlIlIlllII();
        gt = llllIIIIII[7];
        gs = llllIIIIII[8];
        gr = llllIIIIII[9];
        gu = new WorldPoint(llllIIIIII[24], llllIIIIII[25], llllIIIIII[0]);
        String[] stringArray = new String[llllIIIIII[11]];
        stringArray[z.llllIIIIII[0]] = lllIlllllI[llllIIIIII[14]];
        stringArray[z.llllIIIIII[1]] = lllIlllllI[llllIIIIII[26]];
        stringArray[z.llllIIIIII[4]] = lllIlllllI[llllIIIIII[27]];
        stringArray[z.llllIIIIII[5]] = lllIlllllI[llllIIIIII[28]];
        stringArray[z.llllIIIIII[2]] = lllIlllllI[llllIIIIII[29]];
        gv = stringArray;
        gw = new WorldPoint(llllIIIIII[30], llllIIIIII[31], llllIIIIII[4]);
        bu = new ArrayList<d>();
        bS = llllIIIIII[0];
    }

    public static void bU() {
        if (z.llIIlIlIllllI(bs ? 1 : 0)) {
            AccBuilderTempleTrek.c = lllIlllllI[llllIIIIII[0]];
            b.a(bu);
            if (z.llIIlIlIlllll(bu.size(), llllIIIIII[1])) {
                System.out.println(lllIlllllI[llllIIIIII[1]]);
                bs = llllIIIIII[0];
            }
        }
        if (z.llIIlIllIIIII(bs ? 1 : 0)) {
            if (z.llIIlIllIIIII(z.aa() ? 1 : 0) && z.llIIlIllIIIIl(Players.getLocal().getWorldLocation().distanceTo(gu), llllIIIIII[2]) && z.llIIlIlIlllll(e.j(llllIIIIII[3]), llllIIIIII[4])) {
                BankLocation var3 = BankLocation.getNearest();
                if (z.llIIlIllIIIlI(var3) && z.llIIlIllIIIII(var3.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllIlllllI[llllIIIIII[4]];
                    a.a(var3);
                }
                if (z.llIIlIllIIIlI(var3) && z.llIIlIlIllllI(var3.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllIlllllI[llllIIIIII[5]];
                    if (z.llIIlIllIIIII(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)llllIIIIII[6]);

                    }
                    if (z.llIIlIlIllllI(Bank.isOpen() ? 1 : 0)) {
                        if (z.llIIlIllIIIll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)llllIIIIII[2]);

                        }
                        if (z.llIIlIllIIIll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)llllIIIIII[4]);

                        }
                        int[] nArray = new int[llllIIIIII[2]];
                        nArray[z.llllIIIIII[0]] = llllIIIIII[7];
                        nArray[z.llllIIIIII[1]] = llllIIIIII[8];
                        nArray[z.llllIIIIII[4]] = llllIIIIII[9];
                        nArray[z.llllIIIIII[5]] = llllIIIIII[10];
                        if (z.llIIlIllIIIII(e.b(nArray) ? 1 : 0)) {
                            z.ae();
                            System.out.println(lllIlllllI[llllIIIIII[2]]);
                            bs = llllIIIIII[1];
                            return;
                        }
                        if (z.llIIlIlIllllI(AccBuilderTempleTrek.e ? 1 : 0)) {
                            a.b(f.be, llllIIIIII[1]);
                        }
                        int[] nArray2 = new int[llllIIIIII[2]];
                        nArray2[z.llllIIIIII[0]] = llllIIIIII[7];
                        nArray2[z.llllIIIIII[1]] = llllIIIIII[8];
                        nArray2[z.llllIIIIII[4]] = llllIIIIII[9];
                        nArray2[z.llllIIIIII[5]] = llllIIIIII[10];
                        if (z.llIIlIlIllllI(e.b(nArray2) ? 1 : 0)) {
                            int[] nArray3 = new int[llllIIIIII[2]];
                            nArray3[z.llllIIIIII[0]] = llllIIIIII[7];
                            nArray3[z.llllIIIIII[1]] = llllIIIIII[8];
                            nArray3[z.llllIIIIII[4]] = llllIIIIII[9];
                            nArray3[z.llllIIIIII[5]] = llllIIIIII[10];
                            a.a(nArray3);
                        }
                    }
                }
            }
            if ((!z.llIIlIllIIIII(z.aa() ? 1 : 0) || z.llIIlIllIIlII(Players.getLocal().getWorldLocation().distanceTo(gu), llllIIIIII[2])) && z.llIIlIlIlllll(e.j(llllIIIIII[3]), llllIIIIII[4])) {
                AccBuilderTempleTrek.c = lllIlllllI[llllIIIIII[11]];
                if (z.llIIlIllIIIIl(Players.getLocal().getWorldLocation().distanceTo(gu), llllIIIIII[5])) {
                    ck = llllIIIIII[0];
                    Movement.walkTo((WorldPoint)gu);

                }
                if (z.llIIlIllIIlII(Players.getLocal().getWorldLocation().distanceTo(gu), llllIIIIII[5])) {
                    if (z.llIIlIlIlllll(ck, llllIIIIII[1])) {
                        ac.nb += llllIIIIII[1];
                        ac.d(AccBuilderTempleTrek.m);
                        ck += llllIIIIII[1];
                        ac.nb = llllIIIIII[0];
                        cl = llllIIIIII[0];
                    }
                    AccBuilderTempleTrek.c = lllIlllllI[llllIIIIII[12]];
                    if (z.llIIlIlIlllll(bS, llllIIIIII[1])) {
                        e.v();
                        bS += llllIIIIII[1];
                    }
                    g.a(lllIlllllI[llllIIIIII[13]], gv);
                }
            }
            g.a(new String[llllIIIIII[0]]);
        }
    }

    @Override
    public int T() {
        try {
            z.bU();

        }
        catch (Exception var4) {
            var4.printStackTrace();
        }
        if ((0x2F ^ 6 ^ (0x31 ^ 0x1C)) != (0x7D ^ 0x2F ^ (0x11 ^ 0x47))) {
            return (20 + 72 - -95 + 1 ^ 180 + 11 - 140 + 133) & (0xE6 ^ 0xA9 ^ (0x6B ^ 0x20) ^ -1);
        }
        return llllIIIIII[21];
    }

    private static boolean llIIlIlllIIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static void llIIlIlIlllII() {
        lllIlllllI = new String[llllIIIIII[32]];
        z.lllIlllllI[z.llllIIIIII[0]] = "Buying items";
        z.lllIlllllI[z.llllIIIIII[1]] = "Finished buying items, switching back to quest";
        z.lllIlllllI[z.llllIIIIII[4]] = "Walking to bank";
        z.lllIlllllI[z.llllIIIIII[5]] = "Handling banking";
        z.lllIlllllI[z.llllIIIIII[2]] = "We are missing quest supplies, switching to BUYING";
        z.lllIlllllI[z.llllIIIIII[11]] = "Nav to start";
        z.lllIlllllI[z.llllIIIIII[12]] = "Handling dialog";
        z.lllIlllllI[z.llllIIIIII[13]] = "Cook";
        z.lllIlllllI[z.llllIIIIII[22]] = "Cooks Assistant Quest";
        z.lllIlllllI[z.llllIIIIII[23]] = "ring of wealth (";
        z.lllIlllllI[z.llllIIIIII[14]] = "Can you make me a cake?";
        z.lllIlllllI[z.llllIIIIII[26]] = "I'm always happy to help a cook in distress.";
        z.lllIlllllI[z.llllIIIIII[27]] = "Actually, I know where to find this stuff.";
        z.lllIlllllI[z.llllIIIIII[28]] = "Yes.";
        z.lllIlllllI[z.llllIIIIII[29]] = "What's wrong?";
    }

        return String.valueOf(var5);
    }

    private static boolean llIIlIllIIIII(int n2) {
        return n2 == 0;
    }

    private static boolean llIIlIllIIlII(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public boolean S() {
        return llllIIIIII[0];
    }

    private static boolean llIIlIlIlllll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIlIlIllllI(int n2) {
        return n2 != 0;
    }

    @Override
    public String U() {
        return lllIlllllI[llllIIIIII[22]];
    }

}

