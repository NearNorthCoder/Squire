/*
 * Decompiled with CFR 0.152.
 */
package r.e.o.r.h.s.b.e.q.l.e.u.-.i.r;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class HerbType
extends Enum<c> {
    public static final /* synthetic */ /* enum */ c ALL_STAGES;
    private static /* synthetic */ int[] lllIlIIlIIll;
    public static final /* synthetic */ /* enum */ c FINISH_POTS;
    public static final /* synthetic */ /* enum */ c CLEAN_HERBS;
    private static final /* synthetic */ c[] $VALUES;
    public static final /* synthetic */ /* enum */ c MAKE_UNF_POTS;
    public static final /* synthetic */ /* enum */ c ALL_STAGES_ALL_HERBS;
    private static /* synthetic */ String[] lllIlIIlIIIl;

    private static void lIIIlIllllIIIIl() {
        lllIlIIlIIll = new int[6];
        c.lllIlIIlIIll[0] = (0xB2 ^ 0x8B ^ (0x4C ^ 0x6B)) & (0x75 ^ 0x7F ^ (0x70 ^ 0x64) ^ -1);
        c.lllIlIIlIIll[1] = 1;
        c.lllIlIIlIIll[2] = 2;
        c.lllIlIIlIIll[3] = 3;
        c.lllIlIIlIIll[4] = 0x5A ^ 0x2D ^ (0x5B ^ 0x28);
        c.lllIlIIlIIll[5] = 0xC7 ^ 0x80 ^ (0x14 ^ 0x56);
    }

    private static void lIIIlIlllIlllll() {
        lllIlIIlIIIl = new String[lllIlIIlIIll[5]];
        c.lllIlIIlIIIl[c.lllIlIIlIIll[0]] = c."CLEAN_HERBS";
        c.lllIlIIlIIIl[c.lllIlIIlIIll[1]] = c."MAKE_UNF_POTS";
        c.lllIlIIlIIIl[c.lllIlIIlIIll[2]] = c."FINISH_POTS";
        c.lllIlIIlIIIl[c.lllIlIIlIIll[3]] = c."ALL_STAGES";
        c.lllIlIIlIIIl[c.lllIlIIlIIll[4]] = c."ALL_STAGES_ALL_HERBS";
    }

    public static c[] values() {
        return (c[])$VALUES.clone();
    }

    private static boolean lIIIlIllllIIIll(int n, int n2) {
        return n < n2;
    }

    private static String lIIIlIlllIllllI(String var9, String var6) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var3 = Cipher.getInstance("Blowfish");
            var3.init(lllIlIIlIIll[2], var1);
            return new String(var3.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    public static c valueOf(String string) {
        return Enum.valueOf(c.class, string);
    }

    static {
        c.lIIIlIllllIIIIl();
        c.lIIIlIlllIlllll();
        CLEAN_HERBS = new c();
        MAKE_UNF_POTS = new c();
        FINISH_POTS = new c();
        ALL_STAGES = new c();
        ALL_STAGES_ALL_HERBS = new c();
        c[] cArray = new c[lllIlIIlIIll[5]];
        cArray[c.lllIlIIlIIll[0]] = CLEAN_HERBS;
        cArray[c.lllIlIIlIIll[1]] = MAKE_UNF_POTS;
        cArray[c.lllIlIIlIIll[2]] = FINISH_POTS;
        cArray[c.lllIlIIlIIll[3]] = ALL_STAGES;
        cArray[c.lllIlIIlIIll[4]] = ALL_STAGES_ALL_HERBS;
        $VALUES = cArray;
    }

    private static String lIIIlIlllIlllIl(String var13, String var4) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var2 = new StringBuilder();
        char[] var5 = var4.toCharArray();
        int var7 = lllIlIIlIIll[0];
        char[] var14 = var13.toCharArray();
        int var11 = var14.length;
        int var8 = lllIlIIlIIll[0];
        while (c.lIIIlIllllIIIll(var8, var11)) {
            char var12 = var14[var8];
            var2.append((char)(var12 ^ var5[var7 % var5.length]));
            0;
            ++var7;
            ++var8;
            0;
            if (((0x20 ^ 0x7E ^ (0xBA ^ 0xA5)) & (0x39 ^ 0x6E ^ (0x96 ^ 0x80) ^ -1)) >= 0) continue;
            return null;
        }
        return String.valueOf(var2);
    }
}

