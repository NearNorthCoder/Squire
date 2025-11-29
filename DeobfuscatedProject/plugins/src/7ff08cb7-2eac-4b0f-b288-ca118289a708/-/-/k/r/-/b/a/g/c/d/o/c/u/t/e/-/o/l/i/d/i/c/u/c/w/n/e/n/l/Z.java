/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
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

import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.N;
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
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;

public class Z
implements ab {
    private static /* synthetic */ String[] llIlIIlll;
    static /* synthetic */ boolean dl;
    public static final /* synthetic */ WorldPoint lN;
    static /* synthetic */ int cI;
    public static /* synthetic */ List<d> bx;
    public static final /* synthetic */ WorldPoint lO;
    public static /* synthetic */ boolean bv;
    public static final /* synthetic */ WorldPoint lP;
    private static /* synthetic */ int[] llIlIlIII;
    public static final /* synthetic */ WorldPoint lM;
    static /* synthetic */ int dk;
    public static final /* synthetic */ String[] lQ;

    private static String lIllIIlIIIll(String lIIllIIIlIlllI, String lIIllIIIllIIlI) {
        lIIllIIIlIlllI = new String(Base64.getDecoder().decode(lIIllIIIlIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIllIIIllIIIl = new StringBuilder();
        char[] lIIllIIIllIIII = lIIllIIIllIIlI.toCharArray();
        int lIIllIIIlIllll = llIlIlIII[0];
        char[] lIIllIIIlIlIIl = lIIllIIIlIlllI.toCharArray();
        int lIIllIIIlIlIII = lIIllIIIlIlIIl.length;
        int lIIllIIIlIIlll = llIlIlIII[0];
        while (Z.lIllIIlIlIIl(lIIllIIIlIIlll, lIIllIIIlIlIII)) {
            char lIIllIIIllIlII = lIIllIIIlIlIIl[lIIllIIIlIIlll];
            lIIllIIIllIIIl.append((char)(lIIllIIIllIlII ^ lIIllIIIllIIII[lIIllIIIlIllll % lIIllIIIllIIII.length]));
            "".length();
            ++lIIllIIIlIllll;
            ++lIIllIIIlIIlll;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lIIllIIIllIIIl);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        String[] stringArray = new String[llIlIlIII[1]];
        stringArray[Z.llIlIlIII[0]] = llIlIIlll[llIlIlIII[47]];
        if (Z.lIllIIlIlIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            String[] stringArray2 = new String[llIlIlIII[1]];
            stringArray2[Z.llIlIlIII[0]] = llIlIIlll[llIlIlIII[48]];
            if (Z.lIllIIlIlIII(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                String[] stringArray3 = new String[llIlIlIII[1]];
                stringArray3[Z.llIlIlIII[0]] = llIlIIlll[llIlIlIII[49]];
                if (Z.lIllIIlIlIII(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                    n2 = llIlIlIII[1];
                    "".length();
                    if ((0x46 ^ 0x43) > 0) return n2 != 0;
                    return ((0x92 ^ 0x8D) & ~(0x9B ^ 0x84)) != 0;
                }
            }
        }
        n2 = llIlIlIII[0];
        return n2 != 0;
    }

    private static boolean lIllIIlIllII(int n2) {
        return n2 < 0;
    }

    public static void dO() {
        block44: {
            BankLocation lIIllIIlIIIlII;
            block47: {
                block48: {
                    block46: {
                        block45: {
                            if (Z.lIllIIlIlIII(bv ? 1 : 0)) {
                                AccBuilderGWD.c = llIlIIlll[llIlIlIII[0]];
                                b.a(bx);
                                if (Z.lIllIIlIlIIl(bx.size(), llIlIlIII[1])) {
                                    System.out.println(llIlIIlll[llIlIlIII[1]]);
                                    bv = llIlIlIII[0];
                                }
                            }
                            if (Z.lIllIIlIlIlI(bv ? 1 : 0) && Z.lIllIIlIlIIl(e.j(llIlIlIII[2]), llIlIlIII[3])) {
                                N.cv();
                            }
                            if (!Z.lIllIIlIlIlI(bv ? 1 : 0) || !Z.lIllIIlIlIll(e.j(llIlIlIII[2]), llIlIlIII[3])) break block44;
                            if (Z.lIllIIlIlIII(Inventory.contains((int[])f.bc) ? 1 : 0) && Z.lIllIIlIlIIl(Movement.getRunEnergy(), llIlIlIII[4])) {
                                Inventory.getFirst((int[])f.bc).interact(llIlIIlll[llIlIlIII[5]]);
                                Time.sleepTicks((int)llIlIlIII[1]);
                                "".length();
                            }
                            if (Z.lIllIIlIllII(Z.lIllIIlIIlll(e.w(), 70.0))) {
                                int[] nArray = new int[llIlIlIII[1]];
                                nArray[Z.llIlIlIII[0]] = llIlIlIII[6];
                                if (Z.lIllIIlIlIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                    int[] nArray2 = new int[llIlIlIII[1]];
                                    nArray2[Z.llIlIlIII[0]] = llIlIlIII[6];
                                    Inventory.getFirst((int[])nArray2).interact(llIlIIlll[llIlIlIII[7]]);
                                }
                            }
                            if (Z.lIllIIlIlIlI(Movement.isRunEnabled() ? 1 : 0) && Z.lIllIIlIllIl(Movement.getRunEnergy())) {
                                Movement.toggleRun();
                            }
                            if (!Z.lIllIIlIlIII(Z.an() ? 1 : 0)) break block45;
                            int[] nArray = new int[llIlIlIII[1]];
                            nArray[Z.llIlIlIII[0]] = llIlIlIII[8];
                            if (!Z.lIllIIlIllIl(Inventory.getCount((int[])nArray))) break block46;
                        }
                        if (Z.lIllIIlIlIIl(e.j(llIlIlIII[9]), llIlIlIII[1])) {
                            lIIllIIlIIIlII = BankLocation.getNearest();
                            if (Z.lIllIIlIlllI(lIIllIIlIIIlII) && Z.lIllIIlIlIlI(lIIllIIlIIIlII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderGWD.c = llIlIIlll[llIlIlIII[10]];
                                a.a(lIIllIIlIIIlII);
                                Time.sleepTicks((int)llIlIlIII[5]);
                                "".length();
                            }
                            if (Z.lIllIIlIlllI(lIIllIIlIIIlII) && Z.lIllIIlIlIII(lIIllIIlIIIlII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderGWD.c = llIlIIlll[llIlIlIII[11]];
                                if (Z.lIllIIlIlIlI(Bank.isOpen() ? 1 : 0)) {
                                    a.a();
                                    Time.sleepUntil(() -> Bank.isOpen(), (int)llIlIlIII[12]);
                                    "".length();
                                }
                                if (Z.lIllIIlIlIII(Bank.isOpen() ? 1 : 0)) {
                                    if (Z.lIllIIlIllIl(Inventory.getAll().size())) {
                                        Bank.depositInventory();
                                        Time.sleepTicks((int)llIlIlIII[10]);
                                        "".length();
                                    }
                                    if (Z.lIllIIlIllIl(Equipment.getAll().size())) {
                                        Bank.depositEquipment();
                                        Time.sleepTicks((int)llIlIlIII[5]);
                                        "".length();
                                    }
                                    int[] nArray = new int[llIlIlIII[11]];
                                    nArray[Z.llIlIlIII[0]] = llIlIlIII[13];
                                    nArray[Z.llIlIlIII[1]] = llIlIlIII[14];
                                    nArray[Z.llIlIlIII[5]] = llIlIlIII[15];
                                    nArray[Z.llIlIlIII[7]] = llIlIlIII[16];
                                    nArray[Z.llIlIlIII[10]] = llIlIlIII[17];
                                    if (Z.lIllIIlIlIlI(e.d(nArray) ? 1 : 0)) {
                                        Z.Q();
                                        System.out.println(llIlIIlll[llIlIlIII[18]]);
                                        bv = llIlIlIII[1];
                                        return;
                                    }
                                    Bank.withdraw((int)llIlIlIII[13], (int)llIlIlIII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llIlIlIII[1]);
                                    "".length();
                                    Bank.withdraw((int)llIlIlIII[14], (int)llIlIlIII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llIlIlIII[1]);
                                    "".length();
                                    Bank.withdraw((int)llIlIlIII[15], (int)llIlIlIII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llIlIlIII[1]);
                                    "".length();
                                    Bank.withdraw((int)llIlIlIII[16], (int)llIlIlIII[11], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llIlIlIII[1]);
                                    "".length();
                                    Bank.withdraw((int)llIlIlIII[19], (int)llIlIlIII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llIlIlIII[1]);
                                    "".length();
                                    Bank.withdraw((int)llIlIlIII[17], (int)llIlIlIII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llIlIlIII[1]);
                                    "".length();
                                    a.b(f.bc, llIlIlIII[1]);
                                    a.a(llIlIlIII[6], llIlIlIII[3]);
                                    a.b(f.bm, llIlIlIII[1]);
                                }
                            }
                        }
                    }
                    if (Z.lIllIIlIlIII(Z.an() ? 1 : 0) && Z.lIllIIlIlIIl(e.j(llIlIlIII[9]), llIlIlIII[1])) {
                        if (Z.lIllIIlIllll(Players.getLocal().getWorldLocation().distanceTo(lM), llIlIlIII[5])) {
                            AccBuilderGWD.c = llIlIIlll[llIlIlIII[20]];
                            if (Z.lIllIIlIlIlI(Equipment.contains((int[])f.aY) ? 1 : 0) && Z.lIllIIlIlIII(Inventory.contains((int[])f.aY) ? 1 : 0)) {
                                Inventory.getFirst((int[])f.aY).interact(llIlIIlll[llIlIlIII[21]]);
                                Time.sleepTicks((int)llIlIlIII[1]);
                                "".length();
                            }
                            if (Z.lIllIIlIlIIl(cI, llIlIlIII[1])) {
                                e.x();
                                cI += llIlIlIII[1];
                            }
                            Movement.walkTo((WorldPoint)lM);
                            "".length();
                            Time.sleepTicks((int)llIlIlIII[1]);
                            "".length();
                        }
                        if (Z.lIllIIllIIII(Players.getLocal().getWorldLocation().distanceTo(lM), llIlIlIII[7])) {
                            AccBuilderGWD.c = llIlIIlll[llIlIlIII[22]];
                            g.a(llIlIIlll[llIlIlIII[3]], lQ);
                        }
                    }
                    if (Z.lIllIIlIlIll(e.j(llIlIlIII[9]), llIlIlIII[1])) {
                        dk = llIlIlIII[0];
                        if (Z.lIllIIlIllll(Players.getLocal().getWorldLocation().distanceTo(lN), llIlIlIII[21])) {
                            AccBuilderGWD.c = llIlIIlll[llIlIlIII[23]];
                            Movement.walkTo((WorldPoint)lN);
                            "".length();
                            Time.sleepTicks((int)llIlIlIII[1]);
                            "".length();
                        }
                        if (Z.lIllIIllIIII(Players.getLocal().getWorldLocation().distanceTo(lN), llIlIlIII[21])) {
                            AccBuilderGWD.c = llIlIIlll[llIlIlIII[24]];
                            g.a(llIlIIlll[llIlIlIII[25]], lQ);
                        }
                    }
                    if (!Z.lIllIIlIlIll(e.j(llIlIlIII[9]), llIlIlIII[5])) break block47;
                    String[] stringArray = new String[llIlIlIII[1]];
                    stringArray[Z.llIlIlIII[0]] = llIlIIlll[llIlIlIII[26]];
                    if (!Z.lIllIIlIlIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) break block48;
                    String[] stringArray2 = new String[llIlIlIII[1]];
                    stringArray2[Z.llIlIlIII[0]] = llIlIIlll[llIlIlIII[27]];
                    if (!Z.lIllIIlIlIlI(Inventory.contains((String[])stringArray2) ? 1 : 0)) break block47;
                }
                AccBuilderGWD.c = llIlIIlll[llIlIlIII[28]];
                g.a(llIlIIlll[llIlIlIII[29]], lQ);
                g.a(lQ);
            }
            if (Z.lIllIIlIlIll(e.j(llIlIlIII[9]), llIlIlIII[5])) {
                String[] stringArray = new String[llIlIlIII[1]];
                stringArray[Z.llIlIlIII[0]] = llIlIIlll[llIlIlIII[30]];
                if (Z.lIllIIlIlIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray3 = new String[llIlIlIII[1]];
                    stringArray3[Z.llIlIlIII[0]] = llIlIIlll[llIlIlIII[31]];
                    if (Z.lIllIIlIlIII(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                        if (Z.lIllIIlIllll(Players.getLocal().getWorldLocation().distanceTo(lO), llIlIlIII[5]) && Z.lIllIIlIllll(Players.getLocal().getWorldLocation().distanceTo(lP), llIlIlIII[3])) {
                            AccBuilderGWD.c = llIlIIlll[llIlIlIII[32]];
                            if (Z.lIllIIllIIII(Players.getLocal().getWorldLocation().distanceTo(lN), llIlIlIII[3]) && Z.lIllIIlIlIII(Equipment.contains((int[])f.aY) ? 1 : 0) && Z.lIllIIllIIIl(Players.getLocal().getAnimation(), llIlIlIII[33])) {
                                Equipment.getFirst((int[])f.aY).interact(llIlIIlll[llIlIlIII[34]]);
                                Time.sleepTicks((int)llIlIlIII[7]);
                                "".length();
                            }
                            Movement.walkTo((WorldPoint)lO);
                            "".length();
                            Time.sleepTicks((int)llIlIlIII[1]);
                            "".length();
                        }
                        if (Z.lIllIIllIIII(Players.getLocal().getWorldLocation().distanceTo(lO), llIlIlIII[10])) {
                            AccBuilderGWD.c = llIlIIlll[llIlIlIII[35]];
                            String[] stringArray4 = new String[llIlIlIII[1]];
                            stringArray4[Z.llIlIlIII[0]] = llIlIIlll[llIlIlIII[36]];
                            lIIllIIlIIIlII = TileObjects.getNearest((String[])stringArray4);
                            lIIllIIlIIIlII.interact(llIlIIlll[llIlIlIII[37]]);
                            Time.sleepTicks((int)llIlIlIII[7]);
                            "".length();
                        }
                        if (Z.lIllIIllIIII(Players.getLocal().getWorldLocation().distanceTo(lP), llIlIlIII[3])) {
                            String[] stringArray5 = new String[llIlIlIII[1]];
                            stringArray5[Z.llIlIlIII[0]] = llIlIIlll[llIlIlIII[38]];
                            if (Z.lIllIIllIIlI(NPCs.getNearest((String[])stringArray5))) {
                                AccBuilderGWD.c = llIlIIlll[llIlIlIII[39]];
                                if (Z.lIllIIlIlIIl(dk, llIlIlIII[1])) {
                                    as.pK += llIlIlIII[1];
                                    as.u(AccBuilderGWD.m);
                                    dk += llIlIlIII[1];
                                    as.pK = llIlIlIII[0];
                                    dl = llIlIlIII[0];
                                }
                                String[] stringArray6 = new String[llIlIlIII[1]];
                                stringArray6[Z.llIlIlIII[0]] = llIlIIlll[llIlIlIII[40]];
                                TileObjects.getNearest((String[])stringArray6).interact(llIlIIlll[llIlIlIII[41]]);
                                Time.sleepTicks((int)llIlIlIII[10]);
                                "".length();
                            }
                            String[] stringArray7 = new String[llIlIlIII[1]];
                            stringArray7[Z.llIlIlIII[0]] = llIlIIlll[llIlIlIII[42]];
                            lIIllIIlIIIlII = NPCs.getNearest((String[])stringArray7);
                            if (Z.lIllIIlIlllI(lIIllIIlIIIlII)) {
                                AccBuilderGWD.c = llIlIIlll[llIlIlIII[43]];
                                int[] nArray = new int[llIlIlIII[1]];
                                nArray[Z.llIlIlIII[0]] = llIlIlIII[17];
                                if (Z.lIllIIlIlIlI(Equipment.contains((int[])nArray) ? 1 : 0)) {
                                    int[] nArray3 = new int[llIlIlIII[1]];
                                    nArray3[Z.llIlIlIII[0]] = llIlIlIII[17];
                                    if (Z.lIllIIlIlIII(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                                        int[] nArray4 = new int[llIlIlIII[1]];
                                        nArray4[Z.llIlIlIII[0]] = llIlIlIII[17];
                                        Inventory.getFirst((int[])nArray4).interact(llIlIIlll[llIlIlIII[44]]);
                                        Time.sleepTicks((int)llIlIlIII[1]);
                                        "".length();
                                    }
                                }
                                if (Z.lIllIIllIIlI(Players.getLocal().getInteracting()) && Z.lIllIIlIlIlI(lIIllIIlIIIlII.isDead() ? 1 : 0)) {
                                    lIIllIIlIIIlII.interact(llIlIIlll[llIlIlIII[45]]);
                                    Time.sleepTicks((int)llIlIlIII[5]);
                                    "".length();
                                }
                            }
                        }
                    }
                }
            }
            if (Z.lIllIIlIlIll(e.j(llIlIlIII[9]), llIlIlIII[7]) && Z.lIllIIllIIII(Players.getLocal().getWorldLocation().distanceTo(lP), llIlIlIII[3])) {
                int[] nArray = new int[llIlIlIII[1]];
                nArray[Z.llIlIlIII[0]] = llIlIlIII[16];
                if (Z.lIllIIlIlIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray5 = new int[llIlIlIII[1]];
                    nArray5[Z.llIlIlIII[0]] = llIlIlIII[16];
                    Inventory.getFirst((int[])nArray5).interact(llIlIIlll[llIlIlIII[46]]);
                    Time.sleepTicks((int)llIlIlIII[5]);
                    "".length();
                }
            }
            g.a(new String[llIlIlIII[0]]);
        }
    }

    private static boolean lIllIIlIllll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIllIIlIlIlI(int n2) {
        return n2 == 0;
    }

    @Override
    public String ag() {
        return llIlIIlll[llIlIlIII[60]];
    }

    private static void lIllIIlIIlIl() {
        llIlIIlll = new String[llIlIlIII[73]];
        Z.llIlIIlll[Z.llIlIlIII[0]] = Z.lIllIIlIIIlI("PDe33YKjvnZRby0btazSKA==", "ghIkg");
        Z.llIlIIlll[Z.llIlIlIII[1]] = Z.lIllIIlIIIlI("80PvhZI5pf/z4pynkhONisxFftyeGFUjJjd30thUbBPoExyxKkN0Awdb8Ta3B1HT", "MeYWY");
        Z.llIlIIlll[Z.llIlIlIII[5]] = Z.lIllIIlIIIll("FCY/Jww=", "PTVIg");
        Z.llIlIIlll[Z.llIlIlIII[7]] = Z.lIllIIlIIIll("IhkM", "gxxsY");
        Z.llIlIIlll[Z.llIlIlIII[10]] = Z.lIllIIlIIIll("FxgiayM2WTYqOTI=", "YyTKW");
        Z.llIlIIlll[Z.llIlIlIII[11]] = Z.lIllIIlIIlII("KQj2gqsxfgQNsrT3OonEn+IWbr03PbE9", "jDQwP");
        Z.llIlIIlll[Z.llIlIlIII[18]] = Z.lIllIIlIIIlI("AdDnJyTftoIli65BnPAiPjzCrZ3sXYGzX4zL6HIm1VO9AyV7rLR0UfKUDGrlKEQFBKdUwZ6kml0=", "tvpAO");
        Z.llIlIIlll[Z.llIlIlIII[20]] = Z.lIllIIlIIIll("NDI8ZREVczkxBAgn", "zSJEe");
        Z.llIlIIlll[Z.llIlIlIII[21]] = Z.lIllIIlIIlII("FAnP4B91zsk=", "sTpYl");
        Z.llIlIIlll[Z.llIlIlIII[22]] = Z.lIllIIlIIIll("JygIJyYdLkQiPxA=", "sIdLO");
        Z.llIlIIlll[Z.llIlIlIII[3]] = Z.lIllIIlIIIll("LgYoJREN", "ciZBp");
        Z.llIlIIlll[Z.llIlIlIII[23]] = Z.lIllIIlIIIll("NxYAdS0WVwYgOw==", "ywvUY");
        Z.llIlIIlll[Z.llIlIlIII[24]] = Z.lIllIIlIIlII("OMNmWV2QzY9YRQfP5agJcg==", "JGrGy");
        Z.llIlIIlll[Z.llIlIlIII[25]] = Z.lIllIIlIIIll("DDtuIQs6JSEe", "HINij");
        Z.llIlIIlll[Z.llIlIlIII[26]] = Z.lIllIIlIIIll("ExYTJQ==", "QsvWT");
        Z.llIlIIlll[Z.llIlIlIII[27]] = Z.lIllIIlIIlII("CdJCrerOXBw=", "oDvOP");
        Z.llIlIIlll[Z.llIlIlIII[28]] = Z.lIllIIlIIlII("aaTEILAWuMuKIeQSTI0Bcg==", "fcsWN");
        Z.llIlIIlll[Z.llIlIlIII[29]] = Z.lIllIIlIIlII("ro91gCw3RHbtMKnpy0dFsg==", "ynDEr");
        Z.llIlIIlll[Z.llIlIlIII[30]] = Z.lIllIIlIIIlI("Esy1JbIsr4o=", "cOOAj");
        Z.llIlIIlll[Z.llIlIlIII[31]] = Z.lIllIIlIIIll("HhEQADE=", "MeqkT");
        Z.llIlIIlll[Z.llIlIlIII[32]] = Z.lIllIIlIIIlI("4bpJtNAjOPIjHKuda0LW6w==", "gpaHK");
        Z.llIlIIlll[Z.llIlIlIII[34]] = Z.lIllIIlIIlII("UgLzUjXqNaJLozTkfnCigA==", "jilwO");
        Z.llIlIIlll[Z.llIlIlIII[35]] = Z.lIllIIlIIIll("JRUDJQgcE08qDgUaTz0VEx0dPQ==", "rtoNa");
        Z.llIlIIlll[Z.llIlIlIII[36]] = Z.lIllIIlIIIlI("1IVy2u0qTEE=", "CxihX");
        Z.llIlIIlll[Z.llIlIlIII[37]] = Z.lIllIIlIIIll("Hzs0KEYMNS8t", "HZXCk");
        Z.llIlIIlll[Z.llIlIlIII[38]] = Z.lIllIIlIIIlI("1SJ0MVlcsKf6XuTx2xCytQ==", "OHcRx");
        Z.llIlIIlll[Z.llIlIlIII[39]] = Z.lIllIIlIIIlI("H5ndYIUTyO8Nst6ymK3o5Q==", "JkXbl");
        Z.llIlIIlll[Z.llIlIlIII[40]] = Z.lIllIIlIIIll("JAcNJCIJ", "ghkBK");
        Z.llIlIIlll[Z.llIlIlIII[41]] = Z.lIllIIlIIIll("AjUKPA==", "MEoRC");
        Z.llIlIIlll[Z.llIlIlIII[42]] = Z.lIllIIlIIlII("DZ8W2IHSapWewFt2Obx3xQ==", "jqwkE");
        Z.llIlIIlll[Z.llIlIlIII[43]] = Z.lIllIIlIIlII("T37git+rktLPMAd8a++KSQ==", "rcvvs");
        Z.llIlIIlll[Z.llIlIlIII[44]] = Z.lIllIIlIIIll("BToCKQc=", "RSgEc");
        Z.llIlIIlll[Z.llIlIlIII[45]] = Z.lIllIIlIIIll("IzkHLAkJ", "bMsMj");
        Z.llIlIIlll[Z.llIlIlIII[46]] = Z.lIllIIlIIIll("FRAEChk=", "Wbakr");
        Z.llIlIIlll[Z.llIlIlIII[47]] = Z.lIllIIlIIlII("2DOvrwxbUQ0=", "tYCSz");
        Z.llIlIIlll[Z.llIlIlIII[48]] = Z.lIllIIlIIIll("Iys3Ai0H", "dJEnD");
        Z.llIlIIlll[Z.llIlIlIII[49]] = Z.lIllIIlIIIll("GBUVBwQi", "Ptxja");
        Z.llIlIIlll[Z.llIlIlIII[60]] = Z.lIllIIlIIIlI("OG0F/nDUE+EChqlJHgLZBeh8EF6PnLfg", "QLeNJ");
        Z.llIlIIlll[Z.llIlIlIII[61]] = Z.lIllIIlIIlII("X+G9U08BJt97+HryxNM4An2CWUWxPZmu", "uuQnv");
        Z.llIlIIlll[Z.llIlIlIII[70]] = Z.lIllIIlIIIlI("5NRvo/5BicNqe0n/TdKnP8AP5uL4b4n9/Cmr3bfbNSg=", "LauSg");
        Z.llIlIIlll[Z.llIlIlIII[53]] = Z.lIllIIlIIlII("psW7AVe0yqc8AZivXuUZF1Z9xO90wCJmCBi4DZGQj9DN76KL2juBgw==", "PqdxX");
        Z.llIlIIlll[Z.llIlIlIII[71]] = Z.lIllIIlIIlII("SJL9W1YQKoLxYXSZ9Lta2j1nEVi1WTOH", "PFamG");
        Z.llIlIIlll[Z.llIlIlIII[72]] = Z.lIllIIlIIIll("NRMWdw==", "lveYD");
    }

    private static boolean lIllIIlIlllI(Object object) {
        return object != null;
    }

    private static boolean lIllIIllIIlI(Object object) {
        return object == null;
    }

    private static int lIllIIlIIlll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean lIllIIlIllIl(int n2) {
        return n2 > 0;
    }

    private static String lIllIIlIIlII(String lIIllIIIIIllll, String lIIllIIIIlIIII) {
        try {
            SecretKeySpec lIIllIIIIlIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIllIIIIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIllIIIIlIIll = Cipher.getInstance("Blowfish");
            lIIllIIIIlIIll.init(llIlIlIII[5], lIIllIIIIlIlII);
            return new String(lIIllIIIIlIIll.doFinal(Base64.getDecoder().decode(lIIllIIIIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIllIIIIlIIlI) {
            lIIllIIIIlIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIllIIIl(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIllIIllIIll(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public boolean ae() {
        return llIlIlIII[0];
    }

    private static boolean lIllIIlIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIllIIlIIllI() {
        llIlIlIII = new int[74];
        Z.llIlIlIII[0] = (6 ^ 8 ^ (0xAE ^ 0xB6)) & (0x50 ^ 9 ^ (0x49 ^ 6) ^ -" ".length());
        Z.llIlIlIII[1] = " ".length();
        Z.llIlIlIII[2] = 0x3F ^ 0x7E;
        Z.llIlIlIII[3] = 0x26 ^ 0x2C;
        Z.llIlIlIII[4] = 0x14 ^ 0x79 ^ (0x8C ^ 0xA7);
        Z.llIlIlIII[5] = "  ".length();
        Z.llIlIlIII[6] = 0xFFFFC9FF & 0x377B;
        Z.llIlIlIII[7] = "   ".length();
        Z.llIlIlIII[8] = -(0xFFFFE8EF & 0x771D) & (0xFFFFF3EF & 0x6FFF);
        Z.llIlIlIII[9] = (0x40 ^ 0x7A) + (41 + 78 - -35 + 12) - (0xD3 ^ 0xAD) + (0xCF ^ 0x9F);
        Z.llIlIlIII[10] = 51 + 45 - -2 + 46 ^ 63 + 145 - 144 + 84;
        Z.llIlIlIII[11] = 32 + 99 - 93 + 147 ^ 31 + 172 - 67 + 52;
        Z.llIlIlIII[12] = 0xFFFFFFBD & 0x13CA;
        Z.llIlIlIII[13] = 0xFFFFB77D & 0x4FFF;
        Z.llIlIlIII[14] = 0xFFFFDF4F & 0x26BE;
        Z.llIlIlIII[15] = -(0xFFFFB76D & 0x7ED7) & (0xFFFFBF7F & 0x7FEF);
        Z.llIlIlIII[16] = 0xFFFFFFFF & 0x1F47;
        Z.llIlIlIII[17] = 0xFFFF95B7 & 0x6F7D;
        Z.llIlIlIII[18] = 0x1C ^ 0x1A;
        Z.llIlIlIII[19] = 0xFFFFAEFF & 0x7FCA;
        Z.llIlIlIII[20] = 0x72 ^ 0x75;
        Z.llIlIlIII[21] = 0x94 ^ 0xC1 ^ (0x70 ^ 0x2D);
        Z.llIlIlIII[22] = 0xCF ^ 0x94 ^ (0x7C ^ 0x2E);
        Z.llIlIlIII[23] = 0x4D ^ 0x46;
        Z.llIlIlIII[24] = 0x8E ^ 0x82;
        Z.llIlIlIII[25] = 48 + 175 - 21 + 1 ^ 106 + 36 - -54 + 2;
        Z.llIlIlIII[26] = 4 ^ 0x48 ^ (0x5C ^ 0x1E);
        Z.llIlIlIII[27] = 0xAE ^ 0xA1;
        Z.llIlIlIII[28] = 0xD0 ^ 0xC0 ^ (0x54 ^ 0x43) & ~(0x23 ^ 0x34);
        Z.llIlIlIII[29] = 0x37 ^ 0x26;
        Z.llIlIlIII[30] = 3 ^ 0x1A ^ (0xCB ^ 0xC0);
        Z.llIlIlIII[31] = 0xF9 ^ 0x8F ^ (0xF9 ^ 0x9C);
        Z.llIlIlIII[32] = 87 + 70 - 68 + 58 ^ 45 + 100 - 31 + 21;
        Z.llIlIlIII[33] = -(0xFFFFFDFF & 0x7F35) & (0xFFFFFFFE & Short.MAX_VALUE);
        Z.llIlIlIII[34] = "  ".length() ^ (0xAD ^ 0xBA);
        Z.llIlIlIII[35] = 0x27 ^ 0x52 ^ (0xA5 ^ 0xC6);
        Z.llIlIlIII[36] = 25 + 98 - 71 + 79 ^ 76 + 60 - 50 + 62;
        Z.llIlIlIII[37] = 0x4C ^ 0x54;
        Z.llIlIlIII[38] = 0x3D ^ 0x24;
        Z.llIlIlIII[39] = 21 + 118 - 112 + 134 ^ 93 + 149 - 60 + 5;
        Z.llIlIlIII[40] = 0x4C ^ 0x37 ^ (0x79 ^ 0x19);
        Z.llIlIlIII[41] = 0x91 ^ 0x8D;
        Z.llIlIlIII[42] = 0x13 ^ 0 ^ (0x58 ^ 0x56);
        Z.llIlIlIII[43] = 0 ^ 0x1E;
        Z.llIlIlIII[44] = 0x72 ^ 0x6D;
        Z.llIlIlIII[45] = 0xD3 ^ 0xC1 ^ (0x43 ^ 0x71);
        Z.llIlIlIII[46] = 0xA5 ^ 0x84;
        Z.llIlIlIII[47] = 0x3A ^ 0x5A ^ (0xC2 ^ 0x80);
        Z.llIlIlIII[48] = 0 ^ 0x23;
        Z.llIlIlIII[49] = 0x73 ^ 0x1C ^ (0xCB ^ 0x80);
        Z.llIlIlIII[50] = 0xFFFFB7FD & 0x5F0E;
        Z.llIlIlIII[51] = 0xFFFFFDED & 0x673E;
        Z.llIlIlIII[52] = 0xFFFFBEBD & 0x7F5E;
        Z.llIlIlIII[53] = 0x1A ^ 0x45 ^ (0x3C ^ 0x4B);
        Z.llIlIlIII[54] = -(0xFFFFFEDF & 0x736F) & (0xFFFFF7FF & 0x7BDE);
        Z.llIlIlIII[55] = -(0x10 ^ 0x33) & (0xFFFFAEFF & 0x7FEE);
        Z.llIlIlIII[56] = 0xFFFFEDAA & 0x73FD;
        Z.llIlIlIII[57] = -(0xFFFFBF93 & 0x687F) & (0xFFFFBF7F & 0x6FFE);
        Z.llIlIlIII[58] = -(0xFFFF9CB3 & 0x67EF) & (0xFFFFF7F3 & 0x3DFF);
        Z.llIlIlIII[59] = 0x6F ^ 0xB;
        Z.llIlIlIII[60] = 0xF0 ^ 0xC3 ^ (0x8A ^ 0x9C);
        Z.llIlIlIII[61] = 0x49 ^ 0x50 ^ (0xB5 ^ 0x8A);
        Z.llIlIlIII[62] = -(0xFFFFEA77 & 0x37EE) & (0xFFFFEEFF & 0x3F7F);
        Z.llIlIlIII[63] = 0xFFFFCDE4 & 0x3EDF;
        Z.llIlIlIII[64] = -(0xFFFFFF2B & 0x61F5) & (0xFFFFFDF7 & 0x6FBF);
        Z.llIlIlIII[65] = 0xFFFFEF63 & 0x1DDF;
        Z.llIlIlIII[66] = 0xFFFFBEBF & 0x4D6C;
        Z.llIlIlIII[67] = 0xFFFFEF9F & 0x1D7C;
        Z.llIlIlIII[68] = -(0xFFFFBD5F & 0x73E3) & (0xFFFFFF47 & 0x3DFF);
        Z.llIlIlIII[69] = -(0xFFFFFFDD & 0x9F7) & (0xFFFFBFFF & 0x6FFF);
        Z.llIlIlIII[70] = 70 + 115 - 66 + 13 ^ 101 + 141 - 211 + 132;
        Z.llIlIlIII[71] = 0x90 ^ 0xB9;
        Z.llIlIlIII[72] = 0x84 ^ 0xAE;
        Z.llIlIlIII[73] = 0x47 ^ 0x6C;
    }

    private static void Q() {
        d lIIllIIlIIIIII;
        Object lIIllIIlIIIIIl;
        int[] nArray = new int[llIlIlIII[1]];
        nArray[Z.llIlIlIII[0]] = llIlIlIII[13];
        if (Z.lIllIIlIlIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(llIlIlIII[13], llIlIlIII[1], llIlIlIII[50]);
            bx.add(d2);
            "".length();
        }
        int[] nArray2 = new int[llIlIlIII[1]];
        nArray2[Z.llIlIlIII[0]] = llIlIlIII[15];
        if (Z.lIllIIlIlIlI(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lIIllIIlIIIIIl = new d(llIlIlIII[15], llIlIlIII[1], llIlIlIII[50]);
            bx.add((d)lIIllIIlIIIIIl);
            "".length();
        }
        int[] nArray3 = new int[llIlIlIII[1]];
        nArray3[Z.llIlIlIII[0]] = llIlIlIII[17];
        if (Z.lIllIIlIlIlI(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lIIllIIlIIIIIl = new d(llIlIlIII[17], llIlIlIII[1], llIlIlIII[51]);
            bx.add((d)lIIllIIlIIIIIl);
            "".length();
        }
        int[] nArray4 = new int[llIlIlIII[1]];
        nArray4[Z.llIlIlIII[0]] = llIlIlIII[14];
        if (Z.lIllIIlIlIlI(Bank.contains((int[])nArray4) ? 1 : 0)) {
            lIIllIIlIIIIIl = new d(llIlIlIII[14], llIlIlIII[1], llIlIlIII[50]);
            bx.add((d)lIIllIIlIIIIIl);
            "".length();
        }
        int[] nArray5 = new int[llIlIlIII[1]];
        nArray5[Z.llIlIlIII[0]] = llIlIlIII[19];
        if (Z.lIllIIlIlIlI(Bank.contains((int[])nArray5) ? 1 : 0)) {
            lIIllIIlIIIIIl = new d(llIlIlIII[19], llIlIlIII[1], llIlIlIII[52]);
            bx.add((d)lIIllIIlIIIIIl);
            "".length();
        }
        int[] nArray6 = new int[llIlIlIII[1]];
        nArray6[Z.llIlIlIII[0]] = llIlIlIII[6];
        if (Z.lIllIIlIlIlI(Bank.contains((int[])nArray6) ? 1 : 0)) {
            lIIllIIlIIIIIl = new d(llIlIlIII[6], llIlIlIII[3], llIlIlIII[50]);
            bx.add((d)lIIllIIlIIIIIl);
            "".length();
        }
        int[] nArray7 = new int[llIlIlIII[1]];
        nArray7[Z.llIlIlIII[0]] = llIlIlIII[6];
        if (Z.lIllIIlIlIII(Bank.contains((int[])nArray7) ? 1 : 0)) {
            int[] nArray8 = new int[llIlIlIII[1]];
            nArray8[Z.llIlIlIII[0]] = llIlIlIII[6];
            if (Z.lIllIIlIlIIl(Bank.getFirst((int[])nArray8).getQuantity(), llIlIlIII[32])) {
                lIIllIIlIIIIIl = new d(llIlIlIII[6], llIlIlIII[53], llIlIlIII[54]);
                bx.add((d)lIIllIIlIIIIIl);
                "".length();
            }
        }
        if (Z.lIllIIlIlIlI(Bank.contains((Predicate)(lIIllIIlIIIIIl = item -> item.getName().toLowerCase().contains(llIlIIlll[llIlIlIII[61]]))) ? 1 : 0)) {
            lIIllIIlIIIIII = new d(llIlIlIII[55], llIlIlIII[11], llIlIlIII[56]);
            bx.add(lIIllIIlIIIIII);
            "".length();
        }
        int[] nArray9 = new int[llIlIlIII[1]];
        nArray9[Z.llIlIlIII[0]] = llIlIlIII[16];
        if (Z.lIllIIlIlIlI(Bank.contains((int[])nArray9) ? 1 : 0)) {
            lIIllIIlIIIIII = new d(llIlIlIII[16], llIlIlIII[53], llIlIlIII[57]);
            bx.add(lIIllIIlIIIIII);
            "".length();
        }
        int[] nArray10 = new int[llIlIlIII[1]];
        nArray10[Z.llIlIlIII[0]] = llIlIlIII[58];
        if (Z.lIllIIlIlIlI(Bank.contains((int[])nArray10) ? 1 : 0)) {
            lIIllIIlIIIIII = new d(llIlIlIII[58], llIlIlIII[11], j.ch);
            bx.add(lIIllIIlIIIIII);
            "".length();
        }
    }

    @Override
    public int af() {
        try {
            Z.dO();
            "".length();
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (" ".length() <= 0) {
            return (0xED ^ 0xBB) & ~(0xC9 ^ 0x9F);
        }
        return llIlIlIII[59];
    }

    private static String lIllIIlIIIlI(String lIIllIIIIlllII, String lIIllIIIIlllIl) {
        try {
            SecretKeySpec lIIllIIIlIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIllIIIIlllIl.getBytes(StandardCharsets.UTF_8)), llIlIlIII[21]), "DES");
            Cipher lIIllIIIlIIIII = Cipher.getInstance("DES");
            lIIllIIIlIIIII.init(llIlIlIII[5], lIIllIIIlIIIIl);
            return new String(lIIllIIIlIIIII.doFinal(Base64.getDecoder().decode(lIIllIIIIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIllIIIIlllll) {
            lIIllIIIIlllll.printStackTrace();
            return null;
        }
    }

    static {
        Z.lIllIIlIIllI();
        Z.lIllIIlIIlIl();
        lM = new WorldPoint(llIlIlIII[62], llIlIlIII[63], llIlIlIII[0]);
        lN = new WorldPoint(llIlIlIII[64], llIlIlIII[65], llIlIlIII[0]);
        lO = new WorldPoint(llIlIlIII[66], llIlIlIII[67], llIlIlIII[0]);
        lP = new WorldPoint(llIlIlIII[68], llIlIlIII[69], llIlIlIII[0]);
        String[] stringArray = new String[llIlIlIII[10]];
        stringArray[Z.llIlIlIII[0]] = llIlIIlll[llIlIlIII[70]];
        stringArray[Z.llIlIlIII[1]] = llIlIIlll[llIlIlIII[53]];
        stringArray[Z.llIlIlIII[5]] = llIlIIlll[llIlIlIII[71]];
        stringArray[Z.llIlIlIII[7]] = llIlIIlll[llIlIlIII[72]];
        lQ = stringArray;
        bx = new ArrayList<d>();
        cI = llIlIlIII[0];
    }

    private static boolean lIllIIllIIII(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public boolean ah() {
        int n2;
        if (Z.lIllIIllIIll(e.j(llIlIlIII[9]), llIlIlIII[7]) && Z.lIllIIlIllll(Players.getLocal().getWorldLocation().distanceTo(lP), llIlIlIII[43])) {
            n2 = llIlIlIII[1];
            "".length();
            if (-" ".length() > ((5 ^ 0x6C ^ (0x35 ^ 0x14)) & (0xBE ^ 0xA2 ^ (0xED ^ 0xB9) ^ -" ".length()))) {
                return ((0x14 ^ 0x5A ^ (0xBE ^ 0xA9)) & (0x32 ^ 0x5E ^ (0x92 ^ 0xA7) ^ -" ".length())) != 0;
            }
        } else {
            n2 = llIlIlIII[0];
        }
        return n2 != 0;
    }

    private static boolean lIllIIlIlIll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIllIIlIlIII(int n2) {
        return n2 != 0;
    }
}

