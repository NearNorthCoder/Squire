package gg.squire.mahoghomes.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mahoghomes.SquireHomesPlugin;
import gg.squire.mahoghomes.manager.FurnitureManager;
import gg.squire.mahoghomes.manager.stairs.StaircaseHandler;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
@TaskDesc(name = "Going up stairs")
/* loaded from: squire-homes-0.1.0.jar:gg/squire/mahoghomes/tasks/HandleStairs.class */
public class HandleStairs extends Task {
    private final SquireHomesPlugin plugin;
    private final FurnitureManager furnitureManager;

    @Inject
    public HandleStairs(SquireHomesPlugin plugin, FurnitureManager furnitureManager) {
        this.plugin = plugin;
        this.furnitureManager = furnitureManager;
    }

    public boolean run() {
        if (this.plugin.isWorkFinished() || this.plugin.getCurrentHome() == null || Bank.isOpen() || !Movement.shouldWalk()) {
            return false;
        }
        TileObject currentFurniture = this.furnitureManager.getCurrentFurniture();
        if (currentFurniture != null && Reachable.isInteractable(currentFurniture)) {
            return false;
        }
        StaircaseHandler staircaseHandler = this.furnitureManager.getStaircaseHandler();
        return staircaseHandler.handle(this.plugin.getCurrentHome().getArea());
    }
}
