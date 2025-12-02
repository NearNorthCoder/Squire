/*
 * Decompiled with CFR 0.152.
 */
package net.unethicalite.api.game;

import net.unethicalite.api.game.Vars;

public static enum House.Style {
    BASIC_WOOD(1, 7513),
    BASIC_STONE(2, 7513),
    WHITEWASHED_STONE(3, 7513),
    FREMNERIK_STYLE_WOOD(4, 7513),
    TROPICAL_WOOD(5, 7769),
    FANCY_STONE(6, 7769),
    DEATHLY_MANSION(7, 7769),
    COSY_CABIN(8, 7769),
    TWISTED_THEME(10, 7769),
    HOSIDIUS_HOUSE(11, 7769);

    private final int varbit;
    private final int regionId;

    private House.Style(int varbit, int regionId) {
        this.varbit = varbit;
        this.regionId = regionId;
    }

    static House.Style getCurrent() {
        int var = Vars.getBit(2188);
        for (House.Style value : House.Style.values()) {
            if (value.varbit != var) continue;
            return value;
        }
        return BASIC_WOOD;
    }

    public int getVarbit() {
        return this.varbit;
    }

    public int getRegionId() {
        return this.regionId;
    }
}
