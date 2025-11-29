package gg.squire.mahoghomes.manager.furniture;

import gg.squire.mahoghomes.model.Home;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.TileObjects;
/* loaded from: squire-homes-0.1.0.jar:gg/squire/mahoghomes/manager/furniture/JeffFurnitureHandler.class */
public class JeffFurnitureHandler extends DefaultFurnitureHandler {
    private static final WorldPoint SHELVES_POINT = new WorldPoint(3241, 3447, 0);
    private static final WorldPoint DOOR_POINT = new WorldPoint(3238, 3450, 0);

    @Override // gg.squire.mahoghomes.manager.furniture.DefaultFurnitureHandler, gg.squire.mahoghomes.manager.furniture.FurnitureHandler
    public boolean preInteract(TileObject furniture, Home home) {
        if (furniture.getWorldLocation().equals(SHELVES_POINT)) {
            TileObject door = TileObjects.getFirstAt(DOOR_POINT, new int[]{11775});
            if (door == null) {
                return true;
            }
            if (door.hasAction((v1) -> {
                return r1.equals(v1);
            })) {
                door.interact("Open");
                return false;
            }
        }
        return super.preInteract(furniture, home);
    }
}
