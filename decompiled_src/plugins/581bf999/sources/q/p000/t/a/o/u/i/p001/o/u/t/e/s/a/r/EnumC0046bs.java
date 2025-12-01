package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bs  reason: invalid package and case insensitive filesystem */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/bs.class */
final class EnumC0046bs {
    private static final /* synthetic */ EnumC0046bs[] $VALUES;
    private final /* synthetic */ int value;
    public static final /* synthetic */ EnumC0046bs TRIANGLE;
    public static final /* synthetic */ EnumC0046bs WIGGLE;
    private final /* synthetic */ int groundObjectId;
    public static final /* synthetic */ EnumC0046bs DIAMOND;
    public static final /* synthetic */ EnumC0046bs LINE;
    public static final /* synthetic */ EnumC0046bs BIRD;
    private static /* synthetic */ int[] lIllIlIIIll;
    public static final /* synthetic */ EnumC0046bs KNIVES;
    private static /* synthetic */ String[] lIllIlIIIIl;
    private final /* synthetic */ int gameObjectId;
    public static final /* synthetic */ EnumC0046bs HAND;
    public static final /* synthetic */ EnumC0046bs CROOK;
    public static final /* synthetic */ EnumC0046bs FOOT;

    public static EnumC0046bs[] values() {
        return (EnumC0046bs[]) $VALUES.clone();
    }

    static {
        lIIlIllIllIlll();
        lIIlIllIllIIll();
        LINE = new EnumC0046bs(lIllIlIIIIl[lIllIlIIIll[0]], lIllIlIIIll[0], lIllIlIIIll[1], lIllIlIIIll[2], lIllIlIIIll[3]);
        KNIVES = new EnumC0046bs(lIllIlIIIIl[lIllIlIIIll[1]], lIllIlIIIll[1], lIllIlIIIll[4], lIllIlIIIll[5], lIllIlIIIll[6]);
        TRIANGLE = new EnumC0046bs(lIllIlIIIIl[lIllIlIIIll[4]], lIllIlIIIll[4], lIllIlIIIll[7], lIllIlIIIll[8], lIllIlIIIll[9]);
        DIAMOND = new EnumC0046bs(lIllIlIIIIl[lIllIlIIIll[7]], lIllIlIIIll[7], lIllIlIIIll[10], lIllIlIIIll[11], lIllIlIIIll[12]);
        HAND = new EnumC0046bs(lIllIlIIIIl[lIllIlIIIll[10]], lIllIlIIIll[10], lIllIlIIIll[13], lIllIlIIIll[14], lIllIlIIIll[15]);
        BIRD = new EnumC0046bs(lIllIlIIIIl[lIllIlIIIll[13]], lIllIlIIIll[13], lIllIlIIIll[16], lIllIlIIIll[17], lIllIlIIIll[18]);
        CROOK = new EnumC0046bs(lIllIlIIIIl[lIllIlIIIll[16]], lIllIlIIIll[16], lIllIlIIIll[19], lIllIlIIIll[20], lIllIlIIIll[21]);
        WIGGLE = new EnumC0046bs(lIllIlIIIIl[lIllIlIIIll[19]], lIllIlIIIll[19], lIllIlIIIll[22], lIllIlIIIll[23], lIllIlIIIll[24]);
        FOOT = new EnumC0046bs(lIllIlIIIIl[lIllIlIIIll[22]], lIllIlIIIll[22], lIllIlIIIll[25], lIllIlIIIll[26], lIllIlIIIll[27]);
        EnumC0046bs[] enumC0046bsArr = new EnumC0046bs[lIllIlIIIll[25]];
        enumC0046bsArr[lIllIlIIIll[0]] = LINE;
        enumC0046bsArr[lIllIlIIIll[1]] = KNIVES;
        enumC0046bsArr[lIllIlIIIll[4]] = TRIANGLE;
        enumC0046bsArr[lIllIlIIIll[7]] = DIAMOND;
        enumC0046bsArr[lIllIlIIIll[10]] = HAND;
        enumC0046bsArr[lIllIlIIIll[13]] = BIRD;
        enumC0046bsArr[lIllIlIIIll[16]] = CROOK;
        enumC0046bsArr[lIllIlIIIll[19]] = WIGGLE;
        enumC0046bsArr[lIllIlIIIll[22]] = FOOT;
        $VALUES = enumC0046bsArr;
    }

    private static boolean lIIlIllIlllIII(int i, int i2) {
        return i < i2;
    }

    public static EnumC0046bs valueOf(String str) {
        return (EnumC0046bs) Enum.valueOf(EnumC0046bs.class, str);
    }

