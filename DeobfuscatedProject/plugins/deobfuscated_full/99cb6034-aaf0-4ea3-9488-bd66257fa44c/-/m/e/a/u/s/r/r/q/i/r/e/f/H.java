/*
 * Decompiled with CFR 0.152.
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.I;
import -.m.e.a.u.s.r.r.q.i.r.e.f.K;
import -.m.e.a.u.s.r.r.q.i.r.e.f.au;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class H
extends Enum<H> {
    public static final /* synthetic */ /* enum */ H LUNAR_SPELL;
    private static /* synthetic */ String[] lIllllllIlII;
    private static final /* synthetic */ H[] $VALUES;
    private static /* synthetic */ int[] lIllllllIllI;
    private final /* synthetic */ int id;
    private final /* synthetic */ K equipment;
    public static final /* synthetic */ /* enum */ H SUPERCOMPOST;
    public static final /* synthetic */ /* enum */ H COMPOST;
    public static final /* synthetic */ /* enum */ H ULTRACOMPOST;

    static {
        H.llllIIIIIllIII();
        H.llllIIIIIIlllI();
        COMPOST = new H(lIllllllIllI[1], K.COMPOST);
        SUPERCOMPOST = new H(lIllllllIllI[3], K.SUPER_COMPOST);
        ULTRACOMPOST = new H(lIllllllIllI[5], K.ULTRA_COMPOST);
        LUNAR_SPELL = new H(lIllllllIllI[7], null);
        H[] hArray = new H[lIllllllIllI[8]];
        hArray[H.lIllllllIllI[0]] = COMPOST;
        hArray[H.lIllllllIllI[2]] = SUPERCOMPOST;
        hArray[H.lIllllllIllI[4]] = ULTRACOMPOST;
        hArray[H.lIllllllIllI[6]] = LUNAR_SPELL;
        $VALUES = hArray;
    }

    private static void llllIIIIIIlllI() {
        lIllllllIlII = new String[lIllllllIllI[8]];
        H.lIllllllIlII[H.lIllllllIllI[0]] = H."COMPOST";
        H.lIllllllIlII[H.lIllllllIllI[2]] = H."SUPERCOMPOST";
        H.lIllllllIlII[H.lIllllllIllI[4]] = H."ULTRACOMPOST";
        H.lIllllllIlII[H.lIllllllIllI[6]] = H."LUNAR_SPELL";
    }

    public static H[] values() {
        return (H[])$VALUES.clone();
    }

    public static H valueOf(String string) {
        return Enum.valueOf(H.class, string);
    }

    private static String llllIIIIIIllIl(String var4, String var16) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var13 = var16.toCharArray();
        int var2 = lIllllllIllI[0];
        char[] var15 = var4.toCharArray();
        int var7 = var15.length;
        int var8 = lIllllllIllI[0];
        while (H.llllIIIIIllIIl(var8, var7)) {
            char var5 = var15[var8];
            var14.append((char)(var5 ^ var13[var2 % var13.length]));
            0;
            ++var2;
            ++var8;
            0;
            if (2 > -1) continue;
            return null;
        }
        return String.valueOf(var14);
    }

    private static boolean llllIIIIIllIIl(int n2, int n3) {
        return n2 < n3;
    }

    public static H c(au au2) {
        switch (I.bm[au2.ordinal()]) {
            case 1: 
            case 2: {
                return ULTRACOMPOST;
            }
            case 3: 
            case 4: {
                return SUPERCOMPOST;
            }
            case 5: 
            case 6: {
                return COMPOST;
            }
        }
        return null;
    }

    public int aB() {
        return this.id;
    }

    public K aC() {
        return this.equipment;
    }

    private static String llllIIIIIIllII(String var1, String var17) {
        try {
            SecretKeySpec var6 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var17.getBytes(StandardCharsets.UTF_8)), lIllllllIllI[9]), "DES");
            Cipher var9 = Cipher.getInstance("DES");
            var9.init(lIllllllIllI[4], var6);
            return new String(var9.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    private static void llllIIIIIllIII() {
        lIllllllIllI = new int[10];
        H.lIllllllIllI[0] = (0x29 ^ 0x62) & ~(0x41 ^ 0xA);
        H.lIllllllIllI[1] = 0xFFFF97BA & 0x7FD5;
        H.lIllllllIllI[2] = 1;
        H.lIllllllIllI[3] = -(0xFFFFEDEE & 0x7A77) & (0xFFFFFFFF & 0x7FF7);
        H.lIllllllIllI[4] = 2;
        H.lIllllllIllI[5] = 0xFFFFD7FB & 0x7BEF;
        H.lIllllllIllI[6] = 3;
        H.lIllllllIllI[7] = -1;
        H.lIllllllIllI[8] = 0x55 ^ 0x51;
        H.lIllllllIllI[9] = 0x36 ^ 0x3E;
    }

    private H(int n3, K k2) {
        this.id = n3;
        this.equipment = k2;
    }

    private static String llllIIIIIIlIll(String var10, String var3) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var12 = Cipher.getInstance("Blowfish");
            var12.init(lIllllllIllI[4], var11);
            return new String(var12.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }
}

