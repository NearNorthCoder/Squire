package u.i.r.d.s.e.r.q.y.a.h.p000;

import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Point;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.Players;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: u.i.r.d.s.e.r.q.y.a.h.-.k  reason: invalid package */
/* loaded from: f9dee1ad-dcbf-4af9-9fb8-47dc91e2d43e.jar:u/i/r/d/s/e/r/q/y/a/h/-/k.class */
public final class k {
    private final /* synthetic */ int spriteId;
    private final /* synthetic */ int specialProjectileId;
    private final /* synthetic */ int hpThreshold;
    private final /* synthetic */ WorldPoint fountainWorldPoint;
    public static final /* synthetic */ k ENRAGED;
    public static final /* synthetic */ k LIGHTNING;
    private final /* synthetic */ Point fountainPlayerPoint;
    private final /* synthetic */ int specialAnimationId;
    private final /* synthetic */ int deathAnimation1;
    private final /* synthetic */ int deathAnimation2;
    public static final /* synthetic */ k FLAME;
    private final /* synthetic */ Color phaseColor;
    private final /* synthetic */ Color fountainColor;
    public static final /* synthetic */ k POISON;
    private static final /* synthetic */ k[] $VALUES;
    private final /* synthetic */ int attacksPerSwitch;
    private static /* synthetic */ String[] llllIIllIIII;
    private static /* synthetic */ int[] llllIIllIIIl;

    public int ab() {
        return this.deathAnimation1;
    }

    private static void lIIlIIIIIIIIllI() {
        llllIIllIIIl = new int[35];
        llllIIllIIIl[0] = ((((36 + 214) - 86) + 56) ^ (((88 + 82) - 121) + 102)) & (((68 ^ 108) ^ (242 ^ 145)) ^ (-" ".length()));
        llllIIllIIIl[1] = " ".length();
        llllIIllIIIl[2] = "  ".length();
        llllIIllIIIl[3] = "   ".length();
        llllIIllIIIl[4] = (-((-16397) & 20959)) & (-18945) & 31743;
        llllIIllIIIl[5] = (-7698) & 15935;
        llllIIllIIIl[6] = (-8450) & 10093;
        llllIIllIIIl[7] = (-((-393) & 2443)) & (-193) & 3067;
        llllIIllIIIl[8] = (-16642) & 18415;
        llllIIllIIIl[9] = (-8837) & 10207;
        llllIIllIIIl[10] = (-17385) & 27647;
        llllIIllIIIl[11] = (44 ^ 88) ^ (125 ^ 48);
        llllIIllIIIl[12] = 88 ^ 127;
        llllIIllIIIl[13] = (-16588) & 24831;
        llllIIllIIIl[14] = (-((-23585) & 23851)) & (-16385) & 24895;
        llllIIllIIIl[15] = (-((-8289) & 30185)) & (-2117) & 32253;
        llllIIllIIIl[16] = (-((-131) & 9363)) & (-18698) & 28479;
        llllIIllIIIl[17] = (-((-21537) & 31865)) & (-16385) & 28671;
        llllIIllIIIl[18] = (-728) & 10999;
        llllIIllIIIl[19] = 82 ^ 97;
        llllIIllIIIl[20] = (169 ^ 158) ^ " ".length();
        llllIIllIIIl[21] = 159 ^ 155;
        llllIIllIIIl[22] = (-23109) & 31359;
        llllIIllIIIl[23] = (-((-27181) & 32622)) & (-16513) & 30205;
        llllIIllIIIl[24] = (-1413) & 9660;
        llllIIllIIIl[25] = (-17613) & 17887;
        llllIIllIIIl[26] = (-2086) & 3885;
        llllIIllIIIl[27] = (-((-32035) & 32559)) & (-6274) & 8159;
        llllIIllIIIl[28] = 158 ^ 186;
        llllIIllIIIl[29] = 129 ^ 175;
        llllIIllIIIl[30] = 11 ^ 14;
        llllIIllIIIl[31] = (-((-9313) & 16379)) & (-17409) & 32731;
        llllIIllIIIl[32] = (-((-4673) & 8166)) & (-21017) & 32767;
        llllIIllIIIl[33] = 98 ^ 100;
        llllIIllIIIl[34] = 142 ^ 134;
    }

