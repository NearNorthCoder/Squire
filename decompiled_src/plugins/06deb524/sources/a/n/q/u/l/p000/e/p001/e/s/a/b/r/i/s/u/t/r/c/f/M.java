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
import net.runelite.client.ui.overlay.components.ImageComponent;
import net.runelite.client.ui.overlay.components.TextComponent;
@Singleton
/* renamed from: a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.M  reason: invalid package */
/* loaded from: 06deb524-30dc-422a-b422-0bec548b1d10.jar:a/n/q/u/l/-/e/-/e/s/a/b/r/i/s/u/t/r/c/f/M.class */
public class M extends WidgetItemOverlay {
    @Inject
    private /* synthetic */ SquireBlastFurnaceConfig i;
    @Inject
    private /* synthetic */ D aG;
    public static /* synthetic */ boolean bW;
    @Inject
    private /* synthetic */ ItemManager bR;
    private static /* synthetic */ int[] lIIllIIIIllI;
    @Inject
    /* synthetic */ Client g;
    public static /* synthetic */ WidgetItem bX;

    private static void llIIllIlllllII() {
        lIIllIIIIllI = new int[3];
        lIIllIIIIllI[0] = "  ".length();
        lIIllIIIIllI[1] = " ".length();
        lIIllIIIIllI[2] = ((((53 + 137) - 174) + 209) ^ (((76 + 127) - 88) + 63)) & (((32 ^ 23) ^ (105 ^ 13)) ^ (-" ".length())) & (("  ".length() & ("  ".length() ^ (-" ".length()))) ^ (-" ".length()));
    }

    private static boolean llIIllIlllllll(Object obj) {
        return obj != null;
    }

    private static boolean llIIlllIIIIIII(int i) {
        return i != 0;
    }

    private static boolean llIIllIlllllIl(Object obj) {
        return obj == null;
    }

    private static boolean llIIlllIIIIIIl(int i, int i2) {
        return i == i2;
    }

    private static boolean llIIllIllllllI(int i) {
        return i == 0;
    }

    M() {
        showOnInventory();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    static {
        llIIllIlllllII();
        bW = lIIllIIIIllI[1];
    }

    public void renderItemOverlay(Graphics2D graphics2D, int i, WidgetItem widgetItem) {
        w Y = this.aG.Y();
        if (llIIllIlllllIl(Y) || llIIllIllllllI(Y instanceof v ? 1 : 0)) {
            return;
        }
        if (llIIllIlllllll(bX)) {
            widgetItem = bX;
            i = widgetItem.getWidget().getItemId();
            "".length();
            if ("   ".length() > (42 ^ 46)) {
                return;
            }
        } else if (llIIlllIIIIIII(Arrays.stream(((v) Y).I()).noneMatch(i2 -> {
            if (llIIlllIIIIIIl(i2, i)) {
                ?? r0 = lIIllIIIIllI[1];
                "".length();
                return (-" ".length()) > " ".length() ? ((60 ^ 95) ^ (219 ^ 190)) & (((241 ^ 168) ^ (74 ^ 21)) ^ (-" ".length())) : r0;
            }
            return lIIllIIIIllI[2];
        }) ? 1 : 0)) {
            return;
        }
        bX = widgetItem;
        Color color = ColorScheme.BRAND_ORANGE;
        Rectangle canvasBounds = widgetItem.getCanvasBounds();
        ImageComponent imageComponent = new ImageComponent(this.bR.getItemOutline(i, widgetItem.getQuantity(), color));
        imageComponent.setPreferredLocation(new Point(canvasBounds.x, canvasBounds.y));
        imageComponent.render(graphics2D);
        "".length();
        TextComponent textComponent = new TextComponent();
        textComponent.setColor(color);
        textComponent.setText(Y.J());
        FontMetrics fontMetrics = graphics2D.getFontMetrics();
        textComponent.setPosition(new Point((canvasBounds.x + (canvasBounds.width / lIIllIIIIllI[0])) - (fontMetrics.stringWidth(Y.J()) / lIIllIIIIllI[0]), canvasBounds.y - (fontMetrics.getHeight() / lIIllIIIIllI[0])));
        textComponent.render(graphics2D);
        "".length();
    }
}
