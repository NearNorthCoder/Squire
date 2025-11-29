/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.mahoghomes.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mahoghomes.SquireHomesPlugin;
import gg.squire.mahoghomes.manager.FurnitureManager;
import gg.squire.mahoghomes.manager.stairs.StaircaseHandler;
import javax.inject.Inject;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;

@TaskDesc(name="Going up stairs")
public class HandleStairs
extends Task {
    private final SquireHomesPlugin plugin;
    private final FurnitureManager furnitureManager;

    @Inject
    public HandleStairs(SquireHomesPlugin plugin, FurnitureManager furnitureManager) {
        this.plugin = plugin;
        this.furnitureManager = furnitureManager;
    }

    public boolean run() {
        if (this.plugin.isWorkFinished() || this.plugin.getCurrentHome() == null || Bank.isOpen()) {
            return false;
        }
        if (!Movement.shouldWalk()) {
            return false;
        }
        TileObject currentFurniture = this.furnitureManager.getCurrentFurniture();
        if (currentFurniture != null && Reachable.isInteractable((Locatable)currentFurniture)) {
            return false;
        }
        StaircaseHandler staircaseHandler = this.furnitureManager.getStaircaseHandler();
        return staircaseHandler.handle(this.plugin.getCurrentHome().getArea());
    }
}

