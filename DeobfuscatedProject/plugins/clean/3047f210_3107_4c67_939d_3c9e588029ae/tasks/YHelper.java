/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks;

import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.S;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.AHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.ACHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.BHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.DHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.EHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.FHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.GHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.IHelper;
import gg.squire.account.AccBuilderTempleTrek;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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
import net.unethicalite.api.widgets.Dialog;

public class YHelper
implements S {
    public static  boolean bs;
    static  int gp;
    static  WorldPoint gf;
    static  int ck;
    
    static  String[] bQ;
    static  boolean cl;
    public static  List<d> bu;
    static  WorldPoint gq;

    private static boolean llIlIllIIIIII(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public boolean V() {
        boolean bl;
        if (y.llIlIlIllllll(e.j(gp), llllllIIII[6])) {
            bl = llllllIIII[0];

            if (((0x8D ^ 0x8B ^ (0x83 ^ 0xC6)) & (133 + 94 - 194 + 177 ^ 49 + 95 - 25 + 26 ^ -1)) == -1) {
                return ((0x5C ^ 0x5B ^ (0x5E ^ 0x41)) & (0x59 ^ 0x4F ^ (8 ^ 6) ^ -1)) != 0;
            }
        } else {
            bl = llllllIIII[1];
        }
        return bl;
    }

    private static boolean llIlIlIlllllI(int n2, int n3) {
        return n2 != n3;
    }

    private static int llIlIlIllIlIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean llIlIlIllllIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llIlIlIllllll(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean aa() {
        void var1;
        int[] nArray = new int[llllllIIII[7]];
        nArray[y.llllllIIII[1]] = llllllIIII[8];
        nArray[y.llllllIIII[0]] = llllllIIII[9];
        nArray[y.llllllIIII[3]] = llllllIIII[10];
        nArray[y.llllllIIII[5]] = llllllIIII[11];
        nArray[y.llllllIIII[6]] = llllllIIII[12];
        int[] nArray2 = nArray;
        int var2 = llllllIIII[1];
        while (y.llIlIlIllIlll(var2, ((void)var1).length)) {
            int[] nArray3 = new int[llllllIIII[0]];
            nArray3[y.llllllIIII[1]] = var1[var2];
            if (y.llIlIlIlllIII(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return llllllIIII[1];
            }
            ++var2;

            if (2 > 0) continue;
            return false;
        }
        return llllllIIII[0];
    }

    @Override
    public int T() {
        try {
            y.bS();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (3 < 2) {
            return (0xC3 ^ 0x8E) & ~(0xF0 ^ 0xBD);
        }
        return llllllIIII[140];
    }

    @Override
    public String U() {
        return lllllIllII[llllllIIII[141]];
    }

    private static boolean llIlIlIllllII(int n2) {
        return n2 < 0;
    }

    private static boolean llIlIllIIIIIl(Object object) {
        return object == null;
    }

    private static boolean llIlIlIllIlll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIlIlIllIllI(int n2) {
        return n2 != 0;
    }

    private static void llIlIlIllIIll() {
        lllllIllII = new String[llllllIIII[162]];
        y.lllllIllII[y.llllllIIII[1]] = "Finished buying items, switching back to quest";
        y.lllllIllII[y.llllllIIII[0]] = "Need 12 QP";
        y.lllllIllII[y.llllllIIII[3]] = "Nav to bank";
        y.lllllIllII[y.llllllIIII[5]] = "Handling banking";
        y.lllllIllII[y.llllllIIII[6]] = "We are missing quest supplies, switching to BUYING";
        y.lllllIllII[y.llllllIIII[7]] = "Drink";
        y.lllllIllII[y.llllllIIII[18]] = "Eat";
        y.lllllIllII[y.llllllIIII[19]] = "Nav to start";
        y.lllllIllII[y.llllllIIII[20]] = "Sir Amik Varze";
        y.lllllIllII[y.llllllIIII[34]] = "Nav to fortress";
        y.lllllIllII[y.llllllIIII[13]] = "Bronze med helm";
        y.lllllIllII[y.llllllIIII[38]] = "Iron chainbody";
        y.lllllIllII[y.llllllIIII[2]] = "Bronze med helm";
        y.lllllIllII[y.llllllIIII[35]] = "Bronze med helm";
        y.lllllIllII[y.llllllIIII[39]] = "Wear";
        y.lllllIllII[y.llllllIIII[16]] = "Iron chainbody";
        y.lllllIllII[y.llllllIIII[40]] = "Iron chainbody";
        y.lllllIllII[y.llllllIIII[41]] = "Wear";
        y.lllllIllII[y.llllllIIII[42]] = "Drink";
        y.lllllIllII[y.llllllIIII[29]] = "Bronze med helm";
        y.lllllIllII[y.llllllIIII[26]] = "Iron chainbody";
        y.lllllIllII[y.llllllIIII[43]] = "Sturdy door";
        y.lllllIllII[y.llllllIIII[44]] = "Open";
        y.lllllIllII[y.llllllIIII[45]] = "Push wall";
        y.lllllIllII[y.llllllIIII[31]] = "Wall";
        y.lllllIllII[y.llllllIIII[46]] = "Push";
        y.lllllIllII[y.llllllIIII[49]] = "Climb up first ladder";
        y.lllllIllII[y.llllllIIII[50]] = "Climb-up";
        y.lllllIllII[y.llllllIIII[51]] = "Climb up 2nd ladder";
        y.lllllIllII[y.llllllIIII[28]] = "ARhƅ/Q]";
        y.lllllIllII[y.llllllIIII[25]] = "Climb down 1st ladder";
        y.lllllIllII[y.llllllIIII[54]] = "Climb-down";
        y.lllllIllII[y.llllllIIII[57]] = "Handle door and ladder up";
        y.lllllIllII[y.llllllIIII[58]] = "Door";
        y.lllllIllII[y.llllllIIII[59]] = "Open";
        y.lllllIllII[y.llllllIIII[60]] = "Door";
        y.lllllIllII[y.llllllIIII[61]] = "Open";
        y.lllllIllII[y.llllllIIII[62]] = "Door";
        y.lllllIllII[y.llllllIIII[63]] = "Open";
        y.lllllIllII[y.llllllIIII[65]] = "Ladder";
        y.lllllIllII[y.llllllIIII[66]] = "Climb-up";
        y.lllllIllII[y.llllllIIII[68]] = "Climb down second ladder";
        y.lllllIllII[y.llllllIIII[69]] = "Ladder";
        y.lllllIllII[y.llllllIIII[70]] = "Climb-down";
        y.lllllIllII[y.llllllIIII[73]] = "Sturdy door";
        y.lllllIllII[y.llllllIIII[74]] = "Open";
        y.lllllIllII[y.llllllIIII[75]] = "Sturdy door";
        y.lllllIllII[y.llllllIIII[76]] = "Open";
        y.lllllIllII[y.llllllIIII[77]] = "Sturdy door";
        y.lllllIllII[y.llllllIIII[78]] = "Open";
        y.lllllIllII[y.llllllIIII[17]] = "Sturdy door";
        y.lllllIllII[y.llllllIIII[79]] = "Open";
        y.lllllIllII[y.llllllIIII[80]] = "Climb-down";
        y.lllllIllII[y.llllllIIII[81]] = "Grill";
        y.lllllIllII[y.llllllIIII[82]] = "Listen-at";
        y.lllllIllII[y.llllllIIII[85]] = "Ladder up 1";
        y.lllllIllII[y.llllllIIII[86]] = "Ladder";
        y.lllllIllII[y.llllllIIII[87]] = "Climb-up";
        y.lllllIllII[y.llllllIIII[90]] = "Door 1";
        y.lllllIllII[y.llllllIIII[91]] = "Sturdy door";
        y.lllllIllII[y.llllllIIII[92]] = "Open";
        y.lllllIllII[y.llllllIIII[93]] = "ladder up 2";
        y.lllllIllII[y.llllllIIII[94]] = "Ladder";
        y.lllllIllII[y.llllllIIII[95]] = "Climb-up";
        y.lllllIllII[y.llllllIIII[96]] = "Walk to ladder down 1 tile";
        y.lllllIllII[y.llllllIIII[97]] = "Climb down 1";
        y.lllllIllII[y.llllllIIII[98]] = "Ladder";
        y.lllllIllII[y.llllllIIII[99]] = "Climb-down";
        y.lllllIllII[y.llllllIIII[100]] = "Door";
        y.lllllIllII[y.llllllIIII[101]] = "Open";
        y.lllllIllII[y.llllllIIII[102]] = "Door";
        y.lllllIllII[y.llllllIIII[103]] = "Open";
        y.lllllIllII[y.llllllIIII[104]] = "Ladder";
        y.lllllIllII[y.llllllIIII[105]] = "Open";
        y.lllllIllII[y.llllllIIII[106]] = "Ladder";
        y.lllllIllII[y.llllllIIII[107]] = "Climb-up";
        y.lllllIllII[y.llllllIIII[110]] = "Ladder";
        y.lllllIllII[y.llllllIIII[111]] = "Climb-down";
        y.lllllIllII[y.llllllIIII[112]] = "Climb-down";
        y.lllllIllII[y.llllllIIII[113]] = "Wall";
        y.lllllIllII[y.llllllIIII[114]] = "Push";
        y.lllllIllII[y.llllllIIII[116]] = "Door";
        y.lllllIllII[y.llllllIIII[117]] = "Open";
        y.lllllIllII[y.llllllIIII[118]] = "Luring knight";
        y.lllllIllII[y.llllllIIII[120]] = "Door";
        y.lllllIllII[y.llllllIIII[121]] = "Open";
        y.lllllIllII[y.llllllIIII[122]] = "Ladder";
        y.lllllIllII[y.llllllIIII[123]] = "Climb-up";
        y.lllllIllII[y.llllllIIII[125]] = "Drink";
        y.lllllIllII[y.llllllIIII[126]] = "Wall";
        y.lllllIllII[y.llllllIIII[127]] = "Push";
        y.lllllIllII[y.llllllIIII[128]] = "Cabbage";
        y.lllllIllII[y.llllllIIII[129]] = "Cabbage";
        y.lllllIllII[y.llllllIIII[130]] = "Hole";
        y.lllllIllII[y.llllllIIII[131]] = "Break";
        y.lllllIllII[y.llllllIIII[132]] = "Nav to start";
        y.lllllIllII[y.llllllIIII[133]] = "Sir Amik Varze";
        y.lllllIllII[y.llllllIIII[141]] = "Black Knights Fortress";
        y.lllllIllII[y.llllllIIII[142]] = "ring of wealth (";
        y.lllllIllII[y.llllllIIII[143]] = "Knight";
        y.lllllIllII[y.llllllIIII[140]] = "Knight";
        y.lllllIllII[y.llllllIIII[144]] = "ladder";
        y.lllllIllII[y.llllllIIII[145]] = "Climb-down";
        y.lllllIllII[y.llllllIIII[146]] = "Ladder";
        y.lllllIllII[y.llllllIIII[147]] = "Climb-down";
        y.lllllIllII[y.llllllIIII[148]] = "ladder";
        y.lllllIllII[y.llllllIIII[149]] = "Climb-down";
        y.lllllIllII[y.llllllIIII[150]] = "ladder";
        y.lllllIllII[y.llllllIIII[151]] = "Climb-up";
        y.lllllIllII[y.llllllIIII[152]] = "ladder";
        y.lllllIllII[y.llllllIIII[153]] = "Climb-up";
        y.lllllIllII[y.llllllIIII[158]] = "Yes.";
        y.lllllIllII[y.llllllIIII[159]] = "I seek a quest!";
        y.lllllIllII[y.llllllIIII[160]] = "I laugh in the face of danger!";
        y.lllllIllII[y.llllllIIII[161]] = "I don't care. I'm going in anyway.";
    }

    private static void ae() {
        block19: {
            d var3;
            block18: {
                Object var4;
                block17: {
                    block16: {
                        block15: {
                            block14: {
                                int[] nArray = new int[llllllIIII[0]];
                                nArray[y.llllllIIII[1]] = llllllIIII[11];
                                if (y.llIlIlIlllIII(Bank.contains((int[])nArray) ? 1 : 0)) {
                                    d d2 = new DHelper(llllllIIII[11], llllllIIII[0], llllllIIII[134]);
                                    bu.add(d2);

                                }
                                int[] nArray2 = new int[llllllIIII[0]];
                                nArray2[y.llllllIIII[1]] = llllllIIII[10];
                                if (y.llIlIlIlllIII(Bank.contains((int[])nArray2) ? 1 : 0)) {
                                    var4 = new DHelper(llllllIIII[10], llllllIIII[0], llllllIIII[134]);
                                    bu.add((DHelper) ar4);

                                }
                                int[] nArray3 = new int[llllllIIII[0]];
                                nArray3[y.llllllIIII[1]] = llllllIIII[12];
                                if (y.llIlIlIlllIII(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                    var4 = new DHelper(llllllIIII[12], llllllIIII[0], llllllIIII[134]);
                                    bu.add((DHelper) ar4);

                                }
                                int[] nArray4 = new int[llllllIIII[0]];
                                nArray4[y.llllllIIII[1]] = llllllIIII[9];
                                if (!y.llIlIlIllIllI(Bank.contains((int[])nArray4) ? 1 : 0)) break block14;
                                int[] nArray5 = new int[llllllIIII[0]];
                                nArray5[y.llllllIIII[1]] = llllllIIII[9];
                                if (!y.llIlIlIllIllI(Bank.contains((int[])nArray5) ? 1 : 0)) break block15;
                                int[] nArray6 = new int[llllllIIII[0]];
                                nArray6[y.llllllIIII[1]] = llllllIIII[9];
                                if (!y.llIlIlIllIlll(Bank.getFirst((int[])nArray6).getQuantity(), llllllIIII[7])) break block15;
                            }
                            var4 = new DHelper(llllllIIII[9], llllllIIII[13], llllllIIII[135]);
                            bu.add((DHelper) ar4);

                        }
                        int[] nArray = new int[llllllIIII[0]];
                        nArray[y.llllllIIII[1]] = llllllIIII[15];
                        if (!y.llIlIlIllIllI(Bank.contains((int[])nArray) ? 1 : 0)) break block16;
                        int[] nArray7 = new int[llllllIIII[0]];
                        nArray7[y.llllllIIII[1]] = llllllIIII[15];
                        if (!y.llIlIlIllIllI(Bank.contains((int[])nArray7) ? 1 : 0)) break block17;
                        int[] nArray8 = new int[llllllIIII[0]];
                        nArray8[y.llllllIIII[1]] = llllllIIII[15];
                        if (!y.llIlIlIllIlll(Bank.getFirst((int[])nArray8).getQuantity(), llllllIIII[7])) break block17;
                    }
                    var4 = new DHelper(llllllIIII[15], llllllIIII[13], llllllIIII[136]);
                    bu.add((DHelper) ar4);

                }
                if (y.llIlIlIlllIII(Bank.contains((Predicate)(var4 = item -> item.getName().toLowerCase().contains(lllllIllII[llllllIIII[142]]))) ? 1 : 0)) {
                    var3 = new DHelper(llllllIIII[137], llllllIIII[7], llllllIIII[138]);
                    bu.add(var3);

                }
                int[] nArray = new int[llllllIIII[0]];
                nArray[y.llllllIIII[1]] = llllllIIII[14];
                if (y.llIlIlIlllIII(Bank.contains((int[])nArray) ? 1 : 0)) {
                    var3 = new DHelper(llllllIIII[14], llllllIIII[6], i.bp);
                    bu.add(var3);

                }
                int[] nArray9 = new int[llllllIIII[0]];
                nArray9[y.llllllIIII[1]] = llllllIIII[8];
                if (!y.llIlIlIllIllI(Bank.contains((int[])nArray9) ? 1 : 0)) break block18;
                int[] nArray10 = new int[llllllIIII[0]];
                nArray10[y.llllllIIII[1]] = llllllIIII[8];
                if (!y.llIlIlIllIllI(Bank.contains((int[])nArray10) ? 1 : 0)) break block19;
                int[] nArray11 = new int[llllllIIII[0]];
                nArray11[y.llllllIIII[1]] = llllllIIII[8];
                if (!y.llIlIlIllIlll(Bank.getFirst((int[])nArray11).getQuantity(), llllllIIII[16])) break block19;
            }
            var3 = new DHelper(llllllIIII[8], llllllIIII[66], llllllIIII[139]);
            bu.add(var3);

        }
    }

    private static boolean llIlIlIlllIIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIlIlIlllIlI(Object object) {
        return object != null;
    }

    public static void bS() {
        block81: {
            WorldPoint var5;
            TileObject var6;
            WorldArea var7;
            WorldArea var8;
            WorldArea var9;
            WorldArea var10;
            WorldArea var11;
            WorldArea var12;
            WorldArea var13;
            BankLocation var14;
            block82: {
                WorldArea var15;
                WorldArea var16;
                block83: {
                    block85: {
                        block84: {
                            if (y.llIlIlIllIllI(bs ? 1 : 0)) {
                                b.a(bu);
                                if (y.llIlIlIllIlll(bu.size(), llllllIIII[0])) {
                                    System.out.println(lllllIllII[llllllIIII[1]]);
                                    bs = llllllIIII[1];
                                }
                            }
                            if (!y.llIlIlIlllIII(bs ? 1 : 0)) break block81;
                            if (y.llIlIlIllIlll(e.H(), llllllIIII[2])) {
                                System.out.println(lllllIllII[llllllIIII[0]]);
                                AccBuilderTempleTrek.d = llllllIIII[0];
                                return;
                            }
                            if (y.llIlIlIlllIII(y.aa() ? 1 : 0) && y.llIlIlIllIlll(e.j(gp), llllllIIII[0]) && y.llIlIlIlllIIl(e.H(), llllllIIII[2])) {
                                var14 = BankLocation.getNearest();
                                if (y.llIlIlIlllIlI(var14) && y.llIlIlIlllIII(var14.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderTempleTrek.c = lllllIllII[llllllIIII[3]];
                                    a.a(var14);
                                }
                                if (y.llIlIlIlllIlI(var14) && y.llIlIlIllIllI(var14.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (y.llIlIlIlllIII(Bank.isOpen() ? 1 : 0)) {
                                        a.a();
                                        Time.sleepUntil(() -> Bank.isOpen(), (int)llllllIIII[4]);

                                    }
                                    if (y.llIlIlIllIllI(Bank.isOpen() ? 1 : 0)) {
                                        AccBuilderTempleTrek.c = lllllIllII[llllllIIII[5]];
                                        if (y.llIlIlIlllIll(Inventory.getAll().size())) {
                                            Bank.depositInventory();
                                            Time.sleepTicks((int)llllllIIII[6]);

                                        }
                                        if (y.llIlIlIlllIll(Equipment.getAll().size())) {
                                            Bank.depositEquipment();
                                            Time.sleepTicks((int)llllllIIII[3]);

                                        }
                                        int[] nArray = new int[llllllIIII[7]];
                                        nArray[y.llllllIIII[1]] = llllllIIII[8];
                                        nArray[y.llllllIIII[0]] = llllllIIII[9];
                                        nArray[y.llllllIIII[3]] = llllllIIII[10];
                                        nArray[y.llllllIIII[5]] = llllllIIII[11];
                                        nArray[y.llllllIIII[6]] = llllllIIII[12];
                                        if (y.llIlIlIlllIII(e.b(nArray) ? 1 : 0)) {
                                            y.ae();
                                            System.out.println(lllllIllII[llllllIIII[6]]);
                                            bs = llllllIIII[0];
                                            return;
                                        }
                                        int[] nArray2 = new int[llllllIIII[7]];
                                        nArray2[y.llllllIIII[1]] = llllllIIII[8];
                                        nArray2[y.llllllIIII[0]] = llllllIIII[9];
                                        nArray2[y.llllllIIII[3]] = llllllIIII[10];
                                        nArray2[y.llllllIIII[5]] = llllllIIII[11];
                                        nArray2[y.llllllIIII[6]] = llllllIIII[12];
                                        if (y.llIlIlIllIllI(e.b(nArray2) ? 1 : 0)) {
                                            a.a(llllllIIII[8], llllllIIII[13]);
                                            a.a(llllllIIII[9], llllllIIII[13]);
                                            a.a(llllllIIII[10], llllllIIII[0]);
                                            a.a(llllllIIII[11], llllllIIII[0]);
                                            a.a(llllllIIII[12], llllllIIII[0]);
                                            a.a(llllllIIII[14], llllllIIII[0]);
                                            a.a(llllllIIII[15], llllllIIII[16]);
                                        }
                                    }
                                }
                            }
                            if (y.llIlIlIllIllI(Inventory.contains((int[])f.aU) ? 1 : 0) && y.llIlIlIllIlll(Movement.getRunEnergy(), llllllIIII[17])) {
                                Inventory.getFirst((int[])f.aU).interact(lllllIllII[llllllIIII[7]]);
                                Time.sleepTicks((int)llllllIIII[0]);

                            }
                            int[] nArray = new int[llllllIIII[0]];
                            nArray[y.llllllIIII[1]] = llllllIIII[15];
                            if (y.llIlIlIllIllI(Inventory.contains((int[])nArray) ? 1 : 0) && y.llIlIlIllllII(y.llIlIlIllIlIl(e.u(), 50.0))) {
                                int[] nArray3 = new int[llllllIIII[0]];
                                nArray3[y.llllllIIII[1]] = llllllIIII[15];
                                Inventory.getFirst((int[])nArray3).interact(lllllIllII[llllllIIII[18]]);
                                Time.sleepTicks((int)llllllIIII[3]);

                            }
                            if (y.llIlIlIllIllI(y.aa() ? 1 : 0) && y.llIlIlIlllIII(e.j(gp))) {
                                if (!y.llIlIlIllllIl(Players.getLocal().getWorldLocation().distanceTo(gf), llllllIIII[7]) || y.llIlIlIlllllI(Players.getLocal().getWorldLocation().getPlane(), llllllIIII[3])) {
                                    AccBuilderTempleTrek.c = lllllIllII[llllllIIII[19]];
                                    if (y.llIlIlIllIllI(Dialog.isOpen() ? 1 : 0)) {
                                        Dialog.close();
                                    }
                                    Movement.walkTo((WorldPoint)gf);

                                    Time.sleepTicks((int)llllllIIII[0]);

                                }
                                if (y.llIlIlIllllIl(Players.getLocal().getWorldLocation().distanceTo(gf), llllllIIII[7])) {
                                    g.a(lllllIllII[llllllIIII[20]], bQ);
                                }
                            }
                            if (!y.llIlIlIllllll(e.j(gp), llllllIIII[0])) break block82;
                            ck = llllllIIII[1];
                            var14 = new WorldArea(llllllIIII[21], llllllIIII[22], llllllIIII[18], llllllIIII[3], llllllIIII[1]);
                            var13 = new WorldArea(llllllIIII[23], llllllIIII[24], llllllIIII[25], llllllIIII[26], llllllIIII[0]);
                            var12 = new WorldArea(llllllIIII[23], llllllIIII[27], llllllIIII[28], llllllIIII[29], llllllIIII[3]);
                            var11 = new WorldArea(llllllIIII[30], llllllIIII[22], llllllIIII[31], llllllIIII[18], llllllIIII[1]);
                            var10 = new WorldArea(llllllIIII[32], llllllIIII[33], llllllIIII[34], llllllIIII[35], llllllIIII[1]);
                            var9 = new WorldArea(llllllIIII[36], llllllIIII[37], llllllIIII[38], llllllIIII[34], llllllIIII[1]);
                            if (!y.llIlIlIlllIII(var14.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !y.llIlIlIlllIII(var13.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !y.llIlIlIlllIII(var12.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !y.llIlIlIlllIII(var11.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !y.llIlIlIlllIII(var10.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !y.llIlIlIlllIII(var9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block83;
                            if (y.llIlIllIIIIII(Players.getLocal().getWorldLocation().distanceTo(gq), llllllIIII[3])) {
                                AccBuilderTempleTrek.c = lllllIllII[llllllIIII[34]];
                                e.C();
                                Movement.walkTo((WorldPoint)gq);

                                Time.sleepTicks((int)llllllIIII[0]);

                            }
                            if (!y.llIlIlIllllIl(Players.getLocal().getWorldLocation().distanceTo(gq), llllllIIII[3])) break block83;
                            String[] stringArray = new String[llllllIIII[0]];
                            stringArray[y.llllllIIII[1]] = lllllIllII[llllllIIII[13]];
                            if (!y.llIlIlIllIllI(Equipment.contains((String[])stringArray) ? 1 : 0)) break block84;
                            String[] stringArray2 = new String[llllllIIII[0]];
                            stringArray2[y.llllllIIII[1]] = lllllIllII[llllllIIII[38]];
                            if (!y.llIlIlIlllIII(Equipment.contains((String[])stringArray2) ? 1 : 0)) break block85;
                        }
                        String[] stringArray = new String[llllllIIII[0]];
                        stringArray[y.llllllIIII[1]] = lllllIllII[llllllIIII[2]];
                        if (y.llIlIlIllIllI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                            String[] stringArray3 = new String[llllllIIII[0]];
                            stringArray3[y.llllllIIII[1]] = lllllIllII[llllllIIII[35]];
                            Inventory.getFirst((String[])stringArray3).interact(lllllIllII[llllllIIII[39]]);
                        }
                        String[] stringArray4 = new String[llllllIIII[0]];
                        stringArray4[y.llllllIIII[1]] = lllllIllII[llllllIIII[16]];
                        if (y.llIlIlIllIllI(Inventory.contains((String[])stringArray4) ? 1 : 0)) {
                            String[] stringArray5 = new String[llllllIIII[0]];
                            stringArray5[y.llllllIIII[1]] = lllllIllII[llllllIIII[40]];
                            Inventory.getFirst((String[])stringArray5).interact(lllllIllII[llllllIIII[41]]);
                        }
                    }
                    if (y.llIlIlIllIllI(Inventory.contains((int[])f.aU) ? 1 : 0)) {
                        Inventory.getFirst((int[])f.aU).interact(lllllIllII[llllllIIII[42]]);
                    }
                    String[] stringArray = new String[llllllIIII[0]];
                    stringArray[y.llllllIIII[1]] = lllllIllII[llllllIIII[29]];
                    if (y.llIlIlIllIllI(Equipment.contains((String[])stringArray) ? 1 : 0)) {
                        String[] stringArray6 = new String[llllllIIII[0]];
                        stringArray6[y.llllllIIII[1]] = lllllIllII[llllllIIII[26]];
                        if (y.llIlIlIllIllI(Equipment.contains((String[])stringArray6) ? 1 : 0)) {
                            String[] stringArray7 = new String[llllllIIII[0]];
                            stringArray7[y.llllllIIII[1]] = lllllIllII[llllllIIII[43]];
                            TileObjects.getNearest((String[])stringArray7).interact(lllllIllII[llllllIIII[44]]);
                            Time.sleepTicks((int)llllllIIII[6]);

                        }
                    }
                }
                if (y.llIlIlIllIllI(var14.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllllIllII[llllllIIII[45]];
                    String[] stringArray = new String[llllllIIII[0]];
                    stringArray[y.llllllIIII[1]] = lllllIllII[llllllIIII[31]];
                    TileObjects.getNearest((String[])stringArray).interact(lllllIllII[llllllIIII[46]]);
                    Time.sleepTicks((int)llllllIIII[3]);

                }
                var8 = new WorldArea(llllllIIII[47], llllllIIII[48], llllllIIII[6], llllllIIII[5], llllllIIII[1]);
                var7 = new WorldArea(llllllIIII[47], llllllIIII[48], llllllIIII[6], llllllIIII[5], llllllIIII[0]);
                if (y.llIlIlIllIllI(var8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllllIllII[llllllIIII[49]];
                    var6 = TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (y.llIlIlIllIllI(tileObject.getName().equalsIgnoreCase(lllllIllII[llllllIIII[152]]) ? 1 : 0)) {
                            String[] stringArray = new String[llllllIIII[0]];
                            stringArray[y.llllllIIII[1]] = lllllIllII[llllllIIII[153]];
                            if (y.llIlIlIllIllI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                n2 = llllllIIII[0];

                                if (((0xB5 ^ 0x9D) & ~(0x91 ^ 0xB9)) == 0) return n2 != 0;
                                return false;
                            }
                        }
                        n2 = llllllIIII[1];
                        return n2 != 0;
                    });
                    var6.interact(lllllIllII[llllllIIII[50]]);
                    Time.sleepTicks((int)llllllIIII[3]);

                }
                if (y.llIlIlIllIllI(var7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllllIllII[llllllIIII[51]];
                    var6 = TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (y.llIlIlIllIllI(tileObject.getName().equalsIgnoreCase(lllllIllII[llllllIIII[150]]) ? 1 : 0)) {
                            String[] stringArray = new String[llllllIIII[0]];
                            stringArray[y.llllllIIII[1]] = lllllIllII[llllllIIII[151]];
                            if (y.llIlIlIllIllI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                n2 = llllllIIII[0];

                                if (((0xE1 ^ 0xC4) & ~(0x4B ^ 0x6E)) == 0) return n2 != 0;
                                return false;
                            }
                        }
                        n2 = llllllIIII[1];
                        return n2 != 0;
                    });
                    var6.interact(lllllIllII[llllllIIII[28]]);
                    Time.sleepTicks((int)llllllIIII[3]);

                }
                var6 = new WorldArea(llllllIIII[21], llllllIIII[52], llllllIIII[18], llllllIIII[18], llllllIIII[3]);
                var5 = new WorldPoint(llllllIIII[53], llllllIIII[22], llllllIIII[3]);
                if (y.llIlIlIllIllI(var6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllllIllII[llllllIIII[25]];
                    if (y.llIlIllIIIIII(Players.getLocal().getWorldLocation().distanceTo(var5), llllllIIII[0])) {
                        Movement.walkTo((WorldPoint)var5);

                        Time.sleepTicks((int)llllllIIII[0]);

                    }
                    if (y.llIlIlIllllIl(Players.getLocal().getWorldLocation().distanceTo(var5), llllllIIII[0])) {
                        var16 = TileObjects.getNearest(tileObject -> {
                            int n2;
                            if (y.llIlIlIllIllI(tileObject.getName().equalsIgnoreCase(lllllIllII[llllllIIII[148]]) ? 1 : 0)) {
                                String[] stringArray = new String[llllllIIII[0]];
                                stringArray[y.llllllIIII[1]] = lllllIllII[llllllIIII[149]];
                                if (y.llIlIlIllIllI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                    n2 = llllllIIII[0];

                                    if (-(0x10 ^ 0x14) < 0) return n2 != 0;
                                    return false;
                                }
                            }
                            n2 = llllllIIII[1];
                            return n2 != 0;
                        });
                        var16.interact(lllllIllII[llllllIIII[54]]);
                        Time.sleepTicks((int)llllllIIII[3]);

                    }
                }
                if (y.llIlIlIllIllI((var16 = new WorldArea(llllllIIII[55], llllllIIII[56], llllllIIII[13], llllllIIII[7], llllllIIII[0])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllllIllII[llllllIIII[57]];
                    String[] stringArray = new String[llllllIIII[0]];
                    stringArray[y.llllllIIII[1]] = lllllIllII[llllllIIII[58]];
                    String[] stringArray8 = new String[llllllIIII[0]];
                    stringArray8[y.llllllIIII[1]] = lllllIllII[llllllIIII[59]];
                    if (y.llIlIlIllIllI(TileObjects.getNearest((String[])stringArray).hasAction(stringArray8) ? 1 : 0)) {
                        String[] stringArray9 = new String[llllllIIII[0]];
                        stringArray9[y.llllllIIII[1]] = lllllIllII[llllllIIII[60]];
                        TileObjects.getNearest((String[])stringArray9).interact(lllllIllII[llllllIIII[61]]);
                        Time.sleepTicks((int)llllllIIII[5]);

                    }
                    String[] stringArray10 = new String[llllllIIII[0]];
                    stringArray10[y.llllllIIII[1]] = lllllIllII[llllllIIII[62]];
                    String[] stringArray11 = new String[llllllIIII[0]];
                    stringArray11[y.llllllIIII[1]] = lllllIllII[llllllIIII[63]];
                    if (y.llIlIlIlllIII(TileObjects.getNearest((String[])stringArray10).hasAction(stringArray11) ? 1 : 0)) {
                        if (y.llIlIllIIIIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllllIIII[64], llllllIIII[52], llllllIIII[0])), llllllIIII[3])) {
                            Movement.walkTo((WorldPoint)new WorldPoint(llllllIIII[64], llllllIIII[52], llllllIIII[0]));

                            Time.sleepTicks((int)llllllIIII[0]);

                        }
                        if (y.llIlIlIllllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllllIIII[64], llllllIIII[52], llllllIIII[0])), llllllIIII[3])) {
                            String[] stringArray12 = new String[llllllIIII[0]];
                            stringArray12[y.llllllIIII[1]] = lllllIllII[llllllIIII[65]];
                            TileObjects.getNearest((String[])stringArray12).interact(lllllIllII[llllllIIII[66]]);
                            Time.sleepTicks((int)llllllIIII[3]);

                        }
                    }
                }
                if (y.llIlIlIllIllI((var15 = new WorldArea(llllllIIII[36], llllllIIII[67], llllllIIII[19], llllllIIII[18], llllllIIII[3])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllllIllII[llllllIIII[68]];
                    if (y.llIlIllIIIIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllllIIII[32], llllllIIII[52], llllllIIII[3])), llllllIIII[0])) {
                        Movement.walkTo((WorldPoint)new WorldPoint(llllllIIII[32], llllllIIII[52], llllllIIII[3]));

                        Time.sleepTicks((int)llllllIIII[0]);

                    }
                    if (y.llIlIlIllllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllllIIII[32], llllllIIII[52], llllllIIII[3])), llllllIIII[0])) {
                        String[] stringArray = new String[llllllIIII[0]];
                        stringArray[y.llllllIIII[1]] = lllllIllII[llllllIIII[69]];
                        TileObjects.getNearest((String[])stringArray).interact(lllllIllII[llllllIIII[70]]);
                        Time.sleepTicks((int)llllllIIII[5]);

                    }
                }
                WorldArea var17 = new WorldArea(llllllIIII[32], llllllIIII[37], llllllIIII[7], llllllIIII[19], llllllIIII[0]);
                WorldArea var18 = new WorldArea(llllllIIII[71], llllllIIII[72], llllllIIII[19], llllllIIII[6], llllllIIII[0]);
                WorldArea var19 = new WorldArea(llllllIIII[71], llllllIIII[33], llllllIIII[18], llllllIIII[19], llllllIIII[0]);
                if (y.llIlIlIllIllI(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llllllIIII[32], llllllIIII[52], llllllIIII[0])) ? 1 : 0)) {
                    String[] stringArray = new String[llllllIIII[0]];
                    stringArray[y.llllllIIII[1]] = lllllIllII[llllllIIII[73]];
                    String[] stringArray13 = new String[llllllIIII[0]];
                    stringArray13[y.llllllIIII[1]] = lllllIllII[llllllIIII[74]];
                    if (y.llIlIlIllIllI(TileObjects.getNearest((String[])stringArray).hasAction(stringArray13) ? 1 : 0)) {
                        String[] stringArray14 = new String[llllllIIII[0]];
                        stringArray14[y.llllllIIII[1]] = lllllIllII[llllllIIII[75]];
                        TileObjects.getNearest((String[])stringArray14).interact(lllllIllII[llllllIIII[76]]);
                        Time.sleepTicks((int)llllllIIII[5]);

                    }
                }
                if (!y.llIlIlIlllIII(var18.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || y.llIlIlIllIllI(var17.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (y.llIlIlIllIllI(var18.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        String[] stringArray = new String[llllllIIII[0]];
                        stringArray[y.llllllIIII[1]] = lllllIllII[llllllIIII[77]];
                        String[] stringArray15 = new String[llllllIIII[0]];
                        stringArray15[y.llllllIIII[1]] = lllllIllII[llllllIIII[78]];
                        if (y.llIlIlIllIllI(TileObjects.getNearest((String[])stringArray).hasAction(stringArray15) ? 1 : 0)) {
                            String[] stringArray16 = new String[llllllIIII[0]];
                            stringArray16[y.llllllIIII[1]] = lllllIllII[llllllIIII[17]];
                            TileObjects.getNearest((String[])stringArray16).interact(lllllIllII[llllllIIII[79]]);
                            Time.sleepTicks((int)llllllIIII[5]);

                        }
                    }
                    if (y.llIlIlIllIllI(var19.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        TileObjects.getNearest(tileObject -> {
                            int n2;
                            if (y.llIlIlIllIllI(tileObject.getName().equalsIgnoreCase(lllllIllII[llllllIIII[146]]) ? 1 : 0)) {
                                String[] stringArray = new String[llllllIIII[0]];
                                stringArray[y.llllllIIII[1]] = lllllIllII[llllllIIII[147]];
                                if (y.llIlIlIllIllI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                    n2 = llllllIIII[0];

                                    if (1 != 2) return n2 != 0;
                                    return ((0x7C ^ 0x66 ^ (0x63 ^ 0x27)) & (51 + 36 - 6 + 73 ^ 166 + 107 - 247 + 170 ^ -1)) != 0;
                                }
                            }
                            n2 = llllllIIII[1];
                            return n2 != 0;
                        }).interact(lllllIllII[llllllIIII[80]]);
                        Time.sleepTicks((int)llllllIIII[5]);

                    }
                }
                WorldArea var20 = new WorldArea(llllllIIII[71], llllllIIII[37], llllllIIII[19], llllllIIII[0], llllllIIII[1]);
                WorldArea var21 = new WorldArea(llllllIIII[32], llllllIIII[33], llllllIIII[3], llllllIIII[7], llllllIIII[1]);
                if (!y.llIlIlIlllIII(var20.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || y.llIlIlIllIllI(var21.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (y.llIlIlIlllIII(Dialog.isOpen() ? 1 : 0)) {
                        String[] stringArray = new String[llllllIIII[0]];
                        stringArray[y.llllllIIII[1]] = lllllIllII[llllllIIII[81]];
                        TileObjects.getNearest((String[])stringArray).interact(lllllIllII[llllllIIII[82]]);
                        Time.sleepTicks((int)llllllIIII[5]);

                    }
                    g.a(bQ);
                }
            }
            if (y.llIlIlIllllll(e.j(gp), llllllIIII[3])) {
                if (y.llIlIlIllIllI(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llllllIIII[83], llllllIIII[84], llllllIIII[1])) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllllIllII[llllllIIII[85]];
                    String[] stringArray = new String[llllllIIII[0]];
                    stringArray[y.llllllIIII[1]] = lllllIllII[llllllIIII[86]];
                    TileObjects.getNearest((String[])stringArray).interact(lllllIllII[llllllIIII[87]]);
                    Time.sleepTicks((int)llllllIIII[3]);

                }
                var14 = new WorldArea(llllllIIII[88], llllllIIII[72], llllllIIII[18], llllllIIII[6], llllllIIII[0]);
                var13 = new WorldPoint(llllllIIII[32], llllllIIII[67], llllllIIII[0]);
                var12 = new WorldPoint(llllllIIII[32], llllllIIII[37], llllllIIII[0]);
                var11 = new WorldPoint(llllllIIII[32], llllllIIII[56], llllllIIII[0]);
                if (!(y.llIlIlIlllIII(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llllllIIII[89], llllllIIII[37], llllllIIII[0])) ? 1 : 0) && y.llIlIlIlllIII(var14.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && y.llIlIlIlllIII(Players.getLocal().getWorldLocation().equals((Object)var13) ? 1 : 0) && y.llIlIlIlllIII(Players.getLocal().getWorldLocation().equals((Object)var12) ? 1 : 0) && !y.llIlIlIllIllI(Players.getLocal().getWorldLocation().equals((Object)var11) ? 1 : 0))) {
                    AccBuilderTempleTrek.c = lllllIllII[llllllIIII[90]];
                    String[] stringArray = new String[llllllIIII[0]];
                    stringArray[y.llllllIIII[1]] = lllllIllII[llllllIIII[91]];
                    TileObjects.getNearest((String[])stringArray).interact(lllllIllII[llllllIIII[92]]);
                    Time.sleepTicks((int)llllllIIII[3]);

                }
                if (y.llIlIlIllIllI(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llllllIIII[83], llllllIIII[67], llllllIIII[0])) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllllIllII[llllllIIII[93]];
                    Time.sleepTicks((int)llllllIIII[5]);

                    String[] stringArray = new String[llllllIIII[0]];
                    stringArray[y.llllllIIII[1]] = lllllIllII[llllllIIII[94]];
                    TileObjects.getNearest((String[])stringArray).interact(lllllIllII[llllllIIII[95]]);
                    Time.sleepTicks((int)llllllIIII[3]);

                }
                if (y.llIlIlIllIllI(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llllllIIII[32], llllllIIII[52], llllllIIII[3])) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllllIllII[llllllIIII[96]];
                    Movement.walkTo((WorldPoint)new WorldPoint(llllllIIII[64], llllllIIII[52], llllllIIII[3]));

                    Time.sleepTicks((int)llllllIIII[3]);

                }
                if (y.llIlIlIllIllI(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llllllIIII[64], llllllIIII[52], llllllIIII[3])) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllllIllII[llllllIIII[97]];
                    String[] stringArray = new String[llllllIIII[0]];
                    stringArray[y.llllllIIII[1]] = lllllIllII[llllllIIII[98]];
                    TileObjects.getNearest((String[])stringArray).interact(lllllIllII[llllllIIII[99]]);
                    Time.sleepTicks((int)llllllIIII[3]);

                }
                if (y.llIlIlIllIllI((var10 = new WorldArea(llllllIIII[55], llllllIIII[56], llllllIIII[13], llllllIIII[7], llllllIIII[0])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] stringArray = new String[llllllIIII[0]];
                    stringArray[y.llllllIIII[1]] = lllllIllII[llllllIIII[100]];
                    String[] stringArray17 = new String[llllllIIII[0]];
                    stringArray17[y.llllllIIII[1]] = lllllIllII[llllllIIII[101]];
                    if (y.llIlIlIllIllI(TileObjects.getNearest((String[])stringArray).hasAction(stringArray17) ? 1 : 0)) {
                        String[] stringArray18 = new String[llllllIIII[0]];
                        stringArray18[y.llllllIIII[1]] = lllllIllII[llllllIIII[102]];
                        TileObjects.getNearest((String[])stringArray18).interact(lllllIllII[llllllIIII[103]]);
                        Time.sleepTicks((int)llllllIIII[3]);

                    }
                    String[] stringArray19 = new String[llllllIIII[0]];
                    stringArray19[y.llllllIIII[1]] = lllllIllII[llllllIIII[104]];
                    String[] stringArray20 = new String[llllllIIII[0]];
                    stringArray20[y.llllllIIII[1]] = lllllIllII[llllllIIII[105]];
                    if (y.llIlIlIlllIII(TileObjects.getNearest((String[])stringArray19).hasAction(stringArray20) ? 1 : 0)) {
                        if (y.llIlIlIlllIII(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llllllIIII[53], llllllIIII[22], llllllIIII[0])) ? 1 : 0)) {
                            Movement.walkTo((WorldPoint)new WorldPoint(llllllIIII[53], llllllIIII[22], llllllIIII[0]));

                            Time.sleepTicks((int)llllllIIII[0]);

                        }
                        if (y.llIlIlIllIllI(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llllllIIII[53], llllllIIII[22], llllllIIII[0])) ? 1 : 0)) {
                            String[] stringArray21 = new String[llllllIIII[0]];
                            stringArray21[y.llllllIIII[1]] = lllllIllII[llllllIIII[106]];
                            TileObjects.getNearest((String[])stringArray21).interact(lllllIllII[llllllIIII[107]]);
                            Time.sleepTicks((int)llllllIIII[3]);

                        }
                    }
                }
                if (y.llIlIlIllIllI(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llllllIIII[53], llllllIIII[22], llllllIIII[3])) ? 1 : 0)) {
                    Movement.walkTo((int)llllllIIII[108], (int)llllllIIII[109], (int)llllllIIII[3]);

                    Time.sleepTicks((int)llllllIIII[3]);

                }
                if (y.llIlIlIllIllI(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llllllIIII[108], llllllIIII[109], llllllIIII[3])) ? 1 : 0)) {
                    String[] stringArray = new String[llllllIIII[0]];
                    stringArray[y.llllllIIII[1]] = lllllIllII[llllllIIII[110]];
                    TileObjects.getNearest((String[])stringArray).interact(lllllIllII[llllllIIII[111]]);
                    Time.sleepTicks((int)llllllIIII[3]);

                }
                if (y.llIlIlIllIllI(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llllllIIII[108], llllllIIII[109], llllllIIII[0])) ? 1 : 0)) {
                    Time.sleepTicks((int)llllllIIII[3]);

                    TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (y.llIlIlIllIllI(tileObject.getName().equalsIgnoreCase(lllllIllII[llllllIIII[144]]) ? 1 : 0)) {
                            String[] stringArray = new String[llllllIIII[0]];
                            stringArray[y.llllllIIII[1]] = lllllIllII[llllllIIII[145]];
                            if (y.llIlIlIllIllI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                n2 = llllllIIII[0];

                                if (null == null) return n2 != 0;
                                return ((105 + 13 - 8 + 137 ^ 168 + 108 - 177 + 78) & (6 ^ 0x34 ^ (0x62 ^ 0x16) ^ -1)) != 0;
                            }
                        }
                        n2 = llllllIIII[1];
                        return n2 != 0;
                    }).interact(lllllIllII[llllllIIII[112]]);
                    Time.sleepTicks((int)llllllIIII[3]);

                }
                if (y.llIlIlIllIllI(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llllllIIII[55], llllllIIII[109], llllllIIII[1])) ? 1 : 0)) {
                    Time.sleepTicks((int)llllllIIII[3]);

                    String[] stringArray = new String[llllllIIII[0]];
                    stringArray[y.llllllIIII[1]] = lllllIllII[llllllIIII[113]];
                    TileObjects.getNearest((String[])stringArray).interact(lllllIllII[llllllIIII[114]]);
                    Time.sleepTicks((int)llllllIIII[3]);

                }
                if (y.llIlIlIllIllI(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llllllIIII[108], llllllIIII[115], llllllIIII[1])) ? 1 : 0)) {
                    Time.sleepTicks((int)llllllIIII[3]);

                    String[] stringArray = new String[llllllIIII[0]];
                    stringArray[y.llllllIIII[1]] = lllllIllII[llllllIIII[116]];
                    TileObjects.getNearest((String[])stringArray).interact(lllllIllII[llllllIIII[117]]);
                    Time.sleepTicks((int)llllllIIII[3]);

                }
                var9 = new WorldArea(llllllIIII[30], llllllIIII[22], llllllIIII[35], llllllIIII[3], llllllIIII[1]);
                var8 = NPCs.getNearest(nPC -> {
                    int n2;
                    if (y.llIlIlIllIllI(nPC.getName().contains(lllllIllII[llllllIIII[140]]) ? 1 : 0) && y.llIlIlIllllIl(nPC.getWorldLocation().distanceTo(new WorldPoint(llllllIIII[88], llllllIIII[22], llllllIIII[1])), llllllIIII[0]) && y.llIlIllIIIIlI(nPC.getInteracting(), Players.getLocal())) {
                        n2 = llllllIIII[0];

                        if ((0xAC ^ 0xA9 ^ 1) <= 0) {
                            return ((0x2C ^ 0x31 ^ (0x2D ^ 0x16)) & (0xF6 ^ 0x81 ^ (0x61 ^ 0x30) ^ -1)) != 0;
                        }
                    } else {
                        n2 = llllllIIII[1];
                    }
                    return n2 != 0;
                });
                if (y.llIlIlIllIllI(var9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && y.llIlIlIlllIlI(var8)) {
                    AccBuilderTempleTrek.c = lllllIllII[llllllIIII[118]];
                    e.b(new WorldPoint(llllllIIII[119], llllllIIII[22], llllllIIII[1]));
                    Time.sleepTicks((int)llllllIIII[34]);

                }
                if (!y.llIlIlIlllIII(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llllllIIII[88], llllllIIII[22], llllllIIII[1])) ? 1 : 0) || y.llIlIlIllIllI(var9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    var8 = NPCs.getNearest(nPC -> {
                        int n2;
                        if (y.llIlIlIllIllI(nPC.getName().contains(lllllIllII[llllllIIII[143]]) ? 1 : 0) && y.llIlIlIllllIl(nPC.getWorldLocation().distanceTo(new WorldPoint(llllllIIII[88], llllllIIII[22], llllllIIII[1])), llllllIIII[3]) && y.llIlIllIIIIlI(nPC.getInteracting(), Players.getLocal())) {
                            n2 = llllllIIII[0];

                            if (((0xB6 ^ 0xB1) & ~(0x13 ^ 0x14)) <= -1) {
                                return false;
                            }
                        } else {
                            n2 = llllllIIII[1];
                        }
                        return n2 != 0;
                    });
                    if (y.llIlIlIlllIII(Dialog.isOpen() ? 1 : 0) && y.llIlIllIIIIIl(var8)) {
                        String[] stringArray = new String[llllllIIII[0]];
                        stringArray[y.llllllIIII[1]] = lllllIllII[llllllIIII[120]];
                        TileObjects.getNearest((String[])stringArray).interact(lllllIllII[llllllIIII[121]]);
                        Time.sleepTicks((int)llllllIIII[0]);

                    }
                    while (y.llIlIlIllIllI(Dialog.isOpen() ? 1 : 0)) {
                        g.a(bQ);
                        Time.sleep((long)50L);

                        if ((0x57 ^ 0x53) == (0x5E ^ 0x5A)) continue;
                        return;
                    }
                }
                if (y.llIlIlIllIllI(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llllllIIII[71], llllllIIII[22], llllllIIII[1])) ? 1 : 0)) {
                    Time.sleepTicks((int)llllllIIII[3]);

                    String[] stringArray = new String[llllllIIII[0]];
                    stringArray[y.llllllIIII[1]] = lllllIllII[llllllIIII[122]];
                    TileObjects.getNearest((String[])stringArray).interact(lllllIllII[llllllIIII[123]]);
                    Time.sleepTicks((int)llllllIIII[3]);

                }
                var7 = new WorldArea(llllllIIII[89], llllllIIII[48], llllllIIII[38], llllllIIII[5], llllllIIII[0]);
                var6 = new WorldArea(llllllIIII[124], llllllIIII[67], llllllIIII[6], llllllIIII[34], llllllIIII[0]);
                if (!y.llIlIlIlllIII(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llllllIIII[89], llllllIIII[48], llllllIIII[0])) ? 1 : 0) || !y.llIlIlIlllIII(var7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || y.llIlIlIllIllI(var6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (y.llIlIlIllIllI(Inventory.contains((int[])f.aU) ? 1 : 0) && y.llIlIlIllIlll(Movement.getRunEnergy(), llllllIIII[97])) {
                        Inventory.getFirst((int[])f.aU).interact(lllllIllII[llllllIIII[125]]);
                        Time.sleepTicks((int)llllllIIII[3]);

                    }
                    Time.sleepTicks((int)llllllIIII[3]);

                    String[] stringArray = new String[llllllIIII[0]];
                    stringArray[y.llllllIIII[1]] = lllllIllII[llllllIIII[126]];
                    TileObjects.getNearest((String[])stringArray).interact(lllllIllII[llllllIIII[127]]);
                    Time.sleepTicks((int)llllllIIII[3]);

                }
                if (y.llIlIlIllIllI((var5 = new WorldArea(llllllIIII[32], llllllIIII[27], llllllIIII[34], llllllIIII[19], llllllIIII[0])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && y.llIlIlIlllIII(Dialog.isOpen() ? 1 : 0)) {
                    String[] stringArray = new String[llllllIIII[0]];
                    stringArray[y.llllllIIII[1]] = lllllIllII[llllllIIII[128]];
                    if (y.llIlIlIllIllI(Inventory.contains((String[])stringArray) ? 1 : 0) && y.llIlIlIlllIII(Players.getLocal().isMoving() ? 1 : 0)) {
                        String[] stringArray22 = new String[llllllIIII[0]];
                        stringArray22[y.llllllIIII[1]] = lllllIllII[llllllIIII[129]];
                        String[] stringArray23 = new String[llllllIIII[0]];
                        stringArray23[y.llllllIIII[1]] = lllllIllII[llllllIIII[130]];
                        Inventory.getFirst((String[])stringArray22).useOn(TileObjects.getNearest((String[])stringArray23));
                        Time.sleepTicks((int)llllllIIII[3]);

                    }
                }
                g.a(bQ);
            }
            if (y.llIlIlIllllll(e.j(gp), llllllIIII[5])) {
                var14 = new WorldArea(llllllIIII[32], llllllIIII[27], llllllIIII[34], llllllIIII[19], llllllIIII[0]);
                if (y.llIlIlIllIllI(var14.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    int[] nArray = new int[llllllIIII[0]];
                    nArray[y.llllllIIII[1]] = llllllIIII[9];
                    Inventory.getFirst((int[])nArray).interact(lllllIllII[llllllIIII[131]]);
                    Time.sleepTicks((int)llllllIIII[7]);

                }
                if (y.llIlIlIlllIII(var14.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (!y.llIlIlIllllIl(Players.getLocal().getWorldLocation().distanceTo(gf), llllllIIII[7]) || y.llIlIlIlllllI(Players.getLocal().getWorldLocation().getPlane(), llllllIIII[3])) {
                        AccBuilderTempleTrek.c = lllllIllII[llllllIIII[132]];
                        if (y.llIlIlIllIllI(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        e.D();
                        Movement.walkTo((WorldPoint)gf);

                        Time.sleepTicks((int)llllllIIII[0]);

                    }
                    if (y.llIlIlIllllIl(Players.getLocal().getWorldLocation().distanceTo(gf), llllllIIII[7])) {
                        if (y.llIlIlIllIlll(ck, llllllIIII[0])) {
                            ac.nc += llllllIIII[0];
                            ac.d(AccBuilderTempleTrek.m);
                            ck += llllllIIII[0];
                            ac.nc = llllllIIII[1];
                            cl = llllllIIII[1];
                        }
                        g.a(lllllIllII[llllllIIII[133]], bQ);
                    }
                }
            }
            g.a(new String[llllllIIII[1]]);
        }
    }

    private static boolean llIlIllIIIIlI(Object object, Object object2) {
        return object == object2;
    }

        return String.valueOf(var22);
    }

    private static boolean llIlIlIlllIll(int n2) {
        return n2 > 0;
    }

    static {
        y.llIlIlIllIlII();
        y.llIlIlIllIIll();
        bu = new ArrayList<d>();
        gp = llllllIIII[154];
        gf = new WorldPoint(llllllIIII[155], llllllIIII[156], llllllIIII[3]);
        gq = new WorldPoint(llllllIIII[108], llllllIIII[157], llllllIIII[1]);
        String[] stringArray = new String[llllllIIII[6]];
        stringArray[y.llllllIIII[1]] = lllllIllII[llllllIIII[158]];
        stringArray[y.llllllIIII[0]] = lllllIllII[llllllIIII[159]];
        stringArray[y.llllllIIII[3]] = lllllIllII[llllllIIII[160]];
        stringArray[y.llllllIIII[5]] = lllllIllII[llllllIIII[161]];
        bQ = stringArray;
    }

    @Override
    public boolean S() {
        return llllllIIII[1];
    }

    private static boolean llIlIlIlllIII(int n2) {
        return n2 == 0;
    }
}

