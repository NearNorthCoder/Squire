package gg.squire.warriorsGuild.tasks.defender.preDragon;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.warriorsGuild.SquireWarriorsGuild;
import gg.squire.warriorsGuild.SquireWarriorsGuildConfig;
import gg.squire.warriorsGuild.model.Defender;
import java.util.ArrayList;
import java.util.Iterator;
import javax.inject.Inject;
import net.runelite.api.TileItem;
import net.runelite.api.events.ItemDespawned;
import net.runelite.api.events.ItemSpawned;
import net.runelite.client.eventbus.Subscribe;
@TaskDesc(name = "Looting defender", register = true)
/* loaded from: squire-warriors-guild-0.0.1.jar:gg/squire/warriorsGuild/tasks/defender/preDragon/LootDefender.class */
public class LootDefender extends Task {
    private final SquireWarriorsGuild plugin;
    private final SquireWarriorsGuildConfig config;
    private final ArrayList<TileItem> list = new ArrayList<>();

    @Inject
    public LootDefender(SquireWarriorsGuild plugin, SquireWarriorsGuildConfig config) {
        this.plugin = plugin;
        this.config = config;
    }

    public boolean run() {
        if (this.list.isEmpty()) {
            return false;
        }
        Iterator<TileItem> it = this.list.iterator();
        while (it.hasNext()) {
            TileItem item = it.next();
            if (item != null) {
                item.interact("Take");
                return true;
            }
        }
        return true;
    }

    @Subscribe
    public void onItemSpawned(ItemSpawned itemSpawned) {
        Defender[] values;
        TileItem item = itemSpawned.getItem();
        for (Defender defender : Defender.values()) {
            if (defender.getDefenderType().contains(Integer.valueOf(item.getId()))) {
                this.list.add(item);
            }
        }
    }

    @Subscribe
    public void onItemDespawned(ItemDespawned itemDespawned) {
        int itemDespawnedId = itemDespawned.getItem().getId();
        this.list.removeIf(tileItem -> {
            return tileItem.getId() == itemDespawnedId;
        });
    }
}
