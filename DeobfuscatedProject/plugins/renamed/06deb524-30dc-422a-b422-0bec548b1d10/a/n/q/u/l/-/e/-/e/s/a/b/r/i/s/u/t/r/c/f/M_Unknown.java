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
 *  net.runelite.client.ui.overlay.components.ImageComponent
 *  net.runelite.client.ui.overlay.components.TextComponent
 */
package a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f;

import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.D_Unknown;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.v_Unknown;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.w;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.minigames.SquireBlastFurnaceConfig;
import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.util.Arrays;
import net.runelite.api.Client;
import net.runelite.api.widgets.WidgetItem;
import net.runelite.client.game.ItemManager;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.WidgetItemOverlay;
import net.runelite.client.ui.overlay.components.ImageComponent;
import net.runelite.client.ui.overlay.components.TextComponent;

@Singleton
public class M_Unknown
extends WidgetItemOverlay {
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
        M.lIIllIIIIllI[0] = 2;
        M.lIIllIIIIllI[1] = 1;
        M.lIIllIIIIllI[2] = (53 + 137 - 174 + 209 ^ 76 + 127 - 88 + 63) & (0x20 ^ 0x17 ^ (0x69 ^ 0xD) ^ -1) & (2 & (2 ^ -1) ^ -1);
    }

    private static boolean llIIllIlllllll(Object object) {
        return object != null;
    }

    private static boolean llIIlllIIIIIII(int n2) {
        return n2 != 0;
    }

    private static boolean llIIllIlllllIl(Object object) {
        return object == null;
    }

    private static boolean llIIlllIIIIIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIIllIllllllI(int n2) {
        return n2 == 0;
    }

    private static /* synthetic */ boolean a(int n2, int n3) {
        boolean bl;
        if (M.llIIlllIIIIIIl(n3, n2)) {
            bl = lIIllIIIIllI[1];
            0;
            if (-1 > 1) {
                return ((0x3C ^ 0x5F ^ (0xDB ^ 0xBE)) & (0xF1 ^ 0xA8 ^ (0x4A ^ 0x15) ^ -1)) != 0;
            }
        } else {
            bl = lIIllIIIIllI[2];
        }
        return bl;
    }

    M() {
        this.showOnInventory();
    }

    static {
        M.llIIllIlllllII();
        bW = lIIllIIIIllI[1];
    }

    /*
     * WARNING - void declaration
     */
    public void renderItemOverlay(Graphics2D graphics2D, int n2, WidgetItem widgetItem) {
        void var2;
        void var1;
        w w2 = this.aG.Y();
        int n3 = n2;
        if (M.llIIllIlllllIl(w2)) {
            return;
        }
        if (M.llIIllIllllllI(var1 instanceof v)) {
            return;
        }
        if (M.llIIllIlllllll(bX)) {
            WidgetItem var3 = bX;
            int lllllllllllllllIllllIIIIIIIIlIII = var3.getWidget().getItemId();
            0;
            if (3 > (0x2A ^ 0x2E)) {
                return;
            }
        } else if (M.llIIlllIIIIIII(Arrays.stream(((v)var1).I()).noneMatch(arg_0 -> M.a((int)var2, arg_0)) ? 1 : 0)) {
            return;
        }
        bX = widgetItem;
        Color color = ColorScheme.BRAND_ORANGE;
        Rectangle rectangle = widgetItem.getCanvasBounds();
        BufferedImage bufferedImage = this.bR.getItemOutline(n2, widgetItem.getQuantity(), color);
        ImageComponent imageComponent = new ImageComponent(bufferedImage);
        imageComponent.setPreferredLocation(new Point(rectangle.x, rectangle.y));
        imageComponent.render(graphics2D);
        0;
        TextComponent textComponent = new TextComponent();
        textComponent.setColor(color);
        textComponent.setText(w2.J());
        FontMetrics fontMetrics = graphics2D.getFontMetrics();
        int n4 = fontMetrics.stringWidth(w2.J());
        int n5 = fontMetrics.getHeight();
        textComponent.setPosition(new Point(rectangle.x + rectangle.width / lIIllIIIIllI[0] - n4 / lIIllIIIIllI[0], rectangle.y - n5 / lIIllIIIIllI[0]));
        textComponent.render(graphics2D);
        0;
    }
}

