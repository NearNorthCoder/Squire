/*
 * Decompiled with CFR 0.152.
 */
package s.h.-.m.a.n.u.r.i.s.q.a.s.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class e
extends Enum<e> {
    private static /* synthetic */ String[] lIIlIlllIIlIl;
    public static final /* synthetic */ /* enum */ e DARK_CRAB;
    private static /* synthetic */ int[] lIIlIlllIIllI;
    public static final /* synthetic */ /* enum */ e LOBSTER;
    public static final /* synthetic */ /* enum */ e KARAMBWAN;
    public static final /* synthetic */ /* enum */ e SHARK;
    public static final /* synthetic */ /* enum */ e SWORDFISH;
    public static final /* synthetic */ /* enum */ e MONKFISH;
    private final /* synthetic */ int id;
    public static final /* synthetic */ /* enum */ e MANTA_RAY;
    public static final /* synthetic */ /* enum */ e ANGLERFISH;
    private static final /* synthetic */ e[] $VALUES;

    private static String lIlIllIllIlIIIl(String var16, String var14) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var14.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var15 = Cipher.getInstance("Blowfish");
            var15.init(lIIlIlllIIllI[4], var8);
            return new String(var15.doFinal(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var2) {
            var2.printStackTrace();
            return null;
        }
    }

    private static String lIlIllIllIlIIlI(String var3, String var9) {
        try {
            SecretKeySpec var17 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var9.getBytes(StandardCharsets.UTF_8)), lIIlIlllIIllI[16]), "DES");
            Cipher var11 = Cipher.getInstance("DES");
            var11.init(lIIlIlllIIllI[4], var17);
            return new String(var11.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    private static void lIlIllIllIlIlIl() {
        lIIlIlllIIllI = new int[17];
        e.lIIlIlllIIllI[0] = (0x37 ^ 0x2D) & ~(0x4A ^ 0x50);
        e.lIIlIlllIIllI[1] = -(0xFFFFF6D1 & 0x5BBF) & (0xFFFFDFDC & 0x7EFB);
        e.lIIlIlllIIllI[2] = 1;
        e.lIIlIlllIIllI[3] = 0xFFFFFFDE & 0x1F2B;
        e.lIIlIlllIIllI[4] = 2;
        e.lIIlIlllIIllI[5] = -(0xFFFFDFCF & 0x723F) & (0xFFFFD3CF & 0x7FBF);
        e.lIIlIlllIIllI[6] = 3;
        e.lIIlIlllIIllI[7] = 0xFFFF9FF7 & 0x618F;
        e.lIIlIlllIIllI[8] = 0x5D ^ 0x59;
        e.lIIlIlllIIllI[9] = 0xFFFFB3FF & 0x4D7B;
        e.lIIlIlllIIllI[10] = 55 + 39 - -20 + 72 ^ 80 + 116 - 31 + 26;
        e.lIIlIlllIIllI[11] = -(0xFFFFFDCB & 0x6E3D) & (0xFFFFFFFF & 0x6D7D);
        e.lIIlIlllIIllI[12] = 0x20 ^ 0x26;
        e.lIIlIlllIIllI[13] = -(0xFFFF951F & 0x7AFF) & (0xFFFFBEFE & 0x7FBF);
        e.lIIlIlllIIllI[14] = 0x93 ^ 0x94;
        e.lIIlIlllIIllI[15] = -(0xFFFFEBFF & 0x5D3B) & (0xFFFFFDBF & 0x7FFB);
        e.lIIlIlllIIllI[16] = 0x66 ^ 0x6E;
    }

    private e(int n3) {
        this.id = n3;
    }

    private static String lIlIllIllIlIIll(String var10, String var12) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var5 = new StringBuilder();
        char[] var6 = var12.toCharArray();
        int var1 = lIIlIlllIIllI[0];
        char[] var4 = var10.toCharArray();
        int var7 = var4.length;
        int var13 = lIIlIlllIIllI[0];
        while (e.lIlIllIllIlIllI(var13, var7)) {
            char var18 = var4[var13];
            var5.append((char)(var18 ^ var6[var1 % var6.length]));
            0;
            ++var1;
            ++var13;
            0;
            if (-1 >= -1) continue;
            return null;
        }
        return String.valueOf(var5);
    }

    public static e[] values() {
        return (e[])$VALUES.clone();
    }

    private static void lIlIllIllIlIlII() {
        lIIlIlllIIlIl = new String[lIIlIlllIIllI[16]];
        e.lIIlIlllIIlIl[e.lIIlIlllIIllI[0]] = e."KARAMBWAN";
        e.lIIlIlllIIlIl[e.lIIlIlllIIllI[2]] = e."MONKFISH";
        e.lIIlIlllIIlIl[e.lIIlIlllIIllI[4]] = e."SHARK";
        e.lIIlIlllIIlIl[e.lIIlIlllIIllI[6]] = e."MANTA_RAY";
        e.lIIlIlllIIlIl[e.lIIlIlllIIllI[8]] = e."LOBSTER";
        e.lIIlIlllIIlIl[e.lIIlIlllIIllI[10]] = e."SWORDFISH";
        e.lIIlIlllIIlIl[e.lIIlIlllIIllI[12]] = e."DARK_CRAB";
        e.lIIlIlllIIlIl[e.lIIlIlllIIllI[14]] = e."ANGLERFISH";
    }

    public static e valueOf(String string) {
        return Enum.valueOf(e.class, string);
    }

    public int w() {
        return this.id;
    }

    private static boolean lIlIllIllIlIllI(int n2, int n3) {
        return n2 < n3;
    }

    static {
        e.lIlIllIllIlIlIl();
        e.lIlIllIllIlIlII();
        KARAMBWAN = new e(lIIlIlllIIllI[1]);
        MONKFISH = new e(lIIlIlllIIllI[3]);
        SHARK = new e(lIIlIlllIIllI[5]);
        MANTA_RAY = new e(lIIlIlllIIllI[7]);
        LOBSTER = new e(lIIlIlllIIllI[9]);
        SWORDFISH = new e(lIIlIlllIIllI[11]);
        DARK_CRAB = new e(lIIlIlllIIllI[13]);
        ANGLERFISH = new e(lIIlIlllIIllI[15]);
        e[] eArray = new e[lIIlIlllIIllI[16]];
        eArray[e.lIIlIlllIIllI[0]] = KARAMBWAN;
        eArray[e.lIIlIlllIIllI[2]] = MONKFISH;
        eArray[e.lIIlIlllIIllI[4]] = SHARK;
        eArray[e.lIIlIlllIIllI[6]] = MANTA_RAY;
        eArray[e.lIIlIlllIIllI[8]] = LOBSTER;
        eArray[e.lIIlIlllIIllI[10]] = SWORDFISH;
        eArray[e.lIIlIlllIIllI[12]] = DARK_CRAB;
        eArray[e.lIIlIlllIIllI[14]] = ANGLERFISH;
        $VALUES = eArray;
    }
}

