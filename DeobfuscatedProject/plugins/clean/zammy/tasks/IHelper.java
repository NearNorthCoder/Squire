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
package gg.squire.zammy.tasks;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.zammy.SquireZammyConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.zammy.tasks.ZammyManager;
import gg.squire.zammy.tasks.LHelper;
import net.runelite.api.Item;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;

@Singleton
public class IHelper {
    
    private final  l s;
    private static final  HashMap<String, Integer> r;
    private final  SquireZammyConfig t;

    public Optional<Item> y() {
        return Inventory.getAll(item -> {
            int n2;
            if (i.llIIIlIlllIIIlI(item.getName()) && i.llIIIlIlllIIIll(r.containsKey(item.getName()) ? 1 : 0)) {
                n2 = lIllIIlIIIlIl[1];

                }
            } else {
                n2 = lIllIIlIIIlIl[0];
            }
            return n2 != 0;
        }).stream().filter(item -> {
            boolean bl;
            if (i.llIIIlIlllIIIIl(item.getName().equals(lIllIIlIIIlII[lIllIIlIIIlIl[0]]) ? 1 : 0)) {
                bl = lIllIIlIIIlIl[1];

                }
            } else {
                bl = lIllIIlIIIlIl[0];
            }
            return bl;
        }).min(Comparator.comparingInt(item -> r.get(item.getName()) * item.getQuantity()));
    }

    private static boolean llIIIlIlllIIIIl(int n2) {
        return n2 == 0;
    }

    private static boolean llIIIlIlllIIIlI(Object object) {
        return object != null;
    }

    public int a(TileItem tileItem) {
        return r.getOrDefault(tileItem.getName(), lIllIIlIIIlIl[0]);
    }

    public Optional<TileItem> x() {
        return TileItems.getAll(tileItem -> {
            int n2;
            if (i.llIIIlIlllIIIll(this.s.b(tileItem.getWorldLocation()) ? 1 : 0) && i.llIIIlIlllIIIlI(tileItem.getName()) && i.llIIIlIlllIIIll(r.containsKey(tileItem.getName()) ? 1 : 0)) {
                n2 = lIllIIlIIIlIl[1];

                if (2 <= 0) {
                    return false;
                }
            } else {
                n2 = lIllIIlIIIlIl[0];
            }
            return n2 != 0;
        }).stream().max(Comparator.comparingInt(object -> ((TileItem)object).getQuantity() * r.getOrDefault(((TileItem)object).getName(), lIllIIlIIIlIl[2])).thenComparingDouble(object -> -((TileItem)object).getWorldLocation().distanceToHypotenuse(Players.getLocal().getWorldLocation())));
    }

    public boolean a(Item item, TileItem tileItem) {
        boolean bl;
        int n2;
        int n3 = r.get(item.getName()) * item.getQuantity();
        if (i.llIIIlIlllIIIII(n3, n2 = r.get(tileItem.getName()) * tileItem.getQuantity())) {
            bl = lIllIIlIIIlIl[1];

            if (-(0xA6 ^ 0xA2) >= 0) {
                return false;
            }
        } else {
            bl = lIllIIlIIIlIl[0];
        }
        return bl;
    }

    @Inject
    public IHelper(l l2, SquireZammyConfig squireZammyConfig) {
        this.s = l2;
        this.t = squireZammyConfig;
    }

    private static boolean llIIIlIlllIIIll(int n2) {
        return n2 != 0;
    }

    static {
        i.llIIIlIllIlllll();
        i.llIIIlIllIllllI();
        r = new ZammyManager();
    }

    private static void llIIIlIllIllllI() {
        lIllIIlIIIlII = new String[lIllIIlIIIlIl[1]];
        i.lIllIIlIIIlII[i.lIllIIlIIIlIl[0]] = "Coins";
    }

    private static boolean llIIIlIlllIIIII(int n2, int n3) {
        return n2 < n3;
    }
}

