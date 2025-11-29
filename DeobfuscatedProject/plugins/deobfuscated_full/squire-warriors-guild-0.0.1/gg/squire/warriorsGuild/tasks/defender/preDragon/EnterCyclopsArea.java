/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.widgets.Prayers
 */
package gg.squire.warriorsGuild.tasks.defender.preDragon;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.warriorsGuild.SquireWarriorsGuild;
import gg.squire.warriorsGuild.SquireWarriorsGuildConfig;
import javax.inject.Inject;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Prayers;

/* TASK: Entering cyclops area -> EnteringcyclopsareaTask */
@TaskDesc(name="Entering cyclops area")
public class EnterCyclopsArea
extends Task {
    private final SquireWarriorsGuild plugin;
    private final SquireWarriorsGuildConfig config;

    @Inject
    public EnterCyclopsArea(SquireWarriorsGuild plugin, SquireWarriorsGuildConfig config) {
        this.plugin = plugin;
        this.config = config;
    }

    public boolean run() {
        NPC kamfreema = NPCs.getNearest((int[])new int[]{2461});
        if (kamfreema == null || !Reachable.isInteractable((Locatable)kamfreema)) {
            return false;
        }
        if (Prayers.getPoints() < 1) {
            return false;
        }
        if (Inventory.getCount((boolean)true, (int[])new int[]{8851}) < 100) {
            return false;
        }
        TileObject door = TileObjects.getNearest((String[])new String[]{"Door"});
        if (door == null) {
            return false;
        }
        if (!Reachable.isInteractable((Locatable)door)) {
            return false;
        }
        door.interact("Open");
        return true;
    }
}

