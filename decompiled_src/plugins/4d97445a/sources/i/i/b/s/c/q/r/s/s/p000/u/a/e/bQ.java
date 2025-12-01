package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import gg.squire.basics.secondaries.SecondariesPlugin;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Perspective;
import net.runelite.api.Point;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.OverlayUtil;
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.bQ  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/bQ.class */
public class bQ extends Overlay {
    private final /* synthetic */ Client gO;
    private static /* synthetic */ String[] llIlIIlI;
    private static /* synthetic */ int[] llIlIIll;
    private final /* synthetic */ SecondariesPlugin gP;

    public Dimension render(Graphics2D graphics2D) {
        Color color;
        String str;
        if (lIlllIllIl(this.gP.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        WorldPoint cT = this.gP.cT();
        if (lIlllIlllI(cT)) {
            LocalPoint fromWorld = LocalPoint.fromWorld(this.gO, cT);
            if (lIlllIlllI(fromWorld)) {
                Color color2 = ColorScheme.BRAND_YELLOW_TRANSPARENT;
                Color color3 = new Color(color2.getRed(), color2.getGreen(), color2.getBlue(), llIlIIll[0]);
                if (lIlllIllIl(this.gP.cU() ? 1 : 0)) {
                    color = Color.RED;
                    "".length();
                    if ("  ".length() == 0) {
                        return null;
                    }
                } else {
                    color = color2;
                }
                if (lIlllIllIl(this.gP.cU() ? 1 : 0)) {
                    str = llIlIIlI[llIlIIll[1]];
                    "".length();
                    if (" ".length() == 0) {
                        return null;
                    }
                } else {
                    str = llIlIIlI[llIlIIll[2]];
                }
                a(graphics2D, fromWorld, color, 1.0d, color3, str);
                return null;
            }
            return null;
        }
        return null;
    }

    private void a(Graphics2D graphics2D, LocalPoint localPoint, Color color, double d, Color color2, String str) {
        if (lIlllIllll(localPoint)) {
            return;
        }
        Polygon canvasTilePoly = Perspective.getCanvasTilePoly(this.gO, localPoint);
        if (lIlllIllll(canvasTilePoly)) {
            return;
        }
        OverlayUtil.renderPolygon(graphics2D, canvasTilePoly, color, color2, new BasicStroke((float) d));
        if (!lIlllIlllI(str) || lIlllIllIl(str.isEmpty() ? 1 : 0)) {
            return;
        }
        Point canvasTextLocation = Perspective.getCanvasTextLocation(this.gO, graphics2D, localPoint, str, llIlIIll[1]);
        if (lIlllIlllI(canvasTextLocation)) {
            OverlayUtil.renderTextLocation(graphics2D, canvasTextLocation, str, color);
        }
    }

    private static void lIlllIllII() {
        llIlIIll = new int[4];
        llIlIIll[0] = 183 ^ 163;
        llIlIIll[1] = (61 ^ 35) & ((140 ^ 146) ^ (-1));
        llIlIIll[2] = " ".length();
        llIlIIll[3] = "  ".length();
    }

    @Inject
    private bQ(Client client, SecondariesPlugin secondariesPlugin) {
        this.gO = client;
        this.gP = secondariesPlugin;
        setPosition(OverlayPosition.DYNAMIC);
        setLayer(OverlayLayer.ABOVE_SCENE);
        setPriority(OverlayPriority.MED);
    }

    static {
        lIlllIllII();
        lIlllIlIlI();
    }

    private static boolean lIlllIllIl(int i2) {
        return i2 != 0;
    }

    private static void lIlllIlIlI() {
        llIlIIlI = new String[llIlIIll[3]];
        llIlIIlI[llIlIIll[1]] = lIlllIlIIl("NDYHBWs7LR0MBSYsGRA=", "rcKIK");
        llIlIIlI[llIlIIll[2]] = lIlllIlIIl("", "Hfprf");
    }

    private static boolean lIllllIIII(int i2, int i3) {
        return i2 < i3;
    }

    private static boolean lIlllIllll(Object obj) {
        return obj == null;
    }

    private static boolean lIlllIlllI(Object obj) {
        return obj != null;
    }

    private static String lIlllIlIIl(String llIlIllIlllIllI, String llIlIllIlllIlIl) {
        String str = new String(Base64.getDecoder().decode(llIlIllIlllIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llIlIllIlllIlIl.toCharArray();
        int llIlIllIlllIIlI = llIlIIll[1];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i2 = llIlIIll[1];
        while (lIllllIIII(i2, length)) {
            char llIlIllIlllIlll = charArray2[i2];
            sb.append((char) (llIlIllIlllIlll ^ charArray[llIlIllIlllIIlI % charArray.length]));
            "".length();
            llIlIllIlllIIlI++;
            i2++;
            "".length();
            if ((-" ".length()) > " ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
}
