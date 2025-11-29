/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.FarmerManager;
import gg.squire.farmer.tasks.GameEnum19;
import gg.squire.farmer.tasks.GameEnum4;
import gg.squire.farmer.tasks.FarmerManager;
import gg.squire.farmer.tasks.FarmerManager;
import -.m.e.a.u.s.r.r.q.i.r.e.f.l;
import -.m.e.a.u.s.r.r.q.i.r.e.f.q;
import gg.squire.farmer.tasks.FarmerManager;
import java.util.Comparator;
import java.util.stream.Stream;
import javax.inject.Inject;

public class k
implements l {
    
    private final  f aH;
    private final  r aI;
    private final  e aG;

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

    /*
     * WARNING - void declaration
     */
    private N a(N[] nArray, au au2) {
        N var1;
        N n3 = null;
        if (k.lllIllIIIlIlIl((Object)au2.bh(), (Object)P.ALLOTMENT)) {
            var1 = Stream.of(nArray).filter(n2 -> {
                boolean bl;
                if (k.lllIllIIIlIlIl((Object)n2.aL(), (Object)P.ALLOTMENT)) {
                    bl = lIlllIlIIllI[0];

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

                } else {
                    bl = lIlllIlIIllI[1];
                }
                return bl;
            }).max(Comparator.comparingInt(n2 -> n2.aI().aY().ordinal())).orElse(null);
        }
        if (k.lllIllIIIlIllI(var1)) {
            void var2;
            void var3;
            return Stream.of(var3).filter(arg_0 -> k.a((GameEnum4) ar2, arg_0)).findFirst().orElse(null);
        }
        return n3;
    }

    private static  boolean a(au au2, N n2) {
        boolean bl;
        if (k.lllIllIIIlIlIl((Object)n2.aL(), (Object)au2.bh())) {
            bl = lIlllIlIIllI[0];

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

