/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 */
package gg.squire.construction.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.construction.tasks.ConstructionManager;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;

@TaskDesc(name="Drinking boost", priority=7777)
public class DrinkingBoostTask
extends Task {
    private final  a aC;
    private static  int[] lIIIIlIIl;

    static {
        s.var1();
    }

    public boolean run() {
        if (!(this.aC.k( != null)) || (this.aC.k( == null).y())) {
            return 0;
        }
        if ((Players.getLocal( == null).getInteracting())) {
            return 0;
        }
        return Combat.drinkBoostingPotion((int)1);
    }

    @Inject
    public DrinkingBoostTask(a a2) {
        this.aC = a2;
    }

}

