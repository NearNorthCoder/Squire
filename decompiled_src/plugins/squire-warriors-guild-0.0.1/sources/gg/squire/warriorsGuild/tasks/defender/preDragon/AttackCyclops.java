package gg.squire.warriorsGuild.tasks.defender.preDragon;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.warriorsGuild.SquireWarriorsGuild;
import gg.squire.warriorsGuild.SquireWarriorsGuildConfig;
import javax.inject.Inject;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Prayers;
@TaskDesc(name = "Attacking cyclops")
/* loaded from: squire-warriors-guild-0.0.1.jar:gg/squire/warriorsGuild/tasks/defender/preDragon/AttackCyclops.class */
public class AttackCyclops extends Task {
    private final SquireWarriorsGuild plugin;
    private final SquireWarriorsGuildConfig config;

    @Inject
    public AttackCyclops(SquireWarriorsGuild plugin, SquireWarriorsGuildConfig config) {
        this.plugin = plugin;
        this.config = config;
    }

    public static boolean isNpcCyclops(int npcId) {
        return npcId == 2463 || npcId == 2464 || npcId == 2465 || npcId == 2466 || npcId == 2467 || npcId == 2468 || npcId == 2139 || npcId == 2140 || npcId == 2141 || npcId == 2137 || npcId == 2138 || npcId == 2142;
    }

    public boolean run() {
        if (Prayers.getPoints() < 1) {
            return false;
        }
        NPC kamfreema = NPCs.getNearest(new int[]{2461});
        NPC lorelai = NPCs.getNearest(new int[]{2135});
        if ((kamfreema == null && lorelai == null) || Inventory.getCount(true, new int[]{8851}) == 0) {
            return false;
        }
        NPC mine = NPCs.getNearest(n -> {
            return n.getInteracting() == Players.getLocal() && !n.isDead() && isNpcCyclops(n.getId());
        });
        if (mine == null) {
            mine = NPCs.getNearest(n2 -> {
                return n2.getInteracting() == null && !n2.isDead() && isNpcCyclops(n2.getId());
            });
            if (mine == null) {
                Log.info("Cannot find a cyclops to attack");
                return false;
            }
        }
        if (!Reachable.isInteractable(mine)) {
            return false;
        }
        if (Players.getLocal().getInteracting() != null) {
            Log.info("Already attacking a cyclops");
            return true;
        }
        mine.interact("Attack");
        sleep(4);
        return true;
    }
}
