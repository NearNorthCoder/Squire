/*
 * Decompiled with CFR 0.152.
 */
package u.i.r.d.s.e.r.q.y.a.h.-;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class l
extends Enum<l> {
    private static /* synthetic */ int[] llllIIlIIlII;
    public static final /* synthetic */ /* enum */ l DONE;
    public static final /* synthetic */ /* enum */ l MOVING;
    private static final /* synthetic */ l[] $VALUES;
    private static /* synthetic */ String[] llllIIlIIIII;
    public static final /* synthetic */ /* enum */ l WAITING;

    public static l[] values() {
        return (l[])$VALUES.clone();
    }

    private static String lIIIllllIlllIlI(String var13, String var15) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var15.getBytes(StandardCharsets.UTF_8)), llllIIlIIlII[4]), "DES");
            Cipher var14 = Cipher.getInstance("DES");
            var14.init(llllIIlIIlII[2], var11);
            return new String(var14.doFinal(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    static {
        l.lIIIlllllIIllII();
        l.lIIIllllIllllIl();
        WAITING = new l();
        MOVING = new l();
        DONE = new l();
        l[] lArray = new l[llllIIlIIlII[3]];
        lArray[l.llllIIlIIlII[0]] = WAITING;
        lArray[l.llllIIlIIlII[1]] = MOVING;
        lArray[l.llllIIlIIlII[2]] = DONE;
        $VALUES = lArray;
    }

    private static String lIIIllllIllllII(String var12, String var5) {
        try {
            SecretKeySpec var9 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var8 = Cipher.getInstance("Blowfish");
            var8.init(llllIIlIIlII[2], var9);
            return new String(var8.doFinal(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var4) {
            var4.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlllllIIllIl(int n2, int n3) {
        return n2 < n3;
    }

    public static l valueOf(String string) {
        return Enum.valueOf(l.class, string);
    }

    private static String lIIIllllIlllIll(String var7, String var19) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var1 = var19.toCharArray();
        int var3 = llllIIlIIlII[0];
        char[] var10 = var7.toCharArray();
        int var18 = var10.length;
        int var17 = llllIIlIIlII[0];
        while (l.lIIIlllllIIllIl(var17, var18)) {
            char var2 = var10[var17];
            var6.append((char)(var2 ^ var1[var3 % var1.length]));
            0;
            ++var3;
            ++var17;
            0;
            if (-3 < 0) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    private static void lIIIllllIllllIl() {
        llllIIlIIIII = new String[llllIIlIIlII[3]];
        l.llllIIlIIIII[l.llllIIlIIlII[0]] = l."WAITING";
        l.llllIIlIIIII[l.llllIIlIIlII[1]] = l."MOVING";
        l.llllIIlIIIII[l.llllIIlIIlII[2]] = l."DONE";
    }

    private static void lIIIlllllIIllII() {
        llllIIlIIlII = new int[5];
        l.llllIIlIIlII[0] = (0x1A ^ 0x67 ^ (0x51 ^ 0xE)) & (162 + 99 - 168 + 77 ^ 56 + 1 - -73 + 6 ^ -1);
        l.llllIIlIIlII[1] = 1;
        l.llllIIlIIlII[2] = 2;
        l.llllIIlIIlII[3] = 3;
        l.llllIIlIIlII[4] = 0x9F ^ 0x97;
    }
}

