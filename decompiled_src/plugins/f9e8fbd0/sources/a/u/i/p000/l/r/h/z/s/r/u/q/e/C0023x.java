package a.u.i.p000.l.r.h.z.s.r.u.q.e;

import com.google.inject.Inject;
import gg.squire.zulrah.SquireZulrah;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Polygon;
import net.runelite.api.Client;
import net.runelite.api.Perspective;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayUtil;
/* renamed from: a.u.i.-.l.r.h.z.s.r.u.q.e.x  reason: invalid package and case insensitive filesystem */
/* loaded from: f9e8fbd0-4571-4716-b37b-883b4ae7fc62.jar:a/u/i/-/l/r/h/z/s/r/u/q/e/x.class */
public class C0023x extends Overlay {
    private final /* synthetic */ SquireZulrah Q;
    private final /* synthetic */ C0021v R;
    private final /* synthetic */ Client P;

    private static boolean llIIlIIIIIIllII(Object obj) {
        return obj != null;
    }

    private static boolean llIIlIIIIIIlIll(Object obj) {
        return obj == null;
    }

    public Dimension render(Graphics2D graphics2D) {
        if (llIIlIIIIIIlIIl(this.Q.isPaintDisabled() ? 1 : 0) || llIIlIIIIIIlIlI(this.P.isInInstancedRegion() ? 1 : 0)) {
            return null;
        }
        WorldPoint X = this.R.X();
        if (llIIlIIIIIIlIll(X)) {
            return null;
        }
        LocalPoint fromWorld = LocalPoint.fromWorld(this.P, this.R.V().C().a(X));
        LocalPoint fromWorld2 = LocalPoint.fromWorld(this.P, this.R.X());
        if (!llIIlIIIIIIllII(fromWorld2) || llIIlIIIIIIlIll(fromWorld)) {
            return null;
        }
        Polygon canvasTilePoly = Perspective.getCanvasTilePoly(this.P, fromWorld);
        OverlayUtil.renderPolygon(graphics2D, Perspective.getCanvasTilePoly(this.P, fromWorld2), Color.BLUE);
        OverlayUtil.renderPolygon(graphics2D, canvasTilePoly, Color.GREEN);
        return null;
    }

    @Inject
    public C0023x(Client client, SquireZulrah squireZulrah, C0021v c0021v) {
        this.P = client;
        this.Q = squireZulrah;
        this.R = c0021v;
        setLayer(OverlayLayer.ABOVE_SCENE);
        setPosition(OverlayPosition.DYNAMIC);
    }

    private static boolean llIIlIIIIIIlIIl(int i) {
        return i != 0;
    }

    private static boolean llIIlIIIIIIlIlI(int i) {
        return i == 0;
    }
}
