package p000.m.e.a.u.s.r.r.q.i.r.e.f;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: -.m.e.a.u.s.r.r.q.i.r.e.f.C  reason: invalid package */
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:-/m/e/a/u/s/r/r/q/i/r/e/f/C.class */
public final class C {
    private final /* synthetic */ String name;
    private static /* synthetic */ int[] lIlllIllllIl;
    public static final /* synthetic */ C MAPLE;
    private final /* synthetic */ int itemID;
    public static final /* synthetic */ C WILLOW;
    public static final /* synthetic */ C MAGIC;
    public static final /* synthetic */ C MAHOGANY;
    public static final /* synthetic */ C OAK;
    public static final /* synthetic */ C TEAK;
    private final /* synthetic */ int logID;
    private static final /* synthetic */ C[] $VALUES;
    public static final /* synthetic */ C YEW;
    public static final /* synthetic */ C REDWOOD;
    public static final /* synthetic */ C NORMAL;
    private static /* synthetic */ String[] lIlllIllllII;

    public int au() {
        return this.itemID;
    }

    private static boolean lllIllIlIlIlII(int i) {
        return i > 0;
    }

    public static C[] values() {
        return (C[]) $VALUES.clone();
    }

    private static boolean lllIllIlIlIllI(int i, int i2) {
        return i < i2;
    }

    @Nullable
    static C c(int i) {
        int i2 = (i - lIlllIllllIl[0]) / lIlllIllllIl[1];
        if (!lllIllIlIlIlII(i) || lllIllIlIlIlIl(i2, values().length)) {
            return null;
        }
        return values()[i2];
    }

    public int av() {
        return this.logID;
    }

