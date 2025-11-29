/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.input.Keyboard
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 */
package gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks;

import gg.squire.account.AccBuilderRat;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.9e609a1b-c462-421a-8c76-4c9774ea7671Manager;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.9e609a1b-c462-421a-8c76-4c9774ea7671Manager;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.9e609a1b-c462-421a-8c76-4c9774ea7671Manager;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.DHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.9e609a1b-c462-421a-8c76-4c9774ea7671Manager;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.FHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.9e609a1b-c462-421a-8c76-4c9774ea7671Manager;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.HHelper;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import net.runelite.api.Item;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;

public class 9e609a1b-c462-421a-8c76-4c9774ea7671Manager
implements M {
    static  int co;
    public static final  WorldPoint hU;
    private static final  String[] hW;
    public static  List<d> bA;
    public static final  WorldPoint hT;
    
    public static  boolean by;
    static  boolean cp;
    static  int bY;
    public static final  WorldPoint hV;

    public static void cz() {
        block48: {
            BankLocation var3;
            block51: {
                block52: {
                    block50: {
                        block49: {
                            if (K.var4(by)) {
                                AccBuilderRat.c = var2[var1[0]];
                                b.a(bA);
                                if (K.var5(bA.size(), var1[1])) {
                                    System.out.println(var2[var1[1]]);
                                    by = var1[0];
                                }
                            }
                            if (!K.var6(by)) break block48;
                            if (K.var4(Inventory.contains((int[])f.ba) ? 1 : 0) && K.var5(Movement.getRunEnergy(), var1[2])) {
                                Inventory.getFirst((int[])f.ba).interact(var2[var1[3]]);
                                Time.sleepTicks((int)var1[1]);
                                0;
                            }
                            if (K.var7(K.var8(e.v(), 70.0))) {
                                int[] nArray = new int[var1[1]];
                                nArray[K.var1[0]] = var1[4];
                                if (K.var4(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                    int[] nArray2 = new int[var1[1]];
                                    nArray2[K.var1[0]] = var1[4];
                                    Inventory.getFirst((int[])nArray2).interact(var2[var1[5]]);
                                }
                            }
                            if (K.var6(Movement.isRunEnabled() ? 1 : 0) && K.var9(Movement.getRunEnergy())) {
                                Movement.toggleRun();
                            }
                            if (!K.var4(K.S() ? 1 : 0)) break block49;
                            int[] nArray = new int[var1[1]];
                            nArray[K.var1[0]] = var1[6];
                            if (!K.var9(Inventory.getCount((int[])nArray))) break block50;
                        }
                        if (K.var5(e.j(var1[7]), var1[1])) {
                            var3 = BankLocation.getNearest();
                            if (K.var10(var3) && K.var6(var3.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderRat.c = var2[var1[8]];
                                Movement.walkTo((BankLocation)var3);
                                0;
                                Time.sleepTicks((int)var1[3]);
                                0;
                            }
                            if (K.var10(var3) && K.var4(var3.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderRat.c = var2[var1[9]];
                                if (K.var6(Bank.isOpen() ? 1 : 0)) {
                                    a.a();
                                    Time.sleepUntil(() -> Bank.isOpen(), (int)var1[10]);
                                    0;
                                }
                                if (K.var4(Bank.isOpen() ? 1 : 0)) {
                                    if (K.var9(Inventory.getAll().size())) {
                                        Bank.depositInventory();
                                        Time.sleepTicks((int)var1[8]);
                                        0;
                                    }
                                    if (K.var9(Equipment.getAll().size())) {
                                        Bank.depositEquipment();
                                        Time.sleepTicks((int)var1[3]);
                                        0;
                                    }
                                    int[] nArray = new int[var1[9]];
                                    nArray[K.var1[0]] = var1[11];
                                    nArray[K.var1[1]] = var1[12];
                                    nArray[K.var1[3]] = var1[13];
                                    nArray[K.var1[5]] = var1[14];
                                    nArray[K.var1[8]] = var1[15];
                                    if (K.var6(e.b(nArray) ? 1 : 0)) {
                                        K.W();
                                        System.out.println(var2[var1[16]]);
                                        by = var1[1];
                                        return;
                                    }
                                    Bank.withdraw((int)var1[11], (int)var1[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)var1[1]);
                                    0;
                                    Bank.withdraw((int)var1[14], (int)var1[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)var1[1]);
                                    0;
                                    Bank.withdraw((int)var1[15], (int)var1[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)var1[1]);
                                    0;
                                    Bank.withdraw((int)var1[17], (int)var1[18], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)var1[1]);
                                    0;
                                    Bank.withdraw((int)var1[13], (int)var1[9], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)var1[1]);
                                    0;
                                    a.b(f.ba, var1[1]);
                                    a.a(var1[4], var1[18]);
                                    a.b(f.bk, var1[1]);
                                }
                            }
                        }
                    }
                    if (K.var5(e.j(var1[7]), var1[1]) && K.var4(K.S() ? 1 : 0)) {
                        if (K.var11(Players.getLocal().getWorldLocation().distanceTo(hT), var1[5])) {
                            AccBuilderRat.c = var2[var1[19]];
                            if (K.var5(bY, var1[1])) {
                                e.w();
                                bY += var1[1];
                            }
                            Movement.walkTo((WorldPoint)hT);
                            0;
                            Time.sleepTicks((int)var1[1]);
                            0;
                        }
                        if (K.var12(Players.getLocal().getWorldLocation().distanceTo(hT), var1[9])) {
                            AccBuilderRat.c = var2[var1[20]];
                            String[] stringArray = new String[var1[1]];
                            stringArray[K.var1[0]] = var2[var1[21]];
                            var3 = TileObjects.getNearest((String[])stringArray);
                            if (K.var10(var3)) {
                                String[] stringArray2 = new String[var1[1]];
                                stringArray2[K.var1[0]] = var2[var1[18]];
                                if (K.var4(var3.hasAction(stringArray2) ? 1 : 0) && K.var12(var3.getWorldLocation().distanceTo(hT), var1[16])) {
                                    var3.interact(var2[var1[22]]);
                                    Time.sleepTicks((int)var1[5]);
                                    0;
                                }
                            }
                            g.a(var2[var1[23]], hW, var1[1]);
                        }
                    }
                    if (!K.var13(e.j(var1[7]), var1[1])) break block51;
                    String[] stringArray = new String[var1[1]];
                    stringArray[K.var1[0]] = var2[var1[24]];
                    if (!K.var5(Inventory.getCount((String[])stringArray), var1[1])) break block51;
                    String[] stringArray3 = new String[var1[1]];
                    stringArray3[K.var1[0]] = var2[var1[25]];
                    if (!K.var14(Inventory.getCount((String[])stringArray3))) break block52;
                    String[] stringArray4 = new String[var1[1]];
                    stringArray4[K.var1[0]] = var2[var1[26]];
                    if (!K.var9(Inventory.getCount((String[])stringArray4))) break block51;
                }
                co = var1[0];
                if (K.var11(Players.getLocal().getWorldLocation().distanceTo(hU), var1[3])) {
                    AccBuilderRat.c = var2[var1[27]];
                    Movement.walkTo((WorldPoint)hU);
                    0;
                    Time.sleepTicks((int)var1[1]);
                    0;
                }
                if (K.var12(Players.getLocal().getWorldLocation().distanceTo(hU), var1[3])) {
                    String[] stringArray = new String[var1[1]];
                    stringArray[K.var1[0]] = var2[var1[28]];
                    var3 = Inventory.getFirst((String[])stringArray);
                    String[] stringArray5 = new String[var1[1]];
                    stringArray5[K.var1[0]] = var2[var1[29]];
                    Item var15 = Inventory.getFirst((String[])stringArray5);
                    if (K.var10(var3)) {
                        String[] stringArray6 = new String[var1[1]];
                        stringArray6[K.var1[0]] = var2[var1[30]];
                        var3.useOn(TileObjects.getNearest((String[])stringArray6));
                        Time.sleepTicks((int)var1[3]);
                        0;
                    }
                    if (K.var10(var15)) {
                        String[] stringArray7 = new String[var1[1]];
                        stringArray7[K.var1[0]] = var2[var1[31]];
                        var15.useOn(TileObjects.getNearest((String[])stringArray7));
                        Time.sleepTicks((int)var1[3]);
                        0;
                    }
                    Keyboard.type((String)var2[var1[32]]);
                }
            }
            if (K.var13(e.j(var1[7]), var1[1])) {
                String[] stringArray = new String[var1[1]];
                stringArray[K.var1[0]] = var2[var1[33]];
                if (K.var9(Inventory.getCount((String[])stringArray))) {
                    String[] stringArray8 = new String[var1[1]];
                    stringArray8[K.var1[0]] = var2[var1[34]];
                    if (K.var5(Inventory.getCount((String[])stringArray8), var1[1])) {
                        if (K.var11(Players.getLocal().getWorldLocation().distanceTo(hV), var1[3])) {
                            AccBuilderRat.c = var2[var1[35]];
                            Movement.walkTo((WorldPoint)hV);
                            0;
                            Time.sleepTicks((int)var1[1]);
                            0;
                        }
                        if (K.var12(Players.getLocal().getWorldLocation().distanceTo(hV), var1[3])) {
                            String[] stringArray9 = new String[var1[1]];
                            stringArray9[K.var1[0]] = var2[var1[36]];
                            var3 = TileItems.getNearest((String[])stringArray9);
                            if (K.var16(var3)) {
                                String[] stringArray10 = new String[var1[1]];
                                stringArray10[K.var1[0]] = var2[var1[37]];
                                NPCs.getNearest((String[])stringArray10).interact(var2[var1[38]]);
                                Time.sleepTicks((int)var1[9]);
                                0;
                            }
                            if (K.var10(var3)) {
                                var3.interact(var2[var1[39]]);
                                Time.sleepTicks((int)var1[3]);
                                0;
                            }
                        }
                    }
                }
            }
            if (K.var13(e.j(var1[7]), var1[1])) {
                String[] stringArray = new String[var1[1]];
                stringArray[K.var1[0]] = var2[var1[40]];
                if (K.var9(Inventory.getCount((String[])stringArray))) {
                    String[] stringArray11 = new String[var1[1]];
                    stringArray11[K.var1[0]] = var2[var1[41]];
                    if (K.var9(Inventory.getCount((String[])stringArray11))) {
                        if (K.var11(Players.getLocal().getWorldLocation().distanceTo(hT), var1[5])) {
                            AccBuilderRat.c = var2[var1[42]];
                            Movement.walkTo((WorldPoint)hT);
                            0;
                            Time.sleepTicks((int)var1[1]);
                            0;
                        }
                        if (K.var12(Players.getLocal().getWorldLocation().distanceTo(hT), var1[9])) {
                            AccBuilderRat.c = var2[var1[43]];
                            g.a(var2[var1[44]], hW, var1[1]);
                        }
                    }
                }
            }
            if (K.var13(e.j(var1[7]), var1[3])) {
                String[] stringArray = new String[var1[1]];
                stringArray[K.var1[0]] = var2[var1[45]];
                var3 = TileObjects.getNearest((String[])stringArray);
                if (K.var10(var3)) {
                    String[] stringArray12 = new String[var1[1]];
                    stringArray12[K.var1[0]] = var2[var1[46]];
                    if (K.var4(var3.hasAction(stringArray12) ? 1 : 0)) {
                        if (K.var5(co, var1[1])) {
                            P.ll += var1[1];
                            P.d(AccBuilderRat.m);
                            co += var1[1];
                            P.ll = var1[0];
                            cp = var1[0];
                        }
                        var3.interact(var2[var1[47]]);
                        Time.sleepTicks((int)var1[5]);
                        0;
                    }
                }
                g.a(hW);
            }
            if (K.var13(e.j(var1[7]), var1[5]) && K.var12(Players.getLocal().getWorldLocation().distanceTo(hT), var1[41])) {
                int[] nArray = new int[var1[1]];
                nArray[K.var1[0]] = var1[13];
                if (K.var4(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray3 = new int[var1[1]];
                    nArray3[K.var1[0]] = var1[13];
                    Inventory.getFirst((int[])nArray3).interact(var2[var1[48]]);
                    Time.sleepTicks((int)var1[16]);
                    0;
                }
            }
            g.a(new String[var1[0]]);
            System.out.println("Setting: " + e.j(var1[7]));
        }
    }

    private static void var17() {
        var1 = new int[66];
        K.var1[0] = (0x17 ^ 0x3E) & ~(0x32 ^ 0x1B);
        K.var1[1] = 1;
        K.var1[2] = 8 ^ 0x4E;
        K.var1[3] = 2;
        K.var1[4] = 0xFFFFAFFB & 0x517F;
        K.var1[5] = 3;
        K.var1[6] = 0xFFFF8FF7 & 0x73EB;
        K.var1[7] = 0xA5 ^ 0xBA ^ (0xE7 ^ 0xBB);
        K.var1[8] = 0x71 ^ 0 ^ (0x25 ^ 0x50);
        K.var1[9] = 1 ^ 4;
        K.var1[10] = 0xFFFFDBCE & 0x37B9;
        K.var1[11] = 0xFFFFBDF7 & 0x4A5E;
        K.var1[12] = 0xFFFFBB51 & 0x75FF;
        K.var1[13] = 0xFFFFBFE7 & 0x5F5F;
        K.var1[14] = 185 + 27 - 102 + 111;
        K.var1[15] = 0xFFFFE7BD & 0x1FE7;
        K.var1[16] = 0x38 ^ 0x3E;
        K.var1[17] = -(39 + 132 - 109 + 71) & (0xFFFFBFED & 0x5FDF);
        K.var1[18] = 0xA3 ^ 0xA9;
        K.var1[19] = 0x61 ^ 0x66;
        K.var1[20] = 0x22 ^ 0x2A;
        K.var1[21] = 0 ^ 0x6C ^ (3 ^ 0x66);
        K.var1[22] = 0x1E ^ 0x2A ^ (6 ^ 0x39);
        K.var1[23] = 0xF4 ^ 0x91 ^ (2 ^ 0x6B);
        K.var1[24] = 5 + 135 - 28 + 43 ^ 81 + 24 - 26 + 71;
        K.var1[25] = 0x8B ^ 0x85;
        K.var1[26] = 0xB7 ^ 0xB8;
        K.var1[27] = 0x78 ^ 0x68;
        K.var1[28] = 0x9A ^ 0x8B;
        K.var1[29] = 0x6E ^ 2 ^ (0x5D ^ 0x23);
        K.var1[30] = 0x93 ^ 0x80;
        K.var1[31] = 0xB7 ^ 0xA3;
        K.var1[32] = 0xAE ^ 0xBB;
        K.var1[33] = 0xB2 ^ 0xA4;
        K.var1[34] = 0xBD ^ 0xB8 ^ (0x6E ^ 0x7C);
        K.var1[35] = 0xC7 ^ 0xB4 ^ (0xC4 ^ 0xAF);
        K.var1[36] = 0x14 ^ 0x6C ^ (0x2C ^ 0x4D);
        K.var1[37] = 0x74 ^ 0x6E;
        K.var1[38] = 3 ^ (0x8E ^ 0x96);
        K.var1[39] = 0x5D ^ 0x40 ^ 1;
        K.var1[40] = 127 + 110 - 205 + 96 ^ 59 + 153 - 71 + 16;
        K.var1[41] = 0x93 ^ 0x8D;
        K.var1[42] = 0x5A ^ 0x45;
        K.var1[43] = 0x63 ^ 0x29 ^ (0xDB ^ 0xB1);
        K.var1[44] = 178 + 128 - 280 + 153 ^ 87 + 24 - 41 + 76;
        K.var1[45] = 0x34 ^ 0x16;
        K.var1[46] = 126 + 54 - 101 + 69 ^ 94 + 131 - 145 + 103;
        K.var1[47] = 0xB4 ^ 0xC2 ^ (0xC0 ^ 0x92);
        K.var1[48] = 0x39 ^ 0x72 ^ (0xDE ^ 0xB0);
        K.var1[49] = 0xFFFFFFCE & 0x173D;
        K.var1[50] = -(0xFFFFF262 & 0x5D9F) & (0xFFFFFEDD & 0x7FEF);
        K.var1[51] = -(0xFFFFB7DC & 0x5E67) & (0xFFFFF7FB & 0x7FEF);
        K.var1[52] = 0xFFFFCFFC & 0x376F;
        K.var1[53] = 0xDF ^ 0xAF ^ (0x49 ^ 0x11);
        K.var1[54] = 5 ^ 0x61;
        K.var1[55] = 0x46 ^ 0x60;
        K.var1[56] = 0xB1 ^ 0x96;
        K.var1[57] = 0xFFFFFBBD & 0xFDA;
        K.var1[58] = 0xFFFF8ED7 & 0x7DAD;
        K.var1[59] = 0xFFFF8F9B & 0x7BFD;
        K.var1[60] = 0xFFFFBDAB & 0x4EDF;
        K.var1[61] = 0xFFFF8F9F & 0x7BED;
        K.var1[62] = 0xFFFFBD87 & 0x4EFB;
        K.var1[63] = 42 + 61 - 75 + 103 ^ 115 + 144 - 235 + 146;
        K.var1[64] = 0x36 ^ 0x52 ^ (0x7B ^ 0x35);
        K.var1[65] = 0xCB ^ 0xC3 ^ (0x90 ^ 0xB3);
    }

    @Override
    public String Z() {
        return var2[var1[55]];
    }

    private static boolean var5(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var16(Object object) {
        return object == null;
    }

        catch (Exception var23) {
            var23.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean aa() {
        int n2;
        if (K.var24(e.j(var1[7]), var1[5]) && K.var11(Players.getLocal().getWorldLocation().distanceTo(hT), var1[41])) {
            n2 = var1[1];
            0;
            if (((28 + 18 - 31 + 206 ^ 42 + 58 - 41 + 96) & (0xD6 ^ 0x85 ^ (0x7A ^ 0x6F) ^ -1)) != 0) {
                return ((0x5E ^ 0x2B ^ (0xF2 ^ 0xB5)) & (0x8F ^ 0x88 ^ (0x96 ^ 0xA3) ^ -1)) != 0;
            }
        } else {
            n2 = var1[0];
        }
        return n2 != 0;
    }

    @Override
    public boolean X() {
        return var1[0];
    }

    static {
        K.var17();
        K.var25();
        hT = new WorldPoint(var1[57], var1[58], var1[0]);
        hU = new WorldPoint(var1[59], var1[60], var1[0]);
        hV = new WorldPoint(var1[61], var1[62], var1[0]);
        String[] stringArray = new String[var1[5]];
        stringArray[K.var1[0]] = var2[var1[53]];
        stringArray[K.var1[1]] = var2[var1[63]];
        stringArray[K.var1[3]] = var2[var1[64]];
        hW = stringArray;
        bA = new ArrayList<d>();
        bY = var1[0];
    }

    private static boolean var6(int n2) {
        return n2 == 0;
    }

    private static boolean var10(Object object) {
        return object != null;
    }

    private static String var26(String var27, String var28) {
        var27 = new String(Base64.getDecoder().decode(var27.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var29 = new StringBuilder();
        char[] var30 = var28.toCharArray();
        int var31 = var1[0];
        char[] var32 = var27.toCharArray();
        int var33 = var32.length;
        int var34 = var1[0];
        while (K.var5(var34, var33)) {
            char var35 = var32[var34];
            var29.append((char)(var35 ^ var30[var31 % var30.length]));
            0;
            ++var31;
            ++var34;
            0;
            if ((0x6A ^ 0x17 ^ (0x21 ^ 0x58)) > 0) continue;
            return null;
        }
        return String.valueOf(var29);
    }

    @Override
    public int Y() {
        try {
            K.cz();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if null != null {
            return (0x7D ^ 0x41) & ~(0x91 ^ 0xAD);
        }
        return var1[54];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean S() {
        int n2;
        int[] nArray = new int[var1[1]];
        nArray[K.var1[0]] = var1[14];
        if (K.var4(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[var1[1]];
            nArray2[K.var1[0]] = var1[11];
            if (K.var4(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                int[] nArray3 = new int[var1[1]];
                nArray3[K.var1[0]] = var1[15];
                if (K.var4(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                    n2 = var1[1];
                    0;
                    if (3 == 3) return n2 != 0;
                    return ((0x62 ^ 3) & ~(0xA2 ^ 0xC3)) != 0;
                }
            }
        }
        n2 = var1[0];
        return n2 != 0;
    }

    private static void W() {
        d var36;
        Object var37;
        int[] nArray = new int[var1[1]];
        nArray[K.var1[0]] = var1[15];
        if (K.var6(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new DHelper(var1[15], var1[1], var1[49]);
            bA.add(d2);
            0;
        }
        int[] nArray2 = new int[var1[1]];
        nArray2[K.var1[0]] = var1[11];
        if (K.var6(Bank.contains((int[])nArray2) ? 1 : 0)) {
            var37 = new DHelper(var1[11], var1[1], var1[49]);
            bA.add((d)var37);
            0;
        }
        int[] nArray3 = new int[var1[1]];
        nArray3[K.var1[0]] = var1[14];
        if (K.var6(Bank.contains((int[])nArray3) ? 1 : 0)) {
            var37 = new DHelper(var1[14], var1[1], var1[49]);
            bA.add((d)var37);
            0;
        }
        if (K.var6(Bank.contains((Predicate)(var37 = item -> item.getName().toLowerCase().contains(var2[var1[56]]))) ? 1 : 0)) {
            var36 = new DHelper(var1[50], var1[9], var1[51]);
            bA.add(var36);
            0;
        }
        int[] nArray4 = new int[var1[1]];
        nArray4[K.var1[0]] = var1[17];
        if (K.var6(Bank.contains((int[])nArray4) ? 1 : 0)) {
            var36 = new DHelper(var1[17], var1[18], var1[52]);
            bA.add(var36);
            0;
        }
        int[] nArray5 = new int[var1[1]];
        nArray5[K.var1[0]] = var1[13];
        if (K.var6(Bank.contains((int[])nArray5) ? 1 : 0)) {
            var36 = new DHelper(var1[13], var1[53], var1[52]);
            bA.add(var36);
            0;
        }
        int[] nArray6 = new int[var1[1]];
        nArray6[K.var1[0]] = var1[12];
        if (K.var6(Bank.contains((int[])nArray6) ? 1 : 0)) {
            var36 = new DHelper(var1[12], var1[9], h.bv);
            bA.add(var36);
            0;
        }
    }

        catch (Exception var43) {
            var43.printStackTrace();
            return null;
        }
    }

    private static boolean var24(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean var7(int n2) {
        return n2 < 0;
    }

    private static boolean var9(int n2) {
        return n2 > 0;
    }

    private static void var25() {
        var2 = new String[var1[65]];
        K.var2[K.var1[0]] = "Buying items";
        K.var2[K.var1[1]] = "Finished buying items, switching back to quest";
        K.var2[K.var1[3]] = "Drink";
        K.var2[K.var1[5]] = "Eat";
        K.var2[K.var1[8]] = "Nav to bank";
        K.var2[K.var1[9]] = "Handling banking";
        K.var2[K.var1[16]] = "We are missing quest supplies, switching to BUYING";
        K.var2[K.var1[19]] = "Nav to start";
        K.var2[K.var1[20]] = "Starting quest";
        K.var2[K.var1[21]] = "Door";
        K.var2[K.var1[18]] = "Open";
        K.var2[K.var1[22]] = "Open";
        K.var2[K.var1[23]] = "Hetty";
        K.var2[K.var1[24]] = "Burnt meat";
        K.var2[K.var1[25]] = "Raw rat meat";
        K.var2[K.var1[26]] = "Cooked meat";
        K.var2[K.var1[27]] = "Nav to range";
        K.var2[K.var1[28]] = "Raw rat meat";
        K.var2[K.var1[29]] = "Cooked meat";
        K.var2[K.var1[30]] = "Range";
        K.var2[K.var1[31]] = "Range";
        K.var2[K.var1[32]] = " ";
        K.var2[K.var1[33]] = "Burnt meat";
        K.var2[K.var1[34]] = "Rat's tail";
        K.var2[K.var1[35]] = "Nav to rat";
        K.var2[K.var1[36]] = "Rat's tail";
        K.var2[K.var1[37]] = "Rat";
        K.var2[K.var1[38]] = "Attack";
        K.var2[K.var1[39]] = "Take";
        K.var2[K.var1[40]] = "Burnt meat";
        K.var2[K.var1[41]] = "Rat's tail";
        K.var2[K.var1[42]] = "Nav to start";
        K.var2[K.var1[43]] = "Starting quest";
        K.var2[K.var1[44]] = "Hetty";
        K.var2[K.var1[45]] = "Cauldron";
        K.var2[K.var1[46]] = "Drink From";
        K.var2[K.var1[47]] = "Drink From";
        K.var2[K.var1[48]] = "Break";
        K.var2[K.var1[55]] = "Witches potion quest";
        K.var2[K.var1[56]] = "ring of wealth (";
        K.var2[K.var1[53]] = "I am in search of a quest.";
        K.var2[K.var1[63]] = "Yes, help me become one with my darker side.";
        K.var2[K.var1[64]] = "Yes.";
    }

    private static boolean var13(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var4(int n2) {
        return n2 != 0;
    }

    private static boolean var11(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean var14(int n2) {
        return n2 <= 0;
    }

    private static int var8(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean var12(int n2, int n3) {
        return n2 <= n3;
    }
}

