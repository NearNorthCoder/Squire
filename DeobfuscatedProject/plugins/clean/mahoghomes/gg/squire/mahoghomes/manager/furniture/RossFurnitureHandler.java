/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 */
package gg.squire.mahoghomes.manager.furniture;

import gg.squire.mahoghomes.manager.furniture.DefaultFurnitureHandler;
import gg.squire.mahoghomes.model.Home;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;

public class RossFurnitureHandler
extends DefaultFurnitureHandler {
    private static final WorldArea ROSS_DOWNSTAIRS = new WorldArea(2611, 3315, 7, 4, 0);

    @Override
    public boolean preInteract(TileObject furniture, Home home) {
        if (furniture.getPlane() == 0 && !ROSS_DOWNSTAIRS.contains((Locatable)Players.getLocal())) {
            TileObject door = TileObjects.getNearest((int[])new int[]{40178});
            door.interact("Open");
            return false;
        }
        return super.preInteract(furniture, home);
    }
}

