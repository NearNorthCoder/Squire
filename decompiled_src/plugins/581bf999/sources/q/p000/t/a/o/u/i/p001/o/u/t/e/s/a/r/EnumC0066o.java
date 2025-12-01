package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Point;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.o  reason: invalid package and case insensitive filesystem */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/o.class */
public final class EnumC0066o {
    private static /* synthetic */ String[] llIIIIIllII;
    public static final /* synthetic */ EnumC0066o DEATH;
    public static final /* synthetic */ EnumC0066o LIGHTNING;
    private static /* synthetic */ int[] llIIIIIlllI;
    public static final /* synthetic */ EnumC0066o FIRE;
    private static final /* synthetic */ EnumC0066o[] $VALUES;
    private final /* synthetic */ Set<Point> attack;
    public static final /* synthetic */ EnumC0066o AIR;
    private final /* synthetic */ List<Point> clockwise;

    private static boolean lIIlllIIllllll(int i, int i2) {
        return i < i2;
    }

    public static EnumC0066o[] values() {
        return (EnumC0066o[]) $VALUES.clone();
    }

    public Set<Point> N() {
        return this.attack;
    }

    private EnumC0066o(String str, int i, List list, Set set) {
        this.clockwise = list;
        this.attack = set;
    }

    private static String lIIlllIIllIlII(String llllllllllllllllIlIIIlllIIIIlIll, String llllllllllllllllIlIIIlllIIIIlIlI) {
        String llllllllllllllllIlIIIlllIIIIlIll2 = new String(Base64.getDecoder().decode(llllllllllllllllIlIIIlllIIIIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllllIlIIIlllIIIIlIlI.toCharArray();
        int llllllllllllllllIlIIIlllIIIIIlll = llIIIIIlllI[0];
        char[] charArray2 = llllllllllllllllIlIIIlllIIIIlIll2.toCharArray();
        int length = charArray2.length;
        int i = llIIIIIlllI[0];
        while (lIIlllIIllllll(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[llllllllllllllllIlIIIlllIIIIIlll % charArray.length]));
            "".length();
            llllllllllllllllIlIIIlllIIIIIlll++;
            i++;
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    public static EnumC0066o valueOf(String str) {
        return (EnumC0066o) Enum.valueOf(EnumC0066o.class, str);
    }

    static {
        lIIlllIIlllllI();
        lIIlllIIllIllI();
        DEATH = new EnumC0066o(llIIIIIllII[llIIIIIlllI[0]], llIIIIIlllI[0], List.of(new Point(llIIIIIlllI[1], llIIIIIlllI[2]), new Point(llIIIIIlllI[2], llIIIIIlllI[1]), new Point(llIIIIIlllI[1], llIIIIIlllI[3]), new Point(llIIIIIlllI[4], llIIIIIlllI[5])), Set.of(new Point(llIIIIIlllI[1], llIIIIIlllI[3]), new Point(llIIIIIlllI[1], llIIIIIlllI[2])));
        LIGHTNING = new EnumC0066o(llIIIIIllII[llIIIIIlllI[6]], llIIIIIlllI[6], List.of(new Point(llIIIIIlllI[2], llIIIIIlllI[7]), new Point(llIIIIIlllI[1], llIIIIIlllI[8]), new Point(llIIIIIlllI[4], llIIIIIlllI[9]), new Point(llIIIIIlllI[1], llIIIIIlllI[10])), Set.of(new Point(llIIIIIlllI[1], llIIIIIlllI[8]), new Point(llIIIIIlllI[1], llIIIIIlllI[10])));
        FIRE = new EnumC0066o(llIIIIIllII[llIIIIIlllI[11]], llIIIIIlllI[11], List.of(new Point(llIIIIIlllI[12], llIIIIIlllI[1]), new Point(llIIIIIlllI[13], llIIIIIlllI[3]), new Point(llIIIIIlllI[3], llIIIIIlllI[5]), new Point(llIIIIIlllI[13], llIIIIIlllI[2])), Set.of(new Point(llIIIIIlllI[13], llIIIIIlllI[3]), new Point(llIIIIIlllI[13], llIIIIIlllI[2])));
        AIR = new EnumC0066o(llIIIIIllII[llIIIIIlllI[14]], llIIIIIlllI[14], List.of(new Point(llIIIIIlllI[12], llIIIIIlllI[7]), new Point(llIIIIIlllI[13], llIIIIIlllI[8]), new Point(llIIIIIlllI[3], llIIIIIlllI[9]), new Point(llIIIIIlllI[13], llIIIIIlllI[10])), Set.of(new Point(llIIIIIlllI[13], llIIIIIlllI[8]), new Point(llIIIIIlllI[13], llIIIIIlllI[10])));
        EnumC0066o[] enumC0066oArr = new EnumC0066o[llIIIIIlllI[15]];
        enumC0066oArr[llIIIIIlllI[0]] = DEATH;
        enumC0066oArr[llIIIIIlllI[6]] = LIGHTNING;
        enumC0066oArr[llIIIIIlllI[11]] = FIRE;
        enumC0066oArr[llIIIIIlllI[14]] = AIR;
        $VALUES = enumC0066oArr;
    }

    private static String lIIlllIIllIlIl(String llllllllllllllllIlIIIllIllllIllI, String llllllllllllllllIlIIIllIllllIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIIllIllllIlIl.getBytes(StandardCharsets.UTF_8)), llIIIIIlllI[16]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIIIIlllI[11], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIIllIllllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIIIllIllllIlll) {
            llllllllllllllllIlIIIllIllllIlll.printStackTrace();
            return null;
        }
    }

    private static void lIIlllIIlllllI() {
        llIIIIIlllI = new int[17];
        llIIIIIlllI[0] = ((110 ^ 127) ^ (93 ^ 106)) & (((106 ^ 79) ^ "   ".length()) ^ (-" ".length()));
        llIIIIIlllI[1] = (96 ^ 109) ^ (111 ^ 70);
        llIIIIIlllI[2] = 56 ^ 31;
        llIIIIIlllI[3] = (230 ^ 162) ^ (69 ^ 33);
        llIIIIIlllI[4] = 43 ^ 10;
        llIIIIIlllI[5] = 97 ^ 66;
        llIIIIIlllI[6] = " ".length();
        llIIIIIlllI[7] = 53 ^ 46;
        llIIIIIlllI[8] = (89 ^ 100) ^ (127 ^ 93);
        llIIIIIlllI[9] = (185 ^ 183) ^ (96 ^ 114);
        llIIIIIlllI[10] = (173 ^ 184) ^ (129 ^ 140);
        llIIIIIlllI[11] = "  ".length();
        llIIIIIlllI[12] = 99 ^ 121;
        llIIIIIlllI[13] = 137 ^ 148;
        llIIIIIlllI[14] = "   ".length();
        llIIIIIlllI[15] = (((18 + 195) - 69) + 52) ^ (((18 + 124) - (-36)) + 14);
        llIIIIIlllI[16] = (221 ^ 135) ^ (192 ^ 146);
    }

    private static void lIIlllIIllIllI() {
        llIIIIIllII = new String[llIIIIIlllI[15]];
        llIIIIIllII[llIIIIIlllI[0]] = lIIlllIIllIlII("AikILTg=", "FlIyp");
        llIIIIIllII[llIIIIIlllI[6]] = lIIlllIIllIlII("GS4LHzEbLgIQ", "UgLWe");
        llIIIIIllII[llIIIIIlllI[11]] = lIIlllIIllIlII("DjkCEA==", "HpPUh");
        llIIIIIllII[llIIIIIlllI[14]] = lIIlllIIllIlIl("ZFCVrMeZHtk=", "HnecJ");
    }

    public List<Point> M() {
        return this.clockwise;
    }
}
