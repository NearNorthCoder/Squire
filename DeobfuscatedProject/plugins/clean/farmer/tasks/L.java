/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.farmer.tasks;

import -.m.e.a.u.s.r.r.q.i.r.e.f.M;
import gg.squire.farmer.tasks.GameEnum19;
import gg.squire.farmer.tasks.GameEnum4;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class L {
    public static final  Set<Integer> bq;
    
    public static final  Set<P> bp;
    public static final  int bo;
    public static final  int bn;

    private static boolean lllIllIIIllIIl(int n2) {
        return n2 == 0;
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

            } else {
                bl = lIlllIlIlIII[1];
            }
            return bl;
        }).map(au::au).collect(Collectors.toUnmodifiableSet());
    }
}

