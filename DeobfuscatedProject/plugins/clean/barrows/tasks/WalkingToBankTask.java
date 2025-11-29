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
package gg.squire.barrows.tasks;

import com.google.inject.Inject;
import gg.squire.barrows.SquireBarrows;
import gg.squire.barrows.SquireBarrowsConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;

@TaskDesc(name="Walking to Bank", priority=2147470310)
public class WalkingToBankTask
extends Task {
    
    private final  SquireBarrowsConfig M;
    private final  SquireBarrows L;
    private  BankLocation N;
    private final  Client K;

    public boolean run() {
        k var1;
        if (k.lIllIlIllIlIIl(this.M.useBank() ? 1 : 0)) {
            return llllIlIlIlI[0];
        }
        if (k.lIllIlIllIlIlI(var1.K.getGameState(), GameState.LOGGED_IN)) {
            return llllIlIlIlI[0];
        }
        if (k.lIllIlIllIlIIl(var1.L.u() ? 1 : 0)) {
            return llllIlIlIlI[0];
        }
        if (k.lIllIlIllIlIll(Bank.isOpen() ? 1 : 0)) {
            return llllIlIlIlI[0];
        }
        if (k.lIllIlIllIllII(var1.N)) {
            var1.N = BankLocation.getNearestCommon();
        }
        if (k.lIllIlIllIlIIl(Bank.open() ? 1 : 0)) {
            Log.info((String)("Walking to bank: " + var1.N.toString()));
            Movement.walkTo((BankLocation)var1.N);

        }
        return llllIlIlIlI[1];
    }

    private static boolean lIllIlIllIllII(Object object) {
        return object == null;
    }

    private static boolean lIllIlIllIlIlI(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIllIlIllIlIIl(int n2) {
        return n2 == 0;
    }

    static {
        k.lIllIlIllIlIII();
    }

    private static boolean lIllIlIllIlIll(int n2) {
        return n2 != 0;
    }

    @Inject
    public WalkingToBankTask(Client client, SquireBarrows squireBarrows, SquireBarrowsConfig squireBarrowsConfig) {
        this.K = client;
        this.L = squireBarrows;
        this.M = squireBarrowsConfig;
    }
}

