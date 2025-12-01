package u.i.r.d.s.e.r.q.y.a.h.p000;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: u.i.r.d.s.e.r.q.y.a.h.-.j  reason: invalid package */
/* loaded from: f9dee1ad-dcbf-4af9-9fb8-47dc91e2d43e.jar:u/i/r/d/s/e/r/q/y/a/h/-/j.class */
public final class j {
    private final /* synthetic */ int projectileID;
    public static final /* synthetic */ j RANGED;
    private final /* synthetic */ Prayer prayer;
    private final /* synthetic */ int spriteID;
    private static /* synthetic */ String[] llllIIIlIllI;
    public static final /* synthetic */ j MAGIC;
    private static final /* synthetic */ j[] $VALUES;
    private static /* synthetic */ int[] llllIIIllIIl;

    private static void lIIIllllIIlIlII() {
        llllIIIllIIl = new int[10];
        llllIIIllIIl[0] = ((((116 + 238) - 297) + 185) ^ (((134 + 74) - 145) + 107)) & (((((179 + 194) - 161) + 6) ^ (((44 + 41) - 62) + 107)) ^ (-" ".length()));
        llllIIIllIIl[1] = " ".length();
        llllIIIllIIl[2] = "  ".length();
        llllIIIllIIl[3] = (-((-8761) & 31674)) & (-8193) & 32767;
        llllIIIllIIl[4] = (((106 ^ 1) + (204 ^ 195)) - (45 ^ 95)) + (7 ^ 112);
        llllIIIllIIl[5] = "   ".length();
        llllIIIllIIl[6] = (-((-8299) & 24939)) & (-4097) & 22399;
        llllIIIllIIl[7] = ((69 + 66) - 64) + 57;
        llllIIIllIIl[8] = 125 ^ 121;
        llllIIIllIIl[9] = 21 ^ 29;
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }

    public int W() {
        return this.projectileID;
    }

    private static String lIIIllllIIIlIlI(String lllllllllllllllIIlIllIIIIIIlIlll, String lllllllllllllllIIlIllIIIIIIlIllI) {
        try {
            SecretKeySpec lllllllllllllllIIlIllIIIIIIllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIIIIIIlIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIllIIIIIIllIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIllIIIIIIllIIl.init(llllIIIllIIl[2], lllllllllllllllIIlIllIIIIIIllIlI);
            return new String(lllllllllllllllIIlIllIIIIIIllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIIIIIIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIllIIIIIIllIII) {
            lllllllllllllllIIlIllIIIIIIllIII.printStackTrace();
            return null;
        }
    }

    static {
        lIIIllllIIlIlII();
        lIIIllllIIIlllI();
        MAGIC = new j(llllIIIlIllI[llllIIIllIIl[2]], llllIIIllIIl[0], llllIIIllIIl[3], Prayer.PROTECT_FROM_MAGIC, llllIIIllIIl[4]);
        RANGED = new j(llllIIIlIllI[llllIIIllIIl[5]], llllIIIllIIl[1], llllIIIllIIl[6], Prayer.PROTECT_FROM_MISSILES, llllIIIllIIl[7]);
        j[] jVarArr = new j[llllIIIllIIl[2]];
        jVarArr[llllIIIllIIl[0]] = MAGIC;
        jVarArr[llllIIIllIIl[1]] = RANGED;
        $VALUES = jVarArr;
    }

    private j(String str, int i, int i2, Prayer prayer, int i3) {
        this.projectileID = i2;
        this.prayer = prayer;
        this.spriteID = i3;
    }

    private static void lIIIllllIIIlllI() {
        llllIIIlIllI = new String[llllIIIllIIl[8]];
        llllIIIlIllI[llllIIIllIIl[0]] = lIIIllllIIIlIlI("WaU56uyNm8s=", "CNxlY");
        llllIIIlIllI[llllIIIllIIl[1]] = lIIIllllIIIlIlI("nI8qYrEsPms=", "ySURb");
        llllIIIlIllI[llllIIIllIIl[2]] = lIIIllllIIIlIll("k/Co34yzG1o=", "nBpkH");
        llllIIIlIllI[llllIIIllIIl[5]] = lIIIllllIIIllIl("OQAmLDAv", "kAhku");
    }

    private static String lIIIllllIIIllIl(String lllllllllllllllIIlIllIIIIIlIllII, String lllllllllllllllIIlIllIIIIIlIlIll) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIlIllIIIIIlIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIIlIllIIIIIlIlIIl = lllllllllllllllIIlIllIIIIIlIlIll.toCharArray();
        int lllllllllllllllIIlIllIIIIIlIlIII = llllIIIllIIl[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = llllIIIllIIl[0];
        while (lIIIllllIIlIlIl(i, length)) {
            char lllllllllllllllIIlIllIIIIIlIllIl = charArray[i];
            sb.append((char) (lllllllllllllllIIlIllIIIIIlIllIl ^ lllllllllllllllIIlIllIIIIIlIlIIl[lllllllllllllllIIlIllIIIIIlIlIII % lllllllllllllllIIlIllIIIIIlIlIIl.length]));
            "".length();
            lllllllllllllllIIlIllIIIIIlIlIII++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIIIllllIIlIlIl(int i, int i2) {
        return i < i2;
    }

    private static String lIIIllllIIIlIll(String lllllllllllllllIIlIllIIIIIllllII, String lllllllllllllllIIlIllIIIIIlllIll) {
        try {
            SecretKeySpec lllllllllllllllIIlIllIIIIIllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIIIIIlllIll.getBytes(StandardCharsets.UTF_8)), llllIIIllIIl[9]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llllIIIllIIl[2], lllllllllllllllIIlIllIIIIIllllll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIIIIIllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIllIIIIIllllIl) {
            lllllllllllllllIIlIllIIIIIllllIl.printStackTrace();
            return null;
        }
    }

    public int Y() {
        return this.spriteID;
    }

    public Prayer X() {
        return this.prayer;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    @Override // java.lang.Enum
    public String toString() {
        String str = super.toString();
        return str.charAt(llllIIIllIIl[0]) + str.substring(llllIIIllIIl[1]).replaceAll(llllIIIlIllI[llllIIIllIIl[0]], llllIIIlIllI[llllIIIllIIl[1]]).toLowerCase();
    }
}
