/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package e.t.r.i.s.h.q.n.r.u.-.u.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;

public final class CEnum
extends Enum<c> {
    public static final /* synthetic */ /* enum */ c FELDIP_HILLS_SOUTH;
    private static /* synthetic */ String[] lllIllIllIII;
    private static /* synthetic */ int[] lllIllIllIIl;
    public static final /* synthetic */ /* enum */ c FELDIP_HILLS_NORTHWEST;
    private static final /* synthetic */ c[] $VALUES;
    public static final /* synthetic */ /* enum */ c ISLE_OF_SOULS;
    private final /* synthetic */ WorldPoint center;

    private static String lIIIllIlIlllIIl(String var13, String var9) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var3 = var9.toCharArray();
        int var1 = lllIllIllIIl[0];
        char[] var11 = var13.toCharArray();
        int var7 = var11.length;
        int var2 = lllIllIllIIl[0];
        while (c.lIIIllIlIllllII(var2, var7)) {
            char var4 = var11[var2];
            var12.append((char)(var4 ^ var3[var1 % var3.length]));
            0;
            ++var1;
            ++var2;
            0;
            if ((0 ^ 0x40 ^ (0x4C ^ 8)) >= 2) continue;
            return null;
        }
        return String.valueOf(var12);
    }

    static {
        c.lIIIllIlIlllIll();
        c.lIIIllIlIlllIlI();
        FELDIP_HILLS_SOUTH = new c(new WorldPoint(lllIllIllIIl[3], lllIllIllIIl[4], lllIllIllIIl[0]));
        ISLE_OF_SOULS = new c(new WorldPoint(lllIllIllIIl[5], lllIllIllIIl[6], lllIllIllIIl[0]));
        FELDIP_HILLS_NORTHWEST = new c(new WorldPoint(lllIllIllIIl[8], lllIllIllIIl[9], lllIllIllIIl[0]));
        c[] cArray = new c[lllIllIllIIl[10]];
        cArray[c.lllIllIllIIl[0]] = FELDIP_HILLS_SOUTH;
        cArray[c.lllIllIllIIl[1]] = ISLE_OF_SOULS;
        cArray[c.lllIllIllIIl[7]] = FELDIP_HILLS_NORTHWEST;
        $VALUES = cArray;
    }

    public WorldPoint l() {
        return this.center;
    }

    private static void lIIIllIlIlllIlI() {
        lllIllIllIII = new String[lllIllIllIIl[10]];
        c.lllIllIllIII[c.lllIllIllIIl[0]] = c."FELDIP_HILLS_SOUTH";
        c.lllIllIllIII[c.lllIllIllIIl[1]] = c."ISLE_OF_SOULS";
        c.lllIllIllIII[c.lllIllIllIIl[7]] = c."FELDIP_HILLS_NORTHWEST";
    }

    private static boolean lIIIllIlIllllII(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIIllIlIlllIll() {
        lllIllIllIIl = new int[11];
        c.lllIllIllIIl[0] = (0xF7 ^ 0xAD) & ~(0xED ^ 0xB7);
        c.lllIllIllIIl[1] = 1;
        c.lllIllIllIIl[2] = -1;
        c.lllIllIllIIl[3] = -(0xFFFFD2FD & 0x7D53) & (0xFFFFDBFF & 0x7E7F);
        c.lllIllIllIIl[4] = 0xFFFFCBFB & 0x3F74;
        c.lllIllIllIIl[5] = -(0xFFFFF3CB & 0x6D35) & (0xFFFFFDBF & 0x6BDD);
        c.lllIllIllIIl[6] = -(0xFFFFF17F & 0x1ECD) & (0xFFFF9BDF & 0x7FFE);
        c.lllIllIllIIl[7] = 2;
        c.lllIllIllIIl[8] = 0xFFFFCBFF & 0x3DDF;
        c.lllIllIllIIl[9] = 0xFFFFABF7 & 0x5F7F;
        c.lllIllIllIIl[10] = 3;
    }

    private static String lIIIllIlIlllIII(String var6, String var8) {
        try {
            SecretKeySpec var14 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var8.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var5 = Cipher.getInstance("Blowfish");
            var5.init(lllIllIllIIl[7], var14);
            return new String(var5.doFinal(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private c(WorldPoint worldPoint) {
        this.center = worldPoint;
    }

    public static c valueOf(String string) {
        return Enum.valueOf(c.class, string);
    }

    public static c[] values() {
        return (c[])$VALUES.clone();
    }

    public List<WorldPoint> a(int n2) {
        WorldPoint worldPoint = this.center.dx(lllIllIllIIl[0]).dy(lllIllIllIIl[1]);
        WorldPoint worldPoint2 = this.center.dx(lllIllIllIIl[0]).dy(lllIllIllIIl[2]);
        WorldPoint worldPoint3 = this.center.dx(lllIllIllIIl[1]).dy(lllIllIllIIl[0]);
        WorldPoint worldPoint4 = this.center.dx(lllIllIllIIl[2]).dy(lllIllIllIIl[0]);
        WorldPoint worldPoint5 = this.center.dx(lllIllIllIIl[1]).dy(lllIllIllIIl[1]);
        WorldPoint worldPoint6 = this.center.dx(lllIllIllIIl[2]).dy(lllIllIllIIl[2]);
        return List.of(worldPoint, worldPoint2, worldPoint3, worldPoint4, worldPoint5, worldPoint6).subList(lllIllIllIIl[0], n2);
    }
}

