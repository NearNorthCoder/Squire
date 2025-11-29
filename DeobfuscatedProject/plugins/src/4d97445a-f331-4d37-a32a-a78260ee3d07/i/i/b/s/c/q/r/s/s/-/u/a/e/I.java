/*
 * Decompiled with CFR 0.152.
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class I
extends Enum<I> {
    public static final /* synthetic */ /* enum */ I ITEM;
    private static final /* synthetic */ I[] $VALUES;
    public static final /* synthetic */ /* enum */ I SPELL;
    private static /* synthetic */ int[] lIllIIIl;
    private static /* synthetic */ String[] lIllIIII;
    public static final /* synthetic */ /* enum */ I TAB;

    private static void lIIllllIlI() {
        lIllIIII = new String[lIllIIIl[3]];
        I.lIllIIII[I.lIllIIIl[0]] = I.lIIllllIII("JzQJFjg=", "tdLZt");
        I.lIllIIII[I.lIllIIIl[1]] = I.lIIllllIII("AR80Jw==", "HKqjr");
        I.lIllIIII[I.lIllIIIl[2]] = I.lIIllllIIl("jlGIEw9l130=", "kmTOu");
    }

    public static I[] values() {
        return (I[])$VALUES.clone();
    }

    private static boolean lIIlllllII(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIllllIIl(String llIllllIIllIllI, String llIllllIIllIlIl) {
        try {
            SecretKeySpec llIllllIIlllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIllllIIllIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIllllIIlllIII = Cipher.getInstance("Blowfish");
            llIllllIIlllIII.init(lIllIIIl[2], llIllllIIlllIIl);
            return new String(llIllllIIlllIII.doFinal(Base64.getDecoder().decode(llIllllIIllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIllllIIllIlll) {
            llIllllIIllIlll.printStackTrace();
            return null;
        }
    }

    public static I valueOf(String string) {
        return Enum.valueOf(I.class, string);
    }

    private static void lIIllllIll() {
        lIllIIIl = new int[4];
        I.lIllIIIl[0] = (97 + 3 - -66 + 12 ^ 109 + 92 - 158 + 93) & (0x67 ^ 0x7D ^ (0x29 ^ 9) ^ -" ".length());
        I.lIllIIIl[1] = " ".length();
        I.lIllIIIl[2] = "  ".length();
        I.lIllIIIl[3] = "   ".length();
    }

    private static String lIIllllIII(String llIllllIIlIIIIl, String llIllllIIlIIIII) {
        llIllllIIlIIIIl = new String(Base64.getDecoder().decode(llIllllIIlIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIllllIIlIIlII = new StringBuilder();
        char[] llIllllIIlIIIll = llIllllIIlIIIII.toCharArray();
        int llIllllIIlIIIlI = lIllIIIl[0];
        char[] llIllllIIIlllII = llIllllIIlIIIIl.toCharArray();
        int llIllllIIIllIll = llIllllIIIlllII.length;
        int llIllllIIIllIlI = lIllIIIl[0];
        while (I.lIIlllllII(llIllllIIIllIlI, llIllllIIIllIll)) {
            char llIllllIIlIIlll = llIllllIIIlllII[llIllllIIIllIlI];
            llIllllIIlIIlII.append((char)(llIllllIIlIIlll ^ llIllllIIlIIIll[llIllllIIlIIIlI % llIllllIIlIIIll.length]));
            "".length();
            ++llIllllIIlIIIlI;
            ++llIllllIIIllIlI;
            "".length();
            if (((0xAD ^ 0x9B ^ (0x38 ^ 0x34)) & (0xEA ^ 0x80 ^ (0x67 ^ 0x37) ^ -" ".length())) <= 0) continue;
            return null;
        }
        return String.valueOf(llIllllIIlIIlII);
    }

    static {
        I.lIIllllIll();
        I.lIIllllIlI();
        SPELL = new I();
        ITEM = new I();
        TAB = new I();
        I[] iArray = new I[lIllIIIl[3]];
        iArray[I.lIllIIIl[0]] = SPELL;
        iArray[I.lIllIIIl[1]] = ITEM;
        iArray[I.lIllIIIl[2]] = TAB;
        $VALUES = iArray;
    }
}

