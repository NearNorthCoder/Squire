/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.input.Mouse
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks;

import gg.squire.account.AccBuilderShamans;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.IHelper;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.K;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.ZHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.AHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.BHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.DHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.EHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.FHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.GHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.JHelper;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;

public class XHelper
implements K {
    static  boolean dd;
    public static final  WorldPoint dK;
    
    public static final  WorldPoint dM;
    public static  int dR;
    public static final  WorldPoint dL;
    
    public static final  WorldPoint dN;
    public static final  WorldPoint dH;
    static  ArrayList<Integer> dS;
    public static  int dQ;
    public static final  WorldPoint dO;
    public static final  WorldPoint dJ;
    static  int dc;
    static  String[] cy;
    public static  boolean bn;
    public static final  WorldPoint dI;
    public static  boolean dP;
    public static  List<d> bp;

    private static boolean lIIlIllIlIIII(int n2, int n3) {
        return n2 < n3;
    }

    private static void O() {
        d var1;
        Object var2;
        block10: {
            block9: {
                int[] nArray = new int[lIllIIIllI[0]];
                nArray[x.lIllIIIllI[1]] = lIllIIIllI[14];
                if (x.lIIlIllIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                    d d2 = new DHelper(lIllIIIllI[14], lIllIIIllI[0], lIllIIIllI[142]);
                    bp.add(d2);

                }
                int[] nArray2 = new int[lIllIIIllI[0]];
                nArray2[x.lIllIIIllI[1]] = lIllIIIllI[8];
                if (x.lIIlIllIlIIIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    var2 = new DHelper(lIllIIIllI[8], lIllIIIllI[0], lIllIIIllI[142]);
                    bp.add((DHelper) ar2);

                }
                int[] nArray3 = new int[lIllIIIllI[0]];
                nArray3[x.lIllIIIllI[1]] = lIllIIIllI[11];
                if (x.lIIlIllIlIIIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
                    var2 = new DHelper(lIllIIIllI[11], lIllIIIllI[3], j.bZ);
                    bp.add((DHelper) ar2);

                }
                int[] nArray4 = new int[lIllIIIllI[0]];
                nArray4[x.lIllIIIllI[1]] = lIllIIIllI[12];
                if (x.lIIlIllIlIIIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
                    var2 = new DHelper(lIllIIIllI[12], lIllIIIllI[41], lIllIIIllI[143]);
                    bp.add((DHelper) ar2);

                }
                int[] nArray5 = new int[lIllIIIllI[0]];
                nArray5[x.lIllIIIllI[1]] = lIllIIIllI[9];
                if (!x.lIIlIllIIllll(Bank.contains((int[])nArray5) ? 1 : 0)) break block9;
                int[] nArray6 = new int[lIllIIIllI[0]];
                nArray6[x.lIllIIIllI[1]] = lIllIIIllI[9];
                if (!x.lIIlIllIIllll(Bank.contains((int[])nArray6) ? 1 : 0)) break block10;
                int[] nArray7 = new int[lIllIIIllI[0]];
                nArray7[x.lIllIIIllI[1]] = lIllIIIllI[9];
                if (!x.lIIlIllIlIIII(Bank.getFirst((int[])nArray7).getQuantity(), lIllIIIllI[15])) break block10;
            }
            var2 = new DHelper(lIllIIIllI[9], lIllIIIllI[15], lIllIIIllI[107]);
            bp.add((DHelper) ar2);

        }
        if (x.lIIlIllIlIIIl(Bank.contains((Predicate)(var2 = item -> item.getName().toLowerCase().contains(lIllIIIlII[lIllIIIllI[148]]))) ? 1 : 0)) {
            var1 = new DHelper(lIllIIIllI[144], lIllIIIllI[3], lIllIIIllI[145]);
            bp.add(var1);

        }
        int[] nArray = new int[lIllIIIllI[0]];
        nArray[x.lIllIIIllI[1]] = lIllIIIllI[7];
        if (x.lIIlIllIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            var1 = new DHelper(lIllIIIllI[7], lIllIIIllI[51], lIllIIIllI[146]);
            bp.add(var1);

        }
    }

    private static boolean lIIlIllIlIlIl(int n2) {
        return n2 < 0;
    }

    private static boolean lIIlIllIIllll(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlIllIlIIIl(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean ac() {
        return lIllIIIllI[1];
    }

    static {
        x.lIIlIllIIllIl();
        x.lIIlIllIIllII();
        dH = new WorldPoint(lIllIIIllI[149], lIllIIIllI[150], lIllIIIllI[1]);
        dI = new WorldPoint(lIllIIIllI[151], lIllIIIllI[152], lIllIIIllI[1]);
        dJ = new WorldPoint(lIllIIIllI[25], lIllIIIllI[153], lIllIIIllI[1]);
        dK = new WorldPoint(lIllIIIllI[154], lIllIIIllI[155], lIllIIIllI[1]);
        dL = new WorldPoint(lIllIIIllI[156], lIllIIIllI[152], lIllIIIllI[5]);
        dM = new WorldPoint(lIllIIIllI[157], lIllIIIllI[158], lIllIIIllI[1]);
        dN = new WorldPoint(lIllIIIllI[159], lIllIIIllI[160], lIllIIIllI[1]);
        dO = new WorldPoint(lIllIIIllI[161], lIllIIIllI[162], lIllIIIllI[1]);
        bp = new ArrayList<d>();
        dQ = lIllIIIllI[163];
        dR = lIllIIIllI[164];
        String[] stringArray = new String[lIllIIIllI[31]];
        stringArray[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[165]];
        stringArray[x.lIllIIIllI[0]] = lIllIIIlII[lIllIIIllI[166]];
        stringArray[x.lIllIIIllI[5]] = lIllIIIlII[lIllIIIllI[167]];
        stringArray[x.lIllIIIllI[10]] = lIllIIIlII[lIllIIIllI[168]];
        stringArray[x.lIllIIIllI[6]] = lIllIIIlII[lIllIIIllI[169]];
        stringArray[x.lIllIIIllI[3]] = lIllIIIlII[lIllIIIllI[170]];
        stringArray[x.lIllIIIllI[16]] = lIllIIIlII[lIllIIIllI[171]];
        stringArray[x.lIllIIIllI[17]] = lIllIIIlII[lIllIIIllI[172]];
        stringArray[x.lIllIIIllI[18]] = lIllIIIlII[lIllIIIllI[173]];
        stringArray[x.lIllIIIllI[19]] = lIllIIIlII[lIllIIIllI[174]];
        stringArray[x.lIllIIIllI[13]] = lIllIIIlII[lIllIIIllI[175]];
        stringArray[x.lIllIIIllI[20]] = lIllIIIlII[lIllIIIllI[176]];
        stringArray[x.lIllIIIllI[21]] = lIllIIIlII[lIllIIIllI[177]];
        stringArray[x.lIllIIIllI[22]] = lIllIIIlII[lIllIIIllI[178]];
        stringArray[x.lIllIIIllI[23]] = lIllIIIlII[lIllIIIllI[179]];
        stringArray[x.lIllIIIllI[24]] = lIllIIIlII[lIllIIIllI[180]];
        stringArray[x.lIllIIIllI[27]] = lIllIIIlII[lIllIIIllI[181]];
        stringArray[x.lIllIIIllI[28]] = lIllIIIlII[lIllIIIllI[182]];
        stringArray[x.lIllIIIllI[29]] = lIllIIIlII[lIllIIIllI[183]];
        stringArray[x.lIllIIIllI[30]] = lIllIIIlII[lIllIIIllI[184]];
        cy = stringArray;
        dS = new ArrayList();
    }

    private static boolean lIIlIllIlIIll(Object object) {
        return object != null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean al() {
        int n2;
        String[] stringArray = new String[lIllIIIllI[0]];
        stringArray[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[141]];
        if (x.lIIlIllIlIlII(Inventory.getCount((String[])stringArray))) {
            int[] nArray = new int[lIllIIIllI[0]];
            nArray[x.lIllIIIllI[1]] = lIllIIIllI[12];
            if (x.lIIlIllIlIlII(Inventory.getCount((int[])nArray))) {
                int[] nArray2 = new int[lIllIIIllI[0]];
                nArray2[x.lIllIIIllI[1]] = lIllIIIllI[7];
                if (x.lIIlIllIIllll(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                    int[] nArray3 = new int[lIllIIIllI[0]];
                    nArray3[x.lIllIIIllI[1]] = lIllIIIllI[9];
                    if (x.lIIlIllIIllll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                        n2 = lIllIIIllI[0];

                        if (1 > 0) return n2 != 0;
                        return false;
                    }
                }
            }
        }
        n2 = lIllIIIllI[1];
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private static void bm() {
        if (x.lIIlIllIlIllI(Players.getLocal().getWorldLocation().distanceTo(dO), lIllIIIllI[3])) {
            void var3;
            AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[131]];
            WorldArea worldArea = new WorldArea(lIllIIIllI[93], lIllIIIllI[94], lIllIIIllI[60], lIllIIIllI[43], lIllIIIllI[1]);
            if (x.lIIlIllIlIIIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                void var4;
                WorldArea worldArea2 = new WorldArea(lIllIIIllI[95], lIllIIIllI[96], lIllIIIllI[48], lIllIIIllI[63], lIllIIIllI[1]);
                if (x.lIIlIllIlIIIl(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    Movement.walkTo((WorldPoint)new WorldPoint(lIllIIIllI[25], lIllIIIllI[97], lIllIIIllI[1]));

                    Time.sleepTicks((int)lIllIIIllI[0]);

                }
                if (x.lIIlIllIIllll(var4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (x.lIIlIllIlIllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIllIIIllI[25], lIllIIIllI[97], lIllIIIllI[1])), lIllIIIllI[3])) {
                        Movement.walkTo((WorldPoint)new WorldPoint(lIllIIIllI[25], lIllIIIllI[97], lIllIIIllI[1]));

                        Time.sleepTicks((int)lIllIIIllI[0]);

                    }
                    if (x.lIIlIllIlIlll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIllIIIllI[25], lIllIIIllI[97], lIllIIIllI[1])), lIllIIIllI[3])) {
                        String[] stringArray = new String[lIllIIIllI[0]];
                        stringArray[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[2]];
                        TileObject var5 = TileObjects.getNearest((String[])stringArray);
                        if (x.lIIlIllIlIIll(var5)) {
                            String[] stringArray2 = new String[lIllIIIllI[0]];
                            stringArray2[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[132]];
                            if (x.lIIlIllIIllll(var5.hasAction(stringArray2) ? 1 : 0)) {
                                var5.interact(lIllIIIlII[lIllIIIllI[133]]);
                                Time.sleepTicks((int)lIllIIIllI[10]);

                            }
                            String[] stringArray3 = new String[lIllIIIllI[0]];
                            stringArray3[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[134]];
                            if (x.lIIlIllIIllll(var5.hasAction(stringArray3) ? 1 : 0)) {
                                var5.interact(lIllIIIlII[lIllIIIllI[135]]);
                                Time.sleepTicks((int)lIllIIIllI[10]);

                            }
                        }
                    }
                }
            }
            if (x.lIIlIllIIllll(var3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)dO);

                Time.sleepTicks((int)lIllIIIllI[0]);

            }
        }
    }

    private static boolean lIIlIllIlIlll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIIlIllIlIIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIlIllIllIII(Object object) {
        return object == null;
    }

    public static void bk() {
        if (x.lIIlIllIIllll(bn ? 1 : 0)) {
            b.a(bp);
            if (x.lIIlIllIlIIII(bp.size(), lIllIIIllI[0])) {
                System.out.println(lIllIIIlII[lIllIIIllI[1]]);
                bn = lIllIIIllI[1];
            }
        }
        if (x.lIIlIllIlIIIl(bn ? 1 : 0)) {
            TileObject var6;
            TileObject var7;
            BankLocation var8;
            if (x.lIIlIllIlIIII(e.j(lIllIIIllI[2]), lIllIIIllI[3])) {
                I.cJ();
            }
            if (x.lIIlIllIlIIIl(x.bp() ? 1 : 0) && x.lIIlIllIlIIII(e.j(dQ), lIllIIIllI[0]) && x.lIIlIllIlIIlI(e.j(lIllIIIllI[2]), lIllIIIllI[3])) {
                var8 = BankLocation.getNearest();
                if (x.lIIlIllIlIIll(var8) && x.lIIlIllIlIIIl(var8.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[0]];
                    a.a(var8);
                }
                if (x.lIIlIllIlIIll(var8) && x.lIIlIllIIllll(var8.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (x.lIIlIllIlIIIl(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIllIIIllI[4]);

                    }
                    if (x.lIIlIllIIllll(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[5]];
                        if (x.lIIlIllIlIlII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIllIIIllI[6]);

                        }
                        if (x.lIIlIllIlIlII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIllIIIllI[5]);

                        }
                        int[] nArray = new int[lIllIIIllI[3]];
                        nArray[x.lIllIIIllI[1]] = lIllIIIllI[7];
                        nArray[x.lIllIIIllI[0]] = lIllIIIllI[8];
                        nArray[x.lIllIIIllI[5]] = lIllIIIllI[9];
                        nArray[x.lIllIIIllI[10]] = lIllIIIllI[11];
                        nArray[x.lIllIIIllI[6]] = lIllIIIllI[12];
                        if (x.lIIlIllIlIIIl(e.b(nArray) ? 1 : 0)) {
                            x.O();
                            System.out.println(lIllIIIlII[lIllIIIllI[10]]);
                            bn = lIllIIIllI[0];
                            return;
                        }
                        int[] nArray2 = new int[lIllIIIllI[3]];
                        nArray2[x.lIllIIIllI[1]] = lIllIIIllI[7];
                        nArray2[x.lIllIIIllI[0]] = lIllIIIllI[8];
                        nArray2[x.lIllIIIllI[5]] = lIllIIIllI[9];
                        nArray2[x.lIllIIIllI[10]] = lIllIIIllI[11];
                        nArray2[x.lIllIIIllI[6]] = lIllIIIllI[12];
                        if (x.lIIlIllIIllll(e.b(nArray2) ? 1 : 0)) {
                            a.a(lIllIIIllI[7], lIllIIIllI[13]);
                            a.a(lIllIIIllI[14], lIllIIIllI[0]);
                            a.a(lIllIIIllI[8], lIllIIIllI[0]);
                            a.a(lIllIIIllI[11], lIllIIIllI[6]);
                            a.a(lIllIIIllI[12], lIllIIIllI[13]);
                        }
                    }
                }
            }
            if (x.lIIlIllIIllll(Inventory.contains((int[])f.aU) ? 1 : 0) && x.lIIlIllIlIIII(Movement.getRunEnergy(), lIllIIIllI[15])) {
                Inventory.getFirst((int[])f.aU).interact(lIllIIIlII[lIllIIIllI[6]]);
                Time.sleepTicks((int)lIllIIIllI[0]);

            }
            int[] nArray = new int[lIllIIIllI[0]];
            nArray[x.lIllIIIllI[1]] = lIllIIIllI[12];
            if (x.lIIlIllIIllll(Inventory.contains((int[])nArray) ? 1 : 0) && x.lIIlIllIlIlIl(x.lIIlIllIIlllI(e.u(), 60.0))) {
                int[] nArray3 = new int[lIllIIIllI[0]];
                nArray3[x.lIllIIIllI[1]] = lIllIIIllI[12];
                Inventory.getFirst((int[])nArray3).interact(lIllIIIlII[lIllIIIllI[3]]);
                Time.sleepTicks((int)lIllIIIllI[0]);

            }
            if (x.lIIlIllIlIIII(e.j(dQ), lIllIIIllI[0]) && x.lIIlIllIIllll(x.bp() ? 1 : 0)) {
                if (x.lIIlIllIlIllI(Players.getLocal().getWorldLocation().distanceTo(dH), lIllIIIllI[10])) {
                    AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[16]];
                    if (x.lIIlIllIIllll(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo((WorldPoint)dH);

                    Time.sleepTicks((int)lIllIIIllI[0]);

                }
                if (x.lIIlIllIlIlll(Players.getLocal().getWorldLocation().distanceTo(dH), lIllIIIllI[10])) {
                    AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[17]];
                    g.a(lIllIIIlII[lIllIIIllI[18]], cy);
                }
            }
            if (x.lIIlIllIlIIlI(e.j(dQ), lIllIIIllI[0])) {
                if (x.lIIlIllIlIllI(Players.getLocal().getWorldLocation().distanceTo(dI), lIllIIIllI[5])) {
                    AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[19]];
                    Movement.walkTo((WorldPoint)dI);

                    Time.sleepTicks((int)lIllIIIllI[0]);

                }
                if (x.lIIlIllIlIlll(Players.getLocal().getWorldLocation().distanceTo(dI), lIllIIIllI[5])) {
                    AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[13]];
                    if (x.lIIlIllIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                        String[] stringArray = new String[lIllIIIllI[0]];
                        stringArray[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[20]];
                        TileObjects.getNearest((String[])stringArray).interact(lIllIIIlII[lIllIIIllI[21]]);
                    }
                    g.a(cy);
                }
            }
            if (x.lIIlIllIlIIlI(e.j(dQ), lIllIIIllI[5])) {
                String[] stringArray = new String[lIllIIIllI[0]];
                stringArray[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[22]];
                if (x.lIIlIllIllIII(NPCs.getNearest((String[])stringArray))) {
                    AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[23]];
                    String[] stringArray2 = new String[lIllIIIllI[0]];
                    stringArray2[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[24]];
                    var8 = TileObjects.getNearest((String[])stringArray2);
                    if (x.lIIlIllIlIIll(var8) && x.lIIlIllIlIlll(Players.getLocal().getWorldLocation().distanceTo((Locatable)var8), lIllIIIllI[6]) && x.lIIlIllIIllll(Dialog.isOpen() ? 1 : 0)) {
                        g.a(cy);
                    }
                    if (!x.lIIlIllIIllll(Dialog.isOpen() ? 1 : 0) || x.lIIlIllIlIllI(Players.getLocal().distanceTo(new WorldPoint(lIllIIIllI[25], lIllIIIllI[26], lIllIIIllI[1])), lIllIIIllI[3])) {
                        Movement.walkTo((WorldPoint)new WorldPoint(lIllIIIllI[25], lIllIIIllI[26], lIllIIIllI[1]));

                        Time.sleepTicks((int)lIllIIIllI[10]);

                    }
                }
                if (x.lIIlIllIlIlll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIllIIIllI[25], lIllIIIllI[26], lIllIIIllI[1])), lIllIIIllI[3])) {
                    String[] stringArray3 = new String[lIllIIIllI[0]];
                    stringArray3[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[27]];
                    if (x.lIIlIllIllIII(NPCs.getNearest((String[])stringArray3))) {
                        String[] stringArray4 = new String[lIllIIIllI[0]];
                        stringArray4[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[28]];
                        var8 = TileObjects.getNearest((String[])stringArray4);
                        if (x.lIIlIllIlIIll(var8) && x.lIIlIllIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                            String[] stringArray5 = new String[lIllIIIllI[0]];
                            stringArray5[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[29]];
                            if (x.lIIlIllIIllll(var8.hasAction(stringArray5) ? 1 : 0)) {
                                var8.interact(lIllIIIlII[lIllIIIllI[30]]);
                                Time.sleepTicks((int)lIllIIIllI[5]);

                            }
                            String[] stringArray6 = new String[lIllIIIllI[0]];
                            stringArray6[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[31]];
                            if (x.lIIlIllIIllll(var8.hasAction(stringArray6) ? 1 : 0)) {
                                var8.interact(lIllIIIlII[lIllIIIllI[32]]);
                                Time.sleepTicks((int)lIllIIIllI[5]);

                            }
                        }
                        g.a(cy);
                    }
                }
                String[] stringArray7 = new String[lIllIIIllI[0]];
                stringArray7[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[33]];
                if (x.lIIlIllIlIIll(NPCs.getNearest((String[])stringArray7))) {
                    int[] nArray4 = new int[lIllIIIllI[0]];
                    nArray4[x.lIllIIIllI[1]] = lIllIIIllI[14];
                    if (x.lIIlIllIIllll(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                        int[] nArray5 = new int[lIllIIIllI[0]];
                        nArray5[x.lIllIIIllI[1]] = lIllIIIllI[14];
                        if (x.lIIlIllIlIIIl(Equipment.contains((int[])nArray5) ? 1 : 0)) {
                            int[] nArray6 = new int[lIllIIIllI[0]];
                            nArray6[x.lIllIIIllI[1]] = lIllIIIllI[14];
                            Inventory.getFirst((int[])nArray6).interact(lIllIIIlII[lIllIIIllI[34]]);
                        }
                    }
                    if (x.lIIlIllIllIII(Players.getLocal().getInteracting())) {
                        String[] stringArray8 = new String[lIllIIIllI[0]];
                        stringArray8[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[35]];
                        NPCs.getNearest((String[])stringArray8).interact(lIllIIIlII[lIllIIIllI[36]]);
                        Time.sleepTicks((int)lIllIIIllI[5]);

                    }
                }
            }
            if (x.lIIlIllIlIIlI(e.j(dQ), lIllIIIllI[10])) {
                if (x.lIIlIllIlIIIl(dP ? 1 : 0)) {
                    if (x.lIIlIllIlIllI(Players.getLocal().getWorldLocation().distanceTo(dI), lIllIIIllI[5])) {
                        String[] stringArray = new String[lIllIIIllI[0]];
                        stringArray[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[37]];
                        if (x.lIIlIllIlIIll(TileObjects.getNearest((String[])stringArray))) {
                            int[] nArray7 = new int[lIllIIIllI[0]];
                            nArray7[x.lIllIIIllI[1]] = lIllIIIllI[7];
                            if (x.lIIlIllIIllll(Inventory.contains((int[])nArray7) ? 1 : 0)) {
                                int[] nArray8 = new int[lIllIIIllI[0]];
                                nArray8[x.lIllIIIllI[1]] = lIllIIIllI[7];
                                Inventory.getFirst((int[])nArray8).interact(lIllIIIlII[lIllIIIllI[38]]);
                                Time.sleepTicks((int)lIllIIIllI[3]);

                            }
                        }
                        AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[39]];
                        Movement.walkTo((WorldPoint)dI);

                        Time.sleepTicks((int)lIllIIIllI[0]);

                    }
                    if (x.lIIlIllIlIlll(Players.getLocal().getWorldLocation().distanceTo(dI), lIllIIIllI[5])) {
                        AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[40]];
                        if (x.lIIlIllIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                            String[] stringArray = new String[lIllIIIllI[0]];
                            stringArray[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[41]];
                            TileObjects.getNearest((String[])stringArray).interact(lIllIIIlII[lIllIIIllI[42]]);
                        }
                        g.a(cy);
                        if (x.lIIlIllIIllll(Dialog.isOpen() ? 1 : 0) && x.lIIlIllIIllll(Dialog.getText().contains(lIllIIIlII[lIllIIIllI[43]]) ? 1 : 0)) {
                            dP = lIllIIIllI[0];
                        }
                    }
                }
                if (x.lIIlIllIIllll(dP ? 1 : 0)) {
                    if (x.lIIlIllIlIllI(Players.getLocal().getWorldLocation().distanceTo(dH), lIllIIIllI[10])) {
                        AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[44]];
                        Movement.walkTo((WorldPoint)dH);

                        Time.sleepTicks((int)lIllIIIllI[0]);

                    }
                    if (x.lIIlIllIlIlll(Players.getLocal().getWorldLocation().distanceTo(dH), lIllIIIllI[10])) {
                        AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[45]];
                        g.a(lIllIIIlII[lIllIIIllI[46]], cy);
                    }
                }
            }
            if (x.lIIlIllIlIIlI(e.j(dQ), lIllIIIllI[6])) {
                dc = lIllIIIllI[1];
                if (x.lIIlIllIlIIIl(x.al() ? 1 : 0)) {
                    x.bo();
                }
                if (x.lIIlIllIIllll(x.al() ? 1 : 0)) {
                    if (x.lIIlIllIlIllI(Players.getLocal().getWorldLocation().distanceTo(dL), lIllIIIllI[10])) {
                        AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[47]];
                        if (x.lIIlIllIIllll(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        Movement.walkTo((WorldPoint)dL);

                        Time.sleepTicks((int)lIllIIIllI[0]);

                    }
                    if (x.lIIlIllIlIlll(Players.getLocal().getWorldLocation().distanceTo(dL), lIllIIIllI[10])) {
                        AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[48]];
                        if (x.lIIlIllIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                            String[] stringArray = new String[lIllIIIllI[0]];
                            stringArray[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[49]];
                            TileObjects.getNearest((String[])stringArray).interact(lIllIIIlII[lIllIIIllI[50]]);
                        }
                        g.a(cy);
                    }
                }
            }
            if (x.lIIlIllIlIIlI(e.j(dQ), lIllIIIllI[3])) {
                String[] stringArray = new String[lIllIIIllI[0]];
                stringArray[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[51]];
                if (x.lIIlIllIlIIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray9 = new String[lIllIIIllI[0]];
                    stringArray9[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[52]];
                    if (x.lIIlIllIlIIIl(Inventory.contains((String[])stringArray9) ? 1 : 0)) {
                        if (!x.lIIlIllIlIlll(Players.getLocal().getWorldLocation().distanceTo(dM), lIllIIIllI[17]) || x.lIIlIllIIllll(Players.getLocal().getWorldLocation().getPlane())) {
                            AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[53]];
                            Movement.walkTo((WorldPoint)dM);

                            Time.sleepTicks((int)lIllIIIllI[0]);

                        }
                        if (!x.lIIlIllIlIllI(Players.getLocal().getWorldLocation().distanceTo(dM), lIllIIIllI[17]) || x.lIIlIllIlIIIl(Players.getLocal().getWorldLocation().getPlane())) {
                            if (x.lIIlIllIllIII(Players.getLocal().getInteracting())) {
                                int[] nArray9 = new int[lIllIIIllI[0]];
                                nArray9[x.lIllIIIllI[1]] = lIllIIIllI[54];
                                NPCs.getNearest((int[])nArray9).interact(lIllIIIlII[lIllIIIllI[55]]);
                                Time.sleepTicks((int)lIllIIIllI[5]);

                            }
                            String[] stringArray10 = new String[lIllIIIllI[0]];
                            stringArray10[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[56]];
                            var8 = TileItems.getNearest((String[])stringArray10);
                            if (x.lIIlIllIIllll(Inventory.isFull() ? 1 : 0)) {
                                int[] nArray10 = new int[lIllIIIllI[0]];
                                nArray10[x.lIllIIIllI[1]] = lIllIIIllI[12];
                                Inventory.getFirst((int[])nArray10).interact(lIllIIIlII[lIllIIIllI[57]]);
                                Time.sleepTicks((int)lIllIIIllI[0]);

                            }
                            if (x.lIIlIllIlIIll(var8)) {
                                var8.interact(lIllIIIlII[lIllIIIllI[58]]);
                                Time.sleepTicks((int)lIllIIIllI[5]);

                            }
                        }
                    }
                }
                String[] stringArray11 = new String[lIllIIIllI[0]];
                stringArray11[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[59]];
                if (x.lIIlIllIIllll(Inventory.contains((String[])stringArray11) ? 1 : 0)) {
                    if (x.lIIlIllIlIllI(Players.getLocal().getWorldLocation().distanceTo(dN), lIllIIIllI[13])) {
                        AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[60]];
                        Movement.walkTo((WorldPoint)dN);

                        Time.sleepTicks((int)lIllIIIllI[0]);

                    }
                    if (x.lIIlIllIlIlll(Players.getLocal().getWorldLocation().distanceTo(dN), lIllIIIllI[13])) {
                        AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[61]];
                        x.bl();
                    }
                }
                String[] stringArray12 = new String[lIllIIIllI[0]];
                stringArray12[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[15]];
                if (x.lIIlIllIIllll(Inventory.contains((String[])stringArray12) ? 1 : 0)) {
                    String[] stringArray13 = new String[lIllIIIllI[0]];
                    stringArray13[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[62]];
                    if (x.lIIlIllIlIIIl(Inventory.contains((String[])stringArray13) ? 1 : 0)) {
                        AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[63]];
                        String[] stringArray14 = new String[lIllIIIllI[0]];
                        stringArray14[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[64]];
                        int[] nArray11 = new int[lIllIIIllI[0]];
                        nArray11[x.lIllIIIllI[1]] = lIllIIIllI[65];
                        Inventory.getFirst((String[])stringArray14).useOn(TileObjects.getNearest((int[])nArray11));
                        Time.sleepTicks((int)lIllIIIllI[6]);

                    }
                }
                String[] stringArray15 = new String[lIllIIIllI[0]];
                stringArray15[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[66]];
                if (x.lIIlIllIIllll(Inventory.contains((String[])stringArray15) ? 1 : 0)) {
                    String[] stringArray16 = new String[lIllIIIllI[0]];
                    stringArray16[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[67]];
                    if (x.lIIlIllIIllll(Inventory.contains((String[])stringArray16) ? 1 : 0)) {
                        if (x.lIIlIllIlIllI(Players.getLocal().getWorldLocation().distanceTo(dL), lIllIIIllI[10])) {
                            AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[68]];
                            if (x.lIIlIllIIllll(Dialog.isOpen() ? 1 : 0)) {
                                Dialog.close();
                            }
                            Movement.walkTo((WorldPoint)dL);

                            Time.sleepTicks((int)lIllIIIllI[0]);

                        }
                        if (x.lIIlIllIlIlll(Players.getLocal().getWorldLocation().distanceTo(dL), lIllIIIllI[10])) {
                            AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[69]];
                            String[] stringArray17 = new String[lIllIIIllI[0]];
                            stringArray17[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[70]];
                            String[] stringArray18 = new String[lIllIIIllI[0]];
                            stringArray18[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[71]];
                            Inventory.getFirst((String[])stringArray17).useOn(TileObjects.getNearest((String[])stringArray18));
                            Time.sleepTicks((int)lIllIIIllI[10]);

                        }
                    }
                }
            }
            if (x.lIIlIllIlIIlI(e.j(dQ), lIllIIIllI[16])) {
                String[] stringArray = new String[lIllIIIllI[0]];
                stringArray[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[72]];
                var8 = NPCs.getNearest((String[])stringArray);
                String[] stringArray19 = new String[lIllIIIllI[0]];
                stringArray19[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[73]];
                if (x.lIIlIllIlIIIl(Inventory.contains((String[])stringArray19) ? 1 : 0) && x.lIIlIllIlIIll(var8)) {
                    if (x.lIIlIllIIllll(Reachable.isInteractable((Locatable)var8) ? 1 : 0)) {
                        AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[74]];
                        g.a(lIllIIIlII[lIllIIIllI[75]], cy);
                    }
                    if (x.lIIlIllIlIIIl(Reachable.isInteractable((Locatable)var8) ? 1 : 0)) {
                        AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[76]];
                        String[] stringArray20 = new String[lIllIIIllI[0]];
                        stringArray20[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[77]];
                        TileObjects.getNearest((String[])stringArray20).interact(lIllIIIlII[lIllIIIllI[78]]);
                        Time.sleepTicks((int)lIllIIIllI[5]);

                    }
                }
                String[] stringArray21 = new String[lIllIIIllI[0]];
                stringArray21[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[79]];
                if (x.lIIlIllIIllll(Inventory.contains((String[])stringArray21) ? 1 : 0)) {
                    String[] stringArray22 = new String[lIllIIIllI[0]];
                    stringArray22[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[80]];
                    var7 = TileObjects.getNearest((String[])stringArray22);
                    if (x.lIIlIllIlIIll(var7)) {
                        if (x.lIIlIllIIllll(Reachable.isInteractable((Locatable)var7) ? 1 : 0)) {
                            AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[81]];
                            String[] stringArray23 = new String[lIllIIIllI[0]];
                            stringArray23[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[82]];
                            Inventory.getFirst((String[])stringArray23).useOn(var7);
                            Time.sleepTicks((int)lIllIIIllI[5]);

                        }
                        if (x.lIIlIllIlIIIl(Reachable.isInteractable((Locatable)var7) ? 1 : 0)) {
                            AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[83]];
                            String[] stringArray24 = new String[lIllIIIllI[0]];
                            stringArray24[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[84]];
                            TileObjects.getNearest((String[])stringArray24).interact(lIllIIIlII[lIllIIIllI[85]]);
                            Time.sleepTicks((int)lIllIIIllI[5]);

                        }
                    }
                }
            }
            if (x.lIIlIllIlIIlI(e.j(dQ), lIllIIIllI[17])) {
                String[] stringArray = new String[lIllIIIllI[0]];
                stringArray[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[86]];
                var8 = NPCs.getNearest((String[])stringArray);
                if (x.lIIlIllIlIIll(var8)) {
                    if (x.lIIlIllIIllll(Reachable.isInteractable((Locatable)var8) ? 1 : 0)) {
                        AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[87]];
                        g.a(lIllIIIlII[lIllIIIllI[88]], cy);
                    }
                    if (x.lIIlIllIlIIIl(Reachable.isInteractable((Locatable)var8) ? 1 : 0)) {
                        AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[89]];
                        String[] stringArray25 = new String[lIllIIIllI[0]];
                        stringArray25[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[90]];
                        TileObjects.getNearest((String[])stringArray25).interact(lIllIIIlII[lIllIIIllI[91]]);
                        Time.sleepTicks((int)lIllIIIllI[5]);

                    }
                }
            }
            if (x.lIIlIllIlIIlI(e.j(dQ), lIllIIIllI[18])) {
                if (x.lIIlIllIlIllI(Players.getLocal().getWorldLocation().distanceTo(dO), lIllIIIllI[3])) {
                    AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[92]];
                    var8 = new WorldArea(lIllIIIllI[93], lIllIIIllI[94], lIllIIIllI[60], lIllIIIllI[43], lIllIIIllI[1]);
                    if (x.lIIlIllIlIIIl(var8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        var7 = new WorldArea(lIllIIIllI[95], lIllIIIllI[96], lIllIIIllI[48], lIllIIIllI[63], lIllIIIllI[1]);
                        if (x.lIIlIllIlIIIl(var7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            Movement.walkTo((WorldPoint)new WorldPoint(lIllIIIllI[25], lIllIIIllI[97], lIllIIIllI[1]));

                            Time.sleepTicks((int)lIllIIIllI[0]);

                        }
                        if (x.lIIlIllIIllll(var7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            if (x.lIIlIllIlIllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIllIIIllI[25], lIllIIIllI[97], lIllIIIllI[1])), lIllIIIllI[3])) {
                                Movement.walkTo((WorldPoint)new WorldPoint(lIllIIIllI[25], lIllIIIllI[97], lIllIIIllI[1]));

                                Time.sleepTicks((int)lIllIIIllI[0]);

                            }
                            if (x.lIIlIllIlIlll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIllIIIllI[25], lIllIIIllI[97], lIllIIIllI[1])), lIllIIIllI[3])) {
                                String[] stringArray = new String[lIllIIIllI[0]];
                                stringArray[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[98]];
                                var6 = TileObjects.getNearest((String[])stringArray);
                                if (x.lIIlIllIlIIll(var6)) {
                                    String[] stringArray26 = new String[lIllIIIllI[0]];
                                    stringArray26[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[99]];
                                    if (x.lIIlIllIIllll(var6.hasAction(stringArray26) ? 1 : 0)) {
                                        var6.interact(lIllIIIlII[lIllIIIllI[100]]);
                                        Time.sleepTicks((int)lIllIIIllI[10]);

                                    }
                                    String[] stringArray27 = new String[lIllIIIllI[0]];
                                    stringArray27[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[101]];
                                    if (x.lIIlIllIIllll(var6.hasAction(stringArray27) ? 1 : 0)) {
                                        var6.interact(lIllIIIlII[lIllIIIllI[102]]);
                                        Time.sleepTicks((int)lIllIIIllI[10]);

                                    }
                                }
                            }
                        }
                    }
                    if (x.lIIlIllIIllll(var8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)dO);

                        Time.sleepTicks((int)lIllIIIllI[0]);

                    }
                }
                if (x.lIIlIllIlIlll(Players.getLocal().getWorldLocation().distanceTo(dO), lIllIIIllI[3])) {
                    AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[103]];
                    g.a(lIllIIIlII[lIllIIIllI[104]], cy);
                }
            }
            if (x.lIIlIllIllIIl(e.j(dQ), lIllIIIllI[13]) && x.lIIlIllIlIIII(e.j(dQ), lIllIIIllI[72])) {
                if (x.lIIlIllIlIlll(Players.getLocal().getWorldLocation().distanceTo(dO), lIllIIIllI[3])) {
                    String[] stringArray = new String[lIllIIIllI[0]];
                    stringArray[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[105]];
                    if (x.lIIlIllIIllll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[106]];
                        if (x.lIIlIllIlIIII(dc, lIllIIIllI[0])) {
                            Z.lN += lIllIIIllI[0];
                            Z.p(AccBuilderShamans.m);
                            dc += lIllIIIllI[0];
                            Z.lN = lIllIIIllI[1];
                            dd = lIllIIIllI[1];
                        }
                        g.a(lIllIIIlII[lIllIIIllI[107]], cy);
                    }
                }
                String[] stringArray = new String[lIllIIIllI[0]];
                stringArray[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[108]];
                if (x.lIIlIllIlIIIl(Inventory.contains((String[])stringArray) ? 1 : 0) && x.lIIlIllIlIIII(e.j(dQ), lIllIIIllI[72])) {
                    AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[109]];
                    x.bn();
                }
                String[] stringArray28 = new String[lIllIIIllI[0]];
                stringArray28[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[110]];
                if (x.lIIlIllIIllll(Inventory.contains((String[])stringArray28) ? 1 : 0) && x.lIIlIllIlIllI(Players.getLocal().getWorldLocation().distanceTo(dO), lIllIIIllI[3]) && x.lIIlIllIlIllI(Players.getLocal().getWorldLocation().distanceTo(dO), lIllIIIllI[3])) {
                    AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[111]];
                    var8 = new WorldArea(lIllIIIllI[93], lIllIIIllI[94], lIllIIIllI[60], lIllIIIllI[43], lIllIIIllI[1]);
                    if (x.lIIlIllIlIIIl(var8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        var7 = new WorldArea(lIllIIIllI[95], lIllIIIllI[96], lIllIIIllI[48], lIllIIIllI[63], lIllIIIllI[1]);
                        if (x.lIIlIllIlIIIl(var7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            Movement.walkTo((WorldPoint)new WorldPoint(lIllIIIllI[25], lIllIIIllI[97], lIllIIIllI[1]));

                            Time.sleepTicks((int)lIllIIIllI[0]);

                        }
                        if (x.lIIlIllIIllll(var7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            if (x.lIIlIllIlIllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIllIIIllI[25], lIllIIIllI[97], lIllIIIllI[1])), lIllIIIllI[3])) {
                                Movement.walkTo((WorldPoint)new WorldPoint(lIllIIIllI[25], lIllIIIllI[97], lIllIIIllI[1]));

                                Time.sleepTicks((int)lIllIIIllI[0]);

                            }
                            if (x.lIIlIllIlIlll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIllIIIllI[25], lIllIIIllI[97], lIllIIIllI[1])), lIllIIIllI[3])) {
                                String[] stringArray29 = new String[lIllIIIllI[0]];
                                stringArray29[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[112]];
                                var6 = TileObjects.getNearest((String[])stringArray29);
                                if (x.lIIlIllIlIIll(var6)) {
                                    String[] stringArray30 = new String[lIllIIIllI[0]];
                                    stringArray30[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[113]];
                                    if (x.lIIlIllIIllll(var6.hasAction(stringArray30) ? 1 : 0)) {
                                        var6.interact(lIllIIIlII[lIllIIIllI[114]]);
                                        Time.sleepTicks((int)lIllIIIllI[10]);

                                    }
                                    String[] stringArray31 = new String[lIllIIIllI[0]];
                                    stringArray31[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[115]];
                                    if (x.lIIlIllIIllll(var6.hasAction(stringArray31) ? 1 : 0)) {
                                        var6.interact(lIllIIIlII[lIllIIIllI[116]]);
                                        Time.sleepTicks((int)lIllIIIllI[10]);

                                    }
                                }
                            }
                        }
                    }
                    if (x.lIIlIllIIllll(var8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)dO);

                        Time.sleepTicks((int)lIllIIIllI[0]);

                    }
                }
            }
            if (x.lIIlIllIllIIl(e.j(dQ), lIllIIIllI[72]) && x.lIIlIllIlIIII(e.j(dR), lIllIIIllI[3])) {
                AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[117]];
                if (x.lIIlIllIlIllI(Players.getLocal().getWorldLocation().distanceTo(dO), lIllIIIllI[3])) {
                    x.bm();
                }
                if (x.lIIlIllIlIlll(Players.getLocal().getWorldLocation().distanceTo(dO), lIllIIIllI[3])) {
                    if (x.lIIlIllIlIIll(Widgets.get((int)lIllIIIllI[118], (int)lIllIIIllI[27]))) {
                        Mouse.click((int)Widgets.get((int)lIllIIIllI[118], (int)lIllIIIllI[27]).getClickPoint().getX(), (int)Widgets.get((int)lIllIIIllI[118], (int)lIllIIIllI[27]).getClickPoint().getY(), (boolean)lIllIIIllI[0]);
                        Time.sleepTicks((int)lIllIIIllI[10]);

                    }
                    g.a(lIllIIIlII[lIllIIIllI[119]], cy);
                    g.a(cy);
                }
            }
            g.a(cy);
        }
    }

    private static void lIIlIllIIllII() {
        lIllIIIlII = new String[lIllIIIllI[185]];
        x.lIllIIIlII[x.lIllIIIllI[1]] = "Finished buying items, switching back to quest";
        x.lIllIIIlII[x.lIllIIIllI[0]] = "Nav to bank";
        x.lIllIIIlII[x.lIllIIIllI[5]] = "Handling banking";
        x.lIllIIIlII[x.lIllIIIllI[10]] = "We are missing quest supplies, switching to BUYING";
        x.lIllIIIlII[x.lIllIIIllI[6]] = "Drink";
        x.lIllIIIlII[x.lIllIIIllI[3]] = "Eat";
        x.lIllIIIlII[x.lIllIIIllI[16]] = "Nav to start";
        x.lIllIIIlII[x.lIllIIIllI[17]] = "Starting quest";
        x.lIllIIIlII[x.lIllIIIllI[18]] = "King Roald";
        x.lIllIIIlII[x.lIllIIIllI[19]] = "Nav to temple door";
        x.lIllIIIlII[x.lIllIIIllI[13]] = "Interesting door";
        x.lIllIIIlII[x.lIllIIIllI[20]] = "Large door";
        x.lIllIIIlII[x.lIllIIIllI[21]] = "Open";
        x.lIllIIIlII[x.lIllIIIllI[22]] = "Temple Guardian";
        x.lIllIIIlII[x.lIllIIIllI[23]] = "Nav to doggo";
        x.lIllIIIlII[x.lIllIIIllI[24]] = "Trapdoor";
        x.lIllIIIlII[x.lIllIIIllI[27]] = "Temple Guardian";
        x.lIllIIIlII[x.lIllIIIllI[28]] = "Trapdoor";
        x.lIllIIIlII[x.lIllIIIllI[29]] = "Open";
        x.lIllIIIlII[x.lIllIIIllI[30]] = "Open";
        x.lIllIIIlII[x.lIllIIIllI[31]] = "Climb-down";
        x.lIllIIIlII[x.lIllIIIllI[32]] = "Climb-down";
        x.lIllIIIlII[x.lIllIIIllI[33]] = "Temple Guardian";
        x.lIllIIIlII[x.lIllIIIllI[34]] = "Wield";
        x.lIllIIIlII[x.lIllIIIllI[35]] = "Temple Guardian";
        x.lIllIIIlII[x.lIllIIIllI[36]] = "Attack";
        x.lIllIIIlII[x.lIllIIIllI[37]] = "Monument";
        x.lIllIIIlII[x.lIllIIIllI[38]] = "Break";
        x.lIllIIIlII[x.lIllIIIllI[39]] = "Nav to temple door";
        x.lIllIIIlII[x.lIllIIIllI[40]] = "Interacting door";
        x.lIllIIIlII[x.lIllIIIllI[41]] = "Large door";
        x.lIllIIIlII[x.lIllIIIllI[42]] = "Open";
        x.lIllIIIlII[x.lIllIIIllI[43]] = "tell the king";
        x.lIllIIIlII[x.lIllIIIllI[44]] = "Nav to king";
        x.lIllIIIlII[x.lIllIIIllI[45]] = "talk king";
        x.lIllIIIlII[x.lIllIIIllI[46]] = "King Roald";
        x.lIllIIIlII[x.lIllIIIllI[47]] = "Nav to jail";
        x.lIllIIIlII[x.lIllIIIllI[48]] = "Interesting door";
        x.lIllIIIlII[x.lIllIIIllI[49]] = "Cell door";
        x.lIllIIIlII[x.lIllIIIllI[50]] = "Open";
        x.lIllIIIlII[x.lIllIIIllI[51]] = "Golden key";
        x.lIllIIIlII[x.lIllIIIllI[52]] = "Iron key";
        x.lIllIIIlII[x.lIllIIIllI[53]] = "Nav to gold key tile";
        x.lIllIIIlII[x.lIllIIIllI[55]] = "Attack";
        x.lIllIIIlII[x.lIllIIIllI[56]] = "Golden key";
        x.lIllIIIlII[x.lIllIIIllI[57]] = "Eat";
        x.lIllIIIlII[x.lIllIIIllI[58]] = "]DHL";
        x.lIllIIIlII[x.lIllIIIllI[59]] = "Golden key";
        x.lIllIIIlII[x.lIllIIIllI[60]] = "Nav to statues";
        x.lIllIIIlII[x.lIllIIIllI[61]] = "Finding key";
        x.lIllIIIlII[x.lIllIIIllI[15]] = "Iron key";
        x.lIllIIIlII[x.lIllIIIllI[62]] = "Murky water";
        x.lIllIIIlII[x.lIllIIIllI[63]] = "Getting water";
        x.lIllIIIlII[x.lIllIIIllI[64]] = "Bucket";
        x.lIllIIIlII[x.lIllIIIllI[66]] = "Iron key";
        x.lIllIIIlII[x.lIllIIIllI[67]] = "Murky water";
        x.lIllIIIlII[x.lIllIIIllI[68]] = "Nav to jail";
        x.lIllIIIlII[x.lIllIIIllI[69]] = "Interesting door";
        x.lIllIIIlII[x.lIllIIIllI[70]] = "Iron key";
        x.lIllIIIlII[x.lIllIIIllI[71]] = "Cell door";
        x.lIllIIIlII[x.lIllIIIllI[72]] = "Drezel";
        x.lIllIIIlII[x.lIllIIIllI[73]] = "Blessed water";
        x.lIllIIIlII[x.lIllIIIllI[74]] = "Handling chat";
        x.lIllIIIlII[x.lIllIIIllI[75]] = "Drezel";
        x.lIllIIIlII[x.lIllIIIllI[76]] = "Entering cell";
        x.lIllIIIlII[x.lIllIIIllI[77]] = "Cell door";
        x.lIllIIIlII[x.lIllIIIllI[78]] = "Open";
        x.lIllIIIlII[x.lIllIIIllI[79]] = "Blessed water";
        x.lIllIIIlII[x.lIllIIIllI[80]] = "Coffin";
        x.lIllIIIlII[x.lIllIIIllI[81]] = "Using water on coffin";
        x.lIllIIIlII[x.lIllIIIllI[82]] = "Blessed water";
        x.lIllIIIlII[x.lIllIIIllI[83]] = "Exiting cell";
        x.lIllIIIlII[x.lIllIIIllI[84]] = "Cell door";
        x.lIllIIIlII[x.lIllIIIllI[85]] = "Open";
        x.lIllIIIlII[x.lIllIIIllI[86]] = "Drezel";
        x.lIllIIIlII[x.lIllIIIllI[87]] = "Handling chat";
        x.lIllIIIlII[x.lIllIIIllI[88]] = "Drezel";
        x.lIllIIIlII[x.lIllIIIllI[89]] = "Entering cell";
        x.lIllIIIlII[x.lIllIIIllI[90]] = "Cell door";
        x.lIllIIIlII[x.lIllIIIllI[91]] = "Open";
        x.lIllIIIlII[x.lIllIIIllI[92]] = "Nav to final tile";
        x.lIllIIIlII[x.lIllIIIllI[98]] = "Trapdoor";
        x.lIllIIIlII[x.lIllIIIllI[99]] = "Open";
        x.lIllIIIlII[x.lIllIIIllI[100]] = "Open";
        x.lIllIIIlII[x.lIllIIIllI[101]] = "Climb-down";
        x.lIllIIIlII[x.lIllIIIllI[102]] = "Climb-down";
        x.lIllIIIlII[x.lIllIIIllI[103]] = "Handling chat";
        x.lIllIIIlII[x.lIllIIIllI[104]] = "Drezel";
        x.lIllIIIlII[x.lIllIIIllI[105]] = "Pure essence";
        x.lIllIIIlII[x.lIllIIIllI[106]] = "Turning in ess";
        x.lIllIIIlII[x.lIllIIIllI[107]] = "Drezel";
        x.lIllIIIlII[x.lIllIIIllI[108]] = "Pure essence";
        x.lIllIIIlII[x.lIllIIIllI[109]] = "Grabbing more ess";
        x.lIllIIIlII[x.lIllIIIllI[110]] = "Pure essence";
        x.lIllIIIlII[x.lIllIIIllI[111]] = "Nav to final tile";
        x.lIllIIIlII[x.lIllIIIllI[112]] = "Trapdoor";
        x.lIllIIIlII[x.lIllIIIllI[113]] = "Open";
        x.lIllIIIlII[x.lIllIIIllI[114]] = "Open";
        x.lIllIIIlII[x.lIllIIIllI[115]] = "Climb-down";
        x.lIllIIIlII[x.lIllIIIllI[116]] = "Climb-down";
        x.lIllIIIlII[x.lIllIIIllI[117]] = "Finish & Unlock morty/start nature";
        x.lIllIIIlII[x.lIllIIIllI[119]] = "Drezel";
        x.lIllIIIlII[x.lIllIIIllI[127]] = "Iron key";
        x.lIllIIIlII[x.lIllIIIllI[128]] = "Golden key";
        x.lIllIIIlII[x.lIllIIIllI[129]] = "Golden key";
        x.lIllIIIlII[x.lIllIIIllI[130]] = "Iron key";
        x.lIllIIIlII[x.lIllIIIllI[131]] = "Nav to final tile";
        x.lIllIIIlII[x.lIllIIIllI[2]] = "Trapdoor";
        x.lIllIIIlII[x.lIllIIIllI[132]] = "Open";
        x.lIllIIIlII[x.lIllIIIllI[133]] = "Open";
        x.lIllIIIlII[x.lIllIIIllI[134]] = "Climb-down";
        x.lIllIIIlII[x.lIllIIIllI[135]] = "Climb-down";
        x.lIllIIIlII[x.lIllIIIllI[136]] = "Nav to bank";
        x.lIllIIIlII[x.lIllIIIllI[137]] = "Handling banking";
        x.lIllIIIlII[x.lIllIIIllI[138]] = "Nav to bank";
        x.lIllIIIlII[x.lIllIIIllI[139]] = "Handling banking";
        x.lIllIIIlII[x.lIllIIIllI[140]] = "Bucket";
        x.lIllIIIlII[x.lIllIIIllI[141]] = "Bucket";
        x.lIllIIIlII[x.lIllIIIllI[147]] = "Priest In Peril";
        x.lIllIIIlII[x.lIllIIIllI[148]] = "ring of wealth (";
        x.lIllIIIlII[x.lIllIIIllI[165]] = "I'm looking for a quest!";
        x.lIllIIIlII[x.lIllIIIllI[166]] = "Yes.";
        x.lIllIIIlII[x.lIllIIIllI[167]] = "Ok, let me help then.";
        x.lIllIIIlII[x.lIllIIIllI[168]] = "Yep, now tell me what the problem is.";
        x.lIllIIIlII[x.lIllIIIllI[169]] = "Sure.";
        x.lIllIIIlII[x.lIllIIIllI[170]] = "You're right, we don't.";
        x.lIllIIIlII[x.lIllIIIllI[171]] = "Is there anything else interesting to do around here?";
        x.lIllIIIlII[x.lIllIIIllI[172]] = "Well, what is it, I may be able to help?";
        x.lIllIIIlII[x.lIllIIIllI[173]] = "Yes, I'll go and look for him.";
        x.lIllIIIlII[x.lIllIIIllI[174]] = "Yes, I'm sure.";
        x.lIllIIIlII[x.lIllIIIllI[175]] = "I'll get going.";
        x.lIllIIIlII[x.lIllIIIllI[176]] = "Ok, thanks.";
        x.lIllIIIlII[x.lIllIIIllI[177]] = "I think I've solved the puzzle!";
        x.lIllIIIlII[x.lIllIIIllI[178]] = "How can I help?";
        x.lIllIIIlII[x.lIllIIIllI[179]] = "Roald sent me to check on Drezel.";
        x.lIllIIIlII[x.lIllIIIllI[180]] = "Why is the river such a good defence?";
        x.lIllIIIlII[x.lIllIIIllI[181]] = "You're right, we don't.";
        x.lIllIIIlII[x.lIllIIIllI[182]] = "Yes, of course.";
        x.lIllIIIlII[x.lIllIIIllI[183]] = "Do you know of anything I can do in Morytania?";
        x.lIllIIIlII[x.lIllIIIllI[184]] = "Well, what is it, I may be able to help?";
    }

    @Override
    public boolean af() {
        int n2;
        if (x.lIIlIllIllIIl(e.j(dQ), lIllIIIllI[72]) && x.lIIlIllIllIIl(e.j(dR), lIllIIIllI[3])) {
            n2 = lIllIIIllI[0];

            if ((0x64 ^ 0x60) < 0) {
                return false;
            }
        } else {
            n2 = lIllIIIllI[1];
        }
        return n2 != 0;
    }

        return String.valueOf(var9);
    }

    /*
     * WARNING - void declaration
     */
    private static void bo() {
        void var10;
        BankLocation bankLocation = BankLocation.getNearest();
        if (x.lIIlIllIlIIll(bankLocation) && x.lIIlIllIlIIIl(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[138]];
            a.a(bankLocation);
        }
        if (x.lIIlIllIlIIll(var10) && x.lIIlIllIIllll(var10.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (x.lIIlIllIlIIIl(Bank.isOpen() ? 1 : 0)) {
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)lIllIIIllI[4]);

            }
            if (x.lIIlIllIIllll(Bank.isOpen() ? 1 : 0)) {
                AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[139]];
                if (x.lIIlIllIlIlII(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)lIllIIIllI[6]);

                }
                a.a(lIllIIIllI[7], lIllIIIllI[13]);
                a.a(lIllIIIllI[8], lIllIIIllI[0]);
                a.a(lIllIIIllI[11], lIllIIIllI[0]);
                a.a(lIllIIIllI[12], lIllIIIllI[3]);
                a.a(lIllIIIllI[9], lIllIIIllI[41]);
            }
        }
    }

    private static boolean lIIlIllIlIlII(int n2) {
        return n2 > 0;
    }

    private static boolean lIIlIllIlIllI(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean bp() {
        int n2;
        String[] stringArray = new String[lIllIIIllI[0]];
        stringArray[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[140]];
        if (x.lIIlIllIlIlII(Inventory.getCount((String[])stringArray))) {
            int[] nArray = new int[lIllIIIllI[0]];
            nArray[x.lIllIIIllI[1]] = lIllIIIllI[12];
            if (x.lIIlIllIlIlII(Inventory.getCount((int[])nArray))) {
                int[] nArray2 = new int[lIllIIIllI[0]];
                nArray2[x.lIllIIIllI[1]] = lIllIIIllI[11];
                if (x.lIIlIllIlIlII(Inventory.getCount((int[])nArray2))) {
                    int[] nArray3 = new int[lIllIIIllI[0]];
                    nArray3[x.lIllIIIllI[1]] = lIllIIIllI[7];
                    if (x.lIIlIllIIllll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                        n2 = lIllIIIllI[0];

                        if (-(0xBE ^ 0xB4 ^ (0xBD ^ 0xB3)) <= 0) return n2 != 0;
                        return ((11 + 171 - 163 + 215 ^ 161 + 49 - 173 + 125) & (0xB0 ^ 0xBF ^ (0x51 ^ 0x16) ^ -1)) != 0;
                    }
                }
            }
        }
        n2 = lIllIIIllI[1];
        return n2 != 0;
    }

    private static int lIIlIllIIlllI(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    /*
     * WARNING - void declaration
     */
    private static void bn() {
        void var11;
        BankLocation bankLocation = BankLocation.getNearest();
        if (x.lIIlIllIlIIll(bankLocation) && x.lIIlIllIlIIIl(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[136]];
            a.a(bankLocation);
        }
        if (x.lIIlIllIlIIll(var11) && x.lIIlIllIIllll(var11.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (x.lIIlIllIlIIIl(Bank.isOpen() ? 1 : 0)) {
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)lIllIIIllI[4]);

            }
            if (x.lIIlIllIIllll(Bank.isOpen() ? 1 : 0)) {
                AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[137]];
                if (x.lIIlIllIlIlII(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)lIllIIIllI[6]);

                }
                a.a(lIllIIIllI[7], lIllIIIllI[13]);
                a.a(lIllIIIllI[11], lIllIIIllI[0]);
                a.a(lIllIIIllI[9], lIllIIIllI[41]);
            }
        }
    }

    private static void bl() {
        dS.add(lIllIIIllI[120]);

        dS.add(lIllIIIllI[121]);

        dS.add(lIllIIIllI[122]);

        dS.add(lIllIIIllI[123]);

        dS.add(lIllIIIllI[124]);

        dS.add(lIllIIIllI[125]);

        dS.add(lIllIIIllI[126]);

        while (x.lIIlIllIlIIIl(dS.isEmpty() ? 1 : 0) && x.lIIlIllIlIIIl(dS.isEmpty() ? 1 : 0)) {
            String[] stringArray = new String[lIllIIIllI[0]];
            stringArray[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[127]];
            if (x.lIIlIllIIllll(Inventory.contains((String[])stringArray) ? 1 : 0)) {

                if (2 != 3) break;
                return;
            }
            int[] nArray = new int[lIllIIIllI[0]];
            nArray[x.lIllIIIllI[1]] = dS.get(lIllIIIllI[1]);
            TileObject var12 = TileObjects.getNearest((int[])nArray);
            if (x.lIIlIllIlIIll(var12)) {
                String[] stringArray2 = new String[lIllIIIllI[0]];
                stringArray2[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[128]];
                if (x.lIIlIllIIllll(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                    String[] stringArray3 = new String[lIllIIIllI[0]];
                    stringArray3[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[129]];
                    Inventory.getFirst((String[])stringArray3).useOn(var12);
                    Time.sleepTicks((int)lIllIIIllI[3]);

                }
            }
            String[] stringArray4 = new String[lIllIIIllI[0]];
            stringArray4[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[130]];
            if (x.lIIlIllIlIIIl(Inventory.contains((String[])stringArray4) ? 1 : 0)) {
                dS.remove(lIllIIIllI[1]);

                Time.sleepTicks((int)lIllIIIllI[5]);

            }

            if (2 > 0) continue;
            return;
        }
    }

    private static boolean lIIlIllIllIIl(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public String ae() {
        return lIllIIIlII[lIllIIIllI[147]];
    }

    @Override
    public int ad() {
        try {
            x.bk();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (3 > (0 ^ 0x19 ^ (0x93 ^ 0x8E))) {
            return (37 + 40 - -105 + 12 ^ 80 + 79 - 86 + 66) & (0x6F ^ 0x2D ^ (0xAD ^ 0xA6) ^ -1);
        }
        return lIllIIIllI[117];
    }
}

