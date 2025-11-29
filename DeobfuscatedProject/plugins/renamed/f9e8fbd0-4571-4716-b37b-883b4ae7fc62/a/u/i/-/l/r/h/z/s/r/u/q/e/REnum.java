/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package a.u.i.-.l.r.h.z.s.r.u.q.e;

import a.u.i.-.l.r.h.z.s.r.u.q.e.s_Unknown;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;

public final class REnum
extends Enum<r> {
    private /* synthetic */ int id;
    public static final /* synthetic */ /* enum */ r MELEE;
    private static /* synthetic */ int[] lIllIllIIlIII;
    private static /* synthetic */ String[] lIllIllIIIlII;
    public static final /* synthetic */ /* enum */ r JAD_RANGE_FIRST;
    private static final /* synthetic */ r[] $VALUES;
    public static final /* synthetic */ /* enum */ r RANGE;
    public static final /* synthetic */ /* enum */ r JAD_MAGIC_FIRST;
    public static final /* synthetic */ /* enum */ r MAGIC;

    private static String llIIlIIIlIlllII(String var10, String var14) {
        try {
            SecretKeySpec var16 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var14.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var7 = Cipher.getInstance("Blowfish");
            var7.init(lIllIllIIlIII[4], var16);
            return new String(var7.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    public static r[] values() {
        return (r[])$VALUES.clone();
    }

    public Prayer M() {
        switch (s.r[this.ordinal()]) {
            case 1: 
            case 2: 
            case 3: 
            case 4: {
                return Prayer.MYSTIC_MIGHT;
            }
            case 5: {
                return Prayer.EAGLE_EYE;
            }
        }
        return Prayer.MYSTIC_MIGHT;
    }

    static {
        r.llIIlIIIllIIIll();
        r.llIIlIIIlIlllll();
        RANGE = new r(lIllIllIIlIII[1]);
        MELEE = new r(lIllIllIIlIII[3]);
        MAGIC = new r(lIllIllIIlIII[5]);
        JAD_MAGIC_FIRST = new r(lIllIllIIlIII[1]);
        JAD_RANGE_FIRST = new r(lIllIllIIlIII[1]);
        r[] rArray = new r[lIllIllIIlIII[8]];
        rArray[r.lIllIllIIlIII[0]] = RANGE;
        rArray[r.lIllIllIIlIII[2]] = MELEE;
        rArray[r.lIllIllIIlIII[4]] = MAGIC;
        rArray[r.lIllIllIIlIII[6]] = JAD_MAGIC_FIRST;
        rArray[r.lIllIllIIlIII[7]] = JAD_RANGE_FIRST;
        $VALUES = rArray;
    }

    private r(int n3) {
        this.id = n3;
    }

    public static r valueOf(String string) {
        return Enum.valueOf(r.class, string);
    }

    private static void llIIlIIIllIIIll() {
        lIllIllIIlIII = new int[10];
        r.lIllIllIIlIII[0] = (138 + 188 - 305 + 169 ^ 44 + 58 - 62 + 92) & (0x59 ^ 0x43 ^ (0x19 ^ 0x39) ^ -1);
        r.lIllIllIIlIII[1] = 0xFFFF9FFB & 0x67FE;
        r.lIllIllIIlIII[2] = 1;
        r.lIllIllIIlIII[3] = -(0xFFFFB315 & 0x6CEF) & (0xFFFFE7FF & 0x3FFF);
        r.lIllIllIIlIII[4] = 2;
        r.lIllIllIIlIII[5] = -(0xFFFFF8C6 & 0x3F3D) & (0xFFFFFFFF & 0x3FFF);
        r.lIllIllIIlIII[6] = 3;
        r.lIllIllIIlIII[7] = 0xEC ^ 0x9C ^ (0xB7 ^ 0xC3);
        r.lIllIllIIlIII[8] = 0xB3 ^ 0x9C ^ (0x3F ^ 0x15);
        r.lIllIllIIlIII[9] = 8 ^ 0x5B ^ (0xDA ^ 0x81);
    }

    private static String llIIlIIIlIllIll(String var6, String var11) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var3 = new StringBuilder();
        char[] var12 = var11.toCharArray();
        int var15 = lIllIllIIlIII[0];
        char[] var8 = var6.toCharArray();
        int var17 = var8.length;
        int var2 = lIllIllIIlIII[0];
        while (r.llIIlIIIllIIlII(var2, var17)) {
            char var18 = var8[var2];
            var3.append((char)(var18 ^ var12[var15 % var12.length]));
            0;
            ++var15;
            ++var2;
            0;
            if (((122 + 78 - 115 + 82 ^ 84 + 120 - 168 + 95) & (73 + 92 - 98 + 77 ^ 176 + 80 - 109 + 33 ^ -1)) == ((0xFB ^ 0xB4 ^ (0x93 ^ 0x84)) & (0x1D ^ 0x18 ^ (0x70 ^ 0x2D) ^ -1))) continue;
            return null;
        }
        return String.valueOf(var3);
    }

    private static void llIIlIIIlIlllll() {
        lIllIllIIIlII = new String[lIllIllIIlIII[8]];
        r.lIllIllIIIlII[r.lIllIllIIlIII[0]] = r."RANGE";
        r.lIllIllIIIlII[r.lIllIllIIlIII[2]] = r."MELEE";
        r.lIllIllIIIlII[r.lIllIllIIlIII[4]] = r."MAGIC";
        r.lIllIllIIIlII[r.lIllIllIIlIII[6]] = r."JAD_MAGIC_FIRST";
        r.lIllIllIIIlII[r.lIllIllIIlIII[7]] = r."JAD_RANGE_FIRST";
    }

    public int L() {
        return this.id;
    }

    private static String llIIlIIIlIllIlI(String var4, String var19) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var19.getBytes(StandardCharsets.UTF_8)), lIllIllIIlIII[9]), "DES");
            Cipher var5 = Cipher.getInstance("DES");
            var5.init(lIllIllIIlIII[4], var1);
            return new String(var5.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    public Prayer N() {
        switch (s.r[this.ordinal()]) {
            case 2: 
            case 5: {
                return Prayer.PROTECT_FROM_MAGIC;
            }
        }
        return Prayer.PROTECT_FROM_MISSILES;
    }

    private static boolean llIIlIIIllIIlII(int n2, int n3) {
        return n2 < n3;
    }
}

