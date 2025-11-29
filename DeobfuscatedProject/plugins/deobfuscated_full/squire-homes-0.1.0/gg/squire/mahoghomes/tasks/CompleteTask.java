/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.DialogOption
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.mahoghomes.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mahoghomes.SquireHomesPlugin;
import gg.squire.mahoghomes.model.Home;
import javax.inject.Inject;
import net.runelite.api.DialogOption;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Dialog;

/* TASK: Finishing Task -> FinishingtaskTask */
@TaskDesc(name="Finishing Task", priority=35)
public class CompleteTask
extends Task {
    private final SquireHomesPlugin plugin;

    @Inject
    public CompleteTask(SquireHomesPlugin plugin) {
        this.plugin = plugin;
    }

    public boolean run() {
        TileObject climber;
        if (!this.plugin.isWorkFinished() || Bank.isOpen()) {
            return false;
        }
        Home home = this.plugin.getCurrentHome();
        if (home == null || !home.getArea().contains2D(Players.getLocal().getWorldLocation())) {
            return false;
        }
        if (Dialog.isOpen()) {
            Dialog.invokeDialog((DialogOption[])new DialogOption[]{DialogOption.PLAYER_CONTINUE, DialogOption.NPC_CONTINUE, DialogOption.CHAT_OPTION_ONE, DialogOption.PLAYER_CONTINUE});
            return true;
        }
        NPC worker = NPCs.getNearest((int[])new int[]{home.getNpcId()});
        if (worker != null) {
            if (Reachable.isInteractable((Locatable)worker)) {
                worker.interact("Talk-to");
            } else if (Movement.shouldWalk()) {
                Movement.walkTo((Locatable)worker);
            }
            return true;
        }
        if (Players.getLocal().getPlane() == 1 && (climber = TileObjects.getNearest((int[])home.getLadderIds())) != null) {
            if (!Reachable.isInteractable((Locatable)climber)) {
                Movement.walkTo((Locatable)climber);
                return true;
            }
            climber.interact("Climb-down");
            this.sleep(3);
            return true;
        }
        return false;
    }
}

