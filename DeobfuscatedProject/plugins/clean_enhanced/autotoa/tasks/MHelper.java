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
package gg.squire.autotoa.tasks;

import gg.squire.autotoa.TOAConfig;
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
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.GameEnum3;

public class MHelper
extends Overlay {
    private static final  Color[] bF;
    private final  m bH;
    
    private final  Client bG;
    private final  TOAConfig bI;

    /*
     * WARNING - void declaration
     */
    private void a(Graphics2D graphics2D) {
        Queue<n> queue = this.bH.G();
        HashSet hashSet = new HashSet();
        int n2 = var1[0];
        Iterator var2 = queue.iterator();
        while (M.var3(var2.hasNext() ? 1 : 0)) {
            void var4;
            M var5;
            void var6;
            n var7 = (n)((Object)var2.next());
            if (M.var8((int)var6, var1[1])) {
                0;
                if (1 != 2) break;
                return;
            }
            WorldPoint var9 = var7.a(var5.bG);
            if (M.var3(var4.contains(var9) ? 1 : 0)) {
                0;
                if (-(158 + 155 - 209 + 57 ^ 82 + 110 - 106 + 78) < 0) break;
                return;
            }
            Color var10 = bF[var6];
            var4.add(var9);
            0;
            ++var6;
            int var11 = var1[2];
            while (M.var12(var11, var1[3])) {
                int var13 = var1[2];
                while (M.var12(var13, var1[3])) {
                    WorldPoint var14 = var9.dx(var11).dy(var13);
                    LocalPoint var15 = LocalPoint.fromWorld((Client)var5.bG, (WorldPoint)var14);
                    if (M.var16(var15)) {
                        0;
                        
                    } else {
                        Point var17 = Perspective.tileCenter((Client)var5.bG, (WorldPoint)var9);
                        Polygon var18 = Perspective.getCanvasTilePoly((Client)var5.bG, (LocalPoint)var15);
                        if (M.var19(var18)) {
                            if (M.var16(var17)) {
                                0;
                                if (-1 >= 0) {
                                    return;
                                }
                            } else {
                                void var20;
                                OverlayUtil.renderPolygon((Graphics2D)var20, (Shape)var18, (Color)var10, (Color)new Color(var10.getRed(), var10.getGreen(), var10.getBlue(), var1[4]), (Stroke)new BasicStroke(1.0f));
                            }
                        }
                    }
                    ++var13;
                    0;
                    if (3 > -1) continue;
                    return;
                }
                ++var11;
                0;
                
                return;
            }
            0;
            if null == null continue;
            return;
        }
    }

    private static boolean var8(int n2, int n3) {
        return n2 >= n3;
    }

    static {
        M.var21();
        Color[] colorArray = new Color[var1[5]];
        colorArray[M.var1[0]] = Color.GREEN;
        colorArray[M.var1[3]] = Color.ORANGE;
        colorArray[M.var1[1]] = Color.YELLOW;
        colorArray[M.var1[6]] = Color.RED;
        colorArray[M.var1[7]] = Color.BLACK;
        bF = colorArray;
    }

    private static void var21() {
        var1 = new int[8];
        M.var1[0] = (132 + 158 - 165 + 52 ^ 138 + 132 - 138 + 32) & (5 + 96 - 46 + 119 ^ 25 + 98 - -48 + 16 ^ -1);
        M.var1[1] = 2;
        M.var1[2] = -1;
        M.var1[3] = 1;
        M.var1[4] = 0x36 ^ 0x2F;
        M.var1[5] = 0x6F ^ 0x2A ^ (0xF5 ^ 0xB5);
        M.var1[6] = 3;
        M.var1[7] = 133 + 127 - 219 + 141 ^ 11 + 58 - -44 + 65;
    }

    @Inject
    protected MHelper(Client client, m m2, TOAConfig tOAConfig) {
        this.bG = client;
        this.bH = m2;
        this.bI = tOAConfig;
        this.setPriority(OverlayPriority.HIGH);
        this.setPosition(OverlayPosition.DYNAMIC);
        this.setLayer(OverlayLayer.UNDER_WIDGETS);
    }

    private static boolean var19(Object object) {
        return object != null;
    }

    private static boolean var16(Object object) {
        return object == null;
    }

    private static boolean var3(int n2) {
        return n2 != 0;
    }

    private static boolean var12(int n2, int n3) {
        return n2 <= n3;
    }

    public Dimension render(Graphics2D graphics2D) {
        this.a(graphics2D);
        return null;
    }
}

