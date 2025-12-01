package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import com.google.common.primitives.Ints;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.N  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/N.class */
public final class N {
    public static final /* synthetic */ N NECHRYAEL;
    private final /* synthetic */ WorldPoint sw;
    private final /* synthetic */ List<Integer> dropTable;
    private static /* synthetic */ String[] llIlIlll;
    private final /* synthetic */ WorldPoint second;
    private static final /* synthetic */ N[] $VALUES;
    private final /* synthetic */ int id;
    private final /* synthetic */ WorldPoint ne;
    public static final /* synthetic */ N SMOKE_DEVIL;
    private final /* synthetic */ WorldPoint first;
    private static /* synthetic */ int[] llIllIII;
    public static final /* synthetic */ N DUST_DEVIL;

    public WorldPoint aJ() {
        return this.first;
    }

    public List<Integer> aL() {
        return this.dropTable;
    }

    private static void llIIIIIlll() {
        llIllIII = new int[55];
        llIllIII[0] = (3 ^ 97) & ((252 ^ 158) ^ (-1));
        llIllIII[1] = (-17281) & 24529;
        llIllIII[2] = (-((-205) & 16589)) & (-6473) & 24572;
        llIllIII[3] = (-16417) & 26429;
        llIllIII[4] = (-26699) & 28415;
        llIllIII[5] = (-22689) & 32702;
        llIllIII[6] = (-2371) & 4075;
        llIllIII[7] = (-20674) & 30683;
        llIllIII[8] = (-28995) & 30714;
        llIllIII[9] = (-20635) & 30655;
        llIllIII[10] = " ".length();
        llIllIII[11] = (-16529) & 23806;
        llIllIII[12] = (-20498) & 22205;
        llIllIII[13] = (-4098) & 14183;
        llIllIII[14] = (-((-8613) & 31205)) & (-19) & 24319;
        llIllIII[15] = (-((-5757) & 24319)) & (-4097) & 32743;
        llIllIII[16] = (-2313) & 4013;
        llIllIII[17] = (-4225) & 14301;
        llIllIII[18] = (-26632) & 28343;
        llIllIII[19] = (-((-26853) & 30957)) & (-2049) & 16239;
        llIllIII[20] = (((111 + 54) - 159) + 148) ^ (((43 + 48) - 56) + 104);
        llIllIII[21] = (-12945) & 14303;
        llIllIII[22] = (-17161) & 18345;
        llIllIII[23] = "  ".length();
        llIllIII[24] = (-((-165) & 3581)) & (-8833) & 16379;
        llIllIII[25] = "   ".length();
        llIllIII[26] = (-31527) & 32639;
        llIllIII[27] = (115 ^ 92) ^ (20 ^ 63);
        llIllIII[28] = (-((-1027) & 28423)) & (-129) & 28671;
        llIllIII[29] = (145 ^ 184) ^ (189 ^ 145);
        llIllIII[30] = (-((-1033) & 24125)) & (-1) & 24255;
        llIllIII[31] = 76 ^ 74;
        llIllIII[32] = (-((-18050) & 32719)) & (-1025) & 16255;
        llIllIII[33] = 52 ^ 51;
        llIllIII[34] = (-1348) & 1907;
        llIllIII[35] = (((25 + 143) - (-28)) + 6) ^ (((23 + 94) - 112) + 189);
        llIllIII[36] = (-((-537) & 30553)) & (-1) & 30581;
        llIllIII[37] = 7 ^ 14;
        llIllIII[38] = (-26633) & 27198;
        llIllIII[39] = 205 ^ 199;
        llIllIII[40] = (-11010) & 16309;
        llIllIII[41] = 167 ^ 172;
        llIllIII[42] = (-((-21015) & 29495)) & (-1) & 28159;
        llIllIII[43] = (((159 + 56) - 25) + 13) ^ (((27 + 171) - 150) + 151);
        llIllIII[44] = (-8723) & 28403;
        llIllIII[45] = (149 ^ 161) ^ (186 ^ 131);
        llIllIII[46] = (-8721) & 28403;
        llIllIII[47] = 72 ^ 70;
        llIllIII[48] = (-((-3917) & 20431)) & (-2049) & 19967;
        llIllIII[49] = 152 ^ 151;
        llIllIII[50] = (-30097) & 30713;
        llIllIII[51] = (19 ^ 31) ^ (189 ^ 161);
        llIllIII[52] = (-9345) & 9723;
        llIllIII[53] = (-2561) & 3058;
        llIllIII[54] = -" ".length();
    }

    private static void llIIIIIllI() {
        llIlIlll = new String[llIllIII[25]];
        llIlIlll[llIllIII[0]] = llIIIIIIlI("J/hQa0o8AJB+ORKKq9FRGw==", "ZwcHz");
        llIlIlll[llIllIII[10]] = llIIIIIlII("Ox8sPxUsGyo7", "uZowG");
        llIlIlll[llIllIII[23]] = llIIIIIlIl("mtDWFZvTE+w8m5skDtNTgQ==", "OoALy");
    }

    private N(String str, int i2, int i3, WorldPoint worldPoint, WorldPoint worldPoint2, WorldPoint worldPoint3, WorldPoint worldPoint4, int... iArr) {
        this.id = i3;
        this.first = worldPoint;
        this.second = worldPoint2;
        this.sw = worldPoint3;
        this.ne = worldPoint4;
        this.dropTable = Ints.asList(iArr);
    }

    public boolean g(WorldPoint worldPoint) {
        return WorldPoint.isInZone(this.sw, this.ne, worldPoint);
    }

