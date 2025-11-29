/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank$Inventory
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.warriorsGuild.tasks.tokens;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.warriorsGuild.SquireWarriorsGuild;
import gg.squire.warriorsGuild.SquireWarriorsGuildConfig;
import javax.inject.Inject;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;

/* TASK: Re-animating armour -> Re-AnimatingarmourTask */
@TaskDesc(name="Re-animating armour")
public class ReanimateArmour
extends Task {
    private final SquireWarriorsGuild plugin;
    private final SquireWarriorsGuildConfig config;

    @Inject
    public ReanimateArmour(SquireWarriorsGuild plugin, SquireWarriorsGuildConfig config) {
        this.plugin = plugin;
        this.config = config;
    }

    public boolean run() {
        if (!Bank.Inventory.containsAllOf(this.config.armourSet().getArmourSetType())) {
            return false;
        }
        if (Inventory.getCount((boolean)true, (int[])new int[]{8851}) >= this.config.desiredTokens()) {
            return false;
        }
        if (Players.getLocal().isAnimating() || Players.getLocal().isMoving()) {
            return false;
        }
        TileObject magicalAnimator = TileObjects.getNearest((int[])new int[]{23955});
        if (magicalAnimator == null || !Reachable.isInteractable((Locatable)magicalAnimator)) {
            return false;
        }
        magicalAnimator.interact("Animate");
        return true;
    }
}

