package a.u.i.p000.l.r.h.z.s.r.u.q.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrahConfig;
import net.runelite.api.Client;
import net.runelite.api.GameObject;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.ScenePoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Moving to safespot", priority = 15)
/* renamed from: a.u.i.-.l.r.h.z.s.r.u.q.e.Z  reason: invalid package */
/* loaded from: f9e8fbd0-4571-4716-b37b-883b4ae7fc62.jar:a/u/i/-/l/r/h/z/s/r/u/q/e/Z.class */
public class Z extends ad {
    private static /* synthetic */ int[] lIllIlIllllIl;

    private static boolean llIIlIIIlIIIIlI(int i) {
        return i != 0;
    }

    private static boolean llIIlIIIlIIIIIl(int i, int i2) {
        return i >= i2;
    }

    private static boolean llIIlIIIlIIIIII(Object obj, Object obj2) {
        return obj == obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private boolean e(WorldPoint worldPoint) {
        for (GameObject gameObject : TileObjects.getAll()) {
            if (llIIlIIIlIIIlIl(gameObject.getId(), lIllIlIllllIl[5]) && llIIlIIIlIIIIlI(gameObject.getWorldArea().contains2D(worldPoint) ? 1 : 0)) {
                return lIllIlIllllIl[4];
            }
            "".length();
            if ("   ".length() == 0) {
                return (true ^ true) & ((true ^ true) ^ true) & (((true ^ true) & ((true ^ true) ^ true)) ^ true);
            }
        }
        return lIllIlIllllIl[0];
    }

    private static boolean llIIlIIIlIIIIll(int i, int i2) {
        return i <= i2;
    }

    @Inject
    protected Z(C0021v c0021v, Client client, SquireZulrahConfig squireZulrahConfig) {
        super(c0021v, client, squireZulrahConfig);
    }

    private static boolean llIIlIIIlIIIlIl(int i, int i2) {
        return i == i2;
    }

    private static boolean llIIlIIIlIIIlII(int i, int i2) {
        return i > i2;
    }

    private static boolean llIIlIIIIllllll(Object obj) {
        return obj == null;
    }

    static {
        llIIlIIIIlllllI();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v59, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v61, types: [boolean] */
    @Override // a.u.i.p000.l.r.h.z.s.r.u.q.e.ad
    public boolean ac() {
        WorldPoint worldPoint;
        Player local = Players.getLocal();
        if (llIIlIIIIllllll(local)) {
            return lIllIlIllllIl[0];
        }
        WorldPoint ai = ai();
        if (llIIlIIIIllllll(ai)) {
            return lIllIlIllllIl[0];
        }
        if (llIIlIIIlIIIIII(this.az.V().C(), EnumC0010k.JAD_PHASE_W) && llIIlIIIlIIIIIl(this.az.aa(), lIllIlIllllIl[1])) {
            worldPoint = this.az.V().D().get(lIllIlIllllIl[0]).C().a(this.az.X());
            "".length();
            if ((141 ^ 137) <= ((143 ^ 195) & ((82 ^ 30) ^ (-1)))) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else {
            worldPoint = ai;
        }
        WorldPoint worldPoint2 = worldPoint;
        if (!llIIlIIIlIIIIlI(local.getWorldLocation().equals(worldPoint2) ? 1 : 0) && !llIIlIIIlIIIIlI(e(worldPoint2) ? 1 : 0)) {
            int distanceTo2D = worldPoint2.distanceTo2D(local.getWorldLocation());
            if (llIIlIIIlIIIIll(distanceTo2D, lIllIlIllllIl[2]) && llIIlIIIlIIIIlI(this.az.U() ? 1 : 0)) {
                return lIllIlIllllIl[0];
            }
            ScenePoint fromWorld = ScenePoint.fromWorld(worldPoint2);
            Movement.setDestination(fromWorld.getX(), fromWorld.getY());
            sleep(lIllIlIllllIl[3]);
            if (llIIlIIIlIIIlII(distanceTo2D, lIllIlIllllIl[3])) {
                ?? r0 = lIllIlIllllIl[4];
                "".length();
                return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIllIlIllllIl[0];
        }
        return lIllIlIllllIl[0];
    }

    private static void llIIlIIIIlllllI() {
        lIllIlIllllIl = new int[6];
        lIllIlIllllIl[0] = ((((84 + 96) - 84) + 38) ^ (((17 + 68) - 41) + 142)) & (((57 ^ 33) ^ (123 ^ 95)) ^ (-" ".length()));
        lIllIlIllllIl[1] = (143 ^ 156) ^ (30 ^ 7);
        lIllIlIllllIl[2] = 43 ^ 47;
        lIllIlIllllIl[3] = "  ".length();
        lIllIlIllllIl[4] = " ".length();
        lIllIlIllllIl[5] = (-4161) & 15860;
    }
}
