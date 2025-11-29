/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package -.r.u.q.e.s.o.t.a.i;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;

public final class m
extends Enum<m> {
    private static /* synthetic */ String[] lIlIIIIIIIlll;
    private final /* synthetic */ Prayer mapped;
    private static final /* synthetic */ m[] $VALUES;
    public static final /* synthetic */ /* enum */ m PIETY;
    public static final /* synthetic */ /* enum */ m CHIVALRY;
    public static final /* synthetic */ /* enum */ m ULTIMATE_STRENGTH;
    private static /* synthetic */ int[] lIlIIIIIIlIII;

    static {
        m.lIllIlIlllIIllI();
        m.lIllIlIlllIIlIl();
        PIETY = new m(Prayer.PIETY);
        CHIVALRY = new m(Prayer.CHIVALRY);
        ULTIMATE_STRENGTH = new m(Prayer.ULTIMATE_STRENGTH);
        m[] mArray = new m[lIlIIIIIIlIII[3]];
        mArray[m.lIlIIIIIIlIII[0]] = PIETY;
        mArray[m.lIlIIIIIIlIII[1]] = CHIVALRY;
        mArray[m.lIlIIIIIIlIII[2]] = ULTIMATE_STRENGTH;
        $VALUES = mArray;
    }

    private static boolean lIllIlIlllIIlll(int n2, int n3) {
        return n2 < n3;
    }

    public static m valueOf(String string) {
        return Enum.valueOf(m.class, string);
    }

    public static m[] values() {
        return (m[])$VALUES.clone();
    }

    private static String lIllIlIlllIIlII(String var12, String var1) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var2 = new StringBuilder();
        char[] var9 = var1.toCharArray();
        int var11 = lIlIIIIIIlIII[0];
        char[] var3 = var12.toCharArray();
        int var8 = var3.length;
        int var4 = lIlIIIIIIlIII[0];
        while (m.lIllIlIlllIIlll(var4, var8)) {
            char var5 = var3[var4];
            var2.append((char)(var5 ^ var9[var11 % var9.length]));
            0;
            ++var11;
            ++var4;
            0;
            
            return null;
        }
        return String.valueOf(var2);
    }

    private static String lIllIlIlllIIIll(String var14, String var10) {
        try {
            SecretKeySpec var6 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var10.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var13 = Cipher.getInstance("Blowfish");
            var13.init(lIlIIIIIIlIII[2], var6);
            return new String(var13.doFinal(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }

    public Prayer z() {
        return this.mapped;
    }

    private static void lIllIlIlllIIlIl() {
        lIlIIIIIIIlll = new String[lIlIIIIIIlIII[3]];
        m.lIlIIIIIIIlll[m.lIlIIIIIIlIII[0]] = m."PIETY";
        m.lIlIIIIIIIlll[m.lIlIIIIIIlIII[1]] = m."CHIVALRY";
        m.lIlIIIIIIIlll[m.lIlIIIIIIlIII[2]] = m."ULTIMATE_STRENGTH";
    }

    private static void lIllIlIlllIIllI() {
        lIlIIIIIIlIII = new int[4];
        m.lIlIIIIIIlIII[0] = (0x79 ^ 0x65 ^ (0x6C ^ 0x46)) & (0x46 ^ 0x22 ^ (0x32 ^ 0x60) ^ -1);
        m.lIlIIIIIIlIII[1] = 1;
        m.lIlIIIIIIlIII[2] = 2;
        m.lIlIIIIIIlIII[3] = 3;
    }

    private m(Prayer prayer) {
        this.mapped = prayer;
    }
}

