package gg.squire.minigame.pestcontrol;

import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.pathfinder.CollisionMap;
import net.unethicalite.api.movement.pathfinder.GlobalCollisionMap;
import net.unethicalite.api.movement.pathfinder.LocalCollisionMap;
import net.unethicalite.api.movement.pathfinder.Pathfinder;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
import net.unethicalite.client.managers.RegionManager;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * Handles navigation and location checking for Pest Control minigame.
 * Manages walking to different landers and checking game state.
 */
public class PestControlNavigator {
    /**
     * The currently selected lander direction
     */
    public static PestControlDirection selectedDirection;

    private static final Random random = new Random();

    // Lander location coordinates (region-based)
    private static final int EAST_LANDER_X = 46;
    private static final int EAST_LANDER_Y = 23;
    private static final int WEST_LANDER_X = 28;
    private static final int WEST_LANDER_Y = 23;
    private static final int SOUTH_LANDER_X = 20;
    private static final int SOUTH_LANDER_Y = 18;
    private static final int LANDER_PLANE = 0;

    /**
     * Walks to the currently selected lander based on the direction.
     */
    public void walkToLander() {
        switch (DirectionSwitchHelper.directionOrdinalMapping[selectedDirection.ordinal()]) {
            case 1: // EAST
                walkToRegionPoint(EAST_LANDER_X, EAST_LANDER_Y, LANDER_PLANE);
                break;
            case 2: // WEST
                walkToRegionPoint(WEST_LANDER_X, WEST_LANDER_Y, LANDER_PLANE);
                break;
            case 3: // SOUTH
                walkToRegionPoint(SOUTH_LANDER_X, SOUTH_LANDER_Y, LANDER_PLANE);
                break;
        }
    }

    /**
     * Walks to a specific region point using the pathfinder.
     *
     * @param regionX The region X coordinate
     * @param regionY The region Y coordinate
     * @param plane   The plane/level
     */
    private void walkToRegionPoint(int regionX, int regionY, int plane) {
        Map transportLinks = Walker.buildTransportLinks();

        CollisionMap collisionMap;
        if (Static.getGlobalCollisionMap() instanceof GlobalCollisionMap) {
            collisionMap = Static.getGlobalCollisionMap();
        } else {
            collisionMap = null;
        }

        LocalCollisionMap localCollisionMap = new LocalCollisionMap((GlobalCollisionMap) collisionMap, 0);

        List<WorldPoint> path = new Pathfinder(
                localCollisionMap,
                transportLinks,
                List.of(Players.getLocal().getWorldLocation()),
                toWorldPoint(new RegionPoint(regionX, regionY, plane, 12615)),
                RegionManager.avoidWilderness()
        ).find();

        Walker.walkAlong(path, transportLinks);
    }

    /**
     * Selects a random lander direction.
     *
     * @return A randomly selected direction
     */
    public PestControlDirection getRandomDirection() {
        return PestControlDirection.values()[random.nextInt(PestControlDirection.values().length)];
    }

    /**
     * Checks if the player is currently on a Pest Control boat.
     *
     * @return true if on the boat (waiting for game to start)
     */
    public boolean isOnBoat() {
        return Widgets.get(WidgetInfo.PEST_CONTROL_BOAT_INFO) != null;
    }

    /**
     * Determines the best boat the player can access based on combat level.
     *
     * @return The highest difficulty boat accessible to the player
     */
    public PestControlBoat getBestAccessibleBoat() {
        int combatLevel = Players.getLocal().getCombatLevel();
        return PestControlBoat.getHighestAccessibleBoat(combatLevel);
    }

    /**
     * Checks if the player is currently in an active Pest Control game.
     *
     * @return true if in game (Knight info is visible)
     */
    public boolean isInGame() {
        return Widgets.get(WidgetInfo.PEST_CONTROL_KNIGHT_INFO_CONTAINER) != null;
    }

    /**
     * Converts a region point to a world point, accounting for instancing.
     *
     * @param regionPoint The region point to convert
     * @return The corresponding world point in the current instance
     */
    public static WorldPoint toWorldPoint(RegionPoint regionPoint) {
        if (regionPoint == null) {
            return null;
        }

        WorldPoint baseWorldPoint = regionPoint.toWorld();
        Client client = Static.getClient();

        return WorldPoint.toLocalInstance(client, baseWorldPoint)
                .stream()
                .min(Comparator.comparingInt(wp -> wp.distanceTo(
                        new WorldPoint(client.getBaseX(), client.getBaseY(), client.getPlane())
                )))
                .orElse(baseWorldPoint);
    }
}
