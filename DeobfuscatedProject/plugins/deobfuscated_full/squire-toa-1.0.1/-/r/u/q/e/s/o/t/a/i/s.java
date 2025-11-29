/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  net.runelite.api.Client
 *  net.runelite.api.GraphicsObject
 *  net.runelite.api.Perspective
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.client.ui.overlay.OverlayUtil
 */
package -.r.u.q.e.s.o.t.a.i;

import -.r.u.q.e.s.o.t.a.i.e;
import -.r.u.q.e.s.o.t.a.i.w;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.toa.TOAConfig;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;
import java.awt.Stroke;
import java.util.Iterator;
import net.runelite.api.Client;
import net.runelite.api.GraphicsObject;
import net.runelite.api.Perspective;
import net.runelite.api.coords.LocalPoint;
import net.runelite.client.ui.overlay.OverlayUtil;

@Singleton
public class s
extends w {
    private final /* synthetic */ e ay;
    private static /* synthetic */ int[] lIIllllIIllIl;

    public Dimension render(Graphics2D graphics2D) {
        this.c(graphics2D);
        return null;
    }

    private static void lIllIlIIlIIIlIl() {
        lIIllllIIllIl = new int[3];
        s.lIIllllIIllIl[0] = (0x61 ^ 0x28) + (124 + 233 - 161 + 54) - (0xFFFFE736 & 0x19EF) + (216 + 92 - 100 + 18);
        s.lIIllllIIllIl[1] = (0x2A ^ 0x35) & ~(0x31 ^ 0x2E);
        s.lIIllllIIllIl[2] = 0x41 ^ 0x58;
    }

    private static boolean lIllIlIIlIIIllI(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private void c(Graphics2D graphics2D) {
        Color color = new Color(lIIllllIIllIl[0], lIIllllIIllIl[1], lIIllllIIllIl[1], lIIllllIIllIl[2]);
        Iterator<GraphicsObject> var4 = this.ay.d().iterator();
        while (s.lIllIlIIlIIIllI(var4.hasNext() ? 1 : 0)) {
            void var1;
            void var3;
            s var5;
            GraphicsObject var6 = var4.next();
            Polygon var2 = Perspective.getCanvasTilePoly((Client)var5.M, (LocalPoint)var6.getLocation());
            if (s.lIllIlIIlIIIlll(var2)) {
                0;
                if (((95 + 40 - 123 + 222 ^ 36 + 156 - 47 + 47) & (0x9D ^ 0xBF ^ (0x3C ^ 0x34) ^ -1)) <= ((0x6A ^ 0x30 ^ (0xAF ^ 0xB0)) & (0xF9 ^ 0x8A ^ (0x30 ^ 6) ^ -1))) continue;
                return;
            }
            OverlayUtil.renderPolygon((Graphics2D)var3, (Shape)var2, (Color)var1, (Color)var1, (Stroke)new BasicStroke(0.25f));
            0;
            if (-1 != ((1 ^ (0xD9 ^ 0x97)) & (0x6E ^ 0x25 ^ (0x3F ^ 0x3B) ^ -1))) continue;
            return;
        }
    }

    private static boolean lIllIlIIlIIIlll(Object object) {
        return object == null;
    }

    static {
        s.lIllIlIIlIIIlIl();
    }

    @Inject
    protected s(TOAConfig tOAConfig, e e2) {
        super(tOAConfig);
        this.ay = e2;
    }
}

