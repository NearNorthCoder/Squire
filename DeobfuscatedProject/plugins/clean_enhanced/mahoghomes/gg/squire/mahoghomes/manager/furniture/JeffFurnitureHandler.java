/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.TileObjects
 */
package gg.squire.mahoghomes.manager.furniture;

import gg.squire.mahoghomes.manager.furniture.DefaultFurnitureHandler;
import gg.squire.mahoghomes.model.Home;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.TileObjects;

public class JeffFurnitureHandler
extends DefaultFurnitureHandler {
    private static final WorldPoint SHELVES_POINT = new WorldPoint(3241, 3447, 0);
    private static final WorldPoint DOOR_POINT = new WorldPoint(3238, 3450, 0);

    @Override
    public boolean preInteract(TileObject furniture, Home home) {
        if (furniture.getWorldLocation().equals((Object)SHELVES_POINT)) {
            TileObject door = TileObjects.getFirstAt((WorldPoint)DOOR_POINT, (int[])new int[]{11775});
            if door == null {
                return true;
            }
            if (door.hasAction("Open"::equals)) {
                door.interact("Open");
                return false;
            }
        }
        return super.preInteract(furniture, home);
    }
}

