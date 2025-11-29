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
import gg.squire.runecrafting.tasks.AHelper;
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
        c var1;
        if (!c.llIIIllIlllIIII(this.r.a() ? 1 : 0) || c.llIIIllIlllIIII(this.k() ? 1 : 0)) {
            return lIllIIlllIIII[0];
        }
        List<Item> var2 = var1.l();
        if (c.llIIIllIlllIIII(var2.isEmpty() ? 1 : 0)) {
            return lIllIIlllIIII[0];
        }
        this.a((List<Item>)var1_1);
        return lIllIIlllIIII[1];
    }

    private static boolean llIIIllIlllIIII(int n) {
        return n != 0;
    }

    private List<Item> l() {
        int[] nArray = new int[lIllIIlllIIII[1]];
        nArray[c.lIllIIlllIIII[0]] = lIllIIlllIIII[2];
        return Inventory.getAll((int[])nArray);
    }

    private boolean k() {
        boolean bl;
        if (c.llIIIllIlllIIIl(this.q.j(), this.q.h())) {
            bl = lIllIIlllIIII[1];

            if (1 < 0) {
                return false;
            }
        } else {
            bl = lIllIIlllIIII[0];
        }
        return bl;
    }

    static {
        c.llIIIllIllIllll();
        p = lIllIIlllIIII[3];
    }

    private static boolean llIIIllIlllIIIl(int n, int n2) {
        return n >= n2;
    }

    /*
     * WARNING - void declaration
     */
    private void a(List<Item> list) {
        void var3;
        int n = Math.min(lIllIIlllIIII[3], list.size());
        int var4 = lIllIIlllIIII[0];
        while (c.llIIIllIlllIIlI(var4, (int)var3)) {
            void var5;
            int[] nArray = new int[lIllIIlllIIII[1]];
            nArray[c.lIllIIlllIIII[0]] = lIllIIlllIIII[4];
            ((Item)var5.get(var4)).useOn(Inventory.getFirst((int[])nArray));
            ++var4;

            if (2 != -1) continue;
            return;
        }
    }

    private static boolean llIIIllIlllIIlI(int n, int n2) {
        return n < n2;
    }

    @Inject
    public BreakingEssenceBlocksTask(a a2, SquireZeahRunecrafter squireZeahRunecrafter) {
        this.q = a2;
        this.r = squireZeahRunecrafter;
    }
}

