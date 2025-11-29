/*
 * Decompiled with CFR 0.152.
 */
package u.i.r.d.s.e.r.q.y.a.h.-;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class l
extends Enum<l> {
    private static /* synthetic */ int[] llllIIlIIlII;
    public static final /* synthetic */ /* enum */ l DONE;
    public static final /* synthetic */ /* enum */ l MOVING;
    private static final /* synthetic */ l[] $VALUES;
    private static /* synthetic */ String[] llllIIlIIIII;
    public static final /* synthetic */ /* enum */ l WAITING;

    public static l[] values() {
        return (l[])$VALUES.clone();
    }

    private static String lIIIllllIlllIlI(String lllllllllllllllIIlIlIllIIlllIlIl, String lllllllllllllllIIlIlIllIIlllIIlI) {
        try {
            SecretKeySpec lllllllllllllllIIlIlIllIIllllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIllIIlllIIlI.getBytes(StandardCharsets.UTF_8)), llllIIlIIlII[4]), "DES");
            Cipher lllllllllllllllIIlIlIllIIlllIlll = Cipher.getInstance("DES");
            lllllllllllllllIIlIlIllIIlllIlll.init(llllIIlIIlII[2], lllllllllllllllIIlIlIllIIllllIII);
            return new String(lllllllllllllllIIlIlIllIIlllIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIllIIlllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIlIllIIlllIllI) {
            lllllllllllllllIIlIlIllIIlllIllI.printStackTrace();
            return null;
        }
    }

    static {
        l.lIIIlllllIIllII();
        l.lIIIllllIllllIl();
        WAITING = new l();
        MOVING = new l();
        DONE = new l();
        l[] lArray = new l[llllIIlIIlII[3]];
        lArray[l.llllIIlIIlII[0]] = WAITING;
        lArray[l.llllIIlIIlII[1]] = MOVING;
        lArray[l.llllIIlIIlII[2]] = DONE;
        $VALUES = lArray;
    }

    private static String lIIIllllIllllII(String lllllllllllllllIIlIlIllIIlIIlllI, String lllllllllllllllIIlIlIllIIlIIllll) {
        try {
            SecretKeySpec lllllllllllllllIIlIlIllIIlIlIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIllIIlIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIlIllIIlIlIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIlIllIIlIlIIlI.init(llllIIlIIlII[2], lllllllllllllllIIlIlIllIIlIlIIll);
            return new String(lllllllllllllllIIlIlIllIIlIlIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIllIIlIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIlIllIIlIlIIIl) {
            lllllllllllllllIIlIlIllIIlIlIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlllllIIllIl(int n2, int n3) {
        return n2 < n3;
    }

    public static l valueOf(String string) {
        return Enum.valueOf(l.class, string);
    }

    private static String lIIIllllIlllIll(String lllllllllllllllIIlIlIllIIllIIIII, String lllllllllllllllIIlIlIllIIllIIlII) {
        lllllllllllllllIIlIlIllIIllIIIII = new String(Base64.getDecoder().decode(lllllllllllllllIIlIlIllIIllIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIlIllIIllIIIll = new StringBuilder();
        char[] lllllllllllllllIIlIlIllIIllIIIlI = lllllllllllllllIIlIlIllIIllIIlII.toCharArray();
        int lllllllllllllllIIlIlIllIIllIIIIl = llllIIlIIlII[0];
        char[] lllllllllllllllIIlIlIllIIlIllIll = lllllllllllllllIIlIlIllIIllIIIII.toCharArray();
        int lllllllllllllllIIlIlIllIIlIllIlI = lllllllllllllllIIlIlIllIIlIllIll.length;
        int lllllllllllllllIIlIlIllIIlIllIIl = llllIIlIIlII[0];
        while (l.lIIIlllllIIllIl(lllllllllllllllIIlIlIllIIlIllIIl, lllllllllllllllIIlIlIllIIlIllIlI)) {
            char lllllllllllllllIIlIlIllIIllIIllI = lllllllllllllllIIlIlIllIIlIllIll[lllllllllllllllIIlIlIllIIlIllIIl];
            lllllllllllllllIIlIlIllIIllIIIll.append((char)(lllllllllllllllIIlIlIllIIllIIllI ^ lllllllllllllllIIlIlIllIIllIIIlI[lllllllllllllllIIlIlIllIIllIIIIl % lllllllllllllllIIlIlIllIIllIIIlI.length]));
            0;
            ++lllllllllllllllIIlIlIllIIllIIIIl;
            ++lllllllllllllllIIlIlIllIIlIllIIl;
            0;
            if (-3 < 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIlIllIIllIIIll);
    }

    private static void lIIIllllIllllIl() {
        llllIIlIIIII = new String[llllIIlIIlII[3]];
        l.llllIIlIIIII[l.llllIIlIIlII[0]] = l."WAITING";
        l.llllIIlIIIII[l.llllIIlIIlII[1]] = l."MOVING";
        l.llllIIlIIIII[l.llllIIlIIlII[2]] = l."DONE";
    }

    private static void lIIIlllllIIllII() {
        llllIIlIIlII = new int[5];
        l.llllIIlIIlII[0] = (0x1A ^ 0x67 ^ (0x51 ^ 0xE)) & (162 + 99 - 168 + 77 ^ 56 + 1 - -73 + 6 ^ -1);
        l.llllIIlIIlII[1] = 1;
        l.llllIIlIIlII[2] = 2;
        l.llllIIlIIlII[3] = 3;
        l.llllIIlIIlII[4] = 0x9F ^ 0x97;
    }
}

