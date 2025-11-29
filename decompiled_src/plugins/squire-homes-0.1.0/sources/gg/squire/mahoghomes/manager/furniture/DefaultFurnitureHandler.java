package gg.squire.mahoghomes.manager.furniture;

import gg.squire.mahoghomes.model.Home;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
/* loaded from: squire-homes-0.1.0.jar:gg/squire/mahoghomes/manager/furniture/DefaultFurnitureHandler.class */
public class DefaultFurnitureHandler implements FurnitureHandler {
    @Override // gg.squire.mahoghomes.manager.furniture.FurnitureHandler
    public boolean preInteract(TileObject furniture, Home home) {
        if (!Reachable.isInteractable(furniture) || furniture.getPlane() != Players.getLocal().getPlane()) {
            WorldPoint furniturePoint = furniture.getWorldLocation();
            TileObject door = TileObjects.getNearest(furniturePoint, to -> {
                return to.hasAction((v1) -> {
                    return r1.equals(v1);
                }) && home.getArea().contains2D(to.getWorldLocation()) && to.distanceTo(furniturePoint) < 10 && to.getName().toLowerCase().contains("door") && Reachable.isInteractable(to);
            });
            if (door != null) {
                door.interact("Open");
                return false;
            }
            Movement.walkTo(furniturePoint);
            return false;
        }
        return true;
    }

    @Override // gg.squire.mahoghomes.manager.furniture.FurnitureHandler
    public boolean postInteract(TileObject furniture) {
        return true;
    }
}
