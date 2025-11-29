/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package e.t.r.i.s.h.q.n.r.u.-.u.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;

public final class d
extends Enum<d> {
    public static final /* synthetic */ /* enum */ d FELDIP_HILLS_NORTH;
    public static final /* synthetic */ /* enum */ d WILDERNESS_NORTH;
    private static /* synthetic */ int[] lllIllllIlll;
    public static final /* synthetic */ /* enum */ d PISCATORIS_HUNTER_AREA;
    private static final /* synthetic */ d[] $VALUES;
    private final /* synthetic */ WorldPoint center;
    public static final /* synthetic */ /* enum */ d FELDIP_HILLS_SOUTH;
    public static final /* synthetic */ /* enum */ d RED_CHIN_HUNTING_GROUND;
    public static final /* synthetic */ /* enum */ d GWENITH_HUNTER_AREA;
    public static final /* synthetic */ /* enum */ d WILDERNESS_SOUTH;
    public static final /* synthetic */ /* enum */ d ISLE_OF_SOULS;
    private static /* synthetic */ String[] lllIllllIlIl;

    private static void lIIIlllIIIlIIll() {
        lllIllllIlIl = new String[lllIllllIlll[25]];
        d.lllIllllIlIl[d.lllIllllIlll[0]] = d."WILDERNESS_NORTH";
        d.lllIllllIlIl[d.lllIllllIlll[1]] = d."WILDERNESS_SOUTH";
        d.lllIllllIlIl[d.lllIllllIlll[7]] = d."PISCATORIS_HUNTER_AREA";
        d.lllIllllIlIl[d.lllIllllIlll[10]] = d."ISLE_OF_SOULS";
        d.lllIllllIlIl[d.lllIllllIlll[13]] = d."FELDIP_HILLS_NORTH";
        d.lllIllllIlIl[d.lllIllllIlll[16]] = d."FELDIP_HILLS_SOUTH";
        d.lllIllllIlIl[d.lllIllllIlll[19]] = d."GWENITH_HUNTER_AREA";
        d.lllIllllIlIl[d.lllIllllIlll[22]] = d."RED_CHIN_HUNTING_GROUND";
    }

    private static boolean lIIIlllIIIlIlIl(int n2, int n3) {
        return n2 < n3;
    }

    public static d valueOf(String string) {
        return Enum.valueOf(d.class, string);
    }

    static {
        d.lIIIlllIIIlIlII();
        d.lIIIlllIIIlIIll();
        WILDERNESS_NORTH = new d(new WorldPoint(lllIllllIlll[3], lllIllllIlll[4], lllIllllIlll[0]));
        WILDERNESS_SOUTH = new d(new WorldPoint(lllIllllIlll[5], lllIllllIlll[6], lllIllllIlll[0]));
        PISCATORIS_HUNTER_AREA = new d(new WorldPoint(lllIllllIlll[8], lllIllllIlll[9], lllIllllIlll[0]));
        ISLE_OF_SOULS = new d(new WorldPoint(lllIllllIlll[11], lllIllllIlll[12], lllIllllIlll[0]));
        FELDIP_HILLS_NORTH = new d(new WorldPoint(lllIllllIlll[14], lllIllllIlll[15], lllIllllIlll[0]));
        FELDIP_HILLS_SOUTH = new d(new WorldPoint(lllIllllIlll[17], lllIllllIlll[18], lllIllllIlll[0]));
        GWENITH_HUNTER_AREA = new d(new WorldPoint(lllIllllIlll[20], lllIllllIlll[21], lllIllllIlll[0]));
        RED_CHIN_HUNTING_GROUND = new d(new WorldPoint(lllIllllIlll[23], lllIllllIlll[24], lllIllllIlll[0]));
        d[] dArray = new d[lllIllllIlll[25]];
        dArray[d.lllIllllIlll[0]] = WILDERNESS_NORTH;
        dArray[d.lllIllllIlll[1]] = WILDERNESS_SOUTH;
        dArray[d.lllIllllIlll[7]] = PISCATORIS_HUNTER_AREA;
        dArray[d.lllIllllIlll[10]] = ISLE_OF_SOULS;
        dArray[d.lllIllllIlll[13]] = FELDIP_HILLS_NORTH;
        dArray[d.lllIllllIlll[16]] = FELDIP_HILLS_SOUTH;
        dArray[d.lllIllllIlll[19]] = GWENITH_HUNTER_AREA;
        dArray[d.lllIllllIlll[22]] = RED_CHIN_HUNTING_GROUND;
        $VALUES = dArray;
    }

    private d(WorldPoint worldPoint) {
        this.center = worldPoint;
    }

    private static String lIIIlllIIIIlIlI(String var17, String var8) {
        try {
            SecretKeySpec var16 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var8.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var3 = Cipher.getInstance("Blowfish");
            var3.init(lllIllllIlll[7], var16);
            return new String(var3.doFinal(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    public static d[] values() {
        return (d[])$VALUES.clone();
    }

    private static void lIIIlllIIIlIlII() {
        lllIllllIlll = new int[26];
        d.lllIllllIlll[0] = (0xB7 ^ 0xBB) & ~(0x9B ^ 0x97);
        d.lllIllllIlll[1] = 1;
        d.lllIllllIlll[2] = -1;
        d.lllIllllIlll[3] = 0xFFFF8FE6 & 0x7C59;
        d.lllIllllIlll[4] = -(0xFFFFEE9F & 0x7169) & (0xFFFFEEDF & 0x7FEF);
        d.lllIllllIlll[5] = 0xFFFFEC6F & 0x1FDA;
        d.lllIllllIlll[6] = -(0xFFFFC71F & 0x79E1) & (0xFFFFDFFD & 0x6FBF);
        d.lllIllllIlll[7] = 2;
        d.lllIllllIlll[8] = -(0xFFFFFDFF & 0x269D) & (0xFFFFADFC & 0x7FBF);
        d.lllIllllIlll[9] = -(0xFFFFF85B & 0x77BD) & (0xFFFFFFBD & 0x7E7B);
        d.lllIllllIlll[10] = 3;
        d.lllIllllIlll[11] = -(0xFFFFDFB3 & 0x776F) & (0xFFFFFF7F & 0x5FEE);
        d.lllIllllIlll[12] = 0xFFFFDFFD & 0x2B86;
        d.lllIllllIlll[13] = 0x9D ^ 0x99;
        d.lllIllllIlll[14] = 0xFFFFA9FE & 0x5FFD;
        d.lllIllllIlll[15] = -(0xFFFFFF8E & 0x30FB) & (0xFFFFBBFF & Short.MAX_VALUE);
        d.lllIllllIlll[16] = 110 + 94 - 162 + 104 ^ 43 + 18 - -85 + 5;
        d.lllIllllIlll[17] = -(0xFFFFF51D & 0x5EF7) & (0xFFFFFDFD & 0x5FDE);
        d.lllIllllIlll[18] = -(0xFFFFD6F7 & 0x7D39) & (0xFFFFFF73 & 0x5FFF);
        d.lllIllllIlll[19] = 0x4F ^ 0x49;
        d.lllIllllIlll[20] = -(0xFFFFEBAF & 0x575B) & (0xFFFFCFEF & 0x7BFE);
        d.lllIllllIlll[21] = 0xFFFF9D7E & 0x6FCD;
        d.lllIllllIlll[22] = 0x50 ^ 0x57;
        d.lllIllllIlll[23] = 0xFFFFFDDE & 0xBF3;
        d.lllIllllIlll[24] = -(0x72 ^ 0x41) & (0xFFFFBC7F & 0x67FF);
        d.lllIllllIlll[25] = 0x68 ^ 0x60;
    }

    public List<WorldPoint> a(int n2) {
        WorldPoint worldPoint = this.center.dx(lllIllllIlll[0]).dy(lllIllllIlll[1]);
        WorldPoint worldPoint2 = this.center.dx(lllIllllIlll[0]).dy(lllIllllIlll[2]);
        WorldPoint worldPoint3 = this.center.dx(lllIllllIlll[1]).dy(lllIllllIlll[0]);
        WorldPoint worldPoint4 = this.center.dx(lllIllllIlll[2]).dy(lllIllllIlll[0]);
        WorldPoint worldPoint5 = this.center.dx(lllIllllIlll[1]).dy(lllIllllIlll[1]);
        WorldPoint worldPoint6 = this.center.dx(lllIllllIlll[2]).dy(lllIllllIlll[2]);
        return List.of(worldPoint, worldPoint2, worldPoint3, worldPoint4, worldPoint5, worldPoint6).subList(lllIllllIlll[0], n2);
    }

    public WorldPoint l() {
        return this.center;
    }

    private static String lIIIlllIIIIlIll(String var10, String var1) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), lllIllllIlll[25]), "DES");
            Cipher var18 = Cipher.getInstance("DES");
            var18.init(lllIllllIlll[7], var5);
            return new String(var18.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }

    private static String lIIIlllIIIIlIIl(String var4, String var2) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var9 = var2.toCharArray();
        int var14 = lllIllllIlll[0];
        char[] var15 = var4.toCharArray();
        int var13 = var15.length;
        int var19 = lllIllllIlll[0];
        while (d.lIIIlllIIIlIlIl(var19, var13)) {
            char var12 = var15[var19];
            var6.append((char)(var12 ^ var9[var14 % var9.length]));
            0;
            ++var14;
            ++var19;
            0;
            if ((0x12 ^ 0x16) == (0x12 ^ 0x16)) continue;
            return null;
        }
        return String.valueOf(var6);
    }
}

