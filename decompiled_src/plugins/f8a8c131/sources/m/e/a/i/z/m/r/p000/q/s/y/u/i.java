package m.e.a.i.z.m.r.p000.q.s.y.u;

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
import net.runelite.api.Item;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;
@Singleton
/* renamed from: m.e.a.i.z.m.r.-.q.s.y.u.i  reason: invalid package */
/* loaded from: f8a8c131-0c60-4150-a875-6d5d0cb07058.jar:m/e/a/i/z/m/r/-/q/s/y/u/i.class */
public class i {
    private static /* synthetic */ int[] lIllIIlIIIlIl;
    private final /* synthetic */ l s;
    private static final /* synthetic */ HashMap<String, Integer> r;
    private final /* synthetic */ SquireZammyConfig t;
    private static /* synthetic */ String[] lIllIIlIIIlII;

    public Optional<Item> y() {
        return Inventory.getAll(item -> {
            if (llIIIlIlllIIIlI(item.getName()) && llIIIlIlllIIIll(r.containsKey(item.getName()) ? 1 : 0)) {
                ?? r0 = lIllIIlIIIlIl[1];
                "".length();
                return 0 != 0 ? ((21 ^ 105) ^ (196 ^ 183)) & (((13 ^ 28) ^ (150 ^ 136)) ^ (-" ".length())) : r0;
            }
            return lIllIIlIIIlIl[0];
        }).stream().filter(item2 -> {
            if (llIIIlIlllIIIIl(item2.getName().equals(lIllIIlIIIlII[lIllIIlIIIlIl[0]]) ? 1 : 0)) {
                ?? r0 = lIllIIlIIIlIl[1];
                "".length();
                return 0 != 0 ? ((55 ^ 85) ^ (33 ^ 73)) & (((99 ^ 122) ^ (33 ^ 50)) ^ (-" ".length())) : r0;
            }
            return lIllIIlIIIlIl[0];
        }).min(Comparator.comparingInt(item3 -> {
            return r.get(item3.getName()).intValue() * item3.getQuantity();
        }));
    }

    private static boolean llIIIlIlllIIIIl(int i) {
        return i == 0;
    }

    private static boolean llIIIlIlllIIIlI(Object obj) {
        return obj != null;
    }

    private static String llIIIlIllIlllIl(String llllllllllllllIllIIlIlIIllllIIIl, String llllllllllllllIllIIlIlIIllllIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlIlIIllllIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllIIlIIIlIl[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlIlIIllllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIlIlIIllllIIlI) {
            llllllllllllllIllIIlIlIIllllIIlI.printStackTrace();
            return null;
        }
    }

    public int a(TileItem tileItem) {
        return r.getOrDefault(tileItem.getName(), Integer.valueOf(lIllIIlIIIlIl[0])).intValue();
    }

    private static void llIIIlIllIlllll() {
        lIllIIlIIIlIl = new int[4];
        lIllIIlIIIlIl[0] = ((95 ^ 102) ^ "   ".length()) & (((((89 + 167) - 155) + 86) ^ (((117 + 65) - 175) + 122)) ^ (-" ".length()));
        lIllIIlIIIlIl[1] = " ".length();
        lIllIIlIIIlIl[2] = -" ".length();
        lIllIIlIIIlIl[3] = "  ".length();
    }

    public Optional<TileItem> x() {
        return TileItems.getAll(tileItem -> {
            if (llIIIlIlllIIIll(this.s.b(tileItem.getWorldLocation()) ? 1 : 0) && llIIIlIlllIIIlI(tileItem.getName()) && llIIIlIlllIIIll(r.containsKey(tileItem.getName()) ? 1 : 0)) {
                ?? r0 = lIllIIlIIIlIl[1];
                "".length();
                return "  ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIllIIlIIIlIl[0];
        }).stream().max(Comparator.comparingInt(obj -> {
            return ((TileItem) obj).getQuantity() * r.getOrDefault(((TileItem) obj).getName(), Integer.valueOf(lIllIIlIIIlIl[2])).intValue();
        }).thenComparingDouble(obj2 -> {
            return -((TileItem) obj2).getWorldLocation().distanceToHypotenuse(Players.getLocal().getWorldLocation());
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    public boolean a(Item item, TileItem tileItem) {
        if (llIIIlIlllIIIII(r.get(item.getName()).intValue() * item.getQuantity(), r.get(tileItem.getName()).intValue() * tileItem.getQuantity())) {
            ?? r0 = lIllIIlIIIlIl[1];
            "".length();
            return (-(166 ^ 162)) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIllIIlIIIlIl[0];
    }

    @Inject
    public i(l lVar, SquireZammyConfig squireZammyConfig) {
        this.s = lVar;
        this.t = squireZammyConfig;
    }

    private static boolean llIIIlIlllIIIll(int i) {
        return i != 0;
    }

    static {
        llIIIlIllIlllll();
        llIIIlIllIllllI();
        r = new j();
    }

    private static void llIIIlIllIllllI() {
        lIllIIlIIIlII = new String[lIllIIlIIIlIl[1]];
        lIllIIlIIIlII[lIllIIlIIIlIl[0]] = llIIIlIllIlllIl("zIiQwyFBe/w=", "GBUxv");
    }

    private static boolean llIIIlIlllIIIII(int i, int i2) {
        return i < i2;
    }
}
