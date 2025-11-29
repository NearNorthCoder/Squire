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
package i.i.b.s.c.q.r.s.s.-.u.a.e;

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

/* TASK: Walking to Bank -> WalkingtobankTask */
@TaskDesc(name="Walking to Bank", priority=2147470310, blocking=true)
public class q
extends Task {
    private /* synthetic */ BankLocation az;
    private final /* synthetic */ SquireCerberusConfig ay;
    private static /* synthetic */ int[] lllIlll;
    private final /* synthetic */ Client aw;
    private final /* synthetic */ SquireCerberus ax;

    @Inject
    public q(Client client, SquireCerberus squireCerberus, SquireCerberusConfig squireCerberusConfig) {
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

    private static void lllIIlIll() {
        lllIlll = new int[2];
        q.lllIlll[0] = (0xCA ^ 0x91 ^ (0x47 ^ 0x22)) & ((0x34 ^ 0x2B) & ~(0xB0 ^ 0xAF) ^ (0x16 ^ 0x28) ^ -1);
        q.lllIlll[1] = 1;
    }
}

