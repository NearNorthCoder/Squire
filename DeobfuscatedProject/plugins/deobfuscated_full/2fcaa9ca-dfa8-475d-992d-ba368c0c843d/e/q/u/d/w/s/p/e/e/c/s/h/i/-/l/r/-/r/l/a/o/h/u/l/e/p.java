/*
 * Decompiled with CFR 0.152.
 */
package e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public final class p
extends Enum<p> {
    private static /* synthetic */ String[] lllIIlIIlIII;
    private static /* synthetic */ int[] lllIIlIIlIIl;
    public static final /* synthetic */ /* enum */ p FINAL;
    private static final /* synthetic */ p[] $VALUES;

    public static p valueOf(String string) {
        return Enum.valueOf(p.class, string);
    }

    static {
        p.lIIIlIIllllIlll();
        p.lIIIlIIllllIllI();
        FINAL = new p();
        p[] pArray = new p[lllIIlIIlIIl[1]];
        pArray[p.lllIIlIIlIIl[0]] = FINAL;
        $VALUES = pArray;
    }

    private static boolean lIIIlIIlllllIII(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIIlIIllllIlll() {
        lllIIlIIlIIl = new int[2];
        p.lllIIlIIlIIl[0] = (0x61 ^ 0x68) & ~(0x19 ^ 0x10);
        p.lllIIlIIlIIl[1] = 1;
    }

    private static String lIIIlIIllllIlIl(String var7, String var1) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var3 = new StringBuilder();
        char[] var9 = var1.toCharArray();
        int var6 = lllIIlIIlIIl[0];
        char[] var8 = var7.toCharArray();
        int var5 = var8.length;
        int var2 = lllIIlIIlIIl[0];
        while (p.lIIIlIIlllllIII(var2, var5)) {
            char var4 = var8[var2];
            var3.append((char)(var4 ^ var9[var6 % var9.length]));
            0;
            ++var6;
            ++var2;
            0;
            
            return null;
        }
        return String.valueOf(var3);
    }

    public static p[] values() {
        return (p[])$VALUES.clone();
    }

    private static void lIIIlIIllllIllI() {
        lllIIlIIlIII = new String[lllIIlIIlIIl[1]];
        p.lllIIlIIlIII[p.lllIIlIIlIIl[0]] = p."FINAL";
    }
}

