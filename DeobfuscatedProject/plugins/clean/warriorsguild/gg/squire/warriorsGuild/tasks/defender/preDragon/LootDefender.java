/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.TileItem
 *  net.runelite.api.events.ItemDespawned
 *  net.runelite.api.events.ItemSpawned
 *  net.runelite.client.eventbus.Subscribe
 */
package gg.squire.warriorsGuild.tasks.defender.preDragon;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.warriorsGuild.SquireWarriorsGuild;
import gg.squire.warriorsGuild.SquireWarriorsGuildConfig;
import gg.squire.warriorsGuild.model.Defender;
import java.util.ArrayList;
import javax.inject.Inject;
import net.runelite.api.TileItem;
import net.runelite.api.events.ItemDespawned;
import net.runelite.api.events.ItemSpawned;
import net.runelite.client.eventbus.Subscribe;

@TaskDesc(name="Looting defender", register=true)
public class LootDefender
extends Task {
    private final SquireWarriorsGuild plugin;
    private final SquireWarriorsGuildConfig config;
    private final ArrayList<TileItem> list = new ArrayList();

    @Inject
    public LootDefender(SquireWarriorsGuild plugin, SquireWarriorsGuildConfig config) {
        this.plugin = plugin;
        this.config = config;
    }

    public boolean run() {
        if (this.list.isEmpty()) {
            return false;
        }
        for (TileItem item : this.list) {
            if (item == null) continue;
            item.interact("Take");
            return true;
        }
        return true;
    }

    @Subscribe
    public void onItemSpawned(ItemSpawned itemSpawned) {
        TileItem item = itemSpawned.getItem();
        for (Defender defender : Defender.values()) {
            if (!defender.getDefenderType().contains(item.getId())) continue;
            this.list.add(item);
        }
    }

    @Subscribe
    public void onItemDespawned(ItemDespawned itemDespawned) {
        int itemDespawnedId = itemDespawned.getItem().getId();
        this.list.removeIf(tileItem -> tileItem.getId() == itemDespawnedId);
    }
}

