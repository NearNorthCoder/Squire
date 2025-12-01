package s.s.e.u.p.i.r.r.p000.q.a.e.k.r.l.u.i.p.e.t.p001;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Drinking Anti Poison")
/* renamed from: s.s.e.u.p.i.r.r.-.q.a.e.k.r.l.u.i.p.e.t.-.f  reason: invalid package */
/* loaded from: 2e35b2d3-afef-4589-b5f3-450cbc042322.jar:s/s/e/u/p/i/r/r/-/q/a/e/k/r/l/u/i/p/e/t/-/f.class */
public class f extends Task {
    private static /* synthetic */ int[] lIlIIlIIIllll;
    private static /* synthetic */ String[] lIlIIlIIIlllI;

    private static String lIlllIlIIlIIIll(String llllllllllllllIllIlllIllllIIIIIl, String llllllllllllllIllIlllIllllIIIIII) {
        String llllllllllllllIllIlllIllllIIIIIl2 = new String(Base64.getDecoder().decode(llllllllllllllIllIlllIllllIIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIlllIlllIllllll = new StringBuilder();
        char[] llllllllllllllIllIlllIlllIlllllI = llllllllllllllIllIlllIllllIIIIII.toCharArray();
        int llllllllllllllIllIlllIlllIllllIl = lIlIIlIIIllll[0];
        char[] charArray = llllllllllllllIllIlllIllllIIIIIl2.toCharArray();
        int length = charArray.length;
        int i = lIlIIlIIIllll[0];
        while (lIlllIlIIlIlIIl(i, length)) {
            llllllllllllllIllIlllIlllIllllll.append((char) (charArray[i] ^ llllllllllllllIllIlllIlllIlllllI[llllllllllllllIllIlllIlllIllllIl % llllllllllllllIllIlllIlllIlllllI.length]));
            "".length();
            llllllllllllllIllIlllIlllIllllIl++;
            i++;
            "".length();
            if ((((235 ^ 154) ^ (208 ^ 183)) & (((108 ^ 103) ^ (87 ^ 74)) ^ (-" ".length()))) >= "   ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllIlllIlllIllllll);
    }

    private static void lIlllIlIIlIIllI() {
        lIlIIlIIIllll = new int[5];
        lIlIIlIIIllll[0] = (49 ^ 39) & ((92 ^ 74) ^ (-1));
        lIlIIlIIIllll[1] = " ".length();
        lIlIIlIIIllll[2] = "  ".length();
        lIlIIlIIIllll[3] = "   ".length();
        lIlIIlIIIllll[4] = (196 ^ 129) ^ (251 ^ 186);
    }

    private static void lIlllIlIIlIIlIl() {
        lIlIIlIIIlllI = new String[lIlIIlIIIllll[4]];
        lIlIIlIIIlllI[lIlIIlIIIllll[0]] = lIlllIlIIlIIIll("EyEzJxE=", "WSZIz");
        lIlIIlIIIlllI[lIlIIlIIIllll[1]] = lIlllIlIIlIIlII("E2UWVHkF7Ws=", "XDKsR");
        lIlIIlIIIlllI[lIlIIlIIIllll[2]] = lIlllIlIIlIIlII("d9aIWwpi4nY=", "bkeWc");
        lIlIIlIIIlllI[lIlIIlIIIllll[3]] = lIlllIlIIlIIlII("0Cws6wfmhZQ=", "EySfy");
    }

    private static boolean lIlllIlIIlIIlll(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    public boolean run() {
        if (!lIlllIlIIlIIlll(Combat.isPoisoned() ? 1 : 0) && !lIlllIlIIlIIlll(Inventory.contains(item -> {
            if (lIlllIlIIlIlIII(item.getName().toLowerCase().contains(lIlIIlIIIlllI[lIlIIlIIIllll[2]]) ? 1 : 0)) {
                String[] strArr = new String[lIlIIlIIIllll[1]];
                strArr[lIlIIlIIIllll[0]] = lIlIIlIIIlllI[lIlIIlIIIllll[3]];
                if (lIlllIlIIlIlIII(item.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIlIIlIIIllll[1];
                    "".length();
                    return (-" ".length()) > (153 ^ 157) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
            return lIlIIlIIIllll[0];
        }) ? 1 : 0)) {
            Inventory.getFirst(item2 -> {
                return item2.getName().toLowerCase().contains(lIlIIlIIIlllI[lIlIIlIIIllll[1]]);
            }).interact(lIlIIlIIIlllI[lIlIIlIIIllll[0]]);
            return lIlIIlIIIllll[1];
        }
        return lIlIIlIIIllll[0];
    }

    private static String lIlllIlIIlIIlII(String llllllllllllllIllIlllIllllIlIIIl, String llllllllllllllIllIlllIllllIlIIII) {
        try {
            SecretKeySpec llllllllllllllIllIlllIllllIlIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlllIllllIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIlllIllllIlIIll = Cipher.getInstance("Blowfish");
            llllllllllllllIllIlllIllllIlIIll.init(lIlIIlIIIllll[2], llllllllllllllIllIlllIllllIlIlII);
            return new String(llllllllllllllIllIlllIllllIlIIll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlllIllllIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlllIllllIlIIlI) {
            llllllllllllllIllIlllIllllIlIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllIlIIlIlIIl(int i, int i2) {
        return i < i2;
    }

    private static boolean lIlllIlIIlIlIII(int i) {
        return i != 0;
    }

    static {
        lIlllIlIIlIIllI();
        lIlllIlIIlIIlIl();
    }
}
