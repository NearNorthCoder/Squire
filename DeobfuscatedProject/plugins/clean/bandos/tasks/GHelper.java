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

    private static boolean lIlIllIIlllIlI(int n2) {
        return n2 > 0;
    }

    public GHelper() {
        this.v = new BandosManager(this);
    }

    private static boolean lIlIllIIlllIIl(int n2) {
        return n2 != 0;
    }

    public Item G() {
        return Inventory.getAll(item -> {
            int n2;
            if (g.lIlIllIIlllIIl(this.v.containsKey(item.getName()) ? 1 : 0) && g.lIlIllIIlllIlI(Combat.getMissingHealth())) {
                n2 = lllIIIIlIII[0];

                if (3 <= ((0xFD ^ 0xBF ^ (0xE2 ^ 0x94)) & (76 + 101 - 144 + 120 ^ 8 + 57 - 44 + 152 ^ -1))) {
                    return false;
                }
            } else {
                n2 = lllIIIIlIII[1];
            }
            return n2 != 0;
        }).stream().min(Comparator.comparingInt(item -> this.v.get(item.getName()))).orElse(null);
    }

    static {
        g.lIlIllIIlllIII();
    }
}

