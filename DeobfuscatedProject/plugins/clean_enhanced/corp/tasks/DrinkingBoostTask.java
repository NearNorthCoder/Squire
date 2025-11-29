/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 */
package gg.squire.corp.tasks;

import gg.squire.corp.tasks.CorpTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;

@TaskDesc(name="Drinking boost")
public class DrinkingBoostTask
extends CorpTaskBase {

    static {
        f.var2();
    }

    public boolean run() {
        if ((this.g( == 0) ? 1 : 0)) {
            return 0;
        }
        if ((Players.getLocal( == null).getInteracting())) {
            return 0;
        }
        return Combat.drinkBoostingPotion((int)this.o.boostPercentage());
    }

}

