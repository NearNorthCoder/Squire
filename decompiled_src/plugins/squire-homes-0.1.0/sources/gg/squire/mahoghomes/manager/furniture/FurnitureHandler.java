package gg.squire.mahoghomes.manager.furniture;

import gg.squire.mahoghomes.model.Home;
import net.runelite.api.TileObject;
/* loaded from: squire-homes-0.1.0.jar:gg/squire/mahoghomes/manager/furniture/FurnitureHandler.class */
public interface FurnitureHandler {
    boolean preInteract(TileObject tileObject, Home home);

    boolean postInteract(TileObject tileObject);
}
