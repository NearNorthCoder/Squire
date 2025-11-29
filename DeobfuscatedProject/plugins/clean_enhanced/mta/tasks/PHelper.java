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

public class PHelper
extends WidgetItemOverlay {
    
    private final  SquireMTA aq;

    /*
     * WARNING - void declaration
     */
    public void renderItemOverlay(Graphics2D graphics2D, int n2, WidgetItem widgetItem) {
        void var2;
        b[] bArray = this.aq.b();
        int n3 = bArray.length;
        int var3 = var1[0];
        while (p.var4(var3, (int)var2)) {
            void var5;
            void var6 = var5[var3];
            if (p.var7(var6.c() ? 1 : 0)) {
                void var8;
                void var9;
                void var10;
                var6.renderItemOverlay((Graphics2D)var10, (int)var9, (WidgetItem)var8);
            }
            ++var3;
            0;
            if (3 > 0) continue;
            return;
        }
    }

    private static boolean var4(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public PHelper(SquireMTA squireMTA) {
        this.aq = squireMTA;
        this.showOnInventory();
    }

    private static boolean var7(int n2) {
        return n2 != 0;
    }

    private static void var11() {
        var1 = new int[1];
        p.var1[0] = (0x7A ^ 0x23) & ~(0x6F ^ 0x36);
    }

    static {
        p.var11();
    }
}

