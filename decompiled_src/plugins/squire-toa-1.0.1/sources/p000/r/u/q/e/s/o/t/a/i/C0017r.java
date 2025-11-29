package p000.r.u.q.e.s.o.t.a.i;

import gg.squire.toa.TOAConfig;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Shape;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.OverlayUtil;
/* renamed from: -.r.u.q.e.s.o.t.a.i.r  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-toa-1.0.1.jar:-/r/u/q/e/s/o/t/a/i/r.class */
public class C0017r extends w {
    private final /* synthetic */ Client aw;
    private final /* synthetic */ C0005f ax;

    public Dimension render(Graphics2D graphics2D) {
        b(graphics2D);
        return null;
    }

    private void b(Graphics2D graphics2D) {
        if (lIllIllIlIIlllI(this.aI.outlineBrokenBoulders() ? 1 : 0)) {
            return;
        }
        for (NPC npc : this.ax.e()) {
            Shape convexHull = npc.getConvexHull();
            if (lIllIllIlIlIIII(convexHull)) {
                "".length();
                if ((-" ".length()) >= (((152 ^ 198) ^ (212 ^ 140)) & (((((119 + 122) - 80) + 25) ^ (((157 + 169) - 215) + 77)) ^ (-" ".length())))) {
                    return;
                }
            } else {
                OverlayUtil.renderPolygon(graphics2D, convexHull, Color.BLUE, new BasicStroke(1.0f));
                "".length();
                if (0 != 0) {
                    return;
                }
            }
        }
    }

    private static boolean lIllIllIlIlIIII(Object obj) {
        return obj == null;
    }

    @Inject
    protected C0017r(TOAConfig tOAConfig, Client client, C0005f c0005f) {
        super(tOAConfig);
        this.aw = client;
        this.ax = c0005f;
        setPriority(OverlayPriority.HIGH);
        setPosition(OverlayPosition.DYNAMIC);
        setLayer(OverlayLayer.UNDER_WIDGETS);
    }

    private static boolean lIllIllIlIIlllI(int i) {
        return i == 0;
    }

    private static boolean lIllIllIlIIllll(int i) {
        return i != 0;
    }
}
