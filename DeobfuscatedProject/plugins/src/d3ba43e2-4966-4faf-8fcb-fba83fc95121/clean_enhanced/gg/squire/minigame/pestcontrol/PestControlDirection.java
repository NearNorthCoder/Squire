package gg.squire.minigame.pestcontrol;

/**
 * Represents the three boat/lander directions in Pest Control minigame.
 * Each lander has a different direction and corresponds to different combat level requirements.
 */
public enum PestControlDirection {
    /**
     * East lander
     */
    EAST("East"),

    /**
     * West lander
     */
    WEST("West"),

    /**
     * South lander (Veteran)
     */
    SOUTH("South");

    private final String directionName;

    /**
     * Creates a new direction enum value.
     *
     * @param directionName The display name of the direction
     */
    PestControlDirection(String directionName) {
        this.directionName = directionName;
    }

    /**
     * Gets the display name of this direction.
     *
     * @return The direction name (e.g., "East", "West", "South")
     */
    public String getDirectionName() {
        return this.directionName;
    }
}
