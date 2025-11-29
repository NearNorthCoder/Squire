/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package gg.squire.autotoa.tasks;

import net.runelite.api.Prayer;

/**
 * Represents melee-boosting prayers available in Tombs of Amascut.
 */
public enum MeleePrayer {
    PIETY(Prayer.PIETY),
    CHIVALRY(Prayer.CHIVALRY),
    ULTIMATE_STRENGTH(Prayer.ULTIMATE_STRENGTH);

    private final Prayer prayer;

    MeleePrayer(Prayer prayer) {
        this.prayer = prayer;
    }

    /**
     * Gets the RuneLite Prayer enum value.
     * @return the mapped Prayer object
     */
    public Prayer getPrayer() {
        return this.prayer;
    }
}
