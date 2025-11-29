/*
 * Decompiled with CFR 0.152.
 */
package r.g.q.-.s.r.s.u.i.e.r.r.n.c.s.-.e.s.e.o.e.d.a;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class a
extends Enum<a> {
    public static final /* synthetic */ /* enum */ a MAKE;
    public static final /* synthetic */ /* enum */ a MINIGAME;
    private static /* synthetic */ String[] lIIllIIlIlIlI;
    private static final /* synthetic */ a[] $VALUES;
    public static final /* synthetic */ /* enum */ a EXCHANGE;
    private static /* synthetic */ int[] lIIllIIlIlIll;

    public static a[] values() {
        return (a[])$VALUES.clone();
    }

    private static void lIlIllllllIlIIl() {
        lIIllIIlIlIll = new int[5];
        a.lIIllIIlIlIll[0] = (0x54 ^ 0x5F ^ (0x89 ^ 0xC6)) & (0x7F ^ 0x3F ^ (0x7C ^ 0x78) ^ -" ".length());
        a.lIIllIIlIlIll[1] = " ".length();
        a.lIIllIIlIlIll[2] = "  ".length();
        a.lIIllIIlIlIll[3] = "   ".length();
        a.lIIllIIlIlIll[4] = 0x78 ^ 0x6E ^ (0x6A ^ 0x74);
    }

    private static void lIlIllllllIlIII() {
        lIIllIIlIlIlI = new String[lIIllIIlIlIll[3]];
        a.lIIllIIlIlIlI[a.lIIllIIlIlIll[0]] = a.lIlIllllllIIllI("aQHRtAi7l322egagiShZnw==", "vljXh");
        a.lIIllIIlIlIlI[a.lIIllIIlIlIll[1]] = a.lIlIllllllIIllI("2P3hvRuwIoQ=", "JfQAS");
        a.lIIllIIlIlIlI[a.lIIllIIlIlIll[2]] = a.lIlIllllllIIlll("5UA77/NuNQnZrYO/7gznpA==", "TWjTo");
    }

    static {
        a.lIlIllllllIlIIl();
        a.lIlIllllllIlIII();
        MINIGAME = new a();
        MAKE = new a();
        EXCHANGE = new a();
        a[] aArray = new a[lIIllIIlIlIll[3]];
        aArray[a.lIIllIIlIlIll[0]] = MINIGAME;
        aArray[a.lIIllIIlIlIll[1]] = MAKE;
        aArray[a.lIIllIIlIlIll[2]] = EXCHANGE;
        $VALUES = aArray;
    }

    private static String lIlIllllllIIlll(String llllllllllllllIllllIIIIlIlIlIIIl, String llllllllllllllIllllIIIIlIlIlIIlI) {
        try {
            SecretKeySpec llllllllllllllIllllIIIIlIlIlIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIIIlIlIlIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllllIIIIlIlIlIlIl = Cipher.getInstance("Blowfish");
            llllllllllllllIllllIIIIlIlIlIlIl.init(lIIllIIlIlIll[2], llllllllllllllIllllIIIIlIlIlIllI);
            return new String(llllllllllllllIllllIIIIlIlIlIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIIIlIlIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllllIIIIlIlIlIlII) {
            llllllllllllllIllllIIIIlIlIlIlII.printStackTrace();
            return null;
        }
    }

    public static a valueOf(String string) {
        return Enum.valueOf(a.class, string);
    }

    private static String lIlIllllllIIllI(String llllllllllllllIllllIIIIlIlIllllI, String llllllllllllllIllllIIIIlIlIlllll) {
        try {
            SecretKeySpec llllllllllllllIllllIIIIlIllIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIIIlIlIlllll.getBytes(StandardCharsets.UTF_8)), lIIllIIlIlIll[4]), "DES");
            Cipher llllllllllllllIllllIIIIlIllIIIlI = Cipher.getInstance("DES");
            llllllllllllllIllllIIIIlIllIIIlI.init(lIIllIIlIlIll[2], llllllllllllllIllllIIIIlIllIIIll);
            return new String(llllllllllllllIllllIIIIlIllIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIIIlIlIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllllIIIIlIllIIIIl) {
            llllllllllllllIllllIIIIlIllIIIIl.printStackTrace();
            return null;
        }
    }
}

