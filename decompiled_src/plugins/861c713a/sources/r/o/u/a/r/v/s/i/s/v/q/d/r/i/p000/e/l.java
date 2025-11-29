package r.o.u.a.r.v.s.i.s.v.q.d.r.i.p000.e;

import com.google.common.collect.ImmutableMap;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.l  reason: invalid package */
/* loaded from: 861c713a-2076-4f84-9c7c-f1dff7263a11.jar:r/o/u/a/r/v/s/i/s/v/q/d/r/i/-/e/l.class */
public final class l {
    public static final /* synthetic */ l TYPE_19;
    public static final /* synthetic */ l TYPE_11;
    public static final /* synthetic */ l TYPE_6;
    private static final /* synthetic */ l[] $VALUES;
    public static final /* synthetic */ l TYPE_24;
    public static final /* synthetic */ l TYPE_2;
    public static final /* synthetic */ l TYPE_16;
    public static final /* synthetic */ l TYPE_27;
    public static final /* synthetic */ l TYPE_4;
    public static final /* synthetic */ l TYPE_7;
    private static final /* synthetic */ Map<Integer, l> weaponTypes;
    private static /* synthetic */ String[] lIlIlIIIllIll;
    public static final /* synthetic */ l TYPE_12;
    public static final /* synthetic */ l TYPE_18;
    public static final /* synthetic */ l TYPE_29;
    private final /* synthetic */ k[] attackStyles;
    public static final /* synthetic */ l TYPE_17;
    public static final /* synthetic */ l TYPE_28;
    public static final /* synthetic */ l TYPE_0;
    public static final /* synthetic */ l TYPE_22;
    public static final /* synthetic */ l TYPE_26;
    public static final /* synthetic */ l TYPE_10;
    public static final /* synthetic */ l TYPE_20;
    public static final /* synthetic */ l TYPE_8;
    private static /* synthetic */ int[] lIlIlIIIlllIl;
    public static final /* synthetic */ l TYPE_21;
    public static final /* synthetic */ l TYPE_9;
    public static final /* synthetic */ l TYPE_5;
    public static final /* synthetic */ l TYPE_1;
    public static final /* synthetic */ l TYPE_13;
    public static final /* synthetic */ l TYPE_3;
    public static final /* synthetic */ l TYPE_25;
    public static final /* synthetic */ l TYPE_23;
    public static final /* synthetic */ l TYPE_14;
    public static final /* synthetic */ l TYPE_15;

    private static boolean lIllllIllIlIlIl(int i, int i2) {
        return i < i2;
    }

