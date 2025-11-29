package p000.m.e.a.u.s.r.r.q.i.r.e.f;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: -.m.e.a.u.s.r.r.q.i.r.e.f.ap  reason: invalid package and case insensitive filesystem */
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:-/m/e/a/u/s/r/r/q/i/r/e/f/ap.class */
public final class EnumC0016ap implements InterfaceC0023aw {
    public static final /* synthetic */ EnumC0016ap STRAWBERRIES;
    public static final /* synthetic */ EnumC0016ap ONIONS;
    private final /* synthetic */ EnumC0022av produceSeed;
    public static final /* synthetic */ EnumC0016ap SWEETCORN;
    public static final /* synthetic */ EnumC0016ap SNAPE_GRASS;
    private static /* synthetic */ int[] llIIIlIIIIII;
    public static final /* synthetic */ EnumC0016ap WATERMELON;
    public static final /* synthetic */ EnumC0016ap NOTHING;
    public static final /* synthetic */ EnumC0016ap DEFAULT;
    private static final /* synthetic */ EnumC0016ap[] $VALUES;
    private static /* synthetic */ String[] llIIIIllllIl;

    @Override // p000.m.e.a.u.s.r.r.q.i.r.e.f.InterfaceC0023aw
    public EnumC0022av bf() {
        return this.produceSeed;
    }

    public static EnumC0016ap valueOf(String str) {
        return (EnumC0016ap) Enum.valueOf(EnumC0016ap.class, str);
    }

