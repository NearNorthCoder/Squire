package s.h.p000.m.a.n.u.r.i.s.q.a.s.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.pvm.SquireShamanConfig;
import java.util.Comparator;
import java.util.Objects;
import java.util.stream.Stream;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@TaskDesc(name = "Avoiding spawns", priority = 50, blocking = true)
/* renamed from: s.h.-.m.a.n.u.r.i.s.q.a.s.e.r  reason: invalid package */
/* loaded from: 29f97a50-4c1f-4047-b5b1-e3e7ab557a1b.jar:s/h/-/m/a/n/u/r/i/s/q/a/s/e/r.class */
public class r extends Task {
    /* synthetic */ g aj;
    /* synthetic */ SquireShamanConfig c;
    /* synthetic */ c Q;
    private static final /* synthetic */ Logger ai;
    private static /* synthetic */ int[] lIIlIlllllIlI;

    private static boolean lIlIlllIIIlIlll(int i) {
        return i == 0;
    }

    static {
        lIlIlllIIIlIllI();
        ai = LoggerFactory.getLogger(r.class);
    }

    private static void lIlIlllIIIlIllI() {
        lIIlIlllllIlI = new int[4];
        lIIlIlllllIlI[0] = (77 ^ 97) & ((78 ^ 98) ^ (-1));
        lIIlIlllllIlI[1] = "   ".length();
        lIIlIlllllIlI[2] = " ".length();
        lIIlIlllllIlI[3] = "  ".length();
    }

    private static boolean lIlIlllIIIllIll(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public boolean run() {
        WorldPoint worldLocation = Players.getLocal().getWorldLocation();
        if (!lIlIlllIIIlIlll(Players.getLocal().isMoving() ? 1 : 0) || lIlIlllIIIlIlll(this.Q.s() ? 1 : 0)) {
            return lIIlIlllllIlI[0];
        }
        NPC o = this.Q.o();
        if (lIlIlllIIIllIII(o)) {
            return lIIlIlllllIlI[0];
        }
        if (lIlIlllIIIlIlll(Movement.isRunEnabled() ? 1 : 0) && lIlIlllIIIllIIl(Movement.getRunEnergy(), lIIlIlllllIlI[1])) {
            Movement.toggleRun();
        }
        Stream<WorldPoint> stream = this.aj.z().stream();
        c cVar = this.Q;
        Objects.requireNonNull(cVar);
        "".length();
        WorldPoint orElse = stream.filter(this::a).filter(worldPoint -> {
            if (lIlIlllIIIllIll(worldPoint.distanceTo(o.getWorldLocation()), lIIlIlllllIlI[3])) {
                ?? r0 = lIIlIlllllIlI[2];
                "".length();
                return "   ".length() <= (-" ".length()) ? ((94 ^ 116) ^ (((23 + 53) - 21) + 72)) & (((47 ^ 91) ^ (118 ^ 87)) ^ (-" ".length())) : r0;
            }
            return lIIlIlllllIlI[0];
        }).max(Comparator.comparingInt(worldPoint2 -> {
            return worldPoint2.distanceTo(Players.getLocal().getWorldLocation());
        })).orElse(null);
        if (lIlIlllIIIllIII(orElse)) {
            return lIIlIlllllIlI[0];
        }
        if (lIlIlllIIIllIlI(this.Q.a(worldLocation) ? 1 : 0) && lIlIlllIIIllIll(this.Q.o().getWorldArea().distanceTo(worldLocation), lIIlIlllllIlI[2])) {
            return lIIlIlllllIlI[0];
        }
        Movement.walk(orElse);
        return lIIlIlllllIlI[2];
    }

    @Inject
    public r(c cVar, SquireShamanConfig squireShamanConfig) {
        this.Q = cVar;
        this.c = squireShamanConfig;
        this.aj = squireShamanConfig.room();
    }

    private static boolean lIlIlllIIIllIlI(int i) {
        return i != 0;
    }

    private static boolean lIlIlllIIIllIII(Object obj) {
        return obj == null;
    }

    private static boolean lIlIlllIIIllIIl(int i, int i2) {
        return i >= i2;
    }
}
