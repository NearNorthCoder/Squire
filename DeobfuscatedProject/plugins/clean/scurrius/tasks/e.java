/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Perspective
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayLayer
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.OverlayUtil
 *  net.unethicalite.client.Static
 */
package gg.squire.scurrius.tasks;

import com.google.inject.Inject;
import gg.squire.scurrius.SquireScurrius;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;
import java.util.Iterator;
import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.Perspective;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayUtil;
import net.unethicalite.client.Static;

public class e
extends Overlay {
    private final  SquireScurrius L;

    public Dimension render(Graphics2D graphics2D) {
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public void a(List<WorldPoint> list, Graphics2D graphics2D, Color color) {
        Iterator<WorldPoint> var1 = list.iterator();
        while (e.lIlIllIIIlIIlll(var1.hasNext() ? 1 : 0)) {
            void var2;
            void var3;
            WorldPoint var4 = var1.next();
            LocalPoint var5 = LocalPoint.fromWorld((Client)Static.getClient(), (WorldPoint)var4);
            if (e.lIlIllIIIlIlIII(var5)) {

                if (3 <= 3) continue;
                return;
            }
            Polygon var6 = Perspective.getCanvasTilePoly((Client)Static.getClient(), (LocalPoint)var5);
            OverlayUtil.renderPolygon((Graphics2D)var3, (Shape)var6, (Color)var2);

            if (3 >= 0) continue;
            return;
        }
    }

    @Inject
    public e(SquireScurrius squireScurrius) {
        this.L = squireScurrius;
        this.setLayer(OverlayLayer.ABOVE_SCENE);
        this.setPosition(OverlayPosition.DYNAMIC);
    }

    private static boolean lIlIllIIIlIIlll(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIllIIIlIlIII(Object object) {
        return object == null;
    }
}

