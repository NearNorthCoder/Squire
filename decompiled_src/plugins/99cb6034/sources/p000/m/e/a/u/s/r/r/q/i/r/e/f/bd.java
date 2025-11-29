package p000.m.e.a.u.s.r.r.q.i.r.e.f;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Cleaning produce", priority = 21)
/* renamed from: -.m.e.a.u.s.r.r.q.i.r.e.f.bd  reason: invalid package */
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:-/m/e/a/u/s/r/r/q/i/r/e/f/bd.class */
public class bd extends AbstractC0026az {
    private static /* synthetic */ String[] lIlllIIlIIIl;
    private static /* synthetic */ int[] lIlllIIlIIll;

    private static void lllIlIllIlIlIl() {
        lIlllIIlIIIl = new String[lIlllIIlIIll[4]];
        lIlllIIlIIIl[lIlllIIlIIll[1]] = lllIlIllIIlIlI("Cxg1NT0=", "HtPTS");
        lIlllIIlIIIl[lIlllIIlIIll[2]] = lllIlIllIIlIll("3uLEqFZ6y5g=", "vZixi");
        lIlllIIlIIIl[lIlllIIlIIll[3]] = lllIlIllIIlIlI("OwANIwo=", "xlhBd");
    }

    @Inject
    public bd(C0031f c0031f, SquireFarmerConfig squireFarmerConfig, Client client) {
        super(c0031f, squireFarmerConfig, client);
    }

    private static boolean lllIlIllIllIII(int i) {
        return i <= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    public boolean run() {
        if (lllIlIllIlIlll(Players.getLocal().isAnimating() ? 1 : 0)) {
            sleep(lIlllIIlIIll[3]);
            return lIlllIIlIIll[1];
        } else if (lllIlIllIllIlI(Inventory.getFirst(item -> {
            String str = lIlllIIlIIIl[lIlllIIlIIll[3]];
            return item.hasAction((v1) -> {
                return r1.equals(v1);
            });
        }))) {
            return lIlllIIlIIll[1];
        } else {
            a(item2 -> {
                String str = lIlllIIlIIIl[lIlllIIlIIll[2]];
                return item2.hasAction((v1) -> {
                    return r1.equals(v1);
                });
            });
            "".length();
            return lIlllIIlIIll[2];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    public static boolean a(Predicate<Item> predicate) {
        int i = lIlllIIlIIll[0];
        for (Item item : Inventory.getAll(predicate)) {
            item.interact(lIlllIIlIIIl[lIlllIIlIIll[1]]);
            int i2 = i;
            i--;
            if (lllIlIllIllIII(i2)) {
                return lIlllIIlIIll[2];
            }
            "".length();
            if ((-((252 ^ 175) ^ (77 ^ 27))) >= 0) {
                return ((45 ^ 27) ^ (218 ^ 175)) & (((42 ^ 49) ^ (90 ^ 2)) ^ (-" ".length()));
            }
        }
        if (lllIlIllIllIIl(i, lIlllIIlIIll[0])) {
            ?? r0 = lIlllIIlIIll[2];
            "".length();
            return "   ".length() >= ((142 ^ 157) ^ (97 ^ 118)) ? ((196 ^ 140) ^ (148 ^ 135)) & (((((55 + 99) - 81) + 138) ^ (((131 + 29) - 121) + 97)) ^ (-" ".length())) : r0;
        }
        return lIlllIIlIIll[1];
    }

    private static String lllIlIllIIlIlI(String lllllllllllllllIlIllIlllIllIIIIl, String lllllllllllllllIlIllIlllIllIIIII) {
        String lllllllllllllllIlIllIlllIllIIIIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIllIlllIllIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIlIllIlllIllIIIII.toCharArray();
        int lllllllllllllllIlIllIlllIlIlllIl = lIlllIIlIIll[1];
        char[] charArray2 = lllllllllllllllIlIllIlllIllIIIIl2.toCharArray();
        int length = charArray2.length;
        int i = lIlllIIlIIll[1];
        while (lllIlIllIllIIl(i, length)) {
            char lllllllllllllllIlIllIlllIllIIIlI = charArray2[i];
            sb.append((char) (lllllllllllllllIlIllIlllIllIIIlI ^ charArray[lllllllllllllllIlIllIlllIlIlllIl % charArray.length]));
            "".length();
            lllllllllllllllIlIllIlllIlIlllIl++;
            i++;
            "".length();
            if ((121 ^ 124) <= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lllIlIllIlIlll(int i) {
        return i != 0;
    }

    private static String lllIlIllIIlIll(String lllllllllllllllIlIllIlllIlIIllII, String lllllllllllllllIlIllIlllIlIIlIll) {
        try {
            SecretKeySpec lllllllllllllllIlIllIlllIlIIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIlllIlIIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlllIIlIIll[3], lllllllllllllllIlIllIlllIlIIllll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIlllIlIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIllIlllIlIIllIl) {
            lllllllllllllllIlIllIlllIlIIllIl.printStackTrace();
            return null;
        }
    }

    private static void lllIlIllIlIllI() {
        lIlllIIlIIll = new int[5];
        lIlllIIlIIll[0] = 61 ^ 53;
        lIlllIIlIIll[1] = ((((106 + 146) - 206) + 192) ^ (((118 + 4) - 42) + 80)) & (((((66 + 79) - (-91)) + 8) ^ (((59 + 169) - 135) + 93)) ^ (-" ".length()));
        lIlllIIlIIll[2] = " ".length();
        lIlllIIlIIll[3] = "  ".length();
        lIlllIIlIIll[4] = "   ".length();
    }

    private static boolean lllIlIllIllIlI(Object obj) {
        return obj == null;
    }

    private static boolean lllIlIllIllIIl(int i, int i2) {
        return i < i2;
    }

    static {
        lllIlIllIlIllI();
        lllIlIllIlIlIl();
    }
}
