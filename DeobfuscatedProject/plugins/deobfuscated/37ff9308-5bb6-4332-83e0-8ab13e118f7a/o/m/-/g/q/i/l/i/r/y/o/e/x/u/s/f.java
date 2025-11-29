/*
 * Decompiled with CFR 0.152.
 */
package o.m.-.g.q.i.l.i.r.y.o.e.x.u.s;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class f
extends Enum<f> {
    private static final /* synthetic */ f[] $VALUES;
    public static final /* synthetic */ /* enum */ f SINGLE_ORDER;
    private static /* synthetic */ String[] lIIIIIIIIIlll;
    public static final /* synthetic */ /* enum */ f MULTI_ORDER;
    private static /* synthetic */ int[] lIIIIIIIIlIII;

    public static f valueOf(String string) {
        return Enum.valueOf(f.class, string);
    }

    public static f[] values() {
        return (f[])$VALUES.clone();
    }

    private static void lIIlIllIIlIIlIl() {
        lIIIIIIIIIlll = new String[lIIIIIIIIlIII[2]];
        f.lIIIIIIIIIlll[f.lIIIIIIIIlIII[0]] = f."SINGLE_ORDER";
        f.lIIIIIIIIIlll[f.lIIIIIIIIlIII[1]] = f."MULTI_ORDER";
    }

    private static boolean lIIlIllIIlIIlll(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIlIllIIlIIlII(String lllllllllllllllIIlIIIIIIIllIlllI, String lllllllllllllllIIlIIIIIIIllIllIl) {
        try {
            SecretKeySpec lllllllllllllllIIlIIIIIIIlllIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIIIIIllIllIl.getBytes(StandardCharsets.UTF_8)), lIIIIIIIIlIII[3]), "DES");
            Cipher lllllllllllllllIIlIIIIIIIlllIIII = Cipher.getInstance("DES");
            lllllllllllllllIIlIIIIIIIlllIIII.init(lIIIIIIIIlIII[2], lllllllllllllllIIlIIIIIIIlllIIIl);
            return new String(lllllllllllllllIIlIIIIIIIlllIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIIIIIllIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIIIIIIIllIllll) {
            lllllllllllllllIIlIIIIIIIllIllll.printStackTrace();
            return null;
        }
    }

    private static String lIIlIllIIlIIIll(String lllllllllllllllIIlIIIIIIlIIIIIll, String lllllllllllllllIIlIIIIIIlIIIIIlI) {
        lllllllllllllllIIlIIIIIIlIIIIIll = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIIIIIlIIIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIIIIIIlIIIIIIl = new StringBuilder();
        char[] lllllllllllllllIIlIIIIIIlIIIIIII = lllllllllllllllIIlIIIIIIlIIIIIlI.toCharArray();
        int lllllllllllllllIIlIIIIIIIlllllll = lIIIIIIIIlIII[0];
        char[] lllllllllllllllIIlIIIIIIIllllIIl = lllllllllllllllIIlIIIIIIlIIIIIll.toCharArray();
        int lllllllllllllllIIlIIIIIIIllllIII = lllllllllllllllIIlIIIIIIIllllIIl.length;
        int lllllllllllllllIIlIIIIIIIlllIlll = lIIIIIIIIlIII[0];
        while (f.lIIlIllIIlIIlll(lllllllllllllllIIlIIIIIIIlllIlll, lllllllllllllllIIlIIIIIIIllllIII)) {
            char lllllllllllllllIIlIIIIIIlIIIIlII = lllllllllllllllIIlIIIIIIIllllIIl[lllllllllllllllIIlIIIIIIIlllIlll];
            lllllllllllllllIIlIIIIIIlIIIIIIl.append((char)(lllllllllllllllIIlIIIIIIlIIIIlII ^ lllllllllllllllIIlIIIIIIlIIIIIII[lllllllllllllllIIlIIIIIIIlllllll % lllllllllllllllIIlIIIIIIlIIIIIII.length]));
            0;
            ++lllllllllllllllIIlIIIIIIIlllllll;
            ++lllllllllllllllIIlIIIIIIIlllIlll;
            0;
            if (3 == 3) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIIIIIIlIIIIIIl);
    }

    private static void lIIlIllIIlIIllI() {
        lIIIIIIIIlIII = new int[4];
        f.lIIIIIIIIlIII[0] = (0xF6 ^ 0xBE ^ (0xE0 ^ 0x89)) & (0xAD ^ 0x84 ^ (0x8F ^ 0x87) ^ -1);
        f.lIIIIIIIIlIII[1] = 1;
        f.lIIIIIIIIlIII[2] = 2;
        f.lIIIIIIIIlIII[3] = 0x30 ^ 0x38;
    }

    static {
        f.lIIlIllIIlIIllI();
        f.lIIlIllIIlIIlIl();
        SINGLE_ORDER = new f();
        MULTI_ORDER = new f();
        f[] fArray = new f[lIIIIIIIIlIII[2]];
        fArray[f.lIIIIIIIIlIII[0]] = SINGLE_ORDER;
        fArray[f.lIIIIIIIIlIII[1]] = MULTI_ORDER;
        $VALUES = fArray;
    }
}

