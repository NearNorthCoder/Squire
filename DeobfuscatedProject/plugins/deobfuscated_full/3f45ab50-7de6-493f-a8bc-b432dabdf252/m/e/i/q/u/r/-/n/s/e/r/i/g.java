/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.TileObjects
 */
package m.e.i.q.u.r.-.n.s.e.r.i;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.TileObjects;

public final class g
extends Enum<g> {
    private final /* synthetic */ WorldPoint location;
    public static final /* synthetic */ /* enum */ g EAST;
    private static /* synthetic */ String[] lllllIIIIllI;
    public static final /* synthetic */ /* enum */ g NORTH;
    private final /* synthetic */ WorldPoint m2;
    private static /* synthetic */ int[] lllllIIIIlll;
    private final /* synthetic */ WorldPoint m1;
    private static final /* synthetic */ g[] $VALUES;
    public static final /* synthetic */ /* enum */ g SOUTH_2;
    public static final /* synthetic */ /* enum */ g SOUTH_1;

    static {
        g.lIIlIIlIIlIlIlI();
        g.lIIlIIlIIlIlIIl();
        NORTH = new g(new WorldPoint(lllllIIIIlll[3], lllllIIIIlll[4], lllllIIIIlll[5]), new WorldPoint(lllllIIIIlll[3], lllllIIIIlll[6], lllllIIIIlll[5]), new WorldPoint(lllllIIIIlll[7], lllllIIIIlll[6], lllllIIIIlll[5]));
        EAST = new g(new WorldPoint(lllllIIIIlll[8], lllllIIIIlll[9], lllllIIIIlll[5]), new WorldPoint(lllllIIIIlll[10], lllllIIIIlll[11], lllllIIIIlll[5]), new WorldPoint(lllllIIIIlll[10], lllllIIIIlll[12], lllllIIIIlll[5]));
        SOUTH_1 = new g(new WorldPoint(lllllIIIIlll[13], lllllIIIIlll[14], lllllIIIIlll[5]), new WorldPoint(lllllIIIIlll[13], lllllIIIIlll[15], lllllIIIIlll[5]), new WorldPoint(lllllIIIIlll[16], lllllIIIIlll[15], lllllIIIIlll[5]));
        SOUTH_2 = new g(new WorldPoint(lllllIIIIlll[13], lllllIIIIlll[14], lllllIIIIlll[5]), new WorldPoint(lllllIIIIlll[3], lllllIIIIlll[14], lllllIIIIlll[5]), new WorldPoint(lllllIIIIlll[3], lllllIIIIlll[18], lllllIIIIlll[5]));
        g[] gArray = new g[lllllIIIIlll[19]];
        gArray[g.lllllIIIIlll[2]] = NORTH;
        gArray[g.lllllIIIIlll[1]] = EAST;
        gArray[g.lllllIIIIlll[5]] = SOUTH_1;
        gArray[g.lllllIIIIlll[17]] = SOUTH_2;
        $VALUES = gArray;
    }

    public static g valueOf(String string) {
        return Enum.valueOf(g.class, string);
    }

    public static TileObject h() {
        int n2 = lllllIIIIlll[0];
        int[] nArray = new int[lllllIIIIlll[1]];
        nArray[g.lllllIIIIlll[2]] = lllllIIIIlll[0];
        return TileObjects.getNearest((int[])nArray);
    }

    public WorldPoint j() {
        return this.m1;
    }

    public WorldPoint k() {
        return this.m2;
    }

    private static void lIIlIIlIIlIlIlI() {
        lllllIIIIlll = new int[21];
        g.lllllIIIIlll[0] = 0xFFFF9AFF & 0xFDB7;
        g.lllllIIIIlll[1] = 1;
        g.lllllIIIIlll[2] = (91 + 115 - 135 + 101 ^ 76 + 176 - 219 + 148) & (113 + 61 - 152 + 127 ^ 104 + 96 - 151 + 91 ^ -1);
        g.lllllIIIIlll[3] = -(0xFFFFF7AE & 0x3957) & (0xFFFFBFDF & 0x7F7F);
        g.lllllIIIIlll[4] = -(0xFFFFD7BB & 0x69CD) & (0xFFFFE7BF & 0x7FED);
        g.lllllIIIIlll[5] = 2;
        g.lllllIIIIlll[6] = -(138 + 52 - 112 + 62) & (0xFFFFBFFF & 0x66AF);
        g.lllllIIIIlll[7] = 0xFFFFCE5B & 0x3FFF;
        g.lllllIIIIlll[8] = -(0xFFFFAB8D & 0x74F3) & (0xFFFFBFEF & 0x6EF7);
        g.lllllIIIIlll[9] = 0xFFFFFE1F & 0x27FB;
        g.lllllIIIIlll[10] = -(0xFFFFF98A & 0x17FF) & (0xFFFF9FFF & 0x7FEF);
        g.lllllIIIIlll[11] = 0xFFFFB77D & 0x6E9F;
        g.lllllIIIIlll[12] = 0xFFFFAEDC & 0x773F;
        g.lllllIIIIlll[13] = -(0xFFFFFFFB & 0x512D) & (0xFFFFDFFF & 0x7F7F);
        g.lllllIIIIlll[14] = 0xFFFFF737 & 0x2EDE;
        g.lllllIIIIlll[15] = 0xFFFFBF99 & 0x667F;
        g.lllllIIIIlll[16] = 0xFFFFDF59 & 0x2EFE;
        g.lllllIIIIlll[17] = 3;
        g.lllllIIIIlll[18] = 0xFFFFF697 & 0x2F7F;
        g.lllllIIIIlll[19] = 0x61 ^ 0x31 ^ (0xD ^ 0x59);
        g.lllllIIIIlll[20] = 0x3A ^ 0x28 ^ (0x71 ^ 0x6B);
    }

    private g(WorldPoint worldPoint, WorldPoint worldPoint2, WorldPoint worldPoint3) {
        this.location = worldPoint;
        this.m1 = worldPoint2;
        this.m2 = worldPoint3;
    }

    private static String lIIlIIlIIlIIlll(String var5, String var4) {
        try {
            SecretKeySpec var10 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), lllllIIIIlll[20]), "DES");
            Cipher var2 = Cipher.getInstance("DES");
            var2.init(lllllIIIIlll[5], var10);
            return new String(var2.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }

    private static String lIIlIIlIIlIlIII(String var3, String var6) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var9 = Cipher.getInstance("Blowfish");
            var9.init(lllllIIIIlll[5], var8);
            return new String(var9.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    public WorldPoint i() {
        return this.location;
    }

    private static void lIIlIIlIIlIlIIl() {
        lllllIIIIllI = new String[lllllIIIIlll[19]];
        g.lllllIIIIllI[g.lllllIIIIlll[2]] = g."NORTH";
        g.lllllIIIIllI[g.lllllIIIIlll[1]] = g."EAST";
        g.lllllIIIIllI[g.lllllIIIIlll[5]] = g."SOUTH_1";
        g.lllllIIIIllI[g.lllllIIIIlll[17]] = g."SOUTH_2";
    }

    public static g[] values() {
        return (g[])$VALUES.clone();
    }
}

