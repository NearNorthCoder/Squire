/*
 * Decompiled with CFR 0.152.
 */
package k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class s
extends Enum<s> {
    private static final /* synthetic */ s[] $VALUES;
    private static /* synthetic */ String[] lllIIlIIllI;
    public static final /* synthetic */ /* enum */ s SERUMS;
    public static final /* synthetic */ /* enum */ s COMPOST;
    private static /* synthetic */ int[] lllIIlIIlll;

    private static void lIlIllIllllIII() {
        lllIIlIIlll = new int[4];
        s.lllIIlIIlll[0] = (0xA8 ^ 0xB6 ^ (0x1F ^ 0x10)) & (0x99 ^ 0xA7 ^ (0x41 ^ 0x6E) ^ -" ".length());
        s.lllIIlIIlll[1] = " ".length();
        s.lllIIlIIlll[2] = "  ".length();
        s.lllIIlIIlll[3] = 0x78 ^ 0x67 ^ (0xA ^ 0x1D);
    }

    private static boolean lIlIllIllllIIl(int n2, int n3) {
        return n2 < n3;
    }

    public static s valueOf(String string) {
        return Enum.valueOf(s.class, string);
    }

    private static String lIlIllIlllIllI(String llllllllllllllllIIlIlIIIlIIIIIll, String llllllllllllllllIIlIlIIIlIIIIIlI) {
        llllllllllllllllIIlIlIIIlIIIIIll = new String(Base64.getDecoder().decode(llllllllllllllllIIlIlIIIlIIIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlIlIIIlIIIIllI = new StringBuilder();
        char[] llllllllllllllllIIlIlIIIlIIIIlIl = llllllllllllllllIIlIlIIIlIIIIIlI.toCharArray();
        int llllllllllllllllIIlIlIIIlIIIIlII = lllIIlIIlll[0];
        char[] llllllllllllllllIIlIlIIIIllllllI = llllllllllllllllIIlIlIIIlIIIIIll.toCharArray();
        int llllllllllllllllIIlIlIIIIlllllIl = llllllllllllllllIIlIlIIIIllllllI.length;
        int llllllllllllllllIIlIlIIIIlllllII = lllIIlIIlll[0];
        while (s.lIlIllIllllIIl(llllllllllllllllIIlIlIIIIlllllII, llllllllllllllllIIlIlIIIIlllllIl)) {
            char llllllllllllllllIIlIlIIIlIIIlIIl = llllllllllllllllIIlIlIIIIllllllI[llllllllllllllllIIlIlIIIIlllllII];
            llllllllllllllllIIlIlIIIlIIIIllI.append((char)(llllllllllllllllIIlIlIIIlIIIlIIl ^ llllllllllllllllIIlIlIIIlIIIIlIl[llllllllllllllllIIlIlIIIlIIIIlII % llllllllllllllllIIlIlIIIlIIIIlIl.length]));
            "".length();
            ++llllllllllllllllIIlIlIIIlIIIIlII;
            ++llllllllllllllllIIlIlIIIIlllllII;
            "".length();
            if (("  ".length() & ~"  ".length()) <= (0x6A ^ 0x6E)) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIlIlIIIlIIIIllI);
    }

    private static void lIlIllIlllIlll() {
        lllIIlIIllI = new String[lllIIlIIlll[2]];
        s.lllIIlIIllI[s.lllIIlIIlll[0]] = s.lIlIllIlllIlIl("4Ia72jb4tzc=", "FosaP");
        s.lllIIlIIllI[s.lllIIlIIlll[1]] = s.lIlIllIlllIllI("DzceJwQfLA==", "LxSwK");
    }

    public static s[] values() {
        return (s[])$VALUES.clone();
    }

    private static String lIlIllIlllIlIl(String llllllllllllllllIIlIlIIIIlllIIll, String llllllllllllllllIIlIlIIIIlllIIlI) {
        try {
            SecretKeySpec llllllllllllllllIIlIlIIIIlllIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlIIIIlllIIlI.getBytes(StandardCharsets.UTF_8)), lllIIlIIlll[3]), "DES");
            Cipher llllllllllllllllIIlIlIIIIlllIlIl = Cipher.getInstance("DES");
            llllllllllllllllIIlIlIIIIlllIlIl.init(lllIIlIIlll[2], llllllllllllllllIIlIlIIIIlllIllI);
            return new String(llllllllllllllllIIlIlIIIIlllIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlIIIIlllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIlIIIIlllIlII) {
            llllllllllllllllIIlIlIIIIlllIlII.printStackTrace();
            return null;
        }
    }

    static {
        s.lIlIllIllllIII();
        s.lIlIllIlllIlll();
        SERUMS = new s();
        COMPOST = new s();
        s[] sArray = new s[lllIIlIIlll[2]];
        sArray[s.lllIIlIIlll[0]] = SERUMS;
        sArray[s.lllIIlIIlll[1]] = COMPOST;
        $VALUES = sArray;
    }
}

