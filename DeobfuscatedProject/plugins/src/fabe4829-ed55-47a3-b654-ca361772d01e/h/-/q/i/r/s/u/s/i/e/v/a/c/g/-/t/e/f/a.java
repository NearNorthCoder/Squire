/*
 * Decompiled with CFR 0.152.
 */
package h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class a
extends Enum<a> {
    public static final /* synthetic */ /* enum */ a MELEE;
    public static final /* synthetic */ /* enum */ a RANGED;
    public static final /* synthetic */ /* enum */ a MAGIC;
    private static /* synthetic */ String[] llIIlIIIIlll;
    private static final /* synthetic */ a[] $VALUES;
    private static /* synthetic */ int[] llIIlIIIlIII;
    public static final /* synthetic */ /* enum */ a MIXED;

    static {
        a.lllllIIIIlIIIl();
        a.lllllIIIIlIIII();
        MELEE = new a();
        RANGED = new a();
        MAGIC = new a();
        MIXED = new a();
        a[] aArray = new a[llIIlIIIlIII[4]];
        aArray[a.llIIlIIIlIII[0]] = MELEE;
        aArray[a.llIIlIIIlIII[1]] = RANGED;
        aArray[a.llIIlIIIlIII[2]] = MAGIC;
        aArray[a.llIIlIIIlIII[3]] = MIXED;
        $VALUES = aArray;
    }

    public static a valueOf(String string) {
        return Enum.valueOf(a.class, string);
    }

    private static void lllllIIIIlIIII() {
        llIIlIIIIlll = new String[llIIlIIIlIII[4]];
        a.llIIlIIIIlll[a.llIIlIIIlIII[0]] = a.lllllIIIIIllIl("c/8If96KM4s=", "iTkvS");
        a.llIIlIIIIlll[a.llIIlIIIlIII[1]] = a.lllllIIIIIlllI("Wx3Ft7N1fcM=", "GZrWS");
        a.llIIlIIIIlll[a.llIIlIIIlIII[2]] = a.lllllIIIIIlllI("EYE5kQhCOn0=", "kkhdJ");
        a.llIIlIIIIlll[a.llIIlIIIlIII[3]] = a.lllllIIIIIllll("PgwuMhU=", "sEvwQ");
    }

    private static String lllllIIIIIlllI(String lllllllllllllllIlIIllllllIIllllI, String lllllllllllllllIlIIllllllIIlllIl) {
        try {
            SecretKeySpec lllllllllllllllIlIIllllllIlIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllllllIIlllIl.getBytes(StandardCharsets.UTF_8)), llIIlIIIlIII[5]), "DES");
            Cipher lllllllllllllllIlIIllllllIlIIIlI = Cipher.getInstance("DES");
            lllllllllllllllIlIIllllllIlIIIlI.init(llIIlIIIlIII[2], lllllllllllllllIlIIllllllIlIIIll);
            return new String(lllllllllllllllIlIIllllllIlIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllllllIIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIllllllIlIIIIl) {
            lllllllllllllllIlIIllllllIlIIIIl.printStackTrace();
            return null;
        }
    }

    public static a[] values() {
        return (a[])$VALUES.clone();
    }

    private static String lllllIIIIIllIl(String lllllllllllllllIlIIllllllIlIlIll, String lllllllllllllllIlIIllllllIlIllII) {
        try {
            SecretKeySpec lllllllllllllllIlIIllllllIllIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllllllIlIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIllllllIlIllll = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIllllllIlIllll.init(llIIlIIIlIII[2], lllllllllllllllIlIIllllllIllIIII);
            return new String(lllllllllllllllIlIIllllllIlIllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllllllIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIllllllIlIlllI) {
            lllllllllllllllIlIIllllllIlIlllI.printStackTrace();
            return null;
        }
    }

    private static void lllllIIIIlIIIl() {
        llIIlIIIlIII = new int[6];
        a.llIIlIIIlIII[0] = (0xDD ^ 0x99 ^ (0x97 ^ 0x91)) & (4 + 2 - -239 + 8 ^ 45 + 140 - 7 + 13 ^ -" ".length());
        a.llIIlIIIlIII[1] = " ".length();
        a.llIIlIIIlIII[2] = "  ".length();
        a.llIIlIIIlIII[3] = "   ".length();
        a.llIIlIIIlIII[4] = 0xA1 ^ 0xBF ^ (0x3E ^ 0x24);
        a.llIIlIIIlIII[5] = 5 ^ 0xD;
    }

    private static String lllllIIIIIllll(String lllllllllllllllIlIIlllllllIIIIlI, String lllllllllllllllIlIIllllllIllllII) {
        lllllllllllllllIlIIlllllllIIIIlI = new String(Base64.getDecoder().decode(lllllllllllllllIlIIlllllllIIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIlllllllIIIIII = new StringBuilder();
        char[] lllllllllllllllIlIIllllllIllllll = lllllllllllllllIlIIllllllIllllII.toCharArray();
        int lllllllllllllllIlIIllllllIlllllI = llIIlIIIlIII[0];
        char[] lllllllllllllllIlIIllllllIlllIII = lllllllllllllllIlIIlllllllIIIIlI.toCharArray();
        int lllllllllllllllIlIIllllllIllIlll = lllllllllllllllIlIIllllllIlllIII.length;
        int lllllllllllllllIlIIllllllIllIllI = llIIlIIIlIII[0];
        while (a.lllllIIIIlIIlI(lllllllllllllllIlIIllllllIllIllI, lllllllllllllllIlIIllllllIllIlll)) {
            char lllllllllllllllIlIIlllllllIIIIll = lllllllllllllllIlIIllllllIlllIII[lllllllllllllllIlIIllllllIllIllI];
            lllllllllllllllIlIIlllllllIIIIII.append((char)(lllllllllllllllIlIIlllllllIIIIll ^ lllllllllllllllIlIIllllllIllllll[lllllllllllllllIlIIllllllIlllllI % lllllllllllllllIlIIllllllIllllll.length]));
            "".length();
            ++lllllllllllllllIlIIllllllIlllllI;
            ++lllllllllllllllIlIIllllllIllIllI;
            "".length();
            if ((0x24 ^ 0x20) >= (0x8F ^ 0x8B)) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIIlllllllIIIIII);
    }

    private static boolean lllllIIIIlIIlI(int n2, int n3) {
        return n2 < n3;
    }
}

