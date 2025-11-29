/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.mahoghomes.manager.furniture;

import gg.squire.mahoghomes.manager.furniture.FurnitureHandler;
import gg.squire.mahoghomes.model.Home;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;

public class DefaultFurnitureHandler
implements FurnitureHandler {
    @Override
    public boolean preInteract(TileObject furniture, Home home) {
        if (!Reachable.isInteractable((Locatable)furniture) || furniture.getPlane() != Players.getLocal().getPlane()) {
            WorldPoint furniturePoint = furniture.getWorldLocation();
            TileObject door = TileObjects.getNearest((WorldPoint)furniturePoint, to -> to.hasAction("Open"::equals) && home.getArea().contains2D(to.getWorldLocation()) && to.distanceTo(furniturePoint) < 10 && to.getName().toLowerCase().contains("door") && Reachable.isInteractable((Locatable)to));
            if door != null {
                door.interact("Open");
            } else {
                Movement.walkTo((WorldPoint)furniturePoint);
            }
            return false;
        }
        return true;
    }

    @Override
    public boolean postInteract(TileObject furniture) {
        return true;
    }
}

