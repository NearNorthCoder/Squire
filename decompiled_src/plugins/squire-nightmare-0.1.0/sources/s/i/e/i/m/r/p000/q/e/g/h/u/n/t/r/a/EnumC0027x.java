package s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.x  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-nightmare-0.1.0.jar:s/i/e/i/m/r/-/q/e/g/h/u/n/t/r/a/x.class */
public final class EnumC0027x {
    public static final /* synthetic */ EnumC0027x NONE;
    public static final /* synthetic */ EnumC0027x BLOWPIPE;
    public static final /* synthetic */ EnumC0027x WEBWEAVER_BOW;
    private static /* synthetic */ int[] llllIlIllIlI;
    private static final /* synthetic */ EnumC0027x[] $VALUES;
    public static final /* synthetic */ EnumC0027x CHINCHOMPA;
    public static final /* synthetic */ EnumC0027x HUNTER_CROSSBOW;
    private static /* synthetic */ String[] llllIlIlIlIl;
    private final /* synthetic */ String itemName;
    public static final /* synthetic */ EnumC0027x CRAWS_BOW;

    public String bP() {
        return this.itemName;
    }

    static {
        lIIlIIIlIIIlIIl();
        lIIlIIIlIIIIlll();
        HUNTER_CROSSBOW = new EnumC0027x(llllIlIlIlIl[llllIlIllIlI[0]], llllIlIllIlI[0], llllIlIlIlIl[llllIlIllIlI[1]]);
        BLOWPIPE = new EnumC0027x(llllIlIlIlIl[llllIlIllIlI[2]], llllIlIllIlI[1], llllIlIlIlIl[llllIlIllIlI[3]]);
        CHINCHOMPA = new EnumC0027x(llllIlIlIlIl[llllIlIllIlI[4]], llllIlIllIlI[2], llllIlIlIlIl[llllIlIllIlI[5]]);
        CRAWS_BOW = new EnumC0027x(llllIlIlIlIl[llllIlIllIlI[6]], llllIlIllIlI[3], llllIlIlIlIl[llllIlIllIlI[7]]);
        WEBWEAVER_BOW = new EnumC0027x(llllIlIlIlIl[llllIlIllIlI[8]], llllIlIllIlI[4], llllIlIlIlIl[llllIlIllIlI[9]]);
        NONE = new EnumC0027x(llllIlIlIlIl[llllIlIllIlI[10]], llllIlIllIlI[5], llllIlIlIlIl[llllIlIllIlI[11]]);
        EnumC0027x[] enumC0027xArr = new EnumC0027x[llllIlIllIlI[6]];
        enumC0027xArr[llllIlIllIlI[0]] = HUNTER_CROSSBOW;
        enumC0027xArr[llllIlIllIlI[1]] = BLOWPIPE;
        enumC0027xArr[llllIlIllIlI[2]] = CHINCHOMPA;
        enumC0027xArr[llllIlIllIlI[3]] = CRAWS_BOW;
        enumC0027xArr[llllIlIllIlI[4]] = WEBWEAVER_BOW;
        enumC0027xArr[llllIlIllIlI[5]] = NONE;
        $VALUES = enumC0027xArr;
    }

    private static void lIIlIIIlIIIlIIl() {
        llllIlIllIlI = new int[13];
        llllIlIllIlI[0] = ((((187 + 78) - 155) + 99) ^ (((24 + 153) - 134) + 116)) & (((123 ^ 109) ^ (240 ^ 168)) ^ (-" ".length()));
        llllIlIllIlI[1] = " ".length();
        llllIlIllIlI[2] = "  ".length();
        llllIlIllIlI[3] = "   ".length();
        llllIlIllIlI[4] = (((135 + 136) - 96) + 22) ^ (((175 + 68) - 175) + 125);
        llllIlIllIlI[5] = (((56 + 108) - 160) + 149) ^ (((68 + 12) - (-36)) + 40);
        llllIlIllIlI[6] = (((181 + 119) - 233) + 126) ^ (((117 + 34) - 13) + 61);
        llllIlIllIlI[7] = 105 ^ 110;
        llllIlIllIlI[8] = 207 ^ 199;
        llllIlIllIlI[9] = 159 ^ 150;
        llllIlIllIlI[10] = 137 ^ 131;
        llllIlIllIlI[11] = 136 ^ 131;
        llllIlIllIlI[12] = (202 ^ 173) ^ (255 ^ 148);
    }

    public static EnumC0027x[] values() {
        return (EnumC0027x[]) $VALUES.clone();
    }

