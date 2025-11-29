/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 */
package a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f;

import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.D;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.o;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.w;
import gg.squire.client.plugins.fw.Task;
import gg.squire.minigames.SquireBlastFurnace;
import java.util.function.Predicate;

public abstract class T<T extends w>
extends Task {
    protected final /* synthetic */ Predicate<String> ce;
    protected final /* synthetic */ Class<T> cc;
    protected final /* synthetic */ D cd;
    protected final /* synthetic */ SquireBlastFurnace cb;
    private static /* synthetic */ int[] lIIllIllIIII;

    public abstract boolean a(T var1, o var2);

    public T(SquireBlastFurnace squireBlastFurnace, Class<T> clazz, Predicate<String> predicate) {
        this.cb = squireBlastFurnace;
        this.cd = squireBlastFurnace.b();
        this.cc = clazz;
        this.ce = predicate;
        this.cd.W().add(predicate);
        0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1;
        T var2;
        w w2 = this.cd.S();
        if (T.llIIlllllIIllI(this.cc.isInstance(w2) ? 1 : 0)) {
            return lIIllIllIIII[0];
        }
        if (T.llIIlllllIIlll(var2.ce) && T.llIIlllllIIllI(var2.ce.test(var1.J()) ? 1 : 0)) {
            return lIIllIllIIII[0];
        }
        o o2 = this.cb.a();
        return this.a((w)this.cc.cast(w2), o2);
    }

    static {
        T.llIIlllllIIlII();
    }

    private static void llIIlllllIIlII() {
        lIIllIllIIII = new int[1];
        T.lIIllIllIIII[0] = (0x5E ^ 0x17) & ~(0x3E ^ 0x77);
    }

    private static boolean llIIlllllIIlll(Object object) {
        return object != null;
    }

    public T(SquireBlastFurnace squireBlastFurnace, Class<T> clazz) {
        this.cb = squireBlastFurnace;
        this.cd = squireBlastFurnace.b();
        this.cc = clazz;
        this.ce = null;
    }

    private static boolean llIIlllllIIllI(int n2) {
        return n2 == 0;
    }
}

