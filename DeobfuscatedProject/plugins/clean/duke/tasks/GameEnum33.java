/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.duke.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;

public final class GameEnum33
extends Enum<d> {
    private static final  d[] $VALUES;
    public static final  /* enum */ d FALADOR_WEST;
    private final  WorldPoint location;
    
    public static final  /* enum */ d CASTLE_WARS;
    
    public static final  /* enum */ d GRAND_EXCHANGE;
    private final  int regionId;
    public static final  /* enum */ d VARROCK_WEST;

    private static void lllIIlIlIllIlI() {
        lIllIIlIlIIl = new String[lIllIIlIlIlI[16]];
        d.lIllIIlIlIIl[d.lIllIIlIlIlI[0]] = "GRAND_EXCHANGE";
        d.lIllIIlIlIIl[d.lIllIIlIlIlI[4]] = "VARROCK_WEST";
        d.lIllIIlIlIIl[d.lIllIIlIlIlI[8]] = "FALADOR_WEST";
        d.lIllIIlIlIIl[d.lIllIIlIlIlI[12]] = "CASTLE_WARS";
    }

    private GameEnum33(int n3, WorldPoint worldPoint) {
        this.regionId = n3;
        this.location = worldPoint;
    }

    public int G() {
        return this.regionId;
    }

    public WorldPoint H() {
        return this.location;
    }

    public static d[] values() {
        return (d[])$VALUES.clone();
    }

    static {
        d.lllIIlIlIllIll();
        d.lllIIlIlIllIlI();
        GRAND_EXCHANGE = new GameEnum33(lIllIIlIlIlI[1], new WorldPoint(lIllIIlIlIlI[2], lIllIIlIlIlI[3], lIllIIlIlIlI[0]));
        VARROCK_WEST = new GameEnum33(lIllIIlIlIlI[5], new WorldPoint(lIllIIlIlIlI[6], lIllIIlIlIlI[7], lIllIIlIlIlI[0]));
        FALADOR_WEST = new GameEnum33(lIllIIlIlIlI[9], new WorldPoint(lIllIIlIlIlI[10], lIllIIlIlIlI[11], lIllIIlIlIlI[0]));
        CASTLE_WARS = new GameEnum33(lIllIIlIlIlI[13], new WorldPoint(lIllIIlIlIlI[14], lIllIIlIlIlI[15], lIllIIlIlIlI[0]));
        d[] dArray = new d[lIllIIlIlIlI[16]];
        dArray[d.lIllIIlIlIlI[0]] = GRAND_EXCHANGE;
        dArray[d.lIllIIlIlIlI[4]] = VARROCK_WEST;
        dArray[d.lIllIIlIlIlI[8]] = FALADOR_WEST;
        dArray[d.lIllIIlIlIlI[12]] = CASTLE_WARS;
        $VALUES = dArray;
    }

    public static d valueOf(String string) {
        return Enum.valueOf(GameEnum33.class, string);
    }
}

