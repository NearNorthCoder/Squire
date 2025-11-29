/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.whisperer.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;

public final class GameEnum15
extends Enum<e> {
    public static final  /* enum */ e FEROX_ENCLAVE;
    private final  int regionId;
    public static final  /* enum */ e VARROCK_WEST;
    
    private final  WorldPoint location;
    public static final  /* enum */ e CASTLE_WARS;
    public static final  /* enum */ e FALADOR_WEST;
    
    public static final  /* enum */ e EDGEVILLE;
    public static final  /* enum */ e GRAND_EXCHANGE;
    private static final  e[] $VALUES;

    private static boolean llIIIIlIlIlIlII(int n2, int n3) {
        return n2 < n3;
    }

    private GameEnum15(int n3, WorldPoint worldPoint) {
        this.regionId = n3;
        this.location = worldPoint;
    }

    static {
        e.llIIIIlIlIlIIll();
        e.llIIIIlIlIIllII();
        GRAND_EXCHANGE = new GameEnum15(lIlIlllIlllIl[1], new WorldPoint(lIlIlllIlllIl[2], lIlIlllIlllIl[3], lIlIlllIlllIl[0]));
        FEROX_ENCLAVE = new GameEnum15(lIlIlllIlllIl[5], new WorldPoint(lIlIlllIlllIl[6], lIlIlllIlllIl[7], lIlIlllIlllIl[0]));
        EDGEVILLE = new GameEnum15(lIlIlllIlllIl[9], new WorldPoint(lIlIlllIlllIl[10], lIlIlllIlllIl[11], lIlIlllIlllIl[0]));
        VARROCK_WEST = new GameEnum15(lIlIlllIlllIl[13], new WorldPoint(lIlIlllIlllIl[14], lIlIlllIlllIl[15], lIlIlllIlllIl[0]));
        FALADOR_WEST = new GameEnum15(lIlIlllIlllIl[17], new WorldPoint(lIlIlllIlllIl[18], lIlIlllIlllIl[19], lIlIlllIlllIl[0]));
        CASTLE_WARS = new GameEnum15(lIlIlllIlllIl[21], new WorldPoint(lIlIlllIlllIl[22], lIlIlllIlllIl[23], lIlIlllIlllIl[0]));
        e[] eArray = new e[lIlIlllIlllIl[24]];
        eArray[e.lIlIlllIlllIl[0]] = GRAND_EXCHANGE;
        eArray[e.lIlIlllIlllIl[4]] = FEROX_ENCLAVE;
        eArray[e.lIlIlllIlllIl[8]] = EDGEVILLE;
        eArray[e.lIlIlllIlllIl[12]] = VARROCK_WEST;
        eArray[e.lIlIlllIlllIl[16]] = FALADOR_WEST;
        eArray[e.lIlIlllIlllIl[20]] = CASTLE_WARS;
        $VALUES = eArray;
    }

    public WorldPoint m() {
        return this.location;
    }

        return String.valueOf(var1);
    }

    public static e[] values() {
        return (e[])$VALUES.clone();
    }

    public int d() {
        return this.regionId;
    }

    private static void llIIIIlIlIIllII() {
        lIlIlllIllIlI = new String[lIlIlllIlllIl[24]];
        e.lIlIlllIllIlI[e.lIlIlllIlllIl[0]] = "GRAND_EXCHANGE";
        e.lIlIlllIllIlI[e.lIlIlllIlllIl[4]] = "FEROX_ENCLAVE";
        e.lIlIlllIllIlI[e.lIlIlllIlllIl[8]] = "EDGEVILLE";
        e.lIlIlllIllIlI[e.lIlIlllIlllIl[12]] = "VARROCK_WEST";
        e.lIlIlllIllIlI[e.lIlIlllIlllIl[16]] = "FALADOR_WEST";
        e.lIlIlllIllIlI[e.lIlIlllIlllIl[20]] = "CASTLE_WARS";
    }

    public static e valueOf(String string) {
        return Enum.valueOf(GameEnum15.class, string);
    }
}

