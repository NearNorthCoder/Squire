/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.GameObject
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.tithefarm.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Comparator;
import java.util.stream.Stream;
import net.runelite.api.Client;
import net.runelite.api.GameObject;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import gg.squire.tithefarm.tasks.GameEnum;
import gg.squire.tithefarm.tasks.TithefarmManager;
import gg.squire.tithefarm.tasks.TithefarmTaskBase;

@TaskDesc(name="Walking towards the next patch", priority=50, blocking=true)
public class WalkingTowardsTheNextPatchTask
extends TithefarmTaskBase {
    
    private final  Client ad;

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var6_6;
        u var3;
        WorldPoint var4;
        void var5;
        TileObject tileObject2 = this.Z.a((TileObject tileObject) -> var1[1]);
        if (u.var6(tileObject2)) {
            return var1[0];
        }
        if (u.var7(var5 instanceof GameObject)) {
            return var1[0];
        }
        GameObject var8 = (GameObject)var5;
        Player var9 = Players.getLocal();
        if (u.var10(var8.getWorldArea().isInMeleeDistance(var9.getWorldArea()) ? 1 : 0)) {
            return var1[0];
        }
        int[] nArray = new int[var1[1]];
        nArray[u.var1[0]] = var1[2];
        if (u.var10(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[var1[1]];
            nArray2[u.var1[0]] = var1[2];
            Inventory.getFirst((int[])nArray2).interact(var2[var1[0]]);
            return var1[1];
        }
        if (u.var10(Inventory.contains(item -> item.getName().toLowerCase().contains(var2[var1[4]])) ? 1 : 0)) {
            Inventory.getFirst(item -> item.getName().toLowerCase().contains(var2[var1[3]])).interact(var2[var1[1]]);
            return var1[1];
        }
        if (u.var7(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        if (u.var10(Movement.isWalking() ? 1 : 0) && u.var11(var4 = Movement.getDestination()) && u.var10(var8.getWorldArea().isInMeleeDistance(var4) ? 1 : 0) && u.var12(var4.distanceToPath(var3.ad, var9.getWorldLocation()), var1[1])) {
            return var1[0];
        }
        var4 = (GameObject)var3.Z.a(tileObject -> var1[1], var1[3]);
        GameObject var13 = (GameObject)var3.Z.a(tileObject -> var1[1], var1[4]);
        if (!u.var11(var4) || u.var6(var13)) {
            return var1[0];
        }
        WorldPoint var14 = var8.getWorldArea().toWorldPointList().stream().flatMap(worldPoint -> {
            Stream<WorldPoint> stream;
            if (u.var15((Object)this.Z.r(), (Object)g.PATCH_13_SOUTH)) {
                stream = Stream.of(worldPoint.dy(var1[1]));
                0;
                if (2 <= 0) {
                    return null;
                }
            } else {
                void var16;
                WorldPoint[] worldPointArray = new WorldPoint[var1[3]];
                worldPointArray[u.var1[0]] = var16.dx(var1[5]);
                worldPointArray[u.var1[1]] = var16.dx(var1[1]);
                stream = Stream.of(worldPointArray);
            }
            return stream;
        }).filter(arg_0 -> u.a(var8, (GameObject)var4, var13, arg_0)).filter(worldPoint -> var8.getWorldArea().isInMeleeDistance(worldPoint)).min(Comparator.comparingDouble(arg_0 -> var3.b((GameObject)var4, arg_0)).thenComparing(object -> Float.valueOf(((WorldPoint)object).distanceTo2DHypotenuse(var13.getWorldArea().getCenter())))).orElse(null);
        if (u.var6(var14)) {
            return var1[0];
        }
        Movement.setDestination((WorldPoint)var6_6);
        return var1[1];
    }

    private static  boolean a(GameObject gameObject, GameObject gameObject2, GameObject gameObject3, WorldPoint worldPoint) {
        int n2;
        if (u.var7(gameObject.getWorldArea().contains(worldPoint) ? 1 : 0) && u.var7(gameObject2.getWorldArea().contains(worldPoint) ? 1 : 0) && u.var7(gameObject3.getWorldArea().contains(worldPoint) ? 1 : 0)) {
            n2 = var1[1];
            0;
            if (1 < ((0x29 ^ 8) & ~(0x28 ^ 9))) {
                return ((0x2D ^ 0x14) & ~(0x3E ^ 7)) != 0;
            }
        } else {
            n2 = var1[0];
        }
        return n2 != 0;
    }

        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

    private static boolean var7(int n2) {
        return n2 == 0;
    }

    private static void var23() {
        var1 = new int[8];
        u.var1[0] = (0xB3 ^ 0x86) & ~(0xF0 ^ 0xC5);
        u.var1[1] = 1;
        u.var1[2] = -(0xFFFF8AA9 & 0x7757) & (0xFFFFBF6E & 0x76FD);
        u.var1[3] = 2;
        u.var1[4] = 3;
        u.var1[5] = -1;
        u.var1[6] = 0xA2 ^ 0xA6;
        u.var1[7] = 0x8F ^ 0x87;
    }

    private static boolean var11(Object object) {
        return object != null;
    }

    private static boolean var10(int n2) {
        return n2 != 0;
    }

    private  double b(GameObject gameObject, Object object) {
        return ((WorldPoint)object).distanceToPath(this.ad, gameObject.getWorldArea().getCenter());
    }

    private static boolean var15(Object object, Object object2) {
        return object == object2;
    }

        catch (Exception var29) {
            var29.printStackTrace();
            return null;
        }
    }

    @Inject
    protected WalkingTowardsTheNextPatchTask(i i2, Client client) {
        super(i2);
        this.ad = client;
    }

    private static boolean var12(int n2, int n3) {
        return n2 <= n3;
    }

    private static void var30() {
        var2 = new String[var1[6]];
        u.var2[u.var1[0]] = "Drop";
        u.var2[u.var1[1]] = "Wear";
        u.var2[u.var1[3]] = "graceful";
        u.var2[u.var1[4]] = "graceful";
    }

    static {
        u.var23();
        u.var30();
    }

    private static boolean var6(Object object) {
        return object == null;
    }
}

