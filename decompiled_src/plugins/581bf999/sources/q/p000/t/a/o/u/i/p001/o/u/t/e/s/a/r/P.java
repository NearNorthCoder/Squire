package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import gg.squire.autotoa.TOAConfig;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Projectile;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.P  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/P.class */
public class P extends S {
    private static /* synthetic */ int[] llIIIIIlIll;
    private final /* synthetic */ C0067p bO;
    private final /* synthetic */ TOAConfig bN;
    private final /* synthetic */ Client bM;

    @Inject
    protected P(Client client, TOAConfig tOAConfig, C0067p c0067p) {
        super(tOAConfig);
        this.bM = client;
        this.bN = tOAConfig;
        this.bO = c0067p;
        setPriority(OverlayPriority.HIGH);
        setPosition(OverlayPosition.DYNAMIC);
        setLayer(OverlayLayer.UNDER_WIDGETS);
    }

    private static void lIIlllIIllIIIl() {
        llIIIIIlIll = new int[5];
        llIIIIIlIll[0] = (((((21 + 8) - (-127)) + 13) + (140 ^ 162)) - (((132 + 79) - 182) + 159)) + ((192 + 87) - 196) + 145;
        llIIIIIlIll[1] = 14 ^ 50;
        llIIIIIlIll[2] = (((((93 + 53) - 68) + 74) + (103 ^ 83)) - (22 ^ 88)) + (111 ^ 88);
        llIIIIIlIll[3] = (34 ^ 10) & ((157 ^ 181) ^ (-1));
        llIIIIIlIll[4] = " ".length();
    }

    private void d(Graphics2D graphics2D) {
        this.bO.S().removeIf(projectile -> {
            if (lIIlllIIllIIll(projectile.getEndCycle(), this.bM.getGameCycle())) {
                ?? r0 = llIIIIIlIll[4];
                "".length();
                return ("  ".length() & ("  ".length() ^ (-" ".length()))) != 0 ? ((112 ^ 64) ^ (90 ^ 120)) & (((((90 + 105) - 102) + 43) ^ (((62 + 62) - 27) + 57)) ^ (-" ".length())) : r0;
            }
            return llIIIIIlIll[3];
        });
        "".length();
        this.bO.T().removeIf(projectile2 -> {
            if (lIIlllIIllIIll(projectile2.getEndCycle(), this.bM.getGameCycle())) {
                ?? r0 = llIIIIIlIll[4];
                "".length();
                return (-"   ".length()) >= 0 ? ((((26 + 49) - 27) + 93) ^ (((20 + 78) - 14) + 54)) & (((((16 + 100) - 73) + 90) ^ (((18 + 114) - 78) + 76)) ^ (-" ".length())) : r0;
            }
            return llIIIIIlIll[3];
        });
        "".length();
        for (Projectile projectile3 : this.bO.S()) {
            a(graphics2D, new Color(llIIIIIlIll[0], llIIIIIlIll[1], llIIIIIlIll[1], llIIIIIlIll[2]), projectile3.getTarget());
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return;
            }
        }
        for (Projectile projectile4 : this.bO.T()) {
            a(graphics2D, new Color(llIIIIIlIll[0], llIIIIIlIll[3], llIIIIIlIll[3], llIIIIIlIll[2]), projectile4.getTarget());
            "".length();
            if (0 != 0) {
                return;
            }
        }
    }

    private static boolean lIIlllIIllIIll(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIlllIIllIIlI(int i) {
        return i != 0;
    }

    static {
        lIIlllIIllIIIl();
    }

    public Dimension render(Graphics2D graphics2D) {
        d(graphics2D);
        return null;
    }
}
