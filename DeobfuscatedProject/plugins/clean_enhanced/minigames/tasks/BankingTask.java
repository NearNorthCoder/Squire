/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.coords.WorldArea
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 */
package gg.squire.minigames.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.minigames.SquireSorceressGardenConfig;
import net.runelite.api.Locatable;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import gg.squire.minigames.tasks.GameEnum;

@TaskDesc(name="Banking")
public class BankingTask
extends Task {

    private final  SquireSorceressGardenConfig s;

    static {
        b.var3();
        b.var4();
    }

    private static void var3() {
        var1 = new int[3];
        b.var1[0] = (0x54 ^ 0x49) & ~(0xB0 ^ 0xAD);
        b.var1[1] = 1;
        b.var1[2] = 2;
    }

    private static boolean var5(int n) {
        return n == 0;
    }

    private static boolean var6(int n) {
        return n != 0;
    }

    private static String var7(String var8, String var9) {
        var8 = new String(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var10 = new StringBuilder();
        char[] var11 = var9.toCharArray();
        int var12 = var1[0];
        char[] var13 = var8.toCharArray();
        int var14 = var13.length;
        int var15 = var1[0];
        while (b.var16(var15, var14)) {
            char var17 = var13[var15];
            var10.append((char)(var17 ^ var11[var12 % var11.length]));
            0;
            ++var12;
            ++var15;
            0;
            if (-2 < 0) continue;
            return null;
        }
        return String.valueOf(var10);
    }

    public boolean run() {
        b var18;
        if (b.var19((Object)this.s.botActivity(), (Object)a.MINIGAME)) {
            return var1[0];
        }
        if (b.var5(var18.o() ? 1 : 0)) {
            return var1[0];
        }
        if (b.var6(Bank.isOpen() ? 1 : 0)) {
            return var18.p();
        }
        return this.r();
    }

    @Inject
    public BankingTask(SquireSorceressGardenConfig squireSorceressGardenConfig) {
        this.s = squireSorceressGardenConfig;
    }

    private boolean r() {
        if (b.var6(BankLocation.AL_KHARID_BANK.getArea().contains((Locatable)Players.getLocal()) ? 1 : 0)) {
            Bank.open();
            0;
            return var1[1];
        }
        Movement.walkTo((WorldArea)BankLocation.AL_KHARID_BANK.getArea());
        0;
        return var1[1];
    }

    private boolean q() {
        if (b.var6(Inventory.contains(item -> item.getName().toLowerCase().contains(var2[var1[1]])) ? 1 : 0)) {
            Bank.close();
            return var1[1];
        }
        Bank.withdraw(item -> item.getName().toLowerCase().contains(var2[var1[0]]), (int)this.s.stamAmount(), (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
        return var1[1];
    }

    private static boolean var19(Object object, Object object2) {
        return object != object2;
    }

    private boolean p() {
        b var20;
        if (b.var6(Inventory.isFull() ? 1 : 0)) {
            Bank.depositInventory();
            return var1[1];
        }
        if (b.var6(var20.s.useStaminas() ? 1 : 0)) {
            return var20.q();
        }
        Bank.close();
        return var1[1];
    }

    private static boolean var16(int n, int n2) {
        return n < n2;
    }

    private static void var4() {
        var2 = new String[var1[2]];
        b.var2[b.var1[0]] = "stamina";
        b.var2[b.var1[1]] = "stamina";
    }

    private boolean o() {
        boolean bl;
        if (!b.var5(Inventory.isFull() ? 1 : 0) || b.var6(Bank.isOpen() ? 1 : 0)) {
            bl = var1[1];
            0;
            if (((0x44 ^ 0x27) & ~(0x12 ^ 0x71)) >= 3) {
                return ((0x67 ^ 0x35) & ~(0x4C ^ 0x1E)) != 0;
            }
        } else {
            bl = var1[0];
        }
        return bl;
    }
}

