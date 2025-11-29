/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package -.r.u.q.e.s.o.t.a.i;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;

public final class m
extends Enum<m> {
    private static /* synthetic */ String[] lIlIIIIIIIlll;
    private final /* synthetic */ Prayer mapped;
    private static final /* synthetic */ m[] $VALUES;
    public static final /* synthetic */ /* enum */ m PIETY;
    public static final /* synthetic */ /* enum */ m CHIVALRY;
    public static final /* synthetic */ /* enum */ m ULTIMATE_STRENGTH;
    private static /* synthetic */ int[] lIlIIIIIIlIII;

    static {
        m.lIllIlIlllIIllI();
        m.lIllIlIlllIIlIl();
        PIETY = new m(Prayer.PIETY);
        CHIVALRY = new m(Prayer.CHIVALRY);
        ULTIMATE_STRENGTH = new m(Prayer.ULTIMATE_STRENGTH);
        m[] mArray = new m[lIlIIIIIIlIII[3]];
        mArray[m.lIlIIIIIIlIII[0]] = PIETY;
        mArray[m.lIlIIIIIIlIII[1]] = CHIVALRY;
        mArray[m.lIlIIIIIIlIII[2]] = ULTIMATE_STRENGTH;
        $VALUES = mArray;
    }

    private static boolean lIllIlIlllIIlll(int n2, int n3) {
        return n2 < n3;
    }

    public static m valueOf(String string) {
        return Enum.valueOf(m.class, string);
    }

    public static m[] values() {
        return (m[])$VALUES.clone();
    }

    private static String lIllIlIlllIIlII(String llllllllllllllIlllIIllIlllIlIIIl, String llllllllllllllIlllIIllIlllIlIlIl) {
        llllllllllllllIlllIIllIlllIlIIIl = new String(Base64.getDecoder().decode(llllllllllllllIlllIIllIlllIlIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIIllIlllIlIlII = new StringBuilder();
        char[] llllllllllllllIlllIIllIlllIlIIll = llllllllllllllIlllIIllIlllIlIlIl.toCharArray();
        int llllllllllllllIlllIIllIlllIlIIlI = lIlIIIIIIlIII[0];
        char[] llllllllllllllIlllIIllIlllIIllII = llllllllllllllIlllIIllIlllIlIIIl.toCharArray();
        int llllllllllllllIlllIIllIlllIIlIll = llllllllllllllIlllIIllIlllIIllII.length;
        int llllllllllllllIlllIIllIlllIIlIlI = lIlIIIIIIlIII[0];
        while (m.lIllIlIlllIIlll(llllllllllllllIlllIIllIlllIIlIlI, llllllllllllllIlllIIllIlllIIlIll)) {
            char llllllllllllllIlllIIllIlllIlIlll = llllllllllllllIlllIIllIlllIIllII[llllllllllllllIlllIIllIlllIIlIlI];
            llllllllllllllIlllIIllIlllIlIlII.append((char)(llllllllllllllIlllIIllIlllIlIlll ^ llllllllllllllIlllIIllIlllIlIIll[llllllllllllllIlllIIllIlllIlIIlI % llllllllllllllIlllIIllIlllIlIIll.length]));
            "".length();
            ++llllllllllllllIlllIIllIlllIlIIlI;
            ++llllllllllllllIlllIIllIlllIIlIlI;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllIIllIlllIlIlII);
    }

    private static String lIllIlIlllIIIll(String llllllllllllllIlllIIllIllllIIlII, String llllllllllllllIlllIIllIllllIIlIl) {
        try {
            SecretKeySpec llllllllllllllIlllIIllIllllIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIllIllllIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIIllIllllIlIII = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIIllIllllIlIII.init(lIlIIIIIIlIII[2], llllllllllllllIlllIIllIllllIlIIl);
            return new String(llllllllllllllIlllIIllIllllIlIII.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIllIllllIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIIllIllllIIlll) {
            llllllllllllllIlllIIllIllllIIlll.printStackTrace();
            return null;
        }
    }

    public Prayer z() {
        return this.mapped;
    }

    private static void lIllIlIlllIIlIl() {
        lIlIIIIIIIlll = new String[lIlIIIIIIlIII[3]];
        m.lIlIIIIIIIlll[m.lIlIIIIIIlIII[0]] = m.lIllIlIlllIIIll("jK3rkS8YXoM=", "QobfZ");
        m.lIlIIIIIIIlll[m.lIlIIIIIIlIII[1]] = m.lIllIlIlllIIlII("FzgvEjAYIj8=", "TpfDq");
        m.lIlIIIIIIIlll[m.lIlIIIIIIlIII[2]] = m.lIllIlIlllIIIll("q8uF9IUKqhAkd0brPEnBMvaVdjaq6hIO", "kAXYX");
    }

    private static void lIllIlIlllIIllI() {
        lIlIIIIIIlIII = new int[4];
        m.lIlIIIIIIlIII[0] = (0x79 ^ 0x65 ^ (0x6C ^ 0x46)) & (0x46 ^ 0x22 ^ (0x32 ^ 0x60) ^ -" ".length());
        m.lIlIIIIIIlIII[1] = " ".length();
        m.lIlIIIIIIlIII[2] = "  ".length();
        m.lIlIIIIIIlIII[3] = "   ".length();
    }

    private m(Prayer prayer) {
        this.mapped = prayer;
    }
}

