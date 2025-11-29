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
        Iterator<GroundObject> llllllllllllllIlllIIllllIIIIIlII = map.keySet().iterator();
        while (v.lIllIlIlIllllII(llllllllllllllIlllIIllllIIIIIlII.hasNext() ? 1 : 0)) {
            void llllllllllllllIlllIIllllIIIIIlIl;
            void llllllllllllllIlllIIllllIIIIIllI;
            v llllllllllllllIlllIIllllIIIIIlll;
            GroundObject llllllllllllllIlllIIllllIIIIIIll = llllllllllllllIlllIIllllIIIIIlII.next();
            WorldPoint llllllllllllllIlllIIllllIIIIIIlI = llllllllllllllIlllIIllllIIIIIIll.getWorldLocation();
            LocalPoint llllllllllllllIlllIIllllIIIIIIIl = LocalPoint.fromWorld((Client)llllllllllllllIlllIIllllIIIIIlll.aF, (WorldPoint)llllllllllllllIlllIIllllIIIIIIlI);
            if (v.lIllIlIlIllllIl(llllllllllllllIlllIIllllIIIIIIIl)) {
                "".length();
                if (null == null) continue;
                return;
            }
            Point llllllllllllllIlllIIllllIIIIIIII = Perspective.localToCanvas((Client)llllllllllllllIlllIIllllIIIIIlll.aF, (LocalPoint)llllllllllllllIlllIIllllIIIIIIIl, (int)llllllllllllllIlllIIllllIIIIIlll.aF.getPlane());
            if (v.lIllIlIlIllllIl(llllllllllllllIlllIIllllIIIIIIII)) {
                "".length();
                if (" ".length() != "   ".length()) continue;
                return;
            }
            llllllllllllllIlllIIllllIIIIIlll.a((Graphics2D)llllllllllllllIlllIIllllIIIIIllI, new Color(lIIlllllllIII[0], lIIlllllllIII[1], lIIlllllllIII[0], lIIlllllllIII[2]), llllllllllllllIlllIIllllIIIIIIIl);
            OverlayUtil.renderTextLocation((Graphics2D)llllllllllllllIlllIIllllIIIIIllI, (Point)llllllllllllllIlllIIllllIIIIIIII, (String)String.valueOf(llllllllllllllIlllIIllllIIIIIlIl.get(llllllllllllllIlllIIllllIIIIIIll)), (Color)Color.WHITE);
            "".length();
            if (null == null) continue;
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    private void j(Graphics2D graphics2D) {
        int n2 = lIIlllllllIII[3];
        Iterator llllllllllllllIlllIIlllIllIlllII = this.aG.q().iterator();
        while (v.lIllIlIlIllllII(llllllllllllllIlllIIlllIllIlllII.hasNext() ? 1 : 0)) {
            void llllllllllllllIlllIIlllIllIllllI;
            v llllllllllllllIlllIIlllIllIlllll;
            void llllllllllllllIlllIIlllIllIlllIl;
            WorldPoint llllllllllllllIlllIIlllIllIllIll = (WorldPoint)llllllllllllllIlllIIlllIllIlllII.next();
            ++llllllllllllllIlllIIlllIllIlllIl;
            LocalPoint llllllllllllllIlllIIlllIllIllIlI = LocalPoint.fromWorld((Client)llllllllllllllIlllIIlllIllIlllll.aF, (WorldPoint)llllllllllllllIlllIIlllIllIllIll);
            if (v.lIllIlIlIllllIl(llllllllllllllIlllIIlllIllIllIlI)) {
                "".length();
                if ("   ".length() > 0) continue;
                return;
            }
            Point llllllllllllllIlllIIlllIllIllIIl = Perspective.tileCenter((Client)llllllllllllllIlllIIlllIllIlllll.aF, (WorldPoint)llllllllllllllIlllIIlllIllIllIll);
            Polygon llllllllllllllIlllIIlllIllIllIII = Perspective.getCanvasTilePoly((Client)llllllllllllllIlllIIlllIllIlllll.aF, (LocalPoint)llllllllllllllIlllIIlllIllIllIlI);
            if (!v.lIllIlIlIllllll(llllllllllllllIlllIIlllIllIllIII)) continue;
            if (v.lIllIlIlIllllIl(llllllllllllllIlllIIlllIllIllIIl)) {
                "".length();
                if ((0x7C ^ 0x78) > ((0x35 ^ 0x29) & ~(0x56 ^ 0x4A))) continue;
                return;
            }
            OverlayUtil.renderPolygon((Graphics2D)llllllllllllllIlllIIlllIllIllllI, (Shape)llllllllllllllIlllIIlllIllIllIII, (Color)Color.GREEN);
            OverlayUtil.renderTextLocation((Graphics2D)llllllllllllllIlllIIlllIllIllllI, (Point)llllllllllllllIlllIIlllIllIllIIl, (String)String.valueOf((int)(llllllllllllllIlllIIlllIllIlllIl - lIIlllllllIII[3])), (Color)Color.GREEN);
            "".length();
            if (null == null) continue;
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    private void h(Graphics2D graphics2D) {
        void llllllllllllllIlllIIlllIllllIllI;
        List<WorldPoint> list = this.aG.u();
        if (v.lIllIlIlIllllII(list.isEmpty() ? 1 : 0)) {
            return;
        }
        int llllllllllllllIlllIIlllIllllIlIl = lIIlllllllIII[0];
        while (v.lIllIlIlIlllllI(llllllllllllllIlllIIlllIllllIlIl, llllllllllllllIlllIIlllIllllIllI.size())) {
            v llllllllllllllIlllIIlllIlllllIII;
            WorldPoint llllllllllllllIlllIIlllIllllIlII = (WorldPoint)llllllllllllllIlllIIlllIllllIllI.get(llllllllllllllIlllIIlllIllllIlIl);
            LocalPoint llllllllllllllIlllIIlllIllllIIll = LocalPoint.fromWorld((Client)llllllllllllllIlllIIlllIlllllIII.aF, (WorldPoint)llllllllllllllIlllIIlllIllllIlII);
            if (v.lIllIlIlIllllIl(llllllllllllllIlllIIlllIllllIIll)) {
                "".length();
                if (null != null) {
                    return;
                }
            } else {
                Point llllllllllllllIlllIIlllIllllIIlI = Perspective.localToCanvas((Client)llllllllllllllIlllIIlllIlllllIII.aF, (LocalPoint)llllllllllllllIlllIIlllIllllIIll, (int)llllllllllllllIlllIIlllIlllllIII.aF.getPlane());
                if (v.lIllIlIlIllllIl(llllllllllllllIlllIIlllIllllIIlI)) {
                    "".length();
                    if (null != null) {
                        return;
                    }
                } else {
                    void llllllllllllllIlllIIlllIllllIlll;
                    llllllllllllllIlllIIlllIlllllIII.a((Graphics2D)llllllllllllllIlllIIlllIllllIlll, new Color(lIIlllllllIII[0], lIIlllllllIII[1], lIIlllllllIII[0], lIIlllllllIII[2]), llllllllllllllIlllIIlllIllllIIll);
                    OverlayUtil.renderTextLocation((Graphics2D)llllllllllllllIlllIIlllIllllIlll, (Point)llllllllllllllIlllIIlllIllllIIlI, (String)String.valueOf(llllllllllllllIlllIIlllIllllIlIl + lIIlllllllIII[3]), (Color)Color.WHITE);
                }
            }
            ++llllllllllllllIlllIIlllIllllIlIl;
            "".length();
            if (-" ".length() < 0) continue;
            return;
        }
    }

    private static boolean lIllIlIlIllllII(int n2) {
        return n2 != 0;
    }

    private static void lIllIlIlIlllIll() {
        lIIlllllllIII = new int[4];
        v.lIIlllllllIII[0] = (137 + 21 - 117 + 154 ^ 82 + 23 - 42 + 85) & (0x7F ^ 0x4B ^ (0x5C ^ 0x3F) ^ -" ".length());
        v.lIIlllllllIII[1] = 64 + 32 - -123 + 36;
        v.lIIlllllllIII[2] = 0x24 ^ 0x3D;
        v.lIIlllllllIII[3] = " ".length();
    }

    /*
     * WARNING - void declaration
     */
    private void i(Graphics2D graphics2D) {
        Iterator<GroundObject> llllllllllllllIlllIIlllIlllIlIlI = this.aG.p().iterator();
        while (v.lIllIlIlIllllII(llllllllllllllIlllIIlllIlllIlIlI.hasNext() ? 1 : 0)) {
            void llllllllllllllIlllIIlllIlllIlIll;
            v llllllllllllllIlllIIlllIlllIllII;
            GroundObject llllllllllllllIlllIIlllIlllIlIIl = llllllllllllllIlllIIlllIlllIlIlI.next();
            LocalPoint llllllllllllllIlllIIlllIlllIlIII = llllllllllllllIlllIIlllIlllIlIIl.getLocalLocation();
            llllllllllllllIlllIIlllIlllIllII.a((Graphics2D)llllllllllllllIlllIIlllIlllIlIll, Color.GREEN, llllllllllllllIlllIIlllIlllIlIII);
            "".length();
            if (-" ".length() != "   ".length()) continue;
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

