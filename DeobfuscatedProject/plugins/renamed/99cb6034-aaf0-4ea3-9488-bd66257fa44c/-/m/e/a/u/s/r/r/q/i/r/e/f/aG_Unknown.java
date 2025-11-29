/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.EEnum;
import -.m.e.a.u.s.r.r.q.i.r.e.f.FEnum;
import -.m.e.a.u.s.r.r.q.i.r.e.f.j_Unknown;
import -.m.e.a.u.s.r.r.q.i.r.e.f.HerbType;
import gg.squire.client.plugins.fw.Task;
import gg.squire.farmer.SquireFarmer;
import gg.squire.farmer.SquireFarmerConfig;

public abstract class aG_Unknown
extends Task {
    private final /* synthetic */ SquireFarmer cv;
    protected final /* synthetic */ SquireFarmerConfig ct;
    private static /* synthetic */ int[] llIIIlIIllII;
    private final /* synthetic */ F[] cw;
    protected final /* synthetic */ j cu;

    private static boolean llllIlIIIlIlII(int n2, int n3) {
        return n2 < n3;
    }

    protected aG(SquireFarmer squireFarmer, SquireFarmerConfig squireFarmerConfig, j j2, F ... fArray) {
        this.cv = squireFarmer;
        this.ct = squireFarmerConfig;
        this.cu = j2;
        this.cw = fArray;
    }

    private static boolean llllIlIIIlIIlI(int n2) {
        return n2 == 0;
    }

    private static void llllIlIIIlIIII() {
        llIIIlIIllII = new int[2];
        aG.llIIIlIIllII[0] = (0x6D ^ 0x45) & ~(5 ^ 0x2D);
        aG.llIIIlIIllII[1] = 1;
    }

    static {
        aG.llllIlIIIlIIII();
    }

    public abstract boolean f(E var1);

    private static boolean llllIlIIIlIlIl(Object object, Object object2) {
        return object == object2;
    }

    private static boolean llllIlIIIlIIll(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        aG var7;
        if (aG.llllIlIIIlIIIl((Object)this.cv.a(), (Object)o.BIRD_HOUSE)) {
            return llIIIlIIllII[0];
        }
        if (aG.llllIlIIIlIIlI(var7.ct.birdhouses_enabled() ? 1 : 0)) {
            return llIIIlIIllII[0];
        }
        E var1 = var7.cu.O();
        if (aG.llllIlIIIlIIll((Object)var1)) {
            return llIIIlIIllII[0];
        }
        int var3 = llIIIlIIllII[0];
        F[] var5 = var7.cw;
        int var2 = var5.length;
        int var6 = llIIIlIIllII[0];
        while (aG.llllIlIIIlIlII(var6, var2)) {
            F var4 = var5[var6];
            if (aG.llllIlIIIlIlIl((Object)var7.cu.b(var1), (Object)var4)) {
                var3 = llIIIlIIllII[1];
            }
            ++var6;
            0;
            if (2 != 3) continue;
            return ((0x76 ^ 0x68 ^ (0x9F ^ 0xBE)) & (16 + 96 - 87 + 105 ^ 177 + 107 - 150 + 55 ^ -1)) != 0;
        }
        if (aG.llllIlIIIlIIlI(var3)) {
            return llIIIlIIllII[0];
        }
        return this.f((E)var1_1);
    }

    private static boolean llllIlIIIlIIIl(Object object, Object object2) {
        return object != object2;
    }
}

