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
package u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.saradomin.SquireSaraConfig;
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
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.e;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.g;

@Singleton
public class d {
    private final /* synthetic */ SquireSaraConfig n;
    private static /* synthetic */ int[] lIIlIIlllIlII;
    private static final /* synthetic */ HashMap<String, Integer> l;
    private final /* synthetic */ g m;
    private static /* synthetic */ String[] lIIlIIlllIIII;
    public static final /* synthetic */ List<String> k;

    private static boolean lIlIlIlIlIIlIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIlIlIlIIlllI(int n2) {
        return n2 != 0;
    }

    public Optional<Item> j() {
        return Inventory.getAll(item -> {
            int n2;
            if (d.lIlIlIlIlIIllIl(item.getName()) && d.lIlIlIlIlIIlllI(l.containsKey(item.getName()) ? 1 : 0)) {
                n2 = lIIlIIlllIlII[1];
                0;
                if (2 < 1) {
                    return false;
                }
            } else {
                n2 = lIIlIIlllIlII[0];
            }
            return n2 != 0;
        }).stream().filter(item -> {
            boolean bl;
            if (d.lIlIlIlIlIIllII(item.getName().equals(lIIlIIlllIIII[lIIlIIlllIlII[0]]) ? 1 : 0)) {
                bl = lIIlIIlllIlII[1];
                0;
                
                }
            } else {
                bl = lIIlIIlllIlII[0];
            }
            return bl;
        }).min(Comparator.comparingInt(item -> l.get(item.getName()) * item.getQuantity()));
    }

    public boolean a(Item item, TileItem tileItem) {
        boolean bl;
        int n2;
        int n3 = l.get(item.getName()) * item.getQuantity();
        if (d.lIlIlIlIlIIlIll(n3, n2 = l.get(tileItem.getName()) * tileItem.getQuantity())) {
            bl = lIIlIIlllIlII[1];
            0;
            if ((0x42 ^ 6 ^ (0xD ^ 0x4D)) < 0) {
                return ((75 + 242 - 239 + 173 ^ 123 + 28 - 123 + 157) & (0x53 ^ 0x39 ^ (0x4E ^ 0x66) ^ -1)) != 0;
            }
        } else {
            bl = lIIlIIlllIlII[0];
        }
        return bl;
    }

    private static String lIlIlIlIlIIIIll(String var6, String var4) {
        try {
            SecretKeySpec var12 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var10 = Cipher.getInstance("Blowfish");
            var10.init(lIIlIIlllIlII[3], var12);
            return new String(var10.doFinal(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    private static void lIlIlIlIlIIlIlI() {
        lIIlIIlllIlII = new int[10];
        d.lIIlIIlllIlII[0] = (0x6F ^ 0xA ^ (0x5A ^ 0xC)) & (93 + 109 - 85 + 58 ^ 150 + 106 - 173 + 73 ^ -1);
        d.lIIlIIlllIlII[1] = 1;
        d.lIIlIIlllIlII[2] = -1;
        d.lIIlIIlllIlII[3] = 2;
        d.lIIlIIlllIlII[4] = 3;
        d.lIIlIIlllIlII[5] = 0x97 ^ 0x93;
        d.lIIlIIlllIlII[6] = 113 + 15 - 81 + 138 ^ 87 + 30 - -42 + 29;
        d.lIIlIIlllIlII[7] = 0x7C ^ 0x74 ^ (0x46 ^ 0x48);
        d.lIIlIIlllIlII[8] = 0x16 ^ 0x11;
        d.lIIlIIlllIlII[9] = 0xB ^ 3;
    }

    public Optional<TileItem> i() {
        return TileItems.getAll(tileItem -> {
            int n2;
            if (d.lIlIlIlIlIIlllI(this.m.a(tileItem.getWorldLocation()) ? 1 : 0) && d.lIlIlIlIlIIllIl(tileItem.getName()) && d.lIlIlIlIlIIlllI(l.containsKey(tileItem.getName()) ? 1 : 0)) {
                n2 = lIIlIIlllIlII[1];
                0;
                if (1 <= ((0x91 ^ 0x97) & ~(0xC ^ 0xA))) {
                    return false;
                }
            } else {
                n2 = lIIlIIlllIlII[0];
            }
            return n2 != 0;
        }).stream().filter(tileItem -> {
            boolean bl;
            if (!d.lIlIlIlIlIIllII(this.n.alch() ? 1 : 0) || d.lIlIlIlIlIIllII(k.contains(tileItem.getName()) ? 1 : 0)) {
                bl = lIIlIIlllIlII[1];
                0;
                if (-1 >= 3) {
                    return false;
                }
            } else {
                bl = lIIlIIlllIlII[0];
            }
            return bl;
        }).max(Comparator.comparingInt(object -> ((TileItem)object).getQuantity() * l.getOrDefault(((TileItem)object).getName(), lIIlIIlllIlII[2])).thenComparingDouble(object -> -((TileItem)object).getWorldLocation().distanceToHypotenuse(Players.getLocal().getWorldLocation())));
    }

    private static String lIlIlIlIlIIIIlI(String var2, String var15) {
        try {
            SecretKeySpec var19 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var15.getBytes(StandardCharsets.UTF_8)), lIIlIIlllIlII[9]), "DES");
            Cipher var3 = Cipher.getInstance("DES");
            var3.init(lIIlIIlllIlII[3], var19);
            return new String(var3.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static void lIlIlIlIlIIIlIl() {
        lIIlIIlllIIII = new String[lIIlIIlllIlII[9]];
        d.lIIlIIlllIIII[d.lIIlIIlllIlII[0]] = d."Coins";
        d.lIIlIIlllIIII[d.lIIlIIlllIlII[1]] = d."Rune platebody";
        d.lIIlIIlllIIII[d.lIIlIIlllIlII[3]] = d."Rune 2h sword";
        d.lIIlIIlllIIII[d.lIIlIIlllIlII[4]] = d."Rune longsword";
        d.lIIlIIlllIIII[d.lIIlIIlllIlII[5]] = d."Rune pickaxe";
        d.lIIlIIlllIIII[d.lIIlIIlllIlII[6]] = d."Rune kiteshield";
        d.lIIlIIlllIIII[d.lIIlIIlllIlII[7]] = d."Rune plateskirt";
        d.lIIlIIlllIIII[d.lIIlIIlllIlII[8]] = d."Adamant platebody";
    }

    @Inject
    public d(g g2, SquireSaraConfig squireSaraConfig) {
        this.m = g2;
        this.n = squireSaraConfig;
    }

    static {
        d.lIlIlIlIlIIlIlI();
        d.lIlIlIlIlIIIlIl();
        k = List.of(lIIlIIlllIIII[lIIlIIlllIlII[1]], lIIlIIlllIIII[lIIlIIlllIlII[3]], lIIlIIlllIIII[lIIlIIlllIlII[4]], lIIlIIlllIIII[lIIlIIlllIlII[5]], lIIlIIlllIIII[lIIlIIlllIlII[6]], lIIlIIlllIIII[lIIlIIlllIlII[7]], lIIlIIlllIIII[lIIlIIlllIlII[8]]);
        l = new e();
    }

    private static String lIlIlIlIlIIIlII(String var5, String var1) {
        var5 = new String(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var7 = new StringBuilder();
        char[] var9 = var1.toCharArray();
        int var13 = lIIlIIlllIlII[0];
        char[] var14 = var5.toCharArray();
        int var16 = var14.length;
        int var11 = lIIlIIlllIlII[0];
        while (d.lIlIlIlIlIIlIll(var11, var16)) {
            char var18 = var14[var11];
            var7.append((char)(var18 ^ var9[var13 % var9.length]));
            0;
            ++var13;
            ++var11;
            0;
            if ((0x54 ^ 0x50) >= 1) continue;
            return null;
        }
        return String.valueOf(var7);
    }

    private static boolean lIlIlIlIlIIllIl(Object object) {
        return object != null;
    }

    private static boolean lIlIlIlIlIIllII(int n2) {
        return n2 == 0;
    }

    public int a(TileItem tileItem) {
        return l.getOrDefault(tileItem.getName(), lIIlIIlllIlII[0]);
    }
}

