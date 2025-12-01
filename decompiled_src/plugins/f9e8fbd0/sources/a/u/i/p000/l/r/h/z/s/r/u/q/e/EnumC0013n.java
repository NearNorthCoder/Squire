package a.u.i.p000.l.r.h.z.s.r.u.q.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: a.u.i.-.l.r.h.z.s.r.u.q.e.n  reason: invalid package and case insensitive filesystem */
/* loaded from: f9e8fbd0-4571-4716-b37b-883b4ae7fc62.jar:a/u/i/-/l/r/h/z/s/r/u/q/e/n.class */
public final class EnumC0013n {
    private static /* synthetic */ int[] lIllIlIlIIIll;
    public static final /* synthetic */ EnumC0013n EAST;
    public static final /* synthetic */ EnumC0013n NORTH_WEST;
    private final /* synthetic */ int x;
    public static final /* synthetic */ EnumC0013n WEST;
    public static final /* synthetic */ EnumC0013n CENTER_WEST;
    private final /* synthetic */ int y;
    public static final /* synthetic */ EnumC0013n NORTH_EAST;
    public static final /* synthetic */ EnumC0013n CENTER;
    private static /* synthetic */ String[] lIllIlIlIIIlI;
    private static final /* synthetic */ EnumC0013n[] $VALUES;
    public static final /* synthetic */ EnumC0013n CENTER_EAST;

    public static EnumC0013n[] values() {
        return (EnumC0013n[]) $VALUES.clone();
    }

    private static void llIIIllllllIlIl() {
        lIllIlIlIIIll = new int[12];
        lIllIlIlIIIll[0] = (191 ^ 139) & ((94 ^ 106) ^ (-1));
        lIllIlIlIIIll[1] = (51 ^ 40) ^ (145 ^ 140);
        lIllIlIlIIIll[2] = (41 ^ 49) ^ (208 ^ 193);
        lIllIlIlIIIll[3] = " ".length();
        lIllIlIlIIIll[4] = -((27 ^ 114) ^ (61 ^ 80));
        lIllIlIlIIIll[5] = 100 ^ 110;
        lIllIlIlIIIll[6] = "  ".length();
        lIllIlIlIIIll[7] = (7 ^ 100) ^ (193 ^ 166);
        lIllIlIlIIIll[8] = "   ".length();
        lIllIlIlIIIll[9] = 73 ^ 76;
        lIllIlIlIIIll[10] = 93 ^ 90;
        lIllIlIlIIIll[11] = 128 ^ 136;
    }

    public static EnumC0013n valueOf(String str) {
        return (EnumC0013n) Enum.valueOf(EnumC0013n.class, str);
    }

    private static String llIIIllllllIIlI(String llllllllllllllIllIIIlllIIlIIIlll, String llllllllllllllIllIIIlllIIlIIIlII) {
        try {
            SecretKeySpec llllllllllllllIllIIIlllIIlIIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIlllIIlIIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllIlIlIIIll[6], llllllllllllllIllIIIlllIIlIIlIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIlllIIlIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIIlllIIlIIlIII) {
            llllllllllllllIllIIIlllIIlIIlIII.printStackTrace();
            return null;
        }
    }

