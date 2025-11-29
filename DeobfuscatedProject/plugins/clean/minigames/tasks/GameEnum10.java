/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.minigames.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum10
extends Enum<a> {
    public static final  /* enum */ a MELEE;
    public static final  /* enum */ a RANGED;
    public static final  /* enum */ a MAGIC;
    
    private static final  a[] $VALUES;
    
    public static final  /* enum */ a MIXED;

    static {
        a.lllllIIIIlIIIl();
        a.lllllIIIIlIIII();
        MELEE = new GameEnum10();
        RANGED = new GameEnum10();
        MAGIC = new GameEnum10();
        MIXED = new GameEnum10();
        a[] aArray = new a[llIIlIIIlIII[4]];
        aArray[a.llIIlIIIlIII[0]] = MELEE;
        aArray[a.llIIlIIIlIII[1]] = RANGED;
        aArray[a.llIIlIIIlIII[2]] = MAGIC;
        aArray[a.llIIlIIIlIII[3]] = MIXED;
        $VALUES = aArray;
    }

    public static a valueOf(String string) {
        return Enum.valueOf(GameEnum10.class, string);
    }

    private static void lllllIIIIlIIII() {
        llIIlIIIIlll = new String[llIIlIIIlIII[4]];
        a.llIIlIIIIlll[a.llIIlIIIlIII[0]] = "MELEE";
        a.llIIlIIIIlll[a.llIIlIIIlIII[1]] = "RANGED";
        a.llIIlIIIIlll[a.llIIlIIIlIII[2]] = "MAGIC";
        a.llIIlIIIIlll[a.llIIlIIIlIII[3]] = "MIXED";
    }

    public static a[] values() {
        return (a[])$VALUES.clone();
    }

        return String.valueOf(var1);
    }

    private static boolean lllllIIIIlIIlI(int n2, int n3) {
        return n2 < n3;
    }
}

