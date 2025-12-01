package r.o.u.a.r.v.s.i.s.v.q.d.r.i.p000.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.HeadIcon;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.j  reason: invalid package */
/* loaded from: 861c713a-2076-4f84-9c7c-f1dff7263a11.jar:r/o/u/a/r/v/s/i/s/v/q/d/r/i/-/e/j.class */
public final class j {
    private static final /* synthetic */ j[] $VALUES;
    public static final /* synthetic */ j RANGED;
    public static final /* synthetic */ j MAGIC;
    private static /* synthetic */ String[] lIlIlIIIIlIII;
    private final /* synthetic */ HeadIcon protection;
    public static final /* synthetic */ j STAB;
    private static /* synthetic */ int[] lIlIlIIIIlIIl;
    public static final /* synthetic */ j CRUSH;
    private final /* synthetic */ int styleSpriteId;
    public static final /* synthetic */ j SLASH;
    static /* synthetic */ j[] MELEE_STYLES;

    public int L() {
        return this.styleSpriteId;
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }

    private static boolean lIllllIlIIIllII(int i, int i2) {
        return i < i2;
    }

    static {
        lIllllIlIIIlIll();
        lIllllIlIIIlIlI();
        STAB = new j(lIlIlIIIIlIII[lIlIlIIIIlIIl[0]], lIlIlIIIIlIIl[0], HeadIcon.MELEE, lIlIlIIIIlIIl[1]);
        SLASH = new j(lIlIlIIIIlIII[lIlIlIIIIlIIl[2]], lIlIlIIIIlIIl[2], HeadIcon.MELEE, lIlIlIIIIlIIl[3]);
        CRUSH = new j(lIlIlIIIIlIII[lIlIlIIIIlIIl[4]], lIlIlIIIIlIIl[4], HeadIcon.MELEE, lIlIlIIIIlIIl[5]);
        RANGED = new j(lIlIlIIIIlIII[lIlIlIIIIlIIl[6]], lIlIlIIIIlIIl[6], HeadIcon.RANGED, lIlIlIIIIlIIl[7]);
        MAGIC = new j(lIlIlIIIIlIII[lIlIlIIIIlIIl[8]], lIlIlIIIIlIIl[8], HeadIcon.MAGIC, lIlIlIIIIlIIl[9]);
        j[] jVarArr = new j[lIlIlIIIIlIIl[10]];
        jVarArr[lIlIlIIIIlIIl[0]] = STAB;
        jVarArr[lIlIlIIIIlIIl[2]] = SLASH;
        jVarArr[lIlIlIIIIlIIl[4]] = CRUSH;
        jVarArr[lIlIlIIIIlIIl[6]] = RANGED;
        jVarArr[lIlIlIIIIlIIl[8]] = MAGIC;
        $VALUES = jVarArr;
        j[] jVarArr2 = new j[lIlIlIIIIlIIl[6]];
        jVarArr2[lIlIlIIIIlIIl[0]] = STAB;
        jVarArr2[lIlIlIIIIlIIl[2]] = SLASH;
        jVarArr2[lIlIlIIIIlIIl[4]] = CRUSH;
        MELEE_STYLES = jVarArr2;
    }

    private static void lIllllIlIIIlIlI() {
        lIlIlIIIIlIII = new String[lIlIlIIIIlIIl[10]];
        lIlIlIIIIlIII[lIlIlIIIIlIIl[0]] = lIllllIlIIIlIII("ODAgJw==", "kdaek");
        lIlIlIIIIlIII[lIlIlIIIIlIIl[2]] = lIllllIlIIIlIII("BzswPgI=", "TwqmJ");
        lIlIlIIIIlIII[lIlIlIIIIlIIl[4]] = lIllllIlIIIlIIl("QKzqAI3B37A=", "nGEHz");
        lIlIlIIIIlIII[lIlIlIIIIlIIl[6]] = lIllllIlIIIlIIl("pNgYYhFeU54=", "MnEJj");
        lIlIlIIIIlIII[lIlIlIIIIlIIl[8]] = lIllllIlIIIlIII("JCANJwc=", "iaJnD");
    }

    public HeadIcon K() {
        return this.protection;
    }

    private j(String str, int i, HeadIcon headIcon, int i2) {
        this.protection = headIcon;
        this.styleSpriteId = i2;
    }

    private static void lIllllIlIIIlIll() {
        lIlIlIIIIlIIl = new int[12];
        lIlIlIIIIlIIl[0] = ((50 ^ 44) ^ (58 ^ 60)) & (((((103 + 204) - 168) + 80) ^ (((164 + 131) - 169) + 69)) ^ (-" ".length()));
        lIlIlIIIIlIIl[1] = ((102 + 228) - 304) + 214;
        lIlIlIIIIlIIl[2] = " ".length();
        lIlIlIIIIlIIl[3] = (((83 ^ 94) + (((4 + 161) - 27) + 31)) - (-(35 ^ 46))) + (21 ^ 62);
        lIlIlIIIIlIIl[4] = "  ".length();
        lIlIlIIIIlIIl[5] = (((((17 + 135) - 17) + 33) + (59 ^ 50)) - (-(225 ^ 171))) + (73 ^ 77);
        lIlIlIIIIlIIl[6] = "   ".length();
        lIlIlIIIIlIIl[7] = (((12 ^ 39) + (((109 + 99) - 198) + 175)) - (((35 + 141) - 110) + 87)) + (208 ^ 173);
        lIlIlIIIIlIIl[8] = 122 ^ 126;
        lIlIlIIIIlIIl[9] = ((50 + 90) - 24) + 86;
        lIlIlIIIIlIIl[10] = (((124 + 3) - 46) + 83) ^ (((155 + 157) - 284) + 133);
        lIlIlIIIIlIIl[11] = (25 ^ 51) ^ (45 ^ 15);
    }

    private static String lIllllIlIIIlIII(String llllllllllllllIllIllIIlIIIlllIIl, String llllllllllllllIllIllIIlIIIlllIII) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllIllIIlIIIlllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIllIllIIlIIIlllIII.toCharArray();
        int llllllllllllllIllIllIIlIIIllIlIl = lIlIlIIIIlIIl[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIlIlIIIIlIIl[0];
        while (lIllllIlIIIllII(i, length)) {
            char llllllllllllllIllIllIIlIIIlllIlI = charArray2[i];
            sb.append((char) (llllllllllllllIllIllIIlIIIlllIlI ^ charArray[llllllllllllllIllIllIIlIIIllIlIl % charArray.length]));
            "".length();
            llllllllllllllIllIllIIlIIIllIlIl++;
            i++;
            "".length();
            if ("  ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String lIllllIlIIIlIIl(String llllllllllllllIllIllIIlIIIlIIlII, String llllllllllllllIllIllIIlIIIlIIIll) {
        try {
            SecretKeySpec llllllllllllllIllIllIIlIIIlIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIllIIlIIIlIIIll.getBytes(StandardCharsets.UTF_8)), lIlIlIIIIlIIl[11]), "DES");
            Cipher llllllllllllllIllIllIIlIIIlIIllI = Cipher.getInstance("DES");
            llllllllllllllIllIllIIlIIIlIIllI.init(lIlIlIIIIlIIl[4], llllllllllllllIllIllIIlIIIlIIlll);
            return new String(llllllllllllllIllIllIIlIIIlIIllI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIllIIlIIIlIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIllIIlIIIlIIlIl) {
            llllllllllllllIllIllIIlIIIlIIlIl.printStackTrace();
            return null;
        }
    }

    public boolean J() {
        return List.of((Object[]) MELEE_STYLES).contains(this);
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }
}
