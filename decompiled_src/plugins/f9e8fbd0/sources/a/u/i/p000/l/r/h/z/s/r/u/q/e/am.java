package a.u.i.p000.l.r.h.z.s.r.u.q.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.zulrah.SquireZulrah;
import gg.squire.zulrah.SquireZulrahConfig;
import net.runelite.api.Client;
/* renamed from: a.u.i.-.l.r.h.z.s.r.u.q.e.am  reason: invalid package */
/* loaded from: f9e8fbd0-4571-4716-b37b-883b4ae7fc62.jar:a/u/i/-/l/r/h/z/s/r/u/q/e/am.class */
public abstract class am extends Task {
    private static /* synthetic */ int[] lIlllIIIIIIII;
    @Inject
    private /* synthetic */ C0020u ab;
    private static final /* synthetic */ int aI;
    protected final /* synthetic */ SquireZulrahConfig aJ;
    private final /* synthetic */ Client aK;
    @Inject
    protected /* synthetic */ SquireZulrah E;

    public abstract boolean ac();

    /* JADX INFO: Access modifiers changed from: protected */
    public am(Client client, SquireZulrahConfig squireZulrahConfig) {
        this.aK = client;
        this.aJ = squireZulrahConfig;
    }

    static {
        llIIlIlIIIlIIlI();
        aI = lIlllIIIIIIII[1];
    }

    private static boolean llIIlIlIIIlIlII(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    public boolean run() {
        if (!llIIlIlIIIlIIll(this.aK.isInInstancedRegion() ? 1 : 0) && !llIIlIlIIIlIIll(this.E.d() ? 1 : 0) && !llIIlIlIIIlIlII(this.ab.h(lIlllIIIIIIII[1]) ? 1 : 0)) {
            return ac();
        }
        return lIlllIIIIIIII[0];
    }

    private static void llIIlIlIIIlIIlI() {
        lIlllIIIIIIII = new int[2];
        lIlllIIIIIIII[0] = ((23 ^ 52) ^ (41 ^ 7)) & (((237 ^ 184) ^ (98 ^ 58)) ^ (-" ".length()));
        lIlllIIIIIIII[1] = (-((-12389) & 30069)) & (-4289) & 30719;
    }

    private static boolean llIIlIlIIIlIIll(int i) {
        return i != 0;
    }
}
