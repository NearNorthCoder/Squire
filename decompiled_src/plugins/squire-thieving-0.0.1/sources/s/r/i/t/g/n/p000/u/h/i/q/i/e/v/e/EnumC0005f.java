package s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.f  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-thieving-0.0.1.jar:s/r/i/t/g/n/-/u/h/i/q/i/e/v/e/f.class */
public final class EnumC0005f {
    public static final /* synthetic */ EnumC0005f VYRE;
    public static final /* synthetic */ EnumC0005f ELF;
    public static final /* synthetic */ EnumC0005f MAN;
    private static final /* synthetic */ EnumC0005f[] $VALUES;
    private static /* synthetic */ int[] lIIlllIIlIllI;
    private static /* synthetic */ String[] lIIlllIIlIlIl;
    public static final /* synthetic */ EnumC0005f ARDY_KNIGHT;
    private final /* synthetic */ String name;
    public static final /* synthetic */ EnumC0005f MASTER_FARMER;
    public static final /* synthetic */ EnumC0005f TZHAAR;

    static {
        lIllIIllIIIlIlI();
        lIllIIllIIIlIIl();
        ARDY_KNIGHT = new EnumC0005f(lIIlllIIlIlIl[lIIlllIIlIllI[0]], lIIlllIIlIllI[0], lIIlllIIlIlIl[lIIlllIIlIllI[1]]);
        MASTER_FARMER = new EnumC0005f(lIIlllIIlIlIl[lIIlllIIlIllI[2]], lIIlllIIlIllI[1], lIIlllIIlIlIl[lIIlllIIlIllI[3]]);
        MAN = new EnumC0005f(lIIlllIIlIlIl[lIIlllIIlIllI[4]], lIIlllIIlIllI[2], lIIlllIIlIlIl[lIIlllIIlIllI[5]]);
        VYRE = new EnumC0005f(lIIlllIIlIlIl[lIIlllIIlIllI[6]], lIIlllIIlIllI[3], lIIlllIIlIlIl[lIIlllIIlIllI[7]]);
        ELF = new EnumC0005f(lIIlllIIlIlIl[lIIlllIIlIllI[8]], lIIlllIIlIllI[4], lIIlllIIlIlIl[lIIlllIIlIllI[9]]);
        TZHAAR = new EnumC0005f(lIIlllIIlIlIl[lIIlllIIlIllI[10]], lIIlllIIlIllI[5], lIIlllIIlIlIl[lIIlllIIlIllI[11]]);
        EnumC0005f[] enumC0005fArr = new EnumC0005f[lIIlllIIlIllI[6]];
        enumC0005fArr[lIIlllIIlIllI[0]] = ARDY_KNIGHT;
        enumC0005fArr[lIIlllIIlIllI[1]] = MASTER_FARMER;
        enumC0005fArr[lIIlllIIlIllI[2]] = MAN;
        enumC0005fArr[lIIlllIIlIllI[3]] = VYRE;
        enumC0005fArr[lIIlllIIlIllI[4]] = ELF;
        enumC0005fArr[lIIlllIIlIllI[5]] = TZHAAR;
        $VALUES = enumC0005fArr;
    }

    private static void lIllIIllIIIlIlI() {
        lIIlllIIlIllI = new int[13];
        lIIlllIIlIllI[0] = (196 ^ 153) & ((197 ^ 152) ^ (-1));
        lIIlllIIlIllI[1] = " ".length();
        lIIlllIIlIllI[2] = "  ".length();
        lIIlllIIlIllI[3] = "   ".length();
        lIIlllIIlIllI[4] = 10 ^ 14;
        lIIlllIIlIllI[5] = 71 ^ 66;
        lIIlllIIlIllI[6] = 167 ^ 161;
        lIIlllIIlIllI[7] = (((91 + 90) - 91) + 41) ^ (((22 + 65) - 42) + 87);
        lIIlllIIlIllI[8] = 139 ^ 131;
        lIIlllIIlIllI[9] = 202 ^ 195;
        lIIlllIIlIllI[10] = 157 ^ 151;
        lIIlllIIlIllI[11] = (((28 + 86) - 54) + 115) ^ (((93 + 0) - 37) + 108);
        lIIlllIIlIllI[12] = (59 ^ 126) ^ (18 ^ 91);
    }

