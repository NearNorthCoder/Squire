/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.mahoghomes.manager.furniture;

import gg.squire.mahoghomes.manager.furniture.DefaultFurnitureHandler;
import gg.squire.mahoghomes.model.Home;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;

public class NormanFurnitureHandler
extends DefaultFurnitureHandler {
    private static final WorldArea NORMAN_DOWNSTAIRS = new WorldArea(3035, 3342, 6, 6, 0);

    @Override
    public boolean preInteract(TileObject furniture, Home home) {
        if (furniture.getPlane() == 0 && !NORMAN_DOWNSTAIRS.contains((Locatable)Players.getLocal())) {
            Movement.walkTo((WorldPoint)NORMAN_DOWNSTAIRS.getCenter());
            return false;
        }
        return super.preInteract(furniture, home);
    }
}

