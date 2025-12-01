package r.r.s.u.p000.s.i.e.u.u.r.i.q.c.s;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.scurrius.SquireScurrius;
import gg.squire.scurrius.SquireScurriusConfig;
import net.runelite.api.Client;
import net.unethicalite.api.game.Combat;
@TaskDesc(name = "Drinking boost", priority = 10000)
/* renamed from: r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.o  reason: invalid package */
/* loaded from: 5c667a01-93f1-4288-83c1-de3f0a449bc2.jar:r/r/s/u/-/s/i/e/u/u/r/i/q/c/s/o.class */
public class o extends a {
    private static /* synthetic */ int[] lIIlIlIllIIll;

    static {
        lIlIllIIIlIIllI();
    }

    private static void lIlIllIIIlIIllI() {
        lIIlIlIllIIll = new int[1];
        lIIlIlIllIIll[0] = 167 ^ 149;
    }

    @Override // r.r.s.u.p000.s.i.e.u.u.r.i.q.c.s.a
    public boolean a() {
        return Combat.drinkBoostingPotion(lIIlIlIllIIll[0]);
    }

    @Inject
    protected o(SquireScurrius squireScurrius, SquireScurriusConfig squireScurriusConfig, b bVar, Client client) {
        super(squireScurrius, squireScurriusConfig, bVar, client);
    }
}
