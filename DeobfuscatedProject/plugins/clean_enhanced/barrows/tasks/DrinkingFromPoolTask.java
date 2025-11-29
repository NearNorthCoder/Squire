/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.unethicalite.api.game.House
 */
package gg.squire.barrows.tasks;

import gg.squire.barrows.SquireBarrows;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import javax.inject.Inject;
import net.unethicalite.api.game.House;

@TaskDesc(name="Drinking from pool", priority=250, blocking=true)
public class DrinkingFromPoolTask
extends Task {
    
    private final  SquireBarrows af;

    private static boolean var2(int n2) {
        return n2 == 0;
    }

    @Inject
    public DrinkingFromPoolTask(SquireBarrows squireBarrows) {
        this.af = squireBarrows;
    }

    public boolean run() {
        t var3;
        if (t.var2(House.isInside() ? 1 : 0)) {
            return var1[0];
        }
        var3.af.b(var1[0]);
        if (t.var2(House.isPoolDrinkUseful() ? 1 : 0)) {
            return var1[0];
        }
        return House.drinkFromPool();
    }

    static {
        t.var4();
    }

    private static void var4() {
        var1 = new int[1];
        t.var1[0] = (92 + 158 - 95 + 40 ^ 131 + 18 - 2 + 9) & (112 + 126 - 213 + 212 ^ 52 + 123 - 156 + 159 ^ -1);
    }
}

