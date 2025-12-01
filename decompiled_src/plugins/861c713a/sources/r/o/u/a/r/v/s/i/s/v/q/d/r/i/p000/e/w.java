package r.o.u.a.r.v.s.i.s.v.q.d.r.i.p000.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vardorvis.SquireVardorvis;
import gg.squire.vardorvis.SquireVardorvisConfig;
import net.runelite.api.Client;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;
@TaskDesc(name = "Dodging Axe", priority = 5000, blocking = true)
/* renamed from: r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.w  reason: invalid package */
/* loaded from: 861c713a-2076-4f84-9c7c-f1dff7263a11.jar:r/o/u/a/r/v/s/i/s/v/q/d/r/i/-/e/w.class */
public class w extends AbstractC0000a {
    private /* synthetic */ boolean Y;
    private static /* synthetic */ int[] lIlIlIIIlllll;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean] */
    @Inject
    protected w(SquireVardorvis squireVardorvis, SquireVardorvisConfig squireVardorvisConfig, C0004e c0004e, C0001b c0001b, Client client) {
        super(squireVardorvis, squireVardorvisConfig, c0004e, c0001b, client);
        this.Y = lIlIlIIIlllll[0];
    }

    private static boolean lIllllIllIllIIl(int i) {
        return i == 0;
    }

    private static boolean lIllllIllIllIII(int i, int i2) {
        return i == i2;
    }

    private static boolean lIllllIllIllIll(int i, int i2) {
        return i < i2;
    }

    private static boolean lIllllIllIlIlll(int i) {
        return i > 0;
    }

    static {
        lIllllIllIlIllI();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v10, types: [boolean] */
    @Override // r.o.u.a.r.v.s.i.s.v.q.d.r.i.p000.e.AbstractC0000a
    public boolean l() {
        int tickCount = Static.getClient().getTickCount();
        this.u.C().removeIf(c0007h -> {
            if (lIllllIllIllIll(c0007h.G(), tickCount)) {
                ?? r0 = lIlIlIIIlllll[1];
                "".length();
                return 0 != 0 ? ((12 ^ 109) ^ ((250 ^ 163) & ((75 ^ 18) ^ (-1)))) & (((127 ^ 57) ^ (7 ^ 32)) ^ (-" ".length())) : r0;
            }
            return lIlIlIIIlllll[0];
        });
        "".length();
        if (!lIllllIllIlIlll(this.u.C().size()) || !lIllllIllIllIII(this.u.C().get(lIlIlIIIlllll[0]).W, tickCount)) {
            if (lIllllIllIllIlI(this.x.getWorldLocation().equals(p) ? 1 : 0)) {
                this.Y = lIlIlIIIlllll[0];
                return lIlIlIIIlllll[0];
            } else if (lIllllIllIllIIl(this.Y ? 1 : 0) && lIllllIllIllIll(this.v.v(), lIlIlIIIlllll[2])) {
                return lIlIlIIIlllll[0];
            } else {
                Movement.setDestination(p);
                return lIlIlIIIlllll[1];
            }
        }
        C0007h c0007h2 = this.u.C().get(lIlIlIIIlllll[0]);
        this.Y = c0007h2.Y;
        if (lIllllIllIllIIl(c0007h2.X)) {
            Movement.setDestination(q);
        }
        if (lIllllIllIllIII(c0007h2.X, lIlIlIIIlllll[1])) {
            Movement.setDestination(f0r);
        }
        this.u.C().remove(lIlIlIIIlllll[0]);
        "".length();
        return lIlIlIIIlllll[1];
    }

    private static boolean lIllllIllIllIlI(int i) {
        return i != 0;
    }

    private static void lIllllIllIlIllI() {
        lIlIlIIIlllll = new int[3];
        lIlIlIIIlllll[0] = (131 ^ 166) & ((49 ^ 20) ^ (-1));
        lIlIlIIIlllll[1] = " ".length();
        lIlIlIIIlllll[2] = "  ".length();
    }
}
