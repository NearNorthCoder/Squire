package p000.m.e.a.u.s.r.r.q.i.r.e.f;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: -.m.e.a.u.s.r.r.q.i.r.e.f.K  reason: invalid package */
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:-/m/e/a/u/s/r/r/q/i/r/e/f/K.class */
public final class K {
    private static /* synthetic */ int[] llIIIllIIIIl;
    public static final /* synthetic */ K EMPTY_BUCKET;
    public static final /* synthetic */ K SUPER_COMPOST;
    private final /* synthetic */ int child;
    public static final /* synthetic */ K SEED_DIBBER;
    private static final /* synthetic */ K[] $VALUES;
    public static final /* synthetic */ K COMPOST;
    private static /* synthetic */ String[] llIIIllIIIII;
    public static final /* synthetic */ K PLANT_CURE;
    public static final /* synthetic */ K ULTRA_COMPOST;
    public static final /* synthetic */ K RAKE;
    public static final /* synthetic */ K SPADE;
    private final /* synthetic */ int inventoryChild;
    public static final /* synthetic */ K SECATEURS;
    private final /* synthetic */ int[] itemIds;
    public static final /* synthetic */ K BOTTOMLESS_BUCKET;

    private K(String str, int i, int i2, int i3, int... iArr) {
        this.inventoryChild = i3;
        this.child = i2;
        this.itemIds = iArr;
    }

    public int aF() {
        return this.child;
    }

    private static boolean llllIlIllIllII(int i, int i2) {
        return i == i2;
    }

    private static void llllIlIllIlIIl() {
        llIIIllIIIII = new String[llIIIllIIIIl[11]];
        llIIIllIIIII[llIIIllIIIIl[0]] = llllIlIllIIllI("SSKnyW5885rzfvCSekG8YQ==", "kCVWh");
        llIIIllIIIII[llIIIllIIIIl[1]] = llllIlIllIIllI("/Ft9vOS5Uls=", "dOFlZ");
        llIIIllIIIII[llIIIllIIIIl[4]] = llllIlIllIIllI("NpJhNZBh1AzngOvmUY9QuQ==", "eABBd");
        llIIIllIIIII[llIIIllIIIIl[7]] = llllIlIllIIlll("FyQtIAg=", "DtldM");
        llIIIllIIIII[llIIIllIIIIl[10]] = llllIlIllIIlll("FhUbMwIABQoh", "EPXrV");
        llIIIllIIIII[llIIIllIIIIl[14]] = llllIlIllIIlll("NR4HHQA6ERMBEQ==", "eRFST");
        llIIIllIIIII[llIIIllIIIIl[18]] = llllIlIllIIlll("NDwbIy07PwokMSkxGjQpMyc=", "vsOwb");
        llIIIllIIIII[llIIIllIIIIl[16]] = llllIlIllIIllI("b87KRlH0y3TYKVxPTsnggQ==", "EdHNC");
        llIIIllIIIII[llIIIllIIIIl[2]] = llllIlIllIlIII("vTJhgFN2Emo=", "wckeK");
        llIIIllIIIII[llIIIllIIIIl[5]] = llllIlIllIIlll("KTEVHQMlJwoVATU3EQ==", "zdEXQ");
        llIIIllIIIII[llIIIllIIIIl[8]] = llllIlIllIIllI("lD/le2o30YeVljBLFGV4Vg==", "pTyNy");
    }

    public static K[] values() {
        return (K[]) $VALUES.clone();
    }

    private static String llllIlIllIlIII(String lllllllllllllllIlIlIIlIIlIlllIIl, String lllllllllllllllIlIlIIlIIlIlllIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIlIIlIlllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIlIIlIIlIlllIll = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlIIlIIlIlllIll.init(llIIIllIIIIl[4], secretKeySpec);
            return new String(lllllllllllllllIlIlIIlIIlIlllIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIlIIlIlllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlIIlIIlIlllIlI) {
            lllllllllllllllIlIlIIlIIlIlllIlI.printStackTrace();
            return null;
        }
    }

    public int[] aH() {
        return this.itemIds;
    }

    public int aG() {
        return this.inventoryChild;
    }

