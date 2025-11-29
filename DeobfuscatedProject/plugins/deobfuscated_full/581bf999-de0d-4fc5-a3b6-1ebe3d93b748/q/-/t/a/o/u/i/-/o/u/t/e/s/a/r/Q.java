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
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import gg.squire.autotoa.TOAConfig;
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
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.m;

public class Q
extends Overlay {
    private final /* synthetic */ TOAConfig bR;
    private final /* synthetic */ m bQ;
    private final /* synthetic */ Client bP;

    public Dimension render(Graphics2D graphics2D) {
        this.f(graphics2D);
        this.e(graphics2D);
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private void f(Graphics2D graphics2D) {
        Iterator<TileObject> var5 = this.bQ.H().iterator();
        while (Q.lIlIIlIlIIllIl(var5.hasNext() ? 1 : 0)) {
            void var6;
            TileObject var4 = var5.next();
            Polygon var2 = var4.getCanvasTilePoly();
            if (Q.lIlIIlIlIIllll(var2)) {
                0;
                if (((117 + 150 - 103 + 26 ^ 25 + 88 - 91 + 125) & (0x36 ^ 0x66 ^ (0x6E ^ 0x13) ^ -1)) >= ((0x38 ^ 0x41 ^ (0x23 ^ 0x1C)) & (0x91 ^ 0xB0 ^ (0x2B ^ 0x4C) ^ -1))) continue;
                return;
            }
            OverlayUtil.renderPolygon((Graphics2D)var6, (Shape)var2, (Color)ColorScheme.BRAND_YELLOW, (Stroke)new BasicStroke(1.0f));
            0;
            if (1 >= 0) continue;
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    private void e(Graphics2D graphics2D) {
        List<NPC> list = this.bQ.I();
        Iterator<NPC> var7 = list.iterator();
        while (Q.lIlIIlIlIIllIl(var7.hasNext() ? 1 : 0)) {
            NPC var1 = var7.next();
            Shape var8 = var1.getConvexHull();
            if (Q.lIlIIlIlIIlllI(var8)) {
                void var3;
                OverlayUtil.renderPolygon((Graphics2D)var3, (Shape)var8, (Color)ColorScheme.BRAND_ORANGE, (Stroke)new BasicStroke(1.0f));
            }
            0;
            
            return;
        }
    }

    private static boolean lIlIIlIlIIlllI(Object object) {
        return object != null;
    }

    @Inject
    protected Q(Client client, m m2, TOAConfig tOAConfig) {
        this.bP = client;
        this.bQ = m2;
        this.bR = tOAConfig;
        this.setPriority(OverlayPriority.HIGH);
        this.setPosition(OverlayPosition.DYNAMIC);
        this.setLayer(OverlayLayer.UNDER_WIDGETS);
    }

    private static boolean lIlIIlIlIIllll(Object object) {
        return object == null;
    }

    private static boolean lIlIIlIlIIllIl(int n2) {
        return n2 != 0;
    }
}

