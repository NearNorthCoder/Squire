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
import gg.squire.gauntlet.tasks.GameEnum4;
import gg.squire.gauntlet.tasks.HHelper;
import gg.squire.gauntlet.tasks.LHelper;
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

public class OHelper
extends Overlay {
    private final  c bm;
    private final  u bo;
    
    private final  ModelOutlineRenderer bq;
    private final  t bp;
    private final  Client bn;

    private static boolean var2(Object object) {
        return object == null;
    }

    private static boolean var3(int n2, int n3) {
        return n2 < n3;
    }

    private static void var4() {
        var1 = new int[7];
        o.var1[0] = -(0xFFFF9597 & 0x7A6F) & (0xFFFFB3DF & Short.MAX_VALUE);
        o.var1[1] = 1;
        o.var1[2] = 0x38 ^ 0x2A ^ (0x9B ^ 0x87);
        o.var1[3] = (0xE2 ^ 0xC2 ^ (0x3E ^ 0x29)) & (0x6E ^ 0x27 ^ (0x2B ^ 0x55) ^ -1);
        o.var1[4] = 0x5E ^ 0x51;
        o.var1[5] = 2;
        o.var1[6] = 7 ^ 0x7C ^ (0xB ^ 0x7D);
    }

    /*
     * WARNING - void declaration
     */
    private void a(Graphics2D graphics2D) {
        o var5;
        void var6;
        h h2 = this.bm.V();
        if (o.var2(h2)) {
            return;
        }
        l var7 = var6.aq();
        Player var8 = var5.bn.getLocalPlayer();
        if (o.var2(var8)) {
            return;
        }
        List<l> var9 = var6.a(var8.getWorldLocation(), var7);
        Iterator<l> var10 = var9.iterator();
        while (o.var11(var10.hasNext() ? 1 : 0)) {
            l var12 = var10.next();
            List var13 = Perspective.getLinePolyList((Client)var5.bn, (WorldPoint)var12.aW().dx(var1[1]).dy(var1[1]), (WorldPoint)var12.aW().dx(var1[2]).dy(var1[2]));
            Iterator var14 = var13.iterator();
            while (o.var11(var14.hasNext() ? 1 : 0)) {
                void var15;
                Polygon var16 = (Polygon)var14.next();
                OverlayUtil.renderPolygon((Graphics2D)var15, (Shape)var16, (Color)Color.MAGENTA);
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
        void var17;
        o var18;
        LocalPoint var19;
        Object var20;
        void var21;
        h h2 = this.bm.V();
        if (o.var2(h2)) {
            return;
        }
        Object var22 = var21.at();
        int lllllllllllllllIlIIlIIIIIIIlIlll2 = ((l[][])var22).length;
        int lllllllllllllllIlIIlIIIIIIIlIllI2 = var1[3];
        while (o.var3(lllllllllllllllIlIIlIIIIIIIlIllI2, lllllllllllllllIlIIlIIIIIIIlIlll2)) {
            var19 = var20 = var22[lllllllllllllllIlIIlIIIIIIIlIllI2];
            int var23 = ((l[])var19).length;
            int var24 = var1[3];
            while (o.var3(var24, var23)) {
                l var25 = var19[var24];
                if (o.var2(var25)) {
                    0;
                    if (-(2 ^ 0x31 ^ (0x10 ^ 0x27)) > 0) {
                        return;
                    }
                } else {
                    var18.a(var25, (Graphics2D)var17, null);
                }
                ++var24;
                0;
                
                return;
            }
            ++lllllllllllllllIlIIlIIIIIIIlIllI2;
            0;
            if ((0xE2 ^ 0x88 ^ (0xC9 ^ 0xA6)) > 0) continue;
            return;
        }
        if (o.var26(var18.bm.Z()) && o.var27((Object)var18.bm.W(), (Object)d.FIRST_ROTATION_EXPLORE)) {
            var22 = var18.bm.Z();
            lllllllllllllllIlIIlIIIIIIIlIlll2 = var1[3];
            while (o.var3(lllllllllllllllIlIIlIIIIIIIlIlll2, var22.size())) {
                l lllllllllllllllIlIIlIIIIIIIlIllI2 = (var22.get(lllllllllllllllIlIIlIIIIIIIlIlll2);
                var20 = new Color(1.0f, 1.0f, 0.0f, (float)(var1[1] + lllllllllllllllIlIIlIIIIIIIlIlll2) / (float)var18.bm.Z().size());
                var19 = LocalPoint.fromWorld((Client)var18.bn, (WorldPoint)lllllllllllllllIlIIlIIIIIIIlIllI2.aQ());
                if (o.var26(var19)) {
                    Point var23 = Perspective.getCanvasTextLocation((Client)var18.bn, (Graphics2D)var17, (LocalPoint)var19, (String)String.valueOf(lllllllllllllllIlIIlIIIIIIIlIlll2), (int)var1[4]).getAwtPoint();
                    var17.setColor(Color.WHITE);
                    var17.drawString(String.valueOf(lllllllllllllllIlIIlIIIIIIIlIlll2), var23.x, var23.y);
                }
                var18.a(lllllllllllllllIlIIlIIIIIIIlIllI2, (Graphics2D)var17, (Color)var20);
                ++lllllllllllllllIlIIlIIIIIIIlIlll2;
                0;
                if (1 == 1) continue;
                return;
            }
        }
        if (o.var26(var22 = var18.bm.Y())) {
            Color lllllllllllllllIlIIlIIIIIIIlIlll2 = new Color(1.0f, 1.0f, 1.0f, 1.0f);
            var18.a((var22, (Graphics2D)var17, lllllllllllllllIlIIlIIIIIIIlIlll2);
        }
    }

    private static boolean var28(int n2, int n3) {
        return n2 == n3;
    }

    static {
        o.var4();
    }

    /*
     * WARNING - void declaration
     */
    private void a(l l2, Graphics2D graphics2D, Color color) {
        o var29;
        void var30;
        Color var31;
        Color color2 = color;
        if (o.var2(color)) {
            Color color3;
            if (o.var11(l2.aY() ? 1 : 0)) {
                color3 = Color.CYAN;
                0;
                if (((0x55 ^ 0xD ^ (0x17 ^ 0x7D)) & (0x2F ^ 0x65 ^ (0x32 ^ 0x4A) ^ -1)) < 0) {
                    return;
                }
            } else {
                color3 = var31 = null;
            }
            if (o.var32(var30, var29.bm.V().ar().orElse(null))) {
                var31 = Color.ORANGE;
            }
            if (o.var2(var31)) {
                return;
            }
        }
        List var33 = Perspective.getLinePolyList((Client)var29.bn, (WorldPoint)var30.aW().dx(var1[5]).dy(var1[5]), (WorldPoint)var30.aW().dx(var1[6]).dy(var1[6]));
        Iterator var34 = var33.iterator();
        while (o.var11(var34.hasNext() ? 1 : 0)) {
            void var35;
            Polygon var36 = (Polygon)var34.next();
            OverlayUtil.renderPolygon((Graphics2D)var35, (Shape)var36, (Color)var31);
            0;
            if (-2 < 0) continue;
            return;
        }
    }

    private static boolean var11(int n2) {
        return n2 != 0;
    }

    private static boolean var26(Object object) {
        return object != null;
    }

    private void c(Graphics2D graphics2D) {
        GameObject gameObject = this.bm.aa();
        if (o.var2(gameObject)) {
            return;
        }
        this.bq.drawOutline((TileObject)gameObject, var1[5], Color.BLUE, var1[3]);
    }

    private static boolean var32(Object object, Object object2) {
        return object == object2;
    }

    @Inject
    public OHelper(c c2, Client client, u u2, t t2, ModelOutlineRenderer modelOutlineRenderer) {
        this.bm = c2;
        this.bn = client;
        this.bq = modelOutlineRenderer;
        this.setLayer(OverlayLayer.ABOVE_SCENE);
        this.setPosition(OverlayPosition.DYNAMIC);
        this.bo = u2;
        this.bp = t2;
    }

    private static boolean var27(Object object, Object object2) {
        return object != object2;
    }

    /*
     * WARNING - void declaration
     */
    public Dimension render(Graphics2D graphics2D) {
        void var37;
        o var38;
        if (!o.var11(this.bm.h().showDebugOverlay() ? 1 : 0) || o.var32(Game.getState(), GameState.LOADING)) {
            return null;
        }
        var38.b((Graphics2D)var37);
        var38.c((Graphics2D)var37);
        h var39 = var38.bm.V();
        if (o.var2(var39)) {
            return null;
        }
        Player var40 = var38.bn.getLocalPlayer();
        if (o.var28(var38.bn.getVarbitValue(var1[0]), var1[1]) && o.var26(var40)) {
            Iterator<WorldPoint> var41 = var38.bo.bu().iterator();
            while (o.var11(var41.hasNext() ? 1 : 0)) {
                WorldPoint var42 = var41.next();
                LocalPoint var43 = LocalPoint.fromWorld((Client)var38.bn, (WorldPoint)var42);
                if (o.var2(var43)) {
                    0;
                    if (((0xB5 ^ 0xBD) & ~(0xAA ^ 0xA2)) == 0) continue;
                    return null;
                }
                OverlayUtil.renderPolygon((Graphics2D)var37, (Shape)Perspective.getCanvasTilePoly((Client)var38.bn, (LocalPoint)var43), (Color)Color.YELLOW);
                0;
                if null == null continue;
                return null;
            }
        }
        return null;
    }
}

