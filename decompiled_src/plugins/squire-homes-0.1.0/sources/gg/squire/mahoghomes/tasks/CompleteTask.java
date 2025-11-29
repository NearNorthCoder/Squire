package gg.squire.mahoghomes.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mahoghomes.SquireHomesPlugin;
import gg.squire.mahoghomes.model.Home;
import javax.inject.Inject;
import net.runelite.api.DialogOption;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Dialog;
@TaskDesc(name = "Finishing Task", priority = 35)
/* loaded from: squire-homes-0.1.0.jar:gg/squire/mahoghomes/tasks/CompleteTask.class */
public class CompleteTask extends Task {
    private final SquireHomesPlugin plugin;

    @Inject
    public CompleteTask(SquireHomesPlugin plugin) {
        this.plugin = plugin;
    }

    public boolean run() {
        Home home;
        TileObject climber;
        if (!this.plugin.isWorkFinished() || Bank.isOpen() || (home = this.plugin.getCurrentHome()) == null || !home.getArea().contains2D(Players.getLocal().getWorldLocation())) {
            return false;
        }
        if (Dialog.isOpen()) {
            Dialog.invokeDialog(new DialogOption[]{DialogOption.PLAYER_CONTINUE, DialogOption.NPC_CONTINUE, DialogOption.CHAT_OPTION_ONE, DialogOption.PLAYER_CONTINUE});
            return true;
        }
        NPC worker = NPCs.getNearest(new int[]{home.getNpcId()});
        if (worker != null) {
            if (Reachable.isInteractable(worker)) {
                worker.interact("Talk-to");
                return true;
            } else if (Movement.shouldWalk()) {
                Movement.walkTo(worker);
                return true;
            } else {
                return true;
            }
        } else if (Players.getLocal().getPlane() == 1 && (climber = TileObjects.getNearest(home.getLadderIds())) != null) {
            if (!Reachable.isInteractable(climber)) {
                Movement.walkTo(climber);
                return true;
            }
            climber.interact("Climb-down");
            sleep(3);
            return true;
        } else {
            return false;
        }
    }
}
