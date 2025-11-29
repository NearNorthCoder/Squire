/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Perspective
 *  net.runelite.api.Point
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayLayer
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.OverlayPriority
 *  net.runelite.client.ui.overlay.OverlayUtil
 */
package gg.squire.toa.tasks;

import gg.squire.toa.tasks.ToaManager;
import gg.squire.toa.tasks.GameEnum10;
import gg.squire.toa.TOAConfig;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;
import java.awt.Stroke;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Queue;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Perspective;
import net.runelite.api.Point;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.OverlayUtil;

public class q
extends Overlay {
    
    private static final  Color[] as;
    private final  h au;
    private final  Client at;
    private final  TOAConfig av;

    private static boolean lIllIlIIlllIIII(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIlIIlllIlII(Object object) {
        return object == null;
    }

    @Inject
    protected q(Client client, h h2, TOAConfig tOAConfig) {
        this.at = client;
        this.au = h2;
        this.av = tOAConfig;
        this.setPriority(OverlayPriority.HIGH);
        this.setPosition(OverlayPosition.DYNAMIC);
        this.setLayer(OverlayLayer.UNDER_WIDGETS);
    }

    private static boolean lIllIlIIlllIIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIlIIlllIIll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIllIlIIlllIlIl(Object object) {
        return object != null;
    }

    private static boolean lIllIlIIlllIIlI(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    private void a(Graphics2D graphics2D) {
        q var1;
        if (q.lIllIlIIlllIIII(this.av.markSectionOrder() ? 1 : 0)) {
            return;
        }
        Queue<i> var2 = var1.au.i();
        HashSet<WorldPoint> var3 = new HashSet<WorldPoint>();
        int var4 = lIIllllIllllI[0];
        Iterator var5 = var2.iterator();
        while (q.lIllIlIIlllIIIl(var5.hasNext() ? 1 : 0)) {
            i var6 = (i)((Object)var5.next());
            if (q.lIllIlIIlllIIlI(var4, lIIllllIllllI[1])) {

                if (2 > 0) break;
                return;
            }
            WorldPoint var7 = var6.a(var1.at);
            if (q.lIllIlIIlllIIIl(var3.contains(var7) ? 1 : 0)) {

                if (-(0x8A ^ 0xA5 ^ (0x25 ^ 0xF)) < 0) break;
                return;
            }
            Color var8 = as[var4];
            var3.add(var7);

            ++var4;
            int var9 = lIIllllIllllI[2];
            while (q.lIllIlIIlllIIll(var9, lIIllllIllllI[3])) {
                int var10 = lIIllllIllllI[2];
                while (q.lIllIlIIlllIIll(var10, lIIllllIllllI[3])) {
                    WorldPoint var11 = var7.dx(var9).dy(var10);
                    LocalPoint var12 = LocalPoint.fromWorld((Client)var1.at, (WorldPoint)var11);
                    if (q.lIllIlIIlllIlII(var12)) {

                        if (((0x31 ^ 0x52) & ~(0xD2 ^ 0xB1)) >= (0xA ^ 0xE)) {
                            return;
                        }
                    } else {
                        Point var13 = Perspective.tileCenter((Client)var1.at, (WorldPoint)var7);
                        Polygon var14 = Perspective.getCanvasTilePoly((Client)var1.at, (LocalPoint)var12);
                        if (q.lIllIlIIlllIlIl(var14)) {
                            if (q.lIllIlIIlllIlII(var13)) {

                                }
                            } else {
                                void var15;
                                OverlayUtil.renderPolygon((Graphics2D)var15, (Shape)var14, (Color)var8, (Color)new Color(var8.getRed(), var8.getGreen(), var8.getBlue(), lIIllllIllllI[4]), (Stroke)new BasicStroke(1.0f));
                            }
                        }
                    }
                    ++var10;

                    if (-1 >= -1) continue;
                    return;
                }
                ++var9;

                if (3 != 0) continue;
                return;
            }

            return;
        }
    }

    public Dimension render(Graphics2D graphics2D) {
        this.a(graphics2D);
        return null;
    }

    static {
        q.lIllIlIIllIllll();
        Color[] colorArray = new Color[lIIllllIllllI[5]];
        colorArray[q.lIIllllIllllI[0]] = Color.GREEN;
        colorArray[q.lIIllllIllllI[3]] = Color.ORANGE;
        colorArray[q.lIIllllIllllI[1]] = Color.YELLOW;
        colorArray[q.lIIllllIllllI[6]] = Color.RED;
        colorArray[q.lIIllllIllllI[7]] = Color.BLACK;
        as = colorArray;
    }
}

