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
package -.r.u.q.e.s.o.t.a.i;

import -.r.u.q.e.s.o.t.a.i.h;
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

public class u
extends Overlay {
    private final /* synthetic */ h aD;
    private final /* synthetic */ TOAConfig aE;
    private final /* synthetic */ Client aC;

    public Dimension render(Graphics2D graphics2D) {
        this.f(graphics2D);
        this.e(graphics2D);
        return null;
    }

    private static boolean lIllIlIIllllIIl(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    private void e(Graphics2D graphics2D) {
        u var3;
        if (u.lIllIlIIlllIllI(this.aE.showOrbs() ? 1 : 0)) {
            return;
        }
        List<NPC> var5 = var3.aD.k();
        Iterator<NPC> var11 = var5.iterator();
        while (u.lIllIlIIlllIlll(var11.hasNext() ? 1 : 0)) {
            NPC var9 = var11.next();
            Shape var8 = var9.getConvexHull();
            if (u.lIllIlIIllllIII(var8)) {
                void var4;
                OverlayUtil.renderPolygon((Graphics2D)var4, (Shape)var8, (Color)ColorScheme.BRAND_ORANGE, (Stroke)new BasicStroke(1.0f));
            }
            0;
            if (((0xFE ^ 0xC0) & ~(0xA7 ^ 0x99)) == 0) continue;
            return;
        }
    }

    private static boolean lIllIlIIlllIllI(int n2) {
        return n2 == 0;
    }

    @Inject
    protected u(Client client, h h2, TOAConfig tOAConfig) {
        this.aC = client;
        this.aD = h2;
        this.aE = tOAConfig;
        this.setPriority(OverlayPriority.HIGH);
        this.setPosition(OverlayPosition.DYNAMIC);
        this.setLayer(OverlayLayer.UNDER_WIDGETS);
    }

    private static boolean lIllIlIIllllIII(Object object) {
        return object != null;
    }

    private static boolean lIllIlIIlllIlll(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private void f(Graphics2D graphics2D) {
        u var10;
        if (u.lIllIlIIlllIllI(this.aE.outlineMirrors() ? 1 : 0)) {
            return;
        }
        Iterator<TileObject> var2 = var10.aD.j().iterator();
        while (u.lIllIlIIlllIlll(var2.hasNext() ? 1 : 0)) {
            void var7;
            TileObject var1 = var2.next();
            Polygon var6 = var1.getCanvasTilePoly();
            if (u.lIllIlIIllllIIl(var6)) {
                0;
                if (((0x50 ^ 0x16) & ~(8 ^ 0x4E)) == 0) continue;
                return;
            }
            OverlayUtil.renderPolygon((Graphics2D)var7, (Shape)var6, (Color)ColorScheme.BRAND_YELLOW, (Stroke)new BasicStroke(1.0f));
            0;
            if (2 > -1) continue;
            return;
        }
    }
}

