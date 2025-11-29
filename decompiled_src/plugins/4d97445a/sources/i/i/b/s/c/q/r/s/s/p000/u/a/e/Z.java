package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.Z  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/Z.class */
public final class Z {
    public static final /* synthetic */ Z WALLASALKI;
    public static final /* synthetic */ Z HELL_HOUND_TESTING;
    public static final /* synthetic */ Z DAGANNOTH_RANGE;
    private static /* synthetic */ int[] lIlllIll;
    private static /* synthetic */ String[] lIlllIIl;
    public static final /* synthetic */ Z PRIME;
    private final /* synthetic */ int id;
    public static final /* synthetic */ Z GIANT_ROCK_CRAB;
    private final /* synthetic */ int animation;
    public static final /* synthetic */ Z REX;
    private static final /* synthetic */ Z[] $VALUES;
    private final /* synthetic */ Prayer protection;
    public static final /* synthetic */ Z DAGANNOTH_RANGE2;
    public static final /* synthetic */ Z ROCK_LOBSTER;
    public static final /* synthetic */ Z DAGANNOTH;
    public static final /* synthetic */ Z SUPREME;

    private static boolean lIlIIlllll(int i2, int i3) {
        return i2 < i3;
    }

    public static Z valueOf(String str) {
        return (Z) Enum.valueOf(Z.class, str);
    }

    public static Z h(NPC npc) {
        Z[] values = values();
        int length = values.length;
        int i2 = lIlllIll[0];
        while (lIlIIlllll(i2, length)) {
            Z z = values[i2];
            if (lIlIlIIIII(z.P(), npc.getId())) {
                return z;
            }
            i2++;
            "".length();
            if ("   ".length() <= " ".length()) {
                return null;
            }
        }
        return null;
    }

    public int ba() {
        return this.animation;
    }

