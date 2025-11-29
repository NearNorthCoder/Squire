/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 */
package gg.squire.minigames.tasks;

import gg.squire.minigames.tasks.OHelper;
import gg.squire.minigames.tasks.MinigamesTaskBase;
import net.runelite.api.Item;
import net.unethicalite.api.items.Bank;

public class UHelper
extends MinigamesTaskBase {
    private final  int[] au;

    @Override
    public boolean c(o o2) {
        Item item = Bank.getFirst((int[])this.au);
        if (u.llIlIIIIIIlIll(item)) {
            return lIIlllIIIllI[0];
        }
        Bank.withdrawAll((int)item.getId(), (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
        return lIIlllIIIllI[1];
    }

    public UHelper(String string, int ... nArray) {
        super(string);
        this.au = nArray;
    }

    private static boolean llIlIIIIIIlIll(Object object) {
        return object == null;
    }

    public int[] I() {
        return this.au;
    }

    static {
        u.llIlIIIIIIlIlI();
    }

}

