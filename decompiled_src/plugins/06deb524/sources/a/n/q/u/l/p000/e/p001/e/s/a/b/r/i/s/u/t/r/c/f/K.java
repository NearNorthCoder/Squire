package a.n.q.u.l.p000.e.p001.e.s.a.b.r.i.s.u.t.r.c.f;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.minigames.SquireBlastFurnaceConfig;
import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.Arrays;
import net.runelite.api.Client;
import net.runelite.api.widgets.WidgetItem;
import net.runelite.client.game.ItemManager;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.WidgetItemOverlay;
import net.runelite.client.ui.overlay.components.TextComponent;
@Singleton
/* renamed from: a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.K  reason: invalid package */
/* loaded from: 06deb524-30dc-422a-b422-0bec548b1d10.jar:a/n/q/u/l/-/e/-/e/s/a/b/r/i/s/u/t/r/c/f/K.class */
public class K extends WidgetItemOverlay {
    @Inject
    private /* synthetic */ ItemManager bR;
    @Inject
    private /* synthetic */ SquireBlastFurnaceConfig i;
    @Inject
    /* synthetic */ Client g;
    private static /* synthetic */ int[] lIIlllIIlIlI;
    @Inject
    private /* synthetic */ D aG;

    private static boolean llIlIIIIIlIIIl(int i, int i2) {
        return i == i2;
    }

    private static boolean llIlIIIIIlIIII(int i) {
        return i != 0;
    }

    private static boolean llIlIIIIIIlllI(Object obj) {
        return obj == null;
    }

    static {
        llIlIIIIIIllIl();
    }

    K() {
        showOnBank();
    }

    private static boolean llIlIIIIIIllll(int i) {
        return i == 0;
    }

    public void renderItemOverlay(Graphics2D graphics2D, int i, WidgetItem widgetItem) {
        w Y = this.aG.Y();
        if (llIlIIIIIIlllI(Y) || llIlIIIIIIllll(Y instanceof C0020u ? 1 : 0) || llIlIIIIIlIIII(Arrays.stream(((C0020u) Y).I()).noneMatch(i2 -> {
            if (llIlIIIIIlIIIl(i2, i)) {
                ?? r0 = lIIlllIIlIlI[1];
                "".length();
                return (-"   ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIIlllIIlIlI[2];
        }) ? 1 : 0)) {
            return;
        }
        Color color = ColorScheme.BRAND_ORANGE;
        Rectangle canvasBounds = widgetItem.getCanvasBounds();
        graphics2D.setColor(color);
        graphics2D.draw(canvasBounds);
        TextComponent textComponent = new TextComponent();
        textComponent.setColor(color);
        textComponent.setText(Y.J());
        FontMetrics fontMetrics = graphics2D.getFontMetrics();
        textComponent.setPosition(new Point((canvasBounds.x + (canvasBounds.width / lIIlllIIlIlI[0])) - (fontMetrics.stringWidth(Y.J()) / lIIlllIIlIlI[0]), canvasBounds.y - (fontMetrics.getHeight() / lIIlllIIlIlI[0])));
        textComponent.render(graphics2D);
        "".length();
    }

    private static void llIlIIIIIIllIl() {
        lIIlllIIlIlI = new int[3];
        lIIlllIIlIlI[0] = "  ".length();
        lIIlllIIlIlI[1] = " ".length();
        lIIlllIIlIlI[2] = (97 ^ 117) & ((13 ^ 25) ^ (-1));
    }
}
