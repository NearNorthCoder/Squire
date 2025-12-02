/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Client
 *  net.runelite.api.CollisionData
 *  net.runelite.api.coords.Direction
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.client.Static
 */
package net.unethicalite.api.movement.pathfinder;

import net.runelite.api.Client;
import net.runelite.api.CollisionData;
import net.runelite.api.coords.Direction;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.ScenePoint;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.CollisionMap;
import net.unethicalite.api.movement.pathfinder.GlobalCollisionMap;
import net.unethicalite.client.Static;

public static class GlobalCollisionMap.LocalGlobalCollisionMap
implements CollisionMap {
    private final GlobalCollisionMap globalCollisionMap;
    private final CollisionData collisionData;

    private GlobalCollisionMap.LocalGlobalCollisionMap(GlobalCollisionMap globalCollisionMap) {
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
