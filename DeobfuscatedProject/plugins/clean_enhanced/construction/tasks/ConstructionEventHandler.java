/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Perspective
 *  net.runelite.api.Player
 *  net.runelite.api.Point
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.GameTick
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayLayer
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.OverlayUtil
 *  net.unethicalite.api.entities.Players
 */
package gg.squire.construction.tasks;

import gg.squire.basics.combat.AgroReset.ResetPlugin;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Perspective;
import net.runelite.api.Player;
import net.runelite.api.Point;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayUtil;
import net.unethicalite.api.entities.Players;

public class ConstructionEventHandler
extends Overlay {
    private  List<WorldPoint> bf;
    private final  Client bl;
    private static  int[] lIllllIII;
    private final  ResetPlugin bk;
    private final  HashMap<WorldPoint, Integer> bm;

    private static boolean var1(int n2) {
        return n2 == 0;
    }

    private static void var2() {
        lIllllIII = new int[5];
        F.lIllllIII[0] = -(25 + 116 - 64 + 127 ^ 16 + 59 - -51 + 66);
        F.lIllllIII[1] = 0x31 ^ 0x20 ^ (0x8B ^ 0x96);
        F.lIllllIII[2] = -1 & (0xFFFFFFFF & Integer.MAX_VALUE);
        F.lIllllIII[3] = 0x5A ^ 0x1A ^ (9 ^ 0x7B);
        F.lIllllIII[4] = 0xE1 ^ 0xA7;
    }

    private static  void a(Graphics2D graphics2D, Polygon polygon) {
        OverlayUtil.renderPolygon((Graphics2D)graphics2D, (Shape)polygon, (Color)ColorScheme.BRAND_YELLOW_TRANSPARENT);
    }

    public Dimension render(Graphics2D graphics2D) {
        if (F.var1(this.bk.ah() ? 1 : 0)) {
            return null;
        }
        OverlayUtil.renderTextLocation((Graphics2D)graphics2D, (Point)new Point(lIllllIII[3], lIllllIII[4]), (String)(this.bk.af().toString() + " ms"), (Color)Color.RED);
        return null;
    }

    private  Polygon a(LocalPoint localPoint) {
        return Perspective.getCanvasTilePoly((Client)this.bl, (LocalPoint)localPoint);
    }

    private static boolean var3(int n2) {
        return n2 >= 0;
    }

    private static boolean var4(Object object) {
        return object != null;
    }

    private static boolean var5(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var6(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var7(Object object) {
        return object == null;
    }

    private  LocalPoint e(WorldPoint worldPoint) {
        return LocalPoint.fromWorld((Client)this.bl, (WorldPoint)worldPoint);
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void onGameTick(GameTick gameTick) {
        void var3_3;
        void var2_2;
        F var8;
        if (F.var1(this.bk.ae() ? 1 : 0)) {
            this.bf = null;
            return;
        }
        if (F.var4(var8.bf)) {
            return;
        }
        Player var9 = Players.getLocal();
        WorldPoint var10 = var8.bk.aj();
        if (F.var7(var10)) {
            return;
        }
        this.bf = var2_2.getWorldLocation().pathTo(this.bl, (WorldPoint)var3_3);
    }

    @Inject
    public ConstructionEventHandler(ResetPlugin resetPlugin, Client client) {
        this.bm = new HashMap();
        this.setLayer(OverlayLayer.ABOVE_SCENE);
        this.setPosition(OverlayPosition.DYNAMIC);
        this.bk = resetPlugin;
        this.bl = client;
    }

    /*
     * WARNING - void declaration
     */
    public void aa() {
        this.bm.clear();
        Player player = Players.getLocal();
        WorldPoint worldPoint = player.getWorldLocation();
        int var11 = lIllllIII[0];
        while (F.var6(var11, lIllllIII[1])) {
            int var12 = lIllllIII[0];
            while (F.var6(var12, lIllllIII[1])) {
                F var13;
                void var14;
                WorldPoint var15 = var14.dx(var11).dy(var12);
                int var16 = var14.distanceToPath(var13.bl, var15);
                if (F.var3(var16)) {
                    if (F.var5(var16, lIllllIII[2])) {
                        0;
                        if null != null {
                            return;
                        }
                    } else {
                        var13.bm.put(var15, var16);
                        0;
                    }
                }
                ++var12;
                0;
                if null == null continue;
                return;
            }
            ++var11;
            0;
            if (((0xA ^ 0x69) & ~(0x35 ^ 0x56)) == 0) continue;
            return;
        }
    }

    static {
        F.var2();
    }
}

