/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.mining.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;

public final class GameEnum14
extends Enum<i> {
    private final  WorldPoint location;
    public static final  /* enum */ i LUMBRIDGE;
    private static final  i[] $VALUES;

    private static void lIIlIlIIIIIllIl() {
        lllllIlllllI = new String[lllllIllllll[3]];
        i.lllllIlllllI[i.lllllIllllll[0]] = "LUMBRIDGE";
    }

    public static i valueOf(String string) {
        return Enum.valueOf(GameEnum14.class, string);
    }

    private GameEnum14(WorldPoint worldPoint) {
        this.location = worldPoint;
    }

    public WorldPoint GameEnum14() {
        return this.location;
    }

    public static i[] values() {
        return (i[])$VALUES.clone();
    }

    static {
        i.lIIlIlIIIIIlllI();
        i.lIIlIlIIIIIllIl();
        LUMBRIDGE = new GameEnum14(new WorldPoint(lllllIllllll[1], lllllIllllll[2], lllllIllllll[0]));
        i[] iArray = new i[lllllIllllll[3]];
        iArray[i.lllllIllllll[0]] = LUMBRIDGE;
        $VALUES = iArray;
    }
}

