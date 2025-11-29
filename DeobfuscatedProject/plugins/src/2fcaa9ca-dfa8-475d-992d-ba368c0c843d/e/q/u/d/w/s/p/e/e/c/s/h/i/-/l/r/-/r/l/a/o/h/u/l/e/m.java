/*
 * Decompiled with CFR 0.152.
 */
package e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public final class m
extends Enum<m> {
    private static /* synthetic */ String[] llIlllllllIl;
    private static final /* synthetic */ m[] $VALUES;
    public static final /* synthetic */ /* enum */ m NORTH_BACK;
    private static /* synthetic */ int[] llIllllllllI;

    private static void lIIIIlllllllIIl() {
        llIlllllllIl = new String[llIllllllllI[1]];
        m.llIlllllllIl[m.llIllllllllI[0]] = m.lIIIIlllllllIII("FiQFLD0HKRY7Pg==", "XkWxu");
    }

    public static m valueOf(String string) {
        return Enum.valueOf(m.class, string);
    }

    private static void lIIIIlllllllIlI() {
        llIllllllllI = new int[2];
        m.llIllllllllI[0] = (101 + 65 - 88 + 143 ^ 77 + 108 - 49 + 12) & (6 ^ 0 ^ (0x6D ^ 0x22) ^ -" ".length());
        m.llIllllllllI[1] = " ".length();
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

    private static String lIIIIlllllllIII(String lllllllllllllllIIlllIIllllIlllIl, String lllllllllllllllIIlllIIllllIlIlll) {
        lllllllllllllllIIlllIIllllIlllIl = new String(Base64.getDecoder().decode(lllllllllllllllIIlllIIllllIlllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlllIIllllIllIll = new StringBuilder();
        char[] lllllllllllllllIIlllIIllllIllIlI = lllllllllllllllIIlllIIllllIlIlll.toCharArray();
        int lllllllllllllllIIlllIIllllIllIIl = llIllllllllI[0];
        char[] lllllllllllllllIIlllIIllllIlIIll = lllllllllllllllIIlllIIllllIlllIl.toCharArray();
        int lllllllllllllllIIlllIIllllIlIIlI = lllllllllllllllIIlllIIllllIlIIll.length;
        int lllllllllllllllIIlllIIllllIlIIIl = llIllllllllI[0];
        while (m.lIIIIlllllllIll(lllllllllllllllIIlllIIllllIlIIIl, lllllllllllllllIIlllIIllllIlIIlI)) {
            char lllllllllllllllIIlllIIllllIllllI = lllllllllllllllIIlllIIllllIlIIll[lllllllllllllllIIlllIIllllIlIIIl];
            lllllllllllllllIIlllIIllllIllIll.append((char)(lllllllllllllllIIlllIIllllIllllI ^ lllllllllllllllIIlllIIllllIllIlI[lllllllllllllllIIlllIIllllIllIIl % lllllllllllllllIIlllIIllllIllIlI.length]));
            "".length();
            ++lllllllllllllllIIlllIIllllIllIIl;
            ++lllllllllllllllIIlllIIllllIlIIIl;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlllIIllllIllIll);
    }
}

