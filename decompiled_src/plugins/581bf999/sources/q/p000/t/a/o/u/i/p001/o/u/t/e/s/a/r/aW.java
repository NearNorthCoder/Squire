package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aW  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/aW.class */
final class aW {
    private static final /* synthetic */ aW[] $VALUES;
    public static final /* synthetic */ aW VENTS;
    public static final /* synthetic */ aW PILLARS;
    private static /* synthetic */ String[] lIllIllIIIl;
    private static /* synthetic */ int[] lIllIllIIlI;

    static {
        lIIlIllllIIlll();
        lIIlIllllIIllI();
        PILLARS = new aW(lIllIllIIIl[lIllIllIIlI[0]], lIllIllIIlI[0]);
        VENTS = new aW(lIllIllIIIl[lIllIllIIlI[1]], lIllIllIIlI[1]);
        aW[] aWVarArr = new aW[lIllIllIIlI[2]];
        aWVarArr[lIllIllIIlI[0]] = PILLARS;
        aWVarArr[lIllIllIIlI[1]] = VENTS;
        $VALUES = aWVarArr;
    }

    public static aW[] values() {
        return (aW[]) $VALUES.clone();
    }

    private aW(String str, int i) {
    }

    private static void lIIlIllllIIlll() {
        lIllIllIIlI = new int[4];
        lIllIllIIlI[0] = ((17 ^ 47) ^ (88 ^ 108)) & (((196 ^ 138) ^ (85 ^ 17)) ^ (-" ".length()));
        lIllIllIIlI[1] = " ".length();
        lIllIllIIlI[2] = "  ".length();
        lIllIllIIlI[3] = (((106 + 126) - 218) + 123) ^ (((98 + 41) - 19) + 9);
    }

    private static void lIIlIllllIIllI() {
        lIllIllIIIl = new String[lIllIllIIlI[2]];
        lIllIllIIIl[lIllIllIIlI[0]] = lIIlIllllIIlIl("CicGacnGUzo=", "OTAgt");
        lIllIllIIIl[lIllIllIIlI[1]] = lIIlIllllIIlIl("aUtTNcaA42I=", "PttwE");
    }

    private static String lIIlIllllIIlIl(String llllllllllllllllIlIlIIIIllIIIIII, String llllllllllllllllIlIlIIIIllIIIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlIIIIllIIIIIl.getBytes(StandardCharsets.UTF_8)), lIllIllIIlI[3]), "DES");
            Cipher llllllllllllllllIlIlIIIIllIIIlII = Cipher.getInstance("DES");
            llllllllllllllllIlIlIIIIllIIIlII.init(lIllIllIIlI[2], secretKeySpec);
            return new String(llllllllllllllllIlIlIIIIllIIIlII.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlIIIIllIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIlIIIIllIIIIll) {
            llllllllllllllllIlIlIIIIllIIIIll.printStackTrace();
            return null;
        }
    }

    public static aW valueOf(String str) {
        return (aW) Enum.valueOf(aW.class, str);
    }
}
