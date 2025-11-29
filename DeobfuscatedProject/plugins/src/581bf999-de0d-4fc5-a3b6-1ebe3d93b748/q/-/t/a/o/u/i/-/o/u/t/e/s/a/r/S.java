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
 *  net.runelite.client.ui.overlay.OverlayPriority
 *  net.runelite.client.ui.overlay.OverlayUtil
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
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
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.OverlayUtil;

public abstract class S
extends Overlay {
    @Inject
    protected /* synthetic */ Client ai;
    protected final /* synthetic */ TOAConfig bV;
    private static /* synthetic */ int[] llIlIlIIIII;

    private static boolean lIlIIllIIlIIll(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    protected void a(Graphics2D graphics2D, WorldPoint worldPoint, Color color, int n2, int n3, int n4) {
        void var9_9;
        void llllllllllllllllIIllIlIIlIllIIll;
        S llllllllllllllllIIllIlIIlIllIlIl;
        WorldPoint worldPoint2 = this.ai.getLocalPlayer().getWorldLocation();
        if (S.lIlIIllIIlIlII(worldPoint.distanceTo(worldPoint2), llIlIlIIIII[8])) {
            return;
        }
        LocalPoint llllllllllllllllIIllIlIIlIlIllIl = LocalPoint.fromWorld((Client)llllllllllllllllIIllIlIIlIllIlIl.ai, (WorldPoint)llllllllllllllllIIllIlIIlIllIIll);
        if (S.lIlIIllIIlIlll(llllllllllllllllIIllIlIIlIlIllIl)) {
            return;
        }
        Polygon llllllllllllllllIIllIlIIlIlIllII = Perspective.getCanvasTilePoly((Client)llllllllllllllllIIllIlIIlIllIlIl.ai, (LocalPoint)llllllllllllllllIIllIlIIlIlIllIl);
        if (S.lIlIIllIIlIlll(llllllllllllllllIIllIlIIlIlIllII)) {
            return;
        }
        graphics2D.setColor(new Color(color.getRed(), color.getGreen(), color.getBlue(), n3));
        graphics2D.setStroke(new BasicStroke(n2));
        graphics2D.draw((Shape)var9_9);
        graphics2D.setColor(new Color(color.getRed(), color.getGreen(), color.getBlue(), n4));
        graphics2D.fill((Shape)var9_9);
    }

    public static Polygon a(Client client, LocalPoint localPoint, int n2, boolean bl2) {
        return S.a(client, localPoint, n2, llIlIlIIIII[1], bl2);
    }

    public void a(Graphics2D graphics2D, String string, Color color, Point point) {
        if (S.lIlIIllIIlIllI(point)) {
            graphics2D.setFont(new Font(FontManager.getRunescapeSmallFont().toString(), llIlIlIIIII[1], llIlIlIIIII[9]));
            Point point2 = new Point(point.getX(), point.getY());
            Point point3 = new Point(point.getX() + llIlIlIIIII[0], point.getY() + llIlIlIIIII[0]);
            OverlayUtil.renderTextLocation((Graphics2D)graphics2D, (Point)point3, (String)string, (Color)Color.BLACK);
            OverlayUtil.renderTextLocation((Graphics2D)graphics2D, (Point)point2, (String)string, (Color)color);
        }
    }

    /*
     * WARNING - void declaration
     */
    public static Polygon a(Client client, LocalPoint localPoint, int n2, int n3, boolean bl2) {
        void var21_21;
        void var20_20;
        void var19_19;
        void var18_18;
        void llllllllllllllllIIllIlIIlllIIlll;
        Client llllllllllllllllIIllIlIIlllIllII;
        int llllllllllllllllIIllIlIIlllIIIll;
        int llllllllllllllllIIllIlIIlllIIlII;
        int llllllllllllllllIIllIlIIlllIIlIl;
        int llllllllllllllllIIllIlIIlllIIllI;
        void llllllllllllllllIIllIlIIlllIlIll;
        int n4 = client.getPlane();
        if (S.lIlIIllIIlIIIl(bl2 ? 1 : 0)) {
            int n5 = localPoint.getX() - n2 * (llIlIlIIIII[2] + n3) / llIlIlIIIII[3];
            int n6 = localPoint.getY() - n2 * (llIlIlIIIII[2] + n3) / llIlIlIIIII[3];
            int n7 = localPoint.getX() + n2 * (llIlIlIIIII[2] + n3) / llIlIlIIIII[3];
            int n8 = localPoint.getY() + n2 * (llIlIlIIIII[2] + n3) / llIlIlIIIII[3];
            "".length();
            if (((0xE4 ^ 0xA3 ^ (0x41 ^ 9)) & (73 + 1 - 71 + 133 ^ 89 + 11 - 3 + 38 ^ -" ".length())) != 0) {
                return null;
            }
        } else {
            void llllllllllllllllIIllIlIIlllIlIlI;
            void llllllllllllllllIIllIlIIlllIlIIl;
            llllllllllllllllIIllIlIIlllIIllI = llllllllllllllllIIllIlIIlllIlIll.getX() - (llIlIlIIIII[2] + llllllllllllllllIIllIlIIlllIlIIl) / llIlIlIIIII[3];
            llllllllllllllllIIllIlIIlllIIlIl = llllllllllllllllIIllIlIIlllIlIll.getY() - (llIlIlIIIII[2] + llllllllllllllllIIllIlIIlllIlIIl) / llIlIlIIIII[3];
            llllllllllllllllIIllIlIIlllIIlII = llllllllllllllllIIllIlIIlllIlIll.getX() - (llIlIlIIIII[2] + llllllllllllllllIIllIlIIlllIlIIl) / llIlIlIIIII[3] + llllllllllllllllIIllIlIIlllIlIlI * (llIlIlIIIII[2] + llllllllllllllllIIllIlIIlllIlIIl);
            llllllllllllllllIIllIlIIlllIIIll = llllllllllllllllIIllIlIIlllIlIll.getY() - (llIlIlIIIII[2] + llllllllllllllllIIllIlIIlllIlIIl) / llIlIlIIIII[3] + llllllllllllllllIIllIlIIlllIlIlI * (llIlIlIIIII[2] + llllllllllllllllIIllIlIIlllIlIIl);
        }
        byte[][][] llllllllllllllllIIllIlIIlllIIIlI = llllllllllllllllIIllIlIIlllIllII.getTileSettings();
        int llllllllllllllllIIllIlIIlllIIIIl = llllllllllllllllIIllIlIIlllIlIll.getSceneX();
        int llllllllllllllllIIllIlIIlllIIIII = llllllllllllllllIIllIlIIlllIlIll.getSceneY();
        if (!S.lIlIIllIIlIIlI(llllllllllllllllIIllIlIIlllIIIIl) || !S.lIlIIllIIlIIlI(llllllllllllllllIIllIlIIlllIIIII) || !S.lIlIIllIIlIIll(llllllllllllllllIIllIlIIlllIIIIl, llIlIlIIIII[4]) || S.lIlIIllIIlIlII(llllllllllllllllIIllIlIIlllIIIII, llIlIlIIIII[4])) {
            return null;
        }
        void llllllllllllllllIIllIlIIllIlllll = llllllllllllllllIIllIlIIlllIIlll;
        if (S.lIlIIllIIlIIll((int)llllllllllllllllIIllIlIIlllIIlll, llIlIlIIIII[5]) && S.lIlIIllIIlIlIl(llllllllllllllllIIllIlIIlllIIIlI[llIlIlIIIII[0]][llllllllllllllllIIllIlIIlllIIIIl][llllllllllllllllIIllIlIIlllIIIII] & llIlIlIIIII[3], llIlIlIIIII[3])) {
            llllllllllllllllIIllIlIIllIlllll = llllllllllllllllIIllIlIIlllIIlll + llIlIlIIIII[0];
        }
        int llllllllllllllllIIllIlIIllIllllI = S.a(llllllllllllllllIIllIlIIlllIllII, llllllllllllllllIIllIlIIlllIIllI, llllllllllllllllIIllIlIIlllIIlIl, (int)llllllllllllllllIIllIlIIllIlllll);
        int llllllllllllllllIIllIlIIllIlllIl = S.a(llllllllllllllllIIllIlIIlllIllII, llllllllllllllllIIllIlIIlllIIlII, llllllllllllllllIIllIlIIlllIIlIl, (int)llllllllllllllllIIllIlIIllIlllll);
        int llllllllllllllllIIllIlIIllIlllII = S.a(llllllllllllllllIIllIlIIlllIllII, llllllllllllllllIIllIlIIlllIIlII, llllllllllllllllIIllIlIIlllIIIll, (int)llllllllllllllllIIllIlIIllIlllll);
        int llllllllllllllllIIllIlIIllIllIll = S.a(llllllllllllllllIIllIlIIlllIllII, llllllllllllllllIIllIlIIlllIIllI, llllllllllllllllIIllIlIIlllIIIll, (int)llllllllllllllllIIllIlIIllIlllll);
        Point llllllllllllllllIIllIlIIllIllIlI = Perspective.localToCanvas((Client)llllllllllllllllIIllIlIIlllIllII, (int)llllllllllllllllIIllIlIIlllIIllI, (int)llllllllllllllllIIllIlIIlllIIlIl, (int)llllllllllllllllIIllIlIIllIllllI);
        Point llllllllllllllllIIllIlIIllIllIIl = Perspective.localToCanvas((Client)llllllllllllllllIIllIlIIlllIllII, (int)llllllllllllllllIIllIlIIlllIIlII, (int)llllllllllllllllIIllIlIIlllIIlIl, (int)llllllllllllllllIIllIlIIllIlllIl);
        Point llllllllllllllllIIllIlIIllIllIII = Perspective.localToCanvas((Client)llllllllllllllllIIllIlIIlllIllII, (int)llllllllllllllllIIllIlIIlllIIlII, (int)llllllllllllllllIIllIlIIlllIIIll, (int)llllllllllllllllIIllIlIIllIlllII);
        Point llllllllllllllllIIllIlIIllIlIlll = Perspective.localToCanvas((Client)llllllllllllllllIIllIlIIlllIllII, (int)llllllllllllllllIIllIlIIlllIIllI, (int)llllllllllllllllIIllIlIIlllIIIll, (int)llllllllllllllllIIllIlIIllIllIll);
        if (!S.lIlIIllIIlIllI(llllllllllllllllIIllIlIIllIllIlI) || !S.lIlIIllIIlIllI(llllllllllllllllIIllIlIIllIllIIl) || !S.lIlIIllIIlIllI(llllllllllllllllIIllIlIIllIllIII) || S.lIlIIllIIlIlll(llllllllllllllllIIllIlIIllIlIlll)) {
            return null;
        }
        Polygon polygon = new Polygon();
        polygon.addPoint(var18_18.getX(), var18_18.getY());
        polygon.addPoint(var19_19.getX(), var19_19.getY());
        polygon.addPoint(var20_20.getX(), var20_20.getY());
        polygon.addPoint(var21_21.getX(), var21_21.getY());
        return polygon;
    }

    static {
        S.lIlIIllIIlIIII();
    }

    protected void a(Graphics2D graphics2D, Color color, Polygon polygon, int n2, int n3) {
        if (S.lIlIIllIIlIllI(polygon)) {
            graphics2D.setColor(color);
            graphics2D.setStroke(new BasicStroke(n2));
            graphics2D.draw(polygon);
            graphics2D.setColor(new Color(color.getRed(), color.getGreen(), color.getBlue(), n3));
            graphics2D.fill(polygon);
        }
    }

    private static int a(Client client, int n2, int n3, int n4) {
        int n5 = n2 >> llIlIlIIIII[6];
        int n6 = n3 >> llIlIlIIIII[6];
        if (S.lIlIIllIIlIIlI(n5) && S.lIlIIllIIlIIlI(n6) && S.lIlIIllIIlIIll(n5, llIlIlIIIII[4]) && S.lIlIIllIIlIIll(n6, llIlIlIIIII[4])) {
            int[][][] nArray = client.getTileHeights();
            int n7 = n2 & llIlIlIIIII[7];
            int n8 = n3 & llIlIlIIIII[7];
            int n9 = n7 * nArray[n4][n5 + llIlIlIIIII[0]][n6] + (llIlIlIIIII[2] - n7) * nArray[n4][n5][n6] >> llIlIlIIIII[6];
            int n10 = nArray[n4][n5][n6 + llIlIlIIIII[0]] * (llIlIlIIIII[2] - n7) + n7 * nArray[n4][n5 + llIlIlIIIII[0]][n6 + llIlIlIIIII[0]] >> llIlIlIIIII[6];
            return (llIlIlIIIII[2] - n8) * n9 + n8 * n10 >> llIlIlIIIII[6];
        }
        return llIlIlIIIII[1];
    }

    @Inject
    protected S(TOAConfig tOAConfig) {
        this.bV = tOAConfig;
        this.setPosition(OverlayPosition.DYNAMIC);
        this.setPriority(OverlayPriority.HIGH);
        this.setLayer(OverlayLayer.ABOVE_SCENE);
    }

    private static boolean lIlIIllIIlIlll(Object object) {
        return object == null;
    }

    protected void a(Graphics2D graphics2D, Color color, Polygon polygon) {
        this.a(graphics2D, color, polygon, llIlIlIIIII[3]);
    }

    private static boolean lIlIIllIIlIlIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIIllIIlIIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIllIIlIlII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIIllIIlIIlI(int n2) {
        return n2 >= 0;
    }

    public static Polygon a(Client client, LocalPoint localPoint, int n2, int n3) {
        return S.a(client, localPoint, n2, n3, llIlIlIIIII[0]);
    }

    protected void a(Graphics2D graphics2D, Color color, Polygon polygon, int n2) {
        if (S.lIlIIllIIlIllI(polygon)) {
            graphics2D.setColor(color);
            graphics2D.setStroke(new BasicStroke(n2));
            graphics2D.draw(polygon);
        }
    }

    /*
     * WARNING - void declaration
     */
    protected void a(Graphics2D graphics2D, Color color, LocalPoint localPoint) {
        void var4_4;
        void llllllllllllllllIIllIlIIlIIIIlIl;
        S llllllllllllllllIIllIlIIlIIIlIII;
        if (S.lIlIIllIIlIlll(localPoint)) {
            return;
        }
        Polygon llllllllllllllllIIllIlIIlIIIIlII = Perspective.getCanvasTilePoly((Client)llllllllllllllllIIllIlIIlIIIlIII.ai, (LocalPoint)llllllllllllllllIIllIlIIlIIIIlIl);
        if (S.lIlIIllIIlIlll(llllllllllllllllIIllIlIIlIIIIlII)) {
            return;
        }
        this.a(graphics2D, color, (Polygon)var4_4, llIlIlIIIII[0], llIlIlIIIII[10]);
    }

    private static void lIlIIllIIlIIII() {
        llIlIlIIIII = new int[11];
        S.llIlIlIIIII[0] = " ".length();
        S.llIlIlIIIII[1] = (0x6B ^ 0x74) & ~(0x29 ^ 0x36);
        S.llIlIlIIIII[2] = (0x6D ^ 0x19) + (0x44 ^ 0x24) - (14 + 4 - -1 + 109) + (0xA6 ^ 0x8A);
        S.llIlIlIIIII[3] = "  ".length();
        S.llIlIlIIIII[4] = 7 + 26 - -115 + 105 ^ 79 + 138 - 68 + 0;
        S.llIlIlIIIII[5] = "   ".length();
        S.llIlIlIIIII[6] = 0x88 ^ 0x8F;
        S.llIlIlIIIII[7] = " ".length() + (0x65 ^ 0x5D) - (0xEF ^ 0xC3) + (0xEA ^ 0x98);
        S.llIlIlIIIII[8] = 0xB0 ^ 0x90;
        S.llIlIlIIIII[9] = 0x43 ^ 0x4F;
        S.llIlIlIIIII[10] = 72 + 145 - 76 + 102 ^ 183 + 39 - 161 + 132;
    }

    private static boolean lIlIIllIIlIllI(Object object) {
        return object != null;
    }
}

