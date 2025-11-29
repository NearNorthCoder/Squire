/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.TileObjects
 */
package gg.squire.mining.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.TileObjects;

public final class GameEnum16
extends Enum<g> {
    private final  WorldPoint location;
    public static final  /* enum */ g EAST;
    
    public static final  /* enum */ g NORTH;
    private final  WorldPoint m2;
    
    private final  WorldPoint m1;
    private static final  g[] $VALUES;
    public static final  /* enum */ g SOUTH_2;
    public static final  /* enum */ g SOUTH_1;

    static {
        g.lIIlIIlIIlIlIlI();
        g.lIIlIIlIIlIlIIl();
        NORTH = new GameEnum16(new WorldPoint(lllllIIIIlll[3], lllllIIIIlll[4], lllllIIIIlll[5]), new WorldPoint(lllllIIIIlll[3], lllllIIIIlll[6], lllllIIIIlll[5]), new WorldPoint(lllllIIIIlll[7], lllllIIIIlll[6], lllllIIIIlll[5]));
        EAST = new GameEnum16(new WorldPoint(lllllIIIIlll[8], lllllIIIIlll[9], lllllIIIIlll[5]), new WorldPoint(lllllIIIIlll[10], lllllIIIIlll[11], lllllIIIIlll[5]), new WorldPoint(lllllIIIIlll[10], lllllIIIIlll[12], lllllIIIIlll[5]));
        SOUTH_1 = new GameEnum16(new WorldPoint(lllllIIIIlll[13], lllllIIIIlll[14], lllllIIIIlll[5]), new WorldPoint(lllllIIIIlll[13], lllllIIIIlll[15], lllllIIIIlll[5]), new WorldPoint(lllllIIIIlll[16], lllllIIIIlll[15], lllllIIIIlll[5]));
        SOUTH_2 = new GameEnum16(new WorldPoint(lllllIIIIlll[13], lllllIIIIlll[14], lllllIIIIlll[5]), new WorldPoint(lllllIIIIlll[3], lllllIIIIlll[14], lllllIIIIlll[5]), new WorldPoint(lllllIIIIlll[3], lllllIIIIlll[18], lllllIIIIlll[5]));
        g[] gArray = new g[lllllIIIIlll[19]];
        gArray[g.lllllIIIIlll[2]] = NORTH;
        gArray[g.lllllIIIIlll[1]] = EAST;
        gArray[g.lllllIIIIlll[5]] = SOUTH_1;
        gArray[g.lllllIIIIlll[17]] = SOUTH_2;
        $VALUES = gArray;
    }

    public static g valueOf(String string) {
        return Enum.valueOf(GameEnum16.class, string);
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

    private GameEnum16(WorldPoint worldPoint, WorldPoint worldPoint2, WorldPoint worldPoint3) {
        this.location = worldPoint;
        this.m1 = worldPoint2;
        this.m2 = worldPoint3;
    }

    public WorldPoint i() {
        return this.location;
    }

    private static void lIIlIIlIIlIlIIl() {
        lllllIIIIllI = new String[lllllIIIIlll[19]];
        g.lllllIIIIllI[g.lllllIIIIlll[2]] = "NORTH";
        g.lllllIIIIllI[g.lllllIIIIlll[1]] = "EAST";
        g.lllllIIIIllI[g.lllllIIIIlll[5]] = "SOUTH_1";
        g.lllllIIIIllI[g.lllllIIIIlll[17]] = "SOUTH_2";
    }

    public static g[] values() {
        return (g[])$VALUES.clone();
    }
}

