package e.g.n.r.p.l.q.p000.p001.e.m.i.t.e.e.s.t.i.k.r.k.u;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.templeTrekking.TempleTrekkingPlugin;
import java.util.Random;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Player;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Starting route")
/* renamed from: e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.q  reason: invalid package */
/* loaded from: 1a91e21b-fcbe-4432-8f0e-1258958a8366.jar:e/g/n/r/p/l/q/-/-/e/m/i/t/e/e/s/t/i/k/r/k/u/q.class */
public class q extends Task {
    private final /* synthetic */ TempleTrekkingPlugin R;
    private static /* synthetic */ int[] lIIllIlIIlIlI;
    private static final /* synthetic */ int Q;
    private final /* synthetic */ Client S;
    private final /* synthetic */ Random T = new Random();
    private /* synthetic */ int U = this.T.nextInt(lIIllIlIIlIlI[0]) + lIIllIlIIlIlI[1];

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    public boolean run() {
        if (lIllIIIIIllllII(this.R.d() ? 1 : 0)) {
            Widget widget = this.S.getWidget(lIIllIlIIlIlI[2]);
            if (lIllIIIIIllllIl(widget)) {
                widget.interact(lIIllIlIIlIlI[3], lIIllIlIIlIlI[4], lIIllIlIIlIlI[5], widget.getId());
                return lIIllIlIIlIlI[3];
            }
        }
        Player local = Players.getLocal();
        if (lIllIIIIIlllllI(local)) {
            return lIIllIlIIlIlI[6];
        }
        if (!lIllIIIIIllllll(this.R.f().contains(local) ? 1 : 0) || lIllIIIIIllllII(this.R.g().contains(local) ? 1 : 0)) {
            return lIIllIlIIlIlI[6];
        }
        if (!lIllIIIIIllllll(local.isMoving() ? 1 : 0) || lIllIIIIIllllII(local.isAnimating() ? 1 : 0)) {
            if (lIllIIIIIllllll(Movement.isRunEnabled() ? 1 : 0) && lIllIIIIlIIIIII(Movement.getRunEnergy(), this.U)) {
                Movement.toggleRun();
                this.U = this.T.nextInt(lIIllIlIIlIlI[0]) + lIIllIlIIlIlI[1];
                return lIIllIlIIlIlI[3];
            }
            return lIIllIlIIlIlI[6];
        }
        return lIIllIlIIlIlI[6];
    }

    private static boolean lIllIIIIIlllllI(Object obj) {
        return obj == null;
    }

    private static boolean lIllIIIIIllllll(int i) {
        return i == 0;
    }

    private static boolean lIllIIIIlIIIIII(int i, int i2) {
        return i > i2;
    }

    private static void lIllIIIIIlllIll() {
        lIIllIlIIlIlI = new int[7];
        lIIllIlIIlIlI[0] = 111 ^ 101;
        lIIllIlIIlIlI[1] = 184 ^ 172;
        lIIllIlIIlIlI[2] = (-((-6231) & 24311)) & (-12297) & 21591741;
        lIIllIlIIlIlI[3] = " ".length();
        lIIllIlIIlIlI[4] = 29 ^ 36;
        lIIllIlIIlIlI[5] = -" ".length();
        lIIllIlIIlIlI[6] = (58 ^ 122) & ((23 ^ 87) ^ (-1));
    }

    @Inject
    public q(TempleTrekkingPlugin templeTrekkingPlugin, Client client) {
        this.R = templeTrekkingPlugin;
        this.S = client;
    }

    private static boolean lIllIIIIIllllII(int i) {
        return i != 0;
    }

    static {
        lIllIIIIIlllIll();
        Q = lIIllIlIIlIlI[2];
    }

    private static boolean lIllIIIIIllllIl(Object obj) {
        return obj != null;
    }
}
