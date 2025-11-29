/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  net.runelite.api.TileObject
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.Overlay
 */
package -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f;

import -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.a;
import gg.squire.giantsfoundry.SquireGiantsFoundry;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Shape;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.Overlay;

public class k
extends Overlay {
    private final /* synthetic */ a W;
    private final /* synthetic */ SquireGiantsFoundry X;
    private static /* synthetic */ int[] llIlIllIIIll;

    @Inject
    k(a a2, SquireGiantsFoundry squireGiantsFoundry) {
        this.W = a2;
        this.X = squireGiantsFoundry;
    }

    static {
        k.lIIIIIlllIIIIIl();
    }

    private static void lIIIIIlllIIIIIl() {
        llIlIllIIIll = new int[1];
        k.llIlIllIIIll[0] = 0x93 ^ 0xB4 ^ (0x7A ^ 0x49);
    }

    private static boolean lIIIIIlllIIIIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIIIlllIIIIll(Object object) {
        return object == null;
    }

    private static boolean lIIIIIlllIIIlII(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    public Dimension render(Graphics2D graphics2D) {
        Shape var3;
        Color var2;
        Color color;
        k var4;
        if (k.lIIIIIlllIIIIlI(this.X.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        TileObject var5 = var4.W.j();
        if (k.lIIIIIlllIIIIll(var5)) {
            return null;
        }
        if (k.lIIIIIlllIIIIlI(var4.W.n() ? 1 : 0)) {
            color = ColorScheme.PROGRESS_COMPLETE_COLOR;
            0;
            if (2 < ((21 + 201 - 195 + 189 ^ 145 + 21 - 56 + 74) & (154 + 40 - 193 + 204 ^ 117 + 28 - 43 + 71 ^ -1))) {
                return null;
            }
        } else {
            color = var2 = ColorScheme.PROGRESS_ERROR_COLOR;
        }
        if (k.lIIIIIlllIIIlII(var3 = var5.getClickbox())) {
            void var1;
            var1.setColor(var2);
            var1.draw(var3);
            var1.setColor(new Color(var2.getRed(), var2.getGreen(), var2.getBlue(), llIlIllIIIll[0]));
            var1.fill(var3);
        }
        return null;
    }
}

