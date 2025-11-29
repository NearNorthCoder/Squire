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
package gg.squire.toa.tasks;

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

public abstract class ToaTaskBase
extends Overlay {
    @Inject
    protected  Client M;
    protected final  TOAConfig aI;

    /*
     * WARNING - void declaration
     */
    protected void a(Graphics2D graphics2D, Color color, LocalPoint localPoint) {
        void var4_4;
        void var2;
        w var3;
        if (w.var4(localPoint)) {
            return;
        }
        Polygon var5 = Perspective.getCanvasTilePoly((Client)var3.M, (LocalPoint)var2);
        if (w.var4(var5)) {
            return;
        }
        this.a(graphics2D, color, (Polygon)var4_4, var1[0], var1[10]);
    }

    static {
        w.var6();
    }

    public static Polygon a(Client client, LocalPoint localPoint, int n2, boolean bl) {
        return w.a(client, localPoint, n2, var1[1], bl);
    }

    private static void var6() {
        var1 = new int[11];
        w.var1[0] = 1;
        w.var1[1] = (162 + 45 - 47 + 45 ^ 34 + 42 - 10 + 68) & (0x92 ^ 0x99 ^ (0xFF ^ 0xBF) ^ -1);
        w.var1[2] = (0x73 ^ 0x1E) + (0x5D ^ 0x63) - (0xF9 ^ 0xC6) + (0xB ^ 0x1F);
        w.var1[3] = 2;
        w.var1[4] = 0x2D ^ 0x27 ^ (0x6F ^ 0xD);
        w.var1[5] = 3;
        w.var1[6] = 0x39 ^ 0x3E;
        w.var1[7] = 44 + 99 - 96 + 80;
        w.var1[8] = 0x71 ^ 0x1F ^ (0xD1 ^ 0x9F);
        w.var1[9] = 4 ^ 8;
        w.var1[10] = 0x15 ^ 0x27;
    }

    public void a(Graphics2D graphics2D, String string, Color color, Point point) {
        if (w.var7(point)) {
            graphics2D.setFont(new Font(FontManager.getRunescapeSmallFont().toString(), var1[1], var1[9]));
            Point point2 = new Point(point.getX(), point.getY());
            Point point3 = new Point(point.getX() + var1[0], point.getY() + var1[0]);
            OverlayUtil.renderTextLocation((Graphics2D)graphics2D, (Point)point3, (String)string, (Color)Color.BLACK);
            OverlayUtil.renderTextLocation((Graphics2D)graphics2D, (Point)point2, (String)string, (Color)color);
        }
    }

    private static boolean var7(Object object) {
        return object != null;
    }

    private static boolean var8(int n2) {
        return n2 >= 0;
    }

    protected void a(Graphics2D graphics2D, Color color, Polygon polygon, int n2) {
        if (w.var7(polygon)) {
            graphics2D.setColor(color);
            graphics2D.setStroke(new BasicStroke(n2));
            graphics2D.draw(polygon);
        }
    }

    protected void a(Graphics2D graphics2D, Color color, Polygon polygon, int n2, int n3) {
        if (w.var7(polygon)) {
            graphics2D.setColor(color);
            graphics2D.setStroke(new BasicStroke(n2));
            graphics2D.draw(polygon);
            graphics2D.setColor(new Color(color.getRed(), color.getGreen(), color.getBlue(), n3));
            graphics2D.fill(polygon);
        }
    }

    private static boolean var9(int n2) {
        return n2 != 0;
    }

    @Inject
    protected ToaTaskBase(TOAConfig tOAConfig) {
        this.aI = tOAConfig;
        this.setPosition(OverlayPosition.DYNAMIC);
        this.setLayer(OverlayLayer.ABOVE_SCENE);
    }

    private static int a(Client client, int n2, int n3, int n4) {
        int n5 = n2 >> var1[6];
        int n6 = n3 >> var1[6];
        if (w.var8(n5) && w.var8(n6) && w.var10(n5, var1[4]) && w.var10(n6, var1[4])) {
            int[][][] nArray = client.getTileHeights();
            int n7 = n2 & var1[7];
            int n8 = n3 & var1[7];
            int n9 = n7 * nArray[n4][n5 + var1[0]][n6] + (var1[2] - n7) * nArray[n4][n5][n6] >> var1[6];
            int n10 = nArray[n4][n5][n6 + var1[0]] * (var1[2] - n7) + n7 * nArray[n4][n5 + var1[0]][n6 + var1[0]] >> var1[6];
            return (var1[2] - n8) * n9 + n8 * n10 >> var1[6];
        }
        return var1[1];
    }

    protected void a(Graphics2D graphics2D, Color color, Polygon polygon) {
        this.a(graphics2D, color, polygon, var1[3]);
    }

    /*
     * WARNING - void declaration
     */
    public static Polygon a(Client client, LocalPoint localPoint, int n2, int n3, boolean bl) {
        void var21_21;
        void var20_20;
        void var19_19;
        void var18_18;
        void var11;
        Client var12;
        int var13;
        int var14;
        int var15;
        int var16;
        void var17;
        int n4 = client.getPlane();
        if (w.var9(bl)) {
            int n5 = localPoint.getX() - n2 * (var1[2] + n3) / var1[3];
            int n6 = localPoint.getY() - n2 * (var1[2] + n3) / var1[3];
            int n7 = localPoint.getX() + n2 * (var1[2] + n3) / var1[3];
            int n8 = localPoint.getY() + n2 * (var1[2] + n3) / var1[3];
            0;
            if ((0x53 ^ 0x57) < (0x74 ^ 0x70)) {
                return null;
            }
        } else {
            void var18;
            void var19;
            var16 = var17.getX() - (var1[2] + var19) / var1[3];
            var15 = var17.getY() - (var1[2] + var19) / var1[3];
            var14 = var17.getX() - (var1[2] + var19) / var1[3] + var18 * (var1[2] + var19);
            var13 = var17.getY() - (var1[2] + var19) / var1[3] + var18 * (var1[2] + var19);
        }
        byte[][][] var20 = var12.getTileSettings();
        int var21 = var17.getSceneX();
        int var22 = var17.getSceneY();
        if (!w.var8(var21) || !w.var8(var22) || !w.var10(var21, var1[4]) || w.var23(var22, var1[4])) {
            return null;
        }
        void var24 = var11;
        if (w.var10((int)var11, var1[5]) && w.var25(var20[var1[0]][var21][var22] & var1[3], var1[3])) {
            var24 = var11 + var1[0];
        }
        int var26 = w.a(var12, var16, var15, (int)var24);
        int var27 = w.a(var12, var14, var15, (int)var24);
        int var28 = w.a(var12, var14, var13, (int)var24);
        int var29 = w.a(var12, var16, var13, (int)var24);
        Point var30 = Perspective.localToCanvas((Client)var12, (int)var16, (int)var15, (int)var26);
        Point var31 = Perspective.localToCanvas((Client)var12, (int)var14, (int)var15, (int)var27);
        Point var32 = Perspective.localToCanvas((Client)var12, (int)var14, (int)var13, (int)var28);
        Point var33 = Perspective.localToCanvas((Client)var12, (int)var16, (int)var13, (int)var29);
        if (!w.var7(var30) || !w.var7(var31) || !w.var7(var32) || w.var4(var33)) {
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
        void var34;
        w var35;
        WorldPoint worldPoint2 = this.M.getLocalPlayer().getWorldLocation();
        if (w.var23(worldPoint.distanceTo(worldPoint2), var1[8])) {
            return;
        }
        LocalPoint var36 = LocalPoint.fromWorld((Client)var35.M, (WorldPoint)var34);
        if (w.var4(var36)) {
            return;
        }
        Polygon var37 = Perspective.getCanvasTilePoly((Client)var35.M, (LocalPoint)var36);
        if (w.var4(var37)) {
            return;
        }
        graphics2D.setColor(new Color(color.getRed(), color.getGreen(), color.getBlue(), n3));
        graphics2D.setStroke(new BasicStroke(n2));
        graphics2D.draw((Shape)var9_9);
        graphics2D.setColor(new Color(color.getRed(), color.getGreen(), color.getBlue(), n4));
        graphics2D.fill((Shape)var9_9);
    }

    private static boolean var23(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean var10(int n2, int n3) {
        return n2 < n3;
    }

    public static Polygon a(Client client, LocalPoint localPoint, int n2, int n3) {
        return w.a(client, localPoint, n2, n3, var1[0]);
    }

    private static boolean var4(Object object) {
        return object == null;
    }

    private static boolean var25(int n2, int n3) {
        return n2 == n3;
    }
}

