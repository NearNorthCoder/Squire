package p000.m.e.a.u.s.r.r.q.i.r.e.f;

import java.util.Comparator;
import java.util.stream.Stream;
import javax.inject.Inject;
/* renamed from: -.m.e.a.u.s.r.r.q.i.r.e.f.k  reason: invalid package and case insensitive filesystem */
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:-/m/e/a/u/s/r/r/q/i/r/e/f/k.class */
public class C0036k implements InterfaceC0037l {
    private static /* synthetic */ int[] lIlllIlIIllI;
    private final /* synthetic */ C0031f aH;
    private final /* synthetic */ C0043r aI;
    private final /* synthetic */ C0030e aG;

    @Override // p000.m.e.a.u.s.r.r.q.i.r.e.f.InterfaceC0037l
    public boolean U() {
        return this.aG.i();
    }

    @Override // p000.m.e.a.u.s.r.r.q.i.r.e.f.InterfaceC0037l
    public C0042q S() {
        return this.aI.ag();
    }

    private static boolean lllIllIIIlIlll(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static void lllIllIIIlIlII() {
        lIlllIlIIllI = new int[2];
        lIlllIlIIllI[0] = " ".length();
        lIlllIlIIllI[1] = (176 ^ 150) & ((55 ^ 17) ^ (-1));
    }

    private N a(N[] nArr, EnumC0021au enumC0021au) {
        N n = null;
        if (lllIllIIIlIlIl(enumC0021au.bh(), P.ALLOTMENT)) {
            n = (N) Stream.of((Object[]) nArr).filter(n2 -> {
                if (lllIllIIIlIlIl(n2.aL(), P.ALLOTMENT)) {
                    ?? r0 = lIlllIlIIllI[0];
                    "".length();
                    return " ".length() < 0 ? ((156 ^ 198) ^ (22 ^ 121)) & (((58 ^ 91) ^ (82 ^ 6)) ^ (-" ".length())) : r0;
                }
                return lIlllIlIIllI[1];
            }).filter(n3 -> {
                if (!lllIllIIIlIlll(n3.aI().aY(), enumC0021au) || lllIllIIIlIlIl(n3.aI().aY(), EnumC0021au.WEEDS)) {
                    ?? r0 = lIlllIlIIllI[0];
                    "".length();
                    return (-"  ".length()) >= 0 ? "  ".length() & ("  ".length() ^ (-" ".length())) : r0;
                }
                return lIlllIlIIllI[1];
            }).max(Comparator.comparingInt(n4 -> {
                return n4.aI().aY().ordinal();
            })).orElse(null);
        }
        return lllIllIIIlIllI(n) ? (N) Stream.of((Object[]) nArr).filter(n5 -> {
            if (lllIllIIIlIlIl(n5.aL(), enumC0021au.bh())) {
                ?? r0 = lIlllIlIIllI[0];
                "".length();
                return 0 != 0 ? ((152 ^ 161) ^ (68 ^ 67)) & (((17 ^ 99) ^ (45 ^ 97)) ^ (-" ".length())) : r0;
            }
            return lIlllIlIIllI[1];
        }).findFirst().orElse(null) : n;
    }

    private static boolean lllIllIIIlIllI(Object obj) {
        return obj == null;
    }

    @Inject
    public C0036k(C0030e c0030e, C0031f c0031f, C0043r c0043r) {
        this.aG = c0030e;
        this.aH = c0031f;
        this.aI = c0043r;
    }

    private static boolean lllIllIIIlIlIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    @Override // p000.m.e.a.u.s.r.r.q.i.r.e.f.InterfaceC0037l
    public N T() {
        EnumC0021au r = this.aG.r();
        if (lllIllIIIlIllI(r)) {
            return null;
        }
        return a(S().ae(), r);
    }

    static {
        lllIllIIIlIlII();
    }
}
