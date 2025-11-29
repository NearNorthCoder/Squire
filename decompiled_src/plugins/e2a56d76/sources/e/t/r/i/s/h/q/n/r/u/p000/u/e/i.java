package e.t.r.i.s.h.q.n.r.u.p000.u.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.unethicalite.api.coords.RectangularArea;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: e.t.r.i.s.h.q.n.r.u.-.u.e.i  reason: invalid package */
/* loaded from: e2a56d76-bd9d-40c9-839c-e5b25fb4c3a0.jar:e/t/r/i/s/h/q/n/r/u/-/u/e/i.class */
public final class i {
    private static /* synthetic */ String[] llllIIIIIIII;
    private final /* synthetic */ String name;
    private final /* synthetic */ RectangularArea area;
    private static final /* synthetic */ i[] $VALUES;
    public static final /* synthetic */ i MOONLIGHT_ANTELOPE;
    private static /* synthetic */ int[] llllIIIIIIIl;
    public static final /* synthetic */ i SUNLIGHT_ANTELOPE;

    public RectangularArea w() {
        return this.area;
    }

    private static String lIIIlllIIllIlII(String lllllllllllllllIIlIllIlIlIlllIII, String lllllllllllllllIIlIllIlIlIllIlll) {
        String lllllllllllllllIIlIllIlIlIlllIII2 = new String(Base64.getDecoder().decode(lllllllllllllllIIlIllIlIlIlllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIIlIllIlIlIllIlll.toCharArray();
        int lllllllllllllllIIlIllIlIlIllIlII = llllIIIIIIIl[0];
        char[] charArray2 = lllllllllllllllIIlIllIlIlIlllIII2.toCharArray();
        int length = charArray2.length;
        int i = llllIIIIIIIl[0];
        while (lIIIlllIIllIlll(i, length)) {
            char lllllllllllllllIIlIllIlIlIlllIIl = charArray2[i];
            sb.append((char) (lllllllllllllllIIlIllIlIlIlllIIl ^ charArray[lllllllllllllllIIlIllIlIlIllIlII % charArray.length]));
            "".length();
            lllllllllllllllIIlIllIlIlIllIlII++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void lIIIlllIIllIlIl() {
        llllIIIIIIII = new String[llllIIIIIIIl[12]];
        llllIIIIIIII[llllIIIIIIIl[0]] = lIIIlllIIllIIlI("yR9d7hBYjL4tkvxn1XWBXwjG5fX/rhK9", "ECVdh");
        llllIIIIIIII[llllIIIIIIIl[1]] = lIIIlllIIllIIll("uYnOYtsgZC90x6uhjFWiFfqUjm+vwDEf", "HDdlW");
        llllIIIIIIII[llllIIIIIIIl[6]] = lIIIlllIIllIIll("BuIGmmBAWD5rMJGDGQmNoTttifT6HC4J", "bxgdl");
        llllIIIIIIII[llllIIIIIIIl[7]] = lIIIlllIIllIlII("GhoiHw0+EiUFQTYbORQNOAUo", "WuMqa");
    }

    private static String lIIIlllIIllIIll(String lllllllllllllllIIlIllIlIlIIlIllI, String lllllllllllllllIIlIllIlIlIIlIlIl) {
        try {
            SecretKeySpec lllllllllllllllIIlIllIlIlIIllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIlIlIIlIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIllIlIlIIllIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIllIlIlIIllIII.init(llllIIIIIIIl[6], lllllllllllllllIIlIllIlIlIIllIIl);
            return new String(lllllllllllllllIIlIllIlIlIIllIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIlIlIIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIllIlIlIIlIlll) {
            lllllllllllllllIIlIllIlIlIIlIlll.printStackTrace();
            return null;
        }
    }

    private i(String str, int i, String str2, RectangularArea rectangularArea) {
        this.name = str2;
        this.area = rectangularArea;
    }

    private static void lIIIlllIIllIllI() {
        llllIIIIIIIl = new int[14];
        llllIIIIIIIl[0] = ((186 ^ 171) ^ (186 ^ 162)) & (((((64 + 83) - 133) + 118) ^ (((23 + 86) - 43) + 75)) ^ (-" ".length()));
        llllIIIIIIIl[1] = " ".length();
        llllIIIIIIIl[2] = (-((-24767) & 28863)) & (-26882) & 32719;
        llllIIIIIIIl[3] = (-"   ".length()) & (-12353) & 15359;
        llllIIIIIIIl[4] = (-24609) & 26367;
        llllIIIIIIIl[5] = (-((-10762) & 28223)) & (-3) & 20479;
        llllIIIIIIIl[6] = "  ".length();
        llllIIIIIIIl[7] = "   ".length();
        llllIIIIIIIl[8] = (-((-310) & 8639)) & (-4197) & 14079;
        llllIIIIIIIl[9] = (-785) & 10198;
        llllIIIIIIIl[10] = (-(((117 + 35) - 115) + 93)) & (-16481) & 18175;
        llllIIIIIIIl[11] = (-((-13398) & 30079)) & (-519) & 26623;
        llllIIIIIIIl[12] = (187 ^ 147) ^ (147 ^ 191);
        llllIIIIIIIl[13] = 93 ^ 85;
    }

    private static String lIIIlllIIllIIlI(String lllllllllllllllIIlIllIlIlIlIIIll, String lllllllllllllllIIlIllIlIlIlIIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIlIlIlIIIlI.getBytes(StandardCharsets.UTF_8)), llllIIIIIIIl[13]), "DES");
            Cipher lllllllllllllllIIlIllIlIlIlIIlIl = Cipher.getInstance("DES");
            lllllllllllllllIIlIllIlIlIlIIlIl.init(llllIIIIIIIl[6], secretKeySpec);
            return new String(lllllllllllllllIIlIllIlIlIlIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIlIlIlIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIllIlIlIlIIlII) {
            lllllllllllllllIIlIllIlIlIlIIlII.printStackTrace();
            return null;
        }
    }

    static {
        lIIIlllIIllIllI();
        lIIIlllIIllIlIl();
        SUNLIGHT_ANTELOPE = new i(llllIIIIIIII[llllIIIIIIIl[0]], llllIIIIIIIl[0], llllIIIIIIII[llllIIIIIIIl[1]], new RectangularArea(llllIIIIIIIl[2], llllIIIIIIIl[3], llllIIIIIIIl[4], llllIIIIIIIl[5]));
        MOONLIGHT_ANTELOPE = new i(llllIIIIIIII[llllIIIIIIIl[6]], llllIIIIIIIl[1], llllIIIIIIII[llllIIIIIIIl[7]], new RectangularArea(llllIIIIIIIl[8], llllIIIIIIIl[9], llllIIIIIIIl[10], llllIIIIIIIl[11]));
        i[] iVarArr = new i[llllIIIIIIIl[6]];
        iVarArr[llllIIIIIIIl[0]] = SUNLIGHT_ANTELOPE;
        iVarArr[llllIIIIIIIl[1]] = MOONLIGHT_ANTELOPE;
        $VALUES = iVarArr;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public String v() {
        return this.name;
    }

    private static boolean lIIIlllIIllIlll(int i, int i2) {
        return i < i2;
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }
}
