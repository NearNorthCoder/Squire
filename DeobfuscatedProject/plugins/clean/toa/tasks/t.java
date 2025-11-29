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
package gg.squire.toa.tasks;

import gg.squire.toa.tasks.ToaManager;
import gg.squire.toa.tasks.ToaTaskBase;
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
extends ToaTaskBase {
    private final  j aB;
    private final  TOAConfig aA;
    private final  Client az;

    private static boolean lIllIlIllllllIl(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private void d(Graphics2D graphics2D) {
        void var1;
        Object var2;
        Projectile var3;
        t var4;
        if (t.lIllIlIllllllII(this.aA.renderKephriFire() ? 1 : 0)) {
            return;
        }
        var4.aB.r().removeIf(projectile -> {
            boolean bl;
            if (t.lIllIlIlllllllI(projectile.getEndCycle(), this.az.getGameCycle())) {
                bl = lIlIIIIIIlllI[4];

                if ((2 ^ 0x67 ^ (0x67 ^ 6)) <= ((0x23 ^ 0x63 ^ (0xBD ^ 0xB0)) & (0xB8 ^ 0xC5 ^ (0x91 ^ 0xA1) ^ -1))) {
                    return false;
                }
            } else {
                bl = lIlIIIIIIlllI[3];
            }
            return bl;
        });

        var4.aB.s().removeIf(projectile -> {
            boolean bl;
            if (t.lIllIlIlllllllI(projectile.getEndCycle(), this.az.getGameCycle())) {
                bl = lIlIIIIIIlllI[4];

                if (((0x30 ^ 0x27) & ~(0xB6 ^ 0xA1)) != 0) {
                    return false;
                }
            } else {
                bl = lIlIIIIIIlllI[3];
            }
            return bl;
        });

        Iterator<Projectile> var5 = var4.aB.r().iterator();
        while (t.lIllIlIllllllIl(var5.hasNext() ? 1 : 0)) {
            var3 = var5.next();
            var2 = var3.getTarget();
            Color var6 = new Color(lIlIIIIIIlllI[0], lIlIIIIIIlllI[1], lIlIIIIIIlllI[1], lIlIIIIIIlllI[2]);
            var4.a((Graphics2D)var1, var6, (LocalPoint)var2);

            if (3 > ((0x40 ^ 0xC) & ~(0xD2 ^ 0x9E))) continue;
            return;
        }
        var5 = var4.aB.s().iterator();
        while (t.lIllIlIllllllIl(var5.hasNext() ? 1 : 0)) {
            var3 = var5.next();
            var2 = new Color(lIlIIIIIIlllI[0], lIlIIIIIIlllI[3], lIlIIIIIIlllI[3], lIlIIIIIIlllI[2]);
            var4.a((Graphics2D)var1, (Color)var2, var3.getTarget());

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

