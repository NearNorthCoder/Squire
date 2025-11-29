/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.autotoa.tasks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.runelite.api.coords.WorldPoint;

/**
 * PathfindingHelper - Finds optimal paths through a set of waypoints.
 *
 * This class implements a pathfinding algorithm that:
 * - Takes a map of WorldPoints with boolean flags (visited/available)
 * - Finds the shortest path that visits all available points
 * - Uses recursive backtracking with depth limiting
 * - Ensures points are connected within distance threshold
 *
 * The algorithm considers points "connected" if they are within 2 tiles
 * of each other (Manhattan distance) and either have different X or Y coordinates.
 */
public class PathfindingHelper {

    /**
     * Algorithm constants.
     * [0] = 25 (max depth/path length limit)
     * [1] = 2 (maximum connection distance between points)
     * [2] = 1 (boolean true as int)
     * [3] = 0 (boolean false as int)
     * [4] = Integer.MAX_VALUE (initial "best path" size for comparison)
     */
    private static int[] CONSTANTS;

    /** Map of waypoints to their visited status */
    private final Map<WorldPoint, Boolean> waypointMap;

    /** The best (shortest) path found so far */
    private List<WorldPoint> bestPath;

    /**
     * Checks if first value is less than second value.
     *
     * @param value1 First value
     * @param value2 Second value
     * @return true if value1 < value2
     */
    private static boolean isLessThan(int value1, int value2) {
        return value1 < value2;
    }

    /**
     * Finds the optimal path through all available waypoints.
     *
     * Uses recursive backtracking to find the shortest path that visits
     * all unvisited waypoints in the map.
     *
     * @return List of waypoints in optimal visiting order, or empty list if none found
     */
    public List<WorldPoint> findOptimalPath() {
        // Check if all waypoints are already visited
        if (isTrue(allWaypointsVisited(this.waypointMap) ? 1 : 0)) {
            return Collections.emptyList();
        }

        // Try starting from each unvisited waypoint
        Iterator<WorldPoint> startPointIterator = this.waypointMap.keySet().iterator();

        while (isTrue(startPointIterator.hasNext() ? 1 : 0)) {
            WorldPoint startPoint = startPointIterator.next();

            // Create initial path with this start point
            List<WorldPoint> currentPath = new ArrayList<WorldPoint>();
            currentPath.add(startPoint);

            // Recursively build path from this start point
            List<WorldPoint> candidatePath = this.findPathRecursive(
                this.waypointMap,
                startPoint,
                currentPath,
                CONSTANTS[0]
            );

            // Skip if no valid path found from this start
            if (isTrue(candidatePath.isEmpty() ? 1 : 0)) {
                continue;
            }

            // Update best path if this is shorter (or first valid path)
            if (!isTrue(this.bestPath.isEmpty() ? 1 : 0) ||
                isGreaterThan(this.bestPath.size(), candidatePath.size())) {
                this.bestPath = candidatePath;
            }
        }

        return this.bestPath;
    }

    /**
     * Checks if all waypoints in the map have been visited.
     *
     * @param waypointMap Map of waypoints to visited status
     * @return true if all waypoints are marked as visited
     */
    private boolean allWaypointsVisited(Map<WorldPoint, Boolean> waypointMap) {
        Iterator<Boolean> visitedIterator = waypointMap.values().iterator();

        while (isTrue(visitedIterator.hasNext() ? 1 : 0)) {
            boolean isVisited = visitedIterator.next();

            // If any waypoint is not visited, return false
            if (isFalse(isVisited ? 1 : 0)) {
                return CONSTANTS[3] != 0; // false
            }
        }

        return CONSTANTS[2] != 0; // true
    }

