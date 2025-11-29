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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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

    private static boolean lIlllIllIIIlIII(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(int[] nArray) {
        void var1;
        int[] nArray2 = nArray;
        int n2 = nArray2.length;
        int var2 = lIlIIlIIlllll[0];
        while (d.lIlllIllIIIlIIl(var2, (int)var1)) {
            d var3;
            void var4;
            void var5 = var4[var2];
            if (d.lIlllIllIIIIIll(var3.g((int)var5) ? 1 : 0)) {
                return lIlIIlIIlllll[1];
            }
            ++var2;

            if (1 < (30 + 46 - -48 + 36 ^ 19 + 124 - 127 + 148)) continue;
            return false;
        }
        return lIlIIlIIlllll[0];
    }

    public boolean run() {
        b var6;
        d var7;
        if (d.lIlllIllIIIIIll(this.r() ? 1 : 0)) {
            this.w.c(lIlIIlIIlllll[0]);
            this.y = null;
            return lIlIIlIIlllll[0];
        }
        var7.w.c(lIlIIlIIlllll[1]);
        if (d.lIlllIllIIIIlII(var7.y)) {
            if (d.lIlllIllIIIIIll(Inventory.contains(item -> item.getName().contains(lIlIIlIIllllI[lIlIIlIIlllll[18]])) ? 1 : 0)) {
                var7.y = BankLocation.CRAFTING_GUILD;

                }
            } else {
                var7.y = BankLocation.getNearest();
            }
        }
        System.out.println("Banking at " + var7.y.toString());
        WorldArea var8 = var7.y.getArea();
        if (d.lIlllIllIIIIlIl(Bank.isOpen() ? 1 : 0)) {
            if (d.lIlllIllIIIIIll(Bank.open() ? 1 : 0)) {
                System.out.println(lIlIIlIIllllI[lIlIIlIIlllll[0]]);
                return lIlIIlIIlllll[1];
            }
            if (d.lIlllIllIIIIllI(var8) && d.lIlllIllIIIIlIl(var8.contains((Locatable)Players.getLocal()) ? 1 : 0) && d.lIlllIllIIIIIll(Movement.shouldWalk() ? 1 : 0)) {
                Movement.walkTo((BankLocation)var7.y);

                return lIlIIlIIlllll[1];
            }
        }
        if (d.lIlllIllIIIIIll(Inventory.isFull() ? 1 : 0)) {
            if (d.lIlllIllIIIIIll(Inventory.contains(item -> item.getName().contains(lIlIIlIIllllI[lIlIIlIIlllll[17]])) ? 1 : 0)) {
                Bank.deposit(item -> item.getName().contains(lIlIIlIIllllI[lIlIIlIIlllll[16]]), (int)lIlIIlIIlllll[1]);

                }
            } else {
                Bank.depositInventory();
            }
            return lIlIIlIIlllll[1];
        }
        if (d.lIlllIllIIIIIll(var7.x.sipStam() ? 1 : 0)) {
            var7.b(lIlIIlIIllllI[lIlIIlIIlllll[1]], lIlIIlIIlllll[1]);

        }
        if (d.lIlllIllIIIIIll(var7.x.gamesNecklace() ? 1 : 0)) {
            var7.b(lIlIIlIIllllI[lIlIIlIIlllll[2]], lIlIIlIIlllll[1]);

        }
        if (d.lIlllIllIIIIIll(var7.x.antiPoison() ? 1 : 0)) {
            var7.a(item -> {
                int n2;
                if (!d.lIlllIllIIIIlIl(item.getName().toLowerCase().contains(lIlIIlIIllllI[lIlIIlIIlllll[14]]) ? 1 : 0) || d.lIlllIllIIIIIll(item.getName().toLowerCase().contains(lIlIIlIIllllI[lIlIIlIIlllll[15]]) ? 1 : 0)) {
                    n2 = lIlIIlIIlllll[1];

                    if (2 <= -1) {
                        return false;
                    }
                } else {
                    n2 = lIlIIlIIlllll[0];
                }
                return n2 != 0;
            }, lIlIIlIIlllll[1]);

        }
        int[] nArray = new int[lIlIIlIIlllll[1]];
        nArray[d.lIlIIlIIlllll[0]] = var7.x.foodID();
        if (d.lIlllIllIIIIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lIlIIlIIlllll[1]];
            nArray2[d.lIlIIlIIlllll[0]] = var7.x.foodID();
            if (d.lIlllIllIIIIlIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                System.out.println(lIlIIlIIllllI[lIlIIlIIlllll[3]]);
                return lIlIIlIIlllll[0];
            }
            Bank.withdraw((int)var7.x.foodID(), (int)var7.x.foodAmount(), (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
        }
        if (d.lIlllIllIIIIIll(var7.x.slayerRing() ? 1 : 0)) {
            var7.b(lIlIIlIIllllI[lIlIIlIIlllll[4]], lIlIIlIIlllll[1]);

        }
        if (d.lIlllIllIIIIllI((Object)(var6 = var7.w.b()))) {
            List<Integer> llllllllllllllIllIlllIIlIllIIlIl2;
            if (d.lIlllIllIIIIIll(var6.o() ? 1 : 0) && d.lIlllIllIIIIlIl(var7.a(t) ? 1 : 0)) {
                int n2;
                if (d.lIlllIllIIIIlll(Inventory.getFreeSlots(), lIlIIlIIlllll[5])) {
                    n2 = Inventory.getFreeSlots() - lIlIIlIIlllll[3];

                    }
                } else {
                    n2 = lIlIIlIIlllll[1];
                }
                int llllllllllllllIllIlllIIlIllIIlIl2 = n2;
                var7.a(t, llllllllllllllIllIlllIIlIllIIlIl2);

            }
            if (d.lIlllIllIIIIIll(var6.q() ? 1 : 0) && d.lIlllIllIIIIlIl(var7.a(u) ? 1 : 0)) {
                var7.a(u, lIlIIlIIlllll[1]);

            }
            if (d.lIlllIllIIIIllI(llllllllllllllIllIlllIIlIllIIlIl2 = var6.p())) {
                Iterator<Integer> var9 = llllllllllllllIllIlllIIlIllIIlIl2.iterator();
                while (d.lIlllIllIIIIIll(var9.hasNext() ? 1 : 0)) {
                    int var10 = var9.next();
                    if (d.lIlllIllIIIIIll(var7.h(var10) ? 1 : 0) && d.lIlllIllIIIIIll(var7.i(lIlIIlIIllllI[lIlIIlIIlllll[5]]) ? 1 : 0)) {

                        if (-1 != 1) continue;
                        return ((0x33 ^ 0x4D ^ (0x69 ^ 0x26)) & (18 + 88 - 80 + 141 ^ 119 + 148 - 266 + 149 ^ -1)) != 0;
                    }
                    if (d.lIlllIllIIIlIII(var10, lIlIIlIIlllll[6])) {

                        if (-(0x54 ^ 0x50) < 0) continue;
                        return false;
                    }
                    if (d.lIlllIllIIIIlIl(var7.g(var10) ? 1 : 0)) {
                        if (d.lIlllIllIIIlIII(var10, lIlIIlIIlllll[7])) {
                            var7.a(var10, lIlIIlIIlllll[8]);

                        }
                        var7.a(var10, lIlIIlIIlllll[1]);

                    }

                    if (1 < 2) continue;
                    return false;
                }
            }
        }
        return lIlIIlIIlllll[1];
    }

    private static boolean lIlllIllIIIIIll(int n2) {
        return n2 != 0;
    }

    private boolean i(String string) {
        boolean bl;
        if (!d.lIlllIllIIIIlIl(Inventory.contains(item -> item.getName().toLowerCase().contains(string.toLowerCase())) ? 1 : 0) || d.lIlllIllIIIIIll(Equipment.contains(item -> item.getName().toLowerCase().contains(string.toLowerCase())) ? 1 : 0)) {
            bl = lIlIIlIIlllll[1];

            if (1 <= -1) {
                return ((0x9B ^ 0x87 ^ (0xC6 ^ 0x95)) & (0x19 ^ 0x76 ^ (0x56 ^ 0x76) ^ -1) & ((0x4F ^ 0x56 ^ (0x16 ^ 0x5B)) & (145 + 34 - 105 + 127 ^ 66 + 145 - 165 + 111 ^ -1) ^ -1)) != 0;
            }
        } else {
            bl = lIlIIlIIlllll[0];
        }
        return bl;
    }

    static {
        d.lIlllIllIIIIIlI();
        d.lIlllIlIllIlIlI();
        int[] nArray = new int[lIlIIlIIlllll[4]];
        nArray[d.lIlIIlIIlllll[0]] = lIlIIlIIlllll[19];
        nArray[d.lIlIIlIIlllll[1]] = lIlIIlIIlllll[20];
        nArray[d.lIlIIlIIlllll[2]] = lIlIIlIIlllll[21];
        nArray[d.lIlIIlIIlllll[3]] = lIlIIlIIlllll[22];
        t = nArray;
        int[] nArray2 = new int[lIlIIlIIlllll[12]];
        nArray2[d.lIlIIlIIlllll[0]] = lIlIIlIIlllll[23];
        nArray2[d.lIlIIlIIlllll[1]] = lIlIIlIIlllll[24];
        nArray2[d.lIlIIlIIlllll[2]] = lIlIIlIIlllll[25];
        nArray2[d.lIlIIlIIlllll[3]] = lIlIIlIIlllll[26];
        nArray2[d.lIlIIlIIlllll[4]] = lIlIIlIIlllll[27];
        nArray2[d.lIlIIlIIlllll[5]] = lIlIIlIIlllll[28];
        nArray2[d.lIlIIlIIlllll[9]] = lIlIIlIIlllll[29];
        nArray2[d.lIlIIlIIlllll[10]] = lIlIIlIIlllll[30];
        nArray2[d.lIlIIlIIlllll[11]] = lIlIIlIIlllll[31];
        u = nArray2;
        int[] nArray3 = new int[lIlIIlIIlllll[5]];
        nArray3[d.lIlIIlIIlllll[0]] = lIlIIlIIlllll[32];
        nArray3[d.lIlIIlIIlllll[1]] = lIlIIlIIlllll[33];
        nArray3[d.lIlIIlIIlllll[2]] = lIlIIlIIlllll[34];
        nArray3[d.lIlIIlIIlllll[3]] = lIlIIlIIlllll[35];
        nArray3[d.lIlIIlIIlllll[4]] = lIlIIlIIlllll[36];
        v = nArray3;
    }

    private static boolean lIlllIllIIIIllI(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(Predicate<Item> predicate, int n2) {
        void var11;
        if (d.lIlllIllIIIIIll(Inventory.contains(predicate) ? 1 : 0)) {
            return lIlIIlIIlllll[1];
        }
        if (d.lIlllIllIIIIlIl(Bank.isOpen() ? 1 : 0)) {
            return lIlIIlIIlllll[0];
        }
        if (d.lIlllIllIIIIlIl(Bank.contains((Predicate)var11) ? 1 : 0)) {
            System.out.println("You ran out of " + String.valueOf(var11));
            return lIlIIlIIlllll[0];
        }
        Bank.withdraw(predicate, (int)n2, (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
        return lIlIIlIIlllll[1];
    }

        return String.valueOf(var12);
    }

    /*
     * WARNING - void declaration
     */
    private boolean h(int n2) {
        void var13;
        int[] nArray = v;
        int n3 = nArray.length;
        int var14 = lIlIIlIIlllll[0];
        while (d.lIlllIllIIIlIIl(var14, (int)var13)) {
            void var15;
            void var16;
            void var17 = var16[var14];
            if (d.lIlllIllIIIlIII((int)var17, (int)var15)) {
                return lIlIIlIIlllll[1];
            }
            ++var14;

            if (1 == 1) continue;
            return ((7 ^ 0x2B ^ (0x3D ^ 0x1E)) & (0xFB ^ 0xC6 ^ (3 ^ 0x31) ^ -1)) != 0;
        }
        return lIlIIlIIlllll[0];
    }

    private static boolean lIlllIllIIIIlII(Object object) {
        return object == null;
    }

    private static boolean lIlllIllIIIIlll(int n2, int n3) {
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
                int[] nArray = new int[lIlIIlIIlllll[1]];
                nArray[d.lIlIIlIIlllll[0]] = n2;
                if (!d.lIlllIllIIIIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block2;
                int[] nArray2 = new int[lIlIIlIIlllll[1]];
                nArray2[d.lIlIIlIIlllll[0]] = n2;
                if (!d.lIlllIllIIIIIll(Equipment.contains((int[])nArray2) ? 1 : 0)) break block3;
            }
            n3 = lIlIIlIIlllll[1];

            if (1 < 2) return n3 != 0;
            return false;
        }
        n3 = lIlIIlIIlllll[0];
        return n3 != 0;
    }

    private static boolean lIlllIllIIIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlllIllIIIIlIl(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(int[] nArray, int n2) {
        void var18;
        if (d.lIlllIllIIIIlIl(Bank.isOpen() ? 1 : 0)) {
            return lIlIIlIIlllll[0];
        }
        Item var19 = (Item)((ItemQueryResults)Inventory.query().ids((int[])var18).results()).first();
        ItemQueryResults var20 = (ItemQueryResults)Bank.query().ids((int[])var18).results();
        if (d.lIlllIllIIIIlII(var19)) {
            void var21;
            if (d.lIlllIllIIIIIll(var20.isEmpty() ? 1 : 0)) {
                System.out.println("You do not have any of " + Arrays.toString((int[])var18));
                return lIlIIlIIlllll[0];
            }
            Bank.withdraw((int)((Item)var20.first()).getId(), (int)var21, (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
            return lIlIIlIIlllll[1];
        }
        return lIlIIlIIlllll[1];
    }

    private static void lIlllIlIllIlIlI() {
        lIlIIlIIllllI = new String[lIlIIlIIlllll[37]];
        d.lIlIIlIIllllI[d.lIlIIlIIlllll[0]] = "Found bank, and we are opening";
        d.lIlIIlIIllllI[d.lIlIIlIIlllll[1]] = "Stamina";
        d.lIlIIlIIllllI[d.lIlIIlIIlllll[2]] = "Games";
        d.lIlIIlIIllllI[d.lIlIIlIIlllll[3]] = "You ran out of food.";
        d.lIlIIlIIllllI[d.lIlIIlIIlllll[4]] = "slayer ring";
        d.lIlIIlIIllllI[d.lIlIIlIIlllll[5]] = "slayer helm";
        d.lIlIIlIIllllI[d.lIlIIlIIlllll[9]] = "slayer helm";
        d.lIlIIlIIllllI[d.lIlIIlIIlllll[10]] = "slayer ring";
        d.lIlIIlIIllllI[d.lIlIIlIIlllll[11]] = "anti";
        d.lIlIIlIIllllI[d.lIlIIlIIlllll[12]] = "Drink";
        d.lIlIIlIIllllI[d.lIlIIlIIlllll[13]] = "Games";
        d.lIlIIlIIllllI[d.lIlIIlIIlllll[14]] = "antip";
        d.lIlIIlIIllllI[d.lIlIIlIIlllll[15]] = "antid";
        d.lIlIIlIIllllI[d.lIlIIlIIlllll[16]] = "Waterskin(";
        d.lIlIIlIIllllI[d.lIlIIlIIlllll[17]] = "Waterskin(";
        d.lIlIIlIIllllI[d.lIlIIlIIlllll[18]] = "Crafting cape";
    }

    public boolean r() {
        d var22;
        if (d.lIlllIllIIIIIll(this.x.gamesNecklace() ? 1 : 0) && d.lIlllIllIIIIlIl(Inventory.contains(item -> item.getName().contains(lIlIIlIIllllI[lIlIIlIIlllll[13]])) ? 1 : 0)) {
            return lIlIIlIIlllll[0];
        }
        if (d.lIlllIllIIIIIll(var22.x.antiPoison() ? 1 : 0) && d.lIlllIllIIIIlIl(Inventory.contains(item -> {
            int n2;
            if (d.lIlllIllIIIIIll(item.getName().toLowerCase().contains(lIlIIlIIllllI[lIlIIlIIlllll[11]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIlIIlllll[1]];
                stringArray[d.lIlIIlIIlllll[0]] = lIlIIlIIllllI[lIlIIlIIlllll[12]];
                if (d.lIlllIllIIIIIll(item.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIIlIIlllll[1];

                    if (3 > 0) return n2 != 0;
                    return ((0x4B ^ 0x59 ^ (0x1D ^ 0x42)) & (0x17 ^ 0x20 ^ (0xBC ^ 0xC6) ^ -1)) != 0;
                }
            }
            n2 = lIlIIlIIlllll[0];
            return n2 != 0;
        }) ? 1 : 0)) {
            return lIlIIlIIlllll[0];
        }
        int[] nArray = new int[lIlIIlIIlllll[1]];
        nArray[d.lIlIIlIIlllll[0]] = var22.x.foodID();
        if (d.lIlllIllIIIIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return lIlIIlIIlllll[0];
        }
        if (d.lIlllIllIIIIIll(var22.x.slayerRing() ? 1 : 0) && d.lIlllIllIIIIlIl(Inventory.contains(item -> item.getName().toLowerCase().contains(lIlIIlIIllllI[lIlIIlIIlllll[10]])) ? 1 : 0)) {
            return lIlIIlIIlllll[0];
        }
        b var23 = var22.w.b();
        if (d.lIlllIllIIIIllI((Object)var23)) {
            if (d.lIlllIllIIIIIll(var23.o() ? 1 : 0) && d.lIlllIllIIIIlIl(var22.a(t) ? 1 : 0)) {
                return lIlIIlIIlllll[0];
            }
            if (d.lIlllIllIIIIIll(var23.q() ? 1 : 0) && d.lIlllIllIIIIlIl(var22.a(u) ? 1 : 0)) {
                return lIlIIlIIlllll[0];
            }
            List<Integer> var24 = var23.p();
            if (d.lIlllIllIIIIllI(var24)) {
                if (d.lIlllIllIIIIIll(var24.contains(lIlIIlIIlllll[6]) ? 1 : 0)) {
                    return lIlIIlIIlllll[1];
                }
                Iterator<Integer> var25 = var24.iterator();
                while (d.lIlllIllIIIIIll(var25.hasNext() ? 1 : 0)) {
                    int var26 = var25.next();
                    if (d.lIlllIllIIIIIll(var22.h(var26) ? 1 : 0) && d.lIlllIllIIIIIll(var22.i(lIlIIlIIllllI[lIlIIlIIlllll[9]]) ? 1 : 0)) {

                        if (((0x4A ^ 0x72) & ~(0xAC ^ 0x94)) == 0) continue;
                        return false;
                    }
                    if (d.lIlllIllIIIIlIl(var22.g(var26) ? 1 : 0)) {
                        return lIlIIlIIlllll[0];
                    }

                    if (3 > ((0xE2 ^ 0xAC) & ~(0x7E ^ 0x30))) continue;
                    return false;
                }
            }
        }
        return lIlIIlIIlllll[1];
    }

    public boolean a(int n2, int n3) {
        return this.a(item -> {
            boolean bl;
            if (d.lIlllIllIIIlIII(item.getId(), n2)) {
                bl = lIlIIlIIlllll[1];

                if (1 == 0) {
                    return false;
                }
            } else {
                bl = lIlIIlIIlllll[0];
            }
            return bl;
        }, n3);
    }
}