    private static String lIIlIllIllIIII(String llllllllllllllllIlIlIIlIIIllIIII, String llllllllllllllllIlIlIIlIIIlIllll) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllIlIlIIlIIIllIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIlIlIIlIIIlIlllI = new StringBuilder();
        char[] llllllllllllllllIlIlIIlIIIlIllIl = llllllllllllllllIlIlIIlIIIlIllll.toCharArray();
        int llllllllllllllllIlIlIIlIIIlIllII = lIllIlIIIll[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIllIlIIIll[0];
        while (lIIlIllIlllIII(i, length)) {
            char llllllllllllllllIlIlIIlIIIllIIIl = charArray[i];
            llllllllllllllllIlIlIIlIIIlIlllI.append((char) (llllllllllllllllIlIlIIlIIIllIIIl ^ llllllllllllllllIlIlIIlIIIlIllIl[llllllllllllllllIlIlIIlIIIlIllII % llllllllllllllllIlIlIIlIIIlIllIl.length]));
            "".length();
            llllllllllllllllIlIlIIlIIIlIllII++;
            i++;
            "".length();
            if (((133 ^ 168) ^ (101 ^ 76)) == "   ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllIlIlIIlIIIlIlllI);
    }

    private static String lIIlIllIllIIIl(String llllllllllllllllIlIlIIlIIIIllIll, String llllllllllllllllIlIlIIlIIIIllIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlIIlIIIIllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllIlIIIll[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlIIlIIIIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIlIIlIIIIlllII) {
            llllllllllllllllIlIlIIlIIIIlllII.printStackTrace();
            return null;
        }
    }

    private static void lIIlIllIllIIll() {
        lIllIlIIIIl = new String[lIllIlIIIll[25]];
        lIllIlIIIIl[lIllIlIIIll[0]] = lIIlIllIllIIII("ICMEFg==", "ljJSG");
        lIllIlIIIIl[lIllIlIIIll[1]] = lIIlIllIllIIIl("I+v8xp0+RSQ=", "MdPuQ");
        lIllIlIIIIl[lIllIlIIIll[4]] = lIIlIllIllIIIl("oUtuBC/64FGGKPe5n2h2FA==", "FfAIY");
        lIllIlIIIIl[lIllIlIIIll[7]] = lIIlIllIllIIIl("8A6CL7XIvOE=", "dKJEC");
        lIllIlIIIIl[lIllIlIIIll[10]] = lIIlIllIllIIlI("eBOFDKjyoIA=", "zVKSK");
        lIllIlIIIIl[lIllIlIIIll[13]] = lIIlIllIllIIlI("YyQuAuQeLQE=", "QOknB");
        lIllIlIIIIl[lIllIlIIIll[16]] = lIIlIllIllIIII("FBMEFho=", "WAKYQ");
        lIllIlIIIIl[lIllIlIIIll[19]] = lIIlIllIllIIII("LwwQLxk9", "xEWhU");
        lIllIlIIIIl[lIllIlIIIll[22]] = lIIlIllIllIIII("Mz8rDQ==", "updYO");
    }

    public int ci() {
        return this.gameObjectId;
    }

    public int cg() {
        return this.value;
    }

    private static void lIIlIllIllIlll() {
        lIllIlIIIll = new int[28];
        lIllIlIIIll[0] = ((124 ^ 99) ^ (102 ^ 62)) & (((21 ^ 114) ^ (132 ^ 164)) ^ (-" ".length()));
        lIllIlIIIll[1] = " ".length();
        lIllIlIIIll[2] = (-((-33) & 19709)) & (-515) & 65535;
        lIllIlIIIll[3] = (-3714) & 49101;
        lIllIlIIIll[4] = "  ".length();
        lIllIlIIIll[5] = (-((-28963) & 32635)) & (-5) & 49022;
        lIllIlIIIll[6] = (-((-14601) & 32699)) & (-1) & 63487;
        lIllIlIIIll[7] = "   ".length();
        lIllIlIIIll[8] = (-605) & 45951;
        lIllIlIIIll[9] = (-19985) & 65374;
        lIllIlIIIll[10] = 32 ^ 36;
        lIllIlIIIll[11] = (-((-8997) & 26478)) & (-131) & 62959;
        lIllIlIIIll[12] = (-3089) & 48479;
        lIllIlIIIll[13] = (((176 + 121) - 142) + 22) ^ (((17 + 67) - (-3)) + 93);
        lIllIlIIIll[14] = (-((-14893) & 32509)) & (-1) & 62965;
        lIllIlIIIll[15] = (-((-11066) & 27581)) & (-553) & 62459;
        lIllIlIIIll[16] = 53 ^ 51;
        lIllIlIIIll[17] = (-593) & 45942;
        lIllIlIIIll[18] = (-((-24659) & 26879)) & (-16385) & 63997;
        lIllIlIIIll[19] = (32 ^ 82) ^ (58 ^ 79);
        lIllIlIIIll[20] = (-1673) & 47023;
        lIllIlIIIll[21] = (-16518) & 61903;
        lIllIlIIIll[22] = 92 ^ 84;
        lIllIlIIIll[23] = (-((-970) & 3035)) & (-17475) & 64891;
        lIllIlIIIll[24] = (-3594) & 48987;
        lIllIlIIIll[25] = (((106 + 43) - 24) + 9) ^ (((142 + 76) - 206) + 131);
        lIllIlIIIll[26] = (-19667) & 65019;
        lIllIlIIIll[27] = (-" ".length()) & (-3205) & 48599;
    }

    public int ch() {
        return this.groundObjectId;
    }

    private EnumC0046bs(String str, int i, int i2, int i3, int i4) {
        this.value = i2;
        this.groundObjectId = i3;
        this.gameObjectId = i4;
    }

    private static String lIIlIllIllIIlI(String llllllllllllllllIlIlIIlIIIIIlllI, String llllllllllllllllIlIlIIlIIIIIllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlIIlIIIIIllIl.getBytes(StandardCharsets.UTF_8)), lIllIlIIIll[22]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIllIlIIIll[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlIIlIIIIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIlIIlIIIIIlIlI) {
            llllllllllllllllIlIlIIlIIIIIlIlI.printStackTrace();
            return null;
        }
    }
}
