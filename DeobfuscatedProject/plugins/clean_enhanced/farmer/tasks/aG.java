/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.GameEnum20;
import gg.squire.farmer.tasks.GameEnum15;
import gg.squire.farmer.tasks.FarmerManager;
import gg.squire.farmer.tasks.GameEnum8;
import gg.squire.client.plugins.fw.Task;
import gg.squire.farmer.SquireFarmer;
import gg.squire.farmer.SquireFarmerConfig;

public abstract class aG
extends Task {
    private final  SquireFarmer cv;
    protected final  SquireFarmerConfig ct;
    
    private final  F[] cw;
    protected final  j cu;

    protected aG(SquireFarmer squireFarmer, SquireFarmerConfig squireFarmerConfig, j j2, F ... fArray) {
        this.cv = squireFarmer;
        this.ct = squireFarmerConfig;
        this.cu = j2;
        this.cw = fArray;
    }

    static {
        aG.var2();
    }

    public abstract boolean f(E var1);

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        aG var3;
        if (((Object)this.cv.a() != (Object)this.cv.a()2)o.BIRD_HOUSE)) {
            return 0;
        }
        if ((var3.ct.birdhouses_enabled( == 0) ? 1 : 0)) {
            return 0;
        }
        E var4 = var3.cu.O();
        if ((Object == nulllllllllllllllllIlIlIlIIIlIIlIlII)) {
            return 0;
        }
        int var5 = 0;
        F[] var6 = var3.cw;
        int var7 = var6.length;
        int var8 = 0;
        while (var8 < var7) {
            F var9 = var6[var8];
            if (((Object)var3.cu.b(var4) == (Object)var3.cu.b(var4)2)var9)) {
                var5 = 1;
            }
            ++var8;
            0;
            if (2 != 3) continue;
            return ((0x76 ^ 0x68 ^ (0x9F ^ 0xBE)) & (16 + 96 - 87 + 105 ^ 177 + 107 - 150 + 55 ^ -1)) != 0;
        }
        if (var5 == 0) {
            return 0;
        }
        return this.f((E)var1_1);
    }

}