    private static String lllIllIlIlIIII(String lllllllllllllllIlIllIlIIIllIIIIl, String lllllllllllllllIlIllIlIIIllIIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIlIIIllIIIII.getBytes(StandardCharsets.UTF_8)), lIlllIllllIl[16]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlllIllllIl[5], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIlIIIllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIllIlIIIlIlllIl) {
            lllllllllllllllIlIllIlIIIlIlllIl.printStackTrace();
            return null;
        }
    }

    private static String lllIllIlIlIIIl(String lllllllllllllllIlIllIlIIlIIIIIll, String lllllllllllllllIlIllIlIIlIIIIIlI) {
        String lllllllllllllllIlIllIlIIlIIIIIll2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIllIlIIlIIIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIllIlIIlIIIIIIl = new StringBuilder();
        char[] charArray = lllllllllllllllIlIllIlIIlIIIIIlI.toCharArray();
        int lllllllllllllllIlIllIlIIIlllllll = lIlllIllllIl[2];
        char[] charArray2 = lllllllllllllllIlIllIlIIlIIIIIll2.toCharArray();
        int length = charArray2.length;
        int i = lIlllIllllIl[2];
        while (lllIllIlIlIllI(i, length)) {
            char lllllllllllllllIlIllIlIIlIIIIlII = charArray2[i];
            lllllllllllllllIlIllIlIIlIIIIIIl.append((char) (lllllllllllllllIlIllIlIIlIIIIlII ^ charArray[lllllllllllllllIlIllIlIIIlllllll % charArray.length]));
            "".length();
            lllllllllllllllIlIllIlIIIlllllll++;
            i++;
            "".length();
            if ((-" ".length()) > "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIllIlIIlIIIIIIl);
    }

    private static String lllIllIlIIllll(String lllllllllllllllIlIllIlIIIllIlllI, String lllllllllllllllIlIllIlIIIllIllIl) {
        try {
            SecretKeySpec lllllllllllllllIlIllIlIIIlllIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIlIIIllIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlllIllllIl[5], lllllllllllllllIlIllIlIIIlllIIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIlIIIllIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIllIlIIIllIllll) {
            lllllllllllllllIlIllIlIIIllIllll.printStackTrace();
            return null;
        }
    }

    public String ac() {
        return this.name;
    }

    private static void lllIllIlIlIIll() {
        lIlllIllllIl = new int[37];
        lIlllIllllIl[0] = " ".length();
        lIlllIllllIl[1] = "   ".length();
        lIlllIllllIl[2] = ((32 ^ 48) ^ (106 ^ 115)) & (((52 ^ 110) ^ (96 ^ 51)) ^ (-" ".length()));
        lIlllIllllIl[3] = (-10759) & 32270;
        lIlllIllllIl[4] = (-8217) & 9727;
        lIlllIllllIl[5] = "  ".length();
        lIlllIllllIl[6] = (-9205) & 30719;
        lIlllIllllIl[7] = (-27145) & 28665;
        lIlllIllllIl[8] = (160 ^ 164) ^ ((38 ^ 117) & ((47 ^ 124) ^ (-1)));
        lIlllIllllIl[9] = 22 ^ 19;
        lIlllIllllIl[10] = (-2306) & 23823;
        lIlllIllllIl[11] = (-24577) & 26095;
        lIlllIllllIl[12] = (((75 + 14) - (-91)) + 2) ^ (((52 + 66) - 53) + 111);
        lIlllIllllIl[13] = (40 ^ 93) ^ (88 ^ 42);
        lIlllIllllIl[14] = (-111) & 21631;
        lIlllIllllIl[15] = (-((-1881) & 26459)) & (-1857) & 32767;
        lIlllIllllIl[16] = 70 ^ 78;
        lIlllIllllIl[17] = 126 ^ 119;
        lIlllIllllIl[18] = (-((-16517) & 26831)) & (-257) & 32762;
        lIlllIllllIl[19] = (-21009) & 22525;
        lIlllIllllIl[20] = (((77 + 38) - 39) + 95) ^ (((23 + 35) - (-33)) + 70);
        lIlllIllllIl[21] = (((113 + 103) - 191) + 149) ^ (((72 + 28) - 63) + 128);
        lIlllIllllIl[22] = (-10569) & 32763;
        lIlllIllllIl[23] = (-"  ".length()) & (-257) & 6589;
        lIlllIllllIl[24] = 204 ^ 192;
        lIlllIllllIl[25] = 32 ^ 45;
        lIlllIllllIl[26] = (-10570) & 32767;
        lIlllIllllIl[27] = (-((-8397) & 13005)) & (-21) & 6143;
        lIlllIllllIl[28] = 113 ^ 127;
        lIlllIllllIl[29] = (144 ^ 198) ^ (246 ^ 175);
        lIlllIllllIl[30] = (-8263) & 30463;
        lIlllIllllIl[31] = (-((-22049) & 24119)) & (-4609) & 8191;
        lIlllIllllIl[32] = 156 ^ 140;
        lIlllIllllIl[33] = 138 ^ 155;
        lIlllIllllIl[34] = (-((-19470) & 19791)) & (-10243) & 32767;
        lIlllIllllIl[35] = (-((-4773) & 13223)) & (-1) & 28119;
        lIlllIllllIl[36] = (((38 + 72) - (-60)) + 1) ^ (((148 + 69) - 140) + 108);
    }

    private C(String str, int i, String str2, int i2, int i3) {
        this.name = str2;
        this.itemID = i2;
        this.logID = i3;
    }

    static {
        lllIllIlIlIIll();
        lllIllIlIlIIlI();
        NORMAL = new C(lIlllIllllII[lIlllIllllIl[2]], lIlllIllllIl[2], lIlllIllllII[lIlllIllllIl[0]], lIlllIllllIl[3], lIlllIllllIl[4]);
        OAK = new C(lIlllIllllII[lIlllIllllIl[5]], lIlllIllllIl[0], lIlllIllllII[lIlllIllllIl[1]], lIlllIllllIl[6], lIlllIllllIl[7]);
        WILLOW = new C(lIlllIllllII[lIlllIllllIl[8]], lIlllIllllIl[5], lIlllIllllII[lIlllIllllIl[9]], lIlllIllllIl[10], lIlllIllllIl[11]);
        TEAK = new C(lIlllIllllII[lIlllIllllIl[12]], lIlllIllllIl[1], lIlllIllllII[lIlllIllllIl[13]], lIlllIllllIl[14], lIlllIllllIl[15]);
        MAPLE = new C(lIlllIllllII[lIlllIllllIl[16]], lIlllIllllIl[8], lIlllIllllII[lIlllIllllIl[17]], lIlllIllllIl[18], lIlllIllllIl[19]);
        MAHOGANY = new C(lIlllIllllII[lIlllIllllIl[20]], lIlllIllllIl[9], lIlllIllllII[lIlllIllllIl[21]], lIlllIllllIl[22], lIlllIllllIl[23]);
        YEW = new C(lIlllIllllII[lIlllIllllIl[24]], lIlllIllllIl[12], lIlllIllllII[lIlllIllllIl[25]], lIlllIllllIl[26], lIlllIllllIl[27]);
        MAGIC = new C(lIlllIllllII[lIlllIllllIl[28]], lIlllIllllIl[13], lIlllIllllII[lIlllIllllIl[29]], lIlllIllllIl[30], lIlllIllllIl[31]);
        REDWOOD = new C(lIlllIllllII[lIlllIllllIl[32]], lIlllIllllIl[16], lIlllIllllII[lIlllIllllIl[33]], lIlllIllllIl[34], lIlllIllllIl[35]);
        C[] cArr = new C[lIlllIllllIl[17]];
        cArr[lIlllIllllIl[2]] = NORMAL;
        cArr[lIlllIllllIl[0]] = OAK;
        cArr[lIlllIllllIl[5]] = WILLOW;
        cArr[lIlllIllllIl[1]] = TEAK;
        cArr[lIlllIllllIl[8]] = MAPLE;
        cArr[lIlllIllllIl[9]] = MAHOGANY;
        cArr[lIlllIllllIl[12]] = YEW;
        cArr[lIlllIllllIl[13]] = MAGIC;
        cArr[lIlllIllllIl[16]] = REDWOOD;
        $VALUES = cArr;
    }

    private static boolean lllIllIlIlIlIl(int i, int i2) {
        return i >= i2;
    }

    private static void lllIllIlIlIIlI() {
        lIlllIllllII = new String[lIlllIllllIl[36]];
        lIlllIllllII[lIlllIllllIl[2]] = lllIllIlIIllll("e5ayL8aA9iQ=", "jmeUZ");
        lIlllIllllII[lIlllIllllIl[0]] = lllIllIlIlIIII("O4i+OVJ71bZwq8ADcDQctA==", "BgNAT");
        lIlllIllllII[lIlllIllllIl[5]] = lllIllIlIlIIII("Fw+y+YI9gi8=", "lzrrB");
        lIlllIllllII[lIlllIllllIl[1]] = lllIllIlIlIIIl("BDABcTQiIw5xPiQkGTQ=", "KQjQv");
        lIlllIllllII[lIlllIllllIl[8]] = lllIllIlIlIIIl("GzsKGQQb", "LrFUK");
        lIlllIllllII[lIlllIllllIl[9]] = lllIllIlIIllll("A0YkgKYqjFZeZLOxlWKKtkz1aA5q7cAN", "tAfEd");
        lIlllIllllII[lIlllIllllIl[12]] = lllIllIlIlIIII("7ehDMVtenFo=", "oYNVU");
        lIlllIllllII[lIlllIllllIl[13]] = lllIllIlIlIIII("cvNQiyWFYvq3zdVRWa8LZQ==", "rwXzz");
        lIlllIllllII[lIlllIllllIl[16]] = lllIllIlIlIIIl("DCUeNh8=", "AdNzZ");
        lIlllIllllII[lIlllIllllIl[17]] = lllIllIlIIllll("OxUbnG++9PWSyQDntdbOUProNmfixTFr", "vxcmE");
        lIlllIllllII[lIlllIllllIl[20]] = lllIllIlIlIIII("Fbgr81qSY6lxbp6FkKiifA==", "NhjtQ");
        lIlllIllllII[lIlllIllllIl[21]] = lllIllIlIIllll("5fcTAtxNlkjX2AUQ4uBZRuMaI+/U560S", "GoJTl");
        lIlllIllllII[lIlllIllllIl[24]] = lllIllIlIlIIII("yi7EHNwZV14=", "xOPso");
        lIlllIllllII[lIlllIllllIl[25]] = lllIllIlIlIIII("UsR9dZEku82NHcpteorh5A==", "mXIcP");
        lIlllIllllII[lIlllIllllIl[28]] = lllIllIlIIllll("hSQZHneGte0=", "VKOLK");
        lIlllIllllII[lIlllIllllIl[29]] = lllIllIlIlIIII("1jCHHpIE69vkavJ5sS/4bY9F4/KI7Vva", "RdZWR");
        lIlllIllllII[lIlllIllllIl[32]] = lllIllIlIIllll("Qtrcg+i1ctQ=", "joeIA");
        lIlllIllllII[lIlllIllllIl[33]] = lllIllIlIlIIII("VqDw9zjAAqydhvpgo3yuocpyDN/AneXF", "LVnRD");
    }

    public static C valueOf(String str) {
        return (C) Enum.valueOf(C.class, str);
    }
}
