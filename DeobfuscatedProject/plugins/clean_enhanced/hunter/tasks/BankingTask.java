/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Item
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$Inventory
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.hunter.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.util.Iterator;
import java.util.function.Predicate;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gg.squire.hunter.tasks.CheckingSuppliesTask;
import gg.squire.hunter.tasks.GameEnum4;
import squire.gg.hunter.SquireHerbiboarConfig;
import squire.gg.hunter.SquireHerbiboarPlugin;

@TaskDesc(name="Banking", priority=2)
public class BankingTask
extends Task {
    private static final  WorldPoint ad;
    private static final  Logger ac;
    
     Predicate<Item> ah;
    private final  SquireHerbiboarConfig ae;
     Predicate<Item> ai;
    private final  SquireHerbiboarPlugin af;
    
    private final  d ag;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static boolean var9(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    public static boolean a(Predicate<Item> predicate) {
        boolean bl;
        void var10;
        int n2 = var1[0];
        Iterator var11 = Inventory.getAll(predicate).iterator();
        while (l.var12(var11.hasNext() ? 1 : 0)) {
            Item var13 = (Item)var11.next();
            int[] nArray = new int[var1[1]];
            nArray[l.var1[2]] = var13.getId();
            Bank.depositAll((int[])nArray);
            if (l.var14((int)(--var10))) {
                return var1[1];
            }
            0;
            if (3 != 0) continue;
            return ((0x67 ^ 0x7F) & ~(6 ^ 0x1E)) != 0;
        }
        if (l.var15((int)var10, var1[0])) {
            bl = var1[1];
            0;
            if (((0xB3 ^ 0xA7) & ~(0x2A ^ 0x3E)) >= (0x54 ^ 0x50)) {
                return ((0xF ^ 0x57) & ~(0x6E ^ 0x36)) != 0;
            }
        } else {
            bl = var1[2];
        }
        return bl;
    }

    private static boolean var16(int n2) {
        return n2 == 0;
    }

    private static void var17() {
        var1 = new int[11];
        l.var1[0] = 65 + 89 - 127 + 103 ^ 122 + 134 - 216 + 98;
        l.var1[1] = 1;
        l.var1[2] = (0xBA ^ 0xA5) & ~(0x88 ^ 0x97);
        l.var1[3] = 0xB8 ^ 0x9F ^ (5 ^ 0x27);
        l.var1[4] = 2;
        l.var1[5] = 3;
        l.var1[6] = 0x2C ^ 0x58 ^ (0xE ^ 0x7E);
        l.var1[7] = 50 + 20 - -105 + 17 ^ 159 + 1 - -16 + 22;
        l.var1[8] = 0x13 ^ 3 ^ (0x80 ^ 0x97);
        l.var1[9] = 0xFFFFCEFD & 0x3F9E;
        l.var1[10] = 0xFFFFCFFE & 0x3EDD;
    }

    private static boolean var15(int n2, int n3) {
        return n2 < n3;
    }

    private static String var18(String var19, String var20) {
        var19 = new String(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var21 = new StringBuilder();
        char[] var22 = var20.toCharArray();
        int var23 = var1[2];
        char[] var24 = var19.toCharArray();
        int var25 = var24.length;
        int var26 = var1[2];
        while (l.var15(var26, var25)) {
            char var27 = var24[var26];
            var21.append((char)(var27 ^ var22[var23 % var22.length]));
            0;
            ++var23;
            ++var26;
            0;
            if ((0x4D ^ 0x23 ^ (0xFB ^ 0x91)) > 1) continue;
            return null;
        }
        return String.valueOf(var21);
    }

    private static boolean var28(int n2) {
        return n2 > 0;
    }

    private static boolean var29(Object object, Object object2) {
        return object != object2;
    }

        catch (Exception var35) {
            var35.printStackTrace();
            return null;
        }
    }

    private static boolean var14(int n2) {
        return n2 <= 0;
    }

    @Inject
    public BankingTask(SquireHerbiboarConfig squireHerbiboarConfig, SquireHerbiboarPlugin squireHerbiboarPlugin, d d2) {
        this.ah = item -> {
            int n2;
            if (!l.var16(item.getName().toLowerCase().contains(var2[var1[3]]) ? 1 : 0) || !l.var16(item.getName().toLowerCase().contains(var2[var1[7]]) ? 1 : 0) || l.var12(item.getName().toLowerCase().contains(var2[var1[8]]) ? 1 : 0)) {
                n2 = var1[1];
                0;
                if (1 > 1) {
                    return ((0xCE ^ 0x87) & ~(0x12 ^ 0x5B)) != 0;
                }
            } else {
                n2 = var1[2];
            }
            return n2 != 0;
        };
        this.ai = item -> item.getName().toLowerCase().contains(var2[var1[6]]);
        this.ae = squireHerbiboarConfig;
        this.af = squireHerbiboarPlugin;
        this.ag = d2;
    }

    private static void var36() {
        var2 = new String[var1[0]];
        l.var2[l.var1[2]] = "Empty";
        l.var2[l.var1[1]] = "sack";
        l.var2[l.var1[4]] = "sack";
        l.var2[l.var1[5]] = "grimy";
        l.var2[l.var1[6]] = "herb sack";
        l.var2[l.var1[3]] = "grimy";
        l.var2[l.var1[7]] = "fossil";
        l.var2[l.var1[8]] = "numulite";
    }

    public boolean run() {
        l var37;
        if (l.var16(this.af.f() ? 1 : 0)) {
            return var1[2];
        }
        if (l.var16(Movement.shouldWalk() ? 1 : 0)) {
            return var1[2];
        }
        Player var38 = Players.getLocal();
        if (l.var16(Bank.isOpen() ? 1 : 0)) {
            if (l.var9(var38.distanceTo(ad), var1[3])) {
                Movement.walkTo((WorldPoint)ad);
                0;
                return var1[1];
            }
            return Bank.open();
        }
        if (l.var12(var37.ae.useHerbSack() ? 1 : 0) && l.var12(Inventory.contains(item -> item.getName().toLowerCase().contains(var2[var1[5]])) ? 1 : 0)) {
            var37.af.b(var1[2]);
        }
        if (l.var12(Inventory.contains(var37.ah) ? 1 : 0)) {
            l.a(var37.ah);
            0;
            return var1[1];
        }
        if (l.var12(var37.ae.useHerbSack() ? 1 : 0) && l.var16(Inventory.contains(var37.ai) ? 1 : 0)) {
            Bank.withdraw(var37.ai, (int)var1[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
        }
        if (l.var12(var37.ae.useHerbSack() ? 1 : 0) && l.var16(var37.af.g() ? 1 : 0) && l.var12(Inventory.contains(item -> item.getName().toLowerCase().contains(var2[var1[4]])) ? 1 : 0)) {
            Bank.Inventory.getFirst(item -> item.getName().toLowerCase().contains(var2[var1[1]])).interact(var2[var1[2]]);
            return var1[1];
        }
        e var39 = var37.ae.useEnergyRestoration();
        if (l.var29((Object)var39, (Object)e.NONE)) {
            int var40 = var37.ae.quantity();
            int[] var41 = var39.j();
            int var42 = var41.length;
            int var43 = var1[2];
            while (l.var15(var43, var42)) {
                int var44 = var41[var43];
                int[] nArray = new int[var1[1]];
                nArray[l.var1[2]] = var44;
                if (l.var12(Bank.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray2 = new int[var1[1]];
                    nArray2[l.var1[2]] = var44;
                    int var45 = Bank.getCount((boolean)var1[1], (int[])nArray2);
                    Bank.withdraw((int)var44, (int)var37.ae.quantity(), (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                    if (l.var14(var40 -= var45)) {
                        0;
                        if (-(95 + 122 - 60 + 26 ^ 2 + 132 - -41 + 4) < 0) break;
                        return ((8 + 47 - -113 + 68 ^ 112 + 5 - -40 + 5) & (0x91 ^ 0xB5 ^ (0x30 ^ 0x5A) ^ -1)) != 0;
                    }
                }
                ++var43;
                0;
                if null == null continue;
                return ((0x76 ^ 0x6C ^ (0x5E ^ 0x50)) & (0x18 ^ 5 ^ (0x9D ^ 0x94) ^ -1)) != 0;
            }
            if (l.var28(var40)) {
                Log.debug((String)("We ran out of " + String.valueOf((Object)var37.ae.useEnergyRestoration()) + ", stopping"));
                var37.af.forceStop();
                return var1[1];
            }
        }
        this.af.a(var1[2]);
        Bank.close();
        return var1[2];
    }

    private static boolean var12(int n2) {
        return n2 != 0;
    }

    static {
        l.var17();
        l.var36();
        ac = LoggerFactory.getLogger(BankingTask.class);
        ad = new WorldPoint(var1[9], var1[10], var1[2]);
    }
}

