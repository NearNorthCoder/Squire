package i.i.p000.h.u.s.e.r.q.r.s.f.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.commons.Predicates;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: i.i.-.h.u.s.e.r.q.r.s.f.e.f  reason: invalid package */
/* loaded from: squire-fisher-0.1.0.jar:i/i/-/h/u/s/e/r/q/r/s/f/e/f.class */
public final class f {
    public static final /* synthetic */ f FLY_FISHING;
    private final /* synthetic */ String name;
    public static final /* synthetic */ f KARAMBWAN;
    public static final /* synthetic */ f BASS;
    public static final /* synthetic */ f MACKEREL;
    public static final /* synthetic */ f BARBARIAN_FISHING;
    public static final /* synthetic */ f COD;
    public static final /* synthetic */ f LOBSTER;
    public static final /* synthetic */ f TUNA;
    public static final /* synthetic */ f MONKFISH;
    private static final /* synthetic */ f[] $VALUES;
    public static final /* synthetic */ f HOUSE_KEY;
    public static final /* synthetic */ f SHRIMP;
    public static final /* synthetic */ f SARDINE;
    public static final /* synthetic */ f SHARKS;
    private static /* synthetic */ String[] lIlllIllllll;
    private final /* synthetic */ int fishNpcId;
    private final /* synthetic */ Predicate<Item> baitPredicate;
    public static final /* synthetic */ f SWORDFISH;
    private final /* synthetic */ int[] fishId;
    public static final /* synthetic */ f MINNOWS;
    private static /* synthetic */ int[] lIllllIIIIII;
    private final /* synthetic */ String[] action;
    private final /* synthetic */ int fishingLevelRequired;
    public static final /* synthetic */ f KARAMBWANJI;
    private final /* synthetic */ Predicate<Item> toolPredicate;
    public static final /* synthetic */ f PIKE;
    public static final /* synthetic */ f ANGLERFISH;

