package q.i.e.u.s.s.o.e.i.n.l.f.p000.r.o.p001.p.p002.m.r.o;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.moons.SquireMoonsOfPerilConfig;
import java.util.List;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.widgets.Prayers;
@TaskDesc(name = "PrayFlick", priority = 2147483646)
/* renamed from: q.i.e.u.s.s.o.e.i.n.l.f.-.r.o.-.p.-.m.r.o.j  reason: invalid package */
/* loaded from: 75784950-1a80-40ed-8300-cd0507c03978.jar:q/i/e/u/s/s/o/e/i/n/l/f/-/r/o/-/p/-/m/r/o/j.class */
public class j extends Task {
    private final /* synthetic */ SquireMoonsOfPerilConfig ag;
    private static /* synthetic */ int[] lIIIIIIIlIlIl;
    /* synthetic */ WorldArea Q = new WorldArea(lIIIIIIIlIlIl[0], lIIIIIIIlIlIl[1], lIIIIIIIlIlIl[2], lIIIIIIIlIlIl[3], lIIIIIIIlIlIl[4]);
    /* synthetic */ WorldArea ah = new WorldArea(lIIIIIIIlIlIl[5], lIIIIIIIlIlIl[1], lIIIIIIIlIlIl[6], lIIIIIIIlIlIl[7], lIIIIIIIlIlIl[4]);
    /* synthetic */ WorldArea ai = new WorldArea(lIIIIIIIlIlIl[8], lIIIIIIIlIlIl[9], lIIIIIIIlIlIl[10], lIIIIIIIlIlIl[6], lIIIIIIIlIlIl[4]);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public boolean run() {
        if (lIIlIllIlIlIIlI(g(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Prayers.disableAll();
            return lIIIIIIIlIlIl[4];
        }
        List offensive = Prayers.getOffensive();
        if (lIIlIllIlIlIIll(Prayers.getPoints())) {
            Prayers.flick(offensive);
            "".length();
        }
        return lIIIIIIIlIlIl[11];
    }

    private static boolean lIIlIllIlIlIIll(int i) {
        return i > 0;
    }

    @Inject
    public j(SquireMoonsOfPerilConfig squireMoonsOfPerilConfig) {
        this.ag = squireMoonsOfPerilConfig;
    }

    static {
        lIIlIllIlIlIIII();
    }

    private static boolean lIIlIllIlIlIlII(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    protected boolean g(WorldPoint worldPoint) {
        if (lIIlIllIlIlIIlI(this.Q.contains(worldPoint) ? 1 : 0) && lIIlIllIlIlIIlI(this.ah.contains(worldPoint) ? 1 : 0) && !lIIlIllIlIlIlII(this.ai.contains(worldPoint) ? 1 : 0)) {
            return lIIIIIIIlIlIl[4];
        }
        ?? r0 = lIIIIIIIlIlIl[11];
        "".length();
        return "  ".length() != "  ".length() ? ((109 ^ 38) ^ (224 ^ 174)) & (((((35 + 36) - (-23)) + 39) ^ (((104 + 51) - 149) + 122)) ^ (-" ".length())) : r0;
    }

    private static void lIIlIllIlIlIIII() {
        lIIIIIIIlIlIl = new int[12];
        lIIIIIIIlIlIl[0] = (-((-5177) & 32377)) & (-4097) & 32767;
        lIIIIIIIlIlIl[1] = (-18965) & 28575;
        lIIIIIIIlIlIl[2] = 163 ^ 133;
        lIIIIIIIlIlIl[3] = 126 ^ 80;
        lIIIIIIIlIlIl[4] = ((32 ^ 54) ^ (146 ^ 177)) & (((213 ^ 151) ^ (194 ^ 181)) ^ (-" ".length()));
        lIIIIIIIlIlIl[5] = (-((-1005) & 31725)) & (-641) & 32732;
        lIIIIIIIlIlIl[6] = (110 ^ 72) ^ "   ".length();
        lIIIIIIIlIlIl[7] = (((154 + 102) - 210) + 129) ^ (((15 + 65) - 12) + 65);
        lIIIIIIIlIlIl[8] = (-12849) & 14267;
        lIIIIIIIlIlIl[9] = (-65) & 9727;
        lIIIIIIIlIlIl[10] = (152 ^ 187) ^ (206 ^ 196);
        lIIIIIIIlIlIl[11] = " ".length();
    }

    private static boolean lIIlIllIlIlIIlI(int i) {
        return i == 0;
    }
}
