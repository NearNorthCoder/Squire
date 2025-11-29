/*
 * Decompiled with CFR 0.152.
 */
package -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f;

import -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.h;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class g
extends Enum<g> {
    private final /* synthetic */ h temperature;
    private static /* synthetic */ int[] llIlIlllllII;
    private final /* synthetic */ int spriteId;
    private final /* synthetic */ int objectId;
    public static final /* synthetic */ /* enum */ g POLISH;
    private static final /* synthetic */ g[] $VALUES;
    public static final /* synthetic */ /* enum */ g GRINDSTONE;
    public static final /* synthetic */ /* enum */ g HAMMER;
    private static /* synthetic */ String[] llIlIllllIll;

    static {
        g.lIIIIlIIIIlIlII();
        g.lIIIIlIIIIlIIll();
        HAMMER = new g(h.RED, llIlIlllllII[1], llIlIlllllII[2]);
        GRINDSTONE = new g(h.YELLOW, llIlIlllllII[4], llIlIlllllII[5]);
        POLISH = new g(h.GREEN, llIlIlllllII[7], llIlIlllllII[8]);
        g[] gArray = new g[llIlIlllllII[9]];
        gArray[g.llIlIlllllII[0]] = HAMMER;
        gArray[g.llIlIlllllII[3]] = GRINDSTONE;
        gArray[g.llIlIlllllII[6]] = POLISH;
        $VALUES = gArray;
    }

    private static void lIIIIlIIIIlIlII() {
        llIlIlllllII = new int[11];
        g.llIlIlllllII[0] = (0xDB ^ 0xBA) & ~(0xD5 ^ 0xB4);
        g.llIlIlllllII[1] = -(0xFFFFFA77 & 0x4FAA) & (0xFFFFDFFF & 0x7B7B);
        g.llIlIlllllII[2] = 0xFFFFAF4B & 0xFEFF;
        g.llIlIlllllII[3] = 1;
        g.llIlIlllllII[4] = -(0xFFFFEFBF & 0x12E1) & (0xFFFFBBFF & 0x57FB);
        g.llIlIlllllII[5] = -(0xFFFFE1F3 & 0x5F1D) & (0xFFFFEFDD & 0xFF7E);
        g.llIlIlllllII[6] = 2;
        g.llIlIlllllII[7] = -(0xFFFFF5A7 & 0x6EDC) & (0xFFFFF5DF & Short.MAX_VALUE);
        g.llIlIlllllII[8] = 0xFFFFAFFD & 0xFE4F;
        g.llIlIlllllII[9] = 3;
        g.llIlIlllllII[10] = 0x5A ^ 0x52;
    }

    public static g[] values() {
        return (g[])$VALUES.clone();
    }

    public h H() {
        return this.temperature;
    }

    private static String lIIIIlIIIIlIIIl(String var17, String var12) {
        var17 = new String(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var18 = new StringBuilder();
        char[] var4 = var12.toCharArray();
        int var19 = llIlIlllllII[0];
        char[] var2 = var17.toCharArray();
        int var11 = var2.length;
        int var16 = llIlIlllllII[0];
        while (g.lIIIIlIIIIlIlIl(var16, var11)) {
            char var7 = var2[var16];
            var18.append((char)(var7 ^ var4[var19 % var4.length]));
            0;
            ++var19;
            ++var16;
            0;
            if (-1 < 1) continue;
            return null;
        }
        return String.valueOf(var18);
    }

    private static void lIIIIlIIIIlIIll() {
        llIlIllllIll = new String[llIlIlllllII[9]];
        g.llIlIllllIll[g.llIlIlllllII[0]] = g."HAMMER";
        g.llIlIllllIll[g.llIlIlllllII[3]] = g."GRINDSTONE";
        g.llIlIllllIll[g.llIlIlllllII[6]] = g."POLISH";
    }

    private static String lIIIIlIIIIlIIlI(String var14, String var8) {
        try {
            SecretKeySpec var13 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var8.getBytes(StandardCharsets.UTF_8)), llIlIlllllII[10]), "DES");
            Cipher var15 = Cipher.getInstance("DES");
            var15.init(llIlIlllllII[6], var13);
            return new String(var15.doFinal(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIlIIIIlIlIl(int n2, int n3) {
        return n2 < n3;
    }

    public static g valueOf(String string) {
        return Enum.valueOf(g.class, string);
    }

    private static String lIIIIlIIIIlIIII(String var1, String var9) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var9.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var10 = Cipher.getInstance("Blowfish");
            var10.init(llIlIlllllII[6], var5);
            return new String(var10.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    public int J() {
        return this.objectId;
    }

    private g(h h2, int n3, int n4) {
        this.temperature = h2;
        this.spriteId = n3;
        this.objectId = n4;
    }

    public int I() {
        return this.spriteId;
    }
}

