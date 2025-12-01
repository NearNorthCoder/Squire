package g.r.r.p000.t.q.i.u.o.e.s;

import gg.squire.runecrafting.SquireGOTRConfig;
import gg.squire.runecrafting.SquireGOTRPlugin;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Shape;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.GameObject;
import net.runelite.api.TileObject;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.unethicalite.api.entities.TileObjects;
/* renamed from: g.r.r.-.t.q.i.u.o.e.s.f  reason: invalid package */
/* loaded from: squire-gotr-0.4.1.jar:g/r/r/-/t/q/i/u/o/e/s/f.class */
public class f extends Overlay {
    private final /* synthetic */ Client aM;
    private /* synthetic */ TileObject aP;
    private final /* synthetic */ SquireGOTRPlugin aN;
    private static /* synthetic */ int[] llIIllllIIII;
    private final /* synthetic */ SquireGOTRConfig aO;

    static {
        lllllllIlllIll();
    }

    private void a(Graphics2D graphics2D, GameObject gameObject) {
        if (lllllllIlllllI(gameObject)) {
            return;
        }
        Shape convexHull = gameObject.getConvexHull();
        if (lllllllIlllllI(convexHull)) {
            return;
        }
        Color color = ColorScheme.BRAND_ORANGE;
        graphics2D.setColor(color);
        graphics2D.draw(convexHull);
        graphics2D.setColor(new Color(color.getRed(), color.getGreen(), color.getBlue(), llIIllllIIII[2]));
        graphics2D.fill(convexHull);
    }

    private static void lllllllIlllIll() {
        llIIllllIIII = new int[3];
        llIIllllIIII[0] = " ".length();
        llIIllllIIII[1] = ((147 ^ 141) ^ (211 ^ 143)) & (("  ".length() ^ (89 ^ 25)) ^ (-" ".length()));
        llIIllllIIII[2] = 57 ^ 45;
    }

    @Inject
    f(Client client, SquireGOTRPlugin squireGOTRPlugin, SquireGOTRConfig squireGOTRConfig) {
        setLayer(OverlayLayer.ABOVE_SCENE);
        setPosition(OverlayPosition.DYNAMIC);
        this.aM = client;
        this.aN = squireGOTRPlugin;
        this.aO = squireGOTRConfig;
    }

    private static boolean lllllllIllllIl(int i) {
        return i == 0;
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        d h = this.aN.h();
        if (lllllllIllllII(h)) {
            String[] strArr = new String[llIIllllIIII[0]];
            strArr[llIIllllIIII[1]] = h.T();
            this.aP = TileObjects.getNearest(strArr);
        }
    }

    private static boolean lllllllIlllllI(Object obj) {
        return obj == null;
    }

    public Dimension render(Graphics2D graphics2D) {
        if (lllllllIllllIl(this.aO.highlightTarget() ? 1 : 0)) {
            return null;
        }
        a(graphics2D, (GameObject) this.aP);
        return null;
    }

    private static boolean lllllllIllllII(Object obj) {
        return obj != null;
    }
}
