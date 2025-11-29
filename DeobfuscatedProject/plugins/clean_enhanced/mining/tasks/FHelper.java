/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 */
package gg.squire.mining.tasks;

import com.google.inject.Inject;
import gg.squire.mining.SquireMinerConfig;

public class FHelper {
    private final  SquireMinerConfig k;

    static {
        f.var2();
    }

    private static void var2() {
        var1 = new int[1];
        f.var1[0] = (0x79 ^ 0x67) & ~(0xA4 ^ 0xBA);
    }

    public boolean a(Object object, int n2) {
        return var1[0];
    }

    @Inject
    public FHelper(SquireMinerConfig squireMinerConfig) {
        this.k = squireMinerConfig;
    }
}

