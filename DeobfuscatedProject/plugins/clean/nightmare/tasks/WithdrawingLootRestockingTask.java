/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.nightmare.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import gg.squire.nightmare.tasks.NightmareTaskBase;
import gg.squire.nightmare.tasks.NightmareManager;

@TaskDesc(name="Withdrawing loot (Restocking)", priority=1346674, blocking=true)
public class WithdrawingLootRestockingTask
extends NightmareTaskBase {

    static {
        V.lIIIlllIlIIIIlI();
        V.lIIIlllIlIIIIIl();
    }

    private static void lIIIlllIlIIIIIl() {
        llllIIIIIIlI = new String[llllIIIIIIll[1]];
        V.llllIIIIIIlI[V.llllIIIIIIll[0]] = "[WithdrawSellable]: No sellable items in bank, moving on.";
    }

    @Inject
    protected WithdrawingLootRestockingTask(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, h h2) {
        super(squireNightmareConfig, squireNightmarePlugin, h2);
    }

    private static boolean lIIIlllIlIIIlII(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean ci() {
        V var1;
        if (V.lIIIlllIlIIIIll(this.cW.D() ? 1 : 0)) {
            return llllIIIIIIll[0];
        }
        if (V.lIIIlllIlIIIIll(Inventory.isFull() ? 1 : 0)) {
            return llllIIIIIIll[0];
        }
        if (V.lIIIlllIlIIIlII(var1.cn() ? 1 : 0)) {
            return llllIIIIIIll[0];
        }
        if (V.lIIIlllIlIIIlII(Bank.isOpen() ? 1 : 0)) {
            Bank.open();

            return llllIIIIIIll[1];
        }
        if (V.lIIIlllIlIIIlII(Inventory.contains(item -> this.ca().contains(item.getId())) ? 1 : 0)) {
            Bank.withdraw(item -> this.ca().contains(item.getId()), (int)llllIIIIIIll[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
            return llllIIIIIIll[1];
        }
        if (V.lIIIlllIlIIIlII(Bank.contains(item -> dt.contains(item.getId())) ? 1 : 0)) {
            var1.cW.f(llllIIIIIIll[1]);
            Log.info((String)llllIIIIIIlI[llllIIIIIIll[0]]);
            return llllIIIIIIll[1];
        }
        if (V.lIIIlllIlIIIlII(Equipment.getAll().isEmpty() ? 1 : 0) && V.lIIIlllIlIIIlII(Inventory.isEmpty() ? 1 : 0)) {
            Bank.depositInventory();
            Bank.depositEquipment();
            return llllIIIIIIll[1];
        }
        Bank.withdraw(item -> dt.contains(item.getId()), (int)llllIIIIIIll[2], (Bank.WithdrawMode)Bank.WithdrawMode.NOTED);
        return llllIIIIIIll[1];
    }

    private static boolean lIIIlllIlIIIIll(int n2) {
        return n2 != 0;
    }
}

