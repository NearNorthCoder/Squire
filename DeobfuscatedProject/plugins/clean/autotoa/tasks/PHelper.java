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

    /*
     * WARNING - void declaration
     */
    private void d(Graphics2D graphics2D) {
        void var1;
        P var2;
        Object var3;
        Projectile var4;
        this.bO.S().removeIf(projectile -> {
            boolean bl2;
            if (P.lIIlllIIllIIll(projectile.getEndCycle(), this.bM.getGameCycle())) {
                bl2 = llIIIIIlIll[4];

                if ((2 & (2 ^ -1)) != 0) {
                    return ((0x70 ^ 0x40 ^ (0x5A ^ 0x78)) & (90 + 105 - 102 + 43 ^ 62 + 62 - 27 + 57 ^ -1)) != 0;
                }
            } else {
                bl2 = llIIIIIlIll[3];
            }
            return bl2;
        });

        this.bO.T().removeIf(projectile -> {
            boolean bl2;
            if (P.lIIlllIIllIIll(projectile.getEndCycle(), this.bM.getGameCycle())) {
                bl2 = llIIIIIlIll[4];

            } else {
                bl2 = llIIIIIlIll[3];
            }
            return bl2;
        });

        Iterator<Projectile> var5 = this.bO.S().iterator();
        while (P.lIIlllIIllIIlI(var5.hasNext() ? 1 : 0)) {
            var4 = var5.next();
            var3 = var4.getTarget();
            Color var6 = new Color(llIIIIIlIll[0], llIIIIIlIll[1], llIIIIIlIll[1], llIIIIIlIll[2]);
            var2.a((Graphics2D)var1, var6, (LocalPoint)var3);

            if (((0x87 ^ 0x9F) & ~(0x6D ^ 0x75)) == 0) continue;
            return;
        }
        var5 = var2.bO.T().iterator();
        while (P.lIIlllIIllIIlI(var5.hasNext() ? 1 : 0)) {
            var4 = var5.next();
            var3 = new Color(llIIIIIlIll[0], llIIIIIlIll[3], llIIIIIlIll[3], llIIIIIlIll[2]);
            var2.a((Graphics2D)var1, (Color)var3, var4.getTarget());

            return;
        }
    }

    private static boolean lIIlllIIllIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlllIIllIIlI(int n2) {
        return n2 != 0;
    }

    static {
        P.lIIlllIIllIIIl();
    }

    public Dimension render(Graphics2D graphics2D) {
        this.d(graphics2D);
        return null;
    }
}

