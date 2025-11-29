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
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

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
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.S_Unknown;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.p_Unknown;

public class P_Unknown
extends S_Unknown {
    private static /* synthetic */ int[] llIIIIIlIll;
    private final /* synthetic */ p bO;
    private final /* synthetic */ TOAConfig bN;
    private final /* synthetic */ Client bM;

    @Inject
    protected P(Client client, TOAConfig tOAConfig, p p2) {
        super(tOAConfig);
        this.bM = client;
        this.bN = tOAConfig;
        this.bO = p2;
        this.setPriority(OverlayPriority.HIGH);
        this.setPosition(OverlayPosition.DYNAMIC);
        this.setLayer(OverlayLayer.UNDER_WIDGETS);
    }

    private static void lIIlllIIllIIIl() {
        llIIIIIlIll = new int[5];
        P.llIIIIIlIll[0] = 21 + 8 - -127 + 13 + (0x8C ^ 0xA2) - (132 + 79 - 182 + 159) + (192 + 87 - 196 + 145);
        P.llIIIIIlIll[1] = 0xE ^ 0x32;
        P.llIIIIIlIll[2] = 93 + 53 - 68 + 74 + (0x67 ^ 0x53) - (0x16 ^ 0x58) + (0x6F ^ 0x58);
        P.llIIIIIlIll[3] = (0x22 ^ 0xA) & ~(0x9D ^ 0xB5);
        P.llIIIIIlIll[4] = 1;
    }

    /*
     * WARNING - void declaration
     */
    private void d(Graphics2D graphics2D) {
        void var5;
        P var6;
        Object var4;
        Projectile var3;
        this.bO.S().removeIf(projectile -> {
            boolean bl2;
            if (P.lIIlllIIllIIll(projectile.getEndCycle(), this.bM.getGameCycle())) {
                bl2 = llIIIIIlIll[4];
                0;
                if ((2 & (2 ^ -1)) != 0) {
                    return ((0x70 ^ 0x40 ^ (0x5A ^ 0x78)) & (90 + 105 - 102 + 43 ^ 62 + 62 - 27 + 57 ^ -1)) != 0;
                }
            } else {
                bl2 = llIIIIIlIll[3];
            }
            return bl2;
        });
        0;
        this.bO.T().removeIf(projectile -> {
            boolean bl2;
            if (P.lIIlllIIllIIll(projectile.getEndCycle(), this.bM.getGameCycle())) {
                bl2 = llIIIIIlIll[4];
                0;
                if (-3 >= 0) {
                    return false;
                }
            } else {
                bl2 = llIIIIIlIll[3];
            }
            return bl2;
        });
        0;
        Iterator<Projectile> var1 = this.bO.S().iterator();
        while (P.lIIlllIIllIIlI(var1.hasNext() ? 1 : 0)) {
            var3 = var1.next();
            var4 = var3.getTarget();
            Color var2 = new Color(llIIIIIlIll[0], llIIIIIlIll[1], llIIIIIlIll[1], llIIIIIlIll[2]);
            var6.a((Graphics2D)var5, var2, (LocalPoint)var4);
            0;
            if (((0x87 ^ 0x9F) & ~(0x6D ^ 0x75)) == 0) continue;
            return;
        }
        var1 = var6.bO.T().iterator();
        while (P.lIIlllIIllIIlI(var1.hasNext() ? 1 : 0)) {
            var3 = var1.next();
            var4 = new Color(llIIIIIlIll[0], llIIIIIlIll[3], llIIIIIlIll[3], llIIIIIlIll[2]);
            var6.a((Graphics2D)var5, (Color)var4, var3.getTarget());
            0;
            
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