    private static String llllIlIllIIlll(String lllllllllllllllIlIlIIlIIllIIlllI, String lllllllllllllllIlIlIIlIIllIIllIl) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIIlIIllIIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIlIlIIlIIllIIllIl.toCharArray();
        int lllllllllllllllIlIlIIlIIllIIlIlI = llIIIllIIIIl[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = llIIIllIIIIl[0];
        while (llllIlIllIlIll(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[lllllllllllllllIlIlIIlIIllIIlIlI % charArray.length]));
            "".length();
            lllllllllllllllIlIlIIlIIllIIlIlI++;
            i++;
            "".length();
            if ((-" ".length()) >= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String llllIlIllIIllI(String lllllllllllllllIlIlIIlIIlIlIllII, String lllllllllllllllIlIlIIlIIlIlIlIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIlIIlIlIlIll.getBytes(StandardCharsets.UTF_8)), llIIIllIIIIl[2]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIIllIIIIl[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIlIIlIlIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlIIlIIlIlIllIl) {
            lllllllllllllllIlIlIIlIIlIlIllIl.printStackTrace();
            return null;
        }
    }

    static {
        llllIlIllIlIlI();
        llllIlIllIlIIl();
        String str = llIIIllIIIII[llIIIllIIIIl[1]];
        int i = llIIIllIIIIl[0];
        int i2 = llIIIllIIIIl[2];
        int i3 = llIIIllIIIIl[1];
        int[] iArr = new int[llIIIllIIIIl[1]];
        iArr[llIIIllIIIIl[0]] = llIIIllIIIIl[3];
        RAKE = new K(str, i, i2, i3, iArr);
        String str2 = llIIIllIIIII[llIIIllIIIIl[4]];
        int i4 = llIIIllIIIIl[1];
        int i5 = llIIIllIIIIl[5];
        int i6 = llIIIllIIIIl[4];
        int[] iArr2 = new int[llIIIllIIIIl[1]];
        iArr2[llIIIllIIIIl[0]] = llIIIllIIIIl[6];
        SEED_DIBBER = new K(str2, i4, i5, i6, iArr2);
        String str3 = llIIIllIIIII[llIIIllIIIIl[7]];
        int i7 = llIIIllIIIIl[4];
        int i8 = llIIIllIIIIl[8];
        int i9 = llIIIllIIIIl[7];
        int[] iArr3 = new int[llIIIllIIIIl[1]];
        iArr3[llIIIllIIIIl[0]] = llIIIllIIIIl[9];
        SPADE = new K(str3, i7, i8, i9, iArr3);
        String str4 = llIIIllIIIII[llIIIllIIIIl[10]];
        int i10 = llIIIllIIIIl[7];
        int i11 = llIIIllIIIIl[11];
        int i12 = llIIIllIIIIl[10];
        int[] iArr4 = new int[llIIIllIIIIl[4]];
        iArr4[llIIIllIIIIl[0]] = llIIIllIIIIl[12];
        iArr4[llIIIllIIIIl[1]] = llIIIllIIIIl[13];
        SECATEURS = new K(str4, i10, i11, i12, iArr4);
        String str5 = llIIIllIIIII[llIIIllIIIIl[14]];
        int i13 = llIIIllIIIIl[10];
        int i14 = llIIIllIIIIl[15];
        int i15 = llIIIllIIIIl[16];
        int[] iArr5 = new int[llIIIllIIIIl[1]];
        iArr5[llIIIllIIIIl[0]] = llIIIllIIIIl[17];
        PLANT_CURE = new K(str5, i13, i14, i15, iArr5);
        String str6 = llIIIllIIIII[llIIIllIIIIl[18]];
        int i16 = llIIIllIIIIl[14];
        int i17 = llIIIllIIIIl[19];
        int i18 = llIIIllIIIIl[2];
        int[] iArr6 = new int[llIIIllIIIIl[1]];
        iArr6[llIIIllIIIIl[0]] = llIIIllIIIIl[20];
        BOTTOMLESS_BUCKET = new K(str6, i16, i17, i18, iArr6);
        String str7 = llIIIllIIIII[llIIIllIIIIl[16]];
        int i19 = llIIIllIIIIl[18];
        int i20 = llIIIllIIIIl[21];
        int i21 = llIIIllIIIIl[5];
        int[] iArr7 = new int[llIIIllIIIIl[1]];
        iArr7[llIIIllIIIIl[0]] = llIIIllIIIIl[22];
        EMPTY_BUCKET = new K(str7, i19, i20, i21, iArr7);
        String str8 = llIIIllIIIII[llIIIllIIIIl[2]];
        int i22 = llIIIllIIIIl[16];
        int i23 = llIIIllIIIIl[23];
        int i24 = llIIIllIIIIl[8];
        int[] iArr8 = new int[llIIIllIIIIl[1]];
        iArr8[llIIIllIIIIl[0]] = llIIIllIIIIl[24];
        COMPOST = new K(str8, i22, i23, i24, iArr8);
        String str9 = llIIIllIIIII[llIIIllIIIIl[5]];
        int i25 = llIIIllIIIIl[2];
        int i26 = llIIIllIIIIl[25];
        int i27 = llIIIllIIIIl[11];
        int[] iArr9 = new int[llIIIllIIIIl[1]];
        iArr9[llIIIllIIIIl[0]] = llIIIllIIIIl[26];
        SUPER_COMPOST = new K(str9, i25, i26, i27, iArr9);
        String str10 = llIIIllIIIII[llIIIllIIIIl[8]];
        int i28 = llIIIllIIIIl[5];
        int i29 = llIIIllIIIIl[27];
        int i30 = llIIIllIIIIl[28];
        int[] iArr10 = new int[llIIIllIIIIl[1]];
        iArr10[llIIIllIIIIl[0]] = llIIIllIIIIl[29];
        ULTRA_COMPOST = new K(str10, i28, i29, i30, iArr10);
        K[] kArr = new K[llIIIllIIIIl[8]];
        kArr[llIIIllIIIIl[0]] = RAKE;
        kArr[llIIIllIIIIl[1]] = SEED_DIBBER;
        kArr[llIIIllIIIIl[4]] = SPADE;
        kArr[llIIIllIIIIl[7]] = SECATEURS;
        kArr[llIIIllIIIIl[10]] = PLANT_CURE;
        kArr[llIIIllIIIIl[14]] = BOTTOMLESS_BUCKET;
        kArr[llIIIllIIIIl[18]] = EMPTY_BUCKET;
        kArr[llIIIllIIIIl[16]] = COMPOST;
        kArr[llIIIllIIIIl[2]] = SUPER_COMPOST;
        kArr[llIIIllIIIIl[5]] = ULTRA_COMPOST;
        $VALUES = kArr;
    }

    public static K valueOf(String str) {
        return (K) Enum.valueOf(K.class, str);
    }

    public static K d(Item item) {
        K[] values = values();
        int length = values.length;
        int i = llIIIllIIIIl[0];
        while (llllIlIllIlIll(i, length)) {
            K k = values[i];
            int[] iArr = k.itemIds;
            int length2 = iArr.length;
            int i2 = llIIIllIIIIl[0];
            while (llllIlIllIlIll(i2, length2)) {
                if (llllIlIllIllII(item.getId(), iArr[i2])) {
                    return k;
                }
                i2++;
                "".length();
                if (0 != 0) {
                    return null;
                }
            }
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        if (llllIlIllIllIl(item.getName().contains(llIIIllIIIII[llIIIllIIIIl[0]]) ? 1 : 0)) {
            return BOTTOMLESS_BUCKET;
        }
        return null;
    }

    private static boolean llllIlIllIllIl(int i) {
        return i != 0;
    }

    private static void llllIlIllIlIlI() {
        llIIIllIIIIl = new int[30];
        llIIIllIIIIl[0] = ((166 ^ 193) ^ (114 ^ 88)) & (((74 ^ 76) ^ (42 ^ 97)) ^ (-" ".length()));
        llIIIllIIIIl[1] = " ".length();
        llIIIllIIIIl[2] = 8 ^ 0;
        llIIIllIIIIl[3] = (-((-4253) & 23487)) & (-8193) & 32767;
        llIIIllIIIIl[4] = "  ".length();
        llIIIllIIIIl[5] = 130 ^ 139;
        llIIIllIIIIl[6] = (-1) & 5343;
        llIIIllIIIIl[7] = "   ".length();
        llIIIllIIIIl[8] = (((32 + 54) - (-3)) + 42) ^ (((23 + 69) - 6) + 51);
        llIIIllIIIIl[9] = (-27720) & 28671;
        llIIIllIIIIl[10] = (141 ^ 196) ^ (226 ^ 175);
        llIIIllIIIIl[11] = (28 ^ 23) ^ ((124 ^ 30) & ((3 ^ 97) ^ (-1)));
        llIIIllIIIIl[12] = (-525) & 7933;
        llIIIllIIIIl[13] = (-((-8211) & 27191)) & (-3) & 24311;
        llIIIllIIIIl[14] = (93 ^ 51) ^ (8 ^ 99);
        llIIIllIIIIl[15] = (22 ^ 96) ^ (255 ^ 135);
        llIIIllIIIIl[16] = (((167 + 164) - 165) + 20) ^ (((123 + 110) - 123) + 79);
        llIIIllIIIIl[17] = (-((-7250) & 31837)) & (-2145) & 32767;
        llIIIllIIIIl[18] = (((136 + 181) - 170) + 37) ^ (((175 + 184) - 300) + 131);
        llIIIllIIIIl[19] = (11 ^ 108) ^ (200 ^ 160);
        llIIIllIIIIl[20] = (-((-4549) & 13805)) & (-1) & 32253;
        llIIIllIIIIl[21] = 137 ^ 153;
        llIIIllIIIIl[22] = (-14369) & 16293;
        llIIIllIIIIl[23] = (96 ^ 126) ^ (101 ^ 106);
        llIIIllIIIIl[24] = (-2123) & 8154;
        llIIIllIIIIl[25] = (202 ^ 151) ^ (98 ^ 45);
        llIIIllIIIIl[26] = (-16482) & 22515;
        llIIIllIIIIl[27] = (235 ^ 159) ^ (4 ^ 99);
        llIIIllIIIIl[28] = 92 ^ 80;
        llIIIllIIIIl[29] = (-1025) & 22507;
    }

    private static boolean llllIlIllIlIll(int i, int i2) {
        return i < i2;
    }
}
