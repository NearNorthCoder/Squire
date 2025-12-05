/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  javax.inject.Singleton
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.Tile
 *  net.runelite.api.TileObject
 *  net.runelite.api.WallObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.commons.Predicates
 */
package net.unethicalite.api.movement.pathfinder;

import gg.squire.client.core.SleepManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Tile;
import net.runelite.api.TileObject;
import net.runelite.api.WallObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Predicates;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.House;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.CollisionMap;
import net.unethicalite.api.movement.pathfinder.Pathfinder;
import net.unethicalite.api.movement.pathfinder.TeleportLoader;
import net.unethicalite.api.movement.pathfinder.TransportLoader;
import net.unethicalite.api.movement.pathfinder.model.Teleport;
import net.unethicalite.api.movement.pathfinder.model.TilePath;
import net.unethicalite.api.movement.pathfinder.model.Transport;
import net.unethicalite.api.scene.Tiles;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
import net.unethicalite.client.managers.RegionManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
public class Walker {
    private static final Logger log = LoggerFactory.getLogger(Walker.class);
    public static final int MAX_INTERACT_DISTANCE = 20;
    private static final int MIN_TILES_WALKED_IN_STEP = 7;
    private static final int MAX_TILES_WALKED_IN_STEP = 14;
    private static final int MAX_MIN_ENERGY = 50;
    private static final int MIN_ENERGY = 5;
    private static final int MAX_NEAREST_SEARCH_ITERATIONS = 10;
    private static final ExecutorService executor = Executors.newSingleThreadExecutor();
    @Inject
    private static final SleepManager sleepManager = new SleepManager();
    private static Future<List<WorldPoint>> pathFuture = null;
    private static WorldArea currentDestination = null;

    public static boolean walkTo(WorldPoint destination) {
        return Walker.walkTo(destination, true);
    }

    public static boolean walkTo(WorldPoint destination, boolean useTeleports) {
        return Walker.walkTo(destination.toWorldArea(), useTeleports);
    }

    public static boolean walkTo(WorldArea destination) {
        return Walker.walkTo(destination, true);
    }

    public static boolean walkTo(WorldArea destination, boolean useTeleports) {
        Player local = Players.getLocal();
        if (destination.contains((Locatable)local)) {
            log.debug("Already at destination");
            return true;
        }
        Predicate<Item> energyPot = i -> i.getName().toLowerCase().contains("energy") || i.getName().toLowerCase().contains("stamina");
        if (Movement.getRunEnergy() < 50 && Movement.getRunEnergy() > 5 && Inventory.contains(energyPot)) {
            Inventory.getFirst(energyPot).interact("Drink");
        }
        if (Game.isInCutscene() || Widgets.isVisible(Widgets.get(299, 0))) {
            Time.sleepTicks(2);
            return false;
        }
        Map<WorldPoint, List<Transport>> transports = Walker.buildTransportLinks();
        List<WorldPoint> path = Walker.buildPath(destination, RegionManager.avoidWilderness(), false, useTeleports);
        Static.getEntityRenderer().setCurrentPath(path);
        if (path == null) {
            log.error("Path is null");
            return false;
        }
        if (path.isEmpty()) {
            log.debug("Path is empty");
            return false;
        }
        if (House.isInside() && House.isPoolDrinkUseful()) {
            return House.drinkFromPool();
        }
        WorldPoint startPosition = path.get(0);
        boolean offPath = path.stream().noneMatch(t -> t.distanceTo(local.getWorldLocation()) <= 5);
        if (useTeleports) {
            LinkedHashMap<WorldPoint, Teleport> teleports = Walker.buildTeleportLinks(destination);
            Teleport teleport = teleports.get(startPosition);
            if (teleport != null && offPath) {
                log.debug("Casting teleport {}", (Object)teleport);
                if (Movement.shouldWalk() && !sleepManager.isSleeping()) {
                    log.debug("actually pressing teleport");
                    teleport.getHandler().run();
                    sleepManager.sleep(2);
                    return true;
                }
            }
            log.debug("No teleport found");
        }
        if (!local.isAnimating() && offPath) {
            path = Walker.buildPath(destination, RegionManager.avoidWilderness(), true, useTeleports);
        }
        return Walker.walkAlong(path, transports);
    }

