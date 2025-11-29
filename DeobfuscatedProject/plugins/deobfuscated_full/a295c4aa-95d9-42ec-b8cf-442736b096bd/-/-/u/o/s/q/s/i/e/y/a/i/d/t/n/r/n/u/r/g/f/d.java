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
        d.llIlIllIIlll[1] = 1;
        d.llIlIllIIlll[2] = 2;
        d.llIlIllIIlll[3] = 3;
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

    private static String lIIIIIlllIlIIll(String var1, String var2) {
        try {
            SecretKeySpec var10 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), llIlIllIIlll[8]), "DES");
            Cipher var8 = Cipher.getInstance("DES");
            var8.init(llIlIllIIlll[2], var10);
            return new String(var8.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIIlllIlIllI(int n2) {
        return n2 >= 0;
    }

    private static String lIIIIIlllIlIIlI(String var7, String var12) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var13 = new StringBuilder();
        char[] var6 = var12.toCharArray();
        int var11 = llIlIllIIlll[0];
        char[] var5 = var7.toCharArray();
        int var9 = var5.length;
        int var4 = llIlIllIIlll[0];
        while (d.lIIIIIlllIllIII(var4, var9)) {
            char var3 = var5[var4];
            var13.append((char)(var3 ^ var6[var11 % var6.length]));
            0;
            ++var11;
            ++var4;
            0;
            if (3 > 0) continue;
            return null;
        }
        return String.valueOf(var13);
    }

    private static void lIIIIIlllIlIlII() {
        llIlIllIIllI = new String[llIlIllIIlll[7]];
        d.llIlIllIIllI[d.llIlIllIIlll[0]] = d."NONE";
        d.llIlIllIIllI[d.llIlIllIIlll[1]] = d."NARROW";
        d.llIlIllIIllI[d.llIlIllIIlll[2]] = d."LIGHT";
        d.llIlIllIIllI[d.llIlIllIIlll[3]] = d."FLAT";
        d.llIlIllIIllI[d.llIlIllIIlll[4]] = d."BROAD";
        d.llIlIllIIllI[d.llIlIllIIlll[5]] = d."HEAVY";
        d.llIlIllIIllI[d.llIlIllIIlll[6]] = d."SPIKED";
    }
}

