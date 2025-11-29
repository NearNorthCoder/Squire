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

    private static boolean var2(int n2) {
        return n2 != 0;
    }

    private static boolean var3(Object object) {
        return object == null;
    }

    @Override
    public boolean l() {
        G var4;
        if (G.var2(this.X() ? 1 : 0)) {
            return var1[0];
        }
        if (G.var3(var4.ay)) {
            var4.ay = BankLocation.getNearest();
        }
        if (G.var2(var4.ay.getArea().contains((Locatable)Players.getLocal()) ? 1 : 0)) {
            if (G.var2(Bank.isOpen() ? 1 : 0)) {
                Bank.withdraw((int)var1[1], (int)var1[2], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                return var1[2];
            }
            if (G.var2(Bank.open() ? 1 : 0)) {
                return var1[2];
            }
        }
        Movement.walkTo((WorldArea)this.ay.getArea());
        0;
        return var1[2];
    }

    private static void var5() {
        var1 = new int[3];
        G.var1[0] = (140 + 167 - 103 + 3 ^ 3 + 58 - 40 + 177) & (0x55 ^ 0x68 ^ (0xBE ^ 0x8A) ^ -1);
        G.var1[1] = -(0xFFFF9DFE & 0x660D) & (0xFFFFEF6F & 0x179F);
        G.var1[2] = 1;
    }

    static {
        G.var5();
    }
}

