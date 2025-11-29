package r.m.p000.a.e.u.i.t.i.f.e.t.q.h.r.s.p001;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.g  reason: invalid package */
/* loaded from: afc9cf98-0627-4d2a-8a9e-4e9657a2fb2d.jar:r/m/-/a/e/u/i/t/i/f/e/t/q/h/r/s/-/g.class */
public final class g {
    public static final /* synthetic */ g PATCH_9;
    public static final /* synthetic */ g PATCH_13;
    public static final /* synthetic */ g PATCH_6_NORTH;
    public static final /* synthetic */ g PATCH_10;
    private final /* synthetic */ int regionY;
    public static final /* synthetic */ g PATCH_15;
    public static final /* synthetic */ g PATCH_6;
    public static final /* synthetic */ g PATCH_14;
    public static final /* synthetic */ g PATCH_2;
    public static final /* synthetic */ g PATCH_3;
    public static final /* synthetic */ g PATCH_1;
    public static final /* synthetic */ g PATCH_1_NORTH;
    public static final /* synthetic */ g PATCH_16_NORTH;
    public static final /* synthetic */ g PATCH_11_NORTH;
    private static /* synthetic */ int[] lIIllllllllll;
    public static final /* synthetic */ g PATCH_4_NORTH;
    private static /* synthetic */ String[] lIIlllllllIll;
    public static final /* synthetic */ g PATCH_14_NORTH;
    public static final /* synthetic */ g PATCH_13_NORTH;
    public static final /* synthetic */ g PATCH_11;
    public static final /* synthetic */ g PATCH_12_NORTH;
    public static final /* synthetic */ g PATCH_2_NORTH;
    public static final /* synthetic */ g PATCH_8;
    public static final /* synthetic */ g PATCH_7;
    public static final /* synthetic */ g PATCH_7_NORTH;
    public static final /* synthetic */ g PATCH_9_NORTH;
    public static final /* synthetic */ g PATCH_3_NORTH;
    public static final /* synthetic */ g PATCH_13_SOUTH;
    public static final /* synthetic */ g PATCH_4;
    public static final /* synthetic */ g PATCH_12;
    private final /* synthetic */ int regionX;
    public static final /* synthetic */ g PATCH_5_NORTH;
    public static final /* synthetic */ g PATCH_10_NORTH;
    public static final /* synthetic */ g PATCH_16;
    public static final /* synthetic */ g PATCH_5;
    private static final /* synthetic */ g[] $VALUES;
    public static final /* synthetic */ g PATCH_8_NORTH;
    public static final /* synthetic */ g PATCH_15_NORTH;

