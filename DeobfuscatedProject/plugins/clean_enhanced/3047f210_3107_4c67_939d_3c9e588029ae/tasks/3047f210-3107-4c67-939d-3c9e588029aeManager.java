/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
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
package gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks;

import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.3047f210-3107-4c67-939d-3c9e588029aeManager;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.3047f210-3107-4c67-939d-3c9e588029aeManager;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.3047f210-3107-4c67-939d-3c9e588029aeManager;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.DHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.3047f210-3107-4c67-939d-3c9e588029aeManager;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.FHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.3047f210-3107-4c67-939d-3c9e588029aeManager;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.IHelper;
import gg.squire.account.AccBuilderTempleTrek;
import java.util.ArrayList;
import java.util.List;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
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

public class 3047f210-3107-4c67-939d-3c9e588029aeManager
implements S {
    private static final  WorldPoint hV;
    private static final  WorldPoint hU;
    private static final  WorldPoint hX;
    static  int ck;

    public static  boolean bs;
    static  boolean cl;
    private static final  WorldPoint hW;
    static  int bS;
    public static final  String[] hT;
    public static  List<d> bu;

    @Override
    public int T() {
        try {
            K.cY();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if ((0x22 ^ 0x26) <= 3) {
            return (0x3C ^ 0x5F) & ~(0x4A ^ 0x29);
        }
        return var2[51];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean aa() {
        int n2;
        int[] nArray = new int[1];
        nArray[0] = var2[11];
        if ((Inventory.contains((int[] != 0)nArray) ? 1 : 0) && (!(Inventory.contains((int[] == 0)f.aQ) ? 1 : 0) || (Equipment.contains((int[] != 0)f.aQ) ? 1 : 0)) && (Inventory.contains((int[] != 0)f.aU) ? 1 : 0)) {
            int[] nArray2 = new int[1];
            nArray2[0] = var2[13];
            if ((Inventory.contains((int[] != 0)nArray2) ? 1 : 0)) {
                int[] nArray3 = new int[1];
                nArray3[0] = 4;
                if ((Inventory.contains((int[] != 0)nArray3) ? 1 : 0)) {
                    n2 = 1;
                    0;
                    if (1 >= 0) return n2 != 0;
                    return ((175 + 179 - 295 + 163 ^ 38 + 9 - 0 + 85) & (87 + 169 - 246 + 192 ^ 135 + 86 - 78 + 1 ^ -1)) != 0;
                }
            }
        }
        n2 = 0;
        return n2 != 0;
    }

    private static void ae() {
        d var3;
        Object var4;
        int[] nArray = new int[1];
        nArray[0] = var2[10];
        if ((Bank.contains((int[] == 0)nArray) ? 1 : 0)) {
            d d2 = new DHelper(var2[10], 1, var2[46]);
            bu.add(d2);
            0;
        }
        int[] nArray2 = new int[1];
        nArray2[0] = 4;
        if ((Bank.contains((int[] == 0)nArray2) ? 1 : 0)) {
            var4 = new DHelper(4, var2[15], var2[47]);
            bu.add((d)var4);
            0;
        }
        if ((Bank.contains(var4 = item -> item.getName( == 0).toLowerCase().contains(var1[var2[53]])) ? 1 : 0)) {
            var3 = new DHelper(var2[48], 8, var2[49]);
            bu.add(var3);
            0;
        }
        int[] nArray3 = new int[1];
        nArray3[0] = var2[11];
        if ((Bank.contains((int[] == 0)nArray3) ? 1 : 0)) {
            var3 = new DHelper(var2[11], var2[15], var2[50]);
            bu.add(var3);
            0;
        }
        int[] nArray4 = new int[1];
        nArray4[0] = var2[13];
        if ((Bank.contains((int[] == 0)nArray4) ? 1 : 0)) {
            var3 = new DHelper(var2[13], var2[31], var2[50]);
            bu.add(var3);
            0;
        }
        int[] nArray5 = new int[1];
        nArray5[0] = var2[12];
        if ((Bank.contains((int[] == 0)nArray5) ? 1 : 0)) {
            var3 = new DHelper(var2[12], 8, i.bp);
            bu.add(var3);
            0;
        }
    }

    private static int var5(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static String var6(String var7, String var8) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var10 = var8.toCharArray();
        int var11 = 0;
        char[] var12 = var7.toCharArray();
        int var13 = var12.length;
        int var14 = 0;
        while (var14 < var13) {
            char var15 = var12[var14];
            var9.append((char)(var15 ^ var10[var11 % var10.length]));
            0;
            ++var11;
            ++var14;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var9);
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    static {
        K.var22();
        K.var23();
        String[] stringArray = new String[var2[23]];
        stringArray[0] = var1[var2[54]];
        stringArray[1] = var1[var2[55]];
        stringArray[3] = var1[var2[56]];
        stringArray[5] = var1[var2[57]];
        stringArray[7] = var1[var2[58]];
        stringArray[8] = var1[var2[59]];
        stringArray[K.var2[14]] = var1[var2[60]];
        stringArray[K.var2[20]] = var1[var2[61]];
        stringArray[K.var2[18]] = var1[var2[62]];
        stringArray[K.var2[21]] = var1[var2[63]];
        stringArray[K.var2[15]] = var1[var2[64]];
        stringArray[K.var2[19]] = var1[var2[65]];
        stringArray[K.var2[22]] = var1[var2[66]];
        hT = stringArray;
        hU = new WorldPoint(var2[16], var2[67], 0);
        hV = new WorldPoint(var2[68], var2[69], 0);
        hW = new WorldPoint(var2[70], var2[71], 0);
        hX = new WorldPoint(var2[72], var2[73], 0);
        bu = new ArrayList<d>();
        bS = 0;
    }

    @Override
    public String U() {
        return var1[var2[52]];
    }

    public static void cY() {
        if (bs != 0) {
            AccBuilderTempleTrek.c = var1[0];
            b.a(bu);
            if ((bu.size() < 1)) {
                System.out.println(var1[1]);
                bs = 0;
            }
        }
        if (bs == 0) {
            NPC var24;
            BankLocation var25;
            if ((Inventory.contains((int[] != 0)f.aU) ? 1 : 0) && (Movement.getRunEnergy() < 2)) {
                Inventory.getFirst((int[])f.aU).interact(var1[3]);
                Time.sleepTicks((int)1);
                0;
            }
            if ((K.var5(e.u( < 0), 70.0))) {
                int[] nArray = new int[1];
                nArray[0] = 4;
                if ((Inventory.contains((int[] != 0)nArray) ? 1 : 0)) {
                    int[] nArray2 = new int[1];
                    nArray2[0] = 4;
                    Inventory.getFirst((int[])nArray2).interact(var1[5]);
                }
            }
            if ((Movement.isRunEnabled( == 0) ? 1 : 0) && (Movement.getRunEnergy( > 0))) {
                Movement.toggleRun();
            }
            if ((K.aa( == 0) ? 1 : 0) && (e.j(6) < 1)) {
                var25 = BankLocation.getNearest();
                if (var25 != null && (var25.getArea( == 0).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = var1[7];
                    a.a(var25);
                    Time.sleepTicks((int)3);
                    0;
                }
                if (var25 != null && (var25.getArea( != 0).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = var1[8];
                    if ((Bank.isOpen( == 0) ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)9);
                        0;
                    }
                    if ((Bank.isOpen( != 0) ? 1 : 0)) {
                        if ((Inventory.getAll( > 0).size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)7);
                            0;
                        }
                        if ((Equipment.getAll( > 0).size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)3);
                            0;
                        }
                        int[] nArray = new int[8];
                        nArray[0] = var2[10];
                        nArray[1] = var2[11];
                        nArray[3] = var2[12];
                        nArray[5] = var2[13];
                        nArray[7] = 4;
                        if ((e.b(nArray == 0) ? 1 : 0)) {
                            K.ae();
                            System.out.println(var1[var2[14]]);
                            bs = 1;
                            return;
                        }
                        Bank.withdraw((int)var2[11], (int)var2[15], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)1);
                        0;
                        Bank.withdraw((int)var2[13], (int)8, (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)1);
                        0;
                        Bank.withdraw((int)var2[10], (int)1, (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)1);
                        0;
                        a.b(f.aU, 1);
                        a.a(4, var2[15]);
                        a.b(f.be, 1);
                    }
                }
            }
            if ((K.aa( != 0) ? 1 : 0) && (e.j(6) < 1)) {
                var25 = new WorldArea(var2[16], var2[17], var2[18], var2[19], 0);
                String[] stringArray = new String[1];
                stringArray[0] = var1[var2[20]];
                var24 = NPCs.getNearest((String[])stringArray);
                if (var24 == null && (Players.getLocal().getWorldLocation().distanceTo(hU) > 5) && (AccBuilderTempleTrek.d == 0)) {
                    AccBuilderTempleTrek.c = var1[var2[18]];
                    if (bS < 1) {
                        e.v();
                        bS += 1;
                    }
                    Movement.walkTo((WorldPoint)hU);
                    0;
                    Time.sleepTicks((int)1);
                    0;
                }
                if var24 != null {
                    AccBuilderTempleTrek.c = var1[var2[21]];
                    g.a(var1[var2[15]], hT, 1);
                }
            }
            if ((e.j(6) == 1)) {
                if ((Players.getLocal().getWorldLocation().distanceTo(hV) > var2[14])) {
                    AccBuilderTempleTrek.c = var1[var2[19]];
                    Movement.walkTo((WorldPoint)hV);
                    0;
                    Time.sleepTicks((int)1);
                    0;
                }
                if ((Players.getLocal().getWorldLocation().distanceTo(hV) <= var2[14])) {
                    AccBuilderTempleTrek.c = var1[var2[22]];
                    String[] stringArray = new String[1];
                    stringArray[0] = var1[var2[23]];
                    var25 = TileObjects.getNearest((String[])stringArray);
                    if var25 != null {
                        String[] stringArray2 = new String[1];
                        stringArray2[0] = var1[var2[24]];
                        if ((var25.hasActionstringArray2)) {
                            var25.interact(var1[var2[25]]);
                            Time.sleepTicks((int)8);
                            0;
                        }
                    }
                    g.a(var1[var2[26]], hT);
                }
            }
            if ((e.j(6) == 3)) {
                if ((Players.getLocal().getWorldLocation().distanceTo(hW) > 3)) {
                    int[] nArray = new int[1];
                    nArray[0] = var2[27];
                    if ((Inventory.contains((int[] != 0)nArray) ? 1 : 0)) {
                        int[] nArray3 = new int[1];
                        nArray3[0] = var2[27];
                        Inventory.getFirst((int[])nArray3).interact(var1[var2[28]]);
                        Time.sleepTicks((int)1);
                        0;
                    }
                    AccBuilderTempleTrek.c = var1[var2[29]];
                    Movement.walkTo((WorldPoint)hW);
                    0;
                    Time.sleepTicks((int)1);
                    0;
                }
                if ((Players.getLocal().getWorldLocation().distanceTo(hW) <= 3)) {
                    AccBuilderTempleTrek.c = var1[var2[30]];
                    String[] stringArray = new String[1];
                    stringArray[0] = var1[var2[31]];
                    var25 = NPCs.getNearest((String[])stringArray);
                    if var25 != null {
                        g.a(var1[var2[32]], hT);
                    }
                    if var25 == null {
                        String[] stringArray3 = new String[1];
                        stringArray3[0] = var1[var2[33]];
                        TileObjects.getNearest((String[])stringArray3).interact(var1[var2[34]]);
                        Time.sleepTicks((int)3);
                        0;
                    }
                }
            }
            if ((e.j(6) == 5)) {
                ck = 0;
                if ((Players.getLocal().getWorldLocation().distanceTo(hX) > 5)) {
                    AccBuilderTempleTrek.c = var1[var2[35]];
                    Movement.walkTo((WorldPoint)hX);
                    0;
                    Time.sleepTicks((int)1);
                    0;
                }
                if ((Players.getLocal().getWorldLocation().distanceTo(hX) <= 5)) {
                    AccBuilderTempleTrek.c = var1[var2[36]];
                    String[] stringArray = new String[1];
                    stringArray[0] = var1[var2[37]];
                    var25 = TileObjects.getNearest((String[])stringArray);
                    if var25 != null {
                        var25.interact(var1[var2[38]]);
                    }
                }
            }
            if ((e.j(6) == 7)) {
                if ((Players.getLocal().getWorldLocation().distanceTo(hW) > 3)) {
                    int[] nArray = new int[1];
                    nArray[0] = var2[27];
                    if ((Inventory.contains((int[] != 0)nArray) ? 1 : 0)) {
                        int[] nArray4 = new int[1];
                        nArray4[0] = var2[27];
                        Inventory.getFirst((int[])nArray4).interact(var1[var2[39]]);
                        Time.sleepTicks((int)1);
                        0;
                    }
                    AccBuilderTempleTrek.c = var1[var2[40]];
                    Movement.walkTo((WorldPoint)hW);
                    0;
                    Time.sleepTicks((int)1);
                    0;
                }
                if ((Players.getLocal().getWorldLocation().distanceTo(hW) <= 3)) {
                    AccBuilderTempleTrek.c = var1[var2[41]];
                    String[] stringArray = new String[1];
                    stringArray[0] = var1[var2[42]];
                    var25 = TileObjects.getNearest((String[])stringArray);
                    if var25 != null {
                        String[] stringArray4 = new String[1];
                        stringArray4[0] = var1[var2[43]];
                        if ((var25.hasActionstringArray4)) {
                            var25.interact(var1[var2[44]]);
                            Time.sleepTicks((int)3);
                            0;
                        }
                        String[] stringArray5 = new String[1];
                        stringArray5[0] = var1[var2[45]];
                        var24 = Inventory.getFirst((String[])stringArray5);
                        if var24 != null {
                            if (ck < 1) {
                                ac.mP += 1;
                                ac.d(AccBuilderTempleTrek.m);
                                ck += 1;
                                ac.mP = 0;
                                cl = 0;
                            }
                            var24.useOn((TileObject)var25);
                            Time.sleepTicks((int)5);
                            0;
                        }
                    }
                }
                g.a(hT);
            }
            g.a(new String[0]);
        }
    }

        catch (Exception var31) {
            var31.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean S() {
        return 0;
    }

    @Override
    public boolean V() {
        boolean bl;
        if ((e.j(6) == 8)) {
            bl = 1;
            0;
            if ((0x2A ^ 0x2F) == 0) {
                return ((0xB7 ^ 0x93) & ~(0x8F ^ 0xAB)) != 0;
            }
        } else {
            bl = 0;
        }
        return bl;
    }
}

