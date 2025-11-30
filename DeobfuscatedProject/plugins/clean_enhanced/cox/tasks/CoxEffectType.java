/*
 * Decompiled with CFR 0.152.
 * Deobfuscated for Squire COX Plugin
 *
 * CoxEffectType - Represents different effect types in Chambers of Xeric.
 * Each effect type has an associated tick duration.
 */
package gg.squire.cox.tasks;

/**
 * Enumeration of effect types in Chambers of Xeric (COX).
 * These represent different attack or status effects that can be applied
 * during the raid, particularly during the Olm boss fight.
 *
 * <p>Each effect type has an associated tick duration that determines
 * how long the effect lasts or how often it triggers.
 */
public enum CoxEffectType {

    /** Burn effect - typically from Olm's fire attack */
    BURN(1),

    /** Acid effect - from Olm's acid attack pools */
    ACID(3),

    /** Teleport effect - from Olm's teleport attack */
    TELEPORT(5);

    /** The tick duration associated with this effect type */
    private final int tickDuration;

    /**
     * Creates a new effect type with the specified tick duration.
     *
     * @param tickDuration the duration in game ticks
     */
    CoxEffectType(int tickDuration) {
        this.tickDuration = tickDuration;
    }

    /**
     * Gets the tick duration for this effect type.
     *
     * @return the duration in game ticks
     */
    public int getTickDuration() {
        return this.tickDuration;
    }

    /**
     * @deprecated Use {@link #getTickDuration()} instead
     */
    @Deprecated
    public int bB() {
        return getTickDuration();
    }
}
