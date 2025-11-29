package gg.squire.mahoghomes.manager.stairs;

import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.query.entities.TileObjectQuery;
import net.unethicalite.api.query.results.SceneEntityQueryResults;
/* loaded from: squire-homes-0.1.0.jar:gg/squire/mahoghomes/manager/stairs/DefaultStaircaseHandler.class */
public class DefaultStaircaseHandler implements StaircaseHandler {
    @Override // gg.squire.mahoghomes.manager.stairs.StaircaseHandler
    public boolean handle(WorldArea within) {
        TileObject climber = (TileObject) ((SceneEntityQueryResults) ((TileObjectQuery) TileObjects.query().names(new String[]{"Ladder", "Staircase"}).filter(climb -> {
            return within.contains2D(climb.getWorldLocation());
        })).results()).nearest();
        return climb(climber);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean climb(TileObject climber) {
        if (climber == null) {
            return false;
        }
        if (Reachable.isInteractable(climber)) {
            climber.interact(a -> {
                return a.startsWith("Climb");
            });
            return true;
        }
        Movement.walkTo(climber);
        return true;
    }
}
