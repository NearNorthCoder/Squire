package k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.n  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-bank-stander-0.1.0.jar:k/b/r/a/s/-/a/t/d/n/r/n/i/e/-/s/q/e/u/n.class */
public final class EnumC0013n {
    public static final /* synthetic */ EnumC0013n CANDLE_LANTERN;
    public static final /* synthetic */ EnumC0013n LIGHT_ORB;
    private final /* synthetic */ int craftingOption;
    private static /* synthetic */ int[] lllIIllIIll;
    private static /* synthetic */ String[] lllIIllIIlI;
    private static final /* synthetic */ EnumC0013n[] $VALUES;
    public static final /* synthetic */ EnumC0013n UNPOWERED_STAFF_ORB;
    public static final /* synthetic */ EnumC0013n VIAL;
    public static final /* synthetic */ EnumC0013n FISHBOWL;
    private final /* synthetic */ int materialID;
    public static final /* synthetic */ EnumC0013n BEER_GLASS;
    public static final /* synthetic */ EnumC0013n LANTERN_LENS;
    public static final /* synthetic */ EnumC0013n OIL_LAMP;
    private final /* synthetic */ int finishedID;

    static {
        lIlIlllIIllIll();
        lIlIlllIIllIlI();
        BEER_GLASS = new EnumC0013n(lllIIllIIlI[lllIIllIIll[0]], lllIIllIIll[0], lllIIllIIll[1], lllIIllIIll[2], lllIIllIIll[3]);
        CANDLE_LANTERN = new EnumC0013n(lllIIllIIlI[lllIIllIIll[3]], lllIIllIIll[3], lllIIllIIll[1], lllIIllIIll[4], lllIIllIIll[5]);
        OIL_LAMP = new EnumC0013n(lllIIllIIlI[lllIIllIIll[5]], lllIIllIIll[5], lllIIllIIll[1], lllIIllIIll[6], lllIIllIIll[7]);
        VIAL = new EnumC0013n(lllIIllIIlI[lllIIllIIll[7]], lllIIllIIll[7], lllIIllIIll[1], lllIIllIIll[8], lllIIllIIll[9]);
        FISHBOWL = new EnumC0013n(lllIIllIIlI[lllIIllIIll[9]], lllIIllIIll[9], lllIIllIIll[1], lllIIllIIll[10], lllIIllIIll[11]);
        UNPOWERED_STAFF_ORB = new EnumC0013n(lllIIllIIlI[lllIIllIIll[11]], lllIIllIIll[11], lllIIllIIll[1], lllIIllIIll[12], lllIIllIIll[13]);
        LANTERN_LENS = new EnumC0013n(lllIIllIIlI[lllIIllIIll[13]], lllIIllIIll[13], lllIIllIIll[1], lllIIllIIll[14], lllIIllIIll[15]);
        LIGHT_ORB = new EnumC0013n(lllIIllIIlI[lllIIllIIll[15]], lllIIllIIll[15], lllIIllIIll[1], lllIIllIIll[16], lllIIllIIll[17]);
        EnumC0013n[] enumC0013nArr = new EnumC0013n[lllIIllIIll[17]];
        enumC0013nArr[lllIIllIIll[0]] = BEER_GLASS;
        enumC0013nArr[lllIIllIIll[3]] = CANDLE_LANTERN;
        enumC0013nArr[lllIIllIIll[5]] = OIL_LAMP;
        enumC0013nArr[lllIIllIIll[7]] = VIAL;
        enumC0013nArr[lllIIllIIll[9]] = FISHBOWL;
        enumC0013nArr[lllIIllIIll[11]] = UNPOWERED_STAFF_ORB;
        enumC0013nArr[lllIIllIIll[13]] = LANTERN_LENS;
        enumC0013nArr[lllIIllIIll[15]] = LIGHT_ORB;
        $VALUES = enumC0013nArr;
    }

    public static EnumC0013n valueOf(String str) {
        return (EnumC0013n) Enum.valueOf(EnumC0013n.class, str);
    }

