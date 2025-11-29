/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Perspective
 *  net.runelite.api.Point
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayLayer
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.OverlayPriority
 *  net.runelite.client.ui.overlay.OverlayUtil
 */
package gg.squire.construction.tasks;

import gg.squire.basics.secondaries.SecondariesPlugin;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;
import java.awt.Stroke;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Perspective;
import net.runelite.api.Point;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.OverlayUtil;

public class bQ
extends Overlay {
    private final  Client gO;

    private final  SecondariesPlugin gP;

    /*
     * WARNING - void declaration
     */
    public Dimension render(Graphics2D graphics2D) {
        LocalPoint llIlIlllIIlIlIl;
        bQ llIlIlllIIllIII;
        if (bQ.lIlllIllIl(this.gP.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        WorldPoint llIlIlllIIlIllI = llIlIlllIIllIII.gP.cT();
        if (bQ.lIlllIlllI(llIlIlllIIlIllI) && bQ.lIlllIlllI(llIlIlllIIlIlIl = LocalPoint.fromWorld((Client)llIlIlllIIllIII.gO, (WorldPoint)llIlIlllIIlIllI))) {
            void llIlIlllIIlIlll;
            String string;
            Color color;
            Color llIlIlllIIlIlII = ColorScheme.BRAND_YELLOW_TRANSPARENT;
            Color llIlIlllIIlIIll = new Color(llIlIlllIIlIlII.getRed(), llIlIlllIIlIlII.getGreen(), llIlIlllIIlIlII.getBlue(), llIlIIll[0]);
            if (bQ.lIlllIllIl(llIlIlllIIllIII.gP.cU() ? 1 : 0)) {
                color = Color.RED;

                if (2 == 0) {
                    return null;
                }
            } else {
                color = llIlIlllIIlIlII;
            }
            if (bQ.lIlllIllIl(llIlIlllIIllIII.gP.cU() ? 1 : 0)) {
                string = llIlIIlI[llIlIIll[1]];

                if (1 == 0) {
                    return null;
                }
            } else {
                string = llIlIIlI[llIlIIll[2]];
            }
            llIlIlllIIllIII.a((Graphics2D)llIlIlllIIlIlll, llIlIlllIIlIlIl, color, 1.0, llIlIlllIIlIIll, string);
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private void a(Graphics2D graphics2D, LocalPoint localPoint, Color color, double d2, Color color2, String string) {
        void llIlIlllIIIIIll;
        void llIlIlllIIIIlIl;
        void llIlIlllIIIIlII;
        void llIlIlllIIIIllI;
        void llIlIlllIIIlIII;
        void llIlIlllIIIIlll;
        bQ llIlIlllIIIlIIl;
        if (bQ.lIlllIllll(localPoint)) {
            return;
        }
        Polygon llIlIlllIIIIIlI = Perspective.getCanvasTilePoly((Client)llIlIlllIIIlIIl.gO, (LocalPoint)llIlIlllIIIIlll);
        if (bQ.lIlllIllll(llIlIlllIIIIIlI)) {
            return;
        }
        OverlayUtil.renderPolygon((Graphics2D)llIlIlllIIIlIII, (Shape)llIlIlllIIIIIlI, (Color)llIlIlllIIIIllI, (Color)llIlIlllIIIIlII, (Stroke)new BasicStroke((float)llIlIlllIIIIlIl));
        if (!bQ.lIlllIlllI(llIlIlllIIIIIll) || bQ.lIlllIllIl(llIlIlllIIIIIll.isEmpty() ? 1 : 0)) {
            return;
        }
        Point llIlIlllIIIIIIl = Perspective.getCanvasTextLocation((Client)llIlIlllIIIlIIl.gO, (Graphics2D)llIlIlllIIIlIII, (LocalPoint)llIlIlllIIIIlll, (String)llIlIlllIIIIIll, (int)llIlIIll[1]);
        if (bQ.lIlllIlllI(llIlIlllIIIIIIl)) {
            OverlayUtil.renderTextLocation((Graphics2D)llIlIlllIIIlIII, (Point)llIlIlllIIIIIIl, (String)llIlIlllIIIIIll, (Color)llIlIlllIIIIllI);
        }
    }

    @Inject
    private bQ(Client client, SecondariesPlugin secondariesPlugin) {
        this.gO = client;
        this.gP = secondariesPlugin;
        this.setPosition(OverlayPosition.DYNAMIC);
        this.setLayer(OverlayLayer.ABOVE_SCENE);
        this.setPriority(OverlayPriority.MED);
    }

    static {
        bQ.lIlllIllII();
        bQ.lIlllIlIlI();
    }

    private static boolean lIlllIllIl(int n2) {
        return n2 != 0;
    }

    private static void lIlllIlIlI() {
        llIlIIlI = new String[llIlIIll[3]];
        bQ.llIlIIlI[bQ.llIlIIll[1]] = "FULL INVENTORY";
        bQ.llIlIIlI[bQ.llIlIIll[2]] = bQ.lIlllIlIIl("", "Hfprf");
    }

    private static boolean lIllllIIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlllIllll(Object object) {
        return object == null;
    }

    private static boolean lIlllIlllI(Object object) {
        return object != null;
    }

        return String.valueOf(llIlIllIlllIlII);
    }
}