    private static String llllIIllIlllll(String lllllllllllllllIlIlIlIIllIlIIIlI, String lllllllllllllllIlIlIlIIllIlIIIIl) {
        String lllllllllllllllIlIlIlIIllIlIIIlI2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIlIIllIlIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIlIlIlIIllIlIIIIl.toCharArray();
        int lllllllllllllllIlIlIlIIllIIllllI = llIIIlIIIIII[0];
        char[] charArray2 = lllllllllllllllIlIlIlIIllIlIIIlI2.toCharArray();
        int length = charArray2.length;
        int i = llIIIlIIIIII[0];
        while (llllIIlllIlIll(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[lllllllllllllllIlIlIlIIllIIllllI % charArray.length]));
            "".length();
            lllllllllllllllIlIlIlIIllIIllllI++;
            i++;
            "".length();
            if ((-(168 ^ 173)) >= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String llllIIlllIIIII(String lllllllllllllllIlIlIlIIllIllIIlI, String lllllllllllllllIlIlIlIIllIllIIIl) {
        try {
            SecretKeySpec lllllllllllllllIlIlIlIIllIllIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIlIIllIllIIIl.getBytes(StandardCharsets.UTF_8)), llIIIlIIIIII[8]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIIlIIIIII[2], lllllllllllllllIlIlIlIIllIllIlIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIlIIllIllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlIlIIllIllIIll) {
            lllllllllllllllIlIlIlIIllIllIIll.printStackTrace();
            return null;
        }
    }

    private static void llllIIlllIIllI() {
        llIIIIllllIl = new String[llIIIlIIIIII[7]];
        llIIIIllllIl[llIIIlIIIIII[0]] = llllIIllIlllll("NC0CGDg0JQ==", "zbVPq");
        llIIIIllllIl[llIIIlIIIIII[1]] = llllIIlllIIIII("V7WnFbWXno8=", "vVDIK");
        llIIIIllllIl[llIIIlIIIIII[2]] = llllIIlllIIIIl("YJrX0ISn1NkinNyOtGu2jA==", "eMPdH");
        llIIIIllllIl[llIIIlIIIIII[3]] = llllIIlllIIIII("A+0DUjD2vvTlrB9uTmR42A==", "ChpMi");
        llIIIIllllIl[llIIIlIIIIII[4]] = llllIIlllIIIII("4PwZl08I2lY=", "CjmLW");
        llIIIIllllIl[llIIIlIIIIII[5]] = llllIIllIlllll("BQEyIDYVGSUr", "VVweb");
        llIIIIllllIl[llIIIlIIIIII[6]] = llllIIllIlllll("AjQgNBUOPTMlAwI=", "QzadP");
    }

    public static EnumC0016ap[] values() {
        return (EnumC0016ap[]) $VALUES.clone();
    }

    private static String llllIIlllIIIIl(String lllllllllllllllIlIlIlIIllIllllll, String lllllllllllllllIlIlIlIIllIlllllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIlIIllIlllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIlIlIIlllIIIIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlIlIIlllIIIIIl.init(llIIIlIIIIII[2], secretKeySpec);
            return new String(lllllllllllllllIlIlIlIIlllIIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIlIIllIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlIlIIlllIIIIII) {
            lllllllllllllllIlIlIlIIlllIIIIII.printStackTrace();
            return null;
        }
    }

    private static void llllIIlllIlIlI() {
        llIIIlIIIIII = new int[9];
        llIIIlIIIIII[0] = (70 ^ 81) & ((18 ^ 5) ^ (-1));
        llIIIlIIIIII[1] = " ".length();
        llIIIlIIIIII[2] = "  ".length();
        llIIIlIIIIII[3] = "   ".length();
        llIIIlIIIIII[4] = 190 ^ 186;
        llIIIlIIIIII[5] = 126 ^ 123;
        llIIIlIIIIII[6] = 186 ^ 188;
        llIIIlIIIIII[7] = (5 ^ 93) ^ (77 ^ 18);
        llIIIlIIIIII[8] = (141 ^ 167) ^ (180 ^ 150);
    }

    static {
        llllIIlllIlIlI();
        llllIIlllIIllI();
        NOTHING = new EnumC0016ap(llIIIIllllIl[llIIIlIIIIII[0]], llIIIlIIIIII[0], null);
        DEFAULT = new EnumC0016ap(llIIIIllllIl[llIIIlIIIIII[1]], llIIIlIIIIII[1], EnumC0022av.DEFAULT);
        WATERMELON = new EnumC0016ap(llIIIIllllIl[llIIIlIIIIII[2]], llIIIlIIIIII[2], EnumC0022av.WATERMELON);
        STRAWBERRIES = new EnumC0016ap(llIIIIllllIl[llIIIlIIIIII[3]], llIIIlIIIIII[3], EnumC0022av.STRAWEBERRIES);
        ONIONS = new EnumC0016ap(llIIIIllllIl[llIIIlIIIIII[4]], llIIIlIIIIII[4], EnumC0022av.ONIONS);
        SWEETCORN = new EnumC0016ap(llIIIIllllIl[llIIIlIIIIII[5]], llIIIlIIIIII[5], EnumC0022av.SWEETCORN);
        SNAPE_GRASS = new EnumC0016ap(llIIIIllllIl[llIIIlIIIIII[6]], llIIIlIIIIII[6], EnumC0022av.SNAPE_GRASS);
        EnumC0016ap[] enumC0016apArr = new EnumC0016ap[llIIIlIIIIII[7]];
        enumC0016apArr[llIIIlIIIIII[0]] = NOTHING;
        enumC0016apArr[llIIIlIIIIII[1]] = DEFAULT;
        enumC0016apArr[llIIIlIIIIII[2]] = WATERMELON;
        enumC0016apArr[llIIIlIIIIII[3]] = STRAWBERRIES;
        enumC0016apArr[llIIIlIIIIII[4]] = ONIONS;
        enumC0016apArr[llIIIlIIIIII[5]] = SWEETCORN;
        enumC0016apArr[llIIIlIIIIII[6]] = SNAPE_GRASS;
        $VALUES = enumC0016apArr;
    }

    private static boolean llllIIlllIlIll(int i, int i2) {
        return i < i2;
    }

    private EnumC0016ap(String str, int i, EnumC0022av enumC0022av) {
        this.produceSeed = enumC0022av;
    }
}
