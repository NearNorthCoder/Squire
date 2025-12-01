package s.h.p000.m.a.n.u.r.i.s.q.a.s.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: s.h.-.m.a.n.u.r.i.s.q.a.s.e.e  reason: invalid package */
/* loaded from: 29f97a50-4c1f-4047-b5b1-e3e7ab557a1b.jar:s/h/-/m/a/n/u/r/i/s/q/a/s/e/e.class */
public final class e {
    private static /* synthetic */ String[] lIIlIlllIIlIl;
    public static final /* synthetic */ e DARK_CRAB;
    private static /* synthetic */ int[] lIIlIlllIIllI;
    public static final /* synthetic */ e LOBSTER;
    public static final /* synthetic */ e KARAMBWAN;
    public static final /* synthetic */ e SHARK;
    public static final /* synthetic */ e SWORDFISH;
    public static final /* synthetic */ e MONKFISH;
    private final /* synthetic */ int id;
    public static final /* synthetic */ e MANTA_RAY;
    public static final /* synthetic */ e ANGLERFISH;
    private static final /* synthetic */ e[] $VALUES;

    private static String lIlIllIllIlIIIl(String llllllllllllllIllllIlIIIlllllIIl, String llllllllllllllIllllIlIIIlllllIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIlIIIlllllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllllIlIIIlllllIll = Cipher.getInstance("Blowfish");
            llllllllllllllIllllIlIIIlllllIll.init(lIIlIlllIIllI[4], secretKeySpec);
            return new String(llllllllllllllIllllIlIIIlllllIll.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIlIIIlllllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIlIIIlllllIlI) {
            llllllllllllllIllllIlIIIlllllIlI.printStackTrace();
            return null;
        }
    }

