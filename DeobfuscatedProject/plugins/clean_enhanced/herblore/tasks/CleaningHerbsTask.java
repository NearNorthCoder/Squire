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
import java.util.List;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import gg.squire.herblore.tasks.GameEnum2;
import gg.squire.herblore.tasks.HerbloreTaskBase;

@TaskDesc(name="Cleaning herbs")
public class CleaningHerbsTask
extends HerbloreTaskBase {

    static {
        h.var3();
        h.var4();
    }

    private static boolean var5(int n) {
        return n != 0;
    }

    private static void var3() {
        var2 = new int[4];
        h.var2[0] = 3;
        h.var2[1] = (0xB ^ 0x5B) & ~(0x2D ^ 0x7D);
        h.var2[2] = 1;
        h.var2[3] = 2;
    }

    private static String var6(String var7, String var8) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var10 = var8.toCharArray();
        int var11 = var2[1];
        char[] var12 = var7.toCharArray();
        int var13 = var12.length;
        int var14 = var2[1];
        while (h.var15(var14, var13)) {
            char var16 = var12[var14];
            var9.append((char)(var16 ^ var10[var11 % var10.length]));
            0;
            ++var11;
            ++var14;
            0;
            if (3 == 3) continue;
            return null;
        }
        return String.valueOf(var9);
    }

    @Inject
    public CleaningHerbsTask(SquireHerblore squireHerblore, HerbloreConfig herbloreConfig) {
        c[] cArray = new c[var2[0]];
        cArray[h.var2[1]] = c.CLEAN_HERBS;
        cArray[h.var2[2]] = c.ALL_STAGES;
        cArray[h.var2[3]] = c.ALL_STAGES_ALL_HERBS;
        super(squireHerblore, herbloreConfig, cArray);
    }

    private static void var4() {
        var1 = new String[var2[2]];
        h.var1[h.var2[1]] = "Clean";
    }

    private static boolean var15(int n, int n2) {
        return n < n2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean CleaningHerbsTask() {
        void var17;
        h var18;
        int n = this.j().herb().e();
        int[] nArray = new int[var2[2]];
        nArray[h.var2[1]] = n;
        List list = Inventory.getAll((int[])nArray);
        if (h.var5(list.isEmpty() ? 1 : 0)) {
            return var2[1];
        }
        int var19 = var2[1];
        while (h.var15(var19, Math.min(var18.j().perTick(), var17.size()))) {
            ((Item)var17.get(var19)).interact(var1[var2[1]]);
            ++var19;
            0;
            if (-(0x1E ^ 0x1A) <= 0) continue;
            return ((0x34 ^ 0x7C) & ~(0x3F ^ 0x77)) != 0;
        }
        return var2[2];
    }
}

