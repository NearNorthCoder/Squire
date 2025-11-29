package a.n.q.u.l.p000.e.p001.e.s.a.b.r.i.s.u.t.r.c.f;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.minigames.SquireBlastFurnace;
import gg.squire.minigames.SquireBlastFurnaceConfig;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import net.runelite.api.widgets.WidgetItem;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.WidgetItemOverlay;
import net.runelite.client.ui.overlay.components.TextComponent;
@Singleton
/* renamed from: a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.L  reason: invalid package */
/* loaded from: 06deb524-30dc-422a-b422-0bec548b1d10.jar:a/n/q/u/l/-/e/-/e/s/a/b/r/i/s/u/t/r/c/f/L.class */
public class L extends WidgetItemOverlay {
    @Inject
    private /* synthetic */ SquireBlastFurnaceConfig i;
    @Inject
    private /* synthetic */ SquireBlastFurnace bS;
    @Inject
    private /* synthetic */ C0014o j;
    private static /* synthetic */ int[] lIIlIlllllII;

    static {
        llIIllIllIlIll();
    }

    L() {
        showOnInventory();
    }

    private static void llIIllIllIlIll() {
        lIIlIlllllII = new int[6];
        lIIlIlllllII[0] = (-11523) & 12286;
        lIIlIlllllII[1] = (-4357) & 16375;
        lIIlIlllllII[2] = (-((-161) & 4837)) & (-2305) & 32607;
        lIIlIlllllII[3] = (-8198) & 32677;
        lIIlIlllllII[4] = " ".length();
        lIIlIlllllII[5] = (70 ^ 45) ^ (243 ^ 144);
    }

    private static boolean llIIllIllIllII(int i, int i2) {
        return i != i2;
    }

    public void renderItemOverlay(Graphics2D graphics2D, int i, WidgetItem widgetItem) {
        if (llIIllIllIllII(i, lIIlIlllllII[0]) && llIIllIllIllII(i, lIIlIlllllII[1]) && llIIllIllIllII(i, lIIlIlllllII[2]) && llIIllIllIllII(i, lIIlIlllllII[3])) {
            return;
        }
        Color color = ColorScheme.BRAND_ORANGE;
        Rectangle canvasBounds = widgetItem.getCanvasBounds();
        TextComponent textComponent = new TextComponent();
        textComponent.setPosition(new Point(canvasBounds.x - lIIlIlllllII[4], canvasBounds.y + lIIlIlllllII[5]));
        textComponent.setColor(color);
        textComponent.setText(Integer.toString(this.j.k().v()));
        textComponent.render(graphics2D);
        "".length();
    }
}
