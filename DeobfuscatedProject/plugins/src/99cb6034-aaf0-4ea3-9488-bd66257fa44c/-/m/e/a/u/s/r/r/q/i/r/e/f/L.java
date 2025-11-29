/*
 * Decompiled with CFR 0.152.
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.M;
import -.m.e.a.u.s.r.r.q.i.r.e.f.P;
import -.m.e.a.u.s.r.r.q.i.r.e.f.au;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class L {
    public static final /* synthetic */ Set<Integer> bq;
    private static /* synthetic */ int[] lIlllIlIlIII;
    public static final /* synthetic */ Set<P> bp;
    public static final /* synthetic */ int bo;
    public static final /* synthetic */ int bn;

    private static boolean lllIllIIIllIIl(int n2) {
        return n2 == 0;
    }

    private static void lllIllIIIllIII() {
        lIlllIlIlIII = new int[4];
        L.lIlllIlIlIII[0] = " ".length();
        L.lIlllIlIlIII[1] = (0x5D ^ 0x1F) & ~(0x44 ^ 6);
        L.lIlllIlIlIII[2] = 0x44 ^ 0x3A;
        L.lIlllIlIlIII[3] = 5 ^ 0x78;
    }

    private static boolean lllIllIIIllIlI(Object object, Object object2) {
        return object == object2;
    }

    static {
        L.lllIllIIIllIII();
        bo = lIlllIlIlIII[2];
        bn = lIlllIlIlIII[3];
        bp = new M();
        bq = Stream.of(au.values()).filter(au2 -> {
            boolean bl;
            if (!L.lllIllIIIllIIl(bp.contains((Object)au2.bh()) ? 1 : 0) || L.lllIllIIIllIlI(au2, (Object)au.WEEDS)) {
                bl = lIlllIlIlIII[0];
                "".length();
                if (-"  ".length() > 0) {
                    return ((3 ^ 0x34) & ~(6 ^ 0x31)) != 0;
                }
            } else {
                bl = lIlllIlIlIII[1];
            }
            return bl;
        }).map(au::au).collect(Collectors.toUnmodifiableSet());
    }
}

