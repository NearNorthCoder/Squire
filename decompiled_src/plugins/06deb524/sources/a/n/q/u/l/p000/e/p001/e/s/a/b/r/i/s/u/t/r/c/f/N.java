package a.n.q.u.l.p000.e.p001.e.s.a.b.r.i.s.u.t.r.c.f;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.minigames.SquireBlastFurnaceConfig;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;
import net.runelite.api.GameObject;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.TextComponent;
@Singleton
/* renamed from: a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.N  reason: invalid package */
/* loaded from: 06deb524-30dc-422a-b422-0bec548b1d10.jar:a/n/q/u/l/-/e/-/e/s/a/b/r/i/s/u/t/r/c/f/N.class */
public class N extends Overlay {
    @Inject
    private /* synthetic */ E k;
    @Inject
    private /* synthetic */ SquireBlastFurnaceConfig i;
    @Inject
    private /* synthetic */ D aG;
    private static /* synthetic */ int[] lIIlllIIllII;

    N() {
        setPosition(OverlayPosition.DYNAMIC);
    }

    public Dimension render(Graphics2D graphics2D) {
        w Y = this.aG.Y();
        if (llIlIIIIIlIIll(Y) || llIlIIIIIlIlII(Y instanceof x ? 1 : 0)) {
            return null;
        }
        Color color = Color.BLUE;
        GameObject g = this.k.g(((x) Y).K());
        Shape clickbox = g.getClickbox();
        if (llIlIIIIIlIIll(clickbox)) {
            return null;
        }
        graphics2D.setColor(color);
        graphics2D.draw(clickbox);
        graphics2D.setColor(new Color(color.getRed(), color.getBlue(), color.getGreen(), lIIlllIIllII[0]));
        graphics2D.fill(clickbox);
        TextComponent textComponent = new TextComponent();
        Rectangle bounds = g.getClickbox().getBounds();
        FontMetrics fontMetrics = graphics2D.getFontMetrics();
        int stringWidth = fontMetrics.stringWidth(Y.J());
        fontMetrics.getHeight();
        textComponent.setPosition(new Point((bounds.x + (bounds.width / lIIlllIIllII[1])) - (stringWidth / lIIlllIIllII[1]), bounds.y + bounds.height));
        textComponent.setColor(color);
        textComponent.setText(Y.J());
        textComponent.render(graphics2D);
        "".length();
        return null;
    }

    private static void llIlIIIIIlIIlI() {
        lIIlllIIllII = new int[2];
        lIIlllIIllII[0] = (100 ^ 73) ^ (12 ^ 53);
        lIIlllIIllII[1] = "  ".length();
    }

    private static boolean llIlIIIIIlIIll(Object obj) {
        return obj == null;
    }

    private static boolean llIlIIIIIlIlII(int i) {
        return i == 0;
    }

    static {
        llIlIIIIIlIIlI();
    }
}
