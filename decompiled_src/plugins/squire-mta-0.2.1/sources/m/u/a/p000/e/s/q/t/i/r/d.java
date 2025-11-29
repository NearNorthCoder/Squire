package m.u.a.p000.e.s.q.t.i.r;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: m.u.a.-.e.s.q.t.i.r.d  reason: invalid package */
/* loaded from: squire-mta-0.2.1.jar:m/u/a/-/e/s/q/t/i/r/d.class */
public final class d {
    public static final /* synthetic */ d POSSIBLY_EMPTY;
    public static final /* synthetic */ d RUNE_LONGSWORD;
    public static final /* synthetic */ d UNKNOWN;
    public static final /* synthetic */ d EMPTY;
    private static /* synthetic */ String[] lllIlIllllll;
    public static final /* synthetic */ d EMERALD;
    private final /* synthetic */ int id;
    public static final /* synthetic */ d ADAMANT_MED_HELM;
    private final /* synthetic */ String name;
    private static final /* synthetic */ d[] $VALUES;
    public static final /* synthetic */ d ADAMANT_KITESHIELD;
    private static /* synthetic */ int[] lllIllIIIIIl;
    public static final /* synthetic */ d LEATHER_BOOTS;

    private static String lIIIllIIlIlllIl(String lllllllllllllllIIllIlIIlIIlIIlIl, String lllllllllllllllIIllIlIIlIIlIIlII) {
        try {
            SecretKeySpec lllllllllllllllIIllIlIIlIIlIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIIlIIlIIlII.getBytes(StandardCharsets.UTF_8)), lllIllIIIIIl[12]), "DES");
            Cipher lllllllllllllllIIllIlIIlIIlIIlll = Cipher.getInstance("DES");
            lllllllllllllllIIllIlIIlIIlIIlll.init(lllIllIIIIIl[3], lllllllllllllllIIllIlIIlIIlIlIII);
            return new String(lllllllllllllllIIllIlIIlIIlIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIIlIIlIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIlIIlIIlIIllI) {
            lllllllllllllllIIllIlIIlIIlIIllI.printStackTrace();
            return null;
        }
    }

    public int i() {
        return this.id;
    }

    private d(String str, int i, String str2, int i2) {
        this.id = i2;
        this.name = str2;
    }

    private static void lIIIllIIllIIlII() {
        lllIllIIIIIl = new int[24];
        lllIllIIIIIl[0] = (144 ^ 142) & ((155 ^ 133) ^ (-1));
        lllIllIIIIIl[1] = " ".length();
        lllIllIIIIIl[2] = (-1281) & 8173;
        lllIllIIIIIl[3] = "  ".length();
        lllIllIIIIIl[4] = "   ".length();
        lllIllIIIIIl[5] = (-(214 ^ 196)) & (-1) & 6911;
        lllIllIIIIIl[6] = 85 ^ 81;
        lllIllIIIIIl[7] = 104 ^ 109;
        lllIllIIIIIl[8] = (-25617) & 32511;
        lllIllIIIIIl[9] = 90 ^ 92;
        lllIllIIIIIl[10] = (((10 + 73) - 14) + 72) ^ (((83 + 13) - (-31)) + 11);
        lllIllIIIIIl[11] = (-(128 ^ 135)) & (-1034) & 7935;
        lllIllIIIIIl[12] = 179 ^ 187;
        lllIllIIIIIl[13] = (248 ^ 128) ^ (55 ^ 70);
        lllIllIIIIIl[14] = (-((-31269) & 32293)) & (-1) & 7921;
        lllIllIIIIIl[15] = 64 ^ 74;
        lllIllIIIIIl[16] = (((81 + 2) - 51) + 174) ^ (((153 + 35) - 76) + 85);
        lllIllIIIIIl[17] = -" ".length();
        lllIllIIIIIl[18] = (((175 + 69) - 178) + 122) ^ (((37 + 165) - 50) + 24);
        lllIllIIIIIl[19] = 120 ^ 117;
        lllIllIIIIIl[20] = (-((-2433) & 27529)) & (-1) & 32638;
        lllIllIIIIIl[21] = (168 ^ 141) ^ (94 ^ 117);
        lllIllIIIIIl[22] = (((75 + 33) - (-56)) + 6) ^ (((100 + 139) - 92) + 18);
        lllIllIIIIIl[23] = (89 ^ 123) ^ (148 ^ 166);
    }

    static {
        lIIIllIIllIIlII();
        lIIIllIIllIIIll();
        LEATHER_BOOTS = new d(lllIlIllllll[lllIllIIIIIl[0]], lllIllIIIIIl[0], lllIlIllllll[lllIllIIIIIl[1]], lllIllIIIIIl[2]);
        ADAMANT_KITESHIELD = new d(lllIlIllllll[lllIllIIIIIl[3]], lllIllIIIIIl[1], lllIlIllllll[lllIllIIIIIl[4]], lllIllIIIIIl[5]);
        ADAMANT_MED_HELM = new d(lllIlIllllll[lllIllIIIIIl[6]], lllIllIIIIIl[3], lllIlIllllll[lllIllIIIIIl[7]], lllIllIIIIIl[8]);
        EMERALD = new d(lllIlIllllll[lllIllIIIIIl[9]], lllIllIIIIIl[4], lllIlIllllll[lllIllIIIIIl[10]], lllIllIIIIIl[11]);
        RUNE_LONGSWORD = new d(lllIlIllllll[lllIllIIIIIl[12]], lllIllIIIIIl[6], lllIlIllllll[lllIllIIIIIl[13]], lllIllIIIIIl[14]);
        EMPTY = new d(lllIlIllllll[lllIllIIIIIl[15]], lllIllIIIIIl[7], lllIlIllllll[lllIllIIIIIl[16]], lllIllIIIIIl[17]);
        POSSIBLY_EMPTY = new d(lllIlIllllll[lllIllIIIIIl[18]], lllIllIIIIIl[9], lllIlIllllll[lllIllIIIIIl[19]], lllIllIIIIIl[20]);
        UNKNOWN = new d(lllIlIllllll[lllIllIIIIIl[21]], lllIllIIIIIl[10], lllIlIllllll[lllIllIIIIIl[22]], lllIllIIIIIl[20]);
        d[] dVarArr = new d[lllIllIIIIIl[12]];
        dVarArr[lllIllIIIIIl[0]] = LEATHER_BOOTS;
        dVarArr[lllIllIIIIIl[1]] = ADAMANT_KITESHIELD;
        dVarArr[lllIllIIIIIl[3]] = ADAMANT_MED_HELM;
        dVarArr[lllIllIIIIIl[4]] = EMERALD;
        dVarArr[lllIllIIIIIl[6]] = RUNE_LONGSWORD;
        dVarArr[lllIllIIIIIl[7]] = EMPTY;
        dVarArr[lllIllIIIIIl[9]] = POSSIBLY_EMPTY;
        dVarArr[lllIllIIIIIl[10]] = UNKNOWN;
        $VALUES = dVarArr;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public String j() {
        return this.name;
    }

    private static String lIIIllIIlIlllll(String lllllllllllllllIIllIlIIlIIIlIlIl, String lllllllllllllllIIllIlIIlIIIlIlII) {
        String lllllllllllllllIIllIlIIlIIIlIlIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIIllIlIIlIIIlIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIlIIlIIIlIIll = new StringBuilder();
        char[] charArray = lllllllllllllllIIllIlIIlIIIlIlII.toCharArray();
        int lllllllllllllllIIllIlIIlIIIlIIIl = lllIllIIIIIl[0];
        char[] charArray2 = lllllllllllllllIIllIlIIlIIIlIlIl2.toCharArray();
        int length = charArray2.length;
        int i = lllIllIIIIIl[0];
        while (lIIIllIIllIIlIl(i, length)) {
            lllllllllllllllIIllIlIIlIIIlIIll.append((char) (charArray2[i] ^ charArray[lllllllllllllllIIllIlIIlIIIlIIIl % charArray.length]));
            "".length();
            lllllllllllllllIIllIlIIlIIIlIIIl++;
            i++;
            "".length();
            if ("   ".length() != "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIllIlIIlIIIlIIll);
    }

    public static d a(String str) {
        d[] values = values();
        int length = values.length;
        int i = lllIllIIIIIl[0];
        while (lIIIllIIllIIlIl(i, length)) {
            d dVar = values[i];
            if (lIIIllIIllIIllI(str.toLowerCase().contains(dVar.name.toLowerCase()) ? 1 : 0)) {
                return dVar;
            }
            i++;
            "".length();
            if ((((124 ^ 97) ^ (49 ^ 120)) & (((((49 + 13) - (-63)) + 71) ^ (((143 + 134) - 221) + 88)) ^ (-" ".length()))) > ((146 ^ 190) ^ (167 ^ 143))) {
                return null;
            }
        }
        return null;
    }

    private static boolean lIIIllIIllIIllI(int i) {
        return i != 0;
    }

    private static boolean lIIIllIIllIIlIl(int i, int i2) {
        return i < i2;
    }

    private static void lIIIllIIllIIIll() {
        lllIlIllllll = new String[lllIllIIIIIl[23]];
        lllIlIllllll[lllIllIIIIIl[0]] = lIIIllIIlIlllIl("1REJcRWGArAmhLq8sPlvxg==", "XdoDQ");
        lllIlIllllll[lllIllIIIIIl[1]] = lIIIllIIlIllllI("G4nnmCAIeEf3eg8YygVH8w==", "wrJkq");
        lllIlIllllll[lllIllIIIIIl[3]] = lIIIllIIlIlllll("OQglPDg2GDs6MCwJNzkwPQAg", "xLdqy");
        lllIlIllllll[lllIllIIIIIl[4]] = lIIIllIIlIlllIl("19PLbU8kFyYK2IHsoohtDW3SCaU2P5y5", "UetNp");
        lllIlIllllll[lllIllIIIIIl[6]] = lIIIllIIlIlllIl("rIxD++nx5YaD7/fs7UOoVuh7KVgeoutI", "eDMGX");
        lllIlIllllll[lllIllIIIIIl[7]] = lIIIllIIlIlllll("JgEEIw==", "ndhNt");
        lllIlIllllll[lllIllIIIIIl[9]] = lIIIllIIlIllllI("SD7tPuaQzME=", "caghq");
        lllIlIllllll[lllIllIIIIIl[10]] = lIIIllIIlIllllI("pWYZbuebR84=", "VNSXX");
        lllIlIllllll[lllIllIIIIIl[12]] = lIIIllIIlIllllI("O3iSDIzl0jW/G7q7DwN1/w==", "YPGtx");
        lllIlIllllll[lllIllIIIIIl[13]] = lIIIllIIlIlllll("PRwlCXEjBiULIhgGOQg=", "oiKlQ");
        lllIlIllllll[lllIllIIIIIl[15]] = lIIIllIIlIlllIl("UNrZYi2T/zc=", "ZELfu");
        lllIlIllllll[lllIllIIIIIl[16]] = lIIIllIIlIlllIl("YSXflEoZ8Qw=", "EVypK");
        lllIlIllllll[lllIllIIIIIl[18]] = lIIIllIIlIllllI("Oux6LNJNd1lWuAsQrcip0w==", "xhIdr");
        lllIlIllllll[lllIllIIIIIl[19]] = lIIIllIIlIlllIl("7PTaSKWPx0c=", "wtsUT");
        lllIlIllllll[lllIllIIIIIl[21]] = lIIIllIIlIlllll("OR0pNgY7HQ==", "lSbxI");
        lllIlIllllll[lllIllIIIIIl[22]] = lIIIllIIlIllllI("8fXhrHtbxZ0=", "fZaES");
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    private static String lIIIllIIlIllllI(String lllllllllllllllIIllIlIIlIIIIIIII, String lllllllllllllllIIllIlIIIllllllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIIIllllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIllIIIIIl[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIIlIIIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIlIIlIIIIIIIl) {
            lllllllllllllllIIllIlIIlIIIIIIIl.printStackTrace();
            return null;
        }
    }
}
