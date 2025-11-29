package p000.r.u.q.e.s.o.t.a.i;

import gg.squire.toa.TOAConfig;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.GroundObject;
import net.runelite.api.Perspective;
import net.runelite.api.Point;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.OverlayUtil;
/* renamed from: -.r.u.q.e.s.o.t.a.i.v  reason: invalid package */
/* loaded from: squire-toa-1.0.1.jar:-/r/u/q/e/s/o/t/a/i/v.class */
public class v extends w {
    private static /* synthetic */ int[] lIIlllllllIII;
    private final /* synthetic */ TOAConfig aH;
    private final /* synthetic */ C0009j aG;
    private final /* synthetic */ Client aF;

    @Inject
    protected v(Client client, C0009j c0009j, TOAConfig tOAConfig) {
        super(tOAConfig);
        this.aF = client;
        this.aG = c0009j;
        this.aH = tOAConfig;
        setPriority(OverlayPriority.HIGH);
        setPosition(OverlayPosition.DYNAMIC);
        setLayer(OverlayLayer.UNDER_WIDGETS);
    }

    private void a(Graphics2D graphics2D, Map<GroundObject, Integer> map) {
        for (GroundObject groundObject : map.keySet()) {
            LocalPoint fromWorld = LocalPoint.fromWorld(this.aF, groundObject.getWorldLocation());
            if (lIllIlIlIllllIl(fromWorld)) {
                "".length();
                if (0 != 0) {
                    return;
                }
            } else {
                Point localToCanvas = Perspective.localToCanvas(this.aF, fromWorld, this.aF.getPlane());
                if (lIllIlIlIllllIl(localToCanvas)) {
                    "".length();
                    if (" ".length() == "   ".length()) {
                        return;
                    }
                } else {
                    a(graphics2D, new Color(lIIlllllllIII[0], lIIlllllllIII[1], lIIlllllllIII[0], lIIlllllllIII[2]), fromWorld);
                    OverlayUtil.renderTextLocation(graphics2D, localToCanvas, String.valueOf(map.get(groundObject)), Color.WHITE);
                    "".length();
                    if (0 != 0) {
                        return;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void j(Graphics2D graphics2D) {
        int i = lIIlllllllIII[3];
        for (WorldPoint worldPoint : this.aG.q()) {
            i++;
            LocalPoint fromWorld = LocalPoint.fromWorld(this.aF, worldPoint);
            if (lIllIlIlIllllIl(fromWorld)) {
                "".length();
                if ("   ".length() <= 0) {
                    return;
                }
            } else {
                Point tileCenter = Perspective.tileCenter(this.aF, worldPoint);
                Polygon canvasTilePoly = Perspective.getCanvasTilePoly(this.aF, fromWorld);
                if (!lIllIlIlIllllll(canvasTilePoly)) {
                    continue;
                } else if (lIllIlIlIllllIl(tileCenter)) {
                    "".length();
                    if ((124 ^ 120) <= ((53 ^ 41) & ((86 ^ 74) ^ (-1)))) {
                        return;
                    }
                } else {
                    OverlayUtil.renderPolygon(graphics2D, canvasTilePoly, Color.GREEN);
                    OverlayUtil.renderTextLocation(graphics2D, tileCenter, String.valueOf(i - lIIlllllllIII[3]), Color.GREEN);
                    "".length();
                    if (0 != 0) {
                        return;
                    }
                }
            }
        }
    }

    private void h(Graphics2D graphics2D) {
        List<WorldPoint> u = this.aG.u();
        if (lIllIlIlIllllII(u.isEmpty() ? 1 : 0)) {
            return;
        }
        int i = lIIlllllllIII[0];
        while (lIllIlIlIlllllI(i, u.size())) {
            LocalPoint fromWorld = LocalPoint.fromWorld(this.aF, u.get(i));
            if (lIllIlIlIllllIl(fromWorld)) {
                "".length();
                if (0 != 0) {
                    return;
                }
            } else {
                Point localToCanvas = Perspective.localToCanvas(this.aF, fromWorld, this.aF.getPlane());
                if (lIllIlIlIllllIl(localToCanvas)) {
                    "".length();
                    if (0 != 0) {
                        return;
                    }
                } else {
                    a(graphics2D, new Color(lIIlllllllIII[0], lIIlllllllIII[1], lIIlllllllIII[0], lIIlllllllIII[2]), fromWorld);
                    OverlayUtil.renderTextLocation(graphics2D, localToCanvas, String.valueOf(i + lIIlllllllIII[3]), Color.WHITE);
                }
            }
            i++;
            "".length();
            if ((-" ".length()) >= 0) {
                return;
            }
        }
    }

    private static boolean lIllIlIlIllllII(int i) {
        return i != 0;
    }

    private static void lIllIlIlIlllIll() {
        lIIlllllllIII = new int[4];
        lIIlllllllIII[0] = ((((137 + 21) - 117) + 154) ^ (((82 + 23) - 42) + 85)) & (((127 ^ 75) ^ (92 ^ 63)) ^ (-" ".length()));
        lIIlllllllIII[1] = ((64 + 32) - (-123)) + 36;
        lIIlllllllIII[2] = 36 ^ 61;
        lIIlllllllIII[3] = " ".length();
    }

    private void i(Graphics2D graphics2D) {
        for (GroundObject groundObject : this.aG.p()) {
            a(graphics2D, Color.GREEN, groundObject.getLocalLocation());
            "".length();
            if ((-" ".length()) == "   ".length()) {
                return;
            }
        }
    }

    private static boolean lIllIlIlIlllllI(int i, int i2) {
        return i < i2;
    }

    static {
        lIllIlIlIlllIll();
    }

    private static boolean lIllIlIlIllllIl(Object obj) {
        return obj == null;
    }

    public Dimension render(Graphics2D graphics2D) {
        j(graphics2D);
        i(graphics2D);
        h(graphics2D);
        g(graphics2D);
        return null;
    }

    private void g(Graphics2D graphics2D) {
        a(graphics2D, this.aG.x());
        a(graphics2D, this.aG.w());
    }

    private static boolean lIllIlIlIllllll(Object obj) {
        return obj != null;
    }
}
