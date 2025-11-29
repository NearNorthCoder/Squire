package s.r.e.p000.q.i.a.r.b.h.u.r.e.b.i.o;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.c  reason: invalid package */
/* loaded from: df6d2a51-cc28-47f1-b346-c5a30f777aad.jar:s/r/e/-/q/i/a/r/b/h/u/r/e/b/i/o/c.class */
public final class c {
    public static final /* synthetic */ c HARVESTING;
    private static /* synthetic */ int[] lllIIllIIIII;
    private static /* synthetic */ String[] lllIIlIlllll;
    public static final /* synthetic */ c PATHING;
    private static final /* synthetic */ c[] $VALUES;
    public static final /* synthetic */ c INSPECTING;
    public static final /* synthetic */ c STARTING;
    public static final /* synthetic */ c IDLE;
    public static final /* synthetic */ c FINISHING;

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    private static String lIIIlIlIIlIllIl(String lllllllllllllllIIllIlIIlIllIlllI, String lllllllllllllllIIllIlIIlIllIllIl) {
        try {
            SecretKeySpec lllllllllllllllIIllIlIIlIlllIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIIlIllIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIIllIIIII[2], lllllllllllllllIIllIlIIlIlllIIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIIlIllIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIlIIlIllIllll) {
            lllllllllllllllIIllIlIIlIllIllll.printStackTrace();
            return null;
        }
    }

    private static String lIIIlIlIIlIlIll(String lllllllllllllllIIllIlIIlIlIllllI, String lllllllllllllllIIllIlIIlIlIlllIl) {
        String lllllllllllllllIIllIlIIlIlIllllI2 = new String(Base64.getDecoder().decode(lllllllllllllllIIllIlIIlIlIllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIIllIlIIlIlIlllIl.toCharArray();
        int lllllllllllllllIIllIlIIlIlIllIlI = lllIIllIIIII[0];
        char[] charArray2 = lllllllllllllllIIllIlIIlIlIllllI2.toCharArray();
        int length = charArray2.length;
        int lllllllllllllllIIllIlIIlIlIlIIlI = lllIIllIIIII[0];
        while (lIIIlIlIIllIIII(lllllllllllllllIIllIlIIlIlIlIIlI, length)) {
            char lllllllllllllllIIllIlIIlIlIlllll = charArray2[lllllllllllllllIIllIlIIlIlIlIIlI];
            sb.append((char) (lllllllllllllllIIllIlIIlIlIlllll ^ charArray[lllllllllllllllIIllIlIIlIlIllIlI % charArray.length]));
            "".length();
            lllllllllllllllIIllIlIIlIlIllIlI++;
            lllllllllllllllIIllIlIIlIlIlIIlI++;
            "".length();
            if ("   ".length() > "   ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String lIIIlIlIIlIllII(String lllllllllllllllIIllIlIIlIlIIlIIl, String lllllllllllllllIIllIlIIlIlIIlIII) {
        try {
            SecretKeySpec lllllllllllllllIIllIlIIlIlIIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIIlIlIIlIII.getBytes(StandardCharsets.UTF_8)), lllIIllIIIII[7]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIIllIIIII[2], lllllllllllllllIIllIlIIlIlIIllII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIIlIlIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIlIIlIlIIlIlI) {
            lllllllllllllllIIllIlIIlIlIIlIlI.printStackTrace();
            return null;
        }
    }

    private static void lIIIlIlIIlIllll() {
        lllIIllIIIII = new int[8];
        lllIIllIIIII[0] = (59 ^ 109) & ((126 ^ 40) ^ (-1));
        lllIIllIIIII[1] = " ".length();
        lllIIllIIIII[2] = "  ".length();
        lllIIllIIIII[3] = "   ".length();
        lllIIllIIIII[4] = (125 ^ 55) ^ (214 ^ 152);
        lllIIllIIIII[5] = (13 ^ 55) ^ (111 ^ 80);
        lllIIllIIIII[6] = (125 ^ 75) ^ (84 ^ 100);
        lllIIllIIIII[7] = 184 ^ 176;
    }

    private static void lIIIlIlIIlIlllI() {
        lllIIlIlllll = new String[lllIIllIIIII[6]];
        lllIIlIlllll[lllIIllIIIII[0]] = lIIIlIlIIlIlIll("IQ0DASE/Cw==", "qLWIh");
        lllIIlIlllll[lllIIllIIIII[1]] = lIIIlIlIIlIllII("2nwIvWuwo9J7mHsVp5KnEw==", "iPgAL");
        lllIIlIlllll[lllIIllIIIII[2]] = lIIIlIlIIlIllII("11zXIyjW8TTclUpszitr7A==", "vQlet");
        lllIIlIlllll[lllIIllIIIII[3]] = lIIIlIlIIlIlIll("HQUOCxgHHwg=", "NQOYL");
        lllIIlIlllll[lllIIllIIIII[4]] = lIIIlIlIIlIllIl("c9R3M2eF0q8U2a+BTtJA0w==", "FSuaK");
        lllIIlIlllll[lllIIllIIIII[5]] = lIIIlIlIIlIllIl("ouDPs6Wgpck=", "sOQuG");
    }

    private static boolean lIIIlIlIIllIIII(int i, int i2) {
        return i < i2;
    }

    private c(String str, int i) {
    }

    static {
        lIIIlIlIIlIllll();
        lIIIlIlIIlIlllI();
        PATHING = new c(lllIIlIlllll[lllIIllIIIII[0]], lllIIllIIIII[0]);
        FINISHING = new c(lllIIlIlllll[lllIIllIIIII[1]], lllIIllIIIII[1]);
        HARVESTING = new c(lllIIlIlllll[lllIIllIIIII[2]], lllIIllIIIII[2]);
        STARTING = new c(lllIIlIlllll[lllIIllIIIII[3]], lllIIllIIIII[3]);
        INSPECTING = new c(lllIIlIlllll[lllIIllIIIII[4]], lllIIllIIIII[4]);
        IDLE = new c(lllIIlIlllll[lllIIllIIIII[5]], lllIIllIIIII[5]);
        c[] cVarArr = new c[lllIIllIIIII[6]];
        cVarArr[lllIIllIIIII[0]] = PATHING;
        cVarArr[lllIIllIIIII[1]] = FINISHING;
        cVarArr[lllIIllIIIII[2]] = HARVESTING;
        cVarArr[lllIIllIIIII[3]] = STARTING;
        cVarArr[lllIIllIIIII[4]] = INSPECTING;
        cVarArr[lllIIllIIIII[5]] = IDLE;
        $VALUES = cVarArr;
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