    public static boolean walkAlong(List<WorldPoint> path, Map<WorldPoint, List<Transport>> transports) {
        List<WorldPoint> remainingPath = Walker.remainingPath(path);
        if (Walker.handleTransports(remainingPath, transports)) {
            return false;
        }
        return Walker.stepAlong(remainingPath);
    }

    public static boolean stepAlong(List<WorldPoint> path) {
        List<WorldPoint> reachablePath = Walker.reachablePath(path);
        if (reachablePath.isEmpty()) {
            return false;
        }
        int nextTileIdx = reachablePath.size() - 1;
        if (nextTileIdx <= 7) {
            return Walker.step(reachablePath.get(nextTileIdx));
        }
        if (nextTileIdx > 14) {
            nextTileIdx = 14;
        }
        int targetDistance = Rand.nextInt(7, nextTileIdx);
        return Walker.step(reachablePath.get(targetDistance));
    }

    public static List<WorldPoint> reachablePath(List<WorldPoint> remainingPath) {
        WorldPoint p;
        Tile tile;
        Player local = Players.getLocal();
        ArrayList<WorldPoint> out = new ArrayList<WorldPoint>();
        Iterator<WorldPoint> iterator = remainingPath.iterator();
        while (iterator.hasNext() && (tile = Tiles.getAt(p = iterator.next())) != null) {
            out.add(p);
        }
        if (out.isEmpty() || out.size() == 1 && ((WorldPoint)out.get(0)).equals((Object)local.getWorldLocation())) {
            return Collections.emptyList();
        }
        return out;
    }

    public static boolean step(WorldPoint destination) {
        NPC tree;
        Player local = Players.getLocal();
        log.debug("Stepping towards " + String.valueOf(destination));
        if (Movement.shouldWalk() && (tree = NPCs.getNearest(n -> n.getId() == 4416 && n.getInteracting() == local && n.getWorldLocation().distanceTo2D(local.getWorldLocation()) <= 1)) != null) {
            WorldArea area = local.getWorldLocation().dx(-1).dy(-1).createWorldArea(3, 3);
            area.toWorldPointList().stream().filter(wp -> !wp.equals((Object)local.getWorldLocation()) && !wp.equals((Object)tree.getWorldLocation())).filter(Reachable::isWalkable).min(Comparator.comparingInt(wp -> wp.distanceTo2D(tree.getWorldLocation()))).ifPresent(Movement::setDestination);
            return true;
        }
        Movement.walk(destination);
        if (local.getWorldLocation().equals((Object)destination)) {
            return false;
        }
        if (!Movement.isRunEnabled() && (Static.getClient().getEnergy() / 100 >= Rand.nextInt(5, 50) || local.getHealthScale() > -1 && Static.getClient().getEnergy() / 100 > 0)) {
            Movement.toggleRun();
            Time.sleepUntil(Movement::isRunEnabled, 2000);
            return true;
        }
        if (!Movement.isRunEnabled() && Static.getClient().getEnergy() / 100 > 0 && Movement.isStaminaBoosted()) {
            Movement.toggleRun();
            Time.sleepUntil(Movement::isRunEnabled, 2000);
            return true;
        }
        return true;
    }

