package l.p000.p001.n.s.s.i.e.r.q.p.o.c.o.t.u.r.e.t;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: l.-.-.n.s.s.i.e.r.q.p.o.c.o.t.u.r.e.t.c  reason: invalid package */
/* loaded from: d3ba43e2-4966-4faf-8fcb-fba83fc95121.jar:l/-/-/n/s/s/i/e/r/q/p/o/c/o/t/u/r/e/t/c.class */
public final class c {
    public static final /* synthetic */ c VETERAN;
    private /* synthetic */ int pointsPerGame;
    private /* synthetic */ String difficulty;
    public static final /* synthetic */ c INTERMEDIATE;
    private static /* synthetic */ String[] lIIIlIlIIIIII;
    private /* synthetic */ int levelRequirement;
    private /* synthetic */ int objectID;
    private static final /* synthetic */ c[] $VALUES;
    public static final /* synthetic */ c NOVICE;
    private static /* synthetic */ int[] lIIIlIlIIIIIl;

    static {
        lIIllllllIlIIII();
        lIIllllllIIllll();
        NOVICE = new c(lIIIlIlIIIIII[lIIIlIlIIIIIl[0]], lIIIlIlIIIIIl[0], lIIIlIlIIIIII[lIIIlIlIIIIIl[1]], lIIIlIlIIIIIl[2], lIIIlIlIIIIIl[3], lIIIlIlIIIIIl[4]);
        INTERMEDIATE = new c(lIIIlIlIIIIII[lIIIlIlIIIIIl[5]], lIIIlIlIIIIIl[1], lIIIlIlIIIIII[lIIIlIlIIIIIl[4]], lIIIlIlIIIIIl[6], lIIIlIlIIIIIl[7], lIIIlIlIIIIIl[8]);
        VETERAN = new c(lIIIlIlIIIIII[lIIIlIlIIIIIl[8]], lIIIlIlIIIIIl[5], lIIIlIlIIIIII[lIIIlIlIIIIIl[9]], lIIIlIlIIIIIl[10], lIIIlIlIIIIIl[11], lIIIlIlIIIIIl[9]);
        c[] cVarArr = new c[lIIIlIlIIIIIl[4]];
        cVarArr[lIIIlIlIIIIIl[0]] = NOVICE;
        cVarArr[lIIIlIlIIIIIl[1]] = INTERMEDIATE;
        cVarArr[lIIIlIlIIIIIl[5]] = VETERAN;
        $VALUES = cVarArr;
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    private static void lIIllllllIIllll() {
        lIIIlIlIIIIII = new String[lIIIlIlIIIIIl[12]];
        lIIIlIlIIIIII[lIIIlIlIIIIIl[0]] = lIIllllllIIllII("FxgdIBsc", "YWKiX");
        lIIIlIlIIIIII[lIIIlIlIIIIIl[1]] = lIIllllllIIllIl("ES8ufqM9V20=", "JhhtY");
        lIIIlIlIIIIII[lIIIlIlIIIIIl[5]] = lIIllllllIIlllI("gx1vpwztCmyEJVRa6OdpwQ==", "iundj");
        lIIIlIlIIIIII[lIIIlIlIIIIIl[4]] = lIIllllllIIllII("ERkMACM1EhwMMCwS", "XwxeQ");
        lIIIlIlIIIIII[lIIIlIlIIIIIl[8]] = lIIllllllIIlllI("pEP+1mKLbcA=", "BLDBp");
        lIIIlIlIIIIII[lIIIlIlIIIIIl[9]] = lIIllllllIIllIl("cIxGU+OMMU8=", "oxuUs");
    }

    private static void lIIllllllIlIIII() {
        lIIIlIlIIIIIl = new int[14];
        lIIIlIlIIIIIl[0] = ((4 ^ 15) ^ (102 ^ 115)) & (((73 ^ 24) ^ (11 ^ 68)) ^ (-" ".length()));
        lIIIlIlIIIIIl[1] = " ".length();
        lIIIlIlIIIIIl[2] = 153 ^ 177;
        lIIIlIlIIIIIl[3] = (-((-13069) & 31501)) & (-1) & 32747;
        lIIIlIlIIIIIl[4] = "   ".length();
        lIIIlIlIIIIIl[5] = "  ".length();
        lIIIlIlIIIIIl[6] = 247 ^ 177;
        lIIIlIlIIIIIl[7] = (-289) & 25919;
        lIIIlIlIIIIIl[8] = ((39 ^ 109) & ((17 ^ 91) ^ (-1))) ^ (40 ^ 44);
        lIIIlIlIIIIIl[9] = (((125 + 43) - 65) + 50) ^ (((105 + 135) - 109) + 25);
        lIIIlIlIIIIIl[10] = (108 ^ 29) ^ (71 ^ 82);
        lIIIlIlIIIIIl[11] = (-7054) & 32685;
        lIIIlIlIIIIIl[12] = 146 ^ 148;
        lIIIlIlIIIIIl[13] = 186 ^ 178;
    }

    public String j() {
        return this.difficulty;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "Boats." + name() + "(difficulty=" + j() + ", levelRequirement=" + k() + ", objectID=" + l() + ", pointsPerGame=" + m() + ")";
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    private static boolean lIIllllllIlIIIl(int i, int i2) {
        return i < i2;
    }

    private static String lIIllllllIIllIl(String lllllllllllllllIIIIlllIllIIIIlII, String lllllllllllllllIIIIlllIllIIIIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlllIllIIIIIll.getBytes(StandardCharsets.UTF_8)), lIIIlIlIIIIIl[13]), "DES");
            Cipher lllllllllllllllIIIIlllIllIIIIllI = Cipher.getInstance("DES");
            lllllllllllllllIIIIlllIllIIIIllI.init(lIIIlIlIIIIIl[5], secretKeySpec);
            return new String(lllllllllllllllIIIIlllIllIIIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlllIllIIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIlllIllIIIIlIl) {
            lllllllllllllllIIIIlllIllIIIIlIl.printStackTrace();
            return null;
        }
    }

    private static String lIIllllllIIlllI(String lllllllllllllllIIIIlllIlIlllIlll, String lllllllllllllllIIIIlllIlIlllIllI) {
        try {
            SecretKeySpec lllllllllllllllIIIIlllIlIllllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlllIlIlllIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIIlllIlIllllIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIIlllIlIllllIIl.init(lIIIlIlIIIIIl[5], lllllllllllllllIIIIlllIlIllllIlI);
            return new String(lllllllllllllllIIIIlllIlIllllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlllIlIlllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIlllIlIllllIII) {
            lllllllllllllllIIIIlllIlIllllIII.printStackTrace();
            return null;
        }
    }

    public int m() {
        return this.pointsPerGame;
    }

    private c(String str, int i, String str2, int i2, int i3, int i4) {
        this.difficulty = str2;
        this.levelRequirement = i2;
        this.objectID = i3;
        this.pointsPerGame = i4;
    }

    public int k() {
        return this.levelRequirement;
    }

    public int l() {
        return this.objectID;
    }

    private static String lIIllllllIIllII(String lllllllllllllllIIIIlllIllIIlIlII, String lllllllllllllllIIIIlllIllIIllIII) {
        String lllllllllllllllIIIIlllIllIIlIlII2 = new String(Base64.getDecoder().decode(lllllllllllllllIIIIlllIllIIlIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIIIIlllIllIIlIllI = lllllllllllllllIIIIlllIllIIllIII.toCharArray();
        int lllllllllllllllIIIIlllIllIIlIlIl = lIIIlIlIIIIIl[0];
        char[] charArray = lllllllllllllllIIIIlllIllIIlIlII2.toCharArray();
        int lllllllllllllllIIIIlllIllIIIlllI = charArray.length;
        int i = lIIIlIlIIIIIl[0];
        while (lIIllllllIlIIIl(i, lllllllllllllllIIIIlllIllIIIlllI)) {
            sb.append((char) (charArray[i] ^ lllllllllllllllIIIIlllIllIIlIllI[lllllllllllllllIIIIlllIllIIlIlIl % lllllllllllllllIIIIlllIllIIlIllI.length]));
            "".length();
            lllllllllllllllIIIIlllIllIIlIlIl++;
            i++;
            "".length();
            if (" ".length() > "  ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
}
