/*
 * Decompiled with CFR 0.152.
 */
package e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class x
extends Enum<x> {
    /* synthetic */ String name;
    private static /* synthetic */ String[] lllIIIIlllIl;
    public static final /* synthetic */ /* enum */ x NONE;
    private static final /* synthetic */ x[] $VALUES;
    private static /* synthetic */ int[] lllIIIIllllI;
    public static final /* synthetic */ /* enum */ x STRANGE_LOCKPICK;
    public static final /* synthetic */ /* enum */ x LOCKPICK;

    private static void lIIIlIIIllIlIII() {
        lllIIIIllllI = new int[7];
        x.lllIIIIllllI[0] = (162 + 42 - -33 + 7 ^ 150 + 123 - 103 + 24) & (168 + 182 - 148 + 41 ^ 87 + 78 - -30 + 2 ^ -1);
        x.lllIIIIllllI[1] = 1;
        x.lllIIIIllllI[2] = 2;
        x.lllIIIIllllI[3] = 3;
        x.lllIIIIllllI[4] = 6 ^ 2;
        x.lllIIIIllllI[5] = 98 + 146 - 186 + 138 ^ 46 + 78 - 1 + 70;
        x.lllIIIIllllI[6] = 128 + 163 - 149 + 36 ^ 153 + 142 - 158 + 43;
    }

    public static x valueOf(String string) {
        return Enum.valueOf(x.class, string);
    }

    private static String lIIIlIIIllIIlIl(String var11, String var14) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var14.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var12 = Cipher.getInstance("Blowfish");
            var12.init(lllIIIIllllI[2], var4);
            return new String(var12.doFinal(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }

    public static x[] values() {
        return (x[])$VALUES.clone();
    }

    private static boolean lIIIlIIIllIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIIlIIIllIIlll() {
        lllIIIIlllIl = new String[lllIIIIllllI[6]];
        x.lllIIIIlllIl[x.lllIIIIllllI[0]] = x."NONE";
        x.lllIIIIlllIl[x.lllIIIIllllI[1]] = x."";
        x.lllIIIIlllIl[x.lllIIIIllllI[2]] = x."LOCKPICK";
        x.lllIIIIlllIl[x.lllIIIIllllI[3]] = x."";
        x.lllIIIIlllIl[x.lllIIIIllllI[4]] = x."STRANGE_LOCKPICK";
        x.lllIIIIlllIl[x.lllIIIIllllI[5]] = x."";
    }

    private static String lIIIlIIIllIIllI(String var10, String var8) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var5 = new StringBuilder();
        char[] var13 = var8.toCharArray();
        int var2 = lllIIIIllllI[0];
        char[] var1 = var10.toCharArray();
        int var9 = var1.length;
        int var6 = lllIIIIllllI[0];
        while (x.lIIIlIIIllIlIIl(var6, var9)) {
            char var3 = var1[var6];
            var5.append((char)(var3 ^ var13[var2 % var13.length]));
            0;
            ++var2;
            ++var6;
            0;
            if (-(65 + 142 - 161 + 111 ^ 87 + 2 - 23 + 87) <= 0) continue;
            return null;
        }
        return String.valueOf(var5);
    }

    static {
        x.lIIIlIIIllIlIII();
        x.lIIIlIIIllIIlll();
        NONE = new x(lllIIIIlllIl[lllIIIIllllI[1]]);
        LOCKPICK = new x(lllIIIIlllIl[lllIIIIllllI[3]]);
        STRANGE_LOCKPICK = new x(lllIIIIlllIl[lllIIIIllllI[5]]);
        x[] xArray = new x[lllIIIIllllI[3]];
        xArray[x.lllIIIIllllI[0]] = NONE;
        xArray[x.lllIIIIllllI[1]] = LOCKPICK;
        xArray[x.lllIIIIllllI[2]] = STRANGE_LOCKPICK;
        $VALUES = xArray;
    }

    private x(String string2) {
        this.name = string2;
    }
}

