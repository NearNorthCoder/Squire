/*
 * Decompiled with CFR 0.152.
 */
package e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class w
extends Enum<w> {
    /* synthetic */ String name;
    private static /* synthetic */ int[] lllIIIIlIIIl;
    public static final /* synthetic */ /* enum */ w NONE;
    private static final /* synthetic */ w[] $VALUES;
    public static final /* synthetic */ /* enum */ w HALLOWED_HAMMER;
    private static /* synthetic */ String[] lllIIIIIllll;
    public static final /* synthetic */ /* enum */ w HAMMER;

    private static void lIIIlIIIIlIllII() {
        lllIIIIIllll = new String[lllIIIIlIIIl[6]];
        w.lllIIIIIllll[w.lllIIIIlIIIl[0]] = w."NONE";
        w.lllIIIIIllll[w.lllIIIIlIIIl[1]] = w."";
        w.lllIIIIIllll[w.lllIIIIlIIIl[2]] = w."HAMMER";
        w.lllIIIIIllll[w.lllIIIIlIIIl[3]] = w."Hammer";
        w.lllIIIIIllll[w.lllIIIIlIIIl[4]] = w."HALLOWED_HAMMER";
        w.lllIIIIIllll[w.lllIIIIlIIIl[5]] = w."Hallowed hammer";
    }

    private static String lIIIlIIIIlIlIlI(String lllllllllllllllIIlllIIlIIIIllllI, String lllllllllllllllIIlllIIlIIIIlllIl) {
        try {
            SecretKeySpec lllllllllllllllIIlllIIlIIIlIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlllIIlIIIIlllIl.getBytes(StandardCharsets.UTF_8)), lllIIIIlIIIl[7]), "DES");
            Cipher lllllllllllllllIIlllIIlIIIlIIIlI = Cipher.getInstance("DES");
            lllllllllllllllIIlllIIlIIIlIIIlI.init(lllIIIIlIIIl[2], lllllllllllllllIIlllIIlIIIlIIIll);
            return new String(lllllllllllllllIIlllIIlIIIlIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlllIIlIIIIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlllIIlIIIlIIIIl) {
            lllllllllllllllIIlllIIlIIIlIIIIl.printStackTrace();
            return null;
        }
    }

    static {
        w.lIIIlIIIIlllIIl();
        w.lIIIlIIIIlIllII();
        NONE = new w(lllIIIIIllll[lllIIIIlIIIl[1]]);
        HAMMER = new w(lllIIIIIllll[lllIIIIlIIIl[3]]);
        HALLOWED_HAMMER = new w(lllIIIIIllll[lllIIIIlIIIl[5]]);
        w[] wArray = new w[lllIIIIlIIIl[3]];
        wArray[w.lllIIIIlIIIl[0]] = NONE;
        wArray[w.lllIIIIlIIIl[1]] = HAMMER;
        wArray[w.lllIIIIlIIIl[2]] = HALLOWED_HAMMER;
        $VALUES = wArray;
    }

    public static w[] values() {
        return (w[])$VALUES.clone();
    }

    private static String lIIIlIIIIlIlIll(String lllllllllllllllIIlllIIlIIIlIllIl, String lllllllllllllllIIlllIIlIIIlIllII) {
        try {
            SecretKeySpec lllllllllllllllIIlllIIlIIIllIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlllIIlIIIlIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlllIIlIIIlIllll = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlllIIlIIIlIllll.init(lllIIIIlIIIl[2], lllllllllllllllIIlllIIlIIIllIIII);
            return new String(lllllllllllllllIIlllIIlIIIlIllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlllIIlIIIlIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlllIIlIIIlIlllI) {
            lllllllllllllllIIlllIIlIIIlIlllI.printStackTrace();
            return null;
        }
    }

    public static w valueOf(String string) {
        return Enum.valueOf(w.class, string);
    }

    private w(String string2) {
        this.name = string2;
    }

    private static void lIIIlIIIIlllIIl() {
        lllIIIIlIIIl = new int[8];
        w.lllIIIIlIIIl[0] = (0xEF ^ 0xB4) & ~(0x49 ^ 0x12);
        w.lllIIIIlIIIl[1] = 1;
        w.lllIIIIlIIIl[2] = 2;
        w.lllIIIIlIIIl[3] = 3;
        w.lllIIIIlIIIl[4] = 0x80 ^ 0x84;
        w.lllIIIIlIIIl[5] = 0xC6 ^ 0xC3;
        w.lllIIIIlIIIl[6] = 0x4E ^ 0x48;
        w.lllIIIIlIIIl[7] = 0x7C ^ 0x74;
    }
}