    static {
        lIllllIllIlIlII();
        lIllllIllIlIIll();
        String str = lIlIlIIIllIll[lIlIlIIIlllIl[0]];
        int i = lIlIlIIIlllIl[0];
        k[] kVarArr = new k[lIlIlIIIlllIl[1]];
        kVarArr[lIlIlIIIlllIl[0]] = k.ACCURATE;
        kVarArr[lIlIlIIIlllIl[2]] = k.AGGRESSIVE;
        kVarArr[lIlIlIIIlllIl[3]] = null;
        kVarArr[lIlIlIIIlllIl[4]] = k.DEFENSIVE;
        TYPE_0 = new l(str, i, kVarArr);
        String str2 = lIlIlIIIllIll[lIlIlIIIlllIl[2]];
        int i2 = lIlIlIIIlllIl[2];
        k[] kVarArr2 = new k[lIlIlIIIlllIl[1]];
        kVarArr2[lIlIlIIIlllIl[0]] = k.ACCURATE;
        kVarArr2[lIlIlIIIlllIl[2]] = k.AGGRESSIVE;
        kVarArr2[lIlIlIIIlllIl[3]] = k.AGGRESSIVE;
        kVarArr2[lIlIlIIIlllIl[4]] = k.DEFENSIVE;
        TYPE_1 = new l(str2, i2, kVarArr2);
        String str3 = lIlIlIIIllIll[lIlIlIIIlllIl[3]];
        int i3 = lIlIlIIIlllIl[3];
        k[] kVarArr3 = new k[lIlIlIIIlllIl[1]];
        kVarArr3[lIlIlIIIlllIl[0]] = k.ACCURATE;
        kVarArr3[lIlIlIIIlllIl[2]] = k.AGGRESSIVE;
        kVarArr3[lIlIlIIIlllIl[3]] = null;
        kVarArr3[lIlIlIIIlllIl[4]] = k.DEFENSIVE;
        TYPE_2 = new l(str3, i3, kVarArr3);
        String str4 = lIlIlIIIllIll[lIlIlIIIlllIl[4]];
        int i4 = lIlIlIIIlllIl[4];
        k[] kVarArr4 = new k[lIlIlIIIlllIl[1]];
        kVarArr4[lIlIlIIIlllIl[0]] = k.RANGING;
        kVarArr4[lIlIlIIIlllIl[2]] = k.RANGING;
        kVarArr4[lIlIlIIIlllIl[3]] = null;
        kVarArr4[lIlIlIIIlllIl[4]] = k.LONGRANGE;
        TYPE_3 = new l(str4, i4, kVarArr4);
        String str5 = lIlIlIIIllIll[lIlIlIIIlllIl[1]];
        int i5 = lIlIlIIIlllIl[1];
        k[] kVarArr5 = new k[lIlIlIIIlllIl[1]];
        kVarArr5[lIlIlIIIlllIl[0]] = k.ACCURATE;
        kVarArr5[lIlIlIIIlllIl[2]] = k.AGGRESSIVE;
        kVarArr5[lIlIlIIIlllIl[3]] = k.CONTROLLED;
        kVarArr5[lIlIlIIIlllIl[4]] = k.DEFENSIVE;
        TYPE_4 = new l(str5, i5, kVarArr5);
        String str6 = lIlIlIIIllIll[lIlIlIIIlllIl[5]];
        int i6 = lIlIlIIIlllIl[5];
        k[] kVarArr6 = new k[lIlIlIIIlllIl[1]];
        kVarArr6[lIlIlIIIlllIl[0]] = k.RANGING;
        kVarArr6[lIlIlIIIlllIl[2]] = k.RANGING;
        kVarArr6[lIlIlIIIlllIl[3]] = null;
        kVarArr6[lIlIlIIIlllIl[4]] = k.LONGRANGE;
        TYPE_5 = new l(str6, i6, kVarArr6);
        String str7 = lIlIlIIIllIll[lIlIlIIIlllIl[6]];
        int i7 = lIlIlIIIlllIl[6];
        k[] kVarArr7 = new k[lIlIlIIIlllIl[1]];
        kVarArr7[lIlIlIIIlllIl[0]] = k.AGGRESSIVE;
        kVarArr7[lIlIlIIIlllIl[2]] = k.RANGING;
        kVarArr7[lIlIlIIIlllIl[3]] = k.CASTING;
        kVarArr7[lIlIlIIIlllIl[4]] = null;
        TYPE_6 = new l(str7, i7, kVarArr7);
        String str8 = lIlIlIIIllIll[lIlIlIIIlllIl[7]];
        int i8 = lIlIlIIIlllIl[7];
        k[] kVarArr8 = new k[lIlIlIIIlllIl[1]];
        kVarArr8[lIlIlIIIlllIl[0]] = k.RANGING;
        kVarArr8[lIlIlIIIlllIl[2]] = k.RANGING;
        kVarArr8[lIlIlIIIlllIl[3]] = null;
        kVarArr8[lIlIlIIIlllIl[4]] = k.LONGRANGE;
        TYPE_7 = new l(str8, i8, kVarArr8);
        String str9 = lIlIlIIIllIll[lIlIlIIIlllIl[8]];
        int i9 = lIlIlIIIlllIl[8];
        k[] kVarArr9 = new k[lIlIlIIIlllIl[1]];
        kVarArr9[lIlIlIIIlllIl[0]] = k.OTHER;
        kVarArr9[lIlIlIIIlllIl[2]] = k.AGGRESSIVE;
        kVarArr9[lIlIlIIIlllIl[3]] = null;
        kVarArr9[lIlIlIIIlllIl[4]] = null;
        TYPE_8 = new l(str9, i9, kVarArr9);
        String str10 = lIlIlIIIllIll[lIlIlIIIlllIl[9]];
        int i10 = lIlIlIIIlllIl[9];
        k[] kVarArr10 = new k[lIlIlIIIlllIl[1]];
        kVarArr10[lIlIlIIIlllIl[0]] = k.ACCURATE;
        kVarArr10[lIlIlIIIlllIl[2]] = k.AGGRESSIVE;
        kVarArr10[lIlIlIIIlllIl[3]] = k.CONTROLLED;
        kVarArr10[lIlIlIIIlllIl[4]] = k.DEFENSIVE;
        TYPE_9 = new l(str10, i10, kVarArr10);
        String str11 = lIlIlIIIllIll[lIlIlIIIlllIl[10]];
        int i11 = lIlIlIIIlllIl[10];
        k[] kVarArr11 = new k[lIlIlIIIlllIl[1]];
        kVarArr11[lIlIlIIIlllIl[0]] = k.ACCURATE;
        kVarArr11[lIlIlIIIlllIl[2]] = k.AGGRESSIVE;
        kVarArr11[lIlIlIIIlllIl[3]] = k.AGGRESSIVE;
        kVarArr11[lIlIlIIIlllIl[4]] = k.DEFENSIVE;
        TYPE_10 = new l(str11, i11, kVarArr11);
        String str12 = lIlIlIIIllIll[lIlIlIIIlllIl[11]];
        int i12 = lIlIlIIIlllIl[11];
        k[] kVarArr12 = new k[lIlIlIIIlllIl[1]];
        kVarArr12[lIlIlIIIlllIl[0]] = k.ACCURATE;
        kVarArr12[lIlIlIIIlllIl[2]] = k.AGGRESSIVE;
        kVarArr12[lIlIlIIIlllIl[3]] = k.AGGRESSIVE;
        kVarArr12[lIlIlIIIlllIl[4]] = k.DEFENSIVE;
        TYPE_11 = new l(str12, i12, kVarArr12);
        String str13 = lIlIlIIIllIll[lIlIlIIIlllIl[12]];
        int i13 = lIlIlIIIlllIl[12];
        k[] kVarArr13 = new k[lIlIlIIIlllIl[1]];
        kVarArr13[lIlIlIIIlllIl[0]] = k.CONTROLLED;
        kVarArr13[lIlIlIIIlllIl[2]] = k.AGGRESSIVE;
        kVarArr13[lIlIlIIIlllIl[3]] = null;
        kVarArr13[lIlIlIIIlllIl[4]] = k.DEFENSIVE;
        TYPE_12 = new l(str13, i13, kVarArr13);
        String str14 = lIlIlIIIllIll[lIlIlIIIlllIl[13]];
        int i14 = lIlIlIIIlllIl[13];
        k[] kVarArr14 = new k[lIlIlIIIlllIl[1]];
        kVarArr14[lIlIlIIIlllIl[0]] = k.ACCURATE;
        kVarArr14[lIlIlIIIlllIl[2]] = k.AGGRESSIVE;
        kVarArr14[lIlIlIIIlllIl[3]] = null;
        kVarArr14[lIlIlIIIlllIl[4]] = k.DEFENSIVE;
        TYPE_13 = new l(str14, i14, kVarArr14);
        String str15 = lIlIlIIIllIll[lIlIlIIIlllIl[14]];
        int i15 = lIlIlIIIlllIl[14];
        k[] kVarArr15 = new k[lIlIlIIIlllIl[1]];
        kVarArr15[lIlIlIIIlllIl[0]] = k.ACCURATE;
        kVarArr15[lIlIlIIIlllIl[2]] = k.AGGRESSIVE;
        kVarArr15[lIlIlIIIlllIl[3]] = k.AGGRESSIVE;
        kVarArr15[lIlIlIIIlllIl[4]] = k.DEFENSIVE;
        TYPE_14 = new l(str15, i15, kVarArr15);
        String str16 = lIlIlIIIllIll[lIlIlIIIlllIl[15]];
        int i16 = lIlIlIIIlllIl[15];
        k[] kVarArr16 = new k[lIlIlIIIlllIl[1]];
        kVarArr16[lIlIlIIIlllIl[0]] = k.CONTROLLED;
        kVarArr16[lIlIlIIIlllIl[2]] = k.CONTROLLED;
        kVarArr16[lIlIlIIIlllIl[3]] = k.CONTROLLED;
        kVarArr16[lIlIlIIIlllIl[4]] = k.DEFENSIVE;
        TYPE_15 = new l(str16, i16, kVarArr16);
        String str17 = lIlIlIIIllIll[lIlIlIIIlllIl[16]];
        int i17 = lIlIlIIIlllIl[16];
        k[] kVarArr17 = new k[lIlIlIIIlllIl[1]];
        kVarArr17[lIlIlIIIlllIl[0]] = k.ACCURATE;
        kVarArr17[lIlIlIIIlllIl[2]] = k.AGGRESSIVE;
        kVarArr17[lIlIlIIIlllIl[3]] = k.CONTROLLED;
        kVarArr17[lIlIlIIIlllIl[4]] = k.DEFENSIVE;
        TYPE_16 = new l(str17, i17, kVarArr17);
        String str18 = lIlIlIIIllIll[lIlIlIIIlllIl[17]];
        int i18 = lIlIlIIIlllIl[17];
        k[] kVarArr18 = new k[lIlIlIIIlllIl[1]];
        kVarArr18[lIlIlIIIlllIl[0]] = k.ACCURATE;
        kVarArr18[lIlIlIIIlllIl[2]] = k.AGGRESSIVE;
        kVarArr18[lIlIlIIIlllIl[3]] = k.AGGRESSIVE;
        kVarArr18[lIlIlIIIlllIl[4]] = k.DEFENSIVE;
        TYPE_17 = new l(str18, i18, kVarArr18);
        String str19 = lIlIlIIIllIll[lIlIlIIIlllIl[18]];
        int i19 = lIlIlIIIlllIl[18];
        k[] kVarArr19 = new k[lIlIlIIIlllIl[6]];
        kVarArr19[lIlIlIIIlllIl[0]] = k.ACCURATE;
        kVarArr19[lIlIlIIIlllIl[2]] = k.AGGRESSIVE;
        kVarArr19[lIlIlIIIlllIl[3]] = null;
        kVarArr19[lIlIlIIIlllIl[4]] = k.DEFENSIVE;
        kVarArr19[lIlIlIIIlllIl[1]] = k.CASTING;
        kVarArr19[lIlIlIIIlllIl[5]] = k.DEFENSIVE_CASTING;
        TYPE_18 = new l(str19, i19, kVarArr19);
        String str20 = lIlIlIIIllIll[lIlIlIIIlllIl[19]];
        int i20 = lIlIlIIIlllIl[19];
        k[] kVarArr20 = new k[lIlIlIIIlllIl[1]];
        kVarArr20[lIlIlIIIlllIl[0]] = k.RANGING;
        kVarArr20[lIlIlIIIlllIl[2]] = k.RANGING;
        kVarArr20[lIlIlIIIlllIl[3]] = null;
        kVarArr20[lIlIlIIIlllIl[4]] = k.LONGRANGE;
        TYPE_19 = new l(str20, i20, kVarArr20);
        String str21 = lIlIlIIIllIll[lIlIlIIIlllIl[20]];
        int i21 = lIlIlIIIlllIl[20];
        k[] kVarArr21 = new k[lIlIlIIIlllIl[1]];
        kVarArr21[lIlIlIIIlllIl[0]] = k.ACCURATE;
        kVarArr21[lIlIlIIIlllIl[2]] = k.CONTROLLED;
        kVarArr21[lIlIlIIIlllIl[3]] = null;
        kVarArr21[lIlIlIIIlllIl[4]] = k.DEFENSIVE;
        TYPE_20 = new l(str21, i21, kVarArr21);
        String str22 = lIlIlIIIllIll[lIlIlIIIlllIl[21]];
        int i22 = lIlIlIIIlllIl[21];
        k[] kVarArr22 = new k[lIlIlIIIlllIl[6]];
        kVarArr22[lIlIlIIIlllIl[0]] = k.ACCURATE;
        kVarArr22[lIlIlIIIlllIl[2]] = k.AGGRESSIVE;
        kVarArr22[lIlIlIIIlllIl[3]] = null;
        kVarArr22[lIlIlIIIlllIl[4]] = k.DEFENSIVE;
        kVarArr22[lIlIlIIIlllIl[1]] = k.CASTING;
        kVarArr22[lIlIlIIIlllIl[5]] = k.DEFENSIVE_CASTING;
        TYPE_21 = new l(str22, i22, kVarArr22);
        String str23 = lIlIlIIIllIll[lIlIlIIIlllIl[22]];
        int i23 = lIlIlIIIlllIl[22];
        k[] kVarArr23 = new k[lIlIlIIIlllIl[1]];
        kVarArr23[lIlIlIIIlllIl[0]] = k.ACCURATE;
        kVarArr23[lIlIlIIIlllIl[2]] = k.AGGRESSIVE;
        kVarArr23[lIlIlIIIlllIl[3]] = k.AGGRESSIVE;
        kVarArr23[lIlIlIIIlllIl[4]] = k.DEFENSIVE;
        TYPE_22 = new l(str23, i23, kVarArr23);
        String str24 = lIlIlIIIllIll[lIlIlIIIlllIl[23]];
        int i24 = lIlIlIIIlllIl[23];
        k[] kVarArr24 = new k[lIlIlIIIlllIl[1]];
        kVarArr24[lIlIlIIIlllIl[0]] = k.CASTING;
        kVarArr24[lIlIlIIIlllIl[2]] = k.CASTING;
        kVarArr24[lIlIlIIIlllIl[3]] = null;
        kVarArr24[lIlIlIIIlllIl[4]] = k.DEFENSIVE_CASTING;
        TYPE_23 = new l(str24, i24, kVarArr24);
        String str25 = lIlIlIIIllIll[lIlIlIIIlllIl[24]];
        int i25 = lIlIlIIIlllIl[24];
        k[] kVarArr25 = new k[lIlIlIIIlllIl[1]];
        kVarArr25[lIlIlIIIlllIl[0]] = k.ACCURATE;
        kVarArr25[lIlIlIIIlllIl[2]] = k.AGGRESSIVE;
        kVarArr25[lIlIlIIIlllIl[3]] = k.CONTROLLED;
        kVarArr25[lIlIlIIIlllIl[4]] = k.DEFENSIVE;
        TYPE_24 = new l(str25, i25, kVarArr25);
        String str26 = lIlIlIIIllIll[lIlIlIIIlllIl[25]];
        int i26 = lIlIlIIIlllIl[25];
        k[] kVarArr26 = new k[lIlIlIIIlllIl[1]];
        kVarArr26[lIlIlIIIlllIl[0]] = k.CONTROLLED;
        kVarArr26[lIlIlIIIlllIl[2]] = k.AGGRESSIVE;
        kVarArr26[lIlIlIIIlllIl[3]] = null;
        kVarArr26[lIlIlIIIlllIl[4]] = k.DEFENSIVE;
        TYPE_25 = new l(str26, i26, kVarArr26);
        String str27 = lIlIlIIIllIll[lIlIlIIIlllIl[26]];
        int i27 = lIlIlIIIlllIl[26];
        k[] kVarArr27 = new k[lIlIlIIIlllIl[1]];
        kVarArr27[lIlIlIIIlllIl[0]] = k.AGGRESSIVE;
        kVarArr27[lIlIlIIIlllIl[2]] = k.AGGRESSIVE;
        kVarArr27[lIlIlIIIlllIl[3]] = null;
        kVarArr27[lIlIlIIIlllIl[4]] = k.AGGRESSIVE;
        TYPE_26 = new l(str27, i27, kVarArr27);
        String str28 = lIlIlIIIllIll[lIlIlIIIlllIl[27]];
        int i28 = lIlIlIIIlllIl[27];
        k[] kVarArr28 = new k[lIlIlIIIlllIl[1]];
        kVarArr28[lIlIlIIIlllIl[0]] = k.ACCURATE;
        kVarArr28[lIlIlIIIlllIl[2]] = null;
        kVarArr28[lIlIlIIIlllIl[3]] = null;
        kVarArr28[lIlIlIIIlllIl[4]] = k.OTHER;
        TYPE_27 = new l(str28, i28, kVarArr28);
        String str29 = lIlIlIIIllIll[lIlIlIIIlllIl[28]];
        int i29 = lIlIlIIIlllIl[28];
        k[] kVarArr29 = new k[lIlIlIIIlllIl[4]];
        kVarArr29[lIlIlIIIlllIl[0]] = k.ACCURATE;
        kVarArr29[lIlIlIIIlllIl[2]] = k.ACCURATE;
        kVarArr29[lIlIlIIIlllIl[3]] = k.LONGRANGE;
        TYPE_28 = new l(str29, i29, kVarArr29);
        String str30 = lIlIlIIIllIll[lIlIlIIIlllIl[29]];
        int i30 = lIlIlIIIlllIl[29];
        k[] kVarArr30 = new k[lIlIlIIIlllIl[1]];
        kVarArr30[lIlIlIIIlllIl[0]] = k.ACCURATE;
        kVarArr30[lIlIlIIIlllIl[2]] = k.AGGRESSIVE;
        kVarArr30[lIlIlIIIlllIl[3]] = k.AGGRESSIVE;
        kVarArr30[lIlIlIIIlllIl[4]] = k.DEFENSIVE;
        TYPE_29 = new l(str30, i30, kVarArr30);
        l[] lVarArr = new l[lIlIlIIIlllIl[30]];
        lVarArr[lIlIlIIIlllIl[0]] = TYPE_0;
        lVarArr[lIlIlIIIlllIl[2]] = TYPE_1;
        lVarArr[lIlIlIIIlllIl[3]] = TYPE_2;
        lVarArr[lIlIlIIIlllIl[4]] = TYPE_3;
        lVarArr[lIlIlIIIlllIl[1]] = TYPE_4;
        lVarArr[lIlIlIIIlllIl[5]] = TYPE_5;
        lVarArr[lIlIlIIIlllIl[6]] = TYPE_6;
        lVarArr[lIlIlIIIlllIl[7]] = TYPE_7;
        lVarArr[lIlIlIIIlllIl[8]] = TYPE_8;
        lVarArr[lIlIlIIIlllIl[9]] = TYPE_9;
        lVarArr[lIlIlIIIlllIl[10]] = TYPE_10;
        lVarArr[lIlIlIIIlllIl[11]] = TYPE_11;
        lVarArr[lIlIlIIIlllIl[12]] = TYPE_12;
        lVarArr[lIlIlIIIlllIl[13]] = TYPE_13;
        lVarArr[lIlIlIIIlllIl[14]] = TYPE_14;
        lVarArr[lIlIlIIIlllIl[15]] = TYPE_15;
        lVarArr[lIlIlIIIlllIl[16]] = TYPE_16;
        lVarArr[lIlIlIIIlllIl[17]] = TYPE_17;
        lVarArr[lIlIlIIIlllIl[18]] = TYPE_18;
        lVarArr[lIlIlIIIlllIl[19]] = TYPE_19;
        lVarArr[lIlIlIIIlllIl[20]] = TYPE_20;
        lVarArr[lIlIlIIIlllIl[21]] = TYPE_21;
        lVarArr[lIlIlIIIlllIl[22]] = TYPE_22;
        lVarArr[lIlIlIIIlllIl[23]] = TYPE_23;
        lVarArr[lIlIlIIIlllIl[24]] = TYPE_24;
        lVarArr[lIlIlIIIlllIl[25]] = TYPE_25;
        lVarArr[lIlIlIIIlllIl[26]] = TYPE_26;
        lVarArr[lIlIlIIIlllIl[27]] = TYPE_27;
        lVarArr[lIlIlIIIlllIl[28]] = TYPE_28;
        lVarArr[lIlIlIIIlllIl[29]] = TYPE_29;
        $VALUES = lVarArr;
        ImmutableMap.Builder builder = new ImmutableMap.Builder();
        l[] values = values();
        int length = values.length;
        int i31 = lIlIlIIIlllIl[0];
        while (lIllllIllIlIlIl(i31, length)) {
            l lVar = values[i31];
            builder.put(Integer.valueOf(lVar.ordinal()), lVar);
            "".length();
            i31++;
            "".length();
            if ((4 ^ 0) <= "  ".length()) {
                return;
            }
        }
        weaponTypes = builder.build();
    }

