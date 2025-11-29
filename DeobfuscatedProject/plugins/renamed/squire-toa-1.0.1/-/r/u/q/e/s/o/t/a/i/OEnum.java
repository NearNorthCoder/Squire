/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package -.r.u.q.e.s.o.t.a.i;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;

public final class OEnum
extends Enum<o> {
    public static final /* synthetic */ /* enum */ o RIGOUR;
    public static final /* synthetic */ /* enum */ o EAGLE_EYE;
    private final /* synthetic */ Prayer mapped;
    private static /* synthetic */ int[] lIlIIIIIlllII;
    private static /* synthetic */ String[] lIlIIIIIllIll;
    private static final /* synthetic */ o[] $VALUES;

    private static void lIllIllIIlllllI() {
        lIlIIIIIllIll = new String[lIlIIIIIlllII[2]];
        o.lIlIIIIIllIll[o.lIlIIIIIlllII[0]] = o."RIGOUR";
        o.lIlIIIIIllIll[o.lIlIIIIIlllII[1]] = o."EAGLE_EYE";
    }

    static {
        o.lIllIllIIllllll();
        o.lIllIllIIlllllI();
        RIGOUR = new o(Prayer.RIGOUR);
        EAGLE_EYE = new o(Prayer.EAGLE_EYE);
        o[] oArray = new o[lIlIIIIIlllII[2]];
        oArray[o.lIlIIIIIlllII[0]] = RIGOUR;
        oArray[o.lIlIIIIIlllII[1]] = EAGLE_EYE;
        $VALUES = oArray;
    }

    private static String lIllIllIIllllIl(String var11, String var10) {
        var11 = new String(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var4 = var10.toCharArray();
        int var14 = lIlIIIIIlllII[0];
        char[] var12 = var11.toCharArray();
        int var2 = var12.length;
        int var3 = lIlIIIIIlllII[0];
        while (o.lIllIllIlIIIIII(var3, var2)) {
            char var5 = var12[var3];
            var9.append((char)(var5 ^ var4[var14 % var4.length]));
            0;
            ++var14;
            ++var3;
            0;
            if (-(46 + 104 - 53 + 40 ^ 72 + 76 - 113 + 106) < 0) continue;
            return null;
        }
        return String.valueOf(var9);
    }

    private static boolean lIllIllIlIIIIII(int n2, int n3) {
        return n2 < n3;
    }

    public Prayer z() {
        return this.mapped;
    }

    private static String lIllIllIIllllII(String var7, String var6) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), lIlIIIIIlllII[3]), "DES");
            Cipher var8 = Cipher.getInstance("DES");
            var8.init(lIlIIIIIlllII[2], var1);
            return new String(var8.doFinal(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    private static void lIllIllIIllllll() {
        lIlIIIIIlllII = new int[4];
        o.lIlIIIIIlllII[0] = (93 + 136 - 184 + 148 ^ 2 + 114 - 67 + 90) & (0xD1 ^ 0x86 ^ (0x4E ^ 0x53) ^ -1);
        o.lIlIIIIIlllII[1] = 1;
        o.lIlIIIIIlllII[2] = 2;
        o.lIlIIIIIlllII[3] = 126 + 163 - 184 + 79 ^ 57 + 77 - 28 + 70;
    }

    public static o[] values() {
        return (o[])$VALUES.clone();
    }

    public static o valueOf(String string) {
        return Enum.valueOf(o.class, string);
    }

    private o(Prayer prayer) {
        this.mapped = prayer;
    }
}

