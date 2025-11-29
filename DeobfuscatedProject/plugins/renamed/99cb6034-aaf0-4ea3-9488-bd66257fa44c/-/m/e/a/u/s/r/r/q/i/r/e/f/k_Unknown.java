/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.N_Unknown;
import -.m.e.a.u.s.r.r.q.i.r.e.f.HerbType;
import -.m.e.a.u.s.r.r.q.i.r.e.f.HerbType;
import -.m.e.a.u.s.r.r.q.i.r.e.f.e_Unknown;
import -.m.e.a.u.s.r.r.q.i.r.e.f.f_Unknown;
import -.m.e.a.u.s.r.r.q.i.r.e.f.l;
import -.m.e.a.u.s.r.r.q.i.r.e.f.q_Unknown;
import -.m.e.a.u.s.r.r.q.i.r.e.f.r_Unknown;
import java.util.Comparator;
import java.util.stream.Stream;
import javax.inject.Inject;

public class k_Unknown
implements l {
    private static /* synthetic */ int[] lIlllIlIIllI;
    private final /* synthetic */ f aH;
    private final /* synthetic */ r aI;
    private final /* synthetic */ e aG;

    @Override
    public boolean U() {
        return this.aG.i();
    }

    @Override
    public q S() {
        return this.aI.ag();
    }

    private static boolean lllIllIIIlIlll(Object object, Object object2) {
        return object != object2;
    }

    private static void lllIllIIIlIlII() {
        lIlllIlIIllI = new int[2];
        k.lIlllIlIIllI[0] = 1;
        k.lIlllIlIIllI[1] = (0xB0 ^ 0x96) & ~(0x37 ^ 0x11);
    }

    /*
     * WARNING - void declaration
     */
    private N a(N[] nArray, au au2) {
        N var2;
        N n3 = null;
        if (k.lllIllIIIlIlIl((Object)au2.bh(), (Object)P.ALLOTMENT)) {
            var2 = Stream.of(nArray).filter(n2 -> {
                boolean bl;
                if (k.lllIllIIIlIlIl((Object)n2.aL(), (Object)P.ALLOTMENT)) {
                    bl = lIlllIlIIllI[0];
                    0;
                    if (1 < 0) {
                        return ((0x9C ^ 0xC6 ^ (0x16 ^ 0x79)) & (0x3A ^ 0x5B ^ (0x52 ^ 6) ^ -1)) != 0;
                    }
                } else {
                    bl = lIlllIlIIllI[1];
                }
                return bl;
            }).filter(n2 -> {
                boolean bl;
                if (!k.lllIllIIIlIlll((Object)n2.aI().aY(), (Object)au2) || k.lllIllIIIlIlIl((Object)n2.aI().aY(), (Object)au.WEEDS)) {
                    bl = lIlllIlIIllI[0];
                    0;
                    if (-2 >= 0) {
                        return (2 & (2 ^ -1)) != 0;
                    }
                } else {
                    bl = lIlllIlIIllI[1];
                }
                return bl;
            }).max(Comparator.comparingInt(n2 -> n2.aI().aY().ordinal())).orElse(null);
        }
        if (k.lllIllIIIlIllI(var2)) {
            void var3;
            void var1;
            return Stream.of(var1).filter(arg_0 -> k.a((au)var3, arg_0)).findFirst().orElse(null);
        }
        return n3;
    }

    private static /* synthetic */ boolean a(au au2, N n2) {
        boolean bl;
        if (k.lllIllIIIlIlIl((Object)n2.aL(), (Object)au2.bh())) {
            bl = lIlllIlIIllI[0];
            0;
            
            }
        } else {
            bl = lIlllIlIIllI[1];
        }
        return bl;
    }

    private static boolean lllIllIIIlIllI(Object object) {
        return object == null;
    }

    @Inject
    public k(e e2, f f2, r r2) {
        this.aG = e2;
        this.aH = f2;
        this.aI = r2;
    }

    private static boolean lllIllIIIlIlIl(Object object, Object object2) {
        return object == object2;
    }

    @Override
    public N T() {
        au au2 = this.aG.r();
        if (k.lllIllIIIlIllI((Object)au2)) {
            return null;
        }
        q q2 = this.S();
        N[] nArray = q2.ae();
        return this.a(nArray, au2);
    }

    static {
        k.lllIllIIIlIlII();
    }
}