    private static String lllIllIIIllIIl(String lllllllllllllllIlIlllIIlIllIlIlI, String lllllllllllllllIlIlllIIlIllIlIIl) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlIlllIIlIllIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIlIlllIIlIllIIlll = lllllllllllllllIlIlllIIlIllIlIIl.toCharArray();
        int lllllllllllllllIlIlllIIlIllIIllI = lIllllIIIIII[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int lllllllllllllllIlIlllIIlIlIllllI = lIllllIIIIII[1];
        while (lllIllIIIllllI(lllllllllllllllIlIlllIIlIlIllllI, length)) {
            char lllllllllllllllIlIlllIIlIllIlIll = charArray[lllllllllllllllIlIlllIIlIlIllllI];
            sb.append((char) (lllllllllllllllIlIlllIIlIllIlIll ^ lllllllllllllllIlIlllIIlIllIIlll[lllllllllllllllIlIlllIIlIllIIllI % lllllllllllllllIlIlllIIlIllIIlll.length]));
            "".length();
            lllllllllllllllIlIlllIIlIllIIllI++;
            lllllllllllllllIlIlllIIlIlIllllI++;
            "".length();
            if ((((100 ^ 105) ^ (199 ^ 158)) & (((59 ^ 10) ^ (76 ^ 41)) ^ (-" ".length()))) != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    public String h() {
        return this.name;
    }

    public Predicate<Item> k() {
        return this.toolPredicate;
    }

    public Predicate<Item> l() {
        return this.baitPredicate;
    }

    private static String lllIllIIIllIlI(String lllllllllllllllIlIlllIIllIIIIlll, String lllllllllllllllIlIlllIIllIIIIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllIIllIIIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllllIIIIII[5], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllIIllIIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlllIIllIIIlIII) {
            lllllllllllllllIlIlllIIllIIIlIII.printStackTrace();
            return null;
        }
    }

    public int m() {
        return this.fishNpcId;
    }

    private f(String str, int i2, String str2, int i3, int[] iArr, Predicate predicate, Predicate predicate2, String... strArr) {
        this.name = str2;
        this.fishingLevelRequired = i3;
        this.fishId = iArr;
        this.toolPredicate = predicate;
        this.baitPredicate = predicate2;
        this.action = strArr;
        this.fishNpcId = lIllllIIIIII[2];
    }

    static {
        lllIllIIIlllII();
        lllIllIIIllIll();
        String str = lIlllIllllll[lIllllIIIIII[14]];
        int i2 = lIllllIIIIII[1];
        String str2 = lIlllIllllll[lIllllIIIIII[15]];
        int i3 = lIllllIIIIII[0];
        int[] iArr = new int[lIllllIIIIII[5]];
        iArr[lIllllIIIIII[1]] = lIllllIIIIII[16];
        iArr[lIllllIIIIII[0]] = lIllllIIIIII[17];
        int i4 = lIllllIIIIII[18];
        String[] strArr = new String[lIllllIIIIII[5]];
        strArr[lIllllIIIIII[1]] = lIlllIllllll[lIllllIIIIII[19]];
        strArr[lIllllIIIIII[0]] = lIlllIllllll[lIllllIIIIII[20]];
        SHRIMP = new f(str, i2, str2, i3, iArr, i4, strArr);
        String str3 = lIlllIllllll[lIllllIIIIII[21]];
        int i5 = lIllllIIIIII[0];
        String str4 = lIlllIllllll[lIllllIIIIII[22]];
        int i6 = lIllllIIIIII[10];
        int[] iArr2 = new int[lIllllIIIIII[0]];
        iArr2[lIllllIIIIII[1]] = lIllllIIIIII[23];
        int i7 = lIllllIIIIII[4];
        int i8 = lIllllIIIIII[11];
        String[] strArr2 = new String[lIllllIIIIII[0]];
        strArr2[lIllllIIIIII[1]] = lIlllIllllll[lIllllIIIIII[24]];
        SARDINE = new f(str3, i5, str4, i6, iArr2, i7, i8, strArr2);
        String str5 = lIlllIllllll[lIllllIIIIII[25]];
        int i9 = lIllllIIIIII[5];
        String str6 = lIlllIllllll[lIllllIIIIII[26]];
        int i10 = lIllllIIIIII[10];
        int[] iArr3 = new int[lIllllIIIIII[0]];
        iArr3[lIllllIIIIII[1]] = lIllllIIIIII[6];
        int i11 = lIllllIIIIII[18];
        String[] strArr3 = new String[lIllllIIIIII[0]];
        strArr3[lIllllIIIIII[1]] = lIlllIllllll[lIllllIIIIII[27]];
        KARAMBWANJI = new f(str5, i9, str6, i10, iArr3, i11, strArr3);
        String str7 = lIlllIllllll[lIllllIIIIII[28]];
        int i12 = lIllllIIIIII[8];
        String str8 = lIlllIllllll[lIllllIIIIII[29]];
        int i13 = lIllllIIIIII[26];
        int[] iArr4 = new int[lIllllIIIIII[0]];
        iArr4[lIllllIIIIII[1]] = lIllllIIIIII[30];
        int i14 = lIllllIIIIII[31];
        String[] strArr4 = new String[lIllllIIIIII[0]];
        strArr4[lIllllIIIIII[1]] = lIlllIllllll[lIllllIIIIII[32]];
        MACKEREL = new f(str7, i12, str8, i13, iArr4, i14, strArr4);
        String str9 = lIlllIllllll[lIllllIIIIII[33]];
        int i15 = lIllllIIIIII[9];
        String str10 = lIlllIllllll[lIllllIIIIII[34]];
        int i16 = lIllllIIIIII[32];
        int[] iArr5 = new int[lIllllIIIIII[5]];
        iArr5[lIllllIIIIII[1]] = lIllllIIIIII[35];
        iArr5[lIllllIIIIII[0]] = lIllllIIIIII[36];
        Predicate predicate = item -> {
            return item.getName().toLowerCase().contains(lIlllIllllll[lIllllIIIIII[13]]);
        };
        Predicate predicate2 = item2 -> {
            return item2.getName().toLowerCase().contains(lIlllIllllll[lIllllIIIIII[12]]);
        };
        String[] strArr5 = new String[lIllllIIIIII[0]];
        strArr5[lIllllIIIIII[1]] = lIlllIllllll[lIllllIIIIII[37]];
        FLY_FISHING = new f(str9, i15, str10, i16, iArr5, predicate, predicate2, strArr5);
        String str11 = lIlllIllllll[lIllllIIIIII[38]];
        int i17 = lIllllIIIIII[10];
        String str12 = lIlllIllllll[lIllllIIIIII[39]];
        int i18 = lIllllIIIIII[37];
        int[] iArr6 = new int[lIllllIIIIII[0]];
        iArr6[lIllllIIIIII[1]] = lIllllIIIIII[40];
        int i19 = lIllllIIIIII[31];
        String[] strArr6 = new String[lIllllIIIIII[0]];
        strArr6[lIllllIIIIII[1]] = lIlllIllllll[lIllllIIIIII[41]];
        COD = new f(str11, i17, str12, i18, iArr6, i19, strArr6);
        String str13 = lIlllIllllll[lIllllIIIIII[42]];
        int i20 = lIllllIIIIII[12];
        String str14 = lIlllIllllll[lIllllIIIIII[43]];
        int i21 = lIllllIIIIII[39];
        int[] iArr7 = new int[lIllllIIIIII[0]];
        iArr7[lIllllIIIIII[1]] = lIllllIIIIII[44];
        Predicate predicate3 = item3 -> {
            if (lllIllIIIlllIl(item3.getId(), lIllllIIIIII[4])) {
                ?? r0 = lIllllIIIIII[0];
                "".length();
                return "   ".length() < "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIllllIIIIII[1];
        };
        Predicate predicate4 = item4 -> {
            if (lllIllIIIlllIl(item4.getId(), lIllllIIIIII[11])) {
                ?? r0 = lIllllIIIIII[0];
                "".length();
                return "   ".length() < (-" ".length()) ? ((39 ^ 9) ^ (219 ^ 174)) & (((((55 + 117) - 79) + 137) ^ (((130 + 37) - 164) + 186)) ^ (-" ".length())) : r0;
            }
            return lIllllIIIIII[1];
        };
        String[] strArr7 = new String[lIllllIIIIII[0]];
        strArr7[lIllllIIIIII[1]] = lIlllIllllll[lIllllIIIIII[45]];
        PIKE = new f(str13, i20, str14, i21, iArr7, predicate3, predicate4, strArr7);
        String str15 = lIlllIllllll[lIllllIIIIII[46]];
        int i22 = lIllllIIIIII[13];
        String str16 = lIlllIllllll[lIllllIIIIII[47]];
        int i23 = lIllllIIIIII[48];
        int[] iArr8 = new int[lIllllIIIIII[0]];
        iArr8[lIllllIIIIII[1]] = lIllllIIIIII[49];
        Predicate predicate5 = item5 -> {
            return item5.getName().toLowerCase().contains(lIlllIllllll[lIllllIIIIII[10]]);
        };
        int i24 = lIllllIIIIII[50];
        String[] strArr8 = new String[lIllllIIIIII[0]];
        strArr8[lIllllIIIIII[1]] = lIlllIllllll[lIllllIIIIII[51]];
        TUNA = new f(str15, i22, str16, i23, iArr8, predicate5, i24, strArr8);
        String str17 = lIlllIllllll[lIllllIIIIII[52]];
        int i25 = lIllllIIIIII[14];
        String str18 = lIlllIllllll[lIllllIIIIII[53]];
        int i26 = lIllllIIIIII[54];
        int[] iArr9 = new int[lIllllIIIIII[0]];
        iArr9[lIllllIIIIII[1]] = lIllllIIIIII[55];
        int i27 = lIllllIIIIII[56];
        int i28 = lIllllIIIIII[50];
        String[] strArr9 = new String[lIllllIIIIII[0]];
        strArr9[lIllllIIIIII[1]] = lIlllIllllll[lIllllIIIIII[48]];
        LOBSTER = new f(str17, i25, str18, i26, iArr9, i27, i28, strArr9);
        String str19 = lIlllIllllll[lIllllIIIIII[57]];
        int i29 = lIllllIIIIII[15];
        String str20 = lIlllIllllll[lIllllIIIIII[58]];
        int i30 = lIllllIIIIII[59];
        int[] iArr10 = new int[lIllllIIIIII[0]];
        iArr10[lIllllIIIIII[1]] = lIllllIIIIII[60];
        Predicate predicate6 = item6 -> {
            return item6.getName().toLowerCase().contains(lIlllIllllll[lIllllIIIIII[9]]);
        };
        int i31 = lIllllIIIIII[61];
        String[] strArr10 = new String[lIllllIIIIII[0]];
        strArr10[lIllllIIIIII[1]] = lIlllIllllll[lIllllIIIIII[62]];
        BASS = new f(str19, i29, str20, i30, iArr10, predicate6, i31, strArr10);
        String str21 = lIlllIllllll[lIllllIIIIII[63]];
        int i32 = lIllllIIIIII[19];
        String str22 = lIlllIllllll[lIllllIIIIII[54]];
        int i33 = lIllllIIIIII[64];
        int[] iArr11 = new int[lIllllIIIIII[0]];
        iArr11[lIllllIIIIII[1]] = lIllllIIIIII[65];
        Predicate predicate7 = item7 -> {
            return item7.getName().toLowerCase().contains(lIlllIllllll[lIllllIIIIII[8]]);
        };
        int i34 = lIllllIIIIII[50];
        String[] strArr11 = new String[lIllllIIIIII[0]];
        strArr11[lIllllIIIIII[1]] = lIlllIllllll[lIllllIIIIII[66]];
        SWORDFISH = new f(str21, i32, str22, i33, iArr11, predicate7, i34, strArr11);
        String str23 = lIlllIllllll[lIllllIIIIII[67]];
        int i35 = lIllllIIIIII[20];
        String str24 = lIlllIllllll[lIllllIIIIII[68]];
        int i36 = lIllllIIIIII[69];
        int[] iArr12 = new int[lIllllIIIIII[0]];
        iArr12[lIllllIIIIII[1]] = lIllllIIIIII[70];
        int i37 = lIllllIIIIII[18];
        String[] strArr12 = new String[lIllllIIIIII[0]];
        strArr12[lIllllIIIIII[1]] = lIlllIllllll[lIllllIIIIII[71]];
        MONKFISH = new f(str23, i35, str24, i36, iArr12, i37, strArr12);
        String str25 = lIlllIllllll[lIllllIIIIII[72]];
        int i38 = lIllllIIIIII[21];
        String str26 = lIlllIllllll[lIllllIIIIII[59]];
        int i39 = lIllllIIIIII[73];
        int[] iArr13 = new int[lIllllIIIIII[0]];
        iArr13[lIllllIIIIII[1]] = lIllllIIIIII[74];
        Predicate predicate8 = item8 -> {
            if (lllIllIIIlllIl(item8.getId(), lIllllIIIIII[7])) {
                ?? r0 = lIllllIIIIII[0];
                "".length();
                return (-"  ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIllllIIIIII[1];
        };
        Predicate predicate9 = item9 -> {
            if (lllIllIIIlllIl(item9.getId(), lIllllIIIIII[6])) {
                ?? r0 = lIllllIIIIII[0];
                "".length();
                return " ".length() < (-" ".length()) ? ((((85 + 11) - 88) + 242) ^ (((99 + 113) - 186) + 143)) & (((195 ^ 175) ^ (158 ^ 161)) ^ (-" ".length())) : r0;
            }
            return lIllllIIIIII[1];
        };
        String[] strArr13 = new String[lIllllIIIIII[0]];
        strArr13[lIllllIIIIII[1]] = lIlllIllllll[lIllllIIIIII[75]];
        KARAMBWAN = new f(str25, i38, str26, i39, iArr13, predicate8, predicate9, strArr13);
        String str27 = lIlllIllllll[lIllllIIIIII[76]];
        int i40 = lIllllIIIIII[22];
        String str28 = lIlllIllllll[lIllllIIIIII[77]];
        int i41 = lIllllIIIIII[78];
        int[] iArr14 = new int[lIllllIIIIII[0]];
        iArr14[lIllllIIIIII[1]] = lIllllIIIIII[79];
        Predicate predicate10 = item10 -> {
            return item10.getName().toLowerCase().contains(lIlllIllllll[lIllllIIIIII[5]]);
        };
        int i42 = lIllllIIIIII[80];
        String[] strArr14 = new String[lIllllIIIIII[0]];
        strArr14[lIllllIIIIII[1]] = lIlllIllllll[lIllllIIIIII[64]];
        SHARKS = new f(str27, i40, str28, i41, iArr14, predicate10, i42, strArr14);
        String str29 = lIlllIllllll[lIllllIIIIII[81]];
        int i43 = lIllllIIIIII[24];
        String str30 = lIlllIllllll[lIllllIIIIII[82]];
        int i44 = lIllllIIIIII[76];
        int[] iArr15 = new int[lIllllIIIIII[8]];
        iArr15[lIllllIIIIII[1]] = lIllllIIIIII[83];
        iArr15[lIllllIIIIII[0]] = lIllllIIIIII[84];
        iArr15[lIllllIIIIII[5]] = lIllllIIIIII[85];
        Predicate predicate11 = item11 -> {
            return item11.getName().toLowerCase().contains(lIlllIllllll[lIllllIIIIII[0]]);
        };
        Predicate predicate12 = item12 -> {
            return item12.getName().toLowerCase().contains(lIlllIllllll[lIllllIIIIII[1]]);
        };
        String[] strArr15 = new String[lIllllIIIIII[0]];
        strArr15[lIllllIIIIII[1]] = lIlllIllllll[lIllllIIIIII[86]];
        BARBARIAN_FISHING = new f(str29, i43, str30, i44, iArr15, predicate11, predicate12, strArr15);
        String str31 = lIlllIllllll[lIllllIIIIII[87]];
        int i45 = lIllllIIIIII[25];
        String str32 = lIlllIllllll[lIllllIIIIII[88]];
        int i46 = lIllllIIIIII[89];
        int[] iArr16 = new int[lIllllIIIIII[0]];
        iArr16[lIllllIIIIII[1]] = lIllllIIIIII[90];
        int i47 = lIllllIIIIII[18];
        String[] strArr16 = new String[lIllllIIIIII[0]];
        strArr16[lIllllIIIIII[1]] = lIlllIllllll[lIllllIIIIII[91]];
        MINNOWS = new f(str31, i45, str32, i46, iArr16, i47, strArr16);
        String str33 = lIlllIllllll[lIllllIIIIII[92]];
        int i48 = lIllllIIIIII[26];
        String str34 = lIlllIllllll[lIllllIIIIII[93]];
        int i49 = lIllllIIIIII[0];
        int[] iArr17 = new int[lIllllIIIIII[12]];
        iArr17[lIllllIIIIII[1]] = lIllllIIIIII[94];
        iArr17[lIllllIIIIII[0]] = lIllllIIIIII[95];
        iArr17[lIllllIIIIII[5]] = lIllllIIIIII[96];
        iArr17[lIllllIIIIII[8]] = lIllllIIIIII[97];
        iArr17[lIllllIIIIII[9]] = lIllllIIIIII[98];
        iArr17[lIllllIIIIII[10]] = lIllllIIIIII[99];
        int i50 = lIllllIIIIII[31];
        int i51 = lIllllIIIIII[100];
        String[] strArr17 = new String[lIllllIIIIII[0]];
        strArr17[lIllllIIIIII[1]] = lIlllIllllll[lIllllIIIIII[101]];
        HOUSE_KEY = new f(str33, i48, str34, i49, iArr17, i50, i51, strArr17);
        String str35 = lIlllIllllll[lIllllIIIIII[102]];
        int i52 = lIllllIIIIII[27];
        String str36 = lIlllIllllll[lIllllIIIIII[103]];
        int i53 = lIllllIIIIII[89];
        int[] iArr18 = new int[lIllllIIIIII[0]];
        iArr18[lIllllIIIIII[1]] = lIllllIIIIII[104];
        Predicate predicate13 = item13 -> {
            if (lllIllIIIlllIl(item13.getId(), lIllllIIIIII[4])) {
                ?? r0 = lIllllIIIIII[0];
                "".length();
                return "  ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIllllIIIIII[1];
        };
        Predicate predicate14 = item14 -> {
            if (lllIllIIIlllIl(item14.getId(), lIllllIIIIII[3])) {
                ?? r0 = lIllllIIIIII[0];
                "".length();
                return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIllllIIIIII[1];
        };
        String[] strArr18 = new String[lIllllIIIIII[0]];
        strArr18[lIllllIIIIII[1]] = lIlllIllllll[lIllllIIIIII[69]];
        ANGLERFISH = new f(str35, i52, str36, i53, iArr18, predicate13, predicate14, strArr18);
        f[] fVarArr = new f[lIllllIIIIII[28]];
        fVarArr[lIllllIIIIII[1]] = SHRIMP;
        fVarArr[lIllllIIIIII[0]] = SARDINE;
        fVarArr[lIllllIIIIII[5]] = KARAMBWANJI;
        fVarArr[lIllllIIIIII[8]] = MACKEREL;
        fVarArr[lIllllIIIIII[9]] = FLY_FISHING;
        fVarArr[lIllllIIIIII[10]] = COD;
        fVarArr[lIllllIIIIII[12]] = PIKE;
        fVarArr[lIllllIIIIII[13]] = TUNA;
        fVarArr[lIllllIIIIII[14]] = LOBSTER;
        fVarArr[lIllllIIIIII[15]] = BASS;
        fVarArr[lIllllIIIIII[19]] = SWORDFISH;
        fVarArr[lIllllIIIIII[20]] = MONKFISH;
        fVarArr[lIllllIIIIII[21]] = KARAMBWAN;
        fVarArr[lIllllIIIIII[22]] = SHARKS;
        fVarArr[lIllllIIIIII[24]] = BARBARIAN_FISHING;
        fVarArr[lIllllIIIIII[25]] = MINNOWS;
        fVarArr[lIllllIIIIII[26]] = HOUSE_KEY;
        fVarArr[lIllllIIIIII[27]] = ANGLERFISH;
        $VALUES = fVarArr;
    }

    private static String lllIllIIIllIII(String lllllllllllllllIlIlllIIlIllllIlI, String lllllllllllllllIlIlllIIlIllllIIl) {
        try {
            SecretKeySpec lllllllllllllllIlIlllIIlIlllllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllIIlIllllIIl.getBytes(StandardCharsets.UTF_8)), lIllllIIIIII[14]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIllllIIIIII[5], lllllllllllllllIlIlllIIlIlllllIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllIIlIllllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlllIIlIllllIll) {
            lllllllllllllllIlIlllIIlIllllIll.printStackTrace();
            return null;
        }
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }

    public int[] j() {
        return this.fishId;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    private f(String str, int i2, String str2, int i3, int[] iArr, int i4, int i5, String... strArr) {
        this.name = str2;
        this.fishingLevelRequired = i3;
        this.fishId = iArr;
        int[] iArr2 = new int[lIllllIIIIII[0]];
        iArr2[lIllllIIIIII[1]] = i4;
        this.toolPredicate = Predicates.ids(iArr2);
        this.baitPredicate = null;
        this.fishNpcId = i5;
        this.action = strArr;
    }

    public int i() {
        return this.fishingLevelRequired;
    }

    private static void lllIllIIIlllII() {
        lIllllIIIIII = new int[106];
        lIllllIIIIII[0] = " ".length();
        lIllllIIIIII[1] = ((250 ^ 142) ^ (5 ^ 111)) & (((((131 + 76) - 139) + 85) ^ (((102 + 23) - 87) + 97)) ^ (-" ".length()));
        lIllllIIIIII[2] = -" ".length();
        lIllllIIIIII[3] = (-(((50 + 1) - 2) + 80)) & (-265) & 13823;
        lIllllIIIIII[4] = (-17477) & 17783;
        lIllllIIIIII[5] = "  ".length();
        lIllllIIIIII[6] = (-13106) & 16255;
        lIllllIIIIII[7] = (-41) & 3199;
        lIllllIIIIII[8] = "   ".length();
        lIllllIIIIII[9] = 89 ^ 93;
        lIllllIIIIII[10] = (74 ^ 6) ^ (98 ^ 43);
        lIllllIIIIII[11] = (-18567) & 18879;
        lIllllIIIIII[12] = (146 ^ 155) ^ (7 ^ 8);
        lIllllIIIIII[13] = 165 ^ 162;
        lIllllIIIIII[14] = (75 ^ 121) ^ (49 ^ 11);
        lIllllIIIIII[15] = (233 ^ 191) ^ (0 ^ 95);
        lIllllIIIIII[16] = (-((-189) & 24319)) & (-8321) & 32767;
        lIllllIIIIII[17] = (-((-32235) & 32751)) & (-15361) & 16197;
        lIllllIIIIII[18] = (-577) & 879;
        lIllllIIIIII[19] = (((166 + 84) - 88) + 26) ^ (((97 + 41) - 1) + 45);
        lIllllIIIIII[20] = 104 ^ 99;
        lIllllIIIIII[21] = (34 ^ 102) ^ (66 ^ 10);
        lIllllIIIIII[22] = (42 ^ 48) ^ (151 ^ 128);
        lIllllIIIIII[23] = (-569) & 895;
        lIllllIIIIII[24] = (22 ^ 29) ^ (106 ^ 111);
        lIllllIIIIII[25] = (((122 + 42) - 91) + 66) ^ (((110 + 21) - 99) + 100);
        lIllllIIIIII[26] = (117 ^ 22) ^ (24 ^ 107);
        lIllllIIIIII[27] = (241 ^ 132) ^ (251 ^ 159);
        lIllllIIIIII[28] = (84 ^ 1) ^ (101 ^ 34);
        lIllllIIIIII[29] = 43 ^ 56;
        lIllllIIIIII[30] = (-((-357) & 32767)) & (-5) & 32767;
        lIllllIIIIII[31] = (-17411) & 17715;
        lIllllIIIIII[32] = 106 ^ 126;
        lIllllIIIIII[33] = 136 ^ 157;
        lIllllIIIIII[34] = 81 ^ 71;
        lIllllIIIIII[35] = (-((-8203) & 32427)) & (-8209) & 32767;
        lIllllIIIIII[36] = (-((-6155) & 7871)) & (-22529) & 24575;
        lIllllIIIIII[37] = 169 ^ 190;
        lIllllIIIIII[38] = 182 ^ 174;
        lIllllIIIIII[39] = 0 ^ 25;
        lIllllIIIIII[40] = (-((-325) & 32719)) & (-33) & 32767;
        lIllllIIIIII[41] = (207 ^ 173) ^ (226 ^ 154);
        lIllllIIIIII[42] = (83 ^ 18) ^ (156 ^ 198);
        lIllllIIIIII[43] = 82 ^ 78;
        lIllllIIIIII[44] = (-8195) & 8543;
        lIllllIIIIII[45] = 93 ^ 64;
        lIllllIIIIII[46] = (127 ^ 120) ^ (34 ^ 59);
        lIllllIIIIII[47] = 116 ^ 107;
        lIllllIIIIII[48] = 169 ^ 138;
        lIllllIIIIII[49] = (-18569) & 18927;
        lIllllIIIIII[50] = (-16385) & 17903;
        lIllllIIIIII[51] = (210 ^ 128) ^ (255 ^ 141);
        lIllllIIIIII[52] = 61 ^ 28;
        lIllllIIIIII[53] = (71 ^ 83) ^ (177 ^ 135);
        lIllllIIIIII[54] = (8 ^ 96) ^ (208 ^ 144);
        lIllllIIIIII[55] = (-((-449) & 32711)) & (-1) & 32639;
        lIllllIIIIII[56] = (-3137) & 3437;
        lIllllIIIIII[57] = 23 ^ 51;
        lIllllIIIIII[58] = (244 ^ 197) ^ (78 ^ 90);
        lIllllIIIIII[59] = (229 ^ 165) ^ (193 ^ 175);
        lIllllIIIIII[60] = (-17553) & 17915;
        lIllllIIIIII[61] = (-12809) & 14318;
        lIllllIIIIII[62] = (((107 + 77) - 69) + 19) ^ (((110 + 57) - 83) + 76);
        lIllllIIIIII[63] = (11 ^ 26) ^ (66 ^ 116);
        lIllllIIIIII[64] = (131 ^ 171) ^ (37 ^ 63);
        lIllllIIIIII[65] = (-((-8451) & 30475)) & (-10241) & 32637;
        lIllllIIIIII[66] = (24 ^ 57) ^ (76 ^ 68);
        lIllllIIIIII[67] = (((160 + 152) - 291) + 212) ^ (((166 + 53) - 155) + 131);
        lIllllIIIIII[68] = (((29 + 64) - (-44)) + 1) ^ (((71 + 53) - 15) + 52);
        lIllllIIIIII[69] = (66 ^ 92) ^ (16 ^ 48);
        lIllllIIIIII[70] = (-84) & 8027;
        lIllllIIIIII[71] = 94 ^ 114;
        lIllllIIIIII[72] = (((7 + 128) - 54) + 70) ^ (((41 + 180) - 72) + 37);
        lIllllIIIIII[73] = (2 ^ 115) ^ (83 ^ 99);
        lIllllIIIIII[74] = (-((-487) & 13295)) & (-290) & 16239;
        lIllllIIIIII[75] = (37 ^ 100) ^ (36 ^ 74);
        lIllllIIIIII[76] = 132 ^ 180;
        lIllllIIIIII[77] = 33 ^ 16;
        lIllllIIIIII[78] = (116 ^ 59) ^ "   ".length();
        lIllllIIIIII[79] = (-23681) & 24063;
        lIllllIIIIII[80] = (-((-8899) & 27347)) & (-8193) & 28151;
        lIllllIIIIII[81] = (63 ^ 78) ^ (9 ^ 75);
        lIllllIIIIII[82] = 17 ^ 37;
        lIllllIIIIII[83] = (-4103) & 15430;
        lIllllIIIIII[84] = (-4534) & 15863;
        lIllllIIIIII[85] = (-21148) & 32479;
        lIllllIIIIII[86] = 41 ^ 28;
        lIllllIIIIII[87] = 16 ^ 38;
        lIllllIIIIII[88] = 189 ^ 138;
        lIllllIIIIII[89] = (67 ^ 74) ^ (72 ^ 19);
        lIllllIIIIII[90] = (-((-16617) & 19707)) & (-130) & 24575;
        lIllllIIIIII[91] = (((26 + 72) - 67) + 116) ^ (((78 + 94) - 141) + 140);
        lIllllIIIIII[92] = (((5 + 84) - (-5)) + 64) ^ (((152 + 52) - 134) + 97);
        lIllllIIIIII[93] = 118 ^ 76;
        lIllllIIIIII[94] = (-((-4615) & 24135)) & (-17) & 20221;
        lIllllIIIIII[95] = (-65) & 754;
        lIllllIIIIII[96] = (-22529) & 23997;
        lIllllIIIIII[97] = (-16785) & 18395;
        lIllllIIIIII[98] = (-((-9733) & 32663)) & (-8193) & 32735;
        lIllllIIIIII[99] = (-((-11669) & 16375)) & (-10249) & 15359;
        lIllllIIIIII[100] = (-15) & 13343;
        lIllllIIIIII[101] = (90 ^ 87) ^ (57 ^ 15);
        lIllllIIIIII[102] = 173 ^ 145;
        lIllllIIIIII[103] = 159 ^ 162;
        lIllllIIIIII[104] = (-((-8239) & 10927)) & (-257) & 16383;
        lIllllIIIIII[105] = 146 ^ 173;
    }

    private static boolean lllIllIIIllllI(int i2, int i3) {
        return i2 < i3;
    }

    private static void lllIllIIIllIll() {
        lIlllIllllll = new String[lIllllIIIIII[105]];
        lIlllIllllll[lIllllIIIIII[1]] = lllIllIIIllIII("BjLpt0SypuY=", "ZjkjY");
        lIlllIllllll[lIllllIIIIII[0]] = lllIllIIIllIII("pQ5Hik0dTfHT4DzbUcNnLw==", "WZfxA");
        lIlllIllllll[lIllllIIIIII[5]] = lllIllIIIllIII("N6CTOJlOGpg=", "vAbMY");
        lIlllIllllll[lIllllIIIIII[8]] = lllIllIIIllIIl("LjQkMSgpOw==", "FUVAG");
        lIlllIllllll[lIllllIIIIII[9]] = lllIllIIIllIlI("rcQDJVTlyok=", "PRJDv");
        lIlllIllllll[lIllllIIIIII[10]] = lllIllIIIllIlI("byLZcmN6CUQ=", "SDXCD");
        lIlllIllllll[lIllllIIIIII[12]] = lllIllIIIllIII("86GJX4a66+w=", "WIvIG");
        lIlllIllllll[lIllllIIIIII[13]] = lllIllIIIllIlI("DzBz12dnlQ2MBRZfBl81FA==", "GAWEf");
        lIlllIllllll[lIllllIIIIII[14]] = lllIllIIIllIlI("63oBJZFTMcM=", "TBfJP");
        lIlllIllllll[lIllllIIIIII[15]] = lllIllIIIllIIl("NAQjAikX", "glQkD");
        lIlllIllllll[lIllllIIIIII[19]] = lllIllIIIllIlI("CotWy3oxzv8=", "IEJNj");
        lIlllIllllll[lIllllIIIIII[20]] = lllIllIIIllIII("slfGDdc6ky4bLRw93EEiPg==", "mnGLr");
        lIlllIllllll[lIllllIIIIII[21]] = lllIllIIIllIlI("cKYVThCYEME=", "ngVaX");
        lIlllIllllll[lIllllIIIIII[22]] = lllIllIIIllIII("KQF02HzhT6OoHw7Bq1KHYg==", "ZGfBH");
        lIlllIllllll[lIllllIIIIII[24]] = lllIllIIIllIIl("OwgzNQ==", "yiZAg");
        lIlllIllllll[lIllllIIIIII[25]] = lllIllIIIllIIl("CAogIyQBHDMsIwo=", "CKrbi");
        lIlllIllllll[lIllllIIIIII[26]] = lllIllIIIllIlI("D1u4lk/EIRYspXnjHiop0g==", "hQvFv");
        lIlllIllllll[lIllllIIIIII[27]] = lllIllIIIllIlI("98tkTmWPoRk=", "hDOFF");
        lIlllIllllll[lIllllIIIIII[28]] = lllIllIIIllIIl("LhcRHSAxEx4=", "cVRVe");
        lIlllIllllll[lIllllIIIIII[29]] = lllIllIIIllIIl("Dxg7BjYwHDQ=", "ByXmS");
        lIlllIllllll[lIllllIIIIII[32]] = lllIllIIIllIIl("IToEbDwGJw==", "cScLr");
        lIlllIllllll[lIllllIIIIII[33]] = lllIllIIIllIIl("BCMtKAcLPDw+DwU=", "BotwA");
        lIlllIllllll[lIllllIIIIII[34]] = lllIllIIIllIII("hjf2fA+Rk5dTa0uwtXR+pw==", "pggct");
        lIlllIllllll[lIllllIIIIII[37]] = lllIllIIIllIIl("KhYjIA==", "fcQEm");
        lIlllIllllll[lIllllIIIIII[38]] = lllIllIIIllIIl("Figr", "UgoTX");
        lIlllIllllll[lIllllIIIIII[39]] = lllIllIIIllIIl("BCwR", "GCuYN");
        lIlllIllllll[lIllllIIIIII[41]] = lllIllIIIllIIl("DxopawkoBw==", "MsNKG");
        lIlllIllllll[lIllllIIIIII[42]] = lllIllIIIllIlI("I7j61nlyyYY=", "zdnqP");
        lIlllIllllll[lIllllIIIIII[43]] = lllIllIIIllIII("S/WagFlaxZk=", "AKQVD");
        lIlllIllllll[lIllllIIIIII[45]] = lllIllIIIllIIl("EjUvPg==", "PTFJa");
        lIlllIllllll[lIllllIIIIII[46]] = lllIllIIIllIII("ivWcAJZciaI=", "ELyng");
        lIlllIllllll[lIllllIIIIII[47]] = lllIllIIIllIIl("JT8jOw==", "qJMZI");
        lIlllIllllll[lIllllIIIIII[51]] = lllIllIIIllIII("6c/UQXhPAV8=", "BpKDW");
        lIlllIllllll[lIllllIIIIII[52]] = lllIllIIIllIIl("IignMT4rNQ==", "ngebj");
        lIlllIllllll[lIllllIIIIII[53]] = lllIllIIIllIlI("sBIPsMXwTTo=", "mUCQH");
        lIlllIllllll[lIllllIIIIII[48]] = lllIllIIIllIlI("N4zlNNeAgXM=", "mPcQm");
        lIlllIllllll[lIllllIIIIII[57]] = lllIllIIIllIIl("MhU8Hg==", "pToMN");
        lIlllIllllll[lIllllIIIIII[58]] = lllIllIIIllIII("DzdpMqhmxfg=", "GBKIa");
        lIlllIllllll[lIllllIIIIII[62]] = lllIllIIIllIIl("OQ4wIhoeAQ==", "qoBRu");
        lIlllIllllll[lIllllIIIIII[63]] = lllIllIIIllIIl("PAAuECYpHjIK", "oWaBb");
        lIlllIllllll[lIllllIIIIII[54]] = lllIllIIIllIlI("c4i6xnT4w30xHoM5trl5fA==", "ViAJX");
        lIlllIllllll[lIllllIIIIII[66]] = lllIllIIIllIII("0IHEs4r4ipI=", "XvOjc");
        lIlllIllllll[lIllllIIIIII[67]] = lllIllIIIllIII("dyPOAIi+oD+8CEn3qrKPBQ==", "EcwMr");
        lIlllIllllll[lIllllIIIIII[68]] = lllIllIIIllIII("txEW5SIAd5HaQZNRbTYV9w==", "WGMCc");
        lIlllIllllll[lIllllIIIIII[71]] = lllIllIIIllIlI("bpTC/v76AOg=", "cYaeM");
        lIlllIllllll[lIllllIIIIII[72]] = lllIllIIIllIlI("8yV/cEVqEvxe+pYuxR5RUw==", "SXLqG");
        lIlllIllllll[lIllllIIIIII[59]] = lllIllIIIllIIl("MyY+GSsaMC0W", "xGLxF");
        lIlllIllllll[lIllllIIIIII[75]] = lllIllIIIllIlI("hm1XhYmUHuA=", "ECFwe");
        lIlllIllllll[lIllllIIIIII[76]] = lllIllIIIllIIl("OxgJNw87", "hPHeD");
        lIlllIllllll[lIllllIIIIII[77]] = lllIllIIIllIlI("42xvfYzxEes=", "sHgxa");
        lIlllIllllll[lIllllIIIIII[64]] = lllIllIIIllIII("XuM1gu0CKB0=", "zqrvZ");
        lIlllIllllll[lIllllIIIIII[81]] = lllIllIIIllIlI("lo6PdlJz3cPF5vik1ZsaOlkbdpforBnS", "ZughR");
        lIlllIllllll[lIllllIIIIII[82]] = lllIllIIIllIIl("AwM5IwozCyovSwcLOCkCLwU=", "AbKAk");
        lIlllIllllll[lIllllIIIIII[86]] = lllIllIIIllIIl("OzsuZSABLA==", "nHKHR");
        lIlllIllllll[lIllllIIIIII[87]] = lllIllIIIllIIl("BgsLCCscEQ==", "KBEFd");
        lIlllIllllll[lIllllIIIIII[88]] = lllIllIIIllIIl("DDsqAgU2IQ==", "ARDlj");
        lIlllIllllll[lIllllIIIIII[91]] = lllIllIIIllIIl("Mh4WFRtBPRIN", "aswyw");
        lIlllIllllll[lIllllIIIIII[92]] = lllIllIIIllIIl("LCICKhY7JhIg", "dmWyS");
        lIlllIllllll[lIllllIIIIII[93]] = lllIllIIIllIlI("kSZVsidf81bYUYYJoDg4Gg==", "oQoNa");
        lIlllIllllll[lIllllIIIIII[101]] = lllIllIIIllIlI("DUjUc4bnKgs=", "tOKco");
        lIlllIllllll[lIllllIIIIII[102]] = lllIllIIIllIlI("7hSPIW3XC/nJEZO7/Nma2g==", "TcQcs");
        lIlllIllllll[lIllllIIIIII[103]] = lllIllIIIllIII("+PsJWq7jXRj6dnOdFtcrog==", "tCdnC");
        lIlllIllllll[lIllllIIIIII[69]] = lllIllIIIllIlI("m/raBEg0RuU=", "kixGl");
    }

    private f(String str, int i2, String str2, int i3, int[] iArr, Predicate predicate, int i4, String... strArr) {
        this.name = str2;
        this.fishingLevelRequired = i3;
        this.fishId = iArr;
        this.toolPredicate = predicate;
        this.baitPredicate = null;
        this.fishNpcId = i4;
        this.action = strArr;
    }

    public String[] n() {
        return this.action;
    }

    private f(String str, int i2, String str2, int i3, int[] iArr, int i4, String... strArr) {
        this.name = str2;
        this.fishingLevelRequired = i3;
        this.fishId = iArr;
        int[] iArr2 = new int[lIllllIIIIII[0]];
        iArr2[lIllllIIIIII[1]] = i4;
        this.toolPredicate = Predicates.ids(iArr2);
        this.baitPredicate = null;
        this.fishNpcId = lIllllIIIIII[2];
        this.action = strArr;
    }

    private static boolean lllIllIIIlllIl(int i2, int i3) {
        return i2 == i3;
    }
}
