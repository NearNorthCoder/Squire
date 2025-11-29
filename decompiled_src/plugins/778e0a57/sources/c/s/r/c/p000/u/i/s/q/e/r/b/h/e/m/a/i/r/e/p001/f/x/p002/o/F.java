package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.F  reason: invalid package */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/F.class */
public final class F {
    private static final /* synthetic */ F[] $VALUES;
    private final /* synthetic */ int personalItemCapacity;
    public static final /* synthetic */ F LARGE;
    public static final /* synthetic */ F MEDIUM;
    public static final /* synthetic */ F TINY;
    private final /* synthetic */ int raidItemCapacity;
    public static final /* synthetic */ F MASSIVE;
    private static /* synthetic */ String[] lIlIIllllIlI;
    private static /* synthetic */ int[] lIlIIllllIll;
    public static final /* synthetic */ F SMALL;

    private static void llIllIllIllIIl() {
        lIlIIllllIll = new int[16];
        lIlIIllllIll[0] = (0 ^ 55) & ((67 ^ 116) ^ (-1));
        lIlIIllllIll[1] = (((0 + 102) - 89) + 114) ^ (215 ^ 177);
        lIlIIllllIll[2] = " ".length();
        lIlIIllllIll[3] = (102 ^ 41) ^ (39 ^ 118);
        lIlIIllllIll[4] = (((143 ^ 195) + (((104 + 79) - 85) + 36)) - (((53 + 3) - 24) + 97)) + ((0 + 106) - (-29)) + 34;
        lIlIIllllIll[5] = "  ".length();
        lIlIIllllIll[6] = 116 ^ 72;
        lIlIIllllIll[7] = (-6148) & 6647;
        lIlIIllllIll[8] = "   ".length();
        lIlIIllllIll[9] = 246 ^ 172;
        lIlIIllllIll[10] = (-((-949) & 4023)) & (-24577) & 28650;
        lIlIIllllIll[11] = (((132 + 5) - 13) + 12) ^ (((27 + 73) - (-31)) + 9);
        lIlIIllllIll[12] = (94 ^ 55) ^ (49 ^ 32);
        lIlIIllllIll[13] = (-((-20323) & 32611)) & (-515) & 14302;
        lIlIIllllIll[14] = 190 ^ 187;
        lIlIIllllIll[15] = (21 ^ 47) ^ (144 ^ 162);
    }

    private static String llIllIllIlIllI(String lllllllllllllllIllIlIllIllIllIIl, String lllllllllllllllIllIlIllIllIllIII) {
        try {
            SecretKeySpec lllllllllllllllIllIlIllIllIlllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIlIllIllIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIlIllIllIllIll = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIlIllIllIllIll.init(lIlIIllllIll[5], lllllllllllllllIllIlIllIllIlllII);
            return new String(lllllllllllllllIllIlIllIllIllIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIlIllIllIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIlIllIllIllIlI) {
            lllllllllllllllIllIlIllIllIllIlI.printStackTrace();
            return null;
        }
    }

    private F(String str, int i, int i2, int i3) {
        this.personalItemCapacity = i2;
        this.raidItemCapacity = i3;
    }

    private static void llIllIllIllIII() {
        lIlIIllllIlI = new String[lIlIIllllIll[14]];
        lIlIIllllIlI[lIlIIllllIll[0]] = llIllIllIlIlIl("MnwRROPe/cg=", "ecRrI");
        lIlIIllllIlI[lIlIIllllIll[2]] = llIllIllIlIllI("ljT81EKHchY=", "QJNxf");
        lIlIIllllIlI[lIlIIllllIll[5]] = llIllIllIlIlIl("xWZwdvlMHBA=", "LYWHp");
        lIlIIllllIlI[lIlIIllllIll[8]] = llIllIllIlIlll("JzIbCQM=", "ksINF");
        lIlIIllllIlI[lIlIIllllIll[11]] = llIllIllIlIlll("PRgEAjgmHA==", "pYWQq");
    }

    public static F[] values() {
        return (F[]) $VALUES.clone();
    }

    private static String llIllIllIlIlIl(String lllllllllllllllIllIlIllIllIIllII, String lllllllllllllllIllIlIllIllIIlIll) {
        try {
            SecretKeySpec lllllllllllllllIllIlIllIllIIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIlIllIllIIlIll.getBytes(StandardCharsets.UTF_8)), lIlIIllllIll[15]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIIllllIll[5], lllllllllllllllIllIlIllIllIIllll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIlIllIllIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIlIllIllIIllIl) {
            lllllllllllllllIllIlIllIllIIllIl.printStackTrace();
            return null;
        }
    }

    static {
        llIllIllIllIIl();
        llIllIllIllIII();
        TINY = new F(lIlIIllllIlI[lIlIIllllIll[0]], lIlIIllllIll[0], lIlIIllllIll[1]);
        SMALL = new F(lIlIIllllIlI[lIlIIllllIll[2]], lIlIIllllIll[2], lIlIIllllIll[3], lIlIIllllIll[4]);
        MEDIUM = new F(lIlIIllllIlI[lIlIIllllIll[5]], lIlIIllllIll[5], lIlIIllllIll[6], lIlIIllllIll[7]);
        LARGE = new F(lIlIIllllIlI[lIlIIllllIll[8]], lIlIIllllIll[8], lIlIIllllIll[9], lIlIIllllIll[10]);
        MASSIVE = new F(lIlIIllllIlI[lIlIIllllIll[11]], lIlIIllllIll[11], lIlIIllllIll[12], lIlIIllllIll[13]);
        F[] fArr = new F[lIlIIllllIll[14]];
        fArr[lIlIIllllIll[0]] = TINY;
        fArr[lIlIIllllIll[2]] = SMALL;
        fArr[lIlIIllllIll[5]] = MEDIUM;
        fArr[lIlIIllllIll[8]] = LARGE;
        fArr[lIlIIllllIll[11]] = MASSIVE;
        $VALUES = fArr;
    }

    private static String llIllIllIlIlll(String lllllllllllllllIllIlIllIlIllllII, String lllllllllllllllIllIlIllIlIlllIll) {
        String lllllllllllllllIllIlIllIlIllllII2 = new String(Base64.getDecoder().decode(lllllllllllllllIllIlIllIlIllllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIlIllIlIlllIlI = new StringBuilder();
        char[] charArray = lllllllllllllllIllIlIllIlIlllIll.toCharArray();
        int lllllllllllllllIllIlIllIlIlllIII = lIlIIllllIll[0];
        char[] charArray2 = lllllllllllllllIllIlIllIlIllllII2.toCharArray();
        int length = charArray2.length;
        int i = lIlIIllllIll[0];
        while (llIllIllIllIlI(i, length)) {
            char lllllllllllllllIllIlIllIlIllllIl = charArray2[i];
            lllllllllllllllIllIlIllIlIlllIlI.append((char) (lllllllllllllllIllIlIllIlIllllIl ^ charArray[lllllllllllllllIllIlIllIlIlllIII % charArray.length]));
            "".length();
            lllllllllllllllIllIlIllIlIlllIII++;
            i++;
            "".length();
            if ((-"   ".length()) > 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIllIlIllIlIlllIlI);
    }

    public int bM() {
        return this.raidItemCapacity;
    }

    private static boolean llIllIllIllIlI(int i, int i2) {
        return i < i2;
    }

    private F(String str, int i, int i2) {
        this(str, i, i2, lIlIIllllIll[0]);
    }

    public static F valueOf(String str) {
        return (F) Enum.valueOf(F.class, str);
    }

    public int bL() {
        return this.personalItemCapacity;
    }
}
