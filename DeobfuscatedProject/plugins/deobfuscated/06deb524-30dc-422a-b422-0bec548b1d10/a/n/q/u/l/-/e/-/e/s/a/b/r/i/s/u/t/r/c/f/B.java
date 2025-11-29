/*
 * Decompiled with CFR 0.152.
 */
package a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class B
extends Enum<B> {
    private final /* synthetic */ int value;
    public static final /* synthetic */ /* enum */ B RUNITE;
    private static /* synthetic */ int[] lIIlIllllllI;
    private static /* synthetic */ String[] lIIlIlllllIl;
    private static final /* synthetic */ B[] $VALUES;
    public static final /* synthetic */ /* enum */ B MITHRIL;
    public static final /* synthetic */ /* enum */ B IRON;
    public static final /* synthetic */ /* enum */ B ADAMANTITE;

    private static void llIIllIlllIIIl() {
        lIIlIllllllI = new int[9];
        B.lIIlIllllllI[0] = (0x3B ^ 0x32) & ~(0x3F ^ 0x36);
        B.lIIlIllllllI[1] = 1;
        B.lIIlIllllllI[2] = 2;
        B.lIIlIllllllI[3] = 3;
        B.lIIlIllllllI[4] = 6 + 11 - -53 + 97 ^ 1 + 67 - -46 + 49;
        B.lIIlIllllllI[5] = 0x4D ^ 0x48;
        B.lIIlIllllllI[6] = 0xC2 ^ 0xC4;
        B.lIIlIllllllI[7] = 0xC1 ^ 0x84 ^ (0xFF ^ 0xBD);
        B.lIIlIllllllI[8] = 0x62 ^ 0x6A;
    }

    private static boolean llIIllIlllIIll(int n2, int n3) {
        return n2 < n3;
    }

    public static B valueOf(String string) {
        return Enum.valueOf(B.class, string);
    }

    private B(int n3) {
        this.value = n3;
    }

    /*
     * WARNING - void declaration
     */
    public static int a(String string) {
        void lllllllllllllllIllllIIIIlIIIlllI;
        String string2 = string.toUpperCase();
        if (B.llIIllIlllIIlI(string2.contains(lIIlIlllllIl[lIIlIllllllI[0]]) ? 1 : 0)) {
            return IRON.R();
        }
        if (B.llIIllIlllIIlI(lllllllllllllllIllllIIIIlIIIlllI.contains(lIIlIlllllIl[lIIlIllllllI[1]]) ? 1 : 0)) {
            return MITHRIL.R();
        }
        if (B.llIIllIlllIIlI(lllllllllllllllIllllIIIIlIIIlllI.contains(lIIlIlllllIl[lIIlIllllllI[2]]) ? 1 : 0)) {
            return ADAMANTITE.R();
        }
        if (B.llIIllIlllIIlI(lllllllllllllllIllllIIIIlIIIlllI.contains(lIIlIlllllIl[lIIlIllllllI[3]]) ? 1 : 0)) {
            return RUNITE.R();
        }
        return lIIlIllllllI[0];
    }

    public int R() {
        return this.value;
    }

    private static String llIIllIllIllll(String lllllllllllllllIllllIIIIlIIIIllI, String lllllllllllllllIllllIIIIlIIIIlIl) {
        try {
            SecretKeySpec lllllllllllllllIllllIIIIlIIIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllllIIIIlIIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllllIIIIlIIIlIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIllllIIIIlIIIlIII.init(lIIlIllllllI[2], lllllllllllllllIllllIIIIlIIIlIIl);
            return new String(lllllllllllllllIllllIIIIlIIIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIllllIIIIlIIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllllIIIIlIIIIlll) {
            lllllllllllllllIllllIIIIlIIIIlll.printStackTrace();
            return null;
        }
    }

    private static void llIIllIlllIIII() {
        lIIlIlllllIl = new String[lIIlIllllllI[8]];
        B.lIIlIlllllIl[B.lIIlIllllllI[0]] = B."STEEL";
        B.lIIlIlllllIl[B.lIIlIllllllI[1]] = B."MITHRIL";
        B.lIIlIlllllIl[B.lIIlIllllllI[2]] = B."ADAMANTITE";
        B.lIIlIlllllIl[B.lIIlIllllllI[3]] = B."RUNITE";
        B.lIIlIlllllIl[B.lIIlIllllllI[4]] = B."IRON";
        B.lIIlIlllllIl[B.lIIlIllllllI[5]] = B."MITHRIL";
        B.lIIlIlllllIl[B.lIIlIllllllI[6]] = B."ADAMANTITE";
        B.lIIlIlllllIl[B.lIIlIllllllI[7]] = B."RUNITE";
    }

    private static String llIIllIllIlllI(String lllllllllllllllIllllIIIIIlllIIIl, String lllllllllllllllIllllIIIIIlllIIII) {
        lllllllllllllllIllllIIIIIlllIIIl = new String(Base64.getDecoder().decode(lllllllllllllllIllllIIIIIlllIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllllIIIIIlllIlII = new StringBuilder();
        char[] lllllllllllllllIllllIIIIIlllIIll = lllllllllllllllIllllIIIIIlllIIII.toCharArray();
        int lllllllllllllllIllllIIIIIlllIIlI = lIIlIllllllI[0];
        char[] lllllllllllllllIllllIIIIIllIllII = lllllllllllllllIllllIIIIIlllIIIl.toCharArray();
        int lllllllllllllllIllllIIIIIllIlIll = lllllllllllllllIllllIIIIIllIllII.length;
        int lllllllllllllllIllllIIIIIllIlIlI = lIIlIllllllI[0];
        while (B.llIIllIlllIIll(lllllllllllllllIllllIIIIIllIlIlI, lllllllllllllllIllllIIIIIllIlIll)) {
            char lllllllllllllllIllllIIIIIlllIlll = lllllllllllllllIllllIIIIIllIllII[lllllllllllllllIllllIIIIIllIlIlI];
            lllllllllllllllIllllIIIIIlllIlII.append((char)(lllllllllllllllIllllIIIIIlllIlll ^ lllllllllllllllIllllIIIIIlllIIll[lllllllllllllllIllllIIIIIlllIIlI % lllllllllllllllIllllIIIIIlllIIll.length]));
            0;
            ++lllllllllllllllIllllIIIIIlllIIlI;
            ++lllllllllllllllIllllIIIIIllIlIlI;
            0;
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIllllIIIIIlllIlII);
    }

    private static boolean llIIllIlllIIlI(int n2) {
        return n2 != 0;
    }

    public static B[] values() {
        return (B[])$VALUES.clone();
    }

    private static String llIIllIllIllIl(String lllllllllllllllIllllIIIIIllIIIIl, String lllllllllllllllIllllIIIIIllIIIII) {
        try {
            SecretKeySpec lllllllllllllllIllllIIIIIllIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllllIIIIIllIIIII.getBytes(StandardCharsets.UTF_8)), lIIlIllllllI[8]), "DES");
            Cipher lllllllllllllllIllllIIIIIllIIIll = Cipher.getInstance("DES");
            lllllllllllllllIllllIIIIIllIIIll.init(lIIlIllllllI[2], lllllllllllllllIllllIIIIIllIIlII);
            return new String(lllllllllllllllIllllIIIIIllIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIllllIIIIIllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllllIIIIIllIIIlI) {
            lllllllllllllllIllllIIIIIllIIIlI.printStackTrace();
            return null;
        }
    }

    static {
        B.llIIllIlllIIIl();
        B.llIIllIlllIIII();
        IRON = new B(lIIlIllllllI[1]);
        MITHRIL = new B(lIIlIllllllI[2]);
        ADAMANTITE = new B(lIIlIllllllI[3]);
        RUNITE = new B(lIIlIllllllI[4]);
        B[] bArray = new B[lIIlIllllllI[4]];
        bArray[B.lIIlIllllllI[0]] = IRON;
        bArray[B.lIIlIllllllI[1]] = MITHRIL;
        bArray[B.lIIlIllllllI[2]] = ADAMANTITE;
        bArray[B.lIIlIllllllI[3]] = RUNITE;
        $VALUES = bArray;
    }
}

