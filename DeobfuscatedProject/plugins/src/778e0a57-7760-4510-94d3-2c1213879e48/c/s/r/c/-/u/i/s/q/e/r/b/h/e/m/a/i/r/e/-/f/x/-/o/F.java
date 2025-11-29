/*
 * Decompiled with CFR 0.152.
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class F
extends Enum<F> {
    private static final /* synthetic */ F[] $VALUES;
    private final /* synthetic */ int personalItemCapacity;
    public static final /* synthetic */ /* enum */ F LARGE;
    public static final /* synthetic */ /* enum */ F MEDIUM;
    public static final /* synthetic */ /* enum */ F TINY;
    private final /* synthetic */ int raidItemCapacity;
    public static final /* synthetic */ /* enum */ F MASSIVE;
    private static /* synthetic */ String[] lIlIIllllIlI;
    private static /* synthetic */ int[] lIlIIllllIll;
    public static final /* synthetic */ /* enum */ F SMALL;

    private static void llIllIllIllIIl() {
        lIlIIllllIll = new int[16];
        F.lIlIIllllIll[0] = (0 ^ 0x37) & ~(0x43 ^ 0x74);
        F.lIlIIllllIll[1] = 0 + 102 - 89 + 114 ^ (0xD7 ^ 0xB1);
        F.lIlIIllllIll[2] = " ".length();
        F.lIlIIllllIll[3] = 0x66 ^ 0x29 ^ (0x27 ^ 0x76);
        F.lIlIIllllIll[4] = (0x8F ^ 0xC3) + (104 + 79 - 85 + 36) - (53 + 3 - 24 + 97) + (0 + 106 - -29 + 34);
        F.lIlIIllllIll[5] = "  ".length();
        F.lIlIIllllIll[6] = 0x74 ^ 0x48;
        F.lIlIIllllIll[7] = 0xFFFFE7FC & 0x19F7;
        F.lIlIIllllIll[8] = "   ".length();
        F.lIlIIllllIll[9] = 0xF6 ^ 0xAC;
        F.lIlIIllllIll[10] = -(0xFFFFFC4B & 0xFB7) & (0xFFFF9FFF & 0x6FEA);
        F.lIlIIllllIll[11] = 132 + 5 - 13 + 12 ^ 27 + 73 - -31 + 9;
        F.lIlIIllllIll[12] = 0x5E ^ 0x37 ^ (0x31 ^ 0x20);
        F.lIlIIllllIll[13] = -(0xFFFFB09D & 0x7F63) & (0xFFFFFDFD & 0x37DE);
        F.lIlIIllllIll[14] = 0xBE ^ 0xBB;
        F.lIlIIllllIll[15] = 0x15 ^ 0x2F ^ (0x90 ^ 0xA2);
    }

    private static String llIllIllIlIllI(String lllllllllllllllIllIlIllIllIllIIl, String lllllllllllllllIllIlIllIllIllIII) {
        try {
            SecretKeySpec lllllllllllllllIllIlIllIllIlllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIlIllIllIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIlIllIllIllIll = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIlIllIllIllIll.init(lIlIIllllIll[5], lllllllllllllllIllIlIllIllIlllII);
            return new String(lllllllllllllllIllIlIllIllIllIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIlIllIllIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIlIllIllIllIlI) {
            lllllllllllllllIllIlIllIllIllIlI.printStackTrace();
            return null;
        }
    }

    private F(int n3, int n4) {
        this.personalItemCapacity = n3;
        this.raidItemCapacity = n4;
    }

    private static void llIllIllIllIII() {
        lIlIIllllIlI = new String[lIlIIllllIll[14]];
        F.lIlIIllllIlI[F.lIlIIllllIll[0]] = F.llIllIllIlIlIl("MnwRROPe/cg=", "ecRrI");
        F.lIlIIllllIlI[F.lIlIIllllIll[2]] = F.llIllIllIlIllI("ljT81EKHchY=", "QJNxf");
        F.lIlIIllllIlI[F.lIlIIllllIll[5]] = F.llIllIllIlIlIl("xWZwdvlMHBA=", "LYWHp");
        F.lIlIIllllIlI[F.lIlIIllllIll[8]] = F.llIllIllIlIlll("JzIbCQM=", "ksINF");
        F.lIlIIllllIlI[F.lIlIIllllIll[11]] = F.llIllIllIlIlll("PRgEAjgmHA==", "pYWQq");
    }

    public static F[] values() {
        return (F[])$VALUES.clone();
    }

    private static String llIllIllIlIlIl(String lllllllllllllllIllIlIllIllIIlIlI, String lllllllllllllllIllIlIllIllIIlIIl) {
        try {
            SecretKeySpec lllllllllllllllIllIlIllIllIIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIlIllIllIIlIIl.getBytes(StandardCharsets.UTF_8)), lIlIIllllIll[15]), "DES");
            Cipher lllllllllllllllIllIlIllIllIIlllI = Cipher.getInstance("DES");
            lllllllllllllllIllIlIllIllIIlllI.init(lIlIIllllIll[5], lllllllllllllllIllIlIllIllIIllll);
            return new String(lllllllllllllllIllIlIllIllIIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIlIllIllIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIlIllIllIIllIl) {
            lllllllllllllllIllIlIllIllIIllIl.printStackTrace();
            return null;
        }
    }

    static {
        F.llIllIllIllIIl();
        F.llIllIllIllIII();
        TINY = new F(lIlIIllllIll[1]);
        SMALL = new F(lIlIIllllIll[3], lIlIIllllIll[4]);
        MEDIUM = new F(lIlIIllllIll[6], lIlIIllllIll[7]);
        LARGE = new F(lIlIIllllIll[9], lIlIIllllIll[10]);
        MASSIVE = new F(lIlIIllllIll[12], lIlIIllllIll[13]);
        F[] fArray = new F[lIlIIllllIll[14]];
        fArray[F.lIlIIllllIll[0]] = TINY;
        fArray[F.lIlIIllllIll[2]] = SMALL;
        fArray[F.lIlIIllllIll[5]] = MEDIUM;
        fArray[F.lIlIIllllIll[8]] = LARGE;
        fArray[F.lIlIIllllIll[11]] = MASSIVE;
        $VALUES = fArray;
    }

    private static String llIllIllIlIlll(String lllllllllllllllIllIlIllIlIllIlll, String lllllllllllllllIllIlIllIlIllIllI) {
        lllllllllllllllIllIlIllIlIllIlll = new String(Base64.getDecoder().decode(lllllllllllllllIllIlIllIlIllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIlIllIlIlllIlI = new StringBuilder();
        char[] lllllllllllllllIllIlIllIlIlllIIl = lllllllllllllllIllIlIllIlIllIllI.toCharArray();
        int lllllllllllllllIllIlIllIlIlllIII = lIlIIllllIll[0];
        char[] lllllllllllllllIllIlIllIlIllIIlI = lllllllllllllllIllIlIllIlIllIlll.toCharArray();
        int lllllllllllllllIllIlIllIlIllIIIl = lllllllllllllllIllIlIllIlIllIIlI.length;
        int lllllllllllllllIllIlIllIlIllIIII = lIlIIllllIll[0];
        while (F.llIllIllIllIlI(lllllllllllllllIllIlIllIlIllIIII, lllllllllllllllIllIlIllIlIllIIIl)) {
            char lllllllllllllllIllIlIllIlIllllIl = lllllllllllllllIllIlIllIlIllIIlI[lllllllllllllllIllIlIllIlIllIIII];
            lllllllllllllllIllIlIllIlIlllIlI.append((char)(lllllllllllllllIllIlIllIlIllllIl ^ lllllllllllllllIllIlIllIlIlllIIl[lllllllllllllllIllIlIllIlIlllIII % lllllllllllllllIllIlIllIlIlllIIl.length]));
            "".length();
            ++lllllllllllllllIllIlIllIlIlllIII;
            ++lllllllllllllllIllIlIllIlIllIIII;
            "".length();
            if (-"   ".length() <= 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIllIlIllIlIlllIlI);
    }

    public int bM() {
        return this.raidItemCapacity;
    }

    private static boolean llIllIllIllIlI(int n2, int n3) {
        return n2 < n3;
    }

    private F(int n3) {
        this(n3, lIlIIllllIll[0]);
    }

    public static F valueOf(String string) {
        return Enum.valueOf(F.class, string);
    }

    public int bL() {
        return this.personalItemCapacity;
    }
}

