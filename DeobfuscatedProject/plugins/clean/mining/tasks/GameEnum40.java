/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.mining.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;

public final class GameEnum40
extends Enum<d> {
    private final  WorldPoint[] points;
    
    private static final  d[] $VALUES;
    public static final  /* enum */ d UPPER_FLOOR;
    
    public static final  /* enum */ d SOUTH_WEST;

    private GameEnum40(WorldPoint ... worldPointArray) {
        this.points = worldPointArray;
    }

    public WorldPoint[] g() {
        return this.points;
    }

    public List<WorldPoint> f() {
        return Arrays.asList(this.g());
    }

    public static d valueOf(String string) {
        return Enum.valueOf(GameEnum40.class, string);
    }

    private static void lIIlIIllIlIIllI() {
        lllllIlIIlll = new String[lllllIlIlIlI[7]];
        d.lllllIlIIlll[d.lllllIlIlIlI[0]] = "UPPER_FLOOR";
        d.lllllIlIIlll[d.lllllIlIlIlI[4]] = "SOUTH_WEST";
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
        UPPER_FLOOR = new GameEnum40(worldPointArray);
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
        SOUTH_WEST = new GameEnum40(worldPointArray2);
        d[] dArray = new d[lllllIlIlIlI[7]];
        dArray[d.lllllIlIlIlI[0]] = UPPER_FLOOR;
        dArray[d.lllllIlIlIlI[4]] = SOUTH_WEST;
        $VALUES = dArray;
    }

    public static d[] values() {
        return (d[])$VALUES.clone();
    }
}