    private static String lIlIIlIIII(String llIlllIIIllllll, String llIlllIIIlllllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIlllIIIlllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlllIll[6], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIlllIIIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIlllIIlIIIIII) {
            llIlllIIlIIIIII.printStackTrace();
            return null;
        }
    }

    public Prayer aZ() {
        return this.protection;
    }

    private static void lIlIIllllI() {
        lIlllIll = new int[30];
        lIlllIll[0] = ((((66 + 112) - 46) + 16) ^ (((133 + 57) - 99) + 99)) & (((210 ^ 177) ^ (196 ^ 141)) ^ (-" ".length()));
        lIlllIll[1] = (-((-16539) & 29627)) & (-17409) & 32763;
        lIlllIll[2] = (-((-18207) & 30623)) & (-17475) & 32743;
        lIlllIll[3] = " ".length();
        lIlllIll[4] = (-((-4613) & 14118)) & (-20997) & 32767;
        lIlllIll[5] = (-((-769) & 18185)) & (-8338) & 28607;
        lIlllIll[6] = "  ".length();
        lIlllIll[7] = (-5895) & 8159;
        lIlllIll[8] = (-((-2913) & 28665)) & (-65) & 28671;
        lIlllIll[9] = "   ".length();
        lIlllIll[10] = (-20995) & 24179;
        lIlllIll[11] = (-((-8499) & 13235)) & (-2051) & 8127;
        lIlllIll[12] = (9 ^ 13) ^ ((139 ^ 154) & ((77 ^ 92) ^ (-1)));
        lIlllIll[13] = (-((-18881) & 31723)) & (-16641) & 31743;
        lIlllIll[14] = (-24616) & 26983;
        lIlllIll[15] = (84 ^ 32) ^ (236 ^ 157);
        lIlllIll[16] = (-((-4615) & 31311)) & (-129) & 32763;
        lIlllIll[17] = (-((-2365) & 19263)) & (-13441) & 32703;
        lIlllIll[18] = (184 ^ 183) ^ (0 ^ 9);
        lIlllIll[19] = (-((-1042) & 17627)) & (-8193) & 30719;
        lIlllIll[20] = (-4673) & 6015;
        lIlllIll[21] = 105 ^ 110;
        lIlllIll[22] = (-18625) & 24567;
        lIlllIll[23] = (79 ^ 51) ^ (103 ^ 19);
        lIlllIll[24] = (-((-4355) & 28931)) & (-2054) & 32573;
        lIlllIll[25] = (-((-2475) & 32255)) & (-129) & 32767;
        lIlllIll[26] = 50 ^ 59;
        lIlllIll[27] = 69 ^ 45;
        lIlllIll[28] = (-((-650) & 26319)) & (-529) & 32759;
        lIlllIll[29] = 133 ^ 143;
    }

    private Z(String str, int i2, int i3, Prayer prayer, int i4) {
        this.id = i3;
        this.protection = prayer;
        this.animation = i4;
    }

    public static Z[] values() {
        return (Z[]) $VALUES.clone();
    }

    private static String lIlIIllIII(String llIlllIIIIlllIl, String llIlllIIIlIIIIl) {
        String llIlllIIIIlllIl2 = new String(Base64.getDecoder().decode(llIlllIIIIlllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llIlllIIIlIIIIl.toCharArray();
        int llIlllIIIIllllI = lIlllIll[0];
        char[] charArray2 = llIlllIIIIlllIl2.toCharArray();
        int length = charArray2.length;
        int i2 = lIlllIll[0];
        while (lIlIIlllll(i2, length)) {
            sb.append((char) (charArray2[i2] ^ charArray[llIlllIIIIllllI % charArray.length]));
            "".length();
            llIlllIIIIllllI++;
            i2++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    public int P() {
        return this.id;
    }

    private static void lIlIIllIlI() {
        lIlllIIl = new String[lIlllIll[29]];
        lIlllIIl[lIlllIll[0]] = lIlIIlIIII("sck2qyqhC9c=", "zmNdB");
        lIlllIIl[lIlllIll[3]] = lIlIIlIIIl("i5IXjNajX2Y=", "nurJP");
        lIlllIIl[lIlllIll[6]] = lIlIIlIIII("oWmkvWU2UQU=", "VMzPq");
        lIlllIIl[lIlllIll[9]] = lIlIIlIIII("rqJH/tkg8JYxL64f0DSMsw==", "hZzqD");
        lIlllIIl[lIlllIll[12]] = lIlIIlIIIl("SDklhPXiGSGxbk9Qzi0hxw==", "XMPNh");
        lIlllIIl[lIlllIll[15]] = lIlIIllIII("BTc+JAoBNz4jAg==", "RvrhK");
        lIlllIIl[lIlllIll[18]] = lIlIIlIIII("oyTHJrXHsiosXIZN3YOJgA==", "AwyeW");
        lIlllIIl[lIlllIll[21]] = lIlIIlIIII("Inw6bQh/5Ce4FtNfnaYXdJLjBCgfxVEH", "yzqkm");
        lIlllIIl[lIlllIll[23]] = lIlIIlIIIl("47ZrXf9iLpN15IBCkPn+8Q==", "hTYbZ");
        lIlllIIl[lIlllIll[26]] = lIlIIlIIII("2hekR+3LsBNjqCY8kPBC61eEA4H7JYUy", "pPpaW");
    }

    static {
        lIlIIllllI();
        lIlIIllIlI();
        REX = new Z(lIlllIIl[lIlllIll[0]], lIlllIll[0], lIlllIll[1], Prayer.PROTECT_FROM_MELEE, lIlllIll[2]);
        PRIME = new Z(lIlllIIl[lIlllIll[3]], lIlllIll[3], lIlllIll[4], Prayer.PROTECT_FROM_MAGIC, lIlllIll[5]);
        SUPREME = new Z(lIlllIIl[lIlllIll[6]], lIlllIll[6], lIlllIll[7], Prayer.PROTECT_FROM_MISSILES, lIlllIll[8]);
        DAGANNOTH = new Z(lIlllIIl[lIlllIll[9]], lIlllIll[9], lIlllIll[10], Prayer.PROTECT_FROM_MELEE, lIlllIll[11]);
        GIANT_ROCK_CRAB = new Z(lIlllIIl[lIlllIll[12]], lIlllIll[12], lIlllIll[13], Prayer.PROTECT_FROM_MELEE, lIlllIll[14]);
        WALLASALKI = new Z(lIlllIIl[lIlllIll[15]], lIlllIll[15], lIlllIll[16], Prayer.PROTECT_FROM_MAGIC, lIlllIll[17]);
        DAGANNOTH_RANGE = new Z(lIlllIIl[lIlllIll[18]], lIlllIll[18], lIlllIll[19], Prayer.PROTECT_FROM_MISSILES, lIlllIll[20]);
        DAGANNOTH_RANGE2 = new Z(lIlllIIl[lIlllIll[21]], lIlllIll[21], lIlllIll[22], Prayer.PROTECT_FROM_MISSILES, lIlllIll[11]);
        ROCK_LOBSTER = new Z(lIlllIIl[lIlllIll[23]], lIlllIll[23], lIlllIll[24], Prayer.PROTECT_FROM_MELEE, lIlllIll[25]);
        HELL_HOUND_TESTING = new Z(lIlllIIl[lIlllIll[26]], lIlllIll[26], lIlllIll[27], Prayer.PROTECT_FROM_MELEE, lIlllIll[28]);
        Z[] zArr = new Z[lIlllIll[29]];
        zArr[lIlllIll[0]] = REX;
        zArr[lIlllIll[3]] = PRIME;
        zArr[lIlllIll[6]] = SUPREME;
        zArr[lIlllIll[9]] = DAGANNOTH;
        zArr[lIlllIll[12]] = GIANT_ROCK_CRAB;
        zArr[lIlllIll[15]] = WALLASALKI;
        zArr[lIlllIll[18]] = DAGANNOTH_RANGE;
        zArr[lIlllIll[21]] = DAGANNOTH_RANGE2;
        zArr[lIlllIll[23]] = ROCK_LOBSTER;
        zArr[lIlllIll[26]] = HELL_HOUND_TESTING;
        $VALUES = zArr;
    }

    private static boolean lIlIlIIIII(int i2, int i3) {
        return i2 == i3;
    }

    private static String lIlIIlIIIl(String llIlllIIIllIIlI, String llIlllIIIllIIIl) {
        try {
            SecretKeySpec llIlllIIIllIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIlllIIIllIIIl.getBytes(StandardCharsets.UTF_8)), lIlllIll[23]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlllIll[6], llIlllIIIllIlIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIlllIIIllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIlllIIIllIIll) {
            llIlllIIIllIIll.printStackTrace();
            return null;
        }
    }
}
