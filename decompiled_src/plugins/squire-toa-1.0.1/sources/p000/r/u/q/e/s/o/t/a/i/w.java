package p000.r.u.q.e.s.o.t.a.i;

import com.google.inject.Inject;
import gg.squire.toa.TOAConfig;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Polygon;
import net.runelite.api.Client;
import net.runelite.api.Perspective;
import net.runelite.api.Point;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.ui.FontManager;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayUtil;
/* renamed from: -.r.u.q.e.s.o.t.a.i.w  reason: invalid package */
/* loaded from: squire-toa-1.0.1.jar:-/r/u/q/e/s/o/t/a/i/w.class */
public abstract class w extends Overlay {
    @Inject
    protected /* synthetic */ Client M;
    protected final /* synthetic */ TOAConfig aI;
    private static /* synthetic */ int[] lIlIIIIlIlIII;

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(Graphics2D graphics2D, Color color, LocalPoint localPoint) {
        if (lIllIllIllIIIIl(localPoint)) {
            return;
        }
        Polygon canvasTilePoly = Perspective.getCanvasTilePoly(this.M, localPoint);
        if (lIllIllIllIIIIl(canvasTilePoly)) {
            return;
        }
        a(graphics2D, color, canvasTilePoly, lIlIIIIlIlIII[0], lIlIIIIlIlIII[10]);
    }

    static {
        lIllIllIlIllIlI();
    }

    public static Polygon a(Client client, LocalPoint localPoint, int i, boolean z) {
        return a(client, localPoint, i, lIlIIIIlIlIII[1], z);
    }

    private static void lIllIllIlIllIlI() {
        lIlIIIIlIlIII = new int[11];
        lIlIIIIlIlIII[0] = " ".length();
        lIlIIIIlIlIII[1] = ((((162 + 45) - 47) + 45) ^ (((34 + 42) - 10) + 68)) & (((146 ^ 153) ^ (255 ^ 191)) ^ (-" ".length()));
        lIlIIIIlIlIII[2] = (((115 ^ 30) + (93 ^ 99)) - (249 ^ 198)) + (11 ^ 31);
        lIlIIIIlIlIII[3] = "  ".length();
        lIlIIIIlIlIII[4] = (45 ^ 39) ^ (111 ^ 13);
        lIlIIIIlIlIII[5] = "   ".length();
        lIlIIIIlIlIII[6] = 57 ^ 62;
        lIlIIIIlIlIII[7] = ((44 + 99) - 96) + 80;
        lIlIIIIlIlIII[8] = (113 ^ 31) ^ (209 ^ 159);
        lIlIIIIlIlIII[9] = 4 ^ 8;
        lIlIIIIlIlIII[10] = 21 ^ 39;
    }

    public void a(Graphics2D graphics2D, String str, Color color, Point point) {
        if (lIllIllIllIIIII(point)) {
            graphics2D.setFont(new Font(FontManager.getRunescapeSmallFont().toString(), lIlIIIIlIlIII[1], lIlIIIIlIlIII[9]));
            Point point2 = new Point(point.getX(), point.getY());
            OverlayUtil.renderTextLocation(graphics2D, new Point(point.getX() + lIlIIIIlIlIII[0], point.getY() + lIlIIIIlIlIII[0]), str, Color.BLACK);
            OverlayUtil.renderTextLocation(graphics2D, point2, str, color);
        }
    }

    private static boolean lIllIllIllIIIII(Object obj) {
        return obj != null;
    }

    private static boolean lIllIllIlIlllII(int i) {
        return i >= 0;
    }

    protected void a(Graphics2D graphics2D, Color color, Polygon polygon, int i) {
        if (lIllIllIllIIIII(polygon)) {
            graphics2D.setColor(color);
            graphics2D.setStroke(new BasicStroke(i));
            graphics2D.draw(polygon);
        }
    }

    protected void a(Graphics2D graphics2D, Color color, Polygon polygon, int i, int i2) {
        if (lIllIllIllIIIII(polygon)) {
            graphics2D.setColor(color);
            graphics2D.setStroke(new BasicStroke(i));
            graphics2D.draw(polygon);
            graphics2D.setColor(new Color(color.getRed(), color.getGreen(), color.getBlue(), i2));
            graphics2D.fill(polygon);
        }
    }

