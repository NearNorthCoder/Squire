/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;

public final class u
extends Enum<u> {
    private static final /* synthetic */ u[] $VALUES;
    private final /* synthetic */ Prayer mapped;
    private static /* synthetic */ int[] llIlIIIlIlI;
    public static final /* synthetic */ /* enum */ u ULTIMATE_STRENGTH;
    private static /* synthetic */ String[] llIlIIIlIIl;
    public static final /* synthetic */ /* enum */ u CHIVALRY;
    public static final /* synthetic */ /* enum */ u PIETY;

    static {
        u.lIlIIlIIlllllI();
        u.lIlIIlIIllllIl();
        PIETY = new u(Prayer.PIETY);
        CHIVALRY = new u(Prayer.CHIVALRY);
        ULTIMATE_STRENGTH = new u(Prayer.ULTIMATE_STRENGTH);
        u[] uArray = new u[llIlIIIlIlI[3]];
        uArray[u.llIlIIIlIlI[0]] = PIETY;
        uArray[u.llIlIIIlIlI[1]] = CHIVALRY;
        uArray[u.llIlIIIlIlI[2]] = ULTIMATE_STRENGTH;
        $VALUES = uArray;
    }

    private u(Prayer prayer) {
        this.mapped = prayer;
    }

    public Prayer ag() {
        return this.mapped;
    }

    private static void lIlIIlIIlllllI() {
        llIlIIIlIlI = new int[4];
        u.llIlIIIlIlI[0] = (10 + 88 - 42 + 127 ^ 126 + 19 - 127 + 118) & (0x4B ^ 0x40 ^ (0x74 ^ 0x40) ^ -" ".length());
        u.llIlIIIlIlI[1] = " ".length();
        u.llIlIIIlIlI[2] = "  ".length();
        u.llIlIIIlIlI[3] = "   ".length();
    }

    public static u[] values() {
        return (u[])$VALUES.clone();
    }

    private static String lIlIIlIIlllIll(String llllllllllllllllIIllIllllIIIIIll, String llllllllllllllllIIllIllllIIIIIII) {
        try {
            SecretKeySpec llllllllllllllllIIllIllllIIIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllIllllIIIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIllIllllIIIIlIl = Cipher.getInstance("Blowfish");
            llllllllllllllllIIllIllllIIIIlIl.init(llIlIIIlIlI[2], llllllllllllllllIIllIllllIIIIllI);
            return new String(llllllllllllllllIIllIllllIIIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllIllllIIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIllIllllIIIIlII) {
            llllllllllllllllIIllIllllIIIIlII.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlIIllllll(int n2, int n3) {
        return n2 < n3;
    }

    public static u valueOf(String string) {
        return Enum.valueOf(u.class, string);
    }

    private static void lIlIIlIIllllIl() {
        llIlIIIlIIl = new String[llIlIIIlIlI[3]];
        u.llIlIIIlIIl[u.llIlIIIlIlI[0]] = u.lIlIIlIIlllIll("Cus6eajwO2s=", "nWANb");
        u.llIlIIIlIIl[u.llIlIIIlIlI[1]] = u.lIlIIlIIllllII("BgEiFTQJGzI=", "EIkCu");
        u.llIlIIIlIIl[u.llIlIIIlIlI[2]] = u.lIlIIlIIllllII("AyQ8Az8XPC0VIQI6LQQ1AiA=", "VhhJr");
    }

    private static String lIlIIlIIllllII(String llllllllllllllllIIllIlllIlllIIll, String llllllllllllllllIIllIlllIlllIIlI) {
        llllllllllllllllIIllIlllIlllIIll = new String(Base64.getDecoder().decode(llllllllllllllllIIllIlllIlllIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIllIlllIlllIIIl = new StringBuilder();
        char[] llllllllllllllllIIllIlllIlllIIII = llllllllllllllllIIllIlllIlllIIlI.toCharArray();
        int llllllllllllllllIIllIlllIllIllll = llIlIIIlIlI[0];
        char[] llllllllllllllllIIllIlllIllIlIIl = llllllllllllllllIIllIlllIlllIIll.toCharArray();
        int llllllllllllllllIIllIlllIllIlIII = llllllllllllllllIIllIlllIllIlIIl.length;
        int llllllllllllllllIIllIlllIllIIlll = llIlIIIlIlI[0];
        while (u.lIlIIlIIllllll(llllllllllllllllIIllIlllIllIIlll, llllllllllllllllIIllIlllIllIlIII)) {
            char llllllllllllllllIIllIlllIlllIlII = llllllllllllllllIIllIlllIllIlIIl[llllllllllllllllIIllIlllIllIIlll];
            llllllllllllllllIIllIlllIlllIIIl.append((char)(llllllllllllllllIIllIlllIlllIlII ^ llllllllllllllllIIllIlllIlllIIII[llllllllllllllllIIllIlllIllIllll % llllllllllllllllIIllIlllIlllIIII.length]));
            "".length();
            ++llllllllllllllllIIllIlllIllIllll;
            ++llllllllllllllllIIllIlllIllIIlll;
            "".length();
            if (-" ".length() < 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIllIlllIlllIIIl);
    }
}

