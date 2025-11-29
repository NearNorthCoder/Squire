/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Client
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.RegionPoint
 */
package -.r.u.q.e.s.o.t.a.i;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;

public final class IEnum
extends Enum<i> {
    private final /* synthetic */ int regionY;
    public static final /* synthetic */ /* enum */ i DEATH;
    private final /* synthetic */ int objectId;
    public static final /* synthetic */ /* enum */ i AIR;
    private final /* synthetic */ int regionX;
    public static final /* synthetic */ /* enum */ i LIGHTNING;
    private static /* synthetic */ String[] lIIllllllIIll;
    public static final /* synthetic */ /* enum */ i FIRE;
    private static /* synthetic */ int[] lIIllllllIlII;
    private static final /* synthetic */ i[] $VALUES;

    private static boolean lIllIlIlIllIIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static String lIllIlIlIlIlIll(String var8, String var5) {
        try {
            SecretKeySpec var15 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var20 = Cipher.getInstance("Blowfish");
            var20.init(lIIllllllIlII[8], var15);
            return new String(var20.doFinal(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    public static i valueOf(String string) {
        return Enum.valueOf(i.class, string);
    }

    private static void lIllIlIlIlIlllI() {
        lIIllllllIIll = new String[lIIllllllIlII[13]];
        i.lIIllllllIIll[i.lIIllllllIlII[0]] = i."DEATH";
        i.lIIllllllIIll[i.lIIllllllIlII[1]] = i."FIRE";
        i.lIIllllllIIll[i.lIIllllllIlII[8]] = i."LIGHTNING";
        i.lIIllllllIIll[i.lIIllllllIlII[11]] = i."AIR";
    }

    public int m() {
        return this.objectId;
    }

    /*
     * WARNING - void declaration
     */
    public static i a(int n2) {
        void var11;
        i[] iArray = i.values();
        int n3 = iArray.length;
        int var3 = lIIllllllIlII[0];
        while (i.lIllIlIlIllIIII(var3, (int)var11)) {
            int var22;
            void var14;
            void var1 = var14[var3];
            if (i.lIllIlIlIllIIIl(var1.m(), var22)) {
                return var1;
            }
            ++var3;
            0;
            if (((0 ^ 0x51) & ~(0x56 ^ 7)) == 0) continue;
            return null;
        }
        return null;
    }

    private i(int n3, int n4, int n5) {
        this.objectId = n3;
        this.regionX = n4;
        this.regionY = n5;
    }

    private static String lIllIlIlIlIllIl(String var23, String var12) {
        try {
            SecretKeySpec var24 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var12.getBytes(StandardCharsets.UTF_8)), lIIllllllIlII[14]), "DES");
            Cipher var17 = Cipher.getInstance("DES");
            var17.init(lIIllllllIlII[8], var24);
            return new String(var17.doFinal(Base64.getDecoder().decode(var23.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    private static void lIllIlIlIlIllll() {
        lIIllllllIlII = new int[15];
        i.lIIllllllIlII[0] = (87 + 126 - 139 + 57 ^ 39 + 75 - -23 + 13) & (0xB7 ^ 0x8F ^ (0x42 ^ 0x6F) ^ -1);
        i.lIIllllllIlII[1] = 1;
        i.lIIllllllIlII[2] = 0xFFFFBB7F & 0x7DD4;
        i.lIIllllllIlII[3] = 0xFFFFFBAF & 0xB77F;
        i.lIIllllllIlII[4] = 0xB0 ^ 0x81 ^ (0x22 ^ 0x31);
        i.lIIllllllIlII[5] = 0x64 ^ 0x7B ^ (0x6C ^ 0x52);
        i.lIIllllllIlII[6] = 0xFFFFB33F & 0xFFEC;
        i.lIIllllllIlII[7] = 0x66 ^ 0x79;
        i.lIIllllllIlII[8] = 2;
        i.lIIllllllIlII[9] = 0xFFFFF37F & 0xBFAD;
        i.lIIllllllIlII[10] = 197 + 88 - 198 + 130 ^ 29 + 117 - 138 + 191;
        i.lIIllllllIlII[11] = 3;
        i.lIIllllllIlII[12] = 0xFFFFBFFE & 0xF32F;
        i.lIIllllllIlII[13] = 0x44 ^ 0x7F ^ (0x2D ^ 0x12);
        i.lIIllllllIlII[14] = 120 + 53 - 19 + 27 ^ 20 + 23 - -136 + 10;
    }

    private static boolean lIllIlIlIllIIII(int n2, int n3) {
        return n2 < n3;
    }

    public static i[] values() {
        return (i[])$VALUES.clone();
    }

    static {
        i.lIllIlIlIlIllll();
        i.lIllIlIlIlIlllI();
        DEATH = new i(lIIllllllIlII[3], lIIllllllIlII[4], lIIllllllIlII[5]);
        FIRE = new i(lIIllllllIlII[6], lIIllllllIlII[7], lIIllllllIlII[5]);
        LIGHTNING = new i(lIIllllllIlII[9], lIIllllllIlII[4], lIIllllllIlII[10]);
        AIR = new i(lIIllllllIlII[12], lIIllllllIlII[7], lIIllllllIlII[10]);
        i[] iArray = new i[lIIllllllIlII[13]];
        iArray[i.lIIllllllIlII[0]] = DEATH;
        iArray[i.lIIllllllIlII[1]] = FIRE;
        iArray[i.lIIllllllIlII[8]] = LIGHTNING;
        iArray[i.lIIllllllIlII[11]] = AIR;
        $VALUES = iArray;
    }

    public WorldPoint a(Client client) {
        RegionPoint regionPoint = new RegionPoint(this.regionX, this.regionY, lIIllllllIlII[1], lIIllllllIlII[2]);
        Collection collection = WorldPoint.toLocalInstance((Client)client, (WorldPoint)regionPoint.toWorld());
        return collection.stream().findFirst().orElse(null);
    }

    private static String lIllIlIlIlIllII(String var9, String var6) {
        var9 = new String(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var2 = new StringBuilder();
        char[] var4 = var6.toCharArray();
        int var10 = lIIllllllIlII[0];
        char[] var21 = var9.toCharArray();
        int var16 = var21.length;
        int var19 = lIIllllllIlII[0];
        while (i.lIllIlIlIllIIII(var19, var16)) {
            char var7 = var21[var19];
            var2.append((char)(var7 ^ var4[var10 % var4.length]));
            0;
            ++var10;
            ++var19;
            0;
            if (1 >= ((0x20 ^ 0x39 ^ (0xD2 ^ 0x8B)) & (0x1A ^ 0x75 ^ (0x43 ^ 0x6C) ^ -1))) continue;
            return null;
        }
        return String.valueOf(var2);
    }
}

