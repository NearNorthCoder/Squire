/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.autotoa.tasks;

import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.util.Comparator;
import java.util.List;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Dodging poison splat", priority=160)
public class DodgingPoisonSplatTask
extends AutotoaManager {

    private static  boolean e(List list, WorldPoint worldPoint) {
        return list.stream().noneMatch(worldPoint2 -> worldPoint2.equals((Object)worldPoint));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bL() {
        WorldPoint worldPoint2;
        bR var3;
        void var4;
        void var5;
        Player player = Players.getLocal();
        List<WorldPoint> list = this.cE();
        if (bR.var6(list.isEmpty() ? 1 : 0)) {
            return var2[0];
        }
        if (bR.var6(var5.stream().noneMatch(arg_0 -> bR.c((Player)var4, arg_0)) ? 1 : 0)) {
            return var2[0];
        }
        Log.info((String)var1[var2[0]]);
        WorldArea var7 = var4.getWorldArea().offset(var2[1]);
        WorldPoint var8 = var7.toWorldPointList().stream().filter(arg_0 -> bR.e((List)var5, arg_0)).filter(Reachable::isWalkable).filter(worldPoint -> {
            boolean bl2;
            if (bR.var9(worldPoint.distanceTo((Locatable)this.cB()), var2[3])) {
                bl2 = var2[2];
                0;
                if ((0x80 ^ 0x85) == 0) {
                    return ((0x8C ^ 0x97) & ~(0x8E ^ 0x95)) != 0;
                }
            } else {
                bl2 = var2[0];
            }
            return bl2;
        }).min(Comparator.comparingInt(arg_0 -> bR.d((Player)var4, arg_0))).orElse(null);
        if (bR.var10(var8)) {
            return var2[0];
        }
        List<TileObject> list2 = this.cC();
        worldPoint2 = this.b(player.getWorldLocation(), worldPoint2, worldPoint -> {
            int n2;
            if (bR.var6(list2.stream().noneMatch(tileObject -> worldPoint.equals((Object)tileObject.getWorldLocation())) ? 1 : 0) && bR.var11(list.contains(worldPoint) ? 1 : 0)) {
                n2 = var2[2];
                0;
                if (((0xAE ^ 0xB3) & ~(0x7C ^ 0x61)) < 0) {
                    return ((0xDE ^ 0x95) & ~(0xC6 ^ 0x8D)) != 0;
                }
            } else {
                n2 = var2[0];
            }
            return n2 != 0;
        });
        Movement.setDestination((WorldPoint)worldPoint2);
        return var2[2];
    }

    private static boolean var9(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean var6(int n2) {
        return n2 != 0;
    }

    private static  int d(Player player, WorldPoint worldPoint) {
        return worldPoint.distanceTo2D(player.getWorldLocation());
    }

    @Inject
    protected DodgingPoisonSplatTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    private static  boolean c(Player player, WorldPoint worldPoint) {
        return worldPoint.equals((Object)player.getWorldLocation());
    }

    private static void var18() {
        var1 = new String[var2[2]];
        bR.var1[bR.var2[0]] = "Trying to dodge poison splats";
    }

    static {
        bR.var19();
        bR.var18();
    }

    private static boolean var10(Object object) {
        return object == null;
    }

    private static void var19() {
        var2 = new int[6];
        bR.var2[0] = (0x48 ^ 0x55) & ~(0x78 ^ 0x65);
        bR.var2[1] = 0x82 ^ 0x8E;
        bR.var2[2] = 1;
        bR.var2[3] = 0x67 ^ 0x63;
        bR.var2[4] = 0x9F ^ 0x97;
        bR.var2[5] = 2;
    }

    private static boolean var11(int n2) {
        return n2 == 0;
    }
}

