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

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        f var2;
        if ((this.x.h( == 0) ? 1 : 0)) {
            return 0;
        }
        var2.y = Players.getLocal();
        if (var2.y == null) {
            return 0;
        }
        if ((var2.w.bankLocation( == 0).getArea().contains((Locatable)var2.y) ? 1 : 0)) {
            return 0;
        }
        if ((Bank.isOpen( == 0) ? 1 : 0)) {
            Bank.open();
            0;
            return 1;
        }
        BankLoadout var3 = (BankLoadout)var2.w.loadout().selected(BankLoadout.class);
        if ((var3.needsToBank( == 0) ? 1 : 0)) {
            var2.x.a(0);
            return 0;
        }
        BankLoadouts.withdrawWithRetries((BankLoadout)var1_1, (int)2);
        0;
        return 1;
    }

    @Inject
    public BankingForItemsTask(SquireBlueDragonKillerConfig squireBlueDragonKillerConfig, SquireBlueDragonKiller squireBlueDragonKiller) {
        this.w = squireBlueDragonKillerConfig;
        this.x = squireBlueDragonKiller;
    }

    static {
        f.var4();
    }
}

