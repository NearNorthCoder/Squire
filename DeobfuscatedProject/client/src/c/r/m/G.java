/*
 * Decompiled with CFR 0.152.
 */
package c.r.m;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class G
extends Enum<G> {
    public static final /* synthetic */ /* enum */ G MacOS;
    public static final /* synthetic */ /* enum */ G Linux;
    private static /* synthetic */ String[] lIIII;
    public static final /* synthetic */ /* enum */ G Other;
    public static final /* synthetic */ /* enum */ G Windows;
    private static /* synthetic */ int[] lIllI;
    private static final /* synthetic */ G[] $VALUES;

    public static G valueOf(String string) {
        return Enum.valueOf(G.class, string);
    }

    private static void lIIlII() {
        lIllI = new int[5];
        G.lIllI[0] = (0xCA ^ 0x9C) & ~(0x25 ^ 0x73);
        G.lIllI[1] = " ".length();
        G.lIllI[2] = "  ".length();
        G.lIllI[3] = "   ".length();
        G.lIllI[4] = 0x3F ^ 0x3B;
    }

    private static void llIlI() {
        lIIII = new String[lIllI[4]];
        G.lIIII[G.lIllI[0]] = G.llIII("LiwaIgYONg==", "yEtFi");
        G.lIIII[G.lIllI[1]] = G.llIIl("+esQy7m4lFA=", "BbtOX");
        G.lIIII[G.lIllI[2]] = G.llIII("Kx0EIj4=", "gtjWF");
        G.lIIII[G.lIllI[3]] = G.llIIl("sD1kDYXhrpE=", "kSoFM");
    }

    public static G[] values() {
        return (G[])$VALUES.clone();
    }

    private static boolean lIlIII(int n, int n2) {
        return n < n2;
    }

    static {
        G.lIIlII();
        G.llIlI();
        Windows = new G();
        MacOS = new G();
        Linux = new G();
        Other = new G();
        G[] gArray = new G[lIllI[4]];
        gArray[G.lIllI[0]] = Windows;
        gArray[G.lIllI[1]] = MacOS;
        gArray[G.lIllI[2]] = Linux;
        gArray[G.lIllI[3]] = Other;
        $VALUES = gArray;
    }

    private static String llIIl(String lllllllIIllIIIl, String lllllllIIllIIlI) {
        try {
            SecretKeySpec lllllllIIllIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllIIllIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllIIllIlIl = Cipher.getInstance("Blowfish");
            lllllllIIllIlIl.init(lIllI[2], lllllllIIllIllI);
            return new String(lllllllIIllIlIl.doFinal(Base64.getDecoder().decode(lllllllIIllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllIIllIlII) {
            lllllllIIllIlII.printStackTrace();
            return null;
        }
    }

    private static String llIII(String lllllllIIIllllI, String lllllllIIlIIIlI) {
        lllllllIIIllllI = new String(Base64.getDecoder().decode(lllllllIIIllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllIIlIIIIl = new StringBuilder();
        char[] lllllllIIlIIIII = lllllllIIlIIIlI.toCharArray();
        int lllllllIIIlllll = lIllI[0];
        char[] lllllllIIIllIIl = lllllllIIIllllI.toCharArray();
        int lllllllIIIllIII = lllllllIIIllIIl.length;
        int lllllllIIIlIlll = lIllI[0];
        while (G.lIlIII(lllllllIIIlIlll, lllllllIIIllIII)) {
            char lllllllIIlIIlII = lllllllIIIllIIl[lllllllIIIlIlll];
            lllllllIIlIIIIl.append((char)(lllllllIIlIIlII ^ lllllllIIlIIIII[lllllllIIIlllll % lllllllIIlIIIII.length]));
            "".length();
            ++lllllllIIIlllll;
            ++lllllllIIIlIlll;
            "".length();
            if (-"   ".length() < 0) continue;
            return null;
        }
        return String.valueOf(lllllllIIlIIIIl);
    }
}
