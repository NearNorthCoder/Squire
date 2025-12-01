package n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000;

import com.google.inject.Inject;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Polygon;
import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.GameObject;
import net.runelite.api.GameState;
import net.runelite.api.Perspective;
import net.runelite.api.Player;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayUtil;
import net.runelite.client.ui.overlay.outline.ModelOutlineRenderer;
import net.unethicalite.api.game.Game;
/* renamed from: n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.o  reason: invalid package and case insensitive filesystem */
/* loaded from: 146c6f65-5ac8-4fe6-9d9c-0b402720538d.jar:n/i/l/r/u/e/g/a/t/t/u/s/e/q/-/o.class */
public class C0014o extends Overlay {
    private final /* synthetic */ C0002c bm;
    private final /* synthetic */ C0020u bo;
    private static /* synthetic */ int[] llIIlllllIII;
    private final /* synthetic */ ModelOutlineRenderer bq;
    private final /* synthetic */ C0019t bp;
    private final /* synthetic */ Client bn;

    private static boolean lIIIIIIIIIllIIl(Object obj) {
        return obj == null;
    }

    private static boolean lIIIIIIIIIlllII(int i, int i2) {
        return i < i2;
    }

    private static void lIIIIIIIIIlIllI() {
        llIIlllllIII = new int[7];
        llIIlllllIII[0] = (-((-27241) & 31343)) & (-19489) & 32767;
        llIIlllllIII[1] = " ".length();
        llIIlllllIII[2] = (56 ^ 42) ^ (155 ^ 135);
        llIIlllllIII[3] = ((226 ^ 194) ^ (62 ^ 41)) & (((110 ^ 39) ^ (43 ^ 85)) ^ (-" ".length()));
        llIIlllllIII[4] = 94 ^ 81;
        llIIlllllIII[5] = "  ".length();
        llIIlllllIII[6] = (7 ^ 124) ^ (11 ^ 125);
    }

    private void a(Graphics2D graphics2D) {
        C0007h V = this.bm.V();
        if (lIIIIIIIIIllIIl(V)) {
            return;
        }
        C0011l aq = V.aq();
        Player localPlayer = this.bn.getLocalPlayer();
        if (lIIIIIIIIIllIIl(localPlayer)) {
            return;
        }
        for (C0011l c0011l : V.a(localPlayer.getWorldLocation(), aq)) {
            for (Polygon polygon : Perspective.getLinePolyList(this.bn, c0011l.aW().dx(llIIlllllIII[1]).dy(llIIlllllIII[1]), c0011l.aW().dx(llIIlllllIII[2]).dy(llIIlllllIII[2]))) {
                OverlayUtil.renderPolygon(graphics2D, polygon, Color.MAGENTA);
                "".length();
                if ((-"  ".length()) >= 0) {
                    return;
                }
            }
            "".length();
            if ((179 ^ 182) <= 0) {
                return;
            }
        }
    }

    private void b(Graphics2D graphics2D) {
        C0007h V = this.bm.V();
        if (lIIIIIIIIIllIIl(V)) {
            return;
        }
        C0011l[][] at = V.at();
        int length = at.length;
        int i = llIIlllllIII[3];
        while (lIIIIIIIIIlllII(i, length)) {
            C0011l[] c0011lArr = at[i];
            int length2 = c0011lArr.length;
            int i2 = llIIlllllIII[3];
            while (lIIIIIIIIIlllII(i2, length2)) {
                C0011l c0011l = c0011lArr[i2];
                if (lIIIIIIIIIllIIl(c0011l)) {
                    "".length();
                    if ((-((2 ^ 49) ^ (16 ^ 39))) > 0) {
                        return;
                    }
                } else {
                    a(c0011l, graphics2D, null);
                }
                i2++;
                "".length();
                if ("  ".length() < (-" ".length())) {
                    return;
                }
            }
            i++;
            "".length();
            if (((226 ^ 136) ^ (201 ^ 166)) <= 0) {
                return;
            }
        }
        if (lIIIIIIIIIllIll(this.bm.Z()) && lIIIIIIIIIlllIl(this.bm.W(), EnumC0003d.FIRST_ROTATION_EXPLORE)) {
            List<C0011l> Z = this.bm.Z();
            int i3 = llIIlllllIII[3];
            while (lIIIIIIIIIlllII(i3, Z.size())) {
                C0011l c0011l2 = Z.get(i3);
                Color color = new Color(1.0f, 1.0f, 0.0f, (llIIlllllIII[1] + i3) / this.bm.Z().size());
                LocalPoint fromWorld = LocalPoint.fromWorld(this.bn, c0011l2.aQ());
                if (lIIIIIIIIIllIll(fromWorld)) {
                    Point awtPoint = Perspective.getCanvasTextLocation(this.bn, graphics2D, fromWorld, String.valueOf(i3), llIIlllllIII[4]).getAwtPoint();
                    graphics2D.setColor(Color.WHITE);
                    graphics2D.drawString(String.valueOf(i3), awtPoint.x, awtPoint.y);
                }
                a(c0011l2, graphics2D, color);
                i3++;
                "".length();
                if (" ".length() != " ".length()) {
                    return;
                }
            }
        }
        C0011l Y = this.bm.Y();
        if (lIIIIIIIIIllIll(Y)) {
            a(Y, graphics2D, new Color(1.0f, 1.0f, 1.0f, 1.0f));
        }
    }

