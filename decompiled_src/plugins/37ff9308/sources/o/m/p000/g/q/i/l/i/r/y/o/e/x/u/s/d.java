package o.m.p000.g.q.i.l.i.r.y.o.e.x.u.s;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: o.m.-.g.q.i.l.i.r.y.o.e.x.u.s.d  reason: invalid package */
/* loaded from: 37ff9308-5bb6-4332-83e0-8ab13e118f7a.jar:o/m/-/g/q/i/l/i/r/y/o/e/x/u/s/d.class */
public final class d {
    private static /* synthetic */ String[] lllllllIIlIl;
    public static final /* synthetic */ d CREATE_PASTE;
    private static final /* synthetic */ d[] $VALUES;
    public static final /* synthetic */ d MINIGAME;
    private static /* synthetic */ int[] lllllllIIllI;

    private static String lIIlIlIlIIIllll(String lllllllllllllllIIlIIIlIIllIllllI, String lllllllllllllllIIlIIIlIIllIlllIl) {
        String lllllllllllllllIIlIIIlIIllIllllI2 = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIIlIIllIllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIIIlIIllIlllII = new StringBuilder();
        char[] lllllllllllllllIIlIIIlIIllIllIll = lllllllllllllllIIlIIIlIIllIlllIl.toCharArray();
        int lllllllllllllllIIlIIIlIIllIllIlI = lllllllIIllI[0];
        char[] charArray = lllllllllllllllIIlIIIlIIllIllllI2.toCharArray();
        int length = charArray.length;
        int i = lllllllIIllI[0];
        while (lIIlIlIlIIlIIll(i, length)) {
            lllllllllllllllIIlIIIlIIllIlllII.append((char) (charArray[i] ^ lllllllllllllllIIlIIIlIIllIllIll[lllllllllllllllIIlIIIlIIllIllIlI % lllllllllllllllIIlIIIlIIllIllIll.length]));
            "".length();
            lllllllllllllllIIlIIIlIIllIllIlI++;
            i++;
            "".length();
            if (" ".length() > " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIlIIIlIIllIlllII);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    static {
        lIIlIlIlIIlIIlI();
        lIIlIlIlIIlIIIl();
        MINIGAME = new d(lllllllIIlIl[lllllllIIllI[0]], lllllllIIllI[0]);
        CREATE_PASTE = new d(lllllllIIlIl[lllllllIIllI[1]], lllllllIIllI[1]);
        d[] dVarArr = new d[lllllllIIllI[2]];
        dVarArr[lllllllIIllI[0]] = MINIGAME;
        dVarArr[lllllllIIllI[1]] = CREATE_PASTE;
        $VALUES = dVarArr;
    }

    private static void lIIlIlIlIIlIIIl() {
        lllllllIIlIl = new String[lllllllIIllI[2]];
        lllllllIIlIl[lllllllIIllI[0]] = lIIlIlIlIIIllll("Ag0JMCgOCQI=", "ODGyo");
        lllllllIIlIl[lllllllIIllI[1]] = lIIlIlIlIIlIIII("d1wz+cwTfnHvQJ8GevQF+A==", "GMJLK");
    }

    private static String lIIlIlIlIIlIIII(String lllllllllllllllIIlIIIlIIlllIllII, String lllllllllllllllIIlIIIlIIlllIllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIlIIlllIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIIIlIIllllIIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIIIlIIllllIIII.init(lllllllIIllI[2], secretKeySpec);
            return new String(lllllllllllllllIIlIIIlIIllllIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIlIIlllIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIIlIIlllIllll) {
            lllllllllllllllIIlIIIlIIlllIllll.printStackTrace();
            return null;
        }
    }

    private static void lIIlIlIlIIlIIlI() {
        lllllllIIllI = new int[3];
        lllllllIIllI[0] = ((56 ^ 91) ^ (196 ^ 186)) & (((((69 + 108) - 71) + 41) ^ (((128 + 38) - 129) + 105)) ^ (-" ".length()));
        lllllllIIllI[1] = " ".length();
        lllllllIIllI[2] = "  ".length();
    }

    private static boolean lIIlIlIlIIlIIll(int i, int i2) {
        return i < i2;
    }

    private d(String str, int i) {
    }
}
