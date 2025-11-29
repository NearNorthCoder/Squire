/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  javax.inject.Singleton
 *  net.runelite.api.Client
 *  net.runelite.api.widgets.Widget
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayLayer
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.components.TextComponent
 */
package a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f;

import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.D_Unknown;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.w;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.z_Unknown;
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
public class P_Unknown
extends Overlay {
    @Inject
    private /* synthetic */ SquireBlastFurnaceConfig i;
    @Inject
    private /* synthetic */ D aG;
    private static /* synthetic */ int[] lIIllIIlIllI;
    @Inject
    private /* synthetic */ Client g;

    private static void llIIlllIlIIllI() {
        lIIllIIlIllI = new int[2];
        P.lIIllIIlIllI[0] = 92 + 178 - 103 + 42 ^ 31 + 14 - -67 + 85;
        P.lIIllIIlIllI[1] = 2;
    }

    /*
     * WARNING - void declaration
     */
    public Dimension render(Graphics2D graphics2D) {
        void var3_3;
        P var1;
        void var3;
        w w2 = this.aG.Y();
        if (P.llIIlllIlIIlll(w2)) {
            return null;
        }
        if (P.llIIlllIlIlIII(var3 instanceof z)) {
            return null;
        }
        Widget var2 = var1.g.getWidget(((z)var3).M());
        if (P.llIIlllIlIIlll(var2)) {
            return null;
        }
        Color color = ColorScheme.BRAND_BLUE;
        Rectangle rectangle = var3_3.getBounds();
        graphics2D.setColor(color);
        graphics2D.draw(rectangle);
        graphics2D.setColor(new Color(color.getRed(), color.getBlue(), color.getGreen(), lIIllIIlIllI[0]));
        graphics2D.fill(rectangle);
        TextComponent textComponent = new TextComponent();
        textComponent.setColor(Color.WHITE);
        textComponent.setText(w2.J());
        FontMetrics fontMetrics = graphics2D.getFontMetrics();
        int n2 = fontMetrics.stringWidth(w2.J());
        int n3 = fontMetrics.getHeight();
        textComponent.setPosition(new Point(rectangle.x + rectangle.width / lIIllIIlIllI[1] - n2 / lIIllIIlIllI[1], rectangle.y - n3 / lIIllIIlIllI[1]));
        textComponent.render(graphics2D);
        0;
        return null;
    }

    private static boolean llIIlllIlIIlll(Object object) {
        return object == null;
    }

    static {
        P.llIIlllIlIIllI();
    }

    P() {
        this.setPosition(OverlayPosition.DYNAMIC);
        this.setLayer(OverlayLayer.ALWAYS_ON_TOP);
    }

    private static boolean llIIlllIlIlIII(int n2) {
        return n2 == 0;
    }
}

