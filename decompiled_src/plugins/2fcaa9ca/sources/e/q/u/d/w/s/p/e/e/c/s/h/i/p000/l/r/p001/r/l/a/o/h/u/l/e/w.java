package e.q.u.d.w.s.p.e.e.c.s.h.i.p000.l.r.p001.r.l.a.o.h.u.l.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.w  reason: invalid package */
/* loaded from: 2fcaa9ca-dfa8-475d-992d-ba368c0c843d.jar:e/q/u/d/w/s/p/e/e/c/s/h/i/-/l/r/-/r/l/a/o/h/u/l/e/w.class */
public final class w {
    /* synthetic */ String name;
    private static /* synthetic */ int[] lllIIIIlIIIl;
    public static final /* synthetic */ w NONE;
    private static final /* synthetic */ w[] $VALUES;
    public static final /* synthetic */ w HALLOWED_HAMMER;
    private static /* synthetic */ String[] lllIIIIIllll;
    public static final /* synthetic */ w HAMMER;

    private static void lIIIlIIIIlIllII() {
        lllIIIIIllll = new String[lllIIIIlIIIl[6]];
        lllIIIIIllll[lllIIIIlIIIl[0]] = lIIIlIIIIlIlIlI("FRYtb5gkZQE=", "YNSUh");
        lllIIIIIllll[lllIIIIlIIIl[1]] = lIIIlIIIIlIlIll("PjL+8IStxZs=", "AlLse");
        lllIIIIIllll[lllIIIIlIIIl[2]] = lIIIlIIIIlIlIll("VktYtZNlcZ8=", "agcUj");
        lllIIIIIllll[lllIIIIlIIIl[3]] = lIIIlIIIIlIlIll("vYV7rM2oGPs=", "QDZjJ");
        lllIIIIIllll[lllIIIIlIIIl[4]] = lIIIlIIIIlIlIlI("o0fCCw9ObRpwPRhdcZTQ1Q==", "NIecm");
        lllIIIIIllll[lllIIIIlIIIl[5]] = lIIIlIIIIlIlIlI("r3ZDejkROy7l5mtivQZnoA==", "nhlfl");
    }

    private static String lIIIlIIIIlIlIlI(String lllllllllllllllIIlllIIlIIIlIIIII, String lllllllllllllllIIlllIIlIIIIlllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlllIIlIIIIlllll.getBytes(StandardCharsets.UTF_8)), lllIIIIlIIIl[7]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIIIIlIIIl[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlllIIlIIIlIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlllIIlIIIlIIIIl) {
            lllllllllllllllIIlllIIlIIIlIIIIl.printStackTrace();
            return null;
        }
    }

    static {
        lIIIlIIIIlllIIl();
        lIIIlIIIIlIllII();
        NONE = new w(lllIIIIIllll[lllIIIIlIIIl[0]], lllIIIIlIIIl[0], lllIIIIIllll[lllIIIIlIIIl[1]]);
        HAMMER = new w(lllIIIIIllll[lllIIIIlIIIl[2]], lllIIIIlIIIl[1], lllIIIIIllll[lllIIIIlIIIl[3]]);
        HALLOWED_HAMMER = new w(lllIIIIIllll[lllIIIIlIIIl[4]], lllIIIIlIIIl[2], lllIIIIIllll[lllIIIIlIIIl[5]]);
        w[] wVarArr = new w[lllIIIIlIIIl[3]];
        wVarArr[lllIIIIlIIIl[0]] = NONE;
        wVarArr[lllIIIIlIIIl[1]] = HAMMER;
        wVarArr[lllIIIIlIIIl[2]] = HALLOWED_HAMMER;
        $VALUES = wVarArr;
    }

    public static w[] values() {
        return (w[]) $VALUES.clone();
    }

    private static String lIIIlIIIIlIlIll(String lllllllllllllllIIlllIIlIIIlIllIl, String lllllllllllllllIIlllIIlIIIlIllII) {
        try {
            SecretKeySpec lllllllllllllllIIlllIIlIIIllIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlllIIlIIIlIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIIIIlIIIl[2], lllllllllllllllIIlllIIlIIIllIIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlllIIlIIIlIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlllIIlIIIlIlllI) {
            lllllllllllllllIIlllIIlIIIlIlllI.printStackTrace();
            return null;
        }
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    private w(String str, int i, String str2) {
        this.name = str2;
    }

    private static void lIIIlIIIIlllIIl() {
        lllIIIIlIIIl = new int[8];
        lllIIIIlIIIl[0] = (239 ^ 180) & ((73 ^ 18) ^ (-1));
        lllIIIIlIIIl[1] = " ".length();
        lllIIIIlIIIl[2] = "  ".length();
        lllIIIIlIIIl[3] = "   ".length();
        lllIIIIlIIIl[4] = 128 ^ 132;
        lllIIIIlIIIl[5] = 198 ^ 195;
        lllIIIIlIIIl[6] = 78 ^ 72;
        lllIIIIlIIIl[7] = 124 ^ 116;
    }
}
