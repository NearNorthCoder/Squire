/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.Perspective
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayLayer
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.OverlayUtil
 *  net.unethicalite.client.Static
 */
package gg.squire.pvm.tasks;

import com.google.inject.Inject;
import gg.squire.pvm.SquireShamanConfig;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Perspective;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayUtil;
import net.unethicalite.client.Static;
import gg.squire.pvm.tasks.PvmManager;

public class IHelper
extends Overlay {
    @Inject
     SquireShamanConfig c;
    
    private final  c N;

    public Dimension render(Graphics2D graphics2D) {
        NPC nPC = this.N.o();
        Stream stream = this.c.room().z().stream();
        c c2 = this.N;
        Objects.requireNonNull(c2);
        0;
        List<WorldPoint> list2 = stream.filter(c2::a).filter(worldPoint -> {
            int n2;
            if (!i.var2(nPC) || i.var3(worldPoint.distanceTo(nPC.getWorldLocation()), var1[0])) {
                n2 = var1[1];
                0;
                if null != null {
                    return ((0x48 ^ 0xD) & ~(0x42 ^ 7)) != 0;
                }
            } else {
                n2 = var1[2];
            }
            return n2 != 0;
        }).collect(Collectors.toList());
        Set<List<WorldPoint>> set = this.N.n();
        this.a(list2, graphics2D, Color.GREEN);
        set.forEach(list -> this.a((List<WorldPoint>)list, graphics2D, Color.RED));
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public void a(List<WorldPoint> list, Graphics2D graphics2D, Color color) {
        Iterator<WorldPoint> var4 = list.iterator();
        while (i.var5(var4.hasNext() ? 1 : 0)) {
            void var6;
            void var7;
            WorldPoint var8 = var4.next();
            LocalPoint var9 = LocalPoint.fromWorld((Client)Static.getClient(), (WorldPoint)var8);
            if (i.var10(var9)) {
                0;
                if null == null continue;
                return;
            }
            Polygon var11 = Perspective.getCanvasTilePoly((Client)Static.getClient(), (LocalPoint)var9);
            OverlayUtil.renderPolygon((Graphics2D)var7, (Shape)var11, (Color)var6);
            0;
            if (-(0x85 ^ 0x81) < 0) continue;
            return;
        }
    }

    private static boolean var3(int n2, int n3) {
        return n2 > n3;
    }

    static {
        i.var12();
    }

    private static void var12() {
        var1 = new int[3];
        i.var1[0] = 2;
        i.var1[1] = 1;
        i.var1[2] = (0x46 ^ 0x7E) & ~(0x80 ^ 0xB8);
    }

    private static boolean var5(int n2) {
        return n2 != 0;
    }

    private static boolean var2(Object object) {
        return object != null;
    }

    private static boolean var10(Object object) {
        return object == null;
    }

    @Inject
    public IHelper(c c2, SquireShamanConfig squireShamanConfig) {
        this.N = c2;
        this.c = squireShamanConfig;
        this.setLayer(OverlayLayer.ABOVE_SCENE);
        this.setPosition(OverlayPosition.DYNAMIC);
    }
}

