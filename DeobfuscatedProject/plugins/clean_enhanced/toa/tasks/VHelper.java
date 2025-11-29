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
        Iterator<GroundObject> var2 = map.keySet().iterator();
        while (v.var3(var2.hasNext() ? 1 : 0)) {
            void var4;
            void var5;
            v var6;
            GroundObject var7 = var2.next();
            WorldPoint var8 = var7.getWorldLocation();
            LocalPoint var9 = LocalPoint.fromWorld((Client)var6.aF, (WorldPoint)var8);
            if (v.var10(var9)) {
                0;
                if null == null continue;
                return;
            }
            Point var11 = Perspective.localToCanvas((Client)var6.aF, (LocalPoint)var9, (int)var6.aF.getPlane());
            if (v.var10(var11)) {
                0;
                if (1 != 3) continue;
                return;
            }
            var6.a((Graphics2D)var5, new Color(var1[0], var1[1], var1[0], var1[2]), var9);
            OverlayUtil.renderTextLocation((Graphics2D)var5, (Point)var11, (String)String.valueOf(var4.get(var7)), (Color)Color.WHITE);
            0;
            if null == null continue;
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    private void j(Graphics2D graphics2D) {
        int n2 = var1[3];
        Iterator var12 = this.aG.q().iterator();
        while (v.var3(var12.hasNext() ? 1 : 0)) {
            void var13;
            v var14;
            void var15;
            WorldPoint var16 = (WorldPoint)var12.next();
            ++var15;
            LocalPoint var17 = LocalPoint.fromWorld((Client)var14.aF, (WorldPoint)var16);
            if (v.var10(var17)) {
                0;
                if (3 > 0) continue;
                return;
            }
            Point var18 = Perspective.tileCenter((Client)var14.aF, (WorldPoint)var16);
            Polygon var19 = Perspective.getCanvasTilePoly((Client)var14.aF, (LocalPoint)var17);
            if (!v.var20(var19)) continue;
            if (v.var10(var18)) {
                0;
                if ((0x7C ^ 0x78) > ((0x35 ^ 0x29) & ~(0x56 ^ 0x4A))) continue;
                return;
            }
            OverlayUtil.renderPolygon((Graphics2D)var13, (Shape)var19, (Color)Color.GREEN);
            OverlayUtil.renderTextLocation((Graphics2D)var13, (Point)var18, (String)String.valueOf((int)(var15 - var1[3])), (Color)Color.GREEN);
            0;
            if null == null continue;
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    private void h(Graphics2D graphics2D) {
        void var21;
        List<WorldPoint> list = this.aG.u();
        if (v.var3(list.isEmpty() ? 1 : 0)) {
            return;
        }
        int var22 = var1[0];
        while (v.var23(var22, var21.size())) {
            v var24;
            WorldPoint var25 = (WorldPoint)var21.get(var22);
            LocalPoint var26 = LocalPoint.fromWorld((Client)var24.aF, (WorldPoint)var25);
            if (v.var10(var26)) {
                0;
                if null != null {
                    return;
                }
            } else {
                Point var27 = Perspective.localToCanvas((Client)var24.aF, (LocalPoint)var26, (int)var24.aF.getPlane());
                if (v.var10(var27)) {
                    0;
                    if null != null {
                        return;
                    }
                } else {
                    void var28;
                    var24.a((Graphics2D)var28, new Color(var1[0], var1[1], var1[0], var1[2]), var26);
                    OverlayUtil.renderTextLocation((Graphics2D)var28, (Point)var27, (String)String.valueOf(var22 + var1[3]), (Color)Color.WHITE);
                }
            }
            ++var22;
            0;
            if (-1 < 0) continue;
            return;
        }
    }

    private static boolean var3(int n2) {
        return n2 != 0;
    }

    private static void var29() {
        var1 = new int[4];
        v.var1[0] = (137 + 21 - 117 + 154 ^ 82 + 23 - 42 + 85) & (0x7F ^ 0x4B ^ (0x5C ^ 0x3F) ^ -1);
        v.var1[1] = 64 + 32 - -123 + 36;
        v.var1[2] = 0x24 ^ 0x3D;
        v.var1[3] = 1;
    }

    /*
     * WARNING - void declaration
     */
    private void i(Graphics2D graphics2D) {
        Iterator<GroundObject> var30 = this.aG.p().iterator();
        while (v.var3(var30.hasNext() ? 1 : 0)) {
            void var31;
            v var32;
            GroundObject var33 = var30.next();
            LocalPoint var34 = var33.getLocalLocation();
            var32.a((Graphics2D)var31, Color.GREEN, var34);
            0;
            if (-1 != 3) continue;
            return;
        }
    }

    private static boolean var23(int n2, int n3) {
        return n2 < n3;
    }

    static {
        v.var29();
    }

    private static boolean var10(Object object) {
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

    private static boolean var20(Object object) {
        return object != null;
    }
}

