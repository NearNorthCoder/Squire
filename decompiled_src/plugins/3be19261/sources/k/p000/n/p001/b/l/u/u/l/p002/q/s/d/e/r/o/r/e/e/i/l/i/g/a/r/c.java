package k.p000.n.p001.b.l.u.u.l.p002.q.s.d.e.r.o.r.e.e.i.l.i.g.a.r;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: k.-.n.-.b.l.u.u.l.-.q.s.d.e.r.o.r.e.e.i.l.i.g.a.r.c  reason: invalid package */
/* loaded from: 3be19261-31a6-42fb-a6f1-3e9f39e6a450.jar:k/-/n/-/b/l/u/u/l/-/q/s/d/e/r/o/r/e/e/i/l/i/g/a/r/c.class */
public final class c {
    private static /* synthetic */ int[] lIIllllIlIlI;
    private static final /* synthetic */ c[] $VALUES;
    public static final /* synthetic */ c RANGE;
    public static final /* synthetic */ c MAGIC;
    public static final /* synthetic */ c MELEE;
    private static /* synthetic */ String[] lIIllllIlIIl;

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    private static String llIlIIIlllllll(String lllllllllllllllIlllIlIIlIIlIlIII, String lllllllllllllllIlllIlIIlIIlIIlll) {
        try {
            SecretKeySpec lllllllllllllllIlllIlIIlIIlIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlIIlIIlIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlllIlIIlIIlIlIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlllIlIIlIIlIlIlI.init(lIIllllIlIlI[2], lllllllllllllllIlllIlIIlIIlIlIll);
            return new String(lllllllllllllllIlllIlIIlIIlIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlIIlIIlIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIlIIlIIlIlIIl) {
            lllllllllllllllIlllIlIIlIIlIlIIl.printStackTrace();
            return null;
        }
    }

    private static void llIlIIlIIIIIII() {
        lIIllllIlIIl = new String[lIIllllIlIlI[3]];
        lIIllllIlIIl[lIIllllIlIlI[0]] = llIlIIIllllllI("OlWaSwfs334=", "GJdhD");
        lIIllllIlIIl[lIIllllIlIlI[1]] = llIlIIIllllllI("sFbYdH6UYpc=", "TJrvw");
        lIIllllIlIIl[lIIllllIlIlI[2]] = llIlIIIlllllll("0+KxLLXTq5A=", "uKSWD");
    }

    private static String llIlIIIllllllI(String lllllllllllllllIlllIlIIlIIllIlIl, String lllllllllllllllIlllIlIIlIIllIlII) {
        try {
            SecretKeySpec lllllllllllllllIlllIlIIlIIlllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlIIlIIllIlII.getBytes(StandardCharsets.UTF_8)), lIIllllIlIlI[4]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIllllIlIlI[2], lllllllllllllllIlllIlIIlIIlllIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlIIlIIllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIlIIlIIllIIIl) {
            lllllllllllllllIlllIlIIlIIllIIIl.printStackTrace();
            return null;
        }
    }

    static {
        llIlIIlIIIIIIl();
        llIlIIlIIIIIII();
        MELEE = new c(lIIllllIlIIl[lIIllllIlIlI[0]], lIIllllIlIlI[0]);
        MAGIC = new c(lIIllllIlIIl[lIIllllIlIlI[1]], lIIllllIlIlI[1]);
        RANGE = new c(lIIllllIlIIl[lIIllllIlIlI[2]], lIIllllIlIlI[2]);
        c[] cVarArr = new c[lIIllllIlIlI[3]];
        cVarArr[lIIllllIlIlI[0]] = MELEE;
        cVarArr[lIIllllIlIlI[1]] = MAGIC;
        cVarArr[lIIllllIlIlI[2]] = RANGE;
        $VALUES = cVarArr;
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    private c(String str, int i) {
    }

    private static void llIlIIlIIIIIIl() {
        lIIllllIlIlI = new int[5];
        lIIllllIlIlI[0] = (42 ^ 101) & ((214 ^ 153) ^ (-1));
        lIIllllIlIlI[1] = " ".length();
        lIIllllIlIlI[2] = "  ".length();
        lIIllllIlIlI[3] = "   ".length();
        lIIllllIlIlI[4] = (((39 + 0) - (-45)) + 105) ^ (((113 + 10) - (-16)) + 42);
    }
}
