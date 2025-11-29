package k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.m  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-bank-stander-0.1.0.jar:k/b/r/a/s/-/a/t/d/n/r/n/i/e/-/s/q/e/u/m.class */
public final class EnumC0012m {
    private static final /* synthetic */ EnumC0012m[] $VALUES;
    public static final /* synthetic */ EnumC0012m JADE;
    public static final /* synthetic */ EnumC0012m SAPPHIRE;
    public static final /* synthetic */ EnumC0012m AMETHYST;
    private final /* synthetic */ int craftingOption;
    private static /* synthetic */ int[] lllIIIIIIll;
    public static final /* synthetic */ EnumC0012m RED_TOPAZ;
    private final /* synthetic */ int materialID;
    public static final /* synthetic */ EnumC0012m DRAGONSTONE;
    public static final /* synthetic */ EnumC0012m DIAMOND;
    private final /* synthetic */ int finishedID;
    public static final /* synthetic */ EnumC0012m ZENYTE;
    public static final /* synthetic */ EnumC0012m EMERALD;
    public static final /* synthetic */ EnumC0012m ONYX;
    private static /* synthetic */ String[] lllIIIIIIlI;
    public static final /* synthetic */ EnumC0012m RUBY;
    public static final /* synthetic */ EnumC0012m OPAL;

    private static void lIlIllIIIlIIIl() {
        lllIIIIIIll = new int[34];
        lllIIIIIIll[0] = (102 ^ 45) & ((126 ^ 53) ^ (-1));
        lllIIIIIIll[1] = (-((-5313) & 32231)) & (-4097) & 32639;
        lllIIIIIIll[2] = (-18595) & 20203;
        lllIIIIIIll[3] = " ".length();
        lllIIIIIIll[4] = (-10277) & 11903;
        lllIIIIIIll[5] = (-10517) & 12127;
        lllIIIIIIll[6] = "  ".length();
        lllIIIIIIll[7] = (-4257) & 5885;
        lllIIIIIIll[8] = (-20609) & 22221;
        lllIIIIIIll[9] = "   ".length();
        lllIIIIIIll[10] = (-10249) & 11871;
        lllIIIIIIll[11] = (-((-1425) & 23961)) & (-161) & 24303;
        lllIIIIIIll[12] = (((71 + 88) - 46) + 22) ^ (((63 + 56) - 4) + 16);
        lllIIIIIIll[13] = (-((-17479) & 32111)) & (-1) & 16253;
        lllIIIIIIll[14] = (-((-897) & 25531)) & (-6273) & 32511;
        lllIIIIIIll[15] = 127 ^ 122;
        lllIIIIIIll[16] = (-22829) & 24447;
        lllIIIIIIll[17] = (-8505) & 10107;
        lllIIIIIIll[18] = (120 ^ 14) ^ (194 ^ 178);
        lllIIIIIIll[19] = (-(116 ^ 83)) & (-8585) & 10239;
        lllIIIIIIll[20] = (-4519) & 6119;
        lllIIIIIIll[21] = (153 ^ 164) ^ (45 ^ 23);
        lllIIIIIIll[22] = (-22561) & 24191;
        lllIIIIIIll[23] = (-((-16975) & 31615)) & (-129) & 16383;
        lllIIIIIIll[24] = 128 ^ 136;
        lllIIIIIIll[25] = (-1045) & 7615;
        lllIIIIIIll[26] = (-19) & 6591;
        lllIIIIIIll[27] = (110 ^ 98) ^ (93 ^ 88);
        lllIIIIIIll[28] = (-((-881) & 10237)) & (-2065) & 32767;
        lllIIIIIIll[29] = (-((-8411) & 8923)) & (-259) & 26623;
        lllIIIIIIll[30] = 45 ^ 39;
        lllIIIIIIll[31] = (-9153) & 28648;
        lllIIIIIIll[32] = (-((-2109) & 10493)) & (-771) & 28647;
        lllIIIIIIll[33] = 37 ^ 46;
    }

    private EnumC0012m(String str, int i, int i2, int i3, int i4) {
        this.materialID = i2;
        this.finishedID = i3;
        this.craftingOption = i4;
    }

    private static boolean lIlIllIIIlIIlI(int i, int i2) {
        return i < i2;
    }

