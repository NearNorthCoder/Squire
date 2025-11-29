/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 */
package gg.squire.construction.tasks;

import com.google.inject.Inject;
import gg.squire.basics.questing.SquireQuestHelper;
import gg.squire.basics.questing.SquireQuestHelperConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.List;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;

@TaskDesc(name="Banking for items", priority=100, blocking=true)
public class BankingForItemsTask
extends Task {
    private final  SquireQuestHelperConfig fM;
    
    private final  SquireQuestHelper fL;

    public boolean run() {
        bj llIIIIlIllIlllI;
        if (!bj.lIIIlllIlll(this.fM.useBank() ? 1 : 0) || bj.lIIIllllIII(this.fL.isEnabled() ? 1 : 0)) {
            return lIlIIIlIl[0];
        }
        List<Integer> llIIIIlIllIllIl = llIIIIlIllIlllI.fL.cH();
        if (bj.lIIIlllIlll(llIIIIlIllIllIl.isEmpty() ? 1 : 0)) {
            return lIlIIIlIl[0];
        }
        if (bj.lIIIlllIlll(Bank.isOpen() ? 1 : 0)) {
            llIIIIlIllIllIl.stream().filter(n2 -> {
                int[] nArray = new int[lIlIIIlIl[1]];
                nArray[bj.lIlIIIlIl[0]] = n2;
                return Bank.contains((int[])nArray);
            }).findAny().ifPresent(n2 -> Bank.withdraw((int)n2, (int)lIlIIIlIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM));
            return lIlIIIlIl[1];
        }
        if (bj.lIIIlllIlll(Bank.open() ? 1 : 0)) {
            return lIlIIIlIl[1];
        }
        BankLocation llIIIIlIllIllII = BankLocation.getNearestCommon();
        if (bj.lIIIllllIIl(llIIIIlIllIllII)) {
            if (bj.lIIIlllIlll(Movement.shouldWalk() ? 1 : 0)) {
                Movement.walkTo((WorldPoint)llIIIIlIllIllII.getArea().getCenter());

            }
            return lIlIIIlIl[1];
        }
        return lIlIIIlIl[0];
    }

    private static boolean lIIIlllIlll(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIllllIIl(Object object) {
        return object != null;
    }

    @Inject
    public BankingForItemsTask(SquireQuestHelper squireQuestHelper, SquireQuestHelperConfig squireQuestHelperConfig) {
        this.fL = squireQuestHelper;
        this.fM = squireQuestHelperConfig;
    }

    static {
        bj.lIIIlllIllI();
    }

    private static boolean lIIIllllIII(int n2) {
        return n2 == 0;
    }
}

