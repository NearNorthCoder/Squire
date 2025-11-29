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

public class aa
implements ab {
    static /* synthetic */ boolean dl;
    private static final /* synthetic */ WorldPoint lV;
    public static final /* synthetic */ String[] lR;
    public static /* synthetic */ List<d> bx;
    static /* synthetic */ int cI;
    static /* synthetic */ int dk;
    private static /* synthetic */ String[] llIlllllI;
    private static final /* synthetic */ WorldPoint lT;
    private static final /* synthetic */ WorldPoint lW;
    private static final /* synthetic */ WorldPoint lS;
    public static /* synthetic */ long g;
    private static final /* synthetic */ WorldPoint lX;
    public static /* synthetic */ boolean bv;
    private static /* synthetic */ int[] lllIIIIII;
    private static final /* synthetic */ WorldPoint lU;

    @Override
    public boolean ae() {
        return lllIIIIII[0];
    }

    private static int lIlllllIIllI(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean ah() {
        int n2;
        if (aa.lIllllllIIlI(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lllIIIIII[18])) {
            int[] nArray = new int[lllIIIIII[1]];
            nArray[aa.lllIIIIII[0]] = lllIIIIII[38];
            if (aa.lIlllllIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                n2 = lllIIIIII[1];
                0;
                if (null == null) return n2 != 0;
                return ((0x36 ^ 0x41 ^ (0x7B ^ 0x14)) & (76 + 114 - 77 + 106 ^ 162 + 35 - 112 + 110 ^ -1)) != 0;
            }
        }
        n2 = lllIIIIII[0];
        return n2 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        String[] stringArray = new String[lllIIIIII[1]];
        stringArray[aa.lllIIIIII[0]] = llIlllllI[lllIIIIII[45]];
        if (aa.lIlllllIlIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            int[] nArray = new int[lllIIIIII[1]];
            nArray[aa.lllIIIIII[0]] = lllIIIIII[4];
            if (aa.lIlllllIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                n2 = lllIIIIII[1];
                0;
                if (((0x77 ^ 0x2A) & ~(0x70 ^ 0x2D)) >= 0) return n2 != 0;
                return false;
            }
        }
        n2 = lllIIIIII[0];
        return n2 != 0;
    }

    private static boolean lIllllllIIlI(int n2, int n3) {
        return n2 >= n3;
    }

    private static void lIllllIlIIlI() {
        llIlllllI = new String[lllIIIIII[88]];
        aa.llIlllllI[aa.lllIIIIII[0]] = aa."Buying items";
        aa.llIlllllI[aa.lllIIIIII[1]] = aa."Finished buying items, switching back to quest";
        aa.llIlllllI[aa.lllIIIIII[3]] = aa."Drink";
        aa.llIlllllI[aa.lllIIIIII[5]] = aa."Eat";
        aa.llIlllllI[aa.lllIIIIII[6]] = aa."Nav to bank";
        aa.llIlllllI[aa.lllIIIIII[7]] = aa."Handling banking";
        aa.llIlllllI[aa.lllIIIIII[9]] = aa."We are missing quest supplies, switching to BUYING";
        aa.llIlllllI[aa.lllIIIIII[17]] = aa."Nav to start";
        aa.llIlllllI[aa.lllIIIIII[18]] = aa."Interact npc";
        aa.llIlllllI[aa.lllIIIIII[19]] = aa."Drop";
        aa.llIlllllI[aa.lllIIIIII[15]] = aa."Veos";
        aa.llIlllllI[aa.lllIIIIII[20]] = aa."Treasure scroll";
        aa.llIlllllI[aa.lllIIIIII[21]] = aa."Wear";
        aa.llIlllllI[aa.lllIIIIII[22]] = aa."Wear";
        aa.llIlllllI[aa.lllIIIIII[23]] = aa."Nav to dig 1";
        aa.llIlllllI[aa.lllIIIIII[24]] = aa."Spade";
        aa.llIlllllI[aa.lllIIIIII[25]] = aa."Dig";
        aa.llIlllllI[aa.lllIIIIII[26]] = aa."Nav to dig 2";
        aa.llIlllllI[aa.lllIIIIII[27]] = aa."Spade";
        aa.llIlllllI[aa.lllIIIIII[28]] = aa."Dig";
        aa.llIlllllI[aa.lllIIIIII[29]] = aa."Nav to dig 3";
        aa.llIlllllI[aa.lllIIIIII[30]] = aa."Spade";
        aa.llIlllllI[aa.lllIIIIII[31]] = aa."Dig";
        aa.llIlllllI[aa.lllIIIIII[32]] = aa."Nav to dig 4";
        aa.llIlllllI[aa.lllIIIIII[33]] = aa."Spade";
        aa.llIlllllI[aa.lllIIIIII[34]] = aa."Dig";
        aa.llIlllllI[aa.lllIIIIII[35]] = aa."Nav to veos finish";
        aa.llIlllllI[aa.lllIIIIII[36]] = aa."Interact npc";
        aa.llIlllllI[aa.lllIIIIII[37]] = aa."Veos";
        aa.llIlllllI[aa.lllIIIIII[40]] = aa."Rubbing lamp";
        aa.llIlllllI[aa.lllIIIIII[41]] = aa."Rub";
        aa.llIlllllI[aa.lllIIIIII[42]] = aa."Selecting slayer";
        aa.llIlllllI[aa.lllIIIIII[43]] = aa."Slayer";
        aa.llIlllllI[aa.lllIIIIII[44]] = aa."Confirm";
        aa.llIlllllI[aa.lllIIIIII[45]] = aa."Spade";
        aa.llIlllllI[aa.lllIIIIII[55]] = aa."X marks the spot quest";
        aa.llIlllllI[aa.lllIIIIII[56]] = aa."ring of wealth (";
        aa.llIlllllI[aa.lllIIIIII[57]] = aa."wealth";
        aa.llIlllllI[aa.lllIIIIII[58]] = aa."wealth";
        aa.llIlllllI[aa.lllIIIIII[59]] = aa."wealth";
        aa.llIlllllI[aa.lllIIIIII[53]] = aa."glory";
        aa.llIlllllI[aa.lllIIIIII[60]] = aa."glory";
        aa.llIlllllI[aa.lllIIIIII[61]] = aa."glory";
        aa.llIlllllI[aa.lllIIIIII[62]] = aa."Ok, I'm up for an adventure.";
        aa.llIlllllI[aa.lllIIIIII[63]] = aa."A glass of your finest ale please.";
        aa.llIlllllI[aa.lllIIIIII[64]] = aa."Morgan needs your help!";
        aa.llIlllllI[aa.lllIIIIII[65]] = aa."Yes.";
        aa.llIlllllI[aa.lllIIIIII[66]] = aa."I'm looking for a quest!";
        aa.llIlllllI[aa.lllIIIIII[67]] = aa."Ok, let me help then.";
        aa.llIlllllI[aa.lllIIIIII[68]] = aa."Father Aereck sent me to talk to you.";
        aa.llIlllllI[aa.lllIIIIII[69]] = aa."He's got a ghost haunting his graveyard.";
        aa.llIlllllI[aa.lllIIIIII[70]] = aa."Yep, now tell me what the problem is.";
        aa.llIlllllI[aa.lllIIIIII[71]] = aa."Sure.";
        aa.llIlllllI[aa.lllIIIIII[72]] = aa."I'm wearing an amulet of ghost speak!";
        aa.llIlllllI[aa.lllIIIIII[73]] = aa."Yes, I'm sure.";
        aa.llIlllllI[aa.lllIIIIII[48]] = aa."How can I help?";
        aa.llIlllllI[aa.lllIIIIII[74]] = aa."I'm looking for a quest.";
        aa.llIlllllI[aa.lllIIIIII[75]] = aa."Can I help?";
    }

    private static boolean lIlllllIlllI(Object object) {
        return object != null;
    }

    private static String lIllllIIIIll(String llllllIIIIlll, String llllllIIIIlII) {
        try {
            SecretKeySpec llllllIIIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllIIIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllIIIlIIl = Cipher.getInstance("Blowfish");
            llllllIIIlIIl.init(lllIIIIII[3], llllllIIIlIlI);
            return new String(llllllIIIlIIl.doFinal(Base64.getDecoder().decode(llllllIIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllIIIlIII) {
            llllllIIIlIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIllllllIIII(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public int af() {
        try {
            aa.dQ();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (1 > 3) {
            return (78 + 91 - 38 + 27 ^ 149 + 50 - 135 + 88) & (0xF8 ^ 0x91 ^ (0x5B ^ 0x34) ^ -1);
        }
        return lllIIIIII[54];
    }

    public static void dQ() {
        if (aa.lIlllllIlIIl(bv ? 1 : 0)) {
            AccBuilderGWD.c = llIlllllI[lllIIIIII[0]];
            b.a(bx);
            if (aa.lIlllllIlIlI(bx.size(), lllIIIIII[1])) {
                System.out.println(llIlllllI[lllIIIIII[1]]);
                bv = lllIIIIII[0];
            }
        }
        if (aa.lIlllllIlIll(bv ? 1 : 0)) {
            block49: {
                BankLocation llllllIlllIll;
                if (aa.lIlllllIlIIl(Inventory.contains((int[])f.bc) ? 1 : 0) && aa.lIlllllIlIlI(Movement.getRunEnergy(), lllIIIIII[2])) {
                    Inventory.getFirst((int[])f.bc).interact(llIlllllI[lllIIIIII[3]]);
                    Time.sleepTicks((int)lllIIIIII[1]);
                    0;
                }
                if (aa.lIlllllIllII(aa.lIlllllIIllI(e.w(), 70.0))) {
                    int[] nArray = new int[lllIIIIII[1]];
                    nArray[aa.lllIIIIII[0]] = lllIIIIII[4];
                    if (aa.lIlllllIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray2 = new int[lllIIIIII[1]];
                        nArray2[aa.lllIIIIII[0]] = lllIIIIII[4];
                        Inventory.getFirst((int[])nArray2).interact(llIlllllI[lllIIIIII[5]]);
                    }
                }
                if (aa.lIlllllIlIll(Movement.isRunEnabled() ? 1 : 0) && aa.lIlllllIllIl(Movement.getRunEnergy())) {
                    Movement.toggleRun();
                }
                if (aa.lIlllllIlIll(aa.an() ? 1 : 0) && aa.lIlllllIlIll(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()))) {
                    llllllIlllIll = BankLocation.getNearest();
                    if (aa.lIlllllIlllI(llllllIlllIll) && aa.lIlllllIlIll(llllllIlllIll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderGWD.c = llIlllllI[lllIIIIII[6]];
                        a.a(llllllIlllIll);
                        Time.sleepTicks((int)lllIIIIII[3]);
                        0;
                    }
                    if (aa.lIlllllIlllI(llllllIlllIll) && aa.lIlllllIlIIl(llllllIlllIll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderGWD.c = llIlllllI[lllIIIIII[7]];
                        if (aa.lIlllllIlIll(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)lllIIIIII[8]);
                            0;
                        }
                        if (aa.lIlllllIlIIl(Bank.isOpen() ? 1 : 0)) {
                            if (aa.lIlllllIllIl(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lllIIIIII[6]);
                                0;
                            }
                            if (aa.lIlllllIllIl(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)lllIIIIII[3]);
                                0;
                            }
                            int[] nArray = new int[lllIIIIII[9]];
                            nArray[aa.lllIIIIII[0]] = lllIIIIII[10];
                            nArray[aa.lllIIIIII[1]] = lllIIIIII[11];
                            nArray[aa.lllIIIIII[3]] = lllIIIIII[12];
                            nArray[aa.lllIIIIII[5]] = lllIIIIII[13];
                            nArray[aa.lllIIIIII[6]] = lllIIIIII[4];
                            nArray[aa.lllIIIIII[7]] = lllIIIIII[14];
                            if (aa.lIlllllIlIll(e.d(nArray) ? 1 : 0)) {
                                aa.Q();
                                System.out.println(llIlllllI[lllIIIIII[9]]);
                                bv = lllIIIIII[1];
                                return;
                            }
                            int[] nArray3 = new int[lllIIIIII[9]];
                            nArray3[aa.lllIIIIII[0]] = lllIIIIII[10];
                            nArray3[aa.lllIIIIII[1]] = lllIIIIII[11];
                            nArray3[aa.lllIIIIII[3]] = lllIIIIII[12];
                            nArray3[aa.lllIIIIII[5]] = lllIIIIII[13];
                            nArray3[aa.lllIIIIII[6]] = lllIIIIII[4];
                            nArray3[aa.lllIIIIII[7]] = lllIIIIII[14];
                            if (aa.lIlllllIlIIl(e.d(nArray3) ? 1 : 0)) {
                                Bank.withdraw((int)lllIIIIII[11], (int)lllIIIIII[15], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)lllIIIIII[1]);
                                0;
                                Bank.withdraw((int)lllIIIIII[14], (int)lllIIIIII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)lllIIIIII[1]);
                                0;
                                Bank.withdraw((int)lllIIIIII[16], (int)lllIIIIII[15], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)lllIIIIII[1]);
                                0;
                                Bank.withdraw((int)lllIIIIII[13], (int)lllIIIIII[7], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)lllIIIIII[1]);
                                0;
                                Bank.withdraw((int)lllIIIIII[10], (int)lllIIIIII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)lllIIIIII[1]);
                                0;
                                a.b(f.bc, lllIIIIII[6]);
                                a.a(lllIIIIII[4], lllIIIIII[15]);
                                a.b(f.bm, lllIIIIII[1]);
                            }
                        }
                    }
                }
                if (aa.lIlllllIlIll(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId())) && aa.lIlllllIlIIl(aa.an() ? 1 : 0)) {
                    if (aa.lIlllllIllll(Players.getLocal().getWorldLocation().distanceTo(lS), lllIIIIII[3])) {
                        AccBuilderGWD.c = llIlllllI[lllIIIIII[17]];
                        if (aa.lIlllllIlIlI(cI, lllIIIIII[1])) {
                            e.x();
                            cI += lllIIIIII[1];
                        }
                        Movement.walkTo((WorldPoint)lS);
                        0;
                        Time.sleepTicks((int)lllIIIIII[1]);
                        0;
                    }
                    if (aa.lIllllllIIII(Players.getLocal().getWorldLocation().distanceTo(lS), lllIIIIII[3])) {
                        AccBuilderGWD.c = llIlllllI[lllIIIIII[18]];
                        if (aa.lIlllllIlIll(aa.lIlllllIlIII(g, 0L))) {
                            g = System.currentTimeMillis();
                        }
                        if (aa.lIlllllIlIIl(aa.lIlllllIlIII(g, 0L)) && aa.lIlllllIllIl(aa.lIlllllIlIII(e.a(g), 30000L))) {
                            cI = lllIIIIII[0];
                            g = System.currentTimeMillis();
                        }
                        if (aa.lIlllllIlIlI(cI, lllIIIIII[1])) {
                            e.x();
                            cI += lllIIIIII[1];
                        }
                        if (aa.lIlllllIlIIl(Inventory.isFull() ? 1 : 0)) {
                            int[] nArray = new int[lllIIIIII[1]];
                            nArray[aa.lllIIIIII[0]] = lllIIIIII[4];
                            Inventory.getFirst((int[])nArray).interact(llIlllllI[lllIIIIII[19]]);
                            Time.sleepTicks((int)lllIIIIII[3]);
                            0;
                        }
                        -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.g.a(llIlllllI[lllIIIIII[15]], lR, lllIIIIII[1]);
                    }
                }
                if (aa.lIllllllIIIl(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lllIIIIII[1])) {
                    dk = lllIIIIII[0];
                    String[] stringArray = new String[lllIIIIII[1]];
                    stringArray[aa.lllIIIIII[0]] = llIlllllI[lllIIIIII[20]];
                    if (aa.lIlllllIlIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.g.a(lR);
                    }
                }
                if (aa.lIllllllIIIl(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lllIIIIII[3])) {
                    if (aa.lIlllllIlIIl(Inventory.contains(item -> item.getName().contains(llIlllllI[lllIIIIII[61]])) ? 1 : 0) && aa.lIlllllIlIll(Equipment.contains(item -> item.getName().contains(llIlllllI[lllIIIIII[60]])) ? 1 : 0)) {
                        Inventory.getFirst(item -> item.getName().contains(llIlllllI[lllIIIIII[53]])).interact(llIlllllI[lllIIIIII[21]]);
                    }
                    if (aa.lIlllllIlIIl(Inventory.contains(item -> item.getName().contains(llIlllllI[lllIIIIII[59]])) ? 1 : 0) && aa.lIlllllIlIll(Equipment.contains(item -> item.getName().contains(llIlllllI[lllIIIIII[58]])) ? 1 : 0)) {
                        Inventory.getFirst(item -> item.getName().contains(llIlllllI[lllIIIIII[57]])).interact(llIlllllI[lllIIIIII[22]]);
                    }
                    if (aa.lIlllllIlIll(Players.getLocal().getWorldLocation().equals((Object)lT) ? 1 : 0)) {
                        AccBuilderGWD.c = llIlllllI[lllIIIIII[23]];
                        Movement.walkTo((WorldPoint)lT);
                        0;
                        Time.sleepTicks((int)lllIIIIII[1]);
                        0;
                    }
                    if (aa.lIlllllIlIIl(Players.getLocal().getWorldLocation().equals((Object)lT) ? 1 : 0)) {
                        String[] stringArray = new String[lllIIIIII[1]];
                        stringArray[aa.lllIIIIII[0]] = llIlllllI[lllIIIIII[24]];
                        Inventory.getFirst((String[])stringArray).interact(llIlllllI[lllIIIIII[25]]);
                        Time.sleepTicks((int)lllIIIIII[3]);
                        0;
                    }
                }
                if (aa.lIllllllIIIl(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lllIIIIII[5])) {
                    if (aa.lIlllllIlIll(Players.getLocal().getWorldLocation().equals((Object)lU) ? 1 : 0)) {
                        AccBuilderGWD.c = llIlllllI[lllIIIIII[26]];
                        Movement.walkTo((WorldPoint)lU);
                        0;
                        Time.sleepTicks((int)lllIIIIII[1]);
                        0;
                    }
                    if (aa.lIlllllIlIIl(Players.getLocal().getWorldLocation().equals((Object)lU) ? 1 : 0)) {
                        String[] stringArray = new String[lllIIIIII[1]];
                        stringArray[aa.lllIIIIII[0]] = llIlllllI[lllIIIIII[27]];
                        Inventory.getFirst((String[])stringArray).interact(llIlllllI[lllIIIIII[28]]);
                        Time.sleepTicks((int)lllIIIIII[3]);
                        0;
                    }
                }
                if (aa.lIllllllIIIl(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lllIIIIII[6])) {
                    if (aa.lIlllllIlIll(Players.getLocal().getWorldLocation().equals((Object)lV) ? 1 : 0)) {
                        AccBuilderGWD.c = llIlllllI[lllIIIIII[29]];
                        Movement.walkTo((WorldPoint)lV);
                        0;
                        Time.sleepTicks((int)lllIIIIII[1]);
                        0;
                    }
                    if (aa.lIlllllIlIIl(Players.getLocal().getWorldLocation().equals((Object)lV) ? 1 : 0)) {
                        String[] stringArray = new String[lllIIIIII[1]];
                        stringArray[aa.lllIIIIII[0]] = llIlllllI[lllIIIIII[30]];
                        Inventory.getFirst((String[])stringArray).interact(llIlllllI[lllIIIIII[31]]);
                        Time.sleepTicks((int)lllIIIIII[3]);
                        0;
                    }
                }
                if (aa.lIllllllIIIl(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lllIIIIII[7])) {
                    if (aa.lIlllllIlIll(Players.getLocal().getWorldLocation().equals((Object)lW) ? 1 : 0)) {
                        AccBuilderGWD.c = llIlllllI[lllIIIIII[32]];
                        Movement.walkTo((WorldPoint)lW);
                        0;
                        Time.sleepTicks((int)lllIIIIII[1]);
                        0;
                    }
                    if (aa.lIlllllIlIIl(Players.getLocal().getWorldLocation().equals((Object)lW) ? 1 : 0)) {
                        String[] stringArray = new String[lllIIIIII[1]];
                        stringArray[aa.lllIIIIII[0]] = llIlllllI[lllIIIIII[33]];
                        Inventory.getFirst((String[])stringArray).interact(llIlllllI[lllIIIIII[34]]);
                        Time.sleepTicks((int)lllIIIIII[3]);
                        0;
                    }
                }
                if (aa.lIllllllIIIl(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lllIIIIII[9])) {
                    if (aa.lIlllllIllll(Players.getLocal().getWorldLocation().distanceTo(lX), lllIIIIII[5])) {
                        AccBuilderGWD.c = llIlllllI[lllIIIIII[35]];
                        Movement.walkTo((WorldPoint)lX);
                        0;
                        Time.sleepTicks((int)lllIIIIII[1]);
                        0;
                    }
                    if (aa.lIllllllIIII(Players.getLocal().getWorldLocation().distanceTo(lX), lllIIIIII[5])) {
                        AccBuilderGWD.c = llIlllllI[lllIIIIII[36]];
                        if (aa.lIlllllIlIlI(dk, lllIIIIII[1])) {
                            as.pI += lllIIIIII[1];
                            as.u(AccBuilderGWD.m);
                            dk += lllIIIIII[1];
                            as.pI = lllIIIIII[0];
                            dl = lllIIIIII[0];
                        }
                        -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.g.a(llIlllllI[lllIIIIII[37]], lR);
                    }
                }
                if (aa.lIllllllIIIl(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lllIIIIII[17])) {
                    -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.g.a(lR);
                }
                do {
                    int[] nArray = new int[lllIIIIII[1]];
                    nArray[aa.lllIIIIII[0]] = lllIIIIII[38];
                    if (!aa.lIlllllIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block49;
                    if (aa.lIlllllIlllI(Widgets.get((int)lllIIIIII[39]))) {
                        Widget llllllIlllIlI;
                        AccBuilderGWD.c = llIlllllI[lllIIIIII[40]];
                        int[] nArray4 = new int[lllIIIIII[1]];
                        nArray4[aa.lllIIIIII[0]] = lllIIIIII[38];
                        Inventory.getFirst((int[])nArray4).interact(llIlllllI[lllIIIIII[41]]);
                        Time.sleepTicks((int)lllIIIIII[6]);
                        0;
                        AccBuilderGWD.c = llIlllllI[lllIIIIII[42]];
                        llllllIlllIll = Widgets.get((int)lllIIIIII[39], (int)lllIIIIII[23]);
                        if (aa.lIlllllIlllI(llllllIlllIll)) {
                            llllllIlllIll.interact(llIlllllI[lllIIIIII[43]]);
                            Time.sleepTicks((int)lllIIIIII[1]);
                            0;
                        }
                        if (aa.lIlllllIlllI(llllllIlllIlI = Widgets.get((int)lllIIIIII[39], (int)lllIIIIII[35]))) {
                            llllllIlllIlI.interact(llIlllllI[lllIIIIII[44]]);
                            Time.sleepTicks((int)lllIIIIII[3]);
                            0;
                        }
                    }
                    Time.sleepTicks((int)lllIIIIII[1]);
                    0;
                    0;
                } while (-1 != 3);
                return;
            }
            -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.g.a(new String[lllIIIIII[0]]);
        }
    }

    private static int lIlllllIlIII(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    @Override
    public String ag() {
        return llIlllllI[lllIIIIII[55]];
    }

    static {
        aa.lIlllllIIlII();
        aa.lIllllIlIIlI();
        String[] stringArray = new String[lllIIIIII[24]];
        stringArray[aa.lllIIIIII[0]] = llIlllllI[lllIIIIII[62]];
        stringArray[aa.lllIIIIII[1]] = llIlllllI[lllIIIIII[63]];
        stringArray[aa.lllIIIIII[3]] = llIlllllI[lllIIIIII[64]];
        stringArray[aa.lllIIIIII[5]] = llIlllllI[lllIIIIII[65]];
        stringArray[aa.lllIIIIII[6]] = llIlllllI[lllIIIIII[66]];
        stringArray[aa.lllIIIIII[7]] = llIlllllI[lllIIIIII[67]];
        stringArray[aa.lllIIIIII[9]] = llIlllllI[lllIIIIII[68]];
        stringArray[aa.lllIIIIII[17]] = llIlllllI[lllIIIIII[69]];
        stringArray[aa.lllIIIIII[18]] = llIlllllI[lllIIIIII[70]];
        stringArray[aa.lllIIIIII[19]] = llIlllllI[lllIIIIII[71]];
        stringArray[aa.lllIIIIII[15]] = llIlllllI[lllIIIIII[72]];
        stringArray[aa.lllIIIIII[20]] = llIlllllI[lllIIIIII[73]];
        stringArray[aa.lllIIIIII[21]] = llIlllllI[lllIIIIII[48]];
        stringArray[aa.lllIIIIII[22]] = llIlllllI[lllIIIIII[74]];
        stringArray[aa.lllIIIIII[23]] = llIlllllI[lllIIIIII[75]];
        lR = stringArray;
        lS = new WorldPoint(lllIIIIII[76], lllIIIIII[77], lllIIIIII[0]);
        lT = new WorldPoint(lllIIIIII[78], lllIIIIII[79], lllIIIIII[0]);
        lU = new WorldPoint(lllIIIIII[80], lllIIIIII[81], lllIIIIII[0]);
        lV = new WorldPoint(lllIIIIII[82], lllIIIIII[83], lllIIIIII[0]);
        lW = new WorldPoint(lllIIIIII[84], lllIIIIII[85], lllIIIIII[0]);
        lX = new WorldPoint(lllIIIIII[86], lllIIIIII[87], lllIIIIII[0]);
        bx = new ArrayList<d>();
        cI = lllIIIIII[0];
    }

    private static boolean lIllllllIIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static String lIllllIIIIIl(String llllllIlIllII, String llllllIlIlIll) {
        try {
            SecretKeySpec llllllIlIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllIlIlIll.getBytes(StandardCharsets.UTF_8)), lllIIIIII[18]), "DES");
            Cipher llllllIlIlllI = Cipher.getInstance("DES");
            llllllIlIlllI.init(lllIIIIII[3], llllllIlIllll);
            return new String(llllllIlIlllI.doFinal(Base64.getDecoder().decode(llllllIlIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllIlIllIl) {
            llllllIlIllIl.printStackTrace();
            return null;
        }
    }

    private static String lIllllIIIIlI(String llllllIIlllII, String llllllIIllIll) {
        llllllIIlllII = new String(Base64.getDecoder().decode(llllllIIlllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllIIllIlI = new StringBuilder();
        char[] llllllIIllIIl = llllllIIllIll.toCharArray();
        int llllllIIllIII = lllIIIIII[0];
        char[] llllllIIlIIlI = llllllIIlllII.toCharArray();
        int llllllIIlIIIl = llllllIIlIIlI.length;
        int llllllIIlIIII = lllIIIIII[0];
        while (aa.lIlllllIlIlI(llllllIIlIIII, llllllIIlIIIl)) {
            char llllllIIlllIl = llllllIIlIIlI[llllllIIlIIII];
            llllllIIllIlI.append((char)(llllllIIlllIl ^ llllllIIllIIl[llllllIIllIII % llllllIIllIIl.length]));
            0;
            ++llllllIIllIII;
            ++llllllIIlIIII;
            0;
            
            return null;
        }
        return String.valueOf(llllllIIllIlI);
    }

    private static boolean lIlllllIllII(int n2) {
        return n2 < 0;
    }

    private static void Q() {
        d llllllIllIllI;
        Object llllllIllIlll;
        int[] nArray = new int[lllIIIIII[1]];
        nArray[aa.lllIIIIII[0]] = lllIIIIII[10];
        if (aa.lIlllllIlIll(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(lllIIIIII[10], lllIIIIII[1], lllIIIIII[46]);
            bx.add(d2);
            0;
        }
        int[] nArray2 = new int[lllIIIIII[1]];
        nArray2[aa.lllIIIIII[0]] = lllIIIIII[14];
        if (aa.lIlllllIlIll(Bank.contains((int[])nArray2) ? 1 : 0)) {
            llllllIllIlll = new d(lllIIIIII[14], lllIIIIII[1], lllIIIIII[47]);
            bx.add((d)llllllIllIlll);
            0;
        }
        int[] nArray3 = new int[lllIIIIII[1]];
        nArray3[aa.lllIIIIII[0]] = lllIIIIII[4];
        if (aa.lIlllllIlIll(Bank.contains((int[])nArray3) ? 1 : 0)) {
            llllllIllIlll = new d(lllIIIIII[4], lllIIIIII[48], lllIIIIII[49]);
            bx.add((d)llllllIllIlll);
            0;
        }
        if (aa.lIlllllIlIll(Bank.contains((Predicate)(llllllIllIlll = item -> item.getName().toLowerCase().contains(llIlllllI[lllIIIIII[56]]))) ? 1 : 0)) {
            llllllIllIllI = new d(lllIIIIII[50], lllIIIIII[7], lllIIIIII[51]);
            bx.add(llllllIllIllI);
            0;
        }
        int[] nArray4 = new int[lllIIIIII[1]];
        nArray4[aa.lllIIIIII[0]] = lllIIIIII[11];
        if (aa.lIlllllIlIll(Bank.contains((int[])nArray4) ? 1 : 0)) {
            llllllIllIllI = new d(lllIIIIII[11], lllIIIIII[15], lllIIIIII[52]);
            bx.add(llllllIllIllI);
            0;
        }
        int[] nArray5 = new int[lllIIIIII[1]];
        nArray5[aa.lllIIIIII[0]] = lllIIIIII[16];
        if (aa.lIlllllIlIll(Bank.contains((int[])nArray5) ? 1 : 0)) {
            llllllIllIllI = new d(lllIIIIII[16], lllIIIIII[15], lllIIIIII[52]);
            bx.add(llllllIllIllI);
            0;
        }
        int[] nArray6 = new int[lllIIIIII[1]];
        nArray6[aa.lllIIIIII[0]] = lllIIIIII[13];
        if (aa.lIlllllIlIll(Bank.contains((int[])nArray6) ? 1 : 0)) {
            llllllIllIllI = new d(lllIIIIII[13], lllIIIIII[53], lllIIIIII[52]);
            bx.add(llllllIllIllI);
            0;
        }
        int[] nArray7 = new int[lllIIIIII[1]];
        nArray7[aa.lllIIIIII[0]] = lllIIIIII[12];
        if (aa.lIlllllIlIll(Bank.contains((int[])nArray7) ? 1 : 0)) {
            llllllIllIllI = new d(lllIIIIII[12], lllIIIIII[7], j.ch);
            bx.add(llllllIllIllI);
            0;
        }
    }

    private static boolean lIlllllIllIl(int n2) {
        return n2 > 0;
    }

    private static void lIlllllIIlII() {
        lllIIIIII = new int[89];
        aa.lllIIIIII[0] = (0x6C ^ 0x20) & ~(0xDA ^ 0x96);
        aa.lllIIIIII[1] = 1;
        aa.lllIIIIII[2] = 0x56 ^ 0x10;
        aa.lllIIIIII[3] = 2;
        aa.lllIIIIII[4] = 0xFFFF9FFB & 0x617F;
        aa.lllIIIIII[5] = 3;
        aa.lllIIIIII[6] = 0x43 ^ 0x47;
        aa.lllIIIIII[7] = 41 + 97 - 77 + 106 ^ 34 + 153 - 133 + 108;
        aa.lllIIIIII[8] = -(0xFFFFEC6B & 0x7FF6) & (0xFFFFFFF9 & 0x7FEF);
        aa.lllIIIIII[9] = 133 + 78 - 153 + 111 ^ 132 + 145 - 221 + 119;
        aa.lllIIIIII[10] = 0xFFFFAFEB & 0x7EDE;
        aa.lllIIIIII[11] = 0xFFFF9FC9 & 0x7F7E;
        aa.lllIIIIII[12] = -(0xFFFFFFEF & 0xE95) & (0xFFFFFFD7 & 0x3FFD);
        aa.lllIIIIII[13] = -(0xFFFFE5FD & 0x7ABB) & (0xFFFFFFFF & Short.MAX_VALUE);
        aa.lllIIIIII[14] = 0xFFFFABFA & 0x57BD;
        aa.lllIIIIII[15] = 110 + 42 - 57 + 43 ^ 14 + 126 - 34 + 22;
        aa.lllIIIIII[16] = 0xFFFFFFE9 & 0x1F5F;
        aa.lllIIIIII[17] = 0x80 ^ 0x87;
        aa.lllIIIIII[18] = 0x35 ^ 0x49 ^ (0x6C ^ 0x18);
        aa.lllIIIIII[19] = 0x69 ^ 0x60;
        aa.lllIIIIII[20] = 0xB1 ^ 0xC0 ^ (0x78 ^ 2);
        aa.lllIIIIII[21] = 0x64 ^ 0x27 ^ (0x56 ^ 0x19);
        aa.lllIIIIII[22] = 0x8D ^ 0x98 ^ (1 ^ 0x19);
        aa.lllIIIIII[23] = 0x5A ^ 0x28 ^ (0x14 ^ 0x68);
        aa.lllIIIIII[24] = 0xFE ^ 0x86 ^ (0x49 ^ 0x3E);
        aa.lllIIIIII[25] = 0x33 ^ 0x23;
        aa.lllIIIIII[26] = 0xC2 ^ 0x9B ^ (0xD5 ^ 0x9D);
        aa.lllIIIIII[27] = 0xF ^ 0x2C ^ (0x6F ^ 0x5E);
        aa.lllIIIIII[28] = 0x25 ^ 0x36;
        aa.lllIIIIII[29] = 0x98 ^ 0x8C;
        aa.lllIIIIII[30] = 0x29 ^ 0x3C;
        aa.lllIIIIII[31] = 0xC7 ^ 0xB4 ^ (0x1C ^ 0x79);
        aa.lllIIIIII[32] = 0xDE ^ 0xC1 ^ (0x4B ^ 0x43);
        aa.lllIIIIII[33] = 0x90 ^ 0x88;
        aa.lllIIIIII[34] = 0x4F ^ 0x56;
        aa.lllIIIIII[35] = 19 + 103 - 17 + 111 ^ 165 + 60 - 191 + 160;
        aa.lllIIIIII[36] = 39 + 13 - 23 + 104 ^ 79 + 84 - 62 + 57;
        aa.lllIIIIII[37] = 0x77 ^ 0x6B;
        aa.lllIIIIII[38] = -(0xFFFFC597 & 0x3EFB) & (0xFFFFFFFA & 0x5EB7);
        aa.lllIIIIII[39] = 172 + 112 - 89 + 45;
        aa.lllIIIIII[40] = 0x89 ^ 0x94;
        aa.lllIIIIII[41] = 0x24 ^ 0x3A;
        aa.lllIIIIII[42] = 0x23 ^ 0x50 ^ (0x54 ^ 0x38);
        aa.lllIIIIII[43] = 0xB9 ^ 0x8D ^ (0x7E ^ 0x6A);
        aa.lllIIIIII[44] = 0x44 ^ 0x65;
        aa.lllIIIIII[45] = 0x4E ^ 0x6C;
        aa.lllIIIIII[46] = -(0xFFFFEEEF & 0x51D2) & (0xFFFFFFDF & 0x7EFD);
        aa.lllIIIIII[47] = -(0xFFFFAC7F & 0x5BA3) & (0xFFFF9FAE & 0x7F7F);
        aa.lllIIIIII[48] = 0x80 ^ 0xB7;
        aa.lllIIIIII[49] = 0xFFFFBFFF & 0x41F4;
        aa.lllIIIIII[50] = 0xFFFFFFDE & 0x2EED;
        aa.lllIIIIII[51] = 0xFFFFFDED & 0x63BA;
        aa.lllIIIIII[52] = -(0xFFFFEF35 & 0x78DE) & (0xFFFFFF7F & 0x6FFF);
        aa.lllIIIIII[53] = 38 + 129 - 150 + 139 ^ 134 + 69 - 154 + 131;
        aa.lllIIIIII[54] = 0x62 ^ 0x3A ^ (0x7E ^ 0x42);
        aa.lllIIIIII[55] = 0x81 ^ 0xA2;
        aa.lllIIIIII[56] = 0x38 ^ 0x12 ^ (0xA0 ^ 0xAE);
        aa.lllIIIIII[57] = 93 + 104 - 145 + 91 ^ 65 + 82 - 42 + 65;
        aa.lllIIIIII[58] = 0xB9 ^ 0x9F;
        aa.lllIIIIII[59] = 0x59 ^ 0x7E;
        aa.lllIIIIII[60] = 0x45 ^ 0x1D ^ (0x40 ^ 0x31);
        aa.lllIIIIII[61] = 0x7F ^ 0x1F ^ (0x71 ^ 0x3B);
        aa.lllIIIIII[62] = 0xB7 ^ 0xAB ^ (1 ^ 0x36);
        aa.lllIIIIII[63] = 0xB1 ^ 0x9D;
        aa.lllIIIIII[64] = 0xA8 ^ 0x85;
        aa.lllIIIIII[65] = 0x58 ^ 0x76;
        aa.lllIIIIII[66] = 0x46 ^ 0x69;
        aa.lllIIIIII[67] = 0x29 ^ 0x6E ^ (0x19 ^ 0x6E);
        aa.lllIIIIII[68] = 0x61 ^ 0x72 ^ (0x90 ^ 0xB2);
        aa.lllIIIIII[69] = 0x67 ^ 0x61 ^ (0xBD ^ 0x89);
        aa.lllIIIIII[70] = 7 ^ 0x34;
        aa.lllIIIIII[71] = 4 ^ 0x30;
        aa.lllIIIIII[72] = 2 ^ (0x5A ^ 0x6D);
        aa.lllIIIIII[73] = 0x75 ^ 0x43;
        aa.lllIIIIII[74] = 1 ^ 0x39;
        aa.lllIIIIII[75] = 0x90 ^ 0xA9;
        aa.lllIIIIII[76] = 0xFFFF9DFF & 0x6E9D;
        aa.lllIIIIII[77] = -(0xFFFFDF7F & 0x33D5) & (0xFFFFFFFC & 0x1FFF);
        aa.lllIIIIII[78] = 0xFFFFBDFF & 0x4E9E;
        aa.lllIIIIII[79] = -(0xFFFFD37F & 0x3F87) & (0xFFFFFFEF & 0x1F9F);
        aa.lllIIIIII[80] = -(0x48 ^ 0x7D) & (0xFFFFFFBF & 0xCF7);
        aa.lllIIIIII[81] = 0xFFFFAE8F & 0x5DFC;
        aa.lllIIIIII[82] = -(0xFFFFF3EB & 0x7FDF) & (0xFFFFFFFF & 0x7FEF);
        aa.lllIIIIII[83] = -(0xFFFFD35F & 0x7FBA) & (0xFFFFFFDB & 0x5FFD);
        aa.lllIIIIII[84] = -(0xFFFFF33B & 0x7EDE) & (0xFFFFFEDF & 0x7F3F);
        aa.lllIIIIII[85] = 0xFFFFEDFF & 0x1EBB;
        aa.lllIIIIII[86] = 0xFFFFEFEF & 0x1BFE;
        aa.lllIIIIII[87] = 0xFFFFEDEF & 0x1EBE;
        aa.lllIIIIII[88] = 0x5B ^ 0x61;
    }

    private static boolean lIlllllIlIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIlllllIllll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlllllIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlllllIlIll(int n2) {
        return n2 == 0;
    }
}

