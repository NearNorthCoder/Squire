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
package gg.squire.scurrius.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.scurrius.SquireScurrius;
import gg.squire.scurrius.SquireScurriusConfig;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Stamina handler", priority=2137483647)
public class StaminaHandlerTask
extends Task {

    private final  SquireScurriusConfig P;
    private final  SquireScurrius O;

    private static void var3() {
        var2 = new int[7];
        g.var2[0] = (0xC2 ^ 0x8B) & ~(0x73 ^ 0x3A);
        g.var2[1] = 0x11 ^ 0x3F ^ (0x6C ^ 0x5C);
        g.var2[2] = 0xCD ^ 0xC7;
        g.var2[3] = 1;
        g.var2[4] = 2;
        g.var2[5] = 3;
        g.var2[6] = 0xD7 ^ 0xB7 ^ (0xEB ^ 0x83);
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    private static void var10() {
        var1 = new String[var2[5]];
        g.var1[g.var2[0]] = "Drink";
        g.var1[g.var2[3]] = "Drink";
        g.var1[g.var2[4]] = "Stamina";
    }

    private static boolean var11(Object object) {
        return object == null;
    }

    private static boolean var12(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        Item item2 = Inventory.getFirst(item -> item.getName().contains(var1[var2[4]]));
        if (g.var11(item2)) {
            return var2[0];
        }
        if (g.var13(Movement.getRunEnergy(), var2[1])) {
            return var2[0];
        }
        if (g.var14(Movement.isStaminaBoosted() ? 1 : 0)) {
            if (g.var12(Movement.getRunEnergy(), var2[2])) {
                void var15;
                var15.interact(var1[var2[0]]);
                return var2[3];
            }
            return var2[0];
        }
        item2.interact(var1[var2[3]]);
        return var2[3];
    }

    private static boolean var13(int n2, int n3) {
        return n2 >= n3;
    }

    @Inject
    StaminaHandlerTask(SquireScurrius squireScurrius, SquireScurriusConfig squireScurriusConfig) {
        this.O = squireScurrius;
        this.P = squireScurriusConfig;
    }

    static {
        g.var3();
        g.var10();
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    private static boolean var14(int n2) {
        return n2 != 0;
    }
}

