/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;

final class CAEnum
extends Enum<ca> {
    public static final /* synthetic */ /* enum */ ca RUNE_AXE;
    public static final /* synthetic */ /* enum */ ca BRONZE_AXE;
    public static final /* synthetic */ /* enum */ ca IRON_AXE;
    private static /* synthetic */ int[] lIIIlllII;
    public static final /* synthetic */ /* enum */ ca INFARNAL_AXE;
    public static final /* synthetic */ /* enum */ ca GILDED_AXE;
    public static final /* synthetic */ /* enum */ ca MITHRIL_AXE;
    public static final /* synthetic */ /* enum */ ca STEEL_AXE;
    public static final /* synthetic */ /* enum */ ca ADAMANT_AXE;
    public static final /* synthetic */ /* enum */ ca DRAGON_AXE;
    private static /* synthetic */ String[] lIIIllIlI;
    private final /* synthetic */ int itemID;
    private final /* synthetic */ Prayer protectionPrayer;
    public static final /* synthetic */ /* enum */ ca BLESSED_AXE;
    public static final /* synthetic */ /* enum */ ca BLACK_AXE;
    public static final /* synthetic */ /* enum */ ca CRYSTAL_AXE;
    public static final /* synthetic */ /* enum */ ca THIRD_AGE_AXE;
    private static final /* synthetic */ ca[] $VALUES;

    static {
        ca.llllIllIlI();
        ca.llllIllIIl();
        BRONZE_AXE = new ca(lIIIlllII[1], Prayer.PROTECT_FROM_MELEE);
        IRON_AXE = new ca(lIIIlllII[3], Prayer.PROTECT_FROM_MELEE);
        STEEL_AXE = new ca(lIIIlllII[5], Prayer.PROTECT_FROM_MELEE);
        BLACK_AXE = new ca(lIIIlllII[7], Prayer.PROTECT_FROM_MELEE);
        MITHRIL_AXE = new ca(lIIIlllII[9], Prayer.PROTECT_FROM_MELEE);
        ADAMANT_AXE = new ca(lIIIlllII[11], Prayer.PROTECT_FROM_MELEE);
        RUNE_AXE = new ca(lIIIlllII[13], Prayer.PROTECT_FROM_MELEE);
        DRAGON_AXE = new ca(lIIIlllII[15], Prayer.PROTECT_FROM_MELEE);
        CRYSTAL_AXE = new ca(lIIIlllII[17], Prayer.PROTECT_FROM_MELEE);
        BLESSED_AXE = new ca(lIIIlllII[19], Prayer.PROTECT_FROM_MELEE);
        GILDED_AXE = new ca(lIIIlllII[21], Prayer.PROTECT_FROM_MELEE);
        THIRD_AGE_AXE = new ca(lIIIlllII[23], Prayer.PROTECT_FROM_MELEE);
        INFARNAL_AXE = new ca(lIIIlllII[25], Prayer.PROTECT_FROM_MELEE);
        ca[] caArray = new ca[lIIIlllII[26]];
        caArray[ca.lIIIlllII[0]] = BRONZE_AXE;
        caArray[ca.lIIIlllII[2]] = IRON_AXE;
        caArray[ca.lIIIlllII[4]] = STEEL_AXE;
        caArray[ca.lIIIlllII[6]] = BLACK_AXE;
        caArray[ca.lIIIlllII[8]] = MITHRIL_AXE;
        caArray[ca.lIIIlllII[10]] = ADAMANT_AXE;
        caArray[ca.lIIIlllII[12]] = RUNE_AXE;
        caArray[ca.lIIIlllII[14]] = DRAGON_AXE;
        caArray[ca.lIIIlllII[16]] = CRYSTAL_AXE;
        caArray[ca.lIIIlllII[18]] = BLESSED_AXE;
        caArray[ca.lIIIlllII[20]] = GILDED_AXE;
        caArray[ca.lIIIlllII[22]] = THIRD_AGE_AXE;
        caArray[ca.lIIIlllII[24]] = INFARNAL_AXE;
        $VALUES = caArray;
    }

    private static String llllIlIIIl(String llIIlIlIIIIIlIl, String llIIlIlIIIIIlII) {
        try {
            SecretKeySpec llIIlIlIIIIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIlIlIIIIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIIlIlIIIIlIIl = Cipher.getInstance("Blowfish");
            llIIlIlIIIIlIIl.init(lIIIlllII[4], llIIlIlIIIIlIlI);
            return new String(llIIlIlIIIIlIIl.doFinal(Base64.getDecoder().decode(llIIlIlIIIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIlIlIIIIlIII) {
            llIIlIlIIIIlIII.printStackTrace();
            return null;
        }
    }

    private static boolean lllllIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    public int ar() {
        return this.itemID;
    }

    private ca(int n3, Prayer prayer) {
        this.itemID = n3;
        this.protectionPrayer = prayer;
    }

    private static String llllIlIIlI(String llIIlIlIIIlIlll, String llIIlIlIIIllIll) {
        llIIlIlIIIlIlll = new String(Base64.getDecoder().decode(llIIlIlIIIlIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIIlIlIIIllIlI = new StringBuilder();
        char[] llIIlIlIIIllIIl = llIIlIlIIIllIll.toCharArray();
        int llIIlIlIIIllIII = lIIIlllII[0];
        char[] llIIlIlIIIlIIlI = llIIlIlIIIlIlll.toCharArray();
        int llIIlIlIIIlIIIl = llIIlIlIIIlIIlI.length;
        int llIIlIlIIIlIIII = lIIIlllII[0];
        while (ca.lllllIlIIl(llIIlIlIIIlIIII, llIIlIlIIIlIIIl)) {
            char llIIlIlIIIlllIl = llIIlIlIIIlIIlI[llIIlIlIIIlIIII];
            llIIlIlIIIllIlI.append((char)(llIIlIlIIIlllIl ^ llIIlIlIIIllIIl[llIIlIlIIIllIII % llIIlIlIIIllIIl.length]));
            0;
            ++llIIlIlIIIllIII;
            ++llIIlIlIIIlIIII;
            0;
            if (1 != -1) continue;
            return null;
        }
        return String.valueOf(llIIlIlIIIllIlI);
    }

    private static void llllIllIlI() {
        lIIIlllII = new int[27];
        ca.lIIIlllII[0] = (30 + 41 - -2 + 97 ^ 14 + 105 - 31 + 87) & (9 ^ 0x70 ^ (0xC ^ 0x70) ^ -1);
        ca.lIIIlllII[1] = -(0xFFFFFEB9 & 0x636F) & (0xFFFFFFEF & 0x677F);
        ca.lIIIlllII[2] = 1;
        ca.lIIIlllII[3] = -(0xFFFFEFBF & 0x78E9) & (0xFFFFFFFD & 0x6DEF);
        ca.lIIIlllII[4] = 2;
        ca.lIIIlllII[5] = -(0xFFFFE17B & 0x5EA5) & (0xFFFFE77F & 0x5DE9);
        ca.lIIIlllII[6] = 3;
        ca.lIIIlllII[7] = 0xFFFFBD71 & 0x47DF;
        ca.lIIIlllII[8] = 0x54 ^ 0x51 ^ 1;
        ca.lIIIlllII[9] = -(0xFFFFF91F & 0x66E5) & (0xFFFFF77F & 0x6DCF);
        ca.lIIIlllII[10] = 0x16 ^ 0x13;
        ca.lIIIlllII[11] = -(0xFFFF9ADB & 0x75A7) & (0xFFFFDDCF & 0x37FF);
        ca.lIIIlllII[12] = 10 + 102 - 65 + 105 ^ 11 + 83 - 67 + 131;
        ca.lIIIlllII[13] = -(0xFFFFDFFD & 0x72A3) & (0xFFFFF7EF & 0x5FFF);
        ca.lIIIlllII[14] = 0xC7 ^ 0xC0;
        ca.lIIIlllII[15] = -(0xFFFFED3B & 0x77C5) & (0xFFFFFF73 & 0x7FDF);
        ca.lIIIlllII[16] = 50 + 65 - 90 + 118 ^ 67 + 57 - 23 + 34;
        ca.lIIIlllII[17] = -(0xFFFFEFA5 & 0x335F) & (0xFFFFFF7F & 0x7FFD);
        ca.lIIIlllII[18] = 0x7D ^ 0x74;
        ca.lIIIlllII[19] = -(0xFFFFBF95 & 0x566B) & (0xFFFFBEFB & Short.MAX_VALUE);
        ca.lIIIlllII[20] = 0x8C ^ 0x86;
        ca.lIIIlllII[21] = -(0xFFFFBEB3 & 0x654D) & (0xFFFFFFFF & 0x7EEF);
        ca.lIIIlllII[22] = 0x7D ^ 0x47 ^ (0xF0 ^ 0xC1);
        ca.lIIIlllII[23] = 0xFFFFEF2B & 0x5EFF;
        ca.lIIIlllII[24] = 67 + 11 - 57 + 170 ^ 98 + 150 - 83 + 14;
        ca.lIIIlllII[25] = -(0xFFFFDA4D & 0x2DF7) & (0xFFFFFFFF & 0x3BFD);
        ca.lIIIlllII[26] = 0xA ^ 7;
    }

    public static ca valueOf(String string) {
        return Enum.valueOf(CAEnum.class, string);
    }

    public Prayer dc() {
        return this.protectionPrayer;
    }

    public static ca[] values() {
        return (ca[])$VALUES.clone();
    }

    private static String llllIIlllI(String llIIlIIlllllIII, String llIIlIIlllllIIl) {
        try {
            SecretKeySpec llIIlIIllllllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIlIIlllllIIl.getBytes(StandardCharsets.UTF_8)), lIIIlllII[16]), "DES");
            Cipher llIIlIIllllllII = Cipher.getInstance("DES");
            llIIlIIllllllII.init(lIIIlllII[4], llIIlIIllllllIl);
            return new String(llIIlIIllllllII.doFinal(Base64.getDecoder().decode(llIIlIIlllllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIlIIlllllIll) {
            llIIlIIlllllIll.printStackTrace();
            return null;
        }
    }

    private static void llllIllIIl() {
        lIIIllIlI = new String[lIIIlllII[26]];
        ca.lIIIllIlI[ca.lIIIlllII[0]] = ca."BRONZE_AXE";
        ca.lIIIllIlI[ca.lIIIlllII[2]] = ca."IRON_AXE";
        ca.lIIIllIlI[ca.lIIIlllII[4]] = ca."STEEL_AXE";
        ca.lIIIllIlI[ca.lIIIlllII[6]] = ca."BLACK_AXE";
        ca.lIIIllIlI[ca.lIIIlllII[8]] = ca."MITHRIL_AXE";
        ca.lIIIllIlI[ca.lIIIlllII[10]] = ca."ADAMANT_AXE";
        ca.lIIIllIlI[ca.lIIIlllII[12]] = ca."RUNE_AXE";
        ca.lIIIllIlI[ca.lIIIlllII[14]] = ca."DRAGON_AXE";
        ca.lIIIllIlI[ca.lIIIlllII[16]] = ca."CRYSTAL_AXE";
        ca.lIIIllIlI[ca.lIIIlllII[18]] = ca."BLESSED_AXE";
        ca.lIIIllIlI[ca.lIIIlllII[20]] = ca."GILDED_AXE";
        ca.lIIIllIlI[ca.lIIIlllII[22]] = ca."THIRD_AGE_AXE";
        ca.lIIIllIlI[ca.lIIIlllII[24]] = ca."INFARNAL_AXE";
    }
}

