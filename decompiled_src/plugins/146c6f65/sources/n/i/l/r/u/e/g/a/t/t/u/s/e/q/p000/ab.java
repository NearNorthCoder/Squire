package n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000;

import gg.squire.client.plugins.fw.TaskDesc;
import javax.inject.Inject;
import net.unethicalite.api.widgets.Prayers;
@TaskDesc(name = "Turning off prayers", priority = Integer.MAX_VALUE, blocking = true)
/* renamed from: n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.ab  reason: invalid package */
/* loaded from: 146c6f65-5ac8-4fe6-9d9c-0b402720538d.jar:n/i/l/r/u/e/g/a/t/t/u/s/e/q/-/ab.class */
public class ab extends AbstractC0013n {
    private static /* synthetic */ int[] llIlIIIllIII;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    @Override // n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.AbstractC0013n
    public boolean be() {
        if (lIIIIIIlIIlllll(Prayers.anyActive() ? 1 : 0)) {
            return llIlIIIllIII[1];
        }
        Prayers.disableAll();
        return llIlIIIllIII[0];
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ab(C0002c c0002c) {
        super(c0002c, r2);
        EnumC0003d[] enumC0003dArr = new EnumC0003d[llIlIIIllIII[0]];
        enumC0003dArr[llIlIIIllIII[1]] = EnumC0003d.OUTSIDE;
    }

    static {
        lIIIIIIlIIllllI();
    }

    private static boolean lIIIIIIlIIlllll(int i) {
        return i == 0;
    }

    private static void lIIIIIIlIIllllI() {
        llIlIIIllIII = new int[2];
        llIlIIIllIII[0] = " ".length();
        llIlIIIllIII[1] = ((205 ^ 167) ^ (66 ^ 104)) & (((81 ^ 96) ^ (79 ^ 62)) ^ (-" ".length()));
    }
}
