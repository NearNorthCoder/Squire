package p000.m.e.a.u.s.r.r.q.i.r.e.f;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmer;
import gg.squire.farmer.SquireFarmerConfig;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Moving to next birdhouse", priority = 1)
/* renamed from: -.m.e.a.u.s.r.r.q.i.r.e.f.aI  reason: invalid package */
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:-/m/e/a/u/s/r/r/q/i/r/e/f/aI.class */
public class aI extends aG {
    private static /* synthetic */ int[] llIIIIIIIlIl;

    static {
        llllIIIIllIllI();
    }

    private static void llllIIIIllIllI() {
        llIIIIIIIlIl = new int[6];
        llIIIIIIIlIl[0] = 91 ^ 95;
        llIIIIIIIlIl[1] = ((71 ^ 38) ^ (80 ^ 124)) & (((227 ^ 198) ^ (70 ^ 46)) ^ (-" ".length()));
        llIIIIIIIlIl[2] = " ".length();
        llIIIIIIIlIl[3] = "  ".length();
        llIIIIIIIlIl[4] = "   ".length();
        llIIIIIIIlIl[5] = 66 ^ 82;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected aI(SquireFarmer squireFarmer, SquireFarmerConfig squireFarmerConfig, C0035j c0035j) {
        super(squireFarmer, squireFarmerConfig, c0035j, r4);
        F[] fArr = new F[llIIIIIIIlIl[0]];
        fArr[llIIIIIIIlIl[1]] = F.EMPTY;
        fArr[llIIIIIIIlIl[2]] = F.BUILT;
        fArr[llIIIIIIIlIl[3]] = F.SEEDED;
        fArr[llIIIIIIIlIl[4]] = F.UNKNOWN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    @Override // p000.m.e.a.u.s.r.r.q.i.r.e.f.aG
    public boolean f(E e) {
        boolean z;
        TileObject a = this.cu.a(e);
        if (llllIIIIllIlll(a) && llllIIIIlllIII(a.distanceTo(Players.getLocal()), llIIIIIIIlIl[5])) {
            return llIIIIIIIlIl[1];
        }
        if (llllIIIIlllIIl(this.cu.c(e) ? 1 : 0) && llllIIIIlllIlI(this.cu.b(e), F.SEEDED)) {
            return llIIIIIIIlIl[1];
        }
        Player local = Players.getLocal();
        if (llllIIIIlllIll(local.isAnimating() ? 1 : 0)) {
            sleep(llIIIIIIIlIl[4]);
            return llIIIIIIIlIl[1];
        }
        if (llllIIIIlllIll(Movement.shouldWalk() ? 1 : 0)) {
            boolean contains = C0035j.ax.contains(Integer.valueOf(local.getWorldLocation().getRegionID()));
            WorldPoint az = e.az();
            if (llllIIIIlllIIl(contains ? 1 : 0)) {
                int i = llIIIIIIIlIl[2];
                "".length();
                z = i;
                if (0 != 0) {
                    return ((215 ^ 133) ^ (207 ^ 188)) & (((6 ^ 115) ^ (244 ^ 160)) ^ (-" ".length()));
                }
            } else {
                z = llIIIIIIIlIl[1];
            }
            Movement.walkTo(az, z);
            "".length();
        }
        return llIIIIIIIlIl[2];
    }

    private static boolean llllIIIIlllIIl(int i) {
        return i == 0;
    }

    private static boolean llllIIIIlllIlI(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean llllIIIIllIlll(Object obj) {
        return obj != null;
    }

    private static boolean llllIIIIlllIll(int i) {
        return i != 0;
    }

    private static boolean llllIIIIlllIII(int i, int i2) {
        return i <= i2;
    }
}
