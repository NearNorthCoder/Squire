/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  net.runelite.api.Item
 *  net.runelite.api.TileItem
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.hydra.tasks;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.hydra.SquireAlchemicalHydraConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;
import gg.squire.hydra.tasks.AHelper;
import gg.squire.hydra.tasks.HydraManager;

@Singleton
public class CHelper {
    
    private final  SquireAlchemicalHydraConfig w;
    private static final  HashMap<String, Integer> v;
    
    public static final  List<String> u;

    public int a(TileItem tileItem) {
        return v.getOrDefault(tileItem.getName(), llllIIIllIll[0]);
    }

    public Optional<Item> r() {
        return Inventory.getAll(item -> {
            int n2;
            if (c.lIIIllllIIlllIl(item.getName()) && c.lIIIllllIIllllI(v.containsKey(item.getName()) ? 1 : 0)) {
                n2 = llllIIIllIll[1];

                if ((0x3B ^ 0x3F) != (7 ^ 3)) {
                    return false;
                }
            } else {
                n2 = llllIIIllIll[0];
            }
            return n2 != 0;
        }).stream().filter(item -> {
            boolean bl;
            if (c.lIIIllllIIlllII(item.getName().equals(llllIIIllIlI[llllIIIllIll[0]]) ? 1 : 0)) {
                bl = llllIIIllIll[1];

                if (((1 ^ 0x33) & ~(0xA0 ^ 0x92)) == -1) {
                    return false;
                }
            } else {
                bl = llllIIIllIll[0];
            }
            return bl;
        }).min(Comparator.comparingInt(item -> v.get(item.getName()) * item.getQuantity()));
    }

    private static boolean lIIIllllIIlllIl(Object object) {
        return object != null;
    }

    @Inject
    public CHelper(SquireAlchemicalHydraConfig squireAlchemicalHydraConfig, a a2) {
        this.w = squireAlchemicalHydraConfig;
    }

        return String.valueOf(var1);
    }

    public boolean a(Item item, TileItem tileItem) {
        boolean bl;
        int n2;
        int n3 = v.get(item.getName()) * item.getQuantity();
        if (c.lIIIllllIIllIll(n3, n2 = v.get(tileItem.getName()) * tileItem.getQuantity())) {
            bl = llllIIIllIll[1];

            if (((0xCE ^ 0x8B) & ~(7 ^ 0x42)) < 0) {
                return false;
            }
        } else {
            bl = llllIIIllIll[0];
        }
        return bl;
    }

    private static boolean lIIIllllIIllllI(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIllllIIlllII(int n2) {
        return n2 == 0;
    }

    static {
        c.lIIIllllIIllIlI();
        c.lIIIllllIIllIIl();
        u = List.of(llllIIIllIlI[llllIIIllIll[1]], llllIIIllIlI[llllIIIllIll[3]], llllIIIllIlI[llllIIIllIll[4]], llllIIIllIlI[llllIIIllIll[5]], llllIIIllIlI[llllIIIllIll[6]]);
        v = new HydraManager();
    }

    private static void lIIIllllIIllIIl() {
        llllIIIllIlI = new String[llllIIIllIll[7]];
        c.llllIIIllIlI[c.llllIIIllIll[0]] = "Coins";
        c.llllIIIllIlI[c.llllIIIllIll[1]] = "Rune platebody";
        c.llllIIIllIlI[c.llllIIIllIll[3]] = "Rune 2h sword";
        c.llllIIIllIlI[c.llllIIIllIll[4]] = "Rune longsword";
        c.llllIIIllIlI[c.llllIIIllIll[5]] = "Rune pickaxe";
        c.llllIIIllIlI[c.llllIIIllIll[6]] = "Rune kiteshield";
    }

    public Optional<TileItem> p() {
        return TileItems.getAll(tileItem -> {
            int n2;
            if (c.lIIIllllIIlllIl(tileItem.getName()) && c.lIIIllllIIllllI(v.containsKey(tileItem.getName()) ? 1 : 0)) {
                n2 = llllIIIllIll[1];

                if (3 < ((0x78 ^ 0x4F) & ~(0x2F ^ 0x18))) {
                    return false;
                }
            } else {
                n2 = llllIIIllIll[0];
            }
            return n2 != 0;
        }).stream().max(Comparator.comparingInt(object -> ((TileItem)object).getQuantity() * v.getOrDefault(((TileItem)object).getName(), llllIIIllIll[2])).thenComparingDouble(object -> -((TileItem)object).getWorldLocation().distanceToHypotenuse(Players.getLocal().getWorldLocation())));
    }

    private static boolean lIIIllllIIllIll(int n2, int n3) {
        return n2 < n3;
    }

    public Optional<TileItem> q() {
        return TileItems.getAll(tileItem -> {
            int n2;
            if (c.lIIIllllIIlllIl(tileItem.getName()) && c.lIIIllllIIllllI(v.containsKey(tileItem.getName()) ? 1 : 0)) {
                n2 = llllIIIllIll[1];

                if (3 < 2) {
                    return false;
                }
            } else {
                n2 = llllIIIllIll[0];
            }
            return n2 != 0;
        }).stream().filter(tileItem -> {
            int n2;
            if (c.lIIIllllIIllllI(tileItem.isStackable() ? 1 : 0)) {
                int[] nArray = new int[llllIIIllIll[1]];
                nArray[c.llllIIIllIll[0]] = tileItem.getId();
                if (c.lIIIllllIIllllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    n2 = llllIIIllIll[1];

                    if (1 > 0) return n2 != 0;
                    return false;
                }
            }
            n2 = llllIIIllIll[0];
            return n2 != 0;
        }).max(Comparator.comparingInt(object -> ((TileItem)object).getQuantity() * v.getOrDefault(((TileItem)object).getName(), llllIIIllIll[2])).thenComparingDouble(object -> -((TileItem)object).getWorldLocation().distanceToHypotenuse(Players.getLocal().getWorldLocation())));
    }
}

