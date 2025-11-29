/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 */
package e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.templeTrekking.TempleTrekkingPlugin;
import java.util.Random;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;

/* TASK: Starting route -> StartingrouteTask */
@TaskDesc(name="Starting route")
public class q
extends Task {
    private final /* synthetic */ TempleTrekkingPlugin R;
    private final /* synthetic */ Random T;
    private static /* synthetic */ int[] lIIllIlIIlIlI;
    private static final /* synthetic */ int Q;
    private /* synthetic */ int U;
    private final /* synthetic */ Client S;

    public boolean run() {
        q var2;
        Widget widget;
        if (q.lIllIIIIIllllII(this.R.d() ? 1 : 0) && q.lIllIIIIIllllIl(widget = this.S.getWidget(lIIllIlIIlIlI[2]))) {
            widget.interact(lIIllIlIIlIlI[3], lIIllIlIIlIlI[4], lIIllIlIIlIlI[5], widget.getId());
            return lIIllIlIIlIlI[3];
        }
        Player var1 = Players.getLocal();
        if (q.lIllIIIIIlllllI(var1)) {
            return lIIllIlIIlIlI[6];
        }
        if (!q.lIllIIIIIllllll(var2.R.f().contains((Locatable)var1) ? 1 : 0) || q.lIllIIIIIllllII(var2.R.g().contains((Locatable)var1) ? 1 : 0)) {
            return lIIllIlIIlIlI[6];
        }
        if (!q.lIllIIIIIllllll(var1.isMoving() ? 1 : 0) || q.lIllIIIIIllllII(var1.isAnimating() ? 1 : 0)) {
            if (q.lIllIIIIIllllll(Movement.isRunEnabled() ? 1 : 0) && q.lIllIIIIlIIIIII(Movement.getRunEnergy(), var2.U)) {
                Movement.toggleRun();
                var2.U = var2.T.nextInt(lIIllIlIIlIlI[0]) + lIIllIlIIlIlI[1];
                return lIIllIlIIlIlI[3];
            }
            return lIIllIlIIlIlI[6];
        }
        return lIIllIlIIlIlI[6];
    }

    private static boolean lIllIIIIIlllllI(Object object) {
        return object == null;
    }

    private static boolean lIllIIIIIllllll(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIIIIlIIIIII(int n2, int n3) {
        return n2 > n3;
    }

    private static void lIllIIIIIlllIll() {
        lIIllIlIIlIlI = new int[7];
        q.lIIllIlIIlIlI[0] = 0x6F ^ 0x65;
        q.lIIllIlIIlIlI[1] = 0xB8 ^ 0xAC;
        q.lIIllIlIIlIlI[2] = -(0xFFFFE7A9 & 0x5EF7) & (0xFFFFCFF7 & 0x14976BD);
        q.lIIllIlIIlIlI[3] = 1;
        q.lIIllIlIIlIlI[4] = 0x1D ^ 0x24;
        q.lIIllIlIIlIlI[5] = -1;
        q.lIIllIlIIlIlI[6] = (0x3A ^ 0x7A) & ~(0x17 ^ 0x57);
    }

    @Inject
    public q(TempleTrekkingPlugin templeTrekkingPlugin, Client client) {
        this.T = new Random();
        this.U = this.T.nextInt(lIIllIlIIlIlI[0]) + lIIllIlIIlIlI[1];
        this.R = templeTrekkingPlugin;
        this.S = client;
    }

    private static boolean lIllIIIIIllllII(int n2) {
        return n2 != 0;
    }

    static {
        q.lIllIIIIIlllIll();
        Q = lIIllIlIIlIlI[2];
    }

    private static boolean lIllIIIIIllllIl(Object object) {
        return object != null;
    }
}

