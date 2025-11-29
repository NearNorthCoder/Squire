/*
 * Decompiled with CFR 0.152.
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class ABEnum
extends Enum<aB> {
    private static /* synthetic */ String[] lllIIl;
    private static final /* synthetic */ aB[] $VALUES;
    private static /* synthetic */ int[] lllIlI;
    public static final /* synthetic */ /* enum */ aB EXTREME;
    public static final /* synthetic */ /* enum */ aB SOME;
    public static final /* synthetic */ /* enum */ aB NONE;

    public static aB valueOf(String string) {
        return Enum.valueOf(ABEnum.class, string);
    }

    private static void lllIllII() {
        lllIlI = new int[4];
        aB.lllIlI[0] = (0x4E ^ 0x17) & ~(0x56 ^ 0xF);
        aB.lllIlI[1] = 1;
        aB.lllIlI[2] = 2;
        aB.lllIlI[3] = 3;
    }

    static {
        aB.lllIllII();
        aB.lllIlIll();
        NONE = new aB();
        SOME = new aB();
        EXTREME = new aB();
        aB[] aBArray = new aB[lllIlI[3]];
        aBArray[aB.lllIlI[0]] = NONE;
        aBArray[aB.lllIlI[1]] = SOME;
        aBArray[aB.lllIlI[2]] = EXTREME;
        $VALUES = aBArray;
    }

    public static aB[] values() {
        return (aB[])$VALUES.clone();
    }

    private static String lllIlIlI(String llllIIllIlIIIlI, String llllIIllIlIIIll) {
        try {
            SecretKeySpec llllIIllIlIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllIIllIlIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllIIllIlIIllI = Cipher.getInstance("Blowfish");
            llllIIllIlIIllI.init(lllIlI[2], llllIIllIlIIlll);
            return new String(llllIIllIlIIllI.doFinal(Base64.getDecoder().decode(llllIIllIlIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllIIllIlIIlIl) {
            llllIIllIlIIlIl.printStackTrace();
            return null;
        }
    }

    private static void lllIlIll() {
        lllIIl = new String[lllIlI[3]];
        aB.lllIIl[aB.lllIlI[0]] = aB."NONE";
        aB.lllIIl[aB.lllIlI[1]] = aB."SOME";
        aB.lllIIl[aB.lllIlI[2]] = aB."EXTREME";
    }
}

