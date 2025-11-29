package p000.r.u.q.e.s.o.t.a.i;

import gg.squire.toa.TOAConfig;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Projectile;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
/* renamed from: -.r.u.q.e.s.o.t.a.i.t  reason: invalid package */
/* loaded from: squire-toa-1.0.1.jar:-/r/u/q/e/s/o/t/a/i/t.class */
public class t extends w {
    private final /* synthetic */ C0009j aB;
    private final /* synthetic */ TOAConfig aA;
    private final /* synthetic */ Client az;
    private static /* synthetic */ int[] lIlIIIIIIlllI;

    private static boolean lIllIlIllllllIl(int i) {
        return i != 0;
    }

    private void d(Graphics2D graphics2D) {
        if (lIllIlIllllllII(this.aA.renderKephriFire() ? 1 : 0)) {
            return;
        }
        this.aB.r().removeIf(projectile -> {
            if (lIllIlIlllllllI(projectile.getEndCycle(), this.az.getGameCycle())) {
                ?? r0 = lIlIIIIIIlllI[4];
                "".length();
                return ((2 ^ 103) ^ (103 ^ 6)) <= (((35 ^ 99) ^ (189 ^ 176)) & (((184 ^ 197) ^ (145 ^ 161)) ^ (-" ".length()))) ? ((((182 + 39) - 81) + 50) ^ (((5 + 47) - (-5)) + 80)) & (((((83 + 71) - 124) + 156) ^ (((14 + 1) - (-29)) + 97)) ^ (-" ".length())) : r0;
            }
            return lIlIIIIIIlllI[3];
        });
        "".length();
        this.aB.s().removeIf(projectile2 -> {
            if (lIllIlIlllllllI(projectile2.getEndCycle(), this.az.getGameCycle())) {
                ?? r0 = lIlIIIIIIlllI[4];
                "".length();
                return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIlIIIIIIlllI[3];
        });
        "".length();
        for (Projectile projectile3 : this.aB.r()) {
            a(graphics2D, new Color(lIlIIIIIIlllI[0], lIlIIIIIIlllI[1], lIlIIIIIIlllI[1], lIlIIIIIIlllI[2]), projectile3.getTarget());
            "".length();
            if ("   ".length() <= ((64 ^ 12) & ((210 ^ 158) ^ (-1)))) {
                return;
            }
        }
        for (Projectile projectile4 : this.aB.s()) {
            a(graphics2D, new Color(lIlIIIIIIlllI[0], lIlIIIIIIlllI[3], lIlIIIIIIlllI[3], lIlIIIIIIlllI[2]), projectile4.getTarget());
            "".length();
            if (" ".length() < 0) {
                return;
            }
        }
    }

    private static boolean lIllIlIlllllllI(int i, int i2) {
        return i < i2;
    }

    public Dimension render(Graphics2D graphics2D) {
        d(graphics2D);
        return null;
    }

    static {
        lIllIlIlllllIll();
    }

    private static void lIllIlIlllllIll() {
        lIlIIIIIIlllI = new int[5];
        lIlIIIIIIlllI[0] = (((210 ^ 186) + (((50 + 56) - 34) + 147)) - (((115 + 53) - 155) + 160)) + (50 ^ 91);
        lIlIIIIIIlllI[1] = (215 ^ 180) ^ (94 ^ 1);
        lIlIIIIIIlllI[2] = ((6 + 52) - (-75)) + 48;
        lIlIIIIIIlllI[3] = ((151 ^ 140) ^ (124 ^ 47)) & (((51 ^ 10) ^ (10 ^ 123)) ^ (-" ".length()));
        lIlIIIIIIlllI[4] = " ".length();
    }

    @Inject
    protected t(Client client, TOAConfig tOAConfig, C0009j c0009j) {
        super(tOAConfig);
        this.az = client;
        this.aA = tOAConfig;
        this.aB = c0009j;
        setPriority(OverlayPriority.HIGH);
        setPosition(OverlayPosition.DYNAMIC);
        setLayer(OverlayLayer.UNDER_WIDGETS);
    }

    private static boolean lIllIlIllllllII(int i) {
        return i == 0;
    }
}
