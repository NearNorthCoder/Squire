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
package gg.squire.gauntlet.tasks;

import com.google.inject.Inject;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.Shape;
import java.util.Iterator;
import java.util.List;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GameEnum38;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.h;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.l;
import gg.squire.gauntlet.tasks.AttackingBossTask;
import gg.squire.gauntlet.tasks.EscapingHazardTask;
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
    private final  c bm;
    private final  u bo;
    
    private final  ModelOutlineRenderer bq;
    private final  t bp;
    private final  Client bn;

    private static boolean lIIIIIIIIIllIIl(Object object) {
        return object == null;
    }

    private static boolean lIIIIIIIIIlllII(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    private void a(Graphics2D graphics2D) {
        o var1;
        void var2;
        h h2 = this.bm.V();
        if (o.lIIIIIIIIIllIIl(h2)) {
            return;
        }
        l var3 = var2.aq();
        Player var4 = var1.bn.getLocalPlayer();
        if (o.lIIIIIIIIIllIIl(var4)) {
            return;
        }
        List<l> var5 = var2.a(var4.getWorldLocation(), var3);
        Iterator<l> var6 = var5.iterator();
        while (o.lIIIIIIIIIlIlll(var6.hasNext() ? 1 : 0)) {
            l var7 = var6.next();
            List var8 = Perspective.getLinePolyList((Client)var1.bn, (WorldPoint)var7.aW().dx(llIIlllllIII[1]).dy(llIIlllllIII[1]), (WorldPoint)var7.aW().dx(llIIlllllIII[2]).dy(llIIlllllIII[2]));
            Iterator var9 = var8.iterator();
            while (o.lIIIIIIIIIlIlll(var9.hasNext() ? 1 : 0)) {
                void var10;
                Polygon var11 = (Polygon)var9.next();
                OverlayUtil.renderPolygon((Graphics2D)var10, (Shape)var11, (Color)Color.MAGENTA);

                if (-2 < 0) continue;
                return;
            }

            if ((0xB3 ^ 0xB6) > 0) continue;
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    private void b(Graphics2D graphics2D) {
        void var12;
        o var13;
        LocalPoint var14;
        Object var15;
        void var16;
        h h2 = this.bm.V();
        if (o.lIIIIIIIIIllIIl(h2)) {
            return;
        }
        Object var17 = var16.at();
        int lllllllllllllllIlIIlIIIIIIIlIlll2 = ((l[][])var17).length;
        int lllllllllllllllIlIIlIIIIIIIlIllI2 = llIIlllllIII[3];
        while (o.lIIIIIIIIIlllII(lllllllllllllllIlIIlIIIIIIIlIllI2, lllllllllllllllIlIIlIIIIIIIlIlll2)) {
            var14 = var15 = var17[lllllllllllllllIlIIlIIIIIIIlIllI2];
            int var18 = ((l[])var14).length;
            int var19 = llIIlllllIII[3];
            while (o.lIIIIIIIIIlllII(var19, var18)) {
                l var20 = var14[var19];
                if (o.lIIIIIIIIIllIIl(var20)) {

                    if (-(2 ^ 0x31 ^ (0x10 ^ 0x27)) > 0) {
                        return;
                    }
                } else {
                    var13.a(var20, (Graphics2D)var12, null);
                }
                ++var19;

                if (2 >= -1) continue;
                return;
            }
            ++lllllllllllllllIlIIlIIIIIIIlIllI2;

            if ((0xE2 ^ 0x88 ^ (0xC9 ^ 0xA6)) > 0) continue;
            return;
        }
        if (o.lIIIIIIIIIllIll(var13.bm.Z()) && o.lIIIIIIIIIlllIl((Object)var13.bm.W(), (Object)d.FIRST_ROTATION_EXPLORE)) {
            var17 = var13.bm.Z();
            lllllllllllllllIlIIlIIIIIIIlIlll2 = llIIlllllIII[3];
            while (o.lIIIIIIIIIlllII(lllllllllllllllIlIIlIIIIIIIlIlll2, var17.size())) {
                l lllllllllllllllIlIIlIIIIIIIlIllI2 = (l)var17.get(lllllllllllllllIlIIlIIIIIIIlIlll2);
                var15 = new Color(1.0f, 1.0f, 0.0f, (float)(llIIlllllIII[1] + lllllllllllllllIlIIlIIIIIIIlIlll2) / (float)var13.bm.Z().size());
                var14 = LocalPoint.fromWorld((Client)var13.bn, (WorldPoint)lllllllllllllllIlIIlIIIIIIIlIllI2.aQ());
                if (o.lIIIIIIIIIllIll(var14)) {
                    Point var18 = Perspective.getCanvasTextLocation((Client)var13.bn, (Graphics2D)var12, (LocalPoint)var14, (String)String.valueOf(lllllllllllllllIlIIlIIIIIIIlIlll2), (int)llIIlllllIII[4]).getAwtPoint();
                    var12.setColor(Color.WHITE);
                    var12.drawString(String.valueOf(lllllllllllllllIlIIlIIIIIIIlIlll2), var18.x, var18.y);
                }
                var13.a(lllllllllllllllIlIIlIIIIIIIlIllI2, (Graphics2D)var12, (Color)var15);
                ++lllllllllllllllIlIIlIIIIIIIlIlll2;

                if (1 == 1) continue;
                return;
            }
        }
        if (o.lIIIIIIIIIllIll(var17 = var13.bm.Y())) {
            Color lllllllllllllllIlIIlIIIIIIIlIlll2 = new Color(1.0f, 1.0f, 1.0f, 1.0f);
            var13.a((l)var17, (Graphics2D)var12, lllllllllllllllIlIIlIIIIIIIlIlll2);
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
        o var21;
        void var22;
        Color var23;
        Color color2 = color;
        if (o.lIIIIIIIIIllIIl(color)) {
            Color color3;
            if (o.lIIIIIIIIIlIlll(l2.aY() ? 1 : 0)) {
                color3 = Color.CYAN;

                if (((0x55 ^ 0xD ^ (0x17 ^ 0x7D)) & (0x2F ^ 0x65 ^ (0x32 ^ 0x4A) ^ -1)) < 0) {
                    return;
                }
            } else {
                color3 = var23 = null;
            }
            if (o.lIIIIIIIIIllIII(var22, var21.bm.V().ar().orElse(null))) {
                var23 = Color.ORANGE;
            }
            if (o.lIIIIIIIIIllIIl(var23)) {
                return;
            }
        }
        List var24 = Perspective.getLinePolyList((Client)var21.bn, (WorldPoint)var22.aW().dx(llIIlllllIII[5]).dy(llIIlllllIII[5]), (WorldPoint)var22.aW().dx(llIIlllllIII[6]).dy(llIIlllllIII[6]));
        Iterator var25 = var24.iterator();
        while (o.lIIIIIIIIIlIlll(var25.hasNext() ? 1 : 0)) {
            void var26;
            Polygon var27 = (Polygon)var25.next();
            OverlayUtil.renderPolygon((Graphics2D)var26, (Shape)var27, (Color)var23);

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
        void var28;
        o var29;
        if (!o.lIIIIIIIIIlIlll(this.bm.h().showDebugOverlay() ? 1 : 0) || o.lIIIIIIIIIllIII(Game.getState(), GameState.LOADING)) {
            return null;
        }
        var29.b((Graphics2D)var28);
        var29.c((Graphics2D)var28);
        h var30 = var29.bm.V();
        if (o.lIIIIIIIIIllIIl(var30)) {
            return null;
        }
        Player var31 = var29.bn.getLocalPlayer();
        if (o.lIIIIIIIIIllIlI(var29.bn.getVarbitValue(llIIlllllIII[0]), llIIlllllIII[1]) && o.lIIIIIIIIIllIll(var31)) {
            Iterator<WorldPoint> var32 = var29.bo.bu().iterator();
            while (o.lIIIIIIIIIlIlll(var32.hasNext() ? 1 : 0)) {
                WorldPoint var33 = var32.next();
                LocalPoint var34 = LocalPoint.fromWorld((Client)var29.bn, (WorldPoint)var33);
                if (o.lIIIIIIIIIllIIl(var34)) {

                    if (((0xB5 ^ 0xBD) & ~(0xAA ^ 0xA2)) == 0) continue;
                    return null;
                }
                OverlayUtil.renderPolygon((Graphics2D)var28, (Shape)Perspective.getCanvasTilePoly((Client)var29.bn, (LocalPoint)var34), (Color)Color.YELLOW);

                return null;
            }
        }
        return null;
    }
}

