/*
 * Decompiled with CFR 0.152.
 */
package a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class c
extends Enum<c> {
    private static /* synthetic */ String[] lIIllIIIlIIl;
    public static final /* synthetic */ /* enum */ c STEEL;
    public static final /* synthetic */ /* enum */ c ADAMANTITE;
    public static final /* synthetic */ /* enum */ c RUNITE;
    public static final /* synthetic */ /* enum */ c GOLD;
    private static final /* synthetic */ c[] $VALUES;
    private static /* synthetic */ int[] lIIllIIIlIlI;
    public static final /* synthetic */ /* enum */ c MITHRIL;

    static {
        c.llIIlllIIIIllI();
        c.llIIlllIIIIlIl();
        STEEL = new c();
        GOLD = new c();
        MITHRIL = new c();
        ADAMANTITE = new c();
        RUNITE = new c();
        c[] cArray = new c[lIIllIIIlIlI[5]];
        cArray[c.lIIllIIIlIlI[0]] = STEEL;
        cArray[c.lIIllIIIlIlI[1]] = GOLD;
        cArray[c.lIIllIIIlIlI[2]] = MITHRIL;
        cArray[c.lIIllIIIlIlI[3]] = ADAMANTITE;
        cArray[c.lIIllIIIlIlI[4]] = RUNITE;
        $VALUES = cArray;
    }

    private static String llIIlllIIIIlII(String lllllllllllllllIlllIlllllllIIIll, String lllllllllllllllIlllIlllllllIIlII) {
        try {
            SecretKeySpec lllllllllllllllIlllIlllllllIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlllllllIIlII.getBytes(StandardCharsets.UTF_8)), lIIllIIIlIlI[6]), "DES");
            Cipher lllllllllllllllIlllIlllllllIIlll = Cipher.getInstance("DES");
            lllllllllllllllIlllIlllllllIIlll.init(lIIllIIIlIlI[2], lllllllllllllllIlllIlllllllIlIII);
            return new String(lllllllllllllllIlllIlllllllIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlllllllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIlllllllIIllI) {
            lllllllllllllllIlllIlllllllIIllI.printStackTrace();
            return null;
        }
    }

    private static void llIIlllIIIIllI() {
        lIIllIIIlIlI = new int[7];
        c.lIIllIIIlIlI[0] = (5 ^ 0x66) & ~(0x4A ^ 0x29);
        c.lIIllIIIlIlI[1] = 1;
        c.lIIllIIIlIlI[2] = 2;
        c.lIIllIIIlIlI[3] = 3;
        c.lIIllIIIlIlI[4] = 0x21 ^ 0x25;
        c.lIIllIIIlIlI[5] = 0x3E ^ 0x10 ^ (0x5E ^ 0x75);
        c.lIIllIIIlIlI[6] = 0x71 ^ 6 ^ 23 + 49 - -11 + 44;
    }

    public static c valueOf(String string) {
        return Enum.valueOf(c.class, string);
    }

    public static c[] values() {
        return (c[])$VALUES.clone();
    }

    private static String llIIlllIIIIIll(String lllllllllllllllIlllIllllllIlIllI, String lllllllllllllllIlllIllllllIlIlll) {
        try {
            SecretKeySpec lllllllllllllllIlllIllllllIllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIllllllIlIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlllIllllllIllIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlllIllllllIllIlI.init(lIIllIIIlIlI[2], lllllllllllllllIlllIllllllIllIll);
            return new String(lllllllllllllllIlllIllllllIllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIllllllIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIllllllIllIIl) {
            lllllllllllllllIlllIllllllIllIIl.printStackTrace();
            return null;
        }
    }

    private static void llIIlllIIIIlIl() {
        lIIllIIIlIIl = new String[lIIllIIIlIlI[5]];
        c.lIIllIIIlIIl[c.lIIllIIIlIlI[0]] = c."STEEL";
        c.lIIllIIIlIIl[c.lIIllIIIlIlI[1]] = c."GOLD";
        c.lIIllIIIlIIl[c.lIIllIIIlIlI[2]] = c."MITHRIL";
        c.lIIllIIIlIIl[c.lIIllIIIlIlI[3]] = c."ADAMANTITE";
        c.lIIllIIIlIIl[c.lIIllIIIlIlI[4]] = c."RUNITE";
    }
}

