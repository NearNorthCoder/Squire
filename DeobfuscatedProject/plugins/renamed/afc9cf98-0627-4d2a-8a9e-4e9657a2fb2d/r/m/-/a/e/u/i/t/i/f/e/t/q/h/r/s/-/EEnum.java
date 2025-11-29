/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.plugins.tithefarm.TitheFarmPlantType
 */
package r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.client.plugins.tithefarm.TitheFarmPlantType;

public final class EEnum
extends Enum<e> {
    private static /* synthetic */ String[] lIIlllllIlIll;
    private static /* synthetic */ int[] lIIlllllIllIl;
    public static final /* synthetic */ /* enum */ e WATERED;
    public static final /* synthetic */ /* enum */ e UNWATERED;
    public static final /* synthetic */ /* enum */ e DEAD;
    public static final /* synthetic */ /* enum */ e GROWN;
    private static final /* synthetic */ e[] $VALUES;

    private static boolean lIllIlIlllllIIl(int n2, int n3) {
        return n2 < n3;
    }

    static {
        e.lIllIlIllllIllI();
        e.lIllIlIllllIIlI();
        UNWATERED = new e();
        WATERED = new e();
        DEAD = new e();
        GROWN = new e();
        e[] eArray = new e[lIIlllllIllIl[4]];
        eArray[e.lIIlllllIllIl[1]] = UNWATERED;
        eArray[e.lIIlllllIllIl[2]] = WATERED;
        eArray[e.lIIlllllIllIl[3]] = DEAD;
        eArray[e.lIIlllllIllIl[0]] = GROWN;
        $VALUES = eArray;
    }

    private static String lIllIlIllllIIIl(String var12, String var13) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var18 = new StringBuilder();
        char[] var14 = var13.toCharArray();
        int var11 = lIIlllllIllIl[1];
        char[] var5 = var12.toCharArray();
        int var22 = var5.length;
        int var9 = lIIlllllIllIl[1];
        while (e.lIllIlIlllllIIl(var9, var22)) {
            char var21 = var5[var9];
            var18.append((char)(var21 ^ var14[var11 % var14.length]));
            0;
            ++var11;
            ++var9;
            0;
            if (1 < 3) continue;
            return null;
        }
        return String.valueOf(var18);
    }

    private static void lIllIlIllllIllI() {
        lIIlllllIllIl = new int[6];
        e.lIIlllllIllIl[0] = 3;
        e.lIIlllllIllIl[1] = (0x72 ^ 0x11) & ~(0x5C ^ 0x3F);
        e.lIIlllllIllIl[2] = 1;
        e.lIIlllllIllIl[3] = 2;
        e.lIIlllllIllIl[4] = 0x75 ^ 0x71;
        e.lIIlllllIllIl[5] = 0x4B ^ 0x43;
    }

    private static String lIllIlIllllIIII(String var20, String var8) {
        try {
            SecretKeySpec var16 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var8.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var7 = Cipher.getInstance("Blowfish");
            var7.init(lIIlllllIllIl[3], var16);
            return new String(var7.doFinal(Base64.getDecoder().decode(var20.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static e c(int n2) {
        int var17;
        void var6;
        TitheFarmPlantType titheFarmPlantType = TitheFarmPlantType.getPlantType((int)n2);
        if (e.lIllIlIllllIlll(titheFarmPlantType)) {
            return null;
        }
        int var2 = var6.getBaseId();
        if (e.lIllIlIlllllIII(var17, var2)) {
            return GROWN;
        }
        switch ((var2 - var17) % lIIlllllIllIl[0]) {
            case 0: {
                return UNWATERED;
            }
            case 2: {
                return WATERED;
            }
        }
        return DEAD;
    }

    private static boolean lIllIlIllllIlll(Object object) {
        return object == null;
    }

    public static e valueOf(String string) {
        return Enum.valueOf(e.class, string);
    }

    public static e[] values() {
        return (e[])$VALUES.clone();
    }

    private static boolean lIllIlIlllllIII(int n2, int n3) {
        return n2 == n3;
    }

    private static String lIllIlIlllIllll(String var4, String var1) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), lIIlllllIllIl[5]), "DES");
            Cipher var10 = Cipher.getInstance("DES");
            var10.init(lIIlllllIllIl[3], var3);
            return new String(var10.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    private static void lIllIlIllllIIlI() {
        lIIlllllIlIll = new String[lIIlllllIllIl[4]];
        e.lIIlllllIlIll[e.lIIlllllIllIl[1]] = e."UNWATERED";
        e.lIIlllllIlIll[e.lIIlllllIllIl[2]] = e."WATERED";
        e.lIIlllllIlIll[e.lIIlllllIllIl[3]] = e."DEAD";
        e.lIIlllllIlIll[e.lIIlllllIllIl[0]] = e."GROWN";
    }
}

