/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  net.runelite.api.Actor
 *  net.runelite.api.Prayer
 */
package gg.squire.autotoa.tasks;

import net.runelite.api.Actor;
import net.runelite.api.Prayer;

/**
 * Represents a baboon attack in the Tombs of Amascut.
 * Used by the Babboon prayer handler to track which baboon is attacking
 * and what prayer should be used against it.
 */
final class BaboonAttack {
    private final Prayer prayerToUse;
    private final Actor baboon;

    /**
     * Creates a new baboon attack record.
     *
     * @param baboon The baboon NPC that is attacking
     * @param prayer The prayer that should be used against this attack
     */
    public BaboonAttack(Actor baboon, Prayer prayer) {
        this.baboon = baboon;
        this.prayerToUse = prayer;
    }

    /**
     * Gets the prayer that should be used against this baboon's attack.
     *
     * @return The recommended prayer
     */
    public Prayer getPrayer() {
        return this.prayerToUse;
    }

    /**
     * Gets the baboon NPC that is attacking.
     *
     * @return The attacking baboon
     */
    public Actor getBaboon() {
        return this.baboon;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BaboonAttack)) {
            return false;
        }

        BaboonAttack other = (BaboonAttack) obj;

        // Compare baboons
        Actor thisBaboon = this.getBaboon();
        Actor otherBaboon = other.getBaboon();
        if (thisBaboon == null) {
            if (otherBaboon != null) {
                return false;
            }
        } else if (!thisBaboon.equals(otherBaboon)) {
            return false;
        }

        // Compare prayers
        Prayer thisPrayer = this.getPrayer();
        Prayer otherPrayer = other.getPrayer();
        if (thisPrayer == null) {
            if (otherPrayer != null) {
                return false;
            }
        } else if (!thisPrayer.equals(otherPrayer)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "BaboonAttack(baboon=" + this.getBaboon() +
               ", prayer=" + this.getPrayer() + ")";
    }

    @Override
    public int hashCode() {
        final int prime = 59;
        int result = 1;

        Actor baboon = this.getBaboon();
        result = result * prime + (baboon == null ? 43 : baboon.hashCode());

        Prayer prayer = this.getPrayer();
        result = result * prime + (prayer == null ? 43 : prayer.hashCode());

        return result;
    }
}