    static {
        lIlIllIIIlIIIl();
        lIlIllIIIlIIII();
        OPAL = new EnumC0012m(lllIIIIIIlI[lllIIIIIIll[0]], lllIIIIIIll[0], lllIIIIIIll[1], lllIIIIIIll[2], lllIIIIIIll[3]);
        JADE = new EnumC0012m(lllIIIIIIlI[lllIIIIIIll[3]], lllIIIIIIll[3], lllIIIIIIll[4], lllIIIIIIll[5], lllIIIIIIll[3]);
        RED_TOPAZ = new EnumC0012m(lllIIIIIIlI[lllIIIIIIll[6]], lllIIIIIIll[6], lllIIIIIIll[7], lllIIIIIIll[8], lllIIIIIIll[3]);
        SAPPHIRE = new EnumC0012m(lllIIIIIIlI[lllIIIIIIll[9]], lllIIIIIIll[9], lllIIIIIIll[10], lllIIIIIIll[11], lllIIIIIIll[3]);
        EMERALD = new EnumC0012m(lllIIIIIIlI[lllIIIIIIll[12]], lllIIIIIIll[12], lllIIIIIIll[13], lllIIIIIIll[14], lllIIIIIIll[3]);
        RUBY = new EnumC0012m(lllIIIIIIlI[lllIIIIIIll[15]], lllIIIIIIll[15], lllIIIIIIll[16], lllIIIIIIll[17], lllIIIIIIll[3]);
        DIAMOND = new EnumC0012m(lllIIIIIIlI[lllIIIIIIll[18]], lllIIIIIIll[18], lllIIIIIIll[19], lllIIIIIIll[20], lllIIIIIIll[3]);
        DRAGONSTONE = new EnumC0012m(lllIIIIIIlI[lllIIIIIIll[21]], lllIIIIIIll[21], lllIIIIIIll[22], lllIIIIIIll[23], lllIIIIIIll[3]);
        ONYX = new EnumC0012m(lllIIIIIIlI[lllIIIIIIll[24]], lllIIIIIIll[24], lllIIIIIIll[25], lllIIIIIIll[26], lllIIIIIIll[3]);
        AMETHYST = new EnumC0012m(lllIIIIIIlI[lllIIIIIIll[27]], lllIIIIIIll[27], lllIIIIIIll[28], lllIIIIIIll[29], lllIIIIIIll[12]);
        ZENYTE = new EnumC0012m(lllIIIIIIlI[lllIIIIIIll[30]], lllIIIIIIll[30], lllIIIIIIll[31], lllIIIIIIll[32], lllIIIIIIll[3]);
        EnumC0012m[] enumC0012mArr = new EnumC0012m[lllIIIIIIll[33]];
        enumC0012mArr[lllIIIIIIll[0]] = OPAL;
        enumC0012mArr[lllIIIIIIll[3]] = JADE;
        enumC0012mArr[lllIIIIIIll[6]] = RED_TOPAZ;
        enumC0012mArr[lllIIIIIIll[9]] = SAPPHIRE;
        enumC0012mArr[lllIIIIIIll[12]] = EMERALD;
        enumC0012mArr[lllIIIIIIll[15]] = RUBY;
        enumC0012mArr[lllIIIIIIll[18]] = DIAMOND;
        enumC0012mArr[lllIIIIIIll[21]] = DRAGONSTONE;
        enumC0012mArr[lllIIIIIIll[24]] = ONYX;
        enumC0012mArr[lllIIIIIIll[27]] = AMETHYST;
        enumC0012mArr[lllIIIIIIll[30]] = ZENYTE;
        $VALUES = enumC0012mArr;
    }

