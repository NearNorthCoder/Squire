/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.RectangularArea
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.client.Static
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.nightmare.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.util.Comparator;
import java.util.Objects;
import java.util.stream.Stream;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RectangularArea;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gg.squire.nightmare.tasks.NightmareManager;
import gg.squire.nightmare.tasks.NightmareManager;
import gg.squire.nightmare.tasks.NightmareManager;

@TaskDesc(name="Stepping into flower area", priority=0x7FFFFFFA, blocking=true)
public class SteppingIntoFlowerAreaTask
extends NightmareManager {
    
    private static final  Logger es;

    private static boolean var3(Object object) {
        return object == null;
    }

    private static void var4() {
        var1 = new int[4];
        aw.var1[0] = (0xB8 ^ 0x98) & ~(0x82 ^ 0xA2);
        aw.var1[1] = 3;
        aw.var1[2] = 1;
        aw.var1[3] = 2;
    }

    static {
        aw.var4();
        aw.var5();
        es = LoggerFactory.getLogger(SteppingIntoFlowerAreaTask.class);
    }

    @Inject
    protected SteppingIntoFlowerAreaTask(j j2, Client client, SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, e e2) {
        super(j2, client, squireNightmareConfig, squireNightmarePlugin, e2);
    }

    private static boolean var6(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bY() {
        void var6_6;
        aw var7;
        void var8;
        void var9;
        WorldPoint worldPoint2 = this.cL.getLocalPlayer().getWorldLocation();
        RectangularArea rectangularArea = e.ay();
        if (aw.var3(rectangularArea)) {
            return var1[0];
        }
        Player var10 = Players.getLocal();
        WorldPoint var11 = Movement.getDestination();
        if (aw.var6(var9.contains((WorldPoint)var8) ? 1 : 0)) {
            return var1[0];
        }
        if (aw.var12(var11) && aw.var6(var10.isMoving() ? 1 : 0) && aw.var6(var9.contains(var11) ? 1 : 0)) {
            return var1[0];
        }
        NPC var13 = SquireNightmarePlugin.d();
        WorldPoint var14 = null;
        if (aw.var6(var7.bZ() ? 1 : 0)) {
            Stream stream = var13.getWorldArea().getMeleeTiles(Static.getClient()).stream();
            void v1 = var9;
            Objects.requireNonNull(v1);
            0;
            var14 = stream.filter(arg_0 -> ((RectangularArea)v1).contains(arg_0)).filter(worldPoint -> {
                boolean bl;
                if (aw.var15(var13.getWorldArea().contains(worldPoint.getWorldLocation()) ? 1 : 0)) {
                    bl = var1[2];
                    0;
                    if (2 <= 1) {
                        return ((29 + 41 - 34 + 197 ^ 187 + 94 - 108 + 21) & (0xB5 ^ 0xAA ^ (0x7F ^ 0x4B) ^ -1)) != 0;
                    }
                } else {
                    bl = var1[0];
                }
                return bl;
            }).filter(worldPoint -> {
                boolean bl;
                if (aw.var15(this.cM.Y().contains(worldPoint.getWorldLocation()) ? 1 : 0)) {
                    bl = var1[2];
                    0;
                    if ((0x5E ^ 0x5A) != (0x2F ^ 0x2B)) {
                        return ((0x69 ^ 0x4C) & ~(0xA1 ^ 0x84)) != 0;
                    }
                } else {
                    bl = var1[0];
                }
                return bl;
            }).min(Comparator.comparingInt(arg_0 -> aw.d((WorldPoint)var8, arg_0))).orElse(null);
        }
        if (aw.var3(var14)) {
            var14 = var9.getNearest();
        }
        if (aw.var3(var14)) {
            Object[] objectArray = new Object[var1[1]];
            objectArray[aw.var1[0]] = var9;
            objectArray[aw.var1[2]] = var13.getWorldArea();
            objectArray[aw.var1[3]] = var7.cM.Y();
            Log.error((String)var2[var1[0]], (Object[])objectArray);
            return var1[0];
        }
        Movement.setDestination((WorldPoint)var6_6);
        return var1[2];
    }

    private static boolean var12(Object object) {
        return object != null;
    }

    private static  int d(WorldPoint worldPoint, WorldPoint worldPoint2) {
        return worldPoint2.getWorldLocation().distanceTo(worldPoint);
    }

    private static boolean var15(int n2) {
        return n2 == 0;
    }

    private static void var5() {
        var2 = new String[var1[2]];
        aw.var2[aw.var1[0]] = "[AvoidFlowers]: Unable to find a flower to move to. [farea: {}] [pnm: {}] [shadows: {}]";
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }
}

