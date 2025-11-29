/*
 * Decompiled with CFR 0.152.
 */
package l.-.-.n.s.s.i.e.r.q.p.o.c.o.t.u.r.e.t;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class d
extends Enum<d> {
    private static /* synthetic */ int[] lIIIlIlIIlIII;
    private static final /* synthetic */ d[] $VALUES;
    private static /* synthetic */ String[] lIIIlIlIIIlll;
    public static final /* synthetic */ /* enum */ d WEST;
    public static final /* synthetic */ /* enum */ d SOUTH;
    public static final /* synthetic */ /* enum */ d EAST;
    /* synthetic */ String direction;

    private static String lIIlllllllIIIII(String lllllllllllllllIIIIlllIIlllIllIl, String lllllllllllllllIIIIlllIIllllIIIl) {
        lllllllllllllllIIIIlllIIlllIllIl = new String(Base64.getDecoder().decode(lllllllllllllllIIIIlllIIlllIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIIlllIIllllIIII = new StringBuilder();
        char[] lllllllllllllllIIIIlllIIlllIllll = lllllllllllllllIIIIlllIIllllIIIl.toCharArray();
        int lllllllllllllllIIIIlllIIlllIlllI = lIIIlIlIIlIII[0];
        char[] lllllllllllllllIIIIlllIIlllIlIII = lllllllllllllllIIIIlllIIlllIllIl.toCharArray();
        int lllllllllllllllIIIIlllIIlllIIlll = lllllllllllllllIIIIlllIIlllIlIII.length;
        int lllllllllllllllIIIIlllIIlllIIllI = lIIIlIlIIlIII[0];
        while (d.lIIlllllllIIlIl(lllllllllllllllIIIIlllIIlllIIllI, lllllllllllllllIIIIlllIIlllIIlll)) {
            char lllllllllllllllIIIIlllIIllllIIll = lllllllllllllllIIIIlllIIlllIlIII[lllllllllllllllIIIIlllIIlllIIllI];
            lllllllllllllllIIIIlllIIllllIIII.append((char)(lllllllllllllllIIIIlllIIllllIIll ^ lllllllllllllllIIIIlllIIlllIllll[lllllllllllllllIIIIlllIIlllIlllI % lllllllllllllllIIIIlllIIlllIllll.length]));
            0;
            ++lllllllllllllllIIIIlllIIlllIlllI;
            ++lllllllllllllllIIIIlllIIlllIIllI;
            0;
            if (((0x1A ^ 3 ^ (0x6F ^ 0x79)) & (105 + 40 - -12 + 15 ^ 37 + 147 - 122 + 101 ^ -1)) < (61 + 105 - 131 + 114 ^ 132 + 95 - 192 + 110)) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIIIlllIIllllIIII);
    }

    private static String lIIlllllllIIIIl(String lllllllllllllllIIIIlllIlIIIIIIII, String lllllllllllllllIIIIlllIIllllllll) {
        try {
            SecretKeySpec lllllllllllllllIIIIlllIlIIIIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlllIIllllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIIlllIlIIIIIlII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIIlllIlIIIIIlII.init(lIIIlIlIIlIII[2], lllllllllllllllIIIIlllIlIIIIIlIl);
            return new String(lllllllllllllllIIIIlllIlIIIIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlllIlIIIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIIlllIlIIIIIIll) {
            lllllllllllllllIIIIlllIlIIIIIIll.printStackTrace();
            return null;
        }
    }

    private d(String string2) {
        this.direction = string2;
    }

    private static void lIIlllllllIIlII() {
        lIIIlIlIIlIII = new int[8];
        d.lIIIlIlIIlIII[0] = (0xBC ^ 0xAE ^ (0xC7 ^ 0x94)) & (0x43 ^ 0x78 ^ (0x59 ^ 0x23) ^ -1);
        d.lIIIlIlIIlIII[1] = 1;
        d.lIIIlIlIIlIII[2] = 2;
        d.lIIIlIlIIlIII[3] = 3;
        d.lIIIlIlIIlIII[4] = 0x49 ^ 0x4D;
        d.lIIIlIlIIlIII[5] = 0x24 ^ 0x48 ^ (0x11 ^ 0x78);
        d.lIIIlIlIIlIII[6] = 0x99 ^ 0x9F;
        d.lIIIlIlIIlIII[7] = 0x25 ^ 0x2D;
    }

    public static d valueOf(String string) {
        return Enum.valueOf(d.class, string);
    }

    static {
        d.lIIlllllllIIlII();
        d.lIIlllllllIIIll();
        EAST = new d(lIIIlIlIIIlll[lIIIlIlIIlIII[1]]);
        WEST = new d(lIIIlIlIIIlll[lIIIlIlIIlIII[3]]);
        SOUTH = new d(lIIIlIlIIIlll[lIIIlIlIIlIII[5]]);
        d[] dArray = new d[lIIIlIlIIlIII[3]];
        dArray[d.lIIIlIlIIlIII[0]] = EAST;
        dArray[d.lIIIlIlIIlIII[1]] = WEST;
        dArray[d.lIIIlIlIIlIII[2]] = SOUTH;
        $VALUES = dArray;
    }

    public static d[] values() {
        return (d[])$VALUES.clone();
    }

    private static void lIIlllllllIIIll() {
        lIIIlIlIIIlll = new String[lIIIlIlIIlIII[6]];
        d.lIIIlIlIIIlll[d.lIIIlIlIIlIII[0]] = d."EAST";
        d.lIIIlIlIIIlll[d.lIIIlIlIIlIII[1]] = d."East";
        d.lIIIlIlIIIlll[d.lIIIlIlIIlIII[2]] = d."WEST";
        d.lIIIlIlIIIlll[d.lIIIlIlIIlIII[3]] = d."West";
        d.lIIIlIlIIIlll[d.lIIIlIlIIlIII[4]] = d."SOUTH";
        d.lIIIlIlIIIlll[d.lIIIlIlIIlIII[5]] = d."South";
    }

    private static boolean lIIlllllllIIlIl(int n, int n2) {
        return n < n2;
    }

    public String n() {
        return this.direction;
    }

    private static String lIIlllllllIIIlI(String lllllllllllllllIIIIlllIlIIIIllll, String lllllllllllllllIIIIlllIlIIIIlllI) {
        try {
            SecretKeySpec lllllllllllllllIIIIlllIlIIIlIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlllIlIIIIlllI.getBytes(StandardCharsets.UTF_8)), lIIIlIlIIlIII[7]), "DES");
            Cipher lllllllllllllllIIIIlllIlIIIlIIIl = Cipher.getInstance("DES");
            lllllllllllllllIIIIlllIlIIIlIIIl.init(lIIIlIlIIlIII[2], lllllllllllllllIIIIlllIlIIIlIIlI);
            return new String(lllllllllllllllIIIIlllIlIIIlIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlllIlIIIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIIlllIlIIIlIIII) {
            lllllllllllllllIIIIlllIlIIIlIIII.printStackTrace();
            return null;
        }
    }
}

