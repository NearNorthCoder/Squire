package gg.squire.warriorsGuild.tasks.defender.preDragon;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.warriorsGuild.SquireWarriorsGuild;
import gg.squire.warriorsGuild.SquireWarriorsGuildConfig;
import gg.squire.warriorsGuild.model.Defender;
import javax.inject.Inject;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.events.InventoryChanged;
import net.unethicalite.api.movement.Reachable;
@TaskDesc(name = "Resetting for new defender", register = true)
/* loaded from: squire-warriors-guild-0.0.1.jar:gg/squire/warriorsGuild/tasks/defender/preDragon/Reset.class */
public class Reset extends Task {
    private final SquireWarriorsGuild plugin;
    private final SquireWarriorsGuildConfig config;
    private final WorldPoint sw = new WorldPoint(2847, 3554, 2);
    private final WorldPoint ne = new WorldPoint(2874, 3538, 2);
    private boolean shouldReset = false;

    @Inject
    public Reset(SquireWarriorsGuild plugin, SquireWarriorsGuildConfig config) {
        this.plugin = plugin;
        this.config = config;
    }

    private WorldArea getCyclopsArea() {
        return new WorldArea(this.sw, this.ne);
    }

    public boolean run() {
        if (!this.shouldReset) {
            return false;
        }
        NPC kamfreema = NPCs.getNearest(new int[]{2461});
        if (kamfreema != null && Reachable.isInteractable(kamfreema)) {
            this.shouldReset = false;
            return false;
        }
        TileObject door = TileObjects.getNearest(new String[]{"Door"});
        if (door == null || !Reachable.isInteractable(door)) {
            return false;
        }
        door.interact("Open");
        return true;
    }

    @Subscribe
    public void onInventoryChange(InventoryChanged event) {
        Defender[] values;
        if (event.getChangeType() == InventoryChanged.ChangeType.ITEM_ADDED) {
            for (Defender defender : Defender.values()) {
                if (defender.getDefenderType().contains(Integer.valueOf(event.getItemId()))) {
                    this.shouldReset = true;
                    return;
                }
            }
        }
    }
}
