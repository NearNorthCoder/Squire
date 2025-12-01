package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
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
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.OverlayUtil;
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.S  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/S.class */
public abstract class S extends Overlay {
    @Inject
    protected /* synthetic */ Client ai;
    protected final /* synthetic */ TOAConfig bV;
    private static /* synthetic */ int[] llIlIlIIIII;

    private static boolean lIlIIllIIlIIll(int i, int i2) {
        return i < i2;
    }

    protected void a(Graphics2D graphics2D, WorldPoint worldPoint, Color color, int i, int i2, int i3) {
        if (lIlIIllIIlIlII(worldPoint.distanceTo(this.ai.getLocalPlayer().getWorldLocation()), llIlIlIIIII[8])) {
            return;
        }
        LocalPoint fromWorld = LocalPoint.fromWorld(this.ai, worldPoint);
        if (lIlIIllIIlIlll(fromWorld)) {
            return;
        }
        Polygon canvasTilePoly = Perspective.getCanvasTilePoly(this.ai, fromWorld);
        if (lIlIIllIIlIlll(canvasTilePoly)) {
            return;
        }
        graphics2D.setColor(new Color(color.getRed(), color.getGreen(), color.getBlue(), i2));
        graphics2D.setStroke(new BasicStroke(i));
        graphics2D.draw(canvasTilePoly);
        graphics2D.setColor(new Color(color.getRed(), color.getGreen(), color.getBlue(), i3));
        graphics2D.fill(canvasTilePoly);
    }

    public static Polygon a(Client client, LocalPoint localPoint, int i, boolean z) {
        return a(client, localPoint, i, llIlIlIIIII[1], z);
    }

    public void a(Graphics2D graphics2D, String str, Color color, Point point) {
        if (lIlIIllIIlIllI(point)) {
            graphics2D.setFont(new Font(FontManager.getRunescapeSmallFont().toString(), llIlIlIIIII[1], llIlIlIIIII[9]));
            Point point2 = new Point(point.getX(), point.getY());
            OverlayUtil.renderTextLocation(graphics2D, new Point(point.getX() + llIlIlIIIII[0], point.getY() + llIlIlIIIII[0]), str, Color.BLACK);
            OverlayUtil.renderTextLocation(graphics2D, point2, str, color);
        }
    }

