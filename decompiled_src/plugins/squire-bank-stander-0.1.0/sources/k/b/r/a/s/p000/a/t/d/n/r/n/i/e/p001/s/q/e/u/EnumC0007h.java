package k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.h  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-bank-stander-0.1.0.jar:k/b/r/a/s/-/a/t/d/n/r/n/i/e/-/s/q/e/u/h.class */
public final class EnumC0007h {
    public static final /* synthetic */ EnumC0007h YEW_LONGBOW;
    public static final /* synthetic */ EnumC0007h YEW_SHORTBOW;
    public static final /* synthetic */ EnumC0007h WILLOW_LONGBOW;
    public static final /* synthetic */ EnumC0007h MAPLE_SHORTBOW;
    public static final /* synthetic */ EnumC0007h MAPLE_LONGBOW;
    private static /* synthetic */ String[] lllIIIlIIlI;
    public static final /* synthetic */ EnumC0007h MAGIC_SHORTBOW;
    public static final /* synthetic */ EnumC0007h OAK_SHORTBOW;
    public static final /* synthetic */ EnumC0007h OAK_LONGBOW;
    public static final /* synthetic */ EnumC0007h SHORTBOW;
    public static final /* synthetic */ EnumC0007h LONGBOW;
    private static final /* synthetic */ EnumC0007h[] $VALUES;
    public static final /* synthetic */ EnumC0007h WILLOW_SHORTBOW;
    private static /* synthetic */ int[] lllIIIlIIll;
    private final /* synthetic */ int materialID;
    public static final /* synthetic */ EnumC0007h MAGIC_LONGBOW;

    public static EnumC0007h valueOf(String str) {
        return (EnumC0007h) Enum.valueOf(EnumC0007h.class, str);
    }

    private EnumC0007h(String str, int i, int i2) {
        this.materialID = i2;
    }

