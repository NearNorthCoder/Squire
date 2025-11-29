/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.gauntlet.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.gauntlet.tasks.EHelper;
import net.runelite.api.Item;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Widgets;

@TaskDesc(name="Enabling Run", priority=5)
public class EnablingRunTask
extends Task {

    private static boolean var3(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean var4(Object object) {
        return object != null;
    }

    static {
        S.var5();
        S.var6();
    }

    private static boolean var7(Object object) {
        return object == null;
    }

    public boolean run() {
        Item item2;
        if (S.var8(Movement.isStaminaBoosted() ? 1 : 0) && S.var3(Movement.getRunEnergy(), var2[0]) && S.var4(item2 = Inventory.getFirst(item -> e.aa.contains(item.getId())))) {
            item2.interact(var1[var2[1]]);
            return var2[2];
        }
        if (S.var3(Movement.getRunEnergy(), var2[3])) {
            return var2[1];
        }
        if (S.var8(Movement.isRunEnabled() ? 1 : 0)) {
            Widget var9 = Widgets.get((WidgetInfo)WidgetInfo.MINIMAP_TOGGLE_RUN_ORB);
            if (S.var7(var9)) {
                return var2[1];
            }
            Movement.toggleRun();
            return var2[2];
        }
        return var2[1];
    }

    private static boolean var8(int n2) {
        return n2 == 0;
    }

        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    private static void var5() {
        var2 = new int[6];
        S.var2[0] = 0xB8 ^ 0xB2;
        S.var2[1] = (0xF ^ 0x51) & ~(0x64 ^ 0x3A);
        S.var2[2] = 1;
        S.var2[3] = 0x62 ^ 0x6D;
        S.var2[4] = 0xF2 ^ 0xBE ^ (0xFC ^ 0xB8);
        S.var2[5] = 2;
    }
}

