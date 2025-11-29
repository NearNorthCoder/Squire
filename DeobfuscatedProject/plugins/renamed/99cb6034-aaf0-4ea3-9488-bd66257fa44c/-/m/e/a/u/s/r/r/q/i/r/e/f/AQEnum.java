/*
 * Decompiled with CFR 0.152.
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.HerbType;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aw;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class AQEnum
extends Enum<aq>
implements aw {
    private static /* synthetic */ int[] llIIIIlIIIII;
    public static final /* synthetic */ /* enum */ aq NOTHING;
    private static final /* synthetic */ aq[] $VALUES;
    public static final /* synthetic */ /* enum */ aq WHITE_BERRY;
    public static final /* synthetic */ /* enum */ aq POISON_IVY;
    private static /* synthetic */ String[] llIIIIIlllll;
    private final /* synthetic */ av produce;
    public static final /* synthetic */ /* enum */ aq DEFAULT;

    public static aq[] values() {
        return (aq[])$VALUES.clone();
    }

    private static String llllIIlIIIIIIl(String var4, String var19) {
        try {
            SecretKeySpec var16 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var19.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var9 = Cipher.getInstance("Blowfish");
            var9.init(llIIIIlIIIII[2], var16);
            return new String(var9.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }

    private static void llllIIlIIIIlII() {
        llIIIIIlllll = new String[llIIIIlIIIII[4]];
        aq.llIIIIIlllll[aq.llIIIIlIIIII[0]] = aq."NOTHING";
        aq.llIIIIIlllll[aq.llIIIIlIIIII[1]] = aq."DEFAULT";
        aq.llIIIIIlllll[aq.llIIIIlIIIII[2]] = aq."WHITE_BERRY";
        aq.llIIIIIlllll[aq.llIIIIlIIIII[3]] = aq."POISON_IVY";
    }

    private static String llllIIlIIIIIll(String var1, String var18) {
        var1 = new String(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var12 = var18.toCharArray();
        int var13 = llIIIIlIIIII[0];
        char[] var17 = var1.toCharArray();
        int var6 = var17.length;
        int var5 = llIIIIlIIIII[0];
        while (aq.llllIIlIIIIllI(var5, var6)) {
            char var8 = var17[var5];
            var15.append((char)(var8 ^ var12[var13 % var12.length]));
            0;
            ++var13;
            ++var5;
            0;
            if (-1 < ((0x29 ^ 0x32) & ~(0x8D ^ 0x96))) continue;
            return null;
        }
        return String.valueOf(var15);
    }

    private static boolean llllIIlIIIIllI(int n2, int n3) {
        return n2 < n3;
    }

    private aq(av av2) {
        this.produce = av2;
    }

    @Override
    public av bf() {
        return this.produce;
    }

    public static aq valueOf(String string) {
        return Enum.valueOf(AQEnum.class, string);
    }

    private static void llllIIlIIIIlIl() {
        llIIIIlIIIII = new int[6];
        aq.llIIIIlIIIII[0] = (0x4F ^ 0x6E) & ~(0x2D ^ 0xC);
        aq.llIIIIlIIIII[1] = 1;
        aq.llIIIIlIIIII[2] = 2;
        aq.llIIIIlIIIII[3] = 3;
        aq.llIIIIlIIIII[4] = 123 + 86 - 205 + 147 ^ 109 + 133 - 234 + 139;
        aq.llIIIIlIIIII[5] = 3 ^ 9 ^ 2;
    }

    private static String llllIIlIIIIIlI(String var2, String var10) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var10.getBytes(StandardCharsets.UTF_8)), llIIIIlIIIII[5]), "DES");
            Cipher var14 = Cipher.getInstance("DES");
            var14.init(llIIIIlIIIII[2], var11);
            return new String(var14.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    static {
        aq.llllIIlIIIIlIl();
        aq.llllIIlIIIIlII();
        NOTHING = new aq(null);
        DEFAULT = new aq(av.DEFAULT);
        WHITE_BERRY = new aq(av.WHITE_BERRY);
        POISON_IVY = new aq(av.POISON_IVY);
        aq[] aqArray = new aq[llIIIIlIIIII[4]];
        aqArray[aq.llIIIIlIIIII[0]] = NOTHING;
        aqArray[aq.llIIIIlIIIII[1]] = DEFAULT;
        aqArray[aq.llIIIIlIIIII[2]] = WHITE_BERRY;
        aqArray[aq.llIIIIlIIIII[3]] = POISON_IVY;
        $VALUES = aqArray;
    }
}