    private static void lIIlIIIlIIIIlll() {
        llllIlIlIlIl = new String[llllIlIllIlI[12]];
        llllIlIlIlIl[llllIlIllIlI[0]] = lIIlIIIIlllllll("uWGSSkEitfaU0E6TwMzi0A==", "hqXek");
        llllIlIlIlIl[llllIlIllIlI[1]] = lIIlIIIlIIIIIIl("GRE8FzUjF3VDMyMLIRAyPhM=", "QdRcP");
        llllIlIlIlIl[llllIlIllIlI[2]] = lIIlIIIlIIIIIlI("R+rkCOM4kwDyeLl6BpP3mg==", "vcAxH");
        llllIlIlIlIl[llllIlIllIlI[3]] = lIIlIIIlIIIIIlI("IFzf2QKIs+qF/QDNNkBMzg==", "ZkWfe");
        llllIlIlIlIl[llllIlIllIlI[4]] = lIIlIIIlIIIIIIl("BR4cKBcOGRg2FQ==", "FVUfT");
        llllIlIlIlIl[llllIlIllIlI[5]] = lIIlIIIlIIIIIIl("ATE7ICgqNj8+Kg==", "BYRNK");
        llllIlIlIlIl[llllIlIllIlI[6]] = lIIlIIIIlllllll("WrH19/mUjby/YInDVwkiBA==", "dcmRY");
        llllIlIlIlIl[llllIlIllIlI[7]] = lIIlIIIlIIIIIIl("KAYDJ1EYVAA/AQ==", "ktbPv");
        llllIlIlIlIl[llllIlIllIlI[8]] = lIIlIIIlIIIIIlI("w4JYQEJzQjyCrqt4Se5w+A==", "NRGWP");
        llllIlIlIlIl[llllIlIllIlI[9]] = lIIlIIIlIIIIIIl("BSoPPjAzOQg7dTAgGg==", "ROmIU");
        llllIlIlIlIl[llllIlIllIlI[10]] = lIIlIIIIlllllll("fQs7yb6FZes=", "Bxgob");
        llllIlIlIlIl[llllIlIllIlI[11]] = lIIlIIIlIIIIIlI("pCkD5QHXeX4=", "DNRuX");
    }

    private EnumC0027x(String str, int i, String str2) {
        this.itemName = str2;
    }

    private static String lIIlIIIlIIIIIIl(String lllllllllllllllIIlIllIIlIlIlIllI, String lllllllllllllllIIlIllIIlIlIllIlI) {
        String lllllllllllllllIIlIllIIlIlIlIllI2 = new String(Base64.getDecoder().decode(lllllllllllllllIIlIllIIlIlIlIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIllIIlIlIllIIl = new StringBuilder();
        char[] lllllllllllllllIIlIllIIlIlIllIII = lllllllllllllllIIlIllIIlIlIllIlI.toCharArray();
        int lllllllllllllllIIlIllIIlIlIlIlll = llllIlIllIlI[0];
        char[] charArray = lllllllllllllllIIlIllIIlIlIlIllI2.toCharArray();
        int length = charArray.length;
        int i = llllIlIllIlI[0];
        while (lIIlIIIlIIIlIlI(i, length)) {
            char lllllllllllllllIIlIllIIlIlIlllII = charArray[i];
            lllllllllllllllIIlIllIIlIlIllIIl.append((char) (lllllllllllllllIIlIllIIlIlIlllII ^ lllllllllllllllIIlIllIIlIlIllIII[lllllllllllllllIIlIllIIlIlIlIlll % lllllllllllllllIIlIllIIlIlIllIII.length]));
            "".length();
            lllllllllllllllIIlIllIIlIlIlIlll++;
            i++;
            "".length();
            if ((-"  ".length()) > 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIlIllIIlIlIllIIl);
    }

    private static String lIIlIIIIlllllll(String lllllllllllllllIIlIllIIlIlIIIllI, String lllllllllllllllIIlIllIIlIlIIIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIIlIlIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llllIlIllIlI[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIIlIlIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIllIIlIlIIIlll) {
            lllllllllllllllIIlIllIIlIlIIIlll.printStackTrace();
            return null;
        }
    }

    private static String lIIlIIIlIIIIIlI(String lllllllllllllllIIlIllIIlIIlllIIl, String lllllllllllllllIIlIllIIlIIlllIII) {
        try {
            SecretKeySpec lllllllllllllllIIlIllIIlIIllllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIIlIIlllIII.getBytes(StandardCharsets.UTF_8)), llllIlIllIlI[8]), "DES");
            Cipher lllllllllllllllIIlIllIIlIIlllIll = Cipher.getInstance("DES");
            lllllllllllllllIIlIllIIlIIlllIll.init(llllIlIllIlI[2], lllllllllllllllIIlIllIIlIIllllII);
            return new String(lllllllllllllllIIlIllIIlIIlllIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIIlIIlllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIllIIlIIlllIlI) {
            lllllllllllllllIIlIllIIlIIlllIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIIlIIIlIlI(int i, int i2) {
        return i < i2;
    }

    public static EnumC0027x valueOf(String str) {
        return (EnumC0027x) Enum.valueOf(EnumC0027x.class, str);
    }
}
