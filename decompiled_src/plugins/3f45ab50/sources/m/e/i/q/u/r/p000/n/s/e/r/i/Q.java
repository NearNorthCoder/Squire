package m.e.i.q.u.r.p000.n.s.e.r.i;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.SpellBook;
@TaskDesc(name = "Casting humidify", priority = 105, blocking = true)
/* renamed from: m.e.i.q.u.r.-.n.s.e.r.i.Q  reason: invalid package */
/* loaded from: 3f45ab50-7de6-493f-a8bc-b432dabdf252.jar:m/e/i/q/u/r/-/n/s/e/r/i/Q.class */
public class Q extends S {
    private static /* synthetic */ int[] llllllIIlIIl;

    private static void lIIlIlIIIlIlIIl() {
        llllllIIlIIl = new int[2];
        llllllIIlIIl[0] = ((95 ^ 24) ^ (213 ^ 150)) & (((((33 + 129) - 32) + 2) ^ (((46 + 64) - 100) + 118)) ^ (-" ".length()));
        llllllIIlIIl[1] = " ".length();
    }

    private static boolean lIIlIlIIIlIlIlI(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    @Override // m.e.i.q.u.r.p000.n.s.e.r.i.S
    public boolean t() {
        if (lIIlIlIIIlIlIlI(this.au.humidify() ? 1 : 0)) {
            return llllllIIlIIl[0];
        }
        SpellBook.Lunar lunar = SpellBook.Lunar.HUMIDIFY;
        if (lIIlIlIIIlIlIlI(lunar.canCast() ? 1 : 0)) {
            return llllllIIlIIl[0];
        }
        if (lIIlIlIIIlIlIll(Players.getLocal().isAnimating() ? 1 : 0)) {
            return llllllIIlIIl[1];
        }
        Magic.cast(lunar, llllllIIlIIl[1], (boolean) llllllIIlIIl[1]);
        return llllllIIlIIl[1];
    }

    private static boolean lIIlIlIIIlIlIll(int i) {
        return i != 0;
    }

    static {
        lIIlIlIIIlIlIIl();
    }

    @Inject
    protected Q(SquireMinerConfig squireMinerConfig) {
        super(squireMinerConfig);
    }
}