    public int ae() {
        return this.specialAnimationId;
    }

    private k(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, WorldPoint worldPoint, Point point, Color color, Color color2) {
        this.attacksPerSwitch = i2;
        this.deathAnimation1 = i3;
        this.deathAnimation2 = i4;
        this.specialProjectileId = i5;
        this.specialAnimationId = i6;
        this.hpThreshold = i7;
        this.spriteId = i8;
        this.fountainWorldPoint = worldPoint;
        this.fountainPlayerPoint = point;
        this.phaseColor = color;
        this.fountainColor = color2;
    }

    static {
        lIIlIIIIIIIIllI();
        lIIlIIIIIIIIlIl();
        POISON = new k(llllIIllIIII[llllIIllIIIl[2]], llllIIllIIIl[0], llllIIllIIIl[3], llllIIllIIIl[4], llllIIllIIIl[5], llllIIllIIIl[6], llllIIllIIIl[0], llllIIllIIIl[7], llllIIllIIIl[8], new WorldPoint(llllIIllIIIl[9], llllIIllIIIl[10], llllIIllIIIl[0]), new Point(llllIIllIIIl[11], llllIIllIIIl[12]), Color.GREEN, Color.RED);
        LIGHTNING = new k(llllIIllIIII[llllIIllIIIl[3]], llllIIllIIIl[1], llllIIllIIIl[3], llllIIllIIIl[13], llllIIllIIIl[14], llllIIllIIIl[0], llllIIllIIIl[15], llllIIllIIIl[16], llllIIllIIIl[17], new WorldPoint(llllIIllIIIl[9], llllIIllIIIl[18], llllIIllIIIl[0]), new Point(llllIIllIIIl[19], llllIIllIIIl[20]), Color.CYAN, Color.GREEN);
        FLAME = new k(llllIIllIIII[llllIIllIIIl[21]], llllIIllIIIl[2], llllIIllIIIl[3], llllIIllIIIl[22], llllIIllIIIl[23], llllIIllIIIl[0], llllIIllIIIl[24], llllIIllIIIl[25], llllIIllIIIl[26], new WorldPoint(llllIIllIIIl[27], llllIIllIIIl[18], llllIIllIIIl[0]), new Point(llllIIllIIIl[28], llllIIllIIIl[29]), Color.RED, Color.CYAN);
        ENRAGED = new k(llllIIllIIII[llllIIllIIIl[30]], llllIIllIIIl[3], llllIIllIIIl[1], llllIIllIIIl[31], llllIIllIIIl[32], llllIIllIIIl[6], llllIIllIIIl[0], llllIIllIIIl[0], llllIIllIIIl[8], null, null, null, null);
        k[] kVarArr = new k[llllIIllIIIl[21]];
        kVarArr[llllIIllIIIl[0]] = POISON;
        kVarArr[llllIIllIIIl[1]] = LIGHTNING;
        kVarArr[llllIIllIIIl[2]] = FLAME;
        kVarArr[llllIIllIIIl[3]] = ENRAGED;
        $VALUES = kVarArr;
    }

