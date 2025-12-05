package gg.squire.mining;

import net.runelite.api.coords.WorldPoint;
import java.util.Arrays;
import java.util.List;

/**
 * Enum representing different areas within the Motherlode Mine.
 */
public enum MotherlodeMineArea {
    UPPER_FLOOR(
        new WorldPoint(3755, 5983, 0),
        new WorldPoint(3758, 5981, 0),
        new WorldPoint(3771, 5994, 0),
        new WorldPoint(3758, 5981, 0),
        new WorldPoint(3775, 5981, 0),
        new WorldPoint(3771, 5981, 0),
        new WorldPoint(3758, 5990, 0),
        new WorldPoint(3758, 5979, 0),
        new WorldPoint(3759, 5997, 0),
        new WorldPoint(3759, 5994, 0)
    ),
    SOUTH_WEST(
        new WorldPoint(3747, 5679, 0),
        new WorldPoint(3747, 5677, 0),
        new WorldPoint(3747, 5685, 0),
        new WorldPoint(3747, 5679, 0),
        new WorldPoint(3729, 5678, 0),
        new WorldPoint(3729, 5675, 0),
        new WorldPoint(3729, 5670, 0),
        new WorldPoint(3729, 5685, 0),
        new WorldPoint(3738, 5675, 0),
        new WorldPoint(3740, 5679, 0),
        new WorldPoint(3745, 5675, 0),
        new WorldPoint(3740, 5983, 0)
    );

    private final WorldPoint[] waypoints;

    MotherlodeMineArea(WorldPoint... waypoints) {
        this.waypoints = waypoints;
    }

    /**
     * Gets the waypoints for this MLM area.
     *
     * @return array of waypoints
     */
    public WorldPoint[] getWaypoints() {
        return waypoints;
    }

    /**
     * Gets the waypoints as a list.
     *
     * @return list of waypoints
     */
    public List<WorldPoint> getWaypointList() {
        return Arrays.asList(getWaypoints());
    }
}
