package p000.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.ArrayList;
import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.GraphicsObject;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.client.Static;
@TaskDesc(name = "Dodging snowfall damage", priority = 5, blocking = true)
/* renamed from: -.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e.j  reason: invalid package */
/* loaded from: 185d2d5a-4681-414b-93d2-e699fe383083.jar:-/d/t/u/t/r/o/i/t/n/s/q/i/w/r/e/e/j.class */
public class j extends Task {
    private static /* synthetic */ int[] lIlIlllllIIll;
    private final /* synthetic */ b P;
    private final /* synthetic */ List<WorldPoint> O = new ArrayList();

    private static boolean llIIIIllIlIllII(int i, int i2) {
        return i < i2;
    }

    static {
        llIIIIllIlIIllI();
    }

    private static boolean llIIIIllIlIlIIl(int i, int i2) {
        return i != i2;
    }

    @Inject
    public j(b bVar) {
        this.P = bVar;
    }

    private static void llIIIIllIlIIllI() {
        lIlIlllllIIll = new int[5];
        lIlIlllllIIll[0] = (-31242) & 31743;
        lIlIlllllIIll[1] = -" ".length();
        lIlIlllllIIll[2] = ((13 ^ 96) ^ (244 ^ 159)) & (((59 ^ 27) ^ (140 ^ 170)) ^ (-" ".length()));
        lIlIlllllIIll[3] = (((1 + 67) - (-44)) + 83) ^ (((103 + 59) - (-28)) + 8);
        lIlIlllllIIll[4] = " ".length();
    }

    private static boolean llIIIIllIlIlIll(int i) {
        return i == 0;
    }

    private static boolean llIIIIllIlIIlll(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    public boolean run() {
        WorldPoint worldLocation = Players.getLocal().getWorldLocation();
        Client client = Static.getClient();
        this.O.clear();
        for (GraphicsObject graphicsObject : client.getGraphicsObjects()) {
            if (llIIIIllIlIlIII(graphicsObject)) {
                if (llIIIIllIlIlIIl(graphicsObject.getId(), lIlIlllllIIll[0])) {
                    "".length();
                    if ((-"  ".length()) >= 0) {
                        return ((((154 + 28) - 165) + 212) ^ (((24 + 64) - 38) + 114)) & (((69 ^ 52) ^ (4 ^ 52)) ^ (-" ".length()));
                    }
                } else {
                    LocalPoint location = graphicsObject.getLocation();
                    if (llIIIIllIlIlIlI(location)) {
                        "".length();
                        if ((-"  ".length()) >= 0) {
                            return ((247 ^ 199) ^ (223 ^ 199)) & (((10 ^ 37) ^ (133 ^ 130)) ^ (-" ".length()));
                        }
                    } else {
                        this.O.add(WorldPoint.fromLocal(client, location));
                        "".length();
                        "".length();
                        if ("   ".length() < 0) {
                            return (true ^ true) & ((true ^ true) ^ true);
                        }
                    }
                }
            }
        }
        if (llIIIIllIlIlIll(this.O.contains(worldLocation) ? 1 : 0)) {
            return this.O.contains(this.P.q().b());
        }
        WorldPoint dy = worldLocation.dy(lIlIlllllIIll[1]);
        int i = lIlIlllllIIll[2];
        while (llIIIIllIlIIlll(this.O.contains(dy) ? 1 : 0) && llIIIIllIlIllII(i, lIlIlllllIIll[3])) {
            dy = dy.dy(lIlIlllllIIll[1]);
            i++;
            "".length();
            if ((-"  ".length()) > 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return lIlIlllllIIll[4];
    }

    private static boolean llIIIIllIlIlIII(Object obj) {
        return obj != null;
    }

    public List<WorldPoint> D() {
        return this.O;
    }

    private static boolean llIIIIllIlIlIlI(Object obj) {
        return obj == null;
    }
}
