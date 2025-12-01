package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.w  reason: invalid package and case insensitive filesystem */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/w.class */
public final class EnumC0074w {
    private static final /* synthetic */ EnumC0074w[] $VALUES;
    private static /* synthetic */ int[] lIllIlIlIll;
    public static final /* synthetic */ EnumC0074w EAGLE_EYE;
    private static /* synthetic */ String[] lIllIlIlIlI;
    public static final /* synthetic */ EnumC0074w RIGOUR;
    private final /* synthetic */ Prayer mapped;

    private static void lIIlIlllIlIIII() {
        lIllIlIlIll = new int[4];
        lIllIlIlIll[0] = ((22 ^ 50) ^ "  ".length()) & (((192 ^ 144) ^ (41 ^ 95)) ^ (-" ".length()));
        lIllIlIlIll[1] = " ".length();
        lIllIlIlIll[2] = "  ".length();
        lIllIlIlIll[3] = 172 ^ 164;
    }

    private EnumC0074w(String str, int i, Prayer prayer) {
        this.mapped = prayer;
    }

    private static String lIIlIlllIIlllI(String llllllllllllllllIlIlIIIllIIIIIII, String llllllllllllllllIlIlIIIlIlllllll) {
        String llllllllllllllllIlIlIIIllIIIIIII2 = new String(Base64.getDecoder().decode(llllllllllllllllIlIlIIIllIIIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllllIlIlIIIlIlllllll.toCharArray();
        int llllllllllllllllIlIlIIIlIlllIlll = lIllIlIlIll[0];
        char[] charArray2 = llllllllllllllllIlIlIIIllIIIIIII2.toCharArray();
        int length = charArray2.length;
        int i = lIllIlIlIll[0];
        while (lIIlIlllIlIIIl(i, length)) {
            char llllllllllllllllIlIlIIIllIIIIIIl = charArray2[i];
            sb.append((char) (llllllllllllllllIlIlIIIllIIIIIIl ^ charArray[llllllllllllllllIlIlIIIlIlllIlll % charArray.length]));
            "".length();
            llllllllllllllllIlIlIIIlIlllIlll++;
            i++;
            "".length();
            if (((65 ^ 23) ^ (31 ^ 77)) == (((38 ^ 117) ^ (117 ^ 112)) & (((140 ^ 194) ^ (96 ^ 120)) ^ (-" ".length())))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    public Prayer ag() {
        return this.mapped;
    }

    public static EnumC0074w[] values() {
        return (EnumC0074w[]) $VALUES.clone();
    }

    static {
        lIIlIlllIlIIII();
        lIIlIlllIIllll();
        RIGOUR = new EnumC0074w(lIllIlIlIlI[lIllIlIlIll[0]], lIllIlIlIll[0], Prayer.RIGOUR);
        EAGLE_EYE = new EnumC0074w(lIllIlIlIlI[lIllIlIlIll[1]], lIllIlIlIll[1], Prayer.EAGLE_EYE);
        EnumC0074w[] enumC0074wArr = new EnumC0074w[lIllIlIlIll[2]];
        enumC0074wArr[lIllIlIlIll[0]] = RIGOUR;
        enumC0074wArr[lIllIlIlIll[1]] = EAGLE_EYE;
        $VALUES = enumC0074wArr;
    }

    private static String lIIlIlllIIllIl(String llllllllllllllllIlIlIIIlIllIlIll, String llllllllllllllllIlIlIIIlIllIlIlI) {
        try {
            SecretKeySpec llllllllllllllllIlIlIIIlIllIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlIIIlIllIlIlI.getBytes(StandardCharsets.UTF_8)), lIllIlIlIll[3]), "DES");
            Cipher llllllllllllllllIlIlIIIlIllIllIl = Cipher.getInstance("DES");
            llllllllllllllllIlIlIIIlIllIllIl.init(lIllIlIlIll[2], llllllllllllllllIlIlIIIlIllIlllI);
            return new String(llllllllllllllllIlIlIIIlIllIllIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlIIIlIllIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIlIIIlIllIllII) {
            llllllllllllllllIlIlIIIlIllIllII.printStackTrace();
            return null;
        }
    }

    private static void lIIlIlllIIllll() {
        lIllIlIlIlI = new String[lIllIlIlIll[2]];
        lIllIlIlIlI[lIllIlIlIll[0]] = lIIlIlllIIllIl("ZkORJ/0KbCY=", "hfakc");
        lIllIlIlIlI[lIllIlIlIll[1]] = lIIlIlllIIlllI("KzMxAAcxNy8J", "nrvLB");
    }

    public static EnumC0074w valueOf(String str) {
        return (EnumC0074w) Enum.valueOf(EnumC0074w.class, str);
    }

    private static boolean lIIlIlllIlIIIl(int i, int i2) {
        return i < i2;
    }
}
