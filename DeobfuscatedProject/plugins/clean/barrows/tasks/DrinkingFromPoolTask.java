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

    private static boolean lIllIIlIlIlllI(int n2) {
        return n2 == 0;
    }

    @Inject
    public DrinkingFromPoolTask(SquireBarrows squireBarrows) {
        this.af = squireBarrows;
    }

    public boolean run() {
        t var1;
        if (t.lIllIIlIlIlllI(House.isInside() ? 1 : 0)) {
            return lllIlllllIl[0];
        }
        var1.af.b(lllIlllllIl[0]);
        if (t.lIllIIlIlIlllI(House.isPoolDrinkUseful() ? 1 : 0)) {
            return lllIlllllIl[0];
        }
        return House.drinkFromPool();
    }

    static {
        t.lIllIIlIlIllIl();
    }

}

