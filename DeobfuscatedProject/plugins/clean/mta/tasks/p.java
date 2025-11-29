/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  net.runelite.api.widgets.WidgetItem
 *  net.runelite.client.ui.overlay.WidgetItemOverlay
 */
package gg.squire.mta.tasks;

import gg.squire.mta.SquireMTA;
import java.awt.Graphics2D;
import javax.inject.Inject;
import gg.squire.mta.tasks.MtaTaskBase;
import net.runelite.api.widgets.WidgetItem;
import net.runelite.client.ui.overlay.WidgetItemOverlay;

public class p
extends WidgetItemOverlay {
    
    private final  SquireMTA aq;

    /*
     * WARNING - void declaration
     */
    public void renderItemOverlay(Graphics2D graphics2D, int n2, WidgetItem widgetItem) {
        void var1;
        b[] bArray = this.aq.b();
        int n3 = bArray.length;
        int var2 = lllIllIIlIIl[0];
        while (p.lIIIllIIlllIllI(var2, (int)var1)) {
            void var3;
            void var4 = var3[var2];
            if (p.lIIIllIIlllIlll(var4.c() ? 1 : 0)) {
                void var5;
                void var6;
                void var7;
                var4.renderItemOverlay((Graphics2D)var7, (int)var6, (WidgetItem)var5);
            }
            ++var2;

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

    static {
        p.lIIIllIIlllIlIl();
    }
}

