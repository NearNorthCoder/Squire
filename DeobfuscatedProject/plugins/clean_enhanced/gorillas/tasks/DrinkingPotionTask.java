/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 */
package gg.squire.gorillas.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;

@TaskDesc(name="Drinking potion", priority=100)
public class DrinkingPotionTask
extends Task {

    public boolean run() {
        if ((Players.getLocal( == null).getInteracting())) {
            return 0;
        }
        return Combat.drinkBoostingPotion((int)1);
    }

    static {
        w.var2();
    }
}

