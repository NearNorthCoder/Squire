package s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.e  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-thieving-0.0.1.jar:s/r/i/t/g/n/-/u/h/i/q/i/e/v/e/e.class */
public final class EnumC0004e {
    private final /* synthetic */ int foodId;
    private static /* synthetic */ String[] lIIllIllIIIlI;
    public static final /* synthetic */ EnumC0004e DARK_CRAB;
    private static /* synthetic */ int[] lIIllIlllIIII;
    public static final /* synthetic */ EnumC0004e SWORDFISH;
    public static final /* synthetic */ EnumC0004e CHOCOLATE_CAKE;
    public static final /* synthetic */ EnumC0004e TUNA;
    private static final /* synthetic */ EnumC0004e[] $VALUES;
    public static final /* synthetic */ EnumC0004e SHRIMP;
    public static final /* synthetic */ EnumC0004e SARA_BREW;
    public static final /* synthetic */ EnumC0004e SUPER_RESTORE;
    public static final /* synthetic */ EnumC0004e CAKE;
    public static final /* synthetic */ EnumC0004e SEA_TURTLE;
    public static final /* synthetic */ EnumC0004e NONE;
    public static final /* synthetic */ EnumC0004e JANGERBERRIES;
    public static final /* synthetic */ EnumC0004e WINE;
    public static final /* synthetic */ EnumC0004e ANCIENT_BREW;
    public static final /* synthetic */ EnumC0004e SHARK;
    public static final /* synthetic */ EnumC0004e PLAIN_PIZZA;
    public static final /* synthetic */ EnumC0004e PRAYER_POTION;
    public static final /* synthetic */ EnumC0004e BASS;
    public static final /* synthetic */ EnumC0004e MONKFISH;
    public static final /* synthetic */ EnumC0004e ANGLERFISH;
    public static final /* synthetic */ EnumC0004e KARAMBWAN;
    public static final /* synthetic */ EnumC0004e MANTA_RAY;
    public static final /* synthetic */ EnumC0004e PINEAPPLE_PIZZA;
    public static final /* synthetic */ EnumC0004e LOBSTER;

