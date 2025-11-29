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
package o.c.k.i.-.l.o.f.-.n.c.t.e.s;

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
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.O;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.a;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.aN;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.b;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.d;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.e;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.f;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.g;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.j;

public class aa
implements ac {
    public static final /* synthetic */ WorldPoint mJ;
    public static final /* synthetic */ WorldPoint mH;
    public static final /* synthetic */ String[] mL;
    public static /* synthetic */ boolean bt;
    static /* synthetic */ int cG;
    static /* synthetic */ boolean dj;
    public static final /* synthetic */ WorldPoint mI;
    static /* synthetic */ int di;
    public static final /* synthetic */ WorldPoint mK;
    private static /* synthetic */ int[] lllIIIIIll;
    private static /* synthetic */ String[] lllIIIIIlI;
    public static /* synthetic */ List<d> bv;

    private static boolean lIllllIlllIII(int n2, int n3) {
        return n2 > n3;
    }

    public static void ev() {
        block44: {
            BankLocation lllllllllllllllllIllllIllIIIlIll;
            block47: {
                block48: {
                    block46: {
                        block45: {
                            if (aa.lIllllIllIIIl(bt ? 1 : 0)) {
                                AccBuilderSotf.c = lllIIIIIlI[lllIIIIIll[0]];
                                b.a(bv);
                                if (aa.lIllllIllIIlI(bv.size(), lllIIIIIll[1])) {
                                    System.out.println(lllIIIIIlI[lllIIIIIll[1]]);
                                    bt = lllIIIIIll[0];
                                }
                            }
                            if (aa.lIllllIllIIll(bt ? 1 : 0) && aa.lIllllIllIIlI(e.j(lllIIIIIll[2]), lllIIIIIll[3])) {
                                O.db();
                            }
                            if (!aa.lIllllIllIIll(bt ? 1 : 0) || !aa.lIllllIllIlII(e.j(lllIIIIIll[2]), lllIIIIIll[3])) break block44;
                            if (aa.lIllllIllIIIl(Inventory.contains((int[])f.ba) ? 1 : 0) && aa.lIllllIllIIlI(Movement.getRunEnergy(), lllIIIIIll[4])) {
                                Inventory.getFirst((int[])f.ba).interact(lllIIIIIlI[lllIIIIIll[5]]);
                                Time.sleepTicks((int)lllIIIIIll[1]);
                                0;
                            }
                            if (aa.lIllllIllIlIl(aa.lIllllIllIIII(e.w(), 70.0))) {
                                int[] nArray = new int[lllIIIIIll[1]];
                                nArray[aa.lllIIIIIll[0]] = lllIIIIIll[6];
                                if (aa.lIllllIllIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                    int[] nArray2 = new int[lllIIIIIll[1]];
                                    nArray2[aa.lllIIIIIll[0]] = lllIIIIIll[6];
                                    Inventory.getFirst((int[])nArray2).interact(lllIIIIIlI[lllIIIIIll[7]]);
                                }
                            }
                            if (aa.lIllllIllIIll(Movement.isRunEnabled() ? 1 : 0) && aa.lIllllIllIllI(Movement.getRunEnergy())) {
                                Movement.toggleRun();
                            }
                            if (!aa.lIllllIllIIIl(aa.an() ? 1 : 0)) break block45;
                            int[] nArray = new int[lllIIIIIll[1]];
                            nArray[aa.lllIIIIIll[0]] = lllIIIIIll[8];
                            if (!aa.lIllllIllIllI(Inventory.getCount((int[])nArray))) break block46;
                        }
                        if (aa.lIllllIllIIlI(e.j(lllIIIIIll[9]), lllIIIIIll[1])) {
                            lllllllllllllllllIllllIllIIIlIll = BankLocation.getNearest();
                            if (aa.lIllllIllIlll(lllllllllllllllllIllllIllIIIlIll) && aa.lIllllIllIIll(lllllllllllllllllIllllIllIIIlIll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderSotf.c = lllIIIIIlI[lllIIIIIll[10]];
                                a.a(lllllllllllllllllIllllIllIIIlIll);
                                Time.sleepTicks((int)lllIIIIIll[5]);
                                0;
                            }
                            if (aa.lIllllIllIlll(lllllllllllllllllIllllIllIIIlIll) && aa.lIllllIllIIIl(lllllllllllllllllIllllIllIIIlIll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderSotf.c = lllIIIIIlI[lllIIIIIll[11]];
                                if (aa.lIllllIllIIll(Bank.isOpen() ? 1 : 0)) {
                                    a.a();
                                    Time.sleepUntil(() -> Bank.isOpen(), (int)lllIIIIIll[12]);
                                    0;
                                }
                                if (aa.lIllllIllIIIl(Bank.isOpen() ? 1 : 0)) {
                                    if (aa.lIllllIllIllI(Inventory.getAll().size())) {
                                        Bank.depositInventory();
                                        Time.sleepTicks((int)lllIIIIIll[10]);
                                        0;
                                    }
                                    if (aa.lIllllIllIllI(Equipment.getAll().size())) {
                                        Bank.depositEquipment();
                                        Time.sleepTicks((int)lllIIIIIll[5]);
                                        0;
                                    }
                                    int[] nArray = new int[lllIIIIIll[11]];
                                    nArray[aa.lllIIIIIll[0]] = lllIIIIIll[13];
                                    nArray[aa.lllIIIIIll[1]] = lllIIIIIll[14];
                                    nArray[aa.lllIIIIIll[5]] = lllIIIIIll[15];
                                    nArray[aa.lllIIIIIll[7]] = lllIIIIIll[16];
                                    nArray[aa.lllIIIIIll[10]] = lllIIIIIll[17];
                                    if (aa.lIllllIllIIll(e.c(nArray) ? 1 : 0)) {
                                        aa.Q();
                                        System.out.println(lllIIIIIlI[lllIIIIIll[18]]);
                                        bt = lllIIIIIll[1];
                                        return;
                                    }
                                    Bank.withdraw((int)lllIIIIIll[13], (int)lllIIIIIll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lllIIIIIll[1]);
                                    0;
                                    Bank.withdraw((int)lllIIIIIll[14], (int)lllIIIIIll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lllIIIIIll[1]);
                                    0;
                                    Bank.withdraw((int)lllIIIIIll[15], (int)lllIIIIIll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lllIIIIIll[1]);
                                    0;
                                    Bank.withdraw((int)lllIIIIIll[16], (int)lllIIIIIll[11], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lllIIIIIll[1]);
                                    0;
                                    Bank.withdraw((int)lllIIIIIll[19], (int)lllIIIIIll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lllIIIIIll[1]);
                                    0;
                                    Bank.withdraw((int)lllIIIIIll[17], (int)lllIIIIIll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lllIIIIIll[1]);
                                    0;
                                    a.b(f.ba, lllIIIIIll[1]);
                                    a.a(lllIIIIIll[6], lllIIIIIll[3]);
                                    a.b(f.bk, lllIIIIIll[1]);
                                }
                            }
                        }
                    }
                    if (aa.lIllllIllIIIl(aa.an() ? 1 : 0) && aa.lIllllIllIIlI(e.j(lllIIIIIll[9]), lllIIIIIll[1])) {
                        if (aa.lIllllIlllIII(Players.getLocal().getWorldLocation().distanceTo(mH), lllIIIIIll[5])) {
                            AccBuilderSotf.c = lllIIIIIlI[lllIIIIIll[20]];
                            if (aa.lIllllIllIIll(Equipment.contains((int[])f.aW) ? 1 : 0) && aa.lIllllIllIIIl(Inventory.contains((int[])f.aW) ? 1 : 0)) {
                                Inventory.getFirst((int[])f.aW).interact(lllIIIIIlI[lllIIIIIll[21]]);
                                Time.sleepTicks((int)lllIIIIIll[1]);
                                0;
                            }
                            if (aa.lIllllIllIIlI(cG, lllIIIIIll[1])) {
                                e.x();
                                cG += lllIIIIIll[1];
                            }
                            Movement.walkTo((WorldPoint)mH);
                            0;
                            Time.sleepTicks((int)lllIIIIIll[1]);
                            0;
                        }
                        if (aa.lIllllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(mH), lllIIIIIll[7])) {
                            AccBuilderSotf.c = lllIIIIIlI[lllIIIIIll[22]];
                            g.a(lllIIIIIlI[lllIIIIIll[3]], mL);
                        }
                    }
                    if (aa.lIllllIllIlII(e.j(lllIIIIIll[9]), lllIIIIIll[1])) {
                        di = lllIIIIIll[0];
                        if (aa.lIllllIlllIII(Players.getLocal().getWorldLocation().distanceTo(mI), lllIIIIIll[21])) {
                            AccBuilderSotf.c = lllIIIIIlI[lllIIIIIll[23]];
                            Movement.walkTo((WorldPoint)mI);
                            0;
                            Time.sleepTicks((int)lllIIIIIll[1]);
                            0;
                        }
                        if (aa.lIllllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(mI), lllIIIIIll[21])) {
                            AccBuilderSotf.c = lllIIIIIlI[lllIIIIIll[24]];
                            g.a(lllIIIIIlI[lllIIIIIll[25]], mL);
                        }
                    }
                    if (!aa.lIllllIllIlII(e.j(lllIIIIIll[9]), lllIIIIIll[5])) break block47;
                    String[] stringArray = new String[lllIIIIIll[1]];
                    stringArray[aa.lllIIIIIll[0]] = lllIIIIIlI[lllIIIIIll[26]];
                    if (!aa.lIllllIllIIll(Inventory.contains((String[])stringArray) ? 1 : 0)) break block48;
                    String[] stringArray2 = new String[lllIIIIIll[1]];
                    stringArray2[aa.lllIIIIIll[0]] = lllIIIIIlI[lllIIIIIll[27]];
                    if (!aa.lIllllIllIIll(Inventory.contains((String[])stringArray2) ? 1 : 0)) break block47;
                }
                AccBuilderSotf.c = lllIIIIIlI[lllIIIIIll[28]];
                g.a(lllIIIIIlI[lllIIIIIll[29]], mL);
                g.a(mL);
            }
            if (aa.lIllllIllIlII(e.j(lllIIIIIll[9]), lllIIIIIll[5])) {
                String[] stringArray = new String[lllIIIIIll[1]];
                stringArray[aa.lllIIIIIll[0]] = lllIIIIIlI[lllIIIIIll[30]];
                if (aa.lIllllIllIIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray3 = new String[lllIIIIIll[1]];
                    stringArray3[aa.lllIIIIIll[0]] = lllIIIIIlI[lllIIIIIll[31]];
                    if (aa.lIllllIllIIIl(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                        if (aa.lIllllIlllIII(Players.getLocal().getWorldLocation().distanceTo(mJ), lllIIIIIll[5]) && aa.lIllllIlllIII(Players.getLocal().getWorldLocation().distanceTo(mK), lllIIIIIll[3])) {
                            AccBuilderSotf.c = lllIIIIIlI[lllIIIIIll[32]];
                            if (aa.lIllllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(mI), lllIIIIIll[3]) && aa.lIllllIllIIIl(Equipment.contains((int[])f.aW) ? 1 : 0) && aa.lIllllIlllIlI(Players.getLocal().getAnimation(), lllIIIIIll[33])) {
                                Equipment.getFirst((int[])f.aW).interact(lllIIIIIlI[lllIIIIIll[34]]);
                                Time.sleepTicks((int)lllIIIIIll[7]);
                                0;
                            }
                            Movement.walkTo((WorldPoint)mJ);
                            0;
                            Time.sleepTicks((int)lllIIIIIll[1]);
                            0;
                        }
                        if (aa.lIllllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(mJ), lllIIIIIll[10])) {
                            AccBuilderSotf.c = lllIIIIIlI[lllIIIIIll[35]];
                            String[] stringArray4 = new String[lllIIIIIll[1]];
                            stringArray4[aa.lllIIIIIll[0]] = lllIIIIIlI[lllIIIIIll[36]];
                            lllllllllllllllllIllllIllIIIlIll = TileObjects.getNearest((String[])stringArray4);
                            lllllllllllllllllIllllIllIIIlIll.interact(lllIIIIIlI[lllIIIIIll[37]]);
                            Time.sleepTicks((int)lllIIIIIll[7]);
                            0;
                        }
                        if (aa.lIllllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(mK), lllIIIIIll[3])) {
                            String[] stringArray5 = new String[lllIIIIIll[1]];
                            stringArray5[aa.lllIIIIIll[0]] = lllIIIIIlI[lllIIIIIll[38]];
                            if (aa.lIllllIlllIll(NPCs.getNearest((String[])stringArray5))) {
                                AccBuilderSotf.c = lllIIIIIlI[lllIIIIIll[39]];
                                if (aa.lIllllIllIIlI(di, lllIIIIIll[1])) {
                                    aN.sP += lllIIIIIll[1];
                                    aN.u(AccBuilderSotf.m);
                                    di += lllIIIIIll[1];
                                    aN.sP = lllIIIIIll[0];
                                    dj = lllIIIIIll[0];
                                }
                                String[] stringArray6 = new String[lllIIIIIll[1]];
                                stringArray6[aa.lllIIIIIll[0]] = lllIIIIIlI[lllIIIIIll[40]];
                                TileObjects.getNearest((String[])stringArray6).interact(lllIIIIIlI[lllIIIIIll[41]]);
                                Time.sleepTicks((int)lllIIIIIll[10]);
                                0;
                            }
                            String[] stringArray7 = new String[lllIIIIIll[1]];
                            stringArray7[aa.lllIIIIIll[0]] = lllIIIIIlI[lllIIIIIll[42]];
                            lllllllllllllllllIllllIllIIIlIll = NPCs.getNearest((String[])stringArray7);
                            if (aa.lIllllIllIlll(lllllllllllllllllIllllIllIIIlIll)) {
                                AccBuilderSotf.c = lllIIIIIlI[lllIIIIIll[43]];
                                int[] nArray = new int[lllIIIIIll[1]];
                                nArray[aa.lllIIIIIll[0]] = lllIIIIIll[17];
                                if (aa.lIllllIllIIll(Equipment.contains((int[])nArray) ? 1 : 0)) {
                                    int[] nArray3 = new int[lllIIIIIll[1]];
                                    nArray3[aa.lllIIIIIll[0]] = lllIIIIIll[17];
                                    if (aa.lIllllIllIIIl(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                                        int[] nArray4 = new int[lllIIIIIll[1]];
                                        nArray4[aa.lllIIIIIll[0]] = lllIIIIIll[17];
                                        Inventory.getFirst((int[])nArray4).interact(lllIIIIIlI[lllIIIIIll[44]]);
                                        Time.sleepTicks((int)lllIIIIIll[1]);
                                        0;
                                    }
                                }
                                if (aa.lIllllIlllIll(Players.getLocal().getInteracting()) && aa.lIllllIllIIll(lllllllllllllllllIllllIllIIIlIll.isDead() ? 1 : 0)) {
                                    lllllllllllllllllIllllIllIIIlIll.interact(lllIIIIIlI[lllIIIIIll[45]]);
                                    Time.sleepTicks((int)lllIIIIIll[5]);
                                    0;
                                }
                            }
                        }
                    }
                }
            }
            if (aa.lIllllIllIlII(e.j(lllIIIIIll[9]), lllIIIIIll[7]) && aa.lIllllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(mK), lllIIIIIll[3])) {
                int[] nArray = new int[lllIIIIIll[1]];
                nArray[aa.lllIIIIIll[0]] = lllIIIIIll[16];
                if (aa.lIllllIllIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray5 = new int[lllIIIIIll[1]];
                    nArray5[aa.lllIIIIIll[0]] = lllIIIIIll[16];
                    Inventory.getFirst((int[])nArray5).interact(lllIIIIIlI[lllIIIIIll[46]]);
                    Time.sleepTicks((int)lllIIIIIll[5]);
                    0;
                }
            }
            g.a(new String[lllIIIIIll[0]]);
        }
    }

    @Override
    public String ag() {
        return lllIIIIIlI[lllIIIIIll[60]];
    }

    private static boolean lIllllIllllII(int n2, int n3) {
        return n2 >= n3;
    }

    private static String lIllllIlIllII(String lllllllllllllllllIllllIlIlIllIll, String lllllllllllllllllIllllIlIlIllIlI) {
        lllllllllllllllllIllllIlIlIllIll = new String(Base64.getDecoder().decode(lllllllllllllllllIllllIlIlIllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllIllllIlIlIllllI = new StringBuilder();
        char[] lllllllllllllllllIllllIlIlIlllIl = lllllllllllllllllIllllIlIlIllIlI.toCharArray();
        int lllllllllllllllllIllllIlIlIlllII = lllIIIIIll[0];
        char[] lllllllllllllllllIllllIlIlIlIllI = lllllllllllllllllIllllIlIlIllIll.toCharArray();
        int lllllllllllllllllIllllIlIlIlIlIl = lllllllllllllllllIllllIlIlIlIllI.length;
        int lllllllllllllllllIllllIlIlIlIlII = lllIIIIIll[0];
        while (aa.lIllllIllIIlI(lllllllllllllllllIllllIlIlIlIlII, lllllllllllllllllIllllIlIlIlIlIl)) {
            char lllllllllllllllllIllllIlIllIIIIl = lllllllllllllllllIllllIlIlIlIllI[lllllllllllllllllIllllIlIlIlIlII];
            lllllllllllllllllIllllIlIlIllllI.append((char)(lllllllllllllllllIllllIlIllIIIIl ^ lllllllllllllllllIllllIlIlIlllIl[lllllllllllllllllIllllIlIlIlllII % lllllllllllllllllIllllIlIlIlllIl.length]));
            0;
            ++lllllllllllllllllIllllIlIlIlllII;
            ++lllllllllllllllllIllllIlIlIlIlII;
            0;
            if (((0x50 ^ 0x57 ^ (0x17 ^ 1)) & (0x61 ^ 0x20 ^ (0x34 ^ 0x64) ^ -1)) != 1) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllllIllllIlIlIllllI);
    }

    private static int lIllllIllIIII(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean lIllllIllIllI(int n2) {
        return n2 > 0;
    }

    private static String lIllllIlIlIll(String lllllllllllllllllIllllIlIlllIIII, String lllllllllllllllllIllllIlIllIllll) {
        try {
            SecretKeySpec lllllllllllllllllIllllIlIlllIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIllllIlIllIllll.getBytes(StandardCharsets.UTF_8)), lllIIIIIll[21]), "DES");
            Cipher lllllllllllllllllIllllIlIlllIIlI = Cipher.getInstance("DES");
            lllllllllllllllllIllllIlIlllIIlI.init(lllIIIIIll[5], lllllllllllllllllIllllIlIlllIIll);
            return new String(lllllllllllllllllIllllIlIlllIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllllIllllIlIlllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllIllllIlIlllIIIl) {
            lllllllllllllllllIllllIlIlllIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIllllIllIIll(int n2) {
        return n2 == 0;
    }

    private static void lIllllIlIllll() {
        lllIIIIIll = new int[74];
        aa.lllIIIIIll[0] = (0xDB ^ 0x90) & ~(0x38 ^ 0x73);
        aa.lllIIIIIll[1] = 1;
        aa.lllIIIIIll[2] = 170 + 205 - 345 + 196 ^ 100 + 143 - 216 + 136;
        aa.lllIIIIIll[3] = 0x2D ^ 0x72 ^ (0xDB ^ 0x8E);
        aa.lllIIIIIll[4] = 0xD7 ^ 0x91;
        aa.lllIIIIIll[5] = 2;
        aa.lllIIIIIll[6] = -(0xFFFFBB7D & 0x4C83) & (0xFFFFD9FB & 0x2F7F);
        aa.lllIIIIIll[7] = 3;
        aa.lllIIIIIll[8] = -(0xFFFFCC9D & 0x7B7B) & (0xFFFFDBFB & 0x6FFF);
        aa.lllIIIIIll[9] = 136 + 67 - 69 + 44;
        aa.lllIIIIIll[10] = 144 + 48 - 133 + 89 ^ 3 + 131 - 41 + 51;
        aa.lllIIIIIll[11] = 0xA2 ^ 0xA7;
        aa.lllIIIIIll[12] = 0xFFFFB3AC & 0x5FDB;
        aa.lllIIIIIll[13] = -(0xFFFFAE2F & 0x59D3) & (0xFFFF8F7F & Short.MAX_VALUE);
        aa.lllIIIIIll[14] = 0xFFFFB66F & 0x4F9E;
        aa.lllIIIIIll[15] = -(0xFFFFE675 & 0x3BCF) & (0xFFFFAF6F & 0x7BFF);
        aa.lllIIIIIll[16] = 0xFFFFBFDF & 0x5F67;
        aa.lllIIIIIll[17] = 0xFFFFC5BD & 0x3F77;
        aa.lllIIIIIll[18] = 0x64 ^ 0x19 ^ (0xD5 ^ 0xAE);
        aa.lllIIIIIll[19] = -(0xFFFFF5D1 & 0x4A3F) & (0xFFFFEEDF & 0x7FFA);
        aa.lllIIIIIll[20] = 0x76 ^ 0x71;
        aa.lllIIIIIll[21] = 14 + 75 - 78 + 147 ^ 32 + 92 - 45 + 71;
        aa.lllIIIIIll[22] = 0xA3 ^ 0xAA;
        aa.lllIIIIIll[23] = 0x97 ^ 0x9C;
        aa.lllIIIIIll[24] = 0x13 ^ 0x1F;
        aa.lllIIIIIll[25] = 31 + 19 - 49 + 131 ^ 96 + 43 - 36 + 34;
        aa.lllIIIIIll[26] = 0x5B ^ 0x55;
        aa.lllIIIIIll[27] = 0x19 ^ 0x16;
        aa.lllIIIIIll[28] = 56 + 43 - 90 + 120 ^ 21 + 6 - -38 + 80;
        aa.lllIIIIIll[29] = 1 ^ (3 ^ 0x13);
        aa.lllIIIIIll[30] = 0xAB ^ 0xB9;
        aa.lllIIIIIll[31] = 0x6C ^ 0x7F;
        aa.lllIIIIIll[32] = 0x2F ^ 0x3B;
        aa.lllIIIIIll[33] = -(0xFFFFB5D5 & 0x4E3F) & (0xFFFFF6DE & 0xFFF);
        aa.lllIIIIIll[34] = 52 + 122 - 57 + 94 ^ 2 + 54 - -8 + 134;
        aa.lllIIIIIll[35] = 0x39 ^ 0x2F;
        aa.lllIIIIIll[36] = 0x83 ^ 0xB7 ^ (0x59 ^ 0x7A);
        aa.lllIIIIIll[37] = 3 ^ (0x6A ^ 0x71);
        aa.lllIIIIIll[38] = 0x5E ^ 0x47;
        aa.lllIIIIIll[39] = 0x81 ^ 0xB9 ^ (0x63 ^ 0x41);
        aa.lllIIIIIll[40] = 0x21 ^ 0x7C ^ (0x5E ^ 0x18);
        aa.lllIIIIIll[41] = 131 + 83 - 135 + 102 ^ 62 + 114 - 71 + 64;
        aa.lllIIIIIll[42] = 0xB8 ^ 0xA5;
        aa.lllIIIIIll[43] = 49 + 1 - -39 + 59 ^ 6 + 57 - 13 + 88;
        aa.lllIIIIIll[44] = 0xBC ^ 0xA3;
        aa.lllIIIIIll[45] = 83 + 94 - 124 + 81 ^ 93 + 38 - 18 + 53;
        aa.lllIIIIIll[46] = 9 + 110 - 16 + 53 ^ 51 + 176 - 178 + 140;
        aa.lllIIIIIll[47] = 0x42 ^ 0x67 ^ (0xD ^ 0xA);
        aa.lllIIIIIll[48] = 0xB7 ^ 0x92 ^ (8 ^ 0xE);
        aa.lllIIIIIll[49] = 126 + 125 - 131 + 32 ^ 161 + 163 - 288 + 152;
        aa.lllIIIIIll[50] = -(0xFFFFCF7A & 0x78F7) & (0xFFFFFF7D & 0x5FFF);
        aa.lllIIIIIll[51] = 0xFFFFE5FC & 0x7F2F;
        aa.lllIIIIIll[52] = 0xFFFFFF7F & 0x3E9C;
        aa.lllIIIIIll[53] = 0x95 ^ 0xBD;
        aa.lllIIIIIll[54] = -(0xFFFFFEDF & 0x2722) & (0xFFFFE795 & 0x3FFB);
        aa.lllIIIIIll[55] = -(0xFFFFE3FE & 0x5D35) & (0xFFFFEFFF & Short.MAX_VALUE);
        aa.lllIIIIIll[56] = -(0xFFFFCC7F & 0x3F97) & (0xFFFFEFFF & 0x7DBE);
        aa.lllIIIIIll[57] = -(0xFFFFDA9F & 0x7DE4) & (0xFFFFFFEF & 0x5FFF);
        aa.lllIIIIIll[58] = 0xFFFFB379 & 0x7DD7;
        aa.lllIIIIIll[59] = 0x58 ^ 0x69 ^ (0x4C ^ 0x19);
        aa.lllIIIIIll[60] = 176 + 30 - 188 + 165 ^ 127 + 65 - 99 + 53;
        aa.lllIIIIIll[61] = 0x10 ^ 0x4C ^ (0x50 ^ 0x2A);
        aa.lllIIIIIll[62] = 0xFFFFBDBA & 0x4E5F;
        aa.lllIIIIIll[63] = -(0xFFFFF5B9 & 0x3B57) & (0xFFFFBDF5 & 0x7FDE);
        aa.lllIIIIIll[64] = -(0xFFFFF3AF & 0x6F79) & (0xFFFFEFFF & 0x7FBF);
        aa.lllIIIIIll[65] = -(0xFFFFF3FD & 0x2E3B) & (0xFFFFBFFB & 0x6F7F);
        aa.lllIIIIIll[66] = -(0xFFFF9757 & 0x7BAC) & (0xFFFFFFAF & 0x1F7F);
        aa.lllIIIIIll[67] = -(0xFFFFB6F5 & 0x7BEB) & (0xFFFFBFFC & Short.MAX_VALUE);
        aa.lllIIIIIll[68] = -(0xFFFFDDFD & 0x62BB) & (0xFFFFDFFD & 0x6CBF);
        aa.lllIIIIIll[69] = -(0xFFFFBFF1 & 0x49DF) & (0xFFFFAFFF & 0x7FFB);
        aa.lllIIIIIll[70] = 161 + 153 - 214 + 83 ^ 69 + 71 - 74 + 78;
        aa.lllIIIIIll[71] = 0x20 ^ 9;
        aa.lllIIIIIll[72] = 0x13 ^ 0xB ^ (0x5E ^ 0x6C);
        aa.lllIIIIIll[73] = 0xB5 ^ 0xB1 ^ (0x93 ^ 0xBC);
    }

    private static boolean lIllllIlllIlI(int n2, int n3) {
        return n2 != n3;
    }

    static {
        aa.lIllllIlIllll();
        aa.lIllllIlIlllI();
        mH = new WorldPoint(lllIIIIIll[62], lllIIIIIll[63], lllIIIIIll[0]);
        mI = new WorldPoint(lllIIIIIll[64], lllIIIIIll[65], lllIIIIIll[0]);
        mJ = new WorldPoint(lllIIIIIll[66], lllIIIIIll[67], lllIIIIIll[0]);
        mK = new WorldPoint(lllIIIIIll[68], lllIIIIIll[69], lllIIIIIll[0]);
        String[] stringArray = new String[lllIIIIIll[10]];
        stringArray[aa.lllIIIIIll[0]] = lllIIIIIlI[lllIIIIIll[70]];
        stringArray[aa.lllIIIIIll[1]] = lllIIIIIlI[lllIIIIIll[53]];
        stringArray[aa.lllIIIIIll[5]] = lllIIIIIlI[lllIIIIIll[71]];
        stringArray[aa.lllIIIIIll[7]] = lllIIIIIlI[lllIIIIIll[72]];
        mL = stringArray;
        bv = new ArrayList<d>();
        cG = lllIIIIIll[0];
    }

    private static boolean lIllllIllIlll(Object object) {
        return object != null;
    }

    private static void Q() {
        d lllllllllllllllllIllllIllIIIIlll;
        Object lllllllllllllllllIllllIllIIIlIII;
        int[] nArray = new int[lllIIIIIll[1]];
        nArray[aa.lllIIIIIll[0]] = lllIIIIIll[13];
        if (aa.lIllllIllIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(lllIIIIIll[13], lllIIIIIll[1], lllIIIIIll[50]);
            bv.add(d2);
            0;
        }
        int[] nArray2 = new int[lllIIIIIll[1]];
        nArray2[aa.lllIIIIIll[0]] = lllIIIIIll[15];
        if (aa.lIllllIllIIll(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lllllllllllllllllIllllIllIIIlIII = new d(lllIIIIIll[15], lllIIIIIll[1], lllIIIIIll[50]);
            bv.add((d)lllllllllllllllllIllllIllIIIlIII);
            0;
        }
        int[] nArray3 = new int[lllIIIIIll[1]];
        nArray3[aa.lllIIIIIll[0]] = lllIIIIIll[17];
        if (aa.lIllllIllIIll(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lllllllllllllllllIllllIllIIIlIII = new d(lllIIIIIll[17], lllIIIIIll[1], lllIIIIIll[51]);
            bv.add((d)lllllllllllllllllIllllIllIIIlIII);
            0;
        }
        int[] nArray4 = new int[lllIIIIIll[1]];
        nArray4[aa.lllIIIIIll[0]] = lllIIIIIll[14];
        if (aa.lIllllIllIIll(Bank.contains((int[])nArray4) ? 1 : 0)) {
            lllllllllllllllllIllllIllIIIlIII = new d(lllIIIIIll[14], lllIIIIIll[1], lllIIIIIll[50]);
            bv.add((d)lllllllllllllllllIllllIllIIIlIII);
            0;
        }
        int[] nArray5 = new int[lllIIIIIll[1]];
        nArray5[aa.lllIIIIIll[0]] = lllIIIIIll[19];
        if (aa.lIllllIllIIll(Bank.contains((int[])nArray5) ? 1 : 0)) {
            lllllllllllllllllIllllIllIIIlIII = new d(lllIIIIIll[19], lllIIIIIll[1], lllIIIIIll[52]);
            bv.add((d)lllllllllllllllllIllllIllIIIlIII);
            0;
        }
        int[] nArray6 = new int[lllIIIIIll[1]];
        nArray6[aa.lllIIIIIll[0]] = lllIIIIIll[6];
        if (aa.lIllllIllIIll(Bank.contains((int[])nArray6) ? 1 : 0)) {
            lllllllllllllllllIllllIllIIIlIII = new d(lllIIIIIll[6], lllIIIIIll[3], lllIIIIIll[50]);
            bv.add((d)lllllllllllllllllIllllIllIIIlIII);
            0;
        }
        int[] nArray7 = new int[lllIIIIIll[1]];
        nArray7[aa.lllIIIIIll[0]] = lllIIIIIll[6];
        if (aa.lIllllIllIIIl(Bank.contains((int[])nArray7) ? 1 : 0)) {
            int[] nArray8 = new int[lllIIIIIll[1]];
            nArray8[aa.lllIIIIIll[0]] = lllIIIIIll[6];
            if (aa.lIllllIllIIlI(Bank.getFirst((int[])nArray8).getQuantity(), lllIIIIIll[32])) {
                lllllllllllllllllIllllIllIIIlIII = new d(lllIIIIIll[6], lllIIIIIll[53], lllIIIIIll[54]);
                bv.add((d)lllllllllllllllllIllllIllIIIlIII);
                0;
            }
        }
        if (aa.lIllllIllIIll(Bank.contains((Predicate)(lllllllllllllllllIllllIllIIIlIII = item -> item.getName().toLowerCase().contains(lllIIIIIlI[lllIIIIIll[61]]))) ? 1 : 0)) {
            lllllllllllllllllIllllIllIIIIlll = new d(lllIIIIIll[55], lllIIIIIll[11], lllIIIIIll[56]);
            bv.add(lllllllllllllllllIllllIllIIIIlll);
            0;
        }
        int[] nArray9 = new int[lllIIIIIll[1]];
        nArray9[aa.lllIIIIIll[0]] = lllIIIIIll[16];
        if (aa.lIllllIllIIll(Bank.contains((int[])nArray9) ? 1 : 0)) {
            lllllllllllllllllIllllIllIIIIlll = new d(lllIIIIIll[16], lllIIIIIll[53], lllIIIIIll[57]);
            bv.add(lllllllllllllllllIllllIllIIIIlll);
            0;
        }
        int[] nArray10 = new int[lllIIIIIll[1]];
        nArray10[aa.lllIIIIIll[0]] = lllIIIIIll[58];
        if (aa.lIllllIllIIll(Bank.contains((int[])nArray10) ? 1 : 0)) {
            lllllllllllllllllIllllIllIIIIlll = new d(lllIIIIIll[58], lllIIIIIll[11], j.cf);
            bv.add(lllllllllllllllllIllllIllIIIIlll);
            0;
        }
    }

    @Override
    public boolean ae() {
        return lllIIIIIll[0];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        String[] stringArray = new String[lllIIIIIll[1]];
        stringArray[aa.lllIIIIIll[0]] = lllIIIIIlI[lllIIIIIll[47]];
        if (aa.lIllllIllIIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            String[] stringArray2 = new String[lllIIIIIll[1]];
            stringArray2[aa.lllIIIIIll[0]] = lllIIIIIlI[lllIIIIIll[48]];
            if (aa.lIllllIllIIIl(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                String[] stringArray3 = new String[lllIIIIIll[1]];
                stringArray3[aa.lllIIIIIll[0]] = lllIIIIIlI[lllIIIIIll[49]];
                if (aa.lIllllIllIIIl(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                    n2 = lllIIIIIll[1];
                    0;
                    if (null == null) return n2 != 0;
                    return ((0xE1 ^ 0xA2 ^ (0xCD ^ 0xB4)) & (113 + 137 - 135 + 71 ^ 67 + 118 - 89 + 32 ^ -1)) != 0;
                }
            }
        }
        n2 = lllIIIIIll[0];
        return n2 != 0;
    }

    private static boolean lIllllIllIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllllIlllIIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIllllIlllIll(Object object) {
        return object == null;
    }

    private static String lIllllIlIllIl(String lllllllllllllllllIllllIlIlllllIl, String lllllllllllllllllIllllIlIlllllII) {
        try {
            SecretKeySpec lllllllllllllllllIllllIllIIIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIllllIlIlllllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllIllllIlIlllllll = Cipher.getInstance("Blowfish");
            lllllllllllllllllIllllIlIlllllll.init(lllIIIIIll[5], lllllllllllllllllIllllIllIIIIIII);
            return new String(lllllllllllllllllIllllIlIlllllll.doFinal(Base64.getDecoder().decode(lllllllllllllllllIllllIlIlllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllIllllIlIllllllI) {
            lllllllllllllllllIllllIlIllllllI.printStackTrace();
            return null;
        }
    }

    private static void lIllllIlIlllI() {
        lllIIIIIlI = new String[lllIIIIIll[73]];
        aa.lllIIIIIlI[aa.lllIIIIIll[0]] = aa."Buying items";
        aa.lllIIIIIlI[aa.lllIIIIIll[1]] = aa."Finished buying items, switching back to quest";
        aa.lllIIIIIlI[aa.lllIIIIIll[5]] = aa."Drink";
        aa.lllIIIIIlI[aa.lllIIIIIll[7]] = aa."Eat";
        aa.lllIIIIIlI[aa.lllIIIIIll[10]] = aa."Nav to bank";
        aa.lllIIIIIlI[aa.lllIIIIIll[11]] = aa."Handling banking";
        aa.lllIIIIIlI[aa.lllIIIIIll[18]] = aa."We are missing quest supplies, switching to BUYING";
        aa.lllIIIIIlI[aa.lllIIIIIll[20]] = aa."Nav to start";
        aa.lllIIIIIlI[aa.lllIIIIIll[21]] = aa."Wear";
        aa.lllIIIIIlI[aa.lllIIIIIll[22]] = aa."Talking npc";
        aa.lllIIIIIlI[aa.lllIIIIIll[3]] = aa."Morgan";
        aa.lllIIIIIlI[aa.lllIIIIIll[23]] = aa."Nav to pub";
        aa.lllIIIIIlI[aa.lllIIIIIll[24]] = aa."Talk to drunk";
        aa.lllIIIIIlI[aa.lllIIIIIll[25]] = aa."Dr Harlow";
        aa.lllIIIIIlI[aa.lllIIIIIll[26]] = aa."Beer";
        aa.lllIIIIIlI[aa.lllIIIIIll[27]] = aa."Stake";
        aa.lllIIIIIlI[aa.lllIIIIIll[28]] = aa."Talk to drunk";
        aa.lllIIIIIlI[aa.lllIIIIIll[29]] = aa."Dr Harlow";
        aa.lllIIIIIlI[aa.lllIIIIIll[30]] = aa."Beer";
        aa.lllIIIIIlI[aa.lllIIIIIll[31]] = aa."Stake";
        aa.lllIIIIIlI[aa.lllIIIIIll[32]] = aa."Nav to stairs";
        aa.lllIIIIIlI[aa.lllIIIIIll[34]] = aa."Draynor Village";
        aa.lllIIIIIlI[aa.lllIIIIIll[35]] = aa."Walking down stairs";
        aa.lllIIIIIlI[aa.lllIIIIIll[36]] = aa."Stairs";
        aa.lllIIIIIlI[aa.lllIIIIIll[37]] = aa."Walk-Down";
        aa.lllIIIIIlI[aa.lllIIIIIll[38]] = aa."Count Draynor";
        aa.lllIIIIIlI[aa.lllIIIIIll[39]] = aa."Starting fight";
        aa.lllIIIIIlI[aa.lllIIIIIll[40]] = aa."Coffin";
        aa.lllIIIIIlI[aa.lllIIIIIll[41]] = aa."Open";
        aa.lllIIIIIlI[aa.lllIIIIIll[42]] = aa."Count Draynor";
        aa.lllIIIIIlI[aa.lllIIIIIll[43]] = aa."Fighting";
        aa.lllIIIIIlI[aa.lllIIIIIll[44]] = aa."Wield";
        aa.lllIIIIIlI[aa.lllIIIIIll[45]] = aa."Attack";
        aa.lllIIIIIlI[aa.lllIIIIIll[46]] = aa."Break";
        aa.lllIIIIIlI[aa.lllIIIIIll[47]] = aa."Beer";
        aa.lllIIIIIlI[aa.lllIIIIIll[48]] = aa."Garlic";
        aa.lllIIIIIlI[aa.lllIIIIIll[49]] = aa."Hammer";
        aa.lllIIIIIlI[aa.lllIIIIIll[60]] = aa."Vampire slayer quest";
        aa.lllIIIIIlI[aa.lllIIIIIll[61]] = aa."ring of wealth (";
        aa.lllIIIIIlI[aa.lllIIIIIll[70]] = aa."Ok, I'm up for an adventure.";
        aa.lllIIIIIlI[aa.lllIIIIIll[53]] = aa."A glass of your finest ale please.";
        aa.lllIIIIIlI[aa.lllIIIIIll[71]] = aa."Morgan needs your help!";
        aa.lllIIIIIlI[aa.lllIIIIIll[72]] = aa."Yes.";
    }

    private static boolean lIllllIllIIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIllllIllIlII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIllllIllIlIl(int n2) {
        return n2 < 0;
    }

    @Override
    public boolean ah() {
        int n2;
        if (aa.lIllllIllllII(e.j(lllIIIIIll[9]), lllIIIIIll[7]) && aa.lIllllIlllIII(Players.getLocal().getWorldLocation().distanceTo(mK), lllIIIIIll[43])) {
            n2 = lllIIIIIll[1];
            0;
            if (-(0x56 ^ 0x52) > 0) {
                return ((0x1E ^ 0x52) & ~(0xCA ^ 0x86)) != 0;
            }
        } else {
            n2 = lllIIIIIll[0];
        }
        return n2 != 0;
    }

    @Override
    public int af() {
        try {
            aa.ev();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (1 >= 2) {
            return (53 + 159 - 174 + 136 ^ 123 + 32 - 25 + 32) & (0x3E ^ 0x11 ^ (0x41 ^ 0x62) ^ -1);
        }
        return lllIIIIIll[59];
    }
}