    private static boolean lIIIIIIIIIllIlI(int i, int i2) {
        return i == i2;
    }

    static {
        lIIIIIIIIIlIllI();
    }

    private void a(C0011l c0011l, Graphics2D graphics2D, Color color) {
        Color color2;
        Color color3 = color;
        if (lIIIIIIIIIllIIl(color)) {
            if (lIIIIIIIIIlIlll(c0011l.aY() ? 1 : 0)) {
                color2 = Color.CYAN;
                "".length();
                if ((((85 ^ 13) ^ (23 ^ 125)) & (((47 ^ 101) ^ (50 ^ 74)) ^ (-" ".length()))) < 0) {
                    return;
                }
            } else {
                color2 = null;
            }
            color3 = color2;
            if (lIIIIIIIIIllIII(c0011l, this.bm.V().ar().orElse(null))) {
                color3 = Color.ORANGE;
            }
            if (lIIIIIIIIIllIIl(color3)) {
                return;
            }
        }
        for (Polygon polygon : Perspective.getLinePolyList(this.bn, c0011l.aW().dx(llIIlllllIII[5]).dy(llIIlllllIII[5]), c0011l.aW().dx(llIIlllllIII[6]).dy(llIIlllllIII[6]))) {
            OverlayUtil.renderPolygon(graphics2D, polygon, color3);
            "".length();
            if ((-"  ".length()) >= 0) {
                return;
            }
        }
    }

    private static boolean lIIIIIIIIIlIlll(int i) {
        return i != 0;
    }

    private static boolean lIIIIIIIIIllIll(Object obj) {
        return obj != null;
    }

    private void c(Graphics2D graphics2D) {
        GameObject aa = this.bm.aa();
        if (lIIIIIIIIIllIIl(aa)) {
            return;
        }
        this.bq.drawOutline(aa, llIIlllllIII[5], Color.BLUE, llIIlllllIII[3]);
    }

    private static boolean lIIIIIIIIIllIII(Object obj, Object obj2) {
        return obj == obj2;
    }

    @Inject
    public C0014o(C0002c c0002c, Client client, C0020u c0020u, C0019t c0019t, ModelOutlineRenderer modelOutlineRenderer) {
        this.bm = c0002c;
        this.bn = client;
        this.bq = modelOutlineRenderer;
        setLayer(OverlayLayer.ABOVE_SCENE);
        setPosition(OverlayPosition.DYNAMIC);
        this.bo = c0020u;
        this.bp = c0019t;
    }

    private static boolean lIIIIIIIIIlllIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    public Dimension render(Graphics2D graphics2D) {
        if (!lIIIIIIIIIlIlll(this.bm.h().showDebugOverlay() ? 1 : 0) || lIIIIIIIIIllIII(Game.getState(), GameState.LOADING)) {
            return null;
        }
        b(graphics2D);
        c(graphics2D);
        if (lIIIIIIIIIllIIl(this.bm.V())) {
            return null;
        }
        Player localPlayer = this.bn.getLocalPlayer();
        if (lIIIIIIIIIllIlI(this.bn.getVarbitValue(llIIlllllIII[0]), llIIlllllIII[1]) && lIIIIIIIIIllIll(localPlayer)) {
            for (WorldPoint worldPoint : this.bo.bu()) {
                LocalPoint fromWorld = LocalPoint.fromWorld(this.bn, worldPoint);
                if (lIIIIIIIIIllIIl(fromWorld)) {
                    "".length();
                    if ((true ^ true) & ((true ^ true) ^ true)) {
                        return null;
                    }
                } else {
                    OverlayUtil.renderPolygon(graphics2D, Perspective.getCanvasTilePoly(this.bn, fromWorld), Color.YELLOW);
                    "".length();
                    if (0 != 0) {
                        return null;
                    }
                }
            }
            return null;
        }
        return null;
    }
}
