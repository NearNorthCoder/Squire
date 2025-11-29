/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;

public final class CEnum
extends Enum<c> {
    public static final /* synthetic */ /* enum */ c MYSTIC_WILL;
    public static final /* synthetic */ /* enum */ c PIETY;
    private final /* synthetic */ Prayer prayer;
    public static final /* synthetic */ /* enum */ c HAWK_EYE;
    public static final /* synthetic */ /* enum */ c EAGLE_EYE;
    private static /* synthetic */ int[] lIIIlIIllIIIl;
    public static final /* synthetic */ /* enum */ c RIGOUR;
    public static final /* synthetic */ /* enum */ c ULTIMATE_STR;
    private static final /* synthetic */ c[] $VALUES;
    private static /* synthetic */ String[] lIIIlIIllIIII;
    public static final /* synthetic */ /* enum */ c BURST_OF_STR;
    public static final /* synthetic */ /* enum */ c AUGURY;
    public static final /* synthetic */ /* enum */ c MYSTIC_MIGHT;
    public static final /* synthetic */ /* enum */ c SHARP_EYE;
    public static final /* synthetic */ /* enum */ c SUPERHUMAN_STR;
    public static final /* synthetic */ /* enum */ c MYSTIC_LORD;

    public static c valueOf(String string) {
        return Enum.valueOf(c.class, string);
    }

    public Prayer j() {
        return this.prayer;
    }

    private static String lIIlllllIIlIlIl(String var8, String var16) {
        var8 = new String(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var2 = new StringBuilder();
        char[] var13 = var16.toCharArray();
        int var18 = lIIIlIIllIIIl[0];
        char[] var15 = var8.toCharArray();
        int var17 = var15.length;
        int var9 = lIIIlIIllIIIl[0];
        while (c.lIIlllllIIllIlI(var9, var17)) {
            char var19 = var15[var9];
            var2.append((char)(var19 ^ var13[var18 % var13.length]));
            0;
            ++var18;
            ++var9;
            0;
            if (3 > -1) continue;
            return null;
        }
        return String.valueOf(var2);
    }

    static {
        c.lIIlllllIIllIIl();
        c.lIIlllllIIllIII();
        BURST_OF_STR = new c(Prayer.BURST_OF_STRENGTH);
        SUPERHUMAN_STR = new c(Prayer.SUPERHUMAN_STRENGTH);
        ULTIMATE_STR = new c(Prayer.ULTIMATE_STRENGTH);
        PIETY = new c(Prayer.PIETY);
        SHARP_EYE = new c(Prayer.EAGLE_EYE);
        HAWK_EYE = new c(Prayer.EAGLE_EYE);
        EAGLE_EYE = new c(Prayer.EAGLE_EYE);
        RIGOUR = new c(Prayer.RIGOUR);
        MYSTIC_WILL = new c(Prayer.MYSTIC_WILL);
        MYSTIC_LORD = new c(Prayer.MYSTIC_LORE);
        MYSTIC_MIGHT = new c(Prayer.MYSTIC_MIGHT);
        AUGURY = new c(Prayer.AUGURY);
        c[] cArray = new c[lIIIlIIllIIIl[12]];
        cArray[c.lIIIlIIllIIIl[0]] = BURST_OF_STR;
        cArray[c.lIIIlIIllIIIl[1]] = SUPERHUMAN_STR;
        cArray[c.lIIIlIIllIIIl[2]] = ULTIMATE_STR;
        cArray[c.lIIIlIIllIIIl[3]] = PIETY;
        cArray[c.lIIIlIIllIIIl[4]] = SHARP_EYE;
        cArray[c.lIIIlIIllIIIl[5]] = HAWK_EYE;
        cArray[c.lIIIlIIllIIIl[6]] = EAGLE_EYE;
        cArray[c.lIIIlIIllIIIl[7]] = RIGOUR;
        cArray[c.lIIIlIIllIIIl[8]] = MYSTIC_WILL;
        cArray[c.lIIIlIIllIIIl[9]] = MYSTIC_LORD;
        cArray[c.lIIIlIIllIIIl[10]] = MYSTIC_MIGHT;
        cArray[c.lIIIlIIllIIIl[11]] = AUGURY;
        $VALUES = cArray;
    }

    private static boolean lIIlllllIIllIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIlllllIIllIII() {
        lIIIlIIllIIII = new String[lIIIlIIllIIIl[12]];
        c.lIIIlIIllIIII[c.lIIIlIIllIIIl[0]] = c."BURST_OF_STR";
        c.lIIIlIIllIIII[c.lIIIlIIllIIIl[1]] = c."SUPERHUMAN_STR";
        c.lIIIlIIllIIII[c.lIIIlIIllIIIl[2]] = c."ULTIMATE_STR";
        c.lIIIlIIllIIII[c.lIIIlIIllIIIl[3]] = c."PIETY";
        c.lIIIlIIllIIII[c.lIIIlIIllIIIl[4]] = c."SHARP_EYE";
        c.lIIIlIIllIIII[c.lIIIlIIllIIIl[5]] = c."HAWK_EYE";
        c.lIIIlIIllIIII[c.lIIIlIIllIIIl[6]] = c."EAGLE_EYE";
        c.lIIIlIIllIIII[c.lIIIlIIllIIIl[7]] = c."RIGOUR";
        c.lIIIlIIllIIII[c.lIIIlIIllIIIl[8]] = c."MYSTIC_WILL";
        c.lIIIlIIllIIII[c.lIIIlIIllIIIl[9]] = c."MYSTIC_LORD";
        c.lIIIlIIllIIII[c.lIIIlIIllIIIl[10]] = c."MYSTIC_MIGHT";
        c.lIIIlIIllIIII[c.lIIIlIIllIIIl[11]] = c."AUGURY";
    }

    private static void lIIlllllIIllIIl() {
        lIIIlIIllIIIl = new int[13];
        c.lIIIlIIllIIIl[0] = (0x28 ^ 0x7D ^ (0x4B ^ 0x3F)) & (152 + 106 - 214 + 127 ^ 0 + 123 - 106 + 121 ^ -1);
        c.lIIIlIIllIIIl[1] = 1;
        c.lIIIlIIllIIIl[2] = 2;
        c.lIIIlIIllIIIl[3] = 3;
        c.lIIIlIIllIIIl[4] = 0x2D ^ 0x21 ^ (0xC9 ^ 0xC1);
        c.lIIIlIIllIIIl[5] = 0x69 ^ 0x6C;
        c.lIIIlIIllIIIl[6] = 0x6F ^ 0x69;
        c.lIIIlIIllIIIl[7] = 0xB6 ^ 0xB1;
        c.lIIIlIIllIIIl[8] = 2 ^ (0x4B ^ 0x41);
        c.lIIIlIIllIIIl[9] = 0xB3 ^ 0xBA;
        c.lIIIlIIllIIIl[10] = 0x3A ^ 0x30;
        c.lIIIlIIllIIIl[11] = 0x6A ^ 0x7E ^ (0x6E ^ 0x71);
        c.lIIIlIIllIIIl[12] = 0x61 ^ 0x6D;
    }

    private static String lIIlllllIIlIllI(String var14, String var4) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), lIIIlIIllIIIl[8]), "DES");
            Cipher var10 = Cipher.getInstance("DES");
            var10.init(lIIIlIIllIIIl[2], var11);
            return new String(var10.doFinal(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    public static c[] values() {
        return (c[])$VALUES.clone();
    }

    private static String lIIlllllIIlIlll(String var6, String var12) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var12.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var3 = Cipher.getInstance("Blowfish");
            var3.init(lIIIlIIllIIIl[2], var7);
            return new String(var3.doFinal(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    private c(Prayer prayer) {
        this.prayer = prayer;
    }
}

