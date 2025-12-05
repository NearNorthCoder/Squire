package gg.squire.combat;

import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;

/**
 * Enum representing different locations where blue dragons can be found and killed.
 * Each location has a specific world point, area, and safe spot for combat.
 */
public enum DragonLocation {
    /**
     * Heroes' Guild blue dragon location
     */
    HEROS(
        "Heroes' Guild Blue Dragons",
        new WorldPoint(1910, 9954, 0),
        new WorldArea(1899, 9950, 13, 8, 0),
        new WorldPoint(1908, 9954, 0)
    ),

    /**
     * Taverley Dungeon blue dragon location
     */
    TAVERLEY_DUNGEON(
        "Taverley Dungeon Blue Dragons",
        new WorldPoint(2911, 9775, 0),
        new WorldArea(2899, 9765, 14, 19, 0),
        new WorldPoint(2910, 9783, 0)
    ),

    /**
     * Myths' Guild blue dragon location
     */
    MYTHS_GUILD(
        "Myths Guild Blue Dragons",
        new WorldPoint(1951, 9015, 1),
        new WorldArea(1933, 9005, 17, 32, 1),
        new WorldPoint(1958, 9009, 1)
    );

    private final String locationName;
    private final WorldPoint location;
    private final WorldArea dragonArea;
    private final WorldPoint safeSpot;

    /**
     * Constructor for DragonLocation enum.
     *
     * @param locationName Display name of the location
     * @param location Central world point of the location
     * @param dragonArea World area where dragons spawn
     * @param safeSpot Safe spot world point for combat
     */
    DragonLocation(String locationName, WorldPoint location, WorldArea dragonArea, WorldPoint safeSpot) {
        this.locationName = locationName;
        this.location = location;
        this.dragonArea = dragonArea;
        this.safeSpot = safeSpot;
    }

    /**
     * Gets the central location world point.
     *
     * @return WorldPoint of the location
     */
    public WorldPoint getLocation() {
        return this.location;
    }

    /**
     * Gets the area where dragons spawn.
     *
     * @return WorldArea containing dragons
     */
    public WorldArea getDragonArea() {
        return this.dragonArea;
    }

    /**
     * Gets the safe spot for this location.
     *
     * @return WorldPoint of the safe spot
     */
    public WorldPoint getSafeSpot() {
        return this.safeSpot;
    }

    /**
     * Gets the display name of this location.
     *
     * @return String name of the location
     */
    public String getLocationName() {
        return this.locationName;
    }
}
