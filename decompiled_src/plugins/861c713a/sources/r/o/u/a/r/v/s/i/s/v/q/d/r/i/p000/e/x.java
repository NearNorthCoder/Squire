package r.o.u.a.r.v.s.i.s.v.q.d.r.i.p000.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vardorvis.SquireVardorvis;
import gg.squire.vardorvis.SquireVardorvisConfig;
import net.runelite.api.Client;
import net.unethicalite.api.game.Combat;
@TaskDesc(name = "Drinking boost", priority = 10000)
/* renamed from: r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.x  reason: invalid package */
/* loaded from: 861c713a-2076-4f84-9c7c-f1dff7263a11.jar:r/o/u/a/r/v/s/i/s/v/q/d/r/i/-/e/x.class */
public class x extends AbstractC0000a {
    private static /* synthetic */ int[] lIlIIlllllllI;

    @Inject
    protected x(SquireVardorvis squireVardorvis, SquireVardorvisConfig squireVardorvisConfig, C0004e c0004e, C0001b c0001b, Client client) {
        super(squireVardorvis, squireVardorvisConfig, c0004e, c0001b, client);
    }

    private static void lIllllIIllIIIlI() {
        lIlIIlllllllI = new int[1];
        lIlIIlllllllI[0] = 37 ^ 23;
    }

    @Override // r.o.u.a.r.v.s.i.s.v.q.d.r.i.p000.e.AbstractC0000a
    public boolean l() {
        return Combat.drinkBoostingPotion(lIlIIlllllllI[0]);
    }

    static {
        lIllllIIllIIIlI();
    }
}
