/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.herblore.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.herblore.HerbloreConfig;
import gg.squire.plugins.herblore.SquireHerblore;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import gg.squire.herblore.tasks.GameEnum3;
import gg.squire.herblore.tasks.HerbloreTaskBase;

@TaskDesc(name="Cleaning herbs")
public class CleaningHerbsTask
extends HerbloreTaskBase {

    static {
        h.lIIIlIllIllllII();
        h.lIIIlIllIlllIll();
    }

    private static boolean lIIIlIllIllllIl(int n) {
        return n != 0;
    }

        return String.valueOf(var1);
    }

    @Inject
    public CleaningHerbsTask(SquireHerblore squireHerblore, HerbloreConfig herbloreConfig) {
        c[] cArray = new c[lllIlIIIIIll[0]];
        cArray[h.lllIlIIIIIll[1]] = c.CLEAN_HERBS;
        cArray[h.lllIlIIIIIll[2]] = c.ALL_STAGES;
        cArray[h.lllIlIIIIIll[3]] = c.ALL_STAGES_ALL_HERBS;
        super(squireHerblore, herbloreConfig, cArray);
    }

    private static void lIIIlIllIlllIll() {
        lllIlIIIIIlI = new String[lllIlIIIIIll[2]];
        h.lllIlIIIIIlI[h.lllIlIIIIIll[1]] = "Clean";
    }

    private static boolean lIIIlIllIlllllI(int n, int n2) {
        return n < n2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean CleaningHerbsTask() {
        void var2;
        h var3;
        int n = this.j().herb().e();
        int[] nArray = new int[lllIlIIIIIll[2]];
        nArray[h.lllIlIIIIIll[1]] = n;
        List list = Inventory.getAll((int[])nArray);
        if (h.lIIIlIllIllllIl(list.isEmpty() ? 1 : 0)) {
            return lllIlIIIIIll[1];
        }
        int var4 = lllIlIIIIIll[1];
        while (h.lIIIlIllIlllllI(var4, Math.min(var3.j().perTick(), var2.size()))) {
            ((Item)var2.get(var4)).interact(lllIlIIIIIlI[lllIlIIIIIll[1]]);
            ++var4;

            if (-(0x1E ^ 0x1A) <= 0) continue;
            return false;
        }
        return lllIlIIIIIll[2];
    }
}

