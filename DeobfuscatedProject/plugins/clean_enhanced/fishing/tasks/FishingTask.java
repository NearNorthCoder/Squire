/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Actor
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.fishing.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.fishing.SquireFisherConfig;
import gg.squire.fishing.SquireFisherPlugin;
import net.runelite.api.Actor;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@TaskDesc(name="Fishing")
public class FishingTask
extends Task {
    private static final  Logger O;
    private static final  int P;
    private final  SquireFisherPlugin R;
    private final  SquireFisherConfig Q;

    static {
        j.var2();
        P = 1;
        O = LoggerFactory.getLogger(FishingTask.class);
    }

    @Inject
    public FishingTask(SquireFisherConfig squireFisherConfig, SquireFisherPlugin squireFisherPlugin) {
        this.Q = squireFisherConfig;
        this.R = squireFisherPlugin;
    }

    public boolean run() {
        NPC var3;
        j var4;
        if ((this.R.f( == null))) {
            this.R.a(Players.getLocal().getWorldArea());
            return 0;
        }
        if ((var4.Q.fishingTrawler( != 0) ? 1 : 0)) {
            return 0;
        }
        Actor var5 = Players.getLocal().getInteracting();
        if (var5 != null && (var5.getGraphic() == var5.getGraphic()2)) {
            Movement.setDestination((WorldPoint)Players.getLocal().getWorldLocation());
            return 2;
        }
        if (!(Movement.shouldWalk( != 0) ? 1 : 0) || (Players.getLocal( != null).getInteracting())) {
            return 0;
        }
        if ((Inventory.isFull( != 0) ? 1 : 0)) {
            return 0;
        }
        if ((Bank.isOpen( != 0) ? 1 : 0)) {
            return 0;
        }
        if ((Inventory.contains(var4.Q.fish( == 0).k()) ? 1 : 0)) {
            return 0;
        }
        if ((var4.Q.fish().m() != var4.Q.fish().m()2)) {
            var3 = NPCs.getNearest(nPC -> {
                int n;
                if ((nPC.hasAction(this.Q.fish( != 0).n()) ? 1 : 0) && (nPC.getId() == nPC.getId()2).m())) {
                    n = 2;
                    0;
                    if null != null {
                        return ((0xDD ^ 0xB1 ^ (1 ^ 0x74)) & (0x96 ^ 0x8C ^ 3 ^ -1)) != 0;
                    }
                } else {
                    n = 0;
                }
                return n != 0;
            });
            0;
            if ((0x36 ^ 0x32) == 0) {
                return ((2 ^ 0x12) & ~(0x17 ^ 7)) != 0;
            }
        } else {
            var3 = NPCs.getNearest(nPC -> {
                int n;
                if ((nPC.hasAction(this.Q.fish( != 0).n()) ? 1 : 0) && (nPC.getGraphic() != nPC.getGraphic()2)) {
                    n = 2;
                    0;
                    if ((0xD2 ^ 0x9B ^ (0xC6 ^ 0x8B)) == 2) {
                        return ((0xEF ^ 0xB4 ^ (0x15 ^ 0x46)) & (6 ^ 0x15 ^ (0xB4 ^ 0xAF) ^ -1)) != 0;
                    }
                } else {
                    n = 0;
                }
                return n != 0;
            });
        }
        if var3 != null {
            var3.interact(var4.Q.fish().n());
            return 2;
        }
        Movement.walkTo((WorldArea)this.R.f());
        0;
        return 2;
    }

}

