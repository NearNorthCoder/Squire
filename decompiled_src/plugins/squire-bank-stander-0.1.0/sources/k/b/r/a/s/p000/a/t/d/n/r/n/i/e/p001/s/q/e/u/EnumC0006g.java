package k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.g  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-bank-stander-0.1.0.jar:k/b/r/a/s/-/a/t/d/n/r/n/i/e/-/s/q/e/u/g.class */
public final class EnumC0006g {
    public static final /* synthetic */ EnumC0006g ADAMANT;
    private static /* synthetic */ String[] lllIIllIlII;
    public static final /* synthetic */ EnumC0006g BRONZE;
    public static final /* synthetic */ EnumC0006g STEEL;
    private static final /* synthetic */ EnumC0006g[] $VALUES;
    public static final /* synthetic */ EnumC0006g MITHRIL;
    public static final /* synthetic */ EnumC0006g DRAGON;
    private final /* synthetic */ int boltTipId;
    public static final /* synthetic */ EnumC0006g BROAD;
    public static final /* synthetic */ EnumC0006g IRON;
    private static /* synthetic */ int[] lllIIllIlIl;
    public static final /* synthetic */ EnumC0006g RUNE;

    private static boolean lIlIlllIlIIIlI(int i, int i2) {
        return i < i2;
    }