    private EnumC0005f(String str, int i, String str2) {
        this.name = str2;
    }

    private static String lIllIIllIIIlIII(String llllllllllllllIlllIllIIIIIIlllll, String llllllllllllllIlllIllIIIIIIllllI) {
        try {
            SecretKeySpec llllllllllllllIlllIllIIIIIlIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIIIIIIllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIlllIIlIllI[2], llllllllllllllIlllIllIIIIIlIIIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIIIIIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIllIIIIIlIIIII) {
            llllllllllllllIlllIllIIIIIlIIIII.printStackTrace();
            return null;
        }
    }

    public String v() {
        return this.name;
    }

    private static void lIllIIllIIIlIIl() {
        lIIlllIIlIlIl = new String[lIIlllIIlIllI[12]];
        lIIlllIIlIlIl[lIIlllIIlIllI[0]] = lIllIIllIIIIlll("FjElKy4cLSg1OQM=", "Wcarq");
        lIIlllIIlIlIl[lIIlllIIlIllI[1]] = lIllIIllIIIlIII("aJP5dbq8VidzpQ+o0u4PshTLYFXTeVbv", "vBheH");
        lIIlllIIlIlIl[lIIlllIIlIllI[2]] = lIllIIllIIIlIII("zdiyJQ3QKr0HBNq8rdB/mA==", "GXPCb");
        lIIlllIIlIlIl[lIIlllIIlIllI[3]] = lIllIIllIIIIlll("NAI7OhwLQw4vCxQGOg==", "ycHNy");
        lIIlllIIlIlIl[lIIlllIIlIllI[4]] = lIllIIllIIIIlll("JhIi", "kSlkL");
        lIIlllIIlIlIl[lIIlllIIlIllI[5]] = lIllIIllIIIIlll("LyUs", "bDBoz");
        lIIlllIIlIlIl[lIIlllIIlIllI[6]] = lIllIIllIIIIlll("Aw4DFQ==", "UWQPO");
        lIIlllIIlIlIl[lIIlllIIlIllI[7]] = lIllIIllIIIlIII("6+SL8sIT5+A=", "ywmNq");
        lIIlllIIlIlIl[lIIlllIIlIllI[8]] = lIllIIllIIIIlll("IyUS", "fiTAT");
        lIIlllIIlIlIl[lIIlllIIlIllI[9]] = lIllIIllIIIIlll("DRYk", "HzBGE");
        lIIlllIIlIlIl[lIIlllIIlIllI[10]] = lIllIIllIIIlIII("9jYt0aedJT4=", "mUwPX");
        lIIlllIIlIlIl[lIIlllIIlIllI[11]] = lIllIIllIIIlIII("eVLGWvPf28YQz3yBV0SjaQ==", "KzTNE");
    }

    private static boolean lIllIIllIIIlIll(int i, int i2) {
        return i < i2;
    }

    public static EnumC0005f[] values() {
        return (EnumC0005f[]) $VALUES.clone();
    }

    private static String lIllIIllIIIIlll(String llllllllllllllIlllIllIIIIIIIlIlI, String llllllllllllllIlllIllIIIIIIIlllI) {
        String llllllllllllllIlllIllIIIIIIIlIlI2 = new String(Base64.getDecoder().decode(llllllllllllllIlllIllIIIIIIIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllIlllIllIIIIIIIllII = llllllllllllllIlllIllIIIIIIIlllI.toCharArray();
        int llllllllllllllIlllIllIIIIIIIlIll = lIIlllIIlIllI[0];
        char[] charArray = llllllllllllllIlllIllIIIIIIIlIlI2.toCharArray();
        int length = charArray.length;
        int i = lIIlllIIlIllI[0];
        while (lIllIIllIIIlIll(i, length)) {
            sb.append((char) (charArray[i] ^ llllllllllllllIlllIllIIIIIIIllII[llllllllllllllIlllIllIIIIIIIlIll % llllllllllllllIlllIllIIIIIIIllII.length]));
            "".length();
            llllllllllllllIlllIllIIIIIIIlIll++;
            i++;
            "".length();
            if ("  ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    public static EnumC0005f valueOf(String str) {
        return (EnumC0005f) Enum.valueOf(EnumC0005f.class, str);
    }
}
