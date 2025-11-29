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
 */
package a.u.i.-.l.r.h.z.s.r.u.q.e;

import a.u.i.-.l.r.h.z.s.r.u.q.e.v;
import com.google.inject.Inject;
import gg.squire.zulrah.SquireZulrah;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;
import net.runelite.api.Client;
import net.runelite.api.Perspective;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayUtil;

public class x
extends Overlay {
    private final /* synthetic */ SquireZulrah Q;
    private final /* synthetic */ v R;
    private final /* synthetic */ Client P;

    private static boolean llIIlIIIIIIllII(Object object) {
        return object != null;
    }

    private static boolean llIIlIIIIIIlIll(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public Dimension render(Graphics2D graphics2D) {
        void var4_4;
        void var3_3;
        x llllllllllllllIllIIIllIllIllIIIl;
        if (x.llIIlIIIIIIlIIl(this.Q.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        if (x.llIIlIIIIIIlIlI(llllllllllllllIllIIIllIllIllIIIl.P.isInInstancedRegion() ? 1 : 0)) {
            return null;
        }
        WorldPoint llllllllllllllIllIIIllIllIlIllll = llllllllllllllIllIIIllIllIllIIIl.R.X();
        if (x.llIIlIIIIIIlIll(llllllllllllllIllIIIllIllIlIllll)) {
            return null;
        }
        LocalPoint llllllllllllllIllIIIllIllIlIlllI = LocalPoint.fromWorld((Client)llllllllllllllIllIIIllIllIllIIIl.P, (WorldPoint)llllllllllllllIllIIIllIllIllIIIl.R.V().C().a(llllllllllllllIllIIIllIllIlIllll));
        LocalPoint llllllllllllllIllIIIllIllIlIllIl = LocalPoint.fromWorld((Client)llllllllllllllIllIIIllIllIllIIIl.P, (WorldPoint)llllllllllllllIllIIIllIllIllIIIl.R.X());
        if (!x.llIIlIIIIIIllII(llllllllllllllIllIIIllIllIlIllIl) || x.llIIlIIIIIIlIll(llllllllllllllIllIIIllIllIlIlllI)) {
            return null;
        }
        Polygon polygon = Perspective.getCanvasTilePoly((Client)this.P, (LocalPoint)var3_3);
        Polygon polygon2 = Perspective.getCanvasTilePoly((Client)this.P, (LocalPoint)var4_4);
        OverlayUtil.renderPolygon((Graphics2D)graphics2D, (Shape)polygon2, (Color)Color.BLUE);
        OverlayUtil.renderPolygon((Graphics2D)graphics2D, (Shape)polygon, (Color)Color.GREEN);
        return null;
    }

    @Inject
    public x(Client client, SquireZulrah squireZulrah, v v2) {
        this.P = client;
        this.Q = squireZulrah;
        this.R = v2;
        this.setLayer(OverlayLayer.ABOVE_SCENE);
        this.setPosition(OverlayPosition.DYNAMIC);
    }

    private static boolean llIIlIIIIIIlIIl(int n2) {
        return n2 != 0;
    }

    private static boolean llIIlIIIIIIlIlI(int n2) {
        return n2 == 0;
    }
}

