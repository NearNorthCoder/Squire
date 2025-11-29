/*
 * Deobfuscated TOA Warden Obelisk Enum
 * Represents the elemental obelisks during Warden fight
 */
package gg.squire.autotoa.tasks;

import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;
import java.util.Collection;

/**
 * Represents the four elemental obelisks during the Warden phase of TOA.
 *
 * During the Warden fight, players must attack specific obelisks
 * based on the attack type being used. Each obelisk has:
 * - A unique object ID
 * - Fixed region coordinates within the arena
 */
public enum WardenObelisk {
    /** Death obelisk - south west position */
    DEATH(45791, 24, 26),

    /** Fire obelisk - south east position */
    FIRE(45792, 36, 26),

    /** Lightning obelisk - north west position */
    LIGHTNING(45793, 24, 38),

    /** Air obelisk - north east position */
    AIR(45794, 36, 38);

    /** Object ID for this obelisk */
    private final int objectId;

    /** Region X coordinate */
    private final int regionX;

    /** Region Y coordinate */
    private final int regionY;

    WardenObelisk(int objectId, int regionX, int regionY) {
        this.objectId = objectId;
        this.regionX = regionX;
        this.regionY = regionY;
    }

    /**
     * Get the object ID for this obelisk
     */
    public int getObjectId() {
        return this.objectId;
    }

    /**
     * Get the region X coordinate
     */
    public int getRegionX() {
        return this.regionX;
    }

    /**
     * Get the region Y coordinate
     */
    public int getRegionY() {
        return this.regionY;
    }

    /**
     * Get the world point for this obelisk in the current instance
     */
    public WorldPoint getWorldPoint(Client client) {
        RegionPoint regionPoint = new RegionPoint(this.regionX, this.regionY, 0, 1);
        Collection<WorldPoint> instances = WorldPoint.toLocalInstance(client, regionPoint.toWorld());
        return instances.stream().findFirst().orElse(null);
    }

    /**
     * Find an obelisk by its object ID
     */
    public static WardenObelisk fromObjectId(int objectId) {
        for (WardenObelisk obelisk : values()) {
            if (obelisk.objectId == objectId) {
                return obelisk;
            }
        }
        return null;
    }

    /**
     * Find the nearest obelisk to a given world point
     */
    public static WardenObelisk findNearest(Client client, WorldPoint playerLocation) {
        WardenObelisk nearest = null;
        int minDistance = Integer.MAX_VALUE;

        for (WardenObelisk obelisk : values()) {
            WorldPoint obeliskLocation = obelisk.getWorldPoint(client);
            if (obeliskLocation == null) {
                continue;
            }

            int distance = obeliskLocation.distanceTo(playerLocation);
            if (distance < minDistance) {
                nearest = obelisk;
                minDistance = distance;
            }
        }

        return nearest;
    }
}
