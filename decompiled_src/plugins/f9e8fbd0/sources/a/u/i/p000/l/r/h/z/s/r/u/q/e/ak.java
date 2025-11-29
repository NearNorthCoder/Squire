package a.u.i.p000.l.r.h.z.s.r.u.q.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrahConfig;
import net.runelite.api.Client;
import net.unethicalite.api.game.Combat;
@TaskDesc(name = "Drinking potions", priority = 5)
/* renamed from: a.u.i.-.l.r.h.z.s.r.u.q.e.ak  reason: invalid package */
/* loaded from: f9e8fbd0-4571-4716-b37b-883b4ae7fc62.jar:a/u/i/-/l/r/h/z/s/r/u/q/e/ak.class */
public class ak extends am {
    private static /* synthetic */ int[] lIllIlIllllll;

    private static void llIIlIIIlIIIlll() {
        lIllIlIllllll = new int[1];
        lIllIlIllllll[0] = (((48 + 71) - 105) + 161) ^ (((11 + 92) - 24) + 78);
    }

    @Inject
    protected ak(Client client, SquireZulrahConfig squireZulrahConfig) {
        super(client, squireZulrahConfig);
    }

    static {
        llIIlIIIlIIIlll();
    }

    @Override // a.u.i.p000.l.r.h.z.s.r.u.q.e.am
    public boolean ac() {
        return Combat.drinkBoostingPotion(lIllIlIllllll[0]);
    }
}
