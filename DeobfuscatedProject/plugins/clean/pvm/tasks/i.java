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
import gg.squire.pvm.tasks.CHelper;

public class i
extends Overlay {
    @Inject
     SquireShamanConfig c;
    
    private final  c N;

    public Dimension render(Graphics2D graphics2D) {
        NPC nPC = this.N.o();
        Stream stream = this.c.room().z().stream();
        c c2 = this.N;
        Objects.requireNonNull(c2);

        List<WorldPoint> list2 = stream.filter(c2::a).filter(worldPoint -> {
            int n2;
            if (!i.lIlIlllIllIlIII(nPC) || i.lIlIlllIllIlIIl(worldPoint.distanceTo(nPC.getWorldLocation()), lIIllIIIIllIl[0])) {
                n2 = lIIllIIIIllIl[1];

                }
            } else {
                n2 = lIIllIIIIllIl[2];
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
        Iterator<WorldPoint> var1 = list.iterator();
        while (i.lIlIlllIllIIlIl(var1.hasNext() ? 1 : 0)) {
            void var2;
            void var3;
            WorldPoint var4 = var1.next();
            LocalPoint var5 = LocalPoint.fromWorld((Client)Static.getClient(), (WorldPoint)var4);
            if (i.lIlIlllIllIIllI(var5)) {

                return;
            }
            Polygon var6 = Perspective.getCanvasTilePoly((Client)Static.getClient(), (LocalPoint)var5);
            OverlayUtil.renderPolygon((Graphics2D)var3, (Shape)var6, (Color)var2);

            if (-(0x85 ^ 0x81) < 0) continue;
            return;
        }
    }

    private static boolean lIlIlllIllIlIIl(int n2, int n3) {
        return n2 > n3;
    }

    static {
        i.lIlIlllIllIIlII();
    }

    private static boolean lIlIlllIllIIlIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIlllIllIlIII(Object object) {
        return object != null;
    }

    private static boolean lIlIlllIllIIllI(Object object) {
        return object == null;
    }

    @Inject
    public i(c c2, SquireShamanConfig squireShamanConfig) {
        this.N = c2;
        this.c = squireShamanConfig;
        this.setLayer(OverlayLayer.ABOVE_SCENE);
        this.setPosition(OverlayPosition.DYNAMIC);
    }
}

