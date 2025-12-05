package gg.squire.mining;

import net.runelite.api.Point;
import net.runelite.api.coords.WorldPoint;

/**
 * Enum representing gem rock mining areas and their configurations.
 */
public enum GemRockArea {
    WEST_FOUR(
        new Point(3047, 9765),
        new WorldPoint(3045, 9768, 0),
        new WorldPoint(3043, 9768, 0),
        new WorldPoint(3036, 9765, 0),
        new WorldPoint(3036, 9767, 0)
    ),
    WEST_TWO(
        new Point(3039, 9765),
        new WorldPoint(3036, 9765, 0),
        new WorldPoint(3047, 9767, 0)
    );

    private final Point standingPoint;
    private final WorldPoint[] rockLocations;

    GemRockArea(Point standingPoint, WorldPoint... rockLocations) {
        this.standingPoint = standingPoint;
        this.rockLocations = rockLocations;
    }

    /**
     * Checks if a given WorldPoint matches any of the rock locations in this area.
     *
     * @param worldPoint the point to check
     * @return true if the point matches a rock location
     */
    public boolean containsRock(WorldPoint worldPoint) {
        for (WorldPoint rock : rockLocations) {
            if (rock.equals(worldPoint)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Gets the standing point for this area.
     *
     * @return the standing point as a WorldPoint
     */
    public WorldPoint getStandingPoint() {
        return new WorldPoint(standingPoint.getX(), standingPoint.getY(), 0);
    }

    /**
     * Gets the rock locations for this area.
     *
     * @return array of rock locations
     */
    public WorldPoint[] getRockLocations() {
        return rockLocations;
    }
}
