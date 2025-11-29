package gg.squire.warriorsGuild.tasks.defender.preDragon;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.warriorsGuild.SquireWarriorsGuild;
import gg.squire.warriorsGuild.SquireWarriorsGuildConfig;
import javax.inject.Inject;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Prayers;
@TaskDesc(name = "Entering cyclops area")
/* loaded from: squire-warriors-guild-0.0.1.jar:gg/squire/warriorsGuild/tasks/defender/preDragon/EnterCyclopsArea.class */
public class EnterCyclopsArea extends Task {
    private final SquireWarriorsGuild plugin;
    private final SquireWarriorsGuildConfig config;

    @Inject
    public EnterCyclopsArea(SquireWarriorsGuild plugin, SquireWarriorsGuildConfig config) {
        this.plugin = plugin;
        this.config = config;
    }

    public boolean run() {
        TileObject door;
        NPC kamfreema = NPCs.getNearest(new int[]{2461});
        if (kamfreema == null || !Reachable.isInteractable(kamfreema) || Prayers.getPoints() < 1 || Inventory.getCount(true, new int[]{8851}) < 100 || (door = TileObjects.getNearest(new String[]{"Door"})) == null || !Reachable.isInteractable(door)) {
            return false;
        }
        door.interact("Open");
        return true;
    }
}
