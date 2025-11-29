package p000.p001.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f;

import gg.squire.giantsfoundry.SquireGiantsFoundry;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Shape;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.Overlay;
/* renamed from: -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.k  reason: invalid package */
/* loaded from: a295c4aa-95d9-42ec-b8cf-442736b096bd.jar:-/-/u/o/s/q/s/i/e/y/a/i/d/t/n/r/n/u/r/g/f/k.class */
public class k extends Overlay {
    private final /* synthetic */ a W;
    private final /* synthetic */ SquireGiantsFoundry X;
    private static /* synthetic */ int[] llIlIllIIIll;

    @Inject
    k(a aVar, SquireGiantsFoundry squireGiantsFoundry) {
        this.W = aVar;
        this.X = squireGiantsFoundry;
    }

    static {
        lIIIIIlllIIIIIl();
    }

    private static void lIIIIIlllIIIIIl() {
        llIlIllIIIll = new int[1];
        llIlIllIIIll[0] = (147 ^ 180) ^ (122 ^ 73);
    }

    private static boolean lIIIIIlllIIIIlI(int i) {
        return i != 0;
    }

    private static boolean lIIIIIlllIIIIll(Object obj) {
        return obj == null;
    }

    private static boolean lIIIIIlllIIIlII(Object obj) {
        return obj != null;
    }

    public Dimension render(Graphics2D graphics2D) {
        Color color;
        if (lIIIIIlllIIIIlI(this.X.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        TileObject j = this.W.j();
        if (lIIIIIlllIIIIll(j)) {
            return null;
        }
        if (lIIIIIlllIIIIlI(this.W.n() ? 1 : 0)) {
            color = ColorScheme.PROGRESS_COMPLETE_COLOR;
            "".length();
            if ("  ".length() < (((((21 + 201) - 195) + 189) ^ (((145 + 21) - 56) + 74)) & (((((154 + 40) - 193) + 204) ^ (((117 + 28) - 43) + 71)) ^ (-" ".length())))) {
                return null;
            }
        } else {
            color = ColorScheme.PROGRESS_ERROR_COLOR;
        }
        Color color2 = color;
        Shape clickbox = j.getClickbox();
        if (lIIIIIlllIIIlII(clickbox)) {
            graphics2D.setColor(color2);
            graphics2D.draw(clickbox);
            graphics2D.setColor(new Color(color2.getRed(), color2.getGreen(), color2.getBlue(), llIlIllIIIll[0]));
            graphics2D.fill(clickbox);
            return null;
        }
        return null;
    }
}
