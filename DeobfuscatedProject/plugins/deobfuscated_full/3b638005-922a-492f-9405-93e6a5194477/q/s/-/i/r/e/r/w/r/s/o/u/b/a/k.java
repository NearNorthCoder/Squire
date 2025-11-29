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
package q.s.-.i.r.e.r.w.r.s.o.u.b.a;

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

/* TASK: Walking to Bank -> WalkingtobankTask */
@TaskDesc(name="Walking to Bank", priority=2147470310)
public class k
extends Task {
    private static /* synthetic */ int[] llllIlIlIlI;
    private final /* synthetic */ SquireBarrowsConfig M;
    private final /* synthetic */ SquireBarrows L;
    private /* synthetic */ BankLocation N;
    private final /* synthetic */ Client K;

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
            0;
        }
        return llllIlIlIlI[1];
    }

    private static boolean lIllIlIllIllII(Object object) {
        return object == null;
    }

    private static void lIllIlIllIlIII() {
        llllIlIlIlI = new int[2];
        k.llllIlIlIlI[0] = (0x43 ^ 0x71 ^ (0x64 ^ 0x1D)) & (0xC9 ^ 0xC1 ^ (0x7F ^ 0x3C) ^ -1);
        k.llllIlIlIlI[1] = 1;
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
    public k(Client client, SquireBarrows squireBarrows, SquireBarrowsConfig squireBarrowsConfig) {
        this.K = client;
        this.L = squireBarrows;
        this.M = squireBarrowsConfig;
    }
}

