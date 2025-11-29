package gg.squire.warriorsGuild.tasks.tokens;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.warriorsGuild.SquireWarriorsGuild;
import gg.squire.warriorsGuild.SquireWarriorsGuildConfig;
import javax.inject.Inject;
import net.runelite.api.Actor;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Attacking animated armour")
/* loaded from: squire-warriors-guild-0.0.1.jar:gg/squire/warriorsGuild/tasks/tokens/AttackAnimatedArmour.class */
public class AttackAnimatedArmour extends Task {
    private final SquireWarriorsGuild plugin;
    private final SquireWarriorsGuildConfig config;

    @Inject
    public AttackAnimatedArmour(SquireWarriorsGuild plugin, SquireWarriorsGuildConfig config) {
        this.plugin = plugin;
        this.config = config;
    }

    public boolean run() {
        if (Inventory.getCount(true, new int[]{8851}) >= this.config.desiredTokens()) {
            return false;
        }
        Actor local = Players.getLocal();
        Actor nearest = NPCs.getNearest(new int[]{2454});
        if (nearest == null || local.isAnimating() || local.isMoving() || nearest.getInteracting() == local || local.getInteracting() == nearest || nearest.getInteracting() != null) {
            return false;
        }
        nearest.interact("Attack");
        return true;
    }
}
