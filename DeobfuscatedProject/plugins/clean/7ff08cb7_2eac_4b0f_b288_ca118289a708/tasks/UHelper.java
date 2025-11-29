/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.quests.QuestVarbits
 *  net.unethicalite.api.widgets.Dialog
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
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.widgets.Dialog;

public class UHelper
implements ab {
    public static  List<d> bx;
    public static  WorldPoint dg;
    public static  WorldPoint dj;
    public static  WorldPoint dh;

    public static  boolean bv;
    static  boolean dl;
    static  int dk;
    public static  WorldPoint di;
    private static  WorldPoint dm;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        block4: {
            block5: {
                int[] nArray = new int[llIIlIlIl[0]];
                nArray[u.llIIlIlIl[1]] = llIIlIlIl[6];
                if (!u.lIlIlIllIlIl(Inventory.getCount((int[])nArray))) break block4;
                int[] nArray2 = new int[llIIlIlIl[0]];
                nArray2[u.llIIlIlIl[1]] = llIIlIlIl[8];
                if (!u.lIlIlIllIlIl(Inventory.getCount((int[])nArray2))) break block4;
                int[] nArray3 = new int[llIIlIlIl[0]];
                nArray3[u.llIIlIlIl[1]] = llIIlIlIl[10];
                if (!u.lIlIlIlllIll(Inventory.getCount((int[])nArray3))) break block5;
                int[] nArray4 = new int[llIIlIlIl[0]];
                nArray4[u.llIIlIlIl[1]] = llIIlIlIl[10];
                if (!u.lIlIlIllIIIl(Equipment.contains((int[])nArray4) ? 1 : 0)) break block4;
            }
            int[] nArray = new int[llIIlIlIl[0]];
            nArray[u.llIIlIlIl[1]] = llIIlIlIl[13];
            if (u.lIlIlIllIlIl(Inventory.getCount((int[])nArray))) {
                n2 = llIIlIlIl[0];

                if (-2 < 0) return n2 != 0;
                return (3 & ~3) != 0;
            }
        }
        n2 = llIIlIlIl[1];
        return n2 != 0;
    }

    private static boolean lIlIlIllIlII(Object object) {
        return object != null;
    }

    static {
        u.lIlIlIlIllll();
        u.lIlIlIIllllI();
        bx = new ArrayList<d>();
        dg = new WorldPoint(llIIlIlIl[88], llIIlIlIl[89], llIIlIlIl[1]);
        dh = new WorldPoint(llIIlIlIl[90], llIIlIlIl[91], llIIlIlIl[1]);
        di = new WorldPoint(llIIlIlIl[92], llIIlIlIl[93], llIIlIlIl[1]);
        dj = new WorldPoint(llIIlIlIl[94], llIIlIlIl[95], llIIlIlIl[1]);
        dm = null;
        String[] stringArray = new String[llIIlIlIl[4]];
        stringArray[u.llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[96]];
        stringArray[u.llIIlIlIl[0]] = llIIlIIlI[llIIlIlIl[97]];
        stringArray[u.llIIlIlIl[3]] = llIIlIIlI[llIIlIlIl[98]];
        stringArray[u.llIIlIlIl[9]] = llIIlIIlI[llIIlIlIl[99]];
        cG = stringArray;
    }

    private static void Q() {
        d lIlIlllllllllI;
        block10: {
            block9: {
                Object lIlIllllllllll;
                int[] nArray = new int[llIIlIlIl[0]];
                nArray[u.llIIlIlIl[1]] = llIIlIlIl[8];
                if (u.lIlIlIllIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                    d d2 = new DHelper(llIIlIlIl[8], llIIlIlIl[0], llIIlIlIl[81]);
                    bx.add(d2);

                }
                int[] nArray2 = new int[llIIlIlIl[0]];
                nArray2[u.llIIlIlIl[1]] = llIIlIlIl[10];
                if (u.lIlIlIllIIll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    lIlIllllllllll = new DHelper(llIIlIlIl[10], llIIlIlIl[0], llIIlIlIl[81]);
                    bx.add((DHelper) IlIllllllllll);

                }
                int[] nArray3 = new int[llIIlIlIl[0]];
                nArray3[u.llIIlIlIl[1]] = llIIlIlIl[13];
                if (u.lIlIlIllIIll(Bank.contains((int[])nArray3) ? 1 : 0)) {
                    lIlIllllllllll = new DHelper(llIIlIlIl[13], llIIlIlIl[50], llIIlIlIl[82]);
                    bx.add((DHelper) IlIllllllllll);

                }
                int[] nArray4 = new int[llIIlIlIl[0]];
                nArray4[u.llIIlIlIl[1]] = llIIlIlIl[11];
                if (u.lIlIlIllIIll(Bank.contains((int[])nArray4) ? 1 : 0)) {
                    lIlIllllllllll = new DHelper(llIIlIlIl[11], llIIlIlIl[12], j.ch);
                    bx.add((DHelper) IlIllllllllll);

                }
                if (u.lIlIlIllIIll(Bank.contains((Predicate)(lIlIllllllllll = item -> item.getName().toLowerCase().contains(llIIlIIlI[llIIlIlIl[87]]))) ? 1 : 0)) {
                    lIlIlllllllllI = new DHelper(llIIlIlIl[83], llIIlIlIl[12], llIIlIlIl[84]);
                    bx.add(lIlIlllllllllI);

                }
                int[] nArray5 = new int[llIIlIlIl[0]];
                nArray5[u.llIIlIlIl[1]] = llIIlIlIl[7];
                if (!u.lIlIlIllIIIl(Bank.contains((int[])nArray5) ? 1 : 0)) break block9;
                int[] nArray6 = new int[llIIlIlIl[0]];
                nArray6[u.llIIlIlIl[1]] = llIIlIlIl[7];
                if (!u.lIlIlIllIIIl(Bank.contains((int[])nArray6) ? 1 : 0)) break block10;
                int[] nArray7 = new int[llIIlIlIl[0]];
                nArray7[u.llIIlIlIl[1]] = llIIlIlIl[7];
                if (!u.lIlIlIllIIlI(Bank.getFirst((int[])nArray7).getQuantity(), llIIlIlIl[12])) break block10;
            }
            lIlIlllllllllI = new DHelper(llIIlIlIl[7], llIIlIlIl[28], llIIlIlIl[82]);
            bx.add(lIlIlllllllllI);

        }
        int[] nArray = new int[llIIlIlIl[0]];
        nArray[u.llIIlIlIl[1]] = llIIlIlIl[6];
        if (u.lIlIlIllIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
            lIlIlllllllllI = new DHelper(llIIlIlIl[6], llIIlIlIl[57], llIIlIlIl[82]);
            bx.add(lIlIlllllllllI);

        }
    }

    private static boolean lIlIlIllllII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIlIllIllI(int n2, int n3) {
        return n2 > n3;
    }

    public static void aX() {
        block63: {
            block64: {
                block65: {
                    if (u.lIlIlIllIIIl(bv ? 1 : 0)) {
                        b.a(bx);
                        if (u.lIlIlIllIIlI(bx.size(), llIIlIlIl[0])) {
                            System.out.println(llIIlIIlI[llIIlIlIl[1]]);
                            bv = llIIlIlIl[1];
                        }
                    }
                    if (!u.lIlIlIllIIll(bv ? 1 : 0)) break block63;
                    if (u.lIlIlIllIIll(u.an() ? 1 : 0) && u.lIlIlIllIIll(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()))) {
                        BankLocation lIllIIIIIIIIlI = BankLocation.getNearest();
                        if (u.lIlIlIllIlII(lIllIIIIIIIIlI) && u.lIlIlIllIIll(lIllIIIIIIIIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderGWD.c = llIIlIIlI[llIIlIlIl[0]];
                            a.a(lIllIIIIIIIIlI);
                        }
                        if (u.lIlIlIllIlII(lIllIIIIIIIIlI) && u.lIlIlIllIIIl(lIllIIIIIIIIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            if (u.lIlIlIllIIll(Bank.isOpen() ? 1 : 0)) {
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)llIIlIlIl[2]);

                            }
                            if (u.lIlIlIllIIIl(Bank.isOpen() ? 1 : 0)) {
                                AccBuilderGWD.c = llIIlIIlI[llIIlIlIl[3]];
                                if (u.lIlIlIllIlIl(Inventory.getAll().size())) {
                                    Bank.depositInventory();
                                    Time.sleepTicks((int)llIIlIlIl[4]);

                                }
                                if (u.lIlIlIllIlIl(Equipment.getAll().size())) {
                                    Bank.depositEquipment();
                                    Time.sleepTicks((int)llIIlIlIl[3]);

                                }
                                int[] nArray = new int[llIIlIlIl[5]];
                                nArray[u.llIIlIlIl[1]] = llIIlIlIl[6];
                                nArray[u.llIIlIlIl[0]] = llIIlIlIl[7];
                                nArray[u.llIIlIlIl[3]] = llIIlIlIl[8];
                                nArray[u.llIIlIlIl[9]] = llIIlIlIl[10];
                                nArray[u.llIIlIlIl[4]] = llIIlIlIl[11];
                                nArray[u.llIIlIlIl[12]] = llIIlIlIl[13];
                                if (u.lIlIlIllIIll(e.d(nArray) ? 1 : 0)) {
                                    u.Q();
                                    System.out.println(llIIlIIlI[llIIlIlIl[9]]);
                                    bv = llIIlIlIl[0];
                                    return;
                                }
                                int[] nArray2 = new int[llIIlIlIl[5]];
                                nArray2[u.llIIlIlIl[1]] = llIIlIlIl[6];
                                nArray2[u.llIIlIlIl[0]] = llIIlIlIl[7];
                                nArray2[u.llIIlIlIl[3]] = llIIlIlIl[8];
                                nArray2[u.llIIlIlIl[9]] = llIIlIlIl[10];
                                nArray2[u.llIIlIlIl[4]] = llIIlIlIl[11];
                                nArray2[u.llIIlIlIl[12]] = llIIlIlIl[13];
                                if (u.lIlIlIllIIIl(e.d(nArray2) ? 1 : 0)) {
                                    int[] nArray3 = new int[llIIlIlIl[3]];
                                    nArray3[u.llIIlIlIl[1]] = llIIlIlIl[8];
                                    nArray3[u.llIIlIlIl[0]] = llIIlIlIl[10];
                                    a.a(nArray3);
                                    a.a(llIIlIlIl[6], llIIlIlIl[14]);
                                    a.a(llIIlIlIl[7], llIIlIlIl[14]);
                                    a.a(llIIlIlIl[15], llIIlIlIl[14]);
                                    a.b(f.aY, llIIlIlIl[0]);
                                    a.a(llIIlIlIl[11], llIIlIlIl[4]);
                                    a.a(llIIlIlIl[13], llIIlIlIl[16]);
                                }
                            }
                        }
                    }
                    if (u.lIlIlIllIIIl(Inventory.contains((int[])f.bc) ? 1 : 0) && u.lIlIlIllIIlI(Movement.getRunEnergy(), llIIlIlIl[17])) {
                        Inventory.getFirst((int[])f.bc).interact(llIIlIIlI[llIIlIlIl[4]]);
                        Time.sleepTicks((int)llIIlIlIl[0]);

                    }
                    if (u.lIlIlIllIIIl(u.an() ? 1 : 0) && u.lIlIlIllIIll(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()))) {
                        if (u.lIlIlIllIllI(Players.getLocal().getWorldLocation().distanceTo(dg), llIIlIlIl[4])) {
                            if (u.lIlIlIllIIIl(Inventory.contains((int[])f.aY) ? 1 : 0) && u.lIlIlIllIIll(Equipment.contains((int[])f.aY) ? 1 : 0)) {
                                Inventory.getFirst((int[])f.aY).interact(llIIlIIlI[llIIlIlIl[12]]);
                            }
                            if (u.lIlIlIllIIIl(Dialog.isOpen() ? 1 : 0)) {
                                Dialog.close();
                            }
                            AccBuilderGWD.c = llIIlIIlI[llIIlIlIl[5]];
                            Movement.walkTo((WorldPoint)dg);

                            Time.sleepTicks((int)llIIlIlIl[0]);

                        }
                        if (u.lIlIlIllIlll(Players.getLocal().getWorldLocation().distanceTo(dg), llIIlIlIl[4])) {
                            AccBuilderGWD.c = llIIlIIlI[llIIlIlIl[18]];
                            dk = llIIlIlIl[1];
                            if (u.lIlIlIllIIll(Dialog.isOpen() ? 1 : 0)) {
                                String[] stringArray = new String[llIIlIlIl[0]];
                                stringArray[u.llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[16]];
                                TileObjects.getNearest((String[])stringArray).interact(llIIlIIlI[llIIlIlIl[19]]);
                                Time.sleepTicks((int)llIIlIlIl[3]);

                            }
                            g.a(cG);
                        }
                    }
                    if (u.lIlIlIlllIII(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), llIIlIlIl[12])) {
                        if (u.lIlIlIllIllI(Players.getLocal().getWorldLocation().distanceTo(dh), llIIlIlIl[4])) {
                            AccBuilderGWD.c = llIIlIIlI[llIIlIlIl[14]];
                            Movement.walkTo((WorldPoint)dh);

                            Time.sleepTicks((int)llIIlIlIl[0]);

                            if (u.lIlIlIllIIIl(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llIIlIlIl[20], llIIlIlIl[21], llIIlIlIl[1])) ? 1 : 0)) {
                                AccBuilderGWD.c = llIIlIIlI[llIIlIlIl[22]];
                                e.c(new WorldPoint(llIIlIlIl[23], llIIlIlIl[24], llIIlIlIl[1]));
                                Time.sleepTicks((int)llIIlIlIl[5]);

                            }
                        }
                        if (u.lIlIlIllIlll(Players.getLocal().getWorldLocation().distanceTo(dh), llIIlIlIl[4])) {
                            AccBuilderGWD.c = llIIlIIlI[llIIlIlIl[25]];
                            g.a(llIIlIIlI[llIIlIlIl[26]], cG, llIIlIlIl[0]);
                        }
                    }
                    if (u.lIlIlIlllIII(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), llIIlIlIl[14])) {
                        if (u.lIlIlIllIllI(Players.getLocal().getWorldLocation().distanceTo(di), llIIlIlIl[4])) {
                            AccBuilderGWD.c = llIIlIIlI[llIIlIlIl[27]];
                            Movement.walkTo((WorldPoint)di);

                            Time.sleepTicks((int)llIIlIlIl[0]);

                        }
                        if (u.lIlIlIllIlll(Players.getLocal().getWorldLocation().distanceTo(di), llIIlIlIl[4])) {
                            int[] nArray = new int[llIIlIlIl[0]];
                            nArray[u.llIIlIlIl[1]] = llIIlIlIl[8];
                            if (u.lIlIlIllIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray4 = new int[llIIlIlIl[0]];
                                nArray4[u.llIIlIlIl[1]] = llIIlIlIl[8];
                                String[] stringArray = new String[llIIlIlIl[0]];
                                stringArray[u.llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[28]];
                                Inventory.getFirst((int[])nArray4).useOn(TileObjects.getNearest((String[])stringArray));
                                Time.sleepTicks((int)llIIlIlIl[3]);

                            }
                        }
                    }
                    if (!u.lIlIlIlllIII(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), llIIlIlIl[28])) break block64;
                    int[] nArray = new int[llIIlIlIl[0]];
                    nArray[u.llIIlIlIl[1]] = llIIlIlIl[10];
                    if (u.lIlIlIllIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray5 = new int[llIIlIlIl[0]];
                        nArray5[u.llIIlIlIl[1]] = llIIlIlIl[10];
                        Inventory.getFirst((int[])nArray5).interact(llIIlIIlI[llIIlIlIl[29]]);
                    }
                    if (u.lIlIlIllIlll(Players.getLocal().getWorldLocation().distanceTo(di), llIIlIlIl[4])) {
                        String[] stringArray = new String[llIIlIlIl[0]];
                        stringArray[u.llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[30]];
                        TileObjects.getNearest((String[])stringArray).interact(llIIlIIlI[llIIlIlIl[31]]);
                        Time.sleepTicks((int)llIIlIlIl[9]);

                    }
                    if (!u.lIlIlIllIllI(Players.getLocal().getLocalLocation().distanceTo(new LocalPoint(llIIlIlIl[32], llIIlIlIl[33])), llIIlIlIl[34])) break block65;
                    String[] stringArray = new String[llIIlIlIl[0]];
                    stringArray[u.llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[35]];
                    if (!u.lIlIlIllIlII(TileObjects.getNearest((String[])stringArray))) break block64;
                }
                String[] stringArray = new String[llIIlIlIl[0]];
                stringArray[u.llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[36]];
                if (u.lIlIlIllIlII(TileObjects.getNearest((String[])stringArray))) {
                    if (u.lIlIlIllIllI(Players.getLocal().getLocalLocation().getY(), llIIlIlIl[37])) {
                        String[] stringArray2 = new String[llIIlIlIl[0]];
                        stringArray2[u.llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[38]];
                        if (u.lIlIlIllIlll(Players.getLocal().getWorldLocation().distanceTo(TileObjects.getNearest((String[])stringArray2).getWorldLocation()), llIIlIlIl[14])) {
                            String[] stringArray3 = new String[llIIlIlIl[0]];
                            stringArray3[u.llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[39]];
                            if (u.lIlIlIlllIIl(NPCs.getNearest((String[])stringArray3))) {
                                AccBuilderGWD.c = llIIlIIlI[llIIlIlIl[40]];
                                String[] stringArray4 = new String[llIIlIlIl[0]];
                                stringArray4[u.llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[41]];
                                TileObjects.getNearest((String[])stringArray4).interact(llIIlIIlI[llIIlIlIl[42]]);
                                Time.sleepTicks((int)llIIlIlIl[14]);

                            }
                        }
                    }
                    String[] stringArray5 = new String[llIIlIlIl[0]];
                    stringArray5[u.llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[43]];
                    if (u.lIlIlIlllIIl(NPCs.getNearest((String[])stringArray5)) && u.lIlIlIllIIll(Dialog.isOpen() ? 1 : 0)) {
                        AccBuilderGWD.c = llIIlIIlI[llIIlIlIl[44]];
                        String[] stringArray6 = new String[llIIlIlIl[0]];
                        stringArray6[u.llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[45]];
                        TileObjects.getNearest((String[])stringArray6).interact(llIIlIIlI[llIIlIlIl[46]]);
                        Time.sleepTicks((int)llIIlIlIl[12]);

                        g.a(cG);
                    }
                    g.a(cG);
                }
            }
            if (u.lIlIlIlllIII(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), llIIlIlIl[36])) {
                AccBuilderGWD.c = llIIlIIlI[llIIlIlIl[47]];
                g.a(llIIlIIlI[llIIlIlIl[48]], cG);
            }
            if (u.lIlIlIlllIII(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), llIIlIlIl[42])) {
                if (u.lIlIlIllIllI(Players.getLocal().getWorldLocation().distanceTo(di), llIIlIlIl[4])) {
                    String[] stringArray = new String[llIIlIlIl[0]];
                    stringArray[u.llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[49]];
                    if (u.lIlIlIlllIIl(NPCs.getNearest((String[])stringArray))) {
                        String[] stringArray7 = new String[llIIlIlIl[0]];
                        stringArray7[u.llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[50]];
                        if (u.lIlIlIllIIll(Equipment.contains((String[])stringArray7) ? 1 : 0)) {
                            String[] stringArray8 = new String[llIIlIlIl[0]];
                            stringArray8[u.llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[51]];
                            if (u.lIlIlIllIIIl(Inventory.contains((String[])stringArray8) ? 1 : 0)) {
                                String[] stringArray9 = new String[llIIlIlIl[0]];
                                stringArray9[u.llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[52]];
                                Inventory.getFirst((String[])stringArray9).interact(llIIlIIlI[llIIlIlIl[53]]);
                            }
                        }
                        AccBuilderGWD.c = llIIlIIlI[llIIlIlIl[54]];
                        Movement.walkTo((WorldPoint)di);

                        Time.sleepTicks((int)llIIlIlIl[0]);

                    }
                }
                if (u.lIlIlIllIlll(Players.getLocal().getWorldLocation().distanceTo(di), llIIlIlIl[4])) {
                    AccBuilderGWD.c = llIIlIIlI[llIIlIlIl[55]];
                    String[] stringArray = new String[llIIlIlIl[0]];
                    stringArray[u.llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[56]];
                    if (u.lIlIlIllIlII(TileObjects.getNearest((String[])stringArray))) {
                        String[] stringArray10 = new String[llIIlIlIl[0]];
                        stringArray10[u.llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[57]];
                        TileObjects.getNearest((String[])stringArray10).interact(llIIlIIlI[llIIlIlIl[58]]);
                        Time.sleepTicks((int)llIIlIlIl[9]);

                    }
                }
                if (u.lIlIlIllIllI(Players.getLocal().getLocalLocation().getY(), llIIlIlIl[37])) {
                    String[] stringArray = new String[llIIlIlIl[0]];
                    stringArray[u.llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[59]];
                    if (u.lIlIlIllIllI(Players.getLocal().getWorldLocation().distanceTo(TileObjects.getNearest((String[])stringArray).getWorldLocation()), llIIlIlIl[18])) {
                        AccBuilderGWD.c = llIIlIIlI[llIIlIlIl[60]];
                        String[] stringArray11 = new String[llIIlIlIl[0]];
                        stringArray11[u.llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[61]];
                        TileObjects.getNearest((String[])stringArray11).interact(llIIlIIlI[llIIlIlIl[62]]);
                        Time.sleepTicks((int)llIIlIlIl[14]);

                    }
                }
                if (u.lIlIlIlllIIl(Players.getLocal().getInteracting()) && u.lIlIlIllIIll(Dialog.isOpen() ? 1 : 0)) {
                    String[] stringArray = new String[llIIlIlIl[0]];
                    stringArray[u.llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[63]];
                    if (u.lIlIlIllIIll(Equipment.contains((String[])stringArray) ? 1 : 0)) {
                        String[] stringArray12 = new String[llIIlIlIl[0]];
                        stringArray12[u.llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[64]];
                        if (u.lIlIlIllIIIl(Inventory.contains((String[])stringArray12) ? 1 : 0)) {
                            String[] stringArray13 = new String[llIIlIlIl[0]];
                            stringArray13[u.llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[65]];
                            Inventory.getFirst((String[])stringArray13).interact(llIIlIIlI[llIIlIlIl[66]]);
                        }
                    }
                    int[] nArray = new int[llIIlIlIl[0]];
                    nArray[u.llIIlIlIl[1]] = llIIlIlIl[10];
                    if (u.lIlIlIllIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray6 = new int[llIIlIlIl[0]];
                        nArray6[u.llIIlIlIl[1]] = llIIlIlIl[10];
                        if (u.lIlIlIllIIll(Equipment.contains((int[])nArray6) ? 1 : 0)) {
                            int[] nArray7 = new int[llIIlIlIl[0]];
                            nArray7[u.llIIlIlIl[1]] = llIIlIlIl[10];
                            Inventory.getFirst((int[])nArray7).interact(llIIlIIlI[llIIlIlIl[34]]);
                        }
                    }
                    String[] stringArray14 = new String[llIIlIlIl[0]];
                    stringArray14[u.llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[67]];
                    NPCs.getNearest((String[])stringArray14).interact(llIIlIIlI[llIIlIlIl[68]]);
                    Time.sleepTicks((int)llIIlIlIl[0]);

                }
                if (u.lIlIlIlllIlI(u.lIlIlIllIIII(e.w(), 60.0))) {
                    int[] nArray = new int[llIIlIlIl[0]];
                    nArray[u.llIIlIlIl[1]] = llIIlIlIl[13];
                    if (u.lIlIlIllIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray8 = new int[llIIlIlIl[0]];
                        nArray8[u.llIIlIlIl[1]] = llIIlIlIl[13];
                        Inventory.getFirst((int[])nArray8).interact(llIIlIIlI[llIIlIlIl[69]]);
                        Time.sleepTicks((int)llIIlIlIl[0]);

                    }
                }
                g.a(cG);
            }
            if (u.lIlIlIlllIII(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), llIIlIlIl[47])) {
                String[] stringArray = new String[llIIlIlIl[0]];
                stringArray[u.llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[70]];
                if (u.lIlIlIllIIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    AccBuilderGWD.c = llIIlIIlI[llIIlIlIl[71]];
                    String[] stringArray15 = new String[llIIlIlIl[0]];
                    stringArray15[u.llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[72]];
                    TileObjects.getNearest((String[])stringArray15).interact(llIIlIIlI[llIIlIlIl[73]]);
                    Time.sleepTicks((int)llIIlIlIl[4]);

                }
                String[] stringArray16 = new String[llIIlIlIl[0]];
                stringArray16[u.llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[74]];
                if (u.lIlIlIllIIIl(Inventory.contains((String[])stringArray16) ? 1 : 0)) {
                    if (u.lIlIlIllIllI(Players.getLocal().getWorldLocation().distanceTo(dh), llIIlIlIl[4])) {
                        AccBuilderGWD.c = llIIlIIlI[llIIlIlIl[75]];
                        Movement.walkTo((WorldPoint)dh);

                        Time.sleepTicks((int)llIIlIlIl[0]);

                        if (u.lIlIlIllIIIl(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llIIlIlIl[20], llIIlIlIl[21], llIIlIlIl[1])) ? 1 : 0)) {
                            AccBuilderGWD.c = llIIlIIlI[llIIlIlIl[76]];
                            e.c(new WorldPoint(llIIlIlIl[23], llIIlIlIl[24], llIIlIlIl[1]));
                            Time.sleepTicks((int)llIIlIlIl[5]);

                        }
                    }
                    if (u.lIlIlIllIlll(Players.getLocal().getWorldLocation().distanceTo(dh), llIIlIlIl[4])) {
                        AccBuilderGWD.c = llIIlIIlI[llIIlIlIl[77]];
                        g.a(llIIlIIlI[llIIlIlIl[78]], cG, llIIlIlIl[0]);
                    }
                }
            }
            if (u.lIlIlIlllIII(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), llIIlIlIl[52])) {
                if (u.lIlIlIllIllI(Players.getLocal().getWorldLocation().distanceTo(dj), llIIlIlIl[9])) {
                    AccBuilderGWD.c = llIIlIIlI[llIIlIlIl[79]];
                    Movement.walkTo((WorldPoint)dj);

                    Time.sleepTicks((int)llIIlIlIl[0]);

                }
                if (u.lIlIlIllIlll(Players.getLocal().getWorldLocation().distanceTo(dj), llIIlIlIl[9])) {
                    AccBuilderGWD.c = llIIlIIlI[llIIlIlIl[80]];
                    if (u.lIlIlIllIIlI(dk, llIIlIlIl[0])) {
                        as.pw += llIIlIlIl[0];
                        as.UHelper(AccBuilderGWD.m);
                        dk += llIIlIlIl[0];
                        as.pw = llIIlIlIl[1];
                        dl = llIIlIlIl[1];
                    }
                    g.a(llIIlIIlI[llIIlIlIl[17]], cG);
                }
            }
        }
    }

    private static boolean lIlIlIllIlll(int n2, int n3) {
        return n2 <= n3;
    }

        return String.valueOf(lIlIllllIlIlIl);
    }

    @Override
    public int af() {
        try {
            u.aX();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (3 <= 0) {
            return (0x25 ^ 0x47) & ~(0xA ^ 0x68);
        }
        return llIIlIlIl[85];
    }

    private static boolean lIlIlIllIlIl(int n2) {
        return n2 > 0;
    }

    private static boolean lIlIlIlllIll(int n2) {
        return n2 <= 0;
    }

    private static boolean lIlIlIllIIlI(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public boolean ae() {
        return llIIlIlIl[1];
    }

    private static boolean lIlIlIlllIIl(Object object) {
        return object == null;
    }

    @Override
    public String ag() {
        return llIIlIIlI[llIIlIlIl[86]];
    }

    private static void lIlIlIIllllI() {
        llIIlIIlI = new String[llIIlIlIl[100]];
        u.llIIlIIlI[u.llIIlIlIl[1]] = "Finished buying items, switching back to quest";
        u.llIIlIIlI[u.llIIlIlIl[0]] = "Nav to bank";
        u.llIIlIIlI[u.llIIlIlIl[3]] = "Handling banking";
        u.llIIlIIlI[u.llIIlIlIl[9]] = "We are missing quest supplies, switching to BUYING";
        u.llIIlIIlI[u.llIIlIlIl[4]] = "Drink";
        u.llIIlIIlI[u.llIIlIlIl[12]] = "Wear";
        u.llIIlIIlI[u.llIIlIlIl[5]] = "Nav to start";
        u.llIIlIIlI[u.llIIlIlIl[18]] = "Starting quest";
        u.llIIlIIlI[u.llIIlIlIl[16]] = "Notice board";
        u.llIIlIIlI[u.llIIlIlIl[19]] = "Check";
        u.llIIlIIlI[u.llIIlIlIl[14]] = "Nav to sarah";
        u.llIIlIIlI[u.llIIlIlIl[22]] = "Stuck, clicking out";
        u.llIIlIIlI[u.llIIlIlIl[25]] = "Talking sarah";
        u.llIIlIIlI[u.llIIlIlIl[26]] = "Sarah";
        u.llIIlIIlI[u.llIIlIlIl[27]] = "Nav to hole";
        u.llIIlIIlI[u.llIIlIlIl[28]] = "Strange hole";
        u.llIIlIIlI[u.llIIlIlIl[29]] = "Wield";
        u.llIIlIIlI[u.llIIlIlIl[30]] = "Strange hole";
        u.llIIlIIlI[u.llIIlIlIl[31]] = "Climb-down";
        u.llIIlIIlI[u.llIIlIlIl[35]] = "Skeleton";
        u.llIIlIIlI[u.llIIlIlIl[36]] = "Skeleton";
        u.llIIlIIlI[u.llIIlIlIl[38]] = "Blockage";
        u.llIIlIIlI[u.llIIlIlIl[39]] = "Pig Thing";
        u.llIIlIIlI[u.llIIlIlIl[40]] = "Climb over blockage";
        u.llIIlIIlI[u.llIIlIlIl[41]] = "Blockage";
        u.llIIlIIlI[u.llIIlIlIl[42]] = "Climb-over";
        u.llIIlIIlI[u.llIIlIlIl[43]] = "Pig Thing";
        u.llIIlIIlI[u.llIIlIlIl[44]] = "Interact skele";
        u.llIIlIIlI[u.llIIlIlIl[45]] = "Skeleton";
        u.llIIlIIlI[u.llIIlIlIl[46]] = "Investigate";
        u.llIIlIIlI[u.llIIlIlIl[47]] = "Interacting Spira";
        u.llIIlIIlI[u.llIIlIlIl[48]] = "Spria";
        u.llIIlIIlI[u.llIIlIlIl[49]] = "Sourhog";
        u.llIIlIIlI[u.llIIlIlIl[50]] = "Reinforced goggles";
        u.llIIlIIlI[u.llIIlIlIl[51]] = "Reinforced goggles";
        u.llIIlIIlI[u.llIIlIlIl[52]] = "Reinforced goggles";
        u.llIIlIIlI[u.llIIlIlIl[53]] = "Wear";
        u.llIIlIIlI[u.llIIlIlIl[54]] = "Nav to hole";
        u.llIIlIIlI[u.llIIlIlIl[55]] = "Climb down hole";
        u.llIIlIIlI[u.llIIlIlIl[56]] = "Strange hole";
        u.llIIlIIlI[u.llIIlIlIl[57]] = "Strange hole";
        u.llIIlIIlI[u.llIIlIlIl[58]] = "Climb-down";
        u.llIIlIIlI[u.llIIlIlIl[59]] = "Blockage";
        u.llIIlIIlI[u.llIIlIlIl[60]] = "Climb over blockage";
        u.llIIlIIlI[u.llIIlIlIl[61]] = "Blockage";
        u.llIIlIIlI[u.llIIlIlIl[62]] = "Climb-over";
        u.llIIlIIlI[u.llIIlIlIl[63]] = "Reinforced goggles";
        u.llIIlIIlI[u.llIIlIlIl[64]] = "Reinforced goggles";
        u.llIIlIIlI[u.llIIlIlIl[65]] = "Reinforced goggles";
        u.llIIlIIlI[u.llIIlIlIl[66]] = "Wear";
        u.llIIlIIlI[u.llIIlIlIl[34]] = "Wield";
        u.llIIlIIlI[u.llIIlIlIl[67]] = "Sourhog";
        u.llIIlIIlI[u.llIIlIlIl[68]] = "Attack";
        u.llIIlIIlI[u.llIIlIlIl[69]] = "Eat";
        u.llIIlIIlI[u.llIIlIlIl[70]] = "Sourhog foot";
        u.llIIlIIlI[u.llIIlIlIl[71]] = "Cutting foot";
        u.llIIlIIlI[u.llIIlIlIl[72]] = "Dead sourhog";
        u.llIIlIIlI[u.llIIlIlIl[73]] = "Cut-foot";
        u.llIIlIIlI[u.llIIlIlIl[74]] = "Sourhog foot";
        u.llIIlIIlI[u.llIIlIlIl[75]] = "Nav to sarah";
        u.llIIlIIlI[u.llIIlIlIl[76]] = "Stuck, clicking out";
        u.llIIlIIlI[u.llIIlIlIl[77]] = "Talking sarah";
        u.llIIlIIlI[u.llIIlIlIl[78]] = "Sarah";
        u.llIIlIIlI[u.llIIlIlIl[79]] = "Nav to Spria";
        u.llIIlIIlI[u.llIIlIlIl[80]] = "Talking spria";
        u.llIIlIIlI[u.llIIlIlIl[17]] = "Spria";
        u.llIIlIIlI[u.llIIlIlIl[86]] = "A porceline of interest";
        u.llIIlIIlI[u.llIIlIlIl[87]] = "ring of wealth (";
        u.llIIlIIlI[u.llIIlIlIl[96]] = "Yes.";
        u.llIIlIIlI[u.llIIlIlIl[97]] = "Talk about the bounty.";
        u.llIIlIIlI[u.llIIlIlIl[98]] = "I think that'll be all for now.";
        u.llIIlIIlI[u.llIIlIlIl[99]] = "Yes";
    }

    private static boolean lIlIlIlllIlI(int n2) {
        return n2 < 0;
    }

    private static boolean lIlIlIlllIII(int n2, int n3) {
        return n2 == n3;
    }

    private static int lIlIlIllIIII(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (u.lIlIlIllllII(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), llIIlIlIl[57])) {
            bl = llIIlIlIl[0];

            if (-(0x33 ^ 0x37) >= 0) {
                return false;
            }
        } else {
            bl = llIIlIlIl[1];
        }
        return bl;
    }

    private static boolean lIlIlIllIIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIlIllIIll(int n2) {
        return n2 == 0;
    }
}

