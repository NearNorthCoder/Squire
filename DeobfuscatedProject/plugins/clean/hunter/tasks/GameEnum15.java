/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.hunter.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;

public final class GameEnum15
extends Enum<c> {
    public static final  /* enum */ c FELDIP_HILLS_SOUTH;

    public static final  /* enum */ c FELDIP_HILLS_NORTHWEST;
    private static final  c[] $VALUES;
    public static final  /* enum */ c ISLE_OF_SOULS;
    private final  WorldPoint center;

        return String.valueOf(var1);
    }

    static {
        c.lIIIllIlIlllIll();
        c.lIIIllIlIlllIlI();
        FELDIP_HILLS_SOUTH = new GameEnum15(new WorldPoint(lllIllIllIIl[3], lllIllIllIIl[4], lllIllIllIIl[0]));
        ISLE_OF_SOULS = new GameEnum15(new WorldPoint(lllIllIllIIl[5], lllIllIllIIl[6], lllIllIllIIl[0]));
        FELDIP_HILLS_NORTHWEST = new GameEnum15(new WorldPoint(lllIllIllIIl[8], lllIllIllIIl[9], lllIllIllIIl[0]));
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
        c.lllIllIllIII[c.lllIllIllIIl[0]] = "FELDIP_HILLS_SOUTH";
        c.lllIllIllIII[c.lllIllIllIIl[1]] = "ISLE_OF_SOULS";
        c.lllIllIllIII[c.lllIllIllIIl[7]] = "FELDIP_HILLS_NORTHWEST";
    }

    private static boolean lIIIllIlIllllII(int n2, int n3) {
        return n2 < n3;
    }

    private GameEnum15(WorldPoint worldPoint) {
        this.center = worldPoint;
    }

    public static c valueOf(String string) {
        return Enum.valueOf(GameEnum15.class, string);
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

