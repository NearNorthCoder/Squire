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
package gg.squire.autotoa.tasks;

import gg.squire.autotoa.TOAConfig;
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
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.AutotoaManager;

public class RHelper
extends AutotoaTaskBase {
    
    private final  p bT;
    private final  Client bS;
    private final  TOAConfig bU;

    /*
     * WARNING - void declaration
     */
    private void h(Graphics2D graphics2D) {
        void var2;
        List<WorldPoint> list = this.bT.V();
        if (R.var3(list.isEmpty() ? 1 : 0)) {
            return;
        }
        int var4 = var1[0];
        while (R.var5(var4, var2.size())) {
            R var6;
            WorldPoint var7 = (WorldPoint)var2.get(var4);
            LocalPoint var8 = LocalPoint.fromWorld((Client)var6.bS, (WorldPoint)var7);
            if (R.var9(var8)) {
                0;
                if ((4 + 115 - 93 + 155 ^ 18 + 0 - -47 + 112) < (102 + 23 - 59 + 101 ^ 144 + 158 - 200 + 61)) {
                    return;
                }
            } else {
                Point var10 = Perspective.localToCanvas((Client)var6.bS, (LocalPoint)var8, (int)var6.bS.getPlane());
                if (R.var9(var10)) {
                    0;
                    if (3 == ((0xC8 ^ 0xC0) & ~(0x4D ^ 0x45))) {
                        return;
                    }
                } else {
                    void var11;
                    var6.a((Graphics2D)var11, new Color(var1[0], var1[1], var1[0], var1[2]), var8);
                    OverlayUtil.renderTextLocation((Graphics2D)var11, (Point)var10, (String)String.valueOf(var4 + var1[3]), (Color)Color.WHITE);
                }
            }
            ++var4;
            0;
            if ((0x33 ^ 0x37) > 0) continue;
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    private void a(Graphics2D graphics2D, Map<GroundObject, Integer> map) {
        Iterator<GroundObject> var12 = map.keySet().iterator();
        while (R.var3(var12.hasNext() ? 1 : 0)) {
            void var13;
            void var14;
            R var15;
            GroundObject var16 = var12.next();
            WorldPoint var17 = var16.getWorldLocation();
            LocalPoint var18 = LocalPoint.fromWorld((Client)var15.bS, (WorldPoint)var17);
            if (R.var9(var18)) {
                0;
                if (((0xEA ^ 0xA7) & ~(0x4A ^ 7)) == 0) continue;
                return;
            }
            Point var19 = Perspective.localToCanvas((Client)var15.bS, (LocalPoint)var18, (int)var15.bS.getPlane());
            if (R.var9(var19)) {
                0;
                
                return;
            }
            var15.a((Graphics2D)var14, new Color(var1[0], var1[1], var1[0], var1[2]), var18);
            OverlayUtil.renderTextLocation((Graphics2D)var14, (Point)var19, (String)String.valueOf(var13.get(var16)), (Color)Color.WHITE);
            0;
            if (3 > -1) continue;
            return;
        }
    }

    private static boolean var3(int n2) {
        return n2 != 0;
    }

    private static void var20() {
        var1 = new int[4];
        R.var1[0] = (0xDE ^ 0xC4) & ~(0x1D ^ 7);
        R.var1[1] = 191 + 22 - 157 + 172 + (21 + 103 - 57 + 123) - (0xFFFFE1F2 & 0x1F7D) + (135 + 24 - 135 + 181);
        R.var1[2] = 0x42 ^ 0x5B;
        R.var1[3] = 1;
    }

    private void g(Graphics2D graphics2D) {
        this.a(graphics2D, this.bT.Y());
        this.a(graphics2D, this.bT.X());
    }

    public Dimension render(Graphics2D graphics2D) {
        this.j(graphics2D);
        this.i(graphics2D);
        this.h(graphics2D);
        this.g(graphics2D);
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private void i(Graphics2D graphics2D) {
        Iterator<GroundObject> var21 = this.bT.Q().iterator();
        while (R.var3(var21.hasNext() ? 1 : 0)) {
            void var22;
            R var23;
            GroundObject var24 = var21.next();
            LocalPoint var25 = var24.getLocalLocation();
            var23.a((Graphics2D)var22, Color.GREEN, var25);
            0;
            if (-1 >= -1) continue;
            return;
        }
    }

    static {
        R.var20();
    }

    /*
     * WARNING - void declaration
     */
    private void j(Graphics2D graphics2D) {
        int n2 = var1[3];
        Iterator var26 = this.bT.RHelper().iterator();
        while (R.var3(var26.hasNext() ? 1 : 0)) {
            void var27;
            R var28;
            void var29;
            WorldPoint var30 = (WorldPoint)var26.next();
            ++var29;
            LocalPoint var31 = LocalPoint.fromWorld((Client)var28.bS, (WorldPoint)var30);
            if (R.var9(var31)) {
                0;
                if (((80 + 104 - 129 + 115 ^ 101 + 64 - 132 + 130) & (0xF0 ^ 0xB9 ^ (0x73 ^ 0x33) ^ -1)) >= 0) continue;
                return;
            }
            Point var32 = Perspective.tileCenter((Client)var28.bS, (WorldPoint)var30);
            Polygon var33 = Perspective.getCanvasTilePoly((Client)var28.bS, (LocalPoint)var31);
            if (!R.var34(var33)) continue;
            if (R.var9(var32)) {
                0;
                if (((155 + 112 - 113 + 15 ^ 23 + 109 - 67 + 67) & (0x73 ^ 0x42 ^ (0x36 ^ 0x2A) ^ -1)) < 3) continue;
                return;
            }
            OverlayUtil.renderPolygon((Graphics2D)var27, (Shape)var33, (Color)Color.GREEN);
            OverlayUtil.renderTextLocation((Graphics2D)var27, (Point)var32, (String)String.valueOf((int)(var29 - var1[3])), (Color)Color.GREEN);
            0;
            if (((0x80 ^ 0xB4) & ~(0 ^ 0x34)) <= 0) continue;
            return;
        }
    }

    private static boolean var9(Object object) {
        return object == null;
    }

    private static boolean var34(Object object) {
        return object != null;
    }

    private static boolean var5(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    protected RHelper(Client client, p p2, TOAConfig tOAConfig) {
        super(tOAConfig);
        this.bS = client;
        this.bT = p2;
        this.bU = tOAConfig;
        this.setPriority(OverlayPriority.HIGH);
        this.setPosition(OverlayPosition.DYNAMIC);
        this.setLayer(OverlayLayer.UNDER_WIDGETS);
    }
}

