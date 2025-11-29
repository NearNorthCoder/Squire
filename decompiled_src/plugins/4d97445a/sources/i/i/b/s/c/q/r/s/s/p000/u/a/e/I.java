package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.I  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/I.class */
public final class I {
    public static final /* synthetic */ I ITEM;
    private static final /* synthetic */ I[] $VALUES;
    public static final /* synthetic */ I SPELL;
    private static /* synthetic */ int[] lIllIIIl;
    private static /* synthetic */ String[] lIllIIII;
    public static final /* synthetic */ I TAB;

    private static void lIIllllIlI() {
        lIllIIII = new String[lIllIIIl[3]];
        lIllIIII[lIllIIIl[0]] = lIIllllIII("JzQJFjg=", "tdLZt");
        lIllIIII[lIllIIIl[1]] = lIIllllIII("AR80Jw==", "HKqjr");
        lIllIIII[lIllIIIl[2]] = lIIllllIIl("jlGIEw9l130=", "kmTOu");
    }

    private I(String str, int i2) {
    }

    public static I[] values() {
        return (I[]) $VALUES.clone();
    }

    private static boolean lIIlllllII(int i2, int i3) {
        return i2 < i3;
    }

    private static String lIIllllIIl(String llIllllIIllIllI, String llIllllIIllIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIllllIIllIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllIIIl[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIllllIIllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIllllIIllIlll) {
            llIllllIIllIlll.printStackTrace();
            return null;
        }
    }

    public static I valueOf(String str) {
        return (I) Enum.valueOf(I.class, str);
    }

    private static void lIIllllIll() {
        lIllIIIl = new int[4];
        lIllIIIl[0] = ((((97 + 3) - (-66)) + 12) ^ (((109 + 92) - 158) + 93)) & (((103 ^ 125) ^ (41 ^ 9)) ^ (-" ".length()));
        lIllIIIl[1] = " ".length();
        lIllIIIl[2] = "  ".length();
        lIllIIIl[3] = "   ".length();
    }

    private static String lIIllllIII(String llIllllIIlIIllI, String llIllllIIlIIlIl) {
        String llIllllIIlIIllI2 = new String(Base64.getDecoder().decode(llIllllIIlIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIllllIIlIIlII = new StringBuilder();
        char[] llIllllIIlIIIll = llIllllIIlIIlIl.toCharArray();
        int llIllllIIlIIIlI = lIllIIIl[0];
        char[] charArray = llIllllIIlIIllI2.toCharArray();
        int length = charArray.length;
        int i2 = lIllIIIl[0];
        while (lIIlllllII(i2, length)) {
            char llIllllIIlIIlll = charArray[i2];
            llIllllIIlIIlII.append((char) (llIllllIIlIIlll ^ llIllllIIlIIIll[llIllllIIlIIIlI % llIllllIIlIIIll.length]));
            "".length();
            llIllllIIlIIIlI++;
            i2++;
            "".length();
            if ((((173 ^ 155) ^ (56 ^ 52)) & (((234 ^ 128) ^ (103 ^ 55)) ^ (-" ".length()))) > 0) {
                return null;
            }
        }
        return String.valueOf(llIllllIIlIIlII);
    }

    static {
        lIIllllIll();
        lIIllllIlI();
        SPELL = new I(lIllIIII[lIllIIIl[0]], lIllIIIl[0]);
        ITEM = new I(lIllIIII[lIllIIIl[1]], lIllIIIl[1]);
        TAB = new I(lIllIIII[lIllIIIl[2]], lIllIIIl[2]);
        I[] iArr = new I[lIllIIIl[3]];
        iArr[lIllIIIl[0]] = SPELL;
        iArr[lIllIIIl[1]] = ITEM;
        iArr[lIllIIIl[2]] = TAB;
        $VALUES = iArr;
    }
}
