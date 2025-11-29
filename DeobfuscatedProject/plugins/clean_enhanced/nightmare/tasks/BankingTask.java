/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$Inventory
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.nightmare.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.util.function.Predicate;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Dialog;
import gg.squire.nightmare.tasks.NightmareTaskBase;
import gg.squire.nightmare.tasks.NightmareManager;
import gg.squire.nightmare.tasks.NightmareManager;

@TaskDesc(name="Banking", priority=999, blocking=true)
public abstract class BankingTask
extends NightmareTaskBase {
    @Inject
    protected  g cZ;

    /*
     * WARNING - void declaration
     */
    protected boolean a(Predicate<Item> predicate, int n2) {
        void var3;
        if (F.var4(Bank.Inventory.getFirst(predicate))) {
            String[] stringArray = new String[var1[3]];
            stringArray[F.var1[0]] = var2[var1[3]];
            stringArray[F.var1[1]] = var2[var1[4]];
            Bank.Inventory.getFirst(predicate).interact(stringArray);
            return var1[1];
        }
        if (F.var5(Inventory.getFreeSlots(), (int)var3)) {
            Bank.depositInventory();
            return var1[1];
        }
        Bank.withdraw(predicate, (int)n2, (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
        return var1[1];
    }

    private static boolean var5(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var4(Object object) {
        return object != null;
    }

    private static boolean var6(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public abstract boolean bY();

    @Override
    public boolean run() {
        F var7;
        if (F.var8(this.cV.enableBanking() ? 1 : 0)) {
            return var1[0];
        }
        if (F.var9(var7.cc() ? 1 : 0)) {
            var7.cW.b(var7.ce().needsToBank());
        }
        if (F.var8(var7.cW.s() ? 1 : 0)) {
            return var1[0];
        }
        if (F.var9(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            return var1[1];
        }
        return this.bY();
    }

    private static String var10(String var11, String var12) {
        var11 = new String(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var13 = new StringBuilder();
        char[] var14 = var12.toCharArray();
        int var15 = var1[0];
        char[] var16 = var11.toCharArray();
        int var17 = var16.length;
        int var18 = var1[0];
        while (F.var5(var18, var17)) {
            char var19 = var16[var18];
            var13.append((char)(var19 ^ var14[var15 % var14.length]));
            0;
            ++var15;
            ++var18;
            0;
            if (1 != 2) continue;
            return null;
        }
        return String.valueOf(var13);
    }

        catch (Exception var25) {
            var25.printStackTrace();
            return null;
        }
    }

    private static boolean var9(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    protected boolean cd() {
        int n2;
        void var26;
        String[] stringArray = new String[var1[1]];
        stringArray[F.var1[0]] = var2[var1[0]];
        TileObject tileObject = TileObjects.getNearest((String[])stringArray);
        String[] stringArray2 = new String[var1[1]];
        stringArray2[F.var1[0]] = var2[var1[1]];
        NPC nPC = NPCs.getNearest((String[])stringArray2);
        if (F.var4(tileObject) && F.var9(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0) && !F.var6(Players.getLocal().distanceTo((Locatable)tileObject), var1[2]) || F.var4(var26) && F.var9(Reachable.isInteractable((Locatable)var26) ? 1 : 0) && F.var5(Players.getLocal().distanceTo((Locatable)var26), var1[2])) {
            n2 = var1[1];
            0;
            if (1 < 0) {
                return ((0x28 ^ 0xB) & ~(0x18 ^ 0x3B)) != 0;
            }
        } else {
            n2 = var1[0];
        }
        return n2 != 0;
    }

    protected BankingTask(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, h h2) {
        super(squireNightmareConfig, squireNightmarePlugin, h2);
    }

    private static void var27() {
        var1 = new int[7];
        F.var1[0] = (0x43 ^ 0x63) & ~(0x5D ^ 0x7D);
        F.var1[1] = 1;
        F.var1[2] = 0xD4 ^ 0xB6 ^ (0x30 ^ 0x5E);
        F.var1[3] = 2;
        F.var1[4] = 3;
        F.var1[5] = 0x38 ^ 0x5E ^ (0x42 ^ 0x20);
        F.var1[6] = 7 ^ 0xF;
    }

    protected boolean cc() {
        boolean bl;
        if (!F.var8(this.cd() ? 1 : 0) || F.var9(this.cZ.m(this.cV.bankLocation().bJ()) ? 1 : 0)) {
            bl = var1[1];
            0;
            if ((71 + 34 - 1 + 57 ^ 129 + 150 - 237 + 123) < ((0x38 ^ 0x4A ^ (0xBB ^ 0xC0)) & (4 ^ 0x5F ^ (0x2B ^ 0x79) ^ -1))) {
                return ((134 + 98 - 179 + 86 ^ 41 + 109 - 117 + 155) & (0x85 ^ 0xC7 ^ (0xF5 ^ 0x80) ^ -1)) != 0;
            }
        } else {
            bl = var1[0];
        }
        return bl;
    }

    protected BankLoadout ce() {
        return (BankLoadout)this.cV.bankLoadout().selected(BankLoadout.class);
    }

    static {
        F.var27();
        F.var28();
    }

    private static boolean var8(int n2) {
        return n2 == 0;
    }

    private static void var28() {
        var2 = new String[var1[5]];
        F.var2[F.var1[0]] = "Bank booth";
        F.var2[F.var1[1]] = "Banker";
        F.var2[F.var1[3]] = "Drink";
        F.var2[F.var1[4]] = "Eat";
    }
}

