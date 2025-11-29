/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.GameEnum60;
import gg.squire.farmer.tasks.GameEnum40;
import gg.squire.farmer.tasks.FarmerManager;
import gg.squire.farmer.tasks.GameEnum14;
import gg.squire.client.plugins.fw.Task;
import gg.squire.farmer.SquireFarmer;
import gg.squire.farmer.SquireFarmerConfig;

public abstract class FarmerTaskBase
extends Task {
    private final  SquireFarmer cv;
    protected final  SquireFarmerConfig ct;
    
    private final  F[] cw;
    protected final  j cu;

    private static boolean llllIlIIIlIlII(int n2, int n3) {
        return n2 < n3;
    }

    protected FarmerTaskBase(SquireFarmer squireFarmer, SquireFarmerConfig squireFarmerConfig, j j2, F ... fArray) {
        this.cv = squireFarmer;
        this.ct = squireFarmerConfig;
        this.cu = j2;
        this.cw = fArray;
    }

    private static boolean llllIlIIIlIIlI(int n2) {
        return n2 == 0;
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
        aG var1;
        if (aG.llllIlIIIlIIIl((Object)this.cv.a(), (Object)o.BIRD_HOUSE)) {
            return llIIIlIIllII[0];
        }
        if (aG.llllIlIIIlIIlI(var1.ct.birdhouses_enabled() ? 1 : 0)) {
            return llIIIlIIllII[0];
        }
        E var2 = var1.cu.O();
        if (aG.llllIlIIIlIIll((Object)var2)) {
            return llIIIlIIllII[0];
        }
        int var3 = llIIIlIIllII[0];
        F[] var4 = var1.cw;
        int var5 = var4.length;
        int var6 = llIIIlIIllII[0];
        while (aG.llllIlIIIlIlII(var6, var5)) {
            F var7 = var4[var6];
            if (aG.llllIlIIIlIlIl((Object)var1.cu.b(var2), (Object)var7)) {
                var3 = llIIIlIIllII[1];
            }
            ++var6;

            if (2 != 3) continue;
            return ((0x76 ^ 0x68 ^ (0x9F ^ 0xBE)) & (16 + 96 - 87 + 105 ^ 177 + 107 - 150 + 55 ^ -1)) != 0;
        }
        if (aG.llllIlIIIlIIlI(var3)) {
            return llIIIlIIllII[0];
        }
        return this.f((GameEnum60) ar1_1);
    }

    private static boolean llllIlIIIlIIIl(Object object, Object object2) {
        return object != object2;
    }
}

