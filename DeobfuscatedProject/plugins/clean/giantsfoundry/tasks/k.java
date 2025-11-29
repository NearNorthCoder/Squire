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

public class k
extends Overlay {
    private final  a W;
    private final  SquireGiantsFoundry X;

    @Inject
    k(a a2, SquireGiantsFoundry squireGiantsFoundry) {
        this.W = a2;
        this.X = squireGiantsFoundry;
    }

    static {
        k.lIIIIIlllIIIIIl();
    }

    private static boolean lIIIIIlllIIIIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIIIlllIIIIll(Object object) {
        return object == null;
    }

    private static boolean lIIIIIlllIIIlII(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    public Dimension render(Graphics2D graphics2D) {
        Shape var1;
        Color var2;
        Color color;
        k var3;
        if (k.lIIIIIlllIIIIlI(this.X.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        TileObject var4 = var3.W.j();
        if (k.lIIIIIlllIIIIll(var4)) {
            return null;
        }
        if (k.lIIIIIlllIIIIlI(var3.W.n() ? 1 : 0)) {
            color = ColorScheme.PROGRESS_COMPLETE_COLOR;

            if (2 < ((21 + 201 - 195 + 189 ^ 145 + 21 - 56 + 74) & (154 + 40 - 193 + 204 ^ 117 + 28 - 43 + 71 ^ -1))) {
                return null;
            }
        } else {
            color = var2 = ColorScheme.PROGRESS_ERROR_COLOR;
        }
        if (k.lIIIIIlllIIIlII(var1 = var4.getClickbox())) {
            void var5;
            var5.setColor(var2);
            var5.draw(var1);
            var5.setColor(new Color(var2.getRed(), var2.getGreen(), var2.getBlue(), llIlIllIIIll[0]));
            var5.fill(var1);
        }
        return null;
    }
}

