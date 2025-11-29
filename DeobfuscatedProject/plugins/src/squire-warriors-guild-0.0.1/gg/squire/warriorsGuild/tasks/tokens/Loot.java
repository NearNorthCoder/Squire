/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.TileItem
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ItemDespawned
 *  net.runelite.api.events.ItemSpawned
 *  net.runelite.client.eventbus.Subscribe
 */
package gg.squire.warriorsGuild.tasks.tokens;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.warriorsGuild.SquireWarriorsGuild;
import gg.squire.warriorsGuild.SquireWarriorsGuildConfig;
import gg.squire.warriorsGuild.model.ArmourSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import net.runelite.api.TileItem;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ItemDespawned;
import net.runelite.api.events.ItemSpawned;
import net.runelite.client.eventbus.Subscribe;

@TaskDesc(name="Attacking animated armour", register=true)
public class Loot
extends Task {
    private final SquireWarriorsGuild plugin;
    private final SquireWarriorsGuildConfig config;
    private final WorldPoint sw = new WorldPoint(1762, 3543, 0);
    private final WorldPoint ne = new WorldPoint(1780, 3557, 0);
    private final ArrayList<TileItem> list = new ArrayList();

    @Inject
    public Loot(SquireWarriorsGuild plugin, SquireWarriorsGuildConfig config) {
        this.plugin = plugin;
        this.config = config;
    }

    private WorldArea getPloughArea() {
        return new WorldArea(this.sw, this.ne);
    }

    public boolean run() {
        if (this.list.isEmpty()) {
            return false;
        }
        Iterator<TileItem> iterator = this.list.iterator();
        if (iterator.hasNext()) {
            TileItem item = iterator.next();
            if (item == null) {
                return false;
            }
            item.interact("Take");
            return true;
        }
        return true;
    }

    @Subscribe
    public void onItemSpawned(ItemSpawned itemSpawned) {
        TileItem item = itemSpawned.getItem();
        ArmourSet currentArmourSet = this.config.armourSet();
        List<Integer> armourSetIds = currentArmourSet.getArmourSetType();
        if (item.getId() == 8851 || armourSetIds.contains(item.getId())) {
            System.out.println("Adding item to list" + item.getId() + " " + item.getName());
            this.list.add(item);
        }
    }

    @Subscribe
    public void onItemDespawned(ItemDespawned itemDespawned) {
        int itemDespawnedId = itemDespawned.getItem().getId();
        this.list.removeIf(tileItem -> tileItem.getId() == itemDespawnedId);
    }
}

