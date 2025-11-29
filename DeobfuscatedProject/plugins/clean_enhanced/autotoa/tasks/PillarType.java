/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  net.runelite.api.Client
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.RegionPoint
 */
package gg.squire.autotoa.tasks;

import java.util.Collection;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;

/**
 * Represents the four pillar types in TOA boss rooms.
 * Each pillar type has specific object IDs and region coordinates.
 */
public enum PillarType {
    DEATH(46847, 33, 25),
    FIRE(46910, 47, 25),
    LIGHTNING(45039, 33, 22),
    AIR(49087, 47, 22);

    private final int objectId;
    private final int regionX;
    private final int regionY;

    PillarType(int objectId, int regionX, int regionY) {
        this.objectId = objectId;
        this.regionX = regionX;
        this.regionY = regionY;
    }

    /**
     * Gets the object ID for this pillar type.
     * @return the pillar's object ID
     */
    public int getObjectId() {
        return this.objectId;
    }

    /**
     * Finds a pillar type by its object ID.
     * @param objectId the object ID to search for
     * @return the matching PillarType, or null if not found
     */
    public static PillarType fromObjectId(int objectId) {
        for (PillarType pillarType : values()) {
            if (pillarType.getObjectId() == objectId) {
                return pillarType;
            }
        }
        return null;
    }

    /**
     * Gets the world point for this pillar in the current instance.
     * @param client the game client
     * @return the WorldPoint of this pillar, or null if not found
     */
    public WorldPoint getWorldPoint(Client client) {
        RegionPoint regionPoint = new RegionPoint(this.regionX, this.regionY, 1, Integer.MAX_VALUE);
        Collection<WorldPoint> collection = WorldPoint.toLocalInstance(client, regionPoint.toWorld());
        return collection.stream().findFirst().orElse(null);
    }

    /**
     * Finds the closest pillar type to a given world point.
     * @param client the game client
     * @param worldPoint the reference point
     * @return the closest PillarType, or null if none found
     */
    public static PillarType getClosest(Client client, WorldPoint worldPoint) {
        PillarType closest = null;
        int minDistance = Integer.MAX_VALUE;

        for (PillarType pillarType : values()) {
            WorldPoint pillarPoint = pillarType.getWorldPoint(client);
            if (pillarPoint == null) {
                continue;
            }

            int distance = pillarPoint.distanceTo(worldPoint);
            if (distance < minDistance) {
                closest = pillarType;
                minDistance = distance;
            }
        }

        return closest;
    }
}
