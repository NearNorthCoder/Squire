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
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.S;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.p;

public class R
extends S {
    private static /* synthetic */ int[] llIllIIllII;
    private final /* synthetic */ p bT;
    private final /* synthetic */ Client bS;
    private final /* synthetic */ TOAConfig bU;

    /*
     * WARNING - void declaration
     */
    private void h(Graphics2D graphics2D) {
        void llllllllllllllllIIlIlllIIIlIlIlI;
        List<WorldPoint> list = this.bT.V();
        if (R.lIlIlIIlIlIllI(list.isEmpty() ? 1 : 0)) {
            return;
        }
        int llllllllllllllllIIlIlllIIIlIlIIl = llIllIIllII[0];
        while (R.lIlIlIIlIllIII(llllllllllllllllIIlIlllIIIlIlIIl, llllllllllllllllIIlIlllIIIlIlIlI.size())) {
            R llllllllllllllllIIlIlllIIIlIllII;
            WorldPoint llllllllllllllllIIlIlllIIIlIlIII = (WorldPoint)llllllllllllllllIIlIlllIIIlIlIlI.get(llllllllllllllllIIlIlllIIIlIlIIl);
            LocalPoint llllllllllllllllIIlIlllIIIlIIlll = LocalPoint.fromWorld((Client)llllllllllllllllIIlIlllIIIlIllII.bS, (WorldPoint)llllllllllllllllIIlIlllIIIlIlIII);
            if (R.lIlIlIIlIlIlll(llllllllllllllllIIlIlllIIIlIIlll)) {
                "".length();
                if ((4 + 115 - 93 + 155 ^ 18 + 0 - -47 + 112) < (102 + 23 - 59 + 101 ^ 144 + 158 - 200 + 61)) {
                    return;
                }
            } else {
                Point llllllllllllllllIIlIlllIIIlIIllI = Perspective.localToCanvas((Client)llllllllllllllllIIlIlllIIIlIllII.bS, (LocalPoint)llllllllllllllllIIlIlllIIIlIIlll, (int)llllllllllllllllIIlIlllIIIlIllII.bS.getPlane());
                if (R.lIlIlIIlIlIlll(llllllllllllllllIIlIlllIIIlIIllI)) {
                    "".length();
                    if ("   ".length() == ((0xC8 ^ 0xC0) & ~(0x4D ^ 0x45))) {
                        return;
                    }
                } else {
                    void llllllllllllllllIIlIlllIIIlIlIll;
                    llllllllllllllllIIlIlllIIIlIllII.a((Graphics2D)llllllllllllllllIIlIlllIIIlIlIll, new Color(llIllIIllII[0], llIllIIllII[1], llIllIIllII[0], llIllIIllII[2]), llllllllllllllllIIlIlllIIIlIIlll);
                    OverlayUtil.renderTextLocation((Graphics2D)llllllllllllllllIIlIlllIIIlIlIll, (Point)llllllllllllllllIIlIlllIIIlIIllI, (String)String.valueOf(llllllllllllllllIIlIlllIIIlIlIIl + llIllIIllII[3]), (Color)Color.WHITE);
                }
            }
            ++llllllllllllllllIIlIlllIIIlIlIIl;
            "".length();
            if ((0x33 ^ 0x37) > 0) continue;
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    private void a(Graphics2D graphics2D, Map<GroundObject, Integer> map) {
        Iterator<GroundObject> llllllllllllllllIIlIlllIIIlllIII = map.keySet().iterator();
        while (R.lIlIlIIlIlIllI(llllllllllllllllIIlIlllIIIlllIII.hasNext() ? 1 : 0)) {
            void llllllllllllllllIIlIlllIIIlllIIl;
            void llllllllllllllllIIlIlllIIIlllIlI;
            R llllllllllllllllIIlIlllIIIlllIll;
            GroundObject llllllllllllllllIIlIlllIIIllIlll = llllllllllllllllIIlIlllIIIlllIII.next();
            WorldPoint llllllllllllllllIIlIlllIIIllIllI = llllllllllllllllIIlIlllIIIllIlll.getWorldLocation();
            LocalPoint llllllllllllllllIIlIlllIIIllIlIl = LocalPoint.fromWorld((Client)llllllllllllllllIIlIlllIIIlllIll.bS, (WorldPoint)llllllllllllllllIIlIlllIIIllIllI);
            if (R.lIlIlIIlIlIlll(llllllllllllllllIIlIlllIIIllIlIl)) {
                "".length();
                if (((0xEA ^ 0xA7) & ~(0x4A ^ 7)) == 0) continue;
                return;
            }
            Point llllllllllllllllIIlIlllIIIllIlII = Perspective.localToCanvas((Client)llllllllllllllllIIlIlllIIIlllIll.bS, (LocalPoint)llllllllllllllllIIlIlllIIIllIlIl, (int)llllllllllllllllIIlIlllIIIlllIll.bS.getPlane());
            if (R.lIlIlIIlIlIlll(llllllllllllllllIIlIlllIIIllIlII)) {
                "".length();
                if (((0x6A ^ 0x6F) & ~(0x16 ^ 0x13)) >= 0) continue;
                return;
            }
            llllllllllllllllIIlIlllIIIlllIll.a((Graphics2D)llllllllllllllllIIlIlllIIIlllIlI, new Color(llIllIIllII[0], llIllIIllII[1], llIllIIllII[0], llIllIIllII[2]), llllllllllllllllIIlIlllIIIllIlIl);
            OverlayUtil.renderTextLocation((Graphics2D)llllllllllllllllIIlIlllIIIlllIlI, (Point)llllllllllllllllIIlIlllIIIllIlII, (String)String.valueOf(llllllllllllllllIIlIlllIIIlllIIl.get(llllllllllllllllIIlIlllIIIllIlll)), (Color)Color.WHITE);
            "".length();
            if ("   ".length() > -" ".length()) continue;
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
        R.llIllIIllII[3] = " ".length();
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
        Iterator<GroundObject> llllllllllllllllIIlIlllIIIIllllI = this.bT.Q().iterator();
        while (R.lIlIlIIlIlIllI(llllllllllllllllIIlIlllIIIIllllI.hasNext() ? 1 : 0)) {
            void llllllllllllllllIIlIlllIIIIlllll;
            R llllllllllllllllIIlIlllIIIlIIIII;
            GroundObject llllllllllllllllIIlIlllIIIIlllIl = llllllllllllllllIIlIlllIIIIllllI.next();
            LocalPoint llllllllllllllllIIlIlllIIIIlllII = llllllllllllllllIIlIlllIIIIlllIl.getLocalLocation();
            llllllllllllllllIIlIlllIIIlIIIII.a((Graphics2D)llllllllllllllllIIlIlllIIIIlllll, Color.GREEN, llllllllllllllllIIlIlllIIIIlllII);
            "".length();
            if (-" ".length() >= -" ".length()) continue;
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
        Iterator llllllllllllllllIIlIlllIIIIlIIII = this.bT.R().iterator();
        while (R.lIlIlIIlIlIllI(llllllllllllllllIIlIlllIIIIlIIII.hasNext() ? 1 : 0)) {
            void llllllllllllllllIIlIlllIIIIlIIlI;
            R llllllllllllllllIIlIlllIIIIlIIll;
            void llllllllllllllllIIlIlllIIIIlIIIl;
            WorldPoint llllllllllllllllIIlIlllIIIIIllll = (WorldPoint)llllllllllllllllIIlIlllIIIIlIIII.next();
            ++llllllllllllllllIIlIlllIIIIlIIIl;
            LocalPoint llllllllllllllllIIlIlllIIIIIlllI = LocalPoint.fromWorld((Client)llllllllllllllllIIlIlllIIIIlIIll.bS, (WorldPoint)llllllllllllllllIIlIlllIIIIIllll);
            if (R.lIlIlIIlIlIlll(llllllllllllllllIIlIlllIIIIIlllI)) {
                "".length();
                if (((80 + 104 - 129 + 115 ^ 101 + 64 - 132 + 130) & (0xF0 ^ 0xB9 ^ (0x73 ^ 0x33) ^ -" ".length())) >= 0) continue;
                return;
            }
            Point llllllllllllllllIIlIlllIIIIIllIl = Perspective.tileCenter((Client)llllllllllllllllIIlIlllIIIIlIIll.bS, (WorldPoint)llllllllllllllllIIlIlllIIIIIllll);
            Polygon llllllllllllllllIIlIlllIIIIIllII = Perspective.getCanvasTilePoly((Client)llllllllllllllllIIlIlllIIIIlIIll.bS, (LocalPoint)llllllllllllllllIIlIlllIIIIIlllI);
            if (!R.lIlIlIIlIllIIl(llllllllllllllllIIlIlllIIIIIllII)) continue;
            if (R.lIlIlIIlIlIlll(llllllllllllllllIIlIlllIIIIIllIl)) {
                "".length();
                if (((155 + 112 - 113 + 15 ^ 23 + 109 - 67 + 67) & (0x73 ^ 0x42 ^ (0x36 ^ 0x2A) ^ -" ".length())) < "   ".length()) continue;
                return;
            }
            OverlayUtil.renderPolygon((Graphics2D)llllllllllllllllIIlIlllIIIIlIIlI, (Shape)llllllllllllllllIIlIlllIIIIIllII, (Color)Color.GREEN);
            OverlayUtil.renderTextLocation((Graphics2D)llllllllllllllllIIlIlllIIIIlIIlI, (Point)llllllllllllllllIIlIlllIIIIIllIl, (String)String.valueOf((int)(llllllllllllllllIIlIlllIIIIlIIIl - llIllIIllII[3])), (Color)Color.GREEN);
            "".length();
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

