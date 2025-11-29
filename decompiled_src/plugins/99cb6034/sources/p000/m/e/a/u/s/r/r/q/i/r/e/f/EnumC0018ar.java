package p000.m.e.a.u.s.r.r.q.i.r.e.f;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: -.m.e.a.u.s.r.r.q.i.r.e.f.ar  reason: invalid package and case insensitive filesystem */
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:-/m/e/a/u/s/r/r/q/i/r/e/f/ar.class */
public final class EnumC0018ar implements InterfaceC0023aw {
    private final /* synthetic */ EnumC0022av produceSeed;
    private static /* synthetic */ int[] lIlllIIIIlll;
    public static final /* synthetic */ EnumC0018ar NASTURTIUM;
    public static final /* synthetic */ EnumC0018ar LIMPWURT;
    private static /* synthetic */ String[] lIlllIIIIllI;
    public static final /* synthetic */ EnumC0018ar MARIGOLD;
    public static final /* synthetic */ EnumC0018ar NOTHING;
    public static final /* synthetic */ EnumC0018ar DEFAULT;
    private static final /* synthetic */ EnumC0018ar[] $VALUES;

    private static void lllIlIlIllllIl() {
        lIlllIIIIllI = new String[lIlllIIIIlll[5]];
        lIlllIIIIllI[lIlllIIIIlll[0]] = lllIlIlIlllIlI("Oy4HPxs7Jg==", "uaSwR");
        lIlllIIIIllI[lIlllIIIIlll[1]] = lllIlIlIlllIll("rooKVI6FV84=", "qYiNU");
        lIlllIIIIllI[lIlllIIIIlll[2]] = lllIlIlIlllIlI("FDshMDcWNjc=", "Yzsyp");
        lIlllIIIIllI[lIlllIIIIlll[3]] = lllIlIlIlllIlI("DCIJLRgQNxMsAA==", "BcZyM");
        lIlllIIIIllI[lIlllIIIIlll[4]] = lllIlIlIllllII("/XnvgxAk+PDzzwNtJJicLQ==", "KQbwl");
    }

    private static boolean lllIlIllIIIIII(int i, int i2) {
        return i < i2;
    }

    private static String lllIlIlIllllII(String lllllllllllllllIlIllIlllllllllIl, String lllllllllllllllIlIllIlllllllllII) {
        try {
            SecretKeySpec lllllllllllllllIlIlllIIIIIIIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIlllllllllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlllIIIIlll[2], lllllllllllllllIlIlllIIIIIIIIIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIlllllllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIllIllllllllllI) {
            lllllllllllllllIlIllIllllllllllI.printStackTrace();
            return null;
        }
    }

    static {
        lllIlIlIllllll();
        lllIlIlIllllIl();
        NOTHING = new EnumC0018ar(lIlllIIIIllI[lIlllIIIIlll[0]], lIlllIIIIlll[0], null);
        DEFAULT = new EnumC0018ar(lIlllIIIIllI[lIlllIIIIlll[1]], lIlllIIIIlll[1], EnumC0022av.DEFAULT);
        MARIGOLD = new EnumC0018ar(lIlllIIIIllI[lIlllIIIIlll[2]], lIlllIIIIlll[2], EnumC0022av.MARIGOLD);
        NASTURTIUM = new EnumC0018ar(lIlllIIIIllI[lIlllIIIIlll[3]], lIlllIIIIlll[3], EnumC0022av.NASTURTIUM);
        LIMPWURT = new EnumC0018ar(lIlllIIIIllI[lIlllIIIIlll[4]], lIlllIIIIlll[4], EnumC0022av.LIMPWURT);
        EnumC0018ar[] enumC0018arArr = new EnumC0018ar[lIlllIIIIlll[5]];
        enumC0018arArr[lIlllIIIIlll[0]] = NOTHING;
        enumC0018arArr[lIlllIIIIlll[1]] = DEFAULT;
        enumC0018arArr[lIlllIIIIlll[2]] = MARIGOLD;
        enumC0018arArr[lIlllIIIIlll[3]] = NASTURTIUM;
        enumC0018arArr[lIlllIIIIlll[4]] = LIMPWURT;
        $VALUES = enumC0018arArr;
    }

    private static String lllIlIlIlllIll(String lllllllllllllllIlIlllIIIIIlIIIlI, String lllllllllllllllIlIlllIIIIIlIIIIl) {
        try {
            SecretKeySpec lllllllllllllllIlIlllIIIIIlIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllIIIIIlIIIIl.getBytes(StandardCharsets.UTF_8)), lIlllIIIIlll[6]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlllIIIIlll[2], lllllllllllllllIlIlllIIIIIlIIlIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllIIIIIlIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlllIIIIIlIIIll) {
            lllllllllllllllIlIlllIIIIIlIIIll.printStackTrace();
            return null;
        }
    }

    @Override // p000.m.e.a.u.s.r.r.q.i.r.e.f.InterfaceC0023aw
    public EnumC0022av bf() {
        return this.produceSeed;
    }

    private EnumC0018ar(String str, int i, EnumC0022av enumC0022av) {
        this.produceSeed = enumC0022av;
    }

    private static String lllIlIlIlllIlI(String lllllllllllllllIlIlllIIIIIIlIIlI, String lllllllllllllllIlIlllIIIIIIlIIIl) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlIlllIIIIIIlIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIlllIIIIIIlIIII = new StringBuilder();
        char[] lllllllllllllllIlIlllIIIIIIIllll = lllllllllllllllIlIlllIIIIIIlIIIl.toCharArray();
        int lllllllllllllllIlIlllIIIIIIIlllI = lIlllIIIIlll[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int lllllllllllllllIlIlllIIIIIIIIllI = lIlllIIIIlll[0];
        while (lllIlIllIIIIII(lllllllllllllllIlIlllIIIIIIIIllI, length)) {
            lllllllllllllllIlIlllIIIIIIlIIII.append((char) (charArray[lllllllllllllllIlIlllIIIIIIIIllI] ^ lllllllllllllllIlIlllIIIIIIIllll[lllllllllllllllIlIlllIIIIIIIlllI % lllllllllllllllIlIlllIIIIIIIllll.length]));
            "".length();
            lllllllllllllllIlIlllIIIIIIIlllI++;
            lllllllllllllllIlIlllIIIIIIIIllI++;
            "".length();
            if ((((123 ^ 52) ^ (70 ^ 23)) & (((((58 + 73) - 120) + 128) ^ (((106 + 44) - 96) + 95)) ^ (-" ".length()))) > "  ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIlllIIIIIIlIIII);
    }

    public static EnumC0018ar valueOf(String str) {
        return (EnumC0018ar) Enum.valueOf(EnumC0018ar.class, str);
    }

    private static void lllIlIlIllllll() {
        lIlllIIIIlll = new int[7];
        lIlllIIIIlll[0] = (67 ^ 11) & ((241 ^ 185) ^ (-1));
        lIlllIIIIlll[1] = " ".length();
        lIlllIIIIlll[2] = "  ".length();
        lIlllIIIIlll[3] = "   ".length();
        lIlllIIIIlll[4] = (108 ^ 125) ^ (215 ^ 194);
        lIlllIIIIlll[5] = (30 ^ 14) ^ (28 ^ 9);
        lIlllIIIIlll[6] = (168 ^ 167) ^ (103 ^ 96);
    }

    public static EnumC0018ar[] values() {
        return (EnumC0018ar[]) $VALUES.clone();
    }
}
