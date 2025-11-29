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

    private static boolean lllIlIIlll(Object object) {
        return object == null;
    }

    static {
        s.lllIlIIlIl();
    }

    public boolean run() {
        if (!s.lllIlIIllI(this.aC.k()) || s.lllIlIIlll(this.aC.k().y())) {
            return lIIIIlIIl[0];
        }
        if (s.lllIlIIlll(Players.getLocal().getInteracting())) {
            return lIIIIlIIl[0];
        }
        return Combat.drinkBoostingPotion((int)lIIIIlIIl[1]);
    }

    @Inject
    public DrinkingBoostTask(a a2) {
        this.aC = a2;
    }

    private static boolean lllIlIIllI(Object object) {
        return object != null;
    }
}

