/*
 * Decompiled with CFR 0.152.
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class x
extends Enum<x> {
    public static final /* synthetic */ /* enum */ x RANGE;
    public static final /* synthetic */ /* enum */ x MAGE;
    private static final /* synthetic */ x[] $VALUES;
    public static final /* synthetic */ /* enum */ x MELEE;
    private static /* synthetic */ int[] llIlIIlIlIl;
    private static /* synthetic */ String[] llIlIIlIlII;

    public static x[] values() {
        return (x[])$VALUES.clone();
    }

    private static String lIlIIlIlIllIlI(String llllllllllllllllIIllIllIlIIIllIl, String llllllllllllllllIIllIllIlIIIllII) {
        try {
            SecretKeySpec llllllllllllllllIIllIllIlIIlIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllIllIlIIIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIllIllIlIIIllll = Cipher.getInstance("Blowfish");
            llllllllllllllllIIllIllIlIIIllll.init(llIlIIlIlIl[2], llllllllllllllllIIllIllIlIIlIIII);
            return new String(llllllllllllllllIIllIllIlIIIllll.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllIllIlIIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIllIllIlIIIlllI) {
            llllllllllllllllIIllIllIlIIIlllI.printStackTrace();
            return null;
        }
    }

    private static void lIlIIlIlIlllIl() {
        llIlIIlIlIl = new int[4];
        x.llIlIIlIlIl[0] = (0x26 ^ 0x19 ^ (0x8C ^ 0x99)) & ((0xBB ^ 0x81) & ~(0 ^ 0x3A) ^ (0x31 ^ 0x1B) ^ -1);
        x.llIlIIlIlIl[1] = 1;
        x.llIlIIlIlIl[2] = 2;
        x.llIlIIlIlIl[3] = 3;
    }

    static {
        x.lIlIIlIlIlllIl();
        x.lIlIIlIlIlllII();
        RANGE = new x();
        MAGE = new x();
        MELEE = new x();
        x[] xArray = new x[llIlIIlIlIl[3]];
        xArray[x.llIlIIlIlIl[0]] = RANGE;
        xArray[x.llIlIIlIlIl[1]] = MAGE;
        xArray[x.llIlIIlIlIl[2]] = MELEE;
        $VALUES = xArray;
    }

    private static void lIlIIlIlIlllII() {
        llIlIIlIlII = new String[llIlIIlIlIl[3]];
        x.llIlIIlIlII[x.llIlIIlIlIl[0]] = x."RANGE";
        x.llIlIIlIlII[x.llIlIIlIlIl[1]] = x."MAGE";
        x.llIlIIlIlII[x.llIlIIlIlIl[2]] = x."MELEE";
    }

    private static String lIlIIlIlIllIll(String llllllllllllllllIIllIllIlIIlllIl, String llllllllllllllllIIllIllIlIIlllII) {
        llllllllllllllllIIllIllIlIIlllIl = new String(Base64.getDecoder().decode(llllllllllllllllIIllIllIlIIlllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIllIllIlIlIIIII = new StringBuilder();
        char[] llllllllllllllllIIllIllIlIIlllll = llllllllllllllllIIllIllIlIIlllII.toCharArray();
        int llllllllllllllllIIllIllIlIIllllI = llIlIIlIlIl[0];
        char[] llllllllllllllllIIllIllIlIIllIII = llllllllllllllllIIllIllIlIIlllIl.toCharArray();
        int llllllllllllllllIIllIllIlIIlIlll = llllllllllllllllIIllIllIlIIllIII.length;
        int llllllllllllllllIIllIllIlIIlIllI = llIlIIlIlIl[0];
        while (x.lIlIIlIlIllllI(llllllllllllllllIIllIllIlIIlIllI, llllllllllllllllIIllIllIlIIlIlll)) {
            char llllllllllllllllIIllIllIlIlIIIll = llllllllllllllllIIllIllIlIIllIII[llllllllllllllllIIllIllIlIIlIllI];
            llllllllllllllllIIllIllIlIlIIIII.append((char)(llllllllllllllllIIllIllIlIlIIIll ^ llllllllllllllllIIllIllIlIIlllll[llllllllllllllllIIllIllIlIIllllI % llllllllllllllllIIllIllIlIIlllll.length]));
            0;
            ++llllllllllllllllIIllIllIlIIllllI;
            ++llllllllllllllllIIllIllIlIIlIllI;
            0;
            if (null == null) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIllIllIlIlIIIII);
    }

    public static x valueOf(String string) {
        return Enum.valueOf(x.class, string);
    }

    private static boolean lIlIIlIlIllllI(int n2, int n3) {
        return n2 < n3;
    }
}