    private static String lIlIllIIlllIII(String llllllllllllllllIIlIlIIlllIlIIlI, String llllllllllllllllIIlIlIIlllIlIIIl) {
        try {
            SecretKeySpec llllllllllllllllIIlIlIIlllIlIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlIIlllIlIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlIlIIlllIlIlII = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlIlIIlllIlIlII.init(lllIIIlIIll[4], llllllllllllllllIIlIlIIlllIlIlIl);
            return new String(llllllllllllllllIIlIlIIlllIlIlII.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlIIlllIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIlIIlllIlIIll) {
            llllllllllllllllIIlIlIIlllIlIIll.printStackTrace();
            return null;
        }
    }

    static {
        lIlIllIIlllIll();
        lIlIllIIlllIlI();
        SHORTBOW = new EnumC0007h(lllIIIlIIlI[lllIIIlIIll[0]], lllIIIlIIll[0], lllIIIlIIll[1]);
        LONGBOW = new EnumC0007h(lllIIIlIIlI[lllIIIlIIll[2]], lllIIIlIIll[2], lllIIIlIIll[3]);
        OAK_SHORTBOW = new EnumC0007h(lllIIIlIIlI[lllIIIlIIll[4]], lllIIIlIIll[4], lllIIIlIIll[5]);
        OAK_LONGBOW = new EnumC0007h(lllIIIlIIlI[lllIIIlIIll[6]], lllIIIlIIll[6], lllIIIlIIll[7]);
        WILLOW_SHORTBOW = new EnumC0007h(lllIIIlIIlI[lllIIIlIIll[8]], lllIIIlIIll[8], lllIIIlIIll[9]);
        WILLOW_LONGBOW = new EnumC0007h(lllIIIlIIlI[lllIIIlIIll[10]], lllIIIlIIll[10], lllIIIlIIll[11]);
        MAPLE_SHORTBOW = new EnumC0007h(lllIIIlIIlI[lllIIIlIIll[12]], lllIIIlIIll[12], lllIIIlIIll[13]);
        MAPLE_LONGBOW = new EnumC0007h(lllIIIlIIlI[lllIIIlIIll[14]], lllIIIlIIll[14], lllIIIlIIll[15]);
        YEW_SHORTBOW = new EnumC0007h(lllIIIlIIlI[lllIIIlIIll[16]], lllIIIlIIll[16], lllIIIlIIll[17]);
        YEW_LONGBOW = new EnumC0007h(lllIIIlIIlI[lllIIIlIIll[18]], lllIIIlIIll[18], lllIIIlIIll[19]);
        MAGIC_SHORTBOW = new EnumC0007h(lllIIIlIIlI[lllIIIlIIll[20]], lllIIIlIIll[20], lllIIIlIIll[21]);
        MAGIC_LONGBOW = new EnumC0007h(lllIIIlIIlI[lllIIIlIIll[22]], lllIIIlIIll[22], lllIIIlIIll[23]);
        EnumC0007h[] enumC0007hArr = new EnumC0007h[lllIIIlIIll[24]];
        enumC0007hArr[lllIIIlIIll[0]] = SHORTBOW;
        enumC0007hArr[lllIIIlIIll[2]] = LONGBOW;
        enumC0007hArr[lllIIIlIIll[4]] = OAK_SHORTBOW;
        enumC0007hArr[lllIIIlIIll[6]] = OAK_LONGBOW;
        enumC0007hArr[lllIIIlIIll[8]] = WILLOW_SHORTBOW;
        enumC0007hArr[lllIIIlIIll[10]] = WILLOW_LONGBOW;
        enumC0007hArr[lllIIIlIIll[12]] = MAPLE_SHORTBOW;
        enumC0007hArr[lllIIIlIIll[14]] = MAPLE_LONGBOW;
        enumC0007hArr[lllIIIlIIll[16]] = YEW_SHORTBOW;
        enumC0007hArr[lllIIIlIIll[18]] = YEW_LONGBOW;
        enumC0007hArr[lllIIIlIIll[20]] = MAGIC_SHORTBOW;
        enumC0007hArr[lllIIIlIIll[22]] = MAGIC_LONGBOW;
        $VALUES = enumC0007hArr;
    }

    private static void lIlIllIIlllIlI() {
        lllIIIlIIlI = new String[lllIIIlIIll[24]];
        lllIIIlIIlI[lllIIIlIIll[0]] = lIlIllIIllIlll("7WcEj2XEWYHD9lpp6QcLvg==", "OZJoE");
        lllIIIlIIlI[lllIIIlIIll[2]] = lIlIllIIlllIII("3pU4PahEdOQ=", "hBVVi");
        lllIIIlIIlI[lllIIIlIIll[4]] = lIlIllIIlllIII("ANSVCKzIGrbsNG6YiIIrLA==", "BgThM");
        lllIIIlIIlI[lllIIIlIIll[6]] = lIlIllIIlllIIl("BQI8BicFDTAbJB0=", "JCwYk");
        lllIIIlIIlI[lllIIIlIIll[8]] = lIlIllIIlllIII("a+g1c8FBu13OTJEQLAJKvA==", "zYCjH");
        lllIIIlIIlI[lllIIIlIIll[10]] = lIlIllIIlllIIl("Mg4GLhUyGAYtFCIFBTU=", "eGJbZ");
        lllIIIlIIlI[lllIIIlIIll[12]] = lIlIllIIllIlll("GA1lVStGNSejf9/xMlhJqA==", "QwQcF");
        lllIIIlIIlI[lllIIIlIIll[14]] = lIlIllIIlllIIl("KzYyDTQ5Oy0PNiQ4NQ==", "fwbAq");
        lllIIIlIIlI[lllIIIlIIll[16]] = lIlIllIIlllIIl("ERYENj8AHAE9LgcE", "HSSil");
        lllIIIlIIlI[lllIIIlIIll[18]] = lIlIllIIlllIIl("OyQwNBUtLyApFjU=", "bagkY");
        lllIIIlIIlI[lllIIIlIIll[20]] = lIlIllIIllIlll("qxQILgzU0TOniRyWv/wD9w==", "wyquR");
        lllIIIlIIlI[lllIIIlIIll[22]] = lIlIllIIlllIII("oWfTlKhj2Pn89M8nD7c7uw==", "TSmnp");
    }

    private static boolean lIlIllIIllllII(int i, int i2) {
        return i < i2;
    }

    private static String lIlIllIIlllIIl(String llllllllllllllllIIlIlIIlllllIlII, String llllllllllllllllIIlIlIIlllllIIll) {
        String llllllllllllllllIIlIlIIlllllIlII2 = new String(Base64.getDecoder().decode(llllllllllllllllIIlIlIIlllllIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlIlIIlllllIIlI = new StringBuilder();
        char[] llllllllllllllllIIlIlIIlllllIIIl = llllllllllllllllIIlIlIIlllllIIll.toCharArray();
        int llllllllllllllllIIlIlIIlllllIIII = lllIIIlIIll[0];
        char[] charArray = llllllllllllllllIIlIlIIlllllIlII2.toCharArray();
        int length = charArray.length;
        int i = lllIIIlIIll[0];
        while (lIlIllIIllllII(i, length)) {
            char llllllllllllllllIIlIlIIlllllIlIl = charArray[i];
            llllllllllllllllIIlIlIIlllllIIlI.append((char) (llllllllllllllllIIlIlIIlllllIlIl ^ llllllllllllllllIIlIlIIlllllIIIl[llllllllllllllllIIlIlIIlllllIIII % llllllllllllllllIIlIlIIlllllIIIl.length]));
            "".length();
            llllllllllllllllIIlIlIIlllllIIII++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllIIlIlIIlllllIIlI);
    }

    public int z() {
        return this.materialID;
    }

    public static EnumC0007h[] values() {
        return (EnumC0007h[]) $VALUES.clone();
    }

    private static String lIlIllIIllIlll(String llllllllllllllllIIlIlIIlllIlllll, String llllllllllllllllIIlIlIIlllIllllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlIIlllIllllI.getBytes(StandardCharsets.UTF_8)), lllIIIlIIll[16]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIIIlIIll[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlIIlllIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIlIIllllIIIII) {
            llllllllllllllllIIlIlIIllllIIIII.printStackTrace();
            return null;
        }
    }

    private static void lIlIllIIlllIll() {
        lllIIIlIIll = new int[25];
        lllIIIlIIll[0] = ((((153 + 181) - 225) + 96) ^ (((26 + 40) - 51) + 130)) & (((((30 + 157) - 1) + 10) ^ (((129 + 26) - 99) + 96)) ^ (-" ".length()));
        lllIIIlIIll[1] = 19 ^ 33;
        lllIIIlIIll[2] = " ".length();
        lllIIIlIIll[3] = "  ".length() ^ (43 ^ 25);
        lllIIIlIIll[4] = "  ".length();
        lllIIIlIIll[5] = (((75 + 91) - 94) + 86) ^ (((39 + 19) - 23) + 133);
        lllIIIlIIll[6] = "   ".length();
        lllIIIlIIll[7] = 44 ^ 20;
        lllIIIlIIll[8] = (37 ^ 112) ^ (50 ^ 99);
        lllIIIlIIll[9] = (98 ^ 103) ^ (123 ^ 66);
        lllIIIlIIll[10] = (210 ^ 128) ^ (93 ^ 10);
        lllIIIlIIll[11] = 248 ^ 194;
        lllIIIlIIll[12] = (((57 + 59) - 53) + 126) ^ (((147 + 32) - 127) + 135);
        lllIIIlIIll[13] = (9 ^ 80) ^ (105 ^ 112);
        lllIIIlIIll[14] = (50 ^ 31) ^ (64 ^ 106);
        lllIIIlIIll[15] = 191 ^ 129;
        lllIIIlIIll[16] = 134 ^ 142;
        lllIIIlIIll[17] = 9 ^ 77;
        lllIIIlIIll[18] = (120 ^ 62) ^ (198 ^ 137);
        lllIIIlIIll[19] = (219 ^ 139) ^ (178 ^ 160);
        lllIIIlIIll[20] = 191 ^ 181;
        lllIIIlIIll[21] = 243 ^ 187;
        lllIIIlIIll[22] = (((88 + 34) - 114) + 158) ^ (((118 + 58) - 64) + 61);
        lllIIIlIIll[23] = 128 ^ 198;
        lllIIIlIIll[24] = (105 ^ 84) ^ (66 ^ 115);
    }
}