    private static void lIllIllIIllIlIl() {
        lIIlllllllIll = new String[lIIllllllllll[42]];
        lIIlllllllIll[lIIllllllllll[0]] = lIllIllIIlIIlll("3Fg/2tq59KU=", "YcANg");
        lIIlllllllIll[lIIllllllllll[2]] = lIllIllIIlIlIII("BzgROgEISw==", "WyEyI");
        lIIlllllllIll[lIIllllllllll[6]] = lIllIllIIlIIlll("i25Y9dCzzLY=", "QMCmI");
        lIIlllllllIll[lIIllllllllll[8]] = lIllIllIIlIlIII("MjIuFyA9Rw==", "bszTh");
        lIIlllllllIll[lIIllllllllll[10]] = lIllIllIIlIlIIl("JocuKwyjVoemxp0KD0EYPA==", "cZZLL");
        lIIlllllllIll[lIIllllllllll[12]] = lIllIllIIlIIlll("ZxKmi7KvoukGZ2ads4xjyg==", "OHOFU");
        lIIlllllllIll[lIIllllllllll[14]] = lIllIllIIlIlIIl("LPTEHWHwI6eWd6URUooohQ==", "rFAGw");
        lIIlllllllIll[lIIllllllllll[16]] = lIllIllIIlIlIIl("15Nao2u1OktJHRT2Z503/Q==", "hifVz");
        lIIlllllllIll[lIIllllllllll[18]] = lIllIllIIlIlIII("MwQAGx48cA==", "cETXV");
        lIIlllllllIll[lIIllllllllll[20]] = lIllIllIIlIlIII("ExknBA8cbg==", "CXsGG");
        lIIlllllllIll[lIIllllllllll[21]] = lIllIllIIlIlIII("PjsuNQ4xTQ==", "nzzvF");
        lIIlllllllIll[lIIllllllllll[22]] = lIllIllIIlIlIIl("1yLYgG1iN2I=", "ivauK");
        lIIlllllllIll[lIIllllllllll[23]] = lIllIllIIlIIlll("NVIBXw24TdFxiscemWevWw==", "GLYch");
        lIIlllllllIll[lIIllllllllll[24]] = lIllIllIIlIIlll("ImA0zrzxRHFw7ROuww2eXQ==", "zTzkA");
        lIIlllllllIll[lIIllllllllll[25]] = lIllIllIIlIlIIl("72pMn0q6tNdA6IGPuVDdTA==", "KqSFL");
        lIIlllllllIll[lIIllllllllll[26]] = lIllIllIIlIlIII("JDMOEgErSgUfBiYmEg==", "trZQI");
        lIIlllllllIll[lIIllllllllll[27]] = lIllIllIIlIlIIl("aCGuZh7++No=", "QtcdV");
        lIIlllllllIll[lIIllllllllll[29]] = lIllIllIIlIIlll("f2USH2vV+33oKHbzt3LGkg==", "hpNjl");
        lIIlllllllIll[lIIllllllllll[30]] = lIllIllIIlIlIII("HhgyJDsRaFc=", "NYfgs");
        lIIlllllllIll[lIIllllllllll[31]] = lIllIllIIlIlIIl("SwzNWttul/+xUR3qBpWPKw==", "Bnoas");
        lIIlllllllIll[lIIllllllllll[32]] = lIllIllIIlIlIII("IwcHNxEsd2ArCjwTBzw=", "sFStY");
        lIIlllllllIll[lIIllllllllll[33]] = lIllIllIIlIlIIl("1/NlfgTYmddsw/XHWl4JDg==", "wwmQU");
        lIIlllllllIll[lIIllllllllll[34]] = lIllIllIIlIIlll("wsPxn4DS6dzzpoO7cIyPfw==", "MhCGE");
        lIIlllllllIll[lIIllllllllll[35]] = lIllIllIIlIIlll("gl3QxoJYn0Q9+VyYneC8QQ==", "IQaIe");
        lIIlllllllIll[lIIllllllllll[36]] = lIllIllIIlIlIII("JzQtGxIoREsHFDgnLRA=", "wuyXZ");
        lIIlllllllIll[lIIllllllllll[4]] = lIllIllIIlIlIII("PTI6BTAyQl0=", "msnFx");
        lIIlllllllIll[lIIllllllllll[37]] = lIllIllIIlIIlll("enj4g5RgWR3agmRRSeeJwg==", "DnNHx");
        lIIlllllllIll[lIIllllllllll[38]] = lIllIllIIlIlIIl("y5Z3hYXFj4PSa96Jh6ICRQ==", "decro");
        lIIlllllllIll[lIIllllllllll[5]] = lIllIllIIlIlIII("Owo4GSs0elo=", "kKlZc");
        lIIlllllllIll[lIIllllllllll[39]] = lIllIllIIlIlIIl("4RoUv2VXmdsNv0T44yuOaQ==", "XaNwX");
        lIIlllllllIll[lIIllllllllll[40]] = lIllIllIIlIIlll("gCmvTG1lHRnvOIGiOTH3IQ==", "ufwpT");
        lIIlllllllIll[lIIllllllllll[7]] = lIllIllIIlIlIIl("KzplD5QXncN5QhBfKZ9tDA==", "cRgci");
        lIIlllllllIll[lIIllllllllll[41]] = lIllIllIIlIlIIl("ficwUGslezL0QKgSBJsqXA==", "VYTGu");
    }

