/*
 * Decompiled with CFR 0.152.
 */
package -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class d
extends Enum<d> {
    public static final /* synthetic */ /* enum */ d NONE;
    public static final /* synthetic */ d[] values;
    public static final /* synthetic */ /* enum */ d SPIKED;
    private static final /* synthetic */ d[] $VALUES;
    public static final /* synthetic */ /* enum */ d BROAD;
    public static final /* synthetic */ /* enum */ d LIGHT;
    public static final /* synthetic */ /* enum */ d HEAVY;
    public static final /* synthetic */ /* enum */ d FLAT;
    private static /* synthetic */ int[] llIlIllIIlll;
    private static /* synthetic */ String[] llIlIllIIllI;
    public static final /* synthetic */ /* enum */ d NARROW;

    public static d valueOf(String string) {
        return Enum.valueOf(d.class, string);
    }

    private static void lIIIIIlllIlIlIl() {
        llIlIllIIlll = new int[9];
        d.llIlIllIIlll[0] = (0xDD ^ 0xBC) & ~(0x76 ^ 0x17);
        d.llIlIllIIlll[1] = " ".length();
        d.llIlIllIIlll[2] = "  ".length();
        d.llIlIllIIlll[3] = "   ".length();
        d.llIlIllIIlll[4] = 0x7E ^ 0x47 ^ (0x32 ^ 0xF);
        d.llIlIllIIlll[5] = 0xAF ^ 0xAA;
        d.llIlIllIIlll[6] = 0x3D ^ 8 ^ (0xAB ^ 0x98);
        d.llIlIllIIlll[7] = 0x15 ^ 0x12;
        d.llIlIllIIlll[8] = 0 ^ 5 ^ (0xD ^ 0);
    }

    public static d a(int n2) {
        if (!d.lIIIIIlllIlIllI(n2) || d.lIIIIIlllIlIlll(n2, values.length)) {
            return NONE;
        }
        return values[n2];
    }

    static {
        d.lIIIIIlllIlIlIl();
        d.lIIIIIlllIlIlII();
        NONE = new d();
        NARROW = new d();
        LIGHT = new d();
        FLAT = new d();
        BROAD = new d();
        HEAVY = new d();
        SPIKED = new d();
        d[] dArray = new d[llIlIllIIlll[7]];
        dArray[d.llIlIllIIlll[0]] = NONE;
        dArray[d.llIlIllIIlll[1]] = NARROW;
        dArray[d.llIlIllIIlll[2]] = LIGHT;
        dArray[d.llIlIllIIlll[3]] = FLAT;
        dArray[d.llIlIllIIlll[4]] = BROAD;
        dArray[d.llIlIllIIlll[5]] = HEAVY;
        dArray[d.llIlIllIIlll[6]] = SPIKED;
        $VALUES = dArray;
        values = d.values();
    }

    private static boolean lIIIIIlllIllIII(int n2, int n3) {
        return n2 < n3;
    }

    public static d[] values() {
        return (d[])$VALUES.clone();
    }

    private static boolean lIIIIIlllIlIlll(int n2, int n3) {
        return n2 >= n3;
    }

    private static String lIIIIIlllIlIIll(String lllllllllllllllIlIIIIIllIlIIIIlI, String lllllllllllllllIlIIIIIllIlIIIIIl) {
        try {
            SecretKeySpec lllllllllllllllIlIIIIIllIlIIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIIIllIlIIIIIl.getBytes(StandardCharsets.UTF_8)), llIlIllIIlll[8]), "DES");
            Cipher lllllllllllllllIlIIIIIllIlIIIllI = Cipher.getInstance("DES");
            lllllllllllllllIlIIIIIllIlIIIllI.init(llIlIllIIlll[2], lllllllllllllllIlIIIIIllIlIIIlll);
            return new String(lllllllllllllllIlIIIIIllIlIIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIIIllIlIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIIIIllIlIIIlIl) {
            lllllllllllllllIlIIIIIllIlIIIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIIlllIlIllI(int n2) {
        return n2 >= 0;
    }

    private static String lIIIIIlllIlIIlI(String lllllllllllllllIlIIIIIllIlIllIIl, String lllllllllllllllIlIIIIIllIlIlIIll) {
        lllllllllllllllIlIIIIIllIlIllIIl = new String(Base64.getDecoder().decode(lllllllllllllllIlIIIIIllIlIllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIIIIllIlIlIlll = new StringBuilder();
        char[] lllllllllllllllIlIIIIIllIlIlIllI = lllllllllllllllIlIIIIIllIlIlIIll.toCharArray();
        int lllllllllllllllIlIIIIIllIlIlIlIl = llIlIllIIlll[0];
        char[] lllllllllllllllIlIIIIIllIlIIllll = lllllllllllllllIlIIIIIllIlIllIIl.toCharArray();
        int lllllllllllllllIlIIIIIllIlIIlllI = lllllllllllllllIlIIIIIllIlIIllll.length;
        int lllllllllllllllIlIIIIIllIlIIllIl = llIlIllIIlll[0];
        while (d.lIIIIIlllIllIII(lllllllllllllllIlIIIIIllIlIIllIl, lllllllllllllllIlIIIIIllIlIIlllI)) {
            char lllllllllllllllIlIIIIIllIlIllIlI = lllllllllllllllIlIIIIIllIlIIllll[lllllllllllllllIlIIIIIllIlIIllIl];
            lllllllllllllllIlIIIIIllIlIlIlll.append((char)(lllllllllllllllIlIIIIIllIlIllIlI ^ lllllllllllllllIlIIIIIllIlIlIllI[lllllllllllllllIlIIIIIllIlIlIlIl % lllllllllllllllIlIIIIIllIlIlIllI.length]));
            "".length();
            ++lllllllllllllllIlIIIIIllIlIlIlIl;
            ++lllllllllllllllIlIIIIIllIlIIllIl;
            "".length();
            if ("   ".length() > 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIIIIIllIlIlIlll);
    }

    private static void lIIIIIlllIlIlII() {
        llIlIllIIllI = new String[llIlIllIIlll[7]];
        d.llIlIllIIllI[d.llIlIllIIlll[0]] = d.lIIIIIlllIlIIlI("OTUgPw==", "wznzs");
        d.llIlIllIIllI[d.llIlIllIIlll[1]] = d.lIIIIIlllIlIIlI("JDs4ECY9", "jzjBi");
        d.llIlIllIIllI[d.llIlIllIIlll[2]] = d.lIIIIIlllIlIIlI("CRASMRA=", "EYUyD");
        d.llIlIllIIllI[d.llIlIllIIlll[3]] = d.lIIIIIlllIlIIlI("ISkMJw==", "geMsU");
        d.llIlIllIIllI[d.llIlIllIIlll[4]] = d.lIIIIIlllIlIIlI("EycGDSk=", "QuILm");
        d.llIlIllIIllI[d.llIlIllIIlll[5]] = d.lIIIIIlllIlIIll("T11jiPwNs60=", "tqwnz");
        d.llIlIllIIllI[d.llIlIllIIlll[6]] = d.lIIIIIlllIlIIlI("AAg4CA4X", "SXqCK");
    }
}

