/*
 * Decompiled with CFR 0.152.
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.av;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aw;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class as
extends Enum<as>
implements aw {
    private final /* synthetic */ av produceSeed;
    private static /* synthetic */ int[] lIllllIlIlIl;
    public static final /* synthetic */ /* enum */ as NOTHING;
    private static /* synthetic */ String[] lIllllIlIIll;
    public static final /* synthetic */ /* enum */ as DEFAULT;
    public static final /* synthetic */ /* enum */ as GRAPES;
    private static final /* synthetic */ as[] $VALUES;

    @Override
    public av bf() {
        return this.produceSeed;
    }

    public static as[] values() {
        return (as[])$VALUES.clone();
    }

    private static void lllIlllIlIIlII() {
        lIllllIlIIll = new String[lIllllIlIlIl[3]];
        as.lIllllIlIIll[as.lIllllIlIlIl[0]] = as."NOTHING";
        as.lIllllIlIIll[as.lIllllIlIlIl[1]] = as."DEFAULT";
        as.lIllllIlIIll[as.lIllllIlIlIl[2]] = as."GRAPES";
    }

    private static String lllIlllIlIIIll(String lllllllllllllllIlIllIIlIIIlIIIll, String lllllllllllllllIlIllIIlIIIlIIlll) {
        lllllllllllllllIlIllIIlIIIlIIIll = new String(Base64.getDecoder().decode(lllllllllllllllIlIllIIlIIIlIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIllIIlIIIlIIllI = new StringBuilder();
        char[] lllllllllllllllIlIllIIlIIIlIIlIl = lllllllllllllllIlIllIIlIIIlIIlll.toCharArray();
        int lllllllllllllllIlIllIIlIIIlIIlII = lIllllIlIlIl[0];
        char[] lllllllllllllllIlIllIIlIIIIllllI = lllllllllllllllIlIllIIlIIIlIIIll.toCharArray();
        int lllllllllllllllIlIllIIlIIIIlllIl = lllllllllllllllIlIllIIlIIIIllllI.length;
        int lllllllllllllllIlIllIIlIIIIlllII = lIllllIlIlIl[0];
        while (as.lllIlllIlIIllI(lllllllllllllllIlIllIIlIIIIlllII, lllllllllllllllIlIllIIlIIIIlllIl)) {
            char lllllllllllllllIlIllIIlIIIlIlIIl = lllllllllllllllIlIllIIlIIIIllllI[lllllllllllllllIlIllIIlIIIIlllII];
            lllllllllllllllIlIllIIlIIIlIIllI.append((char)(lllllllllllllllIlIllIIlIIIlIlIIl ^ lllllllllllllllIlIllIIlIIIlIIlIl[lllllllllllllllIlIllIIlIIIlIIlII % lllllllllllllllIlIllIIlIIIlIIlIl.length]));
            0;
            ++lllllllllllllllIlIllIIlIIIlIIlII;
            ++lllllllllllllllIlIllIIlIIIIlllII;
            0;
            if (2 != 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIllIIlIIIlIIllI);
    }

    static {
        as.lllIlllIlIIlIl();
        as.lllIlllIlIIlII();
        NOTHING = new as(null);
        DEFAULT = new as(av.DEFAULT);
        GRAPES = new as(av.GRAPES);
        as[] asArray = new as[lIllllIlIlIl[3]];
        asArray[as.lIllllIlIlIl[0]] = NOTHING;
        asArray[as.lIllllIlIlIl[1]] = DEFAULT;
        asArray[as.lIllllIlIlIl[2]] = GRAPES;
        $VALUES = asArray;
    }

    private static void lllIlllIlIIlIl() {
        lIllllIlIlIl = new int[5];
        as.lIllllIlIlIl[0] = (0x5B ^ 0x39) & ~(0xE1 ^ 0x83);
        as.lIllllIlIlIl[1] = 1;
        as.lIllllIlIlIl[2] = 2;
        as.lIllllIlIlIl[3] = 3;
        as.lIllllIlIlIl[4] = 118 + 149 - 172 + 68 ^ 6 + 165 - 47 + 47;
    }

    private static String lllIlllIlIIIII(String lllllllllllllllIlIllIIlIIlIIIIll, String lllllllllllllllIlIllIIlIIlIIIIlI) {
        try {
            SecretKeySpec lllllllllllllllIlIllIIlIIlIIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIIlIIlIIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIllIIlIIlIIIlll = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIllIIlIIlIIIlll.init(lIllllIlIlIl[2], lllllllllllllllIlIllIIlIIlIIlIII);
            return new String(lllllllllllllllIlIllIIlIIlIIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIIlIIlIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIllIIlIIlIIIllI) {
            lllllllllllllllIlIllIIlIIlIIIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lllIlllIlIIllI(int n2, int n3) {
        return n2 < n3;
    }

    public static as valueOf(String string) {
        return Enum.valueOf(as.class, string);
    }

    private static String lllIlllIlIIIlI(String lllllllllllllllIlIllIIlIIIlllIII, String lllllllllllllllIlIllIIlIIIllIlIl) {
        try {
            SecretKeySpec lllllllllllllllIlIllIIlIIIlllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIIlIIIllIlIl.getBytes(StandardCharsets.UTF_8)), lIllllIlIlIl[4]), "DES");
            Cipher lllllllllllllllIlIllIIlIIIlllIlI = Cipher.getInstance("DES");
            lllllllllllllllIlIllIIlIIIlllIlI.init(lIllllIlIlIl[2], lllllllllllllllIlIllIIlIIIlllIll);
            return new String(lllllllllllllllIlIllIIlIIIlllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIIlIIIlllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIllIIlIIIlllIIl) {
            lllllllllllllllIlIllIIlIIIlllIIl.printStackTrace();
            return null;
        }
    }

    private as(av av2) {
        this.produceSeed = av2;
    }
}