    /**
     * Recursively finds a path through remaining waypoints.
     *
     * @param waypointMap Current state of waypoint visited flags
     * @param currentPoint The current position in the path
     * @param currentPath The path built so far
     * @param depthLimit Maximum depth to search (prevents infinite recursion)
     * @return The best path found, or empty list if none
     */
    private List<WorldPoint> findPathRecursive(
        Map<WorldPoint, Boolean> waypointMap,
        WorldPoint currentPoint,
        List<WorldPoint> currentPath,
        int depthLimit
    ) {
        // Stop if we've exceeded the depth limit
        if (isGreaterThan(currentPath.size(), depthLimit)) {
            return Collections.emptyList();
        }

        // Create a copy of the waypoint map with current point marked as visited
        HashMap<WorldPoint, Boolean> updatedMap = new HashMap<WorldPoint, Boolean>();
        Iterator<WorldPoint> mapIterator = waypointMap.keySet().iterator();

        while (isTrue(mapIterator.hasNext() ? 1 : 0)) {
            WorldPoint point = mapIterator.next();

            // Check if this point is reachable from current point
            if (isWithinDistance(point.distanceTo2D(currentPoint), CONSTANTS[1]) &&
                (!areEqual(point.getX(), currentPoint.getX()) ||
                 notEqual(point.getY(), currentPoint.getY()))) {

                // Mark as visited if it's our current point
                boolean visited = isFalse(waypointMap.get(point) ? 1 : 0)
                    ? CONSTANTS[2] != 0  // true
                    : CONSTANTS[3] != 0; // false

                updatedMap.put(point, visited);
            } else {
                // Keep existing visited status
                updatedMap.put(point, waypointMap.get(point));
            }
        }

        // If all waypoints are visited, we found a complete path
        if (isTrue(allWaypointsVisited(updatedMap) ? 1 : 0)) {
            return currentPath;
        }

        // Get unvisited waypoints and shuffle for variation
        List<WorldPoint> unvisitedPoints = new ArrayList<WorldPoint>(updatedMap.keySet());
        Collections.shuffle(unvisitedPoints);

        // Determine the best path size to beat
        int targetPathSize;
        if (isTrue(this.bestPath.isEmpty() ? 1 : 0)) {
            targetPathSize = CONSTANTS[4]; // Integer.MAX_VALUE
        } else {
            targetPathSize = this.bestPath.size();
        }

        // If current path is already too long, abort this branch
        if (isGreaterOrEqual(currentPath.size(), targetPathSize)) {
            return this.bestPath;
        }

        // Try extending the path to each unvisited point
        Iterator<WorldPoint> candidateIterator = unvisitedPoints.iterator();

        while (isTrue(candidateIterator.hasNext() ? 1 : 0)) {
            WorldPoint candidatePoint = candidateIterator.next();

            // Skip if this is the current point
            if (isTrue(candidatePoint.equals(currentPoint) ? 1 : 0)) {
                continue;
            }

            // Build new path including this candidate
            ArrayList<WorldPoint> extendedPath = new ArrayList<WorldPoint>(currentPath);
            extendedPath.add(candidatePoint);

            // Recursively find path from this new point
            List<WorldPoint> resultPath = this.findPathRecursive(
                updatedMap,
                candidatePoint,
                extendedPath,
                depthLimit
            );

            // Skip if no valid path found
            if (isTrue(resultPath.isEmpty() ? 1 : 0)) {
                continue;
            }

            // Update best path if this one is better
            if (isLessThan(resultPath.size(), targetPathSize)) {
                this.bestPath = resultPath;
            }
        }

        return this.bestPath;
    }

    /**
     * Checks if first value is greater than second value.
     *
     * @param value1 First value
     * @param value2 Second value
     * @return true if value1 > value2
     */
    private static boolean isGreaterThan(int value1, int value2) {
        return value1 > value2;
    }

    /**
     * Creates a new pathfinding helper.
     *
     * @param waypointMap Map of waypoints to their initial visited status
     */
    public PathfindingHelper(Map<WorldPoint, Boolean> waypointMap) {
        this.bestPath = new ArrayList<WorldPoint>();
        this.waypointMap = waypointMap;
    }

    /**
     * Checks if an integer represents a false boolean value.
     *
     * @param value The integer to check
     * @return true if value is zero
     */
    private static boolean isFalse(int value) {
        return value == 0;
    }

    /**
     * Checks if two integers are equal.
     *
     * @param value1 First value
     * @param value2 Second value
     * @return true if equal
     */
    private static boolean areEqual(int value1, int value2) {
        return value1 == value2;
    }

    /**
     * Initializes algorithm constants.
     */
    private static void initializeConstants() {
        CONSTANTS = new int[5];
        // Max depth/path length limit (25)
        PathfindingHelper.CONSTANTS[0] = 0x37 ^ 0x7C ^ (0xDF ^ 0x8D);
        // Max connection distance (2)
        PathfindingHelper.CONSTANTS[1] = 2;
        // Boolean true (1)
        PathfindingHelper.CONSTANTS[2] = 1;
        // Boolean false (0)
        PathfindingHelper.CONSTANTS[3] = (0xCF ^ 0xA1 ^ (9 ^ 4)) & (80 + 182 - 118 + 111 ^ 78 + 126 - 140 + 92 ^ -1);
        // Initial best path size (Integer.MAX_VALUE)
        PathfindingHelper.CONSTANTS[4] = -1 & (0xFFFFFFFF & Integer.MAX_VALUE);
    }

    static {
        PathfindingHelper.initializeConstants();
    }

    /**
     * Checks if first value is greater than or equal to second value.
     *
     * @param value1 First value
     * @param value2 Second value
     * @return true if value1 >= value2
     */
    private static boolean isGreaterOrEqual(int value1, int value2) {
        return value1 >= value2;
    }

    /**
     * Checks if an integer represents a true boolean value.
     *
     * @param value The integer to check
     * @return true if value is non-zero
     */
    private static boolean isTrue(int value) {
        return value != 0;
    }

    /**
     * Checks if a distance is within the threshold.
     *
     * @param distance The distance to check
     * @param threshold The maximum allowed distance
     * @return true if distance <= threshold
     */
    private static boolean isWithinDistance(int distance, int threshold) {
        return distance <= threshold;
    }

    /**
     * Checks if two integers are not equal.
     *
     * @param value1 First value
     * @param value2 Second value
     * @return true if not equal
     */
    private static boolean notEqual(int value1, int value2) {
        return value1 != value2;
    }
}
