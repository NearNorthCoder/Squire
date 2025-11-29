package u.i.a.a.p000.s.m.n.i.q.d.r.r.s.o.e;

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
@Singleton
/* renamed from: u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.d  reason: invalid package and case insensitive filesystem */
/* loaded from: 9cc2ff9a-834c-471c-85e9-f55eb9ce18c7.jar:u/i/a/a/-/s/m/n/i/q/d/r/r/s/o/e/d.class */
public class C0003d {
    private final /* synthetic */ SquireSaraConfig n;
    private static /* synthetic */ int[] lIIlIIlllIlII;
    private static final /* synthetic */ HashMap<String, Integer> l;
    private final /* synthetic */ C0006g m;
    private static /* synthetic */ String[] lIIlIIlllIIII;
    public static final /* synthetic */ List<String> k;

    private static boolean lIlIlIlIlIIlIll(int i, int i2) {
        return i < i2;
    }

    private static boolean lIlIlIlIlIIlllI(int i) {
        return i != 0;
    }

    public Optional<Item> j() {
        return Inventory.getAll(item -> {
            if (lIlIlIlIlIIllIl(item.getName()) && lIlIlIlIlIIlllI(l.containsKey(item.getName()) ? 1 : 0)) {
                ?? r0 = lIIlIIlllIlII[1];
                "".length();
                return "  ".length() < " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIIlIIlllIlII[0];
        }).stream().filter(item2 -> {
            if (lIlIlIlIlIIllII(item2.getName().equals(lIIlIIlllIIII[lIIlIIlllIlII[0]]) ? 1 : 0)) {
                ?? r0 = lIIlIIlllIlII[1];
                "".length();
                return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIIlIIlllIlII[0];
        }).min(Comparator.comparingInt(item3 -> {
            return l.get(item3.getName()).intValue() * item3.getQuantity();
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    public boolean a(Item item, TileItem tileItem) {
        if (lIlIlIlIlIIlIll(l.get(item.getName()).intValue() * item.getQuantity(), l.get(tileItem.getName()).intValue() * tileItem.getQuantity())) {
            ?? r0 = lIIlIIlllIlII[1];
            "".length();
            return ((66 ^ 6) ^ (13 ^ 77)) < 0 ? ((((75 + 242) - 239) + 173) ^ (((123 + 28) - 123) + 157)) & (((83 ^ 57) ^ (78 ^ 102)) ^ (-" ".length())) : r0;
        }
        return lIIlIIlllIlII[0];
    }

    private static String lIlIlIlIlIIIIll(String llllllllllllllIlllllIIllIIIIlIII, String llllllllllllllIlllllIIllIIIIIlll) {
        try {
            SecretKeySpec llllllllllllllIlllllIIllIIIIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllllIIllIIIIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIlIIlllIlII[3], llllllllllllllIlllllIIllIIIIlIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllllIIllIIIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllllIIllIIIIlIIl) {
            llllllllllllllIlllllIIllIIIIlIIl.printStackTrace();
            return null;
        }
    }

    private static void lIlIlIlIlIIlIlI() {
        lIIlIIlllIlII = new int[10];
        lIIlIIlllIlII[0] = ((111 ^ 10) ^ (90 ^ 12)) & (((((93 + 109) - 85) + 58) ^ (((150 + 106) - 173) + 73)) ^ (-" ".length()));
        lIIlIIlllIlII[1] = " ".length();
        lIIlIIlllIlII[2] = -" ".length();
        lIIlIIlllIlII[3] = "  ".length();
        lIIlIIlllIlII[4] = "   ".length();
        lIIlIIlllIlII[5] = 151 ^ 147;
        lIIlIIlllIlII[6] = (((113 + 15) - 81) + 138) ^ (((87 + 30) - (-42)) + 29);
        lIIlIIlllIlII[7] = (124 ^ 116) ^ (70 ^ 72);
        lIIlIIlllIlII[8] = 22 ^ 17;
        lIIlIIlllIlII[9] = 11 ^ 3;
    }

    public Optional<TileItem> i() {
        return TileItems.getAll(tileItem -> {
            if (lIlIlIlIlIIlllI(this.m.a(tileItem.getWorldLocation()) ? 1 : 0) && lIlIlIlIlIIllIl(tileItem.getName()) && lIlIlIlIlIIlllI(l.containsKey(tileItem.getName()) ? 1 : 0)) {
                ?? r0 = lIIlIIlllIlII[1];
                "".length();
                return " ".length() <= ((145 ^ 151) & ((12 ^ 10) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIIlIIlllIlII[0];
        }).stream().filter(tileItem2 -> {
            if (!lIlIlIlIlIIllII(this.n.alch() ? 1 : 0) || lIlIlIlIlIIllII(k.contains(tileItem2.getName()) ? 1 : 0)) {
                ?? r0 = lIIlIIlllIlII[1];
                "".length();
                return (-" ".length()) >= "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIIlIIlllIlII[0];
        }).max(Comparator.comparingInt(obj -> {
            return ((TileItem) obj).getQuantity() * l.getOrDefault(((TileItem) obj).getName(), Integer.valueOf(lIIlIIlllIlII[2])).intValue();
        }).thenComparingDouble(obj2 -> {
            return -((TileItem) obj2).getWorldLocation().distanceToHypotenuse(Players.getLocal().getWorldLocation());
        }));
    }

    private static String lIlIlIlIlIIIIlI(String llllllllllllllIlllllIIllIIIlIlIl, String llllllllllllllIlllllIIllIIIlIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllllIIllIIIlIlII.getBytes(StandardCharsets.UTF_8)), lIIlIIlllIlII[9]), "DES");
            Cipher llllllllllllllIlllllIIllIIIlIlll = Cipher.getInstance("DES");
            llllllllllllllIlllllIIllIIIlIlll.init(lIIlIIlllIlII[3], secretKeySpec);
            return new String(llllllllllllllIlllllIIllIIIlIlll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllllIIllIIIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllllIIllIIIlIllI) {
            llllllllllllllIlllllIIllIIIlIllI.printStackTrace();
            return null;
        }
    }

    private static void lIlIlIlIlIIIlIl() {
        lIIlIIlllIIII = new String[lIIlIIlllIlII[9]];
        lIIlIIlllIIII[lIIlIIlllIlII[0]] = lIlIlIlIlIIIIlI("WACC8GLAH78=", "MABbc");
        lIIlIIlllIIII[lIIlIIlllIlII[1]] = lIlIlIlIlIIIIll("s8bhnm9HnBmmjmFfzEBklw==", "gwQuj");
        lIIlIIlllIIII[lIIlIIlllIlII[3]] = lIlIlIlIlIIIIlI("AcbT67G/6o5S2UAzudS0EQ==", "uChNI");
        lIIlIIlllIIII[lIIlIIlllIlII[4]] = lIlIlIlIlIIIlII("GQY6KVonHDorCTwcJig=", "KsTLz");
        lIIlIIlllIIII[lIIlIIlllIlII[5]] = lIlIlIlIlIIIlII("Ox4WNnYZAhs4NxEO", "ikxSV");
        lIIlIIlllIIII[lIIlIIlllIlII[6]] = lIlIlIlIlIIIIlI("rLdJ0zZiNFGcToCusPKqOg==", "aBgLD");
        lIIlIIlllIIII[lIIlIIlllIlII[7]] = lIlIlIlIlIIIIlI("CBvbLEVXAFO93G3Sykij9w==", "loxnp");
        lIIlIIlllIIII[lIIlIIlllIlII[8]] = lIlIlIlIlIIIlII("JwgRGSYIGFAEKwcYFRYoAhU=", "flptG");
    }

    @Inject
    public C0003d(C0006g c0006g, SquireSaraConfig squireSaraConfig) {
        this.m = c0006g;
        this.n = squireSaraConfig;
    }

    static {
        lIlIlIlIlIIlIlI();
        lIlIlIlIlIIIlIl();
        k = List.of(lIIlIIlllIIII[lIIlIIlllIlII[1]], lIIlIIlllIIII[lIIlIIlllIlII[3]], lIIlIIlllIIII[lIIlIIlllIlII[4]], lIIlIIlllIIII[lIIlIIlllIlII[5]], lIIlIIlllIIII[lIIlIIlllIlII[6]], lIIlIIlllIIII[lIIlIIlllIlII[7]], lIIlIIlllIIII[lIIlIIlllIlII[8]]);
        l = new C0004e();
    }

    private static String lIlIlIlIlIIIlII(String llllllllllllllIlllllIIlIlllllIII, String llllllllllllllIlllllIIlIllllIlll) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIlllllIIlIlllllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllllIIlIllllIllI = new StringBuilder();
        char[] charArray = llllllllllllllIlllllIIlIllllIlll.toCharArray();
        int llllllllllllllIlllllIIlIllllIlII = lIIlIIlllIlII[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIIlIIlllIlII[0];
        while (lIlIlIlIlIIlIll(i, length)) {
            llllllllllllllIlllllIIlIllllIllI.append((char) (charArray2[i] ^ charArray[llllllllllllllIlllllIIlIllllIlII % charArray.length]));
            "".length();
            llllllllllllllIlllllIIlIllllIlII++;
            i++;
            "".length();
            if ((84 ^ 80) < " ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIlllllIIlIllllIllI);
    }

    private static boolean lIlIlIlIlIIllIl(Object obj) {
        return obj != null;
    }

    private static boolean lIlIlIlIlIIllII(int i) {
        return i == 0;
    }

    public int a(TileItem tileItem) {
        return l.getOrDefault(tileItem.getName(), Integer.valueOf(lIIlIIlllIlII[0])).intValue();
    }
}
