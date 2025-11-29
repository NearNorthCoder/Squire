package r.e.o.r.h.s.b.e.q.l.e.u.p000.i.r;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.c  reason: invalid package */
/* loaded from: 5d6a9183-7b7a-42a1-8cad-f88f0a9fad3c.jar:r/e/o/r/h/s/b/e/q/l/e/u/-/i/r/c.class */
public final class c {
    public static final /* synthetic */ c ALL_STAGES;
    private static /* synthetic */ int[] lllIlIIlIIll;
    public static final /* synthetic */ c FINISH_POTS;
    public static final /* synthetic */ c CLEAN_HERBS;
    private static final /* synthetic */ c[] $VALUES;
    public static final /* synthetic */ c MAKE_UNF_POTS;
    public static final /* synthetic */ c ALL_STAGES_ALL_HERBS;
    private static /* synthetic */ String[] lllIlIIlIIIl;

    private static void lIIIlIllllIIIIl() {
        lllIlIIlIIll = new int[6];
        lllIlIIlIIll[0] = ((178 ^ 139) ^ (76 ^ 107)) & (((117 ^ 127) ^ (112 ^ 100)) ^ (-" ".length()));
        lllIlIIlIIll[1] = " ".length();
        lllIlIIlIIll[2] = "  ".length();
        lllIlIIlIIll[3] = "   ".length();
        lllIlIIlIIll[4] = (90 ^ 45) ^ (91 ^ 40);
        lllIlIIlIIll[5] = (199 ^ 128) ^ (20 ^ 86);
    }

    private static void lIIIlIlllIlllll() {
        lllIlIIlIIIl = new String[lllIlIIlIIll[5]];
        lllIlIIlIIIl[lllIlIIlIIll[0]] = lIIIlIlllIlllIl("BC0zAiAYKTMRLBQ=", "GavCn");
        lllIlIIlIIIl[lllIlIIlIIll[1]] = lIIIlIlllIlllIl("BRITEg4dHR4IAQcHCw==", "HSXWQ");
        lllIlIIlIIIl[lllIlIIlIIll[2]] = lIIIlIlllIllllI("JuPpcxg8sFN1LIGcBFEDAA==", "ryCTP");
        lllIlIIlIIIl[lllIlIIlIIll[3]] = lIIIlIlllIlllIl("AAc1KhUVCj4wFQ==", "AKyuF");
        lllIlIIlIIIl[lllIlIIlIIll[4]] = lIIIlIlllIllllI("imXjnTMNzawCyNxRceZgiSuOuTjjit6/", "QOAND");
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    private static boolean lIIIlIllllIIIll(int i, int i2) {
        return i < i2;
    }

    private static String lIIIlIlllIllllI(String lllllllllllllllIIllIIIllllllIlII, String lllllllllllllllIIllIIIllllllIIIl) {
        try {
            SecretKeySpec lllllllllllllllIIllIIIllllllIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIIllllllIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIlIIlIIll[2], lllllllllllllllIIllIIIllllllIlll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIIllllllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIIIllllllIlIl) {
            lllllllllllllllIIllIIIllllllIlIl.printStackTrace();
            return null;
        }
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    static {
        lIIIlIllllIIIIl();
        lIIIlIlllIlllll();
        CLEAN_HERBS = new c(lllIlIIlIIIl[lllIlIIlIIll[0]], lllIlIIlIIll[0]);
        MAKE_UNF_POTS = new c(lllIlIIlIIIl[lllIlIIlIIll[1]], lllIlIIlIIll[1]);
        FINISH_POTS = new c(lllIlIIlIIIl[lllIlIIlIIll[2]], lllIlIIlIIll[2]);
        ALL_STAGES = new c(lllIlIIlIIIl[lllIlIIlIIll[3]], lllIlIIlIIll[3]);
        ALL_STAGES_ALL_HERBS = new c(lllIlIIlIIIl[lllIlIIlIIll[4]], lllIlIIlIIll[4]);
        c[] cVarArr = new c[lllIlIIlIIll[5]];
        cVarArr[lllIlIIlIIll[0]] = CLEAN_HERBS;
        cVarArr[lllIlIIlIIll[1]] = MAKE_UNF_POTS;
        cVarArr[lllIlIIlIIll[2]] = FINISH_POTS;
        cVarArr[lllIlIIlIIll[3]] = ALL_STAGES;
        cVarArr[lllIlIIlIIll[4]] = ALL_STAGES_ALL_HERBS;
        $VALUES = cVarArr;
    }

    private static String lIIIlIlllIlllIl(String lllllllllllllllIIllIIIlllllIIlII, String lllllllllllllllIIllIIIlllllIIIll) {
        String lllllllllllllllIIllIIIlllllIIlII2 = new String(Base64.getDecoder().decode(lllllllllllllllIIllIIIlllllIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIIIlllllIIIlI = new StringBuilder();
        char[] lllllllllllllllIIllIIIlllllIIIIl = lllllllllllllllIIllIIIlllllIIIll.toCharArray();
        int lllllllllllllllIIllIIIlllllIIIII = lllIlIIlIIll[0];
        char[] charArray = lllllllllllllllIIllIIIlllllIIlII2.toCharArray();
        int length = charArray.length;
        int i = lllIlIIlIIll[0];
        while (lIIIlIllllIIIll(i, length)) {
            char lllllllllllllllIIllIIIlllllIIlIl = charArray[i];
            lllllllllllllllIIllIIIlllllIIIlI.append((char) (lllllllllllllllIIllIIIlllllIIlIl ^ lllllllllllllllIIllIIIlllllIIIIl[lllllllllllllllIIllIIIlllllIIIII % lllllllllllllllIIllIIIlllllIIIIl.length]));
            "".length();
            lllllllllllllllIIllIIIlllllIIIII++;
            i++;
            "".length();
            if ((((32 ^ 126) ^ (186 ^ 165)) & (((57 ^ 110) ^ (150 ^ 128)) ^ (-" ".length()))) < 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIllIIIlllllIIIlI);
    }

    private c(String str, int i) {
    }
}