    private static String lIIlIIIIIIIIIlI(String lllllllllllllllIIlIlIlIIlIlllIIl, String lllllllllllllllIIlIlIlIIlIlllIII) {
        String lllllllllllllllIIlIlIlIIlIlllIIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIIlIlIlIIlIlllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIlIlIIlIllIlll = new StringBuilder();
        char[] charArray = lllllllllllllllIIlIlIlIIlIlllIII.toCharArray();
        int lllllllllllllllIIlIlIlIIlIllIlIl = llllIIllIIIl[0];
        char[] charArray2 = lllllllllllllllIIlIlIlIIlIlllIIl2.toCharArray();
        int length = charArray2.length;
        int i = llllIIllIIIl[0];
        while (lIIlIIIIIIIlIII(i, length)) {
            lllllllllllllllIIlIlIlIIlIllIlll.append((char) (charArray2[i] ^ charArray[lllllllllllllllIIlIlIlIIlIllIlIl % charArray.length]));
            "".length();
            lllllllllllllllIIlIlIlIIlIllIlIl++;
            i++;
            "".length();
            if ("  ".length() == ((36 ^ 3) ^ (47 ^ 12))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIlIlIlIIlIllIlll);
    }

    public Color ah() {
        return this.phaseColor;
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    private static void lIIlIIIIIIIIlIl() {
        llllIIllIIII = new String[llllIIllIIIl[33]];
        llllIIllIIII[llllIIllIIIl[0]] = lIIlIIIIIIIIIlI("Hg==", "AVoyf");
        llllIIllIIII[llllIIllIIIl[1]] = lIIlIIIIIIIIIll("4XpRIm9kSe0=", "mvDnc");
        llllIIllIIII[llllIIllIIIl[2]] = lIIlIIIIIIIIlII("TpfYD08oW8A=", "cbtXs");
        llllIIllIIII[llllIIllIIIl[3]] = lIIlIIIIIIIIIlI("AiINHRwAIgQS", "NkJUH");
        llllIIllIIII[llllIIllIIIl[21]] = lIIlIIIIIIIIlII("zyMQpTb0jPA=", "LfxIX");
        llllIIllIIII[llllIIllIIIl[30]] = lIIlIIIIIIIIIll("/YttpuvcYt8=", "becby");
    }

    public RegionPoint Z() {
        WorldPoint worldLocation = Players.getLocal().getWorldLocation();
        if (lIIlIIIIIIIIlll(this, ENRAGED)) {
            return new RegionPoint(this.fountainPlayerPoint.getX(), this.fountainPlayerPoint.getY(), worldLocation.getPlane(), worldLocation.getRegionID());
        }
        return null;
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }

    private static String lIIlIIIIIIIIlII(String lllllllllllllllIIlIlIlIIlIlIIIlI, String lllllllllllllllIIlIlIlIIlIlIIIll) {
        try {
            SecretKeySpec lllllllllllllllIIlIlIlIIlIlIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIlIIlIlIIIll.getBytes(StandardCharsets.UTF_8)), llllIIllIIIl[34]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llllIIllIIIl[2], lllllllllllllllIIlIlIlIIlIlIIlll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIlIIlIlIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIlIlIIlIlIIlIl) {
            lllllllllllllllIIlIlIlIIlIlIIlIl.printStackTrace();
            return null;
        }
    }

    public Color ai() {
        return this.fountainColor;
    }

    private static boolean lIIlIIIIIIIlIII(int i, int i2) {
        return i < i2;
    }

    private static String lIIlIIIIIIIIIll(String lllllllllllllllIIlIlIlIIlIIlIlll, String lllllllllllllllIIlIlIlIIlIIlIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIlIIlIIlIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llllIIllIIIl[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIlIIlIIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIlIlIIlIIllIII) {
            lllllllllllllllIIlIlIlIIlIIllIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIIIIIIIlll(Object obj, Object obj2) {
        return obj != obj2;
    }

    public int aa() {
        return this.attacksPerSwitch;
    }

    public int ad() {
        return this.specialProjectileId;
    }

    public int af() {
        return this.hpThreshold;
    }

    public int ac() {
        return this.deathAnimation2;
    }

    @Override // java.lang.Enum
    public String toString() {
        String str = super.toString();
        return str.charAt(llllIIllIIIl[0]) + str.substring(llllIIllIIIl[1]).replaceAll(llllIIllIIII[llllIIllIIIl[0]], llllIIllIIII[llllIIllIIIl[1]]).toLowerCase();
    }

    public WorldPoint ag() {
        return this.fountainWorldPoint;
    }
}
