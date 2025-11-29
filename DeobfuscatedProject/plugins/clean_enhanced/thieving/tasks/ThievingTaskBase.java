/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 */
package gg.squire.thieving.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.thieving.SquireThieving;
import gg.squire.thieving.SquireThievingConfig;
import gg.squire.thieving.tasks.GameEnum;

public abstract class ThievingTaskBase
extends Task {
    public final  SquireThieving ad;
    public final  SquireThievingConfig ae;

    public boolean run() {
        if (s.var2(this.ae.method().equals((Object)b.CHESTS) ? 1 : 0)) {
            return this.l();
        }
        return var1[0];
    }

    @Inject
    public ThievingTaskBase(SquireThieving squireThieving, SquireThievingConfig squireThievingConfig) {
        this.ad = squireThieving;
        this.ae = squireThievingConfig;
    }

    private static boolean var2(int n2) {
        return n2 != 0;
    }

    static {
        s.var3();
    }

    private static void var3() {
        var1 = new int[1];
        s.var1[0] = 3 & (3 ^ -1);
    }

    public abstract boolean l();
}

