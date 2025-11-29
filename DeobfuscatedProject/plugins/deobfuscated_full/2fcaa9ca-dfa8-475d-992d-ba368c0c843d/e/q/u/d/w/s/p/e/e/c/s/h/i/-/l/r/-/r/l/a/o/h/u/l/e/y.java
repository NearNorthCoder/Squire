/*
 * Decompiled with CFR 0.152.
 */
package e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class y
extends Enum<y> {
    public static final /* synthetic */ /* enum */ y MAHOGANY_RUNE;
    public static final /* synthetic */ /* enum */ y REGULAR_STEEL;
    public static final /* synthetic */ /* enum */ y NONE;
    public static final /* synthetic */ /* enum */ y OAK_MITHRIL;
    public static final /* synthetic */ /* enum */ y TEAK_ADAMANT;
    private static final /* synthetic */ y[] $VALUES;
    private static /* synthetic */ String[] lllIIIlllIll;
    /* synthetic */ String name;
    private static /* synthetic */ int[] lllIIIllllII;

    private static String lIIIlIIllIlllII(String var6, String var14) {
        try {
            SecretKeySpec var16 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var14.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var3 = Cipher.getInstance("Blowfish");
            var3.init(lllIIIllllII[2], var16);
            return new String(var3.doFinal(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    private static void lIIIlIIllIllllI() {
        lllIIIlllIll = new String[lllIIIllllII[10]];
        y.lllIIIlllIll[y.lllIIIllllII[0]] = y."NONE";
        y.lllIIIlllIll[y.lllIIIllllII[1]] = y."";
        y.lllIIIlllIll[y.lllIIIllllII[2]] = y."REGULAR_STEEL";
        y.lllIIIlllIll[y.lllIIIllllII[3]] = y."";
        y.lllIIIlllIll[y.lllIIIllllII[4]] = y."OAK_MITHRIL";
        y.lllIIIlllIll[y.lllIIIllllII[5]] = y."";
        y.lllIIIlllIll[y.lllIIIllllII[6]] = y."TEAK_ADAMANT";
        y.lllIIIlllIll[y.lllIIIllllII[7]] = y."";
        y.lllIIIlllIll[y.lllIIIllllII[8]] = y."MAHOGANY_RUNE";
        y.lllIIIlllIll[y.lllIIIllllII[9]] = y."";
    }

    static {
        y.lIIIlIIllIlllll();
        y.lIIIlIIllIllllI();
        NONE = new y(lllIIIlllIll[lllIIIllllII[1]]);
        REGULAR_STEEL = new y(lllIIIlllIll[lllIIIllllII[3]]);
        OAK_MITHRIL = new y(lllIIIlllIll[lllIIIllllII[5]]);
        TEAK_ADAMANT = new y(lllIIIlllIll[lllIIIllllII[7]]);
        MAHOGANY_RUNE = new y(lllIIIlllIll[lllIIIllllII[9]]);
        y[] yArray = new y[lllIIIllllII[5]];
        yArray[y.lllIIIllllII[0]] = NONE;
        yArray[y.lllIIIllllII[1]] = REGULAR_STEEL;
        yArray[y.lllIIIllllII[2]] = OAK_MITHRIL;
        yArray[y.lllIIIllllII[3]] = TEAK_ADAMANT;
        yArray[y.lllIIIllllII[4]] = MAHOGANY_RUNE;
        $VALUES = yArray;
    }

    private static String lIIIlIIllIllIll(String var1, String var13) {
        var1 = new String(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var4 = new StringBuilder();
        char[] var17 = var13.toCharArray();
        int var7 = lllIIIllllII[0];
        char[] var8 = var1.toCharArray();
        int var11 = var8.length;
        int var18 = lllIIIllllII[0];
        while (y.lIIIlIIlllIIIII(var18, var11)) {
            char var12 = var8[var18];
            var4.append((char)(var12 ^ var17[var7 % var17.length]));
            0;
            ++var7;
            ++var18;
            0;
            if ((116 + 20 - 11 + 50 ^ 102 + 149 - 181 + 100) > 0) continue;
            return null;
        }
        return String.valueOf(var4);
    }

    private static boolean lIIIlIIlllIIIII(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIIlIIllIlllll() {
        lllIIIllllII = new int[11];
        y.lllIIIllllII[0] = (0x67 ^ 0x22 ^ (0x19 ^ 0x1F)) & (0x16 ^ 0x61 ^ (0x4E ^ 0x7A) ^ -1);
        y.lllIIIllllII[1] = 1;
        y.lllIIIllllII[2] = 2;
        y.lllIIIllllII[3] = 3;
        y.lllIIIllllII[4] = 73 + 24 - -35 + 8 ^ 82 + 47 - 128 + 135;
        y.lllIIIllllII[5] = 0x9F ^ 0x9A;
        y.lllIIIllllII[6] = 0xC1 ^ 0xC7;
        y.lllIIIllllII[7] = 0x76 ^ 0x4A ^ (0x35 ^ 0xE);
        y.lllIIIllllII[8] = 0x53 ^ 0x48 ^ (0xBF ^ 0xAC);
        y.lllIIIllllII[9] = 0xE0 ^ 0xAD ^ (0x57 ^ 0x13);
        y.lllIIIllllII[10] = 0 ^ 0xA;
    }

    public static y[] values() {
        return (y[])$VALUES.clone();
    }

    private static String lIIIlIIllIlllIl(String var2, String var15) {
        try {
            SecretKeySpec var10 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var15.getBytes(StandardCharsets.UTF_8)), lllIIIllllII[8]), "DES");
            Cipher var5 = Cipher.getInstance("DES");
            var5.init(lllIIIllllII[2], var10);
            return new String(var5.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    public static y valueOf(String string) {
        return Enum.valueOf(y.class, string);
    }

    private y(String string2) {
        this.name = string2;
    }
}

