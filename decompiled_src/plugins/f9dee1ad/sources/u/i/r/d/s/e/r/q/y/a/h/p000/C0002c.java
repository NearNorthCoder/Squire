package u.i.r.d.s.e.r.q.y.a.h.p000;

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
@Singleton
/* renamed from: u.i.r.d.s.e.r.q.y.a.h.-.c  reason: invalid package and case insensitive filesystem */
/* loaded from: f9dee1ad-dcbf-4af9-9fb8-47dc91e2d43e.jar:u/i/r/d/s/e/r/q/y/a/h/-/c.class */
public class C0002c {
    private static /* synthetic */ String[] llllIIIllIlI;
    private final /* synthetic */ SquireAlchemicalHydraConfig w;
    private static final /* synthetic */ HashMap<String, Integer> v;
    private static /* synthetic */ int[] llllIIIllIll;

    /* renamed from: u  reason: collision with root package name */
    public static final /* synthetic */ List<String> f0u;

    public int a(TileItem tileItem) {
        return v.getOrDefault(tileItem.getName(), Integer.valueOf(llllIIIllIll[0])).intValue();
    }

    public Optional<Item> r() {
        return Inventory.getAll(item -> {
            if (lIIIllllIIlllIl(item.getName()) && lIIIllllIIllllI(v.containsKey(item.getName()) ? 1 : 0)) {
                ?? r0 = llllIIIllIll[1];
                "".length();
                return (true ^ true) != (true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llllIIIllIll[0];
        }).stream().filter(item2 -> {
            if (lIIIllllIIlllII(item2.getName().equals(llllIIIllIlI[llllIIIllIll[0]]) ? 1 : 0)) {
                ?? r0 = llllIIIllIll[1];
                "".length();
                return ((1 ^ 51) & ((160 ^ 146) ^ (-1))) == (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llllIIIllIll[0];
        }).min(Comparator.comparingInt(item3 -> {
            return v.get(item3.getName()).intValue() * item3.getQuantity();
        }));
    }

    private static boolean lIIIllllIIlllIl(Object obj) {
        return obj != null;
    }

    @Inject
    public C0002c(SquireAlchemicalHydraConfig squireAlchemicalHydraConfig, C0000a c0000a) {
        this.w = squireAlchemicalHydraConfig;
    }

    private static String lIIIllllIIlIlll(String lllllllllllllllIIlIlIllllllIIlII, String lllllllllllllllIIlIlIllllllIIIll) {
        String lllllllllllllllIIlIlIllllllIIlII2 = new String(Base64.getDecoder().decode(lllllllllllllllIIlIlIllllllIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIlIllllllIIIlI = new StringBuilder();
        char[] charArray = lllllllllllllllIIlIlIllllllIIIll.toCharArray();
        int lllllllllllllllIIlIlIllllllIIIII = llllIIIllIll[0];
        char[] charArray2 = lllllllllllllllIIlIlIllllllIIlII2.toCharArray();
        int length = charArray2.length;
        int i = llllIIIllIll[0];
        while (lIIIllllIIllIll(i, length)) {
            char lllllllllllllllIIlIlIllllllIIlIl = charArray2[i];
            lllllllllllllllIIlIlIllllllIIIlI.append((char) (lllllllllllllllIIlIlIllllllIIlIl ^ charArray[lllllllllllllllIIlIlIllllllIIIII % charArray.length]));
            "".length();
            lllllllllllllllIIlIlIllllllIIIII++;
            i++;
            "".length();
            if ((-" ".length()) > 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIlIlIllllllIIIlI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    public boolean a(Item item, TileItem tileItem) {
        if (lIIIllllIIllIll(v.get(item.getName()).intValue() * item.getQuantity(), v.get(tileItem.getName()).intValue() * tileItem.getQuantity())) {
            ?? r0 = llllIIIllIll[1];
            "".length();
            return ((206 ^ 139) & ((7 ^ 66) ^ (-1))) < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llllIIIllIll[0];
    }

    private static void lIIIllllIIllIlI() {
        llllIIIllIll = new int[9];
        llllIIIllIll[0] = ((10 ^ 77) ^ (193 ^ 173)) & (((228 ^ 197) ^ (137 ^ 131)) ^ (-" ".length()));
        llllIIIllIll[1] = " ".length();
        llllIIIllIll[2] = -" ".length();
        llllIIIllIll[3] = "  ".length();
        llllIIIllIll[4] = "   ".length();
        llllIIIllIll[5] = 95 ^ 91;
        llllIIIllIll[6] = 23 ^ 18;
        llllIIIllIll[7] = 6 ^ 0;
        llllIIIllIll[8] = (114 ^ 45) ^ (53 ^ 98);
    }

    private static boolean lIIIllllIIllllI(int i) {
        return i != 0;
    }

    private static String lIIIllllIIllIII(String lllllllllllllllIIlIlIlllllIIllll, String lllllllllllllllIIlIlIlllllIIlllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIlllllIIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIlIlllllIlIIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIlIlllllIlIIIl.init(llllIIIllIll[3], secretKeySpec);
            return new String(lllllllllllllllIIlIlIlllllIlIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIlllllIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIlIlllllIlIIII) {
            lllllllllllllllIIlIlIlllllIlIIII.printStackTrace();
            return null;
        }
    }

    private static String lIIIllllIIlIllI(String lllllllllllllllIIlIlIlllllllIlII, String lllllllllllllllIIlIlIlllllllIIll) {
        try {
            SecretKeySpec lllllllllllllllIIlIlIlllllllIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIlllllllIIll.getBytes(StandardCharsets.UTF_8)), llllIIIllIll[8]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llllIIIllIll[3], lllllllllllllllIIlIlIlllllllIlll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIlllllllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIlIlllllllIlIl) {
            lllllllllllllllIIlIlIlllllllIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIllllIIlllII(int i) {
        return i == 0;
    }

    static {
        lIIIllllIIllIlI();
        lIIIllllIIllIIl();
        f0u = List.of(llllIIIllIlI[llllIIIllIll[1]], llllIIIllIlI[llllIIIllIll[3]], llllIIIllIlI[llllIIIllIll[4]], llllIIIllIlI[llllIIIllIll[5]], llllIIIllIlI[llllIIIllIll[6]]);
        v = new d();
    }

    private static void lIIIllllIIllIIl() {
        llllIIIllIlI = new String[llllIIIllIll[7]];
        llllIIIllIlI[llllIIIllIll[0]] = lIIIllllIIlIllI("ckrMbmhewDQ=", "Cpjzl");
        llllIIIllIlI[llllIIIllIll[1]] = lIIIllllIIlIlll("OgIbE1EYGxQCFAoYEQ8=", "hwuvq");
        llllIIIllIlI[llllIIIllIll[3]] = lIIIllllIIlIllI("0tUtrEhKvk81MphaVht65Q==", "mszle");
        llllIIIllIlI[llllIIIllIll[4]] = lIIIllllIIllIII("0P5ifZeyGJN48TWfnsGxTg==", "sXFHG");
        llllIIIllIlI[llllIIIllIll[5]] = lIIIllllIIlIllI("Ck48f1ChZIwU8szz+I1x1w==", "gDRHe");
        llllIIIllIlI[llllIIIllIll[6]] = lIIIllllIIllIII("PlJo99ittImqtL5Z1T+vyw==", "RKVzh");
    }

    public Optional<TileItem> p() {
        return TileItems.getAll(tileItem -> {
            if (lIIIllllIIlllIl(tileItem.getName()) && lIIIllllIIllllI(v.containsKey(tileItem.getName()) ? 1 : 0)) {
                ?? r0 = llllIIIllIll[1];
                "".length();
                return "   ".length() < ((120 ^ 79) & ((47 ^ 24) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llllIIIllIll[0];
        }).stream().max(Comparator.comparingInt(obj -> {
            return ((TileItem) obj).getQuantity() * v.getOrDefault(((TileItem) obj).getName(), Integer.valueOf(llllIIIllIll[2])).intValue();
        }).thenComparingDouble(obj2 -> {
            return -((TileItem) obj2).getWorldLocation().distanceToHypotenuse(Players.getLocal().getWorldLocation());
        }));
    }

    private static boolean lIIIllllIIllIll(int i, int i2) {
        return i < i2;
    }

    public Optional<TileItem> q() {
        return TileItems.getAll(tileItem -> {
            if (lIIIllllIIlllIl(tileItem.getName()) && lIIIllllIIllllI(v.containsKey(tileItem.getName()) ? 1 : 0)) {
                ?? r0 = llllIIIllIll[1];
                "".length();
                return "   ".length() < "  ".length() ? ((((47 + 115) - 37) + 40) ^ (((124 + 156) - 95) + 2)) & (((((140 + 110) - 85) + 14) ^ (((149 + 84) - 220) + 160)) ^ (-" ".length())) : r0;
            }
            return llllIIIllIll[0];
        }).stream().filter(tileItem2 -> {
            if (lIIIllllIIllllI(tileItem2.isStackable() ? 1 : 0)) {
                int[] iArr = new int[llllIIIllIll[1]];
                iArr[llllIIIllIll[0]] = tileItem2.getId();
                if (lIIIllllIIllllI(Inventory.contains(iArr) ? 1 : 0)) {
                    ?? r0 = llllIIIllIll[1];
                    "".length();
                    return " ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
            return llllIIIllIll[0];
        }).max(Comparator.comparingInt(obj -> {
            return ((TileItem) obj).getQuantity() * v.getOrDefault(((TileItem) obj).getName(), Integer.valueOf(llllIIIllIll[2])).intValue();
        }).thenComparingDouble(obj2 -> {
            return -((TileItem) obj2).getWorldLocation().distanceToHypotenuse(Players.getLocal().getWorldLocation());
        }));
    }
}
