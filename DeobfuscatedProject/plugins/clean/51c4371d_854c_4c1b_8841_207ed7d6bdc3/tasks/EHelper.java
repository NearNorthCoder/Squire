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
package gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks;

import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.F;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.QHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.AHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.BHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.DHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.EHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.FHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.GHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.IHelper;
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

public class EHelper
implements F {
    private static final  WorldPoint is;
    private static final  WorldPoint io;
    static  int bZ;
    public static  long g;
    public static final  String[] in;
    static  boolean cj;
    private static final  WorldPoint ip;
    public static  List<d> bB;
    
    public static  boolean bz;
    
    private static final  WorldPoint iq;
    private static final  WorldPoint ir;
    static  int ci;
    private static final  WorldPoint it;

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
            d d2 = new DHelper(lIlIllII[10], lIlIllII[1], lIlIllII[46]);
            bB.add(d2);

        }
        int[] nArray2 = new int[lIlIllII[1]];
        nArray2[E.lIlIllII[0]] = lIlIllII[14];
        if (E.lIIIllllIll(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lIllllIIIIIIIlI = new DHelper(lIlIllII[14], lIlIllII[1], lIlIllII[47]);
            bB.add((DHelper) IllllIIIIIIIlI);

        }
        int[] nArray3 = new int[lIlIllII[1]];
        nArray3[E.lIlIllII[0]] = lIlIllII[4];
        if (E.lIIIllllIll(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lIllllIIIIIIIlI = new DHelper(lIlIllII[4], lIlIllII[48], lIlIllII[49]);
            bB.add((DHelper) IllllIIIIIIIlI);

        }
        if (E.lIIIllllIll(Bank.contains((Predicate)(lIllllIIIIIIIlI = item -> item.getName().toLowerCase().contains(lIlIlIlI[lIlIllII[56]]))) ? 1 : 0)) {
            lIllllIIIIIIIIl = new DHelper(lIlIllII[50], lIlIllII[7], lIlIllII[51]);
            bB.add(lIllllIIIIIIIIl);

        }
        int[] nArray4 = new int[lIlIllII[1]];
        nArray4[E.lIlIllII[0]] = lIlIllII[11];
        if (E.lIIIllllIll(Bank.contains((int[])nArray4) ? 1 : 0)) {
            lIllllIIIIIIIIl = new DHelper(lIlIllII[11], lIlIllII[15], lIlIllII[52]);
            bB.add(lIllllIIIIIIIIl);

        }
        int[] nArray5 = new int[lIlIllII[1]];
        nArray5[E.lIlIllII[0]] = lIlIllII[16];
        if (E.lIIIllllIll(Bank.contains((int[])nArray5) ? 1 : 0)) {
            lIllllIIIIIIIIl = new DHelper(lIlIllII[16], lIlIllII[15], lIlIllII[52]);
            bB.add(lIllllIIIIIIIIl);

        }
        int[] nArray6 = new int[lIlIllII[1]];
        nArray6[E.lIlIllII[0]] = lIlIllII[13];
        if (E.lIIIllllIll(Bank.contains((int[])nArray6) ? 1 : 0)) {
            lIllllIIIIIIIIl = new DHelper(lIlIllII[13], lIlIllII[53], lIlIllII[52]);
            bB.add(lIllllIIIIIIIIl);

        }
        int[] nArray7 = new int[lIlIllII[1]];
        nArray7[E.lIlIllII[0]] = lIlIllII[12];
        if (E.lIIIllllIll(Bank.contains((int[])nArray7) ? 1 : 0)) {
            lIllllIIIIIIIIl = new DHelper(lIlIllII[12], lIlIllII[7], i.bw);
            bB.add(lIllllIIIIIIIIl);

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
        E.lIlIlIlI[E.lIlIllII[0]] = "Buying items";
        E.lIlIlIlI[E.lIlIllII[1]] = "Finished buying items, switching back to quest";
        E.lIlIlIlI[E.lIlIllII[3]] = "Drink";
        E.lIlIlIlI[E.lIlIllII[5]] = "Eat";
        E.lIlIlIlI[E.lIlIllII[6]] = "Nav to bank";
        E.lIlIlIlI[E.lIlIllII[7]] = "Handling banking";
        E.lIlIlIlI[E.lIlIllII[9]] = "We are missing quest supplies, switching to BUYING";
        E.lIlIlIlI[E.lIlIllII[17]] = "Nav to start";
        E.lIlIlIlI[E.lIlIllII[18]] = "Interact npc";
        E.lIlIlIlI[E.lIlIllII[19]] = "Drop";
        E.lIlIlIlI[E.lIlIllII[15]] = "Veos";
        E.lIlIlIlI[E.lIlIllII[20]] = "Treasure scroll";
        E.lIlIlIlI[E.lIlIllII[21]] = "Wear";
        E.lIlIlIlI[E.lIlIllII[22]] = "Wear";
        E.lIlIlIlI[E.lIlIllII[23]] = "Nav to dig 1";
        E.lIlIlIlI[E.lIlIllII[24]] = "Spade";
        E.lIlIlIlI[E.lIlIllII[25]] = "Dig";
        E.lIlIlIlI[E.lIlIllII[26]] = "Nav to dig 2";
        E.lIlIlIlI[E.lIlIllII[27]] = "Spade";
        E.lIlIlIlI[E.lIlIllII[28]] = "Dig";
        E.lIlIlIlI[E.lIlIllII[29]] = "Nav to dig 3";
        E.lIlIlIlI[E.lIlIllII[30]] = "Spade";
        E.lIlIlIlI[E.lIlIllII[31]] = "Dig";
        E.lIlIlIlI[E.lIlIllII[32]] = "Nav to dig 4";
        E.lIlIlIlI[E.lIlIllII[33]] = "Spade";
        E.lIlIlIlI[E.lIlIllII[34]] = "Dig";
        E.lIlIlIlI[E.lIlIllII[35]] = "Nav to veos finish";
        E.lIlIlIlI[E.lIlIllII[36]] = "Interact npc";
        E.lIlIlIlI[E.lIlIllII[37]] = "Veos";
        E.lIlIlIlI[E.lIlIllII[40]] = "Rubbing lamp";
        E.lIlIlIlI[E.lIlIllII[41]] = "Rub";
        E.lIlIlIlI[E.lIlIllII[42]] = "Selecting slayer";
        E.lIlIlIlI[E.lIlIllII[43]] = "Slayer";
        E.lIlIlIlI[E.lIlIllII[44]] = "Confirm";
        E.lIlIlIlI[E.lIlIllII[45]] = "Spade";
        E.lIlIlIlI[E.lIlIllII[55]] = "X marks the spot quest";
        E.lIlIlIlI[E.lIlIllII[56]] = "ring of wealth (";
        E.lIlIlIlI[E.lIlIllII[57]] = "wealth";
        E.lIlIlIlI[E.lIlIllII[58]] = "wealth";
        E.lIlIlIlI[E.lIlIllII[59]] = "wealth";
        E.lIlIlIlI[E.lIlIllII[53]] = "glory";
        E.lIlIlIlI[E.lIlIllII[60]] = "glory";
        E.lIlIlIlI[E.lIlIllII[61]] = "glory";
        E.lIlIlIlI[E.lIlIllII[62]] = "Ok, I'm up for an adventure.";
        E.lIlIlIlI[E.lIlIllII[63]] = "A glass of your finest ale please.";
        E.lIlIlIlI[E.lIlIllII[64]] = "Morgan needs your help!";
        E.lIlIlIlI[E.lIlIllII[65]] = "Yes.";
        E.lIlIlIlI[E.lIlIllII[66]] = "I'm looking for a quest!";
        E.lIlIlIlI[E.lIlIllII[67]] = "Ok, let me help then.";
        E.lIlIlIlI[E.lIlIllII[68]] = "Father Aereck sent me to talk to you.";
        E.lIlIlIlI[E.lIlIllII[69]] = "He's got a ghost haunting his graveyard.";
        E.lIlIlIlI[E.lIlIllII[70]] = "Yep, now tell me what the problem is.";
        E.lIlIlIlI[E.lIlIllII[71]] = "Sure.";
        E.lIlIlIlI[E.lIlIllII[72]] = "I'm wearing an amulet of ghost speak!";
        E.lIlIlIlI[E.lIlIllII[73]] = "Yes, I'm sure.";
        E.lIlIlIlI[E.lIlIllII[48]] = "How can I help?";
        E.lIlIlIlI[E.lIlIllII[74]] = "I'm looking for a quest.";
        E.lIlIlIlI[E.lIlIllII[75]] = "Can I help?";
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

                    }
                    if (E.lIIIllllllI(lIllllIIIIIIllI) && E.lIIIllllIIl(lIllllIIIIIIllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderBarrows.c = lIlIlIlI[lIlIllII[7]];
                        if (E.lIIIllllIll(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)lIlIllII[8]);

                        }
                        if (E.lIIIllllIIl(Bank.isOpen() ? 1 : 0)) {
                            if (E.lIIIlllllIl(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lIlIllII[6]);

                            }
                            if (E.lIIIlllllIl(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)lIlIllII[3]);

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

                                Bank.withdraw((int)lIlIllII[14], (int)lIlIllII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)lIlIllII[1]);

                                Bank.withdraw((int)lIlIllII[16], (int)lIlIllII[15], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)lIlIllII[1]);

                                Bank.withdraw((int)lIlIllII[13], (int)lIlIllII[7], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)lIlIllII[1]);

                                Bank.withdraw((int)lIlIllII[10], (int)lIlIllII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)lIlIllII[1]);

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

                        Time.sleepTicks((int)lIlIllII[1]);

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

                        Time.sleepTicks((int)lIlIllII[1]);

                    }
                    if (E.lIIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)ip) ? 1 : 0)) {
                        String[] stringArray = new String[lIlIllII[1]];
                        stringArray[E.lIlIllII[0]] = lIlIlIlI[lIlIllII[24]];
                        Inventory.getFirst((String[])stringArray).interact(lIlIlIlI[lIlIllII[25]]);
                        Time.sleepTicks((int)lIlIllII[3]);

                    }
                }
                if (E.lIIlIIIIIIl(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIlIllII[5])) {
                    if (E.lIIIllllIll(Players.getLocal().getWorldLocation().equals((Object)iq) ? 1 : 0)) {
                        AccBuilderBarrows.c = lIlIlIlI[lIlIllII[26]];
                        Movement.walkTo((WorldPoint)iq);

                        Time.sleepTicks((int)lIlIllII[1]);

                    }
                    if (E.lIIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)iq) ? 1 : 0)) {
                        String[] stringArray = new String[lIlIllII[1]];
                        stringArray[E.lIlIllII[0]] = lIlIlIlI[lIlIllII[27]];
                        Inventory.getFirst((String[])stringArray).interact(lIlIlIlI[lIlIllII[28]]);
                        Time.sleepTicks((int)lIlIllII[3]);

                    }
                }
                if (E.lIIlIIIIIIl(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIlIllII[6])) {
                    if (E.lIIIllllIll(Players.getLocal().getWorldLocation().equals((Object)ir) ? 1 : 0)) {
                        AccBuilderBarrows.c = lIlIlIlI[lIlIllII[29]];
                        Movement.walkTo((WorldPoint)ir);

                        Time.sleepTicks((int)lIlIllII[1]);

                    }
                    if (E.lIIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)ir) ? 1 : 0)) {
                        String[] stringArray = new String[lIlIllII[1]];
                        stringArray[E.lIlIllII[0]] = lIlIlIlI[lIlIllII[30]];
                        Inventory.getFirst((String[])stringArray).interact(lIlIlIlI[lIlIllII[31]]);
                        Time.sleepTicks((int)lIlIllII[3]);

                    }
                }
                if (E.lIIlIIIIIIl(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIlIllII[7])) {
                    if (E.lIIIllllIll(Players.getLocal().getWorldLocation().equals((Object)is) ? 1 : 0)) {
                        AccBuilderBarrows.c = lIlIlIlI[lIlIllII[32]];
                        Movement.walkTo((WorldPoint)is);

                        Time.sleepTicks((int)lIlIllII[1]);

                    }
                    if (E.lIIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)is) ? 1 : 0)) {
                        String[] stringArray = new String[lIlIllII[1]];
                        stringArray[E.lIlIllII[0]] = lIlIlIlI[lIlIllII[33]];
                        Inventory.getFirst((String[])stringArray).interact(lIlIlIlI[lIlIllII[34]]);
                        Time.sleepTicks((int)lIlIllII[3]);

                    }
                }
                if (E.lIIlIIIIIIl(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIlIllII[9])) {
                    if (E.lIIIlllllll(Players.getLocal().getWorldLocation().distanceTo(it), lIlIllII[5])) {
                        AccBuilderBarrows.c = lIlIlIlI[lIlIllII[35]];
                        Movement.walkTo((WorldPoint)it);

                        Time.sleepTicks((int)lIlIllII[1]);

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

                        AccBuilderBarrows.c = lIlIlIlI[lIlIllII[42]];
                        lIllllIIIIIIllI = Widgets.get((int)lIlIllII[39], (int)lIlIllII[23]);
                        if (E.lIIIllllllI(lIllllIIIIIIllI)) {
                            lIllllIIIIIIllI.interact(lIlIlIlI[lIlIllII[43]]);
                            Time.sleepTicks((int)lIlIllII[1]);

                        }
                        if (E.lIIIllllllI(lIllllIIIIIIlIl = Widgets.get((int)lIlIllII[39], (int)lIlIllII[35]))) {
                            lIllllIIIIIIlIl.interact(lIlIlIlI[lIlIllII[44]]);
                            Time.sleepTicks((int)lIlIllII[3]);

                        }
                    }
                    Time.sleepTicks((int)lIlIllII[1]);

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

        }
        catch (Exception exception) {
            // empty catch block
        }
        
        return lIlIllII[54];
    }

        return String.valueOf(lIlllIlllllIIlI);
    }

    private static boolean lIIIlllllll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIlIIIIIII(int n2, int n3) {
        return n2 <= n3;
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

}

