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
        o.lllIIIlIlIII[0] = (0x3A ^ 0x5E ^ (0x20 ^ 0x48)) & (0x42 ^ 0x2C ^ (0x4A ^ 0x28) ^ -" ".length());
        o.lllIIIlIlIII[1] = " ".length();
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
        o.lllIIIlIIlll[o.lllIIIlIlIII[0]] = o.lIIIlIIlIIIllIl("HSYlASc=", "NipUo");
    }

    public static o valueOf(String string) {
        return Enum.valueOf(o.class, string);
    }

    public static o[] values() {
        return (o[])$VALUES.clone();
    }

    private static String lIIIlIIlIIIllIl(String lllllllllllllllIIllIllllIIIIllII, String lllllllllllllllIIllIllllIIIIIllI) {
        lllllllllllllllIIllIllllIIIIllII = new String(Base64.getDecoder().decode(lllllllllllllllIIllIllllIIIIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIllllIIIIlIlI = new StringBuilder();
        char[] lllllllllllllllIIllIllllIIIIlIIl = lllllllllllllllIIllIllllIIIIIllI.toCharArray();
        int lllllllllllllllIIllIllllIIIIlIII = lllIIIlIlIII[0];
        char[] lllllllllllllllIIllIllllIIIIIIlI = lllllllllllllllIIllIllllIIIIllII.toCharArray();
        int lllllllllllllllIIllIllllIIIIIIIl = lllllllllllllllIIllIllllIIIIIIlI.length;
        int lllllllllllllllIIllIllllIIIIIIII = lllIIIlIlIII[0];
        while (o.lIIIlIIlIIlIIII(lllllllllllllllIIllIllllIIIIIIII, lllllllllllllllIIllIllllIIIIIIIl)) {
            char lllllllllllllllIIllIllllIIIIllIl = lllllllllllllllIIllIllllIIIIIIlI[lllllllllllllllIIllIllllIIIIIIII];
            lllllllllllllllIIllIllllIIIIlIlI.append((char)(lllllllllllllllIIllIllllIIIIllIl ^ lllllllllllllllIIllIllllIIIIlIIl[lllllllllllllllIIllIllllIIIIlIII % lllllllllllllllIIllIllllIIIIlIIl.length]));
            "".length();
            ++lllllllllllllllIIllIllllIIIIlIII;
            ++lllllllllllllllIIllIllllIIIIIIII;
            "".length();
            if (-"   ".length() <= 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIllIllllIIIIlIlI);
    }
}

