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

public class R
extends AutotoaTaskBase {
    
    private final  p bT;
    private final  Client bS;
    private final  TOAConfig bU;

    /*
     * WARNING - void declaration
     */
    private void h(Graphics2D graphics2D) {
        void var1;
        List<WorldPoint> list = this.bT.V();
        if (R.lIlIlIIlIlIllI(list.isEmpty() ? 1 : 0)) {
            return;
        }
        int var2 = llIllIIllII[0];
        while (R.lIlIlIIlIllIII(var2, var1.size())) {
            R var3;
            WorldPoint var4 = (WorldPoint)var1.get(var2);
            LocalPoint var5 = LocalPoint.fromWorld((Client)var3.bS, (WorldPoint)var4);
            if (R.lIlIlIIlIlIlll(var5)) {

                if ((4 + 115 - 93 + 155 ^ 18 + 0 - -47 + 112) < (102 + 23 - 59 + 101 ^ 144 + 158 - 200 + 61)) {
                    return;
                }
            } else {
                Point var6 = Perspective.localToCanvas((Client)var3.bS, (LocalPoint)var5, (int)var3.bS.getPlane());
                if (R.lIlIlIIlIlIlll(var6)) {

                    if (3 == ((0xC8 ^ 0xC0) & ~(0x4D ^ 0x45))) {
                        return;
                    }
                } else {
                    void var7;
                    var3.a((Graphics2D)var7, new Color(llIllIIllII[0], llIllIIllII[1], llIllIIllII[0], llIllIIllII[2]), var5);
                    OverlayUtil.renderTextLocation((Graphics2D)var7, (Point)var6, (String)String.valueOf(var2 + llIllIIllII[3]), (Color)Color.WHITE);
                }
            }
            ++var2;

            if ((0x33 ^ 0x37) > 0) continue;
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    private void a(Graphics2D graphics2D, Map<GroundObject, Integer> map) {
        Iterator<GroundObject> var8 = map.keySet().iterator();
        while (R.lIlIlIIlIlIllI(var8.hasNext() ? 1 : 0)) {
            void var9;
            void var10;
            R var11;
            GroundObject var12 = var8.next();
            WorldPoint var13 = var12.getWorldLocation();
            LocalPoint var14 = LocalPoint.fromWorld((Client)var11.bS, (WorldPoint)var13);
            if (R.lIlIlIIlIlIlll(var14)) {

                if (((0xEA ^ 0xA7) & ~(0x4A ^ 7)) == 0) continue;
                return;
            }
            Point var15 = Perspective.localToCanvas((Client)var11.bS, (LocalPoint)var14, (int)var11.bS.getPlane());
            if (R.lIlIlIIlIlIlll(var15)) {

                if (((0x6A ^ 0x6F) & ~(0x16 ^ 0x13)) >= 0) continue;
                return;
            }
            var11.a((Graphics2D)var10, new Color(llIllIIllII[0], llIllIIllII[1], llIllIIllII[0], llIllIIllII[2]), var14);
            OverlayUtil.renderTextLocation((Graphics2D)var10, (Point)var15, (String)String.valueOf(var9.get(var12)), (Color)Color.WHITE);

            if (3 > -1) continue;
            return;
        }
    }

    private static boolean lIlIlIIlIlIllI(int n2) {
        return n2 != 0;
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
        Iterator<GroundObject> var16 = this.bT.Q().iterator();
        while (R.lIlIlIIlIlIllI(var16.hasNext() ? 1 : 0)) {
            void var17;
            R var18;
            GroundObject var19 = var16.next();
            LocalPoint var20 = var19.getLocalLocation();
            var18.a((Graphics2D)var17, Color.GREEN, var20);

            if (-1 >= -1) continue;
            return;
        }
    }

    static {
        R.lIlIlIIlIlIlIl();
    }

    /*
     * WARNING - void declaration
     */
    private void j(Graphics2D graphics2D) {
        int n2 = llIllIIllII[3];
        Iterator var21 = this.bT.R().iterator();
        while (R.lIlIlIIlIlIllI(var21.hasNext() ? 1 : 0)) {
            void var22;
            R var23;
            void var24;
            WorldPoint var25 = (WorldPoint)var21.next();
            ++var24;
            LocalPoint var26 = LocalPoint.fromWorld((Client)var23.bS, (WorldPoint)var25);
            if (R.lIlIlIIlIlIlll(var26)) {

                if (((80 + 104 - 129 + 115 ^ 101 + 64 - 132 + 130) & (0xF0 ^ 0xB9 ^ (0x73 ^ 0x33) ^ -1)) >= 0) continue;
                return;
            }
            Point var27 = Perspective.tileCenter((Client)var23.bS, (WorldPoint)var25);
            Polygon var28 = Perspective.getCanvasTilePoly((Client)var23.bS, (LocalPoint)var26);
            if (!R.lIlIlIIlIllIIl(var28)) continue;
            if (R.lIlIlIIlIlIlll(var27)) {

                if (((155 + 112 - 113 + 15 ^ 23 + 109 - 67 + 67) & (0x73 ^ 0x42 ^ (0x36 ^ 0x2A) ^ -1)) < 3) continue;
                return;
            }
            OverlayUtil.renderPolygon((Graphics2D)var22, (Shape)var28, (Color)Color.GREEN);
            OverlayUtil.renderTextLocation((Graphics2D)var22, (Point)var27, (String)String.valueOf((int)(var24 - llIllIIllII[3])), (Color)Color.GREEN);

            if (((0x80 ^ 0xB4) & ~(0 ^ 0x34)) <= 0) continue;
            return;
        }
    }

    private static boolean lIlIlIIlIlIlll(Object object) {
        return object == null;
    }

    private static boolean lIlIlIIlIllIIl(Object object) {
        return object != null;
    }

    private static boolean lIlIlIIlIllIII(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    protected R(Client client, p p2, TOAConfig tOAConfig) {
        super(tOAConfig);
        this.bS = client;
        this.bT = p2;
        this.bU = tOAConfig;
        this.setPriority(OverlayPriority.HIGH);
        this.setPosition(OverlayPosition.DYNAMIC);
        this.setLayer(OverlayLayer.UNDER_WIDGETS);
    }
}

