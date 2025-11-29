package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import gg.squire.autotoa.TOAConfig;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.util.HashSet;
import java.util.Queue;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Perspective;
import net.runelite.api.Point;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.OverlayUtil;
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.M  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/M.class */
public class M extends Overlay {
    private static final /* synthetic */ Color[] bF;
    private final /* synthetic */ C0064m bH;
    private static /* synthetic */ int[] lIllIllllII;
    private final /* synthetic */ Client bG;
    private final /* synthetic */ TOAConfig bI;

    private void a(Graphics2D graphics2D) {
        Queue<EnumC0065n> G = this.bH.G();
        HashSet hashSet = new HashSet();
        int i = lIllIllllII[0];
        for (EnumC0065n enumC0065n : G) {
            if (lIIllIIIIIlIll(i, lIllIllllII[1])) {
                "".length();
                if (" ".length() == "  ".length()) {
                    return;
                }
                return;
            }
            WorldPoint a = enumC0065n.a(this.bG);
            if (lIIllIIIIIlIlI(hashSet.contains(a) ? 1 : 0)) {
                "".length();
                if ((-((((158 + 155) - 209) + 57) ^ (((82 + 110) - 106) + 78))) >= 0) {
                    return;
                }
                return;
            }
            Color color = bF[i];
            hashSet.add(a);
            "".length();
            i++;
            int i2 = lIllIllllII[2];
            while (lIIllIIIIIllII(i2, lIllIllllII[3])) {
                int i3 = lIllIllllII[2];
                while (lIIllIIIIIllII(i3, lIllIllllII[3])) {
                    LocalPoint fromWorld = LocalPoint.fromWorld(this.bG, a.dx(i2).dy(i3));
                    if (lIIllIIIIIllIl(fromWorld)) {
                        "".length();
                        if ("   ".length() == 0) {
                            return;
                        }
                    } else {
                        Point tileCenter = Perspective.tileCenter(this.bG, a);
                        Polygon canvasTilePoly = Perspective.getCanvasTilePoly(this.bG, fromWorld);
                        if (lIIllIIIIIlllI(canvasTilePoly)) {
                            if (lIIllIIIIIllIl(tileCenter)) {
                                "".length();
                                if ((-" ".length()) >= 0) {
                                    return;
                                }
                            } else {
                                OverlayUtil.renderPolygon(graphics2D, canvasTilePoly, color, new Color(color.getRed(), color.getGreen(), color.getBlue(), lIllIllllII[4]), new BasicStroke(1.0f));
                            }
                        }
                    }
                    i3++;
                    "".length();
                    if ("   ".length() <= (-" ".length())) {
                        return;
                    }
                }
                i2++;
                "".length();
                if ("  ".length() < "  ".length()) {
                    return;
                }
            }
            "".length();
            if (0 != 0) {
                return;
            }
        }
    }

    private static boolean lIIllIIIIIlIll(int i, int i2) {
        return i >= i2;
    }

    static {
        lIIllIIIIIlIIl();
        Color[] colorArr = new Color[lIllIllllII[5]];
        colorArr[lIllIllllII[0]] = Color.GREEN;
        colorArr[lIllIllllII[3]] = Color.ORANGE;
        colorArr[lIllIllllII[1]] = Color.YELLOW;
        colorArr[lIllIllllII[6]] = Color.RED;
        colorArr[lIllIllllII[7]] = Color.BLACK;
        bF = colorArr;
    }

    private static void lIIllIIIIIlIIl() {
        lIllIllllII = new int[8];
        lIllIllllII[0] = ((((132 + 158) - 165) + 52) ^ (((138 + 132) - 138) + 32)) & (((((5 + 96) - 46) + 119) ^ (((25 + 98) - (-48)) + 16)) ^ (-" ".length()));
        lIllIllllII[1] = "  ".length();
        lIllIllllII[2] = -" ".length();
        lIllIllllII[3] = " ".length();
        lIllIllllII[4] = 54 ^ 47;
        lIllIllllII[5] = (111 ^ 42) ^ (245 ^ 181);
        lIllIllllII[6] = "   ".length();
        lIllIllllII[7] = (((133 + 127) - 219) + 141) ^ (((11 + 58) - (-44)) + 65);
    }

    @Inject
    protected M(Client client, C0064m c0064m, TOAConfig tOAConfig) {
        this.bG = client;
        this.bH = c0064m;
        this.bI = tOAConfig;
        setPriority(OverlayPriority.HIGH);
        setPosition(OverlayPosition.DYNAMIC);
        setLayer(OverlayLayer.UNDER_WIDGETS);
    }

    private static boolean lIIllIIIIIlllI(Object obj) {
        return obj != null;
    }

    private static boolean lIIllIIIIIllIl(Object obj) {
        return obj == null;
    }

    private static boolean lIIllIIIIIlIlI(int i) {
        return i != 0;
    }

    private static boolean lIIllIIIIIllII(int i, int i2) {
        return i <= i2;
    }

    public Dimension render(Graphics2D graphics2D) {
        a(graphics2D);
        return null;
    }
}
