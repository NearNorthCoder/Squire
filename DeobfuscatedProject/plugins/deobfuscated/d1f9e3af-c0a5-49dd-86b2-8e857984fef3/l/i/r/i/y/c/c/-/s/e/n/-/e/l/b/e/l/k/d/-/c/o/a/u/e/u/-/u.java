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
package l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-;

import gg.squire.account.AccBuilderEasyClues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.W;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.a;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.an;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.b;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.d;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.e;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.f;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.g;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.i;
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

public class u
implements W {
    private static /* synthetic */ String[] lIlIllIIl;
    public static final /* synthetic */ WorldPoint cJ;
    public static final /* synthetic */ WorldPoint cK;
    static /* synthetic */ int bT;
    public static final /* synthetic */ WorldPoint cI;
    private static /* synthetic */ String[] bR;
    public static /* synthetic */ List<d> bv;
    static /* synthetic */ int cl;
    public static /* synthetic */ boolean bt;
    private static /* synthetic */ int[] lIlIllIlI;
    static /* synthetic */ boolean cm;

    @Override
    public int T() {
        try {
            u.aO();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (((0xCA ^ 0x9D) & ~(0x7F ^ 0x28)) > 2) {
            return (0x99 ^ 0x84) & ~(0x31 ^ 0x2C);
        }
        return lIlIllIlI[51];
    }

    private static boolean lIIlIIlIIIll(int n2) {
        return n2 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ab() {
        int n2;
        String[] stringArray = new String[lIlIllIlI[1]];
        stringArray[u.lIlIllIlI[0]] = lIlIllIIl[lIlIllIlI[40]];
        if (u.lIIlIIlIIlll(Inventory.getCount((String[])stringArray))) {
            String[] stringArray2 = new String[lIlIllIlI[1]];
            stringArray2[u.lIlIllIlI[0]] = lIlIllIIl[lIlIllIlI[41]];
            if (u.lIIlIIlIIlll(Inventory.getCount((String[])stringArray2))) {
                String[] stringArray3 = new String[lIlIllIlI[1]];
                stringArray3[u.lIlIllIlI[0]] = lIlIllIIl[lIlIllIlI[42]];
                if (u.lIIlIIlIIlll(Inventory.getCount((String[])stringArray3))) {
                    String[] stringArray4 = new String[lIlIllIlI[1]];
                    stringArray4[u.lIlIllIlI[0]] = lIlIllIIl[lIlIllIlI[43]];
                    if (u.lIIlIIlIIlll(Inventory.getCount((String[])stringArray4))) {
                        n2 = lIlIllIlI[1];
                        0;
                        if (3 < (0x1B ^ 0x1F)) return n2 != 0;
                        return (3 & ~3) != 0;
                    }
                }
            }
        }
        n2 = lIlIllIlI[0];
        return n2 != 0;
    }

    private static String lIIlIIIlllIl(String lllIIIlIIllllI, String lllIIIlIIlllIl) {
        try {
            SecretKeySpec lllIIIlIlIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIIIlIIlllIl.getBytes(StandardCharsets.UTF_8)), lIlIllIlI[19]), "DES");
            Cipher lllIIIlIlIIIII = Cipher.getInstance("DES");
            lllIIIlIlIIIII.init(lIlIllIlI[3], lllIIIlIlIIIIl);
            return new String(lllIIIlIlIIIII.doFinal(Base64.getDecoder().decode(lllIIIlIIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIIIlIIlllll) {
            lllIIIlIIlllll.printStackTrace();
            return null;
        }
    }

    private static String lIIlIIIllllI(String lllIIIlIIIllll, String lllIIIlIIIlllI) {
        try {
            SecretKeySpec lllIIIlIIlIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIIIlIIIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllIIIlIIlIIll = Cipher.getInstance("Blowfish");
            lllIIIlIIlIIll.init(lIlIllIlI[3], lllIIIlIIlIlII);
            return new String(lllIIIlIIlIIll.doFinal(Base64.getDecoder().decode(lllIIIlIIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIIIlIIlIIlI) {
            lllIIIlIIlIIlI.printStackTrace();
            return null;
        }
    }

    public static void aO() {
        block40: {
            BankLocation lllIIIllIIlIII;
            block42: {
                block41: {
                    if (u.lIIlIIlIIIll(bt ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIlIllIIl[lIlIllIlI[0]];
                        b.a(bv);
                        if (u.lIIlIIlIIlII(bv.size(), lIlIllIlI[1])) {
                            System.out.println(lIlIllIIl[lIlIllIlI[1]]);
                            bt = lIlIllIlI[0];
                        }
                    }
                    if (!u.lIIlIIlIIlIl(bt ? 1 : 0)) break block40;
                    if (u.lIIlIIlIIIll(Inventory.contains((int[])f.aV) ? 1 : 0) && u.lIIlIIlIIlII(Movement.getRunEnergy(), lIlIllIlI[2])) {
                        Inventory.getFirst((int[])f.aV).interact(lIlIllIIl[lIlIllIlI[3]]);
                        Time.sleepTicks((int)lIlIllIlI[1]);
                        0;
                    }
                    if (u.lIIlIIlIIllI(u.lIIlIIlIIIlI(e.u(), 70.0))) {
                        int[] nArray = new int[lIlIllIlI[1]];
                        nArray[u.lIlIllIlI[0]] = lIlIllIlI[4];
                        if (u.lIIlIIlIIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray2 = new int[lIlIllIlI[1]];
                            nArray2[u.lIlIllIlI[0]] = lIlIllIlI[4];
                            Inventory.getFirst((int[])nArray2).interact(lIlIllIIl[lIlIllIlI[5]]);
                        }
                    }
                    if (u.lIIlIIlIIlIl(Movement.isRunEnabled() ? 1 : 0) && u.lIIlIIlIIlll(Movement.getRunEnergy())) {
                        Movement.toggleRun();
                    }
                    if (!u.lIIlIIlIIIll(u.ab() ? 1 : 0)) break block41;
                    int[] nArray = new int[lIlIllIlI[1]];
                    nArray[u.lIlIllIlI[0]] = lIlIllIlI[6];
                    if (!u.lIIlIIlIIlll(Inventory.getCount((int[])nArray))) break block42;
                }
                if (u.lIIlIIlIIlII(e.j(lIlIllIlI[7]), lIlIllIlI[1])) {
                    lllIIIllIIlIII = BankLocation.getNearest();
                    if (u.lIIlIIlIlIII(lllIIIllIIlIII) && u.lIIlIIlIIlIl(lllIIIllIIlIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIlIllIIl[lIlIllIlI[8]];
                        a.a(lllIIIllIIlIII);
                        Time.sleepTicks((int)lIlIllIlI[3]);
                        0;
                    }
                    if (u.lIIlIIlIlIII(lllIIIllIIlIII) && u.lIIlIIlIIIll(lllIIIllIIlIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIlIllIIl[lIlIllIlI[9]];
                        if (u.lIIlIIlIIlIl(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)lIlIllIlI[10]);
                            0;
                        }
                        if (u.lIIlIIlIIIll(Bank.isOpen() ? 1 : 0)) {
                            if (u.lIIlIIlIIlll(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lIlIllIlI[8]);
                                0;
                            }
                            if (u.lIIlIIlIIlll(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)lIlIllIlI[3]);
                                0;
                            }
                            int[] nArray = new int[lIlIllIlI[9]];
                            nArray[u.lIlIllIlI[0]] = lIlIllIlI[11];
                            nArray[u.lIlIllIlI[1]] = lIlIllIlI[12];
                            nArray[u.lIlIllIlI[3]] = lIlIllIlI[13];
                            nArray[u.lIlIllIlI[5]] = lIlIllIlI[14];
                            nArray[u.lIlIllIlI[8]] = lIlIllIlI[4];
                            if (u.lIIlIIlIIlIl(e.b(nArray) ? 1 : 0)) {
                                u.af();
                                System.out.println(lIlIllIIl[lIlIllIlI[15]]);
                                bt = lIlIllIlI[1];
                                return;
                            }
                            int[] nArray3 = new int[lIlIllIlI[9]];
                            nArray3[u.lIlIllIlI[0]] = lIlIllIlI[11];
                            nArray3[u.lIlIllIlI[1]] = lIlIllIlI[12];
                            nArray3[u.lIlIllIlI[3]] = lIlIllIlI[13];
                            nArray3[u.lIlIllIlI[5]] = lIlIllIlI[14];
                            nArray3[u.lIlIllIlI[8]] = lIlIllIlI[4];
                            if (u.lIIlIIlIIIll(e.b(nArray3) ? 1 : 0)) {
                                Bank.withdraw((int)lIlIllIlI[11], (int)lIlIllIlI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)lIlIllIlI[1]);
                                0;
                                Bank.withdraw((int)lIlIllIlI[12], (int)lIlIllIlI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)lIlIllIlI[1]);
                                0;
                                Bank.withdraw((int)lIlIllIlI[13], (int)lIlIllIlI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)lIlIllIlI[1]);
                                0;
                                Bank.withdraw((int)lIlIllIlI[14], (int)lIlIllIlI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)lIlIllIlI[1]);
                                0;
                                a.a(lIlIllIlI[16], lIlIllIlI[9]);
                                a.b(f.aV, lIlIllIlI[9]);
                                a.a(lIlIllIlI[4], lIlIllIlI[17]);
                                a.b(f.bf, lIlIllIlI[1]);
                            }
                        }
                    }
                }
            }
            if (u.lIIlIIlIIIll(u.ab() ? 1 : 0) && u.lIIlIIlIIlII(e.j(lIlIllIlI[7]), lIlIllIlI[1])) {
                if (u.lIIlIIlIlIIl(Players.getLocal().getWorldLocation().distanceTo(cI), lIlIllIlI[5])) {
                    AccBuilderEasyClues.c = lIlIllIIl[lIlIllIlI[18]];
                    if (u.lIIlIIlIIlII(bT, lIlIllIlI[1])) {
                        e.v();
                        bT += lIlIllIlI[1];
                    }
                    Movement.walkTo((WorldPoint)cI);
                    0;
                    Time.sleepTicks((int)lIlIllIlI[1]);
                    0;
                }
                if (u.lIIlIIlIlIlI(Players.getLocal().getWorldLocation().distanceTo(cI), lIlIllIlI[5])) {
                    AccBuilderEasyClues.c = lIlIllIIl[lIlIllIlI[19]];
                    g.a(lIlIllIIl[lIlIllIlI[20]], bR);
                }
            }
            if (u.lIIlIIlIlIll(e.j(lIlIllIlI[7]), lIlIllIlI[1])) {
                cl = lIlIllIlI[0];
                if (u.lIIlIIlIlIIl(Players.getLocal().getWorldLocation().distanceTo(cJ), lIlIllIlI[5])) {
                    AccBuilderEasyClues.c = lIlIllIIl[lIlIllIlI[17]];
                    Movement.walkTo((WorldPoint)cJ);
                    0;
                    Time.sleepTicks((int)lIlIllIlI[1]);
                    0;
                }
                if (u.lIIlIIlIlIlI(Players.getLocal().getWorldLocation().distanceTo(cJ), lIlIllIlI[5])) {
                    AccBuilderEasyClues.c = lIlIllIIl[lIlIllIlI[21]];
                    g.a(lIlIllIIl[lIlIllIlI[22]], bR);
                }
            }
            if (u.lIIlIIlIlIll(e.j(lIlIllIlI[7]), lIlIllIlI[3]) && u.lIIlIIlIIlIl(u.aP() ? 1 : 0)) {
                if (u.lIIlIIlIlIIl(Players.getLocal().getWorldLocation().distanceTo(cK), lIlIllIlI[5])) {
                    AccBuilderEasyClues.c = lIlIllIIl[lIlIllIlI[23]];
                    Movement.walkTo((WorldPoint)cK);
                    0;
                    Time.sleepTicks((int)lIlIllIlI[1]);
                    0;
                }
                if (u.lIIlIIlIlIlI(Players.getLocal().getWorldLocation().distanceTo(cK), lIlIllIlI[5])) {
                    AccBuilderEasyClues.c = lIlIllIIl[lIlIllIlI[24]];
                    int[] nArray = new int[lIlIllIlI[1]];
                    nArray[u.lIlIllIlI[0]] = lIlIllIlI[25];
                    lllIIIllIIlIII = TileObjects.getNearest((int[])nArray);
                    if (u.lIIlIIlIlIII(lllIIIllIIlIII)) {
                        String[] stringArray = new String[lIlIllIlI[1]];
                        stringArray[u.lIlIllIlI[0]] = lIlIllIIl[lIlIllIlI[26]];
                        Item lllIIIllIIIlll = Inventory.getFirst((String[])stringArray);
                        String[] stringArray2 = new String[lIlIllIlI[1]];
                        stringArray2[u.lIlIllIlI[0]] = lIlIllIIl[lIlIllIlI[27]];
                        Item lllIIIllIIIllI = Inventory.getFirst((String[])stringArray2);
                        String[] stringArray3 = new String[lIlIllIlI[1]];
                        stringArray3[u.lIlIllIlI[0]] = lIlIllIIl[lIlIllIlI[28]];
                        Item lllIIIllIIIlIl = Inventory.getFirst((String[])stringArray3);
                        String[] stringArray4 = new String[lIlIllIlI[1]];
                        stringArray4[u.lIlIllIlI[0]] = lIlIllIIl[lIlIllIlI[29]];
                        Item lllIIIllIIIlII = Inventory.getFirst((String[])stringArray4);
                        if (u.lIIlIIlIlIII(lllIIIllIIIlll)) {
                            lllIIIllIIIlll.useOn((TileObject)lllIIIllIIlIII);
                            Time.sleepTicks((int)lIlIllIlI[1]);
                            0;
                        }
                        if (u.lIIlIIlIlIII(lllIIIllIIIllI)) {
                            lllIIIllIIIllI.useOn((TileObject)lllIIIllIIlIII);
                            Time.sleepTicks((int)lIlIllIlI[1]);
                            0;
                        }
                        if (u.lIIlIIlIlIII(lllIIIllIIIlIl)) {
                            lllIIIllIIIlIl.useOn((TileObject)lllIIIllIIlIII);
                            Time.sleepTicks((int)lIlIllIlI[1]);
                            0;
                        }
                        if (u.lIIlIIlIlIII(lllIIIllIIIlII)) {
                            lllIIIllIIIlII.useOn((TileObject)lllIIIllIIlIII);
                            Time.sleepTicks((int)lIlIllIlI[1]);
                            0;
                        }
                    }
                }
            }
            if (u.lIIlIIlIlIll(e.j(lIlIllIlI[7]), lIlIllIlI[3]) && u.lIIlIIlIIIll(u.aP() ? 1 : 0)) {
                if (u.lIIlIIlIlIIl(Players.getLocal().getWorldLocation().distanceTo(cJ), lIlIllIlI[5])) {
                    AccBuilderEasyClues.c = lIlIllIIl[lIlIllIlI[30]];
                    Movement.walkTo((WorldPoint)cJ);
                    0;
                    Time.sleepTicks((int)lIlIllIlI[1]);
                    0;
                }
                if (u.lIIlIIlIlIlI(Players.getLocal().getWorldLocation().distanceTo(cJ), lIlIllIlI[5])) {
                    AccBuilderEasyClues.c = lIlIllIIl[lIlIllIlI[31]];
                    g.a(lIlIllIIl[lIlIllIlI[32]], bR);
                }
            }
            if (u.lIIlIIlIlIll(e.j(lIlIllIlI[7]), lIlIllIlI[5])) {
                if (u.lIIlIIlIlIIl(Players.getLocal().getWorldLocation().distanceTo(cI), lIlIllIlI[5])) {
                    AccBuilderEasyClues.c = lIlIllIIl[lIlIllIlI[33]];
                    Movement.walkTo((WorldPoint)cI);
                    0;
                    Time.sleepTicks((int)lIlIllIlI[1]);
                    0;
                }
                if (u.lIIlIIlIlIlI(Players.getLocal().getWorldLocation().distanceTo(cI), lIlIllIlI[5])) {
                    AccBuilderEasyClues.c = lIlIllIIl[lIlIllIlI[34]];
                    if (u.lIIlIIlIIlII(cl, lIlIllIlI[1])) {
                        an.mI += lIlIllIlI[1];
                        an.o(AccBuilderEasyClues.m);
                        cl += lIlIllIlI[1];
                        an.mI = lIlIllIlI[0];
                    }
                    g.a(lIlIllIIl[lIlIllIlI[35]], bR);
                }
            }
            g.a(bR);
        }
    }

    private static String lIIlIIIlllll(String lllIIIlIllIIll, String lllIIIlIlIllIl) {
        lllIIIlIllIIll = new String(Base64.getDecoder().decode(lllIIIlIllIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllIIIlIllIIIl = new StringBuilder();
        char[] lllIIIlIllIIII = lllIIIlIlIllIl.toCharArray();
        int lllIIIlIlIllll = lIlIllIlI[0];
        char[] lllIIIlIlIlIIl = lllIIIlIllIIll.toCharArray();
        int lllIIIlIlIlIII = lllIIIlIlIlIIl.length;
        int lllIIIlIlIIlll = lIlIllIlI[0];
        while (u.lIIlIIlIIlII(lllIIIlIlIIlll, lllIIIlIlIlIII)) {
            char lllIIIlIllIlII = lllIIIlIlIlIIl[lllIIIlIlIIlll];
            lllIIIlIllIIIl.append((char)(lllIIIlIllIlII ^ lllIIIlIllIIII[lllIIIlIlIllll % lllIIIlIllIIII.length]));
            0;
            ++lllIIIlIlIllll;
            ++lllIIIlIlIIlll;
            0;
            if (-1 < 0) continue;
            return null;
        }
        return String.valueOf(lllIIIlIllIIIl);
    }

    private static int lIIlIIlIIIlI(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean aP() {
        int n2;
        String[] stringArray = new String[lIlIllIlI[1]];
        stringArray[u.lIlIllIlI[0]] = lIlIllIIl[lIlIllIlI[36]];
        if (u.lIIlIIlIIlll(Inventory.getCount((String[])stringArray))) {
            String[] stringArray2 = new String[lIlIllIlI[1]];
            stringArray2[u.lIlIllIlI[0]] = lIlIllIIl[lIlIllIlI[37]];
            if (u.lIIlIIlIIlll(Inventory.getCount((String[])stringArray2))) {
                String[] stringArray3 = new String[lIlIllIlI[1]];
                stringArray3[u.lIlIllIlI[0]] = lIlIllIIl[lIlIllIlI[38]];
                if (u.lIIlIIlIIlll(Inventory.getCount((String[])stringArray3))) {
                    String[] stringArray4 = new String[lIlIllIlI[1]];
                    stringArray4[u.lIlIllIlI[0]] = lIlIllIIl[lIlIllIlI[39]];
                    if (u.lIIlIIlIIlll(Inventory.getCount((String[])stringArray4))) {
                        n2 = lIlIllIlI[1];
                        0;
                        if ((0x7F ^ 0x7B) != 0) return n2 != 0;
                        return ((0x50 ^ 0x79) & ~(0xA4 ^ 0x8D)) != 0;
                    }
                }
            }
        }
        n2 = lIlIllIlI[0];
        return n2 != 0;
    }

    @Override
    public String U() {
        return lIlIllIIl[lIlIllIlI[52]];
    }

    private static boolean lIIlIIlIIlIl(int n2) {
        return n2 == 0;
    }

    private static void lIIlIIlIIIII() {
        lIlIllIIl = new String[lIlIllIlI[49]];
        u.lIlIllIIl[u.lIlIllIlI[0]] = u."Buying items";
        u.lIlIllIIl[u.lIlIllIlI[1]] = u."Finished buying items, switching back to quest";
        u.lIlIllIIl[u.lIlIllIlI[3]] = u."Drink";
        u.lIlIllIIl[u.lIlIllIlI[5]] = u."Eat";
        u.lIlIllIIl[u.lIlIllIlI[8]] = u."Nav to bank";
        u.lIlIllIIl[u.lIlIllIlI[9]] = u."Handling banking";
        u.lIlIllIIl[u.lIlIllIlI[15]] = u."We are missing quest supplies, switching to BUYING";
        u.lIlIllIIl[u.lIlIllIlI[18]] = u."Nav to start";
        u.lIlIllIIl[u.lIlIllIlI[19]] = u."Talk npc";
        u.lIlIllIIl[u.lIlIllIlI[20]] = u."Kaqemeex";
        u.lIlIllIIl[u.lIlIllIlI[17]] = u."Nav to sanfew";
        u.lIlIllIIl[u.lIlIllIlI[21]] = u."Talk sanfew";
        u.lIlIllIIl[u.lIlIllIlI[22]] = u."Sanfew";
        u.lIlIllIIl[u.lIlIllIlI[23]] = u."Nav to couldren";
        u.lIlIllIIl[u.lIlIllIlI[24]] = u."Enchanting";
        u.lIlIllIIl[u.lIlIllIlI[26]] = u."Raw beef";
        u.lIlIllIIl[u.lIlIllIlI[27]] = u."Raw rat meat";
        u.lIlIllIIl[u.lIlIllIlI[28]] = u."Raw chicken";
        u.lIlIllIIl[u.lIlIllIlI[29]] = u."Raw bear meat";
        u.lIlIllIIl[u.lIlIllIlI[30]] = u."Nav to sanfew";
        u.lIlIllIIl[u.lIlIllIlI[31]] = u."Talk sanfew";
        u.lIlIllIIl[u.lIlIllIlI[32]] = u."Sanfew";
        u.lIlIllIIl[u.lIlIllIlI[33]] = u."Nav to start";
        u.lIlIllIIl[u.lIlIllIlI[34]] = u."Talk npc";
        u.lIlIllIIl[u.lIlIllIlI[35]] = u."Kaqemeex";
        u.lIlIllIIl[u.lIlIllIlI[36]] = u."Enchanted bear";
        u.lIlIllIIl[u.lIlIllIlI[37]] = u."Enchanted chicken";
        u.lIlIllIIl[u.lIlIllIlI[38]] = u."Enchanted rat";
        u.lIlIllIIl[u.lIlIllIlI[39]] = u."Enchanted beef";
        u.lIlIllIIl[u.lIlIllIlI[40]] = u."Raw chicken";
        u.lIlIllIIl[u.lIlIllIlI[41]] = u."Raw beef";
        u.lIlIllIIl[u.lIlIllIlI[42]] = u."Raw bear meat";
        u.lIlIllIIl[u.lIlIllIlI[43]] = u."Raw rat meat";
        u.lIlIllIIl[u.lIlIllIlI[52]] = u."Druidic ritual quest";
        u.lIlIllIIl[u.lIlIllIlI[53]] = u."ring of wealth (";
        u.lIlIllIIl[u.lIlIllIlI[60]] = u."I'm in search of a quest.";
        u.lIlIllIIl[u.lIlIllIlI[61]] = u."Okay, I will try and help.";
        u.lIlIllIIl[u.lIlIllIlI[62]] = u."Yes.";
        u.lIlIllIIl[u.lIlIllIlI[63]] = u."I've been sent to help purify the Varrock stone circle.";
        u.lIlIllIIl[u.lIlIllIlI[64]] = u."Ok, I'll do that then.";
    }

    private static boolean lIIlIIlIlIll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIlIIlIIlll(int n2) {
        return n2 > 0;
    }

    private static boolean lIIlIIlIIllI(int n2) {
        return n2 < 0;
    }

    private static void af() {
        d lllIIIllIIIIII;
        Object lllIIIllIIIIIl;
        int[] nArray = new int[lIlIllIlI[1]];
        nArray[u.lIlIllIlI[0]] = lIlIllIlI[44];
        if (u.lIIlIIlIIlIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(lIlIllIlI[44], lIlIllIlI[9], i.bq);
            bv.add(d2);
            0;
        }
        int[] nArray2 = new int[lIlIllIlI[1]];
        nArray2[u.lIlIllIlI[0]] = lIlIllIlI[11];
        if (u.lIIlIIlIIlIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lllIIIllIIIIIl = new d(lIlIllIlI[11], lIlIllIlI[1], lIlIllIlI[45]);
            bv.add((d)lllIIIllIIIIIl);
            0;
        }
        int[] nArray3 = new int[lIlIllIlI[1]];
        nArray3[u.lIlIllIlI[0]] = lIlIllIlI[12];
        if (u.lIIlIIlIIlIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lllIIIllIIIIIl = new d(lIlIllIlI[12], lIlIllIlI[1], lIlIllIlI[45]);
            bv.add((d)lllIIIllIIIIIl);
            0;
        }
        int[] nArray4 = new int[lIlIllIlI[1]];
        nArray4[u.lIlIllIlI[0]] = lIlIllIlI[14];
        if (u.lIIlIIlIIlIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
            lllIIIllIIIIIl = new d(lIlIllIlI[14], lIlIllIlI[1], lIlIllIlI[45]);
            bv.add((d)lllIIIllIIIIIl);
            0;
        }
        int[] nArray5 = new int[lIlIllIlI[1]];
        nArray5[u.lIlIllIlI[0]] = lIlIllIlI[13];
        if (u.lIIlIIlIIlIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
            lllIIIllIIIIIl = new d(lIlIllIlI[13], lIlIllIlI[1], lIlIllIlI[45]);
            bv.add((d)lllIIIllIIIIIl);
            0;
        }
        int[] nArray6 = new int[lIlIllIlI[1]];
        nArray6[u.lIlIllIlI[0]] = lIlIllIlI[4];
        if (u.lIIlIIlIIlIl(Bank.contains((int[])nArray6) ? 1 : 0)) {
            lllIIIllIIIIIl = new d(lIlIllIlI[4], lIlIllIlI[17], lIlIllIlI[45]);
            bv.add((d)lllIIIllIIIIIl);
            0;
        }
        if (u.lIIlIIlIIlIl(Bank.contains((Predicate)(lllIIIllIIIIIl = item -> item.getName().toLowerCase().contains(lIlIllIIl[lIlIllIlI[53]]))) ? 1 : 0)) {
            lllIIIllIIIIII = new d(lIlIllIlI[46], lIlIllIlI[9], lIlIllIlI[47]);
            bv.add(lllIIIllIIIIII);
            0;
        }
        int[] nArray7 = new int[lIlIllIlI[1]];
        nArray7[u.lIlIllIlI[0]] = lIlIllIlI[48];
        if (u.lIIlIIlIIlIl(Bank.contains((int[])nArray7) ? 1 : 0)) {
            lllIIIllIIIIII = new d(lIlIllIlI[48], lIlIllIlI[49], lIlIllIlI[50]);
            bv.add(lllIIIllIIIIII);
            0;
        }
    }

    private static boolean lIIlIIlIIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlIIlIlIlI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIIlIIlIlIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIlIIlIllll(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public boolean S() {
        return lIlIllIlI[0];
    }

    @Override
    public boolean V() {
        boolean bl;
        if (u.lIIlIIlIllll(e.j(lIlIllIlI[7]), lIlIllIlI[8])) {
            bl = lIlIllIlI[1];
            0;
            if (1 >= 3) {
                return ((0x3F ^ 0x48 ^ (0x4E ^ 0x73)) & (0x60 ^ 0x4B ^ (0x57 ^ 0x36) ^ -1)) != 0;
            }
        } else {
            bl = lIlIllIlI[0];
        }
        return bl;
    }

    private static boolean lIIlIIlIlIII(Object object) {
        return object != null;
    }

    static {
        u.lIIlIIlIIIIl();
        u.lIIlIIlIIIII();
        cI = new WorldPoint(lIlIllIlI[54], lIlIllIlI[55], lIlIllIlI[0]);
        cJ = new WorldPoint(lIlIllIlI[56], lIlIllIlI[57], lIlIllIlI[1]);
        cK = new WorldPoint(lIlIllIlI[58], lIlIllIlI[59], lIlIllIlI[0]);
        bv = new ArrayList<d>();
        bT = lIlIllIlI[0];
        String[] stringArray = new String[lIlIllIlI[9]];
        stringArray[u.lIlIllIlI[0]] = lIlIllIIl[lIlIllIlI[60]];
        stringArray[u.lIlIllIlI[1]] = lIlIllIIl[lIlIllIlI[61]];
        stringArray[u.lIlIllIlI[3]] = lIlIllIIl[lIlIllIlI[62]];
        stringArray[u.lIlIllIlI[5]] = lIlIllIIl[lIlIllIlI[63]];
        stringArray[u.lIlIllIlI[8]] = lIlIllIIl[lIlIllIlI[64]];
        bR = stringArray;
    }

    private static void lIIlIIlIIIIl() {
        lIlIllIlI = new int[65];
        u.lIlIllIlI[0] = (0x6B ^ 0x56) & ~(0x9E ^ 0xA3);
        u.lIlIllIlI[1] = 1;
        u.lIlIllIlI[2] = 0x5D ^ 0x6F;
        u.lIlIllIlI[3] = 2;
        u.lIlIllIlI[4] = -(0xFFFFCEAF & 0x79D5) & (0xFFFFEBFF & 0x5DFF);
        u.lIlIllIlI[5] = 3;
        u.lIlIllIlI[6] = 0xFFFFFBEF & 0x7F3;
        u.lIlIllIlI[7] = 0x1D ^ 0x50 ^ (0x84 ^ 0x99);
        u.lIlIllIlI[8] = 8 ^ 0xC;
        u.lIlIllIlI[9] = 0x47 ^ 0x42;
        u.lIlIllIlI[10] = -(0xFFFFCFB7 & 0x7C7B) & (0xFFFFDFBF & 0x7FFA);
        u.lIlIllIlI[11] = 0xFFFFD97F & 0x2EDA;
        u.lIlIllIlI[12] = -(0xFFFFF99F & 0x37EB) & (0xFFFFBFDE & 0x79FF);
        u.lIlIllIlI[13] = -(0xFFFFF6AE & 0x5BF5) & (0xFFFFDBFF & 0x7EFB);
        u.lIlIllIlI[14] = -(0xFFFFD9EF & 0x7612) & (0xFFFFDF7F & 0x78D7);
        u.lIlIllIlI[15] = 18 + 113 - 120 + 122 ^ 98 + 16 - 27 + 44;
        u.lIlIllIlI[16] = -(0xB0 ^ 0x95) & (0xFFFF9FFF & 0x7F6D);
        u.lIlIllIlI[17] = 0xA5 ^ 0xAF;
        u.lIlIllIlI[18] = 0x90 ^ 0x97;
        u.lIlIllIlI[19] = 113 + 38 - 130 + 121 ^ 121 + 14 - 119 + 118;
        u.lIlIllIlI[20] = 0xA9 ^ 0xA0;
        u.lIlIllIlI[21] = 0x85 ^ 0x8E;
        u.lIlIllIlI[22] = 0x20 ^ 0x55 ^ (0xDD ^ 0xA4);
        u.lIlIllIlI[23] = 137 + 61 - 194 + 136 ^ 17 + 99 - 46 + 59;
        u.lIlIllIlI[24] = 0x98 ^ 0x96;
        u.lIlIllIlI[25] = 0xFFFFDD5F & 0x2AFE;
        u.lIlIllIlI[26] = 0x2F ^ 0x20;
        u.lIlIllIlI[27] = 0x46 ^ 0x56;
        u.lIlIllIlI[28] = 2 ^ 0x13;
        u.lIlIllIlI[29] = 0x53 ^ 0x41;
        u.lIlIllIlI[30] = 0x53 ^ 0x40;
        u.lIlIllIlI[31] = 139 + 32 - 37 + 40 ^ 180 + 173 - 316 + 149;
        u.lIlIllIlI[32] = 0xD6 ^ 0xC3;
        u.lIlIllIlI[33] = 0x21 ^ 0x37;
        u.lIlIllIlI[34] = 0x22 ^ 0x2B ^ (0 ^ 0x1E);
        u.lIlIllIlI[35] = 22 + 102 - 53 + 61 ^ 54 + 73 - 85 + 114;
        u.lIlIllIlI[36] = 89 + 74 - 43 + 69 ^ 112 + 102 - 130 + 80;
        u.lIlIllIlI[37] = 0x6C ^ 0x76;
        u.lIlIllIlI[38] = 9 ^ 0x68 ^ (0xD ^ 0x77);
        u.lIlIllIlI[39] = 13 + 151 - 132 + 185 ^ 8 + 140 - 74 + 123;
        u.lIlIllIlI[40] = 0x8A ^ 0x97;
        u.lIlIllIlI[41] = 0x4E ^ 0x39 ^ (0x52 ^ 0x3B);
        u.lIlIllIlI[42] = 51 + 102 - 136 + 112 ^ 139 + 52 - 41 + 8;
        u.lIlIllIlI[43] = 0x90 ^ 0xB0;
        u.lIlIllIlI[44] = -(0xFFFFDEFD & 0x2BAF) & (0xFFFFFBFD & 0x3FFF);
        u.lIlIllIlI[45] = 0xFFFFDF3D & 0x37CE;
        u.lIlIllIlI[46] = 0xFFFFFEDE & 0x2FED;
        u.lIlIllIlI[47] = -(0xFFFFFB5A & 0xEBD) & (0xFFFFEFBF & 0x7BFF);
        u.lIlIllIlI[48] = 0xFFFFBF67 & 0x5FDF;
        u.lIlIllIlI[49] = 0xA2 ^ 0x8C ^ (0xAE ^ 0xA8);
        u.lIlIllIlI[50] = -(0xFFFFE6FB & 0x397D) & (0xFFFFABFC & 0x77FF);
        u.lIlIllIlI[51] = 0xE5 ^ 0xB5 ^ (0xF2 ^ 0xC6);
        u.lIlIllIlI[52] = 0xA8 ^ 0x89;
        u.lIlIllIlI[53] = 0x2B ^ 9;
        u.lIlIllIlI[54] = 0xFFFFAB6F & 0x5FFF;
        u.lIlIllIlI[55] = -(0xFFFFF94F & 0x36F3) & (0xFFFFBDFF & 0x7FDE);
        u.lIlIllIlI[56] = -(0xFFFFBE82 & 0x75FF) & (0xFFFFFFF3 & 0x3FDF);
        u.lIlIllIlI[57] = 0xFFFFADFB & 0x5F67;
        u.lIlIllIlI[58] = -(95 + 106 - 192 + 121) & (0xFFFFBBCD & 0x4FFF);
        u.lIlIllIlI[59] = -(0xFFFFFF7D & 0x4983) & (0xFFFFEF67 & Short.MAX_VALUE);
        u.lIlIllIlI[60] = 103 + 44 - 53 + 53 ^ 105 + 64 - 88 + 95;
        u.lIlIllIlI[61] = 0x2E ^ 0xA;
        u.lIlIllIlI[62] = 76 + 127 - 154 + 91 ^ 97 + 157 - 107 + 22;
        u.lIlIllIlI[63] = 0x56 ^ 0x14 ^ (0x3A ^ 0x5E);
        u.lIlIllIlI[64] = 103 + 9 - 19 + 44 ^ 86 + 67 - 6 + 27;
    }
}

