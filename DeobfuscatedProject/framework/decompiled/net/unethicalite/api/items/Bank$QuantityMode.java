/*
 * Decompiled with CFR 0.152.
 */
package net.unethicalite.api.items;

import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;

public static enum Bank.QuantityMode {
    ONE(Bank.Component.BANK_QUANTITY_ONE, 0),
    FIVE(Bank.Component.BANK_QUANTITY_FIVE, 1),
    TEN(Bank.Component.BANK_QUANTITY_TEN, 2),
    X(Bank.Component.BANK_QUANTITY_X, 3),
    ALL(Bank.Component.BANK_QUANTITY_ALL, 4),
    UNKNOWN(Bank.Component.EMPTY, -1);

    private final Bank.Component widget;
    private final int bitValue;

    private Bank.QuantityMode(Bank.Component widget, int bitValue) {
        this.widget = widget;
        this.bitValue = bitValue;
    }

    public static Bank.QuantityMode getCurrent() {
        switch (Vars.getBit(6590)) {
            case 0: {
                return ONE;
            }
            case 1: {
                return FIVE;
            }
            case 2: {
                return TEN;
            }
            case 3: {
                return X;
            }
            case 4: {
                return ALL;
            }
        }
        return UNKNOWN;
    }
}
