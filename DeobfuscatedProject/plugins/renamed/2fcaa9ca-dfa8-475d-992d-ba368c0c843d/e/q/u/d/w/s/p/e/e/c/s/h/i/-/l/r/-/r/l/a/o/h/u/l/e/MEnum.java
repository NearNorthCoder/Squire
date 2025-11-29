/*
 * Decompiled with CFR 0.152.
 */
package e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public final class MEnum
extends Enum<m> {
    private static /* synthetic */ String[] llIlllllllIl;
    private static final /* synthetic */ m[] $VALUES;
    public static final /* synthetic */ /* enum */ m NORTH_BACK;
    private static /* synthetic */ int[] llIllllllllI;

    private static void lIIIIlllllllIIl() {
        llIlllllllIl = new String[llIllllllllI[1]];
        m.llIlllllllIl[m.llIllllllllI[0]] = m."NORTH_BACK";
    }

    public static m valueOf(String string) {
        return Enum.valueOf(m.class, string);
    }

    private static void lIIIIlllllllIlI() {
        llIllllllllI = new int[2];
        m.llIllllllllI[0] = (101 + 65 - 88 + 143 ^ 77 + 108 - 49 + 12) & (6 ^ 0 ^ (0x6D ^ 0x22) ^ -1);
        m.llIllllllllI[1] = 1;
    }

    private static boolean lIIIIlllllllIll(int n2, int n3) {
        return n2 < n3;
    }

    public static m[] values() {
        return (m[])$VALUES.clone();
    }

    static {
        m.lIIIIlllllllIlI();
        m.lIIIIlllllllIIl();
        NORTH_BACK = new m();
        m[] mArray = new m[llIllllllllI[1]];
        mArray[m.llIllllllllI[0]] = NORTH_BACK;
        $VALUES = mArray;
    }

    private static String lIIIIlllllllIII(String var7, String var3) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var8 = var3.toCharArray();
        int var1 = llIllllllllI[0];
        char[] var5 = var7.toCharArray();
        int var4 = var5.length;
        int var2 = llIllllllllI[0];
        while (m.lIIIIlllllllIll(var2, var4)) {
            char var6 = var5[var2];
            var9.append((char)(var6 ^ var8[var1 % var8.length]));
            0;
            ++var1;
            ++var2;
            0;
            
            return null;
        }
        return String.valueOf(var9);
    }
}

