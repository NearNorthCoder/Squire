/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.hunter.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;

public final class GameEnum25
extends Enum<d> {
    public static final  /* enum */ d FELDIP_HILLS_NORTH;
    public static final  /* enum */ d WILDERNESS_NORTH;
    
    public static final  /* enum */ d PISCATORIS_HUNTER_AREA;
    private static final  d[] $VALUES;
    private final  WorldPoint center;
    public static final  /* enum */ d FELDIP_HILLS_SOUTH;
    public static final  /* enum */ d RED_CHIN_HUNTING_GROUND;
    public static final  /* enum */ d GWENITH_HUNTER_AREA;
    public static final  /* enum */ d WILDERNESS_SOUTH;
    public static final  /* enum */ d ISLE_OF_SOULS;

    private static void lIIIlllIIIlIIll() {
        lllIllllIlIl = new String[lllIllllIlll[25]];
        d.lllIllllIlIl[d.lllIllllIlll[0]] = "WILDERNESS_NORTH";
        d.lllIllllIlIl[d.lllIllllIlll[1]] = "WILDERNESS_SOUTH";
        d.lllIllllIlIl[d.lllIllllIlll[7]] = "PISCATORIS_HUNTER_AREA";
        d.lllIllllIlIl[d.lllIllllIlll[10]] = "ISLE_OF_SOULS";
        d.lllIllllIlIl[d.lllIllllIlll[13]] = "FELDIP_HILLS_NORTH";
        d.lllIllllIlIl[d.lllIllllIlll[16]] = "FELDIP_HILLS_SOUTH";
        d.lllIllllIlIl[d.lllIllllIlll[19]] = "GWENITH_HUNTER_AREA";
        d.lllIllllIlIl[d.lllIllllIlll[22]] = "RED_CHIN_HUNTING_GROUND";
    }

    private static boolean lIIIlllIIIlIlIl(int n2, int n3) {
        return n2 < n3;
    }

    public static d valueOf(String string) {
        return Enum.valueOf(GameEnum25.class, string);
    }

    static {
        d.lIIIlllIIIlIlII();
        d.lIIIlllIIIlIIll();
        WILDERNESS_NORTH = new GameEnum25(new WorldPoint(lllIllllIlll[3], lllIllllIlll[4], lllIllllIlll[0]));
        WILDERNESS_SOUTH = new GameEnum25(new WorldPoint(lllIllllIlll[5], lllIllllIlll[6], lllIllllIlll[0]));
        PISCATORIS_HUNTER_AREA = new GameEnum25(new WorldPoint(lllIllllIlll[8], lllIllllIlll[9], lllIllllIlll[0]));
        ISLE_OF_SOULS = new GameEnum25(new WorldPoint(lllIllllIlll[11], lllIllllIlll[12], lllIllllIlll[0]));
        FELDIP_HILLS_NORTH = new GameEnum25(new WorldPoint(lllIllllIlll[14], lllIllllIlll[15], lllIllllIlll[0]));
        FELDIP_HILLS_SOUTH = new GameEnum25(new WorldPoint(lllIllllIlll[17], lllIllllIlll[18], lllIllllIlll[0]));
        GWENITH_HUNTER_AREA = new GameEnum25(new WorldPoint(lllIllllIlll[20], lllIllllIlll[21], lllIllllIlll[0]));
        RED_CHIN_HUNTING_GROUND = new GameEnum25(new WorldPoint(lllIllllIlll[23], lllIllllIlll[24], lllIllllIlll[0]));
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

    private GameEnum25(WorldPoint worldPoint) {
        this.center = worldPoint;
    }

    public static d[] values() {
        return (d[])$VALUES.clone();
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

        return String.valueOf(var1);
    }
}

