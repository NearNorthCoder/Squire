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
package gg.squire.sepulchre.tasks;

import com.google.inject.Inject;
import gg.squire.sepulchre.SquireSepulchre;
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
    private final  SquireSepulchre ad;

    /*
     * WARNING - void declaration
     */
    public void a(List<WorldPoint> list, Graphics2D graphics2D, Color color) {
        Iterator<WorldPoint> var1 = list.iterator();
        while (M.var2(var1.hasNext() ? 1 : 0)) {
            void var3;
            void var4;
            WorldPoint var5 = var1.next();
            LocalPoint var6 = LocalPoint.fromWorld((Client)Static.getClient(), (WorldPoint)var5);
            if (M.var7(var6)) {
                0;
                if (((0xE8 ^ 0xC2) & ~(0x70 ^ 0x5A)) < 1) continue;
                return;
            }
            Polygon var8 = Perspective.getCanvasTilePoly((Client)Static.getClient(), (LocalPoint)var6);
            OverlayUtil.renderPolygon((Graphics2D)var4, (Shape)var8, (Color)var3);
            0;
            if (-(0x13 ^ 0x17) < 0) continue;
            return;
        }
    }

    @Inject
    public MHelper(SquireSepulchre squireSepulchre) {
        this.ad = squireSepulchre;
        this.setLayer(OverlayLayer.ABOVE_SCENE);
        this.setPosition(OverlayPosition.DYNAMIC);
    }

    public Dimension render(Graphics2D graphics2D) {
        return null;
    }

    private static boolean var2(int n2) {
        return n2 != 0;
    }

    private static boolean var7(Object object) {
        return object == null;
    }
}

