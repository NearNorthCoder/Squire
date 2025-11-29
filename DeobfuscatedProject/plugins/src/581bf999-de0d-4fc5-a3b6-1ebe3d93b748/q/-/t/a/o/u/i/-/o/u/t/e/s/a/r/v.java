/*
 * Decompiled with CFR 0.152.
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class v
extends Enum<v> {
    public static final /* synthetic */ /* enum */ v FLICK;
    private static /* synthetic */ String[] llIIIlIIIll;
    private static /* synthetic */ int[] llIIIlIIlII;
    private static final /* synthetic */ v[] $VALUES;
    public static final /* synthetic */ /* enum */ v NORMAL;
    public static final /* synthetic */ /* enum */ v NONE;

    public static v valueOf(String string) {
        return Enum.valueOf(v.class, string);
    }

    private static String lIIlllIlllllll(String llllllllllllllllIlIIIlIlIlIIllII, String llllllllllllllllIlIIIlIlIlIIlIll) {
        llllllllllllllllIlIIIlIlIlIIllII = new String(Base64.getDecoder().decode(llllllllllllllllIlIIIlIlIlIIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIlIIIlIlIlIIlIlI = new StringBuilder();
        char[] llllllllllllllllIlIIIlIlIlIIlIIl = llllllllllllllllIlIIIlIlIlIIlIll.toCharArray();
        int llllllllllllllllIlIIIlIlIlIIlIII = llIIIlIIlII[0];
        char[] llllllllllllllllIlIIIlIlIlIIIIlI = llllllllllllllllIlIIIlIlIlIIllII.toCharArray();
        int llllllllllllllllIlIIIlIlIlIIIIIl = llllllllllllllllIlIIIlIlIlIIIIlI.length;
        int llllllllllllllllIlIIIlIlIlIIIIII = llIIIlIIlII[0];
        while (v.lIIllllIIIIIlI(llllllllllllllllIlIIIlIlIlIIIIII, llllllllllllllllIlIIIlIlIlIIIIIl)) {
            char llllllllllllllllIlIIIlIlIlIIllIl = llllllllllllllllIlIIIlIlIlIIIIlI[llllllllllllllllIlIIIlIlIlIIIIII];
            llllllllllllllllIlIIIlIlIlIIlIlI.append((char)(llllllllllllllllIlIIIlIlIlIIllIl ^ llllllllllllllllIlIIIlIlIlIIlIIl[llllllllllllllllIlIIIlIlIlIIlIII % llllllllllllllllIlIIIlIlIlIIlIIl.length]));
            "".length();
            ++llllllllllllllllIlIIIlIlIlIIlIII;
            ++llllllllllllllllIlIIIlIlIlIIIIII;
            "".length();
            if ((5 ^ 1) != " ".length()) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIlIIIlIlIlIIlIlI);
    }

    public static v[] values() {
        return (v[])$VALUES.clone();
    }

    static {
        v.lIIllllIIIIIIl();
        v.lIIllllIIIIIII();
        NONE = new v();
        NORMAL = new v();
        FLICK = new v();
        v[] vArray = new v[llIIIlIIlII[3]];
        vArray[v.llIIIlIIlII[0]] = NONE;
        vArray[v.llIIIlIIlII[1]] = NORMAL;
        vArray[v.llIIIlIIlII[2]] = FLICK;
        $VALUES = vArray;
    }

    private static void lIIllllIIIIIIl() {
        llIIIlIIlII = new int[4];
        v.llIIIlIIlII[0] = (101 + 173 - 137 + 111 ^ 40 + 135 - 169 + 146) & (0x6B ^ 0x28 ^ (0x17 ^ 0x34) ^ -" ".length());
        v.llIIIlIIlII[1] = " ".length();
        v.llIIIlIIlII[2] = "  ".length();
        v.llIIIlIIlII[3] = "   ".length();
    }

    private static void lIIllllIIIIIII() {
        llIIIlIIIll = new String[llIIIlIIlII[3]];
        v.llIIIlIIIll[v.llIIIlIIlII[0]] = v.lIIlllIllllllI("suOFNvoaEbU=", "hDLck");
        v.llIIIlIIIll[v.llIIIlIIlII[1]] = v.lIIlllIlllllll("AwQwFRYB", "MKbXW");
        v.llIIIlIIIll[v.llIIIlIIlII[2]] = v.lIIlllIllllllI("vmzZko/I+VU=", "PIBMv");
    }

    private static String lIIlllIllllllI(String llllllllllllllllIlIIIlIlIlIllIlI, String llllllllllllllllIlIIIlIlIlIllIll) {
        try {
            SecretKeySpec llllllllllllllllIlIIIlIlIlIlllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIIlIlIlIllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIlIIIlIlIlIllllI = Cipher.getInstance("Blowfish");
            llllllllllllllllIlIIIlIlIlIllllI.init(llIIIlIIlII[2], llllllllllllllllIlIIIlIlIlIlllll);
            return new String(llllllllllllllllIlIIIlIlIlIllllI.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIIlIlIlIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIIIlIlIlIlllIl) {
            llllllllllllllllIlIIIlIlIlIlllIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllllIIIIIlI(int n2, int n3) {
        return n2 < n3;
    }
}

