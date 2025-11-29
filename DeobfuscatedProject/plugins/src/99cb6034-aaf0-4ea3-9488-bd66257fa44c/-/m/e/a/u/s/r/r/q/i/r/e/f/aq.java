/*
 * Decompiled with CFR 0.152.
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.av;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aw;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class aq
extends Enum<aq>
implements aw {
    private static /* synthetic */ int[] llIIIIlIIIII;
    public static final /* synthetic */ /* enum */ aq NOTHING;
    private static final /* synthetic */ aq[] $VALUES;
    public static final /* synthetic */ /* enum */ aq WHITE_BERRY;
    public static final /* synthetic */ /* enum */ aq POISON_IVY;
    private static /* synthetic */ String[] llIIIIIlllll;
    private final /* synthetic */ av produce;
    public static final /* synthetic */ /* enum */ aq DEFAULT;

    public static aq[] values() {
        return (aq[])$VALUES.clone();
    }

    private static String llllIIlIIIIIIl(String lllllllllllllllIlIlIllIIlIIIIllI, String lllllllllllllllIlIlIllIIlIIIIlIl) {
        try {
            SecretKeySpec lllllllllllllllIlIlIllIIlIIIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIllIIlIIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIlIllIIlIIIlIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlIllIIlIIIlIII.init(llIIIIlIIIII[2], lllllllllllllllIlIlIllIIlIIIlIIl);
            return new String(lllllllllllllllIlIlIllIIlIIIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIllIIlIIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlIllIIlIIIIlll) {
            lllllllllllllllIlIlIllIIlIIIIlll.printStackTrace();
            return null;
        }
    }

    private static void llllIIlIIIIlII() {
        llIIIIIlllll = new String[llIIIIlIIIII[4]];
        aq.llIIIIIlllll[aq.llIIIIlIIIII[0]] = aq.llllIIlIIIIIIl("1rA1GUqzaOs=", "cGMqd");
        aq.llIIIIIlllll[aq.llIIIIlIIIII[1]] = aq.llllIIlIIIIIlI("WpfrnjnP37A=", "LNCnq");
        aq.llIIIIIlllll[aq.llIIIIlIIIII[2]] = aq.llllIIlIIIIIll("Bi8EJQAOJQgjFwg=", "QgMqE");
        aq.llIIIIIlllll[aq.llIIIIlIIIII[3]] = aq.llllIIlIIIIIlI("n/z4/rx5Drj1QhjS0kThVw==", "cBNzX");
    }

    private static String llllIIlIIIIIll(String lllllllllllllllIlIlIllIIlIIllIll, String lllllllllllllllIlIlIllIIlIIlIlIl) {
        lllllllllllllllIlIlIllIIlIIllIll = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIllIIlIIllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIlIllIIlIIllIIl = new StringBuilder();
        char[] lllllllllllllllIlIlIllIIlIIllIII = lllllllllllllllIlIlIllIIlIIlIlIl.toCharArray();
        int lllllllllllllllIlIlIllIIlIIlIlll = llIIIIlIIIII[0];
        char[] lllllllllllllllIlIlIllIIlIIlIIIl = lllllllllllllllIlIlIllIIlIIllIll.toCharArray();
        int lllllllllllllllIlIlIllIIlIIlIIII = lllllllllllllllIlIlIllIIlIIlIIIl.length;
        int lllllllllllllllIlIlIllIIlIIIllll = llIIIIlIIIII[0];
        while (aq.llllIIlIIIIllI(lllllllllllllllIlIlIllIIlIIIllll, lllllllllllllllIlIlIllIIlIIlIIII)) {
            char lllllllllllllllIlIlIllIIlIIlllII = lllllllllllllllIlIlIllIIlIIlIIIl[lllllllllllllllIlIlIllIIlIIIllll];
            lllllllllllllllIlIlIllIIlIIllIIl.append((char)(lllllllllllllllIlIlIllIIlIIlllII ^ lllllllllllllllIlIlIllIIlIIllIII[lllllllllllllllIlIlIllIIlIIlIlll % lllllllllllllllIlIlIllIIlIIllIII.length]));
            "".length();
            ++lllllllllllllllIlIlIllIIlIIlIlll;
            ++lllllllllllllllIlIlIllIIlIIIllll;
            "".length();
            if (-" ".length() < ((0x29 ^ 0x32) & ~(0x8D ^ 0x96))) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIlIllIIlIIllIIl);
    }

    private static boolean llllIIlIIIIllI(int n2, int n3) {
        return n2 < n3;
    }

    private aq(av av2) {
        this.produce = av2;
    }

    @Override
    public av bf() {
        return this.produce;
    }

    public static aq valueOf(String string) {
        return Enum.valueOf(aq.class, string);
    }

    private static void llllIIlIIIIlIl() {
        llIIIIlIIIII = new int[6];
        aq.llIIIIlIIIII[0] = (0x4F ^ 0x6E) & ~(0x2D ^ 0xC);
        aq.llIIIIlIIIII[1] = " ".length();
        aq.llIIIIlIIIII[2] = "  ".length();
        aq.llIIIIlIIIII[3] = "   ".length();
        aq.llIIIIlIIIII[4] = 123 + 86 - 205 + 147 ^ 109 + 133 - 234 + 139;
        aq.llIIIIlIIIII[5] = 3 ^ 9 ^ "  ".length();
    }

    private static String llllIIlIIIIIlI(String lllllllllllllllIlIlIllIIlIlIlIll, String lllllllllllllllIlIlIllIIlIlIlIlI) {
        try {
            SecretKeySpec lllllllllllllllIlIlIllIIlIlIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIllIIlIlIlIlI.getBytes(StandardCharsets.UTF_8)), llIIIIlIIIII[5]), "DES");
            Cipher lllllllllllllllIlIlIllIIlIlIllIl = Cipher.getInstance("DES");
            lllllllllllllllIlIlIllIIlIlIllIl.init(llIIIIlIIIII[2], lllllllllllllllIlIlIllIIlIlIlllI);
            return new String(lllllllllllllllIlIlIllIIlIlIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIllIIlIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlIllIIlIlIllII) {
            lllllllllllllllIlIlIllIIlIlIllII.printStackTrace();
            return null;
        }
    }

    static {
        aq.llllIIlIIIIlIl();
        aq.llllIIlIIIIlII();
        NOTHING = new aq(null);
        DEFAULT = new aq(av.DEFAULT);
        WHITE_BERRY = new aq(av.WHITE_BERRY);
        POISON_IVY = new aq(av.POISON_IVY);
        aq[] aqArray = new aq[llIIIIlIIIII[4]];
        aqArray[aq.llIIIIlIIIII[0]] = NOTHING;
        aqArray[aq.llIIIIlIIIII[1]] = DEFAULT;
        aqArray[aq.llIIIIlIIIII[2]] = WHITE_BERRY;
        aqArray[aq.llIIIIlIIIII[3]] = POISON_IVY;
        $VALUES = aqArray;
    }
}

