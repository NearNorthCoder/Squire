/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  net.runelite.api.Client
 *  net.runelite.api.widgets.WidgetItem
 *  net.runelite.client.game.ItemManager
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.WidgetItemOverlay
 *  net.runelite.client.ui.overlay.components.TextComponent
 */
package a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f;

import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.D;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.u;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.w;
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
public class K
extends WidgetItemOverlay {
    @Inject
    private /* synthetic */ ItemManager bR;
    @Inject
    private /* synthetic */ SquireBlastFurnaceConfig i;
    @Inject
    /* synthetic */ Client g;
    private static /* synthetic */ int[] lIIlllIIlIlI;
    @Inject
    private /* synthetic */ D aG;

    private static boolean llIlIIIIIlIIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static /* synthetic */ boolean a(int n2, int n3) {
        boolean bl;
        if (K.llIlIIIIIlIIIl(n3, n2)) {
            bl = lIIlllIIlIlI[1];
            0;
            if (-3 >= 0) {
                return false;
            }
        } else {
            bl = lIIlllIIlIlI[2];
        }
        return bl;
    }

    private static boolean llIlIIIIIlIIII(int n2) {
        return n2 != 0;
    }

    private static boolean llIlIIIIIIlllI(Object object) {
        return object == null;
    }

    static {
        K.llIlIIIIIIllIl();
    }

    K() {
        this.showOnBank();
    }

    private static boolean llIlIIIIIIllll(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public void renderItemOverlay(Graphics2D graphics2D, int n2, WidgetItem widgetItem) {
        void var2;
        void var1;
        w w2 = this.aG.Y();
        if (K.llIlIIIIIIlllI(w2)) {
            return;
        }
        if (K.llIlIIIIIIllll(var1 instanceof u)) {
            return;
        }
        if (K.llIlIIIIIlIIII(Arrays.stream(((u)var1).I()).noneMatch(arg_0 -> K.a((int)var2, arg_0)) ? 1 : 0)) {
            return;
        }
        Color color = ColorScheme.BRAND_ORANGE;
        Rectangle rectangle = widgetItem.getCanvasBounds();
        graphics2D.setColor(color);
        graphics2D.draw(rectangle);
        TextComponent textComponent = new TextComponent();
        textComponent.setColor(color);
        textComponent.setText(w2.J());
        FontMetrics fontMetrics = graphics2D.getFontMetrics();
        int n3 = fontMetrics.stringWidth(w2.J());
        int n4 = fontMetrics.getHeight();
        textComponent.setPosition(new Point(rectangle.x + rectangle.width / lIIlllIIlIlI[0] - n3 / lIIlllIIlIlI[0], rectangle.y - n4 / lIIlllIIlIlI[0]));
        textComponent.render(graphics2D);
        0;
    }

    private static void llIlIIIIIIllIl() {
        lIIlllIIlIlI = new int[3];
        K.lIIlllIIlIlI[0] = 2;
        K.lIIlllIIlIlI[1] = 1;
        K.lIIlllIIlIlI[2] = (0x61 ^ 0x75) & ~(0xD ^ 0x19);
    }
}

