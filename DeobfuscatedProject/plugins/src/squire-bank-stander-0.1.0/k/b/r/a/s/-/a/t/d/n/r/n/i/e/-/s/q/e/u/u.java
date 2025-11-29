/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Player
 *  net.runelite.api.events.AnimationChanged
 *  net.runelite.api.events.GameTick
 *  net.runelite.api.events.StatChanged
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.Players
 */
package k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.skilling.SquireBankStander;
import javax.inject.Inject;
import net.runelite.api.Player;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.StatChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;

@TaskDesc(name="Inactivity Tracker", priority=0x7FFFFFFF, register=true)
public class u
extends Task {
    private final /* synthetic */ SquireBankStander r;
    private static /* synthetic */ int[] lllIIllIlll;

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(AnimationChanged animationChanged) {
        void llllllllllllllllIIlIIlllIlIIIIIl;
        if (u.lIlIlllIlIIlII(animationChanged.getActor(), Players.getLocal())) {
            return;
        }
        if (u.lIlIlllIlIIlIl(llllllllllllllllIIlIIlllIlIIIIIl.getActor().getAnimation(), lllIIllIlll[0])) {
            return;
        }
        this.r.c(lllIIllIlll[1]);
    }

    private static void lIlIlllIlIIIll() {
        lllIIllIlll = new int[3];
        u.lllIIllIlll[0] = -" ".length();
        u.lllIIllIlll[1] = (0x89 ^ 0xB8) & ~(0x77 ^ 0x46);
        u.lllIIllIlll[2] = " ".length();
    }

    private static boolean lIlIlllIlIIlll(int n2, int n3) {
        return n2 != n3;
    }

    @Subscribe
    public void a(StatChanged statChanged) {
        this.r.c(lllIIllIlll[1]);
    }

    static {
        u.lIlIlllIlIIIll();
    }

    private static boolean lIlIlllIlIIlII(Object object, Object object2) {
        return object != object2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void llllllllllllllllIIlIIlllIIllllIl;
        Player player = Players.getLocal();
        if (u.lIlIlllIlIIllI(player)) {
            return lllIIllIlll[1];
        }
        if (u.lIlIlllIlIIlll(llllllllllllllllIIlIIlllIIllllIl.getAnimation(), lllIIllIlll[0])) {
            u llllllllllllllllIIlIIlllIIlllllI;
            llllllllllllllllIIlIIlllIIlllllI.r.c(lllIIllIlll[1]);
        }
        return lllIIllIlll[1];
    }

    @Inject
    public u(SquireBankStander squireBankStander) {
        this.r = squireBankStander;
    }

    private static boolean lIlIlllIlIIllI(Object object) {
        return object == null;
    }

    @Subscribe
    public void a(GameTick gameTick) {
        this.r.c(this.r.e() + lllIIllIlll[2]);
    }

    private static boolean lIlIlllIlIIlIl(int n2, int n3) {
        return n2 == n3;
    }
}

