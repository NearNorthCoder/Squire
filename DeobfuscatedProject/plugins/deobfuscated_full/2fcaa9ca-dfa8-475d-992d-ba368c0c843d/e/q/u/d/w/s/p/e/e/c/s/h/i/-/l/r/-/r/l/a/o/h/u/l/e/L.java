/*
 * Decompiled with CFR 0.152.
 */
package e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public final class L
extends Enum<L> {
    public static final /* synthetic */ /* enum */ L WALK;
    private static /* synthetic */ String[] lllIIlIlIIII;
    private static /* synthetic */ int[] lllIIlIlIIIl;
    private static final /* synthetic */ L[] $VALUES;

    private static boolean lIIIlIlIIIIllII(int n2, int n3) {
        return n2 < n3;
    }

    static {
        L.lIIIlIlIIIIlIll();
        L.lIIIlIlIIIIlIlI();
        WALK = new L();
        L[] lArray = new L[lllIIlIlIIIl[1]];
        lArray[L.lllIIlIlIIIl[0]] = WALK;
        $VALUES = lArray;
    }

    public static L[] values() {
        return (L[])$VALUES.clone();
    }

    private static void lIIIlIlIIIIlIll() {
        lllIIlIlIIIl = new int[2];
        L.lllIIlIlIIIl[0] = (0x40 ^ 7) & ~(0x27 ^ 0x60);
        L.lllIIlIlIIIl[1] = 1;
    }

    private static void lIIIlIlIIIIlIlI() {
        lllIIlIlIIII = new String[lllIIlIlIIIl[1]];
        L.lllIIlIlIIII[L.lllIIlIlIIIl[0]] = L."WALK";
    }

    private static String lIIIlIlIIIIlIIl(String var8, String var2) {
        var8 = new String(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var3 = var2.toCharArray();
        int var4 = lllIIlIlIIIl[0];
        char[] var5 = var8.toCharArray();
        int var1 = var5.length;
        int var6 = lllIIlIlIIIl[0];
        while (L.lIIIlIlIIIIllII(var6, var1)) {
            char var7 = var5[var6];
            var9.append((char)(var7 ^ var3[var4 % var3.length]));
            0;
            ++var4;
            ++var6;
            0;
            if (-2 < 0) continue;
            return null;
        }
        return String.valueOf(var9);
    }

    public static L valueOf(String string) {
        return Enum.valueOf(L.class, string);
    }
}

