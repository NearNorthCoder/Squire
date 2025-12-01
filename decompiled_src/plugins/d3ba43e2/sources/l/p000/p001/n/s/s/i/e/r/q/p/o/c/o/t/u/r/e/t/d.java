package l.p000.p001.n.s.s.i.e.r.q.p.o.c.o.t.u.r.e.t;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: l.-.-.n.s.s.i.e.r.q.p.o.c.o.t.u.r.e.t.d  reason: invalid package */
/* loaded from: d3ba43e2-4966-4faf-8fcb-fba83fc95121.jar:l/-/-/n/s/s/i/e/r/q/p/o/c/o/t/u/r/e/t/d.class */
public final class d {
    private static /* synthetic */ int[] lIIIlIlIIlIII;
    private static final /* synthetic */ d[] $VALUES;
    private static /* synthetic */ String[] lIIIlIlIIIlll;
    public static final /* synthetic */ d WEST;
    public static final /* synthetic */ d SOUTH;
    public static final /* synthetic */ d EAST;
    /* synthetic */ String direction;

    private static String lIIlllllllIIIII(String lllllllllllllllIIIIlllIIllllIIlI, String lllllllllllllllIIIIlllIIllllIIIl) {
        String lllllllllllllllIIIIlllIIllllIIlI2 = new String(Base64.getDecoder().decode(lllllllllllllllIIIIlllIIllllIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIIlllIIllllIIII = new StringBuilder();
        char[] lllllllllllllllIIIIlllIIlllIllll = lllllllllllllllIIIIlllIIllllIIIl.toCharArray();
        int lllllllllllllllIIIIlllIIlllIlllI = lIIIlIlIIlIII[0];
        char[] charArray = lllllllllllllllIIIIlllIIllllIIlI2.toCharArray();
        int length = charArray.length;
        int i = lIIIlIlIIlIII[0];
        while (lIIlllllllIIlIl(i, length)) {
            char lllllllllllllllIIIIlllIIllllIIll = charArray[i];
            lllllllllllllllIIIIlllIIllllIIII.append((char) (lllllllllllllllIIIIlllIIllllIIll ^ lllllllllllllllIIIIlllIIlllIllll[lllllllllllllllIIIIlllIIlllIlllI % lllllllllllllllIIIIlllIIlllIllll.length]));
            "".length();
            lllllllllllllllIIIIlllIIlllIlllI++;
            i++;
            "".length();
            if ((((26 ^ 3) ^ (111 ^ 121)) & (((((105 + 40) - (-12)) + 15) ^ (((37 + 147) - 122) + 101)) ^ (-" ".length()))) >= ((((61 + 105) - 131) + 114) ^ (((132 + 95) - 192) + 110))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIIIlllIIllllIIII);
    }

    private static String lIIlllllllIIIIl(String lllllllllllllllIIIIlllIlIIIIIIlI, String lllllllllllllllIIIIlllIlIIIIIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlllIlIIIIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIIlllIlIIIIIlII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIIlllIlIIIIIlII.init(lIIIlIlIIlIII[2], secretKeySpec);
            return new String(lllllllllllllllIIIIlllIlIIIIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlllIlIIIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIlllIlIIIIIIll) {
            lllllllllllllllIIIIlllIlIIIIIIll.printStackTrace();
            return null;
        }
    }

    private d(String str, int i, String str2) {
        this.direction = str2;
    }

    private static void lIIlllllllIIlII() {
        lIIIlIlIIlIII = new int[8];
        lIIIlIlIIlIII[0] = ((188 ^ 174) ^ (199 ^ 148)) & (((67 ^ 120) ^ (89 ^ 35)) ^ (-" ".length()));
        lIIIlIlIIlIII[1] = " ".length();
        lIIIlIlIIlIII[2] = "  ".length();
        lIIIlIlIIlIII[3] = "   ".length();
        lIIIlIlIIlIII[4] = 73 ^ 77;
        lIIIlIlIIlIII[5] = (36 ^ 72) ^ (17 ^ 120);
        lIIIlIlIIlIII[6] = 153 ^ 159;
        lIIIlIlIIlIII[7] = 37 ^ 45;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    static {
        lIIlllllllIIlII();
        lIIlllllllIIIll();
        EAST = new d(lIIIlIlIIIlll[lIIIlIlIIlIII[0]], lIIIlIlIIlIII[0], lIIIlIlIIIlll[lIIIlIlIIlIII[1]]);
        WEST = new d(lIIIlIlIIIlll[lIIIlIlIIlIII[2]], lIIIlIlIIlIII[1], lIIIlIlIIIlll[lIIIlIlIIlIII[3]]);
        SOUTH = new d(lIIIlIlIIIlll[lIIIlIlIIlIII[4]], lIIIlIlIIlIII[2], lIIIlIlIIIlll[lIIIlIlIIlIII[5]]);
        d[] dVarArr = new d[lIIIlIlIIlIII[3]];
        dVarArr[lIIIlIlIIlIII[0]] = EAST;
        dVarArr[lIIIlIlIIlIII[1]] = WEST;
        dVarArr[lIIIlIlIIlIII[2]] = SOUTH;
        $VALUES = dVarArr;
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    private static void lIIlllllllIIIll() {
        lIIIlIlIIIlll = new String[lIIIlIlIIlIII[6]];
        lIIIlIlIIIlll[lIIIlIlIIlIII[0]] = lIIlllllllIIIII("NxIyPw==", "rSakn");
        lIIIlIlIIIlll[lIIIlIlIIlIII[1]] = lIIlllllllIIIIl("pPBly5v7J7U=", "vSrdU");
        lIIIlIlIIIlll[lIIIlIlIIlIII[2]] = lIIlllllllIIIIl("DSR22gSpZRs=", "fvSlS");
        lIIIlIlIIIlll[lIIIlIlIIlIII[3]] = lIIlllllllIIIIl("9R0YBmS2WO8=", "RVLAi");
        lIIIlIlIIIlll[lIIIlIlIIlIII[4]] = lIIlllllllIIIlI("lFQuIYn1ays=", "XELTr");
        lIIIlIlIIIlll[lIIIlIlIIlIII[5]] = lIIlllllllIIIII("Gx0yBCk=", "HrGpA");
    }

    private static boolean lIIlllllllIIlIl(int i, int i2) {
        return i < i2;
    }

    public String n() {
        return this.direction;
    }

    private static String lIIlllllllIIIlI(String lllllllllllllllIIIIlllIlIIIIllll, String lllllllllllllllIIIIlllIlIIIIlllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlllIlIIIIlllI.getBytes(StandardCharsets.UTF_8)), lIIIlIlIIlIII[7]), "DES");
            Cipher lllllllllllllllIIIIlllIlIIIlIIIl = Cipher.getInstance("DES");
            lllllllllllllllIIIIlllIlIIIlIIIl.init(lIIIlIlIIlIII[2], secretKeySpec);
            return new String(lllllllllllllllIIIIlllIlIIIlIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlllIlIIIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIlllIlIIIlIIII) {
            lllllllllllllllIIIIlllIlIIIlIIII.printStackTrace();
            return null;
        }
    }
}
