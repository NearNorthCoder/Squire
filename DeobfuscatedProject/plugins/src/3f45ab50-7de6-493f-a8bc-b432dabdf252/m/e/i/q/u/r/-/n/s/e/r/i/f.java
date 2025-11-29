/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 */
package m.e.i.q.u.r.-.n.s.e.r.i;

import com.google.inject.Inject;
import gg.squire.mining.SquireMinerConfig;

public class f {
    private final /* synthetic */ SquireMinerConfig k;
    private static /* synthetic */ int[] llllllIIllll;

    static {
        f.lIIlIlIIIlllIll();
    }

    private static void lIIlIlIIIlllIll() {
        llllllIIllll = new int[1];
        f.llllllIIllll[0] = (0x79 ^ 0x67) & ~(0xA4 ^ 0xBA);
    }

    public boolean a(Object object, int n2) {
        return llllllIIllll[0];
    }

    @Inject
    public f(SquireMinerConfig squireMinerConfig) {
        this.k = squireMinerConfig;
    }
}