    static {
        llIIIllllllIlIl();
        llIIIllllllIlII();
        NORTH_EAST = new EnumC0013n(lIllIlIlIIIlI[lIllIlIlIIIll[0]], lIllIlIlIIIll[0], lIllIlIlIIIll[1], lIllIlIlIIIll[2]);
        NORTH_WEST = new EnumC0013n(lIllIlIlIIIlI[lIllIlIlIIIll[3]], lIllIlIlIIIll[3], lIllIlIlIIIll[4], lIllIlIlIIIll[5]);
        WEST = new EnumC0013n(lIllIlIlIIIlI[lIllIlIlIIIll[6]], lIllIlIlIIIll[6], lIllIlIlIIIll[4], lIllIlIlIIIll[7]);
        EAST = new EnumC0013n(lIllIlIlIIIlI[lIllIlIlIIIll[8]], lIllIlIlIIIll[8], lIllIlIlIIIll[7], lIllIlIlIIIll[7]);
        CENTER_WEST = new EnumC0013n(lIllIlIlIIIlI[lIllIlIlIIIll[7]], lIllIlIlIIIll[7], lIllIlIlIIIll[4], lIllIlIlIIIll[3]);
        CENTER_EAST = new EnumC0013n(lIllIlIlIIIlI[lIllIlIlIIIll[9]], lIllIlIlIIIll[9], lIllIlIlIIIll[7], lIllIlIlIIIll[3]);
        CENTER = new EnumC0013n(lIllIlIlIIIlI[lIllIlIlIIIll[1]], lIllIlIlIIIll[1], lIllIlIlIIIll[0], lIllIlIlIIIll[0]);
        EnumC0013n[] enumC0013nArr = new EnumC0013n[lIllIlIlIIIll[10]];
        enumC0013nArr[lIllIlIlIIIll[0]] = NORTH_EAST;
        enumC0013nArr[lIllIlIlIIIll[3]] = NORTH_WEST;
        enumC0013nArr[lIllIlIlIIIll[6]] = WEST;
        enumC0013nArr[lIllIlIlIIIll[8]] = EAST;
        enumC0013nArr[lIllIlIlIIIll[7]] = CENTER_WEST;
        enumC0013nArr[lIllIlIlIIIll[9]] = CENTER_EAST;
        enumC0013nArr[lIllIlIlIIIll[1]] = CENTER;
        $VALUES = enumC0013nArr;
    }

    public int H() {
        return this.y;
    }

    private static String llIIIllllllIIIl(String llllllllllllllIllIIIlllIIlIlIlII, String llllllllllllllIllIIIlllIIlIlIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIlllIIlIlIIll.getBytes(StandardCharsets.UTF_8)), lIllIlIlIIIll[11]), "DES");
            Cipher llllllllllllllIllIIIlllIIlIlIllI = Cipher.getInstance("DES");
            llllllllllllllIllIIIlllIIlIlIllI.init(lIllIlIlIIIll[6], secretKeySpec);
            return new String(llllllllllllllIllIIIlllIIlIlIllI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIlllIIlIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIIlllIIlIlIlIl) {
            llllllllllllllIllIIIlllIIlIlIlIl.printStackTrace();
            return null;
        }
    }

    private static String llIIIllllllIIll(String llllllllllllllIllIIIlllIIIllIlll, String llllllllllllllIllIIIlllIIIllIllI) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllIIIlllIIIllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIllIIIlllIIIllIllI.toCharArray();
        int llllllllllllllIllIIIlllIIIllIIll = lIllIlIlIIIll[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIllIlIlIIIll[0];
        while (llIIIllllllIllI(i, length)) {
            char llllllllllllllIllIIIlllIIIlllIII = charArray2[i];
            sb.append((char) (llllllllllllllIllIIIlllIIIlllIII ^ charArray[llllllllllllllIllIIIlllIIIllIIll % charArray.length]));
            "".length();
            llllllllllllllIllIIIlllIIIllIIll++;
            i++;
            "".length();
            if ((-"   ".length()) >= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private EnumC0013n(String str, int i, int i2, int i3) {
        this.x = i2;
        this.y = i3;
    }

    public int G() {
        return this.x;
    }

    private static void llIIIllllllIlII() {
        lIllIlIlIIIlI = new String[lIllIlIlIIIll[10]];
        lIllIlIlIIIlI[lIllIlIlIIIll[0]] = llIIIllllllIIIl("ECzXfNYFva5sx6PPzGOO5g==", "hEcuD");
        lIllIlIlIIIlI[lIllIlIlIIIll[3]] = llIIIllllllIIlI("33iIaooaT/kT0kenNfd87A==", "rsHkX");
        lIllIlIlIIIlI[lIllIlIlIIIll[6]] = llIIIllllllIIlI("vob94k5l3ao=", "mqGRB");
        lIllIlIlIIIlI[lIllIlIlIIIll[8]] = llIIIllllllIIll("BBUXNw==", "ATDcM");
        lIllIlIlIIIlI[lIllIlIlIIIll[7]] = llIIIllllllIIll("NQI9PwkkGCQuHyI=", "vGskL");
        lIllIlIlIIIlI[lIllIlIlIIIll[9]] = llIIIllllllIIll("Ki8GFh87NQ0DCT0=", "ijHBZ");
        lIllIlIlIIIlI[lIllIlIlIIIll[1]] = llIIIllllllIIll("DiIlMSkf", "Mgkel");
    }

    private static boolean llIIIllllllIllI(int i, int i2) {
        return i < i2;
    }
}
