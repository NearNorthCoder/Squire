/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package gg.squire.autotoa.tasks;

import net.runelite.api.Prayer;

/**
 * Represents ranged-boosting prayers available in Tombs of Amascut.
 */
public enum RangePrayer {
    RIGOUR(Prayer.RIGOUR),
    EAGLE_EYE(Prayer.EAGLE_EYE);

    private final Prayer prayer;

    RangePrayer(Prayer prayer) {
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
