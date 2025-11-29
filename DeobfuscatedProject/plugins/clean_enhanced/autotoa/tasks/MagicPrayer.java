/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package gg.squire.autotoa.tasks;

import net.runelite.api.Prayer;

/**
 * Represents magic-boosting prayers available in Tombs of Amascut.
 */
public enum MagicPrayer {
    AUGURY(Prayer.AUGURY),
    MYSTIC_MIGHT(Prayer.MYSTIC_MIGHT);

    private final Prayer prayer;

    MagicPrayer(Prayer prayer) {
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
