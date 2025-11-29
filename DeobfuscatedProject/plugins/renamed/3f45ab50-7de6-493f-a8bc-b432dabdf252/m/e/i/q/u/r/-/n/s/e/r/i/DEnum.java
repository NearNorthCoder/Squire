/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package m.e.i.q.u.r.-.n.s.e.r.i;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;

public final class DEnum
extends Enum<d> {
    private final /* synthetic */ WorldPoint[] points;
    private static /* synthetic */ int[] lllllIlIlIlI;
    private static final /* synthetic */ d[] $VALUES;
    public static final /* synthetic */ /* enum */ d UPPER_FLOOR;
    private static /* synthetic */ String[] lllllIlIIlll;
    public static final /* synthetic */ /* enum */ d SOUTH_WEST;

    private d(WorldPoint ... worldPointArray) {
        this.points = worldPointArray;
    }

    private static String lIIlIIllIlIIlII(String var8, String var1) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), lllllIlIlIlI[19]), "DES");
            Cipher var2 = Cipher.getInstance("DES");
            var2.init(lllllIlIlIlI[7], var7);
            return new String(var2.doFinal(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    private static void lIIlIIllIlIlllI() {
        lllllIlIlIlI = new int[41];
        d.lllllIlIlIlI[0] = (4 + 116 - 96 + 136 ^ 143 + 47 - 65 + 63) & (0x54 ^ 0x30 ^ (0x35 ^ 0x4D) ^ -1);
        d.lllllIlIlIlI[1] = 98 + 16 - 40 + 66 ^ 127 + 121 - 213 + 99;
        d.lllllIlIlIlI[2] = -(0x30 ^ 0x65) & (0xFFFFBEFF & 0x4FFF);
        d.lllllIlIlIlI[3] = -(0xFFFFE9EF & 0x77D3) & (0xFFFFF7FF & 0x7FEF);
        d.lllllIlIlIlI[4] = 1;
        d.lllllIlIlIlI[5] = -(0xFFFFFD75 & 0x63DB) & (0xFFFFFFFB & 0x6FFE);
        d.lllllIlIlIlI[6] = -(0xFFFFCEDE & 0x79F3) & (0xFFFFDFFF & 0x7EFF);
        d.lllllIlIlIlI[7] = 2;
        d.lllllIlIlIlI[8] = 0xFFFF9FFD & 0x6EAB;
        d.lllllIlIlIlI[9] = 0xFFFFFE75 & 0x17BA;
        d.lllllIlIlIlI[10] = 3;
        d.lllllIlIlIlI[11] = 0x79 ^ 0x7D;
        d.lllllIlIlIlI[12] = -(0xFFFFFF5F & 0x70F7) & (0xFFFFFEFF & 0x7FFE);
        d.lllllIlIlIlI[13] = 0xFFFFF7F6 & 0x1E3D;
        d.lllllIlIlIlI[14] = 0xB1 ^ 0xB4;
        d.lllllIlIlIlI[15] = 0xB2 ^ 0xAC ^ (0x63 ^ 0x7B);
        d.lllllIlIlIlI[16] = 0xFFFF977B & 0x7EB6;
        d.lllllIlIlIlI[17] = 0xE8 ^ 0xC1 ^ (0x98 ^ 0xB6);
        d.lllllIlIlIlI[18] = -(0xFFFFEB9F & 0x3DED) & (0xFFFFBFBF & Short.MAX_VALUE);
        d.lllllIlIlIlI[19] = 0x81 ^ 0x89;
        d.lllllIlIlIlI[20] = 0xFFFFCEB7 & 0x3FEF;
        d.lllllIlIlIlI[21] = 0xFFFF97B3 & 0x7E7D;
        d.lllllIlIlIlI[22] = 0x7F ^ 0x4A ^ (0x10 ^ 0x2C);
        d.lllllIlIlIlI[23] = 136 + 104 - 233 + 133 ^ 47 + 81 - 25 + 25;
        d.lllllIlIlIlI[24] = -(0xFFFFF56F & 0x7BFD) & (0xFFFFFFFF & 0x7FFE);
        d.lllllIlIlIlI[25] = -(0xFFFFE1F7 & 0x3E6D) & (0xFFFFF67F & 0x3FFF);
        d.lllllIlIlIlI[26] = -(0xFFFFBFB3 & 0x616E) & (0xFFFFBFFF & 0x773D);
        d.lllllIlIlIlI[27] = 0xFFFFDF3F & 0x36DD;
        d.lllllIlIlIlI[28] = 0xFFFFF7BE & 0x1E5F;
        d.lllllIlIlIlI[29] = 0xFFFFDFFF & 0x2E91;
        d.lllllIlIlIlI[30] = 0xFFFFF77B & 0x1EA6;
        d.lllllIlIlIlI[31] = -(0xFFFFF5F9 & 0x6ACF) & (0xFFFFF6FF & 0x7FEB);
        d.lllllIlIlIlI[32] = 0xFFFF9FFC & 0x7627;
        d.lllllIlIlIlI[33] = 0xFFFFB66F & 0x5FB5;
        d.lllllIlIlIlI[34] = 0xFFFFDEDD & 0x2FBB;
        d.lllllIlIlIlI[35] = -(0xFFFFBC2D & 0x63F3) & (0xFFFFBF7E & 0x76BB);
        d.lllllIlIlIlI[36] = -(0xFFFFD36F & 0x6CFB) & (0xFFFFEEFF & 0x5FFF);
        d.lllllIlIlIlI[37] = 0xFFFFBF3F & 0x56DF;
        d.lllllIlIlIlI[38] = -(0xFFFFF5F3 & 0x5A6F) & (0xFFFFDEF6 & Short.MAX_VALUE);
        d.lllllIlIlIlI[39] = -(0xFFFFFB9F & 0x257B) & (0xFFFFFFBB & 0x377F);
        d.lllllIlIlIlI[40] = 0x39 ^ 0x32;
    }

    public WorldPoint[] g() {
        return this.points;
    }

    public List<WorldPoint> f() {
        return Arrays.asList(this.g());
    }

    public static d valueOf(String string) {
        return Enum.valueOf(d.class, string);
    }

    private static void lIIlIIllIlIIllI() {
        lllllIlIIlll = new String[lllllIlIlIlI[7]];
        d.lllllIlIIlll[d.lllllIlIlIlI[0]] = d."UPPER_FLOOR";
        d.lllllIlIIlll[d.lllllIlIlIlI[4]] = d."SOUTH_WEST";
    }

    static {
        d.lIIlIIllIlIlllI();
        d.lIIlIIllIlIIllI();
        WorldPoint[] worldPointArray = new WorldPoint[lllllIlIlIlI[1]];
        worldPointArray[d.lllllIlIlIlI[0]] = new WorldPoint(lllllIlIlIlI[2], lllllIlIlIlI[3], lllllIlIlIlI[0]);
        worldPointArray[d.lllllIlIlIlI[4]] = new WorldPoint(lllllIlIlIlI[5], lllllIlIlIlI[6], lllllIlIlIlI[0]);
        worldPointArray[d.lllllIlIlIlI[7]] = new WorldPoint(lllllIlIlIlI[8], lllllIlIlIlI[9], lllllIlIlIlI[0]);
        worldPointArray[d.lllllIlIlIlI[10]] = new WorldPoint(lllllIlIlIlI[5], lllllIlIlIlI[6], lllllIlIlIlI[0]);
        worldPointArray[d.lllllIlIlIlI[11]] = new WorldPoint(lllllIlIlIlI[12], lllllIlIlIlI[13], lllllIlIlIlI[0]);
        worldPointArray[d.lllllIlIlIlI[14]] = new WorldPoint(lllllIlIlIlI[8], lllllIlIlIlI[13], lllllIlIlIlI[0]);
        worldPointArray[d.lllllIlIlIlI[15]] = new WorldPoint(lllllIlIlIlI[5], lllllIlIlIlI[16], lllllIlIlIlI[0]);
        worldPointArray[d.lllllIlIlIlI[17]] = new WorldPoint(lllllIlIlIlI[5], lllllIlIlIlI[18], lllllIlIlIlI[0]);
        worldPointArray[d.lllllIlIlIlI[19]] = new WorldPoint(lllllIlIlIlI[20], lllllIlIlIlI[21], lllllIlIlIlI[0]);
        worldPointArray[d.lllllIlIlIlI[22]] = new WorldPoint(lllllIlIlIlI[20], lllllIlIlIlI[9], lllllIlIlIlI[0]);
        UPPER_FLOOR = new d(worldPointArray);
        WorldPoint[] worldPointArray2 = new WorldPoint[lllllIlIlIlI[23]];
        worldPointArray2[d.lllllIlIlIlI[0]] = new WorldPoint(lllllIlIlIlI[24], lllllIlIlIlI[25], lllllIlIlIlI[0]);
        worldPointArray2[d.lllllIlIlIlI[4]] = new WorldPoint(lllllIlIlIlI[24], lllllIlIlIlI[26], lllllIlIlIlI[0]);
        worldPointArray2[d.lllllIlIlIlI[7]] = new WorldPoint(lllllIlIlIlI[24], lllllIlIlIlI[27], lllllIlIlIlI[0]);
        worldPointArray2[d.lllllIlIlIlI[10]] = new WorldPoint(lllllIlIlIlI[24], lllllIlIlIlI[28], lllllIlIlIlI[0]);
        worldPointArray2[d.lllllIlIlIlI[11]] = new WorldPoint(lllllIlIlIlI[29], lllllIlIlIlI[30], lllllIlIlIlI[0]);
        worldPointArray2[d.lllllIlIlIlI[14]] = new WorldPoint(lllllIlIlIlI[29], lllllIlIlIlI[31], lllllIlIlIlI[0]);
        worldPointArray2[d.lllllIlIlIlI[15]] = new WorldPoint(lllllIlIlIlI[29], lllllIlIlIlI[32], lllllIlIlIlI[0]);
        worldPointArray2[d.lllllIlIlIlI[17]] = new WorldPoint(lllllIlIlIlI[29], lllllIlIlIlI[33], lllllIlIlIlI[0]);
        worldPointArray2[d.lllllIlIlIlI[19]] = new WorldPoint(lllllIlIlIlI[34], lllllIlIlIlI[35], lllllIlIlIlI[0]);
        worldPointArray2[d.lllllIlIlIlI[22]] = new WorldPoint(lllllIlIlIlI[36], lllllIlIlIlI[37], lllllIlIlIlI[0]);
        worldPointArray2[d.lllllIlIlIlI[1]] = new WorldPoint(lllllIlIlIlI[38], lllllIlIlIlI[39], lllllIlIlIlI[0]);
        worldPointArray2[d.lllllIlIlIlI[40]] = new WorldPoint(lllllIlIlIlI[36], lllllIlIlIlI[3], lllllIlIlIlI[0]);
        SOUTH_WEST = new d(worldPointArray2);
        d[] dArray = new d[lllllIlIlIlI[7]];
        dArray[d.lllllIlIlIlI[0]] = UPPER_FLOOR;
        dArray[d.lllllIlIlIlI[4]] = SOUTH_WEST;
        $VALUES = dArray;
    }

    private static String lIIlIIllIlIIlIl(String var6, String var4) {
        try {
            SecretKeySpec var10 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var3 = Cipher.getInstance("Blowfish");
            var3.init(lllllIlIlIlI[7], var10);
            return new String(var3.doFinal(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    public static d[] values() {
        return (d[])$VALUES.clone();
    }
}

