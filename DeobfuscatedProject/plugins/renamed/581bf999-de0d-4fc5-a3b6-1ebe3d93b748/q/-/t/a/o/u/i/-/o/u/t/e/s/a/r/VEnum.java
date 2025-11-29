/*
 * Decompiled with CFR 0.152.
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class VEnum
extends Enum<v> {
    public static final /* synthetic */ /* enum */ v FLICK;
    private static /* synthetic */ String[] llIIIlIIIll;
    private static /* synthetic */ int[] llIIIlIIlII;
    private static final /* synthetic */ v[] $VALUES;
    public static final /* synthetic */ /* enum */ v NORMAL;
    public static final /* synthetic */ /* enum */ v NONE;

    public static v valueOf(String string) {
        return Enum.valueOf(v.class, string);
    }

    private static String lIIlllIlllllll(String var8, String var10) {
        var8 = new String(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var13 = new StringBuilder();
        char[] var9 = var10.toCharArray();
        int var6 = llIIIlIIlII[0];
        char[] var11 = var8.toCharArray();
        int var2 = var11.length;
        int var7 = llIIIlIIlII[0];
        while (v.lIIllllIIIIIlI(var7, var2)) {
            char var5 = var11[var7];
            var13.append((char)(var5 ^ var9[var6 % var9.length]));
            0;
            ++var6;
            ++var7;
            0;
            if ((5 ^ 1) != 1) continue;
            return null;
        }
        return String.valueOf(var13);
    }

    public static v[] values() {
        return (v[])$VALUES.clone();
    }

    static {
        v.lIIllllIIIIIIl();
        v.lIIllllIIIIIII();
        NONE = new v();
        NORMAL = new v();
        FLICK = new v();
        v[] vArray = new v[llIIIlIIlII[3]];
        vArray[v.llIIIlIIlII[0]] = NONE;
        vArray[v.llIIIlIIlII[1]] = NORMAL;
        vArray[v.llIIIlIIlII[2]] = FLICK;
        $VALUES = vArray;
    }

    private static void lIIllllIIIIIIl() {
        llIIIlIIlII = new int[4];
        v.llIIIlIIlII[0] = (101 + 173 - 137 + 111 ^ 40 + 135 - 169 + 146) & (0x6B ^ 0x28 ^ (0x17 ^ 0x34) ^ -1);
        v.llIIIlIIlII[1] = 1;
        v.llIIIlIIlII[2] = 2;
        v.llIIIlIIlII[3] = 3;
    }

    private static void lIIllllIIIIIII() {
        llIIIlIIIll = new String[llIIIlIIlII[3]];
        v.llIIIlIIIll[v.llIIIlIIlII[0]] = v."NONE";
        v.llIIIlIIIll[v.llIIIlIIlII[1]] = v."NORMAL";
        v.llIIIlIIIll[v.llIIIlIIlII[2]] = v."FLICK";
    }

    private static String lIIlllIllllllI(String var12, String var1) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var14 = Cipher.getInstance("Blowfish");
            var14.init(llIIIlIIlII[2], var3);
            return new String(var14.doFinal(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var4) {
            var4.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllllIIIIIlI(int n2, int n3) {
        return n2 < n3;
    }
}

