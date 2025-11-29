/*
 * Decompiled with CFR 0.152.
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

final class aW
extends Enum<aW> {
    private static final /* synthetic */ aW[] $VALUES;
    public static final /* synthetic */ /* enum */ aW VENTS;
    public static final /* synthetic */ /* enum */ aW PILLARS;
    private static /* synthetic */ String[] lIllIllIIIl;
    private static /* synthetic */ int[] lIllIllIIlI;

    static {
        aW.lIIlIllllIIlll();
        aW.lIIlIllllIIllI();
        PILLARS = new aW();
        VENTS = new aW();
        aW[] aWArray = new aW[lIllIllIIlI[2]];
        aWArray[aW.lIllIllIIlI[0]] = PILLARS;
        aWArray[aW.lIllIllIIlI[1]] = VENTS;
        $VALUES = aWArray;
    }

    public static aW[] values() {
        return (aW[])$VALUES.clone();
    }

    private static void lIIlIllllIIlll() {
        lIllIllIIlI = new int[4];
        aW.lIllIllIIlI[0] = (0x11 ^ 0x2F ^ (0x58 ^ 0x6C)) & (0xC4 ^ 0x8A ^ (0x55 ^ 0x11) ^ -1);
        aW.lIllIllIIlI[1] = 1;
        aW.lIllIllIIlI[2] = 2;
        aW.lIllIllIIlI[3] = 106 + 126 - 218 + 123 ^ 98 + 41 - 19 + 9;
    }

    private static void lIIlIllllIIllI() {
        lIllIllIIIl = new String[lIllIllIIlI[2]];
        aW.lIllIllIIIl[aW.lIllIllIIlI[0]] = aW."PILLARS";
        aW.lIllIllIIIl[aW.lIllIllIIlI[1]] = aW."VENTS";
    }

    private static String lIIlIllllIIlIl(String llllllllllllllllIlIlIIIIllIIIIlI, String llllllllllllllllIlIlIIIIlIllllll) {
        try {
            SecretKeySpec llllllllllllllllIlIlIIIIllIIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlIIIIlIllllll.getBytes(StandardCharsets.UTF_8)), lIllIllIIlI[3]), "DES");
            Cipher llllllllllllllllIlIlIIIIllIIIlII = Cipher.getInstance("DES");
            llllllllllllllllIlIlIIIIllIIIlII.init(lIllIllIIlI[2], llllllllllllllllIlIlIIIIllIIIlIl);
            return new String(llllllllllllllllIlIlIIIIllIIIlII.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlIIIIllIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIlIIIIllIIIIll) {
            llllllllllllllllIlIlIIIIllIIIIll.printStackTrace();
            return null;
        }
    }

    public static aW valueOf(String string) {
        return Enum.valueOf(aW.class, string);
    }
}

