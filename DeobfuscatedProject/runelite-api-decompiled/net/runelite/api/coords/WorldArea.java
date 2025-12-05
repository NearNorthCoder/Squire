/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api.coords;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import net.runelite.api.Client;
import net.runelite.api.CollisionData;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.Point;
import net.runelite.api.Tile;
import net.runelite.api.WorldView;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;

public class WorldArea {
    private final int x;
    private final int y;
    private final int width;
    private final int height;
    private final int plane;

    public WorldArea(int x, int y, int width, int height, int plane) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.plane = plane;
    }

    public WorldArea(WorldPoint location, int width, int height) {
        this.x = location.getX();
        this.y = location.getY();
        this.plane = location.getPlane();
        this.width = width;
        this.height = height;
    }

    public WorldArea(WorldPoint swLocation, WorldPoint neLocation) {
        this.x = swLocation.getX();
        this.y = swLocation.getY();
        this.plane = swLocation.getPlane();
        this.width = neLocation.getX() - swLocation.getX() + 1;
        this.height = neLocation.getY() - swLocation.getY() + 1;
    }

    public static WorldArea createAreaAround(WorldPoint worldLocation, int offset) {
        return worldLocation.toWorldArea().offset(offset);
    }

    private Point getAxisDistances(WorldArea other) {
        Point p1 = this.getComparisonPoint(other);
        Point p2 = other.getComparisonPoint(this);
        return new Point(Math.abs(p1.getX() - p2.getX()), Math.abs(p1.getY() - p2.getY()));
    }

    public int distanceTo(WorldArea other) {
        if (this.getPlane() != other.getPlane()) {
            return Integer.MAX_VALUE;
        }
        return this.distanceTo2D(other);
    }

    public int distanceTo(WorldPoint other) {
        return this.distanceTo(other.toWorldArea());
    }

    public int distanceTo2D(WorldArea other) {
        Point distances = this.getAxisDistances(other);
        return Math.max(distances.getX(), distances.getY());
    }

    public int distanceTo2D(WorldPoint other) {
        return this.distanceTo2D(other.toWorldArea());
    }

    public boolean contains(WorldPoint worldPoint) {
        return this.distanceTo(worldPoint) == 0;
    }

    public boolean contains2D(WorldPoint worldPoint) {
        return this.distanceTo2D(worldPoint) == 0;
    }

    public boolean isInMeleeDistance(WorldArea other) {
        if (other == null || this.getPlane() != other.getPlane()) {
            return false;
        }
        Point distances = this.getAxisDistances(other);
        return distances.getX() + distances.getY() == 1;
    }

    public boolean isInMeleeDistance(WorldPoint other) {
        return this.isInMeleeDistance(other.toWorldArea());
    }

    public boolean canMelee(WorldView wv, WorldArea other) {
        if (this.isInMeleeDistance(other)) {
            Point p1 = this.getComparisonPoint(other);
            Point p2 = other.getComparisonPoint(this);
            WorldArea w1 = new WorldArea(p1.getX(), p1.getY(), 1, 1, this.getPlane());
            return w1.canTravelInDirection(wv, p2.getX() - p1.getX(), p2.getY() - p1.getY());
        }
        return false;
    }

    public List<WorldPoint> getMeleeTiles(Client client) {
        Player local = client.getLocalPlayer();
        if (local == null) {
            return Collections.emptyList();
        }
        return this.toWorldPointList().stream().flatMap(wp -> Stream.of(wp.dx(-1), wp.dx(1), wp.dy(-1), wp.dy(1))).filter(wp -> !this.contains((WorldPoint)wp)).filter(wp -> {
            Point axisDistances = this.getAxisDistances(wp.toWorldArea());
            return axisDistances.getX() != axisDistances.getY();
        }).collect(Collectors.toList());
    }

    public boolean intersectsWith(WorldArea other) {
        if (this.getPlane() != other.getPlane()) {
            return false;
        }
        Point distances = this.getAxisDistances(other);
        return distances.getX() + distances.getY() == 0;
    }

    public boolean canTravelInDirection(WorldView wv, int dx, int dy) {
        return this.canTravelInDirection(wv, dx, dy, x -> true);
    }

    public boolean canTravelInDirection(WorldView wv, int dx, int dy, Predicate<? super WorldPoint> extraCondition) {
        CollisionData[] collisionData;
        dx = Integer.signum(dx);
        dy = Integer.signum(dy);
        if (dx == 0 && dy == 0) {
            return true;
        }
        LocalPoint lp = LocalPoint.fromWorld(wv, this.x, this.y);
        int startX = lp.getSceneX() + dx;
        int startY = lp.getSceneY() + dy;
        int checkX = startX + (dx > 0 ? this.width - 1 : 0);
        int checkY = startY + (dy > 0 ? this.height - 1 : 0);
        int endX = startX + this.width - 1;
        int endY = startY + this.height - 1;
        int xFlags = 2359552;
        int yFlags = 2359552;
        int xyFlags = 2359552;
        int xWallFlagsSouth = 2359552;
        int xWallFlagsNorth = 2359552;
        int yWallFlagsWest = 2359552;
        int yWallFlagsEast = 2359552;
        if (checkX >= 104 || checkY >= 104) {
            return false;
        }
        if (dx < 0) {
            xFlags |= 8;
            xWallFlagsSouth |= 0x30;
            xWallFlagsNorth |= 6;
        }
        if (dx > 0) {
            xFlags |= 0x80;
            xWallFlagsSouth |= 0x60;
            xWallFlagsNorth |= 3;
        }
        if (dy < 0) {
            yFlags |= 2;
            yWallFlagsWest |= 0x81;
            yWallFlagsEast |= 0xC;
        }
        if (dy > 0) {
            yFlags |= 0x20;
            yWallFlagsWest |= 0xC0;
            yWallFlagsEast |= 0x18;
        }
        if (dx < 0 && dy < 0) {
            xyFlags |= 4;
        }
        if (dx < 0 && dy > 0) {
            xyFlags |= 0x10;
        }
        if (dx > 0 && dy < 0) {
            xyFlags |= 1;
        }
        if (dx > 0 && dy > 0) {
            xyFlags |= 0x40;
        }
        if ((collisionData = wv.getCollisionMaps()) == null) {
            return false;
        }
        int[][] collisionDataFlags = collisionData[this.plane].getFlags();
        if (dx != 0) {
            int y;
            for (y = startY; y <= endY; ++y) {
                if ((collisionDataFlags[checkX][y] & xFlags) == 0 && extraCondition.test(WorldPoint.fromScene(wv, checkX, y, this.plane))) continue;
                return false;
            }
            for (y = startY + 1; y <= endY; ++y) {
                if ((collisionDataFlags[checkX][y] & xWallFlagsSouth) == 0) continue;
                return false;
            }
            for (y = endY - 1; y >= startY; --y) {
                if ((collisionDataFlags[checkX][y] & xWallFlagsNorth) == 0) continue;
                return false;
            }
        }
        if (dy != 0) {
            int x;
            for (x = startX; x <= endX; ++x) {
                if ((collisionDataFlags[x][checkY] & yFlags) == 0 && extraCondition.test(WorldPoint.fromScene(wv, x, checkY, wv.getPlane()))) continue;
                return false;
            }
            for (x = startX + 1; x <= endX; ++x) {
                if ((collisionDataFlags[x][checkY] & yWallFlagsWest) == 0) continue;
                return false;
            }
            for (x = endX - 1; x >= startX; --x) {
                if ((collisionDataFlags[x][checkY] & yWallFlagsEast) == 0) continue;
                return false;
            }
        }
        if (dx != 0 && dy != 0) {
            if ((collisionDataFlags[checkX][checkY] & xyFlags) != 0 || !extraCondition.test(WorldPoint.fromScene(wv, checkX, checkY, wv.getPlane()))) {
                return false;
            }
            if (this.width == 1 && (collisionDataFlags[checkX][checkY - dy] & xFlags) != 0 && extraCondition.test(WorldPoint.fromScene(wv, checkX, startY, wv.getPlane()))) {
                return false;
            }
            if (this.height == 1) {
                return (collisionDataFlags[checkX - dx][checkY] & yFlags) == 0 || !extraCondition.test(WorldPoint.fromScene(wv, startX, checkY, wv.getPlane()));
            }
        }
        return true;
    }

    private Point getComparisonPoint(WorldArea other) {
        int x = other.x <= this.x ? this.x : (other.x >= this.x + this.width - 1 ? this.x + this.width - 1 : other.x);
        int y = other.y <= this.y ? this.y : (other.y >= this.y + this.height - 1 ? this.y + this.height - 1 : other.y);
        return new Point(x, y);
    }

    public WorldArea calculateNextTravellingPoint(WorldView wv, WorldArea target, boolean stopAtMeleeDistance) {
        return this.calculateNextTravellingPoint(wv, target, stopAtMeleeDistance, x -> true);
    }

    public WorldArea calculateNextTravellingPoint(WorldView wv, WorldArea target, boolean stopAtMeleeDistance, Predicate<? super WorldPoint> extraCondition) {
        if (this.plane != target.getPlane()) {
            return null;
        }
        if (this.intersectsWith(target)) {
            if (stopAtMeleeDistance) {
                return null;
            }
            return this;
        }
        int dx = target.x - this.x;
        int dy = target.y - this.y;
        Point axisDistances = this.getAxisDistances(target);
        if (stopAtMeleeDistance && axisDistances.getX() + axisDistances.getY() == 1) {
            return this;
        }
        LocalPoint lp = LocalPoint.fromWorld(wv, this.x, this.y);
        if (lp == null || lp.getSceneX() + dx < 0 || lp.getSceneX() + dy >= 104 || lp.getSceneY() + dx < 0 || lp.getSceneY() + dy >= 104) {
            return null;
        }
        int dxSig = Integer.signum(dx);
        int dySig = Integer.signum(dy);
        if (stopAtMeleeDistance && axisDistances.getX() == 1 && axisDistances.getY() == 1) {
            if (this.canTravelInDirection(wv, dxSig, 0, extraCondition)) {
                return new WorldArea(this.x + dxSig, this.y, this.width, this.height, this.plane);
            }
        } else {
            if (this.canTravelInDirection(wv, dxSig, dySig, extraCondition)) {
                return new WorldArea(this.x + dxSig, this.y + dySig, this.width, this.height, this.plane);
            }
            if (dx != 0 && this.canTravelInDirection(wv, dxSig, 0, extraCondition)) {
                return new WorldArea(this.x + dxSig, this.y, this.width, this.height, this.plane);
            }
            if (dy != 0 && Math.max(Math.abs(dx), Math.abs(dy)) > 1 && this.canTravelInDirection(wv, 0, dy, extraCondition)) {
                return new WorldArea(this.x, this.y + dySig, this.width, this.height, this.plane);
            }
        }
        return this;
    }

    public boolean hasLineOfSightTo(WorldView wv, WorldArea other) {
        if (this.plane != other.getPlane()) {
            return false;
        }
        LocalPoint sourceLp = LocalPoint.fromWorld(wv, this.x, this.y);
        LocalPoint targetLp = LocalPoint.fromWorld(wv, other.getX(), other.getY());
        if (sourceLp == null || targetLp == null) {
            return false;
        }
        int thisX = sourceLp.getSceneX();
        int thisY = sourceLp.getSceneY();
        int otherX = targetLp.getSceneX();
        int otherY = targetLp.getSceneY();
        int cmpThisX = otherX <= thisX ? thisX : (otherX >= thisX + this.width - 1 ? thisX + this.width - 1 : otherX);
        int cmpThisY = otherY <= thisY ? thisY : (otherY >= thisY + this.height - 1 ? thisY + this.height - 1 : otherY);
        int cmpOtherX = thisX <= otherX ? otherX : (thisX >= otherX + other.getWidth() - 1 ? otherX + other.getWidth() - 1 : thisX);
        int cmpOtherY = thisY <= otherY ? otherY : (thisY >= otherY + other.getHeight() - 1 ? otherY + other.getHeight() - 1 : thisY);
        Tile[][][] tiles = wv.getScene().getTiles();
        Tile sourceTile = tiles[this.plane][cmpThisX][cmpThisY];
        Tile targetTile = tiles[other.getPlane()][cmpOtherX][cmpOtherY];
        if (sourceTile == null || targetTile == null) {
            return false;
        }
        return WorldArea.hasLineOfSightTo(wv, sourceTile, targetTile);
    }

    private static boolean hasLineOfSightTo(WorldView wv, Tile from, Tile to) {
        if (from.getPlane() != to.getPlane()) {
            return false;
        }
        CollisionData[] collisionData = wv.getCollisionMaps();
        if (collisionData == null) {
            return false;
        }
        int z = from.getPlane();
        int[][] collisionDataFlags = collisionData[z].getFlags();
        Point p1 = from.getSceneLocation();
        Point p2 = to.getSceneLocation();
        if (p1.getX() == p2.getX() && p1.getY() == p2.getY()) {
            return true;
        }
        int dx = p2.getX() - p1.getX();
        int dy = p2.getY() - p1.getY();
        int dxAbs = Math.abs(dx);
        int dyAbs = Math.abs(dy);
        int xFlags = 131072;
        int yFlags = 131072;
        xFlags = dx < 0 ? (xFlags |= 0x1000) : (xFlags |= 0x10000);
        yFlags = dy < 0 ? (yFlags |= 0x400) : (yFlags |= 0x4000);
        if (dxAbs > dyAbs) {
            int direction;
            int x = p1.getX();
            int yBig = p1.getY() << 16;
            int slope = (dy << 16) / dxAbs;
            yBig += 32768;
            if (dy < 0) {
                --yBig;
            }
            int n = direction = dx < 0 ? -1 : 1;
            while (x != p2.getX()) {
                int y = yBig >>> 16;
                if ((collisionDataFlags[x += direction][y] & xFlags) != 0) {
                    return false;
                }
                int nextY = (yBig += slope) >>> 16;
                if (nextY == y || (collisionDataFlags[x][nextY] & yFlags) == 0) continue;
                return false;
            }
        } else {
            int direction;
            int y = p1.getY();
            int xBig = p1.getX() << 16;
            int slope = (dx << 16) / dyAbs;
            xBig += 32768;
            if (dx < 0) {
                --xBig;
            }
            int n = direction = dy < 0 ? -1 : 1;
            while (y != p2.getY()) {
                int x = xBig >>> 16;
                if ((collisionDataFlags[x][y += direction] & yFlags) != 0) {
                    return false;
                }
                int nextX = (xBig += slope) >>> 16;
                if (nextX == x || (collisionDataFlags[nextX][y] & xFlags) == 0) continue;
                return false;
            }
        }
        return true;
    }

    public boolean hasLineOfSightTo(WorldView wv, WorldPoint other) {
        return this.hasLineOfSightTo(wv, other.toWorldArea());
    }

    public WorldPoint toWorldPoint() {
        return new WorldPoint(this.x, this.y, this.plane);
    }

    public List<WorldPoint> toWorldPointList() {
        ArrayList<WorldPoint> list = new ArrayList<WorldPoint>(this.width * this.height);
        for (int x = 0; x < this.width; ++x) {
            for (int y = 0; y < this.height; ++y) {
                list.add(new WorldPoint(this.getX() + x, this.getY() + y, this.getPlane()));
            }
        }
        return list;
    }

    public boolean contains(Locatable locatable) {
        return this.contains(locatable.getWorldLocation());
    }

    public WorldPoint getCenter() {
        return new WorldPoint(this.x + this.width / 2, this.y + this.height / 2, this.plane);
    }

    public WorldArea offset(int offset) {
        return new WorldArea(this.x - offset, this.y - offset, this.width + 2 * offset, this.height + 2 * offset, this.plane);
    }

    public int distanceTo(Locatable locatable) {
        return this.distanceTo(locatable.getWorldLocation());
    }

    public WorldPoint getRandom() {
        return new WorldPoint(ThreadLocalRandom.current().nextInt(this.x, this.x + this.width), ThreadLocalRandom.current().nextInt(this.y, this.y + this.height), this.plane);
    }

    public WorldArea dx(int dx) {
        return new WorldArea(this.x + dx, this.y, this.width, this.height, this.plane);
    }

    public WorldArea dy(int dy) {
        return new WorldArea(this.x, this.y + dy, this.width, this.height, this.plane);
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public int getPlane() {
        return this.plane;
    }
}

