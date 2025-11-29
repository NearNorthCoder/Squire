/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  net.runelite.api.GameObject
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.components.TextComponent
 */
package a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f;

import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.D;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.E;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.w;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.x;
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
public class N
extends Overlay {
    @Inject
    private /* synthetic */ E k;
    @Inject
    private /* synthetic */ SquireBlastFurnaceConfig i;
    @Inject
    private /* synthetic */ D aG;
    private static /* synthetic */ int[] lIIlllIIllII;

    N() {
        this.setPosition(OverlayPosition.DYNAMIC);
    }

    /*
     * WARNING - void declaration
     */
    public Dimension render(Graphics2D graphics2D) {
        void var4_4;
        void var5_5;
        void var3_3;
        N var1;
        void var2;
        w w2 = this.aG.Y();
        if (N.llIlIIIIIlIIll(w2)) {
            return null;
        }
        if (N.llIlIIIIIlIlII(var2 instanceof x)) {
            return null;
        }
        Color lllllllllllllllIlllIllIIIlIllIIl = Color.BLUE;
        GameObject var3 = var1.k.g(((x)var2).K());
        Shape var4 = var3.getClickbox();
        if (N.llIlIIIIIlIIll(var4)) {
            return null;
        }
        graphics2D.setColor((Color)var3_3);
        graphics2D.draw((Shape)var5_5);
        graphics2D.setColor(new Color(var3_3.getRed(), var3_3.getBlue(), var3_3.getGreen(), lIIlllIIllII[0]));
        graphics2D.fill((Shape)var5_5);
        TextComponent textComponent = new TextComponent();
        Rectangle rectangle = var4_4.getClickbox().getBounds();
        FontMetrics fontMetrics = graphics2D.getFontMetrics();
        int n2 = fontMetrics.stringWidth(w2.J());
        int n3 = fontMetrics.getHeight();
        textComponent.setPosition(new Point(rectangle.x + rectangle.width / lIIlllIIllII[1] - n2 / lIIlllIIllII[1], rectangle.y + rectangle.height));
        textComponent.setColor((Color)var3_3);
        textComponent.setText(w2.J());
        textComponent.render(graphics2D);
        0;
        return null;
    }

    private static void llIlIIIIIlIIlI() {
        lIIlllIIllII = new int[2];
        N.lIIlllIIllII[0] = 0x64 ^ 0x49 ^ (0xC ^ 0x35);
        N.lIIlllIIllII[1] = 2;
    }

    private static boolean llIlIIIIIlIIll(Object object) {
        return object == null;
    }

    private static boolean llIlIIIIIlIlII(int n2) {
        return n2 == 0;
    }

    static {
        N.llIlIIIIIlIIlI();
    }
}

