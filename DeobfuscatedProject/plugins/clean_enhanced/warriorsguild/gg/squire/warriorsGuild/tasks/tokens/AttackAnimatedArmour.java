/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.warriorsGuild.tasks.tokens;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.warriorsGuild.SquireWarriorsGuild;
import gg.squire.warriorsGuild.SquireWarriorsGuildConfig;
import javax.inject.Inject;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Attacking animated armour")
public class AttackAnimatedArmour
extends Task {
    private final SquireWarriorsGuild plugin;
    private final SquireWarriorsGuildConfig config;

    @Inject
    public AttackAnimatedArmour(SquireWarriorsGuild plugin, SquireWarriorsGuildConfig config) {
        this.plugin = plugin;
        this.config = config;
    }

    public boolean run() {
        if (Inventory.getCount((boolean)true, (int[])new int[]{8851}) >= this.config.desiredTokens()) {
            return false;
        }
        Player local = Players.getLocal();
        NPC animatedMithrilArmour = NPCs.getNearest((int[])new int[]{2454});
        if animatedMithrilArmour == null {
            return false;
        }
        if (local.isAnimating() || local.isMoving() || animatedMithrilArmour.getInteracting() == local || local.getInteracting() == animatedMithrilArmour) {
            return false;
        }
        if (animatedMithrilArmour.getInteracting() != null) {
            return false;
        }
        animatedMithrilArmour.interact("Attack");
        return true;
    }
}

