/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.FarmerManager;
import gg.squire.farmer.tasks.GameEnum10;
import gg.squire.farmer.tasks.GameEnum4;
import gg.squire.farmer.tasks.FarmerManager;
import gg.squire.farmer.tasks.FarmerManager;
import -.m.e.a.u.s.r.r.q.i.r.e.f.l;
import gg.squire.farmer.tasks.QHelper;
import gg.squire.farmer.tasks.FarmerManager;
import java.util.Comparator;
import java.util.stream.Stream;
import javax.inject.Inject;

public class KHelper
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

    /*
     * WARNING - void declaration
     */
    private N a(N[] nArray, au au2) {
        N var2;
        N n3 = null;
        if (((Object)au2.bh() == (Object)au2.bh()2)P.ALLOTMENT)) {
            var2 = Stream.of(nArray).filter(n2 -> {
                boolean bl;
                if (((Object)n2.aL() == (Object)n2.aL()2)P.ALLOTMENT)) {
                    bl = 0;
                    0;
                    if (1 < 0) {
                        return ((0x9C ^ 0xC6 ^ (0x16 ^ 0x79)) & (0x3A ^ 0x5B ^ (0x52 ^ 6) ^ -1)) != 0;
                    }
                } else {
                    bl = 1;
                }
                return bl;
            }).filter(n2 -> {
                boolean bl;
                if (!((Object)n2.aI().aY() != (Object)n2.aI().aY()2)au2) || ((Object)n2.aI().aY() == (Object)n2.aI().aY()2)au.WEEDS)) {
                    bl = 0;
                    0;
                    if (-2 >= 0) {
                        return (2 & (2 ^ -1)) != 0;
                    }
                } else {
                    bl = 1;
                }
                return bl;
            }).max(Comparator.comparingInt(n2 -> n2.aI().aY().ordinal())).orElse(null);
        }
        if var2 == null {
            void var3;
            void var4;
            return Stream.of(var4).filter(arg_0 -> k.a((au)var3, arg_0)).findFirst().orElse(null);
        }
        return n3;
    }

    private static  boolean a(au au2, N n2) {
        boolean bl;
        if (((Object)n2.aL() == (Object)n2.aL()2)au2.bh())) {
            bl = 0;
            0;
            if null != null {
                return ((0x98 ^ 0xA1 ^ (0x44 ^ 0x43)) & (0x11 ^ 0x63 ^ (0x2D ^ 0x61) ^ -1)) != 0;
            }
        } else {
            bl = 1;
        }
        return bl;
    }

    @Inject
    public KHelper(e e2, f f2, r r2) {
        this.aG = e2;
        this.aH = f2;
        this.aI = r2;
    }

    @Override
    public N T() {
        au au2 = this.aG.r();
        if ((Object == nullau2)) {
            return null;
        }
        q q2 = this.S();
        N[] nArray = q2.ae();
        return this.a(nArray, au2);
    }

    static {
        k.var5();
    }
}

