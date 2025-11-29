/*
 * Decompiled with CFR 0.152.
 */
package s.l.l.r.o.q.-.a.i.g.i.r.u.e.s;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class d
extends Enum<d> {
    private static /* synthetic */ String[] llIIlIllIlIl;
    public static final /* synthetic */ /* enum */ d MAGIC;
    public static final /* synthetic */ /* enum */ d RANGED;
    private static final /* synthetic */ d[] $VALUES;
    private static /* synthetic */ int[] llIIlIllIllI;
    public static final /* synthetic */ /* enum */ d MELEE;
    public static final /* synthetic */ /* enum */ d BOULDER;

    private static boolean lllllIlllIIIII(int n2, int n3) {
        return n2 < n3;
    }

    static {
        d.lllllIllIlllll();
        d.lllllIllIllllI();
        MAGIC = new d();
        RANGED = new d();
        MELEE = new d();
        BOULDER = new d();
        d[] dArray = new d[llIIlIllIllI[4]];
        dArray[d.llIIlIllIllI[0]] = MAGIC;
        dArray[d.llIIlIllIllI[1]] = RANGED;
        dArray[d.llIIlIllIllI[2]] = MELEE;
        dArray[d.llIIlIllIllI[3]] = BOULDER;
        $VALUES = dArray;
    }

    public static d[] values() {
        return (d[])$VALUES.clone();
    }

    public static d valueOf(String string) {
        return Enum.valueOf(d.class, string);
    }

    private static String lllllIllIlllII(String lllllllllllllllIlIIlllIllIIIIllI, String lllllllllllllllIlIIlllIllIIIIlIl) {
        try {
            SecretKeySpec lllllllllllllllIlIIlllIllIIIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlllIllIIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIlllIllIIIlIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIlllIllIIIlIlI.init(llIIlIllIllI[2], lllllllllllllllIlIIlllIllIIIlIll);
            return new String(lllllllllllllllIlIIlllIllIIIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlllIllIIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIlllIllIIIlIIl) {
            lllllllllllllllIlIIlllIllIIIlIIl.printStackTrace();
            return null;
        }
    }

    private static String lllllIllIlllIl(String lllllllllllllllIlIIlllIllIlIllIl, String lllllllllllllllIlIIlllIllIlIllII) {
        try {
            SecretKeySpec lllllllllllllllIlIIlllIllIllIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlllIllIlIllII.getBytes(StandardCharsets.UTF_8)), llIIlIllIllI[5]), "DES");
            Cipher lllllllllllllllIlIIlllIllIlIllll = Cipher.getInstance("DES");
            lllllllllllllllIlIIlllIllIlIllll.init(llIIlIllIllI[2], lllllllllllllllIlIIlllIllIllIIII);
            return new String(lllllllllllllllIlIIlllIllIlIllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlllIllIlIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIlllIllIlIlllI) {
            lllllllllllllllIlIIlllIllIlIlllI.printStackTrace();
            return null;
        }
    }

    private static void lllllIllIlllll() {
        llIIlIllIllI = new int[6];
        d.llIIlIllIllI[0] = (181 + 200 - 196 + 41 ^ 18 + 31 - -26 + 85) & (0x88 ^ 0x9E ^ (0xF2 ^ 0xA6) ^ -1);
        d.llIIlIllIllI[1] = 1;
        d.llIIlIllIllI[2] = 2;
        d.llIIlIllIllI[3] = 3;
        d.llIIlIllIllI[4] = 0xA8 ^ 0xAC;
        d.llIIlIllIllI[5] = 0x6B ^ 0x63;
    }

    private static void lllllIllIllllI() {
        llIIlIllIlIl = new String[llIIlIllIllI[4]];
        d.llIIlIllIlIl[d.llIIlIllIllI[0]] = d."MAGIC";
        d.llIIlIllIlIl[d.llIIlIllIllI[1]] = d."RANGED";
        d.llIIlIllIlIl[d.llIIlIllIllI[2]] = d."MELEE";
        d.llIIlIllIlIl[d.llIIlIllIllI[3]] = d."BOULDER";
    }

    private static String lllllIllIllIll(String lllllllllllllllIlIIlllIllIIlllIl, String lllllllllllllllIlIIlllIllIIlllII) {
        lllllllllllllllIlIIlllIllIIlllIl = new String(Base64.getDecoder().decode(lllllllllllllllIlIIlllIllIIlllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIlllIllIIllIll = new StringBuilder();
        char[] lllllllllllllllIlIIlllIllIIllIlI = lllllllllllllllIlIIlllIllIIlllII.toCharArray();
        int lllllllllllllllIlIIlllIllIIllIIl = llIIlIllIllI[0];
        char[] lllllllllllllllIlIIlllIllIIlIIll = lllllllllllllllIlIIlllIllIIlllIl.toCharArray();
        int lllllllllllllllIlIIlllIllIIlIIlI = lllllllllllllllIlIIlllIllIIlIIll.length;
        int lllllllllllllllIlIIlllIllIIlIIIl = llIIlIllIllI[0];
        while (d.lllllIlllIIIII(lllllllllllllllIlIIlllIllIIlIIIl, lllllllllllllllIlIIlllIllIIlIIlI)) {
            char lllllllllllllllIlIIlllIllIIllllI = lllllllllllllllIlIIlllIllIIlIIll[lllllllllllllllIlIIlllIllIIlIIIl];
            lllllllllllllllIlIIlllIllIIllIll.append((char)(lllllllllllllllIlIIlllIllIIllllI ^ lllllllllllllllIlIIlllIllIIllIlI[lllllllllllllllIlIIlllIllIIllIIl % lllllllllllllllIlIIlllIllIIllIlI.length]));
            0;
            ++lllllllllllllllIlIIlllIllIIllIIl;
            ++lllllllllllllllIlIIlllIllIIlIIIl;
            0;
            if (1 >= 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIIlllIllIIllIll);
    }
}

