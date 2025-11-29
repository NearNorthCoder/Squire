/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.client.plugins.squire.BankLoadouts
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Bank
 */
package gg.squire.combat.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.combat.SquireBlueDragonKiller;
import gg.squire.combat.SquireBlueDragonKillerConfig;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.client.plugins.squire.BankLoadouts;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;

@TaskDesc(name="Banking for items")
public class BankingForItemsTask
extends Task {
    private final  SquireBlueDragonKillerConfig w;
    private  Player y;
    
    private final  SquireBlueDragonKiller x;

    private static boolean llIlIIIlIIllIl(int n) {
        return n == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        f var1;
        if (f.llIlIIIlIIllIl(this.x.h() ? 1 : 0)) {
            return lIIlllIllIll[0];
        }
        var1.y = Players.getLocal();
        if (f.llIlIIIlIIlllI(var1.y)) {
            return lIIlllIllIll[0];
        }
        if (f.llIlIIIlIIllIl(var1.w.bankLocation().getArea().contains((Locatable)var1.y) ? 1 : 0)) {
            return lIIlllIllIll[0];
        }
        if (f.llIlIIIlIIllIl(Bank.isOpen() ? 1 : 0)) {
            Bank.open();

            return lIIlllIllIll[1];
        }
        BankLoadout var2 = (BankLoadout)var1.w.loadout().selected(BankLoadout.class);
        if (f.llIlIIIlIIllIl(var2.needsToBank() ? 1 : 0)) {
            var1.x.a(lIIlllIllIll[0]);
            return lIIlllIllIll[0];
        }
        BankLoadouts.withdrawWithRetries((BankLoadout)var1_1, (int)lIIlllIllIll[2]);

        return lIIlllIllIll[1];
    }

    @Inject
    public BankingForItemsTask(SquireBlueDragonKillerConfig squireBlueDragonKillerConfig, SquireBlueDragonKiller squireBlueDragonKiller) {
        this.w = squireBlueDragonKillerConfig;
        this.x = squireBlueDragonKiller;
    }

    private static boolean llIlIIIlIIlllI(Object object) {
        return object == null;
    }

    static {
        f.llIlIIIlIIllII();
    }
}

