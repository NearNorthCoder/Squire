/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  net.runelite.client.ui.FontManager
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayLayer
 *  net.runelite.client.ui.overlay.OverlayPosition
 */
package gg.squire.mta.tasks;

import gg.squire.mta.SquireMTA;
import java.awt.Dimension;
import java.awt.Graphics2D;
import javax.inject.Inject;
import gg.squire.mta.tasks.MtaTaskBase;
import net.runelite.client.ui.FontManager;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;

public class QHelper
extends Overlay {
    private final  SquireMTA ar;

    private static boolean var2(int n2, int n3) {
        return n2 < n3;
    }

    static {
        q.var3();
    }

    private static boolean var4(int n2) {
        return n2 != 0;
    }

    private static void var3() {
        var1 = new int[1];
        q.var1[0] = (0xE7 ^ 0xA8 ^ (0x7E ^ 0x75)) & (0x5B ^ 0x70 ^ (0xE4 ^ 0x8B) ^ -1);
    }

    /*
     * WARNING - void declaration
     */
    public Dimension render(Graphics2D graphics2D) {
        void var5;
        b[] bArray = this.ar.b();
        int n2 = bArray.length;
        int var6 = var1[0];
        while (q.var2(var6, (int)var5)) {
            void var7;
            void var8 = var7[var6];
            if (q.var4(var8.c() ? 1 : 0)) {
                void var9;
                var9.setFont(FontManager.getRunescapeFont());
                var8.a((Graphics2D)var9);
            }
            ++var6;
            0;
            if ((0xC4 ^ 0x9E ^ (0x21 ^ 0x7F)) != 2) continue;
            return null;
        }
        return null;
    }

    @Inject
    public QHelper(SquireMTA squireMTA) {
        this.ar = squireMTA;
        this.setPosition(OverlayPosition.DYNAMIC);
        this.setLayer(OverlayLayer.ABOVE_SCENE);
    }
}

