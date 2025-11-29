/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.minigame.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum5
extends Enum<d> {
    
    private static final  d[] $VALUES;
    
    public static final  /* enum */ d WEST;
    public static final  /* enum */ d SOUTH;
    public static final  /* enum */ d EAST;
     String direction;

        return String.valueOf(var1);
    }

    private GameEnum5(String string2) {
        this.direction = string2;
    }

    public static d valueOf(String string) {
        return Enum.valueOf(GameEnum5.class, string);
    }

    static {
        d.lIIlllllllIIlII();
        d.lIIlllllllIIIll();
        EAST = new GameEnum5(lIIIlIlIIIlll[lIIIlIlIIlIII[1]]);
        WEST = new GameEnum5(lIIIlIlIIIlll[lIIIlIlIIlIII[3]]);
        SOUTH = new GameEnum5(lIIIlIlIIIlll[lIIIlIlIIlIII[5]]);
        d[] dArray = new d[lIIIlIlIIlIII[3]];
        dArray[d.lIIIlIlIIlIII[0]] = EAST;
        dArray[d.lIIIlIlIIlIII[1]] = WEST;
        dArray[d.lIIIlIlIIlIII[2]] = SOUTH;
        $VALUES = dArray;
    }

    public static d[] values() {
        return (d[])$VALUES.clone();
    }

    private static void lIIlllllllIIIll() {
        lIIIlIlIIIlll = new String[lIIIlIlIIlIII[6]];
        d.lIIIlIlIIIlll[d.lIIIlIlIIlIII[0]] = "EAST";
        d.lIIIlIlIIIlll[d.lIIIlIlIIlIII[1]] = "East";
        d.lIIIlIlIIIlll[d.lIIIlIlIIlIII[2]] = "WEST";
        d.lIIIlIlIIIlll[d.lIIIlIlIIlIII[3]] = "West";
        d.lIIIlIlIIIlll[d.lIIIlIlIIlIII[4]] = "SOUTH";
        d.lIIIlIlIIIlll[d.lIIIlIlIIlIII[5]] = "South";
    }

    private static boolean lIIlllllllIIlIl(int n, int n2) {
        return n < n2;
    }

    public String n() {
        return this.direction;
    }

}

