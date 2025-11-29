package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.e  reason: invalid package and case insensitive filesystem */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/e.class */
public final class EnumC0056e {
    public static final /* synthetic */ EnumC0056e NECTAR;
    private static /* synthetic */ String[] llIIllllIll;
    private final /* synthetic */ List<Integer> ids;
    public static final /* synthetic */ EnumC0056e SILK_DRESSING;
    private static /* synthetic */ int[] llIIlllllII;
    public static final /* synthetic */ EnumC0056e BLESSED_CRYSTAL_SCARAB;
    public static final /* synthetic */ EnumC0056e TEARS_OF_ELIDINIS;
    public static final /* synthetic */ EnumC0056e SMELLING_SALTS;
    public static final /* synthetic */ EnumC0056e LIQUID_ADRENALINE;
    private static final /* synthetic */ EnumC0056e[] $VALUES;
    public static final /* synthetic */ EnumC0056e AMBROSIA;

    public static EnumC0056e c(int i) {
        EnumC0056e[] values = values();
        int length = values.length;
        int i2 = llIIlllllII[0];
        while (lIlIIlIIIIllIl(i2, length)) {
            EnumC0056e enumC0056e = values[i2];
            if (lIlIIlIIIIlllI(enumC0056e.p().contains(Integer.valueOf(i)) ? 1 : 0)) {
                return enumC0056e;
            }
            i2++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return null;
    }

    private static void lIlIIIllllIlII() {
        llIIlllllII = new int[27];
        llIIlllllII[0] = (131 ^ 142) & ((204 ^ 193) ^ (-1));
        llIIlllllII[1] = (-4161) & 31487;
        llIIlllllII[2] = (-" ".length()) & (-5437) & 32765;
        llIIlllllII[3] = (-4377) & 31707;
        llIIlllllII[4] = (-((-11153) & 16283)) & (-305) & 32767;
        llIIlllllII[5] = " ".length();
        llIIlllllII[6] = (-4101) & 31415;
        llIIlllllII[7] = (-5131) & 32447;
        llIIlllllII[8] = (-1033) & 28351;
        llIIlllllII[9] = (-((-1969) & 6133)) & (-1025) & 32509;
        llIIlllllII[10] = "  ".length();
        llIIlllllII[11] = (-((-16899) & 22019)) & (-257) & 32719;
        llIIlllllII[12] = (-1289) & 28633;
        llIIlllllII[13] = "   ".length();
        llIIlllllII[14] = (-((-12267) & 16383)) & (-1025) & 32479;
        llIIlllllII[15] = (-1) & 27341;
        llIIlllllII[16] = (((90 + 125) - 154) + 133) ^ (((107 + 79) - 162) + 174);
        llIIlllllII[17] = (-((-18569) & 23721)) & (-269) & 32767;
        llIIlllllII[18] = (-((-25489) & 30649)) & (-1) & 32509;
        llIIlllllII[19] = 112 ^ 117;
        llIIlllllII[20] = (-5169) & 32503;
        llIIlllllII[21] = (-5121) & 32457;
        llIIlllllII[22] = 150 ^ 144;
        llIIlllllII[23] = (-325) & 27647;
        llIIlllllII[24] = (-((-13989) & 14247)) & (-5185) & 32767;
        llIIlllllII[25] = 148 ^ 147;
        llIIlllllII[26] = 109 ^ 101;
    }

    private static boolean lIlIIlIIIIlllI(int i) {
        return i != 0;
    }

    private EnumC0056e(String str, int i, List list) {
        this.ids = list;
    }

    public boolean d(int i) {
        return this.ids.contains(Integer.valueOf(i));
    }

    public static EnumC0056e[] values() {
        return (EnumC0056e[]) $VALUES.clone();
    }

    static {
        lIlIIIllllIlII();
        lIlIIIllllIIll();
        TEARS_OF_ELIDINIS = new EnumC0056e(llIIllllIll[llIIlllllII[0]], llIIlllllII[0], List.of(Integer.valueOf(llIIlllllII[1]), Integer.valueOf(llIIlllllII[2]), Integer.valueOf(llIIlllllII[3]), Integer.valueOf(llIIlllllII[4])));
        NECTAR = new EnumC0056e(llIIllllIll[llIIlllllII[5]], llIIlllllII[5], List.of(Integer.valueOf(llIIlllllII[6]), Integer.valueOf(llIIlllllII[7]), Integer.valueOf(llIIlllllII[8]), Integer.valueOf(llIIlllllII[9])));
        SMELLING_SALTS = new EnumC0056e(llIIllllIll[llIIlllllII[10]], llIIlllllII[10], List.of(Integer.valueOf(llIIlllllII[11]), Integer.valueOf(llIIlllllII[12])));
        LIQUID_ADRENALINE = new EnumC0056e(llIIllllIll[llIIlllllII[13]], llIIlllllII[13], List.of(Integer.valueOf(llIIlllllII[14]), Integer.valueOf(llIIlllllII[15])));
        AMBROSIA = new EnumC0056e(llIIllllIll[llIIlllllII[16]], llIIlllllII[16], List.of(Integer.valueOf(llIIlllllII[17]), Integer.valueOf(llIIlllllII[18])));
        BLESSED_CRYSTAL_SCARAB = new EnumC0056e(llIIllllIll[llIIlllllII[19]], llIIlllllII[19], List.of(Integer.valueOf(llIIlllllII[20]), Integer.valueOf(llIIlllllII[21])));
        SILK_DRESSING = new EnumC0056e(llIIllllIll[llIIlllllII[22]], llIIlllllII[22], List.of(Integer.valueOf(llIIlllllII[23]), Integer.valueOf(llIIlllllII[24])));
        EnumC0056e[] enumC0056eArr = new EnumC0056e[llIIlllllII[25]];
        enumC0056eArr[llIIlllllII[0]] = TEARS_OF_ELIDINIS;
        enumC0056eArr[llIIlllllII[5]] = NECTAR;
        enumC0056eArr[llIIlllllII[10]] = SMELLING_SALTS;
        enumC0056eArr[llIIlllllII[13]] = LIQUID_ADRENALINE;
        enumC0056eArr[llIIlllllII[16]] = AMBROSIA;
        enumC0056eArr[llIIlllllII[19]] = BLESSED_CRYSTAL_SCARAB;
        enumC0056eArr[llIIlllllII[22]] = SILK_DRESSING;
        $VALUES = enumC0056eArr;
    }

    private static String lIlIIIllllIIII(String llllllllllllllllIIlllIIIlllllIlI, String llllllllllllllllIIlllIIIlllllIIl) {
        try {
            SecretKeySpec llllllllllllllllIIlllIIIllllllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlllIIIlllllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIlllllII[10], llllllllllllllllIIlllIIIllllllIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlllIIIlllllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlllIIIlllllIll) {
            llllllllllllllllIIlllIIIlllllIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlIIIIllIl(int i, int i2) {
        return i < i2;
    }

    private static String lIlIIIllllIIIl(String llllllllllllllllIIlllIIlIIIlllII, String llllllllllllllllIIlllIIlIIIllIll) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllIIlllIIlIIIlllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlllIIlIIIllIlI = new StringBuilder();
        char[] llllllllllllllllIIlllIIlIIIllIIl = llllllllllllllllIIlllIIlIIIllIll.toCharArray();
        int llllllllllllllllIIlllIIlIIIllIII = llIIlllllII[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = llIIlllllII[0];
        while (lIlIIlIIIIllIl(i, length)) {
            llllllllllllllllIIlllIIlIIIllIlI.append((char) (charArray[i] ^ llllllllllllllllIIlllIIlIIIllIIl[llllllllllllllllIIlllIIlIIIllIII % llllllllllllllllIIlllIIlIIIllIIl.length]));
            "".length();
            llllllllllllllllIIlllIIlIIIllIII++;
            i++;
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllIIlllIIlIIIllIlI);
    }

    private static String lIlIIIllllIIlI(String llllllllllllllllIIlllIIlIIIIIlll, String llllllllllllllllIIlllIIlIIIIIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlllIIlIIIIIllI.getBytes(StandardCharsets.UTF_8)), llIIlllllII[26]), "DES");
            Cipher llllllllllllllllIIlllIIlIIIIlIIl = Cipher.getInstance("DES");
            llllllllllllllllIIlllIIlIIIIlIIl.init(llIIlllllII[10], secretKeySpec);
            return new String(llllllllllllllllIIlllIIlIIIIlIIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlllIIlIIIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlllIIlIIIIlIII) {
            llllllllllllllllIIlllIIlIIIIlIII.printStackTrace();
            return null;
        }
    }