    private static String lIlIlllIIllIII(String llllllllllllllllIIlIIllllIIIIlII, String llllllllllllllllIIlIIllllIIIIIll) {
        try {
            SecretKeySpec llllllllllllllllIIlIIllllIIIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIllllIIIIIll.getBytes(StandardCharsets.UTF_8)), lllIIllIIll[17]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIIllIIll[5], llllllllllllllllIIlIIllllIIIIlll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIllllIIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIIllllIIIIlIl) {
            llllllllllllllllIIlIIllllIIIIlIl.printStackTrace();
            return null;
        }
    }

    private static String lIlIlllIIllIIl(String llllllllllllllllIIlIIllllIIlIIIl, String llllllllllllllllIIlIIllllIIlIIII) {
        try {
            SecretKeySpec llllllllllllllllIIlIIllllIIlIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIllllIIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIIllIIll[5], llllllllllllllllIIlIIllllIIlIlII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIllllIIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIIllllIIlIIlI) {
            llllllllllllllllIIlIIllllIIlIIlI.printStackTrace();
            return null;
        }
    }

    private static String lIlIlllIIlIlll(String llllllllllllllllIIlIIllllIlIIllI, String llllllllllllllllIIlIIllllIlIIlIl) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllIIlIIllllIlIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlIIllllIlIIlII = new StringBuilder();
        char[] llllllllllllllllIIlIIllllIlIIIll = llllllllllllllllIIlIIllllIlIIlIl.toCharArray();
        int llllllllllllllllIIlIIllllIlIIIlI = lllIIllIIll[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lllIIllIIll[0];
        while (lIlIlllIIlllII(i, length)) {
            char llllllllllllllllIIlIIllllIlIIlll = charArray[i];
            llllllllllllllllIIlIIllllIlIIlII.append((char) (llllllllllllllllIIlIIllllIlIIlll ^ llllllllllllllllIIlIIllllIlIIIll[llllllllllllllllIIlIIllllIlIIIlI % llllllllllllllllIIlIIllllIlIIIll.length]));
            "".length();
            llllllllllllllllIIlIIllllIlIIIlI++;
            i++;
            "".length();
            if (" ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllIIlIIllllIlIIlII);
    }

    private static void lIlIlllIIllIlI() {
        lllIIllIIlI = new String[lllIIllIIll[17]];
        lllIIllIIlI[lllIIllIIll[0]] = lIlIlllIIlIlll("KyQ9ES4uLTkQIg==", "iaxCq");
        lllIIllIIlI[lllIIllIIll[3]] = lIlIlllIIllIII("VTGWEt/EqH2aTkIdngX4UQ==", "efQfD");
        lllIIllIIlI[lllIIllIIll[5]] = lIlIlllIIlIlll("OyMdNQk1JwE=", "tjQjE");
        lllIIllIIlI[lllIIllIIll[7]] = lIlIlllIIlIlll("PBMRBg==", "jZPJN");
        lllIIllIIlI[lllIIllIIll[9]] = lIlIlllIIlIlll("MSESHAU4Pw0=", "whATG");
        lllIIllIIlI[lllIIllIIll[11]] = lIlIlllIIlIlll("OzwTHj8rIAYVNz0mAhcuMT0REw==", "nrCQh");
        lllIIllIIlI[lllIIllIIll[13]] = lIlIlllIIllIII("fLWKltYPxFK3A33DKKl4IQ==", "Tmisz");
        lllIIllIIlI[lllIIllIIll[15]] = lIlIlllIIllIIl("Vq54dG9ZRNnpwVetmXytnA==", "OFHiD");
    }

    private static boolean lIlIlllIIlllII(int i, int i2) {
        return i < i2;
    }

    public int C() {
        return this.craftingOption;
    }

    private static void lIlIlllIIllIll() {
        lllIIllIIll = new int[18];
        lllIIllIIll[0] = (93 ^ 75) & ((8 ^ 30) ^ (-1));
        lllIIllIIll[1] = (-24593) & 26367;
        lllIIllIIll[2] = (-((-22127) & 32495)) & (-16385) & 28671;
        lllIIllIIll[3] = " ".length();
        lllIIllIIll[4] = (-((-6279) & 31959)) & (-2561) & 32767;
        lllIIllIIll[5] = "  ".length();
        lllIIllIIll[6] = (-((-23001) & 24539)) & (-24641) & 30703;
        lllIIllIIll[7] = "   ".length();
        lllIIllIIll[8] = (((((110 + 11) - 119) + 190) + (2 ^ 24)) - (((72 + 9) - 27) + 74)) + ((29 + 41) - (-68)) + 1;
        lllIIllIIll[9] = 18 ^ 22;
        lllIIllIIll[10] = (-((-2565) & 28583)) & (-65) & 32750;
        lllIIllIIll[11] = (43 ^ 125) ^ (254 ^ 173);
        lllIIllIIll[12] = (-7553) & 8119;
        lllIIllIIll[13] = 40 ^ 46;
        lllIIllIIll[14] = (-18498) & 23039;
        lllIIllIIll[15] = (((158 + 131) - 162) + 71) ^ (((72 + 93) - 55) + 83);
        lllIIllIIll[16] = (-((-10367) & 31871)) & (-259) & 32735;
        lllIIllIIll[17] = 98 ^ 106;
    }

    public int z() {
        return this.materialID;
    }

    private EnumC0013n(String str, int i, int i2, int i3, int i4) {
        this.materialID = i2;
        this.finishedID = i3;
        this.craftingOption = i4;
    }

    public int E() {
        return this.finishedID;
    }

    public static EnumC0013n[] values() {
        return (EnumC0013n[]) $VALUES.clone();
    }
}
