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
package gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks;

import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.AHelper;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ab;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.ASHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.BHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.DHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.EHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.FHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.GHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.JHelper;
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

public class AAHelper
implements ab {
    static  boolean dl;
    private static final  WorldPoint lV;
    public static final  String[] lR;
    public static  List<d> bx;
    static  int cI;
    static  int dk;
    
    private static final  WorldPoint lT;
    private static final  WorldPoint lW;
    private static final  WorldPoint lS;
    public static  long g;
    private static final  WorldPoint lX;
    public static  boolean bv;
    
    private static final  WorldPoint lU;

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
        aa.llIlllllI[aa.lllIIIIII[0]] = "Buying items";
        aa.llIlllllI[aa.lllIIIIII[1]] = "Finished buying items, switching back to quest";
        aa.llIlllllI[aa.lllIIIIII[3]] = "Drink";
        aa.llIlllllI[aa.lllIIIIII[5]] = "Eat";
        aa.llIlllllI[aa.lllIIIIII[6]] = "Nav to bank";
        aa.llIlllllI[aa.lllIIIIII[7]] = "Handling banking";
        aa.llIlllllI[aa.lllIIIIII[9]] = "We are missing quest supplies, switching to BUYING";
        aa.llIlllllI[aa.lllIIIIII[17]] = "Nav to start";
        aa.llIlllllI[aa.lllIIIIII[18]] = "Interact npc";
        aa.llIlllllI[aa.lllIIIIII[19]] = "Drop";
        aa.llIlllllI[aa.lllIIIIII[15]] = "Veos";
        aa.llIlllllI[aa.lllIIIIII[20]] = "Treasure scroll";
        aa.llIlllllI[aa.lllIIIIII[21]] = "Wear";
        aa.llIlllllI[aa.lllIIIIII[22]] = "Wear";
        aa.llIlllllI[aa.lllIIIIII[23]] = "Nav to dig 1";
        aa.llIlllllI[aa.lllIIIIII[24]] = "Spade";
        aa.llIlllllI[aa.lllIIIIII[25]] = "Dig";
        aa.llIlllllI[aa.lllIIIIII[26]] = "Nav to dig 2";
        aa.llIlllllI[aa.lllIIIIII[27]] = "Spade";
        aa.llIlllllI[aa.lllIIIIII[28]] = "Dig";
        aa.llIlllllI[aa.lllIIIIII[29]] = "Nav to dig 3";
        aa.llIlllllI[aa.lllIIIIII[30]] = "Spade";
        aa.llIlllllI[aa.lllIIIIII[31]] = "Dig";
        aa.llIlllllI[aa.lllIIIIII[32]] = "Nav to dig 4";
        aa.llIlllllI[aa.lllIIIIII[33]] = "Spade";
        aa.llIlllllI[aa.lllIIIIII[34]] = "Dig";
        aa.llIlllllI[aa.lllIIIIII[35]] = "Nav to veos finish";
        aa.llIlllllI[aa.lllIIIIII[36]] = "Interact npc";
        aa.llIlllllI[aa.lllIIIIII[37]] = "Veos";
        aa.llIlllllI[aa.lllIIIIII[40]] = "Rubbing lamp";
        aa.llIlllllI[aa.lllIIIIII[41]] = "Rub";
        aa.llIlllllI[aa.lllIIIIII[42]] = "Selecting slayer";
        aa.llIlllllI[aa.lllIIIIII[43]] = "Slayer";
        aa.llIlllllI[aa.lllIIIIII[44]] = "Confirm";
        aa.llIlllllI[aa.lllIIIIII[45]] = "Spade";
        aa.llIlllllI[aa.lllIIIIII[55]] = "X marks the spot quest";
        aa.llIlllllI[aa.lllIIIIII[56]] = "ring of wealth (";
        aa.llIlllllI[aa.lllIIIIII[57]] = "wealth";
        aa.llIlllllI[aa.lllIIIIII[58]] = "wealth";
        aa.llIlllllI[aa.lllIIIIII[59]] = "wealth";
        aa.llIlllllI[aa.lllIIIIII[53]] = "glory";
        aa.llIlllllI[aa.lllIIIIII[60]] = "glory";
        aa.llIlllllI[aa.lllIIIIII[61]] = "glory";
        aa.llIlllllI[aa.lllIIIIII[62]] = "Ok, I'm up for an adventure.";
        aa.llIlllllI[aa.lllIIIIII[63]] = "A glass of your finest ale please.";
        aa.llIlllllI[aa.lllIIIIII[64]] = "Morgan needs your help!";
        aa.llIlllllI[aa.lllIIIIII[65]] = "Yes.";
        aa.llIlllllI[aa.lllIIIIII[66]] = "I'm looking for a quest!";
        aa.llIlllllI[aa.lllIIIIII[67]] = "Ok, let me help then.";
        aa.llIlllllI[aa.lllIIIIII[68]] = "Father Aereck sent me to talk to you.";
        aa.llIlllllI[aa.lllIIIIII[69]] = "He's got a ghost haunting his graveyard.";
        aa.llIlllllI[aa.lllIIIIII[70]] = "Yep, now tell me what the problem is.";
        aa.llIlllllI[aa.lllIIIIII[71]] = "Sure.";
        aa.llIlllllI[aa.lllIIIIII[72]] = "I'm wearing an amulet of ghost speak!";
        aa.llIlllllI[aa.lllIIIIII[73]] = "Yes, I'm sure.";
        aa.llIlllllI[aa.lllIIIIII[48]] = "How can I help?";
        aa.llIlllllI[aa.lllIIIIII[74]] = "I'm looking for a quest.";
        aa.llIlllllI[aa.lllIIIIII[75]] = "Can I help?";
    }

    private static boolean lIlllllIlllI(Object object) {
        return object != null;
    }

    private static boolean lIllllllIIII(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public int af() {
        try {
            aa.dQ();

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

                    }
                    if (aa.lIlllllIlllI(llllllIlllIll) && aa.lIlllllIlIIl(llllllIlllIll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderGWD.c = llIlllllI[lllIIIIII[7]];
                        if (aa.lIlllllIlIll(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)lllIIIIII[8]);

                        }
                        if (aa.lIlllllIlIIl(Bank.isOpen() ? 1 : 0)) {
                            if (aa.lIlllllIllIl(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lllIIIIII[6]);

                            }
                            if (aa.lIlllllIllIl(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)lllIIIIII[3]);

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

                                Bank.withdraw((int)lllIIIIII[14], (int)lllIIIIII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)lllIIIIII[1]);

                                Bank.withdraw((int)lllIIIIII[16], (int)lllIIIIII[15], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)lllIIIIII[1]);

                                Bank.withdraw((int)lllIIIIII[13], (int)lllIIIIII[7], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)lllIIIIII[1]);

                                Bank.withdraw((int)lllIIIIII[10], (int)lllIIIIII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)lllIIIIII[1]);

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

                        Time.sleepTicks((int)lllIIIIII[1]);

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

                        Time.sleepTicks((int)lllIIIIII[1]);

                    }
                    if (aa.lIlllllIlIIl(Players.getLocal().getWorldLocation().equals((Object)lT) ? 1 : 0)) {
                        String[] stringArray = new String[lllIIIIII[1]];
                        stringArray[aa.lllIIIIII[0]] = llIlllllI[lllIIIIII[24]];
                        Inventory.getFirst((String[])stringArray).interact(llIlllllI[lllIIIIII[25]]);
                        Time.sleepTicks((int)lllIIIIII[3]);

                    }
                }
                if (aa.lIllllllIIIl(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lllIIIIII[5])) {
                    if (aa.lIlllllIlIll(Players.getLocal().getWorldLocation().equals((Object)lU) ? 1 : 0)) {
                        AccBuilderGWD.c = llIlllllI[lllIIIIII[26]];
                        Movement.walkTo((WorldPoint)lU);

                        Time.sleepTicks((int)lllIIIIII[1]);

                    }
                    if (aa.lIlllllIlIIl(Players.getLocal().getWorldLocation().equals((Object)lU) ? 1 : 0)) {
                        String[] stringArray = new String[lllIIIIII[1]];
                        stringArray[aa.lllIIIIII[0]] = llIlllllI[lllIIIIII[27]];
                        Inventory.getFirst((String[])stringArray).interact(llIlllllI[lllIIIIII[28]]);
                        Time.sleepTicks((int)lllIIIIII[3]);

                    }
                }
                if (aa.lIllllllIIIl(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lllIIIIII[6])) {
                    if (aa.lIlllllIlIll(Players.getLocal().getWorldLocation().equals((Object)lV) ? 1 : 0)) {
                        AccBuilderGWD.c = llIlllllI[lllIIIIII[29]];
                        Movement.walkTo((WorldPoint)lV);

                        Time.sleepTicks((int)lllIIIIII[1]);

                    }
                    if (aa.lIlllllIlIIl(Players.getLocal().getWorldLocation().equals((Object)lV) ? 1 : 0)) {
                        String[] stringArray = new String[lllIIIIII[1]];
                        stringArray[aa.lllIIIIII[0]] = llIlllllI[lllIIIIII[30]];
                        Inventory.getFirst((String[])stringArray).interact(llIlllllI[lllIIIIII[31]]);
                        Time.sleepTicks((int)lllIIIIII[3]);

                    }
                }
                if (aa.lIllllllIIIl(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lllIIIIII[7])) {
                    if (aa.lIlllllIlIll(Players.getLocal().getWorldLocation().equals((Object)lW) ? 1 : 0)) {
                        AccBuilderGWD.c = llIlllllI[lllIIIIII[32]];
                        Movement.walkTo((WorldPoint)lW);

                        Time.sleepTicks((int)lllIIIIII[1]);

                    }
                    if (aa.lIlllllIlIIl(Players.getLocal().getWorldLocation().equals((Object)lW) ? 1 : 0)) {
                        String[] stringArray = new String[lllIIIIII[1]];
                        stringArray[aa.lllIIIIII[0]] = llIlllllI[lllIIIIII[33]];
                        Inventory.getFirst((String[])stringArray).interact(llIlllllI[lllIIIIII[34]]);
                        Time.sleepTicks((int)lllIIIIII[3]);

                    }
                }
                if (aa.lIllllllIIIl(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lllIIIIII[9])) {
                    if (aa.lIlllllIllll(Players.getLocal().getWorldLocation().distanceTo(lX), lllIIIIII[5])) {
                        AccBuilderGWD.c = llIlllllI[lllIIIIII[35]];
                        Movement.walkTo((WorldPoint)lX);

                        Time.sleepTicks((int)lllIIIIII[1]);

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

                        AccBuilderGWD.c = llIlllllI[lllIIIIII[42]];
                        llllllIlllIll = Widgets.get((int)lllIIIIII[39], (int)lllIIIIII[23]);
                        if (aa.lIlllllIlllI(llllllIlllIll)) {
                            llllllIlllIll.interact(llIlllllI[lllIIIIII[43]]);
                            Time.sleepTicks((int)lllIIIIII[1]);

                        }
                        if (aa.lIlllllIlllI(llllllIlllIlI = Widgets.get((int)lllIIIIII[39], (int)lllIIIIII[35]))) {
                            llllllIlllIlI.interact(llIlllllI[lllIIIIII[44]]);
                            Time.sleepTicks((int)lllIIIIII[3]);

                        }
                    }
                    Time.sleepTicks((int)lllIIIIII[1]);

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
            d d2 = new DHelper(lllIIIIII[10], lllIIIIII[1], lllIIIIII[46]);
            bx.add(d2);

        }
        int[] nArray2 = new int[lllIIIIII[1]];
        nArray2[aa.lllIIIIII[0]] = lllIIIIII[14];
        if (aa.lIlllllIlIll(Bank.contains((int[])nArray2) ? 1 : 0)) {
            llllllIllIlll = new DHelper(lllIIIIII[14], lllIIIIII[1], lllIIIIII[47]);
            bx.add((DHelper) lllllIllIlll);

        }
        int[] nArray3 = new int[lllIIIIII[1]];
        nArray3[aa.lllIIIIII[0]] = lllIIIIII[4];
        if (aa.lIlllllIlIll(Bank.contains((int[])nArray3) ? 1 : 0)) {
            llllllIllIlll = new DHelper(lllIIIIII[4], lllIIIIII[48], lllIIIIII[49]);
            bx.add((DHelper) lllllIllIlll);

        }
        if (aa.lIlllllIlIll(Bank.contains((Predicate)(llllllIllIlll = item -> item.getName().toLowerCase().contains(llIlllllI[lllIIIIII[56]]))) ? 1 : 0)) {
            llllllIllIllI = new DHelper(lllIIIIII[50], lllIIIIII[7], lllIIIIII[51]);
            bx.add(llllllIllIllI);

        }
        int[] nArray4 = new int[lllIIIIII[1]];
        nArray4[aa.lllIIIIII[0]] = lllIIIIII[11];
        if (aa.lIlllllIlIll(Bank.contains((int[])nArray4) ? 1 : 0)) {
            llllllIllIllI = new DHelper(lllIIIIII[11], lllIIIIII[15], lllIIIIII[52]);
            bx.add(llllllIllIllI);

        }
        int[] nArray5 = new int[lllIIIIII[1]];
        nArray5[aa.lllIIIIII[0]] = lllIIIIII[16];
        if (aa.lIlllllIlIll(Bank.contains((int[])nArray5) ? 1 : 0)) {
            llllllIllIllI = new DHelper(lllIIIIII[16], lllIIIIII[15], lllIIIIII[52]);
            bx.add(llllllIllIllI);

        }
        int[] nArray6 = new int[lllIIIIII[1]];
        nArray6[aa.lllIIIIII[0]] = lllIIIIII[13];
        if (aa.lIlllllIlIll(Bank.contains((int[])nArray6) ? 1 : 0)) {
            llllllIllIllI = new DHelper(lllIIIIII[13], lllIIIIII[53], lllIIIIII[52]);
            bx.add(llllllIllIllI);

        }
        int[] nArray7 = new int[lllIIIIII[1]];
        nArray7[aa.lllIIIIII[0]] = lllIIIIII[12];
        if (aa.lIlllllIlIll(Bank.contains((int[])nArray7) ? 1 : 0)) {
            llllllIllIllI = new DHelper(lllIIIIII[12], lllIIIIII[7], j.ch);
            bx.add(llllllIllIllI);

        }
    }

    private static boolean lIlllllIllIl(int n2) {
        return n2 > 0;
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

