/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 */
package net.unethicalite.api.items;

import net.runelite.api.Item;
import net.unethicalite.api.items.Bank;

private static enum Bank.WithdrawOption {
    ONE(2),
    FIVE(3),
    TEN(4),
    LAST_QUANTITY(5),
    X(6),
    ALL(7),
    ALL_BUT_1(8);

    private final int menuIndex;

    private Bank.WithdrawOption(int menuIndex) {
        this.menuIndex = menuIndex;
    }

    public static Bank.WithdrawOption ofAmount(Item item, int amount) {
        if (amount <= 1) {
            return ONE;
        }
        if (amount == 5) {
            return FIVE;
        }
        if (amount == 10) {
            return TEN;
        }
        if (amount > item.getQuantity()) {
            return ALL;
        }
        return X;
    }

    public int getMenuIndex() {
        if (Bank.getQuantityMode() == Bank.QuantityMode.ONE && this == ONE) {
            return 1;
        }
        return this.menuIndex;
    }
}
