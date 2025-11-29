/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.RegionPoint
 */
package r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;

public final class g
extends Enum<g> {
    public static final /* synthetic */ /* enum */ g PATCH_9;
    public static final /* synthetic */ /* enum */ g PATCH_13;
    public static final /* synthetic */ /* enum */ g PATCH_6_NORTH;
    public static final /* synthetic */ /* enum */ g PATCH_10;
    private final /* synthetic */ int regionY;
    public static final /* synthetic */ /* enum */ g PATCH_15;
    public static final /* synthetic */ /* enum */ g PATCH_6;
    public static final /* synthetic */ /* enum */ g PATCH_14;
    public static final /* synthetic */ /* enum */ g PATCH_2;
    public static final /* synthetic */ /* enum */ g PATCH_3;
    public static final /* synthetic */ /* enum */ g PATCH_1;
    public static final /* synthetic */ /* enum */ g PATCH_1_NORTH;
    public static final /* synthetic */ /* enum */ g PATCH_16_NORTH;
    public static final /* synthetic */ /* enum */ g PATCH_11_NORTH;
    private static /* synthetic */ int[] lIIllllllllll;
    public static final /* synthetic */ /* enum */ g PATCH_4_NORTH;
    private static /* synthetic */ String[] lIIlllllllIll;
    public static final /* synthetic */ /* enum */ g PATCH_14_NORTH;
    public static final /* synthetic */ /* enum */ g PATCH_13_NORTH;
    public static final /* synthetic */ /* enum */ g PATCH_11;
    public static final /* synthetic */ /* enum */ g PATCH_12_NORTH;
    public static final /* synthetic */ /* enum */ g PATCH_2_NORTH;
    public static final /* synthetic */ /* enum */ g PATCH_8;
    public static final /* synthetic */ /* enum */ g PATCH_7;
    public static final /* synthetic */ /* enum */ g PATCH_7_NORTH;
    public static final /* synthetic */ /* enum */ g PATCH_9_NORTH;
    public static final /* synthetic */ /* enum */ g PATCH_3_NORTH;
    public static final /* synthetic */ /* enum */ g PATCH_13_SOUTH;
    public static final /* synthetic */ /* enum */ g PATCH_4;
    public static final /* synthetic */ /* enum */ g PATCH_12;
    private final /* synthetic */ int regionX;
    public static final /* synthetic */ /* enum */ g PATCH_5_NORTH;
    public static final /* synthetic */ /* enum */ g PATCH_10_NORTH;
    public static final /* synthetic */ /* enum */ g PATCH_16;
    public static final /* synthetic */ /* enum */ g PATCH_5;
    private static final /* synthetic */ g[] $VALUES;
    public static final /* synthetic */ /* enum */ g PATCH_8_NORTH;
    public static final /* synthetic */ /* enum */ g PATCH_15_NORTH;

    private static void lIllIllIIllIlIl() {
        lIIlllllllIll = new String[lIIllllllllll[42]];
        g.lIIlllllllIll[g.lIIllllllllll[0]] = g."PATCH_1";
        g.lIIlllllllIll[g.lIIllllllllll[2]] = g."PATCH_2";
        g.lIIlllllllIll[g.lIIllllllllll[6]] = g."PATCH_3";
        g.lIIlllllllIll[g.lIIllllllllll[8]] = g."PATCH_4";
        g.lIIlllllllIll[g.lIIllllllllll[10]] = g."PATCH_1_NORTH";
        g.lIIlllllllIll[g.lIIllllllllll[12]] = g."PATCH_2_NORTH";
        g.lIIlllllllIll[g.lIIllllllllll[14]] = g."PATCH_3_NORTH";
        g.lIIlllllllIll[g.lIIllllllllll[16]] = g."PATCH_4_NORTH";
        g.lIIlllllllIll[g.lIIllllllllll[18]] = g."PATCH_5";
        g.lIIlllllllIll[g.lIIllllllllll[20]] = g."PATCH_6";
        g.lIIlllllllIll[g.lIIllllllllll[21]] = g."PATCH_7";
        g.lIIlllllllIll[g.lIIllllllllll[22]] = g."PATCH_8";
        g.lIIlllllllIll[g.lIIllllllllll[23]] = g."PATCH_5_NORTH";
        g.lIIlllllllIll[g.lIIllllllllll[24]] = g."PATCH_6_NORTH";
        g.lIIlllllllIll[g.lIIllllllllll[25]] = g."PATCH_7_NORTH";
        g.lIIlllllllIll[g.lIIllllllllll[26]] = g."PATCH_8_NORTH";
        g.lIIlllllllIll[g.lIIllllllllll[27]] = g."PATCH_9";
        g.lIIlllllllIll[g.lIIllllllllll[29]] = g."PATCH_10";
        g.lIIlllllllIll[g.lIIllllllllll[30]] = g."PATCH_11";
        g.lIIlllllllIll[g.lIIllllllllll[31]] = g."PATCH_12";
        g.lIIlllllllIll[g.lIIllllllllll[32]] = g."PATCH_13_SOUTH";
        g.lIIlllllllIll[g.lIIllllllllll[33]] = g."PATCH_9_NORTH";
        g.lIIlllllllIll[g.lIIllllllllll[34]] = g."PATCH_10_NORTH";
        g.lIIlllllllIll[g.lIIllllllllll[35]] = g."PATCH_11_NORTH";
        g.lIIlllllllIll[g.lIIllllllllll[36]] = g."PATCH_12_NORTH";
        g.lIIlllllllIll[g.lIIllllllllll[4]] = g."PATCH_13";
        g.lIIlllllllIll[g.lIIllllllllll[37]] = g."PATCH_14";
        g.lIIlllllllIll[g.lIIllllllllll[38]] = g."PATCH_15";
        g.lIIlllllllIll[g.lIIllllllllll[5]] = g."PATCH_16";
        g.lIIlllllllIll[g.lIIllllllllll[39]] = g."PATCH_13_NORTH";
        g.lIIlllllllIll[g.lIIllllllllll[40]] = g."PATCH_14_NORTH";
        g.lIIlllllllIll[g.lIIllllllllll[7]] = g."PATCH_15_NORTH";
        g.lIIlllllllIll[g.lIIllllllllll[41]] = g."PATCH_16_NORTH";
    }

    private g(int n3, int n4) {
        this.regionX = n3;
        this.regionY = n4;
    }

    private static String lIllIllIIlIlIIl(String var15, String var2) {
        try {
            SecretKeySpec var12 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), lIIllllllllll[18]), "DES");
            Cipher var9 = Cipher.getInstance("DES");
            var9.init(lIIllllllllll[6], var12);
            return new String(var9.doFinal(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    static {
        g.lIllIllIIllIlll();
        g.lIllIllIIllIlIl();
        PATCH_1 = new g(lIIllllllllll[3], lIIllllllllll[4]);
        PATCH_2 = new g(lIIllllllllll[3], lIIllllllllll[5]);
        PATCH_3 = new g(lIIllllllllll[3], lIIllllllllll[7]);
        PATCH_4 = new g(lIIllllllllll[3], lIIllllllllll[9]);
        PATCH_1_NORTH = new g(lIIllllllllll[3], lIIllllllllll[11]);
        PATCH_2_NORTH = new g(lIIllllllllll[3], lIIllllllllll[13]);
        PATCH_3_NORTH = new g(lIIllllllllll[3], lIIllllllllll[15]);
        PATCH_4_NORTH = new g(lIIllllllllll[3], lIIllllllllll[17]);
        PATCH_5 = new g(lIIllllllllll[19], lIIllllllllll[4]);
        PATCH_6 = new g(lIIllllllllll[19], lIIllllllllll[5]);
        PATCH_7 = new g(lIIllllllllll[19], lIIllllllllll[7]);
        PATCH_8 = new g(lIIllllllllll[19], lIIllllllllll[9]);
        PATCH_5_NORTH = new g(lIIllllllllll[19], lIIllllllllll[11]);
        PATCH_6_NORTH = new g(lIIllllllllll[19], lIIllllllllll[13]);
        PATCH_7_NORTH = new g(lIIllllllllll[19], lIIllllllllll[15]);
        PATCH_8_NORTH = new g(lIIllllllllll[19], lIIllllllllll[17]);
        PATCH_9 = new g(lIIllllllllll[28], lIIllllllllll[4]);
        PATCH_10 = new g(lIIllllllllll[28], lIIllllllllll[5]);
        PATCH_11 = new g(lIIllllllllll[28], lIIllllllllll[7]);
        PATCH_12 = new g(lIIllllllllll[28], lIIllllllllll[9]);
        PATCH_13_SOUTH = new g(lIIllllllllll[28], lIIllllllllll[31]);
        PATCH_9_NORTH = new g(lIIllllllllll[28], lIIllllllllll[11]);
        PATCH_10_NORTH = new g(lIIllllllllll[28], lIIllllllllll[13]);
        PATCH_11_NORTH = new g(lIIllllllllll[28], lIIllllllllll[15]);
        PATCH_12_NORTH = new g(lIIllllllllll[28], lIIllllllllll[17]);
        PATCH_13 = new g(lIIllllllllll[11], lIIllllllllll[4]);
        PATCH_14 = new g(lIIllllllllll[11], lIIllllllllll[5]);
        PATCH_15 = new g(lIIllllllllll[11], lIIllllllllll[7]);
        PATCH_16 = new g(lIIllllllllll[11], lIIllllllllll[9]);
        PATCH_13_NORTH = new g(lIIllllllllll[11], lIIllllllllll[11]);
        PATCH_14_NORTH = new g(lIIllllllllll[11], lIIllllllllll[13]);
        PATCH_15_NORTH = new g(lIIllllllllll[11], lIIllllllllll[15]);
        PATCH_16_NORTH = new g(lIIllllllllll[11], lIIllllllllll[17]);
        g[] gArray = new g[lIIllllllllll[42]];
        gArray[g.lIIllllllllll[0]] = PATCH_1;
        gArray[g.lIIllllllllll[2]] = PATCH_2;
        gArray[g.lIIllllllllll[6]] = PATCH_3;
        gArray[g.lIIllllllllll[8]] = PATCH_4;
        gArray[g.lIIllllllllll[10]] = PATCH_1_NORTH;
        gArray[g.lIIllllllllll[12]] = PATCH_2_NORTH;
        gArray[g.lIIllllllllll[14]] = PATCH_3_NORTH;
        gArray[g.lIIllllllllll[16]] = PATCH_4_NORTH;
        gArray[g.lIIllllllllll[18]] = PATCH_5;
        gArray[g.lIIllllllllll[20]] = PATCH_6;
        gArray[g.lIIllllllllll[21]] = PATCH_7;
        gArray[g.lIIllllllllll[22]] = PATCH_8;
        gArray[g.lIIllllllllll[23]] = PATCH_5_NORTH;
        gArray[g.lIIllllllllll[24]] = PATCH_6_NORTH;
        gArray[g.lIIllllllllll[25]] = PATCH_7_NORTH;
        gArray[g.lIIllllllllll[26]] = PATCH_8_NORTH;
        gArray[g.lIIllllllllll[27]] = PATCH_9;
        gArray[g.lIIllllllllll[29]] = PATCH_10;
        gArray[g.lIIllllllllll[30]] = PATCH_11;
        gArray[g.lIIllllllllll[31]] = PATCH_12;
        gArray[g.lIIllllllllll[32]] = PATCH_13_SOUTH;
        gArray[g.lIIllllllllll[33]] = PATCH_9_NORTH;
        gArray[g.lIIllllllllll[34]] = PATCH_10_NORTH;
        gArray[g.lIIllllllllll[35]] = PATCH_11_NORTH;
        gArray[g.lIIllllllllll[36]] = PATCH_12_NORTH;
        gArray[g.lIIllllllllll[4]] = PATCH_13;
        gArray[g.lIIllllllllll[37]] = PATCH_14;
        gArray[g.lIIllllllllll[38]] = PATCH_15;
        gArray[g.lIIllllllllll[5]] = PATCH_16;
        gArray[g.lIIllllllllll[39]] = PATCH_13_NORTH;
        gArray[g.lIIllllllllll[40]] = PATCH_14_NORTH;
        gArray[g.lIIllllllllll[7]] = PATCH_15_NORTH;
        gArray[g.lIIllllllllll[41]] = PATCH_16_NORTH;
        $VALUES = gArray;
    }

    public static g[] values() {
        return (g[])$VALUES.clone();
    }

    private static void lIllIllIIllIlll() {
        lIIllllllllll = new int[43];
        g.lIIllllllllll[0] = (0x11 ^ 0x55 ^ (0x1E ^ 0x13)) & (6 + 162 - -20 + 44 ^ 158 + 154 - 255 + 104 ^ -1);
        g.lIIllllllllll[1] = 0xFFFFBD3F & 0x5EF6;
        g.lIIllllllllll[2] = 1;
        g.lIIllllllllll[3] = 0xBB ^ 0x8C;
        g.lIIllllllllll[4] = 147 + 35 - 10 + 19 ^ 23 + 71 - -13 + 59;
        g.lIIllllllllll[5] = 0x1C ^ 0x5B ^ (4 ^ 0x5F);
        g.lIIllllllllll[6] = 2;
        g.lIIllllllllll[7] = 0x16 ^ 9;
        g.lIIllllllllll[8] = 3;
        g.lIIllllllllll[9] = 9 ^ 0x4D ^ (0x73 ^ 0x15);
        g.lIIllllllllll[10] = 0xC8 ^ 0xA6 ^ (0x3E ^ 0x54);
        g.lIIllllllllll[11] = 0xFF ^ 0xAB ^ (0xC9 ^ 0xB5);
        g.lIIllllllllll[12] = (0x59 ^ 0x46) & ~(0x9D ^ 0x82) ^ (0x6E ^ 0x6B);
        g.lIIllllllllll[13] = 0x20 ^ 0x28 ^ (0x3C ^ 0x1F);
        g.lIIllllllllll[14] = 0x8F ^ 0x89;
        g.lIIllllllllll[15] = 0xAC ^ 0x82;
        g.lIIllllllllll[16] = 5 ^ 2;
        g.lIIllllllllll[17] = 5 ^ 0x34;
        g.lIIllllllllll[18] = 0x25 ^ 0x2D;
        g.lIIllllllllll[19] = 0x81 ^ 0xB3;
        g.lIIllllllllll[20] = 0xFD ^ 0xB5 ^ (0xE4 ^ 0xA5);
        g.lIIllllllllll[21] = 0x3C ^ 0x36;
        g.lIIllllllllll[22] = 0x70 ^ 0x7B;
        g.lIIllllllllll[23] = 0x4D ^ 0x69 ^ (0x82 ^ 0xAA);
        g.lIIllllllllll[24] = 0x85 ^ 0x88;
        g.lIIllllllllll[25] = 0x4F ^ 0x67 ^ (0x5F ^ 0x79);
        g.lIIllllllllll[26] = 0x22 ^ 0x2D;
        g.lIIllllllllll[27] = 0xF6 ^ 0x9A ^ (1 ^ 0x7D);
        g.lIIllllllllll[28] = 0x4D ^ 0x41 ^ (0x32 ^ 0x13);
        g.lIIllllllllll[29] = 31 + 73 - 60 + 110 ^ 91 + 123 - 205 + 130;
        g.lIIllllllllll[30] = 0x7D ^ 0x6F;
        g.lIIllllllllll[31] = 0x71 ^ 0x35 ^ (0x3F ^ 0x68);
        g.lIIllllllllll[32] = 31 + 80 - -33 + 26 ^ 61 + 15 - -107 + 7;
        g.lIIllllllllll[33] = 0x82 ^ 0x97;
        g.lIIllllllllll[34] = 0xAE ^ 0xB8;
        g.lIIllllllllll[35] = 0x48 ^ 8 ^ (0x48 ^ 0x1F);
        g.lIIllllllllll[36] = 0xAA ^ 0x89 ^ (0x95 ^ 0xAE);
        g.lIIllllllllll[37] = 0xA6 ^ 0x9F ^ (0x74 ^ 0x57);
        g.lIIllllllllll[38] = 0x8C ^ 0x97;
        g.lIIllllllllll[39] = 0xA6 ^ 0xBB;
        g.lIIllllllllll[40] = 2 ^ (0x4D ^ 0x51);
        g.lIIllllllllll[41] = 0xE2 ^ 0x9E ^ (0x2C ^ 0x70);
        g.lIIllllllllll[42] = 0x11 ^ 0x30;
    }

    private static boolean lIllIllIIlllIII(int n2, int n3) {
        return n2 == n3;
    }

    private static String lIllIllIIlIlIII(String var13, String var17) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var19 = new StringBuilder();
        char[] var18 = var17.toCharArray();
        int var4 = lIIllllllllll[0];
        char[] var6 = var13.toCharArray();
        int var5 = var6.length;
        int var1 = lIIllllllllll[0];
        while (g.lIllIllIIlllIlI(var1, var5)) {
            char var8 = var6[var1];
            var19.append((char)(var8 ^ var18[var4 % var18.length]));
            0;
            ++var4;
            ++var1;
            0;
            if (3 >= -1) continue;
            return null;
        }
        return String.valueOf(var19);
    }

    public static g valueOf(String string) {
        return Enum.valueOf(g.class, string);
    }

    public WorldPoint n() {
        return WorldPoint.fromRegion((int)lIIllllllllll[1], (int)this.regionX, (int)this.regionY, (int)lIIllllllllll[0]);
    }

    private static boolean lIllIllIIlllIlI(int n2, int n3) {
        return n2 < n3;
    }

    public boolean a(TileObject tileObject) {
        int n2;
        RegionPoint regionPoint = RegionPoint.fromWorld((WorldPoint)tileObject.getWorldLocation());
        if (g.lIllIllIIlllIII(regionPoint.getX(), this.regionX) && g.lIllIllIIlllIII(regionPoint.getY(), this.regionY)) {
            n2 = lIIllllllllll[2];
            0;
            
            }
        } else {
            n2 = lIIllllllllll[0];
        }
        return n2 != 0;
    }

    private static String lIllIllIIlIIlll(String var7, String var14) {
        try {
            SecretKeySpec var16 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var14.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var3 = Cipher.getInstance("Blowfish");
            var3.init(lIIllllllllll[6], var16);
            return new String(var3.doFinal(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    public RegionPoint m() {
        return new RegionPoint(this.regionX, this.regionY, lIIllllllllll[0], lIIllllllllll[1]);
    }
}

