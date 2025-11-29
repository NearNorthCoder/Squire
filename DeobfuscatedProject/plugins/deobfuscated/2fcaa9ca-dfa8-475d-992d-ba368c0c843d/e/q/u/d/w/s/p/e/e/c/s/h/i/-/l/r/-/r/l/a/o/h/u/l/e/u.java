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

public final class u
extends Enum<u> {
    private static /* synthetic */ int[] lllIIIIlIIll;
    public static final /* synthetic */ /* enum */ u GRAPPLE;
    public static final /* synthetic */ /* enum */ u FIX_BRIDGE;
    public static final /* synthetic */ /* enum */ u CAST_PORTAL;
    public static final /* synthetic */ /* enum */ u HOLY_BARRIER;
    public static final /* synthetic */ /* enum */ u BRAZIER;
    private static /* synthetic */ String[] lllIIIIlIIlI;
    private static final /* synthetic */ u[] $VALUES;

    private static void lIIIlIIIIlllllI() {
        lllIIIIlIIll = new int[7];
        u.lllIIIIlIIll[0] = (0xFE ^ 0xA1) & ~(0xD4 ^ 0x8B);
        u.lllIIIIlIIll[1] = 1;
        u.lllIIIIlIIll[2] = 2;
        u.lllIIIIlIIll[3] = 3;
        u.lllIIIIlIIll[4] = 0x74 ^ 0x70;
        u.lllIIIIlIIll[5] = 91 + 37 - 16 + 15 ^ (0x61 ^ 0x1B);
        u.lllIIIIlIIll[6] = 0xC ^ 4;
    }

    private static String lIIIlIIIIlllIll(String lllllllllllllllIIlllIIlIIIIlIIII, String lllllllllllllllIIlllIIlIIIIIlIlI) {
        lllllllllllllllIIlllIIlIIIIlIIII = new String(Base64.getDecoder().decode(lllllllllllllllIIlllIIlIIIIlIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlllIIlIIIIIlllI = new StringBuilder();
        char[] lllllllllllllllIIlllIIlIIIIIllIl = lllllllllllllllIIlllIIlIIIIIlIlI.toCharArray();
        int lllllllllllllllIIlllIIlIIIIIllII = lllIIIIlIIll[0];
        char[] lllllllllllllllIIlllIIlIIIIIIllI = lllllllllllllllIIlllIIlIIIIlIIII.toCharArray();
        int lllllllllllllllIIlllIIlIIIIIIlIl = lllllllllllllllIIlllIIlIIIIIIllI.length;
        int lllllllllllllllIIlllIIlIIIIIIlII = lllIIIIlIIll[0];
        while (u.lIIIlIIIIllllll(lllllllllllllllIIlllIIlIIIIIIlII, lllllllllllllllIIlllIIlIIIIIIlIl)) {
            char lllllllllllllllIIlllIIlIIIIlIIIl = lllllllllllllllIIlllIIlIIIIIIllI[lllllllllllllllIIlllIIlIIIIIIlII];
            lllllllllllllllIIlllIIlIIIIIlllI.append((char)(lllllllllllllllIIlllIIlIIIIlIIIl ^ lllllllllllllllIIlllIIlIIIIIllIl[lllllllllllllllIIlllIIlIIIIIllII % lllllllllllllllIIlllIIlIIIIIllIl.length]));
            0;
            ++lllllllllllllllIIlllIIlIIIIIllII;
            ++lllllllllllllllIIlllIIlIIIIIIlII;
            0;
            if (1 >= 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlllIIlIIIIIlllI);
    }

    private static String lIIIlIIIIlllIlI(String lllllllllllllllIIlllIIIllllIllII, String lllllllllllllllIIlllIIIllllIllIl) {
        try {
            SecretKeySpec lllllllllllllllIIlllIIIlllllIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlllIIIllllIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlllIIIlllllIIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlllIIIlllllIIII.init(lllIIIIlIIll[2], lllllllllllllllIIlllIIIlllllIIIl);
            return new String(lllllllllllllllIIlllIIIlllllIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlllIIIllllIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlllIIIllllIllll) {
            lllllllllllllllIIlllIIIllllIllll.printStackTrace();
            return null;
        }
    }

    static {
        u.lIIIlIIIIlllllI();
        u.lIIIlIIIIllllIl();
        FIX_BRIDGE = new u();
        HOLY_BARRIER = new u();
        CAST_PORTAL = new u();
        BRAZIER = new u();
        GRAPPLE = new u();
        u[] uArray = new u[lllIIIIlIIll[5]];
        uArray[u.lllIIIIlIIll[0]] = FIX_BRIDGE;
        uArray[u.lllIIIIlIIll[1]] = HOLY_BARRIER;
        uArray[u.lllIIIIlIIll[2]] = CAST_PORTAL;
        uArray[u.lllIIIIlIIll[3]] = BRAZIER;
        uArray[u.lllIIIIlIIll[4]] = GRAPPLE;
        $VALUES = uArray;
    }

    public static u valueOf(String string) {
        return Enum.valueOf(u.class, string);
    }

    private static String lIIIlIIIIllllII(String lllllllllllllllIIlllIIIllllllIll, String lllllllllllllllIIlllIIIllllllIII) {
        try {
            SecretKeySpec lllllllllllllllIIlllIIIllllllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlllIIIllllllIII.getBytes(StandardCharsets.UTF_8)), lllIIIIlIIll[6]), "DES");
            Cipher lllllllllllllllIIlllIIIlllllllIl = Cipher.getInstance("DES");
            lllllllllllllllIIlllIIIlllllllIl.init(lllIIIIlIIll[2], lllllllllllllllIIlllIIIllllllllI);
            return new String(lllllllllllllllIIlllIIIlllllllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlllIIIllllllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlllIIIlllllllII) {
            lllllllllllllllIIlllIIIlllllllII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlIIIIllllll(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIIlIIIIllllIl() {
        lllIIIIlIIlI = new String[lllIIIIlIIll[5]];
        u.lllIIIIlIIlI[u.lllIIIIlIIll[0]] = u."FIX_BRIDGE";
        u.lllIIIIlIIlI[u.lllIIIIlIIll[1]] = u."HOLY_BARRIER";
        u.lllIIIIlIIlI[u.lllIIIIlIIll[2]] = u."CAST_PORTAL";
        u.lllIIIIlIIlI[u.lllIIIIlIIll[3]] = u."BRAZIER";
        u.lllIIIIlIIlI[u.lllIIIIlIIll[4]] = u."GRAPPLE";
    }

    public static u[] values() {
        return (u[])$VALUES.clone();
    }
}

