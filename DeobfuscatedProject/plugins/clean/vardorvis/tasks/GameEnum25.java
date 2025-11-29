/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.vardorvis.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;

public final class GameEnum25
extends Enum<f> {
    public static final  /* enum */ f VARROCK_WEST;
    private static final  f[] $VALUES;
    
    public static final  /* enum */ f GRAND_EXCHANGE;
    private final  int regionId;
    public static final  /* enum */ f CASTLE_WARS;
    private final  WorldPoint location;
    
    public static final  /* enum */ f FALADOR_WEST;

    private static boolean lIllllIllllIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIllllIllllIIII() {
        lIlIlIIlIIllI = new String[lIlIlIIlIIlll[16]];
        f.lIlIlIIlIIllI[f.lIlIlIIlIIlll[0]] = "GRAND_EXCHANGE";
        f.lIlIlIIlIIllI[f.lIlIlIIlIIlll[4]] = "VARROCK_WEST";
        f.lIlIlIIlIIllI[f.lIlIlIIlIIlll[8]] = "FALADOR_WEST";
        f.lIlIlIIlIIllI[f.lIlIlIIlIIlll[12]] = "CASTLE_WARS";
    }

        return String.valueOf(var1);
    }

    static {
        f.lIllllIllllIIIl();
        f.lIllllIllllIIII();
        GRAND_EXCHANGE = new GameEnum25(lIlIlIIlIIlll[1], new WorldPoint(lIlIlIIlIIlll[2], lIlIlIIlIIlll[3], lIlIlIIlIIlll[0]));
        VARROCK_WEST = new GameEnum25(lIlIlIIlIIlll[5], new WorldPoint(lIlIlIIlIIlll[6], lIlIlIIlIIlll[7], lIlIlIIlIIlll[0]));
        FALADOR_WEST = new GameEnum25(lIlIlIIlIIlll[9], new WorldPoint(lIlIlIIlIIlll[10], lIlIlIIlIIlll[11], lIlIlIIlIIlll[0]));
        CASTLE_WARS = new GameEnum25(lIlIlIIlIIlll[13], new WorldPoint(lIlIlIIlIIlll[14], lIlIlIIlIIlll[15], lIlIlIIlIIlll[0]));
        f[] fArray = new f[lIlIlIIlIIlll[16]];
        fArray[f.lIlIlIIlIIlll[0]] = GRAND_EXCHANGE;
        fArray[f.lIlIlIIlIIlll[4]] = VARROCK_WEST;
        fArray[f.lIlIlIIlIIlll[8]] = FALADOR_WEST;
        fArray[f.lIlIlIIlIIlll[12]] = CASTLE_WARS;
        $VALUES = fArray;
    }

    public static f[] values() {
        return (f[])$VALUES.clone();
    }

    public static f valueOf(String string) {
        return Enum.valueOf(GameEnum25.class, string);
    }

    public WorldPoint F() {
        return this.location;
    }

    private GameEnum25(int n3, WorldPoint worldPoint) {
        this.regionId = n3;
        this.location = worldPoint;
    }

    public int E() {
        return this.regionId;
    }
}

