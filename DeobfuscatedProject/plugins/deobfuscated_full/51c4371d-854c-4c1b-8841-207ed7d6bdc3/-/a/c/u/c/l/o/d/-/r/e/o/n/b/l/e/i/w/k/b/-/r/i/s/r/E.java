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
package -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r;

import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.F;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.Q;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.a;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.b;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.d;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.e;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.f;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.g;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.i;
import gg.squire.account.AccBuilderBarrows;
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

public class E
implements F {
    private static final /* synthetic */ WorldPoint is;
    private static final /* synthetic */ WorldPoint io;
    static /* synthetic */ int bZ;
    public static /* synthetic */ long g;
    public static final /* synthetic */ String[] in;
    static /* synthetic */ boolean cj;
    private static final /* synthetic */ WorldPoint ip;
    public static /* synthetic */ List<d> bB;
    private static /* synthetic */ int[] lIlIllII;
    public static /* synthetic */ boolean bz;
    private static /* synthetic */ String[] lIlIlIlI;
    private static final /* synthetic */ WorldPoint iq;
    private static final /* synthetic */ WorldPoint ir;
    static /* synthetic */ int ci;
    private static final /* synthetic */ WorldPoint it;

    private static boolean lIIIlllllIl(int n2) {
        return n2 > 0;
    }

    private static boolean lIIlIIIIIlI(int n2, int n3) {
        return n2 >= n3;
    }

    private static void ag() {
        d lIllllIIIIIIIIl;
        Object lIllllIIIIIIIlI;
        int[] nArray = new int[lIlIllII[1]];
        nArray[E.lIlIllII[0]] = lIlIllII[10];
        if (E.lIIIllllIll(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(lIlIllII[10], lIlIllII[1], lIlIllII[46]);
            bB.add(d2);
            0;
        }
        int[] nArray2 = new int[lIlIllII[1]];
        nArray2[E.lIlIllII[0]] = lIlIllII[14];
        if (E.lIIIllllIll(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lIllllIIIIIIIlI = new d(lIlIllII[14], lIlIllII[1], lIlIllII[47]);
            bB.add((d)lIllllIIIIIIIlI);
            0;
        }
        int[] nArray3 = new int[lIlIllII[1]];
        nArray3[E.lIlIllII[0]] = lIlIllII[4];
        if (E.lIIIllllIll(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lIllllIIIIIIIlI = new d(lIlIllII[4], lIlIllII[48], lIlIllII[49]);
            bB.add((d)lIllllIIIIIIIlI);
            0;
        }
        if (E.lIIIllllIll(Bank.contains((Predicate)(lIllllIIIIIIIlI = item -> item.getName().toLowerCase().contains(lIlIlIlI[lIlIllII[56]]))) ? 1 : 0)) {
            lIllllIIIIIIIIl = new d(lIlIllII[50], lIlIllII[7], lIlIllII[51]);
            bB.add(lIllllIIIIIIIIl);
            0;
        }
        int[] nArray4 = new int[lIlIllII[1]];
        nArray4[E.lIlIllII[0]] = lIlIllII[11];
        if (E.lIIIllllIll(Bank.contains((int[])nArray4) ? 1 : 0)) {
            lIllllIIIIIIIIl = new d(lIlIllII[11], lIlIllII[15], lIlIllII[52]);
            bB.add(lIllllIIIIIIIIl);
            0;
        }
        int[] nArray5 = new int[lIlIllII[1]];
        nArray5[E.lIlIllII[0]] = lIlIllII[16];
        if (E.lIIIllllIll(Bank.contains((int[])nArray5) ? 1 : 0)) {
            lIllllIIIIIIIIl = new d(lIlIllII[16], lIlIllII[15], lIlIllII[52]);
            bB.add(lIllllIIIIIIIIl);
            0;
        }
        int[] nArray6 = new int[lIlIllII[1]];
        nArray6[E.lIlIllII[0]] = lIlIllII[13];
        if (E.lIIIllllIll(Bank.contains((int[])nArray6) ? 1 : 0)) {
            lIllllIIIIIIIIl = new d(lIlIllII[13], lIlIllII[53], lIlIllII[52]);
            bB.add(lIllllIIIIIIIIl);
            0;
        }
        int[] nArray7 = new int[lIlIllII[1]];
        nArray7[E.lIlIllII[0]] = lIlIllII[12];
        if (E.lIIIllllIll(Bank.contains((int[])nArray7) ? 1 : 0)) {
            lIllllIIIIIIIIl = new d(lIlIllII[12], lIlIllII[7], i.bw);
            bB.add(lIllllIIIIIIIIl);
            0;
        }
    }

    static {
        E.lIIIlllIllI();
        E.lIIIlllIlIl();
        String[] stringArray = new String[lIlIllII[24]];
        stringArray[E.lIlIllII[0]] = lIlIlIlI[lIlIllII[62]];
        stringArray[E.lIlIllII[1]] = lIlIlIlI[lIlIllII[63]];
        stringArray[E.lIlIllII[3]] = lIlIlIlI[lIlIllII[64]];
        stringArray[E.lIlIllII[5]] = lIlIlIlI[lIlIllII[65]];
        stringArray[E.lIlIllII[6]] = lIlIlIlI[lIlIllII[66]];
        stringArray[E.lIlIllII[7]] = lIlIlIlI[lIlIllII[67]];
        stringArray[E.lIlIllII[9]] = lIlIlIlI[lIlIllII[68]];
        stringArray[E.lIlIllII[17]] = lIlIlIlI[lIlIllII[69]];
        stringArray[E.lIlIllII[18]] = lIlIlIlI[lIlIllII[70]];
        stringArray[E.lIlIllII[19]] = lIlIlIlI[lIlIllII[71]];
        stringArray[E.lIlIllII[15]] = lIlIlIlI[lIlIllII[72]];
        stringArray[E.lIlIllII[20]] = lIlIlIlI[lIlIllII[73]];
        stringArray[E.lIlIllII[21]] = lIlIlIlI[lIlIllII[48]];
        stringArray[E.lIlIllII[22]] = lIlIlIlI[lIlIllII[74]];
        stringArray[E.lIlIllII[23]] = lIlIlIlI[lIlIllII[75]];
        in = stringArray;
        io = new WorldPoint(lIlIllII[76], lIlIllII[77], lIlIllII[0]);
        ip = new WorldPoint(lIlIllII[78], lIlIllII[79], lIlIllII[0]);
        iq = new WorldPoint(lIlIllII[80], lIlIllII[81], lIlIllII[0]);
        ir = new WorldPoint(lIlIllII[82], lIlIllII[83], lIlIllII[0]);
        is = new WorldPoint(lIlIllII[84], lIlIllII[85], lIlIllII[0]);
        it = new WorldPoint(lIlIllII[86], lIlIllII[87], lIlIllII[0]);
        bB = new ArrayList<d>();
        bZ = lIlIllII[0];
    }

    private static boolean lIIIllllIIl(int n2) {
        return n2 != 0;
    }

    private static int lIIIlllIlll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean lIIlIIIIIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static void lIIIlllIlIl() {
        lIlIlIlI = new String[lIlIllII[88]];
        E.lIlIlIlI[E.lIlIllII[0]] = E."Buying items";
        E.lIlIlIlI[E.lIlIllII[1]] = E."Finished buying items, switching back to quest";
        E.lIlIlIlI[E.lIlIllII[3]] = E."Drink";
        E.lIlIlIlI[E.lIlIllII[5]] = E."Eat";
        E.lIlIlIlI[E.lIlIllII[6]] = E."Nav to bank";
        E.lIlIlIlI[E.lIlIllII[7]] = E."Handling banking";
        E.lIlIlIlI[E.lIlIllII[9]] = E."We are missing quest supplies, switching to BUYING";
        E.lIlIlIlI[E.lIlIllII[17]] = E."Nav to start";
        E.lIlIlIlI[E.lIlIllII[18]] = E."Interact npc";
        E.lIlIlIlI[E.lIlIllII[19]] = E."Drop";
        E.lIlIlIlI[E.lIlIllII[15]] = E."Veos";
        E.lIlIlIlI[E.lIlIllII[20]] = E."Treasure scroll";
        E.lIlIlIlI[E.lIlIllII[21]] = E."Wear";
        E.lIlIlIlI[E.lIlIllII[22]] = E."Wear";
        E.lIlIlIlI[E.lIlIllII[23]] = E."Nav to dig 1";
        E.lIlIlIlI[E.lIlIllII[24]] = E."Spade";
        E.lIlIlIlI[E.lIlIllII[25]] = E."Dig";
        E.lIlIlIlI[E.lIlIllII[26]] = E."Nav to dig 2";
        E.lIlIlIlI[E.lIlIllII[27]] = E."Spade";
        E.lIlIlIlI[E.lIlIllII[28]] = E."Dig";
        E.lIlIlIlI[E.lIlIllII[29]] = E."Nav to dig 3";
        E.lIlIlIlI[E.lIlIllII[30]] = E."Spade";
        E.lIlIlIlI[E.lIlIllII[31]] = E."Dig";
        E.lIlIlIlI[E.lIlIllII[32]] = E."Nav to dig 4";
        E.lIlIlIlI[E.lIlIllII[33]] = E."Spade";
        E.lIlIlIlI[E.lIlIllII[34]] = E."Dig";
        E.lIlIlIlI[E.lIlIllII[35]] = E."Nav to veos finish";
        E.lIlIlIlI[E.lIlIllII[36]] = E."Interact npc";
        E.lIlIlIlI[E.lIlIllII[37]] = E."Veos";
        E.lIlIlIlI[E.lIlIllII[40]] = E."Rubbing lamp";
        E.lIlIlIlI[E.lIlIllII[41]] = E."Rub";
        E.lIlIlIlI[E.lIlIllII[42]] = E."Selecting slayer";
        E.lIlIlIlI[E.lIlIllII[43]] = E."Slayer";
        E.lIlIlIlI[E.lIlIllII[44]] = E."Confirm";
        E.lIlIlIlI[E.lIlIllII[45]] = E."Spade";
        E.lIlIlIlI[E.lIlIllII[55]] = E."X marks the spot quest";
        E.lIlIlIlI[E.lIlIllII[56]] = E."ring of wealth (";
        E.lIlIlIlI[E.lIlIllII[57]] = E."wealth";
        E.lIlIlIlI[E.lIlIllII[58]] = E."wealth";
        E.lIlIlIlI[E.lIlIllII[59]] = E."wealth";
        E.lIlIlIlI[E.lIlIllII[53]] = E."glory";
        E.lIlIlIlI[E.lIlIllII[60]] = E."glory";
        E.lIlIlIlI[E.lIlIllII[61]] = E."glory";
        E.lIlIlIlI[E.lIlIllII[62]] = E."Ok, I'm up for an adventure.";
        E.lIlIlIlI[E.lIlIllII[63]] = E."A glass of your finest ale please.";
        E.lIlIlIlI[E.lIlIllII[64]] = E."Morgan needs your help!";
        E.lIlIlIlI[E.lIlIllII[65]] = E."Yes.";
        E.lIlIlIlI[E.lIlIllII[66]] = E."I'm looking for a quest!";
        E.lIlIlIlI[E.lIlIllII[67]] = E."Ok, let me help then.";
        E.lIlIlIlI[E.lIlIllII[68]] = E."Father Aereck sent me to talk to you.";
        E.lIlIlIlI[E.lIlIllII[69]] = E."He's got a ghost haunting his graveyard.";
        E.lIlIlIlI[E.lIlIllII[70]] = E."Yep, now tell me what the problem is.";
        E.lIlIlIlI[E.lIlIllII[71]] = E."Sure.";
        E.lIlIlIlI[E.lIlIllII[72]] = E."I'm wearing an amulet of ghost speak!";
        E.lIlIlIlI[E.lIlIllII[73]] = E."Yes, I'm sure.";
        E.lIlIlIlI[E.lIlIllII[48]] = E."How can I help?";
        E.lIlIlIlI[E.lIlIllII[74]] = E."I'm looking for a quest.";
        E.lIlIlIlI[E.lIlIllII[75]] = E."Can I help?";
    }

    private static boolean lIIIllllllI(Object object) {
        return object != null;
    }

    private static boolean lIIIlllllII(int n2) {
        return n2 < 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean W() {
        int n2;
        if (E.lIIlIIIIIlI(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIlIllII[18])) {
            int[] nArray = new int[lIlIllII[1]];
            nArray[E.lIlIllII[0]] = lIlIllII[38];
            if (E.lIIIllllIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                n2 = lIlIllII[1];
                0;
                if (3 >= -1) return n2 != 0;
                return false;
            }
        }
        n2 = lIlIllII[0];
        return n2 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ac() {
        int n2;
        String[] stringArray = new String[lIlIllII[1]];
        stringArray[E.lIlIllII[0]] = lIlIlIlI[lIlIllII[45]];
        if (E.lIIIllllIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            int[] nArray = new int[lIlIllII[1]];
            nArray[E.lIlIllII[0]] = lIlIllII[4];
            if (E.lIIIllllIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                n2 = lIlIllII[1];
                0;
                if (-1 >= -1) return n2 != 0;
                return false;
            }
        }
        n2 = lIlIllII[0];
        return n2 != 0;
    }

    public static void ck() {
        if (E.lIIIllllIIl(bz ? 1 : 0)) {
            AccBuilderBarrows.c = lIlIlIlI[lIlIllII[0]];
            b.a(bB);
            if (E.lIIIllllIlI(bB.size(), lIlIllII[1])) {
                System.out.println(lIlIlIlI[lIlIllII[1]]);
                bz = lIlIllII[0];
            }
        }
        if (E.lIIIllllIll(bz ? 1 : 0)) {
            block49: {
                BankLocation lIllllIIIIIIllI;
                if (E.lIIIllllIIl(Inventory.contains((int[])f.bb) ? 1 : 0) && E.lIIIllllIlI(Movement.getRunEnergy(), lIlIllII[2])) {
                    Inventory.getFirst((int[])f.bb).interact(lIlIlIlI[lIlIllII[3]]);
                    Time.sleepTicks((int)lIlIllII[1]);
                    0;
                }
                if (E.lIIIlllllII(E.lIIIlllIlll(e.v(), 70.0))) {
                    int[] nArray = new int[lIlIllII[1]];
                    nArray[E.lIlIllII[0]] = lIlIllII[4];
                    if (E.lIIIllllIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray2 = new int[lIlIllII[1]];
                        nArray2[E.lIlIllII[0]] = lIlIllII[4];
                        Inventory.getFirst((int[])nArray2).interact(lIlIlIlI[lIlIllII[5]]);
                    }
                }
                if (E.lIIIllllIll(Movement.isRunEnabled() ? 1 : 0) && E.lIIIlllllIl(Movement.getRunEnergy())) {
                    Movement.toggleRun();
                }
                if (E.lIIIllllIll(E.ac() ? 1 : 0) && E.lIIIllllIll(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()))) {
                    lIllllIIIIIIllI = BankLocation.getNearest();
                    if (E.lIIIllllllI(lIllllIIIIIIllI) && E.lIIIllllIll(lIllllIIIIIIllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderBarrows.c = lIlIlIlI[lIlIllII[6]];
                        a.a(lIllllIIIIIIllI);
                        Time.sleepTicks((int)lIlIllII[3]);
                        0;
                    }
                    if (E.lIIIllllllI(lIllllIIIIIIllI) && E.lIIIllllIIl(lIllllIIIIIIllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderBarrows.c = lIlIlIlI[lIlIllII[7]];
                        if (E.lIIIllllIll(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)lIlIllII[8]);
                            0;
                        }
                        if (E.lIIIllllIIl(Bank.isOpen() ? 1 : 0)) {
                            if (E.lIIIlllllIl(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lIlIllII[6]);
                                0;
                            }
                            if (E.lIIIlllllIl(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)lIlIllII[3]);
                                0;
                            }
                            int[] nArray = new int[lIlIllII[9]];
                            nArray[E.lIlIllII[0]] = lIlIllII[10];
                            nArray[E.lIlIllII[1]] = lIlIllII[11];
                            nArray[E.lIlIllII[3]] = lIlIllII[12];
                            nArray[E.lIlIllII[5]] = lIlIllII[13];
                            nArray[E.lIlIllII[6]] = lIlIllII[4];
                            nArray[E.lIlIllII[7]] = lIlIllII[14];
                            if (E.lIIIllllIll(e.b(nArray) ? 1 : 0)) {
                                E.ag();
                                System.out.println(lIlIlIlI[lIlIllII[9]]);
                                bz = lIlIllII[1];
                                return;
                            }
                            int[] nArray3 = new int[lIlIllII[9]];
                            nArray3[E.lIlIllII[0]] = lIlIllII[10];
                            nArray3[E.lIlIllII[1]] = lIlIllII[11];
                            nArray3[E.lIlIllII[3]] = lIlIllII[12];
                            nArray3[E.lIlIllII[5]] = lIlIllII[13];
                            nArray3[E.lIlIllII[6]] = lIlIllII[4];
                            nArray3[E.lIlIllII[7]] = lIlIllII[14];
                            if (E.lIIIllllIIl(e.b(nArray3) ? 1 : 0)) {
                                Bank.withdraw((int)lIlIllII[11], (int)lIlIllII[15], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)lIlIllII[1]);
                                0;
                                Bank.withdraw((int)lIlIllII[14], (int)lIlIllII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)lIlIllII[1]);
                                0;
                                Bank.withdraw((int)lIlIllII[16], (int)lIlIllII[15], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)lIlIllII[1]);
                                0;
                                Bank.withdraw((int)lIlIllII[13], (int)lIlIllII[7], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)lIlIllII[1]);
                                0;
                                Bank.withdraw((int)lIlIllII[10], (int)lIlIllII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)lIlIllII[1]);
                                0;
                                a.b(f.bb, lIlIllII[6]);
                                a.a(lIlIllII[4], lIlIllII[15]);
                                a.b(f.bl, lIlIllII[1]);
                            }
                        }
                    }
                }
                if (E.lIIIllllIll(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId())) && E.lIIIllllIIl(E.ac() ? 1 : 0)) {
                    if (E.lIIIlllllll(Players.getLocal().getWorldLocation().distanceTo(io), lIlIllII[3])) {
                        AccBuilderBarrows.c = lIlIlIlI[lIlIllII[17]];
                        if (E.lIIIllllIlI(bZ, lIlIllII[1])) {
                            e.w();
                            bZ += lIlIllII[1];
                        }
                        Movement.walkTo((WorldPoint)io);
                        0;
                        Time.sleepTicks((int)lIlIllII[1]);
                        0;
                    }
                    if (E.lIIlIIIIIII(Players.getLocal().getWorldLocation().distanceTo(io), lIlIllII[3])) {
                        AccBuilderBarrows.c = lIlIlIlI[lIlIllII[18]];
                        if (E.lIIIllllIll(E.lIIIllllIII(g, 0L))) {
                            g = System.currentTimeMillis();
                        }
                        if (E.lIIIllllIIl(E.lIIIllllIII(g, 0L)) && E.lIIIlllllIl(E.lIIIllllIII(e.a(g), 30000L))) {
                            bZ = lIlIllII[0];
                            g = System.currentTimeMillis();
                        }
                        if (E.lIIIllllIlI(bZ, lIlIllII[1])) {
                            e.w();
                            bZ += lIlIllII[1];
                        }
                        if (E.lIIIllllIIl(Inventory.isFull() ? 1 : 0)) {
                            int[] nArray = new int[lIlIllII[1]];
                            nArray[E.lIlIllII[0]] = lIlIllII[4];
                            Inventory.getFirst((int[])nArray).interact(lIlIlIlI[lIlIllII[19]]);
                            Time.sleepTicks((int)lIlIllII[3]);
                            0;
                        }
                        -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.g.a(lIlIlIlI[lIlIllII[15]], in, lIlIllII[1]);
                    }
                }
                if (E.lIIlIIIIIIl(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIlIllII[1])) {
                    ci = lIlIllII[0];
                    String[] stringArray = new String[lIlIllII[1]];
                    stringArray[E.lIlIllII[0]] = lIlIlIlI[lIlIllII[20]];
                    if (E.lIIIllllIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.g.a(in);
                    }
                }
                if (E.lIIlIIIIIIl(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIlIllII[3])) {
                    if (E.lIIIllllIIl(Inventory.contains(item -> item.getName().contains(lIlIlIlI[lIlIllII[61]])) ? 1 : 0) && E.lIIIllllIll(Equipment.contains(item -> item.getName().contains(lIlIlIlI[lIlIllII[60]])) ? 1 : 0)) {
                        Inventory.getFirst(item -> item.getName().contains(lIlIlIlI[lIlIllII[53]])).interact(lIlIlIlI[lIlIllII[21]]);
                    }
                    if (E.lIIIllllIIl(Inventory.contains(item -> item.getName().contains(lIlIlIlI[lIlIllII[59]])) ? 1 : 0) && E.lIIIllllIll(Equipment.contains(item -> item.getName().contains(lIlIlIlI[lIlIllII[58]])) ? 1 : 0)) {
                        Inventory.getFirst(item -> item.getName().contains(lIlIlIlI[lIlIllII[57]])).interact(lIlIlIlI[lIlIllII[22]]);
                    }
                    if (E.lIIIllllIll(Players.getLocal().getWorldLocation().equals((Object)ip) ? 1 : 0)) {
                        AccBuilderBarrows.c = lIlIlIlI[lIlIllII[23]];
                        Movement.walkTo((WorldPoint)ip);
                        0;
                        Time.sleepTicks((int)lIlIllII[1]);
                        0;
                    }
                    if (E.lIIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)ip) ? 1 : 0)) {
                        String[] stringArray = new String[lIlIllII[1]];
                        stringArray[E.lIlIllII[0]] = lIlIlIlI[lIlIllII[24]];
                        Inventory.getFirst((String[])stringArray).interact(lIlIlIlI[lIlIllII[25]]);
                        Time.sleepTicks((int)lIlIllII[3]);
                        0;
                    }
                }
                if (E.lIIlIIIIIIl(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIlIllII[5])) {
                    if (E.lIIIllllIll(Players.getLocal().getWorldLocation().equals((Object)iq) ? 1 : 0)) {
                        AccBuilderBarrows.c = lIlIlIlI[lIlIllII[26]];
                        Movement.walkTo((WorldPoint)iq);
                        0;
                        Time.sleepTicks((int)lIlIllII[1]);
                        0;
                    }
                    if (E.lIIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)iq) ? 1 : 0)) {
                        String[] stringArray = new String[lIlIllII[1]];
                        stringArray[E.lIlIllII[0]] = lIlIlIlI[lIlIllII[27]];
                        Inventory.getFirst((String[])stringArray).interact(lIlIlIlI[lIlIllII[28]]);
                        Time.sleepTicks((int)lIlIllII[3]);
                        0;
                    }
                }
                if (E.lIIlIIIIIIl(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIlIllII[6])) {
                    if (E.lIIIllllIll(Players.getLocal().getWorldLocation().equals((Object)ir) ? 1 : 0)) {
                        AccBuilderBarrows.c = lIlIlIlI[lIlIllII[29]];
                        Movement.walkTo((WorldPoint)ir);
                        0;
                        Time.sleepTicks((int)lIlIllII[1]);
                        0;
                    }
                    if (E.lIIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)ir) ? 1 : 0)) {
                        String[] stringArray = new String[lIlIllII[1]];
                        stringArray[E.lIlIllII[0]] = lIlIlIlI[lIlIllII[30]];
                        Inventory.getFirst((String[])stringArray).interact(lIlIlIlI[lIlIllII[31]]);
                        Time.sleepTicks((int)lIlIllII[3]);
                        0;
                    }
                }
                if (E.lIIlIIIIIIl(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIlIllII[7])) {
                    if (E.lIIIllllIll(Players.getLocal().getWorldLocation().equals((Object)is) ? 1 : 0)) {
                        AccBuilderBarrows.c = lIlIlIlI[lIlIllII[32]];
                        Movement.walkTo((WorldPoint)is);
                        0;
                        Time.sleepTicks((int)lIlIllII[1]);
                        0;
                    }
                    if (E.lIIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)is) ? 1 : 0)) {
                        String[] stringArray = new String[lIlIllII[1]];
                        stringArray[E.lIlIllII[0]] = lIlIlIlI[lIlIllII[33]];
                        Inventory.getFirst((String[])stringArray).interact(lIlIlIlI[lIlIllII[34]]);
                        Time.sleepTicks((int)lIlIllII[3]);
                        0;
                    }
                }
                if (E.lIIlIIIIIIl(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIlIllII[9])) {
                    if (E.lIIIlllllll(Players.getLocal().getWorldLocation().distanceTo(it), lIlIllII[5])) {
                        AccBuilderBarrows.c = lIlIlIlI[lIlIllII[35]];
                        Movement.walkTo((WorldPoint)it);
                        0;
                        Time.sleepTicks((int)lIlIllII[1]);
                        0;
                    }
                    if (E.lIIlIIIIIII(Players.getLocal().getWorldLocation().distanceTo(it), lIlIllII[5])) {
                        AccBuilderBarrows.c = lIlIlIlI[lIlIllII[36]];
                        if (E.lIIIllllIlI(ci, lIlIllII[1])) {
                            Q.mj += lIlIllII[1];
                            Q.o(AccBuilderBarrows.m);
                            ci += lIlIllII[1];
                            Q.mj = lIlIllII[0];
                            cj = lIlIllII[0];
                        }
                        -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.g.a(lIlIlIlI[lIlIllII[37]], in);
                    }
                }
                if (E.lIIlIIIIIIl(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIlIllII[17])) {
                    -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.g.a(in);
                }
                do {
                    int[] nArray = new int[lIlIllII[1]];
                    nArray[E.lIlIllII[0]] = lIlIllII[38];
                    if (!E.lIIIllllIIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block49;
                    if (E.lIIIllllllI(Widgets.get((int)lIlIllII[39]))) {
                        Widget lIllllIIIIIIlIl;
                        AccBuilderBarrows.c = lIlIlIlI[lIlIllII[40]];
                        int[] nArray4 = new int[lIlIllII[1]];
                        nArray4[E.lIlIllII[0]] = lIlIllII[38];
                        Inventory.getFirst((int[])nArray4).interact(lIlIlIlI[lIlIllII[41]]);
                        Time.sleepTicks((int)lIlIllII[6]);
                        0;
                        AccBuilderBarrows.c = lIlIlIlI[lIlIllII[42]];
                        lIllllIIIIIIllI = Widgets.get((int)lIlIllII[39], (int)lIlIllII[23]);
                        if (E.lIIIllllllI(lIllllIIIIIIllI)) {
                            lIllllIIIIIIllI.interact(lIlIlIlI[lIlIllII[43]]);
                            Time.sleepTicks((int)lIlIllII[1]);
                            0;
                        }
                        if (E.lIIIllllllI(lIllllIIIIIIlIl = Widgets.get((int)lIlIllII[39], (int)lIlIllII[35]))) {
                            lIllllIIIIIIlIl.interact(lIlIlIlI[lIlIllII[44]]);
                            Time.sleepTicks((int)lIlIllII[3]);
                            0;
                        }
                    }
                    Time.sleepTicks((int)lIlIllII[1]);
                    0;
                    0;
                } while ((0x8A ^ 0x8E) == (0x73 ^ 0x77));
                return;
            }
            -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.g.a(new String[lIlIllII[0]]);
        }
    }

    @Override
    public boolean T() {
        return lIlIllII[0];
    }

    private static int lIIIllllIII(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    @Override
    public int U() {
        try {
            E.ck();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (-1 >= 0) {
            return (0x4B ^ 0x66) & ~(0xAD ^ 0x80);
        }
        return lIlIllII[54];
    }

    private static String lIIIllIllll(String lIlllIlllllIlII, String lIlllIlllllIIll) {
        lIlllIlllllIlII = new String(Base64.getDecoder().decode(lIlllIlllllIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlllIlllllIIlI = new StringBuilder();
        char[] lIlllIlllllIIIl = lIlllIlllllIIll.toCharArray();
        int lIlllIlllllIIII = lIlIllII[0];
        char[] lIlllIllllIlIlI = lIlllIlllllIlII.toCharArray();
        int lIlllIllllIlIIl = lIlllIllllIlIlI.length;
        int lIlllIllllIlIII = lIlIllII[0];
        while (E.lIIIllllIlI(lIlllIllllIlIII, lIlllIllllIlIIl)) {
            char lIlllIlllllIlIl = lIlllIllllIlIlI[lIlllIllllIlIII];
            lIlllIlllllIIlI.append((char)(lIlllIlllllIlIl ^ lIlllIlllllIIIl[lIlllIlllllIIII % lIlllIlllllIIIl.length]));
            0;
            ++lIlllIlllllIIII;
            ++lIlllIllllIlIII;
            0;
            if (-1 != 1) continue;
            return null;
        }
        return String.valueOf(lIlllIlllllIIlI);
    }

    private static boolean lIIIlllllll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIlIIIIIII(int n2, int n3) {
        return n2 <= n3;
    }

    private static String lIIIlllIIII(String lIlllIlllIlllIl, String lIlllIlllIllllI) {
        try {
            SecretKeySpec lIlllIllllIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlllIlllIllllI.getBytes(StandardCharsets.UTF_8)), lIlIllII[18]), "DES");
            Cipher lIlllIllllIIIIl = Cipher.getInstance("DES");
            lIlllIllllIIIIl.init(lIlIllII[3], lIlllIllllIIIlI);
            return new String(lIlllIllllIIIIl.doFinal(Base64.getDecoder().decode(lIlllIlllIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlllIllllIIIII) {
            lIlllIllllIIIII.printStackTrace();
            return null;
        }
    }

    private static String lIIIlllIIIl(String lIlllIlllIlIIII, String lIlllIlllIIllll) {
        try {
            SecretKeySpec lIlllIlllIlIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlllIlllIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlllIlllIlIlII = Cipher.getInstance("Blowfish");
            lIlllIlllIlIlII.init(lIlIllII[3], lIlllIlllIlIlIl);
            return new String(lIlllIlllIlIlII.doFinal(Base64.getDecoder().decode(lIlllIlllIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlllIlllIlIIll) {
            lIlllIlllIlIIll.printStackTrace();
            return null;
        }
    }

    @Override
    public String V() {
        return lIlIlIlI[lIlIllII[55]];
    }

    private static boolean lIIIllllIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIllllIll(int n2) {
        return n2 == 0;
    }

    private static void lIIIlllIllI() {
        lIlIllII = new int[89];
        E.lIlIllII[0] = (0xD7 ^ 0xB6) & ~(0xF ^ 0x6E);
        E.lIlIllII[1] = 1;
        E.lIlIllII[2] = 0x31 ^ 0x62 ^ (0x43 ^ 0x56);
        E.lIlIllII[3] = 2;
        E.lIlIllII[4] = -(0xFFFFC9AF & 0x3ED5) & (0xFFFFC9FF & 0x3FFF);
        E.lIlIllII[5] = 3;
        E.lIlIllII[6] = 0x51 ^ 0x55;
        E.lIlIllII[7] = 0x82 ^ 0x87;
        E.lIlIllII[8] = -(0xFFFFF6F5 & 0x295F) & (0xFFFFB7DE & 0x7BFD);
        E.lIlIllII[9] = 0x48 ^ 0x4E;
        E.lIlIllII[10] = 0xFFFFBFDE & 0x6EEB;
        E.lIlIllII[11] = -(0xFFFFECF6 & 0x539F) & (0xFFFFFFDF & 0x5FFD);
        E.lIlIllII[12] = 0xFFFFB373 & 0x7DDD;
        E.lIlIllII[13] = -(0xFFFFF3B9 & 0x6CFF) & (0xFFFFFFFF & Short.MAX_VALUE);
        E.lIlIllII[14] = -(0xFFFFDF77 & 0x2CCF) & (0xFFFFBFFE & 0x4FFF);
        E.lIlIllII[15] = 0xA8 ^ 0x8F ^ (0x2B ^ 6);
        E.lIlIllII[16] = 0xFFFFDF6F & 0x3FD9;
        E.lIlIllII[17] = 0x71 ^ 0x64 ^ (0xC ^ 0x1E);
        E.lIlIllII[18] = 0x51 ^ 0x59;
        E.lIlIllII[19] = 0x4F ^ 0x46;
        E.lIlIllII[20] = 32 + 126 - 46 + 20 ^ 25 + 136 - 69 + 51;
        E.lIlIllII[21] = 0x8A ^ 0x86;
        E.lIlIllII[22] = 0x59 ^ 0x54;
        E.lIlIllII[23] = 0x95 ^ 0x9B;
        E.lIlIllII[24] = 0x4A ^ 0x74 ^ (0x90 ^ 0xA1);
        E.lIlIllII[25] = 167 + 139 - 267 + 174 ^ 58 + 32 - 12 + 119;
        E.lIlIllII[26] = 0x12 ^ 3;
        E.lIlIllII[27] = 0x85 ^ 0x97;
        E.lIlIllII[28] = 98 + 42 - 16 + 28 ^ 30 + 11 - -90 + 8;
        E.lIlIllII[29] = 0x96 ^ 0x82;
        E.lIlIllII[30] = 0x3E ^ 0x2B;
        E.lIlIllII[31] = 60 + 133 - 110 + 53 ^ 74 + 71 - 46 + 59;
        E.lIlIllII[32] = 24 + 43 - -16 + 126 ^ 189 + 24 - 194 + 179;
        E.lIlIllII[33] = 0x12 ^ 0xA;
        E.lIlIllII[34] = 0x7F ^ 0x66;
        E.lIlIllII[35] = (0x91 ^ 0x9C) & ~(0xC8 ^ 0xC5) ^ (0xC ^ 0x16);
        E.lIlIllII[36] = 0xB3 ^ 0xA8;
        E.lIlIllII[37] = 0x6A ^ 0x5E ^ (0xBF ^ 0x97);
        E.lIlIllII[38] = -(0xFFFFA5DD & 0x5F76) & (0xFFFFDFFB & 0x7F77);
        E.lIlIllII[39] = 89 + 133 - 93 + 23 + (0x26 ^ 0x69) - (0x1D ^ 0x50) + (0xFD ^ 0xAB);
        E.lIlIllII[40] = 0x60 ^ 0x4F ^ (0x22 ^ 0x10);
        E.lIlIllII[41] = 114 + 11 - 48 + 85 ^ 12 + 90 - 55 + 141;
        E.lIlIllII[42] = 0xE ^ 0x4B ^ (0xFC ^ 0xA6);
        E.lIlIllII[43] = 27 + 41 - -2 + 64 ^ 21 + 15 - 16 + 146;
        E.lIlIllII[44] = 0x15 ^ 0x34;
        E.lIlIllII[45] = 0x84 ^ 0x80 ^ (0xB5 ^ 0x93);
        E.lIlIllII[46] = 0xFFFFBEFE & 0x7F1D;
        E.lIlIllII[47] = 0xFFFFF73F & 0x1FCC;
        E.lIlIllII[48] = 0x36 ^ 1;
        E.lIlIllII[49] = 0xFFFFF3F5 & 0xDFE;
        E.lIlIllII[50] = 0xFFFFAFCD & 0x7EFE;
        E.lIlIllII[51] = -(0xFFFF9854 & 0x77AF) & (0xFFFFF9FB & 0x77AF);
        E.lIlIllII[52] = -(0xFFFFBA9F & 0x65E3) & (0xFFFFEFEF & 0x37FE);
        E.lIlIllII[53] = 0x24 ^ 0x51 ^ (0x2A ^ 0x77);
        E.lIlIllII[54] = 0xF ^ 0x6B;
        E.lIlIllII[55] = 0xA7 ^ 0x84;
        E.lIlIllII[56] = 0x38 ^ 0x1C;
        E.lIlIllII[57] = 0xC5 ^ 0x9C ^ (0xCF ^ 0xB3);
        E.lIlIllII[58] = 4 + 37 - -48 + 96 ^ 42 + 53 - 83 + 147;
        E.lIlIllII[59] = 0xC9 ^ 0x95 ^ (0xCC ^ 0xB7);
        E.lIlIllII[60] = 89 + 66 - 124 + 152 ^ 97 + 69 - 51 + 43;
        E.lIlIllII[61] = 0x68 ^ 0x42;
        E.lIlIllII[62] = 0xEE ^ 0xC5;
        E.lIlIllII[63] = 0xEE ^ 0xC2;
        E.lIlIllII[64] = 0x52 ^ 0x7F;
        E.lIlIllII[65] = 0x33 ^ 0x46 ^ (0x78 ^ 0x23);
        E.lIlIllII[66] = 0x6C ^ 0x43;
        E.lIlIllII[67] = 0x1F ^ 0x5E ^ (0xEB ^ 0x9A);
        E.lIlIllII[68] = 0x61 ^ 0x50;
        E.lIlIllII[69] = 0x14 ^ 0x26;
        E.lIlIllII[70] = 0x31 ^ 2;
        E.lIlIllII[71] = 155 + 48 - 188 + 165 ^ 94 + 66 - 133 + 101;
        E.lIlIllII[72] = 0x6E ^ 0x5B;
        E.lIlIllII[73] = 0x74 ^ 0x42;
        E.lIlIllII[74] = 0x76 ^ 0x6A ^ (6 ^ 0x22);
        E.lIlIllII[75] = 99 + 128 - 103 + 12 ^ 40 + 57 - -8 + 72;
        E.lIlIllII[76] = -(0xFFFFB3C5 & 0x4F7B) & (0xFFFFBFDD & 0x4FFF);
        E.lIlIllII[77] = 0xFFFFFCEE & 0xFB9;
        E.lIlIllII[78] = -(0xFFFF9AD9 & 0x7767) & (0xFFFFDFFF & 0x3EDE);
        E.lIlIllII[79] = -(0xFFFFFB7B & 0x77E5) & (0xFFFFFFEB & 0x7FFD);
        E.lIlIllII[80] = -(0xFFFF9B4F & 0x76F9) & (0xFFFFBFFB & 0x5ECF);
        E.lIlIllII[81] = 0xFFFFEEFF & 0x1D8C;
        E.lIlIllII[82] = -(0xFFFFBBF9 & 0x75DF) & (0xFFFFFDFD & 0x3FFF);
        E.lIlIllII[83] = -(0xFFFFAA74 & 0x77AF) & (0xFFFFBFE7 & 0x6EFB);
        E.lIlIllII[84] = -(0xFFFFF279 & 0x3F87) & (0xFFFFFEA6 & 0x3F5F);
        E.lIlIllII[85] = -(0xFFFFFFD9 & 0x6367) & (0xFFFFEFFB & Short.MAX_VALUE);
        E.lIlIllII[86] = 0xFFFFAFEE & 0x5BFF;
        E.lIlIllII[87] = -(0xFFFFF247 & 0x7FF9) & (0xFFFFFFFF & 0x7EEE);
        E.lIlIllII[88] = 0x76 ^ 0x4C;
    }
}