    public static boolean handleTransports(List<WorldPoint> path, Map<WorldPoint, List<Transport>> transports) {
        Widget leverWarningWidget = Widgets.get(229, 1);
        if (Widgets.isVisible(leverWarningWidget)) {
            log.debug("Handling Wilderness lever warning widget");
            Dialog.continueSpace();
            return true;
        }
        Widget wildyDitchWidget = Widgets.get(475, 11);
        if (Widgets.isVisible(wildyDitchWidget)) {
            log.debug("Handling Wilderness warning widget");
            wildyDitchWidget.interact("Enter Wilderness");
            return true;
        }
        if (Dialog.getOptions().stream().anyMatch(widget -> widget.getText() != null && widget.getText().contains("Eeep! The Wilderness"))) {
            log.debug("Handling wilderness warning dialog");
            Dialog.chooseOption("Yes, I'm brave");
            return true;
        }
        for (int i = 0; i < 20 && i + 1 < path.size(); ++i) {
            TileObject wall;
            boolean hasPickaxe;
            Transport transport;
            WorldPoint a = path.get(i);
            WorldPoint b = path.get(i + 1);
            Tile tileA = Tiles.getAt(a);
            Tile tileB = Tiles.getAt(b);
            if ((a.distanceTo(b) > 1 || tileA != null && tileB != null && !Reachable.isWalkable(b)) && (transport = (Transport)transports.getOrDefault(a, List.of()).stream().filter(x -> x.getSource().equals((Object)a) && x.getDestination().equals((Object)b)).filter(x -> x.getCondition().getAsBoolean()).findFirst().orElse(null)) != null) {
                if (!Movement.shouldWalk()) {
                    return true;
                }
                log.debug("Trying to use transport at {} to move {} -> {}", transport.getSource(), a, b);
                transport.getHandler().run();
                Time.sleepTick();
                return true;
            }
            TileObject rockfall = TileObjects.getFirstAt(a, "Rockfall");
            boolean bl = hasPickaxe = Inventory.contains(Predicates.nameContains((String)"pickaxe")) || Equipment.contains(Predicates.nameContains((String)"pickaxe"));
            if (rockfall != null && hasPickaxe) {
                log.debug("Handling MLM rockfall");
                if (!Players.getLocal().isIdle()) {
                    return true;
                }
                rockfall.interact("Mine");
                return true;
            }
            if (tileA == null) {
                return false;
            }
            if (Math.abs(a.getX() - b.getX()) + Math.abs(a.getY() + b.getY()) > 1 && a.getPlane() == b.getPlane() && (wall = TileObjects.getFirstAt(tileA, it -> !(it instanceof WallObject) && it.getName() != null && it.getName().equals("Door"))) != null && wall.hasAction(new String[]{"Open"})) {
                if (!Movement.shouldWalk()) {
                    return true;
                }
                log.debug("Handling diagonal door at {}", (Object)wall.getWorldLocation());
                wall.interact("Open");
                Time.sleepUntil(() -> !wall.hasAction(new String[]{"Open"}), 2000);
                return true;
            }
            if (tileB == null) {
                return false;
            }
            if (Reachable.isDoored(tileA, tileB)) {
                if (!Movement.shouldWalk()) {
                    return true;
                }
                wall = tileA.getWallObject();
                wall.interact("Open");
                log.debug("Handling door at {}", (Object)wall.getWorldLocation());
                Time.sleepUntil(() -> Walker.lambda$handleTransports$10(tileA, (WallObject)wall), 2000);
                return true;
            }
            if (!Reachable.isDoored(tileB, tileA)) continue;
            if (!Movement.shouldWalk()) {
                return true;
            }
            wall = tileB.getWallObject();
            wall.interact("Open");
            log.debug("Handling door at {}", (Object)wall.getWorldLocation());
            Time.sleepUntil(() -> Walker.lambda$handleTransports$11(tileB, (WallObject)wall), 2000);
            return true;
        }
        return false;
    }

    public static WorldPoint nearestWalkableTile(WorldPoint source, Predicate<WorldPoint> filter) {
        int currentIteration;
        CollisionMap cm = Static.getGlobalCollisionMap();
        if (!cm.fullBlock(source) && filter.test(source)) {
            return source;
        }
        for (int radius = currentIteration = 1; radius < 10; ++radius) {
            for (int x = -radius; x < radius; ++x) {
                for (int y = -radius; y < radius; ++y) {
                    WorldPoint p = source.dx(x).dy(y);
                    if (cm.fullBlock(p) || !filter.test(p)) continue;
                    return p;
                }
            }
        }
        log.debug("Could not find a walkable tile near {}", (Object)source);
        return null;
    }

