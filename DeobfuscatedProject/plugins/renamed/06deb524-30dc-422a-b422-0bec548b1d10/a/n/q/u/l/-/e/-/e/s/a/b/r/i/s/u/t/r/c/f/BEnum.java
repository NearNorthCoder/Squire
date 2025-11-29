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

public final class BEnum
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
        void var11;
        String string2 = string.toUpperCase();
        if (B.llIIllIlllIIlI(string2.contains(lIIlIlllllIl[lIIlIllllllI[0]]) ? 1 : 0)) {
            return IRON.R();
        }
        if (B.llIIllIlllIIlI(var11.contains(lIIlIlllllIl[lIIlIllllllI[1]]) ? 1 : 0)) {
            return MITHRIL.R();
        }
        if (B.llIIllIlllIIlI(var11.contains(lIIlIlllllIl[lIIlIllllllI[2]]) ? 1 : 0)) {
            return ADAMANTITE.R();
        }
        if (B.llIIllIlllIIlI(var11.contains(lIIlIlllllIl[lIIlIllllllI[3]]) ? 1 : 0)) {
            return RUNITE.R();
        }
        return lIIlIllllllI[0];
    }

    public int R() {
        return this.value;
    }

    private static String llIIllIllIllll(String var3, String var7) {
        try {
            SecretKeySpec var16 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var13 = Cipher.getInstance("Blowfish");
            var13.init(lIIlIllllllI[2], var16);
            return new String(var13.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var15) {
            var15.printStackTrace();
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

    private static String llIIllIllIlllI(String var10, String var1) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var19 = var1.toCharArray();
        int var17 = lIIlIllllllI[0];
        char[] var14 = var10.toCharArray();
        int var20 = var14.length;
        int var8 = lIIlIllllllI[0];
        while (B.llIIllIlllIIll(var8, var20)) {
            char var12 = var14[var8];
            var6.append((char)(var12 ^ var19[var17 % var19.length]));
            0;
            ++var17;
            ++var8;
            0;
            
            return null;
        }
        return String.valueOf(var6);
    }

    private static boolean llIIllIlllIIlI(int n2) {
        return n2 != 0;
    }

    public static B[] values() {
        return (B[])$VALUES.clone();
    }

    private static String llIIllIllIllIl(String var2, String var4) {
        try {
            SecretKeySpec var18 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), lIIlIllllllI[8]), "DES");
            Cipher var9 = Cipher.getInstance("DES");
            var9.init(lIIlIllllllI[2], var18);
            return new String(var9.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
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

