/*
 * Decompiled with CFR 0.152.
 */
package -.r.u.q.e.s.o.t.a.i;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class d
extends Enum<d> {
    private static final /* synthetic */ d[] $VALUES;
    public static final /* synthetic */ /* enum */ d SPECIAL_2;
    public static final /* synthetic */ /* enum */ d SPECIAL_1;
    private static /* synthetic */ int[] lIIlllllIlIII;
    public static final /* synthetic */ /* enum */ d NONE;
    private static /* synthetic */ String[] lIIlllllIIlll;

    private static String lIllIlIlIIIlIll(String llllllllllllllIlllIlIIIIIllIIIll, String llllllllllllllIlllIlIIIIIlIlllIl) {
        llllllllllllllIlllIlIIIIIllIIIll = new String(Base64.getDecoder().decode(llllllllllllllIlllIlIIIIIllIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIlIIIIIllIIIIl = new StringBuilder();
        char[] llllllllllllllIlllIlIIIIIllIIIII = llllllllllllllIlllIlIIIIIlIlllIl.toCharArray();
        int llllllllllllllIlllIlIIIIIlIlllll = lIIlllllIlIII[0];
        char[] llllllllllllllIlllIlIIIIIlIllIIl = llllllllllllllIlllIlIIIIIllIIIll.toCharArray();
        int llllllllllllllIlllIlIIIIIlIllIII = llllllllllllllIlllIlIIIIIlIllIIl.length;
        int llllllllllllllIlllIlIIIIIlIlIlll = lIIlllllIlIII[0];
        while (d.lIllIlIlIIIlllI(llllllllllllllIlllIlIIIIIlIlIlll, llllllllllllllIlllIlIIIIIlIllIII)) {
            char llllllllllllllIlllIlIIIIIllIIlII = llllllllllllllIlllIlIIIIIlIllIIl[llllllllllllllIlllIlIIIIIlIlIlll];
            llllllllllllllIlllIlIIIIIllIIIIl.append((char)(llllllllllllllIlllIlIIIIIllIIlII ^ llllllllllllllIlllIlIIIIIllIIIII[llllllllllllllIlllIlIIIIIlIlllll % llllllllllllllIlllIlIIIIIllIIIII.length]));
            "".length();
            ++llllllllllllllIlllIlIIIIIlIlllll;
            ++llllllllllllllIlllIlIIIIIlIlIlll;
            "".length();
            if (((0x29 ^ 0x36) & ~(0xBD ^ 0xA2)) < (0x45 ^ 0x41)) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllIlIIIIIllIIIIl);
    }

    public static d[] values() {
        return (d[])$VALUES.clone();
    }

    private static void lIllIlIlIIIllIl() {
        lIIlllllIlIII = new int[5];
        d.lIIlllllIlIII[0] = (0x63 ^ 0x7B) & ~(0x68 ^ 0x70);
        d.lIIlllllIlIII[1] = " ".length();
        d.lIIlllllIlIII[2] = "  ".length();
        d.lIIlllllIlIII[3] = "   ".length();
        d.lIIlllllIlIII[4] = 0x92 ^ 0x89 ^ (0xA7 ^ 0xB4);
    }

    public static d valueOf(String string) {
        return Enum.valueOf(d.class, string);
    }

    private static void lIllIlIlIIIllII() {
        lIIlllllIIlll = new String[lIIlllllIlIII[3]];
        d.lIIlllllIIlll[d.lIIlllllIlIII[0]] = d.lIllIlIlIIIlIlI("fW+ITVzlEBBXr1zGuyDBOQ==", "gRMtf");
        d.lIIlllllIIlll[d.lIIlllllIlIII[1]] = d.lIllIlIlIIIlIlI("p2/zJX0Ib3Xqn2vAGZEYvg==", "TdGWL");
        d.lIIlllllIIlll[d.lIIlllllIlIII[2]] = d.lIllIlIlIIIlIll("IxUoKQ==", "mZfll");
    }

    private static boolean lIllIlIlIIIlllI(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIllIlIlIIIlIlI(String llllllllllllllIlllIlIIIIIlIIlllI, String llllllllllllllIlllIlIIIIIlIIlIll) {
        try {
            SecretKeySpec llllllllllllllIlllIlIIIIIlIlIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlIIIIIlIIlIll.getBytes(StandardCharsets.UTF_8)), lIIlllllIlIII[4]), "DES");
            Cipher llllllllllllllIlllIlIIIIIlIlIIII = Cipher.getInstance("DES");
            llllllllllllllIlllIlIIIIIlIlIIII.init(lIIlllllIlIII[2], llllllllllllllIlllIlIIIIIlIlIIIl);
            return new String(llllllllllllllIlllIlIIIIIlIlIIII.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlIIIIIlIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIlIIIIIlIIllll) {
            llllllllllllllIlllIlIIIIIlIIllll.printStackTrace();
            return null;
        }
    }

    static {
        d.lIllIlIlIIIllIl();
        d.lIllIlIlIIIllII();
        SPECIAL_1 = new d();
        SPECIAL_2 = new d();
        NONE = new d();
        d[] dArray = new d[lIIlllllIlIII[3]];
        dArray[d.lIIlllllIlIII[0]] = SPECIAL_1;
        dArray[d.lIIlllllIlIII[1]] = SPECIAL_2;
        dArray[d.lIIlllllIlIII[2]] = NONE;
        $VALUES = dArray;
    }
}

