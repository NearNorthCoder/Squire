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

public class b {
    
    public final  HashMap<String, Integer> i;

    public b() {
        this.i = new SaradominManager(this);
    }

    public HashMap<String, Integer> h() {
        return this.i;
    }

    private static boolean lIlIlIlIIIllIlI(int n2) {
        return n2 != 0;
    }

    public Item g() {
        return Inventory.getAll(item -> {
            int n2;
            if (b.lIlIlIlIIIllIlI(this.i.containsKey(item.getName()) ? 1 : 0) && b.lIlIlIlIIIllIll(Combat.getMissingHealth())) {
                n2 = lIIlIIllIIlIl[0];

                if ((0x31 ^ 0x35) <= 3) {
                    return false;
                }
            } else {
                n2 = lIIlIIllIIlIl[1];
            }
            return n2 != 0;
        }).stream().min(Comparator.comparingInt(item -> this.i.get(item.getName()))).orElse(null);
    }

    static {
        b.lIlIlIlIIIllIIl();
    }

    private static boolean lIlIlIlIIIllIll(int n2) {
        return n2 > 0;
    }

}