    private static boolean lIllIllIlIllIll(int i) {
        return i != 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Inject
    public w(TOAConfig tOAConfig) {
        this.aI = tOAConfig;
        setPosition(OverlayPosition.DYNAMIC);
        setLayer(OverlayLayer.ABOVE_SCENE);
    }

    private static int a(Client client, int i, int i2, int i3) {
        int i4 = i >> lIlIIIIlIlIII[6];
        int i5 = i2 >> lIlIIIIlIlIII[6];
        if (lIllIllIlIlllII(i4) && lIllIllIlIlllII(i5) && lIllIllIlIlllIl(i4, lIlIIIIlIlIII[4]) && lIllIllIlIlllIl(i5, lIlIIIIlIlIII[4])) {
            int[][][] tileHeights = client.getTileHeights();
            int i6 = i & lIlIIIIlIlIII[7];
            int i7 = i2 & lIlIIIIlIlIII[7];
            return (((lIlIIIIlIlIII[2] - i7) * (((i6 * tileHeights[i3][i4 + lIlIIIIlIlIII[0]][i5]) + ((lIlIIIIlIlIII[2] - i6) * tileHeights[i3][i4][i5])) >> lIlIIIIlIlIII[6])) + (i7 * (((tileHeights[i3][i4][i5 + lIlIIIIlIlIII[0]] * (lIlIIIIlIlIII[2] - i6)) + (i6 * tileHeights[i3][i4 + lIlIIIIlIlIII[0]][i5 + lIlIIIIlIlIII[0]])) >> lIlIIIIlIlIII[6]))) >> lIlIIIIlIlIII[6];
        }
        return lIlIIIIlIlIII[1];
    }

    protected void a(Graphics2D graphics2D, Color color, Polygon polygon) {
        a(graphics2D, color, polygon, lIlIIIIlIlIII[3]);
    }

    public static Polygon a(Client client, LocalPoint localPoint, int i, int i2, boolean z) {
        int x;
        int y;
        int x2;
        int y2;
        int plane = client.getPlane();
        if (lIllIllIlIllIll(z ? 1 : 0)) {
            x = localPoint.getX() - ((i * (lIlIIIIlIlIII[2] + i2)) / lIlIIIIlIlIII[3]);
            y = localPoint.getY() - ((i * (lIlIIIIlIlIII[2] + i2)) / lIlIIIIlIlIII[3]);
            x2 = localPoint.getX() + ((i * (lIlIIIIlIlIII[2] + i2)) / lIlIIIIlIlIII[3]);
            y2 = localPoint.getY() + ((i * (lIlIIIIlIlIII[2] + i2)) / lIlIIIIlIlIII[3]);
            "".length();
            if ((83 ^ 87) < (116 ^ 112)) {
                return null;
            }
        } else {
            x = localPoint.getX() - ((lIlIIIIlIlIII[2] + i2) / lIlIIIIlIlIII[3]);
            y = localPoint.getY() - ((lIlIIIIlIlIII[2] + i2) / lIlIIIIlIlIII[3]);
            x2 = (localPoint.getX() - ((lIlIIIIlIlIII[2] + i2) / lIlIIIIlIlIII[3])) + (i * (lIlIIIIlIlIII[2] + i2));
            y2 = (localPoint.getY() - ((lIlIIIIlIlIII[2] + i2) / lIlIIIIlIlIII[3])) + (i * (lIlIIIIlIlIII[2] + i2));
        }
        byte[][][] tileSettings = client.getTileSettings();
        int sceneX = localPoint.getSceneX();
        int sceneY = localPoint.getSceneY();
        if (lIllIllIlIlllII(sceneX) && lIllIllIlIlllII(sceneY) && lIllIllIlIlllIl(sceneX, lIlIIIIlIlIII[4]) && !lIllIllIlIllllI(sceneY, lIlIIIIlIlIII[4])) {
            int i3 = plane;
            if (lIllIllIlIlllIl(plane, lIlIIIIlIlIII[5]) && lIllIllIlIlllll(tileSettings[lIlIIIIlIlIII[0]][sceneX][sceneY] & lIlIIIIlIlIII[3], lIlIIIIlIlIII[3])) {
                i3 = plane + lIlIIIIlIlIII[0];
            }
            int a = a(client, x, y, i3);
            int a2 = a(client, x2, y, i3);
            int a3 = a(client, x2, y2, i3);
            int a4 = a(client, x, y2, i3);
            Point localToCanvas = Perspective.localToCanvas(client, x, y, a);
            Point localToCanvas2 = Perspective.localToCanvas(client, x2, y, a2);
            Point localToCanvas3 = Perspective.localToCanvas(client, x2, y2, a3);
            Point localToCanvas4 = Perspective.localToCanvas(client, x, y2, a4);
            if (lIllIllIllIIIII(localToCanvas) && lIllIllIllIIIII(localToCanvas2) && lIllIllIllIIIII(localToCanvas3) && !lIllIllIllIIIIl(localToCanvas4)) {
                Polygon polygon = new Polygon();
                polygon.addPoint(localToCanvas.getX(), localToCanvas.getY());
                polygon.addPoint(localToCanvas2.getX(), localToCanvas2.getY());
                polygon.addPoint(localToCanvas3.getX(), localToCanvas3.getY());
                polygon.addPoint(localToCanvas4.getX(), localToCanvas4.getY());
                return polygon;
            }
            return null;
        }
        return null;
    }

    protected void a(Graphics2D graphics2D, WorldPoint worldPoint, Color color, int i, int i2, int i3) {
        if (lIllIllIlIllllI(worldPoint.distanceTo(this.M.getLocalPlayer().getWorldLocation()), lIlIIIIlIlIII[8])) {
            return;
        }
        LocalPoint fromWorld = LocalPoint.fromWorld(this.M, worldPoint);
        if (lIllIllIllIIIIl(fromWorld)) {
            return;
        }
        Polygon canvasTilePoly = Perspective.getCanvasTilePoly(this.M, fromWorld);
        if (lIllIllIllIIIIl(canvasTilePoly)) {
            return;
        }
        graphics2D.setColor(new Color(color.getRed(), color.getGreen(), color.getBlue(), i2));
        graphics2D.setStroke(new BasicStroke(i));
        graphics2D.draw(canvasTilePoly);
        graphics2D.setColor(new Color(color.getRed(), color.getGreen(), color.getBlue(), i3));
        graphics2D.fill(canvasTilePoly);
    }

    private static boolean lIllIllIlIllllI(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIllIllIlIlllIl(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean] */
    public static Polygon a(Client client, LocalPoint localPoint, int i, int i2) {
        return a(client, localPoint, i, i2, (boolean) lIlIIIIlIlIII[0]);
    }

    private static boolean lIllIllIllIIIIl(Object obj) {
        return obj == null;
    }

    private static boolean lIllIllIlIlllll(int i, int i2) {
        return i == i2;
    }
}