    private static void lIlIllIIIlIIII() {
        lllIIIIIIlI = new String[lllIIIIIIll[33]];
        lllIIIIIIlI[lllIIIIIIll[0]] = lIlIllIIIIllIl("Lxzm1k1hBzw=", "mdhzx");
        lllIIIIIIlI[lllIIIIIIll[3]] = lIlIllIIIIlllI("IgYoMg==", "hGlwF");
        lllIIIIIIlI[lllIIIIIIll[6]] = lIlIllIIIIlllI("NzYPHDgqIwoZ", "esKCl");
        lllIIIIIIlI[lllIIIIIIll[9]] = lIlIllIIIIllll("aavw9rcMQIbeeHcYmYozMw==", "nHsLy");
        lllIIIIIIlI[lllIIIIIIll[12]] = lIlIllIIIIllll("yKgLTeHUmek=", "NJdUr");
        lllIIIIIIlI[lllIIIIIIll[15]] = lIlIllIIIIlllI("ATkSHw==", "SlPFp");
        lllIIIIIIlI[lllIIIIIIll[18]] = lIlIllIIIIllll("pwnehHxRbO8=", "HiZiw");
        lllIIIIIIlI[lllIIIIIIll[21]] = lIlIllIIIIllIl("OfbQ0RUT2wGsytEnuhBjnA==", "mkmgM");
        lllIIIIIIlI[lllIIIIIIll[24]] = lIlIllIIIIlllI("LCYMOg==", "chUbe");
        lllIIIIIIlI[lllIIIIIIll[27]] = lIlIllIIIIlllI("CRU3OAERCyY=", "HXrlI");
        lllIIIIIIlI[lllIIIIIIll[30]] = lIlIllIIIIllIl("EOuH4NkZNRA=", "yxNSA");
    }

    private static String lIlIllIIIIllll(String llllllllllllllllIIlIlIlIllllIIIl, String llllllllllllllllIIlIlIlIllllIIlI) {
        try {
            SecretKeySpec llllllllllllllllIIlIlIlIllllIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlIlIllllIIlI.getBytes(StandardCharsets.UTF_8)), lllIIIIIIll[24]), "DES");
            Cipher llllllllllllllllIIlIlIlIllllIlIl = Cipher.getInstance("DES");
            llllllllllllllllIIlIlIlIllllIlIl.init(lllIIIIIIll[6], llllllllllllllllIIlIlIlIllllIllI);
            return new String(llllllllllllllllIIlIlIlIllllIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlIlIllllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIlIlIllllIlII) {
            llllllllllllllllIIlIlIlIllllIlII.printStackTrace();
            return null;
        }
    }

    public static EnumC0012m valueOf(String str) {
        return (EnumC0012m) Enum.valueOf(EnumC0012m.class, str);
    }

    public static EnumC0012m[] values() {
        return (EnumC0012m[]) $VALUES.clone();
    }

    public int C() {
        return this.craftingOption;
    }

    public int z() {
        return this.materialID;
    }

    private static String lIlIllIIIIlllI(String llllllllllllllllIIlIlIllIIIIlIII, String llllllllllllllllIIlIlIllIIIIIlll) {
        String llllllllllllllllIIlIlIllIIIIlIII2 = new String(Base64.getDecoder().decode(llllllllllllllllIIlIlIllIIIIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllllIIlIlIllIIIIIlll.toCharArray();
        int llllllllllllllllIIlIlIllIIIIIlII = lllIIIIIIll[0];
        char[] charArray2 = llllllllllllllllIIlIlIllIIIIlIII2.toCharArray();
        int length = charArray2.length;
        int i = lllIIIIIIll[0];
        while (lIlIllIIIlIIlI(i, length)) {
            char llllllllllllllllIIlIlIllIIIIlIIl = charArray2[i];
            sb.append((char) (llllllllllllllllIIlIlIllIIIIlIIl ^ charArray[llllllllllllllllIIlIlIllIIIIIlII % charArray.length]));
            "".length();
            llllllllllllllllIIlIlIllIIIIIlII++;
            i++;
            "".length();
            if (" ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String lIlIllIIIIllIl(String llllllllllllllllIIlIlIlIlllIIllI, String llllllllllllllllIIlIlIlIlllIIlIl) {
        try {
            SecretKeySpec llllllllllllllllIIlIlIlIlllIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlIlIlllIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlIlIlIlllIlIII = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlIlIlIlllIlIII.init(lllIIIIIIll[6], llllllllllllllllIIlIlIlIlllIlIIl);
            return new String(llllllllllllllllIIlIlIlIlllIlIII.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlIlIlllIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIlIlIlllIIlll) {
            llllllllllllllllIIlIlIlIlllIIlll.printStackTrace();
            return null;
        }
    }

    public int E() {
        return this.finishedID;
    }
}