    private g(String str, int i, int i2, int i3) {
        this.regionX = i2;
        this.regionY = i3;
    }

    private static String lIllIllIIlIlIIl(String llllllllllllllIlllIIlIlIlIIIllII, String llllllllllllllIlllIIlIlIlIIIlIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIlIlIlIIIlIll.getBytes(StandardCharsets.UTF_8)), lIIllllllllll[18]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIllllllllll[6], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIlIlIlIIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIlIlIlIIIllIl) {
            llllllllllllllIlllIIlIlIlIIIllIl.printStackTrace();
            return null;
        }
    }

    static {
        lIllIllIIllIlll();
        lIllIllIIllIlIl();
        PATCH_1 = new g(lIIlllllllIll[lIIllllllllll[0]], lIIllllllllll[0], lIIllllllllll[3], lIIllllllllll[4]);
        PATCH_2 = new g(lIIlllllllIll[lIIllllllllll[2]], lIIllllllllll[2], lIIllllllllll[3], lIIllllllllll[5]);
        PATCH_3 = new g(lIIlllllllIll[lIIllllllllll[6]], lIIllllllllll[6], lIIllllllllll[3], lIIllllllllll[7]);
        PATCH_4 = new g(lIIlllllllIll[lIIllllllllll[8]], lIIllllllllll[8], lIIllllllllll[3], lIIllllllllll[9]);
        PATCH_1_NORTH = new g(lIIlllllllIll[lIIllllllllll[10]], lIIllllllllll[10], lIIllllllllll[3], lIIllllllllll[11]);
        PATCH_2_NORTH = new g(lIIlllllllIll[lIIllllllllll[12]], lIIllllllllll[12], lIIllllllllll[3], lIIllllllllll[13]);
        PATCH_3_NORTH = new g(lIIlllllllIll[lIIllllllllll[14]], lIIllllllllll[14], lIIllllllllll[3], lIIllllllllll[15]);
        PATCH_4_NORTH = new g(lIIlllllllIll[lIIllllllllll[16]], lIIllllllllll[16], lIIllllllllll[3], lIIllllllllll[17]);
        PATCH_5 = new g(lIIlllllllIll[lIIllllllllll[18]], lIIllllllllll[18], lIIllllllllll[19], lIIllllllllll[4]);
        PATCH_6 = new g(lIIlllllllIll[lIIllllllllll[20]], lIIllllllllll[20], lIIllllllllll[19], lIIllllllllll[5]);
        PATCH_7 = new g(lIIlllllllIll[lIIllllllllll[21]], lIIllllllllll[21], lIIllllllllll[19], lIIllllllllll[7]);
        PATCH_8 = new g(lIIlllllllIll[lIIllllllllll[22]], lIIllllllllll[22], lIIllllllllll[19], lIIllllllllll[9]);
        PATCH_5_NORTH = new g(lIIlllllllIll[lIIllllllllll[23]], lIIllllllllll[23], lIIllllllllll[19], lIIllllllllll[11]);
        PATCH_6_NORTH = new g(lIIlllllllIll[lIIllllllllll[24]], lIIllllllllll[24], lIIllllllllll[19], lIIllllllllll[13]);
        PATCH_7_NORTH = new g(lIIlllllllIll[lIIllllllllll[25]], lIIllllllllll[25], lIIllllllllll[19], lIIllllllllll[15]);
        PATCH_8_NORTH = new g(lIIlllllllIll[lIIllllllllll[26]], lIIllllllllll[26], lIIllllllllll[19], lIIllllllllll[17]);
        PATCH_9 = new g(lIIlllllllIll[lIIllllllllll[27]], lIIllllllllll[27], lIIllllllllll[28], lIIllllllllll[4]);
        PATCH_10 = new g(lIIlllllllIll[lIIllllllllll[29]], lIIllllllllll[29], lIIllllllllll[28], lIIllllllllll[5]);
        PATCH_11 = new g(lIIlllllllIll[lIIllllllllll[30]], lIIllllllllll[30], lIIllllllllll[28], lIIllllllllll[7]);
        PATCH_12 = new g(lIIlllllllIll[lIIllllllllll[31]], lIIllllllllll[31], lIIllllllllll[28], lIIllllllllll[9]);
        PATCH_13_SOUTH = new g(lIIlllllllIll[lIIllllllllll[32]], lIIllllllllll[32], lIIllllllllll[28], lIIllllllllll[31]);
        PATCH_9_NORTH = new g(lIIlllllllIll[lIIllllllllll[33]], lIIllllllllll[33], lIIllllllllll[28], lIIllllllllll[11]);
        PATCH_10_NORTH = new g(lIIlllllllIll[lIIllllllllll[34]], lIIllllllllll[34], lIIllllllllll[28], lIIllllllllll[13]);
        PATCH_11_NORTH = new g(lIIlllllllIll[lIIllllllllll[35]], lIIllllllllll[35], lIIllllllllll[28], lIIllllllllll[15]);
        PATCH_12_NORTH = new g(lIIlllllllIll[lIIllllllllll[36]], lIIllllllllll[36], lIIllllllllll[28], lIIllllllllll[17]);
        PATCH_13 = new g(lIIlllllllIll[lIIllllllllll[4]], lIIllllllllll[4], lIIllllllllll[11], lIIllllllllll[4]);
        PATCH_14 = new g(lIIlllllllIll[lIIllllllllll[37]], lIIllllllllll[37], lIIllllllllll[11], lIIllllllllll[5]);
        PATCH_15 = new g(lIIlllllllIll[lIIllllllllll[38]], lIIllllllllll[38], lIIllllllllll[11], lIIllllllllll[7]);
        PATCH_16 = new g(lIIlllllllIll[lIIllllllllll[5]], lIIllllllllll[5], lIIllllllllll[11], lIIllllllllll[9]);
        PATCH_13_NORTH = new g(lIIlllllllIll[lIIllllllllll[39]], lIIllllllllll[39], lIIllllllllll[11], lIIllllllllll[11]);
        PATCH_14_NORTH = new g(lIIlllllllIll[lIIllllllllll[40]], lIIllllllllll[40], lIIllllllllll[11], lIIllllllllll[13]);
        PATCH_15_NORTH = new g(lIIlllllllIll[lIIllllllllll[7]], lIIllllllllll[7], lIIllllllllll[11], lIIllllllllll[15]);
        PATCH_16_NORTH = new g(lIIlllllllIll[lIIllllllllll[41]], lIIllllllllll[41], lIIllllllllll[11], lIIllllllllll[17]);
        g[] gVarArr = new g[lIIllllllllll[42]];
        gVarArr[lIIllllllllll[0]] = PATCH_1;
        gVarArr[lIIllllllllll[2]] = PATCH_2;
        gVarArr[lIIllllllllll[6]] = PATCH_3;
        gVarArr[lIIllllllllll[8]] = PATCH_4;
        gVarArr[lIIllllllllll[10]] = PATCH_1_NORTH;
        gVarArr[lIIllllllllll[12]] = PATCH_2_NORTH;
        gVarArr[lIIllllllllll[14]] = PATCH_3_NORTH;
        gVarArr[lIIllllllllll[16]] = PATCH_4_NORTH;
        gVarArr[lIIllllllllll[18]] = PATCH_5;
        gVarArr[lIIllllllllll[20]] = PATCH_6;
        gVarArr[lIIllllllllll[21]] = PATCH_7;
        gVarArr[lIIllllllllll[22]] = PATCH_8;
        gVarArr[lIIllllllllll[23]] = PATCH_5_NORTH;
        gVarArr[lIIllllllllll[24]] = PATCH_6_NORTH;
        gVarArr[lIIllllllllll[25]] = PATCH_7_NORTH;
        gVarArr[lIIllllllllll[26]] = PATCH_8_NORTH;
        gVarArr[lIIllllllllll[27]] = PATCH_9;
        gVarArr[lIIllllllllll[29]] = PATCH_10;
        gVarArr[lIIllllllllll[30]] = PATCH_11;
        gVarArr[lIIllllllllll[31]] = PATCH_12;
        gVarArr[lIIllllllllll[32]] = PATCH_13_SOUTH;
        gVarArr[lIIllllllllll[33]] = PATCH_9_NORTH;
        gVarArr[lIIllllllllll[34]] = PATCH_10_NORTH;
        gVarArr[lIIllllllllll[35]] = PATCH_11_NORTH;
        gVarArr[lIIllllllllll[36]] = PATCH_12_NORTH;
        gVarArr[lIIllllllllll[4]] = PATCH_13;
        gVarArr[lIIllllllllll[37]] = PATCH_14;
        gVarArr[lIIllllllllll[38]] = PATCH_15;
        gVarArr[lIIllllllllll[5]] = PATCH_16;
        gVarArr[lIIllllllllll[39]] = PATCH_13_NORTH;
        gVarArr[lIIllllllllll[40]] = PATCH_14_NORTH;
        gVarArr[lIIllllllllll[7]] = PATCH_15_NORTH;
        gVarArr[lIIllllllllll[41]] = PATCH_16_NORTH;
        $VALUES = gVarArr;
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }

    private static void lIllIllIIllIlll() {
        lIIllllllllll = new int[43];
        lIIllllllllll[0] = ((17 ^ 85) ^ (30 ^ 19)) & (((((6 + 162) - (-20)) + 44) ^ (((158 + 154) - 255) + 104)) ^ (-" ".length()));
        lIIllllllllll[1] = (-17089) & 24310;
        lIIllllllllll[2] = " ".length();
        lIIllllllllll[3] = 187 ^ 140;
        lIIllllllllll[4] = (((147 + 35) - 10) + 19) ^ (((23 + 71) - (-13)) + 59);
        lIIllllllllll[5] = (28 ^ 91) ^ (4 ^ 95);
        lIIllllllllll[6] = "  ".length();
        lIIllllllllll[7] = 22 ^ 9;
        lIIllllllllll[8] = "   ".length();
        lIIllllllllll[9] = (9 ^ 77) ^ (115 ^ 21);
        lIIllllllllll[10] = (200 ^ 166) ^ (62 ^ 84);
        lIIllllllllll[11] = (255 ^ 171) ^ (201 ^ 181);
        lIIllllllllll[12] = ((89 ^ 70) & ((157 ^ 130) ^ (-1))) ^ (110 ^ 107);
        lIIllllllllll[13] = (32 ^ 40) ^ (60 ^ 31);
        lIIllllllllll[14] = 143 ^ 137;
        lIIllllllllll[15] = 172 ^ 130;
        lIIllllllllll[16] = 5 ^ 2;
        lIIllllllllll[17] = 5 ^ 52;
        lIIllllllllll[18] = 37 ^ 45;
        lIIllllllllll[19] = 129 ^ 179;
        lIIllllllllll[20] = (253 ^ 181) ^ (228 ^ 165);
        lIIllllllllll[21] = 60 ^ 54;
        lIIllllllllll[22] = 112 ^ 123;
        lIIllllllllll[23] = (77 ^ 105) ^ (130 ^ 170);
        lIIllllllllll[24] = 133 ^ 136;
        lIIllllllllll[25] = (79 ^ 103) ^ (95 ^ 121);
        lIIllllllllll[26] = 34 ^ 45;
        lIIllllllllll[27] = (246 ^ 154) ^ (1 ^ 125);
        lIIllllllllll[28] = (77 ^ 65) ^ (50 ^ 19);
        lIIllllllllll[29] = (((31 + 73) - 60) + 110) ^ (((91 + 123) - 205) + 130);
        lIIllllllllll[30] = 125 ^ 111;
        lIIllllllllll[31] = (113 ^ 53) ^ (63 ^ 104);
        lIIllllllllll[32] = (((31 + 80) - (-33)) + 26) ^ (((61 + 15) - (-107)) + 7);
        lIIllllllllll[33] = 130 ^ 151;
        lIIllllllllll[34] = 174 ^ 184;
        lIIllllllllll[35] = (72 ^ 8) ^ (72 ^ 31);
        lIIllllllllll[36] = (170 ^ 137) ^ (149 ^ 174);
        lIIllllllllll[37] = (166 ^ 159) ^ (116 ^ 87);
        lIIllllllllll[38] = 140 ^ 151;
        lIIllllllllll[39] = 166 ^ 187;
        lIIllllllllll[40] = "  ".length() ^ (77 ^ 81);
        lIIllllllllll[41] = (226 ^ 158) ^ (44 ^ 112);
        lIIllllllllll[42] = 17 ^ 48;
    }

    private static boolean lIllIllIIlllIII(int i, int i2) {
        return i == i2;
    }

    private static String lIllIllIIlIlIII(String llllllllllllllIlllIIlIlIIlllllII, String llllllllllllllIlllIIlIlIIllllIll) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIlllIIlIlIIlllllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIIlIlIIllllIlI = new StringBuilder();
        char[] charArray = llllllllllllllIlllIIlIlIIllllIll.toCharArray();
        int llllllllllllllIlllIIlIlIIlllIIll = lIIllllllllll[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIIllllllllll[0];
        while (lIllIllIIlllIlI(i, length)) {
            char llllllllllllllIlllIIlIlIIlllllIl = charArray2[i];
            llllllllllllllIlllIIlIlIIllllIlI.append((char) (llllllllllllllIlllIIlIlIIlllllIl ^ charArray[llllllllllllllIlllIIlIlIIlllIIll % charArray.length]));
            "".length();
            llllllllllllllIlllIIlIlIIlllIIll++;
            i++;
            "".length();
            if ("   ".length() < (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIlllIIlIlIIllllIlI);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public WorldPoint n() {
        return WorldPoint.fromRegion(lIIllllllllll[1], this.regionX, this.regionY, lIIllllllllll[0]);
    }

    private static boolean lIllIllIIlllIlI(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public boolean a(TileObject tileObject) {
        RegionPoint fromWorld = RegionPoint.fromWorld(tileObject.getWorldLocation());
        if (lIllIllIIlllIII(fromWorld.getX(), this.regionX) && lIllIllIIlllIII(fromWorld.getY(), this.regionY)) {
            ?? r0 = lIIllllllllll[2];
            "".length();
            return 0 != 0 ? ((((157 + 134) - 66) + 4) ^ (((141 + 84) - 111) + 60)) & (((((96 + 74) - 107) + 132) ^ (((56 + 120) - 115) + 75)) ^ (-" ".length())) : r0;
        }
        return lIIllllllllll[0];
    }

    private static String lIllIllIIlIIlll(String llllllllllllllIlllIIlIlIlIIllIIl, String llllllllllllllIlllIIlIlIlIIllIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIlIlIlIIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIIlIlIlIIllIll = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIIlIlIlIIllIll.init(lIIllllllllll[6], secretKeySpec);
            return new String(llllllllllllllIlllIIlIlIlIIllIll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIlIlIlIIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIlIlIlIIllIlI) {
            llllllllllllllIlllIIlIlIlIIllIlI.printStackTrace();
            return null;
        }
    }

    public RegionPoint m() {
        return new RegionPoint(this.regionX, this.regionY, lIIllllllllll[0], lIIllllllllll[1]);
    }
}
