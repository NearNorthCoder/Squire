/*
 * Decompiled with CFR 0.152.
 */
package o.m.-.g.q.i.l.i.r.y.o.e.x.u.s;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class DEnum
extends Enum<d> {
    private static /* synthetic */ String[] lllllllIIlIl;
    public static final /* synthetic */ /* enum */ d CREATE_PASTE;
    private static final /* synthetic */ d[] $VALUES;
    public static final /* synthetic */ /* enum */ d MINIGAME;
    private static /* synthetic */ int[] lllllllIIllI;

    private static String lIIlIlIlIIIllll(String var8, String var14) {
        var8 = new String(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var10 = new StringBuilder();
        char[] var11 = var14.toCharArray();
        int var13 = lllllllIIllI[0];
        char[] var5 = var8.toCharArray();
        int var4 = var5.length;
        int var2 = lllllllIIllI[0];
        while (d.lIIlIlIlIIlIIll(var2, var4)) {
            char var6 = var5[var2];
            var10.append((char)(var6 ^ var11[var13 % var11.length]));
            0;
            ++var13;
            ++var2;
            0;
            if (1 <= 1) continue;
            return null;
        }
        return String.valueOf(var10);
    }

    public static d[] values() {
        return (d[])$VALUES.clone();
    }

    public static d valueOf(String string) {
        return Enum.valueOf(d.class, string);
    }

    static {
        d.lIIlIlIlIIlIIlI();
        d.lIIlIlIlIIlIIIl();
        MINIGAME = new d();
        CREATE_PASTE = new d();
        d[] dArray = new d[lllllllIIllI[2]];
        dArray[d.lllllllIIllI[0]] = MINIGAME;
        dArray[d.lllllllIIllI[1]] = CREATE_PASTE;
        $VALUES = dArray;
    }

    private static void lIIlIlIlIIlIIIl() {
        lllllllIIlIl = new String[lllllllIIllI[2]];
        d.lllllllIIlIl[d.lllllllIIllI[0]] = d."MINIGAME";
        d.lllllllIIlIl[d.lllllllIIllI[1]] = d."CREATE_PASTE";
    }

    private static String lIIlIlIlIIlIIII(String var12, String var7) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var9 = Cipher.getInstance("Blowfish");
            var9.init(lllllllIIllI[2], var3);
            return new String(var9.doFinal(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    private static void lIIlIlIlIIlIIlI() {
        lllllllIIllI = new int[3];
        d.lllllllIIllI[0] = (0x38 ^ 0x5B ^ (0xC4 ^ 0xBA)) & (69 + 108 - 71 + 41 ^ 128 + 38 - 129 + 105 ^ -1);
        d.lllllllIIllI[1] = 1;
        d.lllllllIIllI[2] = 2;
    }

    private static boolean lIIlIlIlIIlIIll(int n2, int n3) {
        return n2 < n3;
    }
}

