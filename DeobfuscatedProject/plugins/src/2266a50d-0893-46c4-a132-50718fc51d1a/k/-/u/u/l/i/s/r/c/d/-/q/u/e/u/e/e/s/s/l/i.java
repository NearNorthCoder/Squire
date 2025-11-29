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
package k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l;

import com.google.inject.Inject;
import gg.squire.duke.SquireDukeSucellus;
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

public class i
extends Overlay {
    private final /* synthetic */ SquireDukeSucellus af;

    public Dimension render(Graphics2D graphics2D) {
        return null;
    }

    @Inject
    public i(SquireDukeSucellus squireDukeSucellus) {
        this.af = squireDukeSucellus;
        this.setLayer(OverlayLayer.ABOVE_SCENE);
        this.setPosition(OverlayPosition.DYNAMIC);
    }

    private static boolean lllIIllllIlllI(int n2) {
        return n2 != 0;
    }

    private static boolean lllIIllllIllll(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public void a(List<WorldPoint> list, Graphics2D graphics2D, Color color) {
        Iterator<WorldPoint> lllllllllllllllIlIllllIlllllIIII = list.iterator();
        while (i.lllIIllllIlllI(lllllllllllllllIlIllllIlllllIIII.hasNext() ? 1 : 0)) {
            void lllllllllllllllIlIllllIlllllIIIl;
            void lllllllllllllllIlIllllIlllllIIlI;
            WorldPoint lllllllllllllllIlIllllIllllIllll = lllllllllllllllIlIllllIlllllIIII.next();
            LocalPoint lllllllllllllllIlIllllIllllIlllI = LocalPoint.fromWorld((Client)Static.getClient(), (WorldPoint)lllllllllllllllIlIllllIllllIllll);
            if (i.lllIIllllIllll(lllllllllllllllIlIllllIllllIlllI)) {
                "".length();
                if ((32 + 134 - 161 + 159 ^ 93 + 26 - 83 + 124) >= (118 + 67 - 133 + 81 ^ 90 + 38 - 81 + 82)) continue;
                return;
            }
            Polygon lllllllllllllllIlIllllIllllIllIl = Perspective.getCanvasTilePoly((Client)Static.getClient(), (LocalPoint)lllllllllllllllIlIllllIllllIlllI);
            OverlayUtil.renderPolygon((Graphics2D)lllllllllllllllIlIllllIlllllIIlI, (Shape)lllllllllllllllIlIllllIllllIllIl, (Color)lllllllllllllllIlIllllIlllllIIIl);
            "".length();
            if ((0x74 ^ 0x70) == (0x6E ^ 0x6A)) continue;
            return;
        }
    }
}

