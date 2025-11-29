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
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

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
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.S_Unknown;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.p_Unknown;

public class R_Unknown
extends S_Unknown {
    private static /* synthetic */ int[] llIllIIllII;
    private final /* synthetic */ p bT;
    private final /* synthetic */ Client bS;
    private final /* synthetic */ TOAConfig bU;

    /*
     * WARNING - void declaration
     */
    private void h(Graphics2D graphics2D) {
        void var4;
        List<WorldPoint> list = this.bT.V();
        if (R.lIlIlIIlIlIllI(list.isEmpty() ? 1 : 0)) {
            return;
        }
        int var15 = llIllIIllII[0];
        while (R.lIlIlIIlIllIII(var15, var4.size())) {
            R var10;
            WorldPoint var27 = (WorldPoint)var4.get(var15);
            LocalPoint var25 = LocalPoint.fromWorld((Client)var10.bS, (WorldPoint)var27);
            if (R.lIlIlIIlIlIlll(var25)) {
                0;
                if ((4 + 115 - 93 + 155 ^ 18 + 0 - -47 + 112) < (102 + 23 - 59 + 101 ^ 144 + 158 - 200 + 61)) {
                    return;
                }
            } else {
                Point var23 = Perspective.localToCanvas((Client)var10.bS, (LocalPoint)var25, (int)var10.bS.getPlane());
                if (R.lIlIlIIlIlIlll(var23)) {
                    0;
                    if (3 == ((0xC8 ^ 0xC0) & ~(0x4D ^ 0x45))) {
                        return;
                    }
                } else {
                    void var12;
                    var10.a((Graphics2D)var12, new Color(llIllIIllII[0], llIllIIllII[1], llIllIIllII[0], llIllIIllII[2]), var25);
                    OverlayUtil.renderTextLocation((Graphics2D)var12, (Point)var23, (String)String.valueOf(var15 + llIllIIllII[3]), (Color)Color.WHITE);
                }
            }
            ++var15;
            0;
            if ((0x33 ^ 0x37) > 0) continue;
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    private void a(Graphics2D graphics2D, Map<GroundObject, Integer> map) {
        Iterator<GroundObject> var1 = map.keySet().iterator();
        while (R.lIlIlIIlIlIllI(var1.hasNext() ? 1 : 0)) {
            void var7;
            void var14;
            R var16;
            GroundObject var11 = var1.next();
            WorldPoint var13 = var11.getWorldLocation();
            LocalPoint var19 = LocalPoint.fromWorld((Client)var16.bS, (WorldPoint)var13);
            if (R.lIlIlIIlIlIlll(var19)) {
                0;
                if (((0xEA ^ 0xA7) & ~(0x4A ^ 7)) == 0) continue;
                return;
            }
            Point var28 = Perspective.localToCanvas((Client)var16.bS, (LocalPoint)var19, (int)var16.bS.getPlane());
            if (R.lIlIlIIlIlIlll(var28)) {
                0;
                if (((0x6A ^ 0x6F) & ~(0x16 ^ 0x13)) >= 0) continue;
                return;
            }
            var16.a((Graphics2D)var14, new Color(llIllIIllII[0], llIllIIllII[1], llIllIIllII[0], llIllIIllII[2]), var19);
            OverlayUtil.renderTextLocation((Graphics2D)var14, (Point)var28, (String)String.valueOf(var7.get(var11)), (Color)Color.WHITE);
            0;
            if (3 > -1) continue;
            return;
        }
    }

    private static boolean lIlIlIIlIlIllI(int n2) {
        return n2 != 0;
    }

    private static void lIlIlIIlIlIlIl() {
        llIllIIllII = new int[4];
        R.llIllIIllII[0] = (0xDE ^ 0xC4) & ~(0x1D ^ 7);
        R.llIllIIllII[1] = 191 + 22 - 157 + 172 + (21 + 103 - 57 + 123) - (0xFFFFE1F2 & 0x1F7D) + (135 + 24 - 135 + 181);
        R.llIllIIllII[2] = 0x42 ^ 0x5B;
        R.llIllIIllII[3] = 1;
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
        Iterator<GroundObject> var17 = this.bT.Q().iterator();
        while (R.lIlIlIIlIlIllI(var17.hasNext() ? 1 : 0)) {
            void var8;
            R var3;
            GroundObject var2 = var17.next();
            LocalPoint var5 = var2.getLocalLocation();
            var3.a((Graphics2D)var8, Color.GREEN, var5);
            0;
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
        Iterator var9 = this.bT.R().iterator();
        while (R.lIlIlIIlIlIllI(var9.hasNext() ? 1 : 0)) {
            void var24;
            R var26;
            void var20;
            WorldPoint var6 = (WorldPoint)var9.next();
            ++var20;
            LocalPoint var21 = LocalPoint.fromWorld((Client)var26.bS, (WorldPoint)var6);
            if (R.lIlIlIIlIlIlll(var21)) {
                0;
                if (((80 + 104 - 129 + 115 ^ 101 + 64 - 132 + 130) & (0xF0 ^ 0xB9 ^ (0x73 ^ 0x33) ^ -1)) >= 0) continue;
                return;
            }
            Point var18 = Perspective.tileCenter((Client)var26.bS, (WorldPoint)var6);
            Polygon var22 = Perspective.getCanvasTilePoly((Client)var26.bS, (LocalPoint)var21);
            if (!R.lIlIlIIlIllIIl(var22)) continue;
            if (R.lIlIlIIlIlIlll(var18)) {
                0;
                if (((155 + 112 - 113 + 15 ^ 23 + 109 - 67 + 67) & (0x73 ^ 0x42 ^ (0x36 ^ 0x2A) ^ -1)) < 3) continue;
                return;
            }
            OverlayUtil.renderPolygon((Graphics2D)var24, (Shape)var22, (Color)Color.GREEN);
            OverlayUtil.renderTextLocation((Graphics2D)var24, (Point)var18, (String)String.valueOf((int)(var20 - llIllIIllII[3])), (Color)Color.GREEN);
            0;
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

