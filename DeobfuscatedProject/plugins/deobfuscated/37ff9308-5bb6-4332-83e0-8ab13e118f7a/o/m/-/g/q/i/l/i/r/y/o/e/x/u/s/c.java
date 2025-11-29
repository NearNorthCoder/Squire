/*
 * Decompiled with CFR 0.152.
 */
package o.m.-.g.q.i.l.i.r.y.o.e.x.u.s;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class c
extends Enum<c> {
    public static final /* synthetic */ /* enum */ c AVANTOE;
    public static final /* synthetic */ /* enum */ c TOADFLAX;
    public static final /* synthetic */ /* enum */ c KWUARM;
    public static final /* synthetic */ /* enum */ c KWUARM_POT_UNF;
    private static /* synthetic */ int[] llllllllIlII;
    public static final /* synthetic */ /* enum */ c SNAPDRAGON_POT_UNF;
    public static final /* synthetic */ /* enum */ c SNAPDRAGON;
    public static final /* synthetic */ /* enum */ c RANARR_POT_UNF;
    public static final /* synthetic */ /* enum */ c AVANTOE_POT_UNF;
    private final /* synthetic */ String name;
    public static final /* synthetic */ /* enum */ c RANARR_WEED;
    private final /* synthetic */ int herbId;
    private static final /* synthetic */ c[] $VALUES;
    private static /* synthetic */ String[] llllllllIIll;
    public static final /* synthetic */ /* enum */ c TOADFLAX_POT_UNF;

    static {
        c.lIIlIlIllIlIIll();
        c.lIIlIlIllIlIIlI();
        RANARR_WEED = new c(llllllllIIll[llllllllIlII[1]], llllllllIlII[2]);
        TOADFLAX = new c(llllllllIIll[llllllllIlII[4]], llllllllIlII[5]);
        AVANTOE = new c(llllllllIIll[llllllllIlII[7]], llllllllIlII[8]);
        KWUARM = new c(llllllllIIll[llllllllIlII[10]], llllllllIlII[11]);
        SNAPDRAGON = new c(llllllllIIll[llllllllIlII[13]], llllllllIlII[14]);
        RANARR_POT_UNF = new c(llllllllIIll[llllllllIlII[16]], llllllllIlII[17]);
        TOADFLAX_POT_UNF = new c(llllllllIIll[llllllllIlII[19]], llllllllIlII[20]);
        AVANTOE_POT_UNF = new c(llllllllIIll[llllllllIlII[22]], llllllllIlII[23]);
        KWUARM_POT_UNF = new c(llllllllIIll[llllllllIlII[25]], llllllllIlII[26]);
        SNAPDRAGON_POT_UNF = new c(llllllllIIll[llllllllIlII[28]], llllllllIlII[29]);
        c[] cArray = new c[llllllllIlII[15]];
        cArray[c.llllllllIlII[0]] = RANARR_WEED;
        cArray[c.llllllllIlII[1]] = TOADFLAX;
        cArray[c.llllllllIlII[3]] = AVANTOE;
        cArray[c.llllllllIlII[4]] = KWUARM;
        cArray[c.llllllllIlII[6]] = SNAPDRAGON;
        cArray[c.llllllllIlII[7]] = RANARR_POT_UNF;
        cArray[c.llllllllIlII[9]] = TOADFLAX_POT_UNF;
        cArray[c.llllllllIlII[10]] = AVANTOE_POT_UNF;
        cArray[c.llllllllIlII[12]] = KWUARM_POT_UNF;
        cArray[c.llllllllIlII[13]] = SNAPDRAGON_POT_UNF;
        $VALUES = cArray;
    }

    private static String lIIlIlIllIlIIII(String lllllllllllllllIIlIIIIllIlIllIIl, String lllllllllllllllIIlIIIIllIlIlIIll) {
        lllllllllllllllIIlIIIIllIlIllIIl = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIIIllIlIllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIIIIllIlIlIlll = new StringBuilder();
        char[] lllllllllllllllIIlIIIIllIlIlIllI = lllllllllllllllIIlIIIIllIlIlIIll.toCharArray();
        int lllllllllllllllIIlIIIIllIlIlIlIl = llllllllIlII[0];
        char[] lllllllllllllllIIlIIIIllIlIIllll = lllllllllllllllIIlIIIIllIlIllIIl.toCharArray();
        int lllllllllllllllIIlIIIIllIlIIlllI = lllllllllllllllIIlIIIIllIlIIllll.length;
        int lllllllllllllllIIlIIIIllIlIIllIl = llllllllIlII[0];
        while (c.lIIlIlIllIlIlII(lllllllllllllllIIlIIIIllIlIIllIl, lllllllllllllllIIlIIIIllIlIIlllI)) {
            char lllllllllllllllIIlIIIIllIlIllIlI = lllllllllllllllIIlIIIIllIlIIllll[lllllllllllllllIIlIIIIllIlIIllIl];
            lllllllllllllllIIlIIIIllIlIlIlll.append((char)(lllllllllllllllIIlIIIIllIlIllIlI ^ lllllllllllllllIIlIIIIllIlIlIllI[lllllllllllllllIIlIIIIllIlIlIlIl % lllllllllllllllIIlIIIIllIlIlIllI.length]));
            0;
            ++lllllllllllllllIIlIIIIllIlIlIlIl;
            ++lllllllllllllllIIlIIIIllIlIIllIl;
            0;
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIIIIllIlIlIlll);
    }

    public int b() {
        return this.herbId;
    }

    private static void lIIlIlIllIlIIlI() {
        llllllllIIll = new String[llllllllIlII[30]];
        c.llllllllIIll[c.llllllllIlII[0]] = c."RANARR_WEED";
        c.llllllllIIll[c.llllllllIlII[1]] = c."Ranarr weed";
        c.llllllllIIll[c.llllllllIlII[3]] = c."TOADFLAX";
        c.llllllllIIll[c.llllllllIlII[4]] = c."Toadflax";
        c.llllllllIIll[c.llllllllIlII[6]] = c."AVANTOE";
        c.llllllllIIll[c.llllllllIlII[7]] = c."Avantoe";
        c.llllllllIIll[c.llllllllIlII[9]] = c."KWUARM";
        c.llllllllIIll[c.llllllllIlII[10]] = c."Kwuarm";
        c.llllllllIIll[c.llllllllIlII[12]] = c."SNAPDRAGON";
        c.llllllllIIll[c.llllllllIlII[13]] = c."Snapdragon";
        c.llllllllIIll[c.llllllllIlII[15]] = c."RANARR_POT_UNF";
        c.llllllllIIll[c.llllllllIlII[16]] = c."Ranarr potion (unf)";
        c.llllllllIIll[c.llllllllIlII[18]] = c."TOADFLAX_POT_UNF";
        c.llllllllIIll[c.llllllllIlII[19]] = c."Toadflax potion (unf)";
        c.llllllllIIll[c.llllllllIlII[21]] = c."AVANTOE_POT_UNF";
        c.llllllllIIll[c.llllllllIlII[22]] = c."Avantoe potion (unf)";
        c.llllllllIIll[c.llllllllIlII[24]] = c."KWUARM_POT_UNF";
        c.llllllllIIll[c.llllllllIlII[25]] = c."Kwuarm potion (unf)";
        c.llllllllIIll[c.llllllllIlII[27]] = c."SNAPDRAGON_POT_UNF";
        c.llllllllIIll[c.llllllllIlII[28]] = c."Snapdragon potion (unf)";
    }

    private static void lIIlIlIllIlIIll() {
        llllllllIlII = new int[31];
        c.llllllllIlII[0] = (1 ^ 0x10) & ~(0x7F ^ 0x6E);
        c.llllllllIlII[1] = 1;
        c.llllllllIlII[2] = 0xFFFF93DD & 0x6D23;
        c.llllllllIlII[3] = 2;
        c.llllllllIlII[4] = 3;
        c.llllllllIlII[5] = 0xFFFFCFFF & 0x3BB6;
        c.llllllllIlII[6] = 151 + 134 - 251 + 155 ^ 180 + 61 - 99 + 43;
        c.llllllllIlII[7] = 0xDA ^ 0xA7 ^ (0x60 ^ 0x18);
        c.llllllllIlII[8] = 0xFFFFA5F5 & 0x5B0F;
        c.llllllllIlII[9] = 0x1B ^ 0x2C ^ (0x4F ^ 0x7E);
        c.llllllllIlII[10] = 0x2E ^ 0x29;
        c.llllllllIlII[11] = 0xFFFF8DCF & 0x7337;
        c.llllllllIlII[12] = 0x22 ^ 0x2A;
        c.llllllllIlII[13] = 0xB4 ^ 0xAA ^ (0x54 ^ 0x43);
        c.llllllllIlII[14] = -(0xFFFF95E7 & 0x6E5F) & (0xFFFF8FFF & 0x7FFE);
        c.llllllllIlII[15] = 0xB1 ^ 0xBB;
        c.llllllllIlII[16] = 0x6A ^ 0x61;
        c.llllllllIlII[17] = 138 + 19 - 143 + 211 ^ 24 + 94 - -3 + 9;
        c.llllllllIlII[18] = 0x51 ^ 0x29 ^ (0x5A ^ 0x2E);
        c.llllllllIlII[19] = 0x22 ^ 0x2F;
        c.llllllllIlII[20] = -(0xFFFFFF4F & 0x24B2) & (0xFFFFBFBB & 0x6FFF);
        c.llllllllIlII[21] = 0xAD ^ 0xA3;
        c.llllllllIlII[22] = 0x5F ^ 0x50;
        c.llllllllIlII[23] = 0x49 ^ 0x2E;
        c.llllllllIlII[24] = 0x42 ^ 0xA ^ (0xEC ^ 0xB4);
        c.llllllllIlII[25] = 7 + 126 - 68 + 88 ^ 88 + 8 - 59 + 99;
        c.llllllllIlII[26] = 156 + 102 - 189 + 148 ^ 134 + 161 - 186 + 67;
        c.llllllllIlII[27] = 133 + 31 - 132 + 111 ^ 71 + 80 - 55 + 61;
        c.llllllllIlII[28] = 0x63 ^ 0x74 ^ (0x60 ^ 0x64);
        c.llllllllIlII[29] = -(0xFFFFDF97 & 0x346B) & (0xFFFFFFFE & 0x1FBF);
        c.llllllllIlII[30] = 76 + 104 - 10 + 6 ^ 109 + 127 - 222 + 150;
    }

    public String a() {
        return this.name;
    }

    private static boolean lIIlIlIllIlIlII(int n2, int n3) {
        return n2 < n3;
    }

    private c(String string2, int n3) {
        this.name = string2;
        this.herbId = n3;
    }

    private static String lIIlIlIllIIllll(String lllllllllllllllIIlIIIIllIIllIlll, String lllllllllllllllIIlIIIIllIIllIlII) {
        try {
            SecretKeySpec lllllllllllllllIIlIIIIllIIlllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIIllIIllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIIIIllIIlllIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIIIIllIIlllIIl.init(llllllllIlII[3], lllllllllllllllIIlIIIIllIIlllIlI);
            return new String(lllllllllllllllIIlIIIIllIIlllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIIllIIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIIIIllIIlllIII) {
            lllllllllllllllIIlIIIIllIIlllIII.printStackTrace();
            return null;
        }
    }

    public static c[] values() {
        return (c[])$VALUES.clone();
    }

    public static c valueOf(String string) {
        return Enum.valueOf(c.class, string);
    }

    private static String lIIlIlIllIlIIIl(String lllllllllllllllIIlIIIIllIlIIIIlI, String lllllllllllllllIIlIIIIllIlIIIIIl) {
        try {
            SecretKeySpec lllllllllllllllIIlIIIIllIlIIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIIllIlIIIIIl.getBytes(StandardCharsets.UTF_8)), llllllllIlII[12]), "DES");
            Cipher lllllllllllllllIIlIIIIllIlIIIllI = Cipher.getInstance("DES");
            lllllllllllllllIIlIIIIllIlIIIllI.init(llllllllIlII[3], lllllllllllllllIIlIIIIllIlIIIlll);
            return new String(lllllllllllllllIIlIIIIllIlIIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIIllIlIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIIIIllIlIIIlIl) {
            lllllllllllllllIIlIIIIllIlIIIlIl.printStackTrace();
            return null;
        }
    }
}

