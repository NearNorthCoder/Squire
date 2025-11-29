package a.u.i.p000.l.r.h.z.s.r.u.q.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrah;
import gg.squire.zulrah.SquireZulrahConfig;
import net.runelite.api.Client;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
@TaskDesc(name = "Banking", priority = 1000, blocking = true)
/* renamed from: a.u.i.-.l.r.h.z.s.r.u.q.e.E  reason: invalid package */
/* loaded from: f9e8fbd0-4571-4716-b37b-883b4ae7fc62.jar:a/u/i/-/l/r/h/z/s/r/u/q/e/E.class */
public abstract class E extends Task {
    protected final /* synthetic */ C0019t Y;
    protected final /* synthetic */ Client Z;
    protected final /* synthetic */ SquireZulrah aa;
    private static /* synthetic */ int[] lIllIlllllIII;
    protected final /* synthetic */ SquireZulrahConfig X;
    @Inject
    protected /* synthetic */ C0020u ab;

    private static boolean llIIlIIllllIllI(int i) {
        return i == 0;
    }

    public int af() {
        return lIllIlllllIII[1];
    }

    private static void llIIlIIllllIIll() {
        lIllIlllllIII = new int[2];
        lIllIlllllIII[0] = ((203 ^ 153) ^ (102 ^ 10)) & (((252 ^ 149) ^ (51 ^ 100)) ^ (-" ".length()));
        lIllIlllllIII[1] = -" ".length();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BankLoadout ae() {
        return (BankLoadout) this.X.bankLoadout().selected(BankLoadout.class);
    }

    public abstract boolean ac();

    private static boolean llIIlIIllllIlIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean ad() {
        return this.X.bankLocation().g().stream().anyMatch(num -> {
            return this.ab.h(num.intValue());
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public E(SquireZulrah squireZulrah, SquireZulrahConfig squireZulrahConfig, Client client, C0019t c0019t) {
        this.aa = squireZulrah;
        this.X = squireZulrahConfig;
        this.Z = client;
        this.Y = c0019t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public boolean run() {
        if (!llIIlIIllllIlII(this.X.bank() ? 1 : 0) || llIIlIIllllIlIl(this.aa.a(), EnumC0002c.DONE)) {
            return lIllIlllllIII[0];
        }
        if (llIIlIIllllIlII(ad() ? 1 : 0)) {
            this.aa.a(ae().needsToBank());
        }
        return llIIlIIllllIllI(this.aa.d() ? 1 : 0) ? lIllIlllllIII[0] : ac();
    }

    static {
        llIIlIIllllIIll();
    }

    private static boolean llIIlIIllllIlII(int i) {
        return i != 0;
    }
}
