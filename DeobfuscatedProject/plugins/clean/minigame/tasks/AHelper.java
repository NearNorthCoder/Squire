/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Client
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.WidgetInfo
 *  net.unethicalite.api.coords.RegionPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.pathfinder.CollisionMap
 *  net.unethicalite.api.movement.pathfinder.GlobalCollisionMap
 *  net.unethicalite.api.movement.pathfinder.LocalCollisionMap
 *  net.unethicalite.api.movement.pathfinder.Pathfinder
 *  net.unethicalite.api.movement.pathfinder.Walker
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.Static
 *  net.unethicalite.client.managers.RegionManager
 */
package gg.squire.minigame.tasks;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import gg.squire.minigame.tasks.BHelper;
import gg.squire.minigame.tasks.GameEnum;
import gg.squire.minigame.tasks.GameEnum5;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.pathfinder.CollisionMap;
import net.unethicalite.api.movement.pathfinder.GlobalCollisionMap;
import net.unethicalite.api.movement.pathfinder.LocalCollisionMap;
import net.unethicalite.api.movement.pathfinder.Pathfinder;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
import net.unethicalite.client.managers.RegionManager;

public class AHelper {
    public static  d l;
    
    private static final  Random k;

    public void i() {
        switch (b.m[l.ordinal()]) {
            case 1: {
                a var1;
                var1.AHelper(lIIIlIlIIIlII[2], lIIIlIlIIIlII[3], lIIIlIlIIIlII[1]);

                if (null == null) break;
                return;
            }
            case 2: {
                a var1;
                var1.AHelper(lIIIlIlIIIlII[4], lIIIlIlIIIlII[3], lIIIlIlIIIlII[1]);

                if (null == null) break;
                return;
            }
            case 3: {
                a var1;
                var1.AHelper(lIIIlIlIIIlII[5], lIIIlIlIIIlII[6], lIIIlIlIIIlII[1]);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private void AHelper(int n, int n2, int n3) {
        void var4_4;
        CollisionMap collisionMap;
        Map var2 = Walker.buildTransportLinks();
        if (a.lIIllllllIlIlIl(Static.getGlobalCollisionMap() instanceof GlobalCollisionMap)) {
            collisionMap = Static.getGlobalCollisionMap();

            if (3 <= 0) {
                return;
            }
        } else {
            collisionMap = null;
        }
        LocalCollisionMap localCollisionMap = new LocalCollisionMap((GlobalCollisionMap)collisionMap, lIIIlIlIIIlII[1]);
        List list = new Pathfinder((CollisionMap)localCollisionMap, (Map)var4_4, List.of(Players.getLocal().getWorldLocation()), a.AHelper(new RegionPoint(n, n2, n3, lIIIlIlIIIlII[7])), RegionManager.avoidWilderness()).find();
        Walker.walkAlong((List)list, (Map)var4_4);

    }

    public d h() {
        return d.values()[k.nextInt(d.values().length)];
    }

    private static boolean lIIllllllIlIlII(Object object) {
        return object != null;
    }

    private static boolean lIIllllllIlIlIl(int n) {
        return n != 0;
    }

    private static boolean lIIllllllIlIIll(Object object) {
        return object == null;
    }

    static {
        a.lIIllllllIlIIlI();
        k = new Random();
    }

    private static boolean lIIllllllIlIllI(int n, int n2) {
        return n <= n2;
    }

    public boolean f() {
        boolean bl;
        if (a.lIIllllllIlIlII(Widgets.get((WidgetInfo)WidgetInfo.PEST_CONTROL_BOAT_INFO))) {
            bl = lIIIlIlIIIlII[0];

            if (2 >= (0x5F ^ 0x5B)) {
                return false;
            }
        } else {
            bl = lIIIlIlIIIlII[1];
        }
        return bl;
    }

    public c g() {
        int n = Players.getLocal().getCombatLevel();
        return Arrays.stream(c.values()).filter(c2 -> {
            boolean bl;
            if (a.lIIllllllIlIllI(c2.k(), n)) {
                bl = lIIIlIlIIIlII[0];

                if (3 <= 0) {
                    return ((0x72 ^ 0x63 ^ (0xCD ^ 0x9B)) & (210 + 120 - 164 + 48 ^ 121 + 105 - 101 + 20 ^ -1)) != 0;
                }
            } else {
                bl = lIIIlIlIIIlII[1];
            }
            return bl;
        }).max(Comparator.comparing(c::k)).orElse(null);
    }

    public static WorldPoint AHelper(RegionPoint regionPoint) {
        if (a.lIIllllllIlIIll(regionPoint)) {
            return null;
        }
        WorldPoint worldPoint2 = regionPoint.toWorld();
        Client client = Static.getClient();
        return WorldPoint.toLocalInstance((Client)client, (WorldPoint)worldPoint2).stream().min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo(new WorldPoint(client.getBaseX(), client.getBaseY(), client.getPlane())))).orElse(worldPoint2);
    }

    public boolean e() {
        boolean bl;
        if (a.lIIllllllIlIlII(Widgets.get((WidgetInfo)WidgetInfo.PEST_CONTROL_KNIGHT_INFO_CONTAINER))) {
            bl = lIIIlIlIIIlII[0];

            if (((0xCE ^ 0x81) & ~(0xEB ^ 0xA4)) != 0) {
                return false;
            }
        } else {
            bl = lIIIlIlIIIlII[1];
        }
        return bl;
    }
}

