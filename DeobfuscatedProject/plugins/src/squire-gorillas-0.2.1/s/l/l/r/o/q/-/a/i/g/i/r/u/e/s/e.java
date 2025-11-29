/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package s.l.l.r.o.q.-.a.i.g.i.r.u.e.s;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;

public final class e
extends Enum<e> {
    public static final /* synthetic */ /* enum */ e CHIVALRY;
    private final /* synthetic */ Prayer mapped;
    public static final /* synthetic */ /* enum */ e PIETY;
    private static /* synthetic */ String[] llIIlIlllIIl;
    private static final /* synthetic */ e[] $VALUES;
    private static /* synthetic */ int[] llIIlIlllIlI;
    public static final /* synthetic */ /* enum */ e ULTIMATE_STRENGTH;

    public Prayer C() {
        return this.mapped;
    }

    private static void lllllIlllIIllI() {
        llIIlIlllIIl = new String[llIIlIlllIlI[3]];
        e.llIIlIlllIIl[e.llIIlIlllIlI[0]] = e.lllllIlllIIlII("r+9wxTj63MI=", "GEViP");
        e.llIIlIlllIIl[e.llIIlIlllIlI[1]] = e.lllllIlllIIlIl("LBwvGQYjBj8=", "oTfOG");
        e.llIIlIlllIIl[e.llIIlIlllIlI[2]] = e.lllllIlllIIlII("XFkXXCVAVkfBKN6qB2OvHMrvv4PddBjj", "eVoZF");
    }

    private static void lllllIlllIIlll() {
        llIIlIlllIlI = new int[4];
        e.llIIlIlllIlI[0] = (0x80 ^ 0xA1) & ~(0xA ^ 0x2B);
        e.llIIlIlllIlI[1] = " ".length();
        e.llIIlIlllIlI[2] = "  ".length();
        e.llIIlIlllIlI[3] = "   ".length();
    }

    static {
        e.lllllIlllIIlll();
        e.lllllIlllIIllI();
        PIETY = new e(Prayer.PIETY);
        CHIVALRY = new e(Prayer.CHIVALRY);
        ULTIMATE_STRENGTH = new e(Prayer.ULTIMATE_STRENGTH);
        e[] eArray = new e[llIIlIlllIlI[3]];
        eArray[e.llIIlIlllIlI[0]] = PIETY;
        eArray[e.llIIlIlllIlI[1]] = CHIVALRY;
        eArray[e.llIIlIlllIlI[2]] = ULTIMATE_STRENGTH;
        $VALUES = eArray;
    }

    private e(Prayer prayer) {
        this.mapped = prayer;
    }

    private static boolean lllllIlllIlIII(int n2, int n3) {
        return n2 < n3;
    }

    public static e valueOf(String string) {
        return Enum.valueOf(e.class, string);
    }

    private static String lllllIlllIIlII(String lllllllllllllllIlIIlllIlIlIllIIl, String lllllllllllllllIlIIlllIlIlIllIII) {
        try {
            SecretKeySpec lllllllllllllllIlIIlllIlIlIlllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlllIlIlIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIlllIlIlIllIll = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIlllIlIlIllIll.init(llIIlIlllIlI[2], lllllllllllllllIlIIlllIlIlIlllII);
            return new String(lllllllllllllllIlIIlllIlIlIllIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlllIlIlIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIlllIlIlIllIlI) {
            lllllllllllllllIlIIlllIlIlIllIlI.printStackTrace();
            return null;
        }
    }

    public static e[] values() {
        return (e[])$VALUES.clone();
    }

    private static String lllllIlllIIlIl(String lllllllllllllllIlIIlllIlIllIlIIl, String lllllllllllllllIlIIlllIlIllIlIII) {
        lllllllllllllllIlIIlllIlIllIlIIl = new String(Base64.getDecoder().decode(lllllllllllllllIlIIlllIlIllIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIlllIlIllIllII = new StringBuilder();
        char[] lllllllllllllllIlIIlllIlIllIlIll = lllllllllllllllIlIIlllIlIllIlIII.toCharArray();
        int lllllllllllllllIlIIlllIlIllIlIlI = llIIlIlllIlI[0];
        char[] lllllllllllllllIlIIlllIlIllIIlII = lllllllllllllllIlIIlllIlIllIlIIl.toCharArray();
        int lllllllllllllllIlIIlllIlIllIIIll = lllllllllllllllIlIIlllIlIllIIlII.length;
        int lllllllllllllllIlIIlllIlIllIIIlI = llIIlIlllIlI[0];
        while (e.lllllIlllIlIII(lllllllllllllllIlIIlllIlIllIIIlI, lllllllllllllllIlIIlllIlIllIIIll)) {
            char lllllllllllllllIlIIlllIlIllIllll = lllllllllllllllIlIIlllIlIllIIlII[lllllllllllllllIlIIlllIlIllIIIlI];
            lllllllllllllllIlIIlllIlIllIllII.append((char)(lllllllllllllllIlIIlllIlIllIllll ^ lllllllllllllllIlIIlllIlIllIlIll[lllllllllllllllIlIIlllIlIllIlIlI % lllllllllllllllIlIIlllIlIllIlIll.length]));
            "".length();
            ++lllllllllllllllIlIIlllIlIllIlIlI;
            ++lllllllllllllllIlIIlllIlIllIIIlI;
            "".length();
            if (((0xA1 ^ 0xA9 ^ (0xBA ^ 0xA5)) & (0x26 ^ 6 ^ (8 ^ 0x3F) ^ -" ".length())) == 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIIlllIlIllIllII);
    }
}