    public static WorldPoint nearestWalkableTile(WorldPoint source) {
        return Walker.nearestWalkableTile(source, x -> true);
    }

    public static List<WorldPoint> remainingPath(List<WorldPoint> path) {
        Player local = Static.getClient().getLocalPlayer();
        if (local == null) {
            return Collections.emptyList();
        }
        WorldPoint nearest = path.stream().min(Comparator.comparingInt(x -> x.distanceTo(local.getWorldLocation()))).orElse(null);
        if (nearest == null) {
            return Collections.emptyList();
        }
        return path.subList(path.indexOf(nearest), path.size());
    }

    public static TilePath calculateTilePath(WorldArea destination) {
        Player local = Players.getLocal();
        LinkedHashMap<WorldPoint, Teleport> teleports = Walker.buildTeleportLinks(destination);
        ArrayList<WorldPoint> startPoints = new ArrayList<WorldPoint>(teleports.keySet());
        startPoints.add(local.getWorldLocation());
        return new TilePath(Walker.calculatePath(startPoints, destination), false);
    }

    public static TilePath calculateTilePath(List<WorldPoint> startPoints, WorldArea destination) {
        return new TilePath(Walker.calculatePath(startPoints, destination), false);
    }

    public static TilePath calculateTilePath(List<WorldPoint> startPoints, WorldArea destination, CollisionMap collisionMap) {
        return new TilePath(new Pathfinder(collisionMap, Walker.buildTransportLinks(), startPoints, destination, RegionManager.avoidWilderness()).find(), false);
    }

    public static List<WorldPoint> calculatePath(WorldArea destination) {
        Player local = Players.getLocal();
        LinkedHashMap<WorldPoint, Teleport> teleports = Walker.buildTeleportLinks(destination);
        ArrayList<WorldPoint> startPoints = new ArrayList<WorldPoint>(teleports.keySet());
        startPoints.add(local.getWorldLocation());
        return Walker.calculatePath(startPoints, destination);
    }

    public static List<WorldPoint> calculatePath(List<WorldPoint> startPoints, WorldArea destination) {
        if (Static.getClient().isClientThread()) {
            throw new RuntimeException("Calculate path cannot be called on client thread");
        }
        return new Pathfinder(Static.getGlobalCollisionMap(), Walker.buildTransportLinks(), startPoints, destination, RegionManager.avoidWilderness()).find();
    }

    public static List<WorldPoint> calculatePath(WorldPoint destination) {
        return Walker.calculatePath(destination.toWorldArea());
    }

    public static List<WorldPoint> calculatePath(List<WorldPoint> startPoints, WorldPoint destination) {
        return Walker.calculatePath(startPoints, destination.toWorldArea());
    }

    private static List<WorldPoint> buildPath(List<WorldPoint> startPoints, WorldArea destination, boolean avoidWilderness, boolean forced) {
        return Walker.buildPath(startPoints, destination, avoidWilderness, forced, 5000000);
    }

    public static List<WorldPoint> buildPath(List<WorldPoint> startPoints, WorldArea destination, boolean avoidWilderness, boolean forced, int maxSearchDistance) {
        boolean sameDestination;
        if (pathFuture == null) {
            pathFuture = executor.submit(new Pathfinder(Static.getGlobalCollisionMap(), Walker.buildTransportLinks(), startPoints, destination, avoidWilderness, maxSearchDistance));
            currentDestination = destination;
        }
        boolean bl = sameDestination = destination.getX() == currentDestination.getX() && destination.getY() == currentDestination.getY() && destination.getPlane() == currentDestination.getPlane() && destination.getWidth() == currentDestination.getWidth() && destination.getHeight() == currentDestination.getHeight();
        if (!sameDestination || RegionManager.shouldRefreshPath() || forced) {
            pathFuture.cancel(true);
            pathFuture = executor.submit(new Pathfinder(Static.getGlobalCollisionMap(), Walker.buildTransportLinks(), startPoints, destination, avoidWilderness, maxSearchDistance));
            currentDestination = destination;
        }
        try {
            if (Static.getClient().isClientThread()) {
                return pathFuture.get(10L, TimeUnit.MILLISECONDS);
            }
            return pathFuture.get();
        }
        catch (Exception e) {
            log.debug("Path is loading: {}", (Object)e.getMessage());
            return List.of();
        }
    }

