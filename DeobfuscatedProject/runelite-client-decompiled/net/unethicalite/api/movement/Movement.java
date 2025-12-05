/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.Perspective
 *  net.runelite.api.Player
 *  net.runelite.api.Point
 *  net.runelite.api.Tile
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 */
package net.unethicalite.api.movement;

import java.util.Comparator;
import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.Perspective;
import net.runelite.api.Player;
import net.runelite.api.Point;
import net.runelite.api.Tile;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.coords.ScenePoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.movement.pathfinder.CollisionMap;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.movement.pathfinder.model.TilePath;
import net.unethicalite.api.packets.MovementPackets;
import net.unethicalite.api.scene.Tiles;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
import net.unethicalite.client.managers.interaction.InteractionManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Movement {
    private static final Logger log = LoggerFactory.getLogger(Movement.class);
    private static final int STAMINA_VARBIT = 25;
    private static final int RUN_VARP = 173;

    public static void setDestination(int sceneX, int sceneY) {
        LocalPoint localPoint = LocalPoint.fromScene((int)sceneX, (int)sceneY);
        Point inScene = Perspective.localToCanvas((Client)Static.getClient(), (LocalPoint)localPoint, (int)Static.getClient().getPlane());
        java.awt.Point click = inScene == null ? InteractionManager.getRecordingClickPoint() : inScene.getAwtPoint();
        InteractionManager.clickAndInvoke(click, () -> {
            Static.getClient().setSelectedSceneTileX(sceneX);
            Static.getClient().setSelectedSceneTileY(sceneY);
            Static.getClient().setViewportWalking(true);
        });
    }

    public static WorldPoint getDestination() {
        Client client = Static.getClient();
        if (client.getDestinationX() == 0 && client.getDestinationY() == 0) {
            return null;
        }
        return new WorldPoint(client.getDestinationX() + client.getBaseX(), client.getDestinationY() + client.getBaseY(), client.getPlane());
    }

    public static void setDestination(WorldPoint worldPoint) {
        ScenePoint scenePt = ScenePoint.fromWorld(worldPoint);
        Movement.setDestination(scenePt.getX(), scenePt.getY());
    }

    public static boolean shouldWalk() {
        Player local = Players.getLocal();
        WorldPoint destination = Movement.getDestination();
        return !local.isMoving() || destination != null && destination.distanceTo((Locatable)local) < 6;
    }

    public static boolean isWalking() {
        Player local = Players.getLocal();
        WorldPoint destination = Movement.getDestination();
        return local.isMoving() && destination != null && destination.distanceTo((Locatable)local) > 4;
    }

    public static void walk(WorldPoint worldPoint) {
        LocalPoint point;
        Client client = Static.getClient();
        Player local = client.getLocalPlayer();
        if (local == null) {
            return;
        }
        WorldPoint walkPoint = worldPoint;
        Tile destinationTile = Tiles.getAt(worldPoint);
        if (destinationTile == null) {
            log.debug("Destination {} is not in scene", (Object)worldPoint);
            Tile nearestInScene = Tiles.getAll().stream().min(Comparator.comparingInt(x -> x.getWorldLocation().distanceTo(local.getWorldLocation()))).orElse(null);
            if (nearestInScene == null) {
                log.debug("Couldn't find nearest walkable tile");
                return;
            }
            walkPoint = nearestInScene.getWorldLocation();
        }
        if ((point = LocalPoint.fromWorld((Client)client, (WorldPoint)walkPoint)) != null) {
            Point minimap = Perspective.localToMinimap((Client)client, (LocalPoint)point);
            if (minimap == null) {
                Movement.setDestination(walkPoint);
                return;
            }
            InteractionManager.clickAndInvoke(() -> MovementPackets.sendMinimapMovement(worldPoint, minimap.getX(), minimap.getY()));
        }
    }

    public static boolean walkTo(WorldArea worldArea) {
        return Walker.walkTo(worldArea);
    }

    public static void walk(Locatable locatable) {
        Movement.walk(locatable.getWorldLocation());
    }

    public static boolean walkTo(WorldPoint worldPoint) {
        return Walker.walkTo(worldPoint);
    }

    public static boolean walkTo(WorldPoint worldPoint, boolean useTeleports) {
        return Walker.walkTo(worldPoint, useTeleports);
    }

    public static boolean walkTo(Locatable locatable) {
        return Movement.walkTo(locatable.getWorldLocation());
    }

    public static boolean walkTo(BankLocation bankLocation) {
        return Movement.walkTo(bankLocation.getArea());
    }

    public static boolean walkTo(int x, int y) {
        return Movement.walkTo(x, y, Static.getClient().getPlane());
    }

    public static boolean walkTo(int x, int y, int plane) {
        return Movement.walkTo(new WorldPoint(x, y, plane));
    }

    public static boolean isRunEnabled() {
        return Vars.getVarp(173) == 1;
    }

    public static void toggleRun() {
        Widget widget = Widgets.get(WidgetInfo.MINIMAP_TOGGLE_RUN_ORB);
        if (widget != null) {
            widget.interact("Toggle Run");
        }
    }

    public static boolean isStaminaBoosted() {
        return Vars.getBit(25) == 1;
    }

    public static int getRunEnergy() {
        return Static.getClient().getEnergy() / 100;
    }

    public static int calculateDistance(WorldArea destination) {
        return Walker.calculatePath(destination).size();
    }

    public static int calculateDistance(WorldPoint start, WorldArea destination) {
        return Movement.calculateDistance(List.of(start), destination);
    }

    public static int calculateDistance(List<WorldPoint> start, WorldArea destination) {
        return Walker.calculatePath(start, destination).size();
    }

    public static int calculateDistance(WorldPoint destination) {
        return Movement.calculateDistance(destination.toWorldArea());
    }

    public static int calculateDistance(WorldPoint start, WorldPoint destination) {
        return Movement.calculateDistance(start, destination.toWorldArea());
    }

    public static int calculateDistance(List<WorldPoint> start, WorldPoint destination) {
        return Movement.calculateDistance(start, destination.toWorldArea());
    }

    public static TilePath getPath(WorldPoint destination) {
        return Movement.getPath(List.of(Players.getLocal().getWorldLocation()), destination);
    }

    public static TilePath getPath(WorldPoint destination, CollisionMap collisionMap) {
        return Movement.getPath(List.of(Players.getLocal().getWorldLocation()), destination, collisionMap);
    }

    public static TilePath getPath(List<WorldPoint> startPoints, WorldPoint destination) {
        return Movement.getPath(startPoints, destination, Static.getGlobalCollisionMap());
    }

    public static TilePath getPath(List<WorldPoint> startPoints, WorldPoint destination, CollisionMap collisionMap) {
        return Movement.getPath(startPoints, destination.toWorldArea(), collisionMap);
    }

    public static TilePath getPath(WorldArea destination) {
        return Movement.getPath(List.of(Players.getLocal().getWorldLocation()), destination);
    }

    public static TilePath getPath(WorldArea destination, CollisionMap collisionMap) {
        return Movement.getPath(List.of(Players.getLocal().getWorldLocation()), destination, collisionMap);
    }

    public static TilePath getPath(List<WorldPoint> startPoints, WorldArea destination) {
        return Movement.getPath(startPoints, destination, Static.getGlobalCollisionMap());
    }

    public static TilePath getPath(List<WorldPoint> startPoints, WorldArea destination, CollisionMap collisionMap) {
        return Walker.calculateTilePath(startPoints, destination, collisionMap);
    }
}

