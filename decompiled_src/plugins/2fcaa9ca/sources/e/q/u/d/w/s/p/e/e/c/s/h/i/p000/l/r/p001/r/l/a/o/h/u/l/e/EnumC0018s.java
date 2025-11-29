package e.q.u.d.w.s.p.e.e.c.s.h.i.p000.l.r.p001.r.l.a.o.h.u.l.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.s  reason: invalid package and case insensitive filesystem */
/* loaded from: 2fcaa9ca-dfa8-475d-992d-ba368c0c843d.jar:e/q/u/d/w/s/p/e/e/c/s/h/i/-/l/r/-/r/l/a/o/h/u/l/e/s.class */
public final class EnumC0018s {
    private static /* synthetic */ int[] lllIIlIlIlll;
    private static final /* synthetic */ EnumC0018s[] $VALUES;
    private static /* synthetic */ String[] lllIIlIlIllI;
    public static final /* synthetic */ EnumC0018s INTERACT;

    private static String lIIIlIlIIIIllll(String lllllllllllllllIIllIlIlIlIlIIlll, String lllllllllllllllIIllIlIlIlIlIIllI) {
        try {
            SecretKeySpec lllllllllllllllIIllIlIlIlIlIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIlIlIlIIllI.getBytes(StandardCharsets.UTF_8)), lllIIlIlIlll[2]), "DES");
            Cipher lllllllllllllllIIllIlIlIlIlIlIIl = Cipher.getInstance("DES");
            lllllllllllllllIIllIlIlIlIlIlIIl.init(lllIIlIlIlll[3], lllllllllllllllIIllIlIlIlIlIlIlI);
            return new String(lllllllllllllllIIllIlIlIlIlIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIlIlIlIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIlIlIlIlIlIII) {
            lllllllllllllllIIllIlIlIlIlIlIII.printStackTrace();
            return null;
        }
    }

    static {
        lIIIlIlIIIlIIIl();
        lIIIlIlIIIlIIII();
        INTERACT = new EnumC0018s(lllIIlIlIllI[lllIIlIlIlll[0]], lllIIlIlIlll[0]);
        EnumC0018s[] enumC0018sArr = new EnumC0018s[lllIIlIlIlll[1]];
        enumC0018sArr[lllIIlIlIlll[0]] = INTERACT;
        $VALUES = enumC0018sArr;
    }

    private EnumC0018s(String str, int i) {
    }

    public static EnumC0018s valueOf(String str) {
        return (EnumC0018s) Enum.valueOf(EnumC0018s.class, str);
    }

    private static void lIIIlIlIIIlIIIl() {
        lllIIlIlIlll = new int[4];
        lllIIlIlIlll[0] = ((((106 + 123) - 121) + 66) ^ (((27 + 89) - (-30)) + 0)) & (((((51 + 112) - 151) + 128) ^ (((107 + 143) - 175) + 101)) ^ (-" ".length()));
        lllIIlIlIlll[1] = " ".length();
        lllIIlIlIlll[2] = (246 ^ 133) ^ (123 ^ 0);
        lllIIlIlIlll[3] = "  ".length();
    }

    private static void lIIIlIlIIIlIIII() {
        lllIIlIlIllI = new String[lllIIlIlIlll[1]];
        lllIIlIlIllI[lllIIlIlIlll[0]] = lIIIlIlIIIIllll("gCixbZKhOYqJHQhKHVoJRw==", "Uerdm");
    }

    public static EnumC0018s[] values() {
        return (EnumC0018s[]) $VALUES.clone();
    }
}
