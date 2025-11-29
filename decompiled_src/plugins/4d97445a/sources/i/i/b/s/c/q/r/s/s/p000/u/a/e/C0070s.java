package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
@TaskDesc(name = "Drinking boost", priority = 7777)
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.s  reason: invalid package and case insensitive filesystem */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/s.class */
public class C0070s extends Task {
    private final /* synthetic */ C0000a aC;
    private static /* synthetic */ int[] lIIIIlIIl;

    private static boolean lllIlIIlll(Object obj) {
        return obj == null;
    }

    static {
        lllIlIIlIl();
    }

    private static void lllIlIIlIl() {
        lIIIIlIIl = new int[2];
        lIIIIlIIl[0] = ((129 ^ 175) ^ (54 ^ 120)) & (((67 ^ 77) ^ (75 ^ 37)) ^ (-" ".length()));
        lIIIIlIIl[1] = 2 ^ 48;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public boolean run() {
        return (!lllIlIIllI(this.aC.k()) || lllIlIIlll(this.aC.k().y())) ? lIIIIlIIl[0] : lllIlIIlll(Players.getLocal().getInteracting()) ? lIIIIlIIl[0] : Combat.drinkBoostingPotion(lIIIIlIIl[1]);
    }

    @Inject
    public C0070s(C0000a c0000a) {
        this.aC = c0000a;
    }

    private static boolean lllIlIIllI(Object obj) {
        return obj != null;
    }
}
