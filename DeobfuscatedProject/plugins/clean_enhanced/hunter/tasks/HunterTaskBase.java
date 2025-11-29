/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 */
package gg.squire.hunter.tasks;

import gg.squire.hunter.tasks.HunterManager;
import gg.squire.hunter.tasks.GameEnum4;
import gg.squire.client.plugins.fw.Task;
import gg.squire.hunter.SquireHunterConfig;

public abstract class HunterTaskBase
extends Task {
    private final  a u;
    private  e w;
    private final  SquireHunterConfig v;

    public boolean run() {
        if (j.var2((Object)this.v.method(), (Object)this.w)) {
            return var1[0];
        }
        return this.x();
    }

    protected abstract boolean x();

    private static void var3() {
        var1 = new int[1];
        j.var1[0] = (0x50 ^ 0x71 ^ (0x39 ^ 0x16)) & (10 + 99 - -6 + 24 ^ 75 + 105 - 82 + 35 ^ -1);
    }

    public SquireHunterConfig z() {
        return this.v;
    }

    static {
        j.var3();
    }

    public a y() {
        return this.u;
    }

    public HunterTaskBase(a a2, SquireHunterConfig squireHunterConfig, e e2) {
        this.u = a2;
        this.v = squireHunterConfig;
        this.w = e2;
    }

    private static boolean var2(Object object, Object object2) {
        return object != object2;
    }
}

