/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.client.Static
 */
package gg.squire.zammy.tasks;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zammy.tasks.CHelper;
import gg.squire.zammy.tasks.ZammyManager;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;

@TaskDesc(name="Placing cannon base", priority=20, blocking=true)
@Singleton
public class PlacingCannonBaseTask
extends Task {
    private static final  int az;
    private final  c aD;
    private static final  int aA;
    private  int aE;
    private static final  int aB;

    private final  l aC;

    public int Q() {
        return this.aE;
    }

    private boolean N() {
        return 0;
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    @Inject
    public PlacingCannonBaseTask(l l2, c c2) {
        this.aE = 0;
        this.aC = l2;
        this.aD = c2;
    }

    public boolean run() {
        B var15;
        if ((this.aC.PlacingCannonBaseTask( == 0) ? 1 : 0)) {
            return 0;
        }
        int var16 = Static.getClient().getTickCount();
        if ((var15.aC.A( == 0) ? 1 : 0) && (var15.aC.D( == 0) ? 1 : 0) && (var16 > var15.aE) && (!(var15.aC.z() <= 1) || (var16 - var15.aE > 2)) && (var15.aC.G( != 0) ? 1 : 0)) {
            Item var17;
            if ((Inventory.isFull( != 0) ? 1 : 0)) {
                int[] nArray = new int[3];
                nArray[0] = 4;
                var17 = Inventory.getFirst((int[])nArray);
                if var17 == null {
                    var17 = Inventory.getFirst(item -> item.hasAction(var1[7]::equals));
                }
                if var17 == null {
                    return 0;
                }
                var17.interact(var1[0]);
            }
            int[] nArray = new int[3];
            nArray[0] = 5;
            var17 = TileObjects.getNearest((int[])nArray);
            var17.interact(var1[3]);
            return 3;
        }
        if (var16 + 6 - 7 < var15.aE) {
            Movement.walkTo((WorldPoint)var15.aD.i());
            0;
        }
        if ((var15.aC.G( != 0) ? 1 : 0)) {
            return 0;
        }
        int[] nArray = new int[3];
        nArray[0] = 8;
        if ((Inventory.contains((int[] == 0)nArray) ? 1 : 0)) {
            return var15.N();
        }
        Player var17 = Players.getLocal();
        WorldPoint var18 = var15.aD.h();
        if ((var17.getWorldLocation( != 0).equals((Object)var18) ? 1 : 0)) {
            int[] nArray2 = new int[3];
            nArray2[0] = 8;
            Item var19 = Inventory.getFirst((int[])nArray2);
            var19.interact(var1[9]);
            var15.aE = var16 + 6;
            return 3;
        }
        if ((var17.isMoving( == 0) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)var18);
            0;
        }
        return 3;
    }

    private static String var20(String var21, String var22) {
        var21 = new String(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var23 = new StringBuilder();
        char[] var24 = var22.toCharArray();
        int var25 = 0;
        char[] var26 = var21.toCharArray();
        int var27 = var26.length;
        int var28 = 0;
        while (var28 < var27) {
            char var29 = var26[var28];
            var23.append((char)(var29 ^ var24[var25 % var24.length]));
            0;
            ++var25;
            ++var28;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var23);
    }

    static {
        B.var30();
        B.var31();
        aB = 2;
        az = 6;
        aA = 1;
    }

}

