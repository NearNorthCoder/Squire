/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileItem
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.game.Prices
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.whisperer.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.game.Prices;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;
import gg.squire.whisperer.tasks.WhispererTaskBase;

@TaskDesc(name="Taking loot", priority=10, blocking=true)
public class TakingLootTask
extends WhispererTaskBase {
    
    private static final  int aa;

    private boolean e(int n2) {
        boolean bl;
        if (s.llIIIIIllIIllIl(Inventory.getFreeSlots(), n2)) {
            bl = lIlIllIllIlIl[1];

            if (-1 >= (0x8D ^ 0x89)) {
                return false;
            }
        } else {
            bl = lIlIllIllIlIl[0];
        }
        return bl;
    }

    @Override
    public boolean p() {
        return lIlIllIllIlIl[0];
    }

    private static boolean llIIIIIllIIllIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llIIIIIllIIllII(Object object) {
        return object != null;
    }

    private static boolean llIIIIIllIIlIlI(int n2) {
        return n2 != 0;
    }

    private static boolean llIIIIIllIIllll(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var1);
    }

    static {
        s.llIIIIIllIIIlll();
        s.llIIIIIllIIIlIl();
        aa = lIlIllIllIlIl[8];
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean run() {
        void var2_2;
        Item var2;
        s var3;
        if (s.llIIIIIllIIlIII(this.W.g() ? 1 : 0)) {
            return lIlIllIllIlIl[0];
        }
        List var4 = TileItems.getAll(tileItem -> {
            boolean bl;
            TileItem var5;
            if (!(s.llIIIIIllIIlIlI(tileItem.isTradable() ? 1 : 0) && s.llIIIIIllIIllIl(Prices.getItemPrice((int)tileItem.getId()) * tileItem.getQuantity(), lIlIllIllIlIl[8]) && s.llIIIIIllIIlIII(tileItem.getName().toLowerCase().contains(lIlIllIllIIIl[lIlIllIllIlIl[9]]) ? 1 : 0) && !s.llIIIIIllIIlIlI(tileItem.getName().toLowerCase().contains(lIlIllIllIIIl[lIlIllIllIlIl[10]]) ? 1 : 0) || !s.llIIIIIllIIlIlI(Reachable.isInteractable((Locatable)var5) ? 1 : 0))) {
                bl = lIlIllIllIlIl[1];

                if ((0x9E ^ 0x9A) > (0xC6 ^ 0xC2)) {
                    return false;
                }
            } else {
                bl = lIlIllIllIlIl[0];
            }
            return bl;
        });
        if (s.llIIIIIllIIlIlI(var4.isEmpty() ? 1 : 0)) {
            return lIlIllIllIlIl[0];
        }
        TileItem var6 = var4.stream().max(Comparator.comparingInt(tileItem -> {
            int n2;
            if (s.llIIIIIllIIlIII(tileItem.isTradable() ? 1 : 0)) {
                n2 = lIlIllIllIlIl[7];

                if (1 > 2) {
                    return (0x9C ^ 0x94) & ~(0x7F ^ 0x77);
                }
            } else {
                TileItem var7;
                n2 = Prices.getItemPrice((int)var7.getId()) * var7.getQuantity();
            }
            return n2;
        })).orElse(null);
        if ((!s.llIIIIIllIIlIII(var6.getName().toLowerCase().contains(lIlIllIllIIIl[lIlIllIllIlIl[0]]) ? 1 : 0) || s.llIIIIIllIIlIlI(var6.getName().toLowerCase().contains(lIlIllIllIIIl[lIlIllIllIlIl[1]]) ? 1 : 0)) && s.llIIIIIllIIlIlI(var3.e(lIlIllIllIlIl[2]) ? 1 : 0)) {
            return lIlIllIllIlIl[0];
        }
        if (s.llIIIIIllIIlIlI(var3.e(lIlIllIllIlIl[1]) ? 1 : 0) && s.llIIIIIllIIllII(var2 = Inventory.getFirst(item -> {
            int n2;
            String[] stringArray = new String[lIlIllIllIlIl[1]];
            stringArray[s.lIlIllIllIlIl[0]] = lIlIllIllIIIl[lIlIllIllIlIl[4]];
            if (s.llIIIIIllIIlIlI(item.hasAction(stringArray) ? 1 : 0) && (!s.llIIIIIllIIlIII(item.getName().toLowerCase().contains(lIlIllIllIIIl[lIlIllIllIlIl[5]]) ? 1 : 0) || s.llIIIIIllIIlIlI(item.getName().toLowerCase().contains(lIlIllIllIIIl[lIlIllIllIlIl[6]]) ? 1 : 0))) {
                n2 = lIlIllIllIlIl[1];

                if (-(0x42 ^ 0x46) > 0) {
                    return false;
                }
            } else {
                n2 = lIlIllIllIlIl[0];
            }
            return n2 != 0;
        }))) {
            var2.interact(lIlIllIllIIIl[lIlIllIllIlIl[2]]);
        }
        var2_2.interact(lIlIllIllIIIl[lIlIllIllIlIl[3]]);
        return lIlIllIllIlIl[1];
    }

    private static void llIIIIIllIIIlIl() {
        lIlIllIllIIIl = new String[lIlIllIllIlIl[11]];
        s.lIlIllIllIIIl[s.lIlIllIllIlIl[0]] = "prayer";
        s.lIlIllIllIIIl[s.lIlIllIllIlIl[1]] = "restore";
        s.lIlIllIllIIIl[s.lIlIllIllIlIl[2]] = "Drop";
        s.lIlIllIllIIIl[s.lIlIllIllIlIl[3]] = "Take";
        s.lIlIllIllIIIl[s.lIlIllIllIlIl[4]] = "Drink";
        s.lIlIllIllIIIl[s.lIlIllIllIlIl[5]] = "prayer";
        s.lIlIllIllIIIl[s.lIlIllIllIlIl[6]] = "restore";
        s.lIlIllIllIIIl[s.lIlIllIllIlIl[9]] = "prayer";
        s.lIlIllIllIIIl[s.lIlIllIllIlIl[10]] = "restore";
    }

    private static boolean llIIIIIllIIlIII(int n2) {
        return n2 == 0;
    }
}

