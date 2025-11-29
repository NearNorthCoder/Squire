/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.client.ui.overlay.OverlayLayer
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.OverlayPriority
 *  net.runelite.client.ui.overlay.OverlayUtil
 */
package gg.squire.autotoa.tasks;

import gg.squire.autotoa.TOAConfig;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.Stroke;
import java.util.Iterator;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.OverlayUtil;
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.AutotoaManager;

public class NHelper
extends AutotoaTaskBase {
    private final  Client bJ;
    private final  j bK;

    public Dimension render(Graphics2D graphics2D) {
        this.b(graphics2D);
        return null;
    }

    private static boolean lIlIIIIIIllIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIIIIIllIlI(Object object) {
        return object == null;
    }

    @Inject
    protected NHelper(TOAConfig tOAConfig, Client client, j j2) {
        super(tOAConfig);
        this.bJ = client;
        this.bK = j2;
        this.setPriority(OverlayPriority.HIGH);
        this.setPosition(OverlayPosition.DYNAMIC);
        this.setLayer(OverlayLayer.UNDER_WIDGETS);
    }

    /*
     * WARNING - void declaration
     */
    private void b(Graphics2D graphics2D) {
        Iterator<NPC> var1 = this.bK.B().iterator();
        while (N.lIlIIIIIIllIIl(var1.hasNext() ? 1 : 0)) {
            void var2;
            NPC var3 = var1.next();
            Shape var4 = var3.getConvexHull();
            if (N.lIlIIIIIIllIlI(var4)) {

                if ((0x3F ^ 0x3B) > 3) continue;
                return;
            }
            OverlayUtil.renderPolygon((Graphics2D)var2, (Shape)var4, (Color)Color.BLUE, (Stroke)new BasicStroke(1.0f));

            if (((65 + 110 - 93 + 70 ^ 31 + 92 - 23 + 77) & (153 + 140 - 134 + 80 ^ 17 + 63 - 66 + 184 ^ -1)) == 0) continue;
            return;
        }
    }
}

