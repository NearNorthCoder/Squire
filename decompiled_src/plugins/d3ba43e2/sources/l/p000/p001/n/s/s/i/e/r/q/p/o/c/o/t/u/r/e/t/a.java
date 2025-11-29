package l.p000.p001.n.s.s.i.e.r.q.p.o.c.o.t.u.r.e.t;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Random;
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
/* renamed from: l.-.-.n.s.s.i.e.r.q.p.o.c.o.t.u.r.e.t.a  reason: invalid package */
/* loaded from: d3ba43e2-4966-4faf-8fcb-fba83fc95121.jar:l/-/-/n/s/s/i/e/r/q/p/o/c/o/t/u/r/e/t/a.class */
public class a {

    /* renamed from: l  reason: collision with root package name */
    public static /* synthetic */ d f0l;
    private static /* synthetic */ int[] lIIIlIlIIIlII;
    private static final /* synthetic */ Random k;

    public void i() {
        switch (b.m[f0l.ordinal()]) {
            case 1:
                a(lIIIlIlIIIlII[2], lIIIlIlIIIlII[3], lIIIlIlIIIlII[1]);
                "".length();
                if (0 != 0) {
                    return;
                }
                return;
            case 2:
                a(lIIIlIlIIIlII[4], lIIIlIlIIIlII[3], lIIIlIlIIIlII[1]);
                "".length();
                if (0 != 0) {
                    return;
                }
                return;
            case 3:
                a(lIIIlIlIIIlII[5], lIIIlIlIIIlII[6], lIIIlIlIIIlII[1]);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean] */
    private void a(int i, int i2, int i3) {
        CollisionMap collisionMap;
        Map buildTransportLinks = Walker.buildTransportLinks();
        if (lIIllllllIlIlIl(Static.getGlobalCollisionMap() instanceof GlobalCollisionMap ? 1 : 0)) {
            collisionMap = Static.getGlobalCollisionMap();
            "".length();
            if ("   ".length() <= 0) {
                return;
            }
        } else {
            collisionMap = null;
        }
        Walker.walkAlong(new Pathfinder(new LocalCollisionMap((GlobalCollisionMap) collisionMap, (boolean) lIIIlIlIIIlII[1]), buildTransportLinks, List.of(Players.getLocal().getWorldLocation()), a(new RegionPoint(i, i2, i3, lIIIlIlIIIlII[7])), RegionManager.avoidWilderness()).find(), buildTransportLinks);
        "".length();
    }

    public d h() {
        return d.values()[k.nextInt(d.values().length)];
    }

    private static boolean lIIllllllIlIlII(Object obj) {
        return obj != null;
    }

    private static boolean lIIllllllIlIlIl(int i) {
        return i != 0;
    }

    private static boolean lIIllllllIlIIll(Object obj) {
        return obj == null;
    }

    static {
        lIIllllllIlIIlI();
        k = new Random();
    }

    private static boolean lIIllllllIlIllI(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public boolean f() {
        if (lIIllllllIlIlII(Widgets.get(WidgetInfo.PEST_CONTROL_BOAT_INFO))) {
            ?? r0 = lIIIlIlIIIlII[0];
            "".length();
            return "  ".length() >= (95 ^ 91) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIIlIlIIIlII[1];
    }

    public c g() {
        int combatLevel = Players.getLocal().getCombatLevel();
        return (c) Arrays.stream(c.values()).filter(cVar -> {
            if (lIIllllllIlIllI(cVar.k(), combatLevel)) {
                ?? r0 = lIIIlIlIIIlII[0];
                "".length();
                return "   ".length() <= 0 ? ((114 ^ 99) ^ (205 ^ 155)) & (((((210 + 120) - 164) + 48) ^ (((121 + 105) - 101) + 20)) ^ (-" ".length())) : r0;
            }
            return lIIIlIlIIIlII[1];
        }).max(Comparator.comparing((v0) -> {
            return v0.k();
        })).orElse(null);
    }

    public static WorldPoint a(RegionPoint regionPoint) {
        if (lIIllllllIlIIll(regionPoint)) {
            return null;
        }
        WorldPoint world = regionPoint.toWorld();
        Client client = Static.getClient();
        return (WorldPoint) WorldPoint.toLocalInstance(client, world).stream().min(Comparator.comparingInt(worldPoint -> {
            return worldPoint.distanceTo(new WorldPoint(client.getBaseX(), client.getBaseY(), client.getPlane()));
        })).orElse(world);
    }

    private static void lIIllllllIlIIlI() {
        lIIIlIlIIIlII = new int[8];
        lIIIlIlIIIlII[0] = " ".length();
        lIIIlIlIIIlII[1] = (153 ^ 139) & ((106 ^ 120) ^ (-1));
        lIIIlIlIIIlII[2] = 121 ^ 87;
        lIIIlIlIIIlII[3] = (30 ^ 24) ^ (65 ^ 102);
        lIIIlIlIIIlII[4] = (170 ^ 150) ^ (58 ^ 10);
        lIIIlIlIIIlII[5] = (235 ^ 133) ^ (12 ^ 66);
        lIIIlIlIIIlII[6] = 66 ^ 80;
        lIIIlIlIIIlII[7] = (-(10 ^ 72)) & (-17941) & 28541;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public boolean e() {
        if (lIIllllllIlIlII(Widgets.get(WidgetInfo.PEST_CONTROL_KNIGHT_INFO_CONTAINER))) {
            ?? r0 = lIIIlIlIIIlII[0];
            "".length();
            return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIIlIlIIIlII[1];
    }
}
