/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Projectile
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.client.ui.overlay.OverlayLayer
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.OverlayPriority
 */
package -.r.u.q.e.s.o.t.a.i;

import -.r.u.q.e.s.o.t.a.i.j;
import -.r.u.q.e.s.o.t.a.i.w;
import gg.squire.toa.TOAConfig;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.util.Iterator;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Projectile;
import net.runelite.api.coords.LocalPoint;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;

public class t
extends w {
    private final /* synthetic */ j aB;
    private final /* synthetic */ TOAConfig aA;
    private final /* synthetic */ Client az;
    private static /* synthetic */ int[] lIlIIIIIIlllI;

    private static boolean lIllIlIllllllIl(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private void d(Graphics2D graphics2D) {
        void var2;
        Object var6;
        Projectile var3;
        t var5;
        if (t.lIllIlIllllllII(this.aA.renderKephriFire() ? 1 : 0)) {
            return;
        }
        var5.aB.r().removeIf(projectile -> {
            boolean bl;
            if (t.lIllIlIlllllllI(projectile.getEndCycle(), this.az.getGameCycle())) {
                bl = lIlIIIIIIlllI[4];
                0;
                if ((2 ^ 0x67 ^ (0x67 ^ 6)) <= ((0x23 ^ 0x63 ^ (0xBD ^ 0xB0)) & (0xB8 ^ 0xC5 ^ (0x91 ^ 0xA1) ^ -1))) {
                    return false;
                }
            } else {
                bl = lIlIIIIIIlllI[3];
            }
            return bl;
        });
        0;
        var5.aB.s().removeIf(projectile -> {
            boolean bl;
            if (t.lIllIlIlllllllI(projectile.getEndCycle(), this.az.getGameCycle())) {
                bl = lIlIIIIIIlllI[4];
                0;
                if (((0x30 ^ 0x27) & ~(0xB6 ^ 0xA1)) != 0) {
                    return false;
                }
            } else {
                bl = lIlIIIIIIlllI[3];
            }
            return bl;
        });
        0;
        Iterator<Projectile> var4 = var5.aB.r().iterator();
        while (t.lIllIlIllllllIl(var4.hasNext() ? 1 : 0)) {
            var3 = var4.next();
            var6 = var3.getTarget();
            Color var1 = new Color(lIlIIIIIIlllI[0], lIlIIIIIIlllI[1], lIlIIIIIIlllI[1], lIlIIIIIIlllI[2]);
            var5.a((Graphics2D)var2, var1, (LocalPoint)var6);
            0;
            if (3 > ((0x40 ^ 0xC) & ~(0xD2 ^ 0x9E))) continue;
            return;
        }
        var4 = var5.aB.s().iterator();
        while (t.lIllIlIllllllIl(var4.hasNext() ? 1 : 0)) {
            var3 = var4.next();
            var6 = new Color(lIlIIIIIIlllI[0], lIlIIIIIIlllI[3], lIlIIIIIIlllI[3], lIlIIIIIIlllI[2]);
            var5.a((Graphics2D)var2, (Color)var6, var3.getTarget());
            0;
            if (1 >= 0) continue;
            return;
        }
    }

    private static boolean lIllIlIlllllllI(int n2, int n3) {
        return n2 < n3;
    }

    public Dimension render(Graphics2D graphics2D) {
        this.d(graphics2D);
        return null;
    }

    static {
        t.lIllIlIlllllIll();
    }

    private static void lIllIlIlllllIll() {
        lIlIIIIIIlllI = new int[5];
        t.lIlIIIIIIlllI[0] = (0xD2 ^ 0xBA) + (50 + 56 - 34 + 147) - (115 + 53 - 155 + 160) + (0x32 ^ 0x5B);
        t.lIlIIIIIIlllI[1] = 0xD7 ^ 0xB4 ^ (0x5E ^ 1);
        t.lIlIIIIIIlllI[2] = 6 + 52 - -75 + 48;
        t.lIlIIIIIIlllI[3] = (0x97 ^ 0x8C ^ (0x7C ^ 0x2F)) & (0x33 ^ 0xA ^ (0xA ^ 0x7B) ^ -1);
        t.lIlIIIIIIlllI[4] = 1;
    }

    @Inject
    protected t(Client client, TOAConfig tOAConfig, j j2) {
        super(tOAConfig);
        this.az = client;
        this.aA = tOAConfig;
        this.aB = j2;
        this.setPriority(OverlayPriority.HIGH);
        this.setPosition(OverlayPosition.DYNAMIC);
        this.setLayer(OverlayLayer.UNDER_WIDGETS);
    }

    private static boolean lIllIlIllllllII(int n2) {
        return n2 == 0;
    }
}

