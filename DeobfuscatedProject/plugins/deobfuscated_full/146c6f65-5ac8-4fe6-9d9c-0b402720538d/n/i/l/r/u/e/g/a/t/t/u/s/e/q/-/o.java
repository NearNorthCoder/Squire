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
        o.llIIlllllIII[1] = 1;
        o.llIIlllllIII[2] = 0x38 ^ 0x2A ^ (0x9B ^ 0x87);
        o.llIIlllllIII[3] = (0xE2 ^ 0xC2 ^ (0x3E ^ 0x29)) & (0x6E ^ 0x27 ^ (0x2B ^ 0x55) ^ -1);
        o.llIIlllllIII[4] = 0x5E ^ 0x51;
        o.llIIlllllIII[5] = 2;
        o.llIIlllllIII[6] = 7 ^ 0x7C ^ (0xB ^ 0x7D);
    }

    /*
     * WARNING - void declaration
     */
    private void a(Graphics2D graphics2D) {
        o var26;
        void var29;
        h h2 = this.bm.V();
        if (o.lIIIIIIIIIllIIl(h2)) {
            return;
        }
        l var14 = var29.aq();
        Player var11 = var26.bn.getLocalPlayer();
        if (o.lIIIIIIIIIllIIl(var11)) {
            return;
        }
        List<l> var33 = var29.a(var11.getWorldLocation(), var14);
        Iterator<l> var34 = var33.iterator();
        while (o.lIIIIIIIIIlIlll(var34.hasNext() ? 1 : 0)) {
            l var5 = var34.next();
            List var4 = Perspective.getLinePolyList((Client)var26.bn, (WorldPoint)var5.aW().dx(llIIlllllIII[1]).dy(llIIlllllIII[1]), (WorldPoint)var5.aW().dx(llIIlllllIII[2]).dy(llIIlllllIII[2]));
            Iterator var16 = var4.iterator();
            while (o.lIIIIIIIIIlIlll(var16.hasNext() ? 1 : 0)) {
                void var31;
                Polygon var12 = (Polygon)var16.next();
                OverlayUtil.renderPolygon((Graphics2D)var31, (Shape)var12, (Color)Color.MAGENTA);
                0;
                if (-2 < 0) continue;
                return;
            }
            0;
            if ((0xB3 ^ 0xB6) > 0) continue;
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    private void b(Graphics2D graphics2D) {
        void var10;
        o var22;
        LocalPoint var19;
        Object var17;
        void var7;
        h h2 = this.bm.V();
        if (o.lIIIIIIIIIllIIl(h2)) {
            return;
        }
        Object var1 = var7.at();
        int lllllllllllllllIlIIlIIIIIIIlIlll2 = ((l[][])var1).length;
        int lllllllllllllllIlIIlIIIIIIIlIllI2 = llIIlllllIII[3];
        while (o.lIIIIIIIIIlllII(lllllllllllllllIlIIlIIIIIIIlIllI2, lllllllllllllllIlIIlIIIIIIIlIlll2)) {
            var19 = var17 = var1[lllllllllllllllIlIIlIIIIIIIlIllI2];
            int var2 = ((l[])var19).length;
            int var23 = llIIlllllIII[3];
            while (o.lIIIIIIIIIlllII(var23, var2)) {
                l var28 = var19[var23];
                if (o.lIIIIIIIIIllIIl(var28)) {
                    0;
                    if (-(2 ^ 0x31 ^ (0x10 ^ 0x27)) > 0) {
                        return;
                    }
                } else {
                    var22.a(var28, (Graphics2D)var10, null);
                }
                ++var23;
                0;
                if (2 >= -1) continue;
                return;
            }
            ++lllllllllllllllIlIIlIIIIIIIlIllI2;
            0;
            if ((0xE2 ^ 0x88 ^ (0xC9 ^ 0xA6)) > 0) continue;
            return;
        }
        if (o.lIIIIIIIIIllIll(var22.bm.Z()) && o.lIIIIIIIIIlllIl((Object)var22.bm.W(), (Object)d.FIRST_ROTATION_EXPLORE)) {
            var1 = var22.bm.Z();
            lllllllllllllllIlIIlIIIIIIIlIlll2 = llIIlllllIII[3];
            while (o.lIIIIIIIIIlllII(lllllllllllllllIlIIlIIIIIIIlIlll2, var1.size())) {
                l lllllllllllllllIlIIlIIIIIIIlIllI2 = (l)var1.get(lllllllllllllllIlIIlIIIIIIIlIlll2);
                var17 = new Color(1.0f, 1.0f, 0.0f, (float)(llIIlllllIII[1] + lllllllllllllllIlIIlIIIIIIIlIlll2) / (float)var22.bm.Z().size());
                var19 = LocalPoint.fromWorld((Client)var22.bn, (WorldPoint)lllllllllllllllIlIIlIIIIIIIlIllI2.aQ());
                if (o.lIIIIIIIIIllIll(var19)) {
                    Point var2 = Perspective.getCanvasTextLocation((Client)var22.bn, (Graphics2D)var10, (LocalPoint)var19, (String)String.valueOf(lllllllllllllllIlIIlIIIIIIIlIlll2), (int)llIIlllllIII[4]).getAwtPoint();
                    var10.setColor(Color.WHITE);
                    var10.drawString(String.valueOf(lllllllllllllllIlIIlIIIIIIIlIlll2), var2.x, var2.y);
                }
                var22.a(lllllllllllllllIlIIlIIIIIIIlIllI2, (Graphics2D)var10, (Color)var17);
                ++lllllllllllllllIlIIlIIIIIIIlIlll2;
                0;
                if (1 == 1) continue;
                return;
            }
        }
        if (o.lIIIIIIIIIllIll(var1 = var22.bm.Y())) {
            Color lllllllllllllllIlIIlIIIIIIIlIlll2 = new Color(1.0f, 1.0f, 1.0f, 1.0f);
            var22.a((l)var1, (Graphics2D)var10, lllllllllllllllIlIIlIIIIIIIlIlll2);
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
        o var27;
        void var8;
        Color var13;
        Color color2 = color;
        if (o.lIIIIIIIIIllIIl(color)) {
            Color color3;
            if (o.lIIIIIIIIIlIlll(l2.aY() ? 1 : 0)) {
                color3 = Color.CYAN;
                0;
                if (((0x55 ^ 0xD ^ (0x17 ^ 0x7D)) & (0x2F ^ 0x65 ^ (0x32 ^ 0x4A) ^ -1)) < 0) {
                    return;
                }
            } else {
                color3 = var13 = null;
            }
            if (o.lIIIIIIIIIllIII(var8, var27.bm.V().ar().orElse(null))) {
                var13 = Color.ORANGE;
            }
            if (o.lIIIIIIIIIllIIl(var13)) {
                return;
            }
        }
        List var20 = Perspective.getLinePolyList((Client)var27.bn, (WorldPoint)var8.aW().dx(llIIlllllIII[5]).dy(llIIlllllIII[5]), (WorldPoint)var8.aW().dx(llIIlllllIII[6]).dy(llIIlllllIII[6]));
        Iterator var18 = var20.iterator();
        while (o.lIIIIIIIIIlIlll(var18.hasNext() ? 1 : 0)) {
            void var32;
            Polygon var30 = (Polygon)var18.next();
            OverlayUtil.renderPolygon((Graphics2D)var32, (Shape)var30, (Color)var13);
            0;
            if (-2 < 0) continue;
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
        void var15;
        o var24;
        if (!o.lIIIIIIIIIlIlll(this.bm.h().showDebugOverlay() ? 1 : 0) || o.lIIIIIIIIIllIII(Game.getState(), GameState.LOADING)) {
            return null;
        }
        var24.b((Graphics2D)var15);
        var24.c((Graphics2D)var15);
        h var21 = var24.bm.V();
        if (o.lIIIIIIIIIllIIl(var21)) {
            return null;
        }
        Player var6 = var24.bn.getLocalPlayer();
        if (o.lIIIIIIIIIllIlI(var24.bn.getVarbitValue(llIIlllllIII[0]), llIIlllllIII[1]) && o.lIIIIIIIIIllIll(var6)) {
            Iterator<WorldPoint> var3 = var24.bo.bu().iterator();
            while (o.lIIIIIIIIIlIlll(var3.hasNext() ? 1 : 0)) {
                WorldPoint var25 = var3.next();
                LocalPoint var9 = LocalPoint.fromWorld((Client)var24.bn, (WorldPoint)var25);
                if (o.lIIIIIIIIIllIIl(var9)) {
                    0;
                    if (((0xB5 ^ 0xBD) & ~(0xAA ^ 0xA2)) == 0) continue;
                    return null;
                }
                OverlayUtil.renderPolygon((Graphics2D)var15, (Shape)Perspective.getCanvasTilePoly((Client)var24.bn, (LocalPoint)var9), (Color)Color.YELLOW);
                0;
                
                return null;
            }
        }
        return null;
    }
}

