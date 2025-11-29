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
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

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
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.m;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.n;

public class M
extends Overlay {
    private static final /* synthetic */ Color[] bF;
    private final /* synthetic */ m bH;
    private static /* synthetic */ int[] lIllIllllII;
    private final /* synthetic */ Client bG;
    private final /* synthetic */ TOAConfig bI;

    /*
     * WARNING - void declaration
     */
    private void a(Graphics2D graphics2D) {
        Queue<n> queue = this.bH.G();
        HashSet hashSet = new HashSet();
        int n2 = lIllIllllII[0];
        Iterator llllllllllllllllIlIIlllllIIlIIII = queue.iterator();
        while (M.lIIllIIIIIlIlI(llllllllllllllllIlIIlllllIIlIIII.hasNext() ? 1 : 0)) {
            void llllllllllllllllIlIIlllllIIlIIlI;
            M llllllllllllllllIlIIlllllIIlIlIl;
            void llllllllllllllllIlIIlllllIIlIIIl;
            n llllllllllllllllIlIIlllllIIIllll = (n)((Object)llllllllllllllllIlIIlllllIIlIIII.next());
            if (M.lIIllIIIIIlIll((int)llllllllllllllllIlIIlllllIIlIIIl, lIllIllllII[1])) {
                "".length();
                if (" ".length() != "  ".length()) break;
                return;
            }
            WorldPoint llllllllllllllllIlIIlllllIIIlllI = llllllllllllllllIlIIlllllIIIllll.a(llllllllllllllllIlIIlllllIIlIlIl.bG);
            if (M.lIIllIIIIIlIlI(llllllllllllllllIlIIlllllIIlIIlI.contains(llllllllllllllllIlIIlllllIIIlllI) ? 1 : 0)) {
                "".length();
                if (-(158 + 155 - 209 + 57 ^ 82 + 110 - 106 + 78) < 0) break;
                return;
            }
            Color llllllllllllllllIlIIlllllIIIllIl = bF[llllllllllllllllIlIIlllllIIlIIIl];
            llllllllllllllllIlIIlllllIIlIIlI.add(llllllllllllllllIlIIlllllIIIlllI);
            "".length();
            ++llllllllllllllllIlIIlllllIIlIIIl;
            int llllllllllllllllIlIIlllllIIIllII = lIllIllllII[2];
            while (M.lIIllIIIIIllII(llllllllllllllllIlIIlllllIIIllII, lIllIllllII[3])) {
                int llllllllllllllllIlIIlllllIIIlIll = lIllIllllII[2];
                while (M.lIIllIIIIIllII(llllllllllllllllIlIIlllllIIIlIll, lIllIllllII[3])) {
                    WorldPoint llllllllllllllllIlIIlllllIIIlIlI = llllllllllllllllIlIIlllllIIIlllI.dx(llllllllllllllllIlIIlllllIIIllII).dy(llllllllllllllllIlIIlllllIIIlIll);
                    LocalPoint llllllllllllllllIlIIlllllIIIlIIl = LocalPoint.fromWorld((Client)llllllllllllllllIlIIlllllIIlIlIl.bG, (WorldPoint)llllllllllllllllIlIIlllllIIIlIlI);
                    if (M.lIIllIIIIIllIl(llllllllllllllllIlIIlllllIIIlIIl)) {
                        "".length();
                        if ("   ".length() == 0) {
                            return;
                        }
                    } else {
                        Point llllllllllllllllIlIIlllllIIIlIII = Perspective.tileCenter((Client)llllllllllllllllIlIIlllllIIlIlIl.bG, (WorldPoint)llllllllllllllllIlIIlllllIIIlllI);
                        Polygon llllllllllllllllIlIIlllllIIIIlll = Perspective.getCanvasTilePoly((Client)llllllllllllllllIlIIlllllIIlIlIl.bG, (LocalPoint)llllllllllllllllIlIIlllllIIIlIIl);
                        if (M.lIIllIIIIIlllI(llllllllllllllllIlIIlllllIIIIlll)) {
                            if (M.lIIllIIIIIllIl(llllllllllllllllIlIIlllllIIIlIII)) {
                                "".length();
                                if (-" ".length() >= 0) {
                                    return;
                                }
                            } else {
                                void llllllllllllllllIlIIlllllIIlIlII;
                                OverlayUtil.renderPolygon((Graphics2D)llllllllllllllllIlIIlllllIIlIlII, (Shape)llllllllllllllllIlIIlllllIIIIlll, (Color)llllllllllllllllIlIIlllllIIIllIl, (Color)new Color(llllllllllllllllIlIIlllllIIIllIl.getRed(), llllllllllllllllIlIIlllllIIIllIl.getGreen(), llllllllllllllllIlIIlllllIIIllIl.getBlue(), lIllIllllII[4]), (Stroke)new BasicStroke(1.0f));
                            }
                        }
                    }
                    ++llllllllllllllllIlIIlllllIIIlIll;
                    "".length();
                    if ("   ".length() > -" ".length()) continue;
                    return;
                }
                ++llllllllllllllllIlIIlllllIIIllII;
                "".length();
                if ("  ".length() >= "  ".length()) continue;
                return;
            }
            "".length();
            if (null == null) continue;
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

    private static void lIIllIIIIIlIIl() {
        lIllIllllII = new int[8];
        M.lIllIllllII[0] = (132 + 158 - 165 + 52 ^ 138 + 132 - 138 + 32) & (5 + 96 - 46 + 119 ^ 25 + 98 - -48 + 16 ^ -" ".length());
        M.lIllIllllII[1] = "  ".length();
        M.lIllIllllII[2] = -" ".length();
        M.lIllIllllII[3] = " ".length();
        M.lIllIllllII[4] = 0x36 ^ 0x2F;
        M.lIllIllllII[5] = 0x6F ^ 0x2A ^ (0xF5 ^ 0xB5);
        M.lIllIllllII[6] = "   ".length();
        M.lIllIllllII[7] = 133 + 127 - 219 + 141 ^ 11 + 58 - -44 + 65;
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

