/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.scurrius.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;

public final class GameEnum
extends Enum<c> {
    private final  int regionId;
    private final  WorldPoint location;
    
    private static final  c[] $VALUES;
    
    public static final  /* enum */ c VARROCK_EAST;

    private static void lIlIllIIllIIIII() {
        lIIlIllIIIlII = new String[lIIlIllIIIlIl[4]];
        c.lIIlIllIIIlII[c.lIIlIllIIIlIl[0]] = "VARROCK_EAST";
    }

    public WorldPoint r() {
        return this.location;
    }

    public static c[] values() {
        return (c[])$VALUES.clone();
    }

    public static c valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

    private GameEnum(int n3, WorldPoint worldPoint) {
        this.regionId = n3;
        this.location = worldPoint;
    }

    public int q() {
        return this.regionId;
    }

    static {
        c.lIlIllIIllIIIIl();
        c.lIlIllIIllIIIII();
        VARROCK_EAST = new GameEnum(lIIlIllIIIlIl[1], new WorldPoint(lIIlIllIIIlIl[2], lIIlIllIIIlIl[3], lIIlIllIIIlIl[0]));
        c[] cArray = new c[lIIlIllIIIlIl[4]];
        cArray[c.lIIlIllIIIlIl[0]] = VARROCK_EAST;
        $VALUES = cArray;
    }
}