    public static N valueOf(String str) {
        return (N) Enum.valueOf(N.class, str);
    }

    public static N[] values() {
        return (N[]) $VALUES.clone();
    }

    private static String llIIIIIlII(String llIlIlIlIIllIII, String llIlIlIlIIlIlll) {
        String llIlIlIlIIllIII2 = new String(Base64.getDecoder().decode(llIlIlIlIIllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llIlIlIlIIlIlIl = llIlIlIlIIlIlll.toCharArray();
        int llIlIlIlIIlIlII = llIllIII[0];
        char[] charArray = llIlIlIlIIllIII2.toCharArray();
        int length = charArray.length;
        int i2 = llIllIII[0];
        while (llIIIIlIlI(i2, length)) {
            sb.append((char) (charArray[i2] ^ llIlIlIlIIlIlIl[llIlIlIlIIlIlII % llIlIlIlIIlIlIl.length]));
            "".length();
            llIlIlIlIIlIlII++;
            i2++;
            "".length();
            if (((90 ^ 57) ^ (39 ^ 64)) < 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    public int h(WorldPoint worldPoint) {
        return Math.min(worldPoint.distanceTo(this.first), worldPoint.distanceTo(this.second));
    }

    static {
        llIIIIIlll();
        llIIIIIllI();
        DUST_DEVIL = new N(llIlIlll[llIllIII[0]], llIllIII[0], llIllIII[1], new WorldPoint(llIllIII[2], llIllIII[3], llIllIII[0]), new WorldPoint(llIllIII[4], llIllIII[5], llIllIII[0]), new WorldPoint(llIllIII[6], llIllIII[7], llIllIII[0]), new WorldPoint(llIllIII[8], llIllIII[9], llIllIII[0]), new int[llIllIII[0]]);
        String str = llIlIlll[llIllIII[10]];
        int i2 = llIllIII[10];
        int i3 = llIllIII[11];
        WorldPoint worldPoint = new WorldPoint(llIllIII[12], llIllIII[13], llIllIII[0]);
        WorldPoint worldPoint2 = new WorldPoint(llIllIII[14], llIllIII[15], llIllIII[0]);
        WorldPoint worldPoint3 = new WorldPoint(llIllIII[16], llIllIII[17], llIllIII[0]);
        WorldPoint worldPoint4 = new WorldPoint(llIllIII[18], llIllIII[19], llIllIII[0]);
        int[] iArr = new int[llIllIII[20]];
        iArr[llIllIII[0]] = llIllIII[21];
        iArr[llIllIII[10]] = llIllIII[22];
        iArr[llIllIII[23]] = llIllIII[24];
        iArr[llIllIII[25]] = llIllIII[26];
        iArr[llIllIII[27]] = llIllIII[28];
        iArr[llIllIII[29]] = llIllIII[30];
        iArr[llIllIII[31]] = llIllIII[32];
        iArr[llIllIII[33]] = llIllIII[34];
        iArr[llIllIII[35]] = llIllIII[36];
        iArr[llIllIII[37]] = llIllIII[38];
        iArr[llIllIII[39]] = llIllIII[40];
        iArr[llIllIII[41]] = llIllIII[42];
        iArr[llIllIII[43]] = llIllIII[44];
        iArr[llIllIII[45]] = llIllIII[46];
        iArr[llIllIII[47]] = llIllIII[48];
        iArr[llIllIII[49]] = llIllIII[50];
        iArr[llIllIII[51]] = llIllIII[52];
        NECHRYAEL = new N(str, i2, i3, worldPoint, worldPoint2, worldPoint3, worldPoint4, iArr);
        SMOKE_DEVIL = new N(llIlIlll[llIllIII[23]], llIllIII[23], llIllIII[53], new WorldPoint(llIllIII[54], llIllIII[54], llIllIII[54]), new WorldPoint(llIllIII[54], llIllIII[54], llIllIII[54]), new WorldPoint(llIllIII[54], llIllIII[54], llIllIII[10]), new WorldPoint(llIllIII[54], llIllIII[54], llIllIII[54]), new int[llIllIII[0]]);
        N[] nArr = new N[llIllIII[25]];
        nArr[llIllIII[0]] = DUST_DEVIL;
        nArr[llIllIII[10]] = NECHRYAEL;
        nArr[llIllIII[23]] = SMOKE_DEVIL;
        $VALUES = nArr;
    }

    public int P() {
        return this.id;
    }

    public WorldPoint aK() {
        return this.second;
    }

    private static String llIIIIIIlI(String llIlIlIlIllIlIl, String llIlIlIlIllIlII) {
        try {
            SecretKeySpec llIlIlIlIlllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIlIlIlIllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIlIlIlIllIlll = Cipher.getInstance("Blowfish");
            llIlIlIlIllIlll.init(llIllIII[23], llIlIlIlIlllIII);
            return new String(llIlIlIlIllIlll.doFinal(Base64.getDecoder().decode(llIlIlIlIllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIlIlIlIllIllI) {
            llIlIlIlIllIllI.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIlIlI(int i2, int i3) {
        return i2 < i3;
    }

    private static String llIIIIIlIl(String llIlIlIlIlIlIII, String llIlIlIlIlIIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIlIlIlIlIIlll.getBytes(StandardCharsets.UTF_8)), llIllIII[35]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIllIII[23], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIlIlIlIlIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIlIlIlIlIlIIl) {
            llIlIlIlIlIlIIl.printStackTrace();
            return null;
        }
    }
}
