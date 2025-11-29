/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;

public final class WEnum
extends Enum<w> {
    private static final /* synthetic */ w[] $VALUES;
    private static /* synthetic */ int[] lIllIlIlIll;
    public static final /* synthetic */ /* enum */ w EAGLE_EYE;
    private static /* synthetic */ String[] lIllIlIlIlI;
    public static final /* synthetic */ /* enum */ w RIGOUR;
    private final /* synthetic */ Prayer mapped;

    private static void lIIlIlllIlIIII() {
        lIllIlIlIll = new int[4];
        w.lIllIlIlIll[0] = (0x16 ^ 0x32 ^ 2) & (0xC0 ^ 0x90 ^ (0x29 ^ 0x5F) ^ -1);
        w.lIllIlIlIll[1] = 1;
        w.lIllIlIlIll[2] = 2;
        w.lIllIlIlIll[3] = 0xAC ^ 0xA4;
    }

    private w(Prayer prayer) {
        this.mapped = prayer;
    }

    private static String lIIlIlllIIlllI(String var5, String var8) {
        var5 = new String(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var10 = new StringBuilder();
        char[] var11 = var8.toCharArray();
        int var1 = lIllIlIlIll[0];
        char[] var14 = var5.toCharArray();
        int var7 = var14.length;
        int var4 = lIllIlIlIll[0];
        while (w.lIIlIlllIlIIIl(var4, var7)) {
            char var2 = var14[var4];
            var10.append((char)(var2 ^ var11[var1 % var11.length]));
            0;
            ++var1;
            ++var4;
            0;
            if ((0x41 ^ 0x17 ^ (0x1F ^ 0x4D)) != ((0x26 ^ 0x75 ^ (0x75 ^ 0x70)) & (0x8C ^ 0xC2 ^ (0x60 ^ 0x78) ^ -1))) continue;
            return null;
        }
        return String.valueOf(var10);
    }

    public Prayer ag() {
        return this.mapped;
    }

    public static w[] values() {
        return (w[])$VALUES.clone();
    }

    static {
        w.lIIlIlllIlIIII();
        w.lIIlIlllIIllll();
        RIGOUR = new w(Prayer.RIGOUR);
        EAGLE_EYE = new w(Prayer.EAGLE_EYE);
        w[] wArray = new w[lIllIlIlIll[2]];
        wArray[w.lIllIlIlIll[0]] = RIGOUR;
        wArray[w.lIllIlIlIll[1]] = EAGLE_EYE;
        $VALUES = wArray;
    }

    private static String lIIlIlllIIllIl(String var3, String var9) {
        try {
            SecretKeySpec var13 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var9.getBytes(StandardCharsets.UTF_8)), lIllIlIlIll[3]), "DES");
            Cipher var12 = Cipher.getInstance("DES");
            var12.init(lIllIlIlIll[2], var13);
            return new String(var12.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    private static void lIIlIlllIIllll() {
        lIllIlIlIlI = new String[lIllIlIlIll[2]];
        w.lIllIlIlIlI[w.lIllIlIlIll[0]] = w."RIGOUR";
        w.lIllIlIlIlI[w.lIllIlIlIll[1]] = w."EAGLE_EYE";
    }

    public static w valueOf(String string) {
        return Enum.valueOf(w.class, string);
    }

    private static boolean lIIlIlllIlIIIl(int n2, int n3) {
        return n2 < n3;
    }
}

