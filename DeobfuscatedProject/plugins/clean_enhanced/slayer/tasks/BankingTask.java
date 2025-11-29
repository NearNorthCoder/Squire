/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.coords.WorldArea
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.query.results.ItemQueryResults
 */
package gg.squire.slayer.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.slayer.SquireSkipperConfig;
import gg.squire.slayer.SquireSkipperPlugin;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.query.results.ItemQueryResults;
import gg.squire.slayer.tasks.GameEnum;

@TaskDesc(name="Banking", priority=1337)
public class BankingTask
extends Task {
    private static final  int[] u;
    
    private final  SquireSkipperPlugin w;
    private static final  int[] t;
    private static final  int[] v;
    
    private  BankLocation y;
    private final  SquireSkipperConfig x;

    @Inject
    public BankingTask(SquireSkipperPlugin squireSkipperPlugin, SquireSkipperConfig squireSkipperConfig) {
        this.w = squireSkipperPlugin;
        this.x = squireSkipperConfig;
    }

    private static boolean var3(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(int[] nArray) {
        void var4;
        int[] nArray2 = nArray;
        int n2 = nArray2.length;
        int var5 = var2[0];
        while (d.var6(var5, (int)var4)) {
            d var7;
            void var8;
            void var9 = var8[var5];
            if (d.var10(var7.g((int)var9) ? 1 : 0)) {
                return var2[1];
            }
            ++var5;
            0;
            if (1 < (30 + 46 - -48 + 36 ^ 19 + 124 - 127 + 148)) continue;
            return ((124 + 164 - 97 + 17 ^ 8 + 127 - 72 + 70) & (98 + 100 - 164 + 181 ^ 128 + 71 - 117 + 48 ^ -1)) != 0;
        }
        return var2[0];
    }

    public boolean run() {
        b var11;
        d var12;
        if (d.var10(this.r() ? 1 : 0)) {
            this.w.c(var2[0]);
            this.y = null;
            return var2[0];
        }
        var12.w.c(var2[1]);
        if (d.var13(var12.y)) {
            if (d.var10(Inventory.contains(item -> item.getName().contains(var1[var2[18]])) ? 1 : 0)) {
                var12.y = BankLocation.CRAFTING_GUILD;
                0;
                if null != null {
                    return ((0x7A ^ 0x71) & ~(0xBE ^ 0xB5)) != 0;
                }
            } else {
                var12.y = BankLocation.getNearest();
            }
        }
        System.out.println("Banking at " + var12.y.toString());
        WorldArea var14 = var12.y.getArea();
        if (d.var15(Bank.isOpen() ? 1 : 0)) {
            if (d.var10(Bank.open() ? 1 : 0)) {
                System.out.println(var1[var2[0]]);
                return var2[1];
            }
            if (d.var16(var14) && d.var15(var14.contains((Locatable)Players.getLocal()) ? 1 : 0) && d.var10(Movement.shouldWalk() ? 1 : 0)) {
                Movement.walkTo((BankLocation)var12.y);
                0;
                return var2[1];
            }
        }
        if (d.var10(Inventory.isFull() ? 1 : 0)) {
            if (d.var10(Inventory.contains(item -> item.getName().contains(var1[var2[17]])) ? 1 : 0)) {
                Bank.deposit(item -> item.getName().contains(var1[var2[16]]), (int)var2[1]);
                0;
                if null != null {
                    return ((0x9C ^ 0x82) & ~(0x5B ^ 0x45)) != 0;
                }
            } else {
                Bank.depositInventory();
            }
            return var2[1];
        }
        if (d.var10(var12.x.sipStam() ? 1 : 0)) {
            var12.b(var1[var2[1]], var2[1]);
            0;
        }
        if (d.var10(var12.x.gamesNecklace() ? 1 : 0)) {
            var12.b(var1[var2[2]], var2[1]);
            0;
        }
        if (d.var10(var12.x.antiPoison() ? 1 : 0)) {
            var12.a(item -> {
                int n2;
                if (!d.var15(item.getName().toLowerCase().contains(var1[var2[14]]) ? 1 : 0) || d.var10(item.getName().toLowerCase().contains(var1[var2[15]]) ? 1 : 0)) {
                    n2 = var2[1];
                    0;
                    if (2 <= -1) {
                        return ((0x5A ^ 0x47) & ~(0x80 ^ 0x9D)) != 0;
                    }
                } else {
                    n2 = var2[0];
                }
                return n2 != 0;
            }, var2[1]);
            0;
        }
        int[] nArray = new int[var2[1]];
        nArray[d.var2[0]] = var12.x.foodID();
        if (d.var15(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[var2[1]];
            nArray2[d.var2[0]] = var12.x.foodID();
            if (d.var15(Bank.contains((int[])nArray2) ? 1 : 0)) {
                System.out.println(var1[var2[3]]);
                return var2[0];
            }
            Bank.withdraw((int)var12.x.foodID(), (int)var12.x.foodAmount(), (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
        }
        if (d.var10(var12.x.slayerRing() ? 1 : 0)) {
            var12.b(var1[var2[4]], var2[1]);
            0;
        }
        if (d.var16((Object)(var11 = var12.w.b()))) {
            List<Integer> llllllllllllllIllIlllIIlIllIIlIl2;
            if (d.var10(var11.o() ? 1 : 0) && d.var15(var12.a(t) ? 1 : 0)) {
                int n2;
                if (d.var17(Inventory.getFreeSlots(), var2[5])) {
                    n2 = Inventory.getFreeSlots() - var2[3];
                    0;
                    if null != null {
                        return ((0xCF ^ 0x8D ^ (0x6C ^ 8)) & (92 + 40 - 45 + 77 ^ 24 + 91 - 94 + 109 ^ -1)) != 0;
                    }
                } else {
                    n2 = var2[1];
                }
                int llllllllllllllIllIlllIIlIllIIlIl2 = n2;
                var12.a(t, llllllllllllllIllIlllIIlIllIIlIl2);
                0;
            }
            if (d.var10(var11.q() ? 1 : 0) && d.var15(var12.a(u) ? 1 : 0)) {
                var12.a(u, var2[1]);
                0;
            }
            if (d.var16(llllllllllllllIllIlllIIlIllIIlIl2 = var11.p())) {
                Iterator<Integer> var18 = llllllllllllllIllIlllIIlIllIIlIl2.iterator();
                while (d.var10(var18.hasNext() ? 1 : 0)) {
                    int var19 = var18.next();
                    if (d.var10(var12.h(var19) ? 1 : 0) && d.var10(var12.i(var1[var2[5]]) ? 1 : 0)) {
                        0;
                        if (-1 != 1) continue;
                        return ((0x33 ^ 0x4D ^ (0x69 ^ 0x26)) & (18 + 88 - 80 + 141 ^ 119 + 148 - 266 + 149 ^ -1)) != 0;
                    }
                    if (d.var3(var19, var2[6])) {
                        0;
                        if (-(0x54 ^ 0x50) < 0) continue;
                        return ((0x2A ^ 0xD) & ~(0x59 ^ 0x7E)) != 0;
                    }
                    if (d.var15(var12.g(var19) ? 1 : 0)) {
                        if (d.var3(var19, var2[7])) {
                            var12.a(var19, var2[8]);
                            0;
                        }
                        var12.a(var19, var2[1]);
                        0;
                    }
                    0;
                    if (1 < 2) continue;
                    return ((0xB ^ 0x55) & ~(0x12 ^ 0x4C)) != 0;
                }
            }
        }
        return var2[1];
    }

    private static boolean var10(int n2) {
        return n2 != 0;
    }

    private boolean i(String string) {
        boolean bl;
        if (!d.var15(Inventory.contains(item -> item.getName().toLowerCase().contains(string.toLowerCase())) ? 1 : 0) || d.var10(Equipment.contains(item -> item.getName().toLowerCase().contains(string.toLowerCase())) ? 1 : 0)) {
            bl = var2[1];
            0;
            if (1 <= -1) {
                return ((0x9B ^ 0x87 ^ (0xC6 ^ 0x95)) & (0x19 ^ 0x76 ^ (0x56 ^ 0x76) ^ -1) & ((0x4F ^ 0x56 ^ (0x16 ^ 0x5B)) & (145 + 34 - 105 + 127 ^ 66 + 145 - 165 + 111 ^ -1) ^ -1)) != 0;
            }
        } else {
            bl = var2[0];
        }
        return bl;
    }

    static {
        d.var20();
        d.var21();
        int[] nArray = new int[var2[4]];
        nArray[d.var2[0]] = var2[19];
        nArray[d.var2[1]] = var2[20];
        nArray[d.var2[2]] = var2[21];
        nArray[d.var2[3]] = var2[22];
        t = nArray;
        int[] nArray2 = new int[var2[12]];
        nArray2[d.var2[0]] = var2[23];
        nArray2[d.var2[1]] = var2[24];
        nArray2[d.var2[2]] = var2[25];
        nArray2[d.var2[3]] = var2[26];
        nArray2[d.var2[4]] = var2[27];
        nArray2[d.var2[5]] = var2[28];
        nArray2[d.var2[9]] = var2[29];
        nArray2[d.var2[10]] = var2[30];
        nArray2[d.var2[11]] = var2[31];
        u = nArray2;
        int[] nArray3 = new int[var2[5]];
        nArray3[d.var2[0]] = var2[32];
        nArray3[d.var2[1]] = var2[33];
        nArray3[d.var2[2]] = var2[34];
        nArray3[d.var2[3]] = var2[35];
        nArray3[d.var2[4]] = var2[36];
        v = nArray3;
    }

    private static boolean var16(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(Predicate<Item> predicate, int n2) {
        void var22;
        if (d.var10(Inventory.contains(predicate) ? 1 : 0)) {
            return var2[1];
        }
        if (d.var15(Bank.isOpen() ? 1 : 0)) {
            return var2[0];
        }
        if (d.var15(Bank.contains((Predicate)var22) ? 1 : 0)) {
            System.out.println("You ran out of " + String.valueOf(var22));
            return var2[0];
        }
        Bank.withdraw(predicate, (int)n2, (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
        return var2[1];
    }

    private static String var23(String var24, String var25) {
        var24 = new String(Base64.getDecoder().decode(var24.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var26 = new StringBuilder();
        char[] var27 = var25.toCharArray();
        int var28 = var2[0];
        char[] var29 = var24.toCharArray();
        int var30 = var29.length;
        int var31 = var2[0];
        while (d.var6(var31, var30)) {
            char var32 = var29[var31];
            var26.append((char)(var32 ^ var27[var28 % var27.length]));
            0;
            ++var28;
            ++var31;
            0;
            
            return null;
        }
        return String.valueOf(var26);
    }

    /*
     * WARNING - void declaration
     */
    private boolean h(int n2) {
        void var33;
        int[] nArray = v;
        int n3 = nArray.length;
        int var34 = var2[0];
        while (d.var6(var34, (int)var33)) {
            void var35;
            void var36;
            void var37 = var36[var34];
            if (d.var3((int)var37, (int)var35)) {
                return var2[1];
            }
            ++var34;
            0;
            if (1 == 1) continue;
            return ((7 ^ 0x2B ^ (0x3D ^ 0x1E)) & (0xFB ^ 0xC6 ^ (3 ^ 0x31) ^ -1)) != 0;
        }
        return var2[0];
    }

    private static boolean var13(Object object) {
        return object == null;
    }

    private static boolean var17(int n2, int n3) {
        return n2 > n3;
    }

    public boolean b(String string, int n2) {
        return this.a(item -> item.getName().toLowerCase().contains(string.toLowerCase()), n2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean g(int n2) {
        int n3;
        block3: {
            block2: {
                int[] nArray = new int[var2[1]];
                nArray[d.var2[0]] = n2;
                if (!d.var15(Inventory.contains((int[])nArray) ? 1 : 0)) break block2;
                int[] nArray2 = new int[var2[1]];
                nArray2[d.var2[0]] = n2;
                if (!d.var10(Equipment.contains((int[])nArray2) ? 1 : 0)) break block3;
            }
            n3 = var2[1];
            0;
            if (1 < 2) return n3 != 0;
            return ((0x2C ^ 0x35) & ~(0xA ^ 0x13)) != 0;
        }
        n3 = var2[0];
        return n3 != 0;
    }

        catch (Exception var43) {
            var43.printStackTrace();
            return null;
        }
    }

    private static void var20() {
        var2 = new int[38];
        d.var2[0] = (245 + 34 - 168 + 138 ^ 131 + 62 - 87 + 76) & (119 + 16 - 55 + 170 ^ 77 + 121 - 95 + 78 ^ -1);
        d.var2[1] = 1;
        d.var2[2] = 2;
        d.var2[3] = 3;
        d.var2[4] = 9 ^ 0x16 ^ (0x8F ^ 0x94);
        d.var2[5] = 0xB9 ^ 0xBC;
        d.var2[6] = -1;
        d.var2[7] = -(0xFFFFB3CF & 0x6DB7) & (0xFFFFBBBF & 0x7FEE);
        d.var2[8] = -1 & (0xFFFFFFFF & Integer.MAX_VALUE);
        d.var2[9] = 0x1E ^ 0x3F ^ (0x40 ^ 0x67);
        d.var2[10] = 0x56 ^ 0x51;
        d.var2[11] = 0x4F ^ 9 ^ (0x49 ^ 7);
        d.var2[12] = 93 + 170 - 112 + 26 ^ 166 + 42 - 90 + 66;
        d.var2[13] = 0x46 ^ 0x4C;
        d.var2[14] = 0x82 ^ 0x89;
        d.var2[15] = 0x99 ^ 0xBA ^ (0xA9 ^ 0x86);
        d.var2[16] = 0x7B ^ 0x76;
        d.var2[17] = 0x62 ^ 0x6C;
        d.var2[18] = 0x6C ^ 0x2D ^ (0xE8 ^ 0xA6);
        d.var2[19] = 0xFFFFA7BD & 0x5F67;
        d.var2[20] = -(0xFFFFECCD & 0x7BFF) & (0xFFFFEFFF & 0x7FEF);
        d.var2[21] = 0xFFFF9F2F & 0x67F1;
        d.var2[22] = -(0xFFFFABDD & 0x74E3) & (0xFFFFEFFF & 0x37DF);
        d.var2[23] = -(59 + 150 - 47 + 5) & (0xFFFFFFF7 & 0x33FF);
        d.var2[24] = 0xFFFFBB5B & 0x77F6;
        d.var2[25] = -(0xFFFFAF6F & 0x589D) & (0xFFFFBFFF & 0x7B5F);
        d.var2[26] = 0xFFFFBB74 & 0x77DF;
        d.var2[27] = -(0xFFFFFB3D & 0x6CCF) & (0xFFFFFDBF & 0x7BFF);
        d.var2[28] = -(0xFFFFFE37 & 0x45E9) & (0xFFFFD7EF & 0x7DF6);
        d.var2[29] = -(0xFFFFF4B7 & 0x6F6A) & (0xFFFFFF7F & 0x76FF);
        d.var2[30] = -(0xFFFFF5B5 & 0x4ECB) & (0xFFFFFFFF & 0x67E9);
        d.var2[31] = -(0xFFFF9F26 & 0x67DF) & (0xFFFFFFFF & 0x6FDD);
        d.var2[32] = 0xFFFFB16F & 0x5ED6;
        d.var2[33] = 0xFFFFD4E5 & 0x3B5E;
        d.var2[34] = 0xFFFFB7CC & 0x587B;
        d.var2[35] = -(0xFFFFF9F3 & 0x4E3D) & (0xFFFFFFF7 & 0x59FF);
        d.var2[36] = 0xFFFFF7FF & 0x696E;
        d.var2[37] = 0x76 ^ 0x56 ^ (0x38 ^ 8);
    }

    private static boolean var6(int n2, int n3) {
        return n2 < n3;
    }

        catch (Exception var49) {
            var49.printStackTrace();
            return null;
        }
    }

    private static boolean var15(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(int[] nArray, int n2) {
        void var50;
        if (d.var15(Bank.isOpen() ? 1 : 0)) {
            return var2[0];
        }
        Item var51 = (Item)((ItemQueryResults)Inventory.query().ids((int[])var50).results()).first();
        ItemQueryResults var52 = (ItemQueryResults)Bank.query().ids((int[])var50).results();
        if (d.var13(var51)) {
            void var53;
            if (d.var10(var52.isEmpty() ? 1 : 0)) {
                System.out.println("You do not have any of " + Arrays.toString((int[])var50));
                return var2[0];
            }
            Bank.withdraw((int)((Item)var52.first()).getId(), (int)var53, (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
            return var2[1];
        }
        return var2[1];
    }

    private static void var21() {
        var1 = new String[var2[37]];
        d.var1[d.var2[0]] = "Found bank, and we are opening";
        d.var1[d.var2[1]] = "Stamina";
        d.var1[d.var2[2]] = "Games";
        d.var1[d.var2[3]] = "You ran out of food.";
        d.var1[d.var2[4]] = "slayer ring";
        d.var1[d.var2[5]] = "slayer helm";
        d.var1[d.var2[9]] = "slayer helm";
        d.var1[d.var2[10]] = "slayer ring";
        d.var1[d.var2[11]] = "anti";
        d.var1[d.var2[12]] = "Drink";
        d.var1[d.var2[13]] = "Games";
        d.var1[d.var2[14]] = "antip";
        d.var1[d.var2[15]] = "antid";
        d.var1[d.var2[16]] = "Waterskin(";
        d.var1[d.var2[17]] = "Waterskin(";
        d.var1[d.var2[18]] = "Crafting cape";
    }

    public boolean r() {
        d var54;
        if (d.var10(this.x.gamesNecklace() ? 1 : 0) && d.var15(Inventory.contains(item -> item.getName().contains(var1[var2[13]])) ? 1 : 0)) {
            return var2[0];
        }
        if (d.var10(var54.x.antiPoison() ? 1 : 0) && d.var15(Inventory.contains(item -> {
            int n2;
            if (d.var10(item.getName().toLowerCase().contains(var1[var2[11]]) ? 1 : 0)) {
                String[] stringArray = new String[var2[1]];
                stringArray[d.var2[0]] = var1[var2[12]];
                if (d.var10(item.hasAction(stringArray) ? 1 : 0)) {
                    n2 = var2[1];
                    0;
                    if (3 > 0) return n2 != 0;
                    return ((0x4B ^ 0x59 ^ (0x1D ^ 0x42)) & (0x17 ^ 0x20 ^ (0xBC ^ 0xC6) ^ -1)) != 0;
                }
            }
            n2 = var2[0];
            return n2 != 0;
        }) ? 1 : 0)) {
            return var2[0];
        }
        int[] nArray = new int[var2[1]];
        nArray[d.var2[0]] = var54.x.foodID();
        if (d.var15(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return var2[0];
        }
        if (d.var10(var54.x.slayerRing() ? 1 : 0) && d.var15(Inventory.contains(item -> item.getName().toLowerCase().contains(var1[var2[10]])) ? 1 : 0)) {
            return var2[0];
        }
        b var55 = var54.w.b();
        if (d.var16((Object)var55)) {
            if (d.var10(var55.o() ? 1 : 0) && d.var15(var54.a(t) ? 1 : 0)) {
                return var2[0];
            }
            if (d.var10(var55.q() ? 1 : 0) && d.var15(var54.a(u) ? 1 : 0)) {
                return var2[0];
            }
            List<Integer> var56 = var55.p();
            if (d.var16(var56)) {
                if (d.var10(var56.contains(var2[6]) ? 1 : 0)) {
                    return var2[1];
                }
                Iterator<Integer> var57 = var56.iterator();
                while (d.var10(var57.hasNext() ? 1 : 0)) {
                    int var58 = var57.next();
                    if (d.var10(var54.h(var58) ? 1 : 0) && d.var10(var54.i(var1[var2[9]]) ? 1 : 0)) {
                        0;
                        if (((0x4A ^ 0x72) & ~(0xAC ^ 0x94)) == 0) continue;
                        return ((0x76 ^ 0x4D) & ~(0x81 ^ 0xBA)) != 0;
                    }
                    if (d.var15(var54.g(var58) ? 1 : 0)) {
                        return var2[0];
                    }
                    0;
                    if (3 > ((0xE2 ^ 0xAC) & ~(0x7E ^ 0x30))) continue;
                    return ((0x84 ^ 0xB8) & ~(0x3C ^ 0)) != 0;
                }
            }
        }
        return var2[1];
    }

    public boolean a(int n2, int n3) {
        return this.a(item -> {
            boolean bl;
            if (d.var3(item.getId(), n2)) {
                bl = var2[1];
                0;
                
            } else {
                bl = var2[0];
            }
            return bl;
        }, n3);
    }
}

