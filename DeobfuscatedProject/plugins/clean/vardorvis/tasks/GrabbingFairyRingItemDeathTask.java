/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.coords.WorldArea
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 */
package gg.squire.vardorvis.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Locatable;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import gg.squire.vardorvis.tasks.VardorvisTaskBase;

@TaskDesc(name="Grabbing fairy ring item [DEATH]", priority=0x7FFFFFFF, blocking=true)
public class GrabbingFairyRingItemDeathTask
extends VardorvisTaskBase {
    
    private  BankLocation ay;

    private static boolean lIllllIlllllIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIllllIllllllII(Object object) {
        return object == null;
    }

    @Override
    public boolean l() {
        G var1;
        if (G.lIllllIlllllIll(this.X() ? 1 : 0)) {
            return lIlIlIIlIlIll[0];
        }
        if (G.lIllllIllllllII(var1.ay)) {
            var1.ay = BankLocation.getNearest();
        }
        if (G.lIllllIlllllIll(var1.ay.getArea().contains((Locatable)Players.getLocal()) ? 1 : 0)) {
            if (G.lIllllIlllllIll(Bank.isOpen() ? 1 : 0)) {
                Bank.withdraw((int)lIlIlIIlIlIll[1], (int)lIlIlIIlIlIll[2], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                return lIlIlIIlIlIll[2];
            }
            if (G.lIllllIlllllIll(Bank.open() ? 1 : 0)) {
                return lIlIlIIlIlIll[2];
            }
        }
        Movement.walkTo((WorldArea)this.ay.getArea());

        return lIlIlIIlIlIll[2];
    }

    static {
        G.lIllllIlllllIlI();
    }
}

