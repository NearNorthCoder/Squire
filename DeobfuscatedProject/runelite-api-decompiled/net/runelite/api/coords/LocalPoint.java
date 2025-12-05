/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api.coords;

import javax.annotation.Nullable;
import net.runelite.api.Client;
import net.runelite.api.Scene;
import net.runelite.api.WorldView;
import net.runelite.api.coords.WorldPoint;

public final class LocalPoint {
    private final int x;
    private final int y;
    private final int worldView;

    public LocalPoint(int x, int y, WorldView wv) {
        this(x, y, wv.getId());
    }

    @Deprecated
    public LocalPoint(int x, int y) {
        this(x, y, -1);
    }

    @Nullable
    @Deprecated
    public static LocalPoint fromWorld(Client client, WorldPoint world) {
        return LocalPoint.fromWorld(client.getTopLevelWorldView(), world);
    }

    @Nullable
    public static LocalPoint fromWorld(WorldView wv, WorldPoint world) {
        if (wv.getPlane() != world.getPlane()) {
            return null;
        }
        return LocalPoint.fromWorld(wv, world.getX(), world.getY());
    }

    @Deprecated
    @Nullable
    public static LocalPoint fromWorld(Client client, int x, int y) {
        return LocalPoint.fromWorld(client.getTopLevelWorldView(), x, y);
    }

    @Nullable
    public static LocalPoint fromWorld(WorldView wv, int x, int y) {
        if (!WorldPoint.isInScene(wv, x, y)) {
            return null;
        }
        int baseX = wv.getBaseX();
        int baseY = wv.getBaseY();
        return LocalPoint.fromScene(x - baseX, y - baseY, wv);
    }

    @Nullable
    public static LocalPoint fromWorld(Scene scene, int x, int y) {
        if (!WorldPoint.isInScene(scene, x, y)) {
            return null;
        }
        int baseX = scene.getBaseX();
        int baseY = scene.getBaseY();
        return LocalPoint.fromScene(x - baseX, y - baseY, scene);
    }

    public int distanceTo(LocalPoint other) {
        if (this.worldView != other.worldView) {
            assert (false);
            return Integer.MAX_VALUE;
        }
        return (int)Math.hypot(this.getX() - other.getX(), this.getY() - other.getY());
    }

    public boolean isInScene() {
        return this.x >= 0 && this.x < 13312 && this.y >= 0 && this.y < 13312;
    }

    @Deprecated
    public static LocalPoint fromScene(int x, int y) {
        return new LocalPoint((x << 7) + 64, (y << 7) + 64);
    }

    public static LocalPoint fromScene(int x, int y, Scene scene) {
        return new LocalPoint((x << 7) + 64, (y << 7) + 64, scene.getWorldViewId());
    }

    public static LocalPoint fromScene(int x, int y, WorldView wv) {
        return new LocalPoint((x << 7) + 64, (y << 7) + 64, wv.getId());
    }

    public int getSceneX() {
        return this.x >> 7;
    }

    public int getSceneY() {
        return this.y >> 7;
    }

    public LocalPoint dx(int dx) {
        return this.plus(dx, 0);
    }

    public LocalPoint dy(int dy) {
        return this.plus(0, dy);
    }

    public LocalPoint plus(int dx, int dy) {
        return new LocalPoint(this.x + dx, this.y + dy, this.worldView);
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int getWorldView() {
        return this.worldView;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof LocalPoint)) {
            return false;
        }
        LocalPoint other = (LocalPoint)o;
        if (this.getX() != other.getX()) {
            return false;
        }
        if (this.getY() != other.getY()) {
            return false;
        }
        return this.getWorldView() == other.getWorldView();
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getX();
        result = result * 59 + this.getY();
        result = result * 59 + this.getWorldView();
        return result;
    }

    public String toString() {
        return "LocalPoint(x=" + this.getX() + ", y=" + this.getY() + ", worldView=" + this.getWorldView() + ")";
    }

    public LocalPoint(int x, int y, int worldView) {
        this.x = x;
        this.y = y;
        this.worldView = worldView;
    }
}

