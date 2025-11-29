package k.p.n.s.r.a.p000.q.e.l.r.e.i.u;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: k.p.n.s.r.a.-.q.e.l.r.e.i.u.a  reason: invalid package */
/* loaded from: squire-planker-0.0.5.jar:k/p/n/s/r/a/-/q/e/l/r/e/i/u/a.class */
public final class a {
    private final /* synthetic */ int plankCost;
    public static final /* synthetic */ a TEAK;
    public static final /* synthetic */ a NORMAL;
    public static final /* synthetic */ a MAHOGANY;
    private final /* synthetic */ int plankID;
    private final /* synthetic */ int itemID;
    private static /* synthetic */ int[] lllllIllllIl;
    public static final /* synthetic */ a OAK;
    private static final /* synthetic */ a[] $VALUES;
    private static /* synthetic */ String[] lllllIllllII;

    private static boolean lIIlIIlllIlllll(int i, int i2) {
        return i < i2;
    }

    static {
        lIIlIIlllIllllI();
        lIIlIIlllIlllIl();
        NORMAL = new a(lllllIllllII[lllllIllllIl[0]], lllllIllllIl[0], lllllIllllIl[1], lllllIllllIl[2], lllllIllllIl[3]);
        OAK = new a(lllllIllllII[lllllIllllIl[4]], lllllIllllIl[4], lllllIllllIl[5], lllllIllllIl[6], lllllIllllIl[7]);
        TEAK = new a(lllllIllllII[lllllIllllIl[8]], lllllIllllIl[8], lllllIllllIl[9], lllllIllllIl[10], lllllIllllIl[11]);
        MAHOGANY = new a(lllllIllllII[lllllIllllIl[12]], lllllIllllIl[12], lllllIllllIl[13], lllllIllllIl[14], lllllIllllIl[15]);
        a[] aVarArr = new a[lllllIllllIl[16]];
        aVarArr[lllllIllllIl[0]] = NORMAL;
        aVarArr[lllllIllllIl[4]] = OAK;
        aVarArr[lllllIllllIl[8]] = TEAK;
        aVarArr[lllllIllllIl[12]] = MAHOGANY;
        $VALUES = aVarArr;
    }

    private static String lIIlIIlllIllIll(String lllllllllllllllIIlIlIIIIIlIIIIIl, String lllllllllllllllIIlIlIIIIIlIIIIII) {
        try {
            SecretKeySpec lllllllllllllllIIlIlIIIIIlIIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIIIIIlIIIIII.getBytes(StandardCharsets.UTF_8)), lllllIllllIl[17]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllllIllllIl[8], lllllllllllllllIIlIlIIIIIlIIIlII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIIIIIlIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIlIIIIIlIIIIlI) {
            lllllllllllllllIIlIlIIIIIlIIIIlI.printStackTrace();
            return null;
        }
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    private static void lIIlIIlllIlllIl() {
        lllllIllllII = new String[lllllIllllIl[16]];
        lllllIllllII[lllllIllllIl[0]] = lIIlIIlllIllIll("GClCPiesk8s=", "twqZq");
        lllllIllllII[lllllIllllIl[4]] = lIIlIIlllIlllII("BhcA", "IVKov");
        lllllIllllII[lllllIllllIl[8]] = lIIlIIlllIlllII("LjQLJg==", "zqJmB");
        lllllIllllII[lllllIllllIl[12]] = lIIlIIlllIllIll("kcaSwRxfXQ23e3dq6naohw==", "wTlVD");
    }

    private static void lIIlIIlllIllllI() {
        lllllIllllIl = new int[18];
        lllllIllllIl[0] = ((194 ^ 166) ^ (17 ^ 63)) & (((((81 + 160) - 203) + 154) ^ (((60 + 29) - (-25)) + 24)) ^ (-" ".length()));
        lllllIllllIl[1] = (-((-26847) & 30943)) & (-2585) & 8191;
        lllllIllllIl[2] = (-((-18362) & 30655)) & (-1171) & 15863;
        lllllIllllIl[3] = (-((-10500) & 32047)) & (-1) & 22507;
        lllllIllllIl[4] = " ".length();
        lllllIllllIl[5] = (-((-16741) & 31599)) & (-5) & 16383;
        lllllIllllIl[6] = (-((-6921) & 31631)) & (-2050) & 32759;
        lllllIllllIl[7] = (-((-7369) & 24062)) & (-3201) & 28671;
        lllllIllllIl[8] = "  ".length();
        lllllIllllIl[9] = (-((-705) & 26307)) & (-257) & 32191;
        lllllIllllIl[10] = (-20737) & 32736;
        lllllIllllIl[11] = (-17443) & 26222;
        lllllIllllIl[12] = "   ".length();
        lllllIllllIl[13] = (-((-12883) & 29267)) & (-9796) & 32511;
        lllllIllllIl[14] = (-((-7682) & 32603)) & (-4103) & 65023;
        lllllIllllIl[15] = (-16785) & 25566;
        lllllIllllIl[16] = (54 ^ 24) ^ (81 ^ 123);
        lllllIllllIl[17] = 168 ^ 160;
    }

    private a(String str, int i, int i2, int i3, int i4) {
        this.itemID = i2;
        this.plankCost = i3;
        this.plankID = i4;
    }

    public int e() {
        return this.plankCost;
    }

    public int f() {
        return this.plankID;
    }

    private static String lIIlIIlllIlllII(String lllllllllllllllIIlIlIIIIIIllIIIl, String lllllllllllllllIIlIlIIIIIIlIlIll) {
        String lllllllllllllllIIlIlIIIIIIllIIIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIIlIlIIIIIIllIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIlIIIIIIlIllll = new StringBuilder();
        char[] lllllllllllllllIIlIlIIIIIIlIlllI = lllllllllllllllIIlIlIIIIIIlIlIll.toCharArray();
        int lllllllllllllllIIlIlIIIIIIlIllIl = lllllIllllIl[0];
        char[] charArray = lllllllllllllllIIlIlIIIIIIllIIIl2.toCharArray();
        int length = charArray.length;
        int i = lllllIllllIl[0];
        while (lIIlIIlllIlllll(i, length)) {
            char lllllllllllllllIIlIlIIIIIIllIIlI = charArray[i];
            lllllllllllllllIIlIlIIIIIIlIllll.append((char) (lllllllllllllllIIlIlIIIIIIllIIlI ^ lllllllllllllllIIlIlIIIIIIlIlllI[lllllllllllllllIIlIlIIIIIIlIllIl % lllllllllllllllIIlIlIIIIIIlIlllI.length]));
            "".length();
            lllllllllllllllIIlIlIIIIIIlIllIl++;
            i++;
            "".length();
            if ("  ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIlIlIIIIIIlIllll);
    }

    public int d() {
        return this.itemID;
    }
}
