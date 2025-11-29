/*
 * Decompiled with CFR 0.152.
 */
package r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class d
extends Enum<d> {
    private static /* synthetic */ String[] lIlIlIIlIIIIl;
    public static final /* synthetic */ /* enum */ d NOT_ATTACKING;
    public static final /* synthetic */ /* enum */ d DELAYED;
    private static /* synthetic */ int[] lIlIlIIlIIIlI;
    private static final /* synthetic */ d[] $VALUES;

    private static void lIllllIllIllllI() {
        lIlIlIIlIIIIl = new String[lIlIlIIlIIIlI[2]];
        d.lIlIlIIlIIIIl[d.lIlIlIIlIIIlI[0]] = d."NOT_ATTACKING";
        d.lIlIlIIlIIIIl[d.lIlIlIIlIIIlI[1]] = d."DELAYED";
    }

    public static d[] values() {
        return (d[])$VALUES.clone();
    }

    static {
        d.lIllllIllIlllll();
        d.lIllllIllIllllI();
        NOT_ATTACKING = new d();
        DELAYED = new d();
        d[] dArray = new d[lIlIlIIlIIIlI[2]];
        dArray[d.lIlIlIIlIIIlI[0]] = NOT_ATTACKING;
        dArray[d.lIlIlIIlIIIlI[1]] = DELAYED;
        $VALUES = dArray;
    }

    private static String lIllllIllIlllIl(String llllllllllllllIllIlIllllllIllIIl, String llllllllllllllIllIlIllllllIllIII) {
        try {
            SecretKeySpec llllllllllllllIllIlIllllllIlllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIllllllIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIlIllllllIllIll = Cipher.getInstance("Blowfish");
            llllllllllllllIllIlIllllllIllIll.init(lIlIlIIlIIIlI[2], llllllllllllllIllIlIllllllIlllII);
            return new String(llllllllllllllIllIlIllllllIllIll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIllllllIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlIllllllIllIlI) {
            llllllllllllllIllIlIllllllIllIlI.printStackTrace();
            return null;
        }
    }

    public static d valueOf(String string) {
        return Enum.valueOf(d.class, string);
    }

    private static boolean lIllllIlllIIIII(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIllllIllIlllII(String llllllllllllllIllIlIlllllllIlIIl, String llllllllllllllIllIlIlllllllIlIII) {
        llllllllllllllIllIlIlllllllIlIIl = new String(Base64.getDecoder().decode(llllllllllllllIllIlIlllllllIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIlIlllllllIllII = new StringBuilder();
        char[] llllllllllllllIllIlIlllllllIlIll = llllllllllllllIllIlIlllllllIlIII.toCharArray();
        int llllllllllllllIllIlIlllllllIlIlI = lIlIlIIlIIIlI[0];
        char[] llllllllllllllIllIlIlllllllIIlII = llllllllllllllIllIlIlllllllIlIIl.toCharArray();
        int llllllllllllllIllIlIlllllllIIIll = llllllllllllllIllIlIlllllllIIlII.length;
        int llllllllllllllIllIlIlllllllIIIlI = lIlIlIIlIIIlI[0];
        while (d.lIllllIlllIIIII(llllllllllllllIllIlIlllllllIIIlI, llllllllllllllIllIlIlllllllIIIll)) {
            char llllllllllllllIllIlIlllllllIllll = llllllllllllllIllIlIlllllllIIlII[llllllllllllllIllIlIlllllllIIIlI];
            llllllllllllllIllIlIlllllllIllII.append((char)(llllllllllllllIllIlIlllllllIllll ^ llllllllllllllIllIlIlllllllIlIll[llllllllllllllIllIlIlllllllIlIlI % llllllllllllllIllIlIlllllllIlIll.length]));
            0;
            ++llllllllllllllIllIlIlllllllIlIlI;
            ++llllllllllllllIllIlIlllllllIIIlI;
            0;
            if (-3 <= 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIlIlllllllIllII);
    }

    private static void lIllllIllIlllll() {
        lIlIlIIlIIIlI = new int[3];
        d.lIlIlIIlIIIlI[0] = (0xAC ^ 0x97) & ~(0x2C ^ 0x17);
        d.lIlIlIIlIIIlI[1] = 1;
        d.lIlIlIIlIIIlI[2] = 2;
    }
}

