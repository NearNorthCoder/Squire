/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  net.runelite.api.Client
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import net.runelite.api.Client;
import gg.squire.autotoa.tasks.AutotoaManager;

public abstract class ck
extends AutotoaManager {
    protected static final  int hT;
    protected final  TOAConfig hY;
    protected static final  int hU;
    protected static final  int hV;
    
    protected static final  int hW;
    private static final  int hX;

    @Inject
    protected ck(Client client, TOAConfig tOAConfig) {
        super(client);
        this.hY = tOAConfig;
    }

    private static void var2() {
        var1 = new int[6];
        ck.var1[0] = 0xFFFFBFCF & 0x74BE;
        ck.var1[1] = (0x29 ^ 0x62) & ~(0xD1 ^ 0x9A);
        ck.var1[2] = 0xA ^ 0x4D ^ (0x43 ^ 2);
        ck.var1[3] = 3;
        ck.var1[4] = -(0xFFFFFF97 & 0x7C69) & (0xFFFFFF5A & 0x7EFF);
        ck.var1[5] = -(0xFFFFD2B6 & 0x6FFF) & (0xFFFFE7F7 & 0x3045AFD);
    }

    private static boolean var3(int n2) {
        return n2 == 0;
    }

    public abstract boolean bl();

    public boolean run() {
        if (ck.var3(this.j(var1[0]) ? 1 : 0)) {
            return var1[1];
        }
        return this.bl();
    }

    static {
        ck.var2();
        hV = var1[2];
        hX = var1[0];
        hU = var1[3];
        hT = var1[4];
        hW = var1[5];
    }
}

