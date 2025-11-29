package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.autotoa.TOAConfig;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Polygon;
import net.runelite.api.GraphicsObject;
import net.runelite.api.Perspective;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.ui.overlay.OverlayUtil;
@Singleton
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.O  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/O.class */
public class O extends S {
    private static /* synthetic */ int[] llIIIIllIII;
    private final /* synthetic */ C0060i bL;

    /* JADX WARN: Multi-variable type inference failed */
    private void c(Graphics2D graphics2D) {
        for (WorldPoint worldPoint : this.bL.y().keySet()) {
            LocalPoint fromWorld = LocalPoint.fromWorld(this.ai, worldPoint);
            if (lIIlllIlIlllII(fromWorld)) {
                "".length();
                if (((105 ^ 35) & ((137 ^ 195) ^ (-1))) > 0) {
                    return;
                }
            } else {
                Polygon canvasTilePoly = Perspective.getCanvasTilePoly(this.ai, fromWorld);
                if (lIIlllIlIlllII(canvasTilePoly)) {
                    "".length();
                    if ("   ".length() == 0) {
                        return;
                    }
                } else {
                    this.bL.y().get(worldPoint);
                    GraphicsObject graphicsObject = this.bL.A().get(worldPoint);
                    Color a = a(graphicsObject);
                    int llllllllllllllllIlIIIllIIlIIllIl = graphicsObject.getFrame();
                    if (lIIlllIlIlllIl(llllllllllllllllIlIIIllIIlIIllIl, llIIIIllIII[0])) {
                        "".length();
                        if (0 != 0) {
                            return;
                        }
                    } else {
                        String valueOf = String.valueOf(llllllllllllllllIlIIIllIIlIIllIl);
                        OverlayUtil.renderTextLocation(graphics2D, Perspective.getCanvasTextLocation(this.ai, graphics2D, fromWorld, valueOf, llIIIIllIII[1]), valueOf, Color.WHITE);
                        OverlayUtil.renderPolygon(graphics2D, canvasTilePoly, a, a, new BasicStroke(0.25f));
                        "".length();
                        if (0 != 0) {
                            return;
                        }
                    }
                }
            }
        }
    }

    private static void lIIlllIlIllIlI() {
        llIIIIllIII = new int[10];
        llIIIIllIII[0] = 149 ^ 152;
        llIIIIllIII[1] = (195 ^ 163) & ((25 ^ 121) ^ (-1));
        llIIIIllIII[2] = (67 ^ 6) ^ (220 ^ 149);
        llIIIIllIII[3] = -" ".length();
        llIIIIllIII[4] = (45 ^ 98) ^ (87 ^ 28);
        llIIIIllIII[5] = ((225 + 249) - 290) + 71;
        llIIIIllIII[6] = 221 ^ 196;
        llIIIIllIII[7] = 23 ^ 31;
        llIIIIllIII[8] = (((32 ^ 105) + (2 ^ 75)) - (194 ^ 163)) + (239 ^ 133);
        llIIIIllIII[9] = 14 ^ 57;
    }

    static {
        lIIlllIlIllIlI();
    }

    private static boolean lIIlllIlIllllI(int i, int i2) {
        return i >= i2;
    }

    public Dimension render(Graphics2D graphics2D) {
        c(graphics2D);
        return null;
    }

    private static boolean lIIlllIlIlllIl(int i, int i2) {
        return i == i2;
    }

    @Inject
    protected O(TOAConfig tOAConfig, C0060i c0060i) {
        super(tOAConfig);
        this.bL = c0060i;
    }

    private static boolean lIIlllIlIlllII(Object obj) {
        return obj == null;
    }

    private static boolean lIIlllIlIllIll(int i) {
        return i != 0;
    }

    private Color a(GraphicsObject graphicsObject) {
        int frame = graphicsObject.getFrame();
        if (lIIlllIlIllllI(frame, llIIIIllIII[2])) {
            frame = llIIIIllIII[3];
        }
        return lIIlllIlIlllll(frame, llIIIIllIII[4]) ? new Color(llIIIIllIII[1], llIIIIllIII[5], llIIIIllIII[1], llIIIIllIII[6]) : lIIlllIlIlllll(frame, llIIIIllIII[7]) ? new Color(llIIIIllIII[5], llIIIIllIII[8], llIIIIllIII[9], llIIIIllIII[6]) : new Color(llIIIIllIII[5], llIIIIllIII[1], llIIIIllIII[1], llIIIIllIII[6]);
    }

    private static boolean lIIlllIlIlllll(int i, int i2) {
        return i < i2;
    }
}
