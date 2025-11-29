/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.CoxManager;

/**
 * RaidScoutedEvent - Event fired when a raid layout has been scouted.
 *
 * This event is triggered after successfully scouting a Chambers of Xeric raid layout,
 * indicating whether this is the first time scouting or a subsequent scout.
 */
public final class RaidScoutedEvent {
    private final a raid;
    private final boolean firstScout;

    static {
        RaidScoutedEvent.initializeMapper();
    }

    /**
     * Creates a new raid scouted event.
     *
     * @param raid the raid that was scouted
     * @param firstScout true if this is the first scout, false if re-scouting
     */
    public RaidScoutedEvent(a raid, boolean firstScout) {
        this.raid = raid;
        this.firstScout = firstScout;
    }

    /**
     * Gets the raid that was scouted.
     *
     * @return the raid instance
     */
    public a getRaid() {
        return this.raid;
    }

    /**
     * Checks if this is the first time scouting the raid.
     *
     * @return true if this is the first scout, false otherwise
     */
    public boolean isFirstScout() {
        return this.firstScout;
    }

    @Override
    public String toString() {
        return "RaidScoutedEvent(raid=" + String.valueOf(this.getRaid())
            + ", firstScout=" + this.isFirstScout() + ")";
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = result * 31 + (this.isFirstScout() ? 1231 : 1237);
        result = result * 31 + (this.getRaid() == null ? 0 : this.getRaid().hashCode());
        return result;
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof RaidScoutedEvent)) {
            return false;
        }
        RaidScoutedEvent other = (RaidScoutedEvent) object;
        if (this.isFirstScout() != other.isFirstScout()) {
            return false;
        }
        a thisRaid = this.getRaid();
        a otherRaid = other.getRaid();
        if (thisRaid == null) {
            return otherRaid == null;
        }
        return thisRaid.equals(otherRaid);
    }

    /**
     * Initializes the mapper (placeholder for generated code).
     */
    private static void initializeMapper() {
        // Generated initialization code
    }
}
