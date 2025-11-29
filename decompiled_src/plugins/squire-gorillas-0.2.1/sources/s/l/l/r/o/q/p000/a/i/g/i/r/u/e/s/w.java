package s.l.l.r.o.q.p000.a.i.g.i.r.u.e.s;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
@TaskDesc(name = "Drinking potion", priority = 100)
/* renamed from: s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.w  reason: invalid package */
/* loaded from: squire-gorillas-0.2.1.jar:s/l/l/r/o/q/-/a/i/g/i/r/u/e/s/w.class */
public class w extends Task {
    private static /* synthetic */ int[] llIIlIlllllI;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public boolean run() {
        return lllllIllllIIII(Players.getLocal().getInteracting()) ? llIIlIlllllI[0] : Combat.drinkBoostingPotion(llIIlIlllllI[1]);
    }

    private static boolean lllllIllllIIII(Object obj) {
        return obj == null;
    }

    private static void lllllIlllIllll() {
        llIIlIlllllI = new int[2];
        llIIlIlllllI[0] = ("  ".length() ^ (46 ^ 104)) & (((225 ^ 135) ^ (67 ^ 97)) ^ (-" ".length()));
        llIIlIlllllI[1] = (81 ^ 119) ^ (87 ^ 67);
    }

    static {
        lllllIlllIllll();
    }
}
