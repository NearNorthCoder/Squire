/*
 * Decompiled with CFR 0.152.
 */
package i.v.k.o.-.u.s.e.r.a.q.r.t.h;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class j
extends Enum<j> {
    private static /* synthetic */ String[] lIlIlIlllIllI;
    public static final /* synthetic */ /* enum */ j FREEZE;
    public static final /* synthetic */ /* enum */ j FIRE_BALLS;
    public static final /* synthetic */ /* enum */ j NONE;
    private static final /* synthetic */ j[] $VALUES;
    private static /* synthetic */ int[] lIlIlIlllIlll;

    private static void lIllllllllIllll() {
        lIlIlIlllIlll = new int[5];
        j.lIlIlIlllIlll[0] = (0x8E ^ 0xA2 ^ (0x49 ^ 0x2A)) & (0x99 ^ 0x81 ^ (0x7D ^ 0x2A) ^ -" ".length());
        j.lIlIlIlllIlll[1] = " ".length();
        j.lIlIlIlllIlll[2] = "  ".length();
        j.lIlIlIlllIlll[3] = "   ".length();
        j.lIlIlIlllIlll[4] = 0x1E ^ 0x16;
    }

    private static void lIllllllllIlllI() {
        lIlIlIlllIllI = new String[lIlIlIlllIlll[3]];
        j.lIlIlIlllIllI[j.lIlIlIlllIlll[0]] = j.lIllllllllIllII("FrVJhQ17dIs=", "QqfIR");
        j.lIlIlIlllIllI[j.lIlIlIlllIlll[1]] = j.lIllllllllIllIl("NpIms05+jNaR+sON39a+2A==", "mEQOR");
        j.lIlIlIlllIllI[j.lIlIlIlllIlll[2]] = j.lIllllllllIllIl("8h7QIVIJJ+4=", "nTOth");
    }

    private static String lIllllllllIllIl(String llllllllllllllIllIlIlIIIIllIllIl, String llllllllllllllIllIlIlIIIIllIlIlI) {
        try {
            SecretKeySpec llllllllllllllIllIlIlIIIIlllIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIlIIIIllIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIlIlIIIIllIllll = Cipher.getInstance("Blowfish");
            llllllllllllllIllIlIlIIIIllIllll.init(lIlIlIlllIlll[2], llllllllllllllIllIlIlIIIIlllIIII);
            return new String(llllllllllllllIllIlIlIIIIllIllll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIlIIIIllIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlIlIIIIllIlllI) {
            llllllllllllllIllIlIlIIIIllIlllI.printStackTrace();
            return null;
        }
    }

    static {
        j.lIllllllllIllll();
        j.lIllllllllIlllI();
        NONE = new j();
        FIRE_BALLS = new j();
        FREEZE = new j();
        j[] jArray = new j[lIlIlIlllIlll[3]];
        jArray[j.lIlIlIlllIlll[0]] = NONE;
        jArray[j.lIlIlIlllIlll[1]] = FIRE_BALLS;
        jArray[j.lIlIlIlllIlll[2]] = FREEZE;
        $VALUES = jArray;
    }

    public static j[] values() {
        return (j[])$VALUES.clone();
    }

    private static String lIllllllllIllII(String llllllllllllllIllIlIlIIIIllIIIII, String llllllllllllllIllIlIlIIIIlIlllll) {
        try {
            SecretKeySpec llllllllllllllIllIlIlIIIIllIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIlIIIIlIlllll.getBytes(StandardCharsets.UTF_8)), lIlIlIlllIlll[4]), "DES");
            Cipher llllllllllllllIllIlIlIIIIllIIIlI = Cipher.getInstance("DES");
            llllllllllllllIllIlIlIIIIllIIIlI.init(lIlIlIlllIlll[2], llllllllllllllIllIlIlIIIIllIIIll);
            return new String(llllllllllllllIllIlIlIIIIllIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIlIIIIllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlIlIIIIllIIIIl) {
            llllllllllllllIllIlIlIIIIllIIIIl.printStackTrace();
            return null;
        }
    }

    public static j valueOf(String string) {
        return Enum.valueOf(j.class, string);
    }
}

