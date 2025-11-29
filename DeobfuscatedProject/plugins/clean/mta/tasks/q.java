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

public class q
extends Overlay {
    private final  SquireMTA ar;

    private static boolean lIIIlIlllllllII(int n2, int n3) {
        return n2 < n3;
    }

    static {
        q.lIIIlIllllllIll();
    }

    private static boolean lIIIlIlllllllIl(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public Dimension render(Graphics2D graphics2D) {
        void var1;
        b[] bArray = this.ar.b();
        int n2 = bArray.length;
        int var2 = lllIlIlIIlII[0];
        while (q.lIIIlIlllllllII(var2, (int)var1)) {
            void var3;
            void var4 = var3[var2];
            if (q.lIIIlIlllllllIl(var4.c() ? 1 : 0)) {
                void var5;
                var5.setFont(FontManager.getRunescapeFont());
                var4.a((Graphics2D)var5);
            }
            ++var2;

            if ((0xC4 ^ 0x9E ^ (0x21 ^ 0x7F)) != 2) continue;
            return null;
        }
        return null;
    }

    @Inject
    public q(SquireMTA squireMTA) {
        this.ar = squireMTA;
        this.setPosition(OverlayPosition.DYNAMIC);
        this.setLayer(OverlayLayer.ABOVE_SCENE);
    }
}

