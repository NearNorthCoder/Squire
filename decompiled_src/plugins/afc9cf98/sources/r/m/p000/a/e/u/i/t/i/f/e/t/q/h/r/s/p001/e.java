package r.m.p000.a.e.u.i.t.i.f.e.t.q.h.r.s.p001;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.client.plugins.tithefarm.TitheFarmPlantType;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.e  reason: invalid package */
/* loaded from: afc9cf98-0627-4d2a-8a9e-4e9657a2fb2d.jar:r/m/-/a/e/u/i/t/i/f/e/t/q/h/r/s/-/e.class */
public final class e {
    private static /* synthetic */ String[] lIIlllllIlIll;
    private static /* synthetic */ int[] lIIlllllIllIl;
    public static final /* synthetic */ e WATERED;
    public static final /* synthetic */ e UNWATERED;
    public static final /* synthetic */ e DEAD;
    public static final /* synthetic */ e GROWN;
    private static final /* synthetic */ e[] $VALUES;

    private static boolean lIllIlIlllllIIl(int i, int i2) {
        return i < i2;
    }

    static {
        lIllIlIllllIllI();
        lIllIlIllllIIlI();
        UNWATERED = new e(lIIlllllIlIll[lIIlllllIllIl[1]], lIIlllllIllIl[1]);
        WATERED = new e(lIIlllllIlIll[lIIlllllIllIl[2]], lIIlllllIllIl[2]);
        DEAD = new e(lIIlllllIlIll[lIIlllllIllIl[3]], lIIlllllIllIl[3]);
        GROWN = new e(lIIlllllIlIll[lIIlllllIllIl[0]], lIIlllllIllIl[0]);
        e[] eVarArr = new e[lIIlllllIllIl[4]];
        eVarArr[lIIlllllIllIl[1]] = UNWATERED;
        eVarArr[lIIlllllIllIl[2]] = WATERED;
        eVarArr[lIIlllllIllIl[3]] = DEAD;
        eVarArr[lIIlllllIllIl[0]] = GROWN;
        $VALUES = eVarArr;
    }

    private static String lIllIlIllllIIIl(String llllllllllllllIlllIIllIIIlIlIlll, String llllllllllllllIlllIIllIIIlIlIllI) {
        String llllllllllllllIlllIIllIIIlIlIlll2 = new String(Base64.getDecoder().decode(llllllllllllllIlllIIllIIIlIlIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIlllIIllIIIlIlIllI.toCharArray();
        int llllllllllllllIlllIIllIIIlIlIIll = lIIlllllIllIl[1];
        char[] charArray2 = llllllllllllllIlllIIllIIIlIlIlll2.toCharArray();
        int length = charArray2.length;
        int llllllllllllllIlllIIllIIIlIIlIll = lIIlllllIllIl[1];
        while (lIllIlIlllllIIl(llllllllllllllIlllIIllIIIlIIlIll, length)) {
            sb.append((char) (charArray2[llllllllllllllIlllIIllIIIlIIlIll] ^ charArray[llllllllllllllIlllIIllIIIlIlIIll % charArray.length]));
            "".length();
            llllllllllllllIlllIIllIIIlIlIIll++;
            llllllllllllllIlllIIllIIIlIIlIll++;
            "".length();
            if (" ".length() >= "   ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void lIllIlIllllIllI() {
        lIIlllllIllIl = new int[6];
        lIIlllllIllIl[0] = "   ".length();
        lIIlllllIllIl[1] = (114 ^ 17) & ((92 ^ 63) ^ (-1));
        lIIlllllIllIl[2] = " ".length();
        lIIlllllIllIl[3] = "  ".length();
        lIIlllllIllIl[4] = 117 ^ 113;
        lIIlllllIllIl[5] = 75 ^ 67;
    }

    private static String lIllIlIllllIIII(String llllllllllllllIlllIIllIIIllIIlll, String llllllllllllllIlllIIllIIIllIIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIllIIIllIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIlllllIllIl[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIllIIIllIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIllIIIllIlIII) {
            llllllllllllllIlllIIllIIIllIlIII.printStackTrace();
            return null;
        }
    }

    public static e c(int i) {
        TitheFarmPlantType plantType = TitheFarmPlantType.getPlantType(i);
        if (lIllIlIllllIlll(plantType)) {
            return null;
        }
        int baseId = plantType.getBaseId();
        if (lIllIlIlllllIII(i, baseId)) {
            return GROWN;
        }
        switch ((baseId - i) % lIIlllllIllIl[0]) {
            case 0:
                return UNWATERED;
            case 2:
                return WATERED;
            default:
                return DEAD;
        }
    }

    private static boolean lIllIlIllllIlll(Object obj) {
        return obj == null;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }

    private static boolean lIllIlIlllllIII(int i, int i2) {
        return i == i2;
    }

    private e(String str, int i) {
    }

    private static String lIllIlIlllIllll(String llllllllllllllIlllIIllIIIlllIlII, String llllllllllllllIlllIIllIIIlllIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIllIIIlllIIll.getBytes(StandardCharsets.UTF_8)), lIIlllllIllIl[5]), "DES");
            Cipher llllllllllllllIlllIIllIIIlllIllI = Cipher.getInstance("DES");
            llllllllllllllIlllIIllIIIlllIllI.init(lIIlllllIllIl[3], secretKeySpec);
            return new String(llllllllllllllIlllIIllIIIlllIllI.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIllIIIlllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIllIIIlllIlIl) {
            llllllllllllllIlllIIllIIIlllIlIl.printStackTrace();
            return null;
        }
    }

    private static void lIllIlIllllIIlI() {
        lIIlllllIlIll = new String[lIIlllllIllIl[4]];
        lIIlllllIlIll[lIIlllllIllIl[1]] = lIllIlIlllIllll("55eep01T3fvw8iy9b7Uj6Q==", "yiqXs");
        lIIlllllIlIll[lIIlllllIllIl[2]] = lIllIlIllllIIII("ptMNkNqDJgk=", "JRfyR");
        lIIlllllIlIll[lIIlllllIllIl[3]] = lIllIlIllllIIIl("HgMDBQ==", "ZFBAw");
        lIIlllllIlIll[lIIlllllIllIl[0]] = lIllIlIllllIIIl("CxAOPjQ=", "LBAiz");
    }
}
