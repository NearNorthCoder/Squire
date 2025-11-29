/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.saradomin.tasks;

import java.util.Comparator;
import java.util.HashMap;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import gg.squire.saradomin.tasks.SaradominManager;

public class BHelper {
    
    public final  HashMap<String, Integer> i;

    public BHelper() {
        this.i = new SaradominManager(this);
    }

    public HashMap<String, Integer> h() {
        return this.i;
    }

    private static boolean var2(int n2) {
        return n2 != 0;
    }

    public Item g() {
        return Inventory.getAll(item -> {
            int n2;
            if (b.var2(this.i.containsKey(item.getName()) ? 1 : 0) && b.var3(Combat.getMissingHealth())) {
                n2 = var1[0];
                0;
                if ((0x31 ^ 0x35) <= 3) {
                    return ((0x7C ^ 0x44) & ~(0xA3 ^ 0x9B)) != 0;
                }
            } else {
                n2 = var1[1];
            }
            return n2 != 0;
        }).stream().min(Comparator.comparingInt(item -> this.i.get(item.getName()))).orElse(null);
    }

    static {
        b.var4();
    }

    private static boolean var3(int n2) {
        return n2 > 0;
    }

    private static void var4() {
        var1 = new int[2];
        b.var1[0] = 1;
        b.var1[1] = (0x6C ^ 0x7C) & ~(0xB2 ^ 0xA2);
    }
}

