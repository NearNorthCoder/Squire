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

public class THelper
extends ToaTaskBase {
    private final  j aB;
    private final  TOAConfig aA;
    private final  Client az;

    private static boolean var2(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private void d(Graphics2D graphics2D) {
        void var3;
        Object var4;
        Projectile var5;
        t var6;
        if (t.var7(this.aA.renderKephriFire() ? 1 : 0)) {
            return;
        }
        var6.aB.r().removeIf(projectile -> {
            boolean bl;
            if (t.var8(projectile.getEndCycle(), this.az.getGameCycle())) {
                bl = var1[4];
                0;
                if ((2 ^ 0x67 ^ (0x67 ^ 6)) <= ((0x23 ^ 0x63 ^ (0xBD ^ 0xB0)) & (0xB8 ^ 0xC5 ^ (0x91 ^ 0xA1) ^ -1))) {
                    return ((182 + 39 - 81 + 50 ^ 5 + 47 - -5 + 80) & (83 + 71 - 124 + 156 ^ 14 + 1 - -29 + 97 ^ -1)) != 0;
                }
            } else {
                bl = var1[3];
            }
            return bl;
        });
        0;
        var6.aB.s().removeIf(projectile -> {
            boolean bl;
            if (t.var8(projectile.getEndCycle(), this.az.getGameCycle())) {
                bl = var1[4];
                0;
                if (((0x30 ^ 0x27) & ~(0xB6 ^ 0xA1)) != 0) {
                    return ((3 ^ 0xE) & ~(0x53 ^ 0x5E)) != 0;
                }
            } else {
                bl = var1[3];
            }
            return bl;
        });
        0;
        Iterator<Projectile> var9 = var6.aB.r().iterator();
        while (t.var2(var9.hasNext() ? 1 : 0)) {
            var5 = var9.next();
            var4 = var5.getTarget();
            Color var10 = new Color(var1[0], var1[1], var1[1], var1[2]);
            var6.a((Graphics2D)var3, var10, (LocalPoint)var4);
            0;
            if (3 > ((0x40 ^ 0xC) & ~(0xD2 ^ 0x9E))) continue;
            return;
        }
        var9 = var6.aB.s().iterator();
        while (t.var2(var9.hasNext() ? 1 : 0)) {
            var5 = var9.next();
            var4 = new Color(var1[0], var1[3], var1[3], var1[2]);
            var6.a((Graphics2D)var3, (Color)var4, var5.getTarget());
            0;
            
            return;
        }
    }

    private static boolean var8(int n2, int n3) {
        return n2 < n3;
    }

    public Dimension render(Graphics2D graphics2D) {
        this.d(graphics2D);
        return null;
    }

    static {
        t.var11();
    }

    private static void var11() {
        var1 = new int[5];
        t.var1[0] = (0xD2 ^ 0xBA) + (50 + 56 - 34 + 147) - (115 + 53 - 155 + 160) + (0x32 ^ 0x5B);
        t.var1[1] = 0xD7 ^ 0xB4 ^ (0x5E ^ 1);
        t.var1[2] = 6 + 52 - -75 + 48;
        t.var1[3] = (0x97 ^ 0x8C ^ (0x7C ^ 0x2F)) & (0x33 ^ 0xA ^ (0xA ^ 0x7B) ^ -1);
        t.var1[4] = 1;
    }

    @Inject
    protected THelper(Client client, TOAConfig tOAConfig, j j2) {
        super(tOAConfig);
        this.az = client;
        this.aA = tOAConfig;
        this.aB = j2;
        this.setPriority(OverlayPriority.HIGH);
        this.setPosition(OverlayPosition.DYNAMIC);
        this.setLayer(OverlayLayer.UNDER_WIDGETS);
    }

    private static boolean var7(int n2) {
        return n2 == 0;
    }
}

