/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package s.s.e.u.p.i.r.r.-.q.a.e.k.r.l.u.i.p.e.t.-;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;

public final class a
extends Enum<a> {
    private static /* synthetic */ int[] lIlIIlIlIIlIl;
    private static /* synthetic */ String[] lIlIIlIlIIlII;
    private final /* synthetic */ WorldPoint worldPoint;
    private static final /* synthetic */ a[] $VALUES;
    public static final /* synthetic */ /* enum */ a KONAR;
    public static final /* synthetic */ /* enum */ a NIEVE;
    public static final /* synthetic */ /* enum */ a DURADEl;

    private static String lIlllIlIllllIIl(String var8, String var1) {
        var8 = new String(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var19 = var1.toCharArray();
        int var6 = lIlIIlIlIIlIl[0];
        char[] var14 = var8.toCharArray();
        int var7 = var14.length;
        int var18 = lIlIIlIlIIlIl[0];
        while (a.lIlllIlIlllllIl(var18, var7)) {
            char var10 = var14[var18];
            var12.append((char)(var10 ^ var19[var6 % var19.length]));
            0;
            ++var6;
            ++var18;
            0;
            if (3 >= 0) continue;
            return null;
        }
        return String.valueOf(var12);
    }

    static {
        a.lIlllIlIlllllII();
        a.lIlllIlIllllIll();
        NIEVE = new a(new WorldPoint(lIlIIlIlIIlIl[1], lIlIIlIlIIlIl[2], lIlIIlIlIIlIl[0]));
        DURADEl = new a(new WorldPoint(lIlIIlIlIIlIl[4], lIlIIlIlIIlIl[5], lIlIIlIlIIlIl[3]));
        KONAR = new a(new WorldPoint(lIlIIlIlIIlIl[7], lIlIIlIlIIlIl[8], lIlIIlIlIIlIl[0]));
        a[] aArray = new a[lIlIIlIlIIlIl[9]];
        aArray[a.lIlIIlIlIIlIl[0]] = NIEVE;
        aArray[a.lIlIIlIlIIlIl[3]] = DURADEl;
        aArray[a.lIlIIlIlIIlIl[6]] = KONAR;
        $VALUES = aArray;
    }

    public static a valueOf(String string) {
        return Enum.valueOf(a.class, string);
    }

    private static void lIlllIlIllllIll() {
        lIlIIlIlIIlII = new String[lIlIIlIlIIlIl[9]];
        a.lIlIIlIlIIlII[a.lIlIIlIlIIlIl[0]] = a."NIEVE";
        a.lIlIIlIlIIlII[a.lIlIIlIlIIlIl[3]] = a."DURADEl";
        a.lIlIIlIlIIlII[a.lIlIIlIlIIlIl[6]] = a."KONAR";
    }

    private static void lIlllIlIlllllII() {
        lIlIIlIlIIlIl = new int[11];
        a.lIlIIlIlIIlIl[0] = (0x49 ^ 0x6C ^ (0x91 ^ 0xA3)) & (0xB6 ^ 0x9F ^ (0x83 ^ 0xBD) ^ -1);
        a.lIlIIlIlIIlIl[1] = -(0xFFFFEBFB & 0x346E) & (0xFFFFBDEF & 0x6BFB);
        a.lIlIIlIlIIlIl[2] = -(0xFFFFB6AB & 0x7B55) & (0xFFFFBF5F & Short.MAX_VALUE);
        a.lIlIIlIlIIlIl[3] = 1;
        a.lIlIIlIlIIlIl[4] = -(0xFFFFFECF & 0x71F3) & (0xFFFFFFFF & 0x7BF7);
        a.lIlIIlIlIIlIl[5] = -(0xFFFFB5EF & 0x7E1A) & (0xFFFFFFBD & 0x3FEF);
        a.lIlIIlIlIIlIl[6] = 2;
        a.lIlIIlIlIIlIl[7] = -(0xFFFFCE47 & 0x33B9) & (0xFFFFA75D & 0x5FBE);
        a.lIlIIlIlIIlIl[8] = 0xFFFFBEED & 0x4FDE;
        a.lIlIIlIlIIlIl[9] = 3;
        a.lIlIIlIlIIlIl[10] = 0x39 ^ 0x78 ^ (0xE4 ^ 0xAD);
    }

    private static String lIlllIlIllllIII(String var4, String var11) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var11.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var13 = Cipher.getInstance("Blowfish");
            var13.init(lIlIIlIlIIlIl[6], var3);
            return new String(var13.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    public static a[] values() {
        return (a[])$VALUES.clone();
    }

    private static String lIlllIlIllllIlI(String var9, String var17) {
        try {
            SecretKeySpec var15 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var17.getBytes(StandardCharsets.UTF_8)), lIlIIlIlIIlIl[10]), "DES");
            Cipher var2 = Cipher.getInstance("DES");
            var2.init(lIlIIlIlIIlIl[6], var15);
            return new String(var2.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    public WorldPoint k() {
        return this.worldPoint;
    }

    private static boolean lIlllIlIlllllIl(int n2, int n3) {
        return n2 < n3;
    }

    private a(WorldPoint worldPoint) {
        this.worldPoint = worldPoint;
    }
}

