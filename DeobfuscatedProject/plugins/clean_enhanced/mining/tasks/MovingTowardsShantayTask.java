/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.mining.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import gg.squire.mining.tasks.MiningTaskBase;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Moving towards Shantay", priority=10, blocking=true)
public class MovingTowardsShantayTask
extends MiningTaskBase {

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean t() {
        void var1_1;
        if (!R.var3(this.z() ? 1 : 0) || R.var4(this.y())) {
            return var2[0];
        }
        int[] nArray = new int[var2[1]];
        nArray[R.var2[0]] = var2[2];
        TileObject var5 = TileObjects.getNearest((int[])nArray);
        if (R.var6(var5)) {
            if (R.var3(Movement.shouldWalk() ? 1 : 0)) {
                Movement.walkTo((WorldPoint)new WorldPoint(var2[3], var2[4], var2[0]));
                0;
                return var2[1];
            }
            int[] nArray2 = new int[var2[1]];
            nArray2[R.var2[0]] = var2[5];
            Item var7 = Inventory.getFirst((int[])nArray2);
            if (R.var8(var7)) {
                var7.drop();
                return var2[1];
            }
            return var2[0];
        }
        var1_1.interact(var1[var2[0]]);
        return var2[1];
    }

    private static boolean var3(int n2) {
        return n2 != 0;
    }

    private static void var9() {
        var1 = new String[var2[1]];
        R.var1[R.var2[0]] = "Go-through";
    }

    private static boolean var6(Object object) {
        return object == null;
    }

    private static void var10() {
        var2 = new int[7];
        R.var2[0] = (1 ^ 0x6D ^ (0xE5 ^ 0x90)) & (155 + 5 - 156 + 178 ^ 83 + 146 - 144 + 90 ^ -1);
        R.var2[1] = 1;
        R.var2[2] = 0xFFFFA3FE & 0xFD6F;
        R.var2[3] = -(0xFFFFFF92 & 0x736F) & (0xFFFFFFFF & 0x7F7F);
        R.var2[4] = 0xFFFFDFBF & 0x2B5B;
        R.var2[5] = 0xFFFFF7FF & 0xF27;
        R.var2[6] = 2;
    }

    static {
        R.var10();
        R.var9();
    }

    private static boolean var4(int n2) {
        return n2 > 0;
    }

    private static boolean var8(Object object) {
        return object != null;
    }

        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    @Inject
    protected MovingTowardsShantayTask(SquireMinerConfig squireMinerConfig) {
        super(squireMinerConfig);
    }
}

