package p000.m.e.a.u.s.r.r.q.i.r.e.f;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/* renamed from: -.m.e.a.u.s.r.r.q.i.r.e.f.L  reason: invalid package */
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:-/m/e/a/u/s/r/r/q/i/r/e/f/L.class */
public class L {
    public static final /* synthetic */ Set<Integer> bq;
    private static /* synthetic */ int[] lIlllIlIlIII;
    public static final /* synthetic */ Set<P> bp;
    public static final /* synthetic */ int bo;
    public static final /* synthetic */ int bn;

    private static boolean lllIllIIIllIIl(int i) {
        return i == 0;
    }

    private static void lllIllIIIllIII() {
        lIlllIlIlIII = new int[4];
        lIlllIlIlIII[0] = " ".length();
        lIlllIlIlIII[1] = (93 ^ 31) & ((68 ^ 6) ^ (-1));
        lIlllIlIlIII[2] = 68 ^ 58;
        lIlllIlIlIII[3] = 5 ^ 120;
    }

    private static boolean lllIllIIIllIlI(Object obj, Object obj2) {
        return obj == obj2;
    }

    static {
        lllIllIIIllIII();
        bo = lIlllIlIlIII[2];
        bn = lIlllIlIlIII[3];
        bp = new M();
        bq = (Set) Stream.of((Object[]) EnumC0021au.values()).filter(enumC0021au -> {
            if (!lllIllIIIllIIl(bp.contains(enumC0021au.bh()) ? 1 : 0) || lllIllIIIllIlI(enumC0021au, EnumC0021au.WEEDS)) {
                ?? r0 = lIlllIlIlIII[0];
                "".length();
                return (-"  ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIlllIlIlIII[1];
        }).map((v0) -> {
            return v0.au();
        }).collect(Collectors.toUnmodifiableSet());
    }
}
