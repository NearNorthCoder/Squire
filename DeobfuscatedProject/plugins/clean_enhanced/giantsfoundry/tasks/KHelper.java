/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  net.runelite.api.TileObject
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.Overlay
 */
package gg.squire.giantsfoundry.tasks;

import gg.squire.giantsfoundry.tasks.GiantsfoundryManager;
import gg.squire.giantsfoundry.SquireGiantsFoundry;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Shape;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.Overlay;

public class KHelper
extends Overlay {
    private final  a W;
    private final  SquireGiantsFoundry X;

    @Inject
    KHelper(a a2, SquireGiantsFoundry squireGiantsFoundry) {
        this.W = a2;
        this.X = squireGiantsFoundry;
    }

    static {
        k.var2();
    }

    private static void var2() {
        var1 = new int[1];
        k.var1[0] = 0x93 ^ 0xB4 ^ (0x7A ^ 0x49);
    }

    private static boolean var3(int n2) {
        return n2 != 0;
    }

    private static boolean var4(Object object) {
        return object == null;
    }

    private static boolean var5(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    public Dimension render(Graphics2D graphics2D) {
        Shape var6;
        Color var7;
        Color color;
        k var8;
        if (k.var3(this.X.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        TileObject var9 = var8.W.j();
        if (k.var4(var9)) {
            return null;
        }
        if (k.var3(var8.W.n() ? 1 : 0)) {
            color = ColorScheme.PROGRESS_COMPLETE_COLOR;
            0;
            if (2 < ((21 + 201 - 195 + 189 ^ 145 + 21 - 56 + 74) & (154 + 40 - 193 + 204 ^ 117 + 28 - 43 + 71 ^ -1))) {
                return null;
            }
        } else {
            color = var7 = ColorScheme.PROGRESS_ERROR_COLOR;
        }
        if (k.var5(var6 = var9.getClickbox())) {
            void var10;
            var10.setColor(var7);
            var10.draw(var6);
            var10.setColor(new Color(var7.getRed(), var7.getGreen(), var7.getBlue(), var1[0]));
            var10.fill(var6);
        }
        return null;
    }
}

