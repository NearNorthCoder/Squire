/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import gg.squire.basics.ectofuntus.SquireEcto;
import gg.squire.basics.ectofuntus.SquireEctoConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;

/* TASK: Traverse to bank -> TraversetobankTask */
@TaskDesc(name="Traverse to bank", priority=10)
public class TraverseToBankTask
extends Task {
    private final /* synthetic */ SquireEcto da;
    private final /* synthetic */ SquireEctoConfig db;
    private static /* synthetic */ int[] lllIIlIl;
    private /* synthetic */ BankLocation dc;

    private static boolean llIIlIlIlI(int n2, int n3) {
        return n2 > n3;
    }

    static {
        aq.llIIlIIlll();
    }

    public boolean run() {
        aq llIlIIlllllIIII;
        if (aq.llIIlIlIII(this.da.r() ? 1 : 0)) {
            return lllIIlIl[0];
        }
        if (aq.llIIlIlIIl(Bank.isOpen() ? 1 : 0)) {
            return lllIIlIl[0];
        }
        if (aq.llIIlIlIlI(Movement.getRunEnergy(), lllIIlIl[1]) && aq.llIIlIlIII(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        if (aq.llIIlIlIII(llIlIIlllllIIII.db.bankItem().bq() ? 1 : 0)) {
            Item llIlIIllllIllll = Inventory.getFirst(llIlIIlllllIIII.db.bankItem().br());
            if (aq.llIIlIlIll(llIlIIllllIllll)) {
                return lllIIlIl[0];
            }
            llIlIIllllIllll.interact(llIlIIlllllIIII.db.bankItem().bs());
            llIlIIlllllIIII.sleep(lllIIlIl[2]);
            return lllIIlIl[3];
        }
        if (aq.llIIlIlIlI(Players.getLocal().distanceTo(llIlIIlllllIIII.db.bankItem().bt()), lllIIlIl[4])) {
            Movement.setDestination((WorldPoint)llIlIIlllllIIII.db.bankItem().bt());
            return lllIIlIl[3];
        }
        return Bank.open();
    }

    private static void llIIlIIlll() {
        lllIIlIl = new int[5];
        aq.lllIIlIl[0] = (0x22 ^ 0x6C) & ~(0xD8 ^ 0x96);
        aq.lllIIlIl[1] = 0x77 ^ 0x63;
        aq.lllIIlIl[2] = 2;
        aq.lllIIlIl[3] = 1;
        aq.lllIIlIl[4] = 40 + 110 - 26 + 5 ^ 52 + 104 - 148 + 126;
    }

    private static boolean llIIlIlIll(Object object) {
        return object == null;
    }

    @Inject
    public aq(SquireEcto squireEcto, SquireEctoConfig squireEctoConfig) {
        this.da = squireEcto;
        this.db = squireEctoConfig;
    }

    private static boolean llIIlIlIII(int n2) {
        return n2 == 0;
    }

    private static boolean llIIlIlIIl(int n2) {
        return n2 != 0;
    }
}

