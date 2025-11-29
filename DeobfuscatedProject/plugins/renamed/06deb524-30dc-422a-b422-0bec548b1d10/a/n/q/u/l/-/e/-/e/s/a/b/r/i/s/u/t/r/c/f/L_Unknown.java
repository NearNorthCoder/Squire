/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  net.runelite.api.widgets.WidgetItem
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.WidgetItemOverlay
 *  net.runelite.client.ui.overlay.components.TextComponent
 */
package a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f;

import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.o_Unknown;
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
public class L_Unknown
extends WidgetItemOverlay {
    @Inject
    private /* synthetic */ SquireBlastFurnaceConfig i;
    @Inject
    private /* synthetic */ SquireBlastFurnace bS;
    @Inject
    private /* synthetic */ o j;
    private static /* synthetic */ int[] lIIlIlllllII;

    static {
        L.llIIllIllIlIll();
    }

    L() {
        this.showOnInventory();
    }

    private static void llIIllIllIlIll() {
        lIIlIlllllII = new int[6];
        L.lIIlIlllllII[0] = 0xFFFFD2FD & 0x2FFE;
        L.lIIlIlllllII[1] = 0xFFFFEEFB & 0x3FF7;
        L.lIIlIlllllII[2] = -(0xFFFFFF5F & 0x12E5) & (0xFFFFF6FF & 0x7F5F);
        L.lIIlIlllllII[3] = 0xFFFFDFFA & 0x7FA5;
        L.lIIlIlllllII[4] = 1;
        L.lIIlIlllllII[5] = 0x46 ^ 0x2D ^ (0xF3 ^ 0x90);
    }

    private static boolean llIIllIllIllII(int n2, int n3) {
        return n2 != n3;
    }

    public void renderItemOverlay(Graphics2D graphics2D, int n2, WidgetItem widgetItem) {
        if (L.llIIllIllIllII(n2, lIIlIlllllII[0]) && L.llIIllIllIllII(n2, lIIlIlllllII[1]) && L.llIIllIllIllII(n2, lIIlIlllllII[2]) && L.llIIllIllIllII(n2, lIIlIlllllII[3])) {
            return;
        }
        Color color = ColorScheme.BRAND_ORANGE;
        Rectangle rectangle = widgetItem.getCanvasBounds();
        TextComponent textComponent = new TextComponent();
        textComponent.setPosition(new Point(rectangle.x - lIIlIlllllII[4], rectangle.y + lIIlIlllllII[5]));
        textComponent.setColor(color);
        textComponent.setText(Integer.toString(this.j.k().v()));
        textComponent.render(graphics2D);
        0;
    }
}

