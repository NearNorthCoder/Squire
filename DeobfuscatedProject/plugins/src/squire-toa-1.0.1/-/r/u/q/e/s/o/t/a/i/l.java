/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package -.r.u.q.e.s.o.t.a.i;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;

public final class l
extends Enum<l> {
    private static /* synthetic */ String[] lIIlllllIIIIl;
    private final /* synthetic */ Prayer mapped;
    public static final /* synthetic */ /* enum */ l MYSTIC_MIGHT;
    public static final /* synthetic */ /* enum */ l AUGURY;
    private static final /* synthetic */ l[] $VALUES;
    private static /* synthetic */ int[] lIIlllllIIIlI;

    public static l[] values() {
        return (l[])$VALUES.clone();
    }

    private static String lIllIlIIllllIlI(String llllllllllllllIlllIIlIllllIlIIII, String llllllllllllllIlllIIlIllllIlIlII) {
        llllllllllllllIlllIIlIllllIlIIII = new String(Base64.getDecoder().decode(llllllllllllllIlllIIlIllllIlIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIIlIllllIlIIll = new StringBuilder();
        char[] llllllllllllllIlllIIlIllllIlIIlI = llllllllllllllIlllIIlIllllIlIlII.toCharArray();
        int llllllllllllllIlllIIlIllllIlIIIl = lIIlllllIIIlI[0];
        char[] llllllllllllllIlllIIlIllllIIlIll = llllllllllllllIlllIIlIllllIlIIII.toCharArray();
        int llllllllllllllIlllIIlIllllIIlIlI = llllllllllllllIlllIIlIllllIIlIll.length;
        int llllllllllllllIlllIIlIllllIIlIIl = lIIlllllIIIlI[0];
        while (l.lIllIllIIlIlIll(llllllllllllllIlllIIlIllllIIlIIl, llllllllllllllIlllIIlIllllIIlIlI)) {
            char llllllllllllllIlllIIlIllllIlIllI = llllllllllllllIlllIIlIllllIIlIll[llllllllllllllIlllIIlIllllIIlIIl];
            llllllllllllllIlllIIlIllllIlIIll.append((char)(llllllllllllllIlllIIlIllllIlIllI ^ llllllllllllllIlllIIlIllllIlIIlI[llllllllllllllIlllIIlIllllIlIIIl % llllllllllllllIlllIIlIllllIlIIlI.length]));
            "".length();
            ++llllllllllllllIlllIIlIllllIlIIIl;
            ++llllllllllllllIlllIIlIllllIIlIIl;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllIIlIllllIlIIll);
    }

    private static void lIllIlIIlllllII() {
        lIIlllllIIIIl = new String[lIIlllllIIIlI[2]];
        l.lIIlllllIIIIl[l.lIIlllllIIIlI[0]] = l.lIllIlIIllllIlI("ERwKFDkJ", "PIMAk");
        l.lIIlllllIIIIl[l.lIIlllllIIIlI[1]] = l.lIllIlIIllllIll("Ds2h5mLqqdz+1X9mN5sBTg==", "tTWeb");
    }

    static {
        l.lIllIlIIlllllIl();
        l.lIllIlIIlllllII();
        AUGURY = new l(Prayer.AUGURY);
        MYSTIC_MIGHT = new l(Prayer.MYSTIC_MIGHT);
        l[] lArray = new l[lIIlllllIIIlI[2]];
        lArray[l.lIIlllllIIIlI[0]] = AUGURY;
        lArray[l.lIIlllllIIIlI[1]] = MYSTIC_MIGHT;
        $VALUES = lArray;
    }

    public Prayer z() {
        return this.mapped;
    }

    public static l valueOf(String string) {
        return Enum.valueOf(l.class, string);
    }

    private static String lIllIlIIllllIll(String llllllllllllllIlllIIlIlllIlllllI, String llllllllllllllIlllIIlIlllIllllll) {
        try {
            SecretKeySpec llllllllllllllIlllIIlIllllIIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIlIlllIllllll.getBytes(StandardCharsets.UTF_8)), lIIlllllIIIlI[3]), "DES");
            Cipher llllllllllllllIlllIIlIllllIIIIlI = Cipher.getInstance("DES");
            llllllllllllllIlllIIlIllllIIIIlI.init(lIIlllllIIIlI[2], llllllllllllllIlllIIlIllllIIIIll);
            return new String(llllllllllllllIlllIIlIllllIIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIlIlllIlllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIIlIllllIIIIIl) {
            llllllllllllllIlllIIlIllllIIIIIl.printStackTrace();
            return null;
        }
    }

    private static void lIllIlIIlllllIl() {
        lIIlllllIIIlI = new int[4];
        l.lIIlllllIIIlI[0] = (0xD ^ 0x4E) & ~(0x7D ^ 0x3E);
        l.lIIlllllIIIlI[1] = " ".length();
        l.lIIlllllIIIlI[2] = "  ".length();
        l.lIIlllllIIIlI[3] = 0xBC ^ 0xB4;
    }

    private l(Prayer prayer) {
        this.mapped = prayer;
    }

    private static boolean lIllIllIIlIlIll(int n2, int n3) {
        return n2 < n3;
    }
}

