/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Player
 *  net.unethicalite.api.commons.Rand
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.fishing.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.fishing.SquireFisherConfig;
import gg.squire.fishing.SquireFisherPlugin;
import gg.squire.fishing.tasks.GameEnum;
import java.util.List;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Dropping Fish", priority=50, blocking=true)
public class DroppingFishTask
extends Task {
    
    private final  SquireFisherPlugin J;
    private final  SquireFisherConfig K;
     boolean L;

    public boolean run() {
        h var2;
        if ((this.K.banking( != 0) ? 1 : 0)) {
            return 0;
        }
        if ((Inventory.isFull( != 0) ? 1 : 0) && ((Object)var2.K.fish() == (Object)var2.K.fish()2)f.HOUSE_KEY)) {
            int[] nArray = new int[1];
            nArray[0] = 2;
            if ((Inventory.getCount((int[])nArray) > Inventory.getCount((int[])nArray)2)) {
                int[] nArray2 = new int[1];
                nArray2[0] = 2;
                List var3 = Inventory.getAll((int[])nArray2);
                var3.subList(0, var3.size() - 3).forEach(Item::drop);
                if ((var3.size() > var3.size()2)) {
                    return 1;
                }
            }
        }
        if ((Inventory.contains((int[] == 0)var2.K.fish().j()) ? 1 : 0)) {
            return 0;
        }
        if ((var2.K.tickFishing( != 0) ? 1 : 0) && (var2.a(Players.getLocal( != 0)) ? 1 : 0)) {
            return 0;
        }
        if ((Inventory.getCount((int[])var2.K.fish().j()) < Inventory.getCount((int[])var2.K.fish().j())2)5, (int)6))) {
            return 0;
        }
        if ((var2.K.cutEat( != 0) ? 1 : 0) && (Inventory.getFreeSlots() >= Inventory.getFreeSlots()2)) {
            return 0;
        }
        Inventory.dropAll((int[])this.K.fish().j());
        0;
        return 1;
    }

    private boolean a(Player player) {
        boolean bl;
        if (!(player.getAnimation() != player.getAnimation()2) || !(player.getAnimation() != player.getAnimation()2) || (player.getAnimation() == player.getAnimation()2)) {
            bl = 1;
            0;
            if ((88 + 175 - 93 + 25 ^ 137 + 69 - 172 + 164) == 0) {
                return ((0xDB ^ 0x95 ^ (0x7F ^ 0x3F)) & (0x48 ^ 8 ^ (0x2D ^ 0x63) ^ -1)) != 0;
            }
        } else {
            bl = 0;
        }
        return bl;
    }

    public boolean o() {
        return this.L;
    }

    public void b(boolean bl) {
        this.L = bl;
    }

    static {
        h.var4();
    }

    @Inject
    public DroppingFishTask(SquireFisherPlugin squireFisherPlugin, SquireFisherConfig squireFisherConfig) {
        this.J = squireFisherPlugin;
        this.K = squireFisherConfig;
    }

}