    private static void lIlIIIllllIIll() {
        llIIllllIll = new String[llIIlllllII[25]];
        llIIllllIll[llIIlllllII[0]] = lIlIIIllllIIII("2EfWL05kWwh+/uztxnIOgwviqPk1dyLU", "Iuiqc");
        llIIllllIll[llIIlllllII[5]] = lIlIIIllllIIIl("KysCHCs3", "enAHj");
        llIIllllIll[llIIlllllII[10]] = lIlIIIllllIIIl("OxwjHRUhHyEOCikdMgI=", "hQfQY");
        llIIllllIll[llIIlllllII[13]] = lIlIIIllllIIII("CwSim2M5/a9p6vtdQZZTsz3tIfAGj4uA", "ClJuz");
        llIIllllIll[llIIlllllII[16]] = lIlIIIllllIIlI("LCYUtRybeo6tv9RVVqkM/Q==", "mNTfU");
        llIIllllIll[llIIlllllII[19]] = lIlIIIllllIIII("LgwssUWhp9tIAhNafnLt+hDXWTHZl3O7", "nkjqD");
        llIIllllIll[llIIlllllII[22]] = lIlIIIllllIIIl("Bwc0LQsQHD01Bx0APw==", "TNxfT");
    }

    public List<Integer> p() {
        return this.ids;
    }

    public static EnumC0056e valueOf(String str) {
        return (EnumC0056e) Enum.valueOf(EnumC0056e.class, str);
    }
}
