/*
 * Decompiled with CFR 0.152.
 */
package e.t.r.i.s.h.q.n.r.u.-.u.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class e
extends Enum<e> {
    public static final /* synthetic */ /* enum */ e PITFALL;
    public static final /* synthetic */ /* enum */ e BIRDS;
    private static final /* synthetic */ e[] $VALUES;
    private static /* synthetic */ String[] lllIllIlIllI;
    public static final /* synthetic */ /* enum */ e FALCONRY;
    private static /* synthetic */ int[] lllIllIlIlll;
    public static final /* synthetic */ /* enum */ e SALLIES;
    public static final /* synthetic */ /* enum */ e CHINS;

    static {
        e.lIIIllIlIllIlll();
        e.lIIIllIlIllIllI();
        BIRDS = new e();
        SALLIES = new e();
        FALCONRY = new e();
        CHINS = new e();
        PITFALL = new e();
        e[] eArray = new e[lllIllIlIlll[5]];
        eArray[e.lllIllIlIlll[0]] = BIRDS;
        eArray[e.lllIllIlIlll[1]] = SALLIES;
        eArray[e.lllIllIlIlll[2]] = FALCONRY;
        eArray[e.lllIllIlIlll[3]] = CHINS;
        eArray[e.lllIllIlIlll[4]] = PITFALL;
        $VALUES = eArray;
    }

    public static e valueOf(String string) {
        return Enum.valueOf(e.class, string);
    }

    private static String lIIIllIlIllIlII(String lllllllllllllllIIlIlllIllllIIIlI, String lllllllllllllllIIlIlllIlllIlllll) {
        try {
            SecretKeySpec lllllllllllllllIIlIlllIllllIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlllIlllIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIlllIllllIIlII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIlllIllllIIlII.init(lllIllIlIlll[2], lllllllllllllllIIlIlllIllllIIlIl);
            return new String(lllllllllllllllIIlIlllIllllIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlllIllllIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIlllIllllIIIll) {
            lllllllllllllllIIlIlllIllllIIIll.printStackTrace();
            return null;
        }
    }

    private static String lIIIllIlIllIlIl(String lllllllllllllllIIlIlllIlllIlIlIl, String lllllllllllllllIIlIlllIlllIlIlII) {
        try {
            SecretKeySpec lllllllllllllllIIlIlllIlllIllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlllIlllIlIlII.getBytes(StandardCharsets.UTF_8)), lllIllIlIlll[6]), "DES");
            Cipher lllllllllllllllIIlIlllIlllIlIlll = Cipher.getInstance("DES");
            lllllllllllllllIIlIlllIlllIlIlll.init(lllIllIlIlll[2], lllllllllllllllIIlIlllIlllIllIII);
            return new String(lllllllllllllllIIlIlllIlllIlIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlllIlllIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIlllIlllIlIllI) {
            lllllllllllllllIIlIlllIlllIlIllI.printStackTrace();
            return null;
        }
    }

    public static e[] values() {
        return (e[])$VALUES.clone();
    }

    private static void lIIIllIlIllIllI() {
        lllIllIlIllI = new String[lllIllIlIlll[5]];
        e.lllIllIlIllI[e.lllIllIlIlll[0]] = e."BIRDS";
        e.lllIllIlIllI[e.lllIllIlIlll[1]] = e."SALLIES";
        e.lllIllIlIllI[e.lllIllIlIlll[2]] = e."FALCONRY";
        e.lllIllIlIllI[e.lllIllIlIlll[3]] = e."CHINS";
        e.lllIllIlIllI[e.lllIllIlIlll[4]] = e."PITFALL";
    }

    private static void lIIIllIlIllIlll() {
        lllIllIlIlll = new int[7];
        e.lllIllIlIlll[0] = (0x37 ^ 3) & ~(0x17 ^ 0x23);
        e.lllIllIlIlll[1] = 1;
        e.lllIllIlIlll[2] = 2;
        e.lllIllIlIlll[3] = 3;
        e.lllIllIlIlll[4] = 0x37 ^ 0x33;
        e.lllIllIlIlll[5] = 0x12 ^ 0x17;
        e.lllIllIlIlll[6] = 0xD4 ^ 0x95 ^ (0xEA ^ 0xA3);
    }
}

