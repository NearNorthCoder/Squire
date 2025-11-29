/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.quests.QuestVarbits
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks;

import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.AHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.AAHelper;
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
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;

public class WHelper
implements ab {
    private static  WorldPoint dz;
    public static  boolean dx;
    
    public static  boolean dw;
    private static  WorldPoint dC;
    public static  boolean bv;
    public static  boolean dv;
    static  boolean dl;
    
    private static  WorldPoint dF;
    public static  boolean du;
    
    static  int dy;
    private static  WorldPoint dA;
    public static  boolean dt;
    private static  WorldPoint dD;
    static  int dk;
    private static  WorldPoint dB;
    public static  List<d> bx;
    private static  WorldPoint dE;

    public static void bd() {
        String[] stringArray = new String[llllIIIIl[0]];
        stringArray[w.llllIIIIl[1]] = lllIllllI[llllIIIIl[66]];
        if (w.llIIllIlIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            if (w.llIIllIlllII(Widgets.get((int)llllIIIIl[59]))) {
                Widget llIIlIlIllllI;
                AccBuilderGWD.c = lllIllllI[llllIIIIl[67]];
                String[] stringArray2 = new String[llllIIIIl[0]];
                stringArray2[w.llllIIIIl[1]] = lllIllllI[llllIIIIl[68]];
                Inventory.getFirst((String[])stringArray2).interact(lllIllllI[llllIIIIl[69]]);
                Time.sleepTicks((int)llllIIIIl[6]);

                AccBuilderGWD.c = lllIllllI[llllIIIIl[70]];
                Widget widget = Widgets.get((int)llllIIIIl[59], (int)llllIIIIl[27]);
                if (w.llIIllIlllII(widget)) {
                    widget.interact(lllIllllI[llllIIIIl[71]]);
                    Time.sleepTicks((int)llllIIIIl[0]);

                }
                if (w.llIIllIlllII(llIIlIlIllllI = Widgets.get((int)llllIIIIl[59], (int)llllIIIIl[39]))) {
                    llIIlIlIllllI.interact(lllIllllI[llllIIIIl[72]]);
                    Time.sleepTicks((int)llllIIIIl[5]);

                }
            }
            Time.sleepTicks((int)llllIIIIl[0]);

        }
    }

    private static boolean llIIllIllIIl(int n2) {
        return n2 == 0;
    }

        return String.valueOf(llIIlIIlllllI);
    }

    private static boolean llIIllIlIlll(int n2) {
        return n2 != 0;
    }

    @Override
    public int af() {
        try {
            w.bc();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (3 < 0) {
            return (0x94 ^ 0x90) & ~(0xAC ^ 0xA8);
        }
        return llllIIIIl[77];
    }

    private static boolean llIIlllIIIII(int n2, int n3) {
        return n2 != n3;
    }

    @Override
    public boolean ae() {
        return llllIIIIl[1];
    }

    private static boolean llIIllIlllII(Object object) {
        return object != null;
    }

    @Override
    public String ag() {
        return lllIllllI[llllIIIIl[78]];
    }

    static {
        w.llIIllIlIllI();
        w.llIIllIlIlIl();
        bx = new ArrayList<d>();
        dy = llllIIIIl[1];
        dz = new WorldPoint(llllIIIIl[91], llllIIIIl[92], llllIIIIl[1]);
        dA = new WorldPoint(llllIIIIl[93], llllIIIIl[94], llllIIIIl[1]);
        dB = new WorldPoint(llllIIIIl[95], llllIIIIl[96], llllIIIIl[1]);
        dC = new WorldPoint(llllIIIIl[97], llllIIIIl[98], llllIIIIl[1]);
        dD = new WorldPoint(llllIIIIl[99], llllIIIIl[100], llllIIIIl[1]);
        dE = new WorldPoint(llllIIIIl[101], llllIIIIl[102], llllIIIIl[1]);
        dF = new WorldPoint(llllIIIIl[103], llllIIIIl[104], llllIIIIl[1]);
        String[] stringArray = new String[llllIIIIl[33]];
        stringArray[w.llllIIIIl[1]] = lllIllllI[llllIIIIl[105]];
        stringArray[w.llllIIIIl[0]] = lllIllllI[llllIIIIl[106]];
        stringArray[w.llllIIIIl[5]] = lllIllllI[llllIIIIl[107]];
        stringArray[w.llllIIIIl[10]] = lllIllllI[llllIIIIl[108]];
        stringArray[w.llllIIIIl[6]] = lllIllllI[llllIIIIl[109]];
        stringArray[w.llllIIIIl[13]] = lllIllllI[llllIIIIl[110]];
        stringArray[w.llllIIIIl[17]] = lllIllllI[llllIIIIl[111]];
        stringArray[w.llllIIIIl[18]] = lllIllllI[llllIIIIl[112]];
        stringArray[w.llllIIIIl[2]] = lllIllllI[llllIIIIl[113]];
        stringArray[w.llllIIIIl[24]] = lllIllllI[llllIIIIl[114]];
        stringArray[w.llllIIIIl[12]] = lllIllllI[llllIIIIl[115]];
        stringArray[w.llllIIIIl[25]] = lllIllllI[llllIIIIl[116]];
        stringArray[w.llllIIIIl[15]] = lllIllllI[llllIIIIl[117]];
        stringArray[w.llllIIIIl[26]] = lllIllllI[llllIIIIl[118]];
        stringArray[w.llllIIIIl[27]] = lllIllllI[llllIIIIl[119]];
        stringArray[w.llllIIIIl[28]] = lllIllllI[llllIIIIl[120]];
        stringArray[w.llllIIIIl[29]] = lllIllllI[llllIIIIl[121]];
        stringArray[w.llllIIIIl[30]] = lllIllllI[llllIIIIl[122]];
        stringArray[w.llllIIIIl[31]] = lllIllllI[llllIIIIl[123]];
        stringArray[w.llllIIIIl[32]] = lllIllllI[llllIIIIl[124]];
        cG = stringArray;
    }

    private static void Q() {
        d llIIlIlIllIlI;
        Object llIIlIlIllIll;
        int[] nArray = new int[llllIIIIl[0]];
        nArray[w.llllIIIIl[1]] = llllIIIIl[9];
        if (w.llIIllIllIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new DHelper(llllIIIIl[9], llllIIIIl[12], llllIIIIl[74]);
            bx.add(d2);

        }
        int[] nArray2 = new int[llllIIIIl[0]];
        nArray2[w.llllIIIIl[1]] = llllIIIIl[11];
        if (w.llIIllIllIIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
            llIIlIlIllIll = new DHelper(llllIIIIl[11], llllIIIIl[13], j.ch);
            bx.add((DHelper) lIIlIlIllIll);

        }
        if (w.llIIllIllIIl(Bank.contains(llIIlIlIllIll = item -> item.getName().toLowerCase().contains(lllIllllI[llllIIIIl[80]])) ? 1 : 0)) {
            llIIlIlIllIlI = new DHelper(llllIIIIl[75], llllIIIIl[13], llllIIIIl[76]);
            bx.add(llIIlIlIllIlI);

        }
        int[] nArray3 = new int[llllIIIIl[0]];
        nArray3[w.llllIIIIl[1]] = llllIIIIl[7];
        if (w.llIIllIllIIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
            llIIlIlIllIlI = new DHelper(llllIIIIl[7], llllIIIIl[53], llllIIIIl[74]);
            bx.add(llIIlIlIllIlI);

        }
        int[] nArray4 = new int[llllIIIIl[0]];
        nArray4[w.llllIIIIl[1]] = llllIIIIl[8];
        if (w.llIIllIllIIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
            llIIlIlIllIlI = new DHelper(llllIIIIl[8], llllIIIIl[12], llllIIIIl[74]);
            bx.add(llIIlIlIllIlI);

        }
    }

    private static boolean llIIllIlllIl(int n2) {
        return n2 > 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean ah() {
        int n2;
        if (w.llIIllIllIlI(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llllIIIIl[24])) {
            String[] stringArray = new String[llllIIIIl[0]];
            stringArray[w.llllIIIIl[1]] = lllIllllI[llllIIIIl[79]];
            if (w.llIIllIllIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                n2 = llllIIIIl[0];

                if (1 < 3) return n2 != 0;
                return ((0xF ^ 0x7B ^ (0x2B ^ 0x6D)) & (35 + 6 - 22 + 118 ^ 172 + 0 - 36 + 51 ^ -1)) != 0;
            }
        }
        n2 = llllIIIIl[1];
        return n2 != 0;
    }

    public static void bc() {
        block80: {
            Widget llIIlIllIIlIl;
            Object llIIlIllIIllI;
            block82: {
                block81: {
                    if (w.llIIllIlIlll(bv ? 1 : 0)) {
                        b.a(bx);
                        if (w.llIIllIllIII(bx.size(), llllIIIIl[0])) {
                            System.out.println(lllIllllI[llllIIIIl[1]]);
                            bv = llllIIIIl[1];
                        }
                    }
                    if (!w.llIIllIllIIl(bv ? 1 : 0)) break block80;
                    if (!w.llIIllIllIlI(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), llllIIIIl[2])) break block81;
                    int[] nArray = new int[llllIIIIl[0]];
                    nArray[w.llllIIIIl[1]] = llllIIIIl[3];
                    if (!w.llIIllIlIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block82;
                }
                aa.dQ();
            }
            if (w.llIIllIllIIl(w.an() ? 1 : 0) && w.llIIllIllIII(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llllIIIIl[0]) && w.llIIllIllIll(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), llllIIIIl[2])) {
                int[] nArray = new int[llllIIIIl[0]];
                nArray[w.llllIIIIl[1]] = llllIIIIl[3];
                if (w.llIIllIllIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    llIIlIllIIllI = BankLocation.getNearest();
                    if (w.llIIllIlllII(llIIlIllIIllI) && w.llIIllIllIIl(llIIlIllIIllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderGWD.c = lllIllllI[llllIIIIl[0]];
                        a.a((BankLocation)llIIlIllIIllI);
                    }
                    if (w.llIIllIlllII(llIIlIllIIllI) && w.llIIllIlIlll(llIIlIllIIllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (w.llIIllIllIIl(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)llllIIIIl[4]);

                        }
                        if (w.llIIllIlIlll(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderGWD.c = lllIllllI[llllIIIIl[5]];
                            if (w.llIIllIlllIl(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)llllIIIIl[6]);

                            }
                            if (w.llIIllIlllIl(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)llllIIIIl[5]);

                            }
                            int[] nArray2 = new int[llllIIIIl[6]];
                            nArray2[w.llllIIIIl[1]] = llllIIIIl[7];
                            nArray2[w.llllIIIIl[0]] = llllIIIIl[8];
                            nArray2[w.llllIIIIl[5]] = llllIIIIl[9];
                            nArray2[w.llllIIIIl[10]] = llllIIIIl[11];
                            if (w.llIIllIllIIl(e.d(nArray2) ? 1 : 0)) {
                                w.Q();
                                System.out.println(lllIllllI[llllIIIIl[10]]);
                                bv = llllIIIIl[0];
                                return;
                            }
                            int[] nArray3 = new int[llllIIIIl[6]];
                            nArray3[w.llllIIIIl[1]] = llllIIIIl[7];
                            nArray3[w.llllIIIIl[0]] = llllIIIIl[8];
                            nArray3[w.llllIIIIl[5]] = llllIIIIl[9];
                            nArray3[w.llllIIIIl[10]] = llllIIIIl[11];
                            if (w.llIIllIlIlll(e.d(nArray3) ? 1 : 0)) {
                                a.a(llllIIIIl[7], llllIIIIl[12]);
                                a.a(llllIIIIl[8], llllIIIIl[12]);
                                a.a(llllIIIIl[9], llllIIIIl[0]);
                                a.a(llllIIIIl[11], llllIIIIl[13]);
                                a.a(llllIIIIl[14], llllIIIIl[13]);
                            }
                        }
                    }
                }
            }
            int[] nArray = new int[llllIIIIl[0]];
            nArray[w.llllIIIIl[1]] = llllIIIIl[14];
            if (w.llIIllIlIlll(Inventory.contains((int[])nArray) ? 1 : 0) && w.llIIllIllIlI(Combat.getMissingHealth(), llllIIIIl[15])) {
                int[] nArray4 = new int[llllIIIIl[0]];
                nArray4[w.llllIIIIl[1]] = llllIIIIl[14];
                Inventory.getFirst((int[])nArray4).interact(lllIllllI[llllIIIIl[6]]);
                Time.sleepTicks((int)llllIIIIl[5]);

            }
            if (w.llIIllIlIlll(Inventory.contains((int[])f.bc) ? 1 : 0) && w.llIIllIllIII(Movement.getRunEnergy(), llllIIIIl[16])) {
                Inventory.getFirst((int[])f.bc).interact(lllIllllI[llllIIIIl[13]]);
                Time.sleepTicks((int)llllIIIIl[0]);

            }
            if (w.llIIllIllIII(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llllIIIIl[0]) && w.llIIllIlIlll(w.an() ? 1 : 0) && w.llIIllIllIll(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), llllIIIIl[2])) {
                int[] nArray5 = new int[llllIIIIl[0]];
                nArray5[w.llllIIIIl[1]] = llllIIIIl[3];
                if (w.llIIllIllIIl(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                    if (w.llIIllIllIIl(Players.getLocal().getWorldLocation().equals((Object)dz) ? 1 : 0)) {
                        AccBuilderGWD.c = lllIllllI[llllIIIIl[17]];
                        if (w.llIIllIlIlll(Dialog.isOpen() ? 1 : 0) && w.llIIllIllIII(dy, llllIIIIl[5])) {
                            Dialog.close();
                            dy += llllIIIIl[0];
                        }
                        e.a(dz);
                    }
                    if (w.llIIllIlIlll(Players.getLocal().getWorldLocation().equals((Object)dz) ? 1 : 0)) {
                        AccBuilderGWD.c = lllIllllI[llllIIIIl[18]];
                        g.a(lllIllllI[llllIIIIl[2]], cG);
                    }
                }
            }
            System.out.println("5620: " + Vars.getBit((int)llllIIIIl[19]));
            System.out.println("5621: " + Vars.getBit((int)llllIIIIl[20]));
            System.out.println("5622: " + Vars.getBit((int)llllIIIIl[21]));
            System.out.println("5623: " + Vars.getBit((int)llllIIIIl[22]));
            System.out.println("5624: " + Vars.getBit((int)llllIIIIl[23]));
            if (w.llIIllIllIll(Vars.getBit((int)llllIIIIl[19]), llllIIIIl[0])) {
                dt = llllIIIIl[0];
            }
            if (w.llIIllIllIll(Vars.getBit((int)llllIIIIl[20]), llllIIIIl[0])) {
                du = llllIIIIl[0];
            }
            if (w.llIIllIllIll(Vars.getBit((int)llllIIIIl[21]), llllIIIIl[0])) {
                dv = llllIIIIl[0];
            }
            if (w.llIIllIllIll(Vars.getBit((int)llllIIIIl[22]), llllIIIIl[0])) {
                dw = llllIIIIl[0];
            }
            if (w.llIIllIllIll(Vars.getBit((int)llllIIIIl[23]), llllIIIIl[0])) {
                dx = llllIIIIl[0];
            }
            if (w.llIIllIllIll(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llllIIIIl[0])) {
                int llIIlIllIIlII;
                dk = llllIIIIl[1];
                if (w.llIIllIllIIl(dt ? 1 : 0)) {
                    String[] stringArray = new String[llllIIIIl[0]];
                    stringArray[w.llllIIIIl[1]] = lllIllllI[llllIIIIl[24]];
                    if (w.llIIllIlIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        String[] stringArray2 = new String[llllIIIIl[0]];
                        stringArray2[w.llllIIIIl[1]] = lllIllllI[llllIIIIl[12]];
                        if (w.llIIllIlIlll(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                            String[] stringArray3 = new String[llllIIIIl[0]];
                            stringArray3[w.llllIIIIl[1]] = lllIllllI[llllIIIIl[25]];
                            if (w.llIIllIllIIl(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                                String[] stringArray4 = new String[llllIIIIl[0]];
                                stringArray4[w.llllIIIIl[1]] = lllIllllI[llllIIIIl[15]];
                                String[] stringArray5 = new String[llllIIIIl[0]];
                                stringArray5[w.llllIIIIl[1]] = lllIllllI[llllIIIIl[26]];
                                Inventory.getFirst((String[])stringArray4).useOn(Inventory.getFirst((String[])stringArray5));
                                Time.sleepTicks((int)llllIIIIl[5]);

                            }
                        }
                    }
                    String[] stringArray6 = new String[llllIIIIl[0]];
                    stringArray6[w.llllIIIIl[1]] = lllIllllI[llllIIIIl[27]];
                    if (w.llIIllIlIlll(Inventory.contains((String[])stringArray6) ? 1 : 0)) {
                        if (w.llIIllIllllI(Players.getLocal().getWorldLocation().distanceTo(dA), llllIIIIl[2])) {
                            AccBuilderGWD.c = lllIllllI[llllIIIIl[28]];
                            Movement.walkTo((WorldPoint)dA);

                            Time.sleepTicks((int)llllIIIIl[0]);

                        }
                        if (w.llIIllIlllll(Players.getLocal().getWorldLocation().distanceTo(dA), llllIIIIl[2])) {
                            AccBuilderGWD.c = lllIllllI[llllIIIIl[29]];
                            g.a(lllIllllI[llllIIIIl[30]], cG, llllIIIIl[0]);
                            Time.sleepTicks((int)llllIIIIl[0]);

                            llIIlIllIIllI = Dialog.getOptions();
                            llIIlIllIIlIl = new ArrayList();
                            if (w.llIIllIllIIl(llIIlIllIIllI.isEmpty() ? 1 : 0)) {
                                llIIlIllIIlII = llllIIIIl[1];
                                while (w.llIIllIllIII(llIIlIllIIlII, llIIlIllIIllI.size())) {
                                    llIIlIllIIlIl.add(((Widget)llIIlIllIIllI.get(llIIlIllIIlII)).getText());

                                    ++llIIlIllIIlII;

                                    if (((0x32 ^ 0xA) & ~(0x33 ^ 0xB)) == 0) continue;
                                    return;
                                }
                                llIIlIllIIlII = llIIlIllIIlIl.stream().anyMatch(string -> string.equalsIgnoreCase(lllIllllI[llllIIIIl[90]])) ? 1 : 0;
                                int n2 = llIIlIllIIlIl.stream().noneMatch(string -> string.equalsIgnoreCase(lllIllllI[llllIIIIl[89]]));
                                if (w.llIIllIlIlll(llIIlIllIIlII) && w.llIIllIlIlll(n2)) {
                                    System.out.println(lllIllllI[llllIIIIl[31]]);
                                }
                            }
                        }
                    }
                }
                if (w.llIIllIllIIl(du ? 1 : 0) && w.llIIllIlIlll(dt ? 1 : 0)) {
                    if (w.llIIllIllllI(Players.getLocal().getWorldLocation().distanceTo(dB), llllIIIIl[18])) {
                        AccBuilderGWD.c = lllIllllI[llllIIIIl[32]];
                        Movement.walkTo((WorldPoint)dB);

                        Time.sleepTicks((int)llllIIIIl[0]);

                    }
                    if (w.llIIllIlllll(Players.getLocal().getWorldLocation().distanceTo(dB), llllIIIIl[18])) {
                        AccBuilderGWD.c = lllIllllI[llllIIIIl[33]];
                        g.a(lllIllllI[llllIIIIl[34]], cG, llllIIIIl[0]);
                        Time.sleepTicks((int)llllIIIIl[0]);

                        llIIlIllIIllI = Dialog.getOptions();
                        llIIlIllIIlIl = new ArrayList();
                        if (w.llIIllIllIIl(llIIlIllIIllI.isEmpty() ? 1 : 0)) {
                            llIIlIllIIlII = llllIIIIl[1];
                            while (w.llIIllIllIII(llIIlIllIIlII, llIIlIllIIllI.size())) {
                                llIIlIllIIlIl.add(((Widget)llIIlIllIIllI.get(llIIlIllIIlII)).getText());

                                ++llIIlIllIIlII;

                                if (((0x90 ^ 0xB5 ^ (0x56 ^ 0x3E)) & (16 + 200 - 84 + 115 ^ 151 + 35 - 50 + 50 ^ -1)) == 0) continue;
                                return;
                            }
                            llIIlIllIIlII = llIIlIllIIlIl.stream().anyMatch(string -> string.equalsIgnoreCase(lllIllllI[llllIIIIl[88]])) ? 1 : 0;
                            int n3 = llIIlIllIIlIl.stream().noneMatch(string -> string.equalsIgnoreCase(lllIllllI[llllIIIIl[87]]));
                            if (w.llIIllIlIlll(llIIlIllIIlII) && w.llIIllIlIlll(n3)) {
                                System.out.println(lllIllllI[llllIIIIl[35]]);
                            }
                        }
                    }
                }
                if (w.llIIllIllIIl(dv ? 1 : 0) && w.llIIllIlIlll(du ? 1 : 0) && w.llIIllIlIlll(dt ? 1 : 0)) {
                    if (w.llIIllIllllI(Players.getLocal().getWorldLocation().distanceTo(dC), llllIIIIl[18])) {
                        AccBuilderGWD.c = lllIllllI[llllIIIIl[36]];
                        Movement.walkTo((WorldPoint)dC);

                        Time.sleepTicks((int)llllIIIIl[0]);

                    }
                    if (w.llIIllIlllll(Players.getLocal().getWorldLocation().distanceTo(dC), llllIIIIl[18])) {
                        AccBuilderGWD.c = lllIllllI[llllIIIIl[37]];
                        g.a(lllIllllI[llllIIIIl[38]], cG, llllIIIIl[0]);
                        Time.sleepTicks((int)llllIIIIl[0]);

                        llIIlIllIIllI = Dialog.getOptions();
                        llIIlIllIIlIl = new ArrayList();
                        if (w.llIIllIllIIl(llIIlIllIIllI.isEmpty() ? 1 : 0)) {
                            llIIlIllIIlII = llllIIIIl[1];
                            while (w.llIIllIllIII(llIIlIllIIlII, llIIlIllIIllI.size())) {
                                llIIlIllIIlIl.add(((Widget)llIIlIllIIllI.get(llIIlIllIIlII)).getText());

                                ++llIIlIllIIlII;

                                if (1 != 0) continue;
                                return;
                            }
                            llIIlIllIIlII = llIIlIllIIlIl.stream().anyMatch(string -> string.equalsIgnoreCase(lllIllllI[llllIIIIl[86]])) ? 1 : 0;
                            int n4 = llIIlIllIIlIl.stream().noneMatch(string -> string.equalsIgnoreCase(lllIllllI[llllIIIIl[85]]));
                            if (w.llIIllIlIlll(llIIlIllIIlII) && w.llIIllIlIlll(n4)) {
                                System.out.println(lllIllllI[llllIIIIl[39]]);
                            }
                        }
                    }
                }
                if (w.llIIllIllIIl(dw ? 1 : 0) && w.llIIllIlIlll(dv ? 1 : 0) && w.llIIllIlIlll(du ? 1 : 0) && w.llIIllIlIlll(dt ? 1 : 0)) {
                    if (w.llIIllIllllI(Players.getLocal().getWorldLocation().distanceTo(dD), llllIIIIl[18])) {
                        AccBuilderGWD.c = lllIllllI[llllIIIIl[40]];
                        Movement.walkTo((WorldPoint)dD);

                        Time.sleepTicks((int)llllIIIIl[0]);

                    }
                    if (w.llIIllIlllll(Players.getLocal().getWorldLocation().distanceTo(dD), llllIIIIl[18])) {
                        AccBuilderGWD.c = lllIllllI[llllIIIIl[41]];
                        g.a(lllIllllI[llllIIIIl[42]], cG, llllIIIIl[0]);
                        Time.sleepTicks((int)llllIIIIl[0]);

                        llIIlIllIIllI = Dialog.getOptions();
                        llIIlIllIIlIl = new ArrayList();
                        if (w.llIIllIllIIl(llIIlIllIIllI.isEmpty() ? 1 : 0)) {
                            llIIlIllIIlII = llllIIIIl[1];
                            while (w.llIIllIllIII(llIIlIllIIlII, llIIlIllIIllI.size())) {
                                llIIlIllIIlIl.add(((Widget)llIIlIllIIllI.get(llIIlIllIIlII)).getText());

                                ++llIIlIllIIlII;

                                if (((0x46 ^ 0x27 ^ (0x79 ^ 0x21)) & (0xAA ^ 0xC4 ^ (0x5C ^ 0xB) ^ -1)) < 1) continue;
                                return;
                            }
                            llIIlIllIIlII = llIIlIllIIlIl.stream().anyMatch(string -> string.equalsIgnoreCase(lllIllllI[llllIIIIl[84]])) ? 1 : 0;
                            int n5 = llIIlIllIIlIl.stream().noneMatch(string -> string.equalsIgnoreCase(lllIllllI[llllIIIIl[83]]));
                            if (w.llIIllIlIlll(llIIlIllIIlII) && w.llIIllIlIlll(n5)) {
                                System.out.println(lllIllllI[llllIIIIl[43]]);
                            }
                        }
                    }
                }
                if (w.llIIllIllIIl(dx ? 1 : 0) && w.llIIllIlIlll(dw ? 1 : 0) && w.llIIllIlIlll(dv ? 1 : 0) && w.llIIllIlIlll(du ? 1 : 0) && w.llIIllIlIlll(dt ? 1 : 0)) {
                    if (w.llIIllIllllI(Players.getLocal().getWorldLocation().distanceTo(dE), llllIIIIl[18])) {
                        AccBuilderGWD.c = lllIllllI[llllIIIIl[44]];
                        Movement.walkTo((WorldPoint)dE);

                        Time.sleepTicks((int)llllIIIIl[0]);

                    }
                    if (w.llIIllIlllll(Players.getLocal().getWorldLocation().distanceTo(dE), llllIIIIl[18])) {
                        AccBuilderGWD.c = lllIllllI[llllIIIIl[45]];
                        g.a(lllIllllI[llllIIIIl[46]], cG, llllIIIIl[0]);
                        Time.sleepTicks((int)llllIIIIl[0]);

                        llIIlIllIIllI = Dialog.getOptions();
                        llIIlIllIIlIl = new ArrayList();
                        if (w.llIIllIllIIl(llIIlIllIIllI.isEmpty() ? 1 : 0)) {
                            llIIlIllIIlII = llllIIIIl[1];
                            while (w.llIIllIllIII(llIIlIllIIlII, llIIlIllIIllI.size())) {
                                llIIlIllIIlIl.add(((Widget)llIIlIllIIllI.get(llIIlIllIIlII)).getText());

                                ++llIIlIllIIlII;

                                return;
                            }
                            llIIlIllIIlII = llIIlIllIIlIl.stream().anyMatch(string -> string.equalsIgnoreCase(lllIllllI[llllIIIIl[16]])) ? 1 : 0;
                            int n6 = llIIlIllIIlIl.stream().anyMatch(string -> string.contains(lllIllllI[llllIIIIl[82]]));
                            int n7 = llIIlIllIIlIl.stream().noneMatch(string -> string.equalsIgnoreCase(lllIllllI[llllIIIIl[81]]));
                            if ((!w.llIIllIllIIl(llIIlIllIIlII) || w.llIIllIlIlll(n6)) && w.llIIllIlIlll(n7)) {
                                System.out.println(lllIllllI[llllIIIIl[47]]);
                            }
                        }
                    }
                }
            }
            if (w.llIIllIllIll(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llllIIIIl[5])) {
                if (w.llIIllIllllI(Players.getLocal().getWorldLocation().distanceTo(dz), llllIIIIl[5])) {
                    AccBuilderGWD.c = lllIllllI[llllIIIIl[48]];
                    if (w.llIIllIlIlll(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    e.a(dz);
                }
                if (w.llIIllIlllll(Players.getLocal().getWorldLocation().distanceTo(dz), llllIIIIl[5])) {
                    AccBuilderGWD.c = lllIllllI[llllIIIIl[49]];
                    g.a(lllIllllI[llllIIIIl[50]], cG);
                }
            }
            if (!w.llIIlllIIIII(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llllIIIIl[10]) || w.llIIllIllIll(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llllIIIIl[17])) {
                g.a(cG);
            }
            if (w.llIIllIllIll(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llllIIIIl[6])) {
                if (w.llIIllIllllI(Players.getLocal().getWorldLocation().distanceTo(dF), llllIIIIl[6])) {
                    AccBuilderGWD.c = lllIllllI[llllIIIIl[51]];
                    Movement.walkTo((WorldPoint)dF);

                    Time.sleepTicks((int)llllIIIIl[0]);

                }
                if (w.llIIllIlllll(Players.getLocal().getWorldLocation().distanceTo(dF), llllIIIIl[6])) {
                    String[] stringArray = new String[llllIIIIl[0]];
                    stringArray[w.llllIIIIl[1]] = lllIllllI[llllIIIIl[52]];
                    if (w.llIIllIlIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        String[] stringArray7 = new String[llllIIIIl[0]];
                        stringArray7[w.llllIIIIl[1]] = lllIllllI[llllIIIIl[53]];
                        Inventory.getFirst((String[])stringArray7).interact(lllIllllI[llllIIIIl[54]]);
                        Time.sleepTicks((int)llllIIIIl[10]);

                    }
                }
            }
            if (w.llIIllIllIll(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llllIIIIl[13])) {
                if (w.llIIllIllllI(Players.getLocal().getWorldLocation().distanceTo(dz), llllIIIIl[5])) {
                    AccBuilderGWD.c = lllIllllI[llllIIIIl[55]];
                    e.a(dz);
                }
                if (w.llIIllIlllll(Players.getLocal().getWorldLocation().distanceTo(dz), llllIIIIl[5])) {
                    AccBuilderGWD.c = lllIllllI[llllIIIIl[56]];
                    g.a(lllIllllI[llllIIIIl[57]], cG);
                }
            }
            if (!w.llIIlllIIIII(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llllIIIIl[18]) || w.llIIllIllIll(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llllIIIIl[2])) {
                if (w.llIIllIllIII(dk, llllIIIIl[0])) {
                    as.pi += llllIIIIl[0];
                    as.u(AccBuilderGWD.m);
                    dk += llllIIIIl[0];
                    as.pi = llllIIIIl[1];
                    dl = llllIIIIl[1];
                }
                String[] stringArray = new String[llllIIIIl[0]];
                stringArray[w.llllIIIIl[1]] = lllIllllI[llllIIIIl[58]];
                if (w.llIIllIlIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    if (w.llIIllIlllII(Widgets.get((int)llllIIIIl[59]))) {
                        AccBuilderGWD.c = lllIllllI[llllIIIIl[60]];
                        String[] stringArray8 = new String[llllIIIIl[0]];
                        stringArray8[w.llllIIIIl[1]] = lllIllllI[llllIIIIl[61]];
                        Inventory.getFirst((String[])stringArray8).interact(lllIllllI[llllIIIIl[62]]);
                        Time.sleepTicks((int)llllIIIIl[6]);

                        AccBuilderGWD.c = lllIllllI[llllIIIIl[63]];
                        llIIlIllIIllI = Widgets.get((int)llllIIIIl[59], (int)llllIIIIl[27]);
                        if (w.llIIllIlllII(llIIlIllIIllI)) {
                            llIIlIllIIllI.interact(lllIllllI[llllIIIIl[64]]);
                            Time.sleepTicks((int)llllIIIIl[0]);

                        }
                        if (w.llIIllIlllII(llIIlIllIIlIl = Widgets.get((int)llllIIIIl[59], (int)llllIIIIl[39]))) {
                            llIIlIllIIlIl.interact(lllIllllI[llllIIIIl[65]]);
                            Time.sleepTicks((int)llllIIIIl[5]);

                        }
                    }
                    Time.sleepTicks((int)llllIIIIl[0]);

                }
            }
        }
    }

    private static void llIIllIlIlIl() {
        lllIllllI = new String[llllIIIIl[125]];
        w.lllIllllI[w.llllIIIIl[1]] = "Finished buying items, switching back to quest";
        w.lllIllllI[w.llllIIIIl[0]] = "Nav to bank";
        w.lllIllllI[w.llllIIIIl[5]] = "Handling banking";
        w.lllIllllI[w.llllIIIIl[10]] = "We are missing quest supplies, switching to BUYING";
        w.lllIllllI[w.llllIIIIl[6]] = "Eat";
        w.lllIllllI[w.llllIIIIl[13]] = "Drink";
        w.lllIllllI[w.llllIIIIl[17]] = "Nav to start";
        w.lllIllllI[w.llllIIIIl[18]] = "Starting quest";
        w.lllIllllI[w.llllIIIIl[2]] = "Veos";
        w.lllIllllI[w.llllIIIIl[24]] = "Enchanted scroll";
        w.lllIllllI[w.llllIIIIl[12]] = "Feather";
        w.lllIllllI[w.llllIIIIl[25]] = "Enchanted quill";
        w.lllIllllI[w.llllIIIIl[15]] = "Enchanted scroll";
        w.lllIllllI[w.llllIIIIl[26]] = "Feather";
        w.lllIllllI[w.llllIIIIl[27]] = "Enchanted quill";
        w.lllIllllI[w.llllIIIIl[28]] = "Nav to pisc tile";
        w.lllIllllI[w.llllIIIIl[29]] = "Talking pisc";
        w.lllIllllI[w.llllIIIIl[30]] = "Leenz";
        w.lllIllllI[w.llllIIIIl[31]] = "Finished pisc";
        w.lllIllllI[w.llllIIIIl[32]] = "Nav to arc tile";
        w.lllIllllI[w.llllIIIIl[33]] = "Talking arc";
        w.lllIllllI[w.llllIIIIl[34]] = "Regath";
        w.lllIllllI[w.llllIIIIl[35]] = "Finished arc";
        w.lllIllllI[w.llllIIIIl[36]] = "Nav to lova tile";
        w.lllIllllI[w.llllIIIIl[37]] = "Talking lova";
        w.lllIllllI[w.llllIIIIl[38]] = "Munty";
        w.lllIllllI[w.llllIIIIl[39]] = "Finished munty";
        w.lllIllllI[w.llllIIIIl[40]] = "Nav to shyzien tile";
        w.lllIllllI[w.llllIIIIl[41]] = "Talking shyzien";
        w.lllIllllI[w.llllIIIIl[42]] = "Jennifer";
        w.lllIllllI[w.llllIIIIl[43]] = "Finished shyzien";
        w.lllIllllI[w.llllIIIIl[44]] = "Nav to hosidius tile";
        w.lllIllllI[w.llllIIIIl[45]] = "Talking hosidius";
        w.lllIllllI[w.llllIIIIl[46]] = "Horace";
        w.lllIllllI[w.llllIIIIl[47]] = "Finished hosidius";
        w.lllIllllI[w.llllIIIIl[48]] = "Nav to start";
        w.lllIllllI[w.llllIIIIl[49]] = "talking veos";
        w.lllIllllI[w.llllIIIIl[50]] = "Veos";
        w.lllIllllI[w.llllIIIIl[51]] = "Nav to dark altar";
        w.lllIllllI[w.llllIIIIl[52]] = "Mysterious orb";
        w.lllIllllI[w.llllIIIIl[53]] = "Mysterious orb";
        w.lllIllllI[w.llllIIIIl[54]] = "Activate";
        w.lllIllllI[w.llllIIIIl[55]] = "Nav to start";
        w.lllIllllI[w.llllIIIIl[56]] = "talking veos";
        w.lllIllllI[w.llllIIIIl[57]] = "Veos";
        w.lllIllllI[w.llllIIIIl[58]] = "Antique lamp";
        w.lllIllllI[w.llllIIIIl[60]] = "Rubbing lamp";
        w.lllIllllI[w.llllIIIIl[61]] = "Antique lamp";
        w.lllIllllI[w.llllIIIIl[62]] = "Rub";
        w.lllIllllI[w.llllIIIIl[63]] = "Selecting slayer";
        w.lllIllllI[w.llllIIIIl[64]] = "Slayer";
        w.lllIllllI[w.llllIIIIl[65]] = "Confirm";
        w.lllIllllI[w.llllIIIIl[66]] = "Antique lamp";
        w.lllIllllI[w.llllIIIIl[67]] = "Rubbing lamp";
        w.lllIllllI[w.llllIIIIl[68]] = "Antique lamp";
        w.lllIllllI[w.llllIIIIl[69]] = "Rub";
        w.lllIllllI[w.llllIIIIl[70]] = "Selecting slayer";
        w.lllIllllI[w.llllIIIIl[71]] = "Slayer";
        w.lllIllllI[w.llllIIIIl[72]] = "Confirm";
        w.lllIllllI[w.llllIIIIl[73]] = "Feather";
        w.lllIllllI[w.llllIIIIl[78]] = "Client of Kourend";
        w.lllIllllI[w.llllIIIIl[79]] = "Antique lamp";
        w.lllIllllI[w.llllIIIIl[80]] = "ring of wealth (";
        w.lllIllllI[w.llllIIIIl[81]] = "Can I ask you about Hosidius?";
        w.lllIllllI[w.llllIIIIl[82]] = "let's trade.";
        w.lllIllllI[w.llllIIIIl[16]] = "Let's trade.";
        w.lllIllllI[w.llllIIIIl[83]] = "Can I ask you about Shayzien?";
        w.lllIllllI[w.llllIIIIl[84]] = "Let's trade.";
        w.lllIllllI[w.llllIIIIl[85]] = "Can I ask you about Lovakengj?";
        w.lllIllllI[w.llllIIIIl[86]] = "Let's trade.";
        w.lllIllllI[w.llllIIIIl[87]] = "Can I ask you about Arceuus?";
        w.lllIllllI[w.llllIIIIl[88]] = "I don't need anything.";
        w.lllIllllI[w.llllIIIIl[89]] = "Can I ask you about Port Piscarilius?";
        w.lllIllllI[w.llllIIIIl[90]] = "I don't need anything right now.";
        w.lllIllllI[w.llllIIIIl[105]] = "Have you got any quests for me?";
        w.lllIllllI[w.llllIIIIl[106]] = "Yes.";
        w.lllIllllI[w.llllIIIIl[107]] = "yes.";
        w.lllIllllI[w.llllIIIIl[108]] = "Can I ask you about Port Piscarilius?";
        w.lllIllllI[w.llllIIIIl[109]] = "Why should I gain favour with Port Piscarilius?";
        w.lllIllllI[w.llllIIIIl[110]] = "Can I ask you about Port Arceuus?";
        w.lllIllllI[w.llllIIIIl[111]] = "Can I ask you about Arceuus?";
        w.lllIllllI[w.llllIIIIl[112]] = "Why should I gain favour with Arceuus?";
        w.lllIllllI[w.llllIIIIl[113]] = "Can I ask you about Lovakengj?";
        w.lllIllllI[w.llllIIIIl[114]] = "Why should I gain favour with Lovakengj?";
        w.lllIllllI[w.llllIIIIl[115]] = "Can I ask you about Shayzien?";
        w.lllIllllI[w.llllIIIIl[116]] = "Why should I gain favour with Shayzien?";
        w.lllIllllI[w.llllIIIIl[117]] = "Can I ask you about Hosidius?";
        w.lllIllllI[w.llllIIIIl[118]] = "Why should I gain favour with Hosidius?";
        w.lllIllllI[w.llllIIIIl[119]] = "What is there to do in Port Piscarilius?";
        w.lllIllllI[w.llllIIIIl[120]] = "What is there to do in Arceuus?";
        w.lllIllllI[w.llllIIIIl[121]] = "What is there to do in Lovakengj?";
        w.lllIllllI[w.llllIIIIl[122]] = "What is there to do in Shayzien?";
        w.lllIllllI[w.llllIIIIl[123]] = "What is there to do in Hosidius?";
        w.lllIllllI[w.llllIIIIl[124]] = "Let's talk about your client...";
    }

    private static boolean llIIllIlllll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llIIllIllIll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIIllIllllI(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        String[] stringArray = new String[llllIIIIl[0]];
        stringArray[w.llllIIIIl[1]] = lllIllllI[llllIIIIl[73]];
        if (w.llIIllIlllIl(Inventory.getCount((String[])stringArray))) {
            int[] nArray = new int[llllIIIIl[0]];
            nArray[w.llllIIIIl[1]] = llllIIIIl[7];
            if (w.llIIllIlllIl(Inventory.getCount((int[])nArray)) && w.llIIllIlllIl(Inventory.getCount((int[])f.bc))) {
                int[] nArray2 = new int[llllIIIIl[0]];
                nArray2[w.llllIIIIl[1]] = llllIIIIl[8];
                if (w.llIIllIlllIl(Inventory.getCount((int[])nArray2))) {
                    n2 = llllIIIIl[0];

                    if (1 < (0x45 ^ 0x6A ^ (0x10 ^ 0x3B))) return n2 != 0;
                    return ((1 ^ (0x8F ^ 0x88)) & (113 + 28 - -31 + 10 ^ 122 + 58 - 65 + 61 ^ -1)) != 0;
                }
            }
        }
        n2 = llllIIIIl[1];
        return n2 != 0;
    }

    private static boolean llIIllIllIlI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIIllIllIII(int n2, int n3) {
        return n2 < n3;
    }
}

