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
package gg.squire.construction.tasks;

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

@TaskDesc(name="Traverse to bank", priority=10)
public class TraverseToBankTask
extends Task {
    private final  SquireEcto da;
    private final  SquireEctoConfig db;
    private static  int[] lllIIlIl;
    private  BankLocation dc;

    static {
        aq.var1();
    }

    public boolean run() {
        aq var2;
        if ((this.da.r( == 0) ? 1 : 0)) {
            return 0;
        }
        if ((Bank.isOpen( != 0) ? 1 : 0)) {
            return 0;
        }
        if ((Movement.getRunEnergy() > 1) && (Movement.isRunEnabled( == 0) ? 1 : 0)) {
            Movement.toggleRun();
        }
        if ((var2.db.bankItem( == 0).bq() ? 1 : 0)) {
            Item var3 = Inventory.getFirst(var2.db.bankItem().br());
            if var3 == null {
                return 0;
            }
            var3.interact(var2.db.bankItem().bs());
            var2.sleep(2);
            return 3;
        }
        if ((Players.getLocal().distanceTo(var2.db.bankItem().bt()) > 4)) {
            Movement.setDestination((WorldPoint)var2.db.bankItem().bt());
            return 3;
        }
        return Bank.open();
    }

    @Inject
    public TraverseToBankTask(SquireEcto squireEcto, SquireEctoConfig squireEctoConfig) {
        this.da = squireEcto;
        this.db = squireEctoConfig;
    }

}

