/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;

public final class t
extends Enum<t> {
    public static final /* synthetic */ /* enum */ t AUGURY;
    public static final /* synthetic */ /* enum */ t MYSTIC_MIGHT;
    private static /* synthetic */ int[] lIllIlIllIl;
    private static final /* synthetic */ t[] $VALUES;
    private final /* synthetic */ Prayer mapped;
    private static /* synthetic */ String[] lIllIlIllII;

    private static String lIIlIlllIlIIll(String llllllllllllllllIlIlIIIlIlIllIII, String llllllllllllllllIlIlIIIlIlIlIlll) {
        try {
            SecretKeySpec llllllllllllllllIlIlIIIlIlIlllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlIIIlIlIlIlll.getBytes(StandardCharsets.UTF_8)), lIllIlIllIl[3]), "DES");
            Cipher llllllllllllllllIlIlIIIlIlIlllII = Cipher.getInstance("DES");
            llllllllllllllllIlIlIIIlIlIlllII.init(lIllIlIllIl[2], llllllllllllllllIlIlIIIlIlIlllIl);
            return new String(llllllllllllllllIlIlIIIlIlIlllII.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlIIIlIlIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIlIIIlIlIllIll) {
            llllllllllllllllIlIlIIIlIlIllIll.printStackTrace();
            return null;
        }
    }

    public static t[] values() {
        return (t[])$VALUES.clone();
    }

    private t(Prayer prayer) {
        this.mapped = prayer;
    }

    static {
        t.lIIlIlllIlIlIl();
        t.lIIlIlllIlIlII();
        AUGURY = new t(Prayer.AUGURY);
        MYSTIC_MIGHT = new t(Prayer.MYSTIC_MIGHT);
        t[] tArray = new t[lIllIlIllIl[2]];
        tArray[t.lIllIlIllIl[0]] = AUGURY;
        tArray[t.lIllIlIllIl[1]] = MYSTIC_MIGHT;
        $VALUES = tArray;
    }

    private static String lIIlIlllIlIIlI(String llllllllllllllllIlIlIIIlIlIIllIl, String llllllllllllllllIlIlIIIlIlIIllII) {
        try {
            SecretKeySpec llllllllllllllllIlIlIIIlIlIlIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlIIIlIlIIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIlIlIIIlIlIIllll = Cipher.getInstance("Blowfish");
            llllllllllllllllIlIlIIIlIlIIllll.init(lIllIlIllIl[2], llllllllllllllllIlIlIIIlIlIlIIII);
            return new String(llllllllllllllllIlIlIIIlIlIIllll.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlIIIlIlIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIlIIIlIlIIlllI) {
            llllllllllllllllIlIlIIIlIlIIlllI.printStackTrace();
            return null;
        }
    }

    private static void lIIlIlllIlIlII() {
        lIllIlIllII = new String[lIllIlIllIl[2]];
        t.lIllIlIllII[t.lIllIlIllIl[0]] = t."AUGURY";
        t.lIllIlIllII[t.lIllIlIllIl[1]] = t."MYSTIC_MIGHT";
    }

    public Prayer ag() {
        return this.mapped;
    }

    private static void lIIlIlllIlIlIl() {
        lIllIlIllIl = new int[4];
        t.lIllIlIllIl[0] = (0x63 ^ 0x59) & ~(0x54 ^ 0x6E);
        t.lIllIlIllIl[1] = 1;
        t.lIllIlIllIl[2] = 2;
        t.lIllIlIllIl[3] = 0x5D ^ 0x55;
    }

    public static t valueOf(String string) {
        return Enum.valueOf(t.class, string);
    }
}

