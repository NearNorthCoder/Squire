/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.skilling.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum38
extends Enum<f> {
    
    public static final  /* enum */ f FIRE;
    public static final  /* enum */ f AIR;
    
    private final  int orbId;
    private static final  f[] $VALUES;
    public static final  /* enum */ f WATER;
    public static final  /* enum */ f EARTH;

    public int x() {
        return this.orbId;
    }

    private static boolean lIlIllIllllllI(int n2, int n3) {
        return n2 < n3;
    }

    static {
        f.lIlIllIlllllIl();
        f.lIlIllIlllllII();
        AIR = new GameEnum38(lllIIlIlIIl[1]);
        EARTH = new GameEnum38(lllIIlIlIIl[3]);
        WATER = new GameEnum38(lllIIlIlIIl[5]);
        FIRE = new GameEnum38(lllIIlIlIIl[7]);
        f[] fArray = new f[lllIIlIlIIl[8]];
        fArray[f.lllIIlIlIIl[0]] = AIR;
        fArray[f.lllIIlIlIIl[2]] = EARTH;
        fArray[f.lllIIlIlIIl[4]] = WATER;
        fArray[f.lllIIlIlIIl[6]] = FIRE;
        $VALUES = fArray;
    }

    public static f valueOf(String string) {
        return Enum.valueOf(GameEnum38.class, string);
    }

    public static f[] values() {
        return (f[])$VALUES.clone();
    }

        return String.valueOf(var1);
    }

    private GameEnum38(int n3) {
        this.orbId = n3;
    }

    private static void lIlIllIlllllII() {
        lllIIlIlIII = new String[lllIIlIlIIl[8]];
        f.lllIIlIlIII[f.lllIIlIlIIl[0]] = "AIR";
        f.lllIIlIlIII[f.lllIIlIlIIl[2]] = "EARTH";
        f.lllIIlIlIII[f.lllIIlIlIIl[4]] = "WATER";
        f.lllIIlIlIII[f.lllIIlIlIIl[6]] = "FIRE";
    }

}

