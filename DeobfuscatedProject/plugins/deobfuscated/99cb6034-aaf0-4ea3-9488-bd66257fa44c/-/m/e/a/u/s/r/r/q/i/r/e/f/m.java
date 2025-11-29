/*
 * Decompiled with CFR 0.152.
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class m
extends Enum<m> {
    public static final /* synthetic */ /* enum */ m UNOWNED;
    public static final /* synthetic */ /* enum */ m OFF;
    private static final /* synthetic */ m[] $VALUES;
    private static /* synthetic */ int[] llIIIIllIlll;
    public static final /* synthetic */ /* enum */ m ON;
    private static /* synthetic */ String[] llIIIIllIlII;

    private static boolean llllIIllIlIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static String llllIIllIIlIIl(String lllllllllllllllIlIlIlIlIIIllIIlI, String lllllllllllllllIlIlIlIlIIIllIIIl) {
        try {
            SecretKeySpec lllllllllllllllIlIlIlIlIIIllIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIlIlIIIllIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIlIlIlIIIllIlII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlIlIlIIIllIlII.init(llIIIIllIlll[2], lllllllllllllllIlIlIlIlIIIllIlIl);
            return new String(lllllllllllllllIlIlIlIlIIIllIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIlIlIIIllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlIlIlIIIllIIll) {
            lllllllllllllllIlIlIlIlIIIllIIll.printStackTrace();
            return null;
        }
    }

    public static m[] values() {
        return (m[])$VALUES.clone();
    }

    private static String llllIIllIIlIlI(String lllllllllllllllIlIlIlIlIIIIIllIl, String lllllllllllllllIlIlIlIlIIIIIlIlI) {
        try {
            SecretKeySpec lllllllllllllllIlIlIlIlIIIIlIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIlIlIIIIIlIlI.getBytes(StandardCharsets.UTF_8)), llIIIIllIlll[4]), "DES");
            Cipher lllllllllllllllIlIlIlIlIIIIIllll = Cipher.getInstance("DES");
            lllllllllllllllIlIlIlIlIIIIIllll.init(llIIIIllIlll[2], lllllllllllllllIlIlIlIlIIIIlIIII);
            return new String(lllllllllllllllIlIlIlIlIIIIIllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIlIlIIIIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlIlIlIIIIIlllI) {
            lllllllllllllllIlIlIlIlIIIIIlllI.printStackTrace();
            return null;
        }
    }

    static {
        m.llllIIllIlIIIl();
        m.llllIIllIIllII();
        UNOWNED = new m();
        OFF = new m();
        ON = new m();
        m[] mArray = new m[llIIIIllIlll[3]];
        mArray[m.llIIIIllIlll[0]] = UNOWNED;
        mArray[m.llIIIIllIlll[1]] = OFF;
        mArray[m.llIIIIllIlll[2]] = ON;
        $VALUES = mArray;
    }

    private static void llllIIllIlIIIl() {
        llIIIIllIlll = new int[5];
        m.llIIIIllIlll[0] = (0x8E ^ 0x81) & ~(0x21 ^ 0x2E);
        m.llIIIIllIlll[1] = 1;
        m.llIIIIllIlll[2] = 2;
        m.llIIIIllIlll[3] = 3;
        m.llIIIIllIlll[4] = 0x84 ^ 0x8C;
    }

    private static void llllIIllIIllII() {
        llIIIIllIlII = new String[llIIIIllIlll[3]];
        m.llIIIIllIlII[m.llIIIIllIlll[0]] = m."UNOWNED";
        m.llIIIIllIlII[m.llIIIIllIlll[1]] = m."OFF";
        m.llIIIIllIlII[m.llIIIIllIlll[2]] = m."ON";
    }

    private static String llllIIllIIlIll(String lllllllllllllllIlIlIlIlIIIlIIIlI, String lllllllllllllllIlIlIlIlIIIlIIIIl) {
        lllllllllllllllIlIlIlIlIIIlIIIlI = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIlIlIIIlIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIlIlIlIIIlIIIII = new StringBuilder();
        char[] lllllllllllllllIlIlIlIlIIIIlllll = lllllllllllllllIlIlIlIlIIIlIIIIl.toCharArray();
        int lllllllllllllllIlIlIlIlIIIIllllI = llIIIIllIlll[0];
        char[] lllllllllllllllIlIlIlIlIIIIllIII = lllllllllllllllIlIlIlIlIIIlIIIlI.toCharArray();
        int lllllllllllllllIlIlIlIlIIIIlIlll = lllllllllllllllIlIlIlIlIIIIllIII.length;
        int lllllllllllllllIlIlIlIlIIIIlIllI = llIIIIllIlll[0];
        while (m.llllIIllIlIIlI(lllllllllllllllIlIlIlIlIIIIlIllI, lllllllllllllllIlIlIlIlIIIIlIlll)) {
            char lllllllllllllllIlIlIlIlIIIlIIIll = lllllllllllllllIlIlIlIlIIIIllIII[lllllllllllllllIlIlIlIlIIIIlIllI];
            lllllllllllllllIlIlIlIlIIIlIIIII.append((char)(lllllllllllllllIlIlIlIlIIIlIIIll ^ lllllllllllllllIlIlIlIlIIIIlllll[lllllllllllllllIlIlIlIlIIIIllllI % lllllllllllllllIlIlIlIlIIIIlllll.length]));
            0;
            ++lllllllllllllllIlIlIlIlIIIIllllI;
            ++lllllllllllllllIlIlIlIlIIIIlIllI;
            0;
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIlIlIlIIIlIIIII);
    }

    public static m valueOf(String string) {
        return Enum.valueOf(m.class, string);
    }
}

