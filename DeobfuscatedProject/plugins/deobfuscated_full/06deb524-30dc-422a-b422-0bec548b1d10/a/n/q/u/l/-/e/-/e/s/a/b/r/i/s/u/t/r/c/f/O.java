/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Perspective
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.components.TextComponent
 */
package a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f;

import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.D;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.w;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.y;
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
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.TextComponent;

public class O
extends Overlay {
    @Inject
    private /* synthetic */ Client g;
    @Inject
    private /* synthetic */ D aG;
    private static /* synthetic */ int[] lIIlIlllIllI;
    @Inject
    private /* synthetic */ SquireBlastFurnaceConfig i;

    static {
        O.llIIllIlIlllll();
    }

    /*
     * WARNING - void declaration
     */
    public Dimension render(Graphics2D graphics2D) {
        void var3_3;
        void var4_4;
        O var3;
        void var2;
        w w2 = this.aG.Y();
        if (O.llIIllIllIIIII(w2)) {
            return null;
        }
        if (O.llIIllIllIIIIl(var2 instanceof y)) {
            return null;
        }
        Color lllllllllllllllIllllIIIIllllIlIl = ColorScheme.PROGRESS_COMPLETE_COLOR;
        LocalPoint var1 = LocalPoint.fromWorld((Client)var3.g, (WorldPoint)((y)var2).L());
        if (O.llIIllIllIIIII(var1)) {
            return null;
        }
        Polygon polygon = Perspective.getCanvasTilePoly((Client)this.g, (LocalPoint)var4_4);
        graphics2D.setColor((Color)var3_3);
        graphics2D.draw(polygon);
        graphics2D.setColor(new Color(var3_3.getRed(), var3_3.getBlue(), var3_3.getGreen(), lIIlIlllIllI[0]));
        graphics2D.fill(polygon);
        TextComponent textComponent = new TextComponent();
        Rectangle rectangle = polygon.getBounds();
        FontMetrics fontMetrics = graphics2D.getFontMetrics();
        int n2 = fontMetrics.stringWidth(w2.J());
        int n3 = fontMetrics.getHeight();
        textComponent.setPosition(new Point(rectangle.x + rectangle.width / lIIlIlllIllI[1] - n2 / lIIlIlllIllI[1], rectangle.y + rectangle.height));
        textComponent.setColor((Color)var3_3);
        textComponent.setText(w2.J());
        textComponent.render(graphics2D);
        0;
        return null;
    }

    O() {
        this.setPosition(OverlayPosition.DYNAMIC);
    }

    private static void llIIllIlIlllll() {
        lIIlIlllIllI = new int[2];
        O.lIIlIlllIllI[0] = 0x1B ^ 0xF;
        O.lIIlIlllIllI[1] = 2;
    }

    private static boolean llIIllIllIIIIl(int n2) {
        return n2 == 0;
    }

    private static boolean llIIllIllIIIII(Object object) {
        return object == null;
    }
}

