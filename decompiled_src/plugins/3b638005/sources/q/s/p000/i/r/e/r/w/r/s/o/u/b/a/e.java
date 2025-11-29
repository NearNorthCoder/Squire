package q.s.p000.i.r.e.r.w.r.s.o.u.b.a;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: q.s.-.i.r.e.r.w.r.s.o.u.b.a.e  reason: invalid package */
/* loaded from: 3b638005-922a-492f-9405-93e6a5194477.jar:q/s/-/i/r/e/r/w/r/s/o/u/b/a/e.class */
public final class e {
    private final /* synthetic */ String npcName;
    private static final /* synthetic */ e[] $VALUES;
    public static final /* synthetic */ e CRYPT_SPIDER;
    private static /* synthetic */ int[] llllIIIllIl;
    private final /* synthetic */ int potential;
    public static final /* synthetic */ e CRYPT_RAT;
    public static final /* synthetic */ e GIANT_CRYPT_SPIDER;
    public static final /* synthetic */ e GIANT_CRYPT_RAT;
    public static final /* synthetic */ e SKELETON;
    private static /* synthetic */ String[] llllIIIllII;
    public static final /* synthetic */ e BLOODWORM;

    private e(String str, int i, int i2, String str2) {
        this.potential = i2;
        this.npcName = str2;
    }

    public String H() {
        return this.npcName;
    }

    private static void lIllIIllllIlII() {
        llllIIIllIl = new int[19];
        llllIIIllIl[0] = ((91 ^ 117) ^ (180 ^ 140)) & (((244 ^ 196) ^ (109 ^ 75)) ^ (-" ".length()));
        llllIIIllIl[1] = (((127 + 148) - 272) + 172) ^ (((90 + 79) - 74) + 37);
        llllIIIllIl[2] = " ".length();
        llllIIIllIl[3] = "  ".length();
        llllIIIllIl[4] = 167 ^ 147;
        llllIIIllIl[5] = "   ".length();
        llllIIIllIl[6] = 53 ^ 49;
        llllIIIllIl[7] = 160 ^ 152;
        llllIIIllIl[8] = (62 ^ 11) ^ (52 ^ 4);
        llllIIIllIl[9] = (((126 + 89) - 121) + 99) ^ (((13 + 74) - 23) + 135);
        llllIIIllIl[10] = 116 ^ 56;
        llllIIIllIl[11] = 113 ^ 118;
        llllIIIllIl[12] = (197 ^ 157) ^ (21 ^ 69);
        llllIIIllIl[13] = (63 ^ 113) ^ "   ".length();
        llllIIIllIl[14] = (191 ^ 184) ^ (106 ^ 100);
        llllIIIllIl[15] = (((123 + 87) - 36) + 29) ^ (((94 + 158) - 119) + 60);
        llllIIIllIl[16] = (202 ^ 178) ^ (23 ^ 32);
        llllIIIllIl[17] = 31 ^ 20;
        llllIIIllIl[18] = (33 ^ 100) ^ (125 ^ 52);
    }

    private static boolean lIllIIllllIlIl(int i, int i2) {
        return i < i2;
    }

    public int G() {
        return this.potential;
    }

