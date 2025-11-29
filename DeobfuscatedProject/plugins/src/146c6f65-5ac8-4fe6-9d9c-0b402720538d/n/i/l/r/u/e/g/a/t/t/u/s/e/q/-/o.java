/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.GameObject
 *  net.runelite.api.GameState
 *  net.runelite.api.Perspective
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayLayer
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.OverlayUtil
 *  net.runelite.client.ui.overlay.outline.ModelOutlineRenderer
 *  net.unethicalite.api.game.Game
 */
package n.i.l.r.u.e.g.a.t.t.u.s.e.q.-;

import com.google.inject.Inject;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.Shape;
import java.util.Iterator;
import java.util.List;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.c;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.d;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.h;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.l;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.t;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.u;
import net.runelite.api.Client;
import net.runelite.api.GameObject;
import net.runelite.api.GameState;
import net.runelite.api.Perspective;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayUtil;
import net.runelite.client.ui.overlay.outline.ModelOutlineRenderer;
import net.unethicalite.api.game.Game;

public class o
extends Overlay {
    private final /* synthetic */ c bm;
    private final /* synthetic */ u bo;
    private static /* synthetic */ int[] llIIlllllIII;
    private final /* synthetic */ ModelOutlineRenderer bq;
    private final /* synthetic */ t bp;
    private final /* synthetic */ Client bn;

    private static boolean lIIIIIIIIIllIIl(Object object) {
        return object == null;
    }

    private static boolean lIIIIIIIIIlllII(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIIIIIIIIlIllI() {
        llIIlllllIII = new int[7];
        o.llIIlllllIII[0] = -(0xFFFF9597 & 0x7A6F) & (0xFFFFB3DF & Short.MAX_VALUE);
        o.llIIlllllIII[1] = " ".length();
        o.llIIlllllIII[2] = 0x38 ^ 0x2A ^ (0x9B ^ 0x87);
        o.llIIlllllIII[3] = (0xE2 ^ 0xC2 ^ (0x3E ^ 0x29)) & (0x6E ^ 0x27 ^ (0x2B ^ 0x55) ^ -" ".length());
        o.llIIlllllIII[4] = 0x5E ^ 0x51;
        o.llIIlllllIII[5] = "  ".length();
        o.llIIlllllIII[6] = 7 ^ 0x7C ^ (0xB ^ 0x7D);
    }

    /*
     * WARNING - void declaration
     */
    private void a(Graphics2D graphics2D) {
        o lllllllllllllllIlIIlIIIIIIllIIIl;
        void lllllllllllllllIlIIlIIIIIIlIllll;
        h h2 = this.bm.V();
        if (o.lIIIIIIIIIllIIl(h2)) {
            return;
        }
        l lllllllllllllllIlIIlIIIIIIlIlllI = lllllllllllllllIlIIlIIIIIIlIllll.aq();
        Player lllllllllllllllIlIIlIIIIIIlIllIl = lllllllllllllllIlIIlIIIIIIllIIIl.bn.getLocalPlayer();
        if (o.lIIIIIIIIIllIIl(lllllllllllllllIlIIlIIIIIIlIllIl)) {
            return;
        }
        List<l> lllllllllllllllIlIIlIIIIIIlIllII = lllllllllllllllIlIIlIIIIIIlIllll.a(lllllllllllllllIlIIlIIIIIIlIllIl.getWorldLocation(), lllllllllllllllIlIIlIIIIIIlIlllI);
        Iterator<l> lllllllllllllllIlIIlIIIIIIlIlIll = lllllllllllllllIlIIlIIIIIIlIllII.iterator();
        while (o.lIIIIIIIIIlIlll(lllllllllllllllIlIIlIIIIIIlIlIll.hasNext() ? 1 : 0)) {
            l lllllllllllllllIlIIlIIIIIIlIlIlI = lllllllllllllllIlIIlIIIIIIlIlIll.next();
            List lllllllllllllllIlIIlIIIIIIlIlIIl = Perspective.getLinePolyList((Client)lllllllllllllllIlIIlIIIIIIllIIIl.bn, (WorldPoint)lllllllllllllllIlIIlIIIIIIlIlIlI.aW().dx(llIIlllllIII[1]).dy(llIIlllllIII[1]), (WorldPoint)lllllllllllllllIlIIlIIIIIIlIlIlI.aW().dx(llIIlllllIII[2]).dy(llIIlllllIII[2]));
            Iterator lllllllllllllllIlIIlIIIIIIlIlIII = lllllllllllllllIlIIlIIIIIIlIlIIl.iterator();
            while (o.lIIIIIIIIIlIlll(lllllllllllllllIlIIlIIIIIIlIlIII.hasNext() ? 1 : 0)) {
                void lllllllllllllllIlIIlIIIIIIllIIII;
                Polygon lllllllllllllllIlIIlIIIIIIlIIlll = (Polygon)lllllllllllllllIlIIlIIIIIIlIlIII.next();
                OverlayUtil.renderPolygon((Graphics2D)lllllllllllllllIlIIlIIIIIIllIIII, (Shape)lllllllllllllllIlIIlIIIIIIlIIlll, (Color)Color.MAGENTA);
                "".length();
                if (-"  ".length() < 0) continue;
                return;
            }
            "".length();
            if ((0xB3 ^ 0xB6) > 0) continue;
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    private void b(Graphics2D graphics2D) {
        void lllllllllllllllIlIIlIIIIIIIllIlI;
        o lllllllllllllllIlIIlIIIIIIIllIll;
        LocalPoint lllllllllllllllIlIIlIIIIIIIlIlII;
        Object lllllllllllllllIlIIlIIIIIIIlIlIl;
        void lllllllllllllllIlIIlIIIIIIIllIIl;
        h h2 = this.bm.V();
        if (o.lIIIIIIIIIllIIl(h2)) {
            return;
        }
        Object lllllllllllllllIlIIlIIIIIIIllIII = lllllllllllllllIlIIlIIIIIIIllIIl.at();
        int lllllllllllllllIlIIlIIIIIIIlIlll2 = ((l[][])lllllllllllllllIlIIlIIIIIIIllIII).length;
        int lllllllllllllllIlIIlIIIIIIIlIllI2 = llIIlllllIII[3];
        while (o.lIIIIIIIIIlllII(lllllllllllllllIlIIlIIIIIIIlIllI2, lllllllllllllllIlIIlIIIIIIIlIlll2)) {
            lllllllllllllllIlIIlIIIIIIIlIlII = lllllllllllllllIlIIlIIIIIIIlIlIl = lllllllllllllllIlIIlIIIIIIIllIII[lllllllllllllllIlIIlIIIIIIIlIllI2];
            int lllllllllllllllIlIIlIIIIIIIlIIll = ((l[])lllllllllllllllIlIIlIIIIIIIlIlII).length;
            int lllllllllllllllIlIIlIIIIIIIlIIlI = llIIlllllIII[3];
            while (o.lIIIIIIIIIlllII(lllllllllllllllIlIIlIIIIIIIlIIlI, lllllllllllllllIlIIlIIIIIIIlIIll)) {
                l lllllllllllllllIlIIlIIIIIIIlIIIl = lllllllllllllllIlIIlIIIIIIIlIlII[lllllllllllllllIlIIlIIIIIIIlIIlI];
                if (o.lIIIIIIIIIllIIl(lllllllllllllllIlIIlIIIIIIIlIIIl)) {
                    "".length();
                    if (-(2 ^ 0x31 ^ (0x10 ^ 0x27)) > 0) {
                        return;
                    }
                } else {
                    lllllllllllllllIlIIlIIIIIIIllIll.a(lllllllllllllllIlIIlIIIIIIIlIIIl, (Graphics2D)lllllllllllllllIlIIlIIIIIIIllIlI, null);
                }
                ++lllllllllllllllIlIIlIIIIIIIlIIlI;
                "".length();
                if ("  ".length() >= -" ".length()) continue;
                return;
            }
            ++lllllllllllllllIlIIlIIIIIIIlIllI2;
            "".length();
            if ((0xE2 ^ 0x88 ^ (0xC9 ^ 0xA6)) > 0) continue;
            return;
        }
        if (o.lIIIIIIIIIllIll(lllllllllllllllIlIIlIIIIIIIllIll.bm.Z()) && o.lIIIIIIIIIlllIl((Object)lllllllllllllllIlIIlIIIIIIIllIll.bm.W(), (Object)d.FIRST_ROTATION_EXPLORE)) {
            lllllllllllllllIlIIlIIIIIIIllIII = lllllllllllllllIlIIlIIIIIIIllIll.bm.Z();
            lllllllllllllllIlIIlIIIIIIIlIlll2 = llIIlllllIII[3];
            while (o.lIIIIIIIIIlllII(lllllllllllllllIlIIlIIIIIIIlIlll2, lllllllllllllllIlIIlIIIIIIIllIII.size())) {
                l lllllllllllllllIlIIlIIIIIIIlIllI2 = (l)lllllllllllllllIlIIlIIIIIIIllIII.get(lllllllllllllllIlIIlIIIIIIIlIlll2);
                lllllllllllllllIlIIlIIIIIIIlIlIl = new Color(1.0f, 1.0f, 0.0f, (float)(llIIlllllIII[1] + lllllllllllllllIlIIlIIIIIIIlIlll2) / (float)lllllllllllllllIlIIlIIIIIIIllIll.bm.Z().size());
                lllllllllllllllIlIIlIIIIIIIlIlII = LocalPoint.fromWorld((Client)lllllllllllllllIlIIlIIIIIIIllIll.bn, (WorldPoint)lllllllllllllllIlIIlIIIIIIIlIllI2.aQ());
                if (o.lIIIIIIIIIllIll(lllllllllllllllIlIIlIIIIIIIlIlII)) {
                    Point lllllllllllllllIlIIlIIIIIIIlIIll = Perspective.getCanvasTextLocation((Client)lllllllllllllllIlIIlIIIIIIIllIll.bn, (Graphics2D)lllllllllllllllIlIIlIIIIIIIllIlI, (LocalPoint)lllllllllllllllIlIIlIIIIIIIlIlII, (String)String.valueOf(lllllllllllllllIlIIlIIIIIIIlIlll2), (int)llIIlllllIII[4]).getAwtPoint();
                    lllllllllllllllIlIIlIIIIIIIllIlI.setColor(Color.WHITE);
                    lllllllllllllllIlIIlIIIIIIIllIlI.drawString(String.valueOf(lllllllllllllllIlIIlIIIIIIIlIlll2), lllllllllllllllIlIIlIIIIIIIlIIll.x, lllllllllllllllIlIIlIIIIIIIlIIll.y);
                }
                lllllllllllllllIlIIlIIIIIIIllIll.a(lllllllllllllllIlIIlIIIIIIIlIllI2, (Graphics2D)lllllllllllllllIlIIlIIIIIIIllIlI, (Color)lllllllllllllllIlIIlIIIIIIIlIlIl);
                ++lllllllllllllllIlIIlIIIIIIIlIlll2;
                "".length();
                if (" ".length() == " ".length()) continue;
                return;
            }
        }
        if (o.lIIIIIIIIIllIll(lllllllllllllllIlIIlIIIIIIIllIII = lllllllllllllllIlIIlIIIIIIIllIll.bm.Y())) {
            Color lllllllllllllllIlIIlIIIIIIIlIlll2 = new Color(1.0f, 1.0f, 1.0f, 1.0f);
            lllllllllllllllIlIIlIIIIIIIllIll.a((l)lllllllllllllllIlIIlIIIIIIIllIII, (Graphics2D)lllllllllllllllIlIIlIIIIIIIllIlI, lllllllllllllllIlIIlIIIIIIIlIlll2);
        }
    }

    private static boolean lIIIIIIIIIllIlI(int n2, int n3) {
        return n2 == n3;
    }

    static {
        o.lIIIIIIIIIlIllI();
    }

    /*
     * WARNING - void declaration
     */
    private void a(l l2, Graphics2D graphics2D, Color color) {
        o lllllllllllllllIlIIlIIIIIIIIIlII;
        void lllllllllllllllIlIIlIIIIIIIIIIll;
        Color lllllllllllllllIlIIlIIIIIIIIIIII;
        Color color2 = color;
        if (o.lIIIIIIIIIllIIl(color)) {
            Color color3;
            if (o.lIIIIIIIIIlIlll(l2.aY() ? 1 : 0)) {
                color3 = Color.CYAN;
                "".length();
                if (((0x55 ^ 0xD ^ (0x17 ^ 0x7D)) & (0x2F ^ 0x65 ^ (0x32 ^ 0x4A) ^ -" ".length())) < 0) {
                    return;
                }
            } else {
                color3 = lllllllllllllllIlIIlIIIIIIIIIIII = null;
            }
            if (o.lIIIIIIIIIllIII(lllllllllllllllIlIIlIIIIIIIIIIll, lllllllllllllllIlIIlIIIIIIIIIlII.bm.V().ar().orElse(null))) {
                lllllllllllllllIlIIlIIIIIIIIIIII = Color.ORANGE;
            }
            if (o.lIIIIIIIIIllIIl(lllllllllllllllIlIIlIIIIIIIIIIII)) {
                return;
            }
        }
        List lllllllllllllllIlIIIllllllllllll = Perspective.getLinePolyList((Client)lllllllllllllllIlIIlIIIIIIIIIlII.bn, (WorldPoint)lllllllllllllllIlIIlIIIIIIIIIIll.aW().dx(llIIlllllIII[5]).dy(llIIlllllIII[5]), (WorldPoint)lllllllllllllllIlIIlIIIIIIIIIIll.aW().dx(llIIlllllIII[6]).dy(llIIlllllIII[6]));
        Iterator lllllllllllllllIlIIIlllllllllllI = lllllllllllllllIlIIIllllllllllll.iterator();
        while (o.lIIIIIIIIIlIlll(lllllllllllllllIlIIIlllllllllllI.hasNext() ? 1 : 0)) {
            void lllllllllllllllIlIIlIIIIIIIIIIlI;
            Polygon lllllllllllllllIlIIIllllllllllIl = (Polygon)lllllllllllllllIlIIIlllllllllllI.next();
            OverlayUtil.renderPolygon((Graphics2D)lllllllllllllllIlIIlIIIIIIIIIIlI, (Shape)lllllllllllllllIlIIIllllllllllIl, (Color)lllllllllllllllIlIIlIIIIIIIIIIII);
            "".length();
            if (-"  ".length() < 0) continue;
            return;
        }
    }

    private static boolean lIIIIIIIIIlIlll(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIIIIIIIllIll(Object object) {
        return object != null;
    }

    private void c(Graphics2D graphics2D) {
        GameObject gameObject = this.bm.aa();
        if (o.lIIIIIIIIIllIIl(gameObject)) {
            return;
        }
        this.bq.drawOutline((TileObject)gameObject, llIIlllllIII[5], Color.BLUE, llIIlllllIII[3]);
    }

    private static boolean lIIIIIIIIIllIII(Object object, Object object2) {
        return object == object2;
    }

    @Inject
    public o(c c2, Client client, u u2, t t2, ModelOutlineRenderer modelOutlineRenderer) {
        this.bm = c2;
        this.bn = client;
        this.bq = modelOutlineRenderer;
        this.setLayer(OverlayLayer.ABOVE_SCENE);
        this.setPosition(OverlayPosition.DYNAMIC);
        this.bo = u2;
        this.bp = t2;
    }

    private static boolean lIIIIIIIIIlllIl(Object object, Object object2) {
        return object != object2;
    }

    /*
     * WARNING - void declaration
     */
    public Dimension render(Graphics2D graphics2D) {
        void lllllllllllllllIlIIlIIIIIlIIIIlI;
        o lllllllllllllllIlIIlIIIIIlIIIIll;
        if (!o.lIIIIIIIIIlIlll(this.bm.h().showDebugOverlay() ? 1 : 0) || o.lIIIIIIIIIllIII(Game.getState(), GameState.LOADING)) {
            return null;
        }
        lllllllllllllllIlIIlIIIIIlIIIIll.b((Graphics2D)lllllllllllllllIlIIlIIIIIlIIIIlI);
        lllllllllllllllIlIIlIIIIIlIIIIll.c((Graphics2D)lllllllllllllllIlIIlIIIIIlIIIIlI);
        h lllllllllllllllIlIIlIIIIIlIIIIIl = lllllllllllllllIlIIlIIIIIlIIIIll.bm.V();
        if (o.lIIIIIIIIIllIIl(lllllllllllllllIlIIlIIIIIlIIIIIl)) {
            return null;
        }
        Player lllllllllllllllIlIIlIIIIIlIIIIII = lllllllllllllllIlIIlIIIIIlIIIIll.bn.getLocalPlayer();
        if (o.lIIIIIIIIIllIlI(lllllllllllllllIlIIlIIIIIlIIIIll.bn.getVarbitValue(llIIlllllIII[0]), llIIlllllIII[1]) && o.lIIIIIIIIIllIll(lllllllllllllllIlIIlIIIIIlIIIIII)) {
            Iterator<WorldPoint> lllllllllllllllIlIIlIIIIIIllllll = lllllllllllllllIlIIlIIIIIlIIIIll.bo.bu().iterator();
            while (o.lIIIIIIIIIlIlll(lllllllllllllllIlIIlIIIIIIllllll.hasNext() ? 1 : 0)) {
                WorldPoint lllllllllllllllIlIIlIIIIIIlllllI = lllllllllllllllIlIIlIIIIIIllllll.next();
                LocalPoint lllllllllllllllIlIIlIIIIIIllllIl = LocalPoint.fromWorld((Client)lllllllllllllllIlIIlIIIIIlIIIIll.bn, (WorldPoint)lllllllllllllllIlIIlIIIIIIlllllI);
                if (o.lIIIIIIIIIllIIl(lllllllllllllllIlIIlIIIIIIllllIl)) {
                    "".length();
                    if (((0xB5 ^ 0xBD) & ~(0xAA ^ 0xA2)) == 0) continue;
                    return null;
                }
                OverlayUtil.renderPolygon((Graphics2D)lllllllllllllllIlIIlIIIIIlIIIIlI, (Shape)Perspective.getCanvasTilePoly((Client)lllllllllllllllIlIIlIIIIIlIIIIll.bn, (LocalPoint)lllllllllllllllIlIIlIIIIIIllllIl), (Color)Color.YELLOW);
                "".length();
                if (null == null) continue;
                return null;
            }
        }
        return null;
    }
}

