package r.r.s.u.p000.s.i.e.u.u.r.i.q.c.s;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.scurrius.SquireScurrius;
import gg.squire.scurrius.SquireScurriusConfig;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Dodging Rockfall", priority = 5000, blocking = true)
/* renamed from: r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.n  reason: invalid package */
/* loaded from: 5c667a01-93f1-4288-83c1-de3f0a449bc2.jar:r/r/s/u/-/s/i/e/u/u/r/i/q/c/s/n.class */
public class n extends a {
    private static /* synthetic */ int[] lIIlIllIlIlII;
    private /* synthetic */ boolean Y;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean] */
    @Inject
    protected n(SquireScurrius squireScurrius, SquireScurriusConfig squireScurriusConfig, b bVar, Client client) {
        super(squireScurrius, squireScurriusConfig, bVar, client);
        this.Y = lIIlIllIlIlII[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v8, types: [boolean] */
    @Override // r.r.s.u.p000.s.i.e.u.u.r.i.q.c.s.a
    public boolean a() {
        if (lIlIllIlIIlIlIl(a(this.e.getWorldLocation()) ? 1 : 0)) {
            return lIIlIllIlIlII[0];
        }
        WorldPoint a = a((boolean) lIIlIllIlIlII[1]);
        if (lIlIllIlIIlIllI(a)) {
            a((boolean) lIIlIllIlIlII[0]);
            "".length();
        }
        if (lIlIllIlIIlIllI(a)) {
            return lIIlIllIlIlII[0];
        }
        Movement.setDestination(a);
        return lIIlIllIlIlII[1];
    }

    private static boolean lIlIllIlIIlIllI(Object obj) {
        return obj == null;
    }

    static {
        lIlIllIlIIlIlII();
    }

    private static boolean lIlIllIlIIlIlIl(int i) {
        return i == 0;
    }

    private static void lIlIllIlIIlIlII() {
        lIIlIllIlIlII = new int[2];
        lIIlIllIlIlII[0] = (236 ^ 170) & ((3 ^ 69) ^ (-1));
        lIIlIllIlIlII[1] = " ".length();
    }
}
