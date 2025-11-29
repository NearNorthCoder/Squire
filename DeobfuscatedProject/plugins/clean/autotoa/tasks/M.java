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
package gg.squire.autotoa.tasks;

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
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.GameEnum29;

public class M
extends Overlay {
    private static final  Color[] bF;
    private final  m bH;
    
    private final  Client bG;
    private final  TOAConfig bI;

    /*
     * WARNING - void declaration
     */
    private void a(Graphics2D graphics2D) {
        Queue<n> queue = this.bH.G();
        HashSet hashSet = new HashSet();
        int n2 = lIllIllllII[0];
        Iterator var1 = queue.iterator();
        while (M.lIIllIIIIIlIlI(var1.hasNext() ? 1 : 0)) {
            void var2;
            M var3;
            void var4;
            n var5 = (n)((Object)var1.next());
            if (M.lIIllIIIIIlIll((int)var4, lIllIllllII[1])) {

                if (1 != 2) break;
                return;
            }
            WorldPoint var6 = var5.a(var3.bG);
            if (M.lIIllIIIIIlIlI(var2.contains(var6) ? 1 : 0)) {

                if (-(158 + 155 - 209 + 57 ^ 82 + 110 - 106 + 78) < 0) break;
                return;
            }
            Color var7 = bF[var4];
            var2.add(var6);

            ++var4;
            int var8 = lIllIllllII[2];
            while (M.lIIllIIIIIllII(var8, lIllIllllII[3])) {
                int var9 = lIllIllllII[2];
                while (M.lIIllIIIIIllII(var9, lIllIllllII[3])) {
                    WorldPoint var10 = var6.dx(var8).dy(var9);
                    LocalPoint var11 = LocalPoint.fromWorld((Client)var3.bG, (WorldPoint)var10);
                    if (M.lIIllIIIIIllIl(var11)) {

                        if (3 == 0) {
                            return;
                        }
                    } else {
                        Point var12 = Perspective.tileCenter((Client)var3.bG, (WorldPoint)var6);
                        Polygon var13 = Perspective.getCanvasTilePoly((Client)var3.bG, (LocalPoint)var11);
                        if (M.lIIllIIIIIlllI(var13)) {
                            if (M.lIIllIIIIIllIl(var12)) {

                            } else {
                                void var14;
                                OverlayUtil.renderPolygon((Graphics2D)var14, (Shape)var13, (Color)var7, (Color)new Color(var7.getRed(), var7.getGreen(), var7.getBlue(), lIllIllllII[4]), (Stroke)new BasicStroke(1.0f));
                            }
                        }
                    }
                    ++var9;

                    if (3 > -1) continue;
                    return;
                }
                ++var8;

                if (2 >= 2) continue;
                return;
            }

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

