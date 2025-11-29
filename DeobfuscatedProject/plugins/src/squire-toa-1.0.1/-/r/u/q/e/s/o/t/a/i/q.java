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
package -.r.u.q.e.s.o.t.a.i;

import -.r.u.q.e.s.o.t.a.i.h;
import -.r.u.q.e.s.o.t.a.i.i;
import gg.squire.toa.TOAConfig;
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

public class q
extends Overlay {
    private static /* synthetic */ int[] lIIllllIllllI;
    private static final /* synthetic */ Color[] as;
    private final /* synthetic */ h au;
    private final /* synthetic */ Client at;
    private final /* synthetic */ TOAConfig av;

    private static boolean lIllIlIIlllIIII(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIlIIlllIlII(Object object) {
        return object == null;
    }

    @Inject
    protected q(Client client, h h2, TOAConfig tOAConfig) {
        this.at = client;
        this.au = h2;
        this.av = tOAConfig;
        this.setPriority(OverlayPriority.HIGH);
        this.setPosition(OverlayPosition.DYNAMIC);
        this.setLayer(OverlayLayer.UNDER_WIDGETS);
    }

    private static boolean lIllIlIIlllIIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIlIIlllIIll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIllIlIIlllIlIl(Object object) {
        return object != null;
    }

    private static boolean lIllIlIIlllIIlI(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    private void a(Graphics2D graphics2D) {
        q llllllllllllllIlllIlIIIlIIIIlIII;
        if (q.lIllIlIIlllIIII(this.av.markSectionOrder() ? 1 : 0)) {
            return;
        }
        Queue<i> llllllllllllllIlllIlIIIlIIIIIllI = llllllllllllllIlllIlIIIlIIIIlIII.au.i();
        HashSet<WorldPoint> llllllllllllllIlllIlIIIlIIIIIlIl = new HashSet<WorldPoint>();
        int llllllllllllllIlllIlIIIlIIIIIlII = lIIllllIllllI[0];
        Iterator llllllllllllllIlllIlIIIlIIIIIIll = llllllllllllllIlllIlIIIlIIIIIllI.iterator();
        while (q.lIllIlIIlllIIIl(llllllllllllllIlllIlIIIlIIIIIIll.hasNext() ? 1 : 0)) {
            i llllllllllllllIlllIlIIIlIIIIIIlI = (i)((Object)llllllllllllllIlllIlIIIlIIIIIIll.next());
            if (q.lIllIlIIlllIIlI(llllllllllllllIlllIlIIIlIIIIIlII, lIIllllIllllI[1])) {
                "".length();
                if ("  ".length() > 0) break;
                return;
            }
            WorldPoint llllllllllllllIlllIlIIIlIIIIIIIl = llllllllllllllIlllIlIIIlIIIIIIlI.a(llllllllllllllIlllIlIIIlIIIIlIII.at);
            if (q.lIllIlIIlllIIIl(llllllllllllllIlllIlIIIlIIIIIlIl.contains(llllllllllllllIlllIlIIIlIIIIIIIl) ? 1 : 0)) {
                "".length();
                if (-(0x8A ^ 0xA5 ^ (0x25 ^ 0xF)) < 0) break;
                return;
            }
            Color llllllllllllllIlllIlIIIlIIIIIIII = as[llllllllllllllIlllIlIIIlIIIIIlII];
            llllllllllllllIlllIlIIIlIIIIIlIl.add(llllllllllllllIlllIlIIIlIIIIIIIl);
            "".length();
            ++llllllllllllllIlllIlIIIlIIIIIlII;
            int llllllllllllllIlllIlIIIIllllllll = lIIllllIllllI[2];
            while (q.lIllIlIIlllIIll(llllllllllllllIlllIlIIIIllllllll, lIIllllIllllI[3])) {
                int llllllllllllllIlllIlIIIIlllllllI = lIIllllIllllI[2];
                while (q.lIllIlIIlllIIll(llllllllllllllIlllIlIIIIlllllllI, lIIllllIllllI[3])) {
                    WorldPoint llllllllllllllIlllIlIIIIllllllIl = llllllllllllllIlllIlIIIlIIIIIIIl.dx(llllllllllllllIlllIlIIIIllllllll).dy(llllllllllllllIlllIlIIIIlllllllI);
                    LocalPoint llllllllllllllIlllIlIIIIllllllII = LocalPoint.fromWorld((Client)llllllllllllllIlllIlIIIlIIIIlIII.at, (WorldPoint)llllllllllllllIlllIlIIIIllllllIl);
                    if (q.lIllIlIIlllIlII(llllllllllllllIlllIlIIIIllllllII)) {
                        "".length();
                        if (((0x31 ^ 0x52) & ~(0xD2 ^ 0xB1)) >= (0xA ^ 0xE)) {
                            return;
                        }
                    } else {
                        Point llllllllllllllIlllIlIIIIlllllIll = Perspective.tileCenter((Client)llllllllllllllIlllIlIIIlIIIIlIII.at, (WorldPoint)llllllllllllllIlllIlIIIlIIIIIIIl);
                        Polygon llllllllllllllIlllIlIIIIlllllIlI = Perspective.getCanvasTilePoly((Client)llllllllllllllIlllIlIIIlIIIIlIII.at, (LocalPoint)llllllllllllllIlllIlIIIIllllllII);
                        if (q.lIllIlIIlllIlIl(llllllllllllllIlllIlIIIIlllllIlI)) {
                            if (q.lIllIlIIlllIlII(llllllllllllllIlllIlIIIIlllllIll)) {
                                "".length();
                                if (null != null) {
                                    return;
                                }
                            } else {
                                void llllllllllllllIlllIlIIIlIIIIIlll;
                                OverlayUtil.renderPolygon((Graphics2D)llllllllllllllIlllIlIIIlIIIIIlll, (Shape)llllllllllllllIlllIlIIIIlllllIlI, (Color)llllllllllllllIlllIlIIIlIIIIIIII, (Color)new Color(llllllllllllllIlllIlIIIlIIIIIIII.getRed(), llllllllllllllIlllIlIIIlIIIIIIII.getGreen(), llllllllllllllIlllIlIIIlIIIIIIII.getBlue(), lIIllllIllllI[4]), (Stroke)new BasicStroke(1.0f));
                            }
                        }
                    }
                    ++llllllllllllllIlllIlIIIIlllllllI;
                    "".length();
                    if (-" ".length() >= -" ".length()) continue;
                    return;
                }
                ++llllllllllllllIlllIlIIIIllllllll;
                "".length();
                if ("   ".length() != 0) continue;
                return;
            }
            "".length();
            if (null == null) continue;
            return;
        }
    }

    private static void lIllIlIIllIllll() {
        lIIllllIllllI = new int[8];
        q.lIIllllIllllI[0] = (0x44 ^ 0x73 ^ (0x7F ^ 0x40)) & (131 + 41 - 159 + 119 ^ 62 + 91 - 30 + 17 ^ -" ".length());
        q.lIIllllIllllI[1] = "  ".length();
        q.lIIllllIllllI[2] = -" ".length();
        q.lIIllllIllllI[3] = " ".length();
        q.lIIllllIllllI[4] = 0x12 ^ 0x72 ^ (7 ^ 0x7E);
        q.lIIllllIllllI[5] = 0xA8 ^ 0xAD;
        q.lIIllllIllllI[6] = "   ".length();
        q.lIIllllIllllI[7] = 0x4A ^ 0x22 ^ (0x25 ^ 0x49);
    }

    public Dimension render(Graphics2D graphics2D) {
        this.a(graphics2D);
        return null;
    }

    static {
        q.lIllIlIIllIllll();
        Color[] colorArray = new Color[lIIllllIllllI[5]];
        colorArray[q.lIIllllIllllI[0]] = Color.GREEN;
        colorArray[q.lIIllllIllllI[3]] = Color.ORANGE;
        colorArray[q.lIIllllIllllI[1]] = Color.YELLOW;
        colorArray[q.lIIllllIllllI[6]] = Color.RED;
        colorArray[q.lIIllllIllllI[7]] = Color.BLACK;
        as = colorArray;
    }
}

