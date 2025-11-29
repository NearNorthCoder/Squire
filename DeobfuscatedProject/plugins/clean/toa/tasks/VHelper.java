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
package gg.squire.toa.tasks;

import gg.squire.toa.tasks.ToaManager;
import gg.squire.toa.tasks.ToaTaskBase;
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

public class VHelper
extends ToaTaskBase {
    
    private final  TOAConfig aH;
    private final  j aG;
    private final  Client aF;

    @Inject
    protected VHelper(Client client, j j2, TOAConfig tOAConfig) {
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
        Iterator<GroundObject> var1 = map.keySet().iterator();
        while (v.lIllIlIlIllllII(var1.hasNext() ? 1 : 0)) {
            void var2;
            void var3;
            v var4;
            GroundObject var5 = var1.next();
            WorldPoint var6 = var5.getWorldLocation();
            LocalPoint var7 = LocalPoint.fromWorld((Client)var4.aF, (WorldPoint)var6);
            if (v.lIllIlIlIllllIl(var7)) {

                return;
            }
            Point var8 = Perspective.localToCanvas((Client)var4.aF, (LocalPoint)var7, (int)var4.aF.getPlane());
            if (v.lIllIlIlIllllIl(var8)) {

                if (1 != 3) continue;
                return;
            }
            var4.a((Graphics2D)var3, new Color(lIIlllllllIII[0], lIIlllllllIII[1], lIIlllllllIII[0], lIIlllllllIII[2]), var7);
            OverlayUtil.renderTextLocation((Graphics2D)var3, (Point)var8, (String)String.valueOf(var2.get(var5)), (Color)Color.WHITE);

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
            void var10;
            v var11;
            void var12;
            WorldPoint var13 = (WorldPoint)var9.next();
            ++var12;
            LocalPoint var14 = LocalPoint.fromWorld((Client)var11.aF, (WorldPoint)var13);
            if (v.lIllIlIlIllllIl(var14)) {

                if (3 > 0) continue;
                return;
            }
            Point var15 = Perspective.tileCenter((Client)var11.aF, (WorldPoint)var13);
            Polygon var16 = Perspective.getCanvasTilePoly((Client)var11.aF, (LocalPoint)var14);
            if (!v.lIllIlIlIllllll(var16)) continue;
            if (v.lIllIlIlIllllIl(var15)) {

                if ((0x7C ^ 0x78) > ((0x35 ^ 0x29) & ~(0x56 ^ 0x4A))) continue;
                return;
            }
            OverlayUtil.renderPolygon((Graphics2D)var10, (Shape)var16, (Color)Color.GREEN);
            OverlayUtil.renderTextLocation((Graphics2D)var10, (Point)var15, (String)String.valueOf((int)(var12 - lIIlllllllIII[3])), (Color)Color.GREEN);

            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    private void h(Graphics2D graphics2D) {
        void var17;
        List<WorldPoint> list = this.aG.u();
        if (v.lIllIlIlIllllII(list.isEmpty() ? 1 : 0)) {
            return;
        }
        int var18 = lIIlllllllIII[0];
        while (v.lIllIlIlIlllllI(var18, var17.size())) {
            v var19;
            WorldPoint var20 = (WorldPoint)var17.get(var18);
            LocalPoint var21 = LocalPoint.fromWorld((Client)var19.aF, (WorldPoint)var20);
            if (v.lIllIlIlIllllIl(var21)) {

                }
            } else {
                Point var22 = Perspective.localToCanvas((Client)var19.aF, (LocalPoint)var21, (int)var19.aF.getPlane());
                if (v.lIllIlIlIllllIl(var22)) {

                    }
                } else {
                    void var23;
                    var19.a((Graphics2D)var23, new Color(lIIlllllllIII[0], lIIlllllllIII[1], lIIlllllllIII[0], lIIlllllllIII[2]), var21);
                    OverlayUtil.renderTextLocation((Graphics2D)var23, (Point)var22, (String)String.valueOf(var18 + lIIlllllllIII[3]), (Color)Color.WHITE);
                }
            }
            ++var18;

            if (-1 < 0) continue;
            return;
        }
    }

    private static boolean lIllIlIlIllllII(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private void i(Graphics2D graphics2D) {
        Iterator<GroundObject> var24 = this.aG.p().iterator();
        while (v.lIllIlIlIllllII(var24.hasNext() ? 1 : 0)) {
            void var25;
            v var26;
            GroundObject var27 = var24.next();
            LocalPoint var28 = var27.getLocalLocation();
            var26.a((Graphics2D)var25, Color.GREEN, var28);

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

