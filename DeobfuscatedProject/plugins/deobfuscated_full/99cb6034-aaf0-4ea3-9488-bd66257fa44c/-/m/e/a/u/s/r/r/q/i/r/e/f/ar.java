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

public final class ar
extends Enum<ar>
implements aw {
    private final /* synthetic */ av produceSeed;
    private static /* synthetic */ int[] lIlllIIIIlll;
    public static final /* synthetic */ /* enum */ ar NASTURTIUM;
    public static final /* synthetic */ /* enum */ ar LIMPWURT;
    private static /* synthetic */ String[] lIlllIIIIllI;
    public static final /* synthetic */ /* enum */ ar MARIGOLD;
    public static final /* synthetic */ /* enum */ ar NOTHING;
    public static final /* synthetic */ /* enum */ ar DEFAULT;
    private static final /* synthetic */ ar[] $VALUES;

    private static void lllIlIlIllllIl() {
        lIlllIIIIllI = new String[lIlllIIIIlll[5]];
        ar.lIlllIIIIllI[ar.lIlllIIIIlll[0]] = ar."NOTHING";
        ar.lIlllIIIIllI[ar.lIlllIIIIlll[1]] = ar."DEFAULT";
        ar.lIlllIIIIllI[ar.lIlllIIIIlll[2]] = ar."MARIGOLD";
        ar.lIlllIIIIllI[ar.lIlllIIIIlll[3]] = ar."NASTURTIUM";
        ar.lIlllIIIIllI[ar.lIlllIIIIlll[4]] = ar."LIMPWURT";
    }

    private static boolean lllIlIllIIIIII(int n2, int n3) {
        return n2 < n3;
    }

    private static String lllIlIlIllllII(String var2, String var15) {
        try {
            SecretKeySpec var14 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var15.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var5 = Cipher.getInstance("Blowfish");
            var5.init(lIlllIIIIlll[2], var14);
            return new String(var5.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    static {
        ar.lllIlIlIllllll();
        ar.lllIlIlIllllIl();
        NOTHING = new ar(null);
        DEFAULT = new ar(av.DEFAULT);
        MARIGOLD = new ar(av.MARIGOLD);
        NASTURTIUM = new ar(av.NASTURTIUM);
        LIMPWURT = new ar(av.LIMPWURT);
        ar[] arArray = new ar[lIlllIIIIlll[5]];
        arArray[ar.lIlllIIIIlll[0]] = NOTHING;
        arArray[ar.lIlllIIIIlll[1]] = DEFAULT;
        arArray[ar.lIlllIIIIlll[2]] = MARIGOLD;
        arArray[ar.lIlllIIIIlll[3]] = NASTURTIUM;
        arArray[ar.lIlllIIIIlll[4]] = LIMPWURT;
        $VALUES = arArray;
    }

    private static String lllIlIlIlllIll(String var16, String var7) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), lIlllIIIIlll[6]), "DES");
            Cipher var13 = Cipher.getInstance("DES");
            var13.init(lIlllIIIIlll[2], var11);
            return new String(var13.doFinal(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    @Override
    public av bf() {
        return this.produceSeed;
    }

    private ar(av av2) {
        this.produceSeed = av2;
    }

    private static String lllIlIlIlllIlI(String var4, String var10) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var19 = new StringBuilder();
        char[] var8 = var10.toCharArray();
        int var17 = lIlllIIIIlll[0];
        char[] var18 = var4.toCharArray();
        int var9 = var18.length;
        int var3 = lIlllIIIIlll[0];
        while (ar.lllIlIllIIIIII(var3, var9)) {
            char var12 = var18[var3];
            var19.append((char)(var12 ^ var8[var17 % var8.length]));
            0;
            ++var17;
            ++var3;
            0;
            if (((0x7B ^ 0x34 ^ (0x46 ^ 0x17)) & (58 + 73 - 120 + 128 ^ 106 + 44 - 96 + 95 ^ -1)) <= 2) continue;
            return null;
        }
        return String.valueOf(var19);
    }

    public static ar valueOf(String string) {
        return Enum.valueOf(ar.class, string);
    }

    private static void lllIlIlIllllll() {
        lIlllIIIIlll = new int[7];
        ar.lIlllIIIIlll[0] = (0x43 ^ 0xB) & ~(0xF1 ^ 0xB9);
        ar.lIlllIIIIlll[1] = 1;
        ar.lIlllIIIIlll[2] = 2;
        ar.lIlllIIIIlll[3] = 3;
        ar.lIlllIIIIlll[4] = 0x6C ^ 0x7D ^ (0xD7 ^ 0xC2);
        ar.lIlllIIIIlll[5] = 0x1E ^ 0xE ^ (0x1C ^ 9);
        ar.lIlllIIIIlll[6] = 0xA8 ^ 0xA7 ^ (0x67 ^ 0x60);
    }

    public static ar[] values() {
        return (ar[])$VALUES.clone();
    }
}