    private static String lIlIlllIIllllI(String llllllllllllllllIIlIIlllIlIIlllI, String llllllllllllllllIIlIIlllIlIIllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIlllIlIIllIl.getBytes(StandardCharsets.UTF_8)), lllIIllIlIl[16]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIIllIlIl[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIlllIlIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIIlllIlIIllll) {
            llllllllllllllllIIlIIlllIlIIllll.printStackTrace();
            return null;
        }
    }

    public int y() {
        return this.boltTipId;
    }

    private static void lIlIlllIlIIIII() {
        lllIIllIlII = new String[lllIIllIlIl[16]];
        lllIIllIlII[lllIIllIlIl[0]] = lIlIlllIIlllIl("DB8oKSsL", "NMggq");
        lllIIllIlII[lllIIllIlIl[2]] = lIlIlllIIllllI("/ADv8xCFNjk=", "UEmoL");
        lllIIllIlII[lllIIllIlIl[4]] = lIlIlllIIllllI("VcaNKaHRCVw=", "wGPMK");
        lllIIllIlII[lllIIllIlIl[6]] = lIlIlllIIlllIl("KgcOKgAuAg==", "gNZbR");
        lllIIllIlII[lllIIllIlIl[8]] = lIlIlllIIlllll("rm7NcOgOmzU=", "CTItS");
        lllIIllIlII[lllIIllIlIl[10]] = lIlIlllIIlllll("r+m+iwEFmbU=", "gIvNt");
        lllIIllIlII[lllIIllIlIl[12]] = lIlIlllIIlllll("DHYzS4FLH8M=", "VQhwW");
        lllIIllIlII[lllIIllIlIl[14]] = lIlIlllIIlllll("2gGr94XBHwg=", "judOq");
    }

    private static void lIlIlllIlIIIIl() {
        lllIIllIlIl = new int[17];
        lllIIllIlIl[0] = (21 ^ 51) & ((140 ^ 170) ^ (-1));
        lllIIllIlIl[1] = (-545) & 9919;
        lllIIllIlIl[2] = " ".length();
        lllIIllIlIl[3] = (-4423) & 13799;
        lllIIllIlIl[4] = "  ".length();
        lllIIllIlIl[5] = (-22793) & 32170;
        lllIIllIlIl[6] = "   ".length();
        lllIIllIlIl[7] = (-22809) & 32187;
        lllIIllIlIl[8] = (254 ^ 162) ^ (42 ^ 114);
        lllIIllIlIl[9] = (-23067) & 32446;
        lllIIllIlIl[10] = 127 ^ 122;
        lllIIllIlIl[11] = (-19265) & 28645;
        lllIIllIlIl[12] = 141 ^ 139;
        lllIIllIlIl[13] = (-20891) & 32766;
        lllIIllIlIl[14] = (108 ^ 105) ^ "  ".length();
        lllIIllIlIl[15] = (-2561) & 24490;
        lllIIllIlIl[16] = 85 ^ 93;
    }

    public static EnumC0006g valueOf(String str) {
        return (EnumC0006g) Enum.valueOf(EnumC0006g.class, str);
    }

    static {
        lIlIlllIlIIIIl();
        lIlIlllIlIIIII();
        BRONZE = new EnumC0006g(lllIIllIlII[lllIIllIlIl[0]], lllIIllIlIl[0], lllIIllIlIl[1]);
        IRON = new EnumC0006g(lllIIllIlII[lllIIllIlIl[2]], lllIIllIlIl[2], lllIIllIlIl[3]);
        STEEL = new EnumC0006g(lllIIllIlII[lllIIllIlIl[4]], lllIIllIlIl[4], lllIIllIlIl[5]);
        MITHRIL = new EnumC0006g(lllIIllIlII[lllIIllIlIl[6]], lllIIllIlIl[6], lllIIllIlIl[7]);
        ADAMANT = new EnumC0006g(lllIIllIlII[lllIIllIlIl[8]], lllIIllIlIl[8], lllIIllIlIl[9]);
        RUNE = new EnumC0006g(lllIIllIlII[lllIIllIlIl[10]], lllIIllIlIl[10], lllIIllIlIl[11]);
        BROAD = new EnumC0006g(lllIIllIlII[lllIIllIlIl[12]], lllIIllIlIl[12], lllIIllIlIl[13]);
        DRAGON = new EnumC0006g(lllIIllIlII[lllIIllIlIl[14]], lllIIllIlIl[14], lllIIllIlIl[15]);
        EnumC0006g[] enumC0006gArr = new EnumC0006g[lllIIllIlIl[16]];
        enumC0006gArr[lllIIllIlIl[0]] = BRONZE;
        enumC0006gArr[lllIIllIlIl[2]] = IRON;
        enumC0006gArr[lllIIllIlIl[4]] = STEEL;
        enumC0006gArr[lllIIllIlIl[6]] = MITHRIL;
        enumC0006gArr[lllIIllIlIl[8]] = ADAMANT;
        enumC0006gArr[lllIIllIlIl[10]] = RUNE;
        enumC0006gArr[lllIIllIlIl[12]] = BROAD;
        enumC0006gArr[lllIIllIlIl[14]] = DRAGON;
        $VALUES = enumC0006gArr;
    }

    private static String lIlIlllIIlllIl(String llllllllllllllllIIlIIlllIllIIIll, String llllllllllllllllIIlIIlllIllIIIlI) {
        String llllllllllllllllIIlIIlllIllIIIll2 = new String(Base64.getDecoder().decode(llllllllllllllllIIlIIlllIllIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlIIlllIllIIIIl = new StringBuilder();
        char[] llllllllllllllllIIlIIlllIllIIIII = llllllllllllllllIIlIIlllIllIIIlI.toCharArray();
        int llllllllllllllllIIlIIlllIlIlllll = lllIIllIlIl[0];
        char[] charArray = llllllllllllllllIIlIIlllIllIIIll2.toCharArray();
        int length = charArray.length;
        int i = lllIIllIlIl[0];
        while (lIlIlllIlIIIlI(i, length)) {
            llllllllllllllllIIlIIlllIllIIIIl.append((char) (charArray[i] ^ llllllllllllllllIIlIIlllIllIIIII[llllllllllllllllIIlIIlllIlIlllll % llllllllllllllllIIlIIlllIllIIIII.length]));
            "".length();
            llllllllllllllllIIlIIlllIlIlllll++;
            i++;
            "".length();
            if ("   ".length() != "   ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllIIlIIlllIllIIIIl);
    }

    public static EnumC0006g[] values() {
        return (EnumC0006g[]) $VALUES.clone();
    }

    private EnumC0006g(String str, int i, int i2) {
        this.boltTipId = i2;
    }

    private static String lIlIlllIIlllll(String llllllllllllllllIIlIIlllIlllIIll, String llllllllllllllllIIlIIlllIlllIIlI) {
        try {
            SecretKeySpec llllllllllllllllIIlIIlllIlllIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIlllIlllIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIIllIlIl[4], llllllllllllllllIIlIIlllIlllIllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIlllIlllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIIlllIlllIlII) {
            llllllllllllllllIIlIIlllIlllIlII.printStackTrace();
            return null;
        }
    }
}
