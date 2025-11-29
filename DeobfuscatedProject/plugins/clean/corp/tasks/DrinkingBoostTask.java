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

    private static boolean lllIIIIllIIIIl(Object object) {
        return object == null;
    }

    static {
        f.lllIIIIlIlllll();
    }

    public boolean run() {
        if (f.lllIIIIllIIIII(this.g() ? 1 : 0)) {
            return lIlIlllIIllI[0];
        }
        if (f.lllIIIIllIIIIl(Players.getLocal().getInteracting())) {
            return lIlIlllIIllI[0];
        }
        return Combat.drinkBoostingPotion((int)this.o.boostPercentage());
    }

    private static boolean lllIIIIllIIIII(int n2) {
        return n2 == 0;
    }
}

