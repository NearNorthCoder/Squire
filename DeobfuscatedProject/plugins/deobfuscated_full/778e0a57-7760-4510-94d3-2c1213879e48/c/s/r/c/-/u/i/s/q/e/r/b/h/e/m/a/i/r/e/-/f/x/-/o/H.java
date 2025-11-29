/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.G;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.I;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.S;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.n;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;

public final class H
extends Enum<H> {
    /* synthetic */ G west;
    public static final /* synthetic */ /* enum */ H CRABS_SINGLE;
    public static final /* synthetic */ /* enum */ H CRABS_DOUBLE_1;
    private static /* synthetic */ int[] lIlIlIlIIlll;
    public static final /* synthetic */ /* enum */ H CRABS_MOVABLE_3;
    private static /* synthetic */ String[] lIlIlIlIIllI;
    public static final /* synthetic */ /* enum */ H TEKTON_START;
    /* synthetic */ G east;
    public static final /* synthetic */ /* enum */ H CRABS_MOVABLE_4;
    public static final /* synthetic */ /* enum */ H CRABS_MOVABLE_1;
    /* synthetic */ G north;
    public static final /* synthetic */ /* enum */ H MYSTICS_SAFESPOT;
    public static final /* synthetic */ /* enum */ H CRABS_BASE_1;
    public static final /* synthetic */ /* enum */ H CRABS_DOUBLE_2;
    public static final /* synthetic */ /* enum */ H CRABS_BASE_2;
    public static final /* synthetic */ /* enum */ H VESPULA_ATTACK_POINT;
    private static final /* synthetic */ H[] $VALUES;
    public static final /* synthetic */ /* enum */ H CRABS_MOVABLE_2;

    private static void llIlllIllllIll() {
        lIlIlIlIIllI = new String[lIlIlIlIIlll[23]];
        H.lIlIlIlIIllI[H.lIlIlIlIIlll[0]] = H."TEKTON_START";
        H.lIlIlIlIIllI[H.lIlIlIlIIlll[4]] = H."CRABS_BASE_1";
        H.lIlIlIlIIllI[H.lIlIlIlIIlll[10]] = H."CRABS_BASE_2";
        H.lIlIlIlIIllI[H.lIlIlIlIIlll[14]] = H."CRABS_MOVABLE_1";
        H.lIlIlIlIIllI[H.lIlIlIlIIlll[16]] = H."CRABS_MOVABLE_2";
        H.lIlIlIlIIllI[H.lIlIlIlIIlll[18]] = H."CRABS_MOVABLE_3";
        H.lIlIlIlIIllI[H.lIlIlIlIIlll[20]] = H."CRABS_MOVABLE_4";
        H.lIlIlIlIIllI[H.lIlIlIlIIlll[8]] = H."CRABS_SINGLE";
        H.lIlIlIlIIllI[H.lIlIlIlIIlll[12]] = H."CRABS_DOUBLE_1";
        H.lIlIlIlIIllI[H.lIlIlIlIIlll[6]] = H."CRABS_DOUBLE_2";
        H.lIlIlIlIIllI[H.lIlIlIlIIlll[2]] = H."MYSTICS_SAFESPOT";
        H.lIlIlIlIIllI[H.lIlIlIlIIlll[21]] = H."VESPULA_ATTACK_POINT";
    }

    public static H[] values() {
        return (H[])$VALUES.clone();
    }

    public G d(n n2) {
        S s2 = n2.bx;
        switch (I.cc[s2.ordinal()]) {
            case 1: {
                H var20;
                return var20.east;
            }
            case 2: {
                H var20;
                return var20.north;
            }
            case 3: {
                H var20;
                return var20.west;
            }
        }
        return this.east;
    }

    private static String llIlllIllllIII(String var8, String var10) {
        try {
            SecretKeySpec var6 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var10.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var16 = Cipher.getInstance("Blowfish");
            var16.init(lIlIlIlIIlll[10], var6);
            return new String(var16.doFinal(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    static {
        H.llIlllIlllllII();
        H.llIlllIllllIll();
        TEKTON_START = new H(new G(lIlIlIlIIlll[1], lIlIlIlIIlll[2]), new G(lIlIlIlIIlll[3], lIlIlIlIIlll[1]), new G(lIlIlIlIIlll[1], lIlIlIlIIlll[2]));
        CRABS_BASE_1 = new H(new G(lIlIlIlIIlll[5], lIlIlIlIIlll[6]), new G(lIlIlIlIIlll[7], lIlIlIlIIlll[7]), new G(lIlIlIlIIlll[8], lIlIlIlIIlll[9]));
        CRABS_BASE_2 = new H(new G(lIlIlIlIIlll[11], lIlIlIlIIlll[8]), new G(lIlIlIlIIlll[7], lIlIlIlIIlll[7]), new G(lIlIlIlIIlll[12], lIlIlIlIIlll[13]));
        CRABS_MOVABLE_1 = new H(new G(lIlIlIlIIlll[15], lIlIlIlIIlll[12]), new G(lIlIlIlIIlll[7], lIlIlIlIIlll[7]), new G(lIlIlIlIIlll[2], lIlIlIlIIlll[1]));
        CRABS_MOVABLE_2 = new H(new G(lIlIlIlIIlll[17], lIlIlIlIIlll[12]), new G(lIlIlIlIIlll[7], lIlIlIlIIlll[7]), new G(lIlIlIlIIlll[9], lIlIlIlIIlll[1]));
        CRABS_MOVABLE_3 = new H(new G(lIlIlIlIIlll[19], lIlIlIlIIlll[12]), new G(lIlIlIlIIlll[7], lIlIlIlIIlll[7]), new G(lIlIlIlIIlll[7], lIlIlIlIIlll[7]));
        CRABS_MOVABLE_4 = new H(new G(lIlIlIlIIlll[9], lIlIlIlIIlll[12]), new G(lIlIlIlIIlll[7], lIlIlIlIIlll[7]), new G(lIlIlIlIIlll[7], lIlIlIlIIlll[7]));
        CRABS_SINGLE = new H(new G(lIlIlIlIIlll[7], lIlIlIlIIlll[7]), new G(lIlIlIlIIlll[7], lIlIlIlIIlll[7]), new G(lIlIlIlIIlll[21], lIlIlIlIIlll[9]));
        CRABS_DOUBLE_1 = new H(new G(lIlIlIlIIlll[7], lIlIlIlIIlll[7]), new G(lIlIlIlIIlll[7], lIlIlIlIIlll[7]), new G(lIlIlIlIIlll[2], lIlIlIlIIlll[9]));
        CRABS_DOUBLE_2 = new H(new G(lIlIlIlIIlll[7], lIlIlIlIIlll[7]), new G(lIlIlIlIIlll[7], lIlIlIlIIlll[7]), new G(lIlIlIlIIlll[21], lIlIlIlIIlll[11]));
        MYSTICS_SAFESPOT = new H(new G(lIlIlIlIIlll[6], lIlIlIlIIlll[6]), new G(lIlIlIlIIlll[15], lIlIlIlIIlll[15]), new G(lIlIlIlIIlll[15], lIlIlIlIIlll[6]));
        VESPULA_ATTACK_POINT = new H(new G(lIlIlIlIIlll[22], lIlIlIlIIlll[23]), new G(lIlIlIlIIlll[1], lIlIlIlIIlll[12]), new G(lIlIlIlIIlll[19], lIlIlIlIIlll[23]));
        H[] hArray = new H[lIlIlIlIIlll[23]];
        hArray[H.lIlIlIlIIlll[0]] = TEKTON_START;
        hArray[H.lIlIlIlIIlll[4]] = CRABS_BASE_1;
        hArray[H.lIlIlIlIIlll[10]] = CRABS_BASE_2;
        hArray[H.lIlIlIlIIlll[14]] = CRABS_MOVABLE_1;
        hArray[H.lIlIlIlIIlll[16]] = CRABS_MOVABLE_2;
        hArray[H.lIlIlIlIIlll[18]] = CRABS_MOVABLE_3;
        hArray[H.lIlIlIlIIlll[20]] = CRABS_MOVABLE_4;
        hArray[H.lIlIlIlIIlll[8]] = CRABS_SINGLE;
        hArray[H.lIlIlIlIIlll[12]] = CRABS_DOUBLE_1;
        hArray[H.lIlIlIlIIlll[6]] = CRABS_DOUBLE_2;
        hArray[H.lIlIlIlIIlll[2]] = MYSTICS_SAFESPOT;
        hArray[H.lIlIlIlIIlll[21]] = VESPULA_ATTACK_POINT;
        $VALUES = hArray;
    }

    private static boolean llIlllIlllllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String llIlllIllllIlI(String var2, String var5) {
        try {
            SecretKeySpec var15 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), lIlIlIlIIlll[12]), "DES");
            Cipher var12 = Cipher.getInstance("DES");
            var12.init(lIlIlIlIIlll[10], var15);
            return new String(var12.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    private static void llIlllIlllllII() {
        lIlIlIlIIlll = new int[24];
        H.lIlIlIlIIlll[0] = (0x12 ^ 0x42) & ~(0x2A ^ 0x7A);
        H.lIlIlIlIIlll[1] = 0x6D ^ 0x62;
        H.lIlIlIlIIlll[2] = 0x5F ^ 0x65 ^ (0xF1 ^ 0xC1);
        H.lIlIlIlIIlll[3] = 0x7D ^ 0x68;
        H.lIlIlIlIIlll[4] = 1;
        H.lIlIlIlIIlll[5] = 4 ^ 0x1D;
        H.lIlIlIlIIlll[6] = 0x22 ^ 0x2B;
        H.lIlIlIlIIlll[7] = -1;
        H.lIlIlIlIIlll[8] = 165 + 166 - 224 + 65 ^ 99 + 74 - 82 + 80;
        H.lIlIlIlIIlll[9] = 0x9C ^ 0x92;
        H.lIlIlIlIIlll[10] = 2;
        H.lIlIlIlIIlll[11] = 0xB2 ^ 0xAA;
        H.lIlIlIlIIlll[12] = 20 + 57 - -51 + 10 ^ 91 + 115 - 171 + 95;
        H.lIlIlIlIIlll[13] = 0xAB ^ 0xBB;
        H.lIlIlIlIIlll[14] = 3;
        H.lIlIlIlIIlll[15] = 0xA8 ^ 0xBE;
        H.lIlIlIlIIlll[16] = 66 + 167 - 142 + 83 ^ 163 + 106 - 268 + 169;
        H.lIlIlIlIIlll[17] = 0x38 ^ 0x72 ^ (0xCA ^ 0x92);
        H.lIlIlIlIIlll[18] = 0x8A ^ 0x8F;
        H.lIlIlIlIIlll[19] = 0x80 ^ 0x91;
        H.lIlIlIlIIlll[20] = 0x62 ^ 9 ^ (0x75 ^ 0x18);
        H.lIlIlIlIIlll[21] = 0x5A ^ 0x51;
        H.lIlIlIlIIlll[22] = 4 + 93 - -66 + 19 ^ 59 + 91 - 142 + 179;
        H.lIlIlIlIIlll[23] = 0x1F ^ 0x13;
    }

    private static String llIlllIllllIIl(String var1, String var17) {
        var1 = new String(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var19 = var17.toCharArray();
        int var4 = lIlIlIlIIlll[0];
        char[] var13 = var1.toCharArray();
        int var18 = var13.length;
        int var14 = lIlIlIlIIlll[0];
        while (H.llIlllIlllllIl(var14, var18)) {
            char var7 = var13[var14];
            var9.append((char)(var7 ^ var19[var4 % var19.length]));
            0;
            ++var4;
            ++var14;
            0;
            
            return null;
        }
        return String.valueOf(var9);
    }

    private H(G g2, G g3, G g4) {
        this.west = g2;
        this.north = g3;
        this.east = g4;
    }

    public WorldPoint c(n n2) {
        char c2 = n2.bu;
        WorldPoint worldPoint = n2.bq;
        S s2 = n2.bx;
        return this.d(n2).c(c2, worldPoint);
    }

    public static H valueOf(String string) {
        return Enum.valueOf(H.class, string);
    }
}

