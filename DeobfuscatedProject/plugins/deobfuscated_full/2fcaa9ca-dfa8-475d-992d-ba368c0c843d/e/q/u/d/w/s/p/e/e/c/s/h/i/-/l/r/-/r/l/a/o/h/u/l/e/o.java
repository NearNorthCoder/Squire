/*
 * Decompiled with CFR 0.152.
 */
package e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public final class o
extends Enum<o> {
    private static /* synthetic */ String[] lllIIIlIIlll;
    private static /* synthetic */ int[] lllIIIlIlIII;
    public static final /* synthetic */ /* enum */ o SOUTH;
    private static final /* synthetic */ o[] $VALUES;

    private static void lIIIlIIlIIIllll() {
        lllIIIlIlIII = new int[2];
        o.lllIIIlIlIII[0] = (0x3A ^ 0x5E ^ (0x20 ^ 0x48)) & (0x42 ^ 0x2C ^ (0x4A ^ 0x28) ^ -1);
        o.lllIIIlIlIII[1] = 1;
    }

    private static boolean lIIIlIIlIIlIIII(int n2, int n3) {
        return n2 < n3;
    }

    static {
        o.lIIIlIIlIIIllll();
        o.lIIIlIIlIIIlllI();
        SOUTH = new o();
        o[] oArray = new o[lllIIIlIlIII[1]];
        oArray[o.lllIIIlIlIII[0]] = SOUTH;
        $VALUES = oArray;
    }

    private static void lIIIlIIlIIIlllI() {
        lllIIIlIIlll = new String[lllIIIlIlIII[1]];
        o.lllIIIlIIlll[o.lllIIIlIlIII[0]] = o."SOUTH";
    }

    public static o valueOf(String string) {
        return Enum.valueOf(o.class, string);
    }

    public static o[] values() {
        return (o[])$VALUES.clone();
    }

    private static String lIIIlIIlIIIllIl(String var6, String var7) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var2 = var7.toCharArray();
        int var5 = lllIIIlIlIII[0];
        char[] var1 = var6.toCharArray();
        int var3 = var1.length;
        int var8 = lllIIIlIlIII[0];
        while (o.lIIIlIIlIIlIIII(var8, var3)) {
            char var4 = var1[var8];
            var9.append((char)(var4 ^ var2[var5 % var2.length]));
            0;
            ++var5;
            ++var8;
            0;
            if (-3 <= 0) continue;
            return null;
        }
        return String.valueOf(var9);
    }
}

