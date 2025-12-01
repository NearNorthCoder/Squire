package r.e.o.r.h.s.b.e.q.l.e.u.p000.i.r;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.plugins.herblore.HerbloreConfig;
import gg.squire.plugins.herblore.SquireHerblore;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* renamed from: r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.d  reason: invalid package */
/* loaded from: 5d6a9183-7b7a-42a1-8cad-f88f0a9fad3c.jar:r/e/o/r/h/s/b/e/q/l/e/u/-/i/r/d.class */
public abstract class d extends Task {
    private static /* synthetic */ int[] lllIlIIIIllI;
    private final /* synthetic */ SquireHerblore j;
    private final /* synthetic */ HerbloreConfig i;
    private final /* synthetic */ List<c> h;

    public abstract boolean h();

    private static boolean lIIIlIlllIIIIIl(int i) {
        return i != 0;
    }

    public List<c> i() {
        return this.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public boolean run() {
        return lIIIlIlllIIIIIl(this.h.contains(this.i.method()) ? 1 : 0) ? h() : lllIlIIIIllI[0];
    }

    private static void lIIIlIllIllllll() {
        lllIlIIIIllI = new int[1];
        lllIlIIIIllI[0] = (97 ^ 69) & ((33 ^ 5) ^ (-1));
    }

    public SquireHerblore k() {
        return this.j;
    }

    static {
        lIIIlIllIllllll();
    }

    private static boolean lIIIlIlllIIIIII(Object obj) {
        return obj == null;
    }

    @Inject
    public d(SquireHerblore squireHerblore, HerbloreConfig herbloreConfig, c... cVarArr) {
        List<c> asList;
        this.j = squireHerblore;
        if (lIIIlIlllIIIIII(cVarArr)) {
            asList = Collections.emptyList();
            "".length();
            if ("   ".length() == 0) {
                throw null;
            }
        } else {
            asList = Arrays.asList(cVarArr);
        }
        this.h = asList;
        this.i = herbloreConfig;
    }

    public HerbloreConfig j() {
        return this.i;
    }
}
