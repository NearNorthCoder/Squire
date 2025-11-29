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
package u.i.r.d.s.e.r.q.y.a.h.-;

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
import u.i.r.d.s.e.r.q.y.a.h.-.a_Unknown;
import u.i.r.d.s.e.r.q.y.a.h.-.d_Unknown;

@Singleton
public class c_Unknown {
    private static /* synthetic */ String[] llllIIIllIlI;
    private final /* synthetic */ SquireAlchemicalHydraConfig w;
    private static final /* synthetic */ HashMap<String, Integer> v;
    private static /* synthetic */ int[] llllIIIllIll;
    public static final /* synthetic */ List<String> u;

    public int a(TileItem tileItem) {
        return v.getOrDefault(tileItem.getName(), llllIIIllIll[0]);
    }

    public Optional<Item> r() {
        return Inventory.getAll(item -> {
            int n2;
            if (c.lIIIllllIIlllIl(item.getName()) && c.lIIIllllIIllllI(v.containsKey(item.getName()) ? 1 : 0)) {
                n2 = llllIIIllIll[1];
                0;
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
                0;
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
    public c(SquireAlchemicalHydraConfig squireAlchemicalHydraConfig, a a2) {
        this.w = squireAlchemicalHydraConfig;
    }

    private static String lIIIllllIIlIlll(String var15, String var5) {
        var15 = new String(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var9 = var5.toCharArray();
        int var10 = llllIIIllIll[0];
        char[] var13 = var15.toCharArray();
        int var16 = var13.length;
        int var18 = llllIIIllIll[0];
        while (c.lIIIllllIIllIll(var18, var16)) {
            char var1 = var13[var18];
            var14.append((char)(var1 ^ var9[var10 % var9.length]));
            0;
            ++var10;
            ++var18;
            0;
            if (-1 <= 0) continue;
            return null;
        }
        return String.valueOf(var14);
    }

    public boolean a(Item item, TileItem tileItem) {
        boolean bl;
        int n2;
        int n3 = v.get(item.getName()) * item.getQuantity();
        if (c.lIIIllllIIllIll(n3, n2 = v.get(tileItem.getName()) * tileItem.getQuantity())) {
            bl = llllIIIllIll[1];
            0;
            if (((0xCE ^ 0x8B) & ~(7 ^ 0x42)) < 0) {
                return false;
            }
        } else {
            bl = llllIIIllIll[0];
        }
        return bl;
    }

    private static void lIIIllllIIllIlI() {
        llllIIIllIll = new int[9];
        c.llllIIIllIll[0] = (0xA ^ 0x4D ^ (0xC1 ^ 0xAD)) & (0xE4 ^ 0xC5 ^ (0x89 ^ 0x83) ^ -1);
        c.llllIIIllIll[1] = 1;
        c.llllIIIllIll[2] = -1;
        c.llllIIIllIll[3] = 2;
        c.llllIIIllIll[4] = 3;
        c.llllIIIllIll[5] = 0x5F ^ 0x5B;
        c.llllIIIllIll[6] = 0x17 ^ 0x12;
        c.llllIIIllIll[7] = 6 ^ 0;
        c.llllIIIllIll[8] = 0x72 ^ 0x2D ^ (0x35 ^ 0x62);
    }

    private static boolean lIIIllllIIllllI(int n2) {
        return n2 != 0;
    }

    private static String lIIIllllIIllIII(String var6, String var8) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var8.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var2 = Cipher.getInstance("Blowfish");
            var2.init(llllIIIllIll[3], var7);
            return new String(var2.doFinal(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    private static String lIIIllllIIlIllI(String var4, String var19) {
        try {
            SecretKeySpec var12 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var19.getBytes(StandardCharsets.UTF_8)), llllIIIllIll[8]), "DES");
            Cipher var17 = Cipher.getInstance("DES");
            var17.init(llllIIIllIll[3], var12);
            return new String(var17.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIllllIIlllII(int n2) {
        return n2 == 0;
    }

    static {
        c.lIIIllllIIllIlI();
        c.lIIIllllIIllIIl();
        u = List.of(llllIIIllIlI[llllIIIllIll[1]], llllIIIllIlI[llllIIIllIll[3]], llllIIIllIlI[llllIIIllIll[4]], llllIIIllIlI[llllIIIllIll[5]], llllIIIllIlI[llllIIIllIll[6]]);
        v = new d();
    }

    private static void lIIIllllIIllIIl() {
        llllIIIllIlI = new String[llllIIIllIll[7]];
        c.llllIIIllIlI[c.llllIIIllIll[0]] = c."Coins";
        c.llllIIIllIlI[c.llllIIIllIll[1]] = c."Rune platebody";
        c.llllIIIllIlI[c.llllIIIllIll[3]] = c."Rune 2h sword";
        c.llllIIIllIlI[c.llllIIIllIll[4]] = c."Rune longsword";
        c.llllIIIllIlI[c.llllIIIllIll[5]] = c."Rune pickaxe";
        c.llllIIIllIlI[c.llllIIIllIll[6]] = c."Rune kiteshield";
    }

    public Optional<TileItem> p() {
        return TileItems.getAll(tileItem -> {
            int n2;
            if (c.lIIIllllIIlllIl(tileItem.getName()) && c.lIIIllllIIllllI(v.containsKey(tileItem.getName()) ? 1 : 0)) {
                n2 = llllIIIllIll[1];
                0;
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
                0;
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
                    0;
                    if (1 > 0) return n2 != 0;
                    return false;
                }
            }
            n2 = llllIIIllIll[0];
            return n2 != 0;
        }).max(Comparator.comparingInt(object -> ((TileItem)object).getQuantity() * v.getOrDefault(((TileItem)object).getName(), llllIIIllIll[2])).thenComparingDouble(object -> -((TileItem)object).getWorldLocation().distanceToHypotenuse(Players.getLocal().getWorldLocation())));
    }
}

