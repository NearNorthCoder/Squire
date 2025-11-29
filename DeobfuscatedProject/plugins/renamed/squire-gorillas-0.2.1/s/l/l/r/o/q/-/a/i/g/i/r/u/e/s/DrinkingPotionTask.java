/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 */
package s.l.l.r.o.q.-.a.i.g.i.r.u.e.s;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;

/* TASK: Drinking potion -> DrinkingpotionTask */
@TaskDesc(name="Drinking potion", priority=100)
public class DrinkingPotionTask
extends Task {
    private static /* synthetic */ int[] llIIlIlllllI;

    public boolean run() {
        if (w.lllllIllllIIII(Players.getLocal().getInteracting())) {
            return llIIlIlllllI[0];
        }
        return Combat.drinkBoostingPotion((int)llIIlIlllllI[1]);
    }

    private static boolean lllllIllllIIII(Object object) {
        return object == null;
    }

    private static void lllllIlllIllll() {
        llIIlIlllllI = new int[2];
        w.llIIlIlllllI[0] = (2 ^ (0x2E ^ 0x68)) & (0xE1 ^ 0x87 ^ (0x43 ^ 0x61) ^ -1);
        w.llIIlIlllllI[1] = 0x51 ^ 0x77 ^ (0x57 ^ 0x43);
    }

    static {
        w.lllllIlllIllll();
    }
}

