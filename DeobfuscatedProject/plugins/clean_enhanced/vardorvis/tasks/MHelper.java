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
package gg.squire.vardorvis.tasks;

import com.google.inject.Inject;
import gg.squire.vardorvis.SquireVardorvis;
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

public class MHelper
extends Overlay {
    private final  SquireVardorvis ac;

    @Inject
    public MHelper(SquireVardorvis squireVardorvis) {
        this.ac = squireVardorvis;
        this.setLayer(OverlayLayer.ABOVE_SCENE);
        this.setPosition(OverlayPosition.DYNAMIC);
    }

    private static boolean var1(Object object) {
        return object == null;
    }

    private static boolean var2(int n2) {
        return n2 != 0;
    }

    public Dimension render(Graphics2D graphics2D) {
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public void a(List<WorldPoint> list, Graphics2D graphics2D, Color color) {
        Iterator<WorldPoint> var3 = list.iterator();
        while (m.var2(var3.hasNext() ? 1 : 0)) {
            void var4;
            void var5;
            WorldPoint var6 = var3.next();
            LocalPoint var7 = LocalPoint.fromWorld((Client)Static.getClient(), (WorldPoint)var6);
            if (m.var1(var7)) {
                0;
                if (((0xB3 ^ 0x94) & ~(0x55 ^ 0x72)) == 0) continue;
                return;
            }
            Polygon var8 = Perspective.getCanvasTilePoly((Client)Static.getClient(), (LocalPoint)var7);
            OverlayUtil.renderPolygon((Graphics2D)var5, (Shape)var8, (Color)var4);
            0;
            if ((0x8F ^ 0xAC ^ (0xAF ^ 0x88)) >= 1) continue;
            return;
        }
    }
}