    private static String lIllIIIllIIlIll(String llllllllllllllIlllIlllIlIIIIlIlI, String llllllllllllllIlllIlllIlIIIIlIIl) {
        String llllllllllllllIlllIlllIlIIIIlIlI2 = new String(Base64.getDecoder().decode(llllllllllllllIlllIlllIlIIIIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIlllIlIIIIlIII = new StringBuilder();
        char[] charArray = llllllllllllllIlllIlllIlIIIIlIIl.toCharArray();
        int llllllllllllllIlllIlllIlIIIIIllI = lIIllIlllIIII[0];
        char[] charArray2 = llllllllllllllIlllIlllIlIIIIlIlI2.toCharArray();
        int length = charArray2.length;
        int i = lIIllIlllIIII[0];
        while (lIllIIIllIIlllI(i, length)) {
            char llllllllllllllIlllIlllIlIIIIlIll = charArray2[i];
            llllllllllllllIlllIlllIlIIIIlIII.append((char) (llllllllllllllIlllIlllIlIIIIlIll ^ charArray[llllllllllllllIlllIlllIlIIIIIllI % charArray.length]));
            "".length();
            llllllllllllllIlllIlllIlIIIIIllI++;
            i++;
            "".length();
            if ((153 ^ 157) <= ((176 ^ 186) & ((90 ^ 80) ^ (-1)))) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIlllIlllIlIIIIlIII);
    }

    public static EnumC0004e[] values() {
        return (EnumC0004e[]) $VALUES.clone();
    }

    private static void lIllIIIllIIllIl() {
        lIIllIlllIIII = new int[46];
        lIIllIlllIIII[0] = ((((159 + 162) - 295) + 142) ^ (((85 + 120) - 97) + 43)) & (("  ".length() ^ (124 ^ 65)) ^ (-" ".length()));
        lIIllIlllIIII[1] = " ".length();
        lIIllIlllIIII[2] = (-16069) & 16383;
        lIIllIlllIIII[3] = "  ".length();
        lIIllIlllIIII[4] = (-20621) & 22511;
        lIIllIlllIIII[5] = "   ".length();
        lIIllIlllIIII[6] = (-10371) & 12267;
        lIIllIlllIIII[7] = 6 ^ 2;
        lIIllIlllIIII[8] = (-26381) & 28669;
        lIIllIlllIIII[9] = (50 ^ 100) ^ (60 ^ 111);
        lIIllIlllIIII[10] = (-5891) & 8191;
        lIIllIlllIIII[11] = (((43 + 80) - 37) + 45) ^ (((40 + 112) - 134) + 115);
        lIIllIlllIIII[12] = (-((-781) & 19247)) & (-8197) & 28655;
        lIIllIlllIIII[13] = 2 ^ 5;
        lIIllIlllIIII[14] = (-((-16481) & 23777)) & (-513) & 8173;
        lIIllIlllIIII[15] = (((72 + 170) - 94) + 42) ^ (((164 + 15) - 147) + 150);
        lIIllIlllIIII[16] = (-((-20485) & 24215)) & (-24581) & 28671;
        lIIllIlllIIII[17] = (43 ^ 10) ^ (139 ^ 163);
        lIIllIlllIIII[18] = (-((-20490) & 20923)) & (-1) & 3577;
        lIIllIlllIIII[19] = (123 ^ 33) ^ (120 ^ 40);
        lIIllIlllIIII[20] = (-((-21397) & 31637)) & (-20481) & 31099;
        lIIllIlllIIII[21] = 139 ^ 128;
        lIIllIlllIIII[22] = (-((-1047) & 18079)) & (-15363) & 32767;
        lIIllIlllIIII[23] = (((84 + 201) - 165) + 84) ^ (((130 + 113) - 166) + 115);
        lIIllIlllIIII[24] = (-((-4555) & 20975)) & (-8402) & 32767;
        lIIllIlllIIII[25] = (47 ^ 51) ^ (67 ^ 82);
        lIIllIlllIIII[26] = (-((-259) & 12571)) & (-2661) & 15357;
        lIIllIlllIIII[27] = 27 ^ 21;
        lIIllIlllIIII[28] = (-8273) & 8669;
        lIIllIlllIIII[29] = (((71 + 115) - 68) + 9) ^ (229 ^ 149);
        lIIllIlllIIII[30] = (-((-23207) & 24319)) & (-12833) & 14335;
        lIIllIlllIIII[31] = (249 ^ 195) ^ (106 ^ 64);
        lIIllIlllIIII[32] = (-((-31825) & 32121)) & (-18503) & 32239;
        lIIllIlllIIII[33] = (145 ^ 135) ^ (12 ^ 11);
        lIIllIlllIIII[34] = (-21) & 11956;
        lIIllIlllIIII[35] = 180 ^ 166;
        lIIllIlllIIII[36] = (-((-11793) & 28177)) & (-9345) & 32413;
        lIIllIlllIIII[37] = 141 ^ 158;
        lIIllIlllIIII[38] = (-2) & 26341;
        lIIllIlllIIII[39] = 141 ^ 153;
        lIIllIlllIIII[40] = ((53 + 0) - (-194)) + 0;
        lIIllIlllIIII[41] = (96 ^ 76) ^ (116 ^ 77);
        lIIllIlllIIII[42] = (-((-243) & 17663)) & (-8226) & 28669;
        lIIllIlllIIII[43] = 142 ^ 152;
        lIIllIlllIIII[44] = (-20542) & 22975;
        lIIllIlllIIII[45] = (112 ^ 76) ^ (171 ^ 128);
    }

    private static String lIllIIIlIIIlIII(String llllllllllllllIlllIlllIIllllIlIl, String llllllllllllllIlllIlllIIllllIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlllIIllllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIlllIIllllIlll = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIlllIIllllIlll.init(lIIllIlllIIII[3], secretKeySpec);
            return new String(llllllllllllllIlllIlllIIllllIlll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlllIIllllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIlllIIllllIllI) {
            llllllllllllllIlllIlllIIllllIllI.printStackTrace();
            return null;
        }
    }

    private static String lIllIIIlIIIIlll(String llllllllllllllIlllIlllIlIIIllIlI, String llllllllllllllIlllIlllIlIIIllIIl) {
        try {
            SecretKeySpec llllllllllllllIlllIlllIlIIIlllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlllIlIIIllIIl.getBytes(StandardCharsets.UTF_8)), lIIllIlllIIII[15]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIllIlllIIII[3], llllllllllllllIlllIlllIlIIIlllIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlllIlIIIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIlllIlIIIllIll) {
            llllllllllllllIlllIlllIlIIIllIll.printStackTrace();
            return null;
        }
    }

    static {
        lIllIIIllIIllIl();
        lIllIIIllIIllII();
        NONE = new EnumC0004e(lIIllIllIIIlI[lIIllIlllIIII[0]], lIIllIlllIIII[0], lIIllIlllIIII[0]);
        SHRIMP = new EnumC0004e(lIIllIllIIIlI[lIIllIlllIIII[1]], lIIllIlllIIII[1], lIIllIlllIIII[2]);
        CAKE = new EnumC0004e(lIIllIllIIIlI[lIIllIlllIIII[3]], lIIllIlllIIII[3], lIIllIlllIIII[4]);
        CHOCOLATE_CAKE = new EnumC0004e(lIIllIllIIIlI[lIIllIlllIIII[5]], lIIllIlllIIII[5], lIIllIlllIIII[6]);
        PLAIN_PIZZA = new EnumC0004e(lIIllIllIIIlI[lIIllIlllIIII[7]], lIIllIlllIIII[7], lIIllIlllIIII[8]);
        PINEAPPLE_PIZZA = new EnumC0004e(lIIllIllIIIlI[lIIllIlllIIII[9]], lIIllIlllIIII[9], lIIllIlllIIII[10]);
        WINE = new EnumC0004e(lIIllIllIIIlI[lIIllIlllIIII[11]], lIIllIlllIIII[11], lIIllIlllIIII[12]);
        BASS = new EnumC0004e(lIIllIllIIIlI[lIIllIlllIIII[13]], lIIllIlllIIII[13], lIIllIlllIIII[14]);
        TUNA = new EnumC0004e(lIIllIllIIIlI[lIIllIlllIIII[15]], lIIllIlllIIII[15], lIIllIlllIIII[16]);
        KARAMBWAN = new EnumC0004e(lIIllIllIIIlI[lIIllIlllIIII[17]], lIIllIlllIIII[17], lIIllIlllIIII[18]);
        LOBSTER = new EnumC0004e(lIIllIllIIIlI[lIIllIlllIIII[19]], lIIllIlllIIII[19], lIIllIlllIIII[20]);
        SWORDFISH = new EnumC0004e(lIIllIllIIIlI[lIIllIlllIIII[21]], lIIllIlllIIII[21], lIIllIlllIIII[22]);
        MONKFISH = new EnumC0004e(lIIllIllIIIlI[lIIllIlllIIII[23]], lIIllIlllIIII[23], lIIllIlllIIII[24]);
        SHARK = new EnumC0004e(lIIllIllIIIlI[lIIllIlllIIII[25]], lIIllIlllIIII[25], lIIllIlllIIII[26]);
        SEA_TURTLE = new EnumC0004e(lIIllIllIIIlI[lIIllIlllIIII[27]], lIIllIlllIIII[27], lIIllIlllIIII[28]);
        MANTA_RAY = new EnumC0004e(lIIllIllIIIlI[lIIllIlllIIII[29]], lIIllIlllIIII[29], lIIllIlllIIII[30]);
        ANGLERFISH = new EnumC0004e(lIIllIllIIIlI[lIIllIlllIIII[31]], lIIllIlllIIII[31], lIIllIlllIIII[32]);
        DARK_CRAB = new EnumC0004e(lIIllIllIIIlI[lIIllIlllIIII[33]], lIIllIlllIIII[33], lIIllIlllIIII[34]);
        SARA_BREW = new EnumC0004e(lIIllIllIIIlI[lIIllIlllIIII[35]], lIIllIlllIIII[35], lIIllIlllIIII[36]);
        ANCIENT_BREW = new EnumC0004e(lIIllIllIIIlI[lIIllIlllIIII[37]], lIIllIlllIIII[37], lIIllIlllIIII[38]);
        JANGERBERRIES = new EnumC0004e(lIIllIllIIIlI[lIIllIlllIIII[39]], lIIllIlllIIII[39], lIIllIlllIIII[40]);
        SUPER_RESTORE = new EnumC0004e(lIIllIllIIIlI[lIIllIlllIIII[41]], lIIllIlllIIII[41], lIIllIlllIIII[42]);
        PRAYER_POTION = new EnumC0004e(lIIllIllIIIlI[lIIllIlllIIII[43]], lIIllIlllIIII[43], lIIllIlllIIII[44]);
        EnumC0004e[] enumC0004eArr = new EnumC0004e[lIIllIlllIIII[45]];
        enumC0004eArr[lIIllIlllIIII[0]] = NONE;
        enumC0004eArr[lIIllIlllIIII[1]] = SHRIMP;
        enumC0004eArr[lIIllIlllIIII[3]] = CAKE;
        enumC0004eArr[lIIllIlllIIII[5]] = CHOCOLATE_CAKE;
        enumC0004eArr[lIIllIlllIIII[7]] = PLAIN_PIZZA;
        enumC0004eArr[lIIllIlllIIII[9]] = PINEAPPLE_PIZZA;
        enumC0004eArr[lIIllIlllIIII[11]] = WINE;
        enumC0004eArr[lIIllIlllIIII[13]] = BASS;
        enumC0004eArr[lIIllIlllIIII[15]] = TUNA;
        enumC0004eArr[lIIllIlllIIII[17]] = KARAMBWAN;
        enumC0004eArr[lIIllIlllIIII[19]] = LOBSTER;
        enumC0004eArr[lIIllIlllIIII[21]] = SWORDFISH;
        enumC0004eArr[lIIllIlllIIII[23]] = MONKFISH;
        enumC0004eArr[lIIllIlllIIII[25]] = SHARK;
        enumC0004eArr[lIIllIlllIIII[27]] = SEA_TURTLE;
        enumC0004eArr[lIIllIlllIIII[29]] = MANTA_RAY;
        enumC0004eArr[lIIllIlllIIII[31]] = ANGLERFISH;
        enumC0004eArr[lIIllIlllIIII[33]] = DARK_CRAB;
        enumC0004eArr[lIIllIlllIIII[35]] = SARA_BREW;
        enumC0004eArr[lIIllIlllIIII[37]] = ANCIENT_BREW;
        enumC0004eArr[lIIllIlllIIII[39]] = JANGERBERRIES;
        enumC0004eArr[lIIllIlllIIII[41]] = SUPER_RESTORE;
        enumC0004eArr[lIIllIlllIIII[43]] = PRAYER_POTION;
        $VALUES = enumC0004eArr;
    }

    private static void lIllIIIllIIllII() {
        lIIllIllIIIlI = new String[lIIllIlllIIII[45]];
        lIIllIllIIIlI[lIIllIlllIIII[0]] = lIllIIIlIIIIlll("iZZPKhGVZdg=", "Iaovp");
        lIIllIllIIIlI[lIIllIlllIIII[1]] = lIllIIIlIIIlIII("DAzbMHkvgbE=", "gjsrE");
        lIIllIllIIIlI[lIIllIlllIIII[3]] = lIllIIIlIIIlIII("iLPnrWii+/k=", "oALaf");
        lIIllIllIIIlI[lIIllIlllIIII[5]] = lIllIIIllIIlIll("LwkfABsgAAQGCy8AGwY=", "lAPCT");
        lIIllIllIIIlI[lIIllIlllIIII[7]] = lIllIIIlIIIIlll("wmPtRdHY3hCTZW1JNYpi2w==", "OgMEG");
        lIIllIllIIIlI[lIIllIlllIIII[9]] = lIllIIIlIIIIlll("99qSYx4nUpkkrKIZqu4E8w==", "vBDsZ");
        lIIllIllIIIlI[lIIllIlllIIII[11]] = lIllIIIlIIIlIII("571tjYkC73c=", "Otplm");
        lIIllIllIIIlI[lIIllIlllIIII[13]] = lIllIIIlIIIIlll("iFGNyUV2F6o=", "TMUTB");
        lIIllIllIIIlI[lIIllIlllIIII[15]] = lIllIIIlIIIlIII("xUT5fmL9Ado=", "QXMLM");
        lIIllIllIIIlI[lIIllIlllIIII[17]] = lIllIIIlIIIIlll("1cTON+J2HpqJPK3fwsIZ0w==", "CdRQd");
        lIIllIllIIIlI[lIIllIlllIIII[19]] = lIllIIIlIIIlIII("rf4vYYHdLX0=", "JgQRl");
        lIIllIllIIIlI[lIIllIlllIIII[21]] = lIllIIIlIIIlIII("m8eXC5oJDd9JNhsBZC65NQ==", "Avkdx");
        lIIllIllIIIlI[lIIllIlllIIII[23]] = lIllIIIlIIIIlll("u8+d3zIaa7QXM4XlilJXSQ==", "OOMrd");
        lIIllIllIIIlI[lIIllIlllIIII[25]] = lIllIIIllIIlIll("CSA0PCg=", "Zhunc");
        lIIllIllIIIlI[lIIllIlllIIII[27]] = lIllIIIlIIIlIII("tcZgfjW/7lCd+27BuesCNg==", "sSlgQ");
        lIIllIllIIIlI[lIIllIlllIIII[29]] = lIllIIIllIIlIll("KjIsBBI4ISMJ", "gsbPS");
        lIIllIllIIIlI[lIIllIlllIIII[31]] = lIllIIIlIIIlIII("senCynndjRpvbGFXh2PBAA==", "sHdOG");
        lIIllIllIIIlI[lIIllIlllIIII[33]] = lIllIIIllIIlIll("FSswHDISOCMV", "QjbWm");
        lIIllIllIIIlI[lIIllIlllIIII[35]] = lIllIIIllIIlIll("HzsVLB4OKAI6", "LzGmA");
        lIIllIllIIIlI[lIIllIlllIIII[37]] = lIllIIIlIIIIlll("ozpBzRO/x3YELxhuB7Ar2w==", "JyGHL");
        lIIllIllIIIlI[lIIllIlllIIII[39]] = lIllIIIlIIIlIII("oBBTltCCiuP+twWr7q91SA==", "soFgC");
        lIIllIllIIIlI[lIIllIlllIIII[41]] = lIllIIIlIIIIlll("QzsZBDZc7qOSEMqt1bJ2dw==", "gBdUX");
        lIIllIllIIIlI[lIIllIlllIIII[43]] = lIllIIIlIIIlIII("DVSNXk/OWKxNQeKOZLGBig==", "mZYVS");
    }

    public static EnumC0004e valueOf(String str) {
        return (EnumC0004e) Enum.valueOf(EnumC0004e.class, str);
    }

    private static boolean lIllIIIllIIlllI(int i, int i2) {
        return i < i2;
    }

    private EnumC0004e(String str, int i, int i2) {
        this.foodId = i2;
    }

    public int x() {
        return this.foodId;
    }
}
