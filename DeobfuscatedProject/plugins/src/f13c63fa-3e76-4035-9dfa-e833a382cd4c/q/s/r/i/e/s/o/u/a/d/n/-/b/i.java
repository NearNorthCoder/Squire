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
package q.s.r.i.e.s.o.u.a.d.n.-.b;

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
import q.s.r.i.e.s.o.u.a.d.n.-.b.e;
import q.s.r.i.e.s.o.u.a.d.n.-.b.j;

@Singleton
public class i {
    private final /* synthetic */ SquireBandosConfig A;
    private static final /* synthetic */ HashMap<String, Integer> y;
    private static /* synthetic */ String[] lllIIIllIlI;
    private final /* synthetic */ e z;
    public static final /* synthetic */ List<String> x;
    private static /* synthetic */ int[] lllIIIllIll;

    private static String lIlIlllIIIlIIl(String llllllllllllllllIIlIIllIIlIIIIlI, String llllllllllllllllIIlIIllIIlIIIIll) {
        try {
            SecretKeySpec llllllllllllllllIIlIIllIIlIIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIllIIlIIIIll.getBytes(StandardCharsets.UTF_8)), lllIIIllIll[8]), "DES");
            Cipher llllllllllllllllIIlIIllIIlIIIllI = Cipher.getInstance("DES");
            llllllllllllllllIIlIIllIIlIIIllI.init(lllIIIllIll[3], llllllllllllllllIIlIIllIIlIIIlll);
            return new String(llllllllllllllllIIlIIllIIlIIIllI.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIllIIlIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIIllIIlIIIlIl) {
            llllllllllllllllIIlIIllIIlIIIlIl.printStackTrace();
            return null;
        }
    }

    static {
        i.lIlIlllIIIllII();
        i.lIlIlllIIIlIll();
        x = List.of(lllIIIllIlI[lllIIIllIll[1]], lllIIIllIlI[lllIIIllIll[3]], lllIIIllIlI[lllIIIllIll[4]], lllIIIllIlI[lllIIIllIll[5]], lllIIIllIlI[lllIIIllIll[6]]);
        y = new j();
    }

    public Optional<TileItem> H() {
        return TileItems.getAll(tileItem -> {
            int n2;
            if (i.lIlIlllIIlIIII(this.z.b(tileItem.getWorldLocation()) ? 1 : 0) && i.lIlIlllIIIllll(tileItem.getName()) && i.lIlIlllIIlIIII(y.containsKey(tileItem.getName()) ? 1 : 0)) {
                n2 = lllIIIllIll[1];
                "".length();
                if ((0x3E ^ 0x3A) < 0) {
                    return ((0xD4 ^ 0x81) & ~(0x3D ^ 0x68)) != 0;
                }
            } else {
                n2 = lllIIIllIll[0];
            }
            return n2 != 0;
        }).stream().filter(tileItem -> {
            boolean bl;
            if (!i.lIlIlllIIIlllI(this.A.alch() ? 1 : 0) || i.lIlIlllIIIlllI(x.contains(tileItem.getName()) ? 1 : 0)) {
                bl = lllIIIllIll[1];
                "".length();
                if (" ".length() <= 0) {
                    return ((0xDD ^ 0xBE) & ~(0xDB ^ 0xB8)) != 0;
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
                "".length();
                if ("   ".length() > (0x4A ^ 0x3B ^ (0xED ^ 0x98))) {
                    return ((0x55 ^ 0x1A ^ (0x18 ^ 0x59)) & (9 + 107 - -60 + 9 ^ 121 + 17 - -35 + 10 ^ -" ".length())) != 0;
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
                    "".length();
                    if (((0x38 ^ 0xF) & ~(0x6F ^ 0x58)) == ((0xD5 ^ 0xC4) & ~(0x9C ^ 0x8D))) return n2 != 0;
                    return ((0xFC ^ 0xA2) & ~(0x54 ^ 0xA)) != 0;
                }
            }
            n2 = lllIIIllIll[0];
            return n2 != 0;
        }).max(Comparator.comparingInt(object -> ((TileItem)object).getQuantity() * y.getOrDefault(((TileItem)object).getName(), lllIIIllIll[2])).thenComparingDouble(object -> -((TileItem)object).getWorldLocation().distanceToHypotenuse(Players.getLocal().getWorldLocation())));
    }

    private static void lIlIlllIIIllII() {
        lllIIIllIll = new int[9];
        i.lllIIIllIll[0] = (0x84 ^ 0xA1) & ~(0x56 ^ 0x73);
        i.lllIIIllIll[1] = " ".length();
        i.lllIIIllIll[2] = -" ".length();
        i.lllIIIllIll[3] = "  ".length();
        i.lllIIIllIll[4] = "   ".length();
        i.lllIIIllIll[5] = 0x93 ^ 0x97;
        i.lllIIIllIll[6] = 0xA4 ^ 0xA1;
        i.lllIIIllIll[7] = 0x53 ^ 0x55;
        i.lllIIIllIll[8] = 0x34 ^ 0x3C;
    }

    private static boolean lIlIlllIIIlllI(int n2) {
        return n2 == 0;
    }

    @Inject
    public i(e e2, SquireBandosConfig squireBandosConfig) {
        this.z = e2;
        this.A = squireBandosConfig;
    }

    private static String lIlIlllIIIlIlI(String llllllllllllllllIIlIIllIIlIlIIIl, String llllllllllllllllIIlIIllIIlIlIIII) {
        try {
            SecretKeySpec llllllllllllllllIIlIIllIIlIlIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIllIIlIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlIIllIIlIlIIll = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlIIllIIlIlIIll.init(lllIIIllIll[3], llllllllllllllllIIlIIllIIlIlIlII);
            return new String(llllllllllllllllIIlIIllIIlIlIIll.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIllIIlIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIIllIIlIlIIlI) {
            llllllllllllllllIIlIIllIIlIlIIlI.printStackTrace();
            return null;
        }
    }

    private static void lIlIlllIIIlIll() {
        lllIIIllIlI = new String[lllIIIllIll[7]];
        i.lllIIIllIlI[i.lllIIIllIll[0]] = i.lIlIlllIIIlIIl("h/sjVO9xXgk=", "mATKl");
        i.lllIIIllIlI[i.lllIIIllIll[1]] = i.lIlIlllIIIlIlI("Myp1LsaOQfGtO0j+u+HO9g==", "eDIkM");
        i.lllIIIllIlI[i.lllIIIllIll[3]] = i.lIlIlllIIIlIIl("UBc/mJnMqb9xi4PCpN5sQQ==", "jrDfA");
        i.lllIIIllIlI[i.lllIIIllIll[4]] = i.lIlIlllIIIlIlI("Y14KGozCOLW1WkPTu85Djw==", "XMjav");
        i.lllIIIllIlI[i.lllIIIllIll[5]] = i.lIlIlllIIIlIIl("/3yIjoQ7NwbMJdMIa1Fotw==", "Qlojz");
        i.lllIIIllIlI[i.lllIIIllIll[6]] = i.lIlIlllIIIlIIl("ubC+Gog6tfTlqwVZNO93yA==", "naNeV");
    }

    public Optional<Item> J() {
        return Inventory.getAll(item -> {
            int n2;
            if (i.lIlIlllIIIllll(item.getName()) && i.lIlIlllIIlIIII(y.containsKey(item.getName()) ? 1 : 0)) {
                n2 = lllIIIllIll[1];
                "".length();
                if (null != null) {
                    return ((0x4C ^ 0x5C) & ~(0x8A ^ 0x9A)) != 0;
                }
            } else {
                n2 = lllIIIllIll[0];
            }
            return n2 != 0;
        }).stream().filter(item -> {
            boolean bl;
            if (i.lIlIlllIIIlllI(item.getName().equals(lllIIIllIlI[lllIIIllIll[0]]) ? 1 : 0)) {
                bl = lllIIIllIll[1];
                "".length();
                if ("  ".length() > (0x7E ^ 0x7A ^ (0x3B ^ 0x12) & ~(0x23 ^ 0xA))) {
                    return ((198 + 32 - 19 + 28 ^ 143 + 108 - 221 + 166) & (29 + 100 - 26 + 58 ^ 65 + 23 - 52 + 102 ^ -" ".length())) != 0;
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
            "".length();
            if (" ".length() < ((0xF9 ^ 0xBC ^ (0xC0 ^ 0xC4)) & (0xB ^ 0x6F ^ (0x1D ^ 0x38) ^ -" ".length()))) {
                return ((0x40 ^ 0x7A ^ (0x2C ^ 0x1E)) & (170 + 8 - 141 + 150 ^ 119 + 31 - 51 + 80 ^ -" ".length())) != 0;
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

