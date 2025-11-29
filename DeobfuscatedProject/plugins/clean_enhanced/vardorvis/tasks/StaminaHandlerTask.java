/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.vardorvis.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vardorvis.SquireVardorvis;
import gg.squire.vardorvis.SquireVardorvisConfig;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Stamina handler", priority=2137483647)
public class StaminaHandlerTask
extends Task {
    private final  SquireVardorvisConfig ag;
    private final  SquireVardorvis af;

    @Inject
    StaminaHandlerTask(SquireVardorvis squireVardorvis, SquireVardorvisConfig squireVardorvisConfig) {
        this.af = squireVardorvis;
        this.ag = squireVardorvisConfig;
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static boolean var9(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var10(int n2) {
        return n2 != 0;
    }

    private static boolean var11(Object object) {
        return object == null;
    }

    private static boolean var12(int n2, int n3) {
        return n2 >= n3;
    }

    private static void var13() {
        var1 = new String[var2[5]];
        o.var1[o.var2[0]] = "Drink";
        o.var1[o.var2[3]] = "Drink";
        o.var1[o.var2[4]] = "Stamina";
    }

    static {
        o.var14();
        o.var13();
    }

        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        Item item2 = Inventory.getFirst(item -> item.getName().contains(var1[var2[4]]));
        if (o.var11(item2)) {
            return var2[0];
        }
        if (o.var12(Movement.getRunEnergy(), var2[1])) {
            return var2[0];
        }
        if (o.var10(Movement.isStaminaBoosted() ? 1 : 0)) {
            if (o.var9(Movement.getRunEnergy(), var2[2])) {
                void var21;
                var21.interact(var1[var2[0]]);
                return var2[3];
            }
            return var2[0];
        }
        item2.interact(var1[var2[3]]);
        return var2[3];
    }

    private static void var14() {
        var2 = new int[7];
        o.var2[0] = (31 + 1 - -54 + 54 ^ 135 + 156 - 234 + 108) & (0x37 ^ 0x19 ^ (0xA1 ^ 0xA6) ^ -1);
        o.var2[1] = 0x5E ^ 0x62 ^ (7 ^ 0x25);
        o.var2[2] = 0xA1 ^ 0xBA ^ (0x3C ^ 0x2D);
        o.var2[3] = 1;
        o.var2[4] = 2;
        o.var2[5] = 3;
        o.var2[6] = 0x24 ^ 0x2C;
    }
}

