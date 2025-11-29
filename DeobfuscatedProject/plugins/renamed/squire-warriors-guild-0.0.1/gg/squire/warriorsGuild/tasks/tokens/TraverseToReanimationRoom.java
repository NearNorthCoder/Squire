/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.warriorsGuild.tasks.tokens;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.warriorsGuild.SquireWarriorsGuild;
import gg.squire.warriorsGuild.SquireWarriorsGuildConfig;
import javax.inject.Inject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;

/* TASK: Traversing to the reanimation room -> TraversingtothereanimationroomTask */
@TaskDesc(name="Traversing to the reanimation room")
public class TraverseToReanimationRoom
extends Task {
    private final SquireWarriorsGuild plugin;
    private final SquireWarriorsGuildConfig config;

    @Inject
    public TraverseToReanimationRoom(SquireWarriorsGuild plugin, SquireWarriorsGuildConfig config) {
        this.plugin = plugin;
        this.config = config;
    }

    private WorldPoint getTopFloor() {
        return new WorldPoint(2845, 3540, 2);
    }

    public boolean run() {
        if (!Movement.shouldWalk()) {
            return false;
        }
        if (Players.getLocal().getPlane() == 2) {
            return false;
        }
        Movement.walkTo((WorldPoint)this.getTopFloor());
        return true;
    }
}

