package gg.squire.mahoghomes.manager.furniture;

import gg.squire.mahoghomes.model.Home;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
/* loaded from: squire-homes-0.1.0.jar:gg/squire/mahoghomes/manager/furniture/RossFurnitureHandler.class */
public class RossFurnitureHandler extends DefaultFurnitureHandler {
    private static final WorldArea ROSS_DOWNSTAIRS = new WorldArea(2611, 3315, 7, 4, 0);

    @Override // gg.squire.mahoghomes.manager.furniture.DefaultFurnitureHandler, gg.squire.mahoghomes.manager.furniture.FurnitureHandler
    public boolean preInteract(TileObject furniture, Home home) {
        if (furniture.getPlane() == 0 && !ROSS_DOWNSTAIRS.contains(Players.getLocal())) {
            TileObject door = TileObjects.getNearest(new int[]{40178});
            door.interact("Open");
            return false;
        }
        return super.preInteract(furniture, home);
    }
}
