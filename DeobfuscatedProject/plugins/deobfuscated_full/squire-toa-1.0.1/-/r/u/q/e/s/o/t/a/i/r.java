/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.client.ui.overlay.OverlayLayer
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.OverlayPriority
 *  net.runelite.client.ui.overlay.OverlayUtil
 */
package -.r.u.q.e.s.o.t.a.i;

import -.r.u.q.e.s.o.t.a.i.f;
import -.r.u.q.e.s.o.t.a.i.w;
import gg.squire.toa.TOAConfig;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.Stroke;
import java.util.Iterator;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.OverlayUtil;

public class r
extends w {
    private final /* synthetic */ Client aw;
    private final /* synthetic */ f ax;

    public Dimension render(Graphics2D graphics2D) {
        this.b(graphics2D);
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private void b(Graphics2D graphics2D) {
        r var1;
        if (r.lIllIllIlIIlllI(this.aI.outlineBrokenBoulders() ? 1 : 0)) {
            return;
        }
        Iterator<NPC> var4 = var1.ax.e().iterator();
        while (r.lIllIllIlIIllll(var4.hasNext() ? 1 : 0)) {
            void var5;
            NPC var3 = var4.next();
            Shape var2 = var3.getConvexHull();
            if (r.lIllIllIlIlIIII(var2)) {
                0;
                if (-1 < ((0x98 ^ 0xC6 ^ (0xD4 ^ 0x8C)) & (119 + 122 - 80 + 25 ^ 157 + 169 - 215 + 77 ^ -1))) continue;
                return;
            }
            OverlayUtil.renderPolygon((Graphics2D)var5, (Shape)var2, (Color)Color.BLUE, (Stroke)new BasicStroke(1.0f));
            0;
            
            return;
        }
    }

    private static boolean lIllIllIlIlIIII(Object object) {
        return object == null;
    }

    @Inject
    protected r(TOAConfig tOAConfig, Client client, f f2) {
        super(tOAConfig);
        this.aw = client;
        this.ax = f2;
        this.setPriority(OverlayPriority.HIGH);
        this.setPosition(OverlayPosition.DYNAMIC);
        this.setLayer(OverlayLayer.UNDER_WIDGETS);
    }

    private static boolean lIllIllIlIIlllI(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIllIlIIllll(int n2) {
        return n2 != 0;
    }
}

