package gg.squire.warriorsGuild.tasks.tokens;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.warriorsGuild.SquireWarriorsGuild;
import gg.squire.warriorsGuild.SquireWarriorsGuildConfig;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;
@TaskDesc(name = "Re-animating armour")
/* loaded from: squire-warriors-guild-0.0.1.jar:gg/squire/warriorsGuild/tasks/tokens/ReanimateArmour.class */
public class ReanimateArmour extends Task {
    private final SquireWarriorsGuild plugin;
    private final SquireWarriorsGuildConfig config;

    @Inject
    public ReanimateArmour(SquireWarriorsGuild plugin, SquireWarriorsGuildConfig config) {
        this.plugin = plugin;
        this.config = config;
    }

    public boolean run() {
        TileObject magicalAnimator;
        if (!Bank.Inventory.containsAllOf(this.config.armourSet().getArmourSetType()) || Inventory.getCount(true, new int[]{8851}) >= this.config.desiredTokens() || Players.getLocal().isAnimating() || Players.getLocal().isMoving() || (magicalAnimator = TileObjects.getNearest(new int[]{23955})) == null || !Reachable.isInteractable(magicalAnimator)) {
            return false;
        }
        magicalAnimator.interact("Animate");
        return true;
    }
}
