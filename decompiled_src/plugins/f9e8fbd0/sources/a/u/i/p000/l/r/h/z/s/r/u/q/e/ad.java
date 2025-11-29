package a.u.i.p000.l.r.h.z.s.r.u.q.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.zulrah.SquireZulrah;
import gg.squire.zulrah.SquireZulrahConfig;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;
/* renamed from: a.u.i.-.l.r.h.z.s.r.u.q.e.ad  reason: invalid package */
/* loaded from: f9e8fbd0-4571-4716-b37b-883b4ae7fc62.jar:a/u/i/-/l/r/h/z/s/r/u/q/e/ad.class */
public abstract class ad extends Task {
    protected final /* synthetic */ SquireZulrahConfig aA;
    private static /* synthetic */ int[] lIllIllIllIlI;
    protected final /* synthetic */ C0021v az;
    @Inject
    protected /* synthetic */ SquireZulrah E;
    protected final /* synthetic */ Client aB;

    /* JADX INFO: Access modifiers changed from: protected */
    public EnumC0010k C() {
        return this.az.V().C();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ad(C0021v c0021v, Client client, SquireZulrahConfig squireZulrahConfig) {
        this.az = c0021v;
        this.aB = client;
        this.aA = squireZulrahConfig;
    }

    static {
        llIIlIIlIlIIIIl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    public boolean run() {
        if (!llIIlIIlIlIIIlI(this.aB.isInInstancedRegion() ? 1 : 0) && !llIIlIIlIlIIIll(this.az.V())) {
            return ac();
        }
        return lIllIllIllIlI[0];
    }

    private static boolean llIIlIIlIlIIIll(Object obj) {
        return obj == null;
    }

    private static boolean llIIlIIlIlIIIlI(int i) {
        return i == 0;
    }

    private static void llIIlIIlIlIIIIl() {
        lIllIllIllIlI = new int[1];
        lIllIllIllIlI[0] = ((((107 + 163) - 237) + 139) ^ (((56 + 50) - 37) + 117)) & (((7 ^ 109) ^ (254 ^ 130)) ^ (-" ".length()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public WorldPoint ai() {
        return C().a(this.az.X());
    }

    public abstract boolean ac();
}
