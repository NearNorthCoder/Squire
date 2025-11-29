/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Perspective
 *  net.runelite.api.Point
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.ui.FontManager
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayLayer
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.OverlayUtil
 */
package -.r.u.q.e.s.o.t.a.i;

import com.google.inject.Inject;
import gg.squire.toa.TOAConfig;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;
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

public abstract class w
extends Overlay {
    @Inject
    protected /* synthetic */ Client M;
    protected final /* synthetic */ TOAConfig aI;
    private static /* synthetic */ int[] lIlIIIIlIlIII;

    /*
     * WARNING - void declaration
     */
    protected void a(Graphics2D graphics2D, Color color, LocalPoint localPoint) {
        void var4_4;
        void llllllllllllllIlllIIlIIllllIIlIl;
        w llllllllllllllIlllIIlIIllllIlIII;
        if (w.lIllIllIllIIIIl(localPoint)) {
            return;
        }
        Polygon llllllllllllllIlllIIlIIllllIIlII = Perspective.getCanvasTilePoly((Client)llllllllllllllIlllIIlIIllllIlIII.M, (LocalPoint)llllllllllllllIlllIIlIIllllIIlIl);
        if (w.lIllIllIllIIIIl(llllllllllllllIlllIIlIIllllIIlII)) {
            return;
        }
        this.a(graphics2D, color, (Polygon)var4_4, lIlIIIIlIlIII[0], lIlIIIIlIlIII[10]);
    }

    static {
        w.lIllIllIlIllIlI();
    }

    public static Polygon a(Client client, LocalPoint localPoint, int n2, boolean bl) {
        return w.a(client, localPoint, n2, lIlIIIIlIlIII[1], bl);
    }

    private static void lIllIllIlIllIlI() {
        lIlIIIIlIlIII = new int[11];
        w.lIlIIIIlIlIII[0] = " ".length();
        w.lIlIIIIlIlIII[1] = (162 + 45 - 47 + 45 ^ 34 + 42 - 10 + 68) & (0x92 ^ 0x99 ^ (0xFF ^ 0xBF) ^ -" ".length());
        w.lIlIIIIlIlIII[2] = (0x73 ^ 0x1E) + (0x5D ^ 0x63) - (0xF9 ^ 0xC6) + (0xB ^ 0x1F);
        w.lIlIIIIlIlIII[3] = "  ".length();
        w.lIlIIIIlIlIII[4] = 0x2D ^ 0x27 ^ (0x6F ^ 0xD);
        w.lIlIIIIlIlIII[5] = "   ".length();
        w.lIlIIIIlIlIII[6] = 0x39 ^ 0x3E;
        w.lIlIIIIlIlIII[7] = 44 + 99 - 96 + 80;
        w.lIlIIIIlIlIII[8] = 0x71 ^ 0x1F ^ (0xD1 ^ 0x9F);
        w.lIlIIIIlIlIII[9] = 4 ^ 8;
        w.lIlIIIIlIlIII[10] = 0x15 ^ 0x27;
    }

    public void a(Graphics2D graphics2D, String string, Color color, Point point) {
        if (w.lIllIllIllIIIII(point)) {
            graphics2D.setFont(new Font(FontManager.getRunescapeSmallFont().toString(), lIlIIIIlIlIII[1], lIlIIIIlIlIII[9]));
            Point point2 = new Point(point.getX(), point.getY());
            Point point3 = new Point(point.getX() + lIlIIIIlIlIII[0], point.getY() + lIlIIIIlIlIII[0]);
            OverlayUtil.renderTextLocation((Graphics2D)graphics2D, (Point)point3, (String)string, (Color)Color.BLACK);
            OverlayUtil.renderTextLocation((Graphics2D)graphics2D, (Point)point2, (String)string, (Color)color);
        }
    }

    private static boolean lIllIllIllIIIII(Object object) {
        return object != null;
    }

    private static boolean lIllIllIlIlllII(int n2) {
        return n2 >= 0;
    }

    protected void a(Graphics2D graphics2D, Color color, Polygon polygon, int n2) {
        if (w.lIllIllIllIIIII(polygon)) {
            graphics2D.setColor(color);
            graphics2D.setStroke(new BasicStroke(n2));
            graphics2D.draw(polygon);
        }
    }

    protected void a(Graphics2D graphics2D, Color color, Polygon polygon, int n2, int n3) {
        if (w.lIllIllIllIIIII(polygon)) {
            graphics2D.setColor(color);
            graphics2D.setStroke(new BasicStroke(n2));
            graphics2D.draw(polygon);
            graphics2D.setColor(new Color(color.getRed(), color.getGreen(), color.getBlue(), n3));
            graphics2D.fill(polygon);
        }
    }

    private static boolean lIllIllIlIllIll(int n2) {
        return n2 != 0;
    }

    @Inject
    protected w(TOAConfig tOAConfig) {
        this.aI = tOAConfig;
        this.setPosition(OverlayPosition.DYNAMIC);
        this.setLayer(OverlayLayer.ABOVE_SCENE);
    }

    private static int a(Client client, int n2, int n3, int n4) {
        int n5 = n2 >> lIlIIIIlIlIII[6];
        int n6 = n3 >> lIlIIIIlIlIII[6];
        if (w.lIllIllIlIlllII(n5) && w.lIllIllIlIlllII(n6) && w.lIllIllIlIlllIl(n5, lIlIIIIlIlIII[4]) && w.lIllIllIlIlllIl(n6, lIlIIIIlIlIII[4])) {
            int[][][] nArray = client.getTileHeights();
            int n7 = n2 & lIlIIIIlIlIII[7];
            int n8 = n3 & lIlIIIIlIlIII[7];
            int n9 = n7 * nArray[n4][n5 + lIlIIIIlIlIII[0]][n6] + (lIlIIIIlIlIII[2] - n7) * nArray[n4][n5][n6] >> lIlIIIIlIlIII[6];
            int n10 = nArray[n4][n5][n6 + lIlIIIIlIlIII[0]] * (lIlIIIIlIlIII[2] - n7) + n7 * nArray[n4][n5 + lIlIIIIlIlIII[0]][n6 + lIlIIIIlIlIII[0]] >> lIlIIIIlIlIII[6];
            return (lIlIIIIlIlIII[2] - n8) * n9 + n8 * n10 >> lIlIIIIlIlIII[6];
        }
        return lIlIIIIlIlIII[1];
    }

    protected void a(Graphics2D graphics2D, Color color, Polygon polygon) {
        this.a(graphics2D, color, polygon, lIlIIIIlIlIII[3]);
    }

    /*
     * WARNING - void declaration
     */
    public static Polygon a(Client client, LocalPoint localPoint, int n2, int n3, boolean bl) {
        void var21_21;
        void var20_20;
        void var19_19;
        void var18_18;
        void llllllllllllllIlllIIlIlIIlIIIlll;
        Client llllllllllllllIlllIIlIlIIlIIllII;
        int llllllllllllllIlllIIlIlIIlIIIIll;
        int llllllllllllllIlllIIlIlIIlIIIlII;
        int llllllllllllllIlllIIlIlIIlIIIlIl;
        int llllllllllllllIlllIIlIlIIlIIIllI;
        void llllllllllllllIlllIIlIlIIlIIlIll;
        int n4 = client.getPlane();
        if (w.lIllIllIlIllIll(bl ? 1 : 0)) {
            int n5 = localPoint.getX() - n2 * (lIlIIIIlIlIII[2] + n3) / lIlIIIIlIlIII[3];
            int n6 = localPoint.getY() - n2 * (lIlIIIIlIlIII[2] + n3) / lIlIIIIlIlIII[3];
            int n7 = localPoint.getX() + n2 * (lIlIIIIlIlIII[2] + n3) / lIlIIIIlIlIII[3];
            int n8 = localPoint.getY() + n2 * (lIlIIIIlIlIII[2] + n3) / lIlIIIIlIlIII[3];
            "".length();
            if ((0x53 ^ 0x57) < (0x74 ^ 0x70)) {
                return null;
            }
        } else {
            void llllllllllllllIlllIIlIlIIlIIlIlI;
            void llllllllllllllIlllIIlIlIIlIIlIIl;
            llllllllllllllIlllIIlIlIIlIIIllI = llllllllllllllIlllIIlIlIIlIIlIll.getX() - (lIlIIIIlIlIII[2] + llllllllllllllIlllIIlIlIIlIIlIIl) / lIlIIIIlIlIII[3];
            llllllllllllllIlllIIlIlIIlIIIlIl = llllllllllllllIlllIIlIlIIlIIlIll.getY() - (lIlIIIIlIlIII[2] + llllllllllllllIlllIIlIlIIlIIlIIl) / lIlIIIIlIlIII[3];
            llllllllllllllIlllIIlIlIIlIIIlII = llllllllllllllIlllIIlIlIIlIIlIll.getX() - (lIlIIIIlIlIII[2] + llllllllllllllIlllIIlIlIIlIIlIIl) / lIlIIIIlIlIII[3] + llllllllllllllIlllIIlIlIIlIIlIlI * (lIlIIIIlIlIII[2] + llllllllllllllIlllIIlIlIIlIIlIIl);
            llllllllllllllIlllIIlIlIIlIIIIll = llllllllllllllIlllIIlIlIIlIIlIll.getY() - (lIlIIIIlIlIII[2] + llllllllllllllIlllIIlIlIIlIIlIIl) / lIlIIIIlIlIII[3] + llllllllllllllIlllIIlIlIIlIIlIlI * (lIlIIIIlIlIII[2] + llllllllllllllIlllIIlIlIIlIIlIIl);
        }
        byte[][][] llllllllllllllIlllIIlIlIIlIIIIlI = llllllllllllllIlllIIlIlIIlIIllII.getTileSettings();
        int llllllllllllllIlllIIlIlIIlIIIIIl = llllllllllllllIlllIIlIlIIlIIlIll.getSceneX();
        int llllllllllllllIlllIIlIlIIlIIIIII = llllllllllllllIlllIIlIlIIlIIlIll.getSceneY();
        if (!w.lIllIllIlIlllII(llllllllllllllIlllIIlIlIIlIIIIIl) || !w.lIllIllIlIlllII(llllllllllllllIlllIIlIlIIlIIIIII) || !w.lIllIllIlIlllIl(llllllllllllllIlllIIlIlIIlIIIIIl, lIlIIIIlIlIII[4]) || w.lIllIllIlIllllI(llllllllllllllIlllIIlIlIIlIIIIII, lIlIIIIlIlIII[4])) {
            return null;
        }
        void llllllllllllllIlllIIlIlIIIllllll = llllllllllllllIlllIIlIlIIlIIIlll;
        if (w.lIllIllIlIlllIl((int)llllllllllllllIlllIIlIlIIlIIIlll, lIlIIIIlIlIII[5]) && w.lIllIllIlIlllll(llllllllllllllIlllIIlIlIIlIIIIlI[lIlIIIIlIlIII[0]][llllllllllllllIlllIIlIlIIlIIIIIl][llllllllllllllIlllIIlIlIIlIIIIII] & lIlIIIIlIlIII[3], lIlIIIIlIlIII[3])) {
            llllllllllllllIlllIIlIlIIIllllll = llllllllllllllIlllIIlIlIIlIIIlll + lIlIIIIlIlIII[0];
        }
        int llllllllllllllIlllIIlIlIIIlllllI = w.a(llllllllllllllIlllIIlIlIIlIIllII, llllllllllllllIlllIIlIlIIlIIIllI, llllllllllllllIlllIIlIlIIlIIIlIl, (int)llllllllllllllIlllIIlIlIIIllllll);
        int llllllllllllllIlllIIlIlIIIllllIl = w.a(llllllllllllllIlllIIlIlIIlIIllII, llllllllllllllIlllIIlIlIIlIIIlII, llllllllllllllIlllIIlIlIIlIIIlIl, (int)llllllllllllllIlllIIlIlIIIllllll);
        int llllllllllllllIlllIIlIlIIIllllII = w.a(llllllllllllllIlllIIlIlIIlIIllII, llllllllllllllIlllIIlIlIIlIIIlII, llllllllllllllIlllIIlIlIIlIIIIll, (int)llllllllllllllIlllIIlIlIIIllllll);
        int llllllllllllllIlllIIlIlIIIlllIll = w.a(llllllllllllllIlllIIlIlIIlIIllII, llllllllllllllIlllIIlIlIIlIIIllI, llllllllllllllIlllIIlIlIIlIIIIll, (int)llllllllllllllIlllIIlIlIIIllllll);
        Point llllllllllllllIlllIIlIlIIIlllIlI = Perspective.localToCanvas((Client)llllllllllllllIlllIIlIlIIlIIllII, (int)llllllllllllllIlllIIlIlIIlIIIllI, (int)llllllllllllllIlllIIlIlIIlIIIlIl, (int)llllllllllllllIlllIIlIlIIIlllllI);
        Point llllllllllllllIlllIIlIlIIIlllIIl = Perspective.localToCanvas((Client)llllllllllllllIlllIIlIlIIlIIllII, (int)llllllllllllllIlllIIlIlIIlIIIlII, (int)llllllllllllllIlllIIlIlIIlIIIlIl, (int)llllllllllllllIlllIIlIlIIIllllIl);
        Point llllllllllllllIlllIIlIlIIIlllIII = Perspective.localToCanvas((Client)llllllllllllllIlllIIlIlIIlIIllII, (int)llllllllllllllIlllIIlIlIIlIIIlII, (int)llllllllllllllIlllIIlIlIIlIIIIll, (int)llllllllllllllIlllIIlIlIIIllllII);
        Point llllllllllllllIlllIIlIlIIIllIlll = Perspective.localToCanvas((Client)llllllllllllllIlllIIlIlIIlIIllII, (int)llllllllllllllIlllIIlIlIIlIIIllI, (int)llllllllllllllIlllIIlIlIIlIIIIll, (int)llllllllllllllIlllIIlIlIIIlllIll);
        if (!w.lIllIllIllIIIII(llllllllllllllIlllIIlIlIIIlllIlI) || !w.lIllIllIllIIIII(llllllllllllllIlllIIlIlIIIlllIIl) || !w.lIllIllIllIIIII(llllllllllllllIlllIIlIlIIIlllIII) || w.lIllIllIllIIIIl(llllllllllllllIlllIIlIlIIIllIlll)) {
            return null;
        }
        Polygon polygon = new Polygon();
        polygon.addPoint(var18_18.getX(), var18_18.getY());
        polygon.addPoint(var19_19.getX(), var19_19.getY());
        polygon.addPoint(var20_20.getX(), var20_20.getY());
        polygon.addPoint(var21_21.getX(), var21_21.getY());
        return polygon;
    }

    /*
     * WARNING - void declaration
     */
    protected void a(Graphics2D graphics2D, WorldPoint worldPoint, Color color, int n2, int n3, int n4) {
        void var9_9;
        void llllllllllllllIlllIIlIlIIIIlIIll;
        w llllllllllllllIlllIIlIlIIIIlIlIl;
        WorldPoint worldPoint2 = this.M.getLocalPlayer().getWorldLocation();
        if (w.lIllIllIlIllllI(worldPoint.distanceTo(worldPoint2), lIlIIIIlIlIII[8])) {
            return;
        }
        LocalPoint llllllllllllllIlllIIlIlIIIIIllIl = LocalPoint.fromWorld((Client)llllllllllllllIlllIIlIlIIIIlIlIl.M, (WorldPoint)llllllllllllllIlllIIlIlIIIIlIIll);
        if (w.lIllIllIllIIIIl(llllllllllllllIlllIIlIlIIIIIllIl)) {
            return;
        }
        Polygon llllllllllllllIlllIIlIlIIIIIllII = Perspective.getCanvasTilePoly((Client)llllllllllllllIlllIIlIlIIIIlIlIl.M, (LocalPoint)llllllllllllllIlllIIlIlIIIIIllIl);
        if (w.lIllIllIllIIIIl(llllllllllllllIlllIIlIlIIIIIllII)) {
            return;
        }
        graphics2D.setColor(new Color(color.getRed(), color.getGreen(), color.getBlue(), n3));
        graphics2D.setStroke(new BasicStroke(n2));
        graphics2D.draw((Shape)var9_9);
        graphics2D.setColor(new Color(color.getRed(), color.getGreen(), color.getBlue(), n4));
        graphics2D.fill((Shape)var9_9);
    }

    private static boolean lIllIllIlIllllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIllIllIlIlllIl(int n2, int n3) {
        return n2 < n3;
    }

    public static Polygon a(Client client, LocalPoint localPoint, int n2, int n3) {
        return w.a(client, localPoint, n2, n3, lIlIIIIlIlIII[0]);
    }

    private static boolean lIllIllIllIIIIl(Object object) {
        return object == null;
    }

    private static boolean lIllIllIlIlllll(int n2, int n3) {
        return n2 == n3;
    }
}

