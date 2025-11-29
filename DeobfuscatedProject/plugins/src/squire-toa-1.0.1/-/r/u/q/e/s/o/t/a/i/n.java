/*
 * Decompiled with CFR 0.152.
 */
package -.r.u.q.e.s.o.t.a.i;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class n
extends Enum<n> {
    public static final /* synthetic */ /* enum */ n NORMAL;
    private static /* synthetic */ int[] lIlIIIIIIIIlI;
    private static final /* synthetic */ n[] $VALUES;
    public static final /* synthetic */ /* enum */ n FLICK;
    public static final /* synthetic */ /* enum */ n NONE;
    private static /* synthetic */ String[] lIlIIIIIIIIIl;

    private static String lIllIlIllIllIIl(String llllllllllllllIlllIIlllIIIIIlIII, String llllllllllllllIlllIIlllIIIIIllII) {
        llllllllllllllIlllIIlllIIIIIlIII = new String(Base64.getDecoder().decode(llllllllllllllIlllIIlllIIIIIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIIlllIIIIIlIll = new StringBuilder();
        char[] llllllllllllllIlllIIlllIIIIIlIlI = llllllllllllllIlllIIlllIIIIIllII.toCharArray();
        int llllllllllllllIlllIIlllIIIIIlIIl = lIlIIIIIIIIlI[0];
        char[] llllllllllllllIlllIIlllIIIIIIIll = llllllllllllllIlllIIlllIIIIIlIII.toCharArray();
        int llllllllllllllIlllIIlllIIIIIIIlI = llllllllllllllIlllIIlllIIIIIIIll.length;
        int llllllllllllllIlllIIlllIIIIIIIIl = lIlIIIIIIIIlI[0];
        while (n.lIllIlIllIlllIl(llllllllllllllIlllIIlllIIIIIIIIl, llllllllllllllIlllIIlllIIIIIIIlI)) {
            char llllllllllllllIlllIIlllIIIIIlllI = llllllllllllllIlllIIlllIIIIIIIll[llllllllllllllIlllIIlllIIIIIIIIl];
            llllllllllllllIlllIIlllIIIIIlIll.append((char)(llllllllllllllIlllIIlllIIIIIlllI ^ llllllllllllllIlllIIlllIIIIIlIlI[llllllllllllllIlllIIlllIIIIIlIIl % llllllllllllllIlllIIlllIIIIIlIlI.length]));
            "".length();
            ++llllllllllllllIlllIIlllIIIIIlIIl;
            ++llllllllllllllIlllIIlllIIIIIIIIl;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllIIlllIIIIIlIll);
    }

    private static void lIllIlIllIlllII() {
        lIlIIIIIIIIlI = new int[4];
        n.lIlIIIIIIIIlI[0] = (0xA8 ^ 0xA2 ^ (0x2E ^ 0x2A)) & (75 + 134 - 164 + 133 ^ 43 + 80 - -25 + 40 ^ -" ".length());
        n.lIlIIIIIIIIlI[1] = " ".length();
        n.lIlIIIIIIIIlI[2] = "  ".length();
        n.lIlIIIIIIIIlI[3] = "   ".length();
    }

    private static boolean lIllIlIllIlllIl(int n2, int n3) {
        return n2 < n3;
    }

    public static n[] values() {
        return (n[])$VALUES.clone();
    }

    public static n valueOf(String string) {
        return Enum.valueOf(n.class, string);
    }

    static {
        n.lIllIlIllIlllII();
        n.lIllIlIllIllIll();
        NONE = new n();
        NORMAL = new n();
        FLICK = new n();
        n[] nArray = new n[lIlIIIIIIIIlI[3]];
        nArray[n.lIlIIIIIIIIlI[0]] = NONE;
        nArray[n.lIlIIIIIIIIlI[1]] = NORMAL;
        nArray[n.lIlIIIIIIIIlI[2]] = FLICK;
        $VALUES = nArray;
    }

    private static String lIllIlIllIllIlI(String llllllllllllllIlllIIlllIIIIlllIl, String llllllllllllllIlllIIlllIIIIlllII) {
        try {
            SecretKeySpec llllllllllllllIlllIIlllIIIlIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIlllIIIIlllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIIlllIIIIlllll = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIIlllIIIIlllll.init(lIlIIIIIIIIlI[2], llllllllllllllIlllIIlllIIIlIIIII);
            return new String(llllllllllllllIlllIIlllIIIIlllll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIlllIIIIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIIlllIIIIllllI) {
            llllllllllllllIlllIIlllIIIIllllI.printStackTrace();
            return null;
        }
    }

    private static void lIllIlIllIllIll() {
        lIlIIIIIIIIIl = new String[lIlIIIIIIIIlI[3]];
        n.lIlIIIIIIIIIl[n.lIlIIIIIIIIlI[0]] = n.lIllIlIllIllIIl("GBoPIA==", "VUAev");
        n.lIlIIIIIIIIIl[n.lIlIIIIIIIIlI[1]] = n.lIllIlIllIllIlI("ysAEhQjNas0=", "gaDrA");
        n.lIlIIIIIIIIIl[n.lIlIIIIIIIIlI[2]] = n.lIllIlIllIllIlI("y0WNqC/MHlQ=", "igGis");
    }
}

