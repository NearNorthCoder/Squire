package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Iterator;
import net.runelite.api.Client;
import net.runelite.api.GraphicsObject;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
@TaskDesc(name = "Dodging falling boulder", priority = 5)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aN  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/aN.class */
public class aN extends aI {
    private static /* synthetic */ int[] llIIIlllIll;

    @Inject
    protected aN(Client client, C0077z c0077z, TOAConfig tOAConfig) {
        super(client, c0077z, tOAConfig);
    }

    static {
        lIIlllllIlIllI();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x014c, code lost:
        if (lIIlllllIllIII(r7) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x014f, code lost:
        net.unethicalite.api.movement.Movement.setDestination(net.unethicalite.api.entities.Players.getLocal().getWorldLocation().dx(q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.aN.llIIIlllIll[4]));
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0169, code lost:
        return q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.aN.llIIIlllIll[3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x016f, code lost:
        return q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.aN.llIIIlllIll[0];
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.aI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean bC() {
        NPC bB = bB();
        if (lIIlllllIlIlll(bB) && !lIIlllllIllIII(bB.getWorldArea().contains(Players.getLocal()) ? 1 : 0)) {
            int i = llIIIlllIll[0];
            Iterator it = this.cu.getGraphicsObjects().iterator();
            while (true) {
                if (!lIIlllllIllIII(it.hasNext() ? 1 : 0)) {
                    break;
                }
                GraphicsObject graphicsObject = (GraphicsObject) it.next();
                WorldPoint fromLocal = WorldPoint.fromLocal(this.cu, graphicsObject.getLocation());
                if (lIIlllllIllIIl(graphicsObject.getId(), llIIIlllIll[1])) {
                    "".length();
                    if ("   ".length() <= "  ".length()) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                } else if (lIIlllllIllIlI(graphicsObject.getFrame(), llIIIlllIll[2])) {
                    "".length();
                    if (((126 ^ 48) & ((57 ^ 119) ^ (-1))) > ((91 ^ 95) & ((166 ^ 162) ^ (-1)))) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                } else if (lIIlllllIllIII(fromLocal.equals(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    i = llIIIlllIll[3];
                    "".length();
                    if (((((87 + 32) - 96) + 158) ^ (((20 + 14) - (-24)) + 119)) < 0) {
                        return " ".length() & (" ".length() ^ (-" ".length()));
                    }
                } else {
                    "".length();
                    if ((-(84 ^ 80)) > 0) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                }
            }
        } else {
            return llIIIlllIll[0];
        }
    }

    private static boolean lIIlllllIllIII(int i) {
        return i != 0;
    }

    private static boolean lIIlllllIllIlI(int i, int i2) {
        return i > i2;
    }

    private static boolean lIIlllllIllIIl(int i, int i2) {
        return i != i2;
    }

    private static void lIIlllllIlIllI() {
        llIIIlllIll = new int[5];
        llIIIlllIll[0] = (199 ^ 133) & ((63 ^ 125) ^ (-1));
        llIIIlllIll[1] = (-((-13385) & 30585)) & (-13313) & 32763;
        llIIIlllIll[2] = 142 ^ 163;
        llIIIlllIll[3] = " ".length();
        llIIIlllIll[4] = -" ".length();
    }

    private static boolean lIIlllllIlIlll(Object obj) {
        return obj != null;
    }
}
