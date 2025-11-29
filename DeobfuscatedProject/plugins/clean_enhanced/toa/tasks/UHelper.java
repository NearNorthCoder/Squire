/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayLayer
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.OverlayPriority
 *  net.runelite.client.ui.overlay.OverlayUtil
 */
package gg.squire.toa.tasks;

import gg.squire.toa.tasks.ToaManager;
import gg.squire.toa.TOAConfig;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;
import java.awt.Stroke;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.OverlayUtil;

public class UHelper
extends Overlay {
    private final  h aD;
    private final  TOAConfig aE;
    private final  Client aC;

    public Dimension render(Graphics2D graphics2D) {
        this.f(graphics2D);
        this.e(graphics2D);
        return null;
    }

    private static boolean var1(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    private void e(Graphics2D graphics2D) {
        u var2;
        if (u.var3(this.aE.showOrbs() ? 1 : 0)) {
            return;
        }
        List<NPC> var4 = var2.aD.k();
        Iterator<NPC> var5 = var4.iterator();
        while (u.var6(var5.hasNext() ? 1 : 0)) {
            NPC var7 = var5.next();
            Shape var8 = var7.getConvexHull();
            if (u.var9(var8)) {
                void var10;
                OverlayUtil.renderPolygon((Graphics2D)var10, (Shape)var8, (Color)ColorScheme.BRAND_ORANGE, (Stroke)new BasicStroke(1.0f));
            }
            0;
            if (((0xFE ^ 0xC0) & ~(0xA7 ^ 0x99)) == 0) continue;
            return;
        }
    }

    private static boolean var3(int n2) {
        return n2 == 0;
    }

    @Inject
    protected UHelper(Client client, h h2, TOAConfig tOAConfig) {
        this.aC = client;
        this.aD = h2;
        this.aE = tOAConfig;
        this.setPriority(OverlayPriority.HIGH);
        this.setPosition(OverlayPosition.DYNAMIC);
        this.setLayer(OverlayLayer.UNDER_WIDGETS);
    }

    private static boolean var9(Object object) {
        return object != null;
    }

    private static boolean var6(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private void f(Graphics2D graphics2D) {
        u var11;
        if (u.var3(this.aE.outlineMirrors() ? 1 : 0)) {
            return;
        }
        Iterator<TileObject> var12 = var11.aD.j().iterator();
        while (u.var6(var12.hasNext() ? 1 : 0)) {
            void var13;
            TileObject var14 = var12.next();
            Polygon var15 = var14.getCanvasTilePoly();
            if (u.var1(var15)) {
                0;
                if (((0x50 ^ 0x16) & ~(8 ^ 0x4E)) == 0) continue;
                return;
            }
            OverlayUtil.renderPolygon((Graphics2D)var13, (Shape)var15, (Color)ColorScheme.BRAND_YELLOW, (Stroke)new BasicStroke(1.0f));
            0;
            if (2 > -1) continue;
            return;
        }
    }
}

