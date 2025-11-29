/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Locatable
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 */
package s.r.i.t.g.n.-.u.h.i.q.i.e.v.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.thieving.SquireThievingConfig;
import javax.inject.Inject;
import net.runelite.api.Locatable;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.BEnum;

/* TASK: Banking (Stalls) -> Banking(Stalls)Task */
@TaskDesc(name="Banking (Stalls)", priority=5, blocking=true)
public class BankingStallsTask
extends Task {
    private static /* synthetic */ int[] lIIllIlllllIl;
    private final /* synthetic */ SquireThievingConfig aJ;

    static {
        I.lIllIIlIIIIIIll();
    }

    private static boolean lIllIIlIIIIIlIl(int n2) {
        return n2 == 0;
    }

    @Inject
    public I(SquireThievingConfig squireThievingConfig) {
        this.aJ = squireThievingConfig;
    }

    private static boolean lIllIIlIIIIIllI(int n2) {
        return n2 != 0;
    }

    private static void lIllIIlIIIIIIll() {
        lIIllIlllllIl = new int[3];
        I.lIIllIlllllIl[0] = (0x16 ^ 0x13) & ~(0x34 ^ 0x31);
        I.lIIllIlllllIl[1] = 1;
        I.lIIllIlllllIl[2] = 0x34 ^ 0x3E;
    }

    public boolean run() {
        if (I.lIllIIlIIIIIlII((Object)this.aJ.method(), (Object)b.STALLS)) {
            return lIIllIlllllIl[0];
        }
        if (I.lIllIIlIIIIIlIl(Inventory.isFull() ? 1 : 0)) {
            return lIIllIlllllIl[0];
        }
        if (I.lIllIIlIIIIIllI(Bank.isOpen() ? 1 : 0)) {
            Bank.depositInventory();
            Bank.close();
            return lIIllIlllllIl[1];
        }
        if (I.lIllIIlIIIIIlIl(Movement.shouldWalk() ? 1 : 0)) {
            return lIIllIlllllIl[1];
        }
        BankLocation var1 = BankLocation.getNearest();
        if (I.lIllIIlIIIIIlll(var1.getArea().distanceTo((Locatable)Players.getLocal()), lIIllIlllllIl[2])) {
            Movement.walkTo((WorldPoint)var1.getArea().getCenter());
            0;
            return lIIllIlllllIl[1];
        }
        Bank.open();
        0;
        return lIIllIlllllIl[1];
    }

    private static boolean lIllIIlIIIIIlll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIllIIlIIIIIlII(Object object, Object object2) {
        return object != object2;
    }
}

