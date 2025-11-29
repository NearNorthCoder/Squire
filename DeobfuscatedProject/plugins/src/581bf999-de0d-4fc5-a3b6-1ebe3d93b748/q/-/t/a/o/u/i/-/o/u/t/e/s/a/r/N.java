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
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import gg.squire.autotoa.TOAConfig;
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
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.S;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.j;

public class N
extends S {
    private final /* synthetic */ Client bJ;
    private final /* synthetic */ j bK;

    public Dimension render(Graphics2D graphics2D) {
        this.b(graphics2D);
        return null;
    }

    private static boolean lIlIIIIIIllIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIIIIIllIlI(Object object) {
        return object == null;
    }

    @Inject
    protected N(TOAConfig tOAConfig, Client client, j j2) {
        super(tOAConfig);
        this.bJ = client;
        this.bK = j2;
        this.setPriority(OverlayPriority.HIGH);
        this.setPosition(OverlayPosition.DYNAMIC);
        this.setLayer(OverlayLayer.UNDER_WIDGETS);
    }

    /*
     * WARNING - void declaration
     */
    private void b(Graphics2D graphics2D) {
        Iterator<NPC> llllllllllllllllIlIIIIIIIlIIllIl = this.bK.B().iterator();
        while (N.lIlIIIIIIllIIl(llllllllllllllllIlIIIIIIIlIIllIl.hasNext() ? 1 : 0)) {
            void llllllllllllllllIlIIIIIIIlIIlllI;
            NPC llllllllllllllllIlIIIIIIIlIIllII = llllllllllllllllIlIIIIIIIlIIllIl.next();
            Shape llllllllllllllllIlIIIIIIIlIIlIll = llllllllllllllllIlIIIIIIIlIIllII.getConvexHull();
            if (N.lIlIIIIIIllIlI(llllllllllllllllIlIIIIIIIlIIlIll)) {
                "".length();
                if ((0x3F ^ 0x3B) > "   ".length()) continue;
                return;
            }
            OverlayUtil.renderPolygon((Graphics2D)llllllllllllllllIlIIIIIIIlIIlllI, (Shape)llllllllllllllllIlIIIIIIIlIIlIll, (Color)Color.BLUE, (Stroke)new BasicStroke(1.0f));
            "".length();
            if (((65 + 110 - 93 + 70 ^ 31 + 92 - 23 + 77) & (153 + 140 - 134 + 80 ^ 17 + 63 - 66 + 184 ^ -" ".length())) == 0) continue;
            return;
        }
    }
}

