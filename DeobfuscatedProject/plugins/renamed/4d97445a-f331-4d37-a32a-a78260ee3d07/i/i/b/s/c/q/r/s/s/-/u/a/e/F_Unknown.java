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
package i.i.b.s.c.q.r.s.s.-.u.a.e;

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

public class F_Unknown
extends Overlay {
    private /* synthetic */ List<WorldPoint> bf;
    private final /* synthetic */ Client bl;
    private static /* synthetic */ int[] lIllllIII;
    private final /* synthetic */ ResetPlugin bk;
    private final /* synthetic */ HashMap<WorldPoint, Integer> bm;

    private static boolean lIlIIIlllII(int n2) {
        return n2 == 0;
    }

    private static void lIlIIIllIll() {
        lIllllIII = new int[5];
        F.lIllllIII[0] = -(25 + 116 - 64 + 127 ^ 16 + 59 - -51 + 66);
        F.lIllllIII[1] = 0x31 ^ 0x20 ^ (0x8B ^ 0x96);
        F.lIllllIII[2] = -1 & (0xFFFFFFFF & Integer.MAX_VALUE);
        F.lIllllIII[3] = 0x5A ^ 0x1A ^ (9 ^ 0x7B);
        F.lIllllIII[4] = 0xE1 ^ 0xA7;
    }

    private static /* synthetic */ void a(Graphics2D graphics2D, Polygon polygon) {
        OverlayUtil.renderPolygon((Graphics2D)graphics2D, (Shape)polygon, (Color)ColorScheme.BRAND_YELLOW_TRANSPARENT);
    }

    public Dimension render(Graphics2D graphics2D) {
        if (F.lIlIIIlllII(this.bk.ah() ? 1 : 0)) {
            return null;
        }
        OverlayUtil.renderTextLocation((Graphics2D)graphics2D, (Point)new Point(lIllllIII[3], lIllllIII[4]), (String)(this.bk.af().toString() + " ms"), (Color)Color.RED);
        return null;
    }

    private /* synthetic */ Polygon a(LocalPoint localPoint) {
        return Perspective.getCanvasTilePoly((Client)this.bl, (LocalPoint)localPoint);
    }

    private static boolean lIlIIlIIIII(int n2) {
        return n2 >= 0;
    }

    private static boolean lIlIIIlllIl(Object object) {
        return object != null;
    }

    private static boolean lIlIIlIIIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIIIlllll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIIllllI(Object object) {
        return object == null;
    }

    private /* synthetic */ LocalPoint e(WorldPoint worldPoint) {
        return LocalPoint.fromWorld((Client)this.bl, (WorldPoint)worldPoint);
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void onGameTick(GameTick gameTick) {
        void var3_3;
        void var2_2;
        F lIlllIlIIlIIIlI;
        if (F.lIlIIIlllII(this.bk.ae() ? 1 : 0)) {
            this.bf = null;
            return;
        }
        if (F.lIlIIIlllIl(lIlllIlIIlIIIlI.bf)) {
            return;
        }
        Player lIlllIlIIlIIIIl = Players.getLocal();
        WorldPoint lIlllIlIIlIIIII = lIlllIlIIlIIIlI.bk.aj();
        if (F.lIlIIIllllI(lIlllIlIIlIIIII)) {
            return;
        }
        this.bf = var2_2.getWorldLocation().pathTo(this.bl, (WorldPoint)var3_3);
    }

    @Inject
    public F(ResetPlugin resetPlugin, Client client) {
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
        int lIlllIlIIIlIlIl = lIllllIII[0];
        while (F.lIlIIIlllll(lIlllIlIIIlIlIl, lIllllIII[1])) {
            int lIlllIlIIIlIlII = lIllllIII[0];
            while (F.lIlIIIlllll(lIlllIlIIIlIlII, lIllllIII[1])) {
                F lIlllIlIIIllIII;
                void lIlllIlIIIlIllI;
                WorldPoint lIlllIlIIIlIIll = lIlllIlIIIlIllI.dx(lIlllIlIIIlIlIl).dy(lIlllIlIIIlIlII);
                int lIlllIlIIIlIIlI = lIlllIlIIIlIllI.distanceToPath(lIlllIlIIIllIII.bl, lIlllIlIIIlIIll);
                if (F.lIlIIlIIIII(lIlllIlIIIlIIlI)) {
                    if (F.lIlIIlIIIIl(lIlllIlIIIlIIlI, lIllllIII[2])) {
                        0;
                        
                        }
                    } else {
                        lIlllIlIIIllIII.bm.put(lIlllIlIIIlIIll, lIlllIlIIIlIIlI);
                        0;
                    }
                }
                ++lIlllIlIIIlIlII;
                0;
                
                return;
            }
            ++lIlllIlIIIlIlIl;
            0;
            if (((0xA ^ 0x69) & ~(0x35 ^ 0x56)) == 0) continue;
            return;
        }
    }

    static {
        F.lIlIIIllIll();
    }
}

