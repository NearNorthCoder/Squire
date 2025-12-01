package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import gg.squire.basics.combat.AgroReset.ResetPlugin;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Polygon;
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
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayUtil;
import net.unethicalite.api.entities.Players;
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.F  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/F.class */
public class F extends Overlay {
    private /* synthetic */ List<WorldPoint> bf;
    private final /* synthetic */ Client bl;
    private static /* synthetic */ int[] lIllllIII;
    private final /* synthetic */ ResetPlugin bk;
    private final /* synthetic */ HashMap<WorldPoint, Integer> bm = new HashMap<>();

    private static boolean lIlIIIlllII(int i2) {
        return i2 == 0;
    }

    private static void lIlIIIllIll() {
        lIllllIII = new int[5];
        lIllllIII[0] = -((((25 + 116) - 64) + 127) ^ (((16 + 59) - (-51)) + 66));
        lIllllIII[1] = (49 ^ 32) ^ (139 ^ 150);
        lIllllIII[2] = (-" ".length()) & (-1) & Integer.MAX_VALUE;
        lIllllIII[3] = (90 ^ 26) ^ (9 ^ 123);
        lIllllIII[4] = 225 ^ 167;
    }

    public Dimension render(Graphics2D graphics2D) {
        if (lIlIIIlllII(this.bk.ah() ? 1 : 0)) {
            return null;
        }
        OverlayUtil.renderTextLocation(graphics2D, new Point(lIllllIII[3], lIllllIII[4]), this.bk.af().toString() + " ms", Color.RED);
        return null;
    }

    private /* synthetic */ Polygon a(LocalPoint localPoint) {
        return Perspective.getCanvasTilePoly(this.bl, localPoint);
    }

    private static boolean lIlIIlIIIII(int i2) {
        return i2 >= 0;
    }

    private static boolean lIlIIIlllIl(Object obj) {
        return obj != null;
    }

    private static boolean lIlIIlIIIIl(int i2, int i3) {
        return i2 == i3;
    }

    private static boolean lIlIIIlllll(int i2, int i3) {
        return i2 < i3;
    }

    private static boolean lIlIIIllllI(Object obj) {
        return obj == null;
    }

    private /* synthetic */ LocalPoint e(WorldPoint worldPoint) {
        return LocalPoint.fromWorld(this.bl, worldPoint);
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        if (lIlIIIlllII(this.bk.ae() ? 1 : 0)) {
            this.bf = null;
        } else if (lIlIIIlllIl(this.bf)) {
        } else {
            Player local = Players.getLocal();
            WorldPoint aj = this.bk.aj();
            if (lIlIIIllllI(aj)) {
                return;
            }
            this.bf = local.getWorldLocation().pathTo(this.bl, aj);
        }
    }

    @Inject
    public F(ResetPlugin resetPlugin, Client client) {
        setLayer(OverlayLayer.ABOVE_SCENE);
        setPosition(OverlayPosition.DYNAMIC);
        this.bk = resetPlugin;
        this.bl = client;
    }

    public void aa() {
        this.bm.clear();
        WorldPoint worldLocation = Players.getLocal().getWorldLocation();
        int i2 = lIllllIII[0];
        while (lIlIIIlllll(i2, lIllllIII[1])) {
            int i3 = lIllllIII[0];
            while (lIlIIIlllll(i3, lIllllIII[1])) {
                WorldPoint dy = worldLocation.dx(i2).dy(i3);
                int distanceToPath = worldLocation.distanceToPath(this.bl, dy);
                if (lIlIIlIIIII(distanceToPath)) {
                    if (lIlIIlIIIIl(distanceToPath, lIllllIII[2])) {
                        "".length();
                        if (0 != 0) {
                            return;
                        }
                    } else {
                        this.bm.put(dy, Integer.valueOf(distanceToPath));
                        "".length();
                    }
                }
                i3++;
                "".length();
                if (0 != 0) {
                    return;
                }
            }
            i2++;
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return;
            }
        }
    }

    static {
        lIlIIIllIll();
    }
}