    private static String lIllIIllllIIII(String llllllllllllllllIIIlllIIlllIlIII, String llllllllllllllllIIIlllIIlllIIlll) {
        try {
            SecretKeySpec llllllllllllllllIIIlllIIlllIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIIlllIIlllIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIIlllIIlllIlIlI = Cipher.getInstance("Blowfish");
            llllllllllllllllIIIlllIIlllIlIlI.init(llllIIIllIl[3], llllllllllllllllIIIlllIIlllIlIll);
            return new String(llllllllllllllllIIIlllIIlllIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllllllIIIlllIIlllIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIIlllIIlllIlIIl) {
            llllllllllllllllIIIlllIIlllIlIIl.printStackTrace();
            return null;
        }
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }

    private static String lIllIIllllIIlI(String llllllllllllllllIIIlllIIllllllIl, String llllllllllllllllIIIlllIIllllllII) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllIIIlllIIllllllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllllIIIlllIIlllllIlI = llllllllllllllllIIIlllIIllllllII.toCharArray();
        int llllllllllllllllIIIlllIIlllllIIl = llllIIIllIl[0];
        char[] charArray = str.toCharArray();
        int llllllllllllllllIIIlllIIllllIIlI = charArray.length;
        int i = llllIIIllIl[0];
        while (lIllIIllllIlIl(i, llllllllllllllllIIIlllIIllllIIlI)) {
            sb.append((char) (charArray[i] ^ llllllllllllllllIIIlllIIlllllIlI[llllllllllllllllIIIlllIIlllllIIl % llllllllllllllllIIIlllIIlllllIlI.length]));
            "".length();
            llllllllllllllllIIIlllIIlllllIIl++;
            i++;
            "".length();
            if ("  ".length() < ((65 ^ 70) & ((81 ^ 86) ^ (-1)))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String lIllIIllllIIIl(String llllllllllllllllIIIlllIlIIIIlIll, String llllllllllllllllIIIlllIlIIIIllII) {
        try {
            SecretKeySpec llllllllllllllllIIIlllIlIIIlIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIIlllIlIIIIllII.getBytes(StandardCharsets.UTF_8)), llllIIIllIl[12]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llllIIIllIl[3], llllllllllllllllIIIlllIlIIIlIIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIIlllIlIIIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIIlllIlIIIIlllI) {
            llllllllllllllllIIIlllIlIIIIlllI.printStackTrace();
            return null;
        }
    }

    static {
        lIllIIllllIlII();
        lIllIIllllIIll();
        CRYPT_RAT = new e(llllIIIllII[llllIIIllIl[0]], llllIIIllIl[0], llllIIIllIl[1], llllIIIllII[llllIIIllIl[2]]);
        BLOODWORM = new e(llllIIIllII[llllIIIllIl[3]], llllIIIllIl[2], llllIIIllIl[4], llllIIIllII[llllIIIllIl[5]]);
        CRYPT_SPIDER = new e(llllIIIllII[llllIIIllIl[6]], llllIIIllIl[3], llllIIIllIl[7], llllIIIllII[llllIIIllIl[8]]);
        GIANT_CRYPT_RAT = new e(llllIIIllII[llllIIIllIl[9]], llllIIIllIl[5], llllIIIllIl[10], llllIIIllII[llllIIIllIl[11]]);
        SKELETON = new e(llllIIIllII[llllIIIllIl[12]], llllIIIllIl[6], llllIIIllIl[13], llllIIIllII[llllIIIllIl[14]]);
        GIANT_CRYPT_SPIDER = new e(llllIIIllII[llllIIIllIl[15]], llllIIIllIl[8], llllIIIllIl[16], llllIIIllII[llllIIIllIl[17]]);
        e[] eVarArr = new e[llllIIIllIl[9]];
        eVarArr[llllIIIllIl[0]] = CRYPT_RAT;
        eVarArr[llllIIIllIl[2]] = BLOODWORM;
        eVarArr[llllIIIllIl[3]] = CRYPT_SPIDER;
        eVarArr[llllIIIllIl[5]] = GIANT_CRYPT_RAT;
        eVarArr[llllIIIllIl[6]] = SKELETON;
        eVarArr[llllIIIllIl[8]] = GIANT_CRYPT_SPIDER;
        $VALUES = eVarArr;
    }

    private static void lIllIIllllIIll() {
        llllIIIllII = new String[llllIIIllIl[18]];
        llllIIIllII[llllIIIllIl[0]] = lIllIIllllIIII("G5J7vZibFLbB6CYE+nmOJg==", "VpagH");
        llllIIIllII[llllIIIllIl[2]] = lIllIIllllIIIl("1LD6G/eKaZPR7UTu5vr6/A==", "iVHIS");
        llllIIIllII[llllIIIllIl[3]] = lIllIIllllIIII("lLrvlIUBMP3rs1STxYFsjg==", "Wmyal");
        llllIIIllII[llllIIIllIl[5]] = lIllIIllllIIII("dTQiF5jSM8AcMhpO0+J3jA==", "KqHSX");
        llllIIIllII[llllIIIllIl[6]] = lIllIIllllIIlI("OxQjCj8nFSoTLz0U", "xFzZk");
        llllIIIllII[llllIIIllIl[8]] = lIllIIllllIIII("171+G61RTlcC8QN7bIs8uA==", "JOAyk");
        llllIIIllII[llllIIIllIl[9]] = lIllIIllllIIlI("NQIANCUtCBMjISYUEzsl", "rKAzq");
        llllIIIllII[llllIIIllIl[11]] = lIllIIllllIIII("etXB6LMDOhGzG6czKIZbrA==", "VQugm");
        llllIIIllII[llllIIIllIl[12]] = lIllIIllllIIlI("PTMIOyQ6NwM=", "nxMwa");
        llllIIIllII[llllIIIllIl[14]] = lIllIIllllIIlI("IyQcOSIEIBc=", "pOyUG");
        llllIIIllII[llllIIIllIl[15]] = lIllIIllllIIlI("ECIzPiEIKCApJQM0ISA8Ey4g", "Wkrpu");
        llllIIIllII[llllIIIllIl[17]] = lIllIIllllIIII("YgdgXDnXe5sVFjBTVWkrcFram3WEUsc+", "jkSTD");
    }
}
