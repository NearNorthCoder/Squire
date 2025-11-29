package q.s.r.i.e.s.o.u.a.d.n.p000.b;

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
@Singleton
/* renamed from: q.s.r.i.e.s.o.u.a.d.n.-.b.i  reason: invalid package */
/* loaded from: f13c63fa-3e76-4035-9dfa-e833a382cd4c.jar:q/s/r/i/e/s/o/u/a/d/n/-/b/i.class */
public class i {
    private final /* synthetic */ SquireBandosConfig A;
    private static final /* synthetic */ HashMap<String, Integer> y;
    private static /* synthetic */ String[] lllIIIllIlI;
    private final /* synthetic */ e z;
    public static final /* synthetic */ List<String> x;
    private static /* synthetic */ int[] lllIIIllIll;

    private static String lIlIlllIIIlIIl(String llllllllllllllllIIlIIllIIlIIIlII, String llllllllllllllllIIlIIllIIlIIIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIllIIlIIIIll.getBytes(StandardCharsets.UTF_8)), lllIIIllIll[8]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIIIllIll[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIllIIlIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIIllIIlIIIlIl) {
            llllllllllllllllIIlIIllIIlIIIlIl.printStackTrace();
            return null;
        }
    }

    static {
        lIlIlllIIIllII();
        lIlIlllIIIlIll();
        x = List.of(lllIIIllIlI[lllIIIllIll[1]], lllIIIllIlI[lllIIIllIll[3]], lllIIIllIlI[lllIIIllIll[4]], lllIIIllIlI[lllIIIllIll[5]], lllIIIllIlI[lllIIIllIll[6]]);
        y = new j();
    }

    public Optional<TileItem> H() {
        return TileItems.getAll(tileItem -> {
            if (lIlIlllIIlIIII(this.z.b(tileItem.getWorldLocation()) ? 1 : 0) && lIlIlllIIIllll(tileItem.getName()) && lIlIlllIIlIIII(y.containsKey(tileItem.getName()) ? 1 : 0)) {
                ?? r0 = lllIIIllIll[1];
                "".length();
                return (62 ^ 58) < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lllIIIllIll[0];
        }).stream().filter(tileItem2 -> {
            if (!lIlIlllIIIlllI(this.A.alch() ? 1 : 0) || lIlIlllIIIlllI(x.contains(tileItem2.getName()) ? 1 : 0)) {
                ?? r0 = lllIIIllIll[1];
                "".length();
                return " ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lllIIIllIll[0];
        }).max(Comparator.comparingInt(obj -> {
            return ((TileItem) obj).getQuantity() * y.getOrDefault(((TileItem) obj).getName(), Integer.valueOf(lllIIIllIll[2])).intValue();
        }).thenComparingDouble(obj2 -> {
            return -((TileItem) obj2).getWorldLocation().distanceToHypotenuse(Players.getLocal().getWorldLocation());
        }));
    }

    private static boolean lIlIlllIIlIIII(int i) {
        return i != 0;
    }

    public Optional<TileItem> I() {
        return TileItems.getAll(tileItem -> {
            if (lIlIlllIIlIIII(this.z.b(tileItem.getWorldLocation()) ? 1 : 0) && lIlIlllIIIllll(tileItem.getName()) && lIlIlllIIlIIII(y.containsKey(tileItem.getName()) ? 1 : 0)) {
                ?? r0 = lllIIIllIll[1];
                "".length();
                return "   ".length() > ((74 ^ 59) ^ (237 ^ 152)) ? ((85 ^ 26) ^ (24 ^ 89)) & (((((9 + 107) - (-60)) + 9) ^ (((121 + 17) - (-35)) + 10)) ^ (-" ".length())) : r0;
            }
            return lllIIIllIll[0];
        }).stream().filter(tileItem2 -> {
            if (lIlIlllIIlIIII(tileItem2.isStackable() ? 1 : 0)) {
                int[] iArr = new int[lllIIIllIll[1]];
                iArr[lllIIIllIll[0]] = tileItem2.getId();
                if (lIlIlllIIlIIII(Inventory.contains(iArr) ? 1 : 0)) {
                    ?? r0 = lllIIIllIll[1];
                    "".length();
                    return ((true ^ true) & ((true ^ true) ^ true)) != ((true ^ true) & ((true ^ true) ^ true)) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
            return lllIIIllIll[0];
        }).max(Comparator.comparingInt(obj -> {
            return ((TileItem) obj).getQuantity() * y.getOrDefault(((TileItem) obj).getName(), Integer.valueOf(lllIIIllIll[2])).intValue();
        }).thenComparingDouble(obj2 -> {
            return -((TileItem) obj2).getWorldLocation().distanceToHypotenuse(Players.getLocal().getWorldLocation());
        }));
    }

    private static void lIlIlllIIIllII() {
        lllIIIllIll = new int[9];
        lllIIIllIll[0] = (132 ^ 161) & ((86 ^ 115) ^ (-1));
        lllIIIllIll[1] = " ".length();
        lllIIIllIll[2] = -" ".length();
        lllIIIllIll[3] = "  ".length();
        lllIIIllIll[4] = "   ".length();
        lllIIIllIll[5] = 147 ^ 151;
        lllIIIllIll[6] = 164 ^ 161;
        lllIIIllIll[7] = 83 ^ 85;
        lllIIIllIll[8] = 52 ^ 60;
    }

    private static boolean lIlIlllIIIlllI(int i) {
        return i == 0;
    }

    @Inject
    public i(e eVar, SquireBandosConfig squireBandosConfig) {
        this.z = eVar;
        this.A = squireBandosConfig;
    }

    private static String lIlIlllIIIlIlI(String llllllllllllllllIIlIIllIIlIlIIIl, String llllllllllllllllIIlIIllIIlIlIIII) {
        try {
            SecretKeySpec llllllllllllllllIIlIIllIIlIlIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIllIIlIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIIIllIll[3], llllllllllllllllIIlIIllIIlIlIlII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIllIIlIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIIllIIlIIllIl) {
            llllllllllllllllIIlIIllIIlIIllIl.printStackTrace();
            return null;
        }
    }

    private static void lIlIlllIIIlIll() {
        lllIIIllIlI = new String[lllIIIllIll[7]];
        lllIIIllIlI[lllIIIllIll[0]] = lIlIlllIIIlIIl("h/sjVO9xXgk=", "mATKl");
        lllIIIllIlI[lllIIIllIll[1]] = lIlIlllIIIlIlI("Myp1LsaOQfGtO0j+u+HO9g==", "eDIkM");
        lllIIIllIlI[lllIIIllIll[3]] = lIlIlllIIIlIIl("UBc/mJnMqb9xi4PCpN5sQQ==", "jrDfA");
        lllIIIllIlI[lllIIIllIll[4]] = lIlIlllIIIlIlI("Y14KGozCOLW1WkPTu85Djw==", "XMjav");
        lllIIIllIlI[lllIIIllIll[5]] = lIlIlllIIIlIIl("/3yIjoQ7NwbMJdMIa1Fotw==", "Qlojz");
        lllIIIllIlI[lllIIIllIll[6]] = lIlIlllIIIlIIl("ubC+Gog6tfTlqwVZNO93yA==", "naNeV");
    }

    public Optional<Item> J() {
        return Inventory.getAll(item -> {
            if (lIlIlllIIIllll(item.getName()) && lIlIlllIIlIIII(y.containsKey(item.getName()) ? 1 : 0)) {
                ?? r0 = lllIIIllIll[1];
                "".length();
                return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lllIIIllIll[0];
        }).stream().filter(item2 -> {
            if (lIlIlllIIIlllI(item2.getName().equals(lllIIIllIlI[lllIIIllIll[0]]) ? 1 : 0)) {
                ?? r0 = lllIIIllIll[1];
                "".length();
                return "  ".length() > ((126 ^ 122) ^ ((59 ^ 18) & ((35 ^ 10) ^ (-1)))) ? ((((198 + 32) - 19) + 28) ^ (((143 + 108) - 221) + 166)) & (((((29 + 100) - 26) + 58) ^ (((65 + 23) - 52) + 102)) ^ (-" ".length())) : r0;
            }
            return lllIIIllIll[0];
        }).min(Comparator.comparingInt(item3 -> {
            return y.get(item3.getName()).intValue() * item3.getQuantity();
        }));
    }

    public int a(TileItem tileItem) {
        return y.getOrDefault(tileItem.getName(), Integer.valueOf(lllIIIllIll[0])).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    public boolean a(Item item, TileItem tileItem) {
        if (lIlIlllIIIllIl(y.get(item.getName()).intValue() * item.getQuantity(), y.get(tileItem.getName()).intValue() * tileItem.getQuantity())) {
            ?? r0 = lllIIIllIll[1];
            "".length();
            return " ".length() < (((249 ^ 188) ^ (192 ^ 196)) & (((11 ^ 111) ^ (29 ^ 56)) ^ (-" ".length()))) ? ((64 ^ 122) ^ (44 ^ 30)) & (((((170 + 8) - 141) + 150) ^ (((119 + 31) - 51) + 80)) ^ (-" ".length())) : r0;
        }
        return lllIIIllIll[0];
    }

    private static boolean lIlIlllIIIllll(Object obj) {
        return obj != null;
    }

    private static boolean lIlIlllIIIllIl(int i, int i2) {
        return i < i2;
    }
}
