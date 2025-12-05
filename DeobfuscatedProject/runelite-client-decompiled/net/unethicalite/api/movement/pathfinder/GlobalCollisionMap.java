/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Client
 *  net.runelite.api.CollisionData
 *  net.runelite.api.coords.Direction
 *  net.runelite.api.coords.WorldPoint
 *  org.roaringbitmap.RoaringBitmap
 */
package net.unethicalite.api.movement.pathfinder;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.zip.GZIPInputStream;
import net.runelite.api.Client;
import net.runelite.api.CollisionData;
import net.runelite.api.coords.Direction;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.ScenePoint;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.CollisionMap;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.client.Static;
import org.roaringbitmap.RoaringBitmap;

public class GlobalCollisionMap
implements CollisionMap {
    private final RoaringBitmap bitMap;

    public GlobalCollisionMap(RoaringBitmap bitMap) {
        this.bitMap = bitMap;
    }

    public static GlobalCollisionMap fetchFromUrl(String url) throws IOException {
        byte[] bytes;
        try (InputStream is = Walker.class.getResourceAsStream("/regions");){
            if (is == null) {
                GlobalCollisionMap globalCollisionMap = null;
                return globalCollisionMap;
            }
            bytes = new GZIPInputStream(is).readAllBytes();
        }
        RoaringBitmap rbm = new RoaringBitmap();
        rbm.deserialize(ByteBuffer.wrap(bytes));
        rbm.runOptimize();
        return new GlobalCollisionMap(rbm);
    }

    @Override
    public boolean n(int x, int y, int z) {
        int worldPoint = x & 0x3FFF | (y & 0x3FFF) << 14 | z << 28;
        return this.bitMap.contains(worldPoint);
    }

    @Override
    public boolean e(int x, int y, int z) {
        int worldPoint = x & 0x3FFF | (y & 0x3FFF) << 14 | z << 28;
        return this.bitMap.contains(worldPoint | 0x40000000);
    }

    public LocalGlobalCollisionMap withLocalCollisions() {
        return new LocalGlobalCollisionMap(this);
    }

    public static class LocalGlobalCollisionMap
    implements CollisionMap {
        private final GlobalCollisionMap globalCollisionMap;
        private final CollisionData collisionData;

        private LocalGlobalCollisionMap(GlobalCollisionMap globalCollisionMap) {
            this.globalCollisionMap = globalCollisionMap;
            Client client = Static.getClient();
            this.collisionData = client.getCollisionMaps()[client.getPlane()];
        }

        @Override
        public boolean n(int x, int y, int z) {
            WorldPoint current = new WorldPoint(x, y, z);
            if (!current.isInScene(Static.getClient())) {
                return this.globalCollisionMap.n(x, y, z);
            }
            ScenePoint scenePoint = ScenePoint.fromWorld(current);
            int flag = this.collisionData.getFlags()[scenePoint.getX()][scenePoint.getY()];
            if (Reachable.isObstacle(flag)) {
                return false;
            }
            return !Reachable.isWalled(Direction.NORTH, flag);
        }

        @Override
        public boolean e(int x, int y, int z) {
            WorldPoint current = new WorldPoint(x, y, z);
            if (!current.isInScene(Static.getClient())) {
                return this.globalCollisionMap.e(x, y, z);
            }
            ScenePoint scenePoint = ScenePoint.fromWorld(current);
            int flag = this.collisionData.getFlags()[scenePoint.getX()][scenePoint.getY()];
            if (Reachable.isObstacle(flag)) {
                return false;
            }
            return !Reachable.isWalled(Direction.EAST, flag);
        }
    }
}

