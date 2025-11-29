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
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayLayer
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.OverlayPriority
 *  net.runelite.client.ui.overlay.OverlayUtil
 */
package gg.squire.toa.tasks;

import gg.squire.toa.tasks.ToaManager;
import gg.squire.toa.tasks.GameEnum3;
import gg.squire.toa.TOAConfig;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;
import java.awt.Stroke;
import java.util.HashSet;
import java.util.Iterator;
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

public class QHelper
extends Overlay {
    
    private static final  Color[] as;
    private final  h au;
    private final  Client at;
    private final  TOAConfig av;

    private static boolean var2(int n2) {
        return n2 == 0;
    }

    private static boolean var3(Object object) {
        return object == null;
    }

    @Inject
    protected QHelper(Client client, h h2, TOAConfig tOAConfig) {
        this.at = client;
        this.au = h2;
        this.av = tOAConfig;
        this.setPriority(OverlayPriority.HIGH);
        this.setPosition(OverlayPosition.DYNAMIC);
        this.setLayer(OverlayLayer.UNDER_WIDGETS);
    }

    private static boolean var4(int n2) {
        return n2 != 0;
    }

    private static boolean var5(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean var6(Object object) {
        return object != null;
    }

    private static boolean var7(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    private void a(Graphics2D graphics2D) {
        q var8;
        if (q.var2(this.av.markSectionOrder() ? 1 : 0)) {
            return;
        }
        Queue<i> var9 = var8.au.i();
        HashSet<WorldPoint> var10 = new HashSet<WorldPoint>();
        int var11 = var1[0];
        Iterator var12 = var9.iterator();
        while (q.var4(var12.hasNext() ? 1 : 0)) {
            i var13 = (i)((Object)var12.next());
            if (q.var7(var11, var1[1])) {
                0;
                if (2 > 0) break;
                return;
            }
            WorldPoint var14 = var13.a(var8.at);
            if (q.var4(var10.contains(var14) ? 1 : 0)) {
                0;
                if (-(0x8A ^ 0xA5 ^ (0x25 ^ 0xF)) < 0) break;
                return;
            }
            Color var15 = as[var11];
            var10.add(var14);
            0;
            ++var11;
            int var16 = var1[2];
            while (q.var5(var16, var1[3])) {
                int var17 = var1[2];
                while (q.var5(var17, var1[3])) {
                    WorldPoint var18 = var14.dx(var16).dy(var17);
                    LocalPoint var19 = LocalPoint.fromWorld((Client)var8.at, (WorldPoint)var18);
                    if (q.var3(var19)) {
                        0;
                        if (((0x31 ^ 0x52) & ~(0xD2 ^ 0xB1)) >= (0xA ^ 0xE)) {
                            return;
                        }
                    } else {
                        Point var20 = Perspective.tileCenter((Client)var8.at, (WorldPoint)var14);
                        Polygon var21 = Perspective.getCanvasTilePoly((Client)var8.at, (LocalPoint)var19);
                        if (q.var6(var21)) {
                            if (q.var3(var20)) {
                                0;
                                if null != null {
                                    return;
                                }
                            } else {
                                void var22;
                                OverlayUtil.renderPolygon((Graphics2D)var22, (Shape)var21, (Color)var15, (Color)new Color(var15.getRed(), var15.getGreen(), var15.getBlue(), var1[4]), (Stroke)new BasicStroke(1.0f));
                            }
                        }
                    }
                    ++var17;
                    0;
                    if (-1 >= -1) continue;
                    return;
                }
                ++var16;
                0;
                if (3 != 0) continue;
                return;
            }
            0;
            if null == null continue;
            return;
        }
    }

    private static void var23() {
        var1 = new int[8];
        q.var1[0] = (0x44 ^ 0x73 ^ (0x7F ^ 0x40)) & (131 + 41 - 159 + 119 ^ 62 + 91 - 30 + 17 ^ -1);
        q.var1[1] = 2;
        q.var1[2] = -1;
        q.var1[3] = 1;
        q.var1[4] = 0x12 ^ 0x72 ^ (7 ^ 0x7E);
        q.var1[5] = 0xA8 ^ 0xAD;
        q.var1[6] = 3;
        q.var1[7] = 0x4A ^ 0x22 ^ (0x25 ^ 0x49);
    }

    public Dimension render(Graphics2D graphics2D) {
        this.a(graphics2D);
        return null;
    }

    static {
        q.var23();
        Color[] colorArray = new Color[var1[5]];
        colorArray[q.var1[0]] = Color.GREEN;
        colorArray[q.var1[3]] = Color.ORANGE;
        colorArray[q.var1[1]] = Color.YELLOW;
        colorArray[q.var1[6]] = Color.RED;
        colorArray[q.var1[7]] = Color.BLACK;
        as = colorArray;
    }
}

