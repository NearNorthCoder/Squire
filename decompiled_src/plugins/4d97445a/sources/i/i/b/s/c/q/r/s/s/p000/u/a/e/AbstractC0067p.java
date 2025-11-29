package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import gg.squire.basics.cerberus.SquireCerberus;
import gg.squire.basics.cerberus.SquireCerberusConfig;
import gg.squire.client.plugins.fw.Task;
import net.unethicalite.api.items.Bank;
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.p  reason: invalid package and case insensitive filesystem */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/p.class */
public abstract class AbstractC0067p extends Task {
    protected final /* synthetic */ SquireCerberusConfig av;
    private static /* synthetic */ int[] lIlIlllII;
    protected final /* synthetic */ C0000a au;
    protected final /* synthetic */ SquireCerberus at;

    private static boolean lIIllIIllIl(int i2) {
        return i2 != 0;
    }

    static {
        lIIllIIlIll();
    }

    private static void lIIllIIlIll() {
        lIlIlllII = new int[1];
        lIlIlllII[0] = (2 ^ 30) & ((142 ^ 146) ^ (-1));
    }

    private static boolean lIIllIIllII(int i2) {
        return i2 == 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0067p(SquireCerberus squireCerberus, SquireCerberusConfig squireCerberusConfig, C0000a c0000a) {
        this.at = squireCerberus;
        this.av = squireCerberusConfig;
        this.au = c0000a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    public boolean run() {
        if (!lIIllIIllII(this.av.bankLoadout().isSelected() ? 1 : 0) && !lIIllIIllII(this.at.r() ? 1 : 0) && !lIIllIIllII(Bank.isOpen() ? 1 : 0)) {
            if (lIIllIIllIl(this.au.l() ? 1 : 0)) {
                this.au.a((boolean) lIlIlllII[0]);
            }
            return V();
        }
        return lIlIlllII[0];
    }

    public abstract boolean V();
}
