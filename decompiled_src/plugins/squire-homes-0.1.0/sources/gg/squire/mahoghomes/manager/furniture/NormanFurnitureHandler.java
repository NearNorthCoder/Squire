package gg.squire.mahoghomes.manager.furniture;

import gg.squire.mahoghomes.model.Home;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
/* loaded from: squire-homes-0.1.0.jar:gg/squire/mahoghomes/manager/furniture/NormanFurnitureHandler.class */
public class NormanFurnitureHandler extends DefaultFurnitureHandler {
    private static final WorldArea NORMAN_DOWNSTAIRS = new WorldArea(3035, 3342, 6, 6, 0);

    @Override // gg.squire.mahoghomes.manager.furniture.DefaultFurnitureHandler, gg.squire.mahoghomes.manager.furniture.FurnitureHandler
    public boolean preInteract(TileObject furniture, Home home) {
        if (furniture.getPlane() == 0 && !NORMAN_DOWNSTAIRS.contains(Players.getLocal())) {
            Movement.walkTo(NORMAN_DOWNSTAIRS.getCenter());
            return false;
        }
        return super.preInteract(furniture, home);
    }
}
