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
package m.e.a.i.z.m.r.-.q.s.y.u;

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
import m.e.a.i.z.m.r.-.q.s.y.u.j;
import m.e.a.i.z.m.r.-.q.s.y.u.l;
import net.runelite.api.Item;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;

@Singleton
public class i {
    private static /* synthetic */ int[] lIllIIlIIIlIl;
    private final /* synthetic */ l s;
    private static final /* synthetic */ HashMap<String, Integer> r;
    private final /* synthetic */ SquireZammyConfig t;
    private static /* synthetic */ String[] lIllIIlIIIlII;

    public Optional<Item> y() {
        return Inventory.getAll(item -> {
            int n2;
            if (i.llIIIlIlllIIIlI(item.getName()) && i.llIIIlIlllIIIll(r.containsKey(item.getName()) ? 1 : 0)) {
                n2 = lIllIIlIIIlIl[1];
                0;
                
                }
            } else {
                n2 = lIllIIlIIIlIl[0];
            }
            return n2 != 0;
        }).stream().filter(item -> {
            boolean bl;
            if (i.llIIIlIlllIIIIl(item.getName().equals(lIllIIlIIIlII[lIllIIlIIIlIl[0]]) ? 1 : 0)) {
                bl = lIllIIlIIIlIl[1];
                0;
                
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

    private static String llIIIlIllIlllIl(String var3, String var1) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var2 = Cipher.getInstance("Blowfish");
            var2.init(lIllIIlIIIlIl[3], var5);
            return new String(var2.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var4) {
            var4.printStackTrace();
            return null;
        }
    }

    public int a(TileItem tileItem) {
        return r.getOrDefault(tileItem.getName(), lIllIIlIIIlIl[0]);
    }

    private static void llIIIlIllIlllll() {
        lIllIIlIIIlIl = new int[4];
        i.lIllIIlIIIlIl[0] = (0x5F ^ 0x66 ^ 3) & (89 + 167 - 155 + 86 ^ 117 + 65 - 175 + 122 ^ -1);
        i.lIllIIlIIIlIl[1] = 1;
        i.lIllIIlIIIlIl[2] = -1;
        i.lIllIIlIIIlIl[3] = 2;
    }

    public Optional<TileItem> x() {
        return TileItems.getAll(tileItem -> {
            int n2;
            if (i.llIIIlIlllIIIll(this.s.b(tileItem.getWorldLocation()) ? 1 : 0) && i.llIIIlIlllIIIlI(tileItem.getName()) && i.llIIIlIlllIIIll(r.containsKey(tileItem.getName()) ? 1 : 0)) {
                n2 = lIllIIlIIIlIl[1];
                0;
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
            0;
            if (-(0xA6 ^ 0xA2) >= 0) {
                return false;
            }
        } else {
            bl = lIllIIlIIIlIl[0];
        }
        return bl;
    }

    @Inject
    public i(l l2, SquireZammyConfig squireZammyConfig) {
        this.s = l2;
        this.t = squireZammyConfig;
    }

    private static boolean llIIIlIlllIIIll(int n2) {
        return n2 != 0;
    }

    static {
        i.llIIIlIllIlllll();
        i.llIIIlIllIllllI();
        r = new j();
    }

    private static void llIIIlIllIllllI() {
        lIllIIlIIIlII = new String[lIllIIlIIIlIl[1]];
        i.lIllIIlIIIlII[i.lIllIIlIIIlIl[0]] = i."Coins";
    }

    private static boolean llIIIlIlllIIIII(int n2, int n3) {
        return n2 < n3;
    }
}

