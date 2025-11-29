package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.bO  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/bO.class */
public final class bO {
    private static final /* synthetic */ bO[] $VALUES;
    public static final /* synthetic */ bO FUNGUS;
    private static /* synthetic */ String[] llIIlllIl;
    private static /* synthetic */ int[] llIIllllI;
    public static final /* synthetic */ bO SWAMP_TOAD;
    public static final /* synthetic */ bO SNAPE_GRASS;
    private final /* synthetic */ int id;

    private static String lIllIlIIlll(String lIllIIlIIlIIIII, String lIllIIlIIIlllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIllIIlIIIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIllIIlIIlIIIlI = Cipher.getInstance("Blowfish");
            lIllIIlIIlIIIlI.init(llIIllllI[4], secretKeySpec);
            return new String(lIllIIlIIlIIIlI.doFinal(Base64.getDecoder().decode(lIllIIlIIlIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIllIIlIIlIIIIl) {
            lIllIIlIIlIIIIl.printStackTrace();
            return null;
        }
    }

    private static void lIllIlIlIII() {
        llIIlllIl = new String[llIIllllI[6]];
        llIIlllIl[llIIllllI[0]] = lIllIlIIllI("KAY9MhE9", "nSsuD");
        llIIlllIl[llIIllllI[2]] = lIllIlIIllI("JxwjKSsrFTA4PSc=", "tRbyn");
        llIIlllIl[llIIllllI[4]] = lIllIlIIlll("qwQ6KZP0KmY8dEwjeg5mWg==", "jXcHJ");
    }

    private static void lIllIlIlIIl() {
        llIIllllI = new int[7];
        llIIllllI[0] = ((((70 + 34) - 92) + 123) ^ (((37 + 23) - 46) + 138)) & (((41 ^ 120) ^ (136 ^ 198)) ^ (-" ".length()));
        llIIllllI[1] = (-((-12291) & 13415)) & (-28674) & 32767;
        llIIllllI[2] = " ".length();
        llIIllllI[3] = ((129 + 155) - 136) + 83;
        llIIllllI[4] = "  ".length();
        llIIllllI[5] = (-1943) & 4094;
        llIIllllI[6] = "   ".length();
    }

    static {
        lIllIlIlIIl();
        lIllIlIlIII();
        FUNGUS = new bO(llIIlllIl[llIIllllI[0]], llIIllllI[0], llIIllllI[1]);
        SNAPE_GRASS = new bO(llIIlllIl[llIIllllI[2]], llIIllllI[2], llIIllllI[3]);
        SWAMP_TOAD = new bO(llIIlllIl[llIIllllI[4]], llIIllllI[4], llIIllllI[5]);
        bO[] bOVarArr = new bO[llIIllllI[6]];
        bOVarArr[llIIllllI[0]] = FUNGUS;
        bOVarArr[llIIllllI[2]] = SNAPE_GRASS;
        bOVarArr[llIIllllI[4]] = SWAMP_TOAD;
        $VALUES = bOVarArr;
    }

    private static boolean lIllIlIlIlI(int i2, int i3) {
        return i2 < i3;
    }

    private bO(String str, int i2, int i3) {
        this.id = i3;
    }

    private static String lIllIlIIllI(String lIllIIlIIllIlIl, String lIllIIlIIllIlII) {
        String lIllIIlIIllIlIl2 = new String(Base64.getDecoder().decode(lIllIIlIIllIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIllIIlIIllIIll = new StringBuilder();
        char[] lIllIIlIIllIIlI = lIllIIlIIllIlII.toCharArray();
        int lIllIIlIIllIIIl = llIIllllI[0];
        char[] charArray = lIllIIlIIllIlIl2.toCharArray();
        int length = charArray.length;
        int i2 = llIIllllI[0];
        while (lIllIlIlIlI(i2, length)) {
            lIllIIlIIllIIll.append((char) (charArray[i2] ^ lIllIIlIIllIIlI[lIllIIlIIllIIIl % lIllIIlIIllIIlI.length]));
            "".length();
            lIllIIlIIllIIIl++;
            i2++;
            "".length();
            if ("  ".length() <= (((((37 + 180) - 204) + 198) ^ (((37 + 77) - 28) + 73)) & (((((132 + 86) - 182) + 106) ^ (((101 + 15) - (-10)) + 68)) ^ (-" ".length())))) {
                return null;
            }
        }
        return String.valueOf(lIllIIlIIllIIll);
    }

    public static bO[] values() {
        return (bO[]) $VALUES.clone();
    }

    public int P() {
        return this.id;
    }

    public static bO valueOf(String str) {
        return (bO) Enum.valueOf(bO.class, str);
    }
}
