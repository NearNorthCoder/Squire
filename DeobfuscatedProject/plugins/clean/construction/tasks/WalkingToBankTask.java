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
    
    private final  Client aw;
    private final  SquireCerberus ax;

    @Inject
    public WalkingToBankTask(Client client, SquireCerberus squireCerberus, SquireCerberusConfig squireCerberusConfig) {
        this.aw = client;
        this.ax = squireCerberus;
        this.ay = squireCerberusConfig;
    }

    public boolean run() {
        q lllIIllllIIlllI;
        if (q.lllIIllII(this.ay.bankLoadout().isSelected() ? 1 : 0)) {
            return lllIlll[0];
        }
        if (q.lllIIllIl(lllIIllllIIlllI.aw.getGameState(), GameState.LOGGED_IN)) {
            return lllIlll[0];
        }
        if (q.lllIIllII(lllIIllllIIlllI.ax.r() ? 1 : 0)) {
            return lllIlll[0];
        }
        if (q.lllIIlllI(Bank.isOpen() ? 1 : 0)) {
            return lllIlll[0];
        }
        lllIIllllIIlllI.az = BankLocation.FALADOR_WEST_BANK;
        if (q.lllIIllII(Movement.shouldWalk() ? 1 : 0)) {
            return lllIlll[0];
        }
        if (q.lllIIllII(Bank.open() ? 1 : 0)) {
            Log.info((String)("Walking to bank: " + lllIIllllIIlllI.az.toString()));
            return Movement.walkTo((BankLocation)lllIIllllIIlllI.az);
        }
        return lllIlll[1];
    }

    private static boolean lllIIllII(int n2) {
        return n2 == 0;
    }

    private static boolean lllIIlllI(int n2) {
        return n2 != 0;
    }

    private static boolean lllIIllIl(Object object, Object object2) {
        return object != object2;
    }

    static {
        q.lllIIlIll();
    }

}

