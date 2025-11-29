/*
 * Decompiled with CFR 0.152.
 */
package e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class QEnum
extends Enum<q> {
    private static final /* synthetic */ q[] $VALUES;
    public static final /* synthetic */ /* enum */ q SHARK;
    public static final /* synthetic */ /* enum */ q SWORDFISH;
    public static final /* synthetic */ /* enum */ q PIKE;
    private static /* synthetic */ int[] lllIIIIIIIlI;
    public static final /* synthetic */ /* enum */ q TROUT;
    public static final /* synthetic */ /* enum */ q KARAMBWAN;
    public static final /* synthetic */ /* enum */ q JUG_OF_WINE;
    private final /* synthetic */ int itemId;
    public static final /* synthetic */ /* enum */ q SALMON;
    public static final /* synthetic */ /* enum */ q DARK_CRAB;
    public static final /* synthetic */ /* enum */ q TUNA;
    public static final /* synthetic */ /* enum */ q STEW;
    private static /* synthetic */ String[] lllIIIIIIIIl;
    public static final /* synthetic */ /* enum */ q MANTA_RAY;
    private final /* synthetic */ int healAmount;
    public static final /* synthetic */ /* enum */ q SEA_TURTLE;
    public static final /* synthetic */ /* enum */ q LOBSTER;
    public static final /* synthetic */ /* enum */ q BASS;

    private static boolean lIIIlIIIIIIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIIlIIIIIIIlll() {
        lllIIIIIIIIl = new String[lllIIIIIIIlI[23]];
        q.lllIIIIIIIIl[q.lllIIIIIIIlI[0]] = q."TROUT";
        q.lllIIIIIIIIl[q.lllIIIIIIIlI[3]] = q."PIKE";
        q.lllIIIIIIIIl[q.lllIIIIIIIlI[6]] = q."SALMON";
        q.lllIIIIIIIIl[q.lllIIIIIIIlI[9]] = q."TUNA";
        q.lllIIIIIIIIl[q.lllIIIIIIIlI[12]] = q."STEW";
        q.lllIIIIIIIIl[q.lllIIIIIIIlI[15]] = q."JUG_OF_WINE";
        q.lllIIIIIIIIl[q.lllIIIIIIIlI[17]] = q."LOBSTER";
        q.lllIIIIIIIIl[q.lllIIIIIIIlI[2]] = q."BASS";
        q.lllIIIIIIIIl[q.lllIIIIIIIlI[5]] = q."SWORDFISH";
        q.lllIIIIIIIIl[q.lllIIIIIIIlI[8]] = q."KARAMBWAN";
        q.lllIIIIIIIIl[q.lllIIIIIIIlI[11]] = q."SHARK";
        q.lllIIIIIIIIl[q.lllIIIIIIIlI[14]] = q."SEA_TURTLE";
        q.lllIIIIIIIIl[q.lllIIIIIIIlI[19]] = q."MANTA_RAY";
        q.lllIIIIIIIIl[q.lllIIIIIIIlI[21]] = q."DARK_CRAB";
    }

    private static void lIIIlIIIIIIlIII() {
        lllIIIIIIIlI = new int[33];
        q.lllIIIIIIIlI[0] = (0xAF ^ 0x82 ^ (0x6D ^ 2)) & (15 + 196 - 150 + 167 ^ 95 + 164 - 133 + 40 ^ -1);
        q.lllIIIIIIIlI[1] = 0xFFFFCB5F & 0x35ED;
        q.lllIIIIIIIlI[2] = 0xE ^ 9;
        q.lllIIIIIIIlI[3] = 1;
        q.lllIIIIIIIlI[4] = -(0xFFFFDE8F & 0x65F1) & (0xFFFFF5DF & 0x4FFF);
        q.lllIIIIIIIlI[5] = 0x87 ^ 0x8F;
        q.lllIIIIIIIlI[6] = 2;
        q.lllIIIIIIIlI[7] = 0xFFFF8DFF & 0x7349;
        q.lllIIIIIIIlI[8] = 0x77 ^ 0x7E;
        q.lllIIIIIIIlI[9] = 3;
        q.lllIIIIIIIlI[10] = 0xFFFFDB6F & 0x25F9;
        q.lllIIIIIIIlI[11] = 0x4C ^ 0x46;
        q.lllIIIIIIIlI[12] = 0x47 ^ 0x43;
        q.lllIIIIIIIlI[13] = -(0xFFFFEEAB & 0x7175) & (0xFFFFF7FF & 0x6FF3);
        q.lllIIIIIIIlI[14] = 0x9B ^ 0x90;
        q.lllIIIIIIIlI[15] = 0x26 ^ 0x23;
        q.lllIIIIIIIlI[16] = -(0xFFFFE405 & 0x7BFF) & (0xFFFFF7EF & 0x6FDD);
        q.lllIIIIIIIlI[17] = 0x77 ^ 0x71;
        q.lllIIIIIIIlI[18] = 0xFFFF897B & 0x77FF;
        q.lllIIIIIIIlI[19] = 169 + 30 - 187 + 177 ^ 165 + 31 - 128 + 109;
        q.lllIIIIIIIlI[20] = -(0xFFFFDEBB & 0x33D7) & (0xFFFFF7FF & 0x1BFF);
        q.lllIIIIIIIlI[21] = 0x65 ^ 0x68;
        q.lllIIIIIIIlI[22] = 0xFFFFB575 & 0x4BFF;
        q.lllIIIIIIIlI[23] = 0x76 ^ 0x17 ^ (0x5D ^ 0x32);
        q.lllIIIIIIIlI[24] = -(0xFFFFFBB5 & 0x27FE) & (0xFFFFBFFF & 0x6FFB);
        q.lllIIIIIIIlI[25] = 0x8F ^ 0x9D;
        q.lllIIIIIIIlI[26] = 0xFFFFD9E3 & 0x279D;
        q.lllIIIIIIIlI[27] = 0x4E ^ 0x5A;
        q.lllIIIIIIIlI[28] = 0xFFFFB3EF & 0x4D9D;
        q.lllIIIIIIIlI[29] = 0x59 ^ 0x4C;
        q.lllIIIIIIIlI[30] = 0xFFFFB9C7 & 0x47BF;
        q.lllIIIIIIIlI[31] = 0x8C ^ 0x9A;
        q.lllIIIIIIIlI[32] = 0xFFFFFFF1 & 0x2EAE;
    }

    public static q[] values() {
        return (q[])$VALUES.clone();
    }

    public int V() {
        return this.itemId;
    }

    private static String lIIIlIIIIIIIllI(String var14, String var10) {
        try {
            SecretKeySpec var19 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var10.getBytes(StandardCharsets.UTF_8)), lllIIIIIIIlI[5]), "DES");
            Cipher var1 = Cipher.getInstance("DES");
            var1.init(lllIIIIIIIlI[6], var19);
            return new String(var1.doFinal(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var2) {
            var2.printStackTrace();
            return null;
        }
    }

    private q(int n3, int n4) {
        this.itemId = n3;
        this.healAmount = n4;
    }

    public static q valueOf(String string) {
        return Enum.valueOf(q.class, string);
    }

    public int W() {
        return this.healAmount;
    }

    private static String lIIIlIIIIIIIlIl(String var15, String var4) {
        try {
            SecretKeySpec var12 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var9 = Cipher.getInstance("Blowfish");
            var9.init(lllIIIIIIIlI[6], var12);
            return new String(var9.doFinal(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    static {
        q.lIIIlIIIIIIlIII();
        q.lIIIlIIIIIIIlll();
        TROUT = new q(lllIIIIIIIlI[1], lllIIIIIIIlI[2]);
        PIKE = new q(lllIIIIIIIlI[4], lllIIIIIIIlI[5]);
        SALMON = new q(lllIIIIIIIlI[7], lllIIIIIIIlI[8]);
        TUNA = new q(lllIIIIIIIlI[10], lllIIIIIIIlI[11]);
        STEW = new q(lllIIIIIIIlI[13], lllIIIIIIIlI[14]);
        JUG_OF_WINE = new q(lllIIIIIIIlI[16], lllIIIIIIIlI[14]);
        LOBSTER = new q(lllIIIIIIIlI[18], lllIIIIIIIlI[19]);
        BASS = new q(lllIIIIIIIlI[20], lllIIIIIIIlI[21]);
        SWORDFISH = new q(lllIIIIIIIlI[22], lllIIIIIIIlI[23]);
        KARAMBWAN = new q(lllIIIIIIIlI[24], lllIIIIIIIlI[25]);
        SHARK = new q(lllIIIIIIIlI[26], lllIIIIIIIlI[27]);
        SEA_TURTLE = new q(lllIIIIIIIlI[28], lllIIIIIIIlI[29]);
        MANTA_RAY = new q(lllIIIIIIIlI[30], lllIIIIIIIlI[31]);
        DARK_CRAB = new q(lllIIIIIIIlI[32], lllIIIIIIIlI[31]);
        q[] qArray = new q[lllIIIIIIIlI[23]];
        qArray[q.lllIIIIIIIlI[0]] = TROUT;
        qArray[q.lllIIIIIIIlI[3]] = PIKE;
        qArray[q.lllIIIIIIIlI[6]] = SALMON;
        qArray[q.lllIIIIIIIlI[9]] = TUNA;
        qArray[q.lllIIIIIIIlI[12]] = STEW;
        qArray[q.lllIIIIIIIlI[15]] = JUG_OF_WINE;
        qArray[q.lllIIIIIIIlI[17]] = LOBSTER;
        qArray[q.lllIIIIIIIlI[2]] = BASS;
        qArray[q.lllIIIIIIIlI[5]] = SWORDFISH;
        qArray[q.lllIIIIIIIlI[8]] = KARAMBWAN;
        qArray[q.lllIIIIIIIlI[11]] = SHARK;
        qArray[q.lllIIIIIIIlI[14]] = SEA_TURTLE;
        qArray[q.lllIIIIIIIlI[19]] = MANTA_RAY;
        qArray[q.lllIIIIIIIlI[21]] = DARK_CRAB;
        $VALUES = qArray;
    }

    private static String lIIIlIIIIIIIlII(String var11, String var16) {
        var11 = new String(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var5 = var16.toCharArray();
        int var3 = lllIIIIIIIlI[0];
        char[] var8 = var11.toCharArray();
        int var18 = var8.length;
        int var13 = lllIIIIIIIlI[0];
        while (q.lIIIlIIIIIIlIIl(var13, var18)) {
            char var7 = var8[var13];
            var6.append((char)(var7 ^ var5[var3 % var5.length]));
            0;
            ++var3;
            ++var13;
            0;
            if (1 >= 0) continue;
            return null;
        }
        return String.valueOf(var6);
    }
}

