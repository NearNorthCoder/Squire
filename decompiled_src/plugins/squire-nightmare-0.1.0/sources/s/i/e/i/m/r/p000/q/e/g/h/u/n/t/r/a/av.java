package s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.av  reason: invalid package */
/* loaded from: squire-nightmare-0.1.0.jar:s/i/e/i/m/r/-/q/e/g/h/u/n/t/r/a/av.class */
final class av {
    public static final /* synthetic */ av WEST;
    private static /* synthetic */ int[] llllIIlIIllI;
    private static /* synthetic */ String[] llllIIlIIlIl;
    public static final /* synthetic */ av NORTH;
    private static final /* synthetic */ av[] $VALUES;
    public static final /* synthetic */ av EAST;
    public static final /* synthetic */ av SOUTH;

    private static String lIIIllllIllllll(String lllllllllllllllIIlIllllIlIIIIllI, String lllllllllllllllIIlIllllIlIIIIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllllIlIIIIlIl.getBytes(StandardCharsets.UTF_8)), llllIIlIIllI[5]), "DES");
            Cipher lllllllllllllllIIlIllllIlIIIlIII = Cipher.getInstance("DES");
            lllllllllllllllIIlIllllIlIIIlIII.init(llllIIlIIllI[2], secretKeySpec);
            return new String(lllllllllllllllIIlIllllIlIIIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllllIlIIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIllllIlIIIIlll) {
            lllllllllllllllIIlIllllIlIIIIlll.printStackTrace();
            return null;
        }
    }

    public static av valueOf(String str) {
        return (av) Enum.valueOf(av.class, str);
    }

    public static av[] values() {
        return (av[]) $VALUES.clone();
    }

    private static String lIIIlllllIIIIIl(String lllllllllllllllIIlIllllIlIIlIIll, String lllllllllllllllIIlIllllIlIIlIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllllIlIIlIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llllIIlIIllI[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllllIlIIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIllllIlIIlIlII) {
            lllllllllllllllIIlIllllIlIIlIlII.printStackTrace();
            return null;
        }
    }

    static {
        lIIIlllllIIIIll();
        lIIIlllllIIIIlI();
        NORTH = new av(llllIIlIIlIl[llllIIlIIllI[0]], llllIIlIIllI[0]);
        SOUTH = new av(llllIIlIIlIl[llllIIlIIllI[1]], llllIIlIIllI[1]);
        EAST = new av(llllIIlIIlIl[llllIIlIIllI[2]], llllIIlIIllI[2]);
        WEST = new av(llllIIlIIlIl[llllIIlIIllI[3]], llllIIlIIllI[3]);
        av[] avVarArr = new av[llllIIlIIllI[4]];
        avVarArr[llllIIlIIllI[0]] = NORTH;
        avVarArr[llllIIlIIllI[1]] = SOUTH;
        avVarArr[llllIIlIIllI[2]] = EAST;
        avVarArr[llllIIlIIllI[3]] = WEST;
        $VALUES = avVarArr;
    }

    private av(String str, int i) {
    }

    private static void lIIIlllllIIIIll() {
        llllIIlIIllI = new int[6];
        llllIIlIIllI[0] = (197 ^ 139) & ((231 ^ 169) ^ (-1));
        llllIIlIIllI[1] = " ".length();
        llllIIlIIllI[2] = "  ".length();
        llllIIlIIllI[3] = "   ".length();
        llllIIlIIllI[4] = (((93 + 138) - 173) + 98) ^ (((90 + 15) - (-22)) + 25);
        llllIIlIIllI[5] = (113 ^ 121) ^ ((16 ^ 28) & ((176 ^ 188) ^ (-1)));
    }

    private static String lIIIlllllIIIIII(String lllllllllllllllIIlIllllIIlllIllI, String lllllllllllllllIIlIllllIIlllIlIl) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIlIllllIIlllIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIIlIllllIIlllIIll = lllllllllllllllIIlIllllIIlllIlIl.toCharArray();
        int lllllllllllllllIIlIllllIIlllIIlI = llllIIlIIllI[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = llllIIlIIllI[0];
        while (lIIIlllllIIIlII(i, length)) {
            sb.append((char) (charArray[i] ^ lllllllllllllllIIlIllllIIlllIIll[lllllllllllllllIIlIllllIIlllIIlI % lllllllllllllllIIlIllllIIlllIIll.length]));
            "".length();
            lllllllllllllllIIlIllllIIlllIIlI++;
            i++;
            "".length();
            if (" ".length() != " ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void lIIIlllllIIIIlI() {
        llllIIlIIlIl = new String[llllIIlIIllI[4]];
        llllIIlIIlIl[llllIIlIIllI[0]] = lIIIllllIllllll("fzuXf5hiue4=", "YSOma");
        llllIIlIIlIl[llllIIlIIllI[1]] = lIIIllllIllllll("bw4m8dVyl5U=", "pcTfQ");
        llllIIlIIlIl[llllIIlIIllI[2]] = lIIIlllllIIIIII("LwoZIw==", "jKJwX");
        llllIIlIIlIl[llllIIlIIllI[3]] = lIIIlllllIIIIIl("YtrMr8AjiRs=", "nMpiq");
    }

    private static boolean lIIIlllllIIIlII(int i, int i2) {
        return i < i2;
    }
}
