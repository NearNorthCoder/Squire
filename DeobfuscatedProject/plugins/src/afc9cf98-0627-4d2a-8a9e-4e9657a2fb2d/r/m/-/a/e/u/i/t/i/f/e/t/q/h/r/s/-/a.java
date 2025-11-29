/*
 * Decompiled with CFR 0.152.
 */
package r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class a
extends Enum<a> {
    public static final /* synthetic */ /* enum */ a HERB_BOX;
    public static final /* synthetic */ /* enum */ a SEED_PACK;
    public static final /* synthetic */ /* enum */ a NONE;
    private static /* synthetic */ int[] lIlIIIIIIIlll;
    private static final /* synthetic */ a[] $VALUES;
    private static /* synthetic */ String[] lIlIIIIIIIllI;

    private static String lIllIllIlIIlIlI(String llllllllllllllIlllIIlIIllIlIIlIl, String llllllllllllllIlllIIlIIllIlIlIIl) {
        llllllllllllllIlllIIlIIllIlIIlIl = new String(Base64.getDecoder().decode(llllllllllllllIlllIIlIIllIlIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIIlIIllIlIlIII = new StringBuilder();
        char[] llllllllllllllIlllIIlIIllIlIIlll = llllllllllllllIlllIIlIIllIlIlIIl.toCharArray();
        int llllllllllllllIlllIIlIIllIlIIllI = lIlIIIIIIIlll[0];
        char[] llllllllllllllIlllIIlIIllIlIIIII = llllllllllllllIlllIIlIIllIlIIlIl.toCharArray();
        int llllllllllllllIlllIIlIIllIIlllll = llllllllllllllIlllIIlIIllIlIIIII.length;
        int llllllllllllllIlllIIlIIllIIllllI = lIlIIIIIIIlll[0];
        while (a.lIllIllIlIIlllI(llllllllllllllIlllIIlIIllIIllllI, llllllllllllllIlllIIlIIllIIlllll)) {
            char llllllllllllllIlllIIlIIllIlIlIll = llllllllllllllIlllIIlIIllIlIIIII[llllllllllllllIlllIIlIIllIIllllI];
            llllllllllllllIlllIIlIIllIlIlIII.append((char)(llllllllllllllIlllIIlIIllIlIlIll ^ llllllllllllllIlllIIlIIllIlIIlll[llllllllllllllIlllIIlIIllIlIIllI % llllllllllllllIlllIIlIIllIlIIlll.length]));
            "".length();
            ++llllllllllllllIlllIIlIIllIlIIllI;
            ++llllllllllllllIlllIIlIIllIIllllI;
            "".length();
            if ("   ".length() >= ((0x39 ^ 0x59 ^ (0xD8 ^ 0x89)) & (0x11 ^ 0x3E ^ (0x34 ^ 0x2A) ^ -" ".length()))) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllIIlIIllIlIlIII);
    }

    public static a[] values() {
        return (a[])$VALUES.clone();
    }

    private static String lIllIllIlIIlIll(String llllllllllllllIlllIIlIIllIIlIlIl, String llllllllllllllIlllIIlIIllIIlIIlI) {
        try {
            SecretKeySpec llllllllllllllIlllIIlIIllIIllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIlIIllIIlIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIIlIIllIIlIlll = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIIlIIllIIlIlll.init(lIlIIIIIIIlll[2], llllllllllllllIlllIIlIIllIIllIII);
            return new String(llllllllllllllIlllIIlIIllIIlIlll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIlIIllIIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIIlIIllIIlIllI) {
            llllllllllllllIlllIIlIIllIIlIllI.printStackTrace();
            return null;
        }
    }

    static {
        a.lIllIllIlIIllIl();
        a.lIllIllIlIIllII();
        NONE = new a();
        HERB_BOX = new a();
        SEED_PACK = new a();
        a[] aArray = new a[lIlIIIIIIIlll[3]];
        aArray[a.lIlIIIIIIIlll[0]] = NONE;
        aArray[a.lIlIIIIIIIlll[1]] = HERB_BOX;
        aArray[a.lIlIIIIIIIlll[2]] = SEED_PACK;
        $VALUES = aArray;
    }

    public static a valueOf(String string) {
        return Enum.valueOf(a.class, string);
    }

    private static boolean lIllIllIlIIlllI(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIllIllIlIIllII() {
        lIlIIIIIIIllI = new String[lIlIIIIIIIlll[3]];
        a.lIlIIIIIIIllI[a.lIlIIIIIIIlll[0]] = a.lIllIllIlIIlIlI("FAcmPw==", "ZHhzQ");
        a.lIlIIIIIIIllI[a.lIlIIIIIIIlll[1]] = a.lIllIllIlIIlIll("C+TnlqBQk4WrpL+VOllMJA==", "UsGcy");
        a.lIlIIIIIIIllI[a.lIlIIIIIIIlll[2]] = a.lIllIllIlIIlIll("dedwo9vXE9V4xnKd3jJgJg==", "ZPayW");
    }

    private static void lIllIllIlIIllIl() {
        lIlIIIIIIIlll = new int[4];
        a.lIlIIIIIIIlll[0] = (0x10 ^ 0x4A ^ (0x4B ^ 0x3F)) & (142 + 104 - 83 + 10 ^ 59 + 123 - 73 + 22 ^ -" ".length());
        a.lIlIIIIIIIlll[1] = " ".length();
        a.lIlIIIIIIIlll[2] = "  ".length();
        a.lIlIIIIIIIlll[3] = "   ".length();
    }
}

