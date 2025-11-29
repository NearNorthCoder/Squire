/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.bandos.tasks;

import java.util.Comparator;
import java.util.HashMap;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import gg.squire.bandos.tasks.BandosManager;

public class GHelper {
    public final  HashMap<String, Integer> v;

    private static boolean var2(int n2) {
        return n2 > 0;
    }

    public GHelper() {
        this.v = new BandosManager(this);
    }

    private static void var3() {
        var1 = new int[2];
        g.var1[0] = 1;
        g.var1[1] = (0x3E ^ 0x2B) & ~(0x70 ^ 0x65);
    }

    private static boolean var4(int n2) {
        return n2 != 0;
    }

    public Item G() {
        return Inventory.getAll(item -> {
            int n2;
            if (g.var4(this.v.containsKey(item.getName()) ? 1 : 0) && g.var2(Combat.getMissingHealth())) {
                n2 = var1[0];
                0;
                if (3 <= ((0xFD ^ 0xBF ^ (0xE2 ^ 0x94)) & (76 + 101 - 144 + 120 ^ 8 + 57 - 44 + 152 ^ -1))) {
                    return ((86 + 51 - 5 + 40 ^ 96 + 47 - 135 + 138) & (107 + 132 - 189 + 138 ^ 41 + 12 - -54 + 23 ^ -1)) != 0;
                }
            } else {
                n2 = var1[1];
            }
            return n2 != 0;
        }).stream().min(Comparator.comparingInt(item -> this.v.get(item.getName()))).orElse(null);
    }

    static {
        g.var3();
    }
}

