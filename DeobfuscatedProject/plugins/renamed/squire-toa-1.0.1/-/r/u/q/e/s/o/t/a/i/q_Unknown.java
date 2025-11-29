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
package -.r.u.q.e.s.o.t.a.i;

import -.r.u.q.e.s.o.t.a.i.h_Unknown;
import -.r.u.q.e.s.o.t.a.i.IEnum;
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

public class q_Unknown
extends Overlay {
    private static /* synthetic */ int[] lIIllllIllllI;
    private static final /* synthetic */ Color[] as;
    private final /* synthetic */ h au;
    private final /* synthetic */ Client at;
    private final /* synthetic */ TOAConfig av;

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
        q var13;
        if (q.lIllIlIIlllIIII(this.av.markSectionOrder() ? 1 : 0)) {
            return;
        }
        Queue<i> var10 = var13.au.i();
        HashSet<WorldPoint> var3 = new HashSet<WorldPoint>();
        int var9 = lIIllllIllllI[0];
        Iterator var11 = var10.iterator();
        while (q.lIllIlIIlllIIIl(var11.hasNext() ? 1 : 0)) {
            i var1 = (i)((Object)var11.next());
            if (q.lIllIlIIlllIIlI(var9, lIIllllIllllI[1])) {
                0;
                if (2 > 0) break;
                return;
            }
            WorldPoint var14 = var1.a(var13.at);
            if (q.lIllIlIIlllIIIl(var3.contains(var14) ? 1 : 0)) {
                0;
                if (-(0x8A ^ 0xA5 ^ (0x25 ^ 0xF)) < 0) break;
                return;
            }
            Color var15 = as[var9];
            var3.add(var14);
            0;
            ++var9;
            int var8 = lIIllllIllllI[2];
            while (q.lIllIlIIlllIIll(var8, lIIllllIllllI[3])) {
                int var2 = lIIllllIllllI[2];
                while (q.lIllIlIIlllIIll(var2, lIIllllIllllI[3])) {
                    WorldPoint var12 = var14.dx(var8).dy(var2);
                    LocalPoint var6 = LocalPoint.fromWorld((Client)var13.at, (WorldPoint)var12);
                    if (q.lIllIlIIlllIlII(var6)) {
                        0;
                        if (((0x31 ^ 0x52) & ~(0xD2 ^ 0xB1)) >= (0xA ^ 0xE)) {
                            return;
                        }
                    } else {
                        Point var5 = Perspective.tileCenter((Client)var13.at, (WorldPoint)var14);
                        Polygon var4 = Perspective.getCanvasTilePoly((Client)var13.at, (LocalPoint)var6);
                        if (q.lIllIlIIlllIlIl(var4)) {
                            if (q.lIllIlIIlllIlII(var5)) {
                                0;
                                
                                }
                            } else {
                                void var7;
                                OverlayUtil.renderPolygon((Graphics2D)var7, (Shape)var4, (Color)var15, (Color)new Color(var15.getRed(), var15.getGreen(), var15.getBlue(), lIIllllIllllI[4]), (Stroke)new BasicStroke(1.0f));
                            }
                        }
                    }
                    ++var2;
                    0;
                    if (-1 >= -1) continue;
                    return;
                }
                ++var8;
                0;
                if (3 != 0) continue;
                return;
            }
            0;
            
            return;
        }
    }

    private static void lIllIlIIllIllll() {
        lIIllllIllllI = new int[8];
        q.lIIllllIllllI[0] = (0x44 ^ 0x73 ^ (0x7F ^ 0x40)) & (131 + 41 - 159 + 119 ^ 62 + 91 - 30 + 17 ^ -1);
        q.lIIllllIllllI[1] = 2;
        q.lIIllllIllllI[2] = -1;
        q.lIIllllIllllI[3] = 1;
        q.lIIllllIllllI[4] = 0x12 ^ 0x72 ^ (7 ^ 0x7E);
        q.lIIllllIllllI[5] = 0xA8 ^ 0xAD;
        q.lIIllllIllllI[6] = 3;
        q.lIIllllIllllI[7] = 0x4A ^ 0x22 ^ (0x25 ^ 0x49);
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

