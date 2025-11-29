package a.n.q.u.l.p000.e.p001.e.s.a.b.r.i.s.u.t.r.c.f;

import gg.squire.minigames.SquireBlastFurnaceConfig;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.Client;
import net.runelite.api.widgets.Widget;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.TextComponent;
@Singleton
/* renamed from: a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.P  reason: invalid package */
/* loaded from: 06deb524-30dc-422a-b422-0bec548b1d10.jar:a/n/q/u/l/-/e/-/e/s/a/b/r/i/s/u/t/r/c/f/P.class */
public class P extends Overlay {
    @Inject
    private /* synthetic */ SquireBlastFurnaceConfig i;
    @Inject
    private /* synthetic */ D aG;
    private static /* synthetic */ int[] lIIllIIlIllI;
    @Inject
    private /* synthetic */ Client g;

    private static void llIIlllIlIIllI() {
        lIIllIIlIllI = new int[2];
        lIIllIIlIllI[0] = (((92 + 178) - 103) + 42) ^ (((31 + 14) - (-67)) + 85);
        lIIllIIlIllI[1] = "  ".length();
    }

    public Dimension render(Graphics2D graphics2D) {
        w Y = this.aG.Y();
        if (llIIlllIlIIlll(Y) || llIIlllIlIlIII(Y instanceof z ? 1 : 0)) {
            return null;
        }
        Widget widget = this.g.getWidget(((z) Y).M());
        if (llIIlllIlIIlll(widget)) {
            return null;
        }
        Color color = ColorScheme.BRAND_BLUE;
        Rectangle bounds = widget.getBounds();
        graphics2D.setColor(color);
        graphics2D.draw(bounds);
        graphics2D.setColor(new Color(color.getRed(), color.getBlue(), color.getGreen(), lIIllIIlIllI[0]));
        graphics2D.fill(bounds);
        TextComponent textComponent = new TextComponent();
        textComponent.setColor(Color.WHITE);
        textComponent.setText(Y.J());
        FontMetrics fontMetrics = graphics2D.getFontMetrics();
        textComponent.setPosition(new Point((bounds.x + (bounds.width / lIIllIIlIllI[1])) - (fontMetrics.stringWidth(Y.J()) / lIIllIIlIllI[1]), bounds.y - (fontMetrics.getHeight() / lIIllIIlIllI[1])));
        textComponent.render(graphics2D);
        "".length();
        return null;
    }

    private static boolean llIIlllIlIIlll(Object obj) {
        return obj == null;
    }

    static {
        llIIlllIlIIllI();
    }

    P() {
        setPosition(OverlayPosition.DYNAMIC);
        setLayer(OverlayLayer.ALWAYS_ON_TOP);
    }

    private static boolean llIIlllIlIlIII(int i) {
        return i == 0;
    }
}
