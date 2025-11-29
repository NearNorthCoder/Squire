/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.query.entities.TileObjectQuery
 *  net.unethicalite.api.query.results.SceneEntityQueryResults
 */
package gg.squire.mahoghomes.manager.stairs;

import gg.squire.mahoghomes.manager.stairs.StaircaseHandler;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.query.entities.TileObjectQuery;
import net.unethicalite.api.query.results.SceneEntityQueryResults;

public class DefaultStaircaseHandler
implements StaircaseHandler {
    @Override
    public boolean handle(WorldArea within) {
        TileObject climber = (TileObject)((SceneEntityQueryResults)((TileObjectQuery)((TileObjectQuery)TileObjects.query().names(new String[]{"Ladder", "Staircase"})).filter(climb -> within.contains2D(climb.getWorldLocation()))).results()).nearest();
        return this.climb(climber);
    }

    protected boolean climb(TileObject climber) {
        if climber == null {
            return false;
        }
        if (Reachable.isInteractable((Locatable)climber)) {
            climber.interact(a -> a.startsWith("Climb"));
        } else {
            Movement.walkTo((Locatable)climber);
        }
        return true;
    }
}

