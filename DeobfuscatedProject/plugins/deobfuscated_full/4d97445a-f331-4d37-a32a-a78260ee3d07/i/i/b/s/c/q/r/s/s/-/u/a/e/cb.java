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

public final class cb
extends Enum<cb> {
    public static final /* synthetic */ /* enum */ cb SARADOMIN_GODSWORD;
    public static final /* synthetic */ /* enum */ cb BLACK_2H_SWORD;
    public static final /* synthetic */ /* enum */ cb BRONZE_2H_SWORD;
    public static final /* synthetic */ /* enum */ cb STEEL_2H_SWORD;
    public static final /* synthetic */ /* enum */ cb SARADOMIN_GODSWORD_OR;
    private static /* synthetic */ String[] llllIlIlI;
    private static final /* synthetic */ cb[] $VALUES;
    private static /* synthetic */ int[] llllIlIll;
    public static final /* synthetic */ /* enum */ cb SARADOMIN_SWORD;
    public static final /* synthetic */ /* enum */ cb COLOSSAL_BLADE;
    public static final /* synthetic */ /* enum */ cb BANDOS_GODSWORD;
    public static final /* synthetic */ /* enum */ cb ARMADYL_GODSWORD;
    public static final /* synthetic */ /* enum */ cb SHADOW_SWORD;
    public static final /* synthetic */ /* enum */ cb ZAMORAK_GODSWORD_OR;
    private final /* synthetic */ Prayer protectionPrayer;
    public static final /* synthetic */ /* enum */ cb IRON_2H_SWORD;
    public static final /* synthetic */ /* enum */ cb SARADOMIN_BLESSED_SWORD;
    public static final /* synthetic */ /* enum */ cb ANCIENT_GODSWORD;
    public static final /* synthetic */ /* enum */ cb ARMADYL_GODSWORD_OR;
    private final /* synthetic */ int itemID;
    public static final /* synthetic */ /* enum */ cb SPATULA;
    public static final /* synthetic */ /* enum */ cb WHITE_2H_SWORD;
    public static final /* synthetic */ /* enum */ cb RUNE_2H_SWORD;
    public static final /* synthetic */ /* enum */ cb MITHRIL_2H_SWORD;
    public static final /* synthetic */ /* enum */ cb DRAGON_2H_SWORD;
    public static final /* synthetic */ /* enum */ cb BANDOS_GODSWORD_OR;
    public static final /* synthetic */ /* enum */ cb GILDED_2H_SWORD;
    public static final /* synthetic */ /* enum */ cb ZAMORAK_GODSWORD;
    public static final /* synthetic */ /* enum */ cb ADAMANT_2H_SWORD;

    private static void llIlIIIIlll() {
        llllIlIll = new int[49];
        cb.llllIlIll[0] = (0x11 ^ 0xF ^ 1) & (0x10 ^ 0x7F ^ (0xCB ^ 0xBB) ^ -1);
        cb.llllIlIll[1] = 0xFFFFC55B & 0x3FBF;
        cb.llllIlIll[2] = 1;
        cb.llllIlIll[3] = -(0xFFFFFAAB & 0x1FD7) & (0xFFFFDF9F & 0x3FFF);
        cb.llllIlIll[4] = 2;
        cb.llllIlIll[5] = 0xFFFFD55F & 0x2FBF;
        cb.llllIlIll[6] = 3;
        cb.llllIlIll[7] = -(0xFFFFFF0D & 0x68FB) & (0xFFFFFFBF & 0x6D69);
        cb.llllIlIll[8] = 0x7B ^ 0x74 ^ (0xCA ^ 0xC1);
        cb.llllIlIll[9] = 0xFFFFB9DF & 0x5FF1;
        cb.llllIlIll[10] = 0xE ^ 0xB;
        cb.llllIlIll[11] = 0xFFFFD5AF & 0x2F73;
        cb.llllIlIll[12] = 0x65 ^ 0x60 ^ 3;
        cb.llllIlIll[13] = 0xFFFFAFA7 & 0x557D;
        cb.llllIlIll[14] = 0x10 ^ 0x17;
        cb.llllIlIll[15] = -(0xFFFFBAF9 & 0x6D1F) & (0xFFFFADFF & 0x7F3F);
        cb.llllIlIll[16] = 0x95 ^ 0x9D;
        cb.llllIlIll[17] = 0xFFFFFFFE & 0x1BF7;
        cb.llllIlIll[18] = 0x91 ^ 0x98;
        cb.llllIlIll[19] = 0xFFFFE679 & Short.MAX_VALUE;
        cb.llllIlIll[20] = 0x22 ^ 0x28;
        cb.llllIlIll[21] = -(0xFFFFD37F & 0x7CE5) & (0xFFFFFF7F & 0x7EFE);
        cb.llllIlIll[22] = 73 + 141 - 187 + 134 ^ 69 + 153 - 217 + 165;
        cb.llllIlIll[23] = -(0xFFFFEBAF & 0x3474) & (0xFFFFFFB3 & 0x6FFF);
        cb.llllIlIll[24] = 0x7C ^ 1 ^ (0xC7 ^ 0xB6);
        cb.llllIlIll[25] = -(0xFFFFF3B7 & 0x5D4B) & (0xFFFFFF3E & 0x7FDF);
        cb.llllIlIll[26] = 0x51 ^ 0x5C;
        cb.llllIlIll[27] = 0xFFFFDFBF & 0x6FD2;
        cb.llllIlIll[28] = 83 + 134 - 212 + 201 ^ 148 + 84 - 121 + 81;
        cb.llllIlIll[29] = -(0xFFFFE9E5 & 0x57DB) & (0xFFFFFFFE & 0x6FDF);
        cb.llllIlIll[30] = 0x69 ^ 0x66;
        cb.llllIlIll[31] = -(0xFFFFF7FC & 0x386F) & (0xFFFFFFFF & Short.MAX_VALUE);
        cb.llllIlIll[32] = 0x1B ^ 0xB;
        cb.llllIlIll[33] = 0xFFFFBE79 & 0x6FA6;
        cb.llllIlIll[34] = 0xA8 ^ 0xB9;
        cb.llllIlIll[35] = 0xFFFFEF97 & 0x5FFE;
        cb.llllIlIll[36] = 0x80 ^ 0xB3 ^ (6 ^ 0x27);
        cb.llllIlIll[37] = -(0xFFFFF7BF & 0x5DD5) & (0xFFFFFFFE & Short.MAX_VALUE);
        cb.llllIlIll[38] = 0x17 ^ 0x43 ^ (0x16 ^ 0x51);
        cb.llllIlIll[39] = -(0xFFFFFCC9 & 0x43B7) & (0xFFFFDDCF & 0x7FBF);
        cb.llllIlIll[40] = 2 ^ 0x16;
        cb.llllIlIll[41] = 0xFFFFCFFF & 0x7EBB;
        cb.llllIlIll[42] = 77 + 50 - 72 + 131 ^ 154 + 2 - 67 + 86;
        cb.llllIlIll[43] = 0xFFFFBF3E & 0x6EFF;
        cb.llllIlIll[44] = 0xA1 ^ 0xB7;
        cb.llllIlIll[45] = -(0xFFFFF777 & 0x1A9B) & (0xFFFFFFBF & 0x7BDF);
        cb.llllIlIll[46] = 44 + 117 - 15 + 10 ^ 0 + 89 - 67 + 117;
        cb.llllIlIll[47] = -(0xFFFFFFF7 & 0x49CD) & (0xFFFFFFED & 0x7BDF);
        cb.llllIlIll[48] = 102 + 83 - 104 + 52 ^ 125 + 153 - 254 + 133;
    }

    private static String llIlIIIIlII(String lIlIIlllIIIIllI, String lIlIIlllIIIIlIl) {
        try {
            SecretKeySpec lIlIIlllIIIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIIlllIIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlIIlllIIIlIlI = Cipher.getInstance("Blowfish");
            lIlIIlllIIIlIlI.init(llllIlIll[4], lIlIIlllIIIlIll);
            return new String(lIlIIlllIIIlIlI.doFinal(Base64.getDecoder().decode(lIlIIlllIIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIIlllIIIlIIl) {
            lIlIIlllIIIlIIl.printStackTrace();
            return null;
        }
    }

    public Prayer dc() {
        return this.protectionPrayer;
    }

    public static cb[] values() {
        return (cb[])$VALUES.clone();
    }

    private static boolean llIlIIIlIII(int n2, int n3) {
        return n2 < n3;
    }

    static {
        cb.llIlIIIIlll();
        cb.llIlIIIIllI();
        BRONZE_2H_SWORD = new cb(llllIlIll[1], Prayer.PROTECT_FROM_MELEE);
        IRON_2H_SWORD = new cb(llllIlIll[3], Prayer.PROTECT_FROM_MELEE);
        STEEL_2H_SWORD = new cb(llllIlIll[5], Prayer.PROTECT_FROM_MELEE);
        BLACK_2H_SWORD = new cb(llllIlIll[7], Prayer.PROTECT_FROM_MELEE);
        WHITE_2H_SWORD = new cb(llllIlIll[9], Prayer.PROTECT_FROM_MELEE);
        MITHRIL_2H_SWORD = new cb(llllIlIll[11], Prayer.PROTECT_FROM_MELEE);
        ADAMANT_2H_SWORD = new cb(llllIlIll[13], Prayer.PROTECT_FROM_MELEE);
        RUNE_2H_SWORD = new cb(llllIlIll[15], Prayer.PROTECT_FROM_MELEE);
        DRAGON_2H_SWORD = new cb(llllIlIll[17], Prayer.PROTECT_FROM_MELEE);
        ANCIENT_GODSWORD = new cb(llllIlIll[19], Prayer.PROTECT_FROM_MELEE);
        ARMADYL_GODSWORD = new cb(llllIlIll[21], Prayer.PROTECT_FROM_MELEE);
        ARMADYL_GODSWORD_OR = new cb(llllIlIll[23], Prayer.PROTECT_FROM_MELEE);
        BANDOS_GODSWORD = new cb(llllIlIll[25], Prayer.PROTECT_FROM_MELEE);
        BANDOS_GODSWORD_OR = new cb(llllIlIll[27], Prayer.PROTECT_FROM_MELEE);
        SARADOMIN_GODSWORD = new cb(llllIlIll[29], Prayer.PROTECT_FROM_MELEE);
        SARADOMIN_GODSWORD_OR = new cb(llllIlIll[31], Prayer.PROTECT_FROM_MELEE);
        ZAMORAK_GODSWORD = new cb(llllIlIll[33], Prayer.PROTECT_FROM_MELEE);
        ZAMORAK_GODSWORD_OR = new cb(llllIlIll[35], Prayer.PROTECT_FROM_MELEE);
        SHADOW_SWORD = new cb(llllIlIll[37], Prayer.PROTECT_FROM_MELEE);
        SPATULA = new cb(llllIlIll[39], Prayer.PROTECT_FROM_MELEE);
        GILDED_2H_SWORD = new cb(llllIlIll[41], Prayer.PROTECT_FROM_MELEE);
        SARADOMIN_SWORD = new cb(llllIlIll[43], Prayer.PROTECT_FROM_MELEE);
        COLOSSAL_BLADE = new cb(llllIlIll[45], Prayer.PROTECT_FROM_MELEE);
        SARADOMIN_BLESSED_SWORD = new cb(llllIlIll[47], Prayer.PROTECT_FROM_MELEE);
        cb[] cbArray = new cb[llllIlIll[48]];
        cbArray[cb.llllIlIll[0]] = BRONZE_2H_SWORD;
        cbArray[cb.llllIlIll[2]] = IRON_2H_SWORD;
        cbArray[cb.llllIlIll[4]] = STEEL_2H_SWORD;
        cbArray[cb.llllIlIll[6]] = BLACK_2H_SWORD;
        cbArray[cb.llllIlIll[8]] = WHITE_2H_SWORD;
        cbArray[cb.llllIlIll[10]] = MITHRIL_2H_SWORD;
        cbArray[cb.llllIlIll[12]] = ADAMANT_2H_SWORD;
        cbArray[cb.llllIlIll[14]] = RUNE_2H_SWORD;
        cbArray[cb.llllIlIll[16]] = DRAGON_2H_SWORD;
        cbArray[cb.llllIlIll[18]] = ANCIENT_GODSWORD;
        cbArray[cb.llllIlIll[20]] = ARMADYL_GODSWORD;
        cbArray[cb.llllIlIll[22]] = ARMADYL_GODSWORD_OR;
        cbArray[cb.llllIlIll[24]] = BANDOS_GODSWORD;
        cbArray[cb.llllIlIll[26]] = BANDOS_GODSWORD_OR;
        cbArray[cb.llllIlIll[28]] = SARADOMIN_GODSWORD;
        cbArray[cb.llllIlIll[30]] = SARADOMIN_GODSWORD_OR;
        cbArray[cb.llllIlIll[32]] = ZAMORAK_GODSWORD;
        cbArray[cb.llllIlIll[34]] = ZAMORAK_GODSWORD_OR;
        cbArray[cb.llllIlIll[36]] = SHADOW_SWORD;
        cbArray[cb.llllIlIll[38]] = SPATULA;
        cbArray[cb.llllIlIll[40]] = GILDED_2H_SWORD;
        cbArray[cb.llllIlIll[42]] = SARADOMIN_SWORD;
        cbArray[cb.llllIlIll[44]] = COLOSSAL_BLADE;
        cbArray[cb.llllIlIll[46]] = SARADOMIN_BLESSED_SWORD;
        $VALUES = cbArray;
    }

    private static void llIlIIIIllI() {
        llllIlIlI = new String[llllIlIll[48]];
        cb.llllIlIlI[cb.llllIlIll[0]] = cb."BRONZE_2H_SWORD";
        cb.llllIlIlI[cb.llllIlIll[2]] = cb."IRON_2H_SWORD";
        cb.llllIlIlI[cb.llllIlIll[4]] = cb."STEEL_2H_SWORD";
        cb.llllIlIlI[cb.llllIlIll[6]] = cb."BLACK_2H_SWORD";
        cb.llllIlIlI[cb.llllIlIll[8]] = cb."WHITE_2H_SWORD";
        cb.llllIlIlI[cb.llllIlIll[10]] = cb."MITHRIL_2H_SWORD";
        cb.llllIlIlI[cb.llllIlIll[12]] = cb."ADAMANT_2H_SWORD";
        cb.llllIlIlI[cb.llllIlIll[14]] = cb."RUNE_2H_SWORD";
        cb.llllIlIlI[cb.llllIlIll[16]] = cb."DRAGON_2H_SWORD";
        cb.llllIlIlI[cb.llllIlIll[18]] = cb."ANCIENT_GODSWORD";
        cb.llllIlIlI[cb.llllIlIll[20]] = cb."ARMADYL_GODSWORD";
        cb.llllIlIlI[cb.llllIlIll[22]] = cb."ARMADYL_GODSWORD_OR";
        cb.llllIlIlI[cb.llllIlIll[24]] = cb."BANDOS_GODSWORD";
        cb.llllIlIlI[cb.llllIlIll[26]] = cb."BANDOS_GODSWORD_OR";
        cb.llllIlIlI[cb.llllIlIll[28]] = cb."SARADOMIN_GODSWORD";
        cb.llllIlIlI[cb.llllIlIll[30]] = cb."SARADOMIN_GODSWORD_OR";
        cb.llllIlIlI[cb.llllIlIll[32]] = cb."ZAMORAK_GODSWORD";
        cb.llllIlIlI[cb.llllIlIll[34]] = cb."ZAMORAK_GODSWORD_OR";
        cb.llllIlIlI[cb.llllIlIll[36]] = cb."SHADOW_SWORD";
        cb.llllIlIlI[cb.llllIlIll[38]] = cb."SPATULA";
        cb.llllIlIlI[cb.llllIlIll[40]] = cb."GILDED_2H_SWORD";
        cb.llllIlIlI[cb.llllIlIll[42]] = cb."SARADOMIN_SWORD";
        cb.llllIlIlI[cb.llllIlIll[44]] = cb."COLOSSAL_BLADE";
        cb.llllIlIlI[cb.llllIlIll[46]] = cb."SARADOMIN_BLESSED_SWORD";
    }

    private static String llIlIIIIIll(String lIlIIlllIIlIlIl, String lIlIIlllIIlIlII) {
        try {
            SecretKeySpec lIlIIlllIIllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIIlllIIlIlII.getBytes(StandardCharsets.UTF_8)), llllIlIll[16]), "DES");
            Cipher lIlIIlllIIlIlll = Cipher.getInstance("DES");
            lIlIIlllIIlIlll.init(llllIlIll[4], lIlIIlllIIllIII);
            return new String(lIlIIlllIIlIlll.doFinal(Base64.getDecoder().decode(lIlIIlllIIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIIlllIIlIllI) {
            lIlIIlllIIlIllI.printStackTrace();
            return null;
        }
    }

    private cb(int n3, Prayer prayer) {
        this.itemID = n3;
        this.protectionPrayer = prayer;
    }

    public int ar() {
        return this.itemID;
    }

    private static String llIlIIIIlIl(String lIlIIllIllllIII, String lIlIIllIlllIIlI) {
        lIlIIllIllllIII = new String(Base64.getDecoder().decode(lIlIIllIllllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlIIllIlllIllI = new StringBuilder();
        char[] lIlIIllIlllIlIl = lIlIIllIlllIIlI.toCharArray();
        int lIlIIllIlllIlII = llllIlIll[0];
        char[] lIlIIllIllIlllI = lIlIIllIllllIII.toCharArray();
        int lIlIIllIllIllIl = lIlIIllIllIlllI.length;
        int lIlIIllIllIllII = llllIlIll[0];
        while (cb.llIlIIIlIII(lIlIIllIllIllII, lIlIIllIllIllIl)) {
            char lIlIIllIllllIIl = lIlIIllIllIlllI[lIlIIllIllIllII];
            lIlIIllIlllIllI.append((char)(lIlIIllIllllIIl ^ lIlIIllIlllIlIl[lIlIIllIlllIlII % lIlIIllIlllIlIl.length]));
            0;
            ++lIlIIllIlllIlII;
            ++lIlIIllIllIllII;
            0;
            if (2 != 0) continue;
            return null;
        }
        return String.valueOf(lIlIIllIlllIllI);
    }

    public static cb valueOf(String string) {
        return Enum.valueOf(cb.class, string);
    }
}

