/*
 * Decompiled with CFR 0.152.
 */
package a.u.i.-.l.r.h.z.s.r.u.q.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class q
extends Enum<q> {
    private static /* synthetic */ String[] lIllIlIllIlII;
    private static final /* synthetic */ q[] $VALUES;
    private final /* synthetic */ int quantity;
    public static final /* synthetic */ /* enum */ q CHARTER_SHIP;
    public static final /* synthetic */ /* enum */ q ZUL_ANDRA_TELEPORT;
    private static /* synthetic */ int[] lIllIlIllIlIl;
    private final /* synthetic */ int[] items;
    public static final /* synthetic */ /* enum */ q FAIRY_RING;

    private static void llIIlIIIIlIllII() {
        lIllIlIllIlIl = new int[9];
        q.lIllIlIllIlIl[0] = (0xDE ^ 0x8D ^ (0x17 ^ 0)) & (0x93 ^ 0xA4 ^ (0xD5 ^ 0xA6) ^ -1);
        q.lIllIlIllIlIl[1] = 1;
        q.lIllIlIllIlIl[2] = 0xFFFFB3CA & 0x7EBF;
        q.lIllIlIllIlIl[3] = 2;
        q.lIllIlIllIlIl[4] = 0xFFFFA77C & 0x7BFF;
        q.lIllIlIllIlIl[5] = 0xFFFFBFE6 & 0x431D;
        q.lIllIlIllIlIl[6] = -(0xFFFFFC5B & 0x2FF7) & (0xFFFFFFDF & 0x3FFA);
        q.lIllIlIllIlIl[7] = -(0xFFFFCC9B & 0x7B77) & (0xFFFFCFFB & 0x7A7F);
        q.lIllIlIllIlIl[8] = 3;
    }

    public static q[] values() {
        return (q[])$VALUES.clone();
    }

    private static boolean llIIlIIIIlIllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void llIIlIIIIlIlIll() {
        lIllIlIllIlII = new String[lIllIlIllIlIl[8]];
        q.lIllIlIllIlII[q.lIllIlIllIlIl[0]] = q."ZUL_ANDRA_TELEPORT";
        q.lIllIlIllIlII[q.lIllIlIllIlIl[1]] = q."FAIRY_RING";
        q.lIllIlIllIlII[q.lIllIlIllIlIl[3]] = q."CHARTER_SHIP";
    }

    public int[] K() {
        return this.items;
    }

    static {
        q.llIIlIIIIlIllII();
        q.llIIlIIIIlIlIll();
        int[] nArray = new int[lIllIlIllIlIl[1]];
        nArray[q.lIllIlIllIlIl[0]] = lIllIlIllIlIl[2];
        ZUL_ANDRA_TELEPORT = new q(lIllIlIllIlIl[1], nArray);
        int[] nArray2 = new int[lIllIlIllIlIl[3]];
        nArray2[q.lIllIlIllIlIl[0]] = lIllIlIllIlIl[4];
        nArray2[q.lIllIlIllIlIl[1]] = lIllIlIllIlIl[5];
        FAIRY_RING = new q(lIllIlIllIlIl[1], nArray2);
        int[] nArray3 = new int[lIllIlIllIlIl[1]];
        nArray3[q.lIllIlIllIlIl[0]] = lIllIlIllIlIl[7];
        CHARTER_SHIP = new q(lIllIlIllIlIl[6], nArray3);
        q[] qArray = new q[lIllIlIllIlIl[8]];
        qArray[q.lIllIlIllIlIl[0]] = ZUL_ANDRA_TELEPORT;
        qArray[q.lIllIlIllIlIl[1]] = FAIRY_RING;
        qArray[q.lIllIlIllIlIl[3]] = CHARTER_SHIP;
        $VALUES = qArray;
    }

    public static q valueOf(String string) {
        return Enum.valueOf(q.class, string);
    }

    private q(int n3, int ... nArray) {
        this.quantity = n3;
        this.items = nArray;
    }

    private static String llIIlIIIIlIIIlI(String var1, String var8) {
        try {
            SecretKeySpec var13 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var8.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var14 = Cipher.getInstance("Blowfish");
            var14.init(lIllIlIllIlIl[3], var13);
            return new String(var14.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    public int J() {
        return this.quantity;
    }

    private static String llIIlIIIIlIlIlI(String var4, String var11) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var7 = new StringBuilder();
        char[] var5 = var11.toCharArray();
        int var2 = lIllIlIllIlIl[0];
        char[] var12 = var4.toCharArray();
        int var9 = var12.length;
        int var10 = lIllIlIllIlIl[0];
        while (q.llIIlIIIIlIllIl(var10, var9)) {
            char var6 = var12[var10];
            var7.append((char)(var6 ^ var5[var2 % var5.length]));
            0;
            ++var2;
            ++var10;
            0;
            if (-1 < 3) continue;
            return null;
        }
        return String.valueOf(var7);
    }
}

