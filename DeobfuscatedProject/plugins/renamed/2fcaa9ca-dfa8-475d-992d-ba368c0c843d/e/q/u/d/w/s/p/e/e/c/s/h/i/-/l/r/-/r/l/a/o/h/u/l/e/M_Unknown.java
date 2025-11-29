/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Perspective
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayLayer
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.OverlayUtil
 *  net.unethicalite.client.Static
 */
package e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e;

import com.google.inject.Inject;
import gg.squire.sepulchre.SquireSepulchre;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;
import java.util.Iterator;
import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.Perspective;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayUtil;
import net.unethicalite.client.Static;

public class M_Unknown
extends Overlay {
    private final /* synthetic */ SquireSepulchre ad;

    /*
     * WARNING - void declaration
     */
    public void a(List<WorldPoint> list, Graphics2D graphics2D, Color color) {
        Iterator<WorldPoint> var6 = list.iterator();
        while (M.lIIIlIIlIllllll(var6.hasNext() ? 1 : 0)) {
            void var3;
            void var1;
            WorldPoint var2 = var6.next();
            LocalPoint var5 = LocalPoint.fromWorld((Client)Static.getClient(), (WorldPoint)var2);
            if (M.lIIIlIIllIIIIII(var5)) {
                0;
                if (((0xE8 ^ 0xC2) & ~(0x70 ^ 0x5A)) < 1) continue;
                return;
            }
            Polygon var4 = Perspective.getCanvasTilePoly((Client)Static.getClient(), (LocalPoint)var5);
            OverlayUtil.renderPolygon((Graphics2D)var1, (Shape)var4, (Color)var3);
            0;
            if (-(0x13 ^ 0x17) < 0) continue;
            return;
        }
    }

    @Inject
    public M(SquireSepulchre squireSepulchre) {
        this.ad = squireSepulchre;
        this.setLayer(OverlayLayer.ABOVE_SCENE);
        this.setPosition(OverlayPosition.DYNAMIC);
    }

    public Dimension render(Graphics2D graphics2D) {
        return null;
    }

    private static boolean lIIIlIIlIllllll(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIlIIllIIIIII(Object object) {
        return object == null;
    }
}

