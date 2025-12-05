/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api.coords;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Stroke;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.Perspective;
import net.runelite.api.Scene;
import net.runelite.api.Tile;
import net.runelite.api.WorldView;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.Positionable;

public final class WorldPoint
implements Positionable {
    private static final int[] REGION_MIRRORS = new int[]{12894, 8755, 12895, 8756, 13150, 9011, 13151, 9012};
    private final int x;
    private final int y;
    private final int plane;

    public WorldPoint dx(int dx) {
        return new WorldPoint(this.x + dx, this.y, this.plane);
    }

    public WorldPoint dy(int dy) {
        return new WorldPoint(this.x, this.y + dy, this.plane);
    }

    public WorldPoint dz(int dz) {
        return new WorldPoint(this.x, this.y, this.plane + dz);
    }

    public static boolean isInScene(Scene scene, int x, int y) {
        int baseX = scene.getBaseX();
        int baseY = scene.getBaseY();
        int maxX = baseX + 104;
        int maxY = baseY + 104;
        return x >= baseX && x < maxX && y >= baseY && y < maxY;
    }

    @Deprecated
    public static boolean isInScene(Client client, int x, int y) {
        return WorldPoint.isInScene(client.getTopLevelWorldView(), x, y);
    }

    public static boolean isInScene(WorldView wv, int x, int y) {
        int baseX = wv.getBaseX();
        int baseY = wv.getBaseY();
        int maxX = baseX + wv.getSizeX();
        int maxY = baseY + wv.getSizeY();
        return x >= baseX && x < maxX && y >= baseY && y < maxY;
    }

    @Deprecated
    public boolean isInScene(Client client) {
        return client.getPlane() == this.plane && WorldPoint.isInScene(client, this.x, this.y);
    }

    public static WorldPoint fromLocal(Client client, LocalPoint local) {
        WorldView wv = client.getWorldView(local.getWorldView());
        return WorldPoint.fromLocal(wv, local.getX(), local.getY(), wv.getPlane());
    }

    public static WorldPoint fromLocal(WorldView wv, int x, int y, int plane) {
        return new WorldPoint((x >> 7) + wv.getBaseX(), (y >> 7) + wv.getBaseY(), plane);
    }

    public static WorldPoint fromLocal(Scene scene, int x, int y, int plane) {
        return new WorldPoint((x >> 7) + scene.getBaseX(), (y >> 7) + scene.getBaseY(), plane);
    }

    @Deprecated
    public static WorldPoint fromLocal(Client client, int x, int y, int plane) {
        return WorldPoint.fromLocal(client.getTopLevelWorldView(), x, y, plane);
    }

    public static WorldPoint fromLocalInstance(Client client, LocalPoint localPoint) {
        WorldView wv = client.getWorldView(localPoint.getWorldView());
        return WorldPoint.fromLocalInstance(client, localPoint, wv.getPlane());
    }

    public static WorldPoint fromLocalInstance(Client client, LocalPoint localPoint, int plane) {
        WorldView wv = client.getWorldView(localPoint.getWorldView());
        if (wv.isInstance()) {
            return WorldPoint.fromLocalInstance(wv.getInstanceTemplateChunks(), localPoint, plane);
        }
        return WorldPoint.fromLocal(client, localPoint.getX(), localPoint.getY(), plane);
    }

    public static WorldPoint fromLocalInstance(Scene scene, LocalPoint localPoint, int plane) {
        if (scene.isInstance()) {
            return WorldPoint.fromLocalInstance(scene.getInstanceTemplateChunks(), localPoint, plane);
        }
        return WorldPoint.fromLocal(scene, localPoint.getX(), localPoint.getY(), plane);
    }

    private static WorldPoint fromLocalInstance(int[][][] instanceTemplateChunks, LocalPoint localPoint, int plane) {
        int sceneX = localPoint.getSceneX();
        int sceneY = localPoint.getSceneY();
        int chunkX = sceneX / 8;
        int chunkY = sceneY / 8;
        int templateChunk = instanceTemplateChunks[plane][chunkX][chunkY];
        int rotation = templateChunk >> 1 & 3;
        int templateChunkY = (templateChunk >> 3 & 0x7FF) * 8;
        int templateChunkX = (templateChunk >> 14 & 0x3FF) * 8;
        int templateChunkPlane = templateChunk >> 24 & 3;
        int x = templateChunkX + (sceneX & 7);
        int y = templateChunkY + (sceneY & 7);
        return WorldPoint.rotate(new WorldPoint(x, y, templateChunkPlane), 4 - rotation);
    }

    @Deprecated
    public static Collection<WorldPoint> toLocalInstance(Client client, WorldPoint worldPoint) {
        return WorldPoint.toLocalInstance(client.getTopLevelWorldView(), worldPoint);
    }

    public static Collection<WorldPoint> toLocalInstance(WorldView wv, WorldPoint worldPoint) {
        if (wv.isInstance()) {
            return WorldPoint.toLocalInstance(wv.getInstanceTemplateChunks(), wv.getBaseX(), wv.getBaseY(), worldPoint);
        }
        return Collections.singleton(worldPoint);
    }

    public static Collection<WorldPoint> toLocalInstance(Scene scene, WorldPoint worldPoint) {
        if (scene.isInstance()) {
            return WorldPoint.toLocalInstance(scene.getInstanceTemplateChunks(), scene.getBaseX(), scene.getBaseY(), worldPoint);
        }
        return Collections.singleton(worldPoint);
    }

    private static Collection<WorldPoint> toLocalInstance(int[][][] instanceTemplateChunks, int baseX, int baseY, WorldPoint worldPoint) {
        ArrayList<WorldPoint> worldPoints = new ArrayList<WorldPoint>();
        for (int z = 0; z < instanceTemplateChunks.length; ++z) {
            for (int x = 0; x < instanceTemplateChunks[z].length; ++x) {
                for (int y = 0; y < instanceTemplateChunks[z][x].length; ++y) {
                    int chunkData = instanceTemplateChunks[z][x][y];
                    int rotation = chunkData >> 1 & 3;
                    int templateChunkY = (chunkData >> 3 & 0x7FF) * 8;
                    int templateChunkX = (chunkData >> 14 & 0x3FF) * 8;
                    int plane = chunkData >> 24 & 3;
                    if (worldPoint.getX() < templateChunkX || worldPoint.getX() >= templateChunkX + 8 || worldPoint.getY() < templateChunkY || worldPoint.getY() >= templateChunkY + 8 || plane != worldPoint.getPlane()) continue;
                    WorldPoint p = new WorldPoint(baseX + x * 8 + (worldPoint.getX() & 7), baseY + y * 8 + (worldPoint.getY() & 7), z);
                    p = WorldPoint.rotate(p, rotation);
                    worldPoints.add(p);
                }
            }
        }
        return worldPoints;
    }

    private static WorldPoint rotate(WorldPoint point, int rotation) {
        int chunkX = point.getX() & 0xFFFFFFF8;
        int chunkY = point.getY() & 0xFFFFFFF8;
        int x = point.getX() & 7;
        int y = point.getY() & 7;
        switch (rotation) {
            case 1: {
                return new WorldPoint(chunkX + y, chunkY + (7 - x), point.getPlane());
            }
            case 2: {
                return new WorldPoint(chunkX + (7 - x), chunkY + (7 - y), point.getPlane());
            }
            case 3: {
                return new WorldPoint(chunkX + (7 - y), chunkY + x, point.getPlane());
            }
        }
        return point;
    }

    public int distanceTo(WorldArea other) {
        return this.toWorldArea().distanceTo(other);
    }

    public int distanceTo(WorldPoint other) {
        if (other.plane != this.plane) {
            return Integer.MAX_VALUE;
        }
        return this.distanceTo2D(other);
    }

    public int distanceTo2D(WorldPoint other) {
        return Math.max(Math.abs(this.getX() - other.getX()), Math.abs(this.getY() - other.getY()));
    }

    public float distanceToHypotenuse(WorldPoint other) {
        if (other.plane != this.plane) {
            return Float.MAX_VALUE;
        }
        return this.distanceTo2DHypotenuse(other);
    }

    public float distanceTo2DHypotenuse(WorldPoint other) {
        return (float)Math.hypot(this.getX() - other.getX(), this.getY() - other.getY());
    }

    @Deprecated
    public static WorldPoint fromScene(Client client, int x, int y, int plane) {
        return WorldPoint.fromScene(client.getTopLevelWorldView(), x, y, plane);
    }

    public static WorldPoint fromScene(WorldView wv, int x, int y, int plane) {
        return new WorldPoint(x + wv.getBaseX(), y + wv.getBaseY(), plane);
    }

    public static WorldPoint fromScene(Scene scene, int x, int y, int plane) {
        return new WorldPoint(x + scene.getBaseX(), y + scene.getBaseY(), plane);
    }

    public int getRegionID() {
        return this.x >> 6 << 8 | this.y >> 6;
    }

    public static boolean isInZone(WorldPoint lowerBound, WorldPoint upperBound, WorldPoint userLocation) {
        return userLocation.getX() >= lowerBound.getX() && userLocation.getX() <= upperBound.getX() && userLocation.getY() >= lowerBound.getY() && userLocation.getY() <= upperBound.getY() && userLocation.getPlane() >= lowerBound.getPlane() && userLocation.getPlane() <= upperBound.getPlane();
    }

    public static WorldPoint fromRegion(int regionId, int regionX, int regionY, int plane) {
        return new WorldPoint((regionId >>> 8 << 6) + regionX, ((regionId & 0xFF) << 6) + regionY, plane);
    }

    public int getRegionX() {
        return WorldPoint.getRegionOffset(this.x);
    }

    public int getRegionY() {
        return WorldPoint.getRegionOffset(this.y);
    }

    private static int getRegionOffset(int position) {
        return position & 0x3F;
    }

    public List<WorldPoint> pathTo(Client client, WorldPoint other) {
        Tile targetTile;
        if (this.plane != other.getPlane()) {
            return null;
        }
        LocalPoint sourceLp = LocalPoint.fromWorld(client, this.x, this.y);
        LocalPoint targetLp = LocalPoint.fromWorld(client, other.getX(), other.getY());
        if (sourceLp == null || targetLp == null) {
            return null;
        }
        int thisX = sourceLp.getSceneX();
        int thisY = sourceLp.getSceneY();
        int otherX = targetLp.getSceneX();
        int otherY = targetLp.getSceneY();
        Tile[][][] tiles = client.getScene().getTiles();
        Tile sourceTile = tiles[this.plane][thisX][thisY];
        List<Tile> checkpointTiles = sourceTile.pathTo(targetTile = tiles[this.plane][otherX][otherY]);
        if (checkpointTiles == null) {
            return null;
        }
        ArrayList<WorldPoint> checkpointWPs = new ArrayList<WorldPoint>();
        for (Tile checkpointTile : checkpointTiles) {
            if (checkpointTile == null) break;
            checkpointWPs.add(checkpointTile.getWorldLocation());
        }
        return checkpointWPs;
    }

    public int distanceToPath(Client client, WorldPoint other) {
        List<WorldPoint> checkpointWPs = this.pathTo(client, other);
        if (checkpointWPs == null) {
            return Integer.MAX_VALUE;
        }
        WorldPoint destinationPoint = checkpointWPs.get(checkpointWPs.size() - 1);
        if (other.getX() != destinationPoint.getX() || other.getY() != destinationPoint.getY()) {
            return Integer.MAX_VALUE;
        }
        WorldPoint Point1 = this;
        int distance = 0;
        for (WorldPoint Point2 : checkpointWPs) {
            distance += Point1.distanceTo2D(Point2);
            Point1 = Point2;
        }
        return distance;
    }

    public static WorldPoint getMirrorPoint(WorldPoint worldPoint, boolean toOverworld) {
        int region = worldPoint.getRegionID();
        for (int i = 0; i < REGION_MIRRORS.length; i += 2) {
            int real = REGION_MIRRORS[i];
            int overworld = REGION_MIRRORS[i + 1];
            if (region != (toOverworld ? real : overworld)) continue;
            return WorldPoint.fromRegion(toOverworld ? overworld : real, worldPoint.getRegionX(), worldPoint.getRegionY(), worldPoint.getPlane());
        }
        return worldPoint;
    }

    public boolean isInArea(WorldArea ... worldAreas) {
        for (WorldArea area : worldAreas) {
            if (!area.contains(this)) continue;
            return true;
        }
        return false;
    }

    public boolean isInArea2D(WorldArea ... worldAreas) {
        for (WorldArea area : worldAreas) {
            if (!area.contains2D(this)) continue;
            return true;
        }
        return false;
    }

    public WorldArea toWorldArea() {
        return new WorldArea(this, 1, 1);
    }

    public static WorldPoint fromCoord(int c) {
        return new WorldPoint(c >>> 14 & 0x3FFF, c & 0x3FFF, c >>> 28 & 3);
    }

    public void outline(Client client, Graphics2D graphics2D, Color color) {
        this.outline(client, graphics2D, color, null);
    }

    public void outline(Client client, Graphics2D graphics, Color color, String text) {
        LocalPoint localPoint = LocalPoint.fromWorld(client, this);
        if (localPoint == null) {
            return;
        }
        Polygon poly = Perspective.getCanvasTilePoly(client, localPoint);
        if (poly == null) {
            return;
        }
        if (text != null) {
            int stringX = (int)(poly.getBounds().getCenterX() - graphics.getFont().getStringBounds(text, graphics.getFontRenderContext()).getWidth() / 2.0);
            int stringY = (int)poly.getBounds().getCenterY();
            graphics.setColor(color);
            graphics.drawString(text, stringX, stringY);
        }
        graphics.setColor(color);
        Stroke originalStroke = graphics.getStroke();
        graphics.setStroke(new BasicStroke(2.0f));
        graphics.draw(poly);
        graphics.setColor(new Color(0, 0, 0, 50));
        graphics.fill(poly);
        graphics.setStroke(originalStroke);
    }

    public int distanceTo(Locatable locatable) {
        return locatable.getWorldLocation().distanceTo(this);
    }

    public WorldArea createWorldArea(int width, int height) {
        return new WorldArea(this, width, height);
    }

    public WorldArea createWorldArea(int width) {
        return WorldArea.createAreaAround(this, width);
    }

    public WorldArea toWorldArea(int width, int height) {
        return new WorldArea(this.getX() - width / 2, this.getY() - height / 2, width, height, this.getPlane());
    }

    @Override
    public int getWorldX() {
        return this.x;
    }

    @Override
    public int getWorldY() {
        return this.y;
    }

    public WorldPoint(int x, int y, int plane) {
        this.x = x;
        this.y = y;
        this.plane = plane;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    @Override
    public int getPlane() {
        return this.plane;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof WorldPoint)) {
            return false;
        }
        WorldPoint other = (WorldPoint)o;
        if (this.getX() != other.getX()) {
            return false;
        }
        if (this.getY() != other.getY()) {
            return false;
        }
        return this.getPlane() == other.getPlane();
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getX();
        result = result * 59 + this.getY();
        result = result * 59 + this.getPlane();
        return result;
    }

    public String toString() {
        return "WorldPoint(x=" + this.getX() + ", y=" + this.getY() + ", plane=" + this.getPlane() + ")";
    }
}

