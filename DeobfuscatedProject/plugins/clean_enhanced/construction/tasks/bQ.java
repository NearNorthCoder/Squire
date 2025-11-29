/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Perspective
 *  net.runelite.api.Point
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayLayer
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.OverlayPriority
 *  net.runelite.client.ui.overlay.OverlayUtil
 */
package gg.squire.construction.tasks;

import gg.squire.basics.secondaries.SecondariesPlugin;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;
import java.awt.Stroke;
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

public class bQ
extends Overlay {
    private final  Client gO;
    private static  String[] llIlIIlI;
    private static  int[] llIlIIll;
    private final  SecondariesPlugin gP;

    /*
     * WARNING - void declaration
     */
    public Dimension render(Graphics2D graphics2D) {
        LocalPoint var1;
        bQ var2;
        if (bQ.var3(this.gP.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        WorldPoint var4 = var2.gP.cT();
        if (bQ.var5(var4) && bQ.var5(var1 = LocalPoint.fromWorld((Client)var2.gO, (WorldPoint)var4))) {
            void var6;
            String string;
            Color color;
            Color var7 = ColorScheme.BRAND_YELLOW_TRANSPARENT;
            Color var8 = new Color(var7.getRed(), var7.getGreen(), var7.getBlue(), llIlIIll[0]);
            if (bQ.var3(var2.gP.cU() ? 1 : 0)) {
                color = Color.RED;
                0;
                
            } else {
                color = var7;
            }
            if (bQ.var3(var2.gP.cU() ? 1 : 0)) {
                string = llIlIIlI[llIlIIll[1]];
                0;
                
            } else {
                string = llIlIIlI[llIlIIll[2]];
            }
            var2.a((Graphics2D)var6, var1, color, 1.0, var8, string);
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private void a(Graphics2D graphics2D, LocalPoint localPoint, Color color, double d2, Color color2, String string) {
        void var9;
        void var10;
        void var11;
        void var12;
        void var13;
        void var14;
        bQ var15;
        if (bQ.var16(localPoint)) {
            return;
        }
        Polygon var17 = Perspective.getCanvasTilePoly((Client)var15.gO, (LocalPoint)var14);
        if (bQ.var16(var17)) {
            return;
        }
        OverlayUtil.renderPolygon((Graphics2D)var13, (Shape)var17, (Color)var12, (Color)var11, (Stroke)new BasicStroke((float)var10));
        if (!bQ.var5(var9) || bQ.var3(var9.isEmpty() ? 1 : 0)) {
            return;
        }
        Point var18 = Perspective.getCanvasTextLocation((Client)var15.gO, (Graphics2D)var13, (LocalPoint)var14, (String)var9, (int)llIlIIll[1]);
        if (bQ.var5(var18)) {
            OverlayUtil.renderTextLocation((Graphics2D)var13, (Point)var18, (String)var9, (Color)var12);
        }
    }

    private static void var19() {
        llIlIIll = new int[4];
        bQ.llIlIIll[0] = 0xB7 ^ 0xA3;
        bQ.llIlIIll[1] = (0x3D ^ 0x23) & ~(0x8C ^ 0x92);
        bQ.llIlIIll[2] = 1;
        bQ.llIlIIll[3] = 2;
    }

    @Inject
    private bQ(Client client, SecondariesPlugin secondariesPlugin) {
        this.gO = client;
        this.gP = secondariesPlugin;
        this.setPosition(OverlayPosition.DYNAMIC);
        this.setLayer(OverlayLayer.ABOVE_SCENE);
        this.setPriority(OverlayPriority.MED);
    }

    static {
        bQ.var19();
        bQ.var20();
    }

    private static boolean var3(int n2) {
        return n2 != 0;
    }

    private static void var20() {
        llIlIIlI = new String[llIlIIll[3]];
        bQ.llIlIIlI[bQ.llIlIIll[1]] = "FULL INVENTORY";
        bQ.llIlIIlI[bQ.llIlIIll[2]] = bQ.var21("", "Hfprf");
    }

    private static boolean var22(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var16(Object object) {
        return object == null;
    }

    private static boolean var5(Object object) {
        return object != null;
    }

    private static String var21(String var23, String var24) {
        var23 = new String(Base64.getDecoder().decode(var23.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var25 = new StringBuilder();
        char[] var26 = var24.toCharArray();
        int var27 = llIlIIll[1];
        char[] var28 = var23.toCharArray();
        int var29 = var28.length;
        int var30 = llIlIIll[1];
        while (bQ.var22(var30, var29)) {
            char var31 = var28[var30];
            var25.append((char)(var31 ^ var26[var27 % var26.length]));
            0;
            ++var27;
            ++var30;
            0;
            if (-1 <= 1) continue;
            return null;
        }
        return String.valueOf(var25);
    }
}

