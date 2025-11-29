package gg.squire.warriorsGuild.tasks.defender.preDragon;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.warriorsGuild.SquireWarriorsGuild;
import gg.squire.warriorsGuild.SquireWarriorsGuildConfig;
import javax.inject.Inject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Traversing to the top floor")
/* loaded from: squire-warriors-guild-0.0.1.jar:gg/squire/warriorsGuild/tasks/defender/preDragon/TraverseToTopFloor.class */
public class TraverseToTopFloor extends Task {
    private final SquireWarriorsGuild plugin;
    private final SquireWarriorsGuildConfig config;

    @Inject
    public TraverseToTopFloor(SquireWarriorsGuild plugin, SquireWarriorsGuildConfig config) {
        this.plugin = plugin;
        this.config = config;
    }

    private WorldPoint getTopFloor() {
        return new WorldPoint(2845, 3540, 2);
    }

    public boolean run() {
        if (Inventory.getCount(true, new int[]{8851}) < this.config.desiredTokens() || !Movement.shouldWalk() || Players.getLocal().getPlane() == 2) {
            return false;
        }
        Movement.walkTo(getTopFloor());
        return true;
    }
}
