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

    private static String lIIIlIlIIIIlIIl(String lllllllllllllllIIllIlIlIllIIIlII, String lllllllllllllllIIllIlIlIllIIIIll) {
        lllllllllllllllIIllIlIlIllIIIlII = new String(Base64.getDecoder().decode(lllllllllllllllIIllIlIlIllIIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIlIlIllIIIIlI = new StringBuilder();
        char[] lllllllllllllllIIllIlIlIllIIIIIl = lllllllllllllllIIllIlIlIllIIIIll.toCharArray();
        int lllllllllllllllIIllIlIlIllIIIIII = lllIIlIlIIIl[0];
        char[] lllllllllllllllIIllIlIlIlIlllIlI = lllllllllllllllIIllIlIlIllIIIlII.toCharArray();
        int lllllllllllllllIIllIlIlIlIlllIIl = lllllllllllllllIIllIlIlIlIlllIlI.length;
        int lllllllllllllllIIllIlIlIlIlllIII = lllIIlIlIIIl[0];
        while (L.lIIIlIlIIIIllII(lllllllllllllllIIllIlIlIlIlllIII, lllllllllllllllIIllIlIlIlIlllIIl)) {
            char lllllllllllllllIIllIlIlIllIIIlIl = lllllllllllllllIIllIlIlIlIlllIlI[lllllllllllllllIIllIlIlIlIlllIII];
            lllllllllllllllIIllIlIlIllIIIIlI.append((char)(lllllllllllllllIIllIlIlIllIIIlIl ^ lllllllllllllllIIllIlIlIllIIIIIl[lllllllllllllllIIllIlIlIllIIIIII % lllllllllllllllIIllIlIlIllIIIIIl.length]));
            0;
            ++lllllllllllllllIIllIlIlIllIIIIII;
            ++lllllllllllllllIIllIlIlIlIlllIII;
            0;
            if (-2 < 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIllIlIlIllIIIIlI);
    }

    public static L valueOf(String string) {
        return Enum.valueOf(L.class, string);
    }
}

