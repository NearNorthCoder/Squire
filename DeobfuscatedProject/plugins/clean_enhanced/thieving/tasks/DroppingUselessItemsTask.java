/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.GameState
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.thieving.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.GameState;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Dropping useless items", priority=5)
public class DroppingUselessItemsTask
extends Task {
    
    private final  int[] u;

    public DroppingUselessItemsTask() {
        int[] nArray = new int[var1[0]];
        nArray[i.var1[1]] = var1[2];
        nArray[i.var1[3]] = var1[4];
        nArray[i.var1[5]] = var1[6];
        this.u = nArray;
    }

    public boolean run() {
        i var2;
        if (i.var3(Game.getState(), GameState.LOGGED_IN)) {
            return var1[1];
        }
        if (i.var4(Inventory.contains((int[])var2.u) ? 1 : 0)) {
            return var1[1];
        }
        Inventory.dropAll((int[])this.u);
        0;
        return var1[3];
    }

    private static boolean var4(int n2) {
        return n2 == 0;
    }

    private static boolean var3(Object object, Object object2) {
        return object != object2;
    }

    static {
        i.var5();
    }

    private static void var5() {
        var1 = new int[7];
        i.var1[0] = 3;
        i.var1[1] = (0x81 ^ 0xB2) & ~(0xAB ^ 0x98);
        i.var1[2] = 0xFFFFBF8F & 0x47FF;
        i.var1[3] = 1;
        i.var1[4] = 0xFFFFE6DF & 0x79E6;
        i.var1[5] = 2;
        i.var1[6] = 0xFFFF977F & 0x6FFF;
    }
}

