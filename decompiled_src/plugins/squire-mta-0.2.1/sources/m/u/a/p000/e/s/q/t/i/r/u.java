package m.u.a.p000.e.s.q.t.i.r;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mta.MagicArenaConfig;
import gg.squire.mta.SquireMTA;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
@TaskDesc(name = "Enchantment room", priority = 5, blocking = true)
/* renamed from: m.u.a.-.e.s.q.t.i.r.u  reason: invalid package */
/* loaded from: squire-mta-0.2.1.jar:m/u/a/-/e/s/q/t/i/r/u.class */
public class u extends w<j> {
    private static /* synthetic */ int[] lllIlIllllIl;
    @Inject
    private /* synthetic */ MagicArenaConfig j;
    private static /* synthetic */ String[] lllIlIlllIll;

    static {
        lIIIllIIlIlIllI();
        lIIIllIIlIlIIll();
    }

    private static boolean lIIIllIIlIllIIl(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    @Override // m.u.a.p000.e.s.q.t.i.r.w
    public boolean M() {
        String[] strArr = new String[lllIlIllllIl[1]];
        strArr[lllIlIllllIl[0]] = lllIlIlllIll[lllIlIllllIl[1]];
        if (lIIIllIIlIlIlll(Inventory.contains(strArr) ? 1 : 0)) {
            String[] strArr2 = new String[lllIlIllllIl[1]];
            strArr2[lllIlIllllIl[0]] = lllIlIlllIll[lllIlIllllIl[2]];
            Inventory.dropAll(strArr2);
            "".length();
        }
        i iVar = (i) Stream.of((Object[]) i.values()).filter((v0) -> {
            return v0.z();
        }).findFirst().orElse(null);
        if (lIIIllIIlIllIII(iVar)) {
            return lllIlIllllIl[0];
        }
        if (lIIIllIIlIlIlll(Inventory.contains(item -> {
            return item.getName().toLowerCase().contains(lllIlIlllIll[lllIlIllllIl[4]]);
        }) ? 1 : 0)) {
            Magic.cast(L(), Inventory.getFirst(item2 -> {
                return item2.getName().toLowerCase().contains(lllIlIlllIll[lllIlIllllIl[3]]);
            }));
            return lllIlIllllIl[1];
        }
        String[] strArr3 = new String[lllIlIllllIl[1]];
        strArr3[lllIlIllllIl[0]] = iVar.v();
        if (lIIIllIIlIlIlll(Inventory.contains(strArr3) ? 1 : 0)) {
            Spell L = L();
            String[] strArr4 = new String[lllIlIllllIl[1]];
            strArr4[lllIlIllllIl[0]] = iVar.v();
            Magic.cast(L, Inventory.getFirst(strArr4));
            return lllIlIllllIl[1];
        }
        String[] strArr5 = new String[lllIlIllllIl[1]];
        strArr5[lllIlIllllIl[0]] = iVar.y();
        TileObject nearest = TileObjects.getNearest(strArr5);
        if (lIIIllIIlIllIII(nearest)) {
            return lllIlIllllIl[0];
        }
        nearest.interact(lllIlIllllIl[0]);
        return lllIlIllllIl[1];
    }

    private static String lIIIllIIlIlIIII(String lllllllllllllllIIllIlIIlIllllIlI, String lllllllllllllllIIllIlIIlIlllIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIIlIlllIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIlIIlIlllllII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIlIIlIlllllII.init(lllIlIllllIl[2], secretKeySpec);
            return new String(lllllllllllllllIIllIlIIlIlllllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIIlIllllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIlIIlIllllIll) {
            lllllllllllllllIIllIlIIlIllllIll.printStackTrace();
            return null;
        }
    }

    @Inject
    private u(j jVar, SquireMTA squireMTA) {
        super(jVar, squireMTA);
    }

    private static boolean lIIIllIIlIlIlll(int i) {
        return i != 0;
    }

    private static void lIIIllIIlIlIllI() {
        lllIlIllllIl = new int[7];
        lllIlIllllIl[0] = (27 ^ 92) & ((71 ^ 0) ^ (-1));
        lllIlIllllIl[1] = " ".length();
        lllIlIllllIl[2] = "  ".length();
        lllIlIllllIl[3] = "   ".length();
        lllIlIllllIl[4] = (45 ^ 123) ^ (225 ^ 179);
        lllIlIllllIl[5] = 136 ^ 141;
        lllIlIllllIl[6] = (183 ^ 167) ^ (46 ^ 54);
    }

    private static String lIIIllIIlIlIIIl(String lllllllllllllllIIllIlIIlIllIllIl, String lllllllllllllllIIllIlIIlIllIllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIIlIllIllII.getBytes(StandardCharsets.UTF_8)), lllIlIllllIl[6]), "DES");
            Cipher lllllllllllllllIIllIlIIlIllIllll = Cipher.getInstance("DES");
            lllllllllllllllIIllIlIIlIllIllll.init(lllIlIllllIl[2], secretKeySpec);
            return new String(lllllllllllllllIIllIlIIlIllIllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIIlIllIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIlIIlIllIlllI) {
            lllllllllllllllIIllIlIIlIllIlllI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // m.u.a.p000.e.s.q.t.i.r.w
    public boolean a(Item item) {
        if (lIIIllIIlIlIlll(item.getName().toLowerCase().contains(lllIlIlllIll[lllIlIllllIl[0]]) ? 1 : 0) && lIIIllIIlIlIlll(Stream.of((Object[]) this.j.maximumEnchant().t().getRuneNames()).anyMatch(str -> {
            return item.getName().toLowerCase().contains(str.toLowerCase());
        }) ? 1 : 0)) {
            ?? r0 = lllIlIllllIl[1];
            "".length();
            return "  ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lllIlIllllIl[0];
    }

    @Override // m.u.a.p000.e.s.q.t.i.r.w
    public Spell L() {
        return this.j.maximumEnchant().u();
    }

    private static void lIIIllIIlIlIIll() {
        lllIlIlllIll = new String[lllIlIllllIl[5]];
        lllIlIlllIll[lllIlIllllIl[0]] = lIIIllIIlIlIIII("OCvxCOXux0U=", "jRqoW");
        lllIlIlllIll[lllIlIllllIl[1]] = lIIIllIIlIlIIII("s7PtnEh4Oks=", "KMCsz");
        lllIlIlllIll[lllIlIllllIl[2]] = lIIIllIIlIlIIIl("h7OTCO0hbAk=", "JwvHL");
        lllIlIlllIll[lllIlIllllIl[3]] = lIIIllIIlIlIIIl("YMKcy2S5qyh4qcyLekP8qw==", "HIrRq");
        lllIlIlllIll[lllIlIllllIl[4]] = lIIIllIIlIlIIlI("MgUbFzw4BA4fPTM=", "VwzpS");
    }

    private static boolean lIIIllIIlIllIII(Object obj) {
        return obj == null;
    }

    private static String lIIIllIIlIlIIlI(String lllllllllllllllIIllIlIIllIIIllll, String lllllllllllllllIIllIlIIllIIIlllI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIllIlIIllIIIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIIllIlIIllIIIllII = lllllllllllllllIIllIlIIllIIIlllI.toCharArray();
        int lllllllllllllllIIllIlIIllIIIlIll = lllIlIllllIl[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lllIlIllllIl[0];
        while (lIIIllIIlIllIIl(i, length)) {
            char lllllllllllllllIIllIlIIllIIlIIII = charArray[i];
            sb.append((char) (lllllllllllllllIIllIlIIllIIlIIII ^ lllllllllllllllIIllIlIIllIIIllII[lllllllllllllllIIllIlIIllIIIlIll % lllllllllllllllIIllIlIIllIIIllII.length]));
            "".length();
            lllllllllllllllIIllIlIIllIIIlIll++;
            i++;
            "".length();
            if ("  ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
}
