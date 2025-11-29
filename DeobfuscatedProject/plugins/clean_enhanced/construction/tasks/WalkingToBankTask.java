/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.api.GameState
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 */
package gg.squire.construction.tasks;

import com.google.inject.Inject;
import gg.squire.basics.cerberus.SquireCerberus;
import gg.squire.basics.cerberus.SquireCerberusConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;

@TaskDesc(name="Walking to Bank", priority=2147470310, blocking=true)
public class WalkingToBankTask
extends Task {
    private  BankLocation az;
    private final  SquireCerberusConfig ay;
    private static  int[] lllIlll;
    private final  Client aw;
    private final  SquireCerberus ax;

    @Inject
    public WalkingToBankTask(Client client, SquireCerberus squireCerberus, SquireCerberusConfig squireCerberusConfig) {
        this.aw = client;
        this.ax = squireCerberus;
        this.ay = squireCerberusConfig;
    }

    public boolean run() {
        q var1;
        if ((this.ay.bankLoadout( == 0).isSelected() ? 1 : 0)) {
            return 0;
        }
        if ((var1.aw.getGameState() != var1.aw.getGameState()2)) {
            return 0;
        }
        if ((var1.ax.r( == 0) ? 1 : 0)) {
            return 0;
        }
        if ((Bank.isOpen( != 0) ? 1 : 0)) {
            return 0;
        }
        var1.az = BankLocation.FALADOR_WEST_BANK;
        if ((Movement.shouldWalk( == 0) ? 1 : 0)) {
            return 0;
        }
        if ((Bank.open( == 0) ? 1 : 0)) {
            Log.info((String)("Walking to bank: " + var1.az.toString()));
            return Movement.walkTo((BankLocation)var1.az);
        }
        return 1;
    }

}

