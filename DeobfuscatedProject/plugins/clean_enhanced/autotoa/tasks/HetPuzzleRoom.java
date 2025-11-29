/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.RegionPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.client.Static
 */
package gg.squire.autotoa.tasks;

import java.awt.Point;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.client.Static;

/**
 * Represents the different mirror puzzle room configurations in the Path of Het.
 * Each room has specific mirror positions, detection tiles, and walls that need to be broken.
 */
public enum HetPuzzleRoom {
    ROOM_1(
        new Point(38, 21),
        Set.of(new Point(29, 31), new Point(54, 29), new Point(27, 40)),
        Map.of(new Point(27, 32), 16378, new Point(43, 40), 3534),
        new Point(43, 21)
    ),
    ROOM_1_2(
        new Point(38, 21),
        Set.of(new Point(25, 32), new Point(31, 27), new Point(21, 41)),
        Map.of(new Point(27, 32), 16378, new Point(27, 40), 21500, new Point(43, 40), 3534),
        new Point(43, 21)
    ),
    ROOM_3(
        new Point(38, 38),
        Set.of(new Point(25, 29), new Point(29, 21), new Point(36, 44)),
        Map.of(new Point(54, 32), 21500, new Point(54, 44), 16378),
        new Point(36, 54)
    ),
    ROOM_3_1(
        new Point(38, 38),
        Set.of(new Point(27, 25), new Point(40, 31), new Point(40, 47)),
        Map.of(new Point(54, 32), 21500, new Point(54, 44), 16378, new Point(36, 44), 7982),
        new Point(36, 54)
    ),
    ROOM_4(
        Set.of(new Point(54, 31), new Point(50, 47), new Point(39, 33)),
        Map.of(new Point(25, 32), 21500, new Point(25, 44), 16378, new Point(39, 44), 7982),
        new Point(25, 29)
    ),
    ROOM_4_1(
        new Point(32, 29),
        Set.of(new Point(25, 32), new Point(27, 25), new Point(43, 29)),
        Map.of(new Point(25, 44), 16378, new Point(39, 44), 7982),
        new Point(25, 29)
    ),
    ROOM_5(
        new Point(29, 38),
        Set.of(new Point(25, 47), new Point(50, 50), new Point(43, 25)),
        Map.of(new Point(44, 32), 16378, new Point(44, 39), 21500, new Point(36, 39), 3534)
    ),
    ROOM_6(
        new Point(32, 36),
        Set.of(new Point(25, 32), new Point(45, 44), new Point(43, 39)),
        Map.of(new Point(25, 39), 21500)
    ),
    ROOM_7(
        Set.of(new Point(47, 45), new Point(41, 43), new Point(25, 29)),
        Map.of(new Point(27, 32), 16378, new Point(27, 36), 21500, new Point(21, 36), 3534),
        new Point(21, 21)
    ),
    ROOM_7_1(
        new Point(45, 36),
        Set.of(new Point(27, 36), new Point(44, 32), new Point(41, 29)),
        Map.of(new Point(27, 32), 16378, new Point(21, 36), 3534),
        new Point(21, 21)
    ),
    ROOM_8_1(
        new Point(38, 38),
        Set.of(new Point(32, 44), new Point(32, 29), new Point(29, 41)),
        Map.of(new Point(54, 32), 21500, new Point(54, 25), 16378, new Point(36, 25), 7982),
        new Point(36, 54)
    ),
    ROOM_8_2(
        new Point(38, 38),
        Set.of(new Point(54, 32), new Point(43, 41), new Point(29, 41)),
        Map.of(new Point(54, 25), 16378, new Point(36, 25), 7982),
        new Point(36, 54)
    );

    private static final int REGION_ID = 16378;

    private final Point standingPosition;
    private final Set<Point> detectionMirrors;
    private final Map<Point, Integer> placingMirrors;
    private final List<Point> wallsToBreak;

    HetPuzzleRoom(Point standingPosition, Set<Point> detectionMirrors, Map<Point, Integer> placingMirrors, Point... wallsToBreak) {
        this.standingPosition = standingPosition;
        this.detectionMirrors = detectionMirrors;
        this.placingMirrors = placingMirrors;
        this.wallsToBreak = List.of(wallsToBreak);
    }

    HetPuzzleRoom(Set<Point> detectionMirrors, Map<Point, Integer> placingMirrors, Point... wallsToBreak) {
        this.standingPosition = null;
        this.detectionMirrors = detectionMirrors;
        this.placingMirrors = placingMirrors;
        this.wallsToBreak = List.of(wallsToBreak);
    }

    /**
     * Gets the recommended standing position for this room.
     * @return the standing position, or null if not applicable
     */
    public Point getStandingPosition() {
        return this.standingPosition;
    }

    /**
     * Gets the set of tiles where mirrors should be detected.
     * @return set of detection mirror positions
     */
    public Set<Point> getDetectionMirrors() {
        return this.detectionMirrors;
    }

    /**
     * Gets the map of positions where mirrors should be placed.
     * Keys are positions, values are object IDs.
     * @return map of placing mirror positions to object IDs
     */
    public Map<Point, Integer> getPlacingMirrors() {
        return this.placingMirrors;
    }

    /**
     * Gets the list of wall positions that need to be broken.
     * @return list of wall positions
     */
    public List<Point> getWallsToBreak() {
        return this.wallsToBreak;
    }

    /**
     * Converts a world point to a region point.
     * @param worldPoint the world point
     * @return the corresponding region point
     */
    public Point toRegionPoint(WorldPoint worldPoint) {
        RegionPoint regionPoint = RegionPoint.fromWorld(worldPoint);
        return new Point(regionPoint.getX(), regionPoint.getY());
    }

    /**
     * Converts a region point to a world point.
     * @param point the region point
     * @return the corresponding world point
     */
    public WorldPoint toWorldPoint(Point point) {
        Client client = Static.getClient();
        WorldPoint worldPoint = Players.getLocal().getWorldLocation();
        RegionPoint regionPoint = new RegionPoint(point.x, point.y, client.getPlane(), REGION_ID);
        return WorldPoint.toLocalInstance(client, regionPoint.toWorld())
            .stream()
            .min(Comparator.comparingInt(wp -> wp.distanceTo2D(worldPoint)))
            .orElse(null);
    }

    /**
     * Checks if a world point is a mirror placement location.
     * @param worldPoint the world point to check
     * @return true if this is a mirror placement location
     */
    public boolean isMirrorPlacementTile(WorldPoint worldPoint) {
        Point regionPoint = toRegionPoint(worldPoint);
        return this.placingMirrors.containsKey(regionPoint);
    }

    /**
     * Detects the current puzzle room based on visible mirrors.
     * @return the detected HetPuzzleRoom, or null if not found
     */
    public static HetPuzzleRoom detectCurrentRoom() {
        // Get all mirror objects in the room
        List<WorldPoint> mirrorLocations = TileObjects.getAll(obj ->
            obj.getName().equals("Mirror") && obj.hasAction("Pick-up")
        ).stream()
            .map(Locatable::getWorldLocation)
            .map(RegionPoint::fromWorld)
            .map(rp -> new Point(rp.getX(), rp.getY()))
            .collect(Collectors.toList());

        // Try to match with a room configuration
        for (HetPuzzleRoom room : values()) {
            boolean allDetected = true;
            for (Point detectionPoint : room.getDetectionMirrors()) {
                if (!mirrorLocations.contains(detectionPoint)) {
                    allDetected = false;
                    break;
                }
            }
            if (allDetected) {
                return room;
            }
        }

        return null;
    }
}
