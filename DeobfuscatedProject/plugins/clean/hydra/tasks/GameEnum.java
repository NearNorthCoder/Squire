/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Point
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.RegionPoint
 *  net.unethicalite.api.entities.Players
 */
package gg.squire.hydra.tasks;

import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Point;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.Players;

public final class GameEnum
extends Enum<k> {
    private final  int spriteId;
    private final  int specialProjectileId;
    private final  int hpThreshold;
    private final  WorldPoint fountainWorldPoint;
    public static final  /* enum */ k ENRAGED;
    public static final  /* enum */ k LIGHTNING;
    private final  Point fountainPlayerPoint;
    private final  int specialAnimationId;
    private final  int deathAnimation1;
    private final  int deathAnimation2;
    public static final  /* enum */ k FLAME;
    private final  Color phaseColor;
    private final  Color fountainColor;
    public static final  /* enum */ k POISON;
    private static final  k[] $VALUES;
    private final  int attacksPerSwitch;

    public int ab() {
        return this.deathAnimation1;
    }

    public int ae() {
        return this.specialAnimationId;
    }

    private GameEnum(int n3, int n4, int n5, int n6, int n7, int n8, int n9, WorldPoint worldPoint, Point point, Color color, Color color2) {
        this.attacksPerSwitch = n3;
        this.deathAnimation1 = n4;
        this.deathAnimation2 = n5;
        this.specialProjectileId = n6;
        this.specialAnimationId = n7;
        this.hpThreshold = n8;
        this.spriteId = n9;
        this.fountainWorldPoint = worldPoint;
        this.fountainPlayerPoint = point;
        this.phaseColor = color;
        this.fountainColor = color2;
    }

    static {
        k.lIIlIIIIIIIIllI();
        k.lIIlIIIIIIIIlIl();
        POISON = new GameEnum(llllIIllIIIl[3], llllIIllIIIl[4], llllIIllIIIl[5], llllIIllIIIl[6], llllIIllIIIl[0], llllIIllIIIl[7], llllIIllIIIl[8], new WorldPoint(llllIIllIIIl[9], llllIIllIIIl[10], llllIIllIIIl[0]), new Point(llllIIllIIIl[11], llllIIllIIIl[12]), Color.GREEN, Color.RED);
        LIGHTNING = new GameEnum(llllIIllIIIl[3], llllIIllIIIl[13], llllIIllIIIl[14], llllIIllIIIl[0], llllIIllIIIl[15], llllIIllIIIl[16], llllIIllIIIl[17], new WorldPoint(llllIIllIIIl[9], llllIIllIIIl[18], llllIIllIIIl[0]), new Point(llllIIllIIIl[19], llllIIllIIIl[20]), Color.CYAN, Color.GREEN);
        FLAME = new GameEnum(llllIIllIIIl[3], llllIIllIIIl[22], llllIIllIIIl[23], llllIIllIIIl[0], llllIIllIIIl[24], llllIIllIIIl[25], llllIIllIIIl[26], new WorldPoint(llllIIllIIIl[27], llllIIllIIIl[18], llllIIllIIIl[0]), new Point(llllIIllIIIl[28], llllIIllIIIl[29]), Color.RED, Color.CYAN);
        ENRAGED = new GameEnum(llllIIllIIIl[1], llllIIllIIIl[31], llllIIllIIIl[32], llllIIllIIIl[6], llllIIllIIIl[0], llllIIllIIIl[0], llllIIllIIIl[8], null, null, null, null);
        k[] kArray = new k[llllIIllIIIl[21]];
        kArray[k.llllIIllIIIl[0]] = POISON;
        kArray[k.llllIIllIIIl[1]] = LIGHTNING;
        kArray[k.llllIIllIIIl[2]] = FLAME;
        kArray[k.llllIIllIIIl[3]] = ENRAGED;
        $VALUES = kArray;
    }

        return String.valueOf(var1);
    }

    public Color ah() {
        return this.phaseColor;
    }

    public static k valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

    private static void lIIlIIIIIIIIlIl() {
        llllIIllIIII = new String[llllIIllIIIl[33]];
        k.llllIIllIIII[k.llllIIllIIIl[0]] = "_";
        k.llllIIllIIII[k.llllIIllIIIl[1]] = k.lIIlIIIIIIIIIll("4XpRIm9kSe0=", "mvDnc");
        k.llllIIllIIII[k.llllIIllIIIl[2]] = "POISON";
        k.llllIIllIIII[k.llllIIllIIIl[3]] = "LIGHTNING";
        k.llllIIllIIII[k.llllIIllIIIl[21]] = "FLAME";
        k.llllIIllIIII[k.llllIIllIIIl[30]] = "ENRAGED";
    }

    public RegionPoint Z() {
        WorldPoint worldPoint = Players.getLocal().getWorldLocation();
        if (k.lIIlIIIIIIIIlll((Object)this, (Object)ENRAGED)) {
            return new RegionPoint(this.fountainPlayerPoint.getX(), this.fountainPlayerPoint.getY(), worldPoint.getPlane(), worldPoint.getRegionID());
        }
        return null;
    }

    public static k[] values() {
        return (k[])$VALUES.clone();
    }

    public Color ai() {
        return this.fountainColor;
    }

    private static boolean lIIlIIIIIIIlIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlIIIIIIIIlll(Object object, Object object2) {
        return object != object2;
    }

    public int aa() {
        return this.attacksPerSwitch;
    }

    public int ad() {
        return this.specialProjectileId;
    }

    public int af() {
        return this.hpThreshold;
    }

    public int ac() {
        return this.deathAnimation2;
    }

    public String toString() {
        String string = super.toString();
        return string.charAt(llllIIllIIIl[0]) + string.substring(llllIIllIIIl[1]).replaceAll(llllIIllIIII[llllIIllIIIl[0]], llllIIllIIII[llllIIllIIIl[1]]).toLowerCase();
    }

    public WorldPoint ag() {
        return this.fountainWorldPoint;
    }
}

