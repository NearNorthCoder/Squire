package a.n.q.u.l.p000.e.p001.e.s.a.b.r.i.s.u.t.r.c.f;

import com.google.inject.Inject;
import gg.squire.minigames.SquireBlastFurnaceConfig;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.Rectangle;
import net.runelite.api.Client;
import net.runelite.api.Perspective;
import net.runelite.api.coords.LocalPoint;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.TextComponent;
/* renamed from: a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.O  reason: invalid package */
/* loaded from: 06deb524-30dc-422a-b422-0bec548b1d10.jar:a/n/q/u/l/-/e/-/e/s/a/b/r/i/s/u/t/r/c/f/O.class */
public class O extends Overlay {
    @Inject
    private /* synthetic */ Client g;
    @Inject
    private /* synthetic */ D aG;
    private static /* synthetic */ int[] lIIlIlllIllI;
    @Inject
    private /* synthetic */ SquireBlastFurnaceConfig i;

    static {
        llIIllIlIlllll();
    }

    public Dimension render(Graphics2D graphics2D) {
        w Y = this.aG.Y();
        if (llIIllIllIIIII(Y) || llIIllIllIIIIl(Y instanceof y ? 1 : 0)) {
            return null;
        }
        Color color = ColorScheme.PROGRESS_COMPLETE_COLOR;
        LocalPoint fromWorld = LocalPoint.fromWorld(this.g, ((y) Y).L());
        if (llIIllIllIIIII(fromWorld)) {
            return null;
        }
        Polygon canvasTilePoly = Perspective.getCanvasTilePoly(this.g, fromWorld);
        graphics2D.setColor(color);
        graphics2D.draw(canvasTilePoly);
        graphics2D.setColor(new Color(color.getRed(), color.getBlue(), color.getGreen(), lIIlIlllIllI[0]));
        graphics2D.fill(canvasTilePoly);
        TextComponent textComponent = new TextComponent();
        Rectangle bounds = canvasTilePoly.getBounds();
        FontMetrics fontMetrics = graphics2D.getFontMetrics();
        int stringWidth = fontMetrics.stringWidth(Y.J());
        fontMetrics.getHeight();
        textComponent.setPosition(new Point((bounds.x + (bounds.width / lIIlIlllIllI[1])) - (stringWidth / lIIlIlllIllI[1]), bounds.y + bounds.height));
        textComponent.setColor(color);
        textComponent.setText(Y.J());
        textComponent.render(graphics2D);
        "".length();
        return null;
    }

    O() {
        setPosition(OverlayPosition.DYNAMIC);
    }

    private static void llIIllIlIlllll() {
        lIIlIlllIllI = new int[2];
        lIIlIlllIllI[0] = 27 ^ 15;
        lIIlIlllIllI[1] = "  ".length();
    }

    private static boolean llIIllIllIIIIl(int i) {
        return i == 0;
    }

    private static boolean llIIllIllIIIII(Object obj) {
        return obj == null;
    }
}
