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
package l.-.-.n.s.s.i.e.r.q.p.o.c.o.t.u.r.e.t;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import l.-.-.n.s.s.i.e.r.q.p.o.c.o.t.u.r.e.t.b;
import l.-.-.n.s.s.i.e.r.q.p.o.c.o.t.u.r.e.t.c;
import l.-.-.n.s.s.i.e.r.q.p.o.c.o.t.u.r.e.t.d;
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

public class a {
    public static /* synthetic */ d l;
    private static /* synthetic */ int[] lIIIlIlIIIlII;
    private static final /* synthetic */ Random k;

    public void i() {
        switch (b.m[l.ordinal()]) {
            case 1: {
                a lllllllllllllllIIIIlllIlIllIIllI;
                lllllllllllllllIIIIlllIlIllIIllI.a(lIIIlIlIIIlII[2], lIIIlIlIIIlII[3], lIIIlIlIIIlII[1]);
                "".length();
                if (null == null) break;
                return;
            }
            case 2: {
                a lllllllllllllllIIIIlllIlIllIIllI;
                lllllllllllllllIIIIlllIlIllIIllI.a(lIIIlIlIIIlII[4], lIIIlIlIIIlII[3], lIIIlIlIIIlII[1]);
                "".length();
                if (null == null) break;
                return;
            }
            case 3: {
                a lllllllllllllllIIIIlllIlIllIIllI;
                lllllllllllllllIIIIlllIlIllIIllI.a(lIIIlIlIIIlII[5], lIIIlIlIIIlII[6], lIIIlIlIIIlII[1]);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private void a(int n, int n2, int n3) {
        void var4_4;
        CollisionMap collisionMap;
        Map lllllllllllllllIIIIlllIlIlIlllII = Walker.buildTransportLinks();
        if (a.lIIllllllIlIlIl(Static.getGlobalCollisionMap() instanceof GlobalCollisionMap)) {
            collisionMap = Static.getGlobalCollisionMap();
            "".length();
            if ("   ".length() <= 0) {
                return;
            }
        } else {
            collisionMap = null;
        }
        LocalCollisionMap localCollisionMap = new LocalCollisionMap((GlobalCollisionMap)collisionMap, lIIIlIlIIIlII[1]);
        List list = new Pathfinder((CollisionMap)localCollisionMap, (Map)var4_4, List.of(Players.getLocal().getWorldLocation()), a.a(new RegionPoint(n, n2, n3, lIIIlIlIIIlII[7])), RegionManager.avoidWilderness()).find();
        Walker.walkAlong((List)list, (Map)var4_4);
        "".length();
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
            "".length();
            if ("  ".length() >= (0x5F ^ 0x5B)) {
                return ((0xF ^ 0x4F) & ~(0xCF ^ 0x8F)) != 0;
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
                "".length();
                if ("   ".length() <= 0) {
                    return ((0x72 ^ 0x63 ^ (0xCD ^ 0x9B)) & (210 + 120 - 164 + 48 ^ 121 + 105 - 101 + 20 ^ -" ".length())) != 0;
                }
            } else {
                bl = lIIIlIlIIIlII[1];
            }
            return bl;
        }).max(Comparator.comparing(c::k)).orElse(null);
    }

    public static WorldPoint a(RegionPoint regionPoint) {
        if (a.lIIllllllIlIIll(regionPoint)) {
            return null;
        }
        WorldPoint worldPoint2 = regionPoint.toWorld();
        Client client = Static.getClient();
        return WorldPoint.toLocalInstance((Client)client, (WorldPoint)worldPoint2).stream().min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo(new WorldPoint(client.getBaseX(), client.getBaseY(), client.getPlane())))).orElse(worldPoint2);
    }

    private static void lIIllllllIlIIlI() {
        lIIIlIlIIIlII = new int[8];
        a.lIIIlIlIIIlII[0] = " ".length();
        a.lIIIlIlIIIlII[1] = (0x99 ^ 0x8B) & ~(0x6A ^ 0x78);
        a.lIIIlIlIIIlII[2] = 0x79 ^ 0x57;
        a.lIIIlIlIIIlII[3] = 0x1E ^ 0x18 ^ (0x41 ^ 0x66);
        a.lIIIlIlIIIlII[4] = 0xAA ^ 0x96 ^ (0x3A ^ 0xA);
        a.lIIIlIlIIIlII[5] = 0xEB ^ 0x85 ^ (0xC ^ 0x42);
        a.lIIIlIlIIIlII[6] = 0x42 ^ 0x50;
        a.lIIIlIlIIIlII[7] = -(0xA ^ 0x48) & (0xFFFFB9EB & 0x6F7D);
    }

    public boolean e() {
        boolean bl;
        if (a.lIIllllllIlIlII(Widgets.get((WidgetInfo)WidgetInfo.PEST_CONTROL_KNIGHT_INFO_CONTAINER))) {
            bl = lIIIlIlIIIlII[0];
            "".length();
            if (((0xCE ^ 0x81) & ~(0xEB ^ 0xA4)) != 0) {
                return ((0xA8 ^ 0x87) & ~(0x17 ^ 0x38)) != 0;
            }
        } else {
            bl = lIIIlIlIIIlII[1];
        }
        return bl;
    }
}

