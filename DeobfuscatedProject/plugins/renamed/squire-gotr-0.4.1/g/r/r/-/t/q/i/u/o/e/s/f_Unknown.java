/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.GameObject
 *  net.runelite.api.TileObject
 *  net.runelite.api.events.GameTick
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayLayer
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.unethicalite.api.entities.TileObjects
 */
package g.r.r.-.t.q.i.u.o.e.s;

import g.r.r.-.t.q.i.u.o.e.s.DEnum;
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

public class f_Unknown
extends Overlay {
    private final /* synthetic */ Client aM;
    private /* synthetic */ TileObject aP;
    private final /* synthetic */ SquireGOTRPlugin aN;
    private static /* synthetic */ int[] llIIllllIIII;
    private final /* synthetic */ SquireGOTRConfig aO;

    static {
        f.lllllllIlllIll();
    }

    /*
     * WARNING - void declaration
     */
    private void a(Graphics2D graphics2D, GameObject gameObject) {
        void var3_3;
        void var1;
        if (f.lllllllIlllllI(gameObject)) {
            return;
        }
        Shape var2 = var1.getConvexHull();
        if (f.lllllllIlllllI(var2)) {
            return;
        }
        Color color = ColorScheme.BRAND_ORANGE;
        graphics2D.setColor(color);
        graphics2D.draw((Shape)var3_3);
        graphics2D.setColor(new Color(color.getRed(), color.getGreen(), color.getBlue(), llIIllllIIII[2]));
        graphics2D.fill((Shape)var3_3);
    }

    private static void lllllllIlllIll() {
        llIIllllIIII = new int[3];
        f.llIIllllIIII[0] = 1;
        f.llIIllllIIII[1] = (0x93 ^ 0x8D ^ (0xD3 ^ 0x8F)) & (2 ^ (0x59 ^ 0x19) ^ -1);
        f.llIIllllIIII[2] = 0x39 ^ 0x2D;
    }

    @Inject
    f(Client client, SquireGOTRPlugin squireGOTRPlugin, SquireGOTRConfig squireGOTRConfig) {
        this.setLayer(OverlayLayer.ABOVE_SCENE);
        this.setPosition(OverlayPosition.DYNAMIC);
        this.aM = client;
        this.aN = squireGOTRPlugin;
        this.aO = squireGOTRConfig;
    }

    private static boolean lllllllIllllIl(int n2) {
        return n2 == 0;
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        d d2 = this.aN.h();
        if (f.lllllllIllllII((Object)d2)) {
            String[] stringArray = new String[llIIllllIIII[0]];
            stringArray[f.llIIllllIIII[1]] = d2.T();
            this.aP = TileObjects.getNearest((String[])stringArray);
        }
    }

    private static boolean lllllllIlllllI(Object object) {
        return object == null;
    }

    public Dimension render(Graphics2D graphics2D) {
        if (f.lllllllIllllIl(this.aO.highlightTarget() ? 1 : 0)) {
            return null;
        }
        this.a(graphics2D, (GameObject)this.aP);
        return null;
    }

    private static boolean lllllllIllllII(Object object) {
        return object != null;
    }
}

