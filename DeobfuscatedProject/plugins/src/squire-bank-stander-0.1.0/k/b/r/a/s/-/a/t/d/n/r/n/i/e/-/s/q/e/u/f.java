/*
 * Decompiled with CFR 0.152.
 */
package k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class f
extends Enum<f> {
    private static /* synthetic */ String[] lllIIlIlIII;
    public static final /* synthetic */ /* enum */ f FIRE;
    public static final /* synthetic */ /* enum */ f AIR;
    private static /* synthetic */ int[] lllIIlIlIIl;
    private final /* synthetic */ int orbId;
    private static final /* synthetic */ f[] $VALUES;
    public static final /* synthetic */ /* enum */ f WATER;
    public static final /* synthetic */ /* enum */ f EARTH;

    public int x() {
        return this.orbId;
    }

    private static boolean lIlIllIllllllI(int n2, int n3) {
        return n2 < n3;
    }

    static {
        f.lIlIllIlllllIl();
        f.lIlIllIlllllII();
        AIR = new f(lllIIlIlIIl[1]);
        EARTH = new f(lllIIlIlIIl[3]);
        WATER = new f(lllIIlIlIIl[5]);
        FIRE = new f(lllIIlIlIIl[7]);
        f[] fArray = new f[lllIIlIlIIl[8]];
        fArray[f.lllIIlIlIIl[0]] = AIR;
        fArray[f.lllIIlIlIIl[2]] = EARTH;
        fArray[f.lllIIlIlIIl[4]] = WATER;
        fArray[f.lllIIlIlIIl[6]] = FIRE;
        $VALUES = fArray;
    }

    public static f valueOf(String string) {
        return Enum.valueOf(f.class, string);
    }

    public static f[] values() {
        return (f[])$VALUES.clone();
    }

    private static String lIlIllIllllIll(String llllllllllllllllIIlIlIIIIlIlIIlI, String llllllllllllllllIIlIlIIIIlIIllII) {
        llllllllllllllllIIlIlIIIIlIlIIlI = new String(Base64.getDecoder().decode(llllllllllllllllIIlIlIIIIlIlIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlIlIIIIlIlIIII = new StringBuilder();
        char[] llllllllllllllllIIlIlIIIIlIIllll = llllllllllllllllIIlIlIIIIlIIllII.toCharArray();
        int llllllllllllllllIIlIlIIIIlIIlllI = lllIIlIlIIl[0];
        char[] llllllllllllllllIIlIlIIIIlIIlIII = llllllllllllllllIIlIlIIIIlIlIIlI.toCharArray();
        int llllllllllllllllIIlIlIIIIlIIIlll = llllllllllllllllIIlIlIIIIlIIlIII.length;
        int llllllllllllllllIIlIlIIIIlIIIllI = lllIIlIlIIl[0];
        while (f.lIlIllIllllllI(llllllllllllllllIIlIlIIIIlIIIllI, llllllllllllllllIIlIlIIIIlIIIlll)) {
            char llllllllllllllllIIlIlIIIIlIlIIll = llllllllllllllllIIlIlIIIIlIIlIII[llllllllllllllllIIlIlIIIIlIIIllI];
            llllllllllllllllIIlIlIIIIlIlIIII.append((char)(llllllllllllllllIIlIlIIIIlIlIIll ^ llllllllllllllllIIlIlIIIIlIIllll[llllllllllllllllIIlIlIIIIlIIlllI % llllllllllllllllIIlIlIIIIlIIllll.length]));
            "".length();
            ++llllllllllllllllIIlIlIIIIlIIlllI;
            ++llllllllllllllllIIlIlIIIIlIIIllI;
            "".length();
            if ((124 + 121 - 173 + 77 ^ 84 + 105 - 155 + 111) != ((0x28 ^ 0x19 ^ (0x1B ^ 9)) & (0xDE ^ 0x84 ^ (0x7C ^ 5) ^ -" ".length()))) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIlIlIIIIlIlIIII);
    }

    private static void lIlIllIlllllIl() {
        lllIIlIlIIl = new int[10];
        f.lllIIlIlIIl[0] = (0x41 ^ 0x59) & ~(0x25 ^ 0x3D);
        f.lllIIlIlIIl[1] = -(0xFFFFBD87 & 0x5F7B) & (0xFFFFFF7F & 0x1FBF);
        f.lllIIlIlIIl[2] = " ".length();
        f.lllIIlIlIIl[3] = -(0xFFFFFF89 & 0x4F7) & (0xFFFF96BF & 0x6FFF);
        f.lllIIlIlIIl[4] = "  ".length();
        f.lllIIlIlIIl[5] = 0xFFFF8EBB & 0x737F;
        f.lllIIlIlIIl[6] = "   ".length();
        f.lllIIlIlIIl[7] = -(0xFFFFABC3 & 0x7DFF) & (0xFFFFBFFB & 0x6BFF);
        f.lllIIlIlIIl[8] = 79 + 177 - 83 + 12 ^ 153 + 128 - 124 + 32;
        f.lllIIlIlIIl[9] = 0x34 ^ 0x6C ^ (4 ^ 0x54);
    }

    private f(int n3) {
        this.orbId = n3;
    }

    private static void lIlIllIlllllII() {
        lllIIlIlIII = new String[lllIIlIlIIl[8]];
        f.lllIIlIlIII[f.lllIIlIlIIl[0]] = f.lIlIllIllllIlI("SbWostMG0ac=", "WCPtR");
        f.lllIIlIlIII[f.lllIIlIlIIl[2]] = f.lIlIllIllllIll("ABUqAzw=", "ETxWt");
        f.lllIIlIlIII[f.lllIIlIlIIl[4]] = f.lIlIllIllllIll("Ay86EDU=", "TnnUg");
        f.lllIIlIlIII[f.lllIIlIlIIl[6]] = f.lIlIllIllllIlI("DT44eUGFzr4=", "QpMoe");
    }

    private static String lIlIllIllllIlI(String llllllllllllllllIIlIlIIIIllIIIII, String llllllllllllllllIIlIlIIIIllIIIIl) {
        try {
            SecretKeySpec llllllllllllllllIIlIlIIIIllIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlIIIIllIIIIl.getBytes(StandardCharsets.UTF_8)), lllIIlIlIIl[9]), "DES");
            Cipher llllllllllllllllIIlIlIIIIllIIlII = Cipher.getInstance("DES");
            llllllllllllllllIIlIlIIIIllIIlII.init(lllIIlIlIIl[4], llllllllllllllllIIlIlIIIIllIIlIl);
            return new String(llllllllllllllllIIlIlIIIIllIIlII.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlIIIIllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIlIIIIllIIIll) {
            llllllllllllllllIIlIlIIIIllIIIll.printStackTrace();
            return null;
        }
    }
}

