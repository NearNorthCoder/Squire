/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Point
 *  net.runelite.api.coords.WorldPoint
 */
package m.e.i.q.u.r.-.n.s.e.r.i;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Point;
import net.runelite.api.coords.WorldPoint;

public final class c
extends Enum<c> {
    private static final /* synthetic */ c[] $VALUES;
    public static final /* synthetic */ /* enum */ c SOUTH_FOUR;
    private static /* synthetic */ String[] lllllIIlIIll;
    private final /* synthetic */ Point standing;
    private final /* synthetic */ WorldPoint[] rocks;
    private static /* synthetic */ int[] lllllIIlIlII;

    public static c[] values() {
        return (c[])$VALUES.clone();
    }

    private static void lIIlIIlIlIllllI() {
        lllllIIlIlII = new int[12];
        c.lllllIIlIlII[0] = (0x4E ^ 0x5C) & ~(0x61 ^ 0x73);
        c.lllllIIlIlII[1] = 1;
        c.lllllIIlIlII[2] = -(0xFFFFFB9A & 0x67E7) & (0xFFFFEFDF & Short.MAX_VALUE);
        c.lllllIIlIlII[3] = 0xFFFFBF5F & 0x4BFE;
        c.lllllIIlIlII[4] = 0xE5 ^ 0xC2 ^ (0x7C ^ 0x5F);
        c.lllllIIlIlII[5] = 0xFFFFBCDD & 0x4F7F;
        c.lllllIIlIlII[6] = 0xFFFF9FFC & 0x6B5F;
        c.lllllIIlIlII[7] = 0xFFFFCFFF & 0x3B5D;
        c.lllllIIlIlII[8] = 2;
        c.lllllIIlIlII[9] = 3;
        c.lllllIIlIlII[10] = 0xFFFF9EFF & 0x6D5F;
        c.lllllIIlIlII[11] = 0xFFFFABFF & 0x5F5F;
    }

    static {
        c.lIIlIIlIlIllllI();
        c.lIIlIIlIlIlllIl();
        WorldPoint[] worldPointArray = new WorldPoint[lllllIIlIlII[4]];
        worldPointArray[c.lllllIIlIlII[0]] = new WorldPoint(lllllIIlIlII[5], lllllIIlIlII[6], lllllIIlIlII[0]);
        worldPointArray[c.lllllIIlIlII[1]] = new WorldPoint(lllllIIlIlII[5], lllllIIlIlII[7], lllllIIlIlII[0]);
        worldPointArray[c.lllllIIlIlII[8]] = new WorldPoint(lllllIIlIlII[5], lllllIIlIlII[3], lllllIIlIlII[0]);
        worldPointArray[c.lllllIIlIlII[9]] = new WorldPoint(lllllIIlIlII[10], lllllIIlIlII[11], lllllIIlIlII[0]);
        SOUTH_FOUR = new c(new Point(lllllIIlIlII[2], lllllIIlIlII[3]), worldPointArray);
        c[] cArray = new c[lllllIIlIlII[1]];
        cArray[c.lllllIIlIlII[0]] = SOUTH_FOUR;
        $VALUES = cArray;
    }

    private static String lIIlIIlIlIlllII(String var3, String var4) {
        try {
            SecretKeySpec var10 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var9 = Cipher.getInstance("Blowfish");
            var9.init(lllllIIlIlII[8], var10);
            return new String(var9.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    public static c valueOf(String string) {
        return Enum.valueOf(c.class, string);
    }

    private static void lIIlIIlIlIlllIl() {
        lllllIIlIIll = new String[lllllIIlIlII[1]];
        c.lllllIIlIIll[c.lllllIIlIlII[0]] = c."SOUTH_FOUR";
    }

    private static boolean lIIlIIlIllIIIII(int n2) {
        return n2 != 0;
    }

    private c(Point point, WorldPoint ... worldPointArray) {
        this.standing = point;
        this.rocks = worldPointArray;
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(WorldPoint worldPoint) {
        void var1;
        WorldPoint[] worldPointArray = this.rocks;
        int n2 = worldPointArray.length;
        int var2 = lllllIIlIlII[0];
        while (c.lIIlIIlIlIlllll(var2, (int)var1)) {
            void var6;
            void var7;
            void var8 = var7[var2];
            if (c.lIIlIIlIllIIIII(var8.equals((Object)var6) ? 1 : 0)) {
                return lllllIIlIlII[1];
            }
            ++var2;
            0;
            if ((0x75 ^ 0x70) != 0) continue;
            return false;
        }
        return lllllIIlIlII[0];
    }

    public WorldPoint[] e() {
        return this.rocks;
    }

    public WorldPoint d() {
        return new WorldPoint(this.standing.getX(), this.standing.getY(), lllllIIlIlII[0]);
    }

    private static boolean lIIlIIlIlIlllll(int n2, int n3) {
        return n2 < n3;
    }
}

