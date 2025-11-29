package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import gg.squire.autotoa.TOAConfig;
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
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.N  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/N.class */
public class N extends S {
    private final /* synthetic */ Client bJ;
    private final /* synthetic */ C0061j bK;

    public Dimension render(Graphics2D graphics2D) {
        b(graphics2D);
        return null;
    }

    private static boolean lIlIIIIIIllIIl(int i) {
        return i != 0;
    }

    private static boolean lIlIIIIIIllIlI(Object obj) {
        return obj == null;
    }

    @Inject
    protected N(TOAConfig tOAConfig, Client client, C0061j c0061j) {
        super(tOAConfig);
        this.bJ = client;
        this.bK = c0061j;
        setPriority(OverlayPriority.HIGH);
        setPosition(OverlayPosition.DYNAMIC);
        setLayer(OverlayLayer.UNDER_WIDGETS);
    }

    private void b(Graphics2D graphics2D) {
        for (NPC npc : this.bK.B()) {
            Shape convexHull = npc.getConvexHull();
            if (lIlIIIIIIllIlI(convexHull)) {
                "".length();
                if ((63 ^ 59) <= "   ".length()) {
                    return;
                }
            } else {
                OverlayUtil.renderPolygon(graphics2D, convexHull, Color.BLUE, new BasicStroke(1.0f));
                "".length();
                if ((((((65 + 110) - 93) + 70) ^ (((31 + 92) - 23) + 77)) & (((((153 + 140) - 134) + 80) ^ (((17 + 63) - 66) + 184)) ^ (-" ".length()))) != 0) {
                    return;
                }
            }
        }
    }
}