    public static Polygon a(Client client, LocalPoint localPoint, int i, int i2, boolean z) {
        int x;
        int y;
        int x2;
        int y2;
        int plane = client.getPlane();
        if (lIlIIllIIlIIIl(z ? 1 : 0)) {
            x = localPoint.getX() - ((i * (llIlIlIIIII[2] + i2)) / llIlIlIIIII[3]);
            y = localPoint.getY() - ((i * (llIlIlIIIII[2] + i2)) / llIlIlIIIII[3]);
            x2 = localPoint.getX() + ((i * (llIlIlIIIII[2] + i2)) / llIlIlIIIII[3]);
            y2 = localPoint.getY() + ((i * (llIlIlIIIII[2] + i2)) / llIlIlIIIII[3]);
            "".length();
            if ((((228 ^ 163) ^ (65 ^ 9)) & (((((73 + 1) - 71) + 133) ^ (((89 + 11) - 3) + 38)) ^ (-" ".length()))) != 0) {
                return null;
            }
        } else {
            x = localPoint.getX() - ((llIlIlIIIII[2] + i2) / llIlIlIIIII[3]);
            y = localPoint.getY() - ((llIlIlIIIII[2] + i2) / llIlIlIIIII[3]);
            x2 = (localPoint.getX() - ((llIlIlIIIII[2] + i2) / llIlIlIIIII[3])) + (i * (llIlIlIIIII[2] + i2));
            y2 = (localPoint.getY() - ((llIlIlIIIII[2] + i2) / llIlIlIIIII[3])) + (i * (llIlIlIIIII[2] + i2));
        }
        byte[][][] tileSettings = client.getTileSettings();
        int sceneX = localPoint.getSceneX();
        int sceneY = localPoint.getSceneY();
        if (lIlIIllIIlIIlI(sceneX) && lIlIIllIIlIIlI(sceneY) && lIlIIllIIlIIll(sceneX, llIlIlIIIII[4]) && !lIlIIllIIlIlII(sceneY, llIlIlIIIII[4])) {
            int i3 = plane;
            if (lIlIIllIIlIIll(plane, llIlIlIIIII[5]) && lIlIIllIIlIlIl(tileSettings[llIlIlIIIII[0]][sceneX][sceneY] & llIlIlIIIII[3], llIlIlIIIII[3])) {
                i3 = plane + llIlIlIIIII[0];
            }
            int a = a(client, x, y, i3);
            int a2 = a(client, x2, y, i3);
            int a3 = a(client, x2, y2, i3);
            int a4 = a(client, x, y2, i3);
            Point localToCanvas = Perspective.localToCanvas(client, x, y, a);
            Point localToCanvas2 = Perspective.localToCanvas(client, x2, y, a2);
            Point localToCanvas3 = Perspective.localToCanvas(client, x2, y2, a3);
            Point localToCanvas4 = Perspective.localToCanvas(client, x, y2, a4);
            if (lIlIIllIIlIllI(localToCanvas) && lIlIIllIIlIllI(localToCanvas2) && lIlIIllIIlIllI(localToCanvas3) && !lIlIIllIIlIlll(localToCanvas4)) {
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

    static {
        lIlIIllIIlIIII();
    }

    protected void a(Graphics2D graphics2D, Color color, Polygon polygon, int i, int i2) {
        if (lIlIIllIIlIllI(polygon)) {
            graphics2D.setColor(color);
            graphics2D.setStroke(new BasicStroke(i));
            graphics2D.draw(polygon);
            graphics2D.setColor(new Color(color.getRed(), color.getGreen(), color.getBlue(), i2));
            graphics2D.fill(polygon);
        }
    }

    private static int a(Client client, int i, int i2, int i3) {
        int i4 = i >> llIlIlIIIII[6];
        int i5 = i2 >> llIlIlIIIII[6];
        if (lIlIIllIIlIIlI(i4) && lIlIIllIIlIIlI(i5) && lIlIIllIIlIIll(i4, llIlIlIIIII[4]) && lIlIIllIIlIIll(i5, llIlIlIIIII[4])) {
            int[][][] tileHeights = client.getTileHeights();
            int i6 = i & llIlIlIIIII[7];
            int i7 = i2 & llIlIlIIIII[7];
            return (((llIlIlIIIII[2] - i7) * (((i6 * tileHeights[i3][i4 + llIlIlIIIII[0]][i5]) + ((llIlIlIIIII[2] - i6) * tileHeights[i3][i4][i5])) >> llIlIlIIIII[6])) + (i7 * (((tileHeights[i3][i4][i5 + llIlIlIIIII[0]] * (llIlIlIIIII[2] - i6)) + (i6 * tileHeights[i3][i4 + llIlIlIIIII[0]][i5 + llIlIlIIIII[0]])) >> llIlIlIIIII[6]))) >> llIlIlIIIII[6];
        }
        return llIlIlIIIII[1];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Inject
    public S(TOAConfig tOAConfig) {
        this.bV = tOAConfig;
        setPosition(OverlayPosition.DYNAMIC);
        setPriority(OverlayPriority.HIGH);
        setLayer(OverlayLayer.ABOVE_SCENE);
    }

    private static boolean lIlIIllIIlIlll(Object obj) {
        return obj == null;
    }

    protected void a(Graphics2D graphics2D, Color color, Polygon polygon) {
        a(graphics2D, color, polygon, llIlIlIIIII[3]);
    }

    private static boolean lIlIIllIIlIlIl(int i, int i2) {
        return i == i2;
    }

    private static boolean lIlIIllIIlIIIl(int i) {
        return i != 0;
    }

    private static boolean lIlIIllIIlIlII(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIlIIllIIlIIlI(int i) {
        return i >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean] */
    public static Polygon a(Client client, LocalPoint localPoint, int i, int i2) {
        return a(client, localPoint, i, i2, (boolean) llIlIlIIIII[0]);
    }

    protected void a(Graphics2D graphics2D, Color color, Polygon polygon, int i) {
        if (lIlIIllIIlIllI(polygon)) {
            graphics2D.setColor(color);
            graphics2D.setStroke(new BasicStroke(i));
            graphics2D.draw(polygon);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(Graphics2D graphics2D, Color color, LocalPoint localPoint) {
        if (lIlIIllIIlIlll(localPoint)) {
            return;
        }
        Polygon canvasTilePoly = Perspective.getCanvasTilePoly(this.ai, localPoint);
        if (lIlIIllIIlIlll(canvasTilePoly)) {
            return;
        }
        a(graphics2D, color, canvasTilePoly, llIlIlIIIII[0], llIlIlIIIII[10]);
    }

    private static void lIlIIllIIlIIII() {
        llIlIlIIIII = new int[11];
        llIlIlIIIII[0] = " ".length();
        llIlIlIIIII[1] = (107 ^ 116) & ((41 ^ 54) ^ (-1));
        llIlIlIIIII[2] = (((109 ^ 25) + (68 ^ 36)) - (((14 + 4) - (-1)) + 109)) + (166 ^ 138);
        llIlIlIIIII[3] = "  ".length();
        llIlIlIIIII[4] = (((7 + 26) - (-115)) + 105) ^ (((79 + 138) - 68) + 0);
        llIlIlIIIII[5] = "   ".length();
        llIlIlIIIII[6] = 136 ^ 143;
        llIlIlIIIII[7] = ((" ".length() + (101 ^ 93)) - (239 ^ 195)) + (234 ^ 152);
        llIlIlIIIII[8] = 176 ^ 144;
        llIlIlIIIII[9] = 67 ^ 79;
        llIlIlIIIII[10] = (((72 + 145) - 76) + 102) ^ (((183 + 39) - 161) + 132);
    }

    private static boolean lIlIIllIIlIllI(Object obj) {
        return obj != null;
    }
}
