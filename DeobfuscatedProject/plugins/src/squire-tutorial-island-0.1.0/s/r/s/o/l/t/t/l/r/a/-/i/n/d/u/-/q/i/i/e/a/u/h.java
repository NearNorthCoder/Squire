/*
 * Decompiled with CFR 0.152.
 */
package s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class h
extends Enum<h> {
    private static /* synthetic */ int[] lIlIIIllllIlI;
    private static /* synthetic */ String[] lIlIIIllllIIl;
    public static final /* synthetic */ /* enum */ h TUTORIAL_ISLAND;
    private final /* synthetic */ String questName;
    private static final /* synthetic */ h[] $VALUES;

    private static String lIlllIIIlIlIlII(String llllllllllllllIlllIIIIllIllIlIll, String llllllllllllllIlllIIIIllIllIllII) {
        try {
            SecretKeySpec llllllllllllllIlllIIIIllIlllIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIIIllIllIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIIIIllIllIllll = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIIIIllIllIllll.init(lIlIIIllllIlI[2], llllllllllllllIlllIIIIllIlllIIII);
            return new String(llllllllllllllIlllIIIIllIllIllll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIIIllIllIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIIIIllIllIlllI) {
            llllllllllllllIlllIIIIllIllIlllI.printStackTrace();
            return null;
        }
    }

    private static String lIlllIIIlIlIlIl(String llllllllllllllIlllIIIIllIllllIlI, String llllllllllllllIlllIIIIllIlllIlll) {
        try {
            SecretKeySpec llllllllllllllIlllIIIIllIlllllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIIIllIlllIlll.getBytes(StandardCharsets.UTF_8)), lIlIIIllllIlI[3]), "DES");
            Cipher llllllllllllllIlllIIIIllIlllllII = Cipher.getInstance("DES");
            llllllllllllllIlllIIIIllIlllllII.init(lIlIIIllllIlI[2], llllllllllllllIlllIIIIllIlllllIl);
            return new String(llllllllllllllIlllIIIIllIlllllII.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIIIllIllllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIIIIllIllllIll) {
            llllllllllllllIlllIIIIllIllllIll.printStackTrace();
            return null;
        }
    }

    public static h[] values() {
        return (h[])$VALUES.clone();
    }

    private static void lIlllIIIlIlIlll() {
        lIlIIIllllIlI = new int[4];
        h.lIlIIIllllIlI[0] = (0x26 ^ 0xA) & ~(0x60 ^ 0x4C);
        h.lIlIIIllllIlI[1] = " ".length();
        h.lIlIIIllllIlI[2] = "  ".length();
        h.lIlIIIllllIlI[3] = 0x79 ^ 0x71;
    }

    public static h valueOf(String string) {
        return Enum.valueOf(h.class, string);
    }

    private static void lIlllIIIlIlIllI() {
        lIlIIIllllIIl = new String[lIlIIIllllIlI[2]];
        h.lIlIIIllllIIl[h.lIlIIIllllIlI[0]] = h.lIlllIIIlIlIlII("ESfYeJh/dXTaEkZovfXAiw==", "fUtws");
        h.lIlIIIllllIIl[h.lIlIIIllllIlI[1]] = h.lIlllIIIlIlIlIl("x8k/kn8P/NYMujql6JWVpA==", "QrvFE");
    }

    static {
        h.lIlllIIIlIlIlll();
        h.lIlllIIIlIlIllI();
        TUTORIAL_ISLAND = new h(lIlIIIllllIIl[lIlIIIllllIlI[1]]);
        h[] hArray = new h[lIlIIIllllIlI[1]];
        hArray[h.lIlIIIllllIlI[0]] = TUTORIAL_ISLAND;
        $VALUES = hArray;
    }

    private h(String string2) {
        this.questName = string2;
    }
}

