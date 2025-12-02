/*
 * Decompiled with CFR 0.152.
 */
package net.unethicalite.api.items;

public static enum Bank.Component {
    BANK_REARRANGE_SWAP(12, 17),
    BANK_REARRANGE_INSERT(12, 19),
    BANK_WITHDRAW_ITEM(12, 24),
    BANK_WITHDRAW_NOTE(12, 26),
    BANK_QUANTITY_BUTTONS_CONTAINER(12, 26),
    BANK_QUANTITY_ONE(12, 28),
    BANK_QUANTITY_FIVE(12, 30),
    BANK_QUANTITY_TEN(12, 32),
    BANK_QUANTITY_X(12, 34),
    BANK_QUANTITY_ALL(12, 36),
    BANK_PLACEHOLDERS_BUTTON(12, 38),
    EMPTY(-1, -1);

    private final int groupId;
    private final int childId;

    private Bank.Component(int groupId, int childId) {
        this.groupId = groupId;
        this.childId = childId;
    }
}
