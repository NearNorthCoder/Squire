package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import gg.squire.autotoa.TOAConfig;
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
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.R  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/R.class */
public class R extends S {
    private static /* synthetic */ int[] llIllIIllII;
    private final /* synthetic */ C0067p bT;
    private final /* synthetic */ Client bS;
    private final /* synthetic */ TOAConfig bU;

    private void h(Graphics2D graphics2D) {
        List<WorldPoint> V = this.bT.V();
        if (lIlIlIIlIlIllI(V.isEmpty() ? 1 : 0)) {
            return;
        }
        int i = llIllIIllII[0];
        while (lIlIlIIlIllIII(i, V.size())) {
            LocalPoint fromWorld = LocalPoint.fromWorld(this.bS, V.get(i));
            if (lIlIlIIlIlIlll(fromWorld)) {
                "".length();
                if (((((4 + 115) - 93) + 155) ^ (((18 + 0) - (-47)) + 112)) < ((((102 + 23) - 59) + 101) ^ (((144 + 158) - 200) + 61))) {
                    return;
                }
            } else {
                Point localToCanvas = Perspective.localToCanvas(this.bS, fromWorld, this.bS.getPlane());
                if (lIlIlIIlIlIlll(localToCanvas)) {
                    "".length();
                    if ("   ".length() == ((200 ^ 192) & ((77 ^ 69) ^ (-1)))) {
                        return;
                    }
                } else {
                    a(graphics2D, new Color(llIllIIllII[0], llIllIIllII[1], llIllIIllII[0], llIllIIllII[2]), fromWorld);
                    OverlayUtil.renderTextLocation(graphics2D, localToCanvas, String.valueOf(i + llIllIIllII[3]), Color.WHITE);
                }
            }
            i++;
            "".length();
            if ((51 ^ 55) <= 0) {
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a(Graphics2D graphics2D, Map<GroundObject, Integer> map) {
        for (GroundObject groundObject : map.keySet()) {
            LocalPoint fromWorld = LocalPoint.fromWorld(this.bS, groundObject.getWorldLocation());
            if (lIlIlIIlIlIlll(fromWorld)) {
                "".length();
                if ((true ^ true) & ((true ^ true) ^ true)) {
                    return;
                }
            } else {
                Point localToCanvas = Perspective.localToCanvas(this.bS, fromWorld, this.bS.getPlane());
                if (lIlIlIIlIlIlll(localToCanvas)) {
                    "".length();
                    if (((106 ^ 111) & ((22 ^ 19) ^ (-1))) < 0) {
                        return;
                    }
                } else {
                    a(graphics2D, new Color(llIllIIllII[0], llIllIIllII[1], llIllIIllII[0], llIllIIllII[2]), fromWorld);
                    OverlayUtil.renderTextLocation(graphics2D, localToCanvas, String.valueOf(map.get(groundObject)), Color.WHITE);
                    "".length();
                    if ("   ".length() <= (-" ".length())) {
                        return;
                    }
                }
            }
        }
    }

    private static boolean lIlIlIIlIlIllI(int i) {
        return i != 0;
    }

    private static void lIlIlIIlIlIlIl() {
        llIllIIllII = new int[4];
        llIllIIllII[0] = (222 ^ 196) & ((29 ^ 7) ^ (-1));
        llIllIIllII[1] = (((((191 + 22) - 157) + 172) + (((21 + 103) - 57) + 123)) - ((-7694) & 8061)) + ((135 + 24) - 135) + 181;
        llIllIIllII[2] = 66 ^ 91;
        llIllIIllII[3] = " ".length();
    }

    private void g(Graphics2D graphics2D) {
        a(graphics2D, this.bT.Y());
        a(graphics2D, this.bT.X());
    }

    public Dimension render(Graphics2D graphics2D) {
        j(graphics2D);
        i(graphics2D);
        h(graphics2D);
        g(graphics2D);
        return null;
    }

    private void i(Graphics2D graphics2D) {
        for (GroundObject groundObject : this.bT.Q()) {
            a(graphics2D, Color.GREEN, groundObject.getLocalLocation());
            "".length();
            if ((-" ".length()) < (-" ".length())) {
                return;
            }
        }
    }

    static {
        lIlIlIIlIlIlIl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void j(Graphics2D graphics2D) {
        int i = llIllIIllII[3];
        for (WorldPoint worldPoint : this.bT.R()) {
            i++;
            LocalPoint fromWorld = LocalPoint.fromWorld(this.bS, worldPoint);
            if (lIlIlIIlIlIlll(fromWorld)) {
                "".length();
                if ((((((80 + 104) - 129) + 115) ^ (((101 + 64) - 132) + 130)) & (((240 ^ 185) ^ (115 ^ 51)) ^ (-" ".length()))) < 0) {
                    return;
                }
            } else {
                Point tileCenter = Perspective.tileCenter(this.bS, worldPoint);
                Polygon canvasTilePoly = Perspective.getCanvasTilePoly(this.bS, fromWorld);
                if (!lIlIlIIlIllIIl(canvasTilePoly)) {
                    continue;
                } else if (lIlIlIIlIlIlll(tileCenter)) {
                    "".length();
                    if ((((((155 + 112) - 113) + 15) ^ (((23 + 109) - 67) + 67)) & (((115 ^ 66) ^ (54 ^ 42)) ^ (-" ".length()))) >= "   ".length()) {
                        return;
                    }
                } else {
                    OverlayUtil.renderPolygon(graphics2D, canvasTilePoly, Color.GREEN);
                    OverlayUtil.renderTextLocation(graphics2D, tileCenter, String.valueOf(i - llIllIIllII[3]), Color.GREEN);
                    "".length();
                    if (((128 ^ 180) & ((0 ^ 52) ^ (-1))) > 0) {
                        return;
                    }
                }
            }
        }
    }

    private static boolean lIlIlIIlIlIlll(Object obj) {
        return obj == null;
    }

    private static boolean lIlIlIIlIllIIl(Object obj) {
        return obj != null;
    }

    private static boolean lIlIlIIlIllIII(int i, int i2) {
        return i < i2;
    }

    @Inject
    protected R(Client client, C0067p c0067p, TOAConfig tOAConfig) {
        super(tOAConfig);
        this.bS = client;
        this.bT = c0067p;
        this.bU = tOAConfig;
        setPriority(OverlayPriority.HIGH);
        setPosition(OverlayPosition.DYNAMIC);
        setLayer(OverlayLayer.UNDER_WIDGETS);
    }
}
