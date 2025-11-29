/*
 * Decompiled with CFR 0.152.
 */
package s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class c
extends Enum<c> {
    public static final /* synthetic */ /* enum */ c HARVESTING;
    private static /* synthetic */ int[] lllIIllIIIII;
    private static /* synthetic */ String[] lllIIlIlllll;
    public static final /* synthetic */ /* enum */ c PATHING;
    private static final /* synthetic */ c[] $VALUES;
    public static final /* synthetic */ /* enum */ c INSPECTING;
    public static final /* synthetic */ /* enum */ c STARTING;
    public static final /* synthetic */ /* enum */ c IDLE;
    public static final /* synthetic */ /* enum */ c FINISHING;

    public static c valueOf(String string) {
        return Enum.valueOf(c.class, string);
    }

    private static String lIIIlIlIIlIllIl(String lllllllllllllllIIllIlIIlIllIllII, String lllllllllllllllIIllIlIIlIllIlIll) {
        try {
            SecretKeySpec lllllllllllllllIIllIlIIlIlllIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIIlIllIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIlIIlIlllIIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIlIIlIlllIIII.init(lllIIllIIIII[2], lllllllllllllllIIllIlIIlIlllIIIl);
            return new String(lllllllllllllllIIllIlIIlIlllIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIIlIllIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIlIIlIllIllll) {
            lllllllllllllllIIllIlIIlIllIllll.printStackTrace();
            return null;
        }
    }

    private static String lIIIlIlIIlIlIll(String lllllllllllllllIIllIlIIlIlIllIIl, String lllllllllllllllIIllIlIIlIlIllIII) {
        lllllllllllllllIIllIlIIlIlIllIIl = new String(Base64.getDecoder().decode(lllllllllllllllIIllIlIIlIlIllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIlIIlIlIlllII = new StringBuilder();
        char[] lllllllllllllllIIllIlIIlIlIllIll = lllllllllllllllIIllIlIIlIlIllIII.toCharArray();
        int lllllllllllllllIIllIlIIlIlIllIlI = lllIIllIIIII[0];
        char[] lllllllllllllllIIllIlIIlIlIlIlII = lllllllllllllllIIllIlIIlIlIllIIl.toCharArray();
        int lllllllllllllllIIllIlIIlIlIlIIll = lllllllllllllllIIllIlIIlIlIlIlII.length;
        int lllllllllllllllIIllIlIIlIlIlIIlI = lllIIllIIIII[0];
        while (c.lIIIlIlIIllIIII(lllllllllllllllIIllIlIIlIlIlIIlI, lllllllllllllllIIllIlIIlIlIlIIll)) {
            char lllllllllllllllIIllIlIIlIlIlllll = lllllllllllllllIIllIlIIlIlIlIlII[lllllllllllllllIIllIlIIlIlIlIIlI];
            lllllllllllllllIIllIlIIlIlIlllII.append((char)(lllllllllllllllIIllIlIIlIlIlllll ^ lllllllllllllllIIllIlIIlIlIllIll[lllllllllllllllIIllIlIIlIlIllIlI % lllllllllllllllIIllIlIIlIlIllIll.length]));
            0;
            ++lllllllllllllllIIllIlIIlIlIllIlI;
            ++lllllllllllllllIIllIlIIlIlIlIIlI;
            0;
            if (3 <= 3) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIllIlIIlIlIlllII);
    }

    private static String lIIIlIlIIlIllII(String lllllllllllllllIIllIlIIlIlIIIlll, String lllllllllllllllIIllIlIIlIlIIlIII) {
        try {
            SecretKeySpec lllllllllllllllIIllIlIIlIlIIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIIlIlIIlIII.getBytes(StandardCharsets.UTF_8)), lllIIllIIIII[7]), "DES");
            Cipher lllllllllllllllIIllIlIIlIlIIlIll = Cipher.getInstance("DES");
            lllllllllllllllIIllIlIIlIlIIlIll.init(lllIIllIIIII[2], lllllllllllllllIIllIlIIlIlIIllII);
            return new String(lllllllllllllllIIllIlIIlIlIIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIIlIlIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIlIIlIlIIlIlI) {
            lllllllllllllllIIllIlIIlIlIIlIlI.printStackTrace();
            return null;
        }
    }

    private static void lIIIlIlIIlIllll() {
        lllIIllIIIII = new int[8];
        c.lllIIllIIIII[0] = (0x3B ^ 0x6D) & ~(0x7E ^ 0x28);
        c.lllIIllIIIII[1] = 1;
        c.lllIIllIIIII[2] = 2;
        c.lllIIllIIIII[3] = 3;
        c.lllIIllIIIII[4] = 0x7D ^ 0x37 ^ (0xD6 ^ 0x98);
        c.lllIIllIIIII[5] = 0xD ^ 0x37 ^ (0x6F ^ 0x50);
        c.lllIIllIIIII[6] = 0x7D ^ 0x4B ^ (0x54 ^ 0x64);
        c.lllIIllIIIII[7] = 0xB8 ^ 0xB0;
    }

    private static void lIIIlIlIIlIlllI() {
        lllIIlIlllll = new String[lllIIllIIIII[6]];
        c.lllIIlIlllll[c.lllIIllIIIII[0]] = c."PATHING";
        c.lllIIlIlllll[c.lllIIllIIIII[1]] = c."FINISHING";
        c.lllIIlIlllll[c.lllIIllIIIII[2]] = c."HARVESTING";
        c.lllIIlIlllll[c.lllIIllIIIII[3]] = c."STARTING";
        c.lllIIlIlllll[c.lllIIllIIIII[4]] = c."INSPECTING";
        c.lllIIlIlllll[c.lllIIllIIIII[5]] = c."IDLE";
    }

    private static boolean lIIIlIlIIllIIII(int n2, int n3) {
        return n2 < n3;
    }

    static {
        c.lIIIlIlIIlIllll();
        c.lIIIlIlIIlIlllI();
        PATHING = new c();
        FINISHING = new c();
        HARVESTING = new c();
        STARTING = new c();
        INSPECTING = new c();
        IDLE = new c();
        c[] cArray = new c[lllIIllIIIII[6]];
        cArray[c.lllIIllIIIII[0]] = PATHING;
        cArray[c.lllIIllIIIII[1]] = FINISHING;
        cArray[c.lllIIllIIIII[2]] = HARVESTING;
        cArray[c.lllIIllIIIII[3]] = STARTING;
        cArray[c.lllIIllIIIII[4]] = INSPECTING;
        cArray[c.lllIIllIIIII[5]] = IDLE;
        $VALUES = cArray;
    }

    public static c[] values() {
        return (c[])$VALUES.clone();
    }
}

