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

public final class LEnum
extends Enum<l> {
    private static /* synthetic */ String[] lIIlllllIIIIl;
    private final /* synthetic */ Prayer mapped;
    public static final /* synthetic */ /* enum */ l MYSTIC_MIGHT;
    public static final /* synthetic */ /* enum */ l AUGURY;
    private static final /* synthetic */ l[] $VALUES;
    private static /* synthetic */ int[] lIIlllllIIIlI;

    public static l[] values() {
        return (l[])$VALUES.clone();
    }

    private static String lIllIlIIllllIlI(String var7, String var13) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var11 = new StringBuilder();
        char[] var10 = var13.toCharArray();
        int var9 = lIIlllllIIIlI[0];
        char[] var6 = var7.toCharArray();
        int var1 = var6.length;
        int var8 = lIIlllllIIIlI[0];
        while (l.lIllIllIIlIlIll(var8, var1)) {
            char var12 = var6[var8];
            var11.append((char)(var12 ^ var10[var9 % var10.length]));
            0;
            ++var9;
            ++var8;
            0;
            
            return null;
        }
        return String.valueOf(var11);
    }

    private static void lIllIlIIlllllII() {
        lIIlllllIIIIl = new String[lIIlllllIIIlI[2]];
        l.lIIlllllIIIIl[l.lIIlllllIIIlI[0]] = l."AUGURY";
        l.lIIlllllIIIIl[l.lIIlllllIIIlI[1]] = l."MYSTIC_MIGHT";
    }

    static {
        l.lIllIlIIlllllIl();
        l.lIllIlIIlllllII();
        AUGURY = new l(Prayer.AUGURY);
        MYSTIC_MIGHT = new l(Prayer.MYSTIC_MIGHT);
        l[] lArray = new l[lIIlllllIIIlI[2]];
        lArray[l.lIIlllllIIIlI[0]] = AUGURY;
        lArray[l.lIIlllllIIIlI[1]] = MYSTIC_MIGHT;
        $VALUES = lArray;
    }

    public Prayer z() {
        return this.mapped;
    }

    public static l valueOf(String string) {
        return Enum.valueOf(l.class, string);
    }

    private static String lIllIlIIllllIll(String var14, String var5) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), lIIlllllIIIlI[3]), "DES");
            Cipher var3 = Cipher.getInstance("DES");
            var3.init(lIIlllllIIIlI[2], var2);
            return new String(var3.doFinal(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var4) {
            var4.printStackTrace();
            return null;
        }
    }

    private static void lIllIlIIlllllIl() {
        lIIlllllIIIlI = new int[4];
        l.lIIlllllIIIlI[0] = (0xD ^ 0x4E) & ~(0x7D ^ 0x3E);
        l.lIIlllllIIIlI[1] = 1;
        l.lIIlllllIIIlI[2] = 2;
        l.lIIlllllIIIlI[3] = 0xBC ^ 0xB4;
    }

    private l(Prayer prayer) {
        this.mapped = prayer;
    }

    private static boolean lIllIllIIlIlIll(int n2, int n3) {
        return n2 < n3;
    }
}

