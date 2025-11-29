/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.quests.QuestVarbits
 *  net.unethicalite.api.widgets.Widgets
 */
package e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u;

import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.S;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.a;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.ac;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.b;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.d;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.e;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.f;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.g;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.i;
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
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.widgets.Widgets;

public class R
implements S {
    private static /* synthetic */ int[] lllllllIll;
    static /* synthetic */ int ck;
    public static /* synthetic */ long g;
    private static final /* synthetic */ WorldPoint iQ;
    private static final /* synthetic */ WorldPoint iM;
    static /* synthetic */ boolean cl;
    private static /* synthetic */ String[] lllllllIlI;
    private static final /* synthetic */ WorldPoint iP;
    private static final /* synthetic */ WorldPoint iN;
    private static final /* synthetic */ WorldPoint iR;
    public static /* synthetic */ List<d> bu;
    private static final /* synthetic */ WorldPoint iO;
    public static final /* synthetic */ String[] iL;
    public static /* synthetic */ boolean bs;
    static /* synthetic */ int bS;

    public static void dp() {
        if (R.llIllIIIIIllI(bs ? 1 : 0)) {
            AccBuilderTempleTrek.c = lllllllIlI[lllllllIll[0]];
            b.a(bu);
            if (R.llIllIIIIIlll(bu.size(), lllllllIll[1])) {
                System.out.println(lllllllIlI[lllllllIll[1]]);
                bs = lllllllIll[0];
            }
        }
        if (R.llIllIIIIlIII(bs ? 1 : 0)) {
            block49: {
                BankLocation var9;
                if (R.llIllIIIIIllI(Inventory.contains((int[])f.aU) ? 1 : 0) && R.llIllIIIIIlll(Movement.getRunEnergy(), lllllllIll[2])) {
                    Inventory.getFirst((int[])f.aU).interact(lllllllIlI[lllllllIll[3]]);
                    Time.sleepTicks((int)lllllllIll[1]);
                    0;
                }
                if (R.llIllIIIIlIIl(R.llIllIIIIIlII(e.u(), 70.0))) {
                    int[] nArray = new int[lllllllIll[1]];
                    nArray[R.lllllllIll[0]] = lllllllIll[4];
                    if (R.llIllIIIIIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray2 = new int[lllllllIll[1]];
                        nArray2[R.lllllllIll[0]] = lllllllIll[4];
                        Inventory.getFirst((int[])nArray2).interact(lllllllIlI[lllllllIll[5]]);
                    }
                }
                if (R.llIllIIIIlIII(Movement.isRunEnabled() ? 1 : 0) && R.llIllIIIIlIlI(Movement.getRunEnergy())) {
                    Movement.toggleRun();
                }
                if (R.llIllIIIIlIII(R.aa() ? 1 : 0) && R.llIllIIIIlIII(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()))) {
                    var9 = BankLocation.getNearest();
                    if (R.llIllIIIIlIll(var9) && R.llIllIIIIlIII(var9.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderTempleTrek.c = lllllllIlI[lllllllIll[6]];
                        a.a(var9);
                        Time.sleepTicks((int)lllllllIll[3]);
                        0;
                    }
                    if (R.llIllIIIIlIll(var9) && R.llIllIIIIIllI(var9.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderTempleTrek.c = lllllllIlI[lllllllIll[7]];
                        if (R.llIllIIIIlIII(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)lllllllIll[8]);
                            0;
                        }
                        if (R.llIllIIIIIllI(Bank.isOpen() ? 1 : 0)) {
                            if (R.llIllIIIIlIlI(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lllllllIll[6]);
                                0;
                            }
                            if (R.llIllIIIIlIlI(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)lllllllIll[3]);
                                0;
                            }
                            int[] nArray = new int[lllllllIll[9]];
                            nArray[R.lllllllIll[0]] = lllllllIll[10];
                            nArray[R.lllllllIll[1]] = lllllllIll[11];
                            nArray[R.lllllllIll[3]] = lllllllIll[12];
                            nArray[R.lllllllIll[5]] = lllllllIll[13];
                            nArray[R.lllllllIll[6]] = lllllllIll[4];
                            nArray[R.lllllllIll[7]] = lllllllIll[14];
                            if (R.llIllIIIIlIII(e.b(nArray) ? 1 : 0)) {
                                R.ae();
                                System.out.println(lllllllIlI[lllllllIll[9]]);
                                bs = lllllllIll[1];
                                return;
                            }
                            int[] nArray3 = new int[lllllllIll[9]];
                            nArray3[R.lllllllIll[0]] = lllllllIll[10];
                            nArray3[R.lllllllIll[1]] = lllllllIll[11];
                            nArray3[R.lllllllIll[3]] = lllllllIll[12];
                            nArray3[R.lllllllIll[5]] = lllllllIll[13];
                            nArray3[R.lllllllIll[6]] = lllllllIll[4];
                            nArray3[R.lllllllIll[7]] = lllllllIll[14];
                            if (R.llIllIIIIIllI(e.b(nArray3) ? 1 : 0)) {
                                Bank.withdraw((int)lllllllIll[11], (int)lllllllIll[15], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)lllllllIll[1]);
                                0;
                                Bank.withdraw((int)lllllllIll[14], (int)lllllllIll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)lllllllIll[1]);
                                0;
                                Bank.withdraw((int)lllllllIll[16], (int)lllllllIll[15], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)lllllllIll[1]);
                                0;
                                Bank.withdraw((int)lllllllIll[13], (int)lllllllIll[7], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)lllllllIll[1]);
                                0;
                                Bank.withdraw((int)lllllllIll[10], (int)lllllllIll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)lllllllIll[1]);
                                0;
                                a.b(f.aU, lllllllIll[6]);
                                a.a(lllllllIll[4], lllllllIll[15]);
                                a.b(f.be, lllllllIll[1]);
                            }
                        }
                    }
                }
                if (R.llIllIIIIlIII(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId())) && R.llIllIIIIIllI(R.aa() ? 1 : 0)) {
                    if (R.llIllIIIIllII(Players.getLocal().getWorldLocation().distanceTo(iM), lllllllIll[3])) {
                        AccBuilderTempleTrek.c = lllllllIlI[lllllllIll[17]];
                        if (R.llIllIIIIIlll(bS, lllllllIll[1])) {
                            e.v();
                            bS += lllllllIll[1];
                        }
                        Movement.walkTo((WorldPoint)iM);
                        0;
                        Time.sleepTicks((int)lllllllIll[1]);
                        0;
                    }
                    if (R.llIllIIIIllIl(Players.getLocal().getWorldLocation().distanceTo(iM), lllllllIll[3])) {
                        AccBuilderTempleTrek.c = lllllllIlI[lllllllIll[18]];
                        if (R.llIllIIIIlIII(R.llIllIIIIIlIl(g, 0L))) {
                            g = System.currentTimeMillis();
                        }
                        if (R.llIllIIIIIllI(R.llIllIIIIIlIl(g, 0L)) && R.llIllIIIIlIlI(R.llIllIIIIIlIl(e.a(g), 30000L))) {
                            bS = lllllllIll[0];
                            g = System.currentTimeMillis();
                        }
                        if (R.llIllIIIIIlll(bS, lllllllIll[1])) {
                            e.v();
                            bS += lllllllIll[1];
                        }
                        if (R.llIllIIIIIllI(Inventory.isFull() ? 1 : 0)) {
                            int[] nArray = new int[lllllllIll[1]];
                            nArray[R.lllllllIll[0]] = lllllllIll[4];
                            Inventory.getFirst((int[])nArray).interact(lllllllIlI[lllllllIll[19]]);
                            Time.sleepTicks((int)lllllllIll[3]);
                            0;
                        }
                        e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.g.a(lllllllIlI[lllllllIll[15]], iL, lllllllIll[1]);
                    }
                }
                if (R.llIllIIIIlllI(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lllllllIll[1])) {
                    ck = lllllllIll[0];
                    String[] stringArray = new String[lllllllIll[1]];
                    stringArray[R.lllllllIll[0]] = lllllllIlI[lllllllIll[20]];
                    if (R.llIllIIIIlIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.g.a(iL);
                    }
                }
                if (R.llIllIIIIlllI(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lllllllIll[3])) {
                    if (R.llIllIIIIIllI(Inventory.contains(item -> item.getName().contains(lllllllIlI[lllllllIll[61]])) ? 1 : 0) && R.llIllIIIIlIII(Equipment.contains(item -> item.getName().contains(lllllllIlI[lllllllIll[60]])) ? 1 : 0)) {
                        Inventory.getFirst(item -> item.getName().contains(lllllllIlI[lllllllIll[53]])).interact(lllllllIlI[lllllllIll[21]]);
                    }
                    if (R.llIllIIIIIllI(Inventory.contains(item -> item.getName().contains(lllllllIlI[lllllllIll[59]])) ? 1 : 0) && R.llIllIIIIlIII(Equipment.contains(item -> item.getName().contains(lllllllIlI[lllllllIll[58]])) ? 1 : 0)) {
                        Inventory.getFirst(item -> item.getName().contains(lllllllIlI[lllllllIll[57]])).interact(lllllllIlI[lllllllIll[22]]);
                    }
                    if (R.llIllIIIIlIII(Players.getLocal().getWorldLocation().equals((Object)iN) ? 1 : 0)) {
                        AccBuilderTempleTrek.c = lllllllIlI[lllllllIll[23]];
                        Movement.walkTo((WorldPoint)iN);
                        0;
                        Time.sleepTicks((int)lllllllIll[1]);
                        0;
                    }
                    if (R.llIllIIIIIllI(Players.getLocal().getWorldLocation().equals((Object)iN) ? 1 : 0)) {
                        String[] stringArray = new String[lllllllIll[1]];
                        stringArray[R.lllllllIll[0]] = lllllllIlI[lllllllIll[24]];
                        Inventory.getFirst((String[])stringArray).interact(lllllllIlI[lllllllIll[25]]);
                        Time.sleepTicks((int)lllllllIll[3]);
                        0;
                    }
                }
                if (R.llIllIIIIlllI(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lllllllIll[5])) {
                    if (R.llIllIIIIlIII(Players.getLocal().getWorldLocation().equals((Object)iO) ? 1 : 0)) {
                        AccBuilderTempleTrek.c = lllllllIlI[lllllllIll[26]];
                        Movement.walkTo((WorldPoint)iO);
                        0;
                        Time.sleepTicks((int)lllllllIll[1]);
                        0;
                    }
                    if (R.llIllIIIIIllI(Players.getLocal().getWorldLocation().equals((Object)iO) ? 1 : 0)) {
                        String[] stringArray = new String[lllllllIll[1]];
                        stringArray[R.lllllllIll[0]] = lllllllIlI[lllllllIll[27]];
                        Inventory.getFirst((String[])stringArray).interact(lllllllIlI[lllllllIll[28]]);
                        Time.sleepTicks((int)lllllllIll[3]);
                        0;
                    }
                }
                if (R.llIllIIIIlllI(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lllllllIll[6])) {
                    if (R.llIllIIIIlIII(Players.getLocal().getWorldLocation().equals((Object)iP) ? 1 : 0)) {
                        AccBuilderTempleTrek.c = lllllllIlI[lllllllIll[29]];
                        Movement.walkTo((WorldPoint)iP);
                        0;
                        Time.sleepTicks((int)lllllllIll[1]);
                        0;
                    }
                    if (R.llIllIIIIIllI(Players.getLocal().getWorldLocation().equals((Object)iP) ? 1 : 0)) {
                        String[] stringArray = new String[lllllllIll[1]];
                        stringArray[R.lllllllIll[0]] = lllllllIlI[lllllllIll[30]];
                        Inventory.getFirst((String[])stringArray).interact(lllllllIlI[lllllllIll[31]]);
                        Time.sleepTicks((int)lllllllIll[3]);
                        0;
                    }
                }
                if (R.llIllIIIIlllI(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lllllllIll[7])) {
                    if (R.llIllIIIIlIII(Players.getLocal().getWorldLocation().equals((Object)iQ) ? 1 : 0)) {
                        AccBuilderTempleTrek.c = lllllllIlI[lllllllIll[32]];
                        Movement.walkTo((WorldPoint)iQ);
                        0;
                        Time.sleepTicks((int)lllllllIll[1]);
                        0;
                    }
                    if (R.llIllIIIIIllI(Players.getLocal().getWorldLocation().equals((Object)iQ) ? 1 : 0)) {
                        String[] stringArray = new String[lllllllIll[1]];
                        stringArray[R.lllllllIll[0]] = lllllllIlI[lllllllIll[33]];
                        Inventory.getFirst((String[])stringArray).interact(lllllllIlI[lllllllIll[34]]);
                        Time.sleepTicks((int)lllllllIll[3]);
                        0;
                    }
                }
                if (R.llIllIIIIlllI(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lllllllIll[9])) {
                    if (R.llIllIIIIllII(Players.getLocal().getWorldLocation().distanceTo(iR), lllllllIll[5])) {
                        AccBuilderTempleTrek.c = lllllllIlI[lllllllIll[35]];
                        Movement.walkTo((WorldPoint)iR);
                        0;
                        Time.sleepTicks((int)lllllllIll[1]);
                        0;
                    }
                    if (R.llIllIIIIllIl(Players.getLocal().getWorldLocation().distanceTo(iR), lllllllIll[5])) {
                        AccBuilderTempleTrek.c = lllllllIlI[lllllllIll[36]];
                        if (R.llIllIIIIIlll(ck, lllllllIll[1])) {
                            ac.mI += lllllllIll[1];
                            ac.d(AccBuilderTempleTrek.m);
                            ck += lllllllIll[1];
                            ac.mI = lllllllIll[0];
                            cl = lllllllIll[0];
                        }
                        e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.g.a(lllllllIlI[lllllllIll[37]], iL);
                    }
                }
                if (R.llIllIIIIlllI(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lllllllIll[17])) {
                    e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.g.a(iL);
                }
                do {
                    int[] nArray = new int[lllllllIll[1]];
                    nArray[R.lllllllIll[0]] = lllllllIll[38];
                    if (!R.llIllIIIIIllI(Inventory.contains((int[])nArray) ? 1 : 0)) break block49;
                    if (R.llIllIIIIlIll(Widgets.get((int)lllllllIll[39]))) {
                        Widget var14;
                        AccBuilderTempleTrek.c = lllllllIlI[lllllllIll[40]];
                        int[] nArray4 = new int[lllllllIll[1]];
                        nArray4[R.lllllllIll[0]] = lllllllIll[38];
                        Inventory.getFirst((int[])nArray4).interact(lllllllIlI[lllllllIll[41]]);
                        Time.sleepTicks((int)lllllllIll[6]);
                        0;
                        AccBuilderTempleTrek.c = lllllllIlI[lllllllIll[42]];
                        var9 = Widgets.get((int)lllllllIll[39], (int)lllllllIll[23]);
                        if (R.llIllIIIIlIll(var9)) {
                            var9.interact(lllllllIlI[lllllllIll[43]]);
                            Time.sleepTicks((int)lllllllIll[1]);
                            0;
                        }
                        if (R.llIllIIIIlIll(var14 = Widgets.get((int)lllllllIll[39], (int)lllllllIll[35]))) {
                            var14.interact(lllllllIlI[lllllllIll[44]]);
                            Time.sleepTicks((int)lllllllIll[3]);
                            0;
                        }
                    }
                    Time.sleepTicks((int)lllllllIll[1]);
                    0;
                    0;
                } while (-3 < 0);
                return;
            }
            e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.g.a(new String[lllllllIll[0]]);
        }
    }

    static {
        R.llIllIIIIIIll();
        R.llIllIIIIIIlI();
        String[] stringArray = new String[lllllllIll[24]];
        stringArray[R.lllllllIll[0]] = lllllllIlI[lllllllIll[62]];
        stringArray[R.lllllllIll[1]] = lllllllIlI[lllllllIll[63]];
        stringArray[R.lllllllIll[3]] = lllllllIlI[lllllllIll[64]];
        stringArray[R.lllllllIll[5]] = lllllllIlI[lllllllIll[65]];
        stringArray[R.lllllllIll[6]] = lllllllIlI[lllllllIll[66]];
        stringArray[R.lllllllIll[7]] = lllllllIlI[lllllllIll[67]];
        stringArray[R.lllllllIll[9]] = lllllllIlI[lllllllIll[68]];
        stringArray[R.lllllllIll[17]] = lllllllIlI[lllllllIll[69]];
        stringArray[R.lllllllIll[18]] = lllllllIlI[lllllllIll[70]];
        stringArray[R.lllllllIll[19]] = lllllllIlI[lllllllIll[71]];
        stringArray[R.lllllllIll[15]] = lllllllIlI[lllllllIll[72]];
        stringArray[R.lllllllIll[20]] = lllllllIlI[lllllllIll[73]];
        stringArray[R.lllllllIll[21]] = lllllllIlI[lllllllIll[48]];
        stringArray[R.lllllllIll[22]] = lllllllIlI[lllllllIll[74]];
        stringArray[R.lllllllIll[23]] = lllllllIlI[lllllllIll[75]];
        iL = stringArray;
        iM = new WorldPoint(lllllllIll[76], lllllllIll[77], lllllllIll[0]);
        iN = new WorldPoint(lllllllIll[78], lllllllIll[79], lllllllIll[0]);
        iO = new WorldPoint(lllllllIll[80], lllllllIll[81], lllllllIll[0]);
        iP = new WorldPoint(lllllllIll[82], lllllllIll[83], lllllllIll[0]);
        iQ = new WorldPoint(lllllllIll[84], lllllllIll[85], lllllllIll[0]);
        iR = new WorldPoint(lllllllIll[86], lllllllIll[87], lllllllIll[0]);
        bu = new ArrayList<d>();
        bS = lllllllIll[0];
    }

    private static boolean llIllIIIIlIII(int n2) {
        return n2 == 0;
    }

    private static String llIlIllllllll(String var7, String var12) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var10 = new StringBuilder();
        char[] var6 = var12.toCharArray();
        int var13 = lllllllIll[0];
        char[] var8 = var7.toCharArray();
        int var4 = var8.length;
        int var17 = lllllllIll[0];
        while (R.llIllIIIIIlll(var17, var4)) {
            char var11 = var8[var17];
            var10.append((char)(var11 ^ var6[var13 % var6.length]));
            0;
            ++var13;
            ++var17;
            0;
            
            return null;
        }
        return String.valueOf(var10);
    }

    @Override
    public String U() {
        return lllllllIlI[lllllllIll[55]];
    }

    private static void ae() {
        d var1;
        Object var18;
        int[] nArray = new int[lllllllIll[1]];
        nArray[R.lllllllIll[0]] = lllllllIll[10];
        if (R.llIllIIIIlIII(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(lllllllIll[10], lllllllIll[1], lllllllIll[46]);
            bu.add(d2);
            0;
        }
        int[] nArray2 = new int[lllllllIll[1]];
        nArray2[R.lllllllIll[0]] = lllllllIll[14];
        if (R.llIllIIIIlIII(Bank.contains((int[])nArray2) ? 1 : 0)) {
            var18 = new d(lllllllIll[14], lllllllIll[1], lllllllIll[47]);
            bu.add((d)var18);
            0;
        }
        int[] nArray3 = new int[lllllllIll[1]];
        nArray3[R.lllllllIll[0]] = lllllllIll[4];
        if (R.llIllIIIIlIII(Bank.contains((int[])nArray3) ? 1 : 0)) {
            var18 = new d(lllllllIll[4], lllllllIll[48], lllllllIll[49]);
            bu.add((d)var18);
            0;
        }
        if (R.llIllIIIIlIII(Bank.contains((Predicate)(var18 = item -> item.getName().toLowerCase().contains(lllllllIlI[lllllllIll[56]]))) ? 1 : 0)) {
            var1 = new d(lllllllIll[50], lllllllIll[7], lllllllIll[51]);
            bu.add(var1);
            0;
        }
        int[] nArray4 = new int[lllllllIll[1]];
        nArray4[R.lllllllIll[0]] = lllllllIll[11];
        if (R.llIllIIIIlIII(Bank.contains((int[])nArray4) ? 1 : 0)) {
            var1 = new d(lllllllIll[11], lllllllIll[15], lllllllIll[52]);
            bu.add(var1);
            0;
        }
        int[] nArray5 = new int[lllllllIll[1]];
        nArray5[R.lllllllIll[0]] = lllllllIll[16];
        if (R.llIllIIIIlIII(Bank.contains((int[])nArray5) ? 1 : 0)) {
            var1 = new d(lllllllIll[16], lllllllIll[15], lllllllIll[52]);
            bu.add(var1);
            0;
        }
        int[] nArray6 = new int[lllllllIll[1]];
        nArray6[R.lllllllIll[0]] = lllllllIll[13];
        if (R.llIllIIIIlIII(Bank.contains((int[])nArray6) ? 1 : 0)) {
            var1 = new d(lllllllIll[13], lllllllIll[53], lllllllIll[52]);
            bu.add(var1);
            0;
        }
        int[] nArray7 = new int[lllllllIll[1]];
        nArray7[R.lllllllIll[0]] = lllllllIll[12];
        if (R.llIllIIIIlIII(Bank.contains((int[])nArray7) ? 1 : 0)) {
            var1 = new d(lllllllIll[12], lllllllIll[7], i.bp);
            bu.add(var1);
            0;
        }
    }

    private static boolean llIllIIIIllIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llIllIIIIlIll(Object object) {
        return object != null;
    }

    private static boolean llIllIIIIlllI(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public boolean S() {
        return lllllllIll[0];
    }

    private static boolean llIllIIIIlIlI(int n2) {
        return n2 > 0;
    }

    @Override
    public int T() {
        try {
            R.dp();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (1 <= 0) {
            return 2 & ~2;
        }
        return lllllllIll[54];
    }

    private static boolean llIllIIIIIllI(int n2) {
        return n2 != 0;
    }

    private static void llIllIIIIIIll() {
        lllllllIll = new int[89];
        R.lllllllIll[0] = (8 ^ 0x62 ^ (0xC3 ^ 0xAC)) & (124 + 91 - 162 + 146 ^ 109 + 148 - 133 + 70 ^ -1);
        R.lllllllIll[1] = 1;
        R.lllllllIll[2] = 0xEA ^ 0xAC;
        R.lllllllIll[3] = 2;
        R.lllllllIll[4] = -(0xFFFFFDC5 & 0x6A3F) & (0xFFFFED7F & 0x7BFF);
        R.lllllllIll[5] = 3;
        R.lllllllIll[6] = 0x59 ^ 0x39 ^ (0x7E ^ 0x1A);
        R.lllllllIll[7] = 0xD0 ^ 0x81 ^ (0x48 ^ 0x1C);
        R.lllllllIll[8] = 0xFFFFB39F & 0x5FE8;
        R.lllllllIll[9] = 0x53 ^ 0x55;
        R.lllllllIll[10] = -(0xFFFFD0BE & 0x7F77) & (0xFFFFFEFF & Short.MAX_VALUE);
        R.lllllllIll[11] = 0xFFFFFF69 & 0x1FDE;
        R.lllllllIll[12] = -(0xFFFF8E0F & Short.MAX_VALUE) & (0xFFFFFF7F & 0x3FDF);
        R.lllllllIll[13] = 0xFFFFBF77 & 0x5FCF;
        R.lllllllIll[14] = -(0xFFFFFE6E & 0x6DD5) & (0xFFFFFFFF & 0x6FFB);
        R.lllllllIll[15] = 0x91 ^ 0x9B;
        R.lllllllIll[16] = 0xFFFFDFCD & 0x3F7B;
        R.lllllllIll[17] = 0x34 ^ 0x4D ^ (0xD7 ^ 0xA9);
        R.lllllllIll[18] = 0x3F ^ 0x59 ^ (0x7D ^ 0x13);
        R.lllllllIll[19] = 59 + 92 - 72 + 57 ^ 32 + 32 - 50 + 115;
        R.lllllllIll[20] = 0x14 ^ 0x1F;
        R.lllllllIll[21] = 145 + 122 - 241 + 153 ^ 136 + 146 - 157 + 66;
        R.lllllllIll[22] = 0xCE ^ 0xC3;
        R.lllllllIll[23] = 0x76 ^ 0x78;
        R.lllllllIll[24] = 0xF ^ 0;
        R.lllllllIll[25] = 0xD7 ^ 0xC7;
        R.lllllllIll[26] = 0x7A ^ 0x6B;
        R.lllllllIll[27] = 0x7F ^ 0xF ^ (0xDE ^ 0xBC);
        R.lllllllIll[28] = 0x89 ^ 0x9A;
        R.lllllllIll[29] = 0x48 ^ 0x5C;
        R.lllllllIll[30] = 0x5E ^ 0x4B;
        R.lllllllIll[31] = 0x30 ^ 0x44 ^ (0xDD ^ 0xBF);
        R.lllllllIll[32] = 31 + 77 - 91 + 128 ^ 57 + 19 - 28 + 86;
        R.lllllllIll[33] = 0x52 ^ 0x4A;
        R.lllllllIll[34] = 5 ^ 0x1C;
        R.lllllllIll[35] = 0x57 ^ 0x4D;
        R.lllllllIll[36] = 0x50 ^ 0x38 ^ (0x48 ^ 0x3B);
        R.lllllllIll[37] = 0x91 ^ 0xAF ^ (0xA0 ^ 0x82);
        R.lllllllIll[38] = -(0xFFFF89DF & 0x77A8) & (0xFFFFFFAF & 0x5BF7);
        R.lllllllIll[39] = 59 + 8 - -31 + 142;
        R.lllllllIll[40] = 0x56 ^ 0x48 ^ 3;
        R.lllllllIll[41] = 68 + 134 - 108 + 45 ^ 132 + 139 - 169 + 47;
        R.lllllllIll[42] = 0x32 ^ 0x2D;
        R.lllllllIll[43] = 0x98 ^ 0xB8;
        R.lllllllIll[44] = 35 + 93 - -44 + 57 ^ 193 + 120 - 130 + 13;
        R.lllllllIll[45] = 0x2B ^ 0xF ^ (0x1E ^ 0x18);
        R.lllllllIll[46] = 0xFFFFFEBF & 0x3F5C;
        R.lllllllIll[47] = 0xFFFFDF4D & 0x37BE;
        R.lllllllIll[48] = 0xBF ^ 0x88;
        R.lllllllIll[49] = -(0xFFFFFEBD & 0x7D4E) & (0xFFFFFFFF & 0x7DFF);
        R.lllllllIll[50] = 0xFFFFBEFC & 0x6FCF;
        R.lllllllIll[51] = -(0xFFFFFFE6 & 0x1C5F) & (0xFFFFFDEF & 0x7FFD);
        R.lllllllIll[52] = -3 & (0xFFFFB7FF & 0x4F6E);
        R.lllllllIll[53] = 0x64 ^ 0x45 ^ (0xBA ^ 0xB3);
        R.lllllllIll[54] = 5 ^ 0x61;
        R.lllllllIll[55] = 0x35 ^ 0x3D ^ (4 ^ 0x2F);
        R.lllllllIll[56] = 0x46 ^ 0x79 ^ (0x61 ^ 0x7A);
        R.lllllllIll[57] = 90 + 6 - -37 + 42 ^ 0 + 29 - -2 + 107;
        R.lllllllIll[58] = 0x7A ^ 0x65 ^ (0xAC ^ 0x95);
        R.lllllllIll[59] = 0xD3 ^ 0x93 ^ (0x75 ^ 0x12);
        R.lllllllIll[60] = 0x8A ^ 0xA3;
        R.lllllllIll[61] = 0x35 ^ 0x1F;
        R.lllllllIll[62] = 0x1D ^ 0x40 ^ (0xE0 ^ 0x96);
        R.lllllllIll[63] = 0x8C ^ 0x83 ^ (0xD ^ 0x2E);
        R.lllllllIll[64] = 0x2F ^ 2;
        R.lllllllIll[65] = 0x2F ^ 1;
        R.lllllllIll[66] = 0x67 ^ 0x48;
        R.lllllllIll[67] = 0x53 ^ 0x63;
        R.lllllllIll[68] = 0xF4 ^ 0xC5;
        R.lllllllIll[69] = 84 + 91 - 85 + 57 ^ 47 + 146 - 66 + 34;
        R.lllllllIll[70] = 0x52 ^ 0x61;
        R.lllllllIll[71] = 0xD4 ^ 0x98 ^ (0x76 ^ 0xE);
        R.lllllllIll[72] = 0x70 ^ 0x45;
        R.lllllllIll[73] = 0x6E ^ 0x63 ^ (0xA ^ 0x31);
        R.lllllllIll[74] = 153 + 143 - 290 + 156 ^ 78 + 59 - 58 + 75;
        R.lllllllIll[75] = 0x5B ^ 0x62;
        R.lllllllIll[76] = 0xFFFF8D9F & 0x7EFD;
        R.lllllllIll[77] = -(0xFFFFE35D & 0x3FF6) & (0xFFFFBFFB & 0x6FFF);
        R.lllllllIll[78] = 0xFFFFBCBE & 0x4FDF;
        R.lllllllIll[79] = -(0xFFFFFA7F & 0x797) & (0xFFFFEEBF & 0x1FDF);
        R.lllllllIll[80] = 0xFFFFCC9F & 0x3FE3;
        R.lllllllIll[81] = 0xFFFFFCFE & 0xF8D;
        R.lllllllIll[82] = -(0xFFFFFFFB & 0x734D) & (0xFFFFFF6D & Short.MAX_VALUE);
        R.lllllllIll[83] = 0xFFFFFFE9 & 0xCD6;
        R.lllllllIll[84] = -(0xFFFFFA6E & 0x759B) & (0xFFFFFD2F & 0x7EDF);
        R.lllllllIll[85] = 0xFFFFDEBF & 0x2DFB;
        R.lllllllIll[86] = -(0xFFFFDF5A & 0x64A7) & (0xFFFFDFEF & 0x6FFF);
        R.lllllllIll[87] = -(0xFFFFEFC6 & 0x337B) & (0xFFFFBFFF & 0x6FEF);
        R.lllllllIll[88] = 0xA9 ^ 0x93;
    }

    private static int llIllIIIIIlIl(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    private static String llIllIIIIIIII(String var23, String var16) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var16.getBytes(StandardCharsets.UTF_8)), lllllllIll[18]), "DES");
            Cipher var5 = Cipher.getInstance("DES");
            var5.init(lllllllIll[3], var2);
            return new String(var5.doFinal(Base64.getDecoder().decode(var23.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean V() {
        int n2;
        if (R.llIllIIIIlllI(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lllllllIll[18])) {
            int[] nArray = new int[lllllllIll[1]];
            nArray[R.lllllllIll[0]] = lllllllIll[38];
            if (R.llIllIIIIlIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                n2 = lllllllIll[1];
                0;
                if (null == null) return n2 != 0;
                return false;
            }
        }
        n2 = lllllllIll[0];
        return n2 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean aa() {
        int n2;
        String[] stringArray = new String[lllllllIll[1]];
        stringArray[R.lllllllIll[0]] = lllllllIlI[lllllllIll[45]];
        if (R.llIllIIIIIllI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            int[] nArray = new int[lllllllIll[1]];
            nArray[R.lllllllIll[0]] = lllllllIll[4];
            if (R.llIllIIIIIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                n2 = lllllllIll[1];
                0;
                if ((1 & (1 ^ -1)) == 0) return n2 != 0;
                return (((0x17 ^ 0x4C) & ~(0x21 ^ 0x7A) ^ (0x9B ^ 0x93)) & (0xC1 ^ 0x97 ^ (0x2B ^ 0x75) ^ -1)) != 0;
            }
        }
        n2 = lllllllIll[0];
        return n2 != 0;
    }

    private static boolean llIllIIIIIlll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIllIIIIlIIl(int n2) {
        return n2 < 0;
    }

    private static String llIllIIIIIIIl(String var3, String var20) {
        try {
            SecretKeySpec var21 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var20.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var15 = Cipher.getInstance("Blowfish");
            var15.init(lllllllIll[3], var21);
            return new String(var15.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    private static boolean llIllIIIIllII(int n2, int n3) {
        return n2 > n3;
    }

    private static int llIllIIIIIlII(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static void llIllIIIIIIlI() {
        lllllllIlI = new String[lllllllIll[88]];
        R.lllllllIlI[R.lllllllIll[0]] = R."Buying items";
        R.lllllllIlI[R.lllllllIll[1]] = R."Finished buying items, switching back to quest";
        R.lllllllIlI[R.lllllllIll[3]] = R."Drink";
        R.lllllllIlI[R.lllllllIll[5]] = R."Eat";
        R.lllllllIlI[R.lllllllIll[6]] = R."Nav to bank";
        R.lllllllIlI[R.lllllllIll[7]] = R."Handling banking";
        R.lllllllIlI[R.lllllllIll[9]] = R."We are missing quest supplies, switching to BUYING";
        R.lllllllIlI[R.lllllllIll[17]] = R."Nav to start";
        R.lllllllIlI[R.lllllllIll[18]] = R."Interact npc";
        R.lllllllIlI[R.lllllllIll[19]] = R."Drop";
        R.lllllllIlI[R.lllllllIll[15]] = R."Veos";
        R.lllllllIlI[R.lllllllIll[20]] = R."Treasure scroll";
        R.lllllllIlI[R.lllllllIll[21]] = R."Wear";
        R.lllllllIlI[R.lllllllIll[22]] = R."Wear";
        R.lllllllIlI[R.lllllllIll[23]] = R."Nav to dig 1";
        R.lllllllIlI[R.lllllllIll[24]] = R."Spade";
        R.lllllllIlI[R.lllllllIll[25]] = R."Dig";
        R.lllllllIlI[R.lllllllIll[26]] = R."Nav to dig 2";
        R.lllllllIlI[R.lllllllIll[27]] = R."Spade";
        R.lllllllIlI[R.lllllllIll[28]] = R."Dig";
        R.lllllllIlI[R.lllllllIll[29]] = R."Nav to dig 3";
        R.lllllllIlI[R.lllllllIll[30]] = R."Spade";
        R.lllllllIlI[R.lllllllIll[31]] = R."Dig";
        R.lllllllIlI[R.lllllllIll[32]] = R."Nav to dig 4";
        R.lllllllIlI[R.lllllllIll[33]] = R."Spade";
        R.lllllllIlI[R.lllllllIll[34]] = R."Dig";
        R.lllllllIlI[R.lllllllIll[35]] = R."Nav to veos finish";
        R.lllllllIlI[R.lllllllIll[36]] = R."Interact npc";
        R.lllllllIlI[R.lllllllIll[37]] = R."Veos";
        R.lllllllIlI[R.lllllllIll[40]] = R."Rubbing lamp";
        R.lllllllIlI[R.lllllllIll[41]] = R."Rub";
        R.lllllllIlI[R.lllllllIll[42]] = R."Selecting slayer";
        R.lllllllIlI[R.lllllllIll[43]] = R."Slayer";
        R.lllllllIlI[R.lllllllIll[44]] = R."Confirm";
        R.lllllllIlI[R.lllllllIll[45]] = R."Spade";
        R.lllllllIlI[R.lllllllIll[55]] = R."X marks the spot quest";
        R.lllllllIlI[R.lllllllIll[56]] = R."ring of wealth (";
        R.lllllllIlI[R.lllllllIll[57]] = R."wealth";
        R.lllllllIlI[R.lllllllIll[58]] = R."wealth";
        R.lllllllIlI[R.lllllllIll[59]] = R."wealth";
        R.lllllllIlI[R.lllllllIll[53]] = R."glory";
        R.lllllllIlI[R.lllllllIll[60]] = R."glory";
        R.lllllllIlI[R.lllllllIll[61]] = R."glory";
        R.lllllllIlI[R.lllllllIll[62]] = R."Ok, I'm up for an adventure.";
        R.lllllllIlI[R.lllllllIll[63]] = R."A glass of your finest ale please.";
        R.lllllllIlI[R.lllllllIll[64]] = R."Morgan needs your help!";
        R.lllllllIlI[R.lllllllIll[65]] = R."Yes.";
        R.lllllllIlI[R.lllllllIll[66]] = R."I'm looking for a quest!";
        R.lllllllIlI[R.lllllllIll[67]] = R."Ok, let me help then.";
        R.lllllllIlI[R.lllllllIll[68]] = R."Father Aereck sent me to talk to you.";
        R.lllllllIlI[R.lllllllIll[69]] = R."He's got a ghost haunting his graveyard.";
        R.lllllllIlI[R.lllllllIll[70]] = R."Yep, now tell me what the problem is.";
        R.lllllllIlI[R.lllllllIll[71]] = R."Sure.";
        R.lllllllIlI[R.lllllllIll[72]] = R."I'm wearing an amulet of ghost speak!";
        R.lllllllIlI[R.lllllllIll[73]] = R."Yes, I'm sure.";
        R.lllllllIlI[R.lllllllIll[48]] = R."How can I help?";
        R.lllllllIlI[R.lllllllIll[74]] = R."I'm looking for a quest.";
        R.lllllllIlI[R.lllllllIll[75]] = R."Can I help?";
    }
}

