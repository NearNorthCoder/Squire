/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.wintertodt.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;

public final class GameEnum8
extends Enum<a> {
    public static final  /* enum */ a WEST;
    private final  WorldPoint brazierStand;
    private static final  a[] $VALUES;
    
    public static final  /* enum */ a EAST;
    
    private final  WorldPoint treeStand;

    private static void llIIIIlIlIlllII() {
        lIlIllllIIIlI = new String[lIlIllllIIIll[6]];
        a.lIlIllllIIIlI[a.lIlIllllIIIll[0]] = "WEST";
        a.lIlIllllIIIlI[a.lIlIllllIIIll[4]] = "EAST";
    }

    private GameEnum8(WorldPoint worldPoint, WorldPoint worldPoint2) {
        this.brazierStand = worldPoint2;
        this.treeStand = worldPoint;
    }

    public static a valueOf(String string) {
        return Enum.valueOf(GameEnum8.class, string);
    }

    static {
        a.llIIIIlIlIlllIl();
        a.llIIIIlIlIlllII();
        WEST = new GameEnum8(new WorldPoint(lIlIllllIIIll[1], lIlIllllIIIll[2], lIlIllllIIIll[0]), new WorldPoint(lIlIllllIIIll[1], lIlIllllIIIll[3], lIlIllllIIIll[0]));
        EAST = new GameEnum8(new WorldPoint(lIlIllllIIIll[5], lIlIllllIIIll[2], lIlIllllIIIll[0]), new WorldPoint(lIlIllllIIIll[5], lIlIllllIIIll[3], lIlIllllIIIll[0]));
        a[] aArray = new a[lIlIllllIIIll[6]];
        aArray[a.lIlIllllIIIll[0]] = WEST;
        aArray[a.lIlIllllIIIll[4]] = EAST;
        $VALUES = aArray;
    }

    public WorldPoint b() {
        return this.brazierStand;
    }

    public static a[] values() {
        return (a[])$VALUES.clone();
    }

    public WorldPoint c() {
        return this.treeStand;
    }
}

