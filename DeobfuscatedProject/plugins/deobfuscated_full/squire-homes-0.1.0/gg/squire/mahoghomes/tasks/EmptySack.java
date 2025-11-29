/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.runelite.api.Player
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 */
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

/* TASK: Emptying sack -> EmptyingsackTask */
@TaskDesc(name="Emptying sack", priority=100)
public class EmptySack
extends Task {
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
        if (!this.config.sack()) {
            return false;
        }
        if (!this.sack.known()) {
            return false;
        }
        Player local = Players.getLocal();
        if (local == null || local.isAnimating() || local.isMoving()) {
            return false;
        }
        Contract contract = this.config.contract();
        if (Inventory.getFreeSlots() >= 10 && this.sack.getPlanks(contract) > 0) {
            Item item = this.sack.getItem();
            if (item == null) {
                return false;
            }
            int removing = Math.min(this.sack.getPlanks(contract), Inventory.getFreeSlots());
            item.interact("Empty");
            this.sleep(3);
            this.sack.remove(contract.ordinal(), removing);
            return true;
        }
        return false;
    }
}

