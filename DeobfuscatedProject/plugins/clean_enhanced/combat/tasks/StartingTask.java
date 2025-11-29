/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.unethicalite.api.entities.Players
 */
package gg.squire.combat.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.combat.SquireBlueDragonKiller;
import gg.squire.combat.SquireBlueDragonKillerConfig;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.entities.Players;

@TaskDesc(name="Starting")
public class StartingTask
extends Task {
    
    private final  Client v;
    
    private final  SquireBlueDragonKiller t;
    private final  SquireBlueDragonKillerConfig u;

    public boolean run() {
        e var3;
        if ((this.t.i( == 0) ? 1 : 0)) {
            return 0;
        }
        BankLoadout var4 = (BankLoadout)var3.u.loadout().selected(BankLoadout.class);
        if var4 == null {
            Log.error((String)var1[0]);
            var3.t.forceStop();
            return 1;
        }
        if ((var3.u.dragonLocation( == 0).p().contains((Locatable)Players.getLocal()) ? 1 : 0) && (var4.needsToBank( != 0) ? 1 : 0)) {
            var3.t.a(1);
        }
        this.t.b(0);
        return 1;
    }

    @Inject
    public StartingTask(SquireBlueDragonKiller squireBlueDragonKiller, SquireBlueDragonKillerConfig squireBlueDragonKillerConfig, Client client) {
        this.t = squireBlueDragonKiller;
        this.u = squireBlueDragonKillerConfig;
        this.v = client;
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }
}

