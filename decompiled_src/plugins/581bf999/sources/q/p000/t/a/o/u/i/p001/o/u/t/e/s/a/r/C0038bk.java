package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Comparator;
import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Point;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GameObjectSpawned;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
@TaskDesc(name = "Moving away from all dung", priority = 40, blocking = true, register = true)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bk  reason: invalid package and case insensitive filesystem */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/bk.class */
public class C0038bk extends AbstractC0035bh {
    private /* synthetic */ int fc;
    private static /* synthetic */ int[] lIlllIIIIlI;
    private static final /* synthetic */ int fb;
    private static final /* synthetic */ int fa;
    private /* synthetic */ int fd;

    static {
        lIIllIIIIllllI();
        fa = lIlllIIIIlI[2];
        fb = lIlllIIIIlI[1];
    }

    private static boolean lIIllIIIIlllll(Object obj) {
        return obj == null;
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public void r() {
        this.fc = lIlllIIIIlI[0];
    }

    private int v(WorldPoint worldPoint) {
        NPC bO = bO();
        TileObject nearest = TileObjects.getNearest(worldPoint, tileObject -> {
            if (lIIllIIIlIIIII(tileObject.getId(), lIlllIIIIlI[6]) && lIIllIIIlIIIll(bO.getWorldArea().isInMeleeDistance(tileObject.getWorldLocation()) ? 1 : 0)) {
                ?? r0 = lIlllIIIIlI[3];
                "".length();
                return "   ".length() == 0 ? ((73 ^ 4) ^ (22 ^ 99)) & (((42 ^ 108) ^ (231 ^ 153)) ^ (-" ".length())) : r0;
            }
            return lIlllIIIIlI[0];
        });
        if (lIIllIIIIlllll(nearest)) {
            return lIlllIIIIlI[5];
        }
        TileObject nearest2 = TileObjects.getNearest(worldPoint, tileObject2 -> {
            if (lIIllIIIlIIIII(tileObject2.getId(), lIlllIIIIlI[6]) && lIIllIIIlIIIll(bO.getWorldArea().isInMeleeDistance(tileObject2.getWorldLocation()) ? 1 : 0) && lIIllIIIlIIlIl(tileObject2, nearest)) {
                ?? r0 = lIlllIIIIlI[3];
                "".length();
                return ((30 ^ 45) & ((1 ^ 50) ^ (-1))) <= (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIlllIIIIlI[0];
        });
        return lIIllIIIIlllll(nearest2) ? worldPoint.distanceTo(nearest.getWorldLocation()) : worldPoint.distanceTo(nearest.getWorldLocation()) + worldPoint.distanceTo(nearest2.getWorldLocation());
    }

    private static void lIIllIIIIllllI() {
        lIlllIIIIlI = new int[8];
        lIlllIIIIlI[0] = (61 ^ 108) & ((96 ^ 49) ^ (-1));
        lIlllIIIIlI[1] = (-22673) & 32250;
        lIlllIIIIlI[2] = ((90 + 189) - 160) + 126;
        lIlllIIIIlI[3] = " ".length();
        lIlllIIIIlI[4] = (((37 + 116) - 79) + 59) ^ (((59 + 51) - (-21)) + 12);
        lIlllIIIIlI[5] = (-1) & Integer.MAX_VALUE;
        lIlllIIIIlI[6] = (-((-12297) & 31803)) & (-525) & 65534;
        lIlllIIIIlI[7] = "   ".length();
    }

    private WorldPoint bX() {
        int i = lIlllIIIIlI[5];
        WorldPoint worldPoint = null;
        for (Point point : eN) {
            WorldPoint a = a(point);
            WorldPoint worldLocation = Players.getLocal().getWorldLocation();
            if (lIIllIIIlIIIll(worldLocation.equals(a) ? 1 : 0)) {
                return a(eN.get((eN.indexOf(point) + lIlllIIIIlI[3]) % eN.size()));
            }
            if (lIIllIIIlIIlII(worldLocation.distanceTo(a), i)) {
                i = worldLocation.distanceTo(a);
                worldPoint = a;
            }
            "".length();
            if (((191 ^ 175) & ((40 ^ 56) ^ (-1))) == "   ".length()) {
                return null;
            }
        }
        if (lIIllIIIIlllll(worldPoint)) {
            return null;
        }
        return a(eN.get((eN.indexOf(worldPoint) + lIlllIIIIlI[3]) % eN.size()));
    }

    @Subscribe
    public void b(GameObjectSpawned gameObjectSpawned) {
        if (lIIllIIIlIIIII(gameObjectSpawned.getGameObject().getId(), lIlllIIIIlI[6])) {
        }
    }

    private static boolean lIIllIIIlIIlIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lIIllIIIlIIIIl(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v52, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0035bh
    protected boolean bL() {
        Player localPlayer = this.cu.getLocalPlayer();
        if (lIIllIIIIlllll(localPlayer)) {
            return lIlllIIIIlI[0];
        }
        if (lIIllIIIlIIIII(bO().getAnimation(), lIlllIIIIlI[1])) {
            this.fd = this.cu.getTickCount();
        }
        if (lIIllIIIlIIIIl(localPlayer.hasSpotAnim(lIlllIIIIlI[2]) ? 1 : 0)) {
            this.fc = lIlllIIIIlI[0];
            return lIlllIIIIlI[0];
        }
        f((boolean) lIlllIIIIlI[0]);
        if (lIIllIIIlIIIlI(this.cu.getTickCount() - this.fd, lIlllIIIIlI[3])) {
            return lIlllIIIIlI[0];
        }
        WorldPoint bX = bX();
        if (lIIllIIIIlllll(bX)) {
            List<TileObject> bM = bM();
            bX = (WorldPoint) localPlayer.getWorldArea().offset(lIlllIIIIlI[4]).toWorldPointList().stream().filter(worldPoint -> {
                if (lIIllIIIlIIIlI(bO().getWorldLocation().distanceTo(worldPoint), lIlllIIIIlI[7])) {
                    ?? r0 = lIlllIIIIlI[3];
                    "".length();
                    return " ".length() <= 0 ? ((200 ^ 169) ^ (243 ^ 173)) & (((173 ^ 185) ^ (119 ^ 92)) ^ (-" ".length())) : r0;
                }
                return lIlllIIIIlI[0];
            }).filter(worldPoint2 -> {
                return bM.stream().noneMatch(tileObject -> {
                    return tileObject.getWorldLocation().toWorldArea().isInMeleeDistance(worldPoint2);
                });
            }).filter(Reachable::isWalkable).max(Comparator.comparingInt(this::v)).orElse(null);
        }
        if (lIIllIIIIlllll(bX)) {
            return lIlllIIIIlI[0];
        }
        Movement.setDestination(bX);
        this.fc += lIlllIIIIlI[3];
        return lIlllIIIIlI[3];
    }

    private static boolean lIIllIIIlIIIlI(int i, int i2) {
        return i > i2;
    }

    @Inject
    protected C0038bk(Client client, C0077z c0077z, TOAConfig tOAConfig) {
        super(client, c0077z, tOAConfig, EnumC0036bi.ATTACK);
        this.fc = lIlllIIIIlI[0];
    }

    private static boolean lIIllIIIlIIlII(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIllIIIlIIIll(int i) {
        return i != 0;
    }

    private static boolean lIIllIIIlIIIII(int i, int i2) {
        return i == i2;
    }
}
