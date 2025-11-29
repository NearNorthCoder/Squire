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
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import gg.squire.autotoa.TOAConfig;
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
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.m_Unknown;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.NEnum;

public class M_Unknown
extends Overlay {
    private static final /* synthetic */ Color[] bF;
    private final /* synthetic */ m bH;
    private static /* synthetic */ int[] lIllIllllII;
    private final /* synthetic */ Client bG;
    private final /* synthetic */ TOAConfig bI;

    /*
     * WARNING - void declaration
     */
    private void a(Graphics2D graphics2D) {
        Queue<n> queue = this.bH.G();
        HashSet hashSet = new HashSet();
        int n2 = lIllIllllII[0];
        Iterator var2 = queue.iterator();
        while (M.lIIllIIIIIlIlI(var2.hasNext() ? 1 : 0)) {
            void var12;
            M var13;
            void var6;
            n var11 = (n)((Object)var2.next());
            if (M.lIIllIIIIIlIll((int)var6, lIllIllllII[1])) {
                0;
                if (1 != 2) break;
                return;
            }
            WorldPoint var1 = var11.a(var13.bG);
            if (M.lIIllIIIIIlIlI(var12.contains(var1) ? 1 : 0)) {
                0;
                if (-(158 + 155 - 209 + 57 ^ 82 + 110 - 106 + 78) < 0) break;
                return;
            }
            Color var3 = bF[var6];
            var12.add(var1);
            0;
            ++var6;
            int var10 = lIllIllllII[2];
            while (M.lIIllIIIIIllII(var10, lIllIllllII[3])) {
                int var4 = lIllIllllII[2];
                while (M.lIIllIIIIIllII(var4, lIllIllllII[3])) {
                    WorldPoint var9 = var1.dx(var10).dy(var4);
                    LocalPoint var14 = LocalPoint.fromWorld((Client)var13.bG, (WorldPoint)var9);
                    if (M.lIIllIIIIIllIl(var14)) {
                        0;
                        if (3 == 0) {
                            return;
                        }
                    } else {
                        Point var8 = Perspective.tileCenter((Client)var13.bG, (WorldPoint)var1);
                        Polygon var5 = Perspective.getCanvasTilePoly((Client)var13.bG, (LocalPoint)var14);
                        if (M.lIIllIIIIIlllI(var5)) {
                            if (M.lIIllIIIIIllIl(var8)) {
                                0;
                                if (-1 >= 0) {
                                    return;
                                }
                            } else {
                                void var7;
                                OverlayUtil.renderPolygon((Graphics2D)var7, (Shape)var5, (Color)var3, (Color)new Color(var3.getRed(), var3.getGreen(), var3.getBlue(), lIllIllllII[4]), (Stroke)new BasicStroke(1.0f));
                            }
                        }
                    }
                    ++var4;
                    0;
                    if (3 > -1) continue;
                    return;
                }
                ++var10;
                0;
                if (2 >= 2) continue;
                return;
            }
            0;
            
            return;
        }
    }

    private static boolean lIIllIIIIIlIll(int n2, int n3) {
        return n2 >= n3;
    }

    static {
        M.lIIllIIIIIlIIl();
        Color[] colorArray = new Color[lIllIllllII[5]];
        colorArray[M.lIllIllllII[0]] = Color.GREEN;
        colorArray[M.lIllIllllII[3]] = Color.ORANGE;
        colorArray[M.lIllIllllII[1]] = Color.YELLOW;
        colorArray[M.lIllIllllII[6]] = Color.RED;
        colorArray[M.lIllIllllII[7]] = Color.BLACK;
        bF = colorArray;
    }

    private static void lIIllIIIIIlIIl() {
        lIllIllllII = new int[8];
        M.lIllIllllII[0] = (132 + 158 - 165 + 52 ^ 138 + 132 - 138 + 32) & (5 + 96 - 46 + 119 ^ 25 + 98 - -48 + 16 ^ -1);
        M.lIllIllllII[1] = 2;
        M.lIllIllllII[2] = -1;
        M.lIllIllllII[3] = 1;
        M.lIllIllllII[4] = 0x36 ^ 0x2F;
        M.lIllIllllII[5] = 0x6F ^ 0x2A ^ (0xF5 ^ 0xB5);
        M.lIllIllllII[6] = 3;
        M.lIllIllllII[7] = 133 + 127 - 219 + 141 ^ 11 + 58 - -44 + 65;
    }

    @Inject
    protected M(Client client, m m2, TOAConfig tOAConfig) {
        this.bG = client;
        this.bH = m2;
        this.bI = tOAConfig;
        this.setPriority(OverlayPriority.HIGH);
        this.setPosition(OverlayPosition.DYNAMIC);
        this.setLayer(OverlayLayer.UNDER_WIDGETS);
    }

    private static boolean lIIllIIIIIlllI(Object object) {
        return object != null;
    }

    private static boolean lIIllIIIIIllIl(Object object) {
        return object == null;
    }

    private static boolean lIIllIIIIIlIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lIIllIIIIIllII(int n2, int n3) {
        return n2 <= n3;
    }

    public Dimension render(Graphics2D graphics2D) {
        this.a(graphics2D);
        return null;
    }
}

