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
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.autotoa.tasks;

import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.util.Comparator;
import java.util.Set;
import java.util.stream.Collectors;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Moving off poison", priority=30)
public class MovingOffPoisonTask
extends AutotoaManager {

    private static  boolean c(Player player, WorldPoint worldPoint) {
        return worldPoint.equals((Object)player.getWorldLocation());
    }

    private static void var3() {
        var2 = new int[4];
        bU.var2[0] = (0x88 ^ 0xB8) & ~(0x3B ^ 0xB);
        bU.var2[1] = 2;
        bU.var2[2] = 1;
        bU.var2[3] = 162 + 167 - 169 + 21 ^ 168 + 132 - 112 + 1;
    }

    private static  boolean j(Set set, WorldPoint worldPoint) {
        return set.stream().noneMatch(worldPoint2 -> worldPoint2.equals((Object)worldPoint));
    }

    static {
        bU.var3();
        bU.var4();
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static boolean var11(Object object) {
        return object == null;
    }

    private static boolean var12(int n2) {
        return n2 == 0;
    }

    private static boolean var13(int n2) {
        return n2 != 0;
    }

    private static void var4() {
        var1 = new String[var2[2]];
        bU.var1[bU.var2[0]] = "Trying to dodge poison splats";
    }

    @Inject
    protected MovingOffPoisonTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bL() {
        WorldPoint worldPoint2;
        void var14;
        void var15;
        Player player = Players.getLocal();
        Set set = this.cC().stream().map(Locatable::getWorldLocation).collect(Collectors.toSet());
        if (bU.var13(set.isEmpty() ? 1 : 0)) {
            return var2[0];
        }
        if (bU.var13(var15.stream().noneMatch(arg_0 -> bU.c((Player)var14, arg_0)) ? 1 : 0)) {
            return var2[0];
        }
        Log.info((String)var1[var2[0]]);
        WorldArea var16 = var14.getWorldArea().offset(var2[1]);
        WorldPoint var17 = var16.toWorldPointList().stream().filter(arg_0 -> bU.j((Set)var15, arg_0)).min(Comparator.comparingInt(arg_0 -> bU.f((Player)var14, arg_0))).orElse(null);
        if (bU.var11(var17)) {
            return var2[0];
        }
        worldPoint2 = this.b(player.getWorldLocation(), worldPoint2, worldPoint -> {
            boolean bl2;
            if (bU.var12(set.contains(worldPoint) ? 1 : 0)) {
                bl2 = var2[2];
                0;
                if ((7 ^ 3) > (0x53 ^ 0x57)) {
                    return ((0x3F ^ 0x2A) & ~(0x72 ^ 0x67)) != 0;
                }
            } else {
                bl2 = var2[0];
            }
            return bl2;
        });
        Movement.setDestination((WorldPoint)worldPoint2);
        return var2[2];
    }

    private static  int f(Player player, WorldPoint worldPoint) {
        return worldPoint.distanceTo2D(player.getWorldLocation());
    }
}

