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
        u llllllllllllllIlllIlIIIIlllIIIll;
        if (u.lIllIlIIlllIllI(this.aE.showOrbs() ? 1 : 0)) {
            return;
        }
        List<NPC> llllllllllllllIlllIlIIIIlllIIIIl = llllllllllllllIlllIlIIIIlllIIIll.aD.k();
        Iterator<NPC> llllllllllllllIlllIlIIIIlllIIIII = llllllllllllllIlllIlIIIIlllIIIIl.iterator();
        while (u.lIllIlIIlllIlll(llllllllllllllIlllIlIIIIlllIIIII.hasNext() ? 1 : 0)) {
            NPC llllllllllllllIlllIlIIIIllIlllll = llllllllllllllIlllIlIIIIlllIIIII.next();
            Shape llllllllllllllIlllIlIIIIllIllllI = llllllllllllllIlllIlIIIIllIlllll.getConvexHull();
            if (u.lIllIlIIllllIII(llllllllllllllIlllIlIIIIllIllllI)) {
                void llllllllllllllIlllIlIIIIlllIIIlI;
                OverlayUtil.renderPolygon((Graphics2D)llllllllllllllIlllIlIIIIlllIIIlI, (Shape)llllllllllllllIlllIlIIIIllIllllI, (Color)ColorScheme.BRAND_ORANGE, (Stroke)new BasicStroke(1.0f));
            }
            "".length();
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
        u llllllllllllllIlllIlIIIIllIllIII;
        if (u.lIllIlIIlllIllI(this.aE.outlineMirrors() ? 1 : 0)) {
            return;
        }
        Iterator<TileObject> llllllllllllllIlllIlIIIIllIlIllI = llllllllllllllIlllIlIIIIllIllIII.aD.j().iterator();
        while (u.lIllIlIIlllIlll(llllllllllllllIlllIlIIIIllIlIllI.hasNext() ? 1 : 0)) {
            void llllllllllllllIlllIlIIIIllIlIlll;
            TileObject llllllllllllllIlllIlIIIIllIlIlIl = llllllllllllllIlllIlIIIIllIlIllI.next();
            Polygon llllllllllllllIlllIlIIIIllIlIlII = llllllllllllllIlllIlIIIIllIlIlIl.getCanvasTilePoly();
            if (u.lIllIlIIllllIIl(llllllllllllllIlllIlIIIIllIlIlII)) {
                "".length();
                if (((0x50 ^ 0x16) & ~(8 ^ 0x4E)) == 0) continue;
                return;
            }
            OverlayUtil.renderPolygon((Graphics2D)llllllllllllllIlllIlIIIIllIlIlll, (Shape)llllllllllllllIlllIlIIIIllIlIlII, (Color)ColorScheme.BRAND_YELLOW, (Stroke)new BasicStroke(1.0f));
            "".length();
            if ("  ".length() > -" ".length()) continue;
            return;
        }
    }
}

