/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 */
package -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l;

import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.a;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ab;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.as;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.b;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.d;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.e;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.f;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.g;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.j;
import gg.squire.account.AccBuilderGWD;
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
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;

public class y
implements ab {
    private static /* synthetic */ String[] llIIllllI;
    public static /* synthetic */ boolean bv;
    static /* synthetic */ int cI;
    private static /* synthetic */ int[] llIIlllll;
    static /* synthetic */ int dk;
    private static /* synthetic */ String[] cG;
    public static final /* synthetic */ WorldPoint dN;
    public static final /* synthetic */ WorldPoint dM;
    static /* synthetic */ boolean dl;
    public static /* synthetic */ List<d> bx;
    public static final /* synthetic */ WorldPoint dO;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean bi() {
        int n2;
        String[] stringArray = new String[llIIlllll[1]];
        stringArray[y.llIIlllll[0]] = llIIllllI[llIIlllll[36]];
        if (y.lIlIllllIllI(Inventory.getCount((String[])stringArray))) {
            String[] stringArray2 = new String[llIIlllll[1]];
            stringArray2[y.llIIlllll[0]] = llIIllllI[llIIlllll[37]];
            if (y.lIlIllllIllI(Inventory.getCount((String[])stringArray2))) {
                String[] stringArray3 = new String[llIIlllll[1]];
                stringArray3[y.llIIlllll[0]] = llIIllllI[llIIlllll[38]];
                if (y.lIlIllllIllI(Inventory.getCount((String[])stringArray3))) {
                    String[] stringArray4 = new String[llIIlllll[1]];
                    stringArray4[y.llIIlllll[0]] = llIIllllI[llIIlllll[39]];
                    if (y.lIlIllllIllI(Inventory.getCount((String[])stringArray4))) {
                        n2 = llIIlllll[1];
                        0;
                        if (null == null) return n2 != 0;
                        return ((0x30 ^ 0x6A) & ~(0x6E ^ 0x34)) != 0;
                    }
                }
            }
        }
        n2 = llIIlllll[0];
        return n2 != 0;
    }

    private static boolean lIlIllllIllI(int n2) {
        return n2 > 0;
    }

    private static String lIlIlllIllIl(String lIIllllIIlIlll, String lIIllllIIlIllI) {
        try {
            SecretKeySpec lIIllllIIllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIllllIIlIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIllllIIllIIl = Cipher.getInstance("Blowfish");
            lIIllllIIllIIl.init(llIIlllll[3], lIIllllIIllIlI);
            return new String(lIIllllIIllIIl.doFinal(Base64.getDecoder().decode(lIIllllIIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIllllIIllIII) {
            lIIllllIIllIII.printStackTrace();
            return null;
        }
    }

    private static int lIlIllllIIIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean lIlIllllIlIl(int n2) {
        return n2 < 0;
    }

    private static boolean lIlIllllIlll(Object object) {
        return object != null;
    }

    @Override
    public boolean ae() {
        return llIIlllll[0];
    }

    private static boolean lIlIllllIIll(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        String[] stringArray = new String[llIIlllll[1]];
        stringArray[y.llIIlllll[0]] = llIIllllI[llIIlllll[40]];
        if (y.lIlIllllIllI(Inventory.getCount((String[])stringArray))) {
            String[] stringArray2 = new String[llIIlllll[1]];
            stringArray2[y.llIIlllll[0]] = llIIllllI[llIIlllll[41]];
            if (y.lIlIllllIllI(Inventory.getCount((String[])stringArray2))) {
                String[] stringArray3 = new String[llIIlllll[1]];
                stringArray3[y.llIIlllll[0]] = llIIllllI[llIIlllll[42]];
                if (y.lIlIllllIllI(Inventory.getCount((String[])stringArray3))) {
                    String[] stringArray4 = new String[llIIlllll[1]];
                    stringArray4[y.llIIlllll[0]] = llIIllllI[llIIlllll[43]];
                    if (y.lIlIllllIllI(Inventory.getCount((String[])stringArray4))) {
                        n2 = llIIlllll[1];
                        0;
                        if (2 > ((1 ^ 0x6E ^ (0x61 ^ 0x51)) & (0xC6 ^ 0xA5 ^ (0x17 ^ 0x2B) ^ -1))) return n2 != 0;
                        return ((197 + 107 - 115 + 20 ^ 83 + 61 - 77 + 82) & (0x56 ^ 0x7D ^ (0xFC ^ 0x93) ^ -1)) != 0;
                    }
                }
            }
        }
        n2 = llIIlllll[0];
        return n2 != 0;
    }

    private static String lIlIlllIllII(String lIIllllIIIIlll, String lIIllllIIIIllI) {
        lIIllllIIIIlll = new String(Base64.getDecoder().decode(lIIllllIIIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIllllIIIIlIl = new StringBuilder();
        char[] lIIllllIIIIlII = lIIllllIIIIllI.toCharArray();
        int lIIllllIIIIIll = llIIlllll[0];
        char[] lIIlllIlllllIl = lIIllllIIIIlll.toCharArray();
        int lIIlllIlllllII = lIIlllIlllllIl.length;
        int lIIlllIllllIll = llIIlllll[0];
        while (y.lIlIllllIIll(lIIlllIllllIll, lIIlllIlllllII)) {
            char lIIllllIIIlIII = lIIlllIlllllIl[lIIlllIllllIll];
            lIIllllIIIIlIl.append((char)(lIIllllIIIlIII ^ lIIllllIIIIlII[lIIllllIIIIIll % lIIllllIIIIlII.length]));
            0;
            ++lIIllllIIIIIll;
            ++lIIlllIllllIll;
            0;
            if (((0x3E ^ 0x7A) & ~(0x7F ^ 0x3B)) == 0) continue;
            return null;
        }
        return String.valueOf(lIIllllIIIIlIl);
    }

    private static boolean lIlIlllllIll(int n2, int n3) {
        return n2 >= n3;
    }

    private static String lIlIlllIlllI(String lIIllllIlIIlII, String lIIllllIlIIIIl) {
        try {
            SecretKeySpec lIIllllIlIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIllllIlIIIIl.getBytes(StandardCharsets.UTF_8)), llIIlllll[19]), "DES");
            Cipher lIIllllIlIIllI = Cipher.getInstance("DES");
            lIIllllIlIIllI.init(llIIlllll[3], lIIllllIlIIlll);
            return new String(lIIllllIlIIllI.doFinal(Base64.getDecoder().decode(lIIllllIlIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIllllIlIIlIl) {
            lIIllllIlIIlIl.printStackTrace();
            return null;
        }
    }

    public static void bh() {
        block40: {
            BankLocation lIIllllIllIllI;
            block42: {
                block41: {
                    if (y.lIlIllllIIlI(bv ? 1 : 0)) {
                        AccBuilderGWD.c = llIIllllI[llIIlllll[0]];
                        b.a(bx);
                        if (y.lIlIllllIIll(bx.size(), llIIlllll[1])) {
                            System.out.println(llIIllllI[llIIlllll[1]]);
                            bv = llIIlllll[0];
                        }
                    }
                    if (!y.lIlIllllIlII(bv ? 1 : 0)) break block40;
                    if (y.lIlIllllIIlI(Inventory.contains((int[])f.bc) ? 1 : 0) && y.lIlIllllIIll(Movement.getRunEnergy(), llIIlllll[2])) {
                        Inventory.getFirst((int[])f.bc).interact(llIIllllI[llIIlllll[3]]);
                        Time.sleepTicks((int)llIIlllll[1]);
                        0;
                    }
                    if (y.lIlIllllIlIl(y.lIlIllllIIIl(e.w(), 70.0))) {
                        int[] nArray = new int[llIIlllll[1]];
                        nArray[y.llIIlllll[0]] = llIIlllll[4];
                        if (y.lIlIllllIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray2 = new int[llIIlllll[1]];
                            nArray2[y.llIIlllll[0]] = llIIlllll[4];
                            Inventory.getFirst((int[])nArray2).interact(llIIllllI[llIIlllll[5]]);
                        }
                    }
                    if (y.lIlIllllIlII(Movement.isRunEnabled() ? 1 : 0) && y.lIlIllllIllI(Movement.getRunEnergy())) {
                        Movement.toggleRun();
                    }
                    if (!y.lIlIllllIIlI(y.an() ? 1 : 0)) break block41;
                    int[] nArray = new int[llIIlllll[1]];
                    nArray[y.llIIlllll[0]] = llIIlllll[6];
                    if (!y.lIlIllllIllI(Inventory.getCount((int[])nArray))) break block42;
                }
                if (y.lIlIllllIIll(e.j(llIIlllll[7]), llIIlllll[1])) {
                    lIIllllIllIllI = BankLocation.getNearest();
                    if (y.lIlIllllIlll(lIIllllIllIllI) && y.lIlIllllIlII(lIIllllIllIllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderGWD.c = llIIllllI[llIIlllll[8]];
                        a.a(lIIllllIllIllI);
                        Time.sleepTicks((int)llIIlllll[3]);
                        0;
                    }
                    if (y.lIlIllllIlll(lIIllllIllIllI) && y.lIlIllllIIlI(lIIllllIllIllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderGWD.c = llIIllllI[llIIlllll[9]];
                        if (y.lIlIllllIlII(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)llIIlllll[10]);
                            0;
                        }
                        if (y.lIlIllllIIlI(Bank.isOpen() ? 1 : 0)) {
                            if (y.lIlIllllIllI(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)llIIlllll[8]);
                                0;
                            }
                            if (y.lIlIllllIllI(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)llIIlllll[3]);
                                0;
                            }
                            int[] nArray = new int[llIIlllll[9]];
                            nArray[y.llIIlllll[0]] = llIIlllll[11];
                            nArray[y.llIIlllll[1]] = llIIlllll[12];
                            nArray[y.llIIlllll[3]] = llIIlllll[13];
                            nArray[y.llIIlllll[5]] = llIIlllll[14];
                            nArray[y.llIIlllll[8]] = llIIlllll[4];
                            if (y.lIlIllllIlII(e.d(nArray) ? 1 : 0)) {
                                y.Q();
                                System.out.println(llIIllllI[llIIlllll[15]]);
                                bv = llIIlllll[1];
                                return;
                            }
                            int[] nArray3 = new int[llIIlllll[9]];
                            nArray3[y.llIIlllll[0]] = llIIlllll[11];
                            nArray3[y.llIIlllll[1]] = llIIlllll[12];
                            nArray3[y.llIIlllll[3]] = llIIlllll[13];
                            nArray3[y.llIIlllll[5]] = llIIlllll[14];
                            nArray3[y.llIIlllll[8]] = llIIlllll[4];
                            if (y.lIlIllllIIlI(e.d(nArray3) ? 1 : 0)) {
                                Bank.withdraw((int)llIIlllll[11], (int)llIIlllll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)llIIlllll[1]);
                                0;
                                Bank.withdraw((int)llIIlllll[12], (int)llIIlllll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)llIIlllll[1]);
                                0;
                                Bank.withdraw((int)llIIlllll[13], (int)llIIlllll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)llIIlllll[1]);
                                0;
                                Bank.withdraw((int)llIIlllll[14], (int)llIIlllll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)llIIlllll[1]);
                                0;
                                a.a(llIIlllll[16], llIIlllll[9]);
                                a.b(f.bc, llIIlllll[9]);
                                a.a(llIIlllll[4], llIIlllll[17]);
                                a.b(f.bm, llIIlllll[1]);
                            }
                        }
                    }
                }
            }
            if (y.lIlIllllIIlI(y.an() ? 1 : 0) && y.lIlIllllIIll(e.j(llIIlllll[7]), llIIlllll[1])) {
                if (y.lIlIlllllIII(Players.getLocal().getWorldLocation().distanceTo(dM), llIIlllll[5])) {
                    AccBuilderGWD.c = llIIllllI[llIIlllll[18]];
                    if (y.lIlIllllIIll(cI, llIIlllll[1])) {
                        e.x();
                        cI += llIIlllll[1];
                    }
                    Movement.walkTo((WorldPoint)dM);
                    0;
                    Time.sleepTicks((int)llIIlllll[1]);
                    0;
                }
                if (y.lIlIlllllIIl(Players.getLocal().getWorldLocation().distanceTo(dM), llIIlllll[5])) {
                    AccBuilderGWD.c = llIIllllI[llIIlllll[19]];
                    g.a(llIIllllI[llIIlllll[20]], cG);
                }
            }
            if (y.lIlIlllllIlI(e.j(llIIlllll[7]), llIIlllll[1])) {
                dk = llIIlllll[0];
                if (y.lIlIlllllIII(Players.getLocal().getWorldLocation().distanceTo(dN), llIIlllll[5])) {
                    AccBuilderGWD.c = llIIllllI[llIIlllll[17]];
                    Movement.walkTo((WorldPoint)dN);
                    0;
                    Time.sleepTicks((int)llIIlllll[1]);
                    0;
                }
                if (y.lIlIlllllIIl(Players.getLocal().getWorldLocation().distanceTo(dN), llIIlllll[5])) {
                    AccBuilderGWD.c = llIIllllI[llIIlllll[21]];
                    g.a(llIIllllI[llIIlllll[22]], cG);
                }
            }
            if (y.lIlIlllllIlI(e.j(llIIlllll[7]), llIIlllll[3]) && y.lIlIllllIlII(y.bi() ? 1 : 0)) {
                if (y.lIlIlllllIII(Players.getLocal().getWorldLocation().distanceTo(dO), llIIlllll[5])) {
                    AccBuilderGWD.c = llIIllllI[llIIlllll[23]];
                    Movement.walkTo((WorldPoint)dO);
                    0;
                    Time.sleepTicks((int)llIIlllll[1]);
                    0;
                }
                if (y.lIlIlllllIIl(Players.getLocal().getWorldLocation().distanceTo(dO), llIIlllll[5])) {
                    AccBuilderGWD.c = llIIllllI[llIIlllll[24]];
                    int[] nArray = new int[llIIlllll[1]];
                    nArray[y.llIIlllll[0]] = llIIlllll[25];
                    lIIllllIllIllI = TileObjects.getNearest((int[])nArray);
                    if (y.lIlIllllIlll(lIIllllIllIllI)) {
                        String[] stringArray = new String[llIIlllll[1]];
                        stringArray[y.llIIlllll[0]] = llIIllllI[llIIlllll[26]];
                        Item lIIllllIllIlIl = Inventory.getFirst((String[])stringArray);
                        String[] stringArray2 = new String[llIIlllll[1]];
                        stringArray2[y.llIIlllll[0]] = llIIllllI[llIIlllll[27]];
                        Item lIIllllIllIlII = Inventory.getFirst((String[])stringArray2);
                        String[] stringArray3 = new String[llIIlllll[1]];
                        stringArray3[y.llIIlllll[0]] = llIIllllI[llIIlllll[28]];
                        Item lIIllllIllIIll = Inventory.getFirst((String[])stringArray3);
                        String[] stringArray4 = new String[llIIlllll[1]];
                        stringArray4[y.llIIlllll[0]] = llIIllllI[llIIlllll[29]];
                        Item lIIllllIllIIlI = Inventory.getFirst((String[])stringArray4);
                        if (y.lIlIllllIlll(lIIllllIllIlIl)) {
                            lIIllllIllIlIl.useOn((TileObject)lIIllllIllIllI);
                            Time.sleepTicks((int)llIIlllll[1]);
                            0;
                        }
                        if (y.lIlIllllIlll(lIIllllIllIlII)) {
                            lIIllllIllIlII.useOn((TileObject)lIIllllIllIllI);
                            Time.sleepTicks((int)llIIlllll[1]);
                            0;
                        }
                        if (y.lIlIllllIlll(lIIllllIllIIll)) {
                            lIIllllIllIIll.useOn((TileObject)lIIllllIllIllI);
                            Time.sleepTicks((int)llIIlllll[1]);
                            0;
                        }
                        if (y.lIlIllllIlll(lIIllllIllIIlI)) {
                            lIIllllIllIIlI.useOn((TileObject)lIIllllIllIllI);
                            Time.sleepTicks((int)llIIlllll[1]);
                            0;
                        }
                    }
                }
            }
            if (y.lIlIlllllIlI(e.j(llIIlllll[7]), llIIlllll[3]) && y.lIlIllllIIlI(y.bi() ? 1 : 0)) {
                if (y.lIlIlllllIII(Players.getLocal().getWorldLocation().distanceTo(dN), llIIlllll[5])) {
                    AccBuilderGWD.c = llIIllllI[llIIlllll[30]];
                    Movement.walkTo((WorldPoint)dN);
                    0;
                    Time.sleepTicks((int)llIIlllll[1]);
                    0;
                }
                if (y.lIlIlllllIIl(Players.getLocal().getWorldLocation().distanceTo(dN), llIIlllll[5])) {
                    AccBuilderGWD.c = llIIllllI[llIIlllll[31]];
                    g.a(llIIllllI[llIIlllll[32]], cG);
                }
            }
            if (y.lIlIlllllIlI(e.j(llIIlllll[7]), llIIlllll[5])) {
                if (y.lIlIlllllIII(Players.getLocal().getWorldLocation().distanceTo(dM), llIIlllll[5])) {
                    AccBuilderGWD.c = llIIllllI[llIIlllll[33]];
                    Movement.walkTo((WorldPoint)dM);
                    0;
                    Time.sleepTicks((int)llIIlllll[1]);
                    0;
                }
                if (y.lIlIlllllIIl(Players.getLocal().getWorldLocation().distanceTo(dM), llIIlllll[5])) {
                    AccBuilderGWD.c = llIIllllI[llIIlllll[34]];
                    if (y.lIlIllllIIll(dk, llIIlllll[1])) {
                        as.mS += llIIlllll[1];
                        as.u(AccBuilderGWD.m);
                        dk += llIIlllll[1];
                        as.mS = llIIlllll[0];
                    }
                    g.a(llIIllllI[llIIlllll[35]], cG);
                }
            }
            g.a(cG);
        }
    }

    static {
        y.lIlIllllIIII();
        y.lIlIlllIllll();
        dM = new WorldPoint(llIIlllll[54], llIIlllll[55], llIIlllll[0]);
        dN = new WorldPoint(llIIlllll[56], llIIlllll[57], llIIlllll[1]);
        dO = new WorldPoint(llIIlllll[58], llIIlllll[59], llIIlllll[0]);
        bx = new ArrayList<d>();
        cI = llIIlllll[0];
        String[] stringArray = new String[llIIlllll[9]];
        stringArray[y.llIIlllll[0]] = llIIllllI[llIIlllll[60]];
        stringArray[y.llIIlllll[1]] = llIIllllI[llIIlllll[61]];
        stringArray[y.llIIlllll[3]] = llIIllllI[llIIlllll[62]];
        stringArray[y.llIIlllll[5]] = llIIllllI[llIIlllll[63]];
        stringArray[y.llIIlllll[8]] = llIIllllI[llIIlllll[64]];
        cG = stringArray;
    }

    @Override
    public String ag() {
        return llIIllllI[llIIlllll[52]];
    }

    private static void lIlIlllIllll() {
        llIIllllI = new String[llIIlllll[49]];
        y.llIIllllI[y.llIIlllll[0]] = y."Buying items";
        y.llIIllllI[y.llIIlllll[1]] = y."Finished buying items, switching back to quest";
        y.llIIllllI[y.llIIlllll[3]] = y."Drink";
        y.llIIllllI[y.llIIlllll[5]] = y."Eat";
        y.llIIllllI[y.llIIlllll[8]] = y."Nav to bank";
        y.llIIllllI[y.llIIlllll[9]] = y."Handling banking";
        y.llIIllllI[y.llIIlllll[15]] = y."We are missing quest supplies, switching to BUYING";
        y.llIIllllI[y.llIIlllll[18]] = y."Nav to start";
        y.llIIllllI[y.llIIlllll[19]] = y."Talk npc";
        y.llIIllllI[y.llIIlllll[20]] = y."Kaqemeex";
        y.llIIllllI[y.llIIlllll[17]] = y."Nav to sanfew";
        y.llIIllllI[y.llIIlllll[21]] = y."Talk sanfew";
        y.llIIllllI[y.llIIlllll[22]] = y."Sanfew";
        y.llIIllllI[y.llIIlllll[23]] = y."Nav to couldren";
        y.llIIllllI[y.llIIlllll[24]] = y."Enchanting";
        y.llIIllllI[y.llIIlllll[26]] = y."Raw beef";
        y.llIIllllI[y.llIIlllll[27]] = y."Raw rat meat";
        y.llIIllllI[y.llIIlllll[28]] = y."Raw chicken";
        y.llIIllllI[y.llIIlllll[29]] = y."Raw bear meat";
        y.llIIllllI[y.llIIlllll[30]] = y."Nav to sanfew";
        y.llIIllllI[y.llIIlllll[31]] = y."Talk sanfew";
        y.llIIllllI[y.llIIlllll[32]] = y."Sanfew";
        y.llIIllllI[y.llIIlllll[33]] = y."Nav to start";
        y.llIIllllI[y.llIIlllll[34]] = y."Talk npc";
        y.llIIllllI[y.llIIlllll[35]] = y."Kaqemeex";
        y.llIIllllI[y.llIIlllll[36]] = y."Enchanted bear";
        y.llIIllllI[y.llIIlllll[37]] = y."Enchanted chicken";
        y.llIIllllI[y.llIIlllll[38]] = y."Enchanted rat";
        y.llIIllllI[y.llIIlllll[39]] = y."Enchanted beef";
        y.llIIllllI[y.llIIlllll[40]] = y."Raw chicken";
        y.llIIllllI[y.llIIlllll[41]] = y."Raw beef";
        y.llIIllllI[y.llIIlllll[42]] = y."Raw bear meat";
        y.llIIllllI[y.llIIlllll[43]] = y."Raw rat meat";
        y.llIIllllI[y.llIIlllll[52]] = y."Druidic ritual quest";
        y.llIIllllI[y.llIIlllll[53]] = y."ring of wealth (";
        y.llIIllllI[y.llIIlllll[60]] = y."I'm in search of a quest.";
        y.llIIllllI[y.llIIlllll[61]] = y."Okay, I will try and help.";
        y.llIIllllI[y.llIIlllll[62]] = y."Yes.";
        y.llIIllllI[y.llIIlllll[63]] = y."I've been sent to help purify the Varrock stone circle.";
        y.llIIllllI[y.llIIlllll[64]] = y."Ok, I'll do that then.";
    }

    private static boolean lIlIlllllIIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIlIlllllIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static void lIlIllllIIII() {
        llIIlllll = new int[65];
        y.llIIlllll[0] = (58 + 115 - 101 + 85 ^ 4 + 180 - 117 + 115) & (26 + 54 - -51 + 21 ^ 44 + 29 - 8 + 114 ^ -1);
        y.llIIlllll[1] = 1;
        y.llIIlllll[2] = 0xA4 ^ 0xC3 ^ (0x48 ^ 0x1D);
        y.llIIlllll[3] = 2;
        y.llIIlllll[4] = 0xFFFF8D7B & 0x73FF;
        y.llIIlllll[5] = 3;
        y.llIIlllll[6] = -(0xFFFFBE1D & 0x55EF) & (0xFFFF9FFF & 0x77EF);
        y.llIIlllll[7] = 130 + 192 - 167 + 42 ^ 101 + 41 - 78 + 85;
        y.llIIlllll[8] = 0x74 ^ 0x70;
        y.llIIlllll[9] = 0x5A ^ 0x5F;
        y.llIIlllll[10] = -(0xFFFFE0D3 & 0x7F3E) & (0xFFFFF3FD & 0x7F9B);
        y.llIIlllll[11] = -(0xFFFFE46B & 0x1FB6) & (0xFFFFEDFF & 0x1E7B);
        y.llIIlllll[12] = 0xFFFF9FDF & 0x6874;
        y.llIIlllll[13] = -(0xFFFFB72F & 0x7DF7) & (0xFFFFBD7E & Short.MAX_VALUE);
        y.llIIlllll[14] = -(0xFFFF97AF & 0x7D7A) & (0xFFFFDDFF & 0x3F7F);
        y.llIIlllll[15] = 147 + 139 - 194 + 79 ^ 170 + 170 - 214 + 47;
        y.llIIlllll[16] = -(0xFFFFE1BF & 0x5ED7) & (0xFFFFDFDF & Short.MAX_VALUE);
        y.llIIlllll[17] = 0x28 ^ 0x22;
        y.llIIlllll[18] = 147 + 80 - 215 + 161 ^ 108 + 128 - 67 + 1;
        y.llIIlllll[19] = 0xA0 ^ 0xA8;
        y.llIIlllll[20] = 91 + 129 - 152 + 86 ^ 129 + 75 - 89 + 32;
        y.llIIlllll[21] = 0x15 ^ 0x51 ^ (0x41 ^ 0xE);
        y.llIIlllll[22] = 0x32 ^ 0x3E;
        y.llIIlllll[23] = 0xE7 ^ 0x96 ^ (0xE8 ^ 0x94);
        y.llIIlllll[24] = 4 + 21 - 9 + 153 ^ 106 + 11 - 115 + 165;
        y.llIIlllll[25] = 0xFFFFBBDE & 0x4C7F;
        y.llIIlllll[26] = 0xB3 ^ 0xA9 ^ (0x95 ^ 0x80);
        y.llIIlllll[27] = 121 + 121 - 161 + 82 ^ 157 + 22 - 176 + 176;
        y.llIIlllll[28] = 9 + 3 - -32 + 139 ^ 54 + 33 - 31 + 110;
        y.llIIlllll[29] = 119 + 116 - 112 + 13 ^ 67 + 123 - 71 + 35;
        y.llIIlllll[30] = 37 + 59 - 94 + 144 ^ 12 + 113 - 84 + 88;
        y.llIIlllll[31] = 5 ^ 0x6C ^ (0x74 ^ 9);
        y.llIIlllll[32] = 0x57 ^ 0x42;
        y.llIIlllll[33] = 0x5C ^ 0x70 ^ (0xAE ^ 0x94);
        y.llIIlllll[34] = 7 ^ 0x10;
        y.llIIlllll[35] = 0x10 ^ 8;
        y.llIIlllll[36] = 0x2C ^ 0x35;
        y.llIIlllll[37] = 0x47 ^ 0x5D;
        y.llIIlllll[38] = 52 + 140 - 109 + 68 ^ 21 + 34 - 37 + 122;
        y.llIIlllll[39] = 0xB5 ^ 0x87 ^ (0x1C ^ 0x32);
        y.llIIlllll[40] = 0xA2 ^ 0xBF;
        y.llIIlllll[41] = 0x68 ^ 0x76;
        y.llIIlllll[42] = 0xEA ^ 0xBF ^ (0x66 ^ 0x2C);
        y.llIIlllll[43] = 0x3E ^ 0x1E;
        y.llIIlllll[44] = 0xFFFFB973 & 0x77DD;
        y.llIIlllll[45] = -(0xFFFFDED7 & 0x692B) & (0xFFFFFFDE & 0x5F2F);
        y.llIIlllll[46] = -(0xFFFFFB2E & 0x45F3) & (0xFFFFEFED & Short.MAX_VALUE);
        y.llIIlllll[47] = 0xFFFFF5F8 & 0x6BAF;
        y.llIIlllll[48] = 0xFFFFDFD7 & 0x3F6F;
        y.llIIlllll[49] = 0x54 ^ 0x7C;
        y.llIIlllll[50] = -(0xFFFFFCBB & 0x3F6E) & (0xFFFFFFED & 0x3FBF);
        y.llIIlllll[51] = 0x35 ^ 0x51;
        y.llIIlllll[52] = 6 ^ 0x27;
        y.llIIlllll[53] = 118 + 140 - 195 + 105 ^ 79 + 94 - 56 + 21;
        y.llIIlllll[54] = 0xFFFFCF6F & 0x3BFF;
        y.llIIlllll[55] = -(0xFFFF9ACB & 0x7775) & (0xFFFFFFFF & 0x1FDC);
        y.llIIlllll[56] = 0xFFFFFFDB & 0xB76;
        y.llIIlllll[57] = 0xFFFFFD67 & 0xFFB;
        y.llIIlllll[58] = -(0xFFFFCBFF & 0x74A3) & (0xFFFFCFEE & 0x7BFF);
        y.llIIlllll[59] = 0xFFFFEEFF & 0x3767;
        y.llIIlllll[60] = 0x38 ^ 0x1B;
        y.llIIlllll[61] = 0x70 ^ 0x54;
        y.llIIlllll[62] = 1 + 29 - -48 + 150 ^ 52 + 94 - 79 + 126;
        y.llIIlllll[63] = 0xBD ^ 0x8B ^ (0x24 ^ 0x34);
        y.llIIlllll[64] = 0x19 ^ 0x3E;
    }

    private static boolean lIlIllllIlII(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (y.lIlIlllllIll(e.j(llIIlllll[7]), llIIlllll[8])) {
            bl = llIIlllll[1];
            0;
            if (-1 >= 3) {
                return ((0x90 ^ 0xB3) & ~(0x5F ^ 0x7C)) != 0;
            }
        } else {
            bl = llIIlllll[0];
        }
        return bl;
    }

    @Override
    public int af() {
        try {
            y.bh();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (-1 >= (0x96 ^ 0x92)) {
            return 2 & ~2;
        }
        return llIIlllll[51];
    }

    private static void Q() {
        d lIIllllIlIlllI;
        Object lIIllllIlIllll;
        int[] nArray = new int[llIIlllll[1]];
        nArray[y.llIIlllll[0]] = llIIlllll[44];
        if (y.lIlIllllIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(llIIlllll[44], llIIlllll[9], j.ch);
            bx.add(d2);
            0;
        }
        int[] nArray2 = new int[llIIlllll[1]];
        nArray2[y.llIIlllll[0]] = llIIlllll[11];
        if (y.lIlIllllIlII(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lIIllllIlIllll = new d(llIIlllll[11], llIIlllll[1], llIIlllll[45]);
            bx.add((d)lIIllllIlIllll);
            0;
        }
        int[] nArray3 = new int[llIIlllll[1]];
        nArray3[y.llIIlllll[0]] = llIIlllll[12];
        if (y.lIlIllllIlII(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lIIllllIlIllll = new d(llIIlllll[12], llIIlllll[1], llIIlllll[45]);
            bx.add((d)lIIllllIlIllll);
            0;
        }
        int[] nArray4 = new int[llIIlllll[1]];
        nArray4[y.llIIlllll[0]] = llIIlllll[14];
        if (y.lIlIllllIlII(Bank.contains((int[])nArray4) ? 1 : 0)) {
            lIIllllIlIllll = new d(llIIlllll[14], llIIlllll[1], llIIlllll[45]);
            bx.add((d)lIIllllIlIllll);
            0;
        }
        int[] nArray5 = new int[llIIlllll[1]];
        nArray5[y.llIIlllll[0]] = llIIlllll[13];
        if (y.lIlIllllIlII(Bank.contains((int[])nArray5) ? 1 : 0)) {
            lIIllllIlIllll = new d(llIIlllll[13], llIIlllll[1], llIIlllll[45]);
            bx.add((d)lIIllllIlIllll);
            0;
        }
        int[] nArray6 = new int[llIIlllll[1]];
        nArray6[y.llIIlllll[0]] = llIIlllll[4];
        if (y.lIlIllllIlII(Bank.contains((int[])nArray6) ? 1 : 0)) {
            lIIllllIlIllll = new d(llIIlllll[4], llIIlllll[17], llIIlllll[45]);
            bx.add((d)lIIllllIlIllll);
            0;
        }
        if (y.lIlIllllIlII(Bank.contains((Predicate)(lIIllllIlIllll = item -> item.getName().toLowerCase().contains(llIIllllI[llIIlllll[53]]))) ? 1 : 0)) {
            lIIllllIlIlllI = new d(llIIlllll[46], llIIlllll[9], llIIlllll[47]);
            bx.add(lIIllllIlIlllI);
            0;
        }
        int[] nArray7 = new int[llIIlllll[1]];
        nArray7[y.llIIlllll[0]] = llIIlllll[48];
        if (y.lIlIllllIlII(Bank.contains((int[])nArray7) ? 1 : 0)) {
            lIIllllIlIlllI = new d(llIIlllll[48], llIIlllll[49], llIIlllll[50]);
            bx.add(lIIllllIlIlllI);
            0;
        }
    }

    private static boolean lIlIlllllIII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIllllIIlI(int n2) {
        return n2 != 0;
    }
}

