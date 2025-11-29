/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  net.runelite.api.widgets.WidgetItem
 *  net.runelite.client.ui.overlay.WidgetItemOverlay
 */
package m.u.a.-.e.s.q.t.i.r;

import gg.squire.mta.SquireMTA;
import java.awt.Graphics2D;
import javax.inject.Inject;
import m.u.a.-.e.s.q.t.i.r.b;
import net.runelite.api.widgets.WidgetItem;
import net.runelite.client.ui.overlay.WidgetItemOverlay;

public class p_Unknown
extends WidgetItemOverlay {
    private static /* synthetic */ int[] lllIllIIlIIl;
    private final /* synthetic */ SquireMTA aq;

    /*
     * WARNING - void declaration
     */
    public void renderItemOverlay(Graphics2D graphics2D, int n2, WidgetItem widgetItem) {
        void var2;
        b[] bArray = this.aq.b();
        int n3 = bArray.length;
        int var7 = lllIllIIlIIl[0];
        while (p.lIIIllIIlllIllI(var7, (int)var2)) {
            void var6;
            void var1 = var6[var7];
            if (p.lIIIllIIlllIlll(var1.c() ? 1 : 0)) {
                void var3;
                void var4;
                void var5;
                var1.renderItemOverlay((Graphics2D)var5, (int)var4, (WidgetItem)var3);
            }
            ++var7;
            0;
            if (3 > 0) continue;
            return;
        }
    }

    private static boolean lIIIllIIlllIllI(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public p(SquireMTA squireMTA) {
        this.aq = squireMTA;
        this.showOnInventory();
    }

    private static boolean lIIIllIIlllIlll(int n2) {
        return n2 != 0;
    }

    private static void lIIIllIIlllIlIl() {
        lllIllIIlIIl = new int[1];
        p.lllIllIIlIIl[0] = (0x7A ^ 0x23) & ~(0x6F ^ 0x36);
    }

    static {
        p.lIIIllIIlllIlIl();
    }
}

