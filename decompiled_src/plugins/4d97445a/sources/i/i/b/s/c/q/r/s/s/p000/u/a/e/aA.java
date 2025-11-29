package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.aA  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/aA.class */
public final class aA {
    private static /* synthetic */ int[] lllIIll;
    private final /* synthetic */ String name;
    public static final /* synthetic */ aA RED;
    public static final /* synthetic */ aA ALL;
    public static final /* synthetic */ aA BROWN;
    private static final /* synthetic */ aA[] $VALUES;
    private static /* synthetic */ String[] lllIIlI;
    public static final /* synthetic */ aA YELLOW;
    public static final /* synthetic */ aA ORANGE;

    public String ax() {
        return this.name;
    }

    public static aA[] values() {
        return (aA[]) $VALUES.clone();
    }

    private static void lllIIlIII() {
        lllIIll = new int[11];
        lllIIll[0] = (86 ^ 0) & ((74 ^ 28) ^ (-1));
        lllIIll[1] = " ".length();
        lllIIll[2] = "  ".length();
        lllIIll[3] = "   ".length();
        lllIIll[4] = (140 ^ 184) ^ (87 ^ 103);
        lllIIll[5] = 124 ^ 121;
        lllIIll[6] = 179 ^ 181;
        lllIIll[7] = (((69 + 137) - 71) + 3) ^ (((63 + 47) - 96) + 127);
        lllIIll[8] = 131 ^ 139;
        lllIIll[9] = 106 ^ 99;
        lllIIll[10] = (84 ^ 71) ^ (44 ^ 53);
    }

    private static void lllIIIlll() {
        lllIIlI = new String[lllIIll[10]];
        lllIIlI[lllIIll[0]] = lllIIIlII("o/LiTGTJ6jk=", "VXDVY");
        lllIIlI[lllIIll[1]] = lllIIIlII("8PMcY2H14iU=", "kBhmw");
        lllIIlI[lllIIll[2]] = lllIIIlIl("KiAkIQAk", "sehmO");
        lllIIlI[lllIIll[3]] = lllIIIllI("zabpWp/qumEqu38nb3CZRw==", "nEzwz");
        lllIIlI[lllIIll[4]] = lllIIIlIl("BQgCFi0=", "GZMAc");
        lllIIlI[lllIIll[5]] = lllIIIlII("LzeqgDOtkg9PWG0K06JKWg==", "RXwdd");
        lllIIlI[lllIIll[6]] = lllIIIllI("/GzzQfCE+AA=", "lTvXB");
        lllIIlI[lllIIll[7]] = lllIIIlII("4GWOTv2rg2X5xRxdUysY3w==", "EqQzC");
        lllIIlI[lllIIll[8]] = lllIIIlII("+3LXXE05/dM=", "FQgOF");
        lllIIlI[lllIIll[9]] = lllIIIlII("Un13D/ainTnmFaV4t+dDlw==", "bQEWD");
    }

    static {
        lllIIlIII();
        lllIIIlll();
        ALL = new aA(lllIIlI[lllIIll[0]], lllIIll[0], lllIIlI[lllIIll[1]]);
        YELLOW = new aA(lllIIlI[lllIIll[2]], lllIIll[1], lllIIlI[lllIIll[3]]);
        BROWN = new aA(lllIIlI[lllIIll[4]], lllIIll[2], lllIIlI[lllIIll[5]]);
        RED = new aA(lllIIlI[lllIIll[6]], lllIIll[3], lllIIlI[lllIIll[7]]);
        ORANGE = new aA(lllIIlI[lllIIll[8]], lllIIll[4], lllIIlI[lllIIll[9]]);
        aA[] aAVarArr = new aA[lllIIll[5]];
        aAVarArr[lllIIll[0]] = ALL;
        aAVarArr[lllIIll[1]] = YELLOW;
        aAVarArr[lllIIll[2]] = BROWN;
        aAVarArr[lllIIll[3]] = RED;
        aAVarArr[lllIIll[4]] = ORANGE;
        $VALUES = aAVarArr;
    }

    private static boolean lllIIlIIl(int i2, int i3) {
        return i2 < i3;
    }

    public static aA valueOf(String str) {
        return (aA) Enum.valueOf(aA.class, str);
    }

    private static String lllIIIllI(String lllIIlIlllllIII, String lllIIlIllllIlll) {
        try {
            SecretKeySpec lllIIlIlllllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIIlIllllIlll.getBytes(StandardCharsets.UTF_8)), lllIIll[8]), "DES");
            Cipher lllIIlIlllllIlI = Cipher.getInstance("DES");
            lllIIlIlllllIlI.init(lllIIll[2], lllIIlIlllllIll);
            return new String(lllIIlIlllllIlI.doFinal(Base64.getDecoder().decode(lllIIlIlllllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIIlIlllllIIl) {
            lllIIlIlllllIIl.printStackTrace();
            return null;
        }
    }

    private static String lllIIIlII(String lllIIllllIlIlIl, String lllIIllllIlIlII) {
        try {
            SecretKeySpec lllIIllllIllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIIllllIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIIll[2], lllIIllllIllIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllIIllllIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIIllllIlIllI) {
            lllIIllllIlIllI.printStackTrace();
            return null;
        }
    }

    private static String lllIIIlIl(String lllIIllIIIIllIl, String lllIIllIIIIIlll) {
        String str = new String(Base64.getDecoder().decode(lllIIllIIIIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllIIllIIIIlIlI = lllIIllIIIIIlll.toCharArray();
        int lllIIllIIIIlIIl = lllIIll[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i2 = lllIIll[0];
        while (lllIIlIIl(i2, length)) {
            char lllIIllIIIIlllI = charArray[i2];
            sb.append((char) (lllIIllIIIIlllI ^ lllIIllIIIIlIlI[lllIIllIIIIlIIl % lllIIllIIIIlIlI.length]));
            "".length();
            lllIIllIIIIlIIl++;
            i2++;
            "".length();
            if ((" ".length() & (" ".length() ^ (-" ".length()))) != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private aA(String str, int i2, String str2) {
        this.name = str2;
    }
}
