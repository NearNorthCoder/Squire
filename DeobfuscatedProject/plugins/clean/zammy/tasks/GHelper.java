/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.zammy.tasks;

import java.util.Comparator;
import java.util.HashMap;
import gg.squire.zammy.tasks.ZammyManager;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;

public class GHelper {
    
    public final  HashMap<String, Integer> p;

    private static boolean llIIIllIIIllIII(int n2) {
        return n2 != 0;
    }

    public Item w() {
        return Inventory.getAll(item -> {
            int n2;
            if (g.llIIIllIIIllIII(this.p.containsKey(item.getName()) ? 1 : 0) && g.llIIIllIIIllIIl(Combat.getMissingHealth())) {
                n2 = lIllIIlIlIlll[0];

                if (1 < 0) {
                    return ((0x51 ^ 0x3B ^ (0x7D ^ 0x75)) & (0x34 ^ 0x3F ^ (0xE5 ^ 0x8C) ^ -1)) != 0;
                }
            } else {
                n2 = lIllIIlIlIlll[1];
            }
            return n2 != 0;
        }).stream().min(Comparator.comparingInt(item -> this.p.get(item.getName()))).orElse(null);
    }

    private static boolean llIIIllIIIllIIl(int n2) {
        return n2 > 0;
    }

    static {
        g.llIIIllIIIlIlll();
    }

    public GHelper() {
        this.p = new ZammyManager(this);
    }
}

