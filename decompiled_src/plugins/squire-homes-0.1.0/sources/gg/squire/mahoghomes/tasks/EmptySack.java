package gg.squire.mahoghomes.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mahoghomes.SquireHomesConfig;
import gg.squire.mahoghomes.SquireHomesPlugin;
import gg.squire.mahoghomes.model.Contract;
import gg.squire.mahoghomes.model.PlankSack;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Emptying sack", priority = 100)
/* loaded from: squire-homes-0.1.0.jar:gg/squire/mahoghomes/tasks/EmptySack.class */
public class EmptySack extends Task {
    private final SquireHomesPlugin plugin;
    private final SquireHomesConfig config;
    private final PlankSack sack;

    @Inject
    public EmptySack(SquireHomesPlugin plugin, SquireHomesConfig config, PlankSack sack) {
        this.plugin = plugin;
        this.config = config;
        this.sack = sack;
    }

    public boolean run() {
        Player local;
        Item item;
        if (!this.config.sack() || !this.sack.known() || (local = Players.getLocal()) == null || local.isAnimating() || local.isMoving()) {
            return false;
        }
        Contract contract = this.config.contract();
        if (Inventory.getFreeSlots() < 10 || this.sack.getPlanks(contract) <= 0 || (item = this.sack.getItem()) == null) {
            return false;
        }
        int removing = Math.min(this.sack.getPlanks(contract), Inventory.getFreeSlots());
        item.interact("Empty");
        sleep(3);
        this.sack.remove(contract.ordinal(), removing);
        return true;
    }
}
