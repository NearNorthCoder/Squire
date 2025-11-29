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
package gg.squire.toa.tasks;

import gg.squire.toa.tasks.ToaManager;
import gg.squire.toa.tasks.ToaTaskBase;
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
public class SHelper
extends ToaTaskBase {
    private final  e ay;

    public Dimension render(Graphics2D graphics2D) {
        this.c(graphics2D);
        return null;
    }

    private static boolean lIllIlIIlIIIllI(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private void c(Graphics2D graphics2D) {
        Color color = new Color(lIIllllIIllIl[0], lIIllllIIllIl[1], lIIllllIIllIl[1], lIIllllIIllIl[2]);
        Iterator<GraphicsObject> var1 = this.ay.d().iterator();
        while (s.lIllIlIIlIIIllI(var1.hasNext() ? 1 : 0)) {
            void var2;
            void var3;
            s var4;
            GraphicsObject var5 = var1.next();
            Polygon var6 = Perspective.getCanvasTilePoly((Client)var4.M, (LocalPoint)var5.getLocation());
            if (s.lIllIlIIlIIIlll(var6)) {

                if (((95 + 40 - 123 + 222 ^ 36 + 156 - 47 + 47) & (0x9D ^ 0xBF ^ (0x3C ^ 0x34) ^ -1)) <= ((0x6A ^ 0x30 ^ (0xAF ^ 0xB0)) & (0xF9 ^ 0x8A ^ (0x30 ^ 6) ^ -1))) continue;
                return;
            }
            OverlayUtil.renderPolygon((Graphics2D)var3, (Shape)var6, (Color)var2, (Color)var2, (Stroke)new BasicStroke(0.25f));

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
    protected SHelper(TOAConfig tOAConfig, e e2) {
        super(tOAConfig);
        this.ay = e2;
    }
}

