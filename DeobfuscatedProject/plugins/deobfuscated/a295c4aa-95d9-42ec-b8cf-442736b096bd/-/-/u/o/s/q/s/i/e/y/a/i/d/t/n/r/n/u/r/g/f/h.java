/*
 * Decompiled with CFR 0.152.
 */
package -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class h
extends Enum<h> {
    public static final /* synthetic */ /* enum */ h RED;
    public static final /* synthetic */ /* enum */ h GREEN;
    private static /* synthetic */ String[] llIlIlIIlllI;
    public static final /* synthetic */ /* enum */ h YELLOW;
    private final /* synthetic */ int highlightChildId;
    private final /* synthetic */ int childId;
    private static /* synthetic */ int[] llIlIlIIllll;
    private static final /* synthetic */ h[] $VALUES;

    private static void lIIIIIlIlllllIl() {
        llIlIlIIlllI = new String[llIlIlIIllll[9]];
        h.llIlIlIIlllI[h.llIlIlIIllll[0]] = h."RED";
        h.llIlIlIIlllI[h.llIlIlIIllll[3]] = h."YELLOW";
        h.llIlIlIIlllI[h.llIlIlIIllll[6]] = h."GREEN";
    }

    private static String lIIIIIlIllllIll(String lllllllllllllllIlIIIIlIllIIIllII, String lllllllllllllllIlIIIIlIllIIIlIIl) {
        try {
            SecretKeySpec lllllllllllllllIlIIIIlIllIIIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIIlIllIIIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIIIlIllIIIlllI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIIIlIllIIIlllI.init(llIlIlIIllll[6], lllllllllllllllIlIIIIlIllIIIllll);
            return new String(lllllllllllllllIlIIIIlIllIIIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIIlIllIIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIIIlIllIIIllIl) {
            lllllllllllllllIlIIIIlIllIIIllIl.printStackTrace();
            return null;
        }
    }

    public static h valueOf(String string) {
        return Enum.valueOf(h.class, string);
    }

    public static h[] values() {
        return (h[])$VALUES.clone();
    }

    private static void lIIIIIllIIIlIII() {
        llIlIlIIllll = new int[10];
        h.llIlIlIIllll[0] = (0x5B ^ 0x13) & ~(0x57 ^ 0x1F) & ~((0x1D ^ 0x50) & ~(0x45 ^ 8));
        h.llIlIlIIllll[1] = 0xAA ^ 0xBF;
        h.llIlIlIIllll[2] = 0x6A ^ 0x75;
        h.llIlIlIIllll[3] = 1;
        h.llIlIlIIllll[4] = 0x6E ^ 0x18 ^ (0xE6 ^ 0x84);
        h.llIlIlIIllll[5] = 207 + 89 - 255 + 214 ^ 25 + 5 - -102 + 62;
        h.llIlIlIIllll[6] = 2;
        h.llIlIlIIllll[7] = 0x8F ^ 0x9C;
        h.llIlIlIIllll[8] = 0xD5 ^ 0x92;
        h.llIlIlIIllll[9] = 3;
    }

    public int L() {
        return this.highlightChildId;
    }

    private static String lIIIIIlIlllllII(String lllllllllllllllIlIIIIlIlIlllIlll, String lllllllllllllllIlIIIIlIlIllllIll) {
        lllllllllllllllIlIIIIlIlIlllIlll = new String(Base64.getDecoder().decode(lllllllllllllllIlIIIIlIlIlllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIIIlIlIllllIlI = new StringBuilder();
        char[] lllllllllllllllIlIIIIlIlIllllIIl = lllllllllllllllIlIIIIlIlIllllIll.toCharArray();
        int lllllllllllllllIlIIIIlIlIllllIII = llIlIlIIllll[0];
        char[] lllllllllllllllIlIIIIlIlIlllIIlI = lllllllllllllllIlIIIIlIlIlllIlll.toCharArray();
        int lllllllllllllllIlIIIIlIlIlllIIIl = lllllllllllllllIlIIIIlIlIlllIIlI.length;
        int lllllllllllllllIlIIIIlIlIlllIIII = llIlIlIIllll[0];
        while (h.lIIIIIllIIIlIIl(lllllllllllllllIlIIIIlIlIlllIIII, lllllllllllllllIlIIIIlIlIlllIIIl)) {
            char lllllllllllllllIlIIIIlIlIlllllIl = lllllllllllllllIlIIIIlIlIlllIIlI[lllllllllllllllIlIIIIlIlIlllIIII];
            lllllllllllllllIlIIIIlIlIllllIlI.append((char)(lllllllllllllllIlIIIIlIlIlllllIl ^ lllllllllllllllIlIIIIlIlIllllIIl[lllllllllllllllIlIIIIlIlIllllIII % lllllllllllllllIlIIIIlIlIllllIIl.length]));
            0;
            ++lllllllllllllllIlIIIIlIlIllllIII;
            ++lllllllllllllllIlIIIIlIlIlllIIII;
            0;
            if (2 == 2) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIIIIlIlIllllIlI);
    }

    static {
        h.lIIIIIllIIIlIII();
        h.lIIIIIlIlllllIl();
        RED = new h(llIlIlIIllll[1], llIlIlIIllll[2]);
        YELLOW = new h(llIlIlIIllll[4], llIlIlIIllll[5]);
        GREEN = new h(llIlIlIIllll[7], llIlIlIIllll[8]);
        h[] hArray = new h[llIlIlIIllll[9]];
        hArray[h.llIlIlIIllll[0]] = RED;
        hArray[h.llIlIlIIllll[3]] = YELLOW;
        hArray[h.llIlIlIIllll[6]] = GREEN;
        $VALUES = hArray;
    }

    private h(int n3, int n4) {
        this.childId = n3;
        this.highlightChildId = n4;
    }

    private static boolean lIIIIIllIIIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    public int K() {
        return this.childId;
    }
}

