/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.mining.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import gg.squire.mining.tasks.GameEnum5;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Mining essenece")
public class MiningEsseneceTask
extends Task {
    @Inject
    private  SquireMinerConfig f;

    static {
        p.var3();
        p.var4();
    }

    private static boolean var5(int n2) {
        return n2 != 0;
    }

    private static boolean var6(Object object, Object object2) {
        return object != object2;
    }

    private static void var4() {
        var1 = new String[var2[3]];
        p.var1[p.var2[0]] = "Mine";
    }

    private static boolean var7(Object object) {
        return object == null;
    }

        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (p.var6((Object)this.f.activity(), (Object)a.ESSENCE)) {
            return var2[0];
        }
        if (p.var5(Inventory.isFull() ? 1 : 0)) {
            return var2[0];
        }
        if (p.var5(Players.getLocal().isAnimating() ? 1 : 0)) {
            return var2[0];
        }
        int[] nArray = new int[var2[1]];
        nArray[p.var2[0]] = var2[2];
        nArray[p.var2[3]] = var2[4];
        nArray[p.var2[5]] = var2[6];
        TileObject var14 = TileObjects.getNearest((int[])nArray);
        if (p.var7(var14)) {
            return var2[0];
        }
        var1_1.interact(var1[var2[0]]);
        return var2[3];
    }

    private static void var3() {
        var2 = new int[8];
        p.var2[0] = (0x2F ^ 0x58 ^ (0x52 ^ 8)) & (0xF2 ^ 0xAE ^ (0xB4 ^ 0xC5) ^ -1);
        p.var2[1] = 3;
        p.var2[2] = -1 & (0xFFFFBD36 & 0x7EFB);
        p.var2[3] = 1;
        p.var2[4] = 0xFFFF97DF & 0xEFF5;
        p.var2[5] = 2;
        p.var2[6] = 0xFFFFE16F & 0x5FBF;
        p.var2[7] = 0x61 ^ 0xF ^ (0xFB ^ 0x9D);
    }
}

