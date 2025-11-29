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
package gg.squire.vorkath.tasks;

import com.google.inject.Inject;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.SquireVorkathPlugin;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;
import java.awt.Stroke;
import java.util.Iterator;
import java.util.Set;
import net.runelite.api.Client;
import net.runelite.api.Perspective;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayUtil;
import net.unethicalite.client.Static;

public class RHelper
extends Overlay {
    private  Set<WorldPoint> cP;
    private final  SquireVorkathPlugin cN;
    private  Set<WorldPoint> cO;
    @Inject
     SquireVorkathConfig y;

    /*
     * WARNING - void declaration
     */
    public void a(Set<WorldPoint> set, Graphics2D graphics2D, Color color) {
        Iterator<WorldPoint> var1 = set.iterator();
        while (R.var2(var1.hasNext() ? 1 : 0)) {
            void var3;
            void var4;
            WorldPoint var5 = var1.next();
            LocalPoint var6 = LocalPoint.fromWorld((Client)Static.getClient(), (WorldPoint)var5);
            if (R.var7(var6)) {
                0;
                if ((31 + 15 - -58 + 53 ^ 126 + 126 - 119 + 20) >= 3) continue;
                return;
            }
            Polygon var8 = Perspective.getCanvasTilePoly((Client)Static.getClient(), (LocalPoint)var6);
            OverlayUtil.renderPolygon((Graphics2D)var4, (Shape)var8, (Color)var3);
            0;
            if null == null continue;
            return;
        }
    }

    private static boolean var9(Object object) {
        return object != null;
    }

    public void c(Set<WorldPoint> set) {
        this.cP = set;
    }

    private static boolean var10(int n2) {
        return n2 == 0;
    }

    public void b(Set<WorldPoint> set) {
        this.cO = set;
    }

    private static boolean var7(Object object) {
        return object == null;
    }

    @Inject
    public RHelper(SquireVorkathConfig squireVorkathConfig, SquireVorkathPlugin squireVorkathPlugin) {
        this.y = squireVorkathConfig;
        this.cN = squireVorkathPlugin;
        this.setLayer(OverlayLayer.ABOVE_SCENE);
        this.setPosition(OverlayPosition.DYNAMIC);
    }

    private static boolean var2(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public Dimension render(Graphics2D graphics2D) {
        Set<WorldPoint> set;
        void var11;
        Set<WorldPoint> set2;
        R var12;
        if (R.var2(this.cN.debugOverlaysDisabled() ? 1 : 0)) {
            return null;
        }
        if (R.var10(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            return null;
        }
        if (R.var7(var12.cO)) {
            set2 = Set.of();
            0;
            if ((0x2B ^ 0x76 ^ (0x39 ^ 0x60)) <= 0) {
                return null;
            }
        } else {
            set2 = var12.cO;
        }
        var12.a(set2, (Graphics2D)var11, Color.GREEN);
        if (R.var7(var12.cP)) {
            set = Set.of();
            0;
            if null != null {
                return null;
            }
        } else {
            set = var12.cP;
        }
        var12.a(set, graphics2D, Color.RED);
        this.a(graphics2D, Color.CYAN);
        return null;
    }

    public void a(Graphics2D graphics2D, Color color) {
        Polygon polygon;
        LocalPoint localPoint = Static.getClient().getLocalDestinationLocation();
        if (R.var9(localPoint) && R.var9(polygon = Perspective.getCanvasTilePoly((Client)Static.getClient(), (LocalPoint)localPoint))) {
            OverlayUtil.renderPolygon((Graphics2D)graphics2D, (Shape)polygon, (Color)color, (Color)color, (Stroke)new BasicStroke(1.0f));
        }
    }
}

