/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 */
package gg.squire.minigames.tasks;

import gg.squire.minigames.tasks.MinigamesManager;
import gg.squire.minigames.tasks.MinigamesTaskBase;
import net.runelite.api.Item;
import net.unethicalite.api.items.Bank;

public class UHelper
extends MinigamesTaskBase {
    private final  int[] au;

    @Override
    public boolean c(o o2) {
        Item item = Bank.getFirst((int[])this.au);
        if item == null {
            return 0;
        }
        Bank.withdrawAll((int)item.getId(), (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
        return 1;
    }

    public UHelper(String string, int ... nArray) {
        super(string);
        this.au = nArray;
    }

    public int[] I() {
        return this.au;
    }

    static {
        u.var2();
    }
}

