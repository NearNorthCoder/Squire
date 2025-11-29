package gg.squire.mahoghomes.tasks.furniture;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mahoghomes.SquireHomesPlugin;
import gg.squire.mahoghomes.manager.FurnitureManager;
import gg.squire.mahoghomes.manager.furniture.FurnitureHandler;
import gg.squire.mahoghomes.model.Home;
import net.runelite.api.GameState;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Handling furniture", priority = 5, blocking = true)
/* loaded from: squire-homes-0.1.0.jar:gg/squire/mahoghomes/tasks/furniture/FurnitureTask.class */
public class FurnitureTask extends Task {
    protected final SquireHomesPlugin plugin;
    private final FurnitureManager furnitureManager;

    @Inject
    public FurnitureTask(SquireHomesPlugin plugin, FurnitureManager furnitureManager) {
        this.plugin = plugin;
        this.furnitureManager = furnitureManager;
    }

    public boolean run() {
        if (Game.getState() != GameState.LOGGED_IN) {
            return false;
        }
        Home currentHome = this.plugin.getCurrentHome();
        Player local = Players.getLocal();
        if (this.plugin.isWorkFinished() || currentHome == null || !currentHome.getArea().contains2D(local.getWorldLocation())) {
            return false;
        }
        if (!Movement.shouldWalk()) {
            return true;
        }
        TileObject furniture = this.furnitureManager.getCurrentFurniture();
        if (furniture == null || furniture.getPlane() != local.getPlane()) {
            return false;
        }
        FurnitureHandler furnitureHandler = this.furnitureManager.getFurnitureHandler();
        if (!furnitureHandler.preInteract(furniture, currentHome)) {
            return true;
        }
        furniture.interact(FurnitureManager.FURNITURE_ACTION_PREDICATE);
        return furnitureHandler.postInteract(furniture);
    }
}
