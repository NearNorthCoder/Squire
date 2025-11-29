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
    private static  int[] lIlIIIlIl;
    private final  SquireQuestHelper fL;

    public boolean run() {
        bj var1;
        if (!bj.var2(this.fM.useBank() ? 1 : 0) || bj.var3(this.fL.isEnabled() ? 1 : 0)) {
            return lIlIIIlIl[0];
        }
        List<Integer> var4 = var1.fL.cH();
        if (bj.var2(var4.isEmpty() ? 1 : 0)) {
            return lIlIIIlIl[0];
        }
        if (bj.var2(Bank.isOpen() ? 1 : 0)) {
            var4.stream().filter(n2 -> {
                int[] nArray = new int[lIlIIIlIl[1]];
                nArray[bj.lIlIIIlIl[0]] = n2;
                return Bank.contains((int[])nArray);
            }).findAny().ifPresent(n2 -> Bank.withdraw((int)n2, (int)lIlIIIlIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM));
            return lIlIIIlIl[1];
        }
        if (bj.var2(Bank.open() ? 1 : 0)) {
            return lIlIIIlIl[1];
        }
        BankLocation var5 = BankLocation.getNearestCommon();
        if (bj.var6(var5)) {
            if (bj.var2(Movement.shouldWalk() ? 1 : 0)) {
                Movement.walkTo((WorldPoint)var5.getArea().getCenter());
                0;
            }
            return lIlIIIlIl[1];
        }
        return lIlIIIlIl[0];
    }

    private static boolean var2(int n2) {
        return n2 != 0;
    }

    private static boolean var6(Object object) {
        return object != null;
    }

    @Inject
    public BankingForItemsTask(SquireQuestHelper squireQuestHelper, SquireQuestHelperConfig squireQuestHelperConfig) {
        this.fL = squireQuestHelper;
        this.fM = squireQuestHelperConfig;
    }

    static {
        bj.var7();
    }

    private static void var7() {
        lIlIIIlIl = new int[2];
        bj.lIlIIIlIl[0] = (0x75 ^ 0x78 ^ (0x2F ^ 0xF)) & (145 + 109 - 184 + 78 ^ 40 + 149 - 104 + 100 ^ -1);
        bj.lIlIIIlIl[1] = 1;
    }

    private static boolean var3(int n2) {
        return n2 == 0;
    }
}

