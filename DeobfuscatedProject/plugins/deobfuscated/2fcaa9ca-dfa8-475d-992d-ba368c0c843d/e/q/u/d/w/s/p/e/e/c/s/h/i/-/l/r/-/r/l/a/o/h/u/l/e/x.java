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

    private static String lIIIlIIIllIIlIl(String lllllllllllllllIIlllIIIIIlIIllIl, String lllllllllllllllIIlllIIIIIlIIllII) {
        try {
            SecretKeySpec lllllllllllllllIIlllIIIIIlIlIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlllIIIIIlIIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlllIIIIIlIlIIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlllIIIIIlIlIIIl.init(lllIIIIllllI[2], lllllllllllllllIIlllIIIIIlIlIIlI);
            return new String(lllllllllllllllIIlllIIIIIlIlIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlllIIIIIlIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlllIIIIIlIlIIII) {
            lllllllllllllllIIlllIIIIIlIlIIII.printStackTrace();
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

    private static String lIIIlIIIllIIllI(String lllllllllllllllIIlllIIIIIIllllll, String lllllllllllllllIIlllIIIIIIlllIIl) {
        lllllllllllllllIIlllIIIIIIllllll = new String(Base64.getDecoder().decode(lllllllllllllllIIlllIIIIIIllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlllIIIIIIllllIl = new StringBuilder();
        char[] lllllllllllllllIIlllIIIIIIllllII = lllllllllllllllIIlllIIIIIIlllIIl.toCharArray();
        int lllllllllllllllIIlllIIIIIIlllIll = lllIIIIllllI[0];
        char[] lllllllllllllllIIlllIIIIIIllIlIl = lllllllllllllllIIlllIIIIIIllllll.toCharArray();
        int lllllllllllllllIIlllIIIIIIllIlII = lllllllllllllllIIlllIIIIIIllIlIl.length;
        int lllllllllllllllIIlllIIIIIIllIIll = lllIIIIllllI[0];
        while (x.lIIIlIIIllIlIIl(lllllllllllllllIIlllIIIIIIllIIll, lllllllllllllllIIlllIIIIIIllIlII)) {
            char lllllllllllllllIIlllIIIIIlIIIIII = lllllllllllllllIIlllIIIIIIllIlIl[lllllllllllllllIIlllIIIIIIllIIll];
            lllllllllllllllIIlllIIIIIIllllIl.append((char)(lllllllllllllllIIlllIIIIIlIIIIII ^ lllllllllllllllIIlllIIIIIIllllII[lllllllllllllllIIlllIIIIIIlllIll % lllllllllllllllIIlllIIIIIIllllII.length]));
            0;
            ++lllllllllllllllIIlllIIIIIIlllIll;
            ++lllllllllllllllIIlllIIIIIIllIIll;
            0;
            if (-(65 + 142 - 161 + 111 ^ 87 + 2 - 23 + 87) <= 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlllIIIIIIllllIl);
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

