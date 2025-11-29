package a.n.q.u.l.p000.e.p001.e.s.a.b.r.i.s.u.t.r.c.f;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
/* renamed from: a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.v  reason: invalid package */
/* loaded from: 06deb524-30dc-422a-b422-0bec548b1d10.jar:a/n/q/u/l/-/e/-/e/s/a/b/r/i/s/u/t/r/c/f/v.class */
public class v extends w {
    private final /* synthetic */ int[] av;
    private static /* synthetic */ int[] lIIlIllllIlI;
    private static /* synthetic */ String[] lIIlIllllIIl;

    private static boolean llIIllIllIlIIl(Object obj) {
        return obj == null;
    }

    private static String llIIllIllIIlIl(String lllllllllllllllIllllIIIIlIllIIIl, String lllllllllllllllIllllIIIIlIllIIII) {
        try {
            SecretKeySpec lllllllllllllllIllllIIIIlIllIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllllIIIIlIllIIII.getBytes(StandardCharsets.UTF_8)), lIIlIllllIlI[9]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIlIllllIlI[3], lllllllllllllllIllllIIIIlIllIlII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIllllIIIIlIllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllllIIIIlIllIIlI) {
            lllllllllllllllIllllIIIIlIllIIlI.printStackTrace();
            return null;
        }
    }

    private static void llIIllIllIIllI() {
        lIIlIllllIIl = new String[lIIlIllllIlI[10]];
        lIIlIllllIIl[lIIlIllllIlI[0]] = llIIllIllIIIll("Yw==", "CMkxm");
        lIIlIllllIIl[lIIlIllllIlI[2]] = llIIllIllIIlII("nWz85A+FAt0=", "rhjOF");
        lIIlIllllIIl[lIIlIllllIlI[3]] = llIIllIllIIlII("/bkLFgoTZLQ=", "hrJWX");
        lIIlIllllIIl[lIIlIllllIlI[4]] = llIIllIllIIlIl("V4HuU0XgQGA=", "cjpiX");
        lIIlIllllIIl[lIIlIllllIlI[5]] = llIIllIllIIlII("7id+8jI8w+I=", "CJADB");
        lIIlIllllIIl[lIIlIllllIlI[6]] = llIIllIllIIlIl("qQW/gx8HNCs=", "mmgkg");
        lIIlIllllIIl[lIIlIllllIlI[7]] = llIIllIllIIlII("3QDD2miKlxw=", "nPbLO");
        lIIlIllllIIl[lIIlIllllIlI[8]] = llIIllIllIIlII("faQuUEgnreo=", "mQoGo");
        lIIlIllllIIl[lIIlIllllIlI[9]] = llIIllIllIIlII("6FYjk8fqKQA=", "wZqHK");
    }

    private static boolean llIIllIllIlIII(int i) {
        return i != 0;
    }

    private static String llIIllIllIIlII(String lllllllllllllllIllllIIIIlIlllllI, String lllllllllllllllIllllIIIIlIllllIl) {
        try {
            SecretKeySpec lllllllllllllllIllllIIIIllIIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllllIIIIlIllllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIlIllllIlI[3], lllllllllllllllIllllIIIIllIIIIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIllllIIIIlIlllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllllIIIIlIllllll) {
            lllllllllllllllIllllIIIIlIllllll.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v102, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v47, types: [boolean] */
    @Override // a.n.q.u.l.p000.e.p001.e.s.a.b.r.i.s.u.t.r.c.f.w
    public boolean c(C0014o c0014o) {
        Item first;
        if (llIIllIllIlIII(Bank.isOpen() ? 1 : 0)) {
            first = Bank.Inventory.getFirst(this.av);
            "".length();
            if ((21 ^ 16) <= 0) {
                return true & ((true ^ true) ^ true);
            }
        } else {
            first = Inventory.getFirst(this.av);
        }
        Item item = first;
        if (llIIllIllIlIIl(item)) {
            return lIIlIllllIlI[0];
        }
        String str = this.aw.split(lIIlIllllIIl[lIIlIllllIlI[0]])[lIIlIllllIlI[0]];
        float lllllllllllllllIllllIIIIllIllllI = lIIlIllllIlI[1];
        switch (str.hashCode()) {
            case -1850958250:
                if (llIIllIllIlIII(str.equals(lIIlIllllIIl[lIIlIllllIlI[3]]) ? 1 : 0)) {
                    lllllllllllllllIllllIIIIllIllllI = lIIlIllllIlI[2];
                    "".length();
                    if ((((219 ^ 142) ^ (139 ^ 188)) & (((207 ^ 149) ^ (129 ^ 185)) ^ (-" ".length()))) >= "   ".length()) {
                        return ((226 ^ 193) ^ (6 ^ 21)) & (((126 ^ 86) ^ (78 ^ 86)) ^ (-" ".length()));
                    }
                }
                break;
            case 2189731:
                if (llIIllIllIlIII(str.equals(lIIlIllllIIl[lIIlIllllIlI[4]]) ? 1 : 0)) {
                    lllllllllllllllIllllIIIIllIllllI = lIIlIllllIlI[3];
                    "".length();
                    if ("   ".length() == 0) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                }
                break;
            case 67081517:
                if (llIIllIllIlIII(str.equals(lIIlIllllIIl[lIIlIllllIlI[5]]) ? 1 : 0)) {
                    lllllllllllllllIllllIIIIllIllllI = lIIlIllllIlI[4];
                    break;
                }
                break;
            case 67205136:
                if (llIIllIllIlIII(str.equals(lIIlIllllIIl[lIIlIllllIlI[2]]) ? 1 : 0)) {
                    lllllllllllllllIllllIIIIllIllllI = lIIlIllllIlI[0];
                    "".length();
                    if ((142 ^ 139) <= 0) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                }
                break;
        }
        switch (lllllllllllllllIllllIIIIllIllllI) {
            case 0.0f:
                String[] strArr = new String[lIIlIllllIlI[4]];
                strArr[lIIlIllllIlI[0]] = lIIlIllllIIl[lIIlIllllIlI[6]];
                strArr[lIIlIllllIlI[2]] = lIIlIllllIIl[lIIlIllllIlI[7]];
                strArr[lIIlIllllIlI[3]] = lIIlIllllIIl[lIIlIllllIlI[8]];
                item.interact(strArr);
                "".length();
                if ((-" ".length()) != (-" ".length())) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
                break;
            case Float.MIN_VALUE:
            case 2.8E-45f:
                item.interact(lIIlIllllIIl[lIIlIllllIlI[9]]);
                c0014o.k().u();
                "".length();
                if ("   ".length() != "   ".length()) {
                    return ((((187 + 151) - 255) + 150) ^ (((11 + 74) - 73) + 151)) & (((58 ^ 126) ^ (84 ^ 90)) ^ (-" ".length()));
                }
                break;
            case 4.2E-45f:
                item.interact(str);
                c0014o.k().t();
                "".length();
                if (((((189 + 36) - 44) + 14) ^ (((187 + 139) - 197) + 70)) == (-" ".length())) {
                    return (" ".length() ^ (56 ^ 62)) & (((((106 + 160) - 192) + 125) ^ (((55 + 83) - 128) + 182)) ^ (-" ".length()));
                }
                break;
            default:
                item.interact(str);
                break;
        }
        return lIIlIllllIlI[2];
    }

    static {
        llIIllIllIIlll();
        llIIllIllIIllI();
    }

    public v(String str, int... iArr) {
        super(str);
        this.av = iArr;
    }

    public int[] I() {
        return this.av;
    }

    private static void llIIllIllIIlll() {
        lIIlIllllIlI = new int[11];
        lIIlIllllIlI[0] = (205 ^ 153) & ((3 ^ 87) ^ (-1));
        lIIlIllllIlI[1] = -" ".length();
        lIIlIllllIlI[2] = " ".length();
        lIIlIllllIlI[3] = "  ".length();
        lIIlIllllIlI[4] = "   ".length();
        lIIlIllllIlI[5] = 159 ^ 155;
        lIIlIllllIlI[6] = 167 ^ 162;
        lIIlIllllIlI[7] = (57 ^ 62) ^ " ".length();
        lIIlIllllIlI[8] = (((14 + 136) - 101) + 104) ^ (((127 + 108) - 134) + 57);
        lIIlIllllIlI[9] = 135 ^ 143;
        lIIlIllllIlI[10] = (((10 + 130) - 139) + 157) ^ (((108 + 115) - 184) + 112);
    }

    private static String llIIllIllIIIll(String lllllllllllllllIllllIIIIllIlIIll, String lllllllllllllllIllllIIIIllIlIIlI) {
        String lllllllllllllllIllllIIIIllIlIIll2 = new String(Base64.getDecoder().decode(lllllllllllllllIllllIIIIllIlIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllllIIIIllIlIIIl = new StringBuilder();
        char[] lllllllllllllllIllllIIIIllIlIIII = lllllllllllllllIllllIIIIllIlIIlI.toCharArray();
        int lllllllllllllllIllllIIIIllIIllll = lIIlIllllIlI[0];
        char[] charArray = lllllllllllllllIllllIIIIllIlIIll2.toCharArray();
        int length = charArray.length;
        int i = lIIlIllllIlI[0];
        while (llIIllIllIlIlI(i, length)) {
            char lllllllllllllllIllllIIIIllIlIlII = charArray[i];
            lllllllllllllllIllllIIIIllIlIIIl.append((char) (lllllllllllllllIllllIIIIllIlIlII ^ lllllllllllllllIllllIIIIllIlIIII[lllllllllllllllIllllIIIIllIIllll % lllllllllllllllIllllIIIIllIlIIII.length]));
            "".length();
            lllllllllllllllIllllIIIIllIIllll++;
            i++;
            "".length();
            if (((99 ^ 113) ^ (138 ^ 156)) < " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIllllIIIIllIlIIIl);
    }

    private static boolean llIIllIllIlIlI(int i, int i2) {
        return i < i2;
    }
}