    private static String lIllllIllIIlIIl(String llllllllllllllIllIllIIIIIIIllIlI, String llllllllllllllIllIllIIIIIIIllIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIllIIIIIIIllIIl.getBytes(StandardCharsets.UTF_8)), lIlIlIIIlllIl[8]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIlIIIlllIl[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIllIIIIIIIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIllIIIIIIIllIll) {
            llllllllllllllIllIllIIIIIIIllIll.printStackTrace();
            return null;
        }
    }

    private static void lIllllIllIlIIll() {
        lIlIlIIIllIll = new String[lIlIlIIIlllIl[30]];
        lIlIlIIIllIll[lIlIlIIIlllIl[0]] = lIllllIllIIlIIl("y2JXLw/XFpo=", "RZoiz");
        lIlIlIIIllIll[lIlIlIIIlllIl[2]] = lIllllIllIIlIIl("L3u9QRQ1qww=", "ffCod");
        lIlIlIIIllIll[lIlIlIIIlllIl[3]] = lIllllIllIIlIIl("Qh1kqfwCWaE=", "kRQpg");
        lIlIlIIIllIll[lIlIlIIIlllIl[4]] = lIllllIllIIlIlI("OzA/JBNc", "oioaL");
        lIlIlIIIllIll[lIlIlIIIlllIl[1]] = lIllllIllIIlIlI("ORYGPDBZ", "mOVyo");
        lIlIlIIIllIll[lIlIlIIIlllIl[5]] = lIllllIllIIlIIl("nZQYDHd7GiQ=", "Ogsoh");
        lIlIlIIIllIll[lIlIlIIIlllIl[6]] = lIllllIllIIlIll("VThXvUVfRGc=", "LpnDE");
        lIlIlIIIllIll[lIlIlIIIlllIl[7]] = lIllllIllIIlIll("r/aZsxJrYUY=", "uuCGU");
        lIlIlIIIllIll[lIlIlIIIlllIl[8]] = lIllllIllIIlIIl("tEj+X0i0yXo=", "PMFSZ");
        lIlIlIIIllIll[lIlIlIIIlllIl[9]] = lIllllIllIIlIlI("LBIBMS9B", "xKQtp");
        lIlIlIIIllIll[lIlIlIIIlllIl[10]] = lIllllIllIIlIlI("FzYqCApyXw==", "CozMU");
        lIlIlIIIllIll[lIlIlIIIlllIl[11]] = lIllllIllIIlIIl("iAKtmR9MXI4=", "waPsC");
        lIlIlIIIllIll[lIlIlIIIlllIl[12]] = lIllllIllIIlIlI("MDEBLi1VWg==", "dhQkr");
        lIlIlIIIllIll[lIlIlIIIlllIl[13]] = lIllllIllIIlIll("gqEFWBdyQ2c=", "YpReh");
        lIlIlIIIllIll[lIlIlIIIlllIl[14]] = lIllllIllIIlIll("nbvnHU8UygA=", "tyYKh");
        lIlIlIIIllIll[lIlIlIIIlllIl[15]] = lIllllIllIIlIll("+0Qz3BKlIzo=", "uTpWn");
        lIlIlIIIllIll[lIlIlIIIlllIl[16]] = lIllllIllIIlIll("OYwcg0t0tNA=", "QLvin");
        lIlIlIIIllIll[lIlIlIIIlllIl[17]] = lIllllIllIIlIIl("y1UGeBt/Qks=", "YdmtD");
        lIlIlIIIllIll[lIlIlIIIlllIl[18]] = lIllllIllIIlIll("/HrzZEDwWJA=", "CSeuY");
        lIlIlIIIllIll[lIlIlIIIlllIl[19]] = lIllllIllIIlIlI("NRYSHSlQdg==", "aOBXv");
        lIlIlIIIllIll[lIlIlIIIlllIl[20]] = lIllllIllIIlIll("2jkHO3j2p1E=", "qRUHd");
        lIlIlIIIllIll[lIlIlIIIlllIl[21]] = lIllllIllIIlIlI("LjICMgtIWg==", "zkRwT");
        lIlIlIIIllIll[lIlIlIIIlllIl[22]] = lIllllIllIIlIll("zebuyPcSZrk=", "LyLOl");
        lIlIlIIIllIll[lIlIlIIIlllIl[23]] = lIllllIllIIlIlI("MzUKDBNVXw==", "glZIL");
        lIlIlIIIllIll[lIlIlIIIlllIl[24]] = lIllllIllIIlIlI("JSEJATtDTA==", "qxYDd");
        lIlIlIIIllIll[lIlIlIIIlllIl[25]] = lIllllIllIIlIIl("jg6x6B6YK18=", "xJEgb");
        lIlIlIIIllIll[lIlIlIIIlllIl[26]] = lIllllIllIIlIIl("p+iJy1fuybU=", "oenoZ");
        lIlIlIIIllIll[lIlIlIIIlllIl[27]] = lIllllIllIIlIll("cqfTfzzoWf0=", "DtLRs");
        lIlIlIIIllIll[lIlIlIIIlllIl[28]] = lIllllIllIIlIlI("BDA8Bz1iUQ==", "PilBb");
        lIlIlIIIllIll[lIlIlIIIlllIl[29]] = lIllllIllIIlIlI("NT0WLTtTXQ==", "adFhd");
    }

    private static void lIllllIllIlIlII() {
        lIlIlIIIlllIl = new int[31];
        lIlIlIIIlllIl[0] = "  ".length() & ("  ".length() ^ (-1));
        lIlIlIIIlllIl[1] = 184 ^ 188;
        lIlIlIIIlllIl[2] = " ".length();
        lIlIlIIIlllIl[3] = "  ".length();
        lIlIlIIIlllIl[4] = "   ".length();
        lIlIlIIIlllIl[5] = (176 ^ 180) ^ " ".length();
        lIlIlIIIlllIl[6] = (((10 + 126) - 10) + 32) ^ (((110 + 149) - 124) + 17);
        lIlIlIIIlllIl[7] = (180 ^ 150) ^ (34 ^ 7);
        lIlIlIIIlllIl[8] = 136 ^ 128;
        lIlIlIIIlllIl[9] = 114 ^ 123;
        lIlIlIIIlllIl[10] = (123 ^ 110) ^ (34 ^ 61);
        lIlIlIIIlllIl[11] = (((190 + 95) - 192) + 112) ^ (((20 + 70) - (-56)) + 52);
        lIlIlIIIlllIl[12] = 40 ^ 36;
        lIlIlIIIlllIl[13] = (((132 + 87) - 122) + 48) ^ (((9 + 69) - 46) + 124);
        lIlIlIIIlllIl[14] = 159 ^ 145;
        lIlIlIIIlllIl[15] = 149 ^ 154;
        lIlIlIIIlllIl[16] = 56 ^ 40;
        lIlIlIIIlllIl[17] = 109 ^ 124;
        lIlIlIIIlllIl[18] = (116 ^ 111) ^ (54 ^ 63);
        lIlIlIIIlllIl[19] = (((6 + 210) - 103) + 98) ^ (((96 + 111) - 170) + 155);
        lIlIlIIIlllIl[20] = 184 ^ 172;
        lIlIlIIIlllIl[21] = 171 ^ 190;
        lIlIlIIIlllIl[22] = (184 ^ 194) ^ (121 ^ 21);
        lIlIlIIIlllIl[23] = (((80 + 137) - 172) + 108) ^ (((20 + 45) - (-12)) + 65);
        lIlIlIIIlllIl[24] = (((2 + 182) - 34) + 38) ^ (((81 + 120) - 176) + 139);
        lIlIlIIIlllIl[25] = (((50 + 121) - 144) + 113) ^ (((29 + 148) - 169) + 141);
        lIlIlIIIlllIl[26] = (138 ^ 186) ^ (7 ^ 45);
        lIlIlIIIlllIl[27] = (182 ^ 156) ^ (65 ^ 112);
        lIlIlIIIlllIl[28] = 27 ^ 7;
        lIlIlIIIlllIl[29] = 111 ^ 114;
        lIlIlIIIlllIl[30] = (18 ^ 113) ^ (242 ^ 143);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    private static String lIllllIllIIlIlI(String llllllllllllllIllIllIIIIIIlIllll, String llllllllllllllIllIllIIIIIIlIlllI) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllIllIIIIIIlIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIllIIIIIIlIllIl = new StringBuilder();
        char[] charArray = llllllllllllllIllIllIIIIIIlIlllI.toCharArray();
        int llllllllllllllIllIllIIIIIIlIlIll = lIlIlIIIlllIl[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int llllllllllllllIllIllIIIIIIlIIIll = lIlIlIIIlllIl[0];
        while (lIllllIllIlIlIl(llllllllllllllIllIllIIIIIIlIIIll, length)) {
            llllllllllllllIllIllIIIIIIlIllIl.append((char) (charArray2[llllllllllllllIllIllIIIIIIlIIIll] ^ charArray[llllllllllllllIllIllIIIIIIlIlIll % charArray.length]));
            "".length();
            llllllllllllllIllIllIIIIIIlIlIll++;
            llllllllllllllIllIllIIIIIIlIIIll++;
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllIllIIIIIIlIllIl);
    }

    private l(String str, int i, k... kVarArr) {
        this.attackStyles = kVarArr;
    }

    public k[] O() {
        return this.attackStyles;
    }

    private static String lIllllIllIIlIll(String llllllllllllllIllIllIIIIIIllllIl, String llllllllllllllIllIllIIIIIIlllllI) {
        try {
            SecretKeySpec llllllllllllllIllIllIIIIIlIIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIllIIIIIIlllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIlIIIlllIl[3], llllllllllllllIllIllIIIIIlIIIIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIllIIIIIIllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIllIIIIIlIIIIII) {
            llllllllllllllIllIllIIIIIlIIIIII.printStackTrace();
            return null;
        }
    }

    public static l e(int i) {
        return weaponTypes.get(Integer.valueOf(i));
    }
}
