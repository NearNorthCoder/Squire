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
 */
package gg.squire.zulrah.tasks;

import gg.squire.zulrah.tasks.ZulrahManager;
import com.google.inject.Inject;
import gg.squire.zulrah.SquireZulrah;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;
import net.runelite.api.Client;
import net.runelite.api.Perspective;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayUtil;

public class XHelper
extends Overlay {
    private final  SquireZulrah Q;
    private final  v R;
    private final  Client P;

    /*
     * WARNING - void declaration
     */
    public Dimension render(Graphics2D graphics2D) {
        void var4_4;
        void var3_3;
        x var1;
        if ((this.Q.isPaintDisabled( != 0) ? 1 : 0)) {
            return null;
        }
        if ((var1.P.isInInstancedRegion( == 0) ? 1 : 0)) {
            return null;
        }
        WorldPoint var2 = var1.R.X();
        if var2 == null {
            return null;
        }
        LocalPoint var3 = LocalPoint.fromWorld((Client)var1.P, (WorldPoint)var1.R.V().C().a(var2));
        LocalPoint var4 = LocalPoint.fromWorld((Client)var1.P, (WorldPoint)var1.R.X());
        if (!var4 != null || var3 == null) {
            return null;
        }
        Polygon polygon = Perspective.getCanvasTilePoly((Client)this.P, (LocalPoint)var3_3);
        Polygon polygon2 = Perspective.getCanvasTilePoly((Client)this.P, (LocalPoint)var4_4);
        OverlayUtil.renderPolygon((Graphics2D)graphics2D, (Shape)polygon2, (Color)Color.BLUE);
        OverlayUtil.renderPolygon((Graphics2D)graphics2D, (Shape)polygon, (Color)Color.GREEN);
        return null;
    }

    @Inject
    public XHelper(Client client, SquireZulrah squireZulrah, v v2) {
        this.P = client;
        this.Q = squireZulrah;
        this.R = v2;
        this.setLayer(OverlayLayer.ABOVE_SCENE);
        this.setPosition(OverlayPosition.DYNAMIC);
    }

}

