/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Actor
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.minigames.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.minigames.SquireSorceressGardenConfig;
import net.runelite.api.Actor;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import gg.squire.minigames.tasks.GameEnum;

@TaskDesc(name="Turning In Juice")
public class TurningInJuiceTask
extends Task {

    private final  SquireSorceressGardenConfig t;

    static {
        c.var3();
        c.var4();
    }

    private boolean t() {
        c var5;
        String[] stringArray = new String[var2[1]];
        stringArray[c.var2[0]] = var1[var2[0]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (c.var6(nPC)) {
            Movement.walk((WorldPoint)new WorldPoint(var2[3], var2[4], var2[0]));
            return var2[1];
        }
        if (c.var7(Movement.getRunEnergy(), var2[5]) && c.var8(Inventory.contains(var5::c) ? 1 : 0)) {
            Inventory.getFirst(var5::c).interact(var1[var2[1]]);
        }
        int[] nArray = new int[var2[1]];
        nArray[c.var2[0]] = var2[2];
        Inventory.getFirst((int[])nArray).useOn((Actor)nPC);
        return var2[1];
    }

    private static boolean var9(int n) {
        return n == 0;
    }

    private boolean TurningInJuiceTask(Item item) {
        return item.getName().toLowerCase().contains(var1[var2[6]]);
    }

    private static void var4() {
        var1 = new String[var2[7]];
        c.var1[c.var2[0]] = "Osman";
        c.var1[c.var2[1]] = "Drink";
        c.var1[c.var2[6]] = "stamina";
    }

    private static boolean var10(Object object, Object object2) {
        return object != object2;
    }

    private static boolean var6(Object object) {
        return object == null;
    }

    private boolean u() {
        c var11;
        if (c.var9(Bank.isOpen() ? 1 : 0)) {
            Bank.open();
            0;
            return var2[1];
        }
        if (c.var7(Movement.getRunEnergy(), var2[5]) && c.var9(Inventory.contains(var11::c) ? 1 : 0)) {
            Bank.withdraw(var11::c, (int)var2[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
            return var2[1];
        }
        Bank.withdrawAll((int)var2[2], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
        return var2[1];
    }

    public boolean run() {
        boolean bl;
        c var12;
        if (c.var10((Object)this.t.botActivity(), (Object)a.EXCHANGE)) {
            return var2[0];
        }
        if (c.var8(var12.s() ? 1 : 0)) {
            bl = var12.t();
            0;
            if (((38 + 29 - -19 + 149 ^ 136 + 60 - 95 + 97) & (0xBD ^ 0xAF ^ (0xD ^ 0x32) ^ -1)) == 2) {
                return ((0xC4 ^ 0x83 ^ (0 ^ 0x50)) & (62 + 21 - 57 + 128 ^ 14 + 12 - -92 + 23 ^ -1)) != 0;
            }
        } else {
            bl = var12.u();
        }
        return bl;
    }

    private static boolean var8(int n) {
        return n != 0;
    }

    @Inject
    public TurningInJuiceTask(SquireSorceressGardenConfig squireSorceressGardenConfig) {
        this.t = squireSorceressGardenConfig;
    }

        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    private static boolean var7(int n, int n2) {
        return n <= n2;
    }

        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
    }

    private boolean s() {
        int[] nArray = new int[var2[1]];
        nArray[c.var2[0]] = var2[2];
        return Inventory.contains((int[])nArray);
    }

    private static void var3() {
        var2 = new int[9];
        c.var2[0] = (0x9D ^ 0xA7) & ~(0x9F ^ 0xA5);
        c.var2[1] = 1;
        c.var2[2] = -(0xFFFFF9DF & 0x17BF) & (0xFFFFBFFF & 0x7BFF);
        c.var2[3] = -1 & (0xFFFFFEDF & 0xDF7);
        c.var2[4] = -(0xFFFFDC57 & 0x63BA) & (0xFFFFECFF & 0x5F7F);
        c.var2[5] = 0xC8 ^ 0xA8 ^ (0xF9 ^ 0xB1);
        c.var2[6] = 2;
        c.var2[7] = 3;
        c.var2[8] = 0xAE ^ 0xA6;
    }
}

