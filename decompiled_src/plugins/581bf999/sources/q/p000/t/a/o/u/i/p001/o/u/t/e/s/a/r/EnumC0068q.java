package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Point;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.q  reason: invalid package and case insensitive filesystem */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/q.class */
public final class EnumC0068q {
    private static /* synthetic */ int[] lIlllIIIIII;
    private static /* synthetic */ String[] lIllIllllll;
    private final /* synthetic */ List<Point> boulders;
    private final /* synthetic */ Point stand;
    private static final /* synthetic */ EnumC0068q[] $VALUES;
    public static final /* synthetic */ EnumC0068q FIRST;
    public static final /* synthetic */ EnumC0068q THIRD;
    public static final /* synthetic */ EnumC0068q FOURTH;
    private final /* synthetic */ Point jug;
    public static final /* synthetic */ EnumC0068q SECOND;
    public static final /* synthetic */ EnumC0068q FIFTH;

    public static EnumC0068q valueOf(String str) {
        return (EnumC0068q) Enum.valueOf(EnumC0068q.class, str);
    }

    private static String lIIllIIIIIllll(String llllllllllllllllIlIIlllIlllllIIl, String llllllllllllllllIlIIlllIlllllIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIlllIlllllIII.getBytes(StandardCharsets.UTF_8)), lIlllIIIIII[17]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlllIIIIII[8], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIlllIlllllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIIlllIlllllIlI) {
            llllllllllllllllIlIIlllIlllllIlI.printStackTrace();
            return null;
        }
    }

    private static void lIIllIIIIlllII() {
        lIlllIIIIII = new int[18];
        lIlllIIIIII[0] = ((237 ^ 139) ^ (91 ^ 37)) & (((120 ^ 85) ^ (110 ^ 91)) ^ (-" ".length()));
        lIlllIIIIII[1] = (((93 + 93) - 184) + 161) ^ (((178 + 20) - 55) + 43);
        lIlllIIIIII[2] = (((88 + 79) - 59) + 34) ^ (((137 + 48) - 91) + 50);
        lIlllIIIIII[3] = (175 ^ 169) ^ (217 ^ 192);
        lIlllIIIIII[4] = (((30 + 46) - (-67)) + 37) ^ (((13 + 47) - (-64)) + 48);
        lIlllIIIIII[5] = 183 ^ 151;
        lIlllIIIIII[6] = " ".length();
        lIlllIIIIII[7] = (223 ^ 188) ^ (28 ^ 94);
        lIlllIIIIII[8] = "  ".length();
        lIlllIIIIII[9] = (98 ^ 89) ^ (57 ^ 21);
        lIlllIIIIII[10] = 49 ^ 42;
        lIlllIIIIII[11] = (234 ^ 134) ^ (240 ^ 134);
        lIlllIIIIII[12] = "   ".length();
        lIlllIIIIII[13] = (168 ^ 195) ^ (212 ^ 186);
        lIlllIIIIII[14] = 177 ^ 181;
        lIlllIIIIII[15] = 33 ^ 3;
        lIlllIIIIII[16] = 160 ^ 131;
        lIlllIIIIII[17] = (39 ^ 72) ^ (63 ^ 88);
    }

    public static EnumC0068q[] values() {
        return (EnumC0068q[]) $VALUES.clone();
    }

    private static boolean lIIllIIIIlllIl(int i, int i2) {
        return i < i2;
    }

    private EnumC0068q(String str, int i, List list, Point point, Point point2) {
        this.boulders = list;
        this.jug = point;
        this.stand = point2;
    }

    private static String lIIllIIIIlIIIl(String llllllllllllllllIlIIllllIIIIlllI, String llllllllllllllllIlIIllllIIIIlIII) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllIlIIllllIIIIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllllIlIIllllIIIIlIII.toCharArray();
        int llllllllllllllllIlIIllllIIIIIlIl = lIlllIIIIII[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int llllllllllllllllIlIIllllIIIIIIlI = lIlllIIIIII[0];
        while (lIIllIIIIlllIl(llllllllllllllllIlIIllllIIIIIIlI, length)) {
            sb.append((char) (charArray2[llllllllllllllllIlIIllllIIIIIIlI] ^ charArray[llllllllllllllllIlIIllllIIIIIlIl % charArray.length]));
            "".length();
            llllllllllllllllIlIIllllIIIIIlIl++;
            llllllllllllllllIlIIllllIIIIIIlI++;
            "".length();
            if ("  ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void lIIllIIIIllIll() {
        lIllIllllll = new String[lIlllIIIIII[13]];
        lIllIllllll[lIlllIIIIII[0]] = lIIllIIIIIllll("szlAIzKyAvE=", "TGHDj");
        lIllIllllll[lIlllIIIIII[6]] = lIIllIIIIlIIIl("NgExPjYh", "eDrqx");
        lIllIllllll[lIlllIIIIII[8]] = lIIllIIIIlIIlI("7ZzEsqrAV0w=", "zRikV");
        lIllIllllll[lIlllIIIIII[12]] = lIIllIIIIlIIIl("PjUnFjIw", "xzrDf");
        lIllIllllll[lIlllIIIIII[14]] = lIIllIIIIlIIlI("CT1Po+jslYI=", "JQLQx");
    }

    static {
        lIIllIIIIlllII();
        lIIllIIIIllIll();
        FIRST = new EnumC0068q(lIllIllllll[lIlllIIIIII[0]], lIlllIIIIII[0], List.of(new Point(lIlllIIIIII[1], lIlllIIIIII[2]), new Point(lIlllIIIIII[1], lIlllIIIIII[3]), new Point(lIlllIIIIII[4], lIlllIIIIII[5])), new Point(lIlllIIIIII[6], lIlllIIIIII[6]), new Point(lIlllIIIIII[6], lIlllIIIIII[6]));
        SECOND = new EnumC0068q(lIllIllllll[lIlllIIIIII[6]], lIlllIIIIII[6], List.of(new Point(lIlllIIIIII[1], lIlllIIIIII[3]), new Point(lIlllIIIIII[4], lIlllIIIIII[5]), new Point(lIlllIIIIII[1], lIlllIIIIII[7])), new Point(lIlllIIIIII[6], lIlllIIIIII[6]), new Point(lIlllIIIIII[6], lIlllIIIIII[6]));
        THIRD = new EnumC0068q(lIllIllllll[lIlllIIIIII[8]], lIlllIIIIII[8], List.of(new Point(lIlllIIIIII[4], lIlllIIIIII[3]), new Point(lIlllIIIIII[1], lIlllIIIIII[5]), new Point(lIlllIIIIII[9], lIlllIIIIII[7])), new Point(lIlllIIIIII[1], lIlllIIIIII[10]), new Point(lIlllIIIIII[1], lIlllIIIIII[11]));
        FOURTH = new EnumC0068q(lIllIllllll[lIlllIIIIII[12]], lIlllIIIIII[12], List.of(new Point(lIlllIIIIII[9], lIlllIIIIII[5]), new Point(lIlllIIIIII[9], lIlllIIIIII[7])), new Point(lIlllIIIIII[6], lIlllIIIIII[6]), new Point(lIlllIIIIII[1], lIlllIIIIII[13]));
        FIFTH = new EnumC0068q(lIllIllllll[lIlllIIIIII[14]], lIlllIIIIII[14], List.of(new Point(lIlllIIIIII[9], lIlllIIIIII[7]), new Point(lIlllIIIIII[9], lIlllIIIIII[15]), new Point(lIlllIIIIII[9], lIlllIIIIII[16])), new Point(lIlllIIIIII[6], lIlllIIIIII[6]), new Point(lIlllIIIIII[6], lIlllIIIIII[6]));
        EnumC0068q[] enumC0068qArr = new EnumC0068q[lIlllIIIIII[13]];
        enumC0068qArr[lIlllIIIIII[0]] = FIRST;
        enumC0068qArr[lIlllIIIIII[6]] = SECOND;
        enumC0068qArr[lIlllIIIIII[8]] = THIRD;
        enumC0068qArr[lIlllIIIIII[12]] = FOURTH;
        enumC0068qArr[lIlllIIIIII[14]] = FIFTH;
        $VALUES = enumC0068qArr;
    }

    private static String lIIllIIIIlIIlI(String llllllllllllllllIlIIlllIlllIllII, String llllllllllllllllIlIIlllIlllIlIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIlllIlllIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlllIIIIII[8], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIlllIlllIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIIlllIlllIllIl) {
            llllllllllllllllIlIIlllIlllIllIl.printStackTrace();
            return null;
        }
    }
}
