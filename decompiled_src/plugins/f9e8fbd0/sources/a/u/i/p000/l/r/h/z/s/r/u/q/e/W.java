package a.u.i.p000.l.r.h.z.s.r.u.q.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrahConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Eating", priority = 50)
/* renamed from: a.u.i.-.l.r.h.z.s.r.u.q.e.W  reason: invalid package */
/* loaded from: f9e8fbd0-4571-4716-b37b-883b4ae7fc62.jar:a/u/i/-/l/r/h/z/s/r/u/q/e/W.class */
public class W extends ad {
    private static /* synthetic */ String[] lIllIlIlIllll;
    private static /* synthetic */ int[] lIllIlIllIIll;

    private static boolean llIIlIIIIlIIIIl(Object obj) {
        return obj == null;
    }

    private static boolean llIIlIIIIlIIllI(Object obj) {
        return obj != null;
    }

    static {
        llIIlIIIIlIIIII();
        llIIlIIIIIlllIl();
    }

    private static void llIIlIIIIlIIIII() {
        lIllIlIllIIll = new int[10];
        lIllIlIllIIll[0] = ((168 ^ 198) ^ (107 ^ 19)) & (((((113 + 11) - (-23)) + 16) ^ (((106 + 166) - 162) + 71)) ^ (-" ".length()));
        lIllIlIllIIll[1] = (-((-9861) & 26278)) & (-2057) & 23545;
        lIllIlIllIIll[2] = 150 ^ 130;
        lIllIlIllIIll[3] = " ".length();
        lIllIlIllIIll[4] = (-((-3930) & 32767)) & (-257) & 32237;
        lIllIlIllIIll[5] = "  ".length();
        lIllIlIllIIll[6] = "   ".length();
        lIllIlIllIIll[7] = (((172 + 14) - 81) + 80) ^ (((138 + 16) - 33) + 68);
        lIllIlIllIIll[8] = (51 ^ 80) ^ (79 ^ 41);
        lIllIlIllIIll[9] = 49 ^ 57;
    }

    private static boolean llIIlIIIIlIlIII(int i) {
        return i != 0;
    }

    private static boolean llIIlIIIIlIIlll(int i, int i2) {
        return i != i2;
    }

