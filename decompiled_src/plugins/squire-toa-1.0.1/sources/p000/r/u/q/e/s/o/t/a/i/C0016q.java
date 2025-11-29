package p000.r.u.q.e.s.o.t.a.i;

import gg.squire.toa.TOAConfig;
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
/* renamed from: -.r.u.q.e.s.o.t.a.i.q  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-toa-1.0.1.jar:-/r/u/q/e/s/o/t/a/i/q.class */
public class C0016q extends Overlay {
    private static /* synthetic */ int[] lIIllllIllllI;
    private static final /* synthetic */ Color[] as;
    private final /* synthetic */ C0007h au;
    private final /* synthetic */ Client at;
    private final /* synthetic */ TOAConfig av;

    private static boolean lIllIlIIlllIIII(int i) {
        return i == 0;
    }

    private static boolean lIllIlIIlllIlII(Object obj) {
        return obj == null;
    }

    @Inject
    protected C0016q(Client client, C0007h c0007h, TOAConfig tOAConfig) {
        this.at = client;
        this.au = c0007h;
        this.av = tOAConfig;
        setPriority(OverlayPriority.HIGH);
        setPosition(OverlayPosition.DYNAMIC);
        setLayer(OverlayLayer.UNDER_WIDGETS);
    }

    private static boolean lIllIlIIlllIIIl(int i) {
        return i != 0;
    }

    private static boolean lIllIlIIlllIIll(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIllIlIIlllIlIl(Object obj) {
        return obj != null;
    }

    private static boolean lIllIlIIlllIIlI(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a(Graphics2D graphics2D) {
        if (lIllIlIIlllIIII(this.av.markSectionOrder() ? 1 : 0)) {
            return;
        }
        Queue<EnumC0008i> i = this.au.i();
        HashSet hashSet = new HashSet();
        int i2 = lIIllllIllllI[0];
        for (EnumC0008i enumC0008i : i) {
            if (lIllIlIIlllIIlI(i2, lIIllllIllllI[1])) {
                "".length();
                if ("  ".length() <= 0) {
                    return;
                }
                return;
            }
            WorldPoint a = enumC0008i.a(this.at);
            if (lIllIlIIlllIIIl(hashSet.contains(a) ? 1 : 0)) {
                "".length();
                if ((-((138 ^ 165) ^ (37 ^ 15))) >= 0) {
                    return;
                }
                return;
            }
            Color color = as[i2];
            hashSet.add(a);
            "".length();
            i2++;
            int i3 = lIIllllIllllI[2];
            while (lIllIlIIlllIIll(i3, lIIllllIllllI[3])) {
                int i4 = lIIllllIllllI[2];
                while (lIllIlIIlllIIll(i4, lIIllllIllllI[3])) {
                    LocalPoint fromWorld = LocalPoint.fromWorld(this.at, a.dx(i3).dy(i4));
                    if (lIllIlIIlllIlII(fromWorld)) {
                        "".length();
                        if (((49 ^ 82) & ((210 ^ 177) ^ (-1))) >= (10 ^ 14)) {
                            return;
                        }
                    } else {
                        Point tileCenter = Perspective.tileCenter(this.at, a);
                        Polygon canvasTilePoly = Perspective.getCanvasTilePoly(this.at, fromWorld);
                        if (lIllIlIIlllIlIl(canvasTilePoly)) {
                            if (lIllIlIIlllIlII(tileCenter)) {
                                "".length();
                                if (0 != 0) {
                                    return;
                                }
                            } else {
                                OverlayUtil.renderPolygon(graphics2D, canvasTilePoly, color, new Color(color.getRed(), color.getGreen(), color.getBlue(), lIIllllIllllI[4]), new BasicStroke(1.0f));
                            }
                        }
                    }
                    i4++;
                    "".length();
                    if ((-" ".length()) < (-" ".length())) {
                        return;
                    }
                }
                i3++;
                "".length();
                if ("   ".length() == 0) {
                    return;
                }
            }
            "".length();
            if (0 != 0) {
                return;
            }
        }
    }

    private static void lIllIlIIllIllll() {
        lIIllllIllllI = new int[8];
        lIIllllIllllI[0] = ((68 ^ 115) ^ (127 ^ 64)) & (((((131 + 41) - 159) + 119) ^ (((62 + 91) - 30) + 17)) ^ (-" ".length()));
        lIIllllIllllI[1] = "  ".length();
        lIIllllIllllI[2] = -" ".length();
        lIIllllIllllI[3] = " ".length();
        lIIllllIllllI[4] = (18 ^ 114) ^ (7 ^ 126);
        lIIllllIllllI[5] = 168 ^ 173;
        lIIllllIllllI[6] = "   ".length();
        lIIllllIllllI[7] = (74 ^ 34) ^ (37 ^ 73);
    }

    public Dimension render(Graphics2D graphics2D) {
        a(graphics2D);
        return null;
    }

    static {
        lIllIlIIllIllll();
        Color[] colorArr = new Color[lIIllllIllllI[5]];
        colorArr[lIIllllIllllI[0]] = Color.GREEN;
        colorArr[lIIllllIllllI[3]] = Color.ORANGE;
        colorArr[lIIllllIllllI[1]] = Color.YELLOW;
        colorArr[lIIllllIllllI[6]] = Color.RED;
        colorArr[lIIllllIllllI[7]] = Color.BLACK;
        as = colorArr;
    }
}
