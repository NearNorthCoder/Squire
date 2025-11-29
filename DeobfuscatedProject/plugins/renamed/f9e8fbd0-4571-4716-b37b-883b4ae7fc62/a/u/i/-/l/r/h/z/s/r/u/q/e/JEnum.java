/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package a.u.i.-.l.r.h.z.s.r.u.q.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;

public final class JEnum
extends Enum<j> {
    public static final /* synthetic */ /* enum */ j EAGLE_EYE;
    public static final /* synthetic */ /* enum */ j RIGOUR;
    private static /* synthetic */ int[] lIllIlIllIIII;
    private final /* synthetic */ Prayer prayer;
    private static final /* synthetic */ j[] $VALUES;
    private static /* synthetic */ String[] lIllIlIlIlllI;

    private static String llIIlIIIIIlIllI(String var11, String var9) {
        var11 = new String(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var3 = new StringBuilder();
        char[] var2 = var9.toCharArray();
        int var6 = lIllIlIllIIII[0];
        char[] var14 = var11.toCharArray();
        int var7 = var14.length;
        int var13 = lIllIlIllIIII[0];
        while (j.llIIlIIIIIllIll(var13, var7)) {
            char var12 = var14[var13];
            var3.append((char)(var12 ^ var2[var6 % var2.length]));
            0;
            ++var6;
            ++var13;
            0;
            
            return null;
        }
        return String.valueOf(var3);
    }

    private static boolean llIIlIIIIIllIll(int n2, int n3) {
        return n2 < n3;
    }

    private static void llIIlIIIIIlIlll() {
        lIllIlIlIlllI = new String[lIllIlIllIIII[2]];
        j.lIllIlIlIlllI[j.lIllIlIllIIII[0]] = j."EAGLE_EYE";
        j.lIllIlIlIlllI[j.lIllIlIllIIII[1]] = j."RIGOUR";
    }

    private j(Prayer prayer) {
        this.prayer = prayer;
    }

    static {
        j.llIIlIIIIIllIlI();
        j.llIIlIIIIIlIlll();
        EAGLE_EYE = new j(Prayer.EAGLE_EYE);
        RIGOUR = new j(Prayer.RIGOUR);
        j[] jArray = new j[lIllIlIllIIII[2]];
        jArray[j.lIllIlIllIIII[0]] = EAGLE_EYE;
        jArray[j.lIllIlIllIIII[1]] = RIGOUR;
        $VALUES = jArray;
    }

    private static void llIIlIIIIIllIlI() {
        lIllIlIllIIII = new int[3];
        j.lIllIlIllIIII[0] = (0xC5 ^ 0x90) & ~(0x33 ^ 0x66);
        j.lIllIlIllIIII[1] = 1;
        j.lIllIlIllIIII[2] = 2;
    }

    public static j valueOf(String string) {
        return Enum.valueOf(j.class, string);
    }

    public static j[] values() {
        return (j[])$VALUES.clone();
    }

    private static String llIIlIIIIIlIlIl(String var4, String var1) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var8 = Cipher.getInstance("Blowfish");
            var8.init(lIllIlIllIIII[2], var5);
            return new String(var8.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    public Prayer r() {
        return this.prayer;
    }
}

