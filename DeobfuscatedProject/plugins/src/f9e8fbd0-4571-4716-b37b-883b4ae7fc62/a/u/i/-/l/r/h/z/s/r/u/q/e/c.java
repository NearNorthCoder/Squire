/*
 * Decompiled with CFR 0.152.
 */
package a.u.i.-.l.r.h.z.s.r.u.q.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class c
extends Enum<c> {
    public static final /* synthetic */ /* enum */ c DONE;
    public static final /* synthetic */ /* enum */ c TRANSPORTING_ZULRAH;
    public static final /* synthetic */ /* enum */ c BANKING;
    private static final /* synthetic */ c[] $VALUES;
    public static final /* synthetic */ /* enum */ c COLLECTING_ZULRAH;
    private static /* synthetic */ String[] lIllIlIIlIIII;
    private static /* synthetic */ int[] lIllIlIIlIIIl;

    private static String llIIIllllIIlIIl(String llllllllllllllIllIIIllllIIlllIlI, String llllllllllllllIllIIIllllIIlllIIl) {
        llllllllllllllIllIIIllllIIlllIlI = new String(Base64.getDecoder().decode(llllllllllllllIllIIIllllIIlllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIIllllIIlllIII = new StringBuilder();
        char[] llllllllllllllIllIIIllllIIllIlll = llllllllllllllIllIIIllllIIlllIIl.toCharArray();
        int llllllllllllllIllIIIllllIIllIllI = lIllIlIIlIIIl[0];
        char[] llllllllllllllIllIIIllllIIllIIII = llllllllllllllIllIIIllllIIlllIlI.toCharArray();
        int llllllllllllllIllIIIllllIIlIllll = llllllllllllllIllIIIllllIIllIIII.length;
        int llllllllllllllIllIIIllllIIlIlllI = lIllIlIIlIIIl[0];
        while (c.llIIIllllIIllII(llllllllllllllIllIIIllllIIlIlllI, llllllllllllllIllIIIllllIIlIllll)) {
            char llllllllllllllIllIIIllllIIlllIll = llllllllllllllIllIIIllllIIllIIII[llllllllllllllIllIIIllllIIlIlllI];
            llllllllllllllIllIIIllllIIlllIII.append((char)(llllllllllllllIllIIIllllIIlllIll ^ llllllllllllllIllIIIllllIIllIlll[llllllllllllllIllIIIllllIIllIllI % llllllllllllllIllIIIllllIIllIlll.length]));
            "".length();
            ++llllllllllllllIllIIIllllIIllIllI;
            ++llllllllllllllIllIIIllllIIlIlllI;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIIIllllIIlllIII);
    }

    private static void llIIIllllIIlIll() {
        lIllIlIIlIIIl = new int[6];
        c.lIllIlIIlIIIl[0] = (0x57 ^ 0x72) & ~(0x5F ^ 0x7A);
        c.lIllIlIIlIIIl[1] = " ".length();
        c.lIllIlIIlIIIl[2] = "  ".length();
        c.lIllIlIIlIIIl[3] = "   ".length();
        c.lIllIlIIlIIIl[4] = 0xF0 ^ 0x84 ^ (0x7D ^ 0xD);
        c.lIllIlIIlIIIl[5] = 127 + 203 - 230 + 104 ^ 87 + 139 - 106 + 76;
    }

    private static String llIIIllllIIlIII(String llllllllllllllIllIIIllllIIlIIIll, String llllllllllllllIllIIIllllIIlIIlII) {
        try {
            SecretKeySpec llllllllllllllIllIIIllllIIlIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIllllIIlIIlII.getBytes(StandardCharsets.UTF_8)), lIllIlIIlIIIl[5]), "DES");
            Cipher llllllllllllllIllIIIllllIIlIIlll = Cipher.getInstance("DES");
            llllllllllllllIllIIIllllIIlIIlll.init(lIllIlIIlIIIl[2], llllllllllllllIllIIIllllIIlIlIII);
            return new String(llllllllllllllIllIIIllllIIlIIlll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIllllIIlIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIIllllIIlIIllI) {
            llllllllllllllIllIIIllllIIlIIllI.printStackTrace();
            return null;
        }
    }

    public static c[] values() {
        return (c[])$VALUES.clone();
    }

    private static void llIIIllllIIlIlI() {
        lIllIlIIlIIII = new String[lIllIlIIlIIIl[4]];
        c.lIllIlIIlIIII[c.lIllIlIIlIIIl[0]] = c.llIIIllllIIlIII("580ksT5Rcyc=", "AOTvB");
        c.lIllIlIIlIIII[c.lIllIlIIlIIIl[1]] = c.llIIIllllIIlIIl("OhsRLyA+BgI1OiAODzsmIhsRKQ==", "nIPas");
        c.lIllIlIIlIIII[c.lIllIlIIlIIIl[2]] = c.llIIIllllIIlIIl("BgQEJA8GHwEmDRoRHSQYBAM=", "EKHhJ");
        c.lIllIlIIlIIII[c.lIllIlIIlIIIl[3]] = c.llIIIllllIIlIII("Tne0uca0PzQ=", "yhiiv");
    }

    public static c valueOf(String string) {
        return Enum.valueOf(c.class, string);
    }

    static {
        c.llIIIllllIIlIll();
        c.llIIIllllIIlIlI();
        BANKING = new c();
        TRANSPORTING_ZULRAH = new c();
        COLLECTING_ZULRAH = new c();
        DONE = new c();
        c[] cArray = new c[lIllIlIIlIIIl[4]];
        cArray[c.lIllIlIIlIIIl[0]] = BANKING;
        cArray[c.lIllIlIIlIIIl[1]] = TRANSPORTING_ZULRAH;
        cArray[c.lIllIlIIlIIIl[2]] = COLLECTING_ZULRAH;
        cArray[c.lIllIlIIlIIIl[3]] = DONE;
        $VALUES = cArray;
    }

    private static boolean llIIIllllIIllII(int n2, int n3) {
        return n2 < n3;
    }
}

