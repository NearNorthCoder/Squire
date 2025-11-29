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
    
    private final  Client aJ;
    private final  a aI;

    private static boolean lIIIlIIllI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIIIlIIlII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIIlIIIll(int n2, int n3) {
        return n2 != n3;
    }

    private static  boolean a(WorldArea worldArea, WorldPoint worldPoint) {
        boolean bl2;
        if (w.lIIIlIIlIl(worldArea.contains(worldPoint) ? 1 : 0)) {
            bl2 = lIIlIIII[1];

            if (-1 > 3) {
                return false;
            }
        } else {
            bl2 = lIIlIIII[0];
        }
        return bl2;
    }

    private static boolean lIIIlIIlIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIIllllI(Object object) {
        return object != null;
    }

    public boolean run() {
        WorldPoint lllIIIlIlllIIll;
        GraphicsObject lllIIIlIlllIlII;
        w lllIIIlIllllIlI;
        if (!w.lIIIIllllI(this.aI.k()) || w.lIIIlIIIII(this.aI.k().y())) {
            return lIIlIIII[0];
        }
        WorldPoint lllIIIlIllllIIl = Players.getLocal().getWorldLocation();
        int[] nArray = new int[lIIlIIII[1]];
        nArray[w.lIIlIIII[0]] = lIIlIIII[2];
        List lllIIIlIllllIII = Projectiles.getAll((int[])nArray);
        Deque lllIIIlIlllIlll = lllIIIlIllllIlI.aJ.getGraphicsObjects();
        ArrayList<WorldPoint> lllIIIlIlllIllI = new ArrayList<WorldPoint>();
        lllIIIlIllllIII.forEach(projectile -> {
            lllIIIlIlllIllI.add(WorldPoint.fromLocal((Client)this.aJ, (LocalPoint)projectile.getTarget()));

        });
        Iterator lllIIIlIlllIlIl = lllIIIlIlllIlll.iterator();
        while (w.lIIIlIIIlI(lllIIIlIlllIlIl.hasNext() ? 1 : 0)) {
            lllIIIlIlllIlII = (GraphicsObject)lllIIIlIlllIlIl.next();
            if (!w.lIIIlIIIll(lllIIIlIlllIlII.getId(), lIIlIIII[3]) || w.lIIIlIIlII(lllIIIlIlllIlII.getId(), lIIlIIII[2])) {
                lllIIIlIlllIIll = WorldPoint.fromLocal((Client)lllIIIlIllllIlI.aJ, (LocalPoint)lllIIIlIlllIlII.getLocation());
                lllIIIlIlllIllI.add(lllIIIlIlllIIll);

            }

            if (((0xF0 ^ 0x9E ^ (0xD1 ^ 0x89)) & (0x58 ^ 0x54 ^ (0x16 ^ 0x2C) ^ -1) & ((0xAC ^ 0xB7 ^ (0x98 ^ 0x8A)) & (0x1F ^ 0x74 ^ (0x6B ^ 9) ^ -1) ^ -1)) == ((0x25 ^ 0x1F ^ (0xB1 ^ 0xC3)) & (12 + 159 - 5 + 36 ^ 94 + 121 - 203 + 118 ^ -1))) continue;
            return false;
        }
        if (w.lIIIlIIIlI(lllIIIlIlllIllI.stream().noneMatch(worldPoint2 -> {
            boolean bl2;
            if (w.lIIIlIIllI(worldPoint2.distanceTo(lllIIIlIllllIIl), lIIlIIII[1])) {
                bl2 = lIIlIIII[1];

                }
            } else {
                bl2 = lIIlIIII[0];
            }
            return bl2;
        }) ? 1 : 0)) {
            return lIIlIIII[0];
        }
        lllIIIlIlllIlIl = lllIIIlIllllIlI.aI.k().y();
        lllIIIlIlllIlII = lllIIIlIlllIlIl.getWorldArea();
        lllIIIlIlllIIll = lllIIIlIlllIlII.toWorldPointList().stream().flatMap(worldPoint -> {
            WorldPoint[] worldPointArray = new WorldPoint[lIIlIIII[5]];
            worldPointArray[w.lIIlIIII[0]] = worldPoint.dy(lIIlIIII[1]);
            worldPointArray[w.lIIlIIII[1]] = worldPoint.dy(lIIlIIII[6]);
            worldPointArray[w.lIIlIIII[7]] = worldPoint.dx(lIIlIIII[1]);
            worldPointArray[w.lIIlIIII[4]] = worldPoint.dx(lIIlIIII[6]);
            return Stream.of(worldPointArray);
        }).filter(arg_0 -> w.a((WorldArea)lllIIIlIlllIlII, arg_0)).filter(worldPoint -> lllIIIlIlllIllI.stream().noneMatch(worldPoint2 -> {
            boolean bl2;
            if (w.lIIIlIIllI(worldPoint2.distanceTo(worldPoint), lIIlIIII[1])) {
                bl2 = lIIlIIII[1];

                if (-1 != -1) {
                    return ((0x7E ^ 0x5B ^ (0x1E ^ 0x30)) & (0xF ^ 0x29 ^ (0x38 ^ 0x15) ^ -1)) != 0;
                }
            } else {
                bl2 = lIIlIIII[0];
            }
            return bl2;
        })).min(Comparator.comparingDouble(worldPoint2 -> worldPoint2.distanceTo2DHypotenuse(lllIIIlIllllIIl))).orElse(null);
        if (w.lIIIlIIIII(lllIIIlIlllIIll)) {
            return lIIlIIII[0];
        }
        if (w.lIIIlIIlIl(Players.getLocal().isMoving() ? 1 : 0)) {
            Movement.setDestination((WorldPoint)lllIIIlIlllIIll);
        }
        this.sleep(lIIlIIII[4]);
        return lIIlIIII[1];
    }

    static {
        w.lIIIIlllIl();
    }

    private static boolean lIIIlIIIII(Object object) {
        return object == null;
    }

    @Inject
    private MovingOffFireTask(a a2, Client client, SquireCerberusConfig squireCerberusConfig) {
        this.aI = a2;
        this.aJ = client;
        this.aK = squireCerberusConfig;
    }

    private static boolean lIIIlIIIlI(int n2) {
        return n2 != 0;
    }
}

