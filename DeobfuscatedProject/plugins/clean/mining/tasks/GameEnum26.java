/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Point
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.mining.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Point;
import net.runelite.api.coords.WorldPoint;

public final class GameEnum26
extends Enum<c> {
    private static final  c[] $VALUES;
    public static final  /* enum */ c SOUTH_FOUR;
    
    private final  Point standing;
    private final  WorldPoint[] rocks;

    public static c[] values() {
        return (c[])$VALUES.clone();
    }

    static {
        c.lIIlIIlIlIllllI();
        c.lIIlIIlIlIlllIl();
        WorldPoint[] worldPointArray = new WorldPoint[lllllIIlIlII[4]];
        worldPointArray[c.lllllIIlIlII[0]] = new WorldPoint(lllllIIlIlII[5], lllllIIlIlII[6], lllllIIlIlII[0]);
        worldPointArray[c.lllllIIlIlII[1]] = new WorldPoint(lllllIIlIlII[5], lllllIIlIlII[7], lllllIIlIlII[0]);
        worldPointArray[c.lllllIIlIlII[8]] = new WorldPoint(lllllIIlIlII[5], lllllIIlIlII[3], lllllIIlIlII[0]);
        worldPointArray[c.lllllIIlIlII[9]] = new WorldPoint(lllllIIlIlII[10], lllllIIlIlII[11], lllllIIlIlII[0]);
        SOUTH_FOUR = new GameEnum26(new Point(lllllIIlIlII[2], lllllIIlIlII[3]), worldPointArray);
        c[] cArray = new c[lllllIIlIlII[1]];
        cArray[c.lllllIIlIlII[0]] = SOUTH_FOUR;
        $VALUES = cArray;
    }

    public static c valueOf(String string) {
        return Enum.valueOf(GameEnum26.class, string);
    }

    private static void lIIlIIlIlIlllIl() {
        lllllIIlIIll = new String[lllllIIlIlII[1]];
        c.lllllIIlIIll[c.lllllIIlIlII[0]] = "SOUTH_FOUR";
    }

    private static boolean lIIlIIlIllIIIII(int n2) {
        return n2 != 0;
    }

    private GameEnum26(Point point, WorldPoint ... worldPointArray) {
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
            void var3;
            void var4;
            void var5 = var4[var2];
            if (c.lIIlIIlIllIIIII(var5.equals((Object)var3) ? 1 : 0)) {
                return lllllIIlIlII[1];
            }
            ++var2;

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

