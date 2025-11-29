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

public class R
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
        while (R.lIllllllllIlIII(var1.hasNext() ? 1 : 0)) {
            void var2;
            void var3;
            WorldPoint var4 = var1.next();
            LocalPoint var5 = LocalPoint.fromWorld((Client)Static.getClient(), (WorldPoint)var4);
            if (R.lIllllllllIlIlI(var5)) {

                if ((31 + 15 - -58 + 53 ^ 126 + 126 - 119 + 20) >= 3) continue;
                return;
            }
            Polygon var6 = Perspective.getCanvasTilePoly((Client)Static.getClient(), (LocalPoint)var5);
            OverlayUtil.renderPolygon((Graphics2D)var3, (Shape)var6, (Color)var2);

            return;
        }
    }

    private static boolean lIllllllllIlIll(Object object) {
        return object != null;
    }

    public void c(Set<WorldPoint> set) {
        this.cP = set;
    }

    private static boolean lIllllllllIlIIl(int n2) {
        return n2 == 0;
    }

    public void b(Set<WorldPoint> set) {
        this.cO = set;
    }

    private static boolean lIllllllllIlIlI(Object object) {
        return object == null;
    }

    @Inject
    public R(SquireVorkathConfig squireVorkathConfig, SquireVorkathPlugin squireVorkathPlugin) {
        this.y = squireVorkathConfig;
        this.cN = squireVorkathPlugin;
        this.setLayer(OverlayLayer.ABOVE_SCENE);
        this.setPosition(OverlayPosition.DYNAMIC);
    }

    private static boolean lIllllllllIlIII(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public Dimension render(Graphics2D graphics2D) {
        Set<WorldPoint> set;
        void var7;
        Set<WorldPoint> set2;
        R var8;
        if (R.lIllllllllIlIII(this.cN.debugOverlaysDisabled() ? 1 : 0)) {
            return null;
        }
        if (R.lIllllllllIlIIl(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            return null;
        }
        if (R.lIllllllllIlIlI(var8.cO)) {
            set2 = Set.of();

            if ((0x2B ^ 0x76 ^ (0x39 ^ 0x60)) <= 0) {
                return null;
            }
        } else {
            set2 = var8.cO;
        }
        var8.a(set2, (Graphics2D)var7, Color.GREEN);
        if (R.lIllllllllIlIlI(var8.cP)) {
            set = Set.of();

            }
        } else {
            set = var8.cP;
        }
        var8.a(set, graphics2D, Color.RED);
        this.a(graphics2D, Color.CYAN);
        return null;
    }

    public void a(Graphics2D graphics2D, Color color) {
        Polygon polygon;
        LocalPoint localPoint = Static.getClient().getLocalDestinationLocation();
        if (R.lIllllllllIlIll(localPoint) && R.lIllllllllIlIll(polygon = Perspective.getCanvasTilePoly((Client)Static.getClient(), (LocalPoint)localPoint))) {
            OverlayUtil.renderPolygon((Graphics2D)graphics2D, (Shape)polygon, (Color)color, (Color)color, (Stroke)new BasicStroke(1.0f));
        }
    }
}

