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

public final class e
extends Enum<e> {
    private final /* synthetic */ int herbId;
    public static final /* synthetic */ /* enum */ e HARRALANDER;
    public static final /* synthetic */ /* enum */ e MARRENTILL_POT_UNF;
    private static /* synthetic */ String[] lIIIIIIIlIIII;
    private static /* synthetic */ int[] lIIIIIIIlIIIl;
    public static final /* synthetic */ /* enum */ e HARRALANDER_POT_UNF;
    public static final /* synthetic */ /* enum */ e GUAM_POT_UNF;
    public static final /* synthetic */ /* enum */ e TARROMIN_POT_UNF;
    public static final /* synthetic */ /* enum */ e GUAM_LEAF;
    private static final /* synthetic */ e[] $VALUES;
    public static final /* synthetic */ /* enum */ e TARROMIN;
    public static final /* synthetic */ /* enum */ e MARRENTILL;
    private final /* synthetic */ String name;

    public int b() {
        return this.herbId;
    }

    public static e[] values() {
        return (e[])$VALUES.clone();
    }

    static {
        e.lIIlIllIlIIllIl();
        e.lIIlIllIlIIllII();
        GUAM_LEAF = new e(lIIIIIIIlIIII[lIIIIIIIlIIIl[1]], lIIIIIIIlIIIl[2]);
        MARRENTILL = new e(lIIIIIIIlIIII[lIIIIIIIlIIIl[4]], lIIIIIIIlIIIl[5]);
        TARROMIN = new e(lIIIIIIIlIIII[lIIIIIIIlIIIl[7]], lIIIIIIIlIIIl[8]);
        HARRALANDER = new e(lIIIIIIIlIIII[lIIIIIIIlIIIl[10]], lIIIIIIIlIIIl[11]);
        GUAM_POT_UNF = new e(lIIIIIIIlIIII[lIIIIIIIlIIIl[13]], lIIIIIIIlIIIl[14]);
        MARRENTILL_POT_UNF = new e(lIIIIIIIlIIII[lIIIIIIIlIIIl[16]], lIIIIIIIlIIIl[17]);
        TARROMIN_POT_UNF = new e(lIIIIIIIlIIII[lIIIIIIIlIIIl[19]], lIIIIIIIlIIIl[20]);
        HARRALANDER_POT_UNF = new e(lIIIIIIIlIIII[lIIIIIIIlIIIl[22]], lIIIIIIIlIIIl[23]);
        e[] eArray = new e[lIIIIIIIlIIIl[12]];
        eArray[e.lIIIIIIIlIIIl[0]] = GUAM_LEAF;
        eArray[e.lIIIIIIIlIIIl[1]] = MARRENTILL;
        eArray[e.lIIIIIIIlIIIl[3]] = TARROMIN;
        eArray[e.lIIIIIIIlIIIl[4]] = HARRALANDER;
        eArray[e.lIIIIIIIlIIIl[6]] = GUAM_POT_UNF;
        eArray[e.lIIIIIIIlIIIl[7]] = MARRENTILL_POT_UNF;
        eArray[e.lIIIIIIIlIIIl[9]] = TARROMIN_POT_UNF;
        eArray[e.lIIIIIIIlIIIl[10]] = HARRALANDER_POT_UNF;
        $VALUES = eArray;
    }

    private static void lIIlIllIlIIllII() {
        lIIIIIIIlIIII = new String[lIIIIIIIlIIIl[24]];
        e.lIIIIIIIlIIII[e.lIIIIIIIlIIIl[0]] = e."GUAM_LEAF";
        e.lIIIIIIIlIIII[e.lIIIIIIIlIIIl[1]] = e."Guam leaf";
        e.lIIIIIIIlIIII[e.lIIIIIIIlIIIl[3]] = e."MARRENTILL";
        e.lIIIIIIIlIIII[e.lIIIIIIIlIIIl[4]] = e."Marrentill";
        e.lIIIIIIIlIIII[e.lIIIIIIIlIIIl[6]] = e."TARROMIN";
        e.lIIIIIIIlIIII[e.lIIIIIIIlIIIl[7]] = e."Tarromin";
        e.lIIIIIIIlIIII[e.lIIIIIIIlIIIl[9]] = e."HARRALANDER";
        e.lIIIIIIIlIIII[e.lIIIIIIIlIIIl[10]] = e."Harralander";
        e.lIIIIIIIlIIII[e.lIIIIIIIlIIIl[12]] = e."GUAM_POT_UNF";
        e.lIIIIIIIlIIII[e.lIIIIIIIlIIIl[13]] = e."Guam potion (unf)";
        e.lIIIIIIIlIIII[e.lIIIIIIIlIIIl[15]] = e."MARRENTILL_POT_UNF";
        e.lIIIIIIIlIIII[e.lIIIIIIIlIIIl[16]] = e."Marrentill potion (unf)";
        e.lIIIIIIIlIIII[e.lIIIIIIIlIIIl[18]] = e."TARROMIN_POT_UNF";
        e.lIIIIIIIlIIII[e.lIIIIIIIlIIIl[19]] = e."Tarromin potion (unf)";
        e.lIIIIIIIlIIII[e.lIIIIIIIlIIIl[21]] = e."HARRALANDER_POT_UNF";
        e.lIIIIIIIlIIII[e.lIIIIIIIlIIIl[22]] = e."Harralander potion (unf)";
    }

    private e(String string2, int n3) {
        this.name = string2;
        this.herbId = n3;
    }

    public static e valueOf(String string) {
        return Enum.valueOf(e.class, string);
    }

    private static String lIIlIllIlIIlIIl(String var4, String var18) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var18.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var10 = Cipher.getInstance("Blowfish");
            var10.init(lIIIIIIIlIIIl[3], var8);
            return new String(var10.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var2) {
            var2.printStackTrace();
            return null;
        }
    }

    public String a() {
        return this.name;
    }

    private static boolean lIIlIllIlIIlllI(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIlIllIlIIlIlI(String var14, String var16) {
        var14 = new String(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var13 = new StringBuilder();
        char[] var5 = var16.toCharArray();
        int var9 = lIIIIIIIlIIIl[0];
        char[] var11 = var14.toCharArray();
        int var15 = var11.length;
        int var7 = lIIIIIIIlIIIl[0];
        while (e.lIIlIllIlIIlllI(var7, var15)) {
            char var1 = var11[var7];
            var13.append((char)(var1 ^ var5[var9 % var5.length]));
            0;
            ++var9;
            ++var7;
            0;
            if (3 > -1) continue;
            return null;
        }
        return String.valueOf(var13);
    }

    private static void lIIlIllIlIIllIl() {
        lIIIIIIIlIIIl = new int[25];
        e.lIIIIIIIlIIIl[0] = (0xE7 ^ 0xB0 ^ (0xDF ^ 0x93)) & (0x34 ^ 0xA ^ (0x80 ^ 0xA5) ^ -1);
        e.lIIIIIIIlIIIl[1] = 1;
        e.lIIIIIIIlIIIl[2] = 171 + 157 - 79 + 0;
        e.lIIIIIIIlIIIl[3] = 2;
        e.lIIIIIIIlIIIl[4] = 3;
        e.lIIIIIIIlIIIl[5] = 104 + 145 - 167 + 96 + (15 + 134 - 50 + 42) - (0xFFFFAF33 & 0x51EE) + (118 + 77 - -23 + 4);
        e.lIIIIIIIlIIIl[6] = 0x74 ^ 0x64 ^ (0x8F ^ 0x9B);
        e.lIIIIIIIlIIIl[7] = 0x92 ^ 0x97;
        e.lIIIIIIIlIIIl[8] = 223 + 213 - 401 + 218;
        e.lIIIIIIIlIIIl[9] = 26 + 93 - 79 + 119 ^ 89 + 115 - 117 + 66;
        e.lIIIIIIIlIIIl[10] = 0x92 ^ 0x9B ^ (0x24 ^ 0x2A);
        e.lIIIIIIIlIIIl[11] = 24 + 109 - -89 + 33;
        e.lIIIIIIIlIIIl[12] = 0x6A ^ 0x62;
        e.lIIIIIIIlIIIl[13] = 127 + 142 - 127 + 16 ^ 87 + 140 - 96 + 20;
        e.lIIIIIIIlIIIl[14] = 0xFF ^ 0xA4;
        e.lIIIIIIIlIIIl[15] = 0x17 ^ 0x1D;
        e.lIIIIIIIlIIIl[16] = 6 ^ 0xD ^ (0x4E ^ 0x53) & ~(0xB1 ^ 0xAC);
        e.lIIIIIIIlIIIl[17] = 87 + 142 - 222 + 199 ^ 59 + 143 - 147 + 92;
        e.lIIIIIIIlIIIl[18] = 0x46 ^ 0x18 ^ (0x53 ^ 1);
        e.lIIIIIIIlIIIl[19] = 0x3A ^ 0x37;
        e.lIIIIIIIlIIIl[20] = 0x49 ^ 0x16;
        e.lIIIIIIIlIIIl[21] = 0xB1 ^ 0xC3 ^ (0xCB ^ 0xB7);
        e.lIIIIIIIlIIIl[22] = 0x4F ^ 0x44 ^ (0x4C ^ 0x48);
        e.lIIIIIIIlIIIl[23] = 105 + 54 - 158 + 162 ^ 10 + 120 - -1 + 63;
        e.lIIIIIIIlIIIl[24] = 2 + 42 - 29 + 115 ^ 80 + 30 - 55 + 91;
    }

    private static String lIIlIllIlIIlIll(String var12, String var6) {
        try {
            SecretKeySpec var17 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), lIIIIIIIlIIIl[12]), "DES");
            Cipher var3 = Cipher.getInstance("DES");
            var3.init(lIIIIIIIlIIIl[3], var17);
            return new String(var3.doFinal(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }
}

