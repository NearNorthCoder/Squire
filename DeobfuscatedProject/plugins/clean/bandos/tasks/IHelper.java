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
package gg.squire.bandos.tasks;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.bandos.SquireBandosConfig;
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
import gg.squire.bandos.tasks.EHelper;
import gg.squire.bandos.tasks.BandosManager;

@Singleton
public class IHelper {
    private final  SquireBandosConfig A;
    private static final  HashMap<String, Integer> y;
    
    private final  e z;
    public static final  List<String> x;

    static {
        i.lIlIlllIIIllII();
        i.lIlIlllIIIlIll();
        x = List.of(lllIIIllIlI[lllIIIllIll[1]], lllIIIllIlI[lllIIIllIll[3]], lllIIIllIlI[lllIIIllIll[4]], lllIIIllIlI[lllIIIllIll[5]], lllIIIllIlI[lllIIIllIll[6]]);
        y = new BandosManager();
    }

    public Optional<TileItem> H() {
        return TileItems.getAll(tileItem -> {
            int n2;
            if (i.lIlIlllIIlIIII(this.z.b(tileItem.getWorldLocation()) ? 1 : 0) && i.lIlIlllIIIllll(tileItem.getName()) && i.lIlIlllIIlIIII(y.containsKey(tileItem.getName()) ? 1 : 0)) {
                n2 = lllIIIllIll[1];

                if ((0x3E ^ 0x3A) < 0) {
                    return false;
                }
            } else {
                n2 = lllIIIllIll[0];
            }
            return n2 != 0;
        }).stream().filter(tileItem -> {
            boolean bl;
            if (!i.lIlIlllIIIlllI(this.A.alch() ? 1 : 0) || i.lIlIlllIIIlllI(x.contains(tileItem.getName()) ? 1 : 0)) {
                bl = lllIIIllIll[1];

                if (1 <= 0) {
                    return false;
                }
            } else {
                bl = lllIIIllIll[0];
            }
            return bl;
        }).max(Comparator.comparingInt(object -> ((TileItem)object).getQuantity() * y.getOrDefault(((TileItem)object).getName(), lllIIIllIll[2])).thenComparingDouble(object -> -((TileItem)object).getWorldLocation().distanceToHypotenuse(Players.getLocal().getWorldLocation())));
    }

    private static boolean lIlIlllIIlIIII(int n2) {
        return n2 != 0;
    }

    public Optional<TileItem> I() {
        return TileItems.getAll(tileItem -> {
            int n2;
            if (i.lIlIlllIIlIIII(this.z.b(tileItem.getWorldLocation()) ? 1 : 0) && i.lIlIlllIIIllll(tileItem.getName()) && i.lIlIlllIIlIIII(y.containsKey(tileItem.getName()) ? 1 : 0)) {
                n2 = lllIIIllIll[1];

                if (3 > (0x4A ^ 0x3B ^ (0xED ^ 0x98))) {
                    return ((0x55 ^ 0x1A ^ (0x18 ^ 0x59)) & (9 + 107 - -60 + 9 ^ 121 + 17 - -35 + 10 ^ -1)) != 0;
                }
            } else {
                n2 = lllIIIllIll[0];
            }
            return n2 != 0;
        }).stream().filter(tileItem -> {
            int n2;
            if (i.lIlIlllIIlIIII(tileItem.isStackable() ? 1 : 0)) {
                int[] nArray = new int[lllIIIllIll[1]];
                nArray[i.lllIIIllIll[0]] = tileItem.getId();
                if (i.lIlIlllIIlIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    n2 = lllIIIllIll[1];

                    if (((0x38 ^ 0xF) & ~(0x6F ^ 0x58)) == ((0xD5 ^ 0xC4) & ~(0x9C ^ 0x8D))) return n2 != 0;
                    return false;
                }
            }
            n2 = lllIIIllIll[0];
            return n2 != 0;
        }).max(Comparator.comparingInt(object -> ((TileItem)object).getQuantity() * y.getOrDefault(((TileItem)object).getName(), lllIIIllIll[2])).thenComparingDouble(object -> -((TileItem)object).getWorldLocation().distanceToHypotenuse(Players.getLocal().getWorldLocation())));
    }

    private static boolean lIlIlllIIIlllI(int n2) {
        return n2 == 0;
    }

    @Inject
    public IHelper(e e2, SquireBandosConfig squireBandosConfig) {
        this.z = e2;
        this.A = squireBandosConfig;
    }

    private static void lIlIlllIIIlIll() {
        lllIIIllIlI = new String[lllIIIllIll[7]];
        i.lllIIIllIlI[i.lllIIIllIll[0]] = "Coins";
        i.lllIIIllIlI[i.lllIIIllIll[1]] = "Rune platebody";
        i.lllIIIllIlI[i.lllIIIllIll[3]] = "Rune 2h sword";
        i.lllIIIllIlI[i.lllIIIllIll[4]] = "Rune longsword";
        i.lllIIIllIlI[i.lllIIIllIll[5]] = "Rune pickaxe";
        i.lllIIIllIlI[i.lllIIIllIll[6]] = "Rune kiteshield";
    }

    public Optional<Item> J() {
        return Inventory.getAll(item -> {
            int n2;
            if (i.lIlIlllIIIllll(item.getName()) && i.lIlIlllIIlIIII(y.containsKey(item.getName()) ? 1 : 0)) {
                n2 = lllIIIllIll[1];

                }
            } else {
                n2 = lllIIIllIll[0];
            }
            return n2 != 0;
        }).stream().filter(item -> {
            boolean bl;
            if (i.lIlIlllIIIlllI(item.getName().equals(lllIIIllIlI[lllIIIllIll[0]]) ? 1 : 0)) {
                bl = lllIIIllIll[1];

                if (2 > (0x7E ^ 0x7A ^ (0x3B ^ 0x12) & ~(0x23 ^ 0xA))) {
                    return false;
                }
            } else {
                bl = lllIIIllIll[0];
            }
            return bl;
        }).min(Comparator.comparingInt(item -> y.get(item.getName()) * item.getQuantity()));
    }

    public int a(TileItem tileItem) {
        return y.getOrDefault(tileItem.getName(), lllIIIllIll[0]);
    }

    public boolean a(Item item, TileItem tileItem) {
        boolean bl;
        int n2;
        int n3 = y.get(item.getName()) * item.getQuantity();
        if (i.lIlIlllIIIllIl(n3, n2 = y.get(tileItem.getName()) * tileItem.getQuantity())) {
            bl = lllIIIllIll[1];

            if (1 < ((0xF9 ^ 0xBC ^ (0xC0 ^ 0xC4)) & (0xB ^ 0x6F ^ (0x1D ^ 0x38) ^ -1))) {
                return ((0x40 ^ 0x7A ^ (0x2C ^ 0x1E)) & (170 + 8 - 141 + 150 ^ 119 + 31 - 51 + 80 ^ -1)) != 0;
            }
        } else {
            bl = lllIIIllIll[0];
        }
        return bl;
    }

    private static boolean lIlIlllIIIllll(Object object) {
        return object != null;
    }

    private static boolean lIlIlllIIIllIl(int n2, int n3) {
        return n2 < n3;
    }
}

