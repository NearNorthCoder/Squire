/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Deque
 *  net.runelite.api.GraphicsObject
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.Projectiles
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.construction.tasks;

import com.google.inject.Inject;
import gg.squire.basics.cerberus.SquireCerberusConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.construction.tasks.ConstructionManager;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;
import net.runelite.api.Client;
import net.runelite.api.Deque;
import net.runelite.api.GraphicsObject;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Moving off fire", priority=8, register=true, blocking=true)
public class MovingOffFireTask
extends Task {
    private final  SquireCerberusConfig aK;
    private static  int[] lIIlIIII;
    private final  Client aJ;
    private final  a aI;

    private static boolean var1(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean var2(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var3(int n2, int n3) {
        return n2 != n3;
    }

    private static  boolean a(WorldArea worldArea, WorldPoint worldPoint) {
        boolean bl2;
        if (w.var4(worldArea.contains(worldPoint) ? 1 : 0)) {
            bl2 = lIIlIIII[1];
            0;
            if (-1 > 3) {
                return ((0x3C ^ 0xE) & ~(0xAE ^ 0x9C)) != 0;
            }
        } else {
            bl2 = lIIlIIII[0];
        }
        return bl2;
    }

    private static boolean var4(int n2) {
        return n2 == 0;
    }

    private static boolean var5(Object object) {
        return object != null;
    }

    public boolean run() {
        WorldPoint var6;
        GraphicsObject var7;
        w var8;
        if (!w.var5(this.aI.k()) || w.var9(this.aI.k().y())) {
            return lIIlIIII[0];
        }
        WorldPoint var10 = Players.getLocal().getWorldLocation();
        int[] nArray = new int[lIIlIIII[1]];
        nArray[w.lIIlIIII[0]] = lIIlIIII[2];
        List var11 = Projectiles.getAll((int[])nArray);
        Deque var12 = var8.aJ.getGraphicsObjects();
        ArrayList<WorldPoint> var13 = new ArrayList<WorldPoint>();
        var11.forEach(projectile -> {
            var13.add(WorldPoint.fromLocal((Client)this.aJ, (LocalPoint)projectile.getTarget()));
            0;
        });
        Iterator var14 = var12.iterator();
        while (w.var15(var14.hasNext() ? 1 : 0)) {
            var7 = (GraphicsObject)var14.next();
            if (!w.var3(var7.getId(), lIIlIIII[3]) || w.var2(var7.getId(), lIIlIIII[2])) {
                var6 = WorldPoint.fromLocal((Client)var8.aJ, (LocalPoint)var7.getLocation());
                var13.add(var6);
                0;
            }
            0;
            if (((0xF0 ^ 0x9E ^ (0xD1 ^ 0x89)) & (0x58 ^ 0x54 ^ (0x16 ^ 0x2C) ^ -1) & ((0xAC ^ 0xB7 ^ (0x98 ^ 0x8A)) & (0x1F ^ 0x74 ^ (0x6B ^ 9) ^ -1) ^ -1)) == ((0x25 ^ 0x1F ^ (0xB1 ^ 0xC3)) & (12 + 159 - 5 + 36 ^ 94 + 121 - 203 + 118 ^ -1))) continue;
            return ((65 + 127 - 110 + 57 ^ 23 + 67 - 33 + 110) & (109 + 5 - 14 + 43 ^ 50 + 25 - -43 + 45 ^ -1)) != 0;
        }
        if (w.var15(var13.stream().noneMatch(worldPoint2 -> {
            boolean bl2;
            if (w.var1(worldPoint2.distanceTo(var10), lIIlIIII[1])) {
                bl2 = lIIlIIII[1];
                0;
                if null != null {
                    return ((0x3D ^ 0x29 ^ (0x72 ^ 0x4D)) & (2 ^ (0x31 ^ 0x18) ^ -1)) != 0;
                }
            } else {
                bl2 = lIIlIIII[0];
            }
            return bl2;
        }) ? 1 : 0)) {
            return lIIlIIII[0];
        }
        var14 = var8.aI.k().y();
        var7 = var14.getWorldArea();
        var6 = var7.toWorldPointList().stream().flatMap(worldPoint -> {
            WorldPoint[] worldPointArray = new WorldPoint[lIIlIIII[5]];
            worldPointArray[w.lIIlIIII[0]] = worldPoint.dy(lIIlIIII[1]);
            worldPointArray[w.lIIlIIII[1]] = worldPoint.dy(lIIlIIII[6]);
            worldPointArray[w.lIIlIIII[7]] = worldPoint.dx(lIIlIIII[1]);
            worldPointArray[w.lIIlIIII[4]] = worldPoint.dx(lIIlIIII[6]);
            return Stream.of(worldPointArray);
        }).filter(arg_0 -> w.a((WorldArea)var7, arg_0)).filter(worldPoint -> var13.stream().noneMatch(worldPoint2 -> {
            boolean bl2;
            if (w.var1(worldPoint2.distanceTo(worldPoint), lIIlIIII[1])) {
                bl2 = lIIlIIII[1];
                0;
                if (-1 != -1) {
                    return ((0x7E ^ 0x5B ^ (0x1E ^ 0x30)) & (0xF ^ 0x29 ^ (0x38 ^ 0x15) ^ -1)) != 0;
                }
            } else {
                bl2 = lIIlIIII[0];
            }
            return bl2;
        })).min(Comparator.comparingDouble(worldPoint2 -> worldPoint2.distanceTo2DHypotenuse(var10))).orElse(null);
        if (w.var9(var6)) {
            return lIIlIIII[0];
        }
        if (w.var4(Players.getLocal().isMoving() ? 1 : 0)) {
            Movement.setDestination((WorldPoint)var6);
        }
        this.sleep(lIIlIIII[4]);
        return lIIlIIII[1];
    }

    static {
        w.var16();
    }

    private static boolean var9(Object object) {
        return object == null;
    }

    @Inject
    private MovingOffFireTask(a a2, Client client, SquireCerberusConfig squireCerberusConfig) {
        this.aI = a2;
        this.aJ = client;
        this.aK = squireCerberusConfig;
    }

    private static void var16() {
        lIIlIIII = new int[8];
        w.lIIlIIII[0] = (0x51 ^ 0x7E ^ (8 ^ 0x71)) & (175 + 97 - 147 + 85 ^ 58 + 122 - 67 + 19 ^ -1) & ((112 + 117 - -1 + 3 ^ 30 + 21 - -77 + 39) & (89 + 106 - 75 + 84 ^ 48 + 50 - 31 + 63 ^ -1) ^ -1);
        w.lIIlIIII[1] = 1;
        w.lIIlIIII[2] = 0xFFFF97FF & 0x6CDF;
        w.lIIlIIII[3] = 0xFFFFB4FF & 0x4FDE;
        w.lIIlIIII[4] = 3;
        w.lIIlIIII[5] = 0x73 ^ 0x45 ^ (0x7C ^ 0x4E);
        w.lIIlIIII[6] = -1;
        w.lIIlIIII[7] = 2;
    }

    private static boolean var15(int n2) {
        return n2 != 0;
    }
}

