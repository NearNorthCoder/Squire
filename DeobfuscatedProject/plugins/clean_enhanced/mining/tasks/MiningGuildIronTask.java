/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.mining.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import gg.squire.mining.tasks.GameEnum5;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Mining guild iron")
public class MiningGuildIronTask
extends Task {
    
    private static final  int[] G;
    private final  SquireMinerConfig H;
    
    private static final  WorldPoint F;

    private static void var3() {
        var1 = new int[8];
        v.var1[0] = (134 + 114 - 170 + 83 ^ 35 + 128 - 43 + 11) & (0x95 ^ 0xB6 ^ 1 ^ -1);
        v.var1[1] = 1;
        v.var1[2] = 2;
        v.var1[3] = -(0xFFFFFFDB & 0x7435) & (0xFFFFFFFF & 0x7FDD);
        v.var1[4] = -(0xFFFFB797 & 0x5A6F) & (0xFFFFFFFF & 0x37FF);
        v.var1[5] = -(0xFFFFBEE5 & 0x531B) & (0xFFFFBF6E & 0x7EF5);
        v.var1[6] = 0xFFFFFCFF & 0x2F65;
        v.var1[7] = 0x93 ^ 0x9B;
    }

    private static boolean var4(int n2) {
        return n2 == 0;
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    @Inject
    public MiningGuildIronTask(SquireMinerConfig squireMinerConfig) {
        this.H = squireMinerConfig;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (v.var11((Object)this.H.activity(), (Object)a.GUILD_IRON)) {
            return var1[0];
        }
        if (v.var12(Inventory.isFull() ? 1 : 0)) {
            return var1[0];
        }
        if (v.var4(F.equals((Object)Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (v.var12(Movement.shouldWalk() ? 1 : 0)) {
                Movement.walkTo((WorldPoint)F);
                0;
            }
            return var1[1];
        }
        if (v.var12(Players.getLocal().isAnimating() ? 1 : 0)) {
            return var1[0];
        }
        TileObject var13 = TileObjects.getFirstSurrounding((WorldPoint)F, (int)var1[2], (int[])G);
        if (v.var14(var13)) {
            return var1[0];
        }
        var1_1.interact(var2[var1[0]]);
        this.sleep(var1[2]);
        return var1[1];
    }

    private static boolean var11(Object object, Object object2) {
        return object != object2;
    }

    private static void var15() {
        var2 = new String[var1[1]];
        v.var2[v.var1[0]] = "Mine";
    }

    static {
        v.var3();
        v.var15();
        F = new WorldPoint(var1[3], var1[4], var1[0]);
        int[] nArray = new int[var1[2]];
        nArray[v.var1[0]] = var1[5];
        nArray[v.var1[1]] = var1[6];
        G = nArray;
    }

    private static boolean var12(int n2) {
        return n2 != 0;
    }

    private static boolean var14(Object object) {
        return object == null;
    }
}

