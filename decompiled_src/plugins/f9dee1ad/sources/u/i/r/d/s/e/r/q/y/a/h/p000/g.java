package u.i.r.d.s.e.r.q.y.a.h.p000;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: u.i.r.d.s.e.r.q.y.a.h.-.g  reason: invalid package */
/* loaded from: f9dee1ad-dcbf-4af9-9fb8-47dc91e2d43e.jar:u/i/r/d/s/e/r/q/y/a/h/-/g.class */
public final class g {
    private static final /* synthetic */ g[] $VALUES;
    public static final /* synthetic */ g RIGOUR;
    public static final /* synthetic */ g AUGURY;
    public static final /* synthetic */ g EAGLE_EYE;
    public static final /* synthetic */ g PIETY;
    private static /* synthetic */ int[] llllIlIIIIll;
    private final /* synthetic */ Prayer clientType;
    public static final /* synthetic */ g NONE;
    public static final /* synthetic */ g CHIVALRY;
    private static /* synthetic */ String[] llllIlIIIIlI;
    public static final /* synthetic */ g MYSTIC_MIGHT;

    private static String lIIlIIIIIlllIII(String lllllllllllllllIIlIlIIllIIlIlIll, String lllllllllllllllIIlIlIIllIIlIlIlI) {
        try {
            SecretKeySpec lllllllllllllllIIlIlIIllIIlIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIIllIIlIlIlI.getBytes(StandardCharsets.UTF_8)), llllIlIIIIll[8]), "DES");
            Cipher lllllllllllllllIIlIlIIllIIlIllIl = Cipher.getInstance("DES");
            lllllllllllllllIIlIlIIllIIlIllIl.init(llllIlIIIIll[2], lllllllllllllllIIlIlIIllIIlIlllI);
            return new String(lllllllllllllllIIlIlIIllIIlIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIIllIIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIlIIllIIlIllII) {
            lllllllllllllllIIlIlIIllIIlIllII.printStackTrace();
            return null;
        }
    }

    public String y() {
        String str = super.toString();
        return str.charAt(llllIlIIIIll[0]) + str.substring(llllIlIIIIll[1]).replaceAll(llllIlIIIIlI[llllIlIIIIll[0]], llllIlIIIIlI[llllIlIIIIll[1]]).toLowerCase();
    }

    public Prayer z() {
        return this.clientType;
    }

    private static String lIIlIIIIIllIllI(String lllllllllllllllIIlIlIIllIIlllIII, String lllllllllllllllIIlIlIIllIIllIlll) {
        try {
            SecretKeySpec lllllllllllllllIIlIlIIllIIlllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIIllIIllIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIlIIllIIlllIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIlIIllIIlllIlI.init(llllIlIIIIll[2], lllllllllllllllIIlIlIIllIIlllIll);
            return new String(lllllllllllllllIIlIlIIllIIlllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIIllIIlllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIlIIllIIlllIIl) {
            lllllllllllllllIIlIlIIllIIlllIIl.printStackTrace();
            return null;
        }
    }

    private g(String str, int i, Prayer prayer) {
        this.clientType = prayer;
    }

    private static void lIIlIIIIIlllIIl() {
        llllIlIIIIlI = new String[llllIlIIIIll[9]];
        llllIlIIIIlI[llllIlIIIIll[0]] = lIIlIIIIIllIllI("z97tBdBr4Rc=", "vpXzC");
        llllIlIIIIlI[llllIlIIIIll[1]] = lIIlIIIIIllIllI("cjq1CKISQYU=", "ahtFa");
        llllIlIIIIlI[llllIlIIIIll[2]] = lIIlIIIIIllIlll("Cg8vMx8S", "KZhfM");
        llllIlIIIIlI[llllIlIIIIll[3]] = lIIlIIIIIllIllI("hLnjlfhFat1GbO6vq/Wh9g==", "cvDcw");
        llllIlIIIIlI[llllIlIIIIll[4]] = lIIlIIIIIlllIII("XrFJUJ9ENSc=", "kRshZ");
        llllIlIIIIlI[llllIlIIIIll[5]] = lIIlIIIIIllIlll("DxECLxAVFRwm", "JPEcU");
        llllIlIIIIlI[llllIlIIIIll[6]] = lIIlIIIIIllIllI("Cl91Pe6zcRc=", "mHtLs");
        llllIlIIIIlI[llllIlIIIIll[7]] = lIIlIIIIIlllIII("aTyR7aL5abBx7Zt9vieNeA==", "SXZGq");
        llllIlIIIIlI[llllIlIIIIll[8]] = lIIlIIIIIlllIII("330u0V+Cp6s=", "vkRVI");
    }

    private static void lIIlIIIIIlllIlI() {
        llllIlIIIIll = new int[10];
        llllIlIIIIll[0] = ((((67 + 187) - 139) + 79) ^ (((76 + 113) - 162) + 108)) & (((130 ^ 164) ^ (52 ^ 87)) ^ (-" ".length()));
        llllIlIIIIll[1] = " ".length();
        llllIlIIIIll[2] = "  ".length();
        llllIlIIIIll[3] = "   ".length();
        llllIlIIIIll[4] = 25 ^ 29;
        llllIlIIIIll[5] = (((145 + 26) - 94) + 105) ^ (((112 + 7) - 27) + 87);
        llllIlIIIIll[6] = 83 ^ 85;
        llllIlIIIIll[7] = 137 ^ 142;
        llllIlIIIIll[8] = (((156 + 102) - 96) + 5) ^ (((111 + 12) - (-4)) + 48);
        llllIlIIIIll[9] = (110 ^ 75) ^ (175 ^ 131);
    }

    static {
        lIIlIIIIIlllIlI();
        lIIlIIIIIlllIIl();
        AUGURY = new g(llllIlIIIIlI[llllIlIIIIll[2]], llllIlIIIIll[0], Prayer.AUGURY);
        MYSTIC_MIGHT = new g(llllIlIIIIlI[llllIlIIIIll[3]], llllIlIIIIll[1], Prayer.MYSTIC_MIGHT);
        RIGOUR = new g(llllIlIIIIlI[llllIlIIIIll[4]], llllIlIIIIll[2], Prayer.RIGOUR);
        EAGLE_EYE = new g(llllIlIIIIlI[llllIlIIIIll[5]], llllIlIIIIll[3], Prayer.EAGLE_EYE);
        PIETY = new g(llllIlIIIIlI[llllIlIIIIll[6]], llllIlIIIIll[4], Prayer.PIETY);
        CHIVALRY = new g(llllIlIIIIlI[llllIlIIIIll[7]], llllIlIIIIll[5], Prayer.CHIVALRY);
        NONE = new g(llllIlIIIIlI[llllIlIIIIll[8]], llllIlIIIIll[6], null);
        g[] gVarArr = new g[llllIlIIIIll[7]];
        gVarArr[llllIlIIIIll[0]] = AUGURY;
        gVarArr[llllIlIIIIll[1]] = MYSTIC_MIGHT;
        gVarArr[llllIlIIIIll[2]] = RIGOUR;
        gVarArr[llllIlIIIIll[3]] = EAGLE_EYE;
        gVarArr[llllIlIIIIll[4]] = PIETY;
        gVarArr[llllIlIIIIll[5]] = CHIVALRY;
        gVarArr[llllIlIIIIll[6]] = NONE;
        $VALUES = gVarArr;
    }

    private static boolean lIIlIIIIIlllIll(int i, int i2) {
        return i < i2;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }

    private static String lIIlIIIIIllIlll(String lllllllllllllllIIlIlIIllIlIIllIl, String lllllllllllllllIIlIlIIllIlIIllII) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIlIlIIllIlIIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIlIIllIlIIlIll = new StringBuilder();
        char[] lllllllllllllllIIlIlIIllIlIIlIlI = lllllllllllllllIIlIlIIllIlIIllII.toCharArray();
        int lllllllllllllllIIlIlIIllIlIIlIIl = llllIlIIIIll[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = llllIlIIIIll[0];
        while (lIIlIIIIIlllIll(i, length)) {
            char lllllllllllllllIIlIlIIllIlIIlllI = charArray[i];
            lllllllllllllllIIlIlIIllIlIIlIll.append((char) (lllllllllllllllIIlIlIIllIlIIlllI ^ lllllllllllllllIIlIlIIllIlIIlIlI[lllllllllllllllIIlIlIIllIlIIlIIl % lllllllllllllllIIlIlIIllIlIIlIlI.length]));
            "".length();
            lllllllllllllllIIlIlIIllIlIIlIIl++;
            i++;
            "".length();
            if ((-"   ".length()) >= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIlIlIIllIlIIlIll);
    }
}
