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
        h var1;
        if (h.lllIlIlIlIlIIl(this.K.banking() ? 1 : 0)) {
            return lIlllIlIIlIl[0];
        }
        if (h.lllIlIlIlIlIIl(Inventory.isFull() ? 1 : 0) && h.lllIlIlIlIlIlI((Object)var1.K.fish(), (Object)f.HOUSE_KEY)) {
            int[] nArray = new int[lIlllIlIIlIl[1]];
            nArray[h.lIlllIlIIlIl[0]] = lIlllIlIIlIl[2];
            if (h.lllIlIlIlIlIll(Inventory.getCount((int[])nArray), lIlllIlIIlIl[1])) {
                int[] nArray2 = new int[lIlllIlIIlIl[1]];
                nArray2[h.lIlllIlIIlIl[0]] = lIlllIlIIlIl[2];
                List var2 = Inventory.getAll((int[])nArray2);
                var2.subList(lIlllIlIIlIl[0], var2.size() - lIlllIlIIlIl[3]).forEach(Item::drop);
                if (h.lllIlIlIlIlIll(var2.size(), lIlllIlIIlIl[4])) {
                    return lIlllIlIIlIl[1];
                }
            }
        }
        if (h.lllIlIlIlIllII(Inventory.contains((int[])var1.K.fish().j()) ? 1 : 0)) {
            return lIlllIlIIlIl[0];
        }
        if (h.lllIlIlIlIlIIl(var1.K.tickFishing() ? 1 : 0) && h.lllIlIlIlIlIIl(var1.a(Players.getLocal()) ? 1 : 0)) {
            return lIlllIlIIlIl[0];
        }
        if (h.lllIlIlIlIllIl(Inventory.getCount((int[])var1.K.fish().j()), Rand.nextInt((int)lIlllIlIIlIl[5], (int)lIlllIlIIlIl[6]))) {
            return lIlllIlIIlIl[0];
        }
        if (h.lllIlIlIlIlIIl(var1.K.cutEat() ? 1 : 0) && h.lllIlIlIlIlllI(Inventory.getFreeSlots(), lIlllIlIIlIl[5])) {
            return lIlllIlIIlIl[0];
        }
        Inventory.dropAll((int[])this.K.fish().j());

        return lIlllIlIIlIl[1];
    }

    private boolean a(Player player) {
        boolean bl;
        if (!h.lllIlIlIlIllll(player.getAnimation(), lIlllIlIIlIl[7]) || !h.lllIlIlIlIllll(player.getAnimation(), lIlllIlIIlIl[8]) || h.lllIlIlIllIIII(player.getAnimation(), lIlllIlIIlIl[9])) {
            bl = lIlllIlIIlIl[1];

            if ((88 + 175 - 93 + 25 ^ 137 + 69 - 172 + 164) == 0) {
                return ((0xDB ^ 0x95 ^ (0x7F ^ 0x3F)) & (0x48 ^ 8 ^ (0x2D ^ 0x63) ^ -1)) != 0;
            }
        } else {
            bl = lIlllIlIIlIl[0];
        }
        return bl;
    }

    private static boolean lllIlIlIlIlIll(int n, int n2) {
        return n > n2;
    }

    private static boolean lllIlIlIlIlllI(int n, int n2) {
        return n >= n2;
    }

    public boolean o() {
        return this.L;
    }

    private static boolean lllIlIlIlIllII(int n) {
        return n == 0;
    }

    private static boolean lllIlIlIlIllIl(int n, int n2) {
        return n < n2;
    }

    public void b(boolean bl) {
        this.L = bl;
    }

    private static boolean lllIlIlIlIlIlI(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lllIlIlIlIllll(int n, int n2) {
        return n != n2;
    }

    static {
        h.lllIlIlIlIlIII();
    }

    @Inject
    public DroppingFishTask(SquireFisherPlugin squireFisherPlugin, SquireFisherConfig squireFisherConfig) {
        this.J = squireFisherPlugin;
        this.K = squireFisherConfig;
    }

    private static boolean lllIlIlIllIIII(int n, int n2) {
        return n == n2;
    }

    private static boolean lllIlIlIlIlIIl(int n) {
        return n != 0;
    }
}

