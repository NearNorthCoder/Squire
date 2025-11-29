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
package gg.squire.autotoa.tasks;

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

public abstract class AutotoaTaskBase
extends Overlay {
    @Inject
    protected  Client ai;
    protected final  TOAConfig bV;

    private static boolean var2(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    protected void a(Graphics2D graphics2D, WorldPoint worldPoint, Color color, int n2, int n3, int n4) {
        void var9_9;
        void var3;
        S var4;
        WorldPoint worldPoint2 = this.ai.getLocalPlayer().getWorldLocation();
        if (S.var5(worldPoint.distanceTo(worldPoint2), var1[8])) {
            return;
        }
        LocalPoint var6 = LocalPoint.fromWorld((Client)var4.ai, (WorldPoint)var3);
        if (S.var7(var6)) {
            return;
        }
        Polygon var8 = Perspective.getCanvasTilePoly((Client)var4.ai, (LocalPoint)var6);
        if (S.var7(var8)) {
            return;
        }
        graphics2D.setColor(new Color(color.getRed(), color.getGreen(), color.getBlue(), n3));
        graphics2D.setStroke(new BasicStroke(n2));
        graphics2D.draw((Shape)var9_9);
        graphics2D.setColor(new Color(color.getRed(), color.getGreen(), color.getBlue(), n4));
        graphics2D.fill((Shape)var9_9);
    }

    public static Polygon a(Client client, LocalPoint localPoint, int n2, boolean bl2) {
        return S.a(client, localPoint, n2, var1[1], bl2);
    }

    public void a(Graphics2D graphics2D, String string, Color color, Point point) {
        if (S.var9(point)) {
            graphics2D.setFont(new Font(FontManager.getRunescapeSmallFont().toString(), var1[1], var1[9]));
            Point point2 = new Point(point.getX(), point.getY());
            Point point3 = new Point(point.getX() + var1[0], point.getY() + var1[0]);
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
        void var10;
        Client var11;
        int var12;
        int var13;
        int var14;
        int var15;
        void var16;
        int n4 = client.getPlane();
        if (S.var17(bl2)) {
            int n5 = localPoint.getX() - n2 * (var1[2] + n3) / var1[3];
            int n6 = localPoint.getY() - n2 * (var1[2] + n3) / var1[3];
            int n7 = localPoint.getX() + n2 * (var1[2] + n3) / var1[3];
            int n8 = localPoint.getY() + n2 * (var1[2] + n3) / var1[3];
            0;
            if (((0xE4 ^ 0xA3 ^ (0x41 ^ 9)) & (73 + 1 - 71 + 133 ^ 89 + 11 - 3 + 38 ^ -1)) != 0) {
                return null;
            }
        } else {
            void var18;
            void var19;
            var15 = var16.getX() - (var1[2] + var19) / var1[3];
            var14 = var16.getY() - (var1[2] + var19) / var1[3];
            var13 = var16.getX() - (var1[2] + var19) / var1[3] + var18 * (var1[2] + var19);
            var12 = var16.getY() - (var1[2] + var19) / var1[3] + var18 * (var1[2] + var19);
        }
        byte[][][] var20 = var11.getTileSettings();
        int var21 = var16.getSceneX();
        int var22 = var16.getSceneY();
        if (!S.var23(var21) || !S.var23(var22) || !S.var2(var21, var1[4]) || S.var5(var22, var1[4])) {
            return null;
        }
        void var24 = var10;
        if (S.var2((int)var10, var1[5]) && S.var25(var20[var1[0]][var21][var22] & var1[3], var1[3])) {
            var24 = var10 + var1[0];
        }
        int var26 = S.a(var11, var15, var14, (int)var24);
        int var27 = S.a(var11, var13, var14, (int)var24);
        int var28 = S.a(var11, var13, var12, (int)var24);
        int var29 = S.a(var11, var15, var12, (int)var24);
        Point var30 = Perspective.localToCanvas((Client)var11, (int)var15, (int)var14, (int)var26);
        Point var31 = Perspective.localToCanvas((Client)var11, (int)var13, (int)var14, (int)var27);
        Point var32 = Perspective.localToCanvas((Client)var11, (int)var13, (int)var12, (int)var28);
        Point var33 = Perspective.localToCanvas((Client)var11, (int)var15, (int)var12, (int)var29);
        if (!S.var9(var30) || !S.var9(var31) || !S.var9(var32) || S.var7(var33)) {
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
        S.var34();
    }

    protected void a(Graphics2D graphics2D, Color color, Polygon polygon, int n2, int n3) {
        if (S.var9(polygon)) {
            graphics2D.setColor(color);
            graphics2D.setStroke(new BasicStroke(n2));
            graphics2D.draw(polygon);
            graphics2D.setColor(new Color(color.getRed(), color.getGreen(), color.getBlue(), n3));
            graphics2D.fill(polygon);
        }
    }

    private static int a(Client client, int n2, int n3, int n4) {
        int n5 = n2 >> var1[6];
        int n6 = n3 >> var1[6];
        if (S.var23(n5) && S.var23(n6) && S.var2(n5, var1[4]) && S.var2(n6, var1[4])) {
            int[][][] nArray = client.getTileHeights();
            int n7 = n2 & var1[7];
            int n8 = n3 & var1[7];
            int n9 = n7 * nArray[n4][n5 + var1[0]][n6] + (var1[2] - n7) * nArray[n4][n5][n6] >> var1[6];
            int n10 = nArray[n4][n5][n6 + var1[0]] * (var1[2] - n7) + n7 * nArray[n4][n5 + var1[0]][n6 + var1[0]] >> var1[6];
            return (var1[2] - n8) * n9 + n8 * n10 >> var1[6];
        }
        return var1[1];
    }

    @Inject
    protected AutotoaTaskBase(TOAConfig tOAConfig) {
        this.bV = tOAConfig;
        this.setPosition(OverlayPosition.DYNAMIC);
        this.setPriority(OverlayPriority.HIGH);
        this.setLayer(OverlayLayer.ABOVE_SCENE);
    }

    private static boolean var7(Object object) {
        return object == null;
    }

    protected void a(Graphics2D graphics2D, Color color, Polygon polygon) {
        this.a(graphics2D, color, polygon, var1[3]);
    }

    private static boolean var25(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var17(int n2) {
        return n2 != 0;
    }

    private static boolean var5(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean var23(int n2) {
        return n2 >= 0;
    }

    public static Polygon a(Client client, LocalPoint localPoint, int n2, int n3) {
        return S.a(client, localPoint, n2, n3, var1[0]);
    }

    protected void a(Graphics2D graphics2D, Color color, Polygon polygon, int n2) {
        if (S.var9(polygon)) {
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
        void var35;
        S var36;
        if (S.var7(localPoint)) {
            return;
        }
        Polygon var37 = Perspective.getCanvasTilePoly((Client)var36.ai, (LocalPoint)var35);
        if (S.var7(var37)) {
            return;
        }
        this.a(graphics2D, color, (Polygon)var4_4, var1[0], var1[10]);
    }

    private static void var34() {
        var1 = new int[11];
        S.var1[0] = 1;
        S.var1[1] = (0x6B ^ 0x74) & ~(0x29 ^ 0x36);
        S.var1[2] = (0x6D ^ 0x19) + (0x44 ^ 0x24) - (14 + 4 - -1 + 109) + (0xA6 ^ 0x8A);
        S.var1[3] = 2;
        S.var1[4] = 7 + 26 - -115 + 105 ^ 79 + 138 - 68 + 0;
        S.var1[5] = 3;
        S.var1[6] = 0x88 ^ 0x8F;
        S.var1[7] = 1 + (0x65 ^ 0x5D) - (0xEF ^ 0xC3) + (0xEA ^ 0x98);
        S.var1[8] = 0xB0 ^ 0x90;
        S.var1[9] = 0x43 ^ 0x4F;
        S.var1[10] = 72 + 145 - 76 + 102 ^ 183 + 39 - 161 + 132;
    }

    private static boolean var9(Object object) {
        return object != null;
    }
}

