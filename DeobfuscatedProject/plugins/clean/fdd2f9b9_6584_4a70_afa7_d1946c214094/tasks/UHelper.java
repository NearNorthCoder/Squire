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
package gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks;

import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.EHelper;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.G;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.UHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.AHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.BHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.DHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.EHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.FHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.GHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.IHelper;
import gg.squire.account.AccBuilderRogues;
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

public class UHelper
implements G {
    public static  boolean cX;
    public static final  WorldPoint cU;
    public static final  WorldPoint cW;
    public static  int cY;
    public static final  WorldPoint cS;
    public static final  WorldPoint cP;
    static  boolean cl;
    public static final  WorldPoint cQ;
    static  String[] bR;
    public static final  WorldPoint cR;
    public static  List<d> bv;
    
    static  int ck;
    
    static  ArrayList<Integer> da;
    public static final  WorldPoint cT;
    public static  boolean bt;
    public static final  WorldPoint cV;
    public static  int cZ;

    private static boolean lIIIIIlIlIIIl(int n2) {
        return n2 > 0;
    }

    /*
     * WARNING - void declaration
     */
    private static void aQ() {
        void var1;
        BankLocation bankLocation = BankLocation.getNearest();
        if (u.lIIIIIlIlIIII(bankLocation) && u.lIIIIIlIIlllI(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[138]];
            a.a(bankLocation);
        }
        if (u.lIIIIIlIlIIII(var1) && u.lIIIIIlIIllII(var1.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (u.lIIIIIlIIlllI(Bank.isOpen() ? 1 : 0)) {
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)lIIllIlIIl[4]);

            }
            if (u.lIIIIIlIIllII(Bank.isOpen() ? 1 : 0)) {
                AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[139]];
                if (u.lIIIIIlIlIIIl(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)lIIllIlIIl[6]);

                }
                a.a(lIIllIlIIl[7], lIIllIlIIl[13]);
                a.a(lIIllIlIIl[8], lIIllIlIIl[0]);
                a.a(lIIllIlIIl[11], lIIllIlIIl[0]);
                a.a(lIIllIlIIl[12], lIIllIlIIl[3]);
                a.a(lIIllIlIIl[9], lIIllIlIIl[41]);
            }
        }
    }

    private static boolean lIIIIIlIlIIII(Object object) {
        return object != null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean aR() {
        int n2;
        String[] stringArray = new String[lIIllIlIIl[0]];
        stringArray[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[140]];
        if (u.lIIIIIlIlIIIl(Inventory.getCount((String[])stringArray))) {
            int[] nArray = new int[lIIllIlIIl[0]];
            nArray[u.lIIllIlIIl[1]] = lIIllIlIIl[12];
            if (u.lIIIIIlIlIIIl(Inventory.getCount((int[])nArray))) {
                int[] nArray2 = new int[lIIllIlIIl[0]];
                nArray2[u.lIIllIlIIl[1]] = lIIllIlIIl[11];
                if (u.lIIIIIlIlIIIl(Inventory.getCount((int[])nArray2))) {
                    int[] nArray3 = new int[lIIllIlIIl[0]];
                    nArray3[u.lIIllIlIIl[1]] = lIIllIlIIl[7];
                    if (u.lIIIIIlIIllII(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                        n2 = lIIllIlIIl[0];

                        if (2 > 0) return n2 != 0;
                        return false;
                    }
                }
            }
        }
        n2 = lIIllIlIIl[1];
        return n2 != 0;
    }

    private static boolean lIIIIIlIIllIl(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public boolean S() {
        return lIIllIlIIl[1];
    }

    private static void aN() {
        da.add(lIIllIlIIl[120]);

        da.add(lIIllIlIIl[121]);

        da.add(lIIllIlIIl[122]);

        da.add(lIIllIlIIl[123]);

        da.add(lIIllIlIIl[124]);

        da.add(lIIllIlIIl[125]);

        da.add(lIIllIlIIl[126]);

        while (u.lIIIIIlIIlllI(da.isEmpty() ? 1 : 0) && u.lIIIIIlIIlllI(da.isEmpty() ? 1 : 0)) {
            String[] stringArray = new String[lIIllIlIIl[0]];
            stringArray[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[127]];
            if (u.lIIIIIlIIllII(Inventory.contains((String[])stringArray) ? 1 : 0)) {

                if ((0x62 ^ 0x66) == (0x5C ^ 0x58)) break;
                return;
            }
            int[] nArray = new int[lIIllIlIIl[0]];
            nArray[u.lIIllIlIIl[1]] = da.get(lIIllIlIIl[1]);
            TileObject var2 = TileObjects.getNearest((int[])nArray);
            if (u.lIIIIIlIlIIII(var2)) {
                String[] stringArray2 = new String[lIIllIlIIl[0]];
                stringArray2[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[128]];
                if (u.lIIIIIlIIllII(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                    String[] stringArray3 = new String[lIIllIlIIl[0]];
                    stringArray3[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[129]];
                    Inventory.getFirst((String[])stringArray3).useOn(var2);
                    Time.sleepTicks((int)lIIllIlIIl[3]);

                }
            }
            String[] stringArray4 = new String[lIIllIlIIl[0]];
            stringArray4[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[130]];
            if (u.lIIIIIlIIlllI(Inventory.contains((String[])stringArray4) ? 1 : 0)) {
                da.remove(lIIllIlIIl[1]);

                Time.sleepTicks((int)lIIllIlIIl[5]);

            }

            if (((0x7C ^ 0x4D) & ~(0x99 ^ 0xA8)) == 0) continue;
            return;
        }
    }

    private static boolean lIIIIIlIlIlIl(Object object) {
        return object == null;
    }

    @Override
    public int T() {
        try {
            u.aM();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (1 >= (5 ^ 1)) {
            return (0xB9 ^ 0xA0) & ~(0x21 ^ 0x38);
        }
        return lIIllIlIIl[117];
    }

    private static boolean lIIIIIlIlIllI(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ab() {
        int n2;
        String[] stringArray = new String[lIIllIlIIl[0]];
        stringArray[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[141]];
        if (u.lIIIIIlIlIIIl(Inventory.getCount((String[])stringArray))) {
            int[] nArray = new int[lIIllIlIIl[0]];
            nArray[u.lIIllIlIIl[1]] = lIIllIlIIl[12];
            if (u.lIIIIIlIlIIIl(Inventory.getCount((int[])nArray))) {
                int[] nArray2 = new int[lIIllIlIIl[0]];
                nArray2[u.lIIllIlIIl[1]] = lIIllIlIIl[7];
                if (u.lIIIIIlIIllII(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                    int[] nArray3 = new int[lIIllIlIIl[0]];
                    nArray3[u.lIIllIlIIl[1]] = lIIllIlIIl[9];
                    if (u.lIIIIIlIIllII(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                        n2 = lIIllIlIIl[0];

                        if (null == null) return n2 != 0;
                        return ((125 + 162 - 222 + 100 ^ 145 + 136 - 184 + 56) & (0x56 ^ 0x2A ^ (0xCB ^ 0x8B) ^ -1)) != 0;
                    }
                }
            }
        }
        n2 = lIIllIlIIl[1];
        return n2 != 0;
    }

    private static boolean lIIIIIlIlIlII(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public boolean V() {
        int n2;
        if (u.lIIIIIlIlIllI(e.j(cY), lIIllIlIIl[72]) && u.lIIIIIlIlIllI(e.j(cZ), lIIllIlIIl[3])) {
            n2 = lIIllIlIIl[0];

            if (2 != 2) {
                return false;
            }
        } else {
            n2 = lIIllIlIIl[1];
        }
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private static void aP() {
        void var3;
        BankLocation bankLocation = BankLocation.getNearest();
        if (u.lIIIIIlIlIIII(bankLocation) && u.lIIIIIlIIlllI(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[136]];
            a.a(bankLocation);
        }
        if (u.lIIIIIlIlIIII(var3) && u.lIIIIIlIIllII(var3.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (u.lIIIIIlIIlllI(Bank.isOpen() ? 1 : 0)) {
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)lIIllIlIIl[4]);

            }
            if (u.lIIIIIlIIllII(Bank.isOpen() ? 1 : 0)) {
                AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[137]];
                if (u.lIIIIIlIlIIIl(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)lIIllIlIIl[6]);

                }
                a.a(lIIllIlIIl[7], lIIllIlIIl[13]);
                a.a(lIIllIlIIl[11], lIIllIlIIl[0]);
                a.a(lIIllIlIIl[9], lIIllIlIIl[41]);
            }
        }
    }

    private static boolean lIIIIIlIIllII(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIIIlIlIIll(int n2, int n3) {
        return n2 > n3;
    }

        return String.valueOf(var4);
    }

    private static int lIIIIIlIIlIll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    static {
        u.lIIIIIlIIlIlI();
        u.lIIIIIlIIlIIl();
        cP = new WorldPoint(lIIllIlIIl[149], lIIllIlIIl[150], lIIllIlIIl[1]);
        cQ = new WorldPoint(lIIllIlIIl[151], lIIllIlIIl[152], lIIllIlIIl[1]);
        cR = new WorldPoint(lIIllIlIIl[25], lIIllIlIIl[153], lIIllIlIIl[1]);
        cS = new WorldPoint(lIIllIlIIl[154], lIIllIlIIl[155], lIIllIlIIl[1]);
        cT = new WorldPoint(lIIllIlIIl[156], lIIllIlIIl[152], lIIllIlIIl[5]);
        cU = new WorldPoint(lIIllIlIIl[157], lIIllIlIIl[158], lIIllIlIIl[1]);
        cV = new WorldPoint(lIIllIlIIl[159], lIIllIlIIl[160], lIIllIlIIl[1]);
        cW = new WorldPoint(lIIllIlIIl[161], lIIllIlIIl[162], lIIllIlIIl[1]);
        bv = new ArrayList<d>();
        cY = lIIllIlIIl[163];
        cZ = lIIllIlIIl[164];
        String[] stringArray = new String[lIIllIlIIl[31]];
        stringArray[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[165]];
        stringArray[u.lIIllIlIIl[0]] = lIIllIIIIl[lIIllIlIIl[166]];
        stringArray[u.lIIllIlIIl[5]] = lIIllIIIIl[lIIllIlIIl[167]];
        stringArray[u.lIIllIlIIl[10]] = lIIllIIIIl[lIIllIlIIl[168]];
        stringArray[u.lIIllIlIIl[6]] = lIIllIIIIl[lIIllIlIIl[169]];
        stringArray[u.lIIllIlIIl[3]] = lIIllIIIIl[lIIllIlIIl[170]];
        stringArray[u.lIIllIlIIl[16]] = lIIllIIIIl[lIIllIlIIl[171]];
        stringArray[u.lIIllIlIIl[17]] = lIIllIIIIl[lIIllIlIIl[172]];
        stringArray[u.lIIllIlIIl[18]] = lIIllIIIIl[lIIllIlIIl[173]];
        stringArray[u.lIIllIlIIl[19]] = lIIllIIIIl[lIIllIlIIl[174]];
        stringArray[u.lIIllIlIIl[13]] = lIIllIIIIl[lIIllIlIIl[175]];
        stringArray[u.lIIllIlIIl[20]] = lIIllIIIIl[lIIllIlIIl[176]];
        stringArray[u.lIIllIlIIl[21]] = lIIllIIIIl[lIIllIlIIl[177]];
        stringArray[u.lIIllIlIIl[22]] = lIIllIIIIl[lIIllIlIIl[178]];
        stringArray[u.lIIllIlIIl[23]] = lIIllIIIIl[lIIllIlIIl[179]];
        stringArray[u.lIIllIlIIl[24]] = lIIllIIIIl[lIIllIlIIl[180]];
        stringArray[u.lIIllIlIIl[27]] = lIIllIIIIl[lIIllIlIIl[181]];
        stringArray[u.lIIllIlIIl[28]] = lIIllIIIIl[lIIllIlIIl[182]];
        stringArray[u.lIIllIlIIl[29]] = lIIllIIIIl[lIIllIlIIl[183]];
        stringArray[u.lIIllIlIIl[30]] = lIIllIIIIl[lIIllIlIIl[184]];
        bR = stringArray;
        da = new ArrayList();
    }

    /*
     * WARNING - void declaration
     */
    private static void aO() {
        if (u.lIIIIIlIlIIll(Players.getLocal().getWorldLocation().distanceTo(cW), lIIllIlIIl[3])) {
            void var5;
            AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[131]];
            WorldArea worldArea = new WorldArea(lIIllIlIIl[93], lIIllIlIIl[94], lIIllIlIIl[60], lIIllIlIIl[43], lIIllIlIIl[1]);
            if (u.lIIIIIlIIlllI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                void var6;
                WorldArea worldArea2 = new WorldArea(lIIllIlIIl[95], lIIllIlIIl[96], lIIllIlIIl[48], lIIllIlIIl[63], lIIllIlIIl[1]);
                if (u.lIIIIIlIIlllI(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    Movement.walkTo((WorldPoint)new WorldPoint(lIIllIlIIl[25], lIIllIlIIl[97], lIIllIlIIl[1]));

                    Time.sleepTicks((int)lIIllIlIIl[0]);

                }
                if (u.lIIIIIlIIllII(var6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (u.lIIIIIlIlIIll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIllIlIIl[25], lIIllIlIIl[97], lIIllIlIIl[1])), lIIllIlIIl[3])) {
                        Movement.walkTo((WorldPoint)new WorldPoint(lIIllIlIIl[25], lIIllIlIIl[97], lIIllIlIIl[1]));

                        Time.sleepTicks((int)lIIllIlIIl[0]);

                    }
                    if (u.lIIIIIlIlIlII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIllIlIIl[25], lIIllIlIIl[97], lIIllIlIIl[1])), lIIllIlIIl[3])) {
                        String[] stringArray = new String[lIIllIlIIl[0]];
                        stringArray[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[2]];
                        TileObject var7 = TileObjects.getNearest((String[])stringArray);
                        if (u.lIIIIIlIlIIII(var7)) {
                            String[] stringArray2 = new String[lIIllIlIIl[0]];
                            stringArray2[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[132]];
                            if (u.lIIIIIlIIllII(var7.hasAction(stringArray2) ? 1 : 0)) {
                                var7.interact(lIIllIIIIl[lIIllIlIIl[133]]);
                                Time.sleepTicks((int)lIIllIlIIl[10]);

                            }
                            String[] stringArray3 = new String[lIIllIlIIl[0]];
                            stringArray3[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[134]];
                            if (u.lIIIIIlIIllII(var7.hasAction(stringArray3) ? 1 : 0)) {
                                var7.interact(lIIllIIIIl[lIIllIlIIl[135]]);
                                Time.sleepTicks((int)lIIllIlIIl[10]);

                            }
                        }
                    }
                }
            }
            if (u.lIIIIIlIIllII(var5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)cW);

                Time.sleepTicks((int)lIIllIlIIl[0]);

            }
        }
    }

    private static void lIIIIIlIIlIIl() {
        lIIllIIIIl = new String[lIIllIlIIl[185]];
        u.lIIllIIIIl[u.lIIllIlIIl[1]] = "Finished buying items, switching back to quest";
        u.lIIllIIIIl[u.lIIllIlIIl[0]] = "Nav to bank";
        u.lIIllIIIIl[u.lIIllIlIIl[5]] = "Handling banking";
        u.lIIllIIIIl[u.lIIllIlIIl[10]] = "We are missing quest supplies, switching to BUYING";
        u.lIIllIIIIl[u.lIIllIlIIl[6]] = "Drink";
        u.lIIllIIIIl[u.lIIllIlIIl[3]] = "Eat";
        u.lIIllIIIIl[u.lIIllIlIIl[16]] = "Nav to start";
        u.lIIllIIIIl[u.lIIllIlIIl[17]] = "Starting quest";
        u.lIIllIIIIl[u.lIIllIlIIl[18]] = "King Roald";
        u.lIIllIIIIl[u.lIIllIlIIl[19]] = "Nav to temple door";
        u.lIIllIIIIl[u.lIIllIlIIl[13]] = "Interesting door";
        u.lIIllIIIIl[u.lIIllIlIIl[20]] = "Large door";
        u.lIIllIIIIl[u.lIIllIlIIl[21]] = "Open";
        u.lIIllIIIIl[u.lIIllIlIIl[22]] = "Temple Guardian";
        u.lIIllIIIIl[u.lIIllIlIIl[23]] = "Nav to doggo";
        u.lIIllIIIIl[u.lIIllIlIIl[24]] = "Trapdoor";
        u.lIIllIIIIl[u.lIIllIlIIl[27]] = "Temple Guardian";
        u.lIIllIIIIl[u.lIIllIlIIl[28]] = "Trapdoor";
        u.lIIllIIIIl[u.lIIllIlIIl[29]] = "Open";
        u.lIIllIIIIl[u.lIIllIlIIl[30]] = "Open";
        u.lIIllIIIIl[u.lIIllIlIIl[31]] = "Climb-down";
        u.lIIllIIIIl[u.lIIllIlIIl[32]] = "Climb-down";
        u.lIIllIIIIl[u.lIIllIlIIl[33]] = "Temple Guardian";
        u.lIIllIIIIl[u.lIIllIlIIl[34]] = "Wield";
        u.lIIllIIIIl[u.lIIllIlIIl[35]] = "Temple Guardian";
        u.lIIllIIIIl[u.lIIllIlIIl[36]] = "Attack";
        u.lIIllIIIIl[u.lIIllIlIIl[37]] = "Monument";
        u.lIIllIIIIl[u.lIIllIlIIl[38]] = "Break";
        u.lIIllIIIIl[u.lIIllIlIIl[39]] = "Nav to temple door";
        u.lIIllIIIIl[u.lIIllIlIIl[40]] = "Interacting door";
        u.lIIllIIIIl[u.lIIllIlIIl[41]] = "Large door";
        u.lIIllIIIIl[u.lIIllIlIIl[42]] = "Open";
        u.lIIllIIIIl[u.lIIllIlIIl[43]] = "tell the king";
        u.lIIllIIIIl[u.lIIllIlIIl[44]] = "Nav to king";
        u.lIIllIIIIl[u.lIIllIlIIl[45]] = "talk king";
        u.lIIllIIIIl[u.lIIllIlIIl[46]] = "King Roald";
        u.lIIllIIIIl[u.lIIllIlIIl[47]] = "Nav to jail";
        u.lIIllIIIIl[u.lIIllIlIIl[48]] = "Interesting door";
        u.lIIllIIIIl[u.lIIllIlIIl[49]] = "Cell door";
        u.lIIllIIIIl[u.lIIllIlIIl[50]] = "Open";
        u.lIIllIIIIl[u.lIIllIlIIl[51]] = "Golden key";
        u.lIIllIIIIl[u.lIIllIlIIl[52]] = "Iron key";
        u.lIIllIIIIl[u.lIIllIlIIl[53]] = "Nav to gold key tile";
        u.lIIllIIIIl[u.lIIllIlIIl[55]] = "Attack";
        u.lIIllIIIIl[u.lIIllIlIIl[56]] = "Golden key";
        u.lIIllIIIIl[u.lIIllIlIIl[57]] = "Eat";
        u.lIIllIIIIl[u.lIIllIlIIl[58]] = "Take";
        u.lIIllIIIIl[u.lIIllIlIIl[59]] = "Golden key";
        u.lIIllIIIIl[u.lIIllIlIIl[60]] = "Nav to statues";
        u.lIIllIIIIl[u.lIIllIlIIl[61]] = "Finding key";
        u.lIIllIIIIl[u.lIIllIlIIl[15]] = "Iron key";
        u.lIIllIIIIl[u.lIIllIlIIl[62]] = "Murky water";
        u.lIIllIIIIl[u.lIIllIlIIl[63]] = "Getting water";
        u.lIIllIIIIl[u.lIIllIlIIl[64]] = "Bucket";
        u.lIIllIIIIl[u.lIIllIlIIl[66]] = "Iron key";
        u.lIIllIIIIl[u.lIIllIlIIl[67]] = "Murky water";
        u.lIIllIIIIl[u.lIIllIlIIl[68]] = "Nav to jail";
        u.lIIllIIIIl[u.lIIllIlIIl[69]] = "Interesting door";
        u.lIIllIIIIl[u.lIIllIlIIl[70]] = "Iron key";
        u.lIIllIIIIl[u.lIIllIlIIl[71]] = "Cell door";
        u.lIIllIIIIl[u.lIIllIlIIl[72]] = "Drezel";
        u.lIIllIIIIl[u.lIIllIlIIl[73]] = "Blessed water";
        u.lIIllIIIIl[u.lIIllIlIIl[74]] = "Handling chat";
        u.lIIllIIIIl[u.lIIllIlIIl[75]] = "Drezel";
        u.lIIllIIIIl[u.lIIllIlIIl[76]] = "Entering cell";
        u.lIIllIIIIl[u.lIIllIlIIl[77]] = "Cell door";
        u.lIIllIIIIl[u.lIIllIlIIl[78]] = "Open";
        u.lIIllIIIIl[u.lIIllIlIIl[79]] = "Blessed water";
        u.lIIllIIIIl[u.lIIllIlIIl[80]] = "Coffin";
        u.lIIllIIIIl[u.lIIllIlIIl[81]] = "Using water on coffin";
        u.lIIllIIIIl[u.lIIllIlIIl[82]] = "Blessed water";
        u.lIIllIIIIl[u.lIIllIlIIl[83]] = "Exiting cell";
        u.lIIllIIIIl[u.lIIllIlIIl[84]] = "Cell door";
        u.lIIllIIIIl[u.lIIllIlIIl[85]] = "Open";
        u.lIIllIIIIl[u.lIIllIlIIl[86]] = "Drezel";
        u.lIIllIIIIl[u.lIIllIlIIl[87]] = "Handling chat";
        u.lIIllIIIIl[u.lIIllIlIIl[88]] = "Drezel";
        u.lIIllIIIIl[u.lIIllIlIIl[89]] = "Entering cell";
        u.lIIllIIIIl[u.lIIllIlIIl[90]] = "Cell door";
        u.lIIllIIIIl[u.lIIllIlIIl[91]] = "Open";
        u.lIIllIIIIl[u.lIIllIlIIl[92]] = "Nav to final tile";
        u.lIIllIIIIl[u.lIIllIlIIl[98]] = "Trapdoor";
        u.lIIllIIIIl[u.lIIllIlIIl[99]] = "Open";
        u.lIIllIIIIl[u.lIIllIlIIl[100]] = "Open";
        u.lIIllIIIIl[u.lIIllIlIIl[101]] = "Climb-down";
        u.lIIllIIIIl[u.lIIllIlIIl[102]] = "Climb-down";
        u.lIIllIIIIl[u.lIIllIlIIl[103]] = "Handling chat";
        u.lIIllIIIIl[u.lIIllIlIIl[104]] = "Drezel";
        u.lIIllIIIIl[u.lIIllIlIIl[105]] = "Pure essence";
        u.lIIllIIIIl[u.lIIllIlIIl[106]] = "Turning in ess";
        u.lIIllIIIIl[u.lIIllIlIIl[107]] = "Drezel";
        u.lIIllIIIIl[u.lIIllIlIIl[108]] = "Pure essence";
        u.lIIllIIIIl[u.lIIllIlIIl[109]] = "Grabbing more ess";
        u.lIIllIIIIl[u.lIIllIlIIl[110]] = "Pure essence";
        u.lIIllIIIIl[u.lIIllIlIIl[111]] = "Nav to final tile";
        u.lIIllIIIIl[u.lIIllIlIIl[112]] = "Trapdoor";
        u.lIIllIIIIl[u.lIIllIlIIl[113]] = "Open";
        u.lIIllIIIIl[u.lIIllIlIIl[114]] = "Open";
        u.lIIllIIIIl[u.lIIllIlIIl[115]] = "Climb-down";
        u.lIIllIIIIl[u.lIIllIlIIl[116]] = "Climb-down";
        u.lIIllIIIIl[u.lIIllIlIIl[117]] = "Finish & Unlock morty/start nature";
        u.lIIllIIIIl[u.lIIllIlIIl[119]] = "Drezel";
        u.lIIllIIIIl[u.lIIllIlIIl[127]] = "Iron key";
        u.lIIllIIIIl[u.lIIllIlIIl[128]] = "Golden key";
        u.lIIllIIIIl[u.lIIllIlIIl[129]] = "Golden key";
        u.lIIllIIIIl[u.lIIllIlIIl[130]] = "Iron key";
        u.lIIllIIIIl[u.lIIllIlIIl[131]] = "Nav to final tile";
        u.lIIllIIIIl[u.lIIllIlIIl[2]] = "Trapdoor";
        u.lIIllIIIIl[u.lIIllIlIIl[132]] = "Open";
        u.lIIllIIIIl[u.lIIllIlIIl[133]] = "Open";
        u.lIIllIIIIl[u.lIIllIlIIl[134]] = "Climb-down";
        u.lIIllIIIIl[u.lIIllIlIIl[135]] = "Climb-down";
        u.lIIllIIIIl[u.lIIllIlIIl[136]] = "Nav to bank";
        u.lIIllIIIIl[u.lIIllIlIIl[137]] = "Handling banking";
        u.lIIllIIIIl[u.lIIllIlIIl[138]] = "Nav to bank";
        u.lIIllIIIIl[u.lIIllIlIIl[139]] = "Handling banking";
        u.lIIllIIIIl[u.lIIllIlIIl[140]] = "Bucket";
        u.lIIllIIIIl[u.lIIllIlIIl[141]] = "Bucket";
        u.lIIllIIIIl[u.lIIllIlIIl[147]] = "Priest In Peril";
        u.lIIllIIIIl[u.lIIllIlIIl[148]] = "ring of wealth (";
        u.lIIllIIIIl[u.lIIllIlIIl[165]] = "I'm looking for a quest!";
        u.lIIllIIIIl[u.lIIllIlIIl[166]] = "Yes.";
        u.lIIllIIIIl[u.lIIllIlIIl[167]] = "Ok, let me help then.";
        u.lIIllIIIIl[u.lIIllIlIIl[168]] = "Yep, now tell me what the problem is.";
        u.lIIllIIIIl[u.lIIllIlIIl[169]] = "Sure.";
        u.lIIllIIIIl[u.lIIllIlIIl[170]] = "You're right, we don't.";
        u.lIIllIIIIl[u.lIIllIlIIl[171]] = "Is there anything else interesting to do around here?";
        u.lIIllIIIIl[u.lIIllIlIIl[172]] = "Well, what is it, I may be able to help?";
        u.lIIllIIIIl[u.lIIllIlIIl[173]] = "Yes, I'll go and look for him.";
        u.lIIllIIIIl[u.lIIllIlIIl[174]] = "Yes, I'm sure.";
        u.lIIllIIIIl[u.lIIllIlIIl[175]] = "I'll get going.";
        u.lIIllIIIIl[u.lIIllIlIIl[176]] = "Ok, thanks.";
        u.lIIllIIIIl[u.lIIllIlIIl[177]] = "I think I've solved the puzzle!";
        u.lIIllIIIIl[u.lIIllIlIIl[178]] = "How can I help?";
        u.lIIllIIIIl[u.lIIllIlIIl[179]] = "Roald sent me to check on Drezel.";
        u.lIIllIIIIl[u.lIIllIlIIl[180]] = "Why is the river such a good defence?";
        u.lIIllIIIIl[u.lIIllIlIIl[181]] = "You're right, we don't.";
        u.lIIllIIIIl[u.lIIllIlIIl[182]] = "Yes, of course.";
        u.lIIllIIIIl[u.lIIllIlIIl[183]] = "Do you know of anything I can do in Morytania?";
        u.lIIllIIIIl[u.lIIllIlIIl[184]] = "Well, what is it, I may be able to help?";
    }

    public static void aM() {
        if (u.lIIIIIlIIllII(bt ? 1 : 0)) {
            b.a(bv);
            if (u.lIIIIIlIIllIl(bv.size(), lIIllIlIIl[0])) {
                System.out.println(lIIllIIIIl[lIIllIlIIl[1]]);
                bt = lIIllIlIIl[1];
            }
        }
        if (u.lIIIIIlIIlllI(bt ? 1 : 0)) {
            TileObject var8;
            TileObject var9;
            BankLocation var10;
            if (u.lIIIIIlIIllIl(e.j(lIIllIlIIl[2]), lIIllIlIIl[3])) {
                E.ck();
            }
            if (u.lIIIIIlIIlllI(u.aR() ? 1 : 0) && u.lIIIIIlIIllIl(e.j(cY), lIIllIlIIl[0]) && u.lIIIIIlIIllll(e.j(lIIllIlIIl[2]), lIIllIlIIl[3])) {
                var10 = BankLocation.getNearest();
                if (u.lIIIIIlIlIIII(var10) && u.lIIIIIlIIlllI(var10.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[0]];
                    a.a(var10);
                }
                if (u.lIIIIIlIlIIII(var10) && u.lIIIIIlIIllII(var10.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (u.lIIIIIlIIlllI(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIIllIlIIl[4]);

                    }
                    if (u.lIIIIIlIIllII(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[5]];
                        if (u.lIIIIIlIlIIIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIIllIlIIl[6]);

                        }
                        if (u.lIIIIIlIlIIIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIIllIlIIl[5]);

                        }
                        int[] nArray = new int[lIIllIlIIl[3]];
                        nArray[u.lIIllIlIIl[1]] = lIIllIlIIl[7];
                        nArray[u.lIIllIlIIl[0]] = lIIllIlIIl[8];
                        nArray[u.lIIllIlIIl[5]] = lIIllIlIIl[9];
                        nArray[u.lIIllIlIIl[10]] = lIIllIlIIl[11];
                        nArray[u.lIIllIlIIl[6]] = lIIllIlIIl[12];
                        if (u.lIIIIIlIIlllI(e.b(nArray) ? 1 : 0)) {
                            u.af();
                            System.out.println(lIIllIIIIl[lIIllIlIIl[10]]);
                            bt = lIIllIlIIl[0];
                            return;
                        }
                        int[] nArray2 = new int[lIIllIlIIl[3]];
                        nArray2[u.lIIllIlIIl[1]] = lIIllIlIIl[7];
                        nArray2[u.lIIllIlIIl[0]] = lIIllIlIIl[8];
                        nArray2[u.lIIllIlIIl[5]] = lIIllIlIIl[9];
                        nArray2[u.lIIllIlIIl[10]] = lIIllIlIIl[11];
                        nArray2[u.lIIllIlIIl[6]] = lIIllIlIIl[12];
                        if (u.lIIIIIlIIllII(e.b(nArray2) ? 1 : 0)) {
                            a.a(lIIllIlIIl[7], lIIllIlIIl[13]);
                            a.a(lIIllIlIIl[14], lIIllIlIIl[0]);
                            a.a(lIIllIlIIl[8], lIIllIlIIl[0]);
                            a.a(lIIllIlIIl[11], lIIllIlIIl[6]);
                            a.a(lIIllIlIIl[12], lIIllIlIIl[13]);
                        }
                    }
                }
            }
            if (u.lIIIIIlIIllII(Inventory.contains((int[])f.aV) ? 1 : 0) && u.lIIIIIlIIllIl(Movement.getRunEnergy(), lIIllIlIIl[15])) {
                Inventory.getFirst((int[])f.aV).interact(lIIllIIIIl[lIIllIlIIl[6]]);
                Time.sleepTicks((int)lIIllIlIIl[0]);

            }
            int[] nArray = new int[lIIllIlIIl[0]];
            nArray[u.lIIllIlIIl[1]] = lIIllIlIIl[12];
            if (u.lIIIIIlIIllII(Inventory.contains((int[])nArray) ? 1 : 0) && u.lIIIIIlIlIIlI(u.lIIIIIlIIlIll(e.UHelper(), 60.0))) {
                int[] nArray3 = new int[lIIllIlIIl[0]];
                nArray3[u.lIIllIlIIl[1]] = lIIllIlIIl[12];
                Inventory.getFirst((int[])nArray3).interact(lIIllIIIIl[lIIllIlIIl[3]]);
                Time.sleepTicks((int)lIIllIlIIl[0]);

            }
            if (u.lIIIIIlIIllIl(e.j(cY), lIIllIlIIl[0]) && u.lIIIIIlIIllII(u.aR() ? 1 : 0)) {
                if (u.lIIIIIlIlIIll(Players.getLocal().getWorldLocation().distanceTo(cP), lIIllIlIIl[10])) {
                    AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[16]];
                    if (u.lIIIIIlIIllII(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo((WorldPoint)cP);

                    Time.sleepTicks((int)lIIllIlIIl[0]);

                }
                if (u.lIIIIIlIlIlII(Players.getLocal().getWorldLocation().distanceTo(cP), lIIllIlIIl[10])) {
                    AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[17]];
                    g.a(lIIllIIIIl[lIIllIlIIl[18]], bR);
                }
            }
            if (u.lIIIIIlIIllll(e.j(cY), lIIllIlIIl[0])) {
                if (u.lIIIIIlIlIIll(Players.getLocal().getWorldLocation().distanceTo(cQ), lIIllIlIIl[5])) {
                    AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[19]];
                    Movement.walkTo((WorldPoint)cQ);

                    Time.sleepTicks((int)lIIllIlIIl[0]);

                }
                if (u.lIIIIIlIlIlII(Players.getLocal().getWorldLocation().distanceTo(cQ), lIIllIlIIl[5])) {
                    AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[13]];
                    if (u.lIIIIIlIIlllI(Dialog.isOpen() ? 1 : 0)) {
                        String[] stringArray = new String[lIIllIlIIl[0]];
                        stringArray[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[20]];
                        TileObjects.getNearest((String[])stringArray).interact(lIIllIIIIl[lIIllIlIIl[21]]);
                    }
                    g.a(bR);
                }
            }
            if (u.lIIIIIlIIllll(e.j(cY), lIIllIlIIl[5])) {
                String[] stringArray = new String[lIIllIlIIl[0]];
                stringArray[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[22]];
                if (u.lIIIIIlIlIlIl(NPCs.getNearest((String[])stringArray))) {
                    AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[23]];
                    String[] stringArray2 = new String[lIIllIlIIl[0]];
                    stringArray2[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[24]];
                    var10 = TileObjects.getNearest((String[])stringArray2);
                    if (u.lIIIIIlIlIIII(var10) && u.lIIIIIlIlIlII(Players.getLocal().getWorldLocation().distanceTo((Locatable)var10), lIIllIlIIl[6]) && u.lIIIIIlIIllII(Dialog.isOpen() ? 1 : 0)) {
                        g.a(bR);
                    }
                    if (!u.lIIIIIlIIllII(Dialog.isOpen() ? 1 : 0) || u.lIIIIIlIlIIll(Players.getLocal().distanceTo(new WorldPoint(lIIllIlIIl[25], lIIllIlIIl[26], lIIllIlIIl[1])), lIIllIlIIl[3])) {
                        Movement.walkTo((WorldPoint)new WorldPoint(lIIllIlIIl[25], lIIllIlIIl[26], lIIllIlIIl[1]));

                        Time.sleepTicks((int)lIIllIlIIl[10]);

                    }
                }
                if (u.lIIIIIlIlIlII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIllIlIIl[25], lIIllIlIIl[26], lIIllIlIIl[1])), lIIllIlIIl[3])) {
                    String[] stringArray3 = new String[lIIllIlIIl[0]];
                    stringArray3[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[27]];
                    if (u.lIIIIIlIlIlIl(NPCs.getNearest((String[])stringArray3))) {
                        String[] stringArray4 = new String[lIIllIlIIl[0]];
                        stringArray4[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[28]];
                        var10 = TileObjects.getNearest((String[])stringArray4);
                        if (u.lIIIIIlIlIIII(var10) && u.lIIIIIlIIlllI(Dialog.isOpen() ? 1 : 0)) {
                            String[] stringArray5 = new String[lIIllIlIIl[0]];
                            stringArray5[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[29]];
                            if (u.lIIIIIlIIllII(var10.hasAction(stringArray5) ? 1 : 0)) {
                                var10.interact(lIIllIIIIl[lIIllIlIIl[30]]);
                                Time.sleepTicks((int)lIIllIlIIl[5]);

                            }
                            String[] stringArray6 = new String[lIIllIlIIl[0]];
                            stringArray6[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[31]];
                            if (u.lIIIIIlIIllII(var10.hasAction(stringArray6) ? 1 : 0)) {
                                var10.interact(lIIllIIIIl[lIIllIlIIl[32]]);
                                Time.sleepTicks((int)lIIllIlIIl[5]);

                            }
                        }
                        g.a(bR);
                    }
                }
                String[] stringArray7 = new String[lIIllIlIIl[0]];
                stringArray7[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[33]];
                if (u.lIIIIIlIlIIII(NPCs.getNearest((String[])stringArray7))) {
                    int[] nArray4 = new int[lIIllIlIIl[0]];
                    nArray4[u.lIIllIlIIl[1]] = lIIllIlIIl[14];
                    if (u.lIIIIIlIIllII(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                        int[] nArray5 = new int[lIIllIlIIl[0]];
                        nArray5[u.lIIllIlIIl[1]] = lIIllIlIIl[14];
                        if (u.lIIIIIlIIlllI(Equipment.contains((int[])nArray5) ? 1 : 0)) {
                            int[] nArray6 = new int[lIIllIlIIl[0]];
                            nArray6[u.lIIllIlIIl[1]] = lIIllIlIIl[14];
                            Inventory.getFirst((int[])nArray6).interact(lIIllIIIIl[lIIllIlIIl[34]]);
                        }
                    }
                    if (u.lIIIIIlIlIlIl(Players.getLocal().getInteracting())) {
                        String[] stringArray8 = new String[lIIllIlIIl[0]];
                        stringArray8[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[35]];
                        NPCs.getNearest((String[])stringArray8).interact(lIIllIIIIl[lIIllIlIIl[36]]);
                        Time.sleepTicks((int)lIIllIlIIl[5]);

                    }
                }
            }
            if (u.lIIIIIlIIllll(e.j(cY), lIIllIlIIl[10])) {
                if (u.lIIIIIlIIlllI(cX ? 1 : 0)) {
                    if (u.lIIIIIlIlIIll(Players.getLocal().getWorldLocation().distanceTo(cQ), lIIllIlIIl[5])) {
                        String[] stringArray = new String[lIIllIlIIl[0]];
                        stringArray[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[37]];
                        if (u.lIIIIIlIlIIII(TileObjects.getNearest((String[])stringArray))) {
                            int[] nArray7 = new int[lIIllIlIIl[0]];
                            nArray7[u.lIIllIlIIl[1]] = lIIllIlIIl[7];
                            if (u.lIIIIIlIIllII(Inventory.contains((int[])nArray7) ? 1 : 0)) {
                                int[] nArray8 = new int[lIIllIlIIl[0]];
                                nArray8[u.lIIllIlIIl[1]] = lIIllIlIIl[7];
                                Inventory.getFirst((int[])nArray8).interact(lIIllIIIIl[lIIllIlIIl[38]]);
                                Time.sleepTicks((int)lIIllIlIIl[3]);

                            }
                        }
                        AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[39]];
                        Movement.walkTo((WorldPoint)cQ);

                        Time.sleepTicks((int)lIIllIlIIl[0]);

                    }
                    if (u.lIIIIIlIlIlII(Players.getLocal().getWorldLocation().distanceTo(cQ), lIIllIlIIl[5])) {
                        AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[40]];
                        if (u.lIIIIIlIIlllI(Dialog.isOpen() ? 1 : 0)) {
                            String[] stringArray = new String[lIIllIlIIl[0]];
                            stringArray[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[41]];
                            TileObjects.getNearest((String[])stringArray).interact(lIIllIIIIl[lIIllIlIIl[42]]);
                        }
                        g.a(bR);
                        if (u.lIIIIIlIIllII(Dialog.isOpen() ? 1 : 0) && u.lIIIIIlIIllII(Dialog.getText().contains(lIIllIIIIl[lIIllIlIIl[43]]) ? 1 : 0)) {
                            cX = lIIllIlIIl[0];
                        }
                    }
                }
                if (u.lIIIIIlIIllII(cX ? 1 : 0)) {
                    if (u.lIIIIIlIlIIll(Players.getLocal().getWorldLocation().distanceTo(cP), lIIllIlIIl[10])) {
                        AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[44]];
                        Movement.walkTo((WorldPoint)cP);

                        Time.sleepTicks((int)lIIllIlIIl[0]);

                    }
                    if (u.lIIIIIlIlIlII(Players.getLocal().getWorldLocation().distanceTo(cP), lIIllIlIIl[10])) {
                        AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[45]];
                        g.a(lIIllIIIIl[lIIllIlIIl[46]], bR);
                    }
                }
            }
            if (u.lIIIIIlIIllll(e.j(cY), lIIllIlIIl[6])) {
                ck = lIIllIlIIl[1];
                if (u.lIIIIIlIIlllI(u.ab() ? 1 : 0)) {
                    u.aQ();
                }
                if (u.lIIIIIlIIllII(u.ab() ? 1 : 0)) {
                    if (u.lIIIIIlIlIIll(Players.getLocal().getWorldLocation().distanceTo(cT), lIIllIlIIl[10])) {
                        AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[47]];
                        if (u.lIIIIIlIIllII(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        Movement.walkTo((WorldPoint)cT);

                        Time.sleepTicks((int)lIIllIlIIl[0]);

                    }
                    if (u.lIIIIIlIlIlII(Players.getLocal().getWorldLocation().distanceTo(cT), lIIllIlIIl[10])) {
                        AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[48]];
                        if (u.lIIIIIlIIlllI(Dialog.isOpen() ? 1 : 0)) {
                            String[] stringArray = new String[lIIllIlIIl[0]];
                            stringArray[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[49]];
                            TileObjects.getNearest((String[])stringArray).interact(lIIllIIIIl[lIIllIlIIl[50]]);
                        }
                        g.a(bR);
                    }
                }
            }
            if (u.lIIIIIlIIllll(e.j(cY), lIIllIlIIl[3])) {
                String[] stringArray = new String[lIIllIlIIl[0]];
                stringArray[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[51]];
                if (u.lIIIIIlIIlllI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray9 = new String[lIIllIlIIl[0]];
                    stringArray9[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[52]];
                    if (u.lIIIIIlIIlllI(Inventory.contains((String[])stringArray9) ? 1 : 0)) {
                        if (!u.lIIIIIlIlIlII(Players.getLocal().getWorldLocation().distanceTo(cU), lIIllIlIIl[17]) || u.lIIIIIlIIllII(Players.getLocal().getWorldLocation().getPlane())) {
                            AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[53]];
                            Movement.walkTo((WorldPoint)cU);

                            Time.sleepTicks((int)lIIllIlIIl[0]);

                        }
                        if (!u.lIIIIIlIlIIll(Players.getLocal().getWorldLocation().distanceTo(cU), lIIllIlIIl[17]) || u.lIIIIIlIIlllI(Players.getLocal().getWorldLocation().getPlane())) {
                            if (u.lIIIIIlIlIlIl(Players.getLocal().getInteracting())) {
                                int[] nArray9 = new int[lIIllIlIIl[0]];
                                nArray9[u.lIIllIlIIl[1]] = lIIllIlIIl[54];
                                NPCs.getNearest((int[])nArray9).interact(lIIllIIIIl[lIIllIlIIl[55]]);
                                Time.sleepTicks((int)lIIllIlIIl[5]);

                            }
                            String[] stringArray10 = new String[lIIllIlIIl[0]];
                            stringArray10[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[56]];
                            var10 = TileItems.getNearest((String[])stringArray10);
                            if (u.lIIIIIlIIllII(Inventory.isFull() ? 1 : 0)) {
                                int[] nArray10 = new int[lIIllIlIIl[0]];
                                nArray10[u.lIIllIlIIl[1]] = lIIllIlIIl[12];
                                Inventory.getFirst((int[])nArray10).interact(lIIllIIIIl[lIIllIlIIl[57]]);
                                Time.sleepTicks((int)lIIllIlIIl[0]);

                            }
                            if (u.lIIIIIlIlIIII(var10)) {
                                var10.interact(lIIllIIIIl[lIIllIlIIl[58]]);
                                Time.sleepTicks((int)lIIllIlIIl[5]);

                            }
                        }
                    }
                }
                String[] stringArray11 = new String[lIIllIlIIl[0]];
                stringArray11[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[59]];
                if (u.lIIIIIlIIllII(Inventory.contains((String[])stringArray11) ? 1 : 0)) {
                    if (u.lIIIIIlIlIIll(Players.getLocal().getWorldLocation().distanceTo(cV), lIIllIlIIl[13])) {
                        AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[60]];
                        Movement.walkTo((WorldPoint)cV);

                        Time.sleepTicks((int)lIIllIlIIl[0]);

                    }
                    if (u.lIIIIIlIlIlII(Players.getLocal().getWorldLocation().distanceTo(cV), lIIllIlIIl[13])) {
                        AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[61]];
                        u.aN();
                    }
                }
                String[] stringArray12 = new String[lIIllIlIIl[0]];
                stringArray12[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[15]];
                if (u.lIIIIIlIIllII(Inventory.contains((String[])stringArray12) ? 1 : 0)) {
                    String[] stringArray13 = new String[lIIllIlIIl[0]];
                    stringArray13[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[62]];
                    if (u.lIIIIIlIIlllI(Inventory.contains((String[])stringArray13) ? 1 : 0)) {
                        AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[63]];
                        String[] stringArray14 = new String[lIIllIlIIl[0]];
                        stringArray14[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[64]];
                        int[] nArray11 = new int[lIIllIlIIl[0]];
                        nArray11[u.lIIllIlIIl[1]] = lIIllIlIIl[65];
                        Inventory.getFirst((String[])stringArray14).useOn(TileObjects.getNearest((int[])nArray11));
                        Time.sleepTicks((int)lIIllIlIIl[6]);

                    }
                }
                String[] stringArray15 = new String[lIIllIlIIl[0]];
                stringArray15[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[66]];
                if (u.lIIIIIlIIllII(Inventory.contains((String[])stringArray15) ? 1 : 0)) {
                    String[] stringArray16 = new String[lIIllIlIIl[0]];
                    stringArray16[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[67]];
                    if (u.lIIIIIlIIllII(Inventory.contains((String[])stringArray16) ? 1 : 0)) {
                        if (u.lIIIIIlIlIIll(Players.getLocal().getWorldLocation().distanceTo(cT), lIIllIlIIl[10])) {
                            AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[68]];
                            if (u.lIIIIIlIIllII(Dialog.isOpen() ? 1 : 0)) {
                                Dialog.close();
                            }
                            Movement.walkTo((WorldPoint)cT);

                            Time.sleepTicks((int)lIIllIlIIl[0]);

                        }
                        if (u.lIIIIIlIlIlII(Players.getLocal().getWorldLocation().distanceTo(cT), lIIllIlIIl[10])) {
                            AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[69]];
                            String[] stringArray17 = new String[lIIllIlIIl[0]];
                            stringArray17[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[70]];
                            String[] stringArray18 = new String[lIIllIlIIl[0]];
                            stringArray18[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[71]];
                            Inventory.getFirst((String[])stringArray17).useOn(TileObjects.getNearest((String[])stringArray18));
                            Time.sleepTicks((int)lIIllIlIIl[10]);

                        }
                    }
                }
            }
            if (u.lIIIIIlIIllll(e.j(cY), lIIllIlIIl[16])) {
                String[] stringArray = new String[lIIllIlIIl[0]];
                stringArray[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[72]];
                var10 = NPCs.getNearest((String[])stringArray);
                String[] stringArray19 = new String[lIIllIlIIl[0]];
                stringArray19[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[73]];
                if (u.lIIIIIlIIlllI(Inventory.contains((String[])stringArray19) ? 1 : 0) && u.lIIIIIlIlIIII(var10)) {
                    if (u.lIIIIIlIIllII(Reachable.isInteractable((Locatable)var10) ? 1 : 0)) {
                        AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[74]];
                        g.a(lIIllIIIIl[lIIllIlIIl[75]], bR);
                    }
                    if (u.lIIIIIlIIlllI(Reachable.isInteractable((Locatable)var10) ? 1 : 0)) {
                        AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[76]];
                        String[] stringArray20 = new String[lIIllIlIIl[0]];
                        stringArray20[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[77]];
                        TileObjects.getNearest((String[])stringArray20).interact(lIIllIIIIl[lIIllIlIIl[78]]);
                        Time.sleepTicks((int)lIIllIlIIl[5]);

                    }
                }
                String[] stringArray21 = new String[lIIllIlIIl[0]];
                stringArray21[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[79]];
                if (u.lIIIIIlIIllII(Inventory.contains((String[])stringArray21) ? 1 : 0)) {
                    String[] stringArray22 = new String[lIIllIlIIl[0]];
                    stringArray22[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[80]];
                    var9 = TileObjects.getNearest((String[])stringArray22);
                    if (u.lIIIIIlIlIIII(var9)) {
                        if (u.lIIIIIlIIllII(Reachable.isInteractable((Locatable)var9) ? 1 : 0)) {
                            AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[81]];
                            String[] stringArray23 = new String[lIIllIlIIl[0]];
                            stringArray23[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[82]];
                            Inventory.getFirst((String[])stringArray23).useOn(var9);
                            Time.sleepTicks((int)lIIllIlIIl[5]);

                        }
                        if (u.lIIIIIlIIlllI(Reachable.isInteractable((Locatable)var9) ? 1 : 0)) {
                            AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[83]];
                            String[] stringArray24 = new String[lIIllIlIIl[0]];
                            stringArray24[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[84]];
                            TileObjects.getNearest((String[])stringArray24).interact(lIIllIIIIl[lIIllIlIIl[85]]);
                            Time.sleepTicks((int)lIIllIlIIl[5]);

                        }
                    }
                }
            }
            if (u.lIIIIIlIIllll(e.j(cY), lIIllIlIIl[17])) {
                String[] stringArray = new String[lIIllIlIIl[0]];
                stringArray[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[86]];
                var10 = NPCs.getNearest((String[])stringArray);
                if (u.lIIIIIlIlIIII(var10)) {
                    if (u.lIIIIIlIIllII(Reachable.isInteractable((Locatable)var10) ? 1 : 0)) {
                        AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[87]];
                        g.a(lIIllIIIIl[lIIllIlIIl[88]], bR);
                    }
                    if (u.lIIIIIlIIlllI(Reachable.isInteractable((Locatable)var10) ? 1 : 0)) {
                        AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[89]];
                        String[] stringArray25 = new String[lIIllIlIIl[0]];
                        stringArray25[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[90]];
                        TileObjects.getNearest((String[])stringArray25).interact(lIIllIIIIl[lIIllIlIIl[91]]);
                        Time.sleepTicks((int)lIIllIlIIl[5]);

                    }
                }
            }
            if (u.lIIIIIlIIllll(e.j(cY), lIIllIlIIl[18])) {
                if (u.lIIIIIlIlIIll(Players.getLocal().getWorldLocation().distanceTo(cW), lIIllIlIIl[3])) {
                    AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[92]];
                    var10 = new WorldArea(lIIllIlIIl[93], lIIllIlIIl[94], lIIllIlIIl[60], lIIllIlIIl[43], lIIllIlIIl[1]);
                    if (u.lIIIIIlIIlllI(var10.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        var9 = new WorldArea(lIIllIlIIl[95], lIIllIlIIl[96], lIIllIlIIl[48], lIIllIlIIl[63], lIIllIlIIl[1]);
                        if (u.lIIIIIlIIlllI(var9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            Movement.walkTo((WorldPoint)new WorldPoint(lIIllIlIIl[25], lIIllIlIIl[97], lIIllIlIIl[1]));

                            Time.sleepTicks((int)lIIllIlIIl[0]);

                        }
                        if (u.lIIIIIlIIllII(var9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            if (u.lIIIIIlIlIIll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIllIlIIl[25], lIIllIlIIl[97], lIIllIlIIl[1])), lIIllIlIIl[3])) {
                                Movement.walkTo((WorldPoint)new WorldPoint(lIIllIlIIl[25], lIIllIlIIl[97], lIIllIlIIl[1]));

                                Time.sleepTicks((int)lIIllIlIIl[0]);

                            }
                            if (u.lIIIIIlIlIlII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIllIlIIl[25], lIIllIlIIl[97], lIIllIlIIl[1])), lIIllIlIIl[3])) {
                                String[] stringArray = new String[lIIllIlIIl[0]];
                                stringArray[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[98]];
                                var8 = TileObjects.getNearest((String[])stringArray);
                                if (u.lIIIIIlIlIIII(var8)) {
                                    String[] stringArray26 = new String[lIIllIlIIl[0]];
                                    stringArray26[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[99]];
                                    if (u.lIIIIIlIIllII(var8.hasAction(stringArray26) ? 1 : 0)) {
                                        var8.interact(lIIllIIIIl[lIIllIlIIl[100]]);
                                        Time.sleepTicks((int)lIIllIlIIl[10]);

                                    }
                                    String[] stringArray27 = new String[lIIllIlIIl[0]];
                                    stringArray27[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[101]];
                                    if (u.lIIIIIlIIllII(var8.hasAction(stringArray27) ? 1 : 0)) {
                                        var8.interact(lIIllIIIIl[lIIllIlIIl[102]]);
                                        Time.sleepTicks((int)lIIllIlIIl[10]);

                                    }
                                }
                            }
                        }
                    }
                    if (u.lIIIIIlIIllII(var10.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)cW);

                        Time.sleepTicks((int)lIIllIlIIl[0]);

                    }
                }
                if (u.lIIIIIlIlIlII(Players.getLocal().getWorldLocation().distanceTo(cW), lIIllIlIIl[3])) {
                    AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[103]];
                    g.a(lIIllIIIIl[lIIllIlIIl[104]], bR);
                }
            }
            if (u.lIIIIIlIlIllI(e.j(cY), lIIllIlIIl[13]) && u.lIIIIIlIIllIl(e.j(cY), lIIllIlIIl[72])) {
                if (u.lIIIIIlIlIlII(Players.getLocal().getWorldLocation().distanceTo(cW), lIIllIlIIl[3])) {
                    String[] stringArray = new String[lIIllIlIIl[0]];
                    stringArray[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[105]];
                    if (u.lIIIIIlIIllII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[106]];
                        if (u.lIIIIIlIIllIl(ck, lIIllIlIIl[0])) {
                            U.kv += lIIllIlIIl[0];
                            U.o(AccBuilderRogues.m);
                            ck += lIIllIlIIl[0];
                            U.kv = lIIllIlIIl[1];
                            cl = lIIllIlIIl[1];
                        }
                        g.a(lIIllIIIIl[lIIllIlIIl[107]], bR);
                    }
                }
                String[] stringArray = new String[lIIllIlIIl[0]];
                stringArray[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[108]];
                if (u.lIIIIIlIIlllI(Inventory.contains((String[])stringArray) ? 1 : 0) && u.lIIIIIlIIllIl(e.j(cY), lIIllIlIIl[72])) {
                    AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[109]];
                    u.aP();
                }
                String[] stringArray28 = new String[lIIllIlIIl[0]];
                stringArray28[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[110]];
                if (u.lIIIIIlIIllII(Inventory.contains((String[])stringArray28) ? 1 : 0) && u.lIIIIIlIlIIll(Players.getLocal().getWorldLocation().distanceTo(cW), lIIllIlIIl[3]) && u.lIIIIIlIlIIll(Players.getLocal().getWorldLocation().distanceTo(cW), lIIllIlIIl[3])) {
                    AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[111]];
                    var10 = new WorldArea(lIIllIlIIl[93], lIIllIlIIl[94], lIIllIlIIl[60], lIIllIlIIl[43], lIIllIlIIl[1]);
                    if (u.lIIIIIlIIlllI(var10.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        var9 = new WorldArea(lIIllIlIIl[95], lIIllIlIIl[96], lIIllIlIIl[48], lIIllIlIIl[63], lIIllIlIIl[1]);
                        if (u.lIIIIIlIIlllI(var9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            Movement.walkTo((WorldPoint)new WorldPoint(lIIllIlIIl[25], lIIllIlIIl[97], lIIllIlIIl[1]));

                            Time.sleepTicks((int)lIIllIlIIl[0]);

                        }
                        if (u.lIIIIIlIIllII(var9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            if (u.lIIIIIlIlIIll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIllIlIIl[25], lIIllIlIIl[97], lIIllIlIIl[1])), lIIllIlIIl[3])) {
                                Movement.walkTo((WorldPoint)new WorldPoint(lIIllIlIIl[25], lIIllIlIIl[97], lIIllIlIIl[1]));

                                Time.sleepTicks((int)lIIllIlIIl[0]);

                            }
                            if (u.lIIIIIlIlIlII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIllIlIIl[25], lIIllIlIIl[97], lIIllIlIIl[1])), lIIllIlIIl[3])) {
                                String[] stringArray29 = new String[lIIllIlIIl[0]];
                                stringArray29[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[112]];
                                var8 = TileObjects.getNearest((String[])stringArray29);
                                if (u.lIIIIIlIlIIII(var8)) {
                                    String[] stringArray30 = new String[lIIllIlIIl[0]];
                                    stringArray30[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[113]];
                                    if (u.lIIIIIlIIllII(var8.hasAction(stringArray30) ? 1 : 0)) {
                                        var8.interact(lIIllIIIIl[lIIllIlIIl[114]]);
                                        Time.sleepTicks((int)lIIllIlIIl[10]);

                                    }
                                    String[] stringArray31 = new String[lIIllIlIIl[0]];
                                    stringArray31[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[115]];
                                    if (u.lIIIIIlIIllII(var8.hasAction(stringArray31) ? 1 : 0)) {
                                        var8.interact(lIIllIIIIl[lIIllIlIIl[116]]);
                                        Time.sleepTicks((int)lIIllIlIIl[10]);

                                    }
                                }
                            }
                        }
                    }
                    if (u.lIIIIIlIIllII(var10.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)cW);

                        Time.sleepTicks((int)lIIllIlIIl[0]);

                    }
                }
            }
            if (u.lIIIIIlIlIllI(e.j(cY), lIIllIlIIl[72]) && u.lIIIIIlIIllIl(e.j(cZ), lIIllIlIIl[3])) {
                AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[117]];
                if (u.lIIIIIlIlIIll(Players.getLocal().getWorldLocation().distanceTo(cW), lIIllIlIIl[3])) {
                    u.aO();
                }
                if (u.lIIIIIlIlIlII(Players.getLocal().getWorldLocation().distanceTo(cW), lIIllIlIIl[3])) {
                    if (u.lIIIIIlIlIIII(Widgets.get((int)lIIllIlIIl[118], (int)lIIllIlIIl[27]))) {
                        Mouse.click((int)Widgets.get((int)lIIllIlIIl[118], (int)lIIllIlIIl[27]).getClickPoint().getX(), (int)Widgets.get((int)lIIllIlIIl[118], (int)lIIllIlIIl[27]).getClickPoint().getY(), (boolean)lIIllIlIIl[0]);
                        Time.sleepTicks((int)lIIllIlIIl[10]);

                    }
                    g.a(lIIllIIIIl[lIIllIlIIl[119]], bR);
                    g.a(bR);
                }
            }
            g.a(bR);
        }
    }

    private static void af() {
        d var11;
        Object var12;
        block10: {
            block9: {
                int[] nArray = new int[lIIllIlIIl[0]];
                nArray[u.lIIllIlIIl[1]] = lIIllIlIIl[14];
                if (u.lIIIIIlIIlllI(Bank.contains((int[])nArray) ? 1 : 0)) {
                    d d2 = new DHelper(lIIllIlIIl[14], lIIllIlIIl[0], lIIllIlIIl[142]);
                    bv.add(d2);

                }
                int[] nArray2 = new int[lIIllIlIIl[0]];
                nArray2[u.lIIllIlIIl[1]] = lIIllIlIIl[8];
                if (u.lIIIIIlIIlllI(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    var12 = new DHelper(lIIllIlIIl[8], lIIllIlIIl[0], lIIllIlIIl[142]);
                    bv.add((DHelper) ar12);

                }
                int[] nArray3 = new int[lIIllIlIIl[0]];
                nArray3[u.lIIllIlIIl[1]] = lIIllIlIIl[11];
                if (u.lIIIIIlIIlllI(Bank.contains((int[])nArray3) ? 1 : 0)) {
                    var12 = new DHelper(lIIllIlIIl[11], lIIllIlIIl[3], i.bq);
                    bv.add((DHelper) ar12);

                }
                int[] nArray4 = new int[lIIllIlIIl[0]];
                nArray4[u.lIIllIlIIl[1]] = lIIllIlIIl[12];
                if (u.lIIIIIlIIlllI(Bank.contains((int[])nArray4) ? 1 : 0)) {
                    var12 = new DHelper(lIIllIlIIl[12], lIIllIlIIl[41], lIIllIlIIl[143]);
                    bv.add((DHelper) ar12);

                }
                int[] nArray5 = new int[lIIllIlIIl[0]];
                nArray5[u.lIIllIlIIl[1]] = lIIllIlIIl[9];
                if (!u.lIIIIIlIIllII(Bank.contains((int[])nArray5) ? 1 : 0)) break block9;
                int[] nArray6 = new int[lIIllIlIIl[0]];
                nArray6[u.lIIllIlIIl[1]] = lIIllIlIIl[9];
                if (!u.lIIIIIlIIllII(Bank.contains((int[])nArray6) ? 1 : 0)) break block10;
                int[] nArray7 = new int[lIIllIlIIl[0]];
                nArray7[u.lIIllIlIIl[1]] = lIIllIlIIl[9];
                if (!u.lIIIIIlIIllIl(Bank.getFirst((int[])nArray7).getQuantity(), lIIllIlIIl[15])) break block10;
            }
            var12 = new DHelper(lIIllIlIIl[9], lIIllIlIIl[15], lIIllIlIIl[107]);
            bv.add((DHelper) ar12);

        }
        if (u.lIIIIIlIIlllI(Bank.contains((Predicate)(var12 = item -> item.getName().toLowerCase().contains(lIIllIIIIl[lIIllIlIIl[148]]))) ? 1 : 0)) {
            var11 = new DHelper(lIIllIlIIl[144], lIIllIlIIl[3], lIIllIlIIl[145]);
            bv.add(var11);

        }
        int[] nArray = new int[lIIllIlIIl[0]];
        nArray[u.lIIllIlIIl[1]] = lIIllIlIIl[7];
        if (u.lIIIIIlIIlllI(Bank.contains((int[])nArray) ? 1 : 0)) {
            var11 = new DHelper(lIIllIlIIl[7], lIIllIlIIl[51], lIIllIlIIl[146]);
            bv.add(var11);

        }
    }

    private static boolean lIIIIIlIIllll(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public String U() {
        return lIIllIIIIl[lIIllIlIIl[147]];
    }

    private static boolean lIIIIIlIlIIlI(int n2) {
        return n2 < 0;
    }

    private static boolean lIIIIIlIIlllI(int n2) {
        return n2 == 0;
    }
}

