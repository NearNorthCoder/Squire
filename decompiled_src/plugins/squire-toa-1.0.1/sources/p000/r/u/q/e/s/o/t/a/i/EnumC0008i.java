package p000.r.u.q.e.s.o.t.a.i;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: -.r.u.q.e.s.o.t.a.i.i  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-toa-1.0.1.jar:-/r/u/q/e/s/o/t/a/i/i.class */
public final class EnumC0008i {
    private final /* synthetic */ int regionY;
    public static final /* synthetic */ EnumC0008i DEATH;
    private final /* synthetic */ int objectId;
    public static final /* synthetic */ EnumC0008i AIR;
    private final /* synthetic */ int regionX;
    public static final /* synthetic */ EnumC0008i LIGHTNING;
    private static /* synthetic */ String[] lIIllllllIIll;
    public static final /* synthetic */ EnumC0008i FIRE;
    private static /* synthetic */ int[] lIIllllllIlII;
    private static final /* synthetic */ EnumC0008i[] $VALUES;

    private static boolean lIllIlIlIllIIIl(int i, int i2) {
        return i == i2;
    }

    private static String lIllIlIlIlIlIll(String llllllllllllllIlllIIllllIllIIIIl, String llllllllllllllIlllIIllllIllIIIII) {
        try {
            SecretKeySpec llllllllllllllIlllIIllllIllIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIllllIllIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIIllllIllIIIll = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIIllllIllIIIll.init(lIIllllllIlII[8], llllllllllllllIlllIIllllIllIIlII);
            return new String(llllllllllllllIlllIIllllIllIIIll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIllllIllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIllllIllIIIlI) {
            llllllllllllllIlllIIllllIllIIIlI.printStackTrace();
            return null;
        }
    }

    public static EnumC0008i valueOf(String str) {
        return (EnumC0008i) Enum.valueOf(EnumC0008i.class, str);
    }

    private static void lIllIlIlIlIlllI() {
        lIIllllllIIll = new String[lIIllllllIlII[13]];
        lIIllllllIIll[lIIllllllIlII[0]] = lIllIlIlIlIlIll("XkPDs23kqmo=", "PbOnC");
        lIIllllllIIll[lIIllllllIlII[1]] = lIllIlIlIlIllII("IwodCA==", "eCOMs");
        lIIllllllIIll[lIIllllllIlII[8]] = lIllIlIlIlIlIll("YHEthyYjS4Uc/WIANSzwNA==", "oXjmq");
        lIIllllllIIll[lIIllllllIlII[11]] = lIllIlIlIlIllIl("nn+HCOylQmY=", "eKPFR");
    }

    public int m() {
        return this.objectId;
    }

    public static EnumC0008i a(int i) {
        EnumC0008i[] values = values();
        int length = values.length;
        int i2 = lIIllllllIlII[0];
        while (lIllIlIlIllIIII(i2, length)) {
            EnumC0008i enumC0008i = values[i2];
            if (lIllIlIlIllIIIl(enumC0008i.m(), i)) {
                return enumC0008i;
            }
            i2++;
            "".length();
            if ((false ^ true) & ((true ^ true) ^ true)) {
                return null;
            }
        }
        return null;
    }

    private EnumC0008i(String str, int i, int i2, int i3, int i4) {
        this.objectId = i2;
        this.regionX = i3;
        this.regionY = i4;
    }

    private static String lIllIlIlIlIllIl(String llllllllllllllIlllIIllllIllIlllI, String llllllllllllllIlllIIllllIllIllIl) {
        try {
            SecretKeySpec llllllllllllllIlllIIllllIlllIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIllllIllIllIl.getBytes(StandardCharsets.UTF_8)), lIIllllllIlII[14]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIllllllIlII[8], llllllllllllllIlllIIllllIlllIIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIllllIllIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIllllIllIllll) {
            llllllllllllllIlllIIllllIllIllll.printStackTrace();
            return null;
        }
    }

