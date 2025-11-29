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
import u.i.r.d.s.e.r.q.y.a.h.-.a;
import u.i.r.d.s.e.r.q.y.a.h.-.d;

@Singleton
public class c {
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
                "".length();
                if ((0x3B ^ 0x3F) != (7 ^ 3)) {
                    return ((0x64 ^ 0x32) & ~(0xC4 ^ 0x92)) != 0;
                }
            } else {
                n2 = llllIIIllIll[0];
            }
            return n2 != 0;
        }).stream().filter(item -> {
            boolean bl;
            if (c.lIIIllllIIlllII(item.getName().equals(llllIIIllIlI[llllIIIllIll[0]]) ? 1 : 0)) {
                bl = llllIIIllIll[1];
                "".length();
                if (((1 ^ 0x33) & ~(0xA0 ^ 0x92)) == -" ".length()) {
                    return ((0x62 ^ 0x58) & ~(0x8A ^ 0xB0)) != 0;
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

    private static String lIIIllllIIlIlll(String lllllllllllllllIIlIlIlllllIlllll, String lllllllllllllllIIlIlIlllllIllllI) {
        lllllllllllllllIIlIlIlllllIlllll = new String(Base64.getDecoder().decode(lllllllllllllllIIlIlIlllllIlllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIlIllllllIIIlI = new StringBuilder();
        char[] lllllllllllllllIIlIlIllllllIIIIl = lllllllllllllllIIlIlIlllllIllllI.toCharArray();
        int lllllllllllllllIIlIlIllllllIIIII = llllIIIllIll[0];
        char[] lllllllllllllllIIlIlIlllllIllIlI = lllllllllllllllIIlIlIlllllIlllll.toCharArray();
        int lllllllllllllllIIlIlIlllllIllIIl = lllllllllllllllIIlIlIlllllIllIlI.length;
        int lllllllllllllllIIlIlIlllllIllIII = llllIIIllIll[0];
        while (c.lIIIllllIIllIll(lllllllllllllllIIlIlIlllllIllIII, lllllllllllllllIIlIlIlllllIllIIl)) {
            char lllllllllllllllIIlIlIllllllIIlIl = lllllllllllllllIIlIlIlllllIllIlI[lllllllllllllllIIlIlIlllllIllIII];
            lllllllllllllllIIlIlIllllllIIIlI.append((char)(lllllllllllllllIIlIlIllllllIIlIl ^ lllllllllllllllIIlIlIllllllIIIIl[lllllllllllllllIIlIlIllllllIIIII % lllllllllllllllIIlIlIllllllIIIIl.length]));
            "".length();
            ++lllllllllllllllIIlIlIllllllIIIII;
            ++lllllllllllllllIIlIlIlllllIllIII;
            "".length();
            if (-" ".length() <= 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIlIllllllIIIlI);
    }

    public boolean a(Item item, TileItem tileItem) {
        boolean bl;
        int n2;
        int n3 = v.get(item.getName()) * item.getQuantity();
        if (c.lIIIllllIIllIll(n3, n2 = v.get(tileItem.getName()) * tileItem.getQuantity())) {
            bl = llllIIIllIll[1];
            "".length();
            if (((0xCE ^ 0x8B) & ~(7 ^ 0x42)) < 0) {
                return ((0xEF ^ 0xC3) & ~(0x73 ^ 0x5F)) != 0;
            }
        } else {
            bl = llllIIIllIll[0];
        }
        return bl;
    }

    private static void lIIIllllIIllIlI() {
        llllIIIllIll = new int[9];
        c.llllIIIllIll[0] = (0xA ^ 0x4D ^ (0xC1 ^ 0xAD)) & (0xE4 ^ 0xC5 ^ (0x89 ^ 0x83) ^ -" ".length());
        c.llllIIIllIll[1] = " ".length();
        c.llllIIIllIll[2] = -" ".length();
        c.llllIIIllIll[3] = "  ".length();
        c.llllIIIllIll[4] = "   ".length();
        c.llllIIIllIll[5] = 0x5F ^ 0x5B;
        c.llllIIIllIll[6] = 0x17 ^ 0x12;
        c.llllIIIllIll[7] = 6 ^ 0;
        c.llllIIIllIll[8] = 0x72 ^ 0x2D ^ (0x35 ^ 0x62);
    }

    private static boolean lIIIllllIIllllI(int n2) {
        return n2 != 0;
    }

    private static String lIIIllllIIllIII(String lllllllllllllllIIlIlIlllllIIllIl, String lllllllllllllllIIlIlIlllllIIlllI) {
        try {
            SecretKeySpec lllllllllllllllIIlIlIlllllIlIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIlllllIIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIlIlllllIlIIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIlIlllllIlIIIl.init(llllIIIllIll[3], lllllllllllllllIIlIlIlllllIlIIlI);
            return new String(lllllllllllllllIIlIlIlllllIlIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIlllllIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIlIlllllIlIIII) {
            lllllllllllllllIIlIlIlllllIlIIII.printStackTrace();
            return null;
        }
    }

    private static String lIIIllllIIlIllI(String lllllllllllllllIIlIlIlllllllIlII, String lllllllllllllllIIlIlIlllllllIIIl) {
        try {
            SecretKeySpec lllllllllllllllIIlIlIlllllllIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIlllllllIIIl.getBytes(StandardCharsets.UTF_8)), llllIIIllIll[8]), "DES");
            Cipher lllllllllllllllIIlIlIlllllllIllI = Cipher.getInstance("DES");
            lllllllllllllllIIlIlIlllllllIllI.init(llllIIIllIll[3], lllllllllllllllIIlIlIlllllllIlll);
            return new String(lllllllllllllllIIlIlIlllllllIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIlllllllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIlIlllllllIlIl) {
            lllllllllllllllIIlIlIlllllllIlIl.printStackTrace();
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
        c.llllIIIllIlI[c.llllIIIllIll[0]] = c.lIIIllllIIlIllI("ckrMbmhewDQ=", "Cpjzl");
        c.llllIIIllIlI[c.llllIIIllIll[1]] = c.lIIIllllIIlIlll("OgIbE1EYGxQCFAoYEQ8=", "hwuvq");
        c.llllIIIllIlI[c.llllIIIllIll[3]] = c.lIIIllllIIlIllI("0tUtrEhKvk81MphaVht65Q==", "mszle");
        c.llllIIIllIlI[c.llllIIIllIll[4]] = c.lIIIllllIIllIII("0P5ifZeyGJN48TWfnsGxTg==", "sXFHG");
        c.llllIIIllIlI[c.llllIIIllIll[5]] = c.lIIIllllIIlIllI("Ck48f1ChZIwU8szz+I1x1w==", "gDRHe");
        c.llllIIIllIlI[c.llllIIIllIll[6]] = c.lIIIllllIIllIII("PlJo99ittImqtL5Z1T+vyw==", "RKVzh");
    }

    public Optional<TileItem> p() {
        return TileItems.getAll(tileItem -> {
            int n2;
            if (c.lIIIllllIIlllIl(tileItem.getName()) && c.lIIIllllIIllllI(v.containsKey(tileItem.getName()) ? 1 : 0)) {
                n2 = llllIIIllIll[1];
                "".length();
                if ("   ".length() < ((0x78 ^ 0x4F) & ~(0x2F ^ 0x18))) {
                    return ((0xDB ^ 0x90) & ~(0xF4 ^ 0xBF)) != 0;
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
                "".length();
                if ("   ".length() < "  ".length()) {
                    return ((47 + 115 - 37 + 40 ^ 124 + 156 - 95 + 2) & (140 + 110 - 85 + 14 ^ 149 + 84 - 220 + 160 ^ -" ".length())) != 0;
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
                    "".length();
                    if (" ".length() > 0) return n2 != 0;
                    return ((0x2B ^ 0x62) & ~(0x2B ^ 0x62)) != 0;
                }
            }
            n2 = llllIIIllIll[0];
            return n2 != 0;
        }).max(Comparator.comparingInt(object -> ((TileItem)object).getQuantity() * v.getOrDefault(((TileItem)object).getName(), llllIIIllIll[2])).thenComparingDouble(object -> -((TileItem)object).getWorldLocation().distanceToHypotenuse(Players.getLocal().getWorldLocation())));
    }
}