    public static List<WorldPoint> buildPath(WorldArea destination, boolean avoidWilderness, boolean forced) {
        Player local = Players.getLocal();
        LinkedHashMap<WorldPoint, Teleport> teleports = Walker.buildTeleportLinks(destination);
        ArrayList<WorldPoint> startPoints = new ArrayList<WorldPoint>(teleports.keySet());
        startPoints.add(local.getWorldLocation());
        return Walker.buildPath(startPoints, destination, avoidWilderness, forced);
    }

    public static List<WorldPoint> buildPath(WorldArea destination, boolean avoidWilderness, boolean forced, boolean useTeleports) {
        Player local = Players.getLocal();
        ArrayList<WorldPoint> startPoints = new ArrayList<WorldPoint>();
        if (useTeleports) {
            LinkedHashMap<WorldPoint, Teleport> teleports = Walker.buildTeleportLinks(destination);
            startPoints.addAll(teleports.keySet());
        }
        startPoints.add(local.getWorldLocation());
        return Walker.buildPath(startPoints, destination, avoidWilderness, forced);
    }

    public static List<WorldPoint> buildPath(WorldArea destination) {
        return Walker.buildPath(destination, RegionManager.avoidWilderness(), false);
    }

    public static List<WorldPoint> buildPath(WorldArea destination, boolean forced) {
        return Walker.buildPath(destination, RegionManager.avoidWilderness(), forced);
    }

    public static List<WorldPoint> buildPath(WorldPoint destination) {
        return Walker.buildPath(destination.toWorldArea());
    }

    public static List<WorldPoint> buildPath(WorldPoint destination, boolean forced) {
        return Walker.buildPath(destination.toWorldArea(), forced);
    }

    public static List<WorldPoint> buildPath(WorldPoint destination, boolean avoidWilderness, boolean forced) {
        return Walker.buildPath(destination.toWorldArea(), avoidWilderness, forced);
    }

    public static List<WorldPoint> buildPath(List<WorldPoint> startPoints, WorldPoint destination, boolean avoidWilderness, boolean forced) {
        return Walker.buildPath(startPoints, destination.toWorldArea(), avoidWilderness, forced);
    }

    public static Map<WorldPoint, List<Transport>> buildTransportLinks() {
        HashMap<WorldPoint, List<Transport>> out = new HashMap<WorldPoint, List<Transport>>();
        if (!Static.getSquireConfig().useTransports()) {
            return out;
        }
        for (Transport transport : TransportLoader.buildTransports()) {
            out.computeIfAbsent(transport.getSource(), x -> new ArrayList()).add(transport);
        }
        return out;
    }

    public static LinkedHashMap<WorldPoint, Teleport> buildTeleportLinks(WorldArea destination) {
        LinkedHashMap<WorldPoint, Teleport> out = new LinkedHashMap<WorldPoint, Teleport>();
        if (!Static.getSquireConfig().useTeleports()) {
            return out;
        }
        Player local = Players.getLocal();
        for (Teleport teleport : TeleportLoader.buildTeleports()) {
            if (teleport.getDestination().distanceTo(local.getWorldLocation()) <= 50 || destination.distanceTo((Locatable)local) <= destination.distanceTo(teleport.getDestination()) + 20) continue;
            out.putIfAbsent(teleport.getDestination(), teleport);
        }
        return out;
    }

    private static /* synthetic */ boolean lambda$handleTransports$11(Tile tileB, WallObject wall) {
        return tileB.getWallObject() == null || !wall.hasAction(new String[]{"Open"});
    }

    private static /* synthetic */ boolean lambda$handleTransports$10(Tile tileA, WallObject wall) {
        return tileA.getWallObject() == null || !wall.hasAction(new String[]{"Open"});
    }
}

