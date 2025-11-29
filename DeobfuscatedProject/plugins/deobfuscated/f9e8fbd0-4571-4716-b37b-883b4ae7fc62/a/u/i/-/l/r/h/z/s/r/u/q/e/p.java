/*
 * Decompiled with CFR 0.152.
 */
package a.u.i.-.l.r.h.z.s.r.u.q.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class p
extends Enum<p> {
    public static final /* synthetic */ /* enum */ p WEST;
    private static /* synthetic */ String[] lIllIlIIlIlII;
    public static final /* synthetic */ /* enum */ p EAST;
    public static final /* synthetic */ /* enum */ p SOUTH;
    private final /* synthetic */ int y;
    private static /* synthetic */ int[] lIllIlIIlIlIl;
    private final /* synthetic */ int x;
    public static final /* synthetic */ /* enum */ p CENTER;
    private static final /* synthetic */ p[] $VALUES;

    public static p[] values() {
        return (p[])$VALUES.clone();
    }

    private p(int n3, int n4) {
        this.x = n3;
        this.y = n4;
    }

    private static void llIIIllllIlIlIl() {
        lIllIlIIlIlIl = new int[11];
        p.lIllIlIIlIlIl[0] = (9 ^ 0x37) & ~(0x71 ^ 0x4F);
        p.lIllIlIIlIlIl[1] = 0x4F ^ 0x3C ^ (0xDB ^ 0xA2);
        p.lIllIlIIlIlIl[2] = 0x2E ^ 0x2B;
        p.lIllIlIIlIlIl[3] = 1;
        p.lIllIlIIlIlIl[4] = -(0x83 ^ 0x89);
        p.lIllIlIIlIlIl[5] = 2;
        p.lIllIlIIlIlIl[6] = 57 + 83 - 83 + 112 ^ 72 + 100 - 128 + 130;
        p.lIllIlIIlIlIl[7] = 3;
        p.lIllIlIIlIlIl[8] = -(126 + 56 - 122 + 75 ^ 97 + 37 - 41 + 38);
        p.lIllIlIIlIlIl[9] = 0x57 ^ 0x7A ^ (0x86 ^ 0xAF);
        p.lIllIlIIlIlIl[10] = 0x4A ^ 0x42;
    }

    private static boolean llIIIllllIlIlll(int n2, int n3) {
        return n2 < n3;
    }

    private static String llIIIllllIlIIll(String llllllllllllllIllIIIlllIllllIIIl, String llllllllllllllIllIIIlllIllllIIII) {
        llllllllllllllIllIIIlllIllllIIIl = new String(Base64.getDecoder().decode(llllllllllllllIllIIIlllIllllIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIIlllIlllIllll = new StringBuilder();
        char[] llllllllllllllIllIIIlllIlllIlllI = llllllllllllllIllIIIlllIllllIIII.toCharArray();
        int llllllllllllllIllIIIlllIlllIllIl = lIllIlIIlIlIl[0];
        char[] llllllllllllllIllIIIlllIlllIIlll = llllllllllllllIllIIIlllIllllIIIl.toCharArray();
        int llllllllllllllIllIIIlllIlllIIllI = llllllllllllllIllIIIlllIlllIIlll.length;
        int llllllllllllllIllIIIlllIlllIIlIl = lIllIlIIlIlIl[0];
        while (p.llIIIllllIlIlll(llllllllllllllIllIIIlllIlllIIlIl, llllllllllllllIllIIIlllIlllIIllI)) {
            char llllllllllllllIllIIIlllIllllIIlI = llllllllllllllIllIIIlllIlllIIlll[llllllllllllllIllIIIlllIlllIIlIl];
            llllllllllllllIllIIIlllIlllIllll.append((char)(llllllllllllllIllIIIlllIllllIIlI ^ llllllllllllllIllIIIlllIlllIlllI[llllllllllllllIllIIIlllIlllIllIl % llllllllllllllIllIIIlllIlllIlllI.length]));
            0;
            ++llllllllllllllIllIIIlllIlllIllIl;
            ++llllllllllllllIllIIIlllIlllIIlIl;
            0;
            if (3 != 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIIIlllIlllIllll);
    }

    static {
        p.llIIIllllIlIlIl();
        p.llIIIllllIlIlII();
        EAST = new p(lIllIlIIlIlIl[1], lIllIlIIlIlIl[2]);
        WEST = new p(lIllIlIIlIlIl[4], lIllIlIIlIlIl[2]);
        CENTER = new p(lIllIlIIlIlIl[0], lIllIlIIlIlIl[6]);
        SOUTH = new p(lIllIlIIlIlIl[0], lIllIlIIlIlIl[8]);
        p[] pArray = new p[lIllIlIIlIlIl[9]];
        pArray[p.lIllIlIIlIlIl[0]] = EAST;
        pArray[p.lIllIlIIlIlIl[3]] = WEST;
        pArray[p.lIllIlIIlIlIl[5]] = CENTER;
        pArray[p.lIllIlIIlIlIl[7]] = SOUTH;
        $VALUES = pArray;
    }

    public int H() {
        return this.y;
    }

    private static void llIIIllllIlIlII() {
        lIllIlIIlIlII = new String[lIllIlIIlIlIl[9]];
        p.lIllIlIIlIlII[p.lIllIlIIlIlIl[0]] = p."EAST";
        p.lIllIlIIlIlII[p.lIllIlIIlIlIl[3]] = p."WEST";
        p.lIllIlIIlIlII[p.lIllIlIIlIlIl[5]] = p."CENTER";
        p.lIllIlIIlIlII[p.lIllIlIIlIlIl[7]] = p."SOUTH";
    }

    public int G() {
        return this.x;
    }

    public static p valueOf(String string) {
        return Enum.valueOf(p.class, string);
    }

    private static String llIIIllllIlIIlI(String llllllllllllllIllIIIlllIllllllll, String llllllllllllllIllIIIlllIlllllllI) {
        try {
            SecretKeySpec llllllllllllllIllIIIllllIIIIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIlllIlllllllI.getBytes(StandardCharsets.UTF_8)), lIllIlIIlIlIl[10]), "DES");
            Cipher llllllllllllllIllIIIllllIIIIIIll = Cipher.getInstance("DES");
            llllllllllllllIllIIIllllIIIIIIll.init(lIllIlIIlIlIl[5], llllllllllllllIllIIIllllIIIIIlII);
            return new String(llllllllllllllIllIIIllllIIIIIIll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIlllIllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIIllllIIIIIIlI) {
            llllllllllllllIllIIIllllIIIIIIlI.printStackTrace();
            return null;
        }
    }
}

