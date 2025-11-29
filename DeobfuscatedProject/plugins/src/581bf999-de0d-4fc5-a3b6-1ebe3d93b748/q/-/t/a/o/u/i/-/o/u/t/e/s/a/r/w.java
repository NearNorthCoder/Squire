/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;

public final class w
extends Enum<w> {
    private static final /* synthetic */ w[] $VALUES;
    private static /* synthetic */ int[] lIllIlIlIll;
    public static final /* synthetic */ /* enum */ w EAGLE_EYE;
    private static /* synthetic */ String[] lIllIlIlIlI;
    public static final /* synthetic */ /* enum */ w RIGOUR;
    private final /* synthetic */ Prayer mapped;

    private static void lIIlIlllIlIIII() {
        lIllIlIlIll = new int[4];
        w.lIllIlIlIll[0] = (0x16 ^ 0x32 ^ "  ".length()) & (0xC0 ^ 0x90 ^ (0x29 ^ 0x5F) ^ -" ".length());
        w.lIllIlIlIll[1] = " ".length();
        w.lIllIlIlIll[2] = "  ".length();
        w.lIllIlIlIll[3] = 0xAC ^ 0xA4;
    }

    private w(Prayer prayer) {
        this.mapped = prayer;
    }

    private static String lIIlIlllIIlllI(String llllllllllllllllIlIlIIIlIllllIll, String llllllllllllllllIlIlIIIlIlllllll) {
        llllllllllllllllIlIlIIIlIllllIll = new String(Base64.getDecoder().decode(llllllllllllllllIlIlIIIlIllllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIlIlIIIlIllllllI = new StringBuilder();
        char[] llllllllllllllllIlIlIIIlIlllllIl = llllllllllllllllIlIlIIIlIlllllll.toCharArray();
        int llllllllllllllllIlIlIIIlIlllllII = lIllIlIlIll[0];
        char[] llllllllllllllllIlIlIIIlIlllIllI = llllllllllllllllIlIlIIIlIllllIll.toCharArray();
        int llllllllllllllllIlIlIIIlIlllIlIl = llllllllllllllllIlIlIIIlIlllIllI.length;
        int llllllllllllllllIlIlIIIlIlllIlII = lIllIlIlIll[0];
        while (w.lIIlIlllIlIIIl(llllllllllllllllIlIlIIIlIlllIlII, llllllllllllllllIlIlIIIlIlllIlIl)) {
            char llllllllllllllllIlIlIIIllIIIIIIl = llllllllllllllllIlIlIIIlIlllIllI[llllllllllllllllIlIlIIIlIlllIlII];
            llllllllllllllllIlIlIIIlIllllllI.append((char)(llllllllllllllllIlIlIIIllIIIIIIl ^ llllllllllllllllIlIlIIIlIlllllIl[llllllllllllllllIlIlIIIlIlllllII % llllllllllllllllIlIlIIIlIlllllIl.length]));
            "".length();
            ++llllllllllllllllIlIlIIIlIlllllII;
            ++llllllllllllllllIlIlIIIlIlllIlII;
            "".length();
            if ((0x41 ^ 0x17 ^ (0x1F ^ 0x4D)) != ((0x26 ^ 0x75 ^ (0x75 ^ 0x70)) & (0x8C ^ 0xC2 ^ (0x60 ^ 0x78) ^ -" ".length()))) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIlIlIIIlIllllllI);
    }

    public Prayer ag() {
        return this.mapped;
    }

    public static w[] values() {
        return (w[])$VALUES.clone();
    }

    static {
        w.lIIlIlllIlIIII();
        w.lIIlIlllIIllll();
        RIGOUR = new w(Prayer.RIGOUR);
        EAGLE_EYE = new w(Prayer.EAGLE_EYE);
        w[] wArray = new w[lIllIlIlIll[2]];
        wArray[w.lIllIlIlIll[0]] = RIGOUR;
        wArray[w.lIllIlIlIll[1]] = EAGLE_EYE;
        $VALUES = wArray;
    }

    private static String lIIlIlllIIllIl(String llllllllllllllllIlIlIIIlIllIlIll, String llllllllllllllllIlIlIIIlIllIlIlI) {
        try {
            SecretKeySpec llllllllllllllllIlIlIIIlIllIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlIIIlIllIlIlI.getBytes(StandardCharsets.UTF_8)), lIllIlIlIll[3]), "DES");
            Cipher llllllllllllllllIlIlIIIlIllIllIl = Cipher.getInstance("DES");
            llllllllllllllllIlIlIIIlIllIllIl.init(lIllIlIlIll[2], llllllllllllllllIlIlIIIlIllIlllI);
            return new String(llllllllllllllllIlIlIIIlIllIllIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlIIIlIllIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIlIIIlIllIllII) {
            llllllllllllllllIlIlIIIlIllIllII.printStackTrace();
            return null;
        }
    }

    private static void lIIlIlllIIllll() {
        lIllIlIlIlI = new String[lIllIlIlIll[2]];
        w.lIllIlIlIlI[w.lIllIlIlIll[0]] = w.lIIlIlllIIllIl("ZkORJ/0KbCY=", "hfakc");
        w.lIllIlIlIlI[w.lIllIlIlIll[1]] = w.lIIlIlllIIlllI("KzMxAAcxNy8J", "nrvLB");
    }

    public static w valueOf(String string) {
        return Enum.valueOf(w.class, string);
    }

    private static boolean lIIlIlllIlIIIl(int n2, int n3) {
        return n2 < n3;
    }
}

