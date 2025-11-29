package p000.p001.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.h  reason: invalid package */
/* loaded from: a295c4aa-95d9-42ec-b8cf-442736b096bd.jar:-/-/u/o/s/q/s/i/e/y/a/i/d/t/n/r/n/u/r/g/f/h.class */
public final class h {
    public static final /* synthetic */ h RED;
    public static final /* synthetic */ h GREEN;
    private static /* synthetic */ String[] llIlIlIIlllI;
    public static final /* synthetic */ h YELLOW;
    private final /* synthetic */ int highlightChildId;
    private final /* synthetic */ int childId;
    private static /* synthetic */ int[] llIlIlIIllll;
    private static final /* synthetic */ h[] $VALUES;

    private static void lIIIIIlIlllllIl() {
        llIlIlIIlllI = new String[llIlIlIIllll[9]];
        llIlIlIIlllI[llIlIlIIllll[0]] = lIIIIIlIllllIll("ijz0eWRN8Yw=", "mygFY");
        llIlIlIIlllI[llIlIlIIllll[3]] = lIIIIIlIlllllII("Ly4eDiwh", "vkRBc");
        llIlIlIIlllI[llIlIlIIllll[6]] = lIIIIIlIllllIll("n+GjDHEMNIA=", "tYxhm");
    }

    private static String lIIIIIlIllllIll(String lllllllllllllllIlIIIIlIllIIIllII, String lllllllllllllllIlIIIIlIllIIIlIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIIlIllIIIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIIIlIllIIIlllI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIIIlIllIIIlllI.init(llIlIlIIllll[6], secretKeySpec);
            return new String(lllllllllllllllIlIIIIlIllIIIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIIlIllIIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIIIlIllIIIllIl) {
            lllllllllllllllIlIIIIlIllIIIllIl.printStackTrace();
            return null;
        }
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }

    private static void lIIIIIllIIIlIII() {
        llIlIlIIllll = new int[10];
        llIlIlIIllll[0] = (91 ^ 19) & ((87 ^ 31) ^ (-1)) & (((29 ^ 80) & ((69 ^ 8) ^ (-1))) ^ (-1));
        llIlIlIIllll[1] = 170 ^ 191;
        llIlIlIIllll[2] = 106 ^ 117;
        llIlIlIIllll[3] = " ".length();
        llIlIlIIllll[4] = (110 ^ 24) ^ (230 ^ 132);
        llIlIlIIllll[5] = (((207 + 89) - 255) + 214) ^ (((25 + 5) - (-102)) + 62);
        llIlIlIIllll[6] = "  ".length();
        llIlIlIIllll[7] = 143 ^ 156;
        llIlIlIIllll[8] = 213 ^ 146;
        llIlIlIIllll[9] = "   ".length();
    }

    public int L() {
        return this.highlightChildId;
    }

    private static String lIIIIIlIlllllII(String lllllllllllllllIlIIIIlIlIlllllII, String lllllllllllllllIlIIIIlIlIlllIllI) {
        String lllllllllllllllIlIIIIlIlIlllllII2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIIIIlIlIlllllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIlIIIIlIlIllllIIl = lllllllllllllllIlIIIIlIlIlllIllI.toCharArray();
        int lllllllllllllllIlIIIIlIlIllllIII = llIlIlIIllll[0];
        char[] charArray = lllllllllllllllIlIIIIlIlIlllllII2.toCharArray();
        int length = charArray.length;
        int lllllllllllllllIlIIIIlIlIlllIIII = llIlIlIIllll[0];
        while (lIIIIIllIIIlIIl(lllllllllllllllIlIIIIlIlIlllIIII, length)) {
            char lllllllllllllllIlIIIIlIlIlllllIl = charArray[lllllllllllllllIlIIIIlIlIlllIIII];
            sb.append((char) (lllllllllllllllIlIIIIlIlIlllllIl ^ lllllllllllllllIlIIIIlIlIllllIIl[lllllllllllllllIlIIIIlIlIllllIII % lllllllllllllllIlIIIIlIlIllllIIl.length]));
            "".length();
            lllllllllllllllIlIIIIlIlIllllIII++;
            lllllllllllllllIlIIIIlIlIlllIIII++;
            "".length();
            if ("  ".length() != "  ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    static {
        lIIIIIllIIIlIII();
        lIIIIIlIlllllIl();
        RED = new h(llIlIlIIlllI[llIlIlIIllll[0]], llIlIlIIllll[0], llIlIlIIllll[1], llIlIlIIllll[2]);
        YELLOW = new h(llIlIlIIlllI[llIlIlIIllll[3]], llIlIlIIllll[3], llIlIlIIllll[4], llIlIlIIllll[5]);
        GREEN = new h(llIlIlIIlllI[llIlIlIIllll[6]], llIlIlIIllll[6], llIlIlIIllll[7], llIlIlIIllll[8]);
        h[] hVarArr = new h[llIlIlIIllll[9]];
        hVarArr[llIlIlIIllll[0]] = RED;
        hVarArr[llIlIlIIllll[3]] = YELLOW;
        hVarArr[llIlIlIIllll[6]] = GREEN;
        $VALUES = hVarArr;
    }

    private h(String str, int i, int i2, int i3) {
        this.childId = i2;
        this.highlightChildId = i3;
    }

    private static boolean lIIIIIllIIIlIIl(int i, int i2) {
        return i < i2;
    }

    public int K() {
        return this.childId;
    }
}
