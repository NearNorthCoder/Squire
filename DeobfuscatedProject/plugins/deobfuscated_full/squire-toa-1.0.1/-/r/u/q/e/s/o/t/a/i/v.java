/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.GroundObject
 *  net.runelite.api.Perspective
 *  net.runelite.api.Point
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.ui.overlay.OverlayLayer
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.OverlayPriority
 *  net.runelite.client.ui.overlay.OverlayUtil
 */
package -.r.u.q.e.s.o.t.a.i;

import -.r.u.q.e.s.o.t.a.i.j;
import -.r.u.q.e.s.o.t.a.i.w;
import gg.squire.toa.TOAConfig;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.GroundObject;
import net.runelite.api.Perspective;
import net.runelite.api.Point;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.OverlayUtil;

public class v
extends w {
    private static /* synthetic */ int[] lIIlllllllIII;
    private final /* synthetic */ TOAConfig aH;
    private final /* synthetic */ j aG;
    private final /* synthetic */ Client aF;

    @Inject
    protected v(Client client, j j2, TOAConfig tOAConfig) {
        super(tOAConfig);
        this.aF = client;
        this.aG = j2;
        this.aH = tOAConfig;
        this.setPriority(OverlayPriority.HIGH);
        this.setPosition(OverlayPosition.DYNAMIC);
        this.setLayer(OverlayLayer.UNDER_WIDGETS);
    }

    /*
     * WARNING - void declaration
     */
    private void a(Graphics2D graphics2D, Map<GroundObject, Integer> map) {
        Iterator<GroundObject> var18 = map.keySet().iterator();
        while (v.lIllIlIlIllllII(var18.hasNext() ? 1 : 0)) {
            void var12;
            void var22;
            v var4;
            GroundObject var27 = var18.next();
            WorldPoint var24 = var27.getWorldLocation();
            LocalPoint var3 = LocalPoint.fromWorld((Client)var4.aF, (WorldPoint)var24);
            if (v.lIllIlIlIllllIl(var3)) {
                0;
                
                return;
            }
            Point var1 = Perspective.localToCanvas((Client)var4.aF, (LocalPoint)var3, (int)var4.aF.getPlane());
            if (v.lIllIlIlIllllIl(var1)) {
                0;
                if (1 != 3) continue;
                return;
            }
            var4.a((Graphics2D)var22, new Color(lIIlllllllIII[0], lIIlllllllIII[1], lIIlllllllIII[0], lIIlllllllIII[2]), var3);
            OverlayUtil.renderTextLocation((Graphics2D)var22, (Point)var1, (String)String.valueOf(var12.get(var27)), (Color)Color.WHITE);
            0;
            
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    private void j(Graphics2D graphics2D) {
        int n2 = lIIlllllllIII[3];
        Iterator var9 = this.aG.q().iterator();
        while (v.lIllIlIlIllllII(var9.hasNext() ? 1 : 0)) {
            void var17;
            v var2;
            void var23;
            WorldPoint var5 = (WorldPoint)var9.next();
            ++var23;
            LocalPoint var28 = LocalPoint.fromWorld((Client)var2.aF, (WorldPoint)var5);
            if (v.lIllIlIlIllllIl(var28)) {
                0;
                if (3 > 0) continue;
                return;
            }
            Point var26 = Perspective.tileCenter((Client)var2.aF, (WorldPoint)var5);
            Polygon var14 = Perspective.getCanvasTilePoly((Client)var2.aF, (LocalPoint)var28);
            if (!v.lIllIlIlIllllll(var14)) continue;
            if (v.lIllIlIlIllllIl(var26)) {
                0;
                if ((0x7C ^ 0x78) > ((0x35 ^ 0x29) & ~(0x56 ^ 0x4A))) continue;
                return;
            }
            OverlayUtil.renderPolygon((Graphics2D)var17, (Shape)var14, (Color)Color.GREEN);
            OverlayUtil.renderTextLocation((Graphics2D)var17, (Point)var26, (String)String.valueOf((int)(var23 - lIIlllllllIII[3])), (Color)Color.GREEN);
            0;
            
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    private void h(Graphics2D graphics2D) {
        void var25;
        List<WorldPoint> list = this.aG.u();
        if (v.lIllIlIlIllllII(list.isEmpty() ? 1 : 0)) {
            return;
        }
        int var11 = lIIlllllllIII[0];
        while (v.lIllIlIlIlllllI(var11, var25.size())) {
            v var15;
            WorldPoint var7 = (WorldPoint)var25.get(var11);
            LocalPoint var16 = LocalPoint.fromWorld((Client)var15.aF, (WorldPoint)var7);
            if (v.lIllIlIlIllllIl(var16)) {
                0;
                
                }
            } else {
                Point var21 = Perspective.localToCanvas((Client)var15.aF, (LocalPoint)var16, (int)var15.aF.getPlane());
                if (v.lIllIlIlIllllIl(var21)) {
                    0;
                    
                    }
                } else {
                    void var19;
                    var15.a((Graphics2D)var19, new Color(lIIlllllllIII[0], lIIlllllllIII[1], lIIlllllllIII[0], lIIlllllllIII[2]), var16);
                    OverlayUtil.renderTextLocation((Graphics2D)var19, (Point)var21, (String)String.valueOf(var11 + lIIlllllllIII[3]), (Color)Color.WHITE);
                }
            }
            ++var11;
            0;
            if (-1 < 0) continue;
            return;
        }
    }

    private static boolean lIllIlIlIllllII(int n2) {
        return n2 != 0;
    }

    private static void lIllIlIlIlllIll() {
        lIIlllllllIII = new int[4];
        v.lIIlllllllIII[0] = (137 + 21 - 117 + 154 ^ 82 + 23 - 42 + 85) & (0x7F ^ 0x4B ^ (0x5C ^ 0x3F) ^ -1);
        v.lIIlllllllIII[1] = 64 + 32 - -123 + 36;
        v.lIIlllllllIII[2] = 0x24 ^ 0x3D;
        v.lIIlllllllIII[3] = 1;
    }

    /*
     * WARNING - void declaration
     */
    private void i(Graphics2D graphics2D) {
        Iterator<GroundObject> var20 = this.aG.p().iterator();
        while (v.lIllIlIlIllllII(var20.hasNext() ? 1 : 0)) {
            void var8;
            v var13;
            GroundObject var10 = var20.next();
            LocalPoint var6 = var10.getLocalLocation();
            var13.a((Graphics2D)var8, Color.GREEN, var6);
            0;
            if (-1 != 3) continue;
            return;
        }
    }

    private static boolean lIllIlIlIlllllI(int n2, int n3) {
        return n2 < n3;
    }

    static {
        v.lIllIlIlIlllIll();
    }

    private static boolean lIllIlIlIllllIl(Object object) {
        return object == null;
    }

    public Dimension render(Graphics2D graphics2D) {
        this.j(graphics2D);
        this.i(graphics2D);
        this.h(graphics2D);
        this.g(graphics2D);
        return null;
    }

    private void g(Graphics2D graphics2D) {
        this.a(graphics2D, this.aG.x());
        this.a(graphics2D, this.aG.w());
    }

    private static boolean lIllIlIlIllllll(Object object) {
        return object != null;
    }
}

