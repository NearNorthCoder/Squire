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
        k var2;
        if (k.var3(this.M.useBank() ? 1 : 0)) {
            return var1[0];
        }
        if (k.var4(var2.K.getGameState(), GameState.LOGGED_IN)) {
            return var1[0];
        }
        if (k.var3(var2.L.u() ? 1 : 0)) {
            return var1[0];
        }
        if (k.var5(Bank.isOpen() ? 1 : 0)) {
            return var1[0];
        }
        if (k.var6(var2.N)) {
            var2.N = BankLocation.getNearestCommon();
        }
        if (k.var3(Bank.open() ? 1 : 0)) {
            Log.info((String)("Walking to bank: " + var2.N.toString()));
            Movement.walkTo((BankLocation)var2.N);
            0;
        }
        return var1[1];
    }

    private static boolean var6(Object object) {
        return object == null;
    }

    private static void var7() {
        var1 = new int[2];
        k.var1[0] = (0x43 ^ 0x71 ^ (0x64 ^ 0x1D)) & (0xC9 ^ 0xC1 ^ (0x7F ^ 0x3C) ^ -1);
        k.var1[1] = 1;
    }

    private static boolean var4(Object object, Object object2) {
        return object != object2;
    }

    private static boolean var3(int n2) {
        return n2 == 0;
    }

    static {
        k.var7();
    }

    private static boolean var5(int n2) {
        return n2 != 0;
    }

    @Inject
    public WalkingToBankTask(Client client, SquireBarrows squireBarrows, SquireBarrowsConfig squireBarrowsConfig) {
        this.K = client;
        this.L = squireBarrows;
        this.M = squireBarrowsConfig;
    }
}

