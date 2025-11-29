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
package gg.squire.hunter.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import gg.squire.hunter.tasks.GameEnum4;
import squire.gg.hunter.SquireHerbiboarConfig;

@TaskDesc(name="Drinking stamina potion", priority=1)
public class DrinkingStaminaPotionTask
extends Task {
    @Inject
    private  SquireHerbiboarConfig p;

    private static void var3() {
        var2 = new int[4];
        m.var2[0] = (0xF6 ^ 0xC5) & ~(0x9F ^ 0xAC);
        m.var2[1] = 0xAE ^ 0x9C;
        m.var2[2] = 2;
        m.var2[3] = 1;
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    public boolean run() {
        m var10;
        if (m.var11((Object)this.p.useEnergyRestoration(), (Object)e.NONE)) {
            return var2[0];
        }
        Item var12 = Inventory.getFirst((int[])var10.p.useEnergyRestoration().j());
        if (m.var13(var12)) {
            return var2[0];
        }
        if (m.var14(Movement.isWalking() ? 1 : 0)) {
            return var2[0];
        }
        if (m.var15(Movement.getRunEnergy(), var2[1]) && m.var14(Movement.isStaminaBoosted() ? 1 : 0)) {
            var12.interact(var1[var2[0]]);
            var10.sleep(var2[2]);
            return var2[3];
        }
        return var2[0];
    }

    private static boolean var15(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var13(Object object) {
        return object == null;
    }

    private static boolean var11(Object object, Object object2) {
        return object == object2;
    }

    private static boolean var14(int n2) {
        return n2 == 0;
    }

    static {
        m.var3();
        m.var16();
    }

    private static void var16() {
        var1 = new String[var2[3]];
        m.var1[m.var2[0]] = "Drink";
    }
}

