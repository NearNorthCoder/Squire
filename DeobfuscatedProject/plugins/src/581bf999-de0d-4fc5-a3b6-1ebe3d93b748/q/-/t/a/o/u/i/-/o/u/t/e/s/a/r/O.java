/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  net.runelite.api.Client
 *  net.runelite.api.GraphicsObject
 *  net.runelite.api.Perspective
 *  net.runelite.api.Point
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.ui.overlay.OverlayUtil
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.autotoa.TOAConfig;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;
import java.awt.Stroke;
import java.util.Iterator;
import net.runelite.api.Client;
import net.runelite.api.GraphicsObject;
import net.runelite.api.Perspective;
import net.runelite.api.Point;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.ui.overlay.OverlayUtil;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.S;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.i;

@Singleton
public class O
extends S {
    private static /* synthetic */ int[] llIIIIllIII;
    private final /* synthetic */ i bL;

    /*
     * WARNING - void declaration
     */
    private void c(Graphics2D graphics2D) {
        Iterator<WorldPoint> llllllllllllllllIlIIIllIIlIlIlII = this.bL.y().keySet().iterator();
        while (O.lIIlllIlIllIll(llllllllllllllllIlIIIllIIlIlIlII.hasNext() ? 1 : 0)) {
            void llllllllllllllllIlIIIllIIlIlIlIl;
            O llllllllllllllllIlIIIllIIlIlIllI;
            WorldPoint llllllllllllllllIlIIIllIIlIlIIll = llllllllllllllllIlIIIllIIlIlIlII.next();
            LocalPoint llllllllllllllllIlIIIllIIlIlIIlI = LocalPoint.fromWorld((Client)llllllllllllllllIlIIIllIIlIlIllI.ai, (WorldPoint)llllllllllllllllIlIIIllIIlIlIIll);
            if (O.lIIlllIlIlllII(llllllllllllllllIlIIIllIIlIlIIlI)) {
                "".length();
                if (((0x69 ^ 0x23) & ~(0x89 ^ 0xC3)) <= 0) continue;
                return;
            }
            Polygon llllllllllllllllIlIIIllIIlIlIIIl = Perspective.getCanvasTilePoly((Client)llllllllllllllllIlIIIllIIlIlIllI.ai, (LocalPoint)llllllllllllllllIlIIIllIIlIlIIlI);
            if (O.lIIlllIlIlllII(llllllllllllllllIlIIIllIIlIlIIIl)) {
                "".length();
                if ("   ".length() != 0) continue;
                return;
            }
            Integer llllllllllllllllIlIIIllIIlIlIIII = llllllllllllllllIlIIIllIIlIlIllI.bL.y().get(llllllllllllllllIlIIIllIIlIlIIll);
            GraphicsObject llllllllllllllllIlIIIllIIlIIllll = llllllllllllllllIlIIIllIIlIlIllI.bL.A().get(llllllllllllllllIlIIIllIIlIlIIll);
            Color llllllllllllllllIlIIIllIIlIIlllI = llllllllllllllllIlIIIllIIlIlIllI.a(llllllllllllllllIlIIIllIIlIIllll);
            int llllllllllllllllIlIIIllIIlIIllIl = llllllllllllllllIlIIIllIIlIIllll.getFrame();
            if (O.lIIlllIlIlllIl(llllllllllllllllIlIIIllIIlIIllIl, llIIIIllIII[0])) {
                "".length();
                if (null == null) continue;
                return;
            }
            String llllllllllllllllIlIIIllIIlIIllII = String.valueOf(llllllllllllllllIlIIIllIIlIIllIl);
            Point llllllllllllllllIlIIIllIIlIIlIll = Perspective.getCanvasTextLocation((Client)llllllllllllllllIlIIIllIIlIlIllI.ai, (Graphics2D)llllllllllllllllIlIIIllIIlIlIlIl, (LocalPoint)llllllllllllllllIlIIIllIIlIlIIlI, (String)llllllllllllllllIlIIIllIIlIIllII, (int)llIIIIllIII[1]);
            OverlayUtil.renderTextLocation((Graphics2D)llllllllllllllllIlIIIllIIlIlIlIl, (Point)llllllllllllllllIlIIIllIIlIIlIll, (String)llllllllllllllllIlIIIllIIlIIllII, (Color)Color.WHITE);
            OverlayUtil.renderPolygon((Graphics2D)llllllllllllllllIlIIIllIIlIlIlIl, (Shape)llllllllllllllllIlIIIllIIlIlIIIl, (Color)llllllllllllllllIlIIIllIIlIIlllI, (Color)llllllllllllllllIlIIIllIIlIIlllI, (Stroke)new BasicStroke(0.25f));
            "".length();
            if (null == null) continue;
            return;
        }
    }

    private static void lIIlllIlIllIlI() {
        llIIIIllIII = new int[10];
        O.llIIIIllIII[0] = 0x95 ^ 0x98;
        O.llIIIIllIII[1] = (0xC3 ^ 0xA3) & ~(0x19 ^ 0x79);
        O.llIIIIllIII[2] = 0x43 ^ 6 ^ (0xDC ^ 0x95);
        O.llIIIIllIII[3] = -" ".length();
        O.llIIIIllIII[4] = 0x2D ^ 0x62 ^ (0x57 ^ 0x1C);
        O.llIIIIllIII[5] = 225 + 249 - 290 + 71;
        O.llIIIIllIII[6] = 0xDD ^ 0xC4;
        O.llIIIIllIII[7] = 0x17 ^ 0x1F;
        O.llIIIIllIII[8] = (0x20 ^ 0x69) + (2 ^ 0x4B) - (0xC2 ^ 0xA3) + (0xEF ^ 0x85);
        O.llIIIIllIII[9] = 0xE ^ 0x39;
    }

    static {
        O.lIIlllIlIllIlI();
    }

    private static boolean lIIlllIlIllllI(int n2, int n3) {
        return n2 >= n3;
    }

    public Dimension render(Graphics2D graphics2D) {
        this.c(graphics2D);
        return null;
    }

    private static boolean lIIlllIlIlllIl(int n2, int n3) {
        return n2 == n3;
    }

    @Inject
    protected O(TOAConfig tOAConfig, i i2) {
        super(tOAConfig);
        this.bL = i2;
    }

    private static boolean lIIlllIlIlllII(Object object) {
        return object == null;
    }

    private static boolean lIIlllIlIllIll(int n2) {
        return n2 != 0;
    }

    private Color a(GraphicsObject graphicsObject) {
        int llllllllllllllllIlIIIllIIlIIIlll;
        int n2 = graphicsObject.getFrame();
        if (O.lIIlllIlIllllI(n2, llIIIIllIII[2])) {
            llllllllllllllllIlIIIllIIlIIIlll = llIIIIllIII[3];
        }
        if (O.lIIlllIlIlllll(llllllllllllllllIlIIIllIIlIIIlll, llIIIIllIII[4])) {
            return new Color(llIIIIllIII[1], llIIIIllIII[5], llIIIIllIII[1], llIIIIllIII[6]);
        }
        if (O.lIIlllIlIlllll(llllllllllllllllIlIIIllIIlIIIlll, llIIIIllIII[7])) {
            return new Color(llIIIIllIII[5], llIIIIllIII[8], llIIIIllIII[9], llIIIIllIII[6]);
        }
        return new Color(llIIIIllIII[5], llIIIIllIII[1], llIIIIllIII[1], llIIIIllIII[6]);
    }

    private static boolean lIIlllIlIlllll(int n2, int n3) {
        return n2 < n3;
    }
}

