/*
 * Decompiled with CFR 0.152.
 */
package k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class p
extends Enum<p> {
    public static final /* synthetic */ /* enum */ p REDWOOD;
    public static final /* synthetic */ /* enum */ p MAGIC;
    public static final /* synthetic */ /* enum */ p MAPLE;
    private static final /* synthetic */ p[] $VALUES;
    private final /* synthetic */ int logId;
    private static /* synthetic */ int[] lllIlIIlIlI;
    private static /* synthetic */ String[] lllIIlIIIlI;
    public static final /* synthetic */ /* enum */ p WILLOW;
    public static final /* synthetic */ /* enum */ p NORMAL;
    public static final /* synthetic */ /* enum */ p OAK;
    public static final /* synthetic */ /* enum */ p YEW;

    public static p valueOf(String string) {
        return Enum.valueOf(p.class, string);
    }

    static {
        p.lIlIllllIllIII();
        p.lIlIllIlllIIlI();
        NORMAL = new p(lllIlIIlIlI[1]);
        OAK = new p(lllIlIIlIlI[3]);
        WILLOW = new p(lllIlIIlIlI[5]);
        MAPLE = new p(lllIlIIlIlI[7]);
        YEW = new p(lllIlIIlIlI[9]);
        MAGIC = new p(lllIlIIlIlI[11]);
        REDWOOD = new p(lllIlIIlIlI[13]);
        p[] pArray = new p[lllIlIIlIlI[14]];
        pArray[p.lllIlIIlIlI[0]] = NORMAL;
        pArray[p.lllIlIIlIlI[2]] = OAK;
        pArray[p.lllIlIIlIlI[4]] = WILLOW;
        pArray[p.lllIlIIlIlI[6]] = MAPLE;
        pArray[p.lllIlIIlIlI[8]] = YEW;
        pArray[p.lllIlIIlIlI[10]] = MAGIC;
        pArray[p.lllIlIIlIlI[12]] = REDWOOD;
        $VALUES = pArray;
    }

    public int M() {
        return this.logId;
    }

    private static void lIlIllIlllIIlI() {
        lllIIlIIIlI = new String[lllIlIIlIlI[14]];
        p.lllIIlIIIlI[p.lllIlIIlIlI[0]] = p.lIlIllIllIllll("go6zIbgZ53A=", "OCBbF");
        p.lllIIlIIIlI[p.lllIlIIlIlI[2]] = p.lIlIllIlllIIII("yFctzkPse0I=", "DyMmB");
        p.lllIIlIIIlI[p.lllIlIIlIlI[4]] = p.lIlIllIlllIIII("inszPhxTHAQ=", "fojRP");
        p.lllIIlIIIlI[p.lllIlIIlIlI[6]] = p.lIlIllIlllIIII("a9PqNw+n9qw=", "SzSMH");
        p.lllIIlIIIlI[p.lllIlIIlIlI[8]] = p.lIlIllIllIllll("QEZOmTcQX9E=", "sKqAK");
        p.lllIIlIIIlI[p.lllIlIIlIlI[10]] = p.lIlIllIlllIIII("3w2xOeqN0EE=", "Unxgt");
        p.lllIIlIIIlI[p.lllIlIIlIlI[12]] = p.lIlIllIlllIIIl("Hw4LBiICDw==", "MKOQm");
    }

    private static String lIlIllIllIllll(String llllllllllllllllIIlIIlIllllIllll, String llllllllllllllllIIlIIlIlllllIIII) {
        try {
            SecretKeySpec llllllllllllllllIIlIIlIlllllIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIlIlllllIIII.getBytes(StandardCharsets.UTF_8)), lllIlIIlIlI[15]), "DES");
            Cipher llllllllllllllllIIlIIlIlllllIIll = Cipher.getInstance("DES");
            llllllllllllllllIIlIIlIlllllIIll.init(lllIlIIlIlI[4], llllllllllllllllIIlIIlIlllllIlII);
            return new String(llllllllllllllllIIlIIlIlllllIIll.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIlIllllIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIIlIlllllIIlI) {
            llllllllllllllllIIlIIlIlllllIIlI.printStackTrace();
            return null;
        }
    }

    private static String lIlIllIlllIIIl(String llllllllllllllllIIlIIlIllllIIIIl, String llllllllllllllllIIlIIlIlllIllIll) {
        llllllllllllllllIIlIIlIllllIIIIl = new String(Base64.getDecoder().decode(llllllllllllllllIIlIIlIllllIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlIIlIlllIlllll = new StringBuilder();
        char[] llllllllllllllllIIlIIlIlllIllllI = llllllllllllllllIIlIIlIlllIllIll.toCharArray();
        int llllllllllllllllIIlIIlIlllIlllIl = lllIlIIlIlI[0];
        char[] llllllllllllllllIIlIIlIlllIlIlll = llllllllllllllllIIlIIlIllllIIIIl.toCharArray();
        int llllllllllllllllIIlIIlIlllIlIllI = llllllllllllllllIIlIIlIlllIlIlll.length;
        int llllllllllllllllIIlIIlIlllIlIlIl = lllIlIIlIlI[0];
        while (p.lIlIllllIllIIl(llllllllllllllllIIlIIlIlllIlIlIl, llllllllllllllllIIlIIlIlllIlIllI)) {
            char llllllllllllllllIIlIIlIllllIIIlI = llllllllllllllllIIlIIlIlllIlIlll[llllllllllllllllIIlIIlIlllIlIlIl];
            llllllllllllllllIIlIIlIlllIlllll.append((char)(llllllllllllllllIIlIIlIllllIIIlI ^ llllllllllllllllIIlIIlIlllIllllI[llllllllllllllllIIlIIlIlllIlllIl % llllllllllllllllIIlIIlIlllIllllI.length]));
            "".length();
            ++llllllllllllllllIIlIIlIlllIlllIl;
            ++llllllllllllllllIIlIIlIlllIlIlIl;
            "".length();
            if ("  ".length() != -" ".length()) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIlIIlIlllIlllll);
    }

    public static p[] values() {
        return (p[])$VALUES.clone();
    }

    private p(int n3) {
        this.logId = n3;
    }

    private static void lIlIllllIllIII() {
        lllIlIIlIlI = new int[16];
        p.lllIlIIlIlI[0] = (9 + 0 - -6 + 225 ^ 160 + 113 - 101 + 5) & (0xD9 ^ 0xC0 ^ (0x16 ^ 0x4E) ^ -" ".length());
        p.lllIlIIlIlI[1] = -(0xFFFFE2DD & 0x7F2B) & (0xFFFFFFFF & 0x67EF);
        p.lllIlIIlIlI[2] = " ".length();
        p.lllIlIIlIlI[3] = -(0xFFFFF3CF & 0x2E3F) & (0xFFFFA7FF & Short.MAX_VALUE);
        p.lllIlIIlIlI[4] = "  ".length();
        p.lllIlIIlIlI[5] = 0xFFFFFFEF & 0x5FF;
        p.lllIlIIlIlI[6] = "   ".length();
        p.lllIlIIlIlI[7] = 0xFFFFF7EF & 0xDFD;
        p.lllIlIIlIlI[8] = 138 + 70 - 106 + 66 ^ 12 + 84 - -34 + 42;
        p.lllIlIIlIlI[9] = 0xFFFF9FFB & 0x65EF;
        p.lllIlIIlIlI[10] = 0x76 ^ 0x6C ^ (0x41 ^ 0x5E);
        p.lllIlIIlIlI[11] = 0xFFFFBFFD & 0x45EB;
        p.lllIlIIlIlI[12] = 37 + 65 - 82 + 149 ^ 51 + 152 - 68 + 40;
        p.lllIlIIlIlI[13] = -(0xFFFFB5CB & 0x7B3F) & (0xFFFFFFDF & 0x7DFF);
        p.lllIlIIlIlI[14] = 2 + 22 - -40 + 95 ^ 5 + 95 - 83 + 135;
        p.lllIlIIlIlI[15] = 50 + 35 - 39 + 94 ^ 55 + 100 - 72 + 49;
    }

    private static String lIlIllIlllIIII(String llllllllllllllllIIlIIlIlllllllII, String llllllllllllllllIIlIIlIlllllllIl) {
        try {
            SecretKeySpec llllllllllllllllIIlIIllIIIIIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIlIlllllllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlIIllIIIIIIIII = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlIIllIIIIIIIII.init(lllIlIIlIlI[4], llllllllllllllllIIlIIllIIIIIIIIl);
            return new String(llllllllllllllllIIlIIllIIIIIIIII.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIlIlllllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIIlIlllllllll) {
            llllllllllllllllIIlIIlIlllllllll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIllllIllIIl(int n2, int n3) {
        return n2 < n3;
    }
}

