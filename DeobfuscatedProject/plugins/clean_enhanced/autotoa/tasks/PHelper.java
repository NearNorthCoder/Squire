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
package gg.squire.autotoa.tasks;

import gg.squire.autotoa.TOAConfig;
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
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.AutotoaManager;

public class PHelper
extends AutotoaTaskBase {
    
    private final  p bO;
    private final  TOAConfig bN;
    private final  Client bM;

    @Inject
    protected PHelper(Client client, TOAConfig tOAConfig, p p2) {
        super(tOAConfig);
        this.bM = client;
        this.bN = tOAConfig;
        this.bO = p2;
        this.setPriority(OverlayPriority.HIGH);
        this.setPosition(OverlayPosition.DYNAMIC);
        this.setLayer(OverlayLayer.UNDER_WIDGETS);
    }

    private static void var2() {
        var1 = new int[5];
        P.var1[0] = 21 + 8 - -127 + 13 + (0x8C ^ 0xA2) - (132 + 79 - 182 + 159) + (192 + 87 - 196 + 145);
        P.var1[1] = 0xE ^ 0x32;
        P.var1[2] = 93 + 53 - 68 + 74 + (0x67 ^ 0x53) - (0x16 ^ 0x58) + (0x6F ^ 0x58);
        P.var1[3] = (0x22 ^ 0xA) & ~(0x9D ^ 0xB5);
        P.var1[4] = 1;
    }

    /*
     * WARNING - void declaration
     */
    private void d(Graphics2D graphics2D) {
        void var3;
        P var4;
        Object var5;
        Projectile var6;
        this.bO.S().removeIf(projectile -> {
            boolean bl2;
            if (P.var7(projectile.getEndCycle(), this.bM.getGameCycle())) {
                bl2 = var1[4];
                0;
                if ((2 & (2 ^ -1)) != 0) {
                    return ((0x70 ^ 0x40 ^ (0x5A ^ 0x78)) & (90 + 105 - 102 + 43 ^ 62 + 62 - 27 + 57 ^ -1)) != 0;
                }
            } else {
                bl2 = var1[3];
            }
            return bl2;
        });
        0;
        this.bO.T().removeIf(projectile -> {
            boolean bl2;
            if (P.var7(projectile.getEndCycle(), this.bM.getGameCycle())) {
                bl2 = var1[4];
                0;
                if (-3 >= 0) {
                    return ((26 + 49 - 27 + 93 ^ 20 + 78 - 14 + 54) & (16 + 100 - 73 + 90 ^ 18 + 114 - 78 + 76 ^ -1)) != 0;
                }
            } else {
                bl2 = var1[3];
            }
            return bl2;
        });
        0;
        Iterator<Projectile> var8 = this.bO.S().iterator();
        while (P.var9(var8.hasNext() ? 1 : 0)) {
            var6 = var8.next();
            var5 = var6.getTarget();
            Color var10 = new Color(var1[0], var1[1], var1[1], var1[2]);
            var4.a((Graphics2D)var3, var10, (LocalPoint)var5);
            0;
            if (((0x87 ^ 0x9F) & ~(0x6D ^ 0x75)) == 0) continue;
            return;
        }
        var8 = var4.bO.T().iterator();
        while (P.var9(var8.hasNext() ? 1 : 0)) {
            var6 = var8.next();
            var5 = new Color(var1[0], var1[3], var1[3], var1[2]);
            var4.a((Graphics2D)var3, (Color)var5, var6.getTarget());
            0;
            if null == null continue;
            return;
        }
    }

    private static boolean var7(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var9(int n2) {
        return n2 != 0;
    }

    static {
        P.var2();
    }

    public Dimension render(Graphics2D graphics2D) {
        this.d(graphics2D);
        return null;
    }
}

