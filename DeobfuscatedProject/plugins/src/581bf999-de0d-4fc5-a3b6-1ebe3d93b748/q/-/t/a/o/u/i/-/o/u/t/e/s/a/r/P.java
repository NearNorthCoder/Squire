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
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.S;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.p;

public class P
extends S {
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
        P.llIIIIIlIll[4] = " ".length();
    }

    /*
     * WARNING - void declaration
     */
    private void d(Graphics2D graphics2D) {
        void llllllllllllllllIlIIIlllIlllllII;
        P llllllllllllllllIlIIIlllIlllllIl;
        Object llllllllllllllllIlIIIlllIllllIIl;
        Projectile llllllllllllllllIlIIIlllIllllIlI;
        this.bO.S().removeIf(projectile -> {
            boolean bl2;
            if (P.lIIlllIIllIIll(projectile.getEndCycle(), this.bM.getGameCycle())) {
                bl2 = llIIIIIlIll[4];
                "".length();
                if (("  ".length() & ("  ".length() ^ -" ".length())) != 0) {
                    return ((0x70 ^ 0x40 ^ (0x5A ^ 0x78)) & (90 + 105 - 102 + 43 ^ 62 + 62 - 27 + 57 ^ -" ".length())) != 0;
                }
            } else {
                bl2 = llIIIIIlIll[3];
            }
            return bl2;
        });
        "".length();
        this.bO.T().removeIf(projectile -> {
            boolean bl2;
            if (P.lIIlllIIllIIll(projectile.getEndCycle(), this.bM.getGameCycle())) {
                bl2 = llIIIIIlIll[4];
                "".length();
                if (-"   ".length() >= 0) {
                    return ((26 + 49 - 27 + 93 ^ 20 + 78 - 14 + 54) & (16 + 100 - 73 + 90 ^ 18 + 114 - 78 + 76 ^ -" ".length())) != 0;
                }
            } else {
                bl2 = llIIIIIlIll[3];
            }
            return bl2;
        });
        "".length();
        Iterator<Projectile> llllllllllllllllIlIIIlllIllllIll = this.bO.S().iterator();
        while (P.lIIlllIIllIIlI(llllllllllllllllIlIIIlllIllllIll.hasNext() ? 1 : 0)) {
            llllllllllllllllIlIIIlllIllllIlI = llllllllllllllllIlIIIlllIllllIll.next();
            llllllllllllllllIlIIIlllIllllIIl = llllllllllllllllIlIIIlllIllllIlI.getTarget();
            Color llllllllllllllllIlIIIlllIllllIII = new Color(llIIIIIlIll[0], llIIIIIlIll[1], llIIIIIlIll[1], llIIIIIlIll[2]);
            llllllllllllllllIlIIIlllIlllllIl.a((Graphics2D)llllllllllllllllIlIIIlllIlllllII, llllllllllllllllIlIIIlllIllllIII, (LocalPoint)llllllllllllllllIlIIIlllIllllIIl);
            "".length();
            if (((0x87 ^ 0x9F) & ~(0x6D ^ 0x75)) == 0) continue;
            return;
        }
        llllllllllllllllIlIIIlllIllllIll = llllllllllllllllIlIIIlllIlllllIl.bO.T().iterator();
        while (P.lIIlllIIllIIlI(llllllllllllllllIlIIIlllIllllIll.hasNext() ? 1 : 0)) {
            llllllllllllllllIlIIIlllIllllIlI = llllllllllllllllIlIIIlllIllllIll.next();
            llllllllllllllllIlIIIlllIllllIIl = new Color(llIIIIIlIll[0], llIIIIIlIll[3], llIIIIIlIll[3], llIIIIIlIll[2]);
            llllllllllllllllIlIIIlllIlllllIl.a((Graphics2D)llllllllllllllllIlIIIlllIlllllII, (Color)llllllllllllllllIlIIIlllIllllIIl, llllllllllllllllIlIIIlllIllllIlI.getTarget());
            "".length();
            if (null == null) continue;
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

