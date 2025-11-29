/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.runecrafting.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireZeahRunecrafter;
import gg.squire.runecrafting.tasks.RunecraftingManager;
import java.util.List;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Breaking Essence Blocks")
public class BreakingEssenceBlocksTask
extends Task {
    
    private final  a q;
    private static final  int p;
    private final  SquireZeahRunecrafter r;

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        c var2;
        if (!(this.r.a( != 0) ? 1 : 0) || (this.k( != 0) ? 1 : 0)) {
            return 0;
        }
        List<Item> var3 = var2.l();
        if ((var3.isEmpty( != 0) ? 1 : 0)) {
            return 0;
        }
        this.a((List<Item>)var1_1);
        return 1;
    }

    private List<Item> l() {
        int[] nArray = new int[1];
        nArray[0] = 2;
        return Inventory.getAll((int[])nArray);
    }

    private boolean k() {
        boolean bl;
        if ((this.q.j() >= this.q.j()2))) {
            bl = 1;
            0;
            if (1 < 0) {
                return ((0x40 ^ 0x56) & ~(0x6B ^ 0x7D)) != 0;
            }
        } else {
            bl = 0;
        }
        return bl;
    }

    static {
        c.var4();
        p = 3;
    }

    /*
     * WARNING - void declaration
     */
    private void a(List<Item> list) {
        void var5;
        int n = Math.min(3, list.size());
        int var6 = 0;
        while ((var6 < var5)) {
            void var7;
            int[] nArray = new int[1];
            nArray[0] = 4;
            ((Item)var7.get(var6)).useOn(Inventory.getFirst((int[])nArray));
            ++var6;
            0;
            if (2 != -1) continue;
            return;
        }
    }

    @Inject
    public BreakingEssenceBlocksTask(a a2, SquireZeahRunecrafter squireZeahRunecrafter) {
        this.q = a2;
        this.r = squireZeahRunecrafter;
    }
}

