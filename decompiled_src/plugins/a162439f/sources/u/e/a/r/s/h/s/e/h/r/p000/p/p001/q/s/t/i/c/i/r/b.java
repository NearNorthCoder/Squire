package u.e.a.r.s.h.s.e.h.r.p000.p.p001.q.s.t.i.c.i.r;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.b  reason: invalid package */
/* loaded from: a162439f-48e7-4aeb-adb7-778d42249168.jar:u/e/a/r/s/h/s/e/h/r/-/p/-/q/s/t/i/c/i/r/b.class */
public final class b {
    private static /* synthetic */ String[] lIlIllIlllII;
    private static final /* synthetic */ b[] $VALUES;
    private static /* synthetic */ int[] lIlIllIlllIl;
    public static final /* synthetic */ b CHARTER_SHIPS;

    private static void lllIIIIlIIlIIl() {
        lIlIllIlllIl = new int[3];
        lIlIllIlllIl[0] = (154 ^ 196) & ((152 ^ 198) ^ (-1)) & (((99 ^ 85) & ((97 ^ 87) ^ (-1))) ^ (-1));
        lIlIllIlllIl[1] = " ".length();
        lIlIllIlllIl[2] = "  ".length();
    }

    private b(String str, int i) {
    }

    static {
        lllIIIIlIIlIIl();
        lllIIIIlIIlIII();
        CHARTER_SHIPS = new b(lIlIllIlllII[lIlIllIlllIl[0]], lIlIllIlllIl[0]);
        b[] bVarArr = new b[lIlIllIlllIl[1]];
        bVarArr[lIlIllIlllIl[0]] = CHARTER_SHIPS;
        $VALUES = bVarArr;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    private static void lllIIIIlIIlIII() {
        lIlIllIlllII = new String[lIlIllIlllIl[1]];
        lIlIllIlllII[lIlIllIlllIl[0]] = lllIIIIlIIIlll("UG+bBWEjQOvJJSRfq+OvkQ==", "YRiXT");
    }

    private static String lllIIIIlIIIlll(String lllllllllllllllIllIIlIIlIIllIIlI, String lllllllllllllllIllIIlIIlIIllIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIlIIlIIllIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIllIlllIl[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIlIIlIIllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIIlIIlIIllIIll) {
            lllllllllllllllIllIIlIIlIIllIIll.printStackTrace();
            return null;
        }
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