    private static void lIllIlIlIlIllll() {
        lIIllllllIlII = new int[15];
        lIIllllllIlII[0] = ((((87 + 126) - 139) + 57) ^ (((39 + 75) - (-23)) + 13)) & (((183 ^ 143) ^ (66 ^ 111)) ^ (-" ".length()));
        lIIllllllIlII[1] = " ".length();
        lIIllllllIlII[2] = (-17537) & 32212;
        lIIllllllIlII[3] = (-1105) & 46975;
        lIIllllllIlII[4] = (176 ^ 129) ^ (34 ^ 49);
        lIIllllllIlII[5] = (100 ^ 123) ^ (108 ^ 82);
        lIIllllllIlII[6] = (-19649) & 65516;
        lIIllllllIlII[7] = 102 ^ 121;
        lIIllllllIlII[8] = "  ".length();
        lIIllllllIlII[9] = (-3201) & 49069;
        lIIllllllIlII[10] = (((197 + 88) - 198) + 130) ^ (((29 + 117) - 138) + 191);
        lIIllllllIlII[11] = "   ".length();
        lIIllllllIlII[12] = (-16386) & 62255;
        lIIllllllIlII[13] = (68 ^ 127) ^ (45 ^ 18);
        lIIllllllIlII[14] = (((120 + 53) - 19) + 27) ^ (((20 + 23) - (-136)) + 10);
    }

    private static boolean lIllIlIlIllIIII(int i, int i2) {
        return i < i2;
    }

    public static EnumC0008i[] values() {
        return (EnumC0008i[]) $VALUES.clone();
    }

    static {
        lIllIlIlIlIllll();
        lIllIlIlIlIlllI();
        DEATH = new EnumC0008i(lIIllllllIIll[lIIllllllIlII[0]], lIIllllllIlII[0], lIIllllllIlII[3], lIIllllllIlII[4], lIIllllllIlII[5]);
        FIRE = new EnumC0008i(lIIllllllIIll[lIIllllllIlII[1]], lIIllllllIlII[1], lIIllllllIlII[6], lIIllllllIlII[7], lIIllllllIlII[5]);
        LIGHTNING = new EnumC0008i(lIIllllllIIll[lIIllllllIlII[8]], lIIllllllIlII[8], lIIllllllIlII[9], lIIllllllIlII[4], lIIllllllIlII[10]);
        AIR = new EnumC0008i(lIIllllllIIll[lIIllllllIlII[11]], lIIllllllIlII[11], lIIllllllIlII[12], lIIllllllIlII[7], lIIllllllIlII[10]);
        EnumC0008i[] enumC0008iArr = new EnumC0008i[lIIllllllIlII[13]];
        enumC0008iArr[lIIllllllIlII[0]] = DEATH;
        enumC0008iArr[lIIllllllIlII[1]] = FIRE;
        enumC0008iArr[lIIllllllIlII[8]] = LIGHTNING;
        enumC0008iArr[lIIllllllIlII[11]] = AIR;
        $VALUES = enumC0008iArr;
    }

    public WorldPoint a(Client client) {
        return (WorldPoint) WorldPoint.toLocalInstance(client, new RegionPoint(this.regionX, this.regionY, lIIllllllIlII[1], lIIllllllIlII[2]).toWorld()).stream().findFirst().orElse(null);
    }

    private static String lIllIlIlIlIllII(String llllllllllllllIlllIIlllllIIIIIll, String llllllllllllllIlllIIllllIlllllIl) {
        String llllllllllllllIlllIIlllllIIIIIll2 = new String(Base64.getDecoder().decode(llllllllllllllIlllIIlllllIIIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIlllIIllllIlllllIl.toCharArray();
        int llllllllllllllIlllIIllllIlllllll = lIIllllllIlII[0];
        char[] charArray2 = llllllllllllllIlllIIlllllIIIIIll2.toCharArray();
        int length = charArray2.length;
        int i = lIIllllllIlII[0];
        while (lIllIlIlIllIIII(i, length)) {
            char llllllllllllllIlllIIlllllIIIIlII = charArray2[i];
            sb.append((char) (llllllllllllllIlllIIlllllIIIIlII ^ charArray[llllllllllllllIlllIIllllIlllllll % charArray.length]));
            "".length();
            llllllllllllllIlllIIllllIlllllll++;
            i++;
            "".length();
            if (" ".length() < (((32 ^ 57) ^ (210 ^ 139)) & (((26 ^ 117) ^ (67 ^ 108)) ^ (-" ".length())))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
}
