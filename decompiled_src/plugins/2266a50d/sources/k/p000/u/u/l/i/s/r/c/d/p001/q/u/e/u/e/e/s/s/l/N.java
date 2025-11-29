package k.p000.u.u.l.i.s.r.c.d.p001.q.u.e.u.e.e.s.s.l;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.SquireDukeSucellus;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Deposit Musca Mushroom", priority = 101, blocking = true)
/* renamed from: k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.N  reason: invalid package */
/* loaded from: 2266a50d-0893-46c4-a132-50718fc51d1a.jar:k/-/u/u/l/i/s/r/c/d/-/q/u/e/u/e/e/s/s/l/N.class */
public class N extends Task {
    private static /* synthetic */ String[] lIlllIIIIIll;
    private static /* synthetic */ int[] lIlllIIIIlIl;
    final /* synthetic */ SquireDukeSucellus bz;
    final /* synthetic */ C0000a bA;

    private static boolean lllIlIlIllIlIl(int i) {
        return i == 0;
    }

    private static boolean lllIlIlIllIllI(Object obj) {
        return obj != null;
    }

    private static String lllIlIlIlIlIll(String lllllllllllllllIlIlllIIIIlIllIlI, String lllllllllllllllIlIlllIIIIlIllIIl) {
        String lllllllllllllllIlIlllIIIIlIllIlI2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIlllIIIIlIllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIlIlllIIIIlIlIlll = lllllllllllllllIlIlllIIIIlIllIIl.toCharArray();
        int lllllllllllllllIlIlllIIIIlIlIllI = lIlllIIIIlIl[0];
        char[] charArray = lllllllllllllllIlIlllIIIIlIllIlI2.toCharArray();
        int length = charArray.length;
        int i = lIlllIIIIlIl[0];
        while (lllIlIlIllIlll(i, length)) {
            char lllllllllllllllIlIlllIIIIlIllIll = charArray[i];
            sb.append((char) (lllllllllllllllIlIlllIIIIlIllIll ^ lllllllllllllllIlIlllIIIIlIlIlll[lllllllllllllllIlIlllIIIIlIlIllI % lllllllllllllllIlIlllIIIIlIlIlll.length]));
            "".length();
            lllllllllllllllIlIlllIIIIlIlIllI++;
            i++;
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String lllIlIlIlIllII(String lllllllllllllllIlIlllIIIIlIIIIll, String lllllllllllllllIlIlllIIIIlIIIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllIIIIlIIIlII.getBytes(StandardCharsets.UTF_8)), lIlllIIIIlIl[7]), "DES");
            Cipher lllllllllllllllIlIlllIIIIlIIIlll = Cipher.getInstance("DES");
            lllllllllllllllIlIlllIIIIlIIIlll.init(lIlllIIIIlIl[1], secretKeySpec);
            return new String(lllllllllllllllIlIlllIIIIlIIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllIIIIlIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlllIIIIlIIIllI) {
            lllllllllllllllIlIlllIIIIlIIIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lllIlIlIllIlII(int i, int i2) {
        return i >= i2;
    }

    private static boolean lllIlIlIllIlll(int i, int i2) {
        return i < i2;
    }

    @Inject
    public N(SquireDukeSucellus squireDukeSucellus) {
        this.bz = squireDukeSucellus;
        this.bA = squireDukeSucellus.s();
    }

    static {
        lllIlIlIllIIlI();
        lllIlIlIlIllIl();
    }

    private static void lllIlIlIllIIlI() {
        lIlllIIIIlIl = new int[8];
        lIlllIIIIlIl[0] = "  ".length() & ("  ".length() ^ (-1));
        lIlllIIIIlIl[1] = "  ".length();
        lIlllIIIIlIl[2] = " ".length();
        lIlllIIIIlIl[3] = 140 ^ 138;
        lIlllIIIIlIl[4] = "   ".length();
        lIlllIIIIlIl[5] = 57 ^ 61;
        lIlllIIIIlIl[6] = 82 ^ 87;
        lIlllIIIIlIl[7] = 201 ^ 193;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    public boolean run() {
        TileObject nearest = TileObjects.getNearest(tileObject -> {
            if (lllIlIlIlllIII(tileObject.getName().equals(lIlllIIIIIll[lIlllIIIIlIl[5]]) ? 1 : 0)) {
                String[] strArr = new String[lIlllIIIIlIl[2]];
                strArr[lIlllIIIIlIl[0]] = lIlllIIIIIll[lIlllIIIIlIl[6]];
                if (lllIlIlIlllIII(tileObject.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIlllIIIIlIl[2];
                    "".length();
                    return (-"  ".length()) >= 0 ? ((((122 + 37) - 141) + 123) ^ (((86 + 70) - 39) + 39)) & (((166 ^ 198) ^ (75 ^ 58)) ^ (-" ".length())) : r0;
                }
            }
            return lIlllIIIIlIl[0];
        });
        if (lllIlIlIllIIll(nearest)) {
            return lIlllIIIIlIl[0];
        }
        Player local = Players.getLocal();
        if (lllIlIlIllIIll(local)) {
            return lIlllIIIIlIl[0];
        }
        int w = this.bA.w();
        if (!lllIlIlIllIlII(w, lIlllIIIIlIl[1]) && !lllIlIlIllIlIl(C0007h.i(nearest).contains(local) ? 1 : 0)) {
            String[] strArr = new String[lIlllIIIIlIl[2]];
            strArr[lIlllIIIIlIl[0]] = lIlllIIIIIll[lIlllIIIIlIl[0]];
            Item first = Inventory.getFirst(strArr);
            if (!lllIlIlIllIllI(first) || lllIlIlIllIlll(first.getQuantity(), lIlllIIIIlIl[3])) {
                return lIlllIIIIlIl[0];
            }
            TileObject nearest2 = TileObjects.getNearest(tileObject2 -> {
                String[] strArr2 = new String[lIlllIIIIlIl[2]];
                strArr2[lIlllIIIIlIl[0]] = lIlllIIIIIll[lIlllIIIIlIl[1]];
                if (!lllIlIlIlllIII(tileObject2.hasAction(strArr2) ? 1 : 0) || lllIlIlIllIlIl(tileObject2.getName().equals(lIlllIIIIIll[lIlllIIIIlIl[4]]) ? 1 : 0)) {
                    return lIlllIIIIlIl[0];
                }
                if (lllIlIlIllIlIl(w)) {
                    if (lllIlIlIlllIIl(tileObject2.getWorldX(), nearest.getWorldX())) {
                        ?? r0 = lIlllIIIIlIl[2];
                        "".length();
                        return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIlllIIIIlIl[0];
                } else if (lllIlIlIllIlll(tileObject2.getWorldX(), nearest.getWorldX())) {
                    ?? r02 = lIlllIIIIlIl[2];
                    "".length();
                    return (-" ".length()) >= (((140 ^ 169) ^ (78 ^ 57)) & (((((91 + 97) - 143) + 186) ^ (((70 + 18) - 44) + 137)) ^ (-" ".length()))) ? ((((118 + 224) - 267) + 152) ^ (((41 + 38) - (-15)) + 37)) & (((95 ^ 127) ^ (97 ^ 33)) ^ (-" ".length())) : r02;
                } else {
                    return lIlllIIIIlIl[0];
                }
            });
            if (lllIlIlIllIIll(nearest2)) {
                return lIlllIIIIlIl[0];
            }
            nearest2.interact(lIlllIIIIIll[lIlllIIIIlIl[2]]);
            return lIlllIIIIlIl[2];
        }
        return lIlllIIIIlIl[0];
    }

    private static String lllIlIlIlIlIlI(String lllllllllllllllIlIlllIIIIllIlIlI, String lllllllllllllllIlIlllIIIIllIlIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllIIIIllIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlllIIIIlIl[1], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllIIIIllIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlllIIIIllIlIll) {
            lllllllllllllllIlIlllIIIIllIlIll.printStackTrace();
            return null;
        }
    }

    private static boolean lllIlIlIlllIII(int i) {
        return i != 0;
    }

    private static void lllIlIlIlIllIl() {
        lIlllIIIIIll = new String[lIlllIIIIlIl[3]];
        lIlllIIIIIll[lIlllIIIIlIl[0]] = lllIlIlIlIlIlI("p4C1uKRT6zqkfycX3wA7oQ==", "oIilH");
        lIlllIIIIIll[lIlllIIIIlIl[2]] = lllIlIlIlIlIll("Ah8OKw==", "DvbGx");
        lIlllIIIIIll[lIlllIIIIlIl[1]] = lllIlIlIlIlIlI("ykNnP0iS0D4=", "PzXeG");
        lIlllIIIIIll[lIlllIIIIlIl[4]] = lllIlIlIlIlIll("KCgkBj0AOTcfMQEjdj05Gg==", "nMVkX");
        lIlllIIIIIll[lIlllIIIIlIl[5]] = lllIlIlIlIllII("cYF/jz+vm+Y=", "TVguw");
        lIlllIIIIIll[lIlllIIIIlIl[6]] = lllIlIlIlIlIll("ORkTDxhFCQkPEhgJ", "hlzls");
    }

    private static boolean lllIlIlIlllIIl(int i, int i2) {
        return i > i2;
    }

    private static boolean lllIlIlIllIIll(Object obj) {
        return obj == null;
    }
}