    private static String llIIlIIIIIllIII(String llllllllllllllIllIIIllIlIlIIIlll, String llllllllllllllIllIIIllIlIlIIIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIllIlIlIIIllI.getBytes(StandardCharsets.UTF_8)), lIllIlIllIIll[9]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIllIlIllIIll[5], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIllIlIlIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIIllIlIlIIlIII) {
            llllllllllllllIllIIIllIlIlIIlIII.printStackTrace();
            return null;
        }
    }

    private static String llIIlIIIIIlllII(String llllllllllllllIllIIIllIlIIllIIlI, String llllllllllllllIllIIIllIlIIllIllI) {
        String llllllllllllllIllIIIllIlIIllIIlI2 = new String(Base64.getDecoder().decode(llllllllllllllIllIIIllIlIIllIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIIllIlIIllIlIl = new StringBuilder();
        char[] charArray = llllllllllllllIllIIIllIlIIllIllI.toCharArray();
        int llllllllllllllIllIIIllIlIIllIIll = lIllIlIllIIll[0];
        char[] charArray2 = llllllllllllllIllIIIllIlIIllIIlI2.toCharArray();
        int llllllllllllllIllIIIllIlIIlIllII = charArray2.length;
        int i = lIllIlIllIIll[0];
        while (llIIlIIIIlIlIIl(i, llllllllllllllIllIIIllIlIIlIllII)) {
            llllllllllllllIllIIIllIlIIllIlIl.append((char) (charArray2[i] ^ charArray[llllllllllllllIllIIIllIlIIllIIll % charArray.length]));
            "".length();
            llllllllllllllIllIIIllIlIIllIIll++;
            i++;
            "".length();
            if ("  ".length() != "  ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllIIIllIlIIllIlIl);
    }

    private static void llIIlIIIIIlllIl() {
        lIllIlIlIllll = new String[lIllIlIllIIll[8]];
        lIllIlIlIllll[lIllIlIllIIll[0]] = llIIlIIIIIllIII("Uv0qqA+0hqI=", "BylTF");
        lIllIlIlIllll[lIllIlIllIIll[3]] = llIIlIIIIIllIIl("P5oUu2+5TRc=", "GHIAi");
        lIllIlIlIllll[lIllIlIllIIll[5]] = llIIlIIIIIlllII("FxsF", "RzqVT");
        lIllIlIlIllll[lIllIlIllIIll[6]] = llIIlIIIIIlllII("HAA1", "YaAqb");
        lIllIlIlIllll[lIllIlIllIIll[7]] = llIIlIIIIIllIIl("H1US+RqeqnQ=", "coTpo");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    @Override // a.u.i.p000.l.r.h.z.s.r.u.q.e.ad
    public boolean ac() {
        Item first = Inventory.getFirst(item -> {
            String str = lIllIlIlIllll[lIllIlIllIIll[7]];
            if (llIIlIIIIlIlIII(item.hasAction((v1) -> {
                return r1.equals(v1);
            }) ? 1 : 0) && llIIlIIIIlIIlll(item.getId(), lIllIlIllIIll[4])) {
                ?? r0 = lIllIlIllIIll[3];
                "".length();
                return (-((15 ^ 37) ^ (54 ^ 25))) >= 0 ? ((208 ^ 178) ^ (67 ^ 14)) & (((((33 + 1) - 12) + 108) ^ (((66 + 119) - 131) + 119)) ^ (-" ".length())) : r0;
            }
            return lIllIlIllIIll[0];
        });
        if (llIIlIIIIlIIIIl(first)) {
            first = Inventory.getFirst(item2 -> {
                String str = lIllIlIlIllll[lIllIlIllIIll[6]];
                return item2.hasAction((v1) -> {
                    return r1.equals(v1);
                });
            });
            if (llIIlIIIIlIIIIl(first)) {
                return lIllIlIllIIll[0];
            }
        }
        if (llIIlIIIIlIIIll(this.az.W().getAnimation(), lIllIlIllIIll[1])) {
            if (llIIlIIIIlIIlII(Combat.getMissingHealth(), lIllIlIllIIll[2])) {
                first.interact(lIllIlIlIllll[lIllIlIllIIll[0]]);
                return lIllIlIllIIll[3];
            }
            return lIllIlIllIIll[0];
        } else if (llIIlIIIIlIIlIl(Combat.getCurrentHealth(), this.aA.eatAtHP())) {
            first.interact(lIllIlIlIllll[lIllIlIllIIll[3]]);
            int[] iArr = new int[lIllIlIllIIll[3]];
            iArr[lIllIlIllIIll[0]] = lIllIlIllIIll[4];
            Item first2 = Inventory.getFirst(iArr);
            if (llIIlIIIIlIIllI(first2) && llIIlIIIIlIIlll(first.getId(), lIllIlIllIIll[4])) {
                first2.interact(lIllIlIlIllll[lIllIlIllIIll[5]]);
            }
            return lIllIlIllIIll[3];
        } else {
            return lIllIlIllIIll[0];
        }
    }

    private static boolean llIIlIIIIlIIIll(int i, int i2) {
        return i == i2;
    }

    @Inject
    protected W(C0021v c0021v, Client client, SquireZulrahConfig squireZulrahConfig) {
        super(c0021v, client, squireZulrahConfig);
    }

    private static boolean llIIlIIIIlIlIIl(int i, int i2) {
        return i < i2;
    }

    private static String llIIlIIIIIllIIl(String llllllllllllllIllIIIllIlIIlIIIlI, String llllllllllllllIllIIIllIlIIlIIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIllIlIIlIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIIllIlIIlIIlII = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIIllIlIIlIIlII.init(lIllIlIllIIll[5], secretKeySpec);
            return new String(llllllllllllllIllIIIllIlIIlIIlII.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIllIlIIlIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIIllIlIIlIIIll) {
            llllllllllllllIllIIIllIlIIlIIIll.printStackTrace();
            return null;
        }
    }

    private static boolean llIIlIIIIlIIlIl(int i, int i2) {
        return i <= i2;
    }

    private static boolean llIIlIIIIlIIlII(int i, int i2) {
        return i > i2;
    }
}
