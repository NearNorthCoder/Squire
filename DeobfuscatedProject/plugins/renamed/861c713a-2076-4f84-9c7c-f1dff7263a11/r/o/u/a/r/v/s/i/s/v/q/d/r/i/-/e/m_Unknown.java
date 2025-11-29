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
package r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e;

import com.google.inject.Inject;
import gg.squire.vardorvis.SquireVardorvis;
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

public class m_Unknown
extends Overlay {
    private final /* synthetic */ SquireVardorvis ac;

    @Inject
    public m(SquireVardorvis squireVardorvis) {
        this.ac = squireVardorvis;
        this.setLayer(OverlayLayer.ABOVE_SCENE);
        this.setPosition(OverlayPosition.DYNAMIC);
    }

    private static boolean lIlllllIIIlIIll(Object object) {
        return object == null;
    }

    private static boolean lIlllllIIIlIIlI(int n2) {
        return n2 != 0;
    }

    public Dimension render(Graphics2D graphics2D) {
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public void a(List<WorldPoint> list, Graphics2D graphics2D, Color color) {
        Iterator<WorldPoint> var1 = list.iterator();
        while (m.lIlllllIIIlIIlI(var1.hasNext() ? 1 : 0)) {
            void var6;
            void var2;
            WorldPoint var3 = var1.next();
            LocalPoint var5 = LocalPoint.fromWorld((Client)Static.getClient(), (WorldPoint)var3);
            if (m.lIlllllIIIlIIll(var5)) {
                0;
                if (((0xB3 ^ 0x94) & ~(0x55 ^ 0x72)) == 0) continue;
                return;
            }
            Polygon var4 = Perspective.getCanvasTilePoly((Client)Static.getClient(), (LocalPoint)var5);
            OverlayUtil.renderPolygon((Graphics2D)var2, (Shape)var4, (Color)var6);
            0;
            if ((0x8F ^ 0xAC ^ (0xAF ^ 0x88)) >= 1) continue;
            return;
        }
    }
}