    private static String lIlIllIllIlIIlI(String llllllllllllllIllllIlIIIllIlIlII, String llllllllllllllIllllIlIIIllIlIIll) {
        try {
            SecretKeySpec llllllllllllllIllllIlIIIllIlIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIlIIIllIlIIll.getBytes(StandardCharsets.UTF_8)), lIIlIlllIIllI[16]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIlIlllIIllI[4], llllllllllllllIllllIlIIIllIlIlll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIlIIIllIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIlIIIllIlIlIl) {
            llllllllllllllIllllIlIIIllIlIlIl.printStackTrace();
            return null;
        }
    }

    private static void lIlIllIllIlIlIl() {
        lIIlIlllIIllI = new int[17];
        lIIlIlllIIllI[0] = (55 ^ 45) & ((74 ^ 80) ^ (-1));
        lIIlIlllIIllI[1] = (-((-2351) & 23487)) & (-8228) & 32507;
        lIIlIlllIIllI[2] = " ".length();
        lIIlIlllIIllI[3] = (-34) & 7979;
        lIIlIlllIIllI[4] = "  ".length();
        lIIlIlllIIllI[5] = (-((-8241) & 29247)) & (-11313) & 32703;
        lIIlIlllIIllI[6] = "   ".length();
        lIIlIlllIIllI[7] = (-24585) & 24975;
        lIIlIlllIIllI[8] = 93 ^ 89;
        lIIlIlllIIllI[9] = (-19457) & 19835;
        lIIlIlllIIllI[10] = (((55 + 39) - (-20)) + 72) ^ (((80 + 116) - 31) + 26);
        lIIlIlllIIllI[11] = (-((-565) & 28221)) & (-1) & 28029;
        lIIlIlllIIllI[12] = 32 ^ 38;
        lIIlIlllIIllI[13] = (-((-27361) & 31487)) & (-16642) & 32703;
        lIIlIlllIIllI[14] = 147 ^ 148;
        lIIlIlllIIllI[15] = (-((-5121) & 23867)) & (-577) & 32763;
        lIIlIlllIIllI[16] = 102 ^ 110;
    }

    private e(String str, int i, int i2) {
        this.id = i2;
    }

    private static String lIlIllIllIlIIll(String llllllllllllllIllllIlIIIlllIlIIl, String llllllllllllllIllllIlIIIlllIlIII) {
        String llllllllllllllIllllIlIIIlllIlIIl2 = new String(Base64.getDecoder().decode(llllllllllllllIllllIlIIIlllIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllllIlIIIlllIIlll = new StringBuilder();
        char[] llllllllllllllIllllIlIIIlllIIllI = llllllllllllllIllllIlIIIlllIlIII.toCharArray();
        int llllllllllllllIllllIlIIIlllIIlIl = lIIlIlllIIllI[0];
        char[] charArray = llllllllllllllIllllIlIIIlllIlIIl2.toCharArray();
        int length = charArray.length;
        int llllllllllllllIllllIlIIIllIlllIl = lIIlIlllIIllI[0];
        while (lIlIllIllIlIllI(llllllllllllllIllllIlIIIllIlllIl, length)) {
            char llllllllllllllIllllIlIIIlllIlIlI = charArray[llllllllllllllIllllIlIIIllIlllIl];
            llllllllllllllIllllIlIIIlllIIlll.append((char) (llllllllllllllIllllIlIIIlllIlIlI ^ llllllllllllllIllllIlIIIlllIIllI[llllllllllllllIllllIlIIIlllIIlIl % llllllllllllllIllllIlIIIlllIIllI.length]));
            "".length();
            llllllllllllllIllllIlIIIlllIIlIl++;
            llllllllllllllIllllIlIIIllIlllIl++;
            "".length();
            if ((-" ".length()) < (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllllIlIIIlllIIlll);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }

    private static void lIlIllIllIlIlII() {
        lIIlIlllIIlIl = new String[lIIlIlllIIllI[16]];
        lIIlIlllIIlIl[lIIlIlllIIllI[0]] = lIlIllIllIlIIIl("qt//BHhjcIdjlzJ8T/z2Bw==", "gzCYs");
        lIIlIlllIIlIl[lIIlIlllIIllI[2]] = lIlIllIllIlIIIl("kQi3evctxJqmAmpqJ3fjDA==", "AJHoj");
        lIIlIlllIIlIl[lIIlIlllIIllI[4]] = lIlIllIllIlIIlI("j5CElyFPRvE=", "yCVJx");
        lIIlIlllIIlIl[lIIlIlllIIllI[6]] = lIlIllIllIlIIll("Ki0KLTE4PgUg", "glDyp");
        lIIlIlllIIlIl[lIIlIlllIIllI[8]] = lIlIllIllIlIIlI("5ZxaZhgaXv0=", "VaEMT");
        lIIlIlllIIlIl[lIIlIlllIIllI[10]] = lIlIllIllIlIIlI("4nVPSsPAjwBe64h2H6nvlg==", "EZDbQ");
        lIIlIlllIIlIl[lIIlIlllIIllI[12]] = lIlIllIllIlIIlI("GdQsOOK+Hp1PV4ODz1DM3g==", "aAKIn");
        lIIlIlllIIlIl[lIIlIlllIIllI[14]] = lIlIllIllIlIIlI("1/6AWmKmo2ypKoQdZxkzhA==", "ezgGK");
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public int w() {
        return this.id;
    }

    private static boolean lIlIllIllIlIllI(int i, int i2) {
        return i < i2;
    }

    static {
        lIlIllIllIlIlIl();
        lIlIllIllIlIlII();
        KARAMBWAN = new e(lIIlIlllIIlIl[lIIlIlllIIllI[0]], lIIlIlllIIllI[0], lIIlIlllIIllI[1]);
        MONKFISH = new e(lIIlIlllIIlIl[lIIlIlllIIllI[2]], lIIlIlllIIllI[2], lIIlIlllIIllI[3]);
        SHARK = new e(lIIlIlllIIlIl[lIIlIlllIIllI[4]], lIIlIlllIIllI[4], lIIlIlllIIllI[5]);
        MANTA_RAY = new e(lIIlIlllIIlIl[lIIlIlllIIllI[6]], lIIlIlllIIllI[6], lIIlIlllIIllI[7]);
        LOBSTER = new e(lIIlIlllIIlIl[lIIlIlllIIllI[8]], lIIlIlllIIllI[8], lIIlIlllIIllI[9]);
        SWORDFISH = new e(lIIlIlllIIlIl[lIIlIlllIIllI[10]], lIIlIlllIIllI[10], lIIlIlllIIllI[11]);
        DARK_CRAB = new e(lIIlIlllIIlIl[lIIlIlllIIllI[12]], lIIlIlllIIllI[12], lIIlIlllIIllI[13]);
        ANGLERFISH = new e(lIIlIlllIIlIl[lIIlIlllIIllI[14]], lIIlIlllIIllI[14], lIIlIlllIIllI[15]);
        e[] eVarArr = new e[lIIlIlllIIllI[16]];
        eVarArr[lIIlIlllIIllI[0]] = KARAMBWAN;
        eVarArr[lIIlIlllIIllI[2]] = MONKFISH;
        eVarArr[lIIlIlllIIllI[4]] = SHARK;
        eVarArr[lIIlIlllIIllI[6]] = MANTA_RAY;
        eVarArr[lIIlIlllIIllI[8]] = LOBSTER;
        eVarArr[lIIlIlllIIllI[10]] = SWORDFISH;
        eVarArr[lIIlIlllIIllI[12]] = DARK_CRAB;
        eVarArr[lIIlIlllIIllI[14]] = ANGLERFISH;
        $VALUES = eVarArr;
    }
}
