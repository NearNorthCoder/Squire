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

public final class GameEnum30
extends Enum<e> {
    private final  WorldPoint[] rocks;
    private final  Point standing;
    public static final  /* enum */ e WEST_FOUR;

    public static final  /* enum */ e WEST_TWO;
    private static final  e[] $VALUES;

    private static boolean lIIlIlIIIIllIll(int n2, int n3) {
        return n2 < n3;
    }

    static {
        e.lIIlIlIIIIllIlI();
        e.lIIlIlIIIIllIIl();
        WorldPoint[] worldPointArray = new WorldPoint[llllllIIIIll[4]];
        worldPointArray[e.llllllIIIIll[0]] = new WorldPoint(llllllIIIIll[5], llllllIIIIll[6], llllllIIIIll[0]);
        worldPointArray[e.llllllIIIIll[1]] = new WorldPoint(llllllIIIIll[7], llllllIIIIll[6], llllllIIIIll[0]);
        worldPointArray[e.llllllIIIIll[8]] = new WorldPoint(llllllIIIIll[9], llllllIIIIll[3], llllllIIIIll[0]);
        worldPointArray[e.llllllIIIIll[10]] = new WorldPoint(llllllIIIIll[9], llllllIIIIll[11], llllllIIIIll[0]);
        WEST_FOUR = new GameEnum30(new Point(llllllIIIIll[2], llllllIIIIll[3]), worldPointArray);
        WorldPoint[] worldPointArray2 = new WorldPoint[llllllIIIIll[8]];
        worldPointArray2[e.llllllIIIIll[0]] = new WorldPoint(llllllIIIIll[9], llllllIIIIll[3], llllllIIIIll[0]);
        worldPointArray2[e.llllllIIIIll[1]] = new WorldPoint(llllllIIIIll[2], llllllIIIIll[11], llllllIIIIll[0]);
        WEST_TWO = new GameEnum30(new Point(llllllIIIIll[12], llllllIIIIll[3]), worldPointArray2);
        e[] eArray = new e[llllllIIIIll[8]];
        eArray[e.llllllIIIIll[0]] = WEST_FOUR;
        eArray[e.llllllIIIIll[1]] = WEST_TWO;
        $VALUES = eArray;
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(WorldPoint worldPoint) {
        void var1;
        WorldPoint[] worldPointArray = this.rocks;
        int n2 = worldPointArray.length;
        int var2 = llllllIIIIll[0];
        while (e.lIIlIlIIIIllIll(var2, (int)var1)) {
            void var3;
            void var4;
            void var5 = var4[var2];
            if (e.lIIlIlIIIIlllII(var5.equals((Object)var3) ? 1 : 0)) {
                return llllllIIIIll[1];
            }
            ++var2;

            return false;
        }
        return llllllIIIIll[0];
    }

    public WorldPoint d() {
        return new WorldPoint(this.standing.getX(), this.standing.getY(), llllllIIIIll[0]);
    }

    private static void lIIlIlIIIIllIIl() {
        llllllIIIIlI = new String[llllllIIIIll[8]];
        e.llllllIIIIlI[e.llllllIIIIll[0]] = "WEST_FOUR";
        e.llllllIIIIlI[e.llllllIIIIll[1]] = "WEST_TWO";
    }

    private static boolean lIIlIlIIIIlllII(int n2) {
        return n2 != 0;
    }

    public WorldPoint[] GameEnum30() {
        return this.rocks;
    }

    private GameEnum30(Point point, WorldPoint ... worldPointArray) {
        this.standing = point;
        this.rocks = worldPointArray;
    }

    public static e valueOf(String string) {
        return Enum.valueOf(GameEnum30.class, string);
    }

    public static e[] values() {
        return (e[])$VALUES.clone();
    }

}

